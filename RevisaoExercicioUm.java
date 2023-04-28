import java.util.Scanner;
public class RevisaoExercicioUm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int PorcentagemInfectado = 0;
    int ContadorErro = 0;
    String StatusCartao, Sintoma, Contato, RetornoViagem;

    System.out.print("Informe seu nome: ");
    String nome = sc.next();
    System.out.print("Informe sua idade: ");
    int idade = sc.nextInt();

    while (true) {

      while (true) {
        System.out.println("Seu cartão de vacina está em dia?(Digite 'sim' ou 'nao'): ");
        StatusCartao = sc.next();
        if (StatusCartao.equals("nao")) {
          PorcentagemInfectado = PorcentagemInfectado + 10;
          break;
        } else if (StatusCartao.equals("sim")) {
          break;
        } else {
          ContadorErro++;
          if (ContadorErro == 3) {
            break;
          }
        }
      }
      if (ContadorErro == 3) {
        System.out.println("\nNão foi possível realizar o diagnóstico. \nGentileza procurar ajuda médica caso apareça algum sintoma.");
        break;
      }
      ContadorErro = 0;//Reinicio o contador

      while (true) {
        System.out.println("Teve algum dos sintomas recentemente? Como dor de cabeça, febre, náusea, dor articular, gripe. (Digite 'sim' ou 'nao'): ");
        Sintoma = sc.next();
        if (Sintoma.equals("sim")) {
          PorcentagemInfectado = PorcentagemInfectado + 30;
          break;
        } else if (Sintoma.equals("nao")) {
          break;
        } else {
          ContadorErro++;
          if (ContadorErro == 3) {
            break;
          }
        }
      }
      if (ContadorErro == 3) {
        System.out.println("\nNão foi possível realizar o diagnóstico. \nGentileza procurar ajuda médica caso apareça algum sintoma.");
        break;
      }
      ContadorErro = 0;//Reinicio o contador

      while (true) {
        System.out.println("Teve contato com pessoas com sintomas gripais nos últimos dias? (Digite 'sim' ou 'nao'): ");
        Contato = sc.next();
        if (Contato.equals("sim")) {
          PorcentagemInfectado = PorcentagemInfectado + 30;
          break;
        } else if (Contato.equals("nao")) {
          break;
        } else {
          ContadorErro++;
          if (ContadorErro == 3) {
            break;
          }
        }
      }
      if (ContadorErro == 3) {
        System.out.println("\nNão foi possível realizar o diagnóstico. \nGentileza procurar ajuda médica caso apareça algum sintoma.");
        break;
      }
      ContadorErro = 0;//Reinicio o contador

      while (true) {
        System.out.println("Está retornando de viagem realizada no exterior? (Digite 'sim' ou 'nao'): ");
        RetornoViagem = sc.next();
        if (RetornoViagem.equals("sim")) {
          PorcentagemInfectado = PorcentagemInfectado + 30;
          System.out.println("\nVocê ficará sob observação por 05 dias.");
          break;
        } else if (RetornoViagem.equals("nao")) {
          break;
        } else {
          ContadorErro++;
          if (ContadorErro == 3) {
            break;
          }
        }
      }
      if (ContadorErro == 3) {
        System.out.println("\nNão foi possível realizar o diagnóstico. \nGentileza procurar ajuda médica caso apareça algum sintoma.");
        break;
      }
      ContadorErro = 0;//Reinicio o contador
      
      System.out.printf("\nNome: " + nome + "\nIdade: " + idade);
      System.out.printf ("\nCartão de vacina está em dia: " + StatusCartao + "\nTeve sintomas recentemente: " + Sintoma + "\nTeve contato com pessoas infectadas: " + Contato + "\nEstá retornando de viagem: " + RetornoViagem);
      System.out.printf("\nSua probabilidade de estar infectado(a) é de: " + PorcentagemInfectado);

      if (PorcentagemInfectado <= 30)
      System.out.println("\nPaciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
    else if (PorcentagemInfectado <= 70)//Coloquei 70% pois o programa não imprimia nada se desse esse valor.
      System.out.println("\nPaciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");
    else if (PorcentagemInfectado >= 90)
      System.out.println("\nPaciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado");
            
      break;
    }

    sc.close();
  }
}
