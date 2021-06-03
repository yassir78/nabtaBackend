package com.oracle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.oracle.dao.DiseaseDao;
import com.oracle.dao.ImageDao;
import com.oracle.model.Disease;
import com.oracle.model.Image;

@SpringBootApplication
public class NabtaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NabtaBackendApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(DiseaseDao diseaseDao, ImageDao imageDao) {
		return (args) -> {
			Disease disease = new Disease();
//			disease.setContenu("contenu 1");
			disease.setLangue("fr");
			disease.setNom("nom1");
			disease.setNomScientifique("frScien");
			diseaseDao.save(disease);
			Stream.of("image1", "image2", "image3").forEach(image -> {
				Image img = new Image();
				img.setPath(image);
				img.setDisease(disease);
				imageDao.save(img);
			});

		};

	}

}
