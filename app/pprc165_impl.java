package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pprc165_impl extends GXWebReport
{
   public pprc165_impl( com.genexus.internet.HttpContext context )
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
            A910Workstat = httpContext.GetPar( "Workstat") ;
            AV8CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            AV9ForSer = httpContext.GetPar( "ForSer") ;
            AV10ForColNom = httpContext.GetPar( "ForColNom") ;
            AV11ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
            AV12TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
            AV13TotKilos = CommonUtil.decimalVal( httpContext.GetPar( "TotKilos"), ".") ;
            AV14Volumen = (int)(GXutil.lval( httpContext.GetPar( "Volumen"))) ;
            AV15MaqCod = httpContext.GetPar( "MaqCod") ;
            AV16Incre = CommonUtil.decimalVal( httpContext.GetPar( "Incre"), ".") ;
            AV17TotKilo = CommonUtil.decimalVal( httpContext.GetPar( "TotKilo"), ".") ;
            AV18Por_quebra = CommonUtil.decimalVal( httpContext.GetPar( "Por_quebra"), ".") ;
            AV19TotMts = CommonUtil.decimalVal( httpContext.GetPar( "TotMts"), ".") ;
            AV58ClicodDestino = (int)(GXutil.lval( httpContext.GetPar( "ClicodDestino"))) ;
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 1, 15840, 12240, 0, 1, 1, 0, 1, 1) )
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
         GXv_int1[0] = AV44FlagUni ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100000", GXv_int1) ;
         pprc165_impl.this.AV44FlagUni = GXv_int1[0] ;
         /* Using cursor P05OI2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P05OI2_A407EmprNom[0] ;
            n407EmprNom = P05OI2_n407EmprNom[0] ;
            AV34NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P05OI3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV11ForColNum), Byte.valueOf(AV12TipColCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A831TipColCod = P05OI3_A831TipColCod[0] ;
            A483ForColNum = P05OI3_A483ForColNum[0] ;
            A482ForColNom = P05OI3_A482ForColNom[0] ;
            A494ForSer = P05OI3_A494ForSer[0] ;
            A252CliCod = P05OI3_A252CliCod[0] ;
            A1191ForNomCli = P05OI3_A1191ForNomCli[0] ;
            n1191ForNomCli = P05OI3_n1191ForNomCli[0] ;
            A583IntCod = P05OI3_A583IntCod[0] ;
            A584IntDsc = P05OI3_A584IntDsc[0] ;
            n584IntDsc = P05OI3_n584IntDsc[0] ;
            A5362IntCodF = P05OI3_A5362IntCodF[0] ;
            n5362IntCodF = P05OI3_n5362IntCodF[0] ;
            A5363IntDscF = P05OI3_A5363IntDscF[0] ;
            n5363IntDscF = P05OI3_n5363IntDscF[0] ;
            A832TipColDsc = P05OI3_A832TipColDsc[0] ;
            n832TipColDsc = P05OI3_n832TipColDsc[0] ;
            A279CliNom = P05OI3_A279CliNom[0] ;
            A1192ForNumCli = P05OI3_A1192ForNumCli[0] ;
            n1192ForNumCli = P05OI3_n1192ForNumCli[0] ;
            A995ForTonal = P05OI3_A995ForTonal[0] ;
            n995ForTonal = P05OI3_n995ForTonal[0] ;
            A626MatCod = P05OI3_A626MatCod[0] ;
            A627MatDsc = P05OI3_A627MatDsc[0] ;
            n627MatDsc = P05OI3_n627MatDsc[0] ;
            A485ForFec = P05OI3_A485ForFec[0] ;
            n485ForFec = P05OI3_n485ForFec[0] ;
            A5742ForSerDsc = P05OI3_A5742ForSerDsc[0] ;
            n5742ForSerDsc = P05OI3_n5742ForSerDsc[0] ;
            A495ForUltMod = P05OI3_A495ForUltMod[0] ;
            n495ForUltMod = P05OI3_n495ForUltMod[0] ;
            A279CliNom = P05OI3_A279CliNom[0] ;
            A584IntDsc = P05OI3_A584IntDsc[0] ;
            n584IntDsc = P05OI3_n584IntDsc[0] ;
            A627MatDsc = P05OI3_A627MatDsc[0] ;
            n627MatDsc = P05OI3_n627MatDsc[0] ;
            A832TipColDsc = P05OI3_A832TipColDsc[0] ;
            n832TipColDsc = P05OI3_n832TipColDsc[0] ;
            A5363IntDscF = P05OI3_A5363IntDscF[0] ;
            n5363IntDscF = P05OI3_n5363IntDscF[0] ;
            AV22ForNomCli = A1191ForNomCli ;
            AV23IntCod = A583IntCod ;
            AV24IntDsc = A584IntDsc ;
            AV25IntCodF = A5362IntCodF ;
            AV26IntDscF = A5363IntDscF ;
            AV27TipColDsc = A832TipColDsc ;
            AV20CliNom = A279CliNom ;
            GXt_char2 = AV20CliNom ;
            GXv_char3[0] = GXt_char2 ;
            new app.pclinom(remoteHandle, context).execute( A396EmprCod, AV58ClicodDestino, GXv_char3) ;
            pprc165_impl.this.GXt_char2 = GXv_char3[0] ;
            AV20CliNom = ((AV58ClicodDestino==AV8CliCod)||(0==AV58ClicodDestino) ? AV20CliNom : GXt_char2) ;
            AV28ForNumCli = A1192ForNumCli ;
            AV29ForTonal = A995ForTonal ;
            AV30MatCod = A626MatCod ;
            AV31matDsc = A627MatDsc ;
            AV32ForFec = A485ForFec ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A494ForSer ;
            GXv_char6[0] = AV33TipArtDsc ;
            new app.pbusar2(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_char6) ;
            pprc165_impl.this.A396EmprCod = GXv_char3[0] ;
            pprc165_impl.this.A252CliCod = GXv_int4[0] ;
            pprc165_impl.this.A494ForSer = GXv_char5[0] ;
            pprc165_impl.this.AV33TipArtDsc = GXv_char6[0] ;
            AV21ForSerDsc = A5742ForSerDsc ;
            AV56Fecha = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A495ForUltMod)) ? A485ForFec : A495ForUltMod) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         h5OI0( false, 106) ;
         getPrinter().GxDrawRect(7, Gx_line+2, 796, Gx_line+63, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Compañia Industrial Textile Anahuac S.A. de C.V.", ""), 371, Gx_line+7, 681, Gx_line+26, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "REPROCESO / REFORMULACION / FORMULA / PARA PRODUCCION", ""), 316, Gx_line+40, 737, Gx_line+59, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(258, Gx_line+2, 258, Gx_line+63, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(258, Gx_line+32, 797, Gx_line+32, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha de Emision", ""), 41, Gx_line+65, 153, Gx_line+84, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 66, Gx_line+83, 123, Gx_line+103, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Folio", ""), 199, Gx_line+65, 232, Gx_line+84, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Reproceso", ""), 291, Gx_line+77, 360, Gx_line+96, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Reformulacion", ""), 449, Gx_line+77, 545, Gx_line+96, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Formula", ""), 674, Gx_line+77, 728, Gx_line+96, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(741, Gx_line+76, 767, Gx_line+96, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(557, Gx_line+76, 583, Gx_line+96, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(399, Gx_line+76, 425, Gx_line+96, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(8, Gx_line+83, 266, Gx_line+83, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(7, Gx_line+65, 796, Gx_line+105, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(266, Gx_line+65, 266, Gx_line+104, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(441, Gx_line+65, 441, Gx_line+104, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(624, Gx_line+65, 624, Gx_line+104, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "a267de5b-47a0-4df6-9da4-989015957eb9", "", context.getHttpContext().getTheme( )), 24, Gx_line+10, 245, Gx_line+45) ;
         getPrinter().GxDrawLine(176, Gx_line+65, 176, Gx_line+104, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+106) ;
         h5OI0( false, 83) ;
         getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre del Cliente", ""), 85, Gx_line+1, 213, Gx_line+20, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre del Articulo", ""), 85, Gx_line+20, 217, Gx_line+39, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color del Articulo", ""), 85, Gx_line+40, 199, Gx_line+59, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo del Articulo", ""), 85, Gx_line+59, 209, Gx_line+78, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20CliNom, "")), 275, Gx_line+1, 526, Gx_line+21, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21ForSerDsc, "")), 275, Gx_line+20, 493, Gx_line+40, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10ForColNom, "")), 276, Gx_line+40, 385, Gx_line+60, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9ForSer, "")), 276, Gx_line+59, 410, Gx_line+79, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(42, Gx_line+0, 758, Gx_line+81, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(44, Gx_line+19, 760, Gx_line+19, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(44, Gx_line+39, 760, Gx_line+39, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(42, Gx_line+58, 758, Gx_line+58, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(263, Gx_line+1, 263, Gx_line+81, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11ForColNum), "ZZZZZ9")), 589, Gx_line+40, 634, Gx_line+60, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero Color", ""), 486, Gx_line+40, 578, Gx_line+59, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+83) ;
         h5OI0( false, 131) ;
         getPrinter().GxDrawRect(7, Gx_line+4, 791, Gx_line+128, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "PREPARACION", ""), 101, Gx_line+6, 194, Gx_line+25, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "BLAN/ESM/PAD", ""), 468, Gx_line+6, 570, Gx_line+25, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(7, Gx_line+24, 791, Gx_line+24, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Caustificado", ""), 24, Gx_line+28, 103, Gx_line+47, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Blanqueo", ""), 24, Gx_line+53, 86, Gx_line+72, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Esmeril", ""), 24, Gx_line+78, 73, Gx_line+97, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo de Teñido", ""), 24, Gx_line+104, 120, Gx_line+123, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "16 Be", ""), 299, Gx_line+28, 334, Gx_line+47, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "24 Be", ""), 472, Gx_line+28, 507, Gx_line+47, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "QUEEN 33", ""), 299, Gx_line+53, 364, Gx_line+72, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "QUEEN 33", ""), 471, Gx_line+53, 536, Gx_line+72, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "MGC", ""), 641, Gx_line+53, 674, Gx_line+72, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "ESM", ""), 299, Gx_line+78, 328, Gx_line+97, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "MIE", ""), 468, Gx_line+78, 494, Gx_line+97, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "S/ESM", ""), 645, Gx_line+78, 688, Gx_line+97, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "T&T", ""), 474, Gx_line+104, 501, Gx_line+123, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "FIRME", ""), 299, Gx_line+104, 341, Gx_line+123, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(7, Gx_line+50, 791, Gx_line+50, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(7, Gx_line+74, 791, Gx_line+74, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(7, Gx_line+99, 791, Gx_line+99, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(273, Gx_line+4, 273, Gx_line+128, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(440, Gx_line+4, 440, Gx_line+128, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(592, Gx_line+4, 592, Gx_line+128, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(380, Gx_line+27, 409, Gx_line+47, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(539, Gx_line+27, 568, Gx_line+47, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(539, Gx_line+52, 568, Gx_line+72, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(380, Gx_line+52, 409, Gx_line+72, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(380, Gx_line+77, 409, Gx_line+97, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(539, Gx_line+77, 568, Gx_line+97, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(380, Gx_line+103, 409, Gx_line+123, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(539, Gx_line+103, 568, Gx_line+123, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(717, Gx_line+52, 746, Gx_line+72, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(717, Gx_line+77, 746, Gx_line+97, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+131) ;
         AV35Rb = ((AV13TotKilos.doubleValue()>0) ? DecimalUtil.doubleToDec(AV14Volumen).divide(AV13TotKilos, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
         AV49CosteP2 = DecimalUtil.doubleToDec(0) ;
         AV48CosteP1 = DecimalUtil.doubleToDec(0) ;
         AV41LastProces = "" ;
         AV46CosteC = DecimalUtil.doubleToDec(0) ;
         AV47CosteD = DecimalUtil.doubleToDec(0) ;
         AV45CosteA = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P05OI4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A910Workstat});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A490ForPrdUMe = P05OI4_A490ForPrdUMe[0] ;
            A743PrdUniCon = P05OI4_A743PrdUniCon[0] ;
            A719PrdNum = P05OI4_A719PrdNum[0] ;
            A10363EscMCant = P05OI4_A10363EscMCant[0] ;
            A890EscMCan = P05OI4_A890EscMCan[0] ;
            A4712EscMFacCon = P05OI4_A4712EscMFacCon[0] ;
            A897EscMDsc = P05OI4_A897EscMDsc[0] ;
            A764ProForCod = P05OI4_A764ProForCod[0] ;
            A771ProForTie = P05OI4_A771ProForTie[0] ;
            A772ProForTmx = P05OI4_A772ProForTmx[0] ;
            A6877ProForPhn = P05OI4_A6877ProForPhn[0] ;
            n6877ProForPhn = P05OI4_n6877ProForPhn[0] ;
            A6876ProForPhx = P05OI4_A6876ProForPhx[0] ;
            n6876ProForPhx = P05OI4_n6876ProForPhx[0] ;
            A766ProForDsc = P05OI4_A766ProForDsc[0] ;
            A889EscMPrdPre = P05OI4_A889EscMPrdPre[0] ;
            A891EscMCos = P05OI4_A891EscMCos[0] ;
            A718PrdNom = P05OI4_A718PrdNom[0] ;
            A887EscMLin = P05OI4_A887EscMLin[0] ;
            A743PrdUniCon = P05OI4_A743PrdUniCon[0] ;
            A718PrdNom = P05OI4_A718PrdNom[0] ;
            A771ProForTie = P05OI4_A771ProForTie[0] ;
            A772ProForTmx = P05OI4_A772ProForTmx[0] ;
            A6877ProForPhn = P05OI4_A6877ProForPhn[0] ;
            n6877ProForPhn = P05OI4_n6877ProForPhn[0] ;
            A6876ProForPhx = P05OI4_A6876ProForPhx[0] ;
            n6876ProForPhx = P05OI4_n6876ProForPhx[0] ;
            A766ProForDsc = P05OI4_A766ProForDsc[0] ;
            if ( A490ForPrdUMe == 2 )
            {
               AV43Unidades = httpContext.getMessage( "Cc", "") ;
            }
            else
            {
               if ( A490ForPrdUMe == 3 )
               {
                  if ( A743PrdUniCon == 3 )
                  {
                     AV43Unidades = httpContext.getMessage( "Cc", "") ;
                  }
                  else
                  {
                     AV43Unidades = httpContext.getMessage( "Gr", "") ;
                  }
               }
               else
               {
                  AV43Unidades = httpContext.getMessage( "Gr", "") ;
                  if ( A743PrdUniCon == 3 )
                  {
                     AV43Unidades = httpContext.getMessage( "Cc", "") ;
                  }
               }
            }
            AV50CodPrd = GXutil.substring( A719PrdNum, 1, 1) ;
            if ( AV44FlagUni == 1 )
            {
               if ( ( ( A890EscMCan.doubleValue() >= 1000 ) && ( ( GXutil.strcmp(AV50CodPrd, "0") == 0 ) || ( GXutil.strcmp(AV50CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV50CodPrd, "9") == 0 ) ) ) || ( ( A10363EscMCant.doubleValue() >= 1000 ) && ( ( GXutil.strcmp(AV50CodPrd, "0") == 0 ) || ( GXutil.strcmp(AV50CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV50CodPrd, "9") == 0 ) ) ) )
               {
                  AV57EscMFacCon = A4712EscMFacCon ;
                  AV40Cantidad = A890EscMCan.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                  AV40Cantidad = ((A10363EscMCant.doubleValue()>0) ? A10363EscMCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) : AV40Cantidad) ;
                  if ( A490ForPrdUMe == 2 )
                  {
                     AV43Unidades = httpContext.getMessage( "lt", "") ;
                  }
                  else
                  {
                     if ( A490ForPrdUMe == 3 )
                     {
                        if ( A743PrdUniCon == 3 )
                        {
                           AV43Unidades = httpContext.getMessage( "lt", "") ;
                        }
                        else
                        {
                           AV43Unidades = httpContext.getMessage( "kg", "") ;
                        }
                     }
                     else
                     {
                        AV43Unidades = httpContext.getMessage( "kg", "") ;
                        if ( A743PrdUniCon == 3 )
                        {
                           AV43Unidades = httpContext.getMessage( "lt", "") ;
                        }
                     }
                  }
               }
               else
               {
                  AV40Cantidad = A890EscMCan ;
                  AV40Cantidad = ((A10363EscMCant.doubleValue()>0) ? A890EscMCan : AV40Cantidad) ;
                  if ( A490ForPrdUMe == 2 )
                  {
                     AV43Unidades = httpContext.getMessage( "Cc", "") ;
                  }
                  else
                  {
                     if ( A490ForPrdUMe == 3 )
                     {
                        if ( A743PrdUniCon == 3 )
                        {
                           AV43Unidades = httpContext.getMessage( "Cc", "") ;
                        }
                        else
                        {
                           AV43Unidades = httpContext.getMessage( "g", "") ;
                        }
                     }
                     else
                     {
                        AV43Unidades = httpContext.getMessage( "g", "") ;
                        if ( A743PrdUniCon == 3 )
                        {
                           AV43Unidades = httpContext.getMessage( "Cc", "") ;
                        }
                     }
                  }
               }
            }
            else
            {
               AV40Cantidad = A890EscMCan ;
            }
            AV51Factor = GXutil.substring( A897EscMDsc, 1, 10) ;
            if ( A490ForPrdUMe == 2 )
            {
               AV42Unidad = httpContext.getMessage( "lt", "") ;
            }
            if ( ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 3 ) )
            {
               AV42Unidad = httpContext.getMessage( "kg", "") ;
            }
            if ( GXutil.strcmp(AV41LastProces, A764ProForCod) != 0 )
            {
               AV36ProForTie = A771ProForTie ;
               AV37Profortmx = A772ProForTmx ;
               AV38Proforphn = A6877ProForPhn ;
               AV39Proforphx = A6876ProForPhx ;
               h5OI0( false, 66) ;
               getPrinter().GxAttris("Calibri", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 25, Gx_line+27, 107, Gx_line+47, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 117, Gx_line+27, 368, Gx_line+47, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(8, Gx_line+0, 792, Gx_line+64, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(284, Gx_line+0, 284, Gx_line+64, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pad Batch", ""), 491, Gx_line+19, 555, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(489, Gx_line+0, 489, Gx_line+64, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "MATIZ", ""), 524, Gx_line+0, 566, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Gr/ml", ""), 424, Gx_line+27, 464, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Rama", ""), 492, Gx_line+41, 528, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "g/lt", ""), 605, Gx_line+27, 629, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(566, Gx_line+19, 595, Gx_line+39, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(566, Gx_line+40, 595, Gx_line+60, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(599, Gx_line+0, 599, Gx_line+64, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Apresto en", ""), 648, Gx_line+8, 720, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Rama", ""), 666, Gx_line+23, 702, Gx_line+42, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(633, Gx_line+0, 633, Gx_line+64, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "g/lt", ""), 749, Gx_line+27, 773, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(731, Gx_line+0, 731, Gx_line+64, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(381, Gx_line+0, 381, Gx_line+64, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Gr/L", ""), 322, Gx_line+27, 351, Gx_line+46, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+66) ;
            }
            AV48CosteP1 = DecimalUtil.doubleToDec(0) ;
            AV49CosteP2 = DecimalUtil.doubleToDec(0) ;
            AV53Prec_linea = A889EscMPrdPre ;
            AV52escmcos = A891EscMCos ;
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), httpContext.getMessage( "C", "")) == 0 )
            {
            }
            else
            {
               h5OI0( false, 28) ;
               getPrinter().GxAttris("Calibri", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 25, Gx_line+5, 243, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40Cantidad, "Z,ZZZ,ZZ9.999")), 389, Gx_line+5, 485, Gx_line+25, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(8, Gx_line+1, 792, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(284, Gx_line+1, 284, Gx_line+26, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(489, Gx_line+0, 489, Gx_line+26, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(599, Gx_line+0, 599, Gx_line+26, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(633, Gx_line+0, 633, Gx_line+26, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(731, Gx_line+0, 731, Gx_line+26, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(381, Gx_line+0, 381, Gx_line+26, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4712EscMFacCon, "ZZZZZ9.99999")), 290, Gx_line+5, 379, Gx_line+25, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+28) ;
            }
            AV54TotValor = AV54TotValor.add(A891EscMCos) ;
            AV48CosteP1 = AV48CosteP1.add(A891EscMCos) ;
            AV41LastProces = A764ProForCod ;
            if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
            {
               AV46CosteC = AV46CosteC.add(A891EscMCos) ;
            }
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "8") == 0 )
            {
               AV45CosteA = AV45CosteA.add(A891EscMCos) ;
            }
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "9") == 0 )
            {
               AV47CosteD = AV47CosteD.add(A891EscMCos) ;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV17TotKilo = AV54TotValor.divide(AV13TotKilos, 18, java.math.RoundingMode.DOWN) ;
         AV55TotMtr = DecimalUtil.doubleToDec(0) ;
         if ( AV19TotMts.doubleValue() > 0 )
         {
            AV55TotMtr = AV54TotValor.divide(AV19TotMts, 18, java.math.RoundingMode.DOWN) ;
         }
         h5OI0( false, 166) ;
         getPrinter().GxDrawRect(8, Gx_line+11, 792, Gx_line+163, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Teñida en Laboratorio", ""), 51, Gx_line+144, 192, Gx_line+163, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Matiz o Apresto en Lab.", ""), 376, Gx_line+144, 528, Gx_line+163, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(558, Gx_line+30, 558, Gx_line+163, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "COSTO TEORICO DE", ""), 616, Gx_line+31, 740, Gx_line+50, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "LABORATORIO", ""), 632, Gx_line+50, 725, Gx_line+69, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "MUESTRAS", ""), 257, Gx_line+11, 329, Gx_line+30, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "COSTOS", ""), 633, Gx_line+11, 685, Gx_line+30, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(8, Gx_line+30, 792, Gx_line+30, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(292, Gx_line+30, 292, Gx_line+163, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(9, Gx_line+144, 560, Gx_line+144, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "ACTUAL: $/M", ""), 576, Gx_line+80, 662, Gx_line+99, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV55TotMtr, "ZZ,ZZZ,ZZZ.ZZZZZ")), 668, Gx_line+80, 786, Gx_line+100, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "NUEVO:  $/M", ""), 576, Gx_line+125, 662, Gx_line+144, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(668, Gx_line+143, 785, Gx_line+143, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(8, Gx_line+2, 792, Gx_line+12, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV56Fecha, "99/99/99"), 576, Gx_line+100, 633, Gx_line+120, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+166) ;
         h5OI0( false, 117) ;
         getPrinter().GxDrawRect(11, Gx_line+3, 390, Gx_line+86, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(11, Gx_line+25, 389, Gx_line+25, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "ELABORACION DE FORMULA", ""), 110, Gx_line+5, 292, Gx_line+24, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(138, Gx_line+26, 138, Gx_line+112, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(264, Gx_line+26, 264, Gx_line+112, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(13, Gx_line+44, 391, Gx_line+44, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Pad Batch", ""), 32, Gx_line+27, 96, Gx_line+46, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Matiz", ""), 182, Gx_line+27, 219, Gx_line+46, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Apresto", ""), 288, Gx_line+25, 340, Gx_line+44, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(11, Gx_line+85, 390, Gx_line+112, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre y Firma", ""), 18, Gx_line+90, 122, Gx_line+109, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre y Firma", ""), 149, Gx_line+90, 253, Gx_line+109, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre y Firma", ""), 271, Gx_line+90, 375, Gx_line+109, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(432, Gx_line+3, 779, Gx_line+86, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(433, Gx_line+25, 778, Gx_line+25, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "APROBACION DEL COSTO", ""), 526, Gx_line+6, 687, Gx_line+25, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(432, Gx_line+85, 779, Gx_line+112, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Gerente General", ""), 551, Gx_line+90, 661, Gx_line+109, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+117) ;
         h5OI0( false, 89) ;
         getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Analista Desarrollador", ""), 17, Gx_line+50, 161, Gx_line+69, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Jefatura de Almacen", ""), 172, Gx_line+50, 304, Gx_line+69, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "de Quimicos", ""), 181, Gx_line+70, 262, Gx_line+89, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Departamento de", ""), 329, Gx_line+50, 444, Gx_line+69, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Programacion", ""), 342, Gx_line+70, 432, Gx_line+89, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Supervisor de", ""), 485, Gx_line+50, 575, Gx_line+69, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( " Produccion Acabado", ""), 464, Gx_line+70, 598, Gx_line+89, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Coordinador de Quimicos", ""), 614, Gx_line+50, 779, Gx_line+69, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(17, Gx_line+42, 160, Gx_line+42, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(166, Gx_line+42, 309, Gx_line+42, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(315, Gx_line+42, 458, Gx_line+42, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(465, Gx_line+42, 596, Gx_line+42, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(614, Gx_line+42, 778, Gx_line+42, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Elaboro", ""), 64, Gx_line+4, 114, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Conformidad", ""), 195, Gx_line+4, 280, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Conformidad", ""), 344, Gx_line+4, 429, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Conformidad", ""), 488, Gx_line+4, 573, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Autorizo", ""), 668, Gx_line+4, 724, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(8, Gx_line+4, 792, Gx_line+4, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+89) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5OI0( true, 0) ;
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

   public void h5OI0( boolean bFoot ,
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Calibri", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Calibri", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      A910Workstat = "" ;
      AV9ForSer = "" ;
      AV10ForColNom = "" ;
      AV13TotKilos = DecimalUtil.ZERO ;
      AV15MaqCod = "" ;
      AV16Incre = DecimalUtil.ZERO ;
      AV17TotKilo = DecimalUtil.ZERO ;
      AV18Por_quebra = DecimalUtil.ZERO ;
      AV19TotMts = DecimalUtil.ZERO ;
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P05OI2_A396EmprCod = new String[] {""} ;
      P05OI2_A407EmprNom = new String[] {""} ;
      P05OI2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV34NomEmp = "" ;
      P05OI3_A396EmprCod = new String[] {""} ;
      P05OI3_A831TipColCod = new byte[1] ;
      P05OI3_A483ForColNum = new int[1] ;
      P05OI3_A482ForColNom = new String[] {""} ;
      P05OI3_A494ForSer = new String[] {""} ;
      P05OI3_A252CliCod = new int[1] ;
      P05OI3_A1191ForNomCli = new String[] {""} ;
      P05OI3_n1191ForNomCli = new boolean[] {false} ;
      P05OI3_A583IntCod = new byte[1] ;
      P05OI3_A584IntDsc = new String[] {""} ;
      P05OI3_n584IntDsc = new boolean[] {false} ;
      P05OI3_A5362IntCodF = new byte[1] ;
      P05OI3_n5362IntCodF = new boolean[] {false} ;
      P05OI3_A5363IntDscF = new String[] {""} ;
      P05OI3_n5363IntDscF = new boolean[] {false} ;
      P05OI3_A832TipColDsc = new String[] {""} ;
      P05OI3_n832TipColDsc = new boolean[] {false} ;
      P05OI3_A279CliNom = new String[] {""} ;
      P05OI3_A1192ForNumCli = new int[1] ;
      P05OI3_n1192ForNumCli = new boolean[] {false} ;
      P05OI3_A995ForTonal = new String[] {""} ;
      P05OI3_n995ForTonal = new boolean[] {false} ;
      P05OI3_A626MatCod = new short[1] ;
      P05OI3_A627MatDsc = new String[] {""} ;
      P05OI3_n627MatDsc = new boolean[] {false} ;
      P05OI3_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05OI3_n485ForFec = new boolean[] {false} ;
      P05OI3_A5742ForSerDsc = new String[] {""} ;
      P05OI3_n5742ForSerDsc = new boolean[] {false} ;
      P05OI3_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P05OI3_n495ForUltMod = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A1191ForNomCli = "" ;
      A584IntDsc = "" ;
      A5363IntDscF = "" ;
      A832TipColDsc = "" ;
      A279CliNom = "" ;
      A995ForTonal = "" ;
      A627MatDsc = "" ;
      A485ForFec = GXutil.nullDate() ;
      A5742ForSerDsc = "" ;
      A495ForUltMod = GXutil.nullDate() ;
      AV22ForNomCli = "" ;
      AV24IntDsc = "" ;
      AV26IntDscF = "" ;
      AV27TipColDsc = "" ;
      AV20CliNom = "" ;
      GXt_char2 = "" ;
      AV29ForTonal = "" ;
      AV31matDsc = "" ;
      AV32ForFec = GXutil.nullDate() ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char5 = new String[1] ;
      AV33TipArtDsc = "" ;
      GXv_char6 = new String[1] ;
      AV21ForSerDsc = "" ;
      AV56Fecha = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      AV35Rb = DecimalUtil.ZERO ;
      AV49CosteP2 = DecimalUtil.ZERO ;
      AV48CosteP1 = DecimalUtil.ZERO ;
      AV41LastProces = "" ;
      AV46CosteC = DecimalUtil.ZERO ;
      AV47CosteD = DecimalUtil.ZERO ;
      AV45CosteA = DecimalUtil.ZERO ;
      P05OI4_A396EmprCod = new String[] {""} ;
      P05OI4_A910Workstat = new String[] {""} ;
      P05OI4_A490ForPrdUMe = new byte[1] ;
      P05OI4_A743PrdUniCon = new byte[1] ;
      P05OI4_A719PrdNum = new String[] {""} ;
      P05OI4_A10363EscMCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05OI4_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05OI4_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05OI4_A897EscMDsc = new String[] {""} ;
      P05OI4_A764ProForCod = new String[] {""} ;
      P05OI4_A771ProForTie = new short[1] ;
      P05OI4_A772ProForTmx = new short[1] ;
      P05OI4_A6877ProForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05OI4_n6877ProForPhn = new boolean[] {false} ;
      P05OI4_A6876ProForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05OI4_n6876ProForPhx = new boolean[] {false} ;
      P05OI4_A766ProForDsc = new String[] {""} ;
      P05OI4_A889EscMPrdPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05OI4_A891EscMCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05OI4_A718PrdNom = new String[] {""} ;
      P05OI4_A887EscMLin = new int[1] ;
      A719PrdNum = "" ;
      A10363EscMCant = DecimalUtil.ZERO ;
      A890EscMCan = DecimalUtil.ZERO ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A897EscMDsc = "" ;
      A764ProForCod = "" ;
      A6877ProForPhn = DecimalUtil.ZERO ;
      A6876ProForPhx = DecimalUtil.ZERO ;
      A766ProForDsc = "" ;
      A889EscMPrdPre = DecimalUtil.ZERO ;
      A891EscMCos = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV43Unidades = "" ;
      AV50CodPrd = "" ;
      AV57EscMFacCon = DecimalUtil.ZERO ;
      AV40Cantidad = DecimalUtil.ZERO ;
      AV51Factor = "" ;
      AV42Unidad = "" ;
      AV38Proforphn = DecimalUtil.ZERO ;
      AV39Proforphx = DecimalUtil.ZERO ;
      AV53Prec_linea = DecimalUtil.ZERO ;
      AV52escmcos = DecimalUtil.ZERO ;
      AV54TotValor = DecimalUtil.ZERO ;
      AV55TotMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc165__default(),
         new Object[] {
             new Object[] {
            P05OI2_A396EmprCod, P05OI2_A407EmprNom, P05OI2_n407EmprNom
            }
            , new Object[] {
            P05OI3_A396EmprCod, P05OI3_A831TipColCod, P05OI3_A483ForColNum, P05OI3_A482ForColNom, P05OI3_A494ForSer, P05OI3_A252CliCod, P05OI3_A1191ForNomCli, P05OI3_n1191ForNomCli, P05OI3_A583IntCod, P05OI3_A584IntDsc,
            P05OI3_n584IntDsc, P05OI3_A5362IntCodF, P05OI3_n5362IntCodF, P05OI3_A5363IntDscF, P05OI3_n5363IntDscF, P05OI3_A832TipColDsc, P05OI3_n832TipColDsc, P05OI3_A279CliNom, P05OI3_A1192ForNumCli, P05OI3_n1192ForNumCli,
            P05OI3_A995ForTonal, P05OI3_n995ForTonal, P05OI3_A626MatCod, P05OI3_A627MatDsc, P05OI3_n627MatDsc, P05OI3_A485ForFec, P05OI3_n485ForFec, P05OI3_A5742ForSerDsc, P05OI3_n5742ForSerDsc, P05OI3_A495ForUltMod,
            P05OI3_n495ForUltMod
            }
            , new Object[] {
            P05OI4_A396EmprCod, P05OI4_A910Workstat, P05OI4_A490ForPrdUMe, P05OI4_A743PrdUniCon, P05OI4_A719PrdNum, P05OI4_A10363EscMCant, P05OI4_A890EscMCan, P05OI4_A4712EscMFacCon, P05OI4_A897EscMDsc, P05OI4_A764ProForCod,
            P05OI4_A771ProForTie, P05OI4_A772ProForTmx, P05OI4_A6877ProForPhn, P05OI4_n6877ProForPhn, P05OI4_A6876ProForPhx, P05OI4_n6876ProForPhx, P05OI4_A766ProForDsc, P05OI4_A889EscMPrdPre, P05OI4_A891EscMCos, P05OI4_A718PrdNom,
            P05OI4_A887EscMLin
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV12TipColCod ;
   private byte AV44FlagUni ;
   private byte GXv_int1[] ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte A5362IntCodF ;
   private byte AV23IntCod ;
   private byte AV25IntCodF ;
   private byte A490ForPrdUMe ;
   private byte A743PrdUniCon ;
   private short gxcookieaux ;
   private short A626MatCod ;
   private short AV30MatCod ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short AV36ProForTie ;
   private short AV37Profortmx ;
   private short Gx_err ;
   private int AV8CliCod ;
   private int AV11ForColNum ;
   private int AV14Volumen ;
   private int AV58ClicodDestino ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A1192ForNumCli ;
   private int AV28ForNumCli ;
   private int GXv_int4[] ;
   private int Gx_OldLine ;
   private int A887EscMLin ;
   private java.math.BigDecimal AV13TotKilos ;
   private java.math.BigDecimal AV16Incre ;
   private java.math.BigDecimal AV17TotKilo ;
   private java.math.BigDecimal AV18Por_quebra ;
   private java.math.BigDecimal AV19TotMts ;
   private java.math.BigDecimal AV35Rb ;
   private java.math.BigDecimal AV49CosteP2 ;
   private java.math.BigDecimal AV48CosteP1 ;
   private java.math.BigDecimal AV46CosteC ;
   private java.math.BigDecimal AV47CosteD ;
   private java.math.BigDecimal AV45CosteA ;
   private java.math.BigDecimal A10363EscMCant ;
   private java.math.BigDecimal A890EscMCan ;
   private java.math.BigDecimal A4712EscMFacCon ;
   private java.math.BigDecimal A6877ProForPhn ;
   private java.math.BigDecimal A6876ProForPhx ;
   private java.math.BigDecimal A889EscMPrdPre ;
   private java.math.BigDecimal A891EscMCos ;
   private java.math.BigDecimal AV57EscMFacCon ;
   private java.math.BigDecimal AV40Cantidad ;
   private java.math.BigDecimal AV38Proforphn ;
   private java.math.BigDecimal AV39Proforphx ;
   private java.math.BigDecimal AV53Prec_linea ;
   private java.math.BigDecimal AV52escmcos ;
   private java.math.BigDecimal AV54TotValor ;
   private java.math.BigDecimal AV55TotMtr ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A910Workstat ;
   private String AV9ForSer ;
   private String AV10ForColNom ;
   private String AV15MaqCod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV34NomEmp ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A1191ForNomCli ;
   private String A584IntDsc ;
   private String A5363IntDscF ;
   private String A832TipColDsc ;
   private String A279CliNom ;
   private String A995ForTonal ;
   private String A627MatDsc ;
   private String A5742ForSerDsc ;
   private String AV22ForNomCli ;
   private String AV24IntDsc ;
   private String AV26IntDscF ;
   private String AV27TipColDsc ;
   private String AV20CliNom ;
   private String GXt_char2 ;
   private String AV29ForTonal ;
   private String AV31matDsc ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String AV33TipArtDsc ;
   private String GXv_char6[] ;
   private String AV21ForSerDsc ;
   private String AV41LastProces ;
   private String A719PrdNum ;
   private String A897EscMDsc ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A718PrdNom ;
   private String AV43Unidades ;
   private String AV50CodPrd ;
   private String AV51Factor ;
   private String AV42Unidad ;
   private java.util.Date A485ForFec ;
   private java.util.Date A495ForUltMod ;
   private java.util.Date AV32ForFec ;
   private java.util.Date AV56Fecha ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n1191ForNomCli ;
   private boolean n584IntDsc ;
   private boolean n5362IntCodF ;
   private boolean n5363IntDscF ;
   private boolean n832TipColDsc ;
   private boolean n1192ForNumCli ;
   private boolean n995ForTonal ;
   private boolean n627MatDsc ;
   private boolean n485ForFec ;
   private boolean n5742ForSerDsc ;
   private boolean n495ForUltMod ;
   private boolean n6877ProForPhn ;
   private boolean n6876ProForPhx ;
   private IDataStoreProvider pr_default ;
   private String[] P05OI2_A396EmprCod ;
   private String[] P05OI2_A407EmprNom ;
   private boolean[] P05OI2_n407EmprNom ;
   private String[] P05OI3_A396EmprCod ;
   private byte[] P05OI3_A831TipColCod ;
   private int[] P05OI3_A483ForColNum ;
   private String[] P05OI3_A482ForColNom ;
   private String[] P05OI3_A494ForSer ;
   private int[] P05OI3_A252CliCod ;
   private String[] P05OI3_A1191ForNomCli ;
   private boolean[] P05OI3_n1191ForNomCli ;
   private byte[] P05OI3_A583IntCod ;
   private String[] P05OI3_A584IntDsc ;
   private boolean[] P05OI3_n584IntDsc ;
   private byte[] P05OI3_A5362IntCodF ;
   private boolean[] P05OI3_n5362IntCodF ;
   private String[] P05OI3_A5363IntDscF ;
   private boolean[] P05OI3_n5363IntDscF ;
   private String[] P05OI3_A832TipColDsc ;
   private boolean[] P05OI3_n832TipColDsc ;
   private String[] P05OI3_A279CliNom ;
   private int[] P05OI3_A1192ForNumCli ;
   private boolean[] P05OI3_n1192ForNumCli ;
   private String[] P05OI3_A995ForTonal ;
   private boolean[] P05OI3_n995ForTonal ;
   private short[] P05OI3_A626MatCod ;
   private String[] P05OI3_A627MatDsc ;
   private boolean[] P05OI3_n627MatDsc ;
   private java.util.Date[] P05OI3_A485ForFec ;
   private boolean[] P05OI3_n485ForFec ;
   private String[] P05OI3_A5742ForSerDsc ;
   private boolean[] P05OI3_n5742ForSerDsc ;
   private java.util.Date[] P05OI3_A495ForUltMod ;
   private boolean[] P05OI3_n495ForUltMod ;
   private String[] P05OI4_A396EmprCod ;
   private String[] P05OI4_A910Workstat ;
   private byte[] P05OI4_A490ForPrdUMe ;
   private byte[] P05OI4_A743PrdUniCon ;
   private String[] P05OI4_A719PrdNum ;
   private java.math.BigDecimal[] P05OI4_A10363EscMCant ;
   private java.math.BigDecimal[] P05OI4_A890EscMCan ;
   private java.math.BigDecimal[] P05OI4_A4712EscMFacCon ;
   private String[] P05OI4_A897EscMDsc ;
   private String[] P05OI4_A764ProForCod ;
   private short[] P05OI4_A771ProForTie ;
   private short[] P05OI4_A772ProForTmx ;
   private java.math.BigDecimal[] P05OI4_A6877ProForPhn ;
   private boolean[] P05OI4_n6877ProForPhn ;
   private java.math.BigDecimal[] P05OI4_A6876ProForPhx ;
   private boolean[] P05OI4_n6876ProForPhx ;
   private String[] P05OI4_A766ProForDsc ;
   private java.math.BigDecimal[] P05OI4_A889EscMPrdPre ;
   private java.math.BigDecimal[] P05OI4_A891EscMCos ;
   private String[] P05OI4_A718PrdNom ;
   private int[] P05OI4_A887EscMLin ;
}

final  class pprc165__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05OI2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05OI3", "SELECT T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.ForNomCli, T1.IntCod, T3.IntDsc, T1.IntCodF, T6.IntDscF, T5.TipColDsc, T2.CliNom, T1.ForNumCli, T1.ForTonal, T1.MatCod, T4.MatDsc, T1.ForFec, T1.ForSerDsc, T1.ForUltMod FROM (((((TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod) INNER JOIN TXPMATICE T4 ON T4.EmprCod = T1.EmprCod AND T4.MatCod = T1.MatCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = T1.EmprCod AND T5.TipColCod = T1.TipColCod) LEFT JOIN TXPINTFAC T6 ON T6.EmprCod = T1.EmprCod AND T6.IntCodF = T1.IntCodF) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05OI4", "SELECT T1.EmprCod, T1.Workstat, T1.ForPrdUMe, T2.PrdUniCon, T1.PrdNum, T1.EscMCant, T1.EscMCan, T1.EscMFacCon, T1.EscMDsc, T1.ProForCod, T3.ProForTie, T3.ProForTmx, T3.ProForPhn, T3.ProForPhx, T3.ProForDsc, T1.EscMPrdPre, T1.EscMCos, T2.PrdNom, T1.EscMLin FROM ((TXPESCMAN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPCPROFO T3 ON T3.EmprCod = T1.EmprCod AND T3.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.Workstat = ? ORDER BY T1.EmprCod, T1.Workstat, T1.EscMLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 30);
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(16);
               ((String[]) buf[23])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(19, 26);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 30);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,5);
               ((String[]) buf[19])[0] = rslt.getString(18, 26);
               ((int[]) buf[20])[0] = rslt.getInt(19);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

