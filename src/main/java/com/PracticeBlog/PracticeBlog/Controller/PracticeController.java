package com.PracticeBlog.PracticeBlog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PracticeBlog.PracticeBlog.Dto.PracticeDto;
import com.PracticeBlog.PracticeBlog.Service.PracticeService;

@RestController
@RequestMapping("/api/post")
public class PracticeController {

	@Autowired
	PracticeService practiceService;
	
//	public PracticeController(PracticeService practiceService) {
//		this.practiceService = practiceService;
//	}

	@PostMapping
	public ResponseEntity<PracticeDto> createData(@RequestBody PracticeDto practiceDto){
		return new ResponseEntity(practiceService.CreateData(practiceDto),HttpStatus.CREATED);
	}
}
