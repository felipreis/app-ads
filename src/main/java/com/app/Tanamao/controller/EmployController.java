package com.app.Tanamao.controller;


import com.app.Tanamao.model.Employ;
import com.app.Tanamao.model.form.EmployForm;
import com.app.Tanamao.service.impl.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employ")
public class EmployController {

    @Autowired
    private EmployService service;

    @PostMapping
    public Employ create(@RequestBody EmployForm form){
        return service.create(form);
    }

    @GetMapping("/{id}")
    public Employ get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping("/setor/{setor}")
    public List<Employ> getAll(@PathVariable String setor){
        return service.getAll(setor);
    }
}
