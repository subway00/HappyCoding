import javax.swing.JOptionPane;
public class Player {
    String n ;
    public void display()
    {
        String n = JOptionPane.showInputDialog("請輸入名字");
        String h = JOptionPane.showInputDialog("請輸入身高cm");
        String w = JOptionPane.showInputDialog("請輸入體重kg");
        
        this.n = n ;
        double h1 = Double.parseDouble(h) ;
        double w1 = Double.parseDouble(w) ;
                        
        System.out.print(n + "\t");
        System.out.print(h1 + "\t");
        System.out.print(w + "\t");
        
        h1 = h1 / 100 ;
        double bmi = w1 / ( h1 * h1) ;
        
        System.out.print(bmi + "\t");
    }
    
}
