package com.cursoandroid.bancotb2.Controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import com.cursoandroid.bancotb2.Model.Usuario;
import com.cursoandroid.bancotb2.View.MainActivity;

public class UsuarioController {

    SharedPreferences preferences;

    SharedPreferences.Editor ListaUsuario;

    public static final String NOME_PREFERENCES = "pref_lista";

    public UsuarioController(MainActivity mainActivity) {
        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        ListaUsuario = preferences.edit();

    }

    @NonNull
    @Override
    public String toString() {
        Log.d( "MVC_Controller", "Controller Inciada");
        return super.toString();

    }

    public void cadastrar(Usuario usuario) {

        Log.d("MVC_Controller", "Dados Salvos" + toString());

        ListaUsuario.putString("Nome", usuario.getNome());
        ListaUsuario.putString("Cpf", usuario.getCpf());
        ListaUsuario.putString("Senha", usuario.getSenha());
        ListaUsuario.putString("DepositoInicial", usuario.getDepositoInical());
        ListaUsuario.apply();
    }
}
