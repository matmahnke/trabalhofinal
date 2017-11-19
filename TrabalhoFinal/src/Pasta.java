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
public class Pasta {
    private String Nome;
    private String Diretorio;
    private List<Arquivo> Arquivos;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDiretorio() {
        return Diretorio;
    }

    public void setDiretorio(String Diretorio) {
        this.Diretorio = Diretorio;
    }

    public List<Arquivo> getArquivos() {
        return Arquivos;
    }

    public void setArquivos(List<Arquivo> Arquivos) {
        this.Arquivos = Arquivos;
    }
}
