/* ALUNO: JOÁS FYLLIPE VIEIRA SOLANO
   ALUNO: GABRIEL MAGALHÃES
   ATIVIDADE DE LÓGICA MATEMÁTICA. */

import java.util.Scanner;

public class TabelaVerdade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = 0;
        int q = 0;

        System.out.println("Digite o conectivo: e, ou , se entao, se somente se.");
        String conectivo = sc.nextLine(); // Lê-se qual conectivo para a proposicao.
        
        System.out.println("Digite o valor de p (1 = V ou 0 = F): ");
        p = sc.nextInt();
        
        System.out.println("Digite o valor de q (1 = V ou 0 = F): ");
        q = sc.nextInt();

        String proposicao = " ";
        
        switch (conectivo) { // Escolhe o conectivo da proposicao.
            case "e": 
                if((p==1 && q==1)){
                    proposicao = "Resultado: V";
                }else{
                    proposicao = "Resultado: F";
                }
                break;
            case "ou":
                if ((p==1 && q==1) || (p==0 && q==1) || (p==1 && q==0) ){
                    proposicao = "Resultado: V";
                }else if(p==0 && q ==0){
                    proposicao = "Resultado: F";
                }
                break;
            case "se entao":
                if((p==0 && q==1) || (p==0 && q==0)){
                    proposicao = "Resultado: V";
                }else {
                    proposicao = "Resultado: F";
                }
                break;
            case "se somente se":
                if(p==q){
                    proposicao = "Resultado: V";
                }else{
                    proposicao = "Resultado: F";
                }
                break;
            default: // Se não for identificado nenhum conectivo válido, imprime conectivo inválido.
                proposicao = "Conectivo inválido!";
                break;
        }

        System.out.println(proposicao);
        
        sc.close();
    }
}
