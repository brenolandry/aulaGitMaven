/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aulas.prat_mavengit;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Aluno
 */
public class AppLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Hello. Este um aplicativo javapara ler JSON.");
        System.out.println(lerJSON("http://time.jsontest.com/"));
    }

    public static String lerJSON(String url) throws MalformedURLException, IOException {
        Gson gson = new Gson();
        URL url2 = new URL(url);
        Reader br = new InputStreamReader(url2.openStream());
        JsonReader readerURL = new JsonReader(br);
        JsonObject jsObj = gson.fromJson(readerURL, JsonObject.class);
        return jsObj.toString();
    }
}
