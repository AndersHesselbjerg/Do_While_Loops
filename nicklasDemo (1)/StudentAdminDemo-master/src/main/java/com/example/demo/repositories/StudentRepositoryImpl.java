    package com.example.demo.repositories;

import com.example.demo.models.Student;
import com.example.demo.util.DatabaseConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements IStudentRepository {
    private Connection conn;

    public StudentRepositoryImpl() {
        this.conn = DatabaseConnectionManager.getDatabaseConnection();
    }

    @Override
    public boolean create(Student student) { //vi skal have et vilket som helst objekt af en student, ligegyldigt navn
        Student studentToCreate = new Student();
        java.sql.Date sqlDate = new java.sql.Date(student.getEnrollmentDate().getTime());

        try {
            PreparedStatement createStudent = conn.prepareStatement("INSERT INTO students(firstName, lastName, enrollmentDate, cpr )" + "VALUES(?,?, ?,?)");
            //createStudent.setInt(1, student.getId());
            createStudent.setString(1, student.getFirstName());
            createStudent.setString(2, student.getLastName());
            createStudent.setDate(3, sqlDate);
            createStudent.setString(4, student.getCpr());
            createStudent.executeUpdate();
            {


                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    @Override
    public Student read(int id) {
        Student studentToReturn = new Student();
        try {
            PreparedStatement getSingleStudent = conn.prepareStatement("SELECT * FROM students WHERE id=?");
            getSingleStudent.setInt(1, id);
            ResultSet rs = getSingleStudent.executeQuery();
            while (rs.next()) {
                studentToReturn = new Student();
                studentToReturn.setId(rs.getInt(1));
                studentToReturn.setFirstName(rs.getString(2));
                studentToReturn.setLastName(rs.getString(3));
                studentToReturn.setEnrollmentDate(rs.getDate(4));
                studentToReturn.setCpr(rs.getString(5));
            }
        } catch (SQLException s) {
            s.printStackTrace();
        }
        return studentToReturn;
    }

    @Override
    public List<Student> readAll() {
        List<Student> allStudents = new ArrayList<Student>();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM students");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student tempStudent = new Student();
                tempStudent.setId(rs.getInt(1));
                tempStudent.setFirstName(rs.getString(2));
                tempStudent.setLastName(rs.getString(3));
                tempStudent.setEnrollmentDate(rs.getDate(4));
                tempStudent.setCpr(rs.getString(5));
                allStudents.add(tempStudent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allStudents;
    }


    public boolean update(Student student) {
        java.sql.Date sqlDate = new java.sql.Date(student.getEnrollmentDate().getTime());

        try {
PreparedStatement updateStudent = conn.prepareStatement("UPDATE students " + " SET firstName=?, lastName=?, cpr=?, enrollmentDate=? where id=? ");
updateStudent.setString(1, student.getFirstName());
updateStudent.setString(2, student.getLastName() );
updateStudent.setString(3, student.getCpr());
updateStudent.setDate(4, sqlDate);
updateStudent.setInt(5, student.getId());
updateStudent.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        {
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            PreparedStatement deleteStudent = conn.prepareStatement("DELETE FROM students WHERE id =?");
            deleteStudent.setInt(1, id);
            deleteStudent.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }




}



