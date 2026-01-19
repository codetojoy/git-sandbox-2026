package net.codetojoy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringUtils {
    private static final Logger log = LoggerFactory.getLogger(StringUtils.class);

    public String reverseString(String s) {
        log.debug("TRACER debug reverseString called with input: {}", s);
        if (s == null) return null; // guard
        return new StringBuilder(s).reverse().toString();
    }
}
