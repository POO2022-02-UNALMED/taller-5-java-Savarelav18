package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave>listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas){
        super(nombre,edad,habitat,genero,zona);
        this.colorPlumas=colorPlumas;
        Ave.listado.add(this);
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre,edad,habitat,genero);
        this.colorPlumas=colorPlumas;
        Ave.listado.add(this);
    }

    public Ave(){Ave.listado.add(this);}

    public static int cantidadAves(){
        if(Ave.listado!=null)
            return Ave.listado.size();
        else {
            return 0;
        }
    }
    @Override
    public String movimiento(){return "volar";}

    public static Ave crearHalcon(String nombre,int edad,String genero){
        Ave halcon = new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
        Ave.listado.add(halcon);
        Ave.halcones++;
        return halcon;
    }
    public static Ave crearAguila(String nombre, int edad,String genero){
        Ave aguila=new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
        Ave.listado.add(aguila);
        Ave.aguilas++;
        return aguila;
    }

    public static ArrayList<Ave> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}
