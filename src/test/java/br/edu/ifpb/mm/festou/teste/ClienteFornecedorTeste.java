package br.edu.ifpb.mm.festou.teste;

import br.edu.ifpb.festou.exceptions.ClienteDeveSerMaiorDe18AnosException;
import br.edu.ifpb.festou.exceptions.PrecoNaoPodeSerNegativoException;
import br.edu.ifpb.festou.models.Cliente;
import br.edu.ifpb.festou.models.Fornecedor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteFornecedorTeste {
    Cliente c1;
    Fornecedor f1;

    @BeforeEach
    public void configuraClasses() {
      c1 = new Cliente();
      c1.setIdade(20);
      f1 = new Fornecedor();
      f1.setPreco(12);
    }


    @Test
    public void IdadeNaoPodeSerMenorQue18() {
        int idadeValido = 15;

        Assertions.assertThrows(ClienteDeveSerMaiorDe18AnosException.class, () -> {
            c1.setIdade(idadeValido);
        });

    }

    @Test
    public void PrecoNaoPodeSerNegativo(){
        int precoValido = -10;

        Assertions.assertThrows(PrecoNaoPodeSerNegativoException.class, () -> {
            f1.setPreco(precoValido);
        });
    }

    @Test
    public void PrecoInseridoCorretamente(){
        int precoValido = 10;
        f1.setPreco(precoValido);
        Assertions.assertEquals(10, f1.getPreco());
    }

}
