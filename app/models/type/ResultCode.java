package models.type;

/**
 * User: k16wire
 * Date: 15. 2. 27.
 * Time: 오후 7:03
 */
public enum ResultCode {
    OK(1l),
    ERROR(2l);

    private Long typeValue;

    ResultCode(Long typeValue){
        this.typeValue = typeValue;
    }
}
