package dagger.internal;

import dagger.Lazy;
import dagger.internal.AbstractMapFactory;
import java.util.Map;
import javax.inject.Provider;

public final class MapProviderFactory<K, V> extends AbstractMapFactory<K, V, Provider<V>> implements Lazy<Map<K, Provider<V>>> {
    public static <K, V> Builder<K, V> builder(int i) {
        return new Builder<>(i);
    }

    private MapProviderFactory(Map<K, Provider<V>> map) {
        super(map);
    }

    public Map<K, Provider<V>> get() {
        return contributingMap();
    }

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, Provider<V>> {
        private Builder(int i) {
            super(i);
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: dagger.internal.AbstractMapFactory.Builder.put(java.lang.Object, javax.inject.Provider):dagger.internal.AbstractMapFactory$Builder<K, V, V2>
         arg types: [K, javax.inject.Provider<V>]
         candidates:
          dagger.internal.MapProviderFactory.Builder.put(java.lang.Object, javax.inject.Provider):dagger.internal.MapProviderFactory$Builder<K, V>
          dagger.internal.AbstractMapFactory.Builder.put(java.lang.Object, javax.inject.Provider):dagger.internal.AbstractMapFactory$Builder<K, V, V2> */
        public Builder<K, V> put(K k, Provider<V> provider) {
            super.put((Object) k, (Provider) provider);
            return this;
        }

        public Builder<K, V> putAll(Provider<Map<K, Provider<V>>> provider) {
            super.putAll((Provider) provider);
            return this;
        }

        public MapProviderFactory<K, V> build() {
            return new MapProviderFactory<>(this.map);
        }
    }
}
