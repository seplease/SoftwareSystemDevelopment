package springidol;

public class Singer implements Performer {
    private String name;
    private Song song;
    private Instrument instr;
    
    public Singer() {}
    
    public Singer(String name, Song song) {
        super();
        this.name = name;
        this.song = song;
    }
    
    public Singer(String name, Song song, Instrument instr) {
        super();
        this.name = name;
        this.song = song;
        this.instr = instr;
    }
    
    public Song getSong() {
        return song;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println(name + " is singing a song " + song.getTitle() + " by " + song.getArtist());
        if (instr != null) {
            System.out.print("while playing " + instr + " ");
            instr.play();
        }
    }
}
