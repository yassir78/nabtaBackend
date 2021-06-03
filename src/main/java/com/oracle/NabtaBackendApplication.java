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
			disease.setLangue("fr");
			disease.setNomScientifique("frScien");
			diseaseDao.save(disease);
			Stream.of(
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622760802148?alt=media&token=5c2d8ad5-b621-40f8-9ee0-7f4932902a9d",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622760802156?alt=media&token=784ed874-bfd5-4641-82aa-34405b95a0ed").forEach(image -> {
						Image img = new Image();
						img.setPath(image);
						img.setDisease(disease);
						imageDao.save(img);
					});

		};

	}

}
