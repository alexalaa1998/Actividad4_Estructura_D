package Actividad4;

import java.util.Scanner;

public class Candidato {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCandidatos = 2;
        int numVotantes = 0;
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        String[] lista = new String[numCandidatos];
        lista[0] = "Union Democrata";
        lista[1] = "Compromiso Social";
        System.out.println("Bienvenido a la votacion de dos candidatos.");
        System.out.println("Por favor, ingrese el numero de votantes:");
        numVotantes = scanner.nextInt();
        for (int i = 0; i < numVotantes; i++) {
            System.out.println("Votante " + (i + 1) + ", por favor ingrese su voto (1 para el partido " + lista[0] + ", 2 para el partido " + lista[1] + "):");
            int voto = scanner.nextInt();
            if (voto == 1) {
                votosCandidato1++;
            } else if (voto == 2) {
                votosCandidato2++;
            } else {
                System.out.println("Voto inválido. Por favor, ingrese 1 o 2.");
                i--;
            }
        }
        System.out.println("Escrutinio de la actividad:");
        System.out.println("--------------------------");
        System.out.println(lista[0] + ": " + votosCandidato1 + " votos.");
        System.out.println(lista[1] + ": " + votosCandidato2 + " votos.");
        if (votosCandidato1 > votosCandidato2) {
            System.out.println(lista[0] + " es el ganador.");
        } else if (votosCandidato2 > votosCandidato1) {
            System.out.println("El partido politico " + lista[1] + " es el ganador.");
        } else {
            System.out.println("La votación ha terminado en empate.");
        }
    }
}



