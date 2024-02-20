package org.example;


import org.example.config.FactoryConfiguration;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {


       Session session=FactoryConfiguration.getInstance().getSession();
       Transaction transaction=session.beginTransaction();

      /* Student student=session.get(Student.class,1);
       session.detach(student);
        session.merge(student);
        student.setName("aloka");*/

       /* Student student=new Student();
        student.setId(3);
        student.setName("hsareli");
        student.setAddress("maharagama");

        session.save(student);*/

        Student student=session.get(Student.class,1);
        Student student1=session.get(Student.class,1);




       transaction.commit();
       session.close();

    }
}