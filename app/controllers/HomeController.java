package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render());
    }

    public Result about(){
        return ok(about.render());
    }

    public Result tourDates(){
        return ok(tourDates.render());
    }

    public Result gallery(){
        return ok(gallery.render());
    }

    public Result videos(){
        return ok(videos.render());
    }

}
