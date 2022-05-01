package org.example.hibernateModelPackage;

import org.example.hibernateDaoPackage.UserDaoHabernate;
import org.example.hibernateUtillPackage.HibernateConnector;


public class App {
    public static void main( String[] args ) {
        //HibernateConnector.sessionFactory();
        Student student = new Student(1L,"ALBINA", "Balaba", (byte) 23);

        UserDaoHabernate us = new UserDaoHabernate();
        us.createUsersTable();
        //us.saveUser(student);


    }
}
