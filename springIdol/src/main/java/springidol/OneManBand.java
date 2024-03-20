package springidol;

import java.util.Map;
import java.util.Properties;

public class OneManBand implements Performer {
    private Map<String, Instrument> instruments;
    
    public OneManBand() {}
    
    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
    
    public void perform() throws PerformanceException {
        for (String key : instruments.keySet()) {
            System.out.print(key + ": ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
}
