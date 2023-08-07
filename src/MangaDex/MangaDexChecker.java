package MangaDex;

import MangaEntry.MangaEntry;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MangaDexChecker {

    public static final String baseURL = "https://api.mangadex.org";
    public static final String mangaPath = "/manga";

    public static void main(String[] args) {
        //getMangaEntry(null);
    }

    private static String queryParamToString(HashMap<String, String> queryParam) {
        StringBuilder res = new StringBuilder();
        for (Map.Entry<String, String> entry : queryParam.entrySet()) {
            res.append(entry.getKey());
            res.append("=");
            String val = entry.getValue();
            val = val.replace(' ', '-');
            res.append(val);
        }

        return res.toString();
    }

//    public static JsonObject getJSON() {
//
//        try {
//            String title = "Shingeki no Kyojin";
//            HashMap<String, String> queryParam = new HashMap<>();
//            queryParam.put("title", title);
//            URL url = new URL(baseURL + mangaPath + "?" + queryParamToString(queryParam));
//            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//            conn.connect();
//            int responseCode = conn.getResponseCode();
//
//            if (responseCode != 200) {
//                throw new RuntimeException("HttpsResponseCode: " + responseCode);
//            } else {
//                StringBuilder inline = new StringBuilder();
//                Scanner scanner = new Scanner(url.openStream());
//                while (scanner.hasNext()) {
//                    inline.append(scanner.next());
//                }
//                scanner.close();
//
//                return JsonParser.parseString(String.valueOf(inline)).getAsJsonObject();
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    private static MangaEntry JSONToMangaEntry(JsonObject elem) {
//
//
//
//        return null;
//    }


}
