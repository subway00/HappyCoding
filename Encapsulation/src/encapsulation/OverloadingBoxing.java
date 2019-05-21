/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

class Some {

    void Some(int i) {
        System.out.println("int版本呼叫");
    }
    void Some (Integer integer)
    {
        System.out.println("Integer版本呼叫");
    }
}

public class OverloadingBoxing {

    public static void main(String args[]) {
        Some s = new Some() ;
        s.Some(new Integer (1));
        
    }
}
