package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rst0029_impl extends GXWebReport
{
   public rst0029_impl( com.genexus.internet.HttpContext context )
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
            AV16UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
            AV77Prdnum1 = httpContext.GetPar( "Prdnum1") ;
            AV78Prdnum2 = httpContext.GetPar( "Prdnum2") ;
            AV76desvios = httpContext.GetPar( "desvios") ;
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
         AV66FlagDifN = (byte)(0) ;
         GXv_int1[0] = AV66FlagDifN ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DIFNEG", ""), GXv_int1) ;
         rst0029_impl.this.AV66FlagDifN = GXv_int1[0] ;
         AV67FlagPreMed = (byte)(0) ;
         GXv_int1[0] = AV67FlagPreMed ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int1) ;
         rst0029_impl.this.AV67FlagPreMed = GXv_int1[0] ;
         GXt_char2 = AV29Lit0 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2250_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV29Lit0 = GXt_char2 ;
         GXt_char2 = AV30Lit1 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV30Lit1 = GXt_char2 ;
         GXt_char2 = AV31Lit2 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV31Lit2 = GXt_char2 ;
         GXt_char2 = AV32Lit3 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV32Lit3 = GXt_char2 ;
         GXt_char2 = AV33Lit4 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1040_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV33Lit4 = GXt_char2 ;
         GXt_char2 = AV34Lit5 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV34Lit5 = GXt_char2 ;
         GXt_char2 = AV35Lit6 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2438_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV35Lit6 = GXt_char2 ;
         GXt_char2 = AV36Lit7 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2436_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV36Lit7 = GXt_char2 ;
         GXt_char2 = AV37Lit8 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2111_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV37Lit8 = GXt_char2 ;
         GXt_char2 = AV38Lit9 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2099_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV38Lit9 = GXt_char2 ;
         GXt_char2 = AV39Lit10 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2542_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV39Lit10 = GXt_char2 ;
         GXt_char2 = AV40Lit11 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2438_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV40Lit11 = GXt_char2 ;
         GXt_char2 = AV41Lit12 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2436_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV41Lit12 = GXt_char2 ;
         GXt_char2 = AV42Lit13 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2111_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV42Lit13 = GXt_char2 ;
         GXt_char2 = AV43Lit14 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2099_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV43Lit14 = GXt_char2 ;
         GXt_char2 = AV44Lit15 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2000_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV44Lit15 = GXt_char2 ;
         GXt_char2 = AV45Lit16 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2079_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV45Lit16 = GXt_char2 ;
         GXt_char2 = AV46Lit17 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1040_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV46Lit17 = GXt_char2 ;
         GXt_char2 = AV47Lit18 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV47Lit18 = GXt_char2 ;
         GXt_char2 = AV48Lit19 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2438_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV48Lit19 = GXt_char2 ;
         GXt_char2 = AV49Lit20 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2436_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV49Lit20 = GXt_char2 ;
         GXt_char2 = AV50Lit21 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2111_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV50Lit21 = GXt_char2 ;
         GXt_char2 = AV51Lit22 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2099_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV51Lit22 = GXt_char2 ;
         GXt_char2 = AV52Lit23 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2542_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV52Lit23 = GXt_char2 ;
         GXt_char2 = AV53Lit24 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2000_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV53Lit24 = GXt_char2 ;
         GXt_char2 = AV54Lit25 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV54Lit25 = GXt_char2 ;
         GXt_char2 = AV55Lit26 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2542_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV55Lit26 = GXt_char2 ;
         GXt_char2 = AV56Lit27 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV56Lit27 = GXt_char2 ;
         GXt_char2 = AV62Lit28 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV62Lit28 = GXt_char2 ;
         GXt_char2 = AV63Lit29 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1051_", ""), (byte)(99), GXv_char3) ;
         rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
         AV63Lit29 = GXt_char2 ;
         AV64Lit30 = "" ;
         /* Using cursor P06P22 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06P22_A407EmprNom[0] ;
            n407EmprNom = P06P22_n407EmprNom[0] ;
            AV20NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06P23 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A810RecFec = P06P23_A810RecFec[0] ;
            A719PrdNum = P06P23_A719PrdNum[0] ;
            if ( GXutil.resetTime(A810RecFec).before( GXutil.resetTime( AV16UFecha )) )
            {
               AV70PFecha = A810RecFec ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV58ValAlmCol = DecimalUtil.ZERO ;
         AV57ValAlmTot = DecimalUtil.ZERO ;
         AV59ValCCCol = DecimalUtil.ZERO ;
         AV60ValCCTot = DecimalUtil.ZERO ;
         /* Using cursor P06P24 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV16UFecha, AV77Prdnum1, AV78Prdnum2, AV78Prdnum2});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A719PrdNum = P06P24_A719PrdNum[0] ;
            A810RecFec = P06P24_A810RecFec[0] ;
            A807RecExiRea = P06P24_A807RecExiRea[0] ;
            A809RecExiTeo = P06P24_A809RecExiTeo[0] ;
            A724PrdPreAct = P06P24_A724PrdPreAct[0] ;
            A726PrdPreMed = P06P24_A726PrdPreMed[0] ;
            A3915EmpNumDec = P06P24_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P06P24_n3915EmpNumDec[0] ;
            A718PrdNom = P06P24_A718PrdNom[0] ;
            A3915EmpNumDec = P06P24_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P06P24_n3915EmpNumDec[0] ;
            A724PrdPreAct = P06P24_A724PrdPreAct[0] ;
            A726PrdPreMed = P06P24_A726PrdPreMed[0] ;
            A718PrdNom = P06P24_A718PrdNom[0] ;
            AV21DifAlm = A809RecExiTeo.subtract(A807RecExiRea) ;
            if ( ( AV21DifAlm.doubleValue() < 0 ) && (0==AV66FlagDifN) )
            {
               AV26DifAlm2 = AV21DifAlm.negate() ;
            }
            else
            {
               AV26DifAlm2 = AV21DifAlm ;
            }
            if ( A809RecExiTeo.doubleValue() != 0 )
            {
               AV22DifAlmPor = AV26DifAlm2.multiply(DecimalUtil.doubleToDec(100)).divide(A809RecExiTeo, 18, java.math.RoundingMode.DOWN) ;
            }
            else
            {
               AV22DifAlmPor = DecimalUtil.doubleToDec(0) ;
            }
            AV68PreProd = A724PrdPreAct ;
            if ( AV67FlagPreMed == 1 )
            {
               AV68PreProd = A726PrdPreMed ;
            }
            if ( A3915EmpNumDec == 0 )
            {
               AV27ValAlm = GXutil.roundDecimal( AV26DifAlm2.multiply(AV68PreProd), 1) ;
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  AV27ValAlm = GXutil.roundDecimal( AV26DifAlm2.multiply(AV68PreProd), 0) ;
               }
            }
            if ( ( GXutil.strcmp(AV61TipCol, GXutil.substring( A719PrdNum, 1, 1)) != 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "8") == 0 ) && ! (GXutil.strcmp("", AV61TipCol)==0) )
            {
               GXt_char2 = AV63Lit29 ;
               GXv_char3[0] = GXt_char2 ;
               new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1051_", ""), (byte)(99), GXv_char3) ;
               rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
               AV63Lit29 = GXt_char2 ;
               AV64Lit30 = "" ;
               /* Execute user subroutine: 'TOTAL' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(2);
                  pr_default.close(2);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            AV58ValAlmCol = AV58ValAlmCol.add(AV27ValAlm) ;
            AV57ValAlmTot = AV57ValAlmTot.add(AV27ValAlm) ;
            if ( ( A807RecExiRea.doubleValue() == 0 ) && ( A809RecExiTeo.doubleValue() == 0 ) )
            {
            }
            else
            {
               AV72PrdNum = A719PrdNum ;
               /* Execute user subroutine: 'ENTALM' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(2);
                  pr_default.close(2);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV73PorComp = (short)(0) ;
               if ( AV71EntUnient.doubleValue() > 0 )
               {
                  AV73PorComp = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( (AV21DifAlm.divide(AV71EntUnient, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2))) ;
               }
               if ( ( ( AV21DifAlm.doubleValue() != 0 ) && ( GXutil.strcmp(AV76desvios, httpContext.getMessage( "S", "")) == 0 ) ) || ( ( GXutil.strcmp(AV76desvios, httpContext.getMessage( "N", "")) == 0 ) ) )
               {
                  h6P20( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 7, Gx_line+0, 52, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 58, Gx_line+0, 249, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")), 255, Gx_line+0, 344, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A807RecExiRea, "ZZZZZZ9.9999")), 348, Gx_line+0, 437, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21DifAlm, "ZZZZZZ9.9999")), 441, Gx_line+0, 530, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22DifAlmPor, "ZZZ9.99")), 532, Gx_line+0, 584, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValAlm, "ZZZZZZZZ9.99")), 589, Gx_line+0, 678, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71EntUnient, "ZZZZZ9.99")), 681, Gx_line+1, 748, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV73PorComp), "ZZZ9")), 751, Gx_line+1, 781, Gx_line+18, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
            }
            AV61TipCol = GXutil.substring( A719PrdNum, 1, 1) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Execute user subroutine: 'TOTAL' */
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
         if ( AV57ValAlmTot.doubleValue() != 0 )
         {
            h6P20( false, 24) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57ValAlmTot, "ZZZZZZZZZZ.ZZ")), 581, Gx_line+4, 677, Gx_line+21, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit28, "")), 482, Gx_line+3, 534, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(581, Gx_line+0, 676, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+24) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6P20( true, 0) ;
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
      /* 'TOTAL' Routine */
      returnInSub = false ;
      if ( AV58ValAlmCol.doubleValue() != 0 )
      {
         h6P20( false, 24) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV58ValAlmCol, "ZZZZZZZZZZ.ZZ")), 581, Gx_line+5, 677, Gx_line+23, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit28, "")), 322, Gx_line+4, 374, Gx_line+22, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit29, "")), 380, Gx_line+4, 454, Gx_line+22, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit30, "")), 460, Gx_line+4, 534, Gx_line+22, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(581, Gx_line+0, 676, Gx_line+0, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+24) ;
      }
      AV58ValAlmCol = DecimalUtil.ZERO ;
      AV59ValCCCol = DecimalUtil.ZERO ;
      GXt_char2 = AV63Lit29 ;
      GXv_char3[0] = GXt_char2 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN759_", ""), (byte)(99), GXv_char3) ;
      rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
      AV63Lit29 = GXt_char2 ;
      GXt_char2 = AV64Lit30 ;
      GXv_char3[0] = GXt_char2 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN760_", ""), (byte)(99), GXv_char3) ;
      rst0029_impl.this.GXt_char2 = GXv_char3[0] ;
      AV64Lit30 = GXt_char2 ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ENTALM' Routine */
      returnInSub = false ;
      GXv_decimal4[0] = AV71EntUnient ;
      new app.pcalexi(remoteHandle, context).execute( A396EmprCod, AV72PrdNum, AV75FecIni, AV70PFecha, AV16UFecha, GXv_decimal4) ;
      rst0029_impl.this.AV71EntUnient = GXv_decimal4[0] ;
   }

   public void h6P20( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 505, Gx_line+15, 513, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 669, Gx_line+15, 677, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20NomEmp, "")), 5, Gx_line+14, 225, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit1, "")), 469, Gx_line+14, 506, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 520, Gx_line+15, 579, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit2, "")), 625, Gx_line+14, 655, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 683, Gx_line+15, 742, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 669, Gx_line+48, 677, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit0, "")), 5, Gx_line+47, 254, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit3, "")), 625, Gx_line+47, 670, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 683, Gx_line+48, 728, Gx_line+65, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit24, "")), 426, Gx_line+76, 522, Gx_line+94, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 544, Gx_line+99, 552, Gx_line+116, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit17, "")), 6, Gx_line+99, 51, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit19, "")), 292, Gx_line+99, 344, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit20, "")), 384, Gx_line+99, 436, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit21, "")), 470, Gx_line+99, 529, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit22, "")), 554, Gx_line+99, 584, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit23, "")), 603, Gx_line+99, 677, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV16UFecha, "99/99/99"), 282, Gx_line+48, 341, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+6, 795, Gx_line+6, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+72, 795, Gx_line+72, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+119, 250, Gx_line+119, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(255, Gx_line+119, 343, Gx_line+119, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(348, Gx_line+119, 436, Gx_line+119, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(441, Gx_line+119, 529, Gx_line+119, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(589, Gx_line+119, 677, Gx_line+119, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(532, Gx_line+119, 583, Gx_line+119, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(528, Gx_line+93, 676, Gx_line+93, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(255, Gx_line+93, 412, Gx_line+93, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86Pgmname, "")), 469, Gx_line+48, 689, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV70PFecha, "99/99/99"), 381, Gx_line+48, 440, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Compras", ""), 696, Gx_line+96, 748, Gx_line+113, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(681, Gx_line+119, 747, Gx_line+119, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 761, Gx_line+95, 769, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(751, Gx_line+119, 780, Gx_line+119, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+123) ;
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
      AV16UFecha = GXutil.nullDate() ;
      AV77Prdnum1 = "" ;
      AV78Prdnum2 = "" ;
      AV76desvios = "" ;
      GXv_int1 = new byte[1] ;
      AV29Lit0 = "" ;
      AV30Lit1 = "" ;
      AV31Lit2 = "" ;
      AV32Lit3 = "" ;
      AV33Lit4 = "" ;
      AV34Lit5 = "" ;
      AV35Lit6 = "" ;
      AV36Lit7 = "" ;
      AV37Lit8 = "" ;
      AV38Lit9 = "" ;
      AV39Lit10 = "" ;
      AV40Lit11 = "" ;
      AV41Lit12 = "" ;
      AV42Lit13 = "" ;
      AV43Lit14 = "" ;
      AV44Lit15 = "" ;
      AV45Lit16 = "" ;
      AV46Lit17 = "" ;
      AV47Lit18 = "" ;
      AV48Lit19 = "" ;
      AV49Lit20 = "" ;
      AV50Lit21 = "" ;
      AV51Lit22 = "" ;
      AV52Lit23 = "" ;
      AV53Lit24 = "" ;
      AV54Lit25 = "" ;
      AV55Lit26 = "" ;
      AV56Lit27 = "" ;
      AV62Lit28 = "" ;
      AV63Lit29 = "" ;
      AV64Lit30 = "" ;
      scmdbuf = "" ;
      P06P22_A396EmprCod = new String[] {""} ;
      P06P22_A407EmprNom = new String[] {""} ;
      P06P22_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV20NomEmp = "" ;
      P06P23_A396EmprCod = new String[] {""} ;
      P06P23_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06P23_A719PrdNum = new String[] {""} ;
      A810RecFec = GXutil.nullDate() ;
      A719PrdNum = "" ;
      AV70PFecha = GXutil.nullDate() ;
      AV58ValAlmCol = DecimalUtil.ZERO ;
      AV57ValAlmTot = DecimalUtil.ZERO ;
      AV59ValCCCol = DecimalUtil.ZERO ;
      AV60ValCCTot = DecimalUtil.ZERO ;
      P06P24_A396EmprCod = new String[] {""} ;
      P06P24_A719PrdNum = new String[] {""} ;
      P06P24_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06P24_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06P24_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06P24_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06P24_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06P24_A3915EmpNumDec = new byte[1] ;
      P06P24_n3915EmpNumDec = new boolean[] {false} ;
      P06P24_A718PrdNom = new String[] {""} ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV21DifAlm = DecimalUtil.ZERO ;
      AV26DifAlm2 = DecimalUtil.ZERO ;
      AV22DifAlmPor = DecimalUtil.ZERO ;
      AV68PreProd = DecimalUtil.ZERO ;
      AV27ValAlm = DecimalUtil.ZERO ;
      AV61TipCol = "" ;
      AV72PrdNum = "" ;
      AV71EntUnient = DecimalUtil.ZERO ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV75FecIni = GXutil.nullDate() ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV86Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rst0029__default(),
         new Object[] {
             new Object[] {
            P06P22_A396EmprCod, P06P22_A407EmprNom, P06P22_n407EmprNom
            }
            , new Object[] {
            P06P23_A396EmprCod, P06P23_A810RecFec, P06P23_A719PrdNum
            }
            , new Object[] {
            P06P24_A396EmprCod, P06P24_A719PrdNum, P06P24_A810RecFec, P06P24_A807RecExiRea, P06P24_A809RecExiTeo, P06P24_A724PrdPreAct, P06P24_A726PrdPreMed, P06P24_A3915EmpNumDec, P06P24_n3915EmpNumDec, P06P24_A718PrdNom
            }
         }
      );
      AV86Pgmname = "RST0029" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV86Pgmname = "RST0029" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV66FlagDifN ;
   private byte AV67FlagPreMed ;
   private byte GXv_int1[] ;
   private byte A3915EmpNumDec ;
   private short gxcookieaux ;
   private short AV73PorComp ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV58ValAlmCol ;
   private java.math.BigDecimal AV57ValAlmTot ;
   private java.math.BigDecimal AV59ValCCCol ;
   private java.math.BigDecimal AV60ValCCTot ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal AV21DifAlm ;
   private java.math.BigDecimal AV26DifAlm2 ;
   private java.math.BigDecimal AV22DifAlmPor ;
   private java.math.BigDecimal AV68PreProd ;
   private java.math.BigDecimal AV27ValAlm ;
   private java.math.BigDecimal AV71EntUnient ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV77Prdnum1 ;
   private String AV78Prdnum2 ;
   private String AV76desvios ;
   private String AV29Lit0 ;
   private String AV30Lit1 ;
   private String AV31Lit2 ;
   private String AV32Lit3 ;
   private String AV33Lit4 ;
   private String AV34Lit5 ;
   private String AV35Lit6 ;
   private String AV36Lit7 ;
   private String AV37Lit8 ;
   private String AV38Lit9 ;
   private String AV39Lit10 ;
   private String AV40Lit11 ;
   private String AV41Lit12 ;
   private String AV42Lit13 ;
   private String AV43Lit14 ;
   private String AV44Lit15 ;
   private String AV45Lit16 ;
   private String AV46Lit17 ;
   private String AV47Lit18 ;
   private String AV48Lit19 ;
   private String AV49Lit20 ;
   private String AV50Lit21 ;
   private String AV51Lit22 ;
   private String AV52Lit23 ;
   private String AV53Lit24 ;
   private String AV54Lit25 ;
   private String AV55Lit26 ;
   private String AV56Lit27 ;
   private String AV62Lit28 ;
   private String AV63Lit29 ;
   private String AV64Lit30 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV20NomEmp ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV61TipCol ;
   private String AV72PrdNum ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String Gx_time ;
   private String AV86Pgmname ;
   private java.util.Date AV16UFecha ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV70PFecha ;
   private java.util.Date AV75FecIni ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n3915EmpNumDec ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P06P22_A396EmprCod ;
   private String[] P06P22_A407EmprNom ;
   private boolean[] P06P22_n407EmprNom ;
   private String[] P06P23_A396EmprCod ;
   private java.util.Date[] P06P23_A810RecFec ;
   private String[] P06P23_A719PrdNum ;
   private String[] P06P24_A396EmprCod ;
   private String[] P06P24_A719PrdNum ;
   private java.util.Date[] P06P24_A810RecFec ;
   private java.math.BigDecimal[] P06P24_A807RecExiRea ;
   private java.math.BigDecimal[] P06P24_A809RecExiTeo ;
   private java.math.BigDecimal[] P06P24_A724PrdPreAct ;
   private java.math.BigDecimal[] P06P24_A726PrdPreMed ;
   private byte[] P06P24_A3915EmpNumDec ;
   private boolean[] P06P24_n3915EmpNumDec ;
   private String[] P06P24_A718PrdNom ;
}

final  class rst0029__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06P22", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06P23", "SELECT EmprCod, RecFec, PrdNum FROM TXPRECUEN WHERE EmprCod = ? ORDER BY EmprCod, RecFec DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06P24", "SELECT T1.EmprCod, T1.PrdNum, T1.RecFec, T1.RecExiRea, T1.RecExiTeo, T3.PrdPreAct, T3.PrdPreMed, T2.EmpNumDec, T3.PrdNom FROM ((TXPRECUEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.RecFec = ? and T1.PrdNum >= ?) AND (T1.PrdNum <= ? or (rtrim(?) IS NULL)) ORDER BY T1.EmprCod, T1.RecFec, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

