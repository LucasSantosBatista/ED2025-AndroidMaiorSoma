package br.lucassbatista.so;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/**
 * @noinspection ALL
 */
public class MainActivity extends AppCompatActivity {
    EditText etxtNumeroUm;
    EditText etxtNumeroDois;
    private Button btnMaiorValor;
    private Button btnSomar;
    private TextView txtResultado;

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

        etxtNumeroUm = findViewById(R.id.etxtNumeroUm);
        etxtNumeroDois = findViewById(R.id.etxtNumeroDois);
        btnMaiorValor = findViewById(R.id.btnMaiorValor);
        btnSomar = findViewById(R.id.btnSomar);
        txtResultado = findViewById(R.id.txtResultado);

        btnMaiorValor.setOnClickListener(op -> executaVerificaMaior());
        btnSomar.setOnClickListener(op -> executaSoma());
    }

    public void executaVerificaMaior() {
        int n1 = Integer.parseInt(etxtNumeroUm.getText().toString());
        int n2 = Integer.parseInt(etxtNumeroDois.getText().toString());

        String resultado = "";

        if (n1 > n2) {
            resultado = n1 + " é o maior valor!";
        } else if (n2 > n1) {
            resultado = n2 + " é o maior valor!";
        } else {
            resultado = "Valores são iguais ou inválidos!";
        }

        txtResultado.setText(resultado);
    }

    public void executaSoma() {
        int n1 = Integer.parseInt(etxtNumeroUm.getText().toString());
        int n2 = Integer.parseInt(etxtNumeroDois.getText().toString());

        int soma = n1 + n2;
        String resultado = n1 + " + " + n2 + " = " + soma + "\nResultado da soma é " + soma;


        txtResultado.setText(resultado);
    }
}