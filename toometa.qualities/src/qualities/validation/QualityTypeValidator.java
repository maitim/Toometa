/**
 *
 * $Id$
 */
package qualities.validation;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension;

import qualities.QualityTypeRepository;

/**
 * A sample validator interface for {@link qualities.QualityType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface QualityTypeValidator {
	boolean validate();

	boolean validateDescription(String value);
	boolean validateQualityTypeRepository(QualityTypeRepository value);
	boolean validateDimension(Dimension value);
}
