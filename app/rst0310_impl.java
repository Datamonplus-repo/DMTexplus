package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rst0310_impl extends GXWebReport
{
   public rst0310_impl( com.genexus.internet.HttpContext context )
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
            AV16PDigito = httpContext.GetPar( "PDigito") ;
            AV17Anyo = (short)(GXutil.lval( httpContext.GetPar( "Anyo"))) ;
            AV51Mesi = (byte)(GXutil.lval( httpContext.GetPar( "Mesi"))) ;
            AV46MesF = (byte)(GXutil.lval( httpContext.GetPar( "MesF"))) ;
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
         GXt_char1 = AV27Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit0 = GXt_char1 ;
         GXt_char1 = AV28Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit1 = GXt_char1 ;
         GXt_char1 = AV29Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2236_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit2 = GXt_char1 ;
         GXt_char1 = AV30Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit3 = GXt_char1 ;
         GXt_char1 = AV31Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2471_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit4 = GXt_char1 ;
         GXt_char1 = AV32Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN466_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit5 = GXt_char1 ;
         GXt_char1 = AV33Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN399_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit6 = GXt_char1 ;
         GXt_char1 = AV34Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2432_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit7 = GXt_char1 ;
         GXt_char1 = AV35Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN502_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit8 = GXt_char1 ;
         GXt_char1 = AV36Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit9 = GXt_char1 ;
         GXt_char1 = AV37Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2006_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit10 = GXt_char1 ;
         GXt_char1 = AV38Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2007_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit11 = GXt_char1 ;
         GXt_char1 = AV39Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT419_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit12 = GXt_char1 ;
         GXt_char1 = AV40Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2487_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit13 = GXt_char1 ;
         GXt_char1 = AV41Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2488_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit14 = GXt_char1 ;
         GXt_char1 = AV42Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2489_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit15 = GXt_char1 ;
         GXt_char1 = AV43Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2490_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit16 = GXt_char1 ;
         GXt_char1 = AV44Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT139_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit17 = GXt_char1 ;
         GXt_char1 = AV45Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN112_", ""), (byte)(99), GXv_char2) ;
         rst0310_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit18 = GXt_char1 ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = AV17Anyo ;
         GXv_int4[0] = AV51Mesi ;
         GXv_int5[0] = AV46MesF ;
         new app.pordprd1(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_int5) ;
         rst0310_impl.this.A396EmprCod = GXv_char2[0] ;
         rst0310_impl.this.AV17Anyo = GXv_int3[0] ;
         rst0310_impl.this.AV51Mesi = GXv_int4[0] ;
         rst0310_impl.this.AV46MesF = GXv_int5[0] ;
         /* Using cursor P06HP2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06HP2_A407EmprNom[0] ;
            n407EmprNom = P06HP2_n407EmprNom[0] ;
            AV19NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV20Porcen = DecimalUtil.doubleToDec(0) ;
         AV21PorAcu = DecimalUtil.doubleToDec(0) ;
         AV22PorcGrp = DecimalUtil.doubleToDec(0) ;
         AV23TotGrp = DecimalUtil.doubleToDec(0) ;
         AV24TotInf = DecimalUtil.doubleToDec(0) ;
         AV26Flag = (byte)(1) ;
         /* Using cursor P06HP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV16PDigito, Short.valueOf(AV17Anyo)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A681PrdAny = P06HP3_A681PrdAny[0] ;
            A719PrdNum = P06HP3_A719PrdNum[0] ;
            A331DifValConA = P06HP3_A331DifValConA[0] ;
            n331DifValConA = P06HP3_n331DifValConA[0] ;
            /* Using cursor P06HP4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(AV51Mesi), Byte.valueOf(AV46MesF)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A720PrdNumMes = P06HP4_A720PrdNumMes[0] ;
               A747PrdValConM = P06HP4_A747PrdValConM[0] ;
               A744PrdUniConM = P06HP4_A744PrdUniConM[0] ;
               if ( ( A744PrdUniConM.doubleValue() != 0 ) && ( A747PrdValConM.doubleValue() != 0 ) )
               {
                  AV18TotCoN = AV18TotCoN.add(A747PrdValConM) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P06HP5 */
         pr_default.execute(3, new Object[] {A396EmprCod, AV16PDigito, Short.valueOf(AV17Anyo)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A681PrdAny = P06HP5_A681PrdAny[0] ;
            A718PrdNom = P06HP5_A718PrdNom[0] ;
            A719PrdNum = P06HP5_A719PrdNum[0] ;
            A331DifValConA = P06HP5_A331DifValConA[0] ;
            n331DifValConA = P06HP5_n331DifValConA[0] ;
            A718PrdNom = P06HP5_A718PrdNom[0] ;
            /* Using cursor P06HP6 */
            pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(AV51Mesi), Byte.valueOf(AV46MesF)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               brk6HP7 = false ;
               A744PrdUniConM = P06HP6_A744PrdUniConM[0] ;
               A747PrdValConM = P06HP6_A747PrdValConM[0] ;
               A720PrdNumMes = P06HP6_A720PrdNumMes[0] ;
               if ( ( A744PrdUniConM.doubleValue() != 0 ) && ( A747PrdValConM.doubleValue() != 0 ) )
               {
                  if ( AV26Flag == 3 )
                  {
                     AV26Flag = (byte)(4) ;
                  }
                  AV49PrdUniConM = DecimalUtil.doubleToDec(0) ;
                  AV50PrdValConM = DecimalUtil.doubleToDec(0) ;
                  while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P06HP6_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P06HP6_A719PrdNum[0], A719PrdNum) == 0 ) && ( P06HP6_A681PrdAny[0] == A681PrdAny ) )
                  {
                     brk6HP7 = false ;
                     A744PrdUniConM = P06HP6_A744PrdUniConM[0] ;
                     A747PrdValConM = P06HP6_A747PrdValConM[0] ;
                     A720PrdNumMes = P06HP6_A720PrdNumMes[0] ;
                     AV49PrdUniConM = AV49PrdUniConM.add(A744PrdUniConM) ;
                     AV50PrdValConM = AV50PrdValConM.add(A747PrdValConM) ;
                     brk6HP7 = true ;
                     pr_default.readNext(4);
                  }
                  if ( AV18TotCoN.doubleValue() != 0 )
                  {
                     AV20Porcen = AV50PrdValConM.multiply(DecimalUtil.doubleToDec(100)).divide(AV18TotCoN, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     AV20Porcen = DecimalUtil.doubleToDec(0) ;
                  }
                  AV21PorAcu = AV21PorAcu.add(AV20Porcen) ;
                  AV24TotInf = AV24TotInf.add(AV50PrdValConM) ;
                  AV48TotInfC = AV48TotInfC.add(AV49PrdUniConM) ;
                  h6HP0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 32, Gx_line+0, 77, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 89, Gx_line+0, 280, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV49PrdUniConM, "Z,ZZZ,ZZ9.9999")), 320, Gx_line+0, 423, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV50PrdValConM, "ZZZ,ZZZ,ZZ9.99")), 465, Gx_line+0, 568, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20Porcen, "ZZ9.99")), 602, Gx_line+0, 647, Gx_line+17, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV22PorcGrp = AV22PorcGrp.add(AV20Porcen) ;
                  AV23TotGrp = AV23TotGrp.add(AV50PrdValConM) ;
                  AV47TotUniC = AV47TotUniC.add(AV49PrdUniConM) ;
                  if ( ( AV21PorAcu.doubleValue() >= 80 ) && ( AV26Flag == 1 ) )
                  {
                     h6HP0( false, 45) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit13, "")), 161, Gx_line+16, 293, Gx_line+33, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(20, Gx_line+7, 668, Gx_line+39, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23TotGrp, "ZZZ,ZZZ,ZZ9.99")), 465, Gx_line+16, 568, Gx_line+33, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22PorcGrp, "ZZ9.99")), 604, Gx_line+16, 649, Gx_line+33, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV47TotUniC, "Z,ZZZ,ZZ9.9999")), 320, Gx_line+16, 423, Gx_line+33, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+45) ;
                     AV22PorcGrp = DecimalUtil.doubleToDec(0) ;
                     AV23TotGrp = DecimalUtil.doubleToDec(0) ;
                     AV47TotUniC = DecimalUtil.doubleToDec(0) ;
                     AV26Flag = (byte)(2) ;
                  }
                  if ( ( AV21PorAcu.doubleValue() > 95 ) && ( AV26Flag == 2 ) )
                  {
                     h6HP0( false, 45) ;
                     getPrinter().GxDrawRect(20, Gx_line+6, 668, Gx_line+38, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit14, "")), 161, Gx_line+15, 293, Gx_line+32, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23TotGrp, "ZZZ,ZZZ,ZZ9.99")), 465, Gx_line+15, 568, Gx_line+32, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22PorcGrp, "ZZ9.99")), 604, Gx_line+15, 649, Gx_line+32, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV47TotUniC, "Z,ZZZ,ZZ9.9999")), 320, Gx_line+15, 423, Gx_line+32, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+45) ;
                     AV22PorcGrp = DecimalUtil.doubleToDec(0) ;
                     AV23TotGrp = DecimalUtil.doubleToDec(0) ;
                     AV47TotUniC = DecimalUtil.doubleToDec(0) ;
                     AV26Flag = (byte)(3) ;
                  }
               }
               if ( ! brk6HP7 )
               {
                  brk6HP7 = true ;
                  pr_default.readNext(4);
               }
            }
            pr_default.close(4);
            pr_default.readNext(3);
         }
         pr_default.close(3);
         if ( AV26Flag == 4 )
         {
            h6HP0( false, 45) ;
            getPrinter().GxDrawRect(20, Gx_line+9, 668, Gx_line+41, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit15, "")), 161, Gx_line+18, 293, Gx_line+35, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV47TotUniC, "Z,ZZZ,ZZ9.9999")), 320, Gx_line+18, 423, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23TotGrp, "ZZZ,ZZZ,ZZ9.99")), 465, Gx_line+18, 568, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22PorcGrp, "ZZ9.99")), 604, Gx_line+18, 649, Gx_line+35, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+45) ;
         }
         h6HP0( false, 41) ;
         getPrinter().GxDrawRect(20, Gx_line+6, 668, Gx_line+38, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit16, "")), 161, Gx_line+15, 293, Gx_line+32, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TotInf, "ZZZ,ZZZ,ZZ9.99")), 465, Gx_line+15, 568, Gx_line+32, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21PorAcu, "ZZ9.99")), 604, Gx_line+15, 649, Gx_line+32, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV48TotInfC, "Z,ZZZ,ZZ9.9999")), 320, Gx_line+15, 423, Gx_line+32, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+41) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6HP0( true, 0) ;
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

   public void h6HP0( boolean bFoot ,
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
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19NomEmp, "")), 25, Gx_line+6, 275, Gx_line+23, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit0, "")), 414, Gx_line+7, 450, Gx_line+23, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 461, Gx_line+7, 520, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit1, "")), 545, Gx_line+7, 574, Gx_line+23, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 595, Gx_line+7, 654, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit2, "")), 25, Gx_line+40, 410, Gx_line+59, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit3, "")), 545, Gx_line+43, 589, Gx_line+59, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 602, Gx_line+44, 647, Gx_line+61, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 639, Gx_line+84, 647, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit5, "")), 309, Gx_line+84, 411, Gx_line+100, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit6, "")), 454, Gx_line+84, 556, Gx_line+100, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit7, "")), 610, Gx_line+84, 645, Gx_line+100, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit8, "")), 32, Gx_line+101, 115, Gx_line+117, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit10, "")), 309, Gx_line+101, 411, Gx_line+117, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit11, "")), 454, Gx_line+101, 556, Gx_line+117, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit12, "")), 595, Gx_line+101, 646, Gx_line+117, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(20, Gx_line+64, 668, Gx_line+64, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(20, Gx_line+120, 668, Gx_line+120, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit17, "")), 34, Gx_line+73, 64, Gx_line+89, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17Anyo), "ZZZ9")), 77, Gx_line+73, 107, Gx_line+91, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit18, "")), 136, Gx_line+73, 167, Gx_line+89, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46MesF), "Z9")), 203, Gx_line+73, 219, Gx_line+91, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 454, Gx_line+7, 458, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 591, Gx_line+43, 595, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 591, Gx_line+7, 595, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 71, Gx_line+73, 75, Gx_line+89, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 174, Gx_line+73, 178, Gx_line+89, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Pgmname, "")), 461, Gx_line+43, 519, Gx_line+59, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 602, Gx_line+84, 610, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV51Mesi), "Z9")), 182, Gx_line+73, 198, Gx_line+91, 2+256, 0, 0, 0) ;
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
      AV16PDigito = "" ;
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
      AV39Lit12 = "" ;
      AV40Lit13 = "" ;
      AV41Lit14 = "" ;
      AV42Lit15 = "" ;
      AV43Lit16 = "" ;
      AV44Lit17 = "" ;
      AV45Lit18 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new short[1] ;
      GXv_int4 = new byte[1] ;
      GXv_int5 = new byte[1] ;
      scmdbuf = "" ;
      P06HP2_A396EmprCod = new String[] {""} ;
      P06HP2_A407EmprNom = new String[] {""} ;
      P06HP2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV19NomEmp = "" ;
      AV20Porcen = DecimalUtil.ZERO ;
      AV21PorAcu = DecimalUtil.ZERO ;
      AV22PorcGrp = DecimalUtil.ZERO ;
      AV23TotGrp = DecimalUtil.ZERO ;
      AV24TotInf = DecimalUtil.ZERO ;
      P06HP3_A396EmprCod = new String[] {""} ;
      P06HP3_A681PrdAny = new short[1] ;
      P06HP3_A719PrdNum = new String[] {""} ;
      P06HP3_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HP3_n331DifValConA = new boolean[] {false} ;
      A719PrdNum = "" ;
      A331DifValConA = DecimalUtil.ZERO ;
      P06HP4_A396EmprCod = new String[] {""} ;
      P06HP4_A719PrdNum = new String[] {""} ;
      P06HP4_A681PrdAny = new short[1] ;
      P06HP4_A720PrdNumMes = new byte[1] ;
      P06HP4_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HP4_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A747PrdValConM = DecimalUtil.ZERO ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      AV18TotCoN = DecimalUtil.ZERO ;
      P06HP5_A396EmprCod = new String[] {""} ;
      P06HP5_A681PrdAny = new short[1] ;
      P06HP5_A718PrdNom = new String[] {""} ;
      P06HP5_A719PrdNum = new String[] {""} ;
      P06HP5_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HP5_n331DifValConA = new boolean[] {false} ;
      A718PrdNom = "" ;
      P06HP6_A396EmprCod = new String[] {""} ;
      P06HP6_A719PrdNum = new String[] {""} ;
      P06HP6_A681PrdAny = new short[1] ;
      P06HP6_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HP6_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HP6_A720PrdNumMes = new byte[1] ;
      AV49PrdUniConM = DecimalUtil.ZERO ;
      AV50PrdValConM = DecimalUtil.ZERO ;
      AV48TotInfC = DecimalUtil.ZERO ;
      AV47TotUniC = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV58Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rst0310__default(),
         new Object[] {
             new Object[] {
            P06HP2_A396EmprCod, P06HP2_A407EmprNom, P06HP2_n407EmprNom
            }
            , new Object[] {
            P06HP3_A396EmprCod, P06HP3_A681PrdAny, P06HP3_A719PrdNum, P06HP3_A331DifValConA, P06HP3_n331DifValConA
            }
            , new Object[] {
            P06HP4_A396EmprCod, P06HP4_A719PrdNum, P06HP4_A681PrdAny, P06HP4_A720PrdNumMes, P06HP4_A747PrdValConM, P06HP4_A744PrdUniConM
            }
            , new Object[] {
            P06HP5_A396EmprCod, P06HP5_A681PrdAny, P06HP5_A718PrdNom, P06HP5_A719PrdNum, P06HP5_A331DifValConA, P06HP5_n331DifValConA
            }
            , new Object[] {
            P06HP6_A396EmprCod, P06HP6_A719PrdNum, P06HP6_A681PrdAny, P06HP6_A744PrdUniConM, P06HP6_A747PrdValConM, P06HP6_A720PrdNumMes
            }
         }
      );
      AV58Pgmname = "RST0310" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV58Pgmname = "RST0310" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV51Mesi ;
   private byte AV46MesF ;
   private byte GXv_int4[] ;
   private byte GXv_int5[] ;
   private byte AV26Flag ;
   private byte A720PrdNumMes ;
   private short gxcookieaux ;
   private short AV17Anyo ;
   private short GXv_int3[] ;
   private short A681PrdAny ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV20Porcen ;
   private java.math.BigDecimal AV21PorAcu ;
   private java.math.BigDecimal AV22PorcGrp ;
   private java.math.BigDecimal AV23TotGrp ;
   private java.math.BigDecimal AV24TotInf ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal A747PrdValConM ;
   private java.math.BigDecimal A744PrdUniConM ;
   private java.math.BigDecimal AV18TotCoN ;
   private java.math.BigDecimal AV49PrdUniConM ;
   private java.math.BigDecimal AV50PrdValConM ;
   private java.math.BigDecimal AV48TotInfC ;
   private java.math.BigDecimal AV47TotUniC ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV16PDigito ;
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
   private String AV39Lit12 ;
   private String AV40Lit13 ;
   private String AV41Lit14 ;
   private String AV42Lit15 ;
   private String AV43Lit16 ;
   private String AV44Lit17 ;
   private String AV45Lit18 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV19NomEmp ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String Gx_time ;
   private String AV58Pgmname ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n331DifValConA ;
   private boolean brk6HP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P06HP2_A396EmprCod ;
   private String[] P06HP2_A407EmprNom ;
   private boolean[] P06HP2_n407EmprNom ;
   private String[] P06HP3_A396EmprCod ;
   private short[] P06HP3_A681PrdAny ;
   private String[] P06HP3_A719PrdNum ;
   private java.math.BigDecimal[] P06HP3_A331DifValConA ;
   private boolean[] P06HP3_n331DifValConA ;
   private String[] P06HP4_A396EmprCod ;
   private String[] P06HP4_A719PrdNum ;
   private short[] P06HP4_A681PrdAny ;
   private byte[] P06HP4_A720PrdNumMes ;
   private java.math.BigDecimal[] P06HP4_A747PrdValConM ;
   private java.math.BigDecimal[] P06HP4_A744PrdUniConM ;
   private String[] P06HP5_A396EmprCod ;
   private short[] P06HP5_A681PrdAny ;
   private String[] P06HP5_A718PrdNom ;
   private String[] P06HP5_A719PrdNum ;
   private java.math.BigDecimal[] P06HP5_A331DifValConA ;
   private boolean[] P06HP5_n331DifValConA ;
   private String[] P06HP6_A396EmprCod ;
   private String[] P06HP6_A719PrdNum ;
   private short[] P06HP6_A681PrdAny ;
   private java.math.BigDecimal[] P06HP6_A744PrdUniConM ;
   private java.math.BigDecimal[] P06HP6_A747PrdValConM ;
   private byte[] P06HP6_A720PrdNumMes ;
}

final  class rst0310__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06HP2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06HP3", "SELECT EmprCod, PrdAny, PrdNum, DifValConA FROM TXPCPRDES WHERE (EmprCod = ?) AND (SUBSTR(PrdNum, 1, 1) = ?) AND (PrdAny = ?) ORDER BY EmprCod, DifValConA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06HP4", "SELECT EmprCod, PrdNum, PrdAny, PrdNumMes, PrdValConM, PrdUniConM FROM TXPLPRDES WHERE (EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes >= ?) AND (PrdNumMes <= ?) ORDER BY EmprCod, PrdNum, PrdAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06HP5", "SELECT T1.EmprCod, T1.PrdAny, T2.PrdNom, T1.PrdNum, T1.DifValConA FROM (TXPCPRDES T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (SUBSTR(T1.PrdNum, 1, 1) = ?) AND (T1.PrdAny = ?) ORDER BY T1.EmprCod, T1.DifValConA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06HP6", "SELECT EmprCod, PrdNum, PrdAny, PrdUniConM, PrdValConM, PrdNumMes FROM TXPLPRDES WHERE (EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes >= ?) AND (PrdNumMes <= ?) ORDER BY EmprCod, PrdNum, PrdAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 4 :
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
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

