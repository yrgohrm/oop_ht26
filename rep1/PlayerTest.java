void main() {
    Player p = new Player("xxxTheWinnerxxx");

    p.levelUp();
    p.increaseScore(1001);

    System.out.println(p.getName());
    System.out.println(p.getLevel());
    System.out.println(p.getScore());
}
