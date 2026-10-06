package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rnci000 extends GXReport
{
   public rnci000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rnci000.class ), "" );
   }

   public rnci000( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      rnci000.this.aP2 = new String[] {""};
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
      rnci000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rnci000.this.A2297HisReoTn = aP1[0];
      this.aP1 = aP1;
      rnci000.this.Gx_out = aP2[0];
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
         getPrinter().GxSetDocName("NOTA NO CONFORMIDAD, INTERNA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*3)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV18ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOTAI", ""), GXv_char1) ;
         rnci000.this.AV18ContDsc = GXv_char1[0] ;
         GXt_char2 = AV16Station ;
         GXv_char1[0] = GXt_char2 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char1) ;
         rnci000.this.GXt_char2 = GXv_char1[0] ;
         AV16Station = GXt_char2 ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = AV17EmprNom ;
         GXv_char4[0] = AV9Usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char1, GXv_char3, GXv_char4) ;
         rnci000.this.A396EmprCod = GXv_char1[0] ;
         rnci000.this.AV17EmprNom = GXv_char3[0] ;
         rnci000.this.AV9Usurcod = GXv_char4[0] ;
         GXt_int5 = AV21etm ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM", ""), GXv_int6) ;
         rnci000.this.GXt_int5 = GXv_int6[0] ;
         AV21etm = GXt_int5 ;
         GXt_int5 = AV22brochado ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TONALI", ""), GXv_int6) ;
         rnci000.this.GXt_int5 = GXv_int6[0] ;
         AV22brochado = GXt_int5 ;
         /* Using cursor P06W72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A833TipDefCod = P06W72_A833TipDefCod[0] ;
            A5085CodCausa = P06W72_A5085CodCausa[0] ;
            n5085CodCausa = P06W72_n5085CodCausa[0] ;
            A5196TipCorCod = P06W72_A5196TipCorCod[0] ;
            n5196TipCorCod = P06W72_n5196TipCorCod[0] ;
            A548HisEstReo = P06W72_A548HisEstReo[0] ;
            n548HisEstReo = P06W72_n548HisEstReo[0] ;
            A539HisBarCod = P06W72_A539HisBarCod[0] ;
            A545HisCodReo = P06W72_A545HisCodReo[0] ;
            A544HisCodPar = P06W72_A544HisCodPar[0] ;
            A540HisBarKgm = P06W72_A540HisBarKgm[0] ;
            n540HisBarKgm = P06W72_n540HisBarKgm[0] ;
            A2299HisReoDsc = P06W72_A2299HisReoDsc[0] ;
            n2299HisReoDsc = P06W72_n2299HisReoDsc[0] ;
            A542HisBarSer = P06W72_A542HisBarSer[0] ;
            n542HisBarSer = P06W72_n542HisBarSer[0] ;
            A279CliNom = P06W72_A279CliNom[0] ;
            A252CliCod = P06W72_A252CliCod[0] ;
            n252CliCod = P06W72_n252CliCod[0] ;
            A5356Hisoperar = P06W72_A5356Hisoperar[0] ;
            n5356Hisoperar = P06W72_n5356Hisoperar[0] ;
            A7001Rps_Dsc = P06W72_A7001Rps_Dsc[0] ;
            n7001Rps_Dsc = P06W72_n7001Rps_Dsc[0] ;
            A7000Rps_Cod = P06W72_A7000Rps_Cod[0] ;
            n7000Rps_Cod = P06W72_n7000Rps_Cod[0] ;
            A606MaqDsc = P06W72_A606MaqDsc[0] ;
            n606MaqDsc = P06W72_n606MaqDsc[0] ;
            A602MaqCod = P06W72_A602MaqCod[0] ;
            n602MaqCod = P06W72_n602MaqCod[0] ;
            A834TipDefDsc = P06W72_A834TipDefDsc[0] ;
            n834TipDefDsc = P06W72_n834TipDefDsc[0] ;
            A5197TipCorDsc = P06W72_A5197TipCorDsc[0] ;
            n5197TipCorDsc = P06W72_n5197TipCorDsc[0] ;
            A5086DscCausa = P06W72_A5086DscCausa[0] ;
            n5086DscCausa = P06W72_n5086DscCausa[0] ;
            A5662HisAcCo = P06W72_A5662HisAcCo[0] ;
            n5662HisAcCo = P06W72_n5662HisAcCo[0] ;
            A279CliNom = P06W72_A279CliNom[0] ;
            A606MaqDsc = P06W72_A606MaqDsc[0] ;
            n606MaqDsc = P06W72_n606MaqDsc[0] ;
            A834TipDefDsc = P06W72_A834TipDefDsc[0] ;
            n834TipDefDsc = P06W72_n834TipDefDsc[0] ;
            A5086DscCausa = P06W72_A5086DscCausa[0] ;
            n5086DscCausa = P06W72_n5086DscCausa[0] ;
            A5197TipCorDsc = P06W72_A5197TipCorDsc[0] ;
            n5197TipCorDsc = P06W72_n5197TipCorDsc[0] ;
            A7001Rps_Dsc = P06W72_A7001Rps_Dsc[0] ;
            n7001Rps_Dsc = P06W72_n7001Rps_Dsc[0] ;
            AV10BarCod = A539HisBarCod ;
            AV11BarCodreo = A545HisCodReo ;
            AV12BarCodPar = A544HisCodPar ;
            /* Execute user subroutine: 'BARCAD' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
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
            if ( AV21etm == 1 )
            {
               h6W70( false, 113) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FICHA DE NÃO CONFORMIDADE", ""), 456, Gx_line+6, 666, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2297HisReoTn), "ZZZZZ9")), 677, Gx_line+6, 728, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(301, Gx_line+0, 762, Gx_line+109, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 555, Gx_line+88, 613, Gx_line+105, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 623, Gx_line+89, 662, Gx_line+105, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 668, Gx_line+88, 685, Gx_line+105, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 691, Gx_line+89, 740, Gx_line+104, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Impressao:", ""), 324, Gx_line+89, 391, Gx_line+104, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Usurcod, "@!")), 397, Gx_line+88, 464, Gx_line+105, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 471, Gx_line+88, 538, Gx_line+105, 0, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "1e79aa33-5eb4-4367-83cb-a2766f034f72", "", context.getHttpContext().getTheme( )), 27, Gx_line+0, 290, Gx_line+109) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+113) ;
            }
            else
            {
               if ( AV22brochado == 1 )
               {
                  h6W70( false, 111) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "FICHA DE NÃO CONFORMIDADE", ""), 458, Gx_line+6, 668, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2297HisReoTn), "ZZZZZ9")), 679, Gx_line+6, 730, Gx_line+24, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(301, Gx_line+0, 762, Gx_line+109, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 557, Gx_line+88, 615, Gx_line+105, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 625, Gx_line+89, 664, Gx_line+105, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 670, Gx_line+88, 687, Gx_line+105, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 693, Gx_line+89, 742, Gx_line+104, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Impressao:", ""), 326, Gx_line+89, 393, Gx_line+104, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Usurcod, "@!")), 399, Gx_line+88, 466, Gx_line+105, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 473, Gx_line+88, 540, Gx_line+105, 0, 0, 0, 0) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "f3c5c628-ed0a-4de0-b07a-9a9e4aad3dea", "", context.getHttpContext().getTheme( )), 27, Gx_line+0, 290, Gx_line+109) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+111) ;
               }
               else
               {
                  h6W70( false, 120) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "FICHA DE NÃO CONFORMIDADE", ""), 456, Gx_line+14, 666, Gx_line+31, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2297HisReoTn), "ZZZZZ9")), 677, Gx_line+14, 728, Gx_line+32, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6fa225cc-bb14-46c4-8fd0-56decb69faac", "", context.getHttpContext().getTheme( )), 27, Gx_line+7, 290, Gx_line+116) ;
                  getPrinter().GxDrawRect(301, Gx_line+7, 762, Gx_line+116, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 555, Gx_line+95, 613, Gx_line+112, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 623, Gx_line+96, 662, Gx_line+112, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 668, Gx_line+95, 685, Gx_line+112, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 691, Gx_line+96, 740, Gx_line+111, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Impressao:", ""), 324, Gx_line+96, 391, Gx_line+111, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Usurcod, "@!")), 397, Gx_line+95, 464, Gx_line+112, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 471, Gx_line+95, 538, Gx_line+112, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+120) ;
               }
            }
            h6W70( false, 133) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Composição da Malha / Artigo", ""), 26, Gx_line+41, 226, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 26, Gx_line+68, 84, Gx_line+85, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço", ""), 26, Gx_line+95, 126, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Guia Cliente", ""), 284, Gx_line+95, 367, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor Cliente", ""), 446, Gx_line+68, 538, Gx_line+85, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 94, Gx_line+68, 145, Gx_line+86, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 148, Gx_line+68, 399, Gx_line+86, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A542HisBarSer, "")), 270, Gx_line+41, 404, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2299HisReoDsc, "")), 419, Gx_line+41, 637, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A539HisBarCod), "ZZZZZZZ9")), 134, Gx_line+95, 202, Gx_line+113, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A545HisCodReo), "9")), 216, Gx_line+95, 225, Gx_line+113, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A544HisCodPar, "")), 229, Gx_line+95, 238, Gx_line+113, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13BarDisNum, "")), 404, Gx_line+95, 472, Gx_line+113, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A540HisBarKgm, "ZZZZZ9.99")), 651, Gx_line+95, 727, Gx_line+113, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14BarNomCli, "")), 554, Gx_line+68, 663, Gx_line+86, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarNumCli), "ZZZZZ9")), 676, Gx_line+68, 727, Gx_line+86, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "1º Identificação do artigo", ""), 23, Gx_line+13, 190, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(23, Gx_line+31, 761, Gx_line+120, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quantidade (kg)", ""), 508, Gx_line+95, 614, Gx_line+112, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+133) ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int7[0] = A5356Hisoperar ;
            GXv_char3[0] = AV20Openom ;
            new app.pnrcope(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3) ;
            rnci000.this.A396EmprCod = GXv_char4[0] ;
            rnci000.this.A5356Hisoperar = GXv_int7[0] ;
            rnci000.this.AV20Openom = GXv_char3[0] ;
            h6W70( false, 122) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descrição de não conformidade:", ""), 28, Gx_line+32, 244, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A834TipDefDsc, "")), 285, Gx_line+32, 535, Gx_line+49, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(23, Gx_line+27, 761, Gx_line+120, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "2º Identificação da Não Conformidade", ""), 23, Gx_line+7, 275, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Operario:", ""), 28, Gx_line+55, 92, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5356Hisoperar), "ZZZZZ9")), 114, Gx_line+55, 165, Gx_line+73, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Openom, "")), 178, Gx_line+55, 429, Gx_line+73, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina:", ""), 28, Gx_line+78, 90, Gx_line+95, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 114, Gx_line+78, 165, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 178, Gx_line+78, 312, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsavél:", ""), 28, Gx_line+101, 117, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7000Rps_Cod), "ZZZ9")), 130, Gx_line+101, 164, Gx_line+119, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7001Rps_Dsc, "")), 178, Gx_line+101, 512, Gx_line+119, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+122) ;
            h6W70( false, 140) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "3º Correcção", ""), 23, Gx_line+4, 108, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Causas / Origem:", ""), 28, Gx_line+32, 142, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(23, Gx_line+24, 761, Gx_line+133, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5086DscCausa, "")), 193, Gx_line+32, 694, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 602, Gx_line+104, 644, Gx_line+121, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsável:", ""), 396, Gx_line+104, 496, Gx_line+121, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(504, Gx_line+120, 598, Gx_line+120, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("___/___/___", 654, Gx_line+104, 729, Gx_line+121, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Correcção:", ""), 28, Gx_line+66, 101, Gx_line+83, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5197TipCorDsc, "")), 193, Gx_line+66, 694, Gx_line+84, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+140) ;
            AV19Accion = A5662HisAcCo ;
            h6W70( false, 160) ;
            getPrinter().GxDrawRect(23, Gx_line+22, 761, Gx_line+153, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "4º Acções Correctivas e Seguimento", ""), 23, Gx_line+2, 263, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 602, Gx_line+128, 644, Gx_line+145, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsável:", ""), 396, Gx_line+128, 496, Gx_line+145, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(504, Gx_line+144, 598, Gx_line+144, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("___/___/___", 654, Gx_line+128, 729, Gx_line+145, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descrição:", ""), 28, Gx_line+33, 94, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(AV19Accion, 28, Gx_line+51, 741, Gx_line+111, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+160) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         h6W70( false, 113) ;
         getPrinter().GxDrawRect(23, Gx_line+17, 761, Gx_line+106, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "5º Observações / Derrogações", ""), 23, Gx_line+0, 221, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 606, Gx_line+75, 648, Gx_line+92, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Responsável:", ""), 396, Gx_line+75, 496, Gx_line+92, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(507, Gx_line+91, 601, Gx_line+91, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawText("___/___/___", 658, Gx_line+75, 733, Gx_line+92, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descrição:", ""), 28, Gx_line+23, 94, Gx_line+40, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+113) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6W70( true, 0) ;
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
      /* Using cursor P06W73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodreo), AV12BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P06W73_A130BarCodPar[0] ;
         A132BarCodReo = P06W73_A132BarCodReo[0] ;
         A129BarCod = P06W73_A129BarCod[0] ;
         A143BarDisNum = P06W73_A143BarDisNum[0] ;
         A1234BarNomCli = P06W73_A1234BarNomCli[0] ;
         A1235BarNumCli = P06W73_A1235BarNumCli[0] ;
         AV13BarDisNum = A143BarDisNum ;
         AV14BarNomCli = A1234BarNomCli ;
         AV15BarNumCli = A1235BarNumCli ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void h6W70( boolean bFoot ,
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
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18ContDsc, "")), 22, Gx_line+15, 106, Gx_line+28, 0+256, 0, 0, 0) ;
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
      this.aP0[0] = rnci000.this.A396EmprCod;
      this.aP1[0] = rnci000.this.A2297HisReoTn;
      this.aP2[0] = rnci000.this.Gx_out;
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
      AV9Usurcod = "" ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P06W72_A833TipDefCod = new short[1] ;
      P06W72_A5085CodCausa = new short[1] ;
      P06W72_n5085CodCausa = new boolean[] {false} ;
      P06W72_A5196TipCorCod = new short[1] ;
      P06W72_n5196TipCorCod = new boolean[] {false} ;
      P06W72_A396EmprCod = new String[] {""} ;
      P06W72_A2297HisReoTn = new int[1] ;
      P06W72_n2297HisReoTn = new boolean[] {false} ;
      P06W72_A548HisEstReo = new byte[1] ;
      P06W72_n548HisEstReo = new boolean[] {false} ;
      P06W72_A539HisBarCod = new int[1] ;
      P06W72_A545HisCodReo = new byte[1] ;
      P06W72_A544HisCodPar = new String[] {""} ;
      P06W72_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06W72_n540HisBarKgm = new boolean[] {false} ;
      P06W72_A2299HisReoDsc = new String[] {""} ;
      P06W72_n2299HisReoDsc = new boolean[] {false} ;
      P06W72_A542HisBarSer = new String[] {""} ;
      P06W72_n542HisBarSer = new boolean[] {false} ;
      P06W72_A279CliNom = new String[] {""} ;
      P06W72_A252CliCod = new int[1] ;
      P06W72_n252CliCod = new boolean[] {false} ;
      P06W72_A5356Hisoperar = new int[1] ;
      P06W72_n5356Hisoperar = new boolean[] {false} ;
      P06W72_A7001Rps_Dsc = new String[] {""} ;
      P06W72_n7001Rps_Dsc = new boolean[] {false} ;
      P06W72_A7000Rps_Cod = new short[1] ;
      P06W72_n7000Rps_Cod = new boolean[] {false} ;
      P06W72_A606MaqDsc = new String[] {""} ;
      P06W72_n606MaqDsc = new boolean[] {false} ;
      P06W72_A602MaqCod = new String[] {""} ;
      P06W72_n602MaqCod = new boolean[] {false} ;
      P06W72_A834TipDefDsc = new String[] {""} ;
      P06W72_n834TipDefDsc = new boolean[] {false} ;
      P06W72_A5197TipCorDsc = new String[] {""} ;
      P06W72_n5197TipCorDsc = new boolean[] {false} ;
      P06W72_A5086DscCausa = new String[] {""} ;
      P06W72_n5086DscCausa = new boolean[] {false} ;
      P06W72_A5662HisAcCo = new String[] {""} ;
      P06W72_n5662HisAcCo = new boolean[] {false} ;
      A544HisCodPar = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A2299HisReoDsc = "" ;
      A542HisBarSer = "" ;
      A279CliNom = "" ;
      A7001Rps_Dsc = "" ;
      A606MaqDsc = "" ;
      A602MaqCod = "" ;
      A834TipDefDsc = "" ;
      A5197TipCorDsc = "" ;
      A5086DscCausa = "" ;
      A5662HisAcCo = "" ;
      AV12BarCodPar = "" ;
      Gx_date = GXutil.nullDate() ;
      AV13BarDisNum = "" ;
      AV14BarNomCli = "" ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      AV20Openom = "" ;
      GXv_char3 = new String[1] ;
      AV19Accion = "" ;
      P06W73_A396EmprCod = new String[] {""} ;
      P06W73_A130BarCodPar = new String[] {""} ;
      P06W73_A132BarCodReo = new byte[1] ;
      P06W73_A129BarCod = new int[1] ;
      P06W73_A143BarDisNum = new String[] {""} ;
      P06W73_A1234BarNomCli = new String[] {""} ;
      P06W73_A1235BarNumCli = new int[1] ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A1234BarNomCli = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rnci000__default(),
         new Object[] {
             new Object[] {
            P06W72_A833TipDefCod, P06W72_A5085CodCausa, P06W72_n5085CodCausa, P06W72_A5196TipCorCod, P06W72_n5196TipCorCod, P06W72_A396EmprCod, P06W72_A2297HisReoTn, P06W72_n2297HisReoTn, P06W72_A548HisEstReo, P06W72_n548HisEstReo,
            P06W72_A539HisBarCod, P06W72_A545HisCodReo, P06W72_A544HisCodPar, P06W72_A540HisBarKgm, P06W72_n540HisBarKgm, P06W72_A2299HisReoDsc, P06W72_n2299HisReoDsc, P06W72_A542HisBarSer, P06W72_n542HisBarSer, P06W72_A279CliNom,
            P06W72_A252CliCod, P06W72_n252CliCod, P06W72_A5356Hisoperar, P06W72_n5356Hisoperar, P06W72_A7001Rps_Dsc, P06W72_n7001Rps_Dsc, P06W72_A7000Rps_Cod, P06W72_n7000Rps_Cod, P06W72_A606MaqDsc, P06W72_n606MaqDsc,
            P06W72_A602MaqCod, P06W72_n602MaqCod, P06W72_A834TipDefDsc, P06W72_n834TipDefDsc, P06W72_A5197TipCorDsc, P06W72_n5197TipCorDsc, P06W72_A5086DscCausa, P06W72_n5086DscCausa, P06W72_A5662HisAcCo, P06W72_n5662HisAcCo
            }
            , new Object[] {
            P06W73_A396EmprCod, P06W73_A130BarCodPar, P06W73_A132BarCodReo, P06W73_A129BarCod, P06W73_A143BarDisNum, P06W73_A1234BarNomCli, P06W73_A1235BarNumCli
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV21etm ;
   private byte AV22brochado ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A548HisEstReo ;
   private byte A545HisCodReo ;
   private byte AV11BarCodreo ;
   private byte A132BarCodReo ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A5196TipCorCod ;
   private short A7000Rps_Cod ;
   private short Gx_err ;
   private int A2297HisReoTn ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A539HisBarCod ;
   private int A252CliCod ;
   private int A5356Hisoperar ;
   private int AV10BarCod ;
   private int Gx_OldLine ;
   private int AV15BarNumCli ;
   private int GXv_int7[] ;
   private int A129BarCod ;
   private int A1235BarNumCli ;
   private java.math.BigDecimal A540HisBarKgm ;
   private String A396EmprCod ;
   private String Gx_out ;
   private String AV18ContDsc ;
   private String AV16Station ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String AV17EmprNom ;
   private String AV9Usurcod ;
   private String scmdbuf ;
   private String A544HisCodPar ;
   private String A2299HisReoDsc ;
   private String A542HisBarSer ;
   private String A279CliNom ;
   private String A7001Rps_Dsc ;
   private String A606MaqDsc ;
   private String A602MaqCod ;
   private String A834TipDefDsc ;
   private String A5197TipCorDsc ;
   private String A5086DscCausa ;
   private String AV12BarCodPar ;
   private String AV13BarDisNum ;
   private String AV14BarNomCli ;
   private String GXv_char4[] ;
   private String AV20Openom ;
   private String GXv_char3[] ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A1234BarNomCli ;
   private java.util.Date Gx_date ;
   private boolean n2297HisReoTn ;
   private boolean n5085CodCausa ;
   private boolean n5196TipCorCod ;
   private boolean n548HisEstReo ;
   private boolean n540HisBarKgm ;
   private boolean n2299HisReoDsc ;
   private boolean n542HisBarSer ;
   private boolean n252CliCod ;
   private boolean n5356Hisoperar ;
   private boolean n7001Rps_Dsc ;
   private boolean n7000Rps_Cod ;
   private boolean n606MaqDsc ;
   private boolean n602MaqCod ;
   private boolean n834TipDefDsc ;
   private boolean n5197TipCorDsc ;
   private boolean n5086DscCausa ;
   private boolean n5662HisAcCo ;
   private boolean returnInSub ;
   private String AV19Accion ;
   private String A5662HisAcCo ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P06W72_A833TipDefCod ;
   private short[] P06W72_A5085CodCausa ;
   private boolean[] P06W72_n5085CodCausa ;
   private short[] P06W72_A5196TipCorCod ;
   private boolean[] P06W72_n5196TipCorCod ;
   private String[] P06W72_A396EmprCod ;
   private int[] P06W72_A2297HisReoTn ;
   private boolean[] P06W72_n2297HisReoTn ;
   private byte[] P06W72_A548HisEstReo ;
   private boolean[] P06W72_n548HisEstReo ;
   private int[] P06W72_A539HisBarCod ;
   private byte[] P06W72_A545HisCodReo ;
   private String[] P06W72_A544HisCodPar ;
   private java.math.BigDecimal[] P06W72_A540HisBarKgm ;
   private boolean[] P06W72_n540HisBarKgm ;
   private String[] P06W72_A2299HisReoDsc ;
   private boolean[] P06W72_n2299HisReoDsc ;
   private String[] P06W72_A542HisBarSer ;
   private boolean[] P06W72_n542HisBarSer ;
   private String[] P06W72_A279CliNom ;
   private int[] P06W72_A252CliCod ;
   private boolean[] P06W72_n252CliCod ;
   private int[] P06W72_A5356Hisoperar ;
   private boolean[] P06W72_n5356Hisoperar ;
   private String[] P06W72_A7001Rps_Dsc ;
   private boolean[] P06W72_n7001Rps_Dsc ;
   private short[] P06W72_A7000Rps_Cod ;
   private boolean[] P06W72_n7000Rps_Cod ;
   private String[] P06W72_A606MaqDsc ;
   private boolean[] P06W72_n606MaqDsc ;
   private String[] P06W72_A602MaqCod ;
   private boolean[] P06W72_n602MaqCod ;
   private String[] P06W72_A834TipDefDsc ;
   private boolean[] P06W72_n834TipDefDsc ;
   private String[] P06W72_A5197TipCorDsc ;
   private boolean[] P06W72_n5197TipCorDsc ;
   private String[] P06W72_A5086DscCausa ;
   private boolean[] P06W72_n5086DscCausa ;
   private String[] P06W72_A5662HisAcCo ;
   private boolean[] P06W72_n5662HisAcCo ;
   private String[] P06W73_A396EmprCod ;
   private String[] P06W73_A130BarCodPar ;
   private byte[] P06W73_A132BarCodReo ;
   private int[] P06W73_A129BarCod ;
   private String[] P06W73_A143BarDisNum ;
   private String[] P06W73_A1234BarNomCli ;
   private int[] P06W73_A1235BarNumCli ;
}

final  class rnci000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06W72", "SELECT T1.TipDefCod, T1.CodCausa, T1.TipCorCod, T1.EmprCod, T1.HisReoTn, T1.HisEstReo, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar, T1.HisBarKgm, T1.HisReoDsc, T1.HisBarSer, T2.CliNom, T1.CliCod, T1.Hisoperar, T7.Rps_Dsc, T1.Rps_Cod, T3.MaqDsc, T1.MaqCod, T4.TipDefDsc, T6.TipCorDsc, T5.DscCausa, T1.HisAcCo FROM ((((((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.MaqCod) INNER JOIN TXPTIPDEF T4 ON T4.EmprCod = T1.EmprCod AND T4.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T5 ON T5.EmprCod = T1.EmprCod AND T5.CodCausa = T1.CodCausa) LEFT JOIN TXPCORTIP T6 ON T6.EmprCod = T1.EmprCod AND T6.TipCorCod = T1.TipCorCod) LEFT JOIN TXPCODRPS T7 ON T7.EmprCod = T1.EmprCod AND T7.Rps_Cod = T1.Rps_Cod) WHERE (T1.EmprCod = ? and T1.HisReoTn = ?) AND (T1.HisEstReo = 1) ORDER BY T1.EmprCod, T1.HisReoTn ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06W73", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarDisNum, BarNomCli, BarNumCli FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 30);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(21, 60);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(22, 60);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
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
      }
   }

}

