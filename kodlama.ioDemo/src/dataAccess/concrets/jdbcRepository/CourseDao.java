package dataAccess.concrets.jdbcRepository;

import entities.concrets.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    List<Course> courses =new ArrayList<>();

    public void add(Course course) {
        courses.add(course);
        System.out.println("Course added with JDBC" + course.getId());
    }

    public void delete(Course course) {
        courses.remove(course);
        System.out.println("Course deleted with JDBC" + course.getId());
    }

    public void update(Course course) {
        System.out.println("Course updated with JDBC" + course.getId());
    }
    //    public Course get(int id){
//
//    }
    public List<Course> getAll(){
        System.out.println("All Courses listed");
        return courses;
    }
}


