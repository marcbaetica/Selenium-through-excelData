package FileDownload;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class FileDownload {

	public static void main (String[] args) throws IOException {
		
		URL link = new URL("https://upload.wikimedia.org/wikipedia/en/6/6b/Batman_Eternal.jpg");
		System.out.println("This will return '/wikipedia/en/6/6b/Batman_Eternal.jpg:' " + link.getFile());
		System.out.print("This will return 'Batman_Eternal.jpg': " + FilenameUtils.getName(link.getPath()));
		File file = new File("D://Projects//Programming//Selenium-through-excelData//downloads//" + FilenameUtils.getName(link.getPath()));
		FileUtils.copyURLToFile(link, file);

	}
}
