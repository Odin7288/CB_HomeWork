package com.example.homework.AddExampleData;

import com.example.homework.Model.DepartmentAccount;
import com.example.homework.Model.MemberAccount;
import com.example.homework.Repositorys.DepartmentRepository;
import com.example.homework.Repositorys.MemberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class addExampleData implements CommandLineRunner {

    private final MemberRepository memberRepository;
    private final DepartmentRepository departmentRepository;

    public addExampleData(MemberRepository memberRepository, DepartmentRepository departmentRepository) {
        this.memberRepository = memberRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        MemberAccount member1 = new MemberAccount("王一二","1","男","0921234567","32","台北市中正路");

//        MemberAccount member1 = new MemberAccount("王一二","1","男","0921234567","32","台北市中正路","2021-01-01 18:51","2021-03-23 18:51");
//        MemberAccount member2 = new MemberAccount("甲三四","2","男","0932123456","18","台北市大同區","2021-6-21 08:51","2021-08-23 10:51");

        DepartmentAccount departmentAccount1 = new DepartmentAccount("資訊部");
        DepartmentAccount departmentAccount2 = new DepartmentAccount("人資部");
        memberRepository.save(member1);
//        memberRepository.save(member2);

        departmentRepository.save(departmentAccount1);
        departmentRepository.save(departmentAccount2);


        System.out.println("Add data in h2");


    }
}
