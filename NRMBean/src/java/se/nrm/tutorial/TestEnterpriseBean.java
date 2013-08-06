/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.tutorial;

import javax.ejb.Stateless;
import se.nrm.tutorial.bean.service.AsyncRemote;
/**
 *
 * @author ingimar
 */
@Stateless
public class TestEnterpriseBean implements AsyncRemote {

    @Override
    public String businessMethod() {
        return "Bönan på Naturhistoriska säger HEJ!";
    }
}
