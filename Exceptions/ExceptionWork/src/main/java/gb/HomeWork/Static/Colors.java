package gb.HomeWork.Static;

public enum Colors {
    RESET( "\u001B[0m" ),
    BLACK( "\u001B[30m" ),
    RED( "\u001B[31m" ),
    GREEN( "\u001B[32m" ),
    YELLOW( "\u001B[33m" ),
    BLUE( "\u001B[34m" ),
    PURPLE( "\u001B[35m" ),
    CYAN( "\u001B[36m" ),
    GREY( "\u001B[37m" );
    private String ansiCode;

    private Colors(String ansiCode) {
        this.ansiCode = ansiCode;
    }
    public void setAnsi_code(java.lang.String ansiCode) {
        this.ansiCode = ansiCode;
    }
    @Override
    public String toString(){
        return this.ansiCode;
    }
}
