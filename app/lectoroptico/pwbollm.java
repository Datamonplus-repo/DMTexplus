package app.lectoroptico ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pwbollm extends GXProcedure
{
   public pwbollm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pwbollm.class ), "" );
   }

   public pwbollm( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
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
                                           short[] aP16 ,
                                           short[] aP17 ,
                                           short[] aP18 ,
                                           java.math.BigDecimal[] aP19 )
   {
      pwbollm.this.aP20 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
                        short[] aP16 ,
                        short[] aP17 ,
                        short[] aP18 ,
                        java.math.BigDecimal[] aP19 ,
                        java.math.BigDecimal[] aP20 )
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
                             short[] aP16 ,
                             short[] aP17 ,
                             short[] aP18 ,
                             java.math.BigDecimal[] aP19 ,
                             java.math.BigDecimal[] aP20 )
   {
      pwbollm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pwbollm.this.AV36Maqcod = aP1[0];
      this.aP1 = aP1;
      pwbollm.this.AV26Hisprofec = aP2[0];
      this.aP2 = aP2;
      pwbollm.this.AV27Hisprolin = aP3[0];
      this.aP3 = aP3;
      pwbollm.this.AV28Gruopecod = aP4[0];
      this.aP4 = aP4;
      pwbollm.this.AV29Hisprodti = aP5[0];
      this.aP5 = aP5;
      pwbollm.this.AV30Hisprodtf = aP6[0];
      this.aP6 = aP6;
      pwbollm.this.AV31Hisprokgr = aP7[0];
      this.aP7 = aP7;
      pwbollm.this.AV32Hispromtr = aP8[0];
      this.aP8 = aP8;
      pwbollm.this.AV33Hisprotur = aP9[0];
      this.aP9 = aP9;
      pwbollm.this.AV34parcod = aP10[0];
      this.aP10 = aP10;
      pwbollm.this.AV35Hisprof = aP11[0];
      this.aP11 = aP11;
      pwbollm.this.AV40Hishhmaq = aP12[0];
      this.aP12 = aP12;
      pwbollm.this.AV41Hishhini = aP13[0];
      this.aP13 = aP13;
      pwbollm.this.AV37Station = aP14[0];
      this.aP14 = aP14;
      pwbollm.this.AV38Usurcod = aP15[0];
      this.aP15 = aP15;
      pwbollm.this.AV42HisProNpzs = aP16[0];
      this.aP16 = aP16;
      pwbollm.this.AV61HisproAncF = aP17[0];
      this.aP17 = aP17;
      pwbollm.this.AV62HisProAncI = aP18[0];
      this.aP18 = aP18;
      pwbollm.this.AV63HisProMtsF = aP19[0];
      this.aP19 = aP19;
      pwbollm.this.AV64HisProMtsI = aP20[0];
      this.aP20 = aP20;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV53Var3 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "HHMMSS", "") ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      pwbollm.this.A396EmprCod = GXv_char2[0] ;
      pwbollm.this.GXt_char1 = GXv_char4[0] ;
      AV53Var3 = GXt_char1 ;
      AV53Var3 = ((GXutil.strcmp(AV53Var3, "")==0) ? "01/01/01 05:59:59" : AV53Var3) ;
      AV51Timef = localUtil.ctot( AV53Var3, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      GXt_int5 = AV56Torient ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int6) ;
      pwbollm.this.GXt_int5 = GXv_int6[0] ;
      AV56Torient = GXt_int5 ;
      AV39Texto_i = "" ;
      /* Using cursor P03G42 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV36Maqcod, AV26Hisprofec, Integer.valueOf(AV27Hisprolin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A561HisProLin = P03G42_A561HisProLin[0] ;
         A558HisProFec = P03G42_A558HisProFec[0] ;
         A602MaqCod = P03G42_A602MaqCod[0] ;
         A656ParCod = P03G42_A656ParCod[0] ;
         n656ParCod = P03G42_n656ParCod[0] ;
         A4441HisProDTF = P03G42_A4441HisProDTF[0] ;
         n4441HisProDTF = P03G42_n4441HisProDTF[0] ;
         A4440HisProDTI = P03G42_A4440HisProDTI[0] ;
         n4440HisProDTI = P03G42_n4440HisProDTI[0] ;
         A557HisProF = P03G42_A557HisProF[0] ;
         A566HisProTur = P03G42_A566HisProTur[0] ;
         A4714HisProNpzs = P03G42_A4714HisProNpzs[0] ;
         A1526HisProMtr = P03G42_A1526HisProMtr[0] ;
         A1525HisProKgr = P03G42_A1525HisProKgr[0] ;
         A503GruOpeCod = P03G42_A503GruOpeCod[0] ;
         A560HisProHin = P03G42_A560HisProHin[0] ;
         A563HisProMin = P03G42_A563HisProMin[0] ;
         A559HisProHfi = P03G42_A559HisProHfi[0] ;
         A562HisProMfi = P03G42_A562HisProMfi[0] ;
         A5607HisProHi = P03G42_A5607HisProHi[0] ;
         A5609HisProHf = P03G42_A5609HisProHf[0] ;
         A7394HisProCtr = P03G42_A7394HisProCtr[0] ;
         A4003HisHhMaq = P03G42_A4003HisHhMaq[0] ;
         A1060HisHhIni = P03G42_A1060HisHhIni[0] ;
         A556HisProEst = P03G42_A556HisProEst[0] ;
         A129BarCod = P03G42_A129BarCod[0] ;
         A132BarCodReo = P03G42_A132BarCodReo[0] ;
         A130BarCodPar = P03G42_A130BarCodPar[0] ;
         A461Fase = P03G42_A461Fase[0] ;
         A3610HisProLot = P03G42_A3610HisProLot[0] ;
         A10360HisProFd = P03G42_A10360HisProFd[0] ;
         A14024HisProAncF = P03G42_A14024HisProAncF[0] ;
         A14022HisProAncI = P03G42_A14022HisProAncI[0] ;
         A14023HisProMtsF = P03G42_A14023HisProMtsF[0] ;
         A14021HisproMtsI = P03G42_A14021HisproMtsI[0] ;
         AV39Texto_i = httpContext.getMessage( "Modifacion Linea", "") + httpContext.getMessage( " Usuario=", "") + AV38Usurcod + httpContext.getMessage( " Terminal=", "") + AV37Station + httpContext.getMessage( " Linea=", "") + GXutil.str( A561HisProLin, 8, 0) + httpContext.getMessage( " OldOperario=", "") + GXutil.str( A503GruOpeCod, 6, 0) + httpContext.getMessage( " Operario=", "") + GXutil.str( AV28Gruopecod, 6, 0) + httpContext.getMessage( " OldKgs=", "") + GXutil.str( A1525HisProKgr, 9, 2) + httpContext.getMessage( " Kgs=", "") + GXutil.str( AV31Hisprokgr, 9, 2) + httpContext.getMessage( " OldMts  =", "") + GXutil.str( A1526HisProMtr, 9, 2) + httpContext.getMessage( " Mts  =", "") + GXutil.str( AV32Hispromtr, 9, 2) + httpContext.getMessage( " OldPzs=", "") + GXutil.str( A4714HisProNpzs, 4, 0) + httpContext.getMessage( " Pzs=", "") + GXutil.str( AV42HisProNpzs, 4, 0) + httpContext.getMessage( " OldTurno=", "") + GXutil.str( A566HisProTur, 1, 0) + httpContext.getMessage( " Turno=", "") + GXutil.str( AV33Hisprotur, 1, 0) + httpContext.getMessage( " OldFin=", "") + A557HisProF + httpContext.getMessage( " Fin=", "") + AV35Hisprof + httpContext.getMessage( " OldInicio=", "") + localUtil.ttoc( A4440HisProDTI, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Inicio=", "") + localUtil.ttoc( AV29Hisprodti, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " OldFin=", "") + localUtil.ttoc( A4441HisProDTF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Fin=", "") + localUtil.ttoc( AV30Hisprodtf, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " OldParo  =", "") + GXutil.str( A656ParCod, 4, 0) + httpContext.getMessage( " Paro=", "") + GXutil.str( AV34parcod, 4, 0) ;
         A4441HisProDTF = AV30Hisprodtf ;
         n4441HisProDTF = false ;
         A4440HisProDTI = AV29Hisprodti ;
         n4440HisProDTI = false ;
         A560HisProHin = (byte)(GXutil.hour( AV29Hisprodti)) ;
         A563HisProMin = (byte)(GXutil.minute( AV29Hisprodti)) ;
         A559HisProHfi = (byte)(GXutil.hour( AV30Hisprodtf)) ;
         A562HisProMfi = (byte)(GXutil.minute( AV30Hisprodtf)) ;
         A5607HisProHi = GXutil.resetDate(localUtil.ctot( localUtil.ttoc( AV29Hisprodti, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         A5609HisProHf = GXutil.resetDate(localUtil.ctot( localUtil.ttoc( AV30Hisprodtf, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         A503GruOpeCod = AV28Gruopecod ;
         A557HisProF = AV35Hisprof ;
         A1525HisProKgr = AV31Hisprokgr ;
         A1526HisProMtr = AV32Hispromtr ;
         A566HisProTur = AV33Hisprotur ;
         A656ParCod = AV34parcod ;
         n656ParCod = false ;
         A7394HisProCtr = "*" + httpContext.getMessage( "PC=", "") + AV37Station + httpContext.getMessage( "Operador=", "") + AV38Usurcod + " " + localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         A4003HisHhMaq = AV40Hishhmaq ;
         A1060HisHhIni = AV41Hishhini ;
         A4714HisProNpzs = AV42HisProNpzs ;
         if ( AV34parcod > 0 )
         {
            if ( GXutil.dateCompare(GXutil.nullDate(), AV30Hisprodtf) )
            {
               A556HisProEst = (byte)(0) ;
            }
         }
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = AV43Hisprolot ;
         GXv_int8[0] = AV44Hisprotc ;
         GXv_int9[0] = AV45Hisproreo ;
         GXv_char10[0] = A461Fase ;
         new app.pmasdat(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_char2, GXv_int8, GXv_int9, GXv_char10) ;
         pwbollm.this.A396EmprCod = GXv_char4[0] ;
         pwbollm.this.A129BarCod = GXv_int7[0] ;
         pwbollm.this.A132BarCodReo = GXv_int6[0] ;
         pwbollm.this.A130BarCodPar = GXv_char3[0] ;
         pwbollm.this.AV43Hisprolot = GXv_char2[0] ;
         pwbollm.this.AV44Hisprotc = GXv_int8[0] ;
         pwbollm.this.AV45Hisproreo = GXv_int9[0] ;
         pwbollm.this.A461Fase = GXv_char10[0] ;
         A3610HisProLot = AV43Hisprolot ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) )
         {
            AV48Diamas = localUtil.ctod( localUtil.ttoc( A4441HisProDTF, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV50Time1 = A4441HisProDTF ;
            AV52Var2 = localUtil.ttoc( AV50Time1, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV54Min1 = (int)(DecimalUtil.decToDouble((CommonUtil.decimalVal( GXutil.substring( AV52Var2, 1, 2), ".").multiply(DecimalUtil.doubleToDec(60))).add((CommonUtil.decimalVal( GXutil.substring( AV52Var2, 4, 2), "."))))) ;
            AV51Timef = localUtil.ctot( AV53Var3, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV52Var2 = localUtil.ttoc( AV51Timef, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV55MinF = (int)(DecimalUtil.decToDouble((CommonUtil.decimalVal( GXutil.substring( AV52Var2, 1, 2), ".").multiply(DecimalUtil.doubleToDec(60))).add((CommonUtil.decimalVal( GXutil.substring( AV52Var2, 4, 2), "."))))) ;
            AV49Resto = httpContext.getMessage( "N", "") ;
            AV49Resto = ((AV54Min1<AV55MinF) ? httpContext.getMessage( "S", "") : AV49Resto) ;
            AV47DiaC = ((GXutil.strcmp(AV49Resto, httpContext.getMessage( "S", ""))==0) ? (GXutil.dadd(AV48Diamas,-(1))) : AV48Diamas) ;
            A10360HisProFd = ((AV56Torient==0) ? AV47DiaC : A10360HisProFd) ;
         }
         A14024HisProAncF = AV61HisproAncF ;
         A14022HisProAncI = AV62HisProAncI ;
         A14023HisProMtsF = AV63HisProMtsF ;
         A14021HisproMtsI = AV64HisProMtsI ;
         /* Using cursor P03G43 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod), Boolean.valueOf(n4441HisProDTF), A4441HisProDTF, Boolean.valueOf(n4440HisProDTI), A4440HisProDTI, A557HisProF, Byte.valueOf(A566HisProTur), Short.valueOf(A4714HisProNpzs), A1526HisProMtr, A1525HisProKgr, Integer.valueOf(A503GruOpeCod), Byte.valueOf(A560HisProHin), Byte.valueOf(A563HisProMin), Byte.valueOf(A559HisProHfi), Byte.valueOf(A562HisProMfi), A5607HisProHi, A5609HisProHf, A7394HisProCtr, A4003HisHhMaq, A1060HisHhIni, Byte.valueOf(A556HisProEst), A3610HisProLot, A10360HisProFd, Short.valueOf(A14024HisProAncF), Short.valueOf(A14022HisProAncI), A14023HisProMtsF, A14021HisproMtsI, A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV39Texto_i, " ") != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV68Pgmname, AV38Usurcod, AV37Station, AV39Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pwbollm.this.A396EmprCod;
      this.aP1[0] = pwbollm.this.AV36Maqcod;
      this.aP2[0] = pwbollm.this.AV26Hisprofec;
      this.aP3[0] = pwbollm.this.AV27Hisprolin;
      this.aP4[0] = pwbollm.this.AV28Gruopecod;
      this.aP5[0] = pwbollm.this.AV29Hisprodti;
      this.aP6[0] = pwbollm.this.AV30Hisprodtf;
      this.aP7[0] = pwbollm.this.AV31Hisprokgr;
      this.aP8[0] = pwbollm.this.AV32Hispromtr;
      this.aP9[0] = pwbollm.this.AV33Hisprotur;
      this.aP10[0] = pwbollm.this.AV34parcod;
      this.aP11[0] = pwbollm.this.AV35Hisprof;
      this.aP12[0] = pwbollm.this.AV40Hishhmaq;
      this.aP13[0] = pwbollm.this.AV41Hishhini;
      this.aP14[0] = pwbollm.this.AV37Station;
      this.aP15[0] = pwbollm.this.AV38Usurcod;
      this.aP16[0] = pwbollm.this.AV42HisProNpzs;
      this.aP17[0] = pwbollm.this.AV61HisproAncF;
      this.aP18[0] = pwbollm.this.AV62HisProAncI;
      this.aP19[0] = pwbollm.this.AV63HisProMtsF;
      this.aP20[0] = pwbollm.this.AV64HisProMtsI;
      Application.commitDataStores(context, remoteHandle, pr_default, "lectoroptico.pwbollm");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV53Var3 = "" ;
      GXt_char1 = "" ;
      AV51Timef = GXutil.resetTime( GXutil.nullDate() );
      AV39Texto_i = "" ;
      scmdbuf = "" ;
      P03G42_A396EmprCod = new String[] {""} ;
      P03G42_A561HisProLin = new int[1] ;
      P03G42_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P03G42_A602MaqCod = new String[] {""} ;
      P03G42_A656ParCod = new short[1] ;
      P03G42_n656ParCod = new boolean[] {false} ;
      P03G42_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P03G42_n4441HisProDTF = new boolean[] {false} ;
      P03G42_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P03G42_n4440HisProDTI = new boolean[] {false} ;
      P03G42_A557HisProF = new String[] {""} ;
      P03G42_A566HisProTur = new byte[1] ;
      P03G42_A4714HisProNpzs = new short[1] ;
      P03G42_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03G42_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03G42_A503GruOpeCod = new int[1] ;
      P03G42_A560HisProHin = new byte[1] ;
      P03G42_A563HisProMin = new byte[1] ;
      P03G42_A559HisProHfi = new byte[1] ;
      P03G42_A562HisProMfi = new byte[1] ;
      P03G42_A5607HisProHi = new java.util.Date[] {GXutil.nullDate()} ;
      P03G42_A5609HisProHf = new java.util.Date[] {GXutil.nullDate()} ;
      P03G42_A7394HisProCtr = new String[] {""} ;
      P03G42_A4003HisHhMaq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03G42_A1060HisHhIni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03G42_A556HisProEst = new byte[1] ;
      P03G42_A129BarCod = new int[1] ;
      P03G42_A132BarCodReo = new byte[1] ;
      P03G42_A130BarCodPar = new String[] {""} ;
      P03G42_A461Fase = new String[] {""} ;
      P03G42_A3610HisProLot = new String[] {""} ;
      P03G42_A10360HisProFd = new java.util.Date[] {GXutil.nullDate()} ;
      P03G42_A14024HisProAncF = new short[1] ;
      P03G42_A14022HisProAncI = new short[1] ;
      P03G42_A14023HisProMtsF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03G42_A14021HisproMtsI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A558HisProFec = GXutil.nullDate() ;
      A602MaqCod = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A557HisProF = "" ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A5607HisProHi = GXutil.resetTime( GXutil.nullDate() );
      A5609HisProHf = GXutil.resetTime( GXutil.nullDate() );
      A7394HisProCtr = "" ;
      A4003HisHhMaq = DecimalUtil.ZERO ;
      A1060HisHhIni = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A461Fase = "" ;
      A3610HisProLot = "" ;
      A10360HisProFd = GXutil.nullDate() ;
      A14023HisProMtsF = DecimalUtil.ZERO ;
      A14021HisproMtsI = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      AV43Hisprolot = "" ;
      GXv_char2 = new String[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char10 = new String[1] ;
      AV48Diamas = GXutil.nullDate() ;
      AV50Time1 = GXutil.resetTime( GXutil.nullDate() );
      AV52Var2 = "" ;
      AV49Resto = "" ;
      AV47DiaC = GXutil.nullDate() ;
      AV68Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.pwbollm__default(),
         new Object[] {
             new Object[] {
            P03G42_A396EmprCod, P03G42_A561HisProLin, P03G42_A558HisProFec, P03G42_A602MaqCod, P03G42_A656ParCod, P03G42_n656ParCod, P03G42_A4441HisProDTF, P03G42_n4441HisProDTF, P03G42_A4440HisProDTI, P03G42_n4440HisProDTI,
            P03G42_A557HisProF, P03G42_A566HisProTur, P03G42_A4714HisProNpzs, P03G42_A1526HisProMtr, P03G42_A1525HisProKgr, P03G42_A503GruOpeCod, P03G42_A560HisProHin, P03G42_A563HisProMin, P03G42_A559HisProHfi, P03G42_A562HisProMfi,
            P03G42_A5607HisProHi, P03G42_A5609HisProHf, P03G42_A7394HisProCtr, P03G42_A4003HisHhMaq, P03G42_A1060HisHhIni, P03G42_A556HisProEst, P03G42_A129BarCod, P03G42_A132BarCodReo, P03G42_A130BarCodPar, P03G42_A461Fase,
            P03G42_A3610HisProLot, P03G42_A10360HisProFd, P03G42_A14024HisProAncF, P03G42_A14022HisProAncI, P03G42_A14023HisProMtsF, P03G42_A14021HisproMtsI
            }
            , new Object[] {
            }
         }
      );
      AV68Pgmname = "LectorOptico.PWBOLLM" ;
      /* GeneXus formulas. */
      AV68Pgmname = "LectorOptico.PWBOLLM" ;
      Gx_err = (short)(0) ;
   }

   private byte AV33Hisprotur ;
   private byte AV56Torient ;
   private byte GXt_int5 ;
   private byte A566HisProTur ;
   private byte A560HisProHin ;
   private byte A563HisProMin ;
   private byte A559HisProHfi ;
   private byte A562HisProMfi ;
   private byte A556HisProEst ;
   private byte A132BarCodReo ;
   private byte GXv_int6[] ;
   private byte AV44Hisprotc ;
   private byte GXv_int8[] ;
   private byte AV45Hisproreo ;
   private byte GXv_int9[] ;
   private short AV34parcod ;
   private short AV42HisProNpzs ;
   private short AV61HisproAncF ;
   private short AV62HisProAncI ;
   private short A656ParCod ;
   private short A4714HisProNpzs ;
   private short A14024HisProAncF ;
   private short A14022HisProAncI ;
   private short Gx_err ;
   private int AV27Hisprolin ;
   private int AV28Gruopecod ;
   private int A561HisProLin ;
   private int A503GruOpeCod ;
   private int A129BarCod ;
   private int GXv_int7[] ;
   private int AV54Min1 ;
   private int AV55MinF ;
   private java.math.BigDecimal AV31Hisprokgr ;
   private java.math.BigDecimal AV32Hispromtr ;
   private java.math.BigDecimal AV40Hishhmaq ;
   private java.math.BigDecimal AV41Hishhini ;
   private java.math.BigDecimal AV63HisProMtsF ;
   private java.math.BigDecimal AV64HisProMtsI ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A4003HisHhMaq ;
   private java.math.BigDecimal A1060HisHhIni ;
   private java.math.BigDecimal A14023HisProMtsF ;
   private java.math.BigDecimal A14021HisproMtsI ;
   private String A396EmprCod ;
   private String AV36Maqcod ;
   private String AV35Hisprof ;
   private String AV37Station ;
   private String AV38Usurcod ;
   private String AV53Var3 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A557HisProF ;
   private String A7394HisProCtr ;
   private String A130BarCodPar ;
   private String A461Fase ;
   private String A3610HisProLot ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV43Hisprolot ;
   private String GXv_char2[] ;
   private String GXv_char10[] ;
   private String AV52Var2 ;
   private String AV49Resto ;
   private String AV68Pgmname ;
   private java.util.Date AV29Hisprodti ;
   private java.util.Date AV30Hisprodtf ;
   private java.util.Date AV51Timef ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A5607HisProHi ;
   private java.util.Date A5609HisProHf ;
   private java.util.Date AV50Time1 ;
   private java.util.Date AV26Hisprofec ;
   private java.util.Date A558HisProFec ;
   private java.util.Date A10360HisProFd ;
   private java.util.Date AV48Diamas ;
   private java.util.Date AV47DiaC ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private String AV39Texto_i ;
   private java.math.BigDecimal[] aP20 ;
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
   private short[] aP16 ;
   private short[] aP17 ;
   private short[] aP18 ;
   private java.math.BigDecimal[] aP19 ;
   private IDataStoreProvider pr_default ;
   private String[] P03G42_A396EmprCod ;
   private int[] P03G42_A561HisProLin ;
   private java.util.Date[] P03G42_A558HisProFec ;
   private String[] P03G42_A602MaqCod ;
   private short[] P03G42_A656ParCod ;
   private boolean[] P03G42_n656ParCod ;
   private java.util.Date[] P03G42_A4441HisProDTF ;
   private boolean[] P03G42_n4441HisProDTF ;
   private java.util.Date[] P03G42_A4440HisProDTI ;
   private boolean[] P03G42_n4440HisProDTI ;
   private String[] P03G42_A557HisProF ;
   private byte[] P03G42_A566HisProTur ;
   private short[] P03G42_A4714HisProNpzs ;
   private java.math.BigDecimal[] P03G42_A1526HisProMtr ;
   private java.math.BigDecimal[] P03G42_A1525HisProKgr ;
   private int[] P03G42_A503GruOpeCod ;
   private byte[] P03G42_A560HisProHin ;
   private byte[] P03G42_A563HisProMin ;
   private byte[] P03G42_A559HisProHfi ;
   private byte[] P03G42_A562HisProMfi ;
   private java.util.Date[] P03G42_A5607HisProHi ;
   private java.util.Date[] P03G42_A5609HisProHf ;
   private String[] P03G42_A7394HisProCtr ;
   private java.math.BigDecimal[] P03G42_A4003HisHhMaq ;
   private java.math.BigDecimal[] P03G42_A1060HisHhIni ;
   private byte[] P03G42_A556HisProEst ;
   private int[] P03G42_A129BarCod ;
   private byte[] P03G42_A132BarCodReo ;
   private String[] P03G42_A130BarCodPar ;
   private String[] P03G42_A461Fase ;
   private String[] P03G42_A3610HisProLot ;
   private java.util.Date[] P03G42_A10360HisProFd ;
   private short[] P03G42_A14024HisProAncF ;
   private short[] P03G42_A14022HisProAncI ;
   private java.math.BigDecimal[] P03G42_A14023HisProMtsF ;
   private java.math.BigDecimal[] P03G42_A14021HisproMtsI ;
}

final  class pwbollm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03G42", "SELECT EmprCod, HisProLin, HisProFec, MaqCod, ParCod, HisProDTF, HisProDTI, HisProF, HisProTur, HisProNpzs, HisProMtr, HisProKgr, GruOpeCod, HisProHin, HisProMin, HisProHfi, HisProMfi, HisProHi, HisProHf, HisProCtr, HisHhMaq, HisHhIni, HisProEst, BarCod, BarCodReo, BarCodPar, Fase, HisProLot, HisProFd, HisProAncF, HisProAncI, HisProMtsF, HisproMtsI FROM TXPLHIPRO WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? and HisProLin = ? ORDER BY EmprCod, MaqCod, HisProFec, HisProLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03G43", "UPDATE TXPLHIPRO SET ParCod=?, HisProDTF=?, HisProDTI=?, HisProF=?, HisProTur=?, HisProNpzs=?, HisProMtr=?, HisProKgr=?, GruOpeCod=?, HisProHin=?, HisProMin=?, HisProHfi=?, HisProMfi=?, HisProHi=?, HisProHf=?, HisProCtr=?, HisHhMaq=?, HisHhIni=?, HisProEst=?, HisProLot=?, HisProFd=?, HisProAncF=?, HisProAncI=?, HisProMtsF=?, HisproMtsI=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLHIPRO")
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((byte[]) buf[16])[0] = rslt.getByte(14);
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               ((byte[]) buf[18])[0] = rslt.getByte(16);
               ((byte[]) buf[19])[0] = rslt.getByte(17);
               ((java.util.Date[]) buf[20])[0] = GXutil.resetDate(rslt.getGXDateTime(18));
               ((java.util.Date[]) buf[21])[0] = GXutil.resetDate(rslt.getGXDateTime(19));
               ((String[]) buf[22])[0] = rslt.getString(20, 100);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(22,2);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((int[]) buf[26])[0] = rslt.getInt(24);
               ((byte[]) buf[27])[0] = rslt.getByte(25);
               ((String[]) buf[28])[0] = rslt.getString(26, 1);
               ((String[]) buf[29])[0] = rslt.getString(27, 8);
               ((String[]) buf[30])[0] = rslt.getString(28, 10);
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(29);
               ((short[]) buf[32])[0] = rslt.getShort(30);
               ((short[]) buf[33])[0] = rslt.getShort(31);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(32,2);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(33,2);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               stmt.setString(4, (String)parms[6], 1);
               stmt.setByte(5, ((Number) parms[7]).byteValue());
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               stmt.setInt(9, ((Number) parms[11]).intValue());
               stmt.setByte(10, ((Number) parms[12]).byteValue());
               stmt.setByte(11, ((Number) parms[13]).byteValue());
               stmt.setByte(12, ((Number) parms[14]).byteValue());
               stmt.setByte(13, ((Number) parms[15]).byteValue());
               stmt.setDateTime(14, (java.util.Date)parms[16], true);
               stmt.setDateTime(15, (java.util.Date)parms[17], true);
               stmt.setString(16, (String)parms[18], 100);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[19], 2);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[20], 2);
               stmt.setByte(19, ((Number) parms[21]).byteValue());
               stmt.setString(20, (String)parms[22], 10);
               stmt.setDate(21, (java.util.Date)parms[23]);
               stmt.setShort(22, ((Number) parms[24]).shortValue());
               stmt.setShort(23, ((Number) parms[25]).shortValue());
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[26], 2);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[27], 2);
               stmt.setString(26, (String)parms[28], 3);
               stmt.setString(27, (String)parms[29], 6);
               stmt.setDate(28, (java.util.Date)parms[30]);
               stmt.setInt(29, ((Number) parms[31]).intValue());
               return;
      }
   }

}

