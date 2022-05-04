package _2_todo;

public class Pair<K, V> {

    private K stuff;
    private V moreStuff;

    public Pair(K k, V v){
        this.stuff = k;
        this.moreStuff = v;
    }

    public K getStuff() {
        return stuff;
    }

    public void setStuff(K stuff) {
        this.stuff = stuff;
    }

    public V getMoreStuff() {
        return moreStuff;
    }

    public void setMoreStuff(V moreStuff) {
        this.moreStuff = moreStuff;
    }
}
