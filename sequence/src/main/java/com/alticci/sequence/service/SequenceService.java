package com.alticci.sequence.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SequenceService {
    @Cacheable(cacheNames = {"calc"}, key = "#number")
    public Integer sequence(Integer number) {
        log.info("Calculated number");
        if(number > 2) {
            return sequence(number-3) + sequence(number-2);
        }
        if(number == 0) return 0;
        return number/number;
    }
}
