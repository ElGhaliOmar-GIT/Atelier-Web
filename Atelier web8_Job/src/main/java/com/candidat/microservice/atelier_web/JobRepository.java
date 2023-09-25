package com.candidat.microservice.atelier_web;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Integer> {

    public List<Job> findJobsByService(String service);

}
