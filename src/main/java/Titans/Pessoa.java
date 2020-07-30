package Titans;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity

public abstract class Pessoa implements Serializable{
	private static final long serialVersionUID = -5558888071423316966L;
	
	@Id
	private String nome;
	private int idade;
	private boolean vivo;
	
	@OneToMany
	private List<Habilidades> habilidade = new ArrayList<>();
	

}

//    @GeneratedValue(strategy = GenerationType.IDENTITY)