package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rst0014copy1_impl extends GXWebReport
{
   public rst0014copy1_impl( com.genexus.internet.HttpContext context )
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
            AV9ImpCod = httpContext.GetPar( "ImpCod") ;
            AV10PProd = httpContext.GetPar( "PProd") ;
            AV11UProd = httpContext.GetPar( "UProd") ;
            AV41Cont_stk = httpContext.GetPar( "Cont_stk") ;
            AV50Valcodi = (byte)(GXutil.lval( httpContext.GetPar( "Valcodi"))) ;
            AV51ValCodf = (byte)(GXutil.lval( httpContext.GetPar( "ValCodf"))) ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 256, 11909, 16474, 0, 1, 1, 0, 1, 1) )
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
         GXt_char1 = AV19Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN404_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit0 = GXt_char1 ;
         GXt_char1 = AV20Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit1 = GXt_char1 ;
         GXt_char1 = AV21Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit2 = GXt_char1 ;
         GXt_char1 = AV22Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit3 = GXt_char1 ;
         GXt_char1 = AV23Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN502_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit4 = GXt_char1 ;
         GXt_char1 = AV24Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2424_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit5 = GXt_char1 ;
         GXt_char1 = AV25Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2412_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit6 = GXt_char1 ;
         GXt_char1 = AV26Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2400_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit7 = GXt_char1 ;
         GXt_char1 = AV27Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2180_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit8 = GXt_char1 ;
         GXt_char1 = AV28Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2464_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit9 = GXt_char1 ;
         GXt_char1 = AV30Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2180_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit11 = GXt_char1 ;
         GXt_char1 = AV31Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2464_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit12 = GXt_char1 ;
         GXt_char1 = AV32Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2440_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit13 = GXt_char1 ;
         GXt_char1 = AV33Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2045_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit14 = GXt_char1 ;
         GXt_char1 = AV34Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2354_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit15 = GXt_char1 ;
         GXt_char1 = AV35Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2440_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit16 = GXt_char1 ;
         GXt_char1 = AV36Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2440_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit17 = GXt_char1 ;
         GXt_char1 = AV37Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN201_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit18 = GXt_char1 ;
         GXt_char1 = AV38Lit19 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN201_", ""), (byte)(99), GXv_char2) ;
         rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit19 = GXt_char1 ;
         GXv_int3[0] = AV39Flag1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXIBAR", ""), GXv_int3) ;
         rst0014copy1_impl.this.AV39Flag1 = GXv_int3[0] ;
         AV42FlagPreMed = (byte)(0) ;
         GXv_int3[0] = AV42FlagPreMed ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int3) ;
         rst0014copy1_impl.this.AV42FlagPreMed = GXv_int3[0] ;
         GXt_int4 = AV48F_carvema ;
         GXv_int3[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int3) ;
         rst0014copy1_impl.this.GXt_int4 = GXv_int3[0] ;
         AV48F_carvema = GXt_int4 ;
         GXt_int4 = AV49Induyco ;
         GXv_int3[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INDUYC", ""), GXv_int3) ;
         rst0014copy1_impl.this.GXt_int4 = GXv_int3[0] ;
         AV49Induyco = GXt_int4 ;
         if ( AV42FlagPreMed == 0 )
         {
            GXt_char1 = AV29Lit10 ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN370_", ""), (byte)(99), GXv_char2) ;
            rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
            AV29Lit10 = GXt_char1 ;
         }
         else
         {
            GXt_char1 = AV29Lit10 ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN394_", ""), (byte)(99), GXv_char2) ;
            rst0014copy1_impl.this.GXt_char1 = GXv_char2[0] ;
            AV29Lit10 = GXt_char1 ;
         }
         /* Using cursor P09UC2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P09UC2_A407EmprNom[0] ;
            n407EmprNom = P09UC2_n407EmprNom[0] ;
            AV12NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV44Last_prd = "" ;
         AV46TovVfisF = DecimalUtil.doubleToDec(0) ;
         AV45TotVreaF = DecimalUtil.doubleToDec(0) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Byte.valueOf(AV50Valcodi) ,
                                              Byte.valueOf(AV51ValCodf) ,
                                              Byte.valueOf(A856ValCod) ,
                                              A719PrdNum ,
                                              A396EmprCod ,
                                              AV10PProd ,
                                              AV11UProd } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor P09UC3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV10PProd, AV11UProd, Byte.valueOf(AV50Valcodi), Byte.valueOf(AV51ValCodf)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A856ValCod = P09UC3_A856ValCod[0] ;
            A719PrdNum = P09UC3_A719PrdNum[0] ;
            A10881PrdLote = P09UC3_A10881PrdLote[0] ;
            A724PrdPreAct = P09UC3_A724PrdPreAct[0] ;
            A726PrdPreMed = P09UC3_A726PrdPreMed[0] ;
            A705PrdExiCC = P09UC3_A705PrdExiCC[0] ;
            A704PrdExiAlm = P09UC3_A704PrdExiAlm[0] ;
            A685PrdCanRes = P09UC3_A685PrdCanRes[0] ;
            A684PrdCanPen = P09UC3_A684PrdCanPen[0] ;
            A732PrdStkMinU = P09UC3_A732PrdStkMinU[0] ;
            A718PrdNom = P09UC3_A718PrdNom[0] ;
            AV60PrdLote = A10881PrdLote ;
            AV52PrdNum = A719PrdNum ;
            AV43PrecioI = A724PrdPreAct ;
            if ( AV42FlagPreMed == 1 )
            {
               AV43PrecioI = A726PrdPreMed ;
            }
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 )
            {
               AV13StkFis = A704PrdExiAlm.add(A705PrdExiCC) ;
               if ( (0==AV39Flag1) )
               {
                  AV14StkTeo = AV13StkFis.add(A684PrdCanPen).subtract(A685PrdCanRes) ;
               }
               else
               {
                  AV14StkTeo = AV13StkFis.subtract(A685PrdCanRes) ;
               }
            }
            else
            {
               AV40PrdComCod = A719PrdNum ;
               GXv_char2[0] = A396EmprCod ;
               GXv_char5[0] = AV40PrdComCod ;
               GXv_decimal6[0] = AV13StkFis ;
               GXv_decimal7[0] = AV14StkTeo ;
               GXv_int3[0] = AV39Flag1 ;
               new app.pexicomp(remoteHandle, context).execute( GXv_char2, GXv_char5, GXv_decimal6, GXv_decimal7, GXv_int3) ;
               rst0014copy1_impl.this.A396EmprCod = GXv_char2[0] ;
               rst0014copy1_impl.this.AV40PrdComCod = GXv_char5[0] ;
               rst0014copy1_impl.this.AV13StkFis = GXv_decimal6[0] ;
               rst0014copy1_impl.this.AV14StkTeo = GXv_decimal7[0] ;
               rst0014copy1_impl.this.AV39Flag1 = GXv_int3[0] ;
            }
            AV15VReal = GXutil.roundDecimal( AV13StkFis.multiply(AV43PrecioI), 2) ;
            AV16VFisi = GXutil.roundDecimal( AV14StkTeo.multiply(AV43PrecioI), 2) ;
            if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), AV44Last_prd) != 0 ) && ! (GXutil.strcmp("", AV44Last_prd)==0) && ( AV48F_carvema == 1 ) )
            {
               /* Execute user subroutine: 'TOTAL_F' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV45TotVreaF = DecimalUtil.doubleToDec(0) ;
               AV46TovVfisF = DecimalUtil.doubleToDec(0) ;
            }
            if ( GXutil.strcmp(AV41Cont_stk, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( AV13StkFis.doubleValue() <= 0 )
               {
                  h9UC0( false, 19) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 17, Gx_line+1, 62, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 68, Gx_line+2, 259, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A732PrdStkMinU, "ZZZZ9.99")), 261, Gx_line+1, 320, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999")), 328, Gx_line+1, 417, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999")), 424, Gx_line+1, 513, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13StkFis, "ZZZZZ9.99")), 542, Gx_line+1, 609, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14StkTeo, "ZZZZZ9.99")), 642, Gx_line+1, 709, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43PrecioI, "ZZ,ZZ9.999")), 718, Gx_line+1, 792, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15VReal, "ZZZ,ZZZ,ZZ9.99")), 799, Gx_line+1, 902, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16VFisi, "ZZZ,ZZZ,ZZ9.99")), 911, Gx_line+1, 1014, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60PrdLote, "")), 1021, Gx_line+0, 1131, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+19) ;
                  AV56Tot_res = AV56Tot_res.add(A685PrdCanRes) ;
                  AV57Tot_pen = AV57Tot_pen.add(A684PrdCanPen) ;
                  AV58tot_fis = AV58tot_fis.add(AV13StkFis) ;
                  AV59Tot_teo = AV59Tot_teo.add(AV14StkTeo) ;
               }
            }
            else
            {
               if ( GXutil.strcmp(AV41Cont_stk, httpContext.getMessage( "N", "")) == 0 )
               {
                  if ( AV13StkFis.doubleValue() > 0 )
                  {
                     h9UC0( false, 19) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52PrdNum, "")), 17, Gx_line+2, 62, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 68, Gx_line+2, 259, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A732PrdStkMinU, "ZZZZ9.99")), 261, Gx_line+2, 320, Gx_line+19, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999")), 328, Gx_line+2, 417, Gx_line+19, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999")), 424, Gx_line+2, 513, Gx_line+19, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13StkFis, "ZZZZZ9.99")), 542, Gx_line+2, 609, Gx_line+19, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14StkTeo, "ZZZZZ9.99")), 642, Gx_line+2, 709, Gx_line+19, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43PrecioI, "ZZ,ZZ9.999")), 718, Gx_line+2, 792, Gx_line+19, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15VReal, "ZZZ,ZZZ,ZZ9.99")), 799, Gx_line+2, 902, Gx_line+19, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16VFisi, "ZZZ,ZZZ,ZZ9.99")), 911, Gx_line+2, 1014, Gx_line+19, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60PrdLote, "")), 1021, Gx_line+0, 1131, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+19) ;
                     AV56Tot_res = AV56Tot_res.add(A685PrdCanRes) ;
                     AV57Tot_pen = AV57Tot_pen.add(A684PrdCanPen) ;
                     AV58tot_fis = AV58tot_fis.add(AV13StkFis) ;
                     AV59Tot_teo = AV59Tot_teo.add(AV14StkTeo) ;
                  }
               }
               else
               {
                  h9UC0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52PrdNum, "")), 17, Gx_line+0, 62, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 68, Gx_line+0, 259, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A732PrdStkMinU, "ZZZZ9.99")), 261, Gx_line+0, 320, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999")), 328, Gx_line+0, 417, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999")), 424, Gx_line+0, 513, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13StkFis, "ZZZZZ9.99")), 542, Gx_line+0, 609, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14StkTeo, "ZZZZZ9.99")), 642, Gx_line+0, 709, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43PrecioI, "ZZ,ZZ9.999")), 718, Gx_line+0, 792, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15VReal, "ZZZ,ZZZ,ZZ9.99")), 799, Gx_line+0, 902, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16VFisi, "ZZZ,ZZZ,ZZ9.99")), 911, Gx_line+0, 1014, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60PrdLote, "")), 1021, Gx_line+0, 1131, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV56Tot_res = AV56Tot_res.add(A685PrdCanRes) ;
                  AV57Tot_pen = AV57Tot_pen.add(A684PrdCanPen) ;
                  AV58tot_fis = AV58tot_fis.add(AV13StkFis) ;
                  AV59Tot_teo = AV59Tot_teo.add(AV14StkTeo) ;
               }
            }
            AV17TotVRea = AV17TotVRea.add(AV15VReal) ;
            AV18TotVFis = AV18TotVFis.add(AV16VFisi) ;
            AV46TovVfisF = AV46TovVfisF.add(AV16VFisi) ;
            AV45TotVreaF = AV45TotVreaF.add(AV15VReal) ;
            AV44Last_prd = GXutil.substring( A719PrdNum, 1, 1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV48F_carvema == 1 )
         {
            /* Execute user subroutine: 'TOTAL_F' */
            S111 ();
            if ( returnInSub )
            {
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         h9UC0( false, 26) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17TotVRea, "ZZZ,ZZZ,ZZ9.99")), 799, Gx_line+7, 902, Gx_line+24, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18TotVFis, "ZZZ,ZZZ,ZZ9.99")), 911, Gx_line+7, 1014, Gx_line+24, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56Tot_res, "Z,ZZZ,ZZ9.99")), 328, Gx_line+7, 417, Gx_line+24, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Tot_pen, "Z,ZZZ,ZZ9.99")), 424, Gx_line+7, 513, Gx_line+24, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV58tot_fis, "Z,ZZZ,ZZ9.99")), 520, Gx_line+7, 609, Gx_line+24, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV59Tot_teo, "Z,ZZZ,ZZ9.99")), 620, Gx_line+7, 709, Gx_line+24, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+26) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h9UC0( true, 0) ;
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
      /* 'TOTAL_F' Routine */
      returnInSub = false ;
      AV47GRPFAMDSC = "" ;
      /* Using cursor P09UC4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV44Last_prd});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A499GrpFamCod = P09UC4_A499GrpFamCod[0] ;
         A500GrpFamDsc = P09UC4_A500GrpFamDsc[0] ;
         n500GrpFamDsc = P09UC4_n500GrpFamDsc[0] ;
         AV47GRPFAMDSC = A500GrpFamDsc ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      h9UC0( false, 26) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45TotVreaF, "ZZZ,ZZZ,ZZ9.99")), 799, Gx_line+6, 902, Gx_line+23, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46TovVfisF, "ZZZ,ZZZ,ZZ9.99")), 911, Gx_line+6, 1014, Gx_line+23, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47GRPFAMDSC, "")), 516, Gx_line+6, 736, Gx_line+23, 0+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+26) ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'COMPUEST' Routine */
      returnInSub = false ;
      AV13StkFis = DecimalUtil.ZERO ;
      AV14StkTeo = DecimalUtil.ZERO ;
      /* Using cursor P09UC5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV40PrdComCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A688PrdComCod = P09UC5_A688PrdComCod[0] ;
         A705PrdExiCC = P09UC5_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09UC5_A704PrdExiAlm[0] ;
         A685PrdCanRes = P09UC5_A685PrdCanRes[0] ;
         A684PrdCanPen = P09UC5_A684PrdCanPen[0] ;
         A719PrdNum = P09UC5_A719PrdNum[0] ;
         A705PrdExiCC = P09UC5_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09UC5_A704PrdExiAlm[0] ;
         A685PrdCanRes = P09UC5_A685PrdCanRes[0] ;
         A684PrdCanPen = P09UC5_A684PrdCanPen[0] ;
         AV13StkFis = A704PrdExiAlm.add(A705PrdExiCC) ;
         if ( (0==AV39Flag1) )
         {
            AV14StkTeo = AV13StkFis.add(A684PrdCanPen).subtract(A685PrdCanRes) ;
         }
         else
         {
            AV14StkTeo = AV13StkFis.subtract(A685PrdCanRes) ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void h9UC0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12NomEmp, "")), 7, Gx_line+17, 258, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit1, "")), 753, Gx_line+17, 790, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 811, Gx_line+17, 870, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit2, "")), 899, Gx_line+17, 929, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 965, Gx_line+17, 1024, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit0, "")), 7, Gx_line+50, 425, Gx_line+70, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit3, "")), 895, Gx_line+50, 940, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 975, Gx_line+50, 1020, Gx_line+66, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit13, "")), 282, Gx_line+80, 319, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit14, "")), 371, Gx_line+80, 416, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit15, "")), 467, Gx_line+80, 512, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit16, "")), 571, Gx_line+80, 608, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit17, "")), 671, Gx_line+80, 708, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit18, "")), 864, Gx_line+80, 901, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit19, "")), 976, Gx_line+80, 1013, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit4, "")), 17, Gx_line+100, 76, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit5, "")), 276, Gx_line+100, 321, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit6, "")), 372, Gx_line+100, 417, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit7, "")), 475, Gx_line+100, 512, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit8, "")), 564, Gx_line+100, 609, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit9, "")), 656, Gx_line+100, 708, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit10, "")), 747, Gx_line+100, 792, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit11, "")), 857, Gx_line+100, 902, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit12, "")), 963, Gx_line+100, 1015, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Pgmname, "")), 476, Gx_line+50, 696, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+74, 1124, Gx_line+74, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+120, 1124, Gx_line+120, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 1021, Gx_line+100, 1051, Gx_line+117, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+124) ;
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
      AV9ImpCod = "" ;
      AV10PProd = "" ;
      AV11UProd = "" ;
      AV41Cont_stk = "" ;
      AV19Lit0 = "" ;
      AV20Lit1 = "" ;
      AV21Lit2 = "" ;
      AV22Lit3 = "" ;
      AV23Lit4 = "" ;
      AV24Lit5 = "" ;
      AV25Lit6 = "" ;
      AV26Lit7 = "" ;
      AV27Lit8 = "" ;
      AV28Lit9 = "" ;
      AV30Lit11 = "" ;
      AV31Lit12 = "" ;
      AV32Lit13 = "" ;
      AV33Lit14 = "" ;
      AV34Lit15 = "" ;
      AV35Lit16 = "" ;
      AV36Lit17 = "" ;
      AV37Lit18 = "" ;
      AV38Lit19 = "" ;
      AV29Lit10 = "" ;
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P09UC2_A396EmprCod = new String[] {""} ;
      P09UC2_A407EmprNom = new String[] {""} ;
      P09UC2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV12NomEmp = "" ;
      AV44Last_prd = "" ;
      AV46TovVfisF = DecimalUtil.ZERO ;
      AV45TotVreaF = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      P09UC3_A396EmprCod = new String[] {""} ;
      P09UC3_A856ValCod = new byte[1] ;
      P09UC3_A719PrdNum = new String[] {""} ;
      P09UC3_A10881PrdLote = new String[] {""} ;
      P09UC3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UC3_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UC3_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UC3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UC3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UC3_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UC3_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UC3_A718PrdNom = new String[] {""} ;
      A10881PrdLote = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV60PrdLote = "" ;
      AV52PrdNum = "" ;
      AV43PrecioI = DecimalUtil.ZERO ;
      AV13StkFis = DecimalUtil.ZERO ;
      AV14StkTeo = DecimalUtil.ZERO ;
      AV40PrdComCod = "" ;
      GXv_char2 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int3 = new byte[1] ;
      AV15VReal = DecimalUtil.ZERO ;
      AV16VFisi = DecimalUtil.ZERO ;
      AV56Tot_res = DecimalUtil.ZERO ;
      AV57Tot_pen = DecimalUtil.ZERO ;
      AV58tot_fis = DecimalUtil.ZERO ;
      AV59Tot_teo = DecimalUtil.ZERO ;
      AV17TotVRea = DecimalUtil.ZERO ;
      AV18TotVFis = DecimalUtil.ZERO ;
      AV47GRPFAMDSC = "" ;
      P09UC4_A396EmprCod = new String[] {""} ;
      P09UC4_A499GrpFamCod = new byte[1] ;
      P09UC4_A500GrpFamDsc = new String[] {""} ;
      P09UC4_n500GrpFamDsc = new boolean[] {false} ;
      A500GrpFamDsc = "" ;
      P09UC5_A396EmprCod = new String[] {""} ;
      P09UC5_A688PrdComCod = new String[] {""} ;
      P09UC5_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UC5_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UC5_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UC5_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UC5_A719PrdNum = new String[] {""} ;
      A688PrdComCod = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV68Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rst0014copy1__default(),
         new Object[] {
             new Object[] {
            P09UC2_A396EmprCod, P09UC2_A407EmprNom, P09UC2_n407EmprNom
            }
            , new Object[] {
            P09UC3_A396EmprCod, P09UC3_A856ValCod, P09UC3_A719PrdNum, P09UC3_A10881PrdLote, P09UC3_A724PrdPreAct, P09UC3_A726PrdPreMed, P09UC3_A705PrdExiCC, P09UC3_A704PrdExiAlm, P09UC3_A685PrdCanRes, P09UC3_A684PrdCanPen,
            P09UC3_A732PrdStkMinU, P09UC3_A718PrdNom
            }
            , new Object[] {
            P09UC4_A396EmprCod, P09UC4_A499GrpFamCod, P09UC4_A500GrpFamDsc, P09UC4_n500GrpFamDsc
            }
            , new Object[] {
            P09UC5_A396EmprCod, P09UC5_A688PrdComCod, P09UC5_A705PrdExiCC, P09UC5_A704PrdExiAlm, P09UC5_A685PrdCanRes, P09UC5_A684PrdCanPen, P09UC5_A719PrdNum
            }
         }
      );
      AV68Pgmname = "RST0014Copy1" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV68Pgmname = "RST0014Copy1" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV50Valcodi ;
   private byte AV51ValCodf ;
   private byte AV39Flag1 ;
   private byte AV42FlagPreMed ;
   private byte AV48F_carvema ;
   private byte AV49Induyco ;
   private byte GXt_int4 ;
   private byte A856ValCod ;
   private byte GXv_int3[] ;
   private byte A499GrpFamCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV46TovVfisF ;
   private java.math.BigDecimal AV45TotVreaF ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal AV43PrecioI ;
   private java.math.BigDecimal AV13StkFis ;
   private java.math.BigDecimal AV14StkTeo ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV15VReal ;
   private java.math.BigDecimal AV16VFisi ;
   private java.math.BigDecimal AV56Tot_res ;
   private java.math.BigDecimal AV57Tot_pen ;
   private java.math.BigDecimal AV58tot_fis ;
   private java.math.BigDecimal AV59Tot_teo ;
   private java.math.BigDecimal AV17TotVRea ;
   private java.math.BigDecimal AV18TotVFis ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV9ImpCod ;
   private String AV10PProd ;
   private String AV11UProd ;
   private String AV41Cont_stk ;
   private String AV19Lit0 ;
   private String AV20Lit1 ;
   private String AV21Lit2 ;
   private String AV22Lit3 ;
   private String AV23Lit4 ;
   private String AV24Lit5 ;
   private String AV25Lit6 ;
   private String AV26Lit7 ;
   private String AV27Lit8 ;
   private String AV28Lit9 ;
   private String AV30Lit11 ;
   private String AV31Lit12 ;
   private String AV32Lit13 ;
   private String AV33Lit14 ;
   private String AV34Lit15 ;
   private String AV35Lit16 ;
   private String AV36Lit17 ;
   private String AV37Lit18 ;
   private String AV38Lit19 ;
   private String AV29Lit10 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV12NomEmp ;
   private String AV44Last_prd ;
   private String A719PrdNum ;
   private String A10881PrdLote ;
   private String A718PrdNom ;
   private String AV60PrdLote ;
   private String AV52PrdNum ;
   private String AV40PrdComCod ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String AV47GRPFAMDSC ;
   private String A500GrpFamDsc ;
   private String A688PrdComCod ;
   private String Gx_time ;
   private String AV68Pgmname ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n500GrpFamDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P09UC2_A396EmprCod ;
   private String[] P09UC2_A407EmprNom ;
   private boolean[] P09UC2_n407EmprNom ;
   private String[] P09UC3_A396EmprCod ;
   private byte[] P09UC3_A856ValCod ;
   private String[] P09UC3_A719PrdNum ;
   private String[] P09UC3_A10881PrdLote ;
   private java.math.BigDecimal[] P09UC3_A724PrdPreAct ;
   private java.math.BigDecimal[] P09UC3_A726PrdPreMed ;
   private java.math.BigDecimal[] P09UC3_A705PrdExiCC ;
   private java.math.BigDecimal[] P09UC3_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09UC3_A685PrdCanRes ;
   private java.math.BigDecimal[] P09UC3_A684PrdCanPen ;
   private java.math.BigDecimal[] P09UC3_A732PrdStkMinU ;
   private String[] P09UC3_A718PrdNom ;
   private String[] P09UC4_A396EmprCod ;
   private byte[] P09UC4_A499GrpFamCod ;
   private String[] P09UC4_A500GrpFamDsc ;
   private boolean[] P09UC4_n500GrpFamDsc ;
   private String[] P09UC5_A396EmprCod ;
   private String[] P09UC5_A688PrdComCod ;
   private java.math.BigDecimal[] P09UC5_A705PrdExiCC ;
   private java.math.BigDecimal[] P09UC5_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09UC5_A685PrdCanRes ;
   private java.math.BigDecimal[] P09UC5_A684PrdCanPen ;
   private String[] P09UC5_A719PrdNum ;
}

final  class rst0014copy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09UC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV50Valcodi ,
                                          byte AV51ValCodf ,
                                          byte A856ValCod ,
                                          String A719PrdNum ,
                                          String A396EmprCod ,
                                          String AV10PProd ,
                                          String AV11UProd )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[5];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, ValCod, PrdNum, PrdLote, PrdPreAct, PrdPreMed, PrdExiCC, PrdExiAlm, PrdCanRes, PrdCanPen, PrdStkMinU, PrdNom FROM TXPPRODUC" ;
      addWhere(sWhereString, "(EmprCod = ? and PrdNum >= ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(PrdNum)))) >= 5)");
      addWhere(sWhereString, "(PrdNum <= ?)");
      if ( ! (0==AV50Valcodi) )
      {
         addWhere(sWhereString, "(ValCod >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV51ValCodf) )
      {
         addWhere(sWhereString, "(ValCod <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrdNum" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P09UC3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09UC2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09UC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UC4", "SELECT EmprCod, GrpFamCod, GrpFamDsc FROM TXPGRUFAM WHERE (EmprCod = ?) AND (GrpFamCod = TO_NUMBER(NVL(TRIM(RTRIM(LTRIM(?))), '0'))) ORDER BY EmprCod, GrpFamCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UC5", "SELECT T1.EmprCod, T1.PrdComCod, T2.PrdExiCC, T2.PrdExiAlm, T2.PrdCanRes, T2.PrdCanPen, T1.PrdNum FROM (TXPLPRDCO T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PrdComCod = ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
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
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

