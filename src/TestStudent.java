
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student01 = new Student();
        student01.setName("Truong");
        student01.setEmail("truong@gmail.com");
        student01.setBirthday("22/12/1980");
        
        System.out.println(student01.getName());
        System.out.println(student01.getEmail());
        System.out.println(student01.getBirthday());
        
        
        Student student02 = new Student();
        student02.setName("Dung");
        student02.setEmail("Dung@gmail.com");
        student02.setBirthday("14/02/1980");
        
        System.out.println(student02.getName());
        System.out.println(student02.getEmail());
        System.out.println(student02.getBirthday());
        
                
                
        ArrayList<Student> listStudent = new ArrayList<Student>();
        listStudent.add(student01);
        listStudent.add(student02);
        
    }
    
}
