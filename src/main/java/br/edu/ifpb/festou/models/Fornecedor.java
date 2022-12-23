package br.edu.ifpb.festou.models;

import br.edu.ifpb.festou.exceptions.PrecoNaoPodeSerNegativoException;
import jakarta.persistence.*;

@Entity
@Table(name = "fornecedor")
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nome;
    @Column
    private String telefone;

    @Column
    private String descricao;

    @Column
    private int preco;


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        if (preco < 0) {
            throw new PrecoNaoPodeSerNegativoException();
        }
        this.preco = preco;
    }
}
