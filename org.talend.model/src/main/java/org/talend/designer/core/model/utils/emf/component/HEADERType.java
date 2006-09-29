/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.component;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HEADER Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getSIGNATURE <em>SIGNATURE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getAUTHOR <em>AUTHOR</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isCOLUMNCHECK <em>COLUMNCHECK</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getCOMPATIBILITY <em>COMPATIBILITY</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isDATAAUTOPROPAGATE <em>DATAAUTOPROPAGATE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getEXTENSION <em>EXTENSION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getICON <em>ICON</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getPLATEFORM <em>PLATEFORM</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getRELEASEDATE <em>RELEASEDATE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isSCHEMAAUTOPROPAGATE <em>SCHEMAAUTOPROPAGATE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getSERIAL <em>SERIAL</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isSTARTABLE <em>STARTABLE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getSTATUS <em>STATUS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getVERSION <em>VERSION</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getHEADERType()
 * @model extendedMetaData="name='HEADER_._type' kind='elementOnly'"
 * @generated
 */
public interface HEADERType extends EObject {
    /**
     * Returns the value of the '<em><b>SIGNATURE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SIGNATURE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SIGNATURE</em>' attribute.
     * @see #setSIGNATURE(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getHEADERType_SIGNATURE()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='SIGNATURE' namespace='##targetNamespace'"
     * @generated
     */
    String getSIGNATURE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getSIGNATURE <em>SIGNATURE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SIGNATURE</em>' attribute.
     * @see #getSIGNATURE()
     * @generated
     */
    void setSIGNATURE(String value);

    /**
     * Returns the value of the '<em><b>AUTHOR</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>AUTHOR</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>AUTHOR</em>' attribute.
     * @see #setAUTHOR(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getHEADERType_AUTHOR()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='AUTHOR' namespace='##targetNamespace'"
     * @generated
     */
    String getAUTHOR();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getAUTHOR <em>AUTHOR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>AUTHOR</em>' attribute.
     * @see #getAUTHOR()
     * @generated
     */
    void setAUTHOR(String value);

    /**
     * Returns the value of the '<em><b>COLUMNCHECK</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>COLUMNCHECK</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>COLUMNCHECK</em>' attribute.
     * @see #isSetCOLUMNCHECK()
     * @see #unsetCOLUMNCHECK()
     * @see #setCOLUMNCHECK(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getHEADERType_COLUMNCHECK()
     * @model default="true" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='COLUMN_CHECK' namespace='##targetNamespace'"
     * @generated
     */
    boolean isCOLUMNCHECK();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isCOLUMNCHECK <em>COLUMNCHECK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>COLUMNCHECK</em>' attribute.
     * @see #isSetCOLUMNCHECK()
     * @see #unsetCOLUMNCHECK()
     * @see #isCOLUMNCHECK()
     * @generated
     */
    void setCOLUMNCHECK(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isCOLUMNCHECK <em>COLUMNCHECK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCOLUMNCHECK()
     * @see #isCOLUMNCHECK()
     * @see #setCOLUMNCHECK(boolean)
     * @generated
     */
    void unsetCOLUMNCHECK();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isCOLUMNCHECK <em>COLUMNCHECK</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>COLUMNCHECK</em>' attribute is set.
     * @see #unsetCOLUMNCHECK()
     * @see #isCOLUMNCHECK()
     * @see #setCOLUMNCHECK(boolean)
     * @generated
     */
    boolean isSetCOLUMNCHECK();

    /**
     * Returns the value of the '<em><b>COMPATIBILITY</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>COMPATIBILITY</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>COMPATIBILITY</em>' attribute.
     * @see #setCOMPATIBILITY(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getHEADERType_COMPATIBILITY()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='COMPATIBILITY' namespace='##targetNamespace'"
     * @generated
     */
    String getCOMPATIBILITY();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getCOMPATIBILITY <em>COMPATIBILITY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>COMPATIBILITY</em>' attribute.
     * @see #getCOMPATIBILITY()
     * @generated
     */
    void setCOMPATIBILITY(String value);

    /**
     * Returns the value of the '<em><b>DATAAUTOPROPAGATE</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATAAUTOPROPAGATE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATAAUTOPROPAGATE</em>' attribute.
     * @see #isSetDATAAUTOPROPAGATE()
     * @see #unsetDATAAUTOPROPAGATE()
     * @see #setDATAAUTOPROPAGATE(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getHEADERType_DATAAUTOPROPAGATE()
     * @model default="true" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='DATA_AUTO_PROPAGATE' namespace='##targetNamespace'"
     * @generated
     */
    boolean isDATAAUTOPROPAGATE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isDATAAUTOPROPAGATE <em>DATAAUTOPROPAGATE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DATAAUTOPROPAGATE</em>' attribute.
     * @see #isSetDATAAUTOPROPAGATE()
     * @see #unsetDATAAUTOPROPAGATE()
     * @see #isDATAAUTOPROPAGATE()
     * @generated
     */
    void setDATAAUTOPROPAGATE(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isDATAAUTOPROPAGATE <em>DATAAUTOPROPAGATE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDATAAUTOPROPAGATE()
     * @see #isDATAAUTOPROPAGATE()
     * @see #setDATAAUTOPROPAGATE(boolean)
     * @generated
     */
    void unsetDATAAUTOPROPAGATE();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isDATAAUTOPROPAGATE <em>DATAAUTOPROPAGATE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DATAAUTOPROPAGATE</em>' attribute is set.
     * @see #unsetDATAAUTOPROPAGATE()
     * @see #isDATAAUTOPROPAGATE()
     * @see #setDATAAUTOPROPAGATE(boolean)
     * @generated
     */
    boolean isSetDATAAUTOPROPAGATE();

    /**
     * Returns the value of the '<em><b>EXTENSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EXTENSION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EXTENSION</em>' attribute.
     * @see #setEXTENSION(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getHEADERType_EXTENSION()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='EXTENSION' namespace='##targetNamespace'"
     * @generated
     */
    String getEXTENSION();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getEXTENSION <em>EXTENSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EXTENSION</em>' attribute.
     * @see #getEXTENSION()
     * @generated
     */
    void setEXTENSION(String value);

    /**
     * Returns the value of the '<em><b>ICON</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ICON</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ICON</em>' attribute.
     * @see #setICON(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getHEADERType_ICON()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='ICON' namespace='##targetNamespace'"
     * @generated
     */
    String getICON();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getICON <em>ICON</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ICON</em>' attribute.
     * @see #getICON()
     * @generated
     */
    void setICON(String value);

    /**
     * Returns the value of the '<em><b>PLATEFORM</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PLATEFORM</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PLATEFORM</em>' attribute.
     * @see #setPLATEFORM(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getHEADERType_PLATEFORM()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='PLATEFORM' namespace='##targetNamespace'"
     * @generated
     */
    String getPLATEFORM();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getPLATEFORM <em>PLATEFORM</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PLATEFORM</em>' attribute.
     * @see #getPLATEFORM()
     * @generated
     */
    void setPLATEFORM(String value);

    /**
     * Returns the value of the '<em><b>RELEASEDATE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RELEASEDATE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RELEASEDATE</em>' attribute.
     * @see #setRELEASEDATE(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getHEADERType_RELEASEDATE()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='RELEASE_DATE' namespace='##targetNamespace'"
     * @generated
     */
    String getRELEASEDATE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getRELEASEDATE <em>RELEASEDATE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RELEASEDATE</em>' attribute.
     * @see #getRELEASEDATE()
     * @generated
     */
    void setRELEASEDATE(String value);

    /**
     * Returns the value of the '<em><b>SCHEMAAUTOPROPAGATE</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCHEMAAUTOPROPAGATE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SCHEMAAUTOPROPAGATE</em>' attribute.
     * @see #isSetSCHEMAAUTOPROPAGATE()
     * @see #unsetSCHEMAAUTOPROPAGATE()
     * @see #setSCHEMAAUTOPROPAGATE(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getHEADERType_SCHEMAAUTOPROPAGATE()
     * @model default="true" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='SCHEMA_AUTO_PROPAGATE' namespace='##targetNamespace'"
     * @generated
     */
    boolean isSCHEMAAUTOPROPAGATE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isSCHEMAAUTOPROPAGATE <em>SCHEMAAUTOPROPAGATE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCHEMAAUTOPROPAGATE</em>' attribute.
     * @see #isSetSCHEMAAUTOPROPAGATE()
     * @see #unsetSCHEMAAUTOPROPAGATE()
     * @see #isSCHEMAAUTOPROPAGATE()
     * @generated
     */
    void setSCHEMAAUTOPROPAGATE(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isSCHEMAAUTOPROPAGATE <em>SCHEMAAUTOPROPAGATE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSCHEMAAUTOPROPAGATE()
     * @see #isSCHEMAAUTOPROPAGATE()
     * @see #setSCHEMAAUTOPROPAGATE(boolean)
     * @generated
     */
    void unsetSCHEMAAUTOPROPAGATE();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isSCHEMAAUTOPROPAGATE <em>SCHEMAAUTOPROPAGATE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SCHEMAAUTOPROPAGATE</em>' attribute is set.
     * @see #unsetSCHEMAAUTOPROPAGATE()
     * @see #isSCHEMAAUTOPROPAGATE()
     * @see #setSCHEMAAUTOPROPAGATE(boolean)
     * @generated
     */
    boolean isSetSCHEMAAUTOPROPAGATE();

    /**
     * Returns the value of the '<em><b>SERIAL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SERIAL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SERIAL</em>' attribute.
     * @see #setSERIAL(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getHEADERType_SERIAL()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='SERIAL' namespace='##targetNamespace'"
     * @generated
     */
    String getSERIAL();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getSERIAL <em>SERIAL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SERIAL</em>' attribute.
     * @see #getSERIAL()
     * @generated
     */
    void setSERIAL(String value);

    /**
     * Returns the value of the '<em><b>STARTABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>STARTABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>STARTABLE</em>' attribute.
     * @see #isSetSTARTABLE()
     * @see #unsetSTARTABLE()
     * @see #setSTARTABLE(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getHEADERType_STARTABLE()
     * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
     *        extendedMetaData="kind='attribute' name='STARTABLE' namespace='##targetNamespace'"
     * @generated
     */
    boolean isSTARTABLE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isSTARTABLE <em>STARTABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>STARTABLE</em>' attribute.
     * @see #isSetSTARTABLE()
     * @see #unsetSTARTABLE()
     * @see #isSTARTABLE()
     * @generated
     */
    void setSTARTABLE(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isSTARTABLE <em>STARTABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSTARTABLE()
     * @see #isSTARTABLE()
     * @see #setSTARTABLE(boolean)
     * @generated
     */
    void unsetSTARTABLE();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#isSTARTABLE <em>STARTABLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>STARTABLE</em>' attribute is set.
     * @see #unsetSTARTABLE()
     * @see #isSTARTABLE()
     * @see #setSTARTABLE(boolean)
     * @generated
     */
    boolean isSetSTARTABLE();

    /**
     * Returns the value of the '<em><b>STATUS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>STATUS</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>STATUS</em>' attribute.
     * @see #setSTATUS(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getHEADERType_STATUS()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='STATUS' namespace='##targetNamespace'"
     * @generated
     */
    String getSTATUS();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getSTATUS <em>STATUS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>STATUS</em>' attribute.
     * @see #getSTATUS()
     * @generated
     */
    void setSTATUS(String value);

    /**
     * Returns the value of the '<em><b>VERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VERSION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VERSION</em>' attribute.
     * @see #setVERSION(BigDecimal)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getHEADERType_VERSION()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
     *        extendedMetaData="kind='attribute' name='VERSION' namespace='##targetNamespace'"
     * @generated
     */
    BigDecimal getVERSION();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.HEADERType#getVERSION <em>VERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VERSION</em>' attribute.
     * @see #getVERSION()
     * @generated
     */
    void setVERSION(BigDecimal value);

} // HEADERType