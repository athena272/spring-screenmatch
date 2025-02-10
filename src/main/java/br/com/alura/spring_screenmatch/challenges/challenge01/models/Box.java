package br.com.alura.spring_screenmatch.challenges.challenge01.models;

public class Box<T> {
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public <T> T sumContent(T value) {
        if(this.content instanceof Integer c && value instanceof Integer i) {
            Integer result = c + i;
            return (T) result;
        } else  if (this.content instanceof Double c && value instanceof Double d) {
            Double result = c + d;
            return (T) result;
        } else if (this.content instanceof String c && value instanceof String s) {
            String result = c + "\n" + s;
            return (T) result;
        }
        return null;
    }
}
