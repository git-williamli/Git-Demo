package com.duing.service;

import com.duing.bean.Guest;
import com.duing.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp implements GuestService {

    @Autowired
    private GuestRepository guestRepository;

    @Override
    public List<Guest> guestList() {
        return guestRepository.findAll();
    }


}
