package red.ethel.rgtest;

import io.avaje.spi.ServiceProvider;
import io.jstach.rainbowgum.LogConfig;
import io.jstach.rainbowgum.RainbowGum;
import io.jstach.rainbowgum.pattern.format.PatternEncoderBuilder;
import io.jstach.rainbowgum.spi.RainbowGumServiceProvider;

import java.util.Optional;

@ServiceProvider(RainbowGumServiceProvider.class)
public class RGConfig implements RainbowGumServiceProvider.RainbowGumProvider {
    	@Override
	public Optional<RainbowGum> provide(LogConfig config) {

		return RainbowGum.builder(config) //
			.route(r -> {
				r.level(System.Logger.Level.DEBUG, "red.ethel");
				r.appender("console", a -> {
					a.encoder(new PatternEncoderBuilder("console")
						// We use the pattern encoder which follows logback pattern
						// syntax.
						.pattern("[%thread] %-5level %logger{15} - %msg%n")
						// We use properties to override the above pattern if set.
						.fromProperties(config.properties())
						.build());
				});
			}) //
			.optional();
	}
}
