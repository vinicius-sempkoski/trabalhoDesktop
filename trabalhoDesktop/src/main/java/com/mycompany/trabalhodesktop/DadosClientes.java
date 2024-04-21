package com.mycompany.trabalhodesktop;

/**
 *
 * @author Vinicius
 */
public class DadosClientes {

    private static String nomeCompleto;
    private static String cpf;
    private static String endereco;
    private static String telefone;

    public static String getNomeCompleto() {
        return nomeCompleto;
    }

    public static void setNomeCompleto(String nomeCompleto) {
        DadosClientes.nomeCompleto = nomeCompleto;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        DadosClientes.cpf = cpf;
    }

    public static String getEndereco() {
        return endereco;
    }

    public static void setEndereco(String endereco) {
        DadosClientes.endereco = endereco;
    }

    public static String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String telefone) {
        DadosClientes.telefone = telefone;
    }
}
