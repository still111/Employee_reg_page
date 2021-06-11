package com.spring.mvc;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "name must be min 2 symbols")

    private String name;


    @NotBlank (message = "is required field")
    private String surName;
    @Min(value = 500, message = "must be greater then 499")
    @Max(value = 1000, message = "must be lesser then 1001")
    private int salary;
    private String department;
    private Map<String,String > departments;
    private String carBrand;
    private Map<String,String > carBrands;
    private String foreignLanguage;
    private String[] foreignLanguages;

    @checkEmail
    private String email;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "use pattern XXX-XX-XX")
    private String phoneNumver;

    public String getPhoneNumver() {
        return phoneNumver;
    }

    public void setPhoneNumver(String phoneNumver) {
        this.phoneNumver = phoneNumver;
    }

    public String[] getForeignLanguages() {
        return foreignLanguages;
    }

    public void setForeignLanguages(String[] foreignLanguages) {
        this.foreignLanguages = foreignLanguages;
    }

    public String getForeignLanguage() {
        return foreignLanguage;
    }

    public void setForeignLanguage(String foreignLanguage) {
        this.foreignLanguage = foreignLanguage;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee() {
        departments = new HashMap<>();
        departments.put("information technology","IT");
        departments.put("human resources","HR");
        departments.put("sales","sales");
        carBrands = new HashMap<>();
        carBrands.put("BMW","BMW");
        carBrands.put("Audi","Audi");
        carBrands.put("mercedes-bnc","MB");

        foreignLanguages = new String[3];
        foreignLanguages[0] = "FR";
        foreignLanguages[1] = "DE";
        foreignLanguages[2]= "JP";

    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
