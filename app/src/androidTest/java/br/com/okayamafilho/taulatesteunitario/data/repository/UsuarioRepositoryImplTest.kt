package br.com.okayamafilho.taulatesteunitario.data.repository

import UsuarioRepository
import UsuarioRepositoryImpl
import br.com.okayamafilho.taulatesteunitario.data.model.Usuario
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.After
import org.junit.Before
import org.junit.Test
import kotlin.time.Duration.Companion.seconds

class UsuarioRepositoryImplTest {

    private lateinit var usuarioRepository: UsuarioRepository

    @Before
    fun setUp() {
        usuarioRepository = UsuarioRepositoryImpl()
    }

    @Test
    fun salvar_dadosUsuarioAPI_retornaVerdadeiro() {
        runTest(timeout = 30.seconds) {
        //dado
        val usuario = Usuario("teste", "teste@gmail.com")
        //quando
        val retorno = usuarioRepository.salvar(usuario)

        //Entao
        assertTrue(retorno)
        //teste novo
        }
    }

//    @Test
//    fun listar_temItensAPI_retornaVerdadeiro() {
//        runTest {
//            //dado
//            val usuario = Usuario("teste", "teste@gmail.com")
//            //quando
//            val listaItens = usuarioRepository.listar()
//
//            //Entao
//            assertTrue(listaItens.isNotEmpty())
//        }
//    }

    @After
    fun tearDown() {
    }

}