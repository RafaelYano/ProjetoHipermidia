package Titans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public abstract class Detalhes implements Serializable {
	private static final long serialVersionUID = -5787153507185449489L;
	@Id
	@GeneratedValue
	private int codigo;
	
}
