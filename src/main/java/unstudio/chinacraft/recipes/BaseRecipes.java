package unstudio.chinacraft.recipes;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;

public class BaseRecipes<T extends BaseRecipe> {

    private List<T> Recipes;

    public BaseRecipes() {
        Recipes = new ArrayList<T>();
    }

    public List<T> getAllRecipes() {
        return Recipes;
    }

    public void addRecipe(T recipe) {
        Recipes.add(recipe);
    }

    public T getRecipeFromInputs(ItemStack[] inputs) {
        for (T recipe : Recipes) {
            if (recipe.inputsEquals(inputs))
                return recipe;
        }
        return null;
    }
}
