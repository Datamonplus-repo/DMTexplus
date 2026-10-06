package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rregqua_group extends GXReport
{
   public rregqua_group( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rregqua_group.class ), "" );
   }

   public rregqua_group( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          byte aP2 ,
                          String aP3 ,
                          String aP4 ,
                          int[] aP5 )
   {
      rregqua_group.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, reportHandler);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        int[] aP5 ,
                        IReportHandler reportHandler )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, reportHandler);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             int[] aP5 ,
                             IReportHandler reportHandler )
   {
      rregqua_group.this.A396EmprCod = aP0;
      rregqua_group.this.A129BarCod = aP1;
      rregqua_group.this.A132BarCodReo = aP2;
      rregqua_group.this.A130BarCodPar = aP3;
      rregqua_group.this.AV12ImpCod = aP4;
      rregqua_group.this.Gx_line = aP5[0];
      this.aP5 = aP5;
      this.reportHandler = reportHandler;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      try
      {
         setPrinter(reportHandler);
         P_lines = getPrinter().getPageLines();
         lineHeight = getPrinter().getLineHeight();
         M_top = getPrinter().getM_top();
         M_bot = getPrinter().getM_bot();
         Gx_page = getPrinter().getPage();
         GXv_char1[0] = AV13ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REGQUA", ""), GXv_char1) ;
         rregqua_group.this.AV13ContDsc = GXv_char1[0] ;
         /* Using cursor P0AD03 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361DisCod = P0AD03_A361DisCod[0] ;
            A212BarSer = P0AD03_A212BarSer[0] ;
            A2829BarProPer = P0AD03_A2829BarProPer[0] ;
            A2010BarTipDis = P0AD03_A2010BarTipDis[0] ;
            A181BarMaqPro = P0AD03_A181BarMaqPro[0] ;
            A9775BarItem1 = P0AD03_A9775BarItem1[0] ;
            A9776barItem2 = P0AD03_A9776barItem2[0] ;
            A125BarAncAca1 = P0AD03_A125BarAncAca1[0] ;
            A126BarAncAca2 = P0AD03_A126BarAncAca2[0] ;
            A1909BarGraAca = P0AD03_A1909BarGraAca[0] ;
            A3137BarGraAca2 = P0AD03_A3137BarGraAca2[0] ;
            A221BarTra1 = P0AD03_A221BarTra1[0] ;
            A224BarTraP1 = P0AD03_A224BarTraP1[0] ;
            A222BarTra2 = P0AD03_A222BarTra2[0] ;
            A225BarTraP2 = P0AD03_A225BarTraP2[0] ;
            A223BarTra3 = P0AD03_A223BarTra3[0] ;
            A226BarTraP3 = P0AD03_A226BarTraP3[0] ;
            A229BarUrd1 = P0AD03_A229BarUrd1[0] ;
            A232BarUrdP1 = P0AD03_A232BarUrdP1[0] ;
            A230BarUrd2 = P0AD03_A230BarUrd2[0] ;
            A233BarUrdP2 = P0AD03_A233BarUrdP2[0] ;
            A136BarColNum = P0AD03_A136BarColNum[0] ;
            A135BarColNom = P0AD03_A135BarColNom[0] ;
            A143BarDisNum = P0AD03_A143BarDisNum[0] ;
            A252CliCod = P0AD03_A252CliCod[0] ;
            n252CliCod = P0AD03_n252CliCod[0] ;
            A1652BarSerDsc = P0AD03_A1652BarSerDsc[0] ;
            A279CliNom = P0AD03_A279CliNom[0] ;
            A166BarKgm = P0AD03_A166BarKgm[0] ;
            n166BarKgm = P0AD03_n166BarKgm[0] ;
            A279CliNom = P0AD03_A279CliNom[0] ;
            A166BarKgm = P0AD03_A166BarKgm[0] ;
            n166BarKgm = P0AD03_n166BarKgm[0] ;
            AV30HojRut = "*" + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
            AV14MacCod = 0 ;
            AV35Cod_Idtx = A2829BarProPer ;
            /* Execute user subroutine: 'INDITEX' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            GXv_char1[0] = AV28tipdisdsc ;
            GXv_int2[0] = (byte)(0) ;
            new app.pbustdi(remoteHandle, context).execute( A396EmprCod, A2010BarTipDis, GXv_char1, GXv_int2) ;
            rregqua_group.this.AV28tipdisdsc = GXv_char1[0] ;
            GXv_char1[0] = AV29MarcaDsc ;
            new app.pmarcacliente(remoteHandle, context).execute( A396EmprCod, A181BarMaqPro, GXv_char1) ;
            rregqua_group.this.AV29MarcaDsc = GXv_char1[0] ;
            GXv_int3[0] = AV14MacCod ;
            new app.pbusmac(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_int3) ;
            rregqua_group.this.AV14MacCod = GXv_int3[0] ;
            if ( AV14MacCod > 0 )
            {
               /* Execute user subroutine: 'ACCESORIOS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  getPrinter().GxEndPage() ;
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            else
            {
               AV16TotKgs = A166BarKgm ;
            }
            AV25Baritem1 = GXutil.substring( A9775BarItem1, 1, 10) ;
            AV26BarItem2 = GXutil.substring( A9776barItem2, 1, 10) ;
            AV8BarAncAca1 = "" ;
            AV9BarAncAca2 = "" ;
            if ( (0==A125BarAncAca1) )
            {
               AV8BarAncAca1 = " " ;
            }
            else
            {
               AV8BarAncAca1 = GXutil.str( A125BarAncAca1, 3, 0) ;
            }
            if ( (0==A126BarAncAca2) )
            {
               AV9BarAncAca2 = " " ;
            }
            else
            {
               AV9BarAncAca2 = GXutil.str( A126BarAncAca2, 3, 0) ;
            }
            AV10BarGraAca = "" ;
            AV11BarGraAca2 = "" ;
            if ( (0==A1909BarGraAca) )
            {
               AV10BarGraAca = " " ;
            }
            else
            {
               AV10BarGraAca = GXutil.str( A1909BarGraAca, 4, 0) ;
            }
            if ( (0==A3137BarGraAca2) )
            {
               AV11BarGraAca2 = " " ;
            }
            else
            {
               AV11BarGraAca2 = GXutil.str( A3137BarGraAca2, 4, 0) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV17Tab_obs[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            AV27Comp = " " ;
            if ( GXutil.strcmp(A221BarTra1, "") != 0 )
            {
               AV27Comp = GXutil.trim( A221BarTra1) + " " + GXutil.str( A224BarTraP1, 3, 0) + "%" ;
            }
            if ( GXutil.strcmp(A222BarTra2, "") != 0 )
            {
               AV27Comp += " " + GXutil.trim( A222BarTra2) + " " + GXutil.str( A225BarTraP2, 3, 0) + "%" ;
            }
            if ( GXutil.strcmp(A223BarTra3, "") != 0 )
            {
               AV27Comp += " " + GXutil.trim( A223BarTra3) + " " + GXutil.str( A226BarTraP3, 3, 0) + "%" ;
            }
            if ( GXutil.strcmp(A229BarUrd1, "") != 0 )
            {
               AV27Comp += " " + GXutil.trim( A229BarUrd1) + " " + GXutil.str( A232BarUrdP1, 3, 0) + "%" ;
            }
            if ( GXutil.strcmp(A230BarUrd2, "") != 0 )
            {
               AV27Comp += " " + GXutil.trim( A230BarUrd2) + " " + GXutil.str( A233BarUrdP2, 3, 0) + "%" ;
            }
            hAD00( false, 80) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "3c99144a-8aa9-43d5-8fce-801099ee2ac5", "", context.getHttpContext().getTheme( )), 10, Gx_line+5, 184, Gx_line+78) ;
            getPrinter().GxAttris("Arial", 22, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "REGISTO DE QUALIDADE", ""), 315, Gx_line+5, 684, Gx_line+41, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("3 of 9 Barcode", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30HojRut, "")), 555, Gx_line+47, 769, Gx_line+71, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+80) ;
            hAD00( false, 117) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente: ", ""), 23, Gx_line+14, 79, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 136, Gx_line+14, 325, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço: ", ""), 23, Gx_line+38, 131, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 136, Gx_line+38, 195, Gx_line+56, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 229, Gx_line+38, 244, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 214, Gx_line+38, 222, Gx_line+56, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo: ", ""), 517, Gx_line+14, 566, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 572, Gx_line+14, 736, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Medida: ", ""), 319, Gx_line+61, 377, Gx_line+78, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Gram.: ", ""), 463, Gx_line+61, 513, Gx_line+78, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(10, Gx_line+8, 767, Gx_line+107, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quanti.: ", ""), 619, Gx_line+61, 676, Gx_line+78, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 84, Gx_line+14, 129, Gx_line+32, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("-", 202, Gx_line+38, 207, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 681, Gx_line+61, 748, Gx_line+79, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8BarAncAca1, "")), 375, Gx_line+61, 417, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10BarGraAca, "")), 514, Gx_line+61, 569, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16TotKgs, "ZZZ,ZZ9.99")), 674, Gx_line+84, 748, Gx_line+102, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("(", 666, Gx_line+84, 671, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(")", 751, Gx_line+84, 756, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Enc. Cliente:", ""), 23, Gx_line+84, 107, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 117, Gx_line+84, 226, Gx_line+102, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(10, Gx_line+100, 10, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(767, Gx_line+100, 767, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor:", ""), 23, Gx_line+61, 51, Gx_line+78, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 81, Gx_line+61, 163, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 175, Gx_line+61, 220, Gx_line+79, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Comp, "")), 572, Gx_line+33, 729, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Composiçao: ", ""), 475, Gx_line+33, 566, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28tipdisdsc, "")), 292, Gx_line+33, 439, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Marca:", ""), 244, Gx_line+83, 290, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29MarcaDsc, "")), 294, Gx_line+83, 545, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9BarAncAca2, "")), 413, Gx_line+61, 455, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11BarGraAca2, "")), 556, Gx_line+61, 611, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Dsc_Idtx, "")), 551, Gx_line+83, 659, Gx_line+100, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+117) ;
            AV18i = (short)(1) ;
            AV41GXLvl87 = (byte)(0) ;
            /* Using cursor P0AD04 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A377DisObsTxt = P0AD04_A377DisObsTxt[0] ;
               A376DisObsLin = P0AD04_A376DisObsLin[0] ;
               AV41GXLvl87 = (byte)(1) ;
               if ( AV18i == 1 )
               {
                  hAD00( false, 18) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A377DisObsTxt, "")), 110, Gx_line+0, 486, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observações: ", ""), 19, Gx_line+0, 113, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(10, Gx_line+0, 10, Gx_line+18, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(767, Gx_line+0, 767, Gx_line+18, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               else
               {
                  hAD00( false, 18) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A377DisObsTxt, "")), 110, Gx_line+0, 486, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(10, Gx_line+0, 10, Gx_line+18, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(767, Gx_line+0, 767, Gx_line+18, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               AV18i = (short)(AV18i+1) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( AV41GXLvl87 == 0 )
            {
               hAD00( false, 18) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observações: ", ""), 19, Gx_line+0, 113, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(10, Gx_line+0, 10, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(767, Gx_line+0, 767, Gx_line+18, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
            }
            hAD00( false, 28) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 18, Gx_line+6, 45, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fio", ""), 185, Gx_line+6, 203, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Jogo", ""), 239, Gx_line+6, 268, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pol", ""), 290, Gx_line+6, 309, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LFA", ""), 338, Gx_line+6, 360, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 388, Gx_line+6, 437, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "R. Composiçao:", ""), 456, Gx_line+6, 546, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(10, Gx_line+0, 767, Gx_line+26, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(169, Gx_line+0, 169, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(224, Gx_line+0, 224, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(280, Gx_line+0, 280, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(319, Gx_line+0, 319, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(379, Gx_line+0, 379, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(446, Gx_line+0, 446, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Baritem1, "")), 636, Gx_line+6, 689, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(605, Gx_line+0, 605, Gx_line+26, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+28) ;
            /* Using cursor P0AD05 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A44AlbRecCod = P0AD05_A44AlbRecCod[0] ;
               A8028AlbNumB = P0AD05_A8028AlbNumB[0] ;
               A6463AlbRLote = P0AD05_A6463AlbRLote[0] ;
               A6465AlbRLu = P0AD05_A6465AlbRLu[0] ;
               A4602AlbRMdlCod = P0AD05_A4602AlbRMdlCod[0] ;
               A6464AlbRTelar = P0AD05_A6464AlbRTelar[0] ;
               A8035AlbMaqTej = P0AD05_A8035AlbMaqTej[0] ;
               A6470AlbRTara = P0AD05_A6470AlbRTara[0] ;
               A200BarPieCod = P0AD05_A200BarPieCod[0] ;
               A8028AlbNumB = P0AD05_A8028AlbNumB[0] ;
               A6463AlbRLote = P0AD05_A6463AlbRLote[0] ;
               A6465AlbRLu = P0AD05_A6465AlbRLu[0] ;
               A4602AlbRMdlCod = P0AD05_A4602AlbRMdlCod[0] ;
               A6464AlbRTelar = P0AD05_A6464AlbRTelar[0] ;
               A8035AlbMaqTej = P0AD05_A8035AlbMaqTej[0] ;
               A6470AlbRTara = P0AD05_A6470AlbRTara[0] ;
               AV24AlbNumb = A8028AlbNumB ;
               AV19AlbrLote = A6463AlbRLote ;
               AV22Pgadas = (byte)(DecimalUtil.decToDouble(A6465AlbRLu)) ;
               AV21Jogo3 = GXutil.substring( A4602AlbRMdlCod, 1, 3) ;
               AV20Fio5 = GXutil.substring( A6464AlbRTelar, 1, 5) ;
               AV23Maq6 = GXutil.substring( A8035AlbMaqTej, 1, 6) ;
               hAD00( false, 19) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19AlbrLote, "")), 18, Gx_line+1, 144, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Fio5, "")), 177, Gx_line+1, 241, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Jogo3, "")), 244, Gx_line+1, 283, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22Pgadas), "Z9")), 294, Gx_line+1, 310, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6470AlbRTara, "ZZ9.99")), 327, Gx_line+1, 372, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Maq6, "")), 388, Gx_line+1, 464, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24AlbNumb, "")), 456, Gx_line+1, 582, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26BarItem2, "")), 636, Gx_line+1, 700, Gx_line+19, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV31Fases = "" ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV32Tab_fases[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV33t = (short)(1) ;
            AV34contadorfases = (short)(1) ;
            /* Using cursor P0AD06 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A457FasCod = P0AD06_A457FasCod[0] ;
               A460FasDsc = P0AD06_A460FasDsc[0] ;
               A194BarOrdLin = P0AD06_A194BarOrdLin[0] ;
               A758ProCod = P0AD06_A758ProCod[0] ;
               A460FasDsc = P0AD06_A460FasDsc[0] ;
               if ( AV34contadorfases > 3 )
               {
                  AV32Tab_fases[AV33t-1] = AV31Fases ;
                  AV33t = (short)(AV33t+1) ;
                  AV34contadorfases = (short)(0) ;
                  AV31Fases = "" ;
               }
               AV34contadorfases = (short)(AV34contadorfases+1) ;
               if ( GXutil.strcmp(AV31Fases, "") == 0 )
               {
                  AV31Fases = GXutil.trim( A460FasDsc) ;
               }
               else
               {
                  AV31Fases += "+" + GXutil.trim( A460FasDsc) ;
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            if ( AV34contadorfases > 0 )
            {
               AV32Tab_fases[AV33t-1] = AV31Fases ;
            }
            hAD00( false, 788) ;
            getPrinter().GxDrawRect(5, Gx_line+542, 763, Gx_line+566, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OBSERVAÇÕES", ""), 14, Gx_line+683, 117, Gx_line+700, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TIPO DE BANHO", ""), 13, Gx_line+188, 98, Gx_line+203, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TORÇÃO (ADIANTADO)", ""), 13, Gx_line+204, 138, Gx_line+219, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "VELOCIDADE (m/min)", ""), 13, Gx_line+221, 133, Gx_line+236, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TEMPERATURA (°C)", ""), 13, Gx_line+238, 120, Gx_line+253, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "SOBREALIMENTAÇÃO (%)", ""), 13, Gx_line+254, 154, Gx_line+269, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LARGURA CADEADO (m)", ""), 13, Gx_line+271, 148, Gx_line+286, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LARGURA FINAL (m)", ""), 13, Gx_line+288, 127, Gx_line+303, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DATA / TURNO", ""), 21, Gx_line+392, 103, Gx_line+408, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "GRAMAGEM", ""), 595, Gx_line+6, 676, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TERMOFIXAR", ""), 182, Gx_line+131, 255, Gx_line+146, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "SECAR", ""), 349, Gx_line+131, 388, Gx_line+146, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "1ª PASSAGEM", ""), 495, Gx_line+131, 572, Gx_line+146, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "2ª PASSAGEM", ""), 649, Gx_line+131, 726, Gx_line+146, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Definido", ""), 171, Gx_line+169, 219, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Processado", ""), 240, Gx_line+169, 310, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Definido", ""), 323, Gx_line+169, 371, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Processado", ""), 392, Gx_line+169, 462, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Definido", ""), 475, Gx_line+169, 523, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Processado", ""), 542, Gx_line+169, 612, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Definido", ""), 623, Gx_line+169, 671, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Processado", ""), 691, Gx_line+169, 761, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+147, 762, Gx_line+147, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+168, 762, Gx_line+168, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+185, 762, Gx_line+185, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+202, 762, Gx_line+202, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(158, Gx_line+127, 158, Gx_line+450, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+302, 762, Gx_line+302, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(313, Gx_line+127, 313, Gx_line+435, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(466, Gx_line+126, 466, Gx_line+446, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(617, Gx_line+128, 617, Gx_line+441, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(235, Gx_line+147, 235, Gx_line+390, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(386, Gx_line+147, 386, Gx_line+390, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(538, Gx_line+147, 538, Gx_line+390, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(684, Gx_line+147, 684, Gx_line+390, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+235, 762, Gx_line+235, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+219, 762, Gx_line+219, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+252, 762, Gx_line+252, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+269, 762, Gx_line+269, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+285, 762, Gx_line+285, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13ContDsc, "")), 10, Gx_line+741, 94, Gx_line+754, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(6, Gx_line+3, 504, Gx_line+94, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+23, 504, Gx_line+23, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+41, 504, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+57, 504, Gx_line+57, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+75, 504, Gx_line+75, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+92, 504, Gx_line+92, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(181, Gx_line+3, 181, Gx_line+93, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(288, Gx_line+3, 288, Gx_line+93, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(394, Gx_line+3, 394, Gx_line+93, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ENSAIO", ""), 73, Gx_line+6, 115, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "SOLIDEZ À LAVAGEM", ""), 21, Gx_line+25, 139, Gx_line+40, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "SOLIDEZ À FRICÇÃO", ""), 21, Gx_line+42, 133, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "SOLIDEZ  TRANSP./AGUA", ""), 21, Gx_line+58, 157, Gx_line+73, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CONTRASTE COM BRANCO", ""), 21, Gx_line+77, 170, Gx_line+92, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OBSERVAÇÕES", ""), 200, Gx_line+6, 283, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "RAMULAR A SECO / MOLHADO", ""), 13, Gx_line+339, 156, Gx_line+352, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "VENTILAÇAO (%)", ""), 13, Gx_line+354, 108, Gx_line+369, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+353, 762, Gx_line+353, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+318, 762, Gx_line+318, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+335, 762, Gx_line+335, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+369, 762, Gx_line+369, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "EXAUSTAO (%)", ""), 13, Gx_line+372, 94, Gx_line+387, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(5, Gx_line+127, 763, Gx_line+411, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(506, Gx_line+3, 764, Gx_line+94, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(5, Gx_line+99, 763, Gx_line+123, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dados da Malha em Crú", ""), 13, Gx_line+104, 148, Gx_line+119, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(154, Gx_line+100, 154, Gx_line+122, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Largura (m)", ""), 160, Gx_line+104, 229, Gx_line+119, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(244, Gx_line+100, 244, Gx_line+122, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Gramagem (gr/m2)", ""), 444, Gx_line+103, 553, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(436, Gx_line+100, 436, Gx_line+122, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(560, Gx_line+100, 560, Gx_line+122, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina/Turno", ""), 21, Gx_line+150, 108, Gx_line+166, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Definido/Processado", ""), 21, Gx_line+169, 145, Gx_line+185, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maq:", ""), 164, Gx_line+150, 193, Gx_line+166, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(193, Gx_line+148, 193, Gx_line+169, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Turno:", ""), 242, Gx_line+150, 279, Gx_line+166, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(283, Gx_line+148, 283, Gx_line+168, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maq:", ""), 316, Gx_line+150, 345, Gx_line+166, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+148, 345, Gx_line+169, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Turno:", ""), 394, Gx_line+150, 431, Gx_line+166, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(435, Gx_line+148, 435, Gx_line+168, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maq:", ""), 469, Gx_line+150, 498, Gx_line+166, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(498, Gx_line+148, 498, Gx_line+169, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Turno:", ""), 542, Gx_line+150, 579, Gx_line+166, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(579, Gx_line+148, 579, Gx_line+168, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maq:", ""), 620, Gx_line+150, 649, Gx_line+166, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(649, Gx_line+148, 649, Gx_line+169, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Turno:", ""), 691, Gx_line+150, 728, Gx_line+166, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(731, Gx_line+148, 731, Gx_line+168, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "GRAMAGEM (gr/m²)", ""), 13, Gx_line+304, 124, Gx_line+319, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+389, 763, Gx_line+389, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PH", ""), 13, Gx_line+320, 33, Gx_line+337, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ENCOLHIMENTO COMP.(%)", ""), 165, Gx_line+444, 311, Gx_line+459, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ENCOLHIMENTO LARG.(%)", ""), 165, Gx_line+465, 309, Gx_line+480, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TORÇÃO (%)", ""), 165, Gx_line+484, 235, Gx_line+499, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Largura (m)", ""), 165, Gx_line+502, 234, Gx_line+517, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Gramagem (gr/m²)", ""), 165, Gx_line+525, 272, Gx_line+540, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(158, Gx_line+442, 158, Gx_line+566, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ST / SR / SC", ""), 45, Gx_line+501, 126, Gx_line+518, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ESTABILIDADE", ""), 36, Gx_line+452, 134, Gx_line+469, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DIMENSIONAL", ""), 39, Gx_line+468, 134, Gx_line+485, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(158, Gx_line+521, 763, Gx_line+521, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(158, Gx_line+501, 763, Gx_line+501, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(158, Gx_line+480, 763, Gx_line+480, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(158, Gx_line+460, 763, Gx_line+460, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(313, Gx_line+431, 313, Gx_line+542, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(466, Gx_line+438, 466, Gx_line+543, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(617, Gx_line+438, 617, Gx_line+543, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(763, Gx_line+419, 763, Gx_line+543, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+435, 5, Gx_line+542, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LARG. COMPACTO (m)", ""), 13, Gx_line+571, 140, Gx_line+586, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "GRAMAGEM COMPACTO (gr/m²)", ""), 13, Gx_line+594, 157, Gx_line+607, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TEMPERATURA (°C)", ""), 13, Gx_line+615, 120, Gx_line+630, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "VELOCIDADE (m/min)", ""), 13, Gx_line+635, 133, Gx_line+650, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TORÇÃO (ADIANTADO)", ""), 13, Gx_line+657, 138, Gx_line+672, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ALIMENTAÇÃO (%)", ""), 277, Gx_line+571, 381, Gx_line+586, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TENSÃO (COMPACTO 1)", ""), 277, Gx_line+593, 409, Gx_line+608, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TENSÃO (COMPACTO 2)", ""), 277, Gx_line+615, 409, Gx_line+630, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DATA ", ""), 277, Gx_line+635, 310, Gx_line+650, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ENCOLHIMENTO COMP.(%)", ""), 523, Gx_line+571, 669, Gx_line+586, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TORÇÃO (%)", ""), 523, Gx_line+615, 593, Gx_line+630, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Largura (m)", ""), 523, Gx_line+635, 592, Gx_line+650, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Gramagem (gr/m²)", ""), 523, Gx_line+657, 630, Gx_line+672, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ENCOLHIMENTO LARG.(%)", ""), 523, Gx_line+593, 667, Gx_line+608, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "COMPACTADO", ""), 13, Gx_line+547, 94, Gx_line+562, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+589, 763, Gx_line+589, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+610, 763, Gx_line+610, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+632, 763, Gx_line+632, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+653, 763, Gx_line+653, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+675, 763, Gx_line+675, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(763, Gx_line+560, 763, Gx_line+676, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(158, Gx_line+563, 158, Gx_line+676, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(269, Gx_line+543, 269, Gx_line+675, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(417, Gx_line+542, 417, Gx_line+675, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(515, Gx_line+542, 515, Gx_line+675, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(675, Gx_line+542, 675, Gx_line+674, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(214, Gx_line+542, 214, Gx_line+675, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(466, Gx_line+536, 466, Gx_line+633, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OBSERVAÇÕES", ""), 406, Gx_line+6, 489, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ENSAIO", ""), 321, Gx_line+6, 363, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DÉGRADÉ", ""), 316, Gx_line+25, 368, Gx_line+40, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PILLING", ""), 320, Gx_line+42, 365, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PH", ""), 334, Gx_line+58, 350, Gx_line+73, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "O responsavel", ""), 577, Gx_line+750, 661, Gx_line+765, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data: ___/___/_____", ""), 560, Gx_line+767, 688, Gx_line+784, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(489, Gx_line+750, 759, Gx_line+750, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OURELAS", ""), 21, Gx_line+416, 79, Gx_line+432, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CORTA", ""), 163, Gx_line+416, 205, Gx_line+432, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(210, Gx_line+415, 230, Gx_line+433, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "RESINA", ""), 236, Gx_line+416, 281, Gx_line+432, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(286, Gx_line+415, 306, Gx_line+433, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(5, Gx_line+410, 763, Gx_line+436, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "S", ""), 95, Gx_line+546, 104, Gx_line+562, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(104, Gx_line+545, 123, Gx_line+563, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N", ""), 124, Gx_line+546, 133, Gx_line+562, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(134, Gx_line+545, 153, Gx_line+563, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+565, 5, Gx_line+675, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CORTA", ""), 316, Gx_line+416, 358, Gx_line+432, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(364, Gx_line+415, 384, Gx_line+433, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "RESINA", ""), 390, Gx_line+416, 435, Gx_line+432, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(440, Gx_line+415, 460, Gx_line+433, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CORTA", ""), 472, Gx_line+416, 514, Gx_line+432, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(516, Gx_line+415, 536, Gx_line+433, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "RESINA", ""), 539, Gx_line+416, 584, Gx_line+432, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(585, Gx_line+415, 605, Gx_line+433, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CORTA", ""), 624, Gx_line+416, 666, Gx_line+432, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(669, Gx_line+415, 689, Gx_line+433, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "RESINA", ""), 693, Gx_line+416, 738, Gx_line+432, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(742, Gx_line+415, 762, Gx_line+433, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Tab_fases[1-1], "")), 136, Gx_line+679, 762, Gx_line+697, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Tab_fases[2-1], "")), 136, Gx_line+696, 762, Gx_line+714, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Tab_fases[3-1], "")), 136, Gx_line+714, 762, Gx_line+732, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Definido", ""), 167, Gx_line+547, 209, Gx_line+562, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proce.", ""), 225, Gx_line+547, 258, Gx_line+562, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Definido", ""), 421, Gx_line+547, 463, Gx_line+562, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proce.", ""), 474, Gx_line+547, 507, Gx_line+562, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OPERADOR", ""), 277, Gx_line+657, 338, Gx_line+672, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(717, Gx_line+542, 717, Gx_line+674, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "1º P", ""), 680, Gx_line+547, 702, Gx_line+562, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "2º P", ""), 732, Gx_line+547, 754, Gx_line+562, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+788) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Force skipping of lines */
         hAD00( false, 0) ;
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'ACCESORIOS' Routine */
      returnInSub = false ;
      AV16TotKgs = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0AD07 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV14MacCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A1199MacCod = P0AD07_A1199MacCod[0] ;
         A1203MacBarCod = P0AD07_A1203MacBarCod[0] ;
         A1204MacBarReo = P0AD07_A1204MacBarReo[0] ;
         A1205MacBarPar = P0AD07_A1205MacBarPar[0] ;
         A1201MacLin = P0AD07_A1201MacLin[0] ;
         GXv_decimal4[0] = AV15KgmAgr ;
         GXv_char1[0] = "" ;
         GXv_char5[0] = "" ;
         GXv_int3[0] = 0 ;
         new app.pobsagr(remoteHandle, context).execute( A396EmprCod, A1203MacBarCod, A1204MacBarReo, A1205MacBarPar, GXv_decimal4, GXv_char1, GXv_char5, GXv_int3) ;
         rregqua_group.this.AV15KgmAgr = GXv_decimal4[0] ;
         AV16TotKgs = AV16TotKgs.add(AV15KgmAgr) ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'INDITEX' Routine */
      returnInSub = false ;
      /* Using cursor P0AD08 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV35Cod_Idtx});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A10887Cod_Idtx = P0AD08_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P0AD08_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P0AD08_n10888Dsc_Idtx[0] ;
         AV36Dsc_Idtx = GXutil.trim( A10888Dsc_Idtx) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void hAD00( boolean bFoot ,
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
      this.aP5[0] = rregqua_group.this.Gx_line;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13ContDsc = "" ;
      scmdbuf = "" ;
      P0AD03_A396EmprCod = new String[] {""} ;
      P0AD03_A129BarCod = new int[1] ;
      P0AD03_A132BarCodReo = new byte[1] ;
      P0AD03_A130BarCodPar = new String[] {""} ;
      P0AD03_A361DisCod = new int[1] ;
      P0AD03_A212BarSer = new String[] {""} ;
      P0AD03_A2829BarProPer = new String[] {""} ;
      P0AD03_A2010BarTipDis = new String[] {""} ;
      P0AD03_A181BarMaqPro = new String[] {""} ;
      P0AD03_A9775BarItem1 = new String[] {""} ;
      P0AD03_A9776barItem2 = new String[] {""} ;
      P0AD03_A125BarAncAca1 = new short[1] ;
      P0AD03_A126BarAncAca2 = new short[1] ;
      P0AD03_A1909BarGraAca = new short[1] ;
      P0AD03_A3137BarGraAca2 = new short[1] ;
      P0AD03_A221BarTra1 = new String[] {""} ;
      P0AD03_A224BarTraP1 = new short[1] ;
      P0AD03_A222BarTra2 = new String[] {""} ;
      P0AD03_A225BarTraP2 = new short[1] ;
      P0AD03_A223BarTra3 = new String[] {""} ;
      P0AD03_A226BarTraP3 = new short[1] ;
      P0AD03_A229BarUrd1 = new String[] {""} ;
      P0AD03_A232BarUrdP1 = new short[1] ;
      P0AD03_A230BarUrd2 = new String[] {""} ;
      P0AD03_A233BarUrdP2 = new short[1] ;
      P0AD03_A136BarColNum = new int[1] ;
      P0AD03_A135BarColNom = new String[] {""} ;
      P0AD03_A143BarDisNum = new String[] {""} ;
      P0AD03_A252CliCod = new int[1] ;
      P0AD03_n252CliCod = new boolean[] {false} ;
      P0AD03_A1652BarSerDsc = new String[] {""} ;
      P0AD03_A279CliNom = new String[] {""} ;
      P0AD03_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AD03_n166BarKgm = new boolean[] {false} ;
      A212BarSer = "" ;
      A2829BarProPer = "" ;
      A2010BarTipDis = "" ;
      A181BarMaqPro = "" ;
      A9775BarItem1 = "" ;
      A9776barItem2 = "" ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      A229BarUrd1 = "" ;
      A230BarUrd2 = "" ;
      A135BarColNom = "" ;
      A143BarDisNum = "" ;
      A1652BarSerDsc = "" ;
      A279CliNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV30HojRut = "" ;
      AV35Cod_Idtx = "" ;
      AV28tipdisdsc = "" ;
      GXv_int2 = new byte[1] ;
      AV29MarcaDsc = "" ;
      AV16TotKgs = DecimalUtil.ZERO ;
      AV25Baritem1 = "" ;
      AV26BarItem2 = "" ;
      AV8BarAncAca1 = "" ;
      AV9BarAncAca2 = "" ;
      AV10BarGraAca = "" ;
      AV11BarGraAca2 = "" ;
      AV17Tab_obs = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV17Tab_obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV27Comp = "" ;
      AV36Dsc_Idtx = "" ;
      P0AD04_A396EmprCod = new String[] {""} ;
      P0AD04_A361DisCod = new int[1] ;
      P0AD04_A377DisObsTxt = new String[] {""} ;
      P0AD04_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      P0AD05_A44AlbRecCod = new int[1] ;
      P0AD05_A396EmprCod = new String[] {""} ;
      P0AD05_A129BarCod = new int[1] ;
      P0AD05_A132BarCodReo = new byte[1] ;
      P0AD05_A130BarCodPar = new String[] {""} ;
      P0AD05_A8028AlbNumB = new String[] {""} ;
      P0AD05_A6463AlbRLote = new String[] {""} ;
      P0AD05_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AD05_A4602AlbRMdlCod = new String[] {""} ;
      P0AD05_A6464AlbRTelar = new String[] {""} ;
      P0AD05_A8035AlbMaqTej = new String[] {""} ;
      P0AD05_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AD05_A200BarPieCod = new String[] {""} ;
      A8028AlbNumB = "" ;
      A6463AlbRLote = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A4602AlbRMdlCod = "" ;
      A6464AlbRTelar = "" ;
      A8035AlbMaqTej = "" ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV24AlbNumb = "" ;
      AV19AlbrLote = "" ;
      AV21Jogo3 = "" ;
      AV20Fio5 = "" ;
      AV23Maq6 = "" ;
      AV31Fases = "" ;
      AV32Tab_fases = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV32Tab_fases[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P0AD06_A457FasCod = new String[] {""} ;
      P0AD06_A396EmprCod = new String[] {""} ;
      P0AD06_A129BarCod = new int[1] ;
      P0AD06_A132BarCodReo = new byte[1] ;
      P0AD06_A130BarCodPar = new String[] {""} ;
      P0AD06_A460FasDsc = new String[] {""} ;
      P0AD06_A194BarOrdLin = new short[1] ;
      P0AD06_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A758ProCod = "" ;
      P0AD07_A396EmprCod = new String[] {""} ;
      P0AD07_A1199MacCod = new int[1] ;
      P0AD07_A1203MacBarCod = new int[1] ;
      P0AD07_A1204MacBarReo = new byte[1] ;
      P0AD07_A1205MacBarPar = new String[] {""} ;
      P0AD07_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      AV15KgmAgr = DecimalUtil.ZERO ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_char1 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int3 = new int[1] ;
      P0AD08_A396EmprCod = new String[] {""} ;
      P0AD08_A10887Cod_Idtx = new String[] {""} ;
      P0AD08_A10888Dsc_Idtx = new String[] {""} ;
      P0AD08_n10888Dsc_Idtx = new boolean[] {false} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rregqua_group__default(),
         new Object[] {
             new Object[] {
            P0AD03_A396EmprCod, P0AD03_A129BarCod, P0AD03_A132BarCodReo, P0AD03_A130BarCodPar, P0AD03_A361DisCod, P0AD03_A212BarSer, P0AD03_A2829BarProPer, P0AD03_A2010BarTipDis, P0AD03_A181BarMaqPro, P0AD03_A9775BarItem1,
            P0AD03_A9776barItem2, P0AD03_A125BarAncAca1, P0AD03_A126BarAncAca2, P0AD03_A1909BarGraAca, P0AD03_A3137BarGraAca2, P0AD03_A221BarTra1, P0AD03_A224BarTraP1, P0AD03_A222BarTra2, P0AD03_A225BarTraP2, P0AD03_A223BarTra3,
            P0AD03_A226BarTraP3, P0AD03_A229BarUrd1, P0AD03_A232BarUrdP1, P0AD03_A230BarUrd2, P0AD03_A233BarUrdP2, P0AD03_A136BarColNum, P0AD03_A135BarColNom, P0AD03_A143BarDisNum, P0AD03_A252CliCod, P0AD03_n252CliCod,
            P0AD03_A1652BarSerDsc, P0AD03_A279CliNom, P0AD03_A166BarKgm, P0AD03_n166BarKgm
            }
            , new Object[] {
            P0AD04_A396EmprCod, P0AD04_A361DisCod, P0AD04_A377DisObsTxt, P0AD04_A376DisObsLin
            }
            , new Object[] {
            P0AD05_A44AlbRecCod, P0AD05_A396EmprCod, P0AD05_A129BarCod, P0AD05_A132BarCodReo, P0AD05_A130BarCodPar, P0AD05_A8028AlbNumB, P0AD05_A6463AlbRLote, P0AD05_A6465AlbRLu, P0AD05_A4602AlbRMdlCod, P0AD05_A6464AlbRTelar,
            P0AD05_A8035AlbMaqTej, P0AD05_A6470AlbRTara, P0AD05_A200BarPieCod
            }
            , new Object[] {
            P0AD06_A457FasCod, P0AD06_A396EmprCod, P0AD06_A129BarCod, P0AD06_A132BarCodReo, P0AD06_A130BarCodPar, P0AD06_A460FasDsc, P0AD06_A194BarOrdLin, P0AD06_A758ProCod
            }
            , new Object[] {
            P0AD07_A396EmprCod, P0AD07_A1199MacCod, P0AD07_A1203MacBarCod, P0AD07_A1204MacBarReo, P0AD07_A1205MacBarPar, P0AD07_A1201MacLin
            }
            , new Object[] {
            P0AD08_A396EmprCod, P0AD08_A10887Cod_Idtx, P0AD08_A10888Dsc_Idtx, P0AD08_n10888Dsc_Idtx
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int2[] ;
   private byte AV41GXLvl87 ;
   private byte A376DisObsLin ;
   private byte AV22Pgadas ;
   private byte A1204MacBarReo ;
   private short A125BarAncAca1 ;
   private short A126BarAncAca2 ;
   private short A1909BarGraAca ;
   private short A3137BarGraAca2 ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A232BarUrdP1 ;
   private short A233BarUrdP2 ;
   private short AV18i ;
   private short AV33t ;
   private short AV34contadorfases ;
   private short A194BarOrdLin ;
   private short A1201MacLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int Gx_line ;
   private int M_top ;
   private int M_bot ;
   private int P_lines ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int AV14MacCod ;
   private int GX_I ;
   private int Gx_OldLine ;
   private int A44AlbRecCod ;
   private int A1199MacCod ;
   private int A1203MacBarCod ;
   private int GXv_int3[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV16TotKgs ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6470AlbRTara ;
   private java.math.BigDecimal AV15KgmAgr ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV12ImpCod ;
   private String AV13ContDsc ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A2829BarProPer ;
   private String A2010BarTipDis ;
   private String A181BarMaqPro ;
   private String A9775BarItem1 ;
   private String A9776barItem2 ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String A229BarUrd1 ;
   private String A230BarUrd2 ;
   private String A135BarColNom ;
   private String A143BarDisNum ;
   private String A1652BarSerDsc ;
   private String A279CliNom ;
   private String AV30HojRut ;
   private String AV35Cod_Idtx ;
   private String AV28tipdisdsc ;
   private String AV29MarcaDsc ;
   private String AV25Baritem1 ;
   private String AV26BarItem2 ;
   private String AV8BarAncAca1 ;
   private String AV9BarAncAca2 ;
   private String AV10BarGraAca ;
   private String AV11BarGraAca2 ;
   private String AV17Tab_obs[] ;
   private String AV27Comp ;
   private String AV36Dsc_Idtx ;
   private String A377DisObsTxt ;
   private String A8028AlbNumB ;
   private String A6463AlbRLote ;
   private String A4602AlbRMdlCod ;
   private String A6464AlbRTelar ;
   private String A8035AlbMaqTej ;
   private String A200BarPieCod ;
   private String AV24AlbNumb ;
   private String AV19AlbrLote ;
   private String AV21Jogo3 ;
   private String AV20Fio5 ;
   private String AV23Maq6 ;
   private String AV31Fases ;
   private String AV32Tab_fases[] ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A758ProCod ;
   private String A1205MacBarPar ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean returnInSub ;
   private boolean n10888Dsc_Idtx ;
   private IReportHandler reportHandler ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AD03_A396EmprCod ;
   private int[] P0AD03_A129BarCod ;
   private byte[] P0AD03_A132BarCodReo ;
   private String[] P0AD03_A130BarCodPar ;
   private int[] P0AD03_A361DisCod ;
   private String[] P0AD03_A212BarSer ;
   private String[] P0AD03_A2829BarProPer ;
   private String[] P0AD03_A2010BarTipDis ;
   private String[] P0AD03_A181BarMaqPro ;
   private String[] P0AD03_A9775BarItem1 ;
   private String[] P0AD03_A9776barItem2 ;
   private short[] P0AD03_A125BarAncAca1 ;
   private short[] P0AD03_A126BarAncAca2 ;
   private short[] P0AD03_A1909BarGraAca ;
   private short[] P0AD03_A3137BarGraAca2 ;
   private String[] P0AD03_A221BarTra1 ;
   private short[] P0AD03_A224BarTraP1 ;
   private String[] P0AD03_A222BarTra2 ;
   private short[] P0AD03_A225BarTraP2 ;
   private String[] P0AD03_A223BarTra3 ;
   private short[] P0AD03_A226BarTraP3 ;
   private String[] P0AD03_A229BarUrd1 ;
   private short[] P0AD03_A232BarUrdP1 ;
   private String[] P0AD03_A230BarUrd2 ;
   private short[] P0AD03_A233BarUrdP2 ;
   private int[] P0AD03_A136BarColNum ;
   private String[] P0AD03_A135BarColNom ;
   private String[] P0AD03_A143BarDisNum ;
   private int[] P0AD03_A252CliCod ;
   private boolean[] P0AD03_n252CliCod ;
   private String[] P0AD03_A1652BarSerDsc ;
   private String[] P0AD03_A279CliNom ;
   private java.math.BigDecimal[] P0AD03_A166BarKgm ;
   private boolean[] P0AD03_n166BarKgm ;
   private String[] P0AD04_A396EmprCod ;
   private int[] P0AD04_A361DisCod ;
   private String[] P0AD04_A377DisObsTxt ;
   private byte[] P0AD04_A376DisObsLin ;
   private int[] P0AD05_A44AlbRecCod ;
   private String[] P0AD05_A396EmprCod ;
   private int[] P0AD05_A129BarCod ;
   private byte[] P0AD05_A132BarCodReo ;
   private String[] P0AD05_A130BarCodPar ;
   private String[] P0AD05_A8028AlbNumB ;
   private String[] P0AD05_A6463AlbRLote ;
   private java.math.BigDecimal[] P0AD05_A6465AlbRLu ;
   private String[] P0AD05_A4602AlbRMdlCod ;
   private String[] P0AD05_A6464AlbRTelar ;
   private String[] P0AD05_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P0AD05_A6470AlbRTara ;
   private String[] P0AD05_A200BarPieCod ;
   private String[] P0AD06_A457FasCod ;
   private String[] P0AD06_A396EmprCod ;
   private int[] P0AD06_A129BarCod ;
   private byte[] P0AD06_A132BarCodReo ;
   private String[] P0AD06_A130BarCodPar ;
   private String[] P0AD06_A460FasDsc ;
   private short[] P0AD06_A194BarOrdLin ;
   private String[] P0AD06_A758ProCod ;
   private String[] P0AD07_A396EmprCod ;
   private int[] P0AD07_A1199MacCod ;
   private int[] P0AD07_A1203MacBarCod ;
   private byte[] P0AD07_A1204MacBarReo ;
   private String[] P0AD07_A1205MacBarPar ;
   private short[] P0AD07_A1201MacLin ;
   private String[] P0AD08_A396EmprCod ;
   private String[] P0AD08_A10887Cod_Idtx ;
   private String[] P0AD08_A10888Dsc_Idtx ;
   private boolean[] P0AD08_n10888Dsc_Idtx ;
}

final  class rregqua_group__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AD03", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, T1.BarSer, T1.BarProPer, T1.BarTipDis, T1.BarMaqPro, T1.BarItem1, T1.barItem2, T1.BarAncAca1, T1.BarAncAca2, T1.BarGraAca, T1.BarGraAca2, T1.BarTra1, T1.BarTraP1, T1.BarTra2, T1.BarTraP2, T1.BarTra3, T1.BarTraP3, T1.BarUrd1, T1.BarUrdP1, T1.BarUrd2, T1.BarUrdP2, T1.BarColNum, T1.BarColNom, T1.BarDisNum, T1.CliCod, T1.BarSerDsc, T2.CliNom, COALESCE( T3.BarKgm, 0) AS BarKgm FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AD04", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AD05", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbNumB, T2.AlbRLote, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbMaqTej, T2.AlbRTara, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AD06", "SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AD07", "SELECT EmprCod, MacCod, MacBarCod, MacBarReo, MacBarPar, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AD08", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 4);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 4);
               ((short[]) buf[18])[0] = rslt.getShort(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 4);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 4);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 4);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 13);
               ((String[]) buf[27])[0] = rslt.getString(28, 8);
               ((int[]) buf[28])[0] = rslt.getInt(29);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(30, 26);
               ((String[]) buf[31])[0] = rslt.getString(31, 30);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 28);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
      }
   }

}

