package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rst0028_impl extends GXWebReport
{
   public rst0028_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         A396EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV16ImpCod = httpContext.GetPar( "ImpCod") ;
            AV17PPrvCod = (int)(GXutil.lval( httpContext.GetPar( "PPrvCod"))) ;
            AV18UPrvCod = (int)(GXutil.lval( httpContext.GetPar( "UPrvCod"))) ;
            AV21ImpTam = (byte)(GXutil.lval( httpContext.GetPar( "ImpTam"))) ;
         }
      }
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
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
         GXt_char1 = AV23Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN093_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit0 = GXt_char1 ;
         GXt_char1 = AV24Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit1 = GXt_char1 ;
         GXt_char1 = AV25Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit2 = GXt_char1 ;
         GXt_char1 = AV26Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit3 = GXt_char1 ;
         GXt_char1 = AV27Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN118_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit4 = GXt_char1 ;
         GXt_char1 = AV28Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1486_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit5 = GXt_char1 ;
         GXt_char1 = AV29Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1485_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit6 = GXt_char1 ;
         GXt_char1 = AV30Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1367_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit7 = GXt_char1 ;
         GXt_char1 = AV31Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1368_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit8 = GXt_char1 ;
         GXt_char1 = AV32Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2308_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit9 = GXt_char1 ;
         GXt_char1 = AV33Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2411_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit10 = GXt_char1 ;
         GXt_char1 = AV34Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2151_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit11 = GXt_char1 ;
         GXt_char1 = AV35Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2315_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit12 = GXt_char1 ;
         GXt_char1 = AV36Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN438_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit13 = GXt_char1 ;
         GXt_char1 = AV37Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2362_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit14 = GXt_char1 ;
         GXt_char1 = AV38Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1093_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit15 = GXt_char1 ;
         GXt_char1 = AV39Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1030_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit16 = GXt_char1 ;
         GXt_char1 = AV40Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1376_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit17 = GXt_char1 ;
         GXt_char1 = AV41Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN874_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit18 = GXt_char1 ;
         GXt_char1 = AV42Lit19 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2357_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit19 = GXt_char1 ;
         GXt_char1 = AV43Lit20 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1611_", ""), (byte)(99), GXv_char2) ;
         rst0028_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit20 = GXt_char1 ;
         /* Using cursor P06NS2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06NS2_A407EmprNom[0] ;
            n407EmprNom = P06NS2_n407EmprNom[0] ;
            AV22NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV17PPrvCod) ,
                                              Integer.valueOf(AV18UPrvCod) ,
                                              Integer.valueOf(A795PrvNum) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING
                                              }
         });
         /* Using cursor P06NS3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV17PPrvCod), Integer.valueOf(AV18UPrvCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A792PrvMetTra = P06NS3_A792PrvMetTra[0] ;
            n792PrvMetTra = P06NS3_n792PrvMetTra[0] ;
            A802PrvTip = P06NS3_A802PrvTip[0] ;
            n802PrvTip = P06NS3_n802PrvTip[0] ;
            A783PrvCta = P06NS3_A783PrvCta[0] ;
            n783PrvCta = P06NS3_n783PrvCta[0] ;
            A780PrvBan = P06NS3_A780PrvBan[0] ;
            n780PrvBan = P06NS3_n780PrvBan[0] ;
            A804PrvTlx = P06NS3_A804PrvTlx[0] ;
            n804PrvTlx = P06NS3_n804PrvTlx[0] ;
            A803PrvTlf = P06NS3_A803PrvTlf[0] ;
            n803PrvTlf = P06NS3_n803PrvTlf[0] ;
            A797PrvPer = P06NS3_A797PrvPer[0] ;
            n797PrvPer = P06NS3_n797PrvPer[0] ;
            A785PrvDiaPag = P06NS3_A785PrvDiaPag[0] ;
            n785PrvDiaPag = P06NS3_n785PrvDiaPag[0] ;
            A805PrvVto = P06NS3_A805PrvVto[0] ;
            n805PrvVto = P06NS3_n805PrvVto[0] ;
            A799PrvPob = P06NS3_A799PrvPob[0] ;
            n799PrvPob = P06NS3_n799PrvPob[0] ;
            A782PrvCpo = P06NS3_A782PrvCpo[0] ;
            n782PrvCpo = P06NS3_n782PrvCpo[0] ;
            A498FpgDsc = P06NS3_A498FpgDsc[0] ;
            n498FpgDsc = P06NS3_n498FpgDsc[0] ;
            A497FpgCod = P06NS3_A497FpgCod[0] ;
            n497FpgCod = P06NS3_n497FpgCod[0] ;
            A786PrvDir = P06NS3_A786PrvDir[0] ;
            n786PrvDir = P06NS3_n786PrvDir[0] ;
            A798PrvPlaEnt = P06NS3_A798PrvPlaEnt[0] ;
            n798PrvPlaEnt = P06NS3_n798PrvPlaEnt[0] ;
            A801PrvRep = P06NS3_A801PrvRep[0] ;
            n801PrvRep = P06NS3_n801PrvRep[0] ;
            A800PrvPri = P06NS3_A800PrvPri[0] ;
            n800PrvPri = P06NS3_n800PrvPri[0] ;
            A793PrvNif = P06NS3_A793PrvNif[0] ;
            n793PrvNif = P06NS3_n793PrvNif[0] ;
            A794PrvNom = P06NS3_A794PrvNom[0] ;
            n794PrvNom = P06NS3_n794PrvNom[0] ;
            A795PrvNum = P06NS3_A795PrvNum[0] ;
            A498FpgDsc = P06NS3_A498FpgDsc[0] ;
            n498FpgDsc = P06NS3_n498FpgDsc[0] ;
            if ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 )
            {
               AV19Tipo = httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "Proveedor", ""), ""), "") ;
            }
            else
            {
               if ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 )
               {
                  AV19Tipo = httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "Acreedor", ""), ""), "") ;
               }
            }
            if ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
            {
               AV20MetTrans = httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "Nuestro Camión", ""), ""), "") ;
            }
            else
            {
               if ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
               {
                  AV20MetTrans = httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "Su Camión", ""), ""), "") ;
               }
               else
               {
                  if ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 )
                  {
                     AV20MetTrans = httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "Agencia", ""), ""), "") ;
                  }
               }
            }
            h6NS0( false, 117) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 66, Gx_line+0, 74, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(".:", 416, Gx_line+0, 432, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 627, Gx_line+0, 635, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 802, Gx_line+0, 810, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit4, "")), 0, Gx_line+0, 67, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 80, Gx_line+0, 125, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 131, Gx_line+0, 351, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit9, "")), 379, Gx_line+0, 416, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A793PrvNif, "")), 438, Gx_line+0, 585, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit13, "")), 605, Gx_line+0, 613, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A800PrvPri), "9")), 634, Gx_line+0, 642, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit17, "")), 758, Gx_line+0, 788, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A802PrvTip, "")), 817, Gx_line+0, 825, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tipo, "")), 846, Gx_line+0, 920, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(".:", 416, Gx_line+17, 432, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 678, Gx_line+17, 686, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 802, Gx_line+17, 810, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit10, "")), 379, Gx_line+17, 416, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A801PrvRep, "")), 438, Gx_line+17, 585, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit14, "")), 605, Gx_line+17, 679, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A798PrvPlaEnt), "ZZ9")), 700, Gx_line+17, 723, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit18, "")), 758, Gx_line+17, 803, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A792PrvMetTra, "")), 817, Gx_line+17, 825, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20MetTrans, "")), 846, Gx_line+17, 949, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 66, Gx_line+33, 74, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 423, Gx_line+33, 431, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit5, "")), 0, Gx_line+33, 67, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A786PrvDir, "")), 80, Gx_line+33, 300, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit11, "")), 379, Gx_line+33, 424, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A497FpgCod, "@!")), 438, Gx_line+33, 454, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A498FpgDsc, "")), 467, Gx_line+33, 687, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 66, Gx_line+50, 74, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 423, Gx_line+50, 431, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 685, Gx_line+50, 693, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 846, Gx_line+50, 854, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit6, "")), 0, Gx_line+50, 67, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A782PrvCpo, "")), 80, Gx_line+50, 125, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A799PrvPob, "")), 131, Gx_line+50, 351, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit12, "")), 379, Gx_line+50, 424, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A805PrvVto), "Z9")), 438, Gx_line+50, 454, Gx_line+67, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit15, "")), 598, Gx_line+50, 679, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A785PrvDiaPag), "ZZZZZ9")), 700, Gx_line+50, 745, Gx_line+67, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit19, "")), 758, Gx_line+50, 847, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A797PrvPer), "ZZZZZ9")), 860, Gx_line+50, 905, Gx_line+67, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 66, Gx_line+67, 74, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 263, Gx_line+67, 271, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 685, Gx_line+67, 693, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 802, Gx_line+67, 810, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit7, "")), 0, Gx_line+67, 67, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A803PrvTlf, "")), 80, Gx_line+67, 212, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit8, "")), 226, Gx_line+67, 263, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A804PrvTlx, "")), 277, Gx_line+67, 380, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit16, "")), 598, Gx_line+67, 643, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A780PrvBan), "ZZZZZ9")), 700, Gx_line+67, 745, Gx_line+84, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit20, "")), 758, Gx_line+67, 803, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A783PrvCta, "")), 817, Gx_line+67, 906, Gx_line+84, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+117) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6NS0( true, 0) ;
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

   public void h6NS0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("---------------------------------------------------------------------------------------------------------------------------------", 0, Gx_line+0, 942, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 700, Gx_line+17, 708, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 853, Gx_line+17, 861, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22NomEmp, "")), 15, Gx_line+17, 235, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit1, "")), 656, Gx_line+17, 693, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 715, Gx_line+17, 774, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit2, "")), 809, Gx_line+17, 839, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 875, Gx_line+17, 934, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 853, Gx_line+50, 861, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("---------------------------------------------------------------------------------------------------------------------------------", 0, Gx_line+67, 942, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit0, "")), 15, Gx_line+50, 213, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit3, "")), 809, Gx_line+50, 854, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 868, Gx_line+50, 913, Gx_line+67, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+100) ;
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
      add_metrics1( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      A396EmprCod = "" ;
      AV16ImpCod = "" ;
      AV23Lit0 = "" ;
      AV24Lit1 = "" ;
      AV25Lit2 = "" ;
      AV26Lit3 = "" ;
      AV27Lit4 = "" ;
      AV28Lit5 = "" ;
      AV29Lit6 = "" ;
      AV30Lit7 = "" ;
      AV31Lit8 = "" ;
      AV32Lit9 = "" ;
      AV33Lit10 = "" ;
      AV34Lit11 = "" ;
      AV35Lit12 = "" ;
      AV36Lit13 = "" ;
      AV37Lit14 = "" ;
      AV38Lit15 = "" ;
      AV39Lit16 = "" ;
      AV40Lit17 = "" ;
      AV41Lit18 = "" ;
      AV42Lit19 = "" ;
      AV43Lit20 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06NS2_A396EmprCod = new String[] {""} ;
      P06NS2_A407EmprNom = new String[] {""} ;
      P06NS2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV22NomEmp = "" ;
      P06NS3_A396EmprCod = new String[] {""} ;
      P06NS3_A792PrvMetTra = new String[] {""} ;
      P06NS3_n792PrvMetTra = new boolean[] {false} ;
      P06NS3_A802PrvTip = new String[] {""} ;
      P06NS3_n802PrvTip = new boolean[] {false} ;
      P06NS3_A783PrvCta = new String[] {""} ;
      P06NS3_n783PrvCta = new boolean[] {false} ;
      P06NS3_A780PrvBan = new int[1] ;
      P06NS3_n780PrvBan = new boolean[] {false} ;
      P06NS3_A804PrvTlx = new String[] {""} ;
      P06NS3_n804PrvTlx = new boolean[] {false} ;
      P06NS3_A803PrvTlf = new String[] {""} ;
      P06NS3_n803PrvTlf = new boolean[] {false} ;
      P06NS3_A797PrvPer = new int[1] ;
      P06NS3_n797PrvPer = new boolean[] {false} ;
      P06NS3_A785PrvDiaPag = new int[1] ;
      P06NS3_n785PrvDiaPag = new boolean[] {false} ;
      P06NS3_A805PrvVto = new byte[1] ;
      P06NS3_n805PrvVto = new boolean[] {false} ;
      P06NS3_A799PrvPob = new String[] {""} ;
      P06NS3_n799PrvPob = new boolean[] {false} ;
      P06NS3_A782PrvCpo = new String[] {""} ;
      P06NS3_n782PrvCpo = new boolean[] {false} ;
      P06NS3_A498FpgDsc = new String[] {""} ;
      P06NS3_n498FpgDsc = new boolean[] {false} ;
      P06NS3_A497FpgCod = new String[] {""} ;
      P06NS3_n497FpgCod = new boolean[] {false} ;
      P06NS3_A786PrvDir = new String[] {""} ;
      P06NS3_n786PrvDir = new boolean[] {false} ;
      P06NS3_A798PrvPlaEnt = new short[1] ;
      P06NS3_n798PrvPlaEnt = new boolean[] {false} ;
      P06NS3_A801PrvRep = new String[] {""} ;
      P06NS3_n801PrvRep = new boolean[] {false} ;
      P06NS3_A800PrvPri = new byte[1] ;
      P06NS3_n800PrvPri = new boolean[] {false} ;
      P06NS3_A793PrvNif = new String[] {""} ;
      P06NS3_n793PrvNif = new boolean[] {false} ;
      P06NS3_A794PrvNom = new String[] {""} ;
      P06NS3_n794PrvNom = new boolean[] {false} ;
      P06NS3_A795PrvNum = new int[1] ;
      A792PrvMetTra = "" ;
      A802PrvTip = "" ;
      A783PrvCta = "" ;
      A804PrvTlx = "" ;
      A803PrvTlf = "" ;
      A799PrvPob = "" ;
      A782PrvCpo = "" ;
      A498FpgDsc = "" ;
      A497FpgCod = "" ;
      A786PrvDir = "" ;
      A801PrvRep = "" ;
      A793PrvNif = "" ;
      A794PrvNom = "" ;
      AV19Tipo = "" ;
      AV20MetTrans = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.rst0028__default(),
         new Object[] {
             new Object[] {
            P06NS2_A396EmprCod, P06NS2_A407EmprNom, P06NS2_n407EmprNom
            }
            , new Object[] {
            P06NS3_A396EmprCod, P06NS3_A792PrvMetTra, P06NS3_n792PrvMetTra, P06NS3_A802PrvTip, P06NS3_n802PrvTip, P06NS3_A783PrvCta, P06NS3_n783PrvCta, P06NS3_A780PrvBan, P06NS3_n780PrvBan, P06NS3_A804PrvTlx,
            P06NS3_n804PrvTlx, P06NS3_A803PrvTlf, P06NS3_n803PrvTlf, P06NS3_A797PrvPer, P06NS3_n797PrvPer, P06NS3_A785PrvDiaPag, P06NS3_n785PrvDiaPag, P06NS3_A805PrvVto, P06NS3_n805PrvVto, P06NS3_A799PrvPob,
            P06NS3_n799PrvPob, P06NS3_A782PrvCpo, P06NS3_n782PrvCpo, P06NS3_A498FpgDsc, P06NS3_n498FpgDsc, P06NS3_A497FpgCod, P06NS3_n497FpgCod, P06NS3_A786PrvDir, P06NS3_n786PrvDir, P06NS3_A798PrvPlaEnt,
            P06NS3_n798PrvPlaEnt, P06NS3_A801PrvRep, P06NS3_n801PrvRep, P06NS3_A800PrvPri, P06NS3_n800PrvPri, P06NS3_A793PrvNif, P06NS3_n793PrvNif, P06NS3_A794PrvNom, P06NS3_n794PrvNom, P06NS3_A795PrvNum
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV21ImpTam ;
   private byte A805PrvVto ;
   private byte A800PrvPri ;
   private short gxcookieaux ;
   private short A798PrvPlaEnt ;
   private short Gx_err ;
   private int AV17PPrvCod ;
   private int AV18UPrvCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int A780PrvBan ;
   private int A797PrvPer ;
   private int A785PrvDiaPag ;
   private int Gx_OldLine ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV16ImpCod ;
   private String AV23Lit0 ;
   private String AV24Lit1 ;
   private String AV25Lit2 ;
   private String AV26Lit3 ;
   private String AV27Lit4 ;
   private String AV28Lit5 ;
   private String AV29Lit6 ;
   private String AV30Lit7 ;
   private String AV31Lit8 ;
   private String AV32Lit9 ;
   private String AV33Lit10 ;
   private String AV34Lit11 ;
   private String AV35Lit12 ;
   private String AV36Lit13 ;
   private String AV37Lit14 ;
   private String AV38Lit15 ;
   private String AV39Lit16 ;
   private String AV40Lit17 ;
   private String AV41Lit18 ;
   private String AV42Lit19 ;
   private String AV43Lit20 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV22NomEmp ;
   private String A792PrvMetTra ;
   private String A802PrvTip ;
   private String A783PrvCta ;
   private String A804PrvTlx ;
   private String A803PrvTlf ;
   private String A799PrvPob ;
   private String A782PrvCpo ;
   private String A498FpgDsc ;
   private String A497FpgCod ;
   private String A786PrvDir ;
   private String A801PrvRep ;
   private String A793PrvNif ;
   private String A794PrvNom ;
   private String AV19Tipo ;
   private String AV20MetTrans ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n792PrvMetTra ;
   private boolean n802PrvTip ;
   private boolean n783PrvCta ;
   private boolean n780PrvBan ;
   private boolean n804PrvTlx ;
   private boolean n803PrvTlf ;
   private boolean n797PrvPer ;
   private boolean n785PrvDiaPag ;
   private boolean n805PrvVto ;
   private boolean n799PrvPob ;
   private boolean n782PrvCpo ;
   private boolean n498FpgDsc ;
   private boolean n497FpgCod ;
   private boolean n786PrvDir ;
   private boolean n798PrvPlaEnt ;
   private boolean n801PrvRep ;
   private boolean n800PrvPri ;
   private boolean n793PrvNif ;
   private boolean n794PrvNom ;
   private IDataStoreProvider pr_default ;
   private String[] P06NS2_A396EmprCod ;
   private String[] P06NS2_A407EmprNom ;
   private boolean[] P06NS2_n407EmprNom ;
   private String[] P06NS3_A396EmprCod ;
   private String[] P06NS3_A792PrvMetTra ;
   private boolean[] P06NS3_n792PrvMetTra ;
   private String[] P06NS3_A802PrvTip ;
   private boolean[] P06NS3_n802PrvTip ;
   private String[] P06NS3_A783PrvCta ;
   private boolean[] P06NS3_n783PrvCta ;
   private int[] P06NS3_A780PrvBan ;
   private boolean[] P06NS3_n780PrvBan ;
   private String[] P06NS3_A804PrvTlx ;
   private boolean[] P06NS3_n804PrvTlx ;
   private String[] P06NS3_A803PrvTlf ;
   private boolean[] P06NS3_n803PrvTlf ;
   private int[] P06NS3_A797PrvPer ;
   private boolean[] P06NS3_n797PrvPer ;
   private int[] P06NS3_A785PrvDiaPag ;
   private boolean[] P06NS3_n785PrvDiaPag ;
   private byte[] P06NS3_A805PrvVto ;
   private boolean[] P06NS3_n805PrvVto ;
   private String[] P06NS3_A799PrvPob ;
   private boolean[] P06NS3_n799PrvPob ;
   private String[] P06NS3_A782PrvCpo ;
   private boolean[] P06NS3_n782PrvCpo ;
   private String[] P06NS3_A498FpgDsc ;
   private boolean[] P06NS3_n498FpgDsc ;
   private String[] P06NS3_A497FpgCod ;
   private boolean[] P06NS3_n497FpgCod ;
   private String[] P06NS3_A786PrvDir ;
   private boolean[] P06NS3_n786PrvDir ;
   private short[] P06NS3_A798PrvPlaEnt ;
   private boolean[] P06NS3_n798PrvPlaEnt ;
   private String[] P06NS3_A801PrvRep ;
   private boolean[] P06NS3_n801PrvRep ;
   private byte[] P06NS3_A800PrvPri ;
   private boolean[] P06NS3_n800PrvPri ;
   private String[] P06NS3_A793PrvNif ;
   private boolean[] P06NS3_n793PrvNif ;
   private String[] P06NS3_A794PrvNom ;
   private boolean[] P06NS3_n794PrvNom ;
   private int[] P06NS3_A795PrvNum ;
}

final  class rst0028__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P06NS3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV17PPrvCod ,
                                          int AV18UPrvCod ,
                                          int A795PrvNum ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[3];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvMetTra, T1.PrvTip, T1.PrvCta, T1.PrvBan, T1.PrvTlx, T1.PrvTlf, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T1.PrvPob, T1.PrvCpo, T2.FpgDsc, T1.FpgCod," ;
      scmdbuf += " T1.PrvDir, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPri, T1.PrvNif, T1.PrvNom, T1.PrvNum FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV17PPrvCod) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV18UPrvCod) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 1 :
                  return conditional_P06NS3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06NS2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06NS3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 14);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 18);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(21);
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
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[3], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[4]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               return;
      }
   }

}

