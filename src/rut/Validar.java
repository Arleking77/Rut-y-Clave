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
public class Validar {
    
    String rut;
    boolean revisar;
    boolean validacion; 
     String Clave;
    String Claveaux;
    boolean Ingresoc;
    boolean validacionc; 
    
    
    public Validar(String rut, boolean revisar, boolean validacion,String Clave, boolean Ingresoc, boolean validacionc,String Claveaux ){
        this.rut="";
        this.revisar=true;
        this.validacion = false;
        this.Clave="";
        this.Ingresoc=false;
        this.validacionc = false;
        this.Claveaux="";
    }

    Validar() {
        
    }
    
    
     public void llamadorut(String Rut) {
         
         this.rut=Rut;
        
         
         
     }
     
    public void llamadoclave (String aux) {
         
         this.Claveaux=aux;
        
         
         
     }
       
    
   public boolean revisar(){    
   
     
    if ( rut.length() == 0 ){ revisar = false; JOptionPane.showMessageDialog(null, "El rut no tiene caracteres ");}
    if ( rut.length() < 8 ){  revisar = false; JOptionPane.showMessageDialog(null, "El rut tiene muy pocos caracteres");}
    if ( rut.length() > 10 ){ revisar = false; JOptionPane.showMessageDialog(null, "El rut tiene demasiados caracteres ");; }
    if ( rut.length() > 3 ){
    int tamaño = this.rut.length() -3;
     
    for(int i = tamaño; i >= 0; i--) { 
        char caracter = rut.charAt(i);
        int Ascii = (int)caracter;
        if ((Ascii < 48 || Ascii > 57)){
                   revisar = false;
                } 
        }
    int Guion = this.rut.length() -2;
    char caracter2 = rut.charAt(Guion);
   int valorAscii = (int)caracter2;
    if ((valorAscii < 45 || valorAscii > 45)){
               revisar = false;      
  }
    }else {
        revisar = false;
    }
    
    return revisar;
  



}

   
  public boolean validarRut(String rut){
     
    
        rut =  rut.toUpperCase(); 
        rut = rut.replace("-", "");
        int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
        char dv = rut.charAt(rut.length() - 1);

       int m = 0, s = 1;
       for (; rutAux != 0; rutAux /= 10) {
        s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
       }
       
       if (dv == (char) (s != 0 ? s + 47 : 75)) {
        JOptionPane.showMessageDialog(null, "El rut es correcto ");
        validacion = true;
    }else {
         
         JOptionPane.showMessageDialog(null, "El rut esta mal escrito "); 
         validacion = false;
       }
       
   
      return validacion;
      
      



 }


   
   
   
   
   
   
   
     public boolean ingresoclave(){
          
       boolean  ac = false;    
       boolean  bc = false;    
       boolean  cc = false;
       boolean otroc = true;
       int numc = 0;
       int dec = 0;
       
       int tamaño = this.Claveaux.length();
       if ( tamaño > 7 ){ 
          ac = true;
          }else {JOptionPane.showMessageDialog(null, "SE NECESITA QUE TENGA MAS CARACTERES");
       }
       char  charclave [] = this.Claveaux.toCharArray();
       int primeral = (int) charclave[0];            
       
        if ( primeral  >= 65 && primeral <= 90 ){ 
          bc = true;
          }else {JOptionPane.showMessageDialog(null, "LA CLAVE DEBE PARTIR CON MAYUSCULA");
       }
        
      for(int i = 0; i < tamaño; i++) { 
        int revisanum = (int) charclave[i];
         if ((revisanum >= 48 && revisanum <= 57)){
             dec = 0;
             dec = i + 1;
             numc = numc + 1 ;
             if (dec < tamaño){
            char perrc = charclave[dec]; 
             int  acus = (int) perrc; 
              if (acus >= 48 && acus <= 57){
                otroc = false;
                
         }   
         }
         }         
        }
         if ( otroc == false ){JOptionPane.showMessageDialog(null, "RECORDAR INTERCALAR LOS NUMEROS");}       
         if ( numc <= 1 || numc >= 3 ){JOptionPane.showMessageDialog(null, "RECORDAR QUE SON 2 NUMEROS LOS QUE DEBE INGRESAR ");}
         
         
         if ( numc == 2 && otroc == true){ 
             
             cc = true;
          }     
   
         if ( ac == true && bc == true && cc == true){ 
          
          this.Ingresoc = true;
          this.Clave = this.Claveaux;
          JOptionPane.showMessageDialog(null, "CLAVE INGRESADA EXITOSAMENTE");
       }  
       
       
          return Ingresoc;
        

       }
 
      
      
      
           
      
     public boolean revisarcalve(){
          
   
  
    
    if (this.Ingresoc == true){
    if (this.Clave.equals(this.Claveaux) ){
        
               validacionc = true;
               JOptionPane.showMessageDialog(null, "VALIDACION EXITOSA");
  } else {JOptionPane.showMessageDialog(null, "CLAVE MAL INGRESADA");
        
    }
    }else{JOptionPane.showMessageDialog(null, "NO POSEE CLAVE PARA VALIDAR");
        
    }
      
     
         
         
         
         
         
        
          return validacionc;
      
}
}