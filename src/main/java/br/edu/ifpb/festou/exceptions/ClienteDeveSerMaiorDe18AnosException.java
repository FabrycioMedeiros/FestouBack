package br.edu.ifpb.festou.exceptions;

import br.edu.ifpb.festou.models.Cliente;

public class ClienteDeveSerMaiorDe18AnosException extends RuntimeException{
    public ClienteDeveSerMaiorDe18AnosException(){
        super("Cliente deve ser maior de 18 anos");
    }
}
