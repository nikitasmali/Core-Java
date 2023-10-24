package com.demo.Classassignments;

class Hosteler extends Student 
{
    private String hostelName;
    private int roomNo;

    public Hosteler(int studId, String name, int deptId, String gender, String phoneNo,
                    String hostelName, int roomNo) {
        super(studId, name, deptId, gender, phoneNo);
        this.hostelName = hostelName;
        this.roomNo = roomNo;
    }

    
    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }
}
