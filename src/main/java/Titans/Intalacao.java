

package Titans;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Intalacao extends Detalhes {

	private static final long serialVersionUID = 4610939695174339784L;
	@Enumerated(EnumType.STRING)
	private IntalacaoEnum tipo;
	private boolean Moderno;
	
}
