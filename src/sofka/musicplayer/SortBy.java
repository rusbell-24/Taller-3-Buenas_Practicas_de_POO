package sofka.musicplayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBy extends SongsLibrary{
    public ArrayList example;
    public int a = 5;
    public void ascendentSort(){
        Collections.sort(getSongList(), new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return o1.get(a).compareTo(o2.get(a));
            }
        });
        System.out.println(getSongList());
    }
    public void sortByGender() {
        List<ArrayList<String>> rockEnEspañol = new ArrayList<>();
        List<ArrayList<String>> salsa = new ArrayList<>();
        List<ArrayList<String>> urbanoLatino = new ArrayList<>();

        for (int i = 0; i < getSongList().size(); i++) {
            switch (getSongList().get(i).get(2)) {
                case "Rock En Español":
                    rockEnEspañol.add(getSongList().get(i));
                    //System.out.print(songList.get(i) + " ");
                    //System.out.println();
                     break;
                case "Salsa":
                    //System.out.print("Salsitaaaaa <3" + " ");
                    //System.out.println();
                    salsa.add(getSongList().get(i));
                    break;
                case "Urbano latino":
                    //System.out.print("Utbano latino <3" + " ");
                    //System.out.println();
                    urbanoLatino.add(getSongList().get(i));
                    break;

                //System.out.print(songList.get(i).get(2) + " ");
                //System.out.println();
            }
        }
        System.out.print(salsa + " ");
        System.out.println();
    }
    @Override
    public void playSongList() {

    }
    /**
     * para recorrer todo el array list de 2D
     *
     for (int i = 0; i < songList.size(); i++) {
     for (int j = 0; j < songList.get(i).size(); j++) {
     System.out.print(songList.get(i).get(j) + " ");
     }
     System.out.println();
     }
     **/
}
