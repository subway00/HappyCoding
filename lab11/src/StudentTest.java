public class StudentTest {

    public static void main(String[] args) {
          Student a = new Student();
        a.setName("Tom");
        a.setScores("chinese", 90);
        a.setScores("English", 85);
        a.setScores("math", 50);
        a.displayInfo();
    }
    
}
