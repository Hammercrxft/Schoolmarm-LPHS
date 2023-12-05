
package io.github.imsauce.Frame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import raven.cell.TableActionCellEditor;
import raven.cell.TableActionCellRender;
import raven.cell.TableActionEvent;


public class Main extends javax.swing.JFrame {

    io.github.imsauce.Frame.Main main;
    
     
    public Main() {
        main = this;
        
      
        
        
        initComponents();
        
        
        
        
        
        
        
        
        ImageIcon icon = new ImageIcon ("lphslogo.png");
        setIconImage(icon.getImage());
        setTitle("LPHS REGISTRAR");
        setExtendedState(MAXIMIZED_BOTH);
        
        TableActionEvent event=new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                System.out.println("Edit row" + row);
                StudentEdit student = new StudentEdit(main);
                student.setVisible(true);
                
            }

            @Override
            public void onDelete(int row) {
                
                int option = JOptionPane.showConfirmDialog
                (
                        null,
                        "Are you sure you want to delete this student?",
                        "Confirmation",
                        JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    
                    System.out.println("Delete row" + row);
                if (masterlistTable.isEditing()) {
                    masterlistTable.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) masterlistTable.getModel();
                model.removeRow(row);
                
                int rowCount = model.getRowCount();
                studentnum.setText(Integer.toString(rowCount));
                    
                } 
                
               
            }

            @Override
            public void onView(int row) {
                System.out.println("View row" + row);
                StudentView view = new StudentView(main);
                view.setVisible(true);
//                int Id = 0;
//                int First = 1;
//                int Middle = 2;
//                int Last = 3;
//                int adviser =4;
//                int grade =5;
//                        
//                
//                Object ID = masterlistTable.getValueAt(row, Id);
//                Object FIRST = masterlistTable.getValueAt(row, First);
//                Object MIDDLE = masterlistTable.getValueAt(row, Middle);
//                Object LAST = masterlistTable.getValueAt(row, Last);
//                Object ADVISER = masterlistTable.getValueAt(row, adviser);
//                Object GRADE = masterlistTable.getValueAt(row, grade);
//                
//                String text = FIRST.toString();
//                
          
               
                
                
                
            }
        };
        
         DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                
//                // Check if it's the specific column and row you want to change color
//                if (column == 1 && row == 1) {
//                  //  c.setBackground(new Color(173,236,172)); // Set the background color to green for the specified cell
                
                   c.setBackground(new Color(111,214,109));
                
                
                return c;
            }
        };

        // Set the custom cell renderer for the specific column (Column 2, index 1)
        masterlistTable.getColumnModel().getColumn(7).setCellRenderer(renderer);
        masterlistTable.getColumnModel().getColumn(6).setCellRenderer(new TableActionCellRender());
        masterlistTable.getColumnModel().getColumn(6).setCellEditor(new TableActionCellEditor(event));
        
        masterlistTable.setShowGrid(true);
        GradeTable.setShowGrid(true);
        TeacherTable.setShowGrid(true);
        YearTable.setShowGrid(true);
        
        
        
        
        
    }

   public void openSubFrame() {
    StudentEdit studentEdit = new StudentEdit(this); // Pass a reference to the main frame
    studentEdit.setVisible(true);
}

    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menupanel = new javax.swing.JPanel();
        lphsLogo1 = new io.github.imsauce.resizedIcons.LphsLogo();
        registrar_name = new javax.swing.JLabel();
        line = new javax.swing.JPanel();
        overviewPLBT = new javax.swing.JPanel();
        overviewLBBT = new javax.swing.JLabel();
        archivePLBT = new javax.swing.JPanel();
        archiveLBBT = new javax.swing.JLabel();
        masterlistPLBT = new javax.swing.JPanel();
        masterlistLBBT = new javax.swing.JLabel();
        transferPLBT = new javax.swing.JPanel();
        transferLBBT = new javax.swing.JLabel();
        adminPLBT = new javax.swing.JPanel();
        adminLBBT = new javax.swing.JLabel();
        settingsPLBT = new javax.swing.JPanel();
        settingsLBBT = new javax.swing.JLabel();
        exitPLBT = new javax.swing.JPanel();
        exitLBBT = new javax.swing.JLabel();
        Layers = new javax.swing.JLayeredPane();
        overviewpanel = new javax.swing.JPanel();
        GradeBT = new javax.swing.JButton();
        GradeScroll = new javax.swing.JScrollPane();
        GradeTable = new javax.swing.JTable();
        TeacherScroll = new javax.swing.JScrollPane();
        TeacherTable = new javax.swing.JTable();
        TeacherBT = new javax.swing.JButton();
        YearScroll = new javax.swing.JScrollPane();
        YearPanel = new javax.swing.JPanel();
        YearScrollinside = new javax.swing.JScrollPane();
        YearTable = new javax.swing.JTable();
        YearBT = new javax.swing.JButton();
        masterlistpanel = new javax.swing.JPanel();
        toolsPanel = new javax.swing.JPanel();
        viewlabel = new javax.swing.JLabel();
        sortlabel = new javax.swing.JLabel();
        viewBox = new javax.swing.JComboBox<>();
        sortBox = new javax.swing.JComboBox<>();
        AddStudentBT = new javax.swing.JButton();
        NumOfStudentsPanel = new RoundedPanel(30, new Color(238,238,238));
        studentnum = new javax.swing.JLabel();
        searchTXT = new javax.swing.JTextField();
        searchBT = new javax.swing.JButton();
        StudentRoundPanel = new RoundedPanel(30, new Color(221,238,255));
        studentlabel = new javax.swing.JLabel();
        StudentScroll = new javax.swing.JScrollPane();
        masterlistTable = new javax.swing.JTable();
        archivepanel = new javax.swing.JPanel();
        StudentScroll1 = new javax.swing.JScrollPane();
        StudentTable1 = new javax.swing.JTable();
        toolsPanel1 = new javax.swing.JPanel();
        viewlabel1 = new javax.swing.JLabel();
        viewBox1 = new javax.swing.JComboBox<>();
        NumOfStudentsPanel1 = new RoundedPanel(30, new Color(238,238,238));
        studentnum1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        viewlabel3 = new javax.swing.JLabel();
        viewBox3 = new javax.swing.JComboBox<>();
        StudentRoundPanel1 = new RoundedPanel(30, new Color(221,238,255));
        studentlabel1 = new javax.swing.JLabel();
        transferpanel = new javax.swing.JPanel();
        StudentRoundPanel2 = new RoundedPanel(30, new Color(221,238,255));
        studentlabel2 = new javax.swing.JLabel();
        toolsPanel2 = new javax.swing.JPanel();
        viewlabel2 = new javax.swing.JLabel();
        sortlabel2 = new javax.swing.JLabel();
        viewBox2 = new javax.swing.JComboBox<>();
        sortBox2 = new javax.swing.JComboBox<>();
        NumOfStudentsPanel2 = new RoundedPanel(30, new Color(238,238,238));
        studentnum2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        viewlabel4 = new javax.swing.JLabel();
        viewBox4 = new javax.swing.JComboBox<>();
        StudentScroll2 = new javax.swing.JScrollPane();
        StudentTable2 = new javax.swing.JTable();
        settingspanel = new javax.swing.JPanel();
        bugBT = new javax.swing.JButton();
        updatesBT = new javax.swing.JButton();
        helpBT = new javax.swing.JButton();
        adminpanel = new javax.swing.JPanel();
        BackupBT = new javax.swing.JButton();
        AuditlogBT = new javax.swing.JButton();
        endBT = new javax.swing.JButton();
        memepanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        LOLZ = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        menupanel.setBackground(new java.awt.Color(195, 235, 255));

        javax.swing.GroupLayout lphsLogo1Layout = new javax.swing.GroupLayout(lphsLogo1);
        lphsLogo1.setLayout(lphsLogo1Layout);
        lphsLogo1Layout.setHorizontalGroup(
            lphsLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        lphsLogo1Layout.setVerticalGroup(
            lphsLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        registrar_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registrar_name.setForeground(new java.awt.Color(0, 0, 0));
        registrar_name.setText("REGISTRAR");

        line.setBackground(new java.awt.Color(172, 213, 253));
        line.setPreferredSize(new java.awt.Dimension(114, 5));

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        overviewPLBT.setBackground(new java.awt.Color(195, 235, 255));
        overviewPLBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                overviewPLBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                overviewPLBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                overviewPLBTMouseExited(evt);
            }
        });

        overviewLBBT.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        overviewLBBT.setForeground(new java.awt.Color(0, 0, 0));
        overviewLBBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        overviewLBBT.setText("Overview");

        javax.swing.GroupLayout overviewPLBTLayout = new javax.swing.GroupLayout(overviewPLBT);
        overviewPLBT.setLayout(overviewPLBTLayout);
        overviewPLBTLayout.setHorizontalGroup(
            overviewPLBTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overviewPLBTLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(overviewLBBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        overviewPLBTLayout.setVerticalGroup(
            overviewPLBTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overviewPLBTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(overviewLBBT)
                .addContainerGap())
        );

        archivePLBT.setBackground(new java.awt.Color(195, 235, 255));
        archivePLBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                archivePLBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                archivePLBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                archivePLBTMouseExited(evt);
            }
        });

        archiveLBBT.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        archiveLBBT.setForeground(new java.awt.Color(0, 0, 0));
        archiveLBBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/archive.jpg"))); // NOI18N
        archiveLBBT.setText("Archive");

        javax.swing.GroupLayout archivePLBTLayout = new javax.swing.GroupLayout(archivePLBT);
        archivePLBT.setLayout(archivePLBTLayout);
        archivePLBTLayout.setHorizontalGroup(
            archivePLBTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(archivePLBTLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(archiveLBBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        archivePLBTLayout.setVerticalGroup(
            archivePLBTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, archivePLBTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(archiveLBBT)
                .addContainerGap())
        );

        masterlistPLBT.setBackground(new java.awt.Color(195, 235, 255));
        masterlistPLBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterlistPLBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                masterlistPLBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                masterlistPLBTMouseExited(evt);
            }
        });

        masterlistLBBT.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        masterlistLBBT.setForeground(new java.awt.Color(0, 0, 0));
        masterlistLBBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/list.jpg"))); // NOI18N
        masterlistLBBT.setText("Masterlist");

        javax.swing.GroupLayout masterlistPLBTLayout = new javax.swing.GroupLayout(masterlistPLBT);
        masterlistPLBT.setLayout(masterlistPLBTLayout);
        masterlistPLBTLayout.setHorizontalGroup(
            masterlistPLBTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterlistPLBTLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(masterlistLBBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        masterlistPLBTLayout.setVerticalGroup(
            masterlistPLBTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masterlistPLBTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(masterlistLBBT)
                .addContainerGap())
        );

        transferPLBT.setBackground(new java.awt.Color(195, 235, 255));
        transferPLBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferPLBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transferPLBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transferPLBTMouseExited(evt);
            }
        });

        transferLBBT.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        transferLBBT.setForeground(new java.awt.Color(0, 0, 0));
        transferLBBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transfer.jpg"))); // NOI18N
        transferLBBT.setText("Transferees");

        javax.swing.GroupLayout transferPLBTLayout = new javax.swing.GroupLayout(transferPLBT);
        transferPLBT.setLayout(transferPLBTLayout);
        transferPLBTLayout.setHorizontalGroup(
            transferPLBTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferPLBTLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(transferLBBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transferPLBTLayout.setVerticalGroup(
            transferPLBTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transferPLBTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transferLBBT)
                .addContainerGap())
        );

        adminPLBT.setBackground(new java.awt.Color(195, 235, 255));
        adminPLBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminPLBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminPLBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminPLBTMouseExited(evt);
            }
        });

        adminLBBT.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        adminLBBT.setForeground(new java.awt.Color(0, 0, 0));
        adminLBBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admin.jpg"))); // NOI18N
        adminLBBT.setText("Admin");

        javax.swing.GroupLayout adminPLBTLayout = new javax.swing.GroupLayout(adminPLBT);
        adminPLBT.setLayout(adminPLBTLayout);
        adminPLBTLayout.setHorizontalGroup(
            adminPLBTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPLBTLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(adminLBBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adminPLBTLayout.setVerticalGroup(
            adminPLBTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPLBTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminLBBT)
                .addContainerGap())
        );

        settingsPLBT.setBackground(new java.awt.Color(195, 235, 255));
        settingsPLBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsPLBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsPLBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsPLBTMouseExited(evt);
            }
        });

        settingsLBBT.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        settingsLBBT.setForeground(new java.awt.Color(0, 0, 0));
        settingsLBBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/settings.jpg"))); // NOI18N
        settingsLBBT.setText("Settings");

        javax.swing.GroupLayout settingsPLBTLayout = new javax.swing.GroupLayout(settingsPLBT);
        settingsPLBT.setLayout(settingsPLBTLayout);
        settingsPLBTLayout.setHorizontalGroup(
            settingsPLBTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPLBTLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(settingsLBBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        settingsPLBTLayout.setVerticalGroup(
            settingsPLBTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPLBTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(settingsLBBT)
                .addContainerGap())
        );

        exitPLBT.setBackground(new java.awt.Color(195, 235, 255));
        exitPLBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitPLBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitPLBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitPLBTMouseExited(evt);
            }
        });

        exitLBBT.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        exitLBBT.setForeground(new java.awt.Color(0, 0, 0));
        exitLBBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/leave.jpg"))); // NOI18N
        exitLBBT.setText("Exit");

        javax.swing.GroupLayout exitPLBTLayout = new javax.swing.GroupLayout(exitPLBT);
        exitPLBT.setLayout(exitPLBTLayout);
        exitPLBTLayout.setHorizontalGroup(
            exitPLBTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitPLBTLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(exitLBBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitPLBTLayout.setVerticalGroup(
            exitPLBTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitPLBTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitLBBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(overviewPLBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(archivePLBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(masterlistPLBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transferPLBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(adminPLBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(settingsPLBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(line, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addGroup(menupanelLayout.createSequentialGroup()
                        .addComponent(lphsLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registrar_name)
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(exitPLBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lphsLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(overviewPLBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(masterlistPLBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(archivePLBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transferPLBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsPLBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminPLBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(exitPLBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(menupanel);

        Layers.setBackground(new java.awt.Color(255, 255, 255));
        Layers.setLayout(new java.awt.CardLayout());

        overviewpanel.setBackground(new java.awt.Color(255, 255, 255));

        GradeBT.setText("Grade & Sections");

        GradeScroll.setBackground(new java.awt.Color(237, 237, 237));
        GradeScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        GradeScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        GradeTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GradeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12", "A"},
                {"12", "B"},
                {"12", "C"},
                {"11", "A"},
                {"11", "B"},
                {"11", "C"},
                {"10", "A"},
                {"10", "B"},
                {"10", "C"},
                {"9", "A"},
                {"9", "B"},
                {"9", "C"},
                {"8", "A"},
                {"8", "B"},
                {"8", "C"},
                {"7", "A"},
                {"7", "B"},
                {"7", "C"},
                {"6", "A"},
                {"6", "B"},
                {"6", "C"},
                {"5", "A"},
                {"5", "B"},
                {"5", "C"},
                {"4", "A"},
                {"4", "B"},
                {"4", "C"},
                {"3", "A"},
                {"3", "B"},
                {"3", "C"},
                {"2", "A"},
                {"2", "B"},
                {"2", "C"},
                {"1", "A"},
                {"1", "B"},
                {"1", "C"},
                {"KINDER", null}
            },
            new String [] {
                "Grade", "Section"
            }
        ));
        GradeTable.setRowHeight(30);
        GradeScroll.setViewportView(GradeTable);
        if (GradeTable.getColumnModel().getColumnCount() > 0) {
            GradeTable.getColumnModel().getColumn(1).setHeaderValue("Section");
        }

        TeacherScroll.setBackground(new java.awt.Color(237, 237, 237));
        TeacherScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        TeacherTable.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        TeacherTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Heisenburgir", "Samuel", "Miaw"},
                {"Mamaw", "Tim", "Tatjana"},
                {"Yuul ", "Bae", "Alwright"}
            },
            new String [] {
                "Last Name", "First Name", "Middle Name"
            }
        ));
        TeacherTable.setRowHeight(30);
        TeacherScroll.setViewportView(TeacherTable);
        if (TeacherTable.getColumnModel().getColumnCount() > 0) {
            TeacherTable.getColumnModel().getColumn(0).setHeaderValue("Last Name");
            TeacherTable.getColumnModel().getColumn(1).setHeaderValue("First Name");
            TeacherTable.getColumnModel().getColumn(2).setHeaderValue("Middle Name");
        }

        TeacherBT.setText("Teachers");

        YearScroll.setBackground(new java.awt.Color(237, 237, 237));
        YearScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        YearPanel.setBackground(new java.awt.Color(255, 255, 255));

        YearTable.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        YearTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2022", "2023", null},
                {"2021", "2022", null},
                {"2020", "2021", null}
            },
            new String [] {
                "Start", "End", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        YearTable.setFocusable(false);
        YearTable.setGridColor(new java.awt.Color(0, 0, 0));
        YearTable.setRowHeight(30);
        YearScrollinside.setViewportView(YearTable);
        if (YearTable.getColumnModel().getColumnCount() > 0) {
            YearTable.getColumnModel().getColumn(2).setMinWidth(50);
            YearTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            YearTable.getColumnModel().getColumn(2).setMaxWidth(50);
        }

        javax.swing.GroupLayout YearPanelLayout = new javax.swing.GroupLayout(YearPanel);
        YearPanel.setLayout(YearPanelLayout);
        YearPanelLayout.setHorizontalGroup(
            YearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(YearScrollinside, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
        );
        YearPanelLayout.setVerticalGroup(
            YearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(YearScrollinside, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        YearScroll.setViewportView(YearPanel);

        YearBT.setText("Year");

        javax.swing.GroupLayout overviewpanelLayout = new javax.swing.GroupLayout(overviewpanel);
        overviewpanel.setLayout(overviewpanelLayout);
        overviewpanelLayout.setHorizontalGroup(
            overviewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overviewpanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(overviewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GradeScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(GradeBT, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(overviewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TeacherBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TeacherScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(overviewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(YearScroll)
                    .addComponent(YearBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        overviewpanelLayout.setVerticalGroup(
            overviewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overviewpanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(overviewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(overviewpanelLayout.createSequentialGroup()
                        .addComponent(YearBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(YearScroll))
                    .addGroup(overviewpanelLayout.createSequentialGroup()
                        .addComponent(TeacherBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TeacherScroll))
                    .addGroup(overviewpanelLayout.createSequentialGroup()
                        .addComponent(GradeBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GradeScroll)))
                .addGap(18, 18, 18))
        );

        Layers.add(overviewpanel, "card2");

        masterlistpanel.setBackground(new java.awt.Color(255, 255, 255));

        toolsPanel.setBackground(new java.awt.Color(255, 255, 255));

        viewlabel.setForeground(new java.awt.Color(0, 0, 0));
        viewlabel.setText("view:");

        sortlabel.setForeground(new java.awt.Color(0, 0, 0));
        sortlabel.setText("sort:");

        viewBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12-A", "12-B", "12-C", "11-A", "11-B", "11-C", "10-A", "10-B", "10-C", "9-A", "9-B", "9-C", "8-A", "8-B", "8-C", "7-A", "7-B", "7-C", "6-A", "6-B", "6-C", "5-A", "5-B", "5-C", "4-A", "4-B", "4-C", "3-A", "3-B", "3-C", "2-A", "2-B", "2-C", "1-A", "1-B", "1-C" }));
        viewBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBoxActionPerformed(evt);
            }
        });

        sortBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "regular", "irregular" }));
        sortBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortBoxActionPerformed(evt);
            }
        });

        AddStudentBT.setBackground(new java.awt.Color(255, 255, 255));
        AddStudentBT.setForeground(new java.awt.Color(0, 0, 0));
        AddStudentBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.jpg"))); // NOI18N
        AddStudentBT.setText("add student");
        AddStudentBT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AddStudentBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentBTActionPerformed(evt);
            }
        });

        NumOfStudentsPanel.setBackground(new java.awt.Color(0, 51, 51));
        NumOfStudentsPanel.setOpaque(false);

        studentnum.setBackground(new java.awt.Color(238, 238, 238));
        studentnum.setForeground(new java.awt.Color(0, 0, 0));
        studentnum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentnum.setText("5");
        studentnum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout NumOfStudentsPanelLayout = new javax.swing.GroupLayout(NumOfStudentsPanel);
        NumOfStudentsPanel.setLayout(NumOfStudentsPanelLayout);
        NumOfStudentsPanelLayout.setHorizontalGroup(
            NumOfStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(NumOfStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(studentnum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
        );
        NumOfStudentsPanelLayout.setVerticalGroup(
            NumOfStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
            .addGroup(NumOfStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NumOfStudentsPanelLayout.createSequentialGroup()
                    .addComponent(studentnum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        searchTXT.setForeground(new java.awt.Color(204, 204, 204));
        searchTXT.setText("search...");
        searchTXT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTXTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTXTFocusLost(evt);
            }
        });

        searchBT.setText("search");
        searchBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout toolsPanelLayout = new javax.swing.GroupLayout(toolsPanel);
        toolsPanel.setLayout(toolsPanelLayout);
        toolsPanelLayout.setHorizontalGroup(
            toolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolsPanelLayout.createSequentialGroup()
                .addGroup(toolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(toolsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(toolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolsPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(toolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(viewlabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sortlabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(toolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sortBox, 0, 94, Short.MAX_VALUE)
                                    .addComponent(viewBox, 0, 94, Short.MAX_VALUE)
                                    .addComponent(NumOfStudentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(7, 7, 7))
                            .addComponent(AddStudentBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(searchTXT)
                    .addGroup(toolsPanelLayout.createSequentialGroup()
                        .addComponent(searchBT)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        toolsPanelLayout.setVerticalGroup(
            toolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolsPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(NumOfStudentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(toolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(toolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortlabel))
                .addGap(54, 54, 54)
                .addComponent(searchTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addComponent(AddStudentBT)
                .addGap(16, 16, 16))
        );

        StudentRoundPanel.setBackground(new java.awt.Color(102, 102, 102));
        StudentRoundPanel.setOpaque(false);

        studentlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        studentlabel.setForeground(new java.awt.Color(0, 0, 0));
        studentlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentlabel.setText("Masterlist");
        studentlabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        StudentScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        StudentScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        masterlistTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        masterlistTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Mamaw", "C.", "Tim", "sir mark", "12-A", null, null},
                {"2", "sam", "A.", "Cinco", "sir mark", "12-B", null, null},
                {"3", "kurt", "B.", "Rere", "sir mark", "12-C", null, null},
                {"4", "mochi", "E.", "Bread", "sir mark", "13-A", null, null},
                {"5", "jeb", "R.", "Loaf", "sir mark", "12-A", null, null}
            },
            new String [] {
                "ID", "first name", "middle name", "last name", "Adviser", "Grade & Section", "buttons", " "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        masterlistTable.setRowHeight(40);
        StudentScroll.setViewportView(masterlistTable);
        if (masterlistTable.getColumnModel().getColumnCount() > 0) {
            masterlistTable.getColumnModel().getColumn(0).setMinWidth(50);
            masterlistTable.getColumnModel().getColumn(0).setMaxWidth(50);
            masterlistTable.getColumnModel().getColumn(7).setMinWidth(10);
            masterlistTable.getColumnModel().getColumn(7).setPreferredWidth(10);
            masterlistTable.getColumnModel().getColumn(7).setMaxWidth(10);
        }

        javax.swing.GroupLayout StudentRoundPanelLayout = new javax.swing.GroupLayout(StudentRoundPanel);
        StudentRoundPanel.setLayout(StudentRoundPanelLayout);
        StudentRoundPanelLayout.setHorizontalGroup(
            StudentRoundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentRoundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StudentScroll)
                .addContainerGap())
            .addGroup(StudentRoundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(studentlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
        );
        StudentRoundPanelLayout.setVerticalGroup(
            StudentRoundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentRoundPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(StudentScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(StudentRoundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(StudentRoundPanelLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(studentlabel)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout masterlistpanelLayout = new javax.swing.GroupLayout(masterlistpanel);
        masterlistpanel.setLayout(masterlistpanelLayout);
        masterlistpanelLayout.setHorizontalGroup(
            masterlistpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterlistpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StudentRoundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toolsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        masterlistpanelLayout.setVerticalGroup(
            masterlistpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(masterlistpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StudentRoundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        Layers.add(masterlistpanel, "card3");

        archivepanel.setBackground(new java.awt.Color(255, 255, 255));

        StudentScroll1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        StudentScroll1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        StudentTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StudentTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "wehehe", "D.", "Bread", "12-A", "maam angelly"}
            },
            new String [] {
                "ID", "first name", "middle name", "last name", "Grade & Section", "Adviser"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentScroll1.setViewportView(StudentTable1);

        toolsPanel1.setBackground(new java.awt.Color(255, 255, 255));

        viewlabel1.setForeground(new java.awt.Color(0, 0, 0));
        viewlabel1.setText("view:");

        viewBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "all", "grade 12", "grade 10", "grade 6" }));

        NumOfStudentsPanel1.setBackground(new java.awt.Color(0, 51, 51));
        NumOfStudentsPanel1.setOpaque(false);

        studentnum1.setBackground(new java.awt.Color(238, 238, 238));
        studentnum1.setForeground(new java.awt.Color(0, 0, 0));
        studentnum1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentnum1.setText("1");
        studentnum1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout NumOfStudentsPanel1Layout = new javax.swing.GroupLayout(NumOfStudentsPanel1);
        NumOfStudentsPanel1.setLayout(NumOfStudentsPanel1Layout);
        NumOfStudentsPanel1Layout.setHorizontalGroup(
            NumOfStudentsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(NumOfStudentsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(studentnum1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
        );
        NumOfStudentsPanel1Layout.setVerticalGroup(
            NumOfStudentsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
            .addGroup(NumOfStudentsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NumOfStudentsPanel1Layout.createSequentialGroup()
                    .addComponent(studentnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTextField2.setText("search...");

        jButton2.setText("search");

        viewlabel3.setForeground(new java.awt.Color(0, 0, 0));
        viewlabel3.setText("year:");

        viewBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", " " }));

        javax.swing.GroupLayout toolsPanel1Layout = new javax.swing.GroupLayout(toolsPanel1);
        toolsPanel1.setLayout(toolsPanel1Layout);
        toolsPanel1Layout.setHorizontalGroup(
            toolsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolsPanel1Layout.createSequentialGroup()
                .addGroup(toolsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2)
                    .addGroup(toolsPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolsPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(toolsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolsPanel1Layout.createSequentialGroup()
                                .addComponent(viewlabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(toolsPanel1Layout.createSequentialGroup()
                                .addComponent(viewlabel3)
                                .addGap(1, 1, 1)))
                        .addGroup(toolsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(viewBox3, 0, 94, Short.MAX_VALUE)
                            .addComponent(viewBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 94, Short.MAX_VALUE)
                            .addComponent(NumOfStudentsPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7)))
                .addContainerGap())
        );
        toolsPanel1Layout.setVerticalGroup(
            toolsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolsPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(NumOfStudentsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(toolsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewlabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(toolsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewlabel1))
                .addGap(81, 81, 81)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        StudentRoundPanel1.setBackground(new java.awt.Color(102, 102, 102));
        StudentRoundPanel1.setOpaque(false);

        studentlabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        studentlabel1.setForeground(new java.awt.Color(0, 0, 0));
        studentlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentlabel1.setText("Archive");
        studentlabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout StudentRoundPanel1Layout = new javax.swing.GroupLayout(StudentRoundPanel1);
        StudentRoundPanel1.setLayout(StudentRoundPanel1Layout);
        StudentRoundPanel1Layout.setHorizontalGroup(
            StudentRoundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
            .addGroup(StudentRoundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(studentlabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
        );
        StudentRoundPanel1Layout.setVerticalGroup(
            StudentRoundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(StudentRoundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(StudentRoundPanel1Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(studentlabel1)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout archivepanelLayout = new javax.swing.GroupLayout(archivepanel);
        archivepanel.setLayout(archivepanelLayout);
        archivepanelLayout.setHorizontalGroup(
            archivepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(archivepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(archivepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StudentScroll1)
                    .addComponent(StudentRoundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toolsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        archivepanelLayout.setVerticalGroup(
            archivepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(archivepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StudentRoundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(StudentScroll1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addContainerGap())
        );

        Layers.add(archivepanel, "card3");

        transferpanel.setBackground(new java.awt.Color(255, 255, 255));

        StudentRoundPanel2.setBackground(new java.awt.Color(102, 102, 102));
        StudentRoundPanel2.setOpaque(false);

        studentlabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        studentlabel2.setForeground(new java.awt.Color(0, 0, 0));
        studentlabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentlabel2.setText("Transferees");
        studentlabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout StudentRoundPanel2Layout = new javax.swing.GroupLayout(StudentRoundPanel2);
        StudentRoundPanel2.setLayout(StudentRoundPanel2Layout);
        StudentRoundPanel2Layout.setHorizontalGroup(
            StudentRoundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
            .addGroup(StudentRoundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(studentlabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
        );
        StudentRoundPanel2Layout.setVerticalGroup(
            StudentRoundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(StudentRoundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(StudentRoundPanel2Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(studentlabel2)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );

        toolsPanel2.setBackground(new java.awt.Color(255, 255, 255));

        viewlabel2.setForeground(new java.awt.Color(0, 0, 0));
        viewlabel2.setText("view:");

        sortlabel2.setForeground(new java.awt.Color(0, 0, 0));
        sortlabel2.setText("sort:");

        viewBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "all", "12-C", "12-B", "12-A", "11-C", "11-B", "11-A", "10-C", "10-B", "10-A" }));

        sortBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transfer in", "Transfer out" }));

        NumOfStudentsPanel2.setBackground(new java.awt.Color(0, 51, 51));
        NumOfStudentsPanel2.setOpaque(false);

        studentnum2.setBackground(new java.awt.Color(238, 238, 238));
        studentnum2.setForeground(new java.awt.Color(0, 0, 0));
        studentnum2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentnum2.setText("1");
        studentnum2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout NumOfStudentsPanel2Layout = new javax.swing.GroupLayout(NumOfStudentsPanel2);
        NumOfStudentsPanel2.setLayout(NumOfStudentsPanel2Layout);
        NumOfStudentsPanel2Layout.setHorizontalGroup(
            NumOfStudentsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(NumOfStudentsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(studentnum2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
        );
        NumOfStudentsPanel2Layout.setVerticalGroup(
            NumOfStudentsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
            .addGroup(NumOfStudentsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NumOfStudentsPanel2Layout.createSequentialGroup()
                    .addComponent(studentnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTextField3.setText("search...");

        jButton3.setText("search");

        viewlabel4.setForeground(new java.awt.Color(0, 0, 0));
        viewlabel4.setText("year:");

        viewBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", " " }));

        javax.swing.GroupLayout toolsPanel2Layout = new javax.swing.GroupLayout(toolsPanel2);
        toolsPanel2.setLayout(toolsPanel2Layout);
        toolsPanel2Layout.setHorizontalGroup(
            toolsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolsPanel2Layout.createSequentialGroup()
                .addGroup(toolsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3)
                    .addGroup(toolsPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolsPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(toolsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolsPanel2Layout.createSequentialGroup()
                                .addGroup(toolsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(viewlabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sortlabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(toolsPanel2Layout.createSequentialGroup()
                                .addComponent(viewlabel4)
                                .addGap(1, 1, 1)))
                        .addGroup(toolsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(viewBox4, 0, 94, Short.MAX_VALUE)
                            .addComponent(sortBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, 94, Short.MAX_VALUE)
                            .addComponent(viewBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, 94, Short.MAX_VALUE)
                            .addComponent(NumOfStudentsPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7)))
                .addContainerGap())
        );
        toolsPanel2Layout.setVerticalGroup(
            toolsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolsPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(NumOfStudentsPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(toolsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewlabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(toolsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewlabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(toolsPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortlabel2))
                .addGap(54, 54, 54)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StudentScroll2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        StudentScroll2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        StudentTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StudentTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Hina", "C.", "Unnie", "10-B", "sir vin"}
            },
            new String [] {
                "ID", "first name", "middle name", "last name", "Grade & Section", "Adviser"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentScroll2.setViewportView(StudentTable2);

        javax.swing.GroupLayout transferpanelLayout = new javax.swing.GroupLayout(transferpanel);
        transferpanel.setLayout(transferpanelLayout);
        transferpanelLayout.setHorizontalGroup(
            transferpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transferpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StudentScroll2)
                    .addComponent(StudentRoundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toolsPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        transferpanelLayout.setVerticalGroup(
            transferpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolsPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(transferpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StudentRoundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(StudentScroll2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addContainerGap())
        );

        Layers.add(transferpanel, "card3");

        settingspanel.setBackground(new java.awt.Color(255, 255, 255));

        bugBT.setBackground(new java.awt.Color(255, 255, 255));
        bugBT.setForeground(new java.awt.Color(0, 0, 0));
        bugBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/call.png"))); // NOI18N
        bugBT.setText("<html>BUG REPORTS<br>\nReport any bugs found in the system so that the developers can be notified directly and fix the issue.</html>");
        bugBT.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bugBT.setIconTextGap(20);

        updatesBT.setBackground(new java.awt.Color(255, 255, 255));
        updatesBT.setForeground(new java.awt.Color(0, 0, 0));
        updatesBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/updates.png"))); // NOI18N
        updatesBT.setText("<html>UPDATES<br>\nView latest updates and improvements and bug fixes.</html>");
        updatesBT.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        updatesBT.setIconTextGap(20);

        helpBT.setBackground(new java.awt.Color(255, 255, 255));
        helpBT.setForeground(new java.awt.Color(0, 0, 0));
        helpBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/help.png"))); // NOI18N
        helpBT.setText("<html>HELP<br> Access help and support resources, including a knowledge base, user guides, FAQs, and contact information for technical support.</html>");
        helpBT.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        helpBT.setIconTextGap(16);
        helpBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingspanelLayout = new javax.swing.GroupLayout(settingspanel);
        settingspanel.setLayout(settingspanelLayout);
        settingspanelLayout.setHorizontalGroup(
            settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bugBT)
                    .addComponent(updatesBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                    .addComponent(helpBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE))
                .addContainerGap())
        );
        settingspanelLayout.setVerticalGroup(
            settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingspanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(bugBT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updatesBT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpBT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );

        Layers.add(settingspanel, "card3");

        adminpanel.setBackground(new java.awt.Color(255, 255, 255));

        BackupBT.setBackground(new java.awt.Color(255, 255, 255));
        BackupBT.setForeground(new java.awt.Color(0, 0, 0));
        BackupBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BACKUP.png"))); // NOI18N
        BackupBT.setText("<html>BACKUP<br>\nRestore backup or manaually save a backup.</html>");
        BackupBT.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BackupBT.setIconTextGap(15);

        AuditlogBT.setBackground(new java.awt.Color(255, 255, 255));
        AuditlogBT.setForeground(new java.awt.Color(0, 0, 0));
        AuditlogBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/auditlog.png"))); // NOI18N
        AuditlogBT.setText("<html>AUDIT LOG\n<br>\nAudit log</html>");
        AuditlogBT.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        AuditlogBT.setIconTextGap(20);

        endBT.setBackground(new java.awt.Color(255, 255, 255));
        endBT.setForeground(new java.awt.Color(0, 0, 0));
        endBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/endschoolyear.png"))); // NOI18N
        endBT.setText("<html>END\n SCHOOL YEAR<br>\nEnd the school year and move up all the regular students by 1 grade</html>");
        endBT.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        endBT.setIconTextGap(8);
        endBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminpanelLayout = new javax.swing.GroupLayout(adminpanel);
        adminpanel.setLayout(adminpanelLayout);
        adminpanelLayout.setHorizontalGroup(
            adminpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackupBT)
                    .addComponent(AuditlogBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                    .addComponent(endBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE))
                .addContainerGap())
        );
        adminpanelLayout.setVerticalGroup(
            adminpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminpanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BackupBT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AuditlogBT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endBT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );

        Layers.add(adminpanel, "card3");

        memepanel.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane2.setBorder(null);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gif/touhou-fumo.gif"))); // NOI18N
        jLabel15.setText(" ");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gif/swampware-fumo-touhou.gif"))); // NOI18N
        jLabel16.setText(" ");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gif/wei-wei.gif"))); // NOI18N
        jLabel17.setText(" ");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gif/among-us-amogus.gif"))); // NOI18N
        jLabel18.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout memepanelLayout = new javax.swing.GroupLayout(memepanel);
        memepanel.setLayout(memepanelLayout);
        memepanelLayout.setHorizontalGroup(
            memepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                .addContainerGap())
        );
        memepanelLayout.setVerticalGroup(
            memepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memepanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );

        Layers.add(memepanel, "card3");

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gif/black-eye.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LOLZLayout = new javax.swing.GroupLayout(LOLZ);
        LOLZ.setLayout(LOLZLayout);
        LOLZLayout.setHorizontalGroup(
            LOLZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LOLZLayout.setVerticalGroup(
            LOLZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Layers.add(LOLZ, "card9");

        getContentPane().add(Layers);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    
    Boolean regular = true;
    
    //PANEL COLOR
    
     //[50,123,196]
    void setColor (JPanel panel)
    {
         panel.setBackground(new Color (50,123,196));
    }
    
    //[195,235,255]
    void resetColor (JPanel panel)
    {
        panel.setBackground(new Color (195,235,255));     
    }
    
    //LABEL COLOR
    
    void setColorlabel (JLabel label)
    {
        label.setForeground(new Color (255,255,255));     
    }
    
    void resetColorlabel (JLabel label)
    {
        label.setForeground(new Color (0,0,0));     
    }    
    
    

    public void student(String First, String Middle, String Last, String Id, String Adviser, String Grade)
    {
    
       DefaultTableModel model =(DefaultTableModel) masterlistTable.getModel();
        model.addRow (new Object[]
            {
            Id,
            First,
            Middle,
            Last,
            Grade,
            Adviser
        });
        
        studentnum.setText(Integer.toString(masterlistTable.getRowCount()));
        
        
        System.out.println(First+"2");
        System.out.println("shesh");
        
        //model.fireTableRowsInserted(ERROR, ERROR);
        model.fireTableDataChanged();
        masterlistTable.setModel(model);
        masterlistTable.revalidate();
        masterlistTable.repaint();
        
        System.out.println(model.getRowCount());
            
    
        
    }
    
    private void AddStudentBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentBTActionPerformed
        StudentAdd student = new StudentAdd(main);
        student.setVisible(true);
        
    }//GEN-LAST:event_AddStudentBTActionPerformed

    private void helpBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBTActionPerformed
        Layers.removeAll();
        Layers.add(memepanel);
        Layers.repaint();
        Layers.revalidate();
    }//GEN-LAST:event_helpBTActionPerformed

    private void endBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endBTActionPerformed
        Layers.removeAll();
        Layers.add(LOLZ);
        Layers.repaint();
        Layers.revalidate();
    }//GEN-LAST:event_endBTActionPerformed

    private void searchBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTActionPerformed
   if (searchTXT.getText().equals("search..."))
        {
            searchTXT.setText("");
            searchTXT.setForeground(Color.black);
        }
   
    //make row sorter method
    DefaultTableModel ob = (DefaultTableModel) masterlistTable.getModel();
    TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);

    //case insensetive
    RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + searchTXT.getText());

    //output
    masterlistTable.setRowSorter(obj);
    obj.setRowFilter(rowFilter);

   
    if (searchTXT.getText().equals(""))
        {
            searchTXT.setText("search...");
            searchTXT.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_searchBTActionPerformed

    private void overviewPLBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overviewPLBTMouseClicked
        Layers.removeAll();
        Layers.add(overviewpanel);
        Layers.repaint();
        Layers.revalidate();
    }//GEN-LAST:event_overviewPLBTMouseClicked

    private void masterlistPLBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterlistPLBTMouseClicked
        Layers.removeAll();
        Layers.add(masterlistpanel);
        Layers.repaint();
        Layers.revalidate();
    }//GEN-LAST:event_masterlistPLBTMouseClicked

    private void archivePLBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archivePLBTMouseClicked
        Layers.removeAll();
        Layers.add(archivepanel);
        Layers.repaint();
        Layers.revalidate();
    }//GEN-LAST:event_archivePLBTMouseClicked

    private void transferPLBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferPLBTMouseClicked
        Layers.removeAll();
        Layers.add(transferpanel);
        Layers.repaint();
        Layers.revalidate();
    }//GEN-LAST:event_transferPLBTMouseClicked

    private void settingsPLBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsPLBTMouseClicked
        Layers.removeAll();
        Layers.add(settingspanel);
        Layers.repaint();
        Layers.revalidate();
    }//GEN-LAST:event_settingsPLBTMouseClicked

    private void adminPLBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPLBTMouseClicked
        Layers.removeAll();
        Layers.add(adminpanel);
        Layers.repaint();
        Layers.revalidate();
    }//GEN-LAST:event_adminPLBTMouseClicked

    private void exitPLBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPLBTMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitPLBTMouseClicked

    private void overviewPLBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overviewPLBTMouseEntered
        setColor(overviewPLBT);
        setColorlabel(overviewLBBT);
    }//GEN-LAST:event_overviewPLBTMouseEntered

    private void masterlistPLBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterlistPLBTMouseEntered
        setColor(masterlistPLBT);
        setColorlabel(masterlistLBBT);
    }//GEN-LAST:event_masterlistPLBTMouseEntered

    private void archivePLBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archivePLBTMouseEntered
       setColor(archivePLBT);
        setColorlabel(archiveLBBT);
    }//GEN-LAST:event_archivePLBTMouseEntered

    private void transferPLBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferPLBTMouseEntered
        setColor(transferPLBT);
        setColorlabel(transferLBBT);
    }//GEN-LAST:event_transferPLBTMouseEntered

    private void settingsPLBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsPLBTMouseEntered
        setColor(settingsPLBT);
        setColorlabel(settingsLBBT);
    }//GEN-LAST:event_settingsPLBTMouseEntered

    private void adminPLBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPLBTMouseEntered
        setColor(adminPLBT);
        setColorlabel(adminLBBT);
    }//GEN-LAST:event_adminPLBTMouseEntered

    private void exitPLBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPLBTMouseEntered
        setColor(exitPLBT);
        setColorlabel(exitLBBT);
    }//GEN-LAST:event_exitPLBTMouseEntered

    private void overviewPLBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overviewPLBTMouseExited
        resetColor(overviewPLBT);
        resetColorlabel(overviewLBBT);
    }//GEN-LAST:event_overviewPLBTMouseExited

    private void masterlistPLBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterlistPLBTMouseExited
        resetColor(masterlistPLBT);
        resetColorlabel(masterlistLBBT);
    }//GEN-LAST:event_masterlistPLBTMouseExited

    private void archivePLBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archivePLBTMouseExited
        resetColor(archivePLBT);
        resetColorlabel(archiveLBBT);
    }//GEN-LAST:event_archivePLBTMouseExited

    private void transferPLBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferPLBTMouseExited
        resetColor(transferPLBT);
        resetColorlabel(transferLBBT);
    }//GEN-LAST:event_transferPLBTMouseExited

    private void settingsPLBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsPLBTMouseExited
        resetColor(settingsPLBT);
        resetColorlabel(settingsLBBT);
    }//GEN-LAST:event_settingsPLBTMouseExited

    private void adminPLBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPLBTMouseExited
        resetColor(adminPLBT);
        resetColorlabel(adminLBBT);
    }//GEN-LAST:event_adminPLBTMouseExited

    private void exitPLBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPLBTMouseExited
        resetColor(exitPLBT);
        resetColorlabel(exitLBBT);
    }//GEN-LAST:event_exitPLBTMouseExited

    private void searchTXTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTXTFocusGained
        if (searchTXT.getText().equals("search..."))
        {
            searchTXT.setText("");
            searchTXT.setForeground(Color.black);
        }
    }//GEN-LAST:event_searchTXTFocusGained

    private void searchTXTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTXTFocusLost
        if (searchTXT.getText().equals(""))
        {
            searchTXT.setText("search...");
            searchTXT.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_searchTXTFocusLost

    private void viewBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBoxActionPerformed
    String selectedValue = (String) viewBox.getSelectedItem();
         System.out.println(selectedValue);
     if (selectedValue.equals("all"))
    {
        
        System.out.println(selectedValue);
    selectedValue = "";
    
   
    }
     System.out.println(selectedValue);
         
     //make row sorter method
    DefaultTableModel ob = (DefaultTableModel) masterlistTable.getModel();
    TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);

    //case insensetive
    RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + selectedValue);

        System.out.println(selectedValue);
   
    //output
    masterlistTable.setRowSorter(obj);
    obj.setRowFilter(rowFilter);
         
    }//GEN-LAST:event_viewBoxActionPerformed

    private void sortBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortBoxActionPerformed
        String selectedValue = (String) sortBox.getSelectedItem();
        
        
       
    }//GEN-LAST:event_sortBoxActionPerformed

  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStudentBT;
    private javax.swing.JButton AuditlogBT;
    private javax.swing.JButton BackupBT;
    private javax.swing.JButton GradeBT;
    private javax.swing.JScrollPane GradeScroll;
    private javax.swing.JTable GradeTable;
    private javax.swing.JPanel LOLZ;
    private javax.swing.JLayeredPane Layers;
    private javax.swing.JPanel NumOfStudentsPanel;
    private javax.swing.JPanel NumOfStudentsPanel1;
    private javax.swing.JPanel NumOfStudentsPanel2;
    private javax.swing.JPanel StudentRoundPanel;
    private javax.swing.JPanel StudentRoundPanel1;
    private javax.swing.JPanel StudentRoundPanel2;
    private javax.swing.JScrollPane StudentScroll;
    private javax.swing.JScrollPane StudentScroll1;
    private javax.swing.JScrollPane StudentScroll2;
    private javax.swing.JTable StudentTable1;
    private javax.swing.JTable StudentTable2;
    private javax.swing.JButton TeacherBT;
    private javax.swing.JScrollPane TeacherScroll;
    private javax.swing.JTable TeacherTable;
    private javax.swing.JButton YearBT;
    private javax.swing.JPanel YearPanel;
    private javax.swing.JScrollPane YearScroll;
    private javax.swing.JScrollPane YearScrollinside;
    private javax.swing.JTable YearTable;
    private javax.swing.JLabel adminLBBT;
    private javax.swing.JPanel adminPLBT;
    private javax.swing.JPanel adminpanel;
    private javax.swing.JLabel archiveLBBT;
    private javax.swing.JPanel archivePLBT;
    private javax.swing.JPanel archivepanel;
    private javax.swing.JButton bugBT;
    private javax.swing.JButton endBT;
    private javax.swing.JLabel exitLBBT;
    private javax.swing.JPanel exitPLBT;
    private javax.swing.JButton helpBT;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel line;
    private io.github.imsauce.resizedIcons.LphsLogo lphsLogo1;
    private javax.swing.JLabel masterlistLBBT;
    private javax.swing.JPanel masterlistPLBT;
    private javax.swing.JTable masterlistTable;
    private javax.swing.JPanel masterlistpanel;
    private javax.swing.JPanel memepanel;
    private javax.swing.JPanel menupanel;
    private javax.swing.JLabel overviewLBBT;
    private javax.swing.JPanel overviewPLBT;
    private javax.swing.JPanel overviewpanel;
    private javax.swing.JLabel registrar_name;
    private javax.swing.JButton searchBT;
    private javax.swing.JTextField searchTXT;
    private javax.swing.JLabel settingsLBBT;
    private javax.swing.JPanel settingsPLBT;
    private javax.swing.JPanel settingspanel;
    private javax.swing.JComboBox<String> sortBox;
    private javax.swing.JComboBox<String> sortBox2;
    private javax.swing.JLabel sortlabel;
    private javax.swing.JLabel sortlabel2;
    private javax.swing.JLabel studentlabel;
    private javax.swing.JLabel studentlabel1;
    private javax.swing.JLabel studentlabel2;
    private javax.swing.JLabel studentnum;
    private javax.swing.JLabel studentnum1;
    private javax.swing.JLabel studentnum2;
    private javax.swing.JPanel toolsPanel;
    private javax.swing.JPanel toolsPanel1;
    private javax.swing.JPanel toolsPanel2;
    private javax.swing.JLabel transferLBBT;
    private javax.swing.JPanel transferPLBT;
    private javax.swing.JPanel transferpanel;
    private javax.swing.JButton updatesBT;
    private javax.swing.JComboBox<String> viewBox;
    private javax.swing.JComboBox<String> viewBox1;
    private javax.swing.JComboBox<String> viewBox2;
    private javax.swing.JComboBox<String> viewBox3;
    private javax.swing.JComboBox<String> viewBox4;
    private javax.swing.JLabel viewlabel;
    private javax.swing.JLabel viewlabel1;
    private javax.swing.JLabel viewlabel2;
    private javax.swing.JLabel viewlabel3;
    private javax.swing.JLabel viewlabel4;
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





// CUSTOMIZE CODE = JTABLE ARCHIVED CODE FOR LATER USE

//jTable4 = new javax.swing.JTable() {
//public Component prepareRenderer (TableCellRenderer r, int rw, int col)
//{
//
//Component c=super.prepareRenderer (r, rw, col);
//c.setBackground (Color.WHITE);
//if (col==0) 
//{
//c.setBackground (Color. GREEN);
//}
//
//return c;
//}
//}
