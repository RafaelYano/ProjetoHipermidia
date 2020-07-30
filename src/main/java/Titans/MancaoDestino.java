package Titans;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class MancaoDestino extends Esconderijo {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3085357823371757197L;
	@OneToOne
	private Localizacao local;
}
