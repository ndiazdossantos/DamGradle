import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


import java.io.IOException;

public class Eltiempo {
    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("http://stackoverflow.com").userAgent("Mozilla").get();
        Element miElemento = doc.select("").first();
        String miTexto = miElemento.text();
        System.out.println(miElemento);
    }
}

