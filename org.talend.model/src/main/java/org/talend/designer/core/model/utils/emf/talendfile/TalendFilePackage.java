/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface TalendFilePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "org.talend.designer.core.model.utils.emf.talendfile";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "platform:/resource/org.talend.model/model/TalendFile.xsd";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "TalendFile";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TalendFilePackage eINSTANCE = org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl <em>Column Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getColumnType()
     * @generated
     */
    int COLUMN_TYPE = 0;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__COMMENT = 0;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__KEY = 1;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__LENGTH = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__NAME = 3;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__NULLABLE = 4;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__PRECISION = 5;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__TYPE = 6;

    /**
     * The number of structural features of the '<em>Column Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ConnectionTypeImpl <em>Connection Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.ConnectionTypeImpl
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getConnectionType()
     * @generated
     */
    int CONNECTION_TYPE = 1;

    /**
     * The feature id for the '<em><b>Element Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__ELEMENT_PARAMETER = 0;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__LABEL = 1;

    /**
     * The feature id for the '<em><b>Line Style</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__LINE_STYLE = 2;

    /**
     * The feature id for the '<em><b>Metaname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__METANAME = 3;

    /**
     * The feature id for the '<em><b>Offset Label X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__OFFSET_LABEL_X = 4;

    /**
     * The feature id for the '<em><b>Offset Label Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__OFFSET_LABEL_Y = 5;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__SOURCE = 6;

    /**
     * The feature id for the '<em><b>Target</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__TARGET = 7;

    /**
     * The number of structural features of the '<em>Connection Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE_FEATURE_COUNT = 8;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ContextParameterTypeImpl <em>Context Parameter Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.ContextParameterTypeImpl
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getContextParameterType()
     * @generated
     */
    int CONTEXT_PARAMETER_TYPE = 2;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PARAMETER_TYPE__COMMENT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PARAMETER_TYPE__NAME = 1;

    /**
     * The feature id for the '<em><b>Prompt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PARAMETER_TYPE__PROMPT = 2;

    /**
     * The feature id for the '<em><b>Prompt Needed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PARAMETER_TYPE__PROMPT_NEEDED = 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PARAMETER_TYPE__TYPE = 4;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PARAMETER_TYPE__VALUE = 5;

    /**
     * The number of structural features of the '<em>Context Parameter Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PARAMETER_TYPE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ContextTypeImpl <em>Context Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.ContextTypeImpl
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getContextType()
     * @generated
     */
    int CONTEXT_TYPE = 3;

    /**
     * The feature id for the '<em><b>Context Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE__CONTEXT_PARAMETER = 0;

    /**
     * The feature id for the '<em><b>Confirmation Needed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE__CONFIRMATION_NEEDED = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE__NAME = 2;

    /**
     * The number of structural features of the '<em>Context Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.DocumentRootImpl
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 4;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Connection</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONNECTION = 3;

    /**
     * The feature id for the '<em><b>Context</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONTEXT = 4;

    /**
     * The feature id for the '<em><b>Element Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ELEMENT_PARAMETER = 5;

    /**
     * The feature id for the '<em><b>Node</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NODE = 6;

    /**
     * The feature id for the '<em><b>Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROCESS = 7;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 8;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ElementParameterTypeImpl <em>Element Parameter Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.ElementParameterTypeImpl
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getElementParameterType()
     * @generated
     */
    int ELEMENT_PARAMETER_TYPE = 5;

    /**
     * The feature id for the '<em><b>Element Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_PARAMETER_TYPE__ELEMENT_VALUE = 0;

    /**
     * The feature id for the '<em><b>Field</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_PARAMETER_TYPE__FIELD = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_PARAMETER_TYPE__NAME = 2;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_PARAMETER_TYPE__VALUE = 3;

    /**
     * The number of structural features of the '<em>Element Parameter Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_PARAMETER_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ElementValueTypeImpl <em>Element Value Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.ElementValueTypeImpl
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getElementValueType()
     * @generated
     */
    int ELEMENT_VALUE_TYPE = 6;

    /**
     * The feature id for the '<em><b>Element Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_VALUE_TYPE__ELEMENT_REF = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_VALUE_TYPE__VALUE = 1;

    /**
     * The number of structural features of the '<em>Element Value Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_VALUE_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.LogsTypeImpl <em>Logs Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.LogsTypeImpl
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getLogsType()
     * @generated
     */
    int LOGS_TYPE = 7;

    /**
     * The feature id for the '<em><b>Log To File</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGS_TYPE__LOG_TO_FILE = 0;

    /**
     * The feature id for the '<em><b>Log To Database</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGS_TYPE__LOG_TO_DATABASE = 1;

    /**
     * The feature id for the '<em><b>Log To Std Out</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGS_TYPE__LOG_TO_STD_OUT = 2;

    /**
     * The number of structural features of the '<em>Logs Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGS_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.LogToDatabaseTypeImpl <em>Log To Database Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.LogToDatabaseTypeImpl
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getLogToDatabaseType()
     * @generated
     */
    int LOG_TO_DATABASE_TYPE = 8;

    /**
     * The feature id for the '<em><b>Database</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_DATABASE_TYPE__DATABASE = 0;

    /**
     * The feature id for the '<em><b>Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_DATABASE_TYPE__LEVEL = 1;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_DATABASE_TYPE__SELECTED = 2;

    /**
     * The number of structural features of the '<em>Log To Database Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_DATABASE_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.LogToFileTypeImpl <em>Log To File Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.LogToFileTypeImpl
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getLogToFileType()
     * @generated
     */
    int LOG_TO_FILE_TYPE = 9;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_FILE_TYPE__FILENAME = 0;

    /**
     * The feature id for the '<em><b>Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_FILE_TYPE__LEVEL = 1;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_FILE_TYPE__SELECTED = 2;

    /**
     * The number of structural features of the '<em>Log To File Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_FILE_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.LogToStdOutTypeImpl <em>Log To Std Out Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.LogToStdOutTypeImpl
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getLogToStdOutType()
     * @generated
     */
    int LOG_TO_STD_OUT_TYPE = 10;

    /**
     * The feature id for the '<em><b>Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_STD_OUT_TYPE__LEVEL = 0;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_STD_OUT_TYPE__SELECTED = 1;

    /**
     * The number of structural features of the '<em>Log To Std Out Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_STD_OUT_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.MetadataTypeImpl
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getMetadataType()
     * @generated
     */
    int METADATA_TYPE = 11;

    /**
     * The feature id for the '<em><b>Column</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE__COLUMN = 0;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE__COMMENT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE__NAME = 2;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE__SOURCE = 3;

    /**
     * The number of structural features of the '<em>Metadata Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl <em>Node Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getNodeType()
     * @generated
     */
    int NODE_TYPE = 12;

    /**
     * The feature id for the '<em><b>Element Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__ELEMENT_PARAMETER = 0;

    /**
     * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__METADATA = 1;

    /**
     * The feature id for the '<em><b>Binary Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__BINARY_DATA = 2;

    /**
     * The feature id for the '<em><b>String Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__STRING_DATA = 3;

    /**
     * The feature id for the '<em><b>Component Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__COMPONENT_NAME = 4;

    /**
     * The feature id for the '<em><b>Component Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__COMPONENT_VERSION = 5;

    /**
     * The feature id for the '<em><b>Offset Label X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__OFFSET_LABEL_X = 6;

    /**
     * The feature id for the '<em><b>Offset Label Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__OFFSET_LABEL_Y = 7;

    /**
     * The feature id for the '<em><b>Pos X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__POS_X = 8;

    /**
     * The feature id for the '<em><b>Pos Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__POS_Y = 9;

    /**
     * The number of structural features of the '<em>Node Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE_FEATURE_COUNT = 10;

    /**
     * The meta object id for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl <em>Process Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl
     * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getProcessType()
     * @generated
     */
    int PROCESS_TYPE = 13;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__DESCRIPTION = 0;

    /**
     * The feature id for the '<em><b>Context</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__CONTEXT = 1;

    /**
     * The feature id for the '<em><b>Node</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__NODE = 2;

    /**
     * The feature id for the '<em><b>Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__CONNECTION = 3;

    /**
     * The feature id for the '<em><b>Logs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__LOGS = 4;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__AUTHOR = 5;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__COMMENT = 6;

    /**
     * The feature id for the '<em><b>Default Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__DEFAULT_CONTEXT = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__NAME = 8;

    /**
     * The feature id for the '<em><b>Purpose</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__PURPOSE = 9;

    /**
     * The feature id for the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__STATUS = 10;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__VERSION = 11;

    /**
     * The number of structural features of the '<em>Process Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE_FEATURE_COUNT = 12;


    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType <em>Column Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Column Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ColumnType
     * @generated
     */
    EClass getColumnType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getComment()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_Comment();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#isKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ColumnType#isKey()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_Key();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getLength <em>Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Length</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getLength()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_Length();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getName()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#isNullable <em>Nullable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nullable</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ColumnType#isNullable()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_Nullable();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getPrecision <em>Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Precision</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getPrecision()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_Precision();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getType()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_Type();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.talendfile.ConnectionType <em>Connection Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ConnectionType
     * @generated
     */
    EClass getConnectionType();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.talendfile.ConnectionType#getElementParameter <em>Element Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Element Parameter</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ConnectionType#getElementParameter()
     * @see #getConnectionType()
     * @generated
     */
    EReference getConnectionType_ElementParameter();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ConnectionType#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ConnectionType#getLabel()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_Label();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ConnectionType#getLineStyle <em>Line Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Line Style</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ConnectionType#getLineStyle()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_LineStyle();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ConnectionType#getMetaname <em>Metaname</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Metaname</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ConnectionType#getMetaname()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_Metaname();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ConnectionType#getOffsetLabelX <em>Offset Label X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Offset Label X</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ConnectionType#getOffsetLabelX()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_OffsetLabelX();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ConnectionType#getOffsetLabelY <em>Offset Label Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Offset Label Y</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ConnectionType#getOffsetLabelY()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_OffsetLabelY();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ConnectionType#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ConnectionType#getSource()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_Source();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ConnectionType#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ConnectionType#getTarget()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_Target();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType <em>Context Parameter Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Parameter Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType
     * @generated
     */
    EClass getContextParameterType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType#getComment()
     * @see #getContextParameterType()
     * @generated
     */
    EAttribute getContextParameterType_Comment();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType#getName()
     * @see #getContextParameterType()
     * @generated
     */
    EAttribute getContextParameterType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType#getPrompt <em>Prompt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prompt</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType#getPrompt()
     * @see #getContextParameterType()
     * @generated
     */
    EAttribute getContextParameterType_Prompt();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType#isPromptNeeded <em>Prompt Needed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prompt Needed</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType#isPromptNeeded()
     * @see #getContextParameterType()
     * @generated
     */
    EAttribute getContextParameterType_PromptNeeded();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType#getType()
     * @see #getContextParameterType()
     * @generated
     */
    EAttribute getContextParameterType_Type();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType#getValue()
     * @see #getContextParameterType()
     * @generated
     */
    EAttribute getContextParameterType_Value();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextType <em>Context Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ContextType
     * @generated
     */
    EClass getContextType();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextType#getContextParameter <em>Context Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Context Parameter</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ContextType#getContextParameter()
     * @see #getContextType()
     * @generated
     */
    EReference getContextType_ContextParameter();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextType#isConfirmationNeeded <em>Confirmation Needed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Confirmation Needed</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ContextType#isConfirmationNeeded()
     * @see #getContextType()
     * @generated
     */
    EAttribute getContextType_ConfirmationNeeded();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ContextType#getName()
     * @see #getContextType()
     * @generated
     */
    EAttribute getContextType_Name();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getConnection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Connection</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getConnection()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Connection();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getContext()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Context();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getElementParameter <em>Element Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Element Parameter</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getElementParameter()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ElementParameter();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getNode <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Node</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getNode()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Node();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getProcess <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Process</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getProcess()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Process();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType <em>Element Parameter Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element Parameter Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType
     * @generated
     */
    EClass getElementParameterType();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType#getElementValue <em>Element Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Element Value</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType#getElementValue()
     * @see #getElementParameterType()
     * @generated
     */
    EReference getElementParameterType_ElementValue();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType#getField <em>Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Field</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType#getField()
     * @see #getElementParameterType()
     * @generated
     */
    EAttribute getElementParameterType_Field();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType#getName()
     * @see #getElementParameterType()
     * @generated
     */
    EAttribute getElementParameterType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType#getValue()
     * @see #getElementParameterType()
     * @generated
     */
    EAttribute getElementParameterType_Value();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.talendfile.ElementValueType <em>Element Value Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element Value Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ElementValueType
     * @generated
     */
    EClass getElementValueType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ElementValueType#getElementRef <em>Element Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Element Ref</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ElementValueType#getElementRef()
     * @see #getElementValueType()
     * @generated
     */
    EAttribute getElementValueType_ElementRef();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ElementValueType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ElementValueType#getValue()
     * @see #getElementValueType()
     * @generated
     */
    EAttribute getElementValueType_Value();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.talendfile.LogsType <em>Logs Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Logs Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.LogsType
     * @generated
     */
    EClass getLogsType();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.talendfile.LogsType#getLogToFile <em>Log To File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Log To File</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.LogsType#getLogToFile()
     * @see #getLogsType()
     * @generated
     */
    EReference getLogsType_LogToFile();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.talendfile.LogsType#getLogToDatabase <em>Log To Database</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Log To Database</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.LogsType#getLogToDatabase()
     * @see #getLogsType()
     * @generated
     */
    EReference getLogsType_LogToDatabase();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.talendfile.LogsType#getLogToStdOut <em>Log To Std Out</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Log To Std Out</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.LogsType#getLogToStdOut()
     * @see #getLogsType()
     * @generated
     */
    EReference getLogsType_LogToStdOut();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToDatabaseType <em>Log To Database Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Log To Database Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.LogToDatabaseType
     * @generated
     */
    EClass getLogToDatabaseType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToDatabaseType#getDatabase <em>Database</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Database</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.LogToDatabaseType#getDatabase()
     * @see #getLogToDatabaseType()
     * @generated
     */
    EAttribute getLogToDatabaseType_Database();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToDatabaseType#getLevel <em>Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Level</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.LogToDatabaseType#getLevel()
     * @see #getLogToDatabaseType()
     * @generated
     */
    EAttribute getLogToDatabaseType_Level();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToDatabaseType#isSelected <em>Selected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selected</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.LogToDatabaseType#isSelected()
     * @see #getLogToDatabaseType()
     * @generated
     */
    EAttribute getLogToDatabaseType_Selected();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToFileType <em>Log To File Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Log To File Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.LogToFileType
     * @generated
     */
    EClass getLogToFileType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToFileType#getFilename <em>Filename</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filename</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.LogToFileType#getFilename()
     * @see #getLogToFileType()
     * @generated
     */
    EAttribute getLogToFileType_Filename();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToFileType#getLevel <em>Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Level</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.LogToFileType#getLevel()
     * @see #getLogToFileType()
     * @generated
     */
    EAttribute getLogToFileType_Level();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToFileType#isSelected <em>Selected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selected</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.LogToFileType#isSelected()
     * @see #getLogToFileType()
     * @generated
     */
    EAttribute getLogToFileType_Selected();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToStdOutType <em>Log To Std Out Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Log To Std Out Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.LogToStdOutType
     * @generated
     */
    EClass getLogToStdOutType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToStdOutType#getLevel <em>Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Level</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.LogToStdOutType#getLevel()
     * @see #getLogToStdOutType()
     * @generated
     */
    EAttribute getLogToStdOutType_Level();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToStdOutType#isSelected <em>Selected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selected</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.LogToStdOutType#isSelected()
     * @see #getLogToStdOutType()
     * @generated
     */
    EAttribute getLogToStdOutType_Selected();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.talendfile.MetadataType <em>Metadata Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Metadata Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.MetadataType
     * @generated
     */
    EClass getMetadataType();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.talendfile.MetadataType#getColumn <em>Column</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Column</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.MetadataType#getColumn()
     * @see #getMetadataType()
     * @generated
     */
    EReference getMetadataType_Column();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.MetadataType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.MetadataType#getComment()
     * @see #getMetadataType()
     * @generated
     */
    EAttribute getMetadataType_Comment();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.MetadataType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.MetadataType#getName()
     * @see #getMetadataType()
     * @generated
     */
    EAttribute getMetadataType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.MetadataType#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.MetadataType#getSource()
     * @see #getMetadataType()
     * @generated
     */
    EAttribute getMetadataType_Source();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType <em>Node Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.NodeType
     * @generated
     */
    EClass getNodeType();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getElementParameter <em>Element Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Element Parameter</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.NodeType#getElementParameter()
     * @see #getNodeType()
     * @generated
     */
    EReference getNodeType_ElementParameter();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getMetadata <em>Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Metadata</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.NodeType#getMetadata()
     * @see #getNodeType()
     * @generated
     */
    EReference getNodeType_Metadata();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getBinaryData <em>Binary Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Binary Data</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.NodeType#getBinaryData()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_BinaryData();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getStringData <em>String Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>String Data</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.NodeType#getStringData()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_StringData();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getComponentName <em>Component Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Component Name</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.NodeType#getComponentName()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_ComponentName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getComponentVersion <em>Component Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Component Version</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.NodeType#getComponentVersion()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_ComponentVersion();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getOffsetLabelX <em>Offset Label X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Offset Label X</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.NodeType#getOffsetLabelX()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_OffsetLabelX();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getOffsetLabelY <em>Offset Label Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Offset Label Y</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.NodeType#getOffsetLabelY()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_OffsetLabelY();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getPosX <em>Pos X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pos X</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.NodeType#getPosX()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_PosX();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getPosY <em>Pos Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pos Y</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.NodeType#getPosY()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_PosY();

    /**
     * Returns the meta object for class '{@link org.talend.designer.core.model.utils.emf.talendfile.ProcessType <em>Process Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process Type</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ProcessType
     * @generated
     */
    EClass getProcessType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getDescription()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_Description();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Context</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getContext()
     * @see #getProcessType()
     * @generated
     */
    EReference getProcessType_Context();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getNode <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Node</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getNode()
     * @see #getProcessType()
     * @generated
     */
    EReference getProcessType_Node();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getConnection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Connection</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getConnection()
     * @see #getProcessType()
     * @generated
     */
    EReference getProcessType_Connection();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getLogs <em>Logs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Logs</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getLogs()
     * @see #getProcessType()
     * @generated
     */
    EReference getProcessType_Logs();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getAuthor()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_Author();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getComment()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_Comment();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getDefaultContext <em>Default Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Context</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getDefaultContext()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_DefaultContext();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getName()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getPurpose <em>Purpose</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Purpose</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getPurpose()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_Purpose();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getStatus <em>Status</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Status</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getStatus()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_Status();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see org.talend.designer.core.model.utils.emf.talendfile.ProcessType#getVersion()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_Version();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TalendFileFactory getTalendFileFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl <em>Column Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getColumnType()
         * @generated
         */
        EClass COLUMN_TYPE = eINSTANCE.getColumnType();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__COMMENT = eINSTANCE.getColumnType_Comment();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__KEY = eINSTANCE.getColumnType_Key();

        /**
         * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__LENGTH = eINSTANCE.getColumnType_Length();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__NAME = eINSTANCE.getColumnType_Name();

        /**
         * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__NULLABLE = eINSTANCE.getColumnType_Nullable();

        /**
         * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__PRECISION = eINSTANCE.getColumnType_Precision();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__TYPE = eINSTANCE.getColumnType_Type();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ConnectionTypeImpl <em>Connection Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.ConnectionTypeImpl
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getConnectionType()
         * @generated
         */
        EClass CONNECTION_TYPE = eINSTANCE.getConnectionType();

        /**
         * The meta object literal for the '<em><b>Element Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTION_TYPE__ELEMENT_PARAMETER = eINSTANCE.getConnectionType_ElementParameter();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__LABEL = eINSTANCE.getConnectionType_Label();

        /**
         * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__LINE_STYLE = eINSTANCE.getConnectionType_LineStyle();

        /**
         * The meta object literal for the '<em><b>Metaname</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__METANAME = eINSTANCE.getConnectionType_Metaname();

        /**
         * The meta object literal for the '<em><b>Offset Label X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__OFFSET_LABEL_X = eINSTANCE.getConnectionType_OffsetLabelX();

        /**
         * The meta object literal for the '<em><b>Offset Label Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__OFFSET_LABEL_Y = eINSTANCE.getConnectionType_OffsetLabelY();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__SOURCE = eINSTANCE.getConnectionType_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__TARGET = eINSTANCE.getConnectionType_Target();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ContextParameterTypeImpl <em>Context Parameter Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.ContextParameterTypeImpl
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getContextParameterType()
         * @generated
         */
        EClass CONTEXT_PARAMETER_TYPE = eINSTANCE.getContextParameterType();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_PARAMETER_TYPE__COMMENT = eINSTANCE.getContextParameterType_Comment();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_PARAMETER_TYPE__NAME = eINSTANCE.getContextParameterType_Name();

        /**
         * The meta object literal for the '<em><b>Prompt</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_PARAMETER_TYPE__PROMPT = eINSTANCE.getContextParameterType_Prompt();

        /**
         * The meta object literal for the '<em><b>Prompt Needed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_PARAMETER_TYPE__PROMPT_NEEDED = eINSTANCE.getContextParameterType_PromptNeeded();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_PARAMETER_TYPE__TYPE = eINSTANCE.getContextParameterType_Type();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_PARAMETER_TYPE__VALUE = eINSTANCE.getContextParameterType_Value();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ContextTypeImpl <em>Context Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.ContextTypeImpl
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getContextType()
         * @generated
         */
        EClass CONTEXT_TYPE = eINSTANCE.getContextType();

        /**
         * The meta object literal for the '<em><b>Context Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_TYPE__CONTEXT_PARAMETER = eINSTANCE.getContextType_ContextParameter();

        /**
         * The meta object literal for the '<em><b>Confirmation Needed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_TYPE__CONFIRMATION_NEEDED = eINSTANCE.getContextType_ConfirmationNeeded();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_TYPE__NAME = eINSTANCE.getContextType_Name();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.DocumentRootImpl
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Connection</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CONNECTION = eINSTANCE.getDocumentRoot_Connection();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CONTEXT = eINSTANCE.getDocumentRoot_Context();

        /**
         * The meta object literal for the '<em><b>Element Parameter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ELEMENT_PARAMETER = eINSTANCE.getDocumentRoot_ElementParameter();

        /**
         * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__NODE = eINSTANCE.getDocumentRoot_Node();

        /**
         * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PROCESS = eINSTANCE.getDocumentRoot_Process();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ElementParameterTypeImpl <em>Element Parameter Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.ElementParameterTypeImpl
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getElementParameterType()
         * @generated
         */
        EClass ELEMENT_PARAMETER_TYPE = eINSTANCE.getElementParameterType();

        /**
         * The meta object literal for the '<em><b>Element Value</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT_PARAMETER_TYPE__ELEMENT_VALUE = eINSTANCE.getElementParameterType_ElementValue();

        /**
         * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_PARAMETER_TYPE__FIELD = eINSTANCE.getElementParameterType_Field();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_PARAMETER_TYPE__NAME = eINSTANCE.getElementParameterType_Name();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_PARAMETER_TYPE__VALUE = eINSTANCE.getElementParameterType_Value();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ElementValueTypeImpl <em>Element Value Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.ElementValueTypeImpl
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getElementValueType()
         * @generated
         */
        EClass ELEMENT_VALUE_TYPE = eINSTANCE.getElementValueType();

        /**
         * The meta object literal for the '<em><b>Element Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_VALUE_TYPE__ELEMENT_REF = eINSTANCE.getElementValueType_ElementRef();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_VALUE_TYPE__VALUE = eINSTANCE.getElementValueType_Value();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.LogsTypeImpl <em>Logs Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.LogsTypeImpl
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getLogsType()
         * @generated
         */
        EClass LOGS_TYPE = eINSTANCE.getLogsType();

        /**
         * The meta object literal for the '<em><b>Log To File</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOGS_TYPE__LOG_TO_FILE = eINSTANCE.getLogsType_LogToFile();

        /**
         * The meta object literal for the '<em><b>Log To Database</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOGS_TYPE__LOG_TO_DATABASE = eINSTANCE.getLogsType_LogToDatabase();

        /**
         * The meta object literal for the '<em><b>Log To Std Out</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOGS_TYPE__LOG_TO_STD_OUT = eINSTANCE.getLogsType_LogToStdOut();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.LogToDatabaseTypeImpl <em>Log To Database Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.LogToDatabaseTypeImpl
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getLogToDatabaseType()
         * @generated
         */
        EClass LOG_TO_DATABASE_TYPE = eINSTANCE.getLogToDatabaseType();

        /**
         * The meta object literal for the '<em><b>Database</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOG_TO_DATABASE_TYPE__DATABASE = eINSTANCE.getLogToDatabaseType_Database();

        /**
         * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOG_TO_DATABASE_TYPE__LEVEL = eINSTANCE.getLogToDatabaseType_Level();

        /**
         * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOG_TO_DATABASE_TYPE__SELECTED = eINSTANCE.getLogToDatabaseType_Selected();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.LogToFileTypeImpl <em>Log To File Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.LogToFileTypeImpl
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getLogToFileType()
         * @generated
         */
        EClass LOG_TO_FILE_TYPE = eINSTANCE.getLogToFileType();

        /**
         * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOG_TO_FILE_TYPE__FILENAME = eINSTANCE.getLogToFileType_Filename();

        /**
         * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOG_TO_FILE_TYPE__LEVEL = eINSTANCE.getLogToFileType_Level();

        /**
         * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOG_TO_FILE_TYPE__SELECTED = eINSTANCE.getLogToFileType_Selected();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.LogToStdOutTypeImpl <em>Log To Std Out Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.LogToStdOutTypeImpl
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getLogToStdOutType()
         * @generated
         */
        EClass LOG_TO_STD_OUT_TYPE = eINSTANCE.getLogToStdOutType();

        /**
         * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOG_TO_STD_OUT_TYPE__LEVEL = eINSTANCE.getLogToStdOutType_Level();

        /**
         * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOG_TO_STD_OUT_TYPE__SELECTED = eINSTANCE.getLogToStdOutType_Selected();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.MetadataTypeImpl
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getMetadataType()
         * @generated
         */
        EClass METADATA_TYPE = eINSTANCE.getMetadataType();

        /**
         * The meta object literal for the '<em><b>Column</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference METADATA_TYPE__COLUMN = eINSTANCE.getMetadataType_Column();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TYPE__COMMENT = eINSTANCE.getMetadataType_Comment();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TYPE__NAME = eINSTANCE.getMetadataType_Name();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TYPE__SOURCE = eINSTANCE.getMetadataType_Source();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl <em>Node Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getNodeType()
         * @generated
         */
        EClass NODE_TYPE = eINSTANCE.getNodeType();

        /**
         * The meta object literal for the '<em><b>Element Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_TYPE__ELEMENT_PARAMETER = eINSTANCE.getNodeType_ElementParameter();

        /**
         * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_TYPE__METADATA = eINSTANCE.getNodeType_Metadata();

        /**
         * The meta object literal for the '<em><b>Binary Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__BINARY_DATA = eINSTANCE.getNodeType_BinaryData();

        /**
         * The meta object literal for the '<em><b>String Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__STRING_DATA = eINSTANCE.getNodeType_StringData();

        /**
         * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__COMPONENT_NAME = eINSTANCE.getNodeType_ComponentName();

        /**
         * The meta object literal for the '<em><b>Component Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__COMPONENT_VERSION = eINSTANCE.getNodeType_ComponentVersion();

        /**
         * The meta object literal for the '<em><b>Offset Label X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__OFFSET_LABEL_X = eINSTANCE.getNodeType_OffsetLabelX();

        /**
         * The meta object literal for the '<em><b>Offset Label Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__OFFSET_LABEL_Y = eINSTANCE.getNodeType_OffsetLabelY();

        /**
         * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__POS_X = eINSTANCE.getNodeType_PosX();

        /**
         * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__POS_Y = eINSTANCE.getNodeType_PosY();

        /**
         * The meta object literal for the '{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl <em>Process Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl
         * @see org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFilePackageImpl#getProcessType()
         * @generated
         */
        EClass PROCESS_TYPE = eINSTANCE.getProcessType();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__DESCRIPTION = eINSTANCE.getProcessType_Description();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_TYPE__CONTEXT = eINSTANCE.getProcessType_Context();

        /**
         * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_TYPE__NODE = eINSTANCE.getProcessType_Node();

        /**
         * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_TYPE__CONNECTION = eINSTANCE.getProcessType_Connection();

        /**
         * The meta object literal for the '<em><b>Logs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_TYPE__LOGS = eINSTANCE.getProcessType_Logs();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__AUTHOR = eINSTANCE.getProcessType_Author();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__COMMENT = eINSTANCE.getProcessType_Comment();

        /**
         * The meta object literal for the '<em><b>Default Context</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__DEFAULT_CONTEXT = eINSTANCE.getProcessType_DefaultContext();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__NAME = eINSTANCE.getProcessType_Name();

        /**
         * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__PURPOSE = eINSTANCE.getProcessType_Purpose();

        /**
         * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__STATUS = eINSTANCE.getProcessType_Status();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__VERSION = eINSTANCE.getProcessType_Version();

    }

} //TalendFilePackage
