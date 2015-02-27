package controllers;

import models.ExecuteResult;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import static play.data.Form.form;

/**
 * User: k16wire
 * Date: 15. 2. 15.
 * Time: 오후 9:09
 */
public class ApiApp extends Controller{
    public static Result newWebapp() {
        return ok(Json.toJson(ExecuteResult.ok()));
    }
}
