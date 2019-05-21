/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Human implements Swimmer{
    
    private String name ;
    @Override
    public void swim() {
        System.out.printf(" 人類 %s 游泳%n", name);
    }
    public static void main(String[] args) {
        Human sw = new Human();
        sw.swim();
    }
}
