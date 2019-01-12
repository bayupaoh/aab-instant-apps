// Generated by Dagger (https://google.github.io/dagger).
package com.suitmedia.bundle.sample.di.component;

import com.suitmedia.bundle.sample.di.module.APIServiceModule;
import com.suitmedia.bundle.sample.di.module.ContextModule;
import com.suitmedia.bundle.sample.di.module.NetworkModule;
import com.suitmedia.bundle.sample.feature.login.LoginPresenter;
import dagger.internal.Preconditions;

public final class DaggerApplicationComponent implements ApplicationComponent {
  private DaggerApplicationComponent(Builder builder) {}

  public static Builder builder() {
    return new Builder();
  }

  public static ApplicationComponent create() {
    return new Builder().build();
  }

  @Override
  public void inject(LoginPresenter loginPresenter) {}

  public static final class Builder {
    private Builder() {}

    public ApplicationComponent build() {
      return new DaggerApplicationComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder aPIServiceModule(APIServiceModule aPIServiceModule) {
      Preconditions.checkNotNull(aPIServiceModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder contextModule(ContextModule contextModule) {
      Preconditions.checkNotNull(contextModule);
      return this;
    }
  }
}
