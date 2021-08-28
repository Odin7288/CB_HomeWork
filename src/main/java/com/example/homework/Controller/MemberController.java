package com.example.homework.Controller;

import com.example.homework.Model.MemberAccount;
import com.example.homework.request.GetMemberListRequest;
import com.example.homework.service.MemberAccountService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/memberApi")
public class MemberController {

    @Resource
    MemberAccountService memberAccountService;

    @PostMapping(value = "/getMemberAllList")
    public List<Map<String, Object>> getMemberAllList(@RequestBody GetMemberListRequest request) {
        request.setCount(memberAccountService.countMemberAllList(request));
        return memberAccountService.getMemberAllList(request);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody MemberAccount memberAccount) {
        memberAccountService.save(memberAccount);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody MemberAccount memberAccount) {
        memberAccountService.save(memberAccount);

    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id) {
        memberAccountService.deleteById(id);

    }
}
