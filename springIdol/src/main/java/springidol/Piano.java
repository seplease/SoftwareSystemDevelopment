package springidol;

public class Piano implements Instrument {
    public Piano() {
    }

    @Override
    public void play() {
        System.out.println("Plank Plank Plank~~");
    }
    
    @Override
    public String toString() {
        return "Piano";
    }
}
