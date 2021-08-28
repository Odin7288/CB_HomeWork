package com.example.homework.MockitoTest;


import com.example.homework.Controller.MemberController;
import com.example.homework.Model.DepartmentAccount;
import com.example.homework.Model.MemberAccount;
import com.example.homework.Repositorys.DepartmentRepository;
import com.example.homework.Repositorys.MemberRepository;
import com.example.homework.request.GetMemberListRequest;
import com.example.homework.service.Impl.MemberAccountServiceImpl;
import com.example.homework.service.MemberAccountService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import javax.persistence.EntityManager;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class HomeWorkTest {

    @Mock
    MemberRepository memberRepository;

    @Mock
    DepartmentRepository departmentRepository;

    @Mock
    MemberAccountService memberAccountService;

    @MockBean
    MemberAccount memberAccount;

    @InjectMocks
    MemberController memberController;


    @Test
    void read() {
        GetMemberListRequest request = new GetMemberListRequest();
        Mockito.when(memberController.getMemberAllList(request));

        System.out.println(memberController.getMemberAllList(request));
    }

    @Test
    void create() {
        memberController.create(new MemberAccount("Jackson","1","男","0921234567","32","台北市中正路"));
    }

    @Test
    void update() {
        memberController.update(new MemberAccount("Jackson","1","男","0921234543","32","台北市中正路"));
    }

    @Test
    void delete() {
        memberController.delete(1);
    }
}
