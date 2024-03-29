package satlantas.banjar.mvvm_project.model

import com.google.gson.annotations.SerializedName

data class PokemonSet (
    var name: String,
    @SerializedName("logoUrl") var logo: String
) {
    data class PokemonSetResponse (
        var sets: MutableList<PokemonSet>
    )
}