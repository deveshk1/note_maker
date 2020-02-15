package com.devesh.note.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devesh.note.model.Note;
import com.devesh.note.repository.NoteService;

@RestController
public class NoteController {
	
	@Autowired
	NoteService noteService;
	
	@RequestMapping("/")
	public  String welcome()
	{
		return "welcome to Rest example";
	}
	
	@PostMapping("/add")
	Note add(@RequestParam("title") String title,@RequestParam("text") String text,@RequestParam("extUrl") String extUrl)
	{
		return noteService.add(title, text, extUrl);
	}
	
	@GetMapping("/read")
	
	List<Note> read()
	{
		return noteService.readAll();
	}
	
	@DeleteMapping(value="/delete/{id}")
	String delete(@PathVariable Integer id)
	{
		return noteService.delete(id);
	}
	
	
	@GetMapping(value="/read/{id}")
	Note readOne(@PathVariable String id)
	{
		Integer idd=1;
		
		try {
			idd=Integer.parseInt(id);
			return noteService.read(idd);
			
		}
		catch(Exception e)
		{
			return null;
		}
		
		
	}
	
	

}
