package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rprdt11df_impl extends GXWebReport
{
   public rprdt11df_impl( com.genexus.internet.HttpContext context )
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
            AV182PMaqCod = httpContext.GetPar( "PMaqCod") ;
            AV210UMaqCod = httpContext.GetPar( "UMaqCod") ;
            AV134Hisprodti = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprodti")) ;
            AV133Hisprodtf = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprodtf")) ;
            AV188TipMaqCod = httpContext.GetPar( "TipMaqCod") ;
            AV111ArtCodi = httpContext.GetPar( "ArtCodi") ;
            AV110ArtCodf = httpContext.GetPar( "ArtCodf") ;
            AV119Barcolnomi = httpContext.GetPar( "Barcolnomi") ;
            AV118Barcolnomf = httpContext.GetPar( "Barcolnomf") ;
            AV121Barcolnumi = (int)(GXutil.lval( httpContext.GetPar( "Barcolnumi"))) ;
            AV120Barcolnumf = (int)(GXutil.lval( httpContext.GetPar( "Barcolnumf"))) ;
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         GXt_char1 = AV145Lit01 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT561_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV145Lit01 = GXt_char1 ;
         GXt_char1 = AV146Lit02 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2469_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV146Lit02 = GXt_char1 ;
         GXt_char1 = AV144Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV214Pgmname, (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV144Lit0 = GXt_char1 ;
         GXt_char1 = AV147Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV147Lit1 = GXt_char1 ;
         GXt_char1 = AV158Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV158Lit2 = GXt_char1 ;
         GXt_char1 = AV161Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV161Lit3 = GXt_char1 ;
         GXt_char1 = AV162Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2097_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV162Lit4 = GXt_char1 ;
         GXt_char1 = AV163Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2187_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV163Lit5 = GXt_char1 ;
         GXt_char1 = AV164Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV164Lit6 = GXt_char1 ;
         GXt_char1 = AV165Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV165Lit7 = GXt_char1 ;
         GXt_char1 = AV166Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2465_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV166Lit8 = GXt_char1 ;
         GXt_char1 = AV167Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV167Lit9 = GXt_char1 ;
         GXt_char1 = AV148Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT516_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV148Lit10 = GXt_char1 ;
         GXt_char1 = AV149Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2465_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV149Lit11 = GXt_char1 ;
         GXt_char1 = AV150Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT516_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV150Lit12 = GXt_char1 ;
         GXt_char1 = AV151Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN288_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV151Lit13 = GXt_char1 ;
         GXt_char1 = AV152Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT399_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV152Lit14 = GXt_char1 ;
         GXt_char1 = AV153Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT516_", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV153Lit15 = GXt_char1 ;
         GXt_char1 = AV154Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN017", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV154Lit16 = GXt_char1 ;
         GXt_char1 = AV155Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN018", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV155Lit17 = GXt_char1 ;
         GXt_char1 = AV156Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN017", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV156Lit18 = GXt_char1 ;
         GXt_char1 = AV157Lit19 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN018", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV157Lit19 = GXt_char1 ;
         GXt_char1 = AV159Lit20 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN019", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV159Lit20 = GXt_char1 ;
         GXt_char1 = AV160Lit21 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN019", ""), (byte)(99), GXv_char2) ;
         rprdt11df_impl.this.GXt_char1 = GXv_char2[0] ;
         AV160Lit21 = GXt_char1 ;
         GXv_int3[0] = AV184Texknit ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXKNI", ""), GXv_int3) ;
         rprdt11df_impl.this.AV184Texknit = GXv_int3[0] ;
         GXv_int3[0] = AV125F_tintutex ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int3) ;
         rprdt11df_impl.this.AV125F_tintutex = GXv_int3[0] ;
         /* Using cursor P07RZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07RZ2_A407EmprNom[0] ;
            n407EmprNom = P07RZ2_n407EmprNom[0] ;
            AV124EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV190Tot_Kgs_Ge = DecimalUtil.doubleToDec(0) ;
         AV191Tot_kgs_Gi = DecimalUtil.doubleToDec(0) ;
         AV197TotKG = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P07RZ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV182PMaqCod, AV134Hisprodti, AV133Hisprodtf, AV188TipMaqCod, AV188TipMaqCod, AV111ArtCodi, AV110ArtCodf, AV119Barcolnomi, AV118Barcolnomf, Integer.valueOf(AV121Barcolnumi), Integer.valueOf(AV120Barcolnumf), AV210UMaqCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A129BarCod = P07RZ3_A129BarCod[0] ;
            A132BarCodReo = P07RZ3_A132BarCodReo[0] ;
            A130BarCodPar = P07RZ3_A130BarCodPar[0] ;
            A136BarColNum = P07RZ3_A136BarColNum[0] ;
            A135BarColNom = P07RZ3_A135BarColNom[0] ;
            A212BarSer = P07RZ3_A212BarSer[0] ;
            A1011TipMaqCod = P07RZ3_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P07RZ3_n1011TipMaqCod[0] ;
            A4441HisProDTF = P07RZ3_A4441HisProDTF[0] ;
            n4441HisProDTF = P07RZ3_n4441HisProDTF[0] ;
            A602MaqCod = P07RZ3_A602MaqCod[0] ;
            A656ParCod = P07RZ3_A656ParCod[0] ;
            n656ParCod = P07RZ3_n656ParCod[0] ;
            A1525HisProKgr = P07RZ3_A1525HisProKgr[0] ;
            A3612HisProReo = P07RZ3_A3612HisProReo[0] ;
            A558HisProFec = P07RZ3_A558HisProFec[0] ;
            A561HisProLin = P07RZ3_A561HisProLin[0] ;
            A1011TipMaqCod = P07RZ3_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P07RZ3_n1011TipMaqCod[0] ;
            A136BarColNum = P07RZ3_A136BarColNum[0] ;
            A135BarColNom = P07RZ3_A135BarColNom[0] ;
            A212BarSer = P07RZ3_A212BarSer[0] ;
            if ( A656ParCod == 0 )
            {
               AV197TotKG = AV197TotKG.add(A1525HisProKgr) ;
               if ( A3612HisProReo == 2 )
               {
                  AV190Tot_Kgs_Ge = AV190Tot_Kgs_Ge.add(A1525HisProKgr) ;
               }
               if ( A3612HisProReo == 1 )
               {
                  AV191Tot_kgs_Gi = AV191Tot_kgs_Gi.add(A1525HisProKgr) ;
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV194Tot_KGU = AV197TotKG.subtract(AV190Tot_Kgs_Ge).subtract(AV191Tot_kgs_Gi) ;
         AV198TotKgs = DecimalUtil.doubleToDec(0) ;
         AV202TotMinT = 0 ;
         AV172NTin = 0 ;
         AV195Tot_N_Ge = 0 ;
         AV196Tot_N_Gi = 0 ;
         /* Using cursor P07RZ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV182PMaqCod, AV134Hisprodti, AV133Hisprodtf, AV188TipMaqCod, AV188TipMaqCod, AV111ArtCodi, AV110ArtCodf, AV119Barcolnomi, AV118Barcolnomf, Integer.valueOf(AV121Barcolnumi), Integer.valueOf(AV120Barcolnumf), AV210UMaqCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            brk7RZ5 = false ;
            A602MaqCod = P07RZ4_A602MaqCod[0] ;
            A556HisProEst = P07RZ4_A556HisProEst[0] ;
            A129BarCod = P07RZ4_A129BarCod[0] ;
            A132BarCodReo = P07RZ4_A132BarCodReo[0] ;
            A130BarCodPar = P07RZ4_A130BarCodPar[0] ;
            A1525HisProKgr = P07RZ4_A1525HisProKgr[0] ;
            A3612HisProReo = P07RZ4_A3612HisProReo[0] ;
            A656ParCod = P07RZ4_A656ParCod[0] ;
            n656ParCod = P07RZ4_n656ParCod[0] ;
            A503GruOpeCod = P07RZ4_A503GruOpeCod[0] ;
            A3610HisProLot = P07RZ4_A3610HisProLot[0] ;
            A136BarColNum = P07RZ4_A136BarColNum[0] ;
            A135BarColNom = P07RZ4_A135BarColNom[0] ;
            A212BarSer = P07RZ4_A212BarSer[0] ;
            A1011TipMaqCod = P07RZ4_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P07RZ4_n1011TipMaqCod[0] ;
            A606MaqDsc = P07RZ4_A606MaqDsc[0] ;
            n606MaqDsc = P07RZ4_n606MaqDsc[0] ;
            A4440HisProDTI = P07RZ4_A4440HisProDTI[0] ;
            n4440HisProDTI = P07RZ4_n4440HisProDTI[0] ;
            A4441HisProDTF = P07RZ4_A4441HisProDTF[0] ;
            n4441HisProDTF = P07RZ4_n4441HisProDTF[0] ;
            A558HisProFec = P07RZ4_A558HisProFec[0] ;
            A561HisProLin = P07RZ4_A561HisProLin[0] ;
            A1011TipMaqCod = P07RZ4_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P07RZ4_n1011TipMaqCod[0] ;
            A606MaqDsc = P07RZ4_A606MaqDsc[0] ;
            n606MaqDsc = P07RZ4_n606MaqDsc[0] ;
            A136BarColNum = P07RZ4_A136BarColNum[0] ;
            A135BarColNom = P07RZ4_A135BarColNom[0] ;
            A212BarSer = P07RZ4_A212BarSer[0] ;
            if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
            {
               A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            }
            else
            {
               A5605HisProTr2 = (short)(0) ;
            }
            AV198TotKgs = DecimalUtil.doubleToDec(0) ;
            AV189Tot_kgs_e = DecimalUtil.doubleToDec(0) ;
            AV192Tot_kgs_i = DecimalUtil.doubleToDec(0) ;
            AV202TotMinT = 0 ;
            AV172NTin = 0 ;
            AV205Totmt_i = 0 ;
            AV175Ntin_i = 0 ;
            AV203Totmt_e = 0 ;
            AV173Ntin_e = 0 ;
            AV135HisProLot = "" ;
            AV132GruOpeCod = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P07RZ4_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P07RZ4_A602MaqCod[0], A602MaqCod) == 0 ) )
            {
               brk7RZ5 = false ;
               A556HisProEst = P07RZ4_A556HisProEst[0] ;
               A129BarCod = P07RZ4_A129BarCod[0] ;
               A132BarCodReo = P07RZ4_A132BarCodReo[0] ;
               A130BarCodPar = P07RZ4_A130BarCodPar[0] ;
               A1525HisProKgr = P07RZ4_A1525HisProKgr[0] ;
               A3612HisProReo = P07RZ4_A3612HisProReo[0] ;
               A656ParCod = P07RZ4_A656ParCod[0] ;
               n656ParCod = P07RZ4_n656ParCod[0] ;
               A503GruOpeCod = P07RZ4_A503GruOpeCod[0] ;
               A3610HisProLot = P07RZ4_A3610HisProLot[0] ;
               A4440HisProDTI = P07RZ4_A4440HisProDTI[0] ;
               n4440HisProDTI = P07RZ4_n4440HisProDTI[0] ;
               A4441HisProDTF = P07RZ4_A4441HisProDTF[0] ;
               n4441HisProDTF = P07RZ4_n4441HisProDTF[0] ;
               A558HisProFec = P07RZ4_A558HisProFec[0] ;
               A561HisProLin = P07RZ4_A561HisProLin[0] ;
               if ( (( A4441HisProDTF.after( AV134Hisprodti ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV134Hisprodti) )) && (( A4441HisProDTF.before( AV133Hisprodtf ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV133Hisprodtf) )) )
               {
                  if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                  {
                     A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                  }
                  else
                  {
                     A5605HisProTr2 = (short)(0) ;
                  }
                  AV136HisProTre = (short)(0) ;
                  if ( A556HisProEst != 0 )
                  {
                     AV136HisProTre = A5605HisProTr2 ;
                  }
                  AV112BarCod = A129BarCod ;
                  AV116BarCodReo = A132BarCodReo ;
                  AV114BarCodPar = A130BarCodPar ;
                  AV128FlagMarca = (byte)(0) ;
                  /* Execute user subroutine: 'LEOHDR' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(2);
                     pr_default.close(2);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV138HmP = DecimalUtil.doubleToDec(AV136HisProTre/ (double) (60)) ;
                  AV137HmF = DecimalUtil.doubleToDec(AV185TiempoF/ (double) (60)) ;
                  if ( A656ParCod == 0 )
                  {
                     AV198TotKgs = AV198TotKgs.add(A1525HisProKgr) ;
                     if ( A3612HisProReo == 2 )
                     {
                        AV189Tot_kgs_e = AV189Tot_kgs_e.add(A1525HisProKgr) ;
                     }
                     if ( A3612HisProReo == 1 )
                     {
                        AV192Tot_kgs_i = AV192Tot_kgs_i.add(A1525HisProKgr) ;
                     }
                  }
                  if ( GXutil.strcmp(AV135HisProLot, A3610HisProLot) != 0 )
                  {
                     AV172NTin = (int)(AV172NTin+1) ;
                     AV202TotMinT = (int)(AV202TotMinT+AV136HisProTre) ;
                  }
                  if ( ( GXutil.strcmp(AV135HisProLot, A3610HisProLot) == 0 ) && ( AV132GruOpeCod != A503GruOpeCod ) )
                  {
                     AV202TotMinT = (int)(AV202TotMinT+AV136HisProTre) ;
                  }
                  AV135HisProLot = A3610HisProLot ;
                  AV132GruOpeCod = A503GruOpeCod ;
               }
               brk7RZ5 = true ;
               pr_default.readNext(2);
            }
            AV178PesMedPar = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV172NTin) )
            {
               AV178PesMedPar = ((0==AV172NTin) ? DecimalUtil.doubleToDec(0) : AV198TotKgs.divide(DecimalUtil.doubleToDec(AV172NTin), 18, java.math.RoundingMode.DOWN)) ;
            }
            AV141HorRea = (short)(GXutil.Int( AV202TotMinT/ (double) (60))) ;
            AV142HorReaint = (short)(GXutil.Int( AV141HorRea)) ;
            AV169MinRea = (byte)(AV202TotMinT-(AV142HorReaint*60)) ;
            AV170MinRea2 = DecimalUtil.doubleToDec(AV169MinRea/ (double) (100)) ;
            AV138HmP = DecimalUtil.doubleToDec(AV142HorReaint).add(AV170MinRea2) ;
            AV186TiempoNP = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV172NTin) )
            {
               AV186TiempoNP = ((0==AV172NTin) ? DecimalUtil.doubleToDec(0) : AV138HmP.divide(DecimalUtil.doubleToDec(AV172NTin), 18, java.math.RoundingMode.DOWN)) ;
            }
            AV183Porc_ = DecimalUtil.doubleToDec(0) ;
            AV183Porc_ = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV197TotKG)==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV198TotKgs.divide(AV197TotKG, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 1)) ;
            AV123Dias = DecimalUtil.doubleToDec(AV202TotMinT/ (double) (1440)) ;
            if ( AV125F_tintutex == 0 )
            {
               h7RZ0( false, 17) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 8, Gx_line+0, 53, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 58, Gx_line+0, 176, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV198TotKgs, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+0, 289, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV202TotMinT), "ZZZZZ9")), 353, Gx_line+0, 398, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138HmP, "ZZZ,ZZ9.99")), 414, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV172NTin), "ZZZZZ9")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV186TiempoNP, "Z,ZZ9.99")), 578, Gx_line+0, 637, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV178PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+0, 759, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV183Porc_, "ZZ9.9")), 302, Gx_line+0, 339, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV183Porc_, "ZZ9.9")), 302, Gx_line+1, 339, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            else
            {
               h7RZ0( false, 17) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 8, Gx_line+0, 53, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 58, Gx_line+0, 176, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV198TotKgs, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+0, 289, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138HmP, "ZZZ,ZZ9.99")), 414, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV172NTin), "ZZZZZ9")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV186TiempoNP, "Z,ZZ9.99")), 578, Gx_line+0, 637, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV178PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+0, 759, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV123Dias, "ZZ9.99")), 353, Gx_line+0, 398, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV183Porc_, "ZZ9.9")), 302, Gx_line+0, 339, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV178PesMedPar = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV175Ntin_i) )
            {
               AV178PesMedPar = ((0==AV175Ntin_i) ? DecimalUtil.doubleToDec(0) : AV192Tot_kgs_i.divide(DecimalUtil.doubleToDec(AV175Ntin_i), 18, java.math.RoundingMode.DOWN)) ;
            }
            AV141HorRea = (short)(GXutil.Int( AV205Totmt_i/ (double) (60))) ;
            AV142HorReaint = (short)(GXutil.Int( AV141HorRea)) ;
            AV169MinRea = (byte)(AV205Totmt_i-(AV142HorReaint*60)) ;
            AV170MinRea2 = DecimalUtil.doubleToDec(AV169MinRea/ (double) (100)) ;
            AV138HmP = DecimalUtil.doubleToDec(AV142HorReaint).add(AV170MinRea2) ;
            AV186TiempoNP = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV175Ntin_i) )
            {
               AV186TiempoNP = ((0==AV175Ntin_i) ? DecimalUtil.doubleToDec(0) : AV138HmP.divide(DecimalUtil.doubleToDec(AV175Ntin_i), 18, java.math.RoundingMode.DOWN)) ;
            }
            AV183Porc_ = DecimalUtil.doubleToDec(0) ;
            AV183Porc_ = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV198TotKgs)==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV192Tot_kgs_i.divide(AV198TotKgs, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 1)) ;
            AV123Dias = DecimalUtil.doubleToDec(AV205Totmt_i/ (double) (1440)) ;
            if ( AV125F_tintutex == 0 )
            {
               h7RZ0( false, 17) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV192Tot_kgs_i, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+0, 289, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV205Totmt_i), "ZZZZZ9")), 353, Gx_line+0, 398, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138HmP, "ZZZ,ZZ9.99")), 414, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV175Ntin_i), "ZZZZZ9")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV186TiempoNP, "Z,ZZ9.99")), 578, Gx_line+0, 637, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV178PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+0, 759, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV154Lit16, "")), 27, Gx_line+0, 174, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV183Porc_, "ZZ9.9")), 302, Gx_line+0, 339, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            else
            {
               h7RZ0( false, 17) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV192Tot_kgs_i, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+0, 289, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138HmP, "ZZZ,ZZ9.99")), 414, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV175Ntin_i), "ZZZZZ9")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV186TiempoNP, "Z,ZZ9.99")), 578, Gx_line+0, 637, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV178PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+0, 759, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV154Lit16, "")), 27, Gx_line+0, 174, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV183Porc_, "ZZ9.9")), 302, Gx_line+0, 339, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV123Dias, "ZZ9.99")), 353, Gx_line+1, 398, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV178PesMedPar = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV173Ntin_e) )
            {
               AV178PesMedPar = ((0==AV173Ntin_e) ? DecimalUtil.doubleToDec(0) : AV189Tot_kgs_e.divide(DecimalUtil.doubleToDec(AV173Ntin_e), 18, java.math.RoundingMode.DOWN)) ;
            }
            AV141HorRea = (short)(GXutil.Int( AV203Totmt_e/ (double) (60))) ;
            AV142HorReaint = (short)(GXutil.Int( AV141HorRea)) ;
            AV169MinRea = (byte)(AV203Totmt_e-(AV142HorReaint*60)) ;
            AV170MinRea2 = DecimalUtil.doubleToDec(AV169MinRea/ (double) (100)) ;
            AV138HmP = DecimalUtil.doubleToDec(AV142HorReaint).add(AV170MinRea2) ;
            AV186TiempoNP = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV173Ntin_e) )
            {
               AV186TiempoNP = ((0==AV173Ntin_e) ? DecimalUtil.doubleToDec(0) : AV138HmP.divide(DecimalUtil.doubleToDec(AV173Ntin_e), 18, java.math.RoundingMode.DOWN)) ;
            }
            AV183Porc_ = DecimalUtil.doubleToDec(0) ;
            AV183Porc_ = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV198TotKgs)==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV189Tot_kgs_e.divide(AV198TotKgs, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 1)) ;
            AV123Dias = DecimalUtil.doubleToDec(AV203Totmt_e/ (double) (1440)) ;
            if ( AV125F_tintutex == 0 )
            {
               h7RZ0( false, 17) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV189Tot_kgs_e, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+0, 289, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV203Totmt_e), "ZZZZZ9")), 353, Gx_line+0, 398, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138HmP, "ZZZ,ZZ9.99")), 414, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV173Ntin_e), "ZZZZZ9")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV186TiempoNP, "Z,ZZ9.99")), 578, Gx_line+0, 637, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV178PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+0, 759, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV155Lit17, "")), 27, Gx_line+0, 174, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV183Porc_, "ZZ9.9")), 302, Gx_line+0, 339, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            else
            {
               h7RZ0( false, 17) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV189Tot_kgs_e, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+0, 289, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138HmP, "ZZZ,ZZ9.99")), 414, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV173Ntin_e), "ZZZZZ9")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV186TiempoNP, "Z,ZZ9.99")), 578, Gx_line+0, 637, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV178PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+0, 759, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV155Lit17, "")), 27, Gx_line+0, 174, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV183Porc_, "ZZ9.9")), 302, Gx_line+0, 339, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV123Dias, "ZZ9.99")), 353, Gx_line+1, 398, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV193Tot_kgs_u = AV198TotKgs.subtract(AV189Tot_kgs_e).subtract(AV192Tot_kgs_i) ;
            AV176NTin_u = (int)(AV172NTin-AV175Ntin_i-AV173Ntin_e) ;
            AV206Totmt_u = (int)(AV202TotMinT-AV205Totmt_i-AV203Totmt_e) ;
            AV178PesMedPar = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV176NTin_u) )
            {
               AV178PesMedPar = ((0==AV176NTin_u) ? DecimalUtil.doubleToDec(0) : AV193Tot_kgs_u.divide(DecimalUtil.doubleToDec(AV176NTin_u), 18, java.math.RoundingMode.DOWN)) ;
            }
            AV141HorRea = (short)(GXutil.Int( AV206Totmt_u/ (double) (60))) ;
            AV142HorReaint = (short)(GXutil.Int( AV141HorRea)) ;
            AV169MinRea = (byte)(AV206Totmt_u-(AV142HorReaint*60)) ;
            AV170MinRea2 = DecimalUtil.doubleToDec(AV169MinRea/ (double) (100)) ;
            AV138HmP = DecimalUtil.doubleToDec(AV142HorReaint).add(AV170MinRea2) ;
            AV186TiempoNP = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV176NTin_u) )
            {
               AV186TiempoNP = ((0==AV176NTin_u) ? DecimalUtil.doubleToDec(0) : AV138HmP.divide(DecimalUtil.doubleToDec(AV176NTin_u), 18, java.math.RoundingMode.DOWN)) ;
            }
            AV183Porc_ = DecimalUtil.doubleToDec(0) ;
            AV183Porc_ = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV198TotKgs)==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV193Tot_kgs_u.divide(AV198TotKgs, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 1)) ;
            AV123Dias = DecimalUtil.doubleToDec(AV206Totmt_u/ (double) (1440)) ;
            if ( AV125F_tintutex == 0 )
            {
               h7RZ0( false, 19) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV160Lit21, "")), 27, Gx_line+0, 174, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV193Tot_kgs_u, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+0, 289, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV206Totmt_u), "ZZZZZ9")), 353, Gx_line+0, 398, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138HmP, "ZZZ,ZZ9.99")), 414, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV176NTin_u), "ZZZZZ9")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV186TiempoNP, "Z,ZZ9.99")), 578, Gx_line+0, 637, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV178PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+0, 759, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+16, 789, Gx_line+16, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV183Porc_, "ZZ9.9")), 302, Gx_line+0, 339, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
            }
            else
            {
               h7RZ0( false, 20) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 128, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV160Lit21, "")), 27, Gx_line+0, 174, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 128, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV193Tot_kgs_u, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+0, 289, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV123Dias, "ZZ9.99")), 353, Gx_line+0, 398, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138HmP, "ZZZ,ZZ9.99")), 414, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV176NTin_u), "ZZZZZ9")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV186TiempoNP, "Z,ZZ9.99")), 578, Gx_line+0, 637, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV178PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+0, 759, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+16, 789, Gx_line+16, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 128, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV183Porc_, "ZZ9.9")), 302, Gx_line+0, 339, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
            }
            AV201TotMinG = (int)(AV201TotMinG+AV202TotMinT) ;
            AV207TotNTinG = (int)(AV207TotNTinG+AV172NTin) ;
            AV200Totm_Gi = (int)(AV200Totm_Gi+AV205Totmt_i) ;
            AV199Totm_Ge = (int)(AV199Totm_Ge+AV203Totmt_e) ;
            AV196Tot_N_Gi = (int)(AV196Tot_N_Gi+AV175Ntin_i) ;
            AV195Tot_N_Ge = (int)(AV195Tot_N_Ge+AV173Ntin_e) ;
            if ( ! brk7RZ5 )
            {
               brk7RZ5 = true ;
               pr_default.readNext(2);
            }
         }
         pr_default.close(2);
         AV178PesMedPar = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV207TotNTinG) )
         {
            AV178PesMedPar = ((0==AV207TotNTinG) ? DecimalUtil.doubleToDec(0) : AV197TotKG.divide(DecimalUtil.doubleToDec(AV207TotNTinG), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV141HorRea = (short)(GXutil.Int( AV201TotMinG/ (double) (60))) ;
         AV142HorReaint = (short)(GXutil.Int( AV141HorRea)) ;
         AV169MinRea = (byte)(AV201TotMinG-(AV142HorReaint*60)) ;
         AV170MinRea2 = DecimalUtil.doubleToDec(AV169MinRea/ (double) (100)) ;
         AV138HmP = DecimalUtil.doubleToDec(AV142HorReaint).add(AV170MinRea2) ;
         AV186TiempoNP = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV207TotNTinG) )
         {
            AV186TiempoNP = ((0==AV207TotNTinG) ? DecimalUtil.doubleToDec(0) : AV138HmP.divide(DecimalUtil.doubleToDec(AV207TotNTinG), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV123Dias = DecimalUtil.doubleToDec(AV201TotMinG/ (double) (1440)) ;
         if ( AV125F_tintutex == 0 )
         {
            h7RZ0( false, 45) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV197TotKG, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+17, 289, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV201TotMinG), "ZZZZZZZ9")), 353, Gx_line+17, 397, Gx_line+34, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138HmP, "ZZZ,ZZ9.99")), 414, Gx_line+17, 488, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV207TotNTinG), "ZZZZZ9")), 500, Gx_line+17, 545, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV186TiempoNP, "Z,ZZ9.99")), 578, Gx_line+17, 637, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV178PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+18, 759, Gx_line+33, 2, 0, 0, 0) ;
            getPrinter().GxDrawRect(44, Gx_line+13, 789, Gx_line+41, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+41, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+45) ;
         }
         else
         {
            h7RZ0( false, 44) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV197TotKG, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+17, 289, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV123Dias, "ZZ9.99")), 353, Gx_line+17, 398, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138HmP, "ZZZ,ZZ9.99")), 416, Gx_line+17, 490, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV207TotNTinG), "ZZZZZ9")), 500, Gx_line+17, 545, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV186TiempoNP, "Z,ZZ9.99")), 578, Gx_line+17, 637, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV178PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+18, 759, Gx_line+33, 2, 0, 0, 0) ;
            getPrinter().GxDrawRect(44, Gx_line+13, 789, Gx_line+41, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+41, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+44) ;
         }
         AV178PesMedPar = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV196Tot_N_Gi) )
         {
            AV178PesMedPar = ((0==AV196Tot_N_Gi) ? DecimalUtil.doubleToDec(0) : AV191Tot_kgs_Gi.divide(DecimalUtil.doubleToDec(AV196Tot_N_Gi), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV141HorRea = (short)(GXutil.Int( AV200Totm_Gi/ (double) (60))) ;
         AV142HorReaint = (short)(GXutil.Int( AV141HorRea)) ;
         AV169MinRea = (byte)(AV200Totm_Gi-(AV142HorReaint*60)) ;
         AV170MinRea2 = DecimalUtil.doubleToDec(AV169MinRea/ (double) (100)) ;
         AV138HmP = DecimalUtil.doubleToDec(AV142HorReaint).add(AV170MinRea2) ;
         AV186TiempoNP = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV196Tot_N_Gi) )
         {
            AV186TiempoNP = ((0==AV196Tot_N_Gi) ? DecimalUtil.doubleToDec(0) : AV138HmP.divide(DecimalUtil.doubleToDec(AV196Tot_N_Gi), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV123Dias = DecimalUtil.doubleToDec(AV200Totm_Gi/ (double) (1440)) ;
         AV183Porc_ = DecimalUtil.doubleToDec(0) ;
         AV183Porc_ = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV197TotKG)==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV191Tot_kgs_Gi.divide(AV197TotKG, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 1)) ;
         if ( AV125F_tintutex == 0 )
         {
            h7RZ0( false, 27) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV191Tot_kgs_Gi, "ZZ,ZZZ,ZZ9.99")), 192, Gx_line+6, 288, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(1, Gx_line+0, 789, Gx_line+28, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV178PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+7, 759, Gx_line+22, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV186TiempoNP, "Z,ZZ9.99")), 578, Gx_line+6, 637, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV196Tot_N_Gi), "ZZZZZ9")), 500, Gx_line+6, 545, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138HmP, "ZZZ,ZZ9.99")), 416, Gx_line+6, 490, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV200Totm_Gi), "ZZZZZZZ9")), 353, Gx_line+6, 397, Gx_line+23, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV156Lit18, "")), 26, Gx_line+6, 173, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV183Porc_, "ZZ9.9")), 302, Gx_line+6, 339, Gx_line+24, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         else
         {
            h7RZ0( false, 27) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV191Tot_kgs_Gi, "ZZ,ZZZ,ZZ9.99")), 192, Gx_line+6, 288, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(1, Gx_line+0, 789, Gx_line+28, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(297, Gx_line+0, 297, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV178PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+7, 759, Gx_line+22, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV186TiempoNP, "Z,ZZ9.99")), 578, Gx_line+6, 637, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV196Tot_N_Gi), "ZZZZZ9")), 500, Gx_line+6, 545, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138HmP, "ZZZ,ZZ9.99")), 416, Gx_line+6, 490, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV123Dias, "ZZ9.99")), 353, Gx_line+6, 398, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV156Lit18, "")), 26, Gx_line+6, 173, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV183Porc_, "ZZ9.9")), 302, Gx_line+6, 339, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+27, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         AV178PesMedPar = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV195Tot_N_Ge) )
         {
            AV178PesMedPar = ((0==AV195Tot_N_Ge) ? DecimalUtil.doubleToDec(0) : AV190Tot_Kgs_Ge.divide(DecimalUtil.doubleToDec(AV195Tot_N_Ge), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV141HorRea = (short)(GXutil.Int( AV199Totm_Ge/ (double) (60))) ;
         AV142HorReaint = (short)(GXutil.Int( AV141HorRea)) ;
         AV169MinRea = (byte)(AV199Totm_Ge-(AV142HorReaint*60)) ;
         AV170MinRea2 = DecimalUtil.doubleToDec(AV169MinRea/ (double) (100)) ;
         AV138HmP = DecimalUtil.doubleToDec(AV142HorReaint).add(AV170MinRea2) ;
         AV186TiempoNP = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV195Tot_N_Ge) )
         {
            AV186TiempoNP = ((0==AV195Tot_N_Ge) ? DecimalUtil.doubleToDec(0) : AV138HmP.divide(DecimalUtil.doubleToDec(AV195Tot_N_Ge), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV123Dias = DecimalUtil.doubleToDec(AV199Totm_Ge/ (double) (1440)) ;
         AV183Porc_ = DecimalUtil.doubleToDec(0) ;
         AV183Porc_ = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV197TotKG)==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV190Tot_Kgs_Ge.divide(AV197TotKG, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 1)) ;
         if ( AV125F_tintutex == 0 )
         {
            h7RZ0( false, 27) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV190Tot_Kgs_Ge, "ZZ,ZZZ,ZZ9.99")), 192, Gx_line+5, 288, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(1, Gx_line+0, 789, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV178PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+6, 759, Gx_line+21, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV186TiempoNP, "Z,ZZ9.99")), 578, Gx_line+5, 637, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV195Tot_N_Ge), "ZZZZZ9")), 500, Gx_line+5, 545, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138HmP, "ZZZ,ZZ9.99")), 416, Gx_line+5, 490, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV199Totm_Ge), "ZZZZZ9")), 353, Gx_line+5, 398, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV157Lit19, "")), 26, Gx_line+5, 173, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(297, Gx_line+0, 297, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV183Porc_, "ZZ9.9")), 302, Gx_line+5, 339, Gx_line+23, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         else
         {
            h7RZ0( false, 27) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV190Tot_Kgs_Ge, "ZZ,ZZZ,ZZ9.99")), 192, Gx_line+5, 288, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(1, Gx_line+0, 789, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV178PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+6, 759, Gx_line+21, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV186TiempoNP, "Z,ZZ9.99")), 578, Gx_line+5, 637, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV195Tot_N_Ge), "ZZZZZ9")), 500, Gx_line+5, 545, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138HmP, "ZZZ,ZZ9.99")), 416, Gx_line+5, 490, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV123Dias, "ZZ9.99")), 353, Gx_line+5, 398, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV157Lit19, "")), 26, Gx_line+5, 173, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(297, Gx_line+0, 297, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV183Porc_, "ZZ9.9")), 302, Gx_line+5, 339, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+27, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         AV174Ntin_Gu = (int)(AV207TotNTinG-AV196Tot_N_Gi-AV195Tot_N_Ge) ;
         AV204Totmt_Gu = (int)(AV201TotMinG-AV199Totm_Ge-AV200Totm_Gi) ;
         AV178PesMedPar = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV174Ntin_Gu) )
         {
            AV178PesMedPar = ((0==AV174Ntin_Gu) ? DecimalUtil.doubleToDec(0) : AV194Tot_KGU.divide(DecimalUtil.doubleToDec(AV174Ntin_Gu), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV141HorRea = (short)(GXutil.Int( AV204Totmt_Gu/ (double) (60))) ;
         AV142HorReaint = (short)(GXutil.Int( AV141HorRea)) ;
         AV169MinRea = (byte)(AV204Totmt_Gu-(AV142HorReaint*60)) ;
         AV170MinRea2 = DecimalUtil.doubleToDec(AV169MinRea/ (double) (100)) ;
         AV138HmP = DecimalUtil.doubleToDec(AV142HorReaint).add(AV170MinRea2) ;
         AV186TiempoNP = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV174Ntin_Gu) )
         {
            AV186TiempoNP = ((0==AV174Ntin_Gu) ? DecimalUtil.doubleToDec(0) : AV138HmP.divide(DecimalUtil.doubleToDec(AV174Ntin_Gu), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV123Dias = DecimalUtil.doubleToDec(AV204Totmt_Gu/ (double) (1440)) ;
         AV183Porc_ = DecimalUtil.doubleToDec(0) ;
         AV183Porc_ = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV197TotKG)==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV194Tot_KGU.divide(AV197TotKG, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 1)) ;
         if ( AV125F_tintutex == 0 )
         {
            h7RZ0( false, 27) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV194Tot_KGU, "ZZ,ZZZ,ZZ9.99")), 191, Gx_line+5, 287, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(1, Gx_line+0, 789, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV178PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+6, 759, Gx_line+21, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV186TiempoNP, "Z,ZZ9.99")), 578, Gx_line+5, 637, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV174Ntin_Gu), "ZZZZZ9")), 500, Gx_line+5, 545, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138HmP, "ZZZ,ZZ9.99")), 416, Gx_line+5, 490, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV204Totmt_Gu), "ZZZZZ9")), 353, Gx_line+5, 398, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV159Lit20, "")), 25, Gx_line+5, 172, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(297, Gx_line+0, 297, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV183Porc_, "ZZ9.9")), 302, Gx_line+5, 339, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+27, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         else
         {
            h7RZ0( false, 27) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 128, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV194Tot_KGU, "ZZ,ZZZ,ZZ9.99")), 191, Gx_line+5, 287, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(1, Gx_line+0, 789, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV178PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+6, 759, Gx_line+21, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV186TiempoNP, "Z,ZZ9.99")), 578, Gx_line+5, 637, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV174Ntin_Gu), "ZZZZZ9")), 500, Gx_line+5, 545, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138HmP, "ZZZ,ZZ9.99")), 416, Gx_line+5, 490, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV123Dias, "ZZ9.99")), 353, Gx_line+5, 398, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV159Lit20, "")), 25, Gx_line+5, 172, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(297, Gx_line+0, 297, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV183Porc_, "ZZ9.9")), 302, Gx_line+5, 339, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+27, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         if ( AV184Texknit == 1 )
         {
            h7RZ0( false, 150) ;
            getPrinter().GxDrawLine(7, Gx_line+56, 263, Gx_line+56, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 31, Gx_line+41, 68, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 218, Gx_line+41, 255, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV143KgCol[1-1], "ZZZZZZ,ZZ9.99")), 157, Gx_line+63, 253, Gx_line+80, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV143KgCol[2-1], "ZZZZZZ,ZZ9.99")), 158, Gx_line+88, 254, Gx_line+105, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV143KgCol[3-1], "ZZZZZZ,ZZ9.99")), 158, Gx_line+114, 254, Gx_line+131, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Blancos", ""), 31, Gx_line+64, 83, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descrudados", ""), 31, Gx_line+89, 112, Gx_line+104, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 31, Gx_line+115, 68, Gx_line+130, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+36, 264, Gx_line+145, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+150) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7RZ0( true, 0) ;
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
      /* 'LEOHDR' Routine */
      returnInSub = false ;
      AV122CliCod = 999999 ;
      AV131ForSer = "XXXXXXXXXXXXXXXX" ;
      AV129ForColNom = "XXXXXXXXXXXXX" ;
      AV130ForColNum = 999999 ;
      AV187TipColCod = (byte)(99) ;
      AV126FlagBarcad = (byte)(0) ;
      AV127FlagBH = "X" ;
      /* Using cursor P07RZ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV112BarCod), Byte.valueOf(AV116BarCodReo), AV114BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P07RZ5_A130BarCodPar[0] ;
         A132BarCodReo = P07RZ5_A132BarCodReo[0] ;
         A129BarCod = P07RZ5_A129BarCod[0] ;
         A252CliCod = P07RZ5_A252CliCod[0] ;
         n252CliCod = P07RZ5_n252CliCod[0] ;
         A212BarSer = P07RZ5_A212BarSer[0] ;
         A135BarColNom = P07RZ5_A135BarColNom[0] ;
         A136BarColNum = P07RZ5_A136BarColNum[0] ;
         A218BarTipCol = P07RZ5_A218BarTipCol[0] ;
         AV126FlagBarcad = (byte)(1) ;
         AV127FlagBH = httpContext.getMessage( "B", "") ;
         AV122CliCod = A252CliCod ;
         AV131ForSer = A212BarSer ;
         AV129ForColNom = A135BarColNom ;
         AV130ForColNum = A136BarColNum ;
         AV187TipColCod = A218BarTipCol ;
         /* Execute user subroutine: 'LEOFORMU' */
         S127 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( AV126FlagBarcad == 0 )
      {
         /* Using cursor P07RZ6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV112BarCod), Byte.valueOf(AV116BarCodReo), AV114BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A507HbaBarPar = P07RZ6_A507HbaBarPar[0] ;
            A508HbaBarReo = P07RZ6_A508HbaBarReo[0] ;
            A506HbaBarCod = P07RZ6_A506HbaBarCod[0] ;
            A252CliCod = P07RZ6_A252CliCod[0] ;
            n252CliCod = P07RZ6_n252CliCod[0] ;
            A535HbaSer = P07RZ6_A535HbaSer[0] ;
            n535HbaSer = P07RZ6_n535HbaSer[0] ;
            A509HbaColNom = P07RZ6_A509HbaColNom[0] ;
            n509HbaColNom = P07RZ6_n509HbaColNom[0] ;
            A510HbaColNum = P07RZ6_A510HbaColNum[0] ;
            n510HbaColNum = P07RZ6_n510HbaColNum[0] ;
            A537HbaTipCol = P07RZ6_A537HbaTipCol[0] ;
            n537HbaTipCol = P07RZ6_n537HbaTipCol[0] ;
            AV127FlagBH = httpContext.getMessage( "H", "") ;
            AV122CliCod = A252CliCod ;
            AV131ForSer = A535HbaSer ;
            AV129ForColNom = A509HbaColNom ;
            AV130ForColNum = A510HbaColNum ;
            AV187TipColCod = A537HbaTipCol ;
            /* Execute user subroutine: 'LEOFORMU' */
            S127 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
   }

   public void S127( ) throws ProcessInterruptedException
   {
      /* 'LEOFORMU' Routine */
      returnInSub = false ;
      AV185TiempoF = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P07RZ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV122CliCod), AV131ForSer, AV129ForColNom, Integer.valueOf(AV130ForColNum), Byte.valueOf(AV187TipColCod)});
      c771ProForTie = P07RZ7_A771ProForTie[0] ;
      pr_default.close(5);
      AV185TiempoF = (short)(AV185TiempoF+c771ProForTie) ;
      /* End optimized group. */
   }

   public void h7RZ0( boolean bFoot ,
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
            if ( AV125F_tintutex == 0 )
            {
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Minutos", ""), 349, Gx_line+131, 401, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Horas", ""), 431, Gx_line+131, 468, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV124EmprNom, "")), 9, Gx_line+15, 260, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 485, Gx_line+15, 536, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 593, Gx_line+15, 686, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 607, Gx_line+48, 652, Gx_line+65, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV134Hisprodti, "99/99/99 99:99:99"), 55, Gx_line+82, 180, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV133Hisprodtf, "99/99/99 99:99:99"), 278, Gx_line+81, 403, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+7, 789, Gx_line+7, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+73, 789, Gx_line+73, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV144Lit0, "")), 9, Gx_line+48, 333, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147Lit1, "")), 442, Gx_line+15, 472, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV158Lit2, "")), 556, Gx_line+15, 586, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV161Lit3, "")), 552, Gx_line+49, 597, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV162Lit4, "")), 13, Gx_line+82, 50, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV163Lit5, "")), 235, Gx_line+81, 272, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV164Lit6, "")), 8, Gx_line+131, 60, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV165Lit7, "")), 242, Gx_line+131, 287, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV166Lit8, "")), 353, Gx_line+115, 398, Gx_line+131, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV167Lit9, "")), 421, Gx_line+115, 480, Gx_line+131, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV148Lit10, "")), 493, Gx_line+131, 552, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV149Lit11, "")), 572, Gx_line+115, 617, Gx_line+131, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Medio", ""), 621, Gx_line+115, 658, Gx_line+130, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV150Lit12, "")), 572, Gx_line+131, 631, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV151Lit13, "")), 682, Gx_line+115, 712, Gx_line+131, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV152Lit14, "")), 682, Gx_line+131, 719, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV153Lit15, "")), 722, Gx_line+131, 781, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(1, Gx_line+110, 789, Gx_line+151, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+149, 1, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+149, 788, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+111, 491, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+110, 183, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+110, 555, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+110, 668, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+133, 409, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("%", 317, Gx_line+131, 325, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(296, Gx_line+110, 296, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+110, 345, Gx_line+155, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+155) ;
            }
            else
            {
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Dias", ""), 360, Gx_line+129, 390, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Horas", ""), 431, Gx_line+129, 468, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV124EmprNom, "")), 9, Gx_line+13, 260, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 485, Gx_line+13, 536, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 593, Gx_line+13, 686, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 607, Gx_line+46, 652, Gx_line+63, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV134Hisprodti, "99/99/99 99:99:99"), 55, Gx_line+80, 180, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV133Hisprodtf, "99/99/99 99:99:99"), 274, Gx_line+80, 399, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+5, 789, Gx_line+5, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+71, 789, Gx_line+71, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV144Lit0, "")), 9, Gx_line+46, 333, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147Lit1, "")), 442, Gx_line+13, 472, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV158Lit2, "")), 556, Gx_line+13, 586, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV161Lit3, "")), 552, Gx_line+47, 597, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV162Lit4, "")), 13, Gx_line+80, 50, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV163Lit5, "")), 231, Gx_line+80, 268, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV164Lit6, "")), 8, Gx_line+129, 60, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV165Lit7, "")), 242, Gx_line+129, 287, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV167Lit9, "")), 421, Gx_line+113, 480, Gx_line+129, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV148Lit10, "")), 493, Gx_line+129, 552, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV149Lit11, "")), 572, Gx_line+113, 617, Gx_line+129, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Medio", ""), 621, Gx_line+113, 658, Gx_line+128, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV150Lit12, "")), 572, Gx_line+129, 631, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV151Lit13, "")), 682, Gx_line+113, 712, Gx_line+129, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV152Lit14, "")), 682, Gx_line+129, 719, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV153Lit15, "")), 722, Gx_line+129, 781, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(1, Gx_line+108, 789, Gx_line+149, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+147, 1, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+147, 788, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+109, 491, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+108, 183, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+108, 555, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+108, 668, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+131, 409, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("%", 317, Gx_line+129, 325, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+108, 295, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+108, 345, Gx_line+153, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+153) ;
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
      add_metrics4( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, true, 58, 14, 72, 123,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 30, 35, 35, 55, 45, 14, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 21, 21, 37, 37, 37, 38, 61, 45, 45, 45, 45, 42, 38, 49, 45, 17, 35, 45, 38, 52, 45, 49, 42, 49, 45, 42, 38, 45, 42, 59, 42, 42, 38, 21, 18, 23, 37, 35, 21, 35, 38, 35, 38, 35, 21, 38, 38, 18, 18, 35, 18, 56, 38, 38, 38, 38, 25, 35, 21, 38, 35, 49, 35, 35, 32, 25, 17, 25, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 36, 35, 35, 35, 17, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 21, 21, 36, 35, 21, 21, 21, 23, 35, 53, 53, 53, 38, 45, 45, 45, 45, 45, 45, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 35, 35, 35, 35, 35, 18, 18, 18, 18, 38, 38, 38, 38, 38, 38, 38, 35, 38, 38, 38, 38, 38, 35, 38, 35}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
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
      AV182PMaqCod = "" ;
      AV210UMaqCod = "" ;
      AV134Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV133Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV188TipMaqCod = "" ;
      AV111ArtCodi = "" ;
      AV110ArtCodf = "" ;
      AV119Barcolnomi = "" ;
      AV118Barcolnomf = "" ;
      AV145Lit01 = "" ;
      AV146Lit02 = "" ;
      AV144Lit0 = "" ;
      AV214Pgmname = "" ;
      AV147Lit1 = "" ;
      AV158Lit2 = "" ;
      AV161Lit3 = "" ;
      AV162Lit4 = "" ;
      AV163Lit5 = "" ;
      AV164Lit6 = "" ;
      AV165Lit7 = "" ;
      AV166Lit8 = "" ;
      AV167Lit9 = "" ;
      AV148Lit10 = "" ;
      AV149Lit11 = "" ;
      AV150Lit12 = "" ;
      AV151Lit13 = "" ;
      AV152Lit14 = "" ;
      AV153Lit15 = "" ;
      AV154Lit16 = "" ;
      AV155Lit17 = "" ;
      AV156Lit18 = "" ;
      AV157Lit19 = "" ;
      AV159Lit20 = "" ;
      AV160Lit21 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new byte[1] ;
      scmdbuf = "" ;
      P07RZ2_A396EmprCod = new String[] {""} ;
      P07RZ2_A407EmprNom = new String[] {""} ;
      P07RZ2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV124EmprNom = "" ;
      AV190Tot_Kgs_Ge = DecimalUtil.ZERO ;
      AV191Tot_kgs_Gi = DecimalUtil.ZERO ;
      AV197TotKG = DecimalUtil.ZERO ;
      P07RZ3_A129BarCod = new int[1] ;
      P07RZ3_A132BarCodReo = new byte[1] ;
      P07RZ3_A130BarCodPar = new String[] {""} ;
      P07RZ3_A396EmprCod = new String[] {""} ;
      P07RZ3_A136BarColNum = new int[1] ;
      P07RZ3_A135BarColNom = new String[] {""} ;
      P07RZ3_A212BarSer = new String[] {""} ;
      P07RZ3_A1011TipMaqCod = new String[] {""} ;
      P07RZ3_n1011TipMaqCod = new boolean[] {false} ;
      P07RZ3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P07RZ3_n4441HisProDTF = new boolean[] {false} ;
      P07RZ3_A602MaqCod = new String[] {""} ;
      P07RZ3_A656ParCod = new short[1] ;
      P07RZ3_n656ParCod = new boolean[] {false} ;
      P07RZ3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07RZ3_A3612HisProReo = new byte[1] ;
      P07RZ3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07RZ3_A561HisProLin = new int[1] ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A1011TipMaqCod = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A558HisProFec = GXutil.nullDate() ;
      AV194Tot_KGU = DecimalUtil.ZERO ;
      AV198TotKgs = DecimalUtil.ZERO ;
      P07RZ4_A396EmprCod = new String[] {""} ;
      P07RZ4_A602MaqCod = new String[] {""} ;
      P07RZ4_A556HisProEst = new byte[1] ;
      P07RZ4_A129BarCod = new int[1] ;
      P07RZ4_A132BarCodReo = new byte[1] ;
      P07RZ4_A130BarCodPar = new String[] {""} ;
      P07RZ4_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07RZ4_A3612HisProReo = new byte[1] ;
      P07RZ4_A656ParCod = new short[1] ;
      P07RZ4_n656ParCod = new boolean[] {false} ;
      P07RZ4_A503GruOpeCod = new int[1] ;
      P07RZ4_A3610HisProLot = new String[] {""} ;
      P07RZ4_A136BarColNum = new int[1] ;
      P07RZ4_A135BarColNom = new String[] {""} ;
      P07RZ4_A212BarSer = new String[] {""} ;
      P07RZ4_A1011TipMaqCod = new String[] {""} ;
      P07RZ4_n1011TipMaqCod = new boolean[] {false} ;
      P07RZ4_A606MaqDsc = new String[] {""} ;
      P07RZ4_n606MaqDsc = new boolean[] {false} ;
      P07RZ4_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P07RZ4_n4440HisProDTI = new boolean[] {false} ;
      P07RZ4_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P07RZ4_n4441HisProDTF = new boolean[] {false} ;
      P07RZ4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07RZ4_A561HisProLin = new int[1] ;
      A3610HisProLot = "" ;
      A606MaqDsc = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV189Tot_kgs_e = DecimalUtil.ZERO ;
      AV192Tot_kgs_i = DecimalUtil.ZERO ;
      AV135HisProLot = "" ;
      AV114BarCodPar = "" ;
      AV138HmP = DecimalUtil.ZERO ;
      AV137HmF = DecimalUtil.ZERO ;
      AV178PesMedPar = DecimalUtil.ZERO ;
      AV170MinRea2 = DecimalUtil.ZERO ;
      AV186TiempoNP = DecimalUtil.ZERO ;
      AV183Porc_ = DecimalUtil.ZERO ;
      AV123Dias = DecimalUtil.ZERO ;
      AV193Tot_kgs_u = DecimalUtil.ZERO ;
      AV143KgCol = new java.math.BigDecimal[3] ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV143KgCol[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV131ForSer = "" ;
      AV129ForColNom = "" ;
      AV127FlagBH = "" ;
      P07RZ5_A396EmprCod = new String[] {""} ;
      P07RZ5_A130BarCodPar = new String[] {""} ;
      P07RZ5_A132BarCodReo = new byte[1] ;
      P07RZ5_A129BarCod = new int[1] ;
      P07RZ5_A252CliCod = new int[1] ;
      P07RZ5_n252CliCod = new boolean[] {false} ;
      P07RZ5_A212BarSer = new String[] {""} ;
      P07RZ5_A135BarColNom = new String[] {""} ;
      P07RZ5_A136BarColNum = new int[1] ;
      P07RZ5_A218BarTipCol = new byte[1] ;
      P07RZ6_A396EmprCod = new String[] {""} ;
      P07RZ6_A507HbaBarPar = new String[] {""} ;
      P07RZ6_A508HbaBarReo = new byte[1] ;
      P07RZ6_A506HbaBarCod = new int[1] ;
      P07RZ6_A252CliCod = new int[1] ;
      P07RZ6_n252CliCod = new boolean[] {false} ;
      P07RZ6_A535HbaSer = new String[] {""} ;
      P07RZ6_n535HbaSer = new boolean[] {false} ;
      P07RZ6_A509HbaColNom = new String[] {""} ;
      P07RZ6_n509HbaColNom = new boolean[] {false} ;
      P07RZ6_A510HbaColNum = new int[1] ;
      P07RZ6_n510HbaColNum = new boolean[] {false} ;
      P07RZ6_A537HbaTipCol = new byte[1] ;
      P07RZ6_n537HbaTipCol = new boolean[] {false} ;
      A507HbaBarPar = "" ;
      A535HbaSer = "" ;
      A509HbaColNom = "" ;
      P07RZ7_A771ProForTie = new short[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rprdt11df__default(),
         new Object[] {
             new Object[] {
            P07RZ2_A396EmprCod, P07RZ2_A407EmprNom, P07RZ2_n407EmprNom
            }
            , new Object[] {
            P07RZ3_A129BarCod, P07RZ3_A132BarCodReo, P07RZ3_A130BarCodPar, P07RZ3_A396EmprCod, P07RZ3_A136BarColNum, P07RZ3_A135BarColNom, P07RZ3_A212BarSer, P07RZ3_A1011TipMaqCod, P07RZ3_n1011TipMaqCod, P07RZ3_A4441HisProDTF,
            P07RZ3_n4441HisProDTF, P07RZ3_A602MaqCod, P07RZ3_A656ParCod, P07RZ3_n656ParCod, P07RZ3_A1525HisProKgr, P07RZ3_A3612HisProReo, P07RZ3_A558HisProFec, P07RZ3_A561HisProLin
            }
            , new Object[] {
            P07RZ4_A396EmprCod, P07RZ4_A602MaqCod, P07RZ4_A556HisProEst, P07RZ4_A129BarCod, P07RZ4_A132BarCodReo, P07RZ4_A130BarCodPar, P07RZ4_A1525HisProKgr, P07RZ4_A3612HisProReo, P07RZ4_A656ParCod, P07RZ4_n656ParCod,
            P07RZ4_A503GruOpeCod, P07RZ4_A3610HisProLot, P07RZ4_A136BarColNum, P07RZ4_A135BarColNom, P07RZ4_A212BarSer, P07RZ4_A1011TipMaqCod, P07RZ4_n1011TipMaqCod, P07RZ4_A606MaqDsc, P07RZ4_n606MaqDsc, P07RZ4_A4440HisProDTI,
            P07RZ4_n4440HisProDTI, P07RZ4_A4441HisProDTF, P07RZ4_n4441HisProDTF, P07RZ4_A558HisProFec, P07RZ4_A561HisProLin
            }
            , new Object[] {
            P07RZ5_A396EmprCod, P07RZ5_A130BarCodPar, P07RZ5_A132BarCodReo, P07RZ5_A129BarCod, P07RZ5_A252CliCod, P07RZ5_n252CliCod, P07RZ5_A212BarSer, P07RZ5_A135BarColNom, P07RZ5_A136BarColNum, P07RZ5_A218BarTipCol
            }
            , new Object[] {
            P07RZ6_A396EmprCod, P07RZ6_A507HbaBarPar, P07RZ6_A508HbaBarReo, P07RZ6_A506HbaBarCod, P07RZ6_A252CliCod, P07RZ6_n252CliCod, P07RZ6_A535HbaSer, P07RZ6_n535HbaSer, P07RZ6_A509HbaColNom, P07RZ6_n509HbaColNom,
            P07RZ6_A510HbaColNum, P07RZ6_n510HbaColNum, P07RZ6_A537HbaTipCol, P07RZ6_n537HbaTipCol
            }
            , new Object[] {
            P07RZ7_A771ProForTie
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV214Pgmname = "RPRdt11df" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV214Pgmname = "RPRdt11df" ;
      Gx_err = (short)(0) ;
   }

   private byte AV184Texknit ;
   private byte AV125F_tintutex ;
   private byte GXv_int3[] ;
   private byte A132BarCodReo ;
   private byte A3612HisProReo ;
   private byte A556HisProEst ;
   private byte AV116BarCodReo ;
   private byte AV128FlagMarca ;
   private byte AV169MinRea ;
   private byte AV187TipColCod ;
   private byte AV126FlagBarcad ;
   private byte A218BarTipCol ;
   private byte A508HbaBarReo ;
   private byte A537HbaTipCol ;
   private short gxcookieaux ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short AV136HisProTre ;
   private short AV185TiempoF ;
   private short AV141HorRea ;
   private short AV142HorReaint ;
   private short c771ProForTie ;
   private short Gx_err ;
   private int AV121Barcolnumi ;
   private int AV120Barcolnumf ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A561HisProLin ;
   private int AV202TotMinT ;
   private int AV172NTin ;
   private int AV195Tot_N_Ge ;
   private int AV196Tot_N_Gi ;
   private int A503GruOpeCod ;
   private int AV205Totmt_i ;
   private int AV175Ntin_i ;
   private int AV203Totmt_e ;
   private int AV173Ntin_e ;
   private int AV132GruOpeCod ;
   private int AV112BarCod ;
   private int Gx_OldLine ;
   private int AV176NTin_u ;
   private int AV206Totmt_u ;
   private int AV201TotMinG ;
   private int AV207TotNTinG ;
   private int AV200Totm_Gi ;
   private int AV199Totm_Ge ;
   private int AV174Ntin_Gu ;
   private int AV204Totmt_Gu ;
   private int AV122CliCod ;
   private int AV130ForColNum ;
   private int A252CliCod ;
   private int A506HbaBarCod ;
   private int A510HbaColNum ;
   private int GX_I ;
   private java.math.BigDecimal AV190Tot_Kgs_Ge ;
   private java.math.BigDecimal AV191Tot_kgs_Gi ;
   private java.math.BigDecimal AV197TotKG ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal AV194Tot_KGU ;
   private java.math.BigDecimal AV198TotKgs ;
   private java.math.BigDecimal AV189Tot_kgs_e ;
   private java.math.BigDecimal AV192Tot_kgs_i ;
   private java.math.BigDecimal AV138HmP ;
   private java.math.BigDecimal AV137HmF ;
   private java.math.BigDecimal AV178PesMedPar ;
   private java.math.BigDecimal AV170MinRea2 ;
   private java.math.BigDecimal AV186TiempoNP ;
   private java.math.BigDecimal AV183Porc_ ;
   private java.math.BigDecimal AV123Dias ;
   private java.math.BigDecimal AV193Tot_kgs_u ;
   private java.math.BigDecimal AV143KgCol[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV182PMaqCod ;
   private String AV210UMaqCod ;
   private String AV188TipMaqCod ;
   private String AV111ArtCodi ;
   private String AV110ArtCodf ;
   private String AV119Barcolnomi ;
   private String AV118Barcolnomf ;
   private String AV145Lit01 ;
   private String AV146Lit02 ;
   private String AV144Lit0 ;
   private String AV214Pgmname ;
   private String AV147Lit1 ;
   private String AV158Lit2 ;
   private String AV161Lit3 ;
   private String AV162Lit4 ;
   private String AV163Lit5 ;
   private String AV164Lit6 ;
   private String AV165Lit7 ;
   private String AV166Lit8 ;
   private String AV167Lit9 ;
   private String AV148Lit10 ;
   private String AV149Lit11 ;
   private String AV150Lit12 ;
   private String AV151Lit13 ;
   private String AV152Lit14 ;
   private String AV153Lit15 ;
   private String AV154Lit16 ;
   private String AV155Lit17 ;
   private String AV156Lit18 ;
   private String AV157Lit19 ;
   private String AV159Lit20 ;
   private String AV160Lit21 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV124EmprNom ;
   private String A130BarCodPar ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A1011TipMaqCod ;
   private String A602MaqCod ;
   private String A3610HisProLot ;
   private String A606MaqDsc ;
   private String AV135HisProLot ;
   private String AV114BarCodPar ;
   private String AV131ForSer ;
   private String AV129ForColNom ;
   private String AV127FlagBH ;
   private String A507HbaBarPar ;
   private String A535HbaSer ;
   private String A509HbaColNom ;
   private String Gx_time ;
   private java.util.Date AV134Hisprodti ;
   private java.util.Date AV133Hisprodtf ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A558HisProFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n1011TipMaqCod ;
   private boolean n4441HisProDTF ;
   private boolean n656ParCod ;
   private boolean brk7RZ5 ;
   private boolean n606MaqDsc ;
   private boolean n4440HisProDTI ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n535HbaSer ;
   private boolean n509HbaColNom ;
   private boolean n510HbaColNum ;
   private boolean n537HbaTipCol ;
   private IDataStoreProvider pr_default ;
   private String[] P07RZ2_A396EmprCod ;
   private String[] P07RZ2_A407EmprNom ;
   private boolean[] P07RZ2_n407EmprNom ;
   private int[] P07RZ3_A129BarCod ;
   private byte[] P07RZ3_A132BarCodReo ;
   private String[] P07RZ3_A130BarCodPar ;
   private String[] P07RZ3_A396EmprCod ;
   private int[] P07RZ3_A136BarColNum ;
   private String[] P07RZ3_A135BarColNom ;
   private String[] P07RZ3_A212BarSer ;
   private String[] P07RZ3_A1011TipMaqCod ;
   private boolean[] P07RZ3_n1011TipMaqCod ;
   private java.util.Date[] P07RZ3_A4441HisProDTF ;
   private boolean[] P07RZ3_n4441HisProDTF ;
   private String[] P07RZ3_A602MaqCod ;
   private short[] P07RZ3_A656ParCod ;
   private boolean[] P07RZ3_n656ParCod ;
   private java.math.BigDecimal[] P07RZ3_A1525HisProKgr ;
   private byte[] P07RZ3_A3612HisProReo ;
   private java.util.Date[] P07RZ3_A558HisProFec ;
   private int[] P07RZ3_A561HisProLin ;
   private String[] P07RZ4_A396EmprCod ;
   private String[] P07RZ4_A602MaqCod ;
   private byte[] P07RZ4_A556HisProEst ;
   private int[] P07RZ4_A129BarCod ;
   private byte[] P07RZ4_A132BarCodReo ;
   private String[] P07RZ4_A130BarCodPar ;
   private java.math.BigDecimal[] P07RZ4_A1525HisProKgr ;
   private byte[] P07RZ4_A3612HisProReo ;
   private short[] P07RZ4_A656ParCod ;
   private boolean[] P07RZ4_n656ParCod ;
   private int[] P07RZ4_A503GruOpeCod ;
   private String[] P07RZ4_A3610HisProLot ;
   private int[] P07RZ4_A136BarColNum ;
   private String[] P07RZ4_A135BarColNom ;
   private String[] P07RZ4_A212BarSer ;
   private String[] P07RZ4_A1011TipMaqCod ;
   private boolean[] P07RZ4_n1011TipMaqCod ;
   private String[] P07RZ4_A606MaqDsc ;
   private boolean[] P07RZ4_n606MaqDsc ;
   private java.util.Date[] P07RZ4_A4440HisProDTI ;
   private boolean[] P07RZ4_n4440HisProDTI ;
   private java.util.Date[] P07RZ4_A4441HisProDTF ;
   private boolean[] P07RZ4_n4441HisProDTF ;
   private java.util.Date[] P07RZ4_A558HisProFec ;
   private int[] P07RZ4_A561HisProLin ;
   private String[] P07RZ5_A396EmprCod ;
   private String[] P07RZ5_A130BarCodPar ;
   private byte[] P07RZ5_A132BarCodReo ;
   private int[] P07RZ5_A129BarCod ;
   private int[] P07RZ5_A252CliCod ;
   private boolean[] P07RZ5_n252CliCod ;
   private String[] P07RZ5_A212BarSer ;
   private String[] P07RZ5_A135BarColNom ;
   private int[] P07RZ5_A136BarColNum ;
   private byte[] P07RZ5_A218BarTipCol ;
   private String[] P07RZ6_A396EmprCod ;
   private String[] P07RZ6_A507HbaBarPar ;
   private byte[] P07RZ6_A508HbaBarReo ;
   private int[] P07RZ6_A506HbaBarCod ;
   private int[] P07RZ6_A252CliCod ;
   private boolean[] P07RZ6_n252CliCod ;
   private String[] P07RZ6_A535HbaSer ;
   private boolean[] P07RZ6_n535HbaSer ;
   private String[] P07RZ6_A509HbaColNom ;
   private boolean[] P07RZ6_n509HbaColNom ;
   private int[] P07RZ6_A510HbaColNum ;
   private boolean[] P07RZ6_n510HbaColNum ;
   private byte[] P07RZ6_A537HbaTipCol ;
   private boolean[] P07RZ6_n537HbaTipCol ;
   private short[] P07RZ7_A771ProForTie ;
}

final  class rprdt11df__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07RZ2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07RZ3", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T3.BarColNum, T3.BarColNom, T3.BarSer, T2.TipMaqCod, T1.HisProDTF, T1.MaqCod, T1.ParCod, T1.HisProKgr, T1.HisProReo, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTF >= ? and T1.HisProDTF <= ?) AND (T2.TipMaqCod = ? or (rtrim(?) IS NULL)) AND (T3.BarSer >= ? and T3.BarSer <= ?) AND (T3.BarColNom >= ? and T3.BarColNom <= ?) AND (T3.BarColNum >= ? and T3.BarColNum <= ?) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07RZ4", "SELECT T1.EmprCod, T1.MaqCod, T1.HisProEst, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProKgr, T1.HisProReo, T1.ParCod, T1.GruOpeCod, T1.HisProLot, T3.BarColNum, T3.BarColNom, T3.BarSer, T2.TipMaqCod, T2.MaqDsc, T1.HisProDTI, T1.HisProDTF, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTF >= ? and T1.HisProDTF <= ?) AND (T2.TipMaqCod = ? or (rtrim(?) IS NULL)) AND (T3.BarSer >= ? and T3.BarSer <= ?) AND (T3.BarColNom >= ? and T3.BarColNom <= ?) AND (T3.BarColNum >= ? and T3.BarColNum <= ?) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProLot, T1.GruOpeCod, T1.ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07RZ5", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07RZ6", "SELECT EmprCod, HbaBarPar, HbaBarReo, HbaBarCod, CliCod, HbaSer, HbaColNom, HbaColNum, HbaTipCol FROM TXPHISBAR WHERE EmprCod = ? and HbaBarCod = ? and HbaBarReo = ? and HbaBarPar = ? ORDER BY EmprCod, HbaBarCod, HbaBarReo, HbaBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07RZ7", "SELECT SUM(T2.ProForTie) FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 10);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 16);
               ((String[]) buf[15])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(17);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(19);
               ((int[]) buf[24])[0] = rslt.getInt(20);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setString(5, (String)parms[4], 4);
               stmt.setString(6, (String)parms[5], 4);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 13);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setString(5, (String)parms[4], 4);
               stmt.setString(6, (String)parms[5], 4);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 13);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
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

