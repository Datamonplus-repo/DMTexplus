package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informealbaranesproducciondetallado_wcexportreport_impl extends GXWebReport
{
   public informealbaranesproducciondetallado_wcexportreport_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
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
         GXv_SdtWWPContext1[0] = AV9WWPContext;
         new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
         AV9WWPContext = GXv_SdtWWPContext1[0] ;
         /* Execute user subroutine: 'LOADGRIDSTATE' */
         S151 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV94Title = httpContext.getMessage( "Lista de ALBBAR", "") ;
         /* Execute user subroutine: 'PRINTFILTERS' */
         S111 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PRINTCOLUMNTITLES' */
         S121 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PRINTDATA' */
         S131 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PRINTFOOTER' */
         S171 ();
         if ( returnInSub )
         {
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h9KD0( true, 0) ;
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
      /* 'PRINTFILTERS' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV111TFIntDsc_Sel)==0) )
      {
         h9KD0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Intensidad", ""), 25, Gx_line+0, 83, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111TFIntDsc_Sel, "")), 83, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV110TFIntDsc)==0) )
         {
            h9KD0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Intensidad", ""), 25, Gx_line+0, 83, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110TFIntDsc, "")), 83, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9KD0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9KD0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+10, 66, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 70, Gx_line+10, 106, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Albaran", ""), 110, Gx_line+10, 146, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Alb", ""), 150, Gx_line+10, 186, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Pedido Cli", ""), 190, Gx_line+10, 226, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Disposicion Cliente", ""), 230, Gx_line+10, 266, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 270, Gx_line+10, 306, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 310, Gx_line+10, 346, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 350, Gx_line+10, 386, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Composicion", ""), 390, Gx_line+10, 426, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color Cli", ""), 430, Gx_line+10, 466, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 470, Gx_line+10, 506, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 510, Gx_line+10, 546, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 550, Gx_line+10, 586, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Intensidad", ""), 590, Gx_line+10, 626, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kilos Cru.", ""), 630, Gx_line+10, 666, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 670, Gx_line+10, 706, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 710, Gx_line+10, 746, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 750, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV12Clicod) ,
                                           Integer.valueOf(AV13Clicod_to) ,
                                           AV14ALbProfch ,
                                           AV15ALbProfch_to ,
                                           AV16Barser ,
                                           AV17Barser_to ,
                                           AV108BarColNom ,
                                           AV109BarColNom_to ,
                                           Integer.valueOf(AV20BarColNum) ,
                                           Integer.valueOf(AV21BarColNum_to) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A34AlbProfch ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Short.valueOf(AV22OrderedBy) ,
                                           Boolean.valueOf(AV23OrderedDsc) ,
                                           A39AlbProPri ,
                                           AV11Prio ,
                                           AV18AlbEncCli ,
                                           A13878PedidoClie ,
                                           AV19AlbEncCli_to ,
                                           Byte.valueOf(A148BarEstReo) ,
                                           Byte.valueOf(AV118Barestreoi) ,
                                           Byte.valueOf(AV119barestreof) ,
                                           A2010BarTipDis ,
                                           AV120TipDisCod ,
                                           A5140AlbMarca ,
                                           AV10Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09KD2 */
      pr_default.execute(0, new Object[] {AV10Emprcod, AV11Prio, AV11Prio, Byte.valueOf(AV118Barestreoi), Byte.valueOf(AV119barestreof), AV120TipDisCod, AV120TipDisCod, Integer.valueOf(AV12Clicod), Integer.valueOf(AV13Clicod_to), AV14ALbProfch, AV15ALbProfch_to, AV16Barser, AV17Barser_to, AV108BarColNom, AV109BarColNom_to, Integer.valueOf(AV20BarColNum), Integer.valueOf(AV21BarColNum_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A217BarTipArt = P09KD2_A217BarTipArt[0] ;
         n217BarTipArt = P09KD2_n217BarTipArt[0] ;
         A1253EmprGuiRem = P09KD2_A1253EmprGuiRem[0] ;
         A5140AlbMarca = P09KD2_A5140AlbMarca[0] ;
         A2010BarTipDis = P09KD2_A2010BarTipDis[0] ;
         A148BarEstReo = P09KD2_A148BarEstReo[0] ;
         A136BarColNum = P09KD2_A136BarColNum[0] ;
         A135BarColNom = P09KD2_A135BarColNom[0] ;
         A212BarSer = P09KD2_A212BarSer[0] ;
         A34AlbProfch = P09KD2_A34AlbProfch[0] ;
         A1243GuiRemCli = P09KD2_A1243GuiRemCli[0] ;
         A39AlbProPri = P09KD2_A39AlbProPri[0] ;
         A252CliCod = P09KD2_A252CliCod[0] ;
         n252CliCod = P09KD2_n252CliCod[0] ;
         A218BarTipCol = P09KD2_A218BarTipCol[0] ;
         A1261BarAlbKgmE = P09KD2_A1261BarAlbKgmE[0] ;
         A2243BarKgsCli = P09KD2_A2243BarKgsCli[0] ;
         n2243BarKgsCli = P09KD2_n2243BarKgsCli[0] ;
         A1263BarAlbMtrE = P09KD2_A1263BarAlbMtrE[0] ;
         A1461BarAlbPN = P09KD2_A1461BarAlbPN[0] ;
         A1265BarAlbPie = P09KD2_A1265BarAlbPie[0] ;
         A1234BarNomCli = P09KD2_A1234BarNomCli[0] ;
         A13711BarTipArtD = P09KD2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09KD2_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P09KD2_A1652BarSerDsc[0] ;
         A155BarFecCli = P09KD2_A155BarFecCli[0] ;
         A30AlbProCod = P09KD2_A30AlbProCod[0] ;
         A1244GuiRemCln = P09KD2_A1244GuiRemCln[0] ;
         A130BarCodPar = P09KD2_A130BarCodPar[0] ;
         A132BarCodReo = P09KD2_A132BarCodReo[0] ;
         A129BarCod = P09KD2_A129BarCod[0] ;
         A143BarDisNum = P09KD2_A143BarDisNum[0] ;
         A4812BarEncCli = P09KD2_A4812BarEncCli[0] ;
         A396EmprCod = P09KD2_A396EmprCod[0] ;
         A217BarTipArt = P09KD2_A217BarTipArt[0] ;
         n217BarTipArt = P09KD2_n217BarTipArt[0] ;
         A2010BarTipDis = P09KD2_A2010BarTipDis[0] ;
         A148BarEstReo = P09KD2_A148BarEstReo[0] ;
         A136BarColNum = P09KD2_A136BarColNum[0] ;
         A135BarColNom = P09KD2_A135BarColNom[0] ;
         A212BarSer = P09KD2_A212BarSer[0] ;
         A252CliCod = P09KD2_A252CliCod[0] ;
         n252CliCod = P09KD2_n252CliCod[0] ;
         A218BarTipCol = P09KD2_A218BarTipCol[0] ;
         A1234BarNomCli = P09KD2_A1234BarNomCli[0] ;
         A1652BarSerDsc = P09KD2_A1652BarSerDsc[0] ;
         A155BarFecCli = P09KD2_A155BarFecCli[0] ;
         A143BarDisNum = P09KD2_A143BarDisNum[0] ;
         A4812BarEncCli = P09KD2_A4812BarEncCli[0] ;
         A1253EmprGuiRem = P09KD2_A1253EmprGuiRem[0] ;
         A5140AlbMarca = P09KD2_A5140AlbMarca[0] ;
         A34AlbProfch = P09KD2_A34AlbProfch[0] ;
         A1243GuiRemCli = P09KD2_A1243GuiRemCli[0] ;
         A39AlbProPri = P09KD2_A39AlbProPri[0] ;
         A1244GuiRemCln = P09KD2_A1244GuiRemCln[0] ;
         A13711BarTipArtD = P09KD2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09KD2_n13711BarTipArtD[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         informealbaranesproducciondetallado_wcexportreport_impl.this.A396EmprCod = GXv_char3[0] ;
         informealbaranesproducciondetallado_wcexportreport_impl.this.A4812BarEncCli = GXv_char4[0] ;
         informealbaranesproducciondetallado_wcexportreport_impl.this.A143BarDisNum = GXv_char5[0] ;
         informealbaranesproducciondetallado_wcexportreport_impl.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV18AlbEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV18AlbEncCli) >= 0 ) ) )
         {
            if ( (GXutil.strcmp("", AV19AlbEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV19AlbEncCli_to) <= 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV25BarEncCli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
               GXv_char6[0] = " " ;
               GXv_char5[0] = " " ;
               GXv_int7[0] = (short)(0) ;
               GXv_int8[0] = (byte)(0) ;
               GXv_char4[0] = AV114TipColDsc ;
               GXv_char3[0] = " " ;
               GXv_int9[0] = 0 ;
               GXv_char10[0] = " " ;
               GXv_char11[0] = " " ;
               GXv_int12[0] = (short)(0) ;
               GXv_char13[0] = " " ;
               GXv_char14[0] = " " ;
               new app.pmasinf(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A218BarTipCol, GXv_char6, GXv_char5, GXv_int7, GXv_int8, GXv_char4, GXv_char3, GXv_int9, GXv_char10, GXv_char11, GXv_int12, GXv_char13, GXv_char14) ;
               informealbaranesproducciondetallado_wcexportreport_impl.this.AV114TipColDsc = GXv_char4[0] ;
               GXv_char14[0] = AV26IntDsc ;
               GXv_char13[0] = " " ;
               GXv_int12[0] = (short)(0) ;
               GXv_int8[0] = (byte)(0) ;
               GXv_char11[0] = "" ;
               GXv_char10[0] = " " ;
               GXv_int9[0] = 0 ;
               GXv_char6[0] = " " ;
               GXv_char5[0] = " " ;
               GXv_int7[0] = (short)(0) ;
               GXv_char4[0] = " " ;
               GXv_char3[0] = " " ;
               new app.pmasinf(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A218BarTipCol, GXv_char14, GXv_char13, GXv_int12, GXv_int8, GXv_char11, GXv_char10, GXv_int9, GXv_char6, GXv_char5, GXv_int7, GXv_char4, GXv_char3) ;
               informealbaranesproducciondetallado_wcexportreport_impl.this.AV26IntDsc = GXv_char14[0] ;
               GXt_decimal15 = AV129BarKgm ;
               GXv_decimal16[0] = GXt_decimal15 ;
               new app.get_barkgm(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal16) ;
               informealbaranesproducciondetallado_wcexportreport_impl.this.GXt_decimal15 = GXv_decimal16[0] ;
               AV129BarKgm = GXt_decimal15 ;
               AV121BarAlbKgmE = A1261BarAlbKgmE ;
               if ( AV136Moda21.doubleValue() == 1 )
               {
                  if ( A2243BarKgsCli.doubleValue() != 0 )
                  {
                     AV121BarAlbKgmE = A2243BarKgsCli ;
                  }
               }
               AV122BarAlbMtrE = A1263BarAlbMtrE ;
               if ( AV136Moda21.doubleValue() == 1 )
               {
                  if ( A1461BarAlbPN.doubleValue() != 0 )
                  {
                     AV122BarAlbMtrE = A1461BarAlbPN ;
                  }
               }
               /* Execute user subroutine: 'BEFOREPRINTLINE' */
               S144 ();
               if ( returnInSub )
               {
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
                  if (true) return;
               }
               h9KD0( false, 36) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9")), 30, Gx_line+10, 66, Gx_line+25, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1244GuiRemCln, "")), 70, Gx_line+10, 106, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 110, Gx_line+10, 146, Gx_line+25, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 150, Gx_line+10, 186, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25BarEncCli, "")), 190, Gx_line+10, 226, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 230, Gx_line+10, 266, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), 270, Gx_line+10, 306, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 310, Gx_line+10, 346, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 350, Gx_line+10, 386, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13711BarTipArtD, "")), 390, Gx_line+10, 426, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 430, Gx_line+10, 466, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 470, Gx_line+10, 506, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 510, Gx_line+10, 546, Gx_line+25, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114TipColDsc, "")), 550, Gx_line+10, 586, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26IntDsc, "")), 590, Gx_line+10, 626, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV129BarKgm, "ZZZZZ9.99")), 630, Gx_line+10, 666, Gx_line+25, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV121BarAlbKgmE, "ZZZZZ9.99")), 670, Gx_line+10, 706, Gx_line+25, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV122BarAlbMtrE, "ZZZZZ9.99")), 710, Gx_line+10, 746, Gx_line+25, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9")), 750, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+36) ;
               /* Execute user subroutine: 'AFTERPRINTLINE' */
               S161 ();
               if ( returnInSub )
               {
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
                  if (true) return;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV28Session.getValue("InformeAlbaranesProduccionDetallado_WCGridState"), "") == 0 )
      {
         AV30GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "InformeAlbaranesProduccionDetallado_WCGridState"), null, null);
      }
      else
      {
         AV30GridState.fromxml(AV28Session.getValue("InformeAlbaranesProduccionDetallado_WCGridState"), null, null);
      }
      AV22OrderedBy = AV30GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV23OrderedDsc = AV30GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV137GXV1 = 1 ;
      while ( AV137GXV1 <= AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV137GXV1));
         if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV110TFIntDsc = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV111TFIntDsc_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10Emprcod = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRIO") == 0 )
         {
            AV11Prio = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV12Clicod = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV13Clicod_to = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROFCH") == 0 )
         {
            AV14ALbProfch = localUtil.ctod( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROFCH_TO") == 0 )
         {
            AV15ALbProfch_to = localUtil.ctod( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV16Barser = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER_TO") == 0 )
         {
            AV17Barser_to = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBENCCLI") == 0 )
         {
            AV18AlbEncCli = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBENCCLI_TO") == 0 )
         {
            AV19AlbEncCli_to = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV108BarColNom = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM_TO") == 0 )
         {
            AV109BarColNom_to = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV20BarColNum = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM_TO") == 0 )
         {
            AV21BarColNum_to = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARESTREO") == 0 )
         {
            AV117Barestreo = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARESTREOI") == 0 )
         {
            AV118Barestreoi = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARESTREOF") == 0 )
         {
            AV119barestreof = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPDISCOD") == 0 )
         {
            AV120TipDisCod = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV137GXV1 = (int)(AV137GXV1+1) ;
      }
   }

   public void S144( ) throws ProcessInterruptedException
   {
      /* 'BEFOREPRINTLINE' Routine */
      returnInSub = false ;
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'AFTERPRINTLINE' Routine */
      returnInSub = false ;
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'PRINTFOOTER' Routine */
      returnInSub = false ;
   }

   public void h9KD0( boolean bFoot ,
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
               AV92PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV89DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+40) ;
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
            AV94Title = AV132Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+128) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV94Title = "" ;
      AV111TFIntDsc_Sel = "" ;
      AV110TFIntDsc = "" ;
      scmdbuf = "" ;
      AV14ALbProfch = GXutil.nullDate() ;
      AV15ALbProfch_to = GXutil.nullDate() ;
      AV16Barser = "" ;
      AV17Barser_to = "" ;
      AV108BarColNom = "" ;
      AV109BarColNom_to = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A39AlbProPri = "" ;
      AV11Prio = "" ;
      AV18AlbEncCli = "" ;
      A13878PedidoClie = "" ;
      AV19AlbEncCli_to = "" ;
      A2010BarTipDis = "" ;
      AV120TipDisCod = "" ;
      A5140AlbMarca = "" ;
      AV10Emprcod = "" ;
      A396EmprCod = "" ;
      P09KD2_A217BarTipArt = new short[1] ;
      P09KD2_n217BarTipArt = new boolean[] {false} ;
      P09KD2_A1253EmprGuiRem = new String[] {""} ;
      P09KD2_A5140AlbMarca = new String[] {""} ;
      P09KD2_A2010BarTipDis = new String[] {""} ;
      P09KD2_A148BarEstReo = new byte[1] ;
      P09KD2_A136BarColNum = new int[1] ;
      P09KD2_A135BarColNom = new String[] {""} ;
      P09KD2_A212BarSer = new String[] {""} ;
      P09KD2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P09KD2_A1243GuiRemCli = new int[1] ;
      P09KD2_A39AlbProPri = new String[] {""} ;
      P09KD2_A252CliCod = new int[1] ;
      P09KD2_n252CliCod = new boolean[] {false} ;
      P09KD2_A218BarTipCol = new byte[1] ;
      P09KD2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KD2_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KD2_n2243BarKgsCli = new boolean[] {false} ;
      P09KD2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KD2_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KD2_A1265BarAlbPie = new int[1] ;
      P09KD2_A1234BarNomCli = new String[] {""} ;
      P09KD2_A13711BarTipArtD = new String[] {""} ;
      P09KD2_n13711BarTipArtD = new boolean[] {false} ;
      P09KD2_A1652BarSerDsc = new String[] {""} ;
      P09KD2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09KD2_A30AlbProCod = new long[1] ;
      P09KD2_A1244GuiRemCln = new String[] {""} ;
      P09KD2_A130BarCodPar = new String[] {""} ;
      P09KD2_A132BarCodReo = new byte[1] ;
      P09KD2_A129BarCod = new int[1] ;
      P09KD2_A143BarDisNum = new String[] {""} ;
      P09KD2_A4812BarEncCli = new String[] {""} ;
      P09KD2_A396EmprCod = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A13711BarTipArtD = "" ;
      A1652BarSerDsc = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A1244GuiRemCln = "" ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      GXt_char2 = "" ;
      A13696BarNHdr = "" ;
      AV25BarEncCli = "" ;
      AV114TipColDsc = "" ;
      AV26IntDsc = "" ;
      GXv_char14 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int12 = new short[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char11 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV129BarKgm = DecimalUtil.ZERO ;
      GXt_decimal15 = DecimalUtil.ZERO ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      AV121BarAlbKgmE = DecimalUtil.ZERO ;
      AV136Moda21 = DecimalUtil.ZERO ;
      AV122BarAlbMtrE = DecimalUtil.ZERO ;
      AV28Session = httpContext.getWebSession();
      AV30GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV31GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV92PageInfo = "" ;
      AV89DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV132Pgmdesc = "" ;
      AV87AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informealbaranesproducciondetallado_wcexportreport__default(),
         new Object[] {
             new Object[] {
            P09KD2_A217BarTipArt, P09KD2_n217BarTipArt, P09KD2_A1253EmprGuiRem, P09KD2_A5140AlbMarca, P09KD2_A2010BarTipDis, P09KD2_A148BarEstReo, P09KD2_A136BarColNum, P09KD2_A135BarColNom, P09KD2_A212BarSer, P09KD2_A34AlbProfch,
            P09KD2_A1243GuiRemCli, P09KD2_A39AlbProPri, P09KD2_A252CliCod, P09KD2_n252CliCod, P09KD2_A218BarTipCol, P09KD2_A1261BarAlbKgmE, P09KD2_A2243BarKgsCli, P09KD2_n2243BarKgsCli, P09KD2_A1263BarAlbMtrE, P09KD2_A1461BarAlbPN,
            P09KD2_A1265BarAlbPie, P09KD2_A1234BarNomCli, P09KD2_A13711BarTipArtD, P09KD2_n13711BarTipArtD, P09KD2_A1652BarSerDsc, P09KD2_A155BarFecCli, P09KD2_A30AlbProCod, P09KD2_A1244GuiRemCln, P09KD2_A130BarCodPar, P09KD2_A132BarCodReo,
            P09KD2_A129BarCod, P09KD2_A143BarDisNum, P09KD2_A4812BarEncCli, P09KD2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV132Pgmdesc = httpContext.getMessage( "Informe Albaranes Produccion Detallado_WCExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV132Pgmdesc = httpContext.getMessage( "Informe Albaranes Produccion Detallado_WCExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A148BarEstReo ;
   private byte AV118Barestreoi ;
   private byte AV119barestreof ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte GXv_int8[] ;
   private byte AV117Barestreo ;
   private short gxcookieaux ;
   private short AV22OrderedBy ;
   private short A217BarTipArt ;
   private short GXv_int12[] ;
   private short GXv_int7[] ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV12Clicod ;
   private int AV13Clicod_to ;
   private int AV20BarColNum ;
   private int AV21BarColNum_to ;
   private int A1243GuiRemCli ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A1265BarAlbPie ;
   private int A129BarCod ;
   private int GXv_int9[] ;
   private int AV137GXV1 ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal AV129BarKgm ;
   private java.math.BigDecimal GXt_decimal15 ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal AV121BarAlbKgmE ;
   private java.math.BigDecimal AV136Moda21 ;
   private java.math.BigDecimal AV122BarAlbMtrE ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV111TFIntDsc_Sel ;
   private String AV110TFIntDsc ;
   private String scmdbuf ;
   private String AV16Barser ;
   private String AV17Barser_to ;
   private String AV108BarColNom ;
   private String AV109BarColNom_to ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A39AlbProPri ;
   private String AV11Prio ;
   private String AV18AlbEncCli ;
   private String A13878PedidoClie ;
   private String AV19AlbEncCli_to ;
   private String A2010BarTipDis ;
   private String AV120TipDisCod ;
   private String A5140AlbMarca ;
   private String AV10Emprcod ;
   private String A396EmprCod ;
   private String A1253EmprGuiRem ;
   private String A1234BarNomCli ;
   private String A13711BarTipArtD ;
   private String A1652BarSerDsc ;
   private String A1244GuiRemCln ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String GXt_char2 ;
   private String A13696BarNHdr ;
   private String AV25BarEncCli ;
   private String AV114TipColDsc ;
   private String AV26IntDsc ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV132Pgmdesc ;
   private java.util.Date AV14ALbProfch ;
   private java.util.Date AV15ALbProfch_to ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV23OrderedDsc ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n2243BarKgsCli ;
   private boolean n13711BarTipArtD ;
   private String AV94Title ;
   private String AV92PageInfo ;
   private String AV89DateInfo ;
   private String AV87AppName ;
   private com.genexus.webpanels.WebSession AV28Session ;
   private IDataStoreProvider pr_default ;
   private short[] P09KD2_A217BarTipArt ;
   private boolean[] P09KD2_n217BarTipArt ;
   private String[] P09KD2_A1253EmprGuiRem ;
   private String[] P09KD2_A5140AlbMarca ;
   private String[] P09KD2_A2010BarTipDis ;
   private byte[] P09KD2_A148BarEstReo ;
   private int[] P09KD2_A136BarColNum ;
   private String[] P09KD2_A135BarColNom ;
   private String[] P09KD2_A212BarSer ;
   private java.util.Date[] P09KD2_A34AlbProfch ;
   private int[] P09KD2_A1243GuiRemCli ;
   private String[] P09KD2_A39AlbProPri ;
   private int[] P09KD2_A252CliCod ;
   private boolean[] P09KD2_n252CliCod ;
   private byte[] P09KD2_A218BarTipCol ;
   private java.math.BigDecimal[] P09KD2_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P09KD2_A2243BarKgsCli ;
   private boolean[] P09KD2_n2243BarKgsCli ;
   private java.math.BigDecimal[] P09KD2_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P09KD2_A1461BarAlbPN ;
   private int[] P09KD2_A1265BarAlbPie ;
   private String[] P09KD2_A1234BarNomCli ;
   private String[] P09KD2_A13711BarTipArtD ;
   private boolean[] P09KD2_n13711BarTipArtD ;
   private String[] P09KD2_A1652BarSerDsc ;
   private java.util.Date[] P09KD2_A155BarFecCli ;
   private long[] P09KD2_A30AlbProCod ;
   private String[] P09KD2_A1244GuiRemCln ;
   private String[] P09KD2_A130BarCodPar ;
   private byte[] P09KD2_A132BarCodReo ;
   private int[] P09KD2_A129BarCod ;
   private String[] P09KD2_A143BarDisNum ;
   private String[] P09KD2_A4812BarEncCli ;
   private String[] P09KD2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV30GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV31GridStateFilterValue ;
}

final  class informealbaranesproducciondetallado_wcexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09KD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV12Clicod ,
                                          int AV13Clicod_to ,
                                          java.util.Date AV14ALbProfch ,
                                          java.util.Date AV15ALbProfch_to ,
                                          String AV16Barser ,
                                          String AV17Barser_to ,
                                          String AV108BarColNom ,
                                          String AV109BarColNom_to ,
                                          int AV20BarColNum ,
                                          int AV21BarColNum_to ,
                                          int A1243GuiRemCli ,
                                          java.util.Date A34AlbProfch ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          short AV22OrderedBy ,
                                          boolean AV23OrderedDsc ,
                                          String A39AlbProPri ,
                                          String AV11Prio ,
                                          String AV18AlbEncCli ,
                                          String A13878PedidoClie ,
                                          String AV19AlbEncCli_to ,
                                          byte A148BarEstReo ,
                                          byte AV118Barestreoi ,
                                          byte AV119barestreof ,
                                          String A2010BarTipDis ,
                                          String AV120TipDisCod ,
                                          String A5140AlbMarca ,
                                          String AV10Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[17];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T2.BarTipArt AS BarTipArt, T3.EmprGuiRem AS EmprGuiRem, T3.AlbMarca, T2.BarTipDis, T2.BarEstReo, T2.BarColNum, T2.BarColNom, T2.BarSer, T3.AlbProfch, T3.GuiRemCli" ;
      scmdbuf += " AS GuiRemCli, T3.AlbProPri, T2.CliCod, T2.BarTipCol, T1.BarAlbKgmE, T1.BarKgsCli, T1.BarAlbMtrE, T1.BarAlbPN, T1.BarAlbPie, T2.BarNomCli, T5.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T2.BarSerDsc, T2.BarFecCli, T1.AlbProCod, T4.CliNom AS GuiRemCln, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM ((((TXPALBBAR" ;
      scmdbuf += " T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTIPART" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T2.BarTipArt) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) INNER JOIN TXPCLIENT" ;
      scmdbuf += " T4 ON T4.EmprCod = T3.EmprGuiRem AND T4.CliCod = T3.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T3.AlbProPri = ? or ? = '2')");
      addWhere(sWhereString, "(T2.BarEstReo >= ?)");
      addWhere(sWhereString, "(T2.BarEstReo <= ?)");
      addWhere(sWhereString, "(T2.BarTipDis = ? or ? = '*')");
      addWhere(sWhereString, "(T3.AlbMarca <> 'A')");
      if ( ! (0==AV12Clicod) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (0==AV13Clicod_to) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14ALbProfch)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch >= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15ALbProfch_to)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch <= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16Barser)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer >= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17Barser_to)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer <= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108BarColNom)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom >= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109BarColNom_to)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom <= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV20BarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (0==AV21BarColNum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV22OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T3.GuiRemCli" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.GuiRemCli" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.GuiRemCli DESC" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.AlbProfch" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.AlbProfch DESC" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarFecCli" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarFecCli DESC" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc DESC" ;
      }
      else if ( ( AV22OrderedBy == 10 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV22OrderedBy == 10 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV22OrderedBy == 11 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV22OrderedBy == 11 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV22OrderedBy == 12 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV22OrderedBy == 12 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV22OrderedBy == 13 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie" ;
      }
      else if ( ( AV22OrderedBy == 13 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie DESC" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P09KD2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09KD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 13);
               ((String[]) buf[22])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(21, 26);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(22);
               ((long[]) buf[26])[0] = rslt.getLong(23);
               ((String[]) buf[27])[0] = rslt.getString(24, 30);
               ((String[]) buf[28])[0] = rslt.getString(25, 1);
               ((byte[]) buf[29])[0] = rslt.getByte(26);
               ((int[]) buf[30])[0] = rslt.getInt(27);
               ((String[]) buf[31])[0] = rslt.getString(28, 8);
               ((String[]) buf[32])[0] = rslt.getString(29, 20);
               ((String[]) buf[33])[0] = rslt.getString(30, 3);
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
      }
   }

}

