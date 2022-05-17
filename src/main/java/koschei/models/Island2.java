package koschei.models;


import koschei.config.AppConfig;

public class Island2 extends AppConfig {

    private Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
