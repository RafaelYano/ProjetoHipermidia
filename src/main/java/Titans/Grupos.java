package Titans;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity

public class Grupos implements Serializable {
	private static final long serialVersionUID = -6344389774423774142L;
	@Id
	private String nome;
	private String objetivo;
	@OneToMany
	private List<Item> itens = new ArrayList<>();
	@ManyToMany
	private List<Super> membros = new ArrayList<>();
	@OneToMany
	private List<Esconderijo> esconderijos = new ArrayList<>();
	
}
