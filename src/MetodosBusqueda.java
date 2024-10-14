public class MetodosBusqueda {
    public int busquedasecuencial(int[] arreglo, int[] valorbuscado)
        int pos =-1;
        for (int i =0; i < arreglo.length; i++)
            if(arreglo[i] == valorBuscado){
            pos = i;
            }
        }
        return-1;
    }
    public void printarreglo(int[] arreglo){
        for(int elem : arreglo){
            System.out.println(elem + "");
            
        }
    }

    public int busquedabinaria(int[] arr, int value)
        int inicio = 0;
        int fin = arr.length -1;

        while (inicio <= fin) {
            int medio= inicio +(fin - inicio) / 2;
            if (arr[medio] == value){
                return medio;
            }
            if(arr[medio]< value){
                inicio = medio +1; //buscar en el medio de la derecha
            } else {
                //buscar el mitad de la izquierda
                fin=medio-1;
            }
        }
        return -1;
    }  
}


