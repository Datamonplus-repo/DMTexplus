package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rst0013_impl extends GXWebReport
{
   public rst0013_impl( com.genexus.internet.HttpContext context )
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
            AV29ImpCod = httpContext.GetPar( "ImpCod") ;
            AV50PProd = httpContext.GetPar( "PProd") ;
            AV61UProd = httpContext.GetPar( "UProd") ;
            AV51PProv = (int)(GXutil.lval( httpContext.GetPar( "PProv"))) ;
            AV62UProv = (int)(GXutil.lval( httpContext.GetPar( "UProv"))) ;
            AV63usurcod = httpContext.GetPar( "usurcod") ;
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
      M_bot = 1 ;
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
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV31Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN259_", ""), (byte)(99), GXv_char2) ;
         rst0013_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit0 = GXt_char1 ;
         GXt_char1 = AV32Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rst0013_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit1 = GXt_char1 ;
         GXt_char1 = AV37Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rst0013_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit2 = GXt_char1 ;
         GXt_char1 = AV38Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rst0013_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit3 = GXt_char1 ;
         GXt_char1 = AV39Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char2) ;
         rst0013_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit4 = GXt_char1 ;
         GXt_char1 = AV40Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3005_", ""), (byte)(99), GXv_char2) ;
         rst0013_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit5 = GXt_char1 ;
         GXt_char1 = AV41Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1020_", ""), (byte)(99), GXv_char2) ;
         rst0013_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit6 = GXt_char1 ;
         GXt_char1 = AV42Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN495_", ""), (byte)(99), GXv_char2) ;
         rst0013_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit7 = GXt_char1 ;
         GXt_char1 = AV43Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT398_", ""), (byte)(99), GXv_char2) ;
         rst0013_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit8 = GXt_char1 ;
         GXt_char1 = AV44Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN118_", ""), (byte)(99), GXv_char2) ;
         rst0013_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit9 = GXt_char1 ;
         GXt_char1 = AV33Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1367_", ""), (byte)(99), GXv_char2) ;
         rst0013_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit10 = GXt_char1 ;
         GXt_char1 = AV34Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN523_", ""), (byte)(99), GXv_char2) ;
         rst0013_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit11 = GXt_char1 ;
         GXt_char1 = AV35Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN459_", ""), (byte)(99), GXv_char2) ;
         rst0013_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit12 = GXt_char1 ;
         GXt_char1 = AV36Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1302_", ""), (byte)(99), GXv_char2) ;
         rst0013_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit13 = GXt_char1 ;
         GXt_int3 = AV30Induyco ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INDUYC", ""), GXv_int4) ;
         rst0013_impl.this.GXt_int3 = GXv_int4[0] ;
         AV30Induyco = GXt_int3 ;
         GXt_int5 = AV19CC ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char6[0] = "011100" ;
         GXv_int7[0] = GXt_int5 ;
         new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char6, GXv_int7) ;
         rst0013_impl.this.A396EmprCod = GXv_char2[0] ;
         rst0013_impl.this.GXt_int5 = GXv_int7[0] ;
         AV19CC = (byte)(GXt_int5) ;
         GXt_int3 = AV49PedCol ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PEDCOL", ""), GXv_int4) ;
         rst0013_impl.this.GXt_int3 = GXv_int4[0] ;
         AV49PedCol = GXt_int3 ;
         GXt_int3 = AV26Etm ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM", ""), GXv_int4) ;
         rst0013_impl.this.GXt_int3 = GXv_int4[0] ;
         AV26Etm = GXt_int3 ;
         /* Using cursor P06HJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06HJ2_A407EmprNom[0] ;
            n407EmprNom = P06HJ2_n407EmprNom[0] ;
            AV47NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06HJ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV50PProd, Integer.valueOf(AV51PProv), Integer.valueOf(AV62UProv), AV61UProd});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A856ValCod = P06HJ3_A856ValCod[0] ;
            A795PrvNum = P06HJ3_A795PrvNum[0] ;
            A719PrdNum = P06HJ3_A719PrdNum[0] ;
            A705PrdExiCC = P06HJ3_A705PrdExiCC[0] ;
            A732PrdStkMinU = P06HJ3_A732PrdStkMinU[0] ;
            A684PrdCanPen = P06HJ3_A684PrdCanPen[0] ;
            A685PrdCanRes = P06HJ3_A685PrdCanRes[0] ;
            A704PrdExiAlm = P06HJ3_A704PrdExiAlm[0] ;
            A707PrdFacCon = P06HJ3_A707PrdFacCon[0] ;
            A721PrdNumUco = P06HJ3_A721PrdNumUco[0] ;
            A629MetCod = P06HJ3_A629MetCod[0] ;
            n629MetCod = P06HJ3_n629MetCod[0] ;
            A696PrdConDia = P06HJ3_A696PrdConDia[0] ;
            A699PrdDiaRot = P06HJ3_A699PrdDiaRot[0] ;
            A716PrdLotMin = P06HJ3_A716PrdLotMin[0] ;
            A803PrvTlf = P06HJ3_A803PrvTlf[0] ;
            n803PrvTlf = P06HJ3_n803PrvTlf[0] ;
            A794PrvNom = P06HJ3_A794PrvNom[0] ;
            n794PrvNom = P06HJ3_n794PrvNom[0] ;
            A718PrdNom = P06HJ3_A718PrdNom[0] ;
            A803PrvTlf = P06HJ3_A803PrvTlf[0] ;
            n803PrvTlf = P06HJ3_n803PrvTlf[0] ;
            A794PrvNom = P06HJ3_A794PrvNom[0] ;
            n794PrvNom = P06HJ3_n794PrvNom[0] ;
            if ( ( ( DecimalUtil.compareTo((A704PrdExiAlm.subtract(A685PrdCanRes).add(A684PrdCanPen)), A732PrdStkMinU) < 0 ) && ( AV19CC == 1 ) && ( AV26Etm == 0 ) ) || ( ( DecimalUtil.compareTo((A704PrdExiAlm.subtract(A685PrdCanRes)), A732PrdStkMinU) < 0 ) && ( AV19CC == 1 ) && ( AV26Etm == 1 ) ) || ( ( DecimalUtil.compareTo((A704PrdExiAlm.subtract(A685PrdCanRes).add(A684PrdCanPen).add(A705PrdExiCC)), A732PrdStkMinU) < 0 ) && ( AV19CC == 0 ) ) )
            {
               AV52PrdExiAlm = A704PrdExiAlm.add(((AV19CC==1) ? DecimalUtil.doubleToDec(0) : A705PrdExiCC)) ;
               AV55StkRea = AV52PrdExiAlm.subtract((A685PrdCanRes.multiply(A707PrdFacCon))) ;
               AV24Dia = GXutil.nullDate() ;
               AV15Any = (short)(GXutil.year( GXutil.today( ))) ;
               GXv_char6[0] = AV67SdtPConCosJSon ;
               GXv_date8[0] = AV24Dia ;
               GXv_date9[0] = AV24Dia ;
               GXv_date10[0] = AV24Dia ;
               GXv_date11[0] = AV24Dia ;
               new app.pconconsdt(remoteHandle, context).execute( A396EmprCod, A719PrdNum, AV15Any, GXv_char6, GXv_date8, GXv_date9, GXv_date10, GXv_date11) ;
               rst0013_impl.this.AV67SdtPConCosJSon = GXv_char6[0] ;
               rst0013_impl.this.AV24Dia = GXv_date8[0] ;
               rst0013_impl.this.AV24Dia = GXv_date9[0] ;
               rst0013_impl.this.AV24Dia = GXv_date10[0] ;
               rst0013_impl.this.AV24Dia = GXv_date11[0] ;
               AV66SdtPConCosCollection.fromJSonString(AV67SdtPConCosJSon, null);
               if ( AV66SdtPConCosCollection.size() > 0 )
               {
                  AV77GXV1 = 1 ;
                  while ( AV77GXV1 <= AV66SdtPConCosCollection.size() )
                  {
                     AV68SdtPConCos = (app.SdtSdtPConCos)((app.SdtSdtPConCos)AV66SdtPConCosCollection.elementAt(-1+AV77GXV1));
                     AV57TotCon = AV57TotCon.add((AV68SdtPConCos.getgxTv_SdtSdtPConCos_Prduniconm())) ;
                     AV77GXV1 = (int)(AV77GXV1+1) ;
                  }
               }
               AV66SdtPConCosCollection.clear();
               AV53PromCon = AV57TotCon.divide(DecimalUtil.doubleToDec(11), 18, java.math.RoundingMode.DOWN) ;
               if ( ( A629MetCod == 0 ) && ( A721PrdNumUco.doubleValue() != 0 ) )
               {
                  AV60UniPed = GXutil.roundDecimal( (DecimalUtil.doubleToDec(A699PrdDiaRot).multiply(A696PrdConDia).divide(A721PrdNumUco, 18, java.math.RoundingMode.DOWN)), 0) ;
               }
               if ( A629MetCod == 1 )
               {
                  if ( A721PrdNumUco.doubleValue() == 0 )
                  {
                     AV16CantPedir = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble((AV53PromCon.multiply(DecimalUtil.doubleToDec(A699PrdDiaRot))).divide(DecimalUtil.doubleToDec(30), 18, java.math.RoundingMode.DOWN)))) ;
                     AV46Multiplo = A716PrdLotMin ;
                     if ( AV46Multiplo == 0 )
                     {
                        AV46Multiplo = (short)(1) ;
                     }
                     if ( GXutil.Int( DecimalUtil.decToDouble(AV16CantPedir.divide(DecimalUtil.doubleToDec(AV46Multiplo), 18, java.math.RoundingMode.DOWN))) == (AV16CantPedir.divide(DecimalUtil.doubleToDec(AV46Multiplo), 18, java.math.RoundingMode.DOWN)).doubleValue() )
                     {
                        AV60UniPed = AV16CantPedir ;
                     }
                     else
                     {
                        AV60UniPed = DecimalUtil.doubleToDec(AV46Multiplo*GXutil.Int( DecimalUtil.decToDouble(AV16CantPedir.divide(DecimalUtil.doubleToDec(AV46Multiplo), 18, java.math.RoundingMode.DOWN)))+AV46Multiplo) ;
                     }
                  }
                  else
                  {
                     AV60UniPed = A721PrdNumUco.multiply(((AV49PedCol==1) ? DecimalUtil.doubleToDec(A716PrdLotMin) : DecimalUtil.doubleToDec(1))) ;
                  }
               }
               if ( A629MetCod == 2 )
               {
                  AV60UniPed = DecimalUtil.doubleToDec(-1) ;
               }
               AV17CantPend = A684PrdCanPen ;
               h6HJ0( false, 17) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 7, Gx_line+0, 52, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 55, Gx_line+0, 246, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999")), 332, Gx_line+0, 421, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV52PrdExiAlm, "ZZZZZZ9.9999")), 427, Gx_line+0, 516, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV55StkRea, "ZZZZZZ9.9999")), 516, Gx_line+0, 605, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A732PrdStkMinU, "ZZZZ9.99")), 604, Gx_line+0, 663, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 716, Gx_line+0, 936, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A803PrvTlf, "")), 935, Gx_line+0, 1067, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60UniPed, "ZZZZZZZ.ZZ")), 1068, Gx_line+0, 1142, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17CantPend, "ZZZZ9.9999")), 253, Gx_line+0, 327, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 668, Gx_line+0, 713, Gx_line+16, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6HJ0( true, 0) ;
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

   public void h6HJ0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47NomEmp, "")), 15, Gx_line+17, 266, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit1, "")), 782, Gx_line+18, 819, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 841, Gx_line+18, 900, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit2, "")), 965, Gx_line+18, 995, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 1030, Gx_line+18, 1089, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit0, "")), 15, Gx_line+50, 329, Gx_line+70, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit3, "")), 965, Gx_line+52, 1010, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1045, Gx_line+52, 1090, Gx_line+68, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit11, "")), 436, Gx_line+96, 481, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit4, "")), 7, Gx_line+117, 66, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit5, "")), 343, Gx_line+117, 410, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit6, "")), 445, Gx_line+117, 497, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit7, "")), 530, Gx_line+117, 604, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit8, "")), 619, Gx_line+117, 664, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit9, "")), 668, Gx_line+117, 793, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit10, "")), 943, Gx_line+117, 1068, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Pgmname, "")), 450, Gx_line+52, 670, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+74, 1141, Gx_line+74, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+138, 1146, Gx_line+138, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(263, Gx_line+102, 431, Gx_line+102, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(485, Gx_line+102, 664, Gx_line+102, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit12, "")), 1097, Gx_line+117, 1142, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit13, "")), 260, Gx_line+117, 319, Gx_line+133, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+141) ;
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
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
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
      AV29ImpCod = "" ;
      AV50PProd = "" ;
      AV61UProd = "" ;
      AV63usurcod = "" ;
      AV31Lit0 = "" ;
      AV32Lit1 = "" ;
      AV37Lit2 = "" ;
      AV38Lit3 = "" ;
      AV39Lit4 = "" ;
      AV40Lit5 = "" ;
      AV41Lit6 = "" ;
      AV42Lit7 = "" ;
      AV43Lit8 = "" ;
      AV44Lit9 = "" ;
      AV33Lit10 = "" ;
      AV34Lit11 = "" ;
      AV35Lit12 = "" ;
      AV36Lit13 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P06HJ2_A396EmprCod = new String[] {""} ;
      P06HJ2_A407EmprNom = new String[] {""} ;
      P06HJ2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV47NomEmp = "" ;
      P06HJ3_A396EmprCod = new String[] {""} ;
      P06HJ3_A856ValCod = new byte[1] ;
      P06HJ3_A795PrvNum = new int[1] ;
      P06HJ3_A719PrdNum = new String[] {""} ;
      P06HJ3_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HJ3_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HJ3_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HJ3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HJ3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HJ3_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HJ3_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HJ3_A629MetCod = new byte[1] ;
      P06HJ3_n629MetCod = new boolean[] {false} ;
      P06HJ3_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HJ3_A699PrdDiaRot = new short[1] ;
      P06HJ3_A716PrdLotMin = new short[1] ;
      P06HJ3_A803PrvTlf = new String[] {""} ;
      P06HJ3_n803PrvTlf = new boolean[] {false} ;
      P06HJ3_A794PrvNom = new String[] {""} ;
      P06HJ3_n794PrvNom = new boolean[] {false} ;
      P06HJ3_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A721PrdNumUco = DecimalUtil.ZERO ;
      A696PrdConDia = DecimalUtil.ZERO ;
      A803PrvTlf = "" ;
      A794PrvNom = "" ;
      A718PrdNom = "" ;
      AV52PrdExiAlm = DecimalUtil.ZERO ;
      AV55StkRea = DecimalUtil.ZERO ;
      AV24Dia = GXutil.nullDate() ;
      AV67SdtPConCosJSon = "" ;
      GXv_char6 = new String[1] ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_date11 = new java.util.Date[1] ;
      AV66SdtPConCosCollection = new GXBaseCollection<app.SdtSdtPConCos>(app.SdtSdtPConCos.class, "SdtPConCos", "TexplusNET", remoteHandle);
      AV68SdtPConCos = new app.SdtSdtPConCos(remoteHandle, context);
      AV57TotCon = DecimalUtil.ZERO ;
      AV53PromCon = DecimalUtil.ZERO ;
      AV60UniPed = DecimalUtil.ZERO ;
      AV16CantPedir = DecimalUtil.ZERO ;
      AV17CantPend = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV75Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rst0013__default(),
         new Object[] {
             new Object[] {
            P06HJ2_A396EmprCod, P06HJ2_A407EmprNom, P06HJ2_n407EmprNom
            }
            , new Object[] {
            P06HJ3_A396EmprCod, P06HJ3_A856ValCod, P06HJ3_A795PrvNum, P06HJ3_A719PrdNum, P06HJ3_A705PrdExiCC, P06HJ3_A732PrdStkMinU, P06HJ3_A684PrdCanPen, P06HJ3_A685PrdCanRes, P06HJ3_A704PrdExiAlm, P06HJ3_A707PrdFacCon,
            P06HJ3_A721PrdNumUco, P06HJ3_A629MetCod, P06HJ3_n629MetCod, P06HJ3_A696PrdConDia, P06HJ3_A699PrdDiaRot, P06HJ3_A716PrdLotMin, P06HJ3_A803PrvTlf, P06HJ3_n803PrvTlf, P06HJ3_A794PrvNom, P06HJ3_n794PrvNom,
            P06HJ3_A718PrdNom
            }
         }
      );
      AV75Pgmname = "RST0013" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV75Pgmname = "RST0013" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV30Induyco ;
   private byte AV19CC ;
   private byte AV49PedCol ;
   private byte AV26Etm ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte A856ValCod ;
   private byte A629MetCod ;
   private short gxcookieaux ;
   private short A699PrdDiaRot ;
   private short A716PrdLotMin ;
   private short AV15Any ;
   private short AV46Multiplo ;
   private short Gx_err ;
   private int AV51PProv ;
   private int AV62UProv ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GXt_int5 ;
   private int GXv_int7[] ;
   private int A795PrvNum ;
   private int AV77GXV1 ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A721PrdNumUco ;
   private java.math.BigDecimal A696PrdConDia ;
   private java.math.BigDecimal AV52PrdExiAlm ;
   private java.math.BigDecimal AV55StkRea ;
   private java.math.BigDecimal AV57TotCon ;
   private java.math.BigDecimal AV53PromCon ;
   private java.math.BigDecimal AV60UniPed ;
   private java.math.BigDecimal AV16CantPedir ;
   private java.math.BigDecimal AV17CantPend ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV29ImpCod ;
   private String AV50PProd ;
   private String AV61UProd ;
   private String AV63usurcod ;
   private String AV31Lit0 ;
   private String AV32Lit1 ;
   private String AV37Lit2 ;
   private String AV38Lit3 ;
   private String AV39Lit4 ;
   private String AV40Lit5 ;
   private String AV41Lit6 ;
   private String AV42Lit7 ;
   private String AV43Lit8 ;
   private String AV44Lit9 ;
   private String AV33Lit10 ;
   private String AV34Lit11 ;
   private String AV35Lit12 ;
   private String AV36Lit13 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV47NomEmp ;
   private String A719PrdNum ;
   private String A803PrvTlf ;
   private String A794PrvNom ;
   private String A718PrdNom ;
   private String GXv_char6[] ;
   private String Gx_time ;
   private String AV75Pgmname ;
   private java.util.Date AV24Dia ;
   private java.util.Date GXv_date8[] ;
   private java.util.Date GXv_date9[] ;
   private java.util.Date GXv_date10[] ;
   private java.util.Date GXv_date11[] ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n629MetCod ;
   private boolean n803PrvTlf ;
   private boolean n794PrvNom ;
   private String AV67SdtPConCosJSon ;
   private IDataStoreProvider pr_default ;
   private String[] P06HJ2_A396EmprCod ;
   private String[] P06HJ2_A407EmprNom ;
   private boolean[] P06HJ2_n407EmprNom ;
   private String[] P06HJ3_A396EmprCod ;
   private byte[] P06HJ3_A856ValCod ;
   private int[] P06HJ3_A795PrvNum ;
   private String[] P06HJ3_A719PrdNum ;
   private java.math.BigDecimal[] P06HJ3_A705PrdExiCC ;
   private java.math.BigDecimal[] P06HJ3_A732PrdStkMinU ;
   private java.math.BigDecimal[] P06HJ3_A684PrdCanPen ;
   private java.math.BigDecimal[] P06HJ3_A685PrdCanRes ;
   private java.math.BigDecimal[] P06HJ3_A704PrdExiAlm ;
   private java.math.BigDecimal[] P06HJ3_A707PrdFacCon ;
   private java.math.BigDecimal[] P06HJ3_A721PrdNumUco ;
   private byte[] P06HJ3_A629MetCod ;
   private boolean[] P06HJ3_n629MetCod ;
   private java.math.BigDecimal[] P06HJ3_A696PrdConDia ;
   private short[] P06HJ3_A699PrdDiaRot ;
   private short[] P06HJ3_A716PrdLotMin ;
   private String[] P06HJ3_A803PrvTlf ;
   private boolean[] P06HJ3_n803PrvTlf ;
   private String[] P06HJ3_A794PrvNom ;
   private boolean[] P06HJ3_n794PrvNom ;
   private String[] P06HJ3_A718PrdNom ;
   private GXBaseCollection<app.SdtSdtPConCos> AV66SdtPConCosCollection ;
   private app.SdtSdtPConCos AV68SdtPConCos ;
}

final  class rst0013__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06HJ2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06HJ3", "SELECT T1.EmprCod, T1.ValCod, T1.PrvNum, T1.PrdNum, T1.PrdExiCC, T1.PrdStkMinU, T1.PrdCanPen, T1.PrdCanRes, T1.PrdExiAlm, T1.PrdFacCon, T1.PrdNumUco, T1.MetCod, T1.PrdConDia, T1.PrdDiaRot, T1.PrdLotMin, T2.PrvTlf, T2.PrvNom, T1.PrdNom FROM (TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) WHERE (T1.EmprCod = ? and T1.PrdNum >= ?) AND (T1.PrvNum >= ? and T1.PrvNum <= ?) AND (T1.ValCod = 1) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 18);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 26);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

