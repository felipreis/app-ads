// Pacote onde a classe está localizada
package com.app.Tanamao.controller;

// Importa as classes e interfaces necessárias para o funcionamento do controlador
import com.app.Tanamao.model.Employ;
import com.app.Tanamao.model.form.EmployForm;
import com.app.Tanamao.service.impl.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


// Indica que esta classe é um controlador REST que gerencia as requisições HTTP relacionadas ao recurso "Employ"
@RestController
@RequestMapping("/employ") // Define a URL base para as requisições deste controlador
public class EmployController {


    // Injeta o serviço EmployService para manipular as operações de negócio de empregados
    @Autowired
    private EmployService service;


    // Mapeia a operação de criação de um novo empregado (Employ) para o metodo HTTP POST
    @PostMapping
    public Employ create(@RequestBody EmployForm form){ // Recebe os dados no corpo da requisição e cria um novo empregado
        return service.create(form);
    }

    // Mapeia a operação de consulta de um empregado específico por ID para o método HTTP GET
    @GetMapping("/{id}")
    public Employ get(@PathVariable Integer id){// Extrai o ID do caminho da URL

        return service.get(id);
    }

    // Mapeia a operação de consulta de todos os empregados de um setor específico para o método HTTP GET
    @GetMapping("/setor/{setor}")
    public List<Employ> getAll(@PathVariable String setor){ // Extrai o setor do caminho da URL

        return service.getAll(setor);
    }
}
