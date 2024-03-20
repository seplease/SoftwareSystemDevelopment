package springidol;

public class Guitar implements Instrument {
	public Guitar() {
	}

	public void play() {
		System.out.println("STRUM STRUM STRUM~~");
	}
	
	@Override
    public String toString() {
        return "Guitar";
    }
}
