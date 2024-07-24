package br.com.okayamafilho.taulatesteunitario.view.viewmodel

import UsuarioRepository
import UsuarioRepositoryImpl
import br.com.okayamafilho.taulatesteunitario.data.model.Usuario
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class UsuariosViewModelTest {

    @Mock
    private lateinit var mockUsuarioRepository: UsuarioRepositoryImpl

    private lateinit var usuariosViewModel: UsuariosViewModel

    @Before
    fun setUp() {
//        usuarioRepository = FakeUsuarioRepository()
//        usuarioRepository = mock(UsuarioRepository::class.java)

        MockitoAnnotations.openMocks(this)

    }

    @Test
    fun recuperarUsuarios(): Unit = runBlocking {
        usuariosViewModel = UsuariosViewModel(mockUsuarioRepository)
//        Mockito.`when`(usuarioRepository.listar()).thenReturn(
//            listOf(Usuario("Toshiaki", "toshi@gmail.com"))
////            emptyList()
//        )
        Mockito.`when`(mockUsuarioRepository.listar()).thenCallRealMethod()

        val resultado = usuariosViewModel.recuperarUsuarios()

//        org.hamcrest.MatcherAssert.assertThat(
//            resultado)
    }

    @After
    fun tearDown() {
    }

}