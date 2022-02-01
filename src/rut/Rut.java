/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rut;

import javax.swing.JOptionPane;

/**
 *
 * @author pmaca
 */
public class Rut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
   
      Validar ver = new Validar();
       
       String rut;
       boolean val;
       boolean exit  = false;
       int opcion;
       String op; 
       boolean salir = false;
       
       do {
       rut = JOptionPane.showInputDialog("Ingresar el RUT de la persona"+"\n"+"FORMATO XXXXXXXX-X");
       ver.llamadorut(rut);
       ver.revisar(); 
       exit  = false;
       if (ver.revisar != true) {
        ver.validarRut(rut);
             if (ver.validacion != true) {
                 exit = true;


                }        
            }  
     
    

     

        } while (exit !=  false);     
     while(!salir){
          
          opcion = 0; 
          op = JOptionPane.showInputDialog("Ingrese numero de la Opcion\n"+"1.- Ingresar Clave\n"+ "2.- Validar Clave\n"+ "3.- Salir\n");
          opcion = Integer.parseInt(op); 
          
           
           
           
      switch(opcion){      
      case 1:
     
           
         String clave1 =  JOptionPane.showInputDialog("FORMATO \n"+ "-MAS DE 8 CARACTERES \n"+  "-INICIAR CON UNA MAYUSCULA \n"+ "-INGRESAR 2 NUMEROS \n"+"-INTERCALAR NUMEROS \n");
         ver.llamadoclave(clave1);
         ver.ingresoclave();
          
          
          
      break;
      case 2:
          
          String clave2 =  JOptionPane.showInputDialog("1.- Ingresar Clave\n");
          ver.llamadoclave(clave2);
          ver.revisarcalve();
          
          
            
          
          
      break;
      

  
       
       
         case 3:
             
         
                 
                  if (ver.Ingresoc == true && ver.validacionc == true){
                      
                      JOptionPane.showMessageDialog(null,"su calve es "+ ver.Clave );
                      
                  }
                  JOptionPane.showMessageDialog(null,"Gracias");
                  
                  
                  salir=true;
                   break;
    
                     
               default:
                  JOptionPane.showMessageDialog(null,"Solo números entre 1 y 3");      
                     
      }             
         }                    
       } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

} 

  
        
    
   

    

