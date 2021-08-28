package com.example.homework.service.Impl;

import com.example.homework.Model.MemberAccount;
import com.example.homework.Repositorys.MemberRepository;
import com.example.homework.request.GetMemberListRequest;
import com.example.homework.service.MemberAccountService;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@Service
public class MemberAccountServiceImpl implements MemberAccountService {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    private EntityManager entityManager;

    @Override
    public void save(MemberAccount memberAccount) {
        memberRepository.save(memberAccount);
    }

    @Override
    public void deleteById(long id) {
        memberRepository.deleteById(id);
    }

    @Override
    public List<Map<String, Object>> getMemberAllList(GetMemberListRequest request) {

        String sql = "SELECT mem.* , dep.department_Name" +
                " FROM Member_account mem" +
                " JOIN Department_Account dep ON mem.department_Id = dep.department_Id " +
                " WHERE 1 = 1 " +
                " AND (  dep.department_Name = :departmentName OR '1' = IFNULL(:departmentName,'1'))" +
                " AND (  mem.age = :age OR '1' = IFNULL(:age,'1'))" +
                " AND (  mem.member_Id = :memberId OR '1' = IFNULL(:memberId,'1'))" +
                " AND (  mem.name = :name OR '1' = IFNULL(:name ,'1'))"+
                "  LIMIT :limit  OFFSET :offset ";
        Query query = entityManager.createNativeQuery(sql)
                .setParameter("departmentName", request.getDepartmentName())
                .setParameter("memberId", request.getMemberId())
                .setParameter("age", request.getAge())
                .setParameter("name", request.getName())
                .setParameter("limit", request.getItemNum())
                .setParameter("offset", request.getOffset());
        query.unwrap(org.hibernate.SQLQuery.class)
                .setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

        return query.getResultList();
    }

    @Override
    public int countMemberAllList(GetMemberListRequest request) {
        String sql = "SELECT COUNT(*)" +
                " FROM Member_account mem" +
                " JOIN Department_Account dep ON mem.department_Id = dep.department_Id " +
                " WHERE 1 = 1 " +
                " AND (  dep.department_Name = :departmentName OR '1' = IFNULL(:departmentName,'1'))" +
                " AND (  mem.age = :age OR '1' = IFNULL(:age,'1'))" +
                " AND (  mem.member_Id = :memberId OR '1' = IFNULL(:memberId,'1'))" +
                " AND (  mem.name = :name OR '1' = IFNULL(:name ,'1'))";


        BigInteger count = (BigInteger) entityManager.createNativeQuery(sql)
                .setParameter("departmentName", request.getDepartmentName())
                .setParameter("memberId", request.getMemberId())
                .setParameter("age", request.getAge())
                .setParameter("name", request.getName()).getSingleResult();

        return count.intValue();
    }
}
