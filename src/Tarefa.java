public class Tarefa {
    private static int contador = 0;
    private final int id;
    private final String titulo;
    private final String descricao;
    private boolean concluida = false;

    public Tarefa(String titulo, String descricao) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("O titulo não pode ser vazio!");
        }
        contador++;
        this.id = contador;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void concluir() {
        if (!concluida) {
            concluida = true;
        } else {
            throw new IllegalStateException("Tarefa já concluída");
        }
    }

    public void exibir() {
        System.out.print("[" + id + "]");
        if (concluida) {
            System.out.println(" [X] " + titulo);
        } else {
            System.out.println(" [ ] " + titulo);
        }
    }
}
