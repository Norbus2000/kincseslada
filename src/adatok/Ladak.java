package adatok;

public enum Ladak {
    ARANY("én rejtem a kincset"),
    EZÜST("nem én rejtem a kincset"),
    BRONZ("az arany hazudik"),
    ;
    
    

    private final String szovegek;

    Ladak (String szovegek) {
        this.szovegek = szovegek;
    }

    @Override
    public String toString() {
        return szovegek;
    }
}

