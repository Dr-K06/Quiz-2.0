import java.util.Scanner;

public class SistemaQuiz {

    public static void main(String[] args) {
        
        // Cabeçalho
        System.out.println("Faculdade XYZ");
        System.out.println("Aluno: João da Silva");
        System.out.println("Professor: Dr. José");
        System.out.println("Bem-vindo ao Quiz! Você responderá 15 perguntas de múltipla escolha.");
        System.out.println("Tema: Ciência");
        System.out.println("---------------------------------------------");
        
        // Definindo as questões
        Questao[] perguntas = new Questao[15];

        // Preenchendo as questões (um exemplo de pergunta)
        perguntas[0] = new Questao();
        perguntas[0].pergunta = "Qual é o planeta mais próximo do Sol?";
        perguntas[0].opcaoA = "A) Terra";
        perguntas[0].opcaoB = "B) Marte";
        perguntas[0].opcaoC = "C) Vênus";
        perguntas[0].opcaoD = "D) Mercúrio";
        perguntas[0].opcaoE = "E) Júpiter";
        perguntas[0].correta = "D";

        perguntas[1] = new Questao();
        perguntas[1].pergunta = "Qual é o maior órgão do corpo humano?";
        perguntas[1].opcaoA = "A) Coração";
        perguntas[1].opcaoB = "B) Fígado";
        perguntas[1].opcaoC = "C) Cérebro";
        perguntas[1].opcaoD = "D) Pele";
        perguntas[1].opcaoE = "E) Pulmões";
        perguntas[1].correta = "D";
    }
}

        // ... Adicionar outras perguntas (15 no total)