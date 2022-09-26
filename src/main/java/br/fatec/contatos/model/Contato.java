package br.fatec.contatos.model;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table (name = "tb_contato")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Contato extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	
	@Column(length = 60, nullable = true)
	private String email;
	
	@Column(length = 80, nullable = false)
	private String nome;
	
	@Column(length = 20, nullable = true)
	private String telefone;
	
	public Contato() { }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelephone(String telefone) {
		this.telefone = telefone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
