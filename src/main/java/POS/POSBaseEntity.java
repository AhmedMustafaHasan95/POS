package POS;

import lombok.Data;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public abstract class POSBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Size(min = 5, max = 30, message = "Name must be 5 to 30 characters")
    private String name;
}
