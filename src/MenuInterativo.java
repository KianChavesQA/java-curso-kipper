import java.util.Scanner;
public class MenuInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        // O loop 'do-while' garante que o menu seja exibido pelo menos uma vez.
        do {
            // --- Exibir o Menu ---
            System.out.println("\n--- Menu de Opções ---");
            System.out.println("1. Iniciar Jogo");
            System.out.println("2. Carregar Perfil");
            System.out.println("3. Configurações");
            System.out.println("0. Sair");
            System.out.print("Digite sua escolha: ");

            // --- Capturar a Escolha ---
            if (scanner.hasNextInt()) {
                escolha = scanner.nextInt();
            } else {
                // Lida com entrada não numérica
                System.out.println("❌ Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Descarta a entrada inválida
                escolha = -1; // Garante que o loop continue
            }
            scanner.nextLine(); // Consome a quebra de linha restante

            // --- Processar a Escolha (Switch) ---
            switch (escolha) {
                case 1:
                    System.out.println("▶️ Iniciando o Jogo...");
                    // Chamar método ou lógica para 'Iniciar Jogo'
                    break;
                case 2:
                    System.out.println("📂 Carregando Perfil...");
                    // Chamar método ou lógica para 'Carregar Perfil'
                    break;
                case 3:
                    System.out.println("⚙️ Abrindo Configurações...");
                    // Chamar método ou lógica para 'Configurações'
                    break;
                case 0:
                    System.out.println("👋 Saindo do programa. Até mais!");
                    break;
                default:
                    if (escolha != -1) { // Evita a mensagem de erro se a entrada for não-numérica
                        System.out.println("⚠️ Opção inválida. Tente novamente.");
                    }
            }

            // A condição do 'while' verifica se a escolha é diferente da opção de saída (0).
        } while (escolha != 0);

        scanner.close();
    }
}