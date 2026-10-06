package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rtn0003_impl extends GXWebReport
{
   public rtn0003_impl( com.genexus.internet.HttpContext context )
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
            AV8BarCodi = (int)(GXutil.lval( httpContext.GetPar( "BarCodi"))) ;
            AV9CodReoi = (byte)(GXutil.lval( httpContext.GetPar( "CodReoi"))) ;
            AV10CodPari = httpContext.GetPar( "CodPari") ;
            AV11BarCodf = (int)(GXutil.lval( httpContext.GetPar( "BarCodf"))) ;
            AV12CodReof = (byte)(GXutil.lval( httpContext.GetPar( "CodReof"))) ;
            AV13CodParf = httpContext.GetPar( "CodParf") ;
            AV14DisNumi = httpContext.GetPar( "DisNumi") ;
            AV15DisNumf = httpContext.GetPar( "DisNumf") ;
            AV16CliCodi = (int)(GXutil.lval( httpContext.GetPar( "CliCodi"))) ;
            AV17CliCodf = (int)(GXutil.lval( httpContext.GetPar( "CliCodf"))) ;
            AV51ControlesdeCalidad_json = httpContext.GetPar( "ControlesdeCalidad_json") ;
            AV20CCFCHi = localUtil.parseDateParm( httpContext.GetPar( "CCFCHi")) ;
            AV21CCFCHf = localUtil.parseDateParm( httpContext.GetPar( "CCFCHf")) ;
            AV22BarSeri = httpContext.GetPar( "BarSeri") ;
            AV23BarSerf = httpContext.GetPar( "BarSerf") ;
            AV31Barmdlcod = httpContext.GetPar( "Barmdlcod") ;
            AV32Barcolnom = httpContext.GetPar( "Barcolnom") ;
            AV33Barcolnomf = httpContext.GetPar( "Barcolnomf") ;
            AV34Barcolnum = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum"))) ;
            AV35barcolnumf = (int)(GXutil.lval( httpContext.GetPar( "barcolnumf"))) ;
            AV45Enccli1 = httpContext.GetPar( "Enccli1") ;
            AV46Enccli2 = httpContext.GetPar( "Enccli2") ;
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
      M_bot = 1 ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_int1 = AV37erfoc ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int2) ;
         rtn0003_impl.this.GXt_int1 = GXv_int2[0] ;
         AV37erfoc = GXt_int1 ;
         GXt_int1 = AV43Enc20c ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "20ENCO", ""), GXv_int2) ;
         rtn0003_impl.this.GXt_int1 = GXv_int2[0] ;
         AV43Enc20c = GXt_int1 ;
         GXt_char3 = AV44Lit10 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1098_", ""), (byte)(99), GXv_char4) ;
         rtn0003_impl.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV44Lit10 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "20ENCO01", ""), (byte)(99), GXv_char6) ;
         rtn0003_impl.this.GXt_char5 = GXv_char6[0] ;
         AV44Lit10 = ((AV43Enc20c==0) ? GXt_char3 : GXt_char5) ;
         AV36TitMdl = " " ;
         if ( AV37erfoc == 1 )
         {
            AV36TitMdl = httpContext.getMessage( "/ Modelo", "") ;
         }
         /* Using cursor P06ZO2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06ZO2_A407EmprNom[0] ;
            n407EmprNom = P06ZO2_n407EmprNom[0] ;
            AV25EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV49ControlesdeCalidad_SDT.fromJSonString(AV51ControlesdeCalidad_json, null);
         AV54CCtcodCollection.clear();
         AV64GXV1 = 1 ;
         while ( AV64GXV1 <= AV49ControlesdeCalidad_SDT.size() )
         {
            AV50ControlesdeCalidad_SDTItem = (app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)((app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)AV49ControlesdeCalidad_SDT.elementAt(-1+AV64GXV1));
            if ( AV50ControlesdeCalidad_SDTItem.getgxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar() )
            {
               AV54CCtcodCollection.add((int)(AV50ControlesdeCalidad_SDTItem.getgxTv_SdtControlesdeCalidad_SDT_Item_Cctcod()), 0);
            }
            AV64GXV1 = (int)(AV64GXV1+1) ;
         }
         AV56CCtcodCollection_json = AV54CCtcodCollection.toJSonString(false) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(A4031CCTCod) ,
                                              AV54CCtcodCollection ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              Byte.valueOf(AV12CodReof) ,
                                              A130BarCodPar ,
                                              AV13CodParf ,
                                              Integer.valueOf(A252CliCod) ,
                                              Integer.valueOf(AV16CliCodi) ,
                                              Integer.valueOf(AV17CliCodf) ,
                                              Byte.valueOf(AV43Enc20c) ,
                                              A143BarDisNum ,
                                              AV14DisNumi ,
                                              AV15DisNumf ,
                                              A4812BarEncCli ,
                                              AV45Enccli1 ,
                                              AV46Enccli2 ,
                                              A212BarSer ,
                                              AV22BarSeri ,
                                              AV23BarSerf ,
                                              A4033CCFch ,
                                              AV21CCFCHf ,
                                              A4609BarMdlCod ,
                                              AV31Barmdlcod ,
                                              A135BarColNom ,
                                              AV32Barcolnom ,
                                              AV33Barcolnomf ,
                                              Integer.valueOf(A136BarColNum) ,
                                              Integer.valueOf(AV34Barcolnum) ,
                                              Integer.valueOf(AV35barcolnumf) ,
                                              A396EmprCod ,
                                              Integer.valueOf(AV8BarCodi) ,
                                              Byte.valueOf(AV9CodReoi) ,
                                              AV10CodPari ,
                                              AV20CCFCHi ,
                                              Integer.valueOf(A129BarCod) ,
                                              Integer.valueOf(AV11BarCodf) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT
                                              }
         });
         lV31Barmdlcod = GXutil.padr( GXutil.rtrim( AV31Barmdlcod), 13, "%") ;
         /* Using cursor P06ZO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCodi), Byte.valueOf(AV9CodReoi), AV10CodPari, AV20CCFCHi, Byte.valueOf(AV12CodReof), AV13CodParf, Integer.valueOf(AV16CliCodi), Integer.valueOf(AV17CliCodf), Byte.valueOf(AV43Enc20c), AV14DisNumi, AV15DisNumf, Byte.valueOf(AV43Enc20c), AV45Enccli1, AV46Enccli2, AV22BarSeri, AV23BarSerf, AV21CCFCHf, lV31Barmdlcod, AV31Barmdlcod, AV32Barcolnom, AV33Barcolnomf, Integer.valueOf(AV34Barcolnum), Integer.valueOf(AV35barcolnumf), Integer.valueOf(AV11BarCodf)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A457FasCod = P06ZO3_A457FasCod[0] ;
            A4031CCTCod = P06ZO3_A4031CCTCod[0] ;
            A194BarOrdLin = P06ZO3_A194BarOrdLin[0] ;
            A758ProCod = P06ZO3_A758ProCod[0] ;
            A130BarCodPar = P06ZO3_A130BarCodPar[0] ;
            A132BarCodReo = P06ZO3_A132BarCodReo[0] ;
            A129BarCod = P06ZO3_A129BarCod[0] ;
            A136BarColNum = P06ZO3_A136BarColNum[0] ;
            A135BarColNom = P06ZO3_A135BarColNom[0] ;
            A4609BarMdlCod = P06ZO3_A4609BarMdlCod[0] ;
            A4033CCFch = P06ZO3_A4033CCFch[0] ;
            n4033CCFch = P06ZO3_n4033CCFch[0] ;
            A212BarSer = P06ZO3_A212BarSer[0] ;
            A4812BarEncCli = P06ZO3_A4812BarEncCli[0] ;
            A143BarDisNum = P06ZO3_A143BarDisNum[0] ;
            A252CliCod = P06ZO3_A252CliCod[0] ;
            n252CliCod = P06ZO3_n252CliCod[0] ;
            A217BarTipArt = P06ZO3_A217BarTipArt[0] ;
            n217BarTipArt = P06ZO3_n217BarTipArt[0] ;
            A224BarTraP1 = P06ZO3_A224BarTraP1[0] ;
            A221BarTra1 = P06ZO3_A221BarTra1[0] ;
            A225BarTraP2 = P06ZO3_A225BarTraP2[0] ;
            A222BarTra2 = P06ZO3_A222BarTra2[0] ;
            A226BarTraP3 = P06ZO3_A226BarTraP3[0] ;
            A223BarTra3 = P06ZO3_A223BarTra3[0] ;
            A4036CCTDsc = P06ZO3_A4036CCTDsc[0] ;
            A460FasDsc = P06ZO3_A460FasDsc[0] ;
            A1652BarSerDsc = P06ZO3_A1652BarSerDsc[0] ;
            A1234BarNomCli = P06ZO3_A1234BarNomCli[0] ;
            A136BarColNum = P06ZO3_A136BarColNum[0] ;
            A135BarColNom = P06ZO3_A135BarColNom[0] ;
            A4609BarMdlCod = P06ZO3_A4609BarMdlCod[0] ;
            A212BarSer = P06ZO3_A212BarSer[0] ;
            A4812BarEncCli = P06ZO3_A4812BarEncCli[0] ;
            A143BarDisNum = P06ZO3_A143BarDisNum[0] ;
            A252CliCod = P06ZO3_A252CliCod[0] ;
            n252CliCod = P06ZO3_n252CliCod[0] ;
            A217BarTipArt = P06ZO3_A217BarTipArt[0] ;
            n217BarTipArt = P06ZO3_n217BarTipArt[0] ;
            A224BarTraP1 = P06ZO3_A224BarTraP1[0] ;
            A221BarTra1 = P06ZO3_A221BarTra1[0] ;
            A225BarTraP2 = P06ZO3_A225BarTraP2[0] ;
            A222BarTra2 = P06ZO3_A222BarTra2[0] ;
            A226BarTraP3 = P06ZO3_A226BarTraP3[0] ;
            A223BarTra3 = P06ZO3_A223BarTra3[0] ;
            A1652BarSerDsc = P06ZO3_A1652BarSerDsc[0] ;
            A1234BarNomCli = P06ZO3_A1234BarNomCli[0] ;
            A457FasCod = P06ZO3_A457FasCod[0] ;
            A460FasDsc = P06ZO3_A460FasDsc[0] ;
            A4036CCTDsc = P06ZO3_A4036CCTDsc[0] ;
            AV47Barenccli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
            GXv_char6[0] = AV40TipArtdsc ;
            new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char6) ;
            rtn0003_impl.this.AV40TipArtdsc = GXv_char6[0] ;
            if ( A224BarTraP1 > 0 )
            {
               AV41VCompo = A221BarTra1 + " " + GXutil.trim( GXutil.str( A224BarTraP1, 3, 0)) + "%" + " " ;
               if ( A225BarTraP2 > 0 )
               {
                  AV41VCompo += A222BarTra2 + " " + GXutil.trim( GXutil.str( A225BarTraP2, 3, 0)) + "%" + " " ;
               }
               if ( A226BarTraP3 > 0 )
               {
                  AV41VCompo += A223BarTra3 + " " + GXutil.trim( GXutil.str( A226BarTraP3, 3, 0)) + "%" ;
               }
            }
            AV38AlbRGrm2 = (short)(0) ;
            AV39AlbRANc = (short)(0) ;
            /* Using cursor P06ZO4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A44AlbRecCod = P06ZO4_A44AlbRecCod[0] ;
               A4920AlbRGrm2 = P06ZO4_A4920AlbRGrm2[0] ;
               A4921AlbRAnc = P06ZO4_A4921AlbRAnc[0] ;
               A200BarPieCod = P06ZO4_A200BarPieCod[0] ;
               A4920AlbRGrm2 = P06ZO4_A4920AlbRGrm2[0] ;
               A4921AlbRAnc = P06ZO4_A4921AlbRAnc[0] ;
               AV38AlbRGrm2 = A4920AlbRGrm2 ;
               AV39AlbRANc = A4921AlbRAnc ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV27Cctdsc = GXutil.substring( A4036CCTDsc, 1, 15) ;
            AV28BarSer_6 = GXutil.substring( A212BarSer, 1, 6) ;
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV42TabFases[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            AV53Pfasespreviascoleccion_SDT.clear();
            if ( GXutil.like( A460FasDsc , GXutil.padr( httpContext.getMessage( "%TERMOF%", "") , 254 , "%"),  ' ' ) )
            {
               GXv_char6[0] = AV52fases_json ;
               new app.controlcalidadhtd.pfasespreviascoleccion(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, GXv_char6) ;
               rtn0003_impl.this.AV52fases_json = GXv_char6[0] ;
               AV53Pfasespreviascoleccion_SDT.fromJSonString(AV52fases_json, null);
            }
            h6ZO0( false, 50) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 367, Gx_line+0, 426, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 432, Gx_line+0, 440, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 448, Gx_line+0, 456, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28BarSer_6, "")), 61, Gx_line+0, 106, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 10, Gx_line+0, 55, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A4033CCFch, "99/99/99"), 693, Gx_line+0, 752, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Cctdsc, "")), 467, Gx_line+0, 687, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 270, Gx_line+0, 366, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 224, Gx_line+16, 269, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4609BarMdlCod, "")), 270, Gx_line+16, 366, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39AlbRANc), "ZZZ9")), 66, Gx_line+16, 96, Gx_line+33, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38AlbRGrm2), "ZZZ9")), 160, Gx_line+16, 190, Gx_line+33, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Larg Cru", ""), 10, Gx_line+16, 61, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Grm2 Cru", ""), 102, Gx_line+16, 157, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Art", ""), 10, Gx_line+32, 58, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41VCompo, "")), 263, Gx_line+31, 483, Gx_line+48, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 66, Gx_line+31, 257, Gx_line+48, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Barenccli, "")), 117, Gx_line+0, 264, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+50) ;
            if ( AV53Pfasespreviascoleccion_SDT.size() != 0 )
            {
               h6ZO0( false, 63) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fases previas", ""), 10, Gx_line+0, 92, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 102, Gx_line+0, 307, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TabFases[1-1], "")), 10, Gx_line+22, 376, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TabFases[2-1], "")), 10, Gx_line+38, 376, Gx_line+55, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(10, Gx_line+16, 307, Gx_line+16, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+63) ;
            }
            /* Noskip command */
            Gx_line = Gx_OldLine ;
            AV24Linea_i = (byte)(0) ;
            /* Using cursor P06ZO5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A4035CCVal = P06ZO5_A4035CCVal[0] ;
               A4043CCTLinDsc = P06ZO5_A4043CCTLinDsc[0] ;
               A4034CCTLin = P06ZO5_A4034CCTLin[0] ;
               A4043CCTLinDsc = P06ZO5_A4043CCTLinDsc[0] ;
               AV26CcVal = GXutil.rtrim( GXutil.substring( A4035CCVal, 1, 10)) ;
               AV29Cctlindsc = GXutil.substring( A4043CCTLinDsc, 1, 20) ;
               h6ZO0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26CcVal, "")), 984, Gx_line+0, 1094, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Cctlindsc, "")), 757, Gx_line+0, 977, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV24Linea_i = (byte)(1) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            if ( AV24Linea_i == 0 )
            {
               h6ZO0( false, 30) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+30) ;
            }
            else
            {
               h6ZO0( false, 17) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6ZO0( true, 0) ;
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

   public void h6ZO0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25EmprNom, "")), 14, Gx_line+14, 328, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(9, Gx_line+85, 1102, Gx_line+85, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 995, Gx_line+16, 1054, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 926, Gx_line+16, 985, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data-Hora", ""), 853, Gx_line+17, 914, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 934, Gx_line+61, 979, Gx_line+78, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 883, Gx_line+63, 925, Gx_line+77, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 10, Gx_line+96, 52, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 61, Gx_line+96, 96, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "O.S.", ""), 367, Gx_line+97, 394, Gx_line+111, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(10, Gx_line+111, 52, Gx_line+111, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(61, Gx_line+111, 96, Gx_line+111, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(117, Gx_line+111, 263, Gx_line+111, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(367, Gx_line+111, 462, Gx_line+111, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(467, Gx_line+111, 686, Gx_line+111, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 467, Gx_line+96, 509, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 693, Gx_line+96, 722, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(693, Gx_line+111, 751, Gx_line+111, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descriçao", ""), 757, Gx_line+96, 817, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(757, Gx_line+111, 976, Gx_line+111, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 1063, Gx_line+96, 1094, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(984, Gx_line+111, 1093, Gx_line+111, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Côr", ""), 270, Gx_line+96, 291, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(270, Gx_line+111, 365, Gx_line+111, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TitMdl, "")), 397, Gx_line+97, 448, Gx_line+111, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit10, "")), 117, Gx_line+95, 181, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Pgmdesc, "")), 17, Gx_line+63, 237, Gx_line+80, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+116) ;
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
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV10CodPari = "" ;
      AV13CodParf = "" ;
      AV14DisNumi = "" ;
      AV15DisNumf = "" ;
      AV51ControlesdeCalidad_json = "" ;
      AV20CCFCHi = GXutil.nullDate() ;
      AV21CCFCHf = GXutil.nullDate() ;
      AV22BarSeri = "" ;
      AV23BarSerf = "" ;
      AV31Barmdlcod = "" ;
      AV32Barcolnom = "" ;
      AV33Barcolnomf = "" ;
      AV45Enccli1 = "" ;
      AV46Enccli2 = "" ;
      GXv_int2 = new byte[1] ;
      AV44Lit10 = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char5 = "" ;
      AV36TitMdl = "" ;
      scmdbuf = "" ;
      P06ZO2_A396EmprCod = new String[] {""} ;
      P06ZO2_A407EmprNom = new String[] {""} ;
      P06ZO2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV25EmprNom = "" ;
      AV49ControlesdeCalidad_SDT = new GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item>(app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV54CCtcodCollection = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV50ControlesdeCalidad_SDTItem = new app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item(remoteHandle, context);
      AV56CCtcodCollection_json = "" ;
      lV31Barmdlcod = "" ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A212BarSer = "" ;
      A4033CCFch = GXutil.nullDate() ;
      A4609BarMdlCod = "" ;
      A135BarColNom = "" ;
      P06ZO3_A457FasCod = new String[] {""} ;
      P06ZO3_A396EmprCod = new String[] {""} ;
      P06ZO3_A4031CCTCod = new int[1] ;
      P06ZO3_A194BarOrdLin = new short[1] ;
      P06ZO3_A758ProCod = new String[] {""} ;
      P06ZO3_A130BarCodPar = new String[] {""} ;
      P06ZO3_A132BarCodReo = new byte[1] ;
      P06ZO3_A129BarCod = new int[1] ;
      P06ZO3_A136BarColNum = new int[1] ;
      P06ZO3_A135BarColNom = new String[] {""} ;
      P06ZO3_A4609BarMdlCod = new String[] {""} ;
      P06ZO3_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      P06ZO3_n4033CCFch = new boolean[] {false} ;
      P06ZO3_A212BarSer = new String[] {""} ;
      P06ZO3_A4812BarEncCli = new String[] {""} ;
      P06ZO3_A143BarDisNum = new String[] {""} ;
      P06ZO3_A252CliCod = new int[1] ;
      P06ZO3_n252CliCod = new boolean[] {false} ;
      P06ZO3_A217BarTipArt = new short[1] ;
      P06ZO3_n217BarTipArt = new boolean[] {false} ;
      P06ZO3_A224BarTraP1 = new short[1] ;
      P06ZO3_A221BarTra1 = new String[] {""} ;
      P06ZO3_A225BarTraP2 = new short[1] ;
      P06ZO3_A222BarTra2 = new String[] {""} ;
      P06ZO3_A226BarTraP3 = new short[1] ;
      P06ZO3_A223BarTra3 = new String[] {""} ;
      P06ZO3_A4036CCTDsc = new String[] {""} ;
      P06ZO3_A460FasDsc = new String[] {""} ;
      P06ZO3_A1652BarSerDsc = new String[] {""} ;
      P06ZO3_A1234BarNomCli = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      A4036CCTDsc = "" ;
      A460FasDsc = "" ;
      A1652BarSerDsc = "" ;
      A1234BarNomCli = "" ;
      AV47Barenccli = "" ;
      AV40TipArtdsc = "" ;
      AV41VCompo = "" ;
      P06ZO4_A44AlbRecCod = new int[1] ;
      P06ZO4_A396EmprCod = new String[] {""} ;
      P06ZO4_A129BarCod = new int[1] ;
      P06ZO4_A132BarCodReo = new byte[1] ;
      P06ZO4_A130BarCodPar = new String[] {""} ;
      P06ZO4_A4920AlbRGrm2 = new short[1] ;
      P06ZO4_A4921AlbRAnc = new short[1] ;
      P06ZO4_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      AV27Cctdsc = "" ;
      AV28BarSer_6 = "" ;
      AV42TabFases = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV42TabFases[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV53Pfasespreviascoleccion_SDT = new GXBaseCollection<app.controlcalidadhtd.SdtPfasespreviascoleccion_SDT_Item>(app.controlcalidadhtd.SdtPfasespreviascoleccion_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV52fases_json = "" ;
      GXv_char6 = new String[1] ;
      P06ZO5_A396EmprCod = new String[] {""} ;
      P06ZO5_A129BarCod = new int[1] ;
      P06ZO5_A132BarCodReo = new byte[1] ;
      P06ZO5_A130BarCodPar = new String[] {""} ;
      P06ZO5_A758ProCod = new String[] {""} ;
      P06ZO5_A194BarOrdLin = new short[1] ;
      P06ZO5_A4031CCTCod = new int[1] ;
      P06ZO5_A4035CCVal = new String[] {""} ;
      P06ZO5_A4043CCTLinDsc = new String[] {""} ;
      P06ZO5_A4034CCTLin = new short[1] ;
      A4035CCVal = "" ;
      A4043CCTLinDsc = "" ;
      AV26CcVal = "" ;
      AV29Cctlindsc = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      AV63Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.rtn0003__default(),
         new Object[] {
             new Object[] {
            P06ZO2_A396EmprCod, P06ZO2_A407EmprNom, P06ZO2_n407EmprNom
            }
            , new Object[] {
            P06ZO3_A457FasCod, P06ZO3_A396EmprCod, P06ZO3_A4031CCTCod, P06ZO3_A194BarOrdLin, P06ZO3_A758ProCod, P06ZO3_A130BarCodPar, P06ZO3_A132BarCodReo, P06ZO3_A129BarCod, P06ZO3_A136BarColNum, P06ZO3_A135BarColNom,
            P06ZO3_A4609BarMdlCod, P06ZO3_A4033CCFch, P06ZO3_n4033CCFch, P06ZO3_A212BarSer, P06ZO3_A4812BarEncCli, P06ZO3_A143BarDisNum, P06ZO3_A252CliCod, P06ZO3_n252CliCod, P06ZO3_A217BarTipArt, P06ZO3_n217BarTipArt,
            P06ZO3_A224BarTraP1, P06ZO3_A221BarTra1, P06ZO3_A225BarTraP2, P06ZO3_A222BarTra2, P06ZO3_A226BarTraP3, P06ZO3_A223BarTra3, P06ZO3_A4036CCTDsc, P06ZO3_A460FasDsc, P06ZO3_A1652BarSerDsc, P06ZO3_A1234BarNomCli
            }
            , new Object[] {
            P06ZO4_A44AlbRecCod, P06ZO4_A396EmprCod, P06ZO4_A129BarCod, P06ZO4_A132BarCodReo, P06ZO4_A130BarCodPar, P06ZO4_A4920AlbRGrm2, P06ZO4_A4921AlbRAnc, P06ZO4_A200BarPieCod
            }
            , new Object[] {
            P06ZO5_A396EmprCod, P06ZO5_A129BarCod, P06ZO5_A132BarCodReo, P06ZO5_A130BarCodPar, P06ZO5_A758ProCod, P06ZO5_A194BarOrdLin, P06ZO5_A4031CCTCod, P06ZO5_A4035CCVal, P06ZO5_A4043CCTLinDsc, P06ZO5_A4034CCTLin
            }
         }
      );
      AV63Pgmdesc = httpContext.getMessage( "Informe Controles de Calidad", "") ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV63Pgmdesc = httpContext.getMessage( "Informe Controles de Calidad", "") ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV9CodReoi ;
   private byte AV12CodReof ;
   private byte AV37erfoc ;
   private byte AV43Enc20c ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte AV24Linea_i ;
   private short gxcookieaux ;
   private short A194BarOrdLin ;
   private short A217BarTipArt ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short AV38AlbRGrm2 ;
   private short AV39AlbRANc ;
   private short A4920AlbRGrm2 ;
   private short A4921AlbRAnc ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int AV8BarCodi ;
   private int AV11BarCodf ;
   private int AV16CliCodi ;
   private int AV17CliCodf ;
   private int AV34Barcolnum ;
   private int AV35barcolnumf ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV64GXV1 ;
   private int A4031CCTCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A44AlbRecCod ;
   private int GX_I ;
   private int Gx_OldLine ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV10CodPari ;
   private String AV13CodParf ;
   private String AV14DisNumi ;
   private String AV15DisNumf ;
   private String AV22BarSeri ;
   private String AV23BarSerf ;
   private String AV31Barmdlcod ;
   private String AV32Barcolnom ;
   private String AV33Barcolnomf ;
   private String AV45Enccli1 ;
   private String AV46Enccli2 ;
   private String AV44Lit10 ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXt_char5 ;
   private String AV36TitMdl ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV25EmprNom ;
   private String lV31Barmdlcod ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A212BarSer ;
   private String A4609BarMdlCod ;
   private String A135BarColNom ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String A4036CCTDsc ;
   private String A460FasDsc ;
   private String A1652BarSerDsc ;
   private String A1234BarNomCli ;
   private String AV47Barenccli ;
   private String AV40TipArtdsc ;
   private String AV41VCompo ;
   private String A200BarPieCod ;
   private String AV27Cctdsc ;
   private String AV28BarSer_6 ;
   private String AV42TabFases[] ;
   private String GXv_char6[] ;
   private String A4035CCVal ;
   private String A4043CCTLinDsc ;
   private String AV26CcVal ;
   private String AV29Cctlindsc ;
   private String Gx_time ;
   private String AV63Pgmdesc ;
   private java.util.Date AV20CCFCHi ;
   private java.util.Date AV21CCFCHf ;
   private java.util.Date A4033CCFch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n4033CCFch ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private String AV51ControlesdeCalidad_json ;
   private String AV56CCtcodCollection_json ;
   private String AV52fases_json ;
   private GXSimpleCollection<Integer> AV54CCtcodCollection ;
   private IDataStoreProvider pr_default ;
   private String[] P06ZO2_A396EmprCod ;
   private String[] P06ZO2_A407EmprNom ;
   private boolean[] P06ZO2_n407EmprNom ;
   private String[] P06ZO3_A457FasCod ;
   private String[] P06ZO3_A396EmprCod ;
   private int[] P06ZO3_A4031CCTCod ;
   private short[] P06ZO3_A194BarOrdLin ;
   private String[] P06ZO3_A758ProCod ;
   private String[] P06ZO3_A130BarCodPar ;
   private byte[] P06ZO3_A132BarCodReo ;
   private int[] P06ZO3_A129BarCod ;
   private int[] P06ZO3_A136BarColNum ;
   private String[] P06ZO3_A135BarColNom ;
   private String[] P06ZO3_A4609BarMdlCod ;
   private java.util.Date[] P06ZO3_A4033CCFch ;
   private boolean[] P06ZO3_n4033CCFch ;
   private String[] P06ZO3_A212BarSer ;
   private String[] P06ZO3_A4812BarEncCli ;
   private String[] P06ZO3_A143BarDisNum ;
   private int[] P06ZO3_A252CliCod ;
   private boolean[] P06ZO3_n252CliCod ;
   private short[] P06ZO3_A217BarTipArt ;
   private boolean[] P06ZO3_n217BarTipArt ;
   private short[] P06ZO3_A224BarTraP1 ;
   private String[] P06ZO3_A221BarTra1 ;
   private short[] P06ZO3_A225BarTraP2 ;
   private String[] P06ZO3_A222BarTra2 ;
   private short[] P06ZO3_A226BarTraP3 ;
   private String[] P06ZO3_A223BarTra3 ;
   private String[] P06ZO3_A4036CCTDsc ;
   private String[] P06ZO3_A460FasDsc ;
   private String[] P06ZO3_A1652BarSerDsc ;
   private String[] P06ZO3_A1234BarNomCli ;
   private int[] P06ZO4_A44AlbRecCod ;
   private String[] P06ZO4_A396EmprCod ;
   private int[] P06ZO4_A129BarCod ;
   private byte[] P06ZO4_A132BarCodReo ;
   private String[] P06ZO4_A130BarCodPar ;
   private short[] P06ZO4_A4920AlbRGrm2 ;
   private short[] P06ZO4_A4921AlbRAnc ;
   private String[] P06ZO4_A200BarPieCod ;
   private String[] P06ZO5_A396EmprCod ;
   private int[] P06ZO5_A129BarCod ;
   private byte[] P06ZO5_A132BarCodReo ;
   private String[] P06ZO5_A130BarCodPar ;
   private String[] P06ZO5_A758ProCod ;
   private short[] P06ZO5_A194BarOrdLin ;
   private int[] P06ZO5_A4031CCTCod ;
   private String[] P06ZO5_A4035CCVal ;
   private String[] P06ZO5_A4043CCTLinDsc ;
   private short[] P06ZO5_A4034CCTLin ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item> AV49ControlesdeCalidad_SDT ;
   private GXBaseCollection<app.controlcalidadhtd.SdtPfasespreviascoleccion_SDT_Item> AV53Pfasespreviascoleccion_SDT ;
   private app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item AV50ControlesdeCalidad_SDTItem ;
}

final  class rtn0003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P06ZO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int A4031CCTCod ,
                                          GXSimpleCollection<Integer> AV54CCtcodCollection ,
                                          byte A132BarCodReo ,
                                          byte AV12CodReof ,
                                          String A130BarCodPar ,
                                          String AV13CodParf ,
                                          int A252CliCod ,
                                          int AV16CliCodi ,
                                          int AV17CliCodf ,
                                          byte AV43Enc20c ,
                                          String A143BarDisNum ,
                                          String AV14DisNumi ,
                                          String AV15DisNumf ,
                                          String A4812BarEncCli ,
                                          String AV45Enccli1 ,
                                          String AV46Enccli2 ,
                                          String A212BarSer ,
                                          String AV22BarSeri ,
                                          String AV23BarSerf ,
                                          java.util.Date A4033CCFch ,
                                          java.util.Date AV21CCFCHf ,
                                          String A4609BarMdlCod ,
                                          String AV31Barmdlcod ,
                                          String A135BarColNom ,
                                          String AV32Barcolnom ,
                                          String AV33Barcolnomf ,
                                          int A136BarColNum ,
                                          int AV34Barcolnum ,
                                          int AV35barcolnumf ,
                                          String A396EmprCod ,
                                          int AV8BarCodi ,
                                          byte AV9CodReoi ,
                                          String AV10CodPari ,
                                          java.util.Date AV20CCFCHi ,
                                          int A129BarCod ,
                                          int AV11BarCodf )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[25];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T3.FasCod, T1.EmprCod, T1.CCTCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarColNum, T2.BarColNom, T2.BarMdlCod, T1.CCFch, T2.BarSer," ;
      scmdbuf += " T2.BarEncCli, T2.BarDisNum, T2.CliCod, T2.BarTipArt, T2.BarTraP1, T2.BarTra1, T2.BarTraP2, T2.BarTra2, T2.BarTraP3, T2.BarTra3, T5.CCTDsc, T4.FasDsc, T2.BarSerDsc," ;
      scmdbuf += " T2.BarNomCli FROM ((((TXPCC T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " INNER JOIN TXPBARFAS T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.ProCod = T1.ProCod" ;
      scmdbuf += " AND T3.BarOrdLin = T1.BarOrdLin) LEFT JOIN TXPFASPRO T4 ON T4.EmprCod = T1.EmprCod AND T4.FasCod = T3.FasCod) INNER JOIN TXPCCDef T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.CCTCod = T1.CCTCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod >= ? and T1.BarCodReo >= ? and T1.BarCodPar >= ? and T1.CCFch >= ?)");
      addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      addWhere(sWhereString, "(T2.CliCod >= ? and T2.CliCod <= ?)");
      addWhere(sWhereString, "(( ? = 0 and T2.BarDisNum >= ? and T2.BarDisNum <= ?) or ( ? = 1 and T2.BarEncCli >= ? and T2.BarEncCli <= ?))");
      addWhere(sWhereString, "(T2.BarSer >= ? and T2.BarSer <= ?)");
      addWhere(sWhereString, "(T1.CCFch <= ?)");
      addWhere(sWhereString, "(T2.BarMdlCod like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T2.BarColNom >= ? and T2.BarColNom <= ?)");
      addWhere(sWhereString, "(T2.BarColNum >= ? and T2.BarColNum <= ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV54CCtcodCollection, "T1.CCTCod IN (", ")")+")");
      addWhere(sWhereString, "(T1.BarCod <= ?)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.CCFch" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 1 :
                  return conditional_P06ZO3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (GXSimpleCollection<Integer>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06ZO2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06ZO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06ZO4", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbRGrm2, T2.AlbRAnc, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06ZO5", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCVal, T2.CCTLinDsc, T1.CCTLin FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.CCTCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((String[]) buf[14])[0] = rslt.getString(14, 20);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 4);
               ((short[]) buf[22])[0] = rslt.getShort(20);
               ((String[]) buf[23])[0] = rslt.getString(21, 4);
               ((short[]) buf[24])[0] = rslt.getShort(22);
               ((String[]) buf[25])[0] = rslt.getString(23, 4);
               ((String[]) buf[26])[0] = rslt.getString(24, 30);
               ((String[]) buf[27])[0] = rslt.getString(25, 28);
               ((String[]) buf[28])[0] = rslt.getString(26, 26);
               ((String[]) buf[29])[0] = rslt.getString(27, 13);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
      }
   }

}

