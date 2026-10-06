package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rficco2_impl extends GXWebReport
{
   public rficco2_impl( com.genexus.internet.HttpContext context )
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
            AV8ImpCod = httpContext.GetPar( "ImpCod") ;
            AV9PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV10UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV11PSerie = httpContext.GetPar( "PSerie") ;
            AV12Userie = httpContext.GetPar( "Userie") ;
            AV15PNumCol = (int)(GXutil.lval( httpContext.GetPar( "PNumCol"))) ;
            AV16UNumCol = (int)(GXutil.lval( httpContext.GetPar( "UNumCol"))) ;
            AV13PColor = httpContext.GetPar( "PColor") ;
            AV14UColor = httpContext.GetPar( "UColor") ;
            Gx_out = httpContext.GetPar( "Gx_out") ;
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
      M_bot = 3 ;
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*3)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV38ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FICCO2", ""), GXv_char1) ;
         rficco2_impl.this.AV38ContDsc = GXv_char1[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = "030100" ;
         GXv_int3[0] = AV53ValCos ;
         new app.pbuscou(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
         rficco2_impl.this.A396EmprCod = GXv_char1[0] ;
         rficco2_impl.this.AV53ValCos = GXv_int3[0] ;
         AV54Usurcod = " " ;
         GXt_char4 = AV55Station ;
         GXv_char2[0] = GXt_char4 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         rficco2_impl.this.GXt_char4 = GXv_char2[0] ;
         AV55Station = GXt_char4 ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char1[0] = AV56EmprNom ;
         GXv_char5[0] = AV54Usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV55Station, GXv_char2, GXv_char1, GXv_char5) ;
         rficco2_impl.this.A396EmprCod = GXv_char2[0] ;
         rficco2_impl.this.AV56EmprNom = GXv_char1[0] ;
         rficco2_impl.this.AV54Usurcod = GXv_char5[0] ;
         GXt_int6 = AV59Kohler ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KOHLER", ""), GXv_int7) ;
         rficco2_impl.this.GXt_int6 = GXv_int7[0] ;
         AV59Kohler = GXt_int6 ;
         GXt_int6 = AV60Tonalida ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TONALI", ""), GXv_int7) ;
         rficco2_impl.this.GXt_int6 = GXv_int7[0] ;
         AV60Tonalida = GXt_int6 ;
         /* Using cursor P06RS2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06RS2_A407EmprNom[0] ;
            n407EmprNom = P06RS2_n407EmprNom[0] ;
            AV17NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P06RS3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9PCliCod), AV11PSerie, AV13PColor, Integer.valueOf(AV15PNumCol), AV12Userie, Integer.valueOf(AV16UNumCol), AV14UColor, Integer.valueOf(AV10UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A486ForNumCol = P06RS3_A486ForNumCol[0] ;
            A831TipColCod = P06RS3_A831TipColCod[0] ;
            A483ForColNum = P06RS3_A483ForColNum[0] ;
            A482ForColNom = P06RS3_A482ForColNom[0] ;
            A494ForSer = P06RS3_A494ForSer[0] ;
            A252CliCod = P06RS3_A252CliCod[0] ;
            A485ForFec = P06RS3_A485ForFec[0] ;
            n485ForFec = P06RS3_n485ForFec[0] ;
            A4380ForCosForm = P06RS3_A4380ForCosForm[0] ;
            n4380ForCosForm = P06RS3_n4380ForCosForm[0] ;
            A2838ForRelBan = P06RS3_A2838ForRelBan[0] ;
            n2838ForRelBan = P06RS3_n2838ForRelBan[0] ;
            A995ForTonal = P06RS3_A995ForTonal[0] ;
            n995ForTonal = P06RS3_n995ForTonal[0] ;
            A4339ForRGB = P06RS3_A4339ForRGB[0] ;
            n4339ForRGB = P06RS3_n4339ForRGB[0] ;
            A3560ForOpcCli = P06RS3_A3560ForOpcCli[0] ;
            n3560ForOpcCli = P06RS3_n3560ForOpcCli[0] ;
            A279CliNom = P06RS3_A279CliNom[0] ;
            A1192ForNumCli = P06RS3_A1192ForNumCli[0] ;
            n1192ForNumCli = P06RS3_n1192ForNumCli[0] ;
            A1191ForNomCli = P06RS3_A1191ForNomCli[0] ;
            n1191ForNomCli = P06RS3_n1191ForNomCli[0] ;
            A279CliNom = P06RS3_A279CliNom[0] ;
            AV39FechaC = GXutil.str( GXutil.day( A485ForFec), 2, 0) + " " + localUtil.cmonth( A485ForFec, httpContext.getMessage( "por", "")) + " " + GXutil.str( GXutil.year( A485ForFec), 4, 0) ;
            AV43ForCosForm = A4380ForCosForm ;
            AV44ForrelBan = A2838ForRelBan ;
            AV35p_Tinte = (byte)(0) ;
            AV36v_desc = GXutil.space( (short)(26)) ;
            /* Using cursor P06RS4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A764ProForCod = P06RS4_A764ProForCod[0] ;
               A5523ProForTip = P06RS4_A5523ProForTip[0] ;
               A766ProForDsc = P06RS4_A766ProForDsc[0] ;
               A1160ProForL = P06RS4_A1160ProForL[0] ;
               A5523ProForTip = P06RS4_A5523ProForTip[0] ;
               A766ProForDsc = P06RS4_A766ProForDsc[0] ;
               AV58ProFor_3 = GXutil.substring( A764ProForCod, 1, 3) ;
               if ( GXutil.like( A764ProForCod , GXutil.padr( httpContext.getMessage( "%DES%", "") , 254 , "%"),  ' ' ) || GXutil.like( A764ProForCod , GXutil.padr( httpContext.getMessage( "%MBR%", "") , 254 , "%"),  ' ' ) || ( GXutil.strcmp(A5523ProForTip, httpContext.getMessage( "P", "")) == 0 ) )
               {
                  AV36v_desc = A766ProForDsc ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Using cursor P06RS5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A649ObsForTxt = P06RS5_A649ObsForTxt[0] ;
               A650ObsLin = P06RS5_A650ObsLin[0] ;
               AV57Obs_1 = A649ObsForTxt ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            GXv_char5[0] = A396EmprCod ;
            GXv_int3[0] = A252CliCod ;
            GXv_char2[0] = A494ForSer ;
            GXv_char1[0] = AV18ArtTra1 ;
            GXv_char8[0] = AV20ArtTra2 ;
            GXv_char9[0] = AV22ArtTra3 ;
            GXv_int10[0] = AV19ArtTraP1 ;
            GXv_int11[0] = AV21ArtTraP2 ;
            GXv_int12[0] = AV23ArtTraP3 ;
            GXv_char13[0] = AV29ArtUrd1 ;
            GXv_char14[0] = AV27ArtUrd2 ;
            GXv_char15[0] = AV25ArtUrd3 ;
            GXv_int16[0] = AV28ArtUrdP1 ;
            GXv_int17[0] = AV26ArtUrdP2 ;
            GXv_int18[0] = AV24ArtUrdP3 ;
            new app.pbusdar(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_char2, GXv_char1, GXv_char8, GXv_char9, GXv_int10, GXv_int11, GXv_int12, GXv_char13, GXv_char14, GXv_char15, GXv_int16, GXv_int17, GXv_int18) ;
            rficco2_impl.this.A396EmprCod = GXv_char5[0] ;
            rficco2_impl.this.A252CliCod = GXv_int3[0] ;
            rficco2_impl.this.A494ForSer = GXv_char2[0] ;
            rficco2_impl.this.AV18ArtTra1 = GXv_char1[0] ;
            rficco2_impl.this.AV20ArtTra2 = GXv_char8[0] ;
            rficco2_impl.this.AV22ArtTra3 = GXv_char9[0] ;
            rficco2_impl.this.AV19ArtTraP1 = GXv_int10[0] ;
            rficco2_impl.this.AV21ArtTraP2 = GXv_int11[0] ;
            rficco2_impl.this.AV23ArtTraP3 = GXv_int12[0] ;
            rficco2_impl.this.AV29ArtUrd1 = GXv_char13[0] ;
            rficco2_impl.this.AV27ArtUrd2 = GXv_char14[0] ;
            rficco2_impl.this.AV25ArtUrd3 = GXv_char15[0] ;
            rficco2_impl.this.AV28ArtUrdP1 = GXv_int16[0] ;
            rficco2_impl.this.AV26ArtUrdP2 = GXv_int17[0] ;
            rficco2_impl.this.AV24ArtUrdP3 = GXv_int18[0] ;
            GXv_char15[0] = A396EmprCod ;
            GXv_int3[0] = A252CliCod ;
            GXv_char14[0] = A494ForSer ;
            GXv_char13[0] = AV30TArtDsc ;
            new app.pbusar2(remoteHandle, context).execute( GXv_char15, GXv_int3, GXv_char14, GXv_char13) ;
            rficco2_impl.this.A396EmprCod = GXv_char15[0] ;
            rficco2_impl.this.A252CliCod = GXv_int3[0] ;
            rficco2_impl.this.A494ForSer = GXv_char14[0] ;
            rficco2_impl.this.AV30TArtDsc = GXv_char13[0] ;
            GXv_char15[0] = AV37ARtDsc ;
            new app.pfartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A494ForSer, GXv_char15) ;
            rficco2_impl.this.AV37ARtDsc = GXv_char15[0] ;
            AV31vCompo = GXutil.trim( GXutil.str( AV19ArtTraP1, 3, 0)) + "%" + GXutil.trim( AV18ArtTra1) + "+" + GXutil.trim( GXutil.str( AV21ArtTraP2, 3, 0)) + "%" + GXutil.trim( AV20ArtTra2) + "+" + GXutil.trim( GXutil.str( AV23ArtTraP3, 3, 0)) + "%" + GXutil.trim( AV22ArtTra3) ;
            AV46ForTonal = GXutil.substring( A995ForTonal, 1, 10) ;
            GXv_int19[0] = A4339ForRGB ;
            GXv_int18[0] = AV48R ;
            GXv_int17[0] = AV49G ;
            GXv_int16[0] = AV50B ;
            new app.pleorgb(remoteHandle, context).execute( GXv_int19, GXv_int18, GXv_int17, GXv_int16) ;
            rficco2_impl.this.A4339ForRGB = GXv_int19[0] ;
            rficco2_impl.this.AV48R = GXv_int18[0] ;
            rficco2_impl.this.AV49G = GXv_int17[0] ;
            rficco2_impl.this.AV50B = GXv_int16[0] ;
            AV32vFam = GXutil.space( (short)(2)) ;
            AV34vNum_co = (byte)(1) ;
            if ( AV60Tonalida == 0 )
            {
               AV33vTint = httpContext.getMessage( "Tingimento ", "") + GXutil.str( AV34vNum_co, 1, 0) ;
            }
            else
            {
               AV33vTint = httpContext.getMessage( "Tingimento ", "") ;
            }
            h6RS0( false, 39) ;
            getPrinter().GxDrawRect(59, Gx_line+9, 463, Gx_line+33, 1, 75, 75, 75, 1, 75, 75, 75, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33vTint, "")), 66, Gx_line+14, 142, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 395, Gx_line+14, 406, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(569, Gx_line+0, 569, Gx_line+39, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(769, Gx_line+0, 769, Gx_line+39, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+39) ;
            AV47Num_lin = (short)(0) ;
            /* Using cursor P06RS6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A719PrdNum = P06RS6_A719PrdNum[0] ;
               A481ForCan = P06RS6_A481ForCan[0] ;
               A718PrdNom = P06RS6_A718PrdNom[0] ;
               A707PrdFacCon = P06RS6_A707PrdFacCon[0] ;
               A724PrdPreAct = P06RS6_A724PrdPreAct[0] ;
               A309ColLin = P06RS6_A309ColLin[0] ;
               A718PrdNom = P06RS6_A718PrdNom[0] ;
               A707PrdFacCon = P06RS6_A707PrdFacCon[0] ;
               A724PrdPreAct = P06RS6_A724PrdPreAct[0] ;
               if ( AV60Tonalida == 0 )
               {
                  if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 2), AV32vFam) != 0 ) && ! (GXutil.strcmp("", AV32vFam)==0) )
                  {
                     AV34vNum_co = (byte)(AV34vNum_co+1) ;
                     AV33vTint = httpContext.getMessage( "Tingimento ", "") + GXutil.str( AV34vNum_co, 1, 0) ;
                     /* Execute user subroutine: 'CAB_COL' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(4);
                        pr_default.close(4);
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
               }
               AV32vFam = GXutil.substring( A719PrdNum, 1, 2) ;
               AV42ForCan = A481ForCan ;
               h6RS0( false, 17) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 66, Gx_line+2, 148, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 127, Gx_line+2, 291, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42ForCan, "Z9.99999")), 367, Gx_line+2, 426, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(569, Gx_line+0, 569, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(769, Gx_line+0, 769, Gx_line+18, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV47Num_lin = (short)(AV47Num_lin+1) ;
               AV45Coste_cora = AV45Coste_cora.add(((A481ForCan.multiply(A724PrdPreAct).multiply(A707PrdFacCon).multiply(DecimalUtil.doubleToDec(AV53ValCos))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            h6RS0( false, 17) ;
            getPrinter().GxDrawLine(569, Gx_line+0, 569, Gx_line+18, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(769, Gx_line+0, 769, Gx_line+18, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            AV47Num_lin = (short)(AV47Num_lin+1) ;
            /* Using cursor P06RS7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A490ForPrdUMe = P06RS7_A490ForPrdUMe[0] ;
               A488ForPrdDsc = P06RS7_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P06RS7_n488ForPrdDsc[0] ;
               A487ForPrdCan = P06RS7_A487ForPrdCan[0] ;
               A718PrdNom = P06RS7_A718PrdNom[0] ;
               A719PrdNum = P06RS7_A719PrdNum[0] ;
               A715PrdLin = P06RS7_A715PrdLin[0] ;
               A718PrdNom = P06RS7_A718PrdNom[0] ;
               A488ForPrdDsc = P06RS7_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P06RS7_n488ForPrdDsc[0] ;
               AV40ForPrdDsc = GXutil.substring( A488ForPrdDsc, 1, 4) ;
               AV41ForPrdCan = A487ForPrdCan ;
               h6RS0( false, 17) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 66, Gx_line+2, 155, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 127, Gx_line+2, 318, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41ForPrdCan, "ZZ9.999")), 367, Gx_line+2, 426, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40ForPrdDsc, "")), 442, Gx_line+2, 501, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(569, Gx_line+0, 569, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(769, Gx_line+0, 769, Gx_line+18, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV47Num_lin = (short)(AV47Num_lin+1) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GxHdr3 = false ;
         while ( AV47Num_lin < 15 )
         {
            h6RS0( false, 18) ;
            getPrinter().GxDrawLine(569, Gx_line+0, 569, Gx_line+18, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(769, Gx_line+0, 769, Gx_line+18, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV47Num_lin = (short)(AV47Num_lin+1) ;
         }
         h6RS0( false, 2) ;
         getPrinter().GxDrawLine(569, Gx_line+0, 770, Gx_line+0, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+2) ;
         h6RS0( false, 33) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Custo...", ""), 88, Gx_line+0, 138, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45Coste_cora, "ZZZZ9.99999")), 147, Gx_line+1, 228, Gx_line+19, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "(Rb= ", ""), 272, Gx_line+0, 307, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44ForrelBan, "ZZZ9.99")), 308, Gx_line+1, 360, Gx_line+19, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(")", 345, Gx_line+0, 350, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Operador:", ""), 400, Gx_line+0, 468, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Usurcod, "@!")), 481, Gx_line+1, 590, Gx_line+19, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38ContDsc, "")), 11, Gx_line+22, 75, Gx_line+35, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(8, Gx_line+17, 767, Gx_line+17, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+33) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6RS0( true, 0) ;
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
      /* 'CAB_COL' Routine */
      returnInSub = false ;
      h6RS0( false, 33) ;
      getPrinter().GxDrawRect(59, Gx_line+5, 463, Gx_line+29, 1, 75, 75, 75, 1, 75, 75, 75, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(569, Gx_line+0, 569, Gx_line+34, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(769, Gx_line+0, 769, Gx_line+34, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
      getPrinter().GxDrawText("%", 390, Gx_line+9, 401, Gx_line+26, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33vTint, "")), 69, Gx_line+9, 145, Gx_line+27, 0+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+33) ;
      AV47Num_lin = (short)(AV47Num_lin+2) ;
   }

   public void h6RS0( boolean bFoot ,
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
               if ( AV59Kohler == 0 )
               {
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 81, Gx_line+100, 270, Gx_line+118, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 61, Gx_line+67, 143, Gx_line+85, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(19, Gx_line+17, 414, Gx_line+51, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "RECEITA COR", ""), 306, Gx_line+26, 397, Gx_line+43, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17NomEmp, "")), 38, Gx_line+26, 288, Gx_line+43, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Côr", ""), 19, Gx_line+66, 43, Gx_line+83, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 19, Gx_line+99, 67, Gx_line+116, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Composição", ""), 19, Gx_line+132, 101, Gx_line+149, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Preparação", ""), 19, Gx_line+173, 97, Gx_line+190, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "N/ Código Côr", ""), 345, Gx_line+67, 438, Gx_line+84, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 450, Gx_line+67, 495, Gx_line+85, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cartaz", ""), 345, Gx_line+100, 389, Gx_line+117, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46ForTonal, "")), 395, Gx_line+100, 521, Gx_line+118, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TArtDsc, "")), 109, Gx_line+133, 266, Gx_line+151, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Tipo Malha", ""), 345, Gx_line+133, 420, Gx_line+150, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37ARtDsc, "")), 450, Gx_line+133, 539, Gx_line+151, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36v_desc, "")), 109, Gx_line+173, 273, Gx_line+191, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(569, Gx_line+17, 569, Gx_line+194, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(569, Gx_line+17, 770, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(769, Gx_line+17, 769, Gx_line+194, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "PADRÃO CLIENTE", ""), 600, Gx_line+42, 718, Gx_line+59, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(569, Gx_line+83, 770, Gx_line+83, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(8, Gx_line+191, 565, Gx_line+191, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Obs_1, "")), 109, Gx_line+150, 298, Gx_line+168, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3560ForOpcCli, "@!")), 518, Gx_line+67, 533, Gx_line+85, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("/", 506, Gx_line+67, 511, Gx_line+84, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+194) ;
               }
               else
               {
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 83, Gx_line+103, 272, Gx_line+121, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 64, Gx_line+70, 146, Gx_line+88, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(19, Gx_line+20, 414, Gx_line+54, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "RECEITA COR", ""), 308, Gx_line+29, 399, Gx_line+46, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17NomEmp, "")), 40, Gx_line+29, 290, Gx_line+46, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Côr", ""), 19, Gx_line+69, 43, Gx_line+86, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 19, Gx_line+102, 67, Gx_line+119, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Composição", ""), 19, Gx_line+135, 101, Gx_line+152, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Preparação", ""), 19, Gx_line+176, 97, Gx_line+193, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "N/ Código Côr", ""), 336, Gx_line+69, 429, Gx_line+86, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 442, Gx_line+70, 487, Gx_line+88, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cartaz", ""), 347, Gx_line+103, 391, Gx_line+120, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46ForTonal, "")), 397, Gx_line+103, 523, Gx_line+121, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TArtDsc, "")), 111, Gx_line+136, 268, Gx_line+154, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Tipo Malha", ""), 347, Gx_line+136, 422, Gx_line+153, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37ARtDsc, "")), 452, Gx_line+136, 541, Gx_line+154, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36v_desc, "")), 111, Gx_line+176, 275, Gx_line+194, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(569, Gx_line+20, 569, Gx_line+197, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(571, Gx_line+20, 772, Gx_line+20, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(771, Gx_line+20, 771, Gx_line+197, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "PADRÃO CLIENTE", ""), 600, Gx_line+45, 718, Gx_line+62, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(569, Gx_line+86, 770, Gx_line+86, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(8, Gx_line+194, 565, Gx_line+194, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Obs_1, "")), 111, Gx_line+153, 300, Gx_line+171, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("/", 497, Gx_line+69, 502, Gx_line+86, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1191ForNomCli, "")), 194, Gx_line+70, 276, Gx_line+88, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9")), 505, Gx_line+70, 550, Gx_line+88, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+197) ;
               }
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
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV8ImpCod = "" ;
      AV11PSerie = "" ;
      AV12Userie = "" ;
      AV13PColor = "" ;
      AV14UColor = "" ;
      AV38ContDsc = "" ;
      AV54Usurcod = "" ;
      AV55Station = "" ;
      GXt_char4 = "" ;
      AV56EmprNom = "" ;
      GXv_int7 = new byte[1] ;
      scmdbuf = "" ;
      P06RS2_A396EmprCod = new String[] {""} ;
      P06RS2_A407EmprNom = new String[] {""} ;
      P06RS2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV17NomEmp = "" ;
      P06RS3_A396EmprCod = new String[] {""} ;
      P06RS3_A486ForNumCol = new int[1] ;
      P06RS3_A831TipColCod = new byte[1] ;
      P06RS3_A483ForColNum = new int[1] ;
      P06RS3_A482ForColNom = new String[] {""} ;
      P06RS3_A494ForSer = new String[] {""} ;
      P06RS3_A252CliCod = new int[1] ;
      P06RS3_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06RS3_n485ForFec = new boolean[] {false} ;
      P06RS3_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06RS3_n4380ForCosForm = new boolean[] {false} ;
      P06RS3_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06RS3_n2838ForRelBan = new boolean[] {false} ;
      P06RS3_A995ForTonal = new String[] {""} ;
      P06RS3_n995ForTonal = new boolean[] {false} ;
      P06RS3_A4339ForRGB = new long[1] ;
      P06RS3_n4339ForRGB = new boolean[] {false} ;
      P06RS3_A3560ForOpcCli = new String[] {""} ;
      P06RS3_n3560ForOpcCli = new boolean[] {false} ;
      P06RS3_A279CliNom = new String[] {""} ;
      P06RS3_A1192ForNumCli = new int[1] ;
      P06RS3_n1192ForNumCli = new boolean[] {false} ;
      P06RS3_A1191ForNomCli = new String[] {""} ;
      P06RS3_n1191ForNomCli = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A485ForFec = GXutil.nullDate() ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      A995ForTonal = "" ;
      A3560ForOpcCli = "" ;
      A279CliNom = "" ;
      A1191ForNomCli = "" ;
      AV39FechaC = "" ;
      AV43ForCosForm = DecimalUtil.ZERO ;
      AV44ForrelBan = DecimalUtil.ZERO ;
      AV36v_desc = "" ;
      P06RS4_A396EmprCod = new String[] {""} ;
      P06RS4_A252CliCod = new int[1] ;
      P06RS4_A494ForSer = new String[] {""} ;
      P06RS4_A482ForColNom = new String[] {""} ;
      P06RS4_A483ForColNum = new int[1] ;
      P06RS4_A831TipColCod = new byte[1] ;
      P06RS4_A764ProForCod = new String[] {""} ;
      P06RS4_A5523ProForTip = new String[] {""} ;
      P06RS4_A766ProForDsc = new String[] {""} ;
      P06RS4_A1160ProForL = new short[1] ;
      A764ProForCod = "" ;
      A5523ProForTip = "" ;
      A766ProForDsc = "" ;
      AV58ProFor_3 = "" ;
      P06RS5_A396EmprCod = new String[] {""} ;
      P06RS5_A252CliCod = new int[1] ;
      P06RS5_A494ForSer = new String[] {""} ;
      P06RS5_A482ForColNom = new String[] {""} ;
      P06RS5_A483ForColNum = new int[1] ;
      P06RS5_A831TipColCod = new byte[1] ;
      P06RS5_A649ObsForTxt = new String[] {""} ;
      P06RS5_A650ObsLin = new short[1] ;
      A649ObsForTxt = "" ;
      AV57Obs_1 = "" ;
      GXv_char5 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV18ArtTra1 = "" ;
      GXv_char1 = new String[1] ;
      AV20ArtTra2 = "" ;
      GXv_char8 = new String[1] ;
      AV22ArtTra3 = "" ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new short[1] ;
      GXv_int12 = new short[1] ;
      AV29ArtUrd1 = "" ;
      AV27ArtUrd2 = "" ;
      AV25ArtUrd3 = "" ;
      GXv_int3 = new int[1] ;
      GXv_char14 = new String[1] ;
      AV30TArtDsc = "" ;
      GXv_char13 = new String[1] ;
      AV37ARtDsc = "" ;
      GXv_char15 = new String[1] ;
      AV31vCompo = "" ;
      AV46ForTonal = "" ;
      GXv_int19 = new long[1] ;
      GXv_int18 = new short[1] ;
      GXv_int17 = new short[1] ;
      GXv_int16 = new short[1] ;
      AV32vFam = "" ;
      AV33vTint = "" ;
      P06RS6_A396EmprCod = new String[] {""} ;
      P06RS6_A486ForNumCol = new int[1] ;
      P06RS6_A719PrdNum = new String[] {""} ;
      P06RS6_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06RS6_A718PrdNom = new String[] {""} ;
      P06RS6_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06RS6_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06RS6_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV42ForCan = DecimalUtil.ZERO ;
      AV45Coste_cora = DecimalUtil.ZERO ;
      P06RS7_A490ForPrdUMe = new byte[1] ;
      P06RS7_A396EmprCod = new String[] {""} ;
      P06RS7_A486ForNumCol = new int[1] ;
      P06RS7_A488ForPrdDsc = new String[] {""} ;
      P06RS7_n488ForPrdDsc = new boolean[] {false} ;
      P06RS7_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06RS7_A718PrdNom = new String[] {""} ;
      P06RS7_A719PrdNum = new String[] {""} ;
      P06RS7_A715PrdLin = new short[1] ;
      A488ForPrdDsc = "" ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      AV40ForPrdDsc = "" ;
      AV41ForPrdCan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rficco2__default(),
         new Object[] {
             new Object[] {
            P06RS2_A396EmprCod, P06RS2_A407EmprNom, P06RS2_n407EmprNom
            }
            , new Object[] {
            P06RS3_A396EmprCod, P06RS3_A486ForNumCol, P06RS3_A831TipColCod, P06RS3_A483ForColNum, P06RS3_A482ForColNom, P06RS3_A494ForSer, P06RS3_A252CliCod, P06RS3_A485ForFec, P06RS3_n485ForFec, P06RS3_A4380ForCosForm,
            P06RS3_n4380ForCosForm, P06RS3_A2838ForRelBan, P06RS3_n2838ForRelBan, P06RS3_A995ForTonal, P06RS3_n995ForTonal, P06RS3_A4339ForRGB, P06RS3_n4339ForRGB, P06RS3_A3560ForOpcCli, P06RS3_n3560ForOpcCli, P06RS3_A279CliNom,
            P06RS3_A1192ForNumCli, P06RS3_n1192ForNumCli, P06RS3_A1191ForNomCli, P06RS3_n1191ForNomCli
            }
            , new Object[] {
            P06RS4_A396EmprCod, P06RS4_A252CliCod, P06RS4_A494ForSer, P06RS4_A482ForColNom, P06RS4_A483ForColNum, P06RS4_A831TipColCod, P06RS4_A764ProForCod, P06RS4_A5523ProForTip, P06RS4_A766ProForDsc, P06RS4_A1160ProForL
            }
            , new Object[] {
            P06RS5_A396EmprCod, P06RS5_A252CliCod, P06RS5_A494ForSer, P06RS5_A482ForColNom, P06RS5_A483ForColNum, P06RS5_A831TipColCod, P06RS5_A649ObsForTxt, P06RS5_A650ObsLin
            }
            , new Object[] {
            P06RS6_A396EmprCod, P06RS6_A486ForNumCol, P06RS6_A719PrdNum, P06RS6_A481ForCan, P06RS6_A718PrdNom, P06RS6_A707PrdFacCon, P06RS6_A724PrdPreAct, P06RS6_A309ColLin
            }
            , new Object[] {
            P06RS7_A490ForPrdUMe, P06RS7_A396EmprCod, P06RS7_A486ForNumCol, P06RS7_A488ForPrdDsc, P06RS7_n488ForPrdDsc, P06RS7_A487ForPrdCan, P06RS7_A718PrdNom, P06RS7_A719PrdNum, P06RS7_A715PrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV59Kohler ;
   private byte AV60Tonalida ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte A831TipColCod ;
   private byte AV35p_Tinte ;
   private byte AV34vNum_co ;
   private byte A490ForPrdUMe ;
   private short gxcookieaux ;
   private short A1160ProForL ;
   private short A650ObsLin ;
   private short AV19ArtTraP1 ;
   private short GXv_int10[] ;
   private short AV21ArtTraP2 ;
   private short GXv_int11[] ;
   private short AV23ArtTraP3 ;
   private short GXv_int12[] ;
   private short AV28ArtUrdP1 ;
   private short AV26ArtUrdP2 ;
   private short AV24ArtUrdP3 ;
   private short AV48R ;
   private short GXv_int18[] ;
   private short AV49G ;
   private short GXv_int17[] ;
   private short AV50B ;
   private short GXv_int16[] ;
   private short AV47Num_lin ;
   private short A309ColLin ;
   private short A715PrdLin ;
   private short Gx_err ;
   private int AV9PCliCod ;
   private int AV10UCliCod ;
   private int AV15PNumCol ;
   private int AV16UNumCol ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV53ValCos ;
   private int A486ForNumCol ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A1192ForNumCli ;
   private int GXv_int3[] ;
   private int Gx_OldLine ;
   private long A4339ForRGB ;
   private long GXv_int19[] ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal AV43ForCosForm ;
   private java.math.BigDecimal AV44ForrelBan ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV42ForCan ;
   private java.math.BigDecimal AV45Coste_cora ;
   private java.math.BigDecimal A487ForPrdCan ;
   private java.math.BigDecimal AV41ForPrdCan ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV8ImpCod ;
   private String AV11PSerie ;
   private String AV12Userie ;
   private String AV13PColor ;
   private String AV14UColor ;
   private String AV38ContDsc ;
   private String AV54Usurcod ;
   private String AV55Station ;
   private String GXt_char4 ;
   private String AV56EmprNom ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV17NomEmp ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A995ForTonal ;
   private String A3560ForOpcCli ;
   private String A279CliNom ;
   private String A1191ForNomCli ;
   private String AV39FechaC ;
   private String AV36v_desc ;
   private String A764ProForCod ;
   private String A5523ProForTip ;
   private String A766ProForDsc ;
   private String AV58ProFor_3 ;
   private String A649ObsForTxt ;
   private String AV57Obs_1 ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String AV18ArtTra1 ;
   private String GXv_char1[] ;
   private String AV20ArtTra2 ;
   private String GXv_char8[] ;
   private String AV22ArtTra3 ;
   private String GXv_char9[] ;
   private String AV29ArtUrd1 ;
   private String AV27ArtUrd2 ;
   private String AV25ArtUrd3 ;
   private String GXv_char14[] ;
   private String AV30TArtDsc ;
   private String GXv_char13[] ;
   private String AV37ARtDsc ;
   private String GXv_char15[] ;
   private String AV31vCompo ;
   private String AV46ForTonal ;
   private String AV32vFam ;
   private String AV33vTint ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String AV40ForPrdDsc ;
   private java.util.Date A485ForFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n485ForFec ;
   private boolean n4380ForCosForm ;
   private boolean n2838ForRelBan ;
   private boolean n995ForTonal ;
   private boolean n4339ForRGB ;
   private boolean n3560ForOpcCli ;
   private boolean n1192ForNumCli ;
   private boolean n1191ForNomCli ;
   private boolean returnInSub ;
   private boolean n488ForPrdDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P06RS2_A396EmprCod ;
   private String[] P06RS2_A407EmprNom ;
   private boolean[] P06RS2_n407EmprNom ;
   private String[] P06RS3_A396EmprCod ;
   private int[] P06RS3_A486ForNumCol ;
   private byte[] P06RS3_A831TipColCod ;
   private int[] P06RS3_A483ForColNum ;
   private String[] P06RS3_A482ForColNom ;
   private String[] P06RS3_A494ForSer ;
   private int[] P06RS3_A252CliCod ;
   private java.util.Date[] P06RS3_A485ForFec ;
   private boolean[] P06RS3_n485ForFec ;
   private java.math.BigDecimal[] P06RS3_A4380ForCosForm ;
   private boolean[] P06RS3_n4380ForCosForm ;
   private java.math.BigDecimal[] P06RS3_A2838ForRelBan ;
   private boolean[] P06RS3_n2838ForRelBan ;
   private String[] P06RS3_A995ForTonal ;
   private boolean[] P06RS3_n995ForTonal ;
   private long[] P06RS3_A4339ForRGB ;
   private boolean[] P06RS3_n4339ForRGB ;
   private String[] P06RS3_A3560ForOpcCli ;
   private boolean[] P06RS3_n3560ForOpcCli ;
   private String[] P06RS3_A279CliNom ;
   private int[] P06RS3_A1192ForNumCli ;
   private boolean[] P06RS3_n1192ForNumCli ;
   private String[] P06RS3_A1191ForNomCli ;
   private boolean[] P06RS3_n1191ForNomCli ;
   private String[] P06RS4_A396EmprCod ;
   private int[] P06RS4_A252CliCod ;
   private String[] P06RS4_A494ForSer ;
   private String[] P06RS4_A482ForColNom ;
   private int[] P06RS4_A483ForColNum ;
   private byte[] P06RS4_A831TipColCod ;
   private String[] P06RS4_A764ProForCod ;
   private String[] P06RS4_A5523ProForTip ;
   private String[] P06RS4_A766ProForDsc ;
   private short[] P06RS4_A1160ProForL ;
   private String[] P06RS5_A396EmprCod ;
   private int[] P06RS5_A252CliCod ;
   private String[] P06RS5_A494ForSer ;
   private String[] P06RS5_A482ForColNom ;
   private int[] P06RS5_A483ForColNum ;
   private byte[] P06RS5_A831TipColCod ;
   private String[] P06RS5_A649ObsForTxt ;
   private short[] P06RS5_A650ObsLin ;
   private String[] P06RS6_A396EmprCod ;
   private int[] P06RS6_A486ForNumCol ;
   private String[] P06RS6_A719PrdNum ;
   private java.math.BigDecimal[] P06RS6_A481ForCan ;
   private String[] P06RS6_A718PrdNom ;
   private java.math.BigDecimal[] P06RS6_A707PrdFacCon ;
   private java.math.BigDecimal[] P06RS6_A724PrdPreAct ;
   private short[] P06RS6_A309ColLin ;
   private byte[] P06RS7_A490ForPrdUMe ;
   private String[] P06RS7_A396EmprCod ;
   private int[] P06RS7_A486ForNumCol ;
   private String[] P06RS7_A488ForPrdDsc ;
   private boolean[] P06RS7_n488ForPrdDsc ;
   private java.math.BigDecimal[] P06RS7_A487ForPrdCan ;
   private String[] P06RS7_A718PrdNom ;
   private String[] P06RS7_A719PrdNum ;
   private short[] P06RS7_A715PrdLin ;
}

final  class rficco2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06RS2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06RS3", "SELECT T1.EmprCod, T1.ForNumCol, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.ForFec, T1.ForCosForm, T1.ForRelBan, T1.ForTonal, T1.ForRGB, T1.ForOpcCli, T2.CliNom, T1.ForNumCli, T1.ForNomCli FROM (TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.ForSer >= ? and T1.ForColNom >= ? and T1.ForColNum >= ?) AND (T1.ForSer <= ?) AND (T1.ForColNum <= ?) AND (T1.ForColNom <= ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06RS4", "SELECT T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForCod, T2.ProForTip, T2.ProForDsc, T1.ProForL FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06RS5", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsForTxt, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06RS6", "SELECT T1.EmprCod, T1.ForNumCol, T1.PrdNum, T1.ForCan, T2.PrdNom, T2.PrdFacCon, T2.PrdPreAct, T1.ColLin FROM (TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06RS7", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ForNumCol, T3.ForPrdDsc, T1.ForPrdCan, T2.PrdNom, T1.PrdNum, T1.PrdLin FROM ((TXPLPRFOR T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.PrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((int[]) buf[20])[0] = rslt.getInt(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((short[]) buf[8])[0] = rslt.getShort(8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 13);
               stmt.setInt(9, ((Number) parms[8]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

