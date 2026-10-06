package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tturnoswwexportreport_impl extends GXWebReport
{
   public tturnoswwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV40Title = httpContext.getMessage( "Lista de TURNOS", "") ;
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
         h8AW0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV46FilterFullText)==0) )
      {
         h8AW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 100, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46FilterFullText, "")), 100, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV16TFTurnCod) && (0==AV17TFTurnCod_To) ) )
      {
         h8AW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Turno", ""), 25, Gx_line+0, 100, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16TFTurnCod), "9")), 100, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV26TFTurnCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Turno", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8AW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFTurnCod_To_Description, "")), 25, Gx_line+0, 100, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17TFTurnCod_To), "9")), 100, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV18TFTurnHin) && (0==AV19TFTurnHin_To) ) )
      {
         h8AW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hh", ""), 25, Gx_line+0, 100, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFTurnHin), "Z9")), 100, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV27TFTurnHin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Hh", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8AW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFTurnHin_To_Description, "")), 25, Gx_line+0, 100, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFTurnHin_To), "Z9")), 100, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV20TFTurnMin) && (0==AV21TFTurnMin_To) ) )
      {
         h8AW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Mm", ""), 25, Gx_line+0, 100, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20TFTurnMin), "Z9")), 100, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV28TFTurnMin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Mm", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8AW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFTurnMin_To_Description, "")), 25, Gx_line+0, 100, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFTurnMin_To), "Z9")), 100, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV22TFTurnHfi) && (0==AV23TFTurnHfi_To) ) )
      {
         h8AW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hh", ""), 25, Gx_line+0, 100, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFTurnHfi), "Z9")), 100, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV29TFTurnHfi_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Hh", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8AW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFTurnHfi_To_Description, "")), 25, Gx_line+0, 100, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFTurnHfi_To), "Z9")), 100, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV24TFTurnMfi) && (0==AV25TFTurnMfi_To) ) )
      {
         h8AW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Mm", ""), 25, Gx_line+0, 100, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFTurnMfi), "Z9")), 100, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV30TFTurnMfi_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Mm", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8AW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFTurnMfi_To_Description, "")), 25, Gx_line+0, 100, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25TFTurnMfi_To), "Z9")), 100, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8AW0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8AW0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Turno", ""), 30, Gx_line+10, 178, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hh", ""), 182, Gx_line+10, 330, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Mm", ""), 334, Gx_line+10, 482, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hh", ""), 486, Gx_line+10, 634, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Mm", ""), 638, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV58Tturnoswwds_1_filterfulltext = AV46FilterFullText ;
      AV59Tturnoswwds_2_tfturncod = AV16TFTurnCod ;
      AV60Tturnoswwds_3_tfturncod_to = AV17TFTurnCod_To ;
      AV61Tturnoswwds_4_tfturnhin = AV18TFTurnHin ;
      AV62Tturnoswwds_5_tfturnhin_to = AV19TFTurnHin_To ;
      AV63Tturnoswwds_6_tfturnmin = AV20TFTurnMin ;
      AV64Tturnoswwds_7_tfturnmin_to = AV21TFTurnMin_To ;
      AV65Tturnoswwds_8_tfturnhfi = AV22TFTurnHfi ;
      AV66Tturnoswwds_9_tfturnhfi_to = AV23TFTurnHfi_To ;
      AV67Tturnoswwds_10_tfturnmfi = AV24TFTurnMfi ;
      AV68Tturnoswwds_11_tfturnmfi_to = AV25TFTurnMfi_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV58Tturnoswwds_1_filterfulltext ,
                                           Byte.valueOf(AV59Tturnoswwds_2_tfturncod) ,
                                           Byte.valueOf(AV60Tturnoswwds_3_tfturncod_to) ,
                                           Byte.valueOf(AV61Tturnoswwds_4_tfturnhin) ,
                                           Byte.valueOf(AV62Tturnoswwds_5_tfturnhin_to) ,
                                           Byte.valueOf(AV63Tturnoswwds_6_tfturnmin) ,
                                           Byte.valueOf(AV64Tturnoswwds_7_tfturnmin_to) ,
                                           Byte.valueOf(AV65Tturnoswwds_8_tfturnhfi) ,
                                           Byte.valueOf(AV66Tturnoswwds_9_tfturnhfi_to) ,
                                           Byte.valueOf(AV67Tturnoswwds_10_tfturnmfi) ,
                                           Byte.valueOf(AV68Tturnoswwds_11_tfturnmfi_to) ,
                                           Byte.valueOf(A1161TurnCod) ,
                                           Byte.valueOf(A1162TurnHin) ,
                                           Byte.valueOf(A1163TurnMin) ,
                                           Byte.valueOf(A1164TurnHfi) ,
                                           Byte.valueOf(A1165TurnMfi) ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV58Tturnoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Tturnoswwds_1_filterfulltext), "%", "") ;
      lV58Tturnoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Tturnoswwds_1_filterfulltext), "%", "") ;
      lV58Tturnoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Tturnoswwds_1_filterfulltext), "%", "") ;
      lV58Tturnoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Tturnoswwds_1_filterfulltext), "%", "") ;
      lV58Tturnoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Tturnoswwds_1_filterfulltext), "%", "") ;
      /* Using cursor P08AW2 */
      pr_default.execute(0, new Object[] {lV58Tturnoswwds_1_filterfulltext, lV58Tturnoswwds_1_filterfulltext, lV58Tturnoswwds_1_filterfulltext, lV58Tturnoswwds_1_filterfulltext, lV58Tturnoswwds_1_filterfulltext, Byte.valueOf(AV59Tturnoswwds_2_tfturncod), Byte.valueOf(AV60Tturnoswwds_3_tfturncod_to), Byte.valueOf(AV61Tturnoswwds_4_tfturnhin), Byte.valueOf(AV62Tturnoswwds_5_tfturnhin_to), Byte.valueOf(AV63Tturnoswwds_6_tfturnmin), Byte.valueOf(AV64Tturnoswwds_7_tfturnmin_to), Byte.valueOf(AV65Tturnoswwds_8_tfturnhfi), Byte.valueOf(AV66Tturnoswwds_9_tfturnhfi_to), Byte.valueOf(AV67Tturnoswwds_10_tfturnmfi), Byte.valueOf(AV68Tturnoswwds_11_tfturnmfi_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1165TurnMfi = P08AW2_A1165TurnMfi[0] ;
         n1165TurnMfi = P08AW2_n1165TurnMfi[0] ;
         A1164TurnHfi = P08AW2_A1164TurnHfi[0] ;
         n1164TurnHfi = P08AW2_n1164TurnHfi[0] ;
         A1163TurnMin = P08AW2_A1163TurnMin[0] ;
         n1163TurnMin = P08AW2_n1163TurnMin[0] ;
         A1162TurnHin = P08AW2_A1162TurnHin[0] ;
         n1162TurnHin = P08AW2_n1162TurnHin[0] ;
         A1161TurnCod = P08AW2_A1161TurnCod[0] ;
         A396EmprCod = P08AW2_A396EmprCod[0] ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         h8AW0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1161TurnCod), "9")), 30, Gx_line+10, 178, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1162TurnHin), "Z9")), 182, Gx_line+10, 330, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1163TurnMin), "Z9")), 334, Gx_line+10, 482, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1164TurnHfi), "Z9")), 486, Gx_line+10, 634, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1165TurnMfi), "Z9")), 638, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV12Session.getValue("TTURNOSWWGridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTURNOSWWGridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV12Session.getValue("TTURNOSWWGridState"), null, null);
      }
      AV10OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV69GXV1 = 1 ;
      while ( AV69GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV69GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTURNCOD") == 0 )
         {
            AV16TFTurnCod = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFTurnCod_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTURNHIN") == 0 )
         {
            AV18TFTurnHin = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFTurnHin_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTURNMIN") == 0 )
         {
            AV20TFTurnMin = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFTurnMin_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTURNHFI") == 0 )
         {
            AV22TFTurnHfi = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFTurnHfi_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTURNMFI") == 0 )
         {
            AV24TFTurnMfi = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFTurnMfi_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV69GXV1 = (int)(AV69GXV1+1) ;
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

   public void h8AW0( boolean bFoot ,
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
               AV37PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV33DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
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
            AV40Title = AV54Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV40Title = "" ;
      AV46FilterFullText = "" ;
      AV26TFTurnCod_To_Description = "" ;
      AV27TFTurnHin_To_Description = "" ;
      AV28TFTurnMin_To_Description = "" ;
      AV29TFTurnHfi_To_Description = "" ;
      AV30TFTurnMfi_To_Description = "" ;
      AV58Tturnoswwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV58Tturnoswwds_1_filterfulltext = "" ;
      P08AW2_A1165TurnMfi = new byte[1] ;
      P08AW2_n1165TurnMfi = new boolean[] {false} ;
      P08AW2_A1164TurnHfi = new byte[1] ;
      P08AW2_n1164TurnHfi = new boolean[] {false} ;
      P08AW2_A1163TurnMin = new byte[1] ;
      P08AW2_n1163TurnMin = new boolean[] {false} ;
      P08AW2_A1162TurnHin = new byte[1] ;
      P08AW2_n1162TurnHin = new boolean[] {false} ;
      P08AW2_A1161TurnCod = new byte[1] ;
      P08AW2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV12Session = httpContext.getWebSession();
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV37PageInfo = "" ;
      AV33DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV54Pgmdesc = "" ;
      AV48AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tturnoswwexportreport__default(),
         new Object[] {
             new Object[] {
            P08AW2_A1165TurnMfi, P08AW2_n1165TurnMfi, P08AW2_A1164TurnHfi, P08AW2_n1164TurnHfi, P08AW2_A1163TurnMin, P08AW2_n1163TurnMin, P08AW2_A1162TurnHin, P08AW2_n1162TurnHin, P08AW2_A1161TurnCod, P08AW2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV54Pgmdesc = httpContext.getMessage( "Listado Turnos", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV54Pgmdesc = httpContext.getMessage( "Listado Turnos", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV16TFTurnCod ;
   private byte AV17TFTurnCod_To ;
   private byte AV18TFTurnHin ;
   private byte AV19TFTurnHin_To ;
   private byte AV20TFTurnMin ;
   private byte AV21TFTurnMin_To ;
   private byte AV22TFTurnHfi ;
   private byte AV23TFTurnHfi_To ;
   private byte AV24TFTurnMfi ;
   private byte AV25TFTurnMfi_To ;
   private byte A1161TurnCod ;
   private byte A1162TurnHin ;
   private byte A1163TurnMin ;
   private byte A1164TurnHfi ;
   private byte A1165TurnMfi ;
   private byte AV59Tturnoswwds_2_tfturncod ;
   private byte AV60Tturnoswwds_3_tfturncod_to ;
   private byte AV61Tturnoswwds_4_tfturnhin ;
   private byte AV62Tturnoswwds_5_tfturnhin_to ;
   private byte AV63Tturnoswwds_6_tfturnmin ;
   private byte AV64Tturnoswwds_7_tfturnmin_to ;
   private byte AV65Tturnoswwds_8_tfturnhfi ;
   private byte AV66Tturnoswwds_9_tfturnhfi_to ;
   private byte AV67Tturnoswwds_10_tfturnmfi ;
   private byte AV68Tturnoswwds_11_tfturnmfi_to ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV69GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV54Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n1165TurnMfi ;
   private boolean n1164TurnHfi ;
   private boolean n1163TurnMin ;
   private boolean n1162TurnHin ;
   private String AV40Title ;
   private String AV46FilterFullText ;
   private String AV26TFTurnCod_To_Description ;
   private String AV27TFTurnHin_To_Description ;
   private String AV28TFTurnMin_To_Description ;
   private String AV29TFTurnHfi_To_Description ;
   private String AV30TFTurnMfi_To_Description ;
   private String AV58Tturnoswwds_1_filterfulltext ;
   private String lV58Tturnoswwds_1_filterfulltext ;
   private String AV37PageInfo ;
   private String AV33DateInfo ;
   private String AV48AppName ;
   private com.genexus.webpanels.WebSession AV12Session ;
   private IDataStoreProvider pr_default ;
   private byte[] P08AW2_A1165TurnMfi ;
   private boolean[] P08AW2_n1165TurnMfi ;
   private byte[] P08AW2_A1164TurnHfi ;
   private boolean[] P08AW2_n1164TurnHfi ;
   private byte[] P08AW2_A1163TurnMin ;
   private boolean[] P08AW2_n1163TurnMin ;
   private byte[] P08AW2_A1162TurnHin ;
   private boolean[] P08AW2_n1162TurnHin ;
   private byte[] P08AW2_A1161TurnCod ;
   private String[] P08AW2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
}

final  class tturnoswwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08AW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Tturnoswwds_1_filterfulltext ,
                                          byte AV59Tturnoswwds_2_tfturncod ,
                                          byte AV60Tturnoswwds_3_tfturncod_to ,
                                          byte AV61Tturnoswwds_4_tfturnhin ,
                                          byte AV62Tturnoswwds_5_tfturnhin_to ,
                                          byte AV63Tturnoswwds_6_tfturnmin ,
                                          byte AV64Tturnoswwds_7_tfturnmin_to ,
                                          byte AV65Tturnoswwds_8_tfturnhfi ,
                                          byte AV66Tturnoswwds_9_tfturnhfi_to ,
                                          byte AV67Tturnoswwds_10_tfturnmfi ,
                                          byte AV68Tturnoswwds_11_tfturnmfi_to ,
                                          byte A1161TurnCod ,
                                          byte A1162TurnHin ,
                                          byte A1163TurnMin ,
                                          byte A1164TurnHfi ,
                                          byte A1165TurnMfi ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT TurnMfi, TurnHfi, TurnMin, TurnHin, TurnCod, EmprCod FROM TXPTURNOS" ;
      if ( ! (GXutil.strcmp("", AV58Tturnoswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(TurnCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TurnHin,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TurnMin,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TurnHfi,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TurnMfi,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV59Tturnoswwds_2_tfturncod) )
      {
         addWhere(sWhereString, "(TurnCod >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV60Tturnoswwds_3_tfturncod_to) )
      {
         addWhere(sWhereString, "(TurnCod <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV61Tturnoswwds_4_tfturnhin) )
      {
         addWhere(sWhereString, "(TurnHin >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV62Tturnoswwds_5_tfturnhin_to) )
      {
         addWhere(sWhereString, "(TurnHin <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV63Tturnoswwds_6_tfturnmin) )
      {
         addWhere(sWhereString, "(TurnMin >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV64Tturnoswwds_7_tfturnmin_to) )
      {
         addWhere(sWhereString, "(TurnMin <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV65Tturnoswwds_8_tfturnhfi) )
      {
         addWhere(sWhereString, "(TurnHfi >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV66Tturnoswwds_9_tfturnhfi_to) )
      {
         addWhere(sWhereString, "(TurnHfi <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV67Tturnoswwds_10_tfturnmfi) )
      {
         addWhere(sWhereString, "(TurnMfi >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV68Tturnoswwds_11_tfturnmfi_to) )
      {
         addWhere(sWhereString, "(TurnMfi <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TurnCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TurnCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TurnHin" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TurnHin DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TurnMin" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TurnMin DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TurnHfi" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TurnHfi DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TurnMfi" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TurnMfi DESC" ;
      }
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
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
                  return conditional_P08AW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).shortValue() , ((Boolean) dynConstraints[17]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08AW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               return;
      }
   }

}

