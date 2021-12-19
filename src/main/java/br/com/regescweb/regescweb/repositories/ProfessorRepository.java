package br.com.regescweb.regescweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.regescweb.regescweb.models.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{
    

}
