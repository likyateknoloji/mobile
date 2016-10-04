package com.example.serkan.myapplication;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by serkan on 1.09.16.
 */
public class DataHolder {

    private static final Map<String, String> makamlar;
    static
    {
        makamlar = new HashMap<String, String>();
        makamlar.put("Acemaşiran", "acemasiran");
        makamlar.put("Acemkürdi", "acemkurdi");
        makamlar.put("Beyati", "beyati");
        makamlar.put("Hicaz", "hicaz");
        makamlar.put("Hicazkar", "hicazkar");
        makamlar.put("Hüseyni", "huseyni");
        makamlar.put("Hüzzam", "huzzam");
        makamlar.put("Karcığar", "karcigar");
        makamlar.put("Kürdilihicazkar", "khicazkar");
        makamlar.put("Mahur", "mahur");
        makamlar.put("Muhayyerkürdi", "mkurdi");
        makamlar.put("Muhayyer", "muhayyer");
        makamlar.put("Nihavend", "nihavend");
        makamlar.put("Rast", "rast");
        makamlar.put("Saba", "saba");
        makamlar.put("Segah", "segah");
    }

    static String[] makamlarEski = new String[] { "Acemaşiran", "Acemkürdi", "Beyati",
            "Hicaz", "Hicazkar", "Hüseyni", "Hüzzam", "Karcığar",
            "Kürdilihicazkar", "Mahur", "Muhayyerkürdi", "Muhayyer", "Nihavend", "Rast",
            "Saba", "Segah" };

    static String[] dosyalar = new String[] {
            "acemasiran", "acemasiran1", "acemasiran4",
            "acemkurdi", "acemkurdi1", "acemkurdi4",
            "beyati", "beyati1", "beyati4",
            "hicaz", "hicaz1", "hicaz4",
            "hicazkar", "hicazkar1", "hicazkar4",
            "huseyni",  "huseyni1",  "huseyni4",
            "huzzam", "huzzam1", "huzzam4",
            "karcigar", "karcigar1", "karcigar4",
            "khicazkar", "khicazkar1", "khicazkar4",
            "mahur", "mahur1", "mahur4",
            "mkurdi", "mkurdi1", "mkurdi4",
            "muhayyer", "muhayyer1", "muhayyer4",
            "nihavend", "nihavend1", "nihavend4",
            "rast", "rast1", "rast4",
            "saba", "saba1", "saba4",
            "segah", "segah1",  "segah4"
    };

    public static String[] getDosyalar() {
        return dosyalar;
    }

    public static String[] getMakamlarEski() {
        return makamlarEski;
    }

    public static Map<String, String> getMakamlar() {
        return makamlar;
    }
}
