package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plicrnd extends GXProcedure
{
   public plicrnd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plicrnd.class ), "" );
   }

   public plicrnd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 )
   {
      plicrnd.this.aP1 = new byte[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 )
   {
      plicrnd.this.AV21RlrPgm = aP0[0];
      this.aP0 = aP0;
      plicrnd.this.AV8Error = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      plicrnd.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      GXv_char2[0] = AV18EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      plicrnd.this.AV18EmprCod = GXv_char2[0] ;
      plicrnd.this.AV19EmprNom = GXv_char3[0] ;
      plicrnd.this.AV20UsurCod = GXv_char4[0] ;
      GXt_int5 = AV25NewLicRnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV18EmprCod, httpContext.getMessage( "LICRDN", ""), GXv_int6) ;
      plicrnd.this.GXt_int5 = GXv_int6[0] ;
      AV25NewLicRnd = GXt_int5 ;
      if ( AV25NewLicRnd == 0 )
      {
         GXv_char4[0] = AV21RlrPgm ;
         GXv_int6[0] = AV8Error ;
         new app.pnewlicrnd(remoteHandle, context).execute( GXv_char4, GXv_int6) ;
         plicrnd.this.AV21RlrPgm = GXv_char4[0] ;
         plicrnd.this.AV8Error = GXv_int6[0] ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV8Error = (byte)(1) ;
      AV16LicPrdId = httpContext.getMessage( "EN01", "") ;
      /* Using cursor P03FS2 */
      pr_default.execute(0, new Object[] {AV16LicPrdId});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4103LicPrdId = P03FS2_A4103LicPrdId[0] ;
         A4104LicPrdDat = P03FS2_A4104LicPrdDat[0] ;
         GXv_char4[0] = A4104LicPrdDat ;
         new app.plic2par(remoteHandle, context).execute( AV14LicPar, GXv_char4) ;
         plicrnd.this.A4104LicPrdDat = GXv_char4[0] ;
         AV8Error = (byte)(0) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV8Error == 1 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV9fecha = GXutil.serverDate( context, remoteHandle, pr_default) ;
      if ( (( GXutil.resetTime(AV9fecha).after( GXutil.resetTime( localUtil.ctod( AV14LicPar[2-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV9fecha), GXutil.resetTime(localUtil.ctod( AV14LicPar[2-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))))) )) && ( ( GXutil.strcmp(AV21RlrPgm, httpContext.getMessage( "UMENUS", "")) != 0 ) && ( GXutil.strcmp(AV21RlrPgm, httpContext.getMessage( "UMENUGRA", "")) != 0 ) ) )
      {
         if ( (( GXutil.resetTime(AV9fecha).after( GXutil.resetTime( localUtil.ctod( AV14LicPar[3-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV9fecha), GXutil.resetTime(localUtil.ctod( AV14LicPar[3-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))))) )) )
         {
            AV8Error = (byte)(1) ;
            AV22Station = context.getWorkstationId( remoteHandle) ;
            /* Using cursor P03FS3 */
            pr_default.execute(1, new Object[] {AV22Station});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A396EmprCod = P03FS3_A396EmprCod[0] ;
               n396EmprCod = P03FS3_n396EmprCod[0] ;
               A942TermCod = P03FS3_A942TermCod[0] ;
               A1189TermUsu = P03FS3_A1189TermUsu[0] ;
               n1189TermUsu = P03FS3_n1189TermUsu[0] ;
               A407EmprNom = P03FS3_A407EmprNom[0] ;
               n407EmprNom = P03FS3_n407EmprNom[0] ;
               A407EmprNom = P03FS3_A407EmprNom[0] ;
               n407EmprNom = P03FS3_n407EmprNom[0] ;
               AV20UsurCod = A1189TermUsu ;
               AV19EmprNom = A407EmprNom ;
               AV20UsurCod = A1189TermUsu ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            /*
               INSERT RECORD ON TABLE TXPRLICRN

            */
            A8714RlrFch = GXutil.serverNow( context, remoteHandle, pr_default) ;
            A8715RlrUsu = AV20UsurCod ;
            A8716RlrFchA = localUtil.ctod( AV14LicPar[2-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n8716RlrFchA = false ;
            A8717RlrFchE = localUtil.ctod( AV14LicPar[3-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n8717RlrFchE = false ;
            A8718RlrPgm = AV21RlrPgm ;
            n8718RlrPgm = false ;
            A8719RlrTrCod = AV22Station ;
            n8719RlrTrCod = false ;
            A8720RlrDia = (short)(-1) ;
            n8720RlrDia = false ;
            A8721RlrDiaDif = (short)(-1) ;
            n8721RlrDiaDif = false ;
            A8722RlrRnd = (short)(-1) ;
            n8722RlrRnd = false ;
            /* Using cursor P03FS4 */
            pr_default.execute(2, new Object[] {A8714RlrFch, A8715RlrUsu, Boolean.valueOf(n8716RlrFchA), A8716RlrFchA, Boolean.valueOf(n8717RlrFchE), A8717RlrFchE, Boolean.valueOf(n8718RlrPgm), A8718RlrPgm, Boolean.valueOf(n8719RlrTrCod), A8719RlrTrCod, Boolean.valueOf(n8720RlrDia), Short.valueOf(A8720RlrDia), Boolean.valueOf(n8721RlrDiaDif), Short.valueOf(A8721RlrDiaDif), Boolean.valueOf(n8722RlrRnd), Short.valueOf(A8722RlrRnd)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRLICRN");
            if ( (pr_default.getStatus(2) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
         else
         {
            AV10fechaA = localUtil.ctot( AV14LicPar[2-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV11fechaC = localUtil.ctot( AV14LicPar[3-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV13diaDif = (short)(GXutil.Int( GXutil.dtdiff( AV11fechaC, AV10fechaA)/ (double) (60)/ (double) (60)/ (double) (24))) ;
            AV12dia = (byte)(GXutil.Int( GXutil.dtdiff( localUtil.ctot( localUtil.dtoc( AV9fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), AV10fechaA)/ (double) (60)/ (double) (60)/ (double) (24))) ;
            AV15rnd = (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.random( )*AV13diaDif), 0))) ;
            if ( AV15rnd < AV12dia )
            {
               AV8Error = (byte)(1) ;
               AV22Station = context.getWorkstationId( remoteHandle) ;
               /* Using cursor P03FS5 */
               pr_default.execute(3, new Object[] {AV22Station});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A396EmprCod = P03FS5_A396EmprCod[0] ;
                  n396EmprCod = P03FS5_n396EmprCod[0] ;
                  A942TermCod = P03FS5_A942TermCod[0] ;
                  A1189TermUsu = P03FS5_A1189TermUsu[0] ;
                  n1189TermUsu = P03FS5_n1189TermUsu[0] ;
                  A407EmprNom = P03FS5_A407EmprNom[0] ;
                  n407EmprNom = P03FS5_n407EmprNom[0] ;
                  A407EmprNom = P03FS5_A407EmprNom[0] ;
                  n407EmprNom = P03FS5_n407EmprNom[0] ;
                  AV20UsurCod = A1189TermUsu ;
                  AV19EmprNom = A407EmprNom ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(3);
               /*
                  INSERT RECORD ON TABLE TXPRLICRN

               */
               A8714RlrFch = GXutil.serverNow( context, remoteHandle, pr_default) ;
               A8715RlrUsu = AV20UsurCod ;
               A8716RlrFchA = localUtil.ctod( AV14LicPar[2-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n8716RlrFchA = false ;
               A8717RlrFchE = localUtil.ctod( AV14LicPar[3-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n8717RlrFchE = false ;
               A8718RlrPgm = AV21RlrPgm ;
               n8718RlrPgm = false ;
               A8719RlrTrCod = AV22Station ;
               n8719RlrTrCod = false ;
               A8720RlrDia = AV12dia ;
               n8720RlrDia = false ;
               A8721RlrDiaDif = AV13diaDif ;
               n8721RlrDiaDif = false ;
               A8722RlrRnd = (short)(AV15rnd) ;
               n8722RlrRnd = false ;
               /* Using cursor P03FS6 */
               pr_default.execute(4, new Object[] {A8714RlrFch, A8715RlrUsu, Boolean.valueOf(n8716RlrFchA), A8716RlrFchA, Boolean.valueOf(n8717RlrFchE), A8717RlrFchE, Boolean.valueOf(n8718RlrPgm), A8718RlrPgm, Boolean.valueOf(n8719RlrTrCod), A8719RlrTrCod, Boolean.valueOf(n8720RlrDia), Short.valueOf(A8720RlrDia), Boolean.valueOf(n8721RlrDiaDif), Short.valueOf(A8721RlrDiaDif), Boolean.valueOf(n8722RlrRnd), Short.valueOf(A8722RlrRnd)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRLICRN");
               if ( (pr_default.getStatus(4) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               /* End Insert */
            }
            else
            {
               AV8Error = (byte)(0) ;
            }
         }
      }
      AV10fechaA = localUtil.ctot( AV14LicPar[2-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV11fechaC = localUtil.ctot( AV14LicPar[3-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV12dia = (byte)(GXutil.Int( GXutil.dtdiff( localUtil.ctot( localUtil.dtoc( AV9fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), AV10fechaA)/ (double) (60)/ (double) (60)/ (double) (24))) ;
      AV15rnd = (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.random( )*AV13diaDif), 0))) ;
      if ( ( AV8Error == 0 ) && ( ( GXutil.strcmp(AV21RlrPgm, httpContext.getMessage( "UMENUS", "")) == 0 ) || ( GXutil.strcmp(AV21RlrPgm, httpContext.getMessage( "UMENUGRA", "")) == 0 ) ) )
      {
         /* Using cursor P03FS7 */
         pr_default.execute(5);
         while ( (pr_default.getStatus(5) != 101) )
         {
            A8722RlrRnd = P03FS7_A8722RlrRnd[0] ;
            n8722RlrRnd = P03FS7_n8722RlrRnd[0] ;
            A8721RlrDiaDif = P03FS7_A8721RlrDiaDif[0] ;
            n8721RlrDiaDif = P03FS7_n8721RlrDiaDif[0] ;
            A8720RlrDia = P03FS7_A8720RlrDia[0] ;
            n8720RlrDia = P03FS7_n8720RlrDia[0] ;
            A8719RlrTrCod = P03FS7_A8719RlrTrCod[0] ;
            n8719RlrTrCod = P03FS7_n8719RlrTrCod[0] ;
            A8718RlrPgm = P03FS7_A8718RlrPgm[0] ;
            n8718RlrPgm = P03FS7_n8718RlrPgm[0] ;
            A8717RlrFchE = P03FS7_A8717RlrFchE[0] ;
            n8717RlrFchE = P03FS7_n8717RlrFchE[0] ;
            A8716RlrFchA = P03FS7_A8716RlrFchA[0] ;
            n8716RlrFchA = P03FS7_n8716RlrFchA[0] ;
            A8715RlrUsu = P03FS7_A8715RlrUsu[0] ;
            A8714RlrFch = P03FS7_A8714RlrFch[0] ;
            A12848RlrFchE1 = P03FS7_A12848RlrFchE1[0] ;
            n12848RlrFchE1 = P03FS7_n12848RlrFchE1[0] ;
            A12847RlrFchA1 = P03FS7_A12847RlrFchA1[0] ;
            n12847RlrFchA1 = P03FS7_n12847RlrFchA1[0] ;
            A12846Clave2 = P03FS7_A12846Clave2[0] ;
            n12846Clave2 = P03FS7_n12846Clave2[0] ;
            A12845Clave1 = P03FS7_A12845Clave1[0] ;
            n12845Clave1 = P03FS7_n12845Clave1[0] ;
            if ( GXutil.dateCompare(GXutil.resetTime(A8717RlrFchE), GXutil.resetTime(localUtil.ctod( AV14LicPar[3-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))))) && (( localUtil.ctot( localUtil.dtoc( A8717RlrFchE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))).before( A8714RlrFch ) ) || ( GXutil.dateCompare(localUtil.ctot( localUtil.dtoc( A8717RlrFchE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), A8714RlrFch) )) )
            {
               AV8Error = (byte)(1) ;
               AV22Station = context.getWorkstationId( remoteHandle) ;
               /* Using cursor P03FS8 */
               pr_default.execute(6, new Object[] {AV22Station});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A396EmprCod = P03FS8_A396EmprCod[0] ;
                  n396EmprCod = P03FS8_n396EmprCod[0] ;
                  A942TermCod = P03FS8_A942TermCod[0] ;
                  A1189TermUsu = P03FS8_A1189TermUsu[0] ;
                  n1189TermUsu = P03FS8_n1189TermUsu[0] ;
                  A407EmprNom = P03FS8_A407EmprNom[0] ;
                  n407EmprNom = P03FS8_n407EmprNom[0] ;
                  A407EmprNom = P03FS8_A407EmprNom[0] ;
                  n407EmprNom = P03FS8_n407EmprNom[0] ;
                  AV20UsurCod = A1189TermUsu ;
                  AV19EmprNom = A407EmprNom ;
                  AV20UsurCod = A1189TermUsu ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(6);
               /*
                  INSERT RECORD ON TABLE TXPRLICRN

               */
               W8714RlrFch = A8714RlrFch ;
               W8715RlrUsu = A8715RlrUsu ;
               W8716RlrFchA = A8716RlrFchA ;
               n8716RlrFchA = false ;
               W8717RlrFchE = A8717RlrFchE ;
               n8717RlrFchE = false ;
               W8718RlrPgm = A8718RlrPgm ;
               n8718RlrPgm = false ;
               W8719RlrTrCod = A8719RlrTrCod ;
               n8719RlrTrCod = false ;
               W8720RlrDia = A8720RlrDia ;
               n8720RlrDia = false ;
               W8721RlrDiaDif = A8721RlrDiaDif ;
               n8721RlrDiaDif = false ;
               W8722RlrRnd = A8722RlrRnd ;
               n8722RlrRnd = false ;
               A8714RlrFch = GXutil.serverNow( context, remoteHandle, pr_default) ;
               A8715RlrUsu = AV20UsurCod ;
               A8716RlrFchA = localUtil.ctod( AV14LicPar[2-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n8716RlrFchA = false ;
               A8717RlrFchE = localUtil.ctod( AV14LicPar[3-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n8717RlrFchE = false ;
               A8718RlrPgm = AV21RlrPgm ;
               n8718RlrPgm = false ;
               A8719RlrTrCod = AV22Station ;
               n8719RlrTrCod = false ;
               A8720RlrDia = AV12dia ;
               n8720RlrDia = false ;
               A8721RlrDiaDif = AV13diaDif ;
               n8721RlrDiaDif = false ;
               A8722RlrRnd = (short)(-2) ;
               n8722RlrRnd = false ;
               /* Using cursor P03FS9 */
               pr_default.execute(7, new Object[] {A8714RlrFch, A8715RlrUsu, Boolean.valueOf(n8716RlrFchA), A8716RlrFchA, Boolean.valueOf(n8717RlrFchE), A8717RlrFchE, Boolean.valueOf(n8718RlrPgm), A8718RlrPgm, Boolean.valueOf(n8719RlrTrCod), A8719RlrTrCod, Boolean.valueOf(n8720RlrDia), Short.valueOf(A8720RlrDia), Boolean.valueOf(n8721RlrDiaDif), Short.valueOf(A8721RlrDiaDif), Boolean.valueOf(n8722RlrRnd), Short.valueOf(A8722RlrRnd), Boolean.valueOf(n12845Clave1), A12845Clave1, Boolean.valueOf(n12846Clave2), A12846Clave2, Boolean.valueOf(n12847RlrFchA1), A12847RlrFchA1, Boolean.valueOf(n12848RlrFchE1), A12848RlrFchE1});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRLICRN");
               if ( (pr_default.getStatus(7) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A8714RlrFch = W8714RlrFch ;
               A8715RlrUsu = W8715RlrUsu ;
               A8716RlrFchA = W8716RlrFchA ;
               n8716RlrFchA = false ;
               A8717RlrFchE = W8717RlrFchE ;
               n8717RlrFchE = false ;
               A8718RlrPgm = W8718RlrPgm ;
               n8718RlrPgm = false ;
               A8719RlrTrCod = W8719RlrTrCod ;
               n8719RlrTrCod = false ;
               A8720RlrDia = W8720RlrDia ;
               n8720RlrDia = false ;
               A8721RlrDiaDif = W8721RlrDiaDif ;
               n8721RlrDiaDif = false ;
               A8722RlrRnd = W8722RlrRnd ;
               n8722RlrRnd = false ;
               /* End Insert */
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(5);
         }
         pr_default.close(5);
         if ( AV8Error == 0 )
         {
            /* Using cursor P03FS10 */
            pr_default.execute(8, new Object[] {AV9fecha});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A8722RlrRnd = P03FS10_A8722RlrRnd[0] ;
               n8722RlrRnd = P03FS10_n8722RlrRnd[0] ;
               A8721RlrDiaDif = P03FS10_A8721RlrDiaDif[0] ;
               n8721RlrDiaDif = P03FS10_n8721RlrDiaDif[0] ;
               A8720RlrDia = P03FS10_A8720RlrDia[0] ;
               n8720RlrDia = P03FS10_n8720RlrDia[0] ;
               A8719RlrTrCod = P03FS10_A8719RlrTrCod[0] ;
               n8719RlrTrCod = P03FS10_n8719RlrTrCod[0] ;
               A8718RlrPgm = P03FS10_A8718RlrPgm[0] ;
               n8718RlrPgm = P03FS10_n8718RlrPgm[0] ;
               A8717RlrFchE = P03FS10_A8717RlrFchE[0] ;
               n8717RlrFchE = P03FS10_n8717RlrFchE[0] ;
               A8716RlrFchA = P03FS10_A8716RlrFchA[0] ;
               n8716RlrFchA = P03FS10_n8716RlrFchA[0] ;
               A8715RlrUsu = P03FS10_A8715RlrUsu[0] ;
               A8714RlrFch = P03FS10_A8714RlrFch[0] ;
               A12848RlrFchE1 = P03FS10_A12848RlrFchE1[0] ;
               n12848RlrFchE1 = P03FS10_n12848RlrFchE1[0] ;
               A12847RlrFchA1 = P03FS10_A12847RlrFchA1[0] ;
               n12847RlrFchA1 = P03FS10_n12847RlrFchA1[0] ;
               A12846Clave2 = P03FS10_A12846Clave2[0] ;
               n12846Clave2 = P03FS10_n12846Clave2[0] ;
               A12845Clave1 = P03FS10_A12845Clave1[0] ;
               n12845Clave1 = P03FS10_n12845Clave1[0] ;
               if ( GXutil.dateCompare(GXutil.resetTime(A8716RlrFchA), GXutil.resetTime(localUtil.ctod( AV14LicPar[2-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))))) )
               {
                  if ( (( localUtil.ctot( localUtil.dtoc( A8716RlrFchA, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))).before( A8714RlrFch ) ) || ( GXutil.dateCompare(localUtil.ctot( localUtil.dtoc( A8716RlrFchA, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), A8714RlrFch) )) )
                  {
                     if ( A8714RlrFch.before( localUtil.ctot( localUtil.dtoc( A8717RlrFchE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ) )
                     {
                        AV8Error = (byte)(1) ;
                        AV22Station = context.getWorkstationId( remoteHandle) ;
                        /* Using cursor P03FS11 */
                        pr_default.execute(9, new Object[] {AV22Station});
                        while ( (pr_default.getStatus(9) != 101) )
                        {
                           A396EmprCod = P03FS11_A396EmprCod[0] ;
                           n396EmprCod = P03FS11_n396EmprCod[0] ;
                           A942TermCod = P03FS11_A942TermCod[0] ;
                           A1189TermUsu = P03FS11_A1189TermUsu[0] ;
                           n1189TermUsu = P03FS11_n1189TermUsu[0] ;
                           A407EmprNom = P03FS11_A407EmprNom[0] ;
                           n407EmprNom = P03FS11_n407EmprNom[0] ;
                           A407EmprNom = P03FS11_A407EmprNom[0] ;
                           n407EmprNom = P03FS11_n407EmprNom[0] ;
                           AV20UsurCod = A1189TermUsu ;
                           AV19EmprNom = A407EmprNom ;
                           AV20UsurCod = A1189TermUsu ;
                           /* Exiting from a For First loop. */
                           if (true) break;
                        }
                        pr_default.close(9);
                        /*
                           INSERT RECORD ON TABLE TXPRLICRN

                        */
                        W8714RlrFch = A8714RlrFch ;
                        W8715RlrUsu = A8715RlrUsu ;
                        W8716RlrFchA = A8716RlrFchA ;
                        n8716RlrFchA = false ;
                        W8717RlrFchE = A8717RlrFchE ;
                        n8717RlrFchE = false ;
                        W8718RlrPgm = A8718RlrPgm ;
                        n8718RlrPgm = false ;
                        W8719RlrTrCod = A8719RlrTrCod ;
                        n8719RlrTrCod = false ;
                        W8720RlrDia = A8720RlrDia ;
                        n8720RlrDia = false ;
                        W8721RlrDiaDif = A8721RlrDiaDif ;
                        n8721RlrDiaDif = false ;
                        W8722RlrRnd = A8722RlrRnd ;
                        n8722RlrRnd = false ;
                        A8714RlrFch = GXutil.serverNow( context, remoteHandle, pr_default) ;
                        A8715RlrUsu = AV20UsurCod ;
                        A8716RlrFchA = localUtil.ctod( AV14LicPar[2-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
                        n8716RlrFchA = false ;
                        A8717RlrFchE = localUtil.ctod( AV14LicPar[3-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
                        n8717RlrFchE = false ;
                        A8718RlrPgm = AV21RlrPgm ;
                        n8718RlrPgm = false ;
                        A8719RlrTrCod = AV22Station ;
                        n8719RlrTrCod = false ;
                        A8720RlrDia = AV12dia ;
                        n8720RlrDia = false ;
                        A8721RlrDiaDif = AV13diaDif ;
                        n8721RlrDiaDif = false ;
                        A8722RlrRnd = (short)(-3) ;
                        n8722RlrRnd = false ;
                        /* Using cursor P03FS12 */
                        pr_default.execute(10, new Object[] {A8714RlrFch, A8715RlrUsu, Boolean.valueOf(n8716RlrFchA), A8716RlrFchA, Boolean.valueOf(n8717RlrFchE), A8717RlrFchE, Boolean.valueOf(n8718RlrPgm), A8718RlrPgm, Boolean.valueOf(n8719RlrTrCod), A8719RlrTrCod, Boolean.valueOf(n8720RlrDia), Short.valueOf(A8720RlrDia), Boolean.valueOf(n8721RlrDiaDif), Short.valueOf(A8721RlrDiaDif), Boolean.valueOf(n8722RlrRnd), Short.valueOf(A8722RlrRnd), Boolean.valueOf(n12845Clave1), A12845Clave1, Boolean.valueOf(n12846Clave2), A12846Clave2, Boolean.valueOf(n12847RlrFchA1), A12847RlrFchA1, Boolean.valueOf(n12848RlrFchE1), A12848RlrFchE1});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRLICRN");
                        if ( (pr_default.getStatus(10) == 1) )
                        {
                           Gx_err = (short)(1) ;
                           Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                        }
                        else
                        {
                           Gx_err = (short)(0) ;
                           Gx_emsg = "" ;
                        }
                        A8714RlrFch = W8714RlrFch ;
                        A8715RlrUsu = W8715RlrUsu ;
                        A8716RlrFchA = W8716RlrFchA ;
                        n8716RlrFchA = false ;
                        A8717RlrFchE = W8717RlrFchE ;
                        n8717RlrFchE = false ;
                        A8718RlrPgm = W8718RlrPgm ;
                        n8718RlrPgm = false ;
                        A8719RlrTrCod = W8719RlrTrCod ;
                        n8719RlrTrCod = false ;
                        A8720RlrDia = W8720RlrDia ;
                        n8720RlrDia = false ;
                        A8721RlrDiaDif = W8721RlrDiaDif ;
                        n8721RlrDiaDif = false ;
                        A8722RlrRnd = W8722RlrRnd ;
                        n8722RlrRnd = false ;
                        /* End Insert */
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
               pr_default.readNext(8);
            }
            pr_default.close(8);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plicrnd.this.AV21RlrPgm;
      this.aP1[0] = plicrnd.this.AV8Error;
      Application.commitDataStores(context, remoteHandle, pr_default, "plicrnd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22Station = "" ;
      GXt_char1 = "" ;
      AV18EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV19EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV20UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      AV16LicPrdId = "" ;
      scmdbuf = "" ;
      P03FS2_A4103LicPrdId = new String[] {""} ;
      P03FS2_A4104LicPrdDat = new String[] {""} ;
      A4103LicPrdId = "" ;
      A4104LicPrdDat = "" ;
      AV14LicPar = new String[20] ;
      GX_I = 1 ;
      while ( GX_I <= 20 )
      {
         AV14LicPar[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GXv_char4 = new String[1] ;
      AV9fecha = GXutil.nullDate() ;
      P03FS3_A396EmprCod = new String[] {""} ;
      P03FS3_n396EmprCod = new boolean[] {false} ;
      P03FS3_A942TermCod = new String[] {""} ;
      P03FS3_A1189TermUsu = new String[] {""} ;
      P03FS3_n1189TermUsu = new boolean[] {false} ;
      P03FS3_A407EmprNom = new String[] {""} ;
      P03FS3_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      A407EmprNom = "" ;
      A8714RlrFch = GXutil.resetTime( GXutil.nullDate() );
      A8715RlrUsu = "" ;
      A8716RlrFchA = GXutil.nullDate() ;
      A8717RlrFchE = GXutil.nullDate() ;
      A8718RlrPgm = "" ;
      A8719RlrTrCod = "" ;
      Gx_emsg = "" ;
      AV10fechaA = GXutil.resetTime( GXutil.nullDate() );
      AV11fechaC = GXutil.resetTime( GXutil.nullDate() );
      P03FS5_A396EmprCod = new String[] {""} ;
      P03FS5_n396EmprCod = new boolean[] {false} ;
      P03FS5_A942TermCod = new String[] {""} ;
      P03FS5_A1189TermUsu = new String[] {""} ;
      P03FS5_n1189TermUsu = new boolean[] {false} ;
      P03FS5_A407EmprNom = new String[] {""} ;
      P03FS5_n407EmprNom = new boolean[] {false} ;
      P03FS7_A8722RlrRnd = new short[1] ;
      P03FS7_n8722RlrRnd = new boolean[] {false} ;
      P03FS7_A8721RlrDiaDif = new short[1] ;
      P03FS7_n8721RlrDiaDif = new boolean[] {false} ;
      P03FS7_A8720RlrDia = new short[1] ;
      P03FS7_n8720RlrDia = new boolean[] {false} ;
      P03FS7_A8719RlrTrCod = new String[] {""} ;
      P03FS7_n8719RlrTrCod = new boolean[] {false} ;
      P03FS7_A8718RlrPgm = new String[] {""} ;
      P03FS7_n8718RlrPgm = new boolean[] {false} ;
      P03FS7_A8717RlrFchE = new java.util.Date[] {GXutil.nullDate()} ;
      P03FS7_n8717RlrFchE = new boolean[] {false} ;
      P03FS7_A8716RlrFchA = new java.util.Date[] {GXutil.nullDate()} ;
      P03FS7_n8716RlrFchA = new boolean[] {false} ;
      P03FS7_A8715RlrUsu = new String[] {""} ;
      P03FS7_A8714RlrFch = new java.util.Date[] {GXutil.nullDate()} ;
      P03FS7_A12848RlrFchE1 = new String[] {""} ;
      P03FS7_n12848RlrFchE1 = new boolean[] {false} ;
      P03FS7_A12847RlrFchA1 = new String[] {""} ;
      P03FS7_n12847RlrFchA1 = new boolean[] {false} ;
      P03FS7_A12846Clave2 = new String[] {""} ;
      P03FS7_n12846Clave2 = new boolean[] {false} ;
      P03FS7_A12845Clave1 = new String[] {""} ;
      P03FS7_n12845Clave1 = new boolean[] {false} ;
      A12848RlrFchE1 = "" ;
      A12847RlrFchA1 = "" ;
      A12846Clave2 = "" ;
      A12845Clave1 = "" ;
      P03FS8_A396EmprCod = new String[] {""} ;
      P03FS8_n396EmprCod = new boolean[] {false} ;
      P03FS8_A942TermCod = new String[] {""} ;
      P03FS8_A1189TermUsu = new String[] {""} ;
      P03FS8_n1189TermUsu = new boolean[] {false} ;
      P03FS8_A407EmprNom = new String[] {""} ;
      P03FS8_n407EmprNom = new boolean[] {false} ;
      W8714RlrFch = GXutil.resetTime( GXutil.nullDate() );
      W8715RlrUsu = "" ;
      W8716RlrFchA = GXutil.nullDate() ;
      W8717RlrFchE = GXutil.nullDate() ;
      W8718RlrPgm = "" ;
      W8719RlrTrCod = "" ;
      P03FS10_A8722RlrRnd = new short[1] ;
      P03FS10_n8722RlrRnd = new boolean[] {false} ;
      P03FS10_A8721RlrDiaDif = new short[1] ;
      P03FS10_n8721RlrDiaDif = new boolean[] {false} ;
      P03FS10_A8720RlrDia = new short[1] ;
      P03FS10_n8720RlrDia = new boolean[] {false} ;
      P03FS10_A8719RlrTrCod = new String[] {""} ;
      P03FS10_n8719RlrTrCod = new boolean[] {false} ;
      P03FS10_A8718RlrPgm = new String[] {""} ;
      P03FS10_n8718RlrPgm = new boolean[] {false} ;
      P03FS10_A8717RlrFchE = new java.util.Date[] {GXutil.nullDate()} ;
      P03FS10_n8717RlrFchE = new boolean[] {false} ;
      P03FS10_A8716RlrFchA = new java.util.Date[] {GXutil.nullDate()} ;
      P03FS10_n8716RlrFchA = new boolean[] {false} ;
      P03FS10_A8715RlrUsu = new String[] {""} ;
      P03FS10_A8714RlrFch = new java.util.Date[] {GXutil.nullDate()} ;
      P03FS10_A12848RlrFchE1 = new String[] {""} ;
      P03FS10_n12848RlrFchE1 = new boolean[] {false} ;
      P03FS10_A12847RlrFchA1 = new String[] {""} ;
      P03FS10_n12847RlrFchA1 = new boolean[] {false} ;
      P03FS10_A12846Clave2 = new String[] {""} ;
      P03FS10_n12846Clave2 = new boolean[] {false} ;
      P03FS10_A12845Clave1 = new String[] {""} ;
      P03FS10_n12845Clave1 = new boolean[] {false} ;
      P03FS11_A396EmprCod = new String[] {""} ;
      P03FS11_n396EmprCod = new boolean[] {false} ;
      P03FS11_A942TermCod = new String[] {""} ;
      P03FS11_A1189TermUsu = new String[] {""} ;
      P03FS11_n1189TermUsu = new boolean[] {false} ;
      P03FS11_A407EmprNom = new String[] {""} ;
      P03FS11_n407EmprNom = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plicrnd__default(),
         new Object[] {
             new Object[] {
            P03FS2_A4103LicPrdId, P03FS2_A4104LicPrdDat
            }
            , new Object[] {
            P03FS3_A396EmprCod, P03FS3_n396EmprCod, P03FS3_A942TermCod, P03FS3_A1189TermUsu, P03FS3_n1189TermUsu, P03FS3_A407EmprNom, P03FS3_n407EmprNom
            }
            , new Object[] {
            }
            , new Object[] {
            P03FS5_A396EmprCod, P03FS5_n396EmprCod, P03FS5_A942TermCod, P03FS5_A1189TermUsu, P03FS5_n1189TermUsu, P03FS5_A407EmprNom, P03FS5_n407EmprNom
            }
            , new Object[] {
            }
            , new Object[] {
            P03FS7_A8722RlrRnd, P03FS7_n8722RlrRnd, P03FS7_A8721RlrDiaDif, P03FS7_n8721RlrDiaDif, P03FS7_A8720RlrDia, P03FS7_n8720RlrDia, P03FS7_A8719RlrTrCod, P03FS7_n8719RlrTrCod, P03FS7_A8718RlrPgm, P03FS7_n8718RlrPgm,
            P03FS7_A8717RlrFchE, P03FS7_n8717RlrFchE, P03FS7_A8716RlrFchA, P03FS7_n8716RlrFchA, P03FS7_A8715RlrUsu, P03FS7_A8714RlrFch, P03FS7_A12848RlrFchE1, P03FS7_n12848RlrFchE1, P03FS7_A12847RlrFchA1, P03FS7_n12847RlrFchA1,
            P03FS7_A12846Clave2, P03FS7_n12846Clave2, P03FS7_A12845Clave1, P03FS7_n12845Clave1
            }
            , new Object[] {
            P03FS8_A396EmprCod, P03FS8_n396EmprCod, P03FS8_A942TermCod, P03FS8_A1189TermUsu, P03FS8_n1189TermUsu, P03FS8_A407EmprNom, P03FS8_n407EmprNom
            }
            , new Object[] {
            }
            , new Object[] {
            P03FS10_A8722RlrRnd, P03FS10_n8722RlrRnd, P03FS10_A8721RlrDiaDif, P03FS10_n8721RlrDiaDif, P03FS10_A8720RlrDia, P03FS10_n8720RlrDia, P03FS10_A8719RlrTrCod, P03FS10_n8719RlrTrCod, P03FS10_A8718RlrPgm, P03FS10_n8718RlrPgm,
            P03FS10_A8717RlrFchE, P03FS10_n8717RlrFchE, P03FS10_A8716RlrFchA, P03FS10_n8716RlrFchA, P03FS10_A8715RlrUsu, P03FS10_A8714RlrFch, P03FS10_A12848RlrFchE1, P03FS10_n12848RlrFchE1, P03FS10_A12847RlrFchA1, P03FS10_n12847RlrFchA1,
            P03FS10_A12846Clave2, P03FS10_n12846Clave2, P03FS10_A12845Clave1, P03FS10_n12845Clave1
            }
            , new Object[] {
            P03FS11_A396EmprCod, P03FS11_n396EmprCod, P03FS11_A942TermCod, P03FS11_A1189TermUsu, P03FS11_n1189TermUsu, P03FS11_A407EmprNom, P03FS11_n407EmprNom
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Error ;
   private byte AV25NewLicRnd ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte AV12dia ;
   private short A8720RlrDia ;
   private short A8721RlrDiaDif ;
   private short A8722RlrRnd ;
   private short Gx_err ;
   private short AV13diaDif ;
   private short W8720RlrDia ;
   private short W8721RlrDiaDif ;
   private short W8722RlrRnd ;
   private int GX_INS1190 ;
   private int GX_I ;
   private long AV15rnd ;
   private String AV22Station ;
   private String GXt_char1 ;
   private String AV18EmprCod ;
   private String GXv_char2[] ;
   private String AV19EmprNom ;
   private String GXv_char3[] ;
   private String AV20UsurCod ;
   private String AV16LicPrdId ;
   private String scmdbuf ;
   private String A4103LicPrdId ;
   private String A4104LicPrdDat ;
   private String AV14LicPar[] ;
   private String GXv_char4[] ;
   private String A396EmprCod ;
   private String A942TermCod ;
   private String A1189TermUsu ;
   private String A407EmprNom ;
   private String A8715RlrUsu ;
   private String A8719RlrTrCod ;
   private String Gx_emsg ;
   private String A12848RlrFchE1 ;
   private String A12847RlrFchA1 ;
   private String A12846Clave2 ;
   private String A12845Clave1 ;
   private String W8715RlrUsu ;
   private String W8719RlrTrCod ;
   private java.util.Date A8714RlrFch ;
   private java.util.Date AV10fechaA ;
   private java.util.Date AV11fechaC ;
   private java.util.Date W8714RlrFch ;
   private java.util.Date AV9fecha ;
   private java.util.Date A8716RlrFchA ;
   private java.util.Date A8717RlrFchE ;
   private java.util.Date W8716RlrFchA ;
   private java.util.Date W8717RlrFchE ;
   private boolean returnInSub ;
   private boolean n396EmprCod ;
   private boolean n1189TermUsu ;
   private boolean n407EmprNom ;
   private boolean n8716RlrFchA ;
   private boolean n8717RlrFchE ;
   private boolean n8718RlrPgm ;
   private boolean n8719RlrTrCod ;
   private boolean n8720RlrDia ;
   private boolean n8721RlrDiaDif ;
   private boolean n8722RlrRnd ;
   private boolean n12848RlrFchE1 ;
   private boolean n12847RlrFchA1 ;
   private boolean n12846Clave2 ;
   private boolean n12845Clave1 ;
   private String AV21RlrPgm ;
   private String A8718RlrPgm ;
   private String W8718RlrPgm ;
   private byte[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03FS2_A4103LicPrdId ;
   private String[] P03FS2_A4104LicPrdDat ;
   private String[] P03FS3_A396EmprCod ;
   private boolean[] P03FS3_n396EmprCod ;
   private String[] P03FS3_A942TermCod ;
   private String[] P03FS3_A1189TermUsu ;
   private boolean[] P03FS3_n1189TermUsu ;
   private String[] P03FS3_A407EmprNom ;
   private boolean[] P03FS3_n407EmprNom ;
   private String[] P03FS5_A396EmprCod ;
   private boolean[] P03FS5_n396EmprCod ;
   private String[] P03FS5_A942TermCod ;
   private String[] P03FS5_A1189TermUsu ;
   private boolean[] P03FS5_n1189TermUsu ;
   private String[] P03FS5_A407EmprNom ;
   private boolean[] P03FS5_n407EmprNom ;
   private short[] P03FS7_A8722RlrRnd ;
   private boolean[] P03FS7_n8722RlrRnd ;
   private short[] P03FS7_A8721RlrDiaDif ;
   private boolean[] P03FS7_n8721RlrDiaDif ;
   private short[] P03FS7_A8720RlrDia ;
   private boolean[] P03FS7_n8720RlrDia ;
   private String[] P03FS7_A8719RlrTrCod ;
   private boolean[] P03FS7_n8719RlrTrCod ;
   private String[] P03FS7_A8718RlrPgm ;
   private boolean[] P03FS7_n8718RlrPgm ;
   private java.util.Date[] P03FS7_A8717RlrFchE ;
   private boolean[] P03FS7_n8717RlrFchE ;
   private java.util.Date[] P03FS7_A8716RlrFchA ;
   private boolean[] P03FS7_n8716RlrFchA ;
   private String[] P03FS7_A8715RlrUsu ;
   private java.util.Date[] P03FS7_A8714RlrFch ;
   private String[] P03FS7_A12848RlrFchE1 ;
   private boolean[] P03FS7_n12848RlrFchE1 ;
   private String[] P03FS7_A12847RlrFchA1 ;
   private boolean[] P03FS7_n12847RlrFchA1 ;
   private String[] P03FS7_A12846Clave2 ;
   private boolean[] P03FS7_n12846Clave2 ;
   private String[] P03FS7_A12845Clave1 ;
   private boolean[] P03FS7_n12845Clave1 ;
   private String[] P03FS8_A396EmprCod ;
   private boolean[] P03FS8_n396EmprCod ;
   private String[] P03FS8_A942TermCod ;
   private String[] P03FS8_A1189TermUsu ;
   private boolean[] P03FS8_n1189TermUsu ;
   private String[] P03FS8_A407EmprNom ;
   private boolean[] P03FS8_n407EmprNom ;
   private short[] P03FS10_A8722RlrRnd ;
   private boolean[] P03FS10_n8722RlrRnd ;
   private short[] P03FS10_A8721RlrDiaDif ;
   private boolean[] P03FS10_n8721RlrDiaDif ;
   private short[] P03FS10_A8720RlrDia ;
   private boolean[] P03FS10_n8720RlrDia ;
   private String[] P03FS10_A8719RlrTrCod ;
   private boolean[] P03FS10_n8719RlrTrCod ;
   private String[] P03FS10_A8718RlrPgm ;
   private boolean[] P03FS10_n8718RlrPgm ;
   private java.util.Date[] P03FS10_A8717RlrFchE ;
   private boolean[] P03FS10_n8717RlrFchE ;
   private java.util.Date[] P03FS10_A8716RlrFchA ;
   private boolean[] P03FS10_n8716RlrFchA ;
   private String[] P03FS10_A8715RlrUsu ;
   private java.util.Date[] P03FS10_A8714RlrFch ;
   private String[] P03FS10_A12848RlrFchE1 ;
   private boolean[] P03FS10_n12848RlrFchE1 ;
   private String[] P03FS10_A12847RlrFchA1 ;
   private boolean[] P03FS10_n12847RlrFchA1 ;
   private String[] P03FS10_A12846Clave2 ;
   private boolean[] P03FS10_n12846Clave2 ;
   private String[] P03FS10_A12845Clave1 ;
   private boolean[] P03FS10_n12845Clave1 ;
   private String[] P03FS11_A396EmprCod ;
   private boolean[] P03FS11_n396EmprCod ;
   private String[] P03FS11_A942TermCod ;
   private String[] P03FS11_A1189TermUsu ;
   private boolean[] P03FS11_n1189TermUsu ;
   private String[] P03FS11_A407EmprNom ;
   private boolean[] P03FS11_n407EmprNom ;
}

final  class plicrnd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03FS2", "SELECT LicPrdId, LicPrdDat FROM TXPLICPRD WHERE LicPrdId = ? ORDER BY LicPrdId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03FS3", "SELECT T1.EmprCod, T1.TermCod, T1.TermUsu, T2.EmprNom FROM (TXPTERMIN T1 LEFT JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.TermCod = ? ORDER BY T1.TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03FS4", "INSERT INTO TXPRLICRN(RlrFch, RlrUsu, RlrFchA, RlrFchE, RlrPgm, RlrTrCod, RlrDia, RlrDiaDif, RlrRnd, Clave1, Clave2, RlrFchA1, RlrFchE1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRLICRN")
         ,new ForEachCursor("P03FS5", "SELECT T1.EmprCod, T1.TermCod, T1.TermUsu, T2.EmprNom FROM (TXPTERMIN T1 LEFT JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.TermCod = ? ORDER BY T1.TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03FS6", "INSERT INTO TXPRLICRN(RlrFch, RlrUsu, RlrFchA, RlrFchE, RlrPgm, RlrTrCod, RlrDia, RlrDiaDif, RlrRnd, Clave1, Clave2, RlrFchA1, RlrFchE1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRLICRN")
         ,new ForEachCursor("P03FS7", "SELECT RlrRnd, RlrDiaDif, RlrDia, RlrTrCod, RlrPgm, RlrFchE, RlrFchA, RlrUsu, RlrFch, RlrFchE1, RlrFchA1, Clave2, Clave1 FROM TXPRLICRN ORDER BY RlrFch, RlrUsu ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03FS8", "SELECT T1.EmprCod, T1.TermCod, T1.TermUsu, T2.EmprNom FROM (TXPTERMIN T1 LEFT JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.TermCod = ? ORDER BY T1.TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03FS9", "INSERT INTO TXPRLICRN(RlrFch, RlrUsu, RlrFchA, RlrFchE, RlrPgm, RlrTrCod, RlrDia, RlrDiaDif, RlrRnd, Clave1, Clave2, RlrFchA1, RlrFchE1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRLICRN")
         ,new ForEachCursor("P03FS10", "SELECT RlrRnd, RlrDiaDif, RlrDia, RlrTrCod, RlrPgm, RlrFchE, RlrFchA, RlrUsu, RlrFch, RlrFchE1, RlrFchA1, Clave2, Clave1 FROM TXPRLICRN WHERE RlrFchA > ? ORDER BY RlrFch, RlrUsu ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03FS11", "SELECT T1.EmprCod, T1.TermCod, T1.TermUsu, T2.EmprNom FROM (TXPTERMIN T1 LEFT JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.TermCod = ? ORDER BY T1.TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03FS12", "INSERT INTO TXPRLICRN(RlrFch, RlrUsu, RlrFchA, RlrFchE, RlrPgm, RlrTrCod, RlrDia, RlrDiaDif, RlrRnd, Clave1, Clave2, RlrFchA1, RlrFchE1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRLICRN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 8);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[16])[0] = rslt.getString(10, 32);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 32);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 32);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 32);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 8);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[16])[0] = rslt.getString(10, 32);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 32);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 32);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 32);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 4);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 2 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 8);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 100);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[15]).shortValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 4 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 8);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 100);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[15]).shortValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 7 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 8);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 100);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[17], 32);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 32);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[21], 32);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[23], 32);
               }
               return;
            case 8 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 10 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 8);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 100);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[17], 32);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 32);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[21], 32);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[23], 32);
               }
               return;
      }
   }

}

