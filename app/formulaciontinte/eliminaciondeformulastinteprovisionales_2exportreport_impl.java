package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class eliminaciondeformulastinteprovisionales_2exportreport_impl extends GXWebReport
{
   public eliminaciondeformulastinteprovisionales_2exportreport_impl( com.genexus.internet.HttpContext context )
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
         AV53EliminaciondeFormulasTinte_json = AV52WebSession.getValue("&EliminaciondeFormulasTinte_json") ;
         AV52WebSession.remove("&EliminaciondeFormulasTinte_json");
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
         AV50Title = httpContext.getMessage( "Lista de Eliminacion de Formulas Tinte", "") ;
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
         h9WS0( true, 0) ;
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
      h9WS0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9WS0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+10, 110, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 114, Gx_line+10, 194, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 198, Gx_line+10, 278, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 282, Gx_line+10, 362, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 366, Gx_line+10, 447, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 451, Gx_line+10, 532, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "TC", ""), 536, Gx_line+10, 617, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Form.", ""), 621, Gx_line+10, 702, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fec. Ult. Uti.", ""), 706, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV11EliminaciondeFormulasTinte_SDTs.fromJSonString(AV53EliminaciondeFormulasTinte_json, null);
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV11EliminaciondeFormulasTinte_SDTs.size() )
      {
         AV10EliminaciondeFormulasTinte_SDTsItem = (app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV11EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV59GXV1));
         AV24EliminaciondeFormulasTinte_SDTsItem_Clicod = AV10EliminaciondeFormulasTinte_SDTsItem.getgxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod() ;
         AV25EliminaciondeFormulasTinte_SDTsItem_CliNom = AV10EliminaciondeFormulasTinte_SDTsItem.getgxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom() ;
         AV26EliminaciondeFormulasTinte_SDTsItem_Forser = AV10EliminaciondeFormulasTinte_SDTsItem.getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forser() ;
         AV27EliminaciondeFormulasTinte_SDTsItem_Forserdsc = AV10EliminaciondeFormulasTinte_SDTsItem.getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc() ;
         AV28EliminaciondeFormulasTinte_SDTsItem_Forcolnom = AV10EliminaciondeFormulasTinte_SDTsItem.getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom() ;
         AV29EliminaciondeFormulasTinte_SDTsItem_Forcolnum = AV10EliminaciondeFormulasTinte_SDTsItem.getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum() ;
         AV30EliminaciondeFormulasTinte_SDTsItem_Tipcolcod = AV10EliminaciondeFormulasTinte_SDTsItem.getgxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod() ;
         AV31EliminaciondeFormulasTinte_SDTsItem_ForNumcol = AV10EliminaciondeFormulasTinte_SDTsItem.getgxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol() ;
         AV32EliminaciondeFormulasTinte_SDTsItem_ForUltUti = AV10EliminaciondeFormulasTinte_SDTsItem.getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti() ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S141 ();
         if (returnInSub) return;
         h9WS0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24EliminaciondeFormulasTinte_SDTsItem_Clicod), "ZZZZZ9")), 30, Gx_line+10, 110, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25EliminaciondeFormulasTinte_SDTsItem_CliNom, "")), 114, Gx_line+10, 194, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26EliminaciondeFormulasTinte_SDTsItem_Forser, "")), 198, Gx_line+10, 278, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27EliminaciondeFormulasTinte_SDTsItem_Forserdsc, "")), 282, Gx_line+10, 362, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28EliminaciondeFormulasTinte_SDTsItem_Forcolnom, "")), 366, Gx_line+10, 447, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29EliminaciondeFormulasTinte_SDTsItem_Forcolnum), "ZZZZZ9")), 451, Gx_line+10, 532, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30EliminaciondeFormulasTinte_SDTsItem_Tipcolcod), "Z9")), 536, Gx_line+10, 617, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31EliminaciondeFormulasTinte_SDTsItem_ForNumcol), "ZZZZZZZ9")), 621, Gx_line+10, 702, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( AV32EliminaciondeFormulasTinte_SDTsItem_ForUltUti, "99/99/99"), 706, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if (returnInSub) return;
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV36Session.getValue("FormulacionTinte.EliminaciondeFormulasTinteProvisionales_2GridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.EliminaciondeFormulasTinteProvisionales_2GridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV36Session.getValue("FormulacionTinte.EliminaciondeFormulasTinteProvisionales_2GridState"), null, null);
      }
      AV60GXV2 = 1 ;
      while ( AV60GXV2 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV2));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV12Emprcod = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV13Clicod = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV14Clicod_to = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV15Forser = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER_TO") == 0 )
         {
            AV16Forser_to = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV17Forcolnom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM_TO") == 0 )
         {
            AV18Forcolnom_to = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV19Forcolnum = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM_TO") == 0 )
         {
            AV20Forcolnum_to = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV21TipColCod = (byte)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD_TO") == 0 )
         {
            AV22TipColCod_to = (byte)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORULTUTI") == 0 )
         {
            AV23ForUltUti = localUtil.ctod( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV60GXV2 = (int)(AV60GXV2+1) ;
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

   public void h9WS0( boolean bFoot ,
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
               AV48PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV45DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV50Title = AV56Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV53EliminaciondeFormulasTinte_json = "" ;
      AV52WebSession = httpContext.getWebSession();
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV50Title = "" ;
      AV11EliminaciondeFormulasTinte_SDTs = new GXBaseCollection<app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT>(app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT.class, "EliminaciondeFormulasTinte_SDT", "TexplusNET", remoteHandle);
      AV10EliminaciondeFormulasTinte_SDTsItem = new app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT(remoteHandle, context);
      AV25EliminaciondeFormulasTinte_SDTsItem_CliNom = "" ;
      AV26EliminaciondeFormulasTinte_SDTsItem_Forser = "" ;
      AV27EliminaciondeFormulasTinte_SDTsItem_Forserdsc = "" ;
      AV28EliminaciondeFormulasTinte_SDTsItem_Forcolnom = "" ;
      AV32EliminaciondeFormulasTinte_SDTsItem_ForUltUti = GXutil.nullDate() ;
      AV36Session = httpContext.getWebSession();
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12Emprcod = "" ;
      AV15Forser = "" ;
      AV16Forser_to = "" ;
      AV17Forcolnom = "" ;
      AV18Forcolnom_to = "" ;
      AV23ForUltUti = GXutil.nullDate() ;
      AV48PageInfo = "" ;
      AV45DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV56Pgmdesc = "" ;
      AV43AppName = "" ;
      Gx_date = GXutil.today( ) ;
      AV56Pgmdesc = httpContext.getMessage( "Eliminacion de Formulas Provisionales", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV56Pgmdesc = httpContext.getMessage( "Eliminacion de Formulas Provisionales", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV30EliminaciondeFormulasTinte_SDTsItem_Tipcolcod ;
   private byte AV21TipColCod ;
   private byte AV22TipColCod_to ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV59GXV1 ;
   private int AV24EliminaciondeFormulasTinte_SDTsItem_Clicod ;
   private int AV29EliminaciondeFormulasTinte_SDTsItem_Forcolnum ;
   private int AV31EliminaciondeFormulasTinte_SDTsItem_ForNumcol ;
   private int AV60GXV2 ;
   private int AV13Clicod ;
   private int AV14Clicod_to ;
   private int AV19Forcolnum ;
   private int AV20Forcolnum_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV25EliminaciondeFormulasTinte_SDTsItem_CliNom ;
   private String AV26EliminaciondeFormulasTinte_SDTsItem_Forser ;
   private String AV27EliminaciondeFormulasTinte_SDTsItem_Forserdsc ;
   private String AV28EliminaciondeFormulasTinte_SDTsItem_Forcolnom ;
   private String AV12Emprcod ;
   private String AV15Forser ;
   private String AV16Forser_to ;
   private String AV17Forcolnom ;
   private String AV18Forcolnom_to ;
   private String AV56Pgmdesc ;
   private java.util.Date AV32EliminaciondeFormulasTinte_SDTsItem_ForUltUti ;
   private java.util.Date AV23ForUltUti ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV53EliminaciondeFormulasTinte_json ;
   private String AV50Title ;
   private String AV48PageInfo ;
   private String AV45DateInfo ;
   private String AV43AppName ;
   private com.genexus.webpanels.WebSession AV52WebSession ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private GXBaseCollection<app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT> AV11EliminaciondeFormulasTinte_SDTs ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT AV10EliminaciondeFormulasTinte_SDTsItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
}

