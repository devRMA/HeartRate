package sample;

import funcoes.HeartRates;
import java.util.Scanner;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Exercicio 3");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    private static void limparTela(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static void main(String[] args){
        launch(args);
        /*
        Scanner input = new Scanner(System.in);
        ArrayList<HeartRates> pessoas = new ArrayList<HeartRates>();
        boolean cadastrarPessoa = true;
        boolean saberDadosSobreUmaPessoa = false;
        while (cadastrarPessoa) {
            System.out.print("Digite um nome('aa' para parar de cadastrar pessoas): ");
            String nome = input.nextLine();
            if (nome.equals("aa")){
                limparTela();
                cadastrarPessoa = false;
                break;
            }
            System.out.printf("Digite o sobrenome do(a) %s: ", nome);
            String sobrenome = input.nextLine();
            System.out.printf("Digite o dia em que o(a) %s %s nasceu: ", nome, sobrenome);
            int dia = Integer.parseInt(input.nextLine());
            System.out.printf("Digite o mês em que o(a) %s %s nasceu: ", nome, sobrenome);
            int mes = Integer.parseInt(input.nextLine());
            System.out.printf("Digite o ano em que o(a) %s %s nasceu: ", nome, sobrenome);
            int ano = Integer.parseInt(input.nextLine());
            HeartRates pessoa = new HeartRates(nome, sobrenome, dia, mes, ano);
            pessoas.add(pessoa);
            limparTela();
        }
        while (true) {
            System.out.println("Digite 1 para listar todos as pessoas cadastradas.");
            System.out.println("Digite 2 para selecionar uma pessoa.");
            System.out.println("Digite 3 para fechar o programa.");
            int escolha = Integer.parseInt(input.nextLine());
            limparTela();
            if (escolha == 1) {
                for (HeartRates a : pessoas) {
                    System.out.println("[" + (pessoas.indexOf(a) + 1) + "] " + a.getNome() + " " + a.getSobrenome() + ".");
                }
            } else if (escolha == 2) {
                System.out.print("Digite o codigo da pessoa: ");
                escolha = Integer.parseInt(input.nextLine());
                if (escolha - 1 >= 0 && escolha - 1 <= pessoas.size()) {
                    HeartRates pessoaEscolhida = pessoas.get(escolha - 1);
                    limparTela();
                    saberDadosSobreUmaPessoa = true;
                    while (saberDadosSobreUmaPessoa) {
                        System.out.println("Pessoa Selecionada : " + pessoaEscolhida.getNome() + " " + pessoaEscolhida.getSobrenome());
                        System.out.println("Digite 1 para saber sua idade.");
                        System.out.println("Digite 2 para saber sua frequência cardíaca máxima.");
                        System.out.println("Digite 3 para saber sua frequência cardíaca alvo.");
                        System.out.println("Digite 4 para escolher outra pessoa.");
                        int escolha2 = Integer.parseInt(input.nextLine());
                        limparTela();
                        if (escolha2 == 1) {
                            System.out.println("O(A) " + pessoaEscolhida.getNome() + " tem " + pessoaEscolhida.getIdade() + " anos.");
                        } else if (escolha2 == 2) {
                            System.out.println("A frequência cardíaca máxima do(a) " + pessoaEscolhida.getNome() + " é " + pessoaEscolhida.getFrequenciaCardiacaPorMinutoMaxima() + "BPM.");
                        } else if (escolha2 == 3) {
                            System.out.println("A frequência alvo do(a) " + pessoaEscolhida.getNome() + " é " + pessoaEscolhida.getFrequenciaAlvo()[0] + "-" + pessoaEscolhida.getFrequenciaAlvo()[1] + ".");
                        } else {
                            saberDadosSobreUmaPessoa = false;
                        }
                    }
                } else {
                    System.out.println("Digite um código valido!");
                }
            }
            if (escolha == 3) {
                System.exit(0);
            }
        }*/
    }
}
