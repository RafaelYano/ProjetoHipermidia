package Titans;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class CasaRachel extends Esconderijo{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7574046046448939044L;
	@OneToOne
	private Localizacao local;
}
