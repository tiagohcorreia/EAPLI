package util;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exemplo")
public class Exemplo {

    @Id
    private int id;
}