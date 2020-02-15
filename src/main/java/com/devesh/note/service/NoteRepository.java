package com.devesh.note.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devesh.note.model.Note;

public interface NoteRepository extends JpaRepository<Note, Integer>{ //generics cannot have primitive as parameter
	

}
