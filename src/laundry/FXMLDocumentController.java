/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author firdahilya
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField nama;
    @FXML
    private TextField alamat;
    @FXML
    private TextField brt;
    @FXML
    private TextField notel;
    @FXML
    private TextField tp;
    @FXML
    private Button proses;
    @FXML
    private Button hps;
    @FXML
    private TextArea hasil;
    @FXML
    private RadioButton ck;
    @FXML
    private ToggleGroup pilihanpaket;
    @FXML
    private RadioButton cks;
    @FXML
    private RadioButton s;

    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Proses(ActionEvent event) {
            String paket;
        int harga=0;
        
        
        
        if(ck.isSelected())
        paket = "Cuci Kering";
        else if(cks.isSelected())
        paket ="Cuci Kering setrika";
        else if(s.isSelected())
            paket ="Setrika";
        else 
            paket = " ";
        
        if(!(ck.isSelected() || cks.isSelected() || s.isSelected() )){
            JOptionPane.showMessageDialog(null,"Harap pilih paket");
            
        } else{
            String Nama =nama.getText();
            String Alamat = alamat.getText();
            String Berat = brt.getText();
            String Tanggal = tp.getText();
            
            int hitung =Integer.parseInt(brt.getText());
            
            if(ck.isSelected())
                harga = hitung*5000;
            if(cks.isSelected())
                harga = hitung*8000;
            if(s.isSelected())
                harga = hitung*4000;
            String nohp =notel.getText();
            
             hasil.setText("Nama : "+ Nama +"\n" +"Alamat : "+ Alamat+"\n"+"Berat Cucian :"
                     + " "+ Berat +"\n"+"Tanggal : "+ Tanggal +"\n"+"\n" +"Pilihan Paket Loundry : "
                     + paket +"\n"+"Pembayaran Yang harus dibayar : Rp. "+harga);
        }
    
    }

    @FXML
    private void hapus(ActionEvent event) {
    }
    
}
