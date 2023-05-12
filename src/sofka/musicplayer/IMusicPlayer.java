package sofka.musicplayer;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta interface exige la construcción del método getCustomSongList a cada
 * una de las clases que la implemente.
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version: 1.0.0 12-05-2023
 * @
 * */
public interface IMusicPlayer {

    /**
     * Este método permite acceder a la lista personalizada de canciones.
     *
     * @return devuelve un list con n cantidad de arrayslist de
     * String. Cada arraylist de string representa una canción, y tiene la
     * siguiente estructura de atributos por cada canción:
     * [Id, titulo, genero, caratula, descripción, duración, fecha].
     *
     * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
     * @since: 1.0.0
     */
    public List<ArrayList<String>> getCustomSongList();
}
