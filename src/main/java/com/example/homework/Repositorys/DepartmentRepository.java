package com.example.homework.Repositorys;

import com.example.homework.Model.DepartmentAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentAccount,Long>  {

}
