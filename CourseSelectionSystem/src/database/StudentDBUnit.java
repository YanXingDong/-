package database;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class StudentDBUnit {
    private static StudentDBUnit instance=null;
    private HashMap<String ,Student> users= new HashMap<String,Student>();
    private StudentDBUnit()throws Exception{
        FileInputStream fis = new FileInputStream("StudentInformation.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        users = (HashMap<String ,Student>)ois.readObject();
        fis.close();
        ois.close();
    }
    public HashMap<String ,Student> getUsers(){
        return users;
    }
    public Student getUser(String account){
        return users.get(account);
    }
    public StudentDBUnit getInstance(){
        if(instance==null){
            synchronized (instance){
                if(instance==null){
                    try {
                        instance = new StudentDBUnit();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return instance;
    }
}
