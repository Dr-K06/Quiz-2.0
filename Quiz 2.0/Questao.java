import java.util.Scanner;

public class Questao {
    private String pergunta;
    private String[] opcoes;
    private int respostaCorreta;

    // Construtor
    public Questao(String pergunta, String[] opcoes, int respostaCorreta) {
        this.pergunta = pergunta;
        this.opcoes = opcoes;
        this.respostaCorreta = respostaCorreta;
    }

    // Métodos para acessar os dados da questão
    public String getPergunta() {
        return pergunta;
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    // Método para verificar se a resposta do usuário está correta
    public boolean verificarResposta(int resposta) {
        return resposta == respostaCorreta;
    }
}

 class Quiz {
    private Questao[] questoes;
    private Scanner scanner;

    // Construtor
    public Quiz(Questao[] questoes) {
        this.questoes = questoes;
        this.scanner = new Scanner(System.in);
    }

    // Método para rodar o quiz
    public void rodar() {
        int pontuacao = 0;
        for (int i = 0; i < questoes.length; i++) {
            Questao questao = questoes[i];

            System.out.println("\nPergunta " + (i + 1) + ": " + questao.getPergunta());
            String[] opcoes = questao.getOpcoes();
            for (int j = 0; j < opcoes.length; j++) {
                System.out.println((j + 1) + ". " + opcoes[j]);
            }

            int respostaUsuario = -1;

            // Garantir que o usuário digite um valor entre 1 e 5
            while (respostaUsuario < 1 || respostaUsuario > 5) {
                System.out.print("Escolha uma opção (1-5): ");
                if (scanner.hasNextInt()) {
                    respostaUsuario = scanner.nextInt();
                } else {
                    scanner.next(); // Descartar a entrada inválida
                    System.out.println("Entrada inválida! Por favor, insira um número entre 1 e 5.");
                    continue;
                }
            }

            // Verificando se a resposta está correta
            if (questao.verificarResposta(respostaUsuario )) {
                System.out.println("Resposta correta!\n");
                pontuacao++;
            } else {
                System.out.println("Resposta incorreta. A resposta correta é: " +
                        opcoes[questao.getRespostaCorreta()] + "\n");
            }
        }

        System.out.println("\nVocê terminou o quiz! Sua pontuação final é: " + pontuacao + "/" + questoes.length);
    }

    // Método para criar as questões
    /**
     * @return
     */
    public static Questao[] criarQuestoes() {
        return new Questao[] {
            new Questao("Qual é a capital da Alemanha?", new String[]{"Roma", "Paris", "Berlim", "Madrid", "Londres"}, 3),
            new Questao("Qual é a capital da França?", new String[]{"Paris", "Roma", "Madrid", "Berlim", "Londres"}, 1),
            new Questao("Qual é a capital da Inglaterra?", new String[]{"Roma", "Paris", "Madrid", "Berlim", "Londres"}, 5),
        };
    }
    public static void main(String[] args) {
        Questao[] questoes = criarQuestoes(); // Criando as questões usando o método auxiliar
        Quiz quiz = new Quiz(questoes);
        quiz.rodar(); // Rodando o quiz
    }
}