package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class facturasemitidas_wcexportreport_impl extends GXWebReport
{
   public facturasemitidas_wcexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV51FacturasEmitidas_SDT_json = AV52Websession.getValue(httpContext.getMessage( "&FacturasEmitidas_SDT_json", "")) ;
         AV11FacturasEmitidas_SDT.fromJSonString(AV51FacturasEmitidas_SDT_json, null);
         AV52Websession.remove(httpContext.getMessage( "&FacturasEmitidas_SDT_json", ""));
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
         AV38Title = httpContext.getMessage( "Lista de Facturas Emitidas", "") ;
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
         hA5Y0( true, 0) ;
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
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hA5Y0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hA5Y0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Factura", ""), 30, Gx_line+10, 95, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 99, Gx_line+10, 164, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 168, Gx_line+10, 233, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 237, Gx_line+10, 302, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nif", ""), 306, Gx_line+10, 371, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Valor Factura", ""), 375, Gx_line+10, 440, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Base Imponible", ""), 444, Gx_line+10, 509, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "% IVA", ""), 513, Gx_line+10, 578, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Importe IVA", ""), 582, Gx_line+10, 647, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kilos Fra.", ""), 651, Gx_line+10, 717, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Metros Fra.", ""), 721, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV11FacturasEmitidas_SDT.size() )
      {
         AV10FacturasEmitidas_SDTItem = (app.facturacion.SdtFacturasEmitidas_SDT_Item)((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV11FacturasEmitidas_SDT.elementAt(-1+AV58GXV1));
         AV13FacturasEmitidas_SDTItem_Faccod = AV10FacturasEmitidas_SDTItem.getgxTv_SdtFacturasEmitidas_SDT_Item_Faccod() ;
         AV14FacturasEmitidas_SDTItem_Facfch = AV10FacturasEmitidas_SDTItem.getgxTv_SdtFacturasEmitidas_SDT_Item_Facfch() ;
         AV15FacturasEmitidas_SDTItem_Clicod = AV10FacturasEmitidas_SDTItem.getgxTv_SdtFacturasEmitidas_SDT_Item_Clicod() ;
         AV16FacturasEmitidas_SDTItem_CliNom = AV10FacturasEmitidas_SDTItem.getgxTv_SdtFacturasEmitidas_SDT_Item_Clinom() ;
         AV17FacturasEmitidas_SDTItem_CliNif = AV10FacturasEmitidas_SDTItem.getgxTv_SdtFacturasEmitidas_SDT_Item_Clinif() ;
         AV18FacturasEmitidas_SDTItem_Factot = AV10FacturasEmitidas_SDTItem.getgxTv_SdtFacturasEmitidas_SDT_Item_Factot() ;
         AV19FacturasEmitidas_SDTItem_FacBasImp = AV10FacturasEmitidas_SDTItem.getgxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp() ;
         AV20FacturasEmitidas_SDTItem_FacIvaPor = AV10FacturasEmitidas_SDTItem.getgxTv_SdtFacturasEmitidas_SDT_Item_Facivapor() ;
         AV21FacturasEmitidas_SDTItem_FacIVAImp = AV10FacturasEmitidas_SDTItem.getgxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp() ;
         AV22FacturasEmitidas_SDTItem_Fac_kgs = AV10FacturasEmitidas_SDTItem.getgxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs() ;
         AV23FacturasEmitidas_SDTItem_Fac_mts = AV10FacturasEmitidas_SDTItem.getgxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts() ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S141 ();
         if (returnInSub) return;
         hA5Y0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13FacturasEmitidas_SDTItem_Faccod), "ZZZZZZZ9")), 30, Gx_line+10, 95, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( AV14FacturasEmitidas_SDTItem_Facfch, "99/99/99"), 99, Gx_line+10, 164, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15FacturasEmitidas_SDTItem_Clicod), "ZZZZZ9")), 168, Gx_line+10, 233, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16FacturasEmitidas_SDTItem_CliNom, "")), 237, Gx_line+10, 302, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17FacturasEmitidas_SDTItem_CliNif, "@!")), 306, Gx_line+10, 371, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18FacturasEmitidas_SDTItem_Factot, "ZZZZZZZZZ9.99")), 375, Gx_line+10, 440, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19FacturasEmitidas_SDTItem_FacBasImp, "ZZZZZZZZZ9.99")), 444, Gx_line+10, 509, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20FacturasEmitidas_SDTItem_FacIvaPor), "Z9")), 513, Gx_line+10, 578, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21FacturasEmitidas_SDTItem_FacIVAImp, "ZZZZZZZ9.99")), 582, Gx_line+10, 647, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22FacturasEmitidas_SDTItem_Fac_kgs, "ZZZZZ9.99")), 651, Gx_line+10, 717, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23FacturasEmitidas_SDTItem_Fac_mts, "ZZZZZ9.99")), 721, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if (returnInSub) return;
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV24Session.getValue("Facturacion.FacturasEmitidas_WCGridState"), "") == 0 )
      {
         AV26GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.FacturasEmitidas_WCGridState"), null, null);
      }
      else
      {
         AV26GridState.fromxml(AV24Session.getValue("Facturacion.FacturasEmitidas_WCGridState"), null, null);
      }
      AV59GXV2 = 1 ;
      while ( AV59GXV2 <= AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV27GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV59GXV2));
         if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV40Emprcod = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FACCODFROM") == 0 )
         {
            AV41Faccodfrom = (short)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FACCODTO") == 0 )
         {
            AV42Faccodto = (short)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODFROM") == 0 )
         {
            AV43clicodfrom = (short)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODTO") == 0 )
         {
            AV44clicodto = (short)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FACFCHFROM") == 0 )
         {
            AV45facfchfrom = (short)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FACFCHTO") == 0 )
         {
            AV46facfchto = (short)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FACTIPFAC") == 0 )
         {
            AV47Factipfac = (byte)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FACSERNUM") == 0 )
         {
            AV48FacSerNum = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FACPRI") == 0 )
         {
            AV49FacPri = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV59GXV2 = (int)(AV59GXV2+1) ;
      }
   }

   public void S141( ) throws ProcessInterruptedException
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

   public void hA5Y0( boolean bFoot ,
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
               AV36PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV33DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV38Title = AV55Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV51FacturasEmitidas_SDT_json = "" ;
      AV52Websession = httpContext.getWebSession();
      AV11FacturasEmitidas_SDT = new GXBaseCollection<app.facturacion.SdtFacturasEmitidas_SDT_Item>(app.facturacion.SdtFacturasEmitidas_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV38Title = "" ;
      AV10FacturasEmitidas_SDTItem = new app.facturacion.SdtFacturasEmitidas_SDT_Item(remoteHandle, context);
      AV14FacturasEmitidas_SDTItem_Facfch = GXutil.nullDate() ;
      AV16FacturasEmitidas_SDTItem_CliNom = "" ;
      AV17FacturasEmitidas_SDTItem_CliNif = "" ;
      AV18FacturasEmitidas_SDTItem_Factot = DecimalUtil.ZERO ;
      AV19FacturasEmitidas_SDTItem_FacBasImp = DecimalUtil.ZERO ;
      AV21FacturasEmitidas_SDTItem_FacIVAImp = DecimalUtil.ZERO ;
      AV22FacturasEmitidas_SDTItem_Fac_kgs = DecimalUtil.ZERO ;
      AV23FacturasEmitidas_SDTItem_Fac_mts = DecimalUtil.ZERO ;
      AV24Session = httpContext.getWebSession();
      AV26GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV27GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV40Emprcod = "" ;
      AV48FacSerNum = "" ;
      AV49FacPri = "" ;
      AV36PageInfo = "" ;
      AV33DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV55Pgmdesc = "" ;
      AV31AppName = "" ;
      Gx_date = GXutil.today( ) ;
      AV55Pgmdesc = httpContext.getMessage( "Facturas Emitidas", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV55Pgmdesc = httpContext.getMessage( "Facturas Emitidas", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV20FacturasEmitidas_SDTItem_FacIvaPor ;
   private byte AV47Factipfac ;
   private short gxcookieaux ;
   private short AV41Faccodfrom ;
   private short AV42Faccodto ;
   private short AV43clicodfrom ;
   private short AV44clicodto ;
   private short AV45facfchfrom ;
   private short AV46facfchto ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV58GXV1 ;
   private int AV13FacturasEmitidas_SDTItem_Faccod ;
   private int AV15FacturasEmitidas_SDTItem_Clicod ;
   private int AV59GXV2 ;
   private java.math.BigDecimal AV18FacturasEmitidas_SDTItem_Factot ;
   private java.math.BigDecimal AV19FacturasEmitidas_SDTItem_FacBasImp ;
   private java.math.BigDecimal AV21FacturasEmitidas_SDTItem_FacIVAImp ;
   private java.math.BigDecimal AV22FacturasEmitidas_SDTItem_Fac_kgs ;
   private java.math.BigDecimal AV23FacturasEmitidas_SDTItem_Fac_mts ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV16FacturasEmitidas_SDTItem_CliNom ;
   private String AV17FacturasEmitidas_SDTItem_CliNif ;
   private String AV40Emprcod ;
   private String AV48FacSerNum ;
   private String AV49FacPri ;
   private String AV55Pgmdesc ;
   private java.util.Date AV14FacturasEmitidas_SDTItem_Facfch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV51FacturasEmitidas_SDT_json ;
   private String AV38Title ;
   private String AV36PageInfo ;
   private String AV33DateInfo ;
   private String AV31AppName ;
   private com.genexus.webpanels.WebSession AV52Websession ;
   private com.genexus.webpanels.WebSession AV24Session ;
   private GXBaseCollection<app.facturacion.SdtFacturasEmitidas_SDT_Item> AV11FacturasEmitidas_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.facturacion.SdtFacturasEmitidas_SDT_Item AV10FacturasEmitidas_SDTItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV26GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV27GridStateFilterValue ;
}

