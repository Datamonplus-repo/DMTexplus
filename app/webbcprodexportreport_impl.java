package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webbcprodexportreport_impl extends GXWebReport
{
   public webbcprodexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV91Title = httpContext.getMessage( "Lista de Mantenimiento de Productos Quimicos", "") ;
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
         h7ZS0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV71TFPrdNum_Sel)==0) )
      {
         h7ZS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71TFPrdNum_Sel, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV70TFPrdNum)==0) )
         {
            h7ZS0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70TFPrdNum, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV73TFPrdNom_Sel)==0) )
      {
         h7ZS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73TFPrdNom_Sel, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV72TFPrdNom)==0) )
         {
            h7ZS0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72TFPrdNom, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV75TFPrdUcpDsc_Sel)==0) )
      {
         h7ZS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75TFPrdUcpDsc_Sel, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV74TFPrdUcpDsc)==0) )
         {
            h7ZS0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74TFPrdUcpDsc, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFPrdPreAct)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFPrdPreAct_To)==0) ) )
      {
         h7ZS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Precio Actual", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76TFPrdPreAct, "ZZZZZZZ9.999")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV80TFPrdPreAct_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Precio Actual", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h7ZS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80TFPrdPreAct_To_Description, "")), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV77TFPrdPreAct_To, "ZZZZZZZ9.999")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105TFPrdDisponible)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106TFPrdDisponible_To)==0) ) )
      {
         h7ZS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Disponible", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV105TFPrdDisponible, "ZZZZZZ9.9999")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV107TFPrdDisponible_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Disponible", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h7ZS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107TFPrdDisponible_To_Description, "")), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV106TFPrdDisponible_To, "ZZZZZZ9.9999")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV79TFPrvNif_Sel)==0) )
      {
         h7ZS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N.I.F.", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79TFPrvNif_Sel, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV78TFPrvNif)==0) )
         {
            h7ZS0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.I.F.", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78TFPrvNif, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h7ZS0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h7ZS0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 30, Gx_line+10, 122, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 126, Gx_line+10, 310, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 314, Gx_line+10, 406, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio Actual", ""), 410, Gx_line+10, 502, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Disponible", ""), 506, Gx_line+10, 598, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N.I.F.", ""), 602, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV114Webbcprodds_1_tfprdnum = AV70TFPrdNum ;
      AV115Webbcprodds_2_tfprdnum_sel = AV71TFPrdNum_Sel ;
      AV116Webbcprodds_3_tfprdnom = AV72TFPrdNom ;
      AV117Webbcprodds_4_tfprdnom_sel = AV73TFPrdNom_Sel ;
      AV118Webbcprodds_5_tfprducpdsc = AV74TFPrdUcpDsc ;
      AV119Webbcprodds_6_tfprducpdsc_sel = AV75TFPrdUcpDsc_Sel ;
      AV120Webbcprodds_7_tfprdpreact = AV76TFPrdPreAct ;
      AV121Webbcprodds_8_tfprdpreact_to = AV77TFPrdPreAct_To ;
      AV122Webbcprodds_9_tfprddisponible = AV105TFPrdDisponible ;
      AV123Webbcprodds_10_tfprddisponible_to = AV106TFPrdDisponible_To ;
      AV124Webbcprodds_11_tfprvnif = AV78TFPrvNif ;
      AV125Webbcprodds_12_tfprvnif_sel = AV79TFPrvNif_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV115Webbcprodds_2_tfprdnum_sel ,
                                           AV114Webbcprodds_1_tfprdnum ,
                                           AV117Webbcprodds_4_tfprdnom_sel ,
                                           AV116Webbcprodds_3_tfprdnom ,
                                           AV119Webbcprodds_6_tfprducpdsc_sel ,
                                           AV118Webbcprodds_5_tfprducpdsc ,
                                           AV120Webbcprodds_7_tfprdpreact ,
                                           AV121Webbcprodds_8_tfprdpreact_to ,
                                           AV122Webbcprodds_9_tfprddisponible ,
                                           AV123Webbcprodds_10_tfprddisponible_to ,
                                           AV125Webbcprodds_12_tfprvnif_sel ,
                                           AV124Webbcprodds_11_tfprvnif ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A737PrdUcpDsc ,
                                           A724PrdPreAct ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A793PrvNif ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           A3936PrdEqLP ,
                                           AV93EmprCod ,
                                           A396EmprCod ,
                                           Byte.valueOf(A856ValCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV114Webbcprodds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV114Webbcprodds_1_tfprdnum), 6, "%") ;
      lV116Webbcprodds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV116Webbcprodds_3_tfprdnom), 26, "%") ;
      lV118Webbcprodds_5_tfprducpdsc = GXutil.padr( GXutil.rtrim( AV118Webbcprodds_5_tfprducpdsc), 8, "%") ;
      lV124Webbcprodds_11_tfprvnif = GXutil.padr( GXutil.rtrim( AV124Webbcprodds_11_tfprvnif), 20, "%") ;
      /* Using cursor P07ZS2 */
      pr_default.execute(0, new Object[] {AV93EmprCod, lV114Webbcprodds_1_tfprdnum, AV115Webbcprodds_2_tfprdnum_sel, lV116Webbcprodds_3_tfprdnom, AV117Webbcprodds_4_tfprdnom_sel, lV118Webbcprodds_5_tfprducpdsc, AV119Webbcprodds_6_tfprducpdsc_sel, AV120Webbcprodds_7_tfprdpreact, AV121Webbcprodds_8_tfprdpreact_to, AV122Webbcprodds_9_tfprddisponible, AV123Webbcprodds_10_tfprddisponible_to, lV124Webbcprodds_11_tfprvnif, AV125Webbcprodds_12_tfprvnif_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P07ZS2_A795PrvNum[0] ;
         A742PrdUniCom = P07ZS2_A742PrdUniCom[0] ;
         A3936PrdEqLP = P07ZS2_A3936PrdEqLP[0] ;
         A856ValCod = P07ZS2_A856ValCod[0] ;
         A396EmprCod = P07ZS2_A396EmprCod[0] ;
         A793PrvNif = P07ZS2_A793PrvNif[0] ;
         n793PrvNif = P07ZS2_n793PrvNif[0] ;
         A724PrdPreAct = P07ZS2_A724PrdPreAct[0] ;
         A737PrdUcpDsc = P07ZS2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZS2_n737PrdUcpDsc[0] ;
         A718PrdNom = P07ZS2_A718PrdNom[0] ;
         A719PrdNum = P07ZS2_A719PrdNum[0] ;
         A685PrdCanRes = P07ZS2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P07ZS2_A704PrdExiAlm[0] ;
         A793PrvNif = P07ZS2_A793PrvNif[0] ;
         n793PrvNif = P07ZS2_n793PrvNif[0] ;
         A737PrdUcpDsc = P07ZS2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZS2_n737PrdUcpDsc[0] ;
         if ( GXutil.strcmp(A3936PrdEqLP, httpContext.getMessage( "BC", "")) != 0 )
         {
            A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
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
            h7ZS0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 30, Gx_line+10, 122, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 126, Gx_line+10, 310, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A737PrdUcpDsc, "")), 314, Gx_line+10, 406, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")), 410, Gx_line+10, 502, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13831PrdDisponi, "ZZZZZZ9.9999")), 506, Gx_line+10, 598, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A793PrvNif, "")), 602, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV66Session.getValue("WebBCPRODGridState"), "") == 0 )
      {
         AV68GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebBCPRODGridState"), null, null);
      }
      else
      {
         AV68GridState.fromxml(AV66Session.getValue("WebBCPRODGridState"), null, null);
      }
      AV10OrderedBy = AV68GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV68GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV126GXV1 = 1 ;
      while ( AV126GXV1 <= AV68GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV69GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV68GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV126GXV1));
         if ( GXutil.strcmp(AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV70TFPrdNum = AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV71TFPrdNum_Sel = AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV72TFPrdNom = AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV73TFPrdNom_Sel = AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC") == 0 )
         {
            AV74TFPrdUcpDsc = AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC_SEL") == 0 )
         {
            AV75TFPrdUcpDsc_Sel = AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV76TFPrdPreAct = CommonUtil.decimalVal( AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV77TFPrdPreAct_To = CommonUtil.decimalVal( AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV105TFPrdDisponible = CommonUtil.decimalVal( AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV106TFPrdDisponible_To = CommonUtil.decimalVal( AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV78TFPrvNif = AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV79TFPrvNif_Sel = AV69GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV126GXV1 = (int)(AV126GXV1+1) ;
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

   public void h7ZS0( boolean bFoot ,
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
               AV89PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV86DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV91Title = AV110Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV91Title = "" ;
      AV71TFPrdNum_Sel = "" ;
      AV70TFPrdNum = "" ;
      AV73TFPrdNom_Sel = "" ;
      AV72TFPrdNom = "" ;
      AV75TFPrdUcpDsc_Sel = "" ;
      AV74TFPrdUcpDsc = "" ;
      AV76TFPrdPreAct = DecimalUtil.ZERO ;
      AV77TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV80TFPrdPreAct_To_Description = "" ;
      AV105TFPrdDisponible = DecimalUtil.ZERO ;
      AV106TFPrdDisponible_To = DecimalUtil.ZERO ;
      AV107TFPrdDisponible_To_Description = "" ;
      AV79TFPrvNif_Sel = "" ;
      AV78TFPrvNif = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A737PrdUcpDsc = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      A793PrvNif = "" ;
      AV114Webbcprodds_1_tfprdnum = "" ;
      AV115Webbcprodds_2_tfprdnum_sel = "" ;
      AV116Webbcprodds_3_tfprdnom = "" ;
      AV117Webbcprodds_4_tfprdnom_sel = "" ;
      AV118Webbcprodds_5_tfprducpdsc = "" ;
      AV119Webbcprodds_6_tfprducpdsc_sel = "" ;
      AV120Webbcprodds_7_tfprdpreact = DecimalUtil.ZERO ;
      AV121Webbcprodds_8_tfprdpreact_to = DecimalUtil.ZERO ;
      AV122Webbcprodds_9_tfprddisponible = DecimalUtil.ZERO ;
      AV123Webbcprodds_10_tfprddisponible_to = DecimalUtil.ZERO ;
      AV124Webbcprodds_11_tfprvnif = "" ;
      AV125Webbcprodds_12_tfprvnif_sel = "" ;
      scmdbuf = "" ;
      lV114Webbcprodds_1_tfprdnum = "" ;
      lV116Webbcprodds_3_tfprdnom = "" ;
      lV118Webbcprodds_5_tfprducpdsc = "" ;
      lV124Webbcprodds_11_tfprvnif = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A3936PrdEqLP = "" ;
      AV93EmprCod = "" ;
      A396EmprCod = "" ;
      P07ZS2_A795PrvNum = new int[1] ;
      P07ZS2_A742PrdUniCom = new byte[1] ;
      P07ZS2_A3936PrdEqLP = new String[] {""} ;
      P07ZS2_A856ValCod = new byte[1] ;
      P07ZS2_A396EmprCod = new String[] {""} ;
      P07ZS2_A793PrvNif = new String[] {""} ;
      P07ZS2_n793PrvNif = new boolean[] {false} ;
      P07ZS2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZS2_A737PrdUcpDsc = new String[] {""} ;
      P07ZS2_n737PrdUcpDsc = new boolean[] {false} ;
      P07ZS2_A718PrdNom = new String[] {""} ;
      P07ZS2_A719PrdNum = new String[] {""} ;
      P07ZS2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZS2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV66Session = httpContext.getWebSession();
      AV68GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV69GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV89PageInfo = "" ;
      AV86DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV110Pgmdesc = "" ;
      AV84AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webbcprodexportreport__default(),
         new Object[] {
             new Object[] {
            P07ZS2_A795PrvNum, P07ZS2_A742PrdUniCom, P07ZS2_A3936PrdEqLP, P07ZS2_A856ValCod, P07ZS2_A396EmprCod, P07ZS2_A793PrvNif, P07ZS2_n793PrvNif, P07ZS2_A724PrdPreAct, P07ZS2_A737PrdUcpDsc, P07ZS2_n737PrdUcpDsc,
            P07ZS2_A718PrdNom, P07ZS2_A719PrdNum, P07ZS2_A685PrdCanRes, P07ZS2_A704PrdExiAlm
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV110Pgmdesc = httpContext.getMessage( "Web BCPRODExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV110Pgmdesc = httpContext.getMessage( "Web BCPRODExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private byte A742PrdUniCom ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int A795PrvNum ;
   private int AV126GXV1 ;
   private java.math.BigDecimal AV76TFPrdPreAct ;
   private java.math.BigDecimal AV77TFPrdPreAct_To ;
   private java.math.BigDecimal AV105TFPrdDisponible ;
   private java.math.BigDecimal AV106TFPrdDisponible_To ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private java.math.BigDecimal AV120Webbcprodds_7_tfprdpreact ;
   private java.math.BigDecimal AV121Webbcprodds_8_tfprdpreact_to ;
   private java.math.BigDecimal AV122Webbcprodds_9_tfprddisponible ;
   private java.math.BigDecimal AV123Webbcprodds_10_tfprddisponible_to ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV71TFPrdNum_Sel ;
   private String AV70TFPrdNum ;
   private String AV73TFPrdNom_Sel ;
   private String AV72TFPrdNom ;
   private String AV75TFPrdUcpDsc_Sel ;
   private String AV74TFPrdUcpDsc ;
   private String AV79TFPrvNif_Sel ;
   private String AV78TFPrvNif ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A737PrdUcpDsc ;
   private String A793PrvNif ;
   private String AV114Webbcprodds_1_tfprdnum ;
   private String AV115Webbcprodds_2_tfprdnum_sel ;
   private String AV116Webbcprodds_3_tfprdnom ;
   private String AV117Webbcprodds_4_tfprdnom_sel ;
   private String AV118Webbcprodds_5_tfprducpdsc ;
   private String AV119Webbcprodds_6_tfprducpdsc_sel ;
   private String AV124Webbcprodds_11_tfprvnif ;
   private String AV125Webbcprodds_12_tfprvnif_sel ;
   private String scmdbuf ;
   private String lV114Webbcprodds_1_tfprdnum ;
   private String lV116Webbcprodds_3_tfprdnom ;
   private String lV118Webbcprodds_5_tfprducpdsc ;
   private String lV124Webbcprodds_11_tfprvnif ;
   private String A3936PrdEqLP ;
   private String AV93EmprCod ;
   private String A396EmprCod ;
   private String AV110Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n793PrvNif ;
   private boolean n737PrdUcpDsc ;
   private String AV91Title ;
   private String AV80TFPrdPreAct_To_Description ;
   private String AV107TFPrdDisponible_To_Description ;
   private String AV89PageInfo ;
   private String AV86DateInfo ;
   private String AV84AppName ;
   private com.genexus.webpanels.WebSession AV66Session ;
   private IDataStoreProvider pr_default ;
   private int[] P07ZS2_A795PrvNum ;
   private byte[] P07ZS2_A742PrdUniCom ;
   private String[] P07ZS2_A3936PrdEqLP ;
   private byte[] P07ZS2_A856ValCod ;
   private String[] P07ZS2_A396EmprCod ;
   private String[] P07ZS2_A793PrvNif ;
   private boolean[] P07ZS2_n793PrvNif ;
   private java.math.BigDecimal[] P07ZS2_A724PrdPreAct ;
   private String[] P07ZS2_A737PrdUcpDsc ;
   private boolean[] P07ZS2_n737PrdUcpDsc ;
   private String[] P07ZS2_A718PrdNom ;
   private String[] P07ZS2_A719PrdNum ;
   private java.math.BigDecimal[] P07ZS2_A685PrdCanRes ;
   private java.math.BigDecimal[] P07ZS2_A704PrdExiAlm ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV68GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV69GridStateFilterValue ;
}

final  class webbcprodexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07ZS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV115Webbcprodds_2_tfprdnum_sel ,
                                          String AV114Webbcprodds_1_tfprdnum ,
                                          String AV117Webbcprodds_4_tfprdnom_sel ,
                                          String AV116Webbcprodds_3_tfprdnom ,
                                          String AV119Webbcprodds_6_tfprducpdsc_sel ,
                                          String AV118Webbcprodds_5_tfprducpdsc ,
                                          java.math.BigDecimal AV120Webbcprodds_7_tfprdpreact ,
                                          java.math.BigDecimal AV121Webbcprodds_8_tfprdpreact_to ,
                                          java.math.BigDecimal AV122Webbcprodds_9_tfprddisponible ,
                                          java.math.BigDecimal AV123Webbcprodds_10_tfprddisponible_to ,
                                          String AV125Webbcprodds_12_tfprvnif_sel ,
                                          String AV124Webbcprodds_11_tfprvnif ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A737PrdUcpDsc ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A793PrvNif ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String A3936PrdEqLP ,
                                          String AV93EmprCod ,
                                          String A396EmprCod ,
                                          byte A856ValCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[13];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.PrdUniCom AS PrdUniCom, T1.PrdEqLP, T1.ValCod, T1.EmprCod, T2.PrvNif, T1.PrdPreAct, T3.UniDsc AS PrdUcpDsc, T1.PrdNom, T1.PrdNum, T1.PrdCanRes," ;
      scmdbuf += " T1.PrdExiAlm FROM ((TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ValCod = 1)");
      if ( (GXutil.strcmp("", AV115Webbcprodds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV114Webbcprodds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Webbcprodds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Webbcprodds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV116Webbcprodds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Webbcprodds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Webbcprodds_6_tfprducpdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Webbcprodds_5_tfprducpdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Webbcprodds_6_tfprducpdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Webbcprodds_7_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webbcprodds_8_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Webbcprodds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Webbcprodds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Webbcprodds_12_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV124Webbcprodds_11_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Webbcprodds_12_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNif = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.UniDsc" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.UniDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvNif" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvNif DESC" ;
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
                  return conditional_P07ZS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07ZS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,4);
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
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 5);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               return;
      }
   }

}

