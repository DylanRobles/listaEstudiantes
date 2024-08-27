
package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.Estudiante;
import co.edu.konradlorenz.view.Ventana;
import java.util.ArrayList;

public class Control {
    
    protected Estudiante objest = new Estudiante();
    
    protected Ventana objven = new Ventana();
    
    private ArrayList<Estudiante> lista;

    public void setLista(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }
    
    
    
    public void run(){
        
        do{
        
        switch(objven.pedirEntero()){
            
          
            
            case 1:   
                
              
                System.out.println("ingrese el nombre");
        objest.setNombre(objven.pedirString());
         System.out.println("ingrese el codigo");
        objest.setCodigo(objven.pedirLong());
         System.out.println("ingrese la carrera");
        objest.setCarrera(objven.pedirString());

        lista.add(objest);
                
        
        break;
            case 2:
                int buscador3 = objven.pedirEntero();
                
           for(int i = 0; i>= lista.size(); i++)
                if(i== buscador3){
                    lista.get(i).getNombre();
                    lista.get(i).getCodigo();
                    lista.get(i).getCarrera();
                }
        break;
            case 3:
                System.out.println("Ingrese el numero del estudiante");
                int buscador = objven.pedirEntero();
                
           for(int i = 0; i>= lista.size(); i++)
                if(i== buscador){
                    lista.get(i).setNombre(objven.pedirString());
                    lista.get(i).setCodigo(objven.pedirLong());
                    lista.get(i).setCarrera(objven.pedirString());
                }
                
        break;
            case 4:
                int buscador2 = objven.pedirEntero();
                 for(int i = 0; i>= lista.size(); i++)
                if(i== buscador2){
                    lista.get(i).setNombre("");
                    lista.get(i).setCodigo(0);
                    lista.get(i).setCarrera("");
                }
                
        break;        
              
            case 5:
              System.exit(0);
        break;
        
            default:
                System.out.println("ingrese un numero valido entre 1 y 5");
                break;
        } 
        }while(objven.pedirEntero()!= 5);
           
    }


    
    
}
