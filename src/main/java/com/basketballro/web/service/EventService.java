package com.basketballro.web.service;

import com.basketballro.web.dtos.EventDto;

import java.util.List;

public interface EventService {
    void createEvent(long clubId, EventDto eventDto);
    List<EventDto> findAllEvents();

    EventDto findByEventId(Long eventId);

    void updateEvent(EventDto eventDto);

    void deleteEvent(Long eventId);
}
