package com.davidlj95.rootest.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.davidlj95.rootest.Timer;

/**
 * = TimerRepositoryImpl
 *
 * Implementation of TimerRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = TimerRepositoryCustom.class)
public class TimerRepositoryImpl extends QueryDslRepositorySupportExt<Timer> implements TimerRepositoryCustom{

    /**
     * Default constructor
     */
    TimerRepositoryImpl() {
        super(Timer.class);
    }
}