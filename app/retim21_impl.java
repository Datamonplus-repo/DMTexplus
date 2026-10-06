package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class retim21_impl extends GXWebReport
{
   public retim21_impl( com.genexus.internet.HttpContext context )
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
            AV29Metpiecod = httpContext.GetPar( "Metpiecod") ;
            AV30Metpiekil = CommonUtil.decimalVal( httpContext.GetPar( "Metpiekil"), ".") ;
            AV31Metpiemet = CommonUtil.decimalVal( httpContext.GetPar( "Metpiemet"), ".") ;
            AV35MetPieAnc = (short)(GXutil.lval( httpContext.GetPar( "MetPieAnc"))) ;
            AV44MetPieMtd = (short)(GXutil.lval( httpContext.GetPar( "MetPieMtd"))) ;
            AV36MaqCod = httpContext.GetPar( "MaqCod") ;
            AV38Opecod = (int)(GXutil.lval( httpContext.GetPar( "Opecod"))) ;
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 256, 2837, 5674, 0, 1, 1, 0, 1, 1) )
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
         GXt_int1 = AV45Eti2 ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETIM21", ""), GXv_int2) ;
         retim21_impl.this.GXt_int1 = GXv_int2[0] ;
         AV45Eti2 = GXt_int1 ;
         GXt_int1 = AV46NumPzsFs ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NPFF", ""), GXv_int2) ;
         retim21_impl.this.GXt_int1 = GXv_int2[0] ;
         AV46NumPzsFs = GXt_int1 ;
         GXt_int1 = AV47NumPzsFs2 ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NPFF2", ""), GXv_int2) ;
         retim21_impl.this.GXt_int1 = GXv_int2[0] ;
         AV47NumPzsFs2 = GXt_int1 ;
         AV50Maqcodban = " " ;
         /* Using cursor P07PK2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV36MaqCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A602MaqCod = P07PK2_A602MaqCod[0] ;
            A5292MaqCodBan = P07PK2_A5292MaqCodBan[0] ;
            n5292MaqCodBan = P07PK2_n5292MaqCodBan[0] ;
            AV50Maqcodban = A5292MaqCodBan ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV34Fec = GXutil.today( ) ;
         AV48Pzacod = GXutil.trim( AV29Metpiecod) ;
         /* Using cursor P07PK3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A13012CliImpReop = P07PK3_A13012CliImpReop[0] ;
            A1909BarGraAca = P07PK3_A1909BarGraAca[0] ;
            A125BarAncAca1 = P07PK3_A125BarAncAca1[0] ;
            A1652BarSerDsc = P07PK3_A1652BarSerDsc[0] ;
            A9789BarItem5 = P07PK3_A9789BarItem5[0] ;
            A212BarSer = P07PK3_A212BarSer[0] ;
            A252CliCod = P07PK3_A252CliCod[0] ;
            n252CliCod = P07PK3_n252CliCod[0] ;
            A12330SubRevNm = P07PK3_A12330SubRevNm[0] ;
            n12330SubRevNm = P07PK3_n12330SubRevNm[0] ;
            A279CliNom = P07PK3_A279CliNom[0] ;
            A12329SubRevID = P07PK3_A12329SubRevID[0] ;
            n12329SubRevID = P07PK3_n12329SubRevID[0] ;
            A1234BarNomCli = P07PK3_A1234BarNomCli[0] ;
            A136BarColNum = P07PK3_A136BarColNum[0] ;
            A135BarColNom = P07PK3_A135BarColNom[0] ;
            A143BarDisNum = P07PK3_A143BarDisNum[0] ;
            A12330SubRevNm = P07PK3_A12330SubRevNm[0] ;
            n12330SubRevNm = P07PK3_n12330SubRevNm[0] ;
            A13012CliImpReop = P07PK3_A13012CliImpReop[0] ;
            A279CliNom = P07PK3_A279CliNom[0] ;
            if ( GXutil.len( AV48Pzacod) == 9 )
            {
               AV48Pzacod = GXutil.substring( AV29Metpiecod, 5, 5) ;
            }
            else
            {
               AV48Pzacod = AV29Metpiecod ;
            }
            AV54Hdr = ((GXutil.strcmp(A13012CliImpReop, httpContext.getMessage( "N", ""))==0) ? GXutil.str( A129BarCod, 8, 0) : ((A132BarCodReo==0) ? GXutil.str( A129BarCod, 8, 0) : GXutil.str( A129BarCod, 8, 0)+" "+GXutil.str( A132BarCodReo, 1, 0))) ;
            AV49Anc = AV35MetPieAnc ;
            if ( GXutil.strcmp(AV50Maqcodban, httpContext.getMessage( "F", "")) == 0 )
            {
               AV49Anc = (short)(AV35MetPieAnc/ (double) (2)) ;
            }
            AV55BarGraAca = A1909BarGraAca ;
            AV56BarAncAca1 = A125BarAncAca1 ;
            AV39Dsc20 = GXutil.substring( A1652BarSerDsc, 1, 17) ;
            AV40Ref10 = GXutil.substring( A9789BarItem5, 1, 10) ;
            AV43Barser6 = GXutil.substring( A212BarSer, 1, 6) ;
            AV51TxtAgr = "" ;
            AV52Clicod = A252CliCod ;
            /* Using cursor P07PK4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A1508CliCodAgr = P07PK4_A1508CliCodAgr[0] ;
               A122BarAgrPar = P07PK4_A122BarAgrPar[0] ;
               A119BarAgrCod = P07PK4_A119BarAgrCod[0] ;
               A124BarAgrReo = P07PK4_A124BarAgrReo[0] ;
               if ( A1508CliCodAgr == AV52Clicod )
               {
                  AV51TxtAgr += ((GXutil.strcmp(AV51TxtAgr, "")==0) ? httpContext.getMessage( "Os Agrup:", "")+GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0))+GXutil.trim( A122BarAgrPar) : ","+GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0))+GXutil.trim( A122BarAgrPar)) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV41CliNom = ((GXutil.strcmp("", A12329SubRevID)==0) ? A279CliNom : GXutil.substring( A12330SubRevNm, 1, 30)) ;
            AV52Clicod = (int)(((GXutil.strcmp("", A12329SubRevID)==0) ? A252CliCod : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( A12329SubRevID, "."))))) ;
            if ( AV45Eti2 == 0 )
            {
               h7PK0( false, 190) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 5, Gx_line+30, 42, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41CliNom, "")), 57, Gx_line+29, 246, Gx_line+47, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O. S.:", ""), 5, Gx_line+58, 34, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Hdr, "")), 57, Gx_line+57, 127, Gx_line+75, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "T. Cliente:", ""), 221, Gx_line+59, 270, Gx_line+74, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 271, Gx_line+58, 380, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor:", ""), 5, Gx_line+88, 27, Gx_line+103, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 109, Gx_line+88, 191, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 57, Gx_line+88, 102, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 271, Gx_line+88, 353, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor Cli:", ""), 221, Gx_line+88, 257, Gx_line+103, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo:", ""), 5, Gx_line+117, 39, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Barser6, "")), 57, Gx_line+117, 139, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 109, Gx_line+117, 273, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N. Peça:", ""), 5, Gx_line+146, 48, Gx_line+161, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Pzacod, "")), 57, Gx_line+145, 131, Gx_line+162, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros:", ""), 221, Gx_line+146, 260, Gx_line+161, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31Metpiemet, "ZZZZZ9.99")), 271, Gx_line+145, 338, Gx_line+163, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Largura:", ""), 135, Gx_line+146, 179, Gx_line+161, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49Anc), "ZZ9")), 182, Gx_line+145, 205, Gx_line+163, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TxtAgr, "")), 5, Gx_line+168, 334, Gx_line+184, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+190) ;
            }
            else
            {
               if ( ( AV52Clicod == 372 ) || ( AV52Clicod == 437 ) || ( AV52Clicod == 456 ) )
               {
                  h7PK0( false, 190) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Kgs:", ""), 202, Gx_line+155, 226, Gx_line+170, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30Metpiekil, "ZZZZZ9.99")), 252, Gx_line+155, 319, Gx_line+173, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44MetPieMtd), "ZZZ9")), 160, Gx_line+155, 190, Gx_line+173, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Gr(g/m2):", ""), 110, Gx_line+155, 159, Gx_line+170, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49Anc), "ZZ9")), 169, Gx_line+136, 192, Gx_line+154, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Larg(cm):", ""), 110, Gx_line+136, 160, Gx_line+151, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31Metpiemet, "ZZZZZ9.99")), 252, Gx_line+136, 319, Gx_line+154, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Metros:", ""), 202, Gx_line+136, 241, Gx_line+151, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Pzacod, "")), 58, Gx_line+114, 132, Gx_line+131, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "N. Peça:", ""), 8, Gx_line+114, 51, Gx_line+129, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 108, Gx_line+89, 272, Gx_line+107, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Barser6, "")), 58, Gx_line+89, 140, Gx_line+107, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Artigo:", ""), 8, Gx_line+89, 42, Gx_line+104, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cor Cli:", ""), 225, Gx_line+72, 261, Gx_line+87, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 275, Gx_line+72, 357, Gx_line+90, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 58, Gx_line+72, 103, Gx_line+90, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 108, Gx_line+72, 190, Gx_line+90, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cor:", ""), 8, Gx_line+72, 30, Gx_line+87, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 275, Gx_line+43, 384, Gx_line+61, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "T. Cliente:", ""), 225, Gx_line+43, 274, Gx_line+58, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Hdr, "")), 58, Gx_line+43, 128, Gx_line+61, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "O. S.:", ""), 8, Gx_line+43, 37, Gx_line+58, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41CliNom, "")), 58, Gx_line+9, 247, Gx_line+27, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 8, Gx_line+9, 45, Gx_line+24, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "GrPed.(g/m2):", ""), 9, Gx_line+157, 58, Gx_line+172, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "LargPed.(cm):", ""), 9, Gx_line+136, 59, Gx_line+151, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV55BarGraAca), "ZZZ9")), 67, Gx_line+135, 97, Gx_line+153, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV56BarAncAca1), "ZZ9")), 67, Gx_line+154, 90, Gx_line+172, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+190) ;
               }
               else
               {
                  h7PK0( false, 189) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 5, Gx_line+18, 42, Gx_line+33, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41CliNom, "")), 57, Gx_line+17, 246, Gx_line+35, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "O. S.:", ""), 5, Gx_line+46, 34, Gx_line+61, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Hdr, "")), 57, Gx_line+45, 127, Gx_line+63, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "T. Cliente:", ""), 222, Gx_line+47, 271, Gx_line+62, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 272, Gx_line+46, 381, Gx_line+64, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cor:", ""), 5, Gx_line+75, 27, Gx_line+90, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 110, Gx_line+75, 192, Gx_line+93, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 57, Gx_line+75, 102, Gx_line+93, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 272, Gx_line+75, 354, Gx_line+93, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cor Cli:", ""), 222, Gx_line+75, 258, Gx_line+90, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Artigo:", ""), 5, Gx_line+104, 39, Gx_line+119, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Barser6, "")), 57, Gx_line+104, 139, Gx_line+122, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 110, Gx_line+104, 274, Gx_line+122, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "N. Peça:", ""), 5, Gx_line+133, 48, Gx_line+148, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Pzacod, "")), 57, Gx_line+132, 131, Gx_line+149, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Metros:", ""), 222, Gx_line+133, 261, Gx_line+148, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31Metpiemet, "ZZZZZ9.99")), 272, Gx_line+132, 339, Gx_line+150, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Larg(cm):", ""), 135, Gx_line+133, 185, Gx_line+148, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49Anc), "ZZ9")), 191, Gx_line+132, 214, Gx_line+150, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Gr(g/m2):", ""), 135, Gx_line+150, 184, Gx_line+165, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44MetPieMtd), "ZZZ9")), 188, Gx_line+150, 218, Gx_line+168, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30Metpiekil, "ZZZZZ9.99")), 272, Gx_line+150, 339, Gx_line+168, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Kgs:", ""), 236, Gx_line+150, 260, Gx_line+165, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TxtAgr, "")), 5, Gx_line+169, 240, Gx_line+185, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+189) ;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7PK0( true, 0) ;
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

   public void h7PK0( boolean bFoot ,
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
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV29Metpiecod = "" ;
      AV30Metpiekil = DecimalUtil.ZERO ;
      AV31Metpiemet = DecimalUtil.ZERO ;
      AV36MaqCod = "" ;
      GXv_int2 = new byte[1] ;
      AV50Maqcodban = "" ;
      scmdbuf = "" ;
      P07PK2_A396EmprCod = new String[] {""} ;
      P07PK2_A602MaqCod = new String[] {""} ;
      P07PK2_A5292MaqCodBan = new String[] {""} ;
      P07PK2_n5292MaqCodBan = new boolean[] {false} ;
      A602MaqCod = "" ;
      A5292MaqCodBan = "" ;
      AV34Fec = GXutil.nullDate() ;
      AV48Pzacod = "" ;
      P07PK3_A396EmprCod = new String[] {""} ;
      P07PK3_A129BarCod = new int[1] ;
      P07PK3_A132BarCodReo = new byte[1] ;
      P07PK3_A130BarCodPar = new String[] {""} ;
      P07PK3_A13012CliImpReop = new String[] {""} ;
      P07PK3_A1909BarGraAca = new short[1] ;
      P07PK3_A125BarAncAca1 = new short[1] ;
      P07PK3_A1652BarSerDsc = new String[] {""} ;
      P07PK3_A9789BarItem5 = new String[] {""} ;
      P07PK3_A212BarSer = new String[] {""} ;
      P07PK3_A252CliCod = new int[1] ;
      P07PK3_n252CliCod = new boolean[] {false} ;
      P07PK3_A12330SubRevNm = new String[] {""} ;
      P07PK3_n12330SubRevNm = new boolean[] {false} ;
      P07PK3_A279CliNom = new String[] {""} ;
      P07PK3_A12329SubRevID = new String[] {""} ;
      P07PK3_n12329SubRevID = new boolean[] {false} ;
      P07PK3_A1234BarNomCli = new String[] {""} ;
      P07PK3_A136BarColNum = new int[1] ;
      P07PK3_A135BarColNom = new String[] {""} ;
      P07PK3_A143BarDisNum = new String[] {""} ;
      A13012CliImpReop = "" ;
      A1652BarSerDsc = "" ;
      A9789BarItem5 = "" ;
      A212BarSer = "" ;
      A12330SubRevNm = "" ;
      A279CliNom = "" ;
      A12329SubRevID = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A143BarDisNum = "" ;
      AV54Hdr = "" ;
      AV39Dsc20 = "" ;
      AV40Ref10 = "" ;
      AV43Barser6 = "" ;
      AV51TxtAgr = "" ;
      P07PK4_A396EmprCod = new String[] {""} ;
      P07PK4_A129BarCod = new int[1] ;
      P07PK4_A132BarCodReo = new byte[1] ;
      P07PK4_A130BarCodPar = new String[] {""} ;
      P07PK4_A1508CliCodAgr = new int[1] ;
      P07PK4_A122BarAgrPar = new String[] {""} ;
      P07PK4_A119BarAgrCod = new int[1] ;
      P07PK4_A124BarAgrReo = new byte[1] ;
      A122BarAgrPar = "" ;
      AV41CliNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.retim21__default(),
         new Object[] {
             new Object[] {
            P07PK2_A396EmprCod, P07PK2_A602MaqCod, P07PK2_A5292MaqCodBan, P07PK2_n5292MaqCodBan
            }
            , new Object[] {
            P07PK3_A396EmprCod, P07PK3_A129BarCod, P07PK3_A132BarCodReo, P07PK3_A130BarCodPar, P07PK3_A13012CliImpReop, P07PK3_A1909BarGraAca, P07PK3_A125BarAncAca1, P07PK3_A1652BarSerDsc, P07PK3_A9789BarItem5, P07PK3_A212BarSer,
            P07PK3_A252CliCod, P07PK3_n252CliCod, P07PK3_A12330SubRevNm, P07PK3_n12330SubRevNm, P07PK3_A279CliNom, P07PK3_A12329SubRevID, P07PK3_n12329SubRevID, P07PK3_A1234BarNomCli, P07PK3_A136BarColNum, P07PK3_A135BarColNom,
            P07PK3_A143BarDisNum
            }
            , new Object[] {
            P07PK4_A396EmprCod, P07PK4_A129BarCod, P07PK4_A132BarCodReo, P07PK4_A130BarCodPar, P07PK4_A1508CliCodAgr, P07PK4_A122BarAgrPar, P07PK4_A119BarAgrCod, P07PK4_A124BarAgrReo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV45Eti2 ;
   private byte AV46NumPzsFs ;
   private byte AV47NumPzsFs2 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A124BarAgrReo ;
   private short gxcookieaux ;
   private short AV35MetPieAnc ;
   private short AV44MetPieMtd ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short AV49Anc ;
   private short AV55BarGraAca ;
   private short AV56BarAncAca1 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV38Opecod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV52Clicod ;
   private int A1508CliCodAgr ;
   private int A119BarAgrCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV30Metpiekil ;
   private java.math.BigDecimal AV31Metpiemet ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV29Metpiecod ;
   private String AV36MaqCod ;
   private String AV50Maqcodban ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A5292MaqCodBan ;
   private String AV48Pzacod ;
   private String A13012CliImpReop ;
   private String A1652BarSerDsc ;
   private String A9789BarItem5 ;
   private String A212BarSer ;
   private String A12330SubRevNm ;
   private String A279CliNom ;
   private String A12329SubRevID ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String A143BarDisNum ;
   private String AV54Hdr ;
   private String AV39Dsc20 ;
   private String AV40Ref10 ;
   private String AV43Barser6 ;
   private String AV51TxtAgr ;
   private String A122BarAgrPar ;
   private String AV41CliNom ;
   private java.util.Date AV34Fec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n5292MaqCodBan ;
   private boolean n252CliCod ;
   private boolean n12330SubRevNm ;
   private boolean n12329SubRevID ;
   private IDataStoreProvider pr_default ;
   private String[] P07PK2_A396EmprCod ;
   private String[] P07PK2_A602MaqCod ;
   private String[] P07PK2_A5292MaqCodBan ;
   private boolean[] P07PK2_n5292MaqCodBan ;
   private String[] P07PK3_A396EmprCod ;
   private int[] P07PK3_A129BarCod ;
   private byte[] P07PK3_A132BarCodReo ;
   private String[] P07PK3_A130BarCodPar ;
   private String[] P07PK3_A13012CliImpReop ;
   private short[] P07PK3_A1909BarGraAca ;
   private short[] P07PK3_A125BarAncAca1 ;
   private String[] P07PK3_A1652BarSerDsc ;
   private String[] P07PK3_A9789BarItem5 ;
   private String[] P07PK3_A212BarSer ;
   private int[] P07PK3_A252CliCod ;
   private boolean[] P07PK3_n252CliCod ;
   private String[] P07PK3_A12330SubRevNm ;
   private boolean[] P07PK3_n12330SubRevNm ;
   private String[] P07PK3_A279CliNom ;
   private String[] P07PK3_A12329SubRevID ;
   private boolean[] P07PK3_n12329SubRevID ;
   private String[] P07PK3_A1234BarNomCli ;
   private int[] P07PK3_A136BarColNum ;
   private String[] P07PK3_A135BarColNom ;
   private String[] P07PK3_A143BarDisNum ;
   private String[] P07PK4_A396EmprCod ;
   private int[] P07PK4_A129BarCod ;
   private byte[] P07PK4_A132BarCodReo ;
   private String[] P07PK4_A130BarCodPar ;
   private int[] P07PK4_A1508CliCodAgr ;
   private String[] P07PK4_A122BarAgrPar ;
   private int[] P07PK4_A119BarAgrCod ;
   private byte[] P07PK4_A124BarAgrReo ;
}

final  class retim21__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07PK2", "SELECT EmprCod, MaqCod, MaqCodBan FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07PK3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.CliImpReop, T1.BarGraAca, T1.BarAncAca1, T1.BarSerDsc, T1.BarItem5, T1.BarSer, T1.CliCod, T2.RevenNm AS SubRevNm, T3.CliNom, T1.SubRevID AS SubRevID, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarDisNum FROM ((TXPBARCAD T1 LEFT JOIN TXPREVEND T2 ON T2.EmprCod = T1.EmprCod AND T2.RevenID = T1.SubRevID) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07PK4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, CliCodAgr, BarAgrPar, BarAgrCod, BarAgrReo FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 30);
               ((String[]) buf[15])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 13);
               ((int[]) buf[18])[0] = rslt.getInt(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 13);
               ((String[]) buf[20])[0] = rslt.getString(18, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
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
               stmt.setString(2, (String)parms[1], 6);
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
               return;
      }
   }

}

