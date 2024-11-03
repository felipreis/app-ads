package com.app.Tanamao.service.impl;

import com.app.Tanamao.model.Employ;
import com.app.Tanamao.model.form.EmployForm;
import com.app.Tanamao.repository.EmployRepository;
import com.app.Tanamao.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class EmployService implements IEmployService {

    @Autowired
    private EmployRepository repository;

    @Override
    public Employ create(EmployForm form) {
        Employ employ = new Employ();
        employ.setNome(form.getNome());
        employ.setSetor(form.getSetor());
        employ.setEmail(form.getEmail());
        employ.setTelefone(form.getTelefone());
        employ.setEndereco(form.getEndereco());

        return repository.save(employ);
    }

    @Override
    public Employ get(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Employ> getAll(String setor) {
        return repository.findBySetor(setor);
    }
}
