package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pinf2recetatinte_impl extends GXWebReport
{
   public pinf2recetatinte_impl( com.genexus.internet.HttpContext context )
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            A2804RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
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
      M_bot = 17 ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*17)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GxHdr2 = true ;
         /* Using cursor P05WX4 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361DisCod = P05WX4_A361DisCod[0] ;
            A4259RecTotKgs = P05WX4_A4259RecTotKgs[0] ;
            A252CliCod = P05WX4_A252CliCod[0] ;
            n252CliCod = P05WX4_n252CliCod[0] ;
            A4466BarAcaAnh = P05WX4_A4466BarAcaAnh[0] ;
            A1503BarPart = P05WX4_A1503BarPart[0] ;
            A4812BarEncCli = P05WX4_A4812BarEncCli[0] ;
            A1234BarNomCli = P05WX4_A1234BarNomCli[0] ;
            A135BarColNom = P05WX4_A135BarColNom[0] ;
            A279CliNom = P05WX4_A279CliNom[0] ;
            A1652BarSerDsc = P05WX4_A1652BarSerDsc[0] ;
            A212BarSer = P05WX4_A212BarSer[0] ;
            A220BarTotPie = P05WX4_A220BarTotPie[0] ;
            A199BarPie1 = P05WX4_A199BarPie1[0] ;
            A365DisDes = P05WX4_A365DisDes[0] ;
            A898BarPieNDes = P05WX4_A898BarPieNDes[0] ;
            A166BarKgm = P05WX4_A166BarKgm[0] ;
            A219BarTotAgr = P05WX4_A219BarTotAgr[0] ;
            A361DisCod = P05WX4_A361DisCod[0] ;
            A252CliCod = P05WX4_A252CliCod[0] ;
            n252CliCod = P05WX4_n252CliCod[0] ;
            A4466BarAcaAnh = P05WX4_A4466BarAcaAnh[0] ;
            A1503BarPart = P05WX4_A1503BarPart[0] ;
            A4812BarEncCli = P05WX4_A4812BarEncCli[0] ;
            A1234BarNomCli = P05WX4_A1234BarNomCli[0] ;
            A135BarColNom = P05WX4_A135BarColNom[0] ;
            A1652BarSerDsc = P05WX4_A1652BarSerDsc[0] ;
            A212BarSer = P05WX4_A212BarSer[0] ;
            A365DisDes = P05WX4_A365DisDes[0] ;
            A279CliNom = P05WX4_A279CliNom[0] ;
            A220BarTotPie = P05WX4_A220BarTotPie[0] ;
            A219BarTotAgr = P05WX4_A219BarTotAgr[0] ;
            A199BarPie1 = P05WX4_A199BarPie1[0] ;
            A898BarPieNDes = P05WX4_A898BarPieNDes[0] ;
            A166BarKgm = P05WX4_A166BarKgm[0] ;
            if ( A219BarTotAgr.doubleValue() != 0 )
            {
               A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
            }
            else
            {
               A812RecTotKgm = A166BarKgm ;
            }
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            if ( A220BarTotPie != 0 )
            {
               A813RecTotPie = (int)(A220BarTotPie+A198BarPie) ;
            }
            else
            {
               A813RecTotPie = A198BarPie ;
            }
            AV8Tot_kgs = ((A4259RecTotKgs.doubleValue()>0)&&(DecimalUtil.compareTo(A812RecTotKgm, A4259RecTotKgs)!=0) ? A4259RecTotKgs : A812RecTotKgm) ;
            AV9BarKgm = A166BarKgm ;
            AV10BarPie = A198BarPie ;
            AV11hdr1 = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            AV25Procenom = " " ;
            /* Using cursor P05WX5 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A203BarPieKil = P05WX5_A203BarPieKil[0] ;
               A44AlbRecCod = P05WX5_A44AlbRecCod[0] ;
               A200BarPieCod = P05WX5_A200BarPieCod[0] ;
               AV26Albreccod = A44AlbRecCod ;
               /* Execute user subroutine: 'PROCEDENCIA' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
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
               pr_default.readNext(1);
            }
            pr_default.close(1);
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A252CliCod ;
            GXv_int3[0] = A4466BarAcaAnh ;
            GXv_char4[0] = AV27Tb1_dscfb ;
            new app.pptable2(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
            pinf2recetatinte_impl.this.A396EmprCod = GXv_char1[0] ;
            pinf2recetatinte_impl.this.A252CliCod = GXv_int2[0] ;
            pinf2recetatinte_impl.this.A4466BarAcaAnh = GXv_int3[0] ;
            pinf2recetatinte_impl.this.AV27Tb1_dscfb = GXv_char4[0] ;
            AV28DisEnt = GXutil.substring( AV27Tb1_dscfb, 1, 30) ;
            AV31VarNormas = "" ;
            AV32DisNormID = " " ;
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV35tab_normas[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV37tab_st[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            AV36i = (short)(1) ;
            /* Using cursor P05WX6 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A13214DisNormSt = P05WX6_A13214DisNormSt[0] ;
               A13213DisNormID = P05WX6_A13213DisNormID[0] ;
               if ( GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV31VarNormas = httpContext.getMessage( "SIM", "") ;
                  AV32DisNormID = A13213DisNormID ;
                  if ( AV36i <= 10 )
                  {
                     AV35tab_normas[AV36i-1] = A13213DisNormID ;
                     AV37tab_st[AV36i-1] = httpContext.getMessage( "SIM", "") ;
                  }
                  AV36i = (short)(AV36i+1) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h5WX0( false, 119) ;
            getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV9BarKgm, "ZZZZZ9.99")), 184, Gx_line+7, 269, Gx_line+26, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10BarPie), "ZZZZZ9")), 119, Gx_line+7, 176, Gx_line+26, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11hdr1, "")), 10, Gx_line+7, 114, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo:", ""), 282, Gx_line+8, 349, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 359, Gx_line+8, 510, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 515, Gx_line+8, 760, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 282, Gx_line+25, 358, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 428, Gx_line+25, 485, Gx_line+44, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 489, Gx_line+25, 771, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor/Referencia:", ""), 282, Gx_line+43, 424, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 428, Gx_line+43, 551, Gx_line+62, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 557, Gx_line+42, 680, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Encomenda:", ""), 282, Gx_line+60, 377, Gx_line+78, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), 428, Gx_line+60, 617, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Obs:", ""), 282, Gx_line+96, 321, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(274, Gx_line+4, 770, Gx_line+117, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Partida", ""), 282, Gx_line+78, 377, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1503BarPart), "ZZZ9")), 428, Gx_line+78, 467, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35tab_normas[1-1], "")), 480, Gx_line+96, 519, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37tab_st[1-1], "")), 525, Gx_line+96, 554, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35tab_normas[2-1], "")), 570, Gx_line+96, 609, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37tab_st[2-1], "")), 615, Gx_line+96, 644, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35tab_normas[3-1], "")), 657, Gx_line+96, 696, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37tab_st[3-1], "")), 700, Gx_line+96, 729, Gx_line+115, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+119) ;
            /* Using cursor P05WX7 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A122BarAgrPar = P05WX7_A122BarAgrPar[0] ;
               A124BarAgrReo = P05WX7_A124BarAgrReo[0] ;
               A119BarAgrCod = P05WX7_A119BarAgrCod[0] ;
               A1508CliCodAgr = P05WX7_A1508CliCodAgr[0] ;
               AV11hdr1 = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
               AV12CliCodAgr = A1508CliCodAgr ;
               GXv_char4[0] = A396EmprCod ;
               GXv_int2[0] = A119BarAgrCod ;
               GXv_int5[0] = A124BarAgrReo ;
               GXv_char1[0] = A122BarAgrPar ;
               GXv_decimal6[0] = AV13BarKgmAgr ;
               GXv_decimal7[0] = AV14BarMtrAgr ;
               GXv_int8[0] = AV15BarPieagr ;
               GXv_char9[0] = AV16BarAgrSer ;
               GXv_char10[0] = AV17Barcolnomagr ;
               GXv_int11[0] = 0 ;
               GXv_int12[0] = (byte)(0) ;
               GXv_char13[0] = AV18CliNomAgr ;
               GXv_date14[0] = AV19fec1 ;
               GXv_int15[0] = (byte)(0) ;
               GXv_char16[0] = AV20BarEnccliAgr ;
               GXv_char17[0] = "" ;
               GXv_int18[0] = 0 ;
               GXv_date19[0] = AV21fec2 ;
               GXv_char20[0] = "" ;
               GXv_char21[0] = AV22barserdscAgr ;
               GXv_int22[0] = 0 ;
               GXv_date23[0] = AV23fec3 ;
               GXv_char24[0] = AV24BarNomcliAgr ;
               GXv_int3[0] = AV29BarPartAgr ;
               GXv_int25[0] = AV30DiscodAgr ;
               new app.pinfagrmas(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int5, GXv_char1, GXv_decimal6, GXv_decimal7, GXv_int8, GXv_char9, GXv_char10, GXv_int11, GXv_int12, GXv_char13, GXv_date14, GXv_int15, GXv_char16, GXv_char17, GXv_int18, GXv_date19, GXv_char20, GXv_char21, GXv_int22, GXv_date23, GXv_char24, GXv_int3, GXv_int25) ;
               pinf2recetatinte_impl.this.A396EmprCod = GXv_char4[0] ;
               pinf2recetatinte_impl.this.A119BarAgrCod = GXv_int2[0] ;
               pinf2recetatinte_impl.this.A124BarAgrReo = GXv_int5[0] ;
               pinf2recetatinte_impl.this.A122BarAgrPar = GXv_char1[0] ;
               pinf2recetatinte_impl.this.AV13BarKgmAgr = GXv_decimal6[0] ;
               pinf2recetatinte_impl.this.AV14BarMtrAgr = GXv_decimal7[0] ;
               pinf2recetatinte_impl.this.AV15BarPieagr = GXv_int8[0] ;
               pinf2recetatinte_impl.this.AV16BarAgrSer = GXv_char9[0] ;
               pinf2recetatinte_impl.this.AV17Barcolnomagr = GXv_char10[0] ;
               pinf2recetatinte_impl.this.AV18CliNomAgr = GXv_char13[0] ;
               pinf2recetatinte_impl.this.AV19fec1 = GXv_date14[0] ;
               pinf2recetatinte_impl.this.AV20BarEnccliAgr = GXv_char16[0] ;
               pinf2recetatinte_impl.this.AV21fec2 = GXv_date19[0] ;
               pinf2recetatinte_impl.this.AV22barserdscAgr = GXv_char21[0] ;
               pinf2recetatinte_impl.this.AV23fec3 = GXv_date23[0] ;
               pinf2recetatinte_impl.this.AV24BarNomcliAgr = GXv_char24[0] ;
               pinf2recetatinte_impl.this.AV29BarPartAgr = GXv_int3[0] ;
               pinf2recetatinte_impl.this.AV30DiscodAgr = GXv_int25[0] ;
               /* Execute user subroutine: 'NORMAS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
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
               h5WX0( false, 108) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarKgmAgr, "ZZZZZ9.99")), 184, Gx_line+17, 269, Gx_line+36, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarPieagr), "ZZZZZ9")), 119, Gx_line+17, 176, Gx_line+36, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11hdr1, "")), 10, Gx_line+17, 114, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo:", ""), 282, Gx_line+5, 349, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16BarAgrSer, "")), 359, Gx_line+5, 510, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22barserdscAgr, "")), 515, Gx_line+5, 760, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 282, Gx_line+22, 358, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12CliCodAgr), "ZZZZZ9")), 428, Gx_line+22, 485, Gx_line+41, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18CliNomAgr, "")), 489, Gx_line+22, 771, Gx_line+41, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor/Referencia:", ""), 282, Gx_line+39, 424, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Barcolnomagr, "")), 428, Gx_line+39, 551, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24BarNomcliAgr, "")), 557, Gx_line+39, 680, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Encomenda:", ""), 282, Gx_line+55, 377, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20BarEnccliAgr, "")), 428, Gx_line+55, 617, Gx_line+74, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Obs:", ""), 282, Gx_line+90, 321, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(274, Gx_line+0, 770, Gx_line+107, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Partida", ""), 282, Gx_line+72, 377, Gx_line+90, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29BarPartAgr), "ZZZ9")), 428, Gx_line+72, 467, Gx_line+91, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35tab_normas[1-1], "")), 480, Gx_line+84, 519, Gx_line+103, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37tab_st[1-1], "")), 525, Gx_line+84, 554, Gx_line+103, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35tab_normas[2-1], "")), 570, Gx_line+84, 609, Gx_line+103, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37tab_st[2-1], "")), 615, Gx_line+84, 644, Gx_line+103, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35tab_normas[3-1], "")), 657, Gx_line+84, 696, Gx_line+103, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37tab_st[3-1], "")), 700, Gx_line+84, 729, Gx_line+103, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+108) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5WX0( true, 0) ;
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

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'NORMAS' Routine */
      returnInSub = false ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV35tab_normas[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV37tab_st[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      AV36i = (short)(1) ;
      AV33VarNormasagr = " " ;
      AV34DisNormIDagr = " " ;
      /* Using cursor P05WX8 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV30DiscodAgr)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A361DisCod = P05WX8_A361DisCod[0] ;
         A13214DisNormSt = P05WX8_A13214DisNormSt[0] ;
         A13213DisNormID = P05WX8_A13213DisNormID[0] ;
         if ( GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", "")) == 0 )
         {
            AV33VarNormasagr = httpContext.getMessage( "SIM", "") ;
            AV34DisNormIDagr = A13213DisNormID ;
            if ( AV36i <= 10 )
            {
               AV35tab_normas[AV36i-1] = A13213DisNormID ;
               AV37tab_st[AV36i-1] = httpContext.getMessage( "SIM", "") ;
            }
            AV36i = (short)(AV36i+1) ;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PROCEDENCIA' Routine */
      returnInSub = false ;
      AV25Procenom = " " ;
      /* Using cursor P05WX9 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV26Albreccod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A970ProceCod = P05WX9_A970ProceCod[0] ;
         n970ProceCod = P05WX9_n970ProceCod[0] ;
         A44AlbRecCod = P05WX9_A44AlbRecCod[0] ;
         A971ProceNom = P05WX9_A971ProceNom[0] ;
         n971ProceNom = P05WX9_n971ProceNom[0] ;
         A971ProceNom = P05WX9_A971ProceNom[0] ;
         n971ProceNom = P05WX9_n971ProceNom[0] ;
         AV25Procenom = A971ProceNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void h5WX0( boolean bFoot ,
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
               getPrinter().GxDrawRect(75, Gx_line+67, 706, Gx_line+248, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Maquina Nº:", ""), 105, Gx_line+82, 209, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(208, Gx_line+99, 305, Gx_line+99, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Colocar Iman:", ""), 108, Gx_line+119, 231, Gx_line+137, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Corda1", ""), 265, Gx_line+117, 322, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(329, Gx_line+117, 350, Gx_line+136, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Todas as Cordas", ""), 357, Gx_line+117, 499, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(508, Gx_line+116, 529, Gx_line+135, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Sarillos:", ""), 109, Gx_line+151, 194, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Manual", ""), 265, Gx_line+152, 322, Gx_line+170, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Automatico", ""), 357, Gx_line+152, 452, Gx_line+170, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(329, Gx_line+152, 350, Gx_line+171, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(508, Gx_line+150, 529, Gx_line+169, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(538, Gx_line+166, 635, Gx_line+166, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "m/min", ""), 636, Gx_line+151, 684, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Veloc. da Bomba:", ""), 108, Gx_line+182, 259, Gx_line+200, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Manual", ""), 265, Gx_line+182, 322, Gx_line+200, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Automatico", ""), 357, Gx_line+182, 452, Gx_line+200, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(329, Gx_line+182, 350, Gx_line+201, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(508, Gx_line+182, 529, Gx_line+201, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(538, Gx_line+199, 635, Gx_line+199, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "r.p.m", ""), 636, Gx_line+183, 684, Gx_line+201, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ST:", ""), 110, Gx_line+216, 139, Gx_line+234, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(191, Gx_line+233, 444, Gx_line+233, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 461, Gx_line+219, 537, Gx_line+238, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+251, 734, Gx_line+251, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 598, Gx_line+256, 643, Gx_line+273, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 653, Gx_line+256, 720, Gx_line+273, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 644, Gx_line+256, 652, Gx_line+273, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pag.:", ""), 551, Gx_line+256, 588, Gx_line+273, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "MARCA:", ""), 21, Gx_line+39, 78, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "MALHEIRO:", ""), 394, Gx_line+39, 479, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28DisEnt, "")), 80, Gx_line+39, 362, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Procenom, "")), 480, Gx_line+39, 762, Gx_line+58, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+277) ;
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
            if ( GxHdr2 )
            {
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Unid./Peças", ""), 231, Gx_line+94, 335, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV8Tot_kgs, "ZZZZZ9.99")), 367, Gx_line+114, 452, Gx_line+133, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A813RecTotPie), "ZZZZ9")), 263, Gx_line+114, 305, Gx_line+131, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quantidade", ""), 367, Gx_line+94, 462, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(231, Gx_line+109, 334, Gx_line+109, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(367, Gx_line+109, 461, Gx_line+109, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "54048fec-42e9-4415-86de-5a947ab41957", "", context.getHttpContext().getTheme( )), 7, Gx_line+14, 234, Gx_line+75) ;
               getPrinter().GxDrawLine(531, Gx_line+14, 732, Gx_line+14, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "IQ", ""), 626, Gx_line+22, 640, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+86, 734, Gx_line+86, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O. Serviço", ""), 10, Gx_line+151, 105, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N Peças", ""), 115, Gx_line+151, 182, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quant.", ""), 199, Gx_line+151, 256, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(10, Gx_line+171, 113, Gx_line+171, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(115, Gx_line+171, 181, Gx_line+171, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(184, Gx_line+171, 268, Gx_line+171, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+177) ;
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

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      A130BarCodPar = "" ;
      scmdbuf = "" ;
      P05WX4_A396EmprCod = new String[] {""} ;
      P05WX4_A129BarCod = new int[1] ;
      P05WX4_A132BarCodReo = new byte[1] ;
      P05WX4_A130BarCodPar = new String[] {""} ;
      P05WX4_A2804RecLinMaq = new short[1] ;
      P05WX4_A361DisCod = new int[1] ;
      P05WX4_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05WX4_A252CliCod = new int[1] ;
      P05WX4_n252CliCod = new boolean[] {false} ;
      P05WX4_A4466BarAcaAnh = new short[1] ;
      P05WX4_A1503BarPart = new short[1] ;
      P05WX4_A4812BarEncCli = new String[] {""} ;
      P05WX4_A1234BarNomCli = new String[] {""} ;
      P05WX4_A135BarColNom = new String[] {""} ;
      P05WX4_A279CliNom = new String[] {""} ;
      P05WX4_A1652BarSerDsc = new String[] {""} ;
      P05WX4_A212BarSer = new String[] {""} ;
      P05WX4_A220BarTotPie = new int[1] ;
      P05WX4_A199BarPie1 = new short[1] ;
      P05WX4_A365DisDes = new String[] {""} ;
      P05WX4_A898BarPieNDes = new int[1] ;
      P05WX4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05WX4_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4812BarEncCli = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A279CliNom = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A365DisDes = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      AV8Tot_kgs = DecimalUtil.ZERO ;
      AV9BarKgm = DecimalUtil.ZERO ;
      AV11hdr1 = "" ;
      AV25Procenom = "" ;
      P05WX5_A396EmprCod = new String[] {""} ;
      P05WX5_A129BarCod = new int[1] ;
      P05WX5_A132BarCodReo = new byte[1] ;
      P05WX5_A130BarCodPar = new String[] {""} ;
      P05WX5_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05WX5_A44AlbRecCod = new int[1] ;
      P05WX5_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV27Tb1_dscfb = "" ;
      AV28DisEnt = "" ;
      AV31VarNormas = "" ;
      AV32DisNormID = "" ;
      AV35tab_normas = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV35tab_normas[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV37tab_st = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV37tab_st[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05WX6_A396EmprCod = new String[] {""} ;
      P05WX6_A361DisCod = new int[1] ;
      P05WX6_A13214DisNormSt = new String[] {""} ;
      P05WX6_A13213DisNormID = new String[] {""} ;
      A13214DisNormSt = "" ;
      A13213DisNormID = "" ;
      P05WX7_A396EmprCod = new String[] {""} ;
      P05WX7_A129BarCod = new int[1] ;
      P05WX7_A132BarCodReo = new byte[1] ;
      P05WX7_A130BarCodPar = new String[] {""} ;
      P05WX7_A122BarAgrPar = new String[] {""} ;
      P05WX7_A124BarAgrReo = new byte[1] ;
      P05WX7_A119BarAgrCod = new int[1] ;
      P05WX7_A1508CliCodAgr = new int[1] ;
      A122BarAgrPar = "" ;
      GXv_char4 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char1 = new String[1] ;
      AV13BarKgmAgr = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV14BarMtrAgr = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int8 = new int[1] ;
      AV16BarAgrSer = "" ;
      GXv_char9 = new String[1] ;
      AV17Barcolnomagr = "" ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new byte[1] ;
      AV18CliNomAgr = "" ;
      GXv_char13 = new String[1] ;
      AV19fec1 = GXutil.nullDate() ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_int15 = new byte[1] ;
      AV20BarEnccliAgr = "" ;
      GXv_char16 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_int18 = new int[1] ;
      AV21fec2 = GXutil.nullDate() ;
      GXv_date19 = new java.util.Date[1] ;
      GXv_char20 = new String[1] ;
      AV22barserdscAgr = "" ;
      GXv_char21 = new String[1] ;
      GXv_int22 = new int[1] ;
      AV23fec3 = GXutil.nullDate() ;
      GXv_date23 = new java.util.Date[1] ;
      AV24BarNomcliAgr = "" ;
      GXv_char24 = new String[1] ;
      GXv_int3 = new short[1] ;
      GXv_int25 = new int[1] ;
      AV33VarNormasagr = "" ;
      AV34DisNormIDagr = "" ;
      P05WX8_A396EmprCod = new String[] {""} ;
      P05WX8_A361DisCod = new int[1] ;
      P05WX8_A13214DisNormSt = new String[] {""} ;
      P05WX8_A13213DisNormID = new String[] {""} ;
      P05WX9_A970ProceCod = new short[1] ;
      P05WX9_n970ProceCod = new boolean[] {false} ;
      P05WX9_A396EmprCod = new String[] {""} ;
      P05WX9_A44AlbRecCod = new int[1] ;
      P05WX9_A971ProceNom = new String[] {""} ;
      P05WX9_n971ProceNom = new boolean[] {false} ;
      A971ProceNom = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinf2recetatinte__default(),
         new Object[] {
             new Object[] {
            P05WX4_A396EmprCod, P05WX4_A129BarCod, P05WX4_A132BarCodReo, P05WX4_A130BarCodPar, P05WX4_A2804RecLinMaq, P05WX4_A361DisCod, P05WX4_A4259RecTotKgs, P05WX4_A252CliCod, P05WX4_n252CliCod, P05WX4_A4466BarAcaAnh,
            P05WX4_A1503BarPart, P05WX4_A4812BarEncCli, P05WX4_A1234BarNomCli, P05WX4_A135BarColNom, P05WX4_A279CliNom, P05WX4_A1652BarSerDsc, P05WX4_A212BarSer, P05WX4_A220BarTotPie, P05WX4_A199BarPie1, P05WX4_A365DisDes,
            P05WX4_A898BarPieNDes, P05WX4_A166BarKgm, P05WX4_A219BarTotAgr
            }
            , new Object[] {
            P05WX5_A396EmprCod, P05WX5_A129BarCod, P05WX5_A132BarCodReo, P05WX5_A130BarCodPar, P05WX5_A203BarPieKil, P05WX5_A44AlbRecCod, P05WX5_A200BarPieCod
            }
            , new Object[] {
            P05WX6_A396EmprCod, P05WX6_A361DisCod, P05WX6_A13214DisNormSt, P05WX6_A13213DisNormID
            }
            , new Object[] {
            P05WX7_A396EmprCod, P05WX7_A129BarCod, P05WX7_A132BarCodReo, P05WX7_A130BarCodPar, P05WX7_A122BarAgrPar, P05WX7_A124BarAgrReo, P05WX7_A119BarAgrCod, P05WX7_A1508CliCodAgr
            }
            , new Object[] {
            P05WX8_A396EmprCod, P05WX8_A361DisCod, P05WX8_A13214DisNormSt, P05WX8_A13213DisNormID
            }
            , new Object[] {
            P05WX9_A970ProceCod, P05WX9_n970ProceCod, P05WX9_A396EmprCod, P05WX9_A44AlbRecCod, P05WX9_A971ProceNom, P05WX9_n971ProceNom
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int5[] ;
   private byte GXv_int12[] ;
   private byte GXv_int15[] ;
   private short gxcookieaux ;
   private short A2804RecLinMaq ;
   private short A4466BarAcaAnh ;
   private short A1503BarPart ;
   private short A199BarPie1 ;
   private short AV36i ;
   private short AV29BarPartAgr ;
   private short GXv_int3[] ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A220BarTotPie ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int A813RecTotPie ;
   private int AV10BarPie ;
   private int A44AlbRecCod ;
   private int AV26Albreccod ;
   private int GX_I ;
   private int Gx_OldLine ;
   private int A119BarAgrCod ;
   private int A1508CliCodAgr ;
   private int AV12CliCodAgr ;
   private int GXv_int2[] ;
   private int AV15BarPieagr ;
   private int GXv_int8[] ;
   private int GXv_int11[] ;
   private int GXv_int18[] ;
   private int GXv_int22[] ;
   private int AV30DiscodAgr ;
   private int GXv_int25[] ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV8Tot_kgs ;
   private java.math.BigDecimal AV9BarKgm ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal AV13BarKgmAgr ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV14BarMtrAgr ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A4812BarEncCli ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String A279CliNom ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A365DisDes ;
   private String AV11hdr1 ;
   private String AV25Procenom ;
   private String A200BarPieCod ;
   private String AV27Tb1_dscfb ;
   private String AV28DisEnt ;
   private String AV31VarNormas ;
   private String AV32DisNormID ;
   private String AV35tab_normas[] ;
   private String AV37tab_st[] ;
   private String A13214DisNormSt ;
   private String A13213DisNormID ;
   private String A122BarAgrPar ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String AV16BarAgrSer ;
   private String GXv_char9[] ;
   private String AV17Barcolnomagr ;
   private String GXv_char10[] ;
   private String AV18CliNomAgr ;
   private String GXv_char13[] ;
   private String AV20BarEnccliAgr ;
   private String GXv_char16[] ;
   private String GXv_char17[] ;
   private String GXv_char20[] ;
   private String AV22barserdscAgr ;
   private String GXv_char21[] ;
   private String AV24BarNomcliAgr ;
   private String GXv_char24[] ;
   private String AV33VarNormasagr ;
   private String AV34DisNormIDagr ;
   private String A971ProceNom ;
   private java.util.Date AV19fec1 ;
   private java.util.Date GXv_date14[] ;
   private java.util.Date AV21fec2 ;
   private java.util.Date GXv_date19[] ;
   private java.util.Date AV23fec3 ;
   private java.util.Date GXv_date23[] ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean GxHdr2 ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private IDataStoreProvider pr_default ;
   private String[] P05WX4_A396EmprCod ;
   private int[] P05WX4_A129BarCod ;
   private byte[] P05WX4_A132BarCodReo ;
   private String[] P05WX4_A130BarCodPar ;
   private short[] P05WX4_A2804RecLinMaq ;
   private int[] P05WX4_A361DisCod ;
   private java.math.BigDecimal[] P05WX4_A4259RecTotKgs ;
   private int[] P05WX4_A252CliCod ;
   private boolean[] P05WX4_n252CliCod ;
   private short[] P05WX4_A4466BarAcaAnh ;
   private short[] P05WX4_A1503BarPart ;
   private String[] P05WX4_A4812BarEncCli ;
   private String[] P05WX4_A1234BarNomCli ;
   private String[] P05WX4_A135BarColNom ;
   private String[] P05WX4_A279CliNom ;
   private String[] P05WX4_A1652BarSerDsc ;
   private String[] P05WX4_A212BarSer ;
   private int[] P05WX4_A220BarTotPie ;
   private short[] P05WX4_A199BarPie1 ;
   private String[] P05WX4_A365DisDes ;
   private int[] P05WX4_A898BarPieNDes ;
   private java.math.BigDecimal[] P05WX4_A166BarKgm ;
   private java.math.BigDecimal[] P05WX4_A219BarTotAgr ;
   private String[] P05WX5_A396EmprCod ;
   private int[] P05WX5_A129BarCod ;
   private byte[] P05WX5_A132BarCodReo ;
   private String[] P05WX5_A130BarCodPar ;
   private java.math.BigDecimal[] P05WX5_A203BarPieKil ;
   private int[] P05WX5_A44AlbRecCod ;
   private String[] P05WX5_A200BarPieCod ;
   private String[] P05WX6_A396EmprCod ;
   private int[] P05WX6_A361DisCod ;
   private String[] P05WX6_A13214DisNormSt ;
   private String[] P05WX6_A13213DisNormID ;
   private String[] P05WX7_A396EmprCod ;
   private int[] P05WX7_A129BarCod ;
   private byte[] P05WX7_A132BarCodReo ;
   private String[] P05WX7_A130BarCodPar ;
   private String[] P05WX7_A122BarAgrPar ;
   private byte[] P05WX7_A124BarAgrReo ;
   private int[] P05WX7_A119BarAgrCod ;
   private int[] P05WX7_A1508CliCodAgr ;
   private String[] P05WX8_A396EmprCod ;
   private int[] P05WX8_A361DisCod ;
   private String[] P05WX8_A13214DisNormSt ;
   private String[] P05WX8_A13213DisNormID ;
   private short[] P05WX9_A970ProceCod ;
   private boolean[] P05WX9_n970ProceCod ;
   private String[] P05WX9_A396EmprCod ;
   private int[] P05WX9_A44AlbRecCod ;
   private String[] P05WX9_A971ProceNom ;
   private boolean[] P05WX9_n971ProceNom ;
}

final  class pinf2recetatinte__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05WX4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.DisCod, T1.RecTotKgs, T2.CliCod, T2.BarAcaAnh, T2.BarPart, T2.BarEncCli, T2.BarNomCli, T2.BarColNom, T3.CliNom, T2.BarSerDsc, T2.BarSer, COALESCE( T4.BarTotPie, 0) AS BarTotPie, COALESCE( T5.BarPie1, 0) AS BarPie1, T2.DisDes, COALESCE( T5.BarPieNDes, 0) AS BarPieNDes, COALESCE( T5.BarKgm, 0) AS BarKgm, COALESCE( T4.BarTotAgr, 0) AS BarTotAgr FROM ((((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(PieAgr) AS BarTotPie FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05WX5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieKil, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05WX6", "SELECT EmprCod, DisCod, DisNormSt, DisNormID FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05WX7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrPar, BarAgrReo, BarAgrCod, CliCodAgr FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05WX8", "SELECT EmprCod, DisCod, DisNormSt, DisNormID FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05WX9", "SELECT T1.ProceCod, T1.EmprCod, T1.AlbRecCod, T2.ProceNom FROM (TXPALBREC T1 LEFT JOIN TXPPROCED T2 ON T2.EmprCod = T1.EmprCod AND T2.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 20);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 30);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((int[]) buf[20])[0] = rslt.getInt(20);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

