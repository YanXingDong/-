package userService;

public class StudentService {

    public String login(String account,String password){

        if(account.equals("闫兴东")&&password.equals("dong13782526217+")){
            return "登录成功";
        }
        return "登录失败";
    }
    public void register(String account,String password){
        System.out.println("注册成功！");
    }
}
