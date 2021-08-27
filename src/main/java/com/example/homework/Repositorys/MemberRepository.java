package com.example.homework.Repositorys;

import com.example.homework.Model.MemberAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberAccount,Long> {

}
