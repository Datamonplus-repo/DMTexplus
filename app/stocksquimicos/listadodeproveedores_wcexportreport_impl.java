package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodeproveedores_wcexportreport_impl extends GXWebReport
{
   public listadodeproveedores_wcexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV77Title = httpContext.getMessage( "Lista de Mantenimiento de Proveedores", "") ;
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
         h9L80( true, 0) ;
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
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV18TFPrvNum) && (0==AV19TFPrvNum_To) ) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFPrvNum), "ZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV60TFPrvNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Proveedor", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60TFPrvNum_To_Description, "")), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFPrvNum_To), "ZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFPrvNom_Sel)==0) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFPrvNom_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20TFPrvNom)==0) )
         {
            h9L80( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFPrvNom, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV23TFPrvDir_Sel)==0) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Direccion", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFPrvDir_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV22TFPrvDir)==0) )
         {
            h9L80( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Direccion", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFPrvDir, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV25TFPrvPob_Sel)==0) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Poblacion", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFPrvPob_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFPrvPob)==0) )
         {
            h9L80( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Poblacion", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFPrvPob, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV27TFPrvCpo_Sel)==0) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Postal", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFPrvCpo_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV26TFPrvCpo)==0) )
         {
            h9L80( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo Postal", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFPrvCpo, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV29TFPrvCp2_Sel)==0) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "C. Postal 2", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFPrvCp2_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV28TFPrvCp2)==0) )
         {
            h9L80( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "C. Postal 2", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFPrvCp2, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV31TFPrvNif_Sel)==0) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N.I.F.", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFPrvNif_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV30TFPrvNif)==0) )
         {
            h9L80( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.I.F.", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFPrvNif, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV33TFPrvTlf_Sel)==0) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Telefonos", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFPrvTlf_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV32TFPrvTlf)==0) )
         {
            h9L80( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Telefonos", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFPrvTlf, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV35TFPrvTlx_Sel)==0) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Telex", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFPrvTlx_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV34TFPrvTlx)==0) )
         {
            h9L80( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Telex", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFPrvTlx, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV37TFPrvFax_Sel)==0) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fax", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFPrvFax_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV36TFPrvFax)==0) )
         {
            h9L80( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fax", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFPrvFax, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV39TFPrvMail_Sel)==0) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Mail", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFPrvMail_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV38TFPrvMail)==0) )
         {
            h9L80( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mail", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFPrvMail, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV41TFFpgCod_Sel)==0) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Forma Pago", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFFpgCod_Sel, "@!")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV40TFFpgCod)==0) )
         {
            h9L80( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Forma Pago", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFFpgCod, "@!")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV43TFFpgDsc_Sel)==0) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFFpgDsc_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV42TFFpgDsc)==0) )
         {
            h9L80( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFFpgDsc, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV44TFPrvVto) && (0==AV45TFPrvVto_To) ) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Vtos.", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44TFPrvVto), "Z9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV61TFPrvVto_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Vtos.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFPrvVto_To_Description, "")), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV45TFPrvVto_To), "Z9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV46TFPrvDiaPag) && (0==AV47TFPrvDiaPag_To) ) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Dias Pago", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46TFPrvDiaPag), "ZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV62TFPrvDiaPag_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Dias Pago", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFPrvDiaPag_To_Description, "")), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47TFPrvDiaPag_To), "ZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV48TFPrvPer) && (0==AV49TFPrvPer_To) ) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Periodicidad", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48TFPrvPer), "ZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV63TFPrvPer_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Periodicidad", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63TFPrvPer_To_Description, "")), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49TFPrvPer_To), "ZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFPrvRep_Sel)==0) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Representante", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFPrvRep_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV50TFPrvRep)==0) )
         {
            h9L80( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Representante", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFPrvRep, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV52TFPrvPlaEnt) && (0==AV53TFPrvPlaEnt_To) ) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Dias Plazo Entrega", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52TFPrvPlaEnt), "ZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV64TFPrvPlaEnt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Dias Plazo Entrega", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64TFPrvPlaEnt_To_Description, "")), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV53TFPrvPlaEnt_To), "ZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV56TFPrvMetTra_Sels.fromJSonString(AV54TFPrvMetTra_SelsJson, null);
      if ( ! ( AV56TFPrvMetTra_Sels.size() == 0 ) )
      {
         AV66i = 1 ;
         AV87GXV1 = 1 ;
         while ( AV87GXV1 <= AV56TFPrvMetTra_Sels.size() )
         {
            AV57TFPrvMetTra_Sel = (String)AV56TFPrvMetTra_Sels.elementAt(-1+AV87GXV1) ;
            if ( AV66i == 1 )
            {
               AV55TFPrvMetTra_SelDscs = "" ;
            }
            else
            {
               AV55TFPrvMetTra_SelDscs += ", " ;
            }
            AV65FilterTFPrvMetTra_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV57TFPrvMetTra_Sel), "S") == 0 )
            {
               AV65FilterTFPrvMetTra_SelValueDescription = httpContext.getMessage( "Su Transporte", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV57TFPrvMetTra_Sel), "N") == 0 )
            {
               AV65FilterTFPrvMetTra_SelValueDescription = httpContext.getMessage( "Nuestro", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV57TFPrvMetTra_Sel), "A") == 0 )
            {
               AV65FilterTFPrvMetTra_SelValueDescription = httpContext.getMessage( "Agencia", "") ;
            }
            AV55TFPrvMetTra_SelDscs += AV65FilterTFPrvMetTra_SelValueDescription ;
            AV66i = (long)(AV66i+1) ;
            AV87GXV1 = (int)(AV87GXV1+1) ;
         }
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Metodo Transporte", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55TFPrvMetTra_SelDscs, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFPrvCta_Sel)==0) )
      {
         h9L80( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cuenta Contable", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59TFPrvCta_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV58TFPrvCta)==0) )
         {
            h9L80( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cuenta Contable", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TFPrvCta, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9L80( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9L80( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 30, Gx_line+10, 64, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 68, Gx_line+10, 102, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Direccion", ""), 106, Gx_line+10, 140, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Poblacion", ""), 144, Gx_line+10, 178, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Postal", ""), 182, Gx_line+10, 216, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "C. Postal 2", ""), 220, Gx_line+10, 254, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N.I.F.", ""), 258, Gx_line+10, 292, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Telefonos", ""), 296, Gx_line+10, 330, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Telex", ""), 334, Gx_line+10, 368, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fax", ""), 372, Gx_line+10, 406, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Mail", ""), 410, Gx_line+10, 444, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Forma Pago", ""), 448, Gx_line+10, 482, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 486, Gx_line+10, 520, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Vtos.", ""), 524, Gx_line+10, 558, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Dias Pago", ""), 562, Gx_line+10, 596, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Periodicidad", ""), 600, Gx_line+10, 634, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Representante", ""), 638, Gx_line+10, 672, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Dias Plazo Entrega", ""), 676, Gx_line+10, 710, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Metodo Transporte", ""), 714, Gx_line+10, 748, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cuenta Contable", ""), 752, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV12FilterFullText ;
      AV90Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV18TFPrvNum ;
      AV91Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV19TFPrvNum_To ;
      AV92Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV20TFPrvNom ;
      AV93Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV21TFPrvNom_Sel ;
      AV94Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV22TFPrvDir ;
      AV95Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV23TFPrvDir_Sel ;
      AV96Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV24TFPrvPob ;
      AV97Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV25TFPrvPob_Sel ;
      AV98Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV26TFPrvCpo ;
      AV99Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV27TFPrvCpo_Sel ;
      AV100Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV28TFPrvCp2 ;
      AV101Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV29TFPrvCp2_Sel ;
      AV102Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV30TFPrvNif ;
      AV103Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV31TFPrvNif_Sel ;
      AV104Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV32TFPrvTlf ;
      AV105Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV33TFPrvTlf_Sel ;
      AV106Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV34TFPrvTlx ;
      AV107Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV35TFPrvTlx_Sel ;
      AV108Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV36TFPrvFax ;
      AV109Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV37TFPrvFax_Sel ;
      AV110Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV38TFPrvMail ;
      AV111Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV39TFPrvMail_Sel ;
      AV112Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV40TFFpgCod ;
      AV113Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV41TFFpgCod_Sel ;
      AV114Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV42TFFpgDsc ;
      AV115Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV43TFFpgDsc_Sel ;
      AV116Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV44TFPrvVto ;
      AV117Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV45TFPrvVto_To ;
      AV118Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV46TFPrvDiaPag ;
      AV119Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV47TFPrvDiaPag_To ;
      AV120Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV48TFPrvPer ;
      AV121Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV49TFPrvPer_To ;
      AV122Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV50TFPrvRep ;
      AV123Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV51TFPrvRep_Sel ;
      AV124Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV52TFPrvPlaEnt ;
      AV125Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV53TFPrvPlaEnt_To ;
      AV126Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV56TFPrvMetTra_Sels ;
      AV127Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV58TFPrvCta ;
      AV128Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV59TFPrvCta_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV126Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV90Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV91Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV103Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV105Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV104Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV107Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV106Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV109Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV108Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV111Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV110Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV113Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV112Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV115Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV116Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV117Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV118Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV119Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV120Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV121Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV123Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV122Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV124Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV125Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV126Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV128Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV127Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Short.valueOf(AV80PrvNumFrom) ,
                                           Short.valueOf(AV81PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           AV79Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV92Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV94Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV94Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV96Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV96Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV98Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV98Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV100Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV100Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV102Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV102Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV104Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV104Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV106Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV106Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV108Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV108Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV110Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV110Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV112Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV112Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV114Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV122Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV122Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV127Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV127Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09L82 */
      pr_default.execute(0, new Object[] {AV79Emprcod, Integer.valueOf(AV90Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV91Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV92Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV93Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV94Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV95Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV96Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV97Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV98Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV99Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV100Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV101Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV102Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV103Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV104Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV105Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV106Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV107Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV108Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV109Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV110Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV111Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV112Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV113Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV114Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV115Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV116Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV117Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV118Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV119Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV120Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV121Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV122Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV123Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV124Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV125Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV127Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV128Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Short.valueOf(AV80PrvNumFrom), Short.valueOf(AV81PrvNumTo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09L82_A396EmprCod[0] ;
         A783PrvCta = P09L82_A783PrvCta[0] ;
         n783PrvCta = P09L82_n783PrvCta[0] ;
         A798PrvPlaEnt = P09L82_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09L82_n798PrvPlaEnt[0] ;
         A801PrvRep = P09L82_A801PrvRep[0] ;
         n801PrvRep = P09L82_n801PrvRep[0] ;
         A797PrvPer = P09L82_A797PrvPer[0] ;
         n797PrvPer = P09L82_n797PrvPer[0] ;
         A785PrvDiaPag = P09L82_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09L82_n785PrvDiaPag[0] ;
         A805PrvVto = P09L82_A805PrvVto[0] ;
         n805PrvVto = P09L82_n805PrvVto[0] ;
         A498FpgDsc = P09L82_A498FpgDsc[0] ;
         n498FpgDsc = P09L82_n498FpgDsc[0] ;
         A497FpgCod = P09L82_A497FpgCod[0] ;
         n497FpgCod = P09L82_n497FpgCod[0] ;
         A6077PrvMail = P09L82_A6077PrvMail[0] ;
         n6077PrvMail = P09L82_n6077PrvMail[0] ;
         A6076PrvFax = P09L82_A6076PrvFax[0] ;
         n6076PrvFax = P09L82_n6076PrvFax[0] ;
         A804PrvTlx = P09L82_A804PrvTlx[0] ;
         n804PrvTlx = P09L82_n804PrvTlx[0] ;
         A803PrvTlf = P09L82_A803PrvTlf[0] ;
         n803PrvTlf = P09L82_n803PrvTlf[0] ;
         A793PrvNif = P09L82_A793PrvNif[0] ;
         n793PrvNif = P09L82_n793PrvNif[0] ;
         A6075PrvCp2 = P09L82_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09L82_n6075PrvCp2[0] ;
         A782PrvCpo = P09L82_A782PrvCpo[0] ;
         n782PrvCpo = P09L82_n782PrvCpo[0] ;
         A799PrvPob = P09L82_A799PrvPob[0] ;
         n799PrvPob = P09L82_n799PrvPob[0] ;
         A786PrvDir = P09L82_A786PrvDir[0] ;
         n786PrvDir = P09L82_n786PrvDir[0] ;
         A794PrvNom = P09L82_A794PrvNom[0] ;
         n794PrvNom = P09L82_n794PrvNom[0] ;
         A795PrvNum = P09L82_A795PrvNum[0] ;
         A792PrvMetTra = P09L82_A792PrvMetTra[0] ;
         n792PrvMetTra = P09L82_n792PrvMetTra[0] ;
         A498FpgDsc = P09L82_A498FpgDsc[0] ;
         n498FpgDsc = P09L82_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV13PrvMetTraDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A792PrvMetTra), "S") == 0 )
            {
               AV13PrvMetTraDescription = httpContext.getMessage( "Su Transporte", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A792PrvMetTra), "N") == 0 )
            {
               AV13PrvMetTraDescription = httpContext.getMessage( "Nuestro", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A792PrvMetTra), "A") == 0 )
            {
               AV13PrvMetTraDescription = httpContext.getMessage( "Agencia", "") ;
            }
            /* Execute user subroutine: 'BEFOREPRINTLINE' */
            S144 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
            h9L80( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 30, Gx_line+10, 64, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 68, Gx_line+10, 102, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A786PrvDir, "")), 106, Gx_line+10, 140, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A799PrvPob, "")), 144, Gx_line+10, 178, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A782PrvCpo, "")), 182, Gx_line+10, 216, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6075PrvCp2, "")), 220, Gx_line+10, 254, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A793PrvNif, "")), 258, Gx_line+10, 292, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A803PrvTlf, "")), 296, Gx_line+10, 330, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A804PrvTlx, "")), 334, Gx_line+10, 368, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6076PrvFax, "")), 372, Gx_line+10, 406, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6077PrvMail, "")), 410, Gx_line+10, 444, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A497FpgCod, "@!")), 448, Gx_line+10, 482, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A498FpgDsc, "")), 486, Gx_line+10, 520, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A805PrvVto), "Z9")), 524, Gx_line+10, 558, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A785PrvDiaPag), "ZZZZZ9")), 562, Gx_line+10, 596, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A797PrvPer), "ZZZZZ9")), 600, Gx_line+10, 634, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A801PrvRep, "")), 638, Gx_line+10, 672, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A798PrvPlaEnt), "ZZ9")), 676, Gx_line+10, 710, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13PrvMetTraDescription, "")), 714, Gx_line+10, 748, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A783PrvCta, "")), 752, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+36) ;
            /* Execute user subroutine: 'AFTERPRINTLINE' */
            S161 ();
            if ( returnInSub )
            {
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
      if ( GXutil.strcmp(AV14Session.getValue("StocksQuimicos.ListadodeProveedores_WCGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.ListadodeProveedores_WCGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("StocksQuimicos.ListadodeProveedores_WCGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV129GXV2 = 1 ;
      while ( AV129GXV2 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV129GXV2));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV18TFPrvNum = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFPrvNum_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV20TFPrvNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV21TFPrvNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR") == 0 )
         {
            AV22TFPrvDir = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR_SEL") == 0 )
         {
            AV23TFPrvDir_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB") == 0 )
         {
            AV24TFPrvPob = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB_SEL") == 0 )
         {
            AV25TFPrvPob_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO") == 0 )
         {
            AV26TFPrvCpo = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO_SEL") == 0 )
         {
            AV27TFPrvCpo_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCP2") == 0 )
         {
            AV28TFPrvCp2 = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCP2_SEL") == 0 )
         {
            AV29TFPrvCp2_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV30TFPrvNif = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV31TFPrvNif_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF") == 0 )
         {
            AV32TFPrvTlf = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF_SEL") == 0 )
         {
            AV33TFPrvTlf_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX") == 0 )
         {
            AV34TFPrvTlx = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX_SEL") == 0 )
         {
            AV35TFPrvTlx_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVFAX") == 0 )
         {
            AV36TFPrvFax = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVFAX_SEL") == 0 )
         {
            AV37TFPrvFax_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMAIL") == 0 )
         {
            AV38TFPrvMail = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMAIL_SEL") == 0 )
         {
            AV39TFPrvMail_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD") == 0 )
         {
            AV40TFFpgCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD_SEL") == 0 )
         {
            AV41TFFpgCod_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGDSC") == 0 )
         {
            AV42TFFpgDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGDSC_SEL") == 0 )
         {
            AV43TFFpgDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVVTO") == 0 )
         {
            AV44TFPrvVto = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFPrvVto_To = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIAPAG") == 0 )
         {
            AV46TFPrvDiaPag = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFPrvDiaPag_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPER") == 0 )
         {
            AV48TFPrvPer = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFPrvPer_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP") == 0 )
         {
            AV50TFPrvRep = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP_SEL") == 0 )
         {
            AV51TFPrvRep_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPLAENT") == 0 )
         {
            AV52TFPrvPlaEnt = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFPrvPlaEnt_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMETTRA_SEL") == 0 )
         {
            AV54TFPrvMetTra_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV56TFPrvMetTra_Sels.fromJSonString(AV54TFPrvMetTra_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA") == 0 )
         {
            AV58TFPrvCta = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA_SEL") == 0 )
         {
            AV59TFPrvCta_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV79Emprcod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUMFROM") == 0 )
         {
            AV80PrvNumFrom = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUMTO") == 0 )
         {
            AV81PrvNumTo = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV129GXV2 = (int)(AV129GXV2+1) ;
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

   public void h9L80( boolean bFoot ,
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
               AV75PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV72DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV77Title = AV84Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV77Title = "" ;
      AV12FilterFullText = "" ;
      AV60TFPrvNum_To_Description = "" ;
      AV21TFPrvNom_Sel = "" ;
      AV20TFPrvNom = "" ;
      AV23TFPrvDir_Sel = "" ;
      AV22TFPrvDir = "" ;
      AV25TFPrvPob_Sel = "" ;
      AV24TFPrvPob = "" ;
      AV27TFPrvCpo_Sel = "" ;
      AV26TFPrvCpo = "" ;
      AV29TFPrvCp2_Sel = "" ;
      AV28TFPrvCp2 = "" ;
      AV31TFPrvNif_Sel = "" ;
      AV30TFPrvNif = "" ;
      AV33TFPrvTlf_Sel = "" ;
      AV32TFPrvTlf = "" ;
      AV35TFPrvTlx_Sel = "" ;
      AV34TFPrvTlx = "" ;
      AV37TFPrvFax_Sel = "" ;
      AV36TFPrvFax = "" ;
      AV39TFPrvMail_Sel = "" ;
      AV38TFPrvMail = "" ;
      AV41TFFpgCod_Sel = "" ;
      AV40TFFpgCod = "" ;
      AV43TFFpgDsc_Sel = "" ;
      AV42TFFpgDsc = "" ;
      AV61TFPrvVto_To_Description = "" ;
      AV62TFPrvDiaPag_To_Description = "" ;
      AV63TFPrvPer_To_Description = "" ;
      AV51TFPrvRep_Sel = "" ;
      AV50TFPrvRep = "" ;
      AV64TFPrvPlaEnt_To_Description = "" ;
      AV56TFPrvMetTra_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV54TFPrvMetTra_SelsJson = "" ;
      AV57TFPrvMetTra_Sel = "" ;
      AV55TFPrvMetTra_SelDscs = "" ;
      AV65FilterTFPrvMetTra_SelValueDescription = "" ;
      AV59TFPrvCta_Sel = "" ;
      AV58TFPrvCta = "" ;
      A792PrvMetTra = "" ;
      A794PrvNom = "" ;
      A786PrvDir = "" ;
      A799PrvPob = "" ;
      A782PrvCpo = "" ;
      A6075PrvCp2 = "" ;
      A793PrvNif = "" ;
      A803PrvTlf = "" ;
      A804PrvTlx = "" ;
      A6076PrvFax = "" ;
      A6077PrvMail = "" ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      A801PrvRep = "" ;
      A783PrvCta = "" ;
      AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = "" ;
      AV92Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = "" ;
      AV93Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = "" ;
      AV94Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = "" ;
      AV95Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = "" ;
      AV96Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = "" ;
      AV97Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = "" ;
      AV98Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = "" ;
      AV99Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = "" ;
      AV100Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = "" ;
      AV101Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = "" ;
      AV102Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = "" ;
      AV103Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = "" ;
      AV104Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = "" ;
      AV105Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = "" ;
      AV106Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = "" ;
      AV107Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = "" ;
      AV108Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = "" ;
      AV109Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = "" ;
      AV110Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = "" ;
      AV111Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = "" ;
      AV112Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = "" ;
      AV113Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = "" ;
      AV114Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = "" ;
      AV115Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = "" ;
      AV122Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = "" ;
      AV123Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = "" ;
      AV126Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV127Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = "" ;
      AV128Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = "" ;
      lV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV92Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = "" ;
      lV94Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = "" ;
      lV96Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = "" ;
      lV98Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = "" ;
      lV100Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = "" ;
      lV102Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = "" ;
      lV104Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = "" ;
      lV106Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = "" ;
      lV108Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = "" ;
      lV110Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = "" ;
      lV112Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = "" ;
      lV114Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = "" ;
      lV122Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = "" ;
      lV127Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = "" ;
      AV79Emprcod = "" ;
      A396EmprCod = "" ;
      P09L82_A396EmprCod = new String[] {""} ;
      P09L82_A783PrvCta = new String[] {""} ;
      P09L82_n783PrvCta = new boolean[] {false} ;
      P09L82_A798PrvPlaEnt = new short[1] ;
      P09L82_n798PrvPlaEnt = new boolean[] {false} ;
      P09L82_A801PrvRep = new String[] {""} ;
      P09L82_n801PrvRep = new boolean[] {false} ;
      P09L82_A797PrvPer = new int[1] ;
      P09L82_n797PrvPer = new boolean[] {false} ;
      P09L82_A785PrvDiaPag = new int[1] ;
      P09L82_n785PrvDiaPag = new boolean[] {false} ;
      P09L82_A805PrvVto = new byte[1] ;
      P09L82_n805PrvVto = new boolean[] {false} ;
      P09L82_A498FpgDsc = new String[] {""} ;
      P09L82_n498FpgDsc = new boolean[] {false} ;
      P09L82_A497FpgCod = new String[] {""} ;
      P09L82_n497FpgCod = new boolean[] {false} ;
      P09L82_A6077PrvMail = new String[] {""} ;
      P09L82_n6077PrvMail = new boolean[] {false} ;
      P09L82_A6076PrvFax = new String[] {""} ;
      P09L82_n6076PrvFax = new boolean[] {false} ;
      P09L82_A804PrvTlx = new String[] {""} ;
      P09L82_n804PrvTlx = new boolean[] {false} ;
      P09L82_A803PrvTlf = new String[] {""} ;
      P09L82_n803PrvTlf = new boolean[] {false} ;
      P09L82_A793PrvNif = new String[] {""} ;
      P09L82_n793PrvNif = new boolean[] {false} ;
      P09L82_A6075PrvCp2 = new String[] {""} ;
      P09L82_n6075PrvCp2 = new boolean[] {false} ;
      P09L82_A782PrvCpo = new String[] {""} ;
      P09L82_n782PrvCpo = new boolean[] {false} ;
      P09L82_A799PrvPob = new String[] {""} ;
      P09L82_n799PrvPob = new boolean[] {false} ;
      P09L82_A786PrvDir = new String[] {""} ;
      P09L82_n786PrvDir = new boolean[] {false} ;
      P09L82_A794PrvNom = new String[] {""} ;
      P09L82_n794PrvNom = new boolean[] {false} ;
      P09L82_A795PrvNum = new int[1] ;
      P09L82_A792PrvMetTra = new String[] {""} ;
      P09L82_n792PrvMetTra = new boolean[] {false} ;
      AV13PrvMetTraDescription = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV75PageInfo = "" ;
      AV72DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV84Pgmdesc = "" ;
      AV70AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.listadodeproveedores_wcexportreport__default(),
         new Object[] {
             new Object[] {
            P09L82_A396EmprCod, P09L82_A783PrvCta, P09L82_n783PrvCta, P09L82_A798PrvPlaEnt, P09L82_n798PrvPlaEnt, P09L82_A801PrvRep, P09L82_n801PrvRep, P09L82_A797PrvPer, P09L82_n797PrvPer, P09L82_A785PrvDiaPag,
            P09L82_n785PrvDiaPag, P09L82_A805PrvVto, P09L82_n805PrvVto, P09L82_A498FpgDsc, P09L82_n498FpgDsc, P09L82_A497FpgCod, P09L82_n497FpgCod, P09L82_A6077PrvMail, P09L82_n6077PrvMail, P09L82_A6076PrvFax,
            P09L82_n6076PrvFax, P09L82_A804PrvTlx, P09L82_n804PrvTlx, P09L82_A803PrvTlf, P09L82_n803PrvTlf, P09L82_A793PrvNif, P09L82_n793PrvNif, P09L82_A6075PrvCp2, P09L82_n6075PrvCp2, P09L82_A782PrvCpo,
            P09L82_n782PrvCpo, P09L82_A799PrvPob, P09L82_n799PrvPob, P09L82_A786PrvDir, P09L82_n786PrvDir, P09L82_A794PrvNom, P09L82_n794PrvNom, P09L82_A795PrvNum, P09L82_A792PrvMetTra, P09L82_n792PrvMetTra
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV84Pgmdesc = httpContext.getMessage( "Listadode Proveedores_WCExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV84Pgmdesc = httpContext.getMessage( "Listadode Proveedores_WCExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV44TFPrvVto ;
   private byte AV45TFPrvVto_To ;
   private byte A805PrvVto ;
   private byte AV116Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ;
   private byte AV117Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ;
   private short gxcookieaux ;
   private short AV52TFPrvPlaEnt ;
   private short AV53TFPrvPlaEnt_To ;
   private short A798PrvPlaEnt ;
   private short AV124Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ;
   private short AV125Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ;
   private short AV80PrvNumFrom ;
   private short AV81PrvNumTo ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV18TFPrvNum ;
   private int AV19TFPrvNum_To ;
   private int AV46TFPrvDiaPag ;
   private int AV47TFPrvDiaPag_To ;
   private int AV48TFPrvPer ;
   private int AV49TFPrvPer_To ;
   private int AV87GXV1 ;
   private int A795PrvNum ;
   private int A785PrvDiaPag ;
   private int A797PrvPer ;
   private int AV90Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ;
   private int AV91Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ;
   private int AV118Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ;
   private int AV119Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ;
   private int AV120Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ;
   private int AV121Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ;
   private int AV126Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ;
   private int AV129GXV2 ;
   private long AV66i ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV21TFPrvNom_Sel ;
   private String AV20TFPrvNom ;
   private String AV23TFPrvDir_Sel ;
   private String AV22TFPrvDir ;
   private String AV25TFPrvPob_Sel ;
   private String AV24TFPrvPob ;
   private String AV27TFPrvCpo_Sel ;
   private String AV26TFPrvCpo ;
   private String AV29TFPrvCp2_Sel ;
   private String AV28TFPrvCp2 ;
   private String AV31TFPrvNif_Sel ;
   private String AV30TFPrvNif ;
   private String AV33TFPrvTlf_Sel ;
   private String AV32TFPrvTlf ;
   private String AV35TFPrvTlx_Sel ;
   private String AV34TFPrvTlx ;
   private String AV37TFPrvFax_Sel ;
   private String AV36TFPrvFax ;
   private String AV39TFPrvMail_Sel ;
   private String AV38TFPrvMail ;
   private String AV41TFFpgCod_Sel ;
   private String AV40TFFpgCod ;
   private String AV43TFFpgDsc_Sel ;
   private String AV42TFFpgDsc ;
   private String AV51TFPrvRep_Sel ;
   private String AV50TFPrvRep ;
   private String AV57TFPrvMetTra_Sel ;
   private String AV59TFPrvCta_Sel ;
   private String AV58TFPrvCta ;
   private String A792PrvMetTra ;
   private String A794PrvNom ;
   private String A786PrvDir ;
   private String A799PrvPob ;
   private String A782PrvCpo ;
   private String A6075PrvCp2 ;
   private String A793PrvNif ;
   private String A803PrvTlf ;
   private String A804PrvTlx ;
   private String A6076PrvFax ;
   private String A6077PrvMail ;
   private String A497FpgCod ;
   private String A498FpgDsc ;
   private String A801PrvRep ;
   private String A783PrvCta ;
   private String AV92Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ;
   private String AV93Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ;
   private String AV94Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ;
   private String AV95Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ;
   private String AV96Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ;
   private String AV97Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ;
   private String AV98Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ;
   private String AV99Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ;
   private String AV100Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ;
   private String AV101Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ;
   private String AV102Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ;
   private String AV103Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ;
   private String AV104Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ;
   private String AV105Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ;
   private String AV106Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ;
   private String AV107Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ;
   private String AV108Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ;
   private String AV109Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ;
   private String AV110Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ;
   private String AV111Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ;
   private String AV112Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ;
   private String AV113Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ;
   private String AV114Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ;
   private String AV115Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ;
   private String AV122Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ;
   private String AV123Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ;
   private String AV127Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ;
   private String AV128Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ;
   private String scmdbuf ;
   private String lV92Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ;
   private String lV94Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ;
   private String lV96Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ;
   private String lV98Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ;
   private String lV100Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ;
   private String lV102Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ;
   private String lV104Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ;
   private String lV106Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ;
   private String lV108Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ;
   private String lV110Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ;
   private String lV112Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ;
   private String lV114Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ;
   private String lV122Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ;
   private String lV127Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ;
   private String AV79Emprcod ;
   private String A396EmprCod ;
   private String AV84Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n783PrvCta ;
   private boolean n798PrvPlaEnt ;
   private boolean n801PrvRep ;
   private boolean n797PrvPer ;
   private boolean n785PrvDiaPag ;
   private boolean n805PrvVto ;
   private boolean n498FpgDsc ;
   private boolean n497FpgCod ;
   private boolean n6077PrvMail ;
   private boolean n6076PrvFax ;
   private boolean n804PrvTlx ;
   private boolean n803PrvTlf ;
   private boolean n793PrvNif ;
   private boolean n6075PrvCp2 ;
   private boolean n782PrvCpo ;
   private boolean n799PrvPob ;
   private boolean n786PrvDir ;
   private boolean n794PrvNom ;
   private boolean n792PrvMetTra ;
   private String AV54TFPrvMetTra_SelsJson ;
   private String AV77Title ;
   private String AV12FilterFullText ;
   private String AV60TFPrvNum_To_Description ;
   private String AV61TFPrvVto_To_Description ;
   private String AV62TFPrvDiaPag_To_Description ;
   private String AV63TFPrvPer_To_Description ;
   private String AV64TFPrvPlaEnt_To_Description ;
   private String AV55TFPrvMetTra_SelDscs ;
   private String AV65FilterTFPrvMetTra_SelValueDescription ;
   private String AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ;
   private String lV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ;
   private String AV13PrvMetTraDescription ;
   private String AV75PageInfo ;
   private String AV72DateInfo ;
   private String AV70AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private String[] P09L82_A396EmprCod ;
   private String[] P09L82_A783PrvCta ;
   private boolean[] P09L82_n783PrvCta ;
   private short[] P09L82_A798PrvPlaEnt ;
   private boolean[] P09L82_n798PrvPlaEnt ;
   private String[] P09L82_A801PrvRep ;
   private boolean[] P09L82_n801PrvRep ;
   private int[] P09L82_A797PrvPer ;
   private boolean[] P09L82_n797PrvPer ;
   private int[] P09L82_A785PrvDiaPag ;
   private boolean[] P09L82_n785PrvDiaPag ;
   private byte[] P09L82_A805PrvVto ;
   private boolean[] P09L82_n805PrvVto ;
   private String[] P09L82_A498FpgDsc ;
   private boolean[] P09L82_n498FpgDsc ;
   private String[] P09L82_A497FpgCod ;
   private boolean[] P09L82_n497FpgCod ;
   private String[] P09L82_A6077PrvMail ;
   private boolean[] P09L82_n6077PrvMail ;
   private String[] P09L82_A6076PrvFax ;
   private boolean[] P09L82_n6076PrvFax ;
   private String[] P09L82_A804PrvTlx ;
   private boolean[] P09L82_n804PrvTlx ;
   private String[] P09L82_A803PrvTlf ;
   private boolean[] P09L82_n803PrvTlf ;
   private String[] P09L82_A793PrvNif ;
   private boolean[] P09L82_n793PrvNif ;
   private String[] P09L82_A6075PrvCp2 ;
   private boolean[] P09L82_n6075PrvCp2 ;
   private String[] P09L82_A782PrvCpo ;
   private boolean[] P09L82_n782PrvCpo ;
   private String[] P09L82_A799PrvPob ;
   private boolean[] P09L82_n799PrvPob ;
   private String[] P09L82_A786PrvDir ;
   private boolean[] P09L82_n786PrvDir ;
   private String[] P09L82_A794PrvNom ;
   private boolean[] P09L82_n794PrvNom ;
   private int[] P09L82_A795PrvNum ;
   private String[] P09L82_A792PrvMetTra ;
   private boolean[] P09L82_n792PrvMetTra ;
   private GXSimpleCollection<String> AV56TFPrvMetTra_Sels ;
   private GXSimpleCollection<String> AV126Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class listadodeproveedores_wcexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09L82( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV126Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                          int AV90Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                          int AV91Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                          String AV93Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                          String AV92Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                          String AV95Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                          String AV94Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                          String AV97Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                          String AV96Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                          String AV99Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                          String AV98Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                          String AV101Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                          String AV100Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                          String AV103Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                          String AV102Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                          String AV105Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                          String AV104Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                          String AV107Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                          String AV106Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                          String AV109Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                          String AV108Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                          String AV111Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                          String AV110Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                          String AV113Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                          String AV112Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                          String AV115Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                          String AV114Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                          byte AV116Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                          byte AV117Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                          int AV118Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                          int AV119Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                          int AV120Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                          int AV121Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                          String AV123Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                          String AV122Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                          short AV124Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                          short AV125Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                          int AV126Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                          String AV128Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                          String AV127Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                          short AV80PrvNumFrom ,
                                          short AV81PrvNumTo ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A799PrvPob ,
                                          String A782PrvCpo ,
                                          String A6075PrvCp2 ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          String A804PrvTlx ,
                                          String A6076PrvFax ,
                                          String A6077PrvMail ,
                                          String A497FpgCod ,
                                          String A498FpgDsc ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV89Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                          String AV79Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[41];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvCta, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvMail, T1.PrvFax, T1.PrvTlx, T1.PrvTlf, T1.PrvNif," ;
      scmdbuf += " T1.PrvCp2, T1.PrvCpo, T1.PrvPob, T1.PrvDir, T1.PrvNom, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV90Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV91Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV104Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV106Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV108Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV112Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV116Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV117Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV118Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV119Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV120Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV121Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV122Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (0==AV124Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (0==AV125Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( AV126Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV126Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV128Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV127Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV80PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (0==AV81PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNom" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvDir" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvDir DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvPob" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvPob DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCpo" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCpo DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCp2" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCp2 DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNif" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNif DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvTlf" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvTlf DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvTlx" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvTlx DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvFax" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvFax DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvMail" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvMail DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FpgCod" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FpgCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.FpgDsc" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.FpgDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvVto" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvVto DESC" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvDiaPag" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvDiaPag DESC" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvPer" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvPer DESC" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvRep" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvRep DESC" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvPlaEnt" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvPlaEnt DESC" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvMetTra" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvMetTra DESC" ;
      }
      else if ( ( AV10OrderedBy == 20 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCta" ;
      }
      else if ( ( AV10OrderedBy == 20 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCta DESC" ;
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
                  return conditional_P09L82(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).shortValue() , ((Boolean) dynConstraints[63]).booleanValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09L82", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               return;
      }
   }

}

