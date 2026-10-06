package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class refe000 extends GXReport
{
   public refe000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( refe000.class ), "" );
   }

   public refe000( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      refe000.this.aP2 = new String[] {""};
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
      refe000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      refe000.this.A2297HisReoTn = aP1[0];
      this.aP1 = aP1;
      refe000.this.Gx_out = aP2[0];
      this.aP2 = aP2;
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
         getPrinter().GxSetDocName("NOTA RECLAMACION") ;
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
         refe000.this.GXt_char1 = GXv_char2[0] ;
         AV16Station = GXt_char1 ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = AV17EmprNom ;
         GXv_char4[0] = AV9Usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
         refe000.this.A396EmprCod = GXv_char2[0] ;
         refe000.this.AV17EmprNom = GXv_char3[0] ;
         refe000.this.AV9Usurcod = GXv_char4[0] ;
         GXv_char4[0] = AV20ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOTREC", ""), GXv_char4) ;
         refe000.this.AV20ContDsc = GXv_char4[0] ;
         AV18i = (short)(1) ;
         GX_I = 1 ;
         while ( GX_I <= 10 )
         {
            AV19Tab_def[GX_I-1] = GXutil.space( (short)(30)) ;
            GX_I = (int)(GX_I+1) ;
         }
         /* Using cursor P075W2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5198Nr_codigo = P075W2_A5198Nr_codigo[0] ;
            A834TipDefDsc = P075W2_A834TipDefDsc[0] ;
            n834TipDefDsc = P075W2_n834TipDefDsc[0] ;
            A833TipDefCod = P075W2_A833TipDefCod[0] ;
            A834TipDefDsc = P075W2_A834TipDefDsc[0] ;
            n834TipDefDsc = P075W2_n834TipDefDsc[0] ;
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
         /* Using cursor P075W3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A833TipDefCod = P075W3_A833TipDefCod[0] ;
            A5085CodCausa = P075W3_A5085CodCausa[0] ;
            n5085CodCausa = P075W3_n5085CodCausa[0] ;
            A548HisEstReo = P075W3_A548HisEstReo[0] ;
            n548HisEstReo = P075W3_n548HisEstReo[0] ;
            A5356Hisoperar = P075W3_A5356Hisoperar[0] ;
            n5356Hisoperar = P075W3_n5356Hisoperar[0] ;
            A539HisBarCod = P075W3_A539HisBarCod[0] ;
            A545HisCodReo = P075W3_A545HisCodReo[0] ;
            A544HisCodPar = P075W3_A544HisCodPar[0] ;
            A2299HisReoDsc = P075W3_A2299HisReoDsc[0] ;
            n2299HisReoDsc = P075W3_n2299HisReoDsc[0] ;
            A542HisBarSer = P075W3_A542HisBarSer[0] ;
            n542HisBarSer = P075W3_n542HisBarSer[0] ;
            A569HisReoFec = P075W3_A569HisReoFec[0] ;
            n569HisReoFec = P075W3_n569HisReoFec[0] ;
            A540HisBarKgm = P075W3_A540HisBarKgm[0] ;
            n540HisBarKgm = P075W3_n540HisBarKgm[0] ;
            A279CliNom = P075W3_A279CliNom[0] ;
            A252CliCod = P075W3_A252CliCod[0] ;
            n252CliCod = P075W3_n252CliCod[0] ;
            A5086DscCausa = P075W3_A5086DscCausa[0] ;
            n5086DscCausa = P075W3_n5086DscCausa[0] ;
            A834TipDefDsc = P075W3_A834TipDefDsc[0] ;
            n834TipDefDsc = P075W3_n834TipDefDsc[0] ;
            A279CliNom = P075W3_A279CliNom[0] ;
            A834TipDefDsc = P075W3_A834TipDefDsc[0] ;
            n834TipDefDsc = P075W3_n834TipDefDsc[0] ;
            A5086DscCausa = P075W3_A5086DscCausa[0] ;
            n5086DscCausa = P075W3_n5086DscCausa[0] ;
            AV10BarCod = A539HisBarCod ;
            AV11BarCodreo = A545HisCodReo ;
            AV12BarCodPar = A544HisCodPar ;
            AV36OpeNom = "" ;
            /* Using cursor P075W4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n5356Hisoperar), Integer.valueOf(A5356Hisoperar)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A652OpeCod = P075W4_A652OpeCod[0] ;
               A653OpeNom = P075W4_A653OpeNom[0] ;
               n653OpeNom = P075W4_n653OpeNom[0] ;
               AV36OpeNom = A653OpeNom ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            AV25HisreoTn = A2297HisReoTn ;
            /* Execute user subroutine: 'NOTREC' */
            S131 ();
            if ( returnInSub )
            {
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
               AV31Resp = httpContext.getMessage( "ENDUTEX", "") ;
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
            AV35Com_com = GXutil.trim( AV33Nr_obscom) ;
            AV38ACCCOR = GXutil.trim( AV37NR_ACCCOR) ;
            AV40AEACCORT = GXutil.trim( AV39NR_AEACCOR) ;
            AV42AEACDCOR = GXutil.trim( AV41NR_AEACDCO) ;
            /* Execute user subroutine: 'BARCAD' */
            S111 ();
            if ( returnInSub )
            {
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
            /* Using cursor P075W5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A5198Nr_codigo = P075W5_A5198Nr_codigo[0] ;
               A5218Nr_obstec = P075W5_A5218Nr_obstec[0] ;
               n5218Nr_obstec = P075W5_n5218Nr_obstec[0] ;
               A5228Nr_linTec = P075W5_A5228Nr_linTec[0] ;
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
            /* Using cursor P075W6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A5198Nr_codigo = P075W6_A5198Nr_codigo[0] ;
               A5219Nr_obstra = P075W6_A5219Nr_obstra[0] ;
               n5219Nr_obstra = P075W6_n5219Nr_obstra[0] ;
               A5230Nr_linTre = P075W6_A5230Nr_linTre[0] ;
               if ( AV18i <= 4 )
               {
                  AV24ObsTra[AV18i-1] = A5219Nr_obstra ;
               }
               AV18i = (short)(AV18i+1) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV43SerDsc = GXutil.trim( GXutil.substring( A542HisBarSer, 1, 4)) + " " + GXutil.trim( A2299HisReoDsc) ;
            h75W0( false, 235) ;
            getPrinter().GxDrawRect(27, Gx_line+175, 753, Gx_line+203, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 27, Gx_line+9, 85, Gx_line+26, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 80, Gx_line+9, 131, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 134, Gx_line+9, 385, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Prod. Reclamado", ""), 392, Gx_line+9, 508, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 27, Gx_line+35, 51, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14BarNomCli, "")), 71, Gx_line+35, 180, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarNumCli), "ZZZZZ9")), 193, Gx_line+35, 244, Gx_line+53, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quantidade (Kg)", ""), 283, Gx_line+35, 391, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A540HisBarKgm, "ZZZZZ9.99")), 405, Gx_line+35, 481, Gx_line+53, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço", ""), 27, Gx_line+70, 127, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A539HisBarCod), "ZZZZZZZ9")), 138, Gx_line+70, 206, Gx_line+88, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A545HisCodReo), "9")), 219, Gx_line+70, 228, Gx_line+88, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A544HisCodPar, "")), 232, Gx_line+70, 241, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço Anterior", ""), 260, Gx_line+70, 417, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26NR_BARCODA), "ZZZZZZZ9")), 424, Gx_line+70, 492, Gx_line+88, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27NR_BARREOA), "9")), 497, Gx_line+70, 506, Gx_line+88, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28NR_BARPARA, "")), 514, Gx_line+70, 523, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(22, Gx_line+3, 778, Gx_line+234, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Reclamação apresentada pelo cliente:", ""), 27, Gx_line+99, 283, Gx_line+116, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_def[1-1], "")), 298, Gx_line+99, 549, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_def[2-1], "")), 298, Gx_line+119, 549, Gx_line+137, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_def[3-1], "")), 298, Gx_line+140, 549, Gx_line+158, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Com devolução", ""), 65, Gx_line+181, 169, Gx_line+198, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Sem devolução", ""), 295, Gx_line+181, 399, Gx_line+198, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(40, Gx_line+181, 61, Gx_line+198, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(270, Gx_line+181, 291, Gx_line+198, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 80, Gx_line+214, 122, Gx_line+231, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Rubrica:", ""), 364, Gx_line+214, 420, Gx_line+231, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(427, Gx_line+229, 569, Gx_line+229, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Enc. nº", ""), 602, Gx_line+70, 649, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13BarDisNum, "")), 655, Gx_line+70, 723, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A569HisReoFec, "99/99/99"), 123, Gx_line+214, 191, Gx_line+232, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43SerDsc, "")), 514, Gx_line+9, 773, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44VCompo, "")), 553, Gx_line+46, 772, Gx_line+62, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TipArtDsc, "")), 553, Gx_line+28, 772, Gx_line+44, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+235) ;
            h75W0( false, 351) ;
            getPrinter().GxDrawRect(21, Gx_line+3, 777, Gx_line+350, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 626, Gx_line+329, 668, Gx_line+346, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsável:", ""), 416, Gx_line+329, 516, Gx_line+346, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("___/___/___", 678, Gx_line+329, 753, Gx_line+346, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Acçoes de Correcçao:", ""), 39, Gx_line+86, 184, Gx_line+103, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[1-1], "")), 39, Gx_line+105, 540, Gx_line+123, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[2-1], "")), 39, Gx_line+125, 540, Gx_line+143, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[3-1], "")), 39, Gx_line+145, 540, Gx_line+163, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ObsTra[4-1], "")), 39, Gx_line+165, 540, Gx_line+183, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Defeito identificado:", ""), 31, Gx_line+13, 165, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A834TipDefDsc, "")), 183, Gx_line+13, 434, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Causa:", ""), 31, Gx_line+36, 77, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5086DscCausa, "")), 183, Gx_line+36, 684, Gx_line+54, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(527, Gx_line+345, 621, Gx_line+345, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Acçoes Correctivas:", ""), 39, Gx_line+185, 169, Gx_line+202, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(AV38ACCCOR, 39, Gx_line+204, 757, Gx_line+295, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Acçoes a Implementar:", ""), 32, Gx_line+59, 185, Gx_line+76, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(30, Gx_line+78, 768, Gx_line+299, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+351) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h75W0( true, 0) ;
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
      /* Using cursor P075W7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodreo), AV12BarCodPar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A130BarCodPar = P075W7_A130BarCodPar[0] ;
         A132BarCodReo = P075W7_A132BarCodReo[0] ;
         A129BarCod = P075W7_A129BarCod[0] ;
         A143BarDisNum = P075W7_A143BarDisNum[0] ;
         A1234BarNomCli = P075W7_A1234BarNomCli[0] ;
         A1235BarNumCli = P075W7_A1235BarNumCli[0] ;
         A217BarTipArt = P075W7_A217BarTipArt[0] ;
         n217BarTipArt = P075W7_n217BarTipArt[0] ;
         A224BarTraP1 = P075W7_A224BarTraP1[0] ;
         A225BarTraP2 = P075W7_A225BarTraP2[0] ;
         A226BarTraP3 = P075W7_A226BarTraP3[0] ;
         AV13BarDisNum = A143BarDisNum ;
         AV14BarNomCli = A1234BarNomCli ;
         AV15BarNumCli = A1235BarNumCli ;
         AV46BarTipARt = A217BarTipArt ;
         /* Execute user subroutine: 'TIPART' */
         S129 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         if ( A224BarTraP1 > 0 )
         {
            AV44VCompo = GXutil.trim( GXutil.str( A224BarTraP1, 3, 0)) + "%" ;
            if ( A225BarTraP2 > 0 )
            {
               AV44VCompo += GXutil.trim( GXutil.str( A225BarTraP2, 3, 0)) + "%" ;
            }
            if ( A226BarTraP3 > 0 )
            {
               AV44VCompo += GXutil.trim( GXutil.str( A226BarTraP3, 3, 0)) + "%" ;
            }
         }
         /* Using cursor P075W8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A44AlbRecCod = P075W8_A44AlbRecCod[0] ;
            A200BarPieCod = P075W8_A200BarPieCod[0] ;
            AV21AlbRecCod = A44AlbRecCod ;
            /* Using cursor P075W9 */
            pr_default.execute(7, new Object[] {Integer.valueOf(AV21AlbRecCod), A396EmprCod});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A5206Nr_albrecc = P075W9_A5206Nr_albrecc[0] ;
               n5206Nr_albrecc = P075W9_n5206Nr_albrecc[0] ;
               A5198Nr_codigo = P075W9_A5198Nr_codigo[0] ;
               AV22Nr_codigo = A5198Nr_codigo ;
               pr_default.readNext(7);
            }
            pr_default.close(7);
            pr_default.readNext(6);
         }
         pr_default.close(6);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S129( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      /* Using cursor P075W10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(AV46BarTipARt)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A829TipArtCod = P075W10_A829TipArtCod[0] ;
         A830TipArtDsc = P075W10_A830TipArtDsc[0] ;
         n830TipArtDsc = P075W10_n830TipArtDsc[0] ;
         AV45TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S131( ) throws ProcessInterruptedException
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
      AV38ACCCOR = "" ;
      AV40AEACCORT = "" ;
      AV42AEACDCOR = "" ;
      /* Using cursor P075W11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV25HisreoTn)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A5631Nr_ObsRT = P075W11_A5631Nr_ObsRT[0] ;
         n5631Nr_ObsRT = P075W11_n5631Nr_ObsRT[0] ;
         A5198Nr_codigo = P075W11_A5198Nr_codigo[0] ;
         A5222Nr_barcoda = P075W11_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P075W11_n5222Nr_barcoda[0] ;
         A5223Nr_barreoa = P075W11_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P075W11_n5223Nr_barreoa[0] ;
         A5224Nr_barpara = P075W11_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P075W11_n5224Nr_barpara[0] ;
         A5630Nr_RespTec = P075W11_A5630Nr_RespTec[0] ;
         n5630Nr_RespTec = P075W11_n5630Nr_RespTec[0] ;
         A5628Nr_comerc = P075W11_A5628Nr_comerc[0] ;
         n5628Nr_comerc = P075W11_n5628Nr_comerc[0] ;
         A5629Nr_obscom = P075W11_A5629Nr_obscom[0] ;
         n5629Nr_obscom = P075W11_n5629Nr_obscom[0] ;
         A5698Nr_acccor = P075W11_A5698Nr_acccor[0] ;
         n5698Nr_acccor = P075W11_n5698Nr_acccor[0] ;
         A5697Nr_AeAcCor = P075W11_A5697Nr_AeAcCor[0] ;
         n5697Nr_AeAcCor = P075W11_n5697Nr_AeAcCor[0] ;
         A5696Nr_AeAcdCo = P075W11_A5696Nr_AeAcdCo[0] ;
         n5696Nr_AeAcdCo = P075W11_n5696Nr_AeAcdCo[0] ;
         AV26NR_BARCODA = A5222Nr_barcoda ;
         AV27NR_BARREOA = A5223Nr_barreoa ;
         AV28NR_BARPARA = A5224Nr_barpara ;
         AV29Nr_obsrt = A5631Nr_ObsRT ;
         AV30NR_RESPTEC = A5630Nr_RespTec ;
         AV32Nr_comerc = A5628Nr_comerc ;
         AV33Nr_obscom = A5629Nr_obscom ;
         AV37NR_ACCCOR = A5698Nr_acccor ;
         AV39NR_AEACCOR = A5697Nr_AeAcCor ;
         AV41NR_AEACDCO = A5696Nr_AeAcdCo ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void h75W0( boolean bFoot ,
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
               getPrinter().GxDrawLine(22, Gx_line+4, 760, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20ContDsc, "")), 24, Gx_line+11, 108, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Impressao:", ""), 179, Gx_line+10, 246, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Usurcod, "@!")), 252, Gx_line+9, 319, Gx_line+26, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 326, Gx_line+9, 393, Gx_line+26, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 577, Gx_line+9, 635, Gx_line+26, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 645, Gx_line+10, 684, Gx_line+26, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 690, Gx_line+9, 707, Gx_line+26, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 713, Gx_line+10, 762, Gx_line+25, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+28) ;
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
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Boletim de Tratamento de Reclamações", ""), 68, Gx_line+143, 383, Gx_line+163, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2297HisReoTn), "ZZZZZ9")), 535, Gx_line+145, 586, Gx_line+163, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(22, Gx_line+124, 428, Gx_line+181, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(435, Gx_line+124, 648, Gx_line+181, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N.º ", ""), 505, Gx_line+145, 529, Gx_line+162, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "c89c26b7-4557-41b9-bd04-12d8bf342776", "", context.getHttpContext().getTheme( )), 22, Gx_line+17, 396, Gx_line+103) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "b7a4b1c6-f180-475f-9ae5-82d045acd6da", "", context.getHttpContext().getTheme( )), 408, Gx_line+26, 552, Gx_line+95) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+186) ;
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
      this.aP0[0] = refe000.this.A396EmprCod;
      this.aP1[0] = refe000.this.A2297HisReoTn;
      this.aP2[0] = refe000.this.Gx_out;
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
      P075W2_A396EmprCod = new String[] {""} ;
      P075W2_A5198Nr_codigo = new int[1] ;
      P075W2_A834TipDefDsc = new String[] {""} ;
      P075W2_n834TipDefDsc = new boolean[] {false} ;
      P075W2_A833TipDefCod = new short[1] ;
      A834TipDefDsc = "" ;
      P075W3_A833TipDefCod = new short[1] ;
      P075W3_A5085CodCausa = new short[1] ;
      P075W3_n5085CodCausa = new boolean[] {false} ;
      P075W3_A396EmprCod = new String[] {""} ;
      P075W3_A2297HisReoTn = new int[1] ;
      P075W3_n2297HisReoTn = new boolean[] {false} ;
      P075W3_A548HisEstReo = new byte[1] ;
      P075W3_n548HisEstReo = new boolean[] {false} ;
      P075W3_A5356Hisoperar = new int[1] ;
      P075W3_n5356Hisoperar = new boolean[] {false} ;
      P075W3_A539HisBarCod = new int[1] ;
      P075W3_A545HisCodReo = new byte[1] ;
      P075W3_A544HisCodPar = new String[] {""} ;
      P075W3_A2299HisReoDsc = new String[] {""} ;
      P075W3_n2299HisReoDsc = new boolean[] {false} ;
      P075W3_A542HisBarSer = new String[] {""} ;
      P075W3_n542HisBarSer = new boolean[] {false} ;
      P075W3_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P075W3_n569HisReoFec = new boolean[] {false} ;
      P075W3_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P075W3_n540HisBarKgm = new boolean[] {false} ;
      P075W3_A279CliNom = new String[] {""} ;
      P075W3_A252CliCod = new int[1] ;
      P075W3_n252CliCod = new boolean[] {false} ;
      P075W3_A5086DscCausa = new String[] {""} ;
      P075W3_n5086DscCausa = new boolean[] {false} ;
      P075W3_A834TipDefDsc = new String[] {""} ;
      P075W3_n834TipDefDsc = new boolean[] {false} ;
      A544HisCodPar = "" ;
      A2299HisReoDsc = "" ;
      A542HisBarSer = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A5086DscCausa = "" ;
      AV12BarCodPar = "" ;
      AV36OpeNom = "" ;
      P075W4_A396EmprCod = new String[] {""} ;
      P075W4_A652OpeCod = new int[1] ;
      P075W4_A653OpeNom = new String[] {""} ;
      P075W4_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      AV31Resp = "" ;
      AV32Nr_comerc = "" ;
      AV34Acc_com = "" ;
      AV35Com_com = "" ;
      AV33Nr_obscom = "" ;
      AV38ACCCOR = "" ;
      AV37NR_ACCCOR = "" ;
      AV40AEACCORT = "" ;
      AV39NR_AEACCOR = "" ;
      AV42AEACDCOR = "" ;
      AV41NR_AEACDCO = "" ;
      AV23ObsTec = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV23ObsTec[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P075W5_A396EmprCod = new String[] {""} ;
      P075W5_A5198Nr_codigo = new int[1] ;
      P075W5_A5218Nr_obstec = new String[] {""} ;
      P075W5_n5218Nr_obstec = new boolean[] {false} ;
      P075W5_A5228Nr_linTec = new short[1] ;
      A5218Nr_obstec = "" ;
      AV24ObsTra = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV24ObsTra[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P075W6_A396EmprCod = new String[] {""} ;
      P075W6_A5198Nr_codigo = new int[1] ;
      P075W6_A5219Nr_obstra = new String[] {""} ;
      P075W6_n5219Nr_obstra = new boolean[] {false} ;
      P075W6_A5230Nr_linTre = new short[1] ;
      A5219Nr_obstra = "" ;
      AV43SerDsc = "" ;
      AV14BarNomCli = "" ;
      AV28NR_BARPARA = "" ;
      AV13BarDisNum = "" ;
      AV44VCompo = "" ;
      AV45TipArtDsc = "" ;
      P075W7_A396EmprCod = new String[] {""} ;
      P075W7_A130BarCodPar = new String[] {""} ;
      P075W7_A132BarCodReo = new byte[1] ;
      P075W7_A129BarCod = new int[1] ;
      P075W7_A143BarDisNum = new String[] {""} ;
      P075W7_A1234BarNomCli = new String[] {""} ;
      P075W7_A1235BarNumCli = new int[1] ;
      P075W7_A217BarTipArt = new short[1] ;
      P075W7_n217BarTipArt = new boolean[] {false} ;
      P075W7_A224BarTraP1 = new short[1] ;
      P075W7_A225BarTraP2 = new short[1] ;
      P075W7_A226BarTraP3 = new short[1] ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A1234BarNomCli = "" ;
      P075W8_A396EmprCod = new String[] {""} ;
      P075W8_A129BarCod = new int[1] ;
      P075W8_A132BarCodReo = new byte[1] ;
      P075W8_A130BarCodPar = new String[] {""} ;
      P075W8_A44AlbRecCod = new int[1] ;
      P075W8_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      P075W9_A396EmprCod = new String[] {""} ;
      P075W9_A5206Nr_albrecc = new int[1] ;
      P075W9_n5206Nr_albrecc = new boolean[] {false} ;
      P075W9_A5198Nr_codigo = new int[1] ;
      P075W10_A396EmprCod = new String[] {""} ;
      P075W10_A829TipArtCod = new short[1] ;
      P075W10_A830TipArtDsc = new String[] {""} ;
      P075W10_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      AV29Nr_obsrt = "" ;
      P075W11_A5631Nr_ObsRT = new String[] {""} ;
      P075W11_n5631Nr_ObsRT = new boolean[] {false} ;
      P075W11_A396EmprCod = new String[] {""} ;
      P075W11_A5198Nr_codigo = new int[1] ;
      P075W11_A5222Nr_barcoda = new int[1] ;
      P075W11_n5222Nr_barcoda = new boolean[] {false} ;
      P075W11_A5223Nr_barreoa = new byte[1] ;
      P075W11_n5223Nr_barreoa = new boolean[] {false} ;
      P075W11_A5224Nr_barpara = new String[] {""} ;
      P075W11_n5224Nr_barpara = new boolean[] {false} ;
      P075W11_A5630Nr_RespTec = new byte[1] ;
      P075W11_n5630Nr_RespTec = new boolean[] {false} ;
      P075W11_A5628Nr_comerc = new String[] {""} ;
      P075W11_n5628Nr_comerc = new boolean[] {false} ;
      P075W11_A5629Nr_obscom = new String[] {""} ;
      P075W11_n5629Nr_obscom = new boolean[] {false} ;
      P075W11_A5698Nr_acccor = new String[] {""} ;
      P075W11_n5698Nr_acccor = new boolean[] {false} ;
      P075W11_A5697Nr_AeAcCor = new String[] {""} ;
      P075W11_n5697Nr_AeAcCor = new boolean[] {false} ;
      P075W11_A5696Nr_AeAcdCo = new String[] {""} ;
      P075W11_n5696Nr_AeAcdCo = new boolean[] {false} ;
      A5631Nr_ObsRT = "" ;
      A5224Nr_barpara = "" ;
      A5628Nr_comerc = "" ;
      A5629Nr_obscom = "" ;
      A5698Nr_acccor = "" ;
      A5697Nr_AeAcCor = "" ;
      A5696Nr_AeAcdCo = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.refe000__default(),
         new Object[] {
             new Object[] {
            P075W2_A396EmprCod, P075W2_A5198Nr_codigo, P075W2_A834TipDefDsc, P075W2_n834TipDefDsc, P075W2_A833TipDefCod
            }
            , new Object[] {
            P075W3_A833TipDefCod, P075W3_A5085CodCausa, P075W3_n5085CodCausa, P075W3_A396EmprCod, P075W3_A2297HisReoTn, P075W3_n2297HisReoTn, P075W3_A548HisEstReo, P075W3_n548HisEstReo, P075W3_A5356Hisoperar, P075W3_n5356Hisoperar,
            P075W3_A539HisBarCod, P075W3_A545HisCodReo, P075W3_A544HisCodPar, P075W3_A2299HisReoDsc, P075W3_n2299HisReoDsc, P075W3_A542HisBarSer, P075W3_n542HisBarSer, P075W3_A569HisReoFec, P075W3_n569HisReoFec, P075W3_A540HisBarKgm,
            P075W3_n540HisBarKgm, P075W3_A279CliNom, P075W3_A252CliCod, P075W3_n252CliCod, P075W3_A5086DscCausa, P075W3_n5086DscCausa, P075W3_A834TipDefDsc, P075W3_n834TipDefDsc
            }
            , new Object[] {
            P075W4_A396EmprCod, P075W4_A652OpeCod, P075W4_A653OpeNom, P075W4_n653OpeNom
            }
            , new Object[] {
            P075W5_A396EmprCod, P075W5_A5198Nr_codigo, P075W5_A5218Nr_obstec, P075W5_n5218Nr_obstec, P075W5_A5228Nr_linTec
            }
            , new Object[] {
            P075W6_A396EmprCod, P075W6_A5198Nr_codigo, P075W6_A5219Nr_obstra, P075W6_n5219Nr_obstra, P075W6_A5230Nr_linTre
            }
            , new Object[] {
            P075W7_A396EmprCod, P075W7_A130BarCodPar, P075W7_A132BarCodReo, P075W7_A129BarCod, P075W7_A143BarDisNum, P075W7_A1234BarNomCli, P075W7_A1235BarNumCli, P075W7_A217BarTipArt, P075W7_n217BarTipArt, P075W7_A224BarTraP1,
            P075W7_A225BarTraP2, P075W7_A226BarTraP3
            }
            , new Object[] {
            P075W8_A396EmprCod, P075W8_A129BarCod, P075W8_A132BarCodReo, P075W8_A130BarCodPar, P075W8_A44AlbRecCod, P075W8_A200BarPieCod
            }
            , new Object[] {
            P075W9_A396EmprCod, P075W9_A5206Nr_albrecc, P075W9_n5206Nr_albrecc, P075W9_A5198Nr_codigo
            }
            , new Object[] {
            P075W10_A396EmprCod, P075W10_A829TipArtCod, P075W10_A830TipArtDsc, P075W10_n830TipArtDsc
            }
            , new Object[] {
            P075W11_A5631Nr_ObsRT, P075W11_n5631Nr_ObsRT, P075W11_A396EmprCod, P075W11_A5198Nr_codigo, P075W11_A5222Nr_barcoda, P075W11_n5222Nr_barcoda, P075W11_A5223Nr_barreoa, P075W11_n5223Nr_barreoa, P075W11_A5224Nr_barpara, P075W11_n5224Nr_barpara,
            P075W11_A5630Nr_RespTec, P075W11_n5630Nr_RespTec, P075W11_A5628Nr_comerc, P075W11_n5628Nr_comerc, P075W11_A5629Nr_obscom, P075W11_n5629Nr_obscom, P075W11_A5698Nr_acccor, P075W11_n5698Nr_acccor, P075W11_A5697Nr_AeAcCor, P075W11_n5697Nr_AeAcCor,
            P075W11_A5696Nr_AeAcdCo, P075W11_n5696Nr_AeAcdCo
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
   private short A217BarTipArt ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short AV46BarTipARt ;
   private short A829TipArtCod ;
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
   private int AV15BarNumCli ;
   private int AV26NR_BARCODA ;
   private int Gx_OldLine ;
   private int AV21AlbRecCod ;
   private int AV22Nr_codigo ;
   private int A129BarCod ;
   private int A1235BarNumCli ;
   private int A44AlbRecCod ;
   private int A5206Nr_albrecc ;
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
   private String AV43SerDsc ;
   private String AV14BarNomCli ;
   private String AV28NR_BARPARA ;
   private String AV13BarDisNum ;
   private String AV44VCompo ;
   private String AV45TipArtDsc ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A1234BarNomCli ;
   private String A200BarPieCod ;
   private String A830TipArtDsc ;
   private String A5224Nr_barpara ;
   private String A5628Nr_comerc ;
   private java.util.Date A569HisReoFec ;
   private java.util.Date Gx_date ;
   private boolean n2297HisReoTn ;
   private boolean n834TipDefDsc ;
   private boolean GxHdr3 ;
   private boolean n5085CodCausa ;
   private boolean n548HisEstReo ;
   private boolean n5356Hisoperar ;
   private boolean n2299HisReoDsc ;
   private boolean n542HisBarSer ;
   private boolean n569HisReoFec ;
   private boolean n540HisBarKgm ;
   private boolean n252CliCod ;
   private boolean n5086DscCausa ;
   private boolean n653OpeNom ;
   private boolean returnInSub ;
   private boolean n5218Nr_obstec ;
   private boolean n5219Nr_obstra ;
   private boolean n217BarTipArt ;
   private boolean n5206Nr_albrecc ;
   private boolean n830TipArtDsc ;
   private boolean n5631Nr_ObsRT ;
   private boolean n5222Nr_barcoda ;
   private boolean n5223Nr_barreoa ;
   private boolean n5224Nr_barpara ;
   private boolean n5630Nr_RespTec ;
   private boolean n5628Nr_comerc ;
   private boolean n5629Nr_obscom ;
   private boolean n5698Nr_acccor ;
   private boolean n5697Nr_AeAcCor ;
   private boolean n5696Nr_AeAcdCo ;
   private String AV35Com_com ;
   private String AV38ACCCOR ;
   private String AV40AEACCORT ;
   private String AV42AEACDCOR ;
   private String AV29Nr_obsrt ;
   private String A5631Nr_ObsRT ;
   private String AV33Nr_obscom ;
   private String AV37NR_ACCCOR ;
   private String AV39NR_AEACCOR ;
   private String AV41NR_AEACDCO ;
   private String A5629Nr_obscom ;
   private String A5698Nr_acccor ;
   private String A5697Nr_AeAcCor ;
   private String A5696Nr_AeAcdCo ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P075W2_A396EmprCod ;
   private int[] P075W2_A5198Nr_codigo ;
   private String[] P075W2_A834TipDefDsc ;
   private boolean[] P075W2_n834TipDefDsc ;
   private short[] P075W2_A833TipDefCod ;
   private short[] P075W3_A833TipDefCod ;
   private short[] P075W3_A5085CodCausa ;
   private boolean[] P075W3_n5085CodCausa ;
   private String[] P075W3_A396EmprCod ;
   private int[] P075W3_A2297HisReoTn ;
   private boolean[] P075W3_n2297HisReoTn ;
   private byte[] P075W3_A548HisEstReo ;
   private boolean[] P075W3_n548HisEstReo ;
   private int[] P075W3_A5356Hisoperar ;
   private boolean[] P075W3_n5356Hisoperar ;
   private int[] P075W3_A539HisBarCod ;
   private byte[] P075W3_A545HisCodReo ;
   private String[] P075W3_A544HisCodPar ;
   private String[] P075W3_A2299HisReoDsc ;
   private boolean[] P075W3_n2299HisReoDsc ;
   private String[] P075W3_A542HisBarSer ;
   private boolean[] P075W3_n542HisBarSer ;
   private java.util.Date[] P075W3_A569HisReoFec ;
   private boolean[] P075W3_n569HisReoFec ;
   private java.math.BigDecimal[] P075W3_A540HisBarKgm ;
   private boolean[] P075W3_n540HisBarKgm ;
   private String[] P075W3_A279CliNom ;
   private int[] P075W3_A252CliCod ;
   private boolean[] P075W3_n252CliCod ;
   private String[] P075W3_A5086DscCausa ;
   private boolean[] P075W3_n5086DscCausa ;
   private String[] P075W3_A834TipDefDsc ;
   private boolean[] P075W3_n834TipDefDsc ;
   private String[] P075W4_A396EmprCod ;
   private int[] P075W4_A652OpeCod ;
   private String[] P075W4_A653OpeNom ;
   private boolean[] P075W4_n653OpeNom ;
   private String[] P075W5_A396EmprCod ;
   private int[] P075W5_A5198Nr_codigo ;
   private String[] P075W5_A5218Nr_obstec ;
   private boolean[] P075W5_n5218Nr_obstec ;
   private short[] P075W5_A5228Nr_linTec ;
   private String[] P075W6_A396EmprCod ;
   private int[] P075W6_A5198Nr_codigo ;
   private String[] P075W6_A5219Nr_obstra ;
   private boolean[] P075W6_n5219Nr_obstra ;
   private short[] P075W6_A5230Nr_linTre ;
   private String[] P075W7_A396EmprCod ;
   private String[] P075W7_A130BarCodPar ;
   private byte[] P075W7_A132BarCodReo ;
   private int[] P075W7_A129BarCod ;
   private String[] P075W7_A143BarDisNum ;
   private String[] P075W7_A1234BarNomCli ;
   private int[] P075W7_A1235BarNumCli ;
   private short[] P075W7_A217BarTipArt ;
   private boolean[] P075W7_n217BarTipArt ;
   private short[] P075W7_A224BarTraP1 ;
   private short[] P075W7_A225BarTraP2 ;
   private short[] P075W7_A226BarTraP3 ;
   private String[] P075W8_A396EmprCod ;
   private int[] P075W8_A129BarCod ;
   private byte[] P075W8_A132BarCodReo ;
   private String[] P075W8_A130BarCodPar ;
   private int[] P075W8_A44AlbRecCod ;
   private String[] P075W8_A200BarPieCod ;
   private String[] P075W9_A396EmprCod ;
   private int[] P075W9_A5206Nr_albrecc ;
   private boolean[] P075W9_n5206Nr_albrecc ;
   private int[] P075W9_A5198Nr_codigo ;
   private String[] P075W10_A396EmprCod ;
   private short[] P075W10_A829TipArtCod ;
   private String[] P075W10_A830TipArtDsc ;
   private boolean[] P075W10_n830TipArtDsc ;
   private String[] P075W11_A5631Nr_ObsRT ;
   private boolean[] P075W11_n5631Nr_ObsRT ;
   private String[] P075W11_A396EmprCod ;
   private int[] P075W11_A5198Nr_codigo ;
   private int[] P075W11_A5222Nr_barcoda ;
   private boolean[] P075W11_n5222Nr_barcoda ;
   private byte[] P075W11_A5223Nr_barreoa ;
   private boolean[] P075W11_n5223Nr_barreoa ;
   private String[] P075W11_A5224Nr_barpara ;
   private boolean[] P075W11_n5224Nr_barpara ;
   private byte[] P075W11_A5630Nr_RespTec ;
   private boolean[] P075W11_n5630Nr_RespTec ;
   private String[] P075W11_A5628Nr_comerc ;
   private boolean[] P075W11_n5628Nr_comerc ;
   private String[] P075W11_A5629Nr_obscom ;
   private boolean[] P075W11_n5629Nr_obscom ;
   private String[] P075W11_A5698Nr_acccor ;
   private boolean[] P075W11_n5698Nr_acccor ;
   private String[] P075W11_A5697Nr_AeAcCor ;
   private boolean[] P075W11_n5697Nr_AeAcCor ;
   private String[] P075W11_A5696Nr_AeAcdCo ;
   private boolean[] P075W11_n5696Nr_AeAcdCo ;
}

final  class refe000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P075W2", "SELECT T1.EmprCod, T1.Nr_codigo, T2.TipDefDsc, T1.TipDefCod FROM (TXPNOTRE1 T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.Nr_codigo = ? ORDER BY T1.EmprCod, T1.Nr_codigo, T1.TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P075W3", "SELECT T1.TipDefCod, T1.CodCausa, T1.EmprCod, T1.HisReoTn, T1.HisEstReo, T1.Hisoperar, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar, T1.HisReoDsc, T1.HisBarSer, T1.HisReoFec, T1.HisBarKgm, T2.CliNom, T1.CliCod, T4.DscCausa, T3.TipDefDsc FROM (((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPDEF T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T4 ON T4.EmprCod = T1.EmprCod AND T4.CodCausa = T1.CodCausa) WHERE (T1.EmprCod = ? and T1.HisReoTn = ?) AND (T1.HisEstReo = 2) ORDER BY T1.EmprCod, T1.HisReoTn ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P075W4", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P075W5", "SELECT EmprCod, Nr_codigo, Nr_obstec, Nr_linTec FROM TXPNOTRET WHERE EmprCod = ? and Nr_codigo = ? ORDER BY EmprCod, Nr_codigo, Nr_linTec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P075W6", "SELECT EmprCod, Nr_codigo, Nr_obstra, Nr_linTre FROM TXPNOTRTE WHERE EmprCod = ? and Nr_codigo = ? ORDER BY EmprCod, Nr_codigo, Nr_linTre ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P075W7", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarDisNum, BarNomCli, BarNumCli, BarTipArt, BarTraP1, BarTraP2, BarTraP3 FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P075W8", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P075W9", "SELECT EmprCod, Nr_albrecc, Nr_codigo FROM TXPNOTREC WHERE (Nr_albrecc = ?) AND (EmprCod = ?) ORDER BY Nr_albrecc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P075W10", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P075W11", "SELECT Nr_ObsRT, EmprCod, Nr_codigo, Nr_barcoda, Nr_barreoa, Nr_barpara, Nr_RespTec, Nr_comerc, Nr_obscom, Nr_acccor, Nr_AeAcCor, Nr_AeAcdCo FROM TXPNOTREC WHERE EmprCod = ? and Nr_codigo = ? ORDER BY EmprCod, Nr_codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,2);
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               ((String[]) buf[16])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

