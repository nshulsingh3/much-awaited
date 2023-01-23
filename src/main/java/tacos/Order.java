package tacos;

import java.util.Date;

import org.hibernate.validator.constraints.CreditCardNumber;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class Order {

	private long id;

	private Date placedAt;

	@NotBlank(message = "required")
	private String name;

	@NotBlank(message = "required")
	private String street;

	@NotBlank(message = "required")
	private String city;

	@NotBlank(message = "required")
	private String state;

	@NotBlank(message = "required")
	private String zip;

	@CreditCardNumber
	private String ccNumber;

	@Pattern(regexp = "^(0[1-9]|[0-2])(\\/)([1-9][0-9])$", message = "must be MM/YY")
	private String ccExpiration;

	@Digits(integer = 3, fraction = 0, message = "Invalid")
	private String ccCVV;
}
