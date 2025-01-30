class Animal {
    private double size;
    private double weight;
    private String food;
    private String voice;

    // Параметризованный конструктор
    Animal(double s, double w, String v, String f) {
        weight = w;
        size = s;
        food = f;
        voice = v;
    }

    // Методы доступа
    double getWeight() { return weight; }
    double getSize() { return size; }
    void setWeight(double w) { weight = w; }
    void setSize(double s) { size = s; }
    String getFood() {return food;}
    String getVoice(){return voice;}
    void setFood(String f){food = f;}
    void setVoice(String v){voice = v;}

    void showInfo() {
        System.out.println("Рост: " + size + " см");
        System.out.println("Вес: " + weight + " кг");
    }

    void showFood() {
        System.out.println("Еда: " + food);
    }
    void showVoice() {
        System.out.println("Голос: " + voice);
    }
}

// Наследование от Animal
class Mammals extends Animal {
    private String group;

    // Параметризованный конструктор
    Mammals(String g, double s, double w, String v, String f) {
        super(s, w, v, f);
        group = g;
    }

    void showGroup() {
        System.out.println("Млекопитающее\n" + group);
    }
}
class Reprilies extends Animal {
    private String group;

    // Параметризованный конструктор
    Reprilies(String g, double s, double w, String v, String f) {
        super(s, w, v, f);
        group = g;
    }

    void showGroup() {
        System.out.println("Рептилия\n" + group);
    }
}
// Расширенный класс
class PredatorsMam extends Mammals {
    private String type;

    PredatorsMam(String t, double s, double w, String v, String f) {
        super("Хищник", s, w, v, f);
        type = t;
    }

    void showType() {
        System.out.println(type);
    }
}
class PredatorsRep extends Reprilies {
    private String type;

    PredatorsRep(String t, double s, double w, String v, String f) {
        super("Хищник", s, w, v, f);
        type = t;
    }

    void showType() {
        System.out.println(type);
    }
}
class HerbivoresMam extends Mammals {
    private String type;

    HerbivoresMam(String t, double s, double w, String v, String f) {
        super("Травоядное", s, w, v, f);
        type = t;
    }

    void showType() {
        System.out.println(type);
    }
}
class HerbivoresRep extends Reprilies {
    private String type;

    HerbivoresRep(String t, double s, double w, String v, String f) {
        super("Травоядное", s, w, v, f);
        type = t;
    }

    void showType() {
        System.out.println(type);
    }
}
// Расширенный подкласс подкласса
class Wolf extends PredatorsMam {
    Wolf (double s, double w, String v, String f) {
        super("Волк", s, w, v, f);
    }
}
class Sheep extends HerbivoresMam {
    Sheep (double s, double w, String v, String f) {
        super("Овца", s, w, v, f);
    }
}
class Croc extends PredatorsRep {
    Croc (double s, double w, String v, String f) {
        super("Крокодил",s,w,v,f);
    }
}
class Frog extends HerbivoresRep {
    Frog (double s, double w, String v, String f) {
        super("Лягушка", s, w, v, f);
    }
}
class Zoo {
    public static void main(String[] args) {
        Wolf wolf = new Wolf(90,50,"Ауффф","Мясо");
        System.out.println("Информация о волке:");
        wolf.showGroup();
        wolf.showType();
        wolf.showInfo();
        wolf.showVoice();
        wolf.showFood();

        System.out.println();


        Croc croc = new Croc(1200, 200, "Кх-кх-кх", "Мясо");
        System.out.println("Информация о крокодиле:");
        croc.showGroup();
        croc.showType();
        croc.showInfo();
        croc.showVoice();
        croc.showFood();

        System.out.println();


        Sheep sheep = new Sheep(60,35,"Беее","Сено");
        System.out.println("Информация о овце:");
        sheep.showGroup();
        sheep.showType();
        sheep.showInfo();
        sheep.showVoice();
        sheep.showFood();

        System.out.println();

        Frog frog = new Frog(5,0.3,"Ква-ква","Мухи");
        System.out.println("Информация о лягушке:");
        frog.showGroup();
        frog.showType();
        frog.showInfo();
        frog.showVoice();
        frog.showFood();
    }
}