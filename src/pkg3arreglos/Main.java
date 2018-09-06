package pkg3arreglos;
public class Main {
    public static void main(String[] args) {
        //-------------Arreglo 1-------------
        String arreglo[] = new String [5];
        System.out.println("------------\nArreglo 1: ");
        arreglo[0] = "variable 1";
        arreglo[1] = "variable 2";
        arreglo[2] = "variable 3";
        arreglo[3] = "variable 4";
        arreglo[4] = "variable 5";
        for(int contador = 0; contador < arreglo.length; contador++){
            System.out.println(arreglo[contador]);
        }
        //-------------Arreglo 2-------------
        String arreglo2[] = {"Variable 1", "Variable 2", "Variable 3", "Variable 4", "Variable 5"};
        System.out.println("------------\nArreglo 2: ");
        for(int contador = 0; contador < arreglo2.length; contador++){
            System.out.println(arreglo2[contador]);
        }
        //-------------Arreglo 3-------------
        int arreglo3[] = {5,10,15,20,25};
        System.out.println("------------\nArreglo 3: ");
        for(int contador = 0; contador < arreglo3.length; contador++){
            System.out.println(arreglo3[contador]);
        }
        //-------------Arreglo Bidimencional-------------
        System.out.println("------------");
        int arreglo_bidimencional[][] = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},  
        };
        
        for(int contador = 0;
                contador < arreglo_bidimencional.length;
                contador++){
            for (int contador2 = 0;
                    contador2 < arreglo_bidimencional[0].length;
                    contador2 ++){
                System.out.println("Fila: " + contador + ", Columna: " + contador2 +
                        ", Valor: " + arreglo_bidimencional[contador][contador2]);
            }
        
        }

    }
}
