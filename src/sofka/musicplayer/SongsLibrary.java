package sofka.musicplayer;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase abstracta ofrece una biblioteca de canciones, construida
 * mediante un array de 15 arrays internos, cada array interno representa una
 * canción y cada canción tiene la siguiente estructura de atributos:
 * [Id, titulo, genero, caratula, descripción, duración, fecha].
 * <p>
 * Finalmente, cada clase hija de esta clase abstracta tendrá acceso a la
 * librería de canciones mediante el método getSongList() y además, deberá
 * implementar el método playSongList()
 *
 * @author : Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version : 1.0.0 08-05-2023
 * @since 1.0.0
 */
public abstract class SongsLibrary{

    /**
     * Array que contiene la biblioteca de canciones
     */
    private final List<ArrayList<String>> songList = new ArrayList<>();

    /**
     * Constructor para el array de 15 canciones
     */
    public SongsLibrary (){
        ArrayList<String> song1 = new ArrayList<>();
        ArrayList<String> song2 = new ArrayList<>();
        ArrayList<String> song3 = new ArrayList<>();
        ArrayList<String> song4 = new ArrayList<>();
        ArrayList<String> song5 = new ArrayList<>();
        ArrayList<String> song6 = new ArrayList<>();
        ArrayList<String> song7 = new ArrayList<>();
        ArrayList<String> song8 = new ArrayList<>();
        ArrayList<String> song9 = new ArrayList<>();
        ArrayList<String> song10 = new ArrayList<>();
        ArrayList<String> song11 = new ArrayList<>();
        ArrayList<String> song12 = new ArrayList<>();
        ArrayList<String> song13 = new ArrayList<>();
        ArrayList<String> song14 = new ArrayList<>();
        ArrayList<String> song15 = new ArrayList<>();

        song1.add("1");
        song1.add("Lo que pasó, pasó");
        song1.add("Urbano latino");
        song1.add("https://en.wikipedia.org/wiki/Lo_Que_Pas%C3%B3,_Pas%C3%B3#/media/File:LoQuePasoPaso2004.png");
        song1.add("Reggaetón clásico de Daddy Yankee con su album Barrio Fino");
        song1.add("4.28");
        song1.add("2006.11.21");

        song2.add("2");
        song2.add("Una Aventura");
        song2.add("Salsa");
        song2.add("https://bit.ly/3Lht9SM");
        song2.add("Salsa clásica del Grupo Niche");
        song2.add("6.00");
        song2.add("2010.03.25");

        song3.add("3");
        song3.add("De Musica Ligera");
        song3.add("Rock En Español");
        song3.add("https://bit.ly/3OylTE9");
        song3.add("Rock en español de la agrupación Soda Stereo");
        song3.add("4.49");
        song3.add("2012.03.20");

        song4.add("4");
        song4.add("Donde estés llegaré");
        song4.add("Urbano latino");
        song4.add("https://bit.ly/3LeX7qq");
        song4.add("Reggaeton clásico");
        song4.add("3.49");
        song4.add("2011.11.06");

        song5.add("5");
        song5.add("Pensando En Ti");
        song5.add("Rock En Español");
        song5.add("https://bit.ly/3vyoghy");
        song5.add("Rock enespañol de la agrupación Mago de Oz");
        song5.add("3.48");
        song5.add("2011.12.05");

        song6.add("6");
        song6.add("Lloraras");
        song6.add("Salsa");
        song6.add("https://bit.ly/3vIkSk6");
        song6.add("Salsa clasica de Oscar D'Leon");
        song6.add("3.50");
        song6.add("2018.04.20");

        song7.add("7");
        song7.add("El doctorado");
        song7.add("Urbano latino");
        song7.add("https://bit.ly/37GYAaC");
        song7.add(
                "Reggaeton clásico de tony dize con su albun la melodia de la calle");
        song7.add("4.48");
        song7.add("2009.11.18");

        song8.add("8");
        song8.add("La Rebelión");
        song8.add("Salsa");
        song8.add("https://bit.ly/3LfctLN");
        song8.add("Salsa clasica del Joe Arroyo");
        song8.add("4.45");
        song8.add("2012.07.14");

        song9.add("9");
        song9.add("Entre Dos Tierras");
        song9.add("Rock En Español");
        song9.add("https://bit.ly/37HmMcX");
        song9.add("Rock enespañol de la agrupación Heroes Del Silencio");
        song9.add("6.09");
        song9.add("2015.10.02");

        song10.add("10");
        song10.add("Salió el sol");
        song10.add("Urbano latino ");
        song10.add("https://bit.ly/3MpbWXN");
        song10.add("Reggaeton clásico de Don Omar, con su album Salió El Sol");
        song10.add("5.30");
        song10.add("2009.12.25");

        song11.add("11");
        song11.add("Nubes Negras");
        song11.add("Rock En Español");
        song11.add("https://bit.ly/3xQ28C3");
        song11.add("Rock enespañol de la agrupación Los De Adentro");
        song11.add("4.07");
        song11.add("2012.03.13");


        song12.add("12");
        song12.add("Flor Pálida ");
        song12.add("Salsa");
        song12.add("https://bit.ly/3k7KNfP");
        song12.add("Salsa de Marc Anthony ");
        song12.add("4.57");
        song12.add("2014.10.17");


        song13.add("13");
        song13.add("Luna ");
        song13.add("Urbano latino");
        song13.add("https://bit.ly/3k5NYon");
        song13.add(
                "Reggaeton clásico de Don Omar, en su album Alex Gargolas ");
        song13.add("3.14");
        song13.add("2013.01.03");


        song14.add("14");
        song14.add("Ahora Quien");
        song14.add("Salsa");
        song14.add("https://bit.ly/3vIljLg");
        song14.add("Salsa de Marc Anthony");
        song14.add("5.12");
        song14.add("2009.10.02");


        song15.add("15");
        song15.add("Lamento Boliviano");
        song15.add("Rock En Español");
        song15.add("https://bit.ly/3k5wJDy");
        song15.add("Rock enespañol de la agrupación Enanitos Verdes");
        song15.add("3.46");
        song15.add("2010.08.08");


        this.songList.add(song1);
        this.songList.add(song2);
        this.songList.add(song3);
        this.songList.add(song4);
        this.songList.add(song5);
        this.songList.add(song6);
        this.songList.add(song7);
        this.songList.add(song8);
        this.songList.add(song9);
        this.songList.add(song10);
        this.songList.add(song11);
        this.songList.add(song12);
        this.songList.add(song13);
        this.songList.add(song14);
        this.songList.add(song15);
    }

    /**
     * Este método permite a las demás clases acceder al arraylist de
     * canciones (biblioteca de canciones).
     *
     * @return devuelve un arraylist con 15 arrayslist de String en su interior.
     * Cada arraylist interno representa una canción y tiene la siguiente
     * estructura de atributos por canción:
     * [Id, titulo, genero, caratula, descripción, duración, fecha].
     *
     * @author Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
     * @since 1.0.0
     */
    public List<ArrayList<String>> getSongList() {
        return songList;
    }

    /**
     * Este método ofrece al usuario la funcionalidad de poder reproducir su
     * lista de canciones.
     *
     * @author Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
     * @since 1.0.0
     */
    public abstract void playSongList();
}