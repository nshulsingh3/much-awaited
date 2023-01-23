package tacos;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {

	private Long id;

	private Date createdAt;

	@NotNull
	@Size(min = 5, message = "Name must be 5 characters long")
	private String name;

	@NotNull(message = "ek ingredient toh add karo uncle")
	@Size(min = 1, message = "ek ingredient toh add karo uncle")
	private List<String> ingredients;

}
