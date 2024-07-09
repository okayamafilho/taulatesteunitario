package br.com.okayamafilho.taulatesteunitario

import com.jamiltondamasceno.aulatestes.OperacoesMatematicas
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertSame
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Before
import org.junit.Test

class OperacoesMatematicasTest {

    private lateinit var operacoesMatematicas: OperacoesMatematicas

    @Before
    fun setUp() {
        operacoesMatematicas = OperacoesMatematicas()
    }

    @After
    fun tearDown() {

    }

    @Test
    fun somar_calculaSomaEntreDoisNumeros_retornaTrue() {
        //Dado (simulado)
        val numero1 = 10
        val numero2 = 10
        val numeroEsperado = 20

        //Quando
        val numeroRetornado = operacoesMatematicas.somar(numero1, numero2)
        val resultado = numeroEsperado == numeroRetornado

        //Então
//        assertTrue(resultado)
//        assertEquals(numeroEsperado, numeroRetornado)
//        assertEquals(10.95, 10.95)
//        assertTrue(true)
//        assertFalse("Deveria retornar false", false)
//        assertSame(operacoesMatematicas, OperacoesMatematicas())

        val condicao = 1 != 2
        if (condicao) {
            fail("Numero1 é diferente de numero 2")
        }
    }
}