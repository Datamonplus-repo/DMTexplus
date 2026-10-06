package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rco0010_impl extends GXWebReport
{
   public rco0010_impl( com.genexus.internet.HttpContext context )
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
            AV27ImpCod = httpContext.GetPar( "ImpCod") ;
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         GXt_char1 = AV11Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT724_", ""), (byte)(99), GXv_char2) ;
         rco0010_impl.this.GXt_char1 = GXv_char2[0] ;
         AV11Lit0 = GXt_char1 ;
         GXt_char1 = AV9Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rco0010_impl.this.GXt_char1 = GXv_char2[0] ;
         AV9Lit1 = GXt_char1 ;
         GXt_char1 = AV10Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rco0010_impl.this.GXt_char1 = GXv_char2[0] ;
         AV10Lit2 = GXt_char1 ;
         GXt_char1 = AV12Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rco0010_impl.this.GXt_char1 = GXv_char2[0] ;
         AV12Lit3 = GXt_char1 ;
         GXt_char1 = AV14Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char2) ;
         rco0010_impl.this.GXt_char1 = GXv_char2[0] ;
         AV14Lit4 = GXt_char1 ;
         GXt_char1 = AV15Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3005_", ""), (byte)(99), GXv_char2) ;
         rco0010_impl.this.GXt_char1 = GXv_char2[0] ;
         AV15Lit5 = GXt_char1 ;
         GXt_char1 = AV16Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1020_", ""), (byte)(99), GXv_char2) ;
         rco0010_impl.this.GXt_char1 = GXv_char2[0] ;
         AV16Lit6 = GXt_char1 ;
         GXt_char1 = AV17Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN495_", ""), (byte)(99), GXv_char2) ;
         rco0010_impl.this.GXt_char1 = GXv_char2[0] ;
         AV17Lit7 = GXt_char1 ;
         GXt_char1 = AV18Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT398_", ""), (byte)(99), GXv_char2) ;
         rco0010_impl.this.GXt_char1 = GXv_char2[0] ;
         AV18Lit8 = GXt_char1 ;
         GXt_char1 = AV19Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN118_", ""), (byte)(99), GXv_char2) ;
         rco0010_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit9 = GXt_char1 ;
         GXt_char1 = AV20Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1367_", ""), (byte)(99), GXv_char2) ;
         rco0010_impl.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit10 = GXt_char1 ;
         GXt_char1 = AV13Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN523_", ""), (byte)(99), GXv_char2) ;
         rco0010_impl.this.GXt_char1 = GXv_char2[0] ;
         AV13Lit11 = GXt_char1 ;
         GXt_char1 = AV22Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN459_", ""), (byte)(99), GXv_char2) ;
         rco0010_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit12 = GXt_char1 ;
         GXt_char1 = AV21Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN215_", ""), (byte)(99), GXv_char2) ;
         rco0010_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit13 = GXt_char1 ;
         AV28Lit14 = httpContext.getMessage( "Val.", "") ;
         AV29lit15 = httpContext.getMessage( "Emb.", "") ;
         GXt_char1 = AV33Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1061_", ""), (byte)(99), GXv_char2) ;
         rco0010_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit16 = GXt_char1 ;
         AV33Lit16 += ":" ;
         GXt_char1 = AV34Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN118_", ""), (byte)(99), GXv_char2) ;
         rco0010_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit17 = GXt_char1 ;
         /* Using cursor P06T12 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06T12_A407EmprNom[0] ;
            n407EmprNom = P06T12_n407EmprNom[0] ;
            AV8NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXt_int3 = AV30PorMin ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char4[0] = httpContext.getMessage( "%STKMI", "") ;
         GXv_int5[0] = GXt_int3 ;
         new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char4, GXv_int5) ;
         rco0010_impl.this.A396EmprCod = GXv_char2[0] ;
         rco0010_impl.this.GXt_int3 = GXv_int5[0] ;
         AV30PorMin = (byte)(GXt_int3) ;
         AV35Last_prov = 0 ;
         /* Using cursor P06T13 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6T14 = false ;
            A795PrvNum = P06T13_A795PrvNum[0] ;
            A756PrePrvNum = P06T13_A756PrePrvNum[0] ;
            A856ValCod = P06T13_A856ValCod[0] ;
            A684PrdCanPen = P06T13_A684PrdCanPen[0] ;
            A755PrePedUni = P06T13_A755PrePedUni[0] ;
            n755PrePedUni = P06T13_n755PrePedUni[0] ;
            A685PrdCanRes = P06T13_A685PrdCanRes[0] ;
            A704PrdExiAlm = P06T13_A704PrdExiAlm[0] ;
            A732PrdStkMinU = P06T13_A732PrdStkMinU[0] ;
            A716PrdLotMin = P06T13_A716PrdLotMin[0] ;
            A718PrdNom = P06T13_A718PrdNom[0] ;
            A719PrdNum = P06T13_A719PrdNum[0] ;
            A801PrvRep = P06T13_A801PrvRep[0] ;
            n801PrvRep = P06T13_n801PrvRep[0] ;
            A803PrvTlf = P06T13_A803PrvTlf[0] ;
            n803PrvTlf = P06T13_n803PrvTlf[0] ;
            A795PrvNum = P06T13_A795PrvNum[0] ;
            A856ValCod = P06T13_A856ValCod[0] ;
            A684PrdCanPen = P06T13_A684PrdCanPen[0] ;
            A685PrdCanRes = P06T13_A685PrdCanRes[0] ;
            A704PrdExiAlm = P06T13_A704PrdExiAlm[0] ;
            A732PrdStkMinU = P06T13_A732PrdStkMinU[0] ;
            A716PrdLotMin = P06T13_A716PrdLotMin[0] ;
            A718PrdNom = P06T13_A718PrdNom[0] ;
            A801PrvRep = P06T13_A801PrvRep[0] ;
            n801PrvRep = P06T13_n801PrvRep[0] ;
            A803PrvTlf = P06T13_A803PrvTlf[0] ;
            n803PrvTlf = P06T13_n803PrvTlf[0] ;
            AV36PrvNum = A756PrePrvNum ;
            /* Execute user subroutine: 'PRVGEN' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            h6T10( false, 31) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36PrvNum), "ZZZZZ9")), 23, Gx_line+9, 68, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37PrvNom, "")), 71, Gx_line+9, 291, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A803PrvTlf, "")), 436, Gx_line+9, 568, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit10, "")), 299, Gx_line+9, 424, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A801PrvRep, "")), 618, Gx_line+9, 765, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit16, "")), 576, Gx_line+9, 613, Gx_line+25, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+31) ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06T13_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06T13_A756PrePrvNum[0] == A756PrePrvNum ) )
            {
               brk6T14 = false ;
               A856ValCod = P06T13_A856ValCod[0] ;
               A684PrdCanPen = P06T13_A684PrdCanPen[0] ;
               A755PrePedUni = P06T13_A755PrePedUni[0] ;
               n755PrePedUni = P06T13_n755PrePedUni[0] ;
               A685PrdCanRes = P06T13_A685PrdCanRes[0] ;
               A704PrdExiAlm = P06T13_A704PrdExiAlm[0] ;
               A732PrdStkMinU = P06T13_A732PrdStkMinU[0] ;
               A716PrdLotMin = P06T13_A716PrdLotMin[0] ;
               A718PrdNom = P06T13_A718PrdNom[0] ;
               A719PrdNum = P06T13_A719PrdNum[0] ;
               A856ValCod = P06T13_A856ValCod[0] ;
               A684PrdCanPen = P06T13_A684PrdCanPen[0] ;
               A685PrdCanRes = P06T13_A685PrdCanRes[0] ;
               A704PrdExiAlm = P06T13_A704PrdExiAlm[0] ;
               A732PrdStkMinU = P06T13_A732PrdStkMinU[0] ;
               A716PrdLotMin = P06T13_A716PrdLotMin[0] ;
               A718PrdNom = P06T13_A718PrdNom[0] ;
               AV31ValCod = "" ;
               if ( A856ValCod != 1 )
               {
                  AV31ValCod = GXutil.str( A856ValCod, 1, 0) ;
               }
               AV24CantPend = A684PrdCanPen ;
               AV26PrePedUni = (int)(DecimalUtil.decToDouble(A755PrePedUni)) ;
               AV23StkRea = A704PrdExiAlm.subtract(A685PrdCanRes).add(A684PrdCanPen) ;
               h6T10( false, 17) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 16, Gx_line+0, 61, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 64, Gx_line+0, 255, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999")), 443, Gx_line+0, 532, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999")), 350, Gx_line+0, 439, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23StkRea, "ZZZZZZ9.9999")), 534, Gx_line+0, 623, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A716PrdLotMin), "ZZZ9")), 691, Gx_line+0, 721, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31ValCod, "")), 258, Gx_line+0, 266, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24CantPend, "ZZZZ9.9999")), 271, Gx_line+0, 345, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A732PrdStkMinU, "ZZZZ9.99")), 627, Gx_line+0, 686, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26PrePedUni), "ZZZZZZ9")), 726, Gx_line+0, 778, Gx_line+16, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               brk6T14 = true ;
               pr_default.readNext(1);
            }
            if ( ! brk6T14 )
            {
               brk6T14 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6T10( true, 0) ;
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
      /* 'PRVGEN' Routine */
      returnInSub = false ;
      AV37PrvNom = GXutil.space( (short)(30)) ;
      AV38PrvTlf = GXutil.space( (short)(18)) ;
      AV39PrvRep = GXutil.space( (short)(20)) ;
      /* Using cursor P06T14 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV36PrvNum)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A795PrvNum = P06T14_A795PrvNum[0] ;
         A794PrvNom = P06T14_A794PrvNom[0] ;
         n794PrvNom = P06T14_n794PrvNom[0] ;
         A803PrvTlf = P06T14_A803PrvTlf[0] ;
         n803PrvTlf = P06T14_n803PrvTlf[0] ;
         A801PrvRep = P06T14_A801PrvRep[0] ;
         n801PrvRep = P06T14_n801PrvRep[0] ;
         AV37PrvNom = A794PrvNom ;
         AV38PrvTlf = A803PrvTlf ;
         AV39PrvRep = A801PrvRep ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void h6T10( boolean bFoot ,
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
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8NomEmp, "")), 15, Gx_line+10, 266, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Lit0, "")), 282, Gx_line+10, 533, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Lit11, "")), 498, Gx_line+46, 543, Gx_line+62, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Lit4, "")), 16, Gx_line+70, 75, Gx_line+86, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Lit5, "")), 465, Gx_line+70, 532, Gx_line+86, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Lit6, "")), 386, Gx_line+70, 438, Gx_line+86, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Lit7, "")), 549, Gx_line+70, 623, Gx_line+86, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Lit8, "")), 642, Gx_line+70, 687, Gx_line+86, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+89, 792, Gx_line+89, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(294, Gx_line+53, 474, Gx_line+53, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(567, Gx_line+53, 713, Gx_line+53, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit12, "")), 733, Gx_line+70, 778, Gx_line+86, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit13, "")), 285, Gx_line+70, 344, Gx_line+86, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit14, "")), 248, Gx_line+70, 278, Gx_line+86, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29lit15, "")), 691, Gx_line+70, 721, Gx_line+86, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 628, Gx_line+11, 636, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("/", 684, Gx_line+11, 692, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 736, Gx_line+11, 781, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 616, Gx_line+11, 675, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 729, Gx_line+11, 737, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 561, Gx_line+11, 591, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pág.", ""), 702, Gx_line+11, 732, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Stkmi:", ""), 716, Gx_line+47, 761, Gx_line+62, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30PorMin), "Z9")), 764, Gx_line+47, 780, Gx_line+63, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 781, Gx_line+47, 789, Gx_line+62, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+96) ;
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
      AV27ImpCod = "" ;
      AV11Lit0 = "" ;
      AV9Lit1 = "" ;
      AV10Lit2 = "" ;
      AV12Lit3 = "" ;
      AV14Lit4 = "" ;
      AV15Lit5 = "" ;
      AV16Lit6 = "" ;
      AV17Lit7 = "" ;
      AV18Lit8 = "" ;
      AV19Lit9 = "" ;
      AV20Lit10 = "" ;
      AV13Lit11 = "" ;
      AV22Lit12 = "" ;
      AV21Lit13 = "" ;
      AV28Lit14 = "" ;
      AV29lit15 = "" ;
      AV33Lit16 = "" ;
      AV34Lit17 = "" ;
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P06T12_A396EmprCod = new String[] {""} ;
      P06T12_A407EmprNom = new String[] {""} ;
      P06T12_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV8NomEmp = "" ;
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      P06T13_A795PrvNum = new int[1] ;
      P06T13_A396EmprCod = new String[] {""} ;
      P06T13_A756PrePrvNum = new int[1] ;
      P06T13_A856ValCod = new byte[1] ;
      P06T13_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06T13_A755PrePedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06T13_n755PrePedUni = new boolean[] {false} ;
      P06T13_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06T13_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06T13_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06T13_A716PrdLotMin = new short[1] ;
      P06T13_A718PrdNom = new String[] {""} ;
      P06T13_A719PrdNum = new String[] {""} ;
      P06T13_A801PrvRep = new String[] {""} ;
      P06T13_n801PrvRep = new boolean[] {false} ;
      P06T13_A803PrvTlf = new String[] {""} ;
      P06T13_n803PrvTlf = new boolean[] {false} ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A755PrePedUni = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A801PrvRep = "" ;
      A803PrvTlf = "" ;
      AV37PrvNom = "" ;
      AV31ValCod = "" ;
      AV24CantPend = DecimalUtil.ZERO ;
      AV23StkRea = DecimalUtil.ZERO ;
      AV38PrvTlf = "" ;
      AV39PrvRep = "" ;
      P06T14_A396EmprCod = new String[] {""} ;
      P06T14_A795PrvNum = new int[1] ;
      P06T14_A794PrvNom = new String[] {""} ;
      P06T14_n794PrvNom = new boolean[] {false} ;
      P06T14_A803PrvTlf = new String[] {""} ;
      P06T14_n803PrvTlf = new boolean[] {false} ;
      P06T14_A801PrvRep = new String[] {""} ;
      P06T14_n801PrvRep = new boolean[] {false} ;
      A794PrvNom = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rco0010__default(),
         new Object[] {
             new Object[] {
            P06T12_A396EmprCod, P06T12_A407EmprNom, P06T12_n407EmprNom
            }
            , new Object[] {
            P06T13_A795PrvNum, P06T13_A396EmprCod, P06T13_A756PrePrvNum, P06T13_A856ValCod, P06T13_A684PrdCanPen, P06T13_A755PrePedUni, P06T13_n755PrePedUni, P06T13_A685PrdCanRes, P06T13_A704PrdExiAlm, P06T13_A732PrdStkMinU,
            P06T13_A716PrdLotMin, P06T13_A718PrdNom, P06T13_A719PrdNum, P06T13_A801PrvRep, P06T13_n801PrvRep, P06T13_A803PrvTlf, P06T13_n803PrvTlf
            }
            , new Object[] {
            P06T14_A396EmprCod, P06T14_A795PrvNum, P06T14_A794PrvNom, P06T14_n794PrvNom, P06T14_A803PrvTlf, P06T14_n803PrvTlf, P06T14_A801PrvRep, P06T14_n801PrvRep
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV30PorMin ;
   private byte A856ValCod ;
   private short gxcookieaux ;
   private short A716PrdLotMin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GXt_int3 ;
   private int GXv_int5[] ;
   private int AV35Last_prov ;
   private int A795PrvNum ;
   private int A756PrePrvNum ;
   private int AV36PrvNum ;
   private int Gx_OldLine ;
   private int AV26PrePedUni ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A755PrePedUni ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal AV24CantPend ;
   private java.math.BigDecimal AV23StkRea ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV27ImpCod ;
   private String AV11Lit0 ;
   private String AV9Lit1 ;
   private String AV10Lit2 ;
   private String AV12Lit3 ;
   private String AV14Lit4 ;
   private String AV15Lit5 ;
   private String AV16Lit6 ;
   private String AV17Lit7 ;
   private String AV18Lit8 ;
   private String AV19Lit9 ;
   private String AV20Lit10 ;
   private String AV13Lit11 ;
   private String AV22Lit12 ;
   private String AV21Lit13 ;
   private String AV28Lit14 ;
   private String AV29lit15 ;
   private String AV33Lit16 ;
   private String AV34Lit17 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV8NomEmp ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A801PrvRep ;
   private String A803PrvTlf ;
   private String AV37PrvNom ;
   private String AV31ValCod ;
   private String AV38PrvTlf ;
   private String AV39PrvRep ;
   private String A794PrvNom ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk6T14 ;
   private boolean n755PrePedUni ;
   private boolean n801PrvRep ;
   private boolean n803PrvTlf ;
   private boolean returnInSub ;
   private boolean n794PrvNom ;
   private IDataStoreProvider pr_default ;
   private String[] P06T12_A396EmprCod ;
   private String[] P06T12_A407EmprNom ;
   private boolean[] P06T12_n407EmprNom ;
   private int[] P06T13_A795PrvNum ;
   private String[] P06T13_A396EmprCod ;
   private int[] P06T13_A756PrePrvNum ;
   private byte[] P06T13_A856ValCod ;
   private java.math.BigDecimal[] P06T13_A684PrdCanPen ;
   private java.math.BigDecimal[] P06T13_A755PrePedUni ;
   private boolean[] P06T13_n755PrePedUni ;
   private java.math.BigDecimal[] P06T13_A685PrdCanRes ;
   private java.math.BigDecimal[] P06T13_A704PrdExiAlm ;
   private java.math.BigDecimal[] P06T13_A732PrdStkMinU ;
   private short[] P06T13_A716PrdLotMin ;
   private String[] P06T13_A718PrdNom ;
   private String[] P06T13_A719PrdNum ;
   private String[] P06T13_A801PrvRep ;
   private boolean[] P06T13_n801PrvRep ;
   private String[] P06T13_A803PrvTlf ;
   private boolean[] P06T13_n803PrvTlf ;
   private String[] P06T14_A396EmprCod ;
   private int[] P06T14_A795PrvNum ;
   private String[] P06T14_A794PrvNom ;
   private boolean[] P06T14_n794PrvNom ;
   private String[] P06T14_A803PrvTlf ;
   private boolean[] P06T14_n803PrvTlf ;
   private String[] P06T14_A801PrvRep ;
   private boolean[] P06T14_n801PrvRep ;
}

final  class rco0010__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06T12", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06T13", "SELECT T2.PrvNum, T1.EmprCod, T1.PrePrvNum, T2.ValCod, T2.PrdCanPen, T1.PrePedUni, T2.PrdCanRes, T2.PrdExiAlm, T2.PrdStkMinU, T2.PrdLotMin, T2.PrdNom, T1.PrdNum, T3.PrvRep, T3.PrvTlf FROM ((TXPPREPED T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T2.PrvNum) WHERE T1.EmprCod = ? ORDER BY T1.EmprCod, T1.PrePrvNum, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06T14", "SELECT EmprCod, PrvNum, PrvNom, PrvTlf, PrvRep FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 18);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 18);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

