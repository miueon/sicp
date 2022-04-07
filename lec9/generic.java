interface Base {
    enum Type{
        A,
        B
    }
}

class SubA implements Base {
    public Base.Type type;

}