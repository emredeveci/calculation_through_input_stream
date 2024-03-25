import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        int sum = 0;
        FileReader numbers = null;
        BufferedReader file = null;

        try{
            numbers = new FileReader("numbers.txt");
            file = new BufferedReader(numbers);
            String line;
            while ((line = file.readLine()) != null) {
                sum += Integer.parseInt(line);
                System.out.println(line);
            }
            file.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("The sum is " + sum);
    }
}