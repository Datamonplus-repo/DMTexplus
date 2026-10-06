package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rst0011_impl extends GXWebReport
{
   public rst0011_impl( com.genexus.internet.HttpContext context )
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
            AV16PProd = httpContext.GetPar( "PProd") ;
            AV17UProd = httpContext.GetPar( "UProd") ;
            AV18Any = (short)(GXutil.lval( httpContext.GetPar( "Any"))) ;
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
         GXt_char1 = AV47Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit0 = GXt_char1 ;
         GXt_char1 = AV48Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit1 = GXt_char1 ;
         GXt_char1 = AV49Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2136_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit2 = GXt_char1 ;
         GXt_char1 = AV50Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit3 = GXt_char1 ;
         GXt_char1 = AV51Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN735_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV51Lit4 = GXt_char1 ;
         GXt_char1 = AV52Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV52Lit5 = GXt_char1 ;
         GXt_char1 = AV53Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN118_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV53Lit6 = GXt_char1 ;
         GXt_char1 = AV54Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2124_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV54Lit7 = GXt_char1 ;
         GXt_char1 = AV55Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2164_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV55Lit8 = GXt_char1 ;
         GXt_char1 = AV56Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2280_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV56Lit9 = GXt_char1 ;
         GXt_char1 = AV57Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2002_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV57Lit10 = GXt_char1 ;
         GXt_char1 = AV58Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2286_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit11 = GXt_char1 ;
         GXt_char1 = AV59Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2210_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV59Lit12 = GXt_char1 ;
         GXt_char1 = AV60Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2208_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV60Lit13 = GXt_char1 ;
         GXt_char1 = AV61Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2009_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV61Lit14 = GXt_char1 ;
         GXt_char1 = AV62Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2425_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV62Lit15 = GXt_char1 ;
         GXt_char1 = AV63Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2330_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV63Lit16 = GXt_char1 ;
         GXt_char1 = AV64Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2324_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV64Lit17 = GXt_char1 ;
         GXt_char1 = AV65Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2110_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV65Lit18 = GXt_char1 ;
         GXt_char1 = AV66Lit19 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN723_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV66Lit19 = GXt_char1 ;
         GXt_char1 = AV67Lit20 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2029_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV67Lit20 = GXt_char1 ;
         GXt_char1 = AV68Lit21 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1359_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV68Lit21 = GXt_char1 ;
         GXt_char1 = AV70Lit23 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1189_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV70Lit23 = GXt_char1 ;
         GXt_char1 = AV71Lit24 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2182_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV71Lit24 = GXt_char1 ;
         GXt_char1 = AV72Lit25 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN395_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV72Lit25 = GXt_char1 ;
         GXt_char1 = AV73Lit26 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2527_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV73Lit26 = GXt_char1 ;
         GXt_char1 = AV74Lit27 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2200_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV74Lit27 = GXt_char1 ;
         GXt_char1 = AV75Lit28 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2526_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV75Lit28 = GXt_char1 ;
         GXt_char1 = AV76Lit29 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2201_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV76Lit29 = GXt_char1 ;
         GXt_char1 = AV77Lit30 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN113_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV77Lit30 = GXt_char1 ;
         GXt_char1 = AV78Lit31 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN149_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV78Lit31 = GXt_char1 ;
         AV91FlagpreMed = (byte)(0) ;
         GXv_int3[0] = AV91FlagpreMed ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int3) ;
         rst0011_impl.this.AV91FlagpreMed = GXv_int3[0] ;
         if ( AV91FlagpreMed == 1 )
         {
            GXt_char1 = AV69Lit22 ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN394_", ""), (byte)(99), GXv_char2) ;
            rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
            AV69Lit22 = GXt_char1 ;
         }
         else
         {
            GXt_char1 = AV69Lit22 ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char2) ;
            rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
            AV69Lit22 = GXt_char1 ;
         }
         /* Using cursor P06HI2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06HI2_A407EmprNom[0] ;
            n407EmprNom = P06HI2_n407EmprNom[0] ;
            AV21NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV36AnyCab = (short)(AV18Any-1) ;
         AV79TipCol = "" ;
         AV43UniCpA = DecimalUtil.ZERO ;
         AV45ValCpA = DecimalUtil.ZERO ;
         AV44UniCoA = DecimalUtil.ZERO ;
         AV46ValCoA = DecimalUtil.ZERO ;
         GX_I = 1 ;
         while ( GX_I <= 12 )
         {
            AV39UniCprTot[GX_I-1] = DecimalUtil.ZERO ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 12 )
         {
            AV41ValCprTot[GX_I-1] = DecimalUtil.ZERO ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 12 )
         {
            AV40UniConTot[GX_I-1] = DecimalUtil.ZERO ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 12 )
         {
            AV42ValConTot[GX_I-1] = DecimalUtil.ZERO ;
            GX_I = (int)(GX_I+1) ;
         }
         AV83UniCoG = DecimalUtil.ZERO ;
         AV82UniCpG = DecimalUtil.ZERO ;
         AV85ValCoG = DecimalUtil.ZERO ;
         AV84ValCpG = DecimalUtil.ZERO ;
         GX_I = 1 ;
         while ( GX_I <= 12 )
         {
            AV86UniCprGen[GX_I-1] = DecimalUtil.ZERO ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 12 )
         {
            AV88ValCprGen[GX_I-1] = DecimalUtil.ZERO ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 12 )
         {
            AV87UniConGen[GX_I-1] = DecimalUtil.ZERO ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 12 )
         {
            AV89ValConGen[GX_I-1] = DecimalUtil.ZERO ;
            GX_I = (int)(GX_I+1) ;
         }
         /* Using cursor P06HI8 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV16PProd, AV17UProd});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6HI4 = false ;
            A719PrdNum = P06HI8_A719PrdNum[0] ;
            A681PrdAny = P06HI8_A681PrdAny[0] ;
            A676PrdAcuConA = P06HI8_A676PrdAcuConA[0] ;
            A331DifValConA = P06HI8_A331DifValConA[0] ;
            n331DifValConA = P06HI8_n331DifValConA[0] ;
            A704PrdExiAlm = P06HI8_A704PrdExiAlm[0] ;
            A3915EmpNumDec = P06HI8_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P06HI8_n3915EmpNumDec[0] ;
            A724PrdPreAct = P06HI8_A724PrdPreAct[0] ;
            A726PrdPreMed = P06HI8_A726PrdPreMed[0] ;
            A794PrvNom = P06HI8_A794PrvNom[0] ;
            n794PrvNom = P06HI8_n794PrvNom[0] ;
            A795PrvNum = P06HI8_A795PrvNum[0] ;
            A718PrdNom = P06HI8_A718PrdNom[0] ;
            A677PrdAcuCprA = P06HI8_A677PrdAcuCprA[0] ;
            A748PrdValCprA = P06HI8_A748PrdValCprA[0] ;
            A746PrdValConA = P06HI8_A746PrdValConA[0] ;
            A3907ValorPS = P06HI8_A3907ValorPS[0] ;
            n3907ValorPS = P06HI8_n3907ValorPS[0] ;
            A3906ValorPE = P06HI8_A3906ValorPE[0] ;
            n3906ValorPE = P06HI8_n3906ValorPE[0] ;
            A3915EmpNumDec = P06HI8_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P06HI8_n3915EmpNumDec[0] ;
            A704PrdExiAlm = P06HI8_A704PrdExiAlm[0] ;
            A724PrdPreAct = P06HI8_A724PrdPreAct[0] ;
            A726PrdPreMed = P06HI8_A726PrdPreMed[0] ;
            A795PrvNum = P06HI8_A795PrvNum[0] ;
            A718PrdNom = P06HI8_A718PrdNom[0] ;
            A794PrvNom = P06HI8_A794PrvNom[0] ;
            n794PrvNom = P06HI8_n794PrvNom[0] ;
            A3906ValorPE = P06HI8_A3906ValorPE[0] ;
            n3906ValorPE = P06HI8_n3906ValorPE[0] ;
            A3907ValorPS = P06HI8_A3907ValorPS[0] ;
            n3907ValorPS = P06HI8_n3907ValorPS[0] ;
            A677PrdAcuCprA = P06HI8_A677PrdAcuCprA[0] ;
            A748PrdValCprA = P06HI8_A748PrdValCprA[0] ;
            A746PrdValConA = P06HI8_A746PrdValConA[0] ;
            A3908ValorT = A3906ValorPE.subtract(A3907ValorPS) ;
            AV38Exist = A704PrdExiAlm ;
            if ( A3915EmpNumDec == 0 )
            {
               AV37Importe = GXutil.roundDecimal( AV38Exist.multiply(A724PrdPreAct), 0) ;
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  AV37Importe = GXutil.roundDecimal( AV38Exist.multiply(A724PrdPreAct), 2) ;
               }
            }
            AV92PrecioP = A724PrdPreAct ;
            if ( AV91FlagpreMed == 1 )
            {
               AV92PrecioP = A726PrdPreMed ;
               AV37Importe = A3908ValorT ;
            }
            h6HI0( false, 44) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit5, "")), 33, Gx_line+17, 76, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 105, Gx_line+17, 137, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 167, Gx_line+17, 303, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit6, "")), 332, Gx_line+17, 380, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 409, Gx_line+17, 441, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 471, Gx_line+17, 628, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit21, "")), 657, Gx_line+17, 684, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38Exist, "ZZZZZZZ9.9999")), 714, Gx_line+17, 783, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Lit22, "")), 811, Gx_line+17, 843, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV92PrecioP, "ZZZZZZZ9.999")), 873, Gx_line+17, 947, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Lit23, "")), 945, Gx_line+17, 982, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37Importe, "ZZZZZZ9.99")), 1011, Gx_line+17, 1064, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(22, Gx_line+5, 1074, Gx_line+38, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+44) ;
            AV32UniConAnt = DecimalUtil.doubleToDec(0) ;
            AV33UniCprAnt = DecimalUtil.doubleToDec(0) ;
            AV34ValCprAnt = DecimalUtil.doubleToDec(0) ;
            AV35ValConAnt = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06HI8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P06HI8_A719PrdNum[0], A719PrdNum) == 0 ) )
            {
               brk6HI4 = false ;
               A681PrdAny = P06HI8_A681PrdAny[0] ;
               A676PrdAcuConA = P06HI8_A676PrdAcuConA[0] ;
               if ( ( GXutil.strcmp(A719PrdNum, AV16PProd) >= 0 ) && ( GXutil.strcmp(A719PrdNum, AV17UProd) <= 0 ) )
               {
                  if ( A681PrdAny == AV18Any - 1 )
                  {
                     /* Using cursor P06HI10 */
                     pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
                     if ( (pr_default.getStatus(2) != 101) )
                     {
                        A677PrdAcuCprA = P06HI10_A677PrdAcuCprA[0] ;
                        A748PrdValCprA = P06HI10_A748PrdValCprA[0] ;
                        A746PrdValConA = P06HI10_A746PrdValConA[0] ;
                     }
                     else
                     {
                        A677PrdAcuCprA = DecimalUtil.doubleToDec(0) ;
                        A748PrdValCprA = DecimalUtil.doubleToDec(0) ;
                        A746PrdValConA = DecimalUtil.doubleToDec(0) ;
                     }
                     pr_default.close(2);
                     AV32UniConAnt = A676PrdAcuConA ;
                     AV33UniCprAnt = A677PrdAcuCprA ;
                     AV34ValCprAnt = A748PrdValCprA ;
                     AV35ValConAnt = A746PrdValConA ;
                  }
               }
               brk6HI4 = true ;
               pr_default.readNext(1);
            }
            AV29TotUniCon = DecimalUtil.doubleToDec(0) ;
            AV28TotUniCpr = DecimalUtil.doubleToDec(0) ;
            AV31TotValCon = DecimalUtil.doubleToDec(0) ;
            AV30TotValCpr = DecimalUtil.doubleToDec(0) ;
            AV24I = (byte)(1) ;
            while ( AV24I <= 12 )
            {
               AV23UniCprMes[AV24I-1] = DecimalUtil.doubleToDec(0) ;
               AV25ValCprMes[AV24I-1] = DecimalUtil.doubleToDec(0) ;
               AV26UniConMes[AV24I-1] = DecimalUtil.doubleToDec(0) ;
               AV27ValConMes[AV24I-1] = DecimalUtil.doubleToDec(0) ;
               AV24I = (byte)(AV24I+1) ;
            }
            /* Using cursor P06HI11 */
            pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(AV18Any)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A681PrdAny = P06HI11_A681PrdAny[0] ;
               A720PrdNumMes = P06HI11_A720PrdNumMes[0] ;
               A745PrdUniCprM = P06HI11_A745PrdUniCprM[0] ;
               A749PrdValCprM = P06HI11_A749PrdValCprM[0] ;
               A744PrdUniConM = P06HI11_A744PrdUniConM[0] ;
               A747PrdValConM = P06HI11_A747PrdValConM[0] ;
               AV24I = A720PrdNumMes ;
               AV23UniCprMes[AV24I-1] = AV23UniCprMes[AV24I-1].add(A745PrdUniCprM) ;
               AV28TotUniCpr = AV28TotUniCpr.add(A745PrdUniCprM) ;
               AV25ValCprMes[AV24I-1] = AV25ValCprMes[AV24I-1].add(A749PrdValCprM) ;
               AV30TotValCpr = AV30TotValCpr.add(A749PrdValCprM) ;
               AV26UniConMes[AV24I-1] = AV26UniConMes[AV24I-1].add(A744PrdUniConM) ;
               AV29TotUniCon = AV29TotUniCon.add(A744PrdUniConM) ;
               AV27ValConMes[AV24I-1] = AV27ValConMes[AV24I-1].add(A747PrdValConM) ;
               AV31TotValCon = AV31TotValCon.add(A747PrdValConM) ;
               AV39UniCprTot[AV24I-1] = AV39UniCprTot[AV24I-1].add(A745PrdUniCprM) ;
               AV41ValCprTot[AV24I-1] = AV41ValCprTot[AV24I-1].add(A749PrdValCprM) ;
               AV40UniConTot[AV24I-1] = AV40UniConTot[AV24I-1].add(A744PrdUniConM) ;
               AV42ValConTot[AV24I-1] = AV42ValConTot[AV24I-1].add(A747PrdValConM) ;
               AV86UniCprGen[AV24I-1] = AV86UniCprGen[AV24I-1].add(A745PrdUniCprM) ;
               AV88ValCprGen[AV24I-1] = AV88ValCprGen[AV24I-1].add(A749PrdValCprM) ;
               AV87UniConGen[AV24I-1] = AV87UniConGen[AV24I-1].add(A744PrdUniConM) ;
               AV89ValConGen[AV24I-1] = AV89ValConGen[AV24I-1].add(A747PrdValConM) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            h6HI0( false, 67) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23UniCprMes[1-1], "ZZZZZZ9.99")), 35, Gx_line+0, 88, Gx_line+14, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23UniCprMes[2-1], "ZZZZZZ9.99")), 104, Gx_line+0, 157, Gx_line+14, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23UniCprMes[3-1], "ZZZZZZ9.99")), 175, Gx_line+0, 228, Gx_line+14, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23UniCprMes[4-1], "ZZZZZZ9.99")), 249, Gx_line+0, 302, Gx_line+14, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23UniCprMes[5-1], "ZZZZZZ9.99")), 321, Gx_line+0, 374, Gx_line+14, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23UniCprMes[6-1], "ZZZZZZ9.99")), 395, Gx_line+0, 448, Gx_line+14, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23UniCprMes[7-1], "ZZZZZZ9.99")), 469, Gx_line+0, 522, Gx_line+14, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23UniCprMes[8-1], "ZZZZZZ9.99")), 541, Gx_line+0, 594, Gx_line+14, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23UniCprMes[9-1], "ZZZZZZ9.99")), 614, Gx_line+0, 667, Gx_line+14, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23UniCprMes[10-1], "ZZZZZZ9.99")), 684, Gx_line+0, 737, Gx_line+14, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23UniCprMes[11-1], "ZZZZZZ9.99")), 758, Gx_line+0, 811, Gx_line+14, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23UniCprMes[12-1], "ZZZZZZ9.99")), 832, Gx_line+0, 885, Gx_line+14, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotUniCpr, "ZZZZZZZ9.99")), 896, Gx_line+0, 954, Gx_line+14, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33UniCprAnt, "ZZZZZZ9.99")), 979, Gx_line+0, 1032, Gx_line+14, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Lit26, "")), 1036, Gx_line+0, 1110, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25ValCprMes[1-1], "ZZZZZZZZ9.99")), 25, Gx_line+17, 89, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25ValCprMes[2-1], "ZZZZZZZZ9.99")), 94, Gx_line+17, 158, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25ValCprMes[3-1], "ZZZZZZZZ9.99")), 165, Gx_line+17, 229, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25ValCprMes[4-1], "ZZZZZZZZ9.99")), 239, Gx_line+17, 303, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25ValCprMes[5-1], "ZZZZZZZZ9.99")), 310, Gx_line+17, 374, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25ValCprMes[6-1], "ZZZZZZZZ9.99")), 384, Gx_line+17, 448, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25ValCprMes[7-1], "ZZZZZZZZ9.99")), 458, Gx_line+17, 522, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25ValCprMes[8-1], "ZZZZZZZZ9.99")), 530, Gx_line+17, 594, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25ValCprMes[9-1], "ZZZZZZZZ9.99")), 603, Gx_line+17, 667, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25ValCprMes[10-1], "ZZZZZZZZ9.99")), 674, Gx_line+17, 738, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25ValCprMes[11-1], "ZZZZZZZZ9.99")), 748, Gx_line+17, 812, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25ValCprMes[12-1], "ZZZZZZZZ9.99")), 822, Gx_line+17, 886, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30TotValCpr, "ZZZZZZZZ9.99")), 891, Gx_line+17, 955, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34ValCprAnt, "ZZZZZZZZ9.99")), 969, Gx_line+17, 1033, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Lit27, "")), 1036, Gx_line+17, 1115, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26UniConMes[1-1], "ZZZZZZ9.9999")), 25, Gx_line+33, 89, Gx_line+47, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26UniConMes[2-1], "ZZZZZZ9.9999")), 94, Gx_line+33, 158, Gx_line+47, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26UniConMes[3-1], "ZZZZZZ9.9999")), 165, Gx_line+33, 229, Gx_line+47, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26UniConMes[4-1], "ZZZZZZ9.9999")), 239, Gx_line+33, 303, Gx_line+47, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26UniConMes[5-1], "ZZZZZZ9.9999")), 310, Gx_line+33, 374, Gx_line+47, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26UniConMes[6-1], "ZZZZZZ9.9999")), 384, Gx_line+33, 448, Gx_line+47, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26UniConMes[7-1], "ZZZZZZ9.9999")), 458, Gx_line+33, 522, Gx_line+47, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26UniConMes[8-1], "ZZZZZZ9.9999")), 530, Gx_line+33, 594, Gx_line+47, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26UniConMes[9-1], "ZZZZZZ9.9999")), 603, Gx_line+33, 667, Gx_line+47, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26UniConMes[10-1], "ZZZZZZ9.9999")), 674, Gx_line+33, 738, Gx_line+47, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26UniConMes[11-1], "ZZZZZZ9.9999")), 748, Gx_line+33, 812, Gx_line+47, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26UniConMes[12-1], "ZZZZZZ9.9999")), 822, Gx_line+33, 886, Gx_line+47, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotUniCon, "ZZZZZZ9.9999")), 891, Gx_line+33, 955, Gx_line+47, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32UniConAnt, "ZZZZZZ9.9999")), 969, Gx_line+33, 1033, Gx_line+47, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Lit28, "")), 1036, Gx_line+33, 1120, Gx_line+47, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValConMes[1-1], "ZZZZZZZZ9.99")), 25, Gx_line+50, 89, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValConMes[2-1], "ZZZZZZZZ9.99")), 94, Gx_line+50, 158, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValConMes[3-1], "ZZZZZZZZ9.99")), 165, Gx_line+50, 229, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValConMes[4-1], "ZZZZZZZZ9.99")), 239, Gx_line+50, 303, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValConMes[5-1], "ZZZZZZZZ9.99")), 310, Gx_line+50, 374, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValConMes[6-1], "ZZZZZZZZ9.99")), 384, Gx_line+50, 448, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValConMes[7-1], "ZZZZZZZZ9.99")), 458, Gx_line+50, 522, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValConMes[8-1], "ZZZZZZZZ9.99")), 530, Gx_line+50, 594, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValConMes[9-1], "ZZZZZZZZ9.99")), 603, Gx_line+50, 667, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValConMes[10-1], "ZZZZZZZZ9.99")), 674, Gx_line+50, 738, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValConMes[11-1], "ZZZZZZZZ9.99")), 748, Gx_line+50, 812, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValConMes[12-1], "ZZZZZZZZ9.99")), 822, Gx_line+50, 886, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TotValCon, "ZZZZZZZZ9.99")), 891, Gx_line+50, 955, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35ValConAnt, "ZZZZZZZZ9.99")), 969, Gx_line+50, 1033, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Lit29, "")), 1036, Gx_line+50, 1120, Gx_line+64, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+67) ;
            AV43UniCpA = AV43UniCpA.add(AV28TotUniCpr) ;
            AV45ValCpA = AV45ValCpA.add(AV30TotValCpr) ;
            AV44UniCoA = AV44UniCoA.add(AV29TotUniCon) ;
            AV46ValCoA = AV46ValCoA.add(AV31TotValCon) ;
            AV79TipCol = GXutil.substring( A719PrdNum, 1, 1) ;
            AV82UniCpG = AV82UniCpG.add(AV28TotUniCpr) ;
            AV84ValCpG = AV84ValCpG.add(AV30TotValCpr) ;
            AV83UniCoG = AV83UniCoG.add(AV29TotUniCon) ;
            AV85ValCoG = AV85ValCoG.add(AV31TotValCon) ;
            if ( ! brk6HI4 )
            {
               brk6HI4 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         GXt_char1 = AV90Lit34 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2486_", ""), (byte)(99), GXv_char2) ;
         rst0011_impl.this.GXt_char1 = GXv_char2[0] ;
         AV90Lit34 = GXt_char1 ;
         /* Execute user subroutine: 'TOTALGEN' */
         S121 ();
         if ( returnInSub )
         {
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6HI0( true, 0) ;
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
      /* 'TOTALES' Routine */
      returnInSub = false ;
      h6HI0( false, 85) ;
      getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39UniCprTot[1-1], "ZZZZZZ9.99")), 35, Gx_line+17, 88, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39UniCprTot[2-1], "ZZZZZZ9.99")), 104, Gx_line+17, 157, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39UniCprTot[3-1], "ZZZZZZ9.99")), 175, Gx_line+17, 228, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39UniCprTot[4-1], "ZZZZZZ9.99")), 249, Gx_line+17, 302, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39UniCprTot[5-1], "ZZZZZZ9.99")), 321, Gx_line+17, 374, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39UniCprTot[6-1], "ZZZZZZ9.99")), 395, Gx_line+17, 448, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39UniCprTot[7-1], "ZZZZZZ9.99")), 469, Gx_line+17, 522, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39UniCprTot[8-1], "ZZZZZZ9.99")), 541, Gx_line+17, 594, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39UniCprTot[9-1], "ZZZZZZ9.99")), 614, Gx_line+17, 667, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39UniCprTot[10-1], "ZZZZZZ9.99")), 684, Gx_line+17, 737, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39UniCprTot[11-1], "ZZZZZZ9.99")), 758, Gx_line+17, 811, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39UniCprTot[12-1], "ZZZZZZ9.99")), 832, Gx_line+17, 885, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41ValCprTot[1-1], "ZZZZZZZZ9.99")), 25, Gx_line+33, 89, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41ValCprTot[2-1], "ZZZZZZZZ9.99")), 94, Gx_line+33, 158, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41ValCprTot[3-1], "ZZZZZZZZ9.99")), 165, Gx_line+33, 229, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41ValCprTot[4-1], "ZZZZZZZZ9.99")), 239, Gx_line+33, 303, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41ValCprTot[5-1], "ZZZZZZZZ9.99")), 310, Gx_line+33, 374, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41ValCprTot[6-1], "ZZZZZZZZ9.99")), 384, Gx_line+33, 448, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41ValCprTot[7-1], "ZZZZZZZZ9.99")), 458, Gx_line+33, 522, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41ValCprTot[8-1], "ZZZZZZZZ9.99")), 530, Gx_line+33, 594, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41ValCprTot[9-1], "ZZZZZZZZ9.99")), 603, Gx_line+33, 667, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41ValCprTot[10-1], "ZZZZZZZZ9.99")), 674, Gx_line+33, 738, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41ValCprTot[11-1], "ZZZZZZZZ9.99")), 748, Gx_line+33, 812, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41ValCprTot[12-1], "ZZZZZZZZ9.99")), 822, Gx_line+33, 886, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45ValCpA, "ZZZZZZZZ9.99")), 891, Gx_line+33, 955, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40UniConTot[1-1], "ZZZZZZ9.9999")), 25, Gx_line+50, 89, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40UniConTot[2-1], "ZZZZZZ9.9999")), 94, Gx_line+50, 158, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40UniConTot[3-1], "ZZZZZZ9.9999")), 165, Gx_line+50, 229, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40UniConTot[4-1], "ZZZZZZ9.9999")), 239, Gx_line+50, 303, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40UniConTot[5-1], "ZZZZZZ9.9999")), 310, Gx_line+50, 374, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40UniConTot[6-1], "ZZZZZZ9.9999")), 384, Gx_line+50, 448, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40UniConTot[7-1], "ZZZZZZ9.9999")), 458, Gx_line+50, 522, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40UniConTot[8-1], "ZZZZZZ9.9999")), 530, Gx_line+50, 594, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40UniConTot[9-1], "ZZZZZZ9.9999")), 603, Gx_line+50, 667, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40UniConTot[10-1], "ZZZZZZ9.9999")), 674, Gx_line+50, 738, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40UniConTot[11-1], "ZZZZZZ9.9999")), 748, Gx_line+50, 812, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40UniConTot[12-1], "ZZZZZZ9.9999")), 822, Gx_line+50, 886, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44UniCoA, "ZZZZZZ9.9999")), 891, Gx_line+50, 955, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42ValConTot[1-1], "ZZZZZZZZ9.99")), 25, Gx_line+67, 89, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42ValConTot[2-1], "ZZZZZZZZ9.99")), 94, Gx_line+67, 158, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42ValConTot[3-1], "ZZZZZZZZ9.99")), 165, Gx_line+67, 229, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42ValConTot[4-1], "ZZZZZZZZ9.99")), 239, Gx_line+67, 303, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42ValConTot[5-1], "ZZZZZZZZ9.99")), 310, Gx_line+67, 374, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42ValConTot[6-1], "ZZZZZZZZ9.99")), 384, Gx_line+67, 448, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42ValConTot[7-1], "ZZZZZZZZ9.99")), 458, Gx_line+67, 522, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42ValConTot[8-1], "ZZZZZZZZ9.99")), 530, Gx_line+67, 594, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42ValConTot[9-1], "ZZZZZZZZ9.99")), 603, Gx_line+67, 667, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42ValConTot[10-1], "ZZZZZZZZ9.99")), 674, Gx_line+67, 738, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42ValConTot[11-1], "ZZZZZZZZ9.99")), 748, Gx_line+67, 812, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42ValConTot[12-1], "ZZZZZZZZ9.99")), 822, Gx_line+67, 886, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46ValCoA, "ZZZZZZZZ9.99")), 891, Gx_line+67, 955, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43UniCpA, "ZZZZZZ9.99")), 901, Gx_line+17, 954, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(8, Gx_line+6, 1138, Gx_line+6, 1, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+85) ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'TOTALGEN' Routine */
      returnInSub = false ;
      h6HI0( false, 83) ;
      getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86UniCprGen[1-1], "ZZZZZZ9.99")), 35, Gx_line+17, 88, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88ValCprGen[1-1], "ZZZZZZZZ9.99")), 25, Gx_line+33, 89, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87UniConGen[1-1], "ZZZZZZ9.9999")), 25, Gx_line+50, 89, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV89ValConGen[1-1], "ZZZZZZZZ9.99")), 25, Gx_line+67, 89, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86UniCprGen[2-1], "ZZZZZZ9.99")), 104, Gx_line+17, 157, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88ValCprGen[2-1], "ZZZZZZZZ9.99")), 94, Gx_line+33, 158, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87UniConGen[2-1], "ZZZZZZ9.9999")), 94, Gx_line+50, 158, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV89ValConGen[2-1], "ZZZZZZZZ9.99")), 94, Gx_line+67, 158, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86UniCprGen[3-1], "ZZZZZZ9.99")), 175, Gx_line+17, 228, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88ValCprGen[3-1], "ZZZZZZZZ9.99")), 165, Gx_line+33, 229, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87UniConGen[3-1], "ZZZZZZ9.9999")), 165, Gx_line+50, 229, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV89ValConGen[3-1], "ZZZZZZZZ9.99")), 165, Gx_line+67, 229, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86UniCprGen[4-1], "ZZZZZZ9.99")), 249, Gx_line+17, 302, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88ValCprGen[4-1], "ZZZZZZZZ9.99")), 239, Gx_line+33, 303, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87UniConGen[4-1], "ZZZZZZ9.9999")), 239, Gx_line+50, 303, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV89ValConGen[4-1], "ZZZZZZZZ9.99")), 239, Gx_line+67, 303, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88ValCprGen[5-1], "ZZZZZZZZ9.99")), 310, Gx_line+33, 374, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87UniConGen[5-1], "ZZZZZZ9.9999")), 310, Gx_line+50, 374, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV89ValConGen[5-1], "ZZZZZZZZ9.99")), 310, Gx_line+67, 374, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86UniCprGen[5-1], "ZZZZZZ9.99")), 321, Gx_line+17, 374, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88ValCprGen[6-1], "ZZZZZZZZ9.99")), 384, Gx_line+33, 448, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87UniConGen[6-1], "ZZZZZZ9.9999")), 384, Gx_line+50, 448, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV89ValConGen[6-1], "ZZZZZZZZ9.99")), 384, Gx_line+67, 448, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86UniCprGen[6-1], "ZZZZZZ9.99")), 395, Gx_line+17, 448, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88ValCprGen[7-1], "ZZZZZZZZ9.99")), 458, Gx_line+33, 522, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87UniConGen[7-1], "ZZZZZZ9.9999")), 458, Gx_line+50, 522, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV89ValConGen[7-1], "ZZZZZZZZ9.99")), 464, Gx_line+67, 528, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86UniCprGen[7-1], "ZZZZZZ9.99")), 469, Gx_line+17, 522, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88ValCprGen[8-1], "ZZZZZZZZ9.99")), 530, Gx_line+33, 594, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87UniConGen[8-1], "ZZZZZZ9.9999")), 530, Gx_line+50, 594, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV89ValConGen[8-1], "ZZZZZZZZ9.99")), 530, Gx_line+67, 594, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86UniCprGen[8-1], "ZZZZZZ9.99")), 541, Gx_line+17, 594, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88ValCprGen[9-1], "ZZZZZZZZ9.99")), 603, Gx_line+33, 667, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87UniConGen[9-1], "ZZZZZZ9.9999")), 603, Gx_line+50, 667, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV89ValConGen[9-1], "ZZZZZZZZ9.99")), 603, Gx_line+67, 667, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86UniCprGen[9-1], "ZZZZZZ9.99")), 614, Gx_line+17, 667, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88ValCprGen[10-1], "ZZZZZZZZ9.99")), 674, Gx_line+33, 738, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87UniConGen[10-1], "ZZZZZZ9.9999")), 674, Gx_line+50, 738, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV89ValConGen[10-1], "ZZZZZZZZ9.99")), 674, Gx_line+67, 738, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86UniCprGen[10-1], "ZZZZZZ9.99")), 684, Gx_line+17, 737, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88ValCprGen[11-1], "ZZZZZZZZ9.99")), 748, Gx_line+33, 812, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87UniConGen[11-1], "ZZZZZZ9.9999")), 748, Gx_line+50, 812, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV89ValConGen[11-1], "ZZZZZZZZ9.99")), 748, Gx_line+67, 812, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86UniCprGen[11-1], "ZZZZZZ9.99")), 758, Gx_line+17, 811, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88ValCprGen[12-1], "ZZZZZZZZ9.99")), 822, Gx_line+33, 886, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87UniConGen[12-1], "ZZZZZZ9.9999")), 822, Gx_line+50, 886, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV89ValConGen[12-1], "ZZZZZZZZ9.99")), 822, Gx_line+67, 886, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86UniCprGen[12-1], "ZZZZZZ9.99")), 832, Gx_line+17, 885, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV83UniCoG, "ZZZZZZ9.9999")), 891, Gx_line+50, 955, Gx_line+64, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV82UniCpG, "ZZZZZZ9.99")), 901, Gx_line+17, 954, Gx_line+31, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV85ValCoG, "ZZZZZZZZ9.99")), 891, Gx_line+67, 955, Gx_line+81, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84ValCpG, "ZZZZZZZZ9.99")), 891, Gx_line+33, 955, Gx_line+47, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Lit34, "")), 957, Gx_line+17, 1031, Gx_line+31, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(8, Gx_line+8, 1138, Gx_line+8, 1, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+83) ;
   }

   public void h6HI0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21NomEmp, "")), 7, Gx_line+10, 258, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit0, "")), 799, Gx_line+10, 842, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 857, Gx_line+10, 925, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit1, "")), 933, Gx_line+10, 967, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 999, Gx_line+10, 1067, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit2, "")), 7, Gx_line+33, 268, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18Any), "ZZZ9")), 306, Gx_line+34, 340, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit3, "")), 933, Gx_line+33, 984, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1014, Gx_line+33, 1065, Gx_line+51, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit7, "")), 38, Gx_line+83, 65, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit8, "")), 101, Gx_line+83, 138, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit9, "")), 177, Gx_line+83, 204, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit10, "")), 251, Gx_line+83, 278, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit11, "")), 326, Gx_line+83, 348, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit12, "")), 395, Gx_line+83, 427, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Lit13, "")), 469, Gx_line+83, 501, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit14, "")), 541, Gx_line+83, 573, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit15, "")), 619, Gx_line+83, 641, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit16, "")), 681, Gx_line+83, 718, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit17, "")), 750, Gx_line+83, 798, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit18, "")), 824, Gx_line+83, 872, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit19, "")), 906, Gx_line+83, 933, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Lit20, "")), 974, Gx_line+83, 1017, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99Pgmname, "")), 434, Gx_line+33, 685, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("(", 295, Gx_line+34, 304, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(")", 343, Gx_line+34, 352, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(8, Gx_line+63, 1138, Gx_line+63, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(8, Gx_line+98, 1138, Gx_line+98, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+101) ;
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
      AV16PProd = "" ;
      AV17UProd = "" ;
      AV47Lit0 = "" ;
      AV48Lit1 = "" ;
      AV49Lit2 = "" ;
      AV50Lit3 = "" ;
      AV51Lit4 = "" ;
      AV52Lit5 = "" ;
      AV53Lit6 = "" ;
      AV54Lit7 = "" ;
      AV55Lit8 = "" ;
      AV56Lit9 = "" ;
      AV57Lit10 = "" ;
      AV58Lit11 = "" ;
      AV59Lit12 = "" ;
      AV60Lit13 = "" ;
      AV61Lit14 = "" ;
      AV62Lit15 = "" ;
      AV63Lit16 = "" ;
      AV64Lit17 = "" ;
      AV65Lit18 = "" ;
      AV66Lit19 = "" ;
      AV67Lit20 = "" ;
      AV68Lit21 = "" ;
      AV70Lit23 = "" ;
      AV71Lit24 = "" ;
      AV72Lit25 = "" ;
      AV73Lit26 = "" ;
      AV74Lit27 = "" ;
      AV75Lit28 = "" ;
      AV76Lit29 = "" ;
      AV77Lit30 = "" ;
      AV78Lit31 = "" ;
      GXv_int3 = new byte[1] ;
      AV69Lit22 = "" ;
      scmdbuf = "" ;
      P06HI2_A396EmprCod = new String[] {""} ;
      P06HI2_A407EmprNom = new String[] {""} ;
      P06HI2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV21NomEmp = "" ;
      AV79TipCol = "" ;
      AV43UniCpA = DecimalUtil.ZERO ;
      AV45ValCpA = DecimalUtil.ZERO ;
      AV44UniCoA = DecimalUtil.ZERO ;
      AV46ValCoA = DecimalUtil.ZERO ;
      AV39UniCprTot = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV39UniCprTot[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV41ValCprTot = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV41ValCprTot[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV40UniConTot = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV40UniConTot[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV42ValConTot = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV42ValConTot[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV83UniCoG = DecimalUtil.ZERO ;
      AV82UniCpG = DecimalUtil.ZERO ;
      AV85ValCoG = DecimalUtil.ZERO ;
      AV84ValCpG = DecimalUtil.ZERO ;
      AV86UniCprGen = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV86UniCprGen[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV88ValCprGen = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV88ValCprGen[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV87UniConGen = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV87UniConGen[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV89ValConGen = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV89ValConGen[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      P06HI8_A396EmprCod = new String[] {""} ;
      P06HI8_A719PrdNum = new String[] {""} ;
      P06HI8_A681PrdAny = new short[1] ;
      P06HI8_A676PrdAcuConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HI8_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HI8_n331DifValConA = new boolean[] {false} ;
      P06HI8_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HI8_A3915EmpNumDec = new byte[1] ;
      P06HI8_n3915EmpNumDec = new boolean[] {false} ;
      P06HI8_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HI8_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HI8_A794PrvNom = new String[] {""} ;
      P06HI8_n794PrvNom = new boolean[] {false} ;
      P06HI8_A795PrvNum = new int[1] ;
      P06HI8_A718PrdNom = new String[] {""} ;
      P06HI8_A677PrdAcuCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HI8_A748PrdValCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HI8_A746PrdValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HI8_A3907ValorPS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HI8_n3907ValorPS = new boolean[] {false} ;
      P06HI8_A3906ValorPE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HI8_n3906ValorPE = new boolean[] {false} ;
      A719PrdNum = "" ;
      A676PrdAcuConA = DecimalUtil.ZERO ;
      A331DifValConA = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A794PrvNom = "" ;
      A718PrdNom = "" ;
      A677PrdAcuCprA = DecimalUtil.ZERO ;
      A748PrdValCprA = DecimalUtil.ZERO ;
      A746PrdValConA = DecimalUtil.ZERO ;
      A3907ValorPS = DecimalUtil.ZERO ;
      A3906ValorPE = DecimalUtil.ZERO ;
      A3908ValorT = DecimalUtil.ZERO ;
      AV38Exist = DecimalUtil.ZERO ;
      AV37Importe = DecimalUtil.ZERO ;
      AV92PrecioP = DecimalUtil.ZERO ;
      AV32UniConAnt = DecimalUtil.ZERO ;
      AV33UniCprAnt = DecimalUtil.ZERO ;
      AV34ValCprAnt = DecimalUtil.ZERO ;
      AV35ValConAnt = DecimalUtil.ZERO ;
      P06HI10_A677PrdAcuCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HI10_A748PrdValCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HI10_A746PrdValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV29TotUniCon = DecimalUtil.ZERO ;
      AV28TotUniCpr = DecimalUtil.ZERO ;
      AV31TotValCon = DecimalUtil.ZERO ;
      AV30TotValCpr = DecimalUtil.ZERO ;
      AV23UniCprMes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV23UniCprMes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV25ValCprMes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV25ValCprMes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV26UniConMes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV26UniConMes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV27ValConMes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV27ValConMes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      P06HI11_A396EmprCod = new String[] {""} ;
      P06HI11_A719PrdNum = new String[] {""} ;
      P06HI11_A681PrdAny = new short[1] ;
      P06HI11_A720PrdNumMes = new byte[1] ;
      P06HI11_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HI11_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HI11_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HI11_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A745PrdUniCprM = DecimalUtil.ZERO ;
      A749PrdValCprM = DecimalUtil.ZERO ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      A747PrdValConM = DecimalUtil.ZERO ;
      AV90Lit34 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV99Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rst0011__default(),
         new Object[] {
             new Object[] {
            P06HI2_A396EmprCod, P06HI2_A407EmprNom, P06HI2_n407EmprNom
            }
            , new Object[] {
            P06HI8_A396EmprCod, P06HI8_A719PrdNum, P06HI8_A681PrdAny, P06HI8_A676PrdAcuConA, P06HI8_A331DifValConA, P06HI8_n331DifValConA, P06HI8_A704PrdExiAlm, P06HI8_A3915EmpNumDec, P06HI8_n3915EmpNumDec, P06HI8_A724PrdPreAct,
            P06HI8_A726PrdPreMed, P06HI8_A794PrvNom, P06HI8_n794PrvNom, P06HI8_A795PrvNum, P06HI8_A718PrdNom, P06HI8_A677PrdAcuCprA, P06HI8_A748PrdValCprA, P06HI8_A746PrdValConA, P06HI8_A3907ValorPS, P06HI8_n3907ValorPS,
            P06HI8_A3906ValorPE, P06HI8_n3906ValorPE
            }
            , new Object[] {
            P06HI10_A677PrdAcuCprA, P06HI10_A748PrdValCprA, P06HI10_A746PrdValConA
            }
            , new Object[] {
            P06HI11_A396EmprCod, P06HI11_A719PrdNum, P06HI11_A681PrdAny, P06HI11_A720PrdNumMes, P06HI11_A745PrdUniCprM, P06HI11_A749PrdValCprM, P06HI11_A744PrdUniConM, P06HI11_A747PrdValConM
            }
         }
      );
      AV99Pgmname = "RST0011" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV99Pgmname = "RST0011" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV91FlagpreMed ;
   private byte GXv_int3[] ;
   private byte A3915EmpNumDec ;
   private byte AV24I ;
   private byte A720PrdNumMes ;
   private short gxcookieaux ;
   private short AV18Any ;
   private short AV36AnyCab ;
   private short A681PrdAny ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GX_I ;
   private int A795PrvNum ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV43UniCpA ;
   private java.math.BigDecimal AV45ValCpA ;
   private java.math.BigDecimal AV44UniCoA ;
   private java.math.BigDecimal AV46ValCoA ;
   private java.math.BigDecimal AV39UniCprTot[] ;
   private java.math.BigDecimal AV41ValCprTot[] ;
   private java.math.BigDecimal AV40UniConTot[] ;
   private java.math.BigDecimal AV42ValConTot[] ;
   private java.math.BigDecimal AV83UniCoG ;
   private java.math.BigDecimal AV82UniCpG ;
   private java.math.BigDecimal AV85ValCoG ;
   private java.math.BigDecimal AV84ValCpG ;
   private java.math.BigDecimal AV86UniCprGen[] ;
   private java.math.BigDecimal AV88ValCprGen[] ;
   private java.math.BigDecimal AV87UniConGen[] ;
   private java.math.BigDecimal AV89ValConGen[] ;
   private java.math.BigDecimal A676PrdAcuConA ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A677PrdAcuCprA ;
   private java.math.BigDecimal A748PrdValCprA ;
   private java.math.BigDecimal A746PrdValConA ;
   private java.math.BigDecimal A3907ValorPS ;
   private java.math.BigDecimal A3906ValorPE ;
   private java.math.BigDecimal A3908ValorT ;
   private java.math.BigDecimal AV38Exist ;
   private java.math.BigDecimal AV37Importe ;
   private java.math.BigDecimal AV92PrecioP ;
   private java.math.BigDecimal AV32UniConAnt ;
   private java.math.BigDecimal AV33UniCprAnt ;
   private java.math.BigDecimal AV34ValCprAnt ;
   private java.math.BigDecimal AV35ValConAnt ;
   private java.math.BigDecimal AV29TotUniCon ;
   private java.math.BigDecimal AV28TotUniCpr ;
   private java.math.BigDecimal AV31TotValCon ;
   private java.math.BigDecimal AV30TotValCpr ;
   private java.math.BigDecimal AV23UniCprMes[] ;
   private java.math.BigDecimal AV25ValCprMes[] ;
   private java.math.BigDecimal AV26UniConMes[] ;
   private java.math.BigDecimal AV27ValConMes[] ;
   private java.math.BigDecimal A745PrdUniCprM ;
   private java.math.BigDecimal A749PrdValCprM ;
   private java.math.BigDecimal A744PrdUniConM ;
   private java.math.BigDecimal A747PrdValConM ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV16PProd ;
   private String AV17UProd ;
   private String AV47Lit0 ;
   private String AV48Lit1 ;
   private String AV49Lit2 ;
   private String AV50Lit3 ;
   private String AV51Lit4 ;
   private String AV52Lit5 ;
   private String AV53Lit6 ;
   private String AV54Lit7 ;
   private String AV55Lit8 ;
   private String AV56Lit9 ;
   private String AV57Lit10 ;
   private String AV58Lit11 ;
   private String AV59Lit12 ;
   private String AV60Lit13 ;
   private String AV61Lit14 ;
   private String AV62Lit15 ;
   private String AV63Lit16 ;
   private String AV64Lit17 ;
   private String AV65Lit18 ;
   private String AV66Lit19 ;
   private String AV67Lit20 ;
   private String AV68Lit21 ;
   private String AV70Lit23 ;
   private String AV71Lit24 ;
   private String AV72Lit25 ;
   private String AV73Lit26 ;
   private String AV74Lit27 ;
   private String AV75Lit28 ;
   private String AV76Lit29 ;
   private String AV77Lit30 ;
   private String AV78Lit31 ;
   private String AV69Lit22 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV21NomEmp ;
   private String AV79TipCol ;
   private String A719PrdNum ;
   private String A794PrvNom ;
   private String A718PrdNom ;
   private String AV90Lit34 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_time ;
   private String AV99Pgmname ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk6HI4 ;
   private boolean n331DifValConA ;
   private boolean n3915EmpNumDec ;
   private boolean n794PrvNom ;
   private boolean n3907ValorPS ;
   private boolean n3906ValorPE ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P06HI2_A396EmprCod ;
   private String[] P06HI2_A407EmprNom ;
   private boolean[] P06HI2_n407EmprNom ;
   private String[] P06HI8_A396EmprCod ;
   private String[] P06HI8_A719PrdNum ;
   private short[] P06HI8_A681PrdAny ;
   private java.math.BigDecimal[] P06HI8_A676PrdAcuConA ;
   private java.math.BigDecimal[] P06HI8_A331DifValConA ;
   private boolean[] P06HI8_n331DifValConA ;
   private java.math.BigDecimal[] P06HI8_A704PrdExiAlm ;
   private byte[] P06HI8_A3915EmpNumDec ;
   private boolean[] P06HI8_n3915EmpNumDec ;
   private java.math.BigDecimal[] P06HI8_A724PrdPreAct ;
   private java.math.BigDecimal[] P06HI8_A726PrdPreMed ;
   private String[] P06HI8_A794PrvNom ;
   private boolean[] P06HI8_n794PrvNom ;
   private int[] P06HI8_A795PrvNum ;
   private String[] P06HI8_A718PrdNom ;
   private java.math.BigDecimal[] P06HI8_A677PrdAcuCprA ;
   private java.math.BigDecimal[] P06HI8_A748PrdValCprA ;
   private java.math.BigDecimal[] P06HI8_A746PrdValConA ;
   private java.math.BigDecimal[] P06HI8_A3907ValorPS ;
   private boolean[] P06HI8_n3907ValorPS ;
   private java.math.BigDecimal[] P06HI8_A3906ValorPE ;
   private boolean[] P06HI8_n3906ValorPE ;
   private java.math.BigDecimal[] P06HI10_A677PrdAcuCprA ;
   private java.math.BigDecimal[] P06HI10_A748PrdValCprA ;
   private java.math.BigDecimal[] P06HI10_A746PrdValConA ;
   private String[] P06HI11_A396EmprCod ;
   private String[] P06HI11_A719PrdNum ;
   private short[] P06HI11_A681PrdAny ;
   private byte[] P06HI11_A720PrdNumMes ;
   private java.math.BigDecimal[] P06HI11_A745PrdUniCprM ;
   private java.math.BigDecimal[] P06HI11_A749PrdValCprM ;
   private java.math.BigDecimal[] P06HI11_A744PrdUniConM ;
   private java.math.BigDecimal[] P06HI11_A747PrdValConM ;
}

final  class rst0011__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06HI2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06HI8", "SELECT T1.EmprCod, T1.PrdNum, T1.PrdAny, T1.PrdAcuConA, T1.DifValConA, T3.PrdExiAlm, T2.EmpNumDec, T3.PrdPreAct, T3.PrdPreMed, T4.PrvNom, T3.PrvNum, T3.PrdNom, COALESCE( T7.PrdAcuCprA, 0) AS PrdAcuCprA, COALESCE( T7.PrdValCprA, 0) AS PrdValCprA, COALESCE( T7.PrdValConA, 0) AS PrdValConA, COALESCE( T6.ValorPS, 0) AS ValorPS, COALESCE( T5.ValorPE, 0) AS ValorPE FROM ((((((TXPCPRDES T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) LEFT JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T3.PrvNum) LEFT JOIN (SELECT SUM(COALESCE( T9.ValorE, 0)) AS ValorPE, T8.EmprCod, T8.PrdNum FROM (TXPCCSTKS T8 LEFT JOIN (SELECT CASE  WHEN COALESCE( T11.EmpNumDec, 0) = 0 THEN ROUND(( T10.CCStkCanE * CAST(T10.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T11.EmpNumDec, 0) = 2 THEN ROUND(( T10.CCStkCanE * CAST(T10.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorE, T10.EmprCod, T10.PrdNum, T10.CCStkLin FROM (TXPCCSTKS T10 INNER JOIN TXPEMPRES T11 ON T11.EmprCod = T10.EmprCod) ) T9 ON T9.EmprCod = T8.EmprCod AND T9.PrdNum = T8.PrdNum AND T9.CCStkLin = T8.CCStkLin) GROUP BY T8.EmprCod, T8.PrdNum ) T5 ON T5.EmprCod = T1.EmprCod AND T5.PrdNum = T1.PrdNum) LEFT JOIN (SELECT SUM(COALESCE( T9.ValorS, 0)) AS ValorPS, T8.EmprCod, T8.PrdNum FROM (TXPCCSTKS T8 LEFT JOIN (SELECT CASE  WHEN COALESCE( T11.EmpNumDec, 0) = 0 THEN ROUND(( T10.CCStkCanS * CAST(T10.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T11.EmpNumDec, 0) = 2 THEN ROUND(( T10.CCStkCanS * CAST(T10.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T10.EmprCod, T10.PrdNum, T10.CCStkLin FROM (TXPCCSTKS T10 INNER JOIN TXPEMPRES T11 ON T11.EmprCod = T10.EmprCod) ) T9 ON T9.EmprCod = T8.EmprCod AND T9.PrdNum = T8.PrdNum AND T9.CCStkLin = T8.CCStkLin) GROUP BY T8.EmprCod, T8.PrdNum ) T6 ON T6.EmprCod = T1.EmprCod AND T6.PrdNum = T1.PrdNum) LEFT JOIN (SELECT SUM(PrdUniCprM) AS PrdAcuCprA, EmprCod, PrdNum, PrdAny, SUM(PrdValCprM) AS PrdValCprA, SUM(PrdValConM) AS PrdValConA FROM TXPLPRDES GROUP BY EmprCod, PrdNum, PrdAny ) T7 ON T7.EmprCod = T1.EmprCod AND T7.PrdNum = T1.PrdNum AND T7.PrdAny = T1.PrdAny) WHERE (T1.EmprCod = ? and T1.PrdNum >= ?) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06HI10", "SELECT COALESCE( T1.PrdAcuCprA, 0) AS PrdAcuCprA, COALESCE( T1.PrdValCprA, 0) AS PrdValCprA, COALESCE( T1.PrdValConA, 0) AS PrdValConA FROM (SELECT SUM(PrdUniCprM) AS PrdAcuCprA, EmprCod, PrdNum, PrdAny, SUM(PrdValCprM) AS PrdValCprA, SUM(PrdValConM) AS PrdValConA FROM TXPLPRDES GROUP BY EmprCod, PrdNum, PrdAny ) T1 WHERE T1.EmprCod = ? AND T1.PrdNum = ? AND T1.PrdAny = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06HI11", "SELECT EmprCod, PrdNum, PrdAny, PrdNumMes, PrdUniCprM, PrdValCprM, PrdUniConM, PrdValConM FROM TXPLPRDES WHERE EmprCod = ? and PrdNum = ? and PrdAny = ? ORDER BY EmprCod, PrdNum, PrdAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 26);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

