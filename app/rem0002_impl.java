package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rem0002_impl extends GXWebReport
{
   public rem0002_impl( com.genexus.internet.HttpContext context )
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
            AV37AlbRef_i = httpContext.GetPar( "AlbRef_i") ;
            AV38AlbRef_f = httpContext.GetPar( "AlbRef_f") ;
            AV61Albrenti = httpContext.GetPar( "Albrenti") ;
            AV62Albrentf = httpContext.GetPar( "Albrentf") ;
            AV66TipENtcodi = (short)(GXutil.lval( httpContext.GetPar( "TipENtcodi"))) ;
            AV67Tipartcod1 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod1"))) ;
            AV68Tipartcod2 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod2"))) ;
            AV69Estado_a = httpContext.GetPar( "Estado_a") ;
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
         GXv_char1[0] = AV36ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EM0000", ""), GXv_char1) ;
         rem0002_impl.this.AV36ContDsc = GXv_char1[0] ;
         GXt_char2 = AV40Lit0 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV40Lit0 = GXt_char2 ;
         GXt_char2 = AV41Lit1 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV41Lit1 = GXt_char2 ;
         GXt_char2 = AV39Lit2 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV39Lit2 = GXt_char2 ;
         GXt_char2 = AV41Lit1 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV41Lit1 = GXt_char2 ;
         GXt_char2 = AV39Lit2 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN078", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV39Lit2 = GXt_char2 ;
         GXt_char2 = AV60Lit00 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN085", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV60Lit00 = GXt_char2 ;
         AV60Lit00 = GXutil.trim( AV60Lit00) + "(" + GXutil.trim( AV39Lit2) + ")" ;
         GXt_char2 = AV42Lit3 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV42Lit3 = GXt_char2 ;
         GXt_char2 = AV43Lit4 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2097_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV43Lit4 = GXt_char2 ;
         GXt_char2 = AV44Lit5 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2187_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV44Lit5 = GXt_char2 ;
         GXt_char2 = AV45Lit6 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV45Lit6 = GXt_char2 ;
         GXt_char2 = AV46Lit7 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN388_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV46Lit7 = GXt_char2 ;
         GXt_char2 = AV47Lit8 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1480_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV47Lit8 = GXt_char2 ;
         GXt_char2 = AV48Lit9 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV48Lit9 = GXt_char2 ;
         GXt_char2 = AV49Lit10 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1165_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV49Lit10 = GXt_char2 ;
         GXt_char2 = AV52Lit11 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV52Lit11 = GXt_char2 ;
         GXt_char2 = AV53Lit12 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1165_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV53Lit12 = GXt_char2 ;
         GXt_char2 = AV50Lit13 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1016_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV50Lit13 = GXt_char2 ;
         GXt_char2 = AV51Lit14 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1482_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV51Lit14 = GXt_char2 ;
         GXt_char2 = AV56Lit15 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1359_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV56Lit15 = GXt_char2 ;
         GXt_char2 = AV54Lit16 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV54Lit16 = GXt_char2 ;
         GXt_char2 = AV55Lit17 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1165_", ""), (byte)(99), GXv_char1) ;
         rem0002_impl.this.GXt_char2 = GXv_char1[0] ;
         AV55Lit17 = GXt_char2 ;
         GXt_int3 = AV63Moda21 ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int4) ;
         rem0002_impl.this.GXt_int3 = GXv_int4[0] ;
         AV63Moda21 = GXt_int3 ;
         GXt_int3 = AV64Cli350 ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int4) ;
         rem0002_impl.this.GXt_int3 = GXv_int4[0] ;
         AV64Cli350 = GXt_int3 ;
         GXt_int5 = AV65ContVal ;
         GXv_int6[0] = GXt_int5 ;
         new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int6) ;
         rem0002_impl.this.GXt_int5 = GXv_int6[0] ;
         AV65ContVal = GXt_int5 ;
         AV70PAlbRest = (byte)(0) ;
         AV71UALbRest = (byte)(1) ;
         if ( GXutil.strcmp(AV69Estado_a, "0") == 0 )
         {
            AV70PAlbRest = (byte)(0) ;
            AV71UALbRest = (byte)(0) ;
         }
         if ( GXutil.strcmp(AV69Estado_a, "1") == 0 )
         {
            AV70PAlbRest = (byte)(1) ;
            AV71UALbRest = (byte)(1) ;
         }
         /* Using cursor P06PA2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06PA2_A407EmprNom[0] ;
            n407EmprNom = P06PA2_n407EmprNom[0] ;
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
                                              AV37AlbRef_i ,
                                              AV38AlbRef_f ,
                                              AV61Albrenti ,
                                              AV62Albrentf ,
                                              Short.valueOf(AV67Tipartcod1) ,
                                              Short.valueOf(AV68Tipartcod2) ,
                                              Byte.valueOf(AV70PAlbRest) ,
                                              Byte.valueOf(AV71UALbRest) ,
                                              A49AlbRFen ,
                                              Integer.valueOf(A252CliCod) ,
                                              A45AlbRef ,
                                              A46AlbREnt ,
                                              Short.valueOf(A6263AlbRTartC) ,
                                              Byte.valueOf(A47AlbREst) ,
                                              Short.valueOf(A1211TipEntCod) ,
                                              Short.valueOf(AV66TipENtcodi) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING
                                              }
         });
         /* Using cursor P06PA3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(AV66TipENtcodi), Short.valueOf(AV66TipENtcodi), AV20PFecha, AV21UFecha, Integer.valueOf(AV18PCliente), Integer.valueOf(AV19UCliente), AV37AlbRef_i, AV38AlbRef_f, AV61Albrenti, AV62Albrentf, Short.valueOf(AV67Tipartcod1), Short.valueOf(AV68Tipartcod2), Byte.valueOf(AV70PAlbRest), Byte.valueOf(AV71UALbRest)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6PA4 = false ;
            A49AlbRFen = P06PA3_A49AlbRFen[0] ;
            A252CliCod = P06PA3_A252CliCod[0] ;
            A46AlbREnt = P06PA3_A46AlbREnt[0] ;
            A1211TipEntCod = P06PA3_A1211TipEntCod[0] ;
            n1211TipEntCod = P06PA3_n1211TipEntCod[0] ;
            A6263AlbRTartC = P06PA3_A6263AlbRTartC[0] ;
            n6263AlbRTartC = P06PA3_n6263AlbRTartC[0] ;
            A47AlbREst = P06PA3_A47AlbREst[0] ;
            A45AlbRef = P06PA3_A45AlbRef[0] ;
            A52AlbRPieEnt = P06PA3_A52AlbRPieEnt[0] ;
            A58AlbRUniEnt = P06PA3_A58AlbRUniEnt[0] ;
            A54AlbRPieUti = P06PA3_A54AlbRPieUti[0] ;
            A60AlbRUniUti = P06PA3_A60AlbRUniUti[0] ;
            A279CliNom = P06PA3_A279CliNom[0] ;
            A44AlbRecCod = P06PA3_A44AlbRecCod[0] ;
            A279CliNom = P06PA3_A279CliNom[0] ;
            if ( ( AV63Moda21 == 1 ) && ( A252CliCod == 350 ) && ( AV64Cli350 == 1 ) && ( AV65ContVal == 1 ) )
            {
            }
            else
            {
               AV29TotPE = 0 ;
               AV28TotEnt = DecimalUtil.doubleToDec(0) ;
               AV30TotPU = 0 ;
               AV31TotUti = DecimalUtil.doubleToDec(0) ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06PA3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06PA3_A252CliCod[0] == A252CliCod ) )
               {
                  brk6PA4 = false ;
                  A49AlbRFen = P06PA3_A49AlbRFen[0] ;
                  A46AlbREnt = P06PA3_A46AlbREnt[0] ;
                  A1211TipEntCod = P06PA3_A1211TipEntCod[0] ;
                  n1211TipEntCod = P06PA3_n1211TipEntCod[0] ;
                  A6263AlbRTartC = P06PA3_A6263AlbRTartC[0] ;
                  n6263AlbRTartC = P06PA3_n6263AlbRTartC[0] ;
                  A47AlbREst = P06PA3_A47AlbREst[0] ;
                  A45AlbRef = P06PA3_A45AlbRef[0] ;
                  A52AlbRPieEnt = P06PA3_A52AlbRPieEnt[0] ;
                  A58AlbRUniEnt = P06PA3_A58AlbRUniEnt[0] ;
                  A54AlbRPieUti = P06PA3_A54AlbRPieUti[0] ;
                  A60AlbRUniUti = P06PA3_A60AlbRUniUti[0] ;
                  A44AlbRecCod = P06PA3_A44AlbRecCod[0] ;
                  if ( A1211TipEntCod != 9999 )
                  {
                     if ( ( A1211TipEntCod == AV66TipENtcodi ) || (0==AV66TipENtcodi) )
                     {
                        AV29TotPE = (int)(AV29TotPE+A52AlbRPieEnt) ;
                        AV28TotEnt = AV28TotEnt.add(A58AlbRUniEnt) ;
                        AV30TotPU = (int)(AV30TotPU+A54AlbRPieUti) ;
                        AV31TotUti = AV31TotUti.add(A60AlbRUniUti) ;
                     }
                  }
                  brk6PA4 = true ;
                  pr_default.readNext(1);
               }
               AV58Saldo_u = AV28TotEnt.subtract(AV31TotUti) ;
               AV59Saldo_p = (int)(AV29TotPE-AV30TotPU) ;
               h6PA0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 27, Gx_line+1, 72, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 75, Gx_line+0, 295, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotEnt, "ZZZ,ZZZ,ZZ9.99")), 381, Gx_line+1, 484, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29TotPE), "ZZZZZ9")), 515, Gx_line+1, 560, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TotUti, "ZZZ,ZZZ,ZZ9.99")), 564, Gx_line+1, 667, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30TotPU), "ZZZZZ9")), 685, Gx_line+1, 730, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV58Saldo_u, "ZZZ,ZZZ,ZZ9.99")), 741, Gx_line+1, 844, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV59Saldo_p), "ZZZZZ9")), 863, Gx_line+0, 908, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV32TotEP = AV32TotEP.add(AV28TotEnt) ;
               AV34TotPEP = (int)(AV34TotPEP+AV29TotPE) ;
               AV33TotUP = AV33TotUP.add(AV31TotUti) ;
               AV35TotPUP = (int)(AV35TotPUP+AV30TotPU) ;
            }
            if ( ! brk6PA4 )
            {
               brk6PA4 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         AV58Saldo_u = AV32TotEP.subtract(AV33TotUP) ;
         AV59Saldo_p = (int)(AV34TotPEP-AV35TotPUP) ;
         h6PA0( false, 31) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TotEP, "ZZZ,ZZZ,ZZ9.99")), 381, Gx_line+8, 484, Gx_line+26, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV34TotPEP), "ZZZZZ9")), 515, Gx_line+8, 560, Gx_line+26, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TotUP, "ZZZ,ZZZ,ZZ9.99")), 564, Gx_line+8, 667, Gx_line+26, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35TotPUP), "ZZZZZ9")), 685, Gx_line+8, 730, Gx_line+26, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV58Saldo_u, "ZZZ,ZZZ,ZZ9.99")), 741, Gx_line+8, 844, Gx_line+26, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV59Saldo_p), "ZZZZZ9")), 863, Gx_line+8, 908, Gx_line+26, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+31) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6PA0( true, 0) ;
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

   public void h6PA0( boolean bFoot ,
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
            getPrinter().GxDrawLine(21, Gx_line+170, 919, Gx_line+170, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17NomEmp, "")), 26, Gx_line+27, 340, Gx_line+47, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 641, Gx_line+28, 708, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Lit00, "")), 26, Gx_line+59, 444, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit0, "")), 543, Gx_line+28, 627, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit1, "")), 716, Gx_line+28, 800, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit3, "")), 716, Gx_line+60, 800, Gx_line+78, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 804, Gx_line+28, 863, Gx_line+45, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 804, Gx_line+60, 849, Gx_line+78, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36ContDsc, "")), 813, Gx_line+3, 897, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(27, Gx_line+85, 925, Gx_line+85, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV20PFecha, "99/99/99"), 120, Gx_line+95, 187, Gx_line+112, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV21UFecha, "99/99/99"), 286, Gx_line+95, 353, Gx_line+112, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit4, "")), 25, Gx_line+95, 109, Gx_line+113, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit5, "")), 195, Gx_line+95, 279, Gx_line+113, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit9, "")), 400, Gx_line+150, 484, Gx_line+168, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit10, "")), 508, Gx_line+150, 559, Gx_line+168, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit13, "")), 456, Gx_line+123, 540, Gx_line+141, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit6, "")), 27, Gx_line+150, 86, Gx_line+168, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit14, "")), 625, Gx_line+123, 709, Gx_line+141, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit11, "")), 582, Gx_line+150, 666, Gx_line+168, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit12, "")), 679, Gx_line+150, 730, Gx_line+168, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit15, "")), 797, Gx_line+123, 881, Gx_line+141, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit16, "")), 759, Gx_line+152, 843, Gx_line+170, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit17, "")), 856, Gx_line+151, 907, Gx_line+169, 2+256, 0, 0, 0) ;
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
      add_metrics3( ) ;
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
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV16ImpCod = "" ;
      AV20PFecha = GXutil.nullDate() ;
      AV21UFecha = GXutil.nullDate() ;
      AV37AlbRef_i = "" ;
      AV38AlbRef_f = "" ;
      AV61Albrenti = "" ;
      AV62Albrentf = "" ;
      AV69Estado_a = "" ;
      AV36ContDsc = "" ;
      AV40Lit0 = "" ;
      AV41Lit1 = "" ;
      AV39Lit2 = "" ;
      AV60Lit00 = "" ;
      AV42Lit3 = "" ;
      AV43Lit4 = "" ;
      AV44Lit5 = "" ;
      AV45Lit6 = "" ;
      AV46Lit7 = "" ;
      AV47Lit8 = "" ;
      AV48Lit9 = "" ;
      AV49Lit10 = "" ;
      AV52Lit11 = "" ;
      AV53Lit12 = "" ;
      AV50Lit13 = "" ;
      AV51Lit14 = "" ;
      AV56Lit15 = "" ;
      AV54Lit16 = "" ;
      AV55Lit17 = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_int4 = new byte[1] ;
      GXv_int6 = new int[1] ;
      scmdbuf = "" ;
      P06PA2_A396EmprCod = new String[] {""} ;
      P06PA2_A407EmprNom = new String[] {""} ;
      P06PA2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV17NomEmp = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A46AlbREnt = "" ;
      P06PA3_A396EmprCod = new String[] {""} ;
      P06PA3_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P06PA3_A252CliCod = new int[1] ;
      P06PA3_A46AlbREnt = new String[] {""} ;
      P06PA3_A1211TipEntCod = new short[1] ;
      P06PA3_n1211TipEntCod = new boolean[] {false} ;
      P06PA3_A6263AlbRTartC = new short[1] ;
      P06PA3_n6263AlbRTartC = new boolean[] {false} ;
      P06PA3_A47AlbREst = new byte[1] ;
      P06PA3_A45AlbRef = new String[] {""} ;
      P06PA3_A52AlbRPieEnt = new int[1] ;
      P06PA3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06PA3_A54AlbRPieUti = new int[1] ;
      P06PA3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06PA3_A279CliNom = new String[] {""} ;
      P06PA3_A44AlbRecCod = new int[1] ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      AV28TotEnt = DecimalUtil.ZERO ;
      AV31TotUti = DecimalUtil.ZERO ;
      AV58Saldo_u = DecimalUtil.ZERO ;
      AV32TotEP = DecimalUtil.ZERO ;
      AV33TotUP = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rem0002__default(),
         new Object[] {
             new Object[] {
            P06PA2_A396EmprCod, P06PA2_A407EmprNom, P06PA2_n407EmprNom
            }
            , new Object[] {
            P06PA3_A396EmprCod, P06PA3_A49AlbRFen, P06PA3_A252CliCod, P06PA3_A46AlbREnt, P06PA3_A1211TipEntCod, P06PA3_n1211TipEntCod, P06PA3_A6263AlbRTartC, P06PA3_n6263AlbRTartC, P06PA3_A47AlbREst, P06PA3_A45AlbRef,
            P06PA3_A52AlbRPieEnt, P06PA3_A58AlbRUniEnt, P06PA3_A54AlbRPieUti, P06PA3_A60AlbRUniUti, P06PA3_A279CliNom, P06PA3_A44AlbRecCod
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

   private byte AV63Moda21 ;
   private byte AV64Cli350 ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte AV70PAlbRest ;
   private byte AV71UALbRest ;
   private byte A47AlbREst ;
   private short gxcookieaux ;
   private short AV66TipENtcodi ;
   private short AV67Tipartcod1 ;
   private short AV68Tipartcod2 ;
   private short A6263AlbRTartC ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private int AV18PCliente ;
   private int AV19UCliente ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV65ContVal ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A44AlbRecCod ;
   private int AV29TotPE ;
   private int AV30TotPU ;
   private int AV59Saldo_p ;
   private int Gx_OldLine ;
   private int AV34TotPEP ;
   private int AV35TotPUP ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV28TotEnt ;
   private java.math.BigDecimal AV31TotUti ;
   private java.math.BigDecimal AV58Saldo_u ;
   private java.math.BigDecimal AV32TotEP ;
   private java.math.BigDecimal AV33TotUP ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV16ImpCod ;
   private String AV37AlbRef_i ;
   private String AV38AlbRef_f ;
   private String AV61Albrenti ;
   private String AV62Albrentf ;
   private String AV69Estado_a ;
   private String AV36ContDsc ;
   private String AV40Lit0 ;
   private String AV41Lit1 ;
   private String AV39Lit2 ;
   private String AV60Lit00 ;
   private String AV42Lit3 ;
   private String AV43Lit4 ;
   private String AV44Lit5 ;
   private String AV45Lit6 ;
   private String AV46Lit7 ;
   private String AV47Lit8 ;
   private String AV48Lit9 ;
   private String AV49Lit10 ;
   private String AV52Lit11 ;
   private String AV53Lit12 ;
   private String AV50Lit13 ;
   private String AV51Lit14 ;
   private String AV56Lit15 ;
   private String AV54Lit16 ;
   private String AV55Lit17 ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV17NomEmp ;
   private String A45AlbRef ;
   private String A46AlbREnt ;
   private String A279CliNom ;
   private String Gx_time ;
   private java.util.Date AV20PFecha ;
   private java.util.Date AV21UFecha ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk6PA4 ;
   private boolean n1211TipEntCod ;
   private boolean n6263AlbRTartC ;
   private IDataStoreProvider pr_default ;
   private String[] P06PA2_A396EmprCod ;
   private String[] P06PA2_A407EmprNom ;
   private boolean[] P06PA2_n407EmprNom ;
   private String[] P06PA3_A396EmprCod ;
   private java.util.Date[] P06PA3_A49AlbRFen ;
   private int[] P06PA3_A252CliCod ;
   private String[] P06PA3_A46AlbREnt ;
   private short[] P06PA3_A1211TipEntCod ;
   private boolean[] P06PA3_n1211TipEntCod ;
   private short[] P06PA3_A6263AlbRTartC ;
   private boolean[] P06PA3_n6263AlbRTartC ;
   private byte[] P06PA3_A47AlbREst ;
   private String[] P06PA3_A45AlbRef ;
   private int[] P06PA3_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P06PA3_A58AlbRUniEnt ;
   private int[] P06PA3_A54AlbRPieUti ;
   private java.math.BigDecimal[] P06PA3_A60AlbRUniUti ;
   private String[] P06PA3_A279CliNom ;
   private int[] P06PA3_A44AlbRecCod ;
}

final  class rem0002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P06PA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV20PFecha ,
                                          java.util.Date AV21UFecha ,
                                          int AV18PCliente ,
                                          int AV19UCliente ,
                                          String AV37AlbRef_i ,
                                          String AV38AlbRef_f ,
                                          String AV61Albrenti ,
                                          String AV62Albrentf ,
                                          short AV67Tipartcod1 ,
                                          short AV68Tipartcod2 ,
                                          byte AV70PAlbRest ,
                                          byte AV71UALbRest ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          short A6263AlbRTartC ,
                                          byte A47AlbREst ,
                                          short A1211TipEntCod ,
                                          short AV66TipENtcodi ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[15];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRFen, T1.CliCod, T1.AlbREnt, T1.TipEntCod, T1.AlbRTartC, T1.AlbREst, T1.AlbRef, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRPieUti, T1.AlbRUniUti," ;
      scmdbuf += " T2.CliNom, T1.AlbRecCod FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
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
      if ( ! (GXutil.strcmp("", AV37AlbRef_i)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef >= ?)");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38AlbRef_f)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef <= ?)");
      }
      else
      {
         GXv_int7[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Albrenti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt >= ?)");
      }
      else
      {
         GXv_int7[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Albrentf)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt <= ?)");
      }
      else
      {
         GXv_int7[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Tipartcod1) )
      {
         addWhere(sWhereString, "(T1.AlbRTartC >= ?)");
      }
      else
      {
         GXv_int7[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Tipartcod2) )
      {
         addWhere(sWhereString, "(T1.AlbRTartC <= ?)");
      }
      else
      {
         GXv_int7[12] = (byte)(1) ;
      }
      if ( ! (0==AV70PAlbRest) )
      {
         addWhere(sWhereString, "(T1.AlbREst >= ?)");
      }
      else
      {
         GXv_int7[13] = (byte)(1) ;
      }
      if ( ! (0==AV71UALbRest) )
      {
         addWhere(sWhereString, "(T1.AlbREst <= ?)");
      }
      else
      {
         GXv_int7[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod" ;
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
                  return conditional_P06PA3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06PA2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06PA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 30);
               ((int[]) buf[15])[0] = rslt.getInt(14);
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
      }
   }

}

