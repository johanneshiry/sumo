/****************************************************************************/
// Eclipse SUMO, Simulation of Urban MObility; see https://eclipse.org/sumo
// Copyright (C) 2017-2019 German Aerospace Center (DLR) and others.
// TraaS module
// Copyright (C) 2013-2017 Dresden University of Technology
// This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v2.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v20.html
// SPDX-License-Identifier: EPL-2.0
/****************************************************************************/
/// @file    MultientryexitGetLastStepVehicleIDs.java
/// @author  Mario Krumnow
/// @date    2013
/// @version $Id$
///
//
/****************************************************************************/

package de.tudresden.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Multientryexit_getLastStepVehicleIDs complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Multientryexit_getLastStepVehicleIDs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Multientryexit_getLastStepVehicleIDs", propOrder = {
    "detID"
})
public class MultientryexitGetLastStepVehicleIDs {

    protected String detID;

    /**
     * Ruft den Wert der detID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDetID() {
        return detID;
    }

    /**
     * Legt den Wert der detID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDetID(String value) {
        this.detID = value;
    }

}
