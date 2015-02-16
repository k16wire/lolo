package models;

import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Docker Image
 *
 * User: k16wire
 * Date: 15. 2. 15.
 * Time: 오후 10:32
 */
@Entity
public class Image extends Model {
    @Id
    public Long id;
    public String name;
    public String uuid;

    @OneToMany(mappedBy = "image", cascade = CascadeType.ALL)
    public List<ImageContainer> imageContainerList;
}
