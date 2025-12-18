//Obs: Estou usando Java 25, a declaração do main method está diferente por isso.
void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    while (!sc.hasNextInt()) {
        System.out.println("Número inválido, tente novamente.");
        sc.next();
    }
    int num1 = sc.nextInt();

    System.out.println("Digite o segundo número: ");
    while (!sc.hasNextInt()) {
        System.out.println("Número inválido, tente novamente.");
        sc.next();
    }
    int num2 = sc.nextInt();

    System.out.println(compareNums.apply(num1, num2));
}

private final static BiFunction<Integer, Integer, String> compareNums = (a, b) -> {
    int maior;

    if (a == b) return String.format("Os números são iguais!");
    else if (a > b) maior = a;
    else maior = b;

    return String.format("O maior número é %d", maior);
};