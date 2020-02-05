import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


import java.io.IOException;

public class Eltiempo {
    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get();
        String titulo= doc.title();
        Elements miElemento = doc.getElementsByClass("today_nowcard-temp");
        String miTexto = miElemento.text();
        Elements miElemento1 = doc.getElementsByClass("today_nowcard-phrase");
        String miTexto1 = miElemento1.text();
        System.out.println(titulo);
        System.out.println(miElemento);
        System.out.println(miElemento1);


    }
}

