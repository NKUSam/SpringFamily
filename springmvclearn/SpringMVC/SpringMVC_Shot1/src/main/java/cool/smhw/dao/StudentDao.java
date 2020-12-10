package cool.smhw.dao;

import cool.smhw.domain.Student;

import java.util.List;

public interface StudentDao {

    public int insertStudent(Student student);
    public List<Student> selectStudents();

}