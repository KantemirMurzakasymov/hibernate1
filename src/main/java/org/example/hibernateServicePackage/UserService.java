package org.example.hibernateServicePackage;

import org.example.hibernateModelPackage.Student;

import java.util.List;

public interface UserService {

        void createUsersTable();

        void dropUsersTable();

        void saveUser(Student student);

        Student removeUserById(long id);


        List<Student> getAllUsers();

        void cleanUsersTable();
}


