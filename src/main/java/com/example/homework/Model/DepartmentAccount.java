package com.example.homework.Model;
import javax.persistence.*;

@Entity
public class DepartmentAccount {

    public DepartmentAccount() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long departmentId;

    @Column
    String departmentName;

    public DepartmentAccount(String departmentName){
        this.departmentName = departmentName;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
