package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * User: k16wire
 * Date: 15. 2. 16.
 * Time: 오전 12:31
 */
@Entity
public class WebappContainer extends Model{
    @Id
    public Long id;

    @ManyToOne
    public Webapp webapp;
    @ManyToOne
    public Container container;
}
