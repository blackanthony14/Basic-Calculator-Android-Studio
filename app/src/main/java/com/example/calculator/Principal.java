package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    TextView txt, txt2;
    float numero1= 0;
    float numero2= 0;
    String operacion= "";
    float result = 0.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txt = (TextView) findViewById(R.id.txtValores);
        txt2 = (TextView) findViewById(R.id.txtdata);
    }

    public void Writte1(View view) {
        if (numero1 == 0.0f){
            txt.setText("1");
            txt2.setText("1");
            numero1 = Float.parseFloat(txt.getText().toString());
        }
        else{
            txt.setText(txt.getText() +"1");
        }
    }


    public void Writte2(View view) {

        if (numero1 == 0.0f){
            txt.setText("2");
            txt2.setText("2");
            numero1 = Float.parseFloat(txt.getText().toString());
        }
        else{
            txt.setText(txt.getText() +"2");
        }
    }

    public void Writte3(View view) {

        if (numero1 == 0.0f){
            txt.setText("3");
            txt2.setText("3");
            numero1 = Float.parseFloat(txt.getText().toString());
        }
        else{
            txt.setText(txt.getText() +"3");
        }
    }

    public void Writte4(View view) {

        if (numero1 == 0.0f){
            txt.setText("4");
            txt2.setText("4");
            numero1 = Float.parseFloat(txt.getText().toString());
        }
        else{
            txt.setText(txt.getText() +"4");
        }
    }

    public void Writte5(View view) {

        if (numero1 == 0.0f){
            txt.setText("5");
            txt2.setText("5");
            numero1 = Float.parseFloat(txt2.getText().toString());
        }
        else{
            txt.setText(txt.getText() +"5");
        }
    }

    public void Writte6(View view) {

        if (numero1 == 0.0f){
            txt.setText("6");
            txt2.setText("6");
            numero1 = Float.parseFloat(txt.getText().toString());
        }
        else{
            txt.setText(txt.getText() +"6");
        }
    }

    public void Writte7(View view) {

        if (numero1 == 0.0f){
            txt.setText("7");
            txt2.setText("7");
            numero1 = Float.parseFloat(txt.getText().toString());
        }
        else {
            txt.setText(txt.getText() + "7");
        }
    }

    public void Writte8(View view) {

        if (numero1 == 0.0f){
            txt.setText("8");
            txt2.setText("8");
            numero1 = Float.parseFloat(txt.getText().toString());
        }
        else{
            txt.setText(txt.getText() +"8");
        }
    }

    public void Writte9(View view) {

        if (numero1 == 0.0f){
            txt.setText("9");
            txt2.setText("9");
            numero1 = Float.parseFloat(txt.getText().toString());
        }
        else {
            txt.setText(txt.getText() + "9");
        }
    }

    public void Writte0(View view) {

        if (numero1 == 0.0f){
            txt.setText("0");
            txt2.setText("0");
            numero1 = Float.parseFloat(txt.getText().toString());
        }
        else{
            txt.setText(txt.getText() +"0");
        }
    }

    public void WrittePunto(View view) {

        if (numero1 == 0.0f){
            txt.setText("0.");
            numero1 = Float.parseFloat(txt.getText().toString());
        }
        else{
            if (txt.getText().toString().contains(".")){
            }
            else{
                txt.setText(txt.getText() +".");
            }
        }
    }

    public void Limpiar(View view) {
        txt.setText("0");
        numero1 = 0;
        numero2 = 0;
        operacion = "";
        txt2.setText("");
    }

    public void Dividir(View view) {
        numero1 = Float.parseFloat(txt.getText().toString());
        operacion = "/";
        txt2.setText(String.valueOf(numero1));
        txt.setText("0");

    }

    public void Resultado(View view) {
        numero2 = Float.parseFloat(txt.getText().toString());
        if (operacion == "/"){
            if (numero2 == 0.0f){
                txt.setText("0");
                Toast.makeText(this, "OPERACION INVALIDA", Toast.LENGTH_LONG).show();
                numero1=0;
                numero2=0;
                result =0;
            }
            else{
                result = numero1 / numero2;
                txt.setText(result + "");
                txt2.setText(String.valueOf(result));

                txt2.setText(String.valueOf(numero1)+operacion+String.valueOf(numero2)+"="+String.valueOf(result));
            }
        }
        else if(operacion.equals("*")){
            result = numero1 * numero2;
            txt.setText(result + "");
            txt2.setText(String.valueOf(result));

            txt2.setText(String.valueOf(numero1)+operacion+String.valueOf(numero2)+"="+String.valueOf(result));
        }
        else if(operacion.equals("+")){
            result = numero1 + numero2;
            txt.setText(result + "");
            txt2.setText(String.valueOf(result));

            txt2.setText(String.valueOf(numero1)+operacion+String.valueOf(numero2)+"="+String.valueOf(result));
        }
        else if(operacion.equals("-")){
            result = numero1 - numero2;
            txt.setText(result + "");
            txt2.setText(String.valueOf(result));

            txt2.setText(String.valueOf(numero1)+operacion+String.valueOf(numero2)+"="+String.valueOf(result));
        }
        else if(operacion.equals("^")){
            double valor = 0.0f;
            double val = 0.0f;
            valor = numero1;
            val = numero2;
            result = (float) Math.pow(valor, val);
            txt.setText(result + "");
            txt2.setText(String.valueOf(result));

            txt2.setText(String.valueOf(numero1)+operacion+String.valueOf(numero2)+"="+String.valueOf(result));
        }
        numero1 = 0;
        numero2 = 0;
        operacion ="";
    }

    public void Suma(View view) {
        numero1 = Float.parseFloat(txt.getText().toString());
        operacion = "+";
        txt2.setText(String.valueOf(numero1));
        txt.setText("");
    }

    public void Resta(View view) {
        numero1 = Float.parseFloat(txt.getText().toString());
        operacion = "-";
        txt2.setText(String.valueOf(numero1));
        txt.setText("");
    }

    public void Multiplicacion(View view) {
        numero1 = Float.parseFloat(txt.getText().toString());
        operacion = "*";
        txt2.setText(String.valueOf(numero1));
        txt.setText("");
    }

    public void Potencia(View view) {
        numero1 = Float.parseFloat(txt.getText().toString());
        operacion = "^";
        txt2.setText(String.valueOf(numero1));
        txt.setText("");
    }

    public void Borrar(View view) {

        String txt1 = txt.getText().toString();
        if (txt1.length() > 1) {
            String nwTxt = txt1.substring(0, txt1.length() - 1);
            txt.setText(nwTxt);
        }
        else{
            txt1 = "0";
            txt.setText(txt1);
        }




        /*String p = txt.getText().toString();
        int f = p.length()-1;
        String n =String.valueOf(p.charAt(f));
        p.replace(n,"");
        txt.setText(p);

        int crp = txt.getSelectionStart();
        int txtLen = txt.getText().length();
        if (crp !=0 && txtLen != 0){
            SpannableStringBuilder selec = (SpannableStringBuilder) txt.getText();
            selec.replace(crp-1,crp,"");
            txt.setText(selec);*/
    }
}