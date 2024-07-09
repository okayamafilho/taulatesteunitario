import br.com.okayamafilho.taulatesteunitario.data.model.Usuario

class UsuarioRepositoryImpl : UsuarioRepository {

    override fun salvar(usuario: Usuario): Boolean {
        //códigos
        return true
    }

    override fun listar(): List<Usuario> {
        return listOf(
            Usuario("Toshi", "toshi@gmail.com"),
            Usuario("Maria", "maria@gmail.com"),
            Usuario("Zeni", "zeni@gmail.com"),
        )
    }
}