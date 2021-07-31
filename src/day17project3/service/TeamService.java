package day17project3.service;

import day17project3.domain.*;

/**
 * @author: chenwei
 * @date: 2021/7/27 17:00
 */
public class TeamService {
    /**
     * @counter:给menberId赋值使用
     * @MAX_MEMBER:限制团队人数
     *
     * */
    private static int counter = 1;
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total=0;
    public Programmer[] getTeam(){
        Programmer[] programmers = new Programmer[total];
        for (int i=0;i<total;i++){
                programmers[i] = this.team[i];
        }
        return programmers;
    }
    /**
     * 成员已满，无法添加
     * 该成员不是开发人员，无法添加
     * 该成员已在本开发团队中
     * 该成员已是某团队成员
     * 该成员正在休假，无法添加
     * 团队中至多只能有一名架构师
     * 团队中至多只能有两名设计师
     * 团队中至多只能有三名程序员
     *
     * */
    public void addMember(Employee employee) throws TeamException {
        if(total>=MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
        if (!(employee instanceof Employee)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        if(isExist(employee)){
            throw new TeamException("该成员已在本开发团队中");
        }
        System.out.println(total);
        Programmer programmer = (Programmer) employee;
        if ("BUSY".equals(programmer.getStatus().getNAME())){
            throw new TeamException("该成员已是某团队成员");
        }else if ("VOCATION".equals(programmer.getStatus().getNAME())){
            throw new TeamException("该成员正在休假，无法添加");
        }
        //获取team已有成员中架构师，设计师，程序员的人数
        int numberOfArchitect=0,numberOfDesigner=0,numberOfProgrammer=0;
        for (int i=0;i < total;i++){
            if (team[i] instanceof Architect){
                numberOfArchitect++;
            }else if (team[i] instanceof Designer){
                numberOfDesigner++;
            }else if (team[i] instanceof Programmer){
                numberOfProgrammer++;
            }
        }
        if (programmer instanceof Architect){
            if (numberOfArchitect>=1){
                throw new TeamException("团队中至多只能有一名架构师");
            }
        }else if(programmer instanceof Designer){
            if (numberOfDesigner>=2){
                throw new TeamException("团队中至多只能有两名设计师");
            }
        }else if (programmer instanceof Programmer){
            if (numberOfProgrammer>=3){
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }
        team[total++]=programmer;
        programmer.setStatus(Status.BUSY);
        programmer.setMemberId(counter++);
    }

    private boolean isExist(Employee employee) {
        for (int i=0;i<total;i++){
            return team[i].getId() == employee.getId();
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException {
        int i=0;
        for (;i<total;i++){
            if (team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        //未找到的情况
        if (i==total){
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }

        //后一个元素覆盖前一个元素，实现三处操作
        for (int j = i+1;j<total;j++){
            team[j-1] = team[j];
        }

        team[--total]=null;

    }
}
