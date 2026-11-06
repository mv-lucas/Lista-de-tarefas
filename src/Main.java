void main() {
    ListaDeTarefas l = new ListaDeTarefas();

    System.out.println("=== lista vazia ===");
    l.listar();

    l.adicionar("Comprar pão", "Na padaria");
    l.adicionar("Estudar Java", "ArrayList");
    l.adicionar("Lavar louça", "");

    l.concluir(2);
    l.remover(3);

    System.out.println("\n=== depois de concluir a 2 e remover a 3 ===");
    l.listar();

    System.out.println("\n=== erros ===");
    try {
        l.concluir(99);
        System.out.println("NAO DEVERIA CHEGAR AQUI");
    } catch (IllegalArgumentException e) {
        System.out.println("Erro: " + e.getMessage());
    }

    try {
        l.remover(3);
        System.out.println("NAO DEVERIA CHEGAR AQUI");
    } catch (IllegalArgumentException e) {
        System.out.println("Erro: " + e.getMessage());
    }

    try {
        l.concluir(2);
        System.out.println("NAO DEVERIA CHEGAR AQUI");
    } catch (IllegalStateException e) {
        System.out.println("Erro: " + e.getMessage());
    }

    try {
        l.adicionar("", "sem título");
        System.out.println("NAO DEVERIA CHEGAR AQUI");
    } catch (IllegalArgumentException e) {
        System.out.println("Erro: " + e.getMessage());
    }
}