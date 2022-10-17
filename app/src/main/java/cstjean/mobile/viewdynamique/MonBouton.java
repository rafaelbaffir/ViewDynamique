package cstjean.mobile.viewdynamique;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;

import com.google.android.material.textfield.TextInputEditText;

public class MonBouton extends androidx.appcompat.widget.AppCompatButton implements View.OnClickListener {
    public MonBouton(Context context) {
        super(context);
        setOnClickListener(this);
    }
    

    public MonBouton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOnClickListener(this);
    }
    
    TextInputEditText nbBoutonsAjouter = findViewById(R.id.InputText);
    GridLayout gridBoutons = findViewById(R.id.layout_gridBoutons);
    
    @Override
    public void onClick(View view) {
        for(int i = 0; i < Integer.ParseInt.(nbBoutonsAjouter.getText()); i++) {
            Button bouton = new MonBouton(this);
            bouton.setText(R.string.btn_bouton);

            GridLayout.LayoutParams params = new GridLayout.LayoutParams();
            params.height = GridLayout.LayoutParams.WRAP_CONTENT;
            params.width = GridLayout.LayoutParams.WRAP_CONTENT;
            bouton.setLayoutParams(params);

            gridBoutons.addView(bouton);
        }
    }
}