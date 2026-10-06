package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rjpfi00 extends GXReport
{
   public rjpfi00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rjpfi00.class ), "" );
   }

   public rjpfi00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      rjpfi00.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      rjpfi00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rjpfi00.this.A2297HisReoTn = aP1[0];
      this.aP1 = aP1;
      rjpfi00.this.Gx_out = aP2[0];
      this.aP2 = aP2;
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
         getPrinter().GxSetDocName("NOTA NO CONFORMIDAD") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*3)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV18ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOTAI", ""), GXv_char1) ;
         rjpfi00.this.AV18ContDsc = GXv_char1[0] ;
         GXt_char2 = AV16Station ;
         GXv_char1[0] = GXt_char2 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char1) ;
         rjpfi00.this.GXt_char2 = GXv_char1[0] ;
         AV16Station = GXt_char2 ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = AV17EmprNom ;
         GXv_char4[0] = AV9Usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char1, GXv_char3, GXv_char4) ;
         rjpfi00.this.A396EmprCod = GXv_char1[0] ;
         rjpfi00.this.AV17EmprNom = GXv_char3[0] ;
         rjpfi00.this.AV9Usurcod = GXv_char4[0] ;
         /* Using cursor P07HC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A833TipDefCod = P07HC2_A833TipDefCod[0] ;
            A5085CodCausa = P07HC2_A5085CodCausa[0] ;
            n5085CodCausa = P07HC2_n5085CodCausa[0] ;
            A548HisEstReo = P07HC2_A548HisEstReo[0] ;
            n548HisEstReo = P07HC2_n548HisEstReo[0] ;
            A539HisBarCod = P07HC2_A539HisBarCod[0] ;
            A545HisCodReo = P07HC2_A545HisCodReo[0] ;
            A544HisCodPar = P07HC2_A544HisCodPar[0] ;
            A5662HisAcCo = P07HC2_A5662HisAcCo[0] ;
            n5662HisAcCo = P07HC2_n5662HisAcCo[0] ;
            A5693HisAcCot = P07HC2_A5693HisAcCot[0] ;
            n5693HisAcCot = P07HC2_n5693HisAcCot[0] ;
            A5694HisAdEAcCo = P07HC2_A5694HisAdEAcCo[0] ;
            n5694HisAdEAcCo = P07HC2_n5694HisAdEAcCo[0] ;
            A5695HisAdEAcCt = P07HC2_A5695HisAdEAcCt[0] ;
            n5695HisAdEAcCt = P07HC2_n5695HisAdEAcCt[0] ;
            A541HisBarMtr = P07HC2_A541HisBarMtr[0] ;
            n541HisBarMtr = P07HC2_n541HisBarMtr[0] ;
            A602MaqCod = P07HC2_A602MaqCod[0] ;
            n602MaqCod = P07HC2_n602MaqCod[0] ;
            A834TipDefDsc = P07HC2_A834TipDefDsc[0] ;
            n834TipDefDsc = P07HC2_n834TipDefDsc[0] ;
            A540HisBarKgm = P07HC2_A540HisBarKgm[0] ;
            n540HisBarKgm = P07HC2_n540HisBarKgm[0] ;
            A2299HisReoDsc = P07HC2_A2299HisReoDsc[0] ;
            n2299HisReoDsc = P07HC2_n2299HisReoDsc[0] ;
            A542HisBarSer = P07HC2_A542HisBarSer[0] ;
            n542HisBarSer = P07HC2_n542HisBarSer[0] ;
            A279CliNom = P07HC2_A279CliNom[0] ;
            A252CliCod = P07HC2_A252CliCod[0] ;
            n252CliCod = P07HC2_n252CliCod[0] ;
            A569HisReoFec = P07HC2_A569HisReoFec[0] ;
            n569HisReoFec = P07HC2_n569HisReoFec[0] ;
            A5086DscCausa = P07HC2_A5086DscCausa[0] ;
            n5086DscCausa = P07HC2_n5086DscCausa[0] ;
            A279CliNom = P07HC2_A279CliNom[0] ;
            A834TipDefDsc = P07HC2_A834TipDefDsc[0] ;
            n834TipDefDsc = P07HC2_n834TipDefDsc[0] ;
            A5086DscCausa = P07HC2_A5086DscCausa[0] ;
            n5086DscCausa = P07HC2_n5086DscCausa[0] ;
            AV10BarCod = A539HisBarCod ;
            AV11BarCodreo = A545HisCodReo ;
            AV12BarCodPar = A544HisCodPar ;
            AV20HISACCO = A5662HisAcCo ;
            AV21ACCO = GXutil.trim( AV20HISACCO) ;
            AV22HISACCOT = A5693HisAcCot ;
            AV23ACCOT = GXutil.trim( AV22HISACCOT) ;
            AV26HISADEACCO = A5694HisAdEAcCo ;
            AV24AEACDCOR = GXutil.trim( AV26HISADEACCO) ;
            AV27HISADEACCT = A5695HisAdEAcCt ;
            AV25AEACCORT = GXutil.trim( AV27HISADEACCT) ;
            /* Execute user subroutine: 'BARCAD' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            h7HC0( false, 103) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2297HisReoTn), "ZZZZZ9")), 642, Gx_line+39, 693, Gx_line+57, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(176, Gx_line+18, 528, Gx_line+75, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Acçao Correctiva", ""), 297, Gx_line+47, 411, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.º ", ""), 597, Gx_line+39, 621, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(527, Gx_line+18, 740, Gx_line+75, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nao Conformidade / Reclamaçoes", ""), 218, Gx_line+23, 489, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "09dd1e1c-34c8-47ed-9624-756e091de4c4", "", context.getHttpContext().getTheme( )), 27, Gx_line+7, 145, Gx_line+86) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+103) ;
            h7HC0( false, 172) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Identificação do Artigo:", ""), 28, Gx_line+29, 183, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+67, 88, Gx_line+84, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço", ""), 291, Gx_line+67, 391, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor Cliente", ""), 451, Gx_line+67, 543, Gx_line+84, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Qtd. (Kg/Mts)", ""), 588, Gx_line+67, 672, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 83, Gx_line+67, 134, Gx_line+85, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 31, Gx_line+89, 282, Gx_line+107, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A542HisBarSer, "")), 198, Gx_line+29, 332, Gx_line+47, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2299HisReoDsc, "")), 334, Gx_line+29, 552, Gx_line+47, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A539HisBarCod), "ZZZZZZZ9")), 294, Gx_line+90, 362, Gx_line+108, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A545HisCodReo), "9")), 375, Gx_line+90, 384, Gx_line+108, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A544HisCodPar, "")), 389, Gx_line+90, 398, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A540HisBarKgm, "ZZZZZ9.99")), 590, Gx_line+91, 666, Gx_line+109, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14BarNomCli, "")), 408, Gx_line+90, 517, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarNumCli), "ZZZZZ9")), 521, Gx_line+90, 572, Gx_line+108, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A834TipDefDsc, "")), 27, Gx_line+149, 277, Gx_line+166, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descrição da Não Conformidade:", ""), 27, Gx_line+7, 246, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(26, Gx_line+65, 753, Gx_line+131, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(286, Gx_line+82, 286, Gx_line+130, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(405, Gx_line+65, 405, Gx_line+113, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(575, Gx_line+65, 575, Gx_line+131, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descriçao da  Não Conformidade:", ""), 27, Gx_line+128, 250, Gx_line+145, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 691, Gx_line+90, 742, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 686, Gx_line+67, 744, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(679, Gx_line+65, 679, Gx_line+131, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28VCompo, "")), 556, Gx_line+47, 775, Gx_line+63, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TipArtDsc, "")), 556, Gx_line+29, 775, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A541HisBarMtr, "ZZZZZ9.99")), 590, Gx_line+109, 666, Gx_line+127, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+172) ;
            h7HC0( false, 96) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Causas da Não Conformidade:", ""), 31, Gx_line+8, 232, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(23, Gx_line+5, 761, Gx_line+90, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5086DscCausa, "")), 33, Gx_line+41, 534, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 600, Gx_line+69, 642, Gx_line+86, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsável:", ""), 394, Gx_line+69, 494, Gx_line+86, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(502, Gx_line+84, 596, Gx_line+84, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A569HisReoFec, "99/99/99"), 649, Gx_line+69, 717, Gx_line+87, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+96) ;
            h7HC0( false, 165) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Acções Correcção a Implementar:", ""), 31, Gx_line+7, 256, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 606, Gx_line+143, 648, Gx_line+160, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsável:", ""), 400, Gx_line+143, 500, Gx_line+160, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(508, Gx_line+158, 602, Gx_line+158, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("___/___/___", 658, Gx_line+143, 733, Gx_line+160, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(23, Gx_line+4, 761, Gx_line+162, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(AV21ACCO, 31, Gx_line+25, 548, Gx_line+95, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+165) ;
            AV19Accion = A5662HisAcCo ;
            h7HC0( false, 160) ;
            getPrinter().GxDrawRect(23, Gx_line+0, 761, Gx_line+160, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Acções Correctivas a Implementar:", ""), 31, Gx_line+5, 262, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 602, Gx_line+141, 644, Gx_line+158, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsável:", ""), 396, Gx_line+141, 496, Gx_line+158, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(504, Gx_line+156, 598, Gx_line+156, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("___/___/___", 654, Gx_line+141, 729, Gx_line+158, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(AV23ACCOT, 31, Gx_line+24, 744, Gx_line+98, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+160) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         h7HC0( false, 243) ;
         getPrinter().GxDrawRect(23, Gx_line+3, 761, Gx_line+239, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Análise da Eficácia:", ""), 31, Gx_line+5, 162, Gx_line+22, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 613, Gx_line+220, 655, Gx_line+237, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Responsável:", ""), 402, Gx_line+220, 502, Gx_line+237, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(514, Gx_line+235, 608, Gx_line+235, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawText("___/___/___", 665, Gx_line+220, 740, Gx_line+237, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Acções de Correcção:", ""), 38, Gx_line+29, 183, Gx_line+46, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Acções Correctivas", ""), 483, Gx_line+29, 609, Gx_line+46, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(31, Gx_line+25, 745, Gx_line+185, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(389, Gx_line+25, 389, Gx_line+184, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Resultado Eficaz?", ""), 35, Gx_line+193, 145, Gx_line+210, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(171, Gx_line+193, 197, Gx_line+210, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Sim -> Fim", ""), 202, Gx_line+193, 271, Gx_line+210, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Não ->", ""), 334, Gx_line+193, 376, Gx_line+210, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(303, Gx_line+193, 329, Gx_line+210, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(31, Gx_line+184, 745, Gx_line+217, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(AV24AEACDCOR, 39, Gx_line+47, 384, Gx_line+126, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(AV25AEACCORT, 395, Gx_line+47, 741, Gx_line+126, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+243) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7HC0( true, 0) ;
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
      /* Using cursor P07HC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodreo), AV12BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P07HC3_A130BarCodPar[0] ;
         A132BarCodReo = P07HC3_A132BarCodReo[0] ;
         A129BarCod = P07HC3_A129BarCod[0] ;
         A143BarDisNum = P07HC3_A143BarDisNum[0] ;
         A1234BarNomCli = P07HC3_A1234BarNomCli[0] ;
         A1235BarNumCli = P07HC3_A1235BarNumCli[0] ;
         A217BarTipArt = P07HC3_A217BarTipArt[0] ;
         n217BarTipArt = P07HC3_n217BarTipArt[0] ;
         A224BarTraP1 = P07HC3_A224BarTraP1[0] ;
         A225BarTraP2 = P07HC3_A225BarTraP2[0] ;
         A226BarTraP3 = P07HC3_A226BarTraP3[0] ;
         AV13BarDisNum = A143BarDisNum ;
         AV14BarNomCli = A1234BarNomCli ;
         AV15BarNumCli = A1235BarNumCli ;
         AV30BarTipArt = A217BarTipArt ;
         /* Execute user subroutine: 'TIPART' */
         S124 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         if ( A224BarTraP1 > 0 )
         {
            AV28VCompo = GXutil.trim( GXutil.str( A224BarTraP1, 3, 0)) + "%" ;
            if ( A225BarTraP2 > 0 )
            {
               AV28VCompo += GXutil.trim( GXutil.str( A225BarTraP2, 3, 0)) + "%" ;
            }
            if ( A226BarTraP3 > 0 )
            {
               AV28VCompo += GXutil.trim( GXutil.str( A226BarTraP3, 3, 0)) + "%" ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S124( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      /* Using cursor P07HC4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(AV30BarTipArt)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A829TipArtCod = P07HC4_A829TipArtCod[0] ;
         A830TipArtDsc = P07HC4_A830TipArtDsc[0] ;
         n830TipArtDsc = P07HC4_n830TipArtDsc[0] ;
         AV29TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void h7HC0( boolean bFoot ,
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
               getPrinter().GxDrawLine(21, Gx_line+5, 759, Gx_line+5, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18ContDsc, "")), 22, Gx_line+11, 106, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Impressao:", ""), 132, Gx_line+10, 199, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Usurcod, "@!")), 205, Gx_line+9, 272, Gx_line+26, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 279, Gx_line+9, 346, Gx_line+26, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 573, Gx_line+9, 631, Gx_line+26, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 641, Gx_line+10, 680, Gx_line+26, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 685, Gx_line+9, 702, Gx_line+26, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 708, Gx_line+10, 757, Gx_line+25, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+27) ;
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
      this.aP0[0] = rjpfi00.this.A396EmprCod;
      this.aP1[0] = rjpfi00.this.A2297HisReoTn;
      this.aP2[0] = rjpfi00.this.Gx_out;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18ContDsc = "" ;
      AV16Station = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      AV17EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV9Usurcod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P07HC2_A833TipDefCod = new short[1] ;
      P07HC2_A5085CodCausa = new short[1] ;
      P07HC2_n5085CodCausa = new boolean[] {false} ;
      P07HC2_A396EmprCod = new String[] {""} ;
      P07HC2_A2297HisReoTn = new int[1] ;
      P07HC2_n2297HisReoTn = new boolean[] {false} ;
      P07HC2_A548HisEstReo = new byte[1] ;
      P07HC2_n548HisEstReo = new boolean[] {false} ;
      P07HC2_A539HisBarCod = new int[1] ;
      P07HC2_A545HisCodReo = new byte[1] ;
      P07HC2_A544HisCodPar = new String[] {""} ;
      P07HC2_A5662HisAcCo = new String[] {""} ;
      P07HC2_n5662HisAcCo = new boolean[] {false} ;
      P07HC2_A5693HisAcCot = new String[] {""} ;
      P07HC2_n5693HisAcCot = new boolean[] {false} ;
      P07HC2_A5694HisAdEAcCo = new String[] {""} ;
      P07HC2_n5694HisAdEAcCo = new boolean[] {false} ;
      P07HC2_A5695HisAdEAcCt = new String[] {""} ;
      P07HC2_n5695HisAdEAcCt = new boolean[] {false} ;
      P07HC2_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HC2_n541HisBarMtr = new boolean[] {false} ;
      P07HC2_A602MaqCod = new String[] {""} ;
      P07HC2_n602MaqCod = new boolean[] {false} ;
      P07HC2_A834TipDefDsc = new String[] {""} ;
      P07HC2_n834TipDefDsc = new boolean[] {false} ;
      P07HC2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HC2_n540HisBarKgm = new boolean[] {false} ;
      P07HC2_A2299HisReoDsc = new String[] {""} ;
      P07HC2_n2299HisReoDsc = new boolean[] {false} ;
      P07HC2_A542HisBarSer = new String[] {""} ;
      P07HC2_n542HisBarSer = new boolean[] {false} ;
      P07HC2_A279CliNom = new String[] {""} ;
      P07HC2_A252CliCod = new int[1] ;
      P07HC2_n252CliCod = new boolean[] {false} ;
      P07HC2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07HC2_n569HisReoFec = new boolean[] {false} ;
      P07HC2_A5086DscCausa = new String[] {""} ;
      P07HC2_n5086DscCausa = new boolean[] {false} ;
      A544HisCodPar = "" ;
      A5662HisAcCo = "" ;
      A5693HisAcCot = "" ;
      A5694HisAdEAcCo = "" ;
      A5695HisAdEAcCt = "" ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      A834TipDefDsc = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A2299HisReoDsc = "" ;
      A542HisBarSer = "" ;
      A279CliNom = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A5086DscCausa = "" ;
      AV12BarCodPar = "" ;
      AV20HISACCO = "" ;
      AV21ACCO = "" ;
      AV22HISACCOT = "" ;
      AV23ACCOT = "" ;
      AV26HISADEACCO = "" ;
      AV24AEACDCOR = "" ;
      AV27HISADEACCT = "" ;
      AV25AEACCORT = "" ;
      AV14BarNomCli = "" ;
      AV28VCompo = "" ;
      AV29TipArtDsc = "" ;
      AV19Accion = "" ;
      AV13BarDisNum = "" ;
      P07HC3_A396EmprCod = new String[] {""} ;
      P07HC3_A130BarCodPar = new String[] {""} ;
      P07HC3_A132BarCodReo = new byte[1] ;
      P07HC3_A129BarCod = new int[1] ;
      P07HC3_A143BarDisNum = new String[] {""} ;
      P07HC3_A1234BarNomCli = new String[] {""} ;
      P07HC3_A1235BarNumCli = new int[1] ;
      P07HC3_A217BarTipArt = new short[1] ;
      P07HC3_n217BarTipArt = new boolean[] {false} ;
      P07HC3_A224BarTraP1 = new short[1] ;
      P07HC3_A225BarTraP2 = new short[1] ;
      P07HC3_A226BarTraP3 = new short[1] ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A1234BarNomCli = "" ;
      P07HC4_A396EmprCod = new String[] {""} ;
      P07HC4_A829TipArtCod = new short[1] ;
      P07HC4_A830TipArtDsc = new String[] {""} ;
      P07HC4_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rjpfi00__default(),
         new Object[] {
             new Object[] {
            P07HC2_A833TipDefCod, P07HC2_A5085CodCausa, P07HC2_n5085CodCausa, P07HC2_A396EmprCod, P07HC2_A2297HisReoTn, P07HC2_n2297HisReoTn, P07HC2_A548HisEstReo, P07HC2_n548HisEstReo, P07HC2_A539HisBarCod, P07HC2_A545HisCodReo,
            P07HC2_A544HisCodPar, P07HC2_A5662HisAcCo, P07HC2_n5662HisAcCo, P07HC2_A5693HisAcCot, P07HC2_n5693HisAcCot, P07HC2_A5694HisAdEAcCo, P07HC2_n5694HisAdEAcCo, P07HC2_A5695HisAdEAcCt, P07HC2_n5695HisAdEAcCt, P07HC2_A541HisBarMtr,
            P07HC2_n541HisBarMtr, P07HC2_A602MaqCod, P07HC2_n602MaqCod, P07HC2_A834TipDefDsc, P07HC2_n834TipDefDsc, P07HC2_A540HisBarKgm, P07HC2_n540HisBarKgm, P07HC2_A2299HisReoDsc, P07HC2_n2299HisReoDsc, P07HC2_A542HisBarSer,
            P07HC2_n542HisBarSer, P07HC2_A279CliNom, P07HC2_A252CliCod, P07HC2_n252CliCod, P07HC2_A569HisReoFec, P07HC2_n569HisReoFec, P07HC2_A5086DscCausa, P07HC2_n5086DscCausa
            }
            , new Object[] {
            P07HC3_A396EmprCod, P07HC3_A130BarCodPar, P07HC3_A132BarCodReo, P07HC3_A129BarCod, P07HC3_A143BarDisNum, P07HC3_A1234BarNomCli, P07HC3_A1235BarNumCli, P07HC3_A217BarTipArt, P07HC3_n217BarTipArt, P07HC3_A224BarTraP1,
            P07HC3_A225BarTraP2, P07HC3_A226BarTraP3
            }
            , new Object[] {
            P07HC4_A396EmprCod, P07HC4_A829TipArtCod, P07HC4_A830TipArtDsc, P07HC4_n830TipArtDsc
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A548HisEstReo ;
   private byte A545HisCodReo ;
   private byte AV11BarCodreo ;
   private byte A132BarCodReo ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A217BarTipArt ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short AV30BarTipArt ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int A2297HisReoTn ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A539HisBarCod ;
   private int A252CliCod ;
   private int AV10BarCod ;
   private int Gx_OldLine ;
   private int AV15BarNumCli ;
   private int A129BarCod ;
   private int A1235BarNumCli ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal A540HisBarKgm ;
   private String A396EmprCod ;
   private String Gx_out ;
   private String AV18ContDsc ;
   private String AV16Station ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String AV17EmprNom ;
   private String GXv_char3[] ;
   private String AV9Usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A544HisCodPar ;
   private String A602MaqCod ;
   private String A834TipDefDsc ;
   private String A2299HisReoDsc ;
   private String A542HisBarSer ;
   private String A279CliNom ;
   private String A5086DscCausa ;
   private String AV12BarCodPar ;
   private String AV14BarNomCli ;
   private String AV28VCompo ;
   private String AV29TipArtDsc ;
   private String AV13BarDisNum ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A1234BarNomCli ;
   private String A830TipArtDsc ;
   private java.util.Date A569HisReoFec ;
   private java.util.Date Gx_date ;
   private boolean n2297HisReoTn ;
   private boolean n5085CodCausa ;
   private boolean n548HisEstReo ;
   private boolean n5662HisAcCo ;
   private boolean n5693HisAcCot ;
   private boolean n5694HisAdEAcCo ;
   private boolean n5695HisAdEAcCt ;
   private boolean n541HisBarMtr ;
   private boolean n602MaqCod ;
   private boolean n834TipDefDsc ;
   private boolean n540HisBarKgm ;
   private boolean n2299HisReoDsc ;
   private boolean n542HisBarSer ;
   private boolean n252CliCod ;
   private boolean n569HisReoFec ;
   private boolean n5086DscCausa ;
   private boolean returnInSub ;
   private boolean n217BarTipArt ;
   private boolean n830TipArtDsc ;
   private String AV21ACCO ;
   private String AV23ACCOT ;
   private String AV24AEACDCOR ;
   private String AV25AEACCORT ;
   private String AV19Accion ;
   private String A5662HisAcCo ;
   private String A5693HisAcCot ;
   private String A5694HisAdEAcCo ;
   private String A5695HisAdEAcCt ;
   private String AV20HISACCO ;
   private String AV22HISACCOT ;
   private String AV26HISADEACCO ;
   private String AV27HISADEACCT ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P07HC2_A833TipDefCod ;
   private short[] P07HC2_A5085CodCausa ;
   private boolean[] P07HC2_n5085CodCausa ;
   private String[] P07HC2_A396EmprCod ;
   private int[] P07HC2_A2297HisReoTn ;
   private boolean[] P07HC2_n2297HisReoTn ;
   private byte[] P07HC2_A548HisEstReo ;
   private boolean[] P07HC2_n548HisEstReo ;
   private int[] P07HC2_A539HisBarCod ;
   private byte[] P07HC2_A545HisCodReo ;
   private String[] P07HC2_A544HisCodPar ;
   private String[] P07HC2_A5662HisAcCo ;
   private boolean[] P07HC2_n5662HisAcCo ;
   private String[] P07HC2_A5693HisAcCot ;
   private boolean[] P07HC2_n5693HisAcCot ;
   private String[] P07HC2_A5694HisAdEAcCo ;
   private boolean[] P07HC2_n5694HisAdEAcCo ;
   private String[] P07HC2_A5695HisAdEAcCt ;
   private boolean[] P07HC2_n5695HisAdEAcCt ;
   private java.math.BigDecimal[] P07HC2_A541HisBarMtr ;
   private boolean[] P07HC2_n541HisBarMtr ;
   private String[] P07HC2_A602MaqCod ;
   private boolean[] P07HC2_n602MaqCod ;
   private String[] P07HC2_A834TipDefDsc ;
   private boolean[] P07HC2_n834TipDefDsc ;
   private java.math.BigDecimal[] P07HC2_A540HisBarKgm ;
   private boolean[] P07HC2_n540HisBarKgm ;
   private String[] P07HC2_A2299HisReoDsc ;
   private boolean[] P07HC2_n2299HisReoDsc ;
   private String[] P07HC2_A542HisBarSer ;
   private boolean[] P07HC2_n542HisBarSer ;
   private String[] P07HC2_A279CliNom ;
   private int[] P07HC2_A252CliCod ;
   private boolean[] P07HC2_n252CliCod ;
   private java.util.Date[] P07HC2_A569HisReoFec ;
   private boolean[] P07HC2_n569HisReoFec ;
   private String[] P07HC2_A5086DscCausa ;
   private boolean[] P07HC2_n5086DscCausa ;
   private String[] P07HC3_A396EmprCod ;
   private String[] P07HC3_A130BarCodPar ;
   private byte[] P07HC3_A132BarCodReo ;
   private int[] P07HC3_A129BarCod ;
   private String[] P07HC3_A143BarDisNum ;
   private String[] P07HC3_A1234BarNomCli ;
   private int[] P07HC3_A1235BarNumCli ;
   private short[] P07HC3_A217BarTipArt ;
   private boolean[] P07HC3_n217BarTipArt ;
   private short[] P07HC3_A224BarTraP1 ;
   private short[] P07HC3_A225BarTraP2 ;
   private short[] P07HC3_A226BarTraP3 ;
   private String[] P07HC4_A396EmprCod ;
   private short[] P07HC4_A829TipArtCod ;
   private String[] P07HC4_A830TipArtDsc ;
   private boolean[] P07HC4_n830TipArtDsc ;
}

final  class rjpfi00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07HC2", "SELECT T1.TipDefCod, T1.CodCausa, T1.EmprCod, T1.HisReoTn, T1.HisEstReo, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar, T1.HisAcCo, T1.HisAcCot, T1.HisAdEAcCo, T1.HisAdEAcCt, T1.HisBarMtr, T1.MaqCod, T3.TipDefDsc, T1.HisBarKgm, T1.HisReoDsc, T1.HisBarSer, T2.CliNom, T1.CliCod, T1.HisReoFec, T4.DscCausa FROM (((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPDEF T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T4 ON T4.EmprCod = T1.EmprCod AND T4.CodCausa = T1.CodCausa) WHERE (T1.EmprCod = ? and T1.HisReoTn = ?) AND (T1.HisEstReo = 1) ORDER BY T1.EmprCod, T1.HisReoTn ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07HC3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarDisNum, BarNomCli, BarNumCli, BarTipArt, BarTraP1, BarTraP2, BarTraP3 FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07HC4", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((String[]) buf[11])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 26);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(19, 30);
               ((int[]) buf[32])[0] = rslt.getInt(20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(21);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(22, 60);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

