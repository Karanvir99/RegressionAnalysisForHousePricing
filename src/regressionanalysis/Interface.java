/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regressionanalysis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.function.LineFunction2D;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.statistics.Regression;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Interface extends javax.swing.JFrame {

    JFreeChart chart;

    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        CalculateRegressionButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        ShowTablesButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ShowLineButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Town A", "Town B", "Town C" }));

        jLabel9.setText("Town :");

        CalculateRegressionButton.setText("Calculate Regression");
        CalculateRegressionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateRegressionButtonActionPerformed(evt);
            }
        });

        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());

        ShowTablesButton.setText("Show Tables");
        ShowTablesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowTablesButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("Regression Analysis Tool");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No. of bathrooms", "Area of the site (1000's square feet)", "Size of the living space (1000's sqaure feet)", "No. of garages", "No. of rooms", "No. of bedrooms", "Age of property (years)" }));

        jLabel1.setText("Select variable :");

        ShowLineButton.setText("Show Regression line");
        ShowLineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowLineButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ShowTablesButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CloseButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShowLineButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CalculateRegressionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CalculateRegressionButton)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowTablesButton)
                    .addComponent(CloseButton)
                    .addComponent(ShowLineButton))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalculateRegressionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateRegressionButtonActionPerformed
        XYDataset dataset = createDataset();

        // Create chart
        chart = ChartFactory.createScatterPlot(
                SetTownTitle(jComboBox1.getSelectedItem().toString()) + " Regression Graph",
                SetXAxis(jComboBox2.getSelectedItem().toString()), "selling Price (£100,000's)", dataset);

        ChartPanel panel = new ChartPanel(chart);
        jPanel1.removeAll();
        jPanel1.add(panel, BorderLayout.CENTER);
        jPanel1.validate();
    }//GEN-LAST:event_CalculateRegressionButtonActionPerformed

    private XYDataset createDataset() {
        String filePath;
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series1 = new XYSeries("Traintown data");
        XYSeries series2 = new XYSeries("Comparison data");

        //Town A data
        // Town A no. of bathrooms data
        filePath = System.getProperty("user.dir") + System.getProperty("file.separator") + "Data.csv";
        File file = new File(filePath);

        if ((jComboBox1.getSelectedItem().toString() == "Town A") && (jComboBox2.getSelectedItem().toString() == "No. of bathrooms")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                // get lines from csv file
                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[2]);
                    series1.add(Column1, Column2);
                }
                //Comparison data
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column10 = Double.parseDouble(dataRow[10]);
                    double Column11 = Double.parseDouble(dataRow[11]);
                    series2.add(Column10, Column11);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town A Area of the site Data
        if ((jComboBox1.getSelectedItem().toString() == "Town A") && (jComboBox2.getSelectedItem().toString() == "Area of the site (1000's square feet)")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[3]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column10 = Double.parseDouble(dataRow[10]);
                    double Column12 = Double.parseDouble(dataRow[12]);
                    series2.add(Column10, Column12);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town A Area of the living space Data
        if ((jComboBox1.getSelectedItem().toString() == "Town A") && (jComboBox2.getSelectedItem().toString() == "Size of the living space (1000's sqaure feet)")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[4]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column10 = Double.parseDouble(dataRow[10]);
                    double Column13 = Double.parseDouble(dataRow[13]);
                    series2.add(Column10, Column13);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town A no. of garages Data
        if ((jComboBox1.getSelectedItem().toString() == "Town A") && (jComboBox2.getSelectedItem().toString() == "No. of garages")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[5]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column10 = Double.parseDouble(dataRow[10]);
                    double Column14 = Double.parseDouble(dataRow[14]);
                    series2.add(Column10, Column14);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town A no. of rooms Data
        if ((jComboBox1.getSelectedItem().toString() == "Town A") && (jComboBox2.getSelectedItem().toString() == "No. of rooms")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[6]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column10 = Double.parseDouble(dataRow[10]);
                    double Column15 = Double.parseDouble(dataRow[15]);
                    series2.add(Column10, Column15);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town A no. of bedrooms Data
        if ((jComboBox1.getSelectedItem().toString() == "Town A") && (jComboBox2.getSelectedItem().toString() == "No. of bedrooms")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[7]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column10 = Double.parseDouble(dataRow[10]);
                    double Column16 = Double.parseDouble(dataRow[16]);
                    series2.add(Column10, Column16);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town A Age of property (years) Data
        if ((jComboBox1.getSelectedItem().toString() == "Town A") && (jComboBox2.getSelectedItem().toString() == "Age of property (years)")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[8]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column10 = Double.parseDouble(dataRow[10]);
                    double Column17 = Double.parseDouble(dataRow[17]);
                    series2.add(Column10, Column17);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //Town B data
        // Town B no. of bathrooms data
        if ((jComboBox1.getSelectedItem().toString() == "Town B") && (jComboBox2.getSelectedItem().toString() == "No. of bathrooms")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[2]);
                    series1.add(Column1, Column2);
                }
                //Comparison data
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column19 = Double.parseDouble(dataRow[19]);
                    double Column20 = Double.parseDouble(dataRow[20]);
                    series2.add(Column19, Column20);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town B Area of the site Data
        if ((jComboBox1.getSelectedItem().toString() == "Town B") && (jComboBox2.getSelectedItem().toString() == "Area of the site (1000's square feet)")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[3]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column19 = Double.parseDouble(dataRow[19]);
                    double Column21 = Double.parseDouble(dataRow[21]);
                    series2.add(Column19, Column21);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town B Area of the living space Data
        if ((jComboBox1.getSelectedItem().toString() == "Town B") && (jComboBox2.getSelectedItem().toString() == "Size of the living space (1000's sqaure feet)")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[4]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column19 = Double.parseDouble(dataRow[19]);
                    double Column22 = Double.parseDouble(dataRow[22]);
                    series2.add(Column19, Column22);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town B no. of garages Data
        if ((jComboBox1.getSelectedItem().toString() == "Town B") && (jComboBox2.getSelectedItem().toString() == "No. of garages")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[5]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column19 = Double.parseDouble(dataRow[19]);
                    double Column23 = Double.parseDouble(dataRow[23]);
                    series2.add(Column19, Column23);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town B no. of rooms Data
        if ((jComboBox1.getSelectedItem().toString() == "Town B") && (jComboBox2.getSelectedItem().toString() == "No. of rooms")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[6]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column19 = Double.parseDouble(dataRow[19]);
                    double Column24 = Double.parseDouble(dataRow[24]);
                    series2.add(Column19, Column24);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town B no. of bedrooms Data
        if ((jComboBox1.getSelectedItem().toString() == "Town B") && (jComboBox2.getSelectedItem().toString() == "No. of bedrooms")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[7]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column19 = Double.parseDouble(dataRow[19]);
                    double Column25 = Double.parseDouble(dataRow[25]);
                    series2.add(Column19, Column25);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town B Age of property (years) Data
        if ((jComboBox1.getSelectedItem().toString() == "Town B") && (jComboBox2.getSelectedItem().toString() == "Age of property (years)")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[8]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column19 = Double.parseDouble(dataRow[19]);
                    double Column26 = Double.parseDouble(dataRow[26]);
                    series2.add(Column19, Column26);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //Town C data
        // Town C no. of bathrooms data
        if ((jComboBox1.getSelectedItem().toString() == "Town C") && (jComboBox2.getSelectedItem().toString() == "No. of bathrooms")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[2]);
                    series1.add(Column1, Column2);
                }
                //Comparison data
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column28 = Double.parseDouble(dataRow[28]);
                    double Column29 = Double.parseDouble(dataRow[29]);
                    series2.add(Column28, Column29);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town C Area of the site Data
        if ((jComboBox1.getSelectedItem().toString() == "Town C") && (jComboBox2.getSelectedItem().toString() == "Area of the site (1000's square feet)")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[3]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column28 = Double.parseDouble(dataRow[28]);
                    double Column30 = Double.parseDouble(dataRow[30]);
                    series2.add(Column28, Column30);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town C Area of the living space Data
        if ((jComboBox1.getSelectedItem().toString() == "Town C") && (jComboBox2.getSelectedItem().toString() == "Size of the living space (1000's sqaure feet)")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[4]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column28 = Double.parseDouble(dataRow[28]);
                    double Column31 = Double.parseDouble(dataRow[31]);
                    series2.add(Column28, Column31);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town C no. of garages Data
        if ((jComboBox1.getSelectedItem().toString() == "Town C") && (jComboBox2.getSelectedItem().toString() == "No. of garages")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[5]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column28 = Double.parseDouble(dataRow[28]);
                    double Column32 = Double.parseDouble(dataRow[32]);
                    series2.add(Column28, Column32);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town C no. of rooms Data
        if ((jComboBox1.getSelectedItem().toString() == "Town C") && (jComboBox2.getSelectedItem().toString() == "No. of rooms")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[6]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column28 = Double.parseDouble(dataRow[28]);
                    double Column33 = Double.parseDouble(dataRow[33]);
                    series2.add(Column28, Column33);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town C no. of bedrooms Data
        if ((jComboBox1.getSelectedItem().toString() == "Town C") && (jComboBox2.getSelectedItem().toString() == "No. of bedrooms")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[7]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column28 = Double.parseDouble(dataRow[28]);
                    double Column34 = Double.parseDouble(dataRow[34]);
                    series2.add(Column28, Column34);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Town C Age of property (years) Data
        if ((jComboBox1.getSelectedItem().toString() == "Town C") && (jComboBox2.getSelectedItem().toString() == "Age of property (years)")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");

                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column1 = Double.parseDouble(dataRow[1]);
                    double Column2 = Double.parseDouble(dataRow[8]);
                    series1.add(Column1, Column2);
                }
                for (int j = 0; j < tableLines.length; j++) {
                    String line = tableLines[j].toString().trim();
                    String[] dataRow = line.split(",");
                    double Column19 = Double.parseDouble(dataRow[28]);
                    double Column26 = Double.parseDouble(dataRow[35]);
                    series2.add(Column19, Column26);
                }
            } catch (Exception ex) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        return dataset;
    }

    public String SetTownTitle(String currentTown) {
        String title = currentTown;
        return title;
    }

    public String SetXAxis(String currentVariable) {
        String title = currentVariable;
        return title;
    }

    private void ShowTablesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowTablesButtonActionPerformed
        Tables form = new Tables();
        form.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ShowTablesButtonActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void ShowLineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowLineButtonActionPerformed
        XYDataset dataset = createDataset();
        XYPlot plot = (XYPlot) chart.getPlot();

        double[] coeffs = Regression.getOLSRegression(dataset, 0);
        LineFunction2D linefunction2d = new LineFunction2D(coeffs[0], coeffs[1]);
        XYDataset series3 = DatasetUtilities.sampleFunction2D(linefunction2d, 4, 17, 5, "Regression Line");

        plot.setDataset(2, series3);

        XYLineAndShapeRenderer lineDrawer = new XYLineAndShapeRenderer(true, false);
        lineDrawer.setSeriesPaint(0, Color.GREEN);
        plot.setRenderer(2, lineDrawer);
    }//GEN-LAST:event_ShowLineButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalculateRegressionButton;
    private javax.swing.JToggleButton CloseButton;
    private javax.swing.JButton ShowLineButton;
    private javax.swing.JButton ShowTablesButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
