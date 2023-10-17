/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wcram.intro_to_java;

/**
 *
 * @author WCram
 */
public class Student {
    
    // fields

    private String _firstName;

    private String _lastName;
    private int _grade;
    
    // constructor
//    public Student(String fName, String lName, int grade) {
//        _firstName = fName;
//        _lastName = lName;
//        _grade = grade;
//    }
    public Student(String _firstName, String _lastName, int _grade) {
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._grade = _grade;
    }
    
    // properties
    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String _firstName) {
        this._firstName = _firstName;
    }
    
    
    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String _lastName) {
        this._lastName = _lastName;
    }

    public int getGrade() {
        return _grade;
    }

    public void setGrade(int _grade) {
        this._grade = _grade;
    }
    
    // methods

    public String fullName() {
        return _firstName + " " + _lastName;
    }

    @Override
    public String toString() {
        return fullName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
}
