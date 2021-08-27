package com.example.homework.Controller;

import com.example.homework.Model.MemberAccount;
import com.example.homework.Repositorys.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/memberApi")
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @RequestMapping(value="/{id}")
    public Optional<MemberAccount> read(@PathVariable long id) {
        return memberRepository.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody MemberAccount memberAccount) {
        memberRepository.save(memberAccount);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody MemberAccount memberAccount) {
        memberRepository.save(memberAccount);

    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id) {
        memberRepository.deleteById(id);

    }
}
