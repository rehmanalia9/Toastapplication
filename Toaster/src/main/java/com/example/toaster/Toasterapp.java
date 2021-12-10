package com.example.toaster;

import android.content.Context;
import android.widget.Toast;

public class Toasterapp {

    public static void SimpleToast(Context context,String Toast){

        android.widget.Toast.makeText(context, toast, android.widget.Toast.LENGTH_SHORT).show();
    }
}
