package sample;

import funcoes.HeartRates;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller<b> implements Initializable {
    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtSobrenome;

    @FXML
    private TextField txtDia;

    @FXML
    private TextField txtMes;

    @FXML
    private TextField txtAno;

    @FXML
    private Button btnAdicionar;

    @FXML
    private Label lblAdicionarAviso;

    @FXML
    private ComboBox<HeartRates> pessoaSelecionadaCB;

    @FXML
    private Button btnVerDados;

    @FXML
    private Label lblIdade;

    @FXML
    private Label lblFrequenciaMaxima;

    @FXML
    private Label lblFrequenciaAlvo;

    private ArrayList<HeartRates> pessoas = new ArrayList<HeartRates>();

    private void atualizarComboBox(){
        pessoaSelecionadaCB.getItems().removeAll(pessoaSelecionadaCB.getItems());
        ArrayList<String> b = new ArrayList<String>();
        for (HeartRates a : pessoas){
            b.add(a.getNome() + " " + a.getSobrenome());
        }
        pessoaSelecionadaCB.getItems().addAll(pessoas);
    }
    @FXML
    void AdicionarPessoaPressionado(ActionEvent event) {
        String nome = txtNome.getText().toString();
        String sobrenome = txtSobrenome.getText().toString();
        int dia = Integer.parseInt(txtDia.getText());
        int mes = Integer.parseInt(txtMes.getText());
        int ano = Integer.parseInt(txtAno.getText());
        HeartRates possivelPessoaNova = new HeartRates(nome, sobrenome, dia, mes, ano);
        boolean pessoaJaExiste = false;
        for (HeartRates a : pessoas){
            if (a.equals(possivelPessoaNova)){
                pessoaJaExiste = true;
                lblAdicionarAviso.setText("Adicione uma pessoa nova!");
                lblAdicionarAviso.setTextFill(Color.rgb(255, 0, 0));
                break;
            }
        }
        if(!pessoaJaExiste){
            lblAdicionarAviso.setText("Pessoa adicionada com sucesso!");
            lblAdicionarAviso.setTextFill(Color.rgb(0, 255, 103));
            pessoas.add(possivelPessoaNova);
            txtNome.setText("");
            txtSobrenome.setText("");
            txtDia.setText("");
            txtMes.setText("");
            txtAno.setText("");
            atualizarComboBox();
        }
    }
    @FXML
    void verDadosPressionado(ActionEvent event) {
        HeartRates pessoaSelecionada = pessoaSelecionadaCB.getSelectionModel().getSelectedItem();
        lblIdade.setText(Integer.toString(pessoaSelecionada.getIdade()));
        lblFrequenciaMaxima.setText(pessoaSelecionada.getFrequenciaCardiacaPorMinutoMaxima() + " BPM");
        lblFrequenciaAlvo.setText(pessoaSelecionada.getFrequenciaAlvo()[0] + " - " + pessoaSelecionada.getFrequenciaAlvo()[1]);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
