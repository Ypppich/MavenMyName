package MyName;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().create();
        String result = gson.toJson(new MyName("Pavlo", "Navodych"));
        System.out.println(result);
    }
}
