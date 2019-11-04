package com.mihaiblandu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.filter.RegexPatternTypeFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.regex.Pattern;

@Configuration
@ComponentScan(basePackages = {"com.mihaiblandu"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {
    public static class WebPackage extends RegexPatternTypeFilter {

        public WebPackage(Pattern pattern) {
            super(Pattern.compile("mihaiblandu\\.controller"));
        }
    }
}