package cool.smhw.service.impl;

import cool.smhw.dao.StudentMapper;
import cool.smhw.entity.Student;
import cool.smhw.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student getById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

}
