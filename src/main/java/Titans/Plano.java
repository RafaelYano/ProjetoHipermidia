package Titans;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity

public class Plano extends Local {

	private static final long serialVersionUID = -3576496162178959461L;
	private boolean fluxoTemporal;
	@OneToMany
	private List<Planeta>planetas = new ArrayList<>();
	
}
