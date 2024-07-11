import br.com.okayamafilho.taulatesteunitario.data.model.Usuario

interface UsuarioRepository {
    suspend fun salvar( usuario: Usuario): Boolean
    suspend fun listar(): List<Usuario>
}