package models;

import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * User: k16wire
 * Date: 15. 2. 16.
 * Time: 오전 1:00
 */
@Entity
public class User extends Model{
    @Id
    public Long id;
    public String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    public List<UserWebservice> userWebserviceList;
}
