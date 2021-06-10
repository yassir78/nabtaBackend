package com.oracle.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.dao.DiseaseDao;
import com.oracle.dao.ImageDao;
import com.oracle.model.Disease;
import com.oracle.model.Image;
import com.oracle.service.DiseaseService;

@Service
public class DiseaseServiceImpl implements DiseaseService {
	@Autowired
	private DiseaseDao diseaseDao;
	@Autowired
	private ImageDao imageDao;

	@Override
	public List<Disease> findAll() {
		// TODO Auto-generated method stub
		return diseaseDao.findAll();
	}

	@Override
	public Disease findById(Long id) {
		// TODO Auto-generated method stub
		Disease disease =  diseaseDao.findById(id).orElse(null);
		return disease;

	}

	@Override
	public Disease findByNomClasseAndLangue(String nomClasse, String langue) {
		// TODO Auto-generated method stub
		return diseaseDao.findByNomClasseAndLangue(nomClasse, langue);
	}

	@Override
	public Disease findByNomAndLangue(String nom, String langue) {
		// TODO Auto-generated method stub
		return diseaseDao.findByNomAndLangue(nom, langue);
	}

	@Override
	public Disease addDisease(Disease disease) {
		// TODO Auto-generated method stub
		if (disease != null) {
			Disease savedDisease = diseaseDao.save(disease);
			List<Image> images = disease.getImages();
			if (images != null) {
				images.stream().forEach(image -> {
					image.setDisease(savedDisease);
					imageDao.save(image);
				});
			}
		}
		return null;
	}

	@Override
	public Disease update(Disease disease) {
		// TODO Auto-generated method stub
		if (disease != null) {
			return diseaseDao.save(disease);
		}
		return null;
	}

	@Override
	@Transactional
	public int delete(Long id) {
		// TODO Auto-generated method stub
		Disease disease = diseaseDao.findById(id).orElse(null);
		if (disease == null) {
			return -1;
		} else {
			diseaseDao.deleteById(id);
			return 1;
		}

	}

}
