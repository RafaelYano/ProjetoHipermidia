package Titans;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity

public class Planeta extends Local {
	private static final long serialVersionUID = -4353031818264146201L;
	@Enumerated(EnumType.STRING)
	private HabitanteEnum habitantes;
	
	private float setor;
	@OneToMany
	private List <Nacao> nacoes = new ArrayList<>();
	
}
