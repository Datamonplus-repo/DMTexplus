package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class arpr0001r_impl extends GXWebReport
{
   public arpr0001r_impl( com.genexus.internet.HttpContext context )
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
            AV17Pfec = localUtil.parseDateParm( httpContext.GetPar( "Pfec")) ;
            AV19Pmaq = httpContext.GetPar( "Pmaq") ;
            AV15Poper = (int)(GXutil.lval( httpContext.GetPar( "Poper"))) ;
            AV18Ufec = localUtil.parseDateParm( httpContext.GetPar( "Ufec")) ;
            AV20Umaq = httpContext.GetPar( "Umaq") ;
            AV16Uoper = (int)(GXutil.lval( httpContext.GetPar( "Uoper"))) ;
            AV72TipMaqCod = httpContext.GetPar( "TipMaqCod") ;
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
         GXt_char1 = AV50Lit01 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT561_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit01 = GXt_char1 ;
         GXt_char1 = AV51Lit02 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV51Lit02 = GXt_char1 ;
         GXt_char1 = AV27Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV75Pgmname, (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit0 = GXt_char1 ;
         GXt_char1 = AV28Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit1 = GXt_char1 ;
         GXt_char1 = AV52Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV52Lit2 = GXt_char1 ;
         GXt_char1 = AV29Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit3 = GXt_char1 ;
         GXt_char1 = AV36Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2097_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit4 = GXt_char1 ;
         GXt_char1 = AV37Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2187_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit5 = GXt_char1 ;
         GXt_char1 = AV38Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit6 = GXt_char1 ;
         GXt_char1 = AV39Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit7 = GXt_char1 ;
         GXt_char1 = AV40Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit8 = GXt_char1 ;
         GXt_char1 = AV41Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1294_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit9 = GXt_char1 ;
         GXt_char1 = AV42Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN748_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit10 = GXt_char1 ;
         GXt_char1 = AV53Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV53Lit11 = GXt_char1 ;
         GXt_char1 = AV54Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV54Lit12 = GXt_char1 ;
         GXt_char1 = AV55Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGLR095_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV55Lit13 = GXt_char1 ;
         AV55Lit13 = GXutil.substring( AV55Lit13, 1, 6) ;
         GXt_char1 = AV57Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT175_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV57Lit14 = GXt_char1 ;
         AV57Lit14 = GXutil.substring( AV57Lit14, 1, 6) ;
         GXt_char1 = AV56Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV56Lit15 = GXt_char1 ;
         GXt_char1 = AV60Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV60Lit16 = GXt_char1 ;
         GXt_char1 = AV58Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit17 = GXt_char1 ;
         AV59Lit18 = AV60Lit16 + " " + AV58Lit17 ;
         GXt_char1 = AV55Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGLR095_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV55Lit13 = GXt_char1 + " " + httpContext.getMessage( "Pr", "") ;
         GXt_char1 = AV56Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGLR095_", ""), (byte)(99), GXv_char2) ;
         arpr0001r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV56Lit15 = GXt_char1 + " " + httpContext.getMessage( "P.", "") ;
         GXt_int3 = AV70FlagTiReal ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TIREAL", ""), GXv_int4) ;
         arpr0001r_impl.this.GXt_int3 = GXv_int4[0] ;
         AV70FlagTiReal = GXt_int3 ;
         /* Using cursor P074D2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P074D2_A407EmprNom[0] ;
            n407EmprNom = P074D2_n407EmprNom[0] ;
            AV25NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV19Pmaq ,
                                              AV20Umaq ,
                                              Integer.valueOf(AV15Poper) ,
                                              Integer.valueOf(AV16Uoper) ,
                                              A602MaqCod ,
                                              Integer.valueOf(A503GruOpeCod) ,
                                              A396EmprCod ,
                                              A558HisProFec ,
                                              AV17Pfec ,
                                              AV18Ufec ,
                                              A1011TipMaqCod ,
                                              AV72TipMaqCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         /* Using cursor P074D3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV17Pfec, AV18Ufec, AV72TipMaqCod, AV72TipMaqCod, AV19Pmaq, AV20Umaq, Integer.valueOf(AV15Poper), Integer.valueOf(AV16Uoper)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk74D3 = false ;
            A503GruOpeCod = P074D3_A503GruOpeCod[0] ;
            A1011TipMaqCod = P074D3_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P074D3_n1011TipMaqCod[0] ;
            A602MaqCod = P074D3_A602MaqCod[0] ;
            A558HisProFec = P074D3_A558HisProFec[0] ;
            A1525HisProKgr = P074D3_A1525HisProKgr[0] ;
            A1526HisProMtr = P074D3_A1526HisProMtr[0] ;
            A461Fase = P074D3_A461Fase[0] ;
            A3610HisProLot = P074D3_A3610HisProLot[0] ;
            A656ParCod = P074D3_A656ParCod[0] ;
            n656ParCod = P074D3_n656ParCod[0] ;
            A556HisProEst = P074D3_A556HisProEst[0] ;
            A130BarCodPar = P074D3_A130BarCodPar[0] ;
            A132BarCodReo = P074D3_A132BarCodReo[0] ;
            A129BarCod = P074D3_A129BarCod[0] ;
            A561HisProLin = P074D3_A561HisProLin[0] ;
            A4440HisProDTI = P074D3_A4440HisProDTI[0] ;
            n4440HisProDTI = P074D3_n4440HisProDTI[0] ;
            A4441HisProDTF = P074D3_A4441HisProDTF[0] ;
            n4441HisProDTF = P074D3_n4441HisProDTF[0] ;
            A563HisProMin = P074D3_A563HisProMin[0] ;
            A560HisProHin = P074D3_A560HisProHin[0] ;
            A562HisProMfi = P074D3_A562HisProMfi[0] ;
            A559HisProHfi = P074D3_A559HisProHfi[0] ;
            A1011TipMaqCod = P074D3_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P074D3_n1011TipMaqCod[0] ;
            if ( A560HisProHin <= A559HisProHfi )
            {
               A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
            }
            else
            {
               A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
            }
            if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
            {
               A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            }
            else
            {
               A5605HisProTr2 = (short)(0) ;
            }
            AV43FlagImp = (byte)(0) ;
            while ( (pr_default.getStatus(1) != 101) && ( P074D3_A503GruOpeCod[0] == A503GruOpeCod ) )
            {
               brk74D3 = false ;
               A1011TipMaqCod = P074D3_A1011TipMaqCod[0] ;
               n1011TipMaqCod = P074D3_n1011TipMaqCod[0] ;
               A602MaqCod = P074D3_A602MaqCod[0] ;
               A558HisProFec = P074D3_A558HisProFec[0] ;
               A1525HisProKgr = P074D3_A1525HisProKgr[0] ;
               A1526HisProMtr = P074D3_A1526HisProMtr[0] ;
               A461Fase = P074D3_A461Fase[0] ;
               A3610HisProLot = P074D3_A3610HisProLot[0] ;
               A656ParCod = P074D3_A656ParCod[0] ;
               n656ParCod = P074D3_n656ParCod[0] ;
               A556HisProEst = P074D3_A556HisProEst[0] ;
               A130BarCodPar = P074D3_A130BarCodPar[0] ;
               A132BarCodReo = P074D3_A132BarCodReo[0] ;
               A129BarCod = P074D3_A129BarCod[0] ;
               A561HisProLin = P074D3_A561HisProLin[0] ;
               A4440HisProDTI = P074D3_A4440HisProDTI[0] ;
               n4440HisProDTI = P074D3_n4440HisProDTI[0] ;
               A4441HisProDTF = P074D3_A4441HisProDTF[0] ;
               n4441HisProDTF = P074D3_n4441HisProDTF[0] ;
               A563HisProMin = P074D3_A563HisProMin[0] ;
               A560HisProHin = P074D3_A560HisProHin[0] ;
               A562HisProMfi = P074D3_A562HisProMfi[0] ;
               A559HisProHfi = P074D3_A559HisProHfi[0] ;
               A1011TipMaqCod = P074D3_A1011TipMaqCod[0] ;
               n1011TipMaqCod = P074D3_n1011TipMaqCod[0] ;
               if ( (( GXutil.resetTime(A558HisProFec).before( GXutil.resetTime( AV18Ufec )) ) || ( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(AV18Ufec)) )) )
               {
                  if ( (( GXutil.resetTime(A558HisProFec).after( GXutil.resetTime( AV17Pfec )) ) || ( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(AV17Pfec)) )) )
                  {
                     if ( GXutil.strcmp(P074D3_A396EmprCod[0], A396EmprCod) == 0 )
                     {
                        if ( (GXutil.strcmp("", AV72TipMaqCod)==0) || ( ( GXutil.strcmp(A1011TipMaqCod, AV72TipMaqCod) == 0 ) || (GXutil.strcmp("", AV72TipMaqCod)==0) ) )
                        {
                           if ( ( GXutil.strcmp(A602MaqCod, AV19Pmaq) >= 0 ) && ( GXutil.strcmp(A602MaqCod, AV20Umaq) <= 0 ) )
                           {
                              if ( A560HisProHin <= A559HisProHfi )
                              {
                                 A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                              }
                              else
                              {
                                 A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                              }
                              if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                              {
                                 A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                              }
                              else
                              {
                                 A5605HisProTr2 = (short)(0) ;
                              }
                              AV44TotKgs = AV44TotKgs.add(A1525HisProKgr) ;
                              AV45TotMts = AV45TotMts.add(A1526HisProMtr) ;
                              GXt_char1 = AV61FasActTin ;
                              GXv_char2[0] = A396EmprCod ;
                              GXv_char5[0] = A461Fase ;
                              GXv_char6[0] = GXt_char1 ;
                              new app.pfasest(remoteHandle, context).execute( GXv_char2, GXv_char5, GXv_char6) ;
                              arpr0001r_impl.this.A396EmprCod = GXv_char2[0] ;
                              arpr0001r_impl.this.A461Fase = GXv_char5[0] ;
                              arpr0001r_impl.this.GXt_char1 = GXv_char6[0] ;
                              AV61FasActTin = GXt_char1 ;
                              AV62FlagMarca = (byte)(0) ;
                              AV63Hisprolot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                              if ( GXutil.strcmp(A3610HisProLot, AV63Hisprolot) == 0 )
                              {
                                 AV62FlagMarca = (byte)(1) ;
                              }
                              if ( GXutil.strcmp(AV61FasActTin, httpContext.getMessage( "N", "")) == 0 )
                              {
                                 AV62FlagMarca = (byte)(1) ;
                              }
                              if ( AV70FlagTiReal == 0 )
                              {
                                 AV71HisProTr2 = A564HisProTre ;
                              }
                              else
                              {
                                 AV71HisProTr2 = A5605HisProTr2 ;
                              }
                              if ( (0==A656ParCod) )
                              {
                                 if ( ! (0==A556HisProEst) )
                                 {
                                    if ( AV62FlagMarca == 1 )
                                    {
                                       AV46TotRea = (int)(AV46TotRea+AV71HisProTr2) ;
                                    }
                                 }
                              }
                              else
                              {
                                 if ( ! (0==A556HisProEst) )
                                 {
                                    if ( AV62FlagMarca == 1 )
                                    {
                                       AV47TotPar = (int)(AV47TotPar+AV71HisProTr2) ;
                                    }
                                 }
                              }
                              AV43FlagImp = (byte)(1) ;
                           }
                        }
                     }
                  }
               }
               brk74D3 = true ;
               pr_default.readNext(1);
            }
            /* Using cursor P074D4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A652OpeCod = P074D4_A652OpeCod[0] ;
               A653OpeNom = P074D4_A653OpeNom[0] ;
               n653OpeNom = P074D4_n653OpeNom[0] ;
               AV30OpeNom = A653OpeNom ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            AV65HorReaint = (short)(GXutil.Int( AV46TotRea/ (double) (60))) ;
            AV66MinRea = (byte)(AV46TotRea-(AV65HorReaint*60)) ;
            AV48vHorMin = GXutil.str( AV65HorReaint, 4, 0) + ":" + GXutil.str( AV66MinRea, 2, 0) ;
            AV68HorParint = (short)(GXutil.Int( AV47TotPar/ (double) (60))) ;
            AV69MinPar = (byte)(AV47TotPar-(AV68HorParint*60)) ;
            AV49vHorMinP = GXutil.str( AV68HorParint, 4, 0) + ":" + GXutil.str( AV69MinPar, 2, 0) ;
            h74D0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9")), 18, Gx_line+0, 63, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30OpeNom, "")), 69, Gx_line+0, 289, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44TotKgs, "ZZZZZ9.99")), 481, Gx_line+0, 548, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45TotMts, "ZZZZZ9.99")), 410, Gx_line+0, 477, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("(", 663, Gx_line+0, 668, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(")", 722, Gx_line+0, 727, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48vHorMin, "")), 581, Gx_line+0, 633, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49vHorMinP, "")), 668, Gx_line+0, 720, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV44TotKgs = DecimalUtil.doubleToDec(0) ;
            AV45TotMts = DecimalUtil.doubleToDec(0) ;
            AV47TotPar = 0 ;
            AV46TotRea = 0 ;
            if ( ! brk74D3 )
            {
               brk74D3 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h74D0( true, 0) ;
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

   public void h74D0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25NomEmp, "")), 15, Gx_line+17, 266, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 509, Gx_line+21, 560, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 641, Gx_line+21, 734, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 666, Gx_line+55, 711, Gx_line+72, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV17Pfec, "99/99/99"), 84, Gx_line+83, 143, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV18Ufec, "99/99/99"), 231, Gx_line+83, 290, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+9, 751, Gx_line+9, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+75, 751, Gx_line+75, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit0, "")), 15, Gx_line+51, 494, Gx_line+70, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit1, "")), 441, Gx_line+21, 502, Gx_line+37, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit2, "")), 586, Gx_line+21, 637, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit3, "")), 586, Gx_line+55, 662, Gx_line+72, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit4, "")), 18, Gx_line+83, 82, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit5, "")), 163, Gx_line+83, 227, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Pgmname, "")), 509, Gx_line+52, 729, Gx_line+69, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+105, 751, Gx_line+105, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit11, "")), 430, Gx_line+116, 475, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit12, "")), 502, Gx_line+116, 547, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit17, "")), 18, Gx_line+116, 86, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(18, Gx_line+134, 289, Gx_line+134, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(410, Gx_line+134, 476, Gx_line+134, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(481, Gx_line+134, 547, Gx_line+134, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(571, Gx_line+134, 644, Gx_line+134, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(657, Gx_line+134, 730, Gx_line+134, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit13, "")), 571, Gx_line+115, 645, Gx_line+133, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit15, "")), 657, Gx_line+115, 731, Gx_line+133, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+139) ;
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
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
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
      AV17Pfec = GXutil.nullDate() ;
      AV19Pmaq = "" ;
      AV18Ufec = GXutil.nullDate() ;
      AV20Umaq = "" ;
      AV72TipMaqCod = "" ;
      AV50Lit01 = "" ;
      AV51Lit02 = "" ;
      AV27Lit0 = "" ;
      AV75Pgmname = "" ;
      AV28Lit1 = "" ;
      AV52Lit2 = "" ;
      AV29Lit3 = "" ;
      AV36Lit4 = "" ;
      AV37Lit5 = "" ;
      AV38Lit6 = "" ;
      AV39Lit7 = "" ;
      AV40Lit8 = "" ;
      AV41Lit9 = "" ;
      AV42Lit10 = "" ;
      AV53Lit11 = "" ;
      AV54Lit12 = "" ;
      AV55Lit13 = "" ;
      AV57Lit14 = "" ;
      AV56Lit15 = "" ;
      AV60Lit16 = "" ;
      AV58Lit17 = "" ;
      AV59Lit18 = "" ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P074D2_A396EmprCod = new String[] {""} ;
      P074D2_A407EmprNom = new String[] {""} ;
      P074D2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV25NomEmp = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A1011TipMaqCod = "" ;
      P074D3_A396EmprCod = new String[] {""} ;
      P074D3_A503GruOpeCod = new int[1] ;
      P074D3_A1011TipMaqCod = new String[] {""} ;
      P074D3_n1011TipMaqCod = new boolean[] {false} ;
      P074D3_A602MaqCod = new String[] {""} ;
      P074D3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P074D3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P074D3_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P074D3_A461Fase = new String[] {""} ;
      P074D3_A3610HisProLot = new String[] {""} ;
      P074D3_A656ParCod = new short[1] ;
      P074D3_n656ParCod = new boolean[] {false} ;
      P074D3_A556HisProEst = new byte[1] ;
      P074D3_A130BarCodPar = new String[] {""} ;
      P074D3_A132BarCodReo = new byte[1] ;
      P074D3_A129BarCod = new int[1] ;
      P074D3_A561HisProLin = new int[1] ;
      P074D3_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P074D3_n4440HisProDTI = new boolean[] {false} ;
      P074D3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P074D3_n4441HisProDTF = new boolean[] {false} ;
      P074D3_A563HisProMin = new byte[1] ;
      P074D3_A560HisProHin = new byte[1] ;
      P074D3_A562HisProMfi = new byte[1] ;
      P074D3_A559HisProHfi = new byte[1] ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A461Fase = "" ;
      A3610HisProLot = "" ;
      A130BarCodPar = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV44TotKgs = DecimalUtil.ZERO ;
      AV45TotMts = DecimalUtil.ZERO ;
      AV61FasActTin = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      AV63Hisprolot = "" ;
      P074D4_A396EmprCod = new String[] {""} ;
      P074D4_A652OpeCod = new int[1] ;
      P074D4_A653OpeNom = new String[] {""} ;
      P074D4_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      AV30OpeNom = "" ;
      AV48vHorMin = "" ;
      AV49vHorMinP = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.arpr0001r__default(),
         new Object[] {
             new Object[] {
            P074D2_A396EmprCod, P074D2_A407EmprNom, P074D2_n407EmprNom
            }
            , new Object[] {
            P074D3_A396EmprCod, P074D3_A503GruOpeCod, P074D3_A1011TipMaqCod, P074D3_n1011TipMaqCod, P074D3_A602MaqCod, P074D3_A558HisProFec, P074D3_A1525HisProKgr, P074D3_A1526HisProMtr, P074D3_A461Fase, P074D3_A3610HisProLot,
            P074D3_A656ParCod, P074D3_n656ParCod, P074D3_A556HisProEst, P074D3_A130BarCodPar, P074D3_A132BarCodReo, P074D3_A129BarCod, P074D3_A561HisProLin, P074D3_A4440HisProDTI, P074D3_n4440HisProDTI, P074D3_A4441HisProDTF,
            P074D3_n4441HisProDTF, P074D3_A563HisProMin, P074D3_A560HisProHin, P074D3_A562HisProMfi, P074D3_A559HisProHfi
            }
            , new Object[] {
            P074D4_A396EmprCod, P074D4_A652OpeCod, P074D4_A653OpeNom, P074D4_n653OpeNom
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV75Pgmname = "ARPR0001r" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV75Pgmname = "ARPR0001r" ;
      Gx_err = (short)(0) ;
   }

   private byte AV70FlagTiReal ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte A556HisProEst ;
   private byte A132BarCodReo ;
   private byte A563HisProMin ;
   private byte A560HisProHin ;
   private byte A562HisProMfi ;
   private byte A559HisProHfi ;
   private byte AV43FlagImp ;
   private byte AV62FlagMarca ;
   private byte AV66MinRea ;
   private byte AV69MinPar ;
   private short gxcookieaux ;
   private short A656ParCod ;
   private short A564HisProTre ;
   private short A5605HisProTr2 ;
   private short AV71HisProTr2 ;
   private short AV65HorReaint ;
   private short AV68HorParint ;
   private short Gx_err ;
   private int AV15Poper ;
   private int AV16Uoper ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A503GruOpeCod ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private int AV46TotRea ;
   private int AV47TotPar ;
   private int A652OpeCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV44TotKgs ;
   private java.math.BigDecimal AV45TotMts ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV19Pmaq ;
   private String AV20Umaq ;
   private String AV72TipMaqCod ;
   private String AV50Lit01 ;
   private String AV51Lit02 ;
   private String AV27Lit0 ;
   private String AV75Pgmname ;
   private String AV28Lit1 ;
   private String AV52Lit2 ;
   private String AV29Lit3 ;
   private String AV36Lit4 ;
   private String AV37Lit5 ;
   private String AV38Lit6 ;
   private String AV39Lit7 ;
   private String AV40Lit8 ;
   private String AV41Lit9 ;
   private String AV42Lit10 ;
   private String AV53Lit11 ;
   private String AV54Lit12 ;
   private String AV55Lit13 ;
   private String AV57Lit14 ;
   private String AV56Lit15 ;
   private String AV60Lit16 ;
   private String AV58Lit17 ;
   private String AV59Lit18 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV25NomEmp ;
   private String A602MaqCod ;
   private String A1011TipMaqCod ;
   private String A461Fase ;
   private String A3610HisProLot ;
   private String A130BarCodPar ;
   private String AV61FasActTin ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String AV63Hisprolot ;
   private String A653OpeNom ;
   private String AV30OpeNom ;
   private String AV48vHorMin ;
   private String AV49vHorMinP ;
   private String Gx_time ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV17Pfec ;
   private java.util.Date AV18Ufec ;
   private java.util.Date A558HisProFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean brk74D3 ;
   private boolean n1011TipMaqCod ;
   private boolean n656ParCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n653OpeNom ;
   private IDataStoreProvider pr_default ;
   private String[] P074D2_A396EmprCod ;
   private String[] P074D2_A407EmprNom ;
   private boolean[] P074D2_n407EmprNom ;
   private String[] P074D3_A396EmprCod ;
   private int[] P074D3_A503GruOpeCod ;
   private String[] P074D3_A1011TipMaqCod ;
   private boolean[] P074D3_n1011TipMaqCod ;
   private String[] P074D3_A602MaqCod ;
   private java.util.Date[] P074D3_A558HisProFec ;
   private java.math.BigDecimal[] P074D3_A1525HisProKgr ;
   private java.math.BigDecimal[] P074D3_A1526HisProMtr ;
   private String[] P074D3_A461Fase ;
   private String[] P074D3_A3610HisProLot ;
   private short[] P074D3_A656ParCod ;
   private boolean[] P074D3_n656ParCod ;
   private byte[] P074D3_A556HisProEst ;
   private String[] P074D3_A130BarCodPar ;
   private byte[] P074D3_A132BarCodReo ;
   private int[] P074D3_A129BarCod ;
   private int[] P074D3_A561HisProLin ;
   private java.util.Date[] P074D3_A4440HisProDTI ;
   private boolean[] P074D3_n4440HisProDTI ;
   private java.util.Date[] P074D3_A4441HisProDTF ;
   private boolean[] P074D3_n4441HisProDTF ;
   private byte[] P074D3_A563HisProMin ;
   private byte[] P074D3_A560HisProHin ;
   private byte[] P074D3_A562HisProMfi ;
   private byte[] P074D3_A559HisProHfi ;
   private String[] P074D4_A396EmprCod ;
   private int[] P074D4_A652OpeCod ;
   private String[] P074D4_A653OpeNom ;
   private boolean[] P074D4_n653OpeNom ;
}

final  class arpr0001r__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P074D3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV19Pmaq ,
                                          String AV20Umaq ,
                                          int AV15Poper ,
                                          int AV16Uoper ,
                                          String A602MaqCod ,
                                          int A503GruOpeCod ,
                                          String A396EmprCod ,
                                          java.util.Date A558HisProFec ,
                                          java.util.Date AV17Pfec ,
                                          java.util.Date AV18Ufec ,
                                          String A1011TipMaqCod ,
                                          String AV72TipMaqCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[9];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.GruOpeCod, T2.TipMaqCod, T1.MaqCod, T1.HisProFec, T1.HisProKgr, T1.HisProMtr, T1.Fase, T1.HisProLot, T1.ParCod, T1.HisProEst, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.HisProLin, T1.HisProDTI, T1.HisProDTF, T1.HisProMin, T1.HisProHin, T1.HisProMfi, T1.HisProHfi FROM (TXPLHIPRO T1 INNER JOIN TXPMAQUIN" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.HisProFec >= ? and T1.HisProFec <= ?)");
      addWhere(sWhereString, "(T2.TipMaqCod = ? or (rtrim(?) IS NULL))");
      if ( ! (GXutil.strcmp("", AV19Pmaq)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV20Umaq)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int7[6] = (byte)(1) ;
      }
      if ( ! (0==AV15Poper) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      if ( ! (0==AV16Uoper) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int7[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.GruOpeCod, T1.HisProFec, T1.HisProLin, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
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
                  return conditional_P074D3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P074D2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P074D3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P074D4", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((String[]) buf[9])[0] = rslt.getString(9, 10);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(17);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(18);
               ((byte[]) buf[22])[0] = rslt.getByte(19);
               ((byte[]) buf[23])[0] = rslt.getByte(20);
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 4);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

