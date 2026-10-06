package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rfa0001_impl extends GXWebReport
{
   public rfa0001_impl( com.genexus.internet.HttpContext context )
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
            AV8PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV9UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV10PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
            AV11UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
            AV25Prior = httpContext.GetPar( "Prior") ;
            AV28Tipo_alb = (byte)(GXutil.lval( httpContext.GetPar( "Tipo_alb"))) ;
            AV73Sin_p_f = (byte)(GXutil.lval( httpContext.GetPar( "Sin_p_f"))) ;
            AV72Sin_p_t = (byte)(GXutil.lval( httpContext.GetPar( "Sin_p_t"))) ;
            AV77Op_p_f = httpContext.GetPar( "Op_p_f") ;
            AV76Op_p_t = httpContext.GetPar( "Op_p_t") ;
            AV91costesenergeticos = (byte)(GXutil.lval( httpContext.GetPar( "costesenergeticos"))) ;
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
         GXv_int1[0] = AV34FlagIdioma ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100001", GXv_int1) ;
         rfa0001_impl.this.AV34FlagIdioma = GXv_int1[0] ;
         GXt_char2 = AV92encargoenergetico ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IMPENG", ""), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV92encargoenergetico = GXt_char2 ;
         AV92encargoenergetico = GXutil.trim( AV92encargoenergetico) ;
         GXt_char2 = AV13Lit0 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2346_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV13Lit0 = GXt_char2 ;
         GXt_char2 = AV14Lit1 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN280_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14Lit1 = GXt_char2 ;
         GXt_char2 = AV15Lit2 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN601_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV15Lit2 = GXt_char2 ;
         GXt_char2 = AV16Lit3 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2191_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV16Lit3 = GXt_char2 ;
         GXt_char2 = AV36Lit4 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2301_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV36Lit4 = GXt_char2 ;
         GXt_char2 = AV37Lit5 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV37Lit5 = GXt_char2 ;
         GXt_char2 = AV38Lit6 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV38Lit6 = GXt_char2 ;
         GXt_char2 = AV39Lit7 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1355_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV39Lit7 = GXt_char2 ;
         GXt_char2 = AV48Lit8 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2065_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV48Lit8 = GXt_char2 ;
         GXt_char2 = AV40Lit9 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV40Lit9 = GXt_char2 ;
         GXt_char2 = AV47Lit10 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV47Lit10 = GXt_char2 ;
         GXt_char2 = AV42Lit11 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV42Lit11 = GXt_char2 ;
         GXt_char2 = AV43Lit12 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV43Lit12 = GXt_char2 ;
         GXt_char2 = AV44Lit13 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV44Lit13 = GXt_char2 ;
         GXt_char2 = AV41Lit14 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1189_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV41Lit14 = GXt_char2 ;
         GXt_char2 = AV45Lit15 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV45Lit15 = GXt_char2 ;
         AV35Lit16 = httpContext.getMessage( "Operaciones Hdr", "") ;
         if ( AV34FlagIdioma == 1 )
         {
            AV35Lit16 = httpContext.getMessage( "Serviços O.S.", "") ;
         }
         GXt_char2 = AV49Lit17 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1480_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV49Lit17 = GXt_char2 ;
         GXt_char2 = AV46Lit18 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV46Lit18 = GXt_char2 ;
         GXt_char2 = AV50Lit19 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1327_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV50Lit19 = GXt_char2 ;
         GXt_char2 = AV51Lit20 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2479_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV51Lit20 = GXt_char2 ;
         GXt_char2 = AV52Lit21 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV52Lit21 = GXt_char2 ;
         GXt_char2 = AV67Lit22 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "FASPREKGMC", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV67Lit22 = GXt_char2 ;
         GXt_char2 = AV68Lit23 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "FASPREMTRC", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV68Lit23 = GXt_char2 ;
         GXt_char2 = AV69Lit24 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "FASPREKGMC", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV69Lit24 = GXt_char2 ;
         GXt_char2 = AV70Lit25 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "FASPREMTRC", ""), (byte)(99), GXv_char3) ;
         rfa0001_impl.this.GXt_char2 = GXv_char3[0] ;
         AV70Lit25 = GXt_char2 ;
         AV81Lit28 = "" ;
         GXv_int1[0] = AV79Moda21 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int1) ;
         rfa0001_impl.this.AV79Moda21 = GXv_int1[0] ;
         GXt_int4 = AV78ItalColore ;
         GXv_int1[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ITALCO", ""), GXv_int1) ;
         rfa0001_impl.this.GXt_int4 = GXv_int1[0] ;
         AV78ItalColore = GXt_int4 ;
         GXt_int4 = AV83Vts ;
         GXv_int1[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VELLUT", ""), GXv_int1) ;
         rfa0001_impl.this.GXt_int4 = GXv_int1[0] ;
         AV83Vts = GXt_int4 ;
         GXt_int4 = AV85Carvema ;
         GXv_int1[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int1) ;
         rfa0001_impl.this.GXt_int4 = GXv_int1[0] ;
         AV85Carvema = GXt_int4 ;
         AV86Lit716 = AV39Lit7 ;
         if ( AV79Moda21 == 1 )
         {
            AV81Lit28 = httpContext.getMessage( "Perc%", "") ;
         }
         /* Using cursor P0A1U2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P0A1U2_A407EmprNom[0] ;
            n407EmprNom = P0A1U2_n407EmprNom[0] ;
            AV12EmpNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( GXutil.strcmp(AV25Prior, "0") == 0 )
         {
            AV26PPrior = "0" ;
            AV27UPrior = "0" ;
         }
         if ( GXutil.strcmp(AV25Prior, "1") == 0 )
         {
            AV26PPrior = "1" ;
            AV27UPrior = "1" ;
         }
         if ( GXutil.strcmp(AV25Prior, "2") == 0 )
         {
            AV26PPrior = "0" ;
            AV27UPrior = "1" ;
         }
         if ( AV28Tipo_alb == 1 )
         {
            AV24TotInf = DecimalUtil.doubleToDec(0) ;
            AV63Tot_Kgs_g = DecimalUtil.doubleToDec(0) ;
            AV64Tot_Mts_g = DecimalUtil.doubleToDec(0) ;
            AV93Totinfconcosteenergetico = DecimalUtil.ZERO ;
            pr_default.dynParam(1, new Object[]{ new Object[]{
                                                 Integer.valueOf(AV8PCliCod) ,
                                                 Integer.valueOf(AV9UCliCod) ,
                                                 Integer.valueOf(A252CliCod) ,
                                                 A396EmprCod } ,
                                                 new int[]{
                                                 TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING
                                                 }
            });
            /* Using cursor P0A1U3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8PCliCod), Integer.valueOf(AV9UCliCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A252CliCod = P0A1U3_A252CliCod[0] ;
               A279CliNom = P0A1U3_A279CliNom[0] ;
               A14242CliEnergia = P0A1U3_A14242CliEnergia[0] ;
               AV17CliCod = A252CliCod ;
               AV82CliNom = A279CliNom ;
               AV18FlagCliCod = (byte)(0) ;
               AV21TotCli = DecimalUtil.doubleToDec(0) ;
               AV61Tot_kgs_cl = DecimalUtil.doubleToDec(0) ;
               AV62Tot_mts_cl = DecimalUtil.doubleToDec(0) ;
               AV32FlagHdr = 0 ;
               AV89CliEnergia = A14242CliEnergia ;
               pr_default.dynParam(2, new Object[]{ new Object[]{
                                                    AV26PPrior ,
                                                    AV27UPrior ,
                                                    AV10PFecha ,
                                                    AV11UFecha ,
                                                    A39AlbProPri ,
                                                    A34AlbProfch ,
                                                    A1253EmprGuiRem ,
                                                    A396EmprCod ,
                                                    A5140AlbMarca ,
                                                    Integer.valueOf(A1243GuiRemCli) ,
                                                    Integer.valueOf(AV17CliCod) ,
                                                    Byte.valueOf(A33AlbProEst) } ,
                                                    new int[]{
                                                    TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                                    TypeConstants.INT, TypeConstants.BYTE
                                                    }
               });
               /* Using cursor P0A1U4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV17CliCod), AV26PPrior, AV27UPrior, AV10PFecha, AV11UFecha});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A1253EmprGuiRem = P0A1U4_A1253EmprGuiRem[0] ;
                  A3915EmpNumDec = P0A1U4_A3915EmpNumDec[0] ;
                  n3915EmpNumDec = P0A1U4_n3915EmpNumDec[0] ;
                  A34AlbProfch = P0A1U4_A34AlbProfch[0] ;
                  A30AlbProCod = P0A1U4_A30AlbProCod[0] ;
                  A5140AlbMarca = P0A1U4_A5140AlbMarca[0] ;
                  A33AlbProEst = P0A1U4_A33AlbProEst[0] ;
                  A39AlbProPri = P0A1U4_A39AlbProPri[0] ;
                  A1243GuiRemCli = P0A1U4_A1243GuiRemCli[0] ;
                  A3915EmpNumDec = P0A1U4_A3915EmpNumDec[0] ;
                  n3915EmpNumDec = P0A1U4_n3915EmpNumDec[0] ;
                  /* Using cursor P0A1U5 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
                  while ( (pr_default.getStatus(3) != 101) )
                  {
                     A130BarCodPar = P0A1U5_A130BarCodPar[0] ;
                     A132BarCodReo = P0A1U5_A132BarCodReo[0] ;
                     A129BarCod = P0A1U5_A129BarCod[0] ;
                     A361DisCod = P0A1U5_A361DisCod[0] ;
                     A2839AlbProVal = P0A1U5_A2839AlbProVal[0] ;
                     A2762AlbBarDto = P0A1U5_A2762AlbBarDto[0] ;
                     n2762AlbBarDto = P0A1U5_n2762AlbBarDto[0] ;
                     A2761AlbBarRec = P0A1U5_A2761AlbBarRec[0] ;
                     A1264BarPreMtr = P0A1U5_A1264BarPreMtr[0] ;
                     A1263BarAlbMtrE = P0A1U5_A1263BarAlbMtrE[0] ;
                     A1262BarPreKgm = P0A1U5_A1262BarPreKgm[0] ;
                     A1261BarAlbKgmE = P0A1U5_A1261BarAlbKgmE[0] ;
                     A5354AlbImpMan = P0A1U5_A5354AlbImpMan[0] ;
                     A135BarColNom = P0A1U5_A135BarColNom[0] ;
                     A136BarColNum = P0A1U5_A136BarColNum[0] ;
                     A212BarSer = P0A1U5_A212BarSer[0] ;
                     A3746BarNPed = P0A1U5_A3746BarNPed[0] ;
                     A1652BarSerDsc = P0A1U5_A1652BarSerDsc[0] ;
                     A32AlbProEsp = P0A1U5_A32AlbProEsp[0] ;
                     A217BarTipArt = P0A1U5_A217BarTipArt[0] ;
                     n217BarTipArt = P0A1U5_n217BarTipArt[0] ;
                     A218BarTipCol = P0A1U5_A218BarTipCol[0] ;
                     A361DisCod = P0A1U5_A361DisCod[0] ;
                     A135BarColNom = P0A1U5_A135BarColNom[0] ;
                     A136BarColNum = P0A1U5_A136BarColNum[0] ;
                     A212BarSer = P0A1U5_A212BarSer[0] ;
                     A3746BarNPed = P0A1U5_A3746BarNPed[0] ;
                     A1652BarSerDsc = P0A1U5_A1652BarSerDsc[0] ;
                     A217BarTipArt = P0A1U5_A217BarTipArt[0] ;
                     n217BarTipArt = P0A1U5_n217BarTipArt[0] ;
                     A218BarTipCol = P0A1U5_A218BarTipCol[0] ;
                     if ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 )
                     {
                        AV88Distraid = "" ;
                        /* Using cursor P0A1U6 */
                        pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
                        while ( (pr_default.getStatus(4) != 101) )
                        {
                           A13376DisTraID = P0A1U6_A13376DisTraID[0] ;
                           AV88Distraid = A13376DisTraID ;
                           pr_default.readNext(4);
                        }
                        pr_default.close(4);
                        /* Using cursor P0A1U7 */
                        pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                        while ( (pr_default.getStatus(5) != 101) )
                        {
                           A13905BarTraID = P0A1U7_A13905BarTraID[0] ;
                           AV88Distraid = A13905BarTraID ;
                           pr_default.readNext(5);
                        }
                        pr_default.close(5);
                        AV87Normas = "" ;
                        /* Using cursor P0A1U8 */
                        pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
                        while ( (pr_default.getStatus(6) != 101) )
                        {
                           A13213DisNormID = P0A1U8_A13213DisNormID[0] ;
                           if ( GXutil.strcmp(AV87Normas, "") == 0 )
                           {
                              AV87Normas = GXutil.trim( A13213DisNormID) ;
                           }
                           else
                           {
                              AV87Normas += "/" + GXutil.trim( A13213DisNormID) ;
                           }
                           pr_default.readNext(6);
                        }
                        pr_default.close(6);
                        if ( AV79Moda21 == 1 )
                        {
                           AV80DtoPen = A2761AlbBarRec.subtract(A2762AlbBarDto) ;
                           AV19ImpLinea = GXutil.roundDecimal( A1261BarAlbKgmE.multiply((A1262BarPreKgm.add((A1262BarPreKgm.multiply(AV80DtoPen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2).add(GXutil.roundDecimal( A1263BarAlbMtrE.multiply((A1264BarPreMtr.add((A1264BarPreMtr.multiply(AV80DtoPen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2)) ;
                        }
                        else
                        {
                           if ( A3915EmpNumDec == 0 )
                           {
                              AV19ImpLinea = GXutil.roundDecimal( A1261BarAlbKgmE.multiply(A1262BarPreKgm), 0).add(GXutil.roundDecimal( A1263BarAlbMtrE.multiply(A1264BarPreMtr), 0)) ;
                           }
                           else
                           {
                              AV19ImpLinea = GXutil.roundDecimal( A1261BarAlbKgmE.multiply(A1262BarPreKgm), 2).add(GXutil.roundDecimal( A1263BarAlbMtrE.multiply(A1264BarPreMtr), 2)) ;
                           }
                        }
                        if ( A5354AlbImpMan.doubleValue() > 0 )
                        {
                           AV19ImpLinea = A5354AlbImpMan ;
                        }
                        AV23Marca = " " ;
                        if ( AV19ImpLinea.doubleValue() == 0 )
                        {
                           AV23Marca = "<-" ;
                        }
                        AV22Hdr = GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 0, 0) + A130BarCodPar ;
                        AV30BarColNom = A135BarColNom ;
                        AV31BarColNum = A136BarColNum ;
                        AV84Barserdsc = A212BarSer ;
                        if ( AV83Vts == 1 )
                        {
                           AV30BarColNom = A3746BarNPed ;
                           AV84Barserdsc = A1652BarSerDsc ;
                        }
                        AV33AlbProEspC = " " ;
                        if ( A32AlbProEsp < 10 )
                        {
                           if ( AV34FlagIdioma == 0 )
                           {
                              AV33AlbProEspC = httpContext.getMessage( "SIN CONFIRMAR", "") ;
                           }
                           else
                           {
                              AV33AlbProEspC = httpContext.getMessage( "SEM CONFIRMAR", "") ;
                           }
                        }
                        AV53PrecioK = A1262BarPreKgm ;
                        AV54PrecioM = A1264BarPreMtr ;
                        GXv_char3[0] = A396EmprCod ;
                        GXv_int5[0] = A217BarTipArt ;
                        GXv_char6[0] = AV55TipArtDsc ;
                        new app.pbustad(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_char6) ;
                        rfa0001_impl.this.A396EmprCod = GXv_char3[0] ;
                        rfa0001_impl.this.A217BarTipArt = GXv_int5[0] ;
                        rfa0001_impl.this.AV55TipArtDsc = GXv_char6[0] ;
                        if ( ( ( AV19ImpLinea.doubleValue() == 0 ) && ( AV72Sin_p_t == 2 ) ) || ( AV72Sin_p_t == 1 ) )
                        {
                           if ( AV18FlagCliCod == 0 )
                           {
                              AV18FlagCliCod = (byte)(1) ;
                              hA1U0( false, 36) ;
                              getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17CliCod), "ZZZZZ9")), 85, Gx_line+15, 130, Gx_line+30, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82CliNom, "")), 142, Gx_line+15, 331, Gx_line+30, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+36) ;
                           }
                           if ( (0==AV85Carvema) )
                           {
                              hA1U0( false, 31) ;
                              getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 85, Gx_line+0, 144, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 3, Gx_line+0, 77, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 156, Gx_line+0, 215, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 227, Gx_line+0, 235, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 218, Gx_line+0, 226, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 245, Gx_line+0, 363, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30BarColNom, "")), 367, Gx_line+0, 463, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31BarColNum), "ZZZZZ9")), 468, Gx_line+0, 513, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 521, Gx_line+0, 537, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")), 542, Gx_line+0, 609, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53PrecioK, "ZZZ9.99")), 620, Gx_line+0, 672, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")), 683, Gx_line+0, 750, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54PrecioM, "ZZZ9.99")), 758, Gx_line+0, 810, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19ImpLinea, "ZZ,ZZZ,ZZ9.99")), 859, Gx_line+0, 955, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A32AlbProEsp), "99")), 1077, Gx_line+0, 1093, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33AlbProEspC, "")), 976, Gx_line+0, 1072, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Marca, "")), 957, Gx_line+0, 973, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV80DtoPen, "ZZZ.Z")), 815, Gx_line+0, 852, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 245, Gx_line+15, 436, Gx_line+31, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+31) ;
                           }
                           else
                           {
                              hA1U0( false, 31) ;
                              getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 90, Gx_line+0, 149, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 7, Gx_line+0, 81, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 160, Gx_line+0, 219, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 231, Gx_line+0, 239, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 222, Gx_line+0, 230, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 248, Gx_line+0, 366, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30BarColNom, "")), 464, Gx_line+0, 560, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 598, Gx_line+0, 614, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")), 620, Gx_line+0, 687, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53PrecioK, "ZZZ9.99")), 693, Gx_line+0, 745, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")), 751, Gx_line+0, 818, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54PrecioM, "ZZZ9.99")), 824, Gx_line+0, 876, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19ImpLinea, "ZZ,ZZZ,ZZ9.99")), 882, Gx_line+0, 978, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A32AlbProEsp), "99")), 1100, Gx_line+0, 1116, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33AlbProEspC, "")), 999, Gx_line+0, 1095, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Marca, "")), 980, Gx_line+0, 996, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 248, Gx_line+15, 439, Gx_line+31, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87Normas, "")), 372, Gx_line+0, 461, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Distraid, "")), 561, Gx_line+0, 591, Gx_line+16, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+31) ;
                           }
                           AV61Tot_kgs_cl = AV61Tot_kgs_cl.add(A1261BarAlbKgmE) ;
                           AV62Tot_mts_cl = AV62Tot_mts_cl.add(A1263BarAlbMtrE) ;
                           AV21TotCli = AV21TotCli.add(AV19ImpLinea) ;
                           AV32FlagHdr = (int)(AV32FlagHdr+1) ;
                        }
                        AV20FlagAlbFas = (byte)(0) ;
                        /* Using cursor P0A1U9 */
                        pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                        while ( (pr_default.getStatus(7) != 101) )
                        {
                           A1241GuiFasPKg = P0A1U9_A1241GuiFasPKg[0] ;
                           A1242GuiFasPMt = P0A1U9_A1242GuiFasPMt[0] ;
                           A7751GuiFasDto = P0A1U9_A7751GuiFasDto[0] ;
                           n7751GuiFasDto = P0A1U9_n7751GuiFasDto[0] ;
                           A7752GuiFasRec = P0A1U9_A7752GuiFasRec[0] ;
                           n7752GuiFasRec = P0A1U9_n7752GuiFasRec[0] ;
                           A1276FasMtr = P0A1U9_A1276FasMtr[0] ;
                           A1275FasKgm = P0A1U9_A1275FasKgm[0] ;
                           A457FasCod = P0A1U9_A457FasCod[0] ;
                           A460FasDsc = P0A1U9_A460FasDsc[0] ;
                           A1240GuiFasLin = P0A1U9_A1240GuiFasLin[0] ;
                           A460FasDsc = P0A1U9_A460FasDsc[0] ;
                           AV53PrecioK = A1241GuiFasPKg ;
                           AV54PrecioM = A1242GuiFasPMt ;
                           if ( AV79Moda21 == 1 )
                           {
                              AV80DtoPen = A7752GuiFasRec.subtract(A7751GuiFasDto) ;
                              AV19ImpLinea = GXutil.roundDecimal( A1275FasKgm.multiply((A1241GuiFasPKg.add((A1241GuiFasPKg.multiply(AV80DtoPen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2).add(GXutil.roundDecimal( A1276FasMtr.multiply((A1242GuiFasPMt.add((A1242GuiFasPMt.multiply(AV80DtoPen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2)) ;
                           }
                           else
                           {
                              if ( A3915EmpNumDec == 0 )
                              {
                                 AV19ImpLinea = GXutil.roundDecimal( A1275FasKgm.multiply(A1241GuiFasPKg), 0).add(GXutil.roundDecimal( A1276FasMtr.multiply(A1242GuiFasPMt), 0)) ;
                              }
                              else
                              {
                                 AV19ImpLinea = GXutil.roundDecimal( A1275FasKgm.multiply(A1241GuiFasPKg), 2).add(GXutil.roundDecimal( A1276FasMtr.multiply(A1242GuiFasPMt), 2)) ;
                              }
                           }
                           AV23Marca = " " ;
                           if ( AV19ImpLinea.doubleValue() == 0 )
                           {
                              AV23Marca = "<-" ;
                           }
                           if ( ( ( AV19ImpLinea.doubleValue() == 0 ) && ( AV73Sin_p_f == 2 ) ) || ( AV73Sin_p_f == 1 ) )
                           {
                              if ( AV20FlagAlbFas == 0 )
                              {
                                 AV20FlagAlbFas = (byte)(1) ;
                                 if ( AV85Carvema == 0 )
                                 {
                                    hA1U0( false, 42) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 307, Gx_line+26, 512, Gx_line+42, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1275FasKgm, "ZZZZZ9.99")), 542, Gx_line+26, 609, Gx_line+42, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53PrecioK, "ZZZ9.99")), 620, Gx_line+26, 672, Gx_line+42, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1276FasMtr, "ZZZZZ9.99")), 683, Gx_line+26, 750, Gx_line+42, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54PrecioM, "ZZZ9.99")), 758, Gx_line+26, 810, Gx_line+42, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19ImpLinea, "ZZ,ZZZ,ZZ9.99")), 859, Gx_line+26, 955, Gx_line+42, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Hdr, "")), 180, Gx_line+6, 238, Gx_line+21, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Marca, "")), 957, Gx_line+26, 973, Gx_line+42, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 8, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit16, "")), 68, Gx_line+6, 173, Gx_line+21, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit4, "")), 249, Gx_line+6, 350, Gx_line+21, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 354, Gx_line+6, 418, Gx_line+21, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 244, Gx_line+26, 303, Gx_line+42, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV80DtoPen, "ZZZ.Z")), 815, Gx_line+26, 852, Gx_line+42, 2+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+42) ;
                                 }
                                 else
                                 {
                                    hA1U0( false, 16) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 310, Gx_line+0, 515, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1275FasKgm, "ZZZZZ9.99")), 620, Gx_line+0, 687, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1276FasMtr, "ZZZZZ9.99")), 751, Gx_line+0, 818, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19ImpLinea, "ZZ,ZZZ,ZZ9.99")), 882, Gx_line+0, 978, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Marca, "")), 980, Gx_line+0, 996, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54PrecioM, "ZZZ9.99")), 824, Gx_line+0, 876, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53PrecioK, "ZZZ9.99")), 693, Gx_line+0, 745, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 248, Gx_line+0, 307, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+16) ;
                                 }
                              }
                              else
                              {
                                 if ( (0==AV85Carvema) )
                                 {
                                    hA1U0( false, 16) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 307, Gx_line+0, 512, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1275FasKgm, "ZZZZZ9.99")), 542, Gx_line+0, 609, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1276FasMtr, "ZZZZZ9.99")), 683, Gx_line+0, 750, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19ImpLinea, "ZZ,ZZZ,ZZ9.99")), 859, Gx_line+0, 955, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Marca, "")), 957, Gx_line+0, 973, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54PrecioM, "ZZZ9.99")), 758, Gx_line+0, 810, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53PrecioK, "ZZZ9.99")), 620, Gx_line+0, 672, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 245, Gx_line+0, 304, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV80DtoPen, "ZZZ.Z")), 815, Gx_line+0, 852, Gx_line+16, 2+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+16) ;
                                 }
                                 else
                                 {
                                    hA1U0( false, 16) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 310, Gx_line+0, 515, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1275FasKgm, "ZZZZZ9.99")), 620, Gx_line+0, 687, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1276FasMtr, "ZZZZZ9.99")), 751, Gx_line+0, 818, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19ImpLinea, "ZZ,ZZZ,ZZ9.99")), 882, Gx_line+0, 978, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Marca, "")), 980, Gx_line+0, 996, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54PrecioM, "ZZZ9.99")), 824, Gx_line+0, 876, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53PrecioK, "ZZZ9.99")), 693, Gx_line+0, 745, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 248, Gx_line+0, 307, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+16) ;
                                 }
                              }
                              AV21TotCli = AV21TotCli.add(AV19ImpLinea) ;
                              AV32FlagHdr = (int)(AV32FlagHdr+1) ;
                           }
                           pr_default.readNext(7);
                        }
                        pr_default.close(7);
                        /* Using cursor P0A1U10 */
                        pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                        while ( (pr_default.getStatus(8) != 101) )
                        {
                           A1469AlbPrdPKg = P0A1U10_A1469AlbPrdPKg[0] ;
                           n1469AlbPrdPKg = P0A1U10_n1469AlbPrdPKg[0] ;
                           A1470AlbPrdPMt = P0A1U10_A1470AlbPrdPMt[0] ;
                           n1470AlbPrdPMt = P0A1U10_n1470AlbPrdPMt[0] ;
                           A1472PrdMtr = P0A1U10_A1472PrdMtr[0] ;
                           n1472PrdMtr = P0A1U10_n1472PrdMtr[0] ;
                           A1471PrdKgm = P0A1U10_A1471PrdKgm[0] ;
                           n1471PrdKgm = P0A1U10_n1471PrdKgm[0] ;
                           A759ProDsc = P0A1U10_A759ProDsc[0] ;
                           A758ProCod = P0A1U10_A758ProCod[0] ;
                           n758ProCod = P0A1U10_n758ProCod[0] ;
                           A1468AlbPrdLin = P0A1U10_A1468AlbPrdLin[0] ;
                           A759ProDsc = P0A1U10_A759ProDsc[0] ;
                           AV20FlagAlbFas = (byte)(1) ;
                           AV53PrecioK = A1469AlbPrdPKg ;
                           AV54PrecioM = A1470AlbPrdPMt ;
                           if ( A3915EmpNumDec == 0 )
                           {
                              AV19ImpLinea = GXutil.roundDecimal( A1471PrdKgm.multiply(A1469AlbPrdPKg), 0).add(GXutil.roundDecimal( A1472PrdMtr.multiply(A1470AlbPrdPMt), 0)) ;
                           }
                           else
                           {
                              AV19ImpLinea = GXutil.roundDecimal( A1471PrdKgm.multiply(A1469AlbPrdPKg), 2).add(GXutil.roundDecimal( A1472PrdMtr.multiply(A1470AlbPrdPMt), 2)) ;
                           }
                           AV21TotCli = AV21TotCli.add(AV19ImpLinea) ;
                           AV23Marca = " " ;
                           if ( AV19ImpLinea.doubleValue() == 0 )
                           {
                              AV23Marca = "<-" ;
                           }
                           hA1U0( false, 17) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A758ProCod, "")), 146, Gx_line+1, 205, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A759ProDsc, "")), 245, Gx_line+1, 538, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1471PrdKgm, "ZZZZZ9.99")), 542, Gx_line+1, 609, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19ImpLinea, "ZZ,ZZZ,ZZ9.99")), 859, Gx_line+1, 955, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Marca, "")), 957, Gx_line+1, 973, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit19, "")), 76, Gx_line+1, 129, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53PrecioK, "ZZZ9.99")), 620, Gx_line+1, 672, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1472PrdMtr, "ZZZZZ9.99")), 683, Gx_line+1, 750, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54PrecioM, "ZZZ9.99")), 758, Gx_line+1, 810, Gx_line+17, 2+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+17) ;
                           pr_default.readNext(8);
                        }
                        pr_default.close(8);
                        /* Using cursor P0A1U11 */
                        pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                        while ( (pr_default.getStatus(9) != 101) )
                        {
                           A2767AlbHdrPKg = P0A1U11_A2767AlbHdrPKg[0] ;
                           A2769AlbHdrPMt = P0A1U11_A2769AlbHdrPMt[0] ;
                           A2770ALbHdrMts = P0A1U11_A2770ALbHdrMts[0] ;
                           A2768AlbHdrKgs = P0A1U11_A2768AlbHdrKgs[0] ;
                           A2765AlbHdrTxt = P0A1U11_A2765AlbHdrTxt[0] ;
                           A2764AlbHdrLin = P0A1U11_A2764AlbHdrLin[0] ;
                           AV53PrecioK = A2767AlbHdrPKg ;
                           AV54PrecioM = A2769AlbHdrPMt ;
                           AV20FlagAlbFas = (byte)(1) ;
                           if ( A3915EmpNumDec == 0 )
                           {
                              AV19ImpLinea = GXutil.roundDecimal( A2768AlbHdrKgs.multiply(A2767AlbHdrPKg), 0).add(GXutil.roundDecimal( A2770ALbHdrMts.multiply(A2769AlbHdrPMt), 0)) ;
                           }
                           else
                           {
                              AV19ImpLinea = GXutil.roundDecimal( A2768AlbHdrKgs.multiply(A2767AlbHdrPKg), 2).add(GXutil.roundDecimal( A2770ALbHdrMts.multiply(A2769AlbHdrPMt), 2)) ;
                           }
                           AV21TotCli = AV21TotCli.add(AV19ImpLinea) ;
                           AV23Marca = " " ;
                           if ( AV19ImpLinea.doubleValue() == 0 )
                           {
                              AV23Marca = "<-" ;
                           }
                           hA1U0( false, 17) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2765AlbHdrTxt, "")), 245, Gx_line+0, 465, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2768AlbHdrKgs, "ZZZZZ9.99")), 542, Gx_line+0, 609, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19ImpLinea, "ZZ,ZZZ,ZZ9.99")), 859, Gx_line+0, 955, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Marca, "")), 957, Gx_line+0, 973, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53PrecioK, "ZZZ9.99")), 620, Gx_line+0, 672, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2770ALbHdrMts, "ZZZZZ9.99")), 683, Gx_line+1, 750, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54PrecioM, "ZZZ9.99")), 758, Gx_line+0, 810, Gx_line+16, 2+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+17) ;
                           pr_default.readNext(9);
                        }
                        pr_default.close(9);
                        if ( AV20FlagAlbFas == 1 )
                        {
                           hA1U0( false, 15) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+15) ;
                        }
                     }
                     pr_default.readNext(3);
                  }
                  pr_default.close(3);
                  pr_default.readNext(2);
               }
               pr_default.close(2);
               AV24TotInf = AV24TotInf.add(AV21TotCli) ;
               AV65Pre_kg = DecimalUtil.doubleToDec(0) ;
               if ( AV61Tot_kgs_cl.doubleValue() > 0 )
               {
                  AV65Pre_kg = AV21TotCli.divide(AV61Tot_kgs_cl, 18, java.math.RoundingMode.DOWN) ;
               }
               AV66Pre_mt = DecimalUtil.doubleToDec(0) ;
               if ( AV62Tot_mts_cl.doubleValue() > 0 )
               {
                  AV66Pre_mt = AV21TotCli.divide(AV62Tot_mts_cl, 18, java.math.RoundingMode.DOWN) ;
               }
               if ( AV32FlagHdr > 0 )
               {
                  GXt_char2 = AV92encargoenergetico ;
                  GXv_char6[0] = GXt_char2 ;
                  new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IMPENG", ""), GXv_char6) ;
                  rfa0001_impl.this.GXt_char2 = GXv_char6[0] ;
                  AV92encargoenergetico = GXt_char2 ;
                  AV92encargoenergetico = GXutil.trim( AV92encargoenergetico) ;
                  AV90FacImpEng1 = ((0==AV91costesenergeticos) ? DecimalUtil.doubleToDec(0) : AV21TotCli.add((AV21TotCli.multiply(AV89CliEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                  AV92encargoenergetico = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV89CliEnergia)==0) ? "" : ((0==AV91costesenergeticos) ? "" : AV92encargoenergetico)) ;
                  AV93Totinfconcosteenergetico = AV93Totinfconcosteenergetico.add(AV90FacImpEng1) ;
                  hA1U0( false, 48) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21TotCli, "ZZ,ZZZ,ZZ9.99")), 873, Gx_line+7, 955, Gx_line+22, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17CliCod), "ZZZZZ9")), 151, Gx_line+7, 196, Gx_line+23, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82CliNom, "")), 201, Gx_line+7, 421, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(3, Gx_line+45, 1096, Gx_line+45, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(0, Gx_line+4, 1093, Gx_line+4, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit20, "")), 61, Gx_line+7, 140, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV61Tot_kgs_cl, "ZZ,ZZZ,ZZ9.99")), 526, Gx_line+7, 608, Gx_line+22, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62Tot_mts_cl, "ZZ,ZZZ,ZZ9.99")), 668, Gx_line+7, 750, Gx_line+22, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV65Pre_kg, "ZZZZZ9.999")), 545, Gx_line+27, 609, Gx_line+43, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV66Pre_mt, "ZZZZZ9.999")), 686, Gx_line+26, 750, Gx_line+42, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Lit22, "")), 444, Gx_line+27, 508, Gx_line+43, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit23, "")), 618, Gx_line+28, 682, Gx_line+44, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90FacImpEng1, "ZZ,ZZZ,ZZZ.ZZ")), 873, Gx_line+29, 955, Gx_line+44, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92encargoenergetico, "")), 963, Gx_line+28, 1131, Gx_line+44, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+48) ;
               }
               AV63Tot_Kgs_g = AV63Tot_Kgs_g.add(AV61Tot_kgs_cl) ;
               AV64Tot_Mts_g = AV64Tot_Mts_g.add(AV62Tot_mts_cl) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV65Pre_kg = DecimalUtil.doubleToDec(0) ;
            if ( AV63Tot_Kgs_g.doubleValue() > 0 )
            {
               AV65Pre_kg = AV24TotInf.divide(AV63Tot_Kgs_g, 18, java.math.RoundingMode.DOWN) ;
            }
            AV66Pre_mt = DecimalUtil.doubleToDec(0) ;
            if ( AV64Tot_Mts_g.doubleValue() > 0 )
            {
               AV66Pre_mt = AV24TotInf.divide(AV64Tot_Mts_g, 18, java.math.RoundingMode.DOWN) ;
            }
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TotInf)==0) )
            {
               GXt_char2 = AV92encargoenergetico ;
               GXv_char6[0] = GXt_char2 ;
               new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IMPENG", ""), GXv_char6) ;
               rfa0001_impl.this.GXt_char2 = GXv_char6[0] ;
               AV92encargoenergetico = GXt_char2 ;
               AV92encargoenergetico = GXutil.trim( AV92encargoenergetico) ;
               AV90FacImpEng1 = AV93Totinfconcosteenergetico ;
               AV92encargoenergetico = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV90FacImpEng1)==0) ? "" : AV92encargoenergetico) ;
               hA1U0( false, 49) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TotInf, "ZZ,ZZZ,ZZ9.99")), 850, Gx_line+8, 946, Gx_line+25, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit21, "")), 59, Gx_line+8, 123, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63Tot_Kgs_g, "ZZ,ZZZ,ZZ9.99")), 513, Gx_line+9, 609, Gx_line+26, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64Tot_Mts_g, "ZZ,ZZZ,ZZ9.99")), 654, Gx_line+8, 750, Gx_line+25, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Lit22, "")), 449, Gx_line+33, 513, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV65Pre_kg, "ZZZZZ9.999")), 545, Gx_line+33, 609, Gx_line+49, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit23, "")), 618, Gx_line+33, 682, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV66Pre_mt, "ZZZZZ9.999")), 686, Gx_line+33, 750, Gx_line+49, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90FacImpEng1, "ZZ,ZZZ,ZZZ.ZZ")), 864, Gx_line+30, 946, Gx_line+45, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92encargoenergetico, "")), 963, Gx_line+29, 1131, Gx_line+45, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+49) ;
            }
         }
         if ( AV28Tipo_alb == 2 )
         {
            pr_default.dynParam(10, new Object[]{ new Object[]{
                                                 Integer.valueOf(AV8PCliCod) ,
                                                 Integer.valueOf(AV9UCliCod) ,
                                                 Integer.valueOf(A252CliCod) ,
                                                 A396EmprCod } ,
                                                 new int[]{
                                                 TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING
                                                 }
            });
            /* Using cursor P0A1U12 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV8PCliCod), Integer.valueOf(AV9UCliCod)});
            while ( (pr_default.getStatus(10) != 101) )
            {
               brkA1U13 = false ;
               A279CliNom = P0A1U12_A279CliNom[0] ;
               A3915EmpNumDec = P0A1U12_A3915EmpNumDec[0] ;
               n3915EmpNumDec = P0A1U12_n3915EmpNumDec[0] ;
               A14AlbComCod = P0A1U12_A14AlbComCod[0] ;
               A252CliCod = P0A1U12_A252CliCod[0] ;
               A17AlbComFch = P0A1U12_A17AlbComFch[0] ;
               A16AlbComEst = P0A1U12_A16AlbComEst[0] ;
               A22AlbComPri = P0A1U12_A22AlbComPri[0] ;
               A3915EmpNumDec = P0A1U12_A3915EmpNumDec[0] ;
               n3915EmpNumDec = P0A1U12_n3915EmpNumDec[0] ;
               A279CliNom = P0A1U12_A279CliNom[0] ;
               AV18FlagCliCod = (byte)(0) ;
               while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(P0A1U12_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0A1U12_A252CliCod[0] == A252CliCod ) )
               {
                  brkA1U13 = false ;
                  A279CliNom = P0A1U12_A279CliNom[0] ;
                  A3915EmpNumDec = P0A1U12_A3915EmpNumDec[0] ;
                  n3915EmpNumDec = P0A1U12_n3915EmpNumDec[0] ;
                  A14AlbComCod = P0A1U12_A14AlbComCod[0] ;
                  A17AlbComFch = P0A1U12_A17AlbComFch[0] ;
                  A16AlbComEst = P0A1U12_A16AlbComEst[0] ;
                  A22AlbComPri = P0A1U12_A22AlbComPri[0] ;
                  A3915EmpNumDec = P0A1U12_A3915EmpNumDec[0] ;
                  n3915EmpNumDec = P0A1U12_n3915EmpNumDec[0] ;
                  A279CliNom = P0A1U12_A279CliNom[0] ;
                  if ( A16AlbComEst == 1 )
                  {
                     if ( (GXutil.strcmp("", AV26PPrior)==0) || ( ( GXutil.strcmp(A22AlbComPri, AV26PPrior) >= 0 ) ) )
                     {
                        if ( (GXutil.strcmp("", AV27UPrior)==0) || ( ( GXutil.strcmp(A22AlbComPri, AV27UPrior) <= 0 ) ) )
                        {
                           if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10PFecha)) || ( (( GXutil.resetTime(A17AlbComFch).after( GXutil.resetTime( AV10PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A17AlbComFch), GXutil.resetTime(AV10PFecha)) )) ) )
                           {
                              if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV11UFecha)) || ( (( GXutil.resetTime(A17AlbComFch).before( GXutil.resetTime( AV11UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A17AlbComFch), GXutil.resetTime(AV11UFecha)) )) ) )
                              {
                                 /* Using cursor P0A1U13 */
                                 pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
                                 while ( (pr_default.getStatus(11) != 101) )
                                 {
                                    A21AlbComPre = P0A1U13_A21AlbComPre[0] ;
                                    A13AlbComCnt = P0A1U13_A13AlbComCnt[0] ;
                                    A15AlbComDsc = P0A1U13_A15AlbComDsc[0] ;
                                    A20AlbComLin = P0A1U13_A20AlbComLin[0] ;
                                    if ( AV18FlagCliCod == 0 )
                                    {
                                       AV18FlagCliCod = (byte)(1) ;
                                       hA1U0( false, 26) ;
                                       getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 47, Gx_line+6, 92, Gx_line+21, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 103, Gx_line+6, 292, Gx_line+21, 0+256, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+26) ;
                                    }
                                    if ( A3915EmpNumDec == 0 )
                                    {
                                       AV19ImpLinea = GXutil.roundDecimal( A13AlbComCnt.multiply(A21AlbComPre), 0) ;
                                    }
                                    else
                                    {
                                       AV19ImpLinea = GXutil.roundDecimal( A13AlbComCnt.multiply(A21AlbComPre), 2) ;
                                    }
                                    AV21TotCli = AV21TotCli.add(AV19ImpLinea) ;
                                    hA1U0( false, 22) ;
                                    getPrinter().GxAttris("Courier New", 8, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9")), 6, Gx_line+0, 65, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(localUtil.format( A17AlbComFch, "99/99/99"), 85, Gx_line+0, 144, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A15AlbComDsc, "")), 156, Gx_line+0, 449, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13AlbComCnt, "ZZZZZ9.99")), 489, Gx_line+0, 556, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A21AlbComPre, "ZZZZZZ9.999")), 626, Gx_line+0, 722, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19ImpLinea, "ZZ,ZZZ,ZZ9.99")), 733, Gx_line+0, 829, Gx_line+17, 2+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+22) ;
                                    pr_default.readNext(11);
                                 }
                                 pr_default.close(11);
                              }
                           }
                        }
                     }
                  }
                  brkA1U13 = true ;
                  pr_default.readNext(10);
               }
               if ( ! brkA1U13 )
               {
                  brkA1U13 = true ;
                  pr_default.readNext(10);
               }
            }
            pr_default.close(10);
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hA1U0( true, 0) ;
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

   public void hA1U0( boolean bFoot ,
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
            if ( AV28Tipo_alb == 1 )
            {
               if ( (0==AV85Carvema) )
               {
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12EmpNom, "")), 11, Gx_line+11, 200, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Lit1, "")), 11, Gx_line+44, 168, Gx_line+61, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Lit0, "")), 947, Gx_line+44, 1000, Gx_line+59, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1016, Gx_line+44, 1061, Gx_line+60, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Lit2, "")), 760, Gx_line+11, 813, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 827, Gx_line+11, 886, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Lit3, "")), 890, Gx_line+11, 943, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 955, Gx_line+11, 1014, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(2, Gx_line+68, 1095, Gx_line+68, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(2, Gx_line+99, 1095, Gx_line+99, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit10, "")), 551, Gx_line+80, 607, Gx_line+94, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit11, "")), 611, Gx_line+80, 670, Gx_line+94, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit12, "")), 693, Gx_line+80, 749, Gx_line+94, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit13, "")), 753, Gx_line+80, 809, Gx_line+94, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit14, "")), 892, Gx_line+80, 955, Gx_line+94, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit4, "")), 6, Gx_line+80, 69, Gx_line+94, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit5, "")), 85, Gx_line+80, 129, Gx_line+94, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit6, "")), 156, Gx_line+80, 225, Gx_line+95, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86Lit716, "")), 245, Gx_line+80, 371, Gx_line+95, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit9, "")), 468, Gx_line+80, 506, Gx_line+94, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit8, "")), 367, Gx_line+80, 420, Gx_line+95, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 521, Gx_line+80, 537, Gx_line+95, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "St", ""), 1080, Gx_line+80, 1092, Gx_line+94, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77Op_p_f, "")), 417, Gx_line+44, 543, Gx_line+60, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Op_p_t, "")), 283, Gx_line+44, 409, Gx_line+60, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81Lit28, "")), 815, Gx_line+80, 851, Gx_line+94, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100Pgmname, "")), 558, Gx_line+44, 778, Gx_line+60, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+102) ;
               }
               else
               {
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12EmpNom, "")), 17, Gx_line+0, 206, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Lit1, "")), 17, Gx_line+32, 174, Gx_line+49, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Lit0, "")), 952, Gx_line+32, 1005, Gx_line+47, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1021, Gx_line+32, 1066, Gx_line+48, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Lit2, "")), 766, Gx_line+0, 819, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 832, Gx_line+0, 891, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Lit3, "")), 895, Gx_line+0, 948, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 960, Gx_line+0, 1019, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+56, 1100, Gx_line+56, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+88, 1100, Gx_line+88, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit14, "")), 916, Gx_line+69, 979, Gx_line+83, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit4, "")), 11, Gx_line+69, 74, Gx_line+83, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit5, "")), 91, Gx_line+69, 135, Gx_line+83, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit6, "")), 161, Gx_line+69, 230, Gx_line+84, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit8, "")), 464, Gx_line+69, 517, Gx_line+84, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 598, Gx_line+69, 614, Gx_line+84, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "St", ""), 1104, Gx_line+69, 1116, Gx_line+83, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77Op_p_f, "")), 425, Gx_line+32, 551, Gx_line+48, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Op_p_t, "")), 292, Gx_line+32, 418, Gx_line+48, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100Pgmname, "")), 567, Gx_line+32, 787, Gx_line+48, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Normas", ""), 372, Gx_line+69, 417, Gx_line+84, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TT", ""), 569, Gx_line+69, 585, Gx_line+84, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Quilos", ""), 642, Gx_line+69, 687, Gx_line+84, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Preço", ""), 707, Gx_line+69, 744, Gx_line+84, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 773, Gx_line+69, 818, Gx_line+84, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Preço", ""), 839, Gx_line+69, 876, Gx_line+84, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 248, Gx_line+69, 293, Gx_line+84, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+93) ;
               }
            }
            else
            {
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12EmpNom, "")), 11, Gx_line+9, 231, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Lit1, "")), 11, Gx_line+42, 200, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Lit0, "")), 816, Gx_line+43, 880, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 884, Gx_line+43, 929, Gx_line+59, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Lit2, "")), 640, Gx_line+10, 704, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 706, Gx_line+10, 765, Gx_line+26, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Lit3, "")), 769, Gx_line+10, 833, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 834, Gx_line+10, 893, Gx_line+26, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(2, Gx_line+66, 1057, Gx_line+66, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(2, Gx_line+97, 1057, Gx_line+97, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit4, "")), 6, Gx_line+80, 65, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit5, "")), 85, Gx_line+80, 144, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit17, "")), 156, Gx_line+80, 230, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit13, "")), 655, Gx_line+80, 722, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit14, "")), 733, Gx_line+80, 807, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit18, "")), 481, Gx_line+79, 555, Gx_line+95, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+98) ;
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
      add_metrics4( ) ;
      add_metrics5( ) ;
      add_metrics6( ) ;
      add_metrics7( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Times New Roman", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Times New Roman", true, true, 58, 14, 72, 123,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 30, 35, 35, 55, 45, 14, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 21, 21, 37, 37, 37, 38, 61, 45, 45, 45, 45, 42, 38, 49, 45, 17, 35, 45, 38, 52, 45, 49, 42, 49, 45, 42, 38, 45, 42, 59, 42, 42, 38, 21, 18, 23, 37, 35, 21, 35, 38, 35, 38, 35, 21, 38, 38, 18, 18, 35, 18, 56, 38, 38, 38, 38, 25, 35, 21, 38, 35, 49, 35, 35, 32, 25, 17, 25, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 36, 35, 35, 35, 17, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 21, 21, 36, 35, 21, 21, 21, 23, 35, 53, 53, 53, 38, 45, 45, 45, 45, 45, 45, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 35, 35, 35, 35, 35, 18, 18, 18, 18, 38, 38, 38, 38, 38, 38, 38, 35, 38, 38, 38, 38, 38, 35, 38, 35}) ;
   }

   public void add_metrics5( )
   {
      getPrinter().setMetrics("Courier New", false, true, 56, 14, 70, 118,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 18, 22, 35, 35, 56, 42, 12, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 18, 18, 37, 37, 37, 35, 64, 42, 42, 45, 45, 42, 38, 49, 45, 18, 32, 42, 35, 53, 45, 49, 42, 49, 45, 42, 38, 45, 42, 61, 42, 42, 38, 18, 18, 18, 30, 35, 21, 35, 35, 32, 35, 35, 18, 35, 35, 14, 14, 32, 14, 52, 35, 35, 35, 35, 21, 32, 18, 35, 32, 45, 32, 32, 29, 21, 16, 21, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 35, 35, 34, 35, 16, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 20, 21, 35, 34, 21, 21, 20, 23, 35, 53, 53, 53, 38, 42, 42, 42, 42, 42, 42, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 32, 35, 35, 35, 35, 18, 18, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 38, 35, 35, 35, 35, 32, 35, 32}) ;
   }

   public void add_metrics6( )
   {
      getPrinter().setMetrics("Times New Roman", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics7( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV10PFecha = GXutil.nullDate() ;
      AV11UFecha = GXutil.nullDate() ;
      AV25Prior = "" ;
      AV77Op_p_f = "" ;
      AV76Op_p_t = "" ;
      AV92encargoenergetico = "" ;
      AV13Lit0 = "" ;
      AV14Lit1 = "" ;
      AV15Lit2 = "" ;
      AV16Lit3 = "" ;
      AV36Lit4 = "" ;
      AV37Lit5 = "" ;
      AV38Lit6 = "" ;
      AV39Lit7 = "" ;
      AV48Lit8 = "" ;
      AV40Lit9 = "" ;
      AV47Lit10 = "" ;
      AV42Lit11 = "" ;
      AV43Lit12 = "" ;
      AV44Lit13 = "" ;
      AV41Lit14 = "" ;
      AV45Lit15 = "" ;
      AV35Lit16 = "" ;
      AV49Lit17 = "" ;
      AV46Lit18 = "" ;
      AV50Lit19 = "" ;
      AV51Lit20 = "" ;
      AV52Lit21 = "" ;
      AV67Lit22 = "" ;
      AV68Lit23 = "" ;
      AV69Lit24 = "" ;
      AV70Lit25 = "" ;
      AV81Lit28 = "" ;
      GXv_int1 = new byte[1] ;
      AV86Lit716 = "" ;
      scmdbuf = "" ;
      P0A1U2_A396EmprCod = new String[] {""} ;
      P0A1U2_A407EmprNom = new String[] {""} ;
      P0A1U2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV12EmpNom = "" ;
      AV26PPrior = "" ;
      AV27UPrior = "" ;
      AV24TotInf = DecimalUtil.ZERO ;
      AV63Tot_Kgs_g = DecimalUtil.ZERO ;
      AV64Tot_Mts_g = DecimalUtil.ZERO ;
      AV93Totinfconcosteenergetico = DecimalUtil.ZERO ;
      P0A1U3_A396EmprCod = new String[] {""} ;
      P0A1U3_A252CliCod = new int[1] ;
      P0A1U3_A279CliNom = new String[] {""} ;
      P0A1U3_A14242CliEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A279CliNom = "" ;
      A14242CliEnergia = DecimalUtil.ZERO ;
      AV82CliNom = "" ;
      AV21TotCli = DecimalUtil.ZERO ;
      AV61Tot_kgs_cl = DecimalUtil.ZERO ;
      AV62Tot_mts_cl = DecimalUtil.ZERO ;
      AV89CliEnergia = DecimalUtil.ZERO ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A1253EmprGuiRem = "" ;
      A5140AlbMarca = "" ;
      P0A1U4_A396EmprCod = new String[] {""} ;
      P0A1U4_A1253EmprGuiRem = new String[] {""} ;
      P0A1U4_A3915EmpNumDec = new byte[1] ;
      P0A1U4_n3915EmpNumDec = new boolean[] {false} ;
      P0A1U4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1U4_A30AlbProCod = new long[1] ;
      P0A1U4_A5140AlbMarca = new String[] {""} ;
      P0A1U4_A33AlbProEst = new byte[1] ;
      P0A1U4_A39AlbProPri = new String[] {""} ;
      P0A1U4_A1243GuiRemCli = new int[1] ;
      P0A1U5_A396EmprCod = new String[] {""} ;
      P0A1U5_A30AlbProCod = new long[1] ;
      P0A1U5_A130BarCodPar = new String[] {""} ;
      P0A1U5_A132BarCodReo = new byte[1] ;
      P0A1U5_A129BarCod = new int[1] ;
      P0A1U5_A361DisCod = new int[1] ;
      P0A1U5_A2839AlbProVal = new String[] {""} ;
      P0A1U5_A2762AlbBarDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U5_n2762AlbBarDto = new boolean[] {false} ;
      P0A1U5_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U5_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U5_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U5_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U5_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U5_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U5_A135BarColNom = new String[] {""} ;
      P0A1U5_A136BarColNum = new int[1] ;
      P0A1U5_A212BarSer = new String[] {""} ;
      P0A1U5_A3746BarNPed = new String[] {""} ;
      P0A1U5_A1652BarSerDsc = new String[] {""} ;
      P0A1U5_A32AlbProEsp = new byte[1] ;
      P0A1U5_A217BarTipArt = new short[1] ;
      P0A1U5_n217BarTipArt = new boolean[] {false} ;
      P0A1U5_A218BarTipCol = new byte[1] ;
      A130BarCodPar = "" ;
      A2839AlbProVal = "" ;
      A2762AlbBarDto = DecimalUtil.ZERO ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A3746BarNPed = "" ;
      A1652BarSerDsc = "" ;
      AV88Distraid = "" ;
      P0A1U6_A396EmprCod = new String[] {""} ;
      P0A1U6_A361DisCod = new int[1] ;
      P0A1U6_A13376DisTraID = new String[] {""} ;
      A13376DisTraID = "" ;
      P0A1U7_A396EmprCod = new String[] {""} ;
      P0A1U7_A129BarCod = new int[1] ;
      P0A1U7_A132BarCodReo = new byte[1] ;
      P0A1U7_A130BarCodPar = new String[] {""} ;
      P0A1U7_A13905BarTraID = new String[] {""} ;
      A13905BarTraID = "" ;
      AV87Normas = "" ;
      P0A1U8_A396EmprCod = new String[] {""} ;
      P0A1U8_A361DisCod = new int[1] ;
      P0A1U8_A13213DisNormID = new String[] {""} ;
      A13213DisNormID = "" ;
      AV80DtoPen = DecimalUtil.ZERO ;
      AV19ImpLinea = DecimalUtil.ZERO ;
      AV23Marca = "" ;
      AV22Hdr = "" ;
      AV30BarColNom = "" ;
      AV84Barserdsc = "" ;
      AV33AlbProEspC = "" ;
      AV53PrecioK = DecimalUtil.ZERO ;
      AV54PrecioM = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new short[1] ;
      AV55TipArtDsc = "" ;
      P0A1U9_A396EmprCod = new String[] {""} ;
      P0A1U9_A30AlbProCod = new long[1] ;
      P0A1U9_A129BarCod = new int[1] ;
      P0A1U9_A132BarCodReo = new byte[1] ;
      P0A1U9_A130BarCodPar = new String[] {""} ;
      P0A1U9_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U9_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U9_A7751GuiFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U9_n7751GuiFasDto = new boolean[] {false} ;
      P0A1U9_A7752GuiFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U9_n7752GuiFasRec = new boolean[] {false} ;
      P0A1U9_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U9_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U9_A457FasCod = new String[] {""} ;
      P0A1U9_A460FasDsc = new String[] {""} ;
      P0A1U9_A1240GuiFasLin = new short[1] ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A7751GuiFasDto = DecimalUtil.ZERO ;
      A7752GuiFasRec = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      P0A1U10_A396EmprCod = new String[] {""} ;
      P0A1U10_A30AlbProCod = new long[1] ;
      P0A1U10_A129BarCod = new int[1] ;
      P0A1U10_A132BarCodReo = new byte[1] ;
      P0A1U10_A130BarCodPar = new String[] {""} ;
      P0A1U10_A1469AlbPrdPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U10_n1469AlbPrdPKg = new boolean[] {false} ;
      P0A1U10_A1470AlbPrdPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U10_n1470AlbPrdPMt = new boolean[] {false} ;
      P0A1U10_A1472PrdMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U10_n1472PrdMtr = new boolean[] {false} ;
      P0A1U10_A1471PrdKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U10_n1471PrdKgm = new boolean[] {false} ;
      P0A1U10_A759ProDsc = new String[] {""} ;
      P0A1U10_A758ProCod = new String[] {""} ;
      P0A1U10_n758ProCod = new boolean[] {false} ;
      P0A1U10_A1468AlbPrdLin = new short[1] ;
      A1469AlbPrdPKg = DecimalUtil.ZERO ;
      A1470AlbPrdPMt = DecimalUtil.ZERO ;
      A1472PrdMtr = DecimalUtil.ZERO ;
      A1471PrdKgm = DecimalUtil.ZERO ;
      A759ProDsc = "" ;
      A758ProCod = "" ;
      P0A1U11_A396EmprCod = new String[] {""} ;
      P0A1U11_A30AlbProCod = new long[1] ;
      P0A1U11_A129BarCod = new int[1] ;
      P0A1U11_A132BarCodReo = new byte[1] ;
      P0A1U11_A130BarCodPar = new String[] {""} ;
      P0A1U11_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U11_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U11_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U11_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U11_A2765AlbHdrTxt = new String[] {""} ;
      P0A1U11_A2764AlbHdrLin = new short[1] ;
      A2767AlbHdrPKg = DecimalUtil.ZERO ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      A2765AlbHdrTxt = "" ;
      AV65Pre_kg = DecimalUtil.ZERO ;
      AV66Pre_mt = DecimalUtil.ZERO ;
      AV90FacImpEng1 = DecimalUtil.ZERO ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      P0A1U12_A396EmprCod = new String[] {""} ;
      P0A1U12_A279CliNom = new String[] {""} ;
      P0A1U12_A3915EmpNumDec = new byte[1] ;
      P0A1U12_n3915EmpNumDec = new boolean[] {false} ;
      P0A1U12_A14AlbComCod = new int[1] ;
      P0A1U12_A252CliCod = new int[1] ;
      P0A1U12_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1U12_A16AlbComEst = new byte[1] ;
      P0A1U12_A22AlbComPri = new String[] {""} ;
      A17AlbComFch = GXutil.nullDate() ;
      A22AlbComPri = "" ;
      P0A1U13_A396EmprCod = new String[] {""} ;
      P0A1U13_A14AlbComCod = new int[1] ;
      P0A1U13_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U13_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1U13_A15AlbComDsc = new String[] {""} ;
      P0A1U13_A20AlbComLin = new short[1] ;
      A21AlbComPre = DecimalUtil.ZERO ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A15AlbComDsc = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV100Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.rfa0001__default(),
         new Object[] {
             new Object[] {
            P0A1U2_A396EmprCod, P0A1U2_A407EmprNom, P0A1U2_n407EmprNom
            }
            , new Object[] {
            P0A1U3_A396EmprCod, P0A1U3_A252CliCod, P0A1U3_A279CliNom, P0A1U3_A14242CliEnergia
            }
            , new Object[] {
            P0A1U4_A396EmprCod, P0A1U4_A1253EmprGuiRem, P0A1U4_A3915EmpNumDec, P0A1U4_n3915EmpNumDec, P0A1U4_A34AlbProfch, P0A1U4_A30AlbProCod, P0A1U4_A5140AlbMarca, P0A1U4_A33AlbProEst, P0A1U4_A39AlbProPri, P0A1U4_A1243GuiRemCli
            }
            , new Object[] {
            P0A1U5_A396EmprCod, P0A1U5_A30AlbProCod, P0A1U5_A130BarCodPar, P0A1U5_A132BarCodReo, P0A1U5_A129BarCod, P0A1U5_A361DisCod, P0A1U5_A2839AlbProVal, P0A1U5_A2762AlbBarDto, P0A1U5_n2762AlbBarDto, P0A1U5_A2761AlbBarRec,
            P0A1U5_A1264BarPreMtr, P0A1U5_A1263BarAlbMtrE, P0A1U5_A1262BarPreKgm, P0A1U5_A1261BarAlbKgmE, P0A1U5_A5354AlbImpMan, P0A1U5_A135BarColNom, P0A1U5_A136BarColNum, P0A1U5_A212BarSer, P0A1U5_A3746BarNPed, P0A1U5_A1652BarSerDsc,
            P0A1U5_A32AlbProEsp, P0A1U5_A217BarTipArt, P0A1U5_n217BarTipArt, P0A1U5_A218BarTipCol
            }
            , new Object[] {
            P0A1U6_A396EmprCod, P0A1U6_A361DisCod, P0A1U6_A13376DisTraID
            }
            , new Object[] {
            P0A1U7_A396EmprCod, P0A1U7_A129BarCod, P0A1U7_A132BarCodReo, P0A1U7_A130BarCodPar, P0A1U7_A13905BarTraID
            }
            , new Object[] {
            P0A1U8_A396EmprCod, P0A1U8_A361DisCod, P0A1U8_A13213DisNormID
            }
            , new Object[] {
            P0A1U9_A396EmprCod, P0A1U9_A30AlbProCod, P0A1U9_A129BarCod, P0A1U9_A132BarCodReo, P0A1U9_A130BarCodPar, P0A1U9_A1241GuiFasPKg, P0A1U9_A1242GuiFasPMt, P0A1U9_A7751GuiFasDto, P0A1U9_n7751GuiFasDto, P0A1U9_A7752GuiFasRec,
            P0A1U9_n7752GuiFasRec, P0A1U9_A1276FasMtr, P0A1U9_A1275FasKgm, P0A1U9_A457FasCod, P0A1U9_A460FasDsc, P0A1U9_A1240GuiFasLin
            }
            , new Object[] {
            P0A1U10_A396EmprCod, P0A1U10_A30AlbProCod, P0A1U10_A129BarCod, P0A1U10_A132BarCodReo, P0A1U10_A130BarCodPar, P0A1U10_A1469AlbPrdPKg, P0A1U10_n1469AlbPrdPKg, P0A1U10_A1470AlbPrdPMt, P0A1U10_n1470AlbPrdPMt, P0A1U10_A1472PrdMtr,
            P0A1U10_n1472PrdMtr, P0A1U10_A1471PrdKgm, P0A1U10_n1471PrdKgm, P0A1U10_A759ProDsc, P0A1U10_A758ProCod, P0A1U10_n758ProCod, P0A1U10_A1468AlbPrdLin
            }
            , new Object[] {
            P0A1U11_A396EmprCod, P0A1U11_A30AlbProCod, P0A1U11_A129BarCod, P0A1U11_A132BarCodReo, P0A1U11_A130BarCodPar, P0A1U11_A2767AlbHdrPKg, P0A1U11_A2769AlbHdrPMt, P0A1U11_A2770ALbHdrMts, P0A1U11_A2768AlbHdrKgs, P0A1U11_A2765AlbHdrTxt,
            P0A1U11_A2764AlbHdrLin
            }
            , new Object[] {
            P0A1U12_A396EmprCod, P0A1U12_A279CliNom, P0A1U12_A3915EmpNumDec, P0A1U12_n3915EmpNumDec, P0A1U12_A14AlbComCod, P0A1U12_A252CliCod, P0A1U12_A17AlbComFch, P0A1U12_A16AlbComEst, P0A1U12_A22AlbComPri
            }
            , new Object[] {
            P0A1U13_A396EmprCod, P0A1U13_A14AlbComCod, P0A1U13_A21AlbComPre, P0A1U13_A13AlbComCnt, P0A1U13_A15AlbComDsc, P0A1U13_A20AlbComLin
            }
         }
      );
      AV100Pgmname = "Facturacion.RFA0001" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV100Pgmname = "Facturacion.RFA0001" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV28Tipo_alb ;
   private byte AV73Sin_p_f ;
   private byte AV72Sin_p_t ;
   private byte AV91costesenergeticos ;
   private byte AV34FlagIdioma ;
   private byte AV79Moda21 ;
   private byte AV78ItalColore ;
   private byte AV83Vts ;
   private byte AV85Carvema ;
   private byte GXt_int4 ;
   private byte GXv_int1[] ;
   private byte AV18FlagCliCod ;
   private byte A33AlbProEst ;
   private byte A3915EmpNumDec ;
   private byte A132BarCodReo ;
   private byte A32AlbProEsp ;
   private byte A218BarTipCol ;
   private byte AV20FlagAlbFas ;
   private byte A16AlbComEst ;
   private short gxcookieaux ;
   private short A217BarTipArt ;
   private short GXv_int5[] ;
   private short A1240GuiFasLin ;
   private short A1468AlbPrdLin ;
   private short A2764AlbHdrLin ;
   private short A20AlbComLin ;
   private short Gx_err ;
   private int AV8PCliCod ;
   private int AV9UCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV17CliCod ;
   private int AV32FlagHdr ;
   private int A1243GuiRemCli ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int AV31BarColNum ;
   private int Gx_OldLine ;
   private int A14AlbComCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV24TotInf ;
   private java.math.BigDecimal AV63Tot_Kgs_g ;
   private java.math.BigDecimal AV64Tot_Mts_g ;
   private java.math.BigDecimal AV93Totinfconcosteenergetico ;
   private java.math.BigDecimal A14242CliEnergia ;
   private java.math.BigDecimal AV21TotCli ;
   private java.math.BigDecimal AV61Tot_kgs_cl ;
   private java.math.BigDecimal AV62Tot_mts_cl ;
   private java.math.BigDecimal AV89CliEnergia ;
   private java.math.BigDecimal A2762AlbBarDto ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal AV80DtoPen ;
   private java.math.BigDecimal AV19ImpLinea ;
   private java.math.BigDecimal AV53PrecioK ;
   private java.math.BigDecimal AV54PrecioM ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A7751GuiFasDto ;
   private java.math.BigDecimal A7752GuiFasRec ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1469AlbPrdPKg ;
   private java.math.BigDecimal A1470AlbPrdPMt ;
   private java.math.BigDecimal A1472PrdMtr ;
   private java.math.BigDecimal A1471PrdKgm ;
   private java.math.BigDecimal A2767AlbHdrPKg ;
   private java.math.BigDecimal A2769AlbHdrPMt ;
   private java.math.BigDecimal A2770ALbHdrMts ;
   private java.math.BigDecimal A2768AlbHdrKgs ;
   private java.math.BigDecimal AV65Pre_kg ;
   private java.math.BigDecimal AV66Pre_mt ;
   private java.math.BigDecimal AV90FacImpEng1 ;
   private java.math.BigDecimal A21AlbComPre ;
   private java.math.BigDecimal A13AlbComCnt ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV25Prior ;
   private String AV77Op_p_f ;
   private String AV76Op_p_t ;
   private String AV92encargoenergetico ;
   private String AV13Lit0 ;
   private String AV14Lit1 ;
   private String AV15Lit2 ;
   private String AV16Lit3 ;
   private String AV36Lit4 ;
   private String AV37Lit5 ;
   private String AV38Lit6 ;
   private String AV39Lit7 ;
   private String AV48Lit8 ;
   private String AV40Lit9 ;
   private String AV47Lit10 ;
   private String AV42Lit11 ;
   private String AV43Lit12 ;
   private String AV44Lit13 ;
   private String AV41Lit14 ;
   private String AV45Lit15 ;
   private String AV35Lit16 ;
   private String AV49Lit17 ;
   private String AV46Lit18 ;
   private String AV50Lit19 ;
   private String AV51Lit20 ;
   private String AV52Lit21 ;
   private String AV67Lit22 ;
   private String AV68Lit23 ;
   private String AV69Lit24 ;
   private String AV70Lit25 ;
   private String AV81Lit28 ;
   private String AV86Lit716 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV12EmpNom ;
   private String AV26PPrior ;
   private String AV27UPrior ;
   private String A279CliNom ;
   private String AV82CliNom ;
   private String A39AlbProPri ;
   private String A1253EmprGuiRem ;
   private String A5140AlbMarca ;
   private String A130BarCodPar ;
   private String A2839AlbProVal ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A3746BarNPed ;
   private String A1652BarSerDsc ;
   private String AV88Distraid ;
   private String A13376DisTraID ;
   private String A13905BarTraID ;
   private String AV87Normas ;
   private String A13213DisNormID ;
   private String AV23Marca ;
   private String AV22Hdr ;
   private String AV30BarColNom ;
   private String AV84Barserdsc ;
   private String AV33AlbProEspC ;
   private String GXv_char3[] ;
   private String AV55TipArtDsc ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A759ProDsc ;
   private String A758ProCod ;
   private String A2765AlbHdrTxt ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private String A22AlbComPri ;
   private String A15AlbComDsc ;
   private String Gx_time ;
   private String AV100Pgmname ;
   private java.util.Date AV10PFecha ;
   private java.util.Date AV11UFecha ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n3915EmpNumDec ;
   private boolean n2762AlbBarDto ;
   private boolean n217BarTipArt ;
   private boolean n7751GuiFasDto ;
   private boolean n7752GuiFasRec ;
   private boolean n1469AlbPrdPKg ;
   private boolean n1470AlbPrdPMt ;
   private boolean n1472PrdMtr ;
   private boolean n1471PrdKgm ;
   private boolean n758ProCod ;
   private boolean brkA1U13 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A1U2_A396EmprCod ;
   private String[] P0A1U2_A407EmprNom ;
   private boolean[] P0A1U2_n407EmprNom ;
   private String[] P0A1U3_A396EmprCod ;
   private int[] P0A1U3_A252CliCod ;
   private String[] P0A1U3_A279CliNom ;
   private java.math.BigDecimal[] P0A1U3_A14242CliEnergia ;
   private String[] P0A1U4_A396EmprCod ;
   private String[] P0A1U4_A1253EmprGuiRem ;
   private byte[] P0A1U4_A3915EmpNumDec ;
   private boolean[] P0A1U4_n3915EmpNumDec ;
   private java.util.Date[] P0A1U4_A34AlbProfch ;
   private long[] P0A1U4_A30AlbProCod ;
   private String[] P0A1U4_A5140AlbMarca ;
   private byte[] P0A1U4_A33AlbProEst ;
   private String[] P0A1U4_A39AlbProPri ;
   private int[] P0A1U4_A1243GuiRemCli ;
   private String[] P0A1U5_A396EmprCod ;
   private long[] P0A1U5_A30AlbProCod ;
   private String[] P0A1U5_A130BarCodPar ;
   private byte[] P0A1U5_A132BarCodReo ;
   private int[] P0A1U5_A129BarCod ;
   private int[] P0A1U5_A361DisCod ;
   private String[] P0A1U5_A2839AlbProVal ;
   private java.math.BigDecimal[] P0A1U5_A2762AlbBarDto ;
   private boolean[] P0A1U5_n2762AlbBarDto ;
   private java.math.BigDecimal[] P0A1U5_A2761AlbBarRec ;
   private java.math.BigDecimal[] P0A1U5_A1264BarPreMtr ;
   private java.math.BigDecimal[] P0A1U5_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P0A1U5_A1262BarPreKgm ;
   private java.math.BigDecimal[] P0A1U5_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P0A1U5_A5354AlbImpMan ;
   private String[] P0A1U5_A135BarColNom ;
   private int[] P0A1U5_A136BarColNum ;
   private String[] P0A1U5_A212BarSer ;
   private String[] P0A1U5_A3746BarNPed ;
   private String[] P0A1U5_A1652BarSerDsc ;
   private byte[] P0A1U5_A32AlbProEsp ;
   private short[] P0A1U5_A217BarTipArt ;
   private boolean[] P0A1U5_n217BarTipArt ;
   private byte[] P0A1U5_A218BarTipCol ;
   private String[] P0A1U6_A396EmprCod ;
   private int[] P0A1U6_A361DisCod ;
   private String[] P0A1U6_A13376DisTraID ;
   private String[] P0A1U7_A396EmprCod ;
   private int[] P0A1U7_A129BarCod ;
   private byte[] P0A1U7_A132BarCodReo ;
   private String[] P0A1U7_A130BarCodPar ;
   private String[] P0A1U7_A13905BarTraID ;
   private String[] P0A1U8_A396EmprCod ;
   private int[] P0A1U8_A361DisCod ;
   private String[] P0A1U8_A13213DisNormID ;
   private String[] P0A1U9_A396EmprCod ;
   private long[] P0A1U9_A30AlbProCod ;
   private int[] P0A1U9_A129BarCod ;
   private byte[] P0A1U9_A132BarCodReo ;
   private String[] P0A1U9_A130BarCodPar ;
   private java.math.BigDecimal[] P0A1U9_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P0A1U9_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P0A1U9_A7751GuiFasDto ;
   private boolean[] P0A1U9_n7751GuiFasDto ;
   private java.math.BigDecimal[] P0A1U9_A7752GuiFasRec ;
   private boolean[] P0A1U9_n7752GuiFasRec ;
   private java.math.BigDecimal[] P0A1U9_A1276FasMtr ;
   private java.math.BigDecimal[] P0A1U9_A1275FasKgm ;
   private String[] P0A1U9_A457FasCod ;
   private String[] P0A1U9_A460FasDsc ;
   private short[] P0A1U9_A1240GuiFasLin ;
   private String[] P0A1U10_A396EmprCod ;
   private long[] P0A1U10_A30AlbProCod ;
   private int[] P0A1U10_A129BarCod ;
   private byte[] P0A1U10_A132BarCodReo ;
   private String[] P0A1U10_A130BarCodPar ;
   private java.math.BigDecimal[] P0A1U10_A1469AlbPrdPKg ;
   private boolean[] P0A1U10_n1469AlbPrdPKg ;
   private java.math.BigDecimal[] P0A1U10_A1470AlbPrdPMt ;
   private boolean[] P0A1U10_n1470AlbPrdPMt ;
   private java.math.BigDecimal[] P0A1U10_A1472PrdMtr ;
   private boolean[] P0A1U10_n1472PrdMtr ;
   private java.math.BigDecimal[] P0A1U10_A1471PrdKgm ;
   private boolean[] P0A1U10_n1471PrdKgm ;
   private String[] P0A1U10_A759ProDsc ;
   private String[] P0A1U10_A758ProCod ;
   private boolean[] P0A1U10_n758ProCod ;
   private short[] P0A1U10_A1468AlbPrdLin ;
   private String[] P0A1U11_A396EmprCod ;
   private long[] P0A1U11_A30AlbProCod ;
   private int[] P0A1U11_A129BarCod ;
   private byte[] P0A1U11_A132BarCodReo ;
   private String[] P0A1U11_A130BarCodPar ;
   private java.math.BigDecimal[] P0A1U11_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] P0A1U11_A2769AlbHdrPMt ;
   private java.math.BigDecimal[] P0A1U11_A2770ALbHdrMts ;
   private java.math.BigDecimal[] P0A1U11_A2768AlbHdrKgs ;
   private String[] P0A1U11_A2765AlbHdrTxt ;
   private short[] P0A1U11_A2764AlbHdrLin ;
   private String[] P0A1U12_A396EmprCod ;
   private String[] P0A1U12_A279CliNom ;
   private byte[] P0A1U12_A3915EmpNumDec ;
   private boolean[] P0A1U12_n3915EmpNumDec ;
   private int[] P0A1U12_A14AlbComCod ;
   private int[] P0A1U12_A252CliCod ;
   private java.util.Date[] P0A1U12_A17AlbComFch ;
   private byte[] P0A1U12_A16AlbComEst ;
   private String[] P0A1U12_A22AlbComPri ;
   private String[] P0A1U13_A396EmprCod ;
   private int[] P0A1U13_A14AlbComCod ;
   private java.math.BigDecimal[] P0A1U13_A21AlbComPre ;
   private java.math.BigDecimal[] P0A1U13_A13AlbComCnt ;
   private String[] P0A1U13_A15AlbComDsc ;
   private short[] P0A1U13_A20AlbComLin ;
}

final  class rfa0001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A1U3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV8PCliCod ,
                                          int AV9UCliCod ,
                                          int A252CliCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[3];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, CliNom, CliEnergia FROM TXPCLIENT" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (0==AV8PCliCod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int7[1] = (byte)(1) ;
      }
      if ( ! (0==AV9UCliCod) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int7[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   protected Object[] conditional_P0A1U4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV26PPrior ,
                                          String AV27UPrior ,
                                          java.util.Date AV10PFecha ,
                                          java.util.Date AV11UFecha ,
                                          String A39AlbProPri ,
                                          java.util.Date A34AlbProfch ,
                                          String A1253EmprGuiRem ,
                                          String A396EmprCod ,
                                          String A5140AlbMarca ,
                                          int A1243GuiRemCli ,
                                          int AV17CliCod ,
                                          byte A33AlbProEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[6];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.EmprGuiRem, T2.EmpNumDec, T1.AlbProfch, T1.AlbProCod, T1.AlbMarca, T1.AlbProEst, T1.AlbProPri, T1.GuiRemCli FROM (TXPCALPRD T1 INNER JOIN TXPEMPRES" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod)" ;
      addWhere(sWhereString, "(T1.EmprGuiRem = ?)");
      addWhere(sWhereString, "(T1.AlbMarca <> 'A')");
      addWhere(sWhereString, "(T1.GuiRemCli = ?)");
      addWhere(sWhereString, "(T1.AlbProEst = 1)");
      if ( ! (GXutil.strcmp("", AV26PPrior)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProPri >= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27UPrior)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProPri <= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10PFecha)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV11UFecha)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.GuiRemCli, T1.AlbProfch, T1.AlbProCod" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_P0A1U12( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV8PCliCod ,
                                           int AV9UCliCod ,
                                           int A252CliCod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[3];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliNom, T2.EmpNumDec, T1.AlbComCod, T1.CliCod, T1.AlbComFch, T1.AlbComEst, T1.AlbComPri FROM ((TXPCALCOM T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV8PCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! (0==AV9UCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P0A1U3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] );
            case 2 :
                  return conditional_P0A1U4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() );
            case 10 :
                  return conditional_P0A1U12(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A1U2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A1U3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1U4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1U5", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.DisCod, T1.AlbProVal, T1.AlbBarDto, T1.AlbBarRec, T1.BarPreMtr, T1.BarAlbMtrE, T1.BarPreKgm, T1.BarAlbKgmE, T1.AlbImpMan, T2.BarColNom, T2.BarColNum, T2.BarSer, T2.BarNPed, T2.BarSerDsc, T1.AlbProEsp, T2.BarTipArt, T2.BarTipCol FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1U6", "SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1U7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1U8", "SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1U9", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasPKg, T1.GuiFasPMt, T1.GuiFasDto, T1.GuiFasRec, T1.FasMtr, T1.FasKgm, T1.FasCod, T2.FasDsc, T1.GuiFasLin FROM ((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1U10", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbPrdPKg, T1.AlbPrdPMt, T1.PrdMtr, T1.PrdKgm, T2.ProDsc, T1.ProCod, T1.AlbPrdLin FROM ((TXPALBPRD T1 LEFT JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbPrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1U11", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrPKg, AlbHdrPMt, ALbHdrMts, AlbHdrKgs, AlbHdrTxt, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1U12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1U13", "SELECT EmprCod, AlbComCod, AlbComPre, AlbComCnt, AlbComDsc, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((long[]) buf[5])[0] = rslt.getLong(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[15])[0] = rslt.getString(15, 13);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 16);
               ((String[]) buf[18])[0] = rslt.getString(18, 20);
               ((String[]) buf[19])[0] = rslt.getString(19, 26);
               ((byte[]) buf[20])[0] = rslt.getByte(20);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(22);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[13])[0] = rslt.getString(12, 8);
               ((String[]) buf[14])[0] = rslt.getString(13, 28);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 40);
               ((String[]) buf[14])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(12);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 10 :
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
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

