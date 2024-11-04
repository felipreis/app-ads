package com.app.Tanamao.model;


// Importa as anotações e funcionalidades necessárias do Jakarta Persistence e do Lombok
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Anotações Lombok para gerar automaticamente os métodos getter, setter, e outros utilitários
@Data
@NoArgsConstructor              //gera construtor vazio
@AllArgsConstructor             // gera um contrutor com todos os atributos

// Indica que esta classe é uma entidade JPA (mapeada para uma tabela no banco de dados)
@Entity
@Table(name = "tb_employ")      // Define o nome da tabela correspondente no banco de dados
public class Employ {

    // Define a chave primária da entidade e a estratégia de geração automática do valor
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    // Define as colunas da tabela com os respectivos atributos da entidade
    private Integer id;

    private String nome;

    private String email;

    private String setor;

    private String telefone;

    private String endereco;


}
