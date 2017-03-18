package com.ubco_oober.ashleybernhardt.ubco;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ashley Bernhardt on 3/14/2017.
 */

public class FormRequest extends StringRequest {

    private static final String Form_Request_URL = "https://ubco-oober.000webhostapp.com/Form.php";
    private Map<String, String> params;

    public FormRequest(String destination, String sDate, String sTime, int space, String studentEmail, Response.Listener<String> listener) {
        super(Request.Method.POST, Form_Request_URL, listener, null);
        params = new HashMap<>() ;
        params.put("studentEmail", studentEmail);
        params.put("destination", destination);
        params.put("sDate", sDate);
        params.put("sTime", sTime);
        params.put("space", space + "");
        Log.d("Destination", destination);
        Log.d("student email ",studentEmail);
        Log.d("Destination",sDate);
        Log.d("Destination",sTime);


    }

    public  Map<String, String> getParams() {
        return params;
    }
}
