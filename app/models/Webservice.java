package models;

import models.type.ServiceType;
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
public class Webservice extends Model{
    @Id
    public Long id;
    public String name;
    public ServiceType serviceType;

    @OneToMany(mappedBy = "webservice", cascade = CascadeType.ALL)
    public List<WebserviceContainer> webserviceContainerList;

    @OneToMany(mappedBy = "webservice", cascade = CascadeType.ALL)
    public List<UserWebservice> userWebserviceList;
}
