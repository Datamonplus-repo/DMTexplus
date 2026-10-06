package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pretar1_impl extends GXWebReport
{
   public pretar1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV12EmprCod = gxfirstwebparm ;
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV68json_informe = AV79WebSession.getValue(httpContext.getMessage( "ReCalculodePreciosToPRETAR1_json", "")) ;
         /* Using cursor P0A1R2 */
         pr_default.execute(0, new Object[] {AV12EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P0A1R2_A396EmprCod[0] ;
            A407EmprNom = P0A1R2_A407EmprNom[0] ;
            n407EmprNom = P0A1R2_n407EmprNom[0] ;
            AV32EmpNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXt_char1 = AV34Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2346_", ""), (byte)(99), GXv_char2) ;
         pretar1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit0 = GXt_char1 ;
         GXt_char1 = AV33Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( GXutil.trim( AV84Pgmdesc), (byte)(99), GXv_char2) ;
         pretar1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit1 = GXt_char1 ;
         GXt_char1 = AV35Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN601_", ""), (byte)(99), GXv_char2) ;
         pretar1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit2 = GXt_char1 ;
         GXt_char1 = AV36Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2191_", ""), (byte)(99), GXv_char2) ;
         pretar1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit3 = GXt_char1 ;
         GXt_char1 = AV37Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2301_", ""), (byte)(99), GXv_char2) ;
         pretar1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit4 = GXt_char1 ;
         GXt_char1 = AV38Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         pretar1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit5 = GXt_char1 ;
         GXt_char1 = AV39Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
         pretar1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit6 = GXt_char1 ;
         GXt_char1 = AV44Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1355_", ""), (byte)(99), GXv_char2) ;
         pretar1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit7 = GXt_char1 ;
         GXt_char1 = AV45Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN748_", ""), (byte)(99), GXv_char2) ;
         pretar1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit8 = GXt_char1 ;
         GXt_char1 = AV46Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1480_", ""), (byte)(99), GXv_char2) ;
         pretar1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit9 = GXt_char1 ;
         GXt_char1 = AV40Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
         pretar1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit10 = GXt_char1 ;
         GXt_char1 = AV41Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char2) ;
         pretar1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit11 = GXt_char1 ;
         GXt_char1 = AV42Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char2) ;
         pretar1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit12 = GXt_char1 ;
         GXt_char1 = AV43Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char2) ;
         pretar1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit13 = GXt_char1 ;
         GXt_char1 = AV49Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2065_", ""), (byte)(99), GXv_char2) ;
         pretar1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit14 = GXt_char1 ;
         GXt_char1 = AV50Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char2) ;
         pretar1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit15 = GXt_char1 ;
         AV69messages.fromJSonString(AV68json_informe, null);
         AV88GXV1 = 1 ;
         while ( AV88GXV1 <= AV69messages.size() )
         {
            AV70message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV69messages.elementAt(-1+AV88GXV1));
            AV78Descripcion = AV70message.getgxTv_SdtMessages_Message_Description() ;
            AV74albprocod = GXutil.lval( GXutil.substring( AV70message.getgxTv_SdtMessages_Message_Description(), 1, 10)) ;
            AV71barcod = (int)(GXutil.lval( GXutil.substring( AV70message.getgxTv_SdtMessages_Message_Description(), 11, 8))) ;
            AV72barcodreo = (byte)(GXutil.lval( GXutil.substring( AV70message.getgxTv_SdtMessages_Message_Description(), 19, 1))) ;
            AV73barcodpar = GXutil.substring( AV70message.getgxTv_SdtMessages_Message_Description(), 20, 1) ;
            AV75GuiFasLin = (short)(GXutil.lval( GXutil.substring( AV70message.getgxTv_SdtMessages_Message_Description(), 21, 4))) ;
            AV77tipo = AV70message.getgxTv_SdtMessages_Message_Id() ;
            if ( GXutil.strcmp(AV77tipo, "ALBBAR") == 0 )
            {
               /* Using cursor P0A1R3 */
               pr_default.execute(1, new Object[] {AV12EmprCod, Long.valueOf(AV74albprocod), Integer.valueOf(AV71barcod), Byte.valueOf(AV72barcodreo), AV73barcodpar});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A130BarCodPar = P0A1R3_A130BarCodPar[0] ;
                  A132BarCodReo = P0A1R3_A132BarCodReo[0] ;
                  A129BarCod = P0A1R3_A129BarCod[0] ;
                  A30AlbProCod = P0A1R3_A30AlbProCod[0] ;
                  A396EmprCod = P0A1R3_A396EmprCod[0] ;
                  A1261BarAlbKgmE = P0A1R3_A1261BarAlbKgmE[0] ;
                  A2010BarTipDis = P0A1R3_A2010BarTipDis[0] ;
                  A148BarEstReo = P0A1R3_A148BarEstReo[0] ;
                  A252CliCod = P0A1R3_A252CliCod[0] ;
                  n252CliCod = P0A1R3_n252CliCod[0] ;
                  A218BarTipCol = P0A1R3_A218BarTipCol[0] ;
                  A136BarColNum = P0A1R3_A136BarColNum[0] ;
                  A135BarColNom = P0A1R3_A135BarColNom[0] ;
                  A212BarSer = P0A1R3_A212BarSer[0] ;
                  A34AlbProfch = P0A1R3_A34AlbProfch[0] ;
                  A2010BarTipDis = P0A1R3_A2010BarTipDis[0] ;
                  A148BarEstReo = P0A1R3_A148BarEstReo[0] ;
                  A252CliCod = P0A1R3_A252CliCod[0] ;
                  n252CliCod = P0A1R3_n252CliCod[0] ;
                  A218BarTipCol = P0A1R3_A218BarTipCol[0] ;
                  A136BarColNum = P0A1R3_A136BarColNum[0] ;
                  A135BarColNom = P0A1R3_A135BarColNom[0] ;
                  A212BarSer = P0A1R3_A212BarSer[0] ;
                  A34AlbProfch = P0A1R3_A34AlbProfch[0] ;
                  AV51vLiteral = ((GXutil.strcmp(A2010BarTipDis, "L")!=0) ? httpContext.getMessage( "Color", "") : httpContext.getMessage( "Não há preço por Peça", "")) ;
                  AV52vTexto = GXutil.space( (short)(10)) ;
                  if ( A148BarEstReo == 2 )
                  {
                     AV52vTexto = httpContext.getMessage( "Rem. Ext.", "") ;
                  }
                  hA1R0( false, 17) ;
                  getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48FasDsc, "")), 771, Gx_line+1, 889, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28FasCod, "@!")), 661, Gx_line+0, 754, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 11, Gx_line+0, 75, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 91, Gx_line+0, 136, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 161, Gx_line+0, 212, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 223, Gx_line+0, 230, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 232, Gx_line+0, 244, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 355, Gx_line+0, 423, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 436, Gx_line+0, 491, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 546, Gx_line+1, 585, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 601, Gx_line+0, 615, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51vLiteral, "")), 926, Gx_line+2, 1057, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 280, Gx_line+0, 319, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52vTexto, "")), 1025, Gx_line+1, 1068, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2010BarTipDis, "@!")), 250, Gx_line+0, 258, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(1);
            }
            else
            {
               /* Using cursor P0A1R4 */
               pr_default.execute(2, new Object[] {AV12EmprCod, Long.valueOf(AV74albprocod), Integer.valueOf(AV71barcod), Byte.valueOf(AV72barcodreo), AV73barcodpar, Short.valueOf(AV75GuiFasLin)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A1240GuiFasLin = P0A1R4_A1240GuiFasLin[0] ;
                  A130BarCodPar = P0A1R4_A130BarCodPar[0] ;
                  A132BarCodReo = P0A1R4_A132BarCodReo[0] ;
                  A129BarCod = P0A1R4_A129BarCod[0] ;
                  A30AlbProCod = P0A1R4_A30AlbProCod[0] ;
                  A396EmprCod = P0A1R4_A396EmprCod[0] ;
                  A457FasCod = P0A1R4_A457FasCod[0] ;
                  A460FasDsc = P0A1R4_A460FasDsc[0] ;
                  A148BarEstReo = P0A1R4_A148BarEstReo[0] ;
                  A2010BarTipDis = P0A1R4_A2010BarTipDis[0] ;
                  A252CliCod = P0A1R4_A252CliCod[0] ;
                  n252CliCod = P0A1R4_n252CliCod[0] ;
                  A218BarTipCol = P0A1R4_A218BarTipCol[0] ;
                  A136BarColNum = P0A1R4_A136BarColNum[0] ;
                  A135BarColNom = P0A1R4_A135BarColNom[0] ;
                  A212BarSer = P0A1R4_A212BarSer[0] ;
                  A34AlbProfch = P0A1R4_A34AlbProfch[0] ;
                  A148BarEstReo = P0A1R4_A148BarEstReo[0] ;
                  A2010BarTipDis = P0A1R4_A2010BarTipDis[0] ;
                  A252CliCod = P0A1R4_A252CliCod[0] ;
                  n252CliCod = P0A1R4_n252CliCod[0] ;
                  A218BarTipCol = P0A1R4_A218BarTipCol[0] ;
                  A136BarColNum = P0A1R4_A136BarColNum[0] ;
                  A135BarColNom = P0A1R4_A135BarColNom[0] ;
                  A212BarSer = P0A1R4_A212BarSer[0] ;
                  A34AlbProfch = P0A1R4_A34AlbProfch[0] ;
                  A460FasDsc = P0A1R4_A460FasDsc[0] ;
                  AV28FasCod = A457FasCod ;
                  AV48FasDsc = A460FasDsc ;
                  AV51vLiteral = httpContext.getMessage( "Fase", "") ;
                  AV52vTexto = GXutil.space( (short)(10)) ;
                  if ( A148BarEstReo == 2 )
                  {
                     AV52vTexto = httpContext.getMessage( "Rem. Ext.", "") ;
                  }
                  hA1R0( false, 17) ;
                  getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48FasDsc, "")), 771, Gx_line+1, 889, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28FasCod, "@!")), 661, Gx_line+0, 754, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 11, Gx_line+0, 75, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 91, Gx_line+0, 136, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 161, Gx_line+0, 212, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 223, Gx_line+0, 230, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 232, Gx_line+0, 244, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 355, Gx_line+0, 423, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 436, Gx_line+0, 491, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 546, Gx_line+1, 585, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 601, Gx_line+0, 615, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51vLiteral, "")), 926, Gx_line+2, 1057, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 280, Gx_line+0, 319, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52vTexto, "")), 1025, Gx_line+1, 1068, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2010BarTipDis, "@!")), 250, Gx_line+0, 258, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(2);
            }
            AV88GXV1 = (int)(AV88GXV1+1) ;
         }
         AV79WebSession.remove(httpContext.getMessage( "ReCalculodePreciosToPRETAR1_json", ""));
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hA1R0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void hA1R0( boolean bFoot ,
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
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32EmpNom, "")), 10, Gx_line+0, 199, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit1, "")), 10, Gx_line+25, 167, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit0, "")), 904, Gx_line+25, 957, Gx_line+40, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit2, "")), 717, Gx_line+0, 770, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 783, Gx_line+0, 828, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit3, "")), 846, Gx_line+0, 899, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 909, Gx_line+0, 1002, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 964, Gx_line+25, 1003, Gx_line+41, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit4, "")), 17, Gx_line+57, 80, Gx_line+71, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit5, "")), 96, Gx_line+57, 140, Gx_line+71, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit6, "")), 167, Gx_line+57, 236, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit7, "")), 355, Gx_line+57, 431, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit8, "")), 661, Gx_line+57, 714, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit9, "")), 771, Gx_line+57, 850, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+50, 1042, Gx_line+50, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+73, 1042, Gx_line+73, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 601, Gx_line+57, 612, Gx_line+71, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit14, "")), 436, Gx_line+57, 505, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit15, "")), 546, Gx_line+57, 584, Gx_line+71, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 280, Gx_line+57, 323, Gx_line+71, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+76) ;
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
      getPrinter().setMetrics("Times New Roman", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Times New Roman", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV12EmprCod = "" ;
      AV68json_informe = "" ;
      AV79WebSession = httpContext.getWebSession();
      scmdbuf = "" ;
      P0A1R2_A396EmprCod = new String[] {""} ;
      P0A1R2_A407EmprNom = new String[] {""} ;
      P0A1R2_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      AV32EmpNom = "" ;
      AV34Lit0 = "" ;
      AV33Lit1 = "" ;
      AV84Pgmdesc = "" ;
      AV35Lit2 = "" ;
      AV36Lit3 = "" ;
      AV37Lit4 = "" ;
      AV38Lit5 = "" ;
      AV39Lit6 = "" ;
      AV44Lit7 = "" ;
      AV45Lit8 = "" ;
      AV46Lit9 = "" ;
      AV40Lit10 = "" ;
      AV41Lit11 = "" ;
      AV42Lit12 = "" ;
      AV43Lit13 = "" ;
      AV49Lit14 = "" ;
      AV50Lit15 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV69messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV70message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV78Descripcion = "" ;
      AV73barcodpar = "" ;
      AV77tipo = "" ;
      P0A1R3_A130BarCodPar = new String[] {""} ;
      P0A1R3_A132BarCodReo = new byte[1] ;
      P0A1R3_A129BarCod = new int[1] ;
      P0A1R3_A30AlbProCod = new long[1] ;
      P0A1R3_A396EmprCod = new String[] {""} ;
      P0A1R3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1R3_A2010BarTipDis = new String[] {""} ;
      P0A1R3_A148BarEstReo = new byte[1] ;
      P0A1R3_A252CliCod = new int[1] ;
      P0A1R3_n252CliCod = new boolean[] {false} ;
      P0A1R3_A218BarTipCol = new byte[1] ;
      P0A1R3_A136BarColNum = new int[1] ;
      P0A1R3_A135BarColNom = new String[] {""} ;
      P0A1R3_A212BarSer = new String[] {""} ;
      P0A1R3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A2010BarTipDis = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      AV51vLiteral = "" ;
      AV52vTexto = "" ;
      AV48FasDsc = "" ;
      AV28FasCod = "" ;
      P0A1R4_A1240GuiFasLin = new short[1] ;
      P0A1R4_A130BarCodPar = new String[] {""} ;
      P0A1R4_A132BarCodReo = new byte[1] ;
      P0A1R4_A129BarCod = new int[1] ;
      P0A1R4_A30AlbProCod = new long[1] ;
      P0A1R4_A396EmprCod = new String[] {""} ;
      P0A1R4_A457FasCod = new String[] {""} ;
      P0A1R4_A460FasDsc = new String[] {""} ;
      P0A1R4_A148BarEstReo = new byte[1] ;
      P0A1R4_A2010BarTipDis = new String[] {""} ;
      P0A1R4_A252CliCod = new int[1] ;
      P0A1R4_n252CliCod = new boolean[] {false} ;
      P0A1R4_A218BarTipCol = new byte[1] ;
      P0A1R4_A136BarColNum = new int[1] ;
      P0A1R4_A135BarColNom = new String[] {""} ;
      P0A1R4_A212BarSer = new String[] {""} ;
      P0A1R4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pretar1__default(),
         new Object[] {
             new Object[] {
            P0A1R2_A396EmprCod, P0A1R2_A407EmprNom, P0A1R2_n407EmprNom
            }
            , new Object[] {
            P0A1R3_A130BarCodPar, P0A1R3_A132BarCodReo, P0A1R3_A129BarCod, P0A1R3_A30AlbProCod, P0A1R3_A396EmprCod, P0A1R3_A1261BarAlbKgmE, P0A1R3_A2010BarTipDis, P0A1R3_A148BarEstReo, P0A1R3_A252CliCod, P0A1R3_n252CliCod,
            P0A1R3_A218BarTipCol, P0A1R3_A136BarColNum, P0A1R3_A135BarColNom, P0A1R3_A212BarSer, P0A1R3_A34AlbProfch
            }
            , new Object[] {
            P0A1R4_A1240GuiFasLin, P0A1R4_A130BarCodPar, P0A1R4_A132BarCodReo, P0A1R4_A129BarCod, P0A1R4_A30AlbProCod, P0A1R4_A396EmprCod, P0A1R4_A457FasCod, P0A1R4_A460FasDsc, P0A1R4_A148BarEstReo, P0A1R4_A2010BarTipDis,
            P0A1R4_A252CliCod, P0A1R4_n252CliCod, P0A1R4_A218BarTipCol, P0A1R4_A136BarColNum, P0A1R4_A135BarColNom, P0A1R4_A212BarSer, P0A1R4_A34AlbProfch
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV84Pgmdesc = httpContext.getMessage( "Informe de recalculo de precios", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV84Pgmdesc = httpContext.getMessage( "Informe de recalculo de precios", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV72barcodreo ;
   private byte A132BarCodReo ;
   private byte A148BarEstReo ;
   private byte A218BarTipCol ;
   private short gxcookieaux ;
   private short AV75GuiFasLin ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV88GXV1 ;
   private int AV71barcod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int Gx_OldLine ;
   private long AV74albprocod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV12EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String AV32EmpNom ;
   private String AV34Lit0 ;
   private String AV33Lit1 ;
   private String AV84Pgmdesc ;
   private String AV35Lit2 ;
   private String AV36Lit3 ;
   private String AV37Lit4 ;
   private String AV38Lit5 ;
   private String AV39Lit6 ;
   private String AV44Lit7 ;
   private String AV45Lit8 ;
   private String AV46Lit9 ;
   private String AV40Lit10 ;
   private String AV41Lit11 ;
   private String AV42Lit12 ;
   private String AV43Lit13 ;
   private String AV49Lit14 ;
   private String AV50Lit15 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV78Descripcion ;
   private String AV73barcodpar ;
   private String AV77tipo ;
   private String A130BarCodPar ;
   private String A2010BarTipDis ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String AV51vLiteral ;
   private String AV52vTexto ;
   private String AV48FasDsc ;
   private String AV28FasCod ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String Gx_time ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n252CliCod ;
   private String AV68json_informe ;
   private com.genexus.webpanels.WebSession AV79WebSession ;
   private IDataStoreProvider pr_default ;
   private String[] P0A1R2_A396EmprCod ;
   private String[] P0A1R2_A407EmprNom ;
   private boolean[] P0A1R2_n407EmprNom ;
   private String[] P0A1R3_A130BarCodPar ;
   private byte[] P0A1R3_A132BarCodReo ;
   private int[] P0A1R3_A129BarCod ;
   private long[] P0A1R3_A30AlbProCod ;
   private String[] P0A1R3_A396EmprCod ;
   private java.math.BigDecimal[] P0A1R3_A1261BarAlbKgmE ;
   private String[] P0A1R3_A2010BarTipDis ;
   private byte[] P0A1R3_A148BarEstReo ;
   private int[] P0A1R3_A252CliCod ;
   private boolean[] P0A1R3_n252CliCod ;
   private byte[] P0A1R3_A218BarTipCol ;
   private int[] P0A1R3_A136BarColNum ;
   private String[] P0A1R3_A135BarColNom ;
   private String[] P0A1R3_A212BarSer ;
   private java.util.Date[] P0A1R3_A34AlbProfch ;
   private short[] P0A1R4_A1240GuiFasLin ;
   private String[] P0A1R4_A130BarCodPar ;
   private byte[] P0A1R4_A132BarCodReo ;
   private int[] P0A1R4_A129BarCod ;
   private long[] P0A1R4_A30AlbProCod ;
   private String[] P0A1R4_A396EmprCod ;
   private String[] P0A1R4_A457FasCod ;
   private String[] P0A1R4_A460FasDsc ;
   private byte[] P0A1R4_A148BarEstReo ;
   private String[] P0A1R4_A2010BarTipDis ;
   private int[] P0A1R4_A252CliCod ;
   private boolean[] P0A1R4_n252CliCod ;
   private byte[] P0A1R4_A218BarTipCol ;
   private int[] P0A1R4_A136BarColNum ;
   private String[] P0A1R4_A135BarColNom ;
   private String[] P0A1R4_A212BarSer ;
   private java.util.Date[] P0A1R4_A34AlbProfch ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV69messages ;
   private com.genexus.SdtMessages_Message AV70message ;
}

final  class pretar1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A1R2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A1R3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.EmprCod, T1.BarAlbKgmE, T2.BarTipDis, T2.BarEstReo, T2.CliCod, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSer, T3.AlbProfch FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A1R4", "SELECT T1.GuiFasLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.EmprCod, T1.FasCod, T4.FasDsc, T2.BarEstReo, T2.BarTipDis, T2.CliCod, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSer, T3.AlbProfch FROM (((TXPALBFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) INNER JOIN TXPFASPRO T4 ON T4.EmprCod = T1.EmprCod AND T4.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.GuiFasLin = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 28);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

