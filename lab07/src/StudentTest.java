/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StudentTest {
    
    public static void main(String args[]) {
        Student a = new Student();
        a.setName("Tom");
        a.setScores(Student.chinese, 90);
        a.setScores(Student.English, 85);
        a.setScores(Student.math, 50);
        a.displayInfo();
    }
}

