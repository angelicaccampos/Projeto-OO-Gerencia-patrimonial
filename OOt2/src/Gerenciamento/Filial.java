package Gerenciamento;

import java.util.ArrayList;
import java.util.List;

public class Filial {
    private String nome;
    private String endereco;
    private List<Patrimonio> patrimonios;

    public Filial(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.patrimonios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Patrimonio> getPatrimonios() {
        return patrimonios;
    }

    public void setPatrimonios(List<Patrimonio> patrimonios) {
        this.patrimonios = patrimonios;
    }

    public void listarPatrimonio() {
        System.out.println("Patrimônios da filial " + nome + ":");
        for (Patrimonio p : patrimonios) {
            System.out.println("- " + p.getNome() + " (" + p.getDescricao() + ")");
        }
    }

    // CRUD
    public void cadastrarPatrimonio(Patrimonio p) {
        patrimonios.add(p);
    }

    public void deletarPatrimonio(Patrimonio p) {
        patrimonios.remove(p);
    }

    public void atualizarPatrimonio(Patrimonio pAntigo, Patrimonio pNovo) {
        int index = patrimonios.indexOf(pAntigo);
        patrimonios.set(index, pNovo);
    }

    public Patrimonio buscarPatrimonio(String nome) {
        for (Patrimonio p : patrimonios) {
            if (p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }
}

