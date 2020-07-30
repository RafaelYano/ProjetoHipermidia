package Titans;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity

public class Comodo extends Detalhes {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6462520668266104058L;
	@Enumerated(EnumType.STRING)
	private ComodoEnum tipo;
	private int tamanhoM2;

}
