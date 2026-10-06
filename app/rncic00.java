package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rncic00 extends GXReport
{
   public rncic00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rncic00.class ), "" );
   }

   public rncic00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      rncic00.this.aP2 = new String[] {""};
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
      rncic00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rncic00.this.A2297HisReoTn = aP1[0];
      this.aP1 = aP1;
      rncic00.this.Gx_out = aP2[0];
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
         getPrinter().GxSetDocName("NOTA NO CONFORMIDAD,INTERNA SP") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*3)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV18ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOTAI", ""), GXv_char1) ;
         rncic00.this.AV18ContDsc = GXv_char1[0] ;
         GXt_char2 = AV16Station ;
         GXv_char1[0] = GXt_char2 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char1) ;
         rncic00.this.GXt_char2 = GXv_char1[0] ;
         AV16Station = GXt_char2 ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = AV17EmprNom ;
         GXv_char4[0] = AV9Usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char1, GXv_char3, GXv_char4) ;
         rncic00.this.A396EmprCod = GXv_char1[0] ;
         rncic00.this.AV17EmprNom = GXv_char3[0] ;
         rncic00.this.AV9Usurcod = GXv_char4[0] ;
         GXt_int5 = AV23Martex ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MARTEX", ""), GXv_int6) ;
         rncic00.this.GXt_int5 = GXv_int6[0] ;
         AV23Martex = GXt_int5 ;
         /* Using cursor P07962 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A833TipDefCod = P07962_A833TipDefCod[0] ;
            A5085CodCausa = P07962_A5085CodCausa[0] ;
            n5085CodCausa = P07962_n5085CodCausa[0] ;
            A5196TipCorCod = P07962_A5196TipCorCod[0] ;
            n5196TipCorCod = P07962_n5196TipCorCod[0] ;
            A548HisEstReo = P07962_A548HisEstReo[0] ;
            n548HisEstReo = P07962_n548HisEstReo[0] ;
            A539HisBarCod = P07962_A539HisBarCod[0] ;
            A545HisCodReo = P07962_A545HisCodReo[0] ;
            A544HisCodPar = P07962_A544HisCodPar[0] ;
            A553HisNumPie = P07962_A553HisNumPie[0] ;
            n553HisNumPie = P07962_n553HisNumPie[0] ;
            A541HisBarMtr = P07962_A541HisBarMtr[0] ;
            n541HisBarMtr = P07962_n541HisBarMtr[0] ;
            A540HisBarKgm = P07962_A540HisBarKgm[0] ;
            n540HisBarKgm = P07962_n540HisBarKgm[0] ;
            A2299HisReoDsc = P07962_A2299HisReoDsc[0] ;
            n2299HisReoDsc = P07962_n2299HisReoDsc[0] ;
            A542HisBarSer = P07962_A542HisBarSer[0] ;
            n542HisBarSer = P07962_n542HisBarSer[0] ;
            A279CliNom = P07962_A279CliNom[0] ;
            A252CliCod = P07962_A252CliCod[0] ;
            n252CliCod = P07962_n252CliCod[0] ;
            A834TipDefDsc = P07962_A834TipDefDsc[0] ;
            n834TipDefDsc = P07962_n834TipDefDsc[0] ;
            A5197TipCorDsc = P07962_A5197TipCorDsc[0] ;
            n5197TipCorDsc = P07962_n5197TipCorDsc[0] ;
            A5086DscCausa = P07962_A5086DscCausa[0] ;
            n5086DscCausa = P07962_n5086DscCausa[0] ;
            A5662HisAcCo = P07962_A5662HisAcCo[0] ;
            n5662HisAcCo = P07962_n5662HisAcCo[0] ;
            A5693HisAcCot = P07962_A5693HisAcCot[0] ;
            n5693HisAcCot = P07962_n5693HisAcCot[0] ;
            A5695HisAdEAcCt = P07962_A5695HisAdEAcCt[0] ;
            n5695HisAdEAcCt = P07962_n5695HisAdEAcCt[0] ;
            A5694HisAdEAcCo = P07962_A5694HisAdEAcCo[0] ;
            n5694HisAdEAcCo = P07962_n5694HisAdEAcCo[0] ;
            A279CliNom = P07962_A279CliNom[0] ;
            A834TipDefDsc = P07962_A834TipDefDsc[0] ;
            n834TipDefDsc = P07962_n834TipDefDsc[0] ;
            A5086DscCausa = P07962_A5086DscCausa[0] ;
            n5086DscCausa = P07962_n5086DscCausa[0] ;
            A5197TipCorDsc = P07962_A5197TipCorDsc[0] ;
            n5197TipCorDsc = P07962_n5197TipCorDsc[0] ;
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
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV23Martex == 1 )
            {
               h7960( false, 120) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FICHA DE NO CONFORMIDAD :", ""), 456, Gx_line+14, 657, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2297HisReoTn), "ZZZZZ9")), 677, Gx_line+14, 722, Gx_line+32, 2+256, 0, 0, 0) ;
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
               getPrinter().GxDrawText(httpContext.getMessage( "Impresión:", ""), 324, Gx_line+96, 388, Gx_line+111, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Usurcod, "@!")), 397, Gx_line+95, 464, Gx_line+112, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 471, Gx_line+95, 538, Gx_line+112, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17EmprNom, "")), 16, Gx_line+17, 205, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(16, Gx_line+60, 126, Gx_line+116, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "R2-PSC-8.3", ""), 34, Gx_line+69, 107, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Revisión G", ""), 34, Gx_line+92, 106, Gx_line+109, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+120) ;
               h7960( false, 133) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Composicion del Artículo", ""), 28, Gx_line+41, 195, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 28, Gx_line+68, 86, Gx_line+85, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hoja de Ruta", ""), 28, Gx_line+95, 114, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Dispo. Cliente", ""), 579, Gx_line+41, 672, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 473, Gx_line+67, 532, Gx_line+84, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 94, Gx_line+68, 145, Gx_line+86, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 148, Gx_line+68, 399, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A542HisBarSer, "")), 207, Gx_line+41, 341, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2299HisReoDsc, "")), 356, Gx_line+41, 574, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A539HisBarCod), "ZZZZZZZ9")), 126, Gx_line+95, 194, Gx_line+113, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A545HisCodReo), "9")), 205, Gx_line+95, 214, Gx_line+113, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A544HisCodPar, "")), 226, Gx_line+95, 235, Gx_line+113, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13BarDisNum, "")), 683, Gx_line+41, 751, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14BarNomCli, "")), 554, Gx_line+68, 663, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarNumCli), "ZZZZZ9")), 676, Gx_line+68, 727, Gx_line+86, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(23, Gx_line+31, 761, Gx_line+120, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A540HisBarKgm, "ZZZZZ9.99")), 506, Gx_line+95, 582, Gx_line+113, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A541HisBarMtr, "ZZZZZ9.99")), 623, Gx_line+95, 699, Gx_line+113, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 334, Gx_line+95, 394, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kg", ""), 594, Gx_line+95, 613, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Mt", ""), 710, Gx_line+95, 727, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "1º Identificación del Artículo", ""), 23, Gx_line+13, 210, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 451, Gx_line+95, 496, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A553HisNumPie), "ZZZ9")), 406, Gx_line+95, 440, Gx_line+113, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+133) ;
            }
            else
            {
               h7960( false, 120) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FICHA DE NO CONFORMIDAD :", ""), 456, Gx_line+14, 657, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2297HisReoTn), "ZZZZZ9")), 677, Gx_line+14, 722, Gx_line+32, 2+256, 0, 0, 0) ;
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
               getPrinter().GxDrawText(httpContext.getMessage( "Impresión:", ""), 324, Gx_line+96, 388, Gx_line+111, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Usurcod, "@!")), 397, Gx_line+95, 464, Gx_line+112, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 471, Gx_line+95, 538, Gx_line+112, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17EmprNom, "")), 16, Gx_line+17, 205, Gx_line+35, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+120) ;
               h7960( false, 133) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Composicion del Artículo", ""), 28, Gx_line+41, 195, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 28, Gx_line+68, 86, Gx_line+85, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hoja de Ruta", ""), 28, Gx_line+95, 114, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Dispo. Cliente", ""), 248, Gx_line+95, 341, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 473, Gx_line+67, 532, Gx_line+84, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 94, Gx_line+68, 145, Gx_line+86, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 148, Gx_line+68, 399, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A542HisBarSer, "")), 270, Gx_line+41, 404, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2299HisReoDsc, "")), 419, Gx_line+41, 637, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A539HisBarCod), "ZZZZZZZ9")), 126, Gx_line+95, 194, Gx_line+113, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A545HisCodReo), "9")), 205, Gx_line+95, 214, Gx_line+113, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A544HisCodPar, "")), 226, Gx_line+95, 235, Gx_line+113, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13BarDisNum, "")), 352, Gx_line+95, 420, Gx_line+113, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14BarNomCli, "")), 554, Gx_line+68, 663, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarNumCli), "ZZZZZ9")), 676, Gx_line+68, 727, Gx_line+86, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "1º Identificación del Artículo", ""), 23, Gx_line+13, 210, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(23, Gx_line+31, 761, Gx_line+120, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A540HisBarKgm, "ZZZZZ9.99")), 505, Gx_line+95, 581, Gx_line+113, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A541HisBarMtr, "ZZZZZ9.99")), 623, Gx_line+95, 699, Gx_line+113, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 431, Gx_line+95, 491, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kg", ""), 593, Gx_line+95, 612, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Mt", ""), 710, Gx_line+95, 727, Gx_line+112, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+133) ;
            }
            h7960( false, 122) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción de No Conformidad :", ""), 28, Gx_line+32, 247, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A834TipDefDsc, "")), 285, Gx_line+32, 535, Gx_line+49, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(23, Gx_line+27, 761, Gx_line+120, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "2º Identificación de No Conformidad", ""), 23, Gx_line+7, 263, Gx_line+24, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+122) ;
            if ( AV23Martex == 1 )
            {
               h7960( false, 117) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "3º Corrección", ""), 23, Gx_line+0, 113, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(23, Gx_line+17, 761, Gx_line+110, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 602, Gx_line+81, 648, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Responsable:", ""), 379, Gx_line+80, 479, Gx_line+97, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(488, Gx_line+96, 582, Gx_line+96, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText("___/___/___", 656, Gx_line+80, 731, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Correccion:", ""), 28, Gx_line+42, 105, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5197TipCorDsc, "")), 193, Gx_line+42, 694, Gx_line+60, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+117) ;
            }
            else
            {
               h7960( false, 140) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "3º Corrección", ""), 23, Gx_line+4, 113, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Causas / Origen:", ""), 28, Gx_line+32, 137, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(23, Gx_line+24, 761, Gx_line+133, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5086DscCausa, "")), 193, Gx_line+32, 694, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 600, Gx_line+105, 646, Gx_line+122, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Responsable:", ""), 377, Gx_line+104, 477, Gx_line+121, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(485, Gx_line+120, 579, Gx_line+120, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText("___/___/___", 654, Gx_line+104, 729, Gx_line+121, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Correccion:", ""), 28, Gx_line+66, 105, Gx_line+83, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5197TipCorDsc, "")), 193, Gx_line+66, 694, Gx_line+84, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+140) ;
            }
            AV19Accion = A5662HisAcCo ;
            AV20AccionT = A5693HisAcCot ;
            if ( AV23Martex == 1 )
            {
            }
            else
            {
               h7960( false, 202) ;
               getPrinter().GxDrawRect(23, Gx_line+22, 761, Gx_line+194, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "4º Acciones Correctivas y Seguimiento", ""), 23, Gx_line+2, 278, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(AV19Accion, 30, Gx_line+32, 743, Gx_line+92, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 608, Gx_line+172, 654, Gx_line+189, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Responsable:", ""), 385, Gx_line+171, 485, Gx_line+188, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(494, Gx_line+186, 588, Gx_line+186, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText("___/___/___", 663, Gx_line+171, 738, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20AccionT, "")), 30, Gx_line+101, 743, Gx_line+161, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+202) ;
            }
            AV21HisAdEAcCt = A5695HisAdEAcCt ;
            AV22HisAdEAcCo = A5694HisAdEAcCo ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( AV23Martex == 1 )
         {
            h7960( false, 183) ;
            getPrinter().GxDrawRect(23, Gx_line+17, 761, Gx_line+180, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 23, Gx_line+0, 121, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 626, Gx_line+154, 672, Gx_line+171, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsable:", ""), 403, Gx_line+153, 503, Gx_line+170, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(511, Gx_line+169, 605, Gx_line+169, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("___/___/___", 680, Gx_line+153, 755, Gx_line+170, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22HisAdEAcCo, "")), 32, Gx_line+22, 745, Gx_line+82, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21HisAdEAcCt, "")), 32, Gx_line+88, 745, Gx_line+148, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+183) ;
         }
         else
         {
            h7960( false, 188) ;
            getPrinter().GxDrawRect(23, Gx_line+17, 761, Gx_line+180, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "5º Seguimiento / Analisis Eficacia", ""), 23, Gx_line+0, 245, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 624, Gx_line+154, 670, Gx_line+171, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsable:", ""), 401, Gx_line+153, 501, Gx_line+170, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(509, Gx_line+169, 603, Gx_line+169, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("___/___/___", 678, Gx_line+153, 753, Gx_line+170, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22HisAdEAcCo, "")), 30, Gx_line+22, 743, Gx_line+82, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21HisAdEAcCt, "")), 30, Gx_line+88, 743, Gx_line+148, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+188) ;
         }
         /* Eject command */
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(P_lines+1) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7960( true, 0) ;
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
      /* Using cursor P07963 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodreo), AV12BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P07963_A130BarCodPar[0] ;
         A132BarCodReo = P07963_A132BarCodReo[0] ;
         A129BarCod = P07963_A129BarCod[0] ;
         A143BarDisNum = P07963_A143BarDisNum[0] ;
         A1235BarNumCli = P07963_A1235BarNumCli[0] ;
         A1234BarNomCli = P07963_A1234BarNomCli[0] ;
         A135BarColNom = P07963_A135BarColNom[0] ;
         A136BarColNum = P07963_A136BarColNum[0] ;
         AV13BarDisNum = A143BarDisNum ;
         if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) || ! (0==A1235BarNumCli) )
         {
            AV14BarNomCli = A1234BarNomCli ;
            AV15BarNumCli = A1235BarNumCli ;
         }
         else
         {
            AV14BarNomCli = A135BarColNom ;
            AV15BarNumCli = A136BarColNum ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void h7960( boolean bFoot ,
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
               getPrinter().GxDrawText(httpContext.getMessage( "PROCESADO POR ORDENADOR", ""), 596, Gx_line+15, 749, Gx_line+29, 0+256, 0, 0, 0) ;
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
      this.aP0[0] = rncic00.this.A396EmprCod;
      this.aP1[0] = rncic00.this.A2297HisReoTn;
      this.aP2[0] = rncic00.this.Gx_out;
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
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P07962_A833TipDefCod = new short[1] ;
      P07962_A5085CodCausa = new short[1] ;
      P07962_n5085CodCausa = new boolean[] {false} ;
      P07962_A5196TipCorCod = new short[1] ;
      P07962_n5196TipCorCod = new boolean[] {false} ;
      P07962_A396EmprCod = new String[] {""} ;
      P07962_A2297HisReoTn = new int[1] ;
      P07962_n2297HisReoTn = new boolean[] {false} ;
      P07962_A548HisEstReo = new byte[1] ;
      P07962_n548HisEstReo = new boolean[] {false} ;
      P07962_A539HisBarCod = new int[1] ;
      P07962_A545HisCodReo = new byte[1] ;
      P07962_A544HisCodPar = new String[] {""} ;
      P07962_A553HisNumPie = new short[1] ;
      P07962_n553HisNumPie = new boolean[] {false} ;
      P07962_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07962_n541HisBarMtr = new boolean[] {false} ;
      P07962_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07962_n540HisBarKgm = new boolean[] {false} ;
      P07962_A2299HisReoDsc = new String[] {""} ;
      P07962_n2299HisReoDsc = new boolean[] {false} ;
      P07962_A542HisBarSer = new String[] {""} ;
      P07962_n542HisBarSer = new boolean[] {false} ;
      P07962_A279CliNom = new String[] {""} ;
      P07962_A252CliCod = new int[1] ;
      P07962_n252CliCod = new boolean[] {false} ;
      P07962_A834TipDefDsc = new String[] {""} ;
      P07962_n834TipDefDsc = new boolean[] {false} ;
      P07962_A5197TipCorDsc = new String[] {""} ;
      P07962_n5197TipCorDsc = new boolean[] {false} ;
      P07962_A5086DscCausa = new String[] {""} ;
      P07962_n5086DscCausa = new boolean[] {false} ;
      P07962_A5662HisAcCo = new String[] {""} ;
      P07962_n5662HisAcCo = new boolean[] {false} ;
      P07962_A5693HisAcCot = new String[] {""} ;
      P07962_n5693HisAcCot = new boolean[] {false} ;
      P07962_A5695HisAdEAcCt = new String[] {""} ;
      P07962_n5695HisAdEAcCt = new boolean[] {false} ;
      P07962_A5694HisAdEAcCo = new String[] {""} ;
      P07962_n5694HisAdEAcCo = new boolean[] {false} ;
      A544HisCodPar = "" ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A2299HisReoDsc = "" ;
      A542HisBarSer = "" ;
      A279CliNom = "" ;
      A834TipDefDsc = "" ;
      A5197TipCorDsc = "" ;
      A5086DscCausa = "" ;
      A5662HisAcCo = "" ;
      A5693HisAcCot = "" ;
      A5695HisAdEAcCt = "" ;
      A5694HisAdEAcCo = "" ;
      AV12BarCodPar = "" ;
      Gx_date = GXutil.nullDate() ;
      AV13BarDisNum = "" ;
      AV14BarNomCli = "" ;
      AV19Accion = "" ;
      AV20AccionT = "" ;
      AV21HisAdEAcCt = "" ;
      AV22HisAdEAcCo = "" ;
      P07963_A396EmprCod = new String[] {""} ;
      P07963_A130BarCodPar = new String[] {""} ;
      P07963_A132BarCodReo = new byte[1] ;
      P07963_A129BarCod = new int[1] ;
      P07963_A143BarDisNum = new String[] {""} ;
      P07963_A1235BarNumCli = new int[1] ;
      P07963_A1234BarNomCli = new String[] {""} ;
      P07963_A135BarColNom = new String[] {""} ;
      P07963_A136BarColNum = new int[1] ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rncic00__default(),
         new Object[] {
             new Object[] {
            P07962_A833TipDefCod, P07962_A5085CodCausa, P07962_n5085CodCausa, P07962_A5196TipCorCod, P07962_n5196TipCorCod, P07962_A396EmprCod, P07962_A2297HisReoTn, P07962_n2297HisReoTn, P07962_A548HisEstReo, P07962_n548HisEstReo,
            P07962_A539HisBarCod, P07962_A545HisCodReo, P07962_A544HisCodPar, P07962_A553HisNumPie, P07962_n553HisNumPie, P07962_A541HisBarMtr, P07962_n541HisBarMtr, P07962_A540HisBarKgm, P07962_n540HisBarKgm, P07962_A2299HisReoDsc,
            P07962_n2299HisReoDsc, P07962_A542HisBarSer, P07962_n542HisBarSer, P07962_A279CliNom, P07962_A252CliCod, P07962_n252CliCod, P07962_A834TipDefDsc, P07962_n834TipDefDsc, P07962_A5197TipCorDsc, P07962_n5197TipCorDsc,
            P07962_A5086DscCausa, P07962_n5086DscCausa, P07962_A5662HisAcCo, P07962_n5662HisAcCo, P07962_A5693HisAcCot, P07962_n5693HisAcCot, P07962_A5695HisAdEAcCt, P07962_n5695HisAdEAcCt, P07962_A5694HisAdEAcCo, P07962_n5694HisAdEAcCo
            }
            , new Object[] {
            P07963_A396EmprCod, P07963_A130BarCodPar, P07963_A132BarCodReo, P07963_A129BarCod, P07963_A143BarDisNum, P07963_A1235BarNumCli, P07963_A1234BarNomCli, P07963_A135BarColNom, P07963_A136BarColNum
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV23Martex ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A548HisEstReo ;
   private byte A545HisCodReo ;
   private byte AV11BarCodreo ;
   private byte A132BarCodReo ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A5196TipCorCod ;
   private short A553HisNumPie ;
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
   private int A136BarColNum ;
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
   private String A2299HisReoDsc ;
   private String A542HisBarSer ;
   private String A279CliNom ;
   private String A834TipDefDsc ;
   private String A5197TipCorDsc ;
   private String A5086DscCausa ;
   private String AV12BarCodPar ;
   private String AV13BarDisNum ;
   private String AV14BarNomCli ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private java.util.Date Gx_date ;
   private boolean n2297HisReoTn ;
   private boolean n5085CodCausa ;
   private boolean n5196TipCorCod ;
   private boolean n548HisEstReo ;
   private boolean n553HisNumPie ;
   private boolean n541HisBarMtr ;
   private boolean n540HisBarKgm ;
   private boolean n2299HisReoDsc ;
   private boolean n542HisBarSer ;
   private boolean n252CliCod ;
   private boolean n834TipDefDsc ;
   private boolean n5197TipCorDsc ;
   private boolean n5086DscCausa ;
   private boolean n5662HisAcCo ;
   private boolean n5693HisAcCot ;
   private boolean n5695HisAdEAcCt ;
   private boolean n5694HisAdEAcCo ;
   private boolean returnInSub ;
   private String AV19Accion ;
   private String A5662HisAcCo ;
   private String A5693HisAcCot ;
   private String A5695HisAdEAcCt ;
   private String A5694HisAdEAcCo ;
   private String AV20AccionT ;
   private String AV21HisAdEAcCt ;
   private String AV22HisAdEAcCo ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P07962_A833TipDefCod ;
   private short[] P07962_A5085CodCausa ;
   private boolean[] P07962_n5085CodCausa ;
   private short[] P07962_A5196TipCorCod ;
   private boolean[] P07962_n5196TipCorCod ;
   private String[] P07962_A396EmprCod ;
   private int[] P07962_A2297HisReoTn ;
   private boolean[] P07962_n2297HisReoTn ;
   private byte[] P07962_A548HisEstReo ;
   private boolean[] P07962_n548HisEstReo ;
   private int[] P07962_A539HisBarCod ;
   private byte[] P07962_A545HisCodReo ;
   private String[] P07962_A544HisCodPar ;
   private short[] P07962_A553HisNumPie ;
   private boolean[] P07962_n553HisNumPie ;
   private java.math.BigDecimal[] P07962_A541HisBarMtr ;
   private boolean[] P07962_n541HisBarMtr ;
   private java.math.BigDecimal[] P07962_A540HisBarKgm ;
   private boolean[] P07962_n540HisBarKgm ;
   private String[] P07962_A2299HisReoDsc ;
   private boolean[] P07962_n2299HisReoDsc ;
   private String[] P07962_A542HisBarSer ;
   private boolean[] P07962_n542HisBarSer ;
   private String[] P07962_A279CliNom ;
   private int[] P07962_A252CliCod ;
   private boolean[] P07962_n252CliCod ;
   private String[] P07962_A834TipDefDsc ;
   private boolean[] P07962_n834TipDefDsc ;
   private String[] P07962_A5197TipCorDsc ;
   private boolean[] P07962_n5197TipCorDsc ;
   private String[] P07962_A5086DscCausa ;
   private boolean[] P07962_n5086DscCausa ;
   private String[] P07962_A5662HisAcCo ;
   private boolean[] P07962_n5662HisAcCo ;
   private String[] P07962_A5693HisAcCot ;
   private boolean[] P07962_n5693HisAcCot ;
   private String[] P07962_A5695HisAdEAcCt ;
   private boolean[] P07962_n5695HisAdEAcCt ;
   private String[] P07962_A5694HisAdEAcCo ;
   private boolean[] P07962_n5694HisAdEAcCo ;
   private String[] P07963_A396EmprCod ;
   private String[] P07963_A130BarCodPar ;
   private byte[] P07963_A132BarCodReo ;
   private int[] P07963_A129BarCod ;
   private String[] P07963_A143BarDisNum ;
   private int[] P07963_A1235BarNumCli ;
   private String[] P07963_A1234BarNomCli ;
   private String[] P07963_A135BarColNom ;
   private int[] P07963_A136BarColNum ;
}

final  class rncic00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07962", "SELECT T1.TipDefCod, T1.CodCausa, T1.TipCorCod, T1.EmprCod, T1.HisReoTn, T1.HisEstReo, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar, T1.HisNumPie, T1.HisBarMtr, T1.HisBarKgm, T1.HisReoDsc, T1.HisBarSer, T2.CliNom, T1.CliCod, T3.TipDefDsc, T5.TipCorDsc, T4.DscCausa, T1.HisAcCo, T1.HisAcCot, T1.HisAdEAcCt, T1.HisAdEAcCo FROM ((((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPDEF T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T4 ON T4.EmprCod = T1.EmprCod AND T4.CodCausa = T1.CodCausa) LEFT JOIN TXPCORTIP T5 ON T5.EmprCod = T1.EmprCod AND T5.TipCorCod = T1.TipCorCod) WHERE (T1.EmprCod = ? and T1.HisReoTn = ?) AND (T1.HisEstReo = 1) ORDER BY T1.EmprCod, T1.HisReoTn ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07963", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarDisNum, BarNumCli, BarNomCli, BarColNom, BarColNum FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
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
               ((String[]) buf[26])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(18, 60);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(19, 60);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(22);
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
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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

