package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * User: k16wire
 * Date: 15. 2. 16.
 * Time: 오전 12:36
 */
@Entity
public class ImageContainer extends Model{
    @Id
    public Long id;

    @ManyToOne
    public Image image;
    @ManyToOne
    public Container container;
}
