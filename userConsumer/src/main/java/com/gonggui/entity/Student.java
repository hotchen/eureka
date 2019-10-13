package com.gonggui.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by zhaochen on 2019-10-13.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
//lombok简化javabean的书写，提供自动提供getset方法
    private long id;
    private String name;
    private int age;
}
