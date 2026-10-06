package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tproces_trnwwexportreport_impl extends GXWebReport
{
   public tproces_trnwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV60Title = httpContext.getMessage( "Lista de Procesos Produccion", "") ;
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
         hA9M0( true, 0) ;
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
         hA9M0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFProCod_Sel)==0) )
      {
         hA9M0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFProCod_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20TFProCod)==0) )
         {
            hA9M0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFProCod, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV23TFProDsc_Sel)==0) )
      {
         hA9M0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFProDsc_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV22TFProDsc)==0) )
         {
            hA9M0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFProDsc, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV25TFProDsc2_Sel)==0) )
      {
         hA9M0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion (cont)", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFProDsc2_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFProDsc2)==0) )
         {
            hA9M0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion (cont)", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFProDsc2, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV30TFProEst_Sels.fromJSonString(AV28TFProEst_SelsJson, null);
      if ( ! ( AV30TFProEst_Sels.size() == 0 ) )
      {
         AV49i = 1 ;
         AV67GXV1 = 1 ;
         while ( AV67GXV1 <= AV30TFProEst_Sels.size() )
         {
            AV31TFProEst_Sel = (String)AV30TFProEst_Sels.elementAt(-1+AV67GXV1) ;
            if ( AV49i == 1 )
            {
               AV29TFProEst_SelDscs = "" ;
            }
            else
            {
               AV29TFProEst_SelDscs += ", " ;
            }
            AV45FilterTFProEst_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV31TFProEst_Sel), "A") == 0 )
            {
               AV45FilterTFProEst_SelValueDescription = httpContext.getMessage( "Activo", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV31TFProEst_Sel), "I") == 0 )
            {
               AV45FilterTFProEst_SelValueDescription = httpContext.getMessage( "Inactivo", "") ;
            }
            AV29TFProEst_SelDscs += AV45FilterTFProEst_SelValueDescription ;
            AV49i = (long)(AV49i+1) ;
            AV67GXV1 = (int)(AV67GXV1+1) ;
         }
         hA9M0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "E", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFProEst_SelDscs, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hA9M0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hA9M0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 30, Gx_line+10, 136, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 140, Gx_line+10, 352, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion (cont)", ""), 356, Gx_line+10, 569, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "E", ""), 573, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV69Ficherosbasicos_tproces_trnwwds_1_filterfulltext = AV12FilterFullText ;
      AV70Ficherosbasicos_tproces_trnwwds_2_tfprocod = AV20TFProCod ;
      AV71Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel = AV21TFProCod_Sel ;
      AV72Ficherosbasicos_tproces_trnwwds_4_tfprodsc = AV22TFProDsc ;
      AV73Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel = AV23TFProDsc_Sel ;
      AV74Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 = AV24TFProDsc2 ;
      AV75Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel = AV25TFProDsc2_Sel ;
      AV76Ficherosbasicos_tproces_trnwwds_8_tfproest_sels = AV30TFProEst_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14284ProEst ,
                                           AV76Ficherosbasicos_tproces_trnwwds_8_tfproest_sels ,
                                           AV71Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel ,
                                           AV70Ficherosbasicos_tproces_trnwwds_2_tfprocod ,
                                           AV73Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel ,
                                           AV72Ficherosbasicos_tproces_trnwwds_4_tfprodsc ,
                                           AV75Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel ,
                                           AV74Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 ,
                                           Integer.valueOf(AV76Ficherosbasicos_tproces_trnwwds_8_tfproest_sels.size()) ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV69Ficherosbasicos_tproces_trnwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV70Ficherosbasicos_tproces_trnwwds_2_tfprocod = GXutil.padr( GXutil.rtrim( AV70Ficherosbasicos_tproces_trnwwds_2_tfprocod), 8, "%") ;
      lV72Ficherosbasicos_tproces_trnwwds_4_tfprodsc = GXutil.padr( GXutil.rtrim( AV72Ficherosbasicos_tproces_trnwwds_4_tfprodsc), 40, "%") ;
      lV74Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV74Ficherosbasicos_tproces_trnwwds_6_tfprodsc2), 100, "%") ;
      /* Using cursor P0A9M2 */
      pr_default.execute(0, new Object[] {lV70Ficherosbasicos_tproces_trnwwds_2_tfprocod, AV71Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel, lV72Ficherosbasicos_tproces_trnwwds_4_tfprodsc, AV73Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel, lV74Ficherosbasicos_tproces_trnwwds_6_tfprodsc2, AV75Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4628ProDsc2 = P0A9M2_A4628ProDsc2[0] ;
         A759ProDsc = P0A9M2_A759ProDsc[0] ;
         A758ProCod = P0A9M2_A758ProCod[0] ;
         A14284ProEst = P0A9M2_A14284ProEst[0] ;
         A396EmprCod = P0A9M2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV69Ficherosbasicos_tproces_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A758ProCod) , GXutil.padr( "%" + GXutil.upper( AV69Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A759ProDsc) , GXutil.padr( "%" + GXutil.upper( AV69Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4628ProDsc2) , GXutil.padr( "%" + GXutil.upper( AV69Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV69Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactivo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV69Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "I", "")) == 0 ) ) ) )
         {
            AV13ProEstDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A14284ProEst), "A") == 0 )
            {
               AV13ProEstDescription = httpContext.getMessage( "Activo", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A14284ProEst), "I") == 0 )
            {
               AV13ProEstDescription = httpContext.getMessage( "Inactivo", "") ;
            }
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
            hA9M0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A758ProCod, "")), 30, Gx_line+10, 136, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A759ProDsc, "")), 140, Gx_line+10, 352, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4628ProDsc2, "")), 356, Gx_line+10, 569, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13ProEstDescription, "")), 573, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue("FicherosBasicos.TProces_TRNWWGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TProces_TRNWWGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("FicherosBasicos.TProces_TRNWWGridState"), null, null);
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
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV20TFProCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV21TFProCod_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV22TFProDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV23TFProDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC2") == 0 )
         {
            AV24TFProDsc2 = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC2_SEL") == 0 )
         {
            AV25TFProDsc2_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEST_SEL") == 0 )
         {
            AV28TFProEst_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV30TFProEst_Sels.fromJSonString(AV28TFProEst_SelsJson, null);
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

   public void hA9M0( boolean bFoot ,
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
               AV58PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV55DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV60Title = AV64Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV60Title = "" ;
      AV12FilterFullText = "" ;
      AV21TFProCod_Sel = "" ;
      AV20TFProCod = "" ;
      AV23TFProDsc_Sel = "" ;
      AV22TFProDsc = "" ;
      AV25TFProDsc2_Sel = "" ;
      AV24TFProDsc2 = "" ;
      AV30TFProEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28TFProEst_SelsJson = "" ;
      AV31TFProEst_Sel = "" ;
      AV29TFProEst_SelDscs = "" ;
      AV45FilterTFProEst_SelValueDescription = "" ;
      A14284ProEst = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A4628ProDsc2 = "" ;
      AV69Ficherosbasicos_tproces_trnwwds_1_filterfulltext = "" ;
      AV70Ficherosbasicos_tproces_trnwwds_2_tfprocod = "" ;
      AV71Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel = "" ;
      AV72Ficherosbasicos_tproces_trnwwds_4_tfprodsc = "" ;
      AV73Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel = "" ;
      AV74Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 = "" ;
      AV75Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel = "" ;
      AV76Ficherosbasicos_tproces_trnwwds_8_tfproest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV70Ficherosbasicos_tproces_trnwwds_2_tfprocod = "" ;
      lV72Ficherosbasicos_tproces_trnwwds_4_tfprodsc = "" ;
      lV74Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 = "" ;
      P0A9M2_A4628ProDsc2 = new String[] {""} ;
      P0A9M2_A759ProDsc = new String[] {""} ;
      P0A9M2_A758ProCod = new String[] {""} ;
      P0A9M2_A14284ProEst = new String[] {""} ;
      P0A9M2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV13ProEstDescription = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV58PageInfo = "" ;
      AV55DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV64Pgmdesc = "" ;
      AV53AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_trnwwexportreport__default(),
         new Object[] {
             new Object[] {
            P0A9M2_A4628ProDsc2, P0A9M2_A759ProDsc, P0A9M2_A758ProCod, P0A9M2_A14284ProEst, P0A9M2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV64Pgmdesc = httpContext.getMessage( "TProces_TRNWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV64Pgmdesc = httpContext.getMessage( "TProces_TRNWWExport Report", "") ;
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
   private int AV67GXV1 ;
   private int AV76Ficherosbasicos_tproces_trnwwds_8_tfproest_sels_size ;
   private int AV77GXV2 ;
   private long AV49i ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV21TFProCod_Sel ;
   private String AV20TFProCod ;
   private String AV23TFProDsc_Sel ;
   private String AV22TFProDsc ;
   private String AV25TFProDsc2_Sel ;
   private String AV24TFProDsc2 ;
   private String AV31TFProEst_Sel ;
   private String A14284ProEst ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A4628ProDsc2 ;
   private String AV70Ficherosbasicos_tproces_trnwwds_2_tfprocod ;
   private String AV71Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel ;
   private String AV72Ficherosbasicos_tproces_trnwwds_4_tfprodsc ;
   private String AV73Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel ;
   private String AV74Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 ;
   private String AV75Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel ;
   private String scmdbuf ;
   private String lV70Ficherosbasicos_tproces_trnwwds_2_tfprocod ;
   private String lV72Ficherosbasicos_tproces_trnwwds_4_tfprodsc ;
   private String lV74Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 ;
   private String A396EmprCod ;
   private String AV64Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private String AV28TFProEst_SelsJson ;
   private String AV60Title ;
   private String AV12FilterFullText ;
   private String AV29TFProEst_SelDscs ;
   private String AV45FilterTFProEst_SelValueDescription ;
   private String AV69Ficherosbasicos_tproces_trnwwds_1_filterfulltext ;
   private String AV13ProEstDescription ;
   private String AV58PageInfo ;
   private String AV55DateInfo ;
   private String AV53AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private String[] P0A9M2_A4628ProDsc2 ;
   private String[] P0A9M2_A759ProDsc ;
   private String[] P0A9M2_A758ProCod ;
   private String[] P0A9M2_A14284ProEst ;
   private String[] P0A9M2_A396EmprCod ;
   private GXSimpleCollection<String> AV30TFProEst_Sels ;
   private GXSimpleCollection<String> AV76Ficherosbasicos_tproces_trnwwds_8_tfproest_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class tproces_trnwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A9M2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14284ProEst ,
                                          GXSimpleCollection<String> AV76Ficherosbasicos_tproces_trnwwds_8_tfproest_sels ,
                                          String AV71Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel ,
                                          String AV70Ficherosbasicos_tproces_trnwwds_2_tfprocod ,
                                          String AV73Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel ,
                                          String AV72Ficherosbasicos_tproces_trnwwds_4_tfprodsc ,
                                          String AV75Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel ,
                                          String AV74Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 ,
                                          int AV76Ficherosbasicos_tproces_trnwwds_8_tfproest_sels_size ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV69Ficherosbasicos_tproces_trnwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ProDsc2, ProDsc, ProCod, ProEst, EmprCod FROM TXPPROCES" ;
      if ( (GXutil.strcmp("", AV71Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV70Ficherosbasicos_tproces_trnwwds_2_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(ProCod = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Ficherosbasicos_tproces_trnwwds_4_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV74Ficherosbasicos_tproces_trnwwds_6_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc2 = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( AV76Ficherosbasicos_tproces_trnwwds_8_tfproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Ficherosbasicos_tproces_trnwwds_8_tfproest_sels, "ProEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY ProDsc" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY ProCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY ProDsc2" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProDsc2 DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY ProEst" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProEst DESC" ;
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
                  return conditional_P0A9M2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A9M2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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
                  stmt.setString(sIdx, (String)parms[6], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 40);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 40);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 100);
               }
               return;
      }
   }

}

