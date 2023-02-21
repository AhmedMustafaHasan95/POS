package POS;

import lombok.Data;
import lombok.Value;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class POSCustomer extends POSBaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date birthDate;
}
