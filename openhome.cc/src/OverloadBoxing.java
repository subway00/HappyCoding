/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pig94
 */
class Some {
    void someMethod (int i) {
        System.out.println("int 版本被呼叫");
    }
    void someMethod (Integer i) {
        System.out.println("Integer 版本被呼叫");
    }
}
public class OverloadBoxing {
    public static void main(String[] args) {
        Some s = new Some();
        s.someMethod(1);
    }
    
}
