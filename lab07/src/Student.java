import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> scores;
    private ArrayList<String> subjects;
    
    public final static String chinese = "國文" ;
    public final static String English = "英文" ;
    public final static String math = "數學" ;
   
    public Student() {
        name = "未設定" ;
        scores = new ArrayList() ;
        subjects = new ArrayList() ;
        /*scores.add(0);
        scores.add(0);
        scores.add(0);*/
        subjects.add(chinese);
        subjects.add(English);
        subjects.add(math);
        
        
    }
    public void setName(String name) {
        if (name == null || name.length()<2) {  //String.length()傳回字串的長度
            System.out.printf("name不能為null或少於2個字，name為%s%n", name);
        }
        this.name = name;
        }
    public void setScores(String subject, int score) {
        int index = subjects.indexOf(subject);//查詢subject在subjects陣列第幾項
//subjects & scores 為兩陣列。使scores存放的資料按subjects的索引位置存放。
//ex: subjects[0]為國文 ， 而 scores[0]則對應存放為國文成績。
        if (index<0) {
            System.out.printf("查無科目名稱: %s%n", subject);
        }
        scores.add(index, score);
    }
    public void displayInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" ");
        
        for (int i = 0 ; i < subjects.size() ; i++) {
            String subject = subjects.get(i);
            int score = scores.get(i);
            sb.append(subject).append("=").append(score).append("");
        }
        int total = getTotal();
        sb.append("total").append("=").append(total);
        System.out.println(sb.toString());
        
    }
    public int getTotal() {
        int total = 0 ;
        for (int score : scores) {
            total +=  score;
        }
        return total;
    }
}

