package com.emakersBookstore.BookStore.infra.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Documentação BookStore") //titulo da documentacao
                        .version("v1") //versao da documentacao
                        .description("API sobre uma BookStore") //descricao da documentacao
                        .termsOfService("www.google.com.br") //link para os termos de servico
                        .license(
                                new License()
                                        .name("Apache 2.0") //nome da licenca
                                        .url("www.google.com.br") //link para a licenca
                        )
                )
                .servers(Arrays.asList(
                        new Server().url("http://localhost:8080").description("Servidor local")
                ));
    }
}
