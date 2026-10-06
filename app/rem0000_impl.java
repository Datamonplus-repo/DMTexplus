package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rem0000_impl extends GXWebReport
{
   public rem0000_impl( com.genexus.internet.HttpContext context )
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
            AV38AlbRef_i = httpContext.GetPar( "AlbRef_i") ;
            AV39AlbRef_f = httpContext.GetPar( "AlbRef_f") ;
            AV59Albrenti = httpContext.GetPar( "Albrenti") ;
            AV60Albrentf = httpContext.GetPar( "Albrentf") ;
            AV64TipEntcodi = (short)(GXutil.lval( httpContext.GetPar( "TipEntcodi"))) ;
            AV65Tipartcod1 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod1"))) ;
            AV66Tipartcod2 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod2"))) ;
            AV67Estado_a = httpContext.GetPar( "Estado_a") ;
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
         GXt_char1 = AV43Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit0 = GXt_char1 ;
         GXt_char1 = AV40Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit1 = GXt_char1 ;
         GXt_char1 = AV41Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN076", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit2 = GXt_char1 ;
         GXt_char1 = AV58Lit00 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN085", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit00 = GXt_char1 ;
         AV58Lit00 = GXutil.trim( AV58Lit00) + "(" + GXutil.trim( AV41Lit2) + ")" ;
         GXt_char1 = AV42Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit3 = GXt_char1 ;
         GXt_char1 = AV44Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2097_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit4 = GXt_char1 ;
         GXt_char1 = AV45Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2187_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit5 = GXt_char1 ;
         GXt_char1 = AV46Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit6 = GXt_char1 ;
         GXt_char1 = AV47Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN388_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit7 = GXt_char1 ;
         GXt_char1 = AV48Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1480_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit8 = GXt_char1 ;
         GXt_char1 = AV49Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit9 = GXt_char1 ;
         GXt_char1 = AV50Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1165_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit10 = GXt_char1 ;
         GXt_char1 = AV51Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV51Lit11 = GXt_char1 ;
         GXt_char1 = AV52Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1165_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV52Lit12 = GXt_char1 ;
         GXt_char1 = AV53Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1016_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV53Lit13 = GXt_char1 ;
         GXt_char1 = AV54Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1482_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV54Lit14 = GXt_char1 ;
         GXt_char1 = AV55Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1359_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV55Lit15 = GXt_char1 ;
         GXt_char1 = AV56Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV56Lit16 = GXt_char1 ;
         GXt_char1 = AV57Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1165_", ""), (byte)(99), GXv_char2) ;
         rem0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV57Lit17 = GXt_char1 ;
         GXv_char2[0] = AV37ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EM0000", ""), GXv_char2) ;
         rem0000_impl.this.AV37ContDsc = GXv_char2[0] ;
         GXt_int3 = AV61Moda21 ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int4) ;
         rem0000_impl.this.GXt_int3 = GXv_int4[0] ;
         AV61Moda21 = GXt_int3 ;
         GXt_int3 = AV62Cli350 ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int4) ;
         rem0000_impl.this.GXt_int3 = GXv_int4[0] ;
         AV62Cli350 = GXt_int3 ;
         GXt_int5 = AV63ContVal ;
         GXv_int6[0] = GXt_int5 ;
         new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int6) ;
         rem0000_impl.this.GXt_int5 = GXv_int6[0] ;
         AV63ContVal = GXt_int5 ;
         AV68PAlbRest = (byte)(0) ;
         AV69UALbRest = (byte)(1) ;
         if ( GXutil.strcmp(AV67Estado_a, "0") == 0 )
         {
            AV68PAlbRest = (byte)(0) ;
            AV69UALbRest = (byte)(0) ;
         }
         if ( GXutil.strcmp(AV67Estado_a, "1") == 0 )
         {
            AV68PAlbRest = (byte)(1) ;
            AV69UALbRest = (byte)(1) ;
         }
         /* Using cursor P06LM2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06LM2_A407EmprNom[0] ;
            n407EmprNom = P06LM2_n407EmprNom[0] ;
            AV17NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV20PFecha ,
                                              AV21UFecha ,
                                              Integer.valueOf(AV18PCliente) ,
                                              Integer.valueOf(AV19UCliente) ,
                                              AV38AlbRef_i ,
                                              AV39AlbRef_f ,
                                              AV59Albrenti ,
                                              AV60Albrentf ,
                                              Short.valueOf(AV65Tipartcod1) ,
                                              Short.valueOf(AV66Tipartcod2) ,
                                              Byte.valueOf(AV68PAlbRest) ,
                                              Byte.valueOf(AV69UALbRest) ,
                                              A49AlbRFen ,
                                              Integer.valueOf(A252CliCod) ,
                                              A45AlbRef ,
                                              A46AlbREnt ,
                                              Short.valueOf(A6263AlbRTartC) ,
                                              Byte.valueOf(A47AlbREst) ,
                                              Short.valueOf(A1211TipEntCod) ,
                                              Short.valueOf(AV64TipEntcodi) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING
                                              }
         });
         /* Using cursor P06LM3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(AV64TipEntcodi), Short.valueOf(AV64TipEntcodi), AV20PFecha, AV21UFecha, Integer.valueOf(AV18PCliente), Integer.valueOf(AV19UCliente), AV38AlbRef_i, AV39AlbRef_f, AV59Albrenti, AV60Albrentf, Short.valueOf(AV65Tipartcod1), Short.valueOf(AV66Tipartcod2), Byte.valueOf(AV68PAlbRest), Byte.valueOf(AV69UALbRest)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6LM4 = false ;
            A49AlbRFen = P06LM3_A49AlbRFen[0] ;
            A45AlbRef = P06LM3_A45AlbRef[0] ;
            A46AlbREnt = P06LM3_A46AlbREnt[0] ;
            A1211TipEntCod = P06LM3_A1211TipEntCod[0] ;
            n1211TipEntCod = P06LM3_n1211TipEntCod[0] ;
            A6263AlbRTartC = P06LM3_A6263AlbRTartC[0] ;
            n6263AlbRTartC = P06LM3_n6263AlbRTartC[0] ;
            A47AlbREst = P06LM3_A47AlbREst[0] ;
            A58AlbRUniEnt = P06LM3_A58AlbRUniEnt[0] ;
            A60AlbRUniUti = P06LM3_A60AlbRUniUti[0] ;
            A52AlbRPieEnt = P06LM3_A52AlbRPieEnt[0] ;
            A54AlbRPieUti = P06LM3_A54AlbRPieUti[0] ;
            A970ProceCod = P06LM3_A970ProceCod[0] ;
            n970ProceCod = P06LM3_n970ProceCod[0] ;
            A4295ClasCod = P06LM3_A4295ClasCod[0] ;
            n4295ClasCod = P06LM3_n4295ClasCod[0] ;
            A252CliCod = P06LM3_A252CliCod[0] ;
            A3613AlbRefDsc = P06LM3_A3613AlbRefDsc[0] ;
            A56AlbRUni = P06LM3_A56AlbRUni[0] ;
            A279CliNom = P06LM3_A279CliNom[0] ;
            A44AlbRecCod = P06LM3_A44AlbRecCod[0] ;
            A279CliNom = P06LM3_A279CliNom[0] ;
            if ( ( AV61Moda21 == 1 ) && ( A252CliCod == 350 ) && ( AV62Cli350 == 1 ) && ( AV63ContVal == 1 ) )
            {
            }
            else
            {
               AV23ArtCod = A45AlbRef ;
               AV30ArtRef = A3613AlbRefDsc ;
               if ( (GXutil.strcmp("", AV30ArtRef)==0) || ( GXutil.strcmp(GXutil.trim( AV30ArtRef), "") == 0 ) )
               {
                  /* Using cursor P06LM4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV23ArtCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
                  while ( (pr_default.getStatus(2) != 101) )
                  {
                     A10030ArtTh = P06LM4_A10030ArtTh[0] ;
                     n10030ArtTh = P06LM4_n10030ArtTh[0] ;
                     A65ArtCod = P06LM4_A65ArtCod[0] ;
                     A69ArtDsc = P06LM4_A69ArtDsc[0] ;
                     n69ArtDsc = P06LM4_n69ArtDsc[0] ;
                     AV30ArtRef = A69ArtDsc ;
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(2);
               }
               AV24CliCod = A252CliCod ;
               AV29AlbUni = A56AlbRUni ;
               AV22TotUniE = DecimalUtil.doubleToDec(0) ;
               AV26TotUniS = DecimalUtil.doubleToDec(0) ;
               AV27TotPzE = 0 ;
               AV28TotPzU = 0 ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06LM3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06LM3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P06LM3_A45AlbRef[0], A45AlbRef) == 0 ) )
               {
                  brk6LM4 = false ;
                  A49AlbRFen = P06LM3_A49AlbRFen[0] ;
                  A46AlbREnt = P06LM3_A46AlbREnt[0] ;
                  A1211TipEntCod = P06LM3_A1211TipEntCod[0] ;
                  n1211TipEntCod = P06LM3_n1211TipEntCod[0] ;
                  A6263AlbRTartC = P06LM3_A6263AlbRTartC[0] ;
                  n6263AlbRTartC = P06LM3_n6263AlbRTartC[0] ;
                  A47AlbREst = P06LM3_A47AlbREst[0] ;
                  A58AlbRUniEnt = P06LM3_A58AlbRUniEnt[0] ;
                  A60AlbRUniUti = P06LM3_A60AlbRUniUti[0] ;
                  A52AlbRPieEnt = P06LM3_A52AlbRPieEnt[0] ;
                  A54AlbRPieUti = P06LM3_A54AlbRPieUti[0] ;
                  A44AlbRecCod = P06LM3_A44AlbRecCod[0] ;
                  if ( A1211TipEntCod != 9999 )
                  {
                     if ( ( A1211TipEntCod == AV64TipEntcodi ) || (0==AV64TipEntcodi) )
                     {
                        AV22TotUniE = AV22TotUniE.add(A58AlbRUniEnt) ;
                        AV26TotUniS = AV26TotUniS.add(A60AlbRUniUti) ;
                        AV27TotPzE = (int)(AV27TotPzE+A52AlbRPieEnt) ;
                        AV28TotPzU = (int)(AV28TotPzU+A54AlbRPieUti) ;
                        AV33TotUniEG = AV33TotUniEG.add(A58AlbRUniEnt) ;
                        AV34TotUniSG = AV34TotUniSG.add(A60AlbRUniUti) ;
                        AV35TotPzEG = (int)(AV35TotPzEG+A52AlbRPieEnt) ;
                        AV36TotPzUG = (int)(AV36TotPzUG+A54AlbRPieUti) ;
                     }
                  }
                  brk6LM4 = true ;
                  pr_default.readNext(1);
               }
               AV32TotPzSal = (int)(AV27TotPzE-AV28TotPzU) ;
               AV31TotUniSal = AV22TotUniE.subtract(AV26TotUniS) ;
               h6LM0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 29, Gx_line+0, 74, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 78, Gx_line+0, 298, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ArtCod, "")), 302, Gx_line+0, 420, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TotUniE, "Z,ZZZ,ZZ9.99")), 638, Gx_line+0, 727, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27TotPzE), "ZZZZZ9")), 744, Gx_line+0, 789, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29AlbUni, "@!")), 618, Gx_line+0, 626, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26TotUniS, "ZZ,ZZZ,ZZ9.99")), 799, Gx_line+0, 895, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28TotPzU), "ZZZZZ9")), 914, Gx_line+0, 959, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30ArtRef, "")), 423, Gx_line+0, 614, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TotUniSal, "ZZ,ZZZ,ZZ9.99")), 966, Gx_line+0, 1062, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32TotPzSal), "ZZZZZ9")), 1069, Gx_line+0, 1114, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            if ( ! brk6LM4 )
            {
               brk6LM4 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         AV32TotPzSal = (int)(AV35TotPzEG-AV36TotPzUG) ;
         AV31TotUniSal = AV33TotUniEG.subtract(AV34TotUniSG) ;
         h6LM0( false, 42) ;
         getPrinter().GxAttris("Arial", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total Informe", ""), 526, Gx_line+18, 615, Gx_line+35, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TotUniEG, "ZZ,ZZZ,ZZ9.99")), 630, Gx_line+19, 726, Gx_line+35, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TotUniSG, "ZZ,ZZZ,ZZ9.99")), 799, Gx_line+19, 895, Gx_line+35, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TotUniSal, "ZZ,ZZZ,ZZ9.99")), 966, Gx_line+19, 1062, Gx_line+35, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35TotPzEG), "ZZZZZ9")), 744, Gx_line+19, 789, Gx_line+35, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36TotPzUG), "ZZZZZ9")), 914, Gx_line+19, 959, Gx_line+35, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32TotPzSal), "ZZZZZ9")), 1069, Gx_line+19, 1114, Gx_line+35, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+42) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6LM0( true, 0) ;
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

   public void h6LM0( boolean bFoot ,
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
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17NomEmp, "")), 22, Gx_line+33, 336, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1046, Gx_line+67, 1097, Gx_line+85, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 893, Gx_line+33, 961, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 1046, Gx_line+33, 1114, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(22, Gx_line+90, 1140, Gx_line+90, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV20PFecha, "99/99/99"), 117, Gx_line+100, 184, Gx_line+117, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV21UFecha, "99/99/99"), 283, Gx_line+100, 350, Gx_line+117, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(20, Gx_line+154, 1138, Gx_line+154, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37ContDsc, "")), 1031, Gx_line+5, 1136, Gx_line+19, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit0, "")), 795, Gx_line+33, 879, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit1, "")), 958, Gx_line+33, 1042, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit3, "")), 958, Gx_line+67, 1042, Gx_line+85, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit4, "")), 22, Gx_line+100, 106, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit5, "")), 192, Gx_line+100, 276, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit6, "")), 29, Gx_line+133, 88, Gx_line+151, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit7, "")), 304, Gx_line+133, 372, Gx_line+151, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit8, "")), 423, Gx_line+133, 507, Gx_line+151, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit9, "")), 642, Gx_line+133, 726, Gx_line+151, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit10, "")), 738, Gx_line+133, 789, Gx_line+151, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit13, "")), 690, Gx_line+111, 774, Gx_line+129, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit14, "")), 853, Gx_line+111, 937, Gx_line+129, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit11, "")), 810, Gx_line+133, 894, Gx_line+151, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit12, "")), 907, Gx_line+133, 958, Gx_line+151, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit15, "")), 1015, Gx_line+111, 1099, Gx_line+129, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit16, "")), 977, Gx_line+133, 1061, Gx_line+151, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit17, "")), 1074, Gx_line+132, 1125, Gx_line+150, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "U", ""), 621, Gx_line+133, 630, Gx_line+150, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit00, "")), 22, Gx_line+65, 440, Gx_line+85, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+156) ;
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
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
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
      AV16ImpCod = "" ;
      AV20PFecha = GXutil.nullDate() ;
      AV21UFecha = GXutil.nullDate() ;
      AV38AlbRef_i = "" ;
      AV39AlbRef_f = "" ;
      AV59Albrenti = "" ;
      AV60Albrentf = "" ;
      AV67Estado_a = "" ;
      AV43Lit0 = "" ;
      AV40Lit1 = "" ;
      AV41Lit2 = "" ;
      AV58Lit00 = "" ;
      AV42Lit3 = "" ;
      AV44Lit4 = "" ;
      AV45Lit5 = "" ;
      AV46Lit6 = "" ;
      AV47Lit7 = "" ;
      AV48Lit8 = "" ;
      AV49Lit9 = "" ;
      AV50Lit10 = "" ;
      AV51Lit11 = "" ;
      AV52Lit12 = "" ;
      AV53Lit13 = "" ;
      AV54Lit14 = "" ;
      AV55Lit15 = "" ;
      AV56Lit16 = "" ;
      AV57Lit17 = "" ;
      GXt_char1 = "" ;
      AV37ContDsc = "" ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new byte[1] ;
      GXv_int6 = new int[1] ;
      scmdbuf = "" ;
      P06LM2_A396EmprCod = new String[] {""} ;
      P06LM2_A407EmprNom = new String[] {""} ;
      P06LM2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV17NomEmp = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A46AlbREnt = "" ;
      P06LM3_A396EmprCod = new String[] {""} ;
      P06LM3_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P06LM3_A45AlbRef = new String[] {""} ;
      P06LM3_A46AlbREnt = new String[] {""} ;
      P06LM3_A1211TipEntCod = new short[1] ;
      P06LM3_n1211TipEntCod = new boolean[] {false} ;
      P06LM3_A6263AlbRTartC = new short[1] ;
      P06LM3_n6263AlbRTartC = new boolean[] {false} ;
      P06LM3_A47AlbREst = new byte[1] ;
      P06LM3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LM3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LM3_A52AlbRPieEnt = new int[1] ;
      P06LM3_A54AlbRPieUti = new int[1] ;
      P06LM3_A970ProceCod = new short[1] ;
      P06LM3_n970ProceCod = new boolean[] {false} ;
      P06LM3_A4295ClasCod = new short[1] ;
      P06LM3_n4295ClasCod = new boolean[] {false} ;
      P06LM3_A252CliCod = new int[1] ;
      P06LM3_A3613AlbRefDsc = new String[] {""} ;
      P06LM3_A56AlbRUni = new String[] {""} ;
      P06LM3_A279CliNom = new String[] {""} ;
      P06LM3_A44AlbRecCod = new int[1] ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A3613AlbRefDsc = "" ;
      A56AlbRUni = "" ;
      A279CliNom = "" ;
      AV23ArtCod = "" ;
      AV30ArtRef = "" ;
      P06LM4_A396EmprCod = new String[] {""} ;
      P06LM4_A252CliCod = new int[1] ;
      P06LM4_A4295ClasCod = new short[1] ;
      P06LM4_n4295ClasCod = new boolean[] {false} ;
      P06LM4_A10030ArtTh = new short[1] ;
      P06LM4_n10030ArtTh = new boolean[] {false} ;
      P06LM4_A65ArtCod = new String[] {""} ;
      P06LM4_A69ArtDsc = new String[] {""} ;
      P06LM4_n69ArtDsc = new boolean[] {false} ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      AV29AlbUni = "" ;
      AV22TotUniE = DecimalUtil.ZERO ;
      AV26TotUniS = DecimalUtil.ZERO ;
      AV33TotUniEG = DecimalUtil.ZERO ;
      AV34TotUniSG = DecimalUtil.ZERO ;
      AV31TotUniSal = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rem0000__default(),
         new Object[] {
             new Object[] {
            P06LM2_A396EmprCod, P06LM2_A407EmprNom, P06LM2_n407EmprNom
            }
            , new Object[] {
            P06LM3_A396EmprCod, P06LM3_A49AlbRFen, P06LM3_A45AlbRef, P06LM3_A46AlbREnt, P06LM3_A1211TipEntCod, P06LM3_n1211TipEntCod, P06LM3_A6263AlbRTartC, P06LM3_n6263AlbRTartC, P06LM3_A47AlbREst, P06LM3_A58AlbRUniEnt,
            P06LM3_A60AlbRUniUti, P06LM3_A52AlbRPieEnt, P06LM3_A54AlbRPieUti, P06LM3_A970ProceCod, P06LM3_n970ProceCod, P06LM3_A4295ClasCod, P06LM3_n4295ClasCod, P06LM3_A252CliCod, P06LM3_A3613AlbRefDsc, P06LM3_A56AlbRUni,
            P06LM3_A279CliNom, P06LM3_A44AlbRecCod
            }
            , new Object[] {
            P06LM4_A396EmprCod, P06LM4_A252CliCod, P06LM4_A4295ClasCod, P06LM4_n4295ClasCod, P06LM4_A10030ArtTh, P06LM4_n10030ArtTh, P06LM4_A65ArtCod, P06LM4_A69ArtDsc, P06LM4_n69ArtDsc
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

   private byte AV61Moda21 ;
   private byte AV62Cli350 ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte AV68PAlbRest ;
   private byte AV69UALbRest ;
   private byte A47AlbREst ;
   private short gxcookieaux ;
   private short AV64TipEntcodi ;
   private short AV65Tipartcod1 ;
   private short AV66Tipartcod2 ;
   private short A6263AlbRTartC ;
   private short A1211TipEntCod ;
   private short A970ProceCod ;
   private short A4295ClasCod ;
   private short A10030ArtTh ;
   private short Gx_err ;
   private int AV18PCliente ;
   private int AV19UCliente ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV63ContVal ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A44AlbRecCod ;
   private int AV24CliCod ;
   private int AV27TotPzE ;
   private int AV28TotPzU ;
   private int AV35TotPzEG ;
   private int AV36TotPzUG ;
   private int AV32TotPzSal ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV22TotUniE ;
   private java.math.BigDecimal AV26TotUniS ;
   private java.math.BigDecimal AV33TotUniEG ;
   private java.math.BigDecimal AV34TotUniSG ;
   private java.math.BigDecimal AV31TotUniSal ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV16ImpCod ;
   private String AV38AlbRef_i ;
   private String AV39AlbRef_f ;
   private String AV59Albrenti ;
   private String AV60Albrentf ;
   private String AV67Estado_a ;
   private String AV43Lit0 ;
   private String AV40Lit1 ;
   private String AV41Lit2 ;
   private String AV58Lit00 ;
   private String AV42Lit3 ;
   private String AV44Lit4 ;
   private String AV45Lit5 ;
   private String AV46Lit6 ;
   private String AV47Lit7 ;
   private String AV48Lit8 ;
   private String AV49Lit9 ;
   private String AV50Lit10 ;
   private String AV51Lit11 ;
   private String AV52Lit12 ;
   private String AV53Lit13 ;
   private String AV54Lit14 ;
   private String AV55Lit15 ;
   private String AV56Lit16 ;
   private String AV57Lit17 ;
   private String GXt_char1 ;
   private String AV37ContDsc ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV17NomEmp ;
   private String A45AlbRef ;
   private String A46AlbREnt ;
   private String A3613AlbRefDsc ;
   private String A56AlbRUni ;
   private String A279CliNom ;
   private String AV23ArtCod ;
   private String AV30ArtRef ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String AV29AlbUni ;
   private String Gx_time ;
   private java.util.Date AV20PFecha ;
   private java.util.Date AV21UFecha ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk6LM4 ;
   private boolean n1211TipEntCod ;
   private boolean n6263AlbRTartC ;
   private boolean n970ProceCod ;
   private boolean n4295ClasCod ;
   private boolean n10030ArtTh ;
   private boolean n69ArtDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P06LM2_A396EmprCod ;
   private String[] P06LM2_A407EmprNom ;
   private boolean[] P06LM2_n407EmprNom ;
   private String[] P06LM3_A396EmprCod ;
   private java.util.Date[] P06LM3_A49AlbRFen ;
   private String[] P06LM3_A45AlbRef ;
   private String[] P06LM3_A46AlbREnt ;
   private short[] P06LM3_A1211TipEntCod ;
   private boolean[] P06LM3_n1211TipEntCod ;
   private short[] P06LM3_A6263AlbRTartC ;
   private boolean[] P06LM3_n6263AlbRTartC ;
   private byte[] P06LM3_A47AlbREst ;
   private java.math.BigDecimal[] P06LM3_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P06LM3_A60AlbRUniUti ;
   private int[] P06LM3_A52AlbRPieEnt ;
   private int[] P06LM3_A54AlbRPieUti ;
   private short[] P06LM3_A970ProceCod ;
   private boolean[] P06LM3_n970ProceCod ;
   private short[] P06LM3_A4295ClasCod ;
   private boolean[] P06LM3_n4295ClasCod ;
   private int[] P06LM3_A252CliCod ;
   private String[] P06LM3_A3613AlbRefDsc ;
   private String[] P06LM3_A56AlbRUni ;
   private String[] P06LM3_A279CliNom ;
   private int[] P06LM3_A44AlbRecCod ;
   private String[] P06LM4_A396EmprCod ;
   private int[] P06LM4_A252CliCod ;
   private short[] P06LM4_A4295ClasCod ;
   private boolean[] P06LM4_n4295ClasCod ;
   private short[] P06LM4_A10030ArtTh ;
   private boolean[] P06LM4_n10030ArtTh ;
   private String[] P06LM4_A65ArtCod ;
   private String[] P06LM4_A69ArtDsc ;
   private boolean[] P06LM4_n69ArtDsc ;
}

final  class rem0000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P06LM3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV20PFecha ,
                                          java.util.Date AV21UFecha ,
                                          int AV18PCliente ,
                                          int AV19UCliente ,
                                          String AV38AlbRef_i ,
                                          String AV39AlbRef_f ,
                                          String AV59Albrenti ,
                                          String AV60Albrentf ,
                                          short AV65Tipartcod1 ,
                                          short AV66Tipartcod2 ,
                                          byte AV68PAlbRest ,
                                          byte AV69UALbRest ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          short A6263AlbRTartC ,
                                          byte A47AlbREst ,
                                          short A1211TipEntCod ,
                                          short AV64TipEntcodi ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[15];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRFen, T1.AlbRef, T1.AlbREnt, T1.TipEntCod, T1.AlbRTartC, T1.AlbREst, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRPieEnt, T1.AlbRPieUti, T1.ProceCod," ;
      scmdbuf += " T1.ClasCod, T1.CliCod, T1.AlbRefDsc, T1.AlbRUni, T2.CliNom, T1.AlbRecCod FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
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
      if ( ! (GXutil.strcmp("", AV38AlbRef_i)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef >= ?)");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39AlbRef_f)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef <= ?)");
      }
      else
      {
         GXv_int7[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Albrenti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt >= ?)");
      }
      else
      {
         GXv_int7[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Albrentf)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt <= ?)");
      }
      else
      {
         GXv_int7[10] = (byte)(1) ;
      }
      if ( ! (0==AV65Tipartcod1) )
      {
         addWhere(sWhereString, "(T1.AlbRTartC >= ?)");
      }
      else
      {
         GXv_int7[11] = (byte)(1) ;
      }
      if ( ! (0==AV66Tipartcod2) )
      {
         addWhere(sWhereString, "(T1.AlbRTartC <= ?)");
      }
      else
      {
         GXv_int7[12] = (byte)(1) ;
      }
      if ( ! (0==AV68PAlbRest) )
      {
         addWhere(sWhereString, "(T1.AlbREst >= ?)");
      }
      else
      {
         GXv_int7[13] = (byte)(1) ;
      }
      if ( ! (0==AV69UALbRest) )
      {
         addWhere(sWhereString, "(T1.AlbREst <= ?)");
      }
      else
      {
         GXv_int7[14] = (byte)(1) ;
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
                  return conditional_P06LM3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06LM2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06LM3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LM4", "SELECT * FROM (SELECT EmprCod, CliCod, ClasCod, ArtTh, ArtCod, ArtDsc FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (ClasCod = ?) AND (ArtTh = ?) ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((String[]) buf[18])[0] = rslt.getString(15, 26);
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               ((String[]) buf[20])[0] = rslt.getString(17, 30);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((String[]) buf[7])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               return;
      }
   }

}

