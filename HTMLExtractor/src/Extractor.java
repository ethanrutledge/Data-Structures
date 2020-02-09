// Extractor.java - link extractor with defects!
// Author: Chris Wilcox
// Date:   1/4/2017
// Class:  CS165
// Email:  wilcox@cs.colostate.edu

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Extractor {

    /**
     * Store contents of the html file
     */
    public static ArrayList<String> html = new ArrayList<>();

    /**
     * Store links found in html file
     */
    // BUG: LINKS NOT PROPERLY INSTANTIATED(?)
    public static ArrayList<String> links = new ArrayList<String>();

    // Main entry point
    public static void main(String[] args) {
        
        // Read web page
    	// BUG: INDEX WAS OFF BY +1
        readHtml(args[0]);
        
        // Print size
        System.out.println("html.size(): " + html.size());

        // Extract web links
        extractHtml();
        
        // Write html file
        //BUG: INDEX WAS OFF BY +1
        writeHtml(args[1]);
    }
        
    //

    /**
     * Reads the contents of a specified web page into an {@link java.util.ArrayList} of Strings.
     * @param url the address of the webpage to read from
     */
    public static void readHtml(String url) {

        try {

            // Open scanner for webpage
            Scanner in = new Scanner(new URL(url).openStream());

            // Read web page
            while (in.hasNextLine()) {

                String line = in.nextLine().trim();
                if (!line.isEmpty()) {
                    html.add(line);
                }  
            }
            // BUG: SCANNER WAS CLOSING INSIDE WHILE LOOP
            in.close();
        } catch (Exception e) {
            System.out.println("Cannot read " + url);
            e.printStackTrace();
        }
    }



    /**
     * Extracts web links.
     * Searches through the HTML tags for a specific set of web links
     * for Strings containing "http:", "liang", and ".html". <p>
     * Each link is extracted from the HTML is stored in another {@link java.util.ArrayList}. <p>
     * The ".html" extension is removed before adding the link.
     */
    public static void extractHtml() {
        
        // Iterate html source
        for (String line : html) {
            
            // Search for links
            if (line.contains("https:") && line.contains("pearsoncmg") && line.contains(".html")) {
                
                // Extract link, if it exists
                String link = line.substring(line.indexOf("https:"), line.lastIndexOf(".html")+5);
                // Store link, without extension
                links.add(link);
            }
        }
    }

    /**
     * Writes an HTML file containing a bulleted list of the links extracted from the original page.
     * @param filename name of output file
     */
    public static void writeHtml(String filename) {

        try {
            
            // Create file writer
            PrintWriter writer = new PrintWriter(new File(filename));

            // HTML header
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>Web Links</title>");
            writer.println("</head>");
            writer.println("<body>");

            // Generate list of links
            writer.println("<ul>");
            for (String url : links) {
                writer.print("    <li> ");
                //BUG: .html has added twice
                writer.print("<a href=\"" + url);
                //BUG: incorrect indices
                String name = url.substring(url.lastIndexOf("/") + 1, url.length() - 5);
                writer.print("\">" + name);
                writer.print("</a>");
                writer.println(" </li>");

            }
            writer.println("</ul>");

            // HTML footer
            writer.println("</body>");
            writer.println("</html>");
            //BUG: PrintWriter never closed
            writer.close();
        } catch (Exception e) {
            System.out.println("Cannot write " + filename);
        }
    }
}
