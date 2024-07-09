import br.com.okayamafilho.taulatesteunitario.data.model.Usuario

interface UsuarioRepository {
    fun salvar( usuario: Usuario): Boolean
    fun listar(): List<Usuario>
}