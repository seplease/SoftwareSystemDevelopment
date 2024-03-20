package springidol;

public class Harmonica implements Instrument {
	public Harmonica() {
	}

	public void play() {
		System.out.println("HUM HUM HUM~~");
	}
	
	@Override
    public String toString() {
        return "Harmonica";
    }
}
