package com.app.Tanamao.service;

import com.app.Tanamao.model.Employ;
import com.app.Tanamao.model.form.EmployForm;

import java.util.List;
import java.util.Optional;

public interface IEmployService {

    Employ create(EmployForm form);

    Employ get(Integer id);

    List<Employ> getAll(String setor);

}
