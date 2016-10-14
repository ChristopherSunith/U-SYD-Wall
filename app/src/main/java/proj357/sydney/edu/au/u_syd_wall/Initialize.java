package proj357.sydney.edu.au.u_syd_wall;

import android.app.Application;

import com.parse.Parse;


public class Initialize extends Application {
    public void onCreate() {
        Parse.initialize(this, "3N9cToLyOFybHH7ZLEBVMAZsRYTVFLdAf7I4AWU0", "Jq19zhcI0eTViqKHEXa8G1XbnjyWuNIw58bw25ZE");
    }
}
