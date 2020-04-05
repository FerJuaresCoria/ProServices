package models;

import entities.Prestador;

public class PrestadorModel {
    private static PrestadorModel instance;

    public static PrestadorModel getInstance() {
        if(instance == null){
            instance = new PrestadorModel();
        }
        return instance;
    }

    public boolean exist(int id){
        return true;
    }

    public Prestador find(int id){
        return new Prestador();
    }

    public void add(Prestador provider){

    }
}
