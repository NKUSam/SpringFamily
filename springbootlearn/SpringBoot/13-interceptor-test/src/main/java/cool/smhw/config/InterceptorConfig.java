package cool.smhw.config;

import cool.smhw.interceptor.UserInterCeptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] includePathPatterns = {
                "/user/**"
        };
        String[] excludePathPatterns = {
                "/user/login","/user/out"
        };

        registry.addInterceptor(new UserInterCeptor()).addPathPatterns(includePathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
