/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.torredelrey.generador;

import ies.torredelrey.modelo.CantidadProducto;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author usuario
 */
public class Generador {
    //////////////////////////////  PLANTILLA   //////////////////////////////
    /*public static void leerInforme(List<> lista, String rutaInforme, String nombreInformeSalida){
<<<<<<< HEAD
        try {
            JasperPrint print;
            HashMap param = new HashMap();
            param.put("fecha", LocalDate.now().toString());

            JRDataSource datasource = new JRBeanArrayDataSource(lista.toArray());
            print = JasperFillManager.fillReport(rutaInforme, param,datasource);
            JasperExportManager.exportReportToPdfFile(print,nombreInformeSalida);
            JasperViewer.viewReport(print);
        } catch (JRException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
   /***********GENERAR METODOS PARA LEER INFORMES SEGUN SE NECESITE***********/
    
    public static void leerInformeVentasTotales(List<CantidadProducto> lista, String rutaInforme, String nombreInformeSalida){
=======
>>>>>>> 15bad44f0fc7ad6cb7595a6c279d657e91947ab0
        try {
            JasperPrint print;
            HashMap param = new HashMap();
            param.put("fecha", LocalDate.now().toString());

            JRDataSource datasource = new JRBeanArrayDataSource(lista.toArray());
            print = JasperFillManager.fillReport(rutaInforme, param,datasource);
            JasperExportManager.exportReportToPdfFile(print,nombreInformeSalida);
            JasperViewer.viewReport(print);
        } catch (JRException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        }
<<<<<<< HEAD
    }
    
}
=======
    }*/
    
   /***********GENERAR METODOS PARA LEER INFORMES SEGUN SE NECESITE***********/
    
}
>>>>>>> 15bad44f0fc7ad6cb7595a6c279d657e91947ab0
