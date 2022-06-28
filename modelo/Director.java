package modelo;

public class Director 
{
    //Atributos
    private String nombreDirector;
    private int copasGana;
    private String equipoPertenece;
    private int numEqiposDirigidos;


    //Metodos
    public void Equipo(String director, int cGanadas, String pertenece, int eDirigidos)
    {
        this.nombreDirector = director;
        this.copasGana = cGanadas;
        this.equipoPertenece = pertenece;
        this.numEqiposDirigidos = eDirigidos;
    }

    public String getnombreDirector() 
    {
        return nombreDirector;
    }
    public void setNombreEquipo(String nombreDirector) 
    {
        this.nombreDirector = nombreDirector;
    }

    public int getCopasGana() 
    {
        return copasGana;
    }
    public void setCopasGana(int copasGana) 
    {
        this.copasGana = copasGana;
    }

    public String getEquipoPertenece() 
    {
        return equipoPertenece;
    }

    public void setEquipoPertenece(String equipoPertenece) 
    {
        this.equipoPertenece = equipoPertenece;
    }

    public int getNumEqiposDirigidos() 
    {
        return numEqiposDirigidos;
    }

    public void setNumEqiposDirigidos(int numEqiposDirigidos) 
    {
        this.numEqiposDirigidos = numEqiposDirigidos;
    }
}
