package id.rbs.raga.crud.network;

import id.rbs.raga.crud.model.ModelUser;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by RAGA on 22/03/2018.
 */

public interface RestApi {
    @FormUrlEncoded
    @POST("Register.php/")
    Call<ModelUser> registerUser(
        @Field("vsnama") String strnama,
        @Field("vsalamat") String stralamat,
        @Field("vsnotelp") String strtelp,
        @Field("vsjenkel") String strjeniskelamin,
        @Field("vsusername") String strusername,
        @Field("vspassword") String strpassword,
        @Field("vslevel") String strlevel


        );

    @FormUrlEncoded
    @POST("loginuser.php/")
    Call<ModelUser> loginUser (
            @Field("usernamein") String strusername,
            @Field("passwordin") String strpassword,
            @Field("levelin") String strlevel
    );


}
