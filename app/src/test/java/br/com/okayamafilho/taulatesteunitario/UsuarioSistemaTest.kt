package br.com.okayamafilho.taulatesteunitario

import org.junit.Assert.*
import org.junit.Test

class UsuarioSistemaTest {

    @Test
    fun validar_CadastroUsuario_RetornaVerdadeiro() {
        //Dados (simulado)
        val email = "Toshiaki Okayama Filho"
        val senha = "1234@ja"
        val senhaConfirmacao = "1234@ja"

        //Quando
        val usuarioSistema = UsuarioSistema()
        val retorno = usuarioSistema.cadastrarUsuario(email, senha, senhaConfirmacao)

        //Então
        assertTrue(retorno)
    }


    @Test
    fun validar_ConfirmacaoSenha_RetornaVerdadeiro() {
        //Dados (simulado)
        val email = "Toshiaki Okayama Filho"
        val senha = "12345@ja"
        val senhaConfirmacao = "12345@ja"

        //Quando
        val usuarioSistema = UsuarioSistema()
        val retorno = usuarioSistema.cadastrarUsuario(email, senha, senhaConfirmacao)

        //Então
        assertTrue(retorno)
    }

    @Test
    fun validar_ConfirmacaoSenha_RetornaFalso() {
        //Dados (simulado)
        val email = "Toshiaki Okayama Filho"
        val senha = ""
        val senhaConfirmacao = "12345@ja"

        //Quando
        val usuarioSistema = UsuarioSistema()
        val retorno = usuarioSistema.cadastrarUsuario(email, senha, senhaConfirmacao)

        //Então
        assertFalse(retorno)
    }


    @Test
    fun calcular_DescontoSalario_RetornaTrue() {

        val usuarioSistema = UsuarioSistema()
        val salario = 1000.0
        val desconto = 100.0
        val esperado = 900.0

        //Quando
        val salarioCalculado = usuarioSistema.calcularDesconto(salario, desconto)
        val testeConfirmacao = salarioCalculado == esperado

        //Então
        assertTrue(testeConfirmacao)
    }
}