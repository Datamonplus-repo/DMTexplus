package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apfase400101 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apfase400101 pgm = new apfase400101 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apfase400101( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apfase400101.class ), "" );
   }

   public apfase400101( int remoteHandle ,
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
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV24Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV25EmprCod ;
      GXv_char2[0] = AV26EmprNom ;
      GXv_char3[0] = AV35UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char1, GXv_char2, GXv_char3) ;
      apfase400101.this.AV25EmprCod = GXv_char1[0] ;
      apfase400101.this.AV26EmprNom = GXv_char2[0] ;
      apfase400101.this.AV35UsurCod = GXv_char3[0] ;
      /* Using cursor P04I22 */
      pr_default.execute(0, new Object[] {AV25EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P04I22_A213BarSit[0] ;
         A396EmprCod = P04I22_A396EmprCod[0] ;
         A212BarSer = P04I22_A212BarSer[0] ;
         A129BarCod = P04I22_A129BarCod[0] ;
         A132BarCodReo = P04I22_A132BarCodReo[0] ;
         A130BarCodPar = P04I22_A130BarCodPar[0] ;
         AV30Barcod = A129BarCod ;
         AV31Barcodreo = A132BarCodReo ;
         AV32Barcodpar = A130BarCodPar ;
         /* Execute user subroutine: 'BARFAS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV28Fase500101 == 1 )
         {
            Gx_msg = httpContext.getMessage( "Procesando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            System.out.println( Gx_msg );
            Application.commitDataStores(context, remoteHandle, pr_default, "apfase400101");
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A129BarCod ;
            GXv_int5[0] = A132BarCodReo ;
            GXv_char2[0] = A130BarCodPar ;
            new app.precfas(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char2) ;
            apfase400101.this.A396EmprCod = GXv_char3[0] ;
            apfase400101.this.A129BarCod = GXv_int4[0] ;
            apfase400101.this.A132BarCodReo = GXv_int5[0] ;
            apfase400101.this.A130BarCodPar = GXv_char2[0] ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Finalizado", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV27Fase400101 = (byte)(0) ;
      /* Using cursor P04I23 */
      pr_default.execute(1, new Object[] {AV25EmprCod, Integer.valueOf(AV30Barcod), Byte.valueOf(AV31Barcodreo), AV32Barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = P04I23_A457FasCod[0] ;
         A130BarCodPar = P04I23_A130BarCodPar[0] ;
         A132BarCodReo = P04I23_A132BarCodReo[0] ;
         A129BarCod = P04I23_A129BarCod[0] ;
         A396EmprCod = P04I23_A396EmprCod[0] ;
         A194BarOrdLin = P04I23_A194BarOrdLin[0] ;
         A758ProCod = P04I23_A758ProCod[0] ;
         AV27Fase400101 = (byte)(1) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV27Fase400101 == 0 )
      {
         AV28Fase500101 = (byte)(0) ;
         /* Using cursor P04I24 */
         pr_default.execute(2, new Object[] {AV25EmprCod, Integer.valueOf(AV30Barcod), Byte.valueOf(AV31Barcodreo), AV32Barcodpar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A457FasCod = P04I24_A457FasCod[0] ;
            A130BarCodPar = P04I24_A130BarCodPar[0] ;
            A132BarCodReo = P04I24_A132BarCodReo[0] ;
            A129BarCod = P04I24_A129BarCod[0] ;
            A396EmprCod = P04I24_A396EmprCod[0] ;
            A194BarOrdLin = P04I24_A194BarOrdLin[0] ;
            A758ProCod = P04I24_A758ProCod[0] ;
            AV28Fase500101 = (byte)(1) ;
            AV29Barordlin = (short)(A194BarOrdLin-6) ;
            AV34ProCod = A758ProCod ;
            AV33Fascod = A457FasCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( AV28Fase500101 == 1 )
         {
            /* Execute user subroutine: 'INSERTO' */
            S121 ();
            if (returnInSub) return;
         }
      }
   }

   public void S121( )
   {
      /* 'INSERTO' Routine */
      returnInSub = false ;
      /* Using cursor P04I25 */
      pr_default.execute(3, new Object[] {AV25EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A602MaqCod = P04I25_A602MaqCod[0] ;
         n602MaqCod = P04I25_n602MaqCod[0] ;
         A456FasActTin = P04I25_A456FasActTin[0] ;
         n456FasActTin = P04I25_n456FasActTin[0] ;
         A4286FasForMul = P04I25_A4286FasForMul[0] ;
         n4286FasForMul = P04I25_n4286FasForMul[0] ;
         A4639FasCara = P04I25_A4639FasCara[0] ;
         n4639FasCara = P04I25_n4639FasCara[0] ;
         A4903FasAcab = P04I25_A4903FasAcab[0] ;
         n4903FasAcab = P04I25_n4903FasAcab[0] ;
         A5368FasGral = P04I25_A5368FasGral[0] ;
         n5368FasGral = P04I25_n5368FasGral[0] ;
         A4299FasConPla = P04I25_A4299FasConPla[0] ;
         n4299FasConPla = P04I25_n4299FasConPla[0] ;
         A6011FasTip = P04I25_A6011FasTip[0] ;
         n6011FasTip = P04I25_n6011FasTip[0] ;
         A457FasCod = P04I25_A457FasCod[0] ;
         A396EmprCod = P04I25_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPBARFAS

         */
         W396EmprCod = A396EmprCod ;
         W457FasCod = A457FasCod ;
         A396EmprCod = AV25EmprCod ;
         A129BarCod = AV30Barcod ;
         A132BarCodReo = AV31Barcodreo ;
         A130BarCodPar = AV32Barcodpar ;
         A758ProCod = AV34ProCod ;
         A194BarOrdLin = AV29Barordlin ;
         A457FasCod = "400101" ;
         A603MaqCodBis = A602MaqCod ;
         A162BarFecTeo = GXutil.nullDate() ;
         A216BarTieTeo = DecimalUtil.doubleToDec(0) ;
         A150BarFacTin = A456FasActTin ;
         A152BarFasCon = httpContext.getMessage( "N", "") ;
         A153BarFasEst = (byte)(2) ;
         A4287BarFasFor = A4286FasForMul ;
         A4637BarFasCara = A4639FasCara ;
         A4638BarUltNlot = 0 ;
         n4638BarUltNlot = false ;
         A4021BarFasBot = GXutil.space( (short)(1)) ;
         A4905BarFasAcab = A4903FasAcab ;
         A4022BarNumBot = 0 ;
         A5045BarFasAgr = "" ;
         n5045BarFasAgr = false ;
         A5046BarFasPrp = "" ;
         n5046BarFasPrp = false ;
         A5047BarFasFPl = GXutil.nullDate() ;
         n5047BarFasFPl = false ;
         A5048BarFasUsu = GXutil.space( (short)(8)) ;
         n5048BarFasUsu = false ;
         A5369BarFasGral = A5368FasGral ;
         n5369BarFasGral = false ;
         A5372FasQuiUl = (short)(0) ;
         n5372FasQuiUl = false ;
         A179BarLoc = "" ;
         A3836BarFasPri = (byte)(0) ;
         A4301BarFasCoP = A4299FasConPla ;
         A6012BarFasTip = A6011FasTip ;
         n6012BarFasTip = false ;
         A6555BarFasNPl = (byte)(0) ;
         A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
         n4442BarFasDTI = false ;
         A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
         n4443BarFasDTF = false ;
         A7914BarfasRb = DecimalUtil.doubleToDec(0) ;
         n7914BarfasRb = false ;
         A7913BarfasUnpL = DecimalUtil.doubleToDec(0) ;
         n7913BarfasUnpL = false ;
         A7912Barfastpp = DecimalUtil.doubleToDec(0) ;
         n7912Barfastpp = false ;
         A7933Dtb_UOrd = (short)(0) ;
         n7933Dtb_UOrd = false ;
         A9842BarObsF = " " ;
         n9842BarObsF = false ;
         /* Using cursor P04I26 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A152BarFasCon, Byte.valueOf(A153BarFasEst), A603MaqCodBis, A150BarFacTin, A162BarFecTeo, A216BarTieTeo, A179BarLoc, A4021BarFasBot, Integer.valueOf(A4022BarNumBot), A4287BarFasFor, A4301BarFasCoP, A4637BarFasCara, Boolean.valueOf(n4638BarUltNlot), Integer.valueOf(A4638BarUltNlot), A4905BarFasAcab, Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, A457FasCod, Boolean.valueOf(n5045BarFasAgr), A5045BarFasAgr, Boolean.valueOf(n5046BarFasPrp), A5046BarFasPrp, Boolean.valueOf(n5047BarFasFPl), A5047BarFasFPl, Boolean.valueOf(n5048BarFasUsu), A5048BarFasUsu, Boolean.valueOf(n5369BarFasGral), A5369BarFasGral, Boolean.valueOf(n5372FasQuiUl), Short.valueOf(A5372FasQuiUl), Boolean.valueOf(n6012BarFasTip), A6012BarFasTip, Byte.valueOf(A6555BarFasNPl), Boolean.valueOf(n7912Barfastpp), A7912Barfastpp, Boolean.valueOf(n7913BarfasUnpL), A7913BarfasUnpL, Boolean.valueOf(n7914BarfasRb), A7914BarfasRb, Boolean.valueOf(n7933Dtb_UOrd), Short.valueOf(A7933Dtb_UOrd), Boolean.valueOf(n9842BarObsF), A9842BarObsF, Byte.valueOf(A3836BarFasPri)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
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
         A396EmprCod = W396EmprCod ;
         A457FasCod = W457FasCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pfase400101.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apfase400101");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24Station = "" ;
      AV25EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV26EmprNom = "" ;
      AV35UsurCod = "" ;
      scmdbuf = "" ;
      P04I22_A213BarSit = new byte[1] ;
      P04I22_A396EmprCod = new String[] {""} ;
      P04I22_A212BarSer = new String[] {""} ;
      P04I22_A129BarCod = new int[1] ;
      P04I22_A132BarCodReo = new byte[1] ;
      P04I22_A130BarCodPar = new String[] {""} ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      AV32Barcodpar = "" ;
      Gx_msg = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      P04I23_A457FasCod = new String[] {""} ;
      P04I23_A130BarCodPar = new String[] {""} ;
      P04I23_A132BarCodReo = new byte[1] ;
      P04I23_A129BarCod = new int[1] ;
      P04I23_A396EmprCod = new String[] {""} ;
      P04I23_A194BarOrdLin = new short[1] ;
      P04I23_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      P04I24_A457FasCod = new String[] {""} ;
      P04I24_A130BarCodPar = new String[] {""} ;
      P04I24_A132BarCodReo = new byte[1] ;
      P04I24_A129BarCod = new int[1] ;
      P04I24_A396EmprCod = new String[] {""} ;
      P04I24_A194BarOrdLin = new short[1] ;
      P04I24_A758ProCod = new String[] {""} ;
      AV34ProCod = "" ;
      AV33Fascod = "" ;
      P04I25_A602MaqCod = new String[] {""} ;
      P04I25_n602MaqCod = new boolean[] {false} ;
      P04I25_A456FasActTin = new String[] {""} ;
      P04I25_n456FasActTin = new boolean[] {false} ;
      P04I25_A4286FasForMul = new String[] {""} ;
      P04I25_n4286FasForMul = new boolean[] {false} ;
      P04I25_A4639FasCara = new String[] {""} ;
      P04I25_n4639FasCara = new boolean[] {false} ;
      P04I25_A4903FasAcab = new String[] {""} ;
      P04I25_n4903FasAcab = new boolean[] {false} ;
      P04I25_A5368FasGral = new String[] {""} ;
      P04I25_n5368FasGral = new boolean[] {false} ;
      P04I25_A4299FasConPla = new String[] {""} ;
      P04I25_n4299FasConPla = new boolean[] {false} ;
      P04I25_A6011FasTip = new String[] {""} ;
      P04I25_n6011FasTip = new boolean[] {false} ;
      P04I25_A457FasCod = new String[] {""} ;
      P04I25_A396EmprCod = new String[] {""} ;
      A602MaqCod = "" ;
      A456FasActTin = "" ;
      A4286FasForMul = "" ;
      A4639FasCara = "" ;
      A4903FasAcab = "" ;
      A5368FasGral = "" ;
      A4299FasConPla = "" ;
      A6011FasTip = "" ;
      W396EmprCod = "" ;
      W457FasCod = "" ;
      A603MaqCodBis = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A150BarFacTin = "" ;
      A152BarFasCon = "" ;
      A4287BarFasFor = "" ;
      A4637BarFasCara = "" ;
      A4021BarFasBot = "" ;
      A4905BarFasAcab = "" ;
      A5045BarFasAgr = "" ;
      A5046BarFasPrp = "" ;
      A5047BarFasFPl = GXutil.nullDate() ;
      A5048BarFasUsu = "" ;
      A5369BarFasGral = "" ;
      A179BarLoc = "" ;
      A4301BarFasCoP = "" ;
      A6012BarFasTip = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A7914BarfasRb = DecimalUtil.ZERO ;
      A7913BarfasUnpL = DecimalUtil.ZERO ;
      A7912Barfastpp = DecimalUtil.ZERO ;
      A9842BarObsF = "" ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.apfase400101__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.apfase400101__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.apfase400101__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apfase400101__default(),
         new Object[] {
             new Object[] {
            P04I22_A213BarSit, P04I22_A396EmprCod, P04I22_A212BarSer, P04I22_A129BarCod, P04I22_A132BarCodReo, P04I22_A130BarCodPar
            }
            , new Object[] {
            P04I23_A457FasCod, P04I23_A130BarCodPar, P04I23_A132BarCodReo, P04I23_A129BarCod, P04I23_A396EmprCod, P04I23_A194BarOrdLin, P04I23_A758ProCod
            }
            , new Object[] {
            P04I24_A457FasCod, P04I24_A130BarCodPar, P04I24_A132BarCodReo, P04I24_A129BarCod, P04I24_A396EmprCod, P04I24_A194BarOrdLin, P04I24_A758ProCod
            }
            , new Object[] {
            P04I25_A602MaqCod, P04I25_n602MaqCod, P04I25_A456FasActTin, P04I25_n456FasActTin, P04I25_A4286FasForMul, P04I25_n4286FasForMul, P04I25_A4639FasCara, P04I25_n4639FasCara, P04I25_A4903FasAcab, P04I25_n4903FasAcab,
            P04I25_A5368FasGral, P04I25_n5368FasGral, P04I25_A4299FasConPla, P04I25_n4299FasConPla, P04I25_A6011FasTip, P04I25_n6011FasTip, P04I25_A457FasCod, P04I25_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte AV31Barcodreo ;
   private byte AV28Fase500101 ;
   private byte GXv_int5[] ;
   private byte AV27Fase400101 ;
   private byte A153BarFasEst ;
   private byte A3836BarFasPri ;
   private byte A6555BarFasNPl ;
   private short A194BarOrdLin ;
   private short AV29Barordlin ;
   private short A5372FasQuiUl ;
   private short A7933Dtb_UOrd ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV30Barcod ;
   private int GXv_int4[] ;
   private int GX_INS15 ;
   private int A4638BarUltNlot ;
   private int A4022BarNumBot ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A7914BarfasRb ;
   private java.math.BigDecimal A7913BarfasUnpL ;
   private java.math.BigDecimal A7912Barfastpp ;
   private String AV24Station ;
   private String AV25EmprCod ;
   private String GXv_char1[] ;
   private String AV26EmprNom ;
   private String AV35UsurCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String AV32Barcodpar ;
   private String Gx_msg ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV34ProCod ;
   private String AV33Fascod ;
   private String A602MaqCod ;
   private String A456FasActTin ;
   private String A4286FasForMul ;
   private String A4639FasCara ;
   private String A4903FasAcab ;
   private String A5368FasGral ;
   private String A4299FasConPla ;
   private String A6011FasTip ;
   private String W396EmprCod ;
   private String W457FasCod ;
   private String A603MaqCodBis ;
   private String A150BarFacTin ;
   private String A152BarFasCon ;
   private String A4287BarFasFor ;
   private String A4637BarFasCara ;
   private String A4021BarFasBot ;
   private String A4905BarFasAcab ;
   private String A5045BarFasAgr ;
   private String A5046BarFasPrp ;
   private String A5048BarFasUsu ;
   private String A5369BarFasGral ;
   private String A179BarLoc ;
   private String A4301BarFasCoP ;
   private String A6012BarFasTip ;
   private String Gx_emsg ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date A5047BarFasFPl ;
   private boolean returnInSub ;
   private boolean n602MaqCod ;
   private boolean n456FasActTin ;
   private boolean n4286FasForMul ;
   private boolean n4639FasCara ;
   private boolean n4903FasAcab ;
   private boolean n5368FasGral ;
   private boolean n4299FasConPla ;
   private boolean n6011FasTip ;
   private boolean n4638BarUltNlot ;
   private boolean n5045BarFasAgr ;
   private boolean n5046BarFasPrp ;
   private boolean n5047BarFasFPl ;
   private boolean n5048BarFasUsu ;
   private boolean n5369BarFasGral ;
   private boolean n5372FasQuiUl ;
   private boolean n6012BarFasTip ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n7914BarfasRb ;
   private boolean n7913BarfasUnpL ;
   private boolean n7912Barfastpp ;
   private boolean n7933Dtb_UOrd ;
   private boolean n9842BarObsF ;
   private String A9842BarObsF ;
   private IDataStoreProvider pr_default ;
   private byte[] P04I22_A213BarSit ;
   private String[] P04I22_A396EmprCod ;
   private String[] P04I22_A212BarSer ;
   private int[] P04I22_A129BarCod ;
   private byte[] P04I22_A132BarCodReo ;
   private String[] P04I22_A130BarCodPar ;
   private String[] P04I23_A457FasCod ;
   private String[] P04I23_A130BarCodPar ;
   private byte[] P04I23_A132BarCodReo ;
   private int[] P04I23_A129BarCod ;
   private String[] P04I23_A396EmprCod ;
   private short[] P04I23_A194BarOrdLin ;
   private String[] P04I23_A758ProCod ;
   private String[] P04I24_A457FasCod ;
   private String[] P04I24_A130BarCodPar ;
   private byte[] P04I24_A132BarCodReo ;
   private int[] P04I24_A129BarCod ;
   private String[] P04I24_A396EmprCod ;
   private short[] P04I24_A194BarOrdLin ;
   private String[] P04I24_A758ProCod ;
   private String[] P04I25_A602MaqCod ;
   private boolean[] P04I25_n602MaqCod ;
   private String[] P04I25_A456FasActTin ;
   private boolean[] P04I25_n456FasActTin ;
   private String[] P04I25_A4286FasForMul ;
   private boolean[] P04I25_n4286FasForMul ;
   private String[] P04I25_A4639FasCara ;
   private boolean[] P04I25_n4639FasCara ;
   private String[] P04I25_A4903FasAcab ;
   private boolean[] P04I25_n4903FasAcab ;
   private String[] P04I25_A5368FasGral ;
   private boolean[] P04I25_n5368FasGral ;
   private String[] P04I25_A4299FasConPla ;
   private boolean[] P04I25_n4299FasConPla ;
   private String[] P04I25_A6011FasTip ;
   private boolean[] P04I25_n6011FasTip ;
   private String[] P04I25_A457FasCod ;
   private String[] P04I25_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class apfase400101__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class apfase400101__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class apfase400101__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class apfase400101__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04I22", "SELECT BarSit, EmprCod, BarSer, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE (EmprCod = ?) AND (BarSit < 9) ORDER BY EmprCod, BarSit ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04I23", "SELECT FasCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = '400101') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04I24", "SELECT FasCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = '500101') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04I25", "SELECT MaqCod, FasActTin, FasForMul, FasCara, FasAcab, FasGral, FasConPla, FasTip, FasCod, EmprCod FROM TXPFASPRO WHERE EmprCod = ? and FasCod = '400101' ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04I26", "INSERT INTO TXPBARFAS(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, BarFasEst, MaqCodBis, BarFacTin, BarFecTeo, BarTieTeo, BarLoc, BarFasBot, BarNumBot, BarFasFor, BarFasCoP, BarFasCara, BarUltNlot, BarFasAcab, BarFasDTI, BarFasDTF, FasCod, BarFasAgr, BarFasPrp, BarFasFPl, BarFasUsu, BarFasGral, FasQuiUl, BarFasTip, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarObsF, BarFasPri, BarFecRea, BarUni, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarFasKgm, BarFasMtr, BarNPzas, BarFasPzas, BarFasInc, BarFasKPr, BarFasPPr, BarFasKgT, BarFasMtT, BarMaqPlan, BarFasCR, BarFasSec, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarHdrO, BarfasPri2, BarObsB, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', 0, ' ', 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 8);
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 6);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setString(13, (String)parms[12], 10);
               stmt.setString(14, (String)parms[13], 1);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setString(16, (String)parms[15], 1);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setString(18, (String)parms[17], 1);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[19]).intValue());
               }
               stmt.setString(20, (String)parms[20], 1);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(21, (java.util.Date)parms[22], false);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[24], false);
               }
               stmt.setString(23, (String)parms[25], 8);
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DATE );
               }
               else
               {
                  stmt.setDate(26, (java.util.Date)parms[31]);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[33], 8);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[39], 1);
               }
               stmt.setByte(31, ((Number) parms[40]).byteValue());
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[48]).shortValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[50], 3000);
               }
               stmt.setByte(37, ((Number) parms[51]).byteValue());
               return;
      }
   }

}

