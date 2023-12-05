
package io.github.imsauce.Frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class StudentAdd extends javax.swing.JFrame {
    io.github.imsauce.Frame.Main main;

    ImageIcon logo = new ImageIcon("lphslogo.png");
    
    public StudentAdd(io.github.imsauce.Frame.Main mainx) {
        main = mainx;
        System.out.println(main+"sa");
        initComponents();
        setIconImage(logo.getImage());
        setTitle("Add Student");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        mainPanel = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        infoPanel = new javax.swing.JPanel();
        INFOcontainer = new javax.swing.JPanel();
        firstlabel = new javax.swing.JLabel();
        FirstNameTXT = new javax.swing.JTextField();
        INFOcontainer2 = new javax.swing.JPanel();
        middlelabel = new javax.swing.JLabel();
        MiddleNameTXT = new javax.swing.JTextField();
        INFOcontainer3 = new javax.swing.JPanel();
        lastlabel = new javax.swing.JLabel();
        LastNameTXT = new javax.swing.JTextField();
        INFOcontainer4 = new javax.swing.JPanel();
        agelabel = new javax.swing.JLabel();
        AgeTXT = new javax.swing.JTextField();
        INFOcontainer5 = new javax.swing.JPanel();
        sexlabel = new javax.swing.JLabel();
        SexTXT = new javax.swing.JComboBox<>();
        INFOcontainer7 = new javax.swing.JPanel();
        bdaylabel = new javax.swing.JLabel();
        BirthdayTXT = new javax.swing.JTextField();
        INFOcontainer9 = new javax.swing.JPanel();
        contactlabel = new javax.swing.JLabel();
        ContactTXT = new javax.swing.JTextField();
        INFOcontainer10 = new javax.swing.JPanel();
        gradelabel = new javax.swing.JLabel();
        GradeTXT = new javax.swing.JComboBox<>();
        INFOcontainer11 = new javax.swing.JPanel();
        adviserlabel = new javax.swing.JLabel();
        AdviserTXT = new javax.swing.JTextField();
        INFOcontainer12 = new javax.swing.JPanel();
        idlabel = new javax.swing.JLabel();
        IdTXT = new javax.swing.JTextField();
        AddBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        scroll.setBackground(new java.awt.Color(255, 255, 255));
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        infoPanel.setBackground(new java.awt.Color(255, 255, 255));

        INFOcontainer.setBackground(new java.awt.Color(255, 255, 255));

        firstlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        firstlabel.setText("First Name:");

        FirstNameTXT.setBackground(new java.awt.Color(232, 232, 232));
        FirstNameTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout INFOcontainerLayout = new javax.swing.GroupLayout(INFOcontainer);
        INFOcontainer.setLayout(INFOcontainerLayout);
        INFOcontainerLayout.setHorizontalGroup(
            INFOcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INFOcontainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstlabel)
                .addGap(43, 43, 43)
                .addComponent(FirstNameTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );
        INFOcontainerLayout.setVerticalGroup(
            INFOcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INFOcontainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(INFOcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstlabel)
                    .addComponent(FirstNameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        INFOcontainer2.setBackground(new java.awt.Color(255, 255, 255));

        middlelabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        middlelabel.setText("Middle Name:");

        MiddleNameTXT.setBackground(new java.awt.Color(232, 232, 232));
        MiddleNameTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout INFOcontainer2Layout = new javax.swing.GroupLayout(INFOcontainer2);
        INFOcontainer2.setLayout(INFOcontainer2Layout);
        INFOcontainer2Layout.setHorizontalGroup(
            INFOcontainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INFOcontainer2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(middlelabel)
                .addGap(29, 29, 29)
                .addComponent(MiddleNameTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );
        INFOcontainer2Layout.setVerticalGroup(
            INFOcontainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INFOcontainer2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(INFOcontainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(middlelabel)
                    .addComponent(MiddleNameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        INFOcontainer3.setBackground(new java.awt.Color(255, 255, 255));

        lastlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lastlabel.setText("Last Name:");

        LastNameTXT.setBackground(new java.awt.Color(232, 232, 232));
        LastNameTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout INFOcontainer3Layout = new javax.swing.GroupLayout(INFOcontainer3);
        INFOcontainer3.setLayout(INFOcontainer3Layout);
        INFOcontainer3Layout.setHorizontalGroup(
            INFOcontainer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INFOcontainer3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lastlabel)
                .addGap(45, 45, 45)
                .addComponent(LastNameTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );
        INFOcontainer3Layout.setVerticalGroup(
            INFOcontainer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INFOcontainer3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(INFOcontainer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastlabel)
                    .addComponent(LastNameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        INFOcontainer4.setBackground(new java.awt.Color(255, 255, 255));

        agelabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agelabel.setText("Age:");

        AgeTXT.setBackground(new java.awt.Color(232, 232, 232));
        AgeTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout INFOcontainer4Layout = new javax.swing.GroupLayout(INFOcontainer4);
        INFOcontainer4.setLayout(INFOcontainer4Layout);
        INFOcontainer4Layout.setHorizontalGroup(
            INFOcontainer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INFOcontainer4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agelabel)
                .addGap(81, 81, 81)
                .addComponent(AgeTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );
        INFOcontainer4Layout.setVerticalGroup(
            INFOcontainer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INFOcontainer4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(INFOcontainer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agelabel)
                    .addComponent(AgeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        INFOcontainer5.setBackground(new java.awt.Color(255, 255, 255));

        sexlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sexlabel.setText("Sex:");

        SexTXT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout INFOcontainer5Layout = new javax.swing.GroupLayout(INFOcontainer5);
        INFOcontainer5.setLayout(INFOcontainer5Layout);
        INFOcontainer5Layout.setHorizontalGroup(
            INFOcontainer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INFOcontainer5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sexlabel)
                .addGap(82, 82, 82)
                .addComponent(SexTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        INFOcontainer5Layout.setVerticalGroup(
            INFOcontainer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INFOcontainer5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(INFOcontainer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SexTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(sexlabel))
                .addContainerGap())
        );

        INFOcontainer7.setBackground(new java.awt.Color(255, 255, 255));

        bdaylabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bdaylabel.setText("Birthday:");

        BirthdayTXT.setBackground(new java.awt.Color(232, 232, 232));
        BirthdayTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout INFOcontainer7Layout = new javax.swing.GroupLayout(INFOcontainer7);
        INFOcontainer7.setLayout(INFOcontainer7Layout);
        INFOcontainer7Layout.setHorizontalGroup(
            INFOcontainer7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INFOcontainer7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bdaylabel)
                .addGap(54, 54, 54)
                .addComponent(BirthdayTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );
        INFOcontainer7Layout.setVerticalGroup(
            INFOcontainer7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INFOcontainer7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(INFOcontainer7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdaylabel)
                    .addComponent(BirthdayTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        INFOcontainer9.setBackground(new java.awt.Color(255, 255, 255));

        contactlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        contactlabel.setText("Contact:");

        ContactTXT.setBackground(new java.awt.Color(232, 232, 232));
        ContactTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout INFOcontainer9Layout = new javax.swing.GroupLayout(INFOcontainer9);
        INFOcontainer9.setLayout(INFOcontainer9Layout);
        INFOcontainer9Layout.setHorizontalGroup(
            INFOcontainer9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INFOcontainer9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contactlabel)
                .addGap(58, 58, 58)
                .addComponent(ContactTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );
        INFOcontainer9Layout.setVerticalGroup(
            INFOcontainer9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INFOcontainer9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(INFOcontainer9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactlabel)
                    .addComponent(ContactTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        INFOcontainer10.setBackground(new java.awt.Color(255, 255, 255));

        gradelabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gradelabel.setText("Grade & Section:");

        GradeTXT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12-A", "12-B", "12-C", "11-A", "11-B", "11-C", "10-A", "10-B", "10-C", "9-A", "9-B", "9-C", "8-A", "8-B", "8-C", "7-A", "7-B", "7-C", "6-A", "6-B", "6-C", "5-A", "5-B", "5-C", "4-A", "4-B", "4-C", "3-A", "3-B", "3-C", "2-A", "2-B", "2-C", "1-A", "1-B", "1-C" }));

        javax.swing.GroupLayout INFOcontainer10Layout = new javax.swing.GroupLayout(INFOcontainer10);
        INFOcontainer10.setLayout(INFOcontainer10Layout);
        INFOcontainer10Layout.setHorizontalGroup(
            INFOcontainer10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INFOcontainer10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GradeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        INFOcontainer10Layout.setVerticalGroup(
            INFOcontainer10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INFOcontainer10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(INFOcontainer10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GradeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(gradelabel))
                .addContainerGap())
        );

        INFOcontainer11.setBackground(new java.awt.Color(255, 255, 255));

        adviserlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adviserlabel.setText("Adviser:");

        AdviserTXT.setBackground(new java.awt.Color(232, 232, 232));
        AdviserTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout INFOcontainer11Layout = new javax.swing.GroupLayout(INFOcontainer11);
        INFOcontainer11.setLayout(INFOcontainer11Layout);
        INFOcontainer11Layout.setHorizontalGroup(
            INFOcontainer11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INFOcontainer11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adviserlabel)
                .addGap(60, 60, 60)
                .addComponent(AdviserTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );
        INFOcontainer11Layout.setVerticalGroup(
            INFOcontainer11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INFOcontainer11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(INFOcontainer11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adviserlabel)
                    .addComponent(AdviserTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        INFOcontainer12.setBackground(new java.awt.Color(255, 255, 255));

        idlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idlabel.setText("ID:");

        IdTXT.setBackground(new java.awt.Color(232, 232, 232));
        IdTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout INFOcontainer12Layout = new javax.swing.GroupLayout(INFOcontainer12);
        INFOcontainer12.setLayout(INFOcontainer12Layout);
        INFOcontainer12Layout.setHorizontalGroup(
            INFOcontainer12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INFOcontainer12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idlabel)
                .addGap(89, 89, 89)
                .addComponent(IdTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );
        INFOcontainer12Layout.setVerticalGroup(
            INFOcontainer12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INFOcontainer12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(INFOcontainer12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idlabel)
                    .addComponent(IdTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(INFOcontainer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(INFOcontainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(INFOcontainer3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(INFOcontainer4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(INFOcontainer5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(INFOcontainer7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(INFOcontainer9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(INFOcontainer10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(INFOcontainer11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(INFOcontainer12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(INFOcontainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INFOcontainer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INFOcontainer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INFOcontainer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INFOcontainer7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INFOcontainer9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INFOcontainer5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INFOcontainer10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INFOcontainer11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INFOcontainer12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        scroll.setViewportView(infoPanel);

        AddBT.setBackground(new java.awt.Color(195, 235, 255));
        AddBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.jpg"))); // NOI18N
        AddBT.setText("Add");
        AddBT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AddBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddBT)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddBT)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBTActionPerformed
        
        String First = FirstNameTXT.getText();
        String Middle = MiddleNameTXT.getText();
        String Last = LastNameTXT.getText();
        String Adviser = AdviserTXT.getText();
        String Id = IdTXT.getText();
        
        String Sex = (String) SexTXT.getSelectedItem();
        String Grade = (String) GradeTXT.getSelectedItem();
        
        if (
                First != null && !First.isEmpty() &&
                Middle != null && !Middle.isEmpty() &&
                Last != null && !Last.isEmpty() &&
                Adviser != null && !Adviser.isEmpty() &&
                Id != null && !Id.isEmpty() &&
                Sex != null && !Sex.isEmpty() &&
                Grade != null && !Grade.isEmpty())
            
        {
        
        System.out.println(First);
        
        main.student(First, Middle, Last, Id,Grade, Adviser);

        setVisible(false);
            
        }
        

       
    }//GEN-LAST:event_AddBTActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBT;
    private javax.swing.JTextField AdviserTXT;
    private javax.swing.JTextField AgeTXT;
    private javax.swing.JTextField BirthdayTXT;
    private javax.swing.JTextField ContactTXT;
    private javax.swing.JTextField FirstNameTXT;
    private javax.swing.JComboBox<String> GradeTXT;
    private javax.swing.JPanel INFOcontainer;
    private javax.swing.JPanel INFOcontainer10;
    private javax.swing.JPanel INFOcontainer11;
    private javax.swing.JPanel INFOcontainer12;
    private javax.swing.JPanel INFOcontainer2;
    private javax.swing.JPanel INFOcontainer3;
    private javax.swing.JPanel INFOcontainer4;
    private javax.swing.JPanel INFOcontainer5;
    private javax.swing.JPanel INFOcontainer7;
    private javax.swing.JPanel INFOcontainer9;
    private javax.swing.JTextField IdTXT;
    private javax.swing.JTextField LastNameTXT;
    private javax.swing.JTextField MiddleNameTXT;
    private javax.swing.JComboBox<String> SexTXT;
    private javax.swing.JLabel adviserlabel;
    private javax.swing.JLabel agelabel;
    private javax.swing.JLabel bdaylabel;
    private javax.swing.JLabel contactlabel;
    private javax.swing.JLabel firstlabel;
    private javax.swing.JLabel gradelabel;
    private javax.swing.JLabel idlabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lastlabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel middlelabel;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel sexlabel;
    // End of variables declaration//GEN-END:variables

 class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
            //graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
        }
    }
}
