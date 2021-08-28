package com.example.homework.AddExampleData;

import com.example.homework.Controller.MemberController;
import com.example.homework.Model.DepartmentAccount;
import com.example.homework.Model.MemberAccount;
import com.example.homework.Repositorys.DepartmentRepository;
import com.example.homework.Repositorys.MemberRepository;
import com.example.homework.request.GetMemberListRequest;
import com.example.homework.service.Impl.MemberAccountServiceImpl;
import com.example.homework.service.MemberAccountService;
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

        DepartmentAccount departmentAccount1 = new DepartmentAccount("資訊部");
        DepartmentAccount departmentAccount2 = new DepartmentAccount("人資部");
        departmentRepository.save(departmentAccount1);
        departmentRepository.save(departmentAccount2);


        for(int i = 0 ; i <44 ; i++){
            int a = Double.valueOf(Math.random()*2).intValue()+1;
            MemberAccount member1 =  new MemberAccount("王一二",String.valueOf(a),"男","0921234567","台北市中正路","32");
            memberRepository.save(member1);
        }

        System.out.println("Add data in h2");

    }

}
