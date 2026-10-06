package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rsimulaz_impl extends GXWebReport
{
   public rsimulaz_impl( com.genexus.internet.HttpContext context )
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
            A910Workstat = httpContext.GetPar( "Workstat") ;
            AV9CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            AV10ForSer = httpContext.GetPar( "ForSer") ;
            AV11ForColNom = httpContext.GetPar( "ForColNom") ;
            AV12ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
            AV13TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
            AV14TotKilos = CommonUtil.decimalVal( httpContext.GetPar( "TotKilos"), ".") ;
            AV15Volumen = (int)(GXutil.lval( httpContext.GetPar( "Volumen"))) ;
            AV16MaqCod = httpContext.GetPar( "MaqCod") ;
            AV53Incre = CommonUtil.decimalVal( httpContext.GetPar( "Incre"), ".") ;
            AV79TotKilo = CommonUtil.decimalVal( httpContext.GetPar( "TotKilo"), ".") ;
            AV77Por_quebra = CommonUtil.decimalVal( httpContext.GetPar( "Por_quebra"), ".") ;
            AV80TotMts = CommonUtil.decimalVal( httpContext.GetPar( "TotMts"), ".") ;
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
      M_bot = 5 ;
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
         P_lines = (int)(gxYPage-(lineHeight*5)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV66ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIMULAZ", ""), GXv_char1) ;
         rsimulaz_impl.this.AV66ContDsc = GXv_char1[0] ;
         GXv_int2[0] = AV71FlagUni ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100000", GXv_int2) ;
         rsimulaz_impl.this.AV71FlagUni = GXv_int2[0] ;
         GXt_int3 = AV89CosteAm ;
         GXv_int4[0] = GXt_int3 ;
         new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COSTEA", ""), GXv_int4) ;
         rsimulaz_impl.this.GXt_int3 = GXv_int4[0] ;
         AV89CosteAm = (short)(GXt_int3) ;
         GXt_char5 = AV31Lit0 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV31Lit0 = GXt_char5 ;
         GXt_char5 = AV32Lit1 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV32Lit1 = GXt_char5 ;
         GXt_char5 = AV24Lit2 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1547_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV24Lit2 = GXt_char5 ;
         GXt_char5 = AV33Lit3 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV33Lit3 = GXt_char5 ;
         GXt_char5 = AV26Lit4 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV26Lit4 = GXt_char5 ;
         GXt_char5 = AV27Lit5 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN388_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV27Lit5 = GXt_char5 ;
         GXt_char5 = AV28Lit6 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN387_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV28Lit6 = GXt_char5 ;
         GXt_char5 = AV29Lit7 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN386_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV29Lit7 = GXt_char5 ;
         GXt_char5 = AV30Lit8 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2458_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV30Lit8 = GXt_char5 ;
         GXt_char5 = AV34Lit9 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV34Lit9 = GXt_char5 ;
         GXt_char5 = AV35Lit10 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV35Lit10 = GXt_char5 ;
         GXt_char5 = AV36Lit11 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV36Lit11 = GXt_char5 ;
         GXt_char5 = AV37Lit12 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV37Lit12 = GXt_char5 ;
         GXt_char5 = AV38Lit13 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1421_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV38Lit13 = GXt_char5 ;
         AV38Lit13 = GXutil.substring( AV38Lit13, 1, 6) ;
         GXt_char5 = AV39Lit14 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN378_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV39Lit14 = GXt_char5 ;
         GXt_char5 = AV40Lit15 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT234_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV40Lit15 = GXt_char5 ;
         AV40Lit15 = GXutil.substring( AV40Lit15, 1, 9) ;
         GXt_char5 = AV45Lit16 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1321_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV45Lit16 = GXt_char5 ;
         GXt_char5 = AV42Lit17 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1545_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV42Lit17 = GXt_char5 ;
         AV42Lit17 = GXutil.substring( AV42Lit17, 1, 6) ;
         GXt_char5 = AV43Lit18 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1546_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV43Lit18 = GXt_char5 ;
         GXt_char5 = AV44Lit19 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1496_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV44Lit19 = GXt_char5 ;
         GXt_char5 = AV51Lit20 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV51Lit20 = GXt_char5 ;
         GXt_char5 = AV52Lit21 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1193_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV52Lit21 = GXt_char5 ;
         GXt_char5 = AV54Lit22 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1541_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV54Lit22 = GXt_char5 ;
         GXt_char5 = AV61Lit23 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN758_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV61Lit23 = GXt_char5 ;
         GXt_char5 = AV62Lit24 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN759_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV62Lit24 = GXt_char5 ;
         GXt_char5 = AV63Lit25 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN760_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV63Lit25 = GXt_char5 ;
         GXt_char5 = AV69Lit26 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN134_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV69Lit26 = GXt_char5 ;
         GXt_char5 = AV75Lit27 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV75Lit27 = GXt_char5 ;
         GXt_char5 = AV78Lit28 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1593_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV78Lit28 = GXt_char5 ;
         GXt_char5 = AV84Lit29 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV84Lit29 = GXt_char5 ;
         GXt_char5 = AV88Lit31 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN127", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV88Lit31 = GXt_char5 ;
         GXt_char5 = AV92Lit32 ;
         GXv_char1[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN207_", ""), (byte)(99), GXv_char1) ;
         rsimulaz_impl.this.GXt_char5 = GXv_char1[0] ;
         AV92Lit32 = GXt_char5 ;
         /* Using cursor P06I62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9CliCod), AV10ForSer, AV11ForColNom, Integer.valueOf(AV12ForColNum), Byte.valueOf(AV13TipColCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A831TipColCod = P06I62_A831TipColCod[0] ;
            A483ForColNum = P06I62_A483ForColNum[0] ;
            A482ForColNom = P06I62_A482ForColNom[0] ;
            A494ForSer = P06I62_A494ForSer[0] ;
            A252CliCod = P06I62_A252CliCod[0] ;
            A1191ForNomCli = P06I62_A1191ForNomCli[0] ;
            n1191ForNomCli = P06I62_n1191ForNomCli[0] ;
            A583IntCod = P06I62_A583IntCod[0] ;
            A584IntDsc = P06I62_A584IntDsc[0] ;
            n584IntDsc = P06I62_n584IntDsc[0] ;
            A5362IntCodF = P06I62_A5362IntCodF[0] ;
            n5362IntCodF = P06I62_n5362IntCodF[0] ;
            A5363IntDscF = P06I62_A5363IntDscF[0] ;
            n5363IntDscF = P06I62_n5363IntDscF[0] ;
            A832TipColDsc = P06I62_A832TipColDsc[0] ;
            n832TipColDsc = P06I62_n832TipColDsc[0] ;
            A279CliNom = P06I62_A279CliNom[0] ;
            A1192ForNumCli = P06I62_A1192ForNumCli[0] ;
            n1192ForNumCli = P06I62_n1192ForNumCli[0] ;
            A995ForTonal = P06I62_A995ForTonal[0] ;
            n995ForTonal = P06I62_n995ForTonal[0] ;
            A626MatCod = P06I62_A626MatCod[0] ;
            A627MatDsc = P06I62_A627MatDsc[0] ;
            n627MatDsc = P06I62_n627MatDsc[0] ;
            A485ForFec = P06I62_A485ForFec[0] ;
            n485ForFec = P06I62_n485ForFec[0] ;
            A279CliNom = P06I62_A279CliNom[0] ;
            A584IntDsc = P06I62_A584IntDsc[0] ;
            n584IntDsc = P06I62_n584IntDsc[0] ;
            A627MatDsc = P06I62_A627MatDsc[0] ;
            n627MatDsc = P06I62_n627MatDsc[0] ;
            A832TipColDsc = P06I62_A832TipColDsc[0] ;
            n832TipColDsc = P06I62_n832TipColDsc[0] ;
            A5363IntDscF = P06I62_A5363IntDscF[0] ;
            n5363IntDscF = P06I62_n5363IntDscF[0] ;
            AV46ForNomCli = A1191ForNomCli ;
            AV48IntCod = A583IntCod ;
            AV49IntDsc = A584IntDsc ;
            AV86IntCodF = A5362IntCodF ;
            AV87IntDscF = A5363IntDscF ;
            AV50TipColDsc = A832TipColDsc ;
            AV64CliNom = A279CliNom ;
            AV47ForNumCli = A1192ForNumCli ;
            AV76ForTonal = A995ForTonal ;
            AV67MatCod = A626MatCod ;
            AV68matDsc = A627MatDsc ;
            AV93ForFec = A485ForFec ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char6[0] = A494ForSer ;
            GXv_char7[0] = AV95TipArtdsc ;
            new app.pbusar2(remoteHandle, context).execute( GXv_char1, GXv_int4, GXv_char6, GXv_char7) ;
            rsimulaz_impl.this.A396EmprCod = GXv_char1[0] ;
            rsimulaz_impl.this.A252CliCod = GXv_int4[0] ;
            rsimulaz_impl.this.A494ForSer = GXv_char6[0] ;
            rsimulaz_impl.this.AV95TipArtdsc = GXv_char7[0] ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06I63 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9CliCod), AV10ForSer});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A65ArtCod = P06I63_A65ArtCod[0] ;
            A252CliCod = P06I63_A252CliCod[0] ;
            A69ArtDsc = P06I63_A69ArtDsc[0] ;
            n69ArtDsc = P06I63_n69ArtDsc[0] ;
            AV55ArtDsc = A69ArtDsc ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Using cursor P06I64 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A407EmprNom = P06I64_A407EmprNom[0] ;
            n407EmprNom = P06I64_n407EmprNom[0] ;
            AV25NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         AV85Rb = DecimalUtil.doubleToDec(0) ;
         if ( AV14TotKilos.doubleValue() > 0 )
         {
            AV85Rb = DecimalUtil.doubleToDec(AV15Volumen).divide(AV14TotKilos, 18, java.math.RoundingMode.DOWN) ;
         }
         AV57CosteP2 = DecimalUtil.doubleToDec(0) ;
         AV56CosteP1 = DecimalUtil.doubleToDec(0) ;
         AV22LastProces = "" ;
         AV58CosteC = DecimalUtil.doubleToDec(0) ;
         AV60CosteD = DecimalUtil.doubleToDec(0) ;
         AV59CosteA = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P06I65 */
         pr_default.execute(3, new Object[] {A396EmprCod, A910Workstat});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A490ForPrdUMe = P06I65_A490ForPrdUMe[0] ;
            A743PrdUniCon = P06I65_A743PrdUniCon[0] ;
            A719PrdNum = P06I65_A719PrdNum[0] ;
            A10363EscMCant = P06I65_A10363EscMCant[0] ;
            A890EscMCan = P06I65_A890EscMCan[0] ;
            A897EscMDsc = P06I65_A897EscMDsc[0] ;
            A764ProForCod = P06I65_A764ProForCod[0] ;
            A771ProForTie = P06I65_A771ProForTie[0] ;
            A772ProForTmx = P06I65_A772ProForTmx[0] ;
            A6877ProForPhn = P06I65_A6877ProForPhn[0] ;
            n6877ProForPhn = P06I65_n6877ProForPhn[0] ;
            A6876ProForPhx = P06I65_A6876ProForPhx[0] ;
            n6876ProForPhx = P06I65_n6876ProForPhx[0] ;
            A7584EscVolm = P06I65_A7584EscVolm[0] ;
            A766ProForDsc = P06I65_A766ProForDsc[0] ;
            A889EscMPrdPre = P06I65_A889EscMPrdPre[0] ;
            A891EscMCos = P06I65_A891EscMCos[0] ;
            A488ForPrdDsc = P06I65_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P06I65_n488ForPrdDsc[0] ;
            A718PrdNom = P06I65_A718PrdNom[0] ;
            A887EscMLin = P06I65_A887EscMLin[0] ;
            A743PrdUniCon = P06I65_A743PrdUniCon[0] ;
            A718PrdNom = P06I65_A718PrdNom[0] ;
            A771ProForTie = P06I65_A771ProForTie[0] ;
            A772ProForTmx = P06I65_A772ProForTmx[0] ;
            A6877ProForPhn = P06I65_A6877ProForPhn[0] ;
            n6877ProForPhn = P06I65_n6877ProForPhn[0] ;
            A6876ProForPhx = P06I65_A6876ProForPhx[0] ;
            n6876ProForPhx = P06I65_n6876ProForPhx[0] ;
            A766ProForDsc = P06I65_A766ProForDsc[0] ;
            A488ForPrdDsc = P06I65_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P06I65_n488ForPrdDsc[0] ;
            if ( A490ForPrdUMe == 2 )
            {
               AV72Unidades = httpContext.getMessage( "Cc", "") ;
            }
            else
            {
               if ( A490ForPrdUMe == 3 )
               {
                  if ( A743PrdUniCon == 3 )
                  {
                     AV72Unidades = httpContext.getMessage( "Cc", "") ;
                  }
                  else
                  {
                     AV72Unidades = httpContext.getMessage( "Gr", "") ;
                  }
               }
               else
               {
                  AV72Unidades = httpContext.getMessage( "Gr", "") ;
                  if ( A743PrdUniCon == 3 )
                  {
                     AV72Unidades = httpContext.getMessage( "Cc", "") ;
                  }
               }
            }
            AV70CodPrd = GXutil.substring( A719PrdNum, 1, 1) ;
            if ( AV71FlagUni == 1 )
            {
               if ( ( ( A890EscMCan.doubleValue() >= 1000 ) && ( ( GXutil.strcmp(AV70CodPrd, "0") == 0 ) || ( GXutil.strcmp(AV70CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV70CodPrd, "9") == 0 ) ) ) || ( ( A10363EscMCant.doubleValue() >= 1000 ) && ( ( GXutil.strcmp(AV70CodPrd, "0") == 0 ) || ( GXutil.strcmp(AV70CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV70CodPrd, "9") == 0 ) ) ) )
               {
                  AV73Cantidad = A890EscMCan.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                  if ( A10363EscMCant.doubleValue() > 0 )
                  {
                     AV73Cantidad = A10363EscMCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                  }
                  if ( A490ForPrdUMe == 2 )
                  {
                     AV72Unidades = httpContext.getMessage( "Lt", "") ;
                  }
                  else
                  {
                     if ( A490ForPrdUMe == 3 )
                     {
                        if ( A743PrdUniCon == 3 )
                        {
                           AV72Unidades = httpContext.getMessage( "Lt", "") ;
                        }
                        else
                        {
                           AV72Unidades = httpContext.getMessage( "Kg", "") ;
                        }
                     }
                     else
                     {
                        AV72Unidades = httpContext.getMessage( "Kg", "") ;
                        if ( A743PrdUniCon == 3 )
                        {
                           AV72Unidades = httpContext.getMessage( "Lt", "") ;
                        }
                     }
                  }
               }
               else
               {
                  AV73Cantidad = A890EscMCan ;
                  if ( A10363EscMCant.doubleValue() > 0 )
                  {
                     AV73Cantidad = A890EscMCan ;
                  }
                  if ( A490ForPrdUMe == 2 )
                  {
                     AV72Unidades = httpContext.getMessage( "Cc", "") ;
                  }
                  else
                  {
                     if ( A490ForPrdUMe == 3 )
                     {
                        if ( A743PrdUniCon == 3 )
                        {
                           AV72Unidades = httpContext.getMessage( "Cc", "") ;
                        }
                        else
                        {
                           AV72Unidades = httpContext.getMessage( "Gr", "") ;
                        }
                     }
                     else
                     {
                        AV72Unidades = httpContext.getMessage( "Gr", "") ;
                        if ( A743PrdUniCon == 3 )
                        {
                           AV72Unidades = httpContext.getMessage( "Cc", "") ;
                        }
                     }
                  }
               }
            }
            else
            {
               AV73Cantidad = A890EscMCan ;
            }
            AV8Factor = GXutil.substring( A897EscMDsc, 1, 10) ;
            if ( A490ForPrdUMe == 2 )
            {
               AV23Unidad = httpContext.getMessage( "Lt", "") ;
            }
            if ( ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 3 ) )
            {
               AV23Unidad = httpContext.getMessage( "Kg", "") ;
            }
            if ( GXutil.strcmp(AV22LastProces, A764ProForCod) != 0 )
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56CosteP1)==0) )
               {
                  AV57CosteP2 = AV56CosteP1.divide(AV14TotKilos, 18, java.math.RoundingMode.DOWN) ;
                  h6I60( false, 51) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56CosteP1, "ZZ,ZZZ,ZZ9.99999")), 653, Gx_line+7, 787, Gx_line+25, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57CosteP2, "ZZ,ZZZ,ZZ9.99999")), 653, Gx_line+28, 787, Gx_line+46, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+51) ;
               }
               AV96ProForTie = A771ProForTie ;
               AV97Profortmx = A772ProForTmx ;
               AV99Proforphn = A6877ProForPhn ;
               AV98Proforphx = A6876ProForPhx ;
               h6I60( false, 31) ;
               getPrinter().GxAttris("Arial", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 12, Gx_line+4, 94, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 100, Gx_line+3, 257, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tiempo", ""), 372, Gx_line+3, 417, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV96ProForTie), "ZZZ9")), 421, Gx_line+3, 451, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TºC", ""), 522, Gx_line+3, 545, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV97Profortmx), "ZZZ9")), 488, Gx_line+3, 518, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PH", ""), 565, Gx_line+3, 585, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV98Proforphx, "Z9.99")), 589, Gx_line+3, 626, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV99Proforphn, "Z9.99")), 628, Gx_line+3, 665, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "m", ""), 455, Gx_line+3, 467, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7584EscVolm), "ZZZZ9")), 751, Gx_line+3, 788, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Volumen", ""), 696, Gx_line+3, 749, Gx_line+20, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
               AV56CosteP1 = DecimalUtil.doubleToDec(0) ;
               AV57CosteP2 = DecimalUtil.doubleToDec(0) ;
            }
            AV65Prec_linea = A889EscMPrdPre ;
            AV94escmcos = A891EscMCos ;
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), httpContext.getMessage( "C", "")) == 0 )
            {
            }
            else
            {
               if ( ( GXutil.strcmp(AV70CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV70CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV70CodPrd, "0") == 0 ) )
               {
                  h6I60( false, 19) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 16, Gx_line+1, 67, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 78, Gx_line+1, 296, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV73Cantidad, "Z,ZZZ,ZZ9.999")), 458, Gx_line+0, 567, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV65Prec_linea, "ZZZZZ9.999")), 592, Gx_line+0, 676, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV94escmcos, "ZZZ,ZZ9.99999")), 678, Gx_line+0, 787, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Factor, "")), 363, Gx_line+0, 447, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 307, Gx_line+0, 350, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Unidades, "")), 573, Gx_line+1, 589, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+19) ;
               }
               else
               {
                  h6I60( false, 18) ;
                  getPrinter().GxAttris("Courier New", 10, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 16, Gx_line+0, 67, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 78, Gx_line+0, 296, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV73Cantidad, "Z,ZZZ,ZZ9.999")), 458, Gx_line+0, 567, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV65Prec_linea, "ZZZZZ9.999")), 592, Gx_line+0, 676, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV94escmcos, "ZZZ,ZZ9.99999")), 678, Gx_line+0, 787, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Factor, "")), 363, Gx_line+0, 447, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 307, Gx_line+0, 350, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Unidades, "")), 570, Gx_line+1, 586, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
            }
            AV20TotValor = AV20TotValor.add(A891EscMCos) ;
            AV56CosteP1 = AV56CosteP1.add(A891EscMCos) ;
            AV22LastProces = A764ProForCod ;
            if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
            {
               AV58CosteC = AV58CosteC.add(A891EscMCos) ;
            }
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "8") == 0 )
            {
               AV59CosteA = AV59CosteA.add(A891EscMCos) ;
            }
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "9") == 0 )
            {
               AV60CosteD = AV60CosteD.add(A891EscMCos) ;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         AV79TotKilo = AV20TotValor.divide(AV14TotKilos, 18, java.math.RoundingMode.DOWN) ;
         AV81TotMtr = DecimalUtil.doubleToDec(0) ;
         if ( AV80TotMts.doubleValue() > 0 )
         {
            AV81TotMtr = AV20TotValor.divide(AV80TotMts, 18, java.math.RoundingMode.DOWN) ;
         }
         AV57CosteP2 = AV56CosteP1.divide(AV14TotKilos, 18, java.math.RoundingMode.DOWN) ;
         h6I60( false, 52) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56CosteP1, "ZZ,ZZZ,ZZ9.99999")), 653, Gx_line+7, 787, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57CosteP2, "ZZ,ZZZ,ZZ9.99999")), 653, Gx_line+30, 787, Gx_line+48, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+52) ;
         AV82Lit30 = httpContext.getMessage( "Total p/Mt", "") ;
         if ( AV80TotMts.doubleValue() == 0 )
         {
            AV82Lit30 = " " ;
         }
         if ( AV77Por_quebra.doubleValue() == 0 )
         {
            if ( AV89CosteAm == 0 )
            {
               h6I60( false, 72) ;
               getPrinter().GxAttris("Courier New", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20TotValor, "ZZ,ZZZ,ZZ9.99999")), 653, Gx_line+5, 787, Gx_line+23, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79TotKilo, "ZZ,ZZZ,ZZ9.99999")), 653, Gx_line+25, 787, Gx_line+43, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit18, "")), 505, Gx_line+5, 586, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit19, "")), 505, Gx_line+25, 586, Gx_line+43, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit23, "")), 50, Gx_line+5, 123, Gx_line+22, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit24, "")), 50, Gx_line+27, 124, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit25, "")), 50, Gx_line+50, 124, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV58CosteC, "ZZ,ZZZ,ZZ9.99999")), 135, Gx_line+5, 253, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV59CosteA, "ZZ,ZZZ,ZZ9.99999")), 135, Gx_line+27, 253, Gx_line+44, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60CosteD, "ZZ,ZZZ,ZZ9.99999")), 135, Gx_line+50, 253, Gx_line+67, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(45, Gx_line+1, 273, Gx_line+70, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Lit30, "")), 476, Gx_line+45, 586, Gx_line+63, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV81TotMtr, "ZZ,ZZZ,ZZZ.ZZZZZ")), 653, Gx_line+45, 787, Gx_line+63, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+72) ;
            }
            else
            {
               AV91Coste_am = DecimalUtil.doubleToDec(AV89CosteAm/ (double) (100)) ;
               AV90Tot_kga = AV91Coste_am.add(AV79TotKilo) ;
               h6I60( false, 101) ;
               getPrinter().GxAttris("Courier New", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20TotValor, "ZZ,ZZZ,ZZ9.99999")), 653, Gx_line+6, 787, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79TotKilo, "ZZ,ZZZ,ZZ9.99999")), 653, Gx_line+26, 787, Gx_line+44, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit18, "")), 510, Gx_line+6, 591, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit19, "")), 510, Gx_line+26, 591, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit23, "")), 50, Gx_line+6, 123, Gx_line+23, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit24, "")), 50, Gx_line+28, 124, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit25, "")), 50, Gx_line+51, 124, Gx_line+69, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV58CosteC, "ZZ,ZZZ,ZZ9.99999")), 135, Gx_line+6, 253, Gx_line+23, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV59CosteA, "ZZ,ZZZ,ZZ9.99999")), 135, Gx_line+28, 253, Gx_line+45, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60CosteD, "ZZ,ZZZ,ZZ9.99999")), 135, Gx_line+51, 253, Gx_line+68, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(45, Gx_line+2, 273, Gx_line+71, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Lit30, "")), 481, Gx_line+46, 591, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV81TotMtr, "ZZ,ZZZ,ZZZ.ZZZZZ")), 653, Gx_line+46, 787, Gx_line+64, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Custo Amaceamento", ""), 457, Gx_line+69, 606, Gx_line+87, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Coste_am, "ZZ9.99")), 599, Gx_line+69, 644, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90Tot_kga, "ZZZZ9.99999")), 672, Gx_line+69, 753, Gx_line+86, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+101) ;
            }
         }
         else
         {
            AV21TotKiloQ = AV79TotKilo.add((AV79TotKilo.multiply(AV77Por_quebra)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)) ;
            AV83TotMetQ = AV81TotMtr.add((AV81TotMtr.multiply(AV77Por_quebra)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)) ;
            if ( AV89CosteAm == 0 )
            {
               h6I60( false, 151) ;
               getPrinter().GxAttris("Courier New", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20TotValor, "ZZ,ZZZ,ZZ9.99999")), 653, Gx_line+10, 787, Gx_line+28, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79TotKilo, "ZZ,ZZZ,ZZ9.99999")), 653, Gx_line+34, 787, Gx_line+52, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit18, "")), 505, Gx_line+10, 586, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit19, "")), 505, Gx_line+34, 586, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit23, "")), 55, Gx_line+10, 128, Gx_line+27, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit24, "")), 55, Gx_line+32, 129, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit25, "")), 55, Gx_line+55, 129, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV58CosteC, "ZZ,ZZZ,ZZ9.99999")), 141, Gx_line+10, 259, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV59CosteA, "ZZ,ZZZ,ZZ9.99999")), 141, Gx_line+32, 259, Gx_line+49, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60CosteD, "ZZ,ZZZ,ZZ9.99999")), 141, Gx_line+55, 259, Gx_line+72, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(45, Gx_line+6, 273, Gx_line+75, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Lit28, "")), 505, Gx_line+82, 585, Gx_line+99, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV77Por_quebra, "ZZ9.99")), 743, Gx_line+82, 788, Gx_line+100, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21TotKiloQ, "ZZZ9.999")), 728, Gx_line+109, 787, Gx_line+127, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Lit30, "")), 476, Gx_line+58, 586, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV81TotMtr, "ZZ,ZZZ,ZZZ.ZZZZZ")), 653, Gx_line+58, 787, Gx_line+76, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV83TotMetQ, "ZZZZ.ZZZ")), 720, Gx_line+130, 788, Gx_line+148, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(498, Gx_line+79, 792, Gx_line+150, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+151) ;
            }
            else
            {
               AV91Coste_am = DecimalUtil.doubleToDec(AV89CosteAm/ (double) (100)) ;
               AV90Tot_kga = AV91Coste_am.add(AV79TotKilo) ;
               h6I60( false, 191) ;
               getPrinter().GxAttris("Courier New", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20TotValor, "ZZ,ZZZ,ZZ9.99999")), 653, Gx_line+10, 787, Gx_line+28, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79TotKilo, "ZZ,ZZZ,ZZ9.99999")), 653, Gx_line+34, 787, Gx_line+52, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit18, "")), 505, Gx_line+10, 586, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit19, "")), 505, Gx_line+34, 586, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit23, "")), 61, Gx_line+10, 134, Gx_line+27, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit24, "")), 61, Gx_line+32, 135, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit25, "")), 61, Gx_line+55, 135, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV58CosteC, "ZZ,ZZZ,ZZ9.99999")), 147, Gx_line+10, 265, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV59CosteA, "ZZ,ZZZ,ZZ9.99999")), 147, Gx_line+32, 265, Gx_line+49, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60CosteD, "ZZ,ZZZ,ZZ9.99999")), 147, Gx_line+55, 265, Gx_line+72, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(51, Gx_line+6, 279, Gx_line+75, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Lit28, "")), 505, Gx_line+82, 585, Gx_line+99, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV77Por_quebra, "ZZ9.99")), 743, Gx_line+82, 788, Gx_line+100, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21TotKiloQ, "ZZZ9.999")), 728, Gx_line+109, 787, Gx_line+127, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Lit30, "")), 476, Gx_line+58, 586, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV81TotMtr, "ZZ,ZZZ,ZZZ.ZZZZZ")), 653, Gx_line+58, 787, Gx_line+76, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV83TotMetQ, "ZZZZ.ZZZ")), 720, Gx_line+130, 788, Gx_line+148, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(498, Gx_line+79, 792, Gx_line+150, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Custo Amaceamento", ""), 452, Gx_line+161, 601, Gx_line+179, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Coste_am, "ZZ9.99")), 599, Gx_line+161, 644, Gx_line+178, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90Tot_kga, "ZZZZ9.99999")), 677, Gx_line+161, 758, Gx_line+178, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+191) ;
            }
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6I60( true, 0) ;
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

   public void h6I60( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66ContDsc, "")), 7, Gx_line+3, 91, Gx_line+16, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
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
            getPrinter().GxDrawLine(5, Gx_line+83, 771, Gx_line+83, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+330, 788, Gx_line+330, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9CliCod), "ZZZZZ9")), 123, Gx_line+91, 168, Gx_line+108, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10ForSer, "")), 284, Gx_line+91, 402, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11ForColNom, "")), 95, Gx_line+158, 191, Gx_line+175, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12ForColNum), "ZZZZZ9")), 286, Gx_line+158, 331, Gx_line+175, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13TipColCod), "Z9")), 95, Gx_line+179, 111, Gx_line+196, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14TotKilos, "ZZZ,ZZ9.99")), 674, Gx_line+103, 758, Gx_line+121, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15Volumen), "ZZZZ9")), 710, Gx_line+145, 753, Gx_line+163, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16MaqCod, "")), 659, Gx_line+188, 748, Gx_line+206, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit2, "")), 10, Gx_line+60, 171, Gx_line+78, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25NomEmp, "")), 11, Gx_line+25, 262, Gx_line+47, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit4, "")), 10, Gx_line+91, 113, Gx_line+109, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit5, "")), 194, Gx_line+91, 261, Gx_line+108, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit6, "")), 11, Gx_line+158, 85, Gx_line+176, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit7, "")), 218, Gx_line+158, 268, Gx_line+175, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit8, "")), 11, Gx_line+179, 41, Gx_line+197, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit0, "")), 470, Gx_line+27, 544, Gx_line+45, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 550, Gx_line+27, 609, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 692, Gx_line+27, 751, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit3, "")), 588, Gx_line+60, 677, Gx_line+78, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 705, Gx_line+60, 750, Gx_line+77, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit9, "")), 543, Gx_line+103, 617, Gx_line+121, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit10, "")), 543, Gx_line+145, 646, Gx_line+163, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit11, "")), 543, Gx_line+186, 646, Gx_line+204, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit12, "")), 20, Gx_line+307, 88, Gx_line+325, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit13, "")), 303, Gx_line+307, 354, Gx_line+325, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit14, "")), 396, Gx_line+307, 447, Gx_line+325, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit15, "")), 513, Gx_line+307, 589, Gx_line+325, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit16, "")), 625, Gx_line+307, 676, Gx_line+325, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit17, "")), 736, Gx_line+307, 787, Gx_line+325, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit20, "")), 14, Gx_line+259, 88, Gx_line+277, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46ForNomCli, "")), 95, Gx_line+259, 191, Gx_line+276, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47ForNumCli), "ZZZZZ9")), 215, Gx_line+259, 260, Gx_line+276, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TipColDsc, "")), 124, Gx_line+179, 344, Gx_line+196, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit21, "")), 11, Gx_line+199, 85, Gx_line+217, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48IntCod), "Z9")), 96, Gx_line+199, 112, Gx_line+216, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49IntDsc, "")), 121, Gx_line+199, 341, Gx_line+216, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit22, "")), 435, Gx_line+60, 509, Gx_line+78, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53Incre, "ZZ9.99")), 517, Gx_line+60, 562, Gx_line+78, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55ArtDsc, "")), 284, Gx_line+110, 502, Gx_line+128, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64CliNom, "")), 10, Gx_line+110, 261, Gx_line+128, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(526, Gx_line+96, 759, Gx_line+218, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(6, Gx_line+153, 373, Gx_line+302, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Lit26, "")), 11, Gx_line+220, 85, Gx_line+238, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV67MatCod), "ZZ9")), 89, Gx_line+220, 112, Gx_line+237, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68matDsc, "")), 132, Gx_line+220, 352, Gx_line+237, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit1, "")), 622, Gx_line+27, 681, Gx_line+45, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Lit27, "")), 14, Gx_line+279, 88, Gx_line+297, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76ForTonal, "")), 95, Gx_line+279, 242, Gx_line+296, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84Lit29, "")), 543, Gx_line+124, 617, Gx_line+142, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV80TotMts, "ZZZZZZ9.99")), 674, Gx_line+125, 758, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 543, Gx_line+166, 565, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV85Rb, "ZZ9.99")), 703, Gx_line+166, 754, Gx_line+184, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87IntDscF, "")), 132, Gx_line+242, 352, Gx_line+259, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Lit31, "")), 11, Gx_line+242, 84, Gx_line+259, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV86IntCodF), "Z9")), 89, Gx_line+242, 105, Gx_line+259, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92Lit32, "")), 376, Gx_line+156, 486, Gx_line+174, 1+256, 0, 1, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV93ForFec, "99/99/99"), 402, Gx_line+177, 461, Gx_line+194, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95TipArtdsc, "")), 284, Gx_line+130, 504, Gx_line+147, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108Pgmname, "")), 258, Gx_line+60, 415, Gx_line+74, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+340) ;
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
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial Narrow", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics5( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics6( )
   {
      getPrinter().setMetrics("Courier New", true, true, 58, 14, 72, 123,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 30, 35, 35, 55, 45, 14, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 21, 21, 37, 37, 37, 38, 61, 45, 45, 45, 45, 42, 38, 49, 45, 17, 35, 45, 38, 52, 45, 49, 42, 49, 45, 42, 38, 45, 42, 59, 42, 42, 38, 21, 18, 23, 37, 35, 21, 35, 38, 35, 38, 35, 21, 38, 38, 18, 18, 35, 18, 56, 38, 38, 38, 38, 25, 35, 21, 38, 35, 49, 35, 35, 32, 25, 17, 25, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 36, 35, 35, 35, 17, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 21, 21, 36, 35, 21, 21, 21, 23, 35, 53, 53, 53, 38, 45, 45, 45, 45, 45, 45, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 35, 35, 35, 35, 35, 18, 18, 18, 18, 38, 38, 38, 38, 38, 38, 38, 35, 38, 38, 38, 38, 38, 35, 38, 35}) ;
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
      A910Workstat = "" ;
      AV10ForSer = "" ;
      AV11ForColNom = "" ;
      AV14TotKilos = DecimalUtil.ZERO ;
      AV16MaqCod = "" ;
      AV53Incre = DecimalUtil.ZERO ;
      AV79TotKilo = DecimalUtil.ZERO ;
      AV77Por_quebra = DecimalUtil.ZERO ;
      AV80TotMts = DecimalUtil.ZERO ;
      AV66ContDsc = "" ;
      GXv_int2 = new byte[1] ;
      AV31Lit0 = "" ;
      AV32Lit1 = "" ;
      AV24Lit2 = "" ;
      AV33Lit3 = "" ;
      AV26Lit4 = "" ;
      AV27Lit5 = "" ;
      AV28Lit6 = "" ;
      AV29Lit7 = "" ;
      AV30Lit8 = "" ;
      AV34Lit9 = "" ;
      AV35Lit10 = "" ;
      AV36Lit11 = "" ;
      AV37Lit12 = "" ;
      AV38Lit13 = "" ;
      AV39Lit14 = "" ;
      AV40Lit15 = "" ;
      AV45Lit16 = "" ;
      AV42Lit17 = "" ;
      AV43Lit18 = "" ;
      AV44Lit19 = "" ;
      AV51Lit20 = "" ;
      AV52Lit21 = "" ;
      AV54Lit22 = "" ;
      AV61Lit23 = "" ;
      AV62Lit24 = "" ;
      AV63Lit25 = "" ;
      AV69Lit26 = "" ;
      AV75Lit27 = "" ;
      AV78Lit28 = "" ;
      AV84Lit29 = "" ;
      AV88Lit31 = "" ;
      AV92Lit32 = "" ;
      GXt_char5 = "" ;
      scmdbuf = "" ;
      P06I62_A396EmprCod = new String[] {""} ;
      P06I62_A831TipColCod = new byte[1] ;
      P06I62_A483ForColNum = new int[1] ;
      P06I62_A482ForColNom = new String[] {""} ;
      P06I62_A494ForSer = new String[] {""} ;
      P06I62_A252CliCod = new int[1] ;
      P06I62_A1191ForNomCli = new String[] {""} ;
      P06I62_n1191ForNomCli = new boolean[] {false} ;
      P06I62_A583IntCod = new byte[1] ;
      P06I62_A584IntDsc = new String[] {""} ;
      P06I62_n584IntDsc = new boolean[] {false} ;
      P06I62_A5362IntCodF = new byte[1] ;
      P06I62_n5362IntCodF = new boolean[] {false} ;
      P06I62_A5363IntDscF = new String[] {""} ;
      P06I62_n5363IntDscF = new boolean[] {false} ;
      P06I62_A832TipColDsc = new String[] {""} ;
      P06I62_n832TipColDsc = new boolean[] {false} ;
      P06I62_A279CliNom = new String[] {""} ;
      P06I62_A1192ForNumCli = new int[1] ;
      P06I62_n1192ForNumCli = new boolean[] {false} ;
      P06I62_A995ForTonal = new String[] {""} ;
      P06I62_n995ForTonal = new boolean[] {false} ;
      P06I62_A626MatCod = new short[1] ;
      P06I62_A627MatDsc = new String[] {""} ;
      P06I62_n627MatDsc = new boolean[] {false} ;
      P06I62_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06I62_n485ForFec = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A1191ForNomCli = "" ;
      A584IntDsc = "" ;
      A5363IntDscF = "" ;
      A832TipColDsc = "" ;
      A279CliNom = "" ;
      A995ForTonal = "" ;
      A627MatDsc = "" ;
      A485ForFec = GXutil.nullDate() ;
      AV46ForNomCli = "" ;
      AV49IntDsc = "" ;
      AV87IntDscF = "" ;
      AV50TipColDsc = "" ;
      AV64CliNom = "" ;
      AV76ForTonal = "" ;
      AV68matDsc = "" ;
      AV93ForFec = GXutil.nullDate() ;
      GXv_char1 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char6 = new String[1] ;
      AV95TipArtdsc = "" ;
      GXv_char7 = new String[1] ;
      P06I63_A396EmprCod = new String[] {""} ;
      P06I63_A65ArtCod = new String[] {""} ;
      P06I63_A252CliCod = new int[1] ;
      P06I63_A69ArtDsc = new String[] {""} ;
      P06I63_n69ArtDsc = new boolean[] {false} ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      AV55ArtDsc = "" ;
      P06I64_A396EmprCod = new String[] {""} ;
      P06I64_A407EmprNom = new String[] {""} ;
      P06I64_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV25NomEmp = "" ;
      AV85Rb = DecimalUtil.ZERO ;
      AV57CosteP2 = DecimalUtil.ZERO ;
      AV56CosteP1 = DecimalUtil.ZERO ;
      AV22LastProces = "" ;
      AV58CosteC = DecimalUtil.ZERO ;
      AV60CosteD = DecimalUtil.ZERO ;
      AV59CosteA = DecimalUtil.ZERO ;
      P06I65_A396EmprCod = new String[] {""} ;
      P06I65_A910Workstat = new String[] {""} ;
      P06I65_A490ForPrdUMe = new byte[1] ;
      P06I65_A743PrdUniCon = new byte[1] ;
      P06I65_A719PrdNum = new String[] {""} ;
      P06I65_A10363EscMCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06I65_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06I65_A897EscMDsc = new String[] {""} ;
      P06I65_A764ProForCod = new String[] {""} ;
      P06I65_A771ProForTie = new short[1] ;
      P06I65_A772ProForTmx = new short[1] ;
      P06I65_A6877ProForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06I65_n6877ProForPhn = new boolean[] {false} ;
      P06I65_A6876ProForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06I65_n6876ProForPhx = new boolean[] {false} ;
      P06I65_A7584EscVolm = new int[1] ;
      P06I65_A766ProForDsc = new String[] {""} ;
      P06I65_A889EscMPrdPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06I65_A891EscMCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06I65_A488ForPrdDsc = new String[] {""} ;
      P06I65_n488ForPrdDsc = new boolean[] {false} ;
      P06I65_A718PrdNom = new String[] {""} ;
      P06I65_A887EscMLin = new int[1] ;
      A719PrdNum = "" ;
      A10363EscMCant = DecimalUtil.ZERO ;
      A890EscMCan = DecimalUtil.ZERO ;
      A897EscMDsc = "" ;
      A764ProForCod = "" ;
      A6877ProForPhn = DecimalUtil.ZERO ;
      A6876ProForPhx = DecimalUtil.ZERO ;
      A766ProForDsc = "" ;
      A889EscMPrdPre = DecimalUtil.ZERO ;
      A891EscMCos = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A718PrdNom = "" ;
      AV72Unidades = "" ;
      AV70CodPrd = "" ;
      AV73Cantidad = DecimalUtil.ZERO ;
      AV8Factor = "" ;
      AV23Unidad = "" ;
      AV99Proforphn = DecimalUtil.ZERO ;
      AV98Proforphx = DecimalUtil.ZERO ;
      AV65Prec_linea = DecimalUtil.ZERO ;
      AV94escmcos = DecimalUtil.ZERO ;
      AV20TotValor = DecimalUtil.ZERO ;
      AV81TotMtr = DecimalUtil.ZERO ;
      AV82Lit30 = "" ;
      AV91Coste_am = DecimalUtil.ZERO ;
      AV90Tot_kga = DecimalUtil.ZERO ;
      AV21TotKiloQ = DecimalUtil.ZERO ;
      AV83TotMetQ = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV108Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.rsimulaz__default(),
         new Object[] {
             new Object[] {
            P06I62_A396EmprCod, P06I62_A831TipColCod, P06I62_A483ForColNum, P06I62_A482ForColNom, P06I62_A494ForSer, P06I62_A252CliCod, P06I62_A1191ForNomCli, P06I62_n1191ForNomCli, P06I62_A583IntCod, P06I62_A584IntDsc,
            P06I62_n584IntDsc, P06I62_A5362IntCodF, P06I62_n5362IntCodF, P06I62_A5363IntDscF, P06I62_n5363IntDscF, P06I62_A832TipColDsc, P06I62_n832TipColDsc, P06I62_A279CliNom, P06I62_A1192ForNumCli, P06I62_n1192ForNumCli,
            P06I62_A995ForTonal, P06I62_n995ForTonal, P06I62_A626MatCod, P06I62_A627MatDsc, P06I62_n627MatDsc, P06I62_A485ForFec, P06I62_n485ForFec
            }
            , new Object[] {
            P06I63_A396EmprCod, P06I63_A65ArtCod, P06I63_A252CliCod, P06I63_A69ArtDsc, P06I63_n69ArtDsc
            }
            , new Object[] {
            P06I64_A396EmprCod, P06I64_A407EmprNom, P06I64_n407EmprNom
            }
            , new Object[] {
            P06I65_A396EmprCod, P06I65_A910Workstat, P06I65_A490ForPrdUMe, P06I65_A743PrdUniCon, P06I65_A719PrdNum, P06I65_A10363EscMCant, P06I65_A890EscMCan, P06I65_A897EscMDsc, P06I65_A764ProForCod, P06I65_A771ProForTie,
            P06I65_A772ProForTmx, P06I65_A6877ProForPhn, P06I65_n6877ProForPhn, P06I65_A6876ProForPhx, P06I65_n6876ProForPhx, P06I65_A7584EscVolm, P06I65_A766ProForDsc, P06I65_A889EscMPrdPre, P06I65_A891EscMCos, P06I65_A488ForPrdDsc,
            P06I65_n488ForPrdDsc, P06I65_A718PrdNom, P06I65_A887EscMLin
            }
         }
      );
      AV108Pgmname = "FormulacionTinte.RSIMULAZ" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV108Pgmname = "FormulacionTinte.RSIMULAZ" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV13TipColCod ;
   private byte AV71FlagUni ;
   private byte GXv_int2[] ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte A5362IntCodF ;
   private byte AV48IntCod ;
   private byte AV86IntCodF ;
   private byte A490ForPrdUMe ;
   private byte A743PrdUniCon ;
   private short gxcookieaux ;
   private short AV89CosteAm ;
   private short A626MatCod ;
   private short AV67MatCod ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short AV96ProForTie ;
   private short AV97Profortmx ;
   private short Gx_err ;
   private int AV9CliCod ;
   private int AV12ForColNum ;
   private int AV15Volumen ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GXt_int3 ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A1192ForNumCli ;
   private int AV47ForNumCli ;
   private int GXv_int4[] ;
   private int A7584EscVolm ;
   private int A887EscMLin ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV14TotKilos ;
   private java.math.BigDecimal AV53Incre ;
   private java.math.BigDecimal AV79TotKilo ;
   private java.math.BigDecimal AV77Por_quebra ;
   private java.math.BigDecimal AV80TotMts ;
   private java.math.BigDecimal AV85Rb ;
   private java.math.BigDecimal AV57CosteP2 ;
   private java.math.BigDecimal AV56CosteP1 ;
   private java.math.BigDecimal AV58CosteC ;
   private java.math.BigDecimal AV60CosteD ;
   private java.math.BigDecimal AV59CosteA ;
   private java.math.BigDecimal A10363EscMCant ;
   private java.math.BigDecimal A890EscMCan ;
   private java.math.BigDecimal A6877ProForPhn ;
   private java.math.BigDecimal A6876ProForPhx ;
   private java.math.BigDecimal A889EscMPrdPre ;
   private java.math.BigDecimal A891EscMCos ;
   private java.math.BigDecimal AV73Cantidad ;
   private java.math.BigDecimal AV99Proforphn ;
   private java.math.BigDecimal AV98Proforphx ;
   private java.math.BigDecimal AV65Prec_linea ;
   private java.math.BigDecimal AV94escmcos ;
   private java.math.BigDecimal AV20TotValor ;
   private java.math.BigDecimal AV81TotMtr ;
   private java.math.BigDecimal AV91Coste_am ;
   private java.math.BigDecimal AV90Tot_kga ;
   private java.math.BigDecimal AV21TotKiloQ ;
   private java.math.BigDecimal AV83TotMetQ ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A910Workstat ;
   private String AV10ForSer ;
   private String AV11ForColNom ;
   private String AV16MaqCod ;
   private String AV66ContDsc ;
   private String AV31Lit0 ;
   private String AV32Lit1 ;
   private String AV24Lit2 ;
   private String AV33Lit3 ;
   private String AV26Lit4 ;
   private String AV27Lit5 ;
   private String AV28Lit6 ;
   private String AV29Lit7 ;
   private String AV30Lit8 ;
   private String AV34Lit9 ;
   private String AV35Lit10 ;
   private String AV36Lit11 ;
   private String AV37Lit12 ;
   private String AV38Lit13 ;
   private String AV39Lit14 ;
   private String AV40Lit15 ;
   private String AV45Lit16 ;
   private String AV42Lit17 ;
   private String AV43Lit18 ;
   private String AV44Lit19 ;
   private String AV51Lit20 ;
   private String AV52Lit21 ;
   private String AV54Lit22 ;
   private String AV61Lit23 ;
   private String AV62Lit24 ;
   private String AV63Lit25 ;
   private String AV69Lit26 ;
   private String AV75Lit27 ;
   private String AV78Lit28 ;
   private String AV84Lit29 ;
   private String AV88Lit31 ;
   private String AV92Lit32 ;
   private String GXt_char5 ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A1191ForNomCli ;
   private String A584IntDsc ;
   private String A5363IntDscF ;
   private String A832TipColDsc ;
   private String A279CliNom ;
   private String A995ForTonal ;
   private String A627MatDsc ;
   private String AV46ForNomCli ;
   private String AV49IntDsc ;
   private String AV87IntDscF ;
   private String AV50TipColDsc ;
   private String AV64CliNom ;
   private String AV76ForTonal ;
   private String AV68matDsc ;
   private String GXv_char1[] ;
   private String GXv_char6[] ;
   private String AV95TipArtdsc ;
   private String GXv_char7[] ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String AV55ArtDsc ;
   private String A407EmprNom ;
   private String AV25NomEmp ;
   private String AV22LastProces ;
   private String A719PrdNum ;
   private String A897EscMDsc ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A488ForPrdDsc ;
   private String A718PrdNom ;
   private String AV72Unidades ;
   private String AV70CodPrd ;
   private String AV8Factor ;
   private String AV23Unidad ;
   private String AV82Lit30 ;
   private String Gx_time ;
   private String AV108Pgmname ;
   private java.util.Date A485ForFec ;
   private java.util.Date AV93ForFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1191ForNomCli ;
   private boolean n584IntDsc ;
   private boolean n5362IntCodF ;
   private boolean n5363IntDscF ;
   private boolean n832TipColDsc ;
   private boolean n1192ForNumCli ;
   private boolean n995ForTonal ;
   private boolean n627MatDsc ;
   private boolean n485ForFec ;
   private boolean n69ArtDsc ;
   private boolean n407EmprNom ;
   private boolean n6877ProForPhn ;
   private boolean n6876ProForPhx ;
   private boolean n488ForPrdDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P06I62_A396EmprCod ;
   private byte[] P06I62_A831TipColCod ;
   private int[] P06I62_A483ForColNum ;
   private String[] P06I62_A482ForColNom ;
   private String[] P06I62_A494ForSer ;
   private int[] P06I62_A252CliCod ;
   private String[] P06I62_A1191ForNomCli ;
   private boolean[] P06I62_n1191ForNomCli ;
   private byte[] P06I62_A583IntCod ;
   private String[] P06I62_A584IntDsc ;
   private boolean[] P06I62_n584IntDsc ;
   private byte[] P06I62_A5362IntCodF ;
   private boolean[] P06I62_n5362IntCodF ;
   private String[] P06I62_A5363IntDscF ;
   private boolean[] P06I62_n5363IntDscF ;
   private String[] P06I62_A832TipColDsc ;
   private boolean[] P06I62_n832TipColDsc ;
   private String[] P06I62_A279CliNom ;
   private int[] P06I62_A1192ForNumCli ;
   private boolean[] P06I62_n1192ForNumCli ;
   private String[] P06I62_A995ForTonal ;
   private boolean[] P06I62_n995ForTonal ;
   private short[] P06I62_A626MatCod ;
   private String[] P06I62_A627MatDsc ;
   private boolean[] P06I62_n627MatDsc ;
   private java.util.Date[] P06I62_A485ForFec ;
   private boolean[] P06I62_n485ForFec ;
   private String[] P06I63_A396EmprCod ;
   private String[] P06I63_A65ArtCod ;
   private int[] P06I63_A252CliCod ;
   private String[] P06I63_A69ArtDsc ;
   private boolean[] P06I63_n69ArtDsc ;
   private String[] P06I64_A396EmprCod ;
   private String[] P06I64_A407EmprNom ;
   private boolean[] P06I64_n407EmprNom ;
   private String[] P06I65_A396EmprCod ;
   private String[] P06I65_A910Workstat ;
   private byte[] P06I65_A490ForPrdUMe ;
   private byte[] P06I65_A743PrdUniCon ;
   private String[] P06I65_A719PrdNum ;
   private java.math.BigDecimal[] P06I65_A10363EscMCant ;
   private java.math.BigDecimal[] P06I65_A890EscMCan ;
   private String[] P06I65_A897EscMDsc ;
   private String[] P06I65_A764ProForCod ;
   private short[] P06I65_A771ProForTie ;
   private short[] P06I65_A772ProForTmx ;
   private java.math.BigDecimal[] P06I65_A6877ProForPhn ;
   private boolean[] P06I65_n6877ProForPhn ;
   private java.math.BigDecimal[] P06I65_A6876ProForPhx ;
   private boolean[] P06I65_n6876ProForPhx ;
   private int[] P06I65_A7584EscVolm ;
   private String[] P06I65_A766ProForDsc ;
   private java.math.BigDecimal[] P06I65_A889EscMPrdPre ;
   private java.math.BigDecimal[] P06I65_A891EscMCos ;
   private String[] P06I65_A488ForPrdDsc ;
   private boolean[] P06I65_n488ForPrdDsc ;
   private String[] P06I65_A718PrdNom ;
   private int[] P06I65_A887EscMLin ;
}

final  class rsimulaz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06I62", "SELECT T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.ForNomCli, T1.IntCod, T3.IntDsc, T1.IntCodF, T6.IntDscF, T5.TipColDsc, T2.CliNom, T1.ForNumCli, T1.ForTonal, T1.MatCod, T4.MatDsc, T1.ForFec FROM (((((TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod) INNER JOIN TXPMATICE T4 ON T4.EmprCod = T1.EmprCod AND T4.MatCod = T1.MatCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = T1.EmprCod AND T5.TipColCod = T1.TipColCod) LEFT JOIN TXPINTFAC T6 ON T6.EmprCod = T1.EmprCod AND T6.IntCodF = T1.IntCodF) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06I63", "SELECT EmprCod, ArtCod, CliCod, ArtDsc FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06I64", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06I65", "SELECT T1.EmprCod, T1.Workstat, T1.ForPrdUMe, T2.PrdUniCon, T1.PrdNum, T1.EscMCant, T1.EscMCan, T1.EscMDsc, T1.ProForCod, T3.ProForTie, T3.ProForTmx, T3.ProForPhn, T3.ProForPhx, T1.EscVolm, T3.ProForDsc, T1.EscMPrdPre, T1.EscMCos, T4.ForPrdDsc, T2.PrdNom, T1.EscMLin FROM (((TXPESCMAN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPCPROFO T3 ON T3.EmprCod = T1.EmprCod AND T3.ProForCod = T1.ProForCod) INNER JOIN TXPUNMEPR T4 ON T4.EmprCod = T1.EmprCod AND T4.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Workstat = ? ORDER BY T1.EmprCod, T1.Workstat, T1.EscMLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 30);
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(16);
               ((String[]) buf[23])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 30);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,5);
               ((String[]) buf[19])[0] = rslt.getString(18, 5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 26);
               ((int[]) buf[22])[0] = rslt.getInt(20);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

