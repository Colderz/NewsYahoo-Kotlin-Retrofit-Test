package pakiet.arkadiuszzimny.xmlconvtest.api

import pakiet.arkadiuszzimny.xmlconvtest.models.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("rss/2.0/headline?s=^GSPC")
    suspend fun getNews(

    ) : Response<NewsResponse>

}