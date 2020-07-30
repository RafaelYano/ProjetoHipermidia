package Titans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public abstract class Local implements Serializable {
	
	private static final long serialVersionUID = -6128706136572221333L;
	@Id
	private String nome;
}
