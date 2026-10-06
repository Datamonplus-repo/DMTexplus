package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aprtftinte extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aprtftinte pgm = new aprtftinte (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      String[][] AV77MaqHdrs;
      {
         int GX_I, GX_J;
         AV77MaqHdrs = new String[100][1000] ;
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            GX_J = 1 ;
            while ( GX_J <= 1000 )
            {
               AV77MaqHdrs[GX_I-1][GX_J-1] = "" ;
               GX_J = (int)(GX_J+1) ;
            }
            GX_I = (int)(GX_I+1) ;
         }
      }
      short[] aP2 = new short[] {0};
      String[] AV114Tab_maqOut;
      {
         int GX_I;
         AV114Tab_maqOut = new String[100] ;
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV114Tab_maqOut[GX_I-1] = "" ;
            GX_I = (int)(GX_I+1) ;
         }
      }
      String[] aP4 = new String[] {""};
      String[] aP5 = new String[] {""};
      String[] aP6 = new String[] {""};

      execute(aP0, AV77MaqHdrs, aP2, AV114Tab_maqOut, aP4, aP5, aP6);
   }

   public aprtftinte( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aprtftinte.class ), "" );
   }

   public aprtftinte( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[][] AV77MaqHdrs ,
                             short[] aP2 ,
                             String[] AV114Tab_maqOut ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      aprtftinte.this.aP6 = new String[] {""};
      execute_int(aP0, AV77MaqHdrs, aP2, AV114Tab_maqOut, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[][] AV77MaqHdrs ,
                        short[] aP2 ,
                        String[] AV114Tab_maqOut ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, AV77MaqHdrs, aP2, AV114Tab_maqOut, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[][] AV77MaqHdrs ,
                             short[] aP2 ,
                             String[] AV114Tab_maqOut ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      aprtftinte.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      aprtftinte.this.AV77MaqHdrs = AV77MaqHdrs;
      aprtftinte.this.AV112NOspMaq = aP2[0];
      this.aP2 = aP2;
      aprtftinte.this.AV114Tab_maqOut = AV114Tab_maqOut;
      aprtftinte.this.AV128Op = aP4[0];
      this.aP4 = aP4;
      aprtftinte.this.AV117NomInf = aP5[0];
      this.aP5 = aP5;
      aprtftinte.this.AV66File = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName(AV117NomInf) ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_int1[0] = AV118Artemalha ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEMH", ""), GXv_int1) ;
         aprtftinte.this.AV118Artemalha = GXv_int1[0] ;
         AV119Lit1 = ((AV118Artemalha==1)||(GXutil.strcmp(AV128Op, httpContext.getMessage( "A", ""))==0) ? httpContext.getMessage( "O.S.", "") : httpContext.getMessage( "Enc.", "")) ;
         h5UQ0( false, 100) ;
         getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114Tab_maqOut[1-1], "")), 58, Gx_line+17, 90, Gx_line+31, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114Tab_maqOut[2-1], "")), 58, Gx_line+33, 90, Gx_line+47, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114Tab_maqOut[3-1], "")), 58, Gx_line+50, 90, Gx_line+64, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114Tab_maqOut[4-1], "")), 58, Gx_line+67, 90, Gx_line+81, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77MaqHdrs[1-1][2-1], "")), 433, Gx_line+17, 491, Gx_line+31, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77MaqHdrs[2-1][2-1], "")), 433, Gx_line+33, 491, Gx_line+47, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(42, Gx_line+0, 742, Gx_line+100, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77MaqHdrs[3-1][2-1], "")), 433, Gx_line+50, 491, Gx_line+64, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77MaqHdrs[4-1][2-1], "")), 433, Gx_line+67, 491, Gx_line+81, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("1,2", 392, Gx_line+17, 409, Gx_line+31, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText("2,2", 392, Gx_line+33, 409, Gx_line+47, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText("4,2", 392, Gx_line+67, 409, Gx_line+81, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText("3,2", 392, Gx_line+50, 409, Gx_line+64, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText("7,2", 525, Gx_line+50, 542, Gx_line+64, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText("8,2", 525, Gx_line+67, 542, Gx_line+81, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText("6,2", 525, Gx_line+33, 542, Gx_line+47, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText("5,2", 525, Gx_line+17, 542, Gx_line+31, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77MaqHdrs[8-1][2-1], "")), 575, Gx_line+67, 633, Gx_line+81, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77MaqHdrs[7-1][2-1], "")), 575, Gx_line+50, 633, Gx_line+64, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77MaqHdrs[6-1][2-1], "")), 575, Gx_line+33, 633, Gx_line+47, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77MaqHdrs[5-1][2-1], "")), 575, Gx_line+17, 633, Gx_line+31, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114Tab_maqOut[8-1], "")), 108, Gx_line+67, 140, Gx_line+81, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114Tab_maqOut[7-1], "")), 108, Gx_line+50, 140, Gx_line+64, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114Tab_maqOut[6-1], "")), 108, Gx_line+33, 140, Gx_line+47, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114Tab_maqOut[5-1], "")), 108, Gx_line+17, 140, Gx_line+31, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+100) ;
         /* Using cursor P05UQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P05UQ2_A407EmprNom[0] ;
            n407EmprNom = P05UQ2_n407EmprNom[0] ;
            AV73EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV111linea = (short)(0) ;
         AV78x = (short)(1) ;
         AV113NumOs = (short)(1) ;
         while ( AV78x <= 100 )
         {
            AV99MaqDsc = AV77MaqHdrs[AV78x-1][1-1] ;
            if ( (GXutil.strcmp("", AV99MaqDsc)==0) )
            {
               if (true) break;
            }
            AV100ImpMaquina = (byte)(0) ;
            AV79y = (short)(2) ;
            AV113NumOs = (short)(1) ;
            while ( AV79y <= 1000 )
            {
               AV81texto = AV77MaqHdrs[AV78x-1][AV79y-1] ;
               if ( ! (GXutil.strcmp("", AV81texto)==0) )
               {
                  if ( AV113NumOs <= AV112NOspMaq )
                  {
                     AV80Maqcod = GXutil.substring( AV81texto, 59, 6) ;
                     /* Execute user subroutine: 'CONTROLMAQUINAARRAY' */
                     S111 ();
                     if ( returnInSub )
                     {
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     if ( GXutil.strcmp(AV116OkMq, httpContext.getMessage( "S", "")) == 0 )
                     {
                        AV120Barordlin = (short)(GXutil.lval( GXutil.substring( AV81texto, 65, 4))) ;
                        /* Using cursor P05UQ3 */
                        pr_default.execute(1, new Object[] {A396EmprCod, AV80Maqcod});
                        while ( (pr_default.getStatus(1) != 101) )
                        {
                           A602MaqCod = P05UQ3_A602MaqCod[0] ;
                           A604MaqCodFor = P05UQ3_A604MaqCodFor[0] ;
                           n604MaqCodFor = P05UQ3_n604MaqCodFor[0] ;
                           AV109MaqCodFor = A604MaqCodFor ;
                           /* Exiting from a For First loop. */
                           if (true) break;
                        }
                        pr_default.close(1);
                        AV82Barcod = (int)(GXutil.lval( GXutil.substring( AV81texto, 27, 8))) ;
                        AV83Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV81texto, 36, 1))) ;
                        AV84Barcodpar = (GXutil.substring( AV81texto, 37, 1)) ;
                        /* Using cursor P05UQ6 */
                        pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV82Barcod), Byte.valueOf(AV83Barcodreo), AV84Barcodpar});
                        while ( (pr_default.getStatus(2) != 101) )
                        {
                           A252CliCod = P05UQ6_A252CliCod[0] ;
                           n252CliCod = P05UQ6_n252CliCod[0] ;
                           A130BarCodPar = P05UQ6_A130BarCodPar[0] ;
                           A132BarCodReo = P05UQ6_A132BarCodReo[0] ;
                           A129BarCod = P05UQ6_A129BarCod[0] ;
                           A1234BarNomCli = P05UQ6_A1234BarNomCli[0] ;
                           A135BarColNom = P05UQ6_A135BarColNom[0] ;
                           A143BarDisNum = P05UQ6_A143BarDisNum[0] ;
                           A4812BarEncCli = P05UQ6_A4812BarEncCli[0] ;
                           A279CliNom = P05UQ6_A279CliNom[0] ;
                           A120BarAgrEst = P05UQ6_A120BarAgrEst[0] ;
                           A1652BarSerDsc = P05UQ6_A1652BarSerDsc[0] ;
                           A166BarKgm = P05UQ6_A166BarKgm[0] ;
                           A219BarTotAgr = P05UQ6_A219BarTotAgr[0] ;
                           n219BarTotAgr = P05UQ6_n219BarTotAgr[0] ;
                           A279CliNom = P05UQ6_A279CliNom[0] ;
                           A166BarKgm = P05UQ6_A166BarKgm[0] ;
                           A219BarTotAgr = P05UQ6_A219BarTotAgr[0] ;
                           n219BarTotAgr = P05UQ6_n219BarTotAgr[0] ;
                           if ( A219BarTotAgr.doubleValue() != 0 )
                           {
                              A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
                           }
                           else
                           {
                              A812RecTotKgm = A166BarKgm ;
                           }
                           AV85hdr = GXutil.str( AV82Barcod, 8, 0) + "-" + GXutil.str( AV83Barcodreo, 1, 0) + AV84Barcodpar ;
                           AV97Barcolnom = ((AV118Artemalha==1) ? GXutil.trim( A135BarColNom) : GXutil.trim( A1234BarNomCli)) ;
                           AV98BarEnccli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? GXutil.trim( A143BarDisNum) : GXutil.trim( A4812BarEncCli)) ;
                           AV98BarEnccli = ((AV118Artemalha==1)||(GXutil.strcmp(AV128Op, httpContext.getMessage( "A", ""))==0) ? GXutil.str( A129BarCod, 8, 0)+"-"+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar : AV98BarEnccli) ;
                           AV101Kilos = A166BarKgm ;
                           AV102Kilost = A812RecTotKgm ;
                           AV105Nlineas = (short)(1) ;
                           AV103BarNot1 = " " ;
                           AV104Barnot2 = " " ;
                           AV121Barnot3 = " " ;
                           AV124BarNot4 = " " ;
                           AV125Barnot5 = " " ;
                           AV126Barnot6 = " " ;
                           if ( GXutil.strcmp(AV128Op, httpContext.getMessage( "T", "")) == 0 )
                           {
                              GX_I = 1 ;
                              while ( GX_I <= 100 )
                              {
                                 AV122TabNotas[GX_I-1] = " " ;
                                 GX_I = (int)(GX_I+1) ;
                              }
                              AV123d = (short)(1) ;
                              /* Using cursor P05UQ7 */
                              pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                              while ( (pr_default.getStatus(3) != 101) )
                              {
                                 A187BarNotDsc = P05UQ7_A187BarNotDsc[0] ;
                                 A188BarNotLin = P05UQ7_A188BarNotLin[0] ;
                                 AV122TabNotas[AV123d-1] = GXutil.substring( A187BarNotDsc, 1, 40) ;
                                 if ( GXutil.strcmp(GXutil.rtrim( GXutil.substring( A187BarNotDsc, 41, 25)), " ") != 0 )
                                 {
                                    AV123d = (short)(AV123d+1) ;
                                    AV122TabNotas[AV123d-1] = GXutil.substring( A187BarNotDsc, 41, 25) ;
                                 }
                                 if ( AV105Nlineas == 1 )
                                 {
                                    AV103BarNot1 = GXutil.substring( A187BarNotDsc, 1, 40) ;
                                    AV104Barnot2 = GXutil.rtrim( GXutil.substring( A187BarNotDsc, 41, 25)) ;
                                    AV104Barnot2 = GXutil.trim( AV104Barnot2) ;
                                 }
                                 if ( AV105Nlineas == 2 )
                                 {
                                    AV104Barnot2 = ((GXutil.strcmp("", AV104Barnot2)==0) ? GXutil.substring( A187BarNotDsc, 1, 40) : AV104Barnot2) ;
                                 }
                                 AV105Nlineas = (short)(AV105Nlineas+1) ;
                                 AV123d = (short)(AV123d+1) ;
                                 pr_default.readNext(3);
                              }
                              pr_default.close(3);
                              AV103BarNot1 = ((GXutil.strcmp(AV122TabNotas[1-1], " ")!=0) ? AV122TabNotas[1-1] : AV103BarNot1) ;
                              AV104Barnot2 = ((GXutil.strcmp(AV122TabNotas[2-1], " ")!=0) ? AV122TabNotas[2-1] : AV104Barnot2) ;
                              AV121Barnot3 = ((GXutil.strcmp(AV122TabNotas[3-1], " ")!=0) ? AV122TabNotas[3-1] : AV121Barnot3) ;
                              AV124BarNot4 = ((GXutil.strcmp(AV122TabNotas[4-1], " ")!=0) ? AV122TabNotas[4-1] : AV124BarNot4) ;
                              AV125Barnot5 = ((GXutil.strcmp(AV122TabNotas[5-1], " ")!=0) ? AV122TabNotas[5-1] : AV125Barnot5) ;
                              AV126Barnot6 = ((GXutil.strcmp(AV122TabNotas[6-1], " ")!=0) ? AV122TabNotas[6-1] : AV126Barnot6) ;
                           }
                           else
                           {
                              /* Using cursor P05UQ8 */
                              pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV120Barordlin)});
                              while ( (pr_default.getStatus(4) != 101) )
                              {
                                 A194BarOrdLin = P05UQ8_A194BarOrdLin[0] ;
                                 A9842BarObsF = P05UQ8_A9842BarObsF[0] ;
                                 n9842BarObsF = P05UQ8_n9842BarObsF[0] ;
                                 A758ProCod = P05UQ8_A758ProCod[0] ;
                                 AV103BarNot1 = GXutil.substring( A9842BarObsF, 1, 40) ;
                                 AV104Barnot2 = GXutil.substring( A9842BarObsF, 41, 25) ;
                                 pr_default.readNext(4);
                              }
                              pr_default.close(4);
                           }
                           GXv_char2[0] = A396EmprCod ;
                           GXv_int3[0] = A129BarCod ;
                           GXv_int1[0] = A132BarCodReo ;
                           GXv_char4[0] = A130BarCodPar ;
                           GXv_int5[0] = AV106BarFasEst ;
                           GXv_date6[0] = AV107fecha ;
                           GXv_char7[0] = AV108Maqcodbis ;
                           new app.pplat07(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int1, GXv_char4, GXv_int5, GXv_date6, GXv_char7) ;
                           aprtftinte.this.A396EmprCod = GXv_char2[0] ;
                           aprtftinte.this.A129BarCod = GXv_int3[0] ;
                           aprtftinte.this.A132BarCodReo = GXv_int1[0] ;
                           aprtftinte.this.A130BarCodPar = GXv_char4[0] ;
                           aprtftinte.this.AV106BarFasEst = GXv_int5[0] ;
                           aprtftinte.this.AV107fecha = GXv_date6[0] ;
                           aprtftinte.this.AV108Maqcodbis = GXv_char7[0] ;
                           AV110Clinom = GXutil.substring( A279CliNom, 1, 25) ;
                           if ( ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV128Op, httpContext.getMessage( "A", "")) != 0 ) )
                           {
                              if ( AV79y == 2 )
                              {
                                 if ( AV106BarFasEst == 1 )
                                 {
                                    AV111linea = (short)(AV111linea+1) ;
                                    h5UQ0( false, 15) ;
                                    getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Barcolnom, "")), 49, Gx_line+1, 118, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110Clinom, "")), 127, Gx_line+1, 258, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98BarEnccli, "")), 413, Gx_line+1, 466, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 269, Gx_line+1, 405, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV101Kilos, "ZZZ9.99")), 474, Gx_line+1, 511, Gx_line+15, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV102Kilost, "ZZZ9.99")), 520, Gx_line+1, 557, Gx_line+15, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109MaqCodFor, "")), 7, Gx_line+1, 39, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV103BarNot1, "")), 566, Gx_line+1, 775, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 else
                                 {
                                    AV111linea = (short)(AV111linea+1) ;
                                    h5UQ0( false, 15) ;
                                    getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Barcolnom, "")), 49, Gx_line+1, 118, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110Clinom, "")), 127, Gx_line+1, 258, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98BarEnccli, "")), 413, Gx_line+1, 466, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 269, Gx_line+1, 405, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV101Kilos, "ZZZ9.99")), 474, Gx_line+1, 511, Gx_line+15, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV102Kilost, "ZZZ9.99")), 520, Gx_line+1, 557, Gx_line+15, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109MaqCodFor, "")), 7, Gx_line+1, 39, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV103BarNot1, "")), 566, Gx_line+1, 775, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV104Barnot2, "") != 0 )
                                 {
                                    if ( AV106BarFasEst == 1 )
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Barnot2, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Barnot2, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    AV111linea = (short)(AV111linea+1) ;
                                 }
                                 if ( GXutil.strcmp(AV121Barnot3, "") != 0 )
                                 {
                                    AV127Barnot = AV121Barnot3 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    if ( AV106BarFasEst == 1 )
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                                 if ( GXutil.strcmp(AV124BarNot4, "") != 0 )
                                 {
                                    AV127Barnot = AV124BarNot4 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    if ( AV106BarFasEst == 1 )
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                                 if ( GXutil.strcmp(AV125Barnot5, "") != 0 )
                                 {
                                    AV127Barnot = AV125Barnot5 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    if ( AV106BarFasEst == 1 )
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                                 if ( GXutil.strcmp(AV126Barnot6, "") != 0 )
                                 {
                                    AV127Barnot = AV126Barnot6 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    if ( AV106BarFasEst == 1 )
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                                 /* Using cursor P05UQ9 */
                                 pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                 while ( (pr_default.getStatus(5) != 101) )
                                 {
                                    A122BarAgrPar = P05UQ9_A122BarAgrPar[0] ;
                                    A124BarAgrReo = P05UQ9_A124BarAgrReo[0] ;
                                    A119BarAgrCod = P05UQ9_A119BarAgrCod[0] ;
                                    AV85hdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
                                    GXv_char7[0] = A396EmprCod ;
                                    GXv_int3[0] = A119BarAgrCod ;
                                    GXv_int5[0] = A124BarAgrReo ;
                                    GXv_char4[0] = A122BarAgrPar ;
                                    GXv_decimal8[0] = AV87BarKgmAgr ;
                                    GXv_decimal9[0] = AV88BarMtrAgr ;
                                    GXv_int10[0] = AV89BarPieagr ;
                                    GXv_char2[0] = AV90BarAgrSer ;
                                    GXv_char11[0] = AV91Barcolnomagr ;
                                    GXv_int12[0] = 0 ;
                                    GXv_int1[0] = (byte)(0) ;
                                    GXv_char13[0] = "" ;
                                    GXv_date6[0] = AV74Fec1 ;
                                    GXv_int14[0] = (byte)(0) ;
                                    GXv_char15[0] = AV93BarEnccliAgr ;
                                    GXv_char16[0] = "" ;
                                    GXv_int17[0] = 0 ;
                                    GXv_date18[0] = AV95fec2 ;
                                    GXv_char19[0] = "" ;
                                    GXv_char20[0] = AV92barserdscAgr ;
                                    GXv_int21[0] = 0 ;
                                    GXv_date22[0] = AV94fec3 ;
                                    GXv_char23[0] = AV96BarNomcliAgr ;
                                    new app.pinfagr(remoteHandle, context).execute( GXv_char7, GXv_int3, GXv_int5, GXv_char4, GXv_decimal8, GXv_decimal9, GXv_int10, GXv_char2, GXv_char11, GXv_int12, GXv_int1, GXv_char13, GXv_date6, GXv_int14, GXv_char15, GXv_char16, GXv_int17, GXv_date18, GXv_char19, GXv_char20, GXv_int21, GXv_date22, GXv_char23) ;
                                    aprtftinte.this.A396EmprCod = GXv_char7[0] ;
                                    aprtftinte.this.A119BarAgrCod = GXv_int3[0] ;
                                    aprtftinte.this.A124BarAgrReo = GXv_int5[0] ;
                                    aprtftinte.this.A122BarAgrPar = GXv_char4[0] ;
                                    aprtftinte.this.AV87BarKgmAgr = GXv_decimal8[0] ;
                                    aprtftinte.this.AV88BarMtrAgr = GXv_decimal9[0] ;
                                    aprtftinte.this.AV89BarPieagr = GXv_int10[0] ;
                                    aprtftinte.this.AV90BarAgrSer = GXv_char2[0] ;
                                    aprtftinte.this.AV91Barcolnomagr = GXv_char11[0] ;
                                    aprtftinte.this.AV74Fec1 = GXv_date6[0] ;
                                    aprtftinte.this.AV93BarEnccliAgr = GXv_char15[0] ;
                                    aprtftinte.this.AV95fec2 = GXv_date18[0] ;
                                    aprtftinte.this.AV92barserdscAgr = GXv_char20[0] ;
                                    aprtftinte.this.AV94fec3 = GXv_date22[0] ;
                                    aprtftinte.this.AV96BarNomcliAgr = GXv_char23[0] ;
                                    AV93BarEnccliAgr = ((AV118Artemalha==1)||(GXutil.strcmp(AV128Op, httpContext.getMessage( "A", ""))==0) ? GXutil.str( A119BarAgrCod, 8, 0)+"-"+GXutil.str( A124BarAgrReo, 1, 0)+A122BarAgrPar : AV93BarEnccliAgr) ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    if ( AV106BarFasEst == 1 )
                                    {
                                       h5UQ0( false, 17) ;
                                       getPrinter().GxAttris("Courier New", 7, false, true, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92barserdscAgr, "")), 269, Gx_line+0, 405, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93BarEnccliAgr, "")), 413, Gx_line+0, 466, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87BarKgmAgr, "ZZZ9.99")), 474, Gx_line+0, 511, Gx_line+14, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+17) ;
                                    }
                                    else
                                    {
                                       h5UQ0( false, 17) ;
                                       getPrinter().GxAttris("Courier New", 7, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92barserdscAgr, "")), 269, Gx_line+0, 405, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93BarEnccliAgr, "")), 413, Gx_line+0, 466, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87BarKgmAgr, "ZZZ9.99")), 474, Gx_line+0, 511, Gx_line+14, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+17) ;
                                    }
                                    pr_default.readNext(5);
                                 }
                                 pr_default.close(5);
                              }
                              else
                              {
                                 AV111linea = (short)(AV111linea+1) ;
                                 h5UQ0( false, 15) ;
                                 getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109MaqCodFor, "")), 7, Gx_line+1, 39, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Barcolnom, "")), 49, Gx_line+1, 118, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110Clinom, "")), 127, Gx_line+1, 258, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98BarEnccli, "")), 413, Gx_line+1, 466, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 269, Gx_line+1, 405, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV101Kilos, "ZZZ9.99")), 474, Gx_line+1, 511, Gx_line+15, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV102Kilost, "ZZZ9.99")), 520, Gx_line+1, 557, Gx_line+15, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV103BarNot1, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+15) ;
                                 if ( GXutil.strcmp(AV104Barnot2, "") != 0 )
                                 {
                                    AV111linea = (short)(AV111linea+1) ;
                                    h5UQ0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Barnot2, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV121Barnot3, "") != 0 )
                                 {
                                    AV127Barnot = AV121Barnot3 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    h5UQ0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV124BarNot4, "") != 0 )
                                 {
                                    AV127Barnot = AV124BarNot4 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    h5UQ0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV125Barnot5, "") != 0 )
                                 {
                                    AV127Barnot = AV125Barnot5 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    h5UQ0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV126Barnot6, "") != 0 )
                                 {
                                    AV127Barnot = AV126Barnot6 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    h5UQ0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 /* Using cursor P05UQ10 */
                                 pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                 while ( (pr_default.getStatus(6) != 101) )
                                 {
                                    A122BarAgrPar = P05UQ10_A122BarAgrPar[0] ;
                                    A124BarAgrReo = P05UQ10_A124BarAgrReo[0] ;
                                    A119BarAgrCod = P05UQ10_A119BarAgrCod[0] ;
                                    AV85hdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
                                    GXv_char23[0] = A396EmprCod ;
                                    GXv_int21[0] = A119BarAgrCod ;
                                    GXv_int14[0] = A124BarAgrReo ;
                                    GXv_char20[0] = A122BarAgrPar ;
                                    GXv_decimal9[0] = AV87BarKgmAgr ;
                                    GXv_decimal8[0] = AV88BarMtrAgr ;
                                    GXv_int17[0] = AV89BarPieagr ;
                                    GXv_char19[0] = AV90BarAgrSer ;
                                    GXv_char16[0] = AV91Barcolnomagr ;
                                    GXv_int12[0] = 0 ;
                                    GXv_int5[0] = (byte)(0) ;
                                    GXv_char15[0] = "" ;
                                    GXv_date22[0] = AV74Fec1 ;
                                    GXv_int1[0] = (byte)(0) ;
                                    GXv_char13[0] = AV93BarEnccliAgr ;
                                    GXv_char11[0] = "" ;
                                    GXv_int10[0] = 0 ;
                                    GXv_date18[0] = AV95fec2 ;
                                    GXv_char7[0] = "" ;
                                    GXv_char4[0] = AV92barserdscAgr ;
                                    GXv_int3[0] = 0 ;
                                    GXv_date6[0] = AV94fec3 ;
                                    GXv_char2[0] = AV96BarNomcliAgr ;
                                    new app.pinfagr(remoteHandle, context).execute( GXv_char23, GXv_int21, GXv_int14, GXv_char20, GXv_decimal9, GXv_decimal8, GXv_int17, GXv_char19, GXv_char16, GXv_int12, GXv_int5, GXv_char15, GXv_date22, GXv_int1, GXv_char13, GXv_char11, GXv_int10, GXv_date18, GXv_char7, GXv_char4, GXv_int3, GXv_date6, GXv_char2) ;
                                    aprtftinte.this.A396EmprCod = GXv_char23[0] ;
                                    aprtftinte.this.A119BarAgrCod = GXv_int21[0] ;
                                    aprtftinte.this.A124BarAgrReo = GXv_int14[0] ;
                                    aprtftinte.this.A122BarAgrPar = GXv_char20[0] ;
                                    aprtftinte.this.AV87BarKgmAgr = GXv_decimal9[0] ;
                                    aprtftinte.this.AV88BarMtrAgr = GXv_decimal8[0] ;
                                    aprtftinte.this.AV89BarPieagr = GXv_int17[0] ;
                                    aprtftinte.this.AV90BarAgrSer = GXv_char19[0] ;
                                    aprtftinte.this.AV91Barcolnomagr = GXv_char16[0] ;
                                    aprtftinte.this.AV74Fec1 = GXv_date22[0] ;
                                    aprtftinte.this.AV93BarEnccliAgr = GXv_char13[0] ;
                                    aprtftinte.this.AV95fec2 = GXv_date18[0] ;
                                    aprtftinte.this.AV92barserdscAgr = GXv_char4[0] ;
                                    aprtftinte.this.AV94fec3 = GXv_date6[0] ;
                                    aprtftinte.this.AV96BarNomcliAgr = GXv_char2[0] ;
                                    AV93BarEnccliAgr = ((AV118Artemalha==1)||(GXutil.strcmp(AV128Op, httpContext.getMessage( "A", ""))==0) ? GXutil.str( A119BarAgrCod, 8, 0)+"-"+GXutil.str( A124BarAgrReo, 1, 0)+A122BarAgrPar : AV93BarEnccliAgr) ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    h5UQ0( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 7, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92barserdscAgr, "")), 269, Gx_line+0, 405, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93BarEnccliAgr, "")), 413, Gx_line+0, 466, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87BarKgmAgr, "ZZZ9.99")), 474, Gx_line+0, 511, Gx_line+14, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                    pr_default.readNext(6);
                                 }
                                 pr_default.close(6);
                              }
                           }
                           else
                           {
                              if ( AV79y == 2 )
                              {
                                 if ( AV106BarFasEst == 1 )
                                 {
                                    AV111linea = (short)(AV111linea+1) ;
                                    h5UQ0( false, 15) ;
                                    getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Barcolnom, "")), 49, Gx_line+1, 118, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110Clinom, "")), 127, Gx_line+1, 258, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98BarEnccli, "")), 413, Gx_line+1, 466, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 269, Gx_line+1, 405, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV101Kilos, "ZZZ9.99")), 474, Gx_line+1, 511, Gx_line+15, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV102Kilost, "ZZZ9.99")), 520, Gx_line+1, 557, Gx_line+15, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109MaqCodFor, "")), 7, Gx_line+1, 39, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV103BarNot1, "")), 566, Gx_line+1, 775, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 else
                                 {
                                    AV111linea = (short)(AV111linea+1) ;
                                    h5UQ0( false, 15) ;
                                    getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Barcolnom, "")), 49, Gx_line+1, 118, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110Clinom, "")), 127, Gx_line+1, 258, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98BarEnccli, "")), 413, Gx_line+1, 466, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 269, Gx_line+1, 405, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV101Kilos, "ZZZ9.99")), 474, Gx_line+1, 511, Gx_line+15, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV102Kilost, "ZZZ9.99")), 520, Gx_line+1, 557, Gx_line+15, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109MaqCodFor, "")), 7, Gx_line+1, 39, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV103BarNot1, "")), 566, Gx_line+1, 775, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV104Barnot2, "") != 0 )
                                 {
                                    AV127Barnot = AV104Barnot2 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    if ( AV106BarFasEst == 1 )
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                                 if ( GXutil.strcmp(AV121Barnot3, "") != 0 )
                                 {
                                    AV127Barnot = AV121Barnot3 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    if ( AV106BarFasEst == 1 )
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                                 if ( GXutil.strcmp(AV124BarNot4, "") != 0 )
                                 {
                                    AV127Barnot = AV124BarNot4 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    if ( AV106BarFasEst == 1 )
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                                 if ( GXutil.strcmp(AV125Barnot5, "") != 0 )
                                 {
                                    AV127Barnot = AV125Barnot5 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    if ( AV106BarFasEst == 1 )
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                                 if ( GXutil.strcmp(AV126Barnot6, "") != 0 )
                                 {
                                    AV127Barnot = AV126Barnot6 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    if ( AV106BarFasEst == 1 )
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h5UQ0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                              }
                              else
                              {
                                 AV111linea = (short)(AV111linea+1) ;
                                 h5UQ0( false, 15) ;
                                 getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109MaqCodFor, "")), 7, Gx_line+1, 39, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Barcolnom, "")), 49, Gx_line+1, 118, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110Clinom, "")), 127, Gx_line+1, 258, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98BarEnccli, "")), 413, Gx_line+1, 466, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 269, Gx_line+1, 405, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV101Kilos, "ZZZ9.99")), 474, Gx_line+1, 511, Gx_line+15, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV102Kilost, "ZZZ9.99")), 520, Gx_line+1, 557, Gx_line+15, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV103BarNot1, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+15) ;
                                 if ( GXutil.strcmp(AV104Barnot2, "") != 0 )
                                 {
                                    AV111linea = (short)(AV111linea+1) ;
                                    h5UQ0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Barnot2, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV121Barnot3, "") != 0 )
                                 {
                                    AV127Barnot = AV121Barnot3 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    h5UQ0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV124BarNot4, "") != 0 )
                                 {
                                    AV127Barnot = AV124BarNot4 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    h5UQ0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV125Barnot5, "") != 0 )
                                 {
                                    AV127Barnot = AV125Barnot5 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    h5UQ0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV126Barnot6, "") != 0 )
                                 {
                                    AV127Barnot = AV126Barnot6 ;
                                    AV111linea = (short)(AV111linea+1) ;
                                    h5UQ0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                              }
                           }
                           /* Exiting from a For First loop. */
                           if (true) break;
                        }
                        pr_default.close(2);
                        AV100ImpMaquina = (byte)(1) ;
                        AV113NumOs = (short)(AV113NumOs+1) ;
                     }
                  }
               }
               AV79y = (short)(AV79y+1) ;
            }
            if ( AV100ImpMaquina == 1 )
            {
               AV111linea = (short)(AV111linea+1) ;
               h5UQ0( false, 4) ;
               getPrinter().GxDrawLine(44, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+4, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+4) ;
            }
            AV100ImpMaquina = (byte)(0) ;
            AV78x = (short)(AV78x+1) ;
         }
         System.out.println( httpContext.getMessage( "Informe RTF generado", "") );
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5UQ0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'CONTROLMAQUINAARRAY' Routine */
      returnInSub = false ;
      AV115i = (short)(1) ;
      AV116OkMq = httpContext.getMessage( "N", "") ;
      while ( AV115i <= 100 )
      {
         if ( GXutil.strcmp(AV114Tab_maqOut[AV115i-1], "") == 0 )
         {
            if (true) break;
         }
         if ( GXutil.strcmp(AV80Maqcod, AV114Tab_maqOut[AV115i-1]) == 0 )
         {
            AV116OkMq = httpContext.getMessage( "S", "") ;
            if (true) break;
         }
         AV115i = (short)(AV115i+1) ;
      }
   }

   public void h5UQ0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 651, Gx_line+0, 694, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 701, Gx_line+0, 744, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dia-Hora", ""), 601, Gx_line+0, 644, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 653, Gx_line+23, 685, Gx_line+37, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 702, Gx_line+23, 750, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("/", 694, Gx_line+23, 700, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 601, Gx_line+23, 633, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73EmprNom, "")), 14, Gx_line+6, 203, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV112NOspMaq), "ZZZ9")), 263, Gx_line+30, 285, Gx_line+44, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV117NomInf, "")), 14, Gx_line+29, 203, Gx_line+45, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+50) ;
            getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maq.", ""), 7, Gx_line+8, 33, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 75, Gx_line+8, 93, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 186, Gx_line+8, 222, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 325, Gx_line+8, 355, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peso", ""), 490, Gx_line+8, 514, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 532, Gx_line+8, 556, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Obs", ""), 676, Gx_line+8, 695, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(2, Gx_line+1, 2, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(121, Gx_line+1, 121, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(263, Gx_line+1, 263, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(407, Gx_line+1, 407, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(470, Gx_line+1, 470, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(516, Gx_line+1, 516, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(561, Gx_line+1, 561, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(44, Gx_line+1, 44, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(776, Gx_line+1, 776, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119Lit1, "")), 424, Gx_line+8, 453, Gx_line+22, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+29) ;
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
      add_metrics3( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Calibri", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", false, true, 56, 14, 70, 118,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 18, 22, 35, 35, 56, 42, 12, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 18, 18, 37, 37, 37, 35, 64, 42, 42, 45, 45, 42, 38, 49, 45, 18, 32, 42, 35, 53, 45, 49, 42, 49, 45, 42, 38, 45, 42, 61, 42, 42, 38, 18, 18, 18, 30, 35, 21, 35, 35, 32, 35, 35, 18, 35, 35, 14, 14, 32, 14, 52, 35, 35, 35, 35, 21, 32, 18, 35, 32, 45, 32, 32, 29, 21, 16, 21, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 35, 35, 34, 35, 16, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 20, 21, 35, 34, 21, 21, 20, 23, 35, 53, 53, 53, 38, 42, 42, 42, 42, 42, 42, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 32, 35, 35, 35, 35, 18, 18, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 38, 35, 35, 35, 35, 32, 35, 32}) ;
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(prtftinte.class);
      return new app.GXcfg();
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
      this.aP0[0] = aprtftinte.this.A396EmprCod;
      this.aP2[0] = aprtftinte.this.AV112NOspMaq;
      this.aP4[0] = aprtftinte.this.AV128Op;
      this.aP5[0] = aprtftinte.this.AV117NomInf;
      this.aP6[0] = aprtftinte.this.AV66File;
      if (Application.realMainProgram == this)	waitPrinterEnd();
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV119Lit1 = "" ;
      scmdbuf = "" ;
      P05UQ2_A396EmprCod = new String[] {""} ;
      P05UQ2_A407EmprNom = new String[] {""} ;
      P05UQ2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV73EmprNom = "" ;
      AV99MaqDsc = "" ;
      AV81texto = "" ;
      AV80Maqcod = "" ;
      AV116OkMq = "" ;
      P05UQ3_A396EmprCod = new String[] {""} ;
      P05UQ3_A602MaqCod = new String[] {""} ;
      P05UQ3_A604MaqCodFor = new String[] {""} ;
      P05UQ3_n604MaqCodFor = new boolean[] {false} ;
      A602MaqCod = "" ;
      A604MaqCodFor = "" ;
      AV109MaqCodFor = "" ;
      AV84Barcodpar = "" ;
      P05UQ6_A252CliCod = new int[1] ;
      P05UQ6_n252CliCod = new boolean[] {false} ;
      P05UQ6_A396EmprCod = new String[] {""} ;
      P05UQ6_A130BarCodPar = new String[] {""} ;
      P05UQ6_A132BarCodReo = new byte[1] ;
      P05UQ6_A129BarCod = new int[1] ;
      P05UQ6_A1234BarNomCli = new String[] {""} ;
      P05UQ6_A135BarColNom = new String[] {""} ;
      P05UQ6_A143BarDisNum = new String[] {""} ;
      P05UQ6_A4812BarEncCli = new String[] {""} ;
      P05UQ6_A279CliNom = new String[] {""} ;
      P05UQ6_A120BarAgrEst = new String[] {""} ;
      P05UQ6_A1652BarSerDsc = new String[] {""} ;
      P05UQ6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05UQ6_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05UQ6_n219BarTotAgr = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A279CliNom = "" ;
      A120BarAgrEst = "" ;
      A1652BarSerDsc = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      AV85hdr = "" ;
      AV97Barcolnom = "" ;
      AV98BarEnccli = "" ;
      AV101Kilos = DecimalUtil.ZERO ;
      AV102Kilost = DecimalUtil.ZERO ;
      AV103BarNot1 = "" ;
      AV104Barnot2 = "" ;
      AV121Barnot3 = "" ;
      AV124BarNot4 = "" ;
      AV125Barnot5 = "" ;
      AV126Barnot6 = "" ;
      AV122TabNotas = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV122TabNotas[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05UQ7_A396EmprCod = new String[] {""} ;
      P05UQ7_A129BarCod = new int[1] ;
      P05UQ7_A132BarCodReo = new byte[1] ;
      P05UQ7_A130BarCodPar = new String[] {""} ;
      P05UQ7_A187BarNotDsc = new String[] {""} ;
      P05UQ7_A188BarNotLin = new byte[1] ;
      A187BarNotDsc = "" ;
      P05UQ8_A396EmprCod = new String[] {""} ;
      P05UQ8_A129BarCod = new int[1] ;
      P05UQ8_A132BarCodReo = new byte[1] ;
      P05UQ8_A130BarCodPar = new String[] {""} ;
      P05UQ8_A194BarOrdLin = new short[1] ;
      P05UQ8_A9842BarObsF = new String[] {""} ;
      P05UQ8_n9842BarObsF = new boolean[] {false} ;
      P05UQ8_A758ProCod = new String[] {""} ;
      A9842BarObsF = "" ;
      A758ProCod = "" ;
      AV107fecha = GXutil.nullDate() ;
      AV108Maqcodbis = "" ;
      AV110Clinom = "" ;
      AV127Barnot = "" ;
      P05UQ9_A396EmprCod = new String[] {""} ;
      P05UQ9_A129BarCod = new int[1] ;
      P05UQ9_A132BarCodReo = new byte[1] ;
      P05UQ9_A130BarCodPar = new String[] {""} ;
      P05UQ9_A122BarAgrPar = new String[] {""} ;
      P05UQ9_A124BarAgrReo = new byte[1] ;
      P05UQ9_A119BarAgrCod = new int[1] ;
      A122BarAgrPar = "" ;
      AV87BarKgmAgr = DecimalUtil.ZERO ;
      AV88BarMtrAgr = DecimalUtil.ZERO ;
      AV90BarAgrSer = "" ;
      AV91Barcolnomagr = "" ;
      AV74Fec1 = GXutil.nullDate() ;
      AV93BarEnccliAgr = "" ;
      AV95fec2 = GXutil.nullDate() ;
      AV92barserdscAgr = "" ;
      AV94fec3 = GXutil.nullDate() ;
      AV96BarNomcliAgr = "" ;
      P05UQ10_A396EmprCod = new String[] {""} ;
      P05UQ10_A129BarCod = new int[1] ;
      P05UQ10_A132BarCodReo = new byte[1] ;
      P05UQ10_A130BarCodPar = new String[] {""} ;
      P05UQ10_A122BarAgrPar = new String[] {""} ;
      P05UQ10_A124BarAgrReo = new byte[1] ;
      P05UQ10_A119BarAgrCod = new int[1] ;
      GXv_char23 = new String[1] ;
      GXv_int21 = new int[1] ;
      GXv_int14 = new byte[1] ;
      GXv_char20 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int17 = new int[1] ;
      GXv_char19 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char15 = new String[1] ;
      GXv_date22 = new java.util.Date[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char13 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_date18 = new java.util.Date[1] ;
      GXv_char7 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aprtftinte__default(),
         new Object[] {
             new Object[] {
            P05UQ2_A396EmprCod, P05UQ2_A407EmprNom, P05UQ2_n407EmprNom
            }
            , new Object[] {
            P05UQ3_A396EmprCod, P05UQ3_A602MaqCod, P05UQ3_A604MaqCodFor, P05UQ3_n604MaqCodFor
            }
            , new Object[] {
            P05UQ6_A252CliCod, P05UQ6_n252CliCod, P05UQ6_A396EmprCod, P05UQ6_A130BarCodPar, P05UQ6_A132BarCodReo, P05UQ6_A129BarCod, P05UQ6_A1234BarNomCli, P05UQ6_A135BarColNom, P05UQ6_A143BarDisNum, P05UQ6_A4812BarEncCli,
            P05UQ6_A279CliNom, P05UQ6_A120BarAgrEst, P05UQ6_A1652BarSerDsc, P05UQ6_A166BarKgm, P05UQ6_A219BarTotAgr, P05UQ6_n219BarTotAgr
            }
            , new Object[] {
            P05UQ7_A396EmprCod, P05UQ7_A129BarCod, P05UQ7_A132BarCodReo, P05UQ7_A130BarCodPar, P05UQ7_A187BarNotDsc, P05UQ7_A188BarNotLin
            }
            , new Object[] {
            P05UQ8_A396EmprCod, P05UQ8_A129BarCod, P05UQ8_A132BarCodReo, P05UQ8_A130BarCodPar, P05UQ8_A194BarOrdLin, P05UQ8_A9842BarObsF, P05UQ8_n9842BarObsF, P05UQ8_A758ProCod
            }
            , new Object[] {
            P05UQ9_A396EmprCod, P05UQ9_A129BarCod, P05UQ9_A132BarCodReo, P05UQ9_A130BarCodPar, P05UQ9_A122BarAgrPar, P05UQ9_A124BarAgrReo, P05UQ9_A119BarAgrCod
            }
            , new Object[] {
            P05UQ10_A396EmprCod, P05UQ10_A129BarCod, P05UQ10_A132BarCodReo, P05UQ10_A130BarCodPar, P05UQ10_A122BarAgrPar, P05UQ10_A124BarAgrReo, P05UQ10_A119BarAgrCod
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV118Artemalha ;
   private byte AV100ImpMaquina ;
   private byte AV83Barcodreo ;
   private byte A132BarCodReo ;
   private byte A188BarNotLin ;
   private byte AV106BarFasEst ;
   private byte A124BarAgrReo ;
   private byte GXv_int14[] ;
   private byte GXv_int5[] ;
   private byte GXv_int1[] ;
   private short AV112NOspMaq ;
   private short AV111linea ;
   private short AV78x ;
   private short AV113NumOs ;
   private short AV79y ;
   private short AV120Barordlin ;
   private short AV105Nlineas ;
   private short AV123d ;
   private short A194BarOrdLin ;
   private short AV115i ;
   private short Gx_err ;
   private int GX_I ;
   private int GX_J ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV82Barcod ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int AV89BarPieagr ;
   private int GXv_int21[] ;
   private int GXv_int17[] ;
   private int GXv_int12[] ;
   private int GXv_int10[] ;
   private int GXv_int3[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV101Kilos ;
   private java.math.BigDecimal AV102Kilost ;
   private java.math.BigDecimal AV87BarKgmAgr ;
   private java.math.BigDecimal AV88BarMtrAgr ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String A396EmprCod ;
   private String AV77MaqHdrs[][] ;
   private String AV114Tab_maqOut[] ;
   private String AV128Op ;
   private String AV117NomInf ;
   private String AV66File ;
   private String AV119Lit1 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV73EmprNom ;
   private String AV99MaqDsc ;
   private String AV81texto ;
   private String AV80Maqcod ;
   private String AV116OkMq ;
   private String A602MaqCod ;
   private String A604MaqCodFor ;
   private String AV109MaqCodFor ;
   private String AV84Barcodpar ;
   private String A130BarCodPar ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A279CliNom ;
   private String A120BarAgrEst ;
   private String A1652BarSerDsc ;
   private String AV85hdr ;
   private String AV97Barcolnom ;
   private String AV98BarEnccli ;
   private String AV103BarNot1 ;
   private String AV104Barnot2 ;
   private String AV121Barnot3 ;
   private String AV124BarNot4 ;
   private String AV125Barnot5 ;
   private String AV126Barnot6 ;
   private String AV122TabNotas[] ;
   private String A187BarNotDsc ;
   private String A758ProCod ;
   private String AV108Maqcodbis ;
   private String AV110Clinom ;
   private String AV127Barnot ;
   private String A122BarAgrPar ;
   private String AV90BarAgrSer ;
   private String AV91Barcolnomagr ;
   private String AV93BarEnccliAgr ;
   private String AV92barserdscAgr ;
   private String AV96BarNomcliAgr ;
   private String GXv_char23[] ;
   private String GXv_char20[] ;
   private String GXv_char19[] ;
   private String GXv_char16[] ;
   private String GXv_char15[] ;
   private String GXv_char13[] ;
   private String GXv_char11[] ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String Gx_time ;
   private java.util.Date AV107fecha ;
   private java.util.Date AV74Fec1 ;
   private java.util.Date AV95fec2 ;
   private java.util.Date AV94fec3 ;
   private java.util.Date GXv_date22[] ;
   private java.util.Date GXv_date18[] ;
   private java.util.Date GXv_date6[] ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n604MaqCodFor ;
   private boolean n252CliCod ;
   private boolean n219BarTotAgr ;
   private boolean n9842BarObsF ;
   private String A9842BarObsF ;
   private String[] aP6 ;
   private String[] aP0 ;
   private short[] aP2 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05UQ2_A396EmprCod ;
   private String[] P05UQ2_A407EmprNom ;
   private boolean[] P05UQ2_n407EmprNom ;
   private String[] P05UQ3_A396EmprCod ;
   private String[] P05UQ3_A602MaqCod ;
   private String[] P05UQ3_A604MaqCodFor ;
   private boolean[] P05UQ3_n604MaqCodFor ;
   private int[] P05UQ6_A252CliCod ;
   private boolean[] P05UQ6_n252CliCod ;
   private String[] P05UQ6_A396EmprCod ;
   private String[] P05UQ6_A130BarCodPar ;
   private byte[] P05UQ6_A132BarCodReo ;
   private int[] P05UQ6_A129BarCod ;
   private String[] P05UQ6_A1234BarNomCli ;
   private String[] P05UQ6_A135BarColNom ;
   private String[] P05UQ6_A143BarDisNum ;
   private String[] P05UQ6_A4812BarEncCli ;
   private String[] P05UQ6_A279CliNom ;
   private String[] P05UQ6_A120BarAgrEst ;
   private String[] P05UQ6_A1652BarSerDsc ;
   private java.math.BigDecimal[] P05UQ6_A166BarKgm ;
   private java.math.BigDecimal[] P05UQ6_A219BarTotAgr ;
   private boolean[] P05UQ6_n219BarTotAgr ;
   private String[] P05UQ7_A396EmprCod ;
   private int[] P05UQ7_A129BarCod ;
   private byte[] P05UQ7_A132BarCodReo ;
   private String[] P05UQ7_A130BarCodPar ;
   private String[] P05UQ7_A187BarNotDsc ;
   private byte[] P05UQ7_A188BarNotLin ;
   private String[] P05UQ8_A396EmprCod ;
   private int[] P05UQ8_A129BarCod ;
   private byte[] P05UQ8_A132BarCodReo ;
   private String[] P05UQ8_A130BarCodPar ;
   private short[] P05UQ8_A194BarOrdLin ;
   private String[] P05UQ8_A9842BarObsF ;
   private boolean[] P05UQ8_n9842BarObsF ;
   private String[] P05UQ8_A758ProCod ;
   private String[] P05UQ9_A396EmprCod ;
   private int[] P05UQ9_A129BarCod ;
   private byte[] P05UQ9_A132BarCodReo ;
   private String[] P05UQ9_A130BarCodPar ;
   private String[] P05UQ9_A122BarAgrPar ;
   private byte[] P05UQ9_A124BarAgrReo ;
   private int[] P05UQ9_A119BarAgrCod ;
   private String[] P05UQ10_A396EmprCod ;
   private int[] P05UQ10_A129BarCod ;
   private byte[] P05UQ10_A132BarCodReo ;
   private String[] P05UQ10_A130BarCodPar ;
   private String[] P05UQ10_A122BarAgrPar ;
   private byte[] P05UQ10_A124BarAgrReo ;
   private int[] P05UQ10_A119BarAgrCod ;
}

final  class aprtftinte__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05UQ2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05UQ3", "SELECT EmprCod, MaqCod, MaqCodFor FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05UQ6", "SELECT T1.CliCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarNomCli, T1.BarColNom, T1.BarDisNum, T1.BarEncCli, T2.CliNom, T1.BarAgrEst, T1.BarSerDsc, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T4.BarTotAgr, 0) AS BarTotAgr FROM (((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05UQ7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotDsc, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05UQ8", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarObsF, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05UQ9", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05UQ10", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

