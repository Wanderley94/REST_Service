package com.denisk.web_services.Services;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class PostService {

    public static String[] sortString(List<String> listString) {

        StringBuilder stringBuilder = new StringBuilder();

        listString.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s2.length() == s1.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        for (String str:listString) {
            stringBuilder.append("("+str.length()+"): "+str+",");
        }

        String concatString = stringBuilder.toString();
        String[] arrStr = concatString.split(",");

        return arrStr;
    }
}
