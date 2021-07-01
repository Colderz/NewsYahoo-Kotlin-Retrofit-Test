package pakiet.arkadiuszzimny.xmlconvtest.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import pakiet.arkadiuszzimny.xmlconvtest.utils.Constants.Companion.BASE_URL
import retrofit2.Retrofit

class RetrofitInstance {

    companion object {

        private val retrofit by lazy{
            val logging = HttpLoggingInterceptor()
            logging.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client = OkHttpClient.Builder()
                .addInterceptor(logging)
                .build()
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory()
        }
    }
}