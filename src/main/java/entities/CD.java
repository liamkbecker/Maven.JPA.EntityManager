package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CD {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany()
    private Set<Artist> artists = new HashSet<Artist>();

}
