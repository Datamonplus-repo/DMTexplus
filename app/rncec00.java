package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rncec00 extends GXReport
{
   public rncec00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rncec00.class ), "" );
   }

   public rncec00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      rncec00.this.aP2 = new String[] {""};
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
      rncec00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rncec00.this.A2297HisReoTn = aP1[0];
      this.aP1 = aP1;
      rncec00.this.Gx_out = aP2[0];
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
         getPrinter().GxSetDocName("NOTA NO CONFORMIDAD,EXT.Spain") ;
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
         rncec00.this.GXt_char1 = GXv_char2[0] ;
         AV16Station = GXt_char1 ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = AV17EmprNom ;
         GXv_char4[0] = AV9Usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
         rncec00.this.A396EmprCod = GXv_char2[0] ;
         rncec00.this.AV17EmprNom = GXv_char3[0] ;
         rncec00.this.AV9Usurcod = GXv_char4[0] ;
         GXv_char4[0] = AV20ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOTREC", ""), GXv_char4) ;
         rncec00.this.AV20ContDsc = GXv_char4[0] ;
         AV18i = (short)(1) ;
         GX_I = 1 ;
         while ( GX_I <= 10 )
         {
            AV19Tab_def[GX_I-1] = GXutil.space( (short)(30)) ;
            GX_I = (int)(GX_I+1) ;
         }
         /* Using cursor P07952 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5198Nr_codigo = P07952_A5198Nr_codigo[0] ;
            A834TipDefDsc = P07952_A834TipDefDsc[0] ;
            n834TipDefDsc = P07952_n834TipDefDsc[0] ;
            A833TipDefCod = P07952_A833TipDefCod[0] ;
            A834TipDefDsc = P07952_A834TipDefDsc[0] ;
            n834TipDefDsc = P07952_n834TipDefDsc[0] ;
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
         /* Using cursor P07953 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A833TipDefCod = P07953_A833TipDefCod[0] ;
            A5085CodCausa = P07953_A5085CodCausa[0] ;
            n5085CodCausa = P07953_n5085CodCausa[0] ;
            A548HisEstReo = P07953_A548HisEstReo[0] ;
            n548HisEstReo = P07953_n548HisEstReo[0] ;
            A5356Hisoperar = P07953_A5356Hisoperar[0] ;
            n5356Hisoperar = P07953_n5356Hisoperar[0] ;
            A539HisBarCod = P07953_A539HisBarCod[0] ;
            A545HisCodReo = P07953_A545HisCodReo[0] ;
            A544HisCodPar = P07953_A544HisCodPar[0] ;
            A407EmprNom = P07953_A407EmprNom[0] ;
            n407EmprNom = P07953_n407EmprNom[0] ;
            A540HisBarKgm = P07953_A540HisBarKgm[0] ;
            n540HisBarKgm = P07953_n540HisBarKgm[0] ;
            A2299HisReoDsc = P07953_A2299HisReoDsc[0] ;
            n2299HisReoDsc = P07953_n2299HisReoDsc[0] ;
            A542HisBarSer = P07953_A542HisBarSer[0] ;
            n542HisBarSer = P07953_n542HisBarSer[0] ;
            A279CliNom = P07953_A279CliNom[0] ;
            A252CliCod = P07953_A252CliCod[0] ;
            n252CliCod = P07953_n252CliCod[0] ;
            A5086DscCausa = P07953_A5086DscCausa[0] ;
            n5086DscCausa = P07953_n5086DscCausa[0] ;
            A834TipDefDsc = P07953_A834TipDefDsc[0] ;
            n834TipDefDsc = P07953_n834TipDefDsc[0] ;
            A407EmprNom = P07953_A407EmprNom[0] ;
            n407EmprNom = P07953_n407EmprNom[0] ;
            A279CliNom = P07953_A279CliNom[0] ;
            A834TipDefDsc = P07953_A834TipDefDsc[0] ;
            n834TipDefDsc = P07953_n834TipDefDsc[0] ;
            A5086DscCausa = P07953_A5086DscCausa[0] ;
            n5086DscCausa = P07953_n5086DscCausa[0] ;
            AV10BarCod = A539HisBarCod ;
            AV11BarCodreo = A545HisCodReo ;
            AV12BarCodPar = A544HisCodPar ;
            AV36OpeNom = "" ;
            /* Using cursor P07954 */
            pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n5356Hisoperar), Integer.valueOf(A5356Hisoperar)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A652OpeCod = P07954_A652OpeCod[0] ;
               A653OpeNom = P07954_A653OpeNom[0] ;
               n653OpeNom = P07954_n653OpeNom[0] ;
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
               AV31Resp = GXutil.substring( AV17EmprNom, 1, 15) ;
            }
            if ( AV30NR_RESPTEC == 1 )
            {
               AV31Resp = httpContext.getMessage( "CLIENTE", "") ;
            }
            if ( GXutil.strcmp(AV32Nr_comerc, httpContext.getMessage( "S", "")) == 0 )
            {
               AV34Acc_com = httpContext.getMessage( "CON CARGO AL CLIENTE", "") ;
            }
            if ( GXutil.strcmp(AV32Nr_comerc, httpContext.getMessage( "N", "")) == 0 )
            {
               AV34Acc_com = httpContext.getMessage( "SIN CARGO AL CLIENTE", "") ;
            }
            if ( GXutil.strcmp(AV32Nr_comerc, httpContext.getMessage( "A", "")) == 0 )
            {
               AV34Acc_com = httpContext.getMessage( "A DECIDIR..", "") ;
            }
            AV35Com_com = AV33Nr_obscom ;
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
            GX_I = 1 ;
            while ( GX_I <= 4 )
            {
               AV23ObsTec[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV18i = (short)(1) ;
            /* Using cursor P07955 */
            pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A5198Nr_codigo = P07955_A5198Nr_codigo[0] ;
               A5218Nr_obstec = P07955_A5218Nr_obstec[0] ;
               n5218Nr_obstec = P07955_n5218Nr_obstec[0] ;
               A5228Nr_linTec = P07955_A5228Nr_linTec[0] ;
               if ( AV18i <= 4 )
               {
                  AV23ObsTec[AV18i-1] = A5218Nr_obstec ;
               }
               AV18i = (short)(AV18i+1) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            GX_I = 1 ;
            while ( GX_I <= 4 )
            {
               AV24ObsTra[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV18i = (short)(1) ;
            /* Using cursor P07956 */
            pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A5198Nr_codigo = P07956_A5198Nr_codigo[0] ;
               A5219Nr_obstra = P07956_A5219Nr_obstra[0] ;
               n5219Nr_obstra = P07956_n5219Nr_obstra[0] ;
               A5230Nr_linTre = P07956_A5230Nr_linTre[0] ;
               if ( AV18i <= 4 )
               {
                  AV24ObsTra[AV18i-1] = A5219Nr_obstra ;
               }
               AV18i = (short)(AV18i+1) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            h7950( false, 119) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FICHA DE RECLAMACION Nº.", ""), 466, Gx_line+20, 656, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2297HisReoTn), "ZZZZZ9")), 663, Gx_line+20, 708, Gx_line+38, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 535, Gx_line+92, 593, Gx_line+109, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 603, Gx_line+93, 642, Gx_line+109, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 648, Gx_line+92, 665, Gx_line+109, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 671, Gx_line+93, 720, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(298, Gx_line+4, 759, Gx_line+113, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Impresión:", ""), 304, Gx_line+93, 368, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Usurcod, "@!")), 377, Gx_line+92, 444, Gx_line+109, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 451, Gx_line+92, 518, Gx_line+109, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 17, Gx_line+9, 206, Gx_line+27, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+119) ;
            h7950( false, 106) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Composición del Artículo", ""), 30, Gx_line+33, 263, Gx_line+50, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+60, 88, Gx_line+77, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hoja de  Ruta", ""), 30, Gx_line+88, 121, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Disp. Cliente", ""), 315, Gx_line+88, 399, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 450, Gx_line+60, 542, Gx_line+77, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cantidad (Kg)", ""), 563, Gx_line+88, 654, Gx_line+105, 0+256, 0, 0, 0) ;
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
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "1º Identificación Reclamación", ""), 22, Gx_line+0, 220, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(22, Gx_line+20, 22, Gx_line+106, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(22, Gx_line+20, 760, Gx_line+20, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(758, Gx_line+20, 758, Gx_line+106, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+106) ;
            if ( ! (0==AV21AlbRecCod) )
            {
               h7950( false, 29) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lote Nº ", ""), 568, Gx_line+7, 621, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21AlbRecCod), "ZZZZZZZ9")), 682, Gx_line+7, 750, Gx_line+25, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Orden Servicio Anterior", ""), 30, Gx_line+6, 187, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26NR_BARCODA), "ZZZZZZZ9")), 208, Gx_line+6, 276, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28NR_BARPARA, "")), 298, Gx_line+6, 307, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27NR_BARREOA), "9")), 281, Gx_line+6, 290, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(22, Gx_line+0, 22, Gx_line+29, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(758, Gx_line+0, 758, Gx_line+29, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+29) ;
            }
            else
            {
               h7950( false, 29) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Partido Nº", ""), 535, Gx_line+6, 603, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Orden Servicio Anterior", ""), 30, Gx_line+6, 187, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26NR_BARCODA), "ZZZZZZZ9")), 208, Gx_line+6, 276, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28NR_BARPARA, "")), 298, Gx_line+6, 307, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27NR_BARREOA), "9")), 281, Gx_line+6, 290, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(22, Gx_line+0, 22, Gx_line+29, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(758, Gx_line+0, 758, Gx_line+29, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37PartCod, "")), 616, Gx_line+6, 750, Gx_line+24, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+29) ;
            }
            h7950( false, 101) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Defecto apuntado por el cliente:", ""), 30, Gx_line+2, 244, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_def[1-1], "")), 249, Gx_line+4, 500, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_def[2-1], "")), 249, Gx_line+25, 500, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_def[3-1], "")), 249, Gx_line+46, 500, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 624, Gx_line+74, 676, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsable:", ""), 414, Gx_line+74, 514, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(525, Gx_line+90, 619, Gx_line+90, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("___/___/___", 676, Gx_line+74, 751, Gx_line+91, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(22, Gx_line+0, 22, Gx_line+96, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(22, Gx_line+95, 760, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(758, Gx_line+0, 758, Gx_line+96, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+101) ;
            h7950( false, 429) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "2º Análisis Técnica", ""), 22, Gx_line+0, 147, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(22, Gx_line+18, 760, Gx_line+425, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Análisis Técnica:", ""), 32, Gx_line+76, 136, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 625, Gx_line+402, 671, Gx_line+419, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsable:", ""), 422, Gx_line+402, 522, Gx_line+419, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("___/___/___", 677, Gx_line+402, 752, Gx_line+419, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Corrección/Acción Correctiva (Seguimiento):", ""), 32, Gx_line+186, 299, Gx_line+203, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[1-1], "")), 32, Gx_line+98, 533, Gx_line+116, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[2-1], "")), 32, Gx_line+117, 533, Gx_line+135, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[3-1], "")), 32, Gx_line+135, 533, Gx_line+153, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ObsTec[4-1], "")), 32, Gx_line+154, 533, Gx_line+172, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[1-1], "")), 32, Gx_line+205, 533, Gx_line+223, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[2-1], "")), 32, Gx_line+225, 533, Gx_line+243, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[3-1], "")), 32, Gx_line+245, 533, Gx_line+263, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[4-1], "")), 32, Gx_line+265, 533, Gx_line+283, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsabilidad de :", ""), 32, Gx_line+299, 159, Gx_line+316, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Comentarios:", ""), 32, Gx_line+315, 121, Gx_line+332, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(AV29Nr_obsrt, 32, Gx_line+333, 745, Gx_line+386, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Resp, "")), 172, Gx_line+299, 298, Gx_line+317, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Defecto Identificado:", ""), 32, Gx_line+28, 155, Gx_line+45, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A834TipDefDsc, "")), 159, Gx_line+28, 410, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(22, Gx_line+179, 760, Gx_line+179, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(22, Gx_line+290, 760, Gx_line+290, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Causa:", ""), 32, Gx_line+49, 76, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5086DscCausa, "")), 159, Gx_line+49, 660, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(526, Gx_line+418, 620, Gx_line+418, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36OpeNom, "")), 91, Gx_line+404, 342, Gx_line+422, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(22, Gx_line+400, 399, Gx_line+425, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+429) ;
            h7950( false, 226) ;
            getPrinter().GxDrawRect(22, Gx_line+25, 760, Gx_line+211, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "3º Decisión Comercial", ""), 22, Gx_line+5, 168, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 624, Gx_line+191, 671, Gx_line+208, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsable:", ""), 414, Gx_line+191, 514, Gx_line+208, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(520, Gx_line+206, 614, Gx_line+206, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("___/___/___", 676, Gx_line+191, 751, Gx_line+208, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Acc_com, "")), 34, Gx_line+30, 202, Gx_line+48, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Comentarios:", ""), 34, Gx_line+49, 123, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(AV35Com_com, 34, Gx_line+67, 751, Gx_line+141, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+226) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7950( true, 0) ;
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
      /* Using cursor P07957 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodreo), AV12BarCodPar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A361DisCod = P07957_A361DisCod[0] ;
         A130BarCodPar = P07957_A130BarCodPar[0] ;
         A132BarCodReo = P07957_A132BarCodReo[0] ;
         A129BarCod = P07957_A129BarCod[0] ;
         A143BarDisNum = P07957_A143BarDisNum[0] ;
         A1234BarNomCli = P07957_A1234BarNomCli[0] ;
         A1235BarNumCli = P07957_A1235BarNumCli[0] ;
         A966PartCod = P07957_A966PartCod[0] ;
         n966PartCod = P07957_n966PartCod[0] ;
         A252CliCod = P07957_A252CliCod[0] ;
         n252CliCod = P07957_n252CliCod[0] ;
         A966PartCod = P07957_A966PartCod[0] ;
         n966PartCod = P07957_n966PartCod[0] ;
         AV13BarDisNum = A143BarDisNum ;
         AV14BarNomCli = A1234BarNomCli ;
         AV15BarNumCli = A1235BarNumCli ;
         AV37PartCod = A966PartCod ;
         AV38CliCod = A252CliCod ;
         /* Using cursor P07958 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A44AlbRecCod = P07958_A44AlbRecCod[0] ;
            A200BarPieCod = P07958_A200BarPieCod[0] ;
            AV21AlbRecCod = A44AlbRecCod ;
            if ( ! (0==AV21AlbRecCod) )
            {
               /* Using cursor P07959 */
               pr_default.execute(7, new Object[] {Integer.valueOf(AV21AlbRecCod), A396EmprCod});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A5206Nr_albrecc = P07959_A5206Nr_albrecc[0] ;
                  n5206Nr_albrecc = P07959_n5206Nr_albrecc[0] ;
                  A5198Nr_codigo = P07959_A5198Nr_codigo[0] ;
                  AV22Nr_codigo = A5198Nr_codigo ;
                  pr_default.readNext(7);
               }
               pr_default.close(7);
            }
            pr_default.readNext(6);
         }
         pr_default.close(6);
         if ( ! (GXutil.strcmp("", AV37PartCod)==0) )
         {
            AV22Nr_codigo = 0 ;
            /* Using cursor P079510 */
            pr_default.execute(8, new Object[] {AV37PartCod, Integer.valueOf(AV38CliCod), A396EmprCod});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A7090Nr_PartCod = P079510_A7090Nr_PartCod[0] ;
               n7090Nr_PartCod = P079510_n7090Nr_PartCod[0] ;
               A5340Nr_CliCod = P079510_A5340Nr_CliCod[0] ;
               n5340Nr_CliCod = P079510_n5340Nr_CliCod[0] ;
               A5198Nr_codigo = P079510_A5198Nr_codigo[0] ;
               AV22Nr_codigo = A5198Nr_codigo ;
               pr_default.readNext(8);
            }
            pr_default.close(8);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
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
      /* Using cursor P079511 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV25HisreoTn)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A5631Nr_ObsRT = P079511_A5631Nr_ObsRT[0] ;
         n5631Nr_ObsRT = P079511_n5631Nr_ObsRT[0] ;
         A5198Nr_codigo = P079511_A5198Nr_codigo[0] ;
         A5222Nr_barcoda = P079511_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P079511_n5222Nr_barcoda[0] ;
         A5223Nr_barreoa = P079511_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P079511_n5223Nr_barreoa[0] ;
         A5224Nr_barpara = P079511_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P079511_n5224Nr_barpara[0] ;
         A5630Nr_RespTec = P079511_A5630Nr_RespTec[0] ;
         n5630Nr_RespTec = P079511_n5630Nr_RespTec[0] ;
         A5628Nr_comerc = P079511_A5628Nr_comerc[0] ;
         n5628Nr_comerc = P079511_n5628Nr_comerc[0] ;
         A5629Nr_obscom = P079511_A5629Nr_obscom[0] ;
         n5629Nr_obscom = P079511_n5629Nr_obscom[0] ;
         AV26NR_BARCODA = A5222Nr_barcoda ;
         AV27NR_BARREOA = A5223Nr_barreoa ;
         AV28NR_BARPARA = A5224Nr_barpara ;
         AV29Nr_obsrt = A5631Nr_ObsRT ;
         AV30NR_RESPTEC = A5630Nr_RespTec ;
         AV32Nr_comerc = A5628Nr_comerc ;
         AV33Nr_obscom = A5629Nr_obscom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void h7950( boolean bFoot ,
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
      this.aP0[0] = rncec00.this.A396EmprCod;
      this.aP1[0] = rncec00.this.A2297HisReoTn;
      this.aP2[0] = rncec00.this.Gx_out;
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
      P07952_A396EmprCod = new String[] {""} ;
      P07952_A5198Nr_codigo = new int[1] ;
      P07952_A834TipDefDsc = new String[] {""} ;
      P07952_n834TipDefDsc = new boolean[] {false} ;
      P07952_A833TipDefCod = new short[1] ;
      A834TipDefDsc = "" ;
      P07953_A833TipDefCod = new short[1] ;
      P07953_A5085CodCausa = new short[1] ;
      P07953_n5085CodCausa = new boolean[] {false} ;
      P07953_A396EmprCod = new String[] {""} ;
      P07953_A2297HisReoTn = new int[1] ;
      P07953_n2297HisReoTn = new boolean[] {false} ;
      P07953_A548HisEstReo = new byte[1] ;
      P07953_n548HisEstReo = new boolean[] {false} ;
      P07953_A5356Hisoperar = new int[1] ;
      P07953_n5356Hisoperar = new boolean[] {false} ;
      P07953_A539HisBarCod = new int[1] ;
      P07953_A545HisCodReo = new byte[1] ;
      P07953_A544HisCodPar = new String[] {""} ;
      P07953_A407EmprNom = new String[] {""} ;
      P07953_n407EmprNom = new boolean[] {false} ;
      P07953_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07953_n540HisBarKgm = new boolean[] {false} ;
      P07953_A2299HisReoDsc = new String[] {""} ;
      P07953_n2299HisReoDsc = new boolean[] {false} ;
      P07953_A542HisBarSer = new String[] {""} ;
      P07953_n542HisBarSer = new boolean[] {false} ;
      P07953_A279CliNom = new String[] {""} ;
      P07953_A252CliCod = new int[1] ;
      P07953_n252CliCod = new boolean[] {false} ;
      P07953_A5086DscCausa = new String[] {""} ;
      P07953_n5086DscCausa = new boolean[] {false} ;
      P07953_A834TipDefDsc = new String[] {""} ;
      P07953_n834TipDefDsc = new boolean[] {false} ;
      A544HisCodPar = "" ;
      A407EmprNom = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A2299HisReoDsc = "" ;
      A542HisBarSer = "" ;
      A279CliNom = "" ;
      A5086DscCausa = "" ;
      AV12BarCodPar = "" ;
      AV36OpeNom = "" ;
      P07954_A396EmprCod = new String[] {""} ;
      P07954_A652OpeCod = new int[1] ;
      P07954_A653OpeNom = new String[] {""} ;
      P07954_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      AV31Resp = "" ;
      AV32Nr_comerc = "" ;
      AV34Acc_com = "" ;
      AV35Com_com = "" ;
      AV33Nr_obscom = "" ;
      AV23ObsTec = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV23ObsTec[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P07955_A396EmprCod = new String[] {""} ;
      P07955_A5198Nr_codigo = new int[1] ;
      P07955_A5218Nr_obstec = new String[] {""} ;
      P07955_n5218Nr_obstec = new boolean[] {false} ;
      P07955_A5228Nr_linTec = new short[1] ;
      A5218Nr_obstec = "" ;
      AV24ObsTra = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV24ObsTra[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P07956_A396EmprCod = new String[] {""} ;
      P07956_A5198Nr_codigo = new int[1] ;
      P07956_A5219Nr_obstra = new String[] {""} ;
      P07956_n5219Nr_obstra = new boolean[] {false} ;
      P07956_A5230Nr_linTre = new short[1] ;
      A5219Nr_obstra = "" ;
      Gx_date = GXutil.nullDate() ;
      AV13BarDisNum = "" ;
      AV14BarNomCli = "" ;
      AV28NR_BARPARA = "" ;
      AV37PartCod = "" ;
      AV29Nr_obsrt = "" ;
      P07957_A361DisCod = new int[1] ;
      P07957_A396EmprCod = new String[] {""} ;
      P07957_A130BarCodPar = new String[] {""} ;
      P07957_A132BarCodReo = new byte[1] ;
      P07957_A129BarCod = new int[1] ;
      P07957_A143BarDisNum = new String[] {""} ;
      P07957_A1234BarNomCli = new String[] {""} ;
      P07957_A1235BarNumCli = new int[1] ;
      P07957_A966PartCod = new String[] {""} ;
      P07957_n966PartCod = new boolean[] {false} ;
      P07957_A252CliCod = new int[1] ;
      P07957_n252CliCod = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A1234BarNomCli = "" ;
      A966PartCod = "" ;
      P07958_A396EmprCod = new String[] {""} ;
      P07958_A129BarCod = new int[1] ;
      P07958_A132BarCodReo = new byte[1] ;
      P07958_A130BarCodPar = new String[] {""} ;
      P07958_A44AlbRecCod = new int[1] ;
      P07958_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      P07959_A396EmprCod = new String[] {""} ;
      P07959_A5206Nr_albrecc = new int[1] ;
      P07959_n5206Nr_albrecc = new boolean[] {false} ;
      P07959_A5198Nr_codigo = new int[1] ;
      P079510_A396EmprCod = new String[] {""} ;
      P079510_A7090Nr_PartCod = new String[] {""} ;
      P079510_n7090Nr_PartCod = new boolean[] {false} ;
      P079510_A5340Nr_CliCod = new int[1] ;
      P079510_n5340Nr_CliCod = new boolean[] {false} ;
      P079510_A5198Nr_codigo = new int[1] ;
      A7090Nr_PartCod = "" ;
      P079511_A5631Nr_ObsRT = new String[] {""} ;
      P079511_n5631Nr_ObsRT = new boolean[] {false} ;
      P079511_A396EmprCod = new String[] {""} ;
      P079511_A5198Nr_codigo = new int[1] ;
      P079511_A5222Nr_barcoda = new int[1] ;
      P079511_n5222Nr_barcoda = new boolean[] {false} ;
      P079511_A5223Nr_barreoa = new byte[1] ;
      P079511_n5223Nr_barreoa = new boolean[] {false} ;
      P079511_A5224Nr_barpara = new String[] {""} ;
      P079511_n5224Nr_barpara = new boolean[] {false} ;
      P079511_A5630Nr_RespTec = new byte[1] ;
      P079511_n5630Nr_RespTec = new boolean[] {false} ;
      P079511_A5628Nr_comerc = new String[] {""} ;
      P079511_n5628Nr_comerc = new boolean[] {false} ;
      P079511_A5629Nr_obscom = new String[] {""} ;
      P079511_n5629Nr_obscom = new boolean[] {false} ;
      A5631Nr_ObsRT = "" ;
      A5224Nr_barpara = "" ;
      A5628Nr_comerc = "" ;
      A5629Nr_obscom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rncec00__default(),
         new Object[] {
             new Object[] {
            P07952_A396EmprCod, P07952_A5198Nr_codigo, P07952_A834TipDefDsc, P07952_n834TipDefDsc, P07952_A833TipDefCod
            }
            , new Object[] {
            P07953_A833TipDefCod, P07953_A5085CodCausa, P07953_n5085CodCausa, P07953_A396EmprCod, P07953_A2297HisReoTn, P07953_n2297HisReoTn, P07953_A548HisEstReo, P07953_n548HisEstReo, P07953_A5356Hisoperar, P07953_n5356Hisoperar,
            P07953_A539HisBarCod, P07953_A545HisCodReo, P07953_A544HisCodPar, P07953_A407EmprNom, P07953_n407EmprNom, P07953_A540HisBarKgm, P07953_n540HisBarKgm, P07953_A2299HisReoDsc, P07953_n2299HisReoDsc, P07953_A542HisBarSer,
            P07953_n542HisBarSer, P07953_A279CliNom, P07953_A252CliCod, P07953_n252CliCod, P07953_A5086DscCausa, P07953_n5086DscCausa, P07953_A834TipDefDsc, P07953_n834TipDefDsc
            }
            , new Object[] {
            P07954_A396EmprCod, P07954_A652OpeCod, P07954_A653OpeNom, P07954_n653OpeNom
            }
            , new Object[] {
            P07955_A396EmprCod, P07955_A5198Nr_codigo, P07955_A5218Nr_obstec, P07955_n5218Nr_obstec, P07955_A5228Nr_linTec
            }
            , new Object[] {
            P07956_A396EmprCod, P07956_A5198Nr_codigo, P07956_A5219Nr_obstra, P07956_n5219Nr_obstra, P07956_A5230Nr_linTre
            }
            , new Object[] {
            P07957_A361DisCod, P07957_A396EmprCod, P07957_A130BarCodPar, P07957_A132BarCodReo, P07957_A129BarCod, P07957_A143BarDisNum, P07957_A1234BarNomCli, P07957_A1235BarNumCli, P07957_A966PartCod, P07957_n966PartCod,
            P07957_A252CliCod, P07957_n252CliCod
            }
            , new Object[] {
            P07958_A396EmprCod, P07958_A129BarCod, P07958_A132BarCodReo, P07958_A130BarCodPar, P07958_A44AlbRecCod, P07958_A200BarPieCod
            }
            , new Object[] {
            P07959_A396EmprCod, P07959_A5206Nr_albrecc, P07959_n5206Nr_albrecc, P07959_A5198Nr_codigo
            }
            , new Object[] {
            P079510_A396EmprCod, P079510_A7090Nr_PartCod, P079510_n7090Nr_PartCod, P079510_A5340Nr_CliCod, P079510_n5340Nr_CliCod, P079510_A5198Nr_codigo
            }
            , new Object[] {
            P079511_A5631Nr_ObsRT, P079511_n5631Nr_ObsRT, P079511_A396EmprCod, P079511_A5198Nr_codigo, P079511_A5222Nr_barcoda, P079511_n5222Nr_barcoda, P079511_A5223Nr_barreoa, P079511_n5223Nr_barreoa, P079511_A5224Nr_barpara, P079511_n5224Nr_barpara,
            P079511_A5630Nr_RespTec, P079511_n5630Nr_RespTec, P079511_A5628Nr_comerc, P079511_n5628Nr_comerc, P079511_A5629Nr_obscom, P079511_n5629Nr_obscom
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
   private byte AV30NR_RESPTEC ;
   private byte AV27NR_BARREOA ;
   private byte A132BarCodReo ;
   private byte A5223Nr_barreoa ;
   private byte A5630Nr_RespTec ;
   private short AV18i ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A5228Nr_linTec ;
   private short A5230Nr_linTre ;
   private short Gx_err ;
   private int A2297HisReoTn ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GX_I ;
   private int A5198Nr_codigo ;
   private int A5356Hisoperar ;
   private int A539HisBarCod ;
   private int A252CliCod ;
   private int AV10BarCod ;
   private int A652OpeCod ;
   private int AV25HisreoTn ;
   private int Gx_OldLine ;
   private int AV15BarNumCli ;
   private int AV21AlbRecCod ;
   private int AV26NR_BARCODA ;
   private int AV22Nr_codigo ;
   private int A361DisCod ;
   private int A129BarCod ;
   private int A1235BarNumCli ;
   private int AV38CliCod ;
   private int A44AlbRecCod ;
   private int A5206Nr_albrecc ;
   private int A5340Nr_CliCod ;
   private int A5222Nr_barcoda ;
   private java.math.BigDecimal A540HisBarKgm ;
   private String A396EmprCod ;
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
   private String A544HisCodPar ;
   private String A407EmprNom ;
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
   private String AV23ObsTec[] ;
   private String A5218Nr_obstec ;
   private String AV24ObsTra[] ;
   private String A5219Nr_obstra ;
   private String AV13BarDisNum ;
   private String AV14BarNomCli ;
   private String AV28NR_BARPARA ;
   private String AV37PartCod ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A1234BarNomCli ;
   private String A966PartCod ;
   private String A200BarPieCod ;
   private String A7090Nr_PartCod ;
   private String A5224Nr_barpara ;
   private String A5628Nr_comerc ;
   private java.util.Date Gx_date ;
   private boolean n2297HisReoTn ;
   private boolean n834TipDefDsc ;
   private boolean n5085CodCausa ;
   private boolean n548HisEstReo ;
   private boolean n5356Hisoperar ;
   private boolean n407EmprNom ;
   private boolean n540HisBarKgm ;
   private boolean n2299HisReoDsc ;
   private boolean n542HisBarSer ;
   private boolean n252CliCod ;
   private boolean n5086DscCausa ;
   private boolean n653OpeNom ;
   private boolean returnInSub ;
   private boolean n5218Nr_obstec ;
   private boolean n5219Nr_obstra ;
   private boolean n966PartCod ;
   private boolean n5206Nr_albrecc ;
   private boolean n7090Nr_PartCod ;
   private boolean n5340Nr_CliCod ;
   private boolean n5631Nr_ObsRT ;
   private boolean n5222Nr_barcoda ;
   private boolean n5223Nr_barreoa ;
   private boolean n5224Nr_barpara ;
   private boolean n5630Nr_RespTec ;
   private boolean n5628Nr_comerc ;
   private boolean n5629Nr_obscom ;
   private String AV35Com_com ;
   private String AV29Nr_obsrt ;
   private String A5631Nr_ObsRT ;
   private String AV33Nr_obscom ;
   private String A5629Nr_obscom ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P07952_A396EmprCod ;
   private int[] P07952_A5198Nr_codigo ;
   private String[] P07952_A834TipDefDsc ;
   private boolean[] P07952_n834TipDefDsc ;
   private short[] P07952_A833TipDefCod ;
   private short[] P07953_A833TipDefCod ;
   private short[] P07953_A5085CodCausa ;
   private boolean[] P07953_n5085CodCausa ;
   private String[] P07953_A396EmprCod ;
   private int[] P07953_A2297HisReoTn ;
   private boolean[] P07953_n2297HisReoTn ;
   private byte[] P07953_A548HisEstReo ;
   private boolean[] P07953_n548HisEstReo ;
   private int[] P07953_A5356Hisoperar ;
   private boolean[] P07953_n5356Hisoperar ;
   private int[] P07953_A539HisBarCod ;
   private byte[] P07953_A545HisCodReo ;
   private String[] P07953_A544HisCodPar ;
   private String[] P07953_A407EmprNom ;
   private boolean[] P07953_n407EmprNom ;
   private java.math.BigDecimal[] P07953_A540HisBarKgm ;
   private boolean[] P07953_n540HisBarKgm ;
   private String[] P07953_A2299HisReoDsc ;
   private boolean[] P07953_n2299HisReoDsc ;
   private String[] P07953_A542HisBarSer ;
   private boolean[] P07953_n542HisBarSer ;
   private String[] P07953_A279CliNom ;
   private int[] P07953_A252CliCod ;
   private boolean[] P07953_n252CliCod ;
   private String[] P07953_A5086DscCausa ;
   private boolean[] P07953_n5086DscCausa ;
   private String[] P07953_A834TipDefDsc ;
   private boolean[] P07953_n834TipDefDsc ;
   private String[] P07954_A396EmprCod ;
   private int[] P07954_A652OpeCod ;
   private String[] P07954_A653OpeNom ;
   private boolean[] P07954_n653OpeNom ;
   private String[] P07955_A396EmprCod ;
   private int[] P07955_A5198Nr_codigo ;
   private String[] P07955_A5218Nr_obstec ;
   private boolean[] P07955_n5218Nr_obstec ;
   private short[] P07955_A5228Nr_linTec ;
   private String[] P07956_A396EmprCod ;
   private int[] P07956_A5198Nr_codigo ;
   private String[] P07956_A5219Nr_obstra ;
   private boolean[] P07956_n5219Nr_obstra ;
   private short[] P07956_A5230Nr_linTre ;
   private int[] P07957_A361DisCod ;
   private String[] P07957_A396EmprCod ;
   private String[] P07957_A130BarCodPar ;
   private byte[] P07957_A132BarCodReo ;
   private int[] P07957_A129BarCod ;
   private String[] P07957_A143BarDisNum ;
   private String[] P07957_A1234BarNomCli ;
   private int[] P07957_A1235BarNumCli ;
   private String[] P07957_A966PartCod ;
   private boolean[] P07957_n966PartCod ;
   private int[] P07957_A252CliCod ;
   private boolean[] P07957_n252CliCod ;
   private String[] P07958_A396EmprCod ;
   private int[] P07958_A129BarCod ;
   private byte[] P07958_A132BarCodReo ;
   private String[] P07958_A130BarCodPar ;
   private int[] P07958_A44AlbRecCod ;
   private String[] P07958_A200BarPieCod ;
   private String[] P07959_A396EmprCod ;
   private int[] P07959_A5206Nr_albrecc ;
   private boolean[] P07959_n5206Nr_albrecc ;
   private int[] P07959_A5198Nr_codigo ;
   private String[] P079510_A396EmprCod ;
   private String[] P079510_A7090Nr_PartCod ;
   private boolean[] P079510_n7090Nr_PartCod ;
   private int[] P079510_A5340Nr_CliCod ;
   private boolean[] P079510_n5340Nr_CliCod ;
   private int[] P079510_A5198Nr_codigo ;
   private String[] P079511_A5631Nr_ObsRT ;
   private boolean[] P079511_n5631Nr_ObsRT ;
   private String[] P079511_A396EmprCod ;
   private int[] P079511_A5198Nr_codigo ;
   private int[] P079511_A5222Nr_barcoda ;
   private boolean[] P079511_n5222Nr_barcoda ;
   private byte[] P079511_A5223Nr_barreoa ;
   private boolean[] P079511_n5223Nr_barreoa ;
   private String[] P079511_A5224Nr_barpara ;
   private boolean[] P079511_n5224Nr_barpara ;
   private byte[] P079511_A5630Nr_RespTec ;
   private boolean[] P079511_n5630Nr_RespTec ;
   private String[] P079511_A5628Nr_comerc ;
   private boolean[] P079511_n5628Nr_comerc ;
   private String[] P079511_A5629Nr_obscom ;
   private boolean[] P079511_n5629Nr_obscom ;
}

final  class rncec00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07952", "SELECT T1.EmprCod, T1.Nr_codigo, T2.TipDefDsc, T1.TipDefCod FROM (TXPNOTRE1 T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.Nr_codigo = ? ORDER BY T1.EmprCod, T1.Nr_codigo, T1.TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07953", "SELECT T1.TipDefCod, T1.CodCausa, T1.EmprCod, T1.HisReoTn, T1.HisEstReo, T1.Hisoperar, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar, T2.EmprNom, T1.HisBarKgm, T1.HisReoDsc, T1.HisBarSer, T3.CliNom, T1.CliCod, T5.DscCausa, T4.TipDefDsc FROM ((((TXPHISREO T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) INNER JOIN TXPTIPDEF T4 ON T4.EmprCod = T1.EmprCod AND T4.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T5 ON T5.EmprCod = T1.EmprCod AND T5.CodCausa = T1.CodCausa) WHERE (T1.EmprCod = ? and T1.HisReoTn = ?) AND (T1.HisEstReo = 2) ORDER BY T1.EmprCod, T1.HisReoTn ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07954", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07955", "SELECT EmprCod, Nr_codigo, Nr_obstec, Nr_linTec FROM TXPNOTRET WHERE EmprCod = ? and Nr_codigo = ? ORDER BY EmprCod, Nr_codigo, Nr_linTec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07956", "SELECT EmprCod, Nr_codigo, Nr_obstra, Nr_linTre FROM TXPNOTRTE WHERE EmprCod = ? and Nr_codigo = ? ORDER BY EmprCod, Nr_codigo, Nr_linTre ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07957", "SELECT T1.DisCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarNomCli, T1.BarNumCli, T2.PartCod, T1.CliCod FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07958", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07959", "SELECT EmprCod, Nr_albrecc, Nr_codigo FROM TXPNOTREC WHERE (Nr_albrecc = ?) AND (EmprCod = ?) ORDER BY Nr_albrecc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P079510", "SELECT EmprCod, Nr_PartCod, Nr_CliCod, Nr_codigo FROM TXPNOTREC WHERE (Nr_PartCod = ? and Nr_CliCod = ?) AND (EmprCod = ?) ORDER BY Nr_PartCod, Nr_CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P079511", "SELECT Nr_ObsRT, EmprCod, Nr_codigo, Nr_barcoda, Nr_barreoa, Nr_barpara, Nr_RespTec, Nr_comerc, Nr_obscom FROM TXPNOTREC WHERE EmprCod = ? and Nr_codigo = ? ORDER BY EmprCod, Nr_codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((int[]) buf[22])[0] = rslt.getInt(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 60);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
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
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

