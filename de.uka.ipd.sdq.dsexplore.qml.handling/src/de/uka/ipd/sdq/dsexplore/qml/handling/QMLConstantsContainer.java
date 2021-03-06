/**
 * 
 */
package de.uka.ipd.sdq.dsexplore.qml.handling;

/**
 * Due to cyclic dependencies, QML needs its own constants container
 * @author noorshams
 *
 */
public class QMLConstantsContainer {


//	public static final String STANDARD_CONTRACT_TYPE_PATH = 
//		"pathmap://PCM_MODELS/PCMStandardQMLContractType.qmldeclarations";
	

	public static final String QUALITY_ATTRIBUTE_DIMENSION_TOTAL_COST_DEFINITION_PATH = "pathmap://PCM_MODELS/Dimension_cost.dimensions";
	public static final String QUALITY_ATTRIBUTE_DIMENSION_INITIAL_COST_DEFINITION_PATH = "pathmap://PCM_MODELS/Dimension_initialcost.dimensions";
	public static final String QUALITY_ATTRIBUTE_DIMENSION_OPERATING_COST_DEFINITION_PATH = "pathmap://PCM_MODELS/Dimension_operatingcost.dimensions";
	

	public static final String QUALITY_ATTRIBUTE_DIMENSION_POFOD_DEFINITION_PATH = "pathmap://PCM_MODELS/Dimension_pofod.dimensions";
	public static final String QUALITY_ATTRIBUTE_DIMENSION_RESPONSETIME_DEFINITION_PATH = "pathmap://PCM_MODELS/Dimension_responsetime.dimensions";
	public static final String QUALITY_ATTRIBUTE_DIMENSION_THROUGHPUT_DEFINITION_PATH = "pathmap://PCM_MODELS/Dimension_throughput.dimensions";
	public static final String QUALITY_ATTRIBUTE_DIMENSION_MAX_UTIL_DEFINITION_PATH = "pathmap://PCM_MODELS/Dimension_maxCPUUtilization.dimensions";
	
	public static final String[] QUALITY_ATTRIBUTE_DIMENSION_DEFINITION_PATHS = new String[] {		
		QUALITY_ATTRIBUTE_DIMENSION_RESPONSETIME_DEFINITION_PATH,
		QUALITY_ATTRIBUTE_DIMENSION_THROUGHPUT_DEFINITION_PATH,
		QUALITY_ATTRIBUTE_DIMENSION_POFOD_DEFINITION_PATH,
		QUALITY_ATTRIBUTE_DIMENSION_TOTAL_COST_DEFINITION_PATH
	};
	
	// quick version, delete later
	public static final String QUALITY_ATTRIBUTE_DIMENSION_SECURITY_PATH = "pathmap://PCM_MODELS/Dimension_security.dimensions";
}
