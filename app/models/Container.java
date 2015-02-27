package models;

import models.config.ContainerConfig;
import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Docker Container
 *
 * User: k16wire
 * Date: 15. 2. 16.
 * Time: 오전 12:23
 */
@Entity
public class Container extends Model{
    @Id
    public Long id;
    public String name;
    public String uuid;
    public ContainerConfig containerConfig;

    @OneToMany(mappedBy = "container", cascade = CascadeType.ALL)
    public List<ImageContainer> imageContainerList;

    @OneToMany(mappedBy = "container", cascade = CascadeType.ALL)
    public List<WebappContainer> webserviceContainerList;
}
