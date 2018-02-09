package my.sample.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegExpTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(RegExpTest.class);

	/*public static void main(String[] args) {

		String str = " CELL 107, CDM 2 ANTENNA DIVERSITY IMBALANCE 4";
		String patternString = "CELL\\s+(\\d+)(.*?)(\\D+)\\d*$";

		// CELL\s+(\d+)(.*?)(\D+)\d*$

		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.print("Start index: " + matcher.start());
			System.out.print(" End index: " + matcher.end() + " ");
			System.out.println(matcher.group());
			System.out.println("GRP 0: "+ matcher.group(0));
			System.out.println("GRP 1: "+ matcher.group(1));
			System.out.println("GRP 2: "+ matcher.group(2));
			System.out.println("GRP 3: "+ matcher.group(3));
			
			System.out.println("===============FINAL OUTPUT=======================");
			System.out.println("GRP 1 TRIM O/P: "+ matcher.group(1).trim());
			System.out.println("GRP 3 TRIM O/P: "+ matcher.group(3).trim());
			System.out.println("======================================");
			
		}
	}*/
	
	public static void main(String[] args) {

		String str = "BTS-309                             OOS        UNLOCKED      ENABLED         IDLE            CMP_NONE           CMP_NONE       TRUE";
		String patternString = "BTS-(\\d+)\\s+(\\S+).*$"; //To take complete line in output:- 

		//BTS-(\\d+)\\s+(\\S+)

		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.print("Start index: " + matcher.start());
			System.out.print(" End index: " + matcher.end() + " ");
			System.out.println(matcher.group());
			System.out.println("matcher.toString() : " + matcher.toString());
			System.out.println("GRP 0: "+ matcher.group(0));
			System.out.println("GRP 1: "+ matcher.group(1));
			System.out.println("GRP 2: "+ matcher.group(2));
			
			System.out.println("===============FINAL OUTPUT=======================");
			System.out.println("GRP 1 TRIM O/P: "+ matcher.group(1).trim());
			System.out.println("GRP 2 TRIM O/P: "+ matcher.group(2).trim());
			System.out.println("======================================");
			
		}
	}
	
/*	public static List<GenericAlarm> processBTSOutputOMCR(String output, String neId, String deviceName, String technology) {
		// replace all empty lines and tabs with empty space and then split by New line.
		String[] lines = output.replaceAll("(?m)^[ \t]*\r?\n", StringUtils.EMPTY).split("\n");
		LOGGER.info(">> lines with split :==> " + lines);
		String patternString = "BTS-(\\d+)\\s+(\\S+)";
		//String patternString = "CELL\\s+(\\d+)(.*?)(\\D+)\\d*$";
		Pattern pattern = Pattern.compile(patternString);
		List<GenericAlarm> alarmsList = new ArrayList<GenericAlarm>();
		for (int counter = 0; counter < lines.length; counter++) {
			LOGGER.warn("counter : {} ", counter);
			Matcher matcher = pattern.matcher(lines[counter].trim());
			while (matcher.find()) {
				LOGGER.info(">> MATCHER RECORD START --------------------------------------------------------->> ");
				LOGGER.info("Start index: " + matcher.start());
				LOGGER.info(" End index: " + matcher.end() + " ");
				LOGGER.info(matcher.group());
				LOGGER.info("GRP 0: " + matcher.group(0)); // FULL TEXT -
				String fullText = matcher.group(0);
				LOGGER.info("GRP 1: " + matcher.group(1)); // CELL #
				LOGGER.info("GRP 2: " + matcher.group(2)); // MESSAGE - Probable Cause
				//LOGGER.info("GRP 3: " + matcher.group(3)); // MESSAGE - Probable Cause

				LOGGER.info("===============FINAL OUTPUT=======================");
				LOGGER.info("GRP 1 TRIM O/P: " + matcher.group(1).trim()); // FINAL // CELL #
				String cellNumber = matcher.group(1).trim();
				LOGGER.info("GRP 2 TRIM O/P: " + matcher.group(2).trim()); // FINAL // MESSAGE - Probable Cause
				String message = matcher.group(2).trim();
				LOGGER.info("======================================");
				LOGGER.warn("<< MATCHER RECORD ENDS --------------------------------------------------------->> ");
				alarmsList.add(CellAlarmConvertor.convertToGenericAlarm(neId, cellNumber, message, fullText, deviceName, technology));// Keep checking Concurrancy Impact..
			}
		}

		return alarmsList;
	}	*/
}
