/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista04;

/**
 *
 * @author edu-f
 */
public class Funcionario {
    public int cracha;
    public String nome;
    public char tipoVinculo;
    public float valorHora;
    public float qtdeHora;
    public float salario;
    public float valorDesconto;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public float calcularValorSalario(){
        if(tipoVinculo =='H'){
            return valorHora * qtdeHora - valorDesconto;
        }
        else {
            return salario - valorDesconto;
        }
    }
    public String imprimir(){
        return "Crachá: " + cracha +
                "\n" +
                "Nome: " + nome +
                "\n" +
                "Tipo Vínculo: " + tipoVinculo +
                "\n" +
                "Salário: " + calcularValorSalario() +
                "\n" +
                "Desconto: " + valorDesconto +
                "\n" +
                "Valor a receber: " + salario;
    }
}


