import java.util.LinkedList;

public class Album {
    private String albumName;
    private LinkedList<Song> songLinkedList;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songLinkedList = new LinkedList<>();
    }

    public Song getSongFromAlbum(String songName){
        boolean songExists = false;
        for (int i = 0; i<songLinkedList.size(); i++){
            songExists = songLinkedList.get(i).getName().equals(songName);
            if (songExists){
//                System.out.println(songName + " exists and is added to your playlist!");
                return songLinkedList.get(i);
            }
        }
        System.out.println(songName + " does not exist, please try another name.");
        return null;
    }
    public void addSongToAlbum(String songName, double duration){
        Song song = new Song(songName,duration);
        songLinkedList.add(song);
    }
    public void displayAlbum(){
        for (int i = 0; i<songLinkedList.size(); i++){

        }
    }
    public String getAlbumName() {
        return albumName;
    }
    public void getSongs(){
        for (int i = 0; i < songLinkedList.size(); i++){
            System.out.println(songLinkedList.get(i).getName());
        }
    }
}
