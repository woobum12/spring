package com.wjb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wjb.dto.ArtistDTO;
import com.wjb.dto.PointDTO;
import com.wjb.repository.ArtistRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArtistService {
	
	private final ArtistRepository artistRepository;
	
	public void insertOne(ArtistDTO artistdto) {
		artistRepository.insertOne(artistdto);
	}
	
	public List<ArtistDTO> selectAll_basic(){
		return artistRepository.selectAll_basic();
	}
	
	public List<ArtistDTO> selectAll() {
		return artistRepository.selectAll();
	}
	
	public ArtistDTO selectOne(String artist_id) {
		return artistRepository.selectOne(artist_id);
	}
	
	public void update(ArtistDTO artistDTO) {
		artistRepository.update(artistDTO);
	}
	
	public List<PointDTO> selectMentoPoint() {
		return artistRepository.selectMentoPoint();
	}
	
	public void delete(String artist_id) {
		artistRepository.delete(artist_id);
	}
	
	public List<PointDTO> rankPoint() {
		return artistRepository.selectRank();
	}
	
}
