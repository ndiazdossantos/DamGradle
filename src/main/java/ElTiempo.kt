import org.jsoup.Jsoup
//importamos lo necesario


object ElTiempo {
    val doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get()
    val titulo = doc.title()
    val temperatura = doc.getElementsByClass("today_nowcard-temp")
    val textoTemperatura= temperatura.text()
    val tiempo = doc.getElementsByClass("today_nowcard-phrase")
    val textoTiempo = tiempo.text()

}