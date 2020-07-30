package Titans;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity

public class Super extends Pessoa {

	private static final long serialVersionUID = 5715272578848801430L;
	private String codinome;
	private Pessoa mentor;
	private boolean heroi;
	@ManyToMany
	private List<Capacidades> cap = new ArrayList<>();
	
	
}
