package com.andes.intellij.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2) // 문서 형식 지정
                .apiInfo(this.apiInfo()) // API 정보 설정(title, description 등)
                .select()
                .apis(RequestHandlerSelectors.any()) // Swagger를 적용 할 package를 설정한다. 여기서는 모든 RequstMapping을 설정
                .paths(PathSelectors.any()) // 위의 API 중 특정 path에 대하여 설정한다. 여기서는 모든 path로 설정
                .build()
                .pathMapping("/");
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Test Project API") // Swagger UI에서 대표 Title을 설정합니다.
                .description("Test Project API 정보 페이지") // Swagger UI에서 대표 설명을 설정합니다.
                .version("1.0") // Swagger UI에서 API의 버전 정보를 설정합니다.
                .build();
    }
}
