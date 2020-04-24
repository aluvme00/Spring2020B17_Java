package day25_MethodsRecap;

public class Driver {

    public static void main(String[] args) {
        String str = getDriver1("chrome");
        String str2 = getDriver2("chrome");
        String str3= getDriver3("chroMe");


        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);

    }
    public static String getDriver1(String browserName){

        String result = "";

        switch (browserName.toLowerCase()){
            case "chrome": result = "Chrome Driver";
            break;

            case "FireFox":result = "FireFox Driver";
            break;

            case "Safari": result = "Safari Driver";
            break;

            case "Edge": result = "Edge Driver";
            break;

            case "Opera": result = "Opera Driver";
            break;

            default: result = "Invalid Driver";

        }

        return result;
    }

    public static String getDriver2(String browserName){
        browserName = browserName.toLowerCase();
        String result = "";
        if (browserName.equals("chrome")){
            result = "Chrome Driver";
        }else if (browserName.equals("firefox")){
            result = "firefox Driver";
        }else if (browserName.equals("safari")){
            result = "safari Driver";
        }else if (browserName.equals("edge")){
            result = "edge Driver";
        }else if (browserName.equals("opera")){
            result = "opera";
        }else{
            result = "invalid Driver";
        }


        return result;
    }

    public static String getDriver3(String browserName){
        browserName = browserName.toLowerCase();
        String result = (browserName.equals("chrome"))? "Chrome Driver"
                        :(browserName.equals("firefox"))? "FireFox Driver"
                        :(browserName.equals("Edge"))? "Edge Driver"
                        :(browserName.equals("safari"))? "Safari Driver"
                        :(browserName.equals("opera"))? "Opera Driver"
                        :"Invalid Driver";




        return result;
    }
}
