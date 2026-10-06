package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rncetm extends GXReport
{
   public rncetm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rncetm.class ), "" );
   }

   public rncetm( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      rncetm.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 )
   {
      rncetm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rncetm.this.AV38Hisbarcod = aP1[0];
      this.aP1 = aP1;
      rncetm.this.AV39Hiscodreo = aP2[0];
      this.aP2 = aP2;
      rncetm.this.AV40Hiscodpar = aP3[0];
      this.aP3 = aP3;
      rncetm.this.AV25HisreoTn = aP4[0];
      this.aP4 = aP4;
      rncetm.this.Gx_out = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 2 ;
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
         getPrinter().GxSetDocName("Reclamaçao") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*2)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV16Station ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         rncetm.this.GXt_char1 = GXv_char2[0] ;
         AV16Station = GXt_char1 ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = AV17EmprNom ;
         GXv_char4[0] = AV9Usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
         rncetm.this.A396EmprCod = GXv_char2[0] ;
         rncetm.this.AV17EmprNom = GXv_char3[0] ;
         rncetm.this.AV9Usurcod = GXv_char4[0] ;
         GXv_char4[0] = AV20ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOTREC", ""), GXv_char4) ;
         rncetm.this.AV20ContDsc = GXv_char4[0] ;
         AV18i = (short)(1) ;
         GX_I = 1 ;
         while ( GX_I <= 10 )
         {
            AV19Tab_def[GX_I-1] = GXutil.space( (short)(30)) ;
            GX_I = (int)(GX_I+1) ;
         }
         /* Using cursor P07UJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV25HisreoTn)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5198Nr_codigo = P07UJ2_A5198Nr_codigo[0] ;
            A834TipDefDsc = P07UJ2_A834TipDefDsc[0] ;
            n834TipDefDsc = P07UJ2_n834TipDefDsc[0] ;
            A833TipDefCod = P07UJ2_A833TipDefCod[0] ;
            A834TipDefDsc = P07UJ2_A834TipDefDsc[0] ;
            n834TipDefDsc = P07UJ2_n834TipDefDsc[0] ;
            if ( AV18i > 10 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV19Tab_def[AV18i-1] = A834TipDefDsc ;
            AV18i = (short)(AV18i+1) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P07UJ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV25HisreoTn)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A833TipDefCod = P07UJ3_A833TipDefCod[0] ;
            A5085CodCausa = P07UJ3_A5085CodCausa[0] ;
            n5085CodCausa = P07UJ3_n5085CodCausa[0] ;
            A7000Rps_Cod = P07UJ3_A7000Rps_Cod[0] ;
            n7000Rps_Cod = P07UJ3_n7000Rps_Cod[0] ;
            A2297HisReoTn = P07UJ3_A2297HisReoTn[0] ;
            n2297HisReoTn = P07UJ3_n2297HisReoTn[0] ;
            A548HisEstReo = P07UJ3_A548HisEstReo[0] ;
            n548HisEstReo = P07UJ3_n548HisEstReo[0] ;
            A5356Hisoperar = P07UJ3_A5356Hisoperar[0] ;
            n5356Hisoperar = P07UJ3_n5356Hisoperar[0] ;
            A6669HisAdeObs = P07UJ3_A6669HisAdeObs[0] ;
            n6669HisAdeObs = P07UJ3_n6669HisAdeObs[0] ;
            A7001Rps_Dsc = P07UJ3_A7001Rps_Dsc[0] ;
            n7001Rps_Dsc = P07UJ3_n7001Rps_Dsc[0] ;
            A5694HisAdEAcCo = P07UJ3_A5694HisAdEAcCo[0] ;
            n5694HisAdEAcCo = P07UJ3_n5694HisAdEAcCo[0] ;
            A5695HisAdEAcCt = P07UJ3_A5695HisAdEAcCt[0] ;
            n5695HisAdEAcCt = P07UJ3_n5695HisAdEAcCt[0] ;
            A5662HisAcCo = P07UJ3_A5662HisAcCo[0] ;
            n5662HisAcCo = P07UJ3_n5662HisAcCo[0] ;
            A5693HisAcCot = P07UJ3_A5693HisAcCot[0] ;
            n5693HisAcCot = P07UJ3_n5693HisAcCot[0] ;
            A5086DscCausa = P07UJ3_A5086DscCausa[0] ;
            n5086DscCausa = P07UJ3_n5086DscCausa[0] ;
            A834TipDefDsc = P07UJ3_A834TipDefDsc[0] ;
            n834TipDefDsc = P07UJ3_n834TipDefDsc[0] ;
            A540HisBarKgm = P07UJ3_A540HisBarKgm[0] ;
            n540HisBarKgm = P07UJ3_n540HisBarKgm[0] ;
            A544HisCodPar = P07UJ3_A544HisCodPar[0] ;
            A545HisCodReo = P07UJ3_A545HisCodReo[0] ;
            A539HisBarCod = P07UJ3_A539HisBarCod[0] ;
            A2299HisReoDsc = P07UJ3_A2299HisReoDsc[0] ;
            n2299HisReoDsc = P07UJ3_n2299HisReoDsc[0] ;
            A542HisBarSer = P07UJ3_A542HisBarSer[0] ;
            n542HisBarSer = P07UJ3_n542HisBarSer[0] ;
            A279CliNom = P07UJ3_A279CliNom[0] ;
            A252CliCod = P07UJ3_A252CliCod[0] ;
            n252CliCod = P07UJ3_n252CliCod[0] ;
            A279CliNom = P07UJ3_A279CliNom[0] ;
            A834TipDefDsc = P07UJ3_A834TipDefDsc[0] ;
            n834TipDefDsc = P07UJ3_n834TipDefDsc[0] ;
            A5086DscCausa = P07UJ3_A5086DscCausa[0] ;
            n5086DscCausa = P07UJ3_n5086DscCausa[0] ;
            A7001Rps_Dsc = P07UJ3_A7001Rps_Dsc[0] ;
            n7001Rps_Dsc = P07UJ3_n7001Rps_Dsc[0] ;
            AV10BarCod = A539HisBarCod ;
            AV11BarCodreo = A545HisCodReo ;
            AV12BarCodPar = A544HisCodPar ;
            AV36OpeNom = "" ;
            /* Using cursor P07UJ4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n5356Hisoperar), Integer.valueOf(A5356Hisoperar)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A652OpeCod = P07UJ4_A652OpeCod[0] ;
               A653OpeNom = P07UJ4_A653OpeNom[0] ;
               n653OpeNom = P07UJ4_n653OpeNom[0] ;
               AV36OpeNom = A653OpeNom ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            AV25HisreoTn = A2297HisReoTn ;
            /* Execute user subroutine: 'NOTREC' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV30NR_RESPTEC == 2 )
            {
               AV31Resp = httpContext.getMessage( "EMPRESA", "") ;
            }
            if ( AV30NR_RESPTEC == 1 )
            {
               AV31Resp = httpContext.getMessage( "CLIENTE", "") ;
            }
            if ( GXutil.strcmp(AV32Nr_comerc, httpContext.getMessage( "S", "")) == 0 )
            {
               AV34Acc_com = httpContext.getMessage( "DEBITAR CLIENTE", "") ;
            }
            if ( GXutil.strcmp(AV32Nr_comerc, httpContext.getMessage( "N", "")) == 0 )
            {
               AV34Acc_com = httpContext.getMessage( "NAO DEBITAR CLIENTE", "") ;
            }
            if ( GXutil.strcmp(AV32Nr_comerc, httpContext.getMessage( "A", "")) == 0 )
            {
               AV34Acc_com = httpContext.getMessage( "A DECIDIR..", "") ;
            }
            AV35Com_com = A6669HisAdeObs ;
            AV37Rps_Dsc = A7001Rps_Dsc ;
            /* Execute user subroutine: 'BARCAD' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV42HisAdEAcCo = A5694HisAdEAcCo ;
            AV43HisAdEAcCt = A5695HisAdEAcCt ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV45AnalisisTec[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV41Nlin = (short)(GXutil.gxmlines( A5662HisAcCo, (short)(85))) ;
            AV18i = (short)(1) ;
            while ( AV18i <= AV41Nlin )
            {
               AV45AnalisisTec[AV18i-1] = GXutil.gxgetmli( A5662HisAcCo, AV18i, (short)(85)) ;
               AV18i = (short)(AV18i+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV23ObsTec[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV41Nlin = (short)(GXutil.gxmlines( A5694HisAdEAcCo, (short)(85))) ;
            AV18i = (short)(1) ;
            while ( AV18i <= AV41Nlin )
            {
               AV23ObsTec[AV18i-1] = GXutil.gxgetmli( A5694HisAdEAcCo, AV18i, (short)(85)) ;
               AV18i = (short)(AV18i+1) ;
            }
            AV41Nlin = (short)(GXutil.gxmlines( A5693HisAcCot, (short)(85))) ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV46AccionCorr[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV18i = (short)(1) ;
            while ( AV18i <= AV41Nlin )
            {
               AV46AccionCorr[AV18i-1] = GXutil.gxgetmli( A5693HisAcCot, AV18i, (short)(85)) ;
               AV18i = (short)(AV18i+1) ;
            }
            AV41Nlin = (short)(GXutil.gxmlines( A5695HisAdEAcCt, (short)(85))) ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV24ObsTra[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV18i = (short)(1) ;
            while ( AV18i <= AV41Nlin )
            {
               AV24ObsTra[AV18i-1] = GXutil.gxgetmli( A5695HisAdEAcCt, AV18i, (short)(85)) ;
               AV18i = (short)(AV18i+1) ;
            }
            AV41Nlin = (short)(GXutil.gxmlines( A6669HisAdeObs, (short)(57))) ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV44Obs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV18i = (short)(1) ;
            while ( AV18i <= AV41Nlin )
            {
               AV44Obs[AV18i-1] = GXutil.gxgetmli( A6669HisAdeObs, AV18i, (short)(57)) ;
               AV18i = (short)(AV18i+1) ;
            }
            h7UJ0( false, 776) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "2º Análise Técnica", ""), 22, Gx_line+0, 145, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(22, Gx_line+18, 760, Gx_line+774, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Analise Técnica:", ""), 31, Gx_line+56, 132, Gx_line+73, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ações de correção:", ""), 32, Gx_line+232, 151, Gx_line+249, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Defeito identificado:", ""), 31, Gx_line+22, 150, Gx_line+39, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A834TipDefDsc, "")), 158, Gx_line+22, 409, Gx_line+40, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(22, Gx_line+231, 760, Gx_line+231, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Causa:", ""), 31, Gx_line+39, 75, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5086DscCausa, "")), 159, Gx_line+39, 660, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45AnalisisTec[1-1], "")), 32, Gx_line+72, 741, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45AnalisisTec[2-1], "")), 32, Gx_line+86, 741, Gx_line+104, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45AnalisisTec[3-1], "")), 32, Gx_line+102, 741, Gx_line+120, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45AnalisisTec[4-1], "")), 32, Gx_line+118, 741, Gx_line+136, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45AnalisisTec[5-1], "")), 32, Gx_line+133, 741, Gx_line+151, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45AnalisisTec[6-1], "")), 32, Gx_line+149, 741, Gx_line+167, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45AnalisisTec[7-1], "")), 32, Gx_line+165, 741, Gx_line+183, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45AnalisisTec[8-1], "")), 32, Gx_line+180, 741, Gx_line+198, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45AnalisisTec[9-1], "")), 32, Gx_line+196, 741, Gx_line+214, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45AnalisisTec[10-1], "")), 32, Gx_line+211, 741, Gx_line+229, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[1-1], "")), 32, Gx_line+251, 741, Gx_line+269, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[2-1], "")), 32, Gx_line+266, 740, Gx_line+283, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[3-1], "")), 32, Gx_line+281, 740, Gx_line+298, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[4-1], "")), 32, Gx_line+297, 740, Gx_line+314, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[5-1], "")), 32, Gx_line+313, 740, Gx_line+330, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[6-1], "")), 32, Gx_line+328, 740, Gx_line+345, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[7-1], "")), 32, Gx_line+344, 740, Gx_line+361, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[8-1], "")), 32, Gx_line+359, 740, Gx_line+376, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[9-1], "")), 32, Gx_line+375, 740, Gx_line+392, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[10-1], "")), 32, Gx_line+391, 740, Gx_line+408, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ação corretiva:", ""), 32, Gx_line+413, 123, Gx_line+430, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(22, Gx_line+410, 760, Gx_line+410, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46AccionCorr[1-1], "")), 32, Gx_line+430, 740, Gx_line+447, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46AccionCorr[2-1], "")), 32, Gx_line+445, 740, Gx_line+462, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46AccionCorr[3-1], "")), 32, Gx_line+460, 740, Gx_line+477, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46AccionCorr[4-1], "")), 32, Gx_line+476, 740, Gx_line+493, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46AccionCorr[5-1], "")), 32, Gx_line+492, 740, Gx_line+509, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46AccionCorr[6-1], "")), 32, Gx_line+507, 740, Gx_line+524, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46AccionCorr[7-1], "")), 32, Gx_line+523, 740, Gx_line+540, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46AccionCorr[8-1], "")), 32, Gx_line+539, 740, Gx_line+556, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46AccionCorr[9-1], "")), 32, Gx_line+554, 740, Gx_line+571, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46AccionCorr[10-1], "")), 32, Gx_line+570, 740, Gx_line+587, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Avaliação de eficácia:", ""), 32, Gx_line+591, 163, Gx_line+608, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(22, Gx_line+589, 760, Gx_line+589, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[1-1], "")), 32, Gx_line+613, 740, Gx_line+630, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[2-1], "")), 32, Gx_line+627, 740, Gx_line+644, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[3-1], "")), 32, Gx_line+643, 740, Gx_line+660, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[4-1], "")), 32, Gx_line+658, 740, Gx_line+675, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[5-1], "")), 32, Gx_line+674, 740, Gx_line+691, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[6-1], "")), 32, Gx_line+690, 740, Gx_line+707, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[7-1], "")), 32, Gx_line+705, 740, Gx_line+722, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[8-1], "")), 32, Gx_line+721, 740, Gx_line+738, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[9-1], "")), 32, Gx_line+736, 740, Gx_line+753, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[10-1], "")), 32, Gx_line+752, 740, Gx_line+769, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+776) ;
            h7UJ0( false, 58) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 618, Gx_line+29, 660, Gx_line+46, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsável:", ""), 407, Gx_line+29, 507, Gx_line+46, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("___/___/___", 670, Gx_line+29, 745, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsabilidade :", ""), 31, Gx_line+5, 147, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Rps_Dsc, "")), 153, Gx_line+5, 487, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(519, Gx_line+45, 613, Gx_line+45, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36OpeNom, "")), 83, Gx_line+31, 334, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(25, Gx_line+27, 392, Gx_line+52, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(22, Gx_line+0, 760, Gx_line+55, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+58) ;
            h7UJ0( false, 179) ;
            getPrinter().GxDrawRect(22, Gx_line+20, 760, Gx_line+176, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "3º Decisão Comercial", ""), 22, Gx_line+0, 164, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 624, Gx_line+154, 666, Gx_line+171, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsável:", ""), 414, Gx_line+154, 514, Gx_line+171, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(520, Gx_line+170, 614, Gx_line+170, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("___/___/___", 676, Gx_line+154, 751, Gx_line+171, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Acc_com, "")), 34, Gx_line+25, 202, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observações:", ""), 34, Gx_line+44, 124, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Obs[1-1], "")), 31, Gx_line+67, 532, Gx_line+85, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Obs[2-1], "")), 31, Gx_line+82, 532, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Obs[3-1], "")), 31, Gx_line+98, 532, Gx_line+116, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Obs[4-1], "")), 31, Gx_line+114, 532, Gx_line+132, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Obs[5-1], "")), 31, Gx_line+129, 532, Gx_line+147, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+179) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7UJ0( true, 0) ;
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
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV13BarDisNum = GXutil.space( (short)(8)) ;
      AV14BarNomCli = GXutil.space( (short)(13)) ;
      AV15BarNumCli = 0 ;
      AV21AlbRecCod = 0 ;
      AV22Nr_codigo = 0 ;
      /* Using cursor P07UJ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodreo), AV12BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P07UJ5_A130BarCodPar[0] ;
         A132BarCodReo = P07UJ5_A132BarCodReo[0] ;
         A129BarCod = P07UJ5_A129BarCod[0] ;
         A143BarDisNum = P07UJ5_A143BarDisNum[0] ;
         A4812BarEncCli = P07UJ5_A4812BarEncCli[0] ;
         A1234BarNomCli = P07UJ5_A1234BarNomCli[0] ;
         A1235BarNumCli = P07UJ5_A1235BarNumCli[0] ;
         AV13BarDisNum = A143BarDisNum ;
         if ( GXutil.strcmp(A4812BarEncCli, " ") != 0 )
         {
            AV13BarDisNum = A4812BarEncCli ;
         }
         AV14BarNomCli = A1234BarNomCli ;
         AV15BarNumCli = A1235BarNumCli ;
         /* Using cursor P07UJ6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A44AlbRecCod = P07UJ6_A44AlbRecCod[0] ;
            A200BarPieCod = P07UJ6_A200BarPieCod[0] ;
            AV21AlbRecCod = A44AlbRecCod ;
            /* Using cursor P07UJ7 */
            pr_default.execute(5, new Object[] {Integer.valueOf(AV21AlbRecCod), A396EmprCod});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A5206Nr_albrecc = P07UJ7_A5206Nr_albrecc[0] ;
               n5206Nr_albrecc = P07UJ7_n5206Nr_albrecc[0] ;
               A5198Nr_codigo = P07UJ7_A5198Nr_codigo[0] ;
               AV22Nr_codigo = A5198Nr_codigo ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'NOTREC' Routine */
      returnInSub = false ;
      AV26NR_BARCODA = 0 ;
      AV27NR_BARREOA = (byte)(0) ;
      AV28NR_BARPARA = "" ;
      AV29Nr_obsrt = "" ;
      AV30NR_RESPTEC = (byte)(0) ;
      AV32Nr_comerc = "" ;
      AV33Nr_obscom = "" ;
      /* Using cursor P07UJ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV25HisreoTn)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A5631Nr_ObsRT = P07UJ8_A5631Nr_ObsRT[0] ;
         n5631Nr_ObsRT = P07UJ8_n5631Nr_ObsRT[0] ;
         A5198Nr_codigo = P07UJ8_A5198Nr_codigo[0] ;
         A5222Nr_barcoda = P07UJ8_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P07UJ8_n5222Nr_barcoda[0] ;
         A5223Nr_barreoa = P07UJ8_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P07UJ8_n5223Nr_barreoa[0] ;
         A5224Nr_barpara = P07UJ8_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P07UJ8_n5224Nr_barpara[0] ;
         A5630Nr_RespTec = P07UJ8_A5630Nr_RespTec[0] ;
         n5630Nr_RespTec = P07UJ8_n5630Nr_RespTec[0] ;
         A5628Nr_comerc = P07UJ8_A5628Nr_comerc[0] ;
         n5628Nr_comerc = P07UJ8_n5628Nr_comerc[0] ;
         A8627Nr_obscm2 = P07UJ8_A8627Nr_obscm2[0] ;
         n8627Nr_obscm2 = P07UJ8_n8627Nr_obscm2[0] ;
         AV26NR_BARCODA = A5222Nr_barcoda ;
         AV27NR_BARREOA = A5223Nr_barreoa ;
         AV28NR_BARPARA = A5224Nr_barpara ;
         AV29Nr_obsrt = A5631Nr_ObsRT ;
         AV30NR_RESPTEC = A5630Nr_RespTec ;
         AV32Nr_comerc = A5628Nr_comerc ;
         AV33Nr_obscom = A8627Nr_obscm2 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void h7UJ0( boolean bFoot ,
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
               getPrinter().GxDrawLine(22, Gx_line+0, 760, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PROCESSADO POR COMPUTADOR", ""), 596, Gx_line+3, 760, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20ContDsc, "")), 22, Gx_line+3, 106, Gx_line+16, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
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
            if ( GxHdr3 )
            {
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FICHA DE RECLAMAÇAO Nº.", ""), 466, Gx_line+20, 651, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2297HisReoTn), "ZZZZZ9")), 663, Gx_line+20, 714, Gx_line+38, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 535, Gx_line+92, 593, Gx_line+109, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 603, Gx_line+93, 642, Gx_line+109, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 648, Gx_line+92, 665, Gx_line+109, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 671, Gx_line+93, 720, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6d8c33f9-a316-47de-93f5-8728221ee1f5", "", context.getHttpContext().getTheme( )), 22, Gx_line+4, 285, Gx_line+113) ;
               getPrinter().GxDrawRect(298, Gx_line+4, 759, Gx_line+113, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Impressao:", ""), 304, Gx_line+93, 371, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Usurcod, "@!")), 377, Gx_line+92, 444, Gx_line+109, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 451, Gx_line+92, 518, Gx_line+109, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+119) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Composição da Malha / Artigo", ""), 30, Gx_line+24, 263, Gx_line+41, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+46, 88, Gx_line+63, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço", ""), 30, Gx_line+68, 130, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Guia Cliente", ""), 276, Gx_line+68, 359, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor Cliente", ""), 450, Gx_line+46, 542, Gx_line+63, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quantidade (Kg)", ""), 545, Gx_line+68, 653, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 98, Gx_line+46, 149, Gx_line+64, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 152, Gx_line+46, 403, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A542HisBarSer, "")), 274, Gx_line+24, 408, Gx_line+42, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2299HisReoDsc, "")), 423, Gx_line+24, 641, Gx_line+42, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A539HisBarCod), "ZZZZZZZ9")), 139, Gx_line+68, 207, Gx_line+86, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A545HisCodReo), "9")), 220, Gx_line+68, 229, Gx_line+86, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A544HisCodPar, "")), 233, Gx_line+68, 242, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13BarDisNum, "")), 371, Gx_line+68, 539, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A540HisBarKgm, "ZZZZZ9.99")), 667, Gx_line+68, 743, Gx_line+86, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14BarNomCli, "")), 558, Gx_line+46, 667, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarNumCli), "ZZZZZ9")), 680, Gx_line+46, 731, Gx_line+64, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(22, Gx_line+20, 760, Gx_line+196, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "1º Identificação do Reclamação", ""), 22, Gx_line+0, 232, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lote Nº", ""), 617, Gx_line+91, 666, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21AlbRecCod), "ZZZZZZZ9")), 676, Gx_line+91, 744, Gx_line+109, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Defeito apontado pelo cliente:", ""), 31, Gx_line+117, 232, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_def[1-1], "")), 250, Gx_line+119, 501, Gx_line+137, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_def[2-1], "")), 250, Gx_line+134, 501, Gx_line+152, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_def[3-1], "")), 250, Gx_line+150, 501, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço Anterior", ""), 30, Gx_line+91, 187, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26NR_BARCODA), "ZZZZZZZ9")), 193, Gx_line+91, 261, Gx_line+109, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28NR_BARPARA, "")), 282, Gx_line+91, 291, Gx_line+109, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27NR_BARREOA), "9")), 266, Gx_line+91, 275, Gx_line+109, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 625, Gx_line+174, 667, Gx_line+191, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Responsável:", ""), 415, Gx_line+174, 515, Gx_line+191, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(526, Gx_line+190, 620, Gx_line+190, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText("___/___/___", 677, Gx_line+174, 752, Gx_line+191, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+198) ;
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
      this.aP0[0] = rncetm.this.A396EmprCod;
      this.aP1[0] = rncetm.this.AV38Hisbarcod;
      this.aP2[0] = rncetm.this.AV39Hiscodreo;
      this.aP3[0] = rncetm.this.AV40Hiscodpar;
      this.aP4[0] = rncetm.this.AV25HisreoTn;
      this.aP5[0] = rncetm.this.Gx_out;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV17EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV9Usurcod = "" ;
      AV20ContDsc = "" ;
      GXv_char4 = new String[1] ;
      AV19Tab_def = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV19Tab_def[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P07UJ2_A396EmprCod = new String[] {""} ;
      P07UJ2_A5198Nr_codigo = new int[1] ;
      P07UJ2_A834TipDefDsc = new String[] {""} ;
      P07UJ2_n834TipDefDsc = new boolean[] {false} ;
      P07UJ2_A833TipDefCod = new short[1] ;
      A834TipDefDsc = "" ;
      P07UJ3_A833TipDefCod = new short[1] ;
      P07UJ3_A5085CodCausa = new short[1] ;
      P07UJ3_n5085CodCausa = new boolean[] {false} ;
      P07UJ3_A7000Rps_Cod = new short[1] ;
      P07UJ3_n7000Rps_Cod = new boolean[] {false} ;
      P07UJ3_A396EmprCod = new String[] {""} ;
      P07UJ3_A2297HisReoTn = new int[1] ;
      P07UJ3_n2297HisReoTn = new boolean[] {false} ;
      P07UJ3_A548HisEstReo = new byte[1] ;
      P07UJ3_n548HisEstReo = new boolean[] {false} ;
      P07UJ3_A5356Hisoperar = new int[1] ;
      P07UJ3_n5356Hisoperar = new boolean[] {false} ;
      P07UJ3_A6669HisAdeObs = new String[] {""} ;
      P07UJ3_n6669HisAdeObs = new boolean[] {false} ;
      P07UJ3_A7001Rps_Dsc = new String[] {""} ;
      P07UJ3_n7001Rps_Dsc = new boolean[] {false} ;
      P07UJ3_A5694HisAdEAcCo = new String[] {""} ;
      P07UJ3_n5694HisAdEAcCo = new boolean[] {false} ;
      P07UJ3_A5695HisAdEAcCt = new String[] {""} ;
      P07UJ3_n5695HisAdEAcCt = new boolean[] {false} ;
      P07UJ3_A5662HisAcCo = new String[] {""} ;
      P07UJ3_n5662HisAcCo = new boolean[] {false} ;
      P07UJ3_A5693HisAcCot = new String[] {""} ;
      P07UJ3_n5693HisAcCot = new boolean[] {false} ;
      P07UJ3_A5086DscCausa = new String[] {""} ;
      P07UJ3_n5086DscCausa = new boolean[] {false} ;
      P07UJ3_A834TipDefDsc = new String[] {""} ;
      P07UJ3_n834TipDefDsc = new boolean[] {false} ;
      P07UJ3_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07UJ3_n540HisBarKgm = new boolean[] {false} ;
      P07UJ3_A544HisCodPar = new String[] {""} ;
      P07UJ3_A545HisCodReo = new byte[1] ;
      P07UJ3_A539HisBarCod = new int[1] ;
      P07UJ3_A2299HisReoDsc = new String[] {""} ;
      P07UJ3_n2299HisReoDsc = new boolean[] {false} ;
      P07UJ3_A542HisBarSer = new String[] {""} ;
      P07UJ3_n542HisBarSer = new boolean[] {false} ;
      P07UJ3_A279CliNom = new String[] {""} ;
      P07UJ3_A252CliCod = new int[1] ;
      P07UJ3_n252CliCod = new boolean[] {false} ;
      A6669HisAdeObs = "" ;
      A7001Rps_Dsc = "" ;
      A5694HisAdEAcCo = "" ;
      A5695HisAdEAcCt = "" ;
      A5662HisAcCo = "" ;
      A5693HisAcCot = "" ;
      A5086DscCausa = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A544HisCodPar = "" ;
      A2299HisReoDsc = "" ;
      A542HisBarSer = "" ;
      A279CliNom = "" ;
      AV12BarCodPar = "" ;
      AV36OpeNom = "" ;
      P07UJ4_A396EmprCod = new String[] {""} ;
      P07UJ4_A652OpeCod = new int[1] ;
      P07UJ4_A653OpeNom = new String[] {""} ;
      P07UJ4_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      AV31Resp = "" ;
      AV32Nr_comerc = "" ;
      AV34Acc_com = "" ;
      AV35Com_com = "" ;
      AV37Rps_Dsc = "" ;
      AV42HisAdEAcCo = "" ;
      AV43HisAdEAcCt = "" ;
      AV45AnalisisTec = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV45AnalisisTec[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV23ObsTec = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV23ObsTec[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV46AccionCorr = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV46AccionCorr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV24ObsTra = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV24ObsTra[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV44Obs = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV44Obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV13BarDisNum = "" ;
      AV14BarNomCli = "" ;
      P07UJ5_A396EmprCod = new String[] {""} ;
      P07UJ5_A130BarCodPar = new String[] {""} ;
      P07UJ5_A132BarCodReo = new byte[1] ;
      P07UJ5_A129BarCod = new int[1] ;
      P07UJ5_A143BarDisNum = new String[] {""} ;
      P07UJ5_A4812BarEncCli = new String[] {""} ;
      P07UJ5_A1234BarNomCli = new String[] {""} ;
      P07UJ5_A1235BarNumCli = new int[1] ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A1234BarNomCli = "" ;
      P07UJ6_A396EmprCod = new String[] {""} ;
      P07UJ6_A129BarCod = new int[1] ;
      P07UJ6_A132BarCodReo = new byte[1] ;
      P07UJ6_A130BarCodPar = new String[] {""} ;
      P07UJ6_A44AlbRecCod = new int[1] ;
      P07UJ6_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      P07UJ7_A396EmprCod = new String[] {""} ;
      P07UJ7_A5206Nr_albrecc = new int[1] ;
      P07UJ7_n5206Nr_albrecc = new boolean[] {false} ;
      P07UJ7_A5198Nr_codigo = new int[1] ;
      AV28NR_BARPARA = "" ;
      AV29Nr_obsrt = "" ;
      AV33Nr_obscom = "" ;
      P07UJ8_A5631Nr_ObsRT = new String[] {""} ;
      P07UJ8_n5631Nr_ObsRT = new boolean[] {false} ;
      P07UJ8_A396EmprCod = new String[] {""} ;
      P07UJ8_A5198Nr_codigo = new int[1] ;
      P07UJ8_A5222Nr_barcoda = new int[1] ;
      P07UJ8_n5222Nr_barcoda = new boolean[] {false} ;
      P07UJ8_A5223Nr_barreoa = new byte[1] ;
      P07UJ8_n5223Nr_barreoa = new boolean[] {false} ;
      P07UJ8_A5224Nr_barpara = new String[] {""} ;
      P07UJ8_n5224Nr_barpara = new boolean[] {false} ;
      P07UJ8_A5630Nr_RespTec = new byte[1] ;
      P07UJ8_n5630Nr_RespTec = new boolean[] {false} ;
      P07UJ8_A5628Nr_comerc = new String[] {""} ;
      P07UJ8_n5628Nr_comerc = new boolean[] {false} ;
      P07UJ8_A8627Nr_obscm2 = new String[] {""} ;
      P07UJ8_n8627Nr_obscm2 = new boolean[] {false} ;
      A5631Nr_ObsRT = "" ;
      A5224Nr_barpara = "" ;
      A5628Nr_comerc = "" ;
      A8627Nr_obscm2 = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rncetm__default(),
         new Object[] {
             new Object[] {
            P07UJ2_A396EmprCod, P07UJ2_A5198Nr_codigo, P07UJ2_A834TipDefDsc, P07UJ2_n834TipDefDsc, P07UJ2_A833TipDefCod
            }
            , new Object[] {
            P07UJ3_A833TipDefCod, P07UJ3_A5085CodCausa, P07UJ3_n5085CodCausa, P07UJ3_A7000Rps_Cod, P07UJ3_n7000Rps_Cod, P07UJ3_A396EmprCod, P07UJ3_A2297HisReoTn, P07UJ3_n2297HisReoTn, P07UJ3_A548HisEstReo, P07UJ3_n548HisEstReo,
            P07UJ3_A5356Hisoperar, P07UJ3_n5356Hisoperar, P07UJ3_A6669HisAdeObs, P07UJ3_n6669HisAdeObs, P07UJ3_A7001Rps_Dsc, P07UJ3_n7001Rps_Dsc, P07UJ3_A5694HisAdEAcCo, P07UJ3_n5694HisAdEAcCo, P07UJ3_A5695HisAdEAcCt, P07UJ3_n5695HisAdEAcCt,
            P07UJ3_A5662HisAcCo, P07UJ3_n5662HisAcCo, P07UJ3_A5693HisAcCot, P07UJ3_n5693HisAcCot, P07UJ3_A5086DscCausa, P07UJ3_n5086DscCausa, P07UJ3_A834TipDefDsc, P07UJ3_n834TipDefDsc, P07UJ3_A540HisBarKgm, P07UJ3_n540HisBarKgm,
            P07UJ3_A544HisCodPar, P07UJ3_A545HisCodReo, P07UJ3_A539HisBarCod, P07UJ3_A2299HisReoDsc, P07UJ3_n2299HisReoDsc, P07UJ3_A542HisBarSer, P07UJ3_n542HisBarSer, P07UJ3_A279CliNom, P07UJ3_A252CliCod, P07UJ3_n252CliCod
            }
            , new Object[] {
            P07UJ4_A396EmprCod, P07UJ4_A652OpeCod, P07UJ4_A653OpeNom, P07UJ4_n653OpeNom
            }
            , new Object[] {
            P07UJ5_A396EmprCod, P07UJ5_A130BarCodPar, P07UJ5_A132BarCodReo, P07UJ5_A129BarCod, P07UJ5_A143BarDisNum, P07UJ5_A4812BarEncCli, P07UJ5_A1234BarNomCli, P07UJ5_A1235BarNumCli
            }
            , new Object[] {
            P07UJ6_A396EmprCod, P07UJ6_A129BarCod, P07UJ6_A132BarCodReo, P07UJ6_A130BarCodPar, P07UJ6_A44AlbRecCod, P07UJ6_A200BarPieCod
            }
            , new Object[] {
            P07UJ7_A396EmprCod, P07UJ7_A5206Nr_albrecc, P07UJ7_n5206Nr_albrecc, P07UJ7_A5198Nr_codigo
            }
            , new Object[] {
            P07UJ8_A5631Nr_ObsRT, P07UJ8_n5631Nr_ObsRT, P07UJ8_A396EmprCod, P07UJ8_A5198Nr_codigo, P07UJ8_A5222Nr_barcoda, P07UJ8_n5222Nr_barcoda, P07UJ8_A5223Nr_barreoa, P07UJ8_n5223Nr_barreoa, P07UJ8_A5224Nr_barpara, P07UJ8_n5224Nr_barpara,
            P07UJ8_A5630Nr_RespTec, P07UJ8_n5630Nr_RespTec, P07UJ8_A5628Nr_comerc, P07UJ8_n5628Nr_comerc, P07UJ8_A8627Nr_obscm2, P07UJ8_n8627Nr_obscm2
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV39Hiscodreo ;
   private byte A548HisEstReo ;
   private byte A545HisCodReo ;
   private byte AV11BarCodreo ;
   private byte AV30NR_RESPTEC ;
   private byte A132BarCodReo ;
   private byte AV27NR_BARREOA ;
   private byte A5223Nr_barreoa ;
   private byte A5630Nr_RespTec ;
   private short AV18i ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A7000Rps_Cod ;
   private short AV41Nlin ;
   private short Gx_err ;
   private int AV38Hisbarcod ;
   private int AV25HisreoTn ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GX_I ;
   private int A5198Nr_codigo ;
   private int A2297HisReoTn ;
   private int A5356Hisoperar ;
   private int A539HisBarCod ;
   private int A252CliCod ;
   private int AV10BarCod ;
   private int A652OpeCod ;
   private int Gx_OldLine ;
   private int AV15BarNumCli ;
   private int AV21AlbRecCod ;
   private int AV22Nr_codigo ;
   private int A129BarCod ;
   private int A1235BarNumCli ;
   private int A44AlbRecCod ;
   private int A5206Nr_albrecc ;
   private int AV26NR_BARCODA ;
   private int A5222Nr_barcoda ;
   private java.math.BigDecimal A540HisBarKgm ;
   private String A396EmprCod ;
   private String AV40Hiscodpar ;
   private String Gx_out ;
   private String AV16Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV17EmprNom ;
   private String GXv_char3[] ;
   private String AV9Usurcod ;
   private String AV20ContDsc ;
   private String GXv_char4[] ;
   private String AV19Tab_def[] ;
   private String scmdbuf ;
   private String A834TipDefDsc ;
   private String A7001Rps_Dsc ;
   private String A5086DscCausa ;
   private String A544HisCodPar ;
   private String A2299HisReoDsc ;
   private String A542HisBarSer ;
   private String A279CliNom ;
   private String AV12BarCodPar ;
   private String AV36OpeNom ;
   private String A653OpeNom ;
   private String AV31Resp ;
   private String AV32Nr_comerc ;
   private String AV34Acc_com ;
   private String AV37Rps_Dsc ;
   private String AV45AnalisisTec[] ;
   private String AV23ObsTec[] ;
   private String AV46AccionCorr[] ;
   private String AV24ObsTra[] ;
   private String AV44Obs[] ;
   private String AV13BarDisNum ;
   private String AV14BarNomCli ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A1234BarNomCli ;
   private String A200BarPieCod ;
   private String AV28NR_BARPARA ;
   private String A5224Nr_barpara ;
   private String A5628Nr_comerc ;
   private java.util.Date Gx_date ;
   private boolean n834TipDefDsc ;
   private boolean GxHdr3 ;
   private boolean n5085CodCausa ;
   private boolean n7000Rps_Cod ;
   private boolean n2297HisReoTn ;
   private boolean n548HisEstReo ;
   private boolean n5356Hisoperar ;
   private boolean n6669HisAdeObs ;
   private boolean n7001Rps_Dsc ;
   private boolean n5694HisAdEAcCo ;
   private boolean n5695HisAdEAcCt ;
   private boolean n5662HisAcCo ;
   private boolean n5693HisAcCot ;
   private boolean n5086DscCausa ;
   private boolean n540HisBarKgm ;
   private boolean n2299HisReoDsc ;
   private boolean n542HisBarSer ;
   private boolean n252CliCod ;
   private boolean n653OpeNom ;
   private boolean returnInSub ;
   private boolean n5206Nr_albrecc ;
   private boolean n5631Nr_ObsRT ;
   private boolean n5222Nr_barcoda ;
   private boolean n5223Nr_barreoa ;
   private boolean n5224Nr_barpara ;
   private boolean n5630Nr_RespTec ;
   private boolean n5628Nr_comerc ;
   private boolean n8627Nr_obscm2 ;
   private String AV29Nr_obsrt ;
   private String A5631Nr_ObsRT ;
   private String A6669HisAdeObs ;
   private String A5694HisAdEAcCo ;
   private String A5695HisAdEAcCt ;
   private String A5662HisAcCo ;
   private String A5693HisAcCot ;
   private String AV35Com_com ;
   private String AV42HisAdEAcCo ;
   private String AV43HisAdEAcCt ;
   private String AV33Nr_obscom ;
   private String A8627Nr_obscm2 ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P07UJ2_A396EmprCod ;
   private int[] P07UJ2_A5198Nr_codigo ;
   private String[] P07UJ2_A834TipDefDsc ;
   private boolean[] P07UJ2_n834TipDefDsc ;
   private short[] P07UJ2_A833TipDefCod ;
   private short[] P07UJ3_A833TipDefCod ;
   private short[] P07UJ3_A5085CodCausa ;
   private boolean[] P07UJ3_n5085CodCausa ;
   private short[] P07UJ3_A7000Rps_Cod ;
   private boolean[] P07UJ3_n7000Rps_Cod ;
   private String[] P07UJ3_A396EmprCod ;
   private int[] P07UJ3_A2297HisReoTn ;
   private boolean[] P07UJ3_n2297HisReoTn ;
   private byte[] P07UJ3_A548HisEstReo ;
   private boolean[] P07UJ3_n548HisEstReo ;
   private int[] P07UJ3_A5356Hisoperar ;
   private boolean[] P07UJ3_n5356Hisoperar ;
   private String[] P07UJ3_A6669HisAdeObs ;
   private boolean[] P07UJ3_n6669HisAdeObs ;
   private String[] P07UJ3_A7001Rps_Dsc ;
   private boolean[] P07UJ3_n7001Rps_Dsc ;
   private String[] P07UJ3_A5694HisAdEAcCo ;
   private boolean[] P07UJ3_n5694HisAdEAcCo ;
   private String[] P07UJ3_A5695HisAdEAcCt ;
   private boolean[] P07UJ3_n5695HisAdEAcCt ;
   private String[] P07UJ3_A5662HisAcCo ;
   private boolean[] P07UJ3_n5662HisAcCo ;
   private String[] P07UJ3_A5693HisAcCot ;
   private boolean[] P07UJ3_n5693HisAcCot ;
   private String[] P07UJ3_A5086DscCausa ;
   private boolean[] P07UJ3_n5086DscCausa ;
   private String[] P07UJ3_A834TipDefDsc ;
   private boolean[] P07UJ3_n834TipDefDsc ;
   private java.math.BigDecimal[] P07UJ3_A540HisBarKgm ;
   private boolean[] P07UJ3_n540HisBarKgm ;
   private String[] P07UJ3_A544HisCodPar ;
   private byte[] P07UJ3_A545HisCodReo ;
   private int[] P07UJ3_A539HisBarCod ;
   private String[] P07UJ3_A2299HisReoDsc ;
   private boolean[] P07UJ3_n2299HisReoDsc ;
   private String[] P07UJ3_A542HisBarSer ;
   private boolean[] P07UJ3_n542HisBarSer ;
   private String[] P07UJ3_A279CliNom ;
   private int[] P07UJ3_A252CliCod ;
   private boolean[] P07UJ3_n252CliCod ;
   private String[] P07UJ4_A396EmprCod ;
   private int[] P07UJ4_A652OpeCod ;
   private String[] P07UJ4_A653OpeNom ;
   private boolean[] P07UJ4_n653OpeNom ;
   private String[] P07UJ5_A396EmprCod ;
   private String[] P07UJ5_A130BarCodPar ;
   private byte[] P07UJ5_A132BarCodReo ;
   private int[] P07UJ5_A129BarCod ;
   private String[] P07UJ5_A143BarDisNum ;
   private String[] P07UJ5_A4812BarEncCli ;
   private String[] P07UJ5_A1234BarNomCli ;
   private int[] P07UJ5_A1235BarNumCli ;
   private String[] P07UJ6_A396EmprCod ;
   private int[] P07UJ6_A129BarCod ;
   private byte[] P07UJ6_A132BarCodReo ;
   private String[] P07UJ6_A130BarCodPar ;
   private int[] P07UJ6_A44AlbRecCod ;
   private String[] P07UJ6_A200BarPieCod ;
   private String[] P07UJ7_A396EmprCod ;
   private int[] P07UJ7_A5206Nr_albrecc ;
   private boolean[] P07UJ7_n5206Nr_albrecc ;
   private int[] P07UJ7_A5198Nr_codigo ;
   private String[] P07UJ8_A5631Nr_ObsRT ;
   private boolean[] P07UJ8_n5631Nr_ObsRT ;
   private String[] P07UJ8_A396EmprCod ;
   private int[] P07UJ8_A5198Nr_codigo ;
   private int[] P07UJ8_A5222Nr_barcoda ;
   private boolean[] P07UJ8_n5222Nr_barcoda ;
   private byte[] P07UJ8_A5223Nr_barreoa ;
   private boolean[] P07UJ8_n5223Nr_barreoa ;
   private String[] P07UJ8_A5224Nr_barpara ;
   private boolean[] P07UJ8_n5224Nr_barpara ;
   private byte[] P07UJ8_A5630Nr_RespTec ;
   private boolean[] P07UJ8_n5630Nr_RespTec ;
   private String[] P07UJ8_A5628Nr_comerc ;
   private boolean[] P07UJ8_n5628Nr_comerc ;
   private String[] P07UJ8_A8627Nr_obscm2 ;
   private boolean[] P07UJ8_n8627Nr_obscm2 ;
}

final  class rncetm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07UJ2", "SELECT T1.EmprCod, T1.Nr_codigo, T2.TipDefDsc, T1.TipDefCod FROM (TXPNOTRE1 T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.Nr_codigo = ? ORDER BY T1.EmprCod, T1.Nr_codigo, T1.TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07UJ3", "SELECT T1.TipDefCod, T1.CodCausa, T1.Rps_Cod, T1.EmprCod, T1.HisReoTn, T1.HisEstReo, T1.Hisoperar, T1.HisAdeObs, T5.Rps_Dsc, T1.HisAdEAcCo, T1.HisAdEAcCt, T1.HisAcCo, T1.HisAcCot, T4.DscCausa, T3.TipDefDsc, T1.HisBarKgm, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod, T1.HisReoDsc, T1.HisBarSer, T2.CliNom, T1.CliCod FROM ((((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPDEF T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T4 ON T4.EmprCod = T1.EmprCod AND T4.CodCausa = T1.CodCausa) LEFT JOIN TXPCODRPS T5 ON T5.EmprCod = T1.EmprCod AND T5.Rps_Cod = T1.Rps_Cod) WHERE (T1.EmprCod = ? and T1.HisReoTn = ?) AND (T1.HisEstReo = 2) ORDER BY T1.EmprCod, T1.HisReoTn ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07UJ4", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07UJ5", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarDisNum, BarEncCli, BarNomCli, BarNumCli FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07UJ6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07UJ7", "SELECT EmprCod, Nr_albrecc, Nr_codigo FROM TXPNOTREC WHERE (Nr_albrecc = ?) AND (EmprCod = ?) ORDER BY Nr_albrecc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07UJ8", "SELECT Nr_ObsRT, EmprCod, Nr_codigo, Nr_barcoda, Nr_barreoa, Nr_barpara, Nr_RespTec, Nr_comerc, Nr_obscm2 FROM TXPNOTREC WHERE EmprCod = ? and Nr_codigo = ? ORDER BY EmprCod, Nr_codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 60);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 1);
               ((byte[]) buf[31])[0] = rslt.getByte(18);
               ((int[]) buf[32])[0] = rslt.getInt(19);
               ((String[]) buf[33])[0] = rslt.getString(20, 26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(21, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(22, 30);
               ((int[]) buf[38])[0] = rslt.getInt(23);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

