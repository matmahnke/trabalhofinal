
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

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void conectarUSB(USB disp) {
            this.USB = new USB[USB.length + 1];
            disp.setNome("USB" + USB.length);
            disp.setPorta(USB.length+Paralela.length);
            disp.setUnidade((char)disp.getPorta());
            if(!disp.isConectado())
                disp.setConectado(true);
            else
                JOptionPane.showInputDialog("Dispositivo já está conectado em outro lugar");
            this.USB[USB.length] = disp;
    }
    public void conectarPar(Paralela disp){
            this.Paralela = new Paralela[Paralela.length + 1];
            disp.setNome("PAR" + Paralela.length);
            disp.setPorta(Paralela.length+USB.length);
            disp.setUnidade((char)disp.getPorta());
            if(!disp.isConectado())
                disp.setConectado(true);
            else
                JOptionPane.showInputDialog("Dispositivo já está conectado em outro lugar");
            this.Paralela[Paralela.length] = disp;
        
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
