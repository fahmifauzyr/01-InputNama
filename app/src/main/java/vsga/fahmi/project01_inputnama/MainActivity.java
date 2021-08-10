package vsga.fahmi.project01_inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input_namaDepan, input_namaBelakang, input_asalDaerah;
    TextView result_namaLengkap, result_asalDaerah;
    Button show_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_namaDepan=(EditText)findViewById(R.id.input_nama_depan);
        input_namaBelakang=(EditText)findViewById(R.id.input_nama_belakang);
        input_asalDaerah=(EditText)findViewById(R.id.input_asal_daerah);
        result_namaLengkap=(TextView)findViewById(R.id.result_namaLengkap);
        result_asalDaerah=(TextView)findViewById(R.id.result_asalDaerah);
        show_result=(Button)findViewById(R.id.btn_result);

        show_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namaDepan = input_namaDepan.getText().toString();
                String namaBelakang = input_namaBelakang.getText().toString();
                String asalDaerah = input_asalDaerah.getText().toString();
                String namaLengkap = namaDepan + " " + namaBelakang;
                result_namaLengkap.setText(namaLengkap);
                result_asalDaerah.setText(asalDaerah);
            }
        });

    }
}