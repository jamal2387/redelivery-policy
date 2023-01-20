package com.och.redeliverypolicy.config;

import com.och.redeliverypolicy.dto.MessageDto;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Constants {
    private Constants() {
        throw new IllegalStateException("Instantiation of constants class is prohibited!");
    }

    public static final String BASE_PATH = "/api/v1";
    public static final Map<String, MessageDto> MESSAGE_MAP = new ConcurrentHashMap<>();
}
