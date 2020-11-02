package com.example.demo.repositories;

import com.example.demo.models.Course;
import com.example.demo.models.Student;
import com.example.demo.util.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.boot.jackson.JsonComponent.Scope.VALUES;

public class CourseRepository {

    private Connection conn;

    public CourseRepository(){this.conn = DatabaseConnectionManager.getDatabaseConnection(); }

    public boolean create(Course course){
        try{
            PreparedStatement createCourse = conn.prepareStatement("INSERT INTO kurser(kursusNavn, startDato, etcs, kursusbeskrivelse)" + "VALUES(?,?,?,?)");
            createCourse.setString( 1, course.getKursusNavn());
            createCourse.setString(2, course.getStartDato());
            createCourse.setInt(3, course.getEtcs());
            createCourse.setString(4, course.getKursusBeskrivelse());
            createCourse.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public List<Course> listCourses(){
        List<Course> allCourses = new ArrayList<>();
        try{
            PreparedStatement readcourses = conn.prepareStatement("SELECT * FROM kurser");
            ResultSet rs = readcourses.executeQuery();
            while(rs.next()){
                Course tempCourse = new Course();
                tempCourse.setKursus_id(rs.getInt(1));
                tempCourse.setKursusNavn(rs.getString(2));
                tempCourse.setStartDato(rs.getString(3));
                tempCourse.setEtcs(rs.getInt(4));
                tempCourse.setKursusBeskrivelse(rs.getString(5));
                allCourses.add(tempCourse);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allCourses;
    }

    public boolean update(Course course){
        try{
            PreparedStatement updateCourse = conn.prepareStatement("UPDATE kurser" + " SET kursusNavn=?, startDato=?, etcs=?, kursusBeskrivelse=? WHERE kursusNavn =?");
            updateCourse.setString(1, course.getKursusNavn());
            updateCourse.setString(2, course.getStartDato());
            updateCourse.setInt(3, course.getEtcs());
            updateCourse.setString(4, course.getKursusBeskrivelse());
            updateCourse.setString(5, course.getKursusNavn());
            updateCourse.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
}


    public boolean delete(int kursus_id){
        try{
            PreparedStatement deleteCourse = conn.prepareStatement("DELETE FROM kurser WHERE kursus_id=?");
            deleteCourse.setInt(1, kursus_id);
            deleteCourse.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
return false;

    }

    public Course read(int kursus_id) {
        Course courseToReturn = new Course();
        try {
            PreparedStatement getSingleCourse = conn.prepareStatement("SELECT * FROM kurser WHERE kursus_id=?");
            getSingleCourse.setInt(1, kursus_id );
            ResultSet rs = getSingleCourse.executeQuery();
            while (rs.next()) {
                courseToReturn = new Course();
                courseToReturn.setKursus_id(rs.getInt(1));
                courseToReturn.setKursusNavn(rs.getString(2));
                courseToReturn.setStartDato(rs.getString(3));
                courseToReturn.setEtcs(rs.getInt(4));
                courseToReturn.setKursusBeskrivelse(rs.getString(5));
            }
        } catch (SQLException s) {
            s.printStackTrace();
        }
        return courseToReturn;
    }



}
