package models;

import models.type.ResultCode;

/**
 * User: k16wire
 * Date: 15. 2. 27.
 * Time: 오후 6:56
 */
public class ExecuteResult {
    public ResultCode resultCode;

    public ExecuteResult(){
    }

    public ExecuteResult(ResultCode resultCode){
        this.resultCode = resultCode;
    }

    public static ExecuteResult ok(){
        return new ExecuteResult(ResultCode.OK);
    }

    public static ExecuteResult error(){
        return new ExecuteResult(ResultCode.ERROR);
    }
}
