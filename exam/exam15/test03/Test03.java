package test03;

public class Test03 {
    public static void main(String[] args) {
        ExId a = new ExId();
        ExId b = new ExId();
        ExId c = new ExId();
        ExId.setStep(4);
        ExId d = new ExId();
        ExId e = new ExId();
        ExId.setStep(1);
        ExId f = new ExId();

        System.out.println("a의 식별 번호:" + a.getId());
        System.out.println("b의 식별 번호:" + b.getId());
        System.out.println("c의 식별 번호:" + c.getId());
        System.out.println("d의 식별 번호:" + d.getId());
        System.out.println("e의 식별 번호:" + e.getId());
        System.out.println("f의 식별 번호:" + f.getId());

        int max = ExId.getMaxId();
        System.out.println("마지막에 부여한 식별 번호 = " + max);
        System.out.println("다음에 부여한 식별 번호 = " + (max + ExId.getStep()));
    }
}
