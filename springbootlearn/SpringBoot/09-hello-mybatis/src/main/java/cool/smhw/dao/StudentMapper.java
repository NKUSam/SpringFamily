package cool.smhw.dao;

import cool.smhw.entity.Student;

public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);
}