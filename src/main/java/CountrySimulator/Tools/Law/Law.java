package CountrySimulator.Tools.Law;

import CountrySimulator.Tools.Happiness;

/**
 * Abstract Law class can be used to create new law regulations.
 * Natively Law class contains Title and Happiness effect.
 * </ul>
 */
public abstract class Law{
    private String title;
    private Happiness happinessEffect;

    public void setHappinessEffect(Happiness happinessEffect){
        this.happinessEffect = happinessEffect;
    }
    public Happiness getHappinessEffect(){
        return happinessEffect;
    }

    public void setTitle(String s){
        this.title = s;
    }
    public String getTitle(){
        return title;
    }
}
