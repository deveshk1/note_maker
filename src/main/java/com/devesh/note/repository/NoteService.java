package com.devesh.note.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devesh.note.model.Note;
import com.devesh.note.service.NoteRepository;


@Service
public class NoteService {

	@Autowired
	NoteRepository repos;
	public Note add(String title,String text, String extUrl)
	{
		
		Note n=new Note(); // accessing model
		n.setTitle(title);
		n.setText(text.toLowerCase().replace("KUTTA", "CHUHAR"));
		n.setExtUrl(extUrl);
		n.setTimestamp(System.currentTimeMillis());
		n.setNoteId(((int)(100 * Math.random())));
		
		repos.save(n);
				
		return n;

	}
	
	public List<Note> readAll()
	{
		return repos.findAll();
	}
	
	public String delete(Integer id)
	{
		repos.deleteById(id);
		return "note deleted";
	}
	
	public Note read(Integer id)
	{
		return repos.getOne(id);
	}
	


}
