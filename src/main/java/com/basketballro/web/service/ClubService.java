package com.basketballro.web.service;

import com.basketballro.web.models.Club;
import com.basketballro.web.dtos.ClubDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ClubService {
    List<ClubDto> findAllClubs();
    Club saveClub(ClubDto clubDto);

    ClubDto findClubById(long clubId);

    void updateClub(ClubDto club);

    void delete(Long clubId);
    List<ClubDto> searchClubs(String query);
}
