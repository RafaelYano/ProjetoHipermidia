package Titans;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity


public class Mental extends Habilidades {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5436835232342219583L;
	@Enumerated(EnumType.STRING)
	private HabMentEnum habilidadesMentais;
	
	
}
