/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.gpscontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import test.ejb.LocoinfFacade;
import test.model.Locoinf;

/**
 *
 * @author Muzaffar
 */
public class Test extends HttpServlet {

    @EJB
    private LocoinfFacade locoinfFacade;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int loko = 0;
        Long lat = null;
        Long lon = null;
        Timestamp time = null;

        try {
            loko = Integer.parseInt(request.getParameter("loko"));
            lat = Long.parseLong(request.getParameter("lat"));
            lon = Long.parseLong(request.getParameter("lon"));
            time = Timestamp.valueOf(request.getParameter("time"));

        } catch (Exception e) {
            System.out.println("owibka! : " + e);
        }
        Locoinf locomodel = new Locoinf();
        locomodel.setLat(lat);
        locomodel.setLon(lon);
        locomodel.setNumloco(loko);
        locomodel.setTime(time);
        locoinfFacade.create(locomodel);
        System.out.println("№loko : " + loko
                + "\nlat : " + lat
                + "\nlon : " + lon
                + "\ntime : " + time);

    }

}
