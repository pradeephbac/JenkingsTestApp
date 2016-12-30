package my.domain;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class Application extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure( SpringApplicationBuilder builder )
	{

		return builder.sources( Application.class );
	}
	
	@Bean
	public FilterRegistrationBean corsFilter()
	{
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.addAllowedMethod( "*" );
		config.addAllowedOrigin("http://localhost:9090");
		source.registerCorsConfiguration( "/**", config );
		FilterRegistrationBean bean = new FilterRegistrationBean( new CorsFilter( source ) );
		bean.setOrder( 0 );
		return bean;
	}
	
}
