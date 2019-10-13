package com.gonggui.repositity;

import com.gonggui.entity.Student;

import java.util.Collection;

/**
 * Created by zhaochen on 2019-10-13.
 */
public interface StudentResposity {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
