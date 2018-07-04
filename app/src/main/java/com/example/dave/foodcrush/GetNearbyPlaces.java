package com.example.dave.foodcrush;

import android.os.AsyncTask;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetNearbyPlaces extends AsyncTask<Object,String,String> {
            GoogleMap mMap;
            String url;
            InputStream Is;
            java.io.BufferedReader BufferedReader;
            StringBuilder stringBuilder;
            String data;

    @Override
    protected String doInBackground(Object... params) {

        mMap = (GoogleMap) params[0];
        url = (String)params[1];

        try {
            URL myurl = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection)myurl.openConnection();
            httpURLConnection.connect();
            Is = httpURLConnection.getInputStream();
            BufferedReader = new BufferedReader(new InputStreamReader(Is));

            String line = "";
            stringBuilder = new StringBuilder();

            while ((line = BufferedReader.readLine())!= null)
            {
                stringBuilder.append(line);
            }
            data = stringBuilder.toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    @Override
    protected void onPostExecute(String s) {

        try {
            JSONObject parentObject = new JSONObject(s);
            JSONArray resultsarray = parentObject.getJSONArray("results");

            for (int i = 0; i <resultsarray.length(); i++)
            {
             JSONObject jsonObject = resultsarray.getJSONObject(i);
             JSONObject locationObj = jsonObject.getJSONObject("geometry").getJSONObject("location");

             String latitude = locationObj.getString("lat");
             String longitude = locationObj.getString("lng");


             JSONObject nameObject = resultsarray.getJSONObject(i);

             String name_restaurant = nameObject.getString("name");
             String vicinity = nameObject.getString("vicinity");

                LatLng latLng = new LatLng(Double.parseDouble(latitude), Double.parseDouble(longitude));

                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.title(vicinity);
                markerOptions.position(latLng);

                mMap.addMarker(markerOptions);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
