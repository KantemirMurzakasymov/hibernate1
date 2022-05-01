package org.example.hibernateModelPackage;

import javax.persistence.*;

@Entity
public class Student {
        @Id
        //@GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        private String first_name;

        private String last_name;

        private Byte age;

        public Student() {
        }

        public Student(long id, String first_name, String last_name, Byte age) {
            this.id=id;
            this.first_name = first_name;
            this.last_name = last_name;
            this.age = age;
        }


    public void setId(Long id) {

            this.id = id;
    }

    public Long getId(long aLong) {

            return id;
    }
    public String getFirst_name(String first_name) {

            return this.first_name;
    }

    public void setFirst_name(String first_name) {

            this.first_name = first_name;
    }

    public String getLast_name(String last_name) {

            return this.last_name;
    }

    public void setLast_name(String last_name) {

            this.last_name = last_name;
    }

    public Byte getAge(byte aByte) {

            return age;
    }

    public void setAge(Byte age) {

            this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                '}';
    }

}
