package br.senai.sp.jandira.mytrips.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.model.Categorias

class CategoriasRepositorio {
    @Composable
    fun ListarTodasAsCategorias(): List <Categorias>{
        val Montain = Categorias(
            id = 1,
            descricao = "Montain",
            iconImage = painterResource(id = R.drawable.beach)
        )

        val Snow = Categorias(
            id = 2,
            descricao = "Snow"
        )

        val Beach = Categorias(
            id = 3,
            descricao = "Beach",
            iconImage = painterResource(id = R.drawable.beach)
        )

        return listOf(Montain, Snow, Beach)

    }
}
