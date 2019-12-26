package userShow;

public class CreatUserGUI {
    public CreatUserGUI(){
        UserGUI userGUI = new UserGUI();
        userGUI.creatWindow(500,100,1060,840);
        userGUI.addLabel("选 课 系 统",390,40,340,55,54);
        userGUI.addLabel("账户:",380,224,90,30,18);
        userGUI.addTextField(445,224,260,30,16);
        userGUI.addLabel("密码:",380,284,90,30,18);
        userGUI.addPasswordField(445,284,260,30,16);
        userGUI.addButton("登录",380,350,90,30);
        userGUI.addButton("注册",550,350,90,30);
    }
}
