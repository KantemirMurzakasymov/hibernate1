package org.example.hibernateServicePackage;

import org.example.hibernateModelPackage.Student;
import org.example.hibernateUtillPackage.HibernateConnector;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;

public class UserServiceImplement implements UserService{

        public void createUsersTable() {
                EntityManagerFactory factory  = Persistence.createEntityManagerFactory("hibernate.cfg.xml");
                EntityManager manager = factory.createEntityManager();
        }

        public void dropUsersTable() {
                EntityManagerFactory factory  = Persistence.createEntityManagerFactory("hibernate.cfg.xml");
                EntityManager manager = factory.createEntityManager();
                Transaction transaction = (Transaction) manager.getTransaction();
                transaction.begin();
                manager.clear();
                transaction.commit();

        }

        public void saveUser(Student student) {
                EntityManagerFactory factory  = Persistence.createEntityManagerFactory("hibernate.cfg.xml");
                EntityManager manager = factory.createEntityManager();
                Transaction transaction = (Transaction) manager.getTransaction();
                transaction.begin();
                manager.persist(student);
                transaction.commit();


//                Session session = HibernateConnector.sessionFactory().openSession();
//                session.getTransaction().begin();
//                session.persist(student);
//                session.getTransaction().commit();
//                session.close();
//                System.out.println(" ADDED SUCCESSFULLY " + student);

        }

        @Override
        public Student removeUserById(long id) {
                EntityManagerFactory factory  = Persistence.createEntityManagerFactory("hibernate.cfg.xml");
                EntityManager manager = factory.createEntityManager();
                Transaction transaction = (Transaction) manager.getTransaction();
                transaction.begin();
                Student student = manager.find(Student.class,id);
//                if (student != null){
//                        System.out.println("Student Bilgileri");
//                        System.out.println("Student ID: " + student.getId());
//                        System.out.println("Student adi: " + student.getFirst_name());
//                        System.out.println("Student soyadi: " + student.getLast_name());
//                        System.out.println("Student yasi: " + student.getAge());
//                        return student;
//
//                }
                transaction.commit();
                return student;

//                Session session = HibernateConnector.sessionFactory().openSession();
//                session.getTransaction().begin();
//                Student student = session.get(Student.class,id);
//                session.getTransaction().commit();
//                session.close();
//                return student;



//                Session session = HibernateConnector.entityManager().openSession();
//                session.getTransaction().begin();
//
//                Student student = (Student) session.createQuery(" delete from Student s where s.id = ?1 ", Student.class)
//                        .setParameter(1, id).getSingleResult();
//                session.getTransaction().commit();
//                session.close();
//                return student;
        }


        public List<Student> getAllUsers() {
                EntityManager entityManager = HibernateConnector.sessionFactory().openSession();

                entityManager.getTransaction().begin();

                List<Student> students = entityManager.createQuery("select s from Student s", Student.class)
                        .getResultList();

                entityManager.getTransaction().commit();

                entityManager.close();

                return students;
        }

        public void cleanUsersTable() {
                Session session = HibernateConnector.sessionFactory().openSession();
                session.beginTransaction();
                Query query = session.createQuery("DELETE FROM Student "); query.executeUpdate();
                session.getTransaction().commit();
                session.close();
                System.out.println("Successfully deleted all datas in Student");

        }

}
