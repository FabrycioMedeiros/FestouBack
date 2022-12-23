package br.edu.ifpb.festou.models;

import br.edu.ifpb.festou.exceptions.ClienteDeveSerMaiorDe18AnosException;
import jakarta.persistence.*;
import org.apache.catalina.User;
import org.w3c.dom.Text;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private int idade;
    @Column(unique = true)
    private String nome;
    @Column
    private String telefone;
    @Column
    private String email;

    public Long getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 18){
            throw new ClienteDeveSerMaiorDe18AnosException();
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { this.nome = nome;}

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}