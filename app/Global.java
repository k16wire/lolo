import play.GlobalSettings;
import play.Logger;
import play.mvc.Action;
import play.mvc.Http;

import java.lang.reflect.Method;

/**
 * User: k16wire
 * Date: 15. 2. 27.
 * Time: 오후 7:44
 */
public class Global extends GlobalSettings{

    @Override
    public Action onRequest(Http.Request request, Method method) {
        Logger.debug(request.path());
        return super.onRequest(request, method);
    }
}
