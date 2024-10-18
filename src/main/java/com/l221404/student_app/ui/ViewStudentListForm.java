package com.l221404.student_app.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.l221404.student_app.usecase.ViewStudentOutputDTO;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.List;

public class ViewStudentListForm {

    public  void createAndShowGUI(List<ViewStudentOutputDTO> students) {
        JFrame frame = new JFrame("Student Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 500);

        // Create title label
        JLabel titleLabel = new JLabel("DANH SÁCH SINH VIÊN", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // Padding around the title

        // Column headers for the JTable
        String[] columns = {
                "STT", "Họ tên", "Địa chỉ", "Ngày sinh", "Điểm trung bình", "Học lực", "Ngành"
        };

        // Create table model
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);

        // Sample list of students
        //List<Student> students = getStudentList();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Add student data to the table
        for (int i = 0; i < students.size(); i++) {
            ViewStudentOutputDTO student = students.get(i);
            Object[] row = {
                    i + 1,
                    student.getHoTen(),
                    student.getDiaChi(),
                    sdf.format(student.getNgaySinh()),
                    student.getDiemTB(),
                    student.getHocLuc(),
                    student.getNganh()
            };
            tableModel.addRow(row);
        }

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        // Set up layout for the frame
        frame.setLayout(new BorderLayout());
        frame.add(titleLabel, BorderLayout.NORTH); // Add title label at the top
        frame.add(scrollPane, BorderLayout.CENTER); // Add the table in the center

        // Make the frame visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

   


    
}
