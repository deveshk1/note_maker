package com.devesh.note.model;

 
import javax.persistence.Entity;

import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Id;

//@Getter
//@Setter
//@NoArgsConstructor

@Entity
@DynamicUpdate
public class Note {
	
	
	@Id // to give primary key status to noteId
	Integer noteId;
	String useremail;
	String title;
	String text;
	String extUrl;
	Long timestamp;
	public Integer getNoteId() {
		return noteId;
	}
	public void setNoteId(Integer noteId) {
		this.noteId = noteId;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getExtUrl() {
		return extUrl;
	}
	public void setExtUrl(String extUrl) {
		this.extUrl = extUrl;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
}
