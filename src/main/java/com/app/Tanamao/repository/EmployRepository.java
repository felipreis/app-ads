package com.app.Tanamao.repository;

import com.app.Tanamao.model.Employ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployRepository extends JpaRepository<Employ, Integer> {

    List<Employ> findBySetor (@Param("setor") String setor);

}
