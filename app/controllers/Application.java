package controllers;

import models.Webapp;
import play.mvc.*;

import views.html.*;

import static play.data.Form.form;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result newWebappForm(){
        return ok(views.html.newWebservice.render(form(Webapp.class)));
    }
}
