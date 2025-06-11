package br.lucassbatista.so.controller;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.lucassbatista.so.R;

/**
 * @noinspection ALL
 */
public class AppController extends AppCompatActivity {
    private EditText etxtNumeroUm;
    private EditText etxtNumeroDois;
    private Button btnMaiorValor;
    private Button btnSomar;
    private TextView txtResultado;

    public AppController(EditText etxtNumeroUm, EditText etxtNumeroDois, Button btnMaiorValor, Button btnSomar, TextView txtResultado) {
        this.etxtNumeroUm = etxtNumeroUm;
        this.etxtNumeroDois = etxtNumeroDois;
        this.btnMaiorValor = btnMaiorValor;
        this.btnSomar = btnSomar;
        this.txtResultado = txtResultado;
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
