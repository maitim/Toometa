/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.Restriction#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractPackage#getRestriction()
 * @model
 * @generated
 */
public interface Restriction extends AspectRequirement {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uka.ipd.sdq.dsexplore.qml.contract.EnumOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see de.uka.ipd.sdq.dsexplore.qml.contract.EnumOperator
	 * @see #setOperator(EnumOperator)
	 * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractPackage#getRestriction_Operator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EnumOperator getOperator();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.dsexplore.qml.contract.Restriction#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see de.uka.ipd.sdq.dsexplore.qml.contract.EnumOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(EnumOperator value);

} // Restriction
