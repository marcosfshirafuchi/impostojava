import java.util.Locale;
import java.util.Scanner;

public class impostoJava {
    /*
        Programa Imposto Java desenvolvido por Marcos Ferreira Shirafuchi
        Data: 12/01/2024
     */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double rendaAnualComSalario, rendaAnualComPrestacaoDeServico, rendaAnualComGanhoDeCapital,
                gastosMedicos, gastosEducacionais, salarioMensal, impostoSobreSalario, impostoSobreServicos,
                impostoSobreGanhoDeCapital, maximoDedutivel, gastosDedutiveis, impostoBrutoTotal, abatimento,
                impostoDevido;
        System.out.print("Renda anual com salário: ");
        rendaAnualComSalario = sc.nextDouble();
        System.out.print("Renda anual com prestação de serviço: ");
        rendaAnualComPrestacaoDeServico = sc.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        rendaAnualComGanhoDeCapital = sc.nextDouble();
        System.out.print("Gastos médicos: ");
        gastosMedicos = sc.nextDouble();
        System.out.print("Gastos educacionais: ");
        gastosEducacionais = sc.nextDouble();
        System.out.println("\nRELATÓRIO DE IMPOSTO DE RENDA");
        System.out.println("\nCONSOLIDADO DE RENDA:");
        salarioMensal = rendaAnualComSalario / 12;
        if (salarioMensal < 3000) {
            impostoSobreSalario = rendaAnualComSalario * 0.00;
        } else if (salarioMensal < 5000) {
            impostoSobreSalario = rendaAnualComSalario * 0.10;
        } else {
            impostoSobreSalario = rendaAnualComSalario * 0.20;
        }
        System.out.printf("Imposto sobre salário: %.2f\n", impostoSobreSalario);
        if (rendaAnualComPrestacaoDeServico > 0.00) {
            impostoSobreServicos = rendaAnualComPrestacaoDeServico * 0.15;
        } else {
            impostoSobreServicos = rendaAnualComPrestacaoDeServico * 0.00;
        }
        System.out.printf("Imposto sobre serviços: %.2f\n", impostoSobreServicos);
        if (rendaAnualComGanhoDeCapital > 0.00) {
            impostoSobreGanhoDeCapital = rendaAnualComGanhoDeCapital * 0.20;
        } else {
            impostoSobreGanhoDeCapital = rendaAnualComGanhoDeCapital * 0.00;
        }
        System.out.printf("Imposto sobre ganho de capital: %.2f\n\n", impostoSobreGanhoDeCapital);
        System.out.println("DEDUÇÕES:");
        impostoBrutoTotal = impostoSobreSalario + impostoSobreServicos + impostoSobreGanhoDeCapital;
        maximoDedutivel = impostoBrutoTotal * 0.30;
        System.out.printf("Máximo dedutível: %.2f\n", maximoDedutivel);
        gastosDedutiveis = gastosMedicos + gastosEducacionais;
        System.out.printf("Gastos dedutíveis: %.2f\n\n", gastosDedutiveis);
        System.out.println("RESUMO:");
        System.out.printf("Imposto bruto total: %.2f\n", impostoBrutoTotal);
        if (maximoDedutivel > gastosDedutiveis) {
            abatimento = gastosDedutiveis;
        } else {
            abatimento = maximoDedutivel;
        }
        System.out.printf("Abatimento: %.2f\n", abatimento);
        impostoDevido = impostoBrutoTotal - abatimento;
        System.out.printf("Imposto devido: %.2f\n", impostoDevido);
    }
}
