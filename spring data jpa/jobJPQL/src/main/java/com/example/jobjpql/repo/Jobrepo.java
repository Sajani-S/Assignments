package com.example.jobjpql.repo;

import com.example.jobjpql.entity.Job;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface Jobrepo extends JpaRepository<Job,Integer> {


    @Query("SELECT j FROM Job j WHERE j.salary > :salary")
    List<Job> findJobsWithSalaryGreaterThan(@RequestParam ("salary") double salary);

    @Query("SELECT j FROM Job j WHERE j.location = :location")
    List<Job> findJobsByLocation(@RequestParam ("location") String location);

    @Modifying
    @Transactional
    @Query("UPDATE Job j SET j.salary = :salary WHERE j.id = :id")
    int updateSalary(@RequestParam ("id") Long id,
                     @RequestParam ("salary") double salary);

    @Modifying
    @Transactional
    @Query("DELETE FROM Job j WHERE j.company = :company")
    int deleteByCompany(@RequestParam ("company") String company);

}
