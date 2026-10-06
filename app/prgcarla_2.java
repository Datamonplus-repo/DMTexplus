package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class prgcarla_2 extends GXReport
{
   public prgcarla_2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prgcarla_2.class ), "" );
   }

   public prgcarla_2( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 )
   {
      prgcarla_2.this.AV37ReportInPut = aP0;
      prgcarla_2.this.A396EmprCod = aP1;
      prgcarla_2.this.A129BarCod = aP2;
      prgcarla_2.this.A132BarCodReo = aP3;
      prgcarla_2.this.A130BarCodPar = aP4;
      prgcarla_2.this.AV19ImpCod = aP5;
      prgcarla_2.this.Gx_out = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName(AV37ReportInPut) ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV18ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REGCLA", ""), GXv_char1) ;
         prgcarla_2.this.AV18ContDsc = GXv_char1[0] ;
         /* Using cursor P0AJB3 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A212BarSer = P0AJB3_A212BarSer[0] ;
            A2829BarProPer = P0AJB3_A2829BarProPer[0] ;
            A2010BarTipDis = P0AJB3_A2010BarTipDis[0] ;
            A181BarMaqPro = P0AJB3_A181BarMaqPro[0] ;
            A361DisCod = P0AJB3_A361DisCod[0] ;
            A9775BarItem1 = P0AJB3_A9775BarItem1[0] ;
            A9776barItem2 = P0AJB3_A9776barItem2[0] ;
            A125BarAncAca1 = P0AJB3_A125BarAncAca1[0] ;
            A126BarAncAca2 = P0AJB3_A126BarAncAca2[0] ;
            A1909BarGraAca = P0AJB3_A1909BarGraAca[0] ;
            A3137BarGraAca2 = P0AJB3_A3137BarGraAca2[0] ;
            A221BarTra1 = P0AJB3_A221BarTra1[0] ;
            A224BarTraP1 = P0AJB3_A224BarTraP1[0] ;
            A222BarTra2 = P0AJB3_A222BarTra2[0] ;
            A225BarTraP2 = P0AJB3_A225BarTraP2[0] ;
            A223BarTra3 = P0AJB3_A223BarTra3[0] ;
            A226BarTraP3 = P0AJB3_A226BarTraP3[0] ;
            A229BarUrd1 = P0AJB3_A229BarUrd1[0] ;
            A232BarUrdP1 = P0AJB3_A232BarUrdP1[0] ;
            A230BarUrd2 = P0AJB3_A230BarUrd2[0] ;
            A233BarUrdP2 = P0AJB3_A233BarUrdP2[0] ;
            A136BarColNum = P0AJB3_A136BarColNum[0] ;
            A135BarColNom = P0AJB3_A135BarColNom[0] ;
            A143BarDisNum = P0AJB3_A143BarDisNum[0] ;
            A252CliCod = P0AJB3_A252CliCod[0] ;
            n252CliCod = P0AJB3_n252CliCod[0] ;
            A1652BarSerDsc = P0AJB3_A1652BarSerDsc[0] ;
            A279CliNom = P0AJB3_A279CliNom[0] ;
            A166BarKgm = P0AJB3_A166BarKgm[0] ;
            n166BarKgm = P0AJB3_n166BarKgm[0] ;
            A279CliNom = P0AJB3_A279CliNom[0] ;
            A166BarKgm = P0AJB3_A166BarKgm[0] ;
            n166BarKgm = P0AJB3_n166BarKgm[0] ;
            AV31MacCod = 0 ;
            AV24Cod_Idtx = A2829BarProPer ;
            /* Execute user subroutine: 'INDITEX' */
            S121 ();
            if ( returnInSub )
            {
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
            GXv_char1[0] = AV13tipdisdsc ;
            GXv_int2[0] = (byte)(0) ;
            new app.pbustdi(remoteHandle, context).execute( A396EmprCod, A2010BarTipDis, GXv_char1, GXv_int2) ;
            prgcarla_2.this.AV13tipdisdsc = GXv_char1[0] ;
            GXv_char1[0] = AV14MarcaDsc ;
            new app.pmarcacliente(remoteHandle, context).execute( A396EmprCod, A181BarMaqPro, GXv_char1) ;
            prgcarla_2.this.AV14MarcaDsc = GXv_char1[0] ;
            GXv_int3[0] = AV31MacCod ;
            new app.pbusmac(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_int3) ;
            prgcarla_2.this.AV31MacCod = GXv_int3[0] ;
            if ( AV31MacCod > 0 )
            {
               /* Execute user subroutine: 'ACCESORIOS' */
               S111 ();
               if ( returnInSub )
               {
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
            }
            else
            {
               AV11TotKgs = A166BarKgm ;
            }
            AV22Baritem1 = GXutil.substring( A9775BarItem1, 1, 10) ;
            AV23BarItem2 = GXutil.substring( A9776barItem2, 1, 10) ;
            AV9BarAncAca1 = "" ;
            AV15BarAncAca2 = "" ;
            if ( (0==A125BarAncAca1) )
            {
               AV9BarAncAca1 = " " ;
            }
            else
            {
               AV9BarAncAca1 = GXutil.str( A125BarAncAca1, 3, 0) ;
            }
            if ( (0==A126BarAncAca2) )
            {
               AV15BarAncAca2 = " " ;
            }
            else
            {
               AV15BarAncAca2 = GXutil.str( A126BarAncAca2, 3, 0) ;
            }
            AV10BarGraAca = "" ;
            AV16BarGraAca2 = "" ;
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
               AV16BarGraAca2 = " " ;
            }
            else
            {
               AV16BarGraAca2 = GXutil.str( A3137BarGraAca2, 4, 0) ;
            }
            AV12Comp = " " ;
            if ( GXutil.strcmp(A221BarTra1, "") != 0 )
            {
               AV12Comp = GXutil.trim( A221BarTra1) + " " + GXutil.str( A224BarTraP1, 3, 0) + "%" ;
            }
            if ( GXutil.strcmp(A222BarTra2, "") != 0 )
            {
               AV12Comp += " " + GXutil.trim( A222BarTra2) + " " + GXutil.str( A225BarTraP2, 3, 0) + "%" ;
            }
            if ( GXutil.strcmp(A223BarTra3, "") != 0 )
            {
               AV12Comp += " " + GXutil.trim( A223BarTra3) + " " + GXutil.str( A226BarTraP3, 3, 0) + "%" ;
            }
            if ( GXutil.strcmp(A229BarUrd1, "") != 0 )
            {
               AV12Comp += " " + GXutil.trim( A229BarUrd1) + " " + GXutil.str( A232BarUrdP1, 3, 0) + "%" ;
            }
            if ( GXutil.strcmp(A230BarUrd2, "") != 0 )
            {
               AV12Comp += " " + GXutil.trim( A230BarUrd2) + " " + GXutil.str( A233BarUrdP2, 3, 0) + "%" ;
            }
            hAJB0( false, 109) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "3c99144a-8aa9-43d5-8fce-801099ee2ac5", "", context.getHttpContext().getTheme( )), 15, Gx_line+16, 189, Gx_line+89) ;
            getPrinter().GxAttris("Arial", 22, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "REGISTO CARDA /  LÁMINA", ""), 319, Gx_line+16, 715, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("3 of 9 Barcode", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8HojRut, "")), 386, Gx_line+63, 625, Gx_line+89, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+109) ;
            hAJB0( false, 109) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente: ", ""), 20, Gx_line+5, 76, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 133, Gx_line+5, 322, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço: ", ""), 20, Gx_line+29, 128, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 133, Gx_line+29, 192, Gx_line+47, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 226, Gx_line+29, 241, Gx_line+47, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 210, Gx_line+29, 218, Gx_line+47, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo: ", ""), 514, Gx_line+5, 563, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 569, Gx_line+5, 733, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Medida: ", ""), 316, Gx_line+53, 374, Gx_line+70, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Gram.: ", ""), 459, Gx_line+53, 509, Gx_line+70, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+0, 764, Gx_line+99, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quanti.: ", ""), 616, Gx_line+53, 673, Gx_line+70, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 81, Gx_line+5, 126, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("-", 199, Gx_line+29, 204, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 678, Gx_line+53, 745, Gx_line+71, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9BarAncAca1, "")), 372, Gx_line+53, 414, Gx_line+71, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10BarGraAca, "")), 510, Gx_line+53, 565, Gx_line+71, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV11TotKgs, "ZZZ,ZZ9.99")), 671, Gx_line+76, 745, Gx_line+94, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("(", 663, Gx_line+76, 668, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(")", 748, Gx_line+76, 753, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Enc. Cliente:", ""), 20, Gx_line+76, 104, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 114, Gx_line+76, 223, Gx_line+94, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor:", ""), 20, Gx_line+53, 48, Gx_line+70, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 78, Gx_line+53, 160, Gx_line+71, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 172, Gx_line+53, 217, Gx_line+71, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Comp, "")), 569, Gx_line+25, 726, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Composiçao: ", ""), 472, Gx_line+25, 563, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13tipdisdsc, "")), 289, Gx_line+25, 436, Gx_line+45, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Marca:", ""), 241, Gx_line+75, 287, Gx_line+92, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14MarcaDsc, "")), 291, Gx_line+75, 542, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15BarAncAca2, "")), 409, Gx_line+53, 451, Gx_line+71, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16BarGraAca2, "")), 553, Gx_line+53, 608, Gx_line+71, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Dsc_Idtx, "")), 548, Gx_line+75, 656, Gx_line+92, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+109) ;
            hAJB0( false, 131) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Registos da Máquina:", ""), 15, Gx_line+0, 158, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(6, Gx_line+17, 763, Gx_line+118, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tambor Cima:", ""), 173, Gx_line+33, 267, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tambor Baixo:", ""), 169, Gx_line+50, 267, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tensão:", ""), 215, Gx_line+67, 267, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Velocidade:", ""), 188, Gx_line+83, 267, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Correia:", ""), 213, Gx_line+100, 267, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pêlo", ""), 339, Gx_line+17, 370, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Contra-Pêlo", ""), 485, Gx_line+17, 564, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "RPM", ""), 681, Gx_line+17, 712, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(163, Gx_line+34, 764, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(163, Gx_line+17, 163, Gx_line+118, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(163, Gx_line+50, 764, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(163, Gx_line+67, 764, Gx_line+67, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(163, Gx_line+83, 764, Gx_line+83, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(163, Gx_line+100, 764, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(281, Gx_line+17, 281, Gx_line+118, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(426, Gx_line+17, 426, Gx_line+101, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(622, Gx_line+17, 622, Gx_line+101, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CARDA:", ""), 69, Gx_line+59, 121, Gx_line+76, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+131) ;
            hAJB0( false, 105) ;
            getPrinter().GxDrawRect(6, Gx_line+0, 763, Gx_line+101, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Direito:", ""), 223, Gx_line+27, 272, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Avesso:", ""), 221, Gx_line+51, 272, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Altura", ""), 385, Gx_line+3, 426, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Velocidade", ""), 597, Gx_line+3, 672, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(163, Gx_line+23, 764, Gx_line+23, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(163, Gx_line+0, 163, Gx_line+101, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(163, Gx_line+47, 764, Gx_line+47, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(163, Gx_line+71, 764, Gx_line+71, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(281, Gx_line+0, 281, Gx_line+101, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(538, Gx_line+0, 538, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LAMINA", ""), 75, Gx_line+43, 128, Gx_line+60, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Escova:", ""), 166, Gx_line+77, 217, Gx_line+94, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "S", ""), 218, Gx_line+77, 228, Gx_line+94, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(228, Gx_line+79, 242, Gx_line+90, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N", ""), 251, Gx_line+77, 261, Gx_line+94, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(263, Gx_line+79, 277, Gx_line+90, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+105) ;
            hAJB0( false, 483) ;
            getPrinter().GxDrawRect(6, Gx_line+17, 763, Gx_line+468, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(369, Gx_line+17, 369, Gx_line+468, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "AMOSTRA 1", ""), 138, Gx_line+233, 218, Gx_line+250, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "AMOSTRA 2", ""), 525, Gx_line+233, 605, Gx_line+250, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+483) ;
            hAJB0( false, 100) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observações:", ""), 13, Gx_line+0, 103, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(13, Gx_line+33, 745, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(13, Gx_line+50, 745, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(13, Gx_line+67, 745, Gx_line+67, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(13, Gx_line+83, 745, Gx_line+83, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+100) ;
            hAJB0( false, 18) ;
            getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18ContDsc, "")), 13, Gx_line+0, 97, Gx_line+13, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAJB0( true, 0) ;
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
      /* 'ACCESORIOS' Routine */
      returnInSub = false ;
      AV11TotKgs = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0AJB4 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV31MacCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1199MacCod = P0AJB4_A1199MacCod[0] ;
         A1203MacBarCod = P0AJB4_A1203MacBarCod[0] ;
         A1204MacBarReo = P0AJB4_A1204MacBarReo[0] ;
         A1205MacBarPar = P0AJB4_A1205MacBarPar[0] ;
         A1201MacLin = P0AJB4_A1201MacLin[0] ;
         GXv_decimal4[0] = AV30KgmAgr ;
         GXv_char1[0] = "" ;
         GXv_char5[0] = "" ;
         GXv_int3[0] = 0 ;
         new app.pobsagr(remoteHandle, context).execute( A396EmprCod, A1203MacBarCod, A1204MacBarReo, A1205MacBarPar, GXv_decimal4, GXv_char1, GXv_char5, GXv_int3) ;
         prgcarla_2.this.AV30KgmAgr = GXv_decimal4[0] ;
         AV11TotKgs = AV11TotKgs.add(AV30KgmAgr) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'INDITEX' Routine */
      returnInSub = false ;
      /* Using cursor P0AJB5 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV24Cod_Idtx});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A10887Cod_Idtx = P0AJB5_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P0AJB5_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P0AJB5_n10888Dsc_Idtx[0] ;
         AV17Dsc_Idtx = GXutil.trim( A10888Dsc_Idtx) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void hAJB0( boolean bFoot ,
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

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("3 of 9 Barcode", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
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
      scmdbuf = "" ;
      P0AJB3_A396EmprCod = new String[] {""} ;
      P0AJB3_A129BarCod = new int[1] ;
      P0AJB3_A132BarCodReo = new byte[1] ;
      P0AJB3_A130BarCodPar = new String[] {""} ;
      P0AJB3_A212BarSer = new String[] {""} ;
      P0AJB3_A2829BarProPer = new String[] {""} ;
      P0AJB3_A2010BarTipDis = new String[] {""} ;
      P0AJB3_A181BarMaqPro = new String[] {""} ;
      P0AJB3_A361DisCod = new int[1] ;
      P0AJB3_A9775BarItem1 = new String[] {""} ;
      P0AJB3_A9776barItem2 = new String[] {""} ;
      P0AJB3_A125BarAncAca1 = new short[1] ;
      P0AJB3_A126BarAncAca2 = new short[1] ;
      P0AJB3_A1909BarGraAca = new short[1] ;
      P0AJB3_A3137BarGraAca2 = new short[1] ;
      P0AJB3_A221BarTra1 = new String[] {""} ;
      P0AJB3_A224BarTraP1 = new short[1] ;
      P0AJB3_A222BarTra2 = new String[] {""} ;
      P0AJB3_A225BarTraP2 = new short[1] ;
      P0AJB3_A223BarTra3 = new String[] {""} ;
      P0AJB3_A226BarTraP3 = new short[1] ;
      P0AJB3_A229BarUrd1 = new String[] {""} ;
      P0AJB3_A232BarUrdP1 = new short[1] ;
      P0AJB3_A230BarUrd2 = new String[] {""} ;
      P0AJB3_A233BarUrdP2 = new short[1] ;
      P0AJB3_A136BarColNum = new int[1] ;
      P0AJB3_A135BarColNom = new String[] {""} ;
      P0AJB3_A143BarDisNum = new String[] {""} ;
      P0AJB3_A252CliCod = new int[1] ;
      P0AJB3_n252CliCod = new boolean[] {false} ;
      P0AJB3_A1652BarSerDsc = new String[] {""} ;
      P0AJB3_A279CliNom = new String[] {""} ;
      P0AJB3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJB3_n166BarKgm = new boolean[] {false} ;
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
      AV24Cod_Idtx = "" ;
      AV13tipdisdsc = "" ;
      GXv_int2 = new byte[1] ;
      AV14MarcaDsc = "" ;
      AV11TotKgs = DecimalUtil.ZERO ;
      AV22Baritem1 = "" ;
      AV23BarItem2 = "" ;
      AV9BarAncAca1 = "" ;
      AV15BarAncAca2 = "" ;
      AV10BarGraAca = "" ;
      AV16BarGraAca2 = "" ;
      AV12Comp = "" ;
      AV8HojRut = "" ;
      AV17Dsc_Idtx = "" ;
      P0AJB4_A396EmprCod = new String[] {""} ;
      P0AJB4_A1199MacCod = new int[1] ;
      P0AJB4_A1203MacBarCod = new int[1] ;
      P0AJB4_A1204MacBarReo = new byte[1] ;
      P0AJB4_A1205MacBarPar = new String[] {""} ;
      P0AJB4_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      AV30KgmAgr = DecimalUtil.ZERO ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_char1 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int3 = new int[1] ;
      P0AJB5_A396EmprCod = new String[] {""} ;
      P0AJB5_A10887Cod_Idtx = new String[] {""} ;
      P0AJB5_A10888Dsc_Idtx = new String[] {""} ;
      P0AJB5_n10888Dsc_Idtx = new boolean[] {false} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prgcarla_2__default(),
         new Object[] {
             new Object[] {
            P0AJB3_A396EmprCod, P0AJB3_A129BarCod, P0AJB3_A132BarCodReo, P0AJB3_A130BarCodPar, P0AJB3_A212BarSer, P0AJB3_A2829BarProPer, P0AJB3_A2010BarTipDis, P0AJB3_A181BarMaqPro, P0AJB3_A361DisCod, P0AJB3_A9775BarItem1,
            P0AJB3_A9776barItem2, P0AJB3_A125BarAncAca1, P0AJB3_A126BarAncAca2, P0AJB3_A1909BarGraAca, P0AJB3_A3137BarGraAca2, P0AJB3_A221BarTra1, P0AJB3_A224BarTraP1, P0AJB3_A222BarTra2, P0AJB3_A225BarTraP2, P0AJB3_A223BarTra3,
            P0AJB3_A226BarTraP3, P0AJB3_A229BarUrd1, P0AJB3_A232BarUrdP1, P0AJB3_A230BarUrd2, P0AJB3_A233BarUrdP2, P0AJB3_A136BarColNum, P0AJB3_A135BarColNom, P0AJB3_A143BarDisNum, P0AJB3_A252CliCod, P0AJB3_n252CliCod,
            P0AJB3_A1652BarSerDsc, P0AJB3_A279CliNom, P0AJB3_A166BarKgm, P0AJB3_n166BarKgm
            }
            , new Object[] {
            P0AJB4_A396EmprCod, P0AJB4_A1199MacCod, P0AJB4_A1203MacBarCod, P0AJB4_A1204MacBarReo, P0AJB4_A1205MacBarPar, P0AJB4_A1201MacLin
            }
            , new Object[] {
            P0AJB5_A396EmprCod, P0AJB5_A10887Cod_Idtx, P0AJB5_A10888Dsc_Idtx, P0AJB5_n10888Dsc_Idtx
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int2[] ;
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
   private short A1201MacLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int AV31MacCod ;
   private int Gx_OldLine ;
   private int A1199MacCod ;
   private int A1203MacBarCod ;
   private int GXv_int3[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV11TotKgs ;
   private java.math.BigDecimal AV30KgmAgr ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV19ImpCod ;
   private String Gx_out ;
   private String AV18ContDsc ;
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
   private String AV24Cod_Idtx ;
   private String AV13tipdisdsc ;
   private String AV14MarcaDsc ;
   private String AV22Baritem1 ;
   private String AV23BarItem2 ;
   private String AV9BarAncAca1 ;
   private String AV15BarAncAca2 ;
   private String AV10BarGraAca ;
   private String AV16BarGraAca2 ;
   private String AV12Comp ;
   private String AV8HojRut ;
   private String AV17Dsc_Idtx ;
   private String A1205MacBarPar ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean returnInSub ;
   private boolean n10888Dsc_Idtx ;
   private String AV37ReportInPut ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJB3_A396EmprCod ;
   private int[] P0AJB3_A129BarCod ;
   private byte[] P0AJB3_A132BarCodReo ;
   private String[] P0AJB3_A130BarCodPar ;
   private String[] P0AJB3_A212BarSer ;
   private String[] P0AJB3_A2829BarProPer ;
   private String[] P0AJB3_A2010BarTipDis ;
   private String[] P0AJB3_A181BarMaqPro ;
   private int[] P0AJB3_A361DisCod ;
   private String[] P0AJB3_A9775BarItem1 ;
   private String[] P0AJB3_A9776barItem2 ;
   private short[] P0AJB3_A125BarAncAca1 ;
   private short[] P0AJB3_A126BarAncAca2 ;
   private short[] P0AJB3_A1909BarGraAca ;
   private short[] P0AJB3_A3137BarGraAca2 ;
   private String[] P0AJB3_A221BarTra1 ;
   private short[] P0AJB3_A224BarTraP1 ;
   private String[] P0AJB3_A222BarTra2 ;
   private short[] P0AJB3_A225BarTraP2 ;
   private String[] P0AJB3_A223BarTra3 ;
   private short[] P0AJB3_A226BarTraP3 ;
   private String[] P0AJB3_A229BarUrd1 ;
   private short[] P0AJB3_A232BarUrdP1 ;
   private String[] P0AJB3_A230BarUrd2 ;
   private short[] P0AJB3_A233BarUrdP2 ;
   private int[] P0AJB3_A136BarColNum ;
   private String[] P0AJB3_A135BarColNom ;
   private String[] P0AJB3_A143BarDisNum ;
   private int[] P0AJB3_A252CliCod ;
   private boolean[] P0AJB3_n252CliCod ;
   private String[] P0AJB3_A1652BarSerDsc ;
   private String[] P0AJB3_A279CliNom ;
   private java.math.BigDecimal[] P0AJB3_A166BarKgm ;
   private boolean[] P0AJB3_n166BarKgm ;
   private String[] P0AJB4_A396EmprCod ;
   private int[] P0AJB4_A1199MacCod ;
   private int[] P0AJB4_A1203MacBarCod ;
   private byte[] P0AJB4_A1204MacBarReo ;
   private String[] P0AJB4_A1205MacBarPar ;
   private short[] P0AJB4_A1201MacLin ;
   private String[] P0AJB5_A396EmprCod ;
   private String[] P0AJB5_A10887Cod_Idtx ;
   private String[] P0AJB5_A10888Dsc_Idtx ;
   private boolean[] P0AJB5_n10888Dsc_Idtx ;
}

final  class prgcarla_2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJB3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarSer, T1.BarProPer, T1.BarTipDis, T1.BarMaqPro, T1.DisCod, T1.BarItem1, T1.barItem2, T1.BarAncAca1, T1.BarAncAca2, T1.BarGraAca, T1.BarGraAca2, T1.BarTra1, T1.BarTraP1, T1.BarTra2, T1.BarTraP2, T1.BarTra3, T1.BarTraP3, T1.BarUrd1, T1.BarUrdP1, T1.BarUrd2, T1.BarUrdP2, T1.BarColNum, T1.BarColNom, T1.BarDisNum, T1.CliCod, T1.BarSerDsc, T2.CliNom, COALESCE( T3.BarKgm, 0) AS BarKgm FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJB4", "SELECT EmprCod, MacCod, MacBarCod, MacBarReo, MacBarPar, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJB5", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 2 :
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
               stmt.setString(2, (String)parms[1], 4);
               return;
      }
   }

}

