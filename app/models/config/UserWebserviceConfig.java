package models.config;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Environment config for User Webservice
 *
 * User: k16wire
 * Date: 15. 2. 16.
 * Time: 오전 1:14
 */
@Entity
public class UserWebserviceConfig extends Model{
    @Id
    public Long id;
}
