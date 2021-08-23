package br.com.desafio.duxus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Times {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "TIME")
	@DateTimeFormat(pattern="hh:mm:ss")
	@NotEmpty(message="A Hora deve ser Cadastrada")
	private Long id_time;
	
	@NotEmpty(message="O integrante deve ser  Cadastrado pelo Integrante")
	private Long idintegrante;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId_time() {
		return id_time;
	}

	public void setId_time(Long id_time) {
		this.id_time = id_time;
	}

	public Long getIdintegrante() {
		return idintegrante;
	}

	public void setIdintegrante(Long idintegrante) {
		this.idintegrante = idintegrante;
	}

	@Override
	public String toString() {
		return "Times [id_time=" + id_time + ", idintegrante=" + idintegrante + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idintegrante == null) ? 0 : idintegrante.hashCode());
		return result;
	}
	
}
