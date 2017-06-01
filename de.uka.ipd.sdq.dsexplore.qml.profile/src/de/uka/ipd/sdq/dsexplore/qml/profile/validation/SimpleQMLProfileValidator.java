/**
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.validation;

import de.uka.ipd.sdq.dsexplore.qml.profile.Requirement;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.usagemodel.UsageModel;

/**
 * A sample validator interface for {@link de.uka.ipd.sdq.dsexplore.qml.profile.SimpleQMLProfile}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SimpleQMLProfileValidator {
	boolean validate();

	boolean validateUsageModel(UsageModel value);
	boolean validateRequirements(EList<Requirement> value);
}