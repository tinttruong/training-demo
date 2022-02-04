package com.hcl.linkedlistpractice;
import java.util.List;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main( String[] args ) 
    {
        LinkedList<String> courses = new LinkedList<String>();
        courses.add("Biology");
        courses.add("Chemistry");
        courses.add("Physic");
        courses.add("English");
        System.out.println(courses);
        System.out.println(courses.peekFirst());
        System.out.println(courses.peekLast());
        System.out.println(courses.removeFirst());
        System.out.println(courses);

        
    }
}