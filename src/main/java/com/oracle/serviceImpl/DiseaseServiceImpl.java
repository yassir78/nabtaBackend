package com.oracle.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.dao.DiseaseDao;
import com.oracle.dao.ImageDao;
import com.oracle.model.Disease;
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
		return diseaseDao.findById(id).get();

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
			var images = disease.getImages();
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
