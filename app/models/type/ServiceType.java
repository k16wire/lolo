package models.type;

/**
 * User: k16wire
 * Date: 15. 2. 16.
 * Time: 오전 12:06
 */
public enum ServiceType {
    WORDPRESS(1);

    private int value;

    ServiceType(int value){
        this.value = value;
    }
}
