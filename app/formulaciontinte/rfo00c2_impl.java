package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rfo00c2_impl extends GXWebReport
{
   public rfo00c2_impl( com.genexus.internet.HttpContext context )
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
            AV66Station = httpContext.GetPar( "Station") ;
            AV16PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV17UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV18PSerie = httpContext.GetPar( "PSerie") ;
            AV19USerie = httpContext.GetPar( "USerie") ;
            AV20PColor = (int)(GXutil.lval( httpContext.GetPar( "PColor"))) ;
            AV21UColor = (int)(GXutil.lval( httpContext.GetPar( "UColor"))) ;
            AV22PNumCol = httpContext.GetPar( "PNumCol") ;
            AV23UNumCol = httpContext.GetPar( "UNumCol") ;
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         GXt_char1 = AV32Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN068_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit0 = GXt_char1 ;
         GXt_char1 = AV33Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit1 = GXt_char1 ;
         GXt_char1 = AV34Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit2 = GXt_char1 ;
         GXt_char1 = AV35Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit3 = GXt_char1 ;
         GXt_char1 = AV36Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit4 = GXt_char1 ;
         GXt_char1 = AV37Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1355_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit5 = GXt_char1 ;
         GXt_char1 = AV38Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN387_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit6 = GXt_char1 ;
         GXt_char1 = AV39Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN437_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit7 = GXt_char1 ;
         GXt_char1 = AV40Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2385_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit8 = GXt_char1 ;
         GXt_char1 = AV41Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2145_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit9 = GXt_char1 ;
         GXt_char1 = AV42Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN368_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit10 = GXt_char1 ;
         GXt_char1 = AV43Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN210_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit11 = GXt_char1 ;
         GXt_char1 = AV44Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1334_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit12 = GXt_char1 ;
         GXt_char1 = AV45Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN203_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit13 = GXt_char1 ;
         GXt_char1 = AV49Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit14 = GXt_char1 ;
         GXt_char1 = AV50Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN076_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit15 = GXt_char1 ;
         GXt_char1 = AV51Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2458_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV51Lit16 = GXt_char1 ;
         GXt_char1 = AV61Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV61Lit17 = GXt_char1 ;
         GXt_char1 = AV62Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1193_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV62Lit18 = GXt_char1 ;
         GXt_char1 = AV72Lit45 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT188_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV72Lit45 = GXt_char1 ;
         GXt_char1 = AV84Lit46 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT118_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV84Lit46 = GXt_char1 ;
         GXt_char1 = AV85Lit47 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN203", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV85Lit47 = GXt_char1 ;
         GXt_char1 = AV100Lit50 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN204", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV100Lit50 = GXt_char1 ;
         /* Using cursor P070J2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P070J2_A407EmprNom[0] ;
            n407EmprNom = P070J2_n407EmprNom[0] ;
            AV24NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXv_int3[0] = AV56FlagIdioma ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100001", GXv_int3) ;
         rfo00c2_impl.this.AV56FlagIdioma = GXv_int3[0] ;
         GXt_int4 = AV89Texfina ;
         GXv_int3[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int3) ;
         rfo00c2_impl.this.GXt_int4 = GXv_int3[0] ;
         AV89Texfina = GXt_int4 ;
         GXt_int4 = AV90carvema ;
         GXv_int3[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int3) ;
         rfo00c2_impl.this.GXt_int4 = GXv_int3[0] ;
         AV90carvema = GXt_int4 ;
         GXt_char1 = AV103Lit71 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT324_", ""), (byte)(99), GXv_char2) ;
         rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV103Lit71 = GXt_char1 ;
         AV103Lit71 = ((AV90carvema==1) ? AV103Lit71 : " ") ;
         AV57Var1 = httpContext.getMessage( "COLOR CLIENTE", "") ;
         AV58Var2 = httpContext.getMessage( "MUESTRA CLIENTE", "") ;
         AV59Var3 = " " ;
         if ( AV56FlagIdioma == 1 )
         {
            AV57Var1 = httpContext.getMessage( "COR CLIENTE", "") ;
            if ( AV60FlagTintex == 0 )
            {
               AV58Var2 = httpContext.getMessage( "AMOSTRA CLIENTE", "") ;
            }
            else
            {
               AV58Var2 = httpContext.getMessage( "AMOSTRA TINTEX", "") ;
            }
            AV59Var3 = httpContext.getMessage( "Processado por Computador", "") ;
         }
         AV91Lit53 = " " ;
         if ( AV90carvema == 1 )
         {
            GXt_char1 = AV91Lit53 ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJVR003_", ""), (byte)(99), GXv_char2) ;
            rfo00c2_impl.this.GXt_char1 = GXv_char2[0] ;
            AV91Lit53 = GXt_char1 ;
            AV57Var1 = "" ;
            AV58Var2 = "" ;
         }
         /* Using cursor P070J4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16PCliCod), AV18PSerie, AV22PNumCol, Integer.valueOf(AV20PColor), AV19USerie, Integer.valueOf(AV21UColor), AV23UNumCol, Integer.valueOf(AV17UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3316CodSol = P070J4_A3316CodSol[0] ;
            n3316CodSol = P070J4_n3316CodSol[0] ;
            A831TipColCod = P070J4_A831TipColCod[0] ;
            A483ForColNum = P070J4_A483ForColNum[0] ;
            A482ForColNom = P070J4_A482ForColNom[0] ;
            A494ForSer = P070J4_A494ForSer[0] ;
            A252CliCod = P070J4_A252CliCod[0] ;
            A279CliNom = P070J4_A279CliNom[0] ;
            A5742ForSerDsc = P070J4_A5742ForSerDsc[0] ;
            n5742ForSerDsc = P070J4_n5742ForSerDsc[0] ;
            A832TipColDsc = P070J4_A832TipColDsc[0] ;
            n832TipColDsc = P070J4_n832TipColDsc[0] ;
            A583IntCod = P070J4_A583IntCod[0] ;
            A584IntDsc = P070J4_A584IntDsc[0] ;
            n584IntDsc = P070J4_n584IntDsc[0] ;
            A1191ForNomCli = P070J4_A1191ForNomCli[0] ;
            n1191ForNomCli = P070J4_n1191ForNomCli[0] ;
            A1192ForNumCli = P070J4_A1192ForNumCli[0] ;
            n1192ForNumCli = P070J4_n1192ForNumCli[0] ;
            A995ForTonal = P070J4_A995ForTonal[0] ;
            n995ForTonal = P070J4_n995ForTonal[0] ;
            A1514MacProCod = P070J4_A1514MacProCod[0] ;
            n1514MacProCod = P070J4_n1514MacProCod[0] ;
            A1515MacProDsc = P070J4_A1515MacProDsc[0] ;
            A3560ForOpcCli = P070J4_A3560ForOpcCli[0] ;
            n3560ForOpcCli = P070J4_n3560ForOpcCli[0] ;
            A7537ForOpNum = P070J4_A7537ForOpNum[0] ;
            n7537ForOpNum = P070J4_n7537ForOpNum[0] ;
            A12130ForPanto = P070J4_A12130ForPanto[0] ;
            n12130ForPanto = P070J4_n12130ForPanto[0] ;
            A3317DscSol = P070J4_A3317DscSol[0] ;
            n3317DscSol = P070J4_n3317DscSol[0] ;
            A3558ForFecApr = P070J4_A3558ForFecApr[0] ;
            n3558ForFecApr = P070J4_n3558ForFecApr[0] ;
            A7029ForNomCli3 = P070J4_A7029ForNomCli3[0] ;
            n7029ForNomCli3 = P070J4_n7029ForNomCli3[0] ;
            A11705For_item2 = P070J4_A11705For_item2[0] ;
            n11705For_item2 = P070J4_n11705For_item2[0] ;
            A102ArtTP1 = P070J4_A102ArtTP1[0] ;
            A97ArtT1 = P070J4_A97ArtT1[0] ;
            A103ArtTP2 = P070J4_A103ArtTP2[0] ;
            A98ArtT2 = P070J4_A98ArtT2[0] ;
            A104ArtTP3 = P070J4_A104ArtTP3[0] ;
            A99ArtT3 = P070J4_A99ArtT3[0] ;
            A102ArtTP1 = P070J4_A102ArtTP1[0] ;
            A97ArtT1 = P070J4_A97ArtT1[0] ;
            A103ArtTP2 = P070J4_A103ArtTP2[0] ;
            A98ArtT2 = P070J4_A98ArtT2[0] ;
            A104ArtTP3 = P070J4_A104ArtTP3[0] ;
            A99ArtT3 = P070J4_A99ArtT3[0] ;
            A279CliNom = P070J4_A279CliNom[0] ;
            A584IntDsc = P070J4_A584IntDsc[0] ;
            n584IntDsc = P070J4_n584IntDsc[0] ;
            A832TipColDsc = P070J4_A832TipColDsc[0] ;
            n832TipColDsc = P070J4_n832TipColDsc[0] ;
            A1515MacProDsc = P070J4_A1515MacProDsc[0] ;
            A3317DscSol = P070J4_A3317DscSol[0] ;
            n3317DscSol = P070J4_n3317DscSol[0] ;
            AV73CliCod = A252CliCod ;
            AV74CliNom = A279CliNom ;
            AV75ForSer = A494ForSer ;
            AV102Forserdsc = A5742ForSerDsc ;
            AV76ForColnom = A482ForColNom ;
            AV77ForColNum = A483ForColNum ;
            AV78TipColCod = A831TipColCod ;
            AV52TipColDsc = GXutil.substring( A832TipColDsc, 1, 20) ;
            AV79IntCod = A583IntCod ;
            AV80IntDsc = A584IntDsc ;
            AV81ForNomCli = A1191ForNomCli ;
            AV82ForNumCli = A1192ForNumCli ;
            AV83ForTonal = A995ForTonal ;
            AV86MACPROCOD = A1514MacProCod ;
            AV88MACPRODSC = A1515MacProDsc ;
            AV87FOROPCCLI = A3560ForOpcCli ;
            if ( ( AV89Texfina == 1 ) && ( A7537ForOpNum > 0 ) )
            {
               AV87FOROPCCLI = GXutil.str( A7537ForOpNum, 2, 0) ;
            }
            AV92ForPanto = ((AV90carvema==1) ? A12130ForPanto : " ") ;
            AV71DscSol = A3317DscSol ;
            AV99ForFecApr = A3558ForFecApr ;
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV69Tab_obs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV27i = (byte)(1) ;
            /* Using cursor P070J5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A649ObsForTxt = P070J5_A649ObsForTxt[0] ;
               A650ObsLin = P070J5_A650ObsLin[0] ;
               if ( AV27i > 10 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV69Tab_obs[AV27i-1] = A649ObsForTxt ;
               AV27i = (byte)(AV27i+1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( A102ArtTP1 > 0 )
            {
               AV101Vcompo = GXutil.trim( A97ArtT1) + " " + GXutil.trim( GXutil.str( A102ArtTP1, 3, 0)) + "%" ;
               if ( A103ArtTP2 > 0 )
               {
                  AV101Vcompo += GXutil.trim( A98ArtT2) + " " + GXutil.trim( GXutil.str( A103ArtTP2, 3, 0)) + "%" ;
               }
               if ( A104ArtTP3 > 0 )
               {
                  AV101Vcompo += GXutil.trim( A99ArtT3) + " " + GXutil.trim( GXutil.str( A104ArtTP3, 3, 0)) + "%" ;
               }
            }
            AV101Vcompo = ((AV90carvema==1) ? A7029ForNomCli3 : AV101Vcompo) ;
            AV104Lb_talao = ((AV90carvema==1) ? GXutil.substring( A11705For_item2, 1, 8) : "") ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV53Flag1 = (byte)(0) ;
         AV54ContLin = (byte)(0) ;
         AV68Last_proc = "" ;
         /* Using cursor P070J6 */
         pr_default.execute(3, new Object[] {A396EmprCod, AV66Station});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A910Workstat = P070J6_A910Workstat[0] ;
            A764ProForCod = P070J6_A764ProForCod[0] ;
            A766ProForDsc = P070J6_A766ProForDsc[0] ;
            A4712EscMFacCon = P070J6_A4712EscMFacCon[0] ;
            A897EscMDsc = P070J6_A897EscMDsc[0] ;
            A490ForPrdUMe = P070J6_A490ForPrdUMe[0] ;
            A890EscMCan = P070J6_A890EscMCan[0] ;
            A719PrdNum = P070J6_A719PrdNum[0] ;
            A488ForPrdDsc = P070J6_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P070J6_n488ForPrdDsc[0] ;
            A718PrdNom = P070J6_A718PrdNom[0] ;
            A887EscMLin = P070J6_A887EscMLin[0] ;
            A718PrdNom = P070J6_A718PrdNom[0] ;
            A766ProForDsc = P070J6_A766ProForDsc[0] ;
            A488ForPrdDsc = P070J6_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P070J6_n488ForPrdDsc[0] ;
            if ( GXutil.strcmp(AV68Last_proc, A764ProForCod) != 0 )
            {
               if ( GXutil.strcmp(AV68Last_proc, "") == 0 )
               {
                  h70J0( false, 33) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 205, Gx_line+9, 281, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 290, Gx_line+9, 479, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit11, "")), 97, Gx_line+9, 178, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(82, Gx_line+4, 505, Gx_line+31, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 12, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Var1, "")), 557, Gx_line+8, 691, Gx_line+29, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+33) ;
               }
               else
               {
                  h70J0( false, 34) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 205, Gx_line+9, 281, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 290, Gx_line+9, 479, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit11, "")), 97, Gx_line+9, 178, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(82, Gx_line+4, 505, Gx_line+31, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+34) ;
               }
            }
            if ( A4712EscMFacCon.doubleValue() != 0 )
            {
               AV64Factor = GXutil.trim( GXutil.str( A4712EscMFacCon, 12, 5)) ;
            }
            else
            {
               AV64Factor = GXutil.trim( A897EscMDsc) ;
            }
            if ( A490ForPrdUMe == 2 )
            {
               AV67Unidad = httpContext.getMessage( "Lt", "") ;
            }
            if ( ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 3 ) )
            {
               AV67Unidad = httpContext.getMessage( "Kg", "") ;
            }
            AV63Cantidad = A890EscMCan ;
            if ( AV54ContLin == 8 )
            {
               if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
               {
                  h70J0( false, 20) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 9, Gx_line+2, 91, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 107, Gx_line+2, 271, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Factor, "")), 357, Gx_line+2, 433, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 450, Gx_line+2, 519, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 12, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Var2, "")), 557, Gx_line+0, 691, Gx_line+21, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+20) ;
               }
               else
               {
                  h70J0( false, 20) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 9, Gx_line+2, 91, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 107, Gx_line+2, 271, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Factor, "")), 357, Gx_line+2, 433, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 450, Gx_line+2, 519, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 12, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Var2, "")), 557, Gx_line+0, 691, Gx_line+21, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+20) ;
               }
            }
            else
            {
               if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
               {
                  h70J0( false, 17) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 9, Gx_line+0, 91, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 107, Gx_line+0, 271, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Factor, "")), 357, Gx_line+0, 433, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 450, Gx_line+0, 519, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               else
               {
                  h70J0( false, 17) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 9, Gx_line+0, 91, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 107, Gx_line+0, 271, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Factor, "")), 357, Gx_line+0, 433, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 450, Gx_line+0, 519, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
            }
            AV54ContLin = (byte)(AV54ContLin+1) ;
            AV68Last_proc = A764ProForCod ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         AV27i = (byte)(1) ;
         while ( ! (GXutil.strcmp("", AV69Tab_obs[AV27i-1])==0) )
         {
            AV70ObsForTxt = AV69Tab_obs[AV27i-1] ;
            if ( AV27i == 1 )
            {
               h70J0( false, 30) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Obs.", ""), 40, Gx_line+13, 70, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+6, 726, Gx_line+6, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70ObsForTxt, "")), 82, Gx_line+13, 239, Gx_line+30, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+30) ;
            }
            else
            {
               h70J0( false, 17) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70ObsForTxt, "")), 82, Gx_line+0, 239, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV27i = (byte)(AV27i+1) ;
         }
         if ( GXutil.strcmp(AV98source, " ") != 0 )
         {
            h70J0( false, 250) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "17d29e09-e113-459a-9e4e-09631c01df62", "", context.getHttpContext().getTheme( )), 47, Gx_line+16, 640, Gx_line+235) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+250) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h70J0( true, 0) ;
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

   public void h70J0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24NomEmp, "")), 21, Gx_line+5, 335, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit1, "")), 417, Gx_line+1, 475, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 486, Gx_line+1, 537, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit2, "")), 547, Gx_line+1, 594, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 599, Gx_line+1, 700, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit0, "")), 22, Gx_line+30, 162, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit3, "")), 524, Gx_line+30, 594, Gx_line+47, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 599, Gx_line+31, 644, Gx_line+48, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit4, "")), 25, Gx_line+63, 106, Gx_line+80, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV73CliCod), "ZZZZZ9")), 117, Gx_line+63, 162, Gx_line+80, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74CliNom, "")), 166, Gx_line+63, 355, Gx_line+80, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit5, "")), 25, Gx_line+82, 105, Gx_line+98, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit6, "")), 244, Gx_line+82, 302, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit9, "")), 113, Gx_line+219, 195, Gx_line+236, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+52, 726, Gx_line+52, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75ForSer, "")), 117, Gx_line+82, 218, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76ForColnom, "")), 311, Gx_line+82, 393, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV77ForColNum), "ZZZZZ9")), 477, Gx_line+82, 522, Gx_line+99, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV78TipColCod), "Z9")), 552, Gx_line+82, 568, Gx_line+99, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TipColDsc, "")), 572, Gx_line+82, 698, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit14, "")), 18, Gx_line+196, 98, Gx_line+212, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81ForNomCli, "")), 109, Gx_line+196, 191, Gx_line+213, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV82ForNumCli), "ZZZZZ9")), 204, Gx_line+196, 249, Gx_line+213, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+227, 101, Gx_line+227, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(202, Gx_line+227, 721, Gx_line+227, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(17, Gx_line+57, 727, Gx_line+189, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit16, "")), 526, Gx_line+82, 550, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Var3, "")), 289, Gx_line+32, 394, Gx_line+48, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 452, Gx_line+82, 467, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100Lit50, "")), 553, Gx_line+196, 658, Gx_line+213, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83ForTonal, "")), 370, Gx_line+196, 496, Gx_line+213, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit18, "")), 451, Gx_line+118, 504, Gx_line+135, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV79IntCod), "Z9")), 507, Gx_line+118, 523, Gx_line+135, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80IntDsc, "")), 529, Gx_line+118, 718, Gx_line+135, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71DscSol, "")), 117, Gx_line+118, 306, Gx_line+135, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Lit45, "")), 25, Gx_line+118, 103, Gx_line+134, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84Lit46, "")), 25, Gx_line+139, 104, Gx_line+156, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86MACPROCOD, "")), 117, Gx_line+139, 193, Gx_line+156, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88MACPRODSC, "")), 205, Gx_line+139, 331, Gx_line+156, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85Lit47, "")), 451, Gx_line+139, 556, Gx_line+156, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87FOROPCCLI, "")), 566, Gx_line+139, 592, Gx_line+156, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91Lit53, "")), 25, Gx_line+158, 103, Gx_line+174, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92ForPanto, "")), 117, Gx_line+158, 727, Gx_line+174, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit17, "")), 298, Gx_line+196, 351, Gx_line+213, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV99ForFecApr, "99/99/99"), 661, Gx_line+196, 712, Gx_line+213, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Vcompo, "")), 311, Gx_line+100, 500, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102Forserdsc, "")), 117, Gx_line+100, 281, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV103Lit71, "")), 452, Gx_line+63, 505, Gx_line+80, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Lb_talao, "")), 513, Gx_line+63, 639, Gx_line+80, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+238) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV66Station = "" ;
      AV18PSerie = "" ;
      AV19USerie = "" ;
      AV22PNumCol = "" ;
      AV23UNumCol = "" ;
      AV32Lit0 = "" ;
      AV33Lit1 = "" ;
      AV34Lit2 = "" ;
      AV35Lit3 = "" ;
      AV36Lit4 = "" ;
      AV37Lit5 = "" ;
      AV38Lit6 = "" ;
      AV39Lit7 = "" ;
      AV40Lit8 = "" ;
      AV41Lit9 = "" ;
      AV42Lit10 = "" ;
      AV43Lit11 = "" ;
      AV44Lit12 = "" ;
      AV45Lit13 = "" ;
      AV49Lit14 = "" ;
      AV50Lit15 = "" ;
      AV51Lit16 = "" ;
      AV61Lit17 = "" ;
      AV62Lit18 = "" ;
      AV72Lit45 = "" ;
      AV84Lit46 = "" ;
      AV85Lit47 = "" ;
      AV100Lit50 = "" ;
      scmdbuf = "" ;
      P070J2_A396EmprCod = new String[] {""} ;
      P070J2_A407EmprNom = new String[] {""} ;
      P070J2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV24NomEmp = "" ;
      GXv_int3 = new byte[1] ;
      AV103Lit71 = "" ;
      AV57Var1 = "" ;
      AV58Var2 = "" ;
      AV59Var3 = "" ;
      AV91Lit53 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      P070J4_A3316CodSol = new short[1] ;
      P070J4_n3316CodSol = new boolean[] {false} ;
      P070J4_A396EmprCod = new String[] {""} ;
      P070J4_A831TipColCod = new byte[1] ;
      P070J4_A483ForColNum = new int[1] ;
      P070J4_A482ForColNom = new String[] {""} ;
      P070J4_A494ForSer = new String[] {""} ;
      P070J4_A252CliCod = new int[1] ;
      P070J4_A279CliNom = new String[] {""} ;
      P070J4_A5742ForSerDsc = new String[] {""} ;
      P070J4_n5742ForSerDsc = new boolean[] {false} ;
      P070J4_A832TipColDsc = new String[] {""} ;
      P070J4_n832TipColDsc = new boolean[] {false} ;
      P070J4_A583IntCod = new byte[1] ;
      P070J4_A584IntDsc = new String[] {""} ;
      P070J4_n584IntDsc = new boolean[] {false} ;
      P070J4_A1191ForNomCli = new String[] {""} ;
      P070J4_n1191ForNomCli = new boolean[] {false} ;
      P070J4_A1192ForNumCli = new int[1] ;
      P070J4_n1192ForNumCli = new boolean[] {false} ;
      P070J4_A995ForTonal = new String[] {""} ;
      P070J4_n995ForTonal = new boolean[] {false} ;
      P070J4_A1514MacProCod = new String[] {""} ;
      P070J4_n1514MacProCod = new boolean[] {false} ;
      P070J4_A1515MacProDsc = new String[] {""} ;
      P070J4_A3560ForOpcCli = new String[] {""} ;
      P070J4_n3560ForOpcCli = new boolean[] {false} ;
      P070J4_A7537ForOpNum = new byte[1] ;
      P070J4_n7537ForOpNum = new boolean[] {false} ;
      P070J4_A12130ForPanto = new String[] {""} ;
      P070J4_n12130ForPanto = new boolean[] {false} ;
      P070J4_A3317DscSol = new String[] {""} ;
      P070J4_n3317DscSol = new boolean[] {false} ;
      P070J4_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      P070J4_n3558ForFecApr = new boolean[] {false} ;
      P070J4_A7029ForNomCli3 = new String[] {""} ;
      P070J4_n7029ForNomCli3 = new boolean[] {false} ;
      P070J4_A11705For_item2 = new String[] {""} ;
      P070J4_n11705For_item2 = new boolean[] {false} ;
      P070J4_A102ArtTP1 = new short[1] ;
      P070J4_A97ArtT1 = new String[] {""} ;
      P070J4_A103ArtTP2 = new short[1] ;
      P070J4_A98ArtT2 = new String[] {""} ;
      P070J4_A104ArtTP3 = new short[1] ;
      P070J4_A99ArtT3 = new String[] {""} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A279CliNom = "" ;
      A5742ForSerDsc = "" ;
      A832TipColDsc = "" ;
      A584IntDsc = "" ;
      A1191ForNomCli = "" ;
      A995ForTonal = "" ;
      A1514MacProCod = "" ;
      A1515MacProDsc = "" ;
      A3560ForOpcCli = "" ;
      A12130ForPanto = "" ;
      A3317DscSol = "" ;
      A3558ForFecApr = GXutil.nullDate() ;
      A7029ForNomCli3 = "" ;
      A11705For_item2 = "" ;
      A97ArtT1 = "" ;
      A98ArtT2 = "" ;
      A99ArtT3 = "" ;
      AV74CliNom = "" ;
      AV75ForSer = "" ;
      AV102Forserdsc = "" ;
      AV76ForColnom = "" ;
      AV52TipColDsc = "" ;
      AV80IntDsc = "" ;
      AV81ForNomCli = "" ;
      AV83ForTonal = "" ;
      AV86MACPROCOD = "" ;
      AV88MACPRODSC = "" ;
      AV87FOROPCCLI = "" ;
      AV92ForPanto = "" ;
      AV71DscSol = "" ;
      AV99ForFecApr = GXutil.nullDate() ;
      AV69Tab_obs = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV69Tab_obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P070J5_A396EmprCod = new String[] {""} ;
      P070J5_A252CliCod = new int[1] ;
      P070J5_A494ForSer = new String[] {""} ;
      P070J5_A482ForColNom = new String[] {""} ;
      P070J5_A483ForColNum = new int[1] ;
      P070J5_A831TipColCod = new byte[1] ;
      P070J5_A649ObsForTxt = new String[] {""} ;
      P070J5_A650ObsLin = new short[1] ;
      A649ObsForTxt = "" ;
      AV101Vcompo = "" ;
      AV104Lb_talao = "" ;
      AV68Last_proc = "" ;
      P070J6_A396EmprCod = new String[] {""} ;
      P070J6_A910Workstat = new String[] {""} ;
      P070J6_A764ProForCod = new String[] {""} ;
      P070J6_A766ProForDsc = new String[] {""} ;
      P070J6_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P070J6_A897EscMDsc = new String[] {""} ;
      P070J6_A490ForPrdUMe = new byte[1] ;
      P070J6_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P070J6_A719PrdNum = new String[] {""} ;
      P070J6_A488ForPrdDsc = new String[] {""} ;
      P070J6_n488ForPrdDsc = new boolean[] {false} ;
      P070J6_A718PrdNom = new String[] {""} ;
      P070J6_A887EscMLin = new int[1] ;
      A910Workstat = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A897EscMDsc = "" ;
      A890EscMCan = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A488ForPrdDsc = "" ;
      A718PrdNom = "" ;
      AV64Factor = "" ;
      AV67Unidad = "" ;
      AV63Cantidad = DecimalUtil.ZERO ;
      AV70ObsForTxt = "" ;
      AV98source = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.rfo00c2__default(),
         new Object[] {
             new Object[] {
            P070J2_A396EmprCod, P070J2_A407EmprNom, P070J2_n407EmprNom
            }
            , new Object[] {
            P070J4_A3316CodSol, P070J4_n3316CodSol, P070J4_A396EmprCod, P070J4_A831TipColCod, P070J4_A483ForColNum, P070J4_A482ForColNom, P070J4_A494ForSer, P070J4_A252CliCod, P070J4_A279CliNom, P070J4_A5742ForSerDsc,
            P070J4_n5742ForSerDsc, P070J4_A832TipColDsc, P070J4_n832TipColDsc, P070J4_A583IntCod, P070J4_A584IntDsc, P070J4_n584IntDsc, P070J4_A1191ForNomCli, P070J4_n1191ForNomCli, P070J4_A1192ForNumCli, P070J4_n1192ForNumCli,
            P070J4_A995ForTonal, P070J4_n995ForTonal, P070J4_A1514MacProCod, P070J4_n1514MacProCod, P070J4_A1515MacProDsc, P070J4_A3560ForOpcCli, P070J4_n3560ForOpcCli, P070J4_A7537ForOpNum, P070J4_n7537ForOpNum, P070J4_A12130ForPanto,
            P070J4_n12130ForPanto, P070J4_A3317DscSol, P070J4_n3317DscSol, P070J4_A3558ForFecApr, P070J4_n3558ForFecApr, P070J4_A7029ForNomCli3, P070J4_n7029ForNomCli3, P070J4_A11705For_item2, P070J4_n11705For_item2, P070J4_A102ArtTP1,
            P070J4_A97ArtT1, P070J4_A103ArtTP2, P070J4_A98ArtT2, P070J4_A104ArtTP3, P070J4_A99ArtT3
            }
            , new Object[] {
            P070J5_A396EmprCod, P070J5_A252CliCod, P070J5_A494ForSer, P070J5_A482ForColNom, P070J5_A483ForColNum, P070J5_A831TipColCod, P070J5_A649ObsForTxt, P070J5_A650ObsLin
            }
            , new Object[] {
            P070J6_A396EmprCod, P070J6_A910Workstat, P070J6_A764ProForCod, P070J6_A766ProForDsc, P070J6_A4712EscMFacCon, P070J6_A897EscMDsc, P070J6_A490ForPrdUMe, P070J6_A890EscMCan, P070J6_A719PrdNum, P070J6_A488ForPrdDsc,
            P070J6_n488ForPrdDsc, P070J6_A718PrdNom, P070J6_A887EscMLin
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

   private byte AV56FlagIdioma ;
   private byte AV89Texfina ;
   private byte AV90carvema ;
   private byte GXt_int4 ;
   private byte GXv_int3[] ;
   private byte AV60FlagTintex ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte A7537ForOpNum ;
   private byte AV78TipColCod ;
   private byte AV79IntCod ;
   private byte AV27i ;
   private byte AV53Flag1 ;
   private byte AV54ContLin ;
   private byte A490ForPrdUMe ;
   private short gxcookieaux ;
   private short A3316CodSol ;
   private short A102ArtTP1 ;
   private short A103ArtTP2 ;
   private short A104ArtTP3 ;
   private short A650ObsLin ;
   private short Gx_err ;
   private int AV16PCliCod ;
   private int AV17UCliCod ;
   private int AV20PColor ;
   private int AV21UColor ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A1192ForNumCli ;
   private int AV73CliCod ;
   private int AV77ForColNum ;
   private int AV82ForNumCli ;
   private int GX_I ;
   private int A887EscMLin ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A4712EscMFacCon ;
   private java.math.BigDecimal A890EscMCan ;
   private java.math.BigDecimal AV63Cantidad ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV66Station ;
   private String AV18PSerie ;
   private String AV19USerie ;
   private String AV22PNumCol ;
   private String AV23UNumCol ;
   private String AV32Lit0 ;
   private String AV33Lit1 ;
   private String AV34Lit2 ;
   private String AV35Lit3 ;
   private String AV36Lit4 ;
   private String AV37Lit5 ;
   private String AV38Lit6 ;
   private String AV39Lit7 ;
   private String AV40Lit8 ;
   private String AV41Lit9 ;
   private String AV42Lit10 ;
   private String AV43Lit11 ;
   private String AV44Lit12 ;
   private String AV45Lit13 ;
   private String AV49Lit14 ;
   private String AV50Lit15 ;
   private String AV51Lit16 ;
   private String AV61Lit17 ;
   private String AV62Lit18 ;
   private String AV72Lit45 ;
   private String AV84Lit46 ;
   private String AV85Lit47 ;
   private String AV100Lit50 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV24NomEmp ;
   private String AV103Lit71 ;
   private String AV57Var1 ;
   private String AV58Var2 ;
   private String AV59Var3 ;
   private String AV91Lit53 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A279CliNom ;
   private String A5742ForSerDsc ;
   private String A832TipColDsc ;
   private String A584IntDsc ;
   private String A1191ForNomCli ;
   private String A995ForTonal ;
   private String A1514MacProCod ;
   private String A1515MacProDsc ;
   private String A3560ForOpcCli ;
   private String A12130ForPanto ;
   private String A3317DscSol ;
   private String A7029ForNomCli3 ;
   private String A11705For_item2 ;
   private String A97ArtT1 ;
   private String A98ArtT2 ;
   private String A99ArtT3 ;
   private String AV74CliNom ;
   private String AV75ForSer ;
   private String AV102Forserdsc ;
   private String AV76ForColnom ;
   private String AV52TipColDsc ;
   private String AV80IntDsc ;
   private String AV81ForNomCli ;
   private String AV83ForTonal ;
   private String AV86MACPROCOD ;
   private String AV88MACPRODSC ;
   private String AV87FOROPCCLI ;
   private String AV92ForPanto ;
   private String AV71DscSol ;
   private String AV69Tab_obs[] ;
   private String A649ObsForTxt ;
   private String AV101Vcompo ;
   private String AV104Lb_talao ;
   private String AV68Last_proc ;
   private String A910Workstat ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A897EscMDsc ;
   private String A719PrdNum ;
   private String A488ForPrdDsc ;
   private String A718PrdNom ;
   private String AV64Factor ;
   private String AV67Unidad ;
   private String AV70ObsForTxt ;
   private String AV98source ;
   private String Gx_time ;
   private java.util.Date A3558ForFecApr ;
   private java.util.Date AV99ForFecApr ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n3316CodSol ;
   private boolean n5742ForSerDsc ;
   private boolean n832TipColDsc ;
   private boolean n584IntDsc ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private boolean n995ForTonal ;
   private boolean n1514MacProCod ;
   private boolean n3560ForOpcCli ;
   private boolean n7537ForOpNum ;
   private boolean n12130ForPanto ;
   private boolean n3317DscSol ;
   private boolean n3558ForFecApr ;
   private boolean n7029ForNomCli3 ;
   private boolean n11705For_item2 ;
   private boolean n488ForPrdDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P070J2_A396EmprCod ;
   private String[] P070J2_A407EmprNom ;
   private boolean[] P070J2_n407EmprNom ;
   private short[] P070J4_A3316CodSol ;
   private boolean[] P070J4_n3316CodSol ;
   private String[] P070J4_A396EmprCod ;
   private byte[] P070J4_A831TipColCod ;
   private int[] P070J4_A483ForColNum ;
   private String[] P070J4_A482ForColNom ;
   private String[] P070J4_A494ForSer ;
   private int[] P070J4_A252CliCod ;
   private String[] P070J4_A279CliNom ;
   private String[] P070J4_A5742ForSerDsc ;
   private boolean[] P070J4_n5742ForSerDsc ;
   private String[] P070J4_A832TipColDsc ;
   private boolean[] P070J4_n832TipColDsc ;
   private byte[] P070J4_A583IntCod ;
   private String[] P070J4_A584IntDsc ;
   private boolean[] P070J4_n584IntDsc ;
   private String[] P070J4_A1191ForNomCli ;
   private boolean[] P070J4_n1191ForNomCli ;
   private int[] P070J4_A1192ForNumCli ;
   private boolean[] P070J4_n1192ForNumCli ;
   private String[] P070J4_A995ForTonal ;
   private boolean[] P070J4_n995ForTonal ;
   private String[] P070J4_A1514MacProCod ;
   private boolean[] P070J4_n1514MacProCod ;
   private String[] P070J4_A1515MacProDsc ;
   private String[] P070J4_A3560ForOpcCli ;
   private boolean[] P070J4_n3560ForOpcCli ;
   private byte[] P070J4_A7537ForOpNum ;
   private boolean[] P070J4_n7537ForOpNum ;
   private String[] P070J4_A12130ForPanto ;
   private boolean[] P070J4_n12130ForPanto ;
   private String[] P070J4_A3317DscSol ;
   private boolean[] P070J4_n3317DscSol ;
   private java.util.Date[] P070J4_A3558ForFecApr ;
   private boolean[] P070J4_n3558ForFecApr ;
   private String[] P070J4_A7029ForNomCli3 ;
   private boolean[] P070J4_n7029ForNomCli3 ;
   private String[] P070J4_A11705For_item2 ;
   private boolean[] P070J4_n11705For_item2 ;
   private short[] P070J4_A102ArtTP1 ;
   private String[] P070J4_A97ArtT1 ;
   private short[] P070J4_A103ArtTP2 ;
   private String[] P070J4_A98ArtT2 ;
   private short[] P070J4_A104ArtTP3 ;
   private String[] P070J4_A99ArtT3 ;
   private String[] P070J5_A396EmprCod ;
   private int[] P070J5_A252CliCod ;
   private String[] P070J5_A494ForSer ;
   private String[] P070J5_A482ForColNom ;
   private int[] P070J5_A483ForColNum ;
   private byte[] P070J5_A831TipColCod ;
   private String[] P070J5_A649ObsForTxt ;
   private short[] P070J5_A650ObsLin ;
   private String[] P070J6_A396EmprCod ;
   private String[] P070J6_A910Workstat ;
   private String[] P070J6_A764ProForCod ;
   private String[] P070J6_A766ProForDsc ;
   private java.math.BigDecimal[] P070J6_A4712EscMFacCon ;
   private String[] P070J6_A897EscMDsc ;
   private byte[] P070J6_A490ForPrdUMe ;
   private java.math.BigDecimal[] P070J6_A890EscMCan ;
   private String[] P070J6_A719PrdNum ;
   private String[] P070J6_A488ForPrdDsc ;
   private boolean[] P070J6_n488ForPrdDsc ;
   private String[] P070J6_A718PrdNom ;
   private int[] P070J6_A887EscMLin ;
}

final  class rfo00c2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P070J2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P070J4", "SELECT T1.CodSol, T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T3.CliNom, T1.ForSerDsc, T5.TipColDsc, T1.IntCod, T4.IntDsc, T1.ForNomCli, T1.ForNumCli, T1.ForTonal, T1.MacProCod, T6.MacProDsc, T1.ForOpcCli, T1.ForOpNum, T1.ForPanto, T7.DscSol, T1.ForFecApr, T1.ForNomCli3, T1.For_item2, COALESCE( T2.ArtTP1, 0) AS ArtTP1, COALESCE( T2.ArtT1, '') AS ArtT1, COALESCE( T2.ArtTP2, 0) AS ArtTP2, COALESCE( T2.ArtT2, '') AS ArtT2, COALESCE( T2.ArtTP3, 0) AS ArtTP3, COALESCE( T2.ArtT3, '') AS ArtT3 FROM ((((((TXPCFORMU T1 LEFT JOIN (SELECT MIN(T8.ArtTraP1) AS ArtTP1, T9.ForSer, T9.ForColNom, T9.ForColNum, T9.TipColCod, MIN(T8.ArtTra1) AS ArtT1, MIN(T8.ArtTraP2) AS ArtTP2, MIN(T8.ArtTra2) AS ArtT2, MIN(T8.ArtTraP3) AS ArtTP3, MIN(T8.ArtTra3) AS ArtT3 FROM TXPARTICU T8,  TXPCFORMU T9 WHERE T8.EmprCod = T9.EmprCod and T8.CliCod = T9.CliCod and T8.ArtCod = T9.ForSer GROUP BY T9.ForSer, T9.ForColNom, T9.ForColNum, T9.TipColCod ) T2 ON T2.ForSer = T1.ForSer AND T2.ForColNom = T1.ForColNom AND T2.ForColNum = T1.ForColNum AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) INNER JOIN TXPINTENS T4 ON T4.EmprCod = T1.EmprCod AND T4.IntCod = T1.IntCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = T1.EmprCod AND T5.TipColCod = T1.TipColCod) LEFT JOIN TXPCMACPR T6 ON T6.EmprCod = T1.EmprCod AND T6.MacProCod = T1.MacProCod) LEFT JOIN TXPSOLIDE T7 ON T7.EmprCod = T1.EmprCod AND T7.CodSol = T1.CodSol) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.ForSer >= ? and T1.ForColNom >= ? and T1.ForColNum >= ?) AND (T1.ForSer <= ?) AND (T1.ForColNum <= ?) AND (T1.ForColNom <= ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P070J5", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsForTxt, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P070J6", "SELECT T1.EmprCod, T1.Workstat, T1.ProForCod, T3.ProForDsc, T1.EscMFacCon, T1.EscMDsc, T1.ForPrdUMe, T1.EscMCan, T1.PrdNum, T4.ForPrdDsc, T2.PrdNom, T1.EscMLin FROM (((TXPESCMAN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPCPROFO T3 ON T3.EmprCod = T1.EmprCod AND T3.ProForCod = T1.ProForCod) INNER JOIN TXPUNMEPR T4 ON T4.EmprCod = T1.EmprCod AND T4.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Workstat = ? ORDER BY T1.EmprCod, T1.Workstat, T1.EscMLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(17, 20);
               ((String[]) buf[25])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(19);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(20, 100);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(22);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(23, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(25);
               ((String[]) buf[40])[0] = rslt.getString(26, 4);
               ((short[]) buf[41])[0] = rslt.getShort(27);
               ((String[]) buf[42])[0] = rslt.getString(28, 4);
               ((short[]) buf[43])[0] = rslt.getShort(29);
               ((String[]) buf[44])[0] = rslt.getString(30, 4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((int[]) buf[12])[0] = rslt.getInt(12);
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
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 13);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

