package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgenagp extends GXProcedure
{
   public pgenagp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgenagp.class ), "" );
   }

   public pgenagp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           byte[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           byte[] aP7 ,
                           short[] aP8 ,
                           String[] aP9 ,
                           java.math.BigDecimal[] aP10 )
   {
      pgenagp.this.aP11 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        byte[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             byte[] aP11 )
   {
      pgenagp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgenagp.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      pgenagp.this.AV9BarCodReo = aP2[0];
      this.aP2 = aP2;
      pgenagp.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      pgenagp.this.AV14DisComLin = aP4[0];
      this.aP4 = aP4;
      pgenagp.this.AV15DisComCod = aP5[0];
      this.aP5 = aP5;
      pgenagp.this.AV16FonCod = aP6[0];
      this.aP6 = aP6;
      pgenagp.this.AV19RecMolLin = aP7[0];
      this.aP7 = aP7;
      pgenagp.this.AV20RecEstAnh = aP8[0];
      this.aP8 = aP8;
      pgenagp.this.AV21RecEstTMaq = aP9[0];
      this.aP9 = aP9;
      pgenagp.this.AV24GasTot = aP10[0];
      this.aP10 = aP10;
      pgenagp.this.AV23Opcion = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV17TinEst ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINEST", ""), GXv_int2) ;
      pgenagp.this.GXt_int1 = GXv_int2[0] ;
      AV17TinEst = GXt_int1 ;
      GXt_int1 = AV18PLinea ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int2) ;
      pgenagp.this.GXt_int1 = GXv_int2[0] ;
      AV18PLinea = GXt_int1 ;
      /* Using cursor P029G2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P029G2_A130BarCodPar[0] ;
         A132BarCodReo = P029G2_A132BarCodReo[0] ;
         A129BarCod = P029G2_A129BarCod[0] ;
         A122BarAgrPar = P029G2_A122BarAgrPar[0] ;
         A124BarAgrReo = P029G2_A124BarAgrReo[0] ;
         A119BarAgrCod = P029G2_A119BarAgrCod[0] ;
         AV11BarAgrCod = A119BarAgrCod ;
         AV12BarAgrReo = A124BarAgrReo ;
         AV13BarAgrPar = A122BarAgrPar ;
         /* Execute user subroutine: 'MODIF_AGR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'MODIF_AGR' Routine */
      returnInSub = false ;
      /* Using cursor P029G3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV11BarAgrCod), Byte.valueOf(AV12BarAgrReo), AV13BarAgrPar, Byte.valueOf(AV14DisComLin), AV15DisComCod, AV16FonCod, A396EmprCod, Integer.valueOf(AV11BarAgrCod), Byte.valueOf(AV12BarAgrReo), AV13BarAgrPar, Byte.valueOf(AV14DisComLin), AV15DisComCod, AV16FonCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1032FonCod = P029G3_A1032FonCod[0] ;
         A1056DisComCod = P029G3_A1056DisComCod[0] ;
         A2524DisComLin = P029G3_A2524DisComLin[0] ;
         A130BarCodPar = P029G3_A130BarCodPar[0] ;
         A132BarCodReo = P029G3_A132BarCodReo[0] ;
         A129BarCod = P029G3_A129BarCod[0] ;
         A2070BarFecEst = P029G3_A2070BarFecEst[0] ;
         n2070BarFecEst = P029G3_n2070BarFecEst[0] ;
         A2073BarNumMol = P029G3_A2073BarNumMol[0] ;
         n2073BarNumMol = P029G3_n2073BarNumMol[0] ;
         A2117RecEstAnh = P029G3_A2117RecEstAnh[0] ;
         n2117RecEstAnh = P029G3_n2117RecEstAnh[0] ;
         A2122RecEstTMaq = P029G3_A2122RecEstTMaq[0] ;
         n2122RecEstTMaq = P029G3_n2122RecEstTMaq[0] ;
         A2069BarComEst = P029G3_A2069BarComEst[0] ;
         n2069BarComEst = P029G3_n2069BarComEst[0] ;
         A2509BarCodLan = P029G3_A2509BarCodLan[0] ;
         n2509BarCodLan = P029G3_n2509BarCodLan[0] ;
         A2510BarComPri = P029G3_A2510BarComPri[0] ;
         n2510BarComPri = P029G3_n2510BarComPri[0] ;
         A2131RecObsULin = P029G3_A2131RecObsULin[0] ;
         n2131RecObsULin = P029G3_n2131RecObsULin[0] ;
         A1541BarComMtr = P029G3_A1541BarComMtr[0] ;
         n1541BarComMtr = P029G3_n1541BarComMtr[0] ;
         A2515BarGasEst = P029G3_A2515BarGasEst[0] ;
         n2515BarGasEst = P029G3_n2515BarGasEst[0] ;
         /* Using cursor P029G4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A213BarSit = P029G4_A213BarSit[0] ;
         A4400BarSitEst = P029G4_A4400BarSitEst[0] ;
         A141BarCosPro = P029G4_A141BarCosPro[0] ;
         /* Using cursor P029G6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(3) != 101) )
         {
            A870BarTotMtr = P029G6_A870BarTotMtr[0] ;
            n870BarTotMtr = P029G6_n870BarTotMtr[0] ;
         }
         else
         {
            A870BarTotMtr = DecimalUtil.doubleToDec(0) ;
            n870BarTotMtr = false ;
         }
         /* Using cursor P029G8 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(4) != 101) )
         {
            A184BarMtr = P029G8_A184BarMtr[0] ;
            n184BarMtr = P029G8_n184BarMtr[0] ;
         }
         else
         {
            A184BarMtr = DecimalUtil.doubleToDec(0) ;
            n184BarMtr = false ;
         }
         if ( A870BarTotMtr.doubleValue() != 0 )
         {
            A871RecTotMtr = A870BarTotMtr.add(A184BarMtr) ;
         }
         else
         {
            A871RecTotMtr = A184BarMtr ;
         }
         if ( AV23Opcion == 1 )
         {
            A2070BarFecEst = GXutil.today( ) ;
            n2070BarFecEst = false ;
            A2073BarNumMol = AV19RecMolLin ;
            n2073BarNumMol = false ;
            A2117RecEstAnh = AV20RecEstAnh ;
            n2117RecEstAnh = false ;
            A2122RecEstTMaq = AV21RecEstTMaq ;
            n2122RecEstTMaq = false ;
            A2069BarComEst = httpContext.getMessage( "S", "") ;
            n2069BarComEst = false ;
            A2509BarCodLan = 0 ;
            n2509BarCodLan = false ;
            A2510BarComPri = "" ;
            n2510BarComPri = false ;
            A2131RecObsULin = (byte)(0) ;
            n2131RecObsULin = false ;
            if ( AV17TinEst == 0 )
            {
               if ( A213BarSit != 9 )
               {
                  A213BarSit = (byte)(4) ;
                  if ( AV18PLinea == 1 )
                  {
                     A213BarSit = (byte)(4) ;
                     A4400BarSitEst = (byte)(4) ;
                  }
               }
            }
            else
            {
               A4400BarSitEst = (byte)(4) ;
            }
         }
         else if ( AV23Opcion == 2 )
         {
            A2069BarComEst = httpContext.getMessage( "N", "") ;
            n2069BarComEst = false ;
            if ( A213BarSit != 9 )
            {
               A213BarSit = (byte)(2) ;
            }
            if ( AV18PLinea == 1 )
            {
               if ( A213BarSit != 9 )
               {
                  A213BarSit = (byte)(1) ;
                  A4400BarSitEst = (byte)(2) ;
               }
            }
         }
         else if ( AV23Opcion == 3 )
         {
            AV25GasTotHdr = GXutil.roundDecimal( AV24GasTot.multiply(A1541BarComMtr).divide(A871RecTotMtr, 18, java.math.RoundingMode.DOWN), 2) ;
            A2515BarGasEst = AV25GasTotHdr ;
            n2515BarGasEst = false ;
            A2069BarComEst = httpContext.getMessage( "C", "") ;
            n2069BarComEst = false ;
            if ( A213BarSit != 9 )
            {
               A213BarSit = (byte)(5) ;
               A4400BarSitEst = (byte)(9) ;
            }
            A141BarCosPro = A141BarCosPro.add(AV25GasTotHdr) ;
         }
         /* Using cursor P029G9 */
         pr_default.execute(5, new Object[] {Byte.valueOf(A213BarSit), Byte.valueOf(A4400BarSitEst), A141BarCosPro, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Using cursor P029G10 */
         pr_default.execute(6, new Object[] {Boolean.valueOf(n2070BarFecEst), A2070BarFecEst, Boolean.valueOf(n2073BarNumMol), Short.valueOf(A2073BarNumMol), Boolean.valueOf(n2117RecEstAnh), Short.valueOf(A2117RecEstAnh), Boolean.valueOf(n2122RecEstTMaq), A2122RecEstTMaq, Boolean.valueOf(n2069BarComEst), A2069BarComEst, Boolean.valueOf(n2509BarCodLan), Integer.valueOf(A2509BarCodLan), Boolean.valueOf(n2510BarComPri), A2510BarComPri, Boolean.valueOf(n2131RecObsULin), Byte.valueOf(A2131RecObsULin), Boolean.valueOf(n2515BarGasEst), A2515BarGasEst, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgenagp.this.A396EmprCod;
      this.aP1[0] = pgenagp.this.AV8BarCod;
      this.aP2[0] = pgenagp.this.AV9BarCodReo;
      this.aP3[0] = pgenagp.this.AV10BarCodPar;
      this.aP4[0] = pgenagp.this.AV14DisComLin;
      this.aP5[0] = pgenagp.this.AV15DisComCod;
      this.aP6[0] = pgenagp.this.AV16FonCod;
      this.aP7[0] = pgenagp.this.AV19RecMolLin;
      this.aP8[0] = pgenagp.this.AV20RecEstAnh;
      this.aP9[0] = pgenagp.this.AV21RecEstTMaq;
      this.aP10[0] = pgenagp.this.AV24GasTot;
      this.aP11[0] = pgenagp.this.AV23Opcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "pgenagp");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P029G2_A396EmprCod = new String[] {""} ;
      P029G2_A130BarCodPar = new String[] {""} ;
      P029G2_A132BarCodReo = new byte[1] ;
      P029G2_A129BarCod = new int[1] ;
      P029G2_A122BarAgrPar = new String[] {""} ;
      P029G2_A124BarAgrReo = new byte[1] ;
      P029G2_A119BarAgrCod = new int[1] ;
      A130BarCodPar = "" ;
      A122BarAgrPar = "" ;
      AV13BarAgrPar = "" ;
      P029G3_A396EmprCod = new String[] {""} ;
      P029G3_A1032FonCod = new String[] {""} ;
      P029G3_A1056DisComCod = new String[] {""} ;
      P029G3_A2524DisComLin = new byte[1] ;
      P029G3_A130BarCodPar = new String[] {""} ;
      P029G3_A132BarCodReo = new byte[1] ;
      P029G3_A129BarCod = new int[1] ;
      P029G3_A2070BarFecEst = new java.util.Date[] {GXutil.nullDate()} ;
      P029G3_n2070BarFecEst = new boolean[] {false} ;
      P029G3_A2073BarNumMol = new short[1] ;
      P029G3_n2073BarNumMol = new boolean[] {false} ;
      P029G3_A2117RecEstAnh = new short[1] ;
      P029G3_n2117RecEstAnh = new boolean[] {false} ;
      P029G3_A2122RecEstTMaq = new String[] {""} ;
      P029G3_n2122RecEstTMaq = new boolean[] {false} ;
      P029G3_A2069BarComEst = new String[] {""} ;
      P029G3_n2069BarComEst = new boolean[] {false} ;
      P029G3_A2509BarCodLan = new int[1] ;
      P029G3_n2509BarCodLan = new boolean[] {false} ;
      P029G3_A2510BarComPri = new String[] {""} ;
      P029G3_n2510BarComPri = new boolean[] {false} ;
      P029G3_A2131RecObsULin = new byte[1] ;
      P029G3_n2131RecObsULin = new boolean[] {false} ;
      P029G3_A1541BarComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029G3_n1541BarComMtr = new boolean[] {false} ;
      P029G3_A2515BarGasEst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029G3_n2515BarGasEst = new boolean[] {false} ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      A2070BarFecEst = GXutil.nullDate() ;
      A2122RecEstTMaq = "" ;
      A2069BarComEst = "" ;
      A2510BarComPri = "" ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      A2515BarGasEst = DecimalUtil.ZERO ;
      P029G4_A213BarSit = new byte[1] ;
      P029G4_A4400BarSitEst = new byte[1] ;
      P029G4_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A141BarCosPro = DecimalUtil.ZERO ;
      P029G6_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029G6_n870BarTotMtr = new boolean[] {false} ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      P029G8_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029G8_n184BarMtr = new boolean[] {false} ;
      A184BarMtr = DecimalUtil.ZERO ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      AV25GasTotHdr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgenagp__default(),
         new Object[] {
             new Object[] {
            P029G2_A396EmprCod, P029G2_A130BarCodPar, P029G2_A132BarCodReo, P029G2_A129BarCod, P029G2_A122BarAgrPar, P029G2_A124BarAgrReo, P029G2_A119BarAgrCod
            }
            , new Object[] {
            P029G3_A396EmprCod, P029G3_A1032FonCod, P029G3_A1056DisComCod, P029G3_A2524DisComLin, P029G3_A130BarCodPar, P029G3_A132BarCodReo, P029G3_A129BarCod, P029G3_A2070BarFecEst, P029G3_n2070BarFecEst, P029G3_A2073BarNumMol,
            P029G3_n2073BarNumMol, P029G3_A2117RecEstAnh, P029G3_n2117RecEstAnh, P029G3_A2122RecEstTMaq, P029G3_n2122RecEstTMaq, P029G3_A2069BarComEst, P029G3_n2069BarComEst, P029G3_A2509BarCodLan, P029G3_n2509BarCodLan, P029G3_A2510BarComPri,
            P029G3_n2510BarComPri, P029G3_A2131RecObsULin, P029G3_n2131RecObsULin, P029G3_A1541BarComMtr, P029G3_n1541BarComMtr, P029G3_A2515BarGasEst, P029G3_n2515BarGasEst
            }
            , new Object[] {
            P029G4_A213BarSit, P029G4_A4400BarSitEst, P029G4_A141BarCosPro
            }
            , new Object[] {
            P029G6_A870BarTotMtr, P029G6_n870BarTotMtr
            }
            , new Object[] {
            P029G8_A184BarMtr, P029G8_n184BarMtr
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodReo ;
   private byte AV14DisComLin ;
   private byte AV19RecMolLin ;
   private byte AV23Opcion ;
   private byte AV17TinEst ;
   private byte AV18PLinea ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte AV12BarAgrReo ;
   private byte A2524DisComLin ;
   private byte A2131RecObsULin ;
   private byte A213BarSit ;
   private byte A4400BarSitEst ;
   private short AV20RecEstAnh ;
   private short A2073BarNumMol ;
   private short A2117RecEstAnh ;
   private short Gx_err ;
   private int AV8BarCod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int AV11BarAgrCod ;
   private int A2509BarCodLan ;
   private java.math.BigDecimal AV24GasTot ;
   private java.math.BigDecimal A1541BarComMtr ;
   private java.math.BigDecimal A2515BarGasEst ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A870BarTotMtr ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A871RecTotMtr ;
   private java.math.BigDecimal AV25GasTotHdr ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String AV15DisComCod ;
   private String AV16FonCod ;
   private String AV21RecEstTMaq ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A122BarAgrPar ;
   private String AV13BarAgrPar ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private String A2122RecEstTMaq ;
   private String A2069BarComEst ;
   private String A2510BarComPri ;
   private java.util.Date A2070BarFecEst ;
   private boolean returnInSub ;
   private boolean n2070BarFecEst ;
   private boolean n2073BarNumMol ;
   private boolean n2117RecEstAnh ;
   private boolean n2122RecEstTMaq ;
   private boolean n2069BarComEst ;
   private boolean n2509BarCodLan ;
   private boolean n2510BarComPri ;
   private boolean n2131RecObsULin ;
   private boolean n1541BarComMtr ;
   private boolean n2515BarGasEst ;
   private boolean n870BarTotMtr ;
   private boolean n184BarMtr ;
   private byte[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private byte[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P029G2_A396EmprCod ;
   private String[] P029G2_A130BarCodPar ;
   private byte[] P029G2_A132BarCodReo ;
   private int[] P029G2_A129BarCod ;
   private String[] P029G2_A122BarAgrPar ;
   private byte[] P029G2_A124BarAgrReo ;
   private int[] P029G2_A119BarAgrCod ;
   private String[] P029G3_A396EmprCod ;
   private String[] P029G3_A1032FonCod ;
   private String[] P029G3_A1056DisComCod ;
   private byte[] P029G3_A2524DisComLin ;
   private String[] P029G3_A130BarCodPar ;
   private byte[] P029G3_A132BarCodReo ;
   private int[] P029G3_A129BarCod ;
   private java.util.Date[] P029G3_A2070BarFecEst ;
   private boolean[] P029G3_n2070BarFecEst ;
   private short[] P029G3_A2073BarNumMol ;
   private boolean[] P029G3_n2073BarNumMol ;
   private short[] P029G3_A2117RecEstAnh ;
   private boolean[] P029G3_n2117RecEstAnh ;
   private String[] P029G3_A2122RecEstTMaq ;
   private boolean[] P029G3_n2122RecEstTMaq ;
   private String[] P029G3_A2069BarComEst ;
   private boolean[] P029G3_n2069BarComEst ;
   private int[] P029G3_A2509BarCodLan ;
   private boolean[] P029G3_n2509BarCodLan ;
   private String[] P029G3_A2510BarComPri ;
   private boolean[] P029G3_n2510BarComPri ;
   private byte[] P029G3_A2131RecObsULin ;
   private boolean[] P029G3_n2131RecObsULin ;
   private java.math.BigDecimal[] P029G3_A1541BarComMtr ;
   private boolean[] P029G3_n1541BarComMtr ;
   private java.math.BigDecimal[] P029G3_A2515BarGasEst ;
   private boolean[] P029G3_n2515BarGasEst ;
   private byte[] P029G4_A213BarSit ;
   private byte[] P029G4_A4400BarSitEst ;
   private java.math.BigDecimal[] P029G4_A141BarCosPro ;
   private java.math.BigDecimal[] P029G6_A870BarTotMtr ;
   private boolean[] P029G6_n870BarTotMtr ;
   private java.math.BigDecimal[] P029G8_A184BarMtr ;
   private boolean[] P029G8_n184BarMtr ;
}

final  class pgenagp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P029G2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P029G3", "SELECT EmprCod, FonCod, DisComCod, DisComLin, BarCodPar, BarCodReo, BarCod, BarFecEst, BarNumMol, RecEstAnh, RecEstTMaq, BarComEst, BarCodLan, BarComPri, RecObsULin, BarComMtr, BarGasEst FROM TXPBARCOM WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ?) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P029G4", "SELECT BarSit, BarSitEst, BarCosPro FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P029G6", "SELECT COALESCE( T1.BarTotMtr, 0) AS BarTotMtr FROM (SELECT SUM(MtrAgr) AS BarTotMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P029G8", "SELECT COALESCE( T1.BarMtr, 0) AS BarMtr FROM (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P029G9", "UPDATE TXPBARCAD SET BarSit=?, BarSitEst=?, BarCosPro=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P029G10", "UPDATE TXPBARCOM SET BarFecEst=?, BarNumMol=?, RecEstAnh=?, RecEstTMaq=?, BarComEst=?, BarCodLan=?, BarComPri=?, RecObsULin=?, BarGasEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 12);
               stmt.setString(14, (String)parms[13], 12);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 2);
               }
               stmt.setString(10, (String)parms[18], 3);
               stmt.setInt(11, ((Number) parms[19]).intValue());
               stmt.setByte(12, ((Number) parms[20]).byteValue());
               stmt.setString(13, (String)parms[21], 1);
               stmt.setByte(14, ((Number) parms[22]).byteValue());
               stmt.setString(15, (String)parms[23], 12);
               stmt.setString(16, (String)parms[24], 12);
               return;
      }
   }

}

