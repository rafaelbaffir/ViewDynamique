package cstjean.mobile.viewdynamique;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;

import com.google.android.material.textfield.TextInputEditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MonBouton extends androidx.appcompat.widget.AppCompatButton implements View.OnClickListener {
    private Calendar calendar;
    private  final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());

    public MonBouton(@NonNull Context context) {
        super(context);
        init();
    }
    

    public MonBouton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    private  void init(){
        calendar = Calendar.getInstance();
        setOnClickListener(this);
    }

    
    @Override
    public void onClick(View view) {
        Toast.makeText(getContext(), formatter.format(calendar.getTime()), Toast.LENGTH_SHORT).show();
    }
}