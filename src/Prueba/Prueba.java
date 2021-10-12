package Prueba;

import Prueba.entidades.Usuario;
import Prueba.enumeraciones.Raza;
import Prueba.enumeraciones.SexoHumano;

/**
 *
 * @author d.andresperalta
 */
public class Prueba {

    public static void main(String[] args) {

        String razaInput = "BEAGLE";

        for (Raza aux : Raza.values()) {        //Recorrer un enum.

            System.out.println(aux);

            if (aux.toString().equals(razaInput)) {     //Debo transformar aux a String con toString para comparar.

                System.out.println("SI.");

            }

        }

        Usuario u = new Usuario();      //Instancio un objeto y seteo sus atributos, entre ellos los atributos de tipo Raza y SexoHumano mediante enum.

        u.setNombre("Andrés.");

        u.setApellido("Peralta.");

        u.setRaza(Raza.BEAGLE);

        u.setSexo(SexoHumano.HOMBRE);

        System.out.println(u);
        
        System.out.println(Raza.BEAGLE.getValor());     //Accedo al valor del enum.

    }

}
