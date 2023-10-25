/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emers
 */
public class Laboratorio10 {

    private static List<Camara> TelefonoCamara = new ArrayList<>();
    private static List<NavegadorDeInternet> TelefonoNavegador = new ArrayList<>();
    private static List<ReproductorDeMusica> TelefonoReproductor = new ArrayList<>();
    
    public static void main(String[] args) {
              
    }
    
    public static void agregarcamara(Camara flmable){
        TelefonoCamara.add(flmable);
    }
    
    public static void agregarreproductor(ReproductorDeMusica reproducible){
        TelefonoReproductor.add(reproducible);
    }
    
    public static void agregarNavegador(NavegadorDeInternet navegable){
        TelefonoNavegador.add(navegable);
    }
    
}
