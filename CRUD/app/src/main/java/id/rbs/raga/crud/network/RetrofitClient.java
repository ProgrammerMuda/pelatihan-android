package id.rbs.raga.crud.network;

import id.rbs.raga.crud.function.MyConstant;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by RAGA on 22/03/2018.
 */

public class RetrofitClient {
    private static Retrofit getRetrofit(){
        //insialisasi retrofit 2
        Retrofit r = new Retrofit.Builder()
                .baseUrl(MyConstant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return r;
    }

    public static RestApi getInstaceRetrofit(){
        return getRetrofit().create(RestApi.class);
    }
}
