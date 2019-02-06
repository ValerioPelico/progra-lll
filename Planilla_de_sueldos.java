
package planilla_de_sueldos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Planilla_de_sueldos {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        JOptionPane.showMessageDialog(null,"planilla de sueldos");
        String nombre_empleado []= new String[10];// vector que permite ingresar el nombre del empleado 
            for(int i=0; i<10; i++){
            System.out.print((i+1)+") diguite el nombre: ");
            nombre_empleado[i]=entrada.next();
            }
            //for(int i=0;i<10;i++){
       // System.out.print("nombre:"+(i+1));
        //System.out.print(")"+nombre_empleado[i]);
        //System.out.println("");
        
        int sueldo_base [] = new int[10]; // vector que genera automaticamente el sueldo del empleado 
            for(int j=0;j<10;j++){
            sueldo_base[j]= (int)((Math.random()*2700)+2300); // se utilixa el math.ramdom para generar el sueldo del empeleado de forma automatica
            }
        int total_deducciones [] = new int[10];// vector que auntomaticamento 
            for(int i=0; i<10; i++){
            total_deducciones[i]= (int)((Math.random()*500)+100);
            
            }
        int total_percepciones[] =new int[10];
            for(int i=0; i<10; i++){
             total_percepciones[i]=(int)((Math.random()*250)+100);
             }
        
        int sueldo_liquido[] = new int[10];   // vector que calcula el sueldo a recibir
          for(int j=0;j<10;j++){ int a=sueldo_base[j];
            int b=total_deducciones[j];
            int c= total_percepciones[j];
            int d=a-b;
            int e=d+c;
             
            sueldo_liquido[j]=e;
          }
    
        int departamento []=new int[10];
            for(int i=0; i<10; i++){
                departamento[i]=(int)(Math.random()*4+1);
            
            }
        //int total_departamento[] = new int[10];
        
         System.out.println("nombre:   "    +"sueldo base:   "     +"total_deducciones   "        +"total percepciones   "          +"salario liquido   "              +"departamento");
         for(int i=0; i<10; i++){
         System.out.println(""+nombre_empleado[i]+"       "+sueldo_base[i]+"                 "      +total_deducciones[i]+"                 "      +total_percepciones[i]+"              "     +sueldo_liquido[i]+"                "+departamento[i]);  
            
                
                
       
   }
    }
}

        
    
    


