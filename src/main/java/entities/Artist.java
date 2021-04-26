package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Artist {

    @Id
    @GeneratedValue
    private long id;

    @OneToMany()
    private Set<CD> cds = new HashSet<CD>();

}
