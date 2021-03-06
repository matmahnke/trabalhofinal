
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matheus
 */
public class Computador {

    private String Nome;
    private USB[] USB;
    private Paralela[] Paralela;

    public Computador(String nome, int nPortasUSB, int nPortasPar) {   
        this.setNome(nome);
        this.USB = new USB[nPortasUSB];
        this.Paralela = new Paralela[nPortasPar];
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void conectarUSB(USB disp) {
        int numero = 0;
        int porta = 0;
        for (int i = 0; i < USB.length; i++) {
            if (USB[i] == null) {
                numero = i;
                porta += i;
                break;
            }
        }
        for (int i = 0; i < Paralela.length; i++) {
            if (Paralela[i] == null) {
                porta += i;
            }
        }
        disp.setNome("USB" + numero);
        disp.setPorta(porta);
        disp.setUnidade((char) disp.getPorta());
        if (!disp.isConectado()) {
            disp.setConectado(true);
        } else {
            JOptionPane.showInputDialog("Dispositivo já está conectado em outro lugar");
        }
        this.USB[numero] = disp;
    }

    public void conectarPar(Paralela disp) {
        int numero = 0;
        int porta = 0;
        for (int i = 0; i < Paralela.length; i++) {
            if (Paralela[i] == null) {
                numero = i;
                porta += i;
                break;
            }
        }
        for (int i = 0; i < USB.length; i++) {
            if (USB[i] == null) {
                porta += i;
            }
        }
        disp.setNome("PAR" + numero);
        disp.setPorta(porta);
        disp.setUnidade((char) disp.getPorta());
        if (!disp.isConectado()) {
            disp.setConectado(true);
        } else {
            JOptionPane.showInputDialog("Dispositivo já está conectado em outro lugar");
        }
        this.Paralela[numero] = disp;

    }

    public void trazPastasArquivos() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < USB.length; i++) {
            for (Pasta p : USB[i].getPastas()) {
                for (Arquivo a : p.getArquivos()) {
                    sb.append("Pasta: " + p.getNome()
                            + ", Arquivo: " + a.getNome()
                            + ", Tamanho: " + a.getTamanho());
                }
            }
        }
    }

    public void trazNomeUnidadeDoDispositivo() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < USB.length; i++) {
            sb.append("Nome: " + USB[i].getNome()
                    + ", Unidade: "
                    + USB[i].getUnidade()
                    + ", Porta: "
                    + USB[i].getPorta());
        }
        for (int i = 0; i < Paralela.length; i++) {
            sb.append("Nome: " + Paralela[i].getNome()
                    + ", Unidade: "
                    + Paralela[i].getUnidade()
                    + ", Porta: "
                    + Paralela[i].getPorta());
        }
        JOptionPane.showInputDialog(sb.toString());
    }

    public USB[] getUSB() {
        return USB;
    }

    public void setUSB(USB[] USB) {
        this.USB = USB;
    }

    public Paralela[] getParalela() {
        return Paralela;
    }

    public void setParalela(Paralela[] Paralela) {
        this.Paralela = Paralela;
    }
}
