package Assignment5.prob1;

public final class SingletonClass {
    private static String key;
    private static SingletonClass instance = null;

    private SingletonClass (){
        key = getKey();
    }

    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
            System.out.println("Key generated Successfully\n" +
                    "Your key to activate Avast anti virus is "+ key);
        }
        else{
            System.out.println("Unsuccessful to produce the key....\n");
            return null;
        }
        return instance;
    }

    public String getKey(){
        return RandomNumber.getSevenDigitNumber();
    }
}
