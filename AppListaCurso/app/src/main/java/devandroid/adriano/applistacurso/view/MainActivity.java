package devandroid.adriano.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.adriano.applistacurso.R;
import devandroid.adriano.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        // Atribuir conteudo, dados, valores para o Objeto
        // Confrome o seu MODELO, TEMPLATE
        pessoa.setPrimeiroNome("Marco");
        pessoa.setSobreNome("Maddo");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneDesejado("11-99229955");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Luiz");
        outraPessoa.setSobreNome("Alves");
        outraPessoa.setCursoDesejado("linguagem");
        outraPessoa.setTelefoneDesejado("11-123456");

        int parada = 0;



    }
}