package controllers;

import entities.Prestador;
import models.PrestadorModel;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;

public class PrestadorController {
    private PrestadorModel model;

    public PrestadorController(){
        this.model = PrestadorModel.getInstance();
    }

    public ModelAndView show(Request request, Response response){
        int id = new Integer(request.params("id"));
        Prestador provider = this.model.find(id);
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("provider", provider);
        ModelAndView view = new ModelAndView(params, "provider/show.hbs");
        return view;
    }

    public ModelAndView create(Request request, Response response){
        Map<String, Object> params = new HashMap<String, Object>();
        ModelAndView view = new ModelAndView(params, "provider/create.hbs");
        return view;
    }

    public ModelAndView save(Request request, Response response){
        Map<String, Object> params = new HashMap<String, Object>();
        ModelAndView view = new ModelAndView(params, "provider/show.hbs");
        return view;
    }

    public ModelAndView delete(Request request, Response response){
        Map<String, Object> params = new HashMap<String, Object>();
        ModelAndView view = new ModelAndView(params, "provider/showall.hbs");
        return view;
    }
}
