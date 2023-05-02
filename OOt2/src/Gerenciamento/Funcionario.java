package Gerenciamento;

import java.util.ArrayList;
import java.util.List;


public class Funcionario extends Filial {
    private String nome;
    private String cpf;
    private String cargo;
    private String telefone;
    private int qtdePatrimonio;
    private List<Patrimonio> patrimonios;

    public Funcionario(String nome, String cpf, String cargo, String telefone, int qtdePatrimonio, String nomeFilial, String enderecoFilial) {
        super(nomeFilial, enderecoFilial);
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.telefone = telefone;
        this.qtdePatrimonio = qtdePatrimonio;
        this.patrimonios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getQtdePatrimonio() {
        return qtdePatrimonio;
    }

    public void setQtdePatrimonio(int qtdePatrimonio) {
        this.qtdePatrimonio = qtdePatrimonio;
    }}
