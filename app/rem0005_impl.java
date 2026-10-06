package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rem0005_impl extends GXWebReport
{
   public rem0005_impl( com.genexus.internet.HttpContext context )
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
            AV16ImpCod = httpContext.GetPar( "ImpCod") ;
            AV18PCliente = (int)(GXutil.lval( httpContext.GetPar( "PCliente"))) ;
            AV19UCliente = (int)(GXutil.lval( httpContext.GetPar( "UCliente"))) ;
            AV20PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
            AV21UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
            AV39ALbRef_i = httpContext.GetPar( "ALbRef_i") ;
            AV40AlbRef_f = httpContext.GetPar( "AlbRef_f") ;
            AV73Albrenti = httpContext.GetPar( "Albrenti") ;
            AV74Albrentf = httpContext.GetPar( "Albrentf") ;
            AV80Tipentcodi = (short)(GXutil.lval( httpContext.GetPar( "Tipentcodi"))) ;
            AV87Tipartcod1 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod1"))) ;
            AV88Tipartcod2 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod2"))) ;
            AV89Estado_a = httpContext.GetPar( "Estado_a") ;
            AV92AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
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
         Gx_out = "SCR" ;
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
         GXv_char1[0] = AV38ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EM0000", ""), GXv_char1) ;
         rem0005_impl.this.AV38ContDsc = GXv_char1[0] ;
         GXt_char2 = AV44Lit0 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV44Lit0 = GXt_char2 ;
         GXt_char2 = AV59Lit1 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV59Lit1 = GXt_char2 ;
         GXt_char2 = AV70Lit2 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV70Lit2 = GXt_char2 ;
         GXt_char2 = AV59Lit1 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV59Lit1 = GXt_char2 ;
         GXt_char2 = AV70Lit2 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN079", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV70Lit2 = GXt_char2 ;
         GXt_char2 = AV58Lit00 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN085", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV58Lit00 = GXt_char2 ;
         AV58Lit00 = GXutil.trim( AV58Lit00) + "(" + GXutil.trim( AV70Lit2) + ")" ;
         GXt_char2 = AV60Lit3 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV60Lit3 = GXt_char2 ;
         GXt_char2 = AV45Lit4 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2097_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV45Lit4 = GXt_char2 ;
         GXt_char2 = AV46Lit5 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2187_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV46Lit5 = GXt_char2 ;
         GXt_char2 = AV62Lit6 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV62Lit6 = GXt_char2 ;
         GXt_char2 = AV53Lit7 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN388_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV53Lit7 = GXt_char2 ;
         GXt_char2 = AV54Lit8 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1480_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV54Lit8 = GXt_char2 ;
         GXt_char2 = AV47Lit9 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV47Lit9 = GXt_char2 ;
         GXt_char2 = AV48Lit10 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1165_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV48Lit10 = GXt_char2 ;
         GXt_char2 = AV51Lit11 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV51Lit11 = GXt_char2 ;
         GXt_char2 = AV52Lit12 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1165_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV52Lit12 = GXt_char2 ;
         GXt_char2 = AV49Lit13 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1016_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV49Lit13 = GXt_char2 ;
         GXt_char2 = AV50Lit14 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1482_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV50Lit14 = GXt_char2 ;
         GXt_char2 = AV43Lit15 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1359_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV43Lit15 = GXt_char2 ;
         GXt_char2 = AV42Lit16 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV42Lit16 = GXt_char2 ;
         GXt_char2 = AV41Lit17 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1165_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV41Lit17 = GXt_char2 ;
         GXt_char2 = AV55Lit18 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT603_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV55Lit18 = GXt_char2 ;
         GXt_char2 = AV56Lit19 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV56Lit19 = GXt_char2 ;
         GXt_char2 = AV57Lit20 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2301_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV57Lit20 = GXt_char2 ;
         GXt_char2 = AV61Lit21 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1217_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV61Lit21 = GXt_char2 ;
         GXt_char2 = AV63Lit22 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV63Lit22 = GXt_char2 ;
         GXt_char2 = AV64Lit23 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN388_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV64Lit23 = GXt_char2 ;
         GXt_char2 = AV65Lit24 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2065_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV65Lit24 = GXt_char2 ;
         GXt_char2 = AV66Lit25 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV66Lit25 = GXt_char2 ;
         GXt_char2 = AV67Lit26 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV67Lit26 = GXt_char2 ;
         GXt_char2 = AV68Lit27 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1165_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV68Lit27 = GXt_char2 ;
         GXt_char2 = AV69Lit28 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char1) ;
         rem0005_impl.this.GXt_char2 = GXv_char1[0] ;
         AV69Lit28 = GXt_char2 ;
         GXt_int3 = AV75Moda21 ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int4) ;
         rem0005_impl.this.GXt_int3 = GXv_int4[0] ;
         AV75Moda21 = GXt_int3 ;
         GXt_int3 = AV76Cli350 ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int4) ;
         rem0005_impl.this.GXt_int3 = GXv_int4[0] ;
         AV76Cli350 = GXt_int3 ;
         GXt_int5 = AV77ContVal ;
         GXv_int6[0] = GXt_int5 ;
         new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int6) ;
         rem0005_impl.this.GXt_int5 = GXv_int6[0] ;
         AV77ContVal = GXt_int5 ;
         GXt_int3 = AV79Texfina ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int4) ;
         rem0005_impl.this.GXt_int3 = GXv_int4[0] ;
         AV79Texfina = GXt_int3 ;
         /* Using cursor P070I2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P070I2_A407EmprNom[0] ;
            n407EmprNom = P070I2_n407EmprNom[0] ;
            AV17NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV90PAlbRest = (byte)(0) ;
         AV91UALbRest = (byte)(1) ;
         if ( GXutil.strcmp(AV89Estado_a, "0") == 0 )
         {
            AV90PAlbRest = (byte)(0) ;
            AV91UALbRest = (byte)(0) ;
         }
         if ( GXutil.strcmp(AV89Estado_a, "1") == 0 )
         {
            AV90PAlbRest = (byte)(1) ;
            AV91UALbRest = (byte)(1) ;
         }
         AV72Last_C = 0 ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV20PFecha ,
                                              AV21UFecha ,
                                              Integer.valueOf(AV18PCliente) ,
                                              Integer.valueOf(AV19UCliente) ,
                                              AV39ALbRef_i ,
                                              AV40AlbRef_f ,
                                              AV73Albrenti ,
                                              AV74Albrentf ,
                                              Short.valueOf(AV87Tipartcod1) ,
                                              Short.valueOf(AV88Tipartcod2) ,
                                              Byte.valueOf(AV90PAlbRest) ,
                                              Byte.valueOf(AV91UALbRest) ,
                                              Integer.valueOf(AV92AlbRecCod) ,
                                              A49AlbRFen ,
                                              Integer.valueOf(A252CliCod) ,
                                              A45AlbRef ,
                                              A46AlbREnt ,
                                              Short.valueOf(A6263AlbRTartC) ,
                                              Byte.valueOf(A47AlbREst) ,
                                              Integer.valueOf(A44AlbRecCod) ,
                                              Short.valueOf(A1211TipEntCod) ,
                                              Short.valueOf(AV80Tipentcodi) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                              TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING
                                              }
         });
         /* Using cursor P070I3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(AV80Tipentcodi), Short.valueOf(AV80Tipentcodi), AV20PFecha, AV21UFecha, Integer.valueOf(AV18PCliente), Integer.valueOf(AV19UCliente), AV39ALbRef_i, AV40AlbRef_f, AV73Albrenti, AV74Albrentf, Short.valueOf(AV87Tipartcod1), Short.valueOf(AV88Tipartcod2), Byte.valueOf(AV90PAlbRest), Byte.valueOf(AV91UALbRest), Integer.valueOf(AV92AlbRecCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A56AlbRUni = P070I3_A56AlbRUni[0] ;
            A52AlbRPieEnt = P070I3_A52AlbRPieEnt[0] ;
            A58AlbRUniEnt = P070I3_A58AlbRUniEnt[0] ;
            A49AlbRFen = P070I3_A49AlbRFen[0] ;
            A44AlbRecCod = P070I3_A44AlbRecCod[0] ;
            A47AlbREst = P070I3_A47AlbREst[0] ;
            A6263AlbRTartC = P070I3_A6263AlbRTartC[0] ;
            n6263AlbRTartC = P070I3_n6263AlbRTartC[0] ;
            A1211TipEntCod = P070I3_A1211TipEntCod[0] ;
            n1211TipEntCod = P070I3_n1211TipEntCod[0] ;
            A46AlbREnt = P070I3_A46AlbREnt[0] ;
            A45AlbRef = P070I3_A45AlbRef[0] ;
            A252CliCod = P070I3_A252CliCod[0] ;
            A5806AlbREnt2 = P070I3_A5806AlbREnt2[0] ;
            A279CliNom = P070I3_A279CliNom[0] ;
            A279CliNom = P070I3_A279CliNom[0] ;
            AV78Albrent = ((GXutil.strcmp(A5806AlbREnt2, " ")!=0) ? A5806AlbREnt2 : A46AlbREnt) ;
            AV94albref = A45AlbRef ;
            if ( ( AV75Moda21 == 1 ) && ( A252CliCod == 350 ) && ( AV76Cli350 == 1 ) && ( AV77ContVal == 1 ) )
            {
            }
            else
            {
               if ( AV72Last_C != A252CliCod )
               {
                  h70I0( false, 35) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit6, "")), 329, Gx_line+10, 388, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 397, Gx_line+10, 442, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 446, Gx_line+10, 666, Gx_line+27, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+35) ;
               }
               AV81MasDeuna = (byte)(0) ;
               /* Using cursor P070I4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A200BarPieCod = P070I4_A200BarPieCod[0] ;
                  A129BarCod = P070I4_A129BarCod[0] ;
                  A132BarCodReo = P070I4_A132BarCodReo[0] ;
                  A130BarCodPar = P070I4_A130BarCodPar[0] ;
                  A205BarPieMet = P070I4_A205BarPieMet[0] ;
                  A212BarSer = P070I4_A212BarSer[0] ;
                  A218BarTipCol = P070I4_A218BarTipCol[0] ;
                  A136BarColNum = P070I4_A136BarColNum[0] ;
                  A135BarColNom = P070I4_A135BarColNom[0] ;
                  A1501BarPiePie = P070I4_A1501BarPiePie[0] ;
                  A203BarPieKil = P070I4_A203BarPieKil[0] ;
                  A212BarSer = P070I4_A212BarSer[0] ;
                  A218BarTipCol = P070I4_A218BarTipCol[0] ;
                  A136BarColNum = P070I4_A136BarColNum[0] ;
                  A135BarColNom = P070I4_A135BarColNom[0] ;
                  AV84Barcod = A129BarCod ;
                  AV85Barcodreo = A132BarCodReo ;
                  AV86barcodpar = A130BarCodPar ;
                  /* Execute user subroutine: 'ALBBAR' */
                  S121 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(2);
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
                  if ( AV81MasDeuna == 0 )
                  {
                     AV81MasDeuna = (byte)(1) ;
                     h70I0( false, 17) ;
                     getPrinter().GxAttris("Lucida Console", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 390, Gx_line+0, 448, Gx_line+15, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 474, Gx_line+0, 484, Gx_line+15, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Lucida Console", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 460, Gx_line+0, 467, Gx_line+15, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")), 798, Gx_line+0, 864, Gx_line+15, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9")), 960, Gx_line+0, 989, Gx_line+15, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 616, Gx_line+0, 711, Gx_line+15, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 724, Gx_line+0, 768, Gx_line+15, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 778, Gx_line+0, 793, Gx_line+15, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 492, Gx_line+0, 609, Gx_line+15, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A205BarPieMet, "ZZZZZ9.99")), 875, Gx_line+0, 941, Gx_line+15, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 15, Gx_line+0, 74, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 80, Gx_line+0, 139, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")), 244, Gx_line+0, 311, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 339, Gx_line+0, 384, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A56AlbRUni, "@!")), 317, Gx_line+0, 325, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Albrent, "")), 148, Gx_line+0, 237, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Lucida Console", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV82ALbprocod), "ZZZZZZZZZZ")), 999, Gx_line+1, 1073, Gx_line+14, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( AV83Albprofch, "99/99/99"), 1074, Gx_line+1, 1133, Gx_line+14, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  else
                  {
                     h70I0( false, 18) ;
                     getPrinter().GxAttris("Lucida Console", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 390, Gx_line+0, 448, Gx_line+15, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 474, Gx_line+0, 484, Gx_line+15, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Lucida Console", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 460, Gx_line+0, 467, Gx_line+15, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")), 798, Gx_line+0, 864, Gx_line+15, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9")), 960, Gx_line+0, 989, Gx_line+15, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 616, Gx_line+0, 711, Gx_line+15, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 724, Gx_line+0, 768, Gx_line+15, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 778, Gx_line+0, 793, Gx_line+15, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 492, Gx_line+0, 609, Gx_line+15, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A205BarPieMet, "ZZZZZ9.99")), 875, Gx_line+0, 941, Gx_line+15, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Lucida Console", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV82ALbprocod), "ZZZZZZZZZZ")), 999, Gx_line+1, 1073, Gx_line+14, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( AV83Albprofch, "99/99/99"), 1074, Gx_line+1, 1133, Gx_line+14, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  pr_default.readNext(2);
               }
               pr_default.close(2);
               AV72Last_C = A252CliCod ;
               AV93Var_Albreccod = A44AlbRecCod ;
               AV96Var_ALbrUni = A56AlbRUni ;
               AV99Var_AlbRFen = A49AlbRFen ;
               AV100Var_AlbRUniEnt = A58AlbRUniEnt ;
               AV101Var_AlbRPieEnt = A52AlbRPieEnt ;
               /* Execute user subroutine: 'DEVOLUCIONES' */
               S111 ();
               if ( returnInSub )
               {
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
               if ( (0==AV81MasDeuna) && (0==AV102tablaDevCru) )
               {
                  h70I0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 15, Gx_line+0, 74, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 80, Gx_line+0, 139, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")), 244, Gx_line+0, 311, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 339, Gx_line+0, 384, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A56AlbRUni, "@!")), 317, Gx_line+0, 325, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Albrent, "")), 148, Gx_line+0, 237, Gx_line+16, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h70I0( true, 0) ;
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
      /* 'DEVOLUCIONES' Routine */
      returnInSub = false ;
      AV102tablaDevCru = (short)(0) ;
      /* Using cursor P070I5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV93Var_Albreccod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A44AlbRecCod = P070I5_A44AlbRecCod[0] ;
         A11683DevCruUnd = P070I5_A11683DevCruUnd[0] ;
         A11670DevCruFec = P070I5_A11670DevCruFec[0] ;
         A11684DevCruPzs = P070I5_A11684DevCruPzs[0] ;
         A11669DevCruId = P070I5_A11669DevCruId[0] ;
         A11670DevCruFec = P070I5_A11670DevCruFec[0] ;
         AV97kilosdev = ((GXutil.strcmp(AV96Var_ALbrUni, httpContext.getMessage( "K", ""))==0) ? A11683DevCruUnd : DecimalUtil.doubleToDec(0)) ;
         AV98Metrosdev = ((GXutil.strcmp(AV96Var_ALbrUni, httpContext.getMessage( "M", ""))==0) ? A11683DevCruUnd : DecimalUtil.doubleToDec(0)) ;
         if ( AV81MasDeuna == 1 )
         {
            h70I0( false, 19) ;
            getPrinter().GxAttris("Courier New", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9")), 389, Gx_line+0, 448, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94albref, "")), 492, Gx_line+0, 610, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV97kilosdev, "ZZZZZ9.99")), 797, Gx_line+0, 864, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV98Metrosdev, "ZZZZZ9.99")), 874, Gx_line+0, 941, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9")), 944, Gx_line+0, 989, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A11670DevCruFec, "99/99/99"), 1074, Gx_line+0, 1133, Gx_line+16, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+19) ;
         }
         else
         {
            h70I0( false, 19) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV93Var_Albreccod), "ZZZZZZZ9")), 15, Gx_line+0, 74, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV99Var_AlbRFen, "99/99/99"), 80, Gx_line+0, 139, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Albrent, "")), 148, Gx_line+0, 237, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV100Var_AlbRUniEnt, "ZZZZZ9.99")), 244, Gx_line+0, 311, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96Var_ALbrUni, "@!")), 317, Gx_line+0, 325, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV101Var_AlbRPieEnt), "ZZZZZ9")), 339, Gx_line+0, 384, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A11670DevCruFec, "99/99/99"), 1074, Gx_line+0, 1133, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9")), 942, Gx_line+0, 987, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV98Metrosdev, "ZZZZZ9.99")), 875, Gx_line+0, 942, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV97kilosdev, "ZZZZZ9.99")), 800, Gx_line+0, 867, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94albref, "")), 492, Gx_line+0, 610, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9")), 389, Gx_line+0, 448, Gx_line+16, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+19) ;
         }
         AV102tablaDevCru = (short)(1) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      AV82ALbprocod = 0 ;
      AV83Albprofch = GXutil.nullDate() ;
      /* Using cursor P070I6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV84Barcod), Byte.valueOf(AV85Barcodreo), AV86barcodpar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A130BarCodPar = P070I6_A130BarCodPar[0] ;
         A132BarCodReo = P070I6_A132BarCodReo[0] ;
         A129BarCod = P070I6_A129BarCod[0] ;
         A30AlbProCod = P070I6_A30AlbProCod[0] ;
         A34AlbProfch = P070I6_A34AlbProfch[0] ;
         A34AlbProfch = P070I6_A34AlbProfch[0] ;
         AV82ALbprocod = A30AlbProCod ;
         AV83Albprofch = A34AlbProfch ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void h70I0( boolean bFoot ,
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
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 889, Gx_line+24, 956, Gx_line+41, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17NomEmp, "")), 16, Gx_line+23, 330, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit0, "")), 810, Gx_line+24, 884, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV20PFecha, "99/99/99"), 479, Gx_line+24, 546, Gx_line+41, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV21UFecha, "99/99/99"), 646, Gx_line+24, 713, Gx_line+41, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit4, "")), 390, Gx_line+24, 474, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit5, "")), 554, Gx_line+24, 638, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit00, "")), 15, Gx_line+53, 641, Gx_line+73, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit1, "")), 964, Gx_line+24, 1038, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Lit3, "")), 964, Gx_line+54, 1038, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 1041, Gx_line+24, 1100, Gx_line+41, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1055, Gx_line+54, 1100, Gx_line+71, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38ContDsc, "")), 995, Gx_line+1, 1100, Gx_line+15, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+79, 1140, Gx_line+79, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Lucida Console", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 778, Gx_line+108, 793, Gx_line+123, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit22, "")), 390, Gx_line+109, 485, Gx_line+120, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit23, "")), 492, Gx_line+109, 575, Gx_line+120, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit24, "")), 616, Gx_line+109, 699, Gx_line+120, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit25, "")), 718, Gx_line+109, 769, Gx_line+122, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Lit26, "")), 814, Gx_line+109, 865, Gx_line+122, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Lit28, "")), 890, Gx_line+109, 941, Gx_line+122, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit18, "")), 15, Gx_line+107, 74, Gx_line+125, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit19, "")), 80, Gx_line+107, 139, Gx_line+125, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "U", ""), 320, Gx_line+107, 328, Gx_line+124, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit9, "")), 244, Gx_line+107, 310, Gx_line+124, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit10, "")), 339, Gx_line+107, 384, Gx_line+125, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+125, 73, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(80, Gx_line+125, 138, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(244, Gx_line+125, 310, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(339, Gx_line+125, 383, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(317, Gx_line+125, 332, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(390, Gx_line+125, 485, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(492, Gx_line+125, 609, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(616, Gx_line+125, 711, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(718, Gx_line+125, 768, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(778, Gx_line+125, 793, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(798, Gx_line+125, 864, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(875, Gx_line+125, 941, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(960, Gx_line+125, 989, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit20, "")), 148, Gx_line+107, 207, Gx_line+125, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(148, Gx_line+125, 206, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Lucida Console", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N Albaran", ""), 999, Gx_line+109, 1075, Gx_line+120, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(999, Gx_line+125, 1072, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 1091, Gx_line+109, 1134, Gx_line+120, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(1074, Gx_line+125, 1132, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pzas", ""), 955, Gx_line+109, 989, Gx_line+120, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+130) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Lucida Console", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", true, true, 58, 14, 72, 123,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 30, 35, 35, 55, 45, 14, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 21, 21, 37, 37, 37, 38, 61, 45, 45, 45, 45, 42, 38, 49, 45, 17, 35, 45, 38, 52, 45, 49, 42, 49, 45, 42, 38, 45, 42, 59, 42, 42, 38, 21, 18, 23, 37, 35, 21, 35, 38, 35, 38, 35, 21, 38, 38, 18, 18, 35, 18, 56, 38, 38, 38, 38, 25, 35, 21, 38, 35, 49, 35, 35, 32, 25, 17, 25, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 36, 35, 35, 35, 17, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 21, 21, 36, 35, 21, 21, 21, 23, 35, 53, 53, 53, 38, 45, 45, 45, 45, 45, 45, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 35, 35, 35, 35, 35, 18, 18, 18, 18, 38, 38, 38, 38, 38, 38, 38, 35, 38, 38, 38, 38, 38, 35, 38, 35}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Lucida Console", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV16ImpCod = "" ;
      AV20PFecha = GXutil.nullDate() ;
      AV21UFecha = GXutil.nullDate() ;
      AV39ALbRef_i = "" ;
      AV40AlbRef_f = "" ;
      AV73Albrenti = "" ;
      AV74Albrentf = "" ;
      AV89Estado_a = "" ;
      AV38ContDsc = "" ;
      AV44Lit0 = "" ;
      AV59Lit1 = "" ;
      AV70Lit2 = "" ;
      AV58Lit00 = "" ;
      AV60Lit3 = "" ;
      AV45Lit4 = "" ;
      AV46Lit5 = "" ;
      AV62Lit6 = "" ;
      AV53Lit7 = "" ;
      AV54Lit8 = "" ;
      AV47Lit9 = "" ;
      AV48Lit10 = "" ;
      AV51Lit11 = "" ;
      AV52Lit12 = "" ;
      AV49Lit13 = "" ;
      AV50Lit14 = "" ;
      AV43Lit15 = "" ;
      AV42Lit16 = "" ;
      AV41Lit17 = "" ;
      AV55Lit18 = "" ;
      AV56Lit19 = "" ;
      AV57Lit20 = "" ;
      AV61Lit21 = "" ;
      AV63Lit22 = "" ;
      AV64Lit23 = "" ;
      AV65Lit24 = "" ;
      AV66Lit25 = "" ;
      AV67Lit26 = "" ;
      AV68Lit27 = "" ;
      AV69Lit28 = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P070I2_A396EmprCod = new String[] {""} ;
      P070I2_A407EmprNom = new String[] {""} ;
      P070I2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV17NomEmp = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A46AlbREnt = "" ;
      P070I3_A396EmprCod = new String[] {""} ;
      P070I3_A56AlbRUni = new String[] {""} ;
      P070I3_A52AlbRPieEnt = new int[1] ;
      P070I3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P070I3_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P070I3_A44AlbRecCod = new int[1] ;
      P070I3_A47AlbREst = new byte[1] ;
      P070I3_A6263AlbRTartC = new short[1] ;
      P070I3_n6263AlbRTartC = new boolean[] {false} ;
      P070I3_A1211TipEntCod = new short[1] ;
      P070I3_n1211TipEntCod = new boolean[] {false} ;
      P070I3_A46AlbREnt = new String[] {""} ;
      P070I3_A45AlbRef = new String[] {""} ;
      P070I3_A252CliCod = new int[1] ;
      P070I3_A5806AlbREnt2 = new String[] {""} ;
      P070I3_A279CliNom = new String[] {""} ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A5806AlbREnt2 = "" ;
      A279CliNom = "" ;
      AV78Albrent = "" ;
      AV94albref = "" ;
      P070I4_A396EmprCod = new String[] {""} ;
      P070I4_A44AlbRecCod = new int[1] ;
      P070I4_A200BarPieCod = new String[] {""} ;
      P070I4_A129BarCod = new int[1] ;
      P070I4_A132BarCodReo = new byte[1] ;
      P070I4_A130BarCodPar = new String[] {""} ;
      P070I4_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P070I4_A212BarSer = new String[] {""} ;
      P070I4_A218BarTipCol = new byte[1] ;
      P070I4_A136BarColNum = new int[1] ;
      P070I4_A135BarColNom = new String[] {""} ;
      P070I4_A1501BarPiePie = new int[1] ;
      P070I4_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      AV86barcodpar = "" ;
      AV83Albprofch = GXutil.nullDate() ;
      AV96Var_ALbrUni = "" ;
      AV99Var_AlbRFen = GXutil.nullDate() ;
      AV100Var_AlbRUniEnt = DecimalUtil.ZERO ;
      P070I5_A396EmprCod = new String[] {""} ;
      P070I5_A44AlbRecCod = new int[1] ;
      P070I5_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P070I5_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P070I5_A11684DevCruPzs = new int[1] ;
      P070I5_A11669DevCruId = new int[1] ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      A11670DevCruFec = GXutil.nullDate() ;
      AV97kilosdev = DecimalUtil.ZERO ;
      AV98Metrosdev = DecimalUtil.ZERO ;
      P070I6_A396EmprCod = new String[] {""} ;
      P070I6_A130BarCodPar = new String[] {""} ;
      P070I6_A132BarCodReo = new byte[1] ;
      P070I6_A129BarCod = new int[1] ;
      P070I6_A30AlbProCod = new long[1] ;
      P070I6_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A34AlbProfch = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rem0005__default(),
         new Object[] {
             new Object[] {
            P070I2_A396EmprCod, P070I2_A407EmprNom, P070I2_n407EmprNom
            }
            , new Object[] {
            P070I3_A396EmprCod, P070I3_A56AlbRUni, P070I3_A52AlbRPieEnt, P070I3_A58AlbRUniEnt, P070I3_A49AlbRFen, P070I3_A44AlbRecCod, P070I3_A47AlbREst, P070I3_A6263AlbRTartC, P070I3_n6263AlbRTartC, P070I3_A1211TipEntCod,
            P070I3_n1211TipEntCod, P070I3_A46AlbREnt, P070I3_A45AlbRef, P070I3_A252CliCod, P070I3_A5806AlbREnt2, P070I3_A279CliNom
            }
            , new Object[] {
            P070I4_A396EmprCod, P070I4_A44AlbRecCod, P070I4_A200BarPieCod, P070I4_A129BarCod, P070I4_A132BarCodReo, P070I4_A130BarCodPar, P070I4_A205BarPieMet, P070I4_A212BarSer, P070I4_A218BarTipCol, P070I4_A136BarColNum,
            P070I4_A135BarColNom, P070I4_A1501BarPiePie, P070I4_A203BarPieKil
            }
            , new Object[] {
            P070I5_A396EmprCod, P070I5_A44AlbRecCod, P070I5_A11683DevCruUnd, P070I5_A11670DevCruFec, P070I5_A11684DevCruPzs, P070I5_A11669DevCruId
            }
            , new Object[] {
            P070I6_A396EmprCod, P070I6_A130BarCodPar, P070I6_A132BarCodReo, P070I6_A129BarCod, P070I6_A30AlbProCod, P070I6_A34AlbProfch
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

   private byte AV75Moda21 ;
   private byte AV76Cli350 ;
   private byte AV79Texfina ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte AV90PAlbRest ;
   private byte AV91UALbRest ;
   private byte A47AlbREst ;
   private byte AV81MasDeuna ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV85Barcodreo ;
   private short gxcookieaux ;
   private short AV80Tipentcodi ;
   private short AV87Tipartcod1 ;
   private short AV88Tipartcod2 ;
   private short A6263AlbRTartC ;
   private short A1211TipEntCod ;
   private short AV102tablaDevCru ;
   private short Gx_err ;
   private int AV18PCliente ;
   private int AV19UCliente ;
   private int AV92AlbRecCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV77ContVal ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int AV72Last_C ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int Gx_OldLine ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1501BarPiePie ;
   private int AV84Barcod ;
   private int AV93Var_Albreccod ;
   private int AV101Var_AlbRPieEnt ;
   private int A11684DevCruPzs ;
   private int A11669DevCruId ;
   private long AV82ALbprocod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal AV100Var_AlbRUniEnt ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private java.math.BigDecimal AV97kilosdev ;
   private java.math.BigDecimal AV98Metrosdev ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV16ImpCod ;
   private String AV39ALbRef_i ;
   private String AV40AlbRef_f ;
   private String AV73Albrenti ;
   private String AV74Albrentf ;
   private String AV89Estado_a ;
   private String AV38ContDsc ;
   private String AV44Lit0 ;
   private String AV59Lit1 ;
   private String AV70Lit2 ;
   private String AV58Lit00 ;
   private String AV60Lit3 ;
   private String AV45Lit4 ;
   private String AV46Lit5 ;
   private String AV62Lit6 ;
   private String AV53Lit7 ;
   private String AV54Lit8 ;
   private String AV47Lit9 ;
   private String AV48Lit10 ;
   private String AV51Lit11 ;
   private String AV52Lit12 ;
   private String AV49Lit13 ;
   private String AV50Lit14 ;
   private String AV43Lit15 ;
   private String AV42Lit16 ;
   private String AV41Lit17 ;
   private String AV55Lit18 ;
   private String AV56Lit19 ;
   private String AV57Lit20 ;
   private String AV61Lit21 ;
   private String AV63Lit22 ;
   private String AV64Lit23 ;
   private String AV65Lit24 ;
   private String AV66Lit25 ;
   private String AV67Lit26 ;
   private String AV68Lit27 ;
   private String AV69Lit28 ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV17NomEmp ;
   private String A45AlbRef ;
   private String A46AlbREnt ;
   private String A56AlbRUni ;
   private String A5806AlbREnt2 ;
   private String A279CliNom ;
   private String AV78Albrent ;
   private String AV94albref ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV86barcodpar ;
   private String AV96Var_ALbrUni ;
   private String Gx_time ;
   private java.util.Date AV20PFecha ;
   private java.util.Date AV21UFecha ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV83Albprofch ;
   private java.util.Date AV99Var_AlbRFen ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n6263AlbRTartC ;
   private boolean n1211TipEntCod ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P070I2_A396EmprCod ;
   private String[] P070I2_A407EmprNom ;
   private boolean[] P070I2_n407EmprNom ;
   private String[] P070I3_A396EmprCod ;
   private String[] P070I3_A56AlbRUni ;
   private int[] P070I3_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P070I3_A58AlbRUniEnt ;
   private java.util.Date[] P070I3_A49AlbRFen ;
   private int[] P070I3_A44AlbRecCod ;
   private byte[] P070I3_A47AlbREst ;
   private short[] P070I3_A6263AlbRTartC ;
   private boolean[] P070I3_n6263AlbRTartC ;
   private short[] P070I3_A1211TipEntCod ;
   private boolean[] P070I3_n1211TipEntCod ;
   private String[] P070I3_A46AlbREnt ;
   private String[] P070I3_A45AlbRef ;
   private int[] P070I3_A252CliCod ;
   private String[] P070I3_A5806AlbREnt2 ;
   private String[] P070I3_A279CliNom ;
   private String[] P070I4_A396EmprCod ;
   private int[] P070I4_A44AlbRecCod ;
   private String[] P070I4_A200BarPieCod ;
   private int[] P070I4_A129BarCod ;
   private byte[] P070I4_A132BarCodReo ;
   private String[] P070I4_A130BarCodPar ;
   private java.math.BigDecimal[] P070I4_A205BarPieMet ;
   private String[] P070I4_A212BarSer ;
   private byte[] P070I4_A218BarTipCol ;
   private int[] P070I4_A136BarColNum ;
   private String[] P070I4_A135BarColNom ;
   private int[] P070I4_A1501BarPiePie ;
   private java.math.BigDecimal[] P070I4_A203BarPieKil ;
   private String[] P070I5_A396EmprCod ;
   private int[] P070I5_A44AlbRecCod ;
   private java.math.BigDecimal[] P070I5_A11683DevCruUnd ;
   private java.util.Date[] P070I5_A11670DevCruFec ;
   private int[] P070I5_A11684DevCruPzs ;
   private int[] P070I5_A11669DevCruId ;
   private String[] P070I6_A396EmprCod ;
   private String[] P070I6_A130BarCodPar ;
   private byte[] P070I6_A132BarCodReo ;
   private int[] P070I6_A129BarCod ;
   private long[] P070I6_A30AlbProCod ;
   private java.util.Date[] P070I6_A34AlbProfch ;
}

final  class rem0005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P070I3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV20PFecha ,
                                          java.util.Date AV21UFecha ,
                                          int AV18PCliente ,
                                          int AV19UCliente ,
                                          String AV39ALbRef_i ,
                                          String AV40AlbRef_f ,
                                          String AV73Albrenti ,
                                          String AV74Albrentf ,
                                          short AV87Tipartcod1 ,
                                          short AV88Tipartcod2 ,
                                          byte AV90PAlbRest ,
                                          byte AV91UALbRest ,
                                          int AV92AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          short A6263AlbRTartC ,
                                          byte A47AlbREst ,
                                          int A44AlbRecCod ,
                                          short A1211TipEntCod ,
                                          short AV80Tipentcodi ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[16];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRUni, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRFen, T1.AlbRecCod, T1.AlbREst, T1.AlbRTartC, T1.TipEntCod, T1.AlbREnt, T1.AlbRef, T1.CliCod," ;
      scmdbuf += " T1.AlbREnt2, T2.CliNom FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.TipEntCod <> 9999)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV20PFecha)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21UFecha)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      if ( ! (0==AV18PCliente) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      if ( ! (0==AV19UCliente) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int7[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39ALbRef_i)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef >= ?)");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40AlbRef_f)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef <= ?)");
      }
      else
      {
         GXv_int7[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Albrenti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt >= ?)");
      }
      else
      {
         GXv_int7[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Albrentf)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt <= ?)");
      }
      else
      {
         GXv_int7[10] = (byte)(1) ;
      }
      if ( ! (0==AV87Tipartcod1) )
      {
         addWhere(sWhereString, "(T1.AlbRTartC >= ?)");
      }
      else
      {
         GXv_int7[11] = (byte)(1) ;
      }
      if ( ! (0==AV88Tipartcod2) )
      {
         addWhere(sWhereString, "(T1.AlbRTartC <= ?)");
      }
      else
      {
         GXv_int7[12] = (byte)(1) ;
      }
      if ( ! (0==AV90PAlbRest) )
      {
         addWhere(sWhereString, "(T1.AlbREst >= ?)");
      }
      else
      {
         GXv_int7[13] = (byte)(1) ;
      }
      if ( ! (0==AV91UALbRest) )
      {
         addWhere(sWhereString, "(T1.AlbREst <= ?)");
      }
      else
      {
         GXv_int7[14] = (byte)(1) ;
      }
      if ( ! (0==AV92AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int7[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.AlbRef" ;
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
                  return conditional_P070I3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).intValue() , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P070I2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P070I3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P070I4", "SELECT T1.EmprCod, T1.AlbRecCod, T1.BarPieCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieMet, T2.BarSer, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T1.BarPiePie, T1.BarPieKil FROM (TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P070I5", "SELECT T1.EmprCod, T1.AlbRecCod, T1.DevCruUnd, T2.DevCruFec, T1.DevCruPzs, T1.DevCruId FROM (TXPDEVCR1 T1 INNER JOIN TXPDEVCRU T2 ON T2.EmprCod = T1.EmprCod AND T2.DevCruId = T1.DevCruId) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P070I6", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T2.AlbProfch FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((String[]) buf[12])[0] = rslt.getString(11, 16);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 20);
               ((String[]) buf[15])[0] = rslt.getString(14, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[20]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

