package com.sean.GitRank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * 自定义Swagger 接口文档的配置
 *
 * @author Sean
 */
//表示这个类是一个配置类，会把这个类注入到ioc容器中
@Configuration
//开启Swagger的功能
@EnableSwagger2WebMvc
//@Profile("dev")
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //这里一定要标注你控制器的位置
                .apis(RequestHandlerSelectors.basePackage("com.sean.GitRank.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * api 信息
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("GitRank")
                .description("接口文档")
                .termsOfServiceUrl("https://github.com/CodeSailor-zero")
                .contact(new Contact("Sean", "https://github.com/CodeSailor-zero", "2439502320qq.com"))
                .version("1.0")
                .build();
    }
}
