import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private static String name;
    private static String artist;
    private static ArrayList<Song> songs;

    public static void main(String[] args) {


        // Create an album
        Album ayra = new Album("TYIT21", "Ayra Starr");

        // Add songs to the album
        ayra.addSong("Away", 3.25);
        ayra.addSong("Sability", 3.15);
        ayra.addSong("Ija", 4.10);

        // Create a playlist (LinkedList)
        LinkedList<Song> playList = new LinkedList<>();

        // Add songs to the playlist using the index
        ayra.addToPlayList(2, playList);  // Adding song at index 1 (Sability)

        // Add songs to the playlist using the title
        ayra.addToPlayList("Away", playList);  // Adding song "Away" by title

        // Print playlist to verify
        System.out.println("PlayList:");
        for (Song song : playList) {
            System.out.println(song);
        }
    }








    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    private Song findSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
            if (song.getTitle().equals(title)) {

                return song;
            }

        }
        return null;


    }


    private boolean addSong(String title, double duration) {
        if (findSong(title)==null) {
            songs.add(new Song(title, duration));
            return true;
        }
        System.out.println(songs);
            return false;


    }

    private boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song songAdd = songs.get(trackNumber);

if(trackNumber>'0'&& trackNumber<= songs.size()) {

    playList.add(songAdd);

    return true;
}
    return false;
    }

    private boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song songAdd = findSong(title);

        if(songAdd!=null) {

            playList.add(songAdd);

            return true;
        }
        return false;
    }


    class Song {

        private String title;
        private double duration;

        public Song(String title, double duration) {
            this.title = title;
            this.duration = duration;
        }

        public String getTitle() {

            return title;
        }

        @Override
        public String toString() {
            return "Song{" +
                    "title='" + title + '\'' +
                    ", duration=" + duration +
                    '}';
        }
    }
}