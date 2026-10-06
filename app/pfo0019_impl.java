package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pfo0019_impl extends GXWebReport
{
   public pfo0019_impl( com.genexus.internet.HttpContext context )
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
         A396EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV43tablahdrs = httpContext.GetPar( "tablahdrs") ;
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
         new app.core.pobtlit(remoteHandle, context).execute( AV51Pgmname, (byte)(99), GXv_char2) ;
         pfo0019_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit2 = GXt_char1 ;
         GXt_char1 = AV25Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char2) ;
         pfo0019_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit3 = GXt_char1 ;
         GXt_char1 = AV26Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1480_", ""), (byte)(99), GXv_char2) ;
         pfo0019_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit4 = GXt_char1 ;
         GXt_char1 = AV27Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$UNIDAD", ""), (byte)(99), GXv_char2) ;
         pfo0019_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit5 = GXt_char1 ;
         GXt_char1 = AV28Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN378_", ""), (byte)(99), GXv_char2) ;
         pfo0019_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit6 = GXt_char1 ;
         GXt_char1 = AV29Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char2) ;
         pfo0019_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit7 = GXt_char1 ;
         GXt_char1 = AV30Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1020_", ""), (byte)(99), GXv_char2) ;
         pfo0019_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit8 = GXt_char1 ;
         GXt_char1 = AV31Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1353_", ""), (byte)(99), GXv_char2) ;
         pfo0019_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit9 = GXt_char1 ;
         GXt_char1 = AV19Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
         pfo0019_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit10 = GXt_char1 ;
         GXt_char1 = AV20Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char2) ;
         pfo0019_impl.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit11 = GXt_char1 ;
         GXt_char1 = AV21Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char2) ;
         pfo0019_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit12 = GXt_char1 ;
         GXt_char1 = AV22Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_ ", ""), (byte)(99), GXv_char2) ;
         pfo0019_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit13 = GXt_char1 ;
         GXt_char1 = AV23Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1302_", ""), (byte)(99), GXv_char2) ;
         pfo0019_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit14 = GXt_char1 ;
         /* Using cursor P019V2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P019V2_A407EmprNom[0] ;
            n407EmprNom = P019V2_n407EmprNom[0] ;
            AV14EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = "030100" ;
         GXv_int4[0] = AV44ValCos ;
         new app.pbuscou(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
         pfo0019_impl.this.A396EmprCod = GXv_char2[0] ;
         pfo0019_impl.this.AV44ValCos = GXv_int4[0] ;
         AV13Consumos = (byte)(0) ;
         GXv_int4[0] = AV13Consumos ;
         new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int4) ;
         pfo0019_impl.this.AV13Consumos = (byte)((byte)(GXv_int4[0])) ;
         if ( AV13Consumos == 0 )
         {
            AV30Lit8 += httpContext.getMessage( " C.C.", "") ;
         }
         AV46SDTtablahdrsCollection.fromJSonString(AV43tablahdrs, null);
         AV53GXV1 = 1 ;
         while ( AV53GXV1 <= AV46SDTtablahdrsCollection.size() )
         {
            AV47SDTtablahdrs = (app.SdtSDTtablahdrs)((app.SdtSDTtablahdrs)AV46SDTtablahdrsCollection.elementAt(-1+AV53GXV1));
            AV16Hdr = AV47SDTtablahdrs.getgxTv_SdtSDTtablahdrs_Barnhdr() ;
            AV9BarCod = (int)(GXutil.lval( GXutil.substring( AV16Hdr, 1, 8))) ;
            AV11BarCodReo = (byte)(GXutil.lval( GXutil.substring( AV16Hdr, 9, 1))) ;
            AV10BarCodPar = GXutil.substring( AV16Hdr, 10, 1) ;
            AV18Linmaq = (short)(GXutil.lval( GXutil.substring( AV16Hdr, 11, 4))) ;
            AV15Flag = (byte)(0) ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = AV9BarCod ;
            GXv_int5[0] = AV11BarCodReo ;
            GXv_char2[0] = AV10BarCodPar ;
            GXv_decimal6[0] = AV38RecTotKgm ;
            GXv_char7[0] = AV32MaqCod ;
            GXv_int8[0] = AV39RecVolPrd ;
            GXv_int9[0] = AV18Linmaq ;
            new app.pfo00191(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_decimal6, GXv_char7, GXv_int8, GXv_int9) ;
            pfo0019_impl.this.A396EmprCod = GXv_char3[0] ;
            pfo0019_impl.this.AV9BarCod = GXv_int4[0] ;
            pfo0019_impl.this.AV11BarCodReo = GXv_int5[0] ;
            pfo0019_impl.this.AV10BarCodPar = GXv_char2[0] ;
            pfo0019_impl.this.AV38RecTotKgm = GXv_decimal6[0] ;
            pfo0019_impl.this.AV32MaqCod = GXv_char7[0] ;
            pfo0019_impl.this.AV39RecVolPrd = GXv_int8[0] ;
            pfo0019_impl.this.AV18Linmaq = GXv_int9[0] ;
            /* Using cursor P019V3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV11BarCodReo), AV10BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A130BarCodPar = P019V3_A130BarCodPar[0] ;
               A132BarCodReo = P019V3_A132BarCodReo[0] ;
               A129BarCod = P019V3_A129BarCod[0] ;
               A212BarSer = P019V3_A212BarSer[0] ;
               AV37RecLinMaq = AV18Linmaq ;
               h19V0( false, 54) ;
               getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 175, Gx_line+23, 226, Gx_line+40, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 226, Gx_line+23, 233, Gx_line+40, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 240, Gx_line+23, 252, Gx_line+40, 0+256, 0, 0, 0) ;
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
               /* Using cursor P019V4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV37RecLinMaq)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A875RecPrdDsc = P019V4_A875RecPrdDsc[0] ;
                  A4024RecMar = P019V4_A4024RecMar[0] ;
                  A2804RecLinMaq = P019V4_A2804RecLinMaq[0] ;
                  A686PrdCant = P019V4_A686PrdCant[0] ;
                  A490ForPrdUMe = P019V4_A490ForPrdUMe[0] ;
                  n490ForPrdUMe = P019V4_n490ForPrdUMe[0] ;
                  A743PrdUniCon = P019V4_A743PrdUniCon[0] ;
                  A704PrdExiAlm = P019V4_A704PrdExiAlm[0] ;
                  A705PrdExiCC = P019V4_A705PrdExiCC[0] ;
                  A685PrdCanRes = P019V4_A685PrdCanRes[0] ;
                  A684PrdCanPen = P019V4_A684PrdCanPen[0] ;
                  A707PrdFacCon = P019V4_A707PrdFacCon[0] ;
                  A488ForPrdDsc = P019V4_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P019V4_n488ForPrdDsc[0] ;
                  A431FacCon = P019V4_A431FacCon[0] ;
                  A718PrdNom = P019V4_A718PrdNom[0] ;
                  A719PrdNum = P019V4_A719PrdNum[0] ;
                  n719PrdNum = P019V4_n719PrdNum[0] ;
                  A1273RecLinPro = P019V4_A1273RecLinPro[0] ;
                  A811RecLin = P019V4_A811RecLin[0] ;
                  A743PrdUniCon = P019V4_A743PrdUniCon[0] ;
                  A704PrdExiAlm = P019V4_A704PrdExiAlm[0] ;
                  A705PrdExiCC = P019V4_A705PrdExiCC[0] ;
                  A685PrdCanRes = P019V4_A685PrdCanRes[0] ;
                  A684PrdCanPen = P019V4_A684PrdCanPen[0] ;
                  A707PrdFacCon = P019V4_A707PrdFacCon[0] ;
                  A718PrdNom = P019V4_A718PrdNom[0] ;
                  A488ForPrdDsc = P019V4_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P019V4_n488ForPrdDsc[0] ;
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
                  h19V0( false, 17) ;
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
                  Gx_line = (int)(Gx_line+17) ;
                  pr_default.readNext(2);
               }
               pr_default.close(2);
               if ( AV15Flag == 1 )
               {
                  h19V0( false, 15) ;
                  getPrinter().GxDrawLine(13, Gx_line+6, 1072, Gx_line+6, 2, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+15) ;
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            AV17i = (short)(AV17i+1) ;
            AV53GXV1 = (int)(AV53GXV1+1) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h19V0( true, 0) ;
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

   public void h19V0( boolean bFoot ,
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
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Pgmname, "")), 867, Gx_line+51, 1024, Gx_line+68, 0+256, 0, 0, 0) ;
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
      A396EmprCod = "" ;
      AV43tablahdrs = "" ;
      AV24Lit2 = "" ;
      AV51Pgmname = "" ;
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
      P019V2_A396EmprCod = new String[] {""} ;
      P019V2_A407EmprNom = new String[] {""} ;
      P019V2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV14EmprNom = "" ;
      AV46SDTtablahdrsCollection = new GXBaseCollection<app.SdtSDTtablahdrs>(app.SdtSDTtablahdrs.class, "SDTtablahdrs", "TexplusNET", remoteHandle);
      AV47SDTtablahdrs = new app.SdtSDTtablahdrs(remoteHandle, context);
      AV16Hdr = "" ;
      AV10BarCodPar = "" ;
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
      P019V3_A396EmprCod = new String[] {""} ;
      P019V3_A130BarCodPar = new String[] {""} ;
      P019V3_A132BarCodReo = new byte[1] ;
      P019V3_A129BarCod = new int[1] ;
      P019V3_A212BarSer = new String[] {""} ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      P019V4_A396EmprCod = new String[] {""} ;
      P019V4_A129BarCod = new int[1] ;
      P019V4_A132BarCodReo = new byte[1] ;
      P019V4_A130BarCodPar = new String[] {""} ;
      P019V4_A875RecPrdDsc = new String[] {""} ;
      P019V4_A4024RecMar = new byte[1] ;
      P019V4_A2804RecLinMaq = new short[1] ;
      P019V4_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019V4_A490ForPrdUMe = new byte[1] ;
      P019V4_n490ForPrdUMe = new boolean[] {false} ;
      P019V4_A743PrdUniCon = new byte[1] ;
      P019V4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019V4_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019V4_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019V4_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019V4_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019V4_A488ForPrdDsc = new String[] {""} ;
      P019V4_n488ForPrdDsc = new boolean[] {false} ;
      P019V4_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019V4_A718PrdNom = new String[] {""} ;
      P019V4_A719PrdNum = new String[] {""} ;
      P019V4_n719PrdNum = new boolean[] {false} ;
      P019V4_A1273RecLinPro = new byte[1] ;
      P019V4_A811RecLin = new short[1] ;
      A875RecPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfo0019__default(),
         new Object[] {
             new Object[] {
            P019V2_A396EmprCod, P019V2_A407EmprNom, P019V2_n407EmprNom
            }
            , new Object[] {
            P019V3_A396EmprCod, P019V3_A130BarCodPar, P019V3_A132BarCodReo, P019V3_A129BarCod, P019V3_A212BarSer
            }
            , new Object[] {
            P019V4_A396EmprCod, P019V4_A129BarCod, P019V4_A132BarCodReo, P019V4_A130BarCodPar, P019V4_A875RecPrdDsc, P019V4_A4024RecMar, P019V4_A2804RecLinMaq, P019V4_A686PrdCant, P019V4_A490ForPrdUMe, P019V4_n490ForPrdUMe,
            P019V4_A743PrdUniCon, P019V4_A704PrdExiAlm, P019V4_A705PrdExiCC, P019V4_A685PrdCanRes, P019V4_A684PrdCanPen, P019V4_A707PrdFacCon, P019V4_A488ForPrdDsc, P019V4_n488ForPrdDsc, P019V4_A431FacCon, P019V4_A718PrdNom,
            P019V4_A719PrdNum, P019V4_n719PrdNum, P019V4_A1273RecLinPro, P019V4_A811RecLin
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV51Pgmname = "PFO0019" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV51Pgmname = "PFO0019" ;
      Gx_err = (short)(0) ;
   }

   private byte AV13Consumos ;
   private byte AV11BarCodReo ;
   private byte AV15Flag ;
   private byte GXv_int5[] ;
   private byte A132BarCodReo ;
   private byte A4024RecMar ;
   private byte A490ForPrdUMe ;
   private byte A743PrdUniCon ;
   private byte A1273RecLinPro ;
   private short gxcookieaux ;
   private short AV18Linmaq ;
   private short GXv_int9[] ;
   private short AV37RecLinMaq ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short AV17i ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV44ValCos ;
   private int AV53GXV1 ;
   private int AV9BarCod ;
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
   private String A396EmprCod ;
   private String AV24Lit2 ;
   private String AV51Pgmname ;
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
   private String A407EmprNom ;
   private String AV14EmprNom ;
   private String AV16Hdr ;
   private String AV10BarCodPar ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV32MaqCod ;
   private String GXv_char7[] ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
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
   private String AV43tablahdrs ;
   private IDataStoreProvider pr_default ;
   private String[] P019V2_A396EmprCod ;
   private String[] P019V2_A407EmprNom ;
   private boolean[] P019V2_n407EmprNom ;
   private String[] P019V3_A396EmprCod ;
   private String[] P019V3_A130BarCodPar ;
   private byte[] P019V3_A132BarCodReo ;
   private int[] P019V3_A129BarCod ;
   private String[] P019V3_A212BarSer ;
   private String[] P019V4_A396EmprCod ;
   private int[] P019V4_A129BarCod ;
   private byte[] P019V4_A132BarCodReo ;
   private String[] P019V4_A130BarCodPar ;
   private String[] P019V4_A875RecPrdDsc ;
   private byte[] P019V4_A4024RecMar ;
   private short[] P019V4_A2804RecLinMaq ;
   private java.math.BigDecimal[] P019V4_A686PrdCant ;
   private byte[] P019V4_A490ForPrdUMe ;
   private boolean[] P019V4_n490ForPrdUMe ;
   private byte[] P019V4_A743PrdUniCon ;
   private java.math.BigDecimal[] P019V4_A704PrdExiAlm ;
   private java.math.BigDecimal[] P019V4_A705PrdExiCC ;
   private java.math.BigDecimal[] P019V4_A685PrdCanRes ;
   private java.math.BigDecimal[] P019V4_A684PrdCanPen ;
   private java.math.BigDecimal[] P019V4_A707PrdFacCon ;
   private String[] P019V4_A488ForPrdDsc ;
   private boolean[] P019V4_n488ForPrdDsc ;
   private java.math.BigDecimal[] P019V4_A431FacCon ;
   private String[] P019V4_A718PrdNom ;
   private String[] P019V4_A719PrdNum ;
   private boolean[] P019V4_n719PrdNum ;
   private byte[] P019V4_A1273RecLinPro ;
   private short[] P019V4_A811RecLin ;
   private GXBaseCollection<app.SdtSDTtablahdrs> AV46SDTtablahdrsCollection ;
   private app.SdtSDTtablahdrs AV47SDTtablahdrs ;
}

final  class pfo0019__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P019V2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P019V3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSer FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P019V4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecPrdDsc, T1.RecMar, T1.RecLinMaq, T1.PrdCant, T1.ForPrdUMe, T2.PrdUniCon, T2.PrdExiAlm, T2.PrdExiCC, T2.PrdCanRes, T2.PrdCanPen, T2.PrdFacCon, T3.ForPrdDsc, T1.FacCon, T2.PrdNom, T1.PrdNum, T1.RecLinPro, T1.RecLin FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (T1.RecMar = 1 or SUBSTR(T1.RecPrdDsc, 1, 1) = '@') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,4);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,4);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,4);
               ((String[]) buf[16])[0] = rslt.getString(16, 5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,5);
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

