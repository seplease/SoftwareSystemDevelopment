package springidol;

public class Cymbal implements Instrument {
	public Cymbal() {
	}

	public void play() {
		System.out.println("CRASH CRASH CRASH~~");
	}
	
	@Override
    public String toString() {
        return "Cymbal";
    }
}