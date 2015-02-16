package controllers;

import models.Webservice;
import play.mvc.Controller;
import play.mvc.Result;

import static play.data.Form.form;

/**
 * User: k16wire
 * Date: 15. 2. 15.
 * Time: 오후 9:09
 */
public class WebserviceApp extends Controller{
    public static Result newWebserviceForm(){
        return ok(views.html.newWebservice.render(form(Webservice.class)));
    }

    public static Result newWebservice() {
        return redirect(routes.Application.index());
    }
}
