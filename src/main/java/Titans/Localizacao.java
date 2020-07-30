package Titans;

import javax.persistence.Entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity

public class Localizacao extends Detalhes {
	/**
	 * 
	 */
	private static final long serialVersionUID = -97241094029003784L;
	@Enumerated(EnumType.STRING)
	private LocalizacaoEnum localizacao;
	@ManyToOne
	private Nacao pais;
}
