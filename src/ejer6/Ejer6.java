
package ejer6;

import javax.swing.JOptionPane;

public class Ejer6 {

    public static void main(String[] args) {
        int opcion, n_alumnos;
        int k=0;
        String z;
        
        n_alumnos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número total de alumnos: "));
        
        String nombres[] = new String[n_alumnos];
        int codigo[] = new int[n_alumnos];
        
        do{
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU"+
                    "\n1. Ingreso de nombres y códigos"+
                    "\n2. Ordenar nombres."+
                    "\n3. Mostrar Nombres y códigos."+
                    "\n4. Buscar por nombres."+
                    "\n5. Salir."));
            
            switch(opcion){
                
                case 1:
                    
                    for (int i=0 ; i<n_alumnos ; i++){
                        
                        nombres[i]=(JOptionPane.showInputDialog( (i+1) + ". Digite el nombre del alumno: "));
                        
                        for (int j=0 ; j<n_alumnos ; j++){
                            
                            if(j==k){
                                
                                codigo[j]=Integer.parseInt(JOptionPane.showInputDialog( (j+1) + ". Digite el código del alumno: "));
                            }  
                        }
                        k++;
                    }
                                   
                    break;
                    
                case 2:
                    
                    for (int i = 0 ; i<nombres.length ; i++){ // para que sea ordenado alfabeticamente
                        
                        for (int j = 0 ; j<nombres.length && i != j ; j++){ // i distinto de j para que no se compare la misma posicion consigo misma
                            
                            if ( nombres[i].compareToIgnoreCase(nombres[j]) < 0 ){ // arregloi < arreglo j para que palabra en la posicion  i sea antes que la posicion j
                                String aux = nombres[i];
                                nombres[i] = nombres[j];
                                nombres[j] = aux;
                            }
                              
                        }
                    }
                    
                    System.out.println("");
                    for(int i = 0 ; i<nombres.length ; i++ ){
                                
                                System.out.println((i+1) +". "+ nombres[i]);
                               
                    }
                    
                    break;
                    
                case 3:
                    System.out.println("");
                    
                    for (int i=0 ; i<n_alumnos ; i++){
                        System.out.println((i+1)+". "+nombres[i]+" --> "+codigo[i]);
                    }
                    
                    break;
                    
                case 4:
                    
                    z = JOptionPane.showInputDialog("Digite el nombre del alumno buscado: ");
                    
                    for (int i=0 ; i<n_alumnos ; i++){
                        
                        if( nombres[i].equals(z) ){ // la funcion equals = compara un arreglo con una variable
                            
                            JOptionPane.showMessageDialog(null,"El nombre está registrado"+
                                    "\nNombre --> "+ nombres[i]+
                                    "\nCódigo -->"+ codigo[i]);
                            
                        }  
                    }
                    
                    break;
                case 5:JOptionPane.showMessageDialog(null, "FIN DEL MENU...");
                
            }
              
        }while(opcion != 5);
    }
    
}
