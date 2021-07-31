package day17project3.view;

import day17project3.domain.Employee;
import day17project3.domain.Programmer;
import day17project3.service.NameListService;
import day17project3.service.TeamException;
import day17project3.service.TeamService;

/**
 * @author: chenwei
 * @date: 2021/7/28 16:47
 */
public class TeamView {
    private NameListService nameListService = new NameListService();
    private TeamService teamService = new TeamService();
    public void enterMenu(){
        boolean loopFlag = true;
        while (loopFlag){
            System.out.println("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择（1-4）");
            char menu = 0;
            if (menu != '1'){
                listAllEmployees();
            }
            menu = TsUtility.readMenuSelection();
            switch (menu){
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("是否确认退出");
                    char isExit = TsUtility.readConfirmSelection();
                    if (isExit == 'y'){
                        loopFlag = false;
                    }
                    break;
            }
        }
    }
    public void listAllEmployees(){
        System.out.println("*************************显示所哟员工信息*************************");
        Employee[] employees = nameListService.getAllEmployees();
        if (employees == null ||employees.length ==0){
            System.out.println("公司中没有任何员工信息");
        }else {
            System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
            for (int i=0;i<employees.length;i++){
                System.out.println(employees[i]);
            }
        }
        System.out.println("----------------------");
    }
    public void getTeam(){
        System.out.println("***************团队成员列表***************");
        Programmer[] teams = teamService.getTeam();
        if (teams == null || teams.length ==0){
            System.out.println("开发团队目前没有成员");
        }else {
            System.out.println("Tid/id\t姓名\t年龄\t工资\t职位\t奖金\t股票\n");
            for (int j=0;j<teams.length;j++){
                System.out.println(teams[j].toStringForTeamService());
            }
        }
        System.out.println("----------------------");
    }
    public void addMember(){
        System.out.println("***************添加团队成员***************");
        System.out.println("please input id");
        int id = TsUtility.readInt();
        try {
            Employee employee = nameListService.getEmployee(id);
            teamService.addMember(employee);
            System.out.println("add successful please enter EnterKey continue");
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
        TsUtility.readReturn();
    }
    public void deleteMember(){
        System.out.println("**********删除团队成员**********");
        System.out.println("please input delete id");
        int id = TsUtility.readInt();
        System.out.println("确定是否删除？");
        char confirm = TsUtility.readConfirmSelection();
        if (confirm == 'y'){
            try {
                teamService.removeMember(id);
                System.out.println("delete successful");
            } catch (TeamException e) {
                System.out.println(e.getMessage());
            }
        }

    }
    public static void main(String[] args){
        TeamView teamView = new TeamView();
        teamView.enterMenu();
    }
}
