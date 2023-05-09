package sofka.musicplayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortBy extends SongsLibrary{
    List<ArrayList<String>> libraryToShow;

    public void setLibraryToShowToSongList() {
        this.libraryToShow = new ArrayList<>(getSongList());
    }

    public void setLibraryToShowToSalsa(){
        this.libraryToShow = new ArrayList<>(salsa);
    }
    public void setLibraryToShowToRock(){
        this.libraryToShow = new ArrayList<>(rockEnEspañol);
    }
    public void setLibraryToShowToUrbano(){
        this.libraryToShow = new ArrayList<>(urbanoLatino);
    }
    public void setLibraryToShowToCustomList(List<ArrayList<String>> customList){
        this.libraryToShow =  customList;
    }

    public void setToAlphabeticNames(){
        this.a = 1;
    }

    public void setToAlphabeticGenders(){
        this.a = 2;
    }
    public void setToSongDuration(){
        this.a = 5;
    }
    public void setToYear(){
        this.a = 7;
    }

    public int a = 5;
    public void ascendentSort(){

        Collections.sort(libraryToShow, new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return o1.get(a).compareTo(o2.get(a));
            }
        });
        for (ArrayList song: libraryToShow) {
            System.out.println(song);
        }

    }

    List<ArrayList<String>> rockEnEspañol = new ArrayList<>();
    List<ArrayList<String>> salsa = new ArrayList<>();
    List<ArrayList<String>> urbanoLatino = new ArrayList<>();
    public void sortByGender() {

        for (int i = 0; i < libraryToShow.size(); i++) {
            switch (libraryToShow.get(i).get(2)) {
                case "Rock En Español":
                    rockEnEspañol.add(libraryToShow.get(i));
                    //System.out.print(songList.get(i) + " ");
                    //System.out.println();
                     break;
                case "Salsa":
                    //System.out.print("Salsitaaaaa <3" + " ");
                    //System.out.println();
                    salsa.add(libraryToShow.get(i));
                    break;
                case "Urbano latino":
                    //System.out.print("Utbano latino <3" + " ");
                    //System.out.println();
                    urbanoLatino.add(libraryToShow.get(i));
                    break;

                //System.out.print(songList.get(i).get(2) + " ");
                //System.out.println();
            }
        }

    }
    public List<ArrayList<String>> getLibraryToShow() {
        return libraryToShow;
    }

    public void setLibraryToShow(List<ArrayList<String>> libraryToShow) {
        this.libraryToShow = libraryToShow;
    }

    @Override
    public void playSongList() {
        for (int i = 0; i < libraryToShow.size(); i++) {
            System.out.println( "Reproduciendo..." + libraryToShow.get(i));
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
