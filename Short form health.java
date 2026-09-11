int n = sc.nextInt();
double total = 0;

while (n-- > 0) {
    String type = sc.next();

    if (type.equals("HEALTH"))
        total += sc.nextDouble() + sc.nextInt() * 10 + sc.nextInt() * 500;
    else
        total += sc.nextDouble() + (sc.nextDouble() / sc.nextInt()) * 0.05;
}

System.out.printf("Total Premium: %.2f", total);
