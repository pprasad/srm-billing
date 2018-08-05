/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.stadalone.model;

import com.srm.services.modal.Country;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 *
 * @author umprasad
 */
public class CountryCellRender extends DefaultTreeCellRenderer{

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus); 
        DefaultMutableTreeNode node=(DefaultMutableTreeNode)value;
        Object countryObject=node.getUserObject();
        if(countryObject instanceof Country){
            Country country=(Country)countryObject;
            this.setText(country.getCountryName());
        }
        return this;
    }
      
}
