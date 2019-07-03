package Way2Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyFile {
	public String path = "./Config.property";
	public String data(String key) throws IOException {
		File f = new File(path);
		FileInputStream fs = new FileInputStream(f);
		Properties proper = new Properties();
		proper.load(fs);
		return proper.getProperty(key);
	}
	

}


