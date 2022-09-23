package br.fatec.contatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.fatec.contatos.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
