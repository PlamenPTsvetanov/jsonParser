import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();

        try {
            Airports airports = gson.fromJson(new FileReader("C:\\Users\\ptsvetanov\\Downloads\\airports.json"),
                    Airports.class);

            airports.getAirports().forEach(airport -> {
                if ((!airport.getLatitude().isEmpty() && airport.getLatitude() != null)
                        && !airport.getLongitude().isEmpty() && airport.getLongitude() != null){
                    //TODO implement insertion
                }
            });

            int i = 0;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
