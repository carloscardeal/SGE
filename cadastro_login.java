

import java.util.Scanner;


public class cadastro_login {


    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        String senha = "null"; //declarando variavel senha aqui para ser enxergada fora do while


        // solicitando nome completo do usuario

        System.out.println("Insira seu nome completo:");

        String nome = ler.nextLine();


        //pegando último sobrenome

        StringBuilder ultimo = new StringBuilder("_");



        for (int i = nome.lastIndexOf(" ")+1; i <= nome.length(); i++){

            if (i < nome.length()) {

                ultimo.append(nome.charAt(i));

            }

        }


        // define login como a primeira letra do nome e ultimo sobrenome

        String login = nome.charAt(0)+ultimo.toString();


        // validando senha que será criada

        boolean validaSenhaPadrao = false;


        while (validaSenhaPadrao == false){


            System.out.println("Defina uma senha que contenha no minimo 8 digitos, uma letra maiuscula, " + "\n" + "uma letra minuscula, um numero e um caracter especial (-, !, @)");

            senha = ler.nextLine();


            if (senha.length() >= 8 && senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+")){

                System.out.println("Cadastro Realizado com Sucesso");

                validaSenhaPadrao = true;

            } else{

                System.out.println("Senha invalida");

            }

        }
         // informa login e senha ao usuário
        System.out.println(" ");
        System.out.println("Seu login é: " + login);
        System.out.println("Sua senha é: " + senha);
        System.out.println(" ");
        System.out.println("Redirecionando para Login");



        // validando login e senha criados para realizar login

        boolean doLogin = false;


        while (doLogin == false){

            System.out.println(" ");
            System.out.println("Insira seu login:");

            String vLogin = ler.nextLine();

            System.out.println(" ");
            System.out.println("Insira sua senha:");

            String vSenha = ler.nextLine();


            if (vLogin.equals(login) && vSenha.equals(senha)){

                System.out.println("Login realizado com sucesso!");

                doLogin = true;

            }else{

                System.out.println("Ops, login ou senha invalida. Tente novamente!");

            }


        }


    }

}

