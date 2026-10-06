package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rreclav extends GXReport
{
   public rreclav( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rreclav.class ), "" );
   }

   public rreclav( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 )
   {
      rreclav.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      rreclav.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      rreclav.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      rreclav.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      rreclav.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      rreclav.this.AV19BarMaqCod = aP4[0];
      this.aP4 = aP4;
      rreclav.this.AV20BarSua = aP5[0];
      this.aP5 = aP5;
      rreclav.this.AV21Volumen = aP6[0];
      this.aP6 = aP6;
      rreclav.this.AV117RecLinMaq = aP7[0];
      this.aP7 = aP7;
      rreclav.this.AV22ImpCod = aP8[0];
      this.aP8 = aP8;
      rreclav.this.Gx_out = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 1 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("RECETA DE LAVANDERIAS") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_int1[0] = AV146Flagidioma ;
         new app.pexicon(remoteHandle, context).execute( AV15EmprCod, "100001", GXv_int1) ;
         rreclav.this.AV146Flagidioma = GXv_int1[0] ;
         GXv_int1[0] = AV31Flag ;
         new app.pexicon(remoteHandle, context).execute( AV15EmprCod, "030800", GXv_int1) ;
         rreclav.this.AV31Flag = GXv_int1[0] ;
         GXv_int1[0] = AV76FlagImp ;
         new app.pexicon(remoteHandle, context).execute( AV15EmprCod, "100000", GXv_int1) ;
         rreclav.this.AV76FlagImp = GXv_int1[0] ;
         GXv_int1[0] = AV88FlagBar ;
         new app.pexicon(remoteHandle, context).execute( AV15EmprCod, "100007", GXv_int1) ;
         rreclav.this.AV88FlagBar = GXv_int1[0] ;
         GXv_int1[0] = AV94FlagCod ;
         new app.pexicon(remoteHandle, context).execute( AV15EmprCod, "100009", GXv_int1) ;
         rreclav.this.AV94FlagCod = GXv_int1[0] ;
         GXv_int1[0] = AV132FlagNline ;
         new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "NOLINE", ""), GXv_int1) ;
         rreclav.this.AV132FlagNline = GXv_int1[0] ;
         GXv_int1[0] = AV173F_aqua ;
         new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "AQUACO", ""), GXv_int1) ;
         rreclav.this.AV173F_aqua = GXv_int1[0] ;
         GXv_char2[0] = AV138ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "RECPZA", ""), GXv_char2) ;
         rreclav.this.AV138ContDsc = GXv_char2[0] ;
         GXt_int3 = AV186F_laundry ;
         GXv_int1[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "LAUNDR", ""), GXv_int1) ;
         rreclav.this.GXt_int3 = GXv_int1[0] ;
         AV186F_laundry = GXt_int3 ;
         AV147Var3 = " " ;
         if ( AV146Flagidioma == 1 )
         {
            AV147Var3 = httpContext.getMessage( "Processado por Computador", "") ;
         }
         /* Using cursor P06P92 */
         pr_default.execute(0, new Object[] {AV15EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P06P92_A396EmprCod[0] ;
            A407EmprNom = P06P92_A407EmprNom[0] ;
            n407EmprNom = P06P92_n407EmprNom[0] ;
            AV133NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV89Termin = context.getWorkstationId( remoteHandle) ;
         /* Using cursor P06P93 */
         pr_default.execute(1, new Object[] {AV89Termin});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A942TermCod = P06P93_A942TermCod[0] ;
            A1189TermUsu = P06P93_A1189TermUsu[0] ;
            n1189TermUsu = P06P93_n1189TermUsu[0] ;
            AV90TermUsu = A1189TermUsu ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GXv_char2[0] = AV15EmprCod ;
         GXv_int4[0] = AV77CliCod ;
         GXv_int5[0] = AV16BarCod ;
         GXv_int1[0] = AV17BarCodReo ;
         GXv_char6[0] = AV18BarCodPar ;
         GXv_char7[0] = AV24Intens ;
         GXv_char8[0] = AV25Matiz ;
         GXv_int9[0] = AV36TipColCod ;
         GXv_char10[0] = AV35TipCol ;
         GXv_char11[0] = AV71Tonalidad ;
         GXv_int12[0] = AV74NumCli ;
         GXv_char13[0] = AV75Serie ;
         GXv_int14[0] = AV101MatCod ;
         new app.preceta2(remoteHandle, context).execute( GXv_char2, GXv_int4, GXv_int5, GXv_int1, GXv_char6, GXv_char7, GXv_char8, GXv_int9, GXv_char10, GXv_char11, GXv_int12, GXv_char13, GXv_int14) ;
         rreclav.this.AV15EmprCod = GXv_char2[0] ;
         rreclav.this.AV77CliCod = GXv_int4[0] ;
         rreclav.this.AV16BarCod = GXv_int5[0] ;
         rreclav.this.AV17BarCodReo = GXv_int1[0] ;
         rreclav.this.AV18BarCodPar = GXv_char6[0] ;
         rreclav.this.AV24Intens = GXv_char7[0] ;
         rreclav.this.AV25Matiz = GXv_char8[0] ;
         rreclav.this.AV36TipColCod = GXv_int9[0] ;
         rreclav.this.AV35TipCol = GXv_char10[0] ;
         rreclav.this.AV71Tonalidad = GXv_char11[0] ;
         rreclav.this.AV74NumCli = GXv_int12[0] ;
         rreclav.this.AV75Serie = GXv_char13[0] ;
         rreclav.this.AV101MatCod = GXv_int14[0] ;
         AV30Coste = DecimalUtil.doubleToDec(0) ;
         AV85DesCol = GXutil.substring( AV35TipCol, 1, 15) ;
         AV86DesInt = GXutil.substring( AV24Intens, 1, 20) ;
         GXt_char15 = AV38Lit0 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT171_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV38Lit0 = GXt_char15 ;
         GXt_char15 = AV39Lit1 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT5_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV39Lit1 = GXt_char15 ;
         GXt_char15 = AV40Lit2 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN043", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV40Lit2 = GXt_char15 ;
         GXt_char15 = AV41Lit3 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV41Lit3 = GXt_char15 ;
         GXt_char15 = AV42Lit4 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1256_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV42Lit4 = GXt_char15 ;
         GXt_char15 = AV43Lit5 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV097_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV43Lit5 = GXt_char15 ;
         GXt_char15 = AV44Lit6 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV44Lit6 = GXt_char15 ;
         GXt_char15 = AV45Lit7 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN358_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV45Lit7 = GXt_char15 ;
         GXt_char15 = AV46Lit8 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "NCA0003_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV46Lit8 = GXt_char15 ;
         GXt_char15 = AV47Lit9 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1127_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV47Lit9 = GXt_char15 ;
         GXt_char15 = AV48Lit10 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN049", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV48Lit10 = GXt_char15 ;
         GXt_char15 = AV49Lit11 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN387_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV49Lit11 = GXt_char15 ;
         GXt_char15 = AV50Lit12 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN076_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV50Lit12 = GXt_char15 ;
         GXt_char15 = AV51Lit13 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1193_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV51Lit13 = GXt_char15 ;
         GXt_char15 = AV52Lit14 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2491_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV52Lit14 = GXt_char15 ;
         GXt_char15 = AV53Lit15 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "NCA0002_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV53Lit15 = GXt_char15 ;
         AV53Lit15 = GXutil.trim( AV53Lit15) ;
         GXt_char15 = AV54Lit16 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV54Lit16 = GXt_char15 ;
         GXt_char15 = AV55Lit17 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT24_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV55Lit17 = GXt_char15 ;
         AV54Lit16 = GXutil.trim( AV54Lit16) + "-" + GXutil.trim( AV55Lit17) ;
         GXt_char15 = AV56Lit18 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV56Lit18 = GXt_char15 ;
         GXt_char15 = AV57Lit19 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV005_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV57Lit19 = GXt_char15 ;
         GXt_char15 = AV58Lit20 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV004_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV58Lit20 = GXt_char15 ;
         GXt_char15 = AV59Lit21 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV59Lit21 = GXt_char15 ;
         GXt_char15 = AV60Lit22 ;
         GXv_char13[0] = GXt_char15 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char13) ;
         rreclav.this.GXt_char15 = GXv_char13[0] ;
         AV60Lit22 = GXt_char15 ;
         AV60Lit22 = GXutil.trim( AV60Lit22) + " " + GXutil.trim( AV49Lit11) ;
         AV61Lit23 = httpContext.getMessage( "Añadidas Manuales", "") ;
         if ( AV146Flagidioma == 1 )
         {
            AV61Lit23 = httpContext.getMessage( "Acertos Manuais", "") ;
         }
         GxHdr4 = true ;
         /* Using cursor P06P95 */
         pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, Short.valueOf(AV117RecLinMaq)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A3915EmpNumDec = P06P95_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P06P95_n3915EmpNumDec[0] ;
            A2804RecLinMaq = P06P95_A2804RecLinMaq[0] ;
            A130BarCodPar = P06P95_A130BarCodPar[0] ;
            A132BarCodReo = P06P95_A132BarCodReo[0] ;
            A129BarCod = P06P95_A129BarCod[0] ;
            A396EmprCod = P06P95_A396EmprCod[0] ;
            A217BarTipArt = P06P95_A217BarTipArt[0] ;
            n217BarTipArt = P06P95_n217BarTipArt[0] ;
            A3030BarPlf = P06P95_A3030BarPlf[0] ;
            A4268RecOrdLin = P06P95_A4268RecOrdLin[0] ;
            n4268RecOrdLin = P06P95_n4268RecOrdLin[0] ;
            A4402RecUsrCod = P06P95_A4402RecUsrCod[0] ;
            A4866RecFecAlt = P06P95_A4866RecFecAlt[0] ;
            n4866RecFecAlt = P06P95_n4866RecFecAlt[0] ;
            A4610BarTam = P06P95_A4610BarTam[0] ;
            A4609BarMdlCod = P06P95_A4609BarMdlCod[0] ;
            A234BarUrdP3 = P06P95_A234BarUrdP3[0] ;
            A233BarUrdP2 = P06P95_A233BarUrdP2[0] ;
            A232BarUrdP1 = P06P95_A232BarUrdP1[0] ;
            A226BarTraP3 = P06P95_A226BarTraP3[0] ;
            A225BarTraP2 = P06P95_A225BarTraP2[0] ;
            A224BarTraP1 = P06P95_A224BarTraP1[0] ;
            A231BarUrd3 = P06P95_A231BarUrd3[0] ;
            A230BarUrd2 = P06P95_A230BarUrd2[0] ;
            A229BarUrd1 = P06P95_A229BarUrd1[0] ;
            A223BarTra3 = P06P95_A223BarTra3[0] ;
            A222BarTra2 = P06P95_A222BarTra2[0] ;
            A221BarTra1 = P06P95_A221BarTra1[0] ;
            A136BarColNum = P06P95_A136BarColNum[0] ;
            A135BarColNom = P06P95_A135BarColNom[0] ;
            A1652BarSerDsc = P06P95_A1652BarSerDsc[0] ;
            A212BarSer = P06P95_A212BarSer[0] ;
            A279CliNom = P06P95_A279CliNom[0] ;
            A252CliCod = P06P95_A252CliCod[0] ;
            n252CliCod = P06P95_n252CliCod[0] ;
            A4654RecNroPar = P06P95_A4654RecNroPar[0] ;
            n4654RecNroPar = P06P95_n4654RecNroPar[0] ;
            A2805RecVolPrd = P06P95_A2805RecVolPrd[0] ;
            A4273RecFagPrd = P06P95_A4273RecFagPrd[0] ;
            A4261RecTotPrd = P06P95_A4261RecTotPrd[0] ;
            n4261RecTotPrd = P06P95_n4261RecTotPrd[0] ;
            A4272RecFagMts = P06P95_A4272RecFagMts[0] ;
            A4260RecTotMts = P06P95_A4260RecTotMts[0] ;
            n4260RecTotMts = P06P95_n4260RecTotMts[0] ;
            A4271RecFagKgs = P06P95_A4271RecFagKgs[0] ;
            A4259RecTotKgs = P06P95_A4259RecTotKgs[0] ;
            A3915EmpNumDec = P06P95_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P06P95_n3915EmpNumDec[0] ;
            A217BarTipArt = P06P95_A217BarTipArt[0] ;
            n217BarTipArt = P06P95_n217BarTipArt[0] ;
            A3030BarPlf = P06P95_A3030BarPlf[0] ;
            A4610BarTam = P06P95_A4610BarTam[0] ;
            A4609BarMdlCod = P06P95_A4609BarMdlCod[0] ;
            A234BarUrdP3 = P06P95_A234BarUrdP3[0] ;
            A233BarUrdP2 = P06P95_A233BarUrdP2[0] ;
            A232BarUrdP1 = P06P95_A232BarUrdP1[0] ;
            A226BarTraP3 = P06P95_A226BarTraP3[0] ;
            A225BarTraP2 = P06P95_A225BarTraP2[0] ;
            A224BarTraP1 = P06P95_A224BarTraP1[0] ;
            A231BarUrd3 = P06P95_A231BarUrd3[0] ;
            A230BarUrd2 = P06P95_A230BarUrd2[0] ;
            A229BarUrd1 = P06P95_A229BarUrd1[0] ;
            A223BarTra3 = P06P95_A223BarTra3[0] ;
            A222BarTra2 = P06P95_A222BarTra2[0] ;
            A221BarTra1 = P06P95_A221BarTra1[0] ;
            A136BarColNum = P06P95_A136BarColNum[0] ;
            A135BarColNom = P06P95_A135BarColNom[0] ;
            A1652BarSerDsc = P06P95_A1652BarSerDsc[0] ;
            A212BarSer = P06P95_A212BarSer[0] ;
            A252CliCod = P06P95_A252CliCod[0] ;
            n252CliCod = P06P95_n252CliCod[0] ;
            A279CliNom = P06P95_A279CliNom[0] ;
            A4273RecFagPrd = P06P95_A4273RecFagPrd[0] ;
            A4272RecFagMts = P06P95_A4272RecFagMts[0] ;
            A4271RecFagKgs = P06P95_A4271RecFagKgs[0] ;
            if ( A4259RecTotKgs.doubleValue() != 0 )
            {
               A4269RecRelBan = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(A2805RecVolPrd).divide(A4259RecTotKgs, 18, java.math.RoundingMode.DOWN), 0))) ;
            }
            else
            {
               A4269RecRelBan = (short)(0) ;
            }
            A4316RecMaqKgs = A4259RecTotKgs.add(A4271RecFagKgs) ;
            A4317RecMaqMts = A4260RecTotMts.add(A4272RecFagMts) ;
            A4318RecMaqPrd = (int)(A4261RecTotPrd+A4273RecFagPrd) ;
            AV175BarTipArt = A217BarTipArt ;
            /* Execute user subroutine: 'TIPART' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV187Muestras_i = "" ;
            if ( GXutil.strcmp(A3030BarPlf, httpContext.getMessage( "S", "")) == 0 )
            {
               AV187Muestras_i = httpContext.getMessage( "MUESTRAS", "") ;
            }
            AV170BarFasRecu = 0 ;
            AV16BarCod = A129BarCod ;
            AV17BarCodReo = A132BarCodReo ;
            AV18BarCodPar = A130BarCodPar ;
            AV171BarFasLot = A4654RecNroPar ;
            AV172BarOrdLin = A4268RecOrdLin ;
            /* Using cursor P06P96 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV172BarOrdLin), Integer.valueOf(AV171BarFasLot)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A4643BarFasLot = P06P96_A4643BarFasLot[0] ;
               A194BarOrdLin = P06P96_A194BarOrdLin[0] ;
               A4648BarFasRecu = P06P96_A4648BarFasRecu[0] ;
               n4648BarFasRecu = P06P96_n4648BarFasRecu[0] ;
               A758ProCod = P06P96_A758ProCod[0] ;
               AV170BarFasRecu = A4648BarFasRecu ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Execute user subroutine: 'RECUPERACIONES' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV168RecUsrCod = A4402RecUsrCod ;
            AV169RecFecAlt = A4866RecFecAlt ;
            AV153RecMaqKgs = A4316RecMaqKgs ;
            AV154RecMaqMts = A4317RecMaqMts ;
            AV155RecMaqPrd = A4318RecMaqPrd ;
            AV26RelBany = DecimalUtil.doubleToDec(A4269RecRelBan) ;
            AV159RecOrdLin = A4268RecOrdLin ;
            AV160FasCod = GXutil.space( (short)(8)) ;
            /* Using cursor P06P97 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV159RecOrdLin)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A194BarOrdLin = P06P97_A194BarOrdLin[0] ;
               A457FasCod = P06P97_A457FasCod[0] ;
               A758ProCod = P06P97_A758ProCod[0] ;
               AV160FasCod = A457FasCod ;
               AV185ProCod = A758ProCod ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV166TipDefDsc = "" ;
            AV167vTexto = "" ;
            GXv_char13[0] = AV15EmprCod ;
            GXv_int12[0] = AV16BarCod ;
            GXv_int9[0] = AV17BarCodReo ;
            GXv_char11[0] = AV18BarCodPar ;
            GXv_int5[0] = A4654RecNroPar ;
            GXv_int14[0] = AV159RecOrdLin ;
            GXv_char10[0] = AV166TipDefDsc ;
            new app.pdefdsc(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_int9, GXv_char11, GXv_int5, GXv_int14, GXv_char10) ;
            rreclav.this.AV15EmprCod = GXv_char13[0] ;
            rreclav.this.AV16BarCod = GXv_int12[0] ;
            rreclav.this.AV17BarCodReo = GXv_int9[0] ;
            rreclav.this.AV18BarCodPar = GXv_char11[0] ;
            rreclav.this.A4654RecNroPar = GXv_int5[0] ;
            rreclav.this.AV159RecOrdLin = GXv_int14[0] ;
            rreclav.this.AV166TipDefDsc = GXv_char10[0] ;
            if ( ! (GXutil.strcmp("", AV166TipDefDsc)==0) )
            {
               AV167vTexto = httpContext.getMessage( "Recuperaçao", "") ;
            }
            GXv_char13[0] = AV164FasDsc ;
            new app.pfasdsc(remoteHandle, context).execute( AV15EmprCod, AV160FasCod, GXv_char13) ;
            rreclav.this.AV164FasDsc = GXv_char13[0] ;
            GX_I = 1 ;
            while ( GX_I <= 6 )
            {
               AV27Procesos[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 6 )
            {
               AV29Tiempos[GX_I-1] = (short)(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV28I = (byte)(1) ;
            AV34TotTiempo = 0 ;
            /* Using cursor P06P98 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A764ProForCod = P06P98_A764ProForCod[0] ;
               A771ProForTie = P06P98_A771ProForTie[0] ;
               A1273RecLinPro = P06P98_A1273RecLinPro[0] ;
               A771ProForTie = P06P98_A771ProForTie[0] ;
               AV27Procesos[AV28I-1] = A764ProForCod ;
               AV29Tiempos[AV28I-1] = A771ProForTie ;
               AV34TotTiempo = (long)(AV34TotTiempo+A771ProForTie) ;
               AV28I = (byte)(AV28I+1) ;
               if ( AV28I > 6 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(5);
            }
            pr_default.close(5);
            AV87HojRut = "*" + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
            /* Execute user subroutine: 'DESCMAQ' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV163Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + " " + A130BarCodPar ;
            AV156HdrPart = "*" + GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "/" + GXutil.trim( GXutil.str( A4654RecNroPar, 6, 0)) + "/" + GXutil.trim( GXutil.str( A2804RecLinMaq, 4, 0)) + "*" ;
            AV106HdrPda = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "-" + GXutil.trim( GXutil.str( A4654RecNroPar, 6, 0)) + "-" + GXutil.trim( GXutil.str( A2804RecLinMaq, 4, 0)) ;
            if ( AV186F_laundry == 1 )
            {
               /* Execute user subroutine: 'AGRHDF' */
               S151 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(2);
                  pr_default.close(2);
                  pr_default.close(2);
                  pr_default.close(2);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            /* Using cursor P06P99 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV117RecLinMaq)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A1273RecLinPro = P06P99_A1273RecLinPro[0] ;
               A2804RecLinMaq = P06P99_A2804RecLinMaq[0] ;
               A764ProForCod = P06P99_A764ProForCod[0] ;
               A771ProForTie = P06P99_A771ProForTie[0] ;
               A2392ProNumPro = P06P99_A2392ProNumPro[0] ;
               A4695RecVolPrf = P06P99_A4695RecVolPrf[0] ;
               A766ProForDsc = P06P99_A766ProForDsc[0] ;
               A771ProForTie = P06P99_A771ProForTie[0] ;
               A2392ProNumPro = P06P99_A2392ProNumPro[0] ;
               A766ProForDsc = P06P99_A766ProForDsc[0] ;
               AV157ProForTie = A771ProForTie ;
               AV158ProNumPro = A2392ProNumPro ;
               AV161ProForCod = A764ProForCod ;
               /* Using cursor P06P910 */
               pr_default.execute(7, new Object[] {A396EmprCod, AV160FasCod, A764ProForCod});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A457FasCod = P06P910_A457FasCod[0] ;
                  A4652FasForTPau = P06P910_A4652FasForTPau[0] ;
                  n4652FasForTPau = P06P910_n4652FasForTPau[0] ;
                  A4651FasForNPro = P06P910_A4651FasForNPro[0] ;
                  n4651FasForNPro = P06P910_n4651FasForNPro[0] ;
                  A4650FasForLin = P06P910_A4650FasForLin[0] ;
                  AV157ProForTie = A4652FasForTPau ;
                  AV158ProNumPro = A4651FasForNPro ;
                  pr_default.readNext(7);
               }
               pr_default.close(7);
               AV162vRb = (short)(0) ;
               if ( AV153RecMaqKgs.doubleValue() > 0 )
               {
                  AV162vRb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(A4695RecVolPrf).divide(AV153RecMaqKgs, 18, java.math.RoundingMode.DOWN))) ;
               }
               if ( AV173F_aqua == 0 )
               {
                  h6P90( false, 28) ;
                  getPrinter().GxDrawRect(4, Gx_line+2, 778, Gx_line+25, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 13, Gx_line+4, 82, Gx_line+23, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 89, Gx_line+4, 318, Gx_line+23, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4695RecVolPrf), "ZZZZ9")), 582, Gx_line+5, 624, Gx_line+22, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 708, Gx_line+5, 725, Gx_line+22, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV162vRb), "ZZZ9")), 731, Gx_line+5, 764, Gx_line+22, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Lts", ""), 638, Gx_line+5, 666, Gx_line+22, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit21, "")), 493, Gx_line+5, 569, Gx_line+22, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+28) ;
               }
               else
               {
                  h6P90( false, 34) ;
                  getPrinter().GxAttris("Tahoma", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 17, Gx_line+8, 86, Gx_line+27, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 93, Gx_line+8, 322, Gx_line+27, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4695RecVolPrf), "ZZZZ9")), 586, Gx_line+9, 628, Gx_line+26, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 713, Gx_line+9, 730, Gx_line+26, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV162vRb), "ZZZ9")), 735, Gx_line+9, 768, Gx_line+26, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Lts", ""), 642, Gx_line+9, 670, Gx_line+26, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit21, "")), 497, Gx_line+9, 573, Gx_line+26, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(4, Gx_line+3, 778, Gx_line+32, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+34) ;
               }
               /* Using cursor P06P911 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A719PrdNum = P06P911_A719PrdNum[0] ;
                  n719PrdNum = P06P911_n719PrdNum[0] ;
                  A490ForPrdUMe = P06P911_A490ForPrdUMe[0] ;
                  n490ForPrdUMe = P06P911_n490ForPrdUMe[0] ;
                  A431FacCon = P06P911_A431FacCon[0] ;
                  A2394RecForNro = P06P911_A2394RecForNro[0] ;
                  A872RecPrdNum = P06P911_A872RecPrdNum[0] ;
                  A875RecPrdDsc = P06P911_A875RecPrdDsc[0] ;
                  A743PrdUniCon = P06P911_A743PrdUniCon[0] ;
                  A686PrdCant = P06P911_A686PrdCant[0] ;
                  A707PrdFacCon = P06P911_A707PrdFacCon[0] ;
                  A724PrdPreAct = P06P911_A724PrdPreAct[0] ;
                  A811RecLin = P06P911_A811RecLin[0] ;
                  A743PrdUniCon = P06P911_A743PrdUniCon[0] ;
                  A707PrdFacCon = P06P911_A707PrdFacCon[0] ;
                  A724PrdPreAct = P06P911_A724PrdPreAct[0] ;
                  if ( A490ForPrdUMe == 1 )
                  {
                     AV108Var2 = httpContext.getMessage( "Gr/L", "") ;
                  }
                  if ( A490ForPrdUMe == 2 )
                  {
                     AV108Var2 = httpContext.getMessage( "Cc/L", "") ;
                  }
                  if ( A490ForPrdUMe == 3 )
                  {
                     AV108Var2 = "%" ;
                  }
                  AV107Var1 = GXutil.str( A431FacCon, 11, 5) + " " + AV108Var2 ;
                  if ( (0==A2394RecForNro) )
                  {
                     AV105RecForNro = "  " ;
                  }
                  else
                  {
                     AV105RecForNro = GXutil.str( A2394RecForNro, 2, 0) ;
                  }
                  if ( (GXutil.strcmp("", A872RecPrdNum)==0) || ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), httpContext.getMessage( "C", "")) == 0 ) )
                  {
                     if ( GXutil.strcmp(A875RecPrdDsc, ".") == 0 )
                     {
                     }
                     else
                     {
                        AV37PrdDsc = A875RecPrdDsc ;
                        h6P90( false, 17) ;
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37PrdDsc, "")), 205, Gx_line+0, 369, Gx_line+18, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                  }
                  else
                  {
                     AV23CodPrd = GXutil.substring( A872RecPrdNum, 1, 1) ;
                     if ( A490ForPrdUMe == 2 )
                     {
                        AV73Unidades = httpContext.getMessage( "Cc", "") ;
                     }
                     else
                     {
                        if ( A490ForPrdUMe == 3 )
                        {
                           if ( A743PrdUniCon == 3 )
                           {
                              AV73Unidades = httpContext.getMessage( "Cc", "") ;
                           }
                           else
                           {
                              AV73Unidades = httpContext.getMessage( "Gr", "") ;
                           }
                        }
                        else
                        {
                           AV73Unidades = httpContext.getMessage( "Gr", "") ;
                           if ( A743PrdUniCon == 3 )
                           {
                              AV73Unidades = httpContext.getMessage( "Cc", "") ;
                           }
                        }
                     }
                     if ( AV76FlagImp == 1 )
                     {
                        if ( ( A686PrdCant.doubleValue() >= 1000 ) && ( ( GXutil.strcmp(AV23CodPrd, "0") == 0 ) || ( GXutil.strcmp(AV23CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV23CodPrd, "9") == 0 ) ) )
                        {
                           AV72Cantidad = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                           if ( A490ForPrdUMe == 2 )
                           {
                              AV73Unidades = httpContext.getMessage( "Lt", "") ;
                           }
                           else
                           {
                              if ( A490ForPrdUMe == 3 )
                              {
                                 if ( A743PrdUniCon == 3 )
                                 {
                                    AV73Unidades = httpContext.getMessage( "Lt", "") ;
                                 }
                                 else
                                 {
                                    AV73Unidades = httpContext.getMessage( "Kg", "") ;
                                 }
                              }
                              else
                              {
                                 AV73Unidades = httpContext.getMessage( "Kg", "") ;
                                 if ( A743PrdUniCon == 3 )
                                 {
                                    AV73Unidades = httpContext.getMessage( "Lt", "") ;
                                 }
                              }
                           }
                        }
                        else
                        {
                           AV72Cantidad = A686PrdCant ;
                           if ( A490ForPrdUMe == 2 )
                           {
                              AV73Unidades = httpContext.getMessage( "Cc", "") ;
                           }
                           else
                           {
                              if ( A490ForPrdUMe == 3 )
                              {
                                 if ( A743PrdUniCon == 3 )
                                 {
                                    AV73Unidades = httpContext.getMessage( "Cc", "") ;
                                 }
                                 else
                                 {
                                    AV73Unidades = httpContext.getMessage( "Gr", "") ;
                                 }
                              }
                              else
                              {
                                 AV73Unidades = httpContext.getMessage( "Gr", "") ;
                                 if ( A743PrdUniCon == 3 )
                                 {
                                    AV73Unidades = httpContext.getMessage( "Cc", "") ;
                                 }
                              }
                           }
                        }
                     }
                     else
                     {
                        AV72Cantidad = A686PrdCant ;
                     }
                     if ( ( GXutil.strcmp(A875RecPrdDsc, httpContext.getMessage( "AGUA", "")) == 0 ) && ( AV186F_laundry == 1 ) )
                     {
                     }
                     else
                     {
                        if ( ( GXutil.strcmp(AV23CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV23CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV23CodPrd, "0") == 0 ) )
                        {
                           h6P90( false, 17) ;
                           getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107Var1, "")), 0, Gx_line+0, 101, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 145, Gx_line+0, 227, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 205, Gx_line+0, 369, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105RecForNro, "")), 432, Gx_line+0, 456, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV72Cantidad, "ZZZZZZ9.999")), 464, Gx_line+0, 545, Gx_line+18, 2+256, 0, 1, 0) ;
                           getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Unidades, "")), 558, Gx_line+1, 590, Gx_line+17, 0+256, 0, 1, 0) ;
                           getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV181Va1, "")), 597, Gx_line+0, 665, Gx_line+17, 0, 0, 1, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV183Va3, "")), 729, Gx_line+0, 778, Gx_line+17, 0, 0, 1, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV182Va2, "")), 664, Gx_line+0, 731, Gx_line+17, 0, 0, 1, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+17) ;
                        }
                        else
                        {
                           h6P90( false, 17) ;
                           getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107Var1, "")), 0, Gx_line+0, 101, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 145, Gx_line+0, 227, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Arial", 10, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 205, Gx_line+0, 369, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105RecForNro, "")), 432, Gx_line+0, 456, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV72Cantidad, "ZZZZZZ9.999")), 464, Gx_line+0, 545, Gx_line+18, 2+256, 0, 1, 0) ;
                           getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Unidades, "")), 558, Gx_line+1, 590, Gx_line+17, 0+256, 0, 1, 0) ;
                           getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV181Va1, "")), 597, Gx_line+0, 665, Gx_line+17, 0, 0, 1, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV183Va3, "")), 729, Gx_line+0, 778, Gx_line+17, 0, 0, 1, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV182Va2, "")), 664, Gx_line+0, 731, Gx_line+17, 0, 0, 1, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+17) ;
                        }
                     }
                  }
                  if ( AV31Flag == 1 )
                  {
                     if ( A3915EmpNumDec == 0 )
                     {
                        AV30Coste = AV30Coste.add((A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                     }
                     else
                     {
                        if ( A3915EmpNumDec == 2 )
                        {
                           AV30Coste = AV30Coste.add(GXutil.roundDecimal( A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
                        }
                     }
                  }
                  pr_default.readNext(8);
               }
               pr_default.close(8);
               pr_default.readNext(6);
            }
            pr_default.close(6);
            if ( AV31Flag == 1 )
            {
               if ( AV153RecMaqKgs.doubleValue() != 0 )
               {
                  if ( A3915EmpNumDec == 0 )
                  {
                     AV32CosKgm = AV30Coste.divide(AV153RecMaqKgs, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     if ( A3915EmpNumDec == 2 )
                     {
                        AV32CosKgm = GXutil.roundDecimal( AV30Coste.divide(AV153RecMaqKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                     }
                  }
               }
               else
               {
                  AV32CosKgm = DecimalUtil.doubleToDec(0) ;
               }
               if ( AV154RecMaqMts.doubleValue() != 0 )
               {
                  if ( A3915EmpNumDec == 0 )
                  {
                     AV33CosMtr = AV30Coste.divide(AV154RecMaqMts, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     if ( A3915EmpNumDec == 2 )
                     {
                        AV33CosMtr = GXutil.roundDecimal( AV30Coste.divide(AV154RecMaqMts, 18, java.math.RoundingMode.DOWN), 2) ;
                     }
                  }
               }
               else
               {
                  AV33CosMtr = DecimalUtil.doubleToDec(0) ;
               }
            }
            AV78ArtCod = A212BarSer ;
            AV79ForColNom = A135BarColNom ;
            AV80ForColNum = A136BarColNum ;
            AV81Colorante = AV36TipColCod ;
            /* Execute user subroutine: 'OBSFOR' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         GxHdr4 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6P90( true, 0) ;
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
      /* 'OBSFOR' Routine */
      returnInSub = false ;
      AV84FlagObs = (byte)(0) ;
      /* Using cursor P06P912 */
      pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(AV77CliCod), AV78ArtCod, AV79ForColNom, Integer.valueOf(AV80ForColNum), Byte.valueOf(AV81Colorante)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A831TipColCod = P06P912_A831TipColCod[0] ;
         A483ForColNum = P06P912_A483ForColNum[0] ;
         A482ForColNom = P06P912_A482ForColNom[0] ;
         A494ForSer = P06P912_A494ForSer[0] ;
         A252CliCod = P06P912_A252CliCod[0] ;
         n252CliCod = P06P912_n252CliCod[0] ;
         A396EmprCod = P06P912_A396EmprCod[0] ;
         A649ObsForTxt = P06P912_A649ObsForTxt[0] ;
         A650ObsLin = P06P912_A650ObsLin[0] ;
         if ( AV84FlagObs == 0 )
         {
            AV84FlagObs = (byte)(1) ;
            h6P90( false, 33) ;
            getPrinter().GxDrawLine(15, Gx_line+33, 234, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(4, Gx_line+8, 247, Gx_line+30, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Lit22, "")), 15, Gx_line+11, 235, Gx_line+29, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
         }
         h6P90( false, 17) ;
         getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A649ObsForTxt, "")), 4, Gx_line+0, 193, Gx_line+18, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'DESCMAQ' Routine */
      returnInSub = false ;
      AV140NTubos = (byte)(0) ;
      /* Using cursor P06P913 */
      pr_default.execute(10, new Object[] {AV15EmprCod, AV19BarMaqCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A602MaqCod = P06P913_A602MaqCod[0] ;
         A396EmprCod = P06P913_A396EmprCod[0] ;
         A606MaqDsc = P06P913_A606MaqDsc[0] ;
         n606MaqDsc = P06P913_n606MaqDsc[0] ;
         A2391MaqMicro = P06P913_A2391MaqMicro[0] ;
         n2391MaqMicro = P06P913_n2391MaqMicro[0] ;
         A3598MaqNroTub = P06P913_A3598MaqNroTub[0] ;
         n3598MaqNroTub = P06P913_n3598MaqNroTub[0] ;
         AV82DescMaq = A606MaqDsc ;
         AV104MaqMicro = A2391MaqMicro ;
         AV110NumCam = A2391MaqMicro ;
         AV140NTubos = A3598MaqNroTub ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'RECUPERACIONES' Routine */
      returnInSub = false ;
      AV166TipDefDsc = GXutil.space( (short)(30)) ;
      AV167vTexto = GXutil.space( (short)(10)) ;
      /* Using cursor P06P914 */
      pr_default.execute(11, new Object[] {Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, Integer.valueOf(AV171BarFasLot), Short.valueOf(AV172BarOrdLin), Integer.valueOf(AV170BarFasRecu)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A833TipDefCod = P06P914_A833TipDefCod[0] ;
         n833TipDefCod = P06P914_n833TipDefCod[0] ;
         A4667HisLavCon = P06P914_A4667HisLavCon[0] ;
         A4665HisLavOrd = P06P914_A4665HisLavOrd[0] ;
         A4664HisLavNpd = P06P914_A4664HisLavNpd[0] ;
         A4663HisLavPar = P06P914_A4663HisLavPar[0] ;
         A4662HisLavReo = P06P914_A4662HisLavReo[0] ;
         A4661HisLavCod = P06P914_A4661HisLavCod[0] ;
         A834TipDefDsc = P06P914_A834TipDefDsc[0] ;
         n834TipDefDsc = P06P914_n834TipDefDsc[0] ;
         A396EmprCod = P06P914_A396EmprCod[0] ;
         A834TipDefDsc = P06P914_A834TipDefDsc[0] ;
         n834TipDefDsc = P06P914_n834TipDefDsc[0] ;
         AV166TipDefDsc = A834TipDefDsc ;
         AV167vTexto = httpContext.getMessage( "RECUPERAÇAO", "") ;
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV176TipArtDsc = GXutil.space( (short)(30)) ;
      /* Using cursor P06P915 */
      pr_default.execute(12, new Object[] {Short.valueOf(AV175BarTipArt)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A829TipArtCod = P06P915_A829TipArtCod[0] ;
         A830TipArtDsc = P06P915_A830TipArtDsc[0] ;
         n830TipArtDsc = P06P915_n830TipArtDsc[0] ;
         A396EmprCod = P06P915_A396EmprCod[0] ;
         AV176TipArtDsc = A830TipArtDsc ;
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'AGRHDF' Routine */
      returnInSub = false ;
      AV177F_vez = (byte)(0) ;
      /* Using cursor P06P916 */
      pr_default.execute(13, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, AV185ProCod, Short.valueOf(AV172BarOrdLin)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A194BarOrdLin = P06P916_A194BarOrdLin[0] ;
         A758ProCod = P06P916_A758ProCod[0] ;
         A130BarCodPar = P06P916_A130BarCodPar[0] ;
         A132BarCodReo = P06P916_A132BarCodReo[0] ;
         A129BarCod = P06P916_A129BarCod[0] ;
         A396EmprCod = P06P916_A396EmprCod[0] ;
         A4940A_Barcod = P06P916_A4940A_Barcod[0] ;
         A4941A_BarReo = P06P916_A4941A_BarReo[0] ;
         A4942A_BarPar = P06P916_A4942A_BarPar[0] ;
         A4947A_Piezas = P06P916_A4947A_Piezas[0] ;
         n4947A_Piezas = P06P916_n4947A_Piezas[0] ;
         A4946A_Kilos = P06P916_A4946A_Kilos[0] ;
         n4946A_Kilos = P06P916_n4946A_Kilos[0] ;
         A4943A_ProCod = P06P916_A4943A_ProCod[0] ;
         A4944A_BarOrd = P06P916_A4944A_BarOrd[0] ;
         if ( AV177F_vez == 0 )
         {
            AV177F_vez = (byte)(1) ;
            h6P90( false, 30) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Agrupado con:", ""), 14, Gx_line+1, 98, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 14, Gx_line+16, 35, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 110, Gx_line+16, 152, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Serie", ""), 350, Gx_line+16, 381, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 488, Gx_line+14, 520, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 646, Gx_line+14, 669, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 682, Gx_line+14, 721, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+28, 72, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(110, Gx_line+28, 329, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(350, Gx_line+28, 467, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(488, Gx_line+28, 583, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(602, Gx_line+28, 668, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(685, Gx_line+28, 719, Gx_line+28, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+30) ;
         }
         GXv_char13[0] = A396EmprCod ;
         GXv_int12[0] = A4940A_Barcod ;
         GXv_int9[0] = A4941A_BarReo ;
         GXv_char11[0] = A4942A_BarPar ;
         GXv_int5[0] = AV184CliCod_a ;
         GXv_char10[0] = AV178CliNom_a ;
         GXv_char8[0] = AV179BarSer_a ;
         GXv_char7[0] = AV180ColNom_a ;
         GXv_int4[0] = 0 ;
         GXv_int16[0] = AV188Discod ;
         new app.phrag06(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_int9, GXv_char11, GXv_int5, GXv_char10, GXv_char8, GXv_char7, GXv_int4, GXv_int16) ;
         rreclav.this.A396EmprCod = GXv_char13[0] ;
         rreclav.this.A4940A_Barcod = GXv_int12[0] ;
         rreclav.this.A4941A_BarReo = GXv_int9[0] ;
         rreclav.this.A4942A_BarPar = GXv_char11[0] ;
         rreclav.this.AV184CliCod_a = GXv_int5[0] ;
         rreclav.this.AV178CliNom_a = GXv_char10[0] ;
         rreclav.this.AV179BarSer_a = GXv_char8[0] ;
         rreclav.this.AV180ColNom_a = GXv_char7[0] ;
         rreclav.this.AV188Discod = GXv_int16[0] ;
         h6P90( false, 18) ;
         getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4940A_Barcod), "ZZZZZZZ9")), 14, Gx_line+2, 65, Gx_line+18, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4946A_Kilos, "ZZZZZ9.99")), 611, Gx_line+2, 668, Gx_line+18, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4947A_Piezas), "ZZZ9")), 695, Gx_line+3, 721, Gx_line+19, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV178CliNom_a, "")), 110, Gx_line+2, 267, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV179BarSer_a, "")), 350, Gx_line+2, 434, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV180ColNom_a, "")), 488, Gx_line+2, 557, Gx_line+18, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+18) ;
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void h6P90( boolean bFoot ,
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
            if ( GxHdr4 )
            {
               if ( AV173F_aqua == 1 )
               {
                  getPrinter().GxAttris("Tahoma", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV163Hdr, "")), 141, Gx_line+65, 234, Gx_line+86, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4654RecNroPar), "ZZZZZ9")), 436, Gx_line+69, 481, Gx_line+87, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9")), 723, Gx_line+69, 753, Gx_line+87, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 99, Gx_line+97, 144, Gx_line+115, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 153, Gx_line+97, 342, Gx_line+115, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 75, Gx_line+124, 176, Gx_line+142, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 181, Gx_line+124, 345, Gx_line+142, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 75, Gx_line+211, 157, Gx_line+229, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 293, Gx_line+211, 338, Gx_line+229, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 357, Gx_line+211, 373, Gx_line+229, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36TipColCod), "Z9")), 386, Gx_line+211, 402, Gx_line+229, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85DesCol, "")), 416, Gx_line+211, 511, Gx_line+229, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86DesInt, "")), 630, Gx_line+211, 725, Gx_line+229, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("3 of 9 Barcode", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV156HdrPart, "")), 11, Gx_line+6, 487, Gx_line+32, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A221BarTra1, "")), 103, Gx_line+163, 154, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A222BarTra2, "")), 174, Gx_line+163, 225, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A223BarTra3, "")), 245, Gx_line+163, 296, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A229BarUrd1, "")), 316, Gx_line+163, 367, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A230BarUrd2, "")), 395, Gx_line+163, 446, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A231BarUrd3, "")), 474, Gx_line+163, 525, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A224BarTraP1), "ZZ9")), 139, Gx_line+163, 162, Gx_line+181, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A225BarTraP2), "ZZ9")), 209, Gx_line+163, 232, Gx_line+181, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A226BarTraP3), "ZZ9")), 280, Gx_line+163, 303, Gx_line+181, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A232BarUrdP1), "ZZ9")), 359, Gx_line+163, 382, Gx_line+181, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A233BarUrdP2), "ZZ9")), 439, Gx_line+163, 462, Gx_line+181, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A234BarUrdP3), "ZZ9")), 519, Gx_line+163, 542, Gx_line+181, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV153RecMaqKgs, "ZZZZZZ9.99")), 15, Gx_line+277, 110, Gx_line+298, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV155RecMaqPrd), "ZZZZ9")), 166, Gx_line+277, 214, Gx_line+298, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Máquina", ""), 274, Gx_line+249, 331, Gx_line+267, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19BarMaqCod, "")), 338, Gx_line+247, 427, Gx_line+268, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(123, Gx_line+245, 123, Gx_line+303, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(4, Gx_line+89, 778, Gx_line+187, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(4, Gx_line+268, 259, Gx_line+303, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82DescMaq, "")), 435, Gx_line+247, 553, Gx_line+268, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4609BarMdlCod, "")), 436, Gx_line+97, 518, Gx_line+115, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4610BarTam, "")), 709, Gx_line+163, 760, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(4, Gx_line+203, 778, Gx_line+236, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106HdrPda, "")), 11, Gx_line+35, 162, Gx_line+51, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 273, Gx_line+270, 304, Gx_line+288, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV160FasCod, "@!")), 336, Gx_line+270, 454, Gx_line+291, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV164FasDsc, "")), 429, Gx_line+270, 605, Gx_line+291, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV166TipDefDsc, "")), 533, Gx_line+34, 722, Gx_line+52, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Lucida Console", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV167vTexto, "")), 533, Gx_line+8, 784, Gx_line+29, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( AV169RecFecAlt, "99/99/99 99:99"), 649, Gx_line+97, 743, Gx_line+115, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV168RecUsrCod, "")), 649, Gx_line+117, 750, Gx_line+135, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(552, Gx_line+89, 778, Gx_line+139, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(4, Gx_line+245, 259, Gx_line+269, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit0, "")), 11, Gx_line+67, 100, Gx_line+85, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit1, "")), 339, Gx_line+69, 428, Gx_line+87, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit2, "")), 634, Gx_line+69, 716, Gx_line+87, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit3, "")), 11, Gx_line+97, 81, Gx_line+114, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit4, "")), 346, Gx_line+97, 428, Gx_line+115, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit5, "")), 555, Gx_line+97, 644, Gx_line+115, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit6, "")), 555, Gx_line+117, 643, Gx_line+134, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit7, "")), 11, Gx_line+124, 69, Gx_line+141, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit8, "")), 620, Gx_line+163, 702, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit9, "")), 10, Gx_line+163, 92, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 8, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit10, "")), 6, Gx_line+188, 101, Gx_line+203, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit11, "")), 11, Gx_line+211, 69, Gx_line+228, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit12, "")), 200, Gx_line+211, 289, Gx_line+229, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit13, "")), 536, Gx_line+211, 625, Gx_line+229, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit14, "")), 15, Gx_line+248, 89, Gx_line+266, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit15, "")), 128, Gx_line+248, 238, Gx_line+266, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV176TipArtDsc, "")), 181, Gx_line+142, 370, Gx_line+160, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+304) ;
               }
               else
               {
                  getPrinter().GxAttris("Tahoma", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV163Hdr, "")), 144, Gx_line+7, 237, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4654RecNroPar), "ZZZZZ9")), 440, Gx_line+11, 485, Gx_line+29, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9")), 726, Gx_line+11, 756, Gx_line+29, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 99, Gx_line+40, 144, Gx_line+58, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 153, Gx_line+40, 342, Gx_line+58, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 78, Gx_line+67, 179, Gx_line+85, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 184, Gx_line+67, 348, Gx_line+85, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 76, Gx_line+130, 158, Gx_line+148, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 294, Gx_line+130, 339, Gx_line+148, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 358, Gx_line+130, 374, Gx_line+148, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36TipColCod), "Z9")), 388, Gx_line+130, 404, Gx_line+148, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85DesCol, "")), 417, Gx_line+130, 512, Gx_line+148, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86DesInt, "")), 631, Gx_line+130, 726, Gx_line+148, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(4, Gx_line+31, 778, Gx_line+108, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4609BarMdlCod, "")), 433, Gx_line+40, 515, Gx_line+58, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(4, Gx_line+122, 778, Gx_line+155, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( AV169RecFecAlt, "99/99/99 99:99"), 652, Gx_line+40, 746, Gx_line+58, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV168RecUsrCod, "")), 652, Gx_line+59, 753, Gx_line+77, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(552, Gx_line+31, 778, Gx_line+81, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit0, "")), 15, Gx_line+9, 104, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit1, "")), 342, Gx_line+11, 431, Gx_line+29, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit2, "")), 638, Gx_line+11, 720, Gx_line+29, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit3, "")), 15, Gx_line+40, 85, Gx_line+57, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit4, "")), 346, Gx_line+40, 428, Gx_line+58, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit5, "")), 558, Gx_line+40, 647, Gx_line+58, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit6, "")), 558, Gx_line+59, 646, Gx_line+76, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit7, "")), 15, Gx_line+67, 73, Gx_line+84, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 8, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit10, "")), 7, Gx_line+113, 102, Gx_line+128, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit11, "")), 15, Gx_line+130, 73, Gx_line+147, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit12, "")), 201, Gx_line+130, 290, Gx_line+148, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit13, "")), 538, Gx_line+130, 627, Gx_line+148, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV176TipArtDsc, "")), 184, Gx_line+84, 373, Gx_line+102, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit14, "")), 15, Gx_line+160, 89, Gx_line+178, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV153RecMaqKgs, "ZZZZZZ9.99")), 102, Gx_line+158, 197, Gx_line+179, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit15, "")), 224, Gx_line+160, 334, Gx_line+178, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV155RecMaqPrd), "ZZZZ9")), 344, Gx_line+158, 392, Gx_line+179, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Máquina", ""), 410, Gx_line+160, 467, Gx_line+178, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19BarMaqCod, "")), 476, Gx_line+158, 565, Gx_line+179, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82DescMaq, "")), 574, Gx_line+158, 692, Gx_line+179, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV187Muestras_i, "")), 619, Gx_line+84, 714, Gx_line+102, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+180) ;
               }
               getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 43, Gx_line+19, 87, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 436, Gx_line+19, 453, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(4, Gx_line+16, 778, Gx_line+39, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(138, Gx_line+16, 138, Gx_line+39, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(429, Gx_line+16, 429, Gx_line+39, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(458, Gx_line+16, 458, Gx_line+39, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(590, Gx_line+16, 590, Gx_line+39, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit16, "")), 216, Gx_line+19, 363, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit18, "")), 480, Gx_line+19, 569, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit23, "")), 611, Gx_line+19, 758, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 700, Gx_line+0, 726, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 741, Gx_line+1, 780, Gx_line+16, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+41) ;
            }
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

   protected void cleanup( )
   {
      this.aP0[0] = rreclav.this.AV15EmprCod;
      this.aP1[0] = rreclav.this.AV16BarCod;
      this.aP2[0] = rreclav.this.AV17BarCodReo;
      this.aP3[0] = rreclav.this.AV18BarCodPar;
      this.aP4[0] = rreclav.this.AV19BarMaqCod;
      this.aP5[0] = rreclav.this.AV20BarSua;
      this.aP6[0] = rreclav.this.AV21Volumen;
      this.aP7[0] = rreclav.this.AV117RecLinMaq;
      this.aP8[0] = rreclav.this.AV22ImpCod;
      this.aP9[0] = rreclav.this.Gx_out;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV138ContDsc = "" ;
      AV147Var3 = "" ;
      scmdbuf = "" ;
      P06P92_A396EmprCod = new String[] {""} ;
      P06P92_A407EmprNom = new String[] {""} ;
      P06P92_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      AV133NomEmp = "" ;
      AV89Termin = "" ;
      P06P93_A942TermCod = new String[] {""} ;
      P06P93_A1189TermUsu = new String[] {""} ;
      P06P93_n1189TermUsu = new boolean[] {false} ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      AV90TermUsu = "" ;
      GXv_char2 = new String[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char6 = new String[1] ;
      AV24Intens = "" ;
      AV25Matiz = "" ;
      AV35TipCol = "" ;
      AV71Tonalidad = "" ;
      AV75Serie = "" ;
      AV30Coste = DecimalUtil.ZERO ;
      AV85DesCol = "" ;
      AV86DesInt = "" ;
      AV38Lit0 = "" ;
      AV39Lit1 = "" ;
      AV40Lit2 = "" ;
      AV41Lit3 = "" ;
      AV42Lit4 = "" ;
      AV43Lit5 = "" ;
      AV44Lit6 = "" ;
      AV45Lit7 = "" ;
      AV46Lit8 = "" ;
      AV47Lit9 = "" ;
      AV48Lit10 = "" ;
      AV49Lit11 = "" ;
      AV50Lit12 = "" ;
      AV51Lit13 = "" ;
      AV52Lit14 = "" ;
      AV53Lit15 = "" ;
      AV54Lit16 = "" ;
      AV55Lit17 = "" ;
      AV56Lit18 = "" ;
      AV57Lit19 = "" ;
      AV58Lit20 = "" ;
      AV59Lit21 = "" ;
      AV60Lit22 = "" ;
      GXt_char15 = "" ;
      AV61Lit23 = "" ;
      P06P95_A3915EmpNumDec = new byte[1] ;
      P06P95_n3915EmpNumDec = new boolean[] {false} ;
      P06P95_A2804RecLinMaq = new short[1] ;
      P06P95_A130BarCodPar = new String[] {""} ;
      P06P95_A132BarCodReo = new byte[1] ;
      P06P95_A129BarCod = new int[1] ;
      P06P95_A396EmprCod = new String[] {""} ;
      P06P95_A217BarTipArt = new short[1] ;
      P06P95_n217BarTipArt = new boolean[] {false} ;
      P06P95_A3030BarPlf = new String[] {""} ;
      P06P95_A4268RecOrdLin = new short[1] ;
      P06P95_n4268RecOrdLin = new boolean[] {false} ;
      P06P95_A4402RecUsrCod = new String[] {""} ;
      P06P95_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P06P95_n4866RecFecAlt = new boolean[] {false} ;
      P06P95_A4610BarTam = new String[] {""} ;
      P06P95_A4609BarMdlCod = new String[] {""} ;
      P06P95_A234BarUrdP3 = new short[1] ;
      P06P95_A233BarUrdP2 = new short[1] ;
      P06P95_A232BarUrdP1 = new short[1] ;
      P06P95_A226BarTraP3 = new short[1] ;
      P06P95_A225BarTraP2 = new short[1] ;
      P06P95_A224BarTraP1 = new short[1] ;
      P06P95_A231BarUrd3 = new String[] {""} ;
      P06P95_A230BarUrd2 = new String[] {""} ;
      P06P95_A229BarUrd1 = new String[] {""} ;
      P06P95_A223BarTra3 = new String[] {""} ;
      P06P95_A222BarTra2 = new String[] {""} ;
      P06P95_A221BarTra1 = new String[] {""} ;
      P06P95_A136BarColNum = new int[1] ;
      P06P95_A135BarColNom = new String[] {""} ;
      P06P95_A1652BarSerDsc = new String[] {""} ;
      P06P95_A212BarSer = new String[] {""} ;
      P06P95_A279CliNom = new String[] {""} ;
      P06P95_A252CliCod = new int[1] ;
      P06P95_n252CliCod = new boolean[] {false} ;
      P06P95_A4654RecNroPar = new int[1] ;
      P06P95_n4654RecNroPar = new boolean[] {false} ;
      P06P95_A2805RecVolPrd = new int[1] ;
      P06P95_A4273RecFagPrd = new int[1] ;
      P06P95_A4261RecTotPrd = new int[1] ;
      P06P95_n4261RecTotPrd = new boolean[] {false} ;
      P06P95_A4272RecFagMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06P95_A4260RecTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06P95_n4260RecTotMts = new boolean[] {false} ;
      P06P95_A4271RecFagKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06P95_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A3030BarPlf = "" ;
      A4402RecUsrCod = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4610BarTam = "" ;
      A4609BarMdlCod = "" ;
      A231BarUrd3 = "" ;
      A230BarUrd2 = "" ;
      A229BarUrd1 = "" ;
      A223BarTra3 = "" ;
      A222BarTra2 = "" ;
      A221BarTra1 = "" ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A279CliNom = "" ;
      A4272RecFagMts = DecimalUtil.ZERO ;
      A4260RecTotMts = DecimalUtil.ZERO ;
      A4271RecFagKgs = DecimalUtil.ZERO ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4316RecMaqKgs = DecimalUtil.ZERO ;
      A4317RecMaqMts = DecimalUtil.ZERO ;
      AV187Muestras_i = "" ;
      P06P96_A396EmprCod = new String[] {""} ;
      P06P96_A129BarCod = new int[1] ;
      P06P96_A132BarCodReo = new byte[1] ;
      P06P96_A130BarCodPar = new String[] {""} ;
      P06P96_A4643BarFasLot = new int[1] ;
      P06P96_A194BarOrdLin = new short[1] ;
      P06P96_A4648BarFasRecu = new int[1] ;
      P06P96_n4648BarFasRecu = new boolean[] {false} ;
      P06P96_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV168RecUsrCod = "" ;
      AV169RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV153RecMaqKgs = DecimalUtil.ZERO ;
      AV154RecMaqMts = DecimalUtil.ZERO ;
      AV26RelBany = DecimalUtil.ZERO ;
      AV160FasCod = "" ;
      P06P97_A396EmprCod = new String[] {""} ;
      P06P97_A129BarCod = new int[1] ;
      P06P97_A132BarCodReo = new byte[1] ;
      P06P97_A130BarCodPar = new String[] {""} ;
      P06P97_A194BarOrdLin = new short[1] ;
      P06P97_A457FasCod = new String[] {""} ;
      P06P97_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      AV185ProCod = "" ;
      AV166TipDefDsc = "" ;
      AV167vTexto = "" ;
      GXv_int14 = new short[1] ;
      AV164FasDsc = "" ;
      AV27Procesos = new String[6] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         AV27Procesos[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV29Tiempos = new short[6] ;
      P06P98_A396EmprCod = new String[] {""} ;
      P06P98_A129BarCod = new int[1] ;
      P06P98_A132BarCodReo = new byte[1] ;
      P06P98_A130BarCodPar = new String[] {""} ;
      P06P98_A2804RecLinMaq = new short[1] ;
      P06P98_A764ProForCod = new String[] {""} ;
      P06P98_A771ProForTie = new short[1] ;
      P06P98_A1273RecLinPro = new byte[1] ;
      A764ProForCod = "" ;
      AV87HojRut = "" ;
      AV163Hdr = "" ;
      AV156HdrPart = "" ;
      AV106HdrPda = "" ;
      P06P99_A396EmprCod = new String[] {""} ;
      P06P99_A129BarCod = new int[1] ;
      P06P99_A132BarCodReo = new byte[1] ;
      P06P99_A130BarCodPar = new String[] {""} ;
      P06P99_A1273RecLinPro = new byte[1] ;
      P06P99_A2804RecLinMaq = new short[1] ;
      P06P99_A764ProForCod = new String[] {""} ;
      P06P99_A771ProForTie = new short[1] ;
      P06P99_A2392ProNumPro = new int[1] ;
      P06P99_A4695RecVolPrf = new int[1] ;
      P06P99_A766ProForDsc = new String[] {""} ;
      A766ProForDsc = "" ;
      AV161ProForCod = "" ;
      P06P910_A396EmprCod = new String[] {""} ;
      P06P910_A764ProForCod = new String[] {""} ;
      P06P910_A457FasCod = new String[] {""} ;
      P06P910_A4652FasForTPau = new short[1] ;
      P06P910_n4652FasForTPau = new boolean[] {false} ;
      P06P910_A4651FasForNPro = new short[1] ;
      P06P910_n4651FasForNPro = new boolean[] {false} ;
      P06P910_A4650FasForLin = new short[1] ;
      P06P911_A719PrdNum = new String[] {""} ;
      P06P911_n719PrdNum = new boolean[] {false} ;
      P06P911_A396EmprCod = new String[] {""} ;
      P06P911_A129BarCod = new int[1] ;
      P06P911_A132BarCodReo = new byte[1] ;
      P06P911_A130BarCodPar = new String[] {""} ;
      P06P911_A2804RecLinMaq = new short[1] ;
      P06P911_A1273RecLinPro = new byte[1] ;
      P06P911_A490ForPrdUMe = new byte[1] ;
      P06P911_n490ForPrdUMe = new boolean[] {false} ;
      P06P911_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06P911_A2394RecForNro = new byte[1] ;
      P06P911_A872RecPrdNum = new String[] {""} ;
      P06P911_A875RecPrdDsc = new String[] {""} ;
      P06P911_A743PrdUniCon = new byte[1] ;
      P06P911_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06P911_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06P911_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06P911_A811RecLin = new short[1] ;
      A719PrdNum = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV108Var2 = "" ;
      AV107Var1 = "" ;
      AV105RecForNro = "" ;
      AV37PrdDsc = "" ;
      AV23CodPrd = "" ;
      AV73Unidades = "" ;
      AV72Cantidad = DecimalUtil.ZERO ;
      AV181Va1 = "" ;
      AV183Va3 = "" ;
      AV182Va2 = "" ;
      AV32CosKgm = DecimalUtil.ZERO ;
      AV33CosMtr = DecimalUtil.ZERO ;
      AV78ArtCod = "" ;
      AV79ForColNom = "" ;
      P06P912_A831TipColCod = new byte[1] ;
      P06P912_A483ForColNum = new int[1] ;
      P06P912_A482ForColNom = new String[] {""} ;
      P06P912_A494ForSer = new String[] {""} ;
      P06P912_A252CliCod = new int[1] ;
      P06P912_n252CliCod = new boolean[] {false} ;
      P06P912_A396EmprCod = new String[] {""} ;
      P06P912_A649ObsForTxt = new String[] {""} ;
      P06P912_A650ObsLin = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A649ObsForTxt = "" ;
      P06P913_A602MaqCod = new String[] {""} ;
      P06P913_A396EmprCod = new String[] {""} ;
      P06P913_A606MaqDsc = new String[] {""} ;
      P06P913_n606MaqDsc = new boolean[] {false} ;
      P06P913_A2391MaqMicro = new byte[1] ;
      P06P913_n2391MaqMicro = new boolean[] {false} ;
      P06P913_A3598MaqNroTub = new byte[1] ;
      P06P913_n3598MaqNroTub = new boolean[] {false} ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      AV82DescMaq = "" ;
      P06P914_A833TipDefCod = new short[1] ;
      P06P914_n833TipDefCod = new boolean[] {false} ;
      P06P914_A4667HisLavCon = new int[1] ;
      P06P914_A4665HisLavOrd = new short[1] ;
      P06P914_A4664HisLavNpd = new int[1] ;
      P06P914_A4663HisLavPar = new String[] {""} ;
      P06P914_A4662HisLavReo = new byte[1] ;
      P06P914_A4661HisLavCod = new int[1] ;
      P06P914_A834TipDefDsc = new String[] {""} ;
      P06P914_n834TipDefDsc = new boolean[] {false} ;
      P06P914_A396EmprCod = new String[] {""} ;
      A4663HisLavPar = "" ;
      A834TipDefDsc = "" ;
      AV176TipArtDsc = "" ;
      P06P915_A829TipArtCod = new short[1] ;
      P06P915_A830TipArtDsc = new String[] {""} ;
      P06P915_n830TipArtDsc = new boolean[] {false} ;
      P06P915_A396EmprCod = new String[] {""} ;
      A830TipArtDsc = "" ;
      P06P916_A194BarOrdLin = new short[1] ;
      P06P916_A758ProCod = new String[] {""} ;
      P06P916_A130BarCodPar = new String[] {""} ;
      P06P916_A132BarCodReo = new byte[1] ;
      P06P916_A129BarCod = new int[1] ;
      P06P916_A396EmprCod = new String[] {""} ;
      P06P916_A4940A_Barcod = new int[1] ;
      P06P916_A4941A_BarReo = new byte[1] ;
      P06P916_A4942A_BarPar = new String[] {""} ;
      P06P916_A4947A_Piezas = new short[1] ;
      P06P916_n4947A_Piezas = new boolean[] {false} ;
      P06P916_A4946A_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06P916_n4946A_Kilos = new boolean[] {false} ;
      P06P916_A4943A_ProCod = new String[] {""} ;
      P06P916_A4944A_BarOrd = new short[1] ;
      A4942A_BarPar = "" ;
      A4946A_Kilos = DecimalUtil.ZERO ;
      A4943A_ProCod = "" ;
      GXv_char13 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char11 = new String[1] ;
      GXv_int5 = new int[1] ;
      AV178CliNom_a = "" ;
      GXv_char10 = new String[1] ;
      AV179BarSer_a = "" ;
      GXv_char8 = new String[1] ;
      AV180ColNom_a = "" ;
      GXv_char7 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int16 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rreclav__default(),
         new Object[] {
             new Object[] {
            P06P92_A396EmprCod, P06P92_A407EmprNom, P06P92_n407EmprNom
            }
            , new Object[] {
            P06P93_A942TermCod, P06P93_A1189TermUsu, P06P93_n1189TermUsu
            }
            , new Object[] {
            P06P95_A3915EmpNumDec, P06P95_n3915EmpNumDec, P06P95_A2804RecLinMaq, P06P95_A130BarCodPar, P06P95_A132BarCodReo, P06P95_A129BarCod, P06P95_A396EmprCod, P06P95_A217BarTipArt, P06P95_n217BarTipArt, P06P95_A3030BarPlf,
            P06P95_A4268RecOrdLin, P06P95_n4268RecOrdLin, P06P95_A4402RecUsrCod, P06P95_A4866RecFecAlt, P06P95_n4866RecFecAlt, P06P95_A4610BarTam, P06P95_A4609BarMdlCod, P06P95_A234BarUrdP3, P06P95_A233BarUrdP2, P06P95_A232BarUrdP1,
            P06P95_A226BarTraP3, P06P95_A225BarTraP2, P06P95_A224BarTraP1, P06P95_A231BarUrd3, P06P95_A230BarUrd2, P06P95_A229BarUrd1, P06P95_A223BarTra3, P06P95_A222BarTra2, P06P95_A221BarTra1, P06P95_A136BarColNum,
            P06P95_A135BarColNom, P06P95_A1652BarSerDsc, P06P95_A212BarSer, P06P95_A279CliNom, P06P95_A252CliCod, P06P95_n252CliCod, P06P95_A4654RecNroPar, P06P95_n4654RecNroPar, P06P95_A2805RecVolPrd, P06P95_A4273RecFagPrd,
            P06P95_A4261RecTotPrd, P06P95_n4261RecTotPrd, P06P95_A4272RecFagMts, P06P95_A4260RecTotMts, P06P95_n4260RecTotMts, P06P95_A4271RecFagKgs, P06P95_A4259RecTotKgs
            }
            , new Object[] {
            P06P96_A396EmprCod, P06P96_A129BarCod, P06P96_A132BarCodReo, P06P96_A130BarCodPar, P06P96_A4643BarFasLot, P06P96_A194BarOrdLin, P06P96_A4648BarFasRecu, P06P96_n4648BarFasRecu, P06P96_A758ProCod
            }
            , new Object[] {
            P06P97_A396EmprCod, P06P97_A129BarCod, P06P97_A132BarCodReo, P06P97_A130BarCodPar, P06P97_A194BarOrdLin, P06P97_A457FasCod, P06P97_A758ProCod
            }
            , new Object[] {
            P06P98_A396EmprCod, P06P98_A129BarCod, P06P98_A132BarCodReo, P06P98_A130BarCodPar, P06P98_A2804RecLinMaq, P06P98_A764ProForCod, P06P98_A771ProForTie, P06P98_A1273RecLinPro
            }
            , new Object[] {
            P06P99_A396EmprCod, P06P99_A129BarCod, P06P99_A132BarCodReo, P06P99_A130BarCodPar, P06P99_A1273RecLinPro, P06P99_A2804RecLinMaq, P06P99_A764ProForCod, P06P99_A771ProForTie, P06P99_A2392ProNumPro, P06P99_A4695RecVolPrf,
            P06P99_A766ProForDsc
            }
            , new Object[] {
            P06P910_A396EmprCod, P06P910_A764ProForCod, P06P910_A457FasCod, P06P910_A4652FasForTPau, P06P910_n4652FasForTPau, P06P910_A4651FasForNPro, P06P910_n4651FasForNPro, P06P910_A4650FasForLin
            }
            , new Object[] {
            P06P911_A719PrdNum, P06P911_n719PrdNum, P06P911_A396EmprCod, P06P911_A129BarCod, P06P911_A132BarCodReo, P06P911_A130BarCodPar, P06P911_A2804RecLinMaq, P06P911_A1273RecLinPro, P06P911_A490ForPrdUMe, P06P911_n490ForPrdUMe,
            P06P911_A431FacCon, P06P911_A2394RecForNro, P06P911_A872RecPrdNum, P06P911_A875RecPrdDsc, P06P911_A743PrdUniCon, P06P911_A686PrdCant, P06P911_A707PrdFacCon, P06P911_A724PrdPreAct, P06P911_A811RecLin
            }
            , new Object[] {
            P06P912_A831TipColCod, P06P912_A483ForColNum, P06P912_A482ForColNom, P06P912_A494ForSer, P06P912_A252CliCod, P06P912_A396EmprCod, P06P912_A649ObsForTxt, P06P912_A650ObsLin
            }
            , new Object[] {
            P06P913_A602MaqCod, P06P913_A396EmprCod, P06P913_A606MaqDsc, P06P913_n606MaqDsc, P06P913_A2391MaqMicro, P06P913_n2391MaqMicro, P06P913_A3598MaqNroTub, P06P913_n3598MaqNroTub
            }
            , new Object[] {
            P06P914_A833TipDefCod, P06P914_n833TipDefCod, P06P914_A4667HisLavCon, P06P914_A4665HisLavOrd, P06P914_A4664HisLavNpd, P06P914_A4663HisLavPar, P06P914_A4662HisLavReo, P06P914_A4661HisLavCod, P06P914_A834TipDefDsc, P06P914_n834TipDefDsc,
            P06P914_A396EmprCod
            }
            , new Object[] {
            P06P915_A829TipArtCod, P06P915_A830TipArtDsc, P06P915_n830TipArtDsc, P06P915_A396EmprCod
            }
            , new Object[] {
            P06P916_A194BarOrdLin, P06P916_A758ProCod, P06P916_A130BarCodPar, P06P916_A132BarCodReo, P06P916_A129BarCod, P06P916_A396EmprCod, P06P916_A4940A_Barcod, P06P916_A4941A_BarReo, P06P916_A4942A_BarPar, P06P916_A4947A_Piezas,
            P06P916_n4947A_Piezas, P06P916_A4946A_Kilos, P06P916_n4946A_Kilos, P06P916_A4943A_ProCod, P06P916_A4944A_BarOrd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV146Flagidioma ;
   private byte AV31Flag ;
   private byte AV76FlagImp ;
   private byte AV88FlagBar ;
   private byte AV94FlagCod ;
   private byte AV132FlagNline ;
   private byte AV173F_aqua ;
   private byte AV186F_laundry ;
   private byte GXt_int3 ;
   private byte GXv_int1[] ;
   private byte AV36TipColCod ;
   private byte A3915EmpNumDec ;
   private byte A132BarCodReo ;
   private byte AV28I ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A743PrdUniCon ;
   private byte AV81Colorante ;
   private byte AV84FlagObs ;
   private byte A831TipColCod ;
   private byte AV140NTubos ;
   private byte A2391MaqMicro ;
   private byte A3598MaqNroTub ;
   private byte AV104MaqMicro ;
   private byte AV110NumCam ;
   private byte A4662HisLavReo ;
   private byte AV177F_vez ;
   private byte A4941A_BarReo ;
   private byte GXv_int9[] ;
   private short AV117RecLinMaq ;
   private short AV101MatCod ;
   private short A2804RecLinMaq ;
   private short A217BarTipArt ;
   private short A4268RecOrdLin ;
   private short A234BarUrdP3 ;
   private short A233BarUrdP2 ;
   private short A232BarUrdP1 ;
   private short A226BarTraP3 ;
   private short A225BarTraP2 ;
   private short A224BarTraP1 ;
   private short A4269RecRelBan ;
   private short AV175BarTipArt ;
   private short AV172BarOrdLin ;
   private short A194BarOrdLin ;
   private short AV159RecOrdLin ;
   private short GXv_int14[] ;
   private short AV29Tiempos[] ;
   private short A771ProForTie ;
   private short AV157ProForTie ;
   private short A4652FasForTPau ;
   private short A4651FasForNPro ;
   private short A4650FasForLin ;
   private short AV162vRb ;
   private short A811RecLin ;
   private short A650ObsLin ;
   private short A833TipDefCod ;
   private short A4665HisLavOrd ;
   private short A829TipArtCod ;
   private short A4947A_Piezas ;
   private short A4944A_BarOrd ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int AV21Volumen ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV77CliCod ;
   private int AV74NumCli ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A4654RecNroPar ;
   private int A2805RecVolPrd ;
   private int A4273RecFagPrd ;
   private int A4261RecTotPrd ;
   private int A4318RecMaqPrd ;
   private int AV170BarFasRecu ;
   private int AV171BarFasLot ;
   private int A4643BarFasLot ;
   private int A4648BarFasRecu ;
   private int AV155RecMaqPrd ;
   private int GX_I ;
   private int A2392ProNumPro ;
   private int A4695RecVolPrf ;
   private int AV158ProNumPro ;
   private int Gx_OldLine ;
   private int AV80ForColNum ;
   private int A483ForColNum ;
   private int A4667HisLavCon ;
   private int A4664HisLavNpd ;
   private int A4661HisLavCod ;
   private int A4940A_Barcod ;
   private int GXv_int12[] ;
   private int AV184CliCod_a ;
   private int GXv_int5[] ;
   private int GXv_int4[] ;
   private int AV188Discod ;
   private int GXv_int16[] ;
   private long AV34TotTiempo ;
   private java.math.BigDecimal AV30Coste ;
   private java.math.BigDecimal A4272RecFagMts ;
   private java.math.BigDecimal A4260RecTotMts ;
   private java.math.BigDecimal A4271RecFagKgs ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A4316RecMaqKgs ;
   private java.math.BigDecimal A4317RecMaqMts ;
   private java.math.BigDecimal AV153RecMaqKgs ;
   private java.math.BigDecimal AV154RecMaqMts ;
   private java.math.BigDecimal AV26RelBany ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV72Cantidad ;
   private java.math.BigDecimal AV32CosKgm ;
   private java.math.BigDecimal AV33CosMtr ;
   private java.math.BigDecimal A4946A_Kilos ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV19BarMaqCod ;
   private String AV20BarSua ;
   private String AV22ImpCod ;
   private String Gx_out ;
   private String AV138ContDsc ;
   private String AV147Var3 ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String AV133NomEmp ;
   private String AV89Termin ;
   private String A942TermCod ;
   private String A1189TermUsu ;
   private String AV90TermUsu ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String AV24Intens ;
   private String AV25Matiz ;
   private String AV35TipCol ;
   private String AV71Tonalidad ;
   private String AV75Serie ;
   private String AV85DesCol ;
   private String AV86DesInt ;
   private String AV38Lit0 ;
   private String AV39Lit1 ;
   private String AV40Lit2 ;
   private String AV41Lit3 ;
   private String AV42Lit4 ;
   private String AV43Lit5 ;
   private String AV44Lit6 ;
   private String AV45Lit7 ;
   private String AV46Lit8 ;
   private String AV47Lit9 ;
   private String AV48Lit10 ;
   private String AV49Lit11 ;
   private String AV50Lit12 ;
   private String AV51Lit13 ;
   private String AV52Lit14 ;
   private String AV53Lit15 ;
   private String AV54Lit16 ;
   private String AV55Lit17 ;
   private String AV56Lit18 ;
   private String AV57Lit19 ;
   private String AV58Lit20 ;
   private String AV59Lit21 ;
   private String AV60Lit22 ;
   private String GXt_char15 ;
   private String AV61Lit23 ;
   private String A130BarCodPar ;
   private String A3030BarPlf ;
   private String A4402RecUsrCod ;
   private String A4610BarTam ;
   private String A4609BarMdlCod ;
   private String A231BarUrd3 ;
   private String A230BarUrd2 ;
   private String A229BarUrd1 ;
   private String A223BarTra3 ;
   private String A222BarTra2 ;
   private String A221BarTra1 ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A279CliNom ;
   private String AV187Muestras_i ;
   private String A758ProCod ;
   private String AV168RecUsrCod ;
   private String AV160FasCod ;
   private String A457FasCod ;
   private String AV185ProCod ;
   private String AV166TipDefDsc ;
   private String AV167vTexto ;
   private String AV164FasDsc ;
   private String AV27Procesos[] ;
   private String A764ProForCod ;
   private String AV87HojRut ;
   private String AV163Hdr ;
   private String AV156HdrPart ;
   private String AV106HdrPda ;
   private String A766ProForDsc ;
   private String AV161ProForCod ;
   private String A719PrdNum ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String AV108Var2 ;
   private String AV107Var1 ;
   private String AV105RecForNro ;
   private String AV37PrdDsc ;
   private String AV23CodPrd ;
   private String AV73Unidades ;
   private String AV181Va1 ;
   private String AV183Va3 ;
   private String AV182Va2 ;
   private String AV78ArtCod ;
   private String AV79ForColNom ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A649ObsForTxt ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String AV82DescMaq ;
   private String A4663HisLavPar ;
   private String A834TipDefDsc ;
   private String AV176TipArtDsc ;
   private String A830TipArtDsc ;
   private String A4942A_BarPar ;
   private String A4943A_ProCod ;
   private String GXv_char13[] ;
   private String GXv_char11[] ;
   private String AV178CliNom_a ;
   private String GXv_char10[] ;
   private String AV179BarSer_a ;
   private String GXv_char8[] ;
   private String AV180ColNom_a ;
   private String GXv_char7[] ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV169RecFecAlt ;
   private boolean n407EmprNom ;
   private boolean n1189TermUsu ;
   private boolean GxHdr4 ;
   private boolean n3915EmpNumDec ;
   private boolean n217BarTipArt ;
   private boolean n4268RecOrdLin ;
   private boolean n4866RecFecAlt ;
   private boolean n252CliCod ;
   private boolean n4654RecNroPar ;
   private boolean n4261RecTotPrd ;
   private boolean n4260RecTotMts ;
   private boolean returnInSub ;
   private boolean n4648BarFasRecu ;
   private boolean n4652FasForTPau ;
   private boolean n4651FasForNPro ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n606MaqDsc ;
   private boolean n2391MaqMicro ;
   private boolean n3598MaqNroTub ;
   private boolean n833TipDefCod ;
   private boolean n834TipDefDsc ;
   private boolean n830TipArtDsc ;
   private boolean n4947A_Piezas ;
   private boolean n4946A_Kilos ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P06P92_A396EmprCod ;
   private String[] P06P92_A407EmprNom ;
   private boolean[] P06P92_n407EmprNom ;
   private String[] P06P93_A942TermCod ;
   private String[] P06P93_A1189TermUsu ;
   private boolean[] P06P93_n1189TermUsu ;
   private byte[] P06P95_A3915EmpNumDec ;
   private boolean[] P06P95_n3915EmpNumDec ;
   private short[] P06P95_A2804RecLinMaq ;
   private String[] P06P95_A130BarCodPar ;
   private byte[] P06P95_A132BarCodReo ;
   private int[] P06P95_A129BarCod ;
   private String[] P06P95_A396EmprCod ;
   private short[] P06P95_A217BarTipArt ;
   private boolean[] P06P95_n217BarTipArt ;
   private String[] P06P95_A3030BarPlf ;
   private short[] P06P95_A4268RecOrdLin ;
   private boolean[] P06P95_n4268RecOrdLin ;
   private String[] P06P95_A4402RecUsrCod ;
   private java.util.Date[] P06P95_A4866RecFecAlt ;
   private boolean[] P06P95_n4866RecFecAlt ;
   private String[] P06P95_A4610BarTam ;
   private String[] P06P95_A4609BarMdlCod ;
   private short[] P06P95_A234BarUrdP3 ;
   private short[] P06P95_A233BarUrdP2 ;
   private short[] P06P95_A232BarUrdP1 ;
   private short[] P06P95_A226BarTraP3 ;
   private short[] P06P95_A225BarTraP2 ;
   private short[] P06P95_A224BarTraP1 ;
   private String[] P06P95_A231BarUrd3 ;
   private String[] P06P95_A230BarUrd2 ;
   private String[] P06P95_A229BarUrd1 ;
   private String[] P06P95_A223BarTra3 ;
   private String[] P06P95_A222BarTra2 ;
   private String[] P06P95_A221BarTra1 ;
   private int[] P06P95_A136BarColNum ;
   private String[] P06P95_A135BarColNom ;
   private String[] P06P95_A1652BarSerDsc ;
   private String[] P06P95_A212BarSer ;
   private String[] P06P95_A279CliNom ;
   private int[] P06P95_A252CliCod ;
   private boolean[] P06P95_n252CliCod ;
   private int[] P06P95_A4654RecNroPar ;
   private boolean[] P06P95_n4654RecNroPar ;
   private int[] P06P95_A2805RecVolPrd ;
   private int[] P06P95_A4273RecFagPrd ;
   private int[] P06P95_A4261RecTotPrd ;
   private boolean[] P06P95_n4261RecTotPrd ;
   private java.math.BigDecimal[] P06P95_A4272RecFagMts ;
   private java.math.BigDecimal[] P06P95_A4260RecTotMts ;
   private boolean[] P06P95_n4260RecTotMts ;
   private java.math.BigDecimal[] P06P95_A4271RecFagKgs ;
   private java.math.BigDecimal[] P06P95_A4259RecTotKgs ;
   private String[] P06P96_A396EmprCod ;
   private int[] P06P96_A129BarCod ;
   private byte[] P06P96_A132BarCodReo ;
   private String[] P06P96_A130BarCodPar ;
   private int[] P06P96_A4643BarFasLot ;
   private short[] P06P96_A194BarOrdLin ;
   private int[] P06P96_A4648BarFasRecu ;
   private boolean[] P06P96_n4648BarFasRecu ;
   private String[] P06P96_A758ProCod ;
   private String[] P06P97_A396EmprCod ;
   private int[] P06P97_A129BarCod ;
   private byte[] P06P97_A132BarCodReo ;
   private String[] P06P97_A130BarCodPar ;
   private short[] P06P97_A194BarOrdLin ;
   private String[] P06P97_A457FasCod ;
   private String[] P06P97_A758ProCod ;
   private String[] P06P98_A396EmprCod ;
   private int[] P06P98_A129BarCod ;
   private byte[] P06P98_A132BarCodReo ;
   private String[] P06P98_A130BarCodPar ;
   private short[] P06P98_A2804RecLinMaq ;
   private String[] P06P98_A764ProForCod ;
   private short[] P06P98_A771ProForTie ;
   private byte[] P06P98_A1273RecLinPro ;
   private String[] P06P99_A396EmprCod ;
   private int[] P06P99_A129BarCod ;
   private byte[] P06P99_A132BarCodReo ;
   private String[] P06P99_A130BarCodPar ;
   private byte[] P06P99_A1273RecLinPro ;
   private short[] P06P99_A2804RecLinMaq ;
   private String[] P06P99_A764ProForCod ;
   private short[] P06P99_A771ProForTie ;
   private int[] P06P99_A2392ProNumPro ;
   private int[] P06P99_A4695RecVolPrf ;
   private String[] P06P99_A766ProForDsc ;
   private String[] P06P910_A396EmprCod ;
   private String[] P06P910_A764ProForCod ;
   private String[] P06P910_A457FasCod ;
   private short[] P06P910_A4652FasForTPau ;
   private boolean[] P06P910_n4652FasForTPau ;
   private short[] P06P910_A4651FasForNPro ;
   private boolean[] P06P910_n4651FasForNPro ;
   private short[] P06P910_A4650FasForLin ;
   private String[] P06P911_A719PrdNum ;
   private boolean[] P06P911_n719PrdNum ;
   private String[] P06P911_A396EmprCod ;
   private int[] P06P911_A129BarCod ;
   private byte[] P06P911_A132BarCodReo ;
   private String[] P06P911_A130BarCodPar ;
   private short[] P06P911_A2804RecLinMaq ;
   private byte[] P06P911_A1273RecLinPro ;
   private byte[] P06P911_A490ForPrdUMe ;
   private boolean[] P06P911_n490ForPrdUMe ;
   private java.math.BigDecimal[] P06P911_A431FacCon ;
   private byte[] P06P911_A2394RecForNro ;
   private String[] P06P911_A872RecPrdNum ;
   private String[] P06P911_A875RecPrdDsc ;
   private byte[] P06P911_A743PrdUniCon ;
   private java.math.BigDecimal[] P06P911_A686PrdCant ;
   private java.math.BigDecimal[] P06P911_A707PrdFacCon ;
   private java.math.BigDecimal[] P06P911_A724PrdPreAct ;
   private short[] P06P911_A811RecLin ;
   private byte[] P06P912_A831TipColCod ;
   private int[] P06P912_A483ForColNum ;
   private String[] P06P912_A482ForColNom ;
   private String[] P06P912_A494ForSer ;
   private int[] P06P912_A252CliCod ;
   private boolean[] P06P912_n252CliCod ;
   private String[] P06P912_A396EmprCod ;
   private String[] P06P912_A649ObsForTxt ;
   private short[] P06P912_A650ObsLin ;
   private String[] P06P913_A602MaqCod ;
   private String[] P06P913_A396EmprCod ;
   private String[] P06P913_A606MaqDsc ;
   private boolean[] P06P913_n606MaqDsc ;
   private byte[] P06P913_A2391MaqMicro ;
   private boolean[] P06P913_n2391MaqMicro ;
   private byte[] P06P913_A3598MaqNroTub ;
   private boolean[] P06P913_n3598MaqNroTub ;
   private short[] P06P914_A833TipDefCod ;
   private boolean[] P06P914_n833TipDefCod ;
   private int[] P06P914_A4667HisLavCon ;
   private short[] P06P914_A4665HisLavOrd ;
   private int[] P06P914_A4664HisLavNpd ;
   private String[] P06P914_A4663HisLavPar ;
   private byte[] P06P914_A4662HisLavReo ;
   private int[] P06P914_A4661HisLavCod ;
   private String[] P06P914_A834TipDefDsc ;
   private boolean[] P06P914_n834TipDefDsc ;
   private String[] P06P914_A396EmprCod ;
   private short[] P06P915_A829TipArtCod ;
   private String[] P06P915_A830TipArtDsc ;
   private boolean[] P06P915_n830TipArtDsc ;
   private String[] P06P915_A396EmprCod ;
   private short[] P06P916_A194BarOrdLin ;
   private String[] P06P916_A758ProCod ;
   private String[] P06P916_A130BarCodPar ;
   private byte[] P06P916_A132BarCodReo ;
   private int[] P06P916_A129BarCod ;
   private String[] P06P916_A396EmprCod ;
   private int[] P06P916_A4940A_Barcod ;
   private byte[] P06P916_A4941A_BarReo ;
   private String[] P06P916_A4942A_BarPar ;
   private short[] P06P916_A4947A_Piezas ;
   private boolean[] P06P916_n4947A_Piezas ;
   private java.math.BigDecimal[] P06P916_A4946A_Kilos ;
   private boolean[] P06P916_n4946A_Kilos ;
   private String[] P06P916_A4943A_ProCod ;
   private short[] P06P916_A4944A_BarOrd ;
}

final  class rreclav__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06P92", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06P93", "SELECT TermCod, TermUsu FROM TXPTERMIN WHERE TermCod = ? ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06P95", "SELECT T2.EmpNumDec, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T3.BarTipArt, T3.BarPlf, T1.RecOrdLin, T1.RecUsrCod, T1.RecFecAlt, T3.BarTam, T3.BarMdlCod, T3.BarUrdP3, T3.BarUrdP2, T3.BarUrdP1, T3.BarTraP3, T3.BarTraP2, T3.BarTraP1, T3.BarUrd3, T3.BarUrd2, T3.BarUrd1, T3.BarTra3, T3.BarTra2, T3.BarTra1, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, T4.CliNom, T3.CliCod, T1.RecNroPar, T1.RecVolPrd, COALESCE( T5.RecFagPrd, 0) AS RecFagPrd, T1.RecTotPrd, COALESCE( T5.RecFagMts, 0) AS RecFagMts, T1.RecTotMts, COALESCE( T5.RecFagKgs, 0) AS RecFagKgs, T1.RecTotKgs FROM ((((TXPRECMAQ T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT SUM(RecAgrKgs) AS RecFagKgs, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, SUM(RecAgrMts) AS RecFagMts, SUM(RecAgrPrd) AS RecFagPrd FROM TXPRECFAG GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar AND T5.RecLinMaq = T1.RecLinMaq) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06P96", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFasLot, BarOrdLin, BarFasRecu, ProCod FROM TXPFASMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin = ?) AND (BarFasLot = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06P97", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, FasCod, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06P98", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.ProForCod, T2.ProForTie, T1.RecLinPro FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06P99", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinPro, T1.RecLinMaq, T1.ProForCod, T2.ProForTie, T2.ProNumPro, T1.RecVolPrf, T2.ProForDsc FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06P910", "SELECT EmprCod, ProForCod, FasCod, FasForTPau, FasForNPro, FasForLin FROM TXPFASPR1 WHERE (EmprCod = ? and FasCod = ?) AND (ProForCod = ?) ORDER BY EmprCod, FasCod, FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06P911", "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.ForPrdUMe, T1.FacCon, T1.RecForNro, T1.RecPrdNum, T1.RecPrdDsc, T2.PrdUniCon, T1.PrdCant, T2.PrdFacCon, T2.PrdPreAct, T1.RecLin FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06P912", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ObsForTxt, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06P913", "SELECT MaqCod, EmprCod, MaqDsc, MaqMicro, MaqNroTub FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06P914", "SELECT T1.TipDefCod, T1.HisLavCon, T1.HisLavOrd, T1.HisLavNpd, T1.HisLavPar, T1.HisLavReo, T1.HisLavCod, T2.TipDefDsc, T1.EmprCod FROM (TXPHISRE1 T1 LEFT JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE (T1.HisLavCod = ?) AND (T1.HisLavReo = ?) AND (T1.HisLavPar = ?) AND (T1.HisLavNpd = ?) AND (T1.HisLavOrd = ?) AND (T1.HisLavCon = ?) ORDER BY T1.EmprCod, T1.HisLavCod, T1.HisLavReo, T1.HisLavPar, T1.HisLavNpd, T1.HisLavOrd, T1.HisLavCon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06P915", "SELECT TipArtCod, TipArtDsc, EmprCod FROM TXPTIPART WHERE TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06P916", "SELECT BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, A_Barcod, A_BarReo, A_BarPar, A_Piezas, A_Kilos, A_ProCod, A_BarOrd FROM TXPAGRHDF WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 8);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 4);
               ((String[]) buf[16])[0] = rslt.getString(13, 13);
               ((short[]) buf[17])[0] = rslt.getShort(14);
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((short[]) buf[19])[0] = rslt.getShort(16);
               ((short[]) buf[20])[0] = rslt.getShort(17);
               ((short[]) buf[21])[0] = rslt.getShort(18);
               ((short[]) buf[22])[0] = rslt.getShort(19);
               ((String[]) buf[23])[0] = rslt.getString(20, 4);
               ((String[]) buf[24])[0] = rslt.getString(21, 4);
               ((String[]) buf[25])[0] = rslt.getString(22, 4);
               ((String[]) buf[26])[0] = rslt.getString(23, 4);
               ((String[]) buf[27])[0] = rslt.getString(24, 4);
               ((String[]) buf[28])[0] = rslt.getString(25, 4);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 13);
               ((String[]) buf[31])[0] = rslt.getString(28, 26);
               ((String[]) buf[32])[0] = rslt.getString(29, 16);
               ((String[]) buf[33])[0] = rslt.getString(30, 30);
               ((int[]) buf[34])[0] = rslt.getInt(31);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(32);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(33);
               ((int[]) buf[39])[0] = rslt.getInt(34);
               ((int[]) buf[40])[0] = rslt.getInt(35);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(36,2);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(38,2);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(39,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((String[]) buf[13])[0] = rslt.getString(12, 26);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,3);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,4);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,5);
               ((short[]) buf[18])[0] = rslt.getShort(17);
               return;
            case 9 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 8);
               ((short[]) buf[14])[0] = rslt.getShort(13);
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
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

