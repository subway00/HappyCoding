package encapsulation;
class Clothes2 {
    String color ;
    char size ;

    public Clothes2(String color , char size) 
    {
        this.color = color;
        this.size = size;
    }
    
    
}
public class ShallowCopy {
    public static void main(String args[]) {
    Clothes2 [] c1 = { new Clothes2("blue",'S'), new Clothes2("pink",'M')
    };
    Clothes2 [] c2 = new Clothes2[c1.length];
    /*
    for ( int i=0 ; i < c1.length ; i++ ) {
        c2[i] = c1[i] ;
    }
    */
    for ( Clothes2 c3 : c1) { //c3 not array
       
    }
    c1[0].color = "black" ;
        System.out.println(c2[0].color);
    }
}