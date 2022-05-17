package com.bnta.chocolate.config;


import com.bnta.chocolate.ChocolateApplication;
import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
    public class DataLoader implements ApplicationRunner {

        @Autowired
        private EstateRepository estateRepository;

        @Override
        public void run(ApplicationArguments args) throws Exception{

            Estate e1 = new Estate("N2", "Nicaragua");
            Estate e2 = new Estate("F1", "France");
            Estate e3 = new Estate("P9", "Peru");
            Estate e4 = new Estate("C4", "Congo");

            Chocolate c1 = new Chocolate("Knutty", 80, e1);
            Chocolate c2 = new Chocolate("Cottonwood", 13, e2);
            Chocolate c3 = new Chocolate("Karen Lane", 58, e3);
            Chocolate c4 = new Chocolate("Golf Course", 100, e4);
            Chocolate c5 = new Chocolate("Milky Dark", 65, e1);
            Chocolate c6 = new Chocolate("Darky Milk", 61, e1);
            Chocolate c7 = new Chocolate("Froggo", 40, e2);
            Chocolate c8 = new Chocolate("FroggoNuke", 9, e2);
            Chocolate c9 = new Chocolate("ChocolateRipper", 98, e4);
            Chocolate c10 = new Chocolate("Slaughterhouse", 16, e4);
            Chocolate c11 = new Chocolate("WhiteChocolateRipper", 23, e4);
            Chocolate c12 = new Chocolate("Peruvian White", 24, e3);
            Chocolate c13 = new Chocolate("Peruvian Dark", 85, e3);
            Chocolate c14 = new Chocolate("Peruvian Milk", 55, e3);

            e1.setChocolates(List.of(c1, c5, c6));
            e2.setChocolates(List.of(c2, c7, c8));
            e3.setChocolates(List.of(c3, c12, c13, c14));
            e4.setChocolates(List.of(c4, c9, c10, c11));

            estateRepository.saveAll(List.of(e1, e2, e3, e4));



        }


    }
