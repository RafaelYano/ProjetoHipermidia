package Titans;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity

public class Fisico extends Habilidades {
	/**
	 * 
	 */
	private static final long serialVersionUID = 624042918213640435L;
	@Enumerated(EnumType.STRING)
	private HabFisEnum habilidadesFisicas;

	
}
