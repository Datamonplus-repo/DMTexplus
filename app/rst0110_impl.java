package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rst0110_impl extends GXWebReport
{
   public rst0110_impl( com.genexus.internet.HttpContext context )
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
            AV16Anyo = (short)(GXutil.lval( httpContext.GetPar( "Anyo"))) ;
            AV43MesI = (byte)(GXutil.lval( httpContext.GetPar( "MesI"))) ;
            AV50MesF = (byte)(GXutil.lval( httpContext.GetPar( "MesF"))) ;
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
         GXt_char1 = AV26Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit0 = GXt_char1 ;
         GXt_char1 = AV27Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit1 = GXt_char1 ;
         GXt_char1 = AV28Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN755_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit2 = GXt_char1 ;
         GXt_char1 = AV29Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit3 = GXt_char1 ;
         GXt_char1 = AV30Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2471_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit4 = GXt_char1 ;
         GXt_char1 = AV31Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN466_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit5 = GXt_char1 ;
         GXt_char1 = AV32Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN399_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit6 = GXt_char1 ;
         GXt_char1 = AV33Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2432_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit7 = GXt_char1 ;
         GXt_char1 = AV34Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN502_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit8 = GXt_char1 ;
         GXt_char1 = AV35Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit9 = GXt_char1 ;
         GXt_char1 = AV36Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2006_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit10 = GXt_char1 ;
         GXt_char1 = AV37Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2007_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit11 = GXt_char1 ;
         GXt_char1 = AV38Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT419_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit12 = GXt_char1 ;
         GXt_char1 = AV39Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2487_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit13 = GXt_char1 ;
         GXt_char1 = AV40Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2488_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit14 = GXt_char1 ;
         GXt_char1 = AV41Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2489_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit15 = GXt_char1 ;
         GXt_char1 = AV42Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2490_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit16 = GXt_char1 ;
         GXt_char1 = AV44Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT139_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit17 = GXt_char1 ;
         GXt_char1 = AV45Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN112_", ""), (byte)(99), GXv_char2) ;
         rst0110_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit18 = GXt_char1 ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = AV16Anyo ;
         GXv_int4[0] = AV43MesI ;
         GXv_int5[0] = AV50MesF ;
         new app.pordprd1(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_int5) ;
         rst0110_impl.this.A396EmprCod = GXv_char2[0] ;
         rst0110_impl.this.AV16Anyo = GXv_int3[0] ;
         rst0110_impl.this.AV43MesI = GXv_int4[0] ;
         rst0110_impl.this.AV50MesF = GXv_int5[0] ;
         /* Using cursor P06I82 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06I82_A407EmprNom[0] ;
            n407EmprNom = P06I82_n407EmprNom[0] ;
            AV18NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = AV16Anyo ;
         GXv_int5[0] = AV43MesI ;
         GXv_int4[0] = AV50MesF ;
         new app.pordprd1(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int5, GXv_int4) ;
         rst0110_impl.this.A396EmprCod = GXv_char2[0] ;
         rst0110_impl.this.AV16Anyo = GXv_int3[0] ;
         rst0110_impl.this.AV43MesI = GXv_int5[0] ;
         rst0110_impl.this.AV50MesF = GXv_int4[0] ;
         /* Using cursor P06I83 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A407EmprNom = P06I83_A407EmprNom[0] ;
            n407EmprNom = P06I83_n407EmprNom[0] ;
            AV18NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV19Porcen = DecimalUtil.doubleToDec(0) ;
         AV20PorAcu = DecimalUtil.doubleToDec(0) ;
         AV21PorcGrp = DecimalUtil.doubleToDec(0) ;
         AV22TotGrp = DecimalUtil.doubleToDec(0) ;
         AV23TotInf = DecimalUtil.doubleToDec(0) ;
         AV25Flag = (byte)(1) ;
         /* Using cursor P06I84 */
         pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(AV16Anyo)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A681PrdAny = P06I84_A681PrdAny[0] ;
            A719PrdNum = P06I84_A719PrdNum[0] ;
            A331DifValConA = P06I84_A331DifValConA[0] ;
            n331DifValConA = P06I84_n331DifValConA[0] ;
            /* Using cursor P06I85 */
            pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(AV43MesI), Byte.valueOf(AV50MesF)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A720PrdNumMes = P06I85_A720PrdNumMes[0] ;
               A747PrdValConM = P06I85_A747PrdValConM[0] ;
               A744PrdUniConM = P06I85_A744PrdUniConM[0] ;
               if ( ( A744PrdUniConM.doubleValue() != 0 ) && ( A747PrdValConM.doubleValue() != 0 ) )
               {
                  AV17TotCoN = AV17TotCoN.add(A747PrdValConM) ;
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Using cursor P06I86 */
         pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(AV16Anyo)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A681PrdAny = P06I86_A681PrdAny[0] ;
            A718PrdNom = P06I86_A718PrdNom[0] ;
            A719PrdNum = P06I86_A719PrdNum[0] ;
            A331DifValConA = P06I86_A331DifValConA[0] ;
            n331DifValConA = P06I86_n331DifValConA[0] ;
            A718PrdNom = P06I86_A718PrdNom[0] ;
            /* Using cursor P06I87 */
            pr_default.execute(5, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(AV43MesI), Byte.valueOf(AV50MesF)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               brk6I88 = false ;
               A744PrdUniConM = P06I87_A744PrdUniConM[0] ;
               A747PrdValConM = P06I87_A747PrdValConM[0] ;
               A720PrdNumMes = P06I87_A720PrdNumMes[0] ;
               if ( ( A744PrdUniConM.doubleValue() != 0 ) && ( A747PrdValConM.doubleValue() != 0 ) )
               {
                  if ( AV25Flag == 3 )
                  {
                     AV25Flag = (byte)(4) ;
                  }
                  AV48PrdUniConM = DecimalUtil.doubleToDec(0) ;
                  AV49PrdValConM = DecimalUtil.doubleToDec(0) ;
                  while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P06I87_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P06I87_A719PrdNum[0], A719PrdNum) == 0 ) && ( P06I87_A681PrdAny[0] == A681PrdAny ) )
                  {
                     brk6I88 = false ;
                     A744PrdUniConM = P06I87_A744PrdUniConM[0] ;
                     A747PrdValConM = P06I87_A747PrdValConM[0] ;
                     A720PrdNumMes = P06I87_A720PrdNumMes[0] ;
                     AV48PrdUniConM = AV48PrdUniConM.add(A744PrdUniConM) ;
                     AV49PrdValConM = AV49PrdValConM.add(A747PrdValConM) ;
                     brk6I88 = true ;
                     pr_default.readNext(5);
                  }
                  if ( AV17TotCoN.doubleValue() != 0 )
                  {
                     AV19Porcen = AV49PrdValConM.multiply(DecimalUtil.doubleToDec(100)).divide(AV17TotCoN, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     AV19Porcen = DecimalUtil.doubleToDec(0) ;
                  }
                  AV20PorAcu = AV20PorAcu.add(AV19Porcen) ;
                  AV23TotInf = AV23TotInf.add(AV49PrdValConM) ;
                  AV47TotInfC = AV47TotInfC.add(AV48PrdUniConM) ;
                  h6I80( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 32, Gx_line+0, 77, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 89, Gx_line+0, 280, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV48PrdUniConM, "Z,ZZZ,ZZ9.9999")), 309, Gx_line+0, 412, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV49PrdValConM, "ZZZ,ZZZ,ZZ9.99")), 454, Gx_line+0, 557, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19Porcen, "ZZ9.99")), 594, Gx_line+0, 639, Gx_line+17, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV21PorcGrp = AV21PorcGrp.add(AV19Porcen) ;
                  AV22TotGrp = AV22TotGrp.add(AV49PrdValConM) ;
                  AV46TotUniC = AV46TotUniC.add(AV48PrdUniConM) ;
                  if ( ( AV20PorAcu.doubleValue() >= 80 ) && ( AV25Flag == 1 ) )
                  {
                     h6I80( false, 45) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit13, "")), 156, Gx_line+17, 288, Gx_line+34, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(18, Gx_line+7, 666, Gx_line+39, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TotGrp, "ZZZ,ZZZ,ZZ9.99")), 459, Gx_line+17, 562, Gx_line+34, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21PorcGrp, "ZZ9.99")), 599, Gx_line+17, 644, Gx_line+34, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46TotUniC, "Z,ZZZ,ZZ9.9999")), 315, Gx_line+17, 418, Gx_line+34, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+45) ;
                     AV21PorcGrp = DecimalUtil.doubleToDec(0) ;
                     AV22TotGrp = DecimalUtil.doubleToDec(0) ;
                     AV46TotUniC = DecimalUtil.doubleToDec(0) ;
                     AV25Flag = (byte)(2) ;
                  }
                  if ( ( AV20PorAcu.doubleValue() > 95 ) && ( AV25Flag == 2 ) )
                  {
                     h6I80( false, 45) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit14, "")), 156, Gx_line+17, 288, Gx_line+34, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(18, Gx_line+7, 666, Gx_line+39, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TotGrp, "ZZZ,ZZZ,ZZ9.99")), 459, Gx_line+17, 562, Gx_line+34, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46TotUniC, "Z,ZZZ,ZZ9.9999")), 315, Gx_line+17, 418, Gx_line+34, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21PorcGrp, "ZZ9.99")), 599, Gx_line+17, 644, Gx_line+34, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+45) ;
                     AV21PorcGrp = DecimalUtil.doubleToDec(0) ;
                     AV22TotGrp = DecimalUtil.doubleToDec(0) ;
                     AV46TotUniC = DecimalUtil.doubleToDec(0) ;
                     AV25Flag = (byte)(3) ;
                  }
               }
               if ( ! brk6I88 )
               {
                  brk6I88 = true ;
                  pr_default.readNext(5);
               }
            }
            pr_default.close(5);
            pr_default.readNext(4);
         }
         pr_default.close(4);
         if ( AV25Flag == 4 )
         {
            h6I80( false, 45) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit15, "")), 156, Gx_line+17, 288, Gx_line+34, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(18, Gx_line+7, 666, Gx_line+39, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46TotUniC, "Z,ZZZ,ZZ9.9999")), 315, Gx_line+17, 418, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TotGrp, "ZZZ,ZZZ,ZZ9.99")), 459, Gx_line+17, 562, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21PorcGrp, "ZZ9.99")), 599, Gx_line+17, 644, Gx_line+34, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+45) ;
         }
         h6I80( false, 41) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit16, "")), 156, Gx_line+17, 288, Gx_line+34, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(18, Gx_line+7, 666, Gx_line+39, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23TotInf, "ZZZ,ZZZ,ZZ9.99")), 459, Gx_line+17, 562, Gx_line+34, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20PorAcu, "ZZ9.99")), 599, Gx_line+17, 644, Gx_line+34, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV47TotInfC, "Z,ZZZ,ZZ9.9999")), 315, Gx_line+17, 418, Gx_line+34, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+41) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6I80( true, 0) ;
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

   public void h6I80( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18NomEmp, "")), 25, Gx_line+7, 275, Gx_line+24, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit0, "")), 414, Gx_line+8, 450, Gx_line+24, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 458, Gx_line+8, 517, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit1, "")), 545, Gx_line+8, 574, Gx_line+24, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 596, Gx_line+8, 655, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit2, "")), 25, Gx_line+41, 259, Gx_line+60, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit3, "")), 545, Gx_line+44, 589, Gx_line+60, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 596, Gx_line+44, 641, Gx_line+61, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit4, "")), 267, Gx_line+44, 425, Gx_line+60, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 592, Gx_line+84, 600, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit5, "")), 309, Gx_line+84, 411, Gx_line+100, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit6, "")), 454, Gx_line+84, 556, Gx_line+100, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit7, "")), 602, Gx_line+84, 637, Gx_line+100, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit8, "")), 32, Gx_line+101, 115, Gx_line+117, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit10, "")), 309, Gx_line+101, 411, Gx_line+117, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit11, "")), 454, Gx_line+101, 556, Gx_line+117, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit12, "")), 586, Gx_line+101, 637, Gx_line+117, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+65, 666, Gx_line+65, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+120, 666, Gx_line+120, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit17, "")), 34, Gx_line+74, 64, Gx_line+90, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16Anyo), "ZZZ9")), 77, Gx_line+74, 107, Gx_line+92, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit18, "")), 136, Gx_line+74, 167, Gx_line+90, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43MesI), "Z9")), 180, Gx_line+74, 196, Gx_line+92, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 451, Gx_line+8, 455, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 590, Gx_line+44, 594, Gx_line+60, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 585, Gx_line+8, 589, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 71, Gx_line+74, 75, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 173, Gx_line+74, 177, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Pgmname, "")), 447, Gx_line+44, 505, Gx_line+60, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50MesF), "Z9")), 199, Gx_line+74, 215, Gx_line+92, 2+256, 0, 0, 0) ;
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
      add_metrics2( ) ;
      add_metrics3( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV26Lit0 = "" ;
      AV27Lit1 = "" ;
      AV28Lit2 = "" ;
      AV29Lit3 = "" ;
      AV30Lit4 = "" ;
      AV31Lit5 = "" ;
      AV32Lit6 = "" ;
      AV33Lit7 = "" ;
      AV34Lit8 = "" ;
      AV35Lit9 = "" ;
      AV36Lit10 = "" ;
      AV37Lit11 = "" ;
      AV38Lit12 = "" ;
      AV39Lit13 = "" ;
      AV40Lit14 = "" ;
      AV41Lit15 = "" ;
      AV42Lit16 = "" ;
      AV44Lit17 = "" ;
      AV45Lit18 = "" ;
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P06I82_A396EmprCod = new String[] {""} ;
      P06I82_A407EmprNom = new String[] {""} ;
      P06I82_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV18NomEmp = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new short[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int4 = new byte[1] ;
      P06I83_A396EmprCod = new String[] {""} ;
      P06I83_A407EmprNom = new String[] {""} ;
      P06I83_n407EmprNom = new boolean[] {false} ;
      AV19Porcen = DecimalUtil.ZERO ;
      AV20PorAcu = DecimalUtil.ZERO ;
      AV21PorcGrp = DecimalUtil.ZERO ;
      AV22TotGrp = DecimalUtil.ZERO ;
      AV23TotInf = DecimalUtil.ZERO ;
      P06I84_A396EmprCod = new String[] {""} ;
      P06I84_A681PrdAny = new short[1] ;
      P06I84_A719PrdNum = new String[] {""} ;
      P06I84_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06I84_n331DifValConA = new boolean[] {false} ;
      A719PrdNum = "" ;
      A331DifValConA = DecimalUtil.ZERO ;
      P06I85_A396EmprCod = new String[] {""} ;
      P06I85_A719PrdNum = new String[] {""} ;
      P06I85_A681PrdAny = new short[1] ;
      P06I85_A720PrdNumMes = new byte[1] ;
      P06I85_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06I85_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A747PrdValConM = DecimalUtil.ZERO ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      AV17TotCoN = DecimalUtil.ZERO ;
      P06I86_A396EmprCod = new String[] {""} ;
      P06I86_A681PrdAny = new short[1] ;
      P06I86_A718PrdNom = new String[] {""} ;
      P06I86_A719PrdNum = new String[] {""} ;
      P06I86_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06I86_n331DifValConA = new boolean[] {false} ;
      A718PrdNom = "" ;
      P06I87_A396EmprCod = new String[] {""} ;
      P06I87_A719PrdNum = new String[] {""} ;
      P06I87_A681PrdAny = new short[1] ;
      P06I87_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06I87_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06I87_A720PrdNumMes = new byte[1] ;
      AV48PrdUniConM = DecimalUtil.ZERO ;
      AV49PrdValConM = DecimalUtil.ZERO ;
      AV47TotInfC = DecimalUtil.ZERO ;
      AV46TotUniC = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV57Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rst0110__default(),
         new Object[] {
             new Object[] {
            P06I82_A396EmprCod, P06I82_A407EmprNom, P06I82_n407EmprNom
            }
            , new Object[] {
            P06I83_A396EmprCod, P06I83_A407EmprNom, P06I83_n407EmprNom
            }
            , new Object[] {
            P06I84_A396EmprCod, P06I84_A681PrdAny, P06I84_A719PrdNum, P06I84_A331DifValConA, P06I84_n331DifValConA
            }
            , new Object[] {
            P06I85_A396EmprCod, P06I85_A719PrdNum, P06I85_A681PrdAny, P06I85_A720PrdNumMes, P06I85_A747PrdValConM, P06I85_A744PrdUniConM
            }
            , new Object[] {
            P06I86_A396EmprCod, P06I86_A681PrdAny, P06I86_A718PrdNom, P06I86_A719PrdNum, P06I86_A331DifValConA, P06I86_n331DifValConA
            }
            , new Object[] {
            P06I87_A396EmprCod, P06I87_A719PrdNum, P06I87_A681PrdAny, P06I87_A744PrdUniConM, P06I87_A747PrdValConM, P06I87_A720PrdNumMes
            }
         }
      );
      AV57Pgmname = "RST0110" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV57Pgmname = "RST0110" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV43MesI ;
   private byte AV50MesF ;
   private byte GXv_int5[] ;
   private byte GXv_int4[] ;
   private byte AV25Flag ;
   private byte A720PrdNumMes ;
   private short gxcookieaux ;
   private short AV16Anyo ;
   private short GXv_int3[] ;
   private short A681PrdAny ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV19Porcen ;
   private java.math.BigDecimal AV20PorAcu ;
   private java.math.BigDecimal AV21PorcGrp ;
   private java.math.BigDecimal AV22TotGrp ;
   private java.math.BigDecimal AV23TotInf ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal A747PrdValConM ;
   private java.math.BigDecimal A744PrdUniConM ;
   private java.math.BigDecimal AV17TotCoN ;
   private java.math.BigDecimal AV48PrdUniConM ;
   private java.math.BigDecimal AV49PrdValConM ;
   private java.math.BigDecimal AV47TotInfC ;
   private java.math.BigDecimal AV46TotUniC ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV26Lit0 ;
   private String AV27Lit1 ;
   private String AV28Lit2 ;
   private String AV29Lit3 ;
   private String AV30Lit4 ;
   private String AV31Lit5 ;
   private String AV32Lit6 ;
   private String AV33Lit7 ;
   private String AV34Lit8 ;
   private String AV35Lit9 ;
   private String AV36Lit10 ;
   private String AV37Lit11 ;
   private String AV38Lit12 ;
   private String AV39Lit13 ;
   private String AV40Lit14 ;
   private String AV41Lit15 ;
   private String AV42Lit16 ;
   private String AV44Lit17 ;
   private String AV45Lit18 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV18NomEmp ;
   private String GXv_char2[] ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String Gx_time ;
   private String AV57Pgmname ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n331DifValConA ;
   private boolean brk6I88 ;
   private IDataStoreProvider pr_default ;
   private String[] P06I82_A396EmprCod ;
   private String[] P06I82_A407EmprNom ;
   private boolean[] P06I82_n407EmprNom ;
   private String[] P06I83_A396EmprCod ;
   private String[] P06I83_A407EmprNom ;
   private boolean[] P06I83_n407EmprNom ;
   private String[] P06I84_A396EmprCod ;
   private short[] P06I84_A681PrdAny ;
   private String[] P06I84_A719PrdNum ;
   private java.math.BigDecimal[] P06I84_A331DifValConA ;
   private boolean[] P06I84_n331DifValConA ;
   private String[] P06I85_A396EmprCod ;
   private String[] P06I85_A719PrdNum ;
   private short[] P06I85_A681PrdAny ;
   private byte[] P06I85_A720PrdNumMes ;
   private java.math.BigDecimal[] P06I85_A747PrdValConM ;
   private java.math.BigDecimal[] P06I85_A744PrdUniConM ;
   private String[] P06I86_A396EmprCod ;
   private short[] P06I86_A681PrdAny ;
   private String[] P06I86_A718PrdNom ;
   private String[] P06I86_A719PrdNum ;
   private java.math.BigDecimal[] P06I86_A331DifValConA ;
   private boolean[] P06I86_n331DifValConA ;
   private String[] P06I87_A396EmprCod ;
   private String[] P06I87_A719PrdNum ;
   private short[] P06I87_A681PrdAny ;
   private java.math.BigDecimal[] P06I87_A744PrdUniConM ;
   private java.math.BigDecimal[] P06I87_A747PrdValConM ;
   private byte[] P06I87_A720PrdNumMes ;
}

final  class rst0110__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06I82", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06I83", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06I84", "SELECT EmprCod, PrdAny, PrdNum, DifValConA FROM TXPCPRDES WHERE (EmprCod = ?) AND (PrdAny = ?) ORDER BY EmprCod, DifValConA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06I85", "SELECT EmprCod, PrdNum, PrdAny, PrdNumMes, PrdValConM, PrdUniConM FROM TXPLPRDES WHERE (EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes >= ?) AND (PrdNumMes <= ?) ORDER BY EmprCod, PrdNum, PrdAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06I86", "SELECT T1.EmprCod, T1.PrdAny, T2.PrdNom, T1.PrdNum, T1.DifValConA FROM (TXPCPRDES T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PrdAny = ?) ORDER BY T1.EmprCod, T1.DifValConA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06I87", "SELECT EmprCod, PrdNum, PrdAny, PrdUniConM, PrdValConM, PrdNumMes FROM TXPLPRDES WHERE (EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes >= ?) AND (PrdNumMes <= ?) ORDER BY EmprCod, PrdNum, PrdAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

