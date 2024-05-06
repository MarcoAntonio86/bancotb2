package com.cursoandroid.bancotb2.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cursoandroid.bancotb2.Model.Usuario;
import com.cursoandroid.bancotb2.R;

public class MainActivity extends AppCompatActivity {

    Usuario usuario;

    EditText id_nome;

    EditText id_cpf;

    EditText id_senha;

    EditText id_deposito;

    Button btn_cadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = new Usuario();

        id_nome = findViewById(R.id.id_nome);
        id_cpf = findViewById(R.id.id_cpf);
        id_senha = findViewById(R.id.id_senha);
        id_deposito = findViewById(R.id.id_deposito);

        btn_cadastrar = findViewById(R.id.btn_cadastrar);

        id_nome.setText(usuario.getNome());
        id_cpf.setText(usuario.getCpf());
        id_senha.setText(usuario.getSenha());
        id_deposito.setText((CharSequence) usuario.getDepositoInical());

        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario.setNome(id_nome.getText().toString());
                usuario.setCpf(id_cpf.getText().toString());
                usuario.setSenha(id_senha.getText().toString());
                usuario.setDepositoInical(id_deposito.getText().toString());

                Toast.makeText(MainActivity.this,"Cadastro realizado com sucesso !" + usuario.toString(),Toast.LENGTH_LONG).show();
            }
        });

        Log.i("POOAndroid", usuario.toString());






    }
}