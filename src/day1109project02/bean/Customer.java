package day1109project02.bean;

import java.util.Objects;

/**
 * @author: chenwei
 * @date: 2021/7/8 21:46
 * @description Customer为实体对象，用来封装客户信息
 */
public class Customer {
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return gender == customer.gender && age == customer.age && Objects.equals(name, customer.name) && Objects.equals(phone, customer.phone) && Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age, phone, email);
    }

    public Customer() {
    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //重写规则：比较两个对象的实体内容（即：name和age）是否相同
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof Customer) {
//            Customer anotherObj = (Customer) obj;
//            //比较两个对象的每个属性是否相同
//            if (this.age == anotherObj.age &&
//                    this.name.equals(anotherObj.name) &&
//                    this.email.equals(anotherObj.email) &&
//                    this.phone.equals(anotherObj.phone) &&
//                    this.gender == anotherObj.gender){
//                return true;
//            }
//            return false;
//        }
//        return false;
//    }

}
