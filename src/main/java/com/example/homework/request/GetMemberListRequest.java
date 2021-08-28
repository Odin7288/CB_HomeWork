package com.example.homework.request;

import com.example.homework.Model.Page;

public class GetMemberListRequest  extends Page {
    public GetMemberListRequest() {
    }

    public GetMemberListRequest(String name, Long memberId, String age, String departmentName) {
        this.age = age;
        this.memberId = memberId;
        this.departmentName = departmentName;
        this.name = name;
    }

    private String name;
    private Long memberId;
    private String age;
    private String departmentName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "GetMemberListRequest{" +
                "name='" + name + '\'' +
                ", memberId=" + memberId +
                ", age='" + age + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
