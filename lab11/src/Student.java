
import java.util.*;

public class Student {

    private int total = 0;
    private String name;
    private Map<String, Integer> scores;
    private ArrayList arr1, arr2;

    public Student() {
        scores = new HashMap<>();
        arr1 = new ArrayList();
        arr2 = new ArrayList();
    }

    public void setName(String name) {
        if (name == null || name.length() < 2) {  //String.length()傳回字串的長度
            System.out.printf("name不能為null或少於2個字，name為%s%n", name);
        }
        this.name = name;
    }

    public void setScores(String subject, int score) {
        scores.put(subject, score);
    }

    public void displayInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + ":");
        sb.append("   ");

        Set<String> keys;
        keys = scores.keySet();
        Collection<Integer> values;
        values = scores.values();

        for (String s : keys) {
         //   arr1.add(s);
            sb.append(s).append("  ").append(scores.get(s)).append("  ");
        }
        for (int i : values) {
         //   arr2.add(i);
            total += i;
        }
       /* for (int j = 0; j < arr1.size(); j++) {
            sb.append(arr1.get(j) + " ");
            sb.append(arr2.get(j));
            sb.append(" ");
        }
        */
        
        sb.append("\n" + "-----------------------" + "\n");
        sb.append("總分 :" + total);
        System.out.println(sb);
    }
}
