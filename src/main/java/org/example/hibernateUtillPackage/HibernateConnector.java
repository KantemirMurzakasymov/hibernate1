package org.example.hibernateUtillPackage;

import org.example.hibernateModelPackage.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import java.util.Properties;

public class HibernateConnector {

    public static final SessionFactory sessionFactor = session();

    public static SessionFactory session(){
        try{
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        }catch (Throwable e){
            throw new ExceptionInInitializerError(e);
        }
    }
    public static SessionFactory sessionFactory (){
        return sessionFactor;
    }
    public static void shutdown(){
        sessionFactory().close();
    }


//    public static SessionFactory entityManager(){
//
//        Properties properties = new Properties();
//        properties.put(Environment.DRIVER, "org.postgrasql.Driver");
//        properties.setProperty(Environment.URL, "jdbc:postgresql://localhost:8080/postgres");
//        properties.setProperty(Environment.USER, "postgres");
//        properties.setProperty(Environment.PASS, "12345");
//
//        properties.setProperty(Environment.HBM2DDL_AUTO, "create");
//        properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
//        properties.setProperty(Environment.SHOW_SQL,"true");
//
//        Configuration configuration = new Configuration();
//        configuration.setProperties(properties);
//
//        configuration.addAnnotatedClass(Student.class);
//
//        return configuration.buildSessionFactory();
//    }


}
