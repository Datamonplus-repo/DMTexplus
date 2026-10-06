package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rfa0004_impl extends GXWebReport
{
   public rfa0004_impl( com.genexus.internet.HttpContext context )
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
            AV16PSer = httpContext.GetPar( "PSer") ;
            AV17USer = httpContext.GetPar( "USer") ;
            AV18Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
            AV19Any = (short)(GXutil.lval( httpContext.GetPar( "Any"))) ;
            AV20Prio = httpContext.GetPar( "Prio") ;
            AV51SerieF = (byte)(GXutil.lval( httpContext.GetPar( "SerieF"))) ;
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
         Gx_out = "SCR" ;
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
         GXt_char1 = AV37Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rfa0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit0 = GXt_char1 ;
         GXt_char1 = AV38Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rfa0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit1 = GXt_char1 ;
         GXt_char1 = AV39Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN753_", ""), (byte)(99), GXv_char2) ;
         rfa0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit2 = GXt_char1 ;
         GXt_char1 = AV40Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rfa0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit3 = GXt_char1 ;
         GXt_char1 = AV41Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1438_", ""), (byte)(99), GXv_char2) ;
         rfa0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit4 = GXt_char1 ;
         GXt_char1 = AV42Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN388_", ""), (byte)(99), GXv_char2) ;
         rfa0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit5 = GXt_char1 ;
         GXt_char1 = AV43Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2157_", ""), (byte)(99), GXv_char2) ;
         rfa0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit6 = GXt_char1 ;
         GXt_char1 = AV44Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2156_", ""), (byte)(99), GXv_char2) ;
         rfa0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit7 = GXt_char1 ;
         GXt_char1 = AV45Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2437_", ""), (byte)(99), GXv_char2) ;
         rfa0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit8 = GXt_char1 ;
         GXt_char1 = AV46Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2487_", ""), (byte)(99), GXv_char2) ;
         rfa0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit9 = GXt_char1 ;
         GXt_char1 = AV47Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2488_", ""), (byte)(99), GXv_char2) ;
         rfa0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit10 = GXt_char1 ;
         GXt_char1 = AV48Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2489_", ""), (byte)(99), GXv_char2) ;
         rfa0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit11 = GXt_char1 ;
         GXt_char1 = AV49Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2490_", ""), (byte)(99), GXv_char2) ;
         rfa0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit12 = GXt_char1 ;
         GXt_char1 = AV52Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         rfa0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV52Lit13 = GXt_char1 ;
         AV21Anyo = AV19Any ;
         /* Using cursor P06LZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06LZ2_A407EmprNom[0] ;
            n407EmprNom = P06LZ2_n407EmprNom[0] ;
            A963Ser1 = P06LZ2_A963Ser1[0] ;
            n963Ser1 = P06LZ2_n963Ser1[0] ;
            A2387Ser2 = P06LZ2_A2387Ser2[0] ;
            n2387Ser2 = P06LZ2_n2387Ser2[0] ;
            A2389Ser3 = P06LZ2_A2389Ser3[0] ;
            n2389Ser3 = P06LZ2_n2389Ser3[0] ;
            A4215Ser4 = P06LZ2_A4215Ser4[0] ;
            n4215Ser4 = P06LZ2_n4215Ser4[0] ;
            A4217Ser5 = P06LZ2_A4217Ser5[0] ;
            n4217Ser5 = P06LZ2_n4217Ser5[0] ;
            A4219Ser6 = P06LZ2_A4219Ser6[0] ;
            n4219Ser6 = P06LZ2_n4219Ser6[0] ;
            A4221Ser7 = P06LZ2_A4221Ser7[0] ;
            n4221Ser7 = P06LZ2_n4221Ser7[0] ;
            AV22NomEmp = A407EmprNom ;
            if ( AV51SerieF == 1 )
            {
               AV50ArtEstSer = A963Ser1 ;
            }
            else
            {
               if ( AV51SerieF == 2 )
               {
                  AV50ArtEstSer = A2387Ser2 ;
               }
               else
               {
                  if ( AV51SerieF == 3 )
                  {
                     AV50ArtEstSer = A2389Ser3 ;
                  }
                  else
                  {
                     if ( AV51SerieF == 4 )
                     {
                        AV50ArtEstSer = A4215Ser4 ;
                     }
                     else
                     {
                        if ( AV51SerieF == 5 )
                        {
                           AV50ArtEstSer = A4217Ser5 ;
                        }
                        else
                        {
                           if ( AV51SerieF == 6 )
                           {
                              AV50ArtEstSer = A4219Ser6 ;
                           }
                           else
                           {
                              if ( AV51SerieF == 7 )
                              {
                                 AV50ArtEstSer = A4221Ser7 ;
                              }
                           }
                        }
                     }
                  }
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = AV16PSer ;
         GXv_char4[0] = AV17USer ;
         GXv_int5[0] = AV21Anyo ;
         GXv_char6[0] = AV20Prio ;
         GXv_decimal7[0] = AV25TotCom ;
         GXv_char8[0] = AV50ArtEstSer ;
         new app.pordart(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_int5, GXv_char6, GXv_decimal7, GXv_char8) ;
         rfa0004_impl.this.A396EmprCod = GXv_char2[0] ;
         rfa0004_impl.this.AV16PSer = GXv_char3[0] ;
         rfa0004_impl.this.AV17USer = GXv_char4[0] ;
         rfa0004_impl.this.AV21Anyo = GXv_int5[0] ;
         rfa0004_impl.this.AV20Prio = GXv_char6[0] ;
         rfa0004_impl.this.AV25TotCom = GXv_decimal7[0] ;
         rfa0004_impl.this.AV50ArtEstSer = GXv_char8[0] ;
         AV26Porcen = DecimalUtil.doubleToDec(0) ;
         AV27PorAcu = DecimalUtil.doubleToDec(0) ;
         AV28PorcGrp = DecimalUtil.doubleToDec(0) ;
         AV29TotGrp = DecimalUtil.doubleToDec(0) ;
         AV30TotInf = DecimalUtil.doubleToDec(0) ;
         AV32Flag = (byte)(1) ;
         /* Using cursor P06LZ4 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV16PSer, AV17USer, Short.valueOf(AV21Anyo), AV50ArtEstSer});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6LZ4 = false ;
            A252CliCod = P06LZ4_A252CliCod[0] ;
            A71ArtEstAny = P06LZ4_A71ArtEstAny[0] ;
            A2756ArtEstSer = P06LZ4_A2756ArtEstSer[0] ;
            A65ArtCod = P06LZ4_A65ArtCod[0] ;
            A900ArtOrd0 = P06LZ4_A900ArtOrd0[0] ;
            n900ArtOrd0 = P06LZ4_n900ArtOrd0[0] ;
            A1435AcuImp1 = P06LZ4_A1435AcuImp1[0] ;
            A1434AcuImp0 = P06LZ4_A1434AcuImp0[0] ;
            A1435AcuImp1 = P06LZ4_A1435AcuImp1[0] ;
            A1434AcuImp0 = P06LZ4_A1434AcuImp0[0] ;
            AV33ComAcu = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(1) != 101) && ( DecimalUtil.compareTo(P06LZ4_A900ArtOrd0[0], A900ArtOrd0) == 0 ) )
            {
               brk6LZ4 = false ;
               A252CliCod = P06LZ4_A252CliCod[0] ;
               A71ArtEstAny = P06LZ4_A71ArtEstAny[0] ;
               A2756ArtEstSer = P06LZ4_A2756ArtEstSer[0] ;
               A65ArtCod = P06LZ4_A65ArtCod[0] ;
               if ( GXutil.strcmp(P06LZ4_A396EmprCod[0], A396EmprCod) == 0 )
               {
                  if ( ( GXutil.strcmp(A65ArtCod, AV16PSer) >= 0 ) && ( GXutil.strcmp(A65ArtCod, AV17USer) <= 0 ) )
                  {
                     if ( A71ArtEstAny == AV21Anyo )
                     {
                        if ( GXutil.strcmp(A2756ArtEstSer, AV50ArtEstSer) == 0 )
                        {
                           /* Using cursor P06LZ6 */
                           pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A71ArtEstAny), A2756ArtEstSer});
                           if ( (pr_default.getStatus(2) != 101) )
                           {
                              A1435AcuImp1 = P06LZ6_A1435AcuImp1[0] ;
                              A1434AcuImp0 = P06LZ6_A1434AcuImp0[0] ;
                           }
                           else
                           {
                              A1435AcuImp1 = DecimalUtil.doubleToDec(0) ;
                              A1434AcuImp0 = DecimalUtil.doubleToDec(0) ;
                           }
                           pr_default.close(2);
                           if ( GXutil.strcmp(AV20Prio, "2") == 0 )
                           {
                              AV33ComAcu = AV33ComAcu.add(A1434AcuImp0).add(A1435AcuImp1) ;
                           }
                           else
                           {
                              if ( GXutil.strcmp(AV20Prio, "0") == 0 )
                              {
                                 AV33ComAcu = AV33ComAcu.add(A1434AcuImp0) ;
                              }
                              if ( GXutil.strcmp(AV20Prio, "1") == 0 )
                              {
                                 AV33ComAcu = AV33ComAcu.add(A1435AcuImp1) ;
                              }
                           }
                        }
                     }
                  }
               }
               brk6LZ4 = true ;
               pr_default.readNext(1);
            }
            AV54ArtCod = A65ArtCod ;
            /* Execute user subroutine: 'SUMA_ARTICULO' */
            S111 ();
            if ( returnInSub )
            {
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
            if ( AV32Flag == 3 )
            {
               AV32Flag = (byte)(4) ;
            }
            if ( AV25TotCom.doubleValue() != 0 )
            {
               AV26Porcen = AV33ComAcu.multiply(DecimalUtil.doubleToDec(100)).divide(AV25TotCom, 18, java.math.RoundingMode.DOWN) ;
            }
            else
            {
               AV26Porcen = DecimalUtil.doubleToDec(0) ;
            }
            AV27PorAcu = AV27PorAcu.add(AV26Porcen) ;
            AV35TotPer = AV35TotPer.add(AV34ComPer) ;
            AV30TotInf = AV30TotInf.add(AV33ComAcu) ;
            AV28PorcGrp = AV28PorcGrp.add(AV26Porcen) ;
            AV29TotGrp = AV29TotGrp.add(AV33ComAcu) ;
            AV36TotGrpPer = AV36TotGrpPer.add(AV34ComPer) ;
            if ( ( AV34ComPer.doubleValue() != 0 ) || ( AV33ComAcu.doubleValue() != 0 ) || ( AV26Porcen.doubleValue() != 0 ) )
            {
               h6LZ0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A65ArtCod, "")), 17, Gx_line+0, 135, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34ComPer, "ZZZ,ZZZ,ZZ9.99")), 286, Gx_line+0, 389, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33ComAcu, "Z,ZZZ,ZZZ,ZZ9.99")), 427, Gx_line+1, 545, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Porcen, "ZZ9.99")), 567, Gx_line+1, 612, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV34ComPer = DecimalUtil.doubleToDec(0) ;
               AV33ComAcu = DecimalUtil.doubleToDec(0) ;
               AV26Porcen = DecimalUtil.doubleToDec(0) ;
            }
            if ( ( AV27PorAcu.doubleValue() >= 80 ) && ( AV32Flag == 1 ) )
            {
               h6LZ0( false, 26) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit9, "")), 141, Gx_line+3, 237, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TotGrpPer, "Z,ZZZ,ZZZ,ZZ9.99")), 272, Gx_line+3, 390, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotGrp, "Z,ZZZ,ZZZ,ZZ9.99")), 427, Gx_line+3, 545, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28PorcGrp, "ZZ9.99")), 567, Gx_line+3, 612, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(272, Gx_line+0, 389, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(427, Gx_line+0, 544, Gx_line+0, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+26) ;
               AV28PorcGrp = DecimalUtil.doubleToDec(0) ;
               AV29TotGrp = DecimalUtil.doubleToDec(0) ;
               AV36TotGrpPer = DecimalUtil.doubleToDec(0) ;
               AV32Flag = (byte)(2) ;
            }
            if ( ( ( AV27PorAcu.doubleValue() >= 95 ) ) && ( AV32Flag == 2 ) && ( AV29TotGrp.doubleValue() != 0 ) )
            {
               h6LZ0( false, 26) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit10, "")), 136, Gx_line+4, 232, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TotGrpPer, "Z,ZZZ,ZZZ,ZZ9.99")), 272, Gx_line+4, 390, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotGrp, "Z,ZZZ,ZZZ,ZZ9.99")), 427, Gx_line+4, 545, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28PorcGrp, "ZZ9.99")), 567, Gx_line+4, 612, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(427, Gx_line+0, 544, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(272, Gx_line+0, 389, Gx_line+0, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+26) ;
               AV28PorcGrp = DecimalUtil.doubleToDec(0) ;
               AV29TotGrp = DecimalUtil.doubleToDec(0) ;
               AV36TotGrpPer = DecimalUtil.doubleToDec(0) ;
               AV32Flag = (byte)(3) ;
            }
            if ( ! brk6LZ4 )
            {
               brk6LZ4 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         if ( AV32Flag == 4 )
         {
            h6LZ0( false, 26) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit11, "")), 142, Gx_line+3, 238, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TotGrpPer, "Z,ZZZ,ZZZ,ZZ9.99")), 272, Gx_line+3, 390, Gx_line+20, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotGrp, "Z,ZZZ,ZZZ,ZZ9.99")), 427, Gx_line+3, 545, Gx_line+20, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28PorcGrp, "ZZ9.99")), 567, Gx_line+3, 612, Gx_line+20, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(427, Gx_line+0, 544, Gx_line+0, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(272, Gx_line+0, 389, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+26) ;
         }
         h6LZ0( false, 27) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit12, "")), 138, Gx_line+4, 234, Gx_line+21, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TotPer, "ZZ,ZZZ,ZZZ,ZZ9.99")), 265, Gx_line+4, 390, Gx_line+21, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30TotInf, "ZZ,ZZZ,ZZZ,ZZ9.99")), 420, Gx_line+4, 545, Gx_line+21, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27PorAcu, "ZZ9.99")), 567, Gx_line+4, 612, Gx_line+21, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(427, Gx_line+0, 544, Gx_line+0, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(272, Gx_line+0, 389, Gx_line+0, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+27) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6LZ0( true, 0) ;
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
      /* 'SUMA_ARTICULO' Routine */
      returnInSub = false ;
      AV34ComPer = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P06LZ7 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV54ArtCod, Short.valueOf(AV21Anyo), AV50ArtEstSer, Byte.valueOf(AV18Mes)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A72ArtEstMes = P06LZ7_A72ArtEstMes[0] ;
         A2756ArtEstSer = P06LZ7_A2756ArtEstSer[0] ;
         A71ArtEstAny = P06LZ7_A71ArtEstAny[0] ;
         A65ArtCod = P06LZ7_A65ArtCod[0] ;
         A1437ArtImp1 = P06LZ7_A1437ArtImp1[0] ;
         n1437ArtImp1 = P06LZ7_n1437ArtImp1[0] ;
         A1436ArtImp0 = P06LZ7_A1436ArtImp0[0] ;
         n1436ArtImp0 = P06LZ7_n1436ArtImp0[0] ;
         A252CliCod = P06LZ7_A252CliCod[0] ;
         if ( GXutil.strcmp(AV20Prio, "2") == 0 )
         {
            AV34ComPer = AV34ComPer.add(A1436ArtImp0).add(A1437ArtImp1) ;
         }
         else
         {
            if ( GXutil.strcmp(AV20Prio, "0") == 0 )
            {
               AV34ComPer = AV34ComPer.add(A1436ArtImp0) ;
            }
            else
            {
               AV34ComPer = AV34ComPer.add(A1437ArtImp1) ;
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void h6LZ0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 443, Gx_line+6, 451, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 596, Gx_line+7, 604, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22NomEmp, "")), 5, Gx_line+6, 225, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit0, "")), 399, Gx_line+6, 436, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 450, Gx_line+6, 509, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit1, "")), 545, Gx_line+6, 575, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 603, Gx_line+6, 662, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 596, Gx_line+40, 604, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit2, "")), 5, Gx_line+40, 217, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit3, "")), 545, Gx_line+40, 590, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 618, Gx_line+40, 663, Gx_line+57, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Facturacion ", ""), 301, Gx_line+90, 390, Gx_line+107, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Prio, "")), 10, Gx_line+73, 18, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit13, "")), 61, Gx_line+73, 106, Gx_line+91, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50ArtEstSer, "")), 113, Gx_line+73, 136, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mes", ""), 301, Gx_line+106, 324, Gx_line+123, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Año", ""), 464, Gx_line+106, 487, Gx_line+123, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 582, Gx_line+105, 590, Gx_line+122, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit5, "")), 17, Gx_line+106, 76, Gx_line+124, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18Mes), "Z9")), 374, Gx_line+107, 390, Gx_line+124, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19Any), "ZZZ9")), 515, Gx_line+107, 545, Gx_line+124, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+63, 691, Gx_line+63, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(17, Gx_line+126, 263, Gx_line+126, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Facturacion", ""), 464, Gx_line+90, 545, Gx_line+107, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Pgmname, "")), 397, Gx_line+40, 617, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(272, Gx_line+126, 389, Gx_line+126, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(427, Gx_line+126, 544, Gx_line+126, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+129) ;
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
      AV16PSer = "" ;
      AV17USer = "" ;
      AV20Prio = "" ;
      AV37Lit0 = "" ;
      AV38Lit1 = "" ;
      AV39Lit2 = "" ;
      AV40Lit3 = "" ;
      AV41Lit4 = "" ;
      AV42Lit5 = "" ;
      AV43Lit6 = "" ;
      AV44Lit7 = "" ;
      AV45Lit8 = "" ;
      AV46Lit9 = "" ;
      AV47Lit10 = "" ;
      AV48Lit11 = "" ;
      AV49Lit12 = "" ;
      AV52Lit13 = "" ;
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P06LZ2_A396EmprCod = new String[] {""} ;
      P06LZ2_A407EmprNom = new String[] {""} ;
      P06LZ2_n407EmprNom = new boolean[] {false} ;
      P06LZ2_A963Ser1 = new String[] {""} ;
      P06LZ2_n963Ser1 = new boolean[] {false} ;
      P06LZ2_A2387Ser2 = new String[] {""} ;
      P06LZ2_n2387Ser2 = new boolean[] {false} ;
      P06LZ2_A2389Ser3 = new String[] {""} ;
      P06LZ2_n2389Ser3 = new boolean[] {false} ;
      P06LZ2_A4215Ser4 = new String[] {""} ;
      P06LZ2_n4215Ser4 = new boolean[] {false} ;
      P06LZ2_A4217Ser5 = new String[] {""} ;
      P06LZ2_n4217Ser5 = new boolean[] {false} ;
      P06LZ2_A4219Ser6 = new String[] {""} ;
      P06LZ2_n4219Ser6 = new boolean[] {false} ;
      P06LZ2_A4221Ser7 = new String[] {""} ;
      P06LZ2_n4221Ser7 = new boolean[] {false} ;
      A407EmprNom = "" ;
      A963Ser1 = "" ;
      A2387Ser2 = "" ;
      A2389Ser3 = "" ;
      A4215Ser4 = "" ;
      A4217Ser5 = "" ;
      A4219Ser6 = "" ;
      A4221Ser7 = "" ;
      AV22NomEmp = "" ;
      AV50ArtEstSer = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_char6 = new String[1] ;
      AV25TotCom = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char8 = new String[1] ;
      AV26Porcen = DecimalUtil.ZERO ;
      AV27PorAcu = DecimalUtil.ZERO ;
      AV28PorcGrp = DecimalUtil.ZERO ;
      AV29TotGrp = DecimalUtil.ZERO ;
      AV30TotInf = DecimalUtil.ZERO ;
      P06LZ4_A252CliCod = new int[1] ;
      P06LZ4_A396EmprCod = new String[] {""} ;
      P06LZ4_A71ArtEstAny = new short[1] ;
      P06LZ4_A2756ArtEstSer = new String[] {""} ;
      P06LZ4_A65ArtCod = new String[] {""} ;
      P06LZ4_A900ArtOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LZ4_n900ArtOrd0 = new boolean[] {false} ;
      P06LZ4_A1435AcuImp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LZ4_A1434AcuImp0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2756ArtEstSer = "" ;
      A65ArtCod = "" ;
      A900ArtOrd0 = DecimalUtil.ZERO ;
      A1435AcuImp1 = DecimalUtil.ZERO ;
      A1434AcuImp0 = DecimalUtil.ZERO ;
      AV33ComAcu = DecimalUtil.ZERO ;
      P06LZ6_A1435AcuImp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LZ6_A1434AcuImp0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV54ArtCod = "" ;
      AV35TotPer = DecimalUtil.ZERO ;
      AV34ComPer = DecimalUtil.ZERO ;
      AV36TotGrpPer = DecimalUtil.ZERO ;
      P06LZ7_A396EmprCod = new String[] {""} ;
      P06LZ7_A72ArtEstMes = new byte[1] ;
      P06LZ7_A2756ArtEstSer = new String[] {""} ;
      P06LZ7_A71ArtEstAny = new short[1] ;
      P06LZ7_A65ArtCod = new String[] {""} ;
      P06LZ7_A1437ArtImp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LZ7_n1437ArtImp1 = new boolean[] {false} ;
      P06LZ7_A1436ArtImp0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LZ7_n1436ArtImp0 = new boolean[] {false} ;
      P06LZ7_A252CliCod = new int[1] ;
      A1437ArtImp1 = DecimalUtil.ZERO ;
      A1436ArtImp0 = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV61Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.rfa0004__default(),
         new Object[] {
             new Object[] {
            P06LZ2_A396EmprCod, P06LZ2_A407EmprNom, P06LZ2_n407EmprNom, P06LZ2_A963Ser1, P06LZ2_n963Ser1, P06LZ2_A2387Ser2, P06LZ2_n2387Ser2, P06LZ2_A2389Ser3, P06LZ2_n2389Ser3, P06LZ2_A4215Ser4,
            P06LZ2_n4215Ser4, P06LZ2_A4217Ser5, P06LZ2_n4217Ser5, P06LZ2_A4219Ser6, P06LZ2_n4219Ser6, P06LZ2_A4221Ser7, P06LZ2_n4221Ser7
            }
            , new Object[] {
            P06LZ4_A252CliCod, P06LZ4_A396EmprCod, P06LZ4_A71ArtEstAny, P06LZ4_A2756ArtEstSer, P06LZ4_A65ArtCod, P06LZ4_A900ArtOrd0, P06LZ4_n900ArtOrd0, P06LZ4_A1435AcuImp1, P06LZ4_A1434AcuImp0
            }
            , new Object[] {
            P06LZ6_A1435AcuImp1, P06LZ6_A1434AcuImp0
            }
            , new Object[] {
            P06LZ7_A396EmprCod, P06LZ7_A72ArtEstMes, P06LZ7_A2756ArtEstSer, P06LZ7_A71ArtEstAny, P06LZ7_A65ArtCod, P06LZ7_A1437ArtImp1, P06LZ7_n1437ArtImp1, P06LZ7_A1436ArtImp0, P06LZ7_n1436ArtImp0, P06LZ7_A252CliCod
            }
         }
      );
      AV61Pgmname = "Facturacion.RFA0004" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV61Pgmname = "Facturacion.RFA0004" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV18Mes ;
   private byte AV51SerieF ;
   private byte AV32Flag ;
   private byte A72ArtEstMes ;
   private short gxcookieaux ;
   private short AV19Any ;
   private short AV21Anyo ;
   private short GXv_int5[] ;
   private short A71ArtEstAny ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV25TotCom ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV26Porcen ;
   private java.math.BigDecimal AV27PorAcu ;
   private java.math.BigDecimal AV28PorcGrp ;
   private java.math.BigDecimal AV29TotGrp ;
   private java.math.BigDecimal AV30TotInf ;
   private java.math.BigDecimal A900ArtOrd0 ;
   private java.math.BigDecimal A1435AcuImp1 ;
   private java.math.BigDecimal A1434AcuImp0 ;
   private java.math.BigDecimal AV33ComAcu ;
   private java.math.BigDecimal AV35TotPer ;
   private java.math.BigDecimal AV34ComPer ;
   private java.math.BigDecimal AV36TotGrpPer ;
   private java.math.BigDecimal A1437ArtImp1 ;
   private java.math.BigDecimal A1436ArtImp0 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV16PSer ;
   private String AV17USer ;
   private String AV20Prio ;
   private String AV37Lit0 ;
   private String AV38Lit1 ;
   private String AV39Lit2 ;
   private String AV40Lit3 ;
   private String AV41Lit4 ;
   private String AV42Lit5 ;
   private String AV43Lit6 ;
   private String AV44Lit7 ;
   private String AV45Lit8 ;
   private String AV46Lit9 ;
   private String AV47Lit10 ;
   private String AV48Lit11 ;
   private String AV49Lit12 ;
   private String AV52Lit13 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A963Ser1 ;
   private String A2387Ser2 ;
   private String A2389Ser3 ;
   private String A4215Ser4 ;
   private String A4217Ser5 ;
   private String A4219Ser6 ;
   private String A4221Ser7 ;
   private String AV22NomEmp ;
   private String AV50ArtEstSer ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private String GXv_char8[] ;
   private String A2756ArtEstSer ;
   private String A65ArtCod ;
   private String AV54ArtCod ;
   private String Gx_time ;
   private String AV61Pgmname ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n963Ser1 ;
   private boolean n2387Ser2 ;
   private boolean n2389Ser3 ;
   private boolean n4215Ser4 ;
   private boolean n4217Ser5 ;
   private boolean n4219Ser6 ;
   private boolean n4221Ser7 ;
   private boolean brk6LZ4 ;
   private boolean n900ArtOrd0 ;
   private boolean returnInSub ;
   private boolean n1437ArtImp1 ;
   private boolean n1436ArtImp0 ;
   private IDataStoreProvider pr_default ;
   private String[] P06LZ2_A396EmprCod ;
   private String[] P06LZ2_A407EmprNom ;
   private boolean[] P06LZ2_n407EmprNom ;
   private String[] P06LZ2_A963Ser1 ;
   private boolean[] P06LZ2_n963Ser1 ;
   private String[] P06LZ2_A2387Ser2 ;
   private boolean[] P06LZ2_n2387Ser2 ;
   private String[] P06LZ2_A2389Ser3 ;
   private boolean[] P06LZ2_n2389Ser3 ;
   private String[] P06LZ2_A4215Ser4 ;
   private boolean[] P06LZ2_n4215Ser4 ;
   private String[] P06LZ2_A4217Ser5 ;
   private boolean[] P06LZ2_n4217Ser5 ;
   private String[] P06LZ2_A4219Ser6 ;
   private boolean[] P06LZ2_n4219Ser6 ;
   private String[] P06LZ2_A4221Ser7 ;
   private boolean[] P06LZ2_n4221Ser7 ;
   private int[] P06LZ4_A252CliCod ;
   private String[] P06LZ4_A396EmprCod ;
   private short[] P06LZ4_A71ArtEstAny ;
   private String[] P06LZ4_A2756ArtEstSer ;
   private String[] P06LZ4_A65ArtCod ;
   private java.math.BigDecimal[] P06LZ4_A900ArtOrd0 ;
   private boolean[] P06LZ4_n900ArtOrd0 ;
   private java.math.BigDecimal[] P06LZ4_A1435AcuImp1 ;
   private java.math.BigDecimal[] P06LZ4_A1434AcuImp0 ;
   private java.math.BigDecimal[] P06LZ6_A1435AcuImp1 ;
   private java.math.BigDecimal[] P06LZ6_A1434AcuImp0 ;
   private String[] P06LZ7_A396EmprCod ;
   private byte[] P06LZ7_A72ArtEstMes ;
   private String[] P06LZ7_A2756ArtEstSer ;
   private short[] P06LZ7_A71ArtEstAny ;
   private String[] P06LZ7_A65ArtCod ;
   private java.math.BigDecimal[] P06LZ7_A1437ArtImp1 ;
   private boolean[] P06LZ7_n1437ArtImp1 ;
   private java.math.BigDecimal[] P06LZ7_A1436ArtImp0 ;
   private boolean[] P06LZ7_n1436ArtImp0 ;
   private int[] P06LZ7_A252CliCod ;
}

final  class rfa0004__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06LZ2", "SELECT EmprCod, EmprNom, Ser1, Ser2, Ser3, Ser4, Ser5, Ser6, Ser7 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06LZ4", "SELECT T1.CliCod, T1.EmprCod, T1.ArtEstAny, T1.ArtEstSer, T1.ArtCod, T1.ArtOrd0, COALESCE( T2.AcuImp1, 0) AS AcuImp1, COALESCE( T2.AcuImp0, 0) AS AcuImp0 FROM (TXPCESART T1 LEFT JOIN (SELECT SUM(ArtImp1) AS AcuImp1, EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer, SUM(ArtImp0) AS AcuImp0 FROM TXPLESART GROUP BY EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod = T1.ArtCod AND T2.ArtEstAny = T1.ArtEstAny AND T2.ArtEstSer = T1.ArtEstSer) WHERE (T1.EmprCod = ?) AND (T1.ArtCod >= ? and T1.ArtCod <= ?) AND (T1.ArtEstAny = ?) AND (T1.ArtEstSer = ?) ORDER BY T1.ArtOrd0 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LZ6", "SELECT COALESCE( T1.AcuImp1, 0) AS AcuImp1, COALESCE( T1.AcuImp0, 0) AS AcuImp0 FROM (SELECT SUM(ArtImp1) AS AcuImp1, EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer, SUM(ArtImp0) AS AcuImp0 FROM TXPLESART GROUP BY EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.ArtCod = ? AND T1.ArtEstAny = ? AND T1.ArtEstSer = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LZ7", "SELECT EmprCod, ArtEstMes, ArtEstSer, ArtEstAny, ArtCod, ArtImp1, ArtImp0, CliCod FROM TXPLESART WHERE (EmprCod = ?) AND (ArtCod = ?) AND (ArtEstAny = ?) AND (ArtEstSer = ?) AND (ArtEstMes = ?) ORDER BY EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer, ArtEstMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
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
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

