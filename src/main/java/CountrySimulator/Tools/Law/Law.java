package CountrySimulator.Tools.Law;

import CountrySimulator.Tools.Happiness;

/**
 * Abstract Law class can be used to create new law regulations.
 * Natively Law class contains Title and Happiness effect.
 * </ul>
 * @version 0.4
 * @since 0.0.2
 * @author Mateusz Targoński
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

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
}
