package br.lucassbatista.so.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import br.lucassbatista.so.R;
import br.lucassbatista.so.controller.AppController;

/**
 * @noinspection ALL
 */
public class MainActivity extends AppCompatActivity {
    private EditText etxtNumeroUm;
    private EditText etxtNumeroDois;
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

        AppController control = new AppController(etxtNumeroUm, etxtNumeroDois, btnMaiorValor, btnSomar, txtResultado);
        btnMaiorValor.setOnClickListener(op -> control.executaVerificaMaior());
        btnSomar.setOnClickListener(op -> control.executaSoma());
    }


}