package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprvgenwwexportreport_impl extends GXWebReport
{
   public tprvgenwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV90Title = httpContext.getMessage( "Lista de Mantenimiento de Proveedores", "") ;
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
         h8AK0( true, 0) ;
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
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV20TFPrvNum) && (0==AV21TFPrvNum_To) ) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20TFPrvNum), "ZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV70TFPrvNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70TFPrvNum_To_Description, "")), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFPrvNum_To), "ZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFPrvNom_Sel)==0) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFPrvNom_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV22TFPrvNom)==0) )
         {
            h8AK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFPrvNom, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV27TFPrvDir_Sel)==0) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Direccion", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFPrvDir_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV26TFPrvDir)==0) )
         {
            h8AK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Direccion", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFPrvDir, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV29TFPrvCpo_Sel)==0) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Postal", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFPrvCpo_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV28TFPrvCpo)==0) )
         {
            h8AK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo Postal", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFPrvCpo, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV31TFPrvPob_Sel)==0) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Poblacion", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFPrvPob_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV30TFPrvPob)==0) )
         {
            h8AK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Poblacion", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFPrvPob, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV33TFPrvNif_Sel)==0) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N.I.F.", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFPrvNif_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV32TFPrvNif)==0) )
         {
            h8AK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.I.F.", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFPrvNif, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV35TFPrvTlf_Sel)==0) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Telefonos", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFPrvTlf_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV34TFPrvTlf)==0) )
         {
            h8AK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Telefonos", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFPrvTlf, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (0==AV101TFPrvPri_Sel) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Prioridad", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV101TFPrvPri_Sel), "9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV39TFPrvTlx_Sel)==0) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Telex", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFPrvTlx_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV38TFPrvTlx)==0) )
         {
            h8AK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Telex", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFPrvTlx, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV104TFPrvTip_Sels.fromJSonString(AV102TFPrvTip_SelsJson, null);
      if ( ! ( AV104TFPrvTip_Sels.size() == 0 ) )
      {
         AV79i = 1 ;
         AV129GXV1 = 1 ;
         while ( AV129GXV1 <= AV104TFPrvTip_Sels.size() )
         {
            AV41TFPrvTip_Sel = (String)AV104TFPrvTip_Sels.elementAt(-1+AV129GXV1) ;
            if ( AV79i == 1 )
            {
               AV103TFPrvTip_SelDscs = "" ;
            }
            else
            {
               AV103TFPrvTip_SelDscs += ", " ;
            }
            AV105FilterTFPrvTip_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV41TFPrvTip_Sel), "P") == 0 )
            {
               AV105FilterTFPrvTip_SelValueDescription = httpContext.getMessage( "P", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV41TFPrvTip_Sel), "A") == 0 )
            {
               AV105FilterTFPrvTip_SelValueDescription = httpContext.getMessage( "A", "") ;
            }
            AV103TFPrvTip_SelDscs += AV105FilterTFPrvTip_SelValueDescription ;
            AV79i = (long)(AV79i+1) ;
            AV129GXV1 = (int)(AV129GXV1+1) ;
         }
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Proveedor o Acreador", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV103TFPrvTip_SelDscs, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFFpgCod_Sel)==0) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Forma de Pago", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFFpgCod_Sel, "@!")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV42TFFpgCod)==0) )
         {
            h8AK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Forma de Pago", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFFpgCod, "@!")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV46TFPrvVto) && (0==AV47TFPrvVto_To) ) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "No.Vencimientos", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46TFPrvVto), "Z9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV72TFPrvVto_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "No.Vencimientos", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72TFPrvVto_To_Description, "")), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47TFPrvVto_To), "Z9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV48TFPrvDiaPag) && (0==AV49TFPrvDiaPag_To) ) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Dias de Pago", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48TFPrvDiaPag), "ZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV73TFPrvDiaPag_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Dias de Pago", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73TFPrvDiaPag_To_Description, "")), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49TFPrvDiaPag_To), "ZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV50TFPrvPer) && (0==AV51TFPrvPer_To) ) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Periodicidad", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50TFPrvPer), "ZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV74TFPrvPer_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Periodicidad", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74TFPrvPer_To_Description, "")), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV51TFPrvPer_To), "ZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV52TFPrvBan) && (0==AV53TFPrvBan_To) ) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Banco", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52TFPrvBan), "ZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV75TFPrvBan_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo Banco", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75TFPrvBan_To_Description, "")), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV53TFPrvBan_To), "ZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV55TFPrvRep_Sel)==0) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Representante", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55TFPrvRep_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV54TFPrvRep)==0) )
         {
            h8AK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Representante", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54TFPrvRep, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV56TFPrvPlaEnt) && (0==AV57TFPrvPlaEnt_To) ) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Dias Plazo Entrega", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV56TFPrvPlaEnt), "ZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV76TFPrvPlaEnt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Dias Plazo Entrega", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76TFPrvPlaEnt_To_Description, "")), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV57TFPrvPlaEnt_To), "ZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV109TFPrvMetTra_Sels.fromJSonString(AV107TFPrvMetTra_SelsJson, null);
      if ( ! ( AV109TFPrvMetTra_Sels.size() == 0 ) )
      {
         AV79i = 1 ;
         AV130GXV2 = 1 ;
         while ( AV130GXV2 <= AV109TFPrvMetTra_Sels.size() )
         {
            AV59TFPrvMetTra_Sel = (String)AV109TFPrvMetTra_Sels.elementAt(-1+AV130GXV2) ;
            if ( AV79i == 1 )
            {
               AV108TFPrvMetTra_SelDscs = "" ;
            }
            else
            {
               AV108TFPrvMetTra_SelDscs += ", " ;
            }
            AV110FilterTFPrvMetTra_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV59TFPrvMetTra_Sel), "S") == 0 )
            {
               AV110FilterTFPrvMetTra_SelValueDescription = httpContext.getMessage( "Su Transporte", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV59TFPrvMetTra_Sel), "N") == 0 )
            {
               AV110FilterTFPrvMetTra_SelValueDescription = httpContext.getMessage( "Nuestro", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV59TFPrvMetTra_Sel), "A") == 0 )
            {
               AV110FilterTFPrvMetTra_SelValueDescription = httpContext.getMessage( "Agencia", "") ;
            }
            AV108TFPrvMetTra_SelDscs += AV110FilterTFPrvMetTra_SelValueDescription ;
            AV79i = (long)(AV79i+1) ;
            AV130GXV2 = (int)(AV130GXV2+1) ;
         }
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Metodo Transporte", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108TFPrvMetTra_SelDscs, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV61TFPrvCta_Sel)==0) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cuenta Contable", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFPrvCta_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV60TFPrvCta)==0) )
         {
            h8AK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cuenta Contable", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60TFPrvCta, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV64TFPrvDivCod_Sels.fromJSonString(AV62TFPrvDivCod_SelsJson, null);
      if ( ! ( AV64TFPrvDivCod_Sels.size() == 0 ) )
      {
         AV79i = 1 ;
         AV131GXV3 = 1 ;
         while ( AV131GXV3 <= AV64TFPrvDivCod_Sels.size() )
         {
            AV65TFPrvDivCod_Sel = (String)AV64TFPrvDivCod_Sels.elementAt(-1+AV131GXV3) ;
            if ( AV79i == 1 )
            {
               AV63TFPrvDivCod_SelDscs = "" ;
            }
            else
            {
               AV63TFPrvDivCod_SelDscs += ", " ;
            }
            AV77FilterTFPrvDivCod_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV65TFPrvDivCod_Sel), "E") == 0 )
            {
               AV77FilterTFPrvDivCod_SelValueDescription = httpContext.getMessage( "EURO", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV65TFPrvDivCod_Sel), "P") == 0 )
            {
               AV77FilterTFPrvDivCod_SelValueDescription = httpContext.getMessage( "PESETA", "") ;
            }
            AV63TFPrvDivCod_SelDscs += AV77FilterTFPrvDivCod_SelValueDescription ;
            AV79i = (long)(AV79i+1) ;
            AV131GXV3 = (int)(AV131GXV3+1) ;
         }
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Divisa Traspaso Contable", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63TFPrvDivCod_SelDscs, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV66TFPrvDivCo) && (0==AV67TFPrvDivCo_To) ) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Divisa", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV66TFPrvDivCo), "Z9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV78TFPrvDivCo_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Divisa", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78TFPrvDivCo_To_Description, "")), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV67TFPrvDivCo_To), "Z9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV123TFPrvAct_Sel)==0) )
      {
         h8AK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Activo?", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV123TFPrvAct_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8AK0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8AK0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 30, Gx_line+10, 60, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 64, Gx_line+10, 94, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Direccion", ""), 98, Gx_line+10, 128, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Postal", ""), 132, Gx_line+10, 162, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Poblacion", ""), 166, Gx_line+10, 196, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N.I.F.", ""), 200, Gx_line+10, 230, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Telefonos", ""), 234, Gx_line+10, 264, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Prioridad", ""), 268, Gx_line+10, 298, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Telex", ""), 302, Gx_line+10, 332, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Proveedor o Acreador", ""), 336, Gx_line+10, 366, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Forma de Pago", ""), 370, Gx_line+10, 400, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "No.Vencimientos", ""), 404, Gx_line+10, 434, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Dias de Pago", ""), 438, Gx_line+10, 469, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Periodicidad", ""), 473, Gx_line+10, 504, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Banco", ""), 508, Gx_line+10, 539, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Representante", ""), 543, Gx_line+10, 575, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Dias Plazo Entrega", ""), 579, Gx_line+10, 610, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Metodo Transporte", ""), 614, Gx_line+10, 646, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cuenta Contable", ""), 650, Gx_line+10, 681, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Divisa Traspaso Contable", ""), 685, Gx_line+10, 717, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Divisa", ""), 721, Gx_line+10, 752, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Activo?", ""), 756, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV133Tprvgenwwds_1_filterfulltext = AV12FilterFullText ;
      AV134Tprvgenwwds_2_tfprvnum = AV20TFPrvNum ;
      AV135Tprvgenwwds_3_tfprvnum_to = AV21TFPrvNum_To ;
      AV136Tprvgenwwds_4_tfprvnom = AV22TFPrvNom ;
      AV137Tprvgenwwds_5_tfprvnom_sel = AV23TFPrvNom_Sel ;
      AV138Tprvgenwwds_6_tfprvdir = AV26TFPrvDir ;
      AV139Tprvgenwwds_7_tfprvdir_sel = AV27TFPrvDir_Sel ;
      AV140Tprvgenwwds_8_tfprvcpo = AV28TFPrvCpo ;
      AV141Tprvgenwwds_9_tfprvcpo_sel = AV29TFPrvCpo_Sel ;
      AV142Tprvgenwwds_10_tfprvpob = AV30TFPrvPob ;
      AV143Tprvgenwwds_11_tfprvpob_sel = AV31TFPrvPob_Sel ;
      AV144Tprvgenwwds_12_tfprvnif = AV32TFPrvNif ;
      AV145Tprvgenwwds_13_tfprvnif_sel = AV33TFPrvNif_Sel ;
      AV146Tprvgenwwds_14_tfprvtlf = AV34TFPrvTlf ;
      AV147Tprvgenwwds_15_tfprvtlf_sel = AV35TFPrvTlf_Sel ;
      AV148Tprvgenwwds_16_tfprvpri_sel = AV101TFPrvPri_Sel ;
      AV149Tprvgenwwds_17_tfprvtlx = AV38TFPrvTlx ;
      AV150Tprvgenwwds_18_tfprvtlx_sel = AV39TFPrvTlx_Sel ;
      AV151Tprvgenwwds_19_tfprvtip_sels = AV104TFPrvTip_Sels ;
      AV152Tprvgenwwds_20_tffpgcod = AV42TFFpgCod ;
      AV153Tprvgenwwds_21_tffpgcod_sel = AV43TFFpgCod_Sel ;
      AV154Tprvgenwwds_22_tfprvvto = AV46TFPrvVto ;
      AV155Tprvgenwwds_23_tfprvvto_to = AV47TFPrvVto_To ;
      AV156Tprvgenwwds_24_tfprvdiapag = AV48TFPrvDiaPag ;
      AV157Tprvgenwwds_25_tfprvdiapag_to = AV49TFPrvDiaPag_To ;
      AV158Tprvgenwwds_26_tfprvper = AV50TFPrvPer ;
      AV159Tprvgenwwds_27_tfprvper_to = AV51TFPrvPer_To ;
      AV160Tprvgenwwds_28_tfprvban = AV52TFPrvBan ;
      AV161Tprvgenwwds_29_tfprvban_to = AV53TFPrvBan_To ;
      AV162Tprvgenwwds_30_tfprvrep = AV54TFPrvRep ;
      AV163Tprvgenwwds_31_tfprvrep_sel = AV55TFPrvRep_Sel ;
      AV164Tprvgenwwds_32_tfprvplaent = AV56TFPrvPlaEnt ;
      AV165Tprvgenwwds_33_tfprvplaent_to = AV57TFPrvPlaEnt_To ;
      AV166Tprvgenwwds_34_tfprvmettra_sels = AV109TFPrvMetTra_Sels ;
      AV167Tprvgenwwds_35_tfprvcta = AV60TFPrvCta ;
      AV168Tprvgenwwds_36_tfprvcta_sel = AV61TFPrvCta_Sel ;
      AV169Tprvgenwwds_37_tfprvdivcod_sels = AV64TFPrvDivCod_Sels ;
      AV170Tprvgenwwds_38_tfprvdivco = AV66TFPrvDivCo ;
      AV171Tprvgenwwds_39_tfprvdivco_to = AV67TFPrvDivCo_To ;
      AV172Tprvgenwwds_40_tfprvact_sel = AV123TFPrvAct_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A802PrvTip ,
                                           AV151Tprvgenwwds_19_tfprvtip_sels ,
                                           A792PrvMetTra ,
                                           AV166Tprvgenwwds_34_tfprvmettra_sels ,
                                           A3092PrvDivCod ,
                                           AV169Tprvgenwwds_37_tfprvdivcod_sels ,
                                           Integer.valueOf(AV134Tprvgenwwds_2_tfprvnum) ,
                                           Integer.valueOf(AV135Tprvgenwwds_3_tfprvnum_to) ,
                                           AV137Tprvgenwwds_5_tfprvnom_sel ,
                                           AV136Tprvgenwwds_4_tfprvnom ,
                                           AV139Tprvgenwwds_7_tfprvdir_sel ,
                                           AV138Tprvgenwwds_6_tfprvdir ,
                                           AV141Tprvgenwwds_9_tfprvcpo_sel ,
                                           AV140Tprvgenwwds_8_tfprvcpo ,
                                           AV143Tprvgenwwds_11_tfprvpob_sel ,
                                           AV142Tprvgenwwds_10_tfprvpob ,
                                           AV145Tprvgenwwds_13_tfprvnif_sel ,
                                           AV144Tprvgenwwds_12_tfprvnif ,
                                           AV147Tprvgenwwds_15_tfprvtlf_sel ,
                                           AV146Tprvgenwwds_14_tfprvtlf ,
                                           Byte.valueOf(AV148Tprvgenwwds_16_tfprvpri_sel) ,
                                           AV150Tprvgenwwds_18_tfprvtlx_sel ,
                                           AV149Tprvgenwwds_17_tfprvtlx ,
                                           Integer.valueOf(AV151Tprvgenwwds_19_tfprvtip_sels.size()) ,
                                           AV153Tprvgenwwds_21_tffpgcod_sel ,
                                           AV152Tprvgenwwds_20_tffpgcod ,
                                           Byte.valueOf(AV154Tprvgenwwds_22_tfprvvto) ,
                                           Byte.valueOf(AV155Tprvgenwwds_23_tfprvvto_to) ,
                                           Integer.valueOf(AV156Tprvgenwwds_24_tfprvdiapag) ,
                                           Integer.valueOf(AV157Tprvgenwwds_25_tfprvdiapag_to) ,
                                           Integer.valueOf(AV158Tprvgenwwds_26_tfprvper) ,
                                           Integer.valueOf(AV159Tprvgenwwds_27_tfprvper_to) ,
                                           Integer.valueOf(AV160Tprvgenwwds_28_tfprvban) ,
                                           Integer.valueOf(AV161Tprvgenwwds_29_tfprvban_to) ,
                                           AV163Tprvgenwwds_31_tfprvrep_sel ,
                                           AV162Tprvgenwwds_30_tfprvrep ,
                                           Short.valueOf(AV164Tprvgenwwds_32_tfprvplaent) ,
                                           Short.valueOf(AV165Tprvgenwwds_33_tfprvplaent_to) ,
                                           Integer.valueOf(AV166Tprvgenwwds_34_tfprvmettra_sels.size()) ,
                                           AV168Tprvgenwwds_36_tfprvcta_sel ,
                                           AV167Tprvgenwwds_35_tfprvcta ,
                                           Integer.valueOf(AV169Tprvgenwwds_37_tfprvdivcod_sels.size()) ,
                                           Byte.valueOf(AV170Tprvgenwwds_38_tfprvdivco) ,
                                           Byte.valueOf(AV171Tprvgenwwds_39_tfprvdivco_to) ,
                                           AV172Tprvgenwwds_40_tfprvact_sel ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A782PrvCpo ,
                                           A799PrvPob ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           Byte.valueOf(A800PrvPri) ,
                                           A804PrvTlx ,
                                           A497FpgCod ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           Integer.valueOf(A780PrvBan) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Byte.valueOf(A3143PrvDivCo) ,
                                           A14216PrvAct ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV133Tprvgenwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV136Tprvgenwwds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV136Tprvgenwwds_4_tfprvnom), 30, "%") ;
      lV138Tprvgenwwds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV138Tprvgenwwds_6_tfprvdir), 30, "%") ;
      lV140Tprvgenwwds_8_tfprvcpo = GXutil.padr( GXutil.rtrim( AV140Tprvgenwwds_8_tfprvcpo), 6, "%") ;
      lV142Tprvgenwwds_10_tfprvpob = GXutil.padr( GXutil.rtrim( AV142Tprvgenwwds_10_tfprvpob), 30, "%") ;
      lV144Tprvgenwwds_12_tfprvnif = GXutil.padr( GXutil.rtrim( AV144Tprvgenwwds_12_tfprvnif), 20, "%") ;
      lV146Tprvgenwwds_14_tfprvtlf = GXutil.padr( GXutil.rtrim( AV146Tprvgenwwds_14_tfprvtlf), 18, "%") ;
      lV149Tprvgenwwds_17_tfprvtlx = GXutil.padr( GXutil.rtrim( AV149Tprvgenwwds_17_tfprvtlx), 14, "%") ;
      lV152Tprvgenwwds_20_tffpgcod = GXutil.padr( GXutil.rtrim( AV152Tprvgenwwds_20_tffpgcod), 2, "%") ;
      lV162Tprvgenwwds_30_tfprvrep = GXutil.padr( GXutil.rtrim( AV162Tprvgenwwds_30_tfprvrep), 20, "%") ;
      lV167Tprvgenwwds_35_tfprvcta = GXutil.padr( GXutil.rtrim( AV167Tprvgenwwds_35_tfprvcta), 12, "%") ;
      /* Using cursor P08AK2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV134Tprvgenwwds_2_tfprvnum), Integer.valueOf(AV135Tprvgenwwds_3_tfprvnum_to), lV136Tprvgenwwds_4_tfprvnom, AV137Tprvgenwwds_5_tfprvnom_sel, lV138Tprvgenwwds_6_tfprvdir, AV139Tprvgenwwds_7_tfprvdir_sel, lV140Tprvgenwwds_8_tfprvcpo, AV141Tprvgenwwds_9_tfprvcpo_sel, lV142Tprvgenwwds_10_tfprvpob, AV143Tprvgenwwds_11_tfprvpob_sel, lV144Tprvgenwwds_12_tfprvnif, AV145Tprvgenwwds_13_tfprvnif_sel, lV146Tprvgenwwds_14_tfprvtlf, AV147Tprvgenwwds_15_tfprvtlf_sel, lV149Tprvgenwwds_17_tfprvtlx, AV150Tprvgenwwds_18_tfprvtlx_sel, lV152Tprvgenwwds_20_tffpgcod, AV153Tprvgenwwds_21_tffpgcod_sel, Byte.valueOf(AV154Tprvgenwwds_22_tfprvvto), Byte.valueOf(AV155Tprvgenwwds_23_tfprvvto_to), Integer.valueOf(AV156Tprvgenwwds_24_tfprvdiapag), Integer.valueOf(AV157Tprvgenwwds_25_tfprvdiapag_to), Integer.valueOf(AV158Tprvgenwwds_26_tfprvper), Integer.valueOf(AV159Tprvgenwwds_27_tfprvper_to), Integer.valueOf(AV160Tprvgenwwds_28_tfprvban), Integer.valueOf(AV161Tprvgenwwds_29_tfprvban_to), lV162Tprvgenwwds_30_tfprvrep, AV163Tprvgenwwds_31_tfprvrep_sel, Short.valueOf(AV164Tprvgenwwds_32_tfprvplaent), Short.valueOf(AV165Tprvgenwwds_33_tfprvplaent_to), lV167Tprvgenwwds_35_tfprvcta, AV168Tprvgenwwds_36_tfprvcta_sel, Byte.valueOf(AV170Tprvgenwwds_38_tfprvdivco), Byte.valueOf(AV171Tprvgenwwds_39_tfprvdivco_to), AV172Tprvgenwwds_40_tfprvact_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14216PrvAct = P08AK2_A14216PrvAct[0] ;
         A3143PrvDivCo = P08AK2_A3143PrvDivCo[0] ;
         A783PrvCta = P08AK2_A783PrvCta[0] ;
         n783PrvCta = P08AK2_n783PrvCta[0] ;
         A798PrvPlaEnt = P08AK2_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P08AK2_n798PrvPlaEnt[0] ;
         A801PrvRep = P08AK2_A801PrvRep[0] ;
         n801PrvRep = P08AK2_n801PrvRep[0] ;
         A780PrvBan = P08AK2_A780PrvBan[0] ;
         n780PrvBan = P08AK2_n780PrvBan[0] ;
         A797PrvPer = P08AK2_A797PrvPer[0] ;
         n797PrvPer = P08AK2_n797PrvPer[0] ;
         A785PrvDiaPag = P08AK2_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P08AK2_n785PrvDiaPag[0] ;
         A805PrvVto = P08AK2_A805PrvVto[0] ;
         n805PrvVto = P08AK2_n805PrvVto[0] ;
         A497FpgCod = P08AK2_A497FpgCod[0] ;
         n497FpgCod = P08AK2_n497FpgCod[0] ;
         A804PrvTlx = P08AK2_A804PrvTlx[0] ;
         n804PrvTlx = P08AK2_n804PrvTlx[0] ;
         A800PrvPri = P08AK2_A800PrvPri[0] ;
         n800PrvPri = P08AK2_n800PrvPri[0] ;
         A803PrvTlf = P08AK2_A803PrvTlf[0] ;
         n803PrvTlf = P08AK2_n803PrvTlf[0] ;
         A793PrvNif = P08AK2_A793PrvNif[0] ;
         n793PrvNif = P08AK2_n793PrvNif[0] ;
         A799PrvPob = P08AK2_A799PrvPob[0] ;
         n799PrvPob = P08AK2_n799PrvPob[0] ;
         A782PrvCpo = P08AK2_A782PrvCpo[0] ;
         n782PrvCpo = P08AK2_n782PrvCpo[0] ;
         A786PrvDir = P08AK2_A786PrvDir[0] ;
         n786PrvDir = P08AK2_n786PrvDir[0] ;
         A794PrvNom = P08AK2_A794PrvNom[0] ;
         n794PrvNom = P08AK2_n794PrvNom[0] ;
         A795PrvNum = P08AK2_A795PrvNum[0] ;
         A3092PrvDivCod = P08AK2_A3092PrvDivCod[0] ;
         n3092PrvDivCod = P08AK2_n3092PrvDivCod[0] ;
         A792PrvMetTra = P08AK2_A792PrvMetTra[0] ;
         n792PrvMetTra = P08AK2_n792PrvMetTra[0] ;
         A802PrvTip = P08AK2_A802PrvTip[0] ;
         n802PrvTip = P08AK2_n802PrvTip[0] ;
         A396EmprCod = P08AK2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV133Tprvgenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV133Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "p", ""), "") , GXutil.padr( "%" + GXutil.lower( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a", ""), "") , GXutil.padr( "%" + GXutil.lower( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV133Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV133Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV133Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A780PrvBan, 6, 0) , GXutil.padr( "%" + AV133Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV133Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV133Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3143PrvDivCo, 2, 0) , GXutil.padr( "%" + AV133Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV100PrvTipDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A802PrvTip), "P") == 0 )
            {
               AV100PrvTipDescription = httpContext.getMessage( "P", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A802PrvTip), "A") == 0 )
            {
               AV100PrvTipDescription = httpContext.getMessage( "A", "") ;
            }
            AV106PrvMetTraDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A792PrvMetTra), "S") == 0 )
            {
               AV106PrvMetTraDescription = httpContext.getMessage( "Su Transporte", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A792PrvMetTra), "N") == 0 )
            {
               AV106PrvMetTraDescription = httpContext.getMessage( "Nuestro", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A792PrvMetTra), "A") == 0 )
            {
               AV106PrvMetTraDescription = httpContext.getMessage( "Agencia", "") ;
            }
            AV13PrvDivCodDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A3092PrvDivCod), "E") == 0 )
            {
               AV13PrvDivCodDescription = httpContext.getMessage( "EURO", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A3092PrvDivCod), "P") == 0 )
            {
               AV13PrvDivCodDescription = httpContext.getMessage( "PESETA", "") ;
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
            h8AK0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 30, Gx_line+10, 60, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 64, Gx_line+10, 94, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A786PrvDir, "")), 98, Gx_line+10, 128, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A782PrvCpo, "")), 132, Gx_line+10, 162, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A799PrvPob, "")), 166, Gx_line+10, 196, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A793PrvNif, "")), 200, Gx_line+10, 230, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A803PrvTlf, "")), 234, Gx_line+10, 264, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A800PrvPri), "9")), 268, Gx_line+10, 298, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A804PrvTlx, "")), 302, Gx_line+10, 332, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100PrvTipDescription, "")), 336, Gx_line+10, 366, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A497FpgCod, "@!")), 370, Gx_line+10, 400, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A805PrvVto), "Z9")), 404, Gx_line+10, 434, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A785PrvDiaPag), "ZZZZZ9")), 438, Gx_line+10, 469, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A797PrvPer), "ZZZZZ9")), 473, Gx_line+10, 504, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A780PrvBan), "ZZZZZ9")), 508, Gx_line+10, 539, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A801PrvRep, "")), 543, Gx_line+10, 575, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A798PrvPlaEnt), "ZZ9")), 579, Gx_line+10, 610, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106PrvMetTraDescription, "")), 614, Gx_line+10, 646, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A783PrvCta, "")), 650, Gx_line+10, 681, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13PrvDivCodDescription, "")), 685, Gx_line+10, 717, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3143PrvDivCo), "Z9")), 721, Gx_line+10, 752, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14216PrvAct, "")), 756, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV14Session.getValue("TPRVGENWWGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPRVGENWWGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("TPRVGENWWGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV173GXV4 = 1 ;
      while ( AV173GXV4 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV173GXV4));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV20TFPrvNum = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFPrvNum_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV22TFPrvNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV23TFPrvNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR") == 0 )
         {
            AV26TFPrvDir = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR_SEL") == 0 )
         {
            AV27TFPrvDir_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO") == 0 )
         {
            AV28TFPrvCpo = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO_SEL") == 0 )
         {
            AV29TFPrvCpo_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB") == 0 )
         {
            AV30TFPrvPob = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB_SEL") == 0 )
         {
            AV31TFPrvPob_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV32TFPrvNif = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV33TFPrvNif_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF") == 0 )
         {
            AV34TFPrvTlf = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF_SEL") == 0 )
         {
            AV35TFPrvTlf_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPRI_SEL") == 0 )
         {
            AV101TFPrvPri_Sel = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX") == 0 )
         {
            AV38TFPrvTlx = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX_SEL") == 0 )
         {
            AV39TFPrvTlx_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTIP_SEL") == 0 )
         {
            AV102TFPrvTip_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV104TFPrvTip_Sels.fromJSonString(AV102TFPrvTip_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD") == 0 )
         {
            AV42TFFpgCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD_SEL") == 0 )
         {
            AV43TFFpgCod_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVVTO") == 0 )
         {
            AV46TFPrvVto = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFPrvVto_To = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIAPAG") == 0 )
         {
            AV48TFPrvDiaPag = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFPrvDiaPag_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPER") == 0 )
         {
            AV50TFPrvPer = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFPrvPer_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVBAN") == 0 )
         {
            AV52TFPrvBan = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFPrvBan_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP") == 0 )
         {
            AV54TFPrvRep = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP_SEL") == 0 )
         {
            AV55TFPrvRep_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPLAENT") == 0 )
         {
            AV56TFPrvPlaEnt = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFPrvPlaEnt_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMETTRA_SEL") == 0 )
         {
            AV107TFPrvMetTra_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV109TFPrvMetTra_Sels.fromJSonString(AV107TFPrvMetTra_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA") == 0 )
         {
            AV60TFPrvCta = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA_SEL") == 0 )
         {
            AV61TFPrvCta_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIVCOD_SEL") == 0 )
         {
            AV62TFPrvDivCod_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV64TFPrvDivCod_Sels.fromJSonString(AV62TFPrvDivCod_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIVCO") == 0 )
         {
            AV66TFPrvDivCo = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV67TFPrvDivCo_To = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVACT_SEL") == 0 )
         {
            AV123TFPrvAct_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV173GXV4 = (int)(AV173GXV4+1) ;
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

   public void h8AK0( boolean bFoot ,
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
               AV88PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV85DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV90Title = AV126Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV90Title = "" ;
      AV12FilterFullText = "" ;
      AV70TFPrvNum_To_Description = "" ;
      AV23TFPrvNom_Sel = "" ;
      AV22TFPrvNom = "" ;
      AV27TFPrvDir_Sel = "" ;
      AV26TFPrvDir = "" ;
      AV29TFPrvCpo_Sel = "" ;
      AV28TFPrvCpo = "" ;
      AV31TFPrvPob_Sel = "" ;
      AV30TFPrvPob = "" ;
      AV33TFPrvNif_Sel = "" ;
      AV32TFPrvNif = "" ;
      AV35TFPrvTlf_Sel = "" ;
      AV34TFPrvTlf = "" ;
      AV39TFPrvTlx_Sel = "" ;
      AV38TFPrvTlx = "" ;
      AV104TFPrvTip_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV102TFPrvTip_SelsJson = "" ;
      AV41TFPrvTip_Sel = "" ;
      AV103TFPrvTip_SelDscs = "" ;
      AV105FilterTFPrvTip_SelValueDescription = "" ;
      AV43TFFpgCod_Sel = "" ;
      AV42TFFpgCod = "" ;
      AV72TFPrvVto_To_Description = "" ;
      AV73TFPrvDiaPag_To_Description = "" ;
      AV74TFPrvPer_To_Description = "" ;
      AV75TFPrvBan_To_Description = "" ;
      AV55TFPrvRep_Sel = "" ;
      AV54TFPrvRep = "" ;
      AV76TFPrvPlaEnt_To_Description = "" ;
      AV109TFPrvMetTra_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV107TFPrvMetTra_SelsJson = "" ;
      AV59TFPrvMetTra_Sel = "" ;
      AV108TFPrvMetTra_SelDscs = "" ;
      AV110FilterTFPrvMetTra_SelValueDescription = "" ;
      AV61TFPrvCta_Sel = "" ;
      AV60TFPrvCta = "" ;
      AV64TFPrvDivCod_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV62TFPrvDivCod_SelsJson = "" ;
      AV65TFPrvDivCod_Sel = "" ;
      AV63TFPrvDivCod_SelDscs = "" ;
      AV77FilterTFPrvDivCod_SelValueDescription = "" ;
      AV78TFPrvDivCo_To_Description = "" ;
      AV123TFPrvAct_Sel = "" ;
      A802PrvTip = "" ;
      A792PrvMetTra = "" ;
      A3092PrvDivCod = "" ;
      A794PrvNom = "" ;
      A786PrvDir = "" ;
      A782PrvCpo = "" ;
      A799PrvPob = "" ;
      A793PrvNif = "" ;
      A803PrvTlf = "" ;
      A804PrvTlx = "" ;
      A497FpgCod = "" ;
      A801PrvRep = "" ;
      A783PrvCta = "" ;
      A14216PrvAct = "" ;
      AV133Tprvgenwwds_1_filterfulltext = "" ;
      AV136Tprvgenwwds_4_tfprvnom = "" ;
      AV137Tprvgenwwds_5_tfprvnom_sel = "" ;
      AV138Tprvgenwwds_6_tfprvdir = "" ;
      AV139Tprvgenwwds_7_tfprvdir_sel = "" ;
      AV140Tprvgenwwds_8_tfprvcpo = "" ;
      AV141Tprvgenwwds_9_tfprvcpo_sel = "" ;
      AV142Tprvgenwwds_10_tfprvpob = "" ;
      AV143Tprvgenwwds_11_tfprvpob_sel = "" ;
      AV144Tprvgenwwds_12_tfprvnif = "" ;
      AV145Tprvgenwwds_13_tfprvnif_sel = "" ;
      AV146Tprvgenwwds_14_tfprvtlf = "" ;
      AV147Tprvgenwwds_15_tfprvtlf_sel = "" ;
      AV149Tprvgenwwds_17_tfprvtlx = "" ;
      AV150Tprvgenwwds_18_tfprvtlx_sel = "" ;
      AV151Tprvgenwwds_19_tfprvtip_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV152Tprvgenwwds_20_tffpgcod = "" ;
      AV153Tprvgenwwds_21_tffpgcod_sel = "" ;
      AV162Tprvgenwwds_30_tfprvrep = "" ;
      AV163Tprvgenwwds_31_tfprvrep_sel = "" ;
      AV166Tprvgenwwds_34_tfprvmettra_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV167Tprvgenwwds_35_tfprvcta = "" ;
      AV168Tprvgenwwds_36_tfprvcta_sel = "" ;
      AV169Tprvgenwwds_37_tfprvdivcod_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV172Tprvgenwwds_40_tfprvact_sel = "" ;
      lV133Tprvgenwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV136Tprvgenwwds_4_tfprvnom = "" ;
      lV138Tprvgenwwds_6_tfprvdir = "" ;
      lV140Tprvgenwwds_8_tfprvcpo = "" ;
      lV142Tprvgenwwds_10_tfprvpob = "" ;
      lV144Tprvgenwwds_12_tfprvnif = "" ;
      lV146Tprvgenwwds_14_tfprvtlf = "" ;
      lV149Tprvgenwwds_17_tfprvtlx = "" ;
      lV152Tprvgenwwds_20_tffpgcod = "" ;
      lV162Tprvgenwwds_30_tfprvrep = "" ;
      lV167Tprvgenwwds_35_tfprvcta = "" ;
      P08AK2_A14216PrvAct = new String[] {""} ;
      P08AK2_A3143PrvDivCo = new byte[1] ;
      P08AK2_A783PrvCta = new String[] {""} ;
      P08AK2_n783PrvCta = new boolean[] {false} ;
      P08AK2_A798PrvPlaEnt = new short[1] ;
      P08AK2_n798PrvPlaEnt = new boolean[] {false} ;
      P08AK2_A801PrvRep = new String[] {""} ;
      P08AK2_n801PrvRep = new boolean[] {false} ;
      P08AK2_A780PrvBan = new int[1] ;
      P08AK2_n780PrvBan = new boolean[] {false} ;
      P08AK2_A797PrvPer = new int[1] ;
      P08AK2_n797PrvPer = new boolean[] {false} ;
      P08AK2_A785PrvDiaPag = new int[1] ;
      P08AK2_n785PrvDiaPag = new boolean[] {false} ;
      P08AK2_A805PrvVto = new byte[1] ;
      P08AK2_n805PrvVto = new boolean[] {false} ;
      P08AK2_A497FpgCod = new String[] {""} ;
      P08AK2_n497FpgCod = new boolean[] {false} ;
      P08AK2_A804PrvTlx = new String[] {""} ;
      P08AK2_n804PrvTlx = new boolean[] {false} ;
      P08AK2_A800PrvPri = new byte[1] ;
      P08AK2_n800PrvPri = new boolean[] {false} ;
      P08AK2_A803PrvTlf = new String[] {""} ;
      P08AK2_n803PrvTlf = new boolean[] {false} ;
      P08AK2_A793PrvNif = new String[] {""} ;
      P08AK2_n793PrvNif = new boolean[] {false} ;
      P08AK2_A799PrvPob = new String[] {""} ;
      P08AK2_n799PrvPob = new boolean[] {false} ;
      P08AK2_A782PrvCpo = new String[] {""} ;
      P08AK2_n782PrvCpo = new boolean[] {false} ;
      P08AK2_A786PrvDir = new String[] {""} ;
      P08AK2_n786PrvDir = new boolean[] {false} ;
      P08AK2_A794PrvNom = new String[] {""} ;
      P08AK2_n794PrvNom = new boolean[] {false} ;
      P08AK2_A795PrvNum = new int[1] ;
      P08AK2_A3092PrvDivCod = new String[] {""} ;
      P08AK2_n3092PrvDivCod = new boolean[] {false} ;
      P08AK2_A792PrvMetTra = new String[] {""} ;
      P08AK2_n792PrvMetTra = new boolean[] {false} ;
      P08AK2_A802PrvTip = new String[] {""} ;
      P08AK2_n802PrvTip = new boolean[] {false} ;
      P08AK2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV100PrvTipDescription = "" ;
      AV106PrvMetTraDescription = "" ;
      AV13PrvDivCodDescription = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV88PageInfo = "" ;
      AV85DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV126Pgmdesc = "" ;
      AV83AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprvgenwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08AK2_A14216PrvAct, P08AK2_A3143PrvDivCo, P08AK2_A783PrvCta, P08AK2_n783PrvCta, P08AK2_A798PrvPlaEnt, P08AK2_n798PrvPlaEnt, P08AK2_A801PrvRep, P08AK2_n801PrvRep, P08AK2_A780PrvBan, P08AK2_n780PrvBan,
            P08AK2_A797PrvPer, P08AK2_n797PrvPer, P08AK2_A785PrvDiaPag, P08AK2_n785PrvDiaPag, P08AK2_A805PrvVto, P08AK2_n805PrvVto, P08AK2_A497FpgCod, P08AK2_n497FpgCod, P08AK2_A804PrvTlx, P08AK2_n804PrvTlx,
            P08AK2_A800PrvPri, P08AK2_n800PrvPri, P08AK2_A803PrvTlf, P08AK2_n803PrvTlf, P08AK2_A793PrvNif, P08AK2_n793PrvNif, P08AK2_A799PrvPob, P08AK2_n799PrvPob, P08AK2_A782PrvCpo, P08AK2_n782PrvCpo,
            P08AK2_A786PrvDir, P08AK2_n786PrvDir, P08AK2_A794PrvNom, P08AK2_n794PrvNom, P08AK2_A795PrvNum, P08AK2_A3092PrvDivCod, P08AK2_n3092PrvDivCod, P08AK2_A792PrvMetTra, P08AK2_n792PrvMetTra, P08AK2_A802PrvTip,
            P08AK2_n802PrvTip, P08AK2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV126Pgmdesc = httpContext.getMessage( "TPRVGENWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV126Pgmdesc = httpContext.getMessage( "TPRVGENWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV101TFPrvPri_Sel ;
   private byte AV46TFPrvVto ;
   private byte AV47TFPrvVto_To ;
   private byte AV66TFPrvDivCo ;
   private byte AV67TFPrvDivCo_To ;
   private byte A800PrvPri ;
   private byte A805PrvVto ;
   private byte A3143PrvDivCo ;
   private byte AV148Tprvgenwwds_16_tfprvpri_sel ;
   private byte AV154Tprvgenwwds_22_tfprvvto ;
   private byte AV155Tprvgenwwds_23_tfprvvto_to ;
   private byte AV170Tprvgenwwds_38_tfprvdivco ;
   private byte AV171Tprvgenwwds_39_tfprvdivco_to ;
   private short gxcookieaux ;
   private short AV56TFPrvPlaEnt ;
   private short AV57TFPrvPlaEnt_To ;
   private short A798PrvPlaEnt ;
   private short AV164Tprvgenwwds_32_tfprvplaent ;
   private short AV165Tprvgenwwds_33_tfprvplaent_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV20TFPrvNum ;
   private int AV21TFPrvNum_To ;
   private int AV129GXV1 ;
   private int AV48TFPrvDiaPag ;
   private int AV49TFPrvDiaPag_To ;
   private int AV50TFPrvPer ;
   private int AV51TFPrvPer_To ;
   private int AV52TFPrvBan ;
   private int AV53TFPrvBan_To ;
   private int AV130GXV2 ;
   private int AV131GXV3 ;
   private int A795PrvNum ;
   private int A785PrvDiaPag ;
   private int A797PrvPer ;
   private int A780PrvBan ;
   private int AV134Tprvgenwwds_2_tfprvnum ;
   private int AV135Tprvgenwwds_3_tfprvnum_to ;
   private int AV156Tprvgenwwds_24_tfprvdiapag ;
   private int AV157Tprvgenwwds_25_tfprvdiapag_to ;
   private int AV158Tprvgenwwds_26_tfprvper ;
   private int AV159Tprvgenwwds_27_tfprvper_to ;
   private int AV160Tprvgenwwds_28_tfprvban ;
   private int AV161Tprvgenwwds_29_tfprvban_to ;
   private int AV151Tprvgenwwds_19_tfprvtip_sels_size ;
   private int AV166Tprvgenwwds_34_tfprvmettra_sels_size ;
   private int AV169Tprvgenwwds_37_tfprvdivcod_sels_size ;
   private int AV173GXV4 ;
   private long AV79i ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV23TFPrvNom_Sel ;
   private String AV22TFPrvNom ;
   private String AV27TFPrvDir_Sel ;
   private String AV26TFPrvDir ;
   private String AV29TFPrvCpo_Sel ;
   private String AV28TFPrvCpo ;
   private String AV31TFPrvPob_Sel ;
   private String AV30TFPrvPob ;
   private String AV33TFPrvNif_Sel ;
   private String AV32TFPrvNif ;
   private String AV35TFPrvTlf_Sel ;
   private String AV34TFPrvTlf ;
   private String AV39TFPrvTlx_Sel ;
   private String AV38TFPrvTlx ;
   private String AV41TFPrvTip_Sel ;
   private String AV43TFFpgCod_Sel ;
   private String AV42TFFpgCod ;
   private String AV55TFPrvRep_Sel ;
   private String AV54TFPrvRep ;
   private String AV59TFPrvMetTra_Sel ;
   private String AV61TFPrvCta_Sel ;
   private String AV60TFPrvCta ;
   private String AV65TFPrvDivCod_Sel ;
   private String AV123TFPrvAct_Sel ;
   private String A802PrvTip ;
   private String A792PrvMetTra ;
   private String A3092PrvDivCod ;
   private String A794PrvNom ;
   private String A786PrvDir ;
   private String A782PrvCpo ;
   private String A799PrvPob ;
   private String A793PrvNif ;
   private String A803PrvTlf ;
   private String A804PrvTlx ;
   private String A497FpgCod ;
   private String A801PrvRep ;
   private String A783PrvCta ;
   private String A14216PrvAct ;
   private String AV136Tprvgenwwds_4_tfprvnom ;
   private String AV137Tprvgenwwds_5_tfprvnom_sel ;
   private String AV138Tprvgenwwds_6_tfprvdir ;
   private String AV139Tprvgenwwds_7_tfprvdir_sel ;
   private String AV140Tprvgenwwds_8_tfprvcpo ;
   private String AV141Tprvgenwwds_9_tfprvcpo_sel ;
   private String AV142Tprvgenwwds_10_tfprvpob ;
   private String AV143Tprvgenwwds_11_tfprvpob_sel ;
   private String AV144Tprvgenwwds_12_tfprvnif ;
   private String AV145Tprvgenwwds_13_tfprvnif_sel ;
   private String AV146Tprvgenwwds_14_tfprvtlf ;
   private String AV147Tprvgenwwds_15_tfprvtlf_sel ;
   private String AV149Tprvgenwwds_17_tfprvtlx ;
   private String AV150Tprvgenwwds_18_tfprvtlx_sel ;
   private String AV152Tprvgenwwds_20_tffpgcod ;
   private String AV153Tprvgenwwds_21_tffpgcod_sel ;
   private String AV162Tprvgenwwds_30_tfprvrep ;
   private String AV163Tprvgenwwds_31_tfprvrep_sel ;
   private String AV167Tprvgenwwds_35_tfprvcta ;
   private String AV168Tprvgenwwds_36_tfprvcta_sel ;
   private String AV172Tprvgenwwds_40_tfprvact_sel ;
   private String scmdbuf ;
   private String lV136Tprvgenwwds_4_tfprvnom ;
   private String lV138Tprvgenwwds_6_tfprvdir ;
   private String lV140Tprvgenwwds_8_tfprvcpo ;
   private String lV142Tprvgenwwds_10_tfprvpob ;
   private String lV144Tprvgenwwds_12_tfprvnif ;
   private String lV146Tprvgenwwds_14_tfprvtlf ;
   private String lV149Tprvgenwwds_17_tfprvtlx ;
   private String lV152Tprvgenwwds_20_tffpgcod ;
   private String lV162Tprvgenwwds_30_tfprvrep ;
   private String lV167Tprvgenwwds_35_tfprvcta ;
   private String A396EmprCod ;
   private String AV126Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n783PrvCta ;
   private boolean n798PrvPlaEnt ;
   private boolean n801PrvRep ;
   private boolean n780PrvBan ;
   private boolean n797PrvPer ;
   private boolean n785PrvDiaPag ;
   private boolean n805PrvVto ;
   private boolean n497FpgCod ;
   private boolean n804PrvTlx ;
   private boolean n800PrvPri ;
   private boolean n803PrvTlf ;
   private boolean n793PrvNif ;
   private boolean n799PrvPob ;
   private boolean n782PrvCpo ;
   private boolean n786PrvDir ;
   private boolean n794PrvNom ;
   private boolean n3092PrvDivCod ;
   private boolean n792PrvMetTra ;
   private boolean n802PrvTip ;
   private String AV102TFPrvTip_SelsJson ;
   private String AV107TFPrvMetTra_SelsJson ;
   private String AV62TFPrvDivCod_SelsJson ;
   private String AV90Title ;
   private String AV12FilterFullText ;
   private String AV70TFPrvNum_To_Description ;
   private String AV103TFPrvTip_SelDscs ;
   private String AV105FilterTFPrvTip_SelValueDescription ;
   private String AV72TFPrvVto_To_Description ;
   private String AV73TFPrvDiaPag_To_Description ;
   private String AV74TFPrvPer_To_Description ;
   private String AV75TFPrvBan_To_Description ;
   private String AV76TFPrvPlaEnt_To_Description ;
   private String AV108TFPrvMetTra_SelDscs ;
   private String AV110FilterTFPrvMetTra_SelValueDescription ;
   private String AV63TFPrvDivCod_SelDscs ;
   private String AV77FilterTFPrvDivCod_SelValueDescription ;
   private String AV78TFPrvDivCo_To_Description ;
   private String AV133Tprvgenwwds_1_filterfulltext ;
   private String lV133Tprvgenwwds_1_filterfulltext ;
   private String AV100PrvTipDescription ;
   private String AV106PrvMetTraDescription ;
   private String AV13PrvDivCodDescription ;
   private String AV88PageInfo ;
   private String AV85DateInfo ;
   private String AV83AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08AK2_A14216PrvAct ;
   private byte[] P08AK2_A3143PrvDivCo ;
   private String[] P08AK2_A783PrvCta ;
   private boolean[] P08AK2_n783PrvCta ;
   private short[] P08AK2_A798PrvPlaEnt ;
   private boolean[] P08AK2_n798PrvPlaEnt ;
   private String[] P08AK2_A801PrvRep ;
   private boolean[] P08AK2_n801PrvRep ;
   private int[] P08AK2_A780PrvBan ;
   private boolean[] P08AK2_n780PrvBan ;
   private int[] P08AK2_A797PrvPer ;
   private boolean[] P08AK2_n797PrvPer ;
   private int[] P08AK2_A785PrvDiaPag ;
   private boolean[] P08AK2_n785PrvDiaPag ;
   private byte[] P08AK2_A805PrvVto ;
   private boolean[] P08AK2_n805PrvVto ;
   private String[] P08AK2_A497FpgCod ;
   private boolean[] P08AK2_n497FpgCod ;
   private String[] P08AK2_A804PrvTlx ;
   private boolean[] P08AK2_n804PrvTlx ;
   private byte[] P08AK2_A800PrvPri ;
   private boolean[] P08AK2_n800PrvPri ;
   private String[] P08AK2_A803PrvTlf ;
   private boolean[] P08AK2_n803PrvTlf ;
   private String[] P08AK2_A793PrvNif ;
   private boolean[] P08AK2_n793PrvNif ;
   private String[] P08AK2_A799PrvPob ;
   private boolean[] P08AK2_n799PrvPob ;
   private String[] P08AK2_A782PrvCpo ;
   private boolean[] P08AK2_n782PrvCpo ;
   private String[] P08AK2_A786PrvDir ;
   private boolean[] P08AK2_n786PrvDir ;
   private String[] P08AK2_A794PrvNom ;
   private boolean[] P08AK2_n794PrvNom ;
   private int[] P08AK2_A795PrvNum ;
   private String[] P08AK2_A3092PrvDivCod ;
   private boolean[] P08AK2_n3092PrvDivCod ;
   private String[] P08AK2_A792PrvMetTra ;
   private boolean[] P08AK2_n792PrvMetTra ;
   private String[] P08AK2_A802PrvTip ;
   private boolean[] P08AK2_n802PrvTip ;
   private String[] P08AK2_A396EmprCod ;
   private GXSimpleCollection<String> AV104TFPrvTip_Sels ;
   private GXSimpleCollection<String> AV109TFPrvMetTra_Sels ;
   private GXSimpleCollection<String> AV64TFPrvDivCod_Sels ;
   private GXSimpleCollection<String> AV151Tprvgenwwds_19_tfprvtip_sels ;
   private GXSimpleCollection<String> AV166Tprvgenwwds_34_tfprvmettra_sels ;
   private GXSimpleCollection<String> AV169Tprvgenwwds_37_tfprvdivcod_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class tprvgenwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08AK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A802PrvTip ,
                                          GXSimpleCollection<String> AV151Tprvgenwwds_19_tfprvtip_sels ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV166Tprvgenwwds_34_tfprvmettra_sels ,
                                          String A3092PrvDivCod ,
                                          GXSimpleCollection<String> AV169Tprvgenwwds_37_tfprvdivcod_sels ,
                                          int AV134Tprvgenwwds_2_tfprvnum ,
                                          int AV135Tprvgenwwds_3_tfprvnum_to ,
                                          String AV137Tprvgenwwds_5_tfprvnom_sel ,
                                          String AV136Tprvgenwwds_4_tfprvnom ,
                                          String AV139Tprvgenwwds_7_tfprvdir_sel ,
                                          String AV138Tprvgenwwds_6_tfprvdir ,
                                          String AV141Tprvgenwwds_9_tfprvcpo_sel ,
                                          String AV140Tprvgenwwds_8_tfprvcpo ,
                                          String AV143Tprvgenwwds_11_tfprvpob_sel ,
                                          String AV142Tprvgenwwds_10_tfprvpob ,
                                          String AV145Tprvgenwwds_13_tfprvnif_sel ,
                                          String AV144Tprvgenwwds_12_tfprvnif ,
                                          String AV147Tprvgenwwds_15_tfprvtlf_sel ,
                                          String AV146Tprvgenwwds_14_tfprvtlf ,
                                          byte AV148Tprvgenwwds_16_tfprvpri_sel ,
                                          String AV150Tprvgenwwds_18_tfprvtlx_sel ,
                                          String AV149Tprvgenwwds_17_tfprvtlx ,
                                          int AV151Tprvgenwwds_19_tfprvtip_sels_size ,
                                          String AV153Tprvgenwwds_21_tffpgcod_sel ,
                                          String AV152Tprvgenwwds_20_tffpgcod ,
                                          byte AV154Tprvgenwwds_22_tfprvvto ,
                                          byte AV155Tprvgenwwds_23_tfprvvto_to ,
                                          int AV156Tprvgenwwds_24_tfprvdiapag ,
                                          int AV157Tprvgenwwds_25_tfprvdiapag_to ,
                                          int AV158Tprvgenwwds_26_tfprvper ,
                                          int AV159Tprvgenwwds_27_tfprvper_to ,
                                          int AV160Tprvgenwwds_28_tfprvban ,
                                          int AV161Tprvgenwwds_29_tfprvban_to ,
                                          String AV163Tprvgenwwds_31_tfprvrep_sel ,
                                          String AV162Tprvgenwwds_30_tfprvrep ,
                                          short AV164Tprvgenwwds_32_tfprvplaent ,
                                          short AV165Tprvgenwwds_33_tfprvplaent_to ,
                                          int AV166Tprvgenwwds_34_tfprvmettra_sels_size ,
                                          String AV168Tprvgenwwds_36_tfprvcta_sel ,
                                          String AV167Tprvgenwwds_35_tfprvcta ,
                                          int AV169Tprvgenwwds_37_tfprvdivcod_sels_size ,
                                          byte AV170Tprvgenwwds_38_tfprvdivco ,
                                          byte AV171Tprvgenwwds_39_tfprvdivco_to ,
                                          String AV172Tprvgenwwds_40_tfprvact_sel ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A782PrvCpo ,
                                          String A799PrvPob ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          byte A800PrvPri ,
                                          String A804PrvTlx ,
                                          String A497FpgCod ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          int A780PrvBan ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          byte A3143PrvDivCo ,
                                          String A14216PrvAct ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV133Tprvgenwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[35];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT PrvAct, PrvDivCo, PrvCta, PrvPlaEnt, PrvRep, PrvBan, PrvPer, PrvDiaPag, PrvVto, FpgCod, PrvTlx, PrvPri, PrvTlf, PrvNif, PrvPob, PrvCpo, PrvDir, PrvNom, PrvNum," ;
      scmdbuf += " PrvDivCod, PrvMetTra, PrvTip, EmprCod FROM TXPPRVGEN" ;
      if ( ! (0==AV134Tprvgenwwds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV135Tprvgenwwds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Tprvgenwwds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV136Tprvgenwwds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Tprvgenwwds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Tprvgenwwds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV138Tprvgenwwds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Tprvgenwwds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(PrvDir = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Tprvgenwwds_9_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV140Tprvgenwwds_8_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Tprvgenwwds_9_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCpo = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Tprvgenwwds_11_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV142Tprvgenwwds_10_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Tprvgenwwds_11_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(PrvPob = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Tprvgenwwds_13_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV144Tprvgenwwds_12_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Tprvgenwwds_13_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNif = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Tprvgenwwds_15_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV146Tprvgenwwds_14_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Tprvgenwwds_15_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlf = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( AV148Tprvgenwwds_16_tfprvpri_sel == 1 )
      {
         addWhere(sWhereString, "(PrvPri = 1)");
      }
      if ( AV148Tprvgenwwds_16_tfprvpri_sel == 2 )
      {
         addWhere(sWhereString, "(PrvPri = 0)");
      }
      if ( (GXutil.strcmp("", AV150Tprvgenwwds_18_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV149Tprvgenwwds_17_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Tprvgenwwds_18_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlx = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( AV151Tprvgenwwds_19_tfprvtip_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV151Tprvgenwwds_19_tfprvtip_sels, "PrvTip IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV153Tprvgenwwds_21_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV152Tprvgenwwds_20_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Tprvgenwwds_21_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV154Tprvgenwwds_22_tfprvvto) )
      {
         addWhere(sWhereString, "(PrvVto >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV155Tprvgenwwds_23_tfprvvto_to) )
      {
         addWhere(sWhereString, "(PrvVto <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV156Tprvgenwwds_24_tfprvdiapag) )
      {
         addWhere(sWhereString, "(PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV157Tprvgenwwds_25_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV158Tprvgenwwds_26_tfprvper) )
      {
         addWhere(sWhereString, "(PrvPer >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV159Tprvgenwwds_27_tfprvper_to) )
      {
         addWhere(sWhereString, "(PrvPer <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV160Tprvgenwwds_28_tfprvban) )
      {
         addWhere(sWhereString, "(PrvBan >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV161Tprvgenwwds_29_tfprvban_to) )
      {
         addWhere(sWhereString, "(PrvBan <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV163Tprvgenwwds_31_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV162Tprvgenwwds_30_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV163Tprvgenwwds_31_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(PrvRep = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV164Tprvgenwwds_32_tfprvplaent) )
      {
         addWhere(sWhereString, "(PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV165Tprvgenwwds_33_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( AV166Tprvgenwwds_34_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV166Tprvgenwwds_34_tfprvmettra_sels, "PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV168Tprvgenwwds_36_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV167Tprvgenwwds_35_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Tprvgenwwds_36_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCta = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( AV169Tprvgenwwds_37_tfprvdivcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV169Tprvgenwwds_37_tfprvdivcod_sels, "PrvDivCod IN (", ")")+")");
      }
      if ( ! (0==AV170Tprvgenwwds_38_tfprvdivco) )
      {
         addWhere(sWhereString, "(PrvDivCo >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV171Tprvgenwwds_39_tfprvdivco_to) )
      {
         addWhere(sWhereString, "(PrvDivCo <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Tprvgenwwds_40_tfprvact_sel)==0) )
      {
         addWhere(sWhereString, "(PrvAct = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvNom" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvNum" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDir" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDir DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvCpo" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvCpo DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPob" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPob DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvNif" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvNif DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvTlf" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvTlf DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPri" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPri DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvTlx" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvTlx DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvTip" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvTip DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY FpgCod" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY FpgCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvVto" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvVto DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDiaPag" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDiaPag DESC" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPer" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPer DESC" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvBan" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvBan DESC" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvRep" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvRep DESC" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPlaEnt" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPlaEnt DESC" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvMetTra" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvMetTra DESC" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvCta" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvCta DESC" ;
      }
      else if ( ( AV10OrderedBy == 20 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDivCod" ;
      }
      else if ( ( AV10OrderedBy == 20 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDivCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 21 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDivCo" ;
      }
      else if ( ( AV10OrderedBy == 21 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDivCo DESC" ;
      }
      else if ( ( AV10OrderedBy == 22 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvAct" ;
      }
      else if ( ( AV10OrderedBy == 22 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvAct DESC" ;
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
                  return conditional_P08AK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).byteValue() , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , (String)dynConstraints[66] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08AK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 18);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 18);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 14);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 14);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 12);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
      }
   }

}

