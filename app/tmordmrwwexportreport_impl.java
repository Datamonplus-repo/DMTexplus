package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmordmrwwexportreport_impl extends GXWebReport
{
   public tmordmrwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV48Title = httpContext.getMessage( "Lista de Res Mano de Obra Orden Trabajo", "") ;
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
         h8Q50( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV12FilterFullText)==0) )
      {
         h8Q50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 230, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 230, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV22TFOMCod) && (0==AV23TFOMCod_To) ) )
      {
         h8Q50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cod de Orden de Mantto", ""), 25, Gx_line+0, 230, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFOMCod), "ZZZZZZZ9")), 230, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV34TFOMCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cod de Orden de Mantto", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8Q50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFOMCod_To_Description, "")), 25, Gx_line+0, 230, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFOMCod_To), "ZZZZZZZ9")), 230, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFOMMaqCod_Sel)==0) )
      {
         h8Q50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cod Maquina Orden de Mantto", ""), 25, Gx_line+0, 230, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFOMMaqCod_Sel, "")), 230, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFOMMaqCod)==0) )
         {
            h8Q50( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cod Maquina Orden de Mantto", ""), 25, Gx_line+0, 230, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFOMMaqCod, "")), 230, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV27TFOMMaqDsc_Sel)==0) )
      {
         h8Q50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Desc Maquina Ord Mantto", ""), 25, Gx_line+0, 230, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFOMMaqDsc_Sel, "")), 230, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV26TFOMMaqDsc)==0) )
         {
            h8Q50( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Desc Maquina Ord Mantto", ""), 25, Gx_line+0, 230, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFOMMaqDsc, "")), 230, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFOMMRCosT)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFOMMRCosT_To)==0) ) )
      {
         h8Q50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Costo Total Reserva Mano Obra", ""), 25, Gx_line+0, 230, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TFOMMRCosT, "ZZZZZZZ9.999")), 230, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV35TFOMMRCosT_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Costo Total Reserva Mano Obra", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8Q50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFOMMRCosT_To_Description, "")), 25, Gx_line+0, 230, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TFOMMRCosT_To, "ZZZZZZZ9.999")), 230, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV32TFOMEst_Sels.fromJSonString(AV30TFOMEst_SelsJson, null);
      if ( ! ( AV32TFOMEst_Sels.size() == 0 ) )
      {
         AV37i = 1 ;
         AV65GXV1 = 1 ;
         while ( AV65GXV1 <= AV32TFOMEst_Sels.size() )
         {
            AV33TFOMEst_Sel = (String)AV32TFOMEst_Sels.elementAt(-1+AV65GXV1) ;
            if ( AV37i == 1 )
            {
               AV31TFOMEst_SelDscs = "" ;
            }
            else
            {
               AV31TFOMEst_SelDscs += ", " ;
            }
            AV36FilterTFOMEst_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV33TFOMEst_Sel), "P") == 0 )
            {
               AV36FilterTFOMEst_SelValueDescription = httpContext.getMessage( "Pendiente", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV33TFOMEst_Sel), "R") == 0 )
            {
               AV36FilterTFOMEst_SelValueDescription = httpContext.getMessage( "Realizada", "") ;
            }
            AV31TFOMEst_SelDscs += AV36FilterTFOMEst_SelValueDescription ;
            AV37i = (long)(AV37i+1) ;
            AV65GXV1 = (int)(AV65GXV1+1) ;
         }
         h8Q50( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 230, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFOMEst_SelDscs, "")), 230, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8Q50( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8Q50( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cod de Orden de Mantto", ""), 30, Gx_line+10, 135, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cod Maquina Orden de Mantto", ""), 139, Gx_line+10, 245, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Desc Maquina Ord Mantto", ""), 249, Gx_line+10, 461, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Costo Total Reserva Mano Obra", ""), 465, Gx_line+10, 571, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 575, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV67Tmordmrwwds_1_filterfulltext = AV12FilterFullText ;
      AV68Tmordmrwwds_2_tfomcod = AV22TFOMCod ;
      AV69Tmordmrwwds_3_tfomcod_to = AV23TFOMCod_To ;
      AV70Tmordmrwwds_4_tfommaqcod = AV24TFOMMaqCod ;
      AV71Tmordmrwwds_5_tfommaqcod_sel = AV25TFOMMaqCod_Sel ;
      AV72Tmordmrwwds_6_tfommaqdsc = AV26TFOMMaqDsc ;
      AV73Tmordmrwwds_7_tfommaqdsc_sel = AV27TFOMMaqDsc_Sel ;
      AV74Tmordmrwwds_8_tfommrcost = AV28TFOMMRCosT ;
      AV75Tmordmrwwds_9_tfommrcost_to = AV29TFOMMRCosT_To ;
      AV76Tmordmrwwds_10_tfomest_sels = AV32TFOMEst_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV76Tmordmrwwds_10_tfomest_sels ,
                                           Integer.valueOf(AV68Tmordmrwwds_2_tfomcod) ,
                                           Integer.valueOf(AV69Tmordmrwwds_3_tfomcod_to) ,
                                           AV71Tmordmrwwds_5_tfommaqcod_sel ,
                                           AV70Tmordmrwwds_4_tfommaqcod ,
                                           AV73Tmordmrwwds_7_tfommaqdsc_sel ,
                                           AV72Tmordmrwwds_6_tfommaqdsc ,
                                           AV74Tmordmrwwds_8_tfommrcost ,
                                           AV75Tmordmrwwds_9_tfommrcost_to ,
                                           Integer.valueOf(AV76Tmordmrwwds_10_tfomest_sels.size()) ,
                                           Integer.valueOf(A9425OMCod) ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           A9442OMMRCosT ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV67Tmordmrwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV70Tmordmrwwds_4_tfommaqcod = GXutil.padr( GXutil.rtrim( AV70Tmordmrwwds_4_tfommaqcod), 6, "%") ;
      lV72Tmordmrwwds_6_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV72Tmordmrwwds_6_tfommaqdsc), 16, "%") ;
      /* Using cursor P08Q53 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV68Tmordmrwwds_2_tfomcod), Integer.valueOf(AV69Tmordmrwwds_3_tfomcod_to), lV70Tmordmrwwds_4_tfommaqcod, AV71Tmordmrwwds_5_tfommaqcod_sel, lV72Tmordmrwwds_6_tfommaqdsc, AV73Tmordmrwwds_7_tfommaqdsc_sel, AV74Tmordmrwwds_8_tfommrcost, AV75Tmordmrwwds_9_tfommrcost_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08Q53_A396EmprCod[0] ;
         A9427OMMaqDsc = P08Q53_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08Q53_n9427OMMaqDsc[0] ;
         A9426OMMaqCod = P08Q53_A9426OMMaqCod[0] ;
         A9425OMCod = P08Q53_A9425OMCod[0] ;
         A9445OMEst = P08Q53_A9445OMEst[0] ;
         A9442OMMRCosT = P08Q53_A9442OMMRCosT[0] ;
         n9442OMMRCosT = P08Q53_n9442OMMRCosT[0] ;
         A9427OMMaqDsc = P08Q53_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08Q53_n9427OMMaqDsc[0] ;
         A9442OMMRCosT = P08Q53_A9442OMMRCosT[0] ;
         n9442OMMRCosT = P08Q53_n9442OMMRCosT[0] ;
         if ( (GXutil.strcmp("", AV67Tmordmrwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV67Tmordmrwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV67Tmordmrwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV67Tmordmrwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV67Tmordmrwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tmordmrwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tmordmrwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) ) )
         {
            AV13OMEstDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A9445OMEst), "P") == 0 )
            {
               AV13OMEstDescription = httpContext.getMessage( "Pendiente", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A9445OMEst), "R") == 0 )
            {
               AV13OMEstDescription = httpContext.getMessage( "Realizada", "") ;
            }
            /* Execute user subroutine: 'BEFOREPRINTLINE' */
            S144 ();
            if ( returnInSub )
            {
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
            h8Q50( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9")), 30, Gx_line+10, 135, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), 139, Gx_line+10, 245, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), 249, Gx_line+10, 461, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9442OMMRCosT, "ZZZZZZZ9.999")), 465, Gx_line+10, 571, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13OMEstDescription, "")), 575, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
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
      if ( GXutil.strcmp(AV14Session.getValue("TMOrdMRWWGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMOrdMRWWGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("TMOrdMRWWGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV77GXV2 = 1 ;
      while ( AV77GXV2 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV77GXV2));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOD") == 0 )
         {
            AV22TFOMCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFOMCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCOD") == 0 )
         {
            AV24TFOMMaqCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCOD_SEL") == 0 )
         {
            AV25TFOMMaqCod_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQDSC") == 0 )
         {
            AV26TFOMMaqDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQDSC_SEL") == 0 )
         {
            AV27TFOMMaqDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMRCOST") == 0 )
         {
            AV28TFOMMRCosT = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFOMMRCosT_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMEST_SEL") == 0 )
         {
            AV30TFOMEst_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV32TFOMEst_Sels.fromJSonString(AV30TFOMEst_SelsJson, null);
         }
         AV77GXV2 = (int)(AV77GXV2+1) ;
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

   public void h8Q50( boolean bFoot ,
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
               AV46PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV43DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV48Title = AV62Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV48Title = "" ;
      AV12FilterFullText = "" ;
      AV34TFOMCod_To_Description = "" ;
      AV25TFOMMaqCod_Sel = "" ;
      AV24TFOMMaqCod = "" ;
      AV27TFOMMaqDsc_Sel = "" ;
      AV26TFOMMaqDsc = "" ;
      AV28TFOMMRCosT = DecimalUtil.ZERO ;
      AV29TFOMMRCosT_To = DecimalUtil.ZERO ;
      AV35TFOMMRCosT_To_Description = "" ;
      AV32TFOMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30TFOMEst_SelsJson = "" ;
      AV33TFOMEst_Sel = "" ;
      AV31TFOMEst_SelDscs = "" ;
      AV36FilterTFOMEst_SelValueDescription = "" ;
      A9445OMEst = "" ;
      A9426OMMaqCod = "" ;
      A9427OMMaqDsc = "" ;
      A9442OMMRCosT = DecimalUtil.ZERO ;
      AV67Tmordmrwwds_1_filterfulltext = "" ;
      AV70Tmordmrwwds_4_tfommaqcod = "" ;
      AV71Tmordmrwwds_5_tfommaqcod_sel = "" ;
      AV72Tmordmrwwds_6_tfommaqdsc = "" ;
      AV73Tmordmrwwds_7_tfommaqdsc_sel = "" ;
      AV74Tmordmrwwds_8_tfommrcost = DecimalUtil.ZERO ;
      AV75Tmordmrwwds_9_tfommrcost_to = DecimalUtil.ZERO ;
      AV76Tmordmrwwds_10_tfomest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV70Tmordmrwwds_4_tfommaqcod = "" ;
      lV72Tmordmrwwds_6_tfommaqdsc = "" ;
      P08Q53_A396EmprCod = new String[] {""} ;
      P08Q53_A9427OMMaqDsc = new String[] {""} ;
      P08Q53_n9427OMMaqDsc = new boolean[] {false} ;
      P08Q53_A9426OMMaqCod = new String[] {""} ;
      P08Q53_A9425OMCod = new int[1] ;
      P08Q53_A9445OMEst = new String[] {""} ;
      P08Q53_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q53_n9442OMMRCosT = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV13OMEstDescription = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV46PageInfo = "" ;
      AV43DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV62Pgmdesc = "" ;
      AV41AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmordmrwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08Q53_A396EmprCod, P08Q53_A9427OMMaqDsc, P08Q53_n9427OMMaqDsc, P08Q53_A9426OMMaqCod, P08Q53_A9425OMCod, P08Q53_A9445OMEst, P08Q53_A9442OMMRCosT, P08Q53_n9442OMMRCosT
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV62Pgmdesc = httpContext.getMessage( "TMOrd MRWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV62Pgmdesc = httpContext.getMessage( "TMOrd MRWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV22TFOMCod ;
   private int AV23TFOMCod_To ;
   private int AV65GXV1 ;
   private int A9425OMCod ;
   private int AV68Tmordmrwwds_2_tfomcod ;
   private int AV69Tmordmrwwds_3_tfomcod_to ;
   private int AV76Tmordmrwwds_10_tfomest_sels_size ;
   private int AV77GXV2 ;
   private long AV37i ;
   private java.math.BigDecimal AV28TFOMMRCosT ;
   private java.math.BigDecimal AV29TFOMMRCosT_To ;
   private java.math.BigDecimal A9442OMMRCosT ;
   private java.math.BigDecimal AV74Tmordmrwwds_8_tfommrcost ;
   private java.math.BigDecimal AV75Tmordmrwwds_9_tfommrcost_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV25TFOMMaqCod_Sel ;
   private String AV24TFOMMaqCod ;
   private String AV27TFOMMaqDsc_Sel ;
   private String AV26TFOMMaqDsc ;
   private String AV33TFOMEst_Sel ;
   private String A9445OMEst ;
   private String A9426OMMaqCod ;
   private String A9427OMMaqDsc ;
   private String AV70Tmordmrwwds_4_tfommaqcod ;
   private String AV71Tmordmrwwds_5_tfommaqcod_sel ;
   private String AV72Tmordmrwwds_6_tfommaqdsc ;
   private String AV73Tmordmrwwds_7_tfommaqdsc_sel ;
   private String scmdbuf ;
   private String lV70Tmordmrwwds_4_tfommaqcod ;
   private String lV72Tmordmrwwds_6_tfommaqdsc ;
   private String A396EmprCod ;
   private String AV62Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n9427OMMaqDsc ;
   private boolean n9442OMMRCosT ;
   private String AV30TFOMEst_SelsJson ;
   private String AV48Title ;
   private String AV12FilterFullText ;
   private String AV34TFOMCod_To_Description ;
   private String AV35TFOMMRCosT_To_Description ;
   private String AV31TFOMEst_SelDscs ;
   private String AV36FilterTFOMEst_SelValueDescription ;
   private String AV67Tmordmrwwds_1_filterfulltext ;
   private String AV13OMEstDescription ;
   private String AV46PageInfo ;
   private String AV43DateInfo ;
   private String AV41AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08Q53_A396EmprCod ;
   private String[] P08Q53_A9427OMMaqDsc ;
   private boolean[] P08Q53_n9427OMMaqDsc ;
   private String[] P08Q53_A9426OMMaqCod ;
   private int[] P08Q53_A9425OMCod ;
   private String[] P08Q53_A9445OMEst ;
   private java.math.BigDecimal[] P08Q53_A9442OMMRCosT ;
   private boolean[] P08Q53_n9442OMMRCosT ;
   private GXSimpleCollection<String> AV32TFOMEst_Sels ;
   private GXSimpleCollection<String> AV76Tmordmrwwds_10_tfomest_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class tmordmrwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08Q53( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9445OMEst ,
                                          GXSimpleCollection<String> AV76Tmordmrwwds_10_tfomest_sels ,
                                          int AV68Tmordmrwwds_2_tfomcod ,
                                          int AV69Tmordmrwwds_3_tfomcod_to ,
                                          String AV71Tmordmrwwds_5_tfommaqcod_sel ,
                                          String AV70Tmordmrwwds_4_tfommaqcod ,
                                          String AV73Tmordmrwwds_7_tfommaqdsc_sel ,
                                          String AV72Tmordmrwwds_6_tfommaqdsc ,
                                          java.math.BigDecimal AV74Tmordmrwwds_8_tfommrcost ,
                                          java.math.BigDecimal AV75Tmordmrwwds_9_tfommrcost_to ,
                                          int AV76Tmordmrwwds_10_tfomest_sels_size ,
                                          int A9425OMCod ,
                                          String A9426OMMaqCod ,
                                          String A9427OMMaqDsc ,
                                          java.math.BigDecimal A9442OMMRCosT ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV67Tmordmrwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[8];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T1.OMCod, T1.OMEst, COALESCE( T3.OMMRCosT, 0) AS OMMRCosT FROM ((TXPMORDEN T1 INNER JOIN TXPMAQUIN" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod FROM TXPMOrMO" ;
      scmdbuf += " GROUP BY EmprCod, OMCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.OMCod = T1.OMCod)" ;
      if ( ! (0==AV68Tmordmrwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV69Tmordmrwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tmordmrwwds_5_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV70Tmordmrwwds_4_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tmordmrwwds_5_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Tmordmrwwds_7_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Tmordmrwwds_6_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Tmordmrwwds_7_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Tmordmrwwds_8_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Tmordmrwwds_9_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV76Tmordmrwwds_10_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Tmordmrwwds_10_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.MaqDsc" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.MaqDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMaqCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMaqCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMEst" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMEst DESC" ;
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
                  return conditional_P08Q53(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08Q53", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[14], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 3);
               }
               return;
      }
   }

}

