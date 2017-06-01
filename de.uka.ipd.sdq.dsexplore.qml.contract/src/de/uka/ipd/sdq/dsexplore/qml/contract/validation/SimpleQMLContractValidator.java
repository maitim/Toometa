/**
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.validation;

import de.uka.ipd.sdq.dsexplore.qml.contract.Criterion;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.uka.ipd.sdq.dsexplore.qml.contract.SimpleQMLContract}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SimpleQMLContractValidator {
	boolean validate();

	boolean validateCriteria(EList<Criterion> value);
	boolean validateContractType(QMLContractType value);
}
