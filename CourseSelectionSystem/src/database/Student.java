package database;

import java.io.Serializable;

public class Student implements Serializable {
    //此类为单纯的学生信息类
    private String name;//姓名
    private String account;//学号
    private String sex;//性别
    private String password;//密码
    private String department;//学院
    public String getAccount(){
        return this.account;
    }
    public String getPassword(){
        return this.password;
    }
    public void setAccount(String account){
        this.account = account;
    }
    public void setPassword(String password){
        this.password = password;
    }

}
