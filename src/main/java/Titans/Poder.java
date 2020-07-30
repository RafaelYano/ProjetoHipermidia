package Titans;

import javax.persistence.Entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity

public class Poder extends Capacidades {
	private static final long serialVersionUID = 8831722731227587685L;
	
	private String origem;
	
	
}
