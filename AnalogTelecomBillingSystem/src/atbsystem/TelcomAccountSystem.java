package atbsystem;

public class TelcomAccountSystem {
    public static void main(String[] args) {
        // 实例化-个电信用户类TelcomUser
        TelcomUser telcomUser = new TelcomUser("13782526217");
        // 生成通话记录
        telcomUser.generateCommunicateRecord();
        // 打印通话详单
        telcomUser.printCallToDetails();
    }
}
