package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprdes3 extends GXProcedure
{
   public pprdes3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprdes3.class ), "" );
   }

   public pprdes3( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             short[] aP11 ,
                             byte[] aP12 ,
                             byte[] aP13 ,
                             java.math.BigDecimal[] aP14 ,
                             java.util.Date[] aP15 ,
                             java.util.Date[] aP16 )
   {
      pprdes3.this.aP17 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
      return aP17[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 ,
                        short[] aP11 ,
                        byte[] aP12 ,
                        byte[] aP13 ,
                        java.math.BigDecimal[] aP14 ,
                        java.util.Date[] aP15 ,
                        java.util.Date[] aP16 ,
                        String[] aP17 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             short[] aP11 ,
                             byte[] aP12 ,
                             byte[] aP13 ,
                             java.math.BigDecimal[] aP14 ,
                             java.util.Date[] aP15 ,
                             java.util.Date[] aP16 ,
                             String[] aP17 )
   {
      pprdes3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprdes3.this.A795PrvNum = aP1[0];
      this.aP1 = aP1;
      pprdes3.this.AV30PrdNum = aP2[0];
      this.aP2 = aP2;
      pprdes3.this.AV31PrdNom = aP3[0];
      this.aP3 = aP3;
      pprdes3.this.A6146PrvPAny = aP4[0];
      this.aP4 = aP4;
      pprdes3.this.A6152PrvPNumL = aP5[0];
      this.aP5 = aP5;
      pprdes3.this.AV17Unidades = aP6[0];
      this.aP6 = aP6;
      pprdes3.this.AV15UniOld = aP7[0];
      this.aP7 = aP7;
      pprdes3.this.AV16Precio = aP8[0];
      this.aP8 = aP8;
      pprdes3.this.AV18Prioridad = aP9[0];
      this.aP9 = aP9;
      pprdes3.this.AV24AnyAct = aP10[0];
      this.aP10 = aP10;
      pprdes3.this.AV19AnyAnt = aP11[0];
      this.aP11 = aP11;
      pprdes3.this.AV25MesAct = aP12[0];
      this.aP12 = aP12;
      pprdes3.this.AV20MesAnt = aP13[0];
      this.aP13 = aP13;
      pprdes3.this.AV21PrecAnt = aP14[0];
      this.aP14 = aP14;
      pprdes3.this.AV22FecAct = aP15[0];
      this.aP15 = aP15;
      pprdes3.this.AV23FecAnt = aP16[0];
      this.aP16 = aP16;
      pprdes3.this.Gx_mode = aP17[0];
      this.aP17 = aP17;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPPRVESX

         */
         A6147PrvPPr = AV30PrdNum ;
         A6148PrvPNom = AV31PrdNom ;
         n6148PrvPNom = false ;
         /* Using cursor P02A22 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A6146PrvPAny), A6147PrvPPr, Boolean.valueOf(n6148PrvPNom), A6148PrvPNom});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVESX");
         if ( (pr_default.getStatus(0) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         /*
            INSERT RECORD ON TABLE TXPPRVES1

         */
         if ( GXutil.strcmp(AV18Prioridad, "0") == 0 )
         {
            A6153PrvPEstCp0 = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2) ;
            n6153PrvPEstCp0 = false ;
            A6154PrvPEstCp1 = DecimalUtil.doubleToDec(0) ;
            n6154PrvPEstCp1 = false ;
         }
         else
         {
            A6154PrvPEstCp1 = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2) ;
            n6154PrvPEstCp1 = false ;
            A6153PrvPEstCp0 = DecimalUtil.doubleToDec(0) ;
            n6153PrvPEstCp0 = false ;
         }
         /* Using cursor P02A23 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A6146PrvPAny), A6147PrvPPr, Byte.valueOf(A6152PrvPNumL), Boolean.valueOf(n6153PrvPEstCp0), A6153PrvPEstCp0, Boolean.valueOf(n6154PrvPEstCp1), A6154PrvPEstCp1});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVES1");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P02A24 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A6146PrvPAny), A6147PrvPPr, Byte.valueOf(A6152PrvPNumL)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A396EmprCod = P02A24_A396EmprCod[0] ;
               A795PrvNum = P02A24_A795PrvNum[0] ;
               A6146PrvPAny = P02A24_A6146PrvPAny[0] ;
               A6147PrvPPr = P02A24_A6147PrvPPr[0] ;
               A6152PrvPNumL = P02A24_A6152PrvPNumL[0] ;
               A6153PrvPEstCp0 = P02A24_A6153PrvPEstCp0[0] ;
               n6153PrvPEstCp0 = P02A24_n6153PrvPEstCp0[0] ;
               A6154PrvPEstCp1 = P02A24_A6154PrvPEstCp1[0] ;
               n6154PrvPEstCp1 = P02A24_n6154PrvPEstCp1[0] ;
               if ( GXutil.strcmp(AV18Prioridad, "0") == 0 )
               {
                  A6153PrvPEstCp0 = A6153PrvPEstCp0.add((GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2))) ;
                  n6153PrvPEstCp0 = false ;
               }
               else
               {
                  A6154PrvPEstCp1 = A6154PrvPEstCp1.add((GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2))) ;
                  n6154PrvPEstCp1 = false ;
               }
               /* Using cursor P02A25 */
               pr_default.execute(3, new Object[] {Boolean.valueOf(n6153PrvPEstCp0), A6153PrvPEstCp0, Boolean.valueOf(n6154PrvPEstCp1), A6154PrvPEstCp1, A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A6146PrvPAny), A6147PrvPPr, Byte.valueOf(A6152PrvPNumL)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVES1");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         /*
            INSERT RECORD ON TABLE TXPINSEST

         */
         A719PrdNum = AV30PrdNum ;
         A8366PrdAnyo = A6146PrvPAny ;
         A8360PrdProv = A795PrvNum ;
         /* Using cursor P02A26 */
         pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINSEST");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         /*
            INSERT RECORD ON TABLE TXPINSES1

         */
         A719PrdNum = AV30PrdNum ;
         A8366PrdAnyo = A6146PrvPAny ;
         A8360PrdProv = A795PrvNum ;
         A8363PrdMesL = A6152PrvPNumL ;
         A8364PrdUndCpM = AV17Unidades ;
         A8365PrdUndCnM = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2) ;
         /* Using cursor P02A27 */
         pr_default.execute(5, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv), Byte.valueOf(A8363PrdMesL), A8364PrdUndCpM, A8365PrdUndCnM});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINSES1");
         if ( (pr_default.getStatus(5) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Optimized UPDATE. */
            /* Using cursor P02A28 */
            pr_default.execute(6, new Object[] {AV16Precio, AV17Unidades, AV17Unidades, A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv), Byte.valueOf(A8363PrdMesL)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINSES1");
            /* End optimized UPDATE. */
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         if ( ( !( GXutil.dateCompare(GXutil.resetTime(AV22FecAct), GXutil.resetTime(AV23FecAnt)) ) ) )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A795PrvNum ;
            GXv_char3[0] = AV30PrdNum ;
            GXv_char4[0] = AV31PrdNom ;
            GXv_date5[0] = AV23FecAnt ;
            GXv_int6[0] = A658PedCod ;
            GXv_decimal7[0] = AV15UniOld ;
            GXv_decimal8[0] = AV21PrecAnt ;
            GXv_char9[0] = AV18Prioridad ;
            new app.pacesprx(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_date5, GXv_int6, GXv_decimal7, GXv_decimal8, GXv_char9) ;
            pprdes3.this.A396EmprCod = GXv_char1[0] ;
            pprdes3.this.A795PrvNum = GXv_int2[0] ;
            pprdes3.this.AV30PrdNum = GXv_char3[0] ;
            pprdes3.this.AV31PrdNom = GXv_char4[0] ;
            pprdes3.this.AV23FecAnt = GXv_date5[0] ;
            pprdes3.this.A658PedCod = GXv_int6[0] ;
            pprdes3.this.AV15UniOld = GXv_decimal7[0] ;
            pprdes3.this.AV21PrecAnt = GXv_decimal8[0] ;
            pprdes3.this.AV18Prioridad = GXv_char9[0] ;
            AV27FlagEnc = (byte)(0) ;
            /* Using cursor P02A29 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(AV24AnyAct), Byte.valueOf(AV25MesAct)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A6153PrvPEstCp0 = P02A29_A6153PrvPEstCp0[0] ;
               n6153PrvPEstCp0 = P02A29_n6153PrvPEstCp0[0] ;
               A6154PrvPEstCp1 = P02A29_A6154PrvPEstCp1[0] ;
               n6154PrvPEstCp1 = P02A29_n6154PrvPEstCp1[0] ;
               A6147PrvPPr = P02A29_A6147PrvPPr[0] ;
               AV27FlagEnc = (byte)(1) ;
               if ( GXutil.strcmp(AV18Prioridad, "0") == 0 )
               {
                  A6153PrvPEstCp0 = A6153PrvPEstCp0.add((GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2))) ;
                  n6153PrvPEstCp0 = false ;
               }
               else
               {
                  A6154PrvPEstCp1 = A6154PrvPEstCp1.add((GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2))) ;
                  n6154PrvPEstCp1 = false ;
               }
               /* Using cursor P02A210 */
               pr_default.execute(8, new Object[] {Boolean.valueOf(n6153PrvPEstCp0), A6153PrvPEstCp0, Boolean.valueOf(n6154PrvPEstCp1), A6154PrvPEstCp1, A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A6146PrvPAny), A6147PrvPPr, Byte.valueOf(A6152PrvPNumL)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVES1");
               pr_default.readNext(7);
            }
            pr_default.close(7);
         }
         else
         {
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprdes3.this.A396EmprCod;
      this.aP1[0] = pprdes3.this.A795PrvNum;
      this.aP2[0] = pprdes3.this.AV30PrdNum;
      this.aP3[0] = pprdes3.this.AV31PrdNom;
      this.aP4[0] = pprdes3.this.A6146PrvPAny;
      this.aP5[0] = pprdes3.this.A6152PrvPNumL;
      this.aP6[0] = pprdes3.this.AV17Unidades;
      this.aP7[0] = pprdes3.this.AV15UniOld;
      this.aP8[0] = pprdes3.this.AV16Precio;
      this.aP9[0] = pprdes3.this.AV18Prioridad;
      this.aP10[0] = pprdes3.this.AV24AnyAct;
      this.aP11[0] = pprdes3.this.AV19AnyAnt;
      this.aP12[0] = pprdes3.this.AV25MesAct;
      this.aP13[0] = pprdes3.this.AV20MesAnt;
      this.aP14[0] = pprdes3.this.AV21PrecAnt;
      this.aP15[0] = pprdes3.this.AV22FecAct;
      this.aP16[0] = pprdes3.this.AV23FecAnt;
      this.aP17[0] = pprdes3.this.Gx_mode;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprdes3");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A6147PrvPPr = "" ;
      A6148PrvPNom = "" ;
      Gx_emsg = "" ;
      A6153PrvPEstCp0 = DecimalUtil.ZERO ;
      A6154PrvPEstCp1 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02A24_A396EmprCod = new String[] {""} ;
      P02A24_A795PrvNum = new int[1] ;
      P02A24_A6146PrvPAny = new short[1] ;
      P02A24_A6147PrvPPr = new String[] {""} ;
      P02A24_A6152PrvPNumL = new byte[1] ;
      P02A24_A6153PrvPEstCp0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02A24_n6153PrvPEstCp0 = new boolean[] {false} ;
      P02A24_A6154PrvPEstCp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02A24_n6154PrvPEstCp1 = new boolean[] {false} ;
      A719PrdNum = "" ;
      A8364PrdUndCpM = DecimalUtil.ZERO ;
      A8365PrdUndCnM = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_int6 = new int[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char9 = new String[1] ;
      P02A29_A396EmprCod = new String[] {""} ;
      P02A29_A795PrvNum = new int[1] ;
      P02A29_A6152PrvPNumL = new byte[1] ;
      P02A29_A6146PrvPAny = new short[1] ;
      P02A29_A6153PrvPEstCp0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02A29_n6153PrvPEstCp0 = new boolean[] {false} ;
      P02A29_A6154PrvPEstCp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02A29_n6154PrvPEstCp1 = new boolean[] {false} ;
      P02A29_A6147PrvPPr = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprdes3__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02A24_A396EmprCod, P02A24_A795PrvNum, P02A24_A6146PrvPAny, P02A24_A6147PrvPPr, P02A24_A6152PrvPNumL, P02A24_A6153PrvPEstCp0, P02A24_n6153PrvPEstCp0, P02A24_A6154PrvPEstCp1, P02A24_n6154PrvPEstCp1
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02A29_A396EmprCod, P02A29_A795PrvNum, P02A29_A6152PrvPNumL, P02A29_A6146PrvPAny, P02A29_A6153PrvPEstCp0, P02A29_n6153PrvPEstCp0, P02A29_A6154PrvPEstCp1, P02A29_n6154PrvPEstCp1, P02A29_A6147PrvPPr
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A6152PrvPNumL ;
   private byte AV25MesAct ;
   private byte AV20MesAnt ;
   private byte A8363PrdMesL ;
   private byte AV27FlagEnc ;
   private short A6146PrvPAny ;
   private short AV24AnyAct ;
   private short AV19AnyAnt ;
   private short Gx_err ;
   private short A8366PrdAnyo ;
   private int A795PrvNum ;
   private int GX_INS896 ;
   private int GX_INS897 ;
   private int GX_INS1156 ;
   private int A8360PrdProv ;
   private int GX_INS1157 ;
   private int GXv_int2[] ;
   private int A658PedCod ;
   private int GXv_int6[] ;
   private java.math.BigDecimal AV17Unidades ;
   private java.math.BigDecimal AV15UniOld ;
   private java.math.BigDecimal AV16Precio ;
   private java.math.BigDecimal AV21PrecAnt ;
   private java.math.BigDecimal A6153PrvPEstCp0 ;
   private java.math.BigDecimal A6154PrvPEstCp1 ;
   private java.math.BigDecimal A8364PrdUndCpM ;
   private java.math.BigDecimal A8365PrdUndCnM ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String A396EmprCod ;
   private String AV30PrdNum ;
   private String AV31PrdNom ;
   private String AV18Prioridad ;
   private String Gx_mode ;
   private String A6147PrvPPr ;
   private String A6148PrvPNom ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char9[] ;
   private java.util.Date AV22FecAct ;
   private java.util.Date AV23FecAnt ;
   private java.util.Date GXv_date5[] ;
   private boolean n6148PrvPNom ;
   private boolean n6153PrvPEstCp0 ;
   private boolean n6154PrvPEstCp1 ;
   private String[] aP17 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private byte[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP9 ;
   private short[] aP10 ;
   private short[] aP11 ;
   private byte[] aP12 ;
   private byte[] aP13 ;
   private java.math.BigDecimal[] aP14 ;
   private java.util.Date[] aP15 ;
   private java.util.Date[] aP16 ;
   private IDataStoreProvider pr_default ;
   private String[] P02A24_A396EmprCod ;
   private int[] P02A24_A795PrvNum ;
   private short[] P02A24_A6146PrvPAny ;
   private String[] P02A24_A6147PrvPPr ;
   private byte[] P02A24_A6152PrvPNumL ;
   private java.math.BigDecimal[] P02A24_A6153PrvPEstCp0 ;
   private boolean[] P02A24_n6153PrvPEstCp0 ;
   private java.math.BigDecimal[] P02A24_A6154PrvPEstCp1 ;
   private boolean[] P02A24_n6154PrvPEstCp1 ;
   private String[] P02A29_A396EmprCod ;
   private int[] P02A29_A795PrvNum ;
   private byte[] P02A29_A6152PrvPNumL ;
   private short[] P02A29_A6146PrvPAny ;
   private java.math.BigDecimal[] P02A29_A6153PrvPEstCp0 ;
   private boolean[] P02A29_n6153PrvPEstCp0 ;
   private java.math.BigDecimal[] P02A29_A6154PrvPEstCp1 ;
   private boolean[] P02A29_n6154PrvPEstCp1 ;
   private String[] P02A29_A6147PrvPPr ;
}

final  class pprdes3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02A22", "INSERT INTO TXPPRVESX(EmprCod, PrvNum, PrvPAny, PrvPPr, PrvPNom) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRVESX")
         ,new UpdateCursor("P02A23", "INSERT INTO TXPPRVES1(EmprCod, PrvNum, PrvPAny, PrvPPr, PrvPNumL, PrvPEstCp0, PrvPEstCp1, PrvPDvMes) VALUES(?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRVES1")
         ,new ForEachCursor("P02A24", "SELECT EmprCod, PrvNum, PrvPAny, PrvPPr, PrvPNumL, PrvPEstCp0, PrvPEstCp1 FROM TXPPRVES1 WHERE EmprCod = ? and PrvNum = ? and PrvPAny = ? and PrvPPr = ? and PrvPNumL = ? ORDER BY EmprCod, PrvNum, PrvPAny, PrvPPr, PrvPNumL ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02A25", "UPDATE TXPPRVES1 SET PrvPEstCp0=?, PrvPEstCp1=?  WHERE EmprCod = ? AND PrvNum = ? AND PrvPAny = ? AND PrvPPr = ? AND PrvPNumL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRVES1")
         ,new UpdateCursor("P02A26", "INSERT INTO TXPINSEST(EmprCod, PrdNum, PrdAnyo, PrdProv) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINSEST")
         ,new UpdateCursor("P02A27", "INSERT INTO TXPINSES1(EmprCod, PrdNum, PrdAnyo, PrdProv, PrdMesL, PrdUndCpM, PrdUndCnM) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINSES1")
         ,new UpdateCursor("P02A28", "UPDATE TXPINSES1 SET PrdUndCnM=PrdUndCnM + ( ROUND(? * CAST(? AS NUMERIC(24,10)), 2)), PrdUndCpM=PrdUndCpM + ?  WHERE EmprCod = ? and PrdNum = ? and PrdAnyo = ? and PrdProv = ? and PrdMesL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINSES1")
         ,new ForEachCursor("P02A29", "SELECT EmprCod, PrvNum, PrvPNumL, PrvPAny, PrvPEstCp0, PrvPEstCp1, PrvPPr FROM TXPPRVES1 WHERE (EmprCod = ? and PrvNum = ? and PrvPAny = ?) AND (PrvPNumL = ?) ORDER BY EmprCod, PrvNum, PrvPAny ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02A210", "UPDATE TXPPRVES1 SET PrvPEstCp0=?, PrvPEstCp1=?  WHERE EmprCod = ? AND PrvNum = ? AND PrvPAny = ? AND PrvPPr = ? AND PrvPNumL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRVES1")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 26);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setString(6, (String)parms[7], 6);
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setString(6, (String)parms[7], 6);
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               return;
      }
   }

}

