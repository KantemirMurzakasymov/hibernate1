package org.example.hibernateDaoPackage;

import org.example.hibernateModelPackage.Student;

import java.util.List;

public interface UserDao {

        void createUsersTable();

        void dropUsersTable();

        void saveUser(Student student);

        Student removeUserById(long id);

        List<Student> getAllUsers();

        void cleanUsersTable();


}
