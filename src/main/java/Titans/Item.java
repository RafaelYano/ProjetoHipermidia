package Titans;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity

public class Item extends Capacidades {

	private static final long serialVersionUID = -6387246042614964303L;
	private boolean manuseavel;
	@ManyToOne
	private Poder poder;
}
