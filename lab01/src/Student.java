public class Student {
    String name ;
    int eng ;
    int math ;
    
    public void display()
    {
        double total = eng + math ;
        double ave = total / 2D ;
    
        System.out.print(this.name + "\t" + this.eng + "\t" + this.math + "\t" 
                + total + "\t" + ave +"\n");
        
    }
   
}
