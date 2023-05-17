/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author dell
 */
public class Student {
private String name;
    private int age;
   public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display_info() {
        System.out.println("Nama: " + name);
        System.out.println("Usia: " + age);
    }

    public static void main(String[] args) {
        Student student = new Student("Meliana Rosa Hani Lestari", 21);
        student.display_info();
    }
    
}


   