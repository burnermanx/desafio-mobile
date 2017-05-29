package io.github.burnermanx.starwarsstore.module;

import android.app.Application;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import timber.log.Timber;

/**
 * Created by Burner on 29/05/2017.
 */

@Module
public class NetModule {

    @Provides
    @Singleton
    Cache provideOkHttpCache(Application application) {
        int cacheSize = 10 * 1024 * 1024;
        Cache cache = new Cache(application.getCacheDir(), cacheSize);
        return cache;
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(Cache cache, HttpLoggingInterceptor loggingInterceptor) {
       OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .cache(cache)
                .build();

        return client;
    }

    @Provides
    @Singleton
    HttpLoggingInterceptor provideTimberLoggingInterceptor() {
        HttpLoggingInterceptor timberInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Timber.d(message);
            }
        });
        timberInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);


        return timberInterceptor;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        return gson;
    }


}
