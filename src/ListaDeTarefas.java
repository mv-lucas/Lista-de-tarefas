import java.util.ArrayList;

public class ListaDeTarefas {
    private ArrayList<Tarefa> lista = new ArrayList<>();

    public void adicionar(String titulo ,String descricao) {
        Tarefa nova = new Tarefa(titulo, descricao);
        lista.add(nova);
    }

    public void listar() {
        if(lista.isEmpty()){
            System.out.println("Lista vazia!");
            return;
        }
        for(Tarefa t : lista){
            t.exibir();
        }
    }

    public Tarefa buscaPorId(int id) {
        for (Tarefa t : lista) {
            if (t.getId() == id) {
                return t;
            }
        }
        throw new IllegalArgumentException("Tarefa não encontrada!");
    }

    public void concluir(int id) {
        Tarefa t = buscaPorId(id);
        t.concluir();
    }

    public void remover(int id) {
        Tarefa t = buscaPorId(id);
        lista.remove(t);
    }
}
