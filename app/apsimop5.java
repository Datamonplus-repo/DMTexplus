package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsimop5 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsimop5 pgm = new apsimop5 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      byte[] aP2 = new byte[] {0};
      String[] aP3 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (byte) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3);
   }

   public apsimop5( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsimop5.class ), "" );
   }

   public apsimop5( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      apsimop5.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      apsimop5.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apsimop5.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      apsimop5.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      apsimop5.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Actualizando FD en BARFAS...", "") );
      /* Using cursor P02RA3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A155BarFecCli = P02RA3_A155BarFecCli[0] ;
         A217BarTipArt = P02RA3_A217BarTipArt[0] ;
         n217BarTipArt = P02RA3_n217BarTipArt[0] ;
         A157BarFecEnt = P02RA3_A157BarFecEnt[0] ;
         A199BarPie1 = P02RA3_A199BarPie1[0] ;
         A365DisDes = P02RA3_A365DisDes[0] ;
         A898BarPieNDes = P02RA3_A898BarPieNDes[0] ;
         A199BarPie1 = P02RA3_A199BarPie1[0] ;
         A898BarPieNDes = P02RA3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV8Emprcod = A396EmprCod ;
         AV9BarFeCCli = A155BarFecCli ;
         AV10BarPie = A198BarPie ;
         AV11barTipArt = A217BarTipArt ;
         /* Execute user subroutine: 'TIPART' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV16resto = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P02RA4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A457FasCod = P02RA4_A457FasCod[0] ;
            A7912Barfastpp = P02RA4_A7912Barfastpp[0] ;
            n7912Barfastpp = P02RA4_n7912Barfastpp[0] ;
            A6879FasTpp = P02RA4_A6879FasTpp[0] ;
            n6879FasTpp = P02RA4_n6879FasTpp[0] ;
            A7071Tip_CodFas = P02RA4_A7071Tip_CodFas[0] ;
            n7071Tip_CodFas = P02RA4_n7071Tip_CodFas[0] ;
            A603MaqCodBis = P02RA4_A603MaqCodBis[0] ;
            A162BarFecTeo = P02RA4_A162BarFecTeo[0] ;
            A5999BarFasCR = P02RA4_A5999BarFasCR[0] ;
            A5719BarFasKgT = P02RA4_A5719BarFasKgT[0] ;
            n5719BarFasKgT = P02RA4_n5719BarFasKgT[0] ;
            A194BarOrdLin = P02RA4_A194BarOrdLin[0] ;
            A758ProCod = P02RA4_A758ProCod[0] ;
            A6879FasTpp = P02RA4_A6879FasTpp[0] ;
            n6879FasTpp = P02RA4_n6879FasTpp[0] ;
            A7071Tip_CodFas = P02RA4_A7071Tip_CodFas[0] ;
            n7071Tip_CodFas = P02RA4_n7071Tip_CodFas[0] ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A7912Barfastpp)==0) )
            {
               AV19BarFastpp = A7912Barfastpp ;
            }
            else
            {
               AV19BarFastpp = A6879FasTpp ;
            }
            AV14TIP_CODFAS = A7071Tip_CodFas ;
            /* Execute user subroutine: 'NUMOPE' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            GXv_char1[0] = AV8Emprcod ;
            GXv_decimal2[0] = AV12TipArtProd ;
            GXv_date3[0] = AV9BarFeCCli ;
            GXv_char4[0] = A603MaqCodBis ;
            GXv_decimal5[0] = AV15NUM_OPE ;
            GXv_decimal6[0] = AV19BarFastpp ;
            GXv_date7[0] = AV13BarFecTeo ;
            GXv_decimal8[0] = AV16resto ;
            GXv_int9[0] = AV10BarPie ;
            GXv_decimal10[0] = AV17Min_r ;
            GXv_decimal11[0] = AV18Dias ;
            new app.psimop2(remoteHandle, context).execute( GXv_char1, GXv_decimal2, GXv_date3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_date7, GXv_decimal8, GXv_int9, GXv_decimal10, GXv_decimal11) ;
            apsimop5.this.AV8Emprcod = GXv_char1[0] ;
            apsimop5.this.AV12TipArtProd = GXv_decimal2[0] ;
            apsimop5.this.AV9BarFeCCli = GXv_date3[0] ;
            apsimop5.this.A603MaqCodBis = GXv_char4[0] ;
            apsimop5.this.AV15NUM_OPE = GXv_decimal5[0] ;
            apsimop5.this.AV19BarFastpp = GXv_decimal6[0] ;
            apsimop5.this.AV13BarFecTeo = GXv_date7[0] ;
            apsimop5.this.AV16resto = GXv_decimal8[0] ;
            apsimop5.this.AV10BarPie = GXv_int9[0] ;
            apsimop5.this.AV17Min_r = GXv_decimal10[0] ;
            apsimop5.this.AV18Dias = GXv_decimal11[0] ;
            A162BarFecTeo = AV13BarFecTeo ;
            A5999BarFasCR = AV17Min_r ;
            A5719BarFasKgT = AV18Dias ;
            n5719BarFasKgT = false ;
            /* Using cursor P02RA5 */
            pr_default.execute(2, new Object[] {A162BarFecTeo, A5999BarFasCR, Boolean.valueOf(n5719BarFasKgT), A5719BarFasKgT, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A157BarFecEnt = GXutil.nullDate() ;
         /* Using cursor P02RA6 */
         pr_default.execute(3, new Object[] {A157BarFecEnt, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Actualizando FD en BARFAS...", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV12TipArtProd = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02RA7 */
      pr_default.execute(4, new Object[] {AV8Emprcod, Short.valueOf(AV11barTipArt)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A829TipArtCod = P02RA7_A829TipArtCod[0] ;
         A7078TipArtProd = P02RA7_A7078TipArtProd[0] ;
         n7078TipArtProd = P02RA7_n7078TipArtProd[0] ;
         AV12TipArtProd = A7078TipArtProd ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S121( )
   {
      /* 'NUMOPE' Routine */
      returnInSub = false ;
      AV15NUM_OPE = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02RA8 */
      pr_default.execute(5, new Object[] {AV8Emprcod, Short.valueOf(AV14TIP_CODFAS)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A7071Tip_CodFas = P02RA8_A7071Tip_CodFas[0] ;
         n7071Tip_CodFas = P02RA8_n7071Tip_CodFas[0] ;
         A7075Max_Uni = P02RA8_A7075Max_Uni[0] ;
         n7075Max_Uni = P02RA8_n7075Max_Uni[0] ;
         A7076Min_Uni = P02RA8_A7076Min_Uni[0] ;
         n7076Min_Uni = P02RA8_n7076Min_Uni[0] ;
         A7077Num_ope = P02RA8_A7077Num_ope[0] ;
         n7077Num_ope = P02RA8_n7077Num_ope[0] ;
         A7074Lin_nop = P02RA8_A7074Lin_nop[0] ;
         if ( ( AV10BarPie >= A7076Min_Uni ) && ( AV10BarPie <= A7075Max_Uni ) )
         {
            AV15NUM_OPE = A7077Num_ope ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(psimop5.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apsimop5.this.A396EmprCod;
      this.aP1[0] = apsimop5.this.A129BarCod;
      this.aP2[0] = apsimop5.this.A132BarCodReo;
      this.aP3[0] = apsimop5.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "apsimop5");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P02RA3_A396EmprCod = new String[] {""} ;
      P02RA3_A129BarCod = new int[1] ;
      P02RA3_A132BarCodReo = new byte[1] ;
      P02RA3_A130BarCodPar = new String[] {""} ;
      P02RA3_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P02RA3_A217BarTipArt = new short[1] ;
      P02RA3_n217BarTipArt = new boolean[] {false} ;
      P02RA3_A157BarFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P02RA3_A199BarPie1 = new short[1] ;
      P02RA3_A365DisDes = new String[] {""} ;
      P02RA3_A898BarPieNDes = new int[1] ;
      A155BarFecCli = GXutil.nullDate() ;
      A157BarFecEnt = GXutil.nullDate() ;
      A365DisDes = "" ;
      AV8Emprcod = "" ;
      AV9BarFeCCli = GXutil.nullDate() ;
      AV16resto = DecimalUtil.ZERO ;
      P02RA4_A457FasCod = new String[] {""} ;
      P02RA4_A396EmprCod = new String[] {""} ;
      P02RA4_A129BarCod = new int[1] ;
      P02RA4_A132BarCodReo = new byte[1] ;
      P02RA4_A130BarCodPar = new String[] {""} ;
      P02RA4_A7912Barfastpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RA4_n7912Barfastpp = new boolean[] {false} ;
      P02RA4_A6879FasTpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RA4_n6879FasTpp = new boolean[] {false} ;
      P02RA4_A7071Tip_CodFas = new short[1] ;
      P02RA4_n7071Tip_CodFas = new boolean[] {false} ;
      P02RA4_A603MaqCodBis = new String[] {""} ;
      P02RA4_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      P02RA4_A5999BarFasCR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RA4_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RA4_n5719BarFasKgT = new boolean[] {false} ;
      P02RA4_A194BarOrdLin = new short[1] ;
      P02RA4_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A7912Barfastpp = DecimalUtil.ZERO ;
      A6879FasTpp = DecimalUtil.ZERO ;
      A603MaqCodBis = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      A5999BarFasCR = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      AV19BarFastpp = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      AV12TipArtProd = DecimalUtil.ZERO ;
      GXv_decimal2 = new java.math.BigDecimal[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_char4 = new String[1] ;
      AV15NUM_OPE = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV13BarFecTeo = GXutil.nullDate() ;
      GXv_date7 = new java.util.Date[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int9 = new int[1] ;
      AV17Min_r = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV18Dias = DecimalUtil.ZERO ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      P02RA7_A829TipArtCod = new short[1] ;
      P02RA7_A396EmprCod = new String[] {""} ;
      P02RA7_A7078TipArtProd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RA7_n7078TipArtProd = new boolean[] {false} ;
      A7078TipArtProd = DecimalUtil.ZERO ;
      P02RA8_A7071Tip_CodFas = new short[1] ;
      P02RA8_n7071Tip_CodFas = new boolean[] {false} ;
      P02RA8_A396EmprCod = new String[] {""} ;
      P02RA8_A7075Max_Uni = new short[1] ;
      P02RA8_n7075Max_Uni = new boolean[] {false} ;
      P02RA8_A7076Min_Uni = new short[1] ;
      P02RA8_n7076Min_Uni = new boolean[] {false} ;
      P02RA8_A7077Num_ope = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RA8_n7077Num_ope = new boolean[] {false} ;
      P02RA8_A7074Lin_nop = new short[1] ;
      A7077Num_ope = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apsimop5__default(),
         new Object[] {
             new Object[] {
            P02RA3_A396EmprCod, P02RA3_A129BarCod, P02RA3_A132BarCodReo, P02RA3_A130BarCodPar, P02RA3_A155BarFecCli, P02RA3_A217BarTipArt, P02RA3_n217BarTipArt, P02RA3_A157BarFecEnt, P02RA3_A199BarPie1, P02RA3_A365DisDes,
            P02RA3_A898BarPieNDes
            }
            , new Object[] {
            P02RA4_A457FasCod, P02RA4_A396EmprCod, P02RA4_A129BarCod, P02RA4_A132BarCodReo, P02RA4_A130BarCodPar, P02RA4_A7912Barfastpp, P02RA4_n7912Barfastpp, P02RA4_A6879FasTpp, P02RA4_n6879FasTpp, P02RA4_A7071Tip_CodFas,
            P02RA4_n7071Tip_CodFas, P02RA4_A603MaqCodBis, P02RA4_A162BarFecTeo, P02RA4_A5999BarFasCR, P02RA4_A5719BarFasKgT, P02RA4_n5719BarFasKgT, P02RA4_A194BarOrdLin, P02RA4_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02RA7_A829TipArtCod, P02RA7_A396EmprCod, P02RA7_A7078TipArtProd, P02RA7_n7078TipArtProd
            }
            , new Object[] {
            P02RA8_A7071Tip_CodFas, P02RA8_A396EmprCod, P02RA8_A7075Max_Uni, P02RA8_n7075Max_Uni, P02RA8_A7076Min_Uni, P02RA8_n7076Min_Uni, P02RA8_A7077Num_ope, P02RA8_n7077Num_ope, P02RA8_A7074Lin_nop
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A217BarTipArt ;
   private short A199BarPie1 ;
   private short AV11barTipArt ;
   private short A7071Tip_CodFas ;
   private short A194BarOrdLin ;
   private short AV14TIP_CODFAS ;
   private short A829TipArtCod ;
   private short A7075Max_Uni ;
   private short A7076Min_Uni ;
   private short A7074Lin_nop ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV10BarPie ;
   private int GXv_int9[] ;
   private java.math.BigDecimal AV16resto ;
   private java.math.BigDecimal A7912Barfastpp ;
   private java.math.BigDecimal A6879FasTpp ;
   private java.math.BigDecimal A5999BarFasCR ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal AV19BarFastpp ;
   private java.math.BigDecimal AV12TipArtProd ;
   private java.math.BigDecimal GXv_decimal2[] ;
   private java.math.BigDecimal AV15NUM_OPE ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV17Min_r ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV18Dias ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal A7078TipArtProd ;
   private java.math.BigDecimal A7077Num_ope ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A365DisDes ;
   private String AV8Emprcod ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String A758ProCod ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A157BarFecEnt ;
   private java.util.Date AV9BarFeCCli ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date GXv_date3[] ;
   private java.util.Date AV13BarFecTeo ;
   private java.util.Date GXv_date7[] ;
   private boolean n217BarTipArt ;
   private boolean returnInSub ;
   private boolean n7912Barfastpp ;
   private boolean n6879FasTpp ;
   private boolean n7071Tip_CodFas ;
   private boolean n5719BarFasKgT ;
   private boolean n7078TipArtProd ;
   private boolean n7075Max_Uni ;
   private boolean n7076Min_Uni ;
   private boolean n7077Num_ope ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02RA3_A396EmprCod ;
   private int[] P02RA3_A129BarCod ;
   private byte[] P02RA3_A132BarCodReo ;
   private String[] P02RA3_A130BarCodPar ;
   private java.util.Date[] P02RA3_A155BarFecCli ;
   private short[] P02RA3_A217BarTipArt ;
   private boolean[] P02RA3_n217BarTipArt ;
   private java.util.Date[] P02RA3_A157BarFecEnt ;
   private short[] P02RA3_A199BarPie1 ;
   private String[] P02RA3_A365DisDes ;
   private int[] P02RA3_A898BarPieNDes ;
   private String[] P02RA4_A457FasCod ;
   private String[] P02RA4_A396EmprCod ;
   private int[] P02RA4_A129BarCod ;
   private byte[] P02RA4_A132BarCodReo ;
   private String[] P02RA4_A130BarCodPar ;
   private java.math.BigDecimal[] P02RA4_A7912Barfastpp ;
   private boolean[] P02RA4_n7912Barfastpp ;
   private java.math.BigDecimal[] P02RA4_A6879FasTpp ;
   private boolean[] P02RA4_n6879FasTpp ;
   private short[] P02RA4_A7071Tip_CodFas ;
   private boolean[] P02RA4_n7071Tip_CodFas ;
   private String[] P02RA4_A603MaqCodBis ;
   private java.util.Date[] P02RA4_A162BarFecTeo ;
   private java.math.BigDecimal[] P02RA4_A5999BarFasCR ;
   private java.math.BigDecimal[] P02RA4_A5719BarFasKgT ;
   private boolean[] P02RA4_n5719BarFasKgT ;
   private short[] P02RA4_A194BarOrdLin ;
   private String[] P02RA4_A758ProCod ;
   private short[] P02RA7_A829TipArtCod ;
   private String[] P02RA7_A396EmprCod ;
   private java.math.BigDecimal[] P02RA7_A7078TipArtProd ;
   private boolean[] P02RA7_n7078TipArtProd ;
   private short[] P02RA8_A7071Tip_CodFas ;
   private boolean[] P02RA8_n7071Tip_CodFas ;
   private String[] P02RA8_A396EmprCod ;
   private short[] P02RA8_A7075Max_Uni ;
   private boolean[] P02RA8_n7075Max_Uni ;
   private short[] P02RA8_A7076Min_Uni ;
   private boolean[] P02RA8_n7076Min_Uni ;
   private java.math.BigDecimal[] P02RA8_A7077Num_ope ;
   private boolean[] P02RA8_n7077Num_ope ;
   private short[] P02RA8_A7074Lin_nop ;
}

final  class apsimop5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02RA3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFecCli, T1.BarTipArt, T1.BarFecEnt, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02RA4", "SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.Barfastpp, T2.FasTpp, T2.Tip_CodFas, T1.MaqCodBis, T1.BarFecTeo, T1.BarFasCR, T1.BarFasKgT, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02RA5", "UPDATE TXPBARFAS SET BarFecTeo=?, BarFasCR=?, BarFasKgT=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P02RA6", "UPDATE TXPBARCAD SET BarFecEnt=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P02RA7", "SELECT TipArtCod, EmprCod, TipArtProd FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02RA8", "SELECT Tip_CodFas, EmprCod, Max_Uni, Min_Uni, Num_ope, Lin_nop FROM TXPNUMOPE WHERE EmprCod = ? and Tip_CodFas = ? ORDER BY EmprCod, Tip_CodFas, Lin_nop ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 8);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
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
               return;
            case 2 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 1);
               stmt.setString(8, (String)parms[8], 8);
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               return;
            case 3 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

