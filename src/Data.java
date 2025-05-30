
public class Data {

    private int dia;
    private int mes;
    private int ano;

    private static final int DIA_PADRAO = 1;
    private static final int MES_PADRAO = 1;
    private static final int ANO_PADRAO = 2000;

    // Construtor
    public Data(int dia, int mes, int ano) {
        if (isDataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida: " + dia + "/" + mes + "/" + ano + ". Atribuindo data padrão: 1/1/2000.");
            this.dia = DIA_PADRAO;
            this.mes = MES_PADRAO;
            this.ano = ANO_PADRAO;
        }
    }

    // Getters e Setters com validação
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (isDataValida(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido para a data atual.");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (isDataValida(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido para a data atual.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (isDataValida(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido para a data atual.");
        }
    }

    // Método toString
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    // Verifica se um ano é bissexto
    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Verifica se a data é válida
    private boolean isDataValida(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int[] diasNoMes = {
            31,
            verificaAnoBissexto() ? 29 : 28,
            31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        return dia <= diasNoMes[mes - 1];
    }
}
