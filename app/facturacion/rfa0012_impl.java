package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rfa0012_impl extends GXWebReport
{
   public rfa0012_impl( com.genexus.internet.HttpContext context )
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
            AV51Forblo = httpContext.GetPar( "Forblo") ;
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
         GXv_int1[0] = AV49FecAnt ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FECANT", ""), GXv_int1) ;
         rfa0012_impl.this.AV49FecAnt = GXv_int1[0] ;
         GXt_char2 = AV32Lit0 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN068_", ""), (byte)(99), GXv_char3) ;
         rfa0012_impl.this.GXt_char2 = GXv_char3[0] ;
         AV32Lit0 = GXt_char2 ;
         GXt_char2 = AV33Lit1 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
         rfa0012_impl.this.GXt_char2 = GXv_char3[0] ;
         AV33Lit1 = GXt_char2 ;
         GXt_char2 = AV34Lit2 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char3) ;
         rfa0012_impl.this.GXt_char2 = GXv_char3[0] ;
         AV34Lit2 = GXt_char2 ;
         GXt_char2 = AV35Lit3 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char3) ;
         rfa0012_impl.this.GXt_char2 = GXv_char3[0] ;
         AV35Lit3 = GXt_char2 ;
         GXt_char2 = AV36Lit4 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char3) ;
         rfa0012_impl.this.GXt_char2 = GXv_char3[0] ;
         AV36Lit4 = GXt_char2 ;
         GXt_char2 = AV37Lit5 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1355_", ""), (byte)(99), GXv_char3) ;
         rfa0012_impl.this.GXt_char2 = GXv_char3[0] ;
         AV37Lit5 = GXt_char2 ;
         GXt_char2 = AV38Lit6 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN387_", ""), (byte)(99), GXv_char3) ;
         rfa0012_impl.this.GXt_char2 = GXv_char3[0] ;
         AV38Lit6 = GXt_char2 ;
         GXt_char2 = AV39Lit7 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN437_", ""), (byte)(99), GXv_char3) ;
         rfa0012_impl.this.GXt_char2 = GXv_char3[0] ;
         AV39Lit7 = GXt_char2 ;
         GXt_char2 = AV40Lit8 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1519_", ""), (byte)(99), GXv_char3) ;
         rfa0012_impl.this.GXt_char2 = GXv_char3[0] ;
         AV40Lit8 = GXt_char2 ;
         GXt_char2 = AV41Lit9 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1518_", ""), (byte)(99), GXv_char3) ;
         rfa0012_impl.this.GXt_char2 = GXv_char3[0] ;
         AV41Lit9 = GXt_char2 ;
         GXt_char2 = AV42Lit10 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1209_", ""), (byte)(99), GXv_char3) ;
         rfa0012_impl.this.GXt_char2 = GXv_char3[0] ;
         AV42Lit10 = GXt_char2 ;
         GXt_char2 = AV43Lit11 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char3) ;
         rfa0012_impl.this.GXt_char2 = GXv_char3[0] ;
         AV43Lit11 = GXt_char2 ;
         GXt_char2 = AV46Lit13 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1193_", ""), (byte)(99), GXv_char3) ;
         rfa0012_impl.this.GXt_char2 = GXv_char3[0] ;
         AV46Lit13 = GXt_char2 ;
         GXt_char2 = AV45Lit12 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "RFA0012", ""), (byte)(99), GXv_char3) ;
         rfa0012_impl.this.GXt_char2 = GXv_char3[0] ;
         AV45Lit12 = GXt_char2 ;
         if ( GXutil.strcmp(AV45Lit12, httpContext.getMessage( "RFA0012", "")) == 0 )
         {
            AV45Lit12 = httpContext.getMessage( "LISTADO PRECIOS POR COLOR", "") ;
         }
         AV48Lit14 = " " ;
         if ( AV49FecAnt == 1 )
         {
            GXt_char2 = AV48Lit14 ;
            GXv_char3[0] = GXt_char2 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
            rfa0012_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48Lit14 = GXt_char2 ;
         }
         /* Using cursor P06MU2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06MU2_A407EmprNom[0] ;
            n407EmprNom = P06MU2_n407EmprNom[0] ;
            AV24NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
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
                                              Integer.valueOf(A252CliCod) ,
                                              A494ForSer ,
                                              Integer.valueOf(A483ForColNum) ,
                                              A482ForColNom ,
                                              A7781ForBlo ,
                                              AV51Forblo ,
                                              A10045CliAct ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor P06MU3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV51Forblo, AV51Forblo, Integer.valueOf(AV16PCliCod), Integer.valueOf(AV17UCliCod), AV18PSerie, AV19USerie, Integer.valueOf(AV20PColor), Integer.valueOf(AV21UColor), AV22PNumCol, AV23UNumCol});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6MU3 = false ;
            A584IntDsc = P06MU3_A584IntDsc[0] ;
            n584IntDsc = P06MU3_n584IntDsc[0] ;
            A3585ForPreFec = P06MU3_A3585ForPreFec[0] ;
            n3585ForPreFec = P06MU3_n3585ForPreFec[0] ;
            A492ForPreKgm = P06MU3_A492ForPreKgm[0] ;
            n492ForPreKgm = P06MU3_n492ForPreKgm[0] ;
            A493ForPreMtr = P06MU3_A493ForPreMtr[0] ;
            n493ForPreMtr = P06MU3_n493ForPreMtr[0] ;
            A7781ForBlo = P06MU3_A7781ForBlo[0] ;
            n7781ForBlo = P06MU3_n7781ForBlo[0] ;
            A494ForSer = P06MU3_A494ForSer[0] ;
            A279CliNom = P06MU3_A279CliNom[0] ;
            A252CliCod = P06MU3_A252CliCod[0] ;
            A583IntCod = P06MU3_A583IntCod[0] ;
            A831TipColCod = P06MU3_A831TipColCod[0] ;
            A483ForColNum = P06MU3_A483ForColNum[0] ;
            A482ForColNom = P06MU3_A482ForColNom[0] ;
            A10045CliAct = P06MU3_A10045CliAct[0] ;
            A279CliNom = P06MU3_A279CliNom[0] ;
            A10045CliAct = P06MU3_A10045CliAct[0] ;
            A584IntDsc = P06MU3_A584IntDsc[0] ;
            n584IntDsc = P06MU3_n584IntDsc[0] ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A492ForPreKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A493ForPreMtr)==0) )
            {
            }
            else
            {
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06MU3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06MU3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P06MU3_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(P06MU3_A482ForColNom[0], A482ForColNom) == 0 ) )
               {
                  if ( ! ( ( P06MU3_A483ForColNum[0] == A483ForColNum ) && ( P06MU3_A831TipColCod[0] == A831TipColCod ) ) )
                  {
                     if (true) break;
                  }
                  brk6MU3 = false ;
                  A584IntDsc = P06MU3_A584IntDsc[0] ;
                  n584IntDsc = P06MU3_n584IntDsc[0] ;
                  A3585ForPreFec = P06MU3_A3585ForPreFec[0] ;
                  n3585ForPreFec = P06MU3_n3585ForPreFec[0] ;
                  A492ForPreKgm = P06MU3_A492ForPreKgm[0] ;
                  n492ForPreKgm = P06MU3_n492ForPreKgm[0] ;
                  A493ForPreMtr = P06MU3_A493ForPreMtr[0] ;
                  n493ForPreMtr = P06MU3_n493ForPreMtr[0] ;
                  A7781ForBlo = P06MU3_A7781ForBlo[0] ;
                  n7781ForBlo = P06MU3_n7781ForBlo[0] ;
                  A279CliNom = P06MU3_A279CliNom[0] ;
                  A583IntCod = P06MU3_A583IntCod[0] ;
                  A279CliNom = P06MU3_A279CliNom[0] ;
                  A584IntDsc = P06MU3_A584IntDsc[0] ;
                  n584IntDsc = P06MU3_n584IntDsc[0] ;
                  AV47IntDsc = GXutil.substring( A584IntDsc, 1, 15) ;
                  AV50FecPrecio = " " ;
                  if ( AV49FecAnt == 1 )
                  {
                     AV50FecPrecio = localUtil.dtoc( A3585ForPreFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                  }
                  AV52preciokg = A492ForPreKgm ;
                  AV53preciomt = A493ForPreMtr ;
                  h6MU0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 414, Gx_line+0, 510, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 521, Gx_line+0, 566, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 576, Gx_line+0, 592, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9")), 602, Gx_line+0, 618, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 9, Gx_line+0, 54, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 60, Gx_line+0, 280, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A494ForSer, "")), 285, Gx_line+0, 403, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47IntDsc, "")), 622, Gx_line+0, 732, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50FecPrecio, "")), 925, Gx_line+0, 984, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7781ForBlo, "@!")), 1100, Gx_line+0, 1108, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV52preciokg, "ZZZZZ9.99")), 760, Gx_line+0, 827, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53preciomt, "ZZZZZ9.99")), 842, Gx_line+0, 909, Gx_line+16, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  /* Using cursor P06MU4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
                  while ( (pr_default.getStatus(2) != 101) )
                  {
                     A1522RecCanRec = P06MU4_A1522RecCanRec[0] ;
                     n1522RecCanRec = P06MU4_n1522RecCanRec[0] ;
                     A1521RecValFin = P06MU4_A1521RecValFin[0] ;
                     n1521RecValFin = P06MU4_n1521RecValFin[0] ;
                     A1520RecValIni = P06MU4_A1520RecValIni[0] ;
                     n1520RecValIni = P06MU4_n1520RecValIni[0] ;
                     A1519RecCorLin = P06MU4_A1519RecCorLin[0] ;
                     AV54recargo = A1522RecCanRec ;
                     h6MU0( false, 16) ;
                     getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText("-", 956, Gx_line+0, 964, Gx_line+15, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1520RecValIni), "ZZZZZZZ9")), 867, Gx_line+0, 926, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1521RecValFin), "ZZZZZZZ9")), 938, Gx_line+0, 997, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54recargo, "ZZZZZ9.99")), 1019, Gx_line+0, 1086, Gx_line+16, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+16) ;
                     pr_default.readNext(2);
                  }
                  pr_default.close(2);
                  brk6MU3 = true ;
                  pr_default.readNext(1);
               }
            }
            if ( ! brk6MU3 )
            {
               brk6MU3 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6MU0( true, 0) ;
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

   public void h6MU0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24NomEmp, "")), 5, Gx_line+6, 194, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit1, "")), 806, Gx_line+6, 856, Gx_line+22, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 877, Gx_line+6, 936, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit2, "")), 967, Gx_line+4, 1018, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 1026, Gx_line+3, 1085, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit3, "")), 967, Gx_line+30, 1021, Gx_line+46, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1034, Gx_line+28, 1079, Gx_line+45, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit6, "")), 414, Gx_line+70, 467, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit12, "")), 5, Gx_line+30, 194, Gx_line+48, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(2, Gx_line+58, 1108, Gx_line+58, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(2, Gx_line+92, 1083, Gx_line+92, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit8, "")), 753, Gx_line+70, 827, Gx_line+86, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit10, "")), 976, Gx_line+70, 1013, Gx_line+86, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit11, "")), 1034, Gx_line+70, 1086, Gx_line+86, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit9, "")), 835, Gx_line+70, 909, Gx_line+86, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 576, Gx_line+70, 590, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit13, "")), 602, Gx_line+70, 660, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit4, "")), 9, Gx_line+70, 90, Gx_line+84, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit5, "")), 285, Gx_line+70, 343, Gx_line+84, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit14, "")), 938, Gx_line+70, 971, Gx_line+85, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Pgmname, "")), 600, Gx_line+33, 757, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "B?", ""), 1100, Gx_line+70, 1116, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(1100, Gx_line+92, 1116, Gx_line+92, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+98) ;
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
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV51Forblo = "" ;
      GXv_int1 = new byte[1] ;
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
      AV46Lit13 = "" ;
      AV45Lit12 = "" ;
      AV48Lit14 = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P06MU2_A396EmprCod = new String[] {""} ;
      P06MU2_A407EmprNom = new String[] {""} ;
      P06MU2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV24NomEmp = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A7781ForBlo = "" ;
      A10045CliAct = "" ;
      P06MU3_A396EmprCod = new String[] {""} ;
      P06MU3_A584IntDsc = new String[] {""} ;
      P06MU3_n584IntDsc = new boolean[] {false} ;
      P06MU3_A3585ForPreFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06MU3_n3585ForPreFec = new boolean[] {false} ;
      P06MU3_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06MU3_n492ForPreKgm = new boolean[] {false} ;
      P06MU3_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06MU3_n493ForPreMtr = new boolean[] {false} ;
      P06MU3_A7781ForBlo = new String[] {""} ;
      P06MU3_n7781ForBlo = new boolean[] {false} ;
      P06MU3_A494ForSer = new String[] {""} ;
      P06MU3_A279CliNom = new String[] {""} ;
      P06MU3_A252CliCod = new int[1] ;
      P06MU3_A583IntCod = new byte[1] ;
      P06MU3_A831TipColCod = new byte[1] ;
      P06MU3_A483ForColNum = new int[1] ;
      P06MU3_A482ForColNom = new String[] {""} ;
      P06MU3_A10045CliAct = new String[] {""} ;
      A584IntDsc = "" ;
      A3585ForPreFec = GXutil.nullDate() ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      AV47IntDsc = "" ;
      AV50FecPrecio = "" ;
      AV52preciokg = DecimalUtil.ZERO ;
      AV53preciomt = DecimalUtil.ZERO ;
      P06MU4_A396EmprCod = new String[] {""} ;
      P06MU4_A252CliCod = new int[1] ;
      P06MU4_A494ForSer = new String[] {""} ;
      P06MU4_A482ForColNom = new String[] {""} ;
      P06MU4_A483ForColNum = new int[1] ;
      P06MU4_A831TipColCod = new byte[1] ;
      P06MU4_A1522RecCanRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06MU4_n1522RecCanRec = new boolean[] {false} ;
      P06MU4_A1521RecValFin = new int[1] ;
      P06MU4_n1521RecValFin = new boolean[] {false} ;
      P06MU4_A1520RecValIni = new int[1] ;
      P06MU4_n1520RecValIni = new boolean[] {false} ;
      P06MU4_A1519RecCorLin = new byte[1] ;
      A1522RecCanRec = DecimalUtil.ZERO ;
      AV54recargo = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV62Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.rfa0012__default(),
         new Object[] {
             new Object[] {
            P06MU2_A396EmprCod, P06MU2_A407EmprNom, P06MU2_n407EmprNom
            }
            , new Object[] {
            P06MU3_A396EmprCod, P06MU3_A584IntDsc, P06MU3_n584IntDsc, P06MU3_A3585ForPreFec, P06MU3_n3585ForPreFec, P06MU3_A492ForPreKgm, P06MU3_n492ForPreKgm, P06MU3_A493ForPreMtr, P06MU3_n493ForPreMtr, P06MU3_A7781ForBlo,
            P06MU3_n7781ForBlo, P06MU3_A494ForSer, P06MU3_A279CliNom, P06MU3_A252CliCod, P06MU3_A583IntCod, P06MU3_A831TipColCod, P06MU3_A483ForColNum, P06MU3_A482ForColNom, P06MU3_A10045CliAct
            }
            , new Object[] {
            P06MU4_A396EmprCod, P06MU4_A252CliCod, P06MU4_A494ForSer, P06MU4_A482ForColNom, P06MU4_A483ForColNum, P06MU4_A831TipColCod, P06MU4_A1522RecCanRec, P06MU4_n1522RecCanRec, P06MU4_A1521RecValFin, P06MU4_n1521RecValFin,
            P06MU4_A1520RecValIni, P06MU4_n1520RecValIni, P06MU4_A1519RecCorLin
            }
         }
      );
      AV62Pgmname = "Facturacion.RFA0012" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV62Pgmname = "Facturacion.RFA0012" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV49FecAnt ;
   private byte GXv_int1[] ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte A1519RecCorLin ;
   private short gxcookieaux ;
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
   private int A252CliCod ;
   private int A483ForColNum ;
   private int Gx_OldLine ;
   private int A1521RecValFin ;
   private int A1520RecValIni ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A493ForPreMtr ;
   private java.math.BigDecimal AV52preciokg ;
   private java.math.BigDecimal AV53preciomt ;
   private java.math.BigDecimal A1522RecCanRec ;
   private java.math.BigDecimal AV54recargo ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV18PSerie ;
   private String AV19USerie ;
   private String AV22PNumCol ;
   private String AV23UNumCol ;
   private String AV51Forblo ;
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
   private String AV46Lit13 ;
   private String AV45Lit12 ;
   private String AV48Lit14 ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV24NomEmp ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A7781ForBlo ;
   private String A10045CliAct ;
   private String A584IntDsc ;
   private String A279CliNom ;
   private String AV47IntDsc ;
   private String AV50FecPrecio ;
   private String Gx_time ;
   private String AV62Pgmname ;
   private java.util.Date A3585ForPreFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean brk6MU3 ;
   private boolean n584IntDsc ;
   private boolean n3585ForPreFec ;
   private boolean n492ForPreKgm ;
   private boolean n493ForPreMtr ;
   private boolean n7781ForBlo ;
   private boolean n1522RecCanRec ;
   private boolean n1521RecValFin ;
   private boolean n1520RecValIni ;
   private IDataStoreProvider pr_default ;
   private String[] P06MU2_A396EmprCod ;
   private String[] P06MU2_A407EmprNom ;
   private boolean[] P06MU2_n407EmprNom ;
   private String[] P06MU3_A396EmprCod ;
   private String[] P06MU3_A584IntDsc ;
   private boolean[] P06MU3_n584IntDsc ;
   private java.util.Date[] P06MU3_A3585ForPreFec ;
   private boolean[] P06MU3_n3585ForPreFec ;
   private java.math.BigDecimal[] P06MU3_A492ForPreKgm ;
   private boolean[] P06MU3_n492ForPreKgm ;
   private java.math.BigDecimal[] P06MU3_A493ForPreMtr ;
   private boolean[] P06MU3_n493ForPreMtr ;
   private String[] P06MU3_A7781ForBlo ;
   private boolean[] P06MU3_n7781ForBlo ;
   private String[] P06MU3_A494ForSer ;
   private String[] P06MU3_A279CliNom ;
   private int[] P06MU3_A252CliCod ;
   private byte[] P06MU3_A583IntCod ;
   private byte[] P06MU3_A831TipColCod ;
   private int[] P06MU3_A483ForColNum ;
   private String[] P06MU3_A482ForColNom ;
   private String[] P06MU3_A10045CliAct ;
   private String[] P06MU4_A396EmprCod ;
   private int[] P06MU4_A252CliCod ;
   private String[] P06MU4_A494ForSer ;
   private String[] P06MU4_A482ForColNom ;
   private int[] P06MU4_A483ForColNum ;
   private byte[] P06MU4_A831TipColCod ;
   private java.math.BigDecimal[] P06MU4_A1522RecCanRec ;
   private boolean[] P06MU4_n1522RecCanRec ;
   private int[] P06MU4_A1521RecValFin ;
   private boolean[] P06MU4_n1521RecValFin ;
   private int[] P06MU4_A1520RecValIni ;
   private boolean[] P06MU4_n1520RecValIni ;
   private byte[] P06MU4_A1519RecCorLin ;
}

final  class rfa0012__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P06MU3( ModelContext context ,
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
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          int A483ForColNum ,
                                          String A482ForColNom ,
                                          String A7781ForBlo ,
                                          String AV51Forblo ,
                                          String A10045CliAct ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[11];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.IntDsc, T1.ForPreFec, T1.ForPreKgm, T1.ForPreMtr, T1.ForBlo, T1.ForSer, T2.CliNom, T1.CliCod, T1.IntCod, T1.TipColCod, T1.ForColNum, T1.ForColNom," ;
      scmdbuf += " T2.CliAct FROM ((TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T3.IntCod = T1.IntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ForBlo = ? or ? = 'T')");
      addWhere(sWhereString, "(T2.CliAct = 'S')");
      if ( ! (0==AV16PCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV17UCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18PSerie)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19USerie)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV20PColor) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV21UColor) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22PNumCol)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23UNumCol)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
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
                  return conditional_P06MU3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06MU2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06MU3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06MU4", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCanRec, RecValFin, RecValIni, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 16);
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((String[]) buf[17])[0] = rslt.getString(13, 13);
               ((String[]) buf[18])[0] = rslt.getString(14, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
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
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 13);
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
      }
   }

}

