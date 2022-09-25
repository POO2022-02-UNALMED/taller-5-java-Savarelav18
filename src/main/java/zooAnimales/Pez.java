package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Pez extends Animal{

    private static ArrayList<Pez> listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas){
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas=colorEscamas;
        this.cantidadAletas=cantidadAletas;
        Pez.listado.add(this);

    }
    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        super(nombre, edad, habitat, genero);
        this.colorEscamas=colorEscamas;
        this.cantidadAletas=cantidadAletas;
        Pez.listado.add(this);

    }

    public Pez(){Pez.listado.add(this);}

    public static int  cantidadPeces(){
        return Pez.listado.size();
    }
    @Override
    public String movimiento(){return "nadar";}

    public static Pez crearSalmon(String nombre,int edad,String genero){
        Pez salmon = new Pez(nombre,edad,"oceano",genero,"rojo",6);
        Pez.listado.add(salmon);
        Pez.salmones++;
        return salmon;
    }
    public static Pez crearBacalao(String nombre, int edad, String genero){
        Pez bacalao = new Pez(nombre,edad,"oceano",genero,"gris",6);
        Pez.listado.add(bacalao);
        Pez.bacalaos++;
        return bacalao;
    }

    public static ArrayList<Pez> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Pez> listado) {
        Pez.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}
