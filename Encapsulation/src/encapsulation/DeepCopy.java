package encapsulation;
class Clothes {
    String color;
    char size;

    public Clothes(String color, char size) {
        this.color = color;
        this.size = size;
    }
    
}
public class DeepCopy {
    public static void main (String args []) {
        Clothes [] c1 = { new Clothes("red", 'L'), new Clothes("blue", 'M')
        };
        Clothes [] c2 = new Clothes[c1.length];
        for (int i = 0 ; i < c1.length ; i++) {
            Clothes c = new Clothes(c1[i].color, c1[i].size) ;
            c2 [i] = c ;
        }
        c1[0].color = "green" ;
        System.out.println(c2[0].color);
    }
}
