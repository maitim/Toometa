/**
 *
 * $Id$
 */
package effects.validation;

import effects.EffectCategory;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link effects.CategoryEffect}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CategoryEffectValidator {
	boolean validate();

	boolean validateCategory(EList<EffectCategory> value);
}