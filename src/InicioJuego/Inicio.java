package InicioJuego;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import Sistema.MagicMemo;


/**
 *
 * @author HP
 */
public class Inicio extends javax.swing.JFrame {
    
     
     /**Este SerialVersionUID es la classe generada a partir de Java 
      *  aquí se determinan los lados de cada carta y el respectio icono o imagen
      *  que tapa las cartas en el juego
	 */
	private static final long serialVersionUID = 1L;
	private MagicMemo log = new MagicMemo();
       private boolean LadoArriba = false; 
       private ImageIcon imag1;
       private ImageIcon imag2;
       private JButton[] pbot = new JButton[2];
       private boolean carta = false;  
       
    public Inicio() {
        this.log = new MagicMemo();
        initComponents();
        
   
    setCards();            
    }
    
/**Este metodo permite colocar
 * aleatoriamente las cartas en el Jframe
 * un total de 16 cartas desde IM1 hasta IM8
 */ 
    private void setCards(){
    int[]numbers = log.getCardNumbers();
    
    b1.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/IM"+numbers[0]+".png")));
    b2.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/IM"+numbers[1]+".png")));
    b3.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/IM"+numbers[2]+".png")));
    b4.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/IM"+numbers[3]+".png")));    
    b5.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/IM"+numbers[4]+".png")));
    b6.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/IM"+numbers[5]+".png")));
    b7.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/IM"+numbers[6]+".png")));
    b8.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/IM"+numbers[7]+".png")));
    b9.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/IM"+numbers[8]+".png")));
    b10.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/IM"+numbers[9]+".png")));    
    b11.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/IM"+numbers[10]+".png")));
    b12.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/IM"+numbers[11]+".png")));
    b13.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/IM"+numbers[12]+".png")));
    b14.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/IM"+numbers[13]+".png")));    
    b15.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/IM"+numbers[14]+".png")));
    b16.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/IM"+numbers[15]+".png")));
    
    }
    
    /**
     * Aquí se desabilitan botones cuando se voltean las cartas
     * 
     */
    private void  btnEnabled(JButton btn) {
    
        if(!LadoArriba) { 
            btn.setEnabled(false); 
            imag1= (ImageIcon) btn.getDisabledIcon();
            pbot[0]= btn;
            LadoArriba = true;
            carta = false;
    }
        else{
            btn.setEnabled(false);
            imag2 = (ImageIcon) btn.getDisabledIcon();
            pbot[1] = btn;
            carta = true; 
           
            pregwin();
            
        }
    }
    
    /** Aquíse comparan las imagenes para determinar
     * si son iguales cuando se giran
     */
    private void compare(){
      if(LadoArriba && carta){
        
        
        if(imag1.getDescription().compareTo(imag2.getDescription()) !=0){
            pbot[0].setEnabled(true) ;
            pbot[1].setEnabled(true) ;
            
        }
        LadoArriba = false;
         }  
      }

  /**
   * Este metodo nos permite mostrar un mensaje
   * cuando ya el juego ha sido solucionado
   */
    
    private void pregwin(){
        if(!b1.isEnabled()&& !b2.isEnabled() && !b3.isEnabled()&& !b4.isEnabled()&&
         !b5.isEnabled()&& !b6.isEnabled()&& !b7.isEnabled() && !b8.isEnabled()&&
         !b9.isEnabled()&& !b10.isEnabled()&& !b11.isEnabled()&& !b12.isEnabled()&&
         !b13.isEnabled()&& !b14.isEnabled()&& !b15.isEnabled()&& !b16.isEnabled()){
          
         JOptionPane.showMessageDialog(null,"LO HAS LOGRADO, FELICITACIONES!!!!","",JOptionPane.INFORMATION_MESSAGE);
        }
        }
    /**Con este metodo se cargan todos los objetos
     * que colocamos en el Jframe
     *             
     */
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IM0.png"))); // NOI18N
        b1.setBorder(null);
        b1.setBorderPainted(false);
        b1.setContentAreaFilled(false);
        b1.setFocusable(false);
        b1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FC.png"))); // NOI18N
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(130, 140, 81, 101);

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IM0.png"))); // NOI18N
        b2.setBorder(null);
        b2.setBorderPainted(false);
        b2.setContentAreaFilled(false);
        b2.setFocusable(false);
        b2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FC.png"))); // NOI18N
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b2MouseExited(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(220, 140, 81, 101);

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IM0.png"))); // NOI18N
        b3.setBorder(null);
        b3.setBorderPainted(false);
        b3.setContentAreaFilled(false);
        b3.setFocusable(false);
        b3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FC.png"))); // NOI18N
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b3MouseExited(evt);
            }
        });
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(310, 140, 81, 101);

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IM0.png"))); // NOI18N
        b4.setBorder(null);
        b4.setBorderPainted(false);
        b4.setContentAreaFilled(false);
        b4.setFocusable(false);
        b4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FC.png"))); // NOI18N
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b4MouseExited(evt);
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(400, 140, 81, 101);

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IM0.png"))); // NOI18N
        b5.setBorder(null);
        b5.setBorderPainted(false);
        b5.setContentAreaFilled(false);
        b5.setFocusable(false);
        b5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FC.png"))); // NOI18N
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b5MouseExited(evt);
            }
        });
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(130, 250, 81, 101);

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IM0.png"))); // NOI18N
        b6.setBorder(null);
        b6.setBorderPainted(false);
        b6.setContentAreaFilled(false);
        b6.setFocusable(false);
        b6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FC.png"))); // NOI18N
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b6MouseExited(evt);
            }
        });
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(220, 250, 81, 101);

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IM0.png"))); // NOI18N
        b7.setBorder(null);
        b7.setBorderPainted(false);
        b7.setContentAreaFilled(false);
        b7.setFocusable(false);
        b7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FC.png"))); // NOI18N
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b7MouseExited(evt);
            }
        });
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(310, 250, 81, 101);

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IM0.png"))); // NOI18N
        b8.setBorder(null);
        b8.setBorderPainted(false);
        b8.setContentAreaFilled(false);
        b8.setFocusable(false);
        b8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FC.png"))); // NOI18N
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b8MouseExited(evt);
            }
        });
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(400, 250, 81, 101);

        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IM0.png"))); // NOI18N
        b9.setBorder(null);
        b9.setBorderPainted(false);
        b9.setContentAreaFilled(false);
        b9.setFocusable(false);
        b9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FC.png"))); // NOI18N
        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b9MouseExited(evt);
            }
        });
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9);
        b9.setBounds(130, 360, 81, 101);

        b10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IM0.png"))); // NOI18N
        b10.setBorder(null);
        b10.setBorderPainted(false);
        b10.setContentAreaFilled(false);
        b10.setFocusable(false);
        b10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FC.png"))); // NOI18N
        b10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b10MouseExited(evt);
            }
        });
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        getContentPane().add(b10);
        b10.setBounds(220, 360, 81, 101);

        b11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IM0.png"))); // NOI18N
        b11.setBorder(null);
        b11.setBorderPainted(false);
        b11.setContentAreaFilled(false);
        b11.setFocusable(false);
        b11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FC.png"))); // NOI18N
        b11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b11MouseExited(evt);
            }
        });
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        getContentPane().add(b11);
        b11.setBounds(310, 360, 81, 101);

        b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IM0.png"))); // NOI18N
        b12.setBorder(null);
        b12.setBorderPainted(false);
        b12.setContentAreaFilled(false);
        b12.setFocusable(false);
        b12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FC.png"))); // NOI18N
        b12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b12MouseExited(evt);
            }
        });
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        getContentPane().add(b12);
        b12.setBounds(400, 360, 81, 101);

        b13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IM0.png"))); // NOI18N
        b13.setBorder(null);
        b13.setBorderPainted(false);
        b13.setContentAreaFilled(false);
        b13.setFocusable(false);
        b13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FC.png"))); // NOI18N
        b13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b13MouseExited(evt);
            }
        });
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        getContentPane().add(b13);
        b13.setBounds(130, 470, 79, 101);

        b14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IM0.png"))); // NOI18N
        b14.setBorder(null);
        b14.setBorderPainted(false);
        b14.setContentAreaFilled(false);
        b14.setFocusable(false);
        b14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FC.png"))); // NOI18N
        b14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b14MouseExited(evt);
            }
        });
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        getContentPane().add(b14);
        b14.setBounds(220, 470, 83, 101);

        b15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IM0.png"))); // NOI18N
        b15.setBorder(null);
        b15.setBorderPainted(false);
        b15.setContentAreaFilled(false);
        b15.setFocusable(false);
        b15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FC.png"))); // NOI18N
        b15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b15MouseExited(evt);
            }
        });
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        getContentPane().add(b15);
        b15.setBounds(310, 470, 81, 101);

        b16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IM0.png"))); // NOI18N
        b16.setBorder(null);
        b16.setBorderPainted(false);
        b16.setContentAreaFilled(false);
        b16.setFocusable(false);
        b16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FC.png"))); // NOI18N
        b16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b16MouseExited(evt);
            }
        });
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        getContentPane().add(b16);
        b16.setBounds(400, 470, 80, 101);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 620, 700);

        pack();
    }
/**
 * Aquí se determina la acción sobre los botones 
 * 
 */
   
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {
        btnEnabled(b1);
    }

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {
        btnEnabled(b2);
    }

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {
        btnEnabled(b3);
    }
    
    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {
        btnEnabled(b4); 
    }
    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {
        btnEnabled(b5);
    }

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {
       btnEnabled(b6);
    }

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {
        btnEnabled(b7);
    }
    
    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {
        btnEnabled(b8);
    }

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {
        btnEnabled(b9);
    }

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {
        btnEnabled(b10);
    }

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {
        btnEnabled(b11);
    }

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {
        btnEnabled(b12);
    }

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {
        btnEnabled(b13);
    }

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {
        btnEnabled(b14);
    }

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {
        btnEnabled(b15);
    }

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {
        btnEnabled(b16);
    }
/**
 * Este metodo nos permitira comparar las cartas al mover el mouse 
 * que estaba sobre alguna carta 
 */
    private void b1MouseExited(java.awt.event.MouseEvent evt) {
        compare();
    }

    private void b2MouseExited(java.awt.event.MouseEvent evt) {
        compare();
    }

    private void b3MouseExited(java.awt.event.MouseEvent evt) {
        compare();
    }

    private void b4MouseExited(java.awt.event.MouseEvent evt) {
        compare();
    }

    private void b5MouseExited(java.awt.event.MouseEvent evt) {
        compare();
    }

    private void b6MouseExited(java.awt.event.MouseEvent evt) {
        compare();
    }

    private void b7MouseExited(java.awt.event.MouseEvent evt) {
        compare();
    }

    private void b8MouseExited(java.awt.event.MouseEvent evt) {
        compare();
    }

    private void b9MouseExited(java.awt.event.MouseEvent evt) {
        compare();
    }

    private void b10MouseExited(java.awt.event.MouseEvent evt) {
        compare();
    }

    private void b11MouseExited(java.awt.event.MouseEvent evt) {
        compare();
    }

    private void b12MouseExited(java.awt.event.MouseEvent evt) {
        compare();
    }

    private void b13MouseExited(java.awt.event.MouseEvent evt) {
        compare();
    }

    private void b14MouseExited(java.awt.event.MouseEvent evt) {
        compare();
    }

    private void b15MouseExited(java.awt.event.MouseEvent evt) {
        compare();
    }

    private void b16MouseExited(java.awt.event.MouseEvent evt) {
        compare();
    }

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
/**
 * 
 */
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel jLabel2;

}
