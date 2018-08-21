/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.model;

import com.srm.services.modal.City;
import com.srm.services.modal.Country;
import com.srm.services.modal.State;
import java.awt.Component;
import java.util.Enumeration;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author umprasad
 */
public class CountryCellRender extends DefaultTreeCellRenderer{
    private final static Logger LOGGER=LoggerFactory.getLogger(CountryCellRender.class); 
    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        int index=-1;
        LOGGER.info("*********Executed***************");
        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus); 
        DefaultMutableTreeNode node=(DefaultMutableTreeNode)value;
        Object countryObject=node.getUserObject();
        if(countryObject instanceof Country){
            Country country=(Country)countryObject;
            this.setText(country.getCountryName());
            if(country.getStates()!=null && !country.getStates().isEmpty()){
                 for(State state:country.getStates()){
                      index=childIndex(node,state.getStateName());
                      if(index==-1){
                          DefaultMutableTreeNode stateNode=new DefaultMutableTreeNode(state);
                          node.add(stateNode);
                       }
                 }
            }
        }else if(countryObject instanceof State){
            State state=(State)countryObject;
            this.setText(state.getStateName());
            if(state.getCitys()!=null && !state.getCitys().isEmpty()){
                              for(City city:state.getCitys()){
                                 index=childIndex(node,city.getCityName());
                                 if(index==-1){
                                     node.add(new DefaultMutableTreeNode(city));
                                 }
                              }
                          }
        }else if(countryObject instanceof City){
            City city=(City)countryObject;
            this.setText(city.getCityName());
        }
        return this;
    }
    private int childIndex(final DefaultMutableTreeNode node, final String childValue) {
        Enumeration<DefaultMutableTreeNode> children = node.children();
        DefaultMutableTreeNode child = null;
        int index = -1;
        while (children.hasMoreElements() && index < 0) {
            child = children.nextElement();
            if(child.getUserObject() instanceof Country){
                Country country=(Country)child.getUserObject();
                if (country!=null && childValue.equals(country.getCountryName())) {
                    index = node.getIndex(child);
                }
            }else if(child.getUserObject() instanceof State){
                State state=(State)child.getUserObject();
                if (state!=null && childValue.equals(state.getStateName())) {
                    index = node.getIndex(child);
                } 
            }else{
                City city=(City)child.getUserObject();
                if(city!=null && childValue.equals(city.getCityName())){
                    index=node.getIndex(child);
                }
            }
        }
        return index;
    }
    
}
