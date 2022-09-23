package br.fatec.contatos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fatec.contatos.model.Contato;
import br.fatec.contatos.repository.ContatoRepository;

@Service
public class ContatoService implements ServiceInterface<Contato> {
	@Autowired
	private ContatoRepository repository;
	
	public ContatoService() { }
	
	@Override
	public Contato create(Contato contato) {
		repository.save(contato);
		return contato;
	}
	
	@Override
	public List<Contato> findAll(){
		return repository.findAll();
	}
	
	@Override
	public Contato findById(Long id) {
		Optional<Contato> contato = repository.findById(id);
		return contato.orElse(null);
	}
	
	@Override
	public boolean update(Contato contato) {
		if(repository.existsById(contato.getId())) {
			repository.save(contato);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean delete(Long id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}
}
