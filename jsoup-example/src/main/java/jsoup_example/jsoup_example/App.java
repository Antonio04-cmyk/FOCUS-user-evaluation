package jsoup_example.jsoup_example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App {

	/*
	 * Parsing a Ansa news
	 */
	public static void main(String[] args) throws IOException {
		
	}
	

	/*
	 * Complete the method - scrape a simple mobile website page amd select all news belong to "calciomercato" category
	 * Use a timeout when Jsoup connects.
	 */
	public static int getCalciomercatoNews() throws IOException {
		String url = "https://mdegroup.github.io/FOCUS-Appendix/tuttojuve.htm";
		Document document = Jsoup.connect(url).get();
		Elements images = document.select(".list-item");
		images.parents();
		int count = 0;
		for (Element image : images) {
			if (image.getElementsByClass("list-date-data").get(0).text().toLowerCase().contains("calciomercato")) count ++;
		}
		return count;	
	}

	/*
	 * Scrape livescore web site: extract the list of
	 * away teams that won the match and print them to the console.
	 * Use "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)" as user agent string
	 */
	public static List<String> getScoresFromLivescore() throws IOException {
		String url = "https://mdegroup.github.io/FOCUS-Appendix/livescore.html";
		Document document = Jsoup.connect(url).get();
		Elements scores = document.getElementsByClass("sco");
		scores.parents();
		
		List<String> result = new ArrayList();
//		for (Element score : scores) {
//			try {
//			if (Integer.parseInt(score.getElementsByClass("awy").text()) > Integer.parseInt(score.getElementsByClass("hom").text()))
//				result.add(score.parent().select("div.ply.name").get(1).text());
//			} catch (NumberFormatException e) {
//				
//			}
//		}
		return result;
		
	}
	
	/*
	 * Scrape meteo.it web site: collect the 
	 * different weather icons paths in the map of Abruzzo 
	 * and print them to the console.
	 */
	public static String getCityWheater() throws IOException {
		String url = "https://mdegroup.github.io/FOCUS-Appendix/meteo.html";
		Document document = Jsoup.connect(url).get();
		Elements weathers = document.select("span.dayDate");
		String name = "";
		
//		int difference = 0;
//		for (Element weather : weathers ) {
//			Elements elements = weather.parent().parent().parent().getElementsByClass("temperature");
//			int min = Integer.parseInt(elements.get(0).text().replace("°", ""));
//			int max = Integer.parseInt(elements.get(1).text().replace("°", ""));
//			if (Math.abs(max-min)>difference) {
//				difference = Math.abs(max-min);
//				name = weather.text();
//			}
//		}
		return(name);
	}
	

}
