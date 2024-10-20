public class Test06 {
    public static void main(String[] args) {
        Day d = new Day(2010, 10, 15);
        Account gildong = new Account("길동", "125768", 100, d);

        String s = gildong.toString();
        System.out.println(s);

        Day p = gildong.getOpenDay();
//        Day p = gildong.OpenDay();
        System.out.println("계좌 개설일:" + p);

//        System.out.println(p.getYear() + " - " + p.getMonth() + " - " + p.getDate());
        p.set(1999, 12, 31);

        Day q = gildong.getOpenDay();
        System.out.println("계좌 개설일:" + q);
    }
}
