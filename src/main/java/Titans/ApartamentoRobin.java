package Titans;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity

public class ApartamentoRobin extends Esconderijo {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1165653470654101878L;
	@OneToOne
	private Localizacao local;
		
}
