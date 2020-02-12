package org.example

import org.hibernate.validator.HibernateValidator
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor


@SpringBootApplication
class MainApplication{

    @Bean
    fun methodValidationPostProcessor(): MethodValidationPostProcessor? {
        val mvProcessor = MethodValidationPostProcessor()
        mvProcessor.setValidator(validator())
        return mvProcessor
    }

    @Bean
    fun validator(): LocalValidatorFactoryBean? {
        val validator = LocalValidatorFactoryBean()
        validator.setProviderClass(HibernateValidator::class.java)
        validator.afterPropertiesSet()
        return validator
    }
}

fun main(args: Array<String>) {
    runApplication<MainApplication>(*args)
}
