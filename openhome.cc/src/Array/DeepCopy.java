/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author User
 */
class Clothes2 {

    String color;
    char size;

    public Clothes2(String color, char size) {
        this.color = color;
        this.size = size;
    }

}

public class DeepCopy {

    public static void main(String args[]) {
        Clothes2[] c1 = {new Clothes2("Blue", 'L'), new Clothes2("Orange", 'S')
        };
        Clothes2[] c2 = new Clothes2[c1.length];
        for (int i = 0; i < c1.length; i++) {
            c2[i] = new Clothes2(c1[i].color, c1[i].size); //c2 參考到的是新物件
             
        }
        c1[0].color = "Green" ;
        System.out.println(c2[0].color);//修改c1[0]不影響c2[0]
    }
}
