package Titans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public abstract class Habilidades implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3219912237516643177L;
	@Id
	@GeneratedValue
	private int codigo;
}
