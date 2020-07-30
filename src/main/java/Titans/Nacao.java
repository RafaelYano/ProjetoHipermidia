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
public class Nacao extends Local {
	private static final long serialVersionUID = -3376628695834110770L;
	private double longitude;
	private double latitude;
	@OneToMany
	private List<Pessoa>cidadao = new ArrayList<>();
	

}
