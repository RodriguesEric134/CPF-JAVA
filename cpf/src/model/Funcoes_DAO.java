package model;
import java.util.Random;
import javax.swing.JOptionPane;
public class Funcoes_DAO {
    public static int [] vet = new int[11];
    public static int [] vet2= {10, 9,8,7,6,5,4,3,2};
    public static int [] vet3 = new int[11];
    public static int soma =0;
    public static int penultimo=0 , ultimo=0;
    public static int [] vet4= {11,10, 9,8,7,6,5,4,3,2};
    public static void gerar(){
        Random ale = new Random();
        // ---------- Inicio -> Calculo Primeiro Digito
        for(int c =0; c < 9; c++ ){
            vet[c] = ale.nextInt(10);

            vet3[c] = vet[c] * vet2[c];

            soma = soma + vet3[c];
        }
        //-ok
        int resto = soma % 11;
        if(resto < 2 ){

            vet[9] = 0;
        }else{
            resto = 11- resto;
            vet[9] = resto;
        }
        //  JOptionPane.showMessageDialog(null,vet[0]+" " + vet[1]+" "+ vet[2]+"." + vet[3]+" "+ vet[4]+" "+ vet[5]+"."+ vet[6]+" "+ vet[7]+" "+ vet[8]+"-"+ vet[9]+" ");
        for(int c =0; c < 10; c++ ){

            soma = soma +  (vet[c] * vet4[c]);
        }
        resto = soma % 11;

        if(resto < 2 ){

            vet[10] = 0;
        }else{
            resto = 11- resto;
            vet[10] = resto;
        }

        JOptionPane.showMessageDialog(null,vet[0]+" " + vet[1]+" "+ vet[2]+"." + vet[3]+" "+ vet[4]+" "+ vet[5]+"."+ vet[6]+" "+ vet[7]+" "+ vet[8]+"-"+ vet[9]+" "+ vet[10]);

        // ---------- Fim -> Calculo Primeiro Digito ok

        // ---------- Inicio -> Calculo Segundo Digito

    }



    public static void validar(){
        for(int c =0; c < 11; c++ ){

            String x = JOptionPane.showInputDialog("Digite a posição "+ (c+1)+ " do seu CPF");
            vet[c] = Integer.parseInt(x);
        }
        for(int c =0; c < 9; c++ ){

            vet3[c] = vet[c] * vet2[c];

            soma = soma + vet3[c];
        }
        int resto = soma % 11;

        if(resto < 2 ){

            penultimo = 0;
        }else{
            resto = 11- resto;
            penultimo = resto;
        }
        //--- primeiro digito
        System.out.println(penultimo);

        // -> Á CORRIGIR
        soma =0;
        for(int c =0; c < 10; c++ ){

            soma = soma +  (vet[c] * vet4[c]);

        }
        resto = soma % 11;

        if(resto < 2 ){

            ultimo = 0;
        }else{
            resto = 11- resto;
            ultimo = resto;
        }
        if(vet[9] == penultimo && vet[10] == ultimo){
            JOptionPane.showMessageDialog(null,"CPF Verdadeiro");
        }else{
            JOptionPane.showMessageDialog(null,"CPF Falso");
        }





    }
}