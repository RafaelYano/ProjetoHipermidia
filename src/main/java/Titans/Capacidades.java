package Titans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public abstract class Capacidades implements Serializable {
	
	private static final long serialVersionUID = -6335216162537286980L;
	@Id
	private String nome;
	private String descricao;
	
	
	
}
