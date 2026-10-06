package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rlisbarg_impl extends GXWebReport
{
   public rlisbarg_impl( com.genexus.internet.HttpContext context )
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
            AV15PBarCod = (int)(GXutil.lval( httpContext.GetPar( "PBarCod"))) ;
            AV16UBarC1 = (int)(GXutil.lval( httpContext.GetPar( "UBarC1"))) ;
            AV17PBarReo = (byte)(GXutil.lval( httpContext.GetPar( "PBarReo"))) ;
            AV18UBarReo1 = (byte)(GXutil.lval( httpContext.GetPar( "UBarReo1"))) ;
            AV19PBarPar = httpContext.GetPar( "PBarPar") ;
            AV20UBarPar1 = httpContext.GetPar( "UBarPar1") ;
            AV21PFecGen = localUtil.parseDateParm( httpContext.GetPar( "PFecGen")) ;
            AV22UFecGen1 = localUtil.parseDateParm( httpContext.GetPar( "UFecGen1")) ;
            AV23PFecDis = localUtil.parseDateParm( httpContext.GetPar( "PFecDis")) ;
            AV24UFecDis1 = localUtil.parseDateParm( httpContext.GetPar( "UFecDis1")) ;
            AV25Edit = (byte)(GXutil.lval( httpContext.GetPar( "Edit"))) ;
            AV26PSit = (byte)(GXutil.lval( httpContext.GetPar( "PSit"))) ;
            AV27USit = (byte)(GXutil.lval( httpContext.GetPar( "USit"))) ;
            AV28ImpCod = httpContext.GetPar( "ImpCod") ;
            AV29Fuente = (byte)(GXutil.lval( httpContext.GetPar( "Fuente"))) ;
            AV30TipPapel = httpContext.GetPar( "TipPapel") ;
            AV31PClicod = (int)(GXutil.lval( httpContext.GetPar( "PClicod"))) ;
            AV32UClicod2 = (int)(GXutil.lval( httpContext.GetPar( "UClicod2"))) ;
            AV99Pfecent = localUtil.parseDateParm( httpContext.GetPar( "Pfecent")) ;
            AV100Ufecent = localUtil.parseDateParm( httpContext.GetPar( "Ufecent")) ;
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
         GXt_int1 = AV89Moda21 ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
         rlisbarg_impl.this.GXt_int1 = GXv_int2[0] ;
         AV89Moda21 = GXt_int1 ;
         GXt_int1 = AV93Ideatint ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IDEATI", ""), GXv_int2) ;
         rlisbarg_impl.this.GXt_int1 = GXv_int2[0] ;
         AV93Ideatint = GXt_int1 ;
         GXt_int1 = AV90Cli350 ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int2) ;
         rlisbarg_impl.this.GXt_int1 = GXv_int2[0] ;
         AV90Cli350 = GXt_int1 ;
         GXt_int3 = AV91ContVal ;
         GXv_int4[0] = GXt_int3 ;
         new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int4) ;
         rlisbarg_impl.this.GXt_int3 = GXv_int4[0] ;
         AV91ContVal = GXt_int3 ;
         GXt_int1 = AV95Damf ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DAMF", ""), GXv_int2) ;
         rlisbarg_impl.this.GXt_int1 = GXv_int2[0] ;
         AV95Damf = GXt_int1 ;
         GXt_int1 = AV98Velta ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTTO", ""), GXv_int2) ;
         rlisbarg_impl.this.GXt_int1 = GXv_int2[0] ;
         AV98Velta = GXt_int1 ;
         GXt_char5 = AV57Lit0 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN024_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV57Lit0 = GXt_char5 ;
         GXt_char5 = AV58Lit1 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV58Lit1 = GXt_char5 ;
         GXt_char5 = AV59Lit2 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV59Lit2 = GXt_char5 ;
         GXt_char5 = AV60Lit3 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV60Lit3 = GXt_char5 ;
         GXt_char5 = AV61Lit4 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV61Lit4 = GXt_char5 ;
         GXt_char5 = AV62Lit5 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2038_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV62Lit5 = GXt_char5 ;
         GXt_char5 = AV63Lit6 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV63Lit6 = GXt_char5 ;
         GXt_char5 = AV64Lit7 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2189_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV64Lit7 = GXt_char5 ;
         GXt_char5 = AV65Lit8 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN557_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV65Lit8 = GXt_char5 ;
         GXt_char5 = AV66Lit9 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV66Lit9 = GXt_char5 ;
         GXt_char5 = AV67Lit10 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV67Lit10 = GXt_char5 ;
         GXt_char5 = AV68Lit11 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV68Lit11 = GXt_char5 ;
         GXt_char5 = AV69Lit12 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2218_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV69Lit12 = GXt_char5 ;
         GXt_char5 = AV70Lit13 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2397_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV70Lit13 = GXt_char5 ;
         GXt_char5 = AV71Lit14 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2443_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV71Lit14 = GXt_char5 ;
         GXt_char5 = AV72Lit15 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1170_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV72Lit15 = GXt_char5 ;
         GXt_char5 = AV73Lit16 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN311_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV73Lit16 = GXt_char5 ;
         GXt_char5 = AV74Lit17 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2429_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV74Lit17 = GXt_char5 ;
         GXt_char5 = AV75Lit18 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN601_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV75Lit18 = GXt_char5 ;
         GXt_char5 = AV76Lit19 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2146_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV76Lit19 = GXt_char5 ;
         GXt_char5 = AV77Lit20 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2447_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV77Lit20 = GXt_char5 ;
         GXt_char5 = AV78Lit21 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2447_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV78Lit21 = GXt_char5 ;
         GXt_char5 = AV79Lit22 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2447_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV79Lit22 = GXt_char5 ;
         GXt_char5 = AV80Lit23 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN273_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV80Lit23 = GXt_char5 ;
         GXt_char5 = AV81Lit24 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2490_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV81Lit24 = GXt_char5 ;
         GXt_char5 = AV82Lit25 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1120_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV82Lit25 = GXt_char5 ;
         GXt_char5 = AV83Lit26 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1498_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV83Lit26 = GXt_char5 ;
         GXt_char5 = AV84Lit27 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV84Lit27 = GXt_char5 ;
         GXt_char5 = AV85Lit28 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN3002_", ""), (byte)(99), GXv_char6) ;
         rlisbarg_impl.this.GXt_char5 = GXv_char6[0] ;
         AV85Lit28 = GXt_char5 ;
         if ( AV93Ideatint == 1 )
         {
            AV75Lit18 = " " ;
         }
         if ( AV95Damf == 1 )
         {
            AV65Lit8 = httpContext.getMessage( "Dispo.Cli.", "") ;
         }
         /* Using cursor P06OK2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06OK2_A407EmprNom[0] ;
            n407EmprNom = P06OK2_n407EmprNom[0] ;
            AV33NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV56TBar = (short)(0) ;
         AV51TKil = DecimalUtil.doubleToDec(0) ;
         AV52TKPen = DecimalUtil.doubleToDec(0) ;
         AV54TMet = DecimalUtil.doubleToDec(0) ;
         AV55TMPen = DecimalUtil.doubleToDec(0) ;
         AV53TPie = 0 ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV15PBarCod) ,
                                              Integer.valueOf(AV16UBarC1) ,
                                              Byte.valueOf(AV17PBarReo) ,
                                              Byte.valueOf(AV18UBarReo1) ,
                                              AV19PBarPar ,
                                              AV20UBarPar1 ,
                                              AV21PFecGen ,
                                              AV22UFecGen1 ,
                                              AV23PFecDis ,
                                              AV24UFecDis1 ,
                                              Integer.valueOf(AV31PClicod) ,
                                              Integer.valueOf(AV32UClicod2) ,
                                              Byte.valueOf(AV26PSit) ,
                                              Byte.valueOf(AV27USit) ,
                                              AV99Pfecent ,
                                              AV100Ufecent ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A159BarFecGen ,
                                              A155BarFecCli ,
                                              Integer.valueOf(A252CliCod) ,
                                              Byte.valueOf(A213BarSit) ,
                                              A158BarFecFpr ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.STRING
                                              }
         });
         /* Using cursor P06OK10 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15PBarCod), Integer.valueOf(AV16UBarC1), Byte.valueOf(AV17PBarReo), Byte.valueOf(AV18UBarReo1), AV19PBarPar, AV20UBarPar1, AV21PFecGen, AV22UFecGen1, AV23PFecDis, AV24UFecDis1, Integer.valueOf(AV31PClicod), Integer.valueOf(AV32UClicod2), Byte.valueOf(AV26PSit), Byte.valueOf(AV27USit), AV99Pfecent, AV100Ufecent});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6OK4 = false ;
            A178BarLis = P06OK10_A178BarLis[0] ;
            A182BarMat = P06OK10_A182BarMat[0] ;
            A143BarDisNum = P06OK10_A143BarDisNum[0] ;
            A180BarMaqCod = P06OK10_A180BarMaqCod[0] ;
            A135BarColNom = P06OK10_A135BarColNom[0] ;
            A136BarColNum = P06OK10_A136BarColNum[0] ;
            A129BarCod = P06OK10_A129BarCod[0] ;
            A132BarCodReo = P06OK10_A132BarCodReo[0] ;
            A130BarCodPar = P06OK10_A130BarCodPar[0] ;
            A159BarFecGen = P06OK10_A159BarFecGen[0] ;
            A155BarFecCli = P06OK10_A155BarFecCli[0] ;
            A252CliCod = P06OK10_A252CliCod[0] ;
            n252CliCod = P06OK10_n252CliCod[0] ;
            A213BarSit = P06OK10_A213BarSit[0] ;
            A158BarFecFpr = P06OK10_A158BarFecFpr[0] ;
            A212BarSer = P06OK10_A212BarSer[0] ;
            A279CliNom = P06OK10_A279CliNom[0] ;
            A168BarKgmLan = P06OK10_A168BarKgmLan[0] ;
            A166BarKgm = P06OK10_A166BarKgm[0] ;
            A186BarMtrLan = P06OK10_A186BarMtrLan[0] ;
            A184BarMtr = P06OK10_A184BarMtr[0] ;
            A151BarFasCod = P06OK10_A151BarFasCod[0] ;
            n151BarFasCod = P06OK10_n151BarFasCod[0] ;
            A156BarFecCum = P06OK10_A156BarFecCum[0] ;
            n156BarFecCum = P06OK10_n156BarFecCum[0] ;
            A199BarPie1 = P06OK10_A199BarPie1[0] ;
            A365DisDes = P06OK10_A365DisDes[0] ;
            A898BarPieNDes = P06OK10_A898BarPieNDes[0] ;
            A279CliNom = P06OK10_A279CliNom[0] ;
            A168BarKgmLan = P06OK10_A168BarKgmLan[0] ;
            A166BarKgm = P06OK10_A166BarKgm[0] ;
            A186BarMtrLan = P06OK10_A186BarMtrLan[0] ;
            A184BarMtr = P06OK10_A184BarMtr[0] ;
            A199BarPie1 = P06OK10_A199BarPie1[0] ;
            A898BarPieNDes = P06OK10_A898BarPieNDes[0] ;
            A151BarFasCod = P06OK10_A151BarFasCod[0] ;
            n151BarFasCod = P06OK10_n151BarFasCod[0] ;
            A156BarFecCum = P06OK10_A156BarFecCum[0] ;
            n156BarFecCum = P06OK10_n156BarFecCum[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            if ( ( AV89Moda21 == 1 ) && ( AV90Cli350 == 1 ) && ( AV91ContVal == 1 ) && ( A252CliCod == 350 ) )
            {
            }
            else
            {
               h6OK0( false, 25) ;
               getPrinter().GxAttris("Arial", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 98, Gx_line+3, 142, Gx_line+20, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 146, Gx_line+3, 365, Gx_line+20, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit4, "")), 29, Gx_line+3, 80, Gx_line+20, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 86, Gx_line+2, 94, Gx_line+19, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+25) ;
               AV50NumBarC = (short)(0) ;
               AV45TotKilC = DecimalUtil.doubleToDec(0) ;
               AV46TotKPenC = DecimalUtil.doubleToDec(0) ;
               AV48TotMetC = DecimalUtil.doubleToDec(0) ;
               AV49TotMPenC = DecimalUtil.doubleToDec(0) ;
               AV47TotPieC = 0 ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06OK10_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06OK10_A252CliCod[0] == A252CliCod ) )
               {
                  brk6OK4 = false ;
                  A178BarLis = P06OK10_A178BarLis[0] ;
                  A182BarMat = P06OK10_A182BarMat[0] ;
                  A143BarDisNum = P06OK10_A143BarDisNum[0] ;
                  A180BarMaqCod = P06OK10_A180BarMaqCod[0] ;
                  A135BarColNom = P06OK10_A135BarColNom[0] ;
                  A136BarColNum = P06OK10_A136BarColNum[0] ;
                  A129BarCod = P06OK10_A129BarCod[0] ;
                  A132BarCodReo = P06OK10_A132BarCodReo[0] ;
                  A130BarCodPar = P06OK10_A130BarCodPar[0] ;
                  A159BarFecGen = P06OK10_A159BarFecGen[0] ;
                  A155BarFecCli = P06OK10_A155BarFecCli[0] ;
                  A213BarSit = P06OK10_A213BarSit[0] ;
                  A158BarFecFpr = P06OK10_A158BarFecFpr[0] ;
                  A212BarSer = P06OK10_A212BarSer[0] ;
                  A156BarFecCum = P06OK10_A156BarFecCum[0] ;
                  n156BarFecCum = P06OK10_n156BarFecCum[0] ;
                  A365DisDes = P06OK10_A365DisDes[0] ;
                  A156BarFecCum = P06OK10_A156BarFecCum[0] ;
                  n156BarFecCum = P06OK10_n156BarFecCum[0] ;
                  /* Using cursor P06OK12 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  if ( (pr_default.getStatus(2) != 101) )
                  {
                     A168BarKgmLan = P06OK12_A168BarKgmLan[0] ;
                     A166BarKgm = P06OK12_A166BarKgm[0] ;
                     A186BarMtrLan = P06OK12_A186BarMtrLan[0] ;
                     A184BarMtr = P06OK12_A184BarMtr[0] ;
                     A199BarPie1 = P06OK12_A199BarPie1[0] ;
                     A898BarPieNDes = P06OK12_A898BarPieNDes[0] ;
                  }
                  else
                  {
                     A168BarKgmLan = DecimalUtil.doubleToDec(0) ;
                     A166BarKgm = DecimalUtil.doubleToDec(0) ;
                     A186BarMtrLan = DecimalUtil.doubleToDec(0) ;
                     A184BarMtr = DecimalUtil.doubleToDec(0) ;
                     A898BarPieNDes = 0 ;
                     A199BarPie1 = (short)(0) ;
                  }
                  pr_default.close(2);
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A198BarPie = A898BarPieNDes ;
                  }
                  else
                  {
                     A198BarPie = A199BarPie1 ;
                  }
                  /* Using cursor P06OK15 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  if ( (pr_default.getStatus(3) != 101) )
                  {
                     A151BarFasCod = P06OK15_A151BarFasCod[0] ;
                     n151BarFasCod = P06OK15_n151BarFasCod[0] ;
                  }
                  else
                  {
                     A151BarFasCod = " " ;
                     n151BarFasCod = false ;
                  }
                  pr_default.close(3);
                  AV37TotKil = DecimalUtil.doubleToDec(0) ;
                  AV38TotKilPen = DecimalUtil.doubleToDec(0) ;
                  AV39TotPie = 0 ;
                  AV40TotMet = DecimalUtil.doubleToDec(0) ;
                  AV41TotMetPen = DecimalUtil.doubleToDec(0) ;
                  AV44NumBar = (short)(0) ;
                  while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06OK10_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06OK10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P06OK10_A212BarSer[0], A212BarSer) == 0 ) )
                  {
                     brk6OK4 = false ;
                     A178BarLis = P06OK10_A178BarLis[0] ;
                     A182BarMat = P06OK10_A182BarMat[0] ;
                     A143BarDisNum = P06OK10_A143BarDisNum[0] ;
                     A180BarMaqCod = P06OK10_A180BarMaqCod[0] ;
                     A135BarColNom = P06OK10_A135BarColNom[0] ;
                     A136BarColNum = P06OK10_A136BarColNum[0] ;
                     A129BarCod = P06OK10_A129BarCod[0] ;
                     A132BarCodReo = P06OK10_A132BarCodReo[0] ;
                     A130BarCodPar = P06OK10_A130BarCodPar[0] ;
                     A159BarFecGen = P06OK10_A159BarFecGen[0] ;
                     A155BarFecCli = P06OK10_A155BarFecCli[0] ;
                     A213BarSit = P06OK10_A213BarSit[0] ;
                     A158BarFecFpr = P06OK10_A158BarFecFpr[0] ;
                     A156BarFecCum = P06OK10_A156BarFecCum[0] ;
                     n156BarFecCum = P06OK10_n156BarFecCum[0] ;
                     A365DisDes = P06OK10_A365DisDes[0] ;
                     A156BarFecCum = P06OK10_A156BarFecCum[0] ;
                     n156BarFecCum = P06OK10_n156BarFecCum[0] ;
                     /* Using cursor P06OK17 */
                     pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     if ( (pr_default.getStatus(4) != 101) )
                     {
                        A168BarKgmLan = P06OK17_A168BarKgmLan[0] ;
                        A166BarKgm = P06OK17_A166BarKgm[0] ;
                        A186BarMtrLan = P06OK17_A186BarMtrLan[0] ;
                        A184BarMtr = P06OK17_A184BarMtr[0] ;
                        A199BarPie1 = P06OK17_A199BarPie1[0] ;
                        A898BarPieNDes = P06OK17_A898BarPieNDes[0] ;
                     }
                     else
                     {
                        A168BarKgmLan = DecimalUtil.doubleToDec(0) ;
                        A166BarKgm = DecimalUtil.doubleToDec(0) ;
                        A186BarMtrLan = DecimalUtil.doubleToDec(0) ;
                        A184BarMtr = DecimalUtil.doubleToDec(0) ;
                        A898BarPieNDes = 0 ;
                        A199BarPie1 = (short)(0) ;
                     }
                     pr_default.close(4);
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     /* Using cursor P06OK20 */
                     pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     if ( (pr_default.getStatus(5) != 101) )
                     {
                        A151BarFasCod = P06OK20_A151BarFasCod[0] ;
                        n151BarFasCod = P06OK20_n151BarFasCod[0] ;
                     }
                     else
                     {
                        A151BarFasCod = " " ;
                        n151BarFasCod = false ;
                     }
                     pr_default.close(5);
                     if ( ( AV25Edit == 2 ) || ( ( AV25Edit == 0 ) && ( A178BarLis == 0 ) ) || ( ( AV25Edit == 1 ) && ( A178BarLis == 1 ) ) )
                     {
                        AV42KgmPen = A166BarKgm.subtract(A168BarKgmLan) ;
                        if ( AV42KgmPen.doubleValue() < 0 )
                        {
                           AV42KgmPen = DecimalUtil.doubleToDec(0) ;
                        }
                        AV43MetPen = A184BarMtr.subtract(A186BarMtrLan) ;
                        if ( AV43MetPen.doubleValue() < 0 )
                        {
                           AV43MetPen = DecimalUtil.doubleToDec(0) ;
                        }
                        AV44NumBar = (short)(AV44NumBar+1) ;
                        AV92BarFasCod = A151BarFasCod ;
                        AV94FecCum = localUtil.dtoc( A156BarFecCum, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                        if ( AV93Ideatint == 1 )
                        {
                           AV92BarFasCod = GXutil.str( A213BarSit, 2, 0) ;
                           AV94FecCum = " " ;
                        }
                        AV96BarMat = A182BarMat ;
                        if ( AV95Damf == 1 )
                        {
                           AV96BarMat = A143BarDisNum ;
                        }
                        h6OK0( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 3, Gx_line+0, 121, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 122, Gx_line+0, 181, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 182, Gx_line+0, 190, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96BarMat, "")), 204, Gx_line+0, 322, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 327, Gx_line+0, 372, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 374, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 473, Gx_line+0, 540, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42KgmPen, "ZZZZZ9.99")), 551, Gx_line+0, 618, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")), 621, Gx_line+0, 666, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")), 674, Gx_line+0, 741, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43MetPen, "ZZZZZ9.99")), 750, Gx_line+0, 817, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 822, Gx_line+0, 881, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A180BarMaqCod, "")), 885, Gx_line+0, 930, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92BarFasCod, "")), 932, Gx_line+0, 990, Gx_line+16, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94FecCum, "")), 995, Gx_line+0, 1054, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(localUtil.format( A158BarFecFpr, "99/99/99"), 1057, Gx_line+0, 1116, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 193, Gx_line+0, 201, Gx_line+17, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                        AV37TotKil = AV37TotKil.add(A166BarKgm) ;
                        AV38TotKilPen = AV38TotKilPen.add(AV42KgmPen) ;
                        AV39TotPie = (int)(AV39TotPie+A198BarPie) ;
                        AV40TotMet = AV40TotMet.add(A184BarMtr) ;
                        AV41TotMetPen = AV41TotMetPen.add(AV43MetPen) ;
                     }
                     brk6OK4 = true ;
                     pr_default.readNext(1);
                  }
                  if ( AV44NumBar > 0 )
                  {
                     h6OK0( false, 30) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText("*", 77, Gx_line+6, 83, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 109, Gx_line+6, 226, Gx_line+22, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44NumBar), "ZZZ9")), 341, Gx_line+6, 371, Gx_line+23, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Lit25, "")), 381, Gx_line+6, 454, Gx_line+22, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37TotKil, "ZZZZZZ9.99")), 466, Gx_line+6, 540, Gx_line+23, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38TotKilPen, "ZZZZZZ9.99")), 544, Gx_line+6, 618, Gx_line+23, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39TotPie), "ZZZZZ9")), 621, Gx_line+6, 666, Gx_line+23, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40TotMet, "ZZZZZZ9.99")), 667, Gx_line+6, 741, Gx_line+23, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41TotMetPen, "ZZZZZZ9.99")), 743, Gx_line+6, 817, Gx_line+23, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(466, Gx_line+2, 539, Gx_line+2, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(544, Gx_line+2, 617, Gx_line+2, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(621, Gx_line+2, 665, Gx_line+2, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(669, Gx_line+2, 740, Gx_line+2, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(743, Gx_line+2, 816, Gx_line+2, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+30) ;
                  }
                  AV50NumBarC = (short)(AV50NumBarC+AV44NumBar) ;
                  AV45TotKilC = AV45TotKilC.add(AV37TotKil) ;
                  AV46TotKPenC = AV46TotKPenC.add(AV38TotKilPen) ;
                  AV48TotMetC = AV48TotMetC.add(AV40TotMet) ;
                  AV49TotMPenC = AV49TotMPenC.add(AV41TotMetPen) ;
                  AV47TotPieC = (int)(AV47TotPieC+AV39TotPie) ;
                  if ( ! brk6OK4 )
                  {
                     brk6OK4 = true ;
                     pr_default.readNext(1);
                  }
               }
               if ( AV50NumBarC > 0 )
               {
                  h6OK0( false, 33) ;
                  getPrinter().GxAttris("Arial", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("* *", 69, Gx_line+7, 84, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 109, Gx_line+7, 328, Gx_line+23, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50NumBarC), "ZZZ9")), 340, Gx_line+7, 369, Gx_line+23, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Lit25, "")), 381, Gx_line+7, 454, Gx_line+23, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45TotKilC, "ZZZZZZ9.99")), 466, Gx_line+7, 539, Gx_line+23, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46TotKPenC, "ZZZZZZ9.99")), 544, Gx_line+7, 617, Gx_line+23, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47TotPieC), "ZZZZZ9")), 621, Gx_line+7, 665, Gx_line+23, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV48TotMetC, "ZZZZZZ9.99")), 667, Gx_line+7, 740, Gx_line+23, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV49TotMPenC, "ZZZZZZ9.99")), 743, Gx_line+7, 816, Gx_line+23, 2, 0, 0, 0) ;
                  getPrinter().GxDrawLine(466, Gx_line+2, 539, Gx_line+2, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(544, Gx_line+2, 617, Gx_line+2, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(621, Gx_line+2, 665, Gx_line+2, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(669, Gx_line+2, 740, Gx_line+2, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(743, Gx_line+2, 816, Gx_line+2, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+33) ;
               }
               AV56TBar = (short)(AV56TBar+AV50NumBarC) ;
               AV51TKil = AV51TKil.add(AV45TotKilC) ;
               AV52TKPen = AV52TKPen.add(AV46TotKPenC) ;
               AV54TMet = AV54TMet.add(AV48TotMetC) ;
               AV55TMPen = AV55TMPen.add(AV49TotMPenC) ;
               AV53TPie = (int)(AV53TPie+AV47TotPieC) ;
            }
            if ( ! brk6OK4 )
            {
               brk6OK4 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         if ( AV56TBar > 0 )
         {
            h6OK0( false, 27) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("* * *", 60, Gx_line+7, 83, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81Lit24, "")), 109, Gx_line+7, 240, Gx_line+23, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV56TBar), "ZZZ9")), 342, Gx_line+7, 371, Gx_line+23, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Lit25, "")), 381, Gx_line+7, 454, Gx_line+23, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV51TKil, "ZZZZZZ9.99")), 466, Gx_line+7, 540, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV52TKPen, "ZZZZZZ9.99")), 544, Gx_line+7, 618, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV53TPie), "ZZZZZ9")), 621, Gx_line+7, 666, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54TMet, "ZZZZZZ9.99")), 667, Gx_line+7, 741, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV55TMPen, "ZZZZZZ9.99")), 743, Gx_line+7, 817, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(466, Gx_line+2, 539, Gx_line+2, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(544, Gx_line+2, 617, Gx_line+2, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(621, Gx_line+2, 665, Gx_line+2, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(669, Gx_line+2, 740, Gx_line+2, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(743, Gx_line+2, 816, Gx_line+2, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6OK0( true, 0) ;
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

   public void h6OK0( boolean bFoot ,
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
            getPrinter().GxDrawText(":", 836, Gx_line+13, 844, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 1021, Gx_line+13, 1029, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33NomEmp, "")), 8, Gx_line+13, 227, Gx_line+29, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit1, "")), 793, Gx_line+13, 829, Gx_line+29, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 851, Gx_line+13, 910, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit2, "")), 970, Gx_line+13, 999, Gx_line+29, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 1041, Gx_line+13, 1100, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 1021, Gx_line+40, 1029, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit0, "")), 8, Gx_line+40, 183, Gx_line+56, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Lit3, "")), 970, Gx_line+40, 1014, Gx_line+56, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1050, Gx_line+40, 1095, Gx_line+57, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit6, "")), 3, Gx_line+75, 69, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit7, "")), 122, Gx_line+75, 196, Gx_line+91, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit8, "")), 215, Gx_line+75, 310, Gx_line+91, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit9, "")), 324, Gx_line+75, 371, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Lit10, "")), 389, Gx_line+75, 455, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit11, "")), 502, Gx_line+75, 538, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Lit12, "")), 558, Gx_line+75, 616, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83Lit26, "")), 621, Gx_line+75, 665, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84Lit27, "")), 696, Gx_line+75, 740, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85Lit28, "")), 757, Gx_line+75, 815, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Lit15, "")), 822, Gx_line+75, 873, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Lit16, "")), 889, Gx_line+75, 925, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Lit17, "")), 940, Gx_line+75, 984, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Lit18, "")), 995, Gx_line+75, 1031, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Lit19, "")), 1057, Gx_line+75, 1115, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107Pgmname, "")), 793, Gx_line+40, 851, Gx_line+56, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(674, Gx_line+95, 740, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(750, Gx_line+95, 816, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(822, Gx_line+95, 880, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(885, Gx_line+95, 929, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(932, Gx_line+95, 990, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(995, Gx_line+95, 1053, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1057, Gx_line+95, 1115, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+95, 120, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(204, Gx_line+95, 321, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(323, Gx_line+95, 371, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(374, Gx_line+95, 469, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(473, Gx_line+95, 539, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(551, Gx_line+95, 617, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(621, Gx_line+95, 665, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(122, Gx_line+95, 200, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+5, 1119, Gx_line+5, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+60, 1119, Gx_line+60, 2, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+99) ;
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
      add_metrics4( ) ;
      add_metrics5( ) ;
      add_metrics6( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", true, true, 58, 14, 72, 123,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 30, 35, 35, 55, 45, 14, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 21, 21, 37, 37, 37, 38, 61, 45, 45, 45, 45, 42, 38, 49, 45, 17, 35, 45, 38, 52, 45, 49, 42, 49, 45, 42, 38, 45, 42, 59, 42, 42, 38, 21, 18, 23, 37, 35, 21, 35, 38, 35, 38, 35, 21, 38, 38, 18, 18, 35, 18, 56, 38, 38, 38, 38, 25, 35, 21, 38, 35, 49, 35, 35, 32, 25, 17, 25, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 36, 35, 35, 35, 17, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 21, 21, 36, 35, 21, 21, 21, 23, 35, 53, 53, 53, 38, 45, 45, 45, 45, 45, 45, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 35, 35, 35, 35, 35, 18, 18, 18, 18, 38, 38, 38, 38, 38, 38, 38, 35, 38, 38, 38, 38, 38, 35, 38, 35}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", false, true, 56, 14, 70, 118,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 18, 22, 35, 35, 56, 42, 12, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 18, 18, 37, 37, 37, 35, 64, 42, 42, 45, 45, 42, 38, 49, 45, 18, 32, 42, 35, 53, 45, 49, 42, 49, 45, 42, 38, 45, 42, 61, 42, 42, 38, 18, 18, 18, 30, 35, 21, 35, 35, 32, 35, 35, 18, 35, 35, 14, 14, 32, 14, 52, 35, 35, 35, 35, 21, 32, 18, 35, 32, 45, 32, 32, 29, 21, 16, 21, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 35, 35, 34, 35, 16, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 20, 21, 35, 34, 21, 21, 20, 23, 35, 53, 53, 53, 38, 42, 42, 42, 42, 42, 42, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 32, 35, 35, 35, 35, 18, 18, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 38, 35, 35, 35, 35, 32, 35, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics5( )
   {
      getPrinter().setMetrics("Courier New", true, true, 58, 14, 72, 123,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 30, 35, 35, 55, 45, 14, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 21, 21, 37, 37, 37, 38, 61, 45, 45, 45, 45, 42, 38, 49, 45, 17, 35, 45, 38, 52, 45, 49, 42, 49, 45, 42, 38, 45, 42, 59, 42, 42, 38, 21, 18, 23, 37, 35, 21, 35, 38, 35, 38, 35, 21, 38, 38, 18, 18, 35, 18, 56, 38, 38, 38, 38, 25, 35, 21, 38, 35, 49, 35, 35, 32, 25, 17, 25, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 36, 35, 35, 35, 17, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 21, 21, 36, 35, 21, 21, 21, 23, 35, 53, 53, 53, 38, 45, 45, 45, 45, 45, 45, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 35, 35, 35, 35, 35, 18, 18, 18, 18, 38, 38, 38, 38, 38, 38, 38, 35, 38, 38, 38, 38, 38, 35, 38, 35}) ;
   }

   public void add_metrics6( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV19PBarPar = "" ;
      AV20UBarPar1 = "" ;
      AV21PFecGen = GXutil.nullDate() ;
      AV22UFecGen1 = GXutil.nullDate() ;
      AV23PFecDis = GXutil.nullDate() ;
      AV24UFecDis1 = GXutil.nullDate() ;
      AV28ImpCod = "" ;
      AV30TipPapel = "" ;
      AV99Pfecent = GXutil.nullDate() ;
      AV100Ufecent = GXutil.nullDate() ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      AV57Lit0 = "" ;
      AV58Lit1 = "" ;
      AV59Lit2 = "" ;
      AV60Lit3 = "" ;
      AV61Lit4 = "" ;
      AV62Lit5 = "" ;
      AV63Lit6 = "" ;
      AV64Lit7 = "" ;
      AV65Lit8 = "" ;
      AV66Lit9 = "" ;
      AV67Lit10 = "" ;
      AV68Lit11 = "" ;
      AV69Lit12 = "" ;
      AV70Lit13 = "" ;
      AV71Lit14 = "" ;
      AV72Lit15 = "" ;
      AV73Lit16 = "" ;
      AV74Lit17 = "" ;
      AV75Lit18 = "" ;
      AV76Lit19 = "" ;
      AV77Lit20 = "" ;
      AV78Lit21 = "" ;
      AV79Lit22 = "" ;
      AV80Lit23 = "" ;
      AV81Lit24 = "" ;
      AV82Lit25 = "" ;
      AV83Lit26 = "" ;
      AV84Lit27 = "" ;
      AV85Lit28 = "" ;
      GXt_char5 = "" ;
      GXv_char6 = new String[1] ;
      scmdbuf = "" ;
      P06OK2_A396EmprCod = new String[] {""} ;
      P06OK2_A407EmprNom = new String[] {""} ;
      P06OK2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV33NomEmp = "" ;
      AV51TKil = DecimalUtil.ZERO ;
      AV52TKPen = DecimalUtil.ZERO ;
      AV54TMet = DecimalUtil.ZERO ;
      AV55TMPen = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      P06OK10_A396EmprCod = new String[] {""} ;
      P06OK10_A178BarLis = new byte[1] ;
      P06OK10_A182BarMat = new String[] {""} ;
      P06OK10_A143BarDisNum = new String[] {""} ;
      P06OK10_A180BarMaqCod = new String[] {""} ;
      P06OK10_A135BarColNom = new String[] {""} ;
      P06OK10_A136BarColNum = new int[1] ;
      P06OK10_A129BarCod = new int[1] ;
      P06OK10_A132BarCodReo = new byte[1] ;
      P06OK10_A130BarCodPar = new String[] {""} ;
      P06OK10_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P06OK10_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P06OK10_A252CliCod = new int[1] ;
      P06OK10_n252CliCod = new boolean[] {false} ;
      P06OK10_A213BarSit = new byte[1] ;
      P06OK10_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P06OK10_A212BarSer = new String[] {""} ;
      P06OK10_A279CliNom = new String[] {""} ;
      P06OK10_A168BarKgmLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06OK10_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06OK10_A186BarMtrLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06OK10_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06OK10_A151BarFasCod = new String[] {""} ;
      P06OK10_n151BarFasCod = new boolean[] {false} ;
      P06OK10_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P06OK10_n156BarFecCum = new boolean[] {false} ;
      P06OK10_A199BarPie1 = new short[1] ;
      P06OK10_A365DisDes = new String[] {""} ;
      P06OK10_A898BarPieNDes = new int[1] ;
      A182BarMat = "" ;
      A143BarDisNum = "" ;
      A180BarMaqCod = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A279CliNom = "" ;
      A168BarKgmLan = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A186BarMtrLan = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A151BarFasCod = "" ;
      A156BarFecCum = GXutil.nullDate() ;
      A365DisDes = "" ;
      AV45TotKilC = DecimalUtil.ZERO ;
      AV46TotKPenC = DecimalUtil.ZERO ;
      AV48TotMetC = DecimalUtil.ZERO ;
      AV49TotMPenC = DecimalUtil.ZERO ;
      P06OK12_A168BarKgmLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06OK12_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06OK12_A186BarMtrLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06OK12_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06OK12_A199BarPie1 = new short[1] ;
      P06OK12_A898BarPieNDes = new int[1] ;
      P06OK15_A151BarFasCod = new String[] {""} ;
      P06OK15_n151BarFasCod = new boolean[] {false} ;
      AV37TotKil = DecimalUtil.ZERO ;
      AV38TotKilPen = DecimalUtil.ZERO ;
      AV40TotMet = DecimalUtil.ZERO ;
      AV41TotMetPen = DecimalUtil.ZERO ;
      P06OK17_A168BarKgmLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06OK17_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06OK17_A186BarMtrLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06OK17_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06OK17_A199BarPie1 = new short[1] ;
      P06OK17_A898BarPieNDes = new int[1] ;
      P06OK20_A151BarFasCod = new String[] {""} ;
      P06OK20_n151BarFasCod = new boolean[] {false} ;
      AV42KgmPen = DecimalUtil.ZERO ;
      AV43MetPen = DecimalUtil.ZERO ;
      AV92BarFasCod = "" ;
      AV94FecCum = "" ;
      AV96BarMat = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV107Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rlisbarg__default(),
         new Object[] {
             new Object[] {
            P06OK2_A396EmprCod, P06OK2_A407EmprNom, P06OK2_n407EmprNom
            }
            , new Object[] {
            P06OK10_A396EmprCod, P06OK10_A178BarLis, P06OK10_A182BarMat, P06OK10_A143BarDisNum, P06OK10_A180BarMaqCod, P06OK10_A135BarColNom, P06OK10_A136BarColNum, P06OK10_A129BarCod, P06OK10_A132BarCodReo, P06OK10_A130BarCodPar,
            P06OK10_A159BarFecGen, P06OK10_A155BarFecCli, P06OK10_A252CliCod, P06OK10_n252CliCod, P06OK10_A213BarSit, P06OK10_A158BarFecFpr, P06OK10_A212BarSer, P06OK10_A279CliNom, P06OK10_A168BarKgmLan, P06OK10_A166BarKgm,
            P06OK10_A186BarMtrLan, P06OK10_A184BarMtr, P06OK10_A151BarFasCod, P06OK10_n151BarFasCod, P06OK10_A156BarFecCum, P06OK10_n156BarFecCum, P06OK10_A199BarPie1, P06OK10_A365DisDes, P06OK10_A898BarPieNDes
            }
            , new Object[] {
            P06OK12_A168BarKgmLan, P06OK12_A166BarKgm, P06OK12_A186BarMtrLan, P06OK12_A184BarMtr, P06OK12_A199BarPie1, P06OK12_A898BarPieNDes
            }
            , new Object[] {
            P06OK15_A151BarFasCod, P06OK15_n151BarFasCod
            }
            , new Object[] {
            P06OK17_A168BarKgmLan, P06OK17_A166BarKgm, P06OK17_A186BarMtrLan, P06OK17_A184BarMtr, P06OK17_A199BarPie1, P06OK17_A898BarPieNDes
            }
            , new Object[] {
            P06OK20_A151BarFasCod, P06OK20_n151BarFasCod
            }
         }
      );
      AV107Pgmname = "RLISBARG" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV107Pgmname = "RLISBARG" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV17PBarReo ;
   private byte AV18UBarReo1 ;
   private byte AV25Edit ;
   private byte AV26PSit ;
   private byte AV27USit ;
   private byte AV29Fuente ;
   private byte AV89Moda21 ;
   private byte AV93Ideatint ;
   private byte AV90Cli350 ;
   private byte AV95Damf ;
   private byte AV98Velta ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A178BarLis ;
   private short gxcookieaux ;
   private short AV56TBar ;
   private short A199BarPie1 ;
   private short AV50NumBarC ;
   private short AV44NumBar ;
   private short Gx_err ;
   private int AV15PBarCod ;
   private int AV16UBarC1 ;
   private int AV31PClicod ;
   private int AV32UClicod2 ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV91ContVal ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int AV53TPie ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int Gx_OldLine ;
   private int AV47TotPieC ;
   private int AV39TotPie ;
   private java.math.BigDecimal AV51TKil ;
   private java.math.BigDecimal AV52TKPen ;
   private java.math.BigDecimal AV54TMet ;
   private java.math.BigDecimal AV55TMPen ;
   private java.math.BigDecimal A168BarKgmLan ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A186BarMtrLan ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV45TotKilC ;
   private java.math.BigDecimal AV46TotKPenC ;
   private java.math.BigDecimal AV48TotMetC ;
   private java.math.BigDecimal AV49TotMPenC ;
   private java.math.BigDecimal AV37TotKil ;
   private java.math.BigDecimal AV38TotKilPen ;
   private java.math.BigDecimal AV40TotMet ;
   private java.math.BigDecimal AV41TotMetPen ;
   private java.math.BigDecimal AV42KgmPen ;
   private java.math.BigDecimal AV43MetPen ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV19PBarPar ;
   private String AV20UBarPar1 ;
   private String AV28ImpCod ;
   private String AV30TipPapel ;
   private String AV57Lit0 ;
   private String AV58Lit1 ;
   private String AV59Lit2 ;
   private String AV60Lit3 ;
   private String AV61Lit4 ;
   private String AV62Lit5 ;
   private String AV63Lit6 ;
   private String AV64Lit7 ;
   private String AV65Lit8 ;
   private String AV66Lit9 ;
   private String AV67Lit10 ;
   private String AV68Lit11 ;
   private String AV69Lit12 ;
   private String AV70Lit13 ;
   private String AV71Lit14 ;
   private String AV72Lit15 ;
   private String AV73Lit16 ;
   private String AV74Lit17 ;
   private String AV75Lit18 ;
   private String AV76Lit19 ;
   private String AV77Lit20 ;
   private String AV78Lit21 ;
   private String AV79Lit22 ;
   private String AV80Lit23 ;
   private String AV81Lit24 ;
   private String AV82Lit25 ;
   private String AV83Lit26 ;
   private String AV84Lit27 ;
   private String AV85Lit28 ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV33NomEmp ;
   private String A130BarCodPar ;
   private String A182BarMat ;
   private String A143BarDisNum ;
   private String A180BarMaqCod ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A279CliNom ;
   private String A151BarFasCod ;
   private String A365DisDes ;
   private String AV92BarFasCod ;
   private String AV94FecCum ;
   private String AV96BarMat ;
   private String Gx_time ;
   private String AV107Pgmname ;
   private java.util.Date AV21PFecGen ;
   private java.util.Date AV22UFecGen1 ;
   private java.util.Date AV23PFecDis ;
   private java.util.Date AV24UFecDis1 ;
   private java.util.Date AV99Pfecent ;
   private java.util.Date AV100Ufecent ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A156BarFecCum ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk6OK4 ;
   private boolean n252CliCod ;
   private boolean n151BarFasCod ;
   private boolean n156BarFecCum ;
   private IDataStoreProvider pr_default ;
   private String[] P06OK2_A396EmprCod ;
   private String[] P06OK2_A407EmprNom ;
   private boolean[] P06OK2_n407EmprNom ;
   private String[] P06OK10_A396EmprCod ;
   private byte[] P06OK10_A178BarLis ;
   private String[] P06OK10_A182BarMat ;
   private String[] P06OK10_A143BarDisNum ;
   private String[] P06OK10_A180BarMaqCod ;
   private String[] P06OK10_A135BarColNom ;
   private int[] P06OK10_A136BarColNum ;
   private int[] P06OK10_A129BarCod ;
   private byte[] P06OK10_A132BarCodReo ;
   private String[] P06OK10_A130BarCodPar ;
   private java.util.Date[] P06OK10_A159BarFecGen ;
   private java.util.Date[] P06OK10_A155BarFecCli ;
   private int[] P06OK10_A252CliCod ;
   private boolean[] P06OK10_n252CliCod ;
   private byte[] P06OK10_A213BarSit ;
   private java.util.Date[] P06OK10_A158BarFecFpr ;
   private String[] P06OK10_A212BarSer ;
   private String[] P06OK10_A279CliNom ;
   private java.math.BigDecimal[] P06OK10_A168BarKgmLan ;
   private java.math.BigDecimal[] P06OK10_A166BarKgm ;
   private java.math.BigDecimal[] P06OK10_A186BarMtrLan ;
   private java.math.BigDecimal[] P06OK10_A184BarMtr ;
   private String[] P06OK10_A151BarFasCod ;
   private boolean[] P06OK10_n151BarFasCod ;
   private java.util.Date[] P06OK10_A156BarFecCum ;
   private boolean[] P06OK10_n156BarFecCum ;
   private short[] P06OK10_A199BarPie1 ;
   private String[] P06OK10_A365DisDes ;
   private int[] P06OK10_A898BarPieNDes ;
   private java.math.BigDecimal[] P06OK12_A168BarKgmLan ;
   private java.math.BigDecimal[] P06OK12_A166BarKgm ;
   private java.math.BigDecimal[] P06OK12_A186BarMtrLan ;
   private java.math.BigDecimal[] P06OK12_A184BarMtr ;
   private short[] P06OK12_A199BarPie1 ;
   private int[] P06OK12_A898BarPieNDes ;
   private String[] P06OK15_A151BarFasCod ;
   private boolean[] P06OK15_n151BarFasCod ;
   private java.math.BigDecimal[] P06OK17_A168BarKgmLan ;
   private java.math.BigDecimal[] P06OK17_A166BarKgm ;
   private java.math.BigDecimal[] P06OK17_A186BarMtrLan ;
   private java.math.BigDecimal[] P06OK17_A184BarMtr ;
   private short[] P06OK17_A199BarPie1 ;
   private int[] P06OK17_A898BarPieNDes ;
   private String[] P06OK20_A151BarFasCod ;
   private boolean[] P06OK20_n151BarFasCod ;
}

final  class rlisbarg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P06OK10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV15PBarCod ,
                                           int AV16UBarC1 ,
                                           byte AV17PBarReo ,
                                           byte AV18UBarReo1 ,
                                           String AV19PBarPar ,
                                           String AV20UBarPar1 ,
                                           java.util.Date AV21PFecGen ,
                                           java.util.Date AV22UFecGen1 ,
                                           java.util.Date AV23PFecDis ,
                                           java.util.Date AV24UFecDis1 ,
                                           int AV31PClicod ,
                                           int AV32UClicod2 ,
                                           byte AV26PSit ,
                                           byte AV27USit ,
                                           java.util.Date AV99Pfecent ,
                                           java.util.Date AV100Ufecent ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           int A252CliCod ,
                                           byte A213BarSit ,
                                           java.util.Date A158BarFecFpr ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[17];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarLis, T1.BarMat, T1.BarDisNum, T1.BarMaqCod, T1.BarColNom, T1.BarColNum, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFecGen, T1.BarFecCli," ;
      scmdbuf += " T1.CliCod, T1.BarSit, T1.BarFecFpr, T1.BarSer, T2.CliNom, COALESCE( T3.BarKgmLan, 0) AS BarKgmLan, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtrLan, 0)" ;
      scmdbuf += " AS BarMtrLan, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T4.BarFasCod, ' ') AS BarFasCod, COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum," ;
      scmdbuf += " COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM ((((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarKilLan) AS BarKgmLan, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarMetLan) AS BarMtrLan," ;
      scmdbuf += " SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasCod, T6.EmprCod, T6.BarCod," ;
      scmdbuf += " T6.BarCodReo, T6.BarCodPar FROM (TXPBARFAS T6 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <>" ;
      scmdbuf += " 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar)" ;
      scmdbuf += " WHERE (T6.BarOrdLin = T7.GXC1) AND (T6.BarFasEst <> 0) GROUP BY T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod" ;
      scmdbuf += " = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T6.BarFecRea) AS BarFecCum, COALESCE( T7.BarProCod, '') AS BarProCod," ;
      scmdbuf += " COALESCE( T8.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MIN(T9.ProCod) AS BarProCod, COALESCE(" ;
      scmdbuf += " T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod" ;
      scmdbuf += " AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE T9.BarOrdLin = COALESCE( T10.BarFasLin, 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod," ;
      scmdbuf += " T9.BarCodReo, T9.BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar )" ;
      scmdbuf += " T8 ON T8.EmprCod = T6.EmprCod AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE T6.ProCod = COALESCE( T7.BarProCod," ;
      scmdbuf += " '') and T6.BarOrdLin = COALESCE( T8.BarFasLin, 0) GROUP BY T7.BarProCod, T8.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV15PBarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int7[1] = (byte)(1) ;
      }
      if ( ! (0==AV16UBarC1) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int7[2] = (byte)(1) ;
      }
      if ( ! (0==AV17PBarReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( ! (0==AV18UBarReo1) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19PBarPar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV20UBarPar1)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int7[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21PFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22UFecGen1)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int7[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV23PFecDis)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int7[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24UFecDis1)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int7[10] = (byte)(1) ;
      }
      if ( ! (0==AV31PClicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int7[11] = (byte)(1) ;
      }
      if ( ! (0==AV32UClicod2) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int7[12] = (byte)(1) ;
      }
      if ( ! (0==AV26PSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int7[13] = (byte)(1) ;
      }
      if ( ! (0==AV27USit) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int7[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99Pfecent)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int7[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100Ufecent)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int7[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarSer, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
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
                  return conditional_P06OK10(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06OK2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06OK10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06OK12", "SELECT COALESCE( T1.BarKgmLan, 0) AS BarKgmLan, COALESCE( T1.BarKgm, 0) AS BarKgm, COALESCE( T1.BarMtrLan, 0) AS BarMtrLan, COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarPie1, 0) AS BarPie1, COALESCE( T1.BarPieNDes, 0) AS BarPieNDes FROM (SELECT SUM(BarKilLan) AS BarKgmLan, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarMetLan) AS BarMtrLan, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06OK15", "SELECT COALESCE( T1.BarFasCod, ' ') AS BarFasCod FROM (SELECT MIN(T2.FasCod) AS BarFasCod, T2.EmprCod, T2.BarCod, T2.BarCodReo, T2.BarCodPar FROM (TXPBARFAS T2 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T2.EmprCod AND T3.BarCod = T2.BarCod AND T3.BarCodReo = T2.BarCodReo AND T3.BarCodPar = T2.BarCodPar) WHERE (T2.BarOrdLin = T3.GXC1) AND (T2.BarFasEst <> 0) GROUP BY T2.EmprCod, T2.BarCod, T2.BarCodReo, T2.BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06OK17", "SELECT COALESCE( T1.BarKgmLan, 0) AS BarKgmLan, COALESCE( T1.BarKgm, 0) AS BarKgm, COALESCE( T1.BarMtrLan, 0) AS BarMtrLan, COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarPie1, 0) AS BarPie1, COALESCE( T1.BarPieNDes, 0) AS BarPieNDes FROM (SELECT SUM(BarKilLan) AS BarKgmLan, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarMetLan) AS BarMtrLan, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06OK20", "SELECT COALESCE( T1.BarFasCod, ' ') AS BarFasCod FROM (SELECT MIN(T2.FasCod) AS BarFasCod, T2.EmprCod, T2.BarCod, T2.BarCodReo, T2.BarCodPar FROM (TXPBARFAS T2 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T2.EmprCod AND T3.BarCod = T2.BarCod AND T3.BarCodReo = T2.BarCodReo AND T3.BarCodPar = T2.BarCodPar) WHERE (T2.BarOrdLin = T3.GXC1) AND (T2.BarFasEst <> 0) GROUP BY T2.EmprCod, T2.BarCod, T2.BarCodReo, T2.BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((String[]) buf[17])[0] = rslt.getString(17, 30);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((String[]) buf[22])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(23);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 1);
               ((int[]) buf[28])[0] = rslt.getInt(26);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

