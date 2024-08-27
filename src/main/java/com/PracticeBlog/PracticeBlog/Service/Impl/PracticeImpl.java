package com.PracticeBlog.PracticeBlog.Service.Impl;

import org.springframework.stereotype.Service;

import com.PracticeBlog.PracticeBlog.Dto.PracticeDto;
import com.PracticeBlog.PracticeBlog.Entity.PracticeApp;
import com.PracticeBlog.PracticeBlog.Repository.PracticeRepository;
import com.PracticeBlog.PracticeBlog.Service.PracticeService;

@Service
public class PracticeImpl implements PracticeService {

	PracticeRepository practiceRepository;
	
	
	public PracticeImpl(PracticeRepository practiceRepository) {
		super();
		this.practiceRepository = practiceRepository;
	}

	@Override
	public PracticeDto CreateData(PracticeDto practiceDto) {
		//dto to entity
		PracticeApp practiceApp = mapToEntity(practiceDto);
		PracticeApp app = practiceRepository.save(practiceApp);
		//entity to dto
		PracticeDto dto = mapToDto(app);
		return dto;
	}
	
	//Entity to Dto
	private PracticeDto mapToDto(PracticeApp practiceApp) {
		PracticeDto practiceDto = new PracticeDto();
		
		practiceDto.setId(practiceApp.getId());
		practiceDto.setContent(practiceApp.getContent());
		practiceDto.setDescription(practiceApp.getDescription());
		practiceDto.setTitle(practiceApp.getTitle());
		
		return practiceDto;
	}
	
	//Dto to Entity
	private PracticeApp mapToEntity(PracticeDto practiceDto) {
		PracticeApp practiceApp = new PracticeApp();
		
		practiceApp.setContent(practiceDto.getContent());
		practiceApp.setDescription(practiceDto.getDescription());
		practiceApp.setTitle(practiceDto.getTitle());
		
		return practiceApp;
	}

}
