
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class CurrencyConverterClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in INR: ");
        String inrAmount = scanner.nextLine();  // User input


        try {
            String urlString = "http://127.0.0.1:5000/convert?inr=" + inrAmount;
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");


            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }


            BufferedReader br = new BufferedReader(new InputStreamReader(
                (conn.getInputStream())));
                //response read karne ke leya


            String output;
            System.out.println("Currency Conversion:");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }


            conn.disconnect();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
