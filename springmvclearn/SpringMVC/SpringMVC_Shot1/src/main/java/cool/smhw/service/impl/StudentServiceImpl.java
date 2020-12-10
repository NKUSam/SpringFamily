package cool.smhw.service.impl;

import cool.smhw.dao.StudentDao;
import cool.smhw.domain.Student;
import cool.smhw.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        System.out.println("-----------------------"+student);
        return studentDao.insertStudent(student);
    }

    @Override
    public List<Student> findStudents() {
        return studentDao.selectStudents();
    }
}
