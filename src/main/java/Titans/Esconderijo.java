package Titans;
import java.util.ArrayList;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

import java.io.Serializable;

@Data
@Entity

public abstract class Esconderijo implements Serializable {
	private static final long serialVersionUID = 2084167439162050116L;
	@Id
	int codigo;
	@ManyToOne
	private Grupos dono;
	
	@ManyToMany
	private List<Detalhes>cosntruir = new ArrayList<>();
	
	
}
