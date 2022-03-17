package com.produc;

import com.produc.domen.Product;
import com.produc.repository.ProductRepository;
import org.aspectj.asm.internal.CharOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class ProducJpaApplication {
    private static final Logger log = LoggerFactory.getLogger(ProducJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ProducJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(ProductRepository repository) {
        return args -> {
            repository.save(new Product("Toxirov", "Sanjar"));
            repository.save(new Product("Saidov", "Gulom"));
            repository.save(new Product("Rashidov", "Giyos"));
            repository.save(new Product("Solijonov", "Aziz"));
            repository.save(new Product("Rashidov", "Jamol"));

            log.info("product hamma malumotlari chiqdi");
            log.info("------------------");
            for (Product product : repository.findAll()) {
                log.info(product.toString());
            }
                log.info(" ");
             Optional<Product> product=repository.findById(1l);
                log.info("product idlari chiqdi");
                log.info("------------");
                log.info(product.toString());
                log.info(" ");

                log.info("product lastName malumotlari ");
                log.info("------------");
                repository.findByLastName("Rashidov").forEach(Rashidov->{
                    log.info(Rashidov.toString());
                });
                log.info(" ");

        };
    }
}
