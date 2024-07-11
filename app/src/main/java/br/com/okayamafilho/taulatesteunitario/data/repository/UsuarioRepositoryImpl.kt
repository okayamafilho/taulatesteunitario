import br.com.okayamafilho.taulatesteunitario.data.model.Usuario
import kotlinx.coroutines.delay

class UsuarioRepositoryImpl : UsuarioRepository {

    override suspend fun salvar(usuario: Usuario): Boolean {
        //códigos
        delay(2000)
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