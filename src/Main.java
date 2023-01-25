public class Main {
    public static void main(String[] args) {
        Boss aibek = new Boss();
        aibek.setHeath(100);
        aibek.setDamage(30);
        Weapon aibekWeapon = new Weapon(WeaponType.EXPLOSIVE, "Jevellin");
        aibek.setWeaponIs(aibekWeapon);
        System.out.println(aibek.info());
    }
}