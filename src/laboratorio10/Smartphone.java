/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio10;

/**
 *
 * @author emers
 */
public class Smartphone implements Camara, NavegadorDeInternet, ReproductorDeMusica{
  
  public Smartphone(String Marca, String Modelo){
      
  }
  
  public String Marca;
  public String Modelo;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    
    @Override
    public void TomarFoto() {
        
    }
    
    @Override
    public void GrabarVideo() {
        
    }
    
    
    @Override
    public void Actualizar() {
        
    }
    
     @Override
    public void Buscar() {
        
    }
    
    @Override
    public void Detener() {
        
    }
    
     @Override
    public void Reproducir() {
        
    }
}
