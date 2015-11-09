package org.nsu.myapplication;

/**
 * Created by iBrain on 02-11-2015.
 */
public class PersonItem {
    String name, nickName, dept, webpage;
    int imageResId, age;
    double height;

    public PersonItem(String name, String nickName, int imageResId, String dept, int age, double height, String webpage)
    {
        this.name = name;
        this.nickName = nickName;
        this.imageResId = imageResId;
        this.dept = dept;
        this.age = age;
        this.height = height;
        this.webpage = webpage;
    }
}
