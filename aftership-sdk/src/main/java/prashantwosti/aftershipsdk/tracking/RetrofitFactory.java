package prashantwosti.aftershipsdk.tracking;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import prashantwosti.aftershipsdk.BuildConfig;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by prashantwosti on 5/13/2016.
 */

/**
 * Retrofit class contains factory methods
 */
public class RetrofitFactory {

    private Retrofit retrofit;

    /**
     * Primary {@link RetrofitFactory} constructor
     *
     * @param apiKey AfterShip api key
     */
    public RetrofitFactory(final String apiKey) {

        Interceptor interceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request newRequest = chain.request();
                Request.Builder requestBuilder = newRequest.newBuilder()
                        .header("Content-Type", "application/json")
                        .header("aftership-user-agent", "aftership-ios-sdk 1.0.0")
                        .header("x-ratelimit-limit", "500")
                        .header("aftership-api-key", apiKey);

                Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        };

        // logging interceptor
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        // okhttp client builder
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .addInterceptor(logging)
                .readTimeout(1, TimeUnit.MINUTES)
                .connectTimeout(1, TimeUnit.MINUTES)
                .build();

        // retrofit builder
        retrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .client(client)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

    }

    /**
     * @return {@link Retrofit} object.
     */
    public Retrofit getAdapter() {

        return retrofit;
    }
}
