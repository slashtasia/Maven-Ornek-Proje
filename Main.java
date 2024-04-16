package tr.edu.medipol.yova;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		String orjinalMetin = "aa  bbb cccc";
		
		String duzeltilmisMetin = StringUtils.deleteWhitespace(orjinalMetin);
		
		System.out.println(orjinalMetin + " -> "+ duzeltilmisMetin);
		

	}

}
