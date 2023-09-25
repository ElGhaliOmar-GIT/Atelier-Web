package com.candidat.microservice.atelier_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<Job> findAllJobs() {
        return jobRepository.findAll();
    }

    public Job findJobById(Integer id) {
        return jobRepository.findById(id).orElse(new Job());
    }

    public List<Job> findJobsByServce(String service) {
        return jobRepository.findJobsByService(service);
    }

    public Job updateCandidat(int id) {
        if (jobRepository.findById(id).isPresent()) {
            Job existingCandidat = jobRepository.findById(id).get();
            existingCandidat.setEtat(!existingCandidat.getEtat());
            return jobRepository.save(existingCandidat);
        } else
            return null;
    }

}
