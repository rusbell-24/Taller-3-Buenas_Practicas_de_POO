package sofka.musicplayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * La clase SortBy es una clase que tiene herencia de SongsLibrary, donde se
 * encuentra la libreria
 * de musica, esta clase fue creada para ordenar de diversas formas la musica
 * que se le entregue.
 * Usando este clase se puede:
 * - Organizar por orden alfabetico de los nombres de las canciones
 * - Organizar por orden alfabetico de los generos de las canciones
 * - Organizar por orden de duracion de la cancion
 * - Organizar por año de creacion de la cancion
 *
 * @author Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version 1.0.0 08-05-2023
 * @since 1.0.0
 */
public class SortBy extends SongsLibrary implements IMusicPlayer {

    /**
     * ArrayList de dimension 2, servira como recipiente dinamico para
     * efectuar la reorganizacion que solicite el usuario, como su nombre
     * lo indica es la libreria de canciones que se mostrara al usuario
     * dependiendo de sus requerimientos
     */
    List<ArrayList<String>> libraryToShow = new ArrayList<>();

    /**
     * Esta serie de metodos cumple la misma funcion, que es llenar el recipiente de
     * libraryToShow con
     * la libreria que se necesite en cada proceso
     * Metodos:
     * - setLibraryToShowToSongList: Llena el @param libraryToShow con la lista de
     * canciones general @param Songlist
     * - setLibraryToShowToSalsa: Llena el @param libraryToShow con la lista de
     * canciones de salsa @param Salsa
     * - setLibraryToShowToRock: Llena el @param libraryToShow con la lista de
     * canciones de rock en esp @param rockEnEspañol
     * - setLibraryToShowToUrbano: Llena el @param libraryToShow con la lista de
     * canciones de @param urbanoLatino
     */
    public void setLibraryToShowToSongList() {
        this.libraryToShow = getSongList();
    }

    public void setLibraryToShowToSalsa() {
        this.libraryToShow = salsa;
    }

    public void setLibraryToShowToRock() {
        this.libraryToShow = rockEnEspañol;
    }

    public void setLibraryToShowToUrbano() {
        this.libraryToShow = urbanoLatino;
    }

    public void setLibraryToShowToYear() {
        this.libraryToShow = year;
    }

    /**
     * Esta serie de metodos le dice al metodo ascendentSort() que tipo de orden
     * debe darle
     * a la musica que recibe, esto lo hace cambiando el @param a int.
     *
     * * @param a int = Variable para definir que deseas organizar
     * * setToAlphabeticGenders -> a = 1 - para organizar alfabeticamente por
     * nombres
     * * setToAlphabeticGenders -> a = 2 - Organizar por orden alfabetico los
     * generos
     * * setToSongDuration -> a = 5 - Para organizar por orden de duracion de la
     * cancion
     * * setToYear -> a = 6 - Para organizar por año de creacion de la cancion
     */
    public void setToAlphabeticNames() {
        this.a = 1;
    }

    public void setToAlphabeticGenders() {
        this.a = 2;
    }

    public void setToSongDuration() {
        this.a = 5;
    }

    public void setToYear() {
        this.a = 6;
    }

    public int a = 5;

    /**
     * Este metodo organiza en orden ascendente el ArrayList de segunda dimension
     * que se le entregue
     * Recibe en este caso libraryToShow y lo retorna organizado segun lo que se le
     * pida con el @param a int
     *
     *
     * ex: List<ArrayList<String>> listaDeNombres = [[ "4", "Alberto"],
     * [ "3", "Justin"],
     * [ "1", "Sebastian"],
     * [ "2", "Karina"]]
     *
     * Aplicando el metodo ascendenSort() a --> listaDeNombres organizando por orden
     * numerico:
     * listaDeNombres = [[ "1", "Sebastian"],
     * [ "2", "Karina"],
     * [ "3", "Justin"],
     * [ "4", "Alberto"]]
     *
     *
     * @return libraryToShow ArrayList de 2D, usando el ciclo for de la linea 121
     *         imprime todas las lineas
     *         de libraryToShow organizado bajo peticion.
     *
     * @since 1.0.0
     */
    public void ascendentSort() {
        Collections.sort(libraryToShow, new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return o1.get(a).compareTo(o2.get(a));
            }
        });
    }

    /**
     * Este metodo organiza en orden descendente el ArrayList de segunda dimension
     * que se le entregue
     * Recibe en este caso libraryToShow y lo retorna organizado segun lo que se le
     * pida con el @param a int
     *
     *
     * ex: List<ArrayList<String>> listaDeNombres = [[ "4", "Alberto"],
     * [ "3", "Justin"],
     * [ "1", "Sebastian"],
     * [ "2", "Karina"]]
     *
     * Aplicando el metodo descendenSort() a --> listaDeNombres organizando por
     * orden numerico:
     * listaDeNombres = [[ "4", "Alberto"],
     * [ "3", "Justin"],
     * [ "2", "Karina"],
     * [ "1", "Sebastian"]]
     *
     *
     * @return libraryToShow ArrayList de 2D, usando el ciclo for de la linea 121
     *         imprime todas las lineas
     *         de libraryToShow organizado bajo peticion.
     *
     * @since
     *
     *
     *
     *
     */
    public void descendentSort() {
        Collections.sort(libraryToShow, new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {

                return o2.get(a).compareTo(o1.get(a));
            }
        });
    }

    /**
     * Se crean ArrayLists por cada genero para que el siguiente metodo pueda llenar
     * cada ArrayList
     * con las canciones correspondientes a cada genero
     * Para este caso se usaran 3 generos musicales:
     */
    List<ArrayList<String>> rockEnEspañol = new ArrayList<>();
    List<ArrayList<String>> salsa = new ArrayList<>();
    List<ArrayList<String>> urbanoLatino = new ArrayList<>();
    List<ArrayList<String>> year = new ArrayList<>();

    /**
     * El metodo sortBtGender recorre toda la libreria principal, mientras la
     * recorre se usa un
     * switch case para que cada vez que encuentre un determinado genero
     * automaticamente lo añada a
     * el ArrayList del genero respectivo.
     *
     * Este metodo se usa para que el usuario no tenga que añadir manualmente todas
     * las canciones de
     * un genero a una playlist sino que con un click ya pueda reproducir todas las
     * canciones de un
     * determinado genero
     *
     * List<ArrayList<String>> urbanoLatino, salsa, rockEnEspañol. Devuelve
     * la lista de Arrays
     * llena con las canciones correspondientes. Este metodo solo llena la
     * lista, no muestra nada
     *
     * @since 1.0.0
     */
    public void sortByGender() {

        for (int i = 0; i < libraryToShow.size(); i++) {
            switch (libraryToShow.get(i).get(2)) {
                case "Rock En Español":
                    rockEnEspañol.add(libraryToShow.get(i));
                    break;
                case "Salsa":
                    salsa.add(libraryToShow.get(i));
                    break;
                case "Urbano latino":
                    urbanoLatino.add(libraryToShow.get(i));
                    break;
            }
        }
    }

    /**
     * Este metodo filtra por un año en especifico la biblioteca de canciones ya
     * ordenada por
     * algun criterio.
     *
     * El usuario debera ingresa inicialmente el metodo de ordenamiento, y
     * finalmente
     * debera ingresar el año por el que desea filtrar y reproducir.
     *
     * List<ArrayList<String>> year.
     * llena con las canciones correspondientes el array segun el año ingresado,
     * si encuentra alguna cancion de dicho año las reproduce, de lo contrario
     * imprime un mensaje donde se especifica que no se encontro el año buscado.
     *
     * @since 1.0.0
     */
    public void filterByYear(String yearSearch) {
        String date = "";

        for (int i = 0; i < libraryToShow.size(); i++) {
            date = libraryToShow.get(i).get(6);
            if (date.substring(0, 4).equals(yearSearch)) {
                year.add(libraryToShow.get(i));
            }
        }
        if (year.size() > 0) {
            setLibraryToShowToYear();
            playSongList();
        } else {
            System.out.println("No se encontro el año a reproducir .......");
        }

    }

    /**
     * Metodo Getter para solicitar la informacion contenida en libraryToShow
     * 
     * @return libraryToShow List<ArrayList<String>>. recordemos que esta es la
     *         libreria dinamica
     *         que va cambiando conforme a los deseos y requerimientos del usuario
     *
     * @since 1.0.0
     */
    public List<ArrayList<String>> getCustomSongList() {
        return libraryToShow;
    }

    /**
     * Metodo Setter para modificar la informacion contenida en libraryToShow
     *
     * @since
     */
    public void setLibraryToShow(List<ArrayList<String>> libraryToShow) {
        this.libraryToShow = libraryToShow;
    }

    /**
     * Sobreescritura necesaria al heredar de la clase abstracta SongsLibrary.
     *
     * Se utiliza un ciclo for para que recorra libraryToShow y reproduzca cada
     * cancion contenida
     * en nuestra biblioteca dinamica.
     * Se implementa un try catch para que la cancion solo dure 15 segundos por
     * versatilidad del
     * proyecto.
     *
     * @since 1.0.0
     */
    @Override
    public void playSongList() {
        for (int i = 0; i < libraryToShow.size(); i++) {
            System.out.println("Reproduciendo..." + libraryToShow.get(i));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
