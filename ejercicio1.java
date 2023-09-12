package examen;

public class ejercicio1 {
	
	public void sumareglos() {
		 int[] arreglo1 = {1, 2, 3, 4, 5};
	        int[] arreglo2 = {5, 4, 3, 2, 1};

	
	        if (arreglo1.length != arreglo2.length) {
	            System.out.println("Los arreglos deben tener el mismo tamaño.");
	            return;
	        }

	        int tamaño = arreglo1.length;

	        int[] resultado = new int[tamaño];

	
	        for (int i = 0; i < tamaño; i++) {
	            resultado[i] = arreglo1[i] + arreglo2[i];
	        }

	        System.out.println("Contenido del primer arreglo:");
	        mostrarArreglo(arreglo1);

	        System.out.println("\nContenido del segundo arreglo:");
	        mostrarArreglo(arreglo2);

	        System.out.println("\nContenido del arreglo resultante:");
	        mostrarArreglo(resultado);
	    }


	    public static void mostrarArreglo(int[] arreglo) {
	        for (int i = 0; i < arreglo.length; i++) {
	            System.out.print(arreglo[i] + " ");
	        }
	        System.out.println();
	    }
	
	}
	

