package cstjean.mobile.viewdynamique;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private GridLayout gridLayout;
    private EditText nombreBoutonAjouter;
    private Button boutonjouter;
    private int compteurAjouter = 1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView((R.layout.activity_main_avant));

        gridLayout = findViewById(R.id.layout_gridBoutons);
        nombreBoutonAjouter = findViewById(R.id.txt_nbBouton);
        boutonjouter = findViewById(R.id.btn_ajouterBoutons);

        boutonjouter.setOnClickListener(view -> {
            String strNbBoutonsAjouter = nombreBoutonAjouter.getText().toString();
            int nbBoutonsAjouter = Integer.parseInt(strNbBoutonsAjouter);

            for(int i = 1; i <= nbBoutonsAjouter; i++){
                Button bouton = new Button(view.getContext());
                bouton.setText(getString(R.string.btn_yeye,compteurAjouter,i));

                GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                params.height = GridLayout.LayoutParams.WRAP_CONTENT;
                params.width = GridLayout.LayoutParams.WRAP_CONTENT;
                bouton.setLayoutParams(params);

                gridLayout.addView(bouton);
            }
        });
    }
}
