import java.util.Scanner;

public class trabalhofinal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menuHome();
    }

    static void menuHome() {
        while (true) {
            System.out.println("\n _____ ____ _____ _      ____ _____ ____  ____  ____ \r\n"
            		+ "/    //  _ Y__ __Y \\__/|/  _ Y__ __Y  _ \\/  __\\/ ___\\\r\n"
            		+ "|  __\\| / \\| / \\ | |\\/||| / \\| / \\ | / \\||  \\/||    \\\r\n"
            		+ "| |   | |-|| | | | |  ||| \\_/| | | | \\_/||    /\\___ |\r\n"
            		+ "\\_/   \\_/ \\| \\_/ \\_/  \\|\\____/ \\_/ \\____/\\_/\\_\\\\____/\r\n"
            		+ "                                                     ");
            System.out.println("1) Ver veículos");
            System.out.println("2) Localização");
            System.out.println("3) Sobre nós");
            System.out.println("4) Contato");
            System.out.println("5) Entrar");
            System.out.println("6) WhatsApp da Loja");
            System.out.println("0) Desconectar");
            System.out.print("Escolha: ");

            int op = sc.nextInt();

            switch (op) {
                case 1: paginaVeiculo(); break;
                case 2: paginaLocalizacao(); break;
                case 3: paginaSobre(); break;
                case 4: paginaContato(); break;
                case 5: paginaLogin(); break;
                case 6: abrirWhatsApp(); break;
                case 0: System.exit(0);
                default: System.out.println("Opção inválida.");
            }
        }
    }

    static void abrirWhatsApp() {
        System.out.println("\nAbrindo WhatsApp da loja:");
        System.out.println("https://wa.me/5511999999999");
    }

    static void paginaLocalizacao() {
        System.out.println("\n======= LOCALIZAÇÃO =======");
        System.out.println("R. Inácio García, 321 - Cidade Edson, Suzano - SP, 08665-120");
        voltarHome();
    }

    static void paginaSobre() {
        System.out.println("\n======= SOBRE NÓS =======");
        System.out.println("A FATMOTORS é a maior loja de veículos da região.");
        voltarHome();
    }

    static void paginaContato() {
        sc.nextLine();
        System.out.println("\n======= FORMULÁRIO DE CONTATO =======");
        System.out.print("Seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Seu email: ");
        String email = sc.nextLine();

        System.out.print("Assunto: ");
        String assunto = sc.nextLine();

        System.out.print("Mensagem: ");
        String mensagem = sc.nextLine();

        System.out.println("\nMensagem enviada com sucesso!");
        voltarHome();
    }

    static void paginaVeiculo() {
        while (true) {
            System.out.println("\n======= VEÍCULOS =======");
            System.out.println("1 - Rolls Royce Ghost");
            System.out.println("2 - Porsche 911");
            System.out.println("3 - Ferrari F8");
            System.out.println("4 - Lamborghini Aventador");
            System.out.println("5 - Ferrari 458");
            System.out.println("6 - Lamborghini Gallardo");
            System.out.println("0 - Voltar");
            System.out.print("Escolha um veículo: ");

            int op = sc.nextInt();

            switch (op) {
                case 1: infoGhost(); break;
                case 2: infoPorsche911(); break;
                case 3: infoFerrariF8(); break;
                case 4: infoAventador(); break;
                case 5: infoFerrari458(); break;
                case 6: infoGallardo(); break;
                case 0: return;
                default: System.out.println("Opção inválida.");
            }
        }
    }

    static void infoGhost() {
        System.out.println("\n======= ROLLS ROYCE GHOST =======");
        System.out.println("Ano: 2020");
        System.out.println("Preço: R$ 4.500.000");
        voltarHome();
    }

    static void infoPorsche911() {
        System.out.println("\n======= PORSCHE 911 =======");
        System.out.println("Ano: 2021");
        System.out.println("Preço: R$ 1.200.000");
        voltarHome();
    }

    static void infoFerrariF8() {
        System.out.println("\n======= FERRARI F8 TRIBUTO =======");
        System.out.println("Ano: 2020");
        System.out.println("Preço: R$ 3.500.000");
        voltarHome();
    }

    static void infoAventador() {
        System.out.println("\n======= LAMBORGHINI AVENTADOR =======");
        System.out.println("Ano: 2019");
        System.out.println("Preço: R$ 5.000.000");
        System.out.println("Informações:"
        		+ "Lamborghini Aventador S 6.5 V12 – 2018 – Km 4.900\r\n"
        		+ "\r\n"
        		+ "– Motor 6.5 V12 740cv Traseiro Central\r\n"
        		+ "– Transmissão Automatizada ISR 7\n"
        		+ "– Tração Integral\n"
        		+ "– Velocidade máxima: 350 km/h\n"
        		+ "– 0-100 km/h 2,9 s\n"
        		+ "– Freios em Carbono / Cerâmica\n"
        		+ "– Peso: 1575 kg\n"
        		+ "\n"
        		+ "– Laranja Arancio Argos\n"
        		+ "– Interno em Couro e Alcântara Black Premium\n"
        		+ "– Detalhes de Interior em Laranja\n"
        		+ "– Bancos Esportivos em Carbono\n"
        		+ "– Molduras Internas em Carbono\n"
        		+ "– Soleiras de Portas Iluminadas em Carbono\n"
        		+ "– Console Central em Carbono\n"
        		+ "– Volante Multifuncional em Alcântara\n"
        		+ "– Acabamento Externo em Carbono\n"
        		+ "– Capas de Retrovisores em Carbono\n"
        		+ "– Caixa de Ar Lateral em Carbono\n"
        		+ "– Pára-choques em Carbono\n"
        		+ "– Elevação de Eixo Dianteiro\n"
        		+ "– Pinças de Freio em Branco\n"
        		+ "– Rodas R20/21 Diablo em Preto Brilhante\n"
        		+ "– Pneu Dianteiro 255/30 R20\n"
        		+ "– Pneu Traseiro 355/25 R21\n"
        		+ "– Full Ceramic Pro\n"
        		+ "– Full PPF");
        voltarHome();
    }

    static void infoFerrari458() {
        System.out.println("\n======= FERRARI 458 ITALIA =======");
        System.out.println("Ano: 2015");
        System.out.println("Preço: R$ 2.700.000");
        voltarHome();
    }

    static void infoGallardo() {
        System.out.println("\n======= LAMBORGHINI GALLARDO =======");
        System.out.println("Ano: 2013");
        System.out.println("Preço: R$ 1.300.000");
        voltarHome();
    }


    static void paginaLogin() {
        while (true) {
            System.out.println("\n======= LOGIN =======");
            System.out.println("1 - Login Google");
            System.out.println("2 - Login Facebook");
            System.out.println("3 - Login Apple");
            System.out.println("4 - Login X / Twitter");
            System.out.println("5 - Login com Email e Senha");
            System.out.println("6 - Cadastrar Cliente");
            System.out.println("7 - Cadastrar Funcionário");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");

            int op = sc.nextInt();

            switch (op) {
                case 1: System.out.println("Login Google efetuado!"); break;
                case 2: System.out.println("Login Facebook efetuado!"); break;
                case 3: System.out.println("Login Apple efetuado!"); break;
                case 4: System.out.println("Login X/Twitter efetuado!"); break;
                case 5: loginEmail(); break;
                case 6: cadastroCliente(); break;
                case 7: cadastroFuncionario(); break;
                case 0: return;
                default: System.out.println("Opção inválida.");
            }
        }
    }

    static void loginEmail() {
        sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        System.out.println("Login realizado!");
    }

    static void cadastroCliente() {
        sc.nextLine();
        System.out.println("\n======= CADASTRO CLIENTE =======");

        System.out.print("Nome completo: ");
        String nome = sc.nextLine();

        System.out.print("Telefone: ");
        String tel = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        System.out.print("Confirmar senha: ");
        String cs = sc.nextLine();

        System.out.println("Cliente cadastrado!");
    }

    static void cadastroFuncionario() {
        sc.nextLine();
        System.out.println("\n======= CADASTRO FUNCIONÁRIO =======");

        System.out.print("Nome completo: ");
        String nome = sc.nextLine();

        System.out.print("RG: ");
        String rg = sc.nextLine();

        System.out.print("Telefone: ");
        String tel = sc.nextLine();

        System.out.print("Estado: ");
        String estado = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Unidade: ");
        String unidade = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine(); 

        System.out.print("Confirmar senha: ");
        String cs = sc.nextLine();

        System.out.println("Funcionário cadastrado!");
    }

    static void voltarHome() {
        System.out.println("\nPressione ENTER para voltar ao início...");
        sc.nextLine();
        sc.nextLine();
    }
}
