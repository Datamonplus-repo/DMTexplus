package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewlicrnd extends GXProcedure
{
   public pnewlicrnd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewlicrnd.class ), "" );
   }

   public pnewlicrnd( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 )
   {
      pnewlicrnd.this.aP1 = new byte[] {0};
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
      pnewlicrnd.this.AV37RlrPgm = aP0[0];
      this.aP0 = aP0;
      pnewlicrnd.this.AV24Error = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Error = (byte)(1) ;
      AV32LicPrdId = httpContext.getMessage( "EN01", "") ;
      /* Using cursor P05J92 */
      pr_default.execute(0, new Object[] {AV32LicPrdId});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4103LicPrdId = P05J92_A4103LicPrdId[0] ;
         A4104LicPrdDat = P05J92_A4104LicPrdDat[0] ;
         GXv_char1[0] = A4104LicPrdDat ;
         new app.plic2par(remoteHandle, context).execute( AV30LicPar, GXv_char1) ;
         pnewlicrnd.this.A4104LicPrdDat = GXv_char1[0] ;
         AV24Error = (byte)(0) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV24Error == 1 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV45Fecalfa = "13/02/18" ;
      AV25fecha = GXutil.serverDate( context, remoteHandle, pr_default) ;
      if ( (( GXutil.resetTime(AV25fecha).after( GXutil.resetTime( localUtil.ctod( AV30LicPar[2-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV25fecha), GXutil.resetTime(localUtil.ctod( AV30LicPar[2-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))))) )) && ( ( GXutil.strcmp(AV37RlrPgm, httpContext.getMessage( "UMENUS", "")) != 0 ) && ( GXutil.strcmp(AV37RlrPgm, httpContext.getMessage( "UMENUGRA", "")) != 0 ) ) )
      {
         if ( (( GXutil.resetTime(AV25fecha).after( GXutil.resetTime( localUtil.ctod( AV30LicPar[3-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV25fecha), GXutil.resetTime(localUtil.ctod( AV30LicPar[3-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))))) )) )
         {
            AV24Error = (byte)(1) ;
            GXt_char2 = AV38Station ;
            GXv_char1[0] = GXt_char2 ;
            new app.obtenerwrkst(remoteHandle, context).execute( GXv_char1) ;
            pnewlicrnd.this.GXt_char2 = GXv_char1[0] ;
            AV38Station = GXt_char2 ;
            /* Using cursor P05J93 */
            pr_default.execute(1, new Object[] {AV38Station});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A396EmprCod = P05J93_A396EmprCod[0] ;
               n396EmprCod = P05J93_n396EmprCod[0] ;
               A942TermCod = P05J93_A942TermCod[0] ;
               A1189TermUsu = P05J93_A1189TermUsu[0] ;
               n1189TermUsu = P05J93_n1189TermUsu[0] ;
               A407EmprNom = P05J93_A407EmprNom[0] ;
               n407EmprNom = P05J93_n407EmprNom[0] ;
               A407EmprNom = P05J93_A407EmprNom[0] ;
               n407EmprNom = P05J93_n407EmprNom[0] ;
               AV36UsurCod = A1189TermUsu ;
               AV35EmprNom = A407EmprNom ;
               AV36UsurCod = A1189TermUsu ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            AV46RlrTrCod = AV38Station ;
            /*
               INSERT RECORD ON TABLE TXPRLICRN

            */
            A8714RlrFch = GXutil.serverNow( context, remoteHandle, pr_default) ;
            A8715RlrUsu = AV36UsurCod ;
            A8716RlrFchA = GXutil.nullDate() ;
            n8716RlrFchA = false ;
            A8717RlrFchE = GXutil.nullDate() ;
            n8717RlrFchE = false ;
            A8718RlrPgm = AV37RlrPgm ;
            n8718RlrPgm = false ;
            A8719RlrTrCod = GXutil.substring( AV46RlrTrCod, 1, 10) ;
            n8719RlrTrCod = false ;
            A8720RlrDia = (short)(-1) ;
            n8720RlrDia = false ;
            A8721RlrDiaDif = (short)(-1) ;
            n8721RlrDiaDif = false ;
            A8722RlrRnd = (short)(-1) ;
            n8722RlrRnd = false ;
            AV41Clave1 = com.genexus.util.Encryption.getNewKey( ) ;
            AV42Valor1 = httpContext.encrypt64( AV30LicPar[2-1], AV41Clave1) ;
            A12847RlrFchA1 = AV42Valor1 ;
            n12847RlrFchA1 = false ;
            A12845Clave1 = AV41Clave1 ;
            n12845Clave1 = false ;
            AV43Clave2 = com.genexus.util.Encryption.getNewKey( ) ;
            AV44Valor2 = httpContext.encrypt64( AV30LicPar[3-1], AV43Clave2) ;
            A12848RlrFchE1 = AV44Valor2 ;
            n12848RlrFchE1 = false ;
            A12846Clave2 = AV43Clave2 ;
            n12846Clave2 = false ;
            /* Using cursor P05J94 */
            pr_default.execute(2, new Object[] {A8714RlrFch, A8715RlrUsu, Boolean.valueOf(n8716RlrFchA), A8716RlrFchA, Boolean.valueOf(n8717RlrFchE), A8717RlrFchE, Boolean.valueOf(n8718RlrPgm), A8718RlrPgm, Boolean.valueOf(n8719RlrTrCod), A8719RlrTrCod, Boolean.valueOf(n8720RlrDia), Short.valueOf(A8720RlrDia), Boolean.valueOf(n8721RlrDiaDif), Short.valueOf(A8721RlrDiaDif), Boolean.valueOf(n8722RlrRnd), Short.valueOf(A8722RlrRnd), Boolean.valueOf(n12845Clave1), A12845Clave1, Boolean.valueOf(n12846Clave2), A12846Clave2, Boolean.valueOf(n12847RlrFchA1), A12847RlrFchA1, Boolean.valueOf(n12848RlrFchE1), A12848RlrFchE1});
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
            AV26fechaA = localUtil.ctot( AV30LicPar[2-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV27fechaC = localUtil.ctot( AV30LicPar[3-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV29diaDif = (short)(GXutil.Int( GXutil.dtdiff( AV27fechaC, AV26fechaA)/ (double) (60)/ (double) (60)/ (double) (24))) ;
            AV28dia = (byte)(GXutil.Int( GXutil.dtdiff( localUtil.ctot( localUtil.dtoc( AV25fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), AV26fechaA)/ (double) (60)/ (double) (60)/ (double) (24))) ;
            AV31rnd = (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.random( )*AV29diaDif), 0))) ;
            if ( AV31rnd < AV28dia )
            {
               AV24Error = (byte)(1) ;
               GXt_char2 = AV38Station ;
               GXv_char1[0] = GXt_char2 ;
               new app.obtenerwrkst(remoteHandle, context).execute( GXv_char1) ;
               pnewlicrnd.this.GXt_char2 = GXv_char1[0] ;
               AV38Station = GXt_char2 ;
               /* Using cursor P05J95 */
               pr_default.execute(3, new Object[] {AV38Station});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A396EmprCod = P05J95_A396EmprCod[0] ;
                  n396EmprCod = P05J95_n396EmprCod[0] ;
                  A942TermCod = P05J95_A942TermCod[0] ;
                  A1189TermUsu = P05J95_A1189TermUsu[0] ;
                  n1189TermUsu = P05J95_n1189TermUsu[0] ;
                  A407EmprNom = P05J95_A407EmprNom[0] ;
                  n407EmprNom = P05J95_n407EmprNom[0] ;
                  A407EmprNom = P05J95_A407EmprNom[0] ;
                  n407EmprNom = P05J95_n407EmprNom[0] ;
                  AV36UsurCod = A1189TermUsu ;
                  AV35EmprNom = A407EmprNom ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(3);
               /*
                  INSERT RECORD ON TABLE TXPRLICRN

               */
               A8714RlrFch = GXutil.serverNow( context, remoteHandle, pr_default) ;
               A8715RlrUsu = AV36UsurCod ;
               A8716RlrFchA = GXutil.nullDate() ;
               n8716RlrFchA = false ;
               A8717RlrFchE = GXutil.nullDate() ;
               n8717RlrFchE = false ;
               A8718RlrPgm = AV37RlrPgm ;
               n8718RlrPgm = false ;
               A8719RlrTrCod = GXutil.substring( AV38Station, 1, 10) ;
               n8719RlrTrCod = false ;
               A8720RlrDia = AV28dia ;
               n8720RlrDia = false ;
               A8721RlrDiaDif = AV29diaDif ;
               n8721RlrDiaDif = false ;
               A8722RlrRnd = (short)(AV31rnd) ;
               n8722RlrRnd = false ;
               AV41Clave1 = com.genexus.util.Encryption.getNewKey( ) ;
               AV42Valor1 = httpContext.encrypt64( AV30LicPar[2-1], AV41Clave1) ;
               A12847RlrFchA1 = AV42Valor1 ;
               n12847RlrFchA1 = false ;
               A12845Clave1 = AV41Clave1 ;
               n12845Clave1 = false ;
               AV43Clave2 = com.genexus.util.Encryption.getNewKey( ) ;
               AV44Valor2 = httpContext.encrypt64( AV30LicPar[3-1], AV43Clave2) ;
               A12848RlrFchE1 = AV44Valor2 ;
               n12848RlrFchE1 = false ;
               A12846Clave2 = AV43Clave2 ;
               n12846Clave2 = false ;
               /* Using cursor P05J96 */
               pr_default.execute(4, new Object[] {A8714RlrFch, A8715RlrUsu, Boolean.valueOf(n8716RlrFchA), A8716RlrFchA, Boolean.valueOf(n8717RlrFchE), A8717RlrFchE, Boolean.valueOf(n8718RlrPgm), A8718RlrPgm, Boolean.valueOf(n8719RlrTrCod), A8719RlrTrCod, Boolean.valueOf(n8720RlrDia), Short.valueOf(A8720RlrDia), Boolean.valueOf(n8721RlrDiaDif), Short.valueOf(A8721RlrDiaDif), Boolean.valueOf(n8722RlrRnd), Short.valueOf(A8722RlrRnd), Boolean.valueOf(n12845Clave1), A12845Clave1, Boolean.valueOf(n12846Clave2), A12846Clave2, Boolean.valueOf(n12847RlrFchA1), A12847RlrFchA1, Boolean.valueOf(n12848RlrFchE1), A12848RlrFchE1});
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
               AV24Error = (byte)(0) ;
            }
         }
      }
      AV26fechaA = localUtil.ctot( AV30LicPar[2-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV27fechaC = localUtil.ctot( AV30LicPar[3-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV28dia = (byte)(GXutil.Int( GXutil.dtdiff( localUtil.ctot( localUtil.dtoc( AV25fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), AV26fechaA)/ (double) (60)/ (double) (60)/ (double) (24))) ;
      AV31rnd = (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.random( )*AV29diaDif), 0))) ;
      if ( ( AV24Error == 0 ) && ( ( GXutil.strcmp(AV37RlrPgm, httpContext.getMessage( "UMENUS", "")) == 0 ) || ( GXutil.strcmp(AV37RlrPgm, httpContext.getMessage( "UMENUGRA", "")) == 0 ) ) )
      {
         /* Using cursor P05J97 */
         pr_default.execute(5);
         while ( (pr_default.getStatus(5) != 101) )
         {
            A12848RlrFchE1 = P05J97_A12848RlrFchE1[0] ;
            n12848RlrFchE1 = P05J97_n12848RlrFchE1[0] ;
            A12847RlrFchA1 = P05J97_A12847RlrFchA1[0] ;
            n12847RlrFchA1 = P05J97_n12847RlrFchA1[0] ;
            A12846Clave2 = P05J97_A12846Clave2[0] ;
            n12846Clave2 = P05J97_n12846Clave2[0] ;
            A12845Clave1 = P05J97_A12845Clave1[0] ;
            n12845Clave1 = P05J97_n12845Clave1[0] ;
            A8722RlrRnd = P05J97_A8722RlrRnd[0] ;
            n8722RlrRnd = P05J97_n8722RlrRnd[0] ;
            A8721RlrDiaDif = P05J97_A8721RlrDiaDif[0] ;
            n8721RlrDiaDif = P05J97_n8721RlrDiaDif[0] ;
            A8720RlrDia = P05J97_A8720RlrDia[0] ;
            n8720RlrDia = P05J97_n8720RlrDia[0] ;
            A8719RlrTrCod = P05J97_A8719RlrTrCod[0] ;
            n8719RlrTrCod = P05J97_n8719RlrTrCod[0] ;
            A8718RlrPgm = P05J97_A8718RlrPgm[0] ;
            n8718RlrPgm = P05J97_n8718RlrPgm[0] ;
            A8717RlrFchE = P05J97_A8717RlrFchE[0] ;
            n8717RlrFchE = P05J97_n8717RlrFchE[0] ;
            A8716RlrFchA = P05J97_A8716RlrFchA[0] ;
            n8716RlrFchA = P05J97_n8716RlrFchA[0] ;
            A8715RlrUsu = P05J97_A8715RlrUsu[0] ;
            A8714RlrFch = P05J97_A8714RlrFch[0] ;
            if ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.decrypt64( A12848RlrFchE1, A12846Clave2), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(localUtil.ctod( AV30LicPar[3-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))))) )
            {
               if ( (( localUtil.ctot( localUtil.dtoc( localUtil.ctod( httpContext.decrypt64( A12848RlrFchE1, A12846Clave2), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))).before( A8714RlrFch ) ) || ( GXutil.dateCompare(localUtil.ctot( localUtil.dtoc( localUtil.ctod( httpContext.decrypt64( A12848RlrFchE1, A12846Clave2), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), A8714RlrFch) )) )
               {
                  AV24Error = (byte)(1) ;
                  GXt_char2 = AV38Station ;
                  GXv_char1[0] = GXt_char2 ;
                  new app.obtenerwrkst(remoteHandle, context).execute( GXv_char1) ;
                  pnewlicrnd.this.GXt_char2 = GXv_char1[0] ;
                  AV38Station = GXt_char2 ;
                  /* Using cursor P05J98 */
                  pr_default.execute(6, new Object[] {AV38Station});
                  while ( (pr_default.getStatus(6) != 101) )
                  {
                     A396EmprCod = P05J98_A396EmprCod[0] ;
                     n396EmprCod = P05J98_n396EmprCod[0] ;
                     A942TermCod = P05J98_A942TermCod[0] ;
                     A1189TermUsu = P05J98_A1189TermUsu[0] ;
                     n1189TermUsu = P05J98_n1189TermUsu[0] ;
                     A407EmprNom = P05J98_A407EmprNom[0] ;
                     n407EmprNom = P05J98_n407EmprNom[0] ;
                     A407EmprNom = P05J98_A407EmprNom[0] ;
                     n407EmprNom = P05J98_n407EmprNom[0] ;
                     AV36UsurCod = A1189TermUsu ;
                     AV35EmprNom = A407EmprNom ;
                     AV36UsurCod = A1189TermUsu ;
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
                  W12847RlrFchA1 = A12847RlrFchA1 ;
                  n12847RlrFchA1 = false ;
                  W12845Clave1 = A12845Clave1 ;
                  n12845Clave1 = false ;
                  W12848RlrFchE1 = A12848RlrFchE1 ;
                  n12848RlrFchE1 = false ;
                  W12846Clave2 = A12846Clave2 ;
                  n12846Clave2 = false ;
                  A8714RlrFch = GXutil.serverNow( context, remoteHandle, pr_default) ;
                  A8715RlrUsu = AV36UsurCod ;
                  A8716RlrFchA = GXutil.nullDate() ;
                  n8716RlrFchA = false ;
                  A8717RlrFchE = GXutil.nullDate() ;
                  n8717RlrFchE = false ;
                  A8718RlrPgm = AV37RlrPgm ;
                  n8718RlrPgm = false ;
                  A8719RlrTrCod = GXutil.substring( AV38Station, 1, 10) ;
                  n8719RlrTrCod = false ;
                  A8720RlrDia = AV28dia ;
                  n8720RlrDia = false ;
                  A8721RlrDiaDif = AV29diaDif ;
                  n8721RlrDiaDif = false ;
                  A8722RlrRnd = (short)(-2) ;
                  n8722RlrRnd = false ;
                  AV41Clave1 = com.genexus.util.Encryption.getNewKey( ) ;
                  AV42Valor1 = httpContext.encrypt64( AV30LicPar[2-1], AV41Clave1) ;
                  A12847RlrFchA1 = AV42Valor1 ;
                  n12847RlrFchA1 = false ;
                  A12845Clave1 = AV41Clave1 ;
                  n12845Clave1 = false ;
                  AV43Clave2 = com.genexus.util.Encryption.getNewKey( ) ;
                  AV44Valor2 = httpContext.encrypt64( AV30LicPar[3-1], AV43Clave2) ;
                  A12848RlrFchE1 = AV44Valor2 ;
                  n12848RlrFchE1 = false ;
                  A12846Clave2 = AV43Clave2 ;
                  n12846Clave2 = false ;
                  /* Using cursor P05J99 */
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
                  A12847RlrFchA1 = W12847RlrFchA1 ;
                  n12847RlrFchA1 = false ;
                  A12845Clave1 = W12845Clave1 ;
                  n12845Clave1 = false ;
                  A12848RlrFchE1 = W12848RlrFchE1 ;
                  n12848RlrFchE1 = false ;
                  A12846Clave2 = W12846Clave2 ;
                  n12846Clave2 = false ;
                  /* End Insert */
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
            pr_default.readNext(5);
         }
         pr_default.close(5);
         if ( AV24Error == 0 )
         {
            /* Using cursor P05J910 */
            pr_default.execute(8);
            while ( (pr_default.getStatus(8) != 101) )
            {
               A12848RlrFchE1 = P05J910_A12848RlrFchE1[0] ;
               n12848RlrFchE1 = P05J910_n12848RlrFchE1[0] ;
               A12847RlrFchA1 = P05J910_A12847RlrFchA1[0] ;
               n12847RlrFchA1 = P05J910_n12847RlrFchA1[0] ;
               A12846Clave2 = P05J910_A12846Clave2[0] ;
               n12846Clave2 = P05J910_n12846Clave2[0] ;
               A12845Clave1 = P05J910_A12845Clave1[0] ;
               n12845Clave1 = P05J910_n12845Clave1[0] ;
               A8722RlrRnd = P05J910_A8722RlrRnd[0] ;
               n8722RlrRnd = P05J910_n8722RlrRnd[0] ;
               A8721RlrDiaDif = P05J910_A8721RlrDiaDif[0] ;
               n8721RlrDiaDif = P05J910_n8721RlrDiaDif[0] ;
               A8720RlrDia = P05J910_A8720RlrDia[0] ;
               n8720RlrDia = P05J910_n8720RlrDia[0] ;
               A8719RlrTrCod = P05J910_A8719RlrTrCod[0] ;
               n8719RlrTrCod = P05J910_n8719RlrTrCod[0] ;
               A8718RlrPgm = P05J910_A8718RlrPgm[0] ;
               n8718RlrPgm = P05J910_n8718RlrPgm[0] ;
               A8717RlrFchE = P05J910_A8717RlrFchE[0] ;
               n8717RlrFchE = P05J910_n8717RlrFchE[0] ;
               A8716RlrFchA = P05J910_A8716RlrFchA[0] ;
               n8716RlrFchA = P05J910_n8716RlrFchA[0] ;
               A8715RlrUsu = P05J910_A8715RlrUsu[0] ;
               A8714RlrFch = P05J910_A8714RlrFch[0] ;
               if ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.decrypt64( A12847RlrFchA1, A12845Clave1), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(localUtil.ctod( AV30LicPar[2-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))))) )
               {
                  if ( GXutil.resetTime(localUtil.ctod( httpContext.decrypt64( A12847RlrFchA1, A12845Clave1), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV25fecha )) )
                  {
                     if ( (( localUtil.ctot( localUtil.dtoc( localUtil.ctod( httpContext.decrypt64( A12847RlrFchA1, A12845Clave1), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))).before( A8714RlrFch ) ) || ( GXutil.dateCompare(localUtil.ctot( localUtil.dtoc( localUtil.ctod( httpContext.decrypt64( A12847RlrFchA1, A12845Clave1), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), A8714RlrFch) )) )
                     {
                        if ( A8714RlrFch.before( localUtil.ctot( localUtil.dtoc( localUtil.ctod( httpContext.decrypt64( A12848RlrFchE1, A12846Clave2), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ) )
                        {
                           AV24Error = (byte)(1) ;
                           GXt_char2 = AV38Station ;
                           GXv_char1[0] = GXt_char2 ;
                           new app.obtenerwrkst(remoteHandle, context).execute( GXv_char1) ;
                           pnewlicrnd.this.GXt_char2 = GXv_char1[0] ;
                           AV38Station = GXt_char2 ;
                           /* Using cursor P05J911 */
                           pr_default.execute(9, new Object[] {AV38Station});
                           while ( (pr_default.getStatus(9) != 101) )
                           {
                              A396EmprCod = P05J911_A396EmprCod[0] ;
                              n396EmprCod = P05J911_n396EmprCod[0] ;
                              A942TermCod = P05J911_A942TermCod[0] ;
                              A1189TermUsu = P05J911_A1189TermUsu[0] ;
                              n1189TermUsu = P05J911_n1189TermUsu[0] ;
                              A407EmprNom = P05J911_A407EmprNom[0] ;
                              n407EmprNom = P05J911_n407EmprNom[0] ;
                              A407EmprNom = P05J911_A407EmprNom[0] ;
                              n407EmprNom = P05J911_n407EmprNom[0] ;
                              AV36UsurCod = A1189TermUsu ;
                              AV35EmprNom = A407EmprNom ;
                              AV36UsurCod = A1189TermUsu ;
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
                           W12847RlrFchA1 = A12847RlrFchA1 ;
                           n12847RlrFchA1 = false ;
                           W12845Clave1 = A12845Clave1 ;
                           n12845Clave1 = false ;
                           W12848RlrFchE1 = A12848RlrFchE1 ;
                           n12848RlrFchE1 = false ;
                           W12846Clave2 = A12846Clave2 ;
                           n12846Clave2 = false ;
                           A8714RlrFch = GXutil.serverNow( context, remoteHandle, pr_default) ;
                           A8715RlrUsu = AV36UsurCod ;
                           A8716RlrFchA = GXutil.nullDate() ;
                           n8716RlrFchA = false ;
                           A8717RlrFchE = GXutil.nullDate() ;
                           n8717RlrFchE = false ;
                           A8718RlrPgm = AV37RlrPgm ;
                           n8718RlrPgm = false ;
                           A8719RlrTrCod = GXutil.substring( AV38Station, 1, 10) ;
                           n8719RlrTrCod = false ;
                           A8720RlrDia = AV28dia ;
                           n8720RlrDia = false ;
                           A8721RlrDiaDif = AV29diaDif ;
                           n8721RlrDiaDif = false ;
                           A8722RlrRnd = (short)(-3) ;
                           n8722RlrRnd = false ;
                           AV41Clave1 = com.genexus.util.Encryption.getNewKey( ) ;
                           AV42Valor1 = httpContext.encrypt64( AV30LicPar[2-1], AV41Clave1) ;
                           A12847RlrFchA1 = AV42Valor1 ;
                           n12847RlrFchA1 = false ;
                           A12845Clave1 = AV41Clave1 ;
                           n12845Clave1 = false ;
                           AV43Clave2 = com.genexus.util.Encryption.getNewKey( ) ;
                           AV44Valor2 = httpContext.encrypt64( AV30LicPar[3-1], AV43Clave2) ;
                           A12848RlrFchE1 = AV44Valor2 ;
                           n12848RlrFchE1 = false ;
                           A12846Clave2 = AV43Clave2 ;
                           n12846Clave2 = false ;
                           /* Using cursor P05J912 */
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
                           A12847RlrFchA1 = W12847RlrFchA1 ;
                           n12847RlrFchA1 = false ;
                           A12845Clave1 = W12845Clave1 ;
                           n12845Clave1 = false ;
                           A12848RlrFchE1 = W12848RlrFchE1 ;
                           n12848RlrFchE1 = false ;
                           A12846Clave2 = W12846Clave2 ;
                           n12846Clave2 = false ;
                           /* End Insert */
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
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
      this.aP0[0] = pnewlicrnd.this.AV37RlrPgm;
      this.aP1[0] = pnewlicrnd.this.AV24Error;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnewlicrnd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32LicPrdId = "" ;
      scmdbuf = "" ;
      P05J92_A4103LicPrdId = new String[] {""} ;
      P05J92_A4104LicPrdDat = new String[] {""} ;
      A4103LicPrdId = "" ;
      A4104LicPrdDat = "" ;
      AV30LicPar = new String[20] ;
      GX_I = 1 ;
      while ( GX_I <= 20 )
      {
         AV30LicPar[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV45Fecalfa = "" ;
      AV25fecha = GXutil.nullDate() ;
      AV38Station = "" ;
      P05J93_A396EmprCod = new String[] {""} ;
      P05J93_n396EmprCod = new boolean[] {false} ;
      P05J93_A942TermCod = new String[] {""} ;
      P05J93_A1189TermUsu = new String[] {""} ;
      P05J93_n1189TermUsu = new boolean[] {false} ;
      P05J93_A407EmprNom = new String[] {""} ;
      P05J93_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      A407EmprNom = "" ;
      AV36UsurCod = "" ;
      AV35EmprNom = "" ;
      AV46RlrTrCod = "" ;
      A8714RlrFch = GXutil.resetTime( GXutil.nullDate() );
      A8715RlrUsu = "" ;
      A8716RlrFchA = GXutil.nullDate() ;
      A8717RlrFchE = GXutil.nullDate() ;
      A8718RlrPgm = "" ;
      A8719RlrTrCod = "" ;
      AV41Clave1 = "" ;
      AV42Valor1 = "" ;
      A12847RlrFchA1 = "" ;
      A12845Clave1 = "" ;
      AV43Clave2 = "" ;
      AV44Valor2 = "" ;
      A12848RlrFchE1 = "" ;
      A12846Clave2 = "" ;
      Gx_emsg = "" ;
      AV26fechaA = GXutil.resetTime( GXutil.nullDate() );
      AV27fechaC = GXutil.resetTime( GXutil.nullDate() );
      P05J95_A396EmprCod = new String[] {""} ;
      P05J95_n396EmprCod = new boolean[] {false} ;
      P05J95_A942TermCod = new String[] {""} ;
      P05J95_A1189TermUsu = new String[] {""} ;
      P05J95_n1189TermUsu = new boolean[] {false} ;
      P05J95_A407EmprNom = new String[] {""} ;
      P05J95_n407EmprNom = new boolean[] {false} ;
      P05J97_A12848RlrFchE1 = new String[] {""} ;
      P05J97_n12848RlrFchE1 = new boolean[] {false} ;
      P05J97_A12847RlrFchA1 = new String[] {""} ;
      P05J97_n12847RlrFchA1 = new boolean[] {false} ;
      P05J97_A12846Clave2 = new String[] {""} ;
      P05J97_n12846Clave2 = new boolean[] {false} ;
      P05J97_A12845Clave1 = new String[] {""} ;
      P05J97_n12845Clave1 = new boolean[] {false} ;
      P05J97_A8722RlrRnd = new short[1] ;
      P05J97_n8722RlrRnd = new boolean[] {false} ;
      P05J97_A8721RlrDiaDif = new short[1] ;
      P05J97_n8721RlrDiaDif = new boolean[] {false} ;
      P05J97_A8720RlrDia = new short[1] ;
      P05J97_n8720RlrDia = new boolean[] {false} ;
      P05J97_A8719RlrTrCod = new String[] {""} ;
      P05J97_n8719RlrTrCod = new boolean[] {false} ;
      P05J97_A8718RlrPgm = new String[] {""} ;
      P05J97_n8718RlrPgm = new boolean[] {false} ;
      P05J97_A8717RlrFchE = new java.util.Date[] {GXutil.nullDate()} ;
      P05J97_n8717RlrFchE = new boolean[] {false} ;
      P05J97_A8716RlrFchA = new java.util.Date[] {GXutil.nullDate()} ;
      P05J97_n8716RlrFchA = new boolean[] {false} ;
      P05J97_A8715RlrUsu = new String[] {""} ;
      P05J97_A8714RlrFch = new java.util.Date[] {GXutil.nullDate()} ;
      P05J98_A396EmprCod = new String[] {""} ;
      P05J98_n396EmprCod = new boolean[] {false} ;
      P05J98_A942TermCod = new String[] {""} ;
      P05J98_A1189TermUsu = new String[] {""} ;
      P05J98_n1189TermUsu = new boolean[] {false} ;
      P05J98_A407EmprNom = new String[] {""} ;
      P05J98_n407EmprNom = new boolean[] {false} ;
      W8714RlrFch = GXutil.resetTime( GXutil.nullDate() );
      W8715RlrUsu = "" ;
      W8716RlrFchA = GXutil.nullDate() ;
      W8717RlrFchE = GXutil.nullDate() ;
      W8718RlrPgm = "" ;
      W8719RlrTrCod = "" ;
      W12847RlrFchA1 = "" ;
      W12845Clave1 = "" ;
      W12848RlrFchE1 = "" ;
      W12846Clave2 = "" ;
      P05J910_A12848RlrFchE1 = new String[] {""} ;
      P05J910_n12848RlrFchE1 = new boolean[] {false} ;
      P05J910_A12847RlrFchA1 = new String[] {""} ;
      P05J910_n12847RlrFchA1 = new boolean[] {false} ;
      P05J910_A12846Clave2 = new String[] {""} ;
      P05J910_n12846Clave2 = new boolean[] {false} ;
      P05J910_A12845Clave1 = new String[] {""} ;
      P05J910_n12845Clave1 = new boolean[] {false} ;
      P05J910_A8722RlrRnd = new short[1] ;
      P05J910_n8722RlrRnd = new boolean[] {false} ;
      P05J910_A8721RlrDiaDif = new short[1] ;
      P05J910_n8721RlrDiaDif = new boolean[] {false} ;
      P05J910_A8720RlrDia = new short[1] ;
      P05J910_n8720RlrDia = new boolean[] {false} ;
      P05J910_A8719RlrTrCod = new String[] {""} ;
      P05J910_n8719RlrTrCod = new boolean[] {false} ;
      P05J910_A8718RlrPgm = new String[] {""} ;
      P05J910_n8718RlrPgm = new boolean[] {false} ;
      P05J910_A8717RlrFchE = new java.util.Date[] {GXutil.nullDate()} ;
      P05J910_n8717RlrFchE = new boolean[] {false} ;
      P05J910_A8716RlrFchA = new java.util.Date[] {GXutil.nullDate()} ;
      P05J910_n8716RlrFchA = new boolean[] {false} ;
      P05J910_A8715RlrUsu = new String[] {""} ;
      P05J910_A8714RlrFch = new java.util.Date[] {GXutil.nullDate()} ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      P05J911_A396EmprCod = new String[] {""} ;
      P05J911_n396EmprCod = new boolean[] {false} ;
      P05J911_A942TermCod = new String[] {""} ;
      P05J911_A1189TermUsu = new String[] {""} ;
      P05J911_n1189TermUsu = new boolean[] {false} ;
      P05J911_A407EmprNom = new String[] {""} ;
      P05J911_n407EmprNom = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewlicrnd__default(),
         new Object[] {
             new Object[] {
            P05J92_A4103LicPrdId, P05J92_A4104LicPrdDat
            }
            , new Object[] {
            P05J93_A396EmprCod, P05J93_n396EmprCod, P05J93_A942TermCod, P05J93_A1189TermUsu, P05J93_n1189TermUsu, P05J93_A407EmprNom, P05J93_n407EmprNom
            }
            , new Object[] {
            }
            , new Object[] {
            P05J95_A396EmprCod, P05J95_n396EmprCod, P05J95_A942TermCod, P05J95_A1189TermUsu, P05J95_n1189TermUsu, P05J95_A407EmprNom, P05J95_n407EmprNom
            }
            , new Object[] {
            }
            , new Object[] {
            P05J97_A12848RlrFchE1, P05J97_n12848RlrFchE1, P05J97_A12847RlrFchA1, P05J97_n12847RlrFchA1, P05J97_A12846Clave2, P05J97_n12846Clave2, P05J97_A12845Clave1, P05J97_n12845Clave1, P05J97_A8722RlrRnd, P05J97_n8722RlrRnd,
            P05J97_A8721RlrDiaDif, P05J97_n8721RlrDiaDif, P05J97_A8720RlrDia, P05J97_n8720RlrDia, P05J97_A8719RlrTrCod, P05J97_n8719RlrTrCod, P05J97_A8718RlrPgm, P05J97_n8718RlrPgm, P05J97_A8717RlrFchE, P05J97_n8717RlrFchE,
            P05J97_A8716RlrFchA, P05J97_n8716RlrFchA, P05J97_A8715RlrUsu, P05J97_A8714RlrFch
            }
            , new Object[] {
            P05J98_A396EmprCod, P05J98_n396EmprCod, P05J98_A942TermCod, P05J98_A1189TermUsu, P05J98_n1189TermUsu, P05J98_A407EmprNom, P05J98_n407EmprNom
            }
            , new Object[] {
            }
            , new Object[] {
            P05J910_A12848RlrFchE1, P05J910_n12848RlrFchE1, P05J910_A12847RlrFchA1, P05J910_n12847RlrFchA1, P05J910_A12846Clave2, P05J910_n12846Clave2, P05J910_A12845Clave1, P05J910_n12845Clave1, P05J910_A8722RlrRnd, P05J910_n8722RlrRnd,
            P05J910_A8721RlrDiaDif, P05J910_n8721RlrDiaDif, P05J910_A8720RlrDia, P05J910_n8720RlrDia, P05J910_A8719RlrTrCod, P05J910_n8719RlrTrCod, P05J910_A8718RlrPgm, P05J910_n8718RlrPgm, P05J910_A8717RlrFchE, P05J910_n8717RlrFchE,
            P05J910_A8716RlrFchA, P05J910_n8716RlrFchA, P05J910_A8715RlrUsu, P05J910_A8714RlrFch
            }
            , new Object[] {
            P05J911_A396EmprCod, P05J911_n396EmprCod, P05J911_A942TermCod, P05J911_A1189TermUsu, P05J911_n1189TermUsu, P05J911_A407EmprNom, P05J911_n407EmprNom
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24Error ;
   private byte AV28dia ;
   private short A8720RlrDia ;
   private short A8721RlrDiaDif ;
   private short A8722RlrRnd ;
   private short Gx_err ;
   private short AV29diaDif ;
   private short W8720RlrDia ;
   private short W8721RlrDiaDif ;
   private short W8722RlrRnd ;
   private int GX_INS1190 ;
   private int GX_I ;
   private long AV31rnd ;
   private String AV32LicPrdId ;
   private String scmdbuf ;
   private String A4103LicPrdId ;
   private String A4104LicPrdDat ;
   private String AV30LicPar[] ;
   private String AV45Fecalfa ;
   private String AV38Station ;
   private String A396EmprCod ;
   private String A942TermCod ;
   private String A1189TermUsu ;
   private String A407EmprNom ;
   private String AV36UsurCod ;
   private String AV35EmprNom ;
   private String AV46RlrTrCod ;
   private String A8715RlrUsu ;
   private String A8719RlrTrCod ;
   private String AV41Clave1 ;
   private String AV42Valor1 ;
   private String A12847RlrFchA1 ;
   private String A12845Clave1 ;
   private String AV43Clave2 ;
   private String AV44Valor2 ;
   private String A12848RlrFchE1 ;
   private String A12846Clave2 ;
   private String Gx_emsg ;
   private String W8715RlrUsu ;
   private String W8719RlrTrCod ;
   private String W12847RlrFchA1 ;
   private String W12845Clave1 ;
   private String W12848RlrFchE1 ;
   private String W12846Clave2 ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private java.util.Date A8714RlrFch ;
   private java.util.Date AV26fechaA ;
   private java.util.Date AV27fechaC ;
   private java.util.Date W8714RlrFch ;
   private java.util.Date AV25fecha ;
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
   private boolean n12847RlrFchA1 ;
   private boolean n12845Clave1 ;
   private boolean n12848RlrFchE1 ;
   private boolean n12846Clave2 ;
   private String AV37RlrPgm ;
   private String A8718RlrPgm ;
   private String W8718RlrPgm ;
   private byte[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P05J92_A4103LicPrdId ;
   private String[] P05J92_A4104LicPrdDat ;
   private String[] P05J93_A396EmprCod ;
   private boolean[] P05J93_n396EmprCod ;
   private String[] P05J93_A942TermCod ;
   private String[] P05J93_A1189TermUsu ;
   private boolean[] P05J93_n1189TermUsu ;
   private String[] P05J93_A407EmprNom ;
   private boolean[] P05J93_n407EmprNom ;
   private String[] P05J95_A396EmprCod ;
   private boolean[] P05J95_n396EmprCod ;
   private String[] P05J95_A942TermCod ;
   private String[] P05J95_A1189TermUsu ;
   private boolean[] P05J95_n1189TermUsu ;
   private String[] P05J95_A407EmprNom ;
   private boolean[] P05J95_n407EmprNom ;
   private String[] P05J97_A12848RlrFchE1 ;
   private boolean[] P05J97_n12848RlrFchE1 ;
   private String[] P05J97_A12847RlrFchA1 ;
   private boolean[] P05J97_n12847RlrFchA1 ;
   private String[] P05J97_A12846Clave2 ;
   private boolean[] P05J97_n12846Clave2 ;
   private String[] P05J97_A12845Clave1 ;
   private boolean[] P05J97_n12845Clave1 ;
   private short[] P05J97_A8722RlrRnd ;
   private boolean[] P05J97_n8722RlrRnd ;
   private short[] P05J97_A8721RlrDiaDif ;
   private boolean[] P05J97_n8721RlrDiaDif ;
   private short[] P05J97_A8720RlrDia ;
   private boolean[] P05J97_n8720RlrDia ;
   private String[] P05J97_A8719RlrTrCod ;
   private boolean[] P05J97_n8719RlrTrCod ;
   private String[] P05J97_A8718RlrPgm ;
   private boolean[] P05J97_n8718RlrPgm ;
   private java.util.Date[] P05J97_A8717RlrFchE ;
   private boolean[] P05J97_n8717RlrFchE ;
   private java.util.Date[] P05J97_A8716RlrFchA ;
   private boolean[] P05J97_n8716RlrFchA ;
   private String[] P05J97_A8715RlrUsu ;
   private java.util.Date[] P05J97_A8714RlrFch ;
   private String[] P05J98_A396EmprCod ;
   private boolean[] P05J98_n396EmprCod ;
   private String[] P05J98_A942TermCod ;
   private String[] P05J98_A1189TermUsu ;
   private boolean[] P05J98_n1189TermUsu ;
   private String[] P05J98_A407EmprNom ;
   private boolean[] P05J98_n407EmprNom ;
   private String[] P05J910_A12848RlrFchE1 ;
   private boolean[] P05J910_n12848RlrFchE1 ;
   private String[] P05J910_A12847RlrFchA1 ;
   private boolean[] P05J910_n12847RlrFchA1 ;
   private String[] P05J910_A12846Clave2 ;
   private boolean[] P05J910_n12846Clave2 ;
   private String[] P05J910_A12845Clave1 ;
   private boolean[] P05J910_n12845Clave1 ;
   private short[] P05J910_A8722RlrRnd ;
   private boolean[] P05J910_n8722RlrRnd ;
   private short[] P05J910_A8721RlrDiaDif ;
   private boolean[] P05J910_n8721RlrDiaDif ;
   private short[] P05J910_A8720RlrDia ;
   private boolean[] P05J910_n8720RlrDia ;
   private String[] P05J910_A8719RlrTrCod ;
   private boolean[] P05J910_n8719RlrTrCod ;
   private String[] P05J910_A8718RlrPgm ;
   private boolean[] P05J910_n8718RlrPgm ;
   private java.util.Date[] P05J910_A8717RlrFchE ;
   private boolean[] P05J910_n8717RlrFchE ;
   private java.util.Date[] P05J910_A8716RlrFchA ;
   private boolean[] P05J910_n8716RlrFchA ;
   private String[] P05J910_A8715RlrUsu ;
   private java.util.Date[] P05J910_A8714RlrFch ;
   private String[] P05J911_A396EmprCod ;
   private boolean[] P05J911_n396EmprCod ;
   private String[] P05J911_A942TermCod ;
   private String[] P05J911_A1189TermUsu ;
   private boolean[] P05J911_n1189TermUsu ;
   private String[] P05J911_A407EmprNom ;
   private boolean[] P05J911_n407EmprNom ;
}

final  class pnewlicrnd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05J92", "SELECT LicPrdId, LicPrdDat FROM TXPLICPRD WHERE LicPrdId = ? ORDER BY LicPrdId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05J93", "SELECT T1.EmprCod, T1.TermCod, T1.TermUsu, T2.EmprNom FROM (TXPTERMIN T1 LEFT JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.TermCod = ? ORDER BY T1.TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05J94", "INSERT INTO TXPRLICRN(RlrFch, RlrUsu, RlrFchA, RlrFchE, RlrPgm, RlrTrCod, RlrDia, RlrDiaDif, RlrRnd, Clave1, Clave2, RlrFchA1, RlrFchE1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRLICRN")
         ,new ForEachCursor("P05J95", "SELECT T1.EmprCod, T1.TermCod, T1.TermUsu, T2.EmprNom FROM (TXPTERMIN T1 LEFT JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.TermCod = ? ORDER BY T1.TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05J96", "INSERT INTO TXPRLICRN(RlrFch, RlrUsu, RlrFchA, RlrFchE, RlrPgm, RlrTrCod, RlrDia, RlrDiaDif, RlrRnd, Clave1, Clave2, RlrFchA1, RlrFchE1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRLICRN")
         ,new ForEachCursor("P05J97", "SELECT RlrFchE1, RlrFchA1, Clave2, Clave1, RlrRnd, RlrDiaDif, RlrDia, RlrTrCod, RlrPgm, RlrFchE, RlrFchA, RlrUsu, RlrFch FROM TXPRLICRN ORDER BY RlrFchE1, RlrFch ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05J98", "SELECT T1.EmprCod, T1.TermCod, T1.TermUsu, T2.EmprNom FROM (TXPTERMIN T1 LEFT JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.TermCod = ? ORDER BY T1.TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05J99", "INSERT INTO TXPRLICRN(RlrFch, RlrUsu, RlrFchA, RlrFchE, RlrPgm, RlrTrCod, RlrDia, RlrDiaDif, RlrRnd, Clave1, Clave2, RlrFchA1, RlrFchE1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRLICRN")
         ,new ForEachCursor("P05J910", "SELECT RlrFchE1, RlrFchA1, Clave2, Clave1, RlrRnd, RlrDiaDif, RlrDia, RlrTrCod, RlrPgm, RlrFchE, RlrFchA, RlrUsu, RlrFch FROM TXPRLICRN ORDER BY RlrFchA1, RlrFchE1, RlrFch ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05J911", "SELECT T1.EmprCod, T1.TermCod, T1.TermUsu, T2.EmprNom FROM (TXPTERMIN T1 LEFT JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.TermCod = ? ORDER BY T1.TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05J912", "INSERT INTO TXPRLICRN(RlrFch, RlrUsu, RlrFchA, RlrFchE, RlrPgm, RlrTrCod, RlrDia, RlrDiaDif, RlrRnd, Clave1, Clave2, RlrFchA1, RlrFchE1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRLICRN")
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
               ((String[]) buf[0])[0] = rslt.getString(1, 32);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 32);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 32);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 32);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 8);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 32);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 32);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 32);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 32);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 8);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13);
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

