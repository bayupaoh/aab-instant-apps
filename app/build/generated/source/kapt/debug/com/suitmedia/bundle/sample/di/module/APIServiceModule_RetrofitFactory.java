// Generated by Dagger (https://google.github.io/dagger).
package com.suitmedia.bundle.sample.di.module;

import com.suitmedia.bundle.sample.data.api.model.BaseUrlHolder;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public final class APIServiceModule_RetrofitFactory implements Factory<Retrofit> {
  private final APIServiceModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<RxJava2CallAdapterFactory> rxJava2CallAdapterFactoryProvider;

  private final Provider<BaseUrlHolder> baseUrlHolderProvider;

  public APIServiceModule_RetrofitFactory(
      APIServiceModule module,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<RxJava2CallAdapterFactory> rxJava2CallAdapterFactoryProvider,
      Provider<BaseUrlHolder> baseUrlHolderProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
    this.rxJava2CallAdapterFactoryProvider = rxJava2CallAdapterFactoryProvider;
    this.baseUrlHolderProvider = baseUrlHolderProvider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.retrofit(
            okHttpClientProvider.get(),
            rxJava2CallAdapterFactoryProvider.get(),
            baseUrlHolderProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static APIServiceModule_RetrofitFactory create(
      APIServiceModule module,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<RxJava2CallAdapterFactory> rxJava2CallAdapterFactoryProvider,
      Provider<BaseUrlHolder> baseUrlHolderProvider) {
    return new APIServiceModule_RetrofitFactory(
        module, okHttpClientProvider, rxJava2CallAdapterFactoryProvider, baseUrlHolderProvider);
  }

  public static Retrofit proxyRetrofit(
      APIServiceModule instance,
      OkHttpClient okHttpClient,
      RxJava2CallAdapterFactory rxJava2CallAdapterFactory,
      BaseUrlHolder baseUrlHolder) {
    return Preconditions.checkNotNull(
        instance.retrofit(okHttpClient, rxJava2CallAdapterFactory, baseUrlHolder),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}