import java.io.*;
import java.util.*;

public class combine {

	public static void main(String[] args) throws IOException {
		
		List<String> agentList = new ArrayList<String>();
		agentList.add("Alarm");
		agentList.add("Contacts");
		agentList.add("HFD");
		agentList.add("Launch Apps");
		agentList.add("Memo");
		agentList.add("Music");
		agentList.add("Navigation");
		agentList.add("News");
		agentList.add("POI");
		agentList.add("Settings");
		agentList.add("System");
		agentList.add("Weather");
		agentList.add("WebSearch");

		PrintStream total = new PrintStream("total." + args[0] + ".txt");

		for (int idx = 0; idx < agentList.size(); idx ++) {
			String agentName = agentList.get(idx);
			String path = args[0] + "/" + agentName + ".txt";
			
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line = "";
			int lineNum = 0;
			while ((line = br.readLine()) != null) {
			    if (lineNum != 0) {
			    	total.println(line);
			    }
			    lineNum ++;
			}
			br.close();
        }
        total.close();
	}
}