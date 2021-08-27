package com.example.homework.Model;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@EntityListeners(AuditingEntityListener.class)
public class MemberAccount {

    public MemberAccount() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long memberId;


    String name;


    String departmentId;

    String gender;

    String phoneNumber;

    String age;


    String address;

    @CreatedDate
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date createTime;

    @CreatedDate
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date lastChangeTime;


//    public MemberAccount(String name, String departmentId,String gender,String phoneNumber,String address,String age,String createTime,String lastChangeTime) {
//        this.name = name;
//        this.departmentId = departmentId;
//        this.gender = gender;
//        this.phoneNumber = phoneNumber;
//        this.address = address;
//        this.age = age;
//        this.createTime = createTime;
//        this.lastChangeTime = lastChangeTime;
//    }

    public MemberAccount(String name, String departmentId,String gender,String phoneNumber,String address,String age) {
        this.name = name;
        this.departmentId = departmentId;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.age = age;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastChangeTime() {
        return lastChangeTime;
    }

    public void setLastChangeTime(Date lastChangeTime) {
        this.lastChangeTime = lastChangeTime;
    }
}
