package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aprc0003 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aprc0003 pgm = new aprc0003 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aprc0003( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aprc0003.class ), "" );
   }

   public aprc0003( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV9EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV10Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char1, GXv_char2, GXv_char3) ;
      aprc0003.this.AV9EmprCod = GXv_char1[0] ;
      aprc0003.this.AV11EmprNom = GXv_char2[0] ;
      aprc0003.this.AV10Usurcod = GXv_char3[0] ;
      System.out.println( httpContext.getMessage( "Iniciamos el proceso de re-construccion HISREO¡¡¡", "") );
      AV13Num_r = (short)(0) ;
      /* Using cursor P01WW3 */
      pr_default.execute(0, new Object[] {AV9EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P01WW3_A361DisCod[0] ;
         A396EmprCod = P01WW3_A396EmprCod[0] ;
         A148BarEstReo = P01WW3_A148BarEstReo[0] ;
         A217BarTipArt = P01WW3_A217BarTipArt[0] ;
         n217BarTipArt = P01WW3_n217BarTipArt[0] ;
         A212BarSer = P01WW3_A212BarSer[0] ;
         A135BarColNom = P01WW3_A135BarColNom[0] ;
         A136BarColNum = P01WW3_A136BarColNum[0] ;
         A218BarTipCol = P01WW3_A218BarTipCol[0] ;
         A159BarFecGen = P01WW3_A159BarFecGen[0] ;
         A1652BarSerDsc = P01WW3_A1652BarSerDsc[0] ;
         A252CliCod = P01WW3_A252CliCod[0] ;
         n252CliCod = P01WW3_n252CliCod[0] ;
         A833TipDefCod = P01WW3_A833TipDefCod[0] ;
         n833TipDefCod = P01WW3_n833TipDefCod[0] ;
         A130BarCodPar = P01WW3_A130BarCodPar[0] ;
         A132BarCodReo = P01WW3_A132BarCodReo[0] ;
         A129BarCod = P01WW3_A129BarCod[0] ;
         A966PartCod = P01WW3_A966PartCod[0] ;
         n966PartCod = P01WW3_n966PartCod[0] ;
         A166BarKgm = P01WW3_A166BarKgm[0] ;
         A184BarMtr = P01WW3_A184BarMtr[0] ;
         A199BarPie1 = P01WW3_A199BarPie1[0] ;
         A365DisDes = P01WW3_A365DisDes[0] ;
         A898BarPieNDes = P01WW3_A898BarPieNDes[0] ;
         A966PartCod = P01WW3_A966PartCod[0] ;
         n966PartCod = P01WW3_n966PartCod[0] ;
         A166BarKgm = P01WW3_A166BarKgm[0] ;
         A184BarMtr = P01WW3_A184BarMtr[0] ;
         A199BarPie1 = P01WW3_A199BarPie1[0] ;
         A898BarPieNDes = P01WW3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         W396EmprCod = A396EmprCod ;
         AV14BarCod = A129BarCod ;
         AV15BarCodReo = A132BarCodReo ;
         AV16BarCodPar = A130BarCodPar ;
         AV18PartCod = A966PartCod ;
         AV19CliCod = A252CliCod ;
         /* Using cursor P01WW4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A44AlbRecCod = P01WW4_A44AlbRecCod[0] ;
            A200BarPieCod = P01WW4_A200BarPieCod[0] ;
            AV17AlbRecCod = A44AlbRecCod ;
            if ( ! (0==AV17AlbRecCod) )
            {
               /* Execute user subroutine: 'NOTREC' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( ! (GXutil.strcmp("", AV18PartCod)==0) )
         {
            /* Execute user subroutine: 'NOTREC_H' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
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
         A396EmprCod = AV9EmprCod ;
         A539HisBarCod = A129BarCod ;
         A545HisCodReo = A132BarCodReo ;
         A544HisCodPar = A130BarCodPar ;
         n833TipDefCod = false ;
         A571HisTipArt = A217BarTipArt ;
         n571HisTipArt = false ;
         n252CliCod = false ;
         A542HisBarSer = A212BarSer ;
         n542HisBarSer = false ;
         A546HisColNom = A135BarColNom ;
         n546HisColNom = false ;
         A547HisColNum = A136BarColNum ;
         n547HisColNum = false ;
         A572HisTipCol = A218BarTipCol ;
         n572HisTipCol = false ;
         A553HisNumPie = (short)(A198BarPie) ;
         n553HisNumPie = false ;
         A540HisBarKgm = A166BarKgm ;
         n540HisBarKgm = false ;
         A541HisBarMtr = A184BarMtr ;
         n541HisBarMtr = false ;
         A569HisReoFec = A159BarFecGen ;
         n569HisReoFec = false ;
         A549HisKgmOri = A166BarKgm ;
         n549HisKgmOri = false ;
         A552HisMtrOri = A184BarMtr ;
         n552HisMtrOri = false ;
         A554HisOrdReo = (byte)(0) ;
         n554HisOrdReo = false ;
         A548HisEstReo = (byte)(2) ;
         n548HisEstReo = false ;
         A602MaqCod = GXutil.space( (short)(6)) ;
         n602MaqCod = false ;
         A2297HisReoTn = AV12NR_CODIGO ;
         n2297HisReoTn = false ;
         A2299HisReoDsc = A1652BarSerDsc ;
         n2299HisReoDsc = false ;
         /* Using cursor P01WW5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod), Boolean.valueOf(n571HisTipArt), Short.valueOf(A571HisTipArt), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n542HisBarSer), A542HisBarSer, Boolean.valueOf(n546HisColNom), A546HisColNom, Boolean.valueOf(n547HisColNum), Integer.valueOf(A547HisColNum), Boolean.valueOf(n572HisTipCol), Byte.valueOf(A572HisTipCol), Boolean.valueOf(n553HisNumPie), Short.valueOf(A553HisNumPie), Boolean.valueOf(n540HisBarKgm), A540HisBarKgm, Boolean.valueOf(n541HisBarMtr), A541HisBarMtr, Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n569HisReoFec), A569HisReoFec, Boolean.valueOf(n549HisKgmOri), A549HisKgmOri, Boolean.valueOf(n552HisMtrOri), A552HisMtrOri, Boolean.valueOf(n554HisOrdReo), Byte.valueOf(A554HisOrdReo), Boolean.valueOf(n548HisEstReo), Byte.valueOf(A548HisEstReo), Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn), Boolean.valueOf(n2299HisReoDsc), A2299HisReoDsc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P01WW6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A396EmprCod = P01WW6_A396EmprCod[0] ;
               A539HisBarCod = P01WW6_A539HisBarCod[0] ;
               A545HisCodReo = P01WW6_A545HisCodReo[0] ;
               A544HisCodPar = P01WW6_A544HisCodPar[0] ;
               A833TipDefCod = P01WW6_A833TipDefCod[0] ;
               n833TipDefCod = P01WW6_n833TipDefCod[0] ;
               A540HisBarKgm = P01WW6_A540HisBarKgm[0] ;
               n540HisBarKgm = P01WW6_n540HisBarKgm[0] ;
               A541HisBarMtr = P01WW6_A541HisBarMtr[0] ;
               n541HisBarMtr = P01WW6_n541HisBarMtr[0] ;
               A540HisBarKgm = A166BarKgm ;
               n540HisBarKgm = false ;
               A541HisBarMtr = A184BarMtr ;
               n541HisBarMtr = false ;
               /* Using cursor P01WW7 */
               pr_default.execute(4, new Object[] {Boolean.valueOf(n540HisBarKgm), A540HisBarKgm, Boolean.valueOf(n541HisBarMtr), A541HisBarMtr, A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin del proceso de re-construccion HISREO¡¡¡", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'NOTREC' Routine */
      returnInSub = false ;
      AV12NR_CODIGO = 0 ;
      /* Using cursor P01WW8 */
      pr_default.execute(5, new Object[] {AV9EmprCod, Integer.valueOf(AV17AlbRecCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A396EmprCod = P01WW8_A396EmprCod[0] ;
         A5206Nr_albrecc = P01WW8_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P01WW8_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P01WW8_A5198Nr_codigo[0] ;
         AV12NR_CODIGO = A5198Nr_codigo ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S121( )
   {
      /* 'NOTREC_H' Routine */
      returnInSub = false ;
      AV12NR_CODIGO = 0 ;
      /* Using cursor P01WW9 */
      pr_default.execute(6, new Object[] {AV9EmprCod, AV18PartCod, Integer.valueOf(AV19CliCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A396EmprCod = P01WW9_A396EmprCod[0] ;
         A7090Nr_PartCod = P01WW9_A7090Nr_PartCod[0] ;
         n7090Nr_PartCod = P01WW9_n7090Nr_PartCod[0] ;
         A5340Nr_CliCod = P01WW9_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P01WW9_n5340Nr_CliCod[0] ;
         A5198Nr_codigo = P01WW9_A5198Nr_codigo[0] ;
         AV12NR_CODIGO = A5198Nr_codigo ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(prc0003.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aprc0003");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Station = "" ;
      AV9EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV10Usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P01WW3_A361DisCod = new int[1] ;
      P01WW3_A396EmprCod = new String[] {""} ;
      P01WW3_A148BarEstReo = new byte[1] ;
      P01WW3_A217BarTipArt = new short[1] ;
      P01WW3_n217BarTipArt = new boolean[] {false} ;
      P01WW3_A212BarSer = new String[] {""} ;
      P01WW3_A135BarColNom = new String[] {""} ;
      P01WW3_A136BarColNum = new int[1] ;
      P01WW3_A218BarTipCol = new byte[1] ;
      P01WW3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P01WW3_A1652BarSerDsc = new String[] {""} ;
      P01WW3_A252CliCod = new int[1] ;
      P01WW3_n252CliCod = new boolean[] {false} ;
      P01WW3_A833TipDefCod = new short[1] ;
      P01WW3_n833TipDefCod = new boolean[] {false} ;
      P01WW3_A130BarCodPar = new String[] {""} ;
      P01WW3_A132BarCodReo = new byte[1] ;
      P01WW3_A129BarCod = new int[1] ;
      P01WW3_A966PartCod = new String[] {""} ;
      P01WW3_n966PartCod = new boolean[] {false} ;
      P01WW3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WW3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WW3_A199BarPie1 = new short[1] ;
      P01WW3_A365DisDes = new String[] {""} ;
      P01WW3_A898BarPieNDes = new int[1] ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A1652BarSerDsc = "" ;
      A130BarCodPar = "" ;
      A966PartCod = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      W396EmprCod = "" ;
      AV16BarCodPar = "" ;
      AV18PartCod = "" ;
      P01WW4_A396EmprCod = new String[] {""} ;
      P01WW4_A129BarCod = new int[1] ;
      P01WW4_A132BarCodReo = new byte[1] ;
      P01WW4_A130BarCodPar = new String[] {""} ;
      P01WW4_A44AlbRecCod = new int[1] ;
      P01WW4_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
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
      P01WW6_A396EmprCod = new String[] {""} ;
      P01WW6_A539HisBarCod = new int[1] ;
      P01WW6_A545HisCodReo = new byte[1] ;
      P01WW6_A544HisCodPar = new String[] {""} ;
      P01WW6_A833TipDefCod = new short[1] ;
      P01WW6_n833TipDefCod = new boolean[] {false} ;
      P01WW6_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WW6_n540HisBarKgm = new boolean[] {false} ;
      P01WW6_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WW6_n541HisBarMtr = new boolean[] {false} ;
      P01WW8_A396EmprCod = new String[] {""} ;
      P01WW8_A5206Nr_albrecc = new int[1] ;
      P01WW8_n5206Nr_albrecc = new boolean[] {false} ;
      P01WW8_A5198Nr_codigo = new int[1] ;
      P01WW9_A396EmprCod = new String[] {""} ;
      P01WW9_A7090Nr_PartCod = new String[] {""} ;
      P01WW9_n7090Nr_PartCod = new boolean[] {false} ;
      P01WW9_A5340Nr_CliCod = new int[1] ;
      P01WW9_n5340Nr_CliCod = new boolean[] {false} ;
      P01WW9_A5198Nr_codigo = new int[1] ;
      A7090Nr_PartCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aprc0003__default(),
         new Object[] {
             new Object[] {
            P01WW3_A361DisCod, P01WW3_A396EmprCod, P01WW3_A148BarEstReo, P01WW3_A217BarTipArt, P01WW3_n217BarTipArt, P01WW3_A212BarSer, P01WW3_A135BarColNom, P01WW3_A136BarColNum, P01WW3_A218BarTipCol, P01WW3_A159BarFecGen,
            P01WW3_A1652BarSerDsc, P01WW3_A252CliCod, P01WW3_n252CliCod, P01WW3_A833TipDefCod, P01WW3_n833TipDefCod, P01WW3_A130BarCodPar, P01WW3_A132BarCodReo, P01WW3_A129BarCod, P01WW3_A966PartCod, P01WW3_n966PartCod,
            P01WW3_A166BarKgm, P01WW3_A184BarMtr, P01WW3_A199BarPie1, P01WW3_A365DisDes, P01WW3_A898BarPieNDes
            }
            , new Object[] {
            P01WW4_A396EmprCod, P01WW4_A129BarCod, P01WW4_A132BarCodReo, P01WW4_A130BarCodPar, P01WW4_A44AlbRecCod, P01WW4_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01WW6_A396EmprCod, P01WW6_A539HisBarCod, P01WW6_A545HisCodReo, P01WW6_A544HisCodPar, P01WW6_A833TipDefCod, P01WW6_A540HisBarKgm, P01WW6_n540HisBarKgm, P01WW6_A541HisBarMtr, P01WW6_n541HisBarMtr
            }
            , new Object[] {
            }
            , new Object[] {
            P01WW8_A396EmprCod, P01WW8_A5206Nr_albrecc, P01WW8_n5206Nr_albrecc, P01WW8_A5198Nr_codigo
            }
            , new Object[] {
            P01WW9_A396EmprCod, P01WW9_A7090Nr_PartCod, P01WW9_n7090Nr_PartCod, P01WW9_A5340Nr_CliCod, P01WW9_n5340Nr_CliCod, P01WW9_A5198Nr_codigo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A148BarEstReo ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte AV15BarCodReo ;
   private byte A545HisCodReo ;
   private byte A572HisTipCol ;
   private byte A554HisOrdReo ;
   private byte A548HisEstReo ;
   private short AV13Num_r ;
   private short A217BarTipArt ;
   private short A833TipDefCod ;
   private short A199BarPie1 ;
   private short W833TipDefCod ;
   private short A571HisTipArt ;
   private short A553HisNumPie ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV14BarCod ;
   private int AV19CliCod ;
   private int A44AlbRecCod ;
   private int AV17AlbRecCod ;
   private int GX_INS60 ;
   private int W252CliCod ;
   private int A539HisBarCod ;
   private int A547HisColNum ;
   private int A2297HisReoTn ;
   private int AV12NR_CODIGO ;
   private int A5206Nr_albrecc ;
   private int A5198Nr_codigo ;
   private int A5340Nr_CliCod ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal A549HisKgmOri ;
   private java.math.BigDecimal A552HisMtrOri ;
   private String AV8Station ;
   private String AV9EmprCod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String AV10Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A130BarCodPar ;
   private String A966PartCod ;
   private String A365DisDes ;
   private String W396EmprCod ;
   private String AV16BarCodPar ;
   private String AV18PartCod ;
   private String A200BarPieCod ;
   private String W602MaqCod ;
   private String A602MaqCod ;
   private String A544HisCodPar ;
   private String A542HisBarSer ;
   private String A546HisColNom ;
   private String A2299HisReoDsc ;
   private String Gx_emsg ;
   private String A7090Nr_PartCod ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A569HisReoFec ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n833TipDefCod ;
   private boolean n966PartCod ;
   private boolean returnInSub ;
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
   private boolean n5206Nr_albrecc ;
   private boolean n7090Nr_PartCod ;
   private boolean n5340Nr_CliCod ;
   private IDataStoreProvider pr_default ;
   private int[] P01WW3_A361DisCod ;
   private String[] P01WW3_A396EmprCod ;
   private byte[] P01WW3_A148BarEstReo ;
   private short[] P01WW3_A217BarTipArt ;
   private boolean[] P01WW3_n217BarTipArt ;
   private String[] P01WW3_A212BarSer ;
   private String[] P01WW3_A135BarColNom ;
   private int[] P01WW3_A136BarColNum ;
   private byte[] P01WW3_A218BarTipCol ;
   private java.util.Date[] P01WW3_A159BarFecGen ;
   private String[] P01WW3_A1652BarSerDsc ;
   private int[] P01WW3_A252CliCod ;
   private boolean[] P01WW3_n252CliCod ;
   private short[] P01WW3_A833TipDefCod ;
   private boolean[] P01WW3_n833TipDefCod ;
   private String[] P01WW3_A130BarCodPar ;
   private byte[] P01WW3_A132BarCodReo ;
   private int[] P01WW3_A129BarCod ;
   private String[] P01WW3_A966PartCod ;
   private boolean[] P01WW3_n966PartCod ;
   private java.math.BigDecimal[] P01WW3_A166BarKgm ;
   private java.math.BigDecimal[] P01WW3_A184BarMtr ;
   private short[] P01WW3_A199BarPie1 ;
   private String[] P01WW3_A365DisDes ;
   private int[] P01WW3_A898BarPieNDes ;
   private String[] P01WW4_A396EmprCod ;
   private int[] P01WW4_A129BarCod ;
   private byte[] P01WW4_A132BarCodReo ;
   private String[] P01WW4_A130BarCodPar ;
   private int[] P01WW4_A44AlbRecCod ;
   private String[] P01WW4_A200BarPieCod ;
   private String[] P01WW6_A396EmprCod ;
   private int[] P01WW6_A539HisBarCod ;
   private byte[] P01WW6_A545HisCodReo ;
   private String[] P01WW6_A544HisCodPar ;
   private short[] P01WW6_A833TipDefCod ;
   private boolean[] P01WW6_n833TipDefCod ;
   private java.math.BigDecimal[] P01WW6_A540HisBarKgm ;
   private boolean[] P01WW6_n540HisBarKgm ;
   private java.math.BigDecimal[] P01WW6_A541HisBarMtr ;
   private boolean[] P01WW6_n541HisBarMtr ;
   private String[] P01WW8_A396EmprCod ;
   private int[] P01WW8_A5206Nr_albrecc ;
   private boolean[] P01WW8_n5206Nr_albrecc ;
   private int[] P01WW8_A5198Nr_codigo ;
   private String[] P01WW9_A396EmprCod ;
   private String[] P01WW9_A7090Nr_PartCod ;
   private boolean[] P01WW9_n7090Nr_PartCod ;
   private int[] P01WW9_A5340Nr_CliCod ;
   private boolean[] P01WW9_n5340Nr_CliCod ;
   private int[] P01WW9_A5198Nr_codigo ;
}

final  class aprc0003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01WW3", "SELECT T1.DisCod, T1.EmprCod, T1.BarEstReo, T1.BarTipArt, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarFecGen, T1.BarSerDsc, T1.CliCod, T1.TipDefCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.PartCod, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarEstReo = 2 ORDER BY T1.EmprCod, T1.BarEstReo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01WW4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01WW5", "INSERT INTO TXPHISREO(EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod, HisTipArt, CliCod, HisBarSer, HisColNom, HisColNum, HisTipCol, HisNumPie, HisBarKgm, HisBarMtr, MaqCod, HisReoFec, HisKgmOri, HisMtrOri, HisOrdReo, HisEstReo, HisReoTn, HisReoDsc, HisReoPza, CodCausa, Hisoperar, TipCorCod, HisAcCo, HisAcCot, HisAdEAcCo, HisAdEAcCt, HisAdeSN, HisAdeObs, Rps_Cod, HisUsu, HisHorReo, HisNomCli, HisNumCli, HisOpecod, HisOpeTur, HisMtsCarg, HisMtsImp, HisreoLote) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
         ,new ForEachCursor("P01WW6", "SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod, HisBarKgm, HisBarMtr FROM TXPHISREO WHERE EmprCod = ? and HisBarCod = ? and HisCodReo = ? and HisCodPar = ? and TipDefCod = ? ORDER BY EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01WW7", "UPDATE TXPHISREO SET HisBarKgm=?, HisBarMtr=?  WHERE EmprCod = ? AND HisBarCod = ? AND HisCodReo = ? AND HisCodPar = ? AND TipDefCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
         ,new ForEachCursor("P01WW8", "SELECT EmprCod, Nr_albrecc, Nr_codigo FROM TXPNOTREC WHERE EmprCod = ? and Nr_albrecc = ? ORDER BY EmprCod, Nr_albrecc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01WW9", "SELECT EmprCod, Nr_PartCod, Nr_CliCod, Nr_codigo FROM TXPNOTREC WHERE EmprCod = ? and Nr_PartCod = ? and Nr_CliCod = ? ORDER BY EmprCod, Nr_PartCod, Nr_CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((String[]) buf[18])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(18,2);
               ((short[]) buf[22])[0] = rslt.getShort(19);
               ((String[]) buf[23])[0] = rslt.getString(20, 1);
               ((int[]) buf[24])[0] = rslt.getInt(21);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
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
               return;
            case 3 :
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
               return;
            case 4 :
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
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[9]).shortValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

