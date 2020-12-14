package cool.smhw.service.impl;

import cool.smhw.dao.StudentMapper;
import cool.smhw.entity.Student;
import cool.smhw.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Transactional
    @Override
    public Student getById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);

        return student;
    }

}
