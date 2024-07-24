import br.com.okayamafilho.taulatesteunitario.data.model.Usuario
import kotlinx.coroutines.delay

class UsuarioRepositoryImpl : UsuarioRepository {

    override suspend fun salvar(usuario: Usuario): Boolean {
        //códigos
        delay(2000)
        return true
    }


    override suspend fun listar(): List<Usuario> {
//        return listOf(
//            Usuario("Toshi", "toshi@gmail.com"),
//            Usuario("Maria", "maria@gmail.com"),
//            Usuario("Zeni", "zeni@gmail.com"),
//        )

        //Código real
//        val listaResposta = api.getUsuarios()
//        if (listaResposta.isSuccessful) {
//            val listaUsuariosDto = listaResposta.body()
//            if (listaUsuariosDto != null) {
//
//            }
//            return listaUsuariosDto.map { it.toUsuario() }
//        }

        println("executar o método real")
        return listOf(Usuario("Toshiaki", "toshi@gmail.com"))
//            emptyList()

//        return emptyList()
    }
}