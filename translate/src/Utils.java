
public class Utils {

    // 在平台申请的APP_ID 详见 http://api.fanyi.baidu.com/api/trans/product/desktop?req=developer
    private static final String APP_ID = "20190821000328345";
    private static final String SECURITY_KEY = "9JWxOGWL5xl5eikNlwSi";

    public static String translate(String s) {
        String result = getResult(s);
        int index=0;
        StringBuilder builder=new StringBuilder();
        while((index=result.indexOf("\\u", index))!=-1){
        	index=index+2;
        	builder.append(UniToCh(result.substring(index, index+4)));
        }
        return builder.toString();
        
         
    }
public static String UniToCh(String uni) {
	char letter = (char) Integer.parseInt(uni, 16); // 16进制parse整形字符串。   

    return new Character(letter).toString();
}

public static String getResult(String query) {
	 TransApi api = new TransApi(APP_ID, SECURITY_KEY);
     String result = api.getTransResult(query, "en", "zh");
     String head="dst\":\"";
     String tail="\"}]}";
     int indexOf = result.indexOf(head)+head.length();
     int lastOf=result.indexOf(tail, indexOf);
     return result.substring(indexOf, lastOf);
}
}
