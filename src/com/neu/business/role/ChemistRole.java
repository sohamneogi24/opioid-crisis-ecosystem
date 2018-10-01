/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.role;

import com.neu.business.EcoSystem;
import com.neu.business.enterprise.Enterprise;
import com.neu.business.enterprise.PharmacyEnterprise;
import com.neu.business.network.Network;
import com.neu.business.organization.ChemistOrganization;
import com.neu.business.organization.Organization;
import com.neu.business.useraccount.UserAccount;
import com.neu.userinterface.chemistrole.ChemistWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shrikantmudholkar
 */
public class ChemistRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        return new ChemistWorkAreaJPanel(userProcessContainer, account, enterprise, (ChemistOrganization) organization, network, system.getPatientDirectory().getPrescriptionList());
    }

}
