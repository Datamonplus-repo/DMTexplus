package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class perf005 extends GXProcedure
{
   public perf005( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( perf005.class ), "" );
   }

   public perf005( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          int[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          java.math.BigDecimal[] aP5 ,
                          java.math.BigDecimal[] aP6 )
   {
      perf005.this.aP7 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        int[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 )
   {
      perf005.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      perf005.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      perf005.this.A44AlbRecCod = aP2[0];
      this.aP2 = aP2;
      perf005.this.AV15BarPieCod = aP3[0];
      this.aP3 = aP3;
      perf005.this.AV16Desglose = aP4[0];
      this.aP4 = aP4;
      perf005.this.AV21BarPieKil = aP5[0];
      this.aP5 = aP5;
      perf005.this.AV22BarPieMet = aP6[0];
      this.aP6 = aP6;
      perf005.this.AV23BarPiePie = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV30TipEntcod = (short)(0) ;
      /* Using cursor P02RX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1211TipEntCod = P02RX2_A1211TipEntCod[0] ;
         n1211TipEntCod = P02RX2_n1211TipEntCod[0] ;
         AV30TipEntcod = A1211TipEntCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02RX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A595Kilos = P02RX3_A595Kilos[0] ;
         A631Metros = P02RX3_A631Metros[0] ;
         A673Piezas = P02RX3_A673Piezas[0] ;
         A392DisUniMed = P02RX3_A392DisUniMed[0] ;
         A392DisUniMed = P02RX3_A392DisUniMed[0] ;
         A595Kilos = A595Kilos.subtract(AV21BarPieKil) ;
         A631Metros = A631Metros.subtract(AV22BarPieMet) ;
         A673Piezas = (int)(A673Piezas-AV23BarPiePie) ;
         if ( GXutil.strcmp(AV16Desglose, httpContext.getMessage( "N", "")) == 0 )
         {
            if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( A595Kilos.doubleValue() == 0 )
               {
                  /* Using cursor P02RX4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
               }
            }
            else
            {
               if ( A631Metros.doubleValue() == 0 )
               {
                  /* Using cursor P02RX5 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
               }
            }
         }
         /* Using cursor P02RX6 */
         pr_default.execute(4, new Object[] {A595Kilos, A631Metros, Integer.valueOf(A673Piezas), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV30TipEntcod == 9999 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P02RX9 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A374DisNumPie = P02RX9_A374DisNumPie[0] ;
         A375DisNumUni = P02RX9_A375DisNumUni[0] ;
         A387DisPiePie = P02RX9_A387DisPiePie[0] ;
         n387DisPiePie = P02RX9_n387DisPiePie[0] ;
         A379DisPie = P02RX9_A379DisPie[0] ;
         n379DisPie = P02RX9_n379DisPie[0] ;
         A392DisUniMed = P02RX9_A392DisUniMed[0] ;
         A365DisDes = P02RX9_A365DisDes[0] ;
         A387DisPiePie = P02RX9_A387DisPiePie[0] ;
         n387DisPiePie = P02RX9_n387DisPiePie[0] ;
         A379DisPie = P02RX9_A379DisPie[0] ;
         n379DisPie = P02RX9_n379DisPie[0] ;
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
         {
            A391DisUni = getDisUni0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               A391DisUni = getDisUni1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A391DisUni = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( GXutil.strcmp(AV16Desglose, httpContext.getMessage( "S", "")) == 0 )
         {
            A374DisNumPie = A387DisPiePie ;
            if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               A375DisNumUni = A385DisPieMtr ;
            }
            else
            {
               A375DisNumUni = A381DisPieKgm ;
            }
         }
         else
         {
            A374DisNumPie = A379DisPie ;
            A375DisNumUni = A391DisUni ;
         }
         /* Using cursor P02RX10 */
         pr_default.execute(6, new Object[] {Short.valueOf(A374DisNumPie), A375DisNumUni, A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      /* Using cursor P02RX11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A56AlbRUni = P02RX11_A56AlbRUni[0] ;
         A60AlbRUniUti = P02RX11_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P02RX11_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P02RX11_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = P02RX11_A52AlbRPieEnt[0] ;
         A47AlbREst = P02RX11_A47AlbREst[0] ;
         A50AlbRLoc = P02RX11_A50AlbRLoc[0] ;
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A60AlbRUniUti = A60AlbRUniUti.subtract(AV22BarPieMet) ;
         }
         else
         {
            A60AlbRUniUti = A60AlbRUniUti.subtract(AV21BarPieKil) ;
         }
         if ( GXutil.strcmp(AV16Desglose, httpContext.getMessage( "S", "")) == 0 )
         {
            A54AlbRPieUti = (int)(A54AlbRPieUti-1) ;
         }
         else
         {
            A54AlbRPieUti = (int)(A54AlbRPieUti-AV23BarPiePie) ;
         }
         if ( ( A52AlbRPieEnt == A54AlbRPieUti ) && ( DecimalUtil.compareTo(A58AlbRUniEnt, A60AlbRUniUti) == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
         }
         else
         {
            A47AlbREst = (byte)(0) ;
         }
         if ( ( GXutil.strcmp(A50AlbRLoc, httpContext.getMessage( "Sem TELA", "")) == 0 ) || ( GXutil.strcmp(A50AlbRLoc, httpContext.getMessage( "Sem Malha", "")) == 0 ) )
         {
            /* Using cursor P02RX12 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         }
         /* Using cursor P02RX13 */
         pr_default.execute(9, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = perf005.this.A396EmprCod;
      this.aP1[0] = perf005.this.A361DisCod;
      this.aP2[0] = perf005.this.A44AlbRecCod;
      this.aP3[0] = perf005.this.AV15BarPieCod;
      this.aP4[0] = perf005.this.AV16Desglose;
      this.aP5[0] = perf005.this.AV21BarPieKil;
      this.aP6[0] = perf005.this.AV22BarPieMet;
      this.aP7[0] = perf005.this.AV23BarPiePie;
      Application.commitDataStores(context, remoteHandle, pr_default, "perf005");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02RX14 */
      pr_default.execute(10, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         X631Metros = P02RX14_A631Metros[0] ;
      }
      pr_default.close(10);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02RX15 */
      pr_default.execute(11, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         X384DisPieMet = P02RX15_A384DisPieMet[0] ;
      }
      pr_default.close(11);
      return X384DisPieMet ;
   }

   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor P02RX16 */
      pr_default.execute(12, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         X595Kilos = P02RX16_A595Kilos[0] ;
      }
      pr_default.close(12);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor P02RX17 */
      pr_default.execute(13, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         X382DisPieKil = P02RX17_A382DisPieKil[0] ;
      }
      pr_default.close(13);
      return X382DisPieKil ;
   }

   public java.math.BigDecimal getDisUni1( String E396EmprCod ,
                                           int E361DisCod )
   {
      X631Metros = DecimalUtil.ZERO ;
      /* Using cursor P02RX18 */
      pr_default.execute(14, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         X631Metros = P02RX18_A631Metros[0] ;
      }
      pr_default.close(14);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisUni0( String E396EmprCod ,
                                           int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor P02RX19 */
      pr_default.execute(15, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         X595Kilos = P02RX19_A595Kilos[0] ;
      }
      pr_default.close(15);
      return X595Kilos ;
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      P02RX2_A396EmprCod = new String[] {""} ;
      P02RX2_A44AlbRecCod = new int[1] ;
      P02RX2_A1211TipEntCod = new short[1] ;
      P02RX2_n1211TipEntCod = new boolean[] {false} ;
      P02RX3_A396EmprCod = new String[] {""} ;
      P02RX3_A361DisCod = new int[1] ;
      P02RX3_A44AlbRecCod = new int[1] ;
      P02RX3_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RX3_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RX3_A673Piezas = new int[1] ;
      P02RX3_A392DisUniMed = new String[] {""} ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      P02RX9_A396EmprCod = new String[] {""} ;
      P02RX9_A361DisCod = new int[1] ;
      P02RX9_A374DisNumPie = new short[1] ;
      P02RX9_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RX9_A387DisPiePie = new short[1] ;
      P02RX9_n387DisPiePie = new boolean[] {false} ;
      P02RX9_A379DisPie = new short[1] ;
      P02RX9_n379DisPie = new boolean[] {false} ;
      P02RX9_A392DisUniMed = new String[] {""} ;
      P02RX9_A365DisDes = new String[] {""} ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A391DisUni = DecimalUtil.ZERO ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      P02RX11_A396EmprCod = new String[] {""} ;
      P02RX11_A44AlbRecCod = new int[1] ;
      P02RX11_A56AlbRUni = new String[] {""} ;
      P02RX11_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RX11_A54AlbRPieUti = new int[1] ;
      P02RX11_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RX11_A52AlbRPieEnt = new int[1] ;
      P02RX11_A47AlbREst = new byte[1] ;
      P02RX11_A50AlbRLoc = new String[] {""} ;
      A56AlbRUni = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A50AlbRLoc = "" ;
      X631Metros = DecimalUtil.ZERO ;
      P02RX14_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      P02RX15_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X595Kilos = DecimalUtil.ZERO ;
      P02RX16_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      P02RX17_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RX18_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RX19_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.perf005__default(),
         new Object[] {
             new Object[] {
            P02RX2_A396EmprCod, P02RX2_A44AlbRecCod, P02RX2_A1211TipEntCod, P02RX2_n1211TipEntCod
            }
            , new Object[] {
            P02RX3_A396EmprCod, P02RX3_A361DisCod, P02RX3_A44AlbRecCod, P02RX3_A595Kilos, P02RX3_A631Metros, P02RX3_A673Piezas, P02RX3_A392DisUniMed
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02RX9_A396EmprCod, P02RX9_A361DisCod, P02RX9_A374DisNumPie, P02RX9_A375DisNumUni, P02RX9_A387DisPiePie, P02RX9_n387DisPiePie, P02RX9_A379DisPie, P02RX9_n379DisPie, P02RX9_A392DisUniMed, P02RX9_A365DisDes
            }
            , new Object[] {
            }
            , new Object[] {
            P02RX11_A396EmprCod, P02RX11_A44AlbRecCod, P02RX11_A56AlbRUni, P02RX11_A60AlbRUniUti, P02RX11_A54AlbRPieUti, P02RX11_A58AlbRUniEnt, P02RX11_A52AlbRPieEnt, P02RX11_A47AlbREst, P02RX11_A50AlbRLoc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02RX14_A631Metros
            }
            , new Object[] {
            P02RX15_A384DisPieMet
            }
            , new Object[] {
            P02RX16_A595Kilos
            }
            , new Object[] {
            P02RX17_A382DisPieKil
            }
            , new Object[] {
            P02RX18_A631Metros
            }
            , new Object[] {
            P02RX19_A595Kilos
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private short AV30TipEntcod ;
   private short A1211TipEntCod ;
   private short A374DisNumPie ;
   private short A387DisPiePie ;
   private short A379DisPie ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int AV23BarPiePie ;
   private int A673Piezas ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int E361DisCod ;
   private java.math.BigDecimal AV21BarPieKil ;
   private java.math.BigDecimal AV22BarPieMet ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A391DisUni ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X384DisPieMet ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private String A396EmprCod ;
   private String AV15BarPieCod ;
   private String AV16Desglose ;
   private String scmdbuf ;
   private String A392DisUniMed ;
   private String A365DisDes ;
   private String A56AlbRUni ;
   private String A50AlbRLoc ;
   private String E396EmprCod ;
   private boolean n1211TipEntCod ;
   private boolean returnInSub ;
   private boolean n387DisPiePie ;
   private boolean n379DisPie ;
   private int[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P02RX2_A396EmprCod ;
   private int[] P02RX2_A44AlbRecCod ;
   private short[] P02RX2_A1211TipEntCod ;
   private boolean[] P02RX2_n1211TipEntCod ;
   private String[] P02RX3_A396EmprCod ;
   private int[] P02RX3_A361DisCod ;
   private int[] P02RX3_A44AlbRecCod ;
   private java.math.BigDecimal[] P02RX3_A595Kilos ;
   private java.math.BigDecimal[] P02RX3_A631Metros ;
   private int[] P02RX3_A673Piezas ;
   private String[] P02RX3_A392DisUniMed ;
   private String[] P02RX9_A396EmprCod ;
   private int[] P02RX9_A361DisCod ;
   private short[] P02RX9_A374DisNumPie ;
   private java.math.BigDecimal[] P02RX9_A375DisNumUni ;
   private short[] P02RX9_A387DisPiePie ;
   private boolean[] P02RX9_n387DisPiePie ;
   private short[] P02RX9_A379DisPie ;
   private boolean[] P02RX9_n379DisPie ;
   private String[] P02RX9_A392DisUniMed ;
   private String[] P02RX9_A365DisDes ;
   private String[] P02RX11_A396EmprCod ;
   private int[] P02RX11_A44AlbRecCod ;
   private String[] P02RX11_A56AlbRUni ;
   private java.math.BigDecimal[] P02RX11_A60AlbRUniUti ;
   private int[] P02RX11_A54AlbRPieUti ;
   private java.math.BigDecimal[] P02RX11_A58AlbRUniEnt ;
   private int[] P02RX11_A52AlbRPieEnt ;
   private byte[] P02RX11_A47AlbREst ;
   private String[] P02RX11_A50AlbRLoc ;
   private java.math.BigDecimal[] P02RX14_A631Metros ;
   private java.math.BigDecimal[] P02RX15_A384DisPieMet ;
   private java.math.BigDecimal[] P02RX16_A595Kilos ;
   private java.math.BigDecimal[] P02RX17_A382DisPieKil ;
   private java.math.BigDecimal[] P02RX18_A631Metros ;
   private java.math.BigDecimal[] P02RX19_A595Kilos ;
}

final  class perf005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02RX2", "SELECT EmprCod, AlbRecCod, TipEntCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02RX3", "SELECT T1.EmprCod, T1.DisCod, T1.AlbRecCod, T1.Kilos, T1.Metros, T1.Piezas, T2.DisUniMed FROM (TXPDISALB T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02RX4", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P02RX5", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P02RX6", "UPDATE TXPDISALB SET Kilos=?, Metros=?, Piezas=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P02RX9", "SELECT T1.EmprCod, T1.DisCod, T1.DisNumPie, T1.DisNumUni, COALESCE( T2.DisPiePie, 0) AS DisPiePie, COALESCE( T3.DisPie, 0) AS DisPie, T1.DisUniMed, T1.DisDes FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(Piezas) AS DisPie, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02RX10", "UPDATE TXPDISPOS SET DisNumPie=?, DisNumUni=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P02RX11", "SELECT EmprCod, AlbRecCod, AlbRUni, AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbRPieEnt, AlbREst, AlbRLoc FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02RX12", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new UpdateCursor("P02RX13", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P02RX14", "SELECT SUM(Metros) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02RX15", "SELECT SUM(DisPieMet) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02RX16", "SELECT SUM(Kilos) AS GXC5 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02RX17", "SELECT SUM(DisPieKil) AS GXC4 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02RX18", "SELECT SUM(Metros) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02RX19", "SELECT SUM(Kilos) AS GXC5 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 12 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 14 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

