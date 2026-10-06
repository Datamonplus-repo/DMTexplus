package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadoincidenciasreceta_impl extends GXWebReport
{
   public listadoincidenciasreceta_impl( com.genexus.internet.HttpContext context )
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
         AV46EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV9BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            AV11BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            AV10BarCodPar = httpContext.GetPar( "BarCodPar") ;
            AV37RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
            Gx_out = httpContext.GetPar( "Gx_out") ;
         }
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
      M_bot = 0 ;
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
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
         GXt_char1 = AV24Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV50Pgmname, (byte)(99), GXv_char2) ;
         listadoincidenciasreceta_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit2 = GXt_char1 ;
         GXt_char1 = AV25Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char2) ;
         listadoincidenciasreceta_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit3 = GXt_char1 ;
         GXt_char1 = AV26Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1480_", ""), (byte)(99), GXv_char2) ;
         listadoincidenciasreceta_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit4 = GXt_char1 ;
         GXt_char1 = AV27Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$UNIDAD", ""), (byte)(99), GXv_char2) ;
         listadoincidenciasreceta_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit5 = GXt_char1 ;
         GXt_char1 = AV28Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN378_", ""), (byte)(99), GXv_char2) ;
         listadoincidenciasreceta_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit6 = GXt_char1 ;
         GXt_char1 = AV29Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char2) ;
         listadoincidenciasreceta_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit7 = GXt_char1 ;
         GXt_char1 = AV30Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1020_", ""), (byte)(99), GXv_char2) ;
         listadoincidenciasreceta_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit8 = GXt_char1 ;
         GXt_char1 = AV31Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1353_", ""), (byte)(99), GXv_char2) ;
         listadoincidenciasreceta_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit9 = GXt_char1 ;
         GXt_char1 = AV19Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
         listadoincidenciasreceta_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit10 = GXt_char1 ;
         GXt_char1 = AV20Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char2) ;
         listadoincidenciasreceta_impl.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit11 = GXt_char1 ;
         GXt_char1 = AV21Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char2) ;
         listadoincidenciasreceta_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit12 = GXt_char1 ;
         GXt_char1 = AV22Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_ ", ""), (byte)(99), GXv_char2) ;
         listadoincidenciasreceta_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit13 = GXt_char1 ;
         GXt_char1 = AV23Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1302_", ""), (byte)(99), GXv_char2) ;
         listadoincidenciasreceta_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit14 = GXt_char1 ;
         /* Using cursor P0AQN2 */
         pr_default.execute(0, new Object[] {AV46EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P0AQN2_A396EmprCod[0] ;
            A407EmprNom = P0AQN2_A407EmprNom[0] ;
            n407EmprNom = P0AQN2_n407EmprNom[0] ;
            AV14EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXv_char2[0] = AV46EmprCod ;
         GXv_char3[0] = "030100" ;
         GXv_int4[0] = AV44ValCos ;
         new app.pbuscou(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
         listadoincidenciasreceta_impl.this.AV46EmprCod = GXv_char2[0] ;
         listadoincidenciasreceta_impl.this.AV44ValCos = GXv_int4[0] ;
         AV13Consumos = (byte)(0) ;
         GXv_int4[0] = AV13Consumos ;
         new app.pbuscon(remoteHandle, context).execute( AV46EmprCod, "011100", GXv_int4) ;
         listadoincidenciasreceta_impl.this.AV13Consumos = (byte)((byte)(GXv_int4[0])) ;
         if ( AV13Consumos == 0 )
         {
            AV30Lit8 += httpContext.getMessage( " C.C.", "") ;
         }
         AV15Flag = (byte)(0) ;
         GXv_char3[0] = AV46EmprCod ;
         GXv_int4[0] = AV9BarCod ;
         GXv_int5[0] = AV11BarCodReo ;
         GXv_char2[0] = AV10BarCodPar ;
         GXv_decimal6[0] = AV38RecTotKgm ;
         GXv_char7[0] = AV32MaqCod ;
         GXv_int8[0] = AV39RecVolPrd ;
         GXv_int9[0] = AV18Linmaq ;
         new app.pfo00191(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_decimal6, GXv_char7, GXv_int8, GXv_int9) ;
         listadoincidenciasreceta_impl.this.AV46EmprCod = GXv_char3[0] ;
         listadoincidenciasreceta_impl.this.AV9BarCod = GXv_int4[0] ;
         listadoincidenciasreceta_impl.this.AV11BarCodReo = GXv_int5[0] ;
         listadoincidenciasreceta_impl.this.AV10BarCodPar = GXv_char2[0] ;
         listadoincidenciasreceta_impl.this.AV38RecTotKgm = GXv_decimal6[0] ;
         listadoincidenciasreceta_impl.this.AV32MaqCod = GXv_char7[0] ;
         listadoincidenciasreceta_impl.this.AV39RecVolPrd = GXv_int8[0] ;
         listadoincidenciasreceta_impl.this.AV18Linmaq = GXv_int9[0] ;
         /* Using cursor P0AQN3 */
         pr_default.execute(1, new Object[] {AV46EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV11BarCodReo), AV10BarCodPar, Short.valueOf(AV37RecLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2804RecLinMaq = P0AQN3_A2804RecLinMaq[0] ;
            A396EmprCod = P0AQN3_A396EmprCod[0] ;
            A130BarCodPar = P0AQN3_A130BarCodPar[0] ;
            A132BarCodReo = P0AQN3_A132BarCodReo[0] ;
            A129BarCod = P0AQN3_A129BarCod[0] ;
            A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            AV16Hdr = A13696BarNHdr ;
            AV37RecLinMaq = AV18Linmaq ;
            hAQN0( false, 54) ;
            getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 170, Gx_line+23, 221, Gx_line+40, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 228, Gx_line+23, 235, Gx_line+40, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 242, Gx_line+23, 254, Gx_line+40, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38RecTotKgm, "ZZZZZZ9.99")), 606, Gx_line+23, 670, Gx_line+40, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39RecVolPrd), "ZZZZ9")), 509, Gx_line+23, 541, Gx_line+40, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(54, Gx_line+14, 699, Gx_line+43, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37RecLinMaq), "ZZZ9")), 331, Gx_line+23, 357, Gx_line+40, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("(", 323, Gx_line+23, 328, Gx_line+39, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(")", 363, Gx_line+23, 368, Gx_line+39, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32MaqCod, "")), 383, Gx_line+24, 453, Gx_line+41, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit10, "")), 98, Gx_line+23, 151, Gx_line+40, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit11, "")), 259, Gx_line+23, 329, Gx_line+40, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit12, "")), 451, Gx_line+23, 532, Gx_line+40, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit13, "")), 549, Gx_line+23, 602, Gx_line+40, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+54) ;
            AV55GXLvl54 = (byte)(0) ;
            /* Using cursor P0AQN4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A4024RecMar = P0AQN4_A4024RecMar[0] ;
               A686PrdCant = P0AQN4_A686PrdCant[0] ;
               A490ForPrdUMe = P0AQN4_A490ForPrdUMe[0] ;
               n490ForPrdUMe = P0AQN4_n490ForPrdUMe[0] ;
               A743PrdUniCon = P0AQN4_A743PrdUniCon[0] ;
               A704PrdExiAlm = P0AQN4_A704PrdExiAlm[0] ;
               A705PrdExiCC = P0AQN4_A705PrdExiCC[0] ;
               A685PrdCanRes = P0AQN4_A685PrdCanRes[0] ;
               A684PrdCanPen = P0AQN4_A684PrdCanPen[0] ;
               A707PrdFacCon = P0AQN4_A707PrdFacCon[0] ;
               A488ForPrdDsc = P0AQN4_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P0AQN4_n488ForPrdDsc[0] ;
               A431FacCon = P0AQN4_A431FacCon[0] ;
               A875RecPrdDsc = P0AQN4_A875RecPrdDsc[0] ;
               A718PrdNom = P0AQN4_A718PrdNom[0] ;
               A719PrdNum = P0AQN4_A719PrdNum[0] ;
               n719PrdNum = P0AQN4_n719PrdNum[0] ;
               A1273RecLinPro = P0AQN4_A1273RecLinPro[0] ;
               A811RecLin = P0AQN4_A811RecLin[0] ;
               A743PrdUniCon = P0AQN4_A743PrdUniCon[0] ;
               A704PrdExiAlm = P0AQN4_A704PrdExiAlm[0] ;
               A705PrdExiCC = P0AQN4_A705PrdExiCC[0] ;
               A685PrdCanRes = P0AQN4_A685PrdCanRes[0] ;
               A684PrdCanPen = P0AQN4_A684PrdCanPen[0] ;
               A707PrdFacCon = P0AQN4_A707PrdFacCon[0] ;
               A718PrdNom = P0AQN4_A718PrdNom[0] ;
               A488ForPrdDsc = P0AQN4_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P0AQN4_n488ForPrdDsc[0] ;
               AV55GXLvl54 = (byte)(1) ;
               AV12Cant_teo = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               if ( A490ForPrdUMe == 2 )
               {
                  AV45vUnid = httpContext.getMessage( "Lt", "") ;
               }
               if ( A490ForPrdUMe == 1 )
               {
                  AV45vUnid = httpContext.getMessage( "Kg", "") ;
               }
               if ( A490ForPrdUMe == 3 )
               {
                  if ( A743PrdUniCon == 3 )
                  {
                     AV45vUnid = httpContext.getMessage( "Lt", "") ;
                  }
                  else
                  {
                     AV45vUnid = httpContext.getMessage( "Kg", "") ;
                  }
               }
               if ( AV13Consumos == 1 )
               {
                  AV35PrdExiAlm = A704PrdExiAlm ;
               }
               else
               {
                  AV35PrdExiAlm = A705PrdExiCC ;
               }
               AV34PrdCanRes = A685PrdCanRes ;
               AV33PrdCanPen = A684PrdCanPen ;
               AV41Stock = AV35PrdExiAlm.subtract((AV34PrdCanRes)).add(AV33PrdCanPen) ;
               AV36PrdFacCon = A707PrdFacCon ;
               hAQN0( false, 18) ;
               getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 16, Gx_line+0, 86, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 85, Gx_line+0, 221, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 283, Gx_line+0, 419, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A431FacCon, "ZZZZ9.99999")), 521, Gx_line+1, 591, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 474, Gx_line+0, 532, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12Cant_teo, "ZZ,ZZ9.99999")), 606, Gx_line+1, 682, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35PrdExiAlm, "ZZZZZZ9.9999")), 718, Gx_line+1, 794, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34PrdCanRes, "ZZZZZZ9.9999")), 810, Gx_line+1, 886, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45vUnid, "")), 691, Gx_line+1, 715, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36PrdFacCon, "9.99")), 1080, Gx_line+1, 1106, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41Stock, "ZZZZZZ9.9999")), 990, Gx_line+1, 1066, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33PrdCanPen, "ZZZZZZ9.9999")), 901, Gx_line+0, 977, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV55GXLvl54 == 0 )
            {
               System.out.println( httpContext.getMessage( "No hay registros con Recmar=1", "") );
            }
            if ( AV15Flag == 1 )
            {
               hAQN0( false, 15) ;
               getPrinter().GxDrawLine(13, Gx_line+6, 1072, Gx_line+6, 2, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+15) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAQN0( true, 0) ;
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

   public void hAQN0( boolean bFoot ,
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
            getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EmprNom, "")), 15, Gx_line+18, 172, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(10, Gx_line+82, 1151, Gx_line+82, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 1029, Gx_line+51, 1068, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1075, Gx_line+51, 1114, Gx_line+68, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 1033, Gx_line+14, 1060, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 1065, Gx_line+14, 1110, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(10, Gx_line+107, 1151, Gx_line+107, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit3, "")), 16, Gx_line+91, 79, Gx_line+105, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit4, "")), 283, Gx_line+91, 347, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit5, "")), 474, Gx_line+91, 526, Gx_line+105, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit6, "")), 544, Gx_line+91, 601, Gx_line+105, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit7, "")), 619, Gx_line+91, 682, Gx_line+105, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit8, "")), 718, Gx_line+91, 793, Gx_line+105, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit9, "")), 823, Gx_line+91, 886, Gx_line+105, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit2, "")), 15, Gx_line+55, 266, Gx_line+76, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Stock", ""), 1036, Gx_line+91, 1065, Gx_line+107, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fact.", ""), 1080, Gx_line+91, 1106, Gx_line+107, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit14, "")), 914, Gx_line+90, 978, Gx_line+107, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Pgmname, "")), 642, Gx_line+50, 799, Gx_line+67, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+114) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Times New Roman", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Times New Roman", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV46EmprCod = "" ;
      AV10BarCodPar = "" ;
      AV24Lit2 = "" ;
      AV50Pgmname = "" ;
      AV25Lit3 = "" ;
      AV26Lit4 = "" ;
      AV27Lit5 = "" ;
      AV28Lit6 = "" ;
      AV29Lit7 = "" ;
      AV30Lit8 = "" ;
      AV31Lit9 = "" ;
      AV19Lit10 = "" ;
      AV20Lit11 = "" ;
      AV21Lit12 = "" ;
      AV22Lit13 = "" ;
      AV23Lit14 = "" ;
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P0AQN2_A396EmprCod = new String[] {""} ;
      P0AQN2_A407EmprNom = new String[] {""} ;
      P0AQN2_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      AV14EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      AV38RecTotKgm = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV32MaqCod = "" ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new short[1] ;
      P0AQN3_A2804RecLinMaq = new short[1] ;
      P0AQN3_A396EmprCod = new String[] {""} ;
      P0AQN3_A130BarCodPar = new String[] {""} ;
      P0AQN3_A132BarCodReo = new byte[1] ;
      P0AQN3_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      AV16Hdr = "" ;
      P0AQN4_A396EmprCod = new String[] {""} ;
      P0AQN4_A129BarCod = new int[1] ;
      P0AQN4_A132BarCodReo = new byte[1] ;
      P0AQN4_A130BarCodPar = new String[] {""} ;
      P0AQN4_A2804RecLinMaq = new short[1] ;
      P0AQN4_A4024RecMar = new byte[1] ;
      P0AQN4_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQN4_A490ForPrdUMe = new byte[1] ;
      P0AQN4_n490ForPrdUMe = new boolean[] {false} ;
      P0AQN4_A743PrdUniCon = new byte[1] ;
      P0AQN4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQN4_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQN4_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQN4_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQN4_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQN4_A488ForPrdDsc = new String[] {""} ;
      P0AQN4_n488ForPrdDsc = new boolean[] {false} ;
      P0AQN4_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQN4_A875RecPrdDsc = new String[] {""} ;
      P0AQN4_A718PrdNom = new String[] {""} ;
      P0AQN4_A719PrdNum = new String[] {""} ;
      P0AQN4_n719PrdNum = new boolean[] {false} ;
      P0AQN4_A1273RecLinPro = new byte[1] ;
      P0AQN4_A811RecLin = new short[1] ;
      A686PrdCant = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A875RecPrdDsc = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      AV12Cant_teo = DecimalUtil.ZERO ;
      AV45vUnid = "" ;
      AV35PrdExiAlm = DecimalUtil.ZERO ;
      AV34PrdCanRes = DecimalUtil.ZERO ;
      AV33PrdCanPen = DecimalUtil.ZERO ;
      AV41Stock = DecimalUtil.ZERO ;
      AV36PrdFacCon = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.listadoincidenciasreceta__default(),
         new Object[] {
             new Object[] {
            P0AQN2_A396EmprCod, P0AQN2_A407EmprNom, P0AQN2_n407EmprNom
            }
            , new Object[] {
            P0AQN3_A2804RecLinMaq, P0AQN3_A396EmprCod, P0AQN3_A130BarCodPar, P0AQN3_A132BarCodReo, P0AQN3_A129BarCod
            }
            , new Object[] {
            P0AQN4_A396EmprCod, P0AQN4_A129BarCod, P0AQN4_A132BarCodReo, P0AQN4_A130BarCodPar, P0AQN4_A2804RecLinMaq, P0AQN4_A4024RecMar, P0AQN4_A686PrdCant, P0AQN4_A490ForPrdUMe, P0AQN4_n490ForPrdUMe, P0AQN4_A743PrdUniCon,
            P0AQN4_A704PrdExiAlm, P0AQN4_A705PrdExiCC, P0AQN4_A685PrdCanRes, P0AQN4_A684PrdCanPen, P0AQN4_A707PrdFacCon, P0AQN4_A488ForPrdDsc, P0AQN4_n488ForPrdDsc, P0AQN4_A431FacCon, P0AQN4_A875RecPrdDsc, P0AQN4_A718PrdNom,
            P0AQN4_A719PrdNum, P0AQN4_n719PrdNum, P0AQN4_A1273RecLinPro, P0AQN4_A811RecLin
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV50Pgmname = "FormulacionTinte.ListadoIncidenciasReceta" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV50Pgmname = "FormulacionTinte.ListadoIncidenciasReceta" ;
      Gx_err = (short)(0) ;
   }

   private byte AV11BarCodReo ;
   private byte AV13Consumos ;
   private byte AV15Flag ;
   private byte GXv_int5[] ;
   private byte A132BarCodReo ;
   private byte AV55GXLvl54 ;
   private byte A4024RecMar ;
   private byte A490ForPrdUMe ;
   private byte A743PrdUniCon ;
   private byte A1273RecLinPro ;
   private short gxcookieaux ;
   private short AV37RecLinMaq ;
   private short AV18Linmaq ;
   private short GXv_int9[] ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int AV9BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV44ValCos ;
   private int GXv_int4[] ;
   private int AV39RecVolPrd ;
   private int GXv_int8[] ;
   private int A129BarCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV38RecTotKgm ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal AV12Cant_teo ;
   private java.math.BigDecimal AV35PrdExiAlm ;
   private java.math.BigDecimal AV34PrdCanRes ;
   private java.math.BigDecimal AV33PrdCanPen ;
   private java.math.BigDecimal AV41Stock ;
   private java.math.BigDecimal AV36PrdFacCon ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV46EmprCod ;
   private String AV10BarCodPar ;
   private String AV24Lit2 ;
   private String AV50Pgmname ;
   private String AV25Lit3 ;
   private String AV26Lit4 ;
   private String AV27Lit5 ;
   private String AV28Lit6 ;
   private String AV29Lit7 ;
   private String AV30Lit8 ;
   private String AV31Lit9 ;
   private String AV19Lit10 ;
   private String AV20Lit11 ;
   private String AV21Lit12 ;
   private String AV22Lit13 ;
   private String AV23Lit14 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String AV14EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV32MaqCod ;
   private String GXv_char7[] ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String AV16Hdr ;
   private String A488ForPrdDsc ;
   private String A875RecPrdDsc ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String AV45vUnid ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean n719PrdNum ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQN2_A396EmprCod ;
   private String[] P0AQN2_A407EmprNom ;
   private boolean[] P0AQN2_n407EmprNom ;
   private short[] P0AQN3_A2804RecLinMaq ;
   private String[] P0AQN3_A396EmprCod ;
   private String[] P0AQN3_A130BarCodPar ;
   private byte[] P0AQN3_A132BarCodReo ;
   private int[] P0AQN3_A129BarCod ;
   private String[] P0AQN4_A396EmprCod ;
   private int[] P0AQN4_A129BarCod ;
   private byte[] P0AQN4_A132BarCodReo ;
   private String[] P0AQN4_A130BarCodPar ;
   private short[] P0AQN4_A2804RecLinMaq ;
   private byte[] P0AQN4_A4024RecMar ;
   private java.math.BigDecimal[] P0AQN4_A686PrdCant ;
   private byte[] P0AQN4_A490ForPrdUMe ;
   private boolean[] P0AQN4_n490ForPrdUMe ;
   private byte[] P0AQN4_A743PrdUniCon ;
   private java.math.BigDecimal[] P0AQN4_A704PrdExiAlm ;
   private java.math.BigDecimal[] P0AQN4_A705PrdExiCC ;
   private java.math.BigDecimal[] P0AQN4_A685PrdCanRes ;
   private java.math.BigDecimal[] P0AQN4_A684PrdCanPen ;
   private java.math.BigDecimal[] P0AQN4_A707PrdFacCon ;
   private String[] P0AQN4_A488ForPrdDsc ;
   private boolean[] P0AQN4_n488ForPrdDsc ;
   private java.math.BigDecimal[] P0AQN4_A431FacCon ;
   private String[] P0AQN4_A875RecPrdDsc ;
   private String[] P0AQN4_A718PrdNom ;
   private String[] P0AQN4_A719PrdNum ;
   private boolean[] P0AQN4_n719PrdNum ;
   private byte[] P0AQN4_A1273RecLinPro ;
   private short[] P0AQN4_A811RecLin ;
}

final  class listadoincidenciasreceta__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQN2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AQN3", "SELECT RecLinMaq, EmprCod, BarCodPar, BarCodReo, BarCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AQN4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecMar, T1.PrdCant, T1.ForPrdUMe, T2.PrdUniCon, T2.PrdExiAlm, T2.PrdExiCC, T2.PrdCanRes, T2.PrdCanPen, T2.PrdFacCon, T3.ForPrdDsc, T1.FacCon, T1.RecPrdDsc, T2.PrdNom, T1.PrdNum, T1.RecLinPro, T1.RecLin FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (T1.RecMar = 1) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,4);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,4);
               ((String[]) buf[15])[0] = rslt.getString(15, 5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,5);
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 26);
               ((String[]) buf[20])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(20);
               ((short[]) buf[23])[0] = rslt.getShort(21);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

