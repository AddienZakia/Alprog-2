package Program.ClassOOP;

class Binatang {
    public void bersuara() {
        System.out.println("...");
    }
}

class Anjing extends Binatang {
    public void bersuara() {
        System.out.println("Gukk Gukk");
    }
}

class Kucing extends Binatang {
    public void bersuara() {
        System.out.println("Meongg Meongg..");
    }
}
