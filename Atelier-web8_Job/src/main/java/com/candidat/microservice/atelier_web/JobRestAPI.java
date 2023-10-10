package com.candidat.microservice.atelier_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestAPI {

    @Autowired
    private JobService jobService;

    @GetMapping("/getById/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Job getById(@PathVariable(value = "id") Integer id) {
        return jobService.findJobById(id);
    }

    @GetMapping("/getByservice/{service}")
    @ResponseStatus(HttpStatus.OK)
    public List<Job> getById(@PathVariable(value = "service") String service) {
        return jobService.findJobsByServce(service);
    }

    @GetMapping("/updateEtat/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Job updateEtat(@PathVariable(value = "id") Integer id) {
        return jobService.updateCandidat(id);
    }

}
