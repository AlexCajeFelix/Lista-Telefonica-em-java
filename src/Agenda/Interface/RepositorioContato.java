package Agenda.Interface;
import java.math.BigInteger;
import Agenda.Pessoa.Pessoa;

public interface RepositorioContato {
    void adicionarPessoa(Pessoa pessoa);
    void removerPessoa(BigInteger numero);
    void listarPessoas();
    void buscarPorNome(String nome);
}