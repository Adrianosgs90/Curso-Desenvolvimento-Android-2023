package devandroid.adriano.applistacurso.view;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.adriano.applistacurso.R;
import devandroid.adriano.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        pessoa = new Pessoa();

        pessoa.setPrimeiroNome("Adriano");
        pessoa.setSobrenome("Santos");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("11-99229191");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Luiz");
        outraPessoa.setSobrenome("Alves");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("11-5599336");

        Log.i("POOAndroid","Objeto pessoa: "+pessoa.toString());
        Log.i("POOAndroid","Objeto outrapessoa: "+outraPessoa.toString());

        //teste

    }

}