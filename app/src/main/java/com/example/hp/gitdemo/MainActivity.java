package com.example.hp.gitdemo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.Response;
import com.android.volley.Request;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONObject;
import org.json.JSONException;

public class MainActivity extends AppCompatActivity {
    public static EditText editText,editText1,editText2,editText3,editText4;
    TextView textView,textView1,textView2;
    Button button;
    RequestQueue requestQueue;              // requestqueue to process HTTP request
    String baseURL="https://api.github.com/users/";
    String url;    public static int i1=0,i2=0,i3=0,i4=0,i5=0;String data1,data2,data3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);
        editText1=(EditText)findViewById(R.id.editText2);
        editText2=(EditText)findViewById(R.id.editText3);
        editText3=(EditText)findViewById(R.id.editText4);
        editText4=(EditText)findViewById(R.id.editText5);
        button=(Button)findViewById(R.id.button);
        requestQueue =Volley.newRequestQueue(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity3();
                getReposClicked(v);
                getReposClicked1(v);
                getReposClicked2(v);
                getReposClicked3(v);
                getReposClicked4(v);
            }
        });
    }
    public void startActivity3(){
        Intent intent=new Intent(this,Main3Activity.class);
        startActivity(intent);
    }

    private void getRepoList(String username) {
        url = baseURL + username;final String us=username;
        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        if (response.length() > 0) {
                            try {
                                String data = response.get("public_repos").toString();
                                i1=Integer.parseInt(data);
                                Main3Activity.textView.setText(us+" :  "+data);

                            } catch (JSONException e) {
                                Log.e("Volley", "Invalid Json Object.");
                            }

                        } else {
                            Main3Activity.textView.setText("No Repos Found");
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Main3Activity.textView.setText("Something Went Wrong.");
                Log.e("Volley", error.toString());
            }
        }

        );
        requestQueue.add(jsonObjectRequest);
    }
    public void getReposClicked (View view){
        //i=0;this.textView.setText("");this.textView2.setText("");textView1.setText("");
        final String str1;
        str1 = editText.getText().toString();
        getRepoList(str1);

    }

    private void getRepoList1(String username) {
        url = baseURL + username;final String us1=username;
        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        if (response.length() > 0) {
                            try {
                                String data = response.get("public_repos").toString();
                                i2=Integer.parseInt(data);
                                Main3Activity.textView1.setText(us1+" :  "+data);

                            } catch (JSONException e) {
                                Log.e("Volley", "Invalid Json Object.");
                            }

                        } else {
                            Main3Activity.textView1.setText("No Repos Found");
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Main3Activity.textView1.setText("Something Went Wrong.");
                Log.e("Volley", error.toString());
            }
        }

        );
        requestQueue.add(jsonObjectRequest);
    }
    public void getReposClicked1 (View view){
        //i=0;this.textView.setText("");this.textView2.setText("");textView1.setText("");
        final String str2;
        str2 = editText1.getText().toString();
        getRepoList1(str2);

    }
    private void getRepoList2(String username) {
        url = baseURL + username;final String us2=username;
        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        if (response.length() > 0) {
                            try {
                                String data = response.get("public_repos").toString();
                                i3=Integer.parseInt(data);
                                Main3Activity.textView2.setText(us2+" :  "+data);

                            } catch (JSONException e) {
                                Log.e("Volley", "Invalid Json Object.");
                            }

                        } else {
                            Main3Activity.textView2.setText("No Repos Found");
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Main3Activity.textView2.setText("Something Went Wrong.");
                Log.e("Volley", error.toString());
            }
        }

        );
        requestQueue.add(jsonObjectRequest);
    }
    public void getReposClicked2 (View view){
        //i=0;this.textView.setText("");this.textView2.setText("");textView1.setText("");
        final String str3;
        str3 = editText2.getText().toString();
        getRepoList2(str3);
    }

    private void getRepoList3(String username) {
        url = baseURL + username;final String us3=username;
        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        if (response.length() > 0) {
                            try {
                                String data = response.get("public_repos").toString();
                                i4=Integer.parseInt(data);
                                Main3Activity.textView3.setText(us3+" :  "+data);

                            } catch (JSONException e) {
                                Log.e("Volley", "Invalid Json Object.");
                            }

                        } else {
                            Main3Activity.textView3.setText("No Repos Found");
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Main3Activity.textView3.setText("Something Went Wrong.");
                Log.e("Volley", error.toString());
            }
        }

        );
        requestQueue.add(jsonObjectRequest);
    }
    public void getReposClicked3 (View view){
        //i=0;this.textView.setText("");this.textView2.setText("");textView1.setText("");
        final String str1;
        str1 = editText3.getText().toString();
        getRepoList3(str1);

    }

    private void getRepoList4(String username) {
        url = baseURL + username;final String us4=username;
        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        if (response.length() > 0) {
                            try {
                                String data = response.get("public_repos").toString();
                                i5=Integer.parseInt(data);
                                Main3Activity.textView4.setText(us4+" :  "+data);

                            } catch (JSONException e) {
                                Log.e("Volley", "Invalid Json Object.");
                            }

                        } else {
                            Main3Activity.textView4.setText("No Repos Found");
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Main3Activity.textView4.setText("Something Went Wrong.");
                Log.e("Volley", error.toString());
            }
        }

        );
        requestQueue.add(jsonObjectRequest);
    }
    public void getReposClicked4 (View view){
        //i=0;this.textView.setText("");this.textView2.setText("");textView1.setText("");
        final String str1;
        str1 = editText4.getText().toString();
        getRepoList4(str1);

    }


    public void onBackPressed(){
        final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setMessage(("Are You Sure Want to Quit?"));
        builder.setCancelable(true);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();

    }
}