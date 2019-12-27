package com.lc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @description: swagger2配置
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-12-27 15:22
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    /**
     * @Description: swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.lc.controller"))
                .paths(PathSelectors.any()).build();
    }

    /**
     * @Description: 构建 api文档的信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 设置页面标题
                .title("使用swagger2构建test的api接口文档")
                // 设置联系人
                .contact(new Contact("imooc-Nathan", "https://editor.csdn.net/md/?articleId=86678865", "1974552862@qq.com"))
                // 描述
                .description("欢迎访问test接口文档，这里是描述信息")
                // 定义版本号
                .version("1.0").build();
    }
}