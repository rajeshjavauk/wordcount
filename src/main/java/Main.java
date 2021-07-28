public class Main {

    public static void main(String[] args){
        WordCounter wordCounter=new WordCounter();
        wordCounter.add("rajesh");
        wordCounter.add("rajesh");
        wordCounter.add("rajesh");
        wordCounter.add("rajesh");
        wordCounter.add("rajesh");
        wordCounter.add("nadar");
        wordCounter.add("nadar");
        wordCounter.add("nadar");
        wordCounter.add("hello");
        wordCounter.add("1");
        wordCounter.add("1");
        wordCounter.add("hello1");
        wordCounter.add("hello1");
        System.out.println("rajesh " + wordCounter.wordCount("rajesh"));
        System.out.println("nadar " + wordCounter.wordCount("nadar"));
        System.out.println("hello " + wordCounter.wordCount("hello"));
        System.out.println("hello1 " + wordCounter.wordCount("hello1"));
        System.out.println("1 " + wordCounter.wordCount("1"));
        System.out.println("test " + wordCounter.wordCount("test"));
    }
}
