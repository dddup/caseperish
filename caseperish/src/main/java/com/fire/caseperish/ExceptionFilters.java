package com.fire.caseperish;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

/**
 * Created by wanjian on 2018/5/29.
 */

public class ExceptionFilters {

    /**
     * 一些系统级的bug，可以过滤掉的，在这里过滤
     */
    public static boolean filters(Throwable throwable) {

        StringWriter writer = new StringWriter();
        PrintWriter printWriter = new PrintWriter(writer);
        throwable.printStackTrace(printWriter);
        String exceptionStack = writer.toString();

        for (String filter: getFilters()) {
            if(exceptionStack.contains(filter)){
                return true;
            }
        }

        return false;
    }

    static ArrayList<String> filters;

    private static ArrayList<String> getFilters() {
        if (filters == null) {
            filters = new ArrayList<>();
            filters.add("Inconsistency detected");
            filters.add("IndexOutOfBoundsException");
            filters.add("Parameter specified as non-null");
            filters.add("not attached to window manager");
            filters.add("Unable to resume activity");
        }
        return filters;
    }
}
