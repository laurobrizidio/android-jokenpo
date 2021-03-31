package br.com.laurobrizidio.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void clickPedra(View view){
        this.opcaoSelecionada("pedra");
    }

    public void clickTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }

    public void clickPapel(View view){
        this.opcaoSelecionada("papel");
    }
    private void opcaoSelecionada(String opcaousuario){
        ImageView img = findViewById(R.id.imgResultado);
        TextView txt = findViewById(R.id.txt_result);

        int numeroAleatorio = new Random().nextInt(3);
        String[] opcao = {
                "pedra",
                "tesoura",
                "papel"
        };
        String opcaoApp = opcao[numeroAleatorio];

        switch(opcaoApp){
            case "pedra":
                img.setImageResource(R.drawable.pedra);
                break;
            case "tesoura":
                img.setImageResource(R.drawable.tesoura);
                break;
            case "papel":
                img.setImageResource(R.drawable.papel);
                break;
        }

        if((opcaoApp == "tesoura" && opcaousuario == "papel") ||
                (opcaoApp == "papel" && opcaousuario == "pedra") ||
                (opcaoApp == "pedra" && opcaousuario == "tesoura")
        ){
            txt.setText("O App Ganhou! :(");
        }else if((opcaoApp == "tesoura" && opcaousuario == "pedra") ||
        (opcaoApp == "papel" && opcaousuario == "tesoura") ||
                (opcaoApp == "pedra" && opcaousuario == "papel")
        ){
            txt.setText("Você Ganhou! :)");

        }else{
            txt.setText("Empate!");

        }




    }

}
