package Agenda;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import Agenda.Interface.RepositorioContato;
import Agenda.Pessoa.Pessoa;

public class Agenda implements RepositorioContato {
    List<Pessoa> listPessoa;

    public Agenda() {
        this.listPessoa = new ArrayList<>();
    }

    @Override
    public void adicionarPessoa(Pessoa pessoa) {
        listPessoa.add(pessoa);
        System.out.println("Deu certo pessoa add");
    }

    @Override
    public void removerPessoa(BigInteger numero) {
        if(listPessoa.isEmpty()){
            System.out.println("lista vazia ou esse numero não existe");
        }else{
            listPessoa.removeIf(pessoa -> pessoa.getNumber().equals(numero));
        }
    }

    @Override
    public  void listarPessoas() {
        if (listPessoa.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            for (Pessoa pessoa : listPessoa) {
                System.out.println(pessoa);
            }
        }
    
    }

    @Override
    public void buscarPorNome(String nome) {
        if (listPessoa.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            listPessoa.stream().filter(n -> n.getName().equalsIgnoreCase(nome)).forEach(System.out::println);
        }
       
    }

}
