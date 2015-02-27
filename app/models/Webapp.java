package models;

import models.type.WebappType;
import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * User: k16wire
 * Date: 15. 2. 15.
 * Time: 오후 9:09
 */
@Entity
public class Webapp extends Model{
    @Id
    public Long id;
    public String name;
    public WebappType webappType;

    @OneToMany(mappedBy = "webapp", cascade = CascadeType.ALL)
    public List<WebappContainer> webappContainerList;
}
