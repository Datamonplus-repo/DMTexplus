package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rfo0002_impl extends GXWebReport
{
   public rfo0002_impl( com.genexus.internet.HttpContext context )
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
            AV16PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV17UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV18PSerie = httpContext.GetPar( "PSerie") ;
            AV19USerie = httpContext.GetPar( "USerie") ;
            AV20PColor = (int)(GXutil.lval( httpContext.GetPar( "PColor"))) ;
            AV21UColor = (int)(GXutil.lval( httpContext.GetPar( "UColor"))) ;
            AV22PNumCol = httpContext.GetPar( "PNumCol") ;
            AV23UNumCol = httpContext.GetPar( "UNumCol") ;
            AV67tc1 = (byte)(GXutil.lval( httpContext.GetPar( "tc1"))) ;
            AV68Tc2 = (byte)(GXutil.lval( httpContext.GetPar( "Tc2"))) ;
            AV69fornumcolfrom = (int)(GXutil.lval( httpContext.GetPar( "fornumcolfrom"))) ;
            AV70fornumcolto = (int)(GXutil.lval( httpContext.GetPar( "fornumcolto"))) ;
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
         GXt_char1 = AV32Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN068_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit0 = GXt_char1 ;
         GXt_char1 = AV33Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit1 = GXt_char1 ;
         GXt_char1 = AV34Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit2 = GXt_char1 ;
         GXt_char1 = AV35Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit3 = GXt_char1 ;
         GXt_char1 = AV36Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit4 = GXt_char1 ;
         GXt_char1 = AV37Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1355_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit5 = GXt_char1 ;
         GXt_char1 = AV38Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN387_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit6 = GXt_char1 ;
         GXt_char1 = AV39Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN437_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit7 = GXt_char1 ;
         GXt_char1 = AV40Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2385_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit8 = GXt_char1 ;
         GXt_char1 = AV41Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2145_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit9 = GXt_char1 ;
         GXt_char1 = AV42Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN368_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit10 = GXt_char1 ;
         GXt_char1 = AV43Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN210_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit11 = GXt_char1 ;
         GXt_char1 = AV44Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1334_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit12 = GXt_char1 ;
         GXt_char1 = AV45Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN203_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit13 = GXt_char1 ;
         GXt_char1 = AV49Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit14 = GXt_char1 ;
         GXt_char1 = AV50Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN076_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit15 = GXt_char1 ;
         GXt_char1 = AV51Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2458_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV51Lit16 = GXt_char1 ;
         GXt_char1 = AV61Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV61Lit17 = GXt_char1 ;
         GXt_char1 = AV62Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1193_", ""), (byte)(99), GXv_char2) ;
         rfo0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV62Lit18 = GXt_char1 ;
         /* Using cursor P06FT2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06FT2_A407EmprNom[0] ;
            n407EmprNom = P06FT2_n407EmprNom[0] ;
            AV24NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXv_int3[0] = AV56FlagIdioma ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100001", GXv_int3) ;
         rfo0002_impl.this.AV56FlagIdioma = GXv_int3[0] ;
         GXv_int3[0] = AV60FlagTintex ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int3) ;
         rfo0002_impl.this.AV60FlagTintex = GXv_int3[0] ;
         GXv_int3[0] = AV63ClaveColor ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLAVEC", ""), GXv_int3) ;
         rfo0002_impl.this.AV63ClaveColor = GXv_int3[0] ;
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
         GxHdr3 = true ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV16PCliCod) ,
                                              Integer.valueOf(AV17UCliCod) ,
                                              AV18PSerie ,
                                              AV19USerie ,
                                              Integer.valueOf(AV20PColor) ,
                                              Integer.valueOf(AV21UColor) ,
                                              AV22PNumCol ,
                                              AV23UNumCol ,
                                              Byte.valueOf(AV67tc1) ,
                                              Byte.valueOf(AV68Tc2) ,
                                              Integer.valueOf(AV69fornumcolfrom) ,
                                              Integer.valueOf(AV70fornumcolto) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A494ForSer ,
                                              Integer.valueOf(A483ForColNum) ,
                                              A482ForColNom ,
                                              Byte.valueOf(A831TipColCod) ,
                                              Integer.valueOf(A486ForNumCol) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING
                                              }
         });
         /* Using cursor P06FT3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16PCliCod), Integer.valueOf(AV17UCliCod), AV18PSerie, AV19USerie, Integer.valueOf(AV20PColor), Integer.valueOf(AV21UColor), AV22PNumCol, AV23UNumCol, Byte.valueOf(AV67tc1), Byte.valueOf(AV68Tc2), Integer.valueOf(AV69fornumcolfrom), Integer.valueOf(AV70fornumcolto)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A483ForColNum = P06FT3_A483ForColNum[0] ;
            A482ForColNom = P06FT3_A482ForColNom[0] ;
            A494ForSer = P06FT3_A494ForSer[0] ;
            A252CliCod = P06FT3_A252CliCod[0] ;
            A831TipColCod = P06FT3_A831TipColCod[0] ;
            A486ForNumCol = P06FT3_A486ForNumCol[0] ;
            A832TipColDsc = P06FT3_A832TipColDsc[0] ;
            n832TipColDsc = P06FT3_n832TipColDsc[0] ;
            A7537ForOpNum = P06FT3_A7537ForOpNum[0] ;
            n7537ForOpNum = P06FT3_n7537ForOpNum[0] ;
            A5742ForSerDsc = P06FT3_A5742ForSerDsc[0] ;
            n5742ForSerDsc = P06FT3_n5742ForSerDsc[0] ;
            A584IntDsc = P06FT3_A584IntDsc[0] ;
            n584IntDsc = P06FT3_n584IntDsc[0] ;
            A583IntCod = P06FT3_A583IntCod[0] ;
            A995ForTonal = P06FT3_A995ForTonal[0] ;
            n995ForTonal = P06FT3_n995ForTonal[0] ;
            A1192ForNumCli = P06FT3_A1192ForNumCli[0] ;
            n1192ForNumCli = P06FT3_n1192ForNumCli[0] ;
            A1191ForNomCli = P06FT3_A1191ForNomCli[0] ;
            n1191ForNomCli = P06FT3_n1191ForNomCli[0] ;
            A279CliNom = P06FT3_A279CliNom[0] ;
            A279CliNom = P06FT3_A279CliNom[0] ;
            A584IntDsc = P06FT3_A584IntDsc[0] ;
            n584IntDsc = P06FT3_n584IntDsc[0] ;
            A832TipColDsc = P06FT3_A832TipColDsc[0] ;
            n832TipColDsc = P06FT3_n832TipColDsc[0] ;
            AV52TipColDsc = A832TipColDsc ;
            AV30ForNumCol = A486ForNumCol ;
            AV65Foropnum = A7537ForOpNum ;
            AV66Texto_c = A482ForColNom ;
            AV53Flag1 = (byte)(0) ;
            AV54ContLin = (byte)(0) ;
            /* Using cursor P06FT4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A764ProForCod = P06FT4_A764ProForCod[0] ;
               A766ProForDsc = P06FT4_A766ProForDsc[0] ;
               A1160ProForL = P06FT4_A1160ProForL[0] ;
               A766ProForDsc = P06FT4_A766ProForDsc[0] ;
               if ( AV53Flag1 == 0 )
               {
                  AV53Flag1 = (byte)(1) ;
                  AV54ContLin = (byte)(1) ;
                  h6FT0( false, 33) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 205, Gx_line+9, 250, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 254, Gx_line+9, 474, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit11, "")), 97, Gx_line+9, 178, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(82, Gx_line+4, 505, Gx_line+31, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Var1, "")), 552, Gx_line+8, 720, Gx_line+28, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+33) ;
               }
               else
               {
                  h6FT0( false, 34) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 205, Gx_line+10, 250, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 254, Gx_line+10, 474, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit11, "")), 97, Gx_line+10, 178, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(82, Gx_line+5, 505, Gx_line+32, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+34) ;
               }
               /* Using cursor P06FT5 */
               pr_default.execute(3, new Object[] {A396EmprCod, A764ProForCod});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A490ForPrdUMe = P06FT5_A490ForPrdUMe[0] ;
                  A1645ProForNro = P06FT5_A1645ProForNro[0] ;
                  A770ProForPrd = P06FT5_A770ProForPrd[0] ;
                  A762ProForCan = P06FT5_A762ProForCan[0] ;
                  A763ProForCla = P06FT5_A763ProForCla[0] ;
                  A488ForPrdDsc = P06FT5_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P06FT5_n488ForPrdDsc[0] ;
                  A765ProForDes = P06FT5_A765ProForDes[0] ;
                  A767ProForLin = P06FT5_A767ProForLin[0] ;
                  A488ForPrdDsc = P06FT5_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P06FT5_n488ForPrdDsc[0] ;
                  if ( (0==A1645ProForNro) )
                  {
                     AV46ProForNro = "  " ;
                  }
                  else
                  {
                     AV46ProForNro = GXutil.str( A1645ProForNro, 2, 0) ;
                  }
                  if ( (GXutil.strcmp("", A770ProForPrd)==0) || ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 3, 1), " ") != 0 ) )
                  {
                     if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "#") != 0 )
                     {
                        if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A762ProForCan)==0) )
                        {
                           if ( AV54ContLin == 8 )
                           {
                              h6FT0( false, 19) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 30, Gx_line+1, 75, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 80, Gx_line+1, 271, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 373, Gx_line+1, 410, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46ProForNro, "")), 416, Gx_line+1, 432, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A763ProForCla, "")), 434, Gx_line+1, 552, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 12, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Var2, "")), 560, Gx_line+0, 728, Gx_line+20, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+19) ;
                              AV54ContLin = (byte)(AV54ContLin+1) ;
                           }
                           else
                           {
                              h6FT0( false, 17) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 373, Gx_line+0, 410, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46ProForNro, "")), 416, Gx_line+0, 432, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A763ProForCla, "")), 440, Gx_line+0, 558, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 30, Gx_line+0, 75, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 80, Gx_line+1, 271, Gx_line+18, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+17) ;
                              AV54ContLin = (byte)(AV54ContLin+1) ;
                           }
                        }
                        else
                        {
                           if ( AV54ContLin == 8 )
                           {
                              h6FT0( false, 18) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 30, Gx_line+1, 75, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 80, Gx_line+1, 271, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 373, Gx_line+1, 410, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A762ProForCan, "ZZZZZ9.9999")), 280, Gx_line+1, 369, Gx_line+18, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46ProForNro, "")), 416, Gx_line+1, 432, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A763ProForCla, "")), 440, Gx_line+1, 558, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 12, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Var2, "")), 560, Gx_line+0, 728, Gx_line+20, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+18) ;
                              AV54ContLin = (byte)(AV54ContLin+1) ;
                           }
                           else
                           {
                              h6FT0( false, 17) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 30, Gx_line+0, 75, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 80, Gx_line+0, 271, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 373, Gx_line+0, 410, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A762ProForCan, "ZZZZZ9.9999")), 280, Gx_line+0, 369, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46ProForNro, "")), 416, Gx_line+0, 432, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A763ProForCla, "")), 440, Gx_line+0, 558, Gx_line+17, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+17) ;
                              AV54ContLin = (byte)(AV54ContLin+1) ;
                           }
                        }
                     }
                  }
                  AV31ProForPrd = A770ProForPrd ;
                  AV64ForClaCol = A763ProForCla ;
                  /* Execute user subroutine: 'PRDCOL' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(3);
                     pr_default.close(3);
                     pr_default.close(2);
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
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV55FlagObs = (byte)(0) ;
            /* Using cursor P06FT6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A649ObsForTxt = P06FT6_A649ObsForTxt[0] ;
               A650ObsLin = P06FT6_A650ObsLin[0] ;
               if ( AV55FlagObs == 0 )
               {
                  AV55FlagObs = (byte)(1) ;
                  h6FT0( false, 36) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A649ObsForTxt, "")), 70, Gx_line+16, 259, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Obs.", ""), 32, Gx_line+17, 62, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(5, Gx_line+10, 703, Gx_line+10, 2, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+36) ;
               }
               else
               {
                  h6FT0( false, 17) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A649ObsForTxt, "")), 73, Gx_line+0, 262, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Eject command */
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(P_lines+1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6FT0( true, 0) ;
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
      /* 'PRDCOL' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(GXutil.substring( AV31ProForPrd, 1, 1), "#") == 0 )
      {
         /* Using cursor P06FT7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV30ForNumCol), AV31ProForPrd});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A490ForPrdUMe = P06FT7_A490ForPrdUMe[0] ;
            A489ForPrdNor = P06FT7_A489ForPrdNor[0] ;
            A486ForNumCol = P06FT7_A486ForNumCol[0] ;
            A487ForPrdCan = P06FT7_A487ForPrdCan[0] ;
            A488ForPrdDsc = P06FT7_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P06FT7_n488ForPrdDsc[0] ;
            A718PrdNom = P06FT7_A718PrdNom[0] ;
            A719PrdNum = P06FT7_A719PrdNum[0] ;
            A715PrdLin = P06FT7_A715PrdLin[0] ;
            A718PrdNom = P06FT7_A718PrdNom[0] ;
            A488ForPrdDsc = P06FT7_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P06FT7_n488ForPrdDsc[0] ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A487ForPrdCan)==0) )
            {
               if ( AV54ContLin == 8 )
               {
                  h6FT0( false, 19) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 30, Gx_line+1, 75, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 80, Gx_line+1, 271, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 373, Gx_line+1, 410, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Var2, "")), 552, Gx_line+0, 720, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46ProForNro, "")), 416, Gx_line+0, 432, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+19) ;
                  AV54ContLin = (byte)(AV54ContLin+1) ;
               }
               else
               {
                  h6FT0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 30, Gx_line+0, 75, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 80, Gx_line+0, 271, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 373, Gx_line+0, 410, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46ProForNro, "")), 416, Gx_line+0, 432, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV54ContLin = (byte)(AV54ContLin+1) ;
               }
            }
            else
            {
               if ( AV54ContLin == 8 )
               {
                  h6FT0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 30, Gx_line+1, 75, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 80, Gx_line+1, 271, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 373, Gx_line+1, 410, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A487ForPrdCan, "ZZZZ9.99999")), 288, Gx_line+1, 369, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Var2, "")), 552, Gx_line+0, 720, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46ProForNro, "")), 416, Gx_line+0, 432, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV54ContLin = (byte)(AV54ContLin+1) ;
               }
               else
               {
                  h6FT0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 30, Gx_line+0, 75, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 80, Gx_line+0, 271, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 373, Gx_line+0, 410, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A487ForPrdCan, "ZZZZ9.99999")), 288, Gx_line+0, 369, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46ProForNro, "")), 416, Gx_line+0, 432, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV54ContLin = (byte)(AV54ContLin+1) ;
               }
            }
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      else
      {
         if ( GXutil.strcmp(GXutil.substring( AV31ProForPrd, 3, 1), " ") == 0 )
         {
            if ( GXutil.strcmp(GXutil.substring( AV31ProForPrd, 2, 1), " ") == 0 )
            {
               AV29Ncar = (byte)(1) ;
            }
            else
            {
               AV29Ncar = (byte)(2) ;
            }
            /* Using cursor P06FT8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV30ForNumCol), Byte.valueOf(AV29Ncar), AV31ProForPrd, Byte.valueOf(AV29Ncar)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A490ForPrdUMe = P06FT8_A490ForPrdUMe[0] ;
               A719PrdNum = P06FT8_A719PrdNum[0] ;
               A486ForNumCol = P06FT8_A486ForNumCol[0] ;
               A6193ForClaCol = P06FT8_A6193ForClaCol[0] ;
               A481ForCan = P06FT8_A481ForCan[0] ;
               A488ForPrdDsc = P06FT8_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P06FT8_n488ForPrdDsc[0] ;
               A718PrdNom = P06FT8_A718PrdNom[0] ;
               A309ColLin = P06FT8_A309ColLin[0] ;
               A718PrdNom = P06FT8_A718PrdNom[0] ;
               A488ForPrdDsc = P06FT8_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P06FT8_n488ForPrdDsc[0] ;
               if ( AV63ClaveColor == 1 )
               {
                  AV64ForClaCol = ((GXutil.strcmp(A6193ForClaCol, "")==0) ? AV64ForClaCol : A6193ForClaCol) ;
               }
               if ( AV54ContLin == 8 )
               {
                  h6FT0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 30, Gx_line+1, 75, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 80, Gx_line+1, 271, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 373, Gx_line+1, 410, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A481ForCan, "ZZZZ9.99999")), 288, Gx_line+1, 369, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Var2, "")), 552, Gx_line+0, 720, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46ProForNro, "")), 416, Gx_line+0, 432, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64ForClaCol, "")), 434, Gx_line+1, 552, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV54ContLin = (byte)(AV54ContLin+1) ;
               }
               else
               {
                  h6FT0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 30, Gx_line+0, 75, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 80, Gx_line+0, 271, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 373, Gx_line+0, 410, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A481ForCan, "ZZZZ9.99999")), 288, Gx_line+0, 369, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46ProForNro, "")), 416, Gx_line+0, 432, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64ForClaCol, "")), 434, Gx_line+0, 552, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV54ContLin = (byte)(AV54ContLin+1) ;
               }
               pr_default.readNext(6);
            }
            pr_default.close(6);
         }
      }
   }

   public void h6FT0( boolean bFoot ,
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
            if ( GxHdr3 )
            {
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24NomEmp, "")), 21, Gx_line+0, 335, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit1, "")), 452, Gx_line+1, 487, Gx_line+17, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 501, Gx_line+1, 552, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit2, "")), 567, Gx_line+1, 595, Gx_line+17, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 614, Gx_line+1, 715, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit0, "")), 22, Gx_line+30, 162, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit3, "")), 567, Gx_line+31, 608, Gx_line+47, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 614, Gx_line+31, 659, Gx_line+48, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit4, "")), 25, Gx_line+63, 106, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 117, Gx_line+64, 162, Gx_line+81, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 166, Gx_line+64, 355, Gx_line+81, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit5, "")), 25, Gx_line+81, 105, Gx_line+97, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit6, "")), 244, Gx_line+81, 302, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit9, "")), 117, Gx_line+149, 199, Gx_line+166, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+52, 726, Gx_line+52, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A494ForSer, "")), 117, Gx_line+81, 218, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Texto_c, "")), 306, Gx_line+81, 407, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 467, Gx_line+81, 512, Gx_line+98, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 542, Gx_line+81, 558, Gx_line+98, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TipColDsc, "")), 561, Gx_line+81, 687, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit14, "")), 25, Gx_line+127, 105, Gx_line+143, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1191ForNomCli, "")), 117, Gx_line+127, 199, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9")), 209, Gx_line+127, 254, Gx_line+144, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(9, Gx_line+157, 105, Gx_line+157, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(206, Gx_line+157, 725, Gx_line+157, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(11, Gx_line+57, 721, Gx_line+124, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit16, "")), 516, Gx_line+81, 540, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Var3, "")), 229, Gx_line+32, 396, Gx_line+47, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 429, Gx_line+81, 444, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit17, "")), 428, Gx_line+127, 481, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A995ForTonal, "")), 497, Gx_line+127, 623, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit18, "")), 428, Gx_line+100, 488, Gx_line+116, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9")), 497, Gx_line+100, 513, Gx_line+117, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A584IntDsc, "")), 519, Gx_line+100, 708, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79Pgmname, "")), 452, Gx_line+32, 507, Gx_line+47, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")), 117, Gx_line+100, 281, Gx_line+117, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+175) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06FT2_A396EmprCod = new String[] {""} ;
      P06FT2_A407EmprNom = new String[] {""} ;
      P06FT2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV24NomEmp = "" ;
      GXv_int3 = new byte[1] ;
      AV57Var1 = "" ;
      AV58Var2 = "" ;
      AV59Var3 = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      P06FT3_A396EmprCod = new String[] {""} ;
      P06FT3_A483ForColNum = new int[1] ;
      P06FT3_A482ForColNom = new String[] {""} ;
      P06FT3_A494ForSer = new String[] {""} ;
      P06FT3_A252CliCod = new int[1] ;
      P06FT3_A831TipColCod = new byte[1] ;
      P06FT3_A486ForNumCol = new int[1] ;
      P06FT3_A832TipColDsc = new String[] {""} ;
      P06FT3_n832TipColDsc = new boolean[] {false} ;
      P06FT3_A7537ForOpNum = new byte[1] ;
      P06FT3_n7537ForOpNum = new boolean[] {false} ;
      P06FT3_A5742ForSerDsc = new String[] {""} ;
      P06FT3_n5742ForSerDsc = new boolean[] {false} ;
      P06FT3_A584IntDsc = new String[] {""} ;
      P06FT3_n584IntDsc = new boolean[] {false} ;
      P06FT3_A583IntCod = new byte[1] ;
      P06FT3_A995ForTonal = new String[] {""} ;
      P06FT3_n995ForTonal = new boolean[] {false} ;
      P06FT3_A1192ForNumCli = new int[1] ;
      P06FT3_n1192ForNumCli = new boolean[] {false} ;
      P06FT3_A1191ForNomCli = new String[] {""} ;
      P06FT3_n1191ForNomCli = new boolean[] {false} ;
      P06FT3_A279CliNom = new String[] {""} ;
      A832TipColDsc = "" ;
      A5742ForSerDsc = "" ;
      A584IntDsc = "" ;
      A995ForTonal = "" ;
      A1191ForNomCli = "" ;
      A279CliNom = "" ;
      AV52TipColDsc = "" ;
      AV66Texto_c = "" ;
      P06FT4_A396EmprCod = new String[] {""} ;
      P06FT4_A252CliCod = new int[1] ;
      P06FT4_A494ForSer = new String[] {""} ;
      P06FT4_A482ForColNom = new String[] {""} ;
      P06FT4_A483ForColNum = new int[1] ;
      P06FT4_A831TipColCod = new byte[1] ;
      P06FT4_A764ProForCod = new String[] {""} ;
      P06FT4_A766ProForDsc = new String[] {""} ;
      P06FT4_A1160ProForL = new short[1] ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      P06FT5_A490ForPrdUMe = new byte[1] ;
      P06FT5_A396EmprCod = new String[] {""} ;
      P06FT5_A764ProForCod = new String[] {""} ;
      P06FT5_A1645ProForNro = new byte[1] ;
      P06FT5_A770ProForPrd = new String[] {""} ;
      P06FT5_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06FT5_A763ProForCla = new String[] {""} ;
      P06FT5_A488ForPrdDsc = new String[] {""} ;
      P06FT5_n488ForPrdDsc = new boolean[] {false} ;
      P06FT5_A765ProForDes = new String[] {""} ;
      P06FT5_A767ProForLin = new short[1] ;
      A770ProForPrd = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A763ProForCla = "" ;
      A488ForPrdDsc = "" ;
      A765ProForDes = "" ;
      AV46ProForNro = "" ;
      AV31ProForPrd = "" ;
      AV64ForClaCol = "" ;
      P06FT6_A396EmprCod = new String[] {""} ;
      P06FT6_A252CliCod = new int[1] ;
      P06FT6_A494ForSer = new String[] {""} ;
      P06FT6_A482ForColNom = new String[] {""} ;
      P06FT6_A483ForColNum = new int[1] ;
      P06FT6_A831TipColCod = new byte[1] ;
      P06FT6_A649ObsForTxt = new String[] {""} ;
      P06FT6_A650ObsLin = new short[1] ;
      A649ObsForTxt = "" ;
      P06FT7_A490ForPrdUMe = new byte[1] ;
      P06FT7_A396EmprCod = new String[] {""} ;
      P06FT7_A489ForPrdNor = new short[1] ;
      P06FT7_A486ForNumCol = new int[1] ;
      P06FT7_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06FT7_A488ForPrdDsc = new String[] {""} ;
      P06FT7_n488ForPrdDsc = new boolean[] {false} ;
      P06FT7_A718PrdNom = new String[] {""} ;
      P06FT7_A719PrdNum = new String[] {""} ;
      P06FT7_A715PrdLin = new short[1] ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      P06FT8_A490ForPrdUMe = new byte[1] ;
      P06FT8_A396EmprCod = new String[] {""} ;
      P06FT8_A719PrdNum = new String[] {""} ;
      P06FT8_A486ForNumCol = new int[1] ;
      P06FT8_A6193ForClaCol = new String[] {""} ;
      P06FT8_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06FT8_A488ForPrdDsc = new String[] {""} ;
      P06FT8_n488ForPrdDsc = new boolean[] {false} ;
      P06FT8_A718PrdNom = new String[] {""} ;
      P06FT8_A309ColLin = new short[1] ;
      A6193ForClaCol = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV79Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.rfo0002__default(),
         new Object[] {
             new Object[] {
            P06FT2_A396EmprCod, P06FT2_A407EmprNom, P06FT2_n407EmprNom
            }
            , new Object[] {
            P06FT3_A396EmprCod, P06FT3_A483ForColNum, P06FT3_A482ForColNom, P06FT3_A494ForSer, P06FT3_A252CliCod, P06FT3_A831TipColCod, P06FT3_A486ForNumCol, P06FT3_A832TipColDsc, P06FT3_n832TipColDsc, P06FT3_A7537ForOpNum,
            P06FT3_n7537ForOpNum, P06FT3_A5742ForSerDsc, P06FT3_n5742ForSerDsc, P06FT3_A584IntDsc, P06FT3_n584IntDsc, P06FT3_A583IntCod, P06FT3_A995ForTonal, P06FT3_n995ForTonal, P06FT3_A1192ForNumCli, P06FT3_n1192ForNumCli,
            P06FT3_A1191ForNomCli, P06FT3_n1191ForNomCli, P06FT3_A279CliNom
            }
            , new Object[] {
            P06FT4_A396EmprCod, P06FT4_A252CliCod, P06FT4_A494ForSer, P06FT4_A482ForColNom, P06FT4_A483ForColNum, P06FT4_A831TipColCod, P06FT4_A764ProForCod, P06FT4_A766ProForDsc, P06FT4_A1160ProForL
            }
            , new Object[] {
            P06FT5_A490ForPrdUMe, P06FT5_A396EmprCod, P06FT5_A764ProForCod, P06FT5_A1645ProForNro, P06FT5_A770ProForPrd, P06FT5_A762ProForCan, P06FT5_A763ProForCla, P06FT5_A488ForPrdDsc, P06FT5_n488ForPrdDsc, P06FT5_A765ProForDes,
            P06FT5_A767ProForLin
            }
            , new Object[] {
            P06FT6_A396EmprCod, P06FT6_A252CliCod, P06FT6_A494ForSer, P06FT6_A482ForColNom, P06FT6_A483ForColNum, P06FT6_A831TipColCod, P06FT6_A649ObsForTxt, P06FT6_A650ObsLin
            }
            , new Object[] {
            P06FT7_A490ForPrdUMe, P06FT7_A396EmprCod, P06FT7_A489ForPrdNor, P06FT7_A486ForNumCol, P06FT7_A487ForPrdCan, P06FT7_A488ForPrdDsc, P06FT7_n488ForPrdDsc, P06FT7_A718PrdNom, P06FT7_A719PrdNum, P06FT7_A715PrdLin
            }
            , new Object[] {
            P06FT8_A490ForPrdUMe, P06FT8_A396EmprCod, P06FT8_A719PrdNum, P06FT8_A486ForNumCol, P06FT8_A6193ForClaCol, P06FT8_A481ForCan, P06FT8_A488ForPrdDsc, P06FT8_n488ForPrdDsc, P06FT8_A718PrdNom, P06FT8_A309ColLin
            }
         }
      );
      AV79Pgmname = "FormulacionTinte.RFO0002" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV79Pgmname = "FormulacionTinte.RFO0002" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV67tc1 ;
   private byte AV68Tc2 ;
   private byte AV56FlagIdioma ;
   private byte AV60FlagTintex ;
   private byte AV63ClaveColor ;
   private byte GXv_int3[] ;
   private byte A831TipColCod ;
   private byte A7537ForOpNum ;
   private byte A583IntCod ;
   private byte AV65Foropnum ;
   private byte AV53Flag1 ;
   private byte AV54ContLin ;
   private byte A490ForPrdUMe ;
   private byte A1645ProForNro ;
   private byte AV55FlagObs ;
   private byte AV29Ncar ;
   private short gxcookieaux ;
   private short A1160ProForL ;
   private short A767ProForLin ;
   private short A650ObsLin ;
   private short A489ForPrdNor ;
   private short A715PrdLin ;
   private short A309ColLin ;
   private short Gx_err ;
   private int AV16PCliCod ;
   private int AV17UCliCod ;
   private int AV20PColor ;
   private int AV21UColor ;
   private int AV69fornumcolfrom ;
   private int AV70fornumcolto ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int A1192ForNumCli ;
   private int AV30ForNumCol ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal A487ForPrdCan ;
   private java.math.BigDecimal A481ForCan ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
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
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV24NomEmp ;
   private String AV57Var1 ;
   private String AV58Var2 ;
   private String AV59Var3 ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A832TipColDsc ;
   private String A5742ForSerDsc ;
   private String A584IntDsc ;
   private String A995ForTonal ;
   private String A1191ForNomCli ;
   private String A279CliNom ;
   private String AV52TipColDsc ;
   private String AV66Texto_c ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A770ProForPrd ;
   private String A763ProForCla ;
   private String A488ForPrdDsc ;
   private String A765ProForDes ;
   private String AV46ProForNro ;
   private String AV31ProForPrd ;
   private String AV64ForClaCol ;
   private String A649ObsForTxt ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A6193ForClaCol ;
   private String Gx_time ;
   private String AV79Pgmname ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n832TipColDsc ;
   private boolean n7537ForOpNum ;
   private boolean n5742ForSerDsc ;
   private boolean n584IntDsc ;
   private boolean n995ForTonal ;
   private boolean n1192ForNumCli ;
   private boolean n1191ForNomCli ;
   private boolean n488ForPrdDsc ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P06FT2_A396EmprCod ;
   private String[] P06FT2_A407EmprNom ;
   private boolean[] P06FT2_n407EmprNom ;
   private String[] P06FT3_A396EmprCod ;
   private int[] P06FT3_A483ForColNum ;
   private String[] P06FT3_A482ForColNom ;
   private String[] P06FT3_A494ForSer ;
   private int[] P06FT3_A252CliCod ;
   private byte[] P06FT3_A831TipColCod ;
   private int[] P06FT3_A486ForNumCol ;
   private String[] P06FT3_A832TipColDsc ;
   private boolean[] P06FT3_n832TipColDsc ;
   private byte[] P06FT3_A7537ForOpNum ;
   private boolean[] P06FT3_n7537ForOpNum ;
   private String[] P06FT3_A5742ForSerDsc ;
   private boolean[] P06FT3_n5742ForSerDsc ;
   private String[] P06FT3_A584IntDsc ;
   private boolean[] P06FT3_n584IntDsc ;
   private byte[] P06FT3_A583IntCod ;
   private String[] P06FT3_A995ForTonal ;
   private boolean[] P06FT3_n995ForTonal ;
   private int[] P06FT3_A1192ForNumCli ;
   private boolean[] P06FT3_n1192ForNumCli ;
   private String[] P06FT3_A1191ForNomCli ;
   private boolean[] P06FT3_n1191ForNomCli ;
   private String[] P06FT3_A279CliNom ;
   private String[] P06FT4_A396EmprCod ;
   private int[] P06FT4_A252CliCod ;
   private String[] P06FT4_A494ForSer ;
   private String[] P06FT4_A482ForColNom ;
   private int[] P06FT4_A483ForColNum ;
   private byte[] P06FT4_A831TipColCod ;
   private String[] P06FT4_A764ProForCod ;
   private String[] P06FT4_A766ProForDsc ;
   private short[] P06FT4_A1160ProForL ;
   private byte[] P06FT5_A490ForPrdUMe ;
   private String[] P06FT5_A396EmprCod ;
   private String[] P06FT5_A764ProForCod ;
   private byte[] P06FT5_A1645ProForNro ;
   private String[] P06FT5_A770ProForPrd ;
   private java.math.BigDecimal[] P06FT5_A762ProForCan ;
   private String[] P06FT5_A763ProForCla ;
   private String[] P06FT5_A488ForPrdDsc ;
   private boolean[] P06FT5_n488ForPrdDsc ;
   private String[] P06FT5_A765ProForDes ;
   private short[] P06FT5_A767ProForLin ;
   private String[] P06FT6_A396EmprCod ;
   private int[] P06FT6_A252CliCod ;
   private String[] P06FT6_A494ForSer ;
   private String[] P06FT6_A482ForColNom ;
   private int[] P06FT6_A483ForColNum ;
   private byte[] P06FT6_A831TipColCod ;
   private String[] P06FT6_A649ObsForTxt ;
   private short[] P06FT6_A650ObsLin ;
   private byte[] P06FT7_A490ForPrdUMe ;
   private String[] P06FT7_A396EmprCod ;
   private short[] P06FT7_A489ForPrdNor ;
   private int[] P06FT7_A486ForNumCol ;
   private java.math.BigDecimal[] P06FT7_A487ForPrdCan ;
   private String[] P06FT7_A488ForPrdDsc ;
   private boolean[] P06FT7_n488ForPrdDsc ;
   private String[] P06FT7_A718PrdNom ;
   private String[] P06FT7_A719PrdNum ;
   private short[] P06FT7_A715PrdLin ;
   private byte[] P06FT8_A490ForPrdUMe ;
   private String[] P06FT8_A396EmprCod ;
   private String[] P06FT8_A719PrdNum ;
   private int[] P06FT8_A486ForNumCol ;
   private String[] P06FT8_A6193ForClaCol ;
   private java.math.BigDecimal[] P06FT8_A481ForCan ;
   private String[] P06FT8_A488ForPrdDsc ;
   private boolean[] P06FT8_n488ForPrdDsc ;
   private String[] P06FT8_A718PrdNom ;
   private short[] P06FT8_A309ColLin ;
}

final  class rfo0002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P06FT3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV16PCliCod ,
                                          int AV17UCliCod ,
                                          String AV18PSerie ,
                                          String AV19USerie ,
                                          int AV20PColor ,
                                          int AV21UColor ,
                                          String AV22PNumCol ,
                                          String AV23UNumCol ,
                                          byte AV67tc1 ,
                                          byte AV68Tc2 ,
                                          int AV69fornumcolfrom ,
                                          int AV70fornumcolto ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          int A483ForColNum ,
                                          String A482ForColNom ,
                                          byte A831TipColCod ,
                                          int A486ForNumCol ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[13];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.TipColCod, T1.ForNumCol, T4.TipColDsc, T1.ForOpNum, T1.ForSerDsc, T3.IntDsc, T1.IntCod, T1.ForTonal," ;
      scmdbuf += " T1.ForNumCli, T1.ForNomCli, T2.CliNom FROM (((TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPINTENS T3" ;
      scmdbuf += " ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod) INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV16PCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (0==AV17UCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18PSerie)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19USerie)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV20PColor) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV21UColor) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22PNumCol)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23UNumCol)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV67tc1) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV68Tc2) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV69fornumcolfrom) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV70fornumcolto) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P06FT3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06FT2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06FT3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06FT4", "SELECT T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForCod, T2.ProForDsc, T1.ProForL FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06FT5", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.ProForNro, T1.ProForPrd, T1.ProForCan, T1.ProForCla, T2.ForPrdDsc, T1.ProForDes, T1.ProForLin FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ProForCod = ? ORDER BY T1.EmprCod, T1.ProForCod, T1.ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06FT6", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsForTxt, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06FT7", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ForPrdNor, T1.ForNumCol, T1.ForPrdCan, T3.ForPrdDsc, T2.PrdNom, T1.PrdNum, T1.PrdLin FROM ((TXPLPRFOR T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE (T1.EmprCod = ? and T1.ForNumCol = ?) AND (T1.ForPrdNor = TO_NUMBER(NVL(TRIM(SUBSTR(?, 2, 4)), '0'))) ORDER BY T1.EmprCod, T1.ForNumCol, T1.PrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06FT8", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.PrdNum, T1.ForNumCol, T1.ForClaCol, T1.ForCan, T3.ForPrdDsc, T2.PrdNom, T1.ColLin FROM ((TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE (T1.EmprCod = ? and T1.ForNumCol = ?) AND (SUBSTR(T1.PrdNum, 1, ?) = SUBSTR(?, 1, ?)) ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               ((String[]) buf[16])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
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
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

