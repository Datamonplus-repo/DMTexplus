package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class saft1041_wcexportreport_impl extends GXWebReport
{
   public saft1041_wcexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV41Title = httpContext.getMessage( "Lista de StandardAuditFile-Tax:PT_1.04_01", "") ;
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
         hA5D0( true, 0) ;
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
      hA5D0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hA5D0( false, 36) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Op", ""), 30, Gx_line+10, 80, Gx_line+26, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "OpT", ""), 84, Gx_line+10, 134, Gx_line+26, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "E", ""), 138, Gx_line+10, 188, Gx_line+26, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fatura", ""), 192, Gx_line+10, 242, Gx_line+26, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 246, Gx_line+10, 296, Gx_line+26, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Gross Total (Formula)", ""), 300, Gx_line+10, 350, Gx_line+26, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Gross Total (Bdatos)", ""), 354, Gx_line+10, 404, Gx_line+26, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hora Facturaçao", ""), 408, Gx_line+10, 458, Gx_line+26, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hhmm Calculada", ""), 462, Gx_line+10, 512, Gx_line+26, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Firma Digital Control", ""), 516, Gx_line+10, 567, Gx_line+26, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Dia Sistema", ""), 571, Gx_line+10, 622, Gx_line+26, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hora Sistema", ""), 626, Gx_line+10, 677, Gx_line+26, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hhmmss", ""), 681, Gx_line+10, 732, Gx_line+26, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hash", ""), 736, Gx_line+10, 787, Gx_line+26, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+36) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV11SAFT1041_SDT.size() )
      {
         AV10SAFT1041_SDTItem = (app.facturacion.SdtSAFT1041_SDT_Item)((app.facturacion.SdtSAFT1041_SDT_Item)AV11SAFT1041_SDT.elementAt(-1+AV58GXV1));
         AV13SAFT1041_SDTItem_Seleccionar1 = AV10SAFT1041_SDTItem.getgxTv_SdtSAFT1041_SDT_Item_Seleccionar1() ;
         AV14SAFT1041_SDTItem_Seleccionar2 = AV10SAFT1041_SDTItem.getgxTv_SdtSAFT1041_SDT_Item_Seleccionar2() ;
         AV15SAFT1041_SDTItem_Facest = AV10SAFT1041_SDTItem.getgxTv_SdtSAFT1041_SDT_Item_Facest() ;
         AV16SAFT1041_SDTItem_FacCod = AV10SAFT1041_SDTItem.getgxTv_SdtSAFT1041_SDT_Item_Faccod() ;
         AV17SAFT1041_SDTItem_FacFch = AV10SAFT1041_SDTItem.getgxTv_SdtSAFT1041_SDT_Item_Facfch() ;
         AV18SAFT1041_SDTItem_Factot = AV10SAFT1041_SDTItem.getgxTv_SdtSAFT1041_SDT_Item_Factot() ;
         AV19SAFT1041_SDTItem_Factot1 = AV10SAFT1041_SDTItem.getgxTv_SdtSAFT1041_SDT_Item_Factot1() ;
         AV20SAFT1041_SDTItem_FacHor = AV10SAFT1041_SDTItem.getgxTv_SdtSAFT1041_SDT_Item_Fachor() ;
         AV21SAFT1041_SDTItem_Hhdt = AV10SAFT1041_SDTItem.getgxTv_SdtSAFT1041_SDT_Item_Hhdt() ;
         AV22SAFT1041_SDTItem_facfirdg = AV10SAFT1041_SDTItem.getgxTv_SdtSAFT1041_SDT_Item_Facfirdg() ;
         AV23SAFT1041_SDTItem_DiaS = AV10SAFT1041_SDTItem.getgxTv_SdtSAFT1041_SDT_Item_Dias() ;
         AV24SAFT1041_SDTItem_TimeS = AV10SAFT1041_SDTItem.getgxTv_SdtSAFT1041_SDT_Item_Times() ;
         AV25SAFT1041_SDTItem_Hhmmss = AV10SAFT1041_SDTItem.getgxTv_SdtSAFT1041_SDT_Item_Hhmmss() ;
         AV26SAFT1041_SDTItem_FacFirma = AV10SAFT1041_SDTItem.getgxTv_SdtSAFT1041_SDT_Item_Facfirma() ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S141 ();
         if (returnInSub) return;
         hA5D0( false, 35) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.booltostr( AV13SAFT1041_SDTItem_Seleccionar1), 30, Gx_line+10, 80, Gx_line+24, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.booltostr( AV14SAFT1041_SDTItem_Seleccionar2), 84, Gx_line+10, 134, Gx_line+24, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15SAFT1041_SDTItem_Facest), "9")), 138, Gx_line+10, 188, Gx_line+24, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16SAFT1041_SDTItem_FacCod), "ZZZZZZZ9")), 192, Gx_line+10, 242, Gx_line+24, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( AV17SAFT1041_SDTItem_FacFch, "99/99/99"), 246, Gx_line+10, 296, Gx_line+24, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18SAFT1041_SDTItem_Factot, "ZZZZZZZZZ9.99")), 300, Gx_line+10, 350, Gx_line+24, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19SAFT1041_SDTItem_Factot1, "ZZZZZZZZZ9.99999")), 354, Gx_line+10, 404, Gx_line+24, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( AV20SAFT1041_SDTItem_FacHor, "99/99/99 99:99"), 408, Gx_line+10, 458, Gx_line+24, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( AV21SAFT1041_SDTItem_Hhdt, "99/99/99 99:99"), 462, Gx_line+10, 512, Gx_line+24, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22SAFT1041_SDTItem_facfirdg, "")), 516, Gx_line+10, 567, Gx_line+24, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23SAFT1041_SDTItem_DiaS, "")), 571, Gx_line+10, 622, Gx_line+24, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24SAFT1041_SDTItem_TimeS, "")), 626, Gx_line+10, 677, Gx_line+24, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25SAFT1041_SDTItem_Hhmmss, "")), 681, Gx_line+10, 732, Gx_line+24, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26SAFT1041_SDTItem_FacFirma, "")), 736, Gx_line+10, 787, Gx_line+24, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+34, 789, Gx_line+34, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+35) ;
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
      if ( GXutil.strcmp(AV27Session.getValue("Facturacion.SAFT1041_WCGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.SAFT1041_WCGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("Facturacion.SAFT1041_WCGridState"), null, null);
      }
      AV59GXV2 = 1 ;
      while ( AV59GXV2 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV59GXV2));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV43Emprcod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FACFCHFROM") == 0 )
         {
            AV44FacFchFrom = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FACFCHTO") == 0 )
         {
            AV45FacFchTo = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FACCODFROM") == 0 )
         {
            AV46Faccodfrom = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FACCODTO") == 0 )
         {
            AV47Faccodto = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FIRMAD") == 0 )
         {
            AV48FirmaD = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TAXREG") == 0 )
         {
            AV49TaxReg = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COMPANYID") == 0 )
         {
            AV50CompanyId = GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIR") == 0 )
         {
            AV51Dir = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ANYO") == 0 )
         {
            AV52Anyo = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
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

   public void hA5D0( boolean bFoot ,
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
               AV39PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV36DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+39, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39PageInfo, "")), 30, Gx_line+15, 409, Gx_line+29, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36DateInfo, "")), 409, Gx_line+15, 789, Gx_line+29, 2, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+39) ;
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
            AV41Title = AV55Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+107, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34AppName, "")), 30, Gx_line+30, 789, Gx_line+44, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Title, "")), 30, Gx_line+44, 789, Gx_line+77, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+127) ;
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
      AV41Title = "" ;
      AV11SAFT1041_SDT = new GXBaseCollection<app.facturacion.SdtSAFT1041_SDT_Item>(app.facturacion.SdtSAFT1041_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV10SAFT1041_SDTItem = new app.facturacion.SdtSAFT1041_SDT_Item(remoteHandle, context);
      AV17SAFT1041_SDTItem_FacFch = GXutil.nullDate() ;
      AV18SAFT1041_SDTItem_Factot = DecimalUtil.ZERO ;
      AV19SAFT1041_SDTItem_Factot1 = DecimalUtil.ZERO ;
      AV20SAFT1041_SDTItem_FacHor = GXutil.resetTime( GXutil.nullDate() );
      AV21SAFT1041_SDTItem_Hhdt = GXutil.resetTime( GXutil.nullDate() );
      AV22SAFT1041_SDTItem_facfirdg = "" ;
      AV23SAFT1041_SDTItem_DiaS = "" ;
      AV24SAFT1041_SDTItem_TimeS = "" ;
      AV25SAFT1041_SDTItem_Hhmmss = "" ;
      AV26SAFT1041_SDTItem_FacFirma = "" ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV43Emprcod = "" ;
      AV39PageInfo = "" ;
      AV36DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV55Pgmdesc = "" ;
      AV34AppName = "" ;
      Gx_date = GXutil.today( ) ;
      AV55Pgmdesc = httpContext.getMessage( "SAFT1041_WCExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV55Pgmdesc = httpContext.getMessage( "SAFT1041_WCExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV15SAFT1041_SDTItem_Facest ;
   private short gxcookieaux ;
   private short AV44FacFchFrom ;
   private short AV45FacFchTo ;
   private short AV46Faccodfrom ;
   private short AV47Faccodto ;
   private short AV48FirmaD ;
   private short AV49TaxReg ;
   private short AV51Dir ;
   private short AV52Anyo ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV58GXV1 ;
   private int AV16SAFT1041_SDTItem_FacCod ;
   private int AV59GXV2 ;
   private long AV50CompanyId ;
   private java.math.BigDecimal AV18SAFT1041_SDTItem_Factot ;
   private java.math.BigDecimal AV19SAFT1041_SDTItem_Factot1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV22SAFT1041_SDTItem_facfirdg ;
   private String AV23SAFT1041_SDTItem_DiaS ;
   private String AV24SAFT1041_SDTItem_TimeS ;
   private String AV25SAFT1041_SDTItem_Hhmmss ;
   private String AV26SAFT1041_SDTItem_FacFirma ;
   private String AV43Emprcod ;
   private String AV55Pgmdesc ;
   private java.util.Date AV20SAFT1041_SDTItem_FacHor ;
   private java.util.Date AV21SAFT1041_SDTItem_Hhdt ;
   private java.util.Date AV17SAFT1041_SDTItem_FacFch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV13SAFT1041_SDTItem_Seleccionar1 ;
   private boolean AV14SAFT1041_SDTItem_Seleccionar2 ;
   private String AV41Title ;
   private String AV39PageInfo ;
   private String AV36DateInfo ;
   private String AV34AppName ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private GXBaseCollection<app.facturacion.SdtSAFT1041_SDT_Item> AV11SAFT1041_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.facturacion.SdtSAFT1041_SDT_Item AV10SAFT1041_SDTItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

