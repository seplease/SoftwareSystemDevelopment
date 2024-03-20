package springidol;

public class Song implements Instrument {
    private String title;
    private String artist;
    
    public Song() {}
    
    public Song(String title, String artist) {
        super();
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title;}
    public String getArtist() { return artist; }
    public void setArtist(String artist) { this.artist = artist; }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        
    }
}
