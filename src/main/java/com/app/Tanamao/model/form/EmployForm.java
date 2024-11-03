package com.app.Tanamao.model.form;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployForm {

    private String nome;

    private String email;

    private String setor;

    private String telefone;

    private String endereco;

}
