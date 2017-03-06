package com.ubco_oober.ashleybernhardt.ubco;

/**
 * Created by Ashley Bernhardt on 3/6/2017.
 */

import com.android.volley.toolbox.StringRequest;
import com.android.volley.Response;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest{

    private static final String Register_Request_URL = "https://ubco-oober.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String fName, String lName, String studentEmail, String password, String cPassword, Response.Listener<String> listener) {
        super(Method.POST, Register_Request_URL, listener, null);
        params = new HashMap<>() ;
        params.put("fName", fName);
        params.put("lName", lName);
        params.put("studentEmail", studentEmail);
        params.put("password", password);
        params.put("cPassword", cPassword);


    }

    public  Map<String, String> getParams() {
        return params;
    }


}
