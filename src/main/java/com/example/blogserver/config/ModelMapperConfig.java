package com.example.blogserver.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张鑫
 * @date 2019/12/23 18:54
 * @description
 */
@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper() {
        final ModelMapper modelMapper = new ModelMapper();
        /**
         * 完全匹配，不完全不配不建议使用
         */
        modelMapper.getConfiguration().setFullTypeMatchingRequired(true);
        /**
         * 匹配策略定义为严格
         */
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }
}
