package basic.helper.finalproject;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ArrayBasic {
    final ArrayList<String> allvl1 = new ArrayList<>();
    final ArrayList <String> allvl2 = new ArrayList<>();
    final ArrayList <String> allvl3 = new ArrayList<>();
    final ArrayList <String> altask10 = new ArrayList<>();
    final ArrayList <String> altask11 = new ArrayList<>();
    final ArrayList <String> altask12 = new ArrayList<>();
    final ArrayList <String> altask13 = new ArrayList<>();
    final ArrayList <String> altask14 = new ArrayList<>();
    JSONArray jlvl1;
    JSONArray jlvl2;
    JSONArray jlvl3;
    JSONArray jtask10;
    JSONArray jtask11;
    JSONArray jtask12;
    public void getHttpResponse(){
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        Request request = new Request.Builder()
                .url("https://github.com/LeyaKs/FinalProject/blob/main/resources.json")
                .method("GET", null)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String answer = response.body().string();
                try{
                    JSONObject json = new JSONObject(answer);
                    jlvl1 = json.getJSONArray("verifiable_vowel");
                    jlvl2 = json.getJSONArray("alternating_vowel");
                    jlvl3 = json.getJSONArray("non_verifiable_vowel");
                    jtask10 = json.getJSONArray("task_10");
                    jtask11 = json.getJSONArray("task_11");
                    jtask12 = json.getJSONArray("task_12");
                } catch (JSONException e) {
                    Log.e("MYAPP", "JSON exception", e);
                }
            }
        });
    }

    public void start() {
        for (int i = 0; i < jlvl1.length(); i++) {
            try {
                allvl1.add(jlvl1.getString(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < jlvl2.length(); i++) {
            try {
                allvl2.add(jlvl2.getString(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < jlvl3.length(); i++) {
            try {
                allvl3.add(jlvl3.getString(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < jtask10.length(); i++) {
            try {
                altask10.add(jtask10.getString(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < jtask11.length(); i++) {
            try {
                altask11.add(jtask11.getString(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < jtask12.length(); i++) {
            try {
                altask12.add(jtask12.getString(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
