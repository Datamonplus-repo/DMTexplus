package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ral0002_impl extends GXWebReport
{
   public ral0002_impl( com.genexus.internet.HttpContext context )
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
            AV16PTipArt = (short)(GXutil.lval( httpContext.GetPar( "PTipArt"))) ;
            AV17UTipArt = (short)(GXutil.lval( httpContext.GetPar( "UTipArt"))) ;
            AV18PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV19UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV20PSerCod = httpContext.GetPar( "PSerCod") ;
            AV21USerCod = httpContext.GetPar( "USerCod") ;
            AV22PColor = httpContext.GetPar( "PColor") ;
            AV23UColor = httpContext.GetPar( "UColor") ;
            AV24PColNum = (int)(GXutil.lval( httpContext.GetPar( "PColNum"))) ;
            AV25UColNum = (int)(GXutil.lval( httpContext.GetPar( "UColNum"))) ;
            AV26PDisCli = httpContext.GetPar( "PDisCli") ;
            AV27UDisCli = httpContext.GetPar( "UDisCli") ;
            AV28PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
            AV29UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
            AV87SOloTotal = (byte)(GXutil.lval( httpContext.GetPar( "SOloTotal"))) ;
            AV88BarItem1 = httpContext.GetPar( "BarItem1") ;
            AV89BarItem3 = httpContext.GetPar( "BarItem3") ;
            AV91Enccli1 = httpContext.GetPar( "Enccli1") ;
            AV92Enccli2 = httpContext.GetPar( "Enccli2") ;
            AV95Barmdlcod = httpContext.GetPar( "Barmdlcod") ;
            AV96BarItem5 = httpContext.GetPar( "BarItem5") ;
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
         GXt_char1 = AV38Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN069_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit0 = GXt_char1 ;
         GXt_char1 = AV39Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit1 = GXt_char1 ;
         GXt_char1 = AV40Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit2 = GXt_char1 ;
         GXt_char1 = AV41Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit3 = GXt_char1 ;
         GXt_char1 = AV42Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN428_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit4 = GXt_char1 ;
         GXt_char1 = AV43Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN506_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit5 = GXt_char1 ;
         GXt_char1 = AV44Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN438_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit6 = GXt_char1 ;
         GXt_char1 = AV45Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1376_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit7 = GXt_char1 ;
         GXt_char1 = AV46Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN323_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit8 = GXt_char1 ;
         GXt_char1 = AV47Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit9 = GXt_char1 ;
         GXt_char1 = AV48Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit10 = GXt_char1 ;
         GXt_char1 = AV49Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit11 = GXt_char1 ;
         GXt_char1 = AV50Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit12 = GXt_char1 ;
         GXt_char1 = AV51Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2130_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV51Lit13 = GXt_char1 ;
         GXt_char1 = AV52Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2423_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV52Lit14 = GXt_char1 ;
         GXt_char1 = AV53Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN403_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV53Lit15 = GXt_char1 ;
         GXt_char1 = AV54Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2130_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV54Lit16 = GXt_char1 ;
         GXt_char1 = AV55Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2423_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV55Lit17 = GXt_char1 ;
         GXt_char1 = AV56Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN403_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV56Lit18 = GXt_char1 ;
         GXt_char1 = AV57Lit19 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV57Lit19 = GXt_char1 ;
         GXt_char1 = AV58Lit20 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit20 = GXt_char1 ;
         GXt_char1 = AV59Lit21 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2447_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV59Lit21 = GXt_char1 ;
         AV69FlagLamina = (byte)(0) ;
         GXv_int3[0] = AV69FlagLamina ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LAMINA", ""), GXv_int3) ;
         ral0002_impl.this.AV69FlagLamina = GXv_int3[0] ;
         GXv_int3[0] = AV71NCorte ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCORTE", ""), GXv_int3) ;
         ral0002_impl.this.AV71NCorte = GXv_int3[0] ;
         GXt_int4 = AV79Moda21 ;
         GXv_int3[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int3) ;
         ral0002_impl.this.GXt_int4 = GXv_int3[0] ;
         AV79Moda21 = GXt_int4 ;
         GXt_int4 = AV86erfoc ;
         GXv_int3[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int3) ;
         ral0002_impl.this.GXt_int4 = GXv_int3[0] ;
         AV86erfoc = GXt_int4 ;
         GXt_int4 = AV93Enc20c ;
         GXv_int3[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "20ENCO", ""), GXv_int3) ;
         ral0002_impl.this.GXt_int4 = GXv_int3[0] ;
         AV93Enc20c = GXt_int4 ;
         GXt_int4 = AV97Etm ;
         GXv_int3[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM", ""), GXv_int3) ;
         ral0002_impl.this.GXt_int4 = GXv_int3[0] ;
         AV97Etm = GXt_int4 ;
         GXt_char1 = AV46Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1098_", ""), (byte)(99), GXv_char2) ;
         ral0002_impl.this.GXt_char1 = GXv_char2[0] ;
         GXt_char5 = AV46Lit8 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "20ENCO01", ""), (byte)(99), GXv_char6) ;
         ral0002_impl.this.GXt_char5 = GXv_char6[0] ;
         AV46Lit8 = ((AV93Enc20c==0) ? GXt_char1 : GXt_char5) ;
         AV46Lit8 = ((AV97Etm==1) ? httpContext.getMessage( "Enc Cli Refer.", "") : AV46Lit8) ;
         /* Using cursor P06LU2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06LU2_A407EmprNom[0] ;
            n407EmprNom = P06LU2_n407EmprNom[0] ;
            AV67NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV32TotKgsEnt = DecimalUtil.doubleToDec(0) ;
         AV33TotKgsSal = DecimalUtil.doubleToDec(0) ;
         AV35TotMtsEnt = DecimalUtil.doubleToDec(0) ;
         AV34TotMtsSal = DecimalUtil.doubleToDec(0) ;
         AV90Texto1 = " " ;
         /* Using cursor P06LU4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV18PCliCod), AV20PSerCod, Short.valueOf(AV16PTipArt), Short.valueOf(AV17UTipArt), AV21USerCod, AV22PColor, AV23UColor, Integer.valueOf(AV24PColNum), Integer.valueOf(AV25UColNum), Byte.valueOf(AV93Enc20c), AV26PDisCli, AV27UDisCli, Byte.valueOf(AV93Enc20c), AV91Enccli1, AV92Enccli2, AV28PFecha, AV29UFecha, AV88BarItem1, AV88BarItem1, AV89BarItem3, AV89BarItem3, AV95Barmdlcod, AV95Barmdlcod, AV96BarItem5, AV96BarItem5, Integer.valueOf(AV19UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6LU4 = false ;
            A361DisCod = P06LU4_A361DisCod[0] ;
            A213BarSit = P06LU4_A213BarSit[0] ;
            A9789BarItem5 = P06LU4_A9789BarItem5[0] ;
            A4609BarMdlCod = P06LU4_A4609BarMdlCod[0] ;
            A9777BarItem3 = P06LU4_A9777BarItem3[0] ;
            A9775BarItem1 = P06LU4_A9775BarItem1[0] ;
            A161BarFecSal = P06LU4_A161BarFecSal[0] ;
            A4812BarEncCli = P06LU4_A4812BarEncCli[0] ;
            A143BarDisNum = P06LU4_A143BarDisNum[0] ;
            A136BarColNum = P06LU4_A136BarColNum[0] ;
            A135BarColNom = P06LU4_A135BarColNom[0] ;
            A212BarSer = P06LU4_A212BarSer[0] ;
            A217BarTipArt = P06LU4_A217BarTipArt[0] ;
            n217BarTipArt = P06LU4_n217BarTipArt[0] ;
            A2827BarKgsLot = P06LU4_A2827BarKgsLot[0] ;
            A252CliCod = P06LU4_A252CliCod[0] ;
            n252CliCod = P06LU4_n252CliCod[0] ;
            A155BarFecCli = P06LU4_A155BarFecCli[0] ;
            A130BarCodPar = P06LU4_A130BarCodPar[0] ;
            A132BarCodReo = P06LU4_A132BarCodReo[0] ;
            A129BarCod = P06LU4_A129BarCod[0] ;
            A3841DisArtMer = P06LU4_A3841DisArtMer[0] ;
            A1234BarNomCli = P06LU4_A1234BarNomCli[0] ;
            A1652BarSerDsc = P06LU4_A1652BarSerDsc[0] ;
            A2010BarTipDis = P06LU4_A2010BarTipDis[0] ;
            A279CliNom = P06LU4_A279CliNom[0] ;
            A166BarKgm = P06LU4_A166BarKgm[0] ;
            A186BarMtrLan = P06LU4_A186BarMtrLan[0] ;
            A184BarMtr = P06LU4_A184BarMtr[0] ;
            A3841DisArtMer = P06LU4_A3841DisArtMer[0] ;
            A279CliNom = P06LU4_A279CliNom[0] ;
            A166BarKgm = P06LU4_A166BarKgm[0] ;
            A186BarMtrLan = P06LU4_A186BarMtrLan[0] ;
            A184BarMtr = P06LU4_A184BarMtr[0] ;
            h6LU0( false, 33) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 15, Gx_line+9, 60, Gx_line+26, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 66, Gx_line+9, 286, Gx_line+26, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
            AV85DisArtMer = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06LU4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06LU4_A252CliCod[0] == A252CliCod ) )
            {
               brk6LU4 = false ;
               A361DisCod = P06LU4_A361DisCod[0] ;
               A213BarSit = P06LU4_A213BarSit[0] ;
               A9789BarItem5 = P06LU4_A9789BarItem5[0] ;
               A4609BarMdlCod = P06LU4_A4609BarMdlCod[0] ;
               A9777BarItem3 = P06LU4_A9777BarItem3[0] ;
               A9775BarItem1 = P06LU4_A9775BarItem1[0] ;
               A161BarFecSal = P06LU4_A161BarFecSal[0] ;
               A4812BarEncCli = P06LU4_A4812BarEncCli[0] ;
               A143BarDisNum = P06LU4_A143BarDisNum[0] ;
               A136BarColNum = P06LU4_A136BarColNum[0] ;
               A135BarColNom = P06LU4_A135BarColNom[0] ;
               A212BarSer = P06LU4_A212BarSer[0] ;
               A217BarTipArt = P06LU4_A217BarTipArt[0] ;
               n217BarTipArt = P06LU4_n217BarTipArt[0] ;
               A2827BarKgsLot = P06LU4_A2827BarKgsLot[0] ;
               A155BarFecCli = P06LU4_A155BarFecCli[0] ;
               A130BarCodPar = P06LU4_A130BarCodPar[0] ;
               A132BarCodReo = P06LU4_A132BarCodReo[0] ;
               A129BarCod = P06LU4_A129BarCod[0] ;
               A3841DisArtMer = P06LU4_A3841DisArtMer[0] ;
               A1234BarNomCli = P06LU4_A1234BarNomCli[0] ;
               A1652BarSerDsc = P06LU4_A1652BarSerDsc[0] ;
               A2010BarTipDis = P06LU4_A2010BarTipDis[0] ;
               A3841DisArtMer = P06LU4_A3841DisArtMer[0] ;
               if ( GXutil.strcmp(A212BarSer, AV21USerCod) <= 0 )
               {
                  if ( GXutil.strcmp(A212BarSer, AV20PSerCod) >= 0 )
                  {
                     if ( ( A217BarTipArt >= AV16PTipArt ) && ( A217BarTipArt <= AV17UTipArt ) )
                     {
                        if ( ( GXutil.strcmp(A135BarColNom, AV22PColor) >= 0 ) && ( GXutil.strcmp(A135BarColNom, AV23UColor) <= 0 ) )
                        {
                           if ( ( A136BarColNum >= AV24PColNum ) && ( A136BarColNum <= AV25UColNum ) )
                           {
                              if ( ( ( AV93Enc20c == 0 ) && ( GXutil.strcmp(A143BarDisNum, AV26PDisCli) >= 0 ) && ( GXutil.strcmp(A143BarDisNum, AV27UDisCli) <= 0 ) ) || ( ( AV93Enc20c == 1 ) && ( GXutil.strcmp(A4812BarEncCli, AV91Enccli1) >= 0 ) && ( GXutil.strcmp(A4812BarEncCli, AV92Enccli2) <= 0 ) ) )
                              {
                                 if ( (( GXutil.resetTime(A161BarFecSal).after( GXutil.resetTime( AV28PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A161BarFecSal), GXutil.resetTime(AV28PFecha)) )) && (( GXutil.resetTime(A161BarFecSal).before( GXutil.resetTime( AV29UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A161BarFecSal), GXutil.resetTime(AV29UFecha)) )) )
                                 {
                                    if ( ( GXutil.strcmp(A9775BarItem1, AV88BarItem1) == 0 ) || (GXutil.strcmp("", AV88BarItem1)==0) )
                                    {
                                       if ( ( GXutil.strcmp(A9777BarItem3, AV89BarItem3) == 0 ) || (GXutil.strcmp("", AV89BarItem3)==0) )
                                       {
                                          if ( ( GXutil.strcmp(A4609BarMdlCod, AV95Barmdlcod) == 0 ) || (GXutil.strcmp("", AV95Barmdlcod)==0) )
                                          {
                                             if ( ( GXutil.strcmp(A9789BarItem5, AV96BarItem5) == 0 ) || (GXutil.strcmp("", AV96BarItem5)==0) )
                                             {
                                                if ( A213BarSit >= 9 )
                                                {
                                                   /* Using cursor P06LU6 */
                                                   pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                                   if ( (pr_default.getStatus(2) != 101) )
                                                   {
                                                      A166BarKgm = P06LU6_A166BarKgm[0] ;
                                                      A186BarMtrLan = P06LU6_A186BarMtrLan[0] ;
                                                      A184BarMtr = P06LU6_A184BarMtr[0] ;
                                                   }
                                                   else
                                                   {
                                                      A166BarKgm = DecimalUtil.doubleToDec(0) ;
                                                      A186BarMtrLan = DecimalUtil.doubleToDec(0) ;
                                                      A184BarMtr = DecimalUtil.doubleToDec(0) ;
                                                   }
                                                   pr_default.close(2);
                                                   AV76Mts_s = DecimalUtil.doubleToDec(0) ;
                                                   AV77Kgs_s = DecimalUtil.doubleToDec(0) ;
                                                   AV78Albbar = DecimalUtil.doubleToDec(0) ;
                                                   /* Using cursor P06LU7 */
                                                   pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                                   while ( (pr_default.getStatus(3) != 101) )
                                                   {
                                                      A1261BarAlbKgmE = P06LU7_A1261BarAlbKgmE[0] ;
                                                      A1263BarAlbMtrE = P06LU7_A1263BarAlbMtrE[0] ;
                                                      A2243BarKgsCli = P06LU7_A2243BarKgsCli[0] ;
                                                      n2243BarKgsCli = P06LU7_n2243BarKgsCli[0] ;
                                                      A1461BarAlbPN = P06LU7_A1461BarAlbPN[0] ;
                                                      A30AlbProCod = P06LU7_A30AlbProCod[0] ;
                                                      AV80BarAlbKgmE = A1261BarAlbKgmE ;
                                                      AV81BarAlbMtrE = A1263BarAlbMtrE ;
                                                      if ( AV79Moda21 == 1 )
                                                      {
                                                         if ( A2243BarKgsCli.doubleValue() != 0 )
                                                         {
                                                            AV80BarAlbKgmE = A2243BarKgsCli ;
                                                         }
                                                         if ( A1461BarAlbPN.doubleValue() != 0 )
                                                         {
                                                            AV81BarAlbMtrE = A1461BarAlbPN ;
                                                         }
                                                      }
                                                      AV76Mts_s = AV76Mts_s.add(AV81BarAlbMtrE) ;
                                                      AV77Kgs_s = AV77Kgs_s.add(AV80BarAlbKgmE) ;
                                                      AV78Albbar = DecimalUtil.doubleToDec(1) ;
                                                      pr_default.readNext(3);
                                                   }
                                                   pr_default.close(3);
                                                   if ( AV78Albbar.doubleValue() == 0 )
                                                   {
                                                      /* Optimized group. */
                                                      /* Using cursor P06LU8 */
                                                      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                                      c183BarMetLan = P06LU8_A183BarMetLan[0] ;
                                                      c170BarKilLan = P06LU8_A170BarKilLan[0] ;
                                                      pr_default.close(4);
                                                      AV76Mts_s = AV76Mts_s.add(c183BarMetLan) ;
                                                      AV77Kgs_s = AV77Kgs_s.add(c170BarKilLan) ;
                                                      /* End optimized group. */
                                                   }
                                                   AV70BarKgm = A166BarKgm ;
                                                   if ( ( A2827BarKgsLot.doubleValue() != 0 ) && ( AV69FlagLamina == 1 ) )
                                                   {
                                                      AV70BarKgm = A2827BarKgsLot ;
                                                   }
                                                   if ( AV71NCorte == 1 )
                                                   {
                                                      AV73CliCod = A252CliCod ;
                                                      AV74ArtCod = A212BarSer ;
                                                      /* Execute user subroutine: 'BUSCA_CORTES' */
                                                      S111 ();
                                                      if ( returnInSub )
                                                      {
                                                         pr_default.close(2);
                                                         pr_default.close(1);
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
                                                      AV75BarMtrLan = A186BarMtrLan.divide(DecimalUtil.doubleToDec((AV72ArtNumCor+1)), 18, java.math.RoundingMode.DOWN) ;
                                                   }
                                                   else
                                                   {
                                                      AV75BarMtrLan = AV76Mts_s ;
                                                   }
                                                   AV32TotKgsEnt = AV32TotKgsEnt.add(AV70BarKgm) ;
                                                   AV33TotKgsSal = AV33TotKgsSal.add(AV77Kgs_s) ;
                                                   AV35TotMtsEnt = AV35TotMtsEnt.add(A184BarMtr) ;
                                                   AV34TotMtsSal = AV34TotMtsSal.add(AV75BarMtrLan) ;
                                                   if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Kgs_s)==0) )
                                                   {
                                                      AV60DifKgs = AV77Kgs_s.subtract(AV70BarKgm) ;
                                                   }
                                                   else
                                                   {
                                                      AV60DifKgs = DecimalUtil.ZERO ;
                                                   }
                                                   if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70BarKgm)==0) )
                                                   {
                                                      AV61PorKgs = ((AV60DifKgs.divide(AV70BarKgm, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
                                                   }
                                                   else
                                                   {
                                                      AV61PorKgs = DecimalUtil.ZERO ;
                                                   }
                                                   if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75BarMtrLan)==0) )
                                                   {
                                                      AV62DifMts = AV75BarMtrLan.subtract(A184BarMtr) ;
                                                   }
                                                   else
                                                   {
                                                      AV62DifMts = DecimalUtil.ZERO ;
                                                   }
                                                   if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A184BarMtr)==0) )
                                                   {
                                                      AV63PorMts = ((AV62DifMts.divide(A184BarMtr, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
                                                   }
                                                   else
                                                   {
                                                      AV63PorMts = DecimalUtil.ZERO ;
                                                   }
                                                   AV94BarEnccli = ((AV93Enc20c==0) ? A143BarDisNum : A4812BarEncCli) ;
                                                   AV94BarEnccli = ((AV97Etm==1) ? A143BarDisNum+" "+GXutil.trim( A9789BarItem5) : AV94BarEnccli) ;
                                                   if ( ( ( AV86erfoc == 1 ) && ( AV87SOloTotal == 0 ) ) || ( ( AV86erfoc == 0 ) ) )
                                                   {
                                                      h6LU0( false, 17) ;
                                                      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 7, Gx_line+0, 66, Gx_line+17, 2+256, 0, 0, 0) ;
                                                      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 71, Gx_line+0, 79, Gx_line+17, 2+256, 0, 0, 0) ;
                                                      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 82, Gx_line+0, 90, Gx_line+17, 0+256, 0, 0, 0) ;
                                                      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9")), 94, Gx_line+0, 124, Gx_line+17, 2+256, 0, 0, 0) ;
                                                      getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94BarEnccli, "")), 127, Gx_line+2, 232, Gx_line+16, 0+256, 0, 0, 0) ;
                                                      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 234, Gx_line+0, 352, Gx_line+17, 0+256, 0, 0, 0) ;
                                                      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 358, Gx_line+0, 454, Gx_line+17, 0+256, 0, 0, 0) ;
                                                      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 460, Gx_line+0, 505, Gx_line+17, 2+256, 0, 0, 0) ;
                                                      getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 511, Gx_line+0, 570, Gx_line+17, 0+256, 0, 0, 0) ;
                                                      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV70BarKgm, "ZZZZZ9.99")), 577, Gx_line+0, 644, Gx_line+17, 2+256, 0, 0, 0) ;
                                                      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV77Kgs_s, "ZZZZZ9.99")), 651, Gx_line+0, 718, Gx_line+17, 2+256, 0, 0, 0) ;
                                                      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60DifKgs, "ZZZZZ9.99")), 733, Gx_line+0, 800, Gx_line+17, 2+256, 0, 0, 0) ;
                                                      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV61PorKgs, "ZZ9.99")), 804, Gx_line+1, 849, Gx_line+17, 2+256, 0, 0, 0) ;
                                                      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")), 859, Gx_line+0, 926, Gx_line+17, 2+256, 0, 0, 0) ;
                                                      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75BarMtrLan, "ZZZZZ9.99")), 931, Gx_line+0, 998, Gx_line+17, 2+256, 0, 0, 0) ;
                                                      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62DifMts, "ZZZZZZ9.99")), 1002, Gx_line+0, 1076, Gx_line+17, 2+256, 0, 0, 0) ;
                                                      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63PorMts, "ZZ9.99")), 1081, Gx_line+0, 1126, Gx_line+16, 2+256, 0, 0, 0) ;
                                                      Gx_OldLine = Gx_line ;
                                                      Gx_line = (int)(Gx_line+17) ;
                                                      h6LU0( false, 17) ;
                                                      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 234, Gx_line+1, 377, Gx_line+17, 0, 0, 0, 0) ;
                                                      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 386, Gx_line+1, 482, Gx_line+18, 0+256, 0, 0, 0) ;
                                                      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3841DisArtMer, "Z9.99")), 840, Gx_line+1, 877, Gx_line+18, 2+256, 0, 0, 0) ;
                                                      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9775BarItem1, "")), 498, Gx_line+1, 645, Gx_line+18, 0+256, 0, 0, 0) ;
                                                      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9777BarItem3, "")), 650, Gx_line+1, 797, Gx_line+18, 0+256, 0, 0, 0) ;
                                                      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4609BarMdlCod, "")), 910, Gx_line+1, 1006, Gx_line+18, 0+256, 0, 0, 0) ;
                                                      Gx_OldLine = Gx_line ;
                                                      Gx_line = (int)(Gx_line+17) ;
                                                   }
                                                   AV82Tot_pk = AV82Tot_pk.add(AV61PorKgs) ;
                                                   if ( AV61PorKgs.doubleValue() != 0 )
                                                   {
                                                      AV83Tot_rg = (int)(AV83Tot_rg+1) ;
                                                   }
                                                   if ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "A", "")) != 0 )
                                                   {
                                                      if ( DecimalUtil.compareTo(A3841DisArtMer, AV85DisArtMer) > 0 )
                                                      {
                                                         AV85DisArtMer = A3841DisArtMer ;
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
               brk6LU4 = true ;
               pr_default.readNext(1);
            }
            if ( ( AV86erfoc == 1 ) && ( GXutil.strcmp(AV89BarItem3, " ") != 0 ) && ( AV87SOloTotal == 1 ) )
            {
               AV90Texto1 = httpContext.getMessage( "Artigo ", "") + A1652BarSerDsc ;
            }
            if ( ! brk6LU4 )
            {
               brk6LU4 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         if ( ( AV32TotKgsEnt.doubleValue() == 0 ) && ( AV35TotMtsEnt.doubleValue() == 0 ) )
         {
         }
         else
         {
            AV64TotKDif = AV33TotKgsSal.subtract(AV32TotKgsEnt) ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TotKgsEnt)==0) )
            {
               AV61PorKgs = ((AV64TotKDif.divide(AV32TotKgsEnt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
            }
            else
            {
               AV61PorKgs = DecimalUtil.ZERO ;
            }
            AV65TotMDif = AV34TotMtsSal.subtract(AV35TotMtsEnt) ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TotMtsEnt)==0) )
            {
               AV63PorMts = ((AV65TotMDif.divide(AV35TotMtsEnt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
            }
            else
            {
               AV63PorMts = DecimalUtil.ZERO ;
            }
            AV84Md = DecimalUtil.doubleToDec(0) ;
            if ( AV83Tot_rg > 0 )
            {
               AV84Md = AV82Tot_pk.divide(DecimalUtil.doubleToDec(AV83Tot_rg), 18, java.math.RoundingMode.DOWN) ;
            }
            h6LU0( false, 24) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit21, "")), 306, Gx_line+6, 373, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TotKgsEnt, "ZZZZZ9.99")), 577, Gx_line+6, 644, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TotKgsSal, "ZZZZZ9.99")), 651, Gx_line+6, 718, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64TotKDif, "ZZZZZZ9.99")), 726, Gx_line+6, 800, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV61PorKgs, "ZZ9.99")), 800, Gx_line+7, 845, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TotMtsEnt, "ZZZZZZ9.99")), 846, Gx_line+6, 920, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TotMtsSal, "ZZZZZZ9.99")), 924, Gx_line+6, 998, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV65TotMDif, "ZZZZZZ9.99")), 1002, Gx_line+6, 1076, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63PorMts, "ZZ9.99")), 1081, Gx_line+6, 1126, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(577, Gx_line+0, 1107, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+24) ;
            if ( AV86erfoc == 1 )
            {
               if ( AV87SOloTotal == 1 )
               {
                  if ( GXutil.strcmp(AV89BarItem3, " ") != 0 )
                  {
                     AV90Texto1 += " " + httpContext.getMessage( "OV = ", "") + AV89BarItem3 ;
                  }
               }
               h6LU0( false, 39) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Md, "ZZZZ9.99")), 767, Gx_line+0, 826, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV85DisArtMer, "Z9.99")), 789, Gx_line+20, 826, Gx_line+37, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Media :", ""), 702, Gx_line+0, 754, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Media Teorica:", ""), 652, Gx_line+20, 755, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Texto1, "")), 6, Gx_line+20, 590, Gx_line+37, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+39) ;
            }
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6LU0( true, 0) ;
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
      /* 'BUSCA_CORTES' Routine */
      returnInSub = false ;
      AV72ArtNumCor = (short)(0) ;
      /* Using cursor P06LU9 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV73CliCod), AV74ArtCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A65ArtCod = P06LU9_A65ArtCod[0] ;
         A252CliCod = P06LU9_A252CliCod[0] ;
         n252CliCod = P06LU9_n252CliCod[0] ;
         A3121ArtNumCor = P06LU9_A3121ArtNumCor[0] ;
         n3121ArtNumCor = P06LU9_n3121ArtNumCor[0] ;
         AV72ArtNumCor = A3121ArtNumCor ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void h6LU0( boolean bFoot ,
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
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit1, "")), 807, Gx_line+7, 844, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 858, Gx_line+7, 917, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit2, "")), 939, Gx_line+7, 969, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 990, Gx_line+7, 1049, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit0, "")), 7, Gx_line+33, 132, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit3, "")), 939, Gx_line+32, 984, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1004, Gx_line+32, 1049, Gx_line+49, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit19, "")), 684, Gx_line+67, 721, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit20, "")), 966, Gx_line+67, 1011, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 822, Gx_line+83, 830, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 1099, Gx_line+83, 1107, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit4, "")), 7, Gx_line+83, 81, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit8, "")), 127, Gx_line+83, 231, Gx_line+99, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit9, "")), 234, Gx_line+83, 271, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit10, "")), 358, Gx_line+83, 395, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit11, "")), 460, Gx_line+83, 505, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit12, "")), 511, Gx_line+83, 548, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit13, "")), 592, Gx_line+83, 644, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit14, "")), 666, Gx_line+83, 718, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit15, "")), 763, Gx_line+83, 800, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit16, "")), 859, Gx_line+83, 911, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit17, "")), 946, Gx_line+83, 998, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit18, "")), 1039, Gx_line+83, 1076, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(1, Gx_line+56, 1125, Gx_line+56, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67NomEmp, "")), 7, Gx_line+7, 227, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(740, Gx_line+74, 848, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(577, Gx_line+74, 669, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(857, Gx_line+74, 950, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1031, Gx_line+74, 1103, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Pgmname, "")), 807, Gx_line+32, 1027, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+103, 89, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(94, Gx_line+103, 123, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(128, Gx_line+103, 232, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(234, Gx_line+103, 351, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(358, Gx_line+103, 453, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(460, Gx_line+103, 504, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(511, Gx_line+103, 569, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(577, Gx_line+103, 643, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(651, Gx_line+103, 717, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(733, Gx_line+103, 799, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(800, Gx_line+103, 844, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(859, Gx_line+103, 925, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(931, Gx_line+103, 997, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1024, Gx_line+103, 1075, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1081, Gx_line+103, 1125, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TArt", ""), 94, Gx_line+84, 124, Gx_line+100, 0+256, 0, 0, 0) ;
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
      AV20PSerCod = "" ;
      AV21USerCod = "" ;
      AV22PColor = "" ;
      AV23UColor = "" ;
      AV26PDisCli = "" ;
      AV27UDisCli = "" ;
      AV28PFecha = GXutil.nullDate() ;
      AV29UFecha = GXutil.nullDate() ;
      AV88BarItem1 = "" ;
      AV89BarItem3 = "" ;
      AV91Enccli1 = "" ;
      AV92Enccli2 = "" ;
      AV95Barmdlcod = "" ;
      AV96BarItem5 = "" ;
      AV38Lit0 = "" ;
      AV39Lit1 = "" ;
      AV40Lit2 = "" ;
      AV41Lit3 = "" ;
      AV42Lit4 = "" ;
      AV43Lit5 = "" ;
      AV44Lit6 = "" ;
      AV45Lit7 = "" ;
      AV46Lit8 = "" ;
      AV47Lit9 = "" ;
      AV48Lit10 = "" ;
      AV49Lit11 = "" ;
      AV50Lit12 = "" ;
      AV51Lit13 = "" ;
      AV52Lit14 = "" ;
      AV53Lit15 = "" ;
      AV54Lit16 = "" ;
      AV55Lit17 = "" ;
      AV56Lit18 = "" ;
      AV57Lit19 = "" ;
      AV58Lit20 = "" ;
      AV59Lit21 = "" ;
      GXv_int3 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char5 = "" ;
      GXv_char6 = new String[1] ;
      scmdbuf = "" ;
      P06LU2_A396EmprCod = new String[] {""} ;
      P06LU2_A407EmprNom = new String[] {""} ;
      P06LU2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV67NomEmp = "" ;
      AV32TotKgsEnt = DecimalUtil.ZERO ;
      AV33TotKgsSal = DecimalUtil.ZERO ;
      AV35TotMtsEnt = DecimalUtil.ZERO ;
      AV34TotMtsSal = DecimalUtil.ZERO ;
      AV90Texto1 = "" ;
      P06LU4_A361DisCod = new int[1] ;
      P06LU4_A396EmprCod = new String[] {""} ;
      P06LU4_A213BarSit = new byte[1] ;
      P06LU4_A9789BarItem5 = new String[] {""} ;
      P06LU4_A4609BarMdlCod = new String[] {""} ;
      P06LU4_A9777BarItem3 = new String[] {""} ;
      P06LU4_A9775BarItem1 = new String[] {""} ;
      P06LU4_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P06LU4_A4812BarEncCli = new String[] {""} ;
      P06LU4_A143BarDisNum = new String[] {""} ;
      P06LU4_A136BarColNum = new int[1] ;
      P06LU4_A135BarColNom = new String[] {""} ;
      P06LU4_A212BarSer = new String[] {""} ;
      P06LU4_A217BarTipArt = new short[1] ;
      P06LU4_n217BarTipArt = new boolean[] {false} ;
      P06LU4_A2827BarKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LU4_A252CliCod = new int[1] ;
      P06LU4_n252CliCod = new boolean[] {false} ;
      P06LU4_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P06LU4_A130BarCodPar = new String[] {""} ;
      P06LU4_A132BarCodReo = new byte[1] ;
      P06LU4_A129BarCod = new int[1] ;
      P06LU4_A3841DisArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LU4_A1234BarNomCli = new String[] {""} ;
      P06LU4_A1652BarSerDsc = new String[] {""} ;
      P06LU4_A2010BarTipDis = new String[] {""} ;
      P06LU4_A279CliNom = new String[] {""} ;
      P06LU4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LU4_A186BarMtrLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LU4_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9789BarItem5 = "" ;
      A4609BarMdlCod = "" ;
      A9777BarItem3 = "" ;
      A9775BarItem1 = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A2827BarKgsLot = DecimalUtil.ZERO ;
      A155BarFecCli = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A3841DisArtMer = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A1652BarSerDsc = "" ;
      A2010BarTipDis = "" ;
      A279CliNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A186BarMtrLan = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV85DisArtMer = DecimalUtil.ZERO ;
      P06LU6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LU6_A186BarMtrLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LU6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV76Mts_s = DecimalUtil.ZERO ;
      AV77Kgs_s = DecimalUtil.ZERO ;
      AV78Albbar = DecimalUtil.ZERO ;
      P06LU7_A396EmprCod = new String[] {""} ;
      P06LU7_A129BarCod = new int[1] ;
      P06LU7_A132BarCodReo = new byte[1] ;
      P06LU7_A130BarCodPar = new String[] {""} ;
      P06LU7_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LU7_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LU7_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LU7_n2243BarKgsCli = new boolean[] {false} ;
      P06LU7_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LU7_A30AlbProCod = new long[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      AV80BarAlbKgmE = DecimalUtil.ZERO ;
      AV81BarAlbMtrE = DecimalUtil.ZERO ;
      c183BarMetLan = DecimalUtil.ZERO ;
      c170BarKilLan = DecimalUtil.ZERO ;
      P06LU8_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LU8_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV70BarKgm = DecimalUtil.ZERO ;
      AV74ArtCod = "" ;
      AV75BarMtrLan = DecimalUtil.ZERO ;
      AV60DifKgs = DecimalUtil.ZERO ;
      AV61PorKgs = DecimalUtil.ZERO ;
      AV62DifMts = DecimalUtil.ZERO ;
      AV63PorMts = DecimalUtil.ZERO ;
      AV94BarEnccli = "" ;
      AV82Tot_pk = DecimalUtil.ZERO ;
      AV64TotKDif = DecimalUtil.ZERO ;
      AV65TotMDif = DecimalUtil.ZERO ;
      AV84Md = DecimalUtil.ZERO ;
      P06LU9_A396EmprCod = new String[] {""} ;
      P06LU9_A65ArtCod = new String[] {""} ;
      P06LU9_A252CliCod = new int[1] ;
      P06LU9_n252CliCod = new boolean[] {false} ;
      P06LU9_A3121ArtNumCor = new short[1] ;
      P06LU9_n3121ArtNumCor = new boolean[] {false} ;
      A65ArtCod = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV104Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ral0002__default(),
         new Object[] {
             new Object[] {
            P06LU2_A396EmprCod, P06LU2_A407EmprNom, P06LU2_n407EmprNom
            }
            , new Object[] {
            P06LU4_A361DisCod, P06LU4_A396EmprCod, P06LU4_A213BarSit, P06LU4_A9789BarItem5, P06LU4_A4609BarMdlCod, P06LU4_A9777BarItem3, P06LU4_A9775BarItem1, P06LU4_A161BarFecSal, P06LU4_A4812BarEncCli, P06LU4_A143BarDisNum,
            P06LU4_A136BarColNum, P06LU4_A135BarColNom, P06LU4_A212BarSer, P06LU4_A217BarTipArt, P06LU4_n217BarTipArt, P06LU4_A2827BarKgsLot, P06LU4_A252CliCod, P06LU4_n252CliCod, P06LU4_A155BarFecCli, P06LU4_A130BarCodPar,
            P06LU4_A132BarCodReo, P06LU4_A129BarCod, P06LU4_A3841DisArtMer, P06LU4_A1234BarNomCli, P06LU4_A1652BarSerDsc, P06LU4_A2010BarTipDis, P06LU4_A279CliNom, P06LU4_A166BarKgm, P06LU4_A186BarMtrLan, P06LU4_A184BarMtr
            }
            , new Object[] {
            P06LU6_A166BarKgm, P06LU6_A186BarMtrLan, P06LU6_A184BarMtr
            }
            , new Object[] {
            P06LU7_A396EmprCod, P06LU7_A129BarCod, P06LU7_A132BarCodReo, P06LU7_A130BarCodPar, P06LU7_A1261BarAlbKgmE, P06LU7_A1263BarAlbMtrE, P06LU7_A2243BarKgsCli, P06LU7_n2243BarKgsCli, P06LU7_A1461BarAlbPN, P06LU7_A30AlbProCod
            }
            , new Object[] {
            P06LU8_A183BarMetLan, P06LU8_A170BarKilLan
            }
            , new Object[] {
            P06LU9_A396EmprCod, P06LU9_A65ArtCod, P06LU9_A252CliCod, P06LU9_A3121ArtNumCor, P06LU9_n3121ArtNumCor
            }
         }
      );
      AV104Pgmname = "RAL0002" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV104Pgmname = "RAL0002" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV87SOloTotal ;
   private byte AV69FlagLamina ;
   private byte AV71NCorte ;
   private byte AV79Moda21 ;
   private byte AV86erfoc ;
   private byte AV93Enc20c ;
   private byte AV97Etm ;
   private byte GXt_int4 ;
   private byte GXv_int3[] ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short AV16PTipArt ;
   private short AV17UTipArt ;
   private short A217BarTipArt ;
   private short AV72ArtNumCor ;
   private short A3121ArtNumCor ;
   private short Gx_err ;
   private int AV18PCliCod ;
   private int AV19UCliCod ;
   private int AV24PColNum ;
   private int AV25UColNum ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int Gx_OldLine ;
   private int AV73CliCod ;
   private int AV83Tot_rg ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV32TotKgsEnt ;
   private java.math.BigDecimal AV33TotKgsSal ;
   private java.math.BigDecimal AV35TotMtsEnt ;
   private java.math.BigDecimal AV34TotMtsSal ;
   private java.math.BigDecimal A2827BarKgsLot ;
   private java.math.BigDecimal A3841DisArtMer ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A186BarMtrLan ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV85DisArtMer ;
   private java.math.BigDecimal AV76Mts_s ;
   private java.math.BigDecimal AV77Kgs_s ;
   private java.math.BigDecimal AV78Albbar ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal AV80BarAlbKgmE ;
   private java.math.BigDecimal AV81BarAlbMtrE ;
   private java.math.BigDecimal c183BarMetLan ;
   private java.math.BigDecimal c170BarKilLan ;
   private java.math.BigDecimal AV70BarKgm ;
   private java.math.BigDecimal AV75BarMtrLan ;
   private java.math.BigDecimal AV60DifKgs ;
   private java.math.BigDecimal AV61PorKgs ;
   private java.math.BigDecimal AV62DifMts ;
   private java.math.BigDecimal AV63PorMts ;
   private java.math.BigDecimal AV82Tot_pk ;
   private java.math.BigDecimal AV64TotKDif ;
   private java.math.BigDecimal AV65TotMDif ;
   private java.math.BigDecimal AV84Md ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV20PSerCod ;
   private String AV21USerCod ;
   private String AV22PColor ;
   private String AV23UColor ;
   private String AV26PDisCli ;
   private String AV27UDisCli ;
   private String AV88BarItem1 ;
   private String AV89BarItem3 ;
   private String AV91Enccli1 ;
   private String AV92Enccli2 ;
   private String AV95Barmdlcod ;
   private String AV96BarItem5 ;
   private String AV38Lit0 ;
   private String AV39Lit1 ;
   private String AV40Lit2 ;
   private String AV41Lit3 ;
   private String AV42Lit4 ;
   private String AV43Lit5 ;
   private String AV44Lit6 ;
   private String AV45Lit7 ;
   private String AV46Lit8 ;
   private String AV47Lit9 ;
   private String AV48Lit10 ;
   private String AV49Lit11 ;
   private String AV50Lit12 ;
   private String AV51Lit13 ;
   private String AV52Lit14 ;
   private String AV53Lit15 ;
   private String AV54Lit16 ;
   private String AV55Lit17 ;
   private String AV56Lit18 ;
   private String AV57Lit19 ;
   private String AV58Lit20 ;
   private String AV59Lit21 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV67NomEmp ;
   private String AV90Texto1 ;
   private String A9789BarItem5 ;
   private String A4609BarMdlCod ;
   private String A9777BarItem3 ;
   private String A9775BarItem1 ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String A1234BarNomCli ;
   private String A1652BarSerDsc ;
   private String A2010BarTipDis ;
   private String A279CliNom ;
   private String AV74ArtCod ;
   private String AV94BarEnccli ;
   private String A65ArtCod ;
   private String Gx_time ;
   private String AV104Pgmname ;
   private java.util.Date AV28PFecha ;
   private java.util.Date AV29UFecha ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk6LU4 ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n2243BarKgsCli ;
   private boolean returnInSub ;
   private boolean n3121ArtNumCor ;
   private IDataStoreProvider pr_default ;
   private String[] P06LU2_A396EmprCod ;
   private String[] P06LU2_A407EmprNom ;
   private boolean[] P06LU2_n407EmprNom ;
   private int[] P06LU4_A361DisCod ;
   private String[] P06LU4_A396EmprCod ;
   private byte[] P06LU4_A213BarSit ;
   private String[] P06LU4_A9789BarItem5 ;
   private String[] P06LU4_A4609BarMdlCod ;
   private String[] P06LU4_A9777BarItem3 ;
   private String[] P06LU4_A9775BarItem1 ;
   private java.util.Date[] P06LU4_A161BarFecSal ;
   private String[] P06LU4_A4812BarEncCli ;
   private String[] P06LU4_A143BarDisNum ;
   private int[] P06LU4_A136BarColNum ;
   private String[] P06LU4_A135BarColNom ;
   private String[] P06LU4_A212BarSer ;
   private short[] P06LU4_A217BarTipArt ;
   private boolean[] P06LU4_n217BarTipArt ;
   private java.math.BigDecimal[] P06LU4_A2827BarKgsLot ;
   private int[] P06LU4_A252CliCod ;
   private boolean[] P06LU4_n252CliCod ;
   private java.util.Date[] P06LU4_A155BarFecCli ;
   private String[] P06LU4_A130BarCodPar ;
   private byte[] P06LU4_A132BarCodReo ;
   private int[] P06LU4_A129BarCod ;
   private java.math.BigDecimal[] P06LU4_A3841DisArtMer ;
   private String[] P06LU4_A1234BarNomCli ;
   private String[] P06LU4_A1652BarSerDsc ;
   private String[] P06LU4_A2010BarTipDis ;
   private String[] P06LU4_A279CliNom ;
   private java.math.BigDecimal[] P06LU4_A166BarKgm ;
   private java.math.BigDecimal[] P06LU4_A186BarMtrLan ;
   private java.math.BigDecimal[] P06LU4_A184BarMtr ;
   private java.math.BigDecimal[] P06LU6_A166BarKgm ;
   private java.math.BigDecimal[] P06LU6_A186BarMtrLan ;
   private java.math.BigDecimal[] P06LU6_A184BarMtr ;
   private String[] P06LU7_A396EmprCod ;
   private int[] P06LU7_A129BarCod ;
   private byte[] P06LU7_A132BarCodReo ;
   private String[] P06LU7_A130BarCodPar ;
   private java.math.BigDecimal[] P06LU7_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P06LU7_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P06LU7_A2243BarKgsCli ;
   private boolean[] P06LU7_n2243BarKgsCli ;
   private java.math.BigDecimal[] P06LU7_A1461BarAlbPN ;
   private long[] P06LU7_A30AlbProCod ;
   private java.math.BigDecimal[] P06LU8_A183BarMetLan ;
   private java.math.BigDecimal[] P06LU8_A170BarKilLan ;
   private String[] P06LU9_A396EmprCod ;
   private String[] P06LU9_A65ArtCod ;
   private int[] P06LU9_A252CliCod ;
   private boolean[] P06LU9_n252CliCod ;
   private short[] P06LU9_A3121ArtNumCor ;
   private boolean[] P06LU9_n3121ArtNumCor ;
}

final  class ral0002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06LU2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06LU4", "SELECT T1.DisCod, T1.EmprCod, T1.BarSit, T1.BarItem5, T1.BarMdlCod, T1.BarItem3, T1.BarItem1, T1.BarFecSal, T1.BarEncCli, T1.BarDisNum, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.BarTipArt, T1.BarKgsLot, T1.CliCod, T1.BarFecCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.DisArtMer, T1.BarNomCli, T1.BarSerDsc, T1.BarTipDis, T3.CliNom, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T4.BarMtrLan, 0) AS BarMtrLan, COALESCE( T4.BarMtr, 0) AS BarMtr FROM (((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarMetLan) AS BarMtrLan, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.BarSer >= ?) AND (T1.BarTipArt >= ? and T1.BarTipArt <= ?) AND (T1.BarSer <= ?) AND (T1.BarColNom >= ? and T1.BarColNom <= ?) AND (T1.BarColNum >= ? and T1.BarColNum <= ?) AND (( ? = 0 and T1.BarDisNum >= ? and T1.BarDisNum <= ?) or ( ? = 1 and T1.BarEncCli >= ? and T1.BarEncCli <= ?)) AND (T1.BarFecSal >= ? and T1.BarFecSal <= ?) AND (T1.BarItem1 = ? or (rtrim(?) IS NULL)) AND (T1.BarItem3 = ? or (rtrim(?) IS NULL)) AND (T1.BarMdlCod = ? or (rtrim(?) IS NULL)) AND (T1.BarItem5 = ? or (rtrim(?) IS NULL)) AND (T1.BarSit >= 9) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LU6", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm, COALESCE( T1.BarMtrLan, 0) AS BarMtrLan, COALESCE( T1.BarMtr, 0) AS BarMtr FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarMetLan) AS BarMtrLan, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LU7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAlbKgmE, BarAlbMtrE, BarKgsCli, BarAlbPN, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LU8", "SELECT SUM(BarMetLan) AS BarMtrLan, SUM(BarKilLan) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LU9", "SELECT EmprCod, ArtCod, CliCod, ArtNumCor FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getString(13, 16);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((int[]) buf[21])[0] = rslt.getInt(20);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((String[]) buf[23])[0] = rslt.getString(22, 13);
               ((String[]) buf[24])[0] = rslt.getString(23, 26);
               ((String[]) buf[25])[0] = rslt.getString(24, 1);
               ((String[]) buf[26])[0] = rslt.getString(25, 30);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(27,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(28,2);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((long[]) buf[9])[0] = rslt.getLong(9);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setString(8, (String)parms[7], 13);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 8);
               stmt.setString(13, (String)parms[12], 8);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 20);
               stmt.setString(16, (String)parms[15], 20);
               stmt.setDate(17, (java.util.Date)parms[16]);
               stmt.setDate(18, (java.util.Date)parms[17]);
               stmt.setString(19, (String)parms[18], 20);
               stmt.setString(20, (String)parms[19], 20);
               stmt.setString(21, (String)parms[20], 20);
               stmt.setString(22, (String)parms[21], 20);
               stmt.setString(23, (String)parms[22], 13);
               stmt.setString(24, (String)parms[23], 13);
               stmt.setString(25, (String)parms[24], 20);
               stmt.setString(26, (String)parms[25], 20);
               stmt.setInt(27, ((Number) parms[26]).intValue());
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
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

