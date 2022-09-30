package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;
            static {//her method dan önce calısır
                String dosyaYolu = "configuration.properties";
                try {
                    FileInputStream fis = new FileInputStream(dosyaYolu);
                    properties = new Properties();
                    properties.load(fis);//fis'in okudugu bilgileri propertis e yukledi
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    public static String getProperty(String key){
      /*
      tesst methodundan yolladiğimiz string key degerini alip properties classindan getProperty methodunu kulla
      narak bu key e ait value'yu bize getirir
       */

        return properties.getProperty(key);
    }





}
