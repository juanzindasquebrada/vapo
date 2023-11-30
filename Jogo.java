public class Jogo {
    public class SuperPoder {
        private String nome;
        private int categoria;

        public String getNome() {
            return nome;
        }

        public int getCategoria() {
            return categoria;
        }

        public SuperPoder(String nome, int categoria) {
            this.nome = nome;
            this.categoria = categoria;
        }
    }

    public class Personagem {
        private String nome;
        private String NomeVidaReal;
        private String poder[] = new String[4];

        public Personagem(String nome, String nomeVidaReal) {
            this.nome = nome;
            NomeVidaReal = nomeVidaReal;
        }

        public void Sp() {
            private String


        }


        public class SuperHeroi extends Personagem{
            double PoderTotal;
            public SuperHeroi(String nome, String nomeVidaReal) {
                super(nome, nomeVidaReal);
                }
            }

            public class Vilao extends Personagem{

            private int TempodePrisao;

                public Vilao(String nome, String nomeVidaReal, int TempodePrisao) {
                    super(nome, nomeVidaReal);
                    this.TempodePrisao = TempodePrisao;

                }
            }
            public class Confronto{
            int executar (SuperHeroi superHeroi, Vilao vilao){
                if (SuperHeroi>Vilao)
                        return 1;
                else
                    if (Vilao>SuperHeroi)
                        return 2;
                    else
                        return 0;


            }


            }
        }
    }




