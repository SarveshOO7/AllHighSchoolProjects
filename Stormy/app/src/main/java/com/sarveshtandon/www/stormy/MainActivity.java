package com.sarveshtandon.www.stormy;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.sarveshtandon.www.stormy.databinding.ActivityMainBinding;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private CurrentWeather currentWeather;
    ImageView icon;
    String apiKey = "e9267719c11970d4e600f3cd50f7e94c";
    final double latitude = 37.8267;
    final double longtude = -122.4233;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getForecast(latitude,longtude);
        Toast.makeText(this, "Made by Sarvesh Tandon on 28/05/2018", Toast.LENGTH_LONG).show();

    }

    private void getForecast(double latitude, double longtude) {
        final ActivityMainBinding binding =  DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        TextView darkSkyView = findViewById(R.id.darkSkyView);
        darkSkyView.setMovementMethod(LinkMovementMethod.getInstance());

        icon = findViewById(R.id.iconView);



        String forecastURL= "https://api.darksky.net/forecast/" + apiKey + "/" + latitude + "," + longtude;
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(forecastURL).build();

        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    String JSONData = response.body().string();
                    Log.v(TAG, JSONData);
                    if(response.isSuccessful()){
                        currentWeather = getCurrentDetails(JSONData);

                        final CurrentWeather displayWeather = new CurrentWeather(
                                currentWeather.getLocationLabel(),
                                currentWeather.getIcon(),
                                currentWeather.getTime(),
                                currentWeather.getTemperature(),
                                currentWeather.getHumidity(),
                                currentWeather.getPrecipChance(),
                                currentWeather.getSummary()
                        );
                        Log.i(TAG,displayWeather.getFormattedTime("America/Los_Angeles"));
                        Log.i(TAG,String.valueOf(displayWeather.getIcon())+"-icon");
                        Log.i(TAG, String.valueOf(R.drawable.clear_day));
                        Drawable drawable = getResources().getDrawable(currentWeather.getIconId());
                        Log.i(TAG,displayWeather.getFormattedTime("America/Los_Angeles"));
                        binding.setWeather(displayWeather);
                       runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Drawable drawable = getResources().getDrawable(currentWeather.getIconId());

                                icon.setImageDrawable(drawable);

                            }
                        });

                    }
                    else{
                        alertUserAboutTheError();
                    }
                } catch (IOException e) {
                    Log.e(TAG, "IOException Caught:" ,e);
                } catch (JSONException e){
                    Log.e(TAG, "JSONException caught:",e);
                }
            }
        });
    }

    private CurrentWeather getCurrentDetails(String data) throws JSONException {
        JSONObject forecast = new JSONObject(data);
        String timezone = forecast.getString("timezone");
        Log.i(TAG, "From JSON:"+timezone);

        JSONObject currently = forecast.getJSONObject("currently");
        CurrentWeather currentWeather = new CurrentWeather();
        currentWeather.setTemperature(currently.getDouble("temperature"));
        currentWeather.setTime(currently.getLong("time"));
        currentWeather.setHumidity(currently.getDouble("humidity"));
        currentWeather.setLocationLabel("Alcataraz Island, CA");
        currentWeather.setIcon(currently.getString("icon"));
        currentWeather.setPrecipChance(currently.getDouble("precipProbability"));
        currentWeather.setSummary(currently.getString("summary"));
        Log.i(TAG, currentWeather.getFormattedTime(timezone));
        return currentWeather;

    }

    private void alertUserAboutTheError() {
        AlertDialogFragment dialog = new AlertDialogFragment();
        dialog.show(getFragmentManager(), "error_dialog");


    }
    public void refreshOnClick(View view){
        Toast.makeText(this, "Refreshing Data", Toast.LENGTH_LONG).show();
        getForecast(latitude, longtude);
    }
}