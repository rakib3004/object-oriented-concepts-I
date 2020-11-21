package src.LibraryManagement;

import javax.swing.*;

public class MemberDatabase {

    GeneralMember generalMembers_array[] = new GeneralMember[12];
    RegisterMember registerMember_array[] = new RegisterMember[20];
    ExecutiveMember executiveMember_array[] = new ExecutiveMember[5];

    public void memberShip() {
        generalMembers_array[0] = new GeneralMember("Mushfiqur E Zidan", "General", "28 Sept 2018");
        generalMembers_array[1] = new GeneralMember("Sartaz Ainan", "General", "05 March 2016");
        generalMembers_array[2] = new GeneralMember("Aditya Azim", "General", "22 Jun 2019");
        generalMembers_array[3] = new GeneralMember("Md. Rakib Trofder", "General", "15 Feb 2013");
        generalMembers_array[4] = new GeneralMember("Aditya Mahmud", "General", "16 July 2017");
        generalMembers_array[5] = new GeneralMember("Saiful Islam", "General", "03 Dec 2018");
        generalMembers_array[6] = new GeneralMember("Khairul Alam", "General", "26 Dec 2015");
        generalMembers_array[7] = new GeneralMember("Tahmeed Mahbub", "General", "17 March 2016");
        generalMembers_array[8] = new GeneralMember("Asif Iqbal", "General", "16 July 2017");
        generalMembers_array[9] = new GeneralMember("Md. Shifat", "General", "05 March 2014");
        generalMembers_array[10] = new GeneralMember("Md. Shipon", "General", "05 March 2014");
        generalMembers_array[11] = new GeneralMember("Bedyut Rudra", "General", "22 April 2018");


        registerMember_array[0] = new RegisterMember("Mohsin Ibne Amin", "Register", "L101");
        registerMember_array[1] = new RegisterMember("Fahim Morshed", "Register", "L102");
        registerMember_array[2] = new RegisterMember("Mahtab Hosssen", "Register", "L103");
        registerMember_array[3] = new RegisterMember("Md. Siam", "Register", "L104");
        registerMember_array[4] = new RegisterMember("Fahad Hossain", "Register", "L105");
        registerMember_array[5] = new RegisterMember("Shirsho Iqbal", "Register", "L106");
        registerMember_array[6] = new RegisterMember("Najmus Sakib", "Register", "L107");
        registerMember_array[7] = new RegisterMember("Sameha Tahsin", "Register", "L108");
        registerMember_array[8] = new RegisterMember("Jafar Mahin", "Register", "L109");
        registerMember_array[9] = new RegisterMember("Mushfiqur Rahman", "Register", "L110");
        registerMember_array[10] = new RegisterMember("Kazi Muktadir", "Register", "L111");
        registerMember_array[11] = new RegisterMember("Arif Hasan", "Register", "L112");
        registerMember_array[12] = new RegisterMember("Inzamamul Haque", "Register", "L113");
        registerMember_array[13] = new RegisterMember("Mustahid Sakib", "Register", "L114");
        registerMember_array[14] = new RegisterMember("Jitesh Sureka", "Register", "L115");
        registerMember_array[15] = new RegisterMember("Muktar Hossen", "Register", "L116");
        registerMember_array[16] = new RegisterMember("Raisul Islam Rahat", "Register", "L117");
        registerMember_array[17] = new RegisterMember("Khairul ALam", "Register", "L118");
        registerMember_array[18] = new RegisterMember("Jubaer Hossen", "Register", "L119");
        registerMember_array[19] = new RegisterMember("Lutfar Alif", "Register", "L120");

        executiveMember_array[0] = new ExecutiveMember("Md. Rakib Trofder", "Executive", "L051", "Pesident");
        executiveMember_array[1] = new ExecutiveMember("Abdullah Al Momen", "Executive", "L052", "General Secretary");
        executiveMember_array[2] = new ExecutiveMember("Tourit Jahan Shihab", "Executive", "L053", "Vice President");
        executiveMember_array[3] = new ExecutiveMember("Anam Talukdar", "Executive", "L054", "Organization Secretary");
        executiveMember_array[4] = new ExecutiveMember("Samiul Islam", "Executive", "L055", "Finance Secretary");
    }

    public void showRegisterMember() {
        show_RegMember(registerMember_array);
    }

    public void show_RegMember(RegisterMember[] registerMembers_array) {
        /* String registerMembers_info = "Register Member are  :\n";*/
        int count = 1;
        for (RegisterMember registerMembers_data : registerMembers_array) {
            JOptionPane.showMessageDialog(null, "Member No :" + count + ". " + registerMembers_data.getAccountNumber());
            count++;
        }


    }

}
