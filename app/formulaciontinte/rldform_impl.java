package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rldform_impl extends GXWebReport
{
   public rldform_impl( com.genexus.internet.HttpContext context )
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
            AV49tc1 = (byte)(GXutil.lval( httpContext.GetPar( "tc1"))) ;
            AV50tc2 = (byte)(GXutil.lval( httpContext.GetPar( "tc2"))) ;
            AV47PForNumCol = (int)(GXutil.lval( httpContext.GetPar( "PForNumCol"))) ;
            AV48UForNumCol = (int)(GXutil.lval( httpContext.GetPar( "UForNumCol"))) ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
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
         rldform_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit0 = GXt_char1 ;
         GXt_char1 = AV33Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rldform_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit1 = GXt_char1 ;
         GXt_char1 = AV34Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rldform_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit2 = GXt_char1 ;
         GXt_char1 = AV35Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rldform_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit3 = GXt_char1 ;
         GXt_char1 = AV36Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN068_", ""), (byte)(99), GXv_char2) ;
         rldform_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit4 = GXt_char1 ;
         GXt_char1 = AV37Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
         rldform_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit5 = GXt_char1 ;
         GXt_char1 = AV38Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
         rldform_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit6 = GXt_char1 ;
         GXt_char1 = AV39Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         rldform_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit7 = GXt_char1 ;
         GXt_char1 = AV40Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT40_", ""), (byte)(99), GXv_char2) ;
         rldform_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit8 = GXt_char1 ;
         GXt_char1 = AV41Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1327_", ""), (byte)(99), GXv_char2) ;
         rldform_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit9 = GXt_char1 ;
         GXt_char1 = AV42Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT408_", ""), (byte)(99), GXv_char2) ;
         rldform_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit10 = GXt_char1 ;
         GXt_char1 = AV43Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN210_", ""), (byte)(99), GXv_char2) ;
         rldform_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit11 = GXt_char1 ;
         /* Using cursor P068I2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P068I2_A407EmprNom[0] ;
            n407EmprNom = P068I2_n407EmprNom[0] ;
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
                                              AV22PNumCol ,
                                              AV23UNumCol ,
                                              Integer.valueOf(AV20PColor) ,
                                              Integer.valueOf(AV21UColor) ,
                                              Integer.valueOf(AV47PForNumCol) ,
                                              Integer.valueOf(AV48UForNumCol) ,
                                              Byte.valueOf(AV49tc1) ,
                                              Byte.valueOf(AV50tc2) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A494ForSer ,
                                              AV19USerie ,
                                              A482ForColNom ,
                                              Integer.valueOf(A483ForColNum) ,
                                              Integer.valueOf(A486ForNumCol) ,
                                              Byte.valueOf(A831TipColCod) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         /* Using cursor P068I3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16PCliCod), Integer.valueOf(AV17UCliCod), AV18PSerie, AV19USerie, AV22PNumCol, AV23UNumCol, Integer.valueOf(AV20PColor), Integer.valueOf(AV21UColor), Integer.valueOf(AV47PForNumCol), Integer.valueOf(AV48UForNumCol), Byte.valueOf(AV49tc1), Byte.valueOf(AV50tc2)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk68I3 = false ;
            A831TipColCod = P068I3_A831TipColCod[0] ;
            A486ForNumCol = P068I3_A486ForNumCol[0] ;
            A483ForColNum = P068I3_A483ForColNum[0] ;
            A482ForColNom = P068I3_A482ForColNom[0] ;
            A494ForSer = P068I3_A494ForSer[0] ;
            A252CliCod = P068I3_A252CliCod[0] ;
            A1192ForNumCli = P068I3_A1192ForNumCli[0] ;
            n1192ForNumCli = P068I3_n1192ForNumCli[0] ;
            A1191ForNomCli = P068I3_A1191ForNomCli[0] ;
            n1191ForNomCli = P068I3_n1191ForNomCli[0] ;
            A484ForCon = P068I3_A484ForCon[0] ;
            A626MatCod = P068I3_A626MatCod[0] ;
            A279CliNom = P068I3_A279CliNom[0] ;
            A279CliNom = P068I3_A279CliNom[0] ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P068I3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P068I3_A252CliCod[0] == A252CliCod ) )
            {
               brk68I3 = false ;
               A831TipColCod = P068I3_A831TipColCod[0] ;
               A486ForNumCol = P068I3_A486ForNumCol[0] ;
               A483ForColNum = P068I3_A483ForColNum[0] ;
               A482ForColNom = P068I3_A482ForColNom[0] ;
               A494ForSer = P068I3_A494ForSer[0] ;
               A1192ForNumCli = P068I3_A1192ForNumCli[0] ;
               n1192ForNumCli = P068I3_n1192ForNumCli[0] ;
               A1191ForNomCli = P068I3_A1191ForNomCli[0] ;
               n1191ForNomCli = P068I3_n1191ForNomCli[0] ;
               A484ForCon = P068I3_A484ForCon[0] ;
               A626MatCod = P068I3_A626MatCod[0] ;
               AV30ForNumCol = A486ForNumCol ;
               AV44Color1 = A482ForColNom + " " + GXutil.str( A483ForColNum, 10, 0) ;
               AV45Color2 = A1191ForNomCli + " " + GXutil.str( A1192ForNumCli, 10, 0) ;
               AV46ContFor = "" ;
               if ( A484ForCon == 1 )
               {
                  AV46ContFor = httpContext.getMessage( "CONTROL FORMULA", "") ;
               }
               h68I0( false, 58) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A494ForSer, "")), 14, Gx_line+0, 132, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 133, Gx_line+0, 229, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 241, Gx_line+1, 286, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 300, Gx_line+0, 316, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46ContFor, "")), 14, Gx_line+17, 132, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1191ForNomCli, "")), 133, Gx_line+17, 229, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9")), 241, Gx_line+17, 286, Gx_line+34, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A626MatCod), "ZZ9")), 293, Gx_line+16, 316, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30ForNumCol), "ZZZZZZZ9")), 358, Gx_line+3, 417, Gx_line+20, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+58) ;
               /* Using cursor P068I4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A764ProForCod = P068I4_A764ProForCod[0] ;
                  A1160ProForL = P068I4_A1160ProForL[0] ;
                  A766ProForDsc = P068I4_A766ProForDsc[0] ;
                  A766ProForDsc = P068I4_A766ProForDsc[0] ;
                  h68I0( false, 35) ;
                  getPrinter().GxAttris("Courier New", 12, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 368, Gx_line+0, 432, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 449, Gx_line+0, 763, Gx_line+20, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+35) ;
                  /* Using cursor P068I5 */
                  pr_default.execute(3, new Object[] {A396EmprCod, A764ProForCod});
                  while ( (pr_default.getStatus(3) != 101) )
                  {
                     A490ForPrdUMe = P068I5_A490ForPrdUMe[0] ;
                     A770ProForPrd = P068I5_A770ProForPrd[0] ;
                     A765ProForDes = P068I5_A765ProForDes[0] ;
                     A763ProForCla = P068I5_A763ProForCla[0] ;
                     A762ProForCan = P068I5_A762ProForCan[0] ;
                     A488ForPrdDsc = P068I5_A488ForPrdDsc[0] ;
                     n488ForPrdDsc = P068I5_n488ForPrdDsc[0] ;
                     A767ProForLin = P068I5_A767ProForLin[0] ;
                     A488ForPrdDsc = P068I5_A488ForPrdDsc[0] ;
                     n488ForPrdDsc = P068I5_n488ForPrdDsc[0] ;
                     if ( (GXutil.strcmp("", A770ProForPrd)==0) || ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 3, 1), " ") != 0 ) )
                     {
                        if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "#") != 0 )
                        {
                           if ( ! (GXutil.strcmp("", A765ProForDes)==0) && (GXutil.strcmp("", A770ProForPrd)==0) )
                           {
                              h68I0( false, 20) ;
                              getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 370, Gx_line+1, 421, Gx_line+19, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 436, Gx_line+1, 654, Gx_line+19, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+20) ;
                           }
                           else
                           {
                              h68I0( false, 20) ;
                              getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 370, Gx_line+0, 421, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 436, Gx_line+0, 654, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 676, Gx_line+0, 719, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A762ProForCan, "ZZZZZ9.9999")), 732, Gx_line+0, 833, Gx_line+18, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A763ProForCla, "")), 852, Gx_line+1, 986, Gx_line+19, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+20) ;
                           }
                        }
                     }
                     AV31ProForPrd = A770ProForPrd ;
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
                  h68I0( false, 17) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  pr_default.readNext(2);
               }
               pr_default.close(2);
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
               brk68I3 = true ;
               pr_default.readNext(1);
            }
            if ( ! brk68I3 )
            {
               brk68I3 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h68I0( true, 0) ;
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
         /* Using cursor P068I6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV30ForNumCol), AV31ProForPrd});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A490ForPrdUMe = P068I6_A490ForPrdUMe[0] ;
            A489ForPrdNor = P068I6_A489ForPrdNor[0] ;
            A486ForNumCol = P068I6_A486ForNumCol[0] ;
            A487ForPrdCan = P068I6_A487ForPrdCan[0] ;
            A488ForPrdDsc = P068I6_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P068I6_n488ForPrdDsc[0] ;
            A718PrdNom = P068I6_A718PrdNom[0] ;
            A719PrdNum = P068I6_A719PrdNum[0] ;
            A715PrdLin = P068I6_A715PrdLin[0] ;
            A718PrdNom = P068I6_A718PrdNom[0] ;
            A488ForPrdDsc = P068I6_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P068I6_n488ForPrdDsc[0] ;
            h68I0( false, 17) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 370, Gx_line+0, 421, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 436, Gx_line+0, 654, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 676, Gx_line+0, 719, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A487ForPrdCan, "ZZZZ9.99999")), 741, Gx_line+0, 834, Gx_line+18, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
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
            /* Using cursor P068I7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV30ForNumCol), Byte.valueOf(AV29Ncar), AV31ProForPrd, Byte.valueOf(AV29Ncar)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A490ForPrdUMe = P068I7_A490ForPrdUMe[0] ;
               A719PrdNum = P068I7_A719PrdNum[0] ;
               A486ForNumCol = P068I7_A486ForNumCol[0] ;
               A481ForCan = P068I7_A481ForCan[0] ;
               A488ForPrdDsc = P068I7_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P068I7_n488ForPrdDsc[0] ;
               A718PrdNom = P068I7_A718PrdNom[0] ;
               A309ColLin = P068I7_A309ColLin[0] ;
               A718PrdNom = P068I7_A718PrdNom[0] ;
               A488ForPrdDsc = P068I7_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P068I7_n488ForPrdDsc[0] ;
               h68I0( false, 17) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 370, Gx_line+0, 421, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 436, Gx_line+0, 654, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 676, Gx_line+0, 719, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A481ForCan, "ZZZZ9.99999")), 752, Gx_line+0, 832, Gx_line+17, 2, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
         }
      }
   }

   public void h68I0( boolean bFoot ,
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
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24NomEmp, "")), 15, Gx_line+17, 235, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit1, "")), 540, Gx_line+17, 577, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 591, Gx_line+17, 650, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit2, "")), 664, Gx_line+17, 694, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 700, Gx_line+17, 759, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit3, "")), 664, Gx_line+33, 709, Gx_line+51, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 715, Gx_line+33, 760, Gx_line+50, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 126, Gx_line+90, 177, Gx_line+108, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 181, Gx_line+90, 432, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "C/M", ""), 305, Gx_line+133, 331, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(9, Gx_line+7, 952, Gx_line+7, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(10, Gx_line+72, 953, Gx_line+72, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(9, Gx_line+155, 994, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit4, "")), 16, Gx_line+49, 184, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit5, "")), 15, Gx_line+90, 99, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit6, "")), 128, Gx_line+114, 212, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit7, "")), 13, Gx_line+133, 97, Gx_line+151, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit8, "")), 126, Gx_line+133, 294, Gx_line+151, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit9, "")), 463, Gx_line+133, 572, Gx_line+151, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit10, "")), 852, Gx_line+133, 995, Gx_line+151, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 358, Gx_line+133, 376, Gx_line+150, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+167) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
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
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P068I2_A396EmprCod = new String[] {""} ;
      P068I2_A407EmprNom = new String[] {""} ;
      P068I2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV24NomEmp = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      P068I3_A396EmprCod = new String[] {""} ;
      P068I3_A831TipColCod = new byte[1] ;
      P068I3_A486ForNumCol = new int[1] ;
      P068I3_A483ForColNum = new int[1] ;
      P068I3_A482ForColNom = new String[] {""} ;
      P068I3_A494ForSer = new String[] {""} ;
      P068I3_A252CliCod = new int[1] ;
      P068I3_A1192ForNumCli = new int[1] ;
      P068I3_n1192ForNumCli = new boolean[] {false} ;
      P068I3_A1191ForNomCli = new String[] {""} ;
      P068I3_n1191ForNomCli = new boolean[] {false} ;
      P068I3_A484ForCon = new byte[1] ;
      P068I3_A626MatCod = new short[1] ;
      P068I3_A279CliNom = new String[] {""} ;
      A1191ForNomCli = "" ;
      A279CliNom = "" ;
      AV44Color1 = "" ;
      AV45Color2 = "" ;
      AV46ContFor = "" ;
      P068I4_A396EmprCod = new String[] {""} ;
      P068I4_A252CliCod = new int[1] ;
      P068I4_A494ForSer = new String[] {""} ;
      P068I4_A482ForColNom = new String[] {""} ;
      P068I4_A483ForColNum = new int[1] ;
      P068I4_A831TipColCod = new byte[1] ;
      P068I4_A764ProForCod = new String[] {""} ;
      P068I4_A1160ProForL = new short[1] ;
      P068I4_A766ProForDsc = new String[] {""} ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      P068I5_A490ForPrdUMe = new byte[1] ;
      P068I5_A396EmprCod = new String[] {""} ;
      P068I5_A764ProForCod = new String[] {""} ;
      P068I5_A770ProForPrd = new String[] {""} ;
      P068I5_A765ProForDes = new String[] {""} ;
      P068I5_A763ProForCla = new String[] {""} ;
      P068I5_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P068I5_A488ForPrdDsc = new String[] {""} ;
      P068I5_n488ForPrdDsc = new boolean[] {false} ;
      P068I5_A767ProForLin = new short[1] ;
      A770ProForPrd = "" ;
      A765ProForDes = "" ;
      A763ProForCla = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      AV31ProForPrd = "" ;
      P068I6_A490ForPrdUMe = new byte[1] ;
      P068I6_A396EmprCod = new String[] {""} ;
      P068I6_A489ForPrdNor = new short[1] ;
      P068I6_A486ForNumCol = new int[1] ;
      P068I6_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P068I6_A488ForPrdDsc = new String[] {""} ;
      P068I6_n488ForPrdDsc = new boolean[] {false} ;
      P068I6_A718PrdNom = new String[] {""} ;
      P068I6_A719PrdNum = new String[] {""} ;
      P068I6_A715PrdLin = new short[1] ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      P068I7_A490ForPrdUMe = new byte[1] ;
      P068I7_A396EmprCod = new String[] {""} ;
      P068I7_A719PrdNum = new String[] {""} ;
      P068I7_A486ForNumCol = new int[1] ;
      P068I7_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P068I7_A488ForPrdDsc = new String[] {""} ;
      P068I7_n488ForPrdDsc = new boolean[] {false} ;
      P068I7_A718PrdNom = new String[] {""} ;
      P068I7_A309ColLin = new short[1] ;
      A481ForCan = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.rldform__default(),
         new Object[] {
             new Object[] {
            P068I2_A396EmprCod, P068I2_A407EmprNom, P068I2_n407EmprNom
            }
            , new Object[] {
            P068I3_A396EmprCod, P068I3_A831TipColCod, P068I3_A486ForNumCol, P068I3_A483ForColNum, P068I3_A482ForColNom, P068I3_A494ForSer, P068I3_A252CliCod, P068I3_A1192ForNumCli, P068I3_n1192ForNumCli, P068I3_A1191ForNomCli,
            P068I3_n1191ForNomCli, P068I3_A484ForCon, P068I3_A626MatCod, P068I3_A279CliNom
            }
            , new Object[] {
            P068I4_A396EmprCod, P068I4_A252CliCod, P068I4_A494ForSer, P068I4_A482ForColNom, P068I4_A483ForColNum, P068I4_A831TipColCod, P068I4_A764ProForCod, P068I4_A1160ProForL, P068I4_A766ProForDsc
            }
            , new Object[] {
            P068I5_A490ForPrdUMe, P068I5_A396EmprCod, P068I5_A764ProForCod, P068I5_A770ProForPrd, P068I5_A765ProForDes, P068I5_A763ProForCla, P068I5_A762ProForCan, P068I5_A488ForPrdDsc, P068I5_n488ForPrdDsc, P068I5_A767ProForLin
            }
            , new Object[] {
            P068I6_A490ForPrdUMe, P068I6_A396EmprCod, P068I6_A489ForPrdNor, P068I6_A486ForNumCol, P068I6_A487ForPrdCan, P068I6_A488ForPrdDsc, P068I6_n488ForPrdDsc, P068I6_A718PrdNom, P068I6_A719PrdNum, P068I6_A715PrdLin
            }
            , new Object[] {
            P068I7_A490ForPrdUMe, P068I7_A396EmprCod, P068I7_A719PrdNum, P068I7_A486ForNumCol, P068I7_A481ForCan, P068I7_A488ForPrdDsc, P068I7_n488ForPrdDsc, P068I7_A718PrdNom, P068I7_A309ColLin
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

   private byte AV49tc1 ;
   private byte AV50tc2 ;
   private byte A831TipColCod ;
   private byte A484ForCon ;
   private byte A490ForPrdUMe ;
   private byte AV29Ncar ;
   private short gxcookieaux ;
   private short A626MatCod ;
   private short A1160ProForL ;
   private short A767ProForLin ;
   private short A489ForPrdNor ;
   private short A715PrdLin ;
   private short A309ColLin ;
   private short Gx_err ;
   private int AV16PCliCod ;
   private int AV17UCliCod ;
   private int AV20PColor ;
   private int AV21UColor ;
   private int AV47PForNumCol ;
   private int AV48UForNumCol ;
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
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV24NomEmp ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A1191ForNomCli ;
   private String A279CliNom ;
   private String AV44Color1 ;
   private String AV45Color2 ;
   private String AV46ContFor ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A770ProForPrd ;
   private String A765ProForDes ;
   private String A763ProForCla ;
   private String A488ForPrdDsc ;
   private String AV31ProForPrd ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean brk68I3 ;
   private boolean n1192ForNumCli ;
   private boolean n1191ForNomCli ;
   private boolean n488ForPrdDsc ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P068I2_A396EmprCod ;
   private String[] P068I2_A407EmprNom ;
   private boolean[] P068I2_n407EmprNom ;
   private String[] P068I3_A396EmprCod ;
   private byte[] P068I3_A831TipColCod ;
   private int[] P068I3_A486ForNumCol ;
   private int[] P068I3_A483ForColNum ;
   private String[] P068I3_A482ForColNom ;
   private String[] P068I3_A494ForSer ;
   private int[] P068I3_A252CliCod ;
   private int[] P068I3_A1192ForNumCli ;
   private boolean[] P068I3_n1192ForNumCli ;
   private String[] P068I3_A1191ForNomCli ;
   private boolean[] P068I3_n1191ForNomCli ;
   private byte[] P068I3_A484ForCon ;
   private short[] P068I3_A626MatCod ;
   private String[] P068I3_A279CliNom ;
   private String[] P068I4_A396EmprCod ;
   private int[] P068I4_A252CliCod ;
   private String[] P068I4_A494ForSer ;
   private String[] P068I4_A482ForColNom ;
   private int[] P068I4_A483ForColNum ;
   private byte[] P068I4_A831TipColCod ;
   private String[] P068I4_A764ProForCod ;
   private short[] P068I4_A1160ProForL ;
   private String[] P068I4_A766ProForDsc ;
   private byte[] P068I5_A490ForPrdUMe ;
   private String[] P068I5_A396EmprCod ;
   private String[] P068I5_A764ProForCod ;
   private String[] P068I5_A770ProForPrd ;
   private String[] P068I5_A765ProForDes ;
   private String[] P068I5_A763ProForCla ;
   private java.math.BigDecimal[] P068I5_A762ProForCan ;
   private String[] P068I5_A488ForPrdDsc ;
   private boolean[] P068I5_n488ForPrdDsc ;
   private short[] P068I5_A767ProForLin ;
   private byte[] P068I6_A490ForPrdUMe ;
   private String[] P068I6_A396EmprCod ;
   private short[] P068I6_A489ForPrdNor ;
   private int[] P068I6_A486ForNumCol ;
   private java.math.BigDecimal[] P068I6_A487ForPrdCan ;
   private String[] P068I6_A488ForPrdDsc ;
   private boolean[] P068I6_n488ForPrdDsc ;
   private String[] P068I6_A718PrdNom ;
   private String[] P068I6_A719PrdNum ;
   private short[] P068I6_A715PrdLin ;
   private byte[] P068I7_A490ForPrdUMe ;
   private String[] P068I7_A396EmprCod ;
   private String[] P068I7_A719PrdNum ;
   private int[] P068I7_A486ForNumCol ;
   private java.math.BigDecimal[] P068I7_A481ForCan ;
   private String[] P068I7_A488ForPrdDsc ;
   private boolean[] P068I7_n488ForPrdDsc ;
   private String[] P068I7_A718PrdNom ;
   private short[] P068I7_A309ColLin ;
}

final  class rldform__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P068I3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV16PCliCod ,
                                          int AV17UCliCod ,
                                          String AV18PSerie ,
                                          String AV22PNumCol ,
                                          String AV23UNumCol ,
                                          int AV20PColor ,
                                          int AV21UColor ,
                                          int AV47PForNumCol ,
                                          int AV48UForNumCol ,
                                          byte AV49tc1 ,
                                          byte AV50tc2 ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String AV19USerie ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          int A486ForNumCol ,
                                          byte A831TipColCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[13];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.TipColCod, T1.ForNumCol, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.ForNumCli, T1.ForNomCli, T1.ForCon, T1.MatCod, T2.CliNom FROM" ;
      scmdbuf += " (TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV16PCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV17UCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18PSerie)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18PSerie)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22PNumCol)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23UNumCol)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int3[6] = (byte)(1) ;
      }
      if ( ! (0==AV20PColor) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int3[7] = (byte)(1) ;
      }
      if ( ! (0==AV21UColor) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int3[8] = (byte)(1) ;
      }
      if ( ! (0==AV47PForNumCol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int3[9] = (byte)(1) ;
      }
      if ( ! (0==AV48UForNumCol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int3[10] = (byte)(1) ;
      }
      if ( ! (0==AV49tc1) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int3[11] = (byte)(1) ;
      }
      if ( ! (0==AV50tc2) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int3[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
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
                  return conditional_P068I3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P068I2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P068I3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P068I4", "SELECT T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForCod, T1.ProForL, T2.ProForDsc FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P068I5", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.ProForPrd, T1.ProForDes, T1.ProForCla, T1.ProForCan, T2.ForPrdDsc, T1.ProForLin FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ProForCod = ? ORDER BY T1.EmprCod, T1.ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P068I6", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ForPrdNor, T1.ForNumCol, T1.ForPrdCan, T3.ForPrdDsc, T2.PrdNom, T1.PrdNum, T1.PrdLin FROM ((TXPLPRFOR T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE (T1.EmprCod = ? and T1.ForNumCol = ?) AND (T1.ForPrdNor = TO_NUMBER(NVL(TRIM(SUBSTR(?, 2, 4)), '0'))) ORDER BY T1.EmprCod, T1.ForNumCol, T1.PrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P068I7", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.PrdNum, T1.ForNumCol, T1.ForCan, T3.ForPrdDsc, T2.PrdNom, T1.ColLin FROM ((TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE (T1.EmprCod = ? and T1.ForNumCol = ?) AND (SUBSTR(T1.PrdNum, 1, ?) = SUBSTR(?, 1, ?)) ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 4 :
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
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((short[]) buf[8])[0] = rslt.getShort(8);
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
                  stmt.setString(sIdx, (String)parms[18], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

