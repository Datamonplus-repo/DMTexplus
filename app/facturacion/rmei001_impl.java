package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rmei001_impl extends GXWebReport
{
   public rmei001_impl( com.genexus.internet.HttpContext context )
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
            AV15ImpCod = httpContext.GetPar( "ImpCod") ;
            AV16PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV17UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV18PArtCod = httpContext.GetPar( "PArtCod") ;
            AV19UArtCod = httpContext.GetPar( "UArtCod") ;
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
      M_bot = 0 ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV21Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN103_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit0 = GXt_char1 ;
         GXt_char1 = AV22Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit1 = GXt_char1 ;
         GXt_char1 = AV23Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit2 = GXt_char1 ;
         GXt_char1 = AV24Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit3 = GXt_char1 ;
         GXt_char1 = AV25Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit4 = GXt_char1 ;
         GXt_char1 = AV26Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1355_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit5 = GXt_char1 ;
         GXt_char1 = AV27Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1194_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit6 = GXt_char1 ;
         GXt_char1 = AV28Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2052_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit7 = GXt_char1 ;
         GXt_char1 = AV29Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1314_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit8 = GXt_char1 ;
         GXt_char1 = AV30Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1316_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit9 = GXt_char1 ;
         GXt_char1 = AV31Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1314_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit10 = GXt_char1 ;
         GXt_char1 = AV32Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1316_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit11 = GXt_char1 ;
         GXt_char1 = AV33Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1506_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit12 = GXt_char1 ;
         GXt_char1 = AV34Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN466_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit13 = GXt_char1 ;
         GXt_char1 = AV35Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1340_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit14 = GXt_char1 ;
         GXt_char1 = AV36Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1355_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit15 = GXt_char1 ;
         GXt_char1 = AV37Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1194_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit16 = GXt_char1 ;
         GXt_char1 = AV38Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2371_", ""), (byte)(99), GXv_char2) ;
         rmei001_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit17 = GXt_char1 ;
         AV50heimprimido = (short)(0) ;
         GxHdr2 = true ;
         /* Using cursor P06G32 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16PCliCod), AV18PArtCod, AV19UArtCod, Integer.valueOf(AV17UCliCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            brk6G32 = false ;
            A65ArtCod = P06G32_A65ArtCod[0] ;
            A252CliCod = P06G32_A252CliCod[0] ;
            A93ArtPreMtr = P06G32_A93ArtPreMtr[0] ;
            n93ArtPreMtr = P06G32_n93ArtPreMtr[0] ;
            A92ArtPreKgm = P06G32_A92ArtPreKgm[0] ;
            n92ArtPreKgm = P06G32_n92ArtPreKgm[0] ;
            A279CliNom = P06G32_A279CliNom[0] ;
            A69ArtDsc = P06G32_A69ArtDsc[0] ;
            n69ArtDsc = P06G32_n69ArtDsc[0] ;
            A407EmprNom = P06G32_A407EmprNom[0] ;
            n407EmprNom = P06G32_n407EmprNom[0] ;
            A407EmprNom = P06G32_A407EmprNom[0] ;
            n407EmprNom = P06G32_n407EmprNom[0] ;
            A279CliNom = P06G32_A279CliNom[0] ;
            AV47Primeravez = (byte)(0) ;
            AV50heimprimido = (short)(0) ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P06G32_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06G32_A252CliCod[0] == A252CliCod ) )
            {
               brk6G32 = false ;
               A65ArtCod = P06G32_A65ArtCod[0] ;
               A93ArtPreMtr = P06G32_A93ArtPreMtr[0] ;
               n93ArtPreMtr = P06G32_n93ArtPreMtr[0] ;
               A92ArtPreKgm = P06G32_A92ArtPreKgm[0] ;
               n92ArtPreKgm = P06G32_n92ArtPreKgm[0] ;
               A279CliNom = P06G32_A279CliNom[0] ;
               A69ArtDsc = P06G32_A69ArtDsc[0] ;
               n69ArtDsc = P06G32_n69ArtDsc[0] ;
               A279CliNom = P06G32_A279CliNom[0] ;
               if ( GXutil.strcmp(A65ArtCod, AV19UArtCod) <= 0 )
               {
                  if ( GXutil.strcmp(A65ArtCod, AV18PArtCod) >= 0 )
                  {
                     if ( ( A252CliCod >= AV16PCliCod ) && ( A252CliCod <= AV17UCliCod ) )
                     {
                        AV45Imprimir = httpContext.getMessage( "N", "") ;
                        if ( ( A92ArtPreKgm.doubleValue() != 0 ) || ( A93ArtPreMtr.doubleValue() != 0 ) )
                        {
                           AV45Imprimir = httpContext.getMessage( "S", "") ;
                        }
                        else
                        {
                           /* Using cursor P06G33 */
                           pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                           while ( (pr_default.getStatus(1) != 101) )
                           {
                              A587IntPreMtr = P06G33_A587IntPreMtr[0] ;
                              n587IntPreMtr = P06G33_n587IntPreMtr[0] ;
                              A586IntPreKgm = P06G33_A586IntPreKgm[0] ;
                              n586IntPreKgm = P06G33_n586IntPreKgm[0] ;
                              A583IntCod = P06G33_A583IntCod[0] ;
                              A831TipColCod = P06G33_A831TipColCod[0] ;
                              if ( ( A586IntPreKgm.doubleValue() != 0 ) || ( A587IntPreMtr.doubleValue() != 0 ) )
                              {
                                 AV45Imprimir = httpContext.getMessage( "S", "") ;
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                              pr_default.readNext(1);
                           }
                           pr_default.close(1);
                        }
                        if ( GXutil.strcmp(AV45Imprimir, httpContext.getMessage( "S", "")) == 0 )
                        {
                           AV44Entre = httpContext.getMessage( "N", "") ;
                           if ( AV47Primeravez == 0 )
                           {
                              AV47Primeravez = (byte)(1) ;
                              h6G30( false, 32) ;
                              getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit4, "")), 49, Gx_line+6, 138, Gx_line+23, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 143, Gx_line+6, 188, Gx_line+23, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 193, Gx_line+6, 350, Gx_line+23, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawRect(39, Gx_line+4, 415, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+32) ;
                           }
                           h6G30( false, 22) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A65ArtCod, "")), 19, Gx_line+0, 137, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A92ArtPreKgm, "ZZZZZZ9.999")), 649, Gx_line+0, 745, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A93ArtPreMtr, "ZZZZZZ9.999")), 729, Gx_line+0, 825, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A69ArtDsc, "")), 142, Gx_line+0, 333, Gx_line+16, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+22) ;
                           /* Noskip command */
                           Gx_line = Gx_OldLine ;
                           /* Using cursor P06G34 */
                           pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                           while ( (pr_default.getStatus(2) != 101) )
                           {
                              A675PorRec = P06G34_A675PorRec[0] ;
                              n675PorRec = P06G34_n675PorRec[0] ;
                              A596LimUni = P06G34_A596LimUni[0] ;
                              n596LimUni = P06G34_n596LimUni[0] ;
                              A598LinRec = P06G34_A598LinRec[0] ;
                              h6G30( false, 16) ;
                              getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A596LimUni), "ZZZZZZZ9")), 1006, Gx_line+0, 1065, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A675PorRec, "ZZ9.99")), 1072, Gx_line+0, 1117, Gx_line+16, 2+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+16) ;
                              AV44Entre = httpContext.getMessage( "S", "") ;
                              pr_default.readNext(2);
                           }
                           pr_default.close(2);
                           if ( GXutil.strcmp(AV44Entre, httpContext.getMessage( "N", "")) == 0 )
                           {
                              h6G30( false, 17) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+17) ;
                           }
                           AV43Flag = (byte)(0) ;
                           /* Using cursor P06G35 */
                           pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                           while ( (pr_default.getStatus(3) != 101) )
                           {
                              A831TipColCod = P06G35_A831TipColCod[0] ;
                              A832TipColDsc = P06G35_A832TipColDsc[0] ;
                              n832TipColDsc = P06G35_n832TipColDsc[0] ;
                              A832TipColDsc = P06G35_A832TipColDsc[0] ;
                              n832TipColDsc = P06G35_n832TipColDsc[0] ;
                              h6G30( false, 21) ;
                              getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 138, Gx_line+0, 154, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A832TipColDsc, "")), 167, Gx_line+0, 387, Gx_line+16, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+21) ;
                              /* Using cursor P06G36 */
                              pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod)});
                              while ( (pr_default.getStatus(4) != 101) )
                              {
                                 A584IntDsc = P06G36_A584IntDsc[0] ;
                                 n584IntDsc = P06G36_n584IntDsc[0] ;
                                 A587IntPreMtr = P06G36_A587IntPreMtr[0] ;
                                 n587IntPreMtr = P06G36_n587IntPreMtr[0] ;
                                 A586IntPreKgm = P06G36_A586IntPreKgm[0] ;
                                 n586IntPreKgm = P06G36_n586IntPreKgm[0] ;
                                 A3616PreFacCod = P06G36_A3616PreFacCod[0] ;
                                 n3616PreFacCod = P06G36_n3616PreFacCod[0] ;
                                 A585IntPreDef = P06G36_A585IntPreDef[0] ;
                                 n585IntPreDef = P06G36_n585IntPreDef[0] ;
                                 A583IntCod = P06G36_A583IntCod[0] ;
                                 A584IntDsc = P06G36_A584IntDsc[0] ;
                                 n584IntDsc = P06G36_n584IntDsc[0] ;
                                 AV48IntDes = A584IntDsc ;
                                 if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A586IntPreKgm)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A587IntPreMtr)==0) )
                                 {
                                    h6G30( false, 22) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9")), 394, Gx_line+0, 410, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A586IntPreKgm, "ZZZZZZ9.999")), 809, Gx_line+0, 905, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A587IntPreMtr, "ZZZZZZ9.999")), 890, Gx_line+0, 986, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A585IntPreDef, "@!")), 970, Gx_line+0, 978, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48IntDes, "")), 425, Gx_line+0, 572, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3616PreFacCod, "")), 583, Gx_line+0, 628, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+22) ;
                                 }
                                 pr_default.readNext(4);
                              }
                              pr_default.close(4);
                              pr_default.readNext(3);
                           }
                           pr_default.close(3);
                           AV50heimprimido = (short)(1) ;
                        }
                     }
                  }
               }
               brk6G32 = true ;
               pr_default.readNext(0);
            }
            if ( AV50heimprimido == 1 )
            {
               h6G30( false, 17) ;
               getPrinter().GxDrawLine(10, Gx_line+7, 1123, Gx_line+7, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            if ( ! brk6G32 )
            {
               brk6G32 = true ;
               pr_default.readNext(0);
            }
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6G30( true, 0) ;
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

   public void h6G30( boolean bFoot ,
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
            if ( GxHdr2 )
            {
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 19, Gx_line+17, 239, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit1, "")), 825, Gx_line+16, 889, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 900, Gx_line+16, 951, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit2, "")), 960, Gx_line+16, 1011, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 1018, Gx_line+16, 1111, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit0, "")), 19, Gx_line+45, 151, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit3, "")), 813, Gx_line+47, 889, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 906, Gx_line+47, 951, Gx_line+64, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("%", 1091, Gx_line+85, 1101, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit15, "")), 706, Gx_line+85, 751, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit16, "")), 855, Gx_line+85, 929, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit17, "")), 1004, Gx_line+85, 1085, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit5, "")), 18, Gx_line+103, 55, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit7, "")), 138, Gx_line+103, 205, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit6, "")), 393, Gx_line+103, 467, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit8, "")), 649, Gx_line+103, 708, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit9, "")), 744, Gx_line+103, 803, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit10, "")), 809, Gx_line+103, 868, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit11, "")), 904, Gx_line+103, 963, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit12, "")), 977, Gx_line+103, 985, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit13, "")), 1005, Gx_line+103, 1064, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit14, "")), 1071, Gx_line+102, 1123, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(11, Gx_line+69, 1124, Gx_line+69, 3, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(10, Gx_line+126, 1123, Gx_line+126, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 59, Gx_line+103, 63, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Desc", ""), 68, Gx_line+103, 98, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 583, Gx_line+103, 628, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(805, Gx_line+69, 805, Gx_line+127, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(999, Gx_line+69, 999, Gx_line+127, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(638, Gx_line+69, 638, Gx_line+127, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+130) ;
            }
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
      add_metrics2( ) ;
      add_metrics3( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV15ImpCod = "" ;
      AV18PArtCod = "" ;
      AV19UArtCod = "" ;
      AV21Lit0 = "" ;
      AV22Lit1 = "" ;
      AV23Lit2 = "" ;
      AV24Lit3 = "" ;
      AV25Lit4 = "" ;
      AV26Lit5 = "" ;
      AV27Lit6 = "" ;
      AV28Lit7 = "" ;
      AV29Lit8 = "" ;
      AV30Lit9 = "" ;
      AV31Lit10 = "" ;
      AV32Lit11 = "" ;
      AV33Lit12 = "" ;
      AV34Lit13 = "" ;
      AV35Lit14 = "" ;
      AV36Lit15 = "" ;
      AV37Lit16 = "" ;
      AV38Lit17 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06G32_A396EmprCod = new String[] {""} ;
      P06G32_A65ArtCod = new String[] {""} ;
      P06G32_A252CliCod = new int[1] ;
      P06G32_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06G32_n93ArtPreMtr = new boolean[] {false} ;
      P06G32_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06G32_n92ArtPreKgm = new boolean[] {false} ;
      P06G32_A279CliNom = new String[] {""} ;
      P06G32_A69ArtDsc = new String[] {""} ;
      P06G32_n69ArtDsc = new boolean[] {false} ;
      P06G32_A407EmprNom = new String[] {""} ;
      P06G32_n407EmprNom = new boolean[] {false} ;
      A65ArtCod = "" ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A69ArtDsc = "" ;
      A407EmprNom = "" ;
      AV45Imprimir = "" ;
      P06G33_A396EmprCod = new String[] {""} ;
      P06G33_A252CliCod = new int[1] ;
      P06G33_A65ArtCod = new String[] {""} ;
      P06G33_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06G33_n587IntPreMtr = new boolean[] {false} ;
      P06G33_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06G33_n586IntPreKgm = new boolean[] {false} ;
      P06G33_A583IntCod = new byte[1] ;
      P06G33_A831TipColCod = new byte[1] ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      AV44Entre = "" ;
      P06G34_A396EmprCod = new String[] {""} ;
      P06G34_A252CliCod = new int[1] ;
      P06G34_A65ArtCod = new String[] {""} ;
      P06G34_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06G34_n675PorRec = new boolean[] {false} ;
      P06G34_A596LimUni = new int[1] ;
      P06G34_n596LimUni = new boolean[] {false} ;
      P06G34_A598LinRec = new byte[1] ;
      A675PorRec = DecimalUtil.ZERO ;
      P06G35_A396EmprCod = new String[] {""} ;
      P06G35_A252CliCod = new int[1] ;
      P06G35_A65ArtCod = new String[] {""} ;
      P06G35_A831TipColCod = new byte[1] ;
      P06G35_A832TipColDsc = new String[] {""} ;
      P06G35_n832TipColDsc = new boolean[] {false} ;
      A832TipColDsc = "" ;
      P06G36_A396EmprCod = new String[] {""} ;
      P06G36_A252CliCod = new int[1] ;
      P06G36_A65ArtCod = new String[] {""} ;
      P06G36_A831TipColCod = new byte[1] ;
      P06G36_A584IntDsc = new String[] {""} ;
      P06G36_n584IntDsc = new boolean[] {false} ;
      P06G36_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06G36_n587IntPreMtr = new boolean[] {false} ;
      P06G36_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06G36_n586IntPreKgm = new boolean[] {false} ;
      P06G36_A3616PreFacCod = new String[] {""} ;
      P06G36_n3616PreFacCod = new boolean[] {false} ;
      P06G36_A585IntPreDef = new String[] {""} ;
      P06G36_n585IntPreDef = new boolean[] {false} ;
      P06G36_A583IntCod = new byte[1] ;
      A584IntDsc = "" ;
      A3616PreFacCod = "" ;
      A585IntPreDef = "" ;
      AV48IntDes = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.rmei001__default(),
         new Object[] {
             new Object[] {
            P06G32_A396EmprCod, P06G32_A65ArtCod, P06G32_A252CliCod, P06G32_A93ArtPreMtr, P06G32_n93ArtPreMtr, P06G32_A92ArtPreKgm, P06G32_n92ArtPreKgm, P06G32_A279CliNom, P06G32_A69ArtDsc, P06G32_n69ArtDsc,
            P06G32_A407EmprNom, P06G32_n407EmprNom
            }
            , new Object[] {
            P06G33_A396EmprCod, P06G33_A252CliCod, P06G33_A65ArtCod, P06G33_A587IntPreMtr, P06G33_n587IntPreMtr, P06G33_A586IntPreKgm, P06G33_n586IntPreKgm, P06G33_A583IntCod, P06G33_A831TipColCod
            }
            , new Object[] {
            P06G34_A396EmprCod, P06G34_A252CliCod, P06G34_A65ArtCod, P06G34_A675PorRec, P06G34_n675PorRec, P06G34_A596LimUni, P06G34_n596LimUni, P06G34_A598LinRec
            }
            , new Object[] {
            P06G35_A396EmprCod, P06G35_A252CliCod, P06G35_A65ArtCod, P06G35_A831TipColCod, P06G35_A832TipColDsc, P06G35_n832TipColDsc
            }
            , new Object[] {
            P06G36_A396EmprCod, P06G36_A252CliCod, P06G36_A65ArtCod, P06G36_A831TipColCod, P06G36_A584IntDsc, P06G36_n584IntDsc, P06G36_A587IntPreMtr, P06G36_n587IntPreMtr, P06G36_A586IntPreKgm, P06G36_n586IntPreKgm,
            P06G36_A3616PreFacCod, P06G36_n3616PreFacCod, P06G36_A585IntPreDef, P06G36_n585IntPreDef, P06G36_A583IntCod
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

   private byte AV47Primeravez ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte A598LinRec ;
   private byte AV43Flag ;
   private short gxcookieaux ;
   private short AV50heimprimido ;
   private short Gx_err ;
   private int AV16PCliCod ;
   private int AV17UCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private int A596LimUni ;
   private java.math.BigDecimal A93ArtPreMtr ;
   private java.math.BigDecimal A92ArtPreKgm ;
   private java.math.BigDecimal A587IntPreMtr ;
   private java.math.BigDecimal A586IntPreKgm ;
   private java.math.BigDecimal A675PorRec ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV18PArtCod ;
   private String AV19UArtCod ;
   private String AV21Lit0 ;
   private String AV22Lit1 ;
   private String AV23Lit2 ;
   private String AV24Lit3 ;
   private String AV25Lit4 ;
   private String AV26Lit5 ;
   private String AV27Lit6 ;
   private String AV28Lit7 ;
   private String AV29Lit8 ;
   private String AV30Lit9 ;
   private String AV31Lit10 ;
   private String AV32Lit11 ;
   private String AV33Lit12 ;
   private String AV34Lit13 ;
   private String AV35Lit14 ;
   private String AV36Lit15 ;
   private String AV37Lit16 ;
   private String AV38Lit17 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A279CliNom ;
   private String A69ArtDsc ;
   private String A407EmprNom ;
   private String AV45Imprimir ;
   private String AV44Entre ;
   private String A832TipColDsc ;
   private String A584IntDsc ;
   private String A3616PreFacCod ;
   private String A585IntPreDef ;
   private String AV48IntDes ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean GxHdr2 ;
   private boolean brk6G32 ;
   private boolean n93ArtPreMtr ;
   private boolean n92ArtPreKgm ;
   private boolean n69ArtDsc ;
   private boolean n407EmprNom ;
   private boolean n587IntPreMtr ;
   private boolean n586IntPreKgm ;
   private boolean n675PorRec ;
   private boolean n596LimUni ;
   private boolean n832TipColDsc ;
   private boolean n584IntDsc ;
   private boolean n3616PreFacCod ;
   private boolean n585IntPreDef ;
   private IDataStoreProvider pr_default ;
   private String[] P06G32_A396EmprCod ;
   private String[] P06G32_A65ArtCod ;
   private int[] P06G32_A252CliCod ;
   private java.math.BigDecimal[] P06G32_A93ArtPreMtr ;
   private boolean[] P06G32_n93ArtPreMtr ;
   private java.math.BigDecimal[] P06G32_A92ArtPreKgm ;
   private boolean[] P06G32_n92ArtPreKgm ;
   private String[] P06G32_A279CliNom ;
   private String[] P06G32_A69ArtDsc ;
   private boolean[] P06G32_n69ArtDsc ;
   private String[] P06G32_A407EmprNom ;
   private boolean[] P06G32_n407EmprNom ;
   private String[] P06G33_A396EmprCod ;
   private int[] P06G33_A252CliCod ;
   private String[] P06G33_A65ArtCod ;
   private java.math.BigDecimal[] P06G33_A587IntPreMtr ;
   private boolean[] P06G33_n587IntPreMtr ;
   private java.math.BigDecimal[] P06G33_A586IntPreKgm ;
   private boolean[] P06G33_n586IntPreKgm ;
   private byte[] P06G33_A583IntCod ;
   private byte[] P06G33_A831TipColCod ;
   private String[] P06G34_A396EmprCod ;
   private int[] P06G34_A252CliCod ;
   private String[] P06G34_A65ArtCod ;
   private java.math.BigDecimal[] P06G34_A675PorRec ;
   private boolean[] P06G34_n675PorRec ;
   private int[] P06G34_A596LimUni ;
   private boolean[] P06G34_n596LimUni ;
   private byte[] P06G34_A598LinRec ;
   private String[] P06G35_A396EmprCod ;
   private int[] P06G35_A252CliCod ;
   private String[] P06G35_A65ArtCod ;
   private byte[] P06G35_A831TipColCod ;
   private String[] P06G35_A832TipColDsc ;
   private boolean[] P06G35_n832TipColDsc ;
   private String[] P06G36_A396EmprCod ;
   private int[] P06G36_A252CliCod ;
   private String[] P06G36_A65ArtCod ;
   private byte[] P06G36_A831TipColCod ;
   private String[] P06G36_A584IntDsc ;
   private boolean[] P06G36_n584IntDsc ;
   private java.math.BigDecimal[] P06G36_A587IntPreMtr ;
   private boolean[] P06G36_n587IntPreMtr ;
   private java.math.BigDecimal[] P06G36_A586IntPreKgm ;
   private boolean[] P06G36_n586IntPreKgm ;
   private String[] P06G36_A3616PreFacCod ;
   private boolean[] P06G36_n3616PreFacCod ;
   private String[] P06G36_A585IntPreDef ;
   private boolean[] P06G36_n585IntPreDef ;
   private byte[] P06G36_A583IntCod ;
}

final  class rmei001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06G32", "SELECT T1.EmprCod, T1.ArtCod, T1.CliCod, T1.ArtPreMtr, T1.ArtPreKgm, T3.CliNom, T1.ArtDsc, T2.EmprNom FROM ((TXPARTICU T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.ArtCod >= ?) AND (T1.ArtCod <= ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06G33", "SELECT EmprCod, CliCod, ArtCod, IntPreMtr, IntPreKgm, IntCod, TipColCod FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06G34", "SELECT EmprCod, CliCod, ArtCod, PorRec, LimUni, LinRec FROM TXPRECARG WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06G35", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.TipColCod, T2.TipColDsc FROM (TXPPRETCO T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06G36", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.TipColCod, T2.IntDsc, T1.IntPreMtr, T1.IntPreKgm, T1.PreFacCod, T1.IntPreDef, T1.IntCod FROM (TXPPRETIN T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.TipColCod, T1.IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

