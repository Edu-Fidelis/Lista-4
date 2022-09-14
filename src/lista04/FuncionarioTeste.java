package lista04;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author edu-f
 */
public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Scanner t = new Scanner(System.in);
        
        System.out.println("Digite o número:"
                + "1 - Criar Funcionário" +
                "2 - Mostrar folha de pagamento" + 
                "3 - Alterar remuneração" +
                "4 - Sair");
        
        int op = t.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Digite o nome: ");
                f.setNome(t.nextLine());

                System.out.println("Digite o crachá: ");
                f.setCracha(t.nextInt());

                System.out.println("Digite o Tipo de vinculo: ");
                f.setTipoVinculo(t.next(Char));

                System.out.println("Digite o valor da hora: ");
                f.setValorHora(t.nextFloat());

                System.out.println("Digite quantas horas: ");
                f.setQtdeHora(t.nextFloat());

                System.out.println("Digite o salário: ");
                f.setSalario(t.nextFloat());

                System.out.println("Digite o valor de desconto: ");
                f.setValorDesconto(t.nextFloat());
                break;
            case 2: 
                imprimir();
                break;
            case 3:
                
                break;
                
            case 4:
                break;
        }
        
        
    }
}
