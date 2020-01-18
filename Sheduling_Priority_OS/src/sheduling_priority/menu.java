/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheduling_priority;

import javax.swing.JOptionPane;

/**
 *
 * @author Hkobir
 */
public class menu extends javax.swing.JFrame {
    int choice;
   
    public menu() {
        initComponents();
            
    
       //process textfield
        p0input.setVisible(false);
        p1input.setVisible(false);
        p2input.setVisible(false);
        p3input.setVisible(false);
        p4input.setVisible(false);
        //burst time
         B0input.setVisible(false);
        B1input.setVisible(false);
        B2input.setVisible(false);
        B3input.setVisible(false);
        B4input.setVisible(false);
        //priority
         pr0input.setVisible(false);
        pr1input.setVisible(false);
        pr2input.setVisible(false);
        pr3input.setVisible(false);
        pr4input.setVisible(false);
        //ghuntt chart lebel
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        //chuntt line
        guntline1.setVisible(false);
        guntline2.setVisible(false);
        guntline3.setVisible(false);
        guntline4.setVisible(false);
        guntline5.setVisible(false);
        System.out.println("constructor executed");
    }
    
//create function including no. of process
    public void p1(int b0,int pr0){
        //show ghuntt chart label
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        //show guntt line
        guntline1.setVisible(true);
        
        //when only one process
       
     
        
        //algorith activity
    }
    public void p2(int b0,int b1,int pr0,int pr1){
    int pos;
    int temp;
    int btime=0;
        
        
        
          //show ghuntt chart label
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        jLabel10.setVisible(true);
        jLabel11.setVisible(true);
          //show guntt line
        guntline1.setVisible(true);
        guntline2.setVisible(true);
        
            //when two process
                //when five process
           int n=2;   //no. of process
        int i;
        int p[]=new int [n];
        int bt[]={b0,b1};
        int pt[]={pr0,pr1};
        
       
        
        //algorith activity
        for(i=0;i<n;i++){
    p[i]=i;   //fil up process value as 0,1,2

}
  //sorting burst time and process with priority basis
for(i=0;i<n;i++){
    pos=i;

for(int j=i+1;j<n;j++)

{

if(pt[j]<pt[pos])

pos=j;

}

temp=pt[pos];
pt[pos]=pt[i];

pt[i]=temp;
temp=p[pos];

p[pos]=p[i];

p[i]=temp;

temp=bt[pos];
bt[pos]=bt[i];
bt[i]=temp;

}   
//end of sorting   



// now set process into ghuntt chart

 for(i=0;i<n;i++){
     switch(i){
         case 0:
             if(p[i]==0){
             jLabel8.setText("P0");
             }
             else if(p[i]==1){
             jLabel8.setText("P1");
             }
              break;
         case 1:
               if(p[i]==0){
             jLabel10.setText("P0");
             }
             else if(p[i]==1){
             jLabel10.setText("P1");
             }
            
             break;
         
             
             
     }
     
     
     
    
 }       
       
 
 
 
 //set burst time into guntt chart
     for(i=0;i<n;i++){
         switch(i){
             case 0:
                 btime=btime+bt[i];
                 jLabel9.setText(""+btime);
                 break;
             case 1:
                  btime=btime+bt[i];
                 jLabel11.setText(""+btime);
                 break;
             case 2 :
                  btime=btime+bt[i];
                 jLabel13.setText(""+btime);
                 break;
                 case 3 :
                     btime=btime+bt[i];
                 jLabel15.setText(""+btime);
                     break;
                     case 4 :
                         btime=btime+bt[i];
                 jLabel17.setText(""+btime);
                         break;
         }
     }
        
         //waiting time & turnaround time show
     int wt[]=new int[n];
     int tat[]=new int[n];
      wt[0]=0;
     double avg_wt=0.00;
     double avg_tat=0.00;
for(i=1;i<n;i++)

{

wt[i]=0;

for(int j=0;j<i;j++)

wt[i]+=bt[j];
avg_wt=avg_wt+wt[i];
}
     
jTextArea1.setText("Process\t   waiting time\t   TAT\n");

for(i=0;i<n;i++)

{

tat[i]=bt[i]+wt[i];
avg_tat=avg_tat+tat[i];
jTextArea1.setText(jTextArea1.getText()+"\n"+"   "+p[i]+"\t"+"       "+wt[i]+"\t"+"    "+tat[i]);

}



//showing average waiting time and average turnaround time
avg_wt=avg_wt/n;
avg_tat=avg_tat/n;
jTextArea2.setText("\n\n\n\n  =>Average Waiting Time: "+Math.round(avg_wt*100.0)/100.0);
jTextArea2.setText(jTextArea2.getText()+"\n"+"  =>Average Turnaround Time: "+Math.round(avg_tat*100.0)/100.0);
    }
    public void p3(int b0,int b1,int b2,int pr0,int pr1,int pr2){
        int pos;
    int temp;
    int btime=0;
        //show ghuntt chart label
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        jLabel10.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
         //show guntt line
        guntline1.setVisible(true);
        guntline2.setVisible(true);
        guntline3.setVisible(true);
        
        //when three process
        int n=3;   //no. of process
        int i;
        int p[]=new int [n];
        int bt[]={b0,b1,b2};
        int pt[]={pr0,pr1,pr2};
        
       
        
        //algorith activity
        for(i=0;i<n;i++)

{
    p[i]=i;   //fil up process value as 0,1,2

}
  //sorting burst time and process with priority basis
for(i=0;i<n;i++){
    pos=i;

for(int j=i+1;j<n;j++)

{

if(pt[j]<pt[pos])

pos=j;

}

temp=pt[pos];
pt[pos]=pt[i];

pt[i]=temp;
temp=p[pos];

p[pos]=p[i];

p[i]=temp;

temp=bt[pos];
bt[pos]=bt[i];
bt[i]=temp;

}   
//end of sorting   



// now set process into ghuntt chart

 for(i=0;i<n;i++){
     switch(i){
         case 0:
             if(p[i]==0){
             jLabel8.setText("P0");
             }
             else if(p[i]==1){
             jLabel8.setText("P1");
             }
              else if(p[i]==2){
             jLabel8.setText("P2");
             }
             break;
         case 1:
               if(p[i]==0){
             jLabel10.setText("P0");
             }
             else if(p[i]==1){
             jLabel10.setText("P1");
             }
              else if(p[i]==2){
             jLabel10.setText("P2");
             }
             break;
         case 2:
             if(p[i]==0){
             jLabel12.setText("P0");
             }
             else if(p[i]==1){
             jLabel12.setText("P1");
             }
              else if(p[i]==2){
             jLabel12.setText("P2");
             }
             break;
     }
     
     
     
    
 }       
       
 
 
 
 //set burst time into guntt chart
     for(i=0;i<n;i++){
         switch(i){
             case 0:
                 btime=btime+bt[i];
                 jLabel9.setText(""+btime);
                 break;
             case 1:
                  btime=btime+bt[i];
                 jLabel11.setText(""+btime);
                 break;
             case 2 :
                  btime=btime+bt[i];
                 jLabel13.setText(""+btime);
                 break;
         }
     }
     
     
     
     //waiting time & turnaround time show
     int wt[]=new int[n];
     int tat[]=new int[n];
      wt[0]=0;
     double avg_wt=0.00;
     double avg_tat=0.00;
for(i=1;i<n;i++)

{

wt[i]=0;

for(int j=0;j<i;j++)

wt[i]+=bt[j];
avg_wt=avg_wt+wt[i];
}
     
jTextArea1.setText("Process\t   waiting time\t   TAT\n");

for(i=0;i<n;i++)

{

tat[i]=bt[i]+wt[i];
avg_tat=avg_tat+tat[i];
jTextArea1.setText(jTextArea1.getText()+"\n"+"   "+p[i]+"\t"+"       "+wt[i]+"\t"+"    "+tat[i]);

}



//showing average waiting time and average turnaround time
avg_wt=avg_wt/n;
avg_tat=avg_tat/n;
jTextArea2.setText("\n\n\n\n  =>Average Waiting Time: "+Math.round(avg_wt*100.0)/100.0);
jTextArea2.setText(jTextArea2.getText()+"\n"+"  =>Average Turnaround Time: "+Math.round(avg_tat*100.0)/100.0);
     
        
        
    }
    public void p4(int b0,int b1,int b2,int b3,int pr0,int pr1,int pr2,int pr3){
        int pos;
    int temp;
    int btime=0;
              //show ghuntt chart label
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        jLabel10.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        jLabel14.setVisible(true);
        jLabel15.setVisible(true);
         //show guntt line
        guntline1.setVisible(true);
        guntline2.setVisible(true);
        guntline3.setVisible(true);
        guntline4.setVisible(true);
        
        //when four process
        
              
           int n=4;   //no. of process
        int i;
        int p[]=new int [n];
        int bt[]={b0,b1,b2,b3};
        int pt[]={pr0,pr1,pr2,pr3};
        
       
        
        //algorith activity
        for(i=0;i<n;i++){
    p[i]=i;   //fil up process value as 0,1,2

}
  //sorting burst time and process with priority basis
for(i=0;i<n;i++){
    pos=i;

for(int j=i+1;j<n;j++)

{

if(pt[j]<pt[pos])

pos=j;

}

temp=pt[pos];
pt[pos]=pt[i];

pt[i]=temp;
temp=p[pos];

p[pos]=p[i];

p[i]=temp;

temp=bt[pos];
bt[pos]=bt[i];
bt[i]=temp;

}   
//end of sorting   



// now set process into ghuntt chart

 for(i=0;i<n;i++){
     switch(i){
         case 0:
             if(p[i]==0){
             jLabel8.setText("P0");
             }
             else if(p[i]==1){
             jLabel8.setText("P1");
             }
              else if(p[i]==2){
             jLabel8.setText("P2");
             }
             else if(p[i]==3){
             jLabel8.setText("P3");
             }
            
             
             
             break;
         case 1:
               if(p[i]==0){
             jLabel10.setText("P0");
             }
             else if(p[i]==1){
             jLabel10.setText("P1");
             }
              else if(p[i]==2){
             jLabel10.setText("P2");
             }
                else if(p[i]==3){
             jLabel10.setText("P3");
             }
            
             break;
         case 2:
             if(p[i]==0){
             jLabel12.setText("P0");
             }
             else if(p[i]==1){
             jLabel12.setText("P1");
             }
              else if(p[i]==2){
             jLabel12.setText("P2");
             }
              else if(p[i]==3){
             jLabel12.setText("P3");
             }
           
             break;
             
             case 3:
             if(p[i]==0){
             jLabel14.setText("P0");
             }
             else if(p[i]==1){
             jLabel14.setText("P1");
             }
              else if(p[i]==2){
             jLabel14.setText("P2");
             }
              else if(p[i]==3){
             jLabel14.setText("P3");
             }
            
             break;
        
             
             
     }
     
     
     
    
 }       
       
 
 
 
 //set burst time into guntt chart
     for(i=0;i<n;i++){
         switch(i){
             case 0:
                 btime=btime+bt[i];
                 jLabel9.setText(""+btime);
                 break;
             case 1:
                  btime=btime+bt[i];
                 jLabel11.setText(""+btime);
                 break;
             case 2 :
                  btime=btime+bt[i];
                 jLabel13.setText(""+btime);
                 break;
                 case 3 :
                     btime=btime+bt[i];
                 jLabel15.setText(""+btime);
                     break;
                     case 4 :
                         btime=btime+bt[i];
                 jLabel17.setText(""+btime);
                         break;
         }
     }
        
         //waiting time & turnaround time show
     int wt[]=new int[n];
     int tat[]=new int[n];
      wt[0]=0;
     double avg_wt=0.00;
     double avg_tat=0.00;
for(i=1;i<n;i++)

{

wt[i]=0;

for(int j=0;j<i;j++)

wt[i]+=bt[j];
avg_wt=avg_wt+wt[i];
}
     
jTextArea1.setText("Process\t   waiting time\t   TAT\n");

for(i=0;i<n;i++)

{

tat[i]=bt[i]+wt[i];
avg_tat=avg_tat+tat[i];
jTextArea1.setText(jTextArea1.getText()+"\n"+"   "+p[i]+"\t"+"       "+wt[i]+"\t"+"    "+tat[i]);

}



//showing average waiting time and average turnaround time
avg_wt=avg_wt/n;
avg_tat=avg_tat/n;
jTextArea2.setText("\n\n\n\n  =>Average Waiting Time: "+Math.round(avg_wt*100.0)/100.0);
jTextArea2.setText(jTextArea2.getText()+"\n"+"  =>Average Turnaround Time: "+Math.round(avg_tat*100.0)/100.0);
    }
    public void p5(int b0,int b1,int b2,int b3,int b4,int pr0,int pr1,int pr2,int pr3,int pr4){
        int pos;
    int temp;
    int btime=0;
                     //show ghuntt chart label
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        jLabel10.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        jLabel14.setVisible(true);
        jLabel15.setVisible(true);
        jLabel16.setVisible(true);
        jLabel17.setVisible(true);
        //show guntt line
        guntline1.setVisible(true);
        guntline2.setVisible(true);
        guntline3.setVisible(true);
        guntline4.setVisible(true);
        guntline5.setVisible(true);
        
        
        //when five process
           int n=5;   //no. of process
        int i;
        int p[]=new int [n];
        int bt[]={b0,b1,b2,b3,b4};
        int pt[]={pr0,pr1,pr2,pr3,pr4};
        
       
        
        //algorith activity
        for(i=0;i<n;i++){
    p[i]=i;   //fil up process value as 0,1,2

}
  //sorting burst time and process with priority basis
for(i=0;i<n;i++){
    pos=i;

for(int j=i+1;j<n;j++)

{

if(pt[j]<pt[pos])

pos=j;

}

temp=pt[pos];
pt[pos]=pt[i];

pt[i]=temp;
temp=p[pos];

p[pos]=p[i];

p[i]=temp;

temp=bt[pos];
bt[pos]=bt[i];
bt[i]=temp;

}   
//end of sorting   



// now set process into ghuntt chart

 for(i=0;i<n;i++){
     switch(i){
         case 0:
             if(p[i]==0){
             jLabel8.setText("P0");
             }
             else if(p[i]==1){
             jLabel8.setText("P1");
             }
              else if(p[i]==2){
             jLabel8.setText("P2");
             }
             else if(p[i]==3){
             jLabel8.setText("P3");
             }
             else if(p[i]==4){
             jLabel8.setText("P4");
             }
             
             
             break;
         case 1:
               if(p[i]==0){
             jLabel10.setText("P0");
             }
             else if(p[i]==1){
             jLabel10.setText("P1");
             }
              else if(p[i]==2){
             jLabel10.setText("P2");
             }
                else if(p[i]==3){
             jLabel10.setText("P3");
             }
                else if(p[i]==4){
             jLabel10.setText("P4");
             }
             break;
         case 2:
             if(p[i]==0){
             jLabel12.setText("P0");
             }
             else if(p[i]==1){
             jLabel12.setText("P1");
             }
              else if(p[i]==2){
             jLabel12.setText("P2");
             }
              else if(p[i]==3){
             jLabel12.setText("P3");
             }
              else if(p[i]==4){
             jLabel12.setText("P4");
             }
             break;
             
             case 3:
             if(p[i]==0){
             jLabel14.setText("P0");
             }
             else if(p[i]==1){
             jLabel14.setText("P1");
             }
              else if(p[i]==2){
             jLabel14.setText("P2");
             }
              else if(p[i]==3){
             jLabel14.setText("P3");
             }
              else if(p[i]==4){
             jLabel14.setText("P4");
             }
             break;
             
             case 4:
             if(p[i]==0){
             jLabel16.setText("P0");
             }
             else if(p[i]==1){
             jLabel16.setText("P1");
             }
              else if(p[i]==2){
             jLabel16.setText("P2");
             }
              else if(p[i]==3){
             jLabel16.setText("P3");
             }
              else if(p[i]==4){
             jLabel16.setText("P4");
             }
             break;
             
             
     }
     
     
     
 }       
       
 
 
 
 //set burst time into guntt chart
     for(i=0;i<n;i++){
         switch(i){
             case 0:
                 btime=btime+bt[i];
                 jLabel9.setText(""+btime);
                 break;
             case 1:
                  btime=btime+bt[i];
                 jLabel11.setText(""+btime);
                 break;
             case 2 :
                  btime=btime+bt[i];
                 jLabel13.setText(""+btime);
                 break;
                 case 3 :
                     btime=btime+bt[i];
                 jLabel15.setText(""+btime);
                     break;
                     case 4 :
                         btime=btime+bt[i];
                 jLabel17.setText(""+btime);
                         break;
         }
     }
     
         //waiting time & turnaround time show
     int wt[]=new int[n];
     int tat[]=new int[n];
      wt[0]=0;
     double avg_wt=0.00;
     double avg_tat=0.00;
for(i=1;i<n;i++)

{

wt[i]=0;

for(int j=0;j<i;j++)

wt[i]+=bt[j];
avg_wt=avg_wt+wt[i];
}
     
jTextArea1.setText("Process\t   waiting time\t   TAT\n");

for(i=0;i<n;i++)

{

tat[i]=bt[i]+wt[i];
avg_tat=avg_tat+tat[i];
jTextArea1.setText(jTextArea1.getText()+"\n"+"   "+p[i]+"\t"+"       "+wt[i]+"\t"+"    "+tat[i]);

}



//showing average waiting time and average turnaround time
avg_wt=avg_wt/n;
avg_tat=avg_tat/n;
jTextArea2.setText("\n\n\n\n  =>Average Waiting Time: "+Math.round(avg_wt*100.0)/100.0);
jTextArea2.setText(jTextArea2.getText()+"\n"+"  =>Average Turnaround Time: "+Math.round(avg_tat*100.0)/100.0);
    
         
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pinput = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pr3input = new javax.swing.JTextField();
        B1input = new javax.swing.JTextField();
        B3input = new javax.swing.JTextField();
        p3input = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        p4input = new javax.swing.JTextField();
        B2input = new javax.swing.JTextField();
        B4input = new javax.swing.JTextField();
        pr4input = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        p2input = new javax.swing.JTextField();
        pr2input = new javax.swing.JTextField();
        pr1input = new javax.swing.JTextField();
        p1input = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pr0input = new javax.swing.JTextField();
        B0input = new javax.swing.JTextField();
        p0input = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        guntline5 = new javax.swing.JLabel();
        guntline2 = new javax.swing.JLabel();
        guntline1 = new javax.swing.JLabel();
        guntline4 = new javax.swing.JLabel();
        guntline3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sheduling(Priority)");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Number of Process :");

        pinput.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setBackground(new java.awt.Color(51, 0, 51));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 0, 51));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pr3input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pr3input.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 204), null, null));
        jPanel1.add(pr3input, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 33, -1));

        B1input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B1input.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 204), null, null));
        jPanel1.add(B1input, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 33, -1));

        B3input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B3input.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 204), null, null));
        jPanel1.add(B3input, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 33, -1));

        p3input.setEditable(false);
        p3input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p3input.setText("P3");
        p3input.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 204), null, null));
        jPanel1.add(p3input, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 33, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 0));
        jLabel5.setText("Priority :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 11, -1, -1));

        p4input.setEditable(false);
        p4input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p4input.setText("P4");
        p4input.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 204), null, null));
        jPanel1.add(p4input, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 33, -1));

        B2input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B2input.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 204), null, null));
        jPanel1.add(B2input, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 33, -1));

        B4input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B4input.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 204), null, null));
        jPanel1.add(B4input, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 33, -1));

        pr4input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pr4input.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 204), null, null));
        jPanel1.add(pr4input, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 33, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 0));
        jLabel3.setText("Process :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 11, -1, -1));

        p2input.setEditable(false);
        p2input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p2input.setText("P2");
        p2input.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 204), null, null));
        p2input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2inputActionPerformed(evt);
            }
        });
        jPanel1.add(p2input, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 33, -1));

        pr2input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pr2input.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 204), null, null));
        jPanel1.add(pr2input, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 33, -1));

        pr1input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pr1input.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 204), null, null));
        jPanel1.add(pr1input, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 33, -1));

        p1input.setEditable(false);
        p1input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p1input.setText("P1");
        p1input.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 204), null, null));
        jPanel1.add(p1input, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 33, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 0));
        jLabel4.setText("Burst Time :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 11, -1, -1));

        pr0input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pr0input.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 204), null, null));
        jPanel1.add(pr0input, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 33, -1));

        B0input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B0input.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 204), null, null));
        jPanel1.add(B0input, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 35, -1));

        p0input.setEditable(false);
        p0input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p0input.setText("P0");
        p0input.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 204), null, null));
        p0input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p0inputActionPerformed(evt);
            }
        });
        jPanel1.add(p0input, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 35, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Ghuntt Chart,Waiting & Turnaround Time,and Average Time");

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 102), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 51));
        jLabel7.setText("0");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("P1");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 51));
        jLabel9.setText("burs");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 61, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("P2");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 51));
        jLabel11.setText("burs");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("P3");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 51));
        jLabel13.setText("burs");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("P4");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 51));
        jLabel15.setText("burs");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("P5");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 51));
        jLabel17.setText("burs");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        guntline5.setText("---------------");
        jPanel2.add(guntline5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 60, -1));

        guntline2.setText("---------------");
        jPanel2.add(guntline2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 60, -1));

        guntline1.setText("---------------");
        jPanel2.add(guntline1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 60, 60, -1));

        guntline4.setText("---------------");
        jPanel2.add(guntline4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 60, -1));

        guntline3.setText("---------------");
        jPanel2.add(guntline3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 60, -1));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setBackground(new java.awt.Color(0, 0, 102));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jScrollPane2.setViewportView(jTextArea2);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 51));
        jLabel18.setText("Resulting");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 51));
        jLabel19.setText("Expected Input Scenario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(395, 395, 395))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jButton1)
                                .addGap(94, 94, 94)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(pinput, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(jLabel18)))
                        .addContainerGap(30, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(59, 59, 59))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addComponent(jLabel19)
                    .addContainerGap(679, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(169, 169, 169)
                    .addComponent(jLabel19)
                    .addContainerGap(408, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//calculate button
int b0,b1,b2,b3,b4,pr0,pr1,pr2,pr3,pr4;
switch(choice){
            case 1:
                  b0=Integer.parseInt(B0input.getText());
                  pr0=Integer.parseInt(pr0input.getText());
                p1(b0,pr0); //call function with process,burst, and priority
                break;
                
            case 2:
                //int p0,p1,b0,b1,pr0,pr1;
                 
                  b0=Integer.parseInt(B0input.getText());
                  b1=Integer.parseInt(B1input.getText());
                  pr0=Integer.parseInt(pr0input.getText());
                  pr1=Integer.parseInt(pr1input.getText());
                p2(b0,b1,pr0,pr1); //call function with process,burst, and priority
                break;
                
            case 3:
                 
                  b0=Integer.parseInt(B0input.getText());
                  b1=Integer.parseInt(B1input.getText());
                  b2=Integer.parseInt(B2input.getText());
                  pr0=Integer.parseInt(pr0input.getText());
                  pr1=Integer.parseInt(pr1input.getText());
                  pr2=Integer.parseInt(pr2input.getText());
                p3(b0,b1,b2,pr0,pr1,pr2); //call function with process,burst, and priority
                break;
                
            case 4:
                 
                  b0=Integer.parseInt(B0input.getText());
                  b1=Integer.parseInt(B1input.getText());
                  b2=Integer.parseInt(B2input.getText());
                  b3=Integer.parseInt(B3input.getText());
                  pr0=Integer.parseInt(pr0input.getText());
                  pr1=Integer.parseInt(pr1input.getText());
                  pr2=Integer.parseInt(pr2input.getText());
                  pr3=Integer.parseInt(pr3input.getText());
                p4(b0,b1,b2,b3,pr0,pr1,pr2,pr3); //call function with process,burst, and priority
                break;
                
                case 5:
                              
                  b0=Integer.parseInt(B0input.getText());
                  b1=Integer.parseInt(B1input.getText());
                  b2=Integer.parseInt(B2input.getText());
                  b3=Integer.parseInt(B3input.getText());
                  b4=Integer.parseInt(B4input.getText());
                  pr0=Integer.parseInt(pr0input.getText());
                  pr1=Integer.parseInt(pr1input.getText());
                  pr2=Integer.parseInt(pr2input.getText());
                  pr3=Integer.parseInt(pr3input.getText());
                   pr4=Integer.parseInt(pr4input.getText());
                p5(b0,b1,b2,b3,b4,pr0,pr1,pr2,pr3,pr4); //call function with process,burst, and priority
                break;
                
                        
}





    }//GEN-LAST:event_jButton1ActionPerformed

    private void p0inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p0inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p0inputActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //submit button
        //take no of process from user
        
        if(pinput.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Empty process!");
        }
        else{
        choice=Integer.parseInt(pinput.getText());
        switch(choice){
            case 1:
                
                p0input.setVisible(true);
                
                 B0input.setVisible(true);
                
                  pr0input.setVisible(true);
                  
                  System.out.println("case1 executed");
                  
                  
                break;
                
                case 2:
                   
                    p0input.setVisible(true);
                    p1input.setVisible(true);
                    
                    B0input.setVisible(true);
                    B1input.setVisible(true);
                    
                    pr0input.setVisible(true);
                    pr1input.setVisible(true);
                    
                    
                    break;
                    
                    case 3:
                        
                        p0input.setVisible(true);
                        p1input.setVisible(true);
                        p2input.setVisible(true);
                        
                        B0input.setVisible(true);
                        B1input.setVisible(true);
                        B2input.setVisible(true);
                    
                        pr0input.setVisible(true);
                        pr1input.setVisible(true);
                        pr2input.setVisible(true);
                      
                        
                        
                        
                        break;
                        
                    case 4:
                       
                        p0input.setVisible(true);
                        p1input.setVisible(true);
                        p2input.setVisible(true);
                        p3input.setVisible(true);
                        
                        B0input.setVisible(true);
                        B1input.setVisible(true);
                        B2input.setVisible(true);
                        B3input.setVisible(true);
                    
                        pr0input.setVisible(true);
                        pr1input.setVisible(true);
                        pr2input.setVisible(true);
                        pr3input.setVisible(true);
                        
                        
           
                        
                        
                        break;
                        
                        case 5:
                        
                        p0input.setVisible(true);
                        p1input.setVisible(true);
                        p2input.setVisible(true);
                        p3input.setVisible(true);
                        p4input.setVisible(true);
                        
                        B0input.setVisible(true);
                        B1input.setVisible(true);
                        B2input.setVisible(true);
                        B3input.setVisible(true);
                        B4input.setVisible(true);
                    
                        pr0input.setVisible(true);
                        pr1input.setVisible(true);
                        pr2input.setVisible(true);
                        pr3input.setVisible(true);
                        pr4input.setVisible(true);
                        
                        break;
                        
                        default:
                            System.out.println("Invalid");
                            break;
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void p2inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2inputActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.hide();
        new menu().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField B0input;
    private javax.swing.JTextField B1input;
    private javax.swing.JTextField B2input;
    private javax.swing.JTextField B3input;
    private javax.swing.JTextField B4input;
    private javax.swing.JLabel guntline1;
    private javax.swing.JLabel guntline2;
    private javax.swing.JLabel guntline3;
    private javax.swing.JLabel guntline4;
    private javax.swing.JLabel guntline5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField p0input;
    private javax.swing.JTextField p1input;
    private javax.swing.JTextField p2input;
    private javax.swing.JTextField p3input;
    private javax.swing.JTextField p4input;
    private javax.swing.JTextField pinput;
    private javax.swing.JTextField pr0input;
    private javax.swing.JTextField pr1input;
    private javax.swing.JTextField pr2input;
    private javax.swing.JTextField pr3input;
    private javax.swing.JTextField pr4input;
    // End of variables declaration//GEN-END:variables
}
