package com.github.emalock3.htmlunit;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import java.io.IOException;

public class Main {
    public static void main(String... args) throws IOException {
        WebClient webClient = new WebClient(BrowserVersion.FIREFOX_24);
        webClient.setCssErrorHandler(new SilentCssErrorHandler());
        HtmlPage page = webClient.getPage("http://localhost:8080/");
        System.out.println(page.asXml());
    }
}
