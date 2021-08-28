package com.example.homework.service;

import com.example.homework.Model.MemberAccount;
import com.example.homework.request.GetMemberListRequest;

import java.util.List;
import java.util.Map;

public interface MemberAccountService {
    void save(MemberAccount memberAccount);

    void deleteById(long id);
    List<Map<String,Object>> getMemberAllList(GetMemberListRequest request);
    int countMemberAllList(GetMemberListRequest request);
}
