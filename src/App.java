
import java.util.Scanner;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new scanner(SystemMenuBar.in);
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

        int[] arreglo ={ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
        metodosBusqueda.printarreglo =new MetodosBusqueda();

        int posicion = metodosBusqueda.blusquedasecuencial(arreglo, 50)
        if (posicion != -1){
            System.out.println("El valor se encuentra en la posicion"+posicion);
        } else {
            system.out.println(x:"Valor no encontrado,error 404");
        }
    }
}
