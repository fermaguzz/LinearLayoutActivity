package edu.iest.linearlayoutactivity

import android.content.Context
import android.widget.Toast
import android. view. View
import com.google.android.material.snackbar.Snackbar

class Mensajes( var mensaje: String, var context: Context) {

    fun mostrarToast(){
        Toast.makeText(context, mensaje, Toast.LENGTH_LONG).show()

    }
    fun mostrarSnackbar(miVista:View) {
        Snackbar.make(miVista,mensaje, Snackbar.LENGTH_LONG).show()
    }

}