void main() {
    RentalItem lift = new RentalItem(2500);
    RentalItem drill = new RentalItem(100);

    System.out.println(lift.pricePerDay());
    System.out.println(drill.pricePerDay());
    
    RentalItem.setBasePrice(100);

    System.out.println(lift.pricePerDay());
    System.out.println(drill.pricePerDay());
}