package modelo;

public class Equipo
{
    //Atributos
    private String pais;
    private String continente;

    //Metodos
    public Equipo(String cPais, String continente2)
    {
        this.pais = cPais;
    }

    public String getPais() 
    {
        return pais;
    }
    public void setPais(String pais) 
    {
        this.pais = pais;
    }

    public String getContinente() 
    {
        return continente;
    }
    public void setContinente(String continente) 
    {
        this.continente = continente;
    }
}