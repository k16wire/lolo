package models;

import models.config.UserWebserviceConfig;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * User: k16wire
 * Date: 15. 2. 16.
 * Time: 오전 1:02
 */
@Entity
public class UserWebservice extends Model{
    @Id
    public Long id;

    @ManyToOne
    public User user;
    @ManyToOne
    public Webservice webservice;
    @OneToOne
    public UserWebserviceConfig userWebserviceConfig;
}
