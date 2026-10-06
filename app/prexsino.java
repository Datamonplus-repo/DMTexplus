package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prexsino extends GXProcedure
{
   public prexsino( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prexsino.class ), "" );
   }

   public prexsino( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      prexsino.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      prexsino.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prexsino.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      prexsino.this.AV9BarCodReo = aP2[0];
      this.aP2 = aP2;
      prexsino.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      prexsino.this.AV11SiNo = aP4[0];
      this.aP4 = aP4;
      prexsino.this.AV12SiNoold = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ( GXutil.strcmp(AV12SiNoold, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV11SiNo, httpContext.getMessage( "N", "")) == 0 ) )
      {
         /* Optimized DELETE. */
         /* Using cursor P024X2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
         /* End optimized DELETE. */
         /* Using cursor P024X3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P024X3_A130BarCodPar[0] ;
            A132BarCodReo = P024X3_A132BarCodReo[0] ;
            A129BarCod = P024X3_A129BarCod[0] ;
            A148BarEstReo = P024X3_A148BarEstReo[0] ;
            A833TipDefCod = P024X3_A833TipDefCod[0] ;
            n833TipDefCod = P024X3_n833TipDefCod[0] ;
            A361DisCod = P024X3_A361DisCod[0] ;
            A148BarEstReo = (byte)(0) ;
            A833TipDefCod = (short)(0) ;
            n833TipDefCod = false ;
            AV13DisCod = A361DisCod ;
            /* Using cursor P024X4 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A148BarEstReo), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Using cursor P024X5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV13DisCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A361DisCod = P024X5_A361DisCod[0] ;
            A595Kilos = P024X5_A595Kilos[0] ;
            A44AlbRecCod = P024X5_A44AlbRecCod[0] ;
            AV14AlbReccod = A44AlbRecCod ;
            /* Execute user subroutine: 'ALBREC' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Optimized DELETE. */
         /* Using cursor P024X6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV13DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
         /* End optimized DELETE. */
      }
      if ( ( GXutil.strcmp(AV12SiNoold, httpContext.getMessage( "N", "")) == 0 ) && ( GXutil.strcmp(AV11SiNo, httpContext.getMessage( "S", "")) == 0 ) )
      {
         /* Using cursor P024X7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A130BarCodPar = P024X7_A130BarCodPar[0] ;
            A132BarCodReo = P024X7_A132BarCodReo[0] ;
            A129BarCod = P024X7_A129BarCod[0] ;
            A361DisCod = P024X7_A361DisCod[0] ;
            A217BarTipArt = P024X7_A217BarTipArt[0] ;
            n217BarTipArt = P024X7_n217BarTipArt[0] ;
            A212BarSer = P024X7_A212BarSer[0] ;
            A135BarColNom = P024X7_A135BarColNom[0] ;
            A136BarColNum = P024X7_A136BarColNum[0] ;
            A218BarTipCol = P024X7_A218BarTipCol[0] ;
            A252CliCod = P024X7_A252CliCod[0] ;
            n252CliCod = P024X7_n252CliCod[0] ;
            A1652BarSerDsc = P024X7_A1652BarSerDsc[0] ;
            A148BarEstReo = P024X7_A148BarEstReo[0] ;
            AV13DisCod = A361DisCod ;
            AV15BarTipArt = A217BarTipArt ;
            AV16BarSer = A212BarSer ;
            AV17BarColNom = A135BarColNom ;
            AV18BarColNUm = A136BarColNum ;
            AV19BarTipCol = A218BarTipCol ;
            AV21CliCod = A252CliCod ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A129BarCod ;
            GXv_int3[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_decimal5[0] = AV22BarKgm ;
            GXv_int6[0] = AV20BarPiePie ;
            new app.pkgpzhd(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_decimal5, GXv_int6) ;
            prexsino.this.A396EmprCod = GXv_char1[0] ;
            prexsino.this.A129BarCod = GXv_int2[0] ;
            prexsino.this.A132BarCodReo = GXv_int3[0] ;
            prexsino.this.A130BarCodPar = GXv_char4[0] ;
            prexsino.this.AV22BarKgm = GXv_decimal5[0] ;
            prexsino.this.AV20BarPiePie = GXv_int6[0] ;
            AV23BarSerDsc = A1652BarSerDsc ;
            A148BarEstReo = (byte)(2) ;
            /* Using cursor P024X8 */
            pr_default.execute(6, new Object[] {Byte.valueOf(A148BarEstReo), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         /* Execute user subroutine: 'HISREO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'HISREO' Routine */
      returnInSub = false ;
      /* Using cursor P024X9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV13DisCod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A319DefPor = P024X9_A319DefPor[0] ;
         A833TipDefCod = P024X9_A833TipDefCod[0] ;
         n833TipDefCod = P024X9_n833TipDefCod[0] ;
         A361DisCod = P024X9_A361DisCod[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPHISREO

         */
         W396EmprCod = A396EmprCod ;
         W833TipDefCod = A833TipDefCod ;
         n833TipDefCod = false ;
         W252CliCod = A252CliCod ;
         n252CliCod = false ;
         W602MaqCod = A602MaqCod ;
         n602MaqCod = false ;
         A539HisBarCod = AV8BarCod ;
         A545HisCodReo = AV9BarCodReo ;
         A544HisCodPar = AV10BarCodPar ;
         n833TipDefCod = false ;
         A571HisTipArt = AV15BarTipArt ;
         n571HisTipArt = false ;
         A252CliCod = AV21CliCod ;
         n252CliCod = false ;
         A542HisBarSer = AV16BarSer ;
         n542HisBarSer = false ;
         A546HisColNom = AV17BarColNom ;
         n546HisColNom = false ;
         A547HisColNum = AV18BarColNUm ;
         n547HisColNum = false ;
         A572HisTipCol = AV19BarTipCol ;
         n572HisTipCol = false ;
         A553HisNumPie = (short)(AV20BarPiePie) ;
         n553HisNumPie = false ;
         A540HisBarKgm = AV22BarKgm.multiply(DecimalUtil.doubleToDec(A319DefPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         n540HisBarKgm = false ;
         A541HisBarMtr = DecimalUtil.doubleToDec(0) ;
         n541HisBarMtr = false ;
         A569HisReoFec = GXutil.today( ) ;
         n569HisReoFec = false ;
         A549HisKgmOri = AV22BarKgm ;
         n549HisKgmOri = false ;
         A552HisMtrOri = DecimalUtil.doubleToDec(0) ;
         n552HisMtrOri = false ;
         A554HisOrdReo = (byte)(0) ;
         n554HisOrdReo = false ;
         A548HisEstReo = (byte)(2) ;
         n548HisEstReo = false ;
         A602MaqCod = GXutil.space( (short)(6)) ;
         n602MaqCod = false ;
         A2297HisReoTn = 0 ;
         n2297HisReoTn = false ;
         A2299HisReoDsc = AV23BarSerDsc ;
         n2299HisReoDsc = false ;
         A5356Hisoperar = 0 ;
         n5356Hisoperar = false ;
         A5085CodCausa = (short)(0) ;
         n5085CodCausa = false ;
         /* Using cursor P024X10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod), Boolean.valueOf(n571HisTipArt), Short.valueOf(A571HisTipArt), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n542HisBarSer), A542HisBarSer, Boolean.valueOf(n546HisColNom), A546HisColNom, Boolean.valueOf(n547HisColNum), Integer.valueOf(A547HisColNum), Boolean.valueOf(n572HisTipCol), Byte.valueOf(A572HisTipCol), Boolean.valueOf(n553HisNumPie), Short.valueOf(A553HisNumPie), Boolean.valueOf(n540HisBarKgm), A540HisBarKgm, Boolean.valueOf(n541HisBarMtr), A541HisBarMtr, Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n569HisReoFec), A569HisReoFec, Boolean.valueOf(n549HisKgmOri), A549HisKgmOri, Boolean.valueOf(n552HisMtrOri), A552HisMtrOri, Boolean.valueOf(n554HisOrdReo), Byte.valueOf(A554HisOrdReo), Boolean.valueOf(n548HisEstReo), Byte.valueOf(A548HisEstReo), Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn), Boolean.valueOf(n2299HisReoDsc), A2299HisReoDsc, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa), Boolean.valueOf(n5356Hisoperar), Integer.valueOf(A5356Hisoperar)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
         if ( (pr_default.getStatus(8) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A833TipDefCod = W833TipDefCod ;
         n833TipDefCod = false ;
         A252CliCod = W252CliCod ;
         n252CliCod = false ;
         A602MaqCod = W602MaqCod ;
         n602MaqCod = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S121( )
   {
      /* 'ALBREC' Routine */
      returnInSub = false ;
      /* Using cursor P024X11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV14AlbReccod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A44AlbRecCod = P024X11_A44AlbRecCod[0] ;
         A55AlbRReo = P024X11_A55AlbRReo[0] ;
         A55AlbRReo = httpContext.getMessage( "NO", "") ;
         /* Using cursor P024X12 */
         pr_default.execute(10, new Object[] {A55AlbRReo, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP0[0] = prexsino.this.A396EmprCod;
      this.aP1[0] = prexsino.this.AV8BarCod;
      this.aP2[0] = prexsino.this.AV9BarCodReo;
      this.aP3[0] = prexsino.this.AV10BarCodPar;
      this.aP4[0] = prexsino.this.AV11SiNo;
      this.aP5[0] = prexsino.this.AV12SiNoold;
      Application.commitDataStores(context, remoteHandle, pr_default, "prexsino");
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
      P024X3_A396EmprCod = new String[] {""} ;
      P024X3_A130BarCodPar = new String[] {""} ;
      P024X3_A132BarCodReo = new byte[1] ;
      P024X3_A129BarCod = new int[1] ;
      P024X3_A148BarEstReo = new byte[1] ;
      P024X3_A833TipDefCod = new short[1] ;
      P024X3_n833TipDefCod = new boolean[] {false} ;
      P024X3_A361DisCod = new int[1] ;
      A130BarCodPar = "" ;
      P024X5_A396EmprCod = new String[] {""} ;
      P024X5_A361DisCod = new int[1] ;
      P024X5_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P024X5_A44AlbRecCod = new int[1] ;
      A595Kilos = DecimalUtil.ZERO ;
      P024X7_A396EmprCod = new String[] {""} ;
      P024X7_A130BarCodPar = new String[] {""} ;
      P024X7_A132BarCodReo = new byte[1] ;
      P024X7_A129BarCod = new int[1] ;
      P024X7_A361DisCod = new int[1] ;
      P024X7_A217BarTipArt = new short[1] ;
      P024X7_n217BarTipArt = new boolean[] {false} ;
      P024X7_A212BarSer = new String[] {""} ;
      P024X7_A135BarColNom = new String[] {""} ;
      P024X7_A136BarColNum = new int[1] ;
      P024X7_A218BarTipCol = new byte[1] ;
      P024X7_A252CliCod = new int[1] ;
      P024X7_n252CliCod = new boolean[] {false} ;
      P024X7_A1652BarSerDsc = new String[] {""} ;
      P024X7_A148BarEstReo = new byte[1] ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      AV16BarSer = "" ;
      AV17BarColNom = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      AV22BarKgm = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_int6 = new int[1] ;
      AV23BarSerDsc = "" ;
      P024X9_A396EmprCod = new String[] {""} ;
      P024X9_A319DefPor = new short[1] ;
      P024X9_A833TipDefCod = new short[1] ;
      P024X9_n833TipDefCod = new boolean[] {false} ;
      P024X9_A361DisCod = new int[1] ;
      W396EmprCod = "" ;
      W602MaqCod = "" ;
      A602MaqCod = "" ;
      A544HisCodPar = "" ;
      A542HisBarSer = "" ;
      A546HisColNom = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A569HisReoFec = GXutil.nullDate() ;
      A549HisKgmOri = DecimalUtil.ZERO ;
      A552HisMtrOri = DecimalUtil.ZERO ;
      A2299HisReoDsc = "" ;
      Gx_emsg = "" ;
      P024X11_A396EmprCod = new String[] {""} ;
      P024X11_A44AlbRecCod = new int[1] ;
      P024X11_A55AlbRReo = new String[] {""} ;
      A55AlbRReo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prexsino__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P024X3_A396EmprCod, P024X3_A130BarCodPar, P024X3_A132BarCodReo, P024X3_A129BarCod, P024X3_A148BarEstReo, P024X3_A833TipDefCod, P024X3_n833TipDefCod, P024X3_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            P024X5_A396EmprCod, P024X5_A361DisCod, P024X5_A595Kilos, P024X5_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            P024X7_A396EmprCod, P024X7_A130BarCodPar, P024X7_A132BarCodReo, P024X7_A129BarCod, P024X7_A361DisCod, P024X7_A217BarTipArt, P024X7_n217BarTipArt, P024X7_A212BarSer, P024X7_A135BarColNom, P024X7_A136BarColNum,
            P024X7_A218BarTipCol, P024X7_A252CliCod, P024X7_n252CliCod, P024X7_A1652BarSerDsc, P024X7_A148BarEstReo
            }
            , new Object[] {
            }
            , new Object[] {
            P024X9_A396EmprCod, P024X9_A319DefPor, P024X9_A833TipDefCod, P024X9_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            P024X11_A396EmprCod, P024X11_A44AlbRecCod, P024X11_A55AlbRReo
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodReo ;
   private byte A132BarCodReo ;
   private byte A148BarEstReo ;
   private byte A218BarTipCol ;
   private byte AV19BarTipCol ;
   private byte GXv_int3[] ;
   private byte A545HisCodReo ;
   private byte A572HisTipCol ;
   private byte A554HisOrdReo ;
   private byte A548HisEstReo ;
   private short A833TipDefCod ;
   private short A217BarTipArt ;
   private short AV15BarTipArt ;
   private short A319DefPor ;
   private short W833TipDefCod ;
   private short A571HisTipArt ;
   private short A553HisNumPie ;
   private short A5085CodCausa ;
   private short Gx_err ;
   private int AV8BarCod ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int AV13DisCod ;
   private int A44AlbRecCod ;
   private int AV14AlbReccod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int AV18BarColNUm ;
   private int AV21CliCod ;
   private int GXv_int2[] ;
   private int AV20BarPiePie ;
   private int GXv_int6[] ;
   private int GX_INS60 ;
   private int W252CliCod ;
   private int A539HisBarCod ;
   private int A547HisColNum ;
   private int A2297HisReoTn ;
   private int A5356Hisoperar ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal AV22BarKgm ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal A549HisKgmOri ;
   private java.math.BigDecimal A552HisMtrOri ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String AV11SiNo ;
   private String AV12SiNoold ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String AV16BarSer ;
   private String AV17BarColNom ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String AV23BarSerDsc ;
   private String W396EmprCod ;
   private String W602MaqCod ;
   private String A602MaqCod ;
   private String A544HisCodPar ;
   private String A542HisBarSer ;
   private String A546HisColNom ;
   private String A2299HisReoDsc ;
   private String Gx_emsg ;
   private String A55AlbRReo ;
   private java.util.Date A569HisReoFec ;
   private boolean n833TipDefCod ;
   private boolean returnInSub ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n602MaqCod ;
   private boolean n571HisTipArt ;
   private boolean n542HisBarSer ;
   private boolean n546HisColNom ;
   private boolean n547HisColNum ;
   private boolean n572HisTipCol ;
   private boolean n553HisNumPie ;
   private boolean n540HisBarKgm ;
   private boolean n541HisBarMtr ;
   private boolean n569HisReoFec ;
   private boolean n549HisKgmOri ;
   private boolean n552HisMtrOri ;
   private boolean n554HisOrdReo ;
   private boolean n548HisEstReo ;
   private boolean n2297HisReoTn ;
   private boolean n2299HisReoDsc ;
   private boolean n5356Hisoperar ;
   private boolean n5085CodCausa ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P024X3_A396EmprCod ;
   private String[] P024X3_A130BarCodPar ;
   private byte[] P024X3_A132BarCodReo ;
   private int[] P024X3_A129BarCod ;
   private byte[] P024X3_A148BarEstReo ;
   private short[] P024X3_A833TipDefCod ;
   private boolean[] P024X3_n833TipDefCod ;
   private int[] P024X3_A361DisCod ;
   private String[] P024X5_A396EmprCod ;
   private int[] P024X5_A361DisCod ;
   private java.math.BigDecimal[] P024X5_A595Kilos ;
   private int[] P024X5_A44AlbRecCod ;
   private String[] P024X7_A396EmprCod ;
   private String[] P024X7_A130BarCodPar ;
   private byte[] P024X7_A132BarCodReo ;
   private int[] P024X7_A129BarCod ;
   private int[] P024X7_A361DisCod ;
   private short[] P024X7_A217BarTipArt ;
   private boolean[] P024X7_n217BarTipArt ;
   private String[] P024X7_A212BarSer ;
   private String[] P024X7_A135BarColNom ;
   private int[] P024X7_A136BarColNum ;
   private byte[] P024X7_A218BarTipCol ;
   private int[] P024X7_A252CliCod ;
   private boolean[] P024X7_n252CliCod ;
   private String[] P024X7_A1652BarSerDsc ;
   private byte[] P024X7_A148BarEstReo ;
   private String[] P024X9_A396EmprCod ;
   private short[] P024X9_A319DefPor ;
   private short[] P024X9_A833TipDefCod ;
   private boolean[] P024X9_n833TipDefCod ;
   private int[] P024X9_A361DisCod ;
   private String[] P024X11_A396EmprCod ;
   private int[] P024X11_A44AlbRecCod ;
   private String[] P024X11_A55AlbRReo ;
}

final  class prexsino__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P024X2", "DELETE FROM TXPHISREO  WHERE EmprCod = ? and HisBarCod = ? and HisCodReo = ? and HisCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
         ,new ForEachCursor("P024X3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarEstReo, TipDefCod, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P024X4", "UPDATE TXPBARCAD SET BarEstReo=?, TipDefCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P024X5", "SELECT EmprCod, DisCod, Kilos, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P024X6", "DELETE FROM TXPDISDEF  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISDEF")
         ,new ForEachCursor("P024X7", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, DisCod, BarTipArt, BarSer, BarColNom, BarColNum, BarTipCol, CliCod, BarSerDsc, BarEstReo FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P024X8", "UPDATE TXPBARCAD SET BarEstReo=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P024X9", "SELECT EmprCod, DefPor, TipDefCod, DisCod FROM TXPDISDEF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P024X10", "INSERT INTO TXPHISREO(EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod, HisTipArt, CliCod, HisBarSer, HisColNom, HisColNum, HisTipCol, HisNumPie, HisBarKgm, HisBarMtr, MaqCod, HisReoFec, HisKgmOri, HisMtrOri, HisOrdReo, HisEstReo, HisReoTn, HisReoDsc, CodCausa, Hisoperar, HisReoPza, TipCorCod, HisAcCo, HisAcCot, HisAdEAcCo, HisAdEAcCt, HisAdeSN, HisAdeObs, Rps_Cod, HisUsu, HisHorReo, HisNomCli, HisNumCli, HisOpecod, HisOpeTur, HisMtsCarg, HisMtsImp, HisreoLote) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
         ,new ForEachCursor("P024X11", "SELECT EmprCod, AlbRecCod, AlbRReo FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P024X12", "UPDATE TXPALBREC SET AlbRReo=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 26);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 16);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 13);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[25], 6);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DATE );
               }
               else
               {
                  stmt.setDate(16, (java.util.Date)parms[27]);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[35]).byteValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(21, ((Number) parms[37]).intValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[39], 26);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[43]).intValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

