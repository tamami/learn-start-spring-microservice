package lab.aikibo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by tamami on 22/06/17.
 */
@Entity
@Data
public class Customer {

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Customer() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

}
