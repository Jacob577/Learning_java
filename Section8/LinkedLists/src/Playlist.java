import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Song> playlist = new LinkedList<>();
        Album nirvana = new Album("Nirvana");
        nirvana.addSongToAlbum("Smells like teen spirit", 3);
        nirvana.addSongToAlbum("Polly", 1);
        nirvana.addSongToAlbum("Cubane",5);
        nirvana.addSongToAlbum("Like heaven",4);

        Album aa = new Album("AA");
        aa.addSongToAlbum("Teenager",4);
        aa.addSongToAlbum("Smell",2);
        aa.addSongToAlbum("Love",7);

        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(nirvana);
        albums.add(aa);

        playlist.add(addToPlaylist(albums,"Nirvana","Smells like teen spirit"));
        playlist.add(addToPlaylist(albums,"Nirvana","Polly"));
        playlist.add(addToPlaylist(albums,"AA","Teenager"));
        playlist.add(addToPlaylist(albums,"AA","Love"));

        startPlaylist(playlist,albums);


    }
    public static void displayOptions(){
        System.out.println("0 - display options\n" +
                "1 - display playlist\n" +
                "2 - add to playlist\n" +
                "3 - play playlist\n" +
                "4 - next song\n" +
                "5 - previous song\n" +
                "6 - replay song\n" +
                "7 - quit");
    }
    public static Song addToPlaylist(ArrayList<Album> albums,String albumName, String songName){
        boolean albumExists = false;
        for (int i = 0; i<albums.size();i++){
            albumExists = albums.get(i).getAlbumName().equals(albumName);
            if (albumExists){
                if (albums.get(i).getSongFromAlbum(songName)!=null){
                    System.out.println("Song is added: " + songName);
                    return albums.get(i).getSongFromAlbum(songName);
                }
            }
        }
        System.out.println("Action not possible, try again.");
        return null;
    }
    public static void displayPlaylist(LinkedList<Song> playlist, ArrayList<Album> albums){
        for (int i = 0; i<playlist.size();i++){
            System.out.println("Are in playlist " + playlist.get(i).getName());
                    }
    }


    public static void startPlaylist(LinkedList<Song> playlist, ArrayList<Album> albums){
        boolean quit = false;
        displayOptions();
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> listIterator = playlist.listIterator();
        while (!quit){
            int action = scanner.nextInt();
            switch (action){
                case 0:
                    displayOptions();
                    break;
                case 1:
                    displayPlaylist(playlist,albums);
                    break;
                case 2:
                    System.out.println("Name of the album: ");
                    scanner.nextLine();
                    String albumName = scanner.nextLine();
//                    scanner.nextLine();
                    System.out.println("Name of the song: ");
                    String songName = scanner.nextLine();
                    System.out.println("Album name: " + albumName + " songname: " + songName);
                    addToPlaylist(albums,albumName,songName);
                    break;
                case 3:
                    System.out.println("Now playing: ");
                    System.out.println(listIterator.next().getName());
                    listIterator.previous();
                    break;
                case 4:
                    listIterator.next();
                    System.out.println("Now playing: ");
                    System.out.println(listIterator.next().getName());
                    listIterator.previous();
                    break;
                case 5:
                    listIterator.previous();
                    System.out.println("Previous is :");
                    System.out.println(listIterator.previous().getName());
                    listIterator.next();
                    break;
                case 6:
                    listIterator.previous();
                    System.out.println("Replaying: " + listIterator.next().getName());
                    break;

                case 7:
                    quit = true;

            }
        }
    }
}
