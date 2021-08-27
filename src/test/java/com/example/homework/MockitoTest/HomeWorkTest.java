package com.example.homework.MockitoTest;


import com.example.homework.Controller.MemberController;
import com.example.homework.Model.MemberAccount;
import com.example.homework.Repositorys.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class HomeWorkTest {

    @Mock
    MemberRepository memberRepository;

    @InjectMocks
    MemberController memberController;


    @Test
    void read() {
        memberController.read(1);
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
        verify(memberRepository).deleteById(1l);

    }
}
