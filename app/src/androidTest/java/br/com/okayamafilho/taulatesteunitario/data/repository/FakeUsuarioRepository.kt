package br.com.okayamafilho.taulatesteunitario.data.repository

import UsuarioRepository
import br.com.okayamafilho.taulatesteunitario.data.model.Usuario

class FakeUsuarioRepository : UsuarioRepository {
    override suspend fun salvar(usuario: Usuario): Boolean {
        return true
    }

    override suspend fun listar(): List<Usuario> {
        return listOf(
            Usuario("Toshi", "toshi@gmail.com"),
            Usuario("Maria", "maria@gmail.com"),
            Usuario("Zeni", "zeni@gmail.com"),
        )
    }
}