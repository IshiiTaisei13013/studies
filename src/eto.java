public enum eto {
    NE("子", 1),
    USHI("丑", 2),
    TRA("寅", 3),
    U("卯", 4),
    TATSU("辰", 5),
    MI("巳", 6),
    HITSUJI("未", 7),
    UMA("午", 8),
    SARU("申", 9),
    TORI("酉", 10),
    INU("戌", 11),
    I("亥", 12);

    private final String name;
    private final int id;

    eto(final String name, final int id) {
        this.name = name;
        this.id = id;
    }

    public static eto findById(int id){
        for (final eto i:eto.values()){
            if(i.id == id){
                return i;
            }
        }
        return null;
    }

    public static eto findByName(final String name){

        if(name == null){
            return null;
        }

        for (final eto i : eto.values()){
            if( i.name.equals(name)){
                return i;
            }
        }
        return null;
    }
}
