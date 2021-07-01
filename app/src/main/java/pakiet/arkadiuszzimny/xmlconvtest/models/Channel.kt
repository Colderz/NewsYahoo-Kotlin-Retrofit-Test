package pakiet.arkadiuszzimny.xmlconvtest.models

data class Channel(
    val copyright: String,
    val description: String,
    val image: Image?,
    val item: MutableList<Item>,
    val language: String?,
    val lastBuildDate: String?,
    val link: String?,
    val title: String?
)