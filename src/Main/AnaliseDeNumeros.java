package Main;

import java.io.IOException;
import java.util.Scanner;

public class AnaliseDeNumeros {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();
        int n3 = leitor.nextInt();
        int n4 = leitor.nextInt();
        int n5 = leitor.nextInt();

        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

//continue a solução

        if(n1%2==0){
            par++;
        }else if (n1%2!=0){
            impar++;
        }if (n1>0){
            positivo++;
        }else if (n1<0){
            negativo++;
        }

        if(n2%2==0){
            par++;
        }else if (n2%2!=0){
            impar++;
        }if (n2>0){
            positivo++;
        }else if (n2<0){
            negativo++;
        }

        if(n3%2==0){
            par++;
        }else if (n3%2!=0){
            impar++;
        }if (n3>0){
            positivo++;
        }else if (n3<0){
            negativo++;
        }

        if(n4%2==0){
            par++;
        }else if (n4%2!=0){
            impar++;
        }if (n4>0){
            positivo++;
        }else if (n4<0){
            negativo++;
        }

        if(n5%2==0){
            par++;
        }else if (n5%2!=0){
            impar++;
        }if (n5>0){
            positivo++;
        }else if (n5>0){
            negativo++;
        }

//insira suas variaveis corretamente
        System.out.println( par + " valor(es) par(es)");
        System.out.println( impar + " valor(es) impar(es)");
        System.out.println( positivo + " valor(es) positivo(s)");
        System.out.println( negativo + " valor(es) negativo(s)");
    }
}
