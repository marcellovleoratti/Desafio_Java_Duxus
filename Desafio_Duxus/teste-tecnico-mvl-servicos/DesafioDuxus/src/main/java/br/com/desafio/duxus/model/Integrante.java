package br.com.desafio.duxus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class Integrante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Long idintegrante;
	
	@NotEmpty(message="A Franquia deve ser Cadastrada")
	private String franquia;
	
	@NotEmpty(message="O nome deve ser Cadastrado")
	private String nome;
	
	@NotEmpty(message="A função deve ser Cadastrada")
	private String funcao;
	
	@NotEmpty(message="A função deve ser Cadastrada")
	private String exemplo_integrante;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getIdintegrante() {
		return idintegrante;
	}


	public void setIdintegrante(Long id_integrante) {
		this.idintegrante = id_integrante;
	}


	public String getFranquia() {
		return franquia;
	}


	public void setFranquia(String franquia) {
		this.franquia = franquia;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getFuncao() {
		return funcao;
	}


	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}


	public String getExemplo_integrante() {
		return exemplo_integrante;
	}


	public void setExemplo_integrante(String exemplo_integrante) {
		this.exemplo_integrante = exemplo_integrante;
	}
	

	@Override
	public String toString() {
		return "Integrante [id_integrante=" + idintegrante + ", franquia=" + franquia + ", nome=" + nome + ", funcao="
				+ funcao + ", exemplo_integrante=" + exemplo_integrante + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idintegrante == null) ? 0 : idintegrante.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Integrante other = (Integrante) obj;
		if (idintegrante == null) {
			if (other.idintegrante != null)
				return false;
		} else if (!idintegrante.equals(other.idintegrante))
			return false;
		return true;
	}
}
