package funcoes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HeartRates {
    String nome;
    String sobrenome;
    int diaNasc;
    int mesNasc;
    int anoNasc;

    public HeartRates(String nome, String sobrenome, int diaNasc, int mesNasc, int anoNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
    }
    public boolean equals(HeartRates outro){
        if((outro.getNome().equals(this.nome) && outro.getSobrenome().equals(this.sobrenome))){
            return true;
        }
        return false;
    }

    public int getIdade() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        LocalDate localDate = LocalDate.now();
        int anoAtual = Integer.parseInt(dtf.format(localDate));
        dtf = DateTimeFormatter.ofPattern("MM");
        int mesAtual = Integer.parseInt(dtf.format(localDate));
        dtf = DateTimeFormatter.ofPattern("dd");
        int diaAtual = Integer.parseInt(dtf.format(localDate));
        int idadeTotal = anoAtual - anoNasc;
        idadeTotal--; //Já tira um ano, se a pessoa já tiver feito aniversário, que irá ser somado de novo

        if ((mesAtual >= mesNasc) && (diaAtual >= diaNasc)) {
            idadeTotal++;
        }
        return idadeTotal;
    }
    public int getFrequenciaCardiacaPorMinutoMaxima(){
        return 220 - getIdade();
    }
    /**
     * @return Retorna o valor mínimo e o valor máximo da frequência alvo
     */
    public int[] getFrequenciaAlvo(){
        int[] frequenciaAlvo = new int[2];
        int minimo = (int) (getFrequenciaCardiacaPorMinutoMaxima() * 0.5);
        int maximo = (int) (getFrequenciaCardiacaPorMinutoMaxima() * 0.85);
        frequenciaAlvo[0] = minimo;
        frequenciaAlvo[1] = maximo;
        return frequenciaAlvo;
    }
    //Gets
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    //Metodo que muda o que o usuario vai ver na interface grafica(na comboBox)
    @Override
    public String toString(){
        return nome + " " + sobrenome;
    }
}
