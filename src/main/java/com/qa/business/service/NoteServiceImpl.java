package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistance.repository.NoteRepository;
import com.qa.util.JSONUtil;

public class NoteServiceImpl implements NoteService{
	@Inject
	private NoteRepository repo;
	@Inject
	private JSONUtil util;

	@Override
	public String getAllNotes() {
		return repo.getAllNotes();
	}

	@Override
	public String createNote(String noteJSON) {
		return repo.createNote(noteJSON);
	}

	@Override
	public String updateNote(Long id, String noteJSON) {
		return repo.updateNote(id,noteJSON);
	}

	@Override
	public String deleteNote(Long id) {
		return repo.deleteNote(id);
	}
	
	public void setRepo(NoteRepository repo) {
		this.repo = repo;
	}

}
