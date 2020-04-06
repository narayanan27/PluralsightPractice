package com.pluralsight.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.pluralsight.models.Speaker;
import com.pluralsight.repositories.SpeakerRepository;

@RestController
@RequestMapping("/api/v1/speakers")
public class SpeakerController {
	@Autowired
	private SpeakerRepository speakerRepository;

	@GetMapping
	public List<Speaker> list(){
		return speakerRepository.findAll();
	}
	
	@GetMapping
	@RequestMapping("{id}")
	public Speaker getSpeaker(@PathVariable Long id) {
		return speakerRepository.getOne(id);
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Speaker postSpeaker(@RequestBody final Speaker speaker) {
		return speakerRepository.saveAndFlush(speaker);
	}
	@RequestMapping(value="{id}",method=RequestMethod.DELETE)
	public void deleteSpeaker(@PathVariable Long id) {
		 speakerRepository.deleteById(id);
	}
	@RequestMapping(value="{id}",method=RequestMethod.PUT)
	public Speaker update(@PathVariable Long id,@RequestBody Speaker speaker) {
		Speaker existingSpeaker=speakerRepository.getOne(id);
		BeanUtils.copyProperties(speaker, existingSpeaker,"speaker_id");
		return speakerRepository.saveAndFlush(existingSpeaker);
	}
	
}
