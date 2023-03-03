package mx.itson.calculadora;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {

    private Button btnSumar;
    private Button btnResta;
    private Button btbDivision;
    private Button btnMultiplicacion;

    private EditText valor1;
    private EditText valor2;
    private int resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        valor1 = findViewById(R.id.txtValor1);
        valor2 = findViewById(R.id.txtValor2);
        private resultado;


        btnSumar = findViewById(R.id.btnSumar);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = (Integer.parseInt(valor1.getText().toString()) + Integer.parseInt(valor2.getText().toString())) ;
                Toast.makeText(getApplicationContext(), String.valueOf(resultado), Toast.LENGTH_SHORT).show();
                //Toast.setText(Integer.parseInt(sum( Integer.parseInt(valor1.getText().toString()),Integer.parseInt(valor2.getText().toString()) )+""));
            }
        });


        btnResta = findViewById(R.id.btnRestar);
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = (Integer.parseInt(valor1.getText().toString()) - Integer.parseInt(valor2.getText().toString())) ;
                Toast.makeText(getApplicationContext(), String.valueOf(resultado), Toast.LENGTH_SHORT).show();
                //Toast.setText(Integer.parseInt(sum( Integer.parseInt(valor1.getText().toString()),Integer.parseInt(valor2.getText().toString()) )+""));
            }
        });

        btbDivision = findViewById(R.id.btnDividir);
        btbDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = (Integer.parseInt(valor1.getText().toString()) / Integer.parseInt(valor2.getText().toString())) ;
                Toast.makeText(getApplicationContext(), String.valueOf(resultado), Toast.LENGTH_SHORT).show();
                //Toast.setText(Integer.parseInt(sum( Integer.parseInt(valor1.getText().toString()),Integer.parseInt(valor2.getText().toString()) )+""));
            }
        });

        btnMultiplicacion = findViewById(R.id.btnMultiplicar);
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = (Integer.parseInt(valor1.getText().toString()) * Integer.parseInt(valor2.getText().toString())) ;
                Toast.makeText(getApplicationContext(), String.valueOf(resultado), Toast.LENGTH_SHORT).show();
                //Toast.setText(Integer.parseInt(sum( Integer.parseInt(valor1.getText().toString()),Integer.parseInt(valor2.getText().toString()) )+""));
            }
        });


    }
}