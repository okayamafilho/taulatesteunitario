package br.com.okayamafilho.taulatesteunitario.view.viewmodel

import UsuarioRepository
import br.com.okayamafilho.taulatesteunitario.data.model.Usuario

class UsuariosViewModel(
    private val usuarioRepository: UsuarioRepository
) {

    suspend fun recuperarUsuarios(): List<Usuario>{
        return usuarioRepository.listar()
    }
}