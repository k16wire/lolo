package models.type;

/**
 * User: k16wire
 * Date: 15. 2. 16.
 * Time: 오전 12:06
 */
public enum WebappType {
    WORDPRESS(1l);

    private Long typeValue;

    WebappType(Long typeValue){
        this.typeValue = typeValue;
    }
}
