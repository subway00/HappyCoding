package InputOuput;

import java.io.*;

public class DateStreamDemo {
    public static void main(String[] args) {
        Member [] members = {new Member("Justin", 90) , new Member("Momor", 85) ,
                            new Member("Bush", 70) };
        
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(args[0])); 
            
            for (Member member : members) {
                dataOutputStream.writeUTF(member.getName());
                dataOutputStream.writeInt(member.getAge());
            }
            dataOutputStream.flush();
            dataOutputStream.close();
            
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(args[0]));
            
            for (int i = 0 ; i < members.length ; i++) {
                String name = dataInputStream.readUTF();
                int score = dataInputStream.readInt();
                members[i] = new Member(name, score);
            }
            dataInputStream.close();
            
            for (Member member : members) {
                System.out.printf("%s\t%d%n", member.getName(), member.getAge());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
