package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rst0009a_impl extends GXWebReport
{
   public rst0009a_impl( com.genexus.internet.HttpContext context )
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
            AV16PPrd = httpContext.GetPar( "PPrd") ;
            AV17UPrd = httpContext.GetPar( "UPrd") ;
            AV48CC = (byte)(GXutil.lval( httpContext.GetPar( "CC"))) ;
            AV51xls = (byte)(GXutil.lval( httpContext.GetPar( "xls"))) ;
            Gx_out = httpContext.GetPar( "Gx_out") ;
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
         super.Gx_out = this.Gx_out ;
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
         GXt_char1 = AV27Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rst0009a_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit0 = GXt_char1 ;
         GXt_char1 = AV28Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rst0009a_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit1 = GXt_char1 ;
         GXt_char1 = AV29Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2001_", ""), (byte)(99), GXv_char2) ;
         rst0009a_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit2 = GXt_char1 ;
         GXt_char1 = AV30Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rst0009a_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit3 = GXt_char1 ;
         GXt_char1 = AV31Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2341_", ""), (byte)(99), GXv_char2) ;
         rst0009a_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit4 = GXt_char1 ;
         GXt_char1 = AV32Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2441_", ""), (byte)(99), GXv_char2) ;
         rst0009a_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit5 = GXt_char1 ;
         GXt_char1 = AV33Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2541_", ""), (byte)(99), GXv_char2) ;
         rst0009a_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit6 = GXt_char1 ;
         GXt_char1 = AV34Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2445_", ""), (byte)(99), GXv_char2) ;
         rst0009a_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit7 = GXt_char1 ;
         GXt_char1 = AV35Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2487_", ""), (byte)(99), GXv_char2) ;
         rst0009a_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit8 = GXt_char1 ;
         GXt_char1 = AV36Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2488_", ""), (byte)(99), GXv_char2) ;
         rst0009a_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit9 = GXt_char1 ;
         GXt_char1 = AV37Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2489_", ""), (byte)(99), GXv_char2) ;
         rst0009a_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit10 = GXt_char1 ;
         GXt_char1 = AV38Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2490_", ""), (byte)(99), GXv_char2) ;
         rst0009a_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit11 = GXt_char1 ;
         AV47Lit12 = httpContext.getMessage( "P.U.", "") ;
         AV39FlagPreMed = (byte)(1) ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = AV39FlagPreMed ;
         GXv_int4[0] = AV48CC ;
         new app.pordstk1(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4) ;
         rst0009a_impl.this.A396EmprCod = GXv_char2[0] ;
         rst0009a_impl.this.AV39FlagPreMed = GXv_int3[0] ;
         rst0009a_impl.this.AV48CC = GXv_int4[0] ;
         /* Using cursor P07FC2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07FC2_A407EmprNom[0] ;
            n407EmprNom = P07FC2_n407EmprNom[0] ;
            AV19NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV20TotValInf = DecimalUtil.doubleToDec(0) ;
         AV24PorcTot = DecimalUtil.doubleToDec(0) ;
         AV26Flag = (byte)(1) ;
         AV21TotExi = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P07FC3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV16PPrd, AV17UPrd});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P07FC3_A719PrdNum[0] ;
            A724PrdPreAct = P07FC3_A724PrdPreAct[0] ;
            A726PrdPreMed = P07FC3_A726PrdPreMed[0] ;
            A704PrdExiAlm = P07FC3_A704PrdExiAlm[0] ;
            A705PrdExiCC = P07FC3_A705PrdExiCC[0] ;
            A332DifValStk = P07FC3_A332DifValStk[0] ;
            AV44PrdPre = ((AV39FlagPreMed==1) ? A726PrdPreMed : A724PrdPreAct) ;
            AV49PrdExi = ((AV48CC==1) ? A705PrdExiCC : A704PrdExiAlm) ;
            if ( ( AV49PrdExi.doubleValue() != 0 ) && ( (A705PrdExiCC.multiply(AV44PrdPre)).doubleValue() != 0 ) )
            {
               AV21TotExi = AV21TotExi.add(((AV49PrdExi.multiply(AV44PrdPre)))) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV52Fila = 8 ;
         /* Using cursor P07FC4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV16PPrd, AV17UPrd});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A719PrdNum = P07FC4_A719PrdNum[0] ;
            A724PrdPreAct = P07FC4_A724PrdPreAct[0] ;
            A726PrdPreMed = P07FC4_A726PrdPreMed[0] ;
            A704PrdExiAlm = P07FC4_A704PrdExiAlm[0] ;
            A705PrdExiCC = P07FC4_A705PrdExiCC[0] ;
            A718PrdNom = P07FC4_A718PrdNom[0] ;
            A332DifValStk = P07FC4_A332DifValStk[0] ;
            AV44PrdPre = ((AV39FlagPreMed==1) ? A726PrdPreMed : A724PrdPreAct) ;
            AV49PrdExi = ((AV48CC==1) ? A705PrdExiCC : A704PrdExiAlm) ;
            if ( ( AV49PrdExi.doubleValue() != 0 ) && ( (AV49PrdExi.multiply(AV44PrdPre)).doubleValue() != 0 ) )
            {
               AV26Flag = (byte)(((AV26Flag==3) ? 4 : AV26Flag)) ;
               AV42PrdValstk = AV49PrdExi.multiply(AV44PrdPre) ;
               AV22PorcSub = ((AV21TotExi.doubleValue()>0) ? AV42PrdValstk.multiply(DecimalUtil.doubleToDec(100)).divide(AV21TotExi, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
               AV23PorcGrp = AV23PorcGrp.add(AV22PorcSub) ;
               AV24PorcTot = AV24PorcTot.add(AV22PorcSub) ;
               AV25TotGrp = AV25TotGrp.add(AV42PrdValstk) ;
               AV20TotValInf = AV20TotValInf.add(AV42PrdValstk) ;
               AV40TotExis = AV40TotExis.add(AV49PrdExi) ;
               AV41PrdExiAlm = AV49PrdExi ;
               h7FC0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 27, Gx_line+0, 72, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 78, Gx_line+0, 269, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41PrdExiAlm, "Z,ZZZ,ZZ9.9999")), 304, Gx_line+0, 407, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42PrdValstk, "ZZZ,ZZZ,ZZ9.99")), 586, Gx_line+0, 689, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22PorcSub, "ZZ9.99")), 723, Gx_line+0, 768, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44PrdPre, "Z,ZZZ,ZZ9.99")), 472, Gx_line+0, 561, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               if ( ( AV24PorcTot.doubleValue() >= 80 ) && ( AV26Flag == 1 ) )
               {
                  AV46Lit = AV35Lit8 ;
                  /* Execute user subroutine: 'GRUPO' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV26Flag = (byte)(2) ;
               }
               if ( ( AV24PorcTot.doubleValue() >= 95 ) && ( AV26Flag == 2 ) && ( AV25TotGrp.doubleValue() != 0 ) )
               {
                  AV46Lit = AV36Lit9 ;
                  /* Execute user subroutine: 'GRUPO' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV26Flag = (byte)(3) ;
               }
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( ( AV26Flag == 4 ) && ( AV25TotGrp.doubleValue() != 0 ) )
         {
            AV46Lit = AV37Lit10 ;
            /* Execute user subroutine: 'GRUPO' */
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
         }
         h7FC0( false, 36) ;
         getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit11, "")), 124, Gx_line+9, 233, Gx_line+27, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20TotValInf, "ZZZ,ZZZ,ZZ9.99")), 586, Gx_line+9, 689, Gx_line+27, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24PorcTot, "ZZ9.99")), 723, Gx_line+9, 768, Gx_line+27, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(14, Gx_line+3, 804, Gx_line+32, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7FC0( true, 0) ;
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
      /* 'GRUPO' Routine */
      returnInSub = false ;
      h7FC0( false, 33) ;
      getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25TotGrp, "ZZZ,ZZZ,ZZ9.99")), 586, Gx_line+9, 689, Gx_line+27, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23PorcGrp, "ZZ9.99")), 723, Gx_line+9, 768, Gx_line+27, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawRect(14, Gx_line+3, 804, Gx_line+32, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40TotExis, "Z,ZZZ,ZZ9.9999")), 304, Gx_line+9, 407, Gx_line+27, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit, "")), 123, Gx_line+9, 291, Gx_line+27, 0+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+33) ;
      AV23PorcGrp = DecimalUtil.doubleToDec(0) ;
      AV25TotGrp = DecimalUtil.doubleToDec(0) ;
      AV40TotExis = DecimalUtil.doubleToDec(0) ;
   }

   public void h7FC0( boolean bFoot ,
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
            AV45MsgPreMed = ((AV39FlagPreMed==1) ? httpContext.getMessage( "Precio Medio", "") : httpContext.getMessage( "Precio Actual", "")) ;
            AV50MsgAlm = ((AV48CC==1) ? httpContext.getMessage( "Cuarto de Colores", "") : httpContext.getMessage( "Almacen", "")) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19NomEmp, "")), 15, Gx_line+17, 266, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit0, "")), 546, Gx_line+17, 583, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 604, Gx_line+17, 663, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit1, "")), 684, Gx_line+17, 714, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 745, Gx_line+17, 804, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit2, "")), 15, Gx_line+50, 329, Gx_line+70, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit3, "")), 702, Gx_line+51, 747, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 759, Gx_line+50, 804, Gx_line+67, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 770, Gx_line+85, 778, Gx_line+102, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit4, "")), 27, Gx_line+84, 137, Gx_line+102, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit5, "")), 297, Gx_line+84, 407, Gx_line+102, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit6, "")), 608, Gx_line+84, 689, Gx_line+102, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit7, "")), 721, Gx_line+84, 766, Gx_line+102, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "(WST0009A)", ""), 336, Gx_line+51, 410, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+73, 816, Gx_line+73, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+104, 816, Gx_line+104, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45MsgPreMed, "")), 418, Gx_line+51, 528, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit12, "")), 450, Gx_line+84, 560, Gx_line+102, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50MsgAlm, "")), 541, Gx_line+51, 666, Gx_line+68, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+106) ;
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
      AV15ImpCod = "" ;
      AV16PPrd = "" ;
      AV17UPrd = "" ;
      AV27Lit0 = "" ;
      AV28Lit1 = "" ;
      AV29Lit2 = "" ;
      AV30Lit3 = "" ;
      AV31Lit4 = "" ;
      AV32Lit5 = "" ;
      AV33Lit6 = "" ;
      AV34Lit7 = "" ;
      AV35Lit8 = "" ;
      AV36Lit9 = "" ;
      AV37Lit10 = "" ;
      AV38Lit11 = "" ;
      GXt_char1 = "" ;
      AV47Lit12 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P07FC2_A396EmprCod = new String[] {""} ;
      P07FC2_A407EmprNom = new String[] {""} ;
      P07FC2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV19NomEmp = "" ;
      AV20TotValInf = DecimalUtil.ZERO ;
      AV24PorcTot = DecimalUtil.ZERO ;
      AV21TotExi = DecimalUtil.ZERO ;
      P07FC3_A396EmprCod = new String[] {""} ;
      P07FC3_A719PrdNum = new String[] {""} ;
      P07FC3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07FC3_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07FC3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07FC3_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07FC3_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A332DifValStk = DecimalUtil.ZERO ;
      AV44PrdPre = DecimalUtil.ZERO ;
      AV49PrdExi = DecimalUtil.ZERO ;
      P07FC4_A396EmprCod = new String[] {""} ;
      P07FC4_A719PrdNum = new String[] {""} ;
      P07FC4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07FC4_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07FC4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07FC4_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07FC4_A718PrdNom = new String[] {""} ;
      P07FC4_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A718PrdNom = "" ;
      AV42PrdValstk = DecimalUtil.ZERO ;
      AV22PorcSub = DecimalUtil.ZERO ;
      AV23PorcGrp = DecimalUtil.ZERO ;
      AV25TotGrp = DecimalUtil.ZERO ;
      AV40TotExis = DecimalUtil.ZERO ;
      AV41PrdExiAlm = DecimalUtil.ZERO ;
      AV46Lit = "" ;
      AV45MsgPreMed = "" ;
      AV50MsgAlm = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rst0009a__default(),
         new Object[] {
             new Object[] {
            P07FC2_A396EmprCod, P07FC2_A407EmprNom, P07FC2_n407EmprNom
            }
            , new Object[] {
            P07FC3_A396EmprCod, P07FC3_A719PrdNum, P07FC3_A724PrdPreAct, P07FC3_A726PrdPreMed, P07FC3_A704PrdExiAlm, P07FC3_A705PrdExiCC, P07FC3_A332DifValStk
            }
            , new Object[] {
            P07FC4_A396EmprCod, P07FC4_A719PrdNum, P07FC4_A724PrdPreAct, P07FC4_A726PrdPreMed, P07FC4_A704PrdExiAlm, P07FC4_A705PrdExiCC, P07FC4_A718PrdNom, P07FC4_A332DifValStk
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

   private byte AV48CC ;
   private byte AV51xls ;
   private byte AV39FlagPreMed ;
   private byte GXv_int3[] ;
   private byte GXv_int4[] ;
   private byte AV26Flag ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private long AV52Fila ;
   private java.math.BigDecimal AV20TotValInf ;
   private java.math.BigDecimal AV24PorcTot ;
   private java.math.BigDecimal AV21TotExi ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A332DifValStk ;
   private java.math.BigDecimal AV44PrdPre ;
   private java.math.BigDecimal AV49PrdExi ;
   private java.math.BigDecimal AV42PrdValstk ;
   private java.math.BigDecimal AV22PorcSub ;
   private java.math.BigDecimal AV23PorcGrp ;
   private java.math.BigDecimal AV25TotGrp ;
   private java.math.BigDecimal AV40TotExis ;
   private java.math.BigDecimal AV41PrdExiAlm ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV16PPrd ;
   private String AV17UPrd ;
   private String AV27Lit0 ;
   private String AV28Lit1 ;
   private String AV29Lit2 ;
   private String AV30Lit3 ;
   private String AV31Lit4 ;
   private String AV32Lit5 ;
   private String AV33Lit6 ;
   private String AV34Lit7 ;
   private String AV35Lit8 ;
   private String AV36Lit9 ;
   private String AV37Lit10 ;
   private String AV38Lit11 ;
   private String GXt_char1 ;
   private String AV47Lit12 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV19NomEmp ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV46Lit ;
   private String AV45MsgPreMed ;
   private String AV50MsgAlm ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P07FC2_A396EmprCod ;
   private String[] P07FC2_A407EmprNom ;
   private boolean[] P07FC2_n407EmprNom ;
   private String[] P07FC3_A396EmprCod ;
   private String[] P07FC3_A719PrdNum ;
   private java.math.BigDecimal[] P07FC3_A724PrdPreAct ;
   private java.math.BigDecimal[] P07FC3_A726PrdPreMed ;
   private java.math.BigDecimal[] P07FC3_A704PrdExiAlm ;
   private java.math.BigDecimal[] P07FC3_A705PrdExiCC ;
   private java.math.BigDecimal[] P07FC3_A332DifValStk ;
   private String[] P07FC4_A396EmprCod ;
   private String[] P07FC4_A719PrdNum ;
   private java.math.BigDecimal[] P07FC4_A724PrdPreAct ;
   private java.math.BigDecimal[] P07FC4_A726PrdPreMed ;
   private java.math.BigDecimal[] P07FC4_A704PrdExiAlm ;
   private java.math.BigDecimal[] P07FC4_A705PrdExiCC ;
   private String[] P07FC4_A718PrdNom ;
   private java.math.BigDecimal[] P07FC4_A332DifValStk ;
}

final  class rst0009a__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07FC2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07FC3", "SELECT EmprCod, PrdNum, PrdPreAct, PrdPreMed, PrdExiAlm, PrdExiCC, DifValStk FROM TXPPRODUC WHERE (EmprCod = ?) AND (PrdNum >= ? and PrdNum <= ?) ORDER BY DifValStk ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07FC4", "SELECT EmprCod, PrdNum, PrdPreAct, PrdPreMed, PrdExiAlm, PrdExiCC, PrdNom, DifValStk FROM TXPPRODUC WHERE (EmprCod = ?) AND (PrdNum >= ? and PrdNum <= ?) ORDER BY DifValStk ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

