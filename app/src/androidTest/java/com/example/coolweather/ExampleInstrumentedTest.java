package com.example.coolweather;

import android.content.Context;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import okhttp3.Request;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import okhttp3.OkHttpClient;
import okhttp3.Response;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.coolweather", appContext.getPackageName());
    }

    @Test
    public void run(){
        try{
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url("http://www.baidu.com").build();
            Response response = client.newCall(request).execute();
            String responseData = response.body().string();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        Log.d("ExampleInstrumentedTest", "run: responseData");

    }
}