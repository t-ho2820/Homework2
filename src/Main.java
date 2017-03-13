

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("car_data.csv"));

        int index = 0;
        ArrayList<Car> cars = new ArrayList<>();
        int lnum = 0;
        PrintWriter outputFile = new PrintWriter("processed_cars.txt");

        String line;
        while ((line = reader.readLine()) != null) {
            if (lnum == 0) {
                lnum++;
                continue;
            }
            lnum++;

            Car car1 = new Car();
            Scanner scanner = new Scanner(line);
            scanner.useDelimiter(",");
                while (scanner.hasNext()) {
                    String data =scanner.next();
                if (index == 0)
                    car1.setMake(data);
                else if (index == 1)
                    car1.setModel(data);
                else if (index == 2)
                    car1.setCurrentSpeed(Integer.parseInt(data));
                else if(index == 3)
                    car1.setFuel(Double.parseDouble(data));
                else if (index == 4)
                    car1.setBaseMpg(Double.parseDouble(data));
                else if (index == 5)
                    car1.setScaleFactor(Double.parseDouble(data));
                else if (index == 6)
                    car1.timeTravelled(Double.parseDouble(data));
                index++;
                }

            cars.add(car1);

        }
        outputFile.println(cars.toString());

        reader.close();
        outputFile.close();

    }
}
