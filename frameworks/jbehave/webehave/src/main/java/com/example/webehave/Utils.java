package com.example.webehave;

import org.apache.commons.lang3.StringUtils;

@SuppressWarnings({"javadoc","nls"})
final public class Utils {

    public static final String
                               includePattern,
                               excludePattern,
                               topLevelMetaFilter;

    static {
        includePattern = System.getProperty(
                "com.example.webehave.includePattern",
                "**/*.story");
        excludePattern = System.getProperty(
                "com.example.webehave.excludePattern",
                StringUtils.EMPTY);
        topLevelMetaFilter = System.getProperty(
                "com.example.webehave.topLevelMetaFilter",
                "toplevel");
    }

    Utils() { /* utility class */}
}
