package app.lectoroptico ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pwbolla extends GXProcedure
{
   public pwbolla( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pwbolla.class ), "" );
   }

   public pwbolla( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             java.util.Date[] aP5 ,
                             java.util.Date[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             byte[] aP9 ,
                             short[] aP10 ,
                             String[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             int[] aP16 ,
                             byte[] aP17 ,
                             String[] aP18 ,
                             short[] aP19 )
   {
      pwbolla.this.aP20 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
      return aP20[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        java.util.Date[] aP5 ,
                        java.util.Date[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        byte[] aP9 ,
                        short[] aP10 ,
                        String[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        java.math.BigDecimal[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        int[] aP16 ,
                        byte[] aP17 ,
                        String[] aP18 ,
                        short[] aP19 ,
                        String[] aP20 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             java.util.Date[] aP5 ,
                             java.util.Date[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             byte[] aP9 ,
                             short[] aP10 ,
                             String[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             int[] aP16 ,
                             byte[] aP17 ,
                             String[] aP18 ,
                             short[] aP19 ,
                             String[] aP20 )
   {
      pwbolla.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pwbolla.this.AV18Maqcod = aP1[0];
      this.aP1 = aP1;
      pwbolla.this.AV8Hisprofec = aP2[0];
      this.aP2 = aP2;
      pwbolla.this.AV9Hisprolin = aP3[0];
      this.aP3 = aP3;
      pwbolla.this.AV10Gruopecod = aP4[0];
      this.aP4 = aP4;
      pwbolla.this.AV11Hisprodti = aP5[0];
      this.aP5 = aP5;
      pwbolla.this.AV12Hisprodtf = aP6[0];
      this.aP6 = aP6;
      pwbolla.this.AV13Hisprokgr = aP7[0];
      this.aP7 = aP7;
      pwbolla.this.AV14Hispromtr = aP8[0];
      this.aP8 = aP8;
      pwbolla.this.AV15Hisprotur = aP9[0];
      this.aP9 = aP9;
      pwbolla.this.AV16parcod = aP10[0];
      this.aP10 = aP10;
      pwbolla.this.AV17Hisprof = aP11[0];
      this.aP11 = aP11;
      pwbolla.this.A4003HisHhMaq = aP12[0];
      this.aP12 = aP12;
      pwbolla.this.AV29Hishhini = aP13[0];
      this.aP13 = aP13;
      pwbolla.this.AV19Station = aP14[0];
      this.aP14 = aP14;
      pwbolla.this.AV20Usurcod = aP15[0];
      this.aP15 = aP15;
      pwbolla.this.AV22Barcod = aP16[0];
      this.aP16 = aP16;
      pwbolla.this.AV23Barcodreo = aP17[0];
      this.aP17 = aP17;
      pwbolla.this.AV24Barcodpar = aP18[0];
      this.aP18 = aP18;
      pwbolla.this.AV25Barordlin = aP19[0];
      this.aP19 = aP19;
      pwbolla.this.AV26Fase = aP20[0];
      this.aP20 = aP20;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV33Var3 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "HHMMSS", "") ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      pwbolla.this.A396EmprCod = GXv_char2[0] ;
      pwbolla.this.GXt_char1 = GXv_char4[0] ;
      AV33Var3 = GXt_char1 ;
      AV33Var3 = ((GXutil.strcmp(AV33Var3, "")==0) ? "01/01/01 05:59:59" : AV33Var3) ;
      AV34Timef = localUtil.ctot( AV33Var3, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      GXt_int5 = AV41torient ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int6) ;
      pwbolla.this.GXt_int5 = GXv_int6[0] ;
      AV41torient = GXt_int5 ;
      /* Using cursor P03G62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV22Barcod), Byte.valueOf(AV23Barcodreo), AV24Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P03G62_A130BarCodPar[0] ;
         A132BarCodReo = P03G62_A132BarCodReo[0] ;
         A129BarCod = P03G62_A129BarCod[0] ;
         A228BarUniMed = P03G62_A228BarUniMed[0] ;
         A148BarEstReo = P03G62_A148BarEstReo[0] ;
         A218BarTipCol = P03G62_A218BarTipCol[0] ;
         AV27BarUnimed = A228BarUniMed ;
         AV32Hisproreo = A148BarEstReo ;
         AV31Hisprotc = A218BarTipCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /*
         INSERT RECORD ON TABLE TXPLHIPRO

      */
      A602MaqCod = AV18Maqcod ;
      A558HisProFec = AV8Hisprofec ;
      A561HisProLin = AV9Hisprolin ;
      A129BarCod = AV22Barcod ;
      A132BarCodReo = AV23Barcodreo ;
      A130BarCodPar = AV24Barcodpar ;
      A194BarOrdLin = AV25Barordlin ;
      A461Fase = AV26Fase ;
      A4441HisProDTF = AV12Hisprodtf ;
      n4441HisProDTF = false ;
      A4440HisProDTI = AV11Hisprodti ;
      n4440HisProDTI = false ;
      A560HisProHin = (byte)(GXutil.hour( AV11Hisprodti)) ;
      A563HisProMin = (byte)(GXutil.minute( AV11Hisprodti)) ;
      A559HisProHfi = (byte)(GXutil.hour( AV12Hisprodtf)) ;
      A562HisProMfi = (byte)(GXutil.minute( AV12Hisprodtf)) ;
      A5607HisProHi = GXutil.resetDate(localUtil.ctot( localUtil.ttoc( AV11Hisprodti, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      A5609HisProHf = GXutil.resetDate(localUtil.ctot( localUtil.ttoc( AV12Hisprodtf, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      A503GruOpeCod = AV10Gruopecod ;
      A557HisProF = AV17Hisprof ;
      A1525HisProKgr = AV13Hisprokgr ;
      A1526HisProMtr = AV14Hispromtr ;
      A566HisProTur = AV15Hisprotur ;
      A656ParCod = AV16parcod ;
      n656ParCod = false ;
      A7394HisProCtr = "*" + httpContext.getMessage( "PC=", "") + AV19Station + httpContext.getMessage( "Operador=", "") + AV20Usurcod + " " + localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_int8[0] = A2247HisProTip ;
      new app.pbustps(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_int8) ;
      pwbolla.this.A396EmprCod = GXv_char4[0] ;
      pwbolla.this.A129BarCod = GXv_int7[0] ;
      pwbolla.this.A132BarCodReo = GXv_int6[0] ;
      pwbolla.this.A130BarCodPar = GXv_char3[0] ;
      pwbolla.this.A2247HisProTip = GXv_int8[0] ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_char2[0] = AV30Hisprolot ;
      GXv_int9[0] = (byte)(0) ;
      GXv_int10[0] = (byte)(0) ;
      GXv_char11[0] = AV26Fase ;
      new app.pmasdat(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_char2, GXv_int9, GXv_int10, GXv_char11) ;
      pwbolla.this.A396EmprCod = GXv_char4[0] ;
      pwbolla.this.A129BarCod = GXv_int7[0] ;
      pwbolla.this.A132BarCodReo = GXv_int6[0] ;
      pwbolla.this.A130BarCodPar = GXv_char3[0] ;
      pwbolla.this.AV30Hisprolot = GXv_char2[0] ;
      pwbolla.this.AV26Fase = GXv_char11[0] ;
      A3610HisProLot = AV30Hisprolot ;
      A3612HisProReo = AV32Hisproreo ;
      A3611HisProTc = AV31Hisprotc ;
      A556HisProEst = (byte)(1) ;
      if ( GXutil.strcmp(AV27BarUnimed, httpContext.getMessage( "K", "")) == 0 )
      {
         A568HisProUni = AV13Hisprokgr ;
      }
      else
      {
         A568HisProUni = AV14Hispromtr ;
      }
      A5606HisProDi = localUtil.ctod( localUtil.ttoc( AV11Hisprodti, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      A5608HisProDf = localUtil.ctod( localUtil.ttoc( AV12Hisprodtf, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      A5607HisProHi = GXutil.resetDate(localUtil.ctot( localUtil.ttoc( AV11Hisprodti, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      A5609HisProHf = GXutil.resetDate(localUtil.ctot( localUtil.ttoc( AV12Hisprodtf, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      A4003HisHhMaq = AV28HisHhmaq ;
      A1060HisHhIni = AV29Hishhini ;
      if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) )
      {
         AV35Diamas = localUtil.ctod( localUtil.ttoc( A4441HisProDTF, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         AV39Time1 = A4441HisProDTF ;
         AV40Var2 = localUtil.ttoc( AV39Time1, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         AV36Min1 = (int)(DecimalUtil.decToDouble((CommonUtil.decimalVal( GXutil.substring( AV40Var2, 1, 2), ".").multiply(DecimalUtil.doubleToDec(60))).add((CommonUtil.decimalVal( GXutil.substring( AV40Var2, 4, 2), "."))))) ;
         AV34Timef = localUtil.ctot( AV33Var3, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         AV40Var2 = localUtil.ttoc( AV34Timef, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         AV37MinF = (int)(DecimalUtil.decToDouble((CommonUtil.decimalVal( GXutil.substring( AV40Var2, 1, 2), ".").multiply(DecimalUtil.doubleToDec(60))).add((CommonUtil.decimalVal( GXutil.substring( AV40Var2, 4, 2), "."))))) ;
         AV38Resto = httpContext.getMessage( "N", "") ;
         AV38Resto = ((AV36Min1<AV37MinF) ? httpContext.getMessage( "S", "") : AV38Resto) ;
         AV42DiaC = ((GXutil.strcmp(AV38Resto, httpContext.getMessage( "S", ""))==0) ? (GXutil.dadd(AV35Diamas,-(1))) : AV35Diamas) ;
         A10360HisProFd = ((AV41torient==0) ? AV42DiaC : A10360HisProFd) ;
      }
      AV21Texto_i = httpContext.getMessage( "Alta Linea", "") + httpContext.getMessage( " Usuario=", "") + AV20Usurcod + httpContext.getMessage( " Terminal=", "") + AV19Station + httpContext.getMessage( " Linea=", "") + GXutil.str( A561HisProLin, 8, 0) + httpContext.getMessage( " Operario=", "") + GXutil.str( A503GruOpeCod, 6, 0) + httpContext.getMessage( " Orden=", "") + GXutil.str( A194BarOrdLin, 4, 0) + httpContext.getMessage( " Kgs=", "") + GXutil.str( A1525HisProKgr, 9, 2) + httpContext.getMessage( " Mts  =", "") + GXutil.str( A1526HisProMtr, 9, 2) + httpContext.getMessage( " Turno=", "") + GXutil.str( A566HisProTur, 1, 0) + httpContext.getMessage( " Fin=", "") + A557HisProF + httpContext.getMessage( " Inicio=", "") + localUtil.ttoc( A4440HisProDTI, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Fin=", "") + localUtil.ttoc( A4441HisProDTF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV46Pgmname, AV20Usurcod, AV19Station, AV21Texto_i, AV22Barcod, AV23Barcodreo, AV24Barcodpar) ;
      /* Using cursor P03G63 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A503GruOpeCod), Short.valueOf(A194BarOrdLin), A461Fase, A568HisProUni, Byte.valueOf(A566HisProTur), Byte.valueOf(A560HisProHin), Byte.valueOf(A563HisProMin), Byte.valueOf(A559HisProHfi), Byte.valueOf(A562HisProMfi), A557HisProF, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod), Byte.valueOf(A556HisProEst), A1525HisProKgr, A1526HisProMtr, A3610HisProLot, Byte.valueOf(A3611HisProTc), Byte.valueOf(A3612HisProReo), Boolean.valueOf(n4440HisProDTI), A4440HisProDTI, Boolean.valueOf(n4441HisProDTF), A4441HisProDTF, A5606HisProDi, A5607HisProHi, A5608HisProDf, A5609HisProHf, A7394HisProCtr, A4003HisHhMaq, A1060HisHhIni, A10360HisProFd});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
      if ( (pr_default.getStatus(1) == 1) )
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pwbolla.this.A396EmprCod;
      this.aP1[0] = pwbolla.this.AV18Maqcod;
      this.aP2[0] = pwbolla.this.AV8Hisprofec;
      this.aP3[0] = pwbolla.this.AV9Hisprolin;
      this.aP4[0] = pwbolla.this.AV10Gruopecod;
      this.aP5[0] = pwbolla.this.AV11Hisprodti;
      this.aP6[0] = pwbolla.this.AV12Hisprodtf;
      this.aP7[0] = pwbolla.this.AV13Hisprokgr;
      this.aP8[0] = pwbolla.this.AV14Hispromtr;
      this.aP9[0] = pwbolla.this.AV15Hisprotur;
      this.aP10[0] = pwbolla.this.AV16parcod;
      this.aP11[0] = pwbolla.this.AV17Hisprof;
      this.aP12[0] = pwbolla.this.A4003HisHhMaq;
      this.aP13[0] = pwbolla.this.AV29Hishhini;
      this.aP14[0] = pwbolla.this.AV19Station;
      this.aP15[0] = pwbolla.this.AV20Usurcod;
      this.aP16[0] = pwbolla.this.AV22Barcod;
      this.aP17[0] = pwbolla.this.AV23Barcodreo;
      this.aP18[0] = pwbolla.this.AV24Barcodpar;
      this.aP19[0] = pwbolla.this.AV25Barordlin;
      this.aP20[0] = pwbolla.this.AV26Fase;
      Application.commitDataStores(context, remoteHandle, pr_default, "lectoroptico.pwbolla");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33Var3 = "" ;
      GXt_char1 = "" ;
      AV34Timef = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P03G62_A396EmprCod = new String[] {""} ;
      P03G62_A130BarCodPar = new String[] {""} ;
      P03G62_A132BarCodReo = new byte[1] ;
      P03G62_A129BarCod = new int[1] ;
      P03G62_A228BarUniMed = new String[] {""} ;
      P03G62_A148BarEstReo = new byte[1] ;
      P03G62_A218BarTipCol = new byte[1] ;
      A130BarCodPar = "" ;
      A228BarUniMed = "" ;
      AV27BarUnimed = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A461Fase = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A5607HisProHi = GXutil.resetTime( GXutil.nullDate() );
      A5609HisProHf = GXutil.resetTime( GXutil.nullDate() );
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A7394HisProCtr = "" ;
      GXv_int8 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      AV30Hisprolot = "" ;
      GXv_char2 = new String[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char11 = new String[1] ;
      A3610HisProLot = "" ;
      A568HisProUni = DecimalUtil.ZERO ;
      A5606HisProDi = GXutil.nullDate() ;
      A5608HisProDf = GXutil.nullDate() ;
      AV28HisHhmaq = DecimalUtil.ZERO ;
      A1060HisHhIni = DecimalUtil.ZERO ;
      AV35Diamas = GXutil.nullDate() ;
      AV39Time1 = GXutil.resetTime( GXutil.nullDate() );
      AV40Var2 = "" ;
      AV38Resto = "" ;
      AV42DiaC = GXutil.nullDate() ;
      A10360HisProFd = GXutil.nullDate() ;
      AV21Texto_i = "" ;
      AV46Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.pwbolla__default(),
         new Object[] {
             new Object[] {
            P03G62_A396EmprCod, P03G62_A130BarCodPar, P03G62_A132BarCodReo, P03G62_A129BarCod, P03G62_A228BarUniMed, P03G62_A148BarEstReo, P03G62_A218BarTipCol
            }
            , new Object[] {
            }
         }
      );
      AV46Pgmname = "LectorOptico.PWBOLLa" ;
      /* GeneXus formulas. */
      AV46Pgmname = "LectorOptico.PWBOLLa" ;
      Gx_err = (short)(0) ;
   }

   private byte AV15Hisprotur ;
   private byte AV23Barcodreo ;
   private byte AV41torient ;
   private byte GXt_int5 ;
   private byte A132BarCodReo ;
   private byte A148BarEstReo ;
   private byte A218BarTipCol ;
   private byte AV32Hisproreo ;
   private byte AV31Hisprotc ;
   private byte A560HisProHin ;
   private byte A563HisProMin ;
   private byte A559HisProHfi ;
   private byte A562HisProMfi ;
   private byte A566HisProTur ;
   private byte GXv_int6[] ;
   private byte GXv_int9[] ;
   private byte GXv_int10[] ;
   private byte A3612HisProReo ;
   private byte A3611HisProTc ;
   private byte A556HisProEst ;
   private short AV16parcod ;
   private short AV25Barordlin ;
   private short A194BarOrdLin ;
   private short A656ParCod ;
   private short A2247HisProTip ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private int AV9Hisprolin ;
   private int AV10Gruopecod ;
   private int AV22Barcod ;
   private int A129BarCod ;
   private int GX_INS59 ;
   private int A561HisProLin ;
   private int A503GruOpeCod ;
   private int GXv_int7[] ;
   private int AV36Min1 ;
   private int AV37MinF ;
   private java.math.BigDecimal AV13Hisprokgr ;
   private java.math.BigDecimal AV14Hispromtr ;
   private java.math.BigDecimal A4003HisHhMaq ;
   private java.math.BigDecimal AV29Hishhini ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal A568HisProUni ;
   private java.math.BigDecimal AV28HisHhmaq ;
   private java.math.BigDecimal A1060HisHhIni ;
   private String A396EmprCod ;
   private String AV18Maqcod ;
   private String AV17Hisprof ;
   private String AV19Station ;
   private String AV20Usurcod ;
   private String AV24Barcodpar ;
   private String AV26Fase ;
   private String AV33Var3 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A228BarUniMed ;
   private String AV27BarUnimed ;
   private String A602MaqCod ;
   private String A461Fase ;
   private String A557HisProF ;
   private String A7394HisProCtr ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV30Hisprolot ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private String A3610HisProLot ;
   private String AV40Var2 ;
   private String AV38Resto ;
   private String AV46Pgmname ;
   private String Gx_emsg ;
   private java.util.Date AV11Hisprodti ;
   private java.util.Date AV12Hisprodtf ;
   private java.util.Date AV34Timef ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A5607HisProHi ;
   private java.util.Date A5609HisProHf ;
   private java.util.Date AV39Time1 ;
   private java.util.Date AV8Hisprofec ;
   private java.util.Date A558HisProFec ;
   private java.util.Date A5606HisProDi ;
   private java.util.Date A5608HisProDf ;
   private java.util.Date AV35Diamas ;
   private java.util.Date AV42DiaC ;
   private java.util.Date A10360HisProFd ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean n656ParCod ;
   private String AV21Texto_i ;
   private String[] aP20 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private int[] aP3 ;
   private int[] aP4 ;
   private java.util.Date[] aP5 ;
   private java.util.Date[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private byte[] aP9 ;
   private short[] aP10 ;
   private String[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private java.math.BigDecimal[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private int[] aP16 ;
   private byte[] aP17 ;
   private String[] aP18 ;
   private short[] aP19 ;
   private IDataStoreProvider pr_default ;
   private String[] P03G62_A396EmprCod ;
   private String[] P03G62_A130BarCodPar ;
   private byte[] P03G62_A132BarCodReo ;
   private int[] P03G62_A129BarCod ;
   private String[] P03G62_A228BarUniMed ;
   private byte[] P03G62_A148BarEstReo ;
   private byte[] P03G62_A218BarTipCol ;
}

final  class pwbolla__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03G62", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarUniMed, BarEstReo, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03G63", "INSERT INTO TXPLHIPRO(EmprCod, MaqCod, HisProFec, HisProLin, BarCod, BarCodReo, BarCodPar, GruOpeCod, BarOrdLin, Fase, HisProUni, HisProTur, HisProHin, HisProMin, HisProHfi, HisProMfi, HisProF, ParCod, HisProEst, HisProKgr, HisProMtr, HisProLot, HisProTc, HisProReo, HisProDTI, HisProDTF, HisProDi, HisProHi, HisProDf, HisProHf, HisProCtr, HisHhMaq, HisHhIni, HisProFd, HisProTte, HisBarTip, HisProTip, HisProCod, HisProBot, HisProNPar, HisProNpzs, HisProBan, HisProDR, EstPecas, HisproTdab, HisproNPd, HisproGf, HisProMq, HisProDibC, HisProDibI, HisProCom, HisProFon, HisProMtHd, HisProKgHd, HisProPzHd, Hisprosec, HisproMtsI, HisProAncI, HisProMtsF, HisProAncF, HisProResi, HisProResA, HisProNFus, HisproFuso, HisProNSup, HisProPsop, HisProTipC, HisproTara) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLHIPRO")
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
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 8);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 1);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[18]).shortValue());
               }
               stmt.setByte(19, ((Number) parms[19]).byteValue());
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[20], 2);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[21], 2);
               stmt.setString(22, (String)parms[22], 10);
               stmt.setByte(23, ((Number) parms[23]).byteValue());
               stmt.setByte(24, ((Number) parms[24]).byteValue());
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(25, (java.util.Date)parms[26], false);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(26, (java.util.Date)parms[28], false);
               }
               stmt.setDate(27, (java.util.Date)parms[29]);
               stmt.setDateTime(28, (java.util.Date)parms[30], true);
               stmt.setDate(29, (java.util.Date)parms[31]);
               stmt.setDateTime(30, (java.util.Date)parms[32], true);
               stmt.setString(31, (String)parms[33], 100);
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[34], 2);
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[35], 2);
               stmt.setDate(34, (java.util.Date)parms[36]);
               return;
      }
   }

}

