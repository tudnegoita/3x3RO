package com.basketballro.web.service;

import com.basketballro.web.dtos.EventDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EventService {
    void createEvent(long clubId, EventDto eventDto);
    List<EventDto> findAllEvents();

    EventDto findByEventId(Long eventId);

    void updateEvent(EventDto eventDto);

    void deleteEvent(Long eventId);
}
