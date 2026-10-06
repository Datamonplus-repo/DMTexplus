package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rnce000 extends GXReport
{
   public rnce000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rnce000.class ), "" );
   }

   public rnce000( int remoteHandle ,
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
      rnce000.this.aP5 = new String[] {""};
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
      rnce000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rnce000.this.AV38Hisbarcod = aP1[0];
      this.aP1 = aP1;
      rnce000.this.AV39Hiscodreo = aP2[0];
      this.aP2 = aP2;
      rnce000.this.AV40Hiscodpar = aP3[0];
      this.aP3 = aP3;
      rnce000.this.AV25HisreoTn = aP4[0];
      this.aP4 = aP4;
      rnce000.this.Gx_out = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 3 ;
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
         getPrinter().GxSetDocName("NOTA NO CONFORMIDAD,EXT") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*3)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV16Station ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         rnce000.this.GXt_char1 = GXv_char2[0] ;
         AV16Station = GXt_char1 ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = AV17EmprNom ;
         GXv_char4[0] = AV9Usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
         rnce000.this.A396EmprCod = GXv_char2[0] ;
         rnce000.this.AV17EmprNom = GXv_char3[0] ;
         rnce000.this.AV9Usurcod = GXv_char4[0] ;
         GXv_char4[0] = AV20ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOTREC", ""), GXv_char4) ;
         rnce000.this.AV20ContDsc = GXv_char4[0] ;
         GXt_int5 = AV41etm ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM", ""), GXv_int6) ;
         rnce000.this.GXt_int5 = GXv_int6[0] ;
         AV41etm = GXt_int5 ;
         GXt_int5 = AV42brochado ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TONALI", ""), GXv_int6) ;
         rnce000.this.GXt_int5 = GXv_int6[0] ;
         AV42brochado = GXt_int5 ;
         /* Using cursor P06W82 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06W82_A407EmprNom[0] ;
            n407EmprNom = P06W82_n407EmprNom[0] ;
            AV17EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV18i = (short)(1) ;
         GX_I = 1 ;
         while ( GX_I <= 10 )
         {
            AV19Tab_def[GX_I-1] = GXutil.space( (short)(30)) ;
            GX_I = (int)(GX_I+1) ;
         }
         /* Using cursor P06W83 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV25HisreoTn)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5198Nr_codigo = P06W83_A5198Nr_codigo[0] ;
            A834TipDefDsc = P06W83_A834TipDefDsc[0] ;
            n834TipDefDsc = P06W83_n834TipDefDsc[0] ;
            A833TipDefCod = P06W83_A833TipDefCod[0] ;
            A834TipDefDsc = P06W83_A834TipDefDsc[0] ;
            n834TipDefDsc = P06W83_n834TipDefDsc[0] ;
            if ( AV18i > 10 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV19Tab_def[AV18i-1] = A834TipDefDsc ;
            AV18i = (short)(AV18i+1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P06W84 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV25HisreoTn)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A833TipDefCod = P06W84_A833TipDefCod[0] ;
            A5085CodCausa = P06W84_A5085CodCausa[0] ;
            n5085CodCausa = P06W84_n5085CodCausa[0] ;
            A7000Rps_Cod = P06W84_A7000Rps_Cod[0] ;
            n7000Rps_Cod = P06W84_n7000Rps_Cod[0] ;
            A2297HisReoTn = P06W84_A2297HisReoTn[0] ;
            n2297HisReoTn = P06W84_n2297HisReoTn[0] ;
            A548HisEstReo = P06W84_A548HisEstReo[0] ;
            n548HisEstReo = P06W84_n548HisEstReo[0] ;
            A5356Hisoperar = P06W84_A5356Hisoperar[0] ;
            n5356Hisoperar = P06W84_n5356Hisoperar[0] ;
            A539HisBarCod = P06W84_A539HisBarCod[0] ;
            A545HisCodReo = P06W84_A545HisCodReo[0] ;
            A544HisCodPar = P06W84_A544HisCodPar[0] ;
            A7001Rps_Dsc = P06W84_A7001Rps_Dsc[0] ;
            n7001Rps_Dsc = P06W84_n7001Rps_Dsc[0] ;
            A540HisBarKgm = P06W84_A540HisBarKgm[0] ;
            n540HisBarKgm = P06W84_n540HisBarKgm[0] ;
            A2299HisReoDsc = P06W84_A2299HisReoDsc[0] ;
            n2299HisReoDsc = P06W84_n2299HisReoDsc[0] ;
            A542HisBarSer = P06W84_A542HisBarSer[0] ;
            n542HisBarSer = P06W84_n542HisBarSer[0] ;
            A279CliNom = P06W84_A279CliNom[0] ;
            A252CliCod = P06W84_A252CliCod[0] ;
            n252CliCod = P06W84_n252CliCod[0] ;
            A5086DscCausa = P06W84_A5086DscCausa[0] ;
            n5086DscCausa = P06W84_n5086DscCausa[0] ;
            A834TipDefDsc = P06W84_A834TipDefDsc[0] ;
            n834TipDefDsc = P06W84_n834TipDefDsc[0] ;
            A279CliNom = P06W84_A279CliNom[0] ;
            A834TipDefDsc = P06W84_A834TipDefDsc[0] ;
            n834TipDefDsc = P06W84_n834TipDefDsc[0] ;
            A5086DscCausa = P06W84_A5086DscCausa[0] ;
            n5086DscCausa = P06W84_n5086DscCausa[0] ;
            A7001Rps_Dsc = P06W84_A7001Rps_Dsc[0] ;
            n7001Rps_Dsc = P06W84_n7001Rps_Dsc[0] ;
            AV10BarCod = A539HisBarCod ;
            AV11BarCodreo = A545HisCodReo ;
            AV12BarCodPar = A544HisCodPar ;
            AV36OpeNom = "" ;
            /* Using cursor P06W85 */
            pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n5356Hisoperar), Integer.valueOf(A5356Hisoperar)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A652OpeCod = P06W85_A652OpeCod[0] ;
               A653OpeNom = P06W85_A653OpeNom[0] ;
               n653OpeNom = P06W85_n653OpeNom[0] ;
               AV36OpeNom = A653OpeNom ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
            AV25HisreoTn = A2297HisReoTn ;
            /* Execute user subroutine: 'NOTREC' */
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
            if ( AV30NR_RESPTEC == 2 )
            {
               AV31Resp = ((AV41etm==0)&&(AV42brochado==0) ? httpContext.getMessage( "TINAMAR", "") : ((AV41etm==1) ? httpContext.getMessage( "ETM", "") : ((AV42brochado==1) ? httpContext.getMessage( "BROCHADO&CAMPOS", "") : ""))) ;
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
            AV35Com_com = AV33Nr_obscom ;
            AV37Rps_Dsc = A7001Rps_Dsc ;
            /* Execute user subroutine: 'BARCAD' */
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
            GX_I = 1 ;
            while ( GX_I <= 4 )
            {
               AV23ObsTec[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV18i = (short)(1) ;
            /* Using cursor P06W86 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV25HisreoTn)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A5198Nr_codigo = P06W86_A5198Nr_codigo[0] ;
               A5218Nr_obstec = P06W86_A5218Nr_obstec[0] ;
               n5218Nr_obstec = P06W86_n5218Nr_obstec[0] ;
               A5228Nr_linTec = P06W86_A5228Nr_linTec[0] ;
               if ( AV18i <= 4 )
               {
                  AV23ObsTec[AV18i-1] = A5218Nr_obstec ;
               }
               AV18i = (short)(AV18i+1) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            GX_I = 1 ;
            while ( GX_I <= 4 )
            {
               AV24ObsTra[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV18i = (short)(1) ;
            /* Using cursor P06W87 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV25HisreoTn)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A5198Nr_codigo = P06W87_A5198Nr_codigo[0] ;
               A5219Nr_obstra = P06W87_A5219Nr_obstra[0] ;
               n5219Nr_obstra = P06W87_n5219Nr_obstra[0] ;
               A5230Nr_linTre = P06W87_A5230Nr_linTre[0] ;
               if ( AV18i <= 4 )
               {
                  AV24ObsTra[AV18i-1] = A5219Nr_obstra ;
               }
               AV18i = (short)(AV18i+1) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            if ( AV41etm == 1 )
            {
               h6W80( false, 117) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FICHA DE RECLAMAÇAO Nº.", ""), 469, Gx_line+16, 654, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2297HisReoTn), "ZZZZZ9")), 666, Gx_line+16, 717, Gx_line+34, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 539, Gx_line+83, 597, Gx_line+100, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 606, Gx_line+85, 645, Gx_line+101, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 651, Gx_line+83, 668, Gx_line+100, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 674, Gx_line+85, 723, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "1e79aa33-5eb4-4367-83cb-a2766f034f72", "", context.getHttpContext().getTheme( )), 22, Gx_line+0, 285, Gx_line+109) ;
               getPrinter().GxDrawRect(301, Gx_line+0, 762, Gx_line+109, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Impressao:", ""), 307, Gx_line+85, 374, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Usurcod, "@!")), 380, Gx_line+83, 447, Gx_line+100, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 454, Gx_line+83, 521, Gx_line+100, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+117) ;
            }
            else
            {
               if ( AV42brochado == 1 )
               {
                  h6W80( false, 117) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "FICHA DE RECLAMAÇAO Nº.", ""), 472, Gx_line+16, 657, Gx_line+33, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2297HisReoTn), "ZZZZZ9")), 669, Gx_line+16, 720, Gx_line+34, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 542, Gx_line+83, 600, Gx_line+100, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 609, Gx_line+85, 648, Gx_line+101, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 654, Gx_line+83, 671, Gx_line+100, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 677, Gx_line+85, 726, Gx_line+100, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "f3c5c628-ed0a-4de0-b07a-9a9e4aad3dea", "", context.getHttpContext().getTheme( )), 25, Gx_line+0, 288, Gx_line+109) ;
                  getPrinter().GxDrawRect(304, Gx_line+0, 765, Gx_line+109, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Impressao:", ""), 310, Gx_line+85, 377, Gx_line+100, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Usurcod, "@!")), 383, Gx_line+83, 450, Gx_line+100, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 457, Gx_line+83, 524, Gx_line+100, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+117) ;
               }
               else
               {
                  h6W80( false, 119) ;
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
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6fa225cc-bb14-46c4-8fd0-56decb69faac", "", context.getHttpContext().getTheme( )), 22, Gx_line+4, 285, Gx_line+113) ;
                  getPrinter().GxDrawRect(298, Gx_line+4, 759, Gx_line+113, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Impressao:", ""), 304, Gx_line+93, 371, Gx_line+108, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Usurcod, "@!")), 377, Gx_line+92, 444, Gx_line+109, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 451, Gx_line+92, 518, Gx_line+109, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+119) ;
               }
            }
            h6W80( false, 240) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Composição da Malha / Artigo", ""), 30, Gx_line+33, 263, Gx_line+50, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+60, 88, Gx_line+77, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço", ""), 30, Gx_line+88, 130, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Guia Cliente", ""), 315, Gx_line+88, 398, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor Cliente", ""), 450, Gx_line+60, 542, Gx_line+77, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quantidade (Kg)", ""), 545, Gx_line+88, 653, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 98, Gx_line+60, 149, Gx_line+78, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 152, Gx_line+60, 403, Gx_line+78, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A542HisBarSer, "")), 274, Gx_line+33, 408, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2299HisReoDsc, "")), 423, Gx_line+33, 641, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A539HisBarCod), "ZZZZZZZ9")), 139, Gx_line+88, 207, Gx_line+106, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A545HisCodReo), "9")), 220, Gx_line+88, 229, Gx_line+106, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A544HisCodPar, "")), 233, Gx_line+88, 242, Gx_line+106, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13BarDisNum, "")), 409, Gx_line+88, 477, Gx_line+106, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A540HisBarKgm, "ZZZZZ9.99")), 667, Gx_line+88, 743, Gx_line+106, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14BarNomCli, "")), 558, Gx_line+60, 667, Gx_line+78, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarNumCli), "ZZZZZ9")), 680, Gx_line+60, 731, Gx_line+78, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(22, Gx_line+20, 760, Gx_line+238, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "1º Identificação do Reclamação", ""), 22, Gx_line+0, 232, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lote Nº ", ""), 618, Gx_line+114, 671, Gx_line+131, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21AlbRecCod), "ZZZZZZZ9")), 677, Gx_line+114, 745, Gx_line+132, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Defeito apontado pelo cliente:", ""), 30, Gx_line+143, 231, Gx_line+160, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_def[1-1], "")), 249, Gx_line+145, 500, Gx_line+163, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_def[2-1], "")), 249, Gx_line+166, 500, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_def[3-1], "")), 249, Gx_line+186, 500, Gx_line+204, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço Anterior", ""), 30, Gx_line+113, 187, Gx_line+130, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26NR_BARCODA), "ZZZZZZZ9")), 194, Gx_line+113, 262, Gx_line+131, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28NR_BARPARA, "")), 283, Gx_line+113, 292, Gx_line+131, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27NR_BARREOA), "9")), 267, Gx_line+113, 276, Gx_line+131, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 624, Gx_line+215, 666, Gx_line+232, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsável:", ""), 414, Gx_line+215, 514, Gx_line+232, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(525, Gx_line+230, 619, Gx_line+230, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("___/___/___", 676, Gx_line+215, 751, Gx_line+232, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+240) ;
            h6W80( false, 408) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "2º Análise Técnica", ""), 22, Gx_line+0, 145, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(22, Gx_line+18, 760, Gx_line+403, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Analise Técnica:", ""), 32, Gx_line+77, 133, Gx_line+94, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 624, Gx_line+380, 666, Gx_line+397, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsável:", ""), 414, Gx_line+380, 514, Gx_line+397, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("___/___/___", 676, Gx_line+380, 751, Gx_line+397, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Correcção/Acção Correctiva(Seguimento):", ""), 32, Gx_line+184, 285, Gx_line+201, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[1-1], "")), 32, Gx_line+99, 533, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[2-1], "")), 32, Gx_line+118, 533, Gx_line+136, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[3-1], "")), 32, Gx_line+136, 533, Gx_line+154, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[4-1], "")), 32, Gx_line+155, 533, Gx_line+173, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[1-1], "")), 32, Gx_line+203, 533, Gx_line+221, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[2-1], "")), 32, Gx_line+223, 533, Gx_line+241, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[3-1], "")), 32, Gx_line+243, 533, Gx_line+261, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[4-1], "")), 32, Gx_line+263, 533, Gx_line+281, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsabilidade :", ""), 31, Gx_line+288, 147, Gx_line+305, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Comentarios:", ""), 31, Gx_line+303, 120, Gx_line+320, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(AV29Nr_obsrt, 31, Gx_line+322, 744, Gx_line+375, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Rps_Dsc, "")), 153, Gx_line+288, 487, Gx_line+306, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Defeito identificado:", ""), 32, Gx_line+28, 151, Gx_line+45, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A834TipDefDsc, "")), 159, Gx_line+28, 410, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(22, Gx_line+183, 760, Gx_line+183, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(22, Gx_line+286, 760, Gx_line+286, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Causa:", ""), 32, Gx_line+49, 76, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5086DscCausa, "")), 159, Gx_line+49, 660, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(525, Gx_line+396, 619, Gx_line+396, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36OpeNom, "")), 90, Gx_line+382, 341, Gx_line+400, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(31, Gx_line+378, 398, Gx_line+403, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+408) ;
            h6W80( false, 210) ;
            getPrinter().GxDrawRect(22, Gx_line+20, 760, Gx_line+206, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "3º Decisão Comercial", ""), 22, Gx_line+0, 164, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 624, Gx_line+185, 666, Gx_line+202, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsável:", ""), 414, Gx_line+185, 514, Gx_line+202, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(520, Gx_line+201, 614, Gx_line+201, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("___/___/___", 676, Gx_line+185, 751, Gx_line+202, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Acc_com, "")), 34, Gx_line+25, 202, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Comentarios:", ""), 34, Gx_line+44, 123, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Com_com, "")), 34, Gx_line+61, 751, Gx_line+135, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+210) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6W80( true, 0) ;
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
      /* Using cursor P06W88 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodreo), AV12BarCodPar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A130BarCodPar = P06W88_A130BarCodPar[0] ;
         A132BarCodReo = P06W88_A132BarCodReo[0] ;
         A129BarCod = P06W88_A129BarCod[0] ;
         A143BarDisNum = P06W88_A143BarDisNum[0] ;
         A1234BarNomCli = P06W88_A1234BarNomCli[0] ;
         A1235BarNumCli = P06W88_A1235BarNumCli[0] ;
         AV13BarDisNum = A143BarDisNum ;
         AV14BarNomCli = A1234BarNomCli ;
         AV15BarNumCli = A1235BarNumCli ;
         /* Using cursor P06W89 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A44AlbRecCod = P06W89_A44AlbRecCod[0] ;
            A200BarPieCod = P06W89_A200BarPieCod[0] ;
            AV21AlbRecCod = A44AlbRecCod ;
            /* Using cursor P06W810 */
            pr_default.execute(8, new Object[] {Integer.valueOf(AV21AlbRecCod), A396EmprCod});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A5206Nr_albrecc = P06W810_A5206Nr_albrecc[0] ;
               n5206Nr_albrecc = P06W810_n5206Nr_albrecc[0] ;
               A5198Nr_codigo = P06W810_A5198Nr_codigo[0] ;
               AV22Nr_codigo = A5198Nr_codigo ;
               pr_default.readNext(8);
            }
            pr_default.close(8);
            pr_default.readNext(7);
         }
         pr_default.close(7);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
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
      /* Using cursor P06W811 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV25HisreoTn)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A5631Nr_ObsRT = P06W811_A5631Nr_ObsRT[0] ;
         n5631Nr_ObsRT = P06W811_n5631Nr_ObsRT[0] ;
         A5198Nr_codigo = P06W811_A5198Nr_codigo[0] ;
         A5222Nr_barcoda = P06W811_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P06W811_n5222Nr_barcoda[0] ;
         A5223Nr_barreoa = P06W811_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P06W811_n5223Nr_barreoa[0] ;
         A5224Nr_barpara = P06W811_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P06W811_n5224Nr_barpara[0] ;
         A5630Nr_RespTec = P06W811_A5630Nr_RespTec[0] ;
         n5630Nr_RespTec = P06W811_n5630Nr_RespTec[0] ;
         A5628Nr_comerc = P06W811_A5628Nr_comerc[0] ;
         n5628Nr_comerc = P06W811_n5628Nr_comerc[0] ;
         A8627Nr_obscm2 = P06W811_A8627Nr_obscm2[0] ;
         n8627Nr_obscm2 = P06W811_n8627Nr_obscm2[0] ;
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
      pr_default.close(9);
   }

   public void h6W80( boolean bFoot ,
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
               getPrinter().GxDrawLine(22, Gx_line+13, 760, Gx_line+13, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PROCESSADO POR COMPUTADOR", ""), 596, Gx_line+15, 760, Gx_line+29, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20ContDsc, "")), 23, Gx_line+15, 107, Gx_line+28, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+36) ;
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
      this.aP0[0] = rnce000.this.A396EmprCod;
      this.aP1[0] = rnce000.this.AV38Hisbarcod;
      this.aP2[0] = rnce000.this.AV39Hiscodreo;
      this.aP3[0] = rnce000.this.AV40Hiscodpar;
      this.aP4[0] = rnce000.this.AV25HisreoTn;
      this.aP5[0] = rnce000.this.Gx_out;
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
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P06W82_A396EmprCod = new String[] {""} ;
      P06W82_A407EmprNom = new String[] {""} ;
      P06W82_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV19Tab_def = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV19Tab_def[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P06W83_A396EmprCod = new String[] {""} ;
      P06W83_A5198Nr_codigo = new int[1] ;
      P06W83_A834TipDefDsc = new String[] {""} ;
      P06W83_n834TipDefDsc = new boolean[] {false} ;
      P06W83_A833TipDefCod = new short[1] ;
      A834TipDefDsc = "" ;
      P06W84_A833TipDefCod = new short[1] ;
      P06W84_A5085CodCausa = new short[1] ;
      P06W84_n5085CodCausa = new boolean[] {false} ;
      P06W84_A7000Rps_Cod = new short[1] ;
      P06W84_n7000Rps_Cod = new boolean[] {false} ;
      P06W84_A396EmprCod = new String[] {""} ;
      P06W84_A2297HisReoTn = new int[1] ;
      P06W84_n2297HisReoTn = new boolean[] {false} ;
      P06W84_A548HisEstReo = new byte[1] ;
      P06W84_n548HisEstReo = new boolean[] {false} ;
      P06W84_A5356Hisoperar = new int[1] ;
      P06W84_n5356Hisoperar = new boolean[] {false} ;
      P06W84_A539HisBarCod = new int[1] ;
      P06W84_A545HisCodReo = new byte[1] ;
      P06W84_A544HisCodPar = new String[] {""} ;
      P06W84_A7001Rps_Dsc = new String[] {""} ;
      P06W84_n7001Rps_Dsc = new boolean[] {false} ;
      P06W84_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06W84_n540HisBarKgm = new boolean[] {false} ;
      P06W84_A2299HisReoDsc = new String[] {""} ;
      P06W84_n2299HisReoDsc = new boolean[] {false} ;
      P06W84_A542HisBarSer = new String[] {""} ;
      P06W84_n542HisBarSer = new boolean[] {false} ;
      P06W84_A279CliNom = new String[] {""} ;
      P06W84_A252CliCod = new int[1] ;
      P06W84_n252CliCod = new boolean[] {false} ;
      P06W84_A5086DscCausa = new String[] {""} ;
      P06W84_n5086DscCausa = new boolean[] {false} ;
      P06W84_A834TipDefDsc = new String[] {""} ;
      P06W84_n834TipDefDsc = new boolean[] {false} ;
      A544HisCodPar = "" ;
      A7001Rps_Dsc = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A2299HisReoDsc = "" ;
      A542HisBarSer = "" ;
      A279CliNom = "" ;
      A5086DscCausa = "" ;
      AV12BarCodPar = "" ;
      AV36OpeNom = "" ;
      P06W85_A396EmprCod = new String[] {""} ;
      P06W85_A652OpeCod = new int[1] ;
      P06W85_A653OpeNom = new String[] {""} ;
      P06W85_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      AV31Resp = "" ;
      AV32Nr_comerc = "" ;
      AV34Acc_com = "" ;
      AV35Com_com = "" ;
      AV33Nr_obscom = "" ;
      AV37Rps_Dsc = "" ;
      AV23ObsTec = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV23ObsTec[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P06W86_A396EmprCod = new String[] {""} ;
      P06W86_A5198Nr_codigo = new int[1] ;
      P06W86_A5218Nr_obstec = new String[] {""} ;
      P06W86_n5218Nr_obstec = new boolean[] {false} ;
      P06W86_A5228Nr_linTec = new short[1] ;
      A5218Nr_obstec = "" ;
      AV24ObsTra = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV24ObsTra[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P06W87_A396EmprCod = new String[] {""} ;
      P06W87_A5198Nr_codigo = new int[1] ;
      P06W87_A5219Nr_obstra = new String[] {""} ;
      P06W87_n5219Nr_obstra = new boolean[] {false} ;
      P06W87_A5230Nr_linTre = new short[1] ;
      A5219Nr_obstra = "" ;
      Gx_date = GXutil.nullDate() ;
      AV13BarDisNum = "" ;
      AV14BarNomCli = "" ;
      AV28NR_BARPARA = "" ;
      AV29Nr_obsrt = "" ;
      P06W88_A396EmprCod = new String[] {""} ;
      P06W88_A130BarCodPar = new String[] {""} ;
      P06W88_A132BarCodReo = new byte[1] ;
      P06W88_A129BarCod = new int[1] ;
      P06W88_A143BarDisNum = new String[] {""} ;
      P06W88_A1234BarNomCli = new String[] {""} ;
      P06W88_A1235BarNumCli = new int[1] ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A1234BarNomCli = "" ;
      P06W89_A396EmprCod = new String[] {""} ;
      P06W89_A129BarCod = new int[1] ;
      P06W89_A132BarCodReo = new byte[1] ;
      P06W89_A130BarCodPar = new String[] {""} ;
      P06W89_A44AlbRecCod = new int[1] ;
      P06W89_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      P06W810_A396EmprCod = new String[] {""} ;
      P06W810_A5206Nr_albrecc = new int[1] ;
      P06W810_n5206Nr_albrecc = new boolean[] {false} ;
      P06W810_A5198Nr_codigo = new int[1] ;
      P06W811_A5631Nr_ObsRT = new String[] {""} ;
      P06W811_n5631Nr_ObsRT = new boolean[] {false} ;
      P06W811_A396EmprCod = new String[] {""} ;
      P06W811_A5198Nr_codigo = new int[1] ;
      P06W811_A5222Nr_barcoda = new int[1] ;
      P06W811_n5222Nr_barcoda = new boolean[] {false} ;
      P06W811_A5223Nr_barreoa = new byte[1] ;
      P06W811_n5223Nr_barreoa = new boolean[] {false} ;
      P06W811_A5224Nr_barpara = new String[] {""} ;
      P06W811_n5224Nr_barpara = new boolean[] {false} ;
      P06W811_A5630Nr_RespTec = new byte[1] ;
      P06W811_n5630Nr_RespTec = new boolean[] {false} ;
      P06W811_A5628Nr_comerc = new String[] {""} ;
      P06W811_n5628Nr_comerc = new boolean[] {false} ;
      P06W811_A8627Nr_obscm2 = new String[] {""} ;
      P06W811_n8627Nr_obscm2 = new boolean[] {false} ;
      A5631Nr_ObsRT = "" ;
      A5224Nr_barpara = "" ;
      A5628Nr_comerc = "" ;
      A8627Nr_obscm2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rnce000__default(),
         new Object[] {
             new Object[] {
            P06W82_A396EmprCod, P06W82_A407EmprNom, P06W82_n407EmprNom
            }
            , new Object[] {
            P06W83_A396EmprCod, P06W83_A5198Nr_codigo, P06W83_A834TipDefDsc, P06W83_n834TipDefDsc, P06W83_A833TipDefCod
            }
            , new Object[] {
            P06W84_A833TipDefCod, P06W84_A5085CodCausa, P06W84_n5085CodCausa, P06W84_A7000Rps_Cod, P06W84_n7000Rps_Cod, P06W84_A396EmprCod, P06W84_A2297HisReoTn, P06W84_n2297HisReoTn, P06W84_A548HisEstReo, P06W84_n548HisEstReo,
            P06W84_A5356Hisoperar, P06W84_n5356Hisoperar, P06W84_A539HisBarCod, P06W84_A545HisCodReo, P06W84_A544HisCodPar, P06W84_A7001Rps_Dsc, P06W84_n7001Rps_Dsc, P06W84_A540HisBarKgm, P06W84_n540HisBarKgm, P06W84_A2299HisReoDsc,
            P06W84_n2299HisReoDsc, P06W84_A542HisBarSer, P06W84_n542HisBarSer, P06W84_A279CliNom, P06W84_A252CliCod, P06W84_n252CliCod, P06W84_A5086DscCausa, P06W84_n5086DscCausa, P06W84_A834TipDefDsc, P06W84_n834TipDefDsc
            }
            , new Object[] {
            P06W85_A396EmprCod, P06W85_A652OpeCod, P06W85_A653OpeNom, P06W85_n653OpeNom
            }
            , new Object[] {
            P06W86_A396EmprCod, P06W86_A5198Nr_codigo, P06W86_A5218Nr_obstec, P06W86_n5218Nr_obstec, P06W86_A5228Nr_linTec
            }
            , new Object[] {
            P06W87_A396EmprCod, P06W87_A5198Nr_codigo, P06W87_A5219Nr_obstra, P06W87_n5219Nr_obstra, P06W87_A5230Nr_linTre
            }
            , new Object[] {
            P06W88_A396EmprCod, P06W88_A130BarCodPar, P06W88_A132BarCodReo, P06W88_A129BarCod, P06W88_A143BarDisNum, P06W88_A1234BarNomCli, P06W88_A1235BarNumCli
            }
            , new Object[] {
            P06W89_A396EmprCod, P06W89_A129BarCod, P06W89_A132BarCodReo, P06W89_A130BarCodPar, P06W89_A44AlbRecCod, P06W89_A200BarPieCod
            }
            , new Object[] {
            P06W810_A396EmprCod, P06W810_A5206Nr_albrecc, P06W810_n5206Nr_albrecc, P06W810_A5198Nr_codigo
            }
            , new Object[] {
            P06W811_A5631Nr_ObsRT, P06W811_n5631Nr_ObsRT, P06W811_A396EmprCod, P06W811_A5198Nr_codigo, P06W811_A5222Nr_barcoda, P06W811_n5222Nr_barcoda, P06W811_A5223Nr_barreoa, P06W811_n5223Nr_barreoa, P06W811_A5224Nr_barpara, P06W811_n5224Nr_barpara,
            P06W811_A5630Nr_RespTec, P06W811_n5630Nr_RespTec, P06W811_A5628Nr_comerc, P06W811_n5628Nr_comerc, P06W811_A8627Nr_obscm2, P06W811_n8627Nr_obscm2
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
   private byte AV41etm ;
   private byte AV42brochado ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A548HisEstReo ;
   private byte A545HisCodReo ;
   private byte AV11BarCodreo ;
   private byte AV30NR_RESPTEC ;
   private byte AV27NR_BARREOA ;
   private byte A132BarCodReo ;
   private byte A5223Nr_barreoa ;
   private byte A5630Nr_RespTec ;
   private short AV18i ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A7000Rps_Cod ;
   private short A5228Nr_linTec ;
   private short A5230Nr_linTre ;
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
   private int AV26NR_BARCODA ;
   private int AV22Nr_codigo ;
   private int A129BarCod ;
   private int A1235BarNumCli ;
   private int A44AlbRecCod ;
   private int A5206Nr_albrecc ;
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
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV19Tab_def[] ;
   private String A834TipDefDsc ;
   private String A544HisCodPar ;
   private String A7001Rps_Dsc ;
   private String A2299HisReoDsc ;
   private String A542HisBarSer ;
   private String A279CliNom ;
   private String A5086DscCausa ;
   private String AV12BarCodPar ;
   private String AV36OpeNom ;
   private String A653OpeNom ;
   private String AV31Resp ;
   private String AV32Nr_comerc ;
   private String AV34Acc_com ;
   private String AV37Rps_Dsc ;
   private String AV23ObsTec[] ;
   private String A5218Nr_obstec ;
   private String AV24ObsTra[] ;
   private String A5219Nr_obstra ;
   private String AV13BarDisNum ;
   private String AV14BarNomCli ;
   private String AV28NR_BARPARA ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A1234BarNomCli ;
   private String A200BarPieCod ;
   private String A5224Nr_barpara ;
   private String A5628Nr_comerc ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean n834TipDefDsc ;
   private boolean n5085CodCausa ;
   private boolean n7000Rps_Cod ;
   private boolean n2297HisReoTn ;
   private boolean n548HisEstReo ;
   private boolean n5356Hisoperar ;
   private boolean n7001Rps_Dsc ;
   private boolean n540HisBarKgm ;
   private boolean n2299HisReoDsc ;
   private boolean n542HisBarSer ;
   private boolean n252CliCod ;
   private boolean n5086DscCausa ;
   private boolean n653OpeNom ;
   private boolean returnInSub ;
   private boolean n5218Nr_obstec ;
   private boolean n5219Nr_obstra ;
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
   private String AV35Com_com ;
   private String AV33Nr_obscom ;
   private String A8627Nr_obscm2 ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P06W82_A396EmprCod ;
   private String[] P06W82_A407EmprNom ;
   private boolean[] P06W82_n407EmprNom ;
   private String[] P06W83_A396EmprCod ;
   private int[] P06W83_A5198Nr_codigo ;
   private String[] P06W83_A834TipDefDsc ;
   private boolean[] P06W83_n834TipDefDsc ;
   private short[] P06W83_A833TipDefCod ;
   private short[] P06W84_A833TipDefCod ;
   private short[] P06W84_A5085CodCausa ;
   private boolean[] P06W84_n5085CodCausa ;
   private short[] P06W84_A7000Rps_Cod ;
   private boolean[] P06W84_n7000Rps_Cod ;
   private String[] P06W84_A396EmprCod ;
   private int[] P06W84_A2297HisReoTn ;
   private boolean[] P06W84_n2297HisReoTn ;
   private byte[] P06W84_A548HisEstReo ;
   private boolean[] P06W84_n548HisEstReo ;
   private int[] P06W84_A5356Hisoperar ;
   private boolean[] P06W84_n5356Hisoperar ;
   private int[] P06W84_A539HisBarCod ;
   private byte[] P06W84_A545HisCodReo ;
   private String[] P06W84_A544HisCodPar ;
   private String[] P06W84_A7001Rps_Dsc ;
   private boolean[] P06W84_n7001Rps_Dsc ;
   private java.math.BigDecimal[] P06W84_A540HisBarKgm ;
   private boolean[] P06W84_n540HisBarKgm ;
   private String[] P06W84_A2299HisReoDsc ;
   private boolean[] P06W84_n2299HisReoDsc ;
   private String[] P06W84_A542HisBarSer ;
   private boolean[] P06W84_n542HisBarSer ;
   private String[] P06W84_A279CliNom ;
   private int[] P06W84_A252CliCod ;
   private boolean[] P06W84_n252CliCod ;
   private String[] P06W84_A5086DscCausa ;
   private boolean[] P06W84_n5086DscCausa ;
   private String[] P06W84_A834TipDefDsc ;
   private boolean[] P06W84_n834TipDefDsc ;
   private String[] P06W85_A396EmprCod ;
   private int[] P06W85_A652OpeCod ;
   private String[] P06W85_A653OpeNom ;
   private boolean[] P06W85_n653OpeNom ;
   private String[] P06W86_A396EmprCod ;
   private int[] P06W86_A5198Nr_codigo ;
   private String[] P06W86_A5218Nr_obstec ;
   private boolean[] P06W86_n5218Nr_obstec ;
   private short[] P06W86_A5228Nr_linTec ;
   private String[] P06W87_A396EmprCod ;
   private int[] P06W87_A5198Nr_codigo ;
   private String[] P06W87_A5219Nr_obstra ;
   private boolean[] P06W87_n5219Nr_obstra ;
   private short[] P06W87_A5230Nr_linTre ;
   private String[] P06W88_A396EmprCod ;
   private String[] P06W88_A130BarCodPar ;
   private byte[] P06W88_A132BarCodReo ;
   private int[] P06W88_A129BarCod ;
   private String[] P06W88_A143BarDisNum ;
   private String[] P06W88_A1234BarNomCli ;
   private int[] P06W88_A1235BarNumCli ;
   private String[] P06W89_A396EmprCod ;
   private int[] P06W89_A129BarCod ;
   private byte[] P06W89_A132BarCodReo ;
   private String[] P06W89_A130BarCodPar ;
   private int[] P06W89_A44AlbRecCod ;
   private String[] P06W89_A200BarPieCod ;
   private String[] P06W810_A396EmprCod ;
   private int[] P06W810_A5206Nr_albrecc ;
   private boolean[] P06W810_n5206Nr_albrecc ;
   private int[] P06W810_A5198Nr_codigo ;
   private String[] P06W811_A5631Nr_ObsRT ;
   private boolean[] P06W811_n5631Nr_ObsRT ;
   private String[] P06W811_A396EmprCod ;
   private int[] P06W811_A5198Nr_codigo ;
   private int[] P06W811_A5222Nr_barcoda ;
   private boolean[] P06W811_n5222Nr_barcoda ;
   private byte[] P06W811_A5223Nr_barreoa ;
   private boolean[] P06W811_n5223Nr_barreoa ;
   private String[] P06W811_A5224Nr_barpara ;
   private boolean[] P06W811_n5224Nr_barpara ;
   private byte[] P06W811_A5630Nr_RespTec ;
   private boolean[] P06W811_n5630Nr_RespTec ;
   private String[] P06W811_A5628Nr_comerc ;
   private boolean[] P06W811_n5628Nr_comerc ;
   private String[] P06W811_A8627Nr_obscm2 ;
   private boolean[] P06W811_n8627Nr_obscm2 ;
}

final  class rnce000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06W82", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06W83", "SELECT T1.EmprCod, T1.Nr_codigo, T2.TipDefDsc, T1.TipDefCod FROM (TXPNOTRE1 T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.Nr_codigo = ? ORDER BY T1.EmprCod, T1.Nr_codigo, T1.TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06W84", "SELECT T1.TipDefCod, T1.CodCausa, T1.Rps_Cod, T1.EmprCod, T1.HisReoTn, T1.HisEstReo, T1.Hisoperar, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar, T5.Rps_Dsc, T1.HisBarKgm, T1.HisReoDsc, T1.HisBarSer, T2.CliNom, T1.CliCod, T4.DscCausa, T3.TipDefDsc FROM ((((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPDEF T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T4 ON T4.EmprCod = T1.EmprCod AND T4.CodCausa = T1.CodCausa) LEFT JOIN TXPCODRPS T5 ON T5.EmprCod = T1.EmprCod AND T5.Rps_Cod = T1.Rps_Cod) WHERE (T1.EmprCod = ? and T1.HisReoTn = ?) AND (T1.HisEstReo = 2) ORDER BY T1.EmprCod, T1.HisReoTn ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06W85", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06W86", "SELECT EmprCod, Nr_codigo, Nr_obstec, Nr_linTec FROM TXPNOTRET WHERE EmprCod = ? and Nr_codigo = ? ORDER BY EmprCod, Nr_codigo, Nr_linTec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06W87", "SELECT EmprCod, Nr_codigo, Nr_obstra, Nr_linTre FROM TXPNOTRTE WHERE EmprCod = ? and Nr_codigo = ? ORDER BY EmprCod, Nr_codigo, Nr_linTre ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06W88", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarDisNum, BarNomCli, BarNumCli FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06W89", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06W810", "SELECT EmprCod, Nr_albrecc, Nr_codigo FROM TXPNOTREC WHERE (Nr_albrecc = ?) AND (EmprCod = ?) ORDER BY Nr_albrecc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06W811", "SELECT Nr_ObsRT, EmprCod, Nr_codigo, Nr_barcoda, Nr_barreoa, Nr_barpara, Nr_RespTec, Nr_comerc, Nr_obscm2 FROM TXPNOTREC WHERE EmprCod = ? and Nr_codigo = ? ORDER BY EmprCod, Nr_codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 2 :
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
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((byte[]) buf[13])[0] = rslt.getByte(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((String[]) buf[15])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 26);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 30);
               ((int[]) buf[24])[0] = rslt.getInt(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(17, 60);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 9 :
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

