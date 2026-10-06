package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rem0003_impl extends GXWebReport
{
   public rem0003_impl( com.genexus.internet.HttpContext context )
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
         AV15EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV16ImpCod = httpContext.GetPar( "ImpCod") ;
            AV18PCliente = (int)(GXutil.lval( httpContext.GetPar( "PCliente"))) ;
            AV19UCliente = (int)(GXutil.lval( httpContext.GetPar( "UCliente"))) ;
            AV20PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
            AV21UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
            AV38AlbRef_i = httpContext.GetPar( "AlbRef_i") ;
            AV39AlbRef_f = httpContext.GetPar( "AlbRef_f") ;
            AV63Estado_a = httpContext.GetPar( "Estado_a") ;
            AV66Albrenti = httpContext.GetPar( "Albrenti") ;
            AV67Albrentf = httpContext.GetPar( "Albrentf") ;
            AV73TipENtcodi = (short)(GXutil.lval( httpContext.GetPar( "TipENtcodi"))) ;
            AV76Procodi = (short)(GXutil.lval( httpContext.GetPar( "Procodi"))) ;
            AV77Procodf = (short)(GXutil.lval( httpContext.GetPar( "Procodf"))) ;
            AV78trnCodi = (short)(GXutil.lval( httpContext.GetPar( "trnCodi"))) ;
            AV79TrnCodf = (short)(GXutil.lval( httpContext.GetPar( "TrnCodf"))) ;
            AV83Tipartcod1 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod1"))) ;
            AV84Tipartcod2 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod2"))) ;
            AV86Unidad = httpContext.GetPar( "Unidad") ;
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
      M_bot = 6 ;
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
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV37ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "EM0000", ""), GXv_char1) ;
         rem0003_impl.this.AV37ContDsc = GXv_char1[0] ;
         GXt_char2 = AV41Lit0 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV41Lit0 = GXt_char2 ;
         GXt_char2 = AV42Lit1 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV42Lit1 = GXt_char2 ;
         GXt_char2 = AV40Lit2 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV40Lit2 = GXt_char2 ;
         GXt_char2 = AV42Lit1 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV42Lit1 = GXt_char2 ;
         GXt_char2 = AV40Lit2 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN077", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV40Lit2 = GXt_char2 ;
         GXt_char2 = AV62Lit00 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN085", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV62Lit00 = GXt_char2 ;
         AV62Lit00 = GXutil.trim( AV62Lit00) + "(" + GXutil.trim( AV40Lit2) + ")" ;
         GXt_char2 = AV43Lit3 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV43Lit3 = GXt_char2 ;
         GXt_char2 = AV44Lit4 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2097_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV44Lit4 = GXt_char2 ;
         GXt_char2 = AV45Lit5 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2187_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV45Lit5 = GXt_char2 ;
         GXt_char2 = AV49Lit6 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV49Lit6 = GXt_char2 ;
         GXt_char2 = AV56Lit7 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN388_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV56Lit7 = GXt_char2 ;
         GXt_char2 = AV57Lit8 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1480_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV57Lit8 = GXt_char2 ;
         GXt_char2 = AV46Lit9 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV46Lit9 = GXt_char2 ;
         GXt_char2 = AV47Lit10 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1165_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV47Lit10 = GXt_char2 ;
         GXt_char2 = AV51Lit11 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV51Lit11 = GXt_char2 ;
         GXt_char2 = AV52Lit12 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1165_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV52Lit12 = GXt_char2 ;
         GXt_char2 = AV48Lit13 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1016_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV48Lit13 = GXt_char2 ;
         GXt_char2 = AV50Lit14 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1482_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV50Lit14 = GXt_char2 ;
         GXt_char2 = AV53Lit15 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1359_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV53Lit15 = GXt_char2 ;
         GXt_char2 = AV54Lit16 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV54Lit16 = GXt_char2 ;
         GXt_char2 = AV55Lit17 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1165_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV55Lit17 = GXt_char2 ;
         GXt_char2 = AV58Lit18 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT603_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV58Lit18 = GXt_char2 ;
         GXt_char2 = AV59Lit19 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV59Lit19 = GXt_char2 ;
         GXt_char2 = AV60Lit20 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2301_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV60Lit20 = GXt_char2 ;
         GXt_char2 = AV61Lit21 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1217_", ""), (byte)(99), GXv_char1) ;
         rem0003_impl.this.GXt_char2 = GXv_char1[0] ;
         AV61Lit21 = GXt_char2 ;
         GXt_int3 = AV68Moda21 ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int4) ;
         rem0003_impl.this.GXt_int3 = GXv_int4[0] ;
         AV68Moda21 = GXt_int3 ;
         GXt_int3 = AV69Cli350 ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int4) ;
         rem0003_impl.this.GXt_int3 = GXv_int4[0] ;
         AV69Cli350 = GXt_int3 ;
         GXt_int5 = AV70Contval ;
         GXv_int6[0] = GXt_int5 ;
         new app.pbuscon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int6) ;
         rem0003_impl.this.GXt_int5 = GXv_int6[0] ;
         AV70Contval = GXt_int5 ;
         GXt_int3 = AV71Texfina ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int4) ;
         rem0003_impl.this.GXt_int3 = GXv_int4[0] ;
         AV71Texfina = GXt_int3 ;
         GXt_int3 = AV82vts ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "VELLUT", ""), GXv_int4) ;
         rem0003_impl.this.GXt_int3 = GXv_int4[0] ;
         AV82vts = GXt_int3 ;
         AV64PAlbRest = (byte)(0) ;
         AV65UALbRest = (byte)(1) ;
         if ( GXutil.strcmp(AV63Estado_a, "0") == 0 )
         {
            AV64PAlbRest = (byte)(0) ;
            AV65UALbRest = (byte)(0) ;
         }
         if ( GXutil.strcmp(AV63Estado_a, "1") == 0 )
         {
            AV64PAlbRest = (byte)(1) ;
            AV65UALbRest = (byte)(1) ;
         }
         /* Using cursor P06LN2 */
         pr_default.execute(0, new Object[] {AV15EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P06LN2_A396EmprCod[0] ;
            A407EmprNom = P06LN2_A407EmprNom[0] ;
            n407EmprNom = P06LN2_n407EmprNom[0] ;
            AV17NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV85ImprimirCliente = (byte)(0) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV20PFecha ,
                                              AV21UFecha ,
                                              Integer.valueOf(AV18PCliente) ,
                                              Integer.valueOf(AV19UCliente) ,
                                              AV38AlbRef_i ,
                                              AV39AlbRef_f ,
                                              AV66Albrenti ,
                                              AV67Albrentf ,
                                              Short.valueOf(AV83Tipartcod1) ,
                                              Short.valueOf(AV84Tipartcod2) ,
                                              Byte.valueOf(AV64PAlbRest) ,
                                              Byte.valueOf(AV65UALbRest) ,
                                              Short.valueOf(AV76Procodi) ,
                                              Short.valueOf(AV77Procodf) ,
                                              Short.valueOf(AV78trnCodi) ,
                                              Short.valueOf(AV79TrnCodf) ,
                                              A49AlbRFen ,
                                              Integer.valueOf(A252CliCod) ,
                                              A45AlbRef ,
                                              A46AlbREnt ,
                                              Short.valueOf(A6263AlbRTartC) ,
                                              Byte.valueOf(A47AlbREst) ,
                                              Short.valueOf(A970ProceCod) ,
                                              Short.valueOf(A840TrnCod) ,
                                              Short.valueOf(A1211TipEntCod) ,
                                              Short.valueOf(AV73TipENtcodi) ,
                                              A56AlbRUni ,
                                              AV86Unidad ,
                                              AV15EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor P06LN3 */
         pr_default.execute(1, new Object[] {AV15EmprCod, Short.valueOf(AV73TipENtcodi), Short.valueOf(AV73TipENtcodi), AV86Unidad, AV86Unidad, AV20PFecha, AV21UFecha, Integer.valueOf(AV18PCliente), Integer.valueOf(AV19UCliente), AV38AlbRef_i, AV39AlbRef_f, AV66Albrenti, AV67Albrentf, Short.valueOf(AV83Tipartcod1), Short.valueOf(AV84Tipartcod2), Byte.valueOf(AV64PAlbRest), Byte.valueOf(AV65UALbRest), Short.valueOf(AV76Procodi), Short.valueOf(AV77Procodf), Short.valueOf(AV78trnCodi), Short.valueOf(AV79TrnCodf)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6LN4 = false ;
            A396EmprCod = P06LN3_A396EmprCod[0] ;
            A1211TipEntCod = P06LN3_A1211TipEntCod[0] ;
            n1211TipEntCod = P06LN3_n1211TipEntCod[0] ;
            A6263AlbRTartC = P06LN3_A6263AlbRTartC[0] ;
            n6263AlbRTartC = P06LN3_n6263AlbRTartC[0] ;
            A47AlbREst = P06LN3_A47AlbREst[0] ;
            A279CliNom = P06LN3_A279CliNom[0] ;
            A252CliCod = P06LN3_A252CliCod[0] ;
            A3613AlbRefDsc = P06LN3_A3613AlbRefDsc[0] ;
            A5806AlbREnt2 = P06LN3_A5806AlbREnt2[0] ;
            A46AlbREnt = P06LN3_A46AlbREnt[0] ;
            A50AlbRLoc = P06LN3_A50AlbRLoc[0] ;
            A840TrnCod = P06LN3_A840TrnCod[0] ;
            n840TrnCod = P06LN3_n840TrnCod[0] ;
            A970ProceCod = P06LN3_A970ProceCod[0] ;
            n970ProceCod = P06LN3_n970ProceCod[0] ;
            A56AlbRUni = P06LN3_A56AlbRUni[0] ;
            A44AlbRecCod = P06LN3_A44AlbRecCod[0] ;
            A49AlbRFen = P06LN3_A49AlbRFen[0] ;
            A45AlbRef = P06LN3_A45AlbRef[0] ;
            A54AlbRPieUti = P06LN3_A54AlbRPieUti[0] ;
            A52AlbRPieEnt = P06LN3_A52AlbRPieEnt[0] ;
            A60AlbRUniUti = P06LN3_A60AlbRUniUti[0] ;
            A58AlbRUniEnt = P06LN3_A58AlbRUniEnt[0] ;
            A279CliNom = P06LN3_A279CliNom[0] ;
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
            {
               A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            }
            else
            {
               if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
               {
                  A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               }
            }
            A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
            if ( ( AV68Moda21 == 1 ) && ( A252CliCod == 350 ) && ( AV69Cli350 == 1 ) && ( AV70Contval == 1 ) )
            {
            }
            else
            {
               AV22TotUniE = DecimalUtil.doubleToDec(0) ;
               AV26TotUniS = DecimalUtil.doubleToDec(0) ;
               AV27TotPzE = 0 ;
               AV28TotPzU = 0 ;
               AV85ImprimirCliente = (byte)(0) ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06LN3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06LN3_A252CliCod[0] == A252CliCod ) )
               {
                  brk6LN4 = false ;
                  A1211TipEntCod = P06LN3_A1211TipEntCod[0] ;
                  n1211TipEntCod = P06LN3_n1211TipEntCod[0] ;
                  A6263AlbRTartC = P06LN3_A6263AlbRTartC[0] ;
                  n6263AlbRTartC = P06LN3_n6263AlbRTartC[0] ;
                  A47AlbREst = P06LN3_A47AlbREst[0] ;
                  A279CliNom = P06LN3_A279CliNom[0] ;
                  A3613AlbRefDsc = P06LN3_A3613AlbRefDsc[0] ;
                  A5806AlbREnt2 = P06LN3_A5806AlbREnt2[0] ;
                  A46AlbREnt = P06LN3_A46AlbREnt[0] ;
                  A50AlbRLoc = P06LN3_A50AlbRLoc[0] ;
                  A840TrnCod = P06LN3_A840TrnCod[0] ;
                  n840TrnCod = P06LN3_n840TrnCod[0] ;
                  A970ProceCod = P06LN3_A970ProceCod[0] ;
                  n970ProceCod = P06LN3_n970ProceCod[0] ;
                  A56AlbRUni = P06LN3_A56AlbRUni[0] ;
                  A44AlbRecCod = P06LN3_A44AlbRecCod[0] ;
                  A49AlbRFen = P06LN3_A49AlbRFen[0] ;
                  A45AlbRef = P06LN3_A45AlbRef[0] ;
                  A54AlbRPieUti = P06LN3_A54AlbRPieUti[0] ;
                  A52AlbRPieEnt = P06LN3_A52AlbRPieEnt[0] ;
                  A60AlbRUniUti = P06LN3_A60AlbRUniUti[0] ;
                  A58AlbRUniEnt = P06LN3_A58AlbRUniEnt[0] ;
                  A279CliNom = P06LN3_A279CliNom[0] ;
                  if ( GXutil.strcmp(A396EmprCod, AV15EmprCod) == 0 )
                  {
                     if ( A1211TipEntCod != 9999 )
                     {
                        if ( ( A1211TipEntCod == AV73TipENtcodi ) || (0==AV73TipENtcodi) )
                        {
                           if ( ( GXutil.strcmp(A56AlbRUni, AV86Unidad) == 0 ) || (GXutil.strcmp("", AV86Unidad)==0) )
                           {
                              if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
                              {
                                 A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
                              }
                              else
                              {
                                 if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
                                 {
                                    A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
                                 }
                                 else
                                 {
                                    A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
                                 }
                              }
                              A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
                              if ( ( GXutil.strcmp(AV63Estado_a, "0") == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
                              {
                              }
                              else
                              {
                                 if ( AV85ImprimirCliente == 0 )
                                 {
                                    AV85ImprimirCliente = (byte)(1) ;
                                    h6LN0( false, 23) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 150, Gx_line+4, 195, Gx_line+21, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 199, Gx_line+4, 419, Gx_line+21, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit6, "")), 84, Gx_line+4, 143, Gx_line+22, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+23) ;
                                 }
                                 AV74AlbRefDsc = A3613AlbRefDsc ;
                                 AV24CliCod = A252CliCod ;
                                 AV23ArtCod = A45AlbRef ;
                                 if ( (GXutil.strcmp("", A3613AlbRefDsc)==0) || ( GXutil.strcmp(GXutil.trim( A3613AlbRefDsc), "") == 0 ) )
                                 {
                                    /* Execute user subroutine: 'ARTICU' */
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
                                 }
                                 AV75AlbREnt2 = GXutil.substring( A5806AlbREnt2, 1, 16) ;
                                 if ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 )
                                 {
                                    AV75AlbREnt2 = A46AlbREnt ;
                                 }
                                 AV80AlbRloc5 = GXutil.substring( A50AlbRLoc, 1, 5) ;
                                 if ( ( AV68Moda21 == 0 ) && ( AV82vts == 0 ) )
                                 {
                                    h6LN0( false, 16) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 10, Gx_line+0, 128, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74AlbRefDsc, "")), 131, Gx_line+0, 322, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 326, Gx_line+0, 385, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")), 578, Gx_line+0, 645, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 655, Gx_line+0, 700, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")), 735, Gx_line+0, 802, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")), 813, Gx_line+0, 858, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A57AlbRUniDis, "ZZZZZ9.99")), 896, Gx_line+0, 963, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9")), 976, Gx_line+0, 1021, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80AlbRloc5, "")), 1029, Gx_line+0, 1066, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 393, Gx_line+0, 452, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A56AlbRUni, "@!")), 554, Gx_line+0, 562, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75AlbREnt2, "")), 459, Gx_line+0, 544, Gx_line+15, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9")), 1071, Gx_line+0, 1101, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), 1105, Gx_line+0, 1135, Gx_line+16, 2+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+16) ;
                                 }
                                 else
                                 {
                                    h6LN0( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 10, Gx_line+0, 128, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74AlbRefDsc, "")), 131, Gx_line+0, 322, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 326, Gx_line+0, 385, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")), 578, Gx_line+0, 645, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 655, Gx_line+0, 700, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")), 735, Gx_line+0, 802, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")), 813, Gx_line+0, 858, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A57AlbRUniDis, "ZZZZZ9.99")), 896, Gx_line+0, 963, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9")), 976, Gx_line+0, 1021, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 393, Gx_line+0, 452, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A56AlbRUni, "@!")), 554, Gx_line+0, 562, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75AlbREnt2, "")), 459, Gx_line+0, 544, Gx_line+15, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), 1032, Gx_line+0, 1106, Gx_line+17, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                 }
                                 AV22TotUniE = AV22TotUniE.add(A58AlbRUniEnt) ;
                                 AV26TotUniS = AV26TotUniS.add(A60AlbRUniUti) ;
                                 AV27TotPzE = (int)(AV27TotPzE+A52AlbRPieEnt) ;
                                 AV28TotPzU = (int)(AV28TotPzU+A54AlbRPieUti) ;
                                 AV34TotUniEG = AV34TotUniEG.add(A58AlbRUniEnt) ;
                                 AV35TotUniSG = AV35TotUniSG.add(A60AlbRUniUti) ;
                                 AV33TotPzEG = (int)(AV33TotPzEG+A52AlbRPieEnt) ;
                                 AV36TotPzUG = (int)(AV36TotPzUG+A54AlbRPieUti) ;
                              }
                           }
                        }
                     }
                  }
                  brk6LN4 = true ;
                  pr_default.readNext(1);
               }
               AV32TotPzSal = (int)(AV27TotPzE-AV28TotPzU) ;
               AV31TotUniSal = AV22TotUniE.subtract(AV26TotUniS) ;
               if ( AV85ImprimirCliente == 1 )
               {
                  h6LN0( false, 30) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TotUniE, "Z,ZZZ,ZZ9.99")), 556, Gx_line+9, 645, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26TotUniS, "ZZ,ZZZ,ZZ9.99")), 706, Gx_line+9, 802, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TotUniSal, "ZZ,ZZZ,ZZ9.99")), 867, Gx_line+9, 963, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27TotPzE), "ZZZZZ9")), 655, Gx_line+9, 700, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28TotPzU), "ZZZZZ9")), 813, Gx_line+9, 858, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32TotPzSal), "ZZZZZ9")), 976, Gx_line+9, 1021, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total Cliente", ""), 370, Gx_line+9, 454, Gx_line+26, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+30) ;
               }
            }
            if ( ! brk6LN4 )
            {
               brk6LN4 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         AV32TotPzSal = (int)(AV33TotPzEG-AV36TotPzUG) ;
         AV31TotUniSal = AV34TotUniEG.subtract(AV35TotUniSG) ;
         h6LN0( false, 28) ;
         getPrinter().GxAttris("Arial", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total Informe", ""), 370, Gx_line+6, 459, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TotUniEG, "ZZ,ZZZ,ZZ9.99")), 549, Gx_line+7, 645, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TotUniSG, "ZZ,ZZZ,ZZ9.99")), 706, Gx_line+7, 802, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TotUniSal, "ZZ,ZZZ,ZZ9.99")), 867, Gx_line+7, 963, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33TotPzEG), "ZZZZZ9")), 655, Gx_line+7, 700, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36TotPzUG), "ZZZZZ9")), 813, Gx_line+7, 858, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32TotPzSal), "ZZZZZ9")), 976, Gx_line+7, 1021, Gx_line+25, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+28) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6LN0( true, 0) ;
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
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV74AlbRefDsc = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV18PCliente) ,
                                           Integer.valueOf(AV19UCliente) ,
                                           Integer.valueOf(A252CliCod) ,
                                           AV15EmprCod ,
                                           Integer.valueOf(AV24CliCod) ,
                                           AV23ArtCod ,
                                           A396EmprCod ,
                                           A65ArtCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P06LN4 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV24CliCod), AV23ArtCod, Integer.valueOf(AV18PCliente), Integer.valueOf(AV19UCliente)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A65ArtCod = P06LN4_A65ArtCod[0] ;
         A252CliCod = P06LN4_A252CliCod[0] ;
         A396EmprCod = P06LN4_A396EmprCod[0] ;
         A69ArtDsc = P06LN4_A69ArtDsc[0] ;
         n69ArtDsc = P06LN4_n69ArtDsc[0] ;
         AV74AlbRefDsc = A69ArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void h6LN0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17NomEmp, "")), 10, Gx_line+24, 324, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 903, Gx_line+25, 970, Gx_line+42, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit0, "")), 805, Gx_line+25, 879, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit1, "")), 978, Gx_line+25, 1052, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit3, "")), 978, Gx_line+56, 1052, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 1067, Gx_line+25, 1126, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1067, Gx_line+56, 1112, Gx_line+73, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37ContDsc, "")), 1021, Gx_line+2, 1126, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(10, Gx_line+82, 1138, Gx_line+82, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV20PFecha, "99/99/99"), 116, Gx_line+92, 183, Gx_line+109, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV21UFecha, "99/99/99"), 282, Gx_line+92, 349, Gx_line+109, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit4, "")), 10, Gx_line+92, 94, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit5, "")), 191, Gx_line+92, 275, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit9, "")), 571, Gx_line+148, 645, Gx_line+166, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit10, "")), 655, Gx_line+148, 700, Gx_line+166, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit13, "")), 614, Gx_line+126, 688, Gx_line+144, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit14, "")), 766, Gx_line+126, 840, Gx_line+144, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit11, "")), 728, Gx_line+148, 802, Gx_line+166, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit12, "")), 813, Gx_line+148, 858, Gx_line+166, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit15, "")), 926, Gx_line+126, 1000, Gx_line+144, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit16, "")), 889, Gx_line+148, 963, Gx_line+166, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit17, "")), 976, Gx_line+148, 1021, Gx_line+166, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit7, "")), 10, Gx_line+147, 84, Gx_line+165, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit8, "")), 131, Gx_line+147, 205, Gx_line+165, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit18, "")), 326, Gx_line+147, 385, Gx_line+165, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit19, "")), 393, Gx_line+147, 452, Gx_line+165, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Lit20, "")), 459, Gx_line+147, 518, Gx_line+165, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(10, Gx_line+167, 1138, Gx_line+167, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "U", ""), 557, Gx_line+148, 565, Gx_line+165, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit00, "")), 10, Gx_line+55, 428, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Local", ""), 1032, Gx_line+148, 1069, Gx_line+163, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proc", ""), 1071, Gx_line+148, 1101, Gx_line+163, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Trnp", ""), 1105, Gx_line+148, 1135, Gx_line+163, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86Unidad, "")), 448, Gx_line+56, 456, Gx_line+73, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Estado_a, "")), 475, Gx_line+56, 483, Gx_line+73, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+172) ;
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
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
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
      AV15EmprCod = "" ;
      AV16ImpCod = "" ;
      AV20PFecha = GXutil.nullDate() ;
      AV21UFecha = GXutil.nullDate() ;
      AV38AlbRef_i = "" ;
      AV39AlbRef_f = "" ;
      AV63Estado_a = "" ;
      AV66Albrenti = "" ;
      AV67Albrentf = "" ;
      AV86Unidad = "" ;
      AV37ContDsc = "" ;
      AV41Lit0 = "" ;
      AV42Lit1 = "" ;
      AV40Lit2 = "" ;
      AV62Lit00 = "" ;
      AV43Lit3 = "" ;
      AV44Lit4 = "" ;
      AV45Lit5 = "" ;
      AV49Lit6 = "" ;
      AV56Lit7 = "" ;
      AV57Lit8 = "" ;
      AV46Lit9 = "" ;
      AV47Lit10 = "" ;
      AV51Lit11 = "" ;
      AV52Lit12 = "" ;
      AV48Lit13 = "" ;
      AV50Lit14 = "" ;
      AV53Lit15 = "" ;
      AV54Lit16 = "" ;
      AV55Lit17 = "" ;
      AV58Lit18 = "" ;
      AV59Lit19 = "" ;
      AV60Lit20 = "" ;
      AV61Lit21 = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P06LN2_A396EmprCod = new String[] {""} ;
      P06LN2_A407EmprNom = new String[] {""} ;
      P06LN2_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      AV17NomEmp = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A46AlbREnt = "" ;
      A56AlbRUni = "" ;
      P06LN3_A396EmprCod = new String[] {""} ;
      P06LN3_A1211TipEntCod = new short[1] ;
      P06LN3_n1211TipEntCod = new boolean[] {false} ;
      P06LN3_A6263AlbRTartC = new short[1] ;
      P06LN3_n6263AlbRTartC = new boolean[] {false} ;
      P06LN3_A47AlbREst = new byte[1] ;
      P06LN3_A279CliNom = new String[] {""} ;
      P06LN3_A252CliCod = new int[1] ;
      P06LN3_A3613AlbRefDsc = new String[] {""} ;
      P06LN3_A5806AlbREnt2 = new String[] {""} ;
      P06LN3_A46AlbREnt = new String[] {""} ;
      P06LN3_A50AlbRLoc = new String[] {""} ;
      P06LN3_A840TrnCod = new short[1] ;
      P06LN3_n840TrnCod = new boolean[] {false} ;
      P06LN3_A970ProceCod = new short[1] ;
      P06LN3_n970ProceCod = new boolean[] {false} ;
      P06LN3_A56AlbRUni = new String[] {""} ;
      P06LN3_A44AlbRecCod = new int[1] ;
      P06LN3_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P06LN3_A45AlbRef = new String[] {""} ;
      P06LN3_A54AlbRPieUti = new int[1] ;
      P06LN3_A52AlbRPieEnt = new int[1] ;
      P06LN3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LN3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A279CliNom = "" ;
      A3613AlbRefDsc = "" ;
      A5806AlbREnt2 = "" ;
      A50AlbRLoc = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      AV22TotUniE = DecimalUtil.ZERO ;
      AV26TotUniS = DecimalUtil.ZERO ;
      AV74AlbRefDsc = "" ;
      AV23ArtCod = "" ;
      AV75AlbREnt2 = "" ;
      AV80AlbRloc5 = "" ;
      AV34TotUniEG = DecimalUtil.ZERO ;
      AV35TotUniSG = DecimalUtil.ZERO ;
      AV31TotUniSal = DecimalUtil.ZERO ;
      A65ArtCod = "" ;
      P06LN4_A65ArtCod = new String[] {""} ;
      P06LN4_A252CliCod = new int[1] ;
      P06LN4_A396EmprCod = new String[] {""} ;
      P06LN4_A69ArtDsc = new String[] {""} ;
      P06LN4_n69ArtDsc = new boolean[] {false} ;
      A69ArtDsc = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rem0003__default(),
         new Object[] {
             new Object[] {
            P06LN2_A396EmprCod, P06LN2_A407EmprNom, P06LN2_n407EmprNom
            }
            , new Object[] {
            P06LN3_A396EmprCod, P06LN3_A1211TipEntCod, P06LN3_n1211TipEntCod, P06LN3_A6263AlbRTartC, P06LN3_n6263AlbRTartC, P06LN3_A47AlbREst, P06LN3_A279CliNom, P06LN3_A252CliCod, P06LN3_A3613AlbRefDsc, P06LN3_A5806AlbREnt2,
            P06LN3_A46AlbREnt, P06LN3_A50AlbRLoc, P06LN3_A840TrnCod, P06LN3_n840TrnCod, P06LN3_A970ProceCod, P06LN3_n970ProceCod, P06LN3_A56AlbRUni, P06LN3_A44AlbRecCod, P06LN3_A49AlbRFen, P06LN3_A45AlbRef,
            P06LN3_A54AlbRPieUti, P06LN3_A52AlbRPieEnt, P06LN3_A60AlbRUniUti, P06LN3_A58AlbRUniEnt
            }
            , new Object[] {
            P06LN4_A65ArtCod, P06LN4_A252CliCod, P06LN4_A396EmprCod, P06LN4_A69ArtDsc, P06LN4_n69ArtDsc
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

   private byte AV68Moda21 ;
   private byte AV69Cli350 ;
   private byte AV71Texfina ;
   private byte AV82vts ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte AV64PAlbRest ;
   private byte AV65UALbRest ;
   private byte AV85ImprimirCliente ;
   private byte A47AlbREst ;
   private short gxcookieaux ;
   private short AV73TipENtcodi ;
   private short AV76Procodi ;
   private short AV77Procodf ;
   private short AV78trnCodi ;
   private short AV79TrnCodf ;
   private short AV83Tipartcod1 ;
   private short AV84Tipartcod2 ;
   private short A6263AlbRTartC ;
   private short A970ProceCod ;
   private short A840TrnCod ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private int AV18PCliente ;
   private int AV19UCliente ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV70Contval ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private int AV27TotPzE ;
   private int AV28TotPzU ;
   private int Gx_OldLine ;
   private int AV24CliCod ;
   private int AV33TotPzEG ;
   private int AV36TotPzUG ;
   private int AV32TotPzSal ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV22TotUniE ;
   private java.math.BigDecimal AV26TotUniS ;
   private java.math.BigDecimal AV34TotUniEG ;
   private java.math.BigDecimal AV35TotUniSG ;
   private java.math.BigDecimal AV31TotUniSal ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV15EmprCod ;
   private String AV16ImpCod ;
   private String AV38AlbRef_i ;
   private String AV39AlbRef_f ;
   private String AV63Estado_a ;
   private String AV66Albrenti ;
   private String AV67Albrentf ;
   private String AV86Unidad ;
   private String AV37ContDsc ;
   private String AV41Lit0 ;
   private String AV42Lit1 ;
   private String AV40Lit2 ;
   private String AV62Lit00 ;
   private String AV43Lit3 ;
   private String AV44Lit4 ;
   private String AV45Lit5 ;
   private String AV49Lit6 ;
   private String AV56Lit7 ;
   private String AV57Lit8 ;
   private String AV46Lit9 ;
   private String AV47Lit10 ;
   private String AV51Lit11 ;
   private String AV52Lit12 ;
   private String AV48Lit13 ;
   private String AV50Lit14 ;
   private String AV53Lit15 ;
   private String AV54Lit16 ;
   private String AV55Lit17 ;
   private String AV58Lit18 ;
   private String AV59Lit19 ;
   private String AV60Lit20 ;
   private String AV61Lit21 ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String AV17NomEmp ;
   private String A45AlbRef ;
   private String A46AlbREnt ;
   private String A56AlbRUni ;
   private String A279CliNom ;
   private String A3613AlbRefDsc ;
   private String A5806AlbREnt2 ;
   private String A50AlbRLoc ;
   private String AV74AlbRefDsc ;
   private String AV23ArtCod ;
   private String AV75AlbREnt2 ;
   private String AV80AlbRloc5 ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String Gx_time ;
   private java.util.Date AV20PFecha ;
   private java.util.Date AV21UFecha ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk6LN4 ;
   private boolean n1211TipEntCod ;
   private boolean n6263AlbRTartC ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean returnInSub ;
   private boolean n69ArtDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P06LN2_A396EmprCod ;
   private String[] P06LN2_A407EmprNom ;
   private boolean[] P06LN2_n407EmprNom ;
   private String[] P06LN3_A396EmprCod ;
   private short[] P06LN3_A1211TipEntCod ;
   private boolean[] P06LN3_n1211TipEntCod ;
   private short[] P06LN3_A6263AlbRTartC ;
   private boolean[] P06LN3_n6263AlbRTartC ;
   private byte[] P06LN3_A47AlbREst ;
   private String[] P06LN3_A279CliNom ;
   private int[] P06LN3_A252CliCod ;
   private String[] P06LN3_A3613AlbRefDsc ;
   private String[] P06LN3_A5806AlbREnt2 ;
   private String[] P06LN3_A46AlbREnt ;
   private String[] P06LN3_A50AlbRLoc ;
   private short[] P06LN3_A840TrnCod ;
   private boolean[] P06LN3_n840TrnCod ;
   private short[] P06LN3_A970ProceCod ;
   private boolean[] P06LN3_n970ProceCod ;
   private String[] P06LN3_A56AlbRUni ;
   private int[] P06LN3_A44AlbRecCod ;
   private java.util.Date[] P06LN3_A49AlbRFen ;
   private String[] P06LN3_A45AlbRef ;
   private int[] P06LN3_A54AlbRPieUti ;
   private int[] P06LN3_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P06LN3_A60AlbRUniUti ;
   private java.math.BigDecimal[] P06LN3_A58AlbRUniEnt ;
   private String[] P06LN4_A65ArtCod ;
   private int[] P06LN4_A252CliCod ;
   private String[] P06LN4_A396EmprCod ;
   private String[] P06LN4_A69ArtDsc ;
   private boolean[] P06LN4_n69ArtDsc ;
}

final  class rem0003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P06LN3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV20PFecha ,
                                          java.util.Date AV21UFecha ,
                                          int AV18PCliente ,
                                          int AV19UCliente ,
                                          String AV38AlbRef_i ,
                                          String AV39AlbRef_f ,
                                          String AV66Albrenti ,
                                          String AV67Albrentf ,
                                          short AV83Tipartcod1 ,
                                          short AV84Tipartcod2 ,
                                          byte AV64PAlbRest ,
                                          byte AV65UALbRest ,
                                          short AV76Procodi ,
                                          short AV77Procodf ,
                                          short AV78trnCodi ,
                                          short AV79TrnCodf ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          short A6263AlbRTartC ,
                                          byte A47AlbREst ,
                                          short A970ProceCod ,
                                          short A840TrnCod ,
                                          short A1211TipEntCod ,
                                          short AV73TipENtcodi ,
                                          String A56AlbRUni ,
                                          String AV86Unidad ,
                                          String AV15EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[21];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.TipEntCod, T1.AlbRTartC, T1.AlbREst, T2.CliNom, T1.CliCod, T1.AlbRefDsc, T1.AlbREnt2, T1.AlbREnt, T1.AlbRLoc, T1.TrnCod, T1.ProceCod, T1.AlbRUni," ;
      scmdbuf += " T1.AlbRecCod, T1.AlbRFen, T1.AlbRef, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRUniEnt FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.TipEntCod <> 9999)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.AlbRUni = ? or (rtrim(?) IS NULL))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV20PFecha)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21UFecha)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int7[6] = (byte)(1) ;
      }
      if ( ! (0==AV18PCliente) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      if ( ! (0==AV19UCliente) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int7[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38AlbRef_i)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef >= ?)");
      }
      else
      {
         GXv_int7[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39AlbRef_f)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef <= ?)");
      }
      else
      {
         GXv_int7[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Albrenti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt >= ?)");
      }
      else
      {
         GXv_int7[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Albrentf)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt <= ?)");
      }
      else
      {
         GXv_int7[12] = (byte)(1) ;
      }
      if ( ! (0==AV83Tipartcod1) )
      {
         addWhere(sWhereString, "(T1.AlbRTartC >= ?)");
      }
      else
      {
         GXv_int7[13] = (byte)(1) ;
      }
      if ( ! (0==AV84Tipartcod2) )
      {
         addWhere(sWhereString, "(T1.AlbRTartC <= ?)");
      }
      else
      {
         GXv_int7[14] = (byte)(1) ;
      }
      if ( ! (0==AV64PAlbRest) )
      {
         addWhere(sWhereString, "(T1.AlbREst >= ?)");
      }
      else
      {
         GXv_int7[15] = (byte)(1) ;
      }
      if ( ! (0==AV65UALbRest) )
      {
         addWhere(sWhereString, "(T1.AlbREst <= ?)");
      }
      else
      {
         GXv_int7[16] = (byte)(1) ;
      }
      if ( ! (0==AV76Procodi) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int7[17] = (byte)(1) ;
      }
      if ( ! (0==AV77Procodf) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int7[18] = (byte)(1) ;
      }
      if ( ! (0==AV78trnCodi) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int7[19] = (byte)(1) ;
      }
      if ( ! (0==AV79TrnCodf) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int7[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.AlbRef, T1.AlbRFen" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   protected Object[] conditional_P06LN4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV18PCliente ,
                                          int AV19UCliente ,
                                          int A252CliCod ,
                                          String AV15EmprCod ,
                                          int AV24CliCod ,
                                          String AV23ArtCod ,
                                          String A396EmprCod ,
                                          String A65ArtCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[5];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT ArtCod, CliCod, EmprCod, ArtDsc FROM TXPARTICU" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ? and ArtCod = ?)");
      if ( ! (0==AV18PCliente) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (0==AV19UCliente) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, ArtCod" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P06LN3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 2 :
                  return conditional_P06LN4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06LN2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06LN3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LN4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((String[]) buf[9])[0] = rslt.getString(8, 20);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((String[]) buf[11])[0] = rslt.getString(10, 10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 1);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((String[]) buf[19])[0] = rslt.getString(16, 16);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               return;
      }
   }

}

