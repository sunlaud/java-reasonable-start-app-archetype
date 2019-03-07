package $groupId;

import com.google.common.base.CaseFormat;

public class App {
    public static void main(String[] args) {
        System.out.println(new App().uncamelize("helloWorld"));
    }

    public String uncamelize(String str) {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, str).replace('-', ' ');
    }
}
