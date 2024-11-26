package com.example.springbootmanytoone;

import com.example.springbootmanytoone.entity.Book;
import com.example.springbootmanytoone.entity.Student;
import com.example.springbootmanytoone.repository.BookRepo;
import com.example.springbootmanytoone.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private StudentRepo studentRepo;


    @Override
    public void run(String... args) throws Exception {

        Book book1=new Book(1,"DS");
        Book book2=new Book(2,"Networking");
        Book book3=new Book(3,"Database");


        bookRepo.save(book1);
        bookRepo.save(book2);
        bookRepo.save(book3);


        Student student1=new Student(10,"Prajwal","Baramati",book1);
        Student student2=new Student(20,"Sameer","Pune",book1);
        Student student3=new Student(30,"Akash","Indapur",book2);
        Student student4=new Student(40,"Sanket","Satara",book2);
        Student student5=new Student(50,"Rohan","Baramati",book3);

        studentRepo.save((student1));
        studentRepo.save((student2));
        studentRepo.save((student3));
        studentRepo.save((student4));
        studentRepo.save((student5));


    }
}
