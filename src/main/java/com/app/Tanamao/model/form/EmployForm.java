package com.app.Tanamao.model.form;


// Importa as anotações do Lombok
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// Anotações Lombok para gerar automaticamente os métodos getter, setter, e construtores
@Data                           // Gera automaticamente os métodos getter, setter, equals, hashCode, e toString
@AllArgsConstructor             // Gera um construtor com todos os atributos
@NoArgsConstructor              // Gera um construtor vazio

public class EmployForm {

    // Define os atributos do formulário que representam os dados de um empregado
    private String nome;

    private String email;

    private String setor;

    private String telefone;

    private String endereco;

}
