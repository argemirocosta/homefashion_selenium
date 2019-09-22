package factory;

public class Propriedades {

    public static Browsers BROWSER = Browsers.FIREFOX;

    public static TipoExecucao TIPO_EXECUCAO = TipoExecucao.NUVEM;

    public enum Browsers {
        CHROME,
        FIREFOX
    }

    public enum TipoExecucao {
        LOCAL,
        GRID,
        NUVEM
    }
}
