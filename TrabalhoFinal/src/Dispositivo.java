import java.util.ArrayList;
import java.util.List;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus
 */
public abstract class Dispositivo {
    private String Nome;
    private int Porta;
    private char Unidade;
    private int Tamanho;
    private boolean Conectado;
    private List<Pasta> Pastas;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    

    public int getPorta() {
        return Porta;
    }

    public void setPorta(int Porta) {
        this.Porta = Porta;
    }

    public char getUnidade() {
        return Unidade;
    }

    public void setUnidade(char Unidade) {
        this.Unidade = Unidade;
    }

    public int getTamanho() {
        return Tamanho;
    }

    public void setTamanho(int Tamanho) {
        this.Tamanho = Tamanho;
    }

    public boolean isConectado() {
        return Conectado;
    }

    public void setConectado(boolean Conectado) {
        this.Conectado = Conectado;
    }

    public List<Pasta> getPastas() {
        return Pastas;
    }

    public void setPastas(List<Pasta> Pastas) {
        this.Pastas = Pastas;
    }
}
