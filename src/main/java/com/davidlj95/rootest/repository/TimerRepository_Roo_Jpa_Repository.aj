// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.davidlj95.rootest.repository;

import com.davidlj95.rootest.repository.TimerRepository;
import org.springframework.transaction.annotation.Transactional;

privileged aspect TimerRepository_Roo_Jpa_Repository {
    
    declare @type: TimerRepository: @Transactional(readOnly = true);
    
}
