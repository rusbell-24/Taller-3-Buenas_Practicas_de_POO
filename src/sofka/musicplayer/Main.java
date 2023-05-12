package sofka.musicplayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * En la clase Main se contruye toda la interfaz con la que el usuario va a interactuar
 * con la biblioteca y el reproductor de musica, tambien se contruye aqui la parte trasera
 * del sistema donde se indica que accion se tomara cuando el usuario solicite una determinada
 * funcion.
 *
 * ex:  Interfaz de consola que permite al Usuario seleccionar X,Y y Z funciones:
 *          Si Usuario selecciona funcion X {
 *                      Por favor sistema invoca la clase W y su metodo X }
 *          Si Usuario selecciona funcion Y {
 *                       Por favor sistema invoca la clase Q y su metodo Y }
 *          Etc...
 *
 * @version 1.0.0 11-05-2023
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 *
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args){
        menu();
    }

    public static void menu(){
        /**
         * @param firstLevelOptions,secondLevelOptions,thirdLevelOptions Strings
         * Se crean variables que se usaran en el mecanismo de menus que se le mostrara al Usuario.
         * Tenemos dos submenus por lo que se creo una variable para cada nivel de profundidad de menu
         * En cada nivel se utiliza su determinada variable para realizar una determinada accion ya sea
         * con un if else o con un switch case
         *
         * ex:  Menu principal:
         *          if firstLevelOptions = 1 {
         *                  Muestre Segundo Menu:
         *                          if secondLevelOptions = 1 {
         *                                  Muestre Tercer Menu:
         *                                      - opcion 1
         *                                      - opcion 2
         *                                      - etc..
         *                           }
         *          }
         *          if firstLevelOptions = 2 {
         *                  boolean exit = True;
         *                  Salga del sistema;
         *          }
         *
         * @param exit boolean
         * Se utilizo una lista de ArrayList dinamica, dinamicArray, para poder lograr versatilidad
         * entre las funciones del menu y los metodos de diferentes clases
         *
         * @param userData
         * Variable para guardar la respuesta del Usuario a un dado menu
         */
        String firstLevelOptions;
        String secondLevelOptions;
        String thirdLevelOptions;
        boolean exit = false;
        List<ArrayList<String>> dinamicArray = new ArrayList<>();
        PlaylistStore savePlaylist = new PlaylistStore();

        Scanner userData = new Scanner(System.in);

        /**
         * Se utiliza un Do para crear el ciclo de interfaz grafica para el Usuario e ingresar al
         * primer menu o menu principal
         */

        do{
            System.out.println("Bienvenido a nuestro reproductor de musica \n");
            System.out.println("-----------------MENU---------------\n");
            System.out.println("1. Ver biblioteca");
            System.out.println("2. Reproducir Biblioteca");
            System.out.println("3. Ordenar canciones");
            System.out.println("4. Ver mis Playlist");
            System.out.println("5. Crear Playlist");
            System.out.println("6. Salir\n");


            System.out.println("Ingrese su opción: ");
            /**
             * Se registra la respuesta del Usuario al menu principal
             * Se crea un objeto seeLibrary de la clase sortBy que nos ayudara a organizar las canciones
             * Se utiliza un if para evaluar cual fue la repsuesta del usuario e iniciar una determinada
             * cadena de acciones.
             */
            firstLevelOptions = userData.next();

            SortBy seeLibrary = new SortBy();

            dinamicArray = seeLibrary.getSongList();

            if (firstLevelOptions.equals("1")) {
                /**
                 * 1. Ver biblioteca
                 */
                seeLibrary.setLibraryToShowToSongList();
                for (ArrayList song : seeLibrary.getSongList()) {
                    System.out.println(song);
                }
            }
            else if (firstLevelOptions.equals("2")) {

                /**
                 * 2. Reproducir Biblioteca
                 */
                seeLibrary.setLibraryToShowToSongList();
                seeLibrary.playSongList();
            }
            else if (firstLevelOptions.equals("3")) {
                /**
                 * 3. Ordenar canciones e ingresar al segundo menu
                 *
                 */
                seeLibrary.setLibraryToShowToSongList();

                System.out.println("_______Opciones______");
                System.out.println("1. Ordenar por generos");
                System.out.println(
                        "2. Ordenar alfabeticamente por nombre de cancion");
                System.out.println("3. Ordenar por duracion de cancion");
                System.out.println("4. Ordenar por año\n");
                System.out.println("Ingrese su opcion: ");
                secondLevelOptions = userData.next();
                switch (secondLevelOptions) {
                    case "1":
                        seeLibrary.setToAlphabeticGenders();
                        seeLibrary.sortByGender();
                        seeLibrary.ascendentSort();
                        dinamicArray = seeLibrary.getCustomSongList();
                        break;
                    case "2":
                        seeLibrary.setToAlphabeticNames();
                        seeLibrary.ascendentSort();
                        dinamicArray = seeLibrary.getCustomSongList();
                        break;
                    case "3":
                        seeLibrary.setToSongDuration();
                        seeLibrary.ascendentSort();
                        dinamicArray = seeLibrary.getCustomSongList();
                        break;
                    case "4":
                        seeLibrary.setToYear();
                        seeLibrary.ascendentSort();
                        dinamicArray = seeLibrary.getCustomSongList();
                        break;
                }
                System.out.println("----------Opciones---------");
                System.out.println("1.Reproducir Lista ordenada");
                System.out.println("2.Reproducir solo salsa");
                System.out.println("3.Reproducir solo Rock en español");
                System.out.println("4.Reproducir solo Urbano latino");
                System.out.println("5.Crear playlist");
                System.out.println("6.salir\n\n");

                System.out.println("Ingrese su opcion: ");
                secondLevelOptions = userData.next();

                /**
                 * Se utiliza un switch case para evaluar que acciones solicito el Usuario y que
                 * acciones debe tomar el Usuario en este segundo nivel
                 * Las acciones solicitadas aqui solo organizaran los datos, luego el usuario debe
                 * definir que accion se tomara con esas canciones organizadas.
                 */

                switch (secondLevelOptions) {
                    case "1":
                        seeLibrary.playSongList();
                        break;
                    case "2":
                        seeLibrary.sortByGender();
                        seeLibrary.setLibraryToShowToSalsa();
                        seeLibrary.playSongList();
                        break;
                    case "3":
                        seeLibrary.sortByGender();
                        seeLibrary.setLibraryToShowToRock();
                        seeLibrary.playSongList();
                        break;
                    case "4":
                        seeLibrary.sortByGender();
                        seeLibrary.setLibraryToShowToUrbano();
                        seeLibrary.playSongList();
                        break;
                    case "5":
                        firstLevelOptions = "5";
                        break;
                }
                System.out.println(firstLevelOptions);
            }else if (firstLevelOptions.equals("4")){
                if(savePlaylist.getStore().size() > 0){
                    for ( int i = 0; i < savePlaylist.getStore().size(); i++) {
                        System.out.println(
                                "Id: " + (i+1) +
                                        " nombre: " + savePlaylist.getStore().
                                        get(i).getPlaylistName());
                    }
                    do {
                        int idPlaylist;
                        playlistOptionsMenu();
                        secondLevelOptions = userData.next();
                        if (!secondLevelOptions.equals("3")) {
                            System.out.println("Ingrese id de la playlist: ");
                            idPlaylist = userData.nextInt();
                            switch (secondLevelOptions) {
                                case "1":
                                    showSongs(savePlaylist.getStore().
                                            get(idPlaylist - 1).
                                            getCustomSongList());
                                    break;
                                    case "2":
                                        savePlaylist.getStore().get(idPlaylist-1).
                                                playSongList();
                                        break;
                            }
                        }
                    }while (!secondLevelOptions.equals("3"));

                }else{
                    System.out.println("No tienes ninguna playlist Creada");
                }

            }if (firstLevelOptions.equals("5")) {
                String namePlayList;
                String idSong;
                boolean createPlayList = false;
                boolean finish = false;

                ArrayList<String> idSongs = new ArrayList<>();

                PlayList newPlayList = new PlayList();

                System.out.println("----Biblioteca General De Canciones-----");
                showSongs(dinamicArray);

                System.out.println("Nombre de la nueva playlist: ");
                namePlayList = userData.next();

                do {
                    System.out.println("Ingrese el id de la cancion a" +
                            " añadir o una letra para terminar: ");
                    idSong = userData.next();

                    if (idSong.matches("[+-]?\\d*(\\.\\d+)?")) {
                        idSongs.add(idSong);
                        createPlayList = true;
                    } else {
                        finish = true;
                    }

                } while (!finish);

                if (createPlayList) {
                    try {
                        newPlayList.addSongs(
                                namePlayList,
                                idSongs,
                                dinamicArray);

                        savePlaylist.setStore(newPlayList);
                        System.out.println("Has creado una playlist nueva....");

                        do {
                            playlistOptionsMenu();
                            thirdLevelOptions = userData.next();

                            switch (thirdLevelOptions) {
                                case "1":
                                    List<ArrayList<String>> seeSongs =
                                            newPlayList.getCustomSongList();

                                    System.out.println(
                                            "______Lista de reproduccion *** " +
                                            newPlayList.getPlaylistName() +
                                            "***_______");

                                    showSongs(seeSongs);
                                    System.out.println("Fin lista..........");
                                    break;
                                case "2":
                                    newPlayList.playSongList();
                                    break;

                            }
                        } while (!(thirdLevelOptions.equalsIgnoreCase("3")));

                    } catch (NullPointerException e) {
                        System.out.println(
                                "\nEstamos presentando inconvenientes con la" +
                                        " lista de Canciones:::::::::::::\n");

                        System.out.println("INTENTE EN OTRO MOMENTO::::::::\n");
                    }
                }else{
                    System.out.println(
                            "\nNo seleccionaste ninguna canción......\n\n");
                }
            }else if (firstLevelOptions.equals("6")) {
                System.out.println("Apagando reproductor de musica......");
                exit = true;
            }

        }while (!exit);
    }

    private static void playlistOptionsMenu(){
        System.out.println("_____Opciones de PlayList_____");
        System.out.println("1. Ver");
        System.out.println("2. Reproducir ");
        System.out.println("3. Salir\n\n");
        System.out.println("Que deseas hacer: ");
    }

    private static void showSongs(List<ArrayList<String>> songs){
        for (int i = 0; i < songs.size(); i++) {
            System.out.println(
                    "id: " + songs.get(i).get(0) +
                    " titulo: " + songs.get(i).get(1) +
                    " Genero: " + songs.get(i).get(2));
        }
    }
}

