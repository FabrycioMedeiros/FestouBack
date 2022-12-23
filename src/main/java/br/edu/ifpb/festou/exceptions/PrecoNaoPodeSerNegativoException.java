package br.edu.ifpb.festou.exceptions;

public class PrecoNaoPodeSerNegativoException extends RuntimeException{
    public PrecoNaoPodeSerNegativoException(){
        super("O preço nao pode ser negativo");
    }
}
