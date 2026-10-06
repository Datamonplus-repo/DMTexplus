package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rdocprecopy1 extends GXReport
{
   public rdocprecopy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rdocprecopy1.class ), "" );
   }

   public rdocprecopy1( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 )
   {
      rdocprecopy1.this.AV37ReportInPut = aP0;
      rdocprecopy1.this.A396EmprCod = aP1;
      rdocprecopy1.this.AV20CliCod = aP2;
      rdocprecopy1.this.AV21CliNom = aP3;
      rdocprecopy1.this.AV10Destino = aP4;
      rdocprecopy1.this.AV34Precios_cliente_mail_Json = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 12 ;
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*12)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV35Precios_cliente_mail_sdt.fromJSonString(AV34Precios_cliente_mail_Json, null);
         /* Using cursor P0ANI2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A8335EmpItm2 = P0ANI2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P0ANI2_n8335EmpItm2[0] ;
            A8334EmpItm1 = P0ANI2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P0ANI2_n8334EmpItm1[0] ;
            A8337EmpItm4 = P0ANI2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P0ANI2_n8337EmpItm4[0] ;
            A8336EmpItm3 = P0ANI2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P0ANI2_n8336EmpItm3[0] ;
            AV30Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV31Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXv_char1[0] = AV29Contdsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DOCPRE", ""), GXv_char1) ;
         rdocprecopy1.this.AV29Contdsc = GXv_char1[0] ;
         AV11i = (byte)(1) ;
         AV32CtrlVar1 = " " ;
         AV33LastVar1 = " " ;
         AV42GXV1 = 1 ;
         while ( AV42GXV1 <= AV35Precios_cliente_mail_sdt.size() )
         {
            AV36Precios_cliente_mail_sdt_item = (app.facturacion.SdtPrecios_cliente_mail_SDT_Item)((app.facturacion.SdtPrecios_cliente_mail_SDT_Item)AV35Precios_cliente_mail_sdt.elementAt(-1+AV42GXV1));
            AV13Cartaz = AV36Precios_cliente_mail_sdt_item.getgxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal() ;
            AV15PreKgm = AV36Precios_cliente_mail_sdt_item.getgxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm() ;
            AV17NomCli = AV36Precios_cliente_mail_sdt_item.getgxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli() ;
            AV26ColNum = AV36Precios_cliente_mail_sdt_item.getgxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnum() ;
            AV18SerDsc = AV36Precios_cliente_mail_sdt_item.getgxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc() ;
            AV22TipArtDsc = AV36Precios_cliente_mail_sdt_item.getgxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc() ;
            AV27ForColNom = AV36Precios_cliente_mail_sdt_item.getgxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom() ;
            AV32CtrlVar1 = AV13Cartaz + AV27ForColNom + GXutil.str( AV26ColNum, 6, 0) ;
            if ( GXutil.strcmp(AV32CtrlVar1, AV33LastVar1) != 0 )
            {
               hANI0( false, 19) ;
               getPrinter().GxAttris("Arial Narrow", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Cartaz, "")), 38, Gx_line+0, 102, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18SerDsc, "")), 166, Gx_line+0, 275, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26ColNum), "ZZZZZ9")), 610, Gx_line+0, 642, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17NomCli, "")), 392, Gx_line+0, 447, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15PreKgm, "ZZZ9.999")), 700, Gx_line+0, 743, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(158, Gx_line+0, 158, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(370, Gx_line+0, 370, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(589, Gx_line+0, 589, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(674, Gx_line+0, 674, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(29, Gx_line+0, 29, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(767, Gx_line+0, 767, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27ForColNom, "")), 507, Gx_line+1, 562, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(486, Gx_line+0, 486, Gx_line+18, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
            }
            AV33LastVar1 = AV13Cartaz + AV27ForColNom + GXutil.str( AV26ColNum, 6, 0) ;
            AV11i = (byte)(AV11i+1) ;
            AV42GXV1 = (int)(AV42GXV1+1) ;
         }
         hANI0( false, 14) ;
         getPrinter().GxDrawLine(29, Gx_line+9, 768, Gx_line+9, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(29, Gx_line+0, 29, Gx_line+10, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(767, Gx_line+0, 767, Gx_line+10, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(158, Gx_line+0, 158, Gx_line+10, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(370, Gx_line+0, 370, Gx_line+10, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(486, Gx_line+0, 486, Gx_line+10, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(589, Gx_line+0, 589, Gx_line+10, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(674, Gx_line+0, 674, Gx_line+10, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+14) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hANI0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void hANI0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial Narrow", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( " Sem outro assunto de momento e na expectativa de ter correspondido plenamente à V.", ""), 92, Gx_line+39, 646, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "solicitação, apresentamos os melhores cumprimentos", ""), 58, Gx_line+56, 395, Gx_line+77, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O Director Geral", ""), 434, Gx_line+92, 512, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Eng. Hernâni Gouveia", ""), 425, Gx_line+113, 521, Gx_line+129, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(423, Gx_line+114, 523, Gx_line+114, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "As operações de acabamento serão debitadas caso a caso em função da sua implementação e de acordo", ""), 92, Gx_line+4, 763, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "com a n/ tabela de preços.", ""), 58, Gx_line+22, 228, Gx_line+43, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Contdsc, "")), 30, Gx_line+121, 176, Gx_line+136, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(18, Gx_line+138, 757, Gx_line+138, 1, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Texto_1, "")), 30, Gx_line+140, 698, Gx_line+157, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Texto_2, "")), 55, Gx_line+158, 681, Gx_line+175, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+175) ;
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
            getPrinter().GxAttris("Arial Narrow", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Assunto: Comunicação de Preços a ", ""), 160, Gx_line+159, 395, Gx_line+180, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial Narrow", 12, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21CliNom, "")), 414, Gx_line+159, 603, Gx_line+181, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(29, Gx_line+154, 768, Gx_line+186, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial Narrow", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ex.mo(s) Senhor(s) ", ""), 75, Gx_line+204, 201, Gx_line+225, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Monotype Corsiva", 12, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Destino, "")), 75, Gx_line+230, 441, Gx_line+250, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial Narrow", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Na sequência da V. consulta que desde já agradecemos, passamos  a  enviar a V. Ex.cia(s) os nossos ", ""), 75, Gx_line+272, 728, Gx_line+293, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "melhores preços para a reprodução das cores  na malha abaixo mencionada:", ""), 60, Gx_line+291, 546, Gx_line+312, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial Narrow", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cartaz", ""), 79, Gx_line+335, 114, Gx_line+353, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Malha", ""), 222, Gx_line+335, 255, Gx_line+353, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fibra", ""), 265, Gx_line+335, 294, Gx_line+353, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Vª Refª", ""), 400, Gx_line+335, 439, Gx_line+353, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nª Refª", ""), 613, Gx_line+335, 653, Gx_line+353, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tingimento (€)", ""), 681, Gx_line+335, 761, Gx_line+353, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(29, Gx_line+330, 768, Gx_line+356, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(158, Gx_line+331, 158, Gx_line+363, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(370, Gx_line+331, 370, Gx_line+363, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(589, Gx_line+331, 589, Gx_line+363, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(674, Gx_line+331, 674, Gx_line+363, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(29, Gx_line+355, 29, Gx_line+363, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(767, Gx_line+355, 767, Gx_line+363, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial Narrow", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 373, Gx_line+127, 426, Gx_line+149, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 258, Gx_line+335, 262, Gx_line+351, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial Narrow", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nossa Côr", ""), 505, Gx_line+334, 563, Gx_line+352, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(486, Gx_line+331, 486, Gx_line+363, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 29, Gx_line+7, 786, Gx_line+93) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+364) ;
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
      add_metrics3( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial Narrow", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial Narrow", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Monotype Corsiva", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV35Precios_cliente_mail_sdt = new GXBaseCollection<app.facturacion.SdtPrecios_cliente_mail_SDT_Item>(app.facturacion.SdtPrecios_cliente_mail_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P0ANI2_A396EmprCod = new String[] {""} ;
      P0ANI2_A8335EmpItm2 = new String[] {""} ;
      P0ANI2_n8335EmpItm2 = new boolean[] {false} ;
      P0ANI2_A8334EmpItm1 = new String[] {""} ;
      P0ANI2_n8334EmpItm1 = new boolean[] {false} ;
      P0ANI2_A8337EmpItm4 = new String[] {""} ;
      P0ANI2_n8337EmpItm4 = new boolean[] {false} ;
      P0ANI2_A8336EmpItm3 = new String[] {""} ;
      P0ANI2_n8336EmpItm3 = new boolean[] {false} ;
      A8335EmpItm2 = "" ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      AV30Texto_1 = "" ;
      AV31Texto_2 = "" ;
      AV29Contdsc = "" ;
      GXv_char1 = new String[1] ;
      AV32CtrlVar1 = "" ;
      AV33LastVar1 = "" ;
      AV36Precios_cliente_mail_sdt_item = new app.facturacion.SdtPrecios_cliente_mail_SDT_Item(remoteHandle, context);
      AV13Cartaz = "" ;
      AV15PreKgm = DecimalUtil.ZERO ;
      AV17NomCli = "" ;
      AV18SerDsc = "" ;
      AV22TipArtDsc = "" ;
      AV27ForColNom = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rdocprecopy1__default(),
         new Object[] {
             new Object[] {
            P0ANI2_A396EmprCod, P0ANI2_A8335EmpItm2, P0ANI2_n8335EmpItm2, P0ANI2_A8334EmpItm1, P0ANI2_n8334EmpItm1, P0ANI2_A8337EmpItm4, P0ANI2_n8337EmpItm4, P0ANI2_A8336EmpItm3, P0ANI2_n8336EmpItm3
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV11i ;
   private short Gx_err ;
   private int AV20CliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV42GXV1 ;
   private int AV26ColNum ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV15PreKgm ;
   private String A396EmprCod ;
   private String AV21CliNom ;
   private String AV10Destino ;
   private String scmdbuf ;
   private String A8335EmpItm2 ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String AV30Texto_1 ;
   private String AV31Texto_2 ;
   private String AV29Contdsc ;
   private String GXv_char1[] ;
   private String AV32CtrlVar1 ;
   private String AV33LastVar1 ;
   private String AV13Cartaz ;
   private String AV17NomCli ;
   private String AV18SerDsc ;
   private String AV22TipArtDsc ;
   private String AV27ForColNom ;
   private java.util.Date Gx_date ;
   private boolean n8335EmpItm2 ;
   private boolean n8334EmpItm1 ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private String AV34Precios_cliente_mail_Json ;
   private String AV37ReportInPut ;
   private IDataStoreProvider pr_default ;
   private String[] P0ANI2_A396EmprCod ;
   private String[] P0ANI2_A8335EmpItm2 ;
   private boolean[] P0ANI2_n8335EmpItm2 ;
   private String[] P0ANI2_A8334EmpItm1 ;
   private boolean[] P0ANI2_n8334EmpItm1 ;
   private String[] P0ANI2_A8337EmpItm4 ;
   private boolean[] P0ANI2_n8337EmpItm4 ;
   private String[] P0ANI2_A8336EmpItm3 ;
   private boolean[] P0ANI2_n8336EmpItm3 ;
   private GXBaseCollection<app.facturacion.SdtPrecios_cliente_mail_SDT_Item> AV35Precios_cliente_mail_sdt ;
   private app.facturacion.SdtPrecios_cliente_mail_SDT_Item AV36Precios_cliente_mail_sdt_item ;
}

final  class rdocprecopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ANI2", "SELECT EmprCod, EmpItm2, EmpItm1, EmpItm4, EmpItm3 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
      }
   }

}

