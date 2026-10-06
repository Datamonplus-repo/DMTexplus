package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens009 extends GXProcedure
{
   public pens009( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens009.class ), "" );
   }

   public pens009( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             long[] aP5 ,
                             byte[] aP6 ,
                             byte[] aP7 ,
                             byte[] aP8 ,
                             int[] aP9 )
   {
      pens009.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        long[] aP5 ,
                        byte[] aP6 ,
                        byte[] aP7 ,
                        byte[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             long[] aP5 ,
                             byte[] aP6 ,
                             byte[] aP7 ,
                             byte[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 )
   {
      pens009.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens009.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens009.this.AV63Lb_opcion = aP2[0];
      this.aP2 = aP2;
      pens009.this.AV62Lb_fechaR = aP3[0];
      this.aP3 = aP3;
      pens009.this.AV64Lb_costeE = aP4[0];
      this.aP4 = aP4;
      pens009.this.AV70Lb_rgb = aP5[0];
      this.aP5 = aP5;
      pens009.this.AV67F_cformu = aP6[0];
      this.aP6 = aP6;
      pens009.this.AV68F_ldform = aP7[0];
      this.aP7 = aP7;
      pens009.this.AV69F_lprfor = aP8[0];
      this.aP8 = aP8;
      pens009.this.AV81Num_col = aP9[0];
      this.aP9 = aP9;
      pens009.this.AV105ForPro = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV79Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pens009.this.GXt_char1 = GXv_char2[0] ;
      AV79Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV80EmprNom ;
      GXv_char4[0] = AV78Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV79Station, GXv_char2, GXv_char3, GXv_char4) ;
      pens009.this.A396EmprCod = GXv_char2[0] ;
      pens009.this.AV80EmprNom = GXv_char3[0] ;
      pens009.this.AV78Usurcod = GXv_char4[0] ;
      GXt_int5 = AV85HdrLab ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HDRLAB", ""), GXv_int6) ;
      pens009.this.GXt_int5 = GXv_int6[0] ;
      AV85HdrLab = GXt_int5 ;
      GXt_int5 = AV87Tinamar ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int6) ;
      pens009.this.GXt_int5 = GXv_int6[0] ;
      AV87Tinamar = GXt_int5 ;
      GXt_int5 = AV88Carvema ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      pens009.this.GXt_int5 = GXv_int6[0] ;
      AV88Carvema = GXt_int5 ;
      GXt_int5 = AV91ProLab ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PROLAB", ""), GXv_int6) ;
      pens009.this.GXt_int5 = GXv_int6[0] ;
      AV91ProLab = GXt_int5 ;
      GXt_int5 = AV92EnsPrf ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENSPRF", ""), GXv_int6) ;
      pens009.this.GXt_int5 = GXv_int6[0] ;
      AV92EnsPrf = GXt_int5 ;
      GXt_int5 = AV118Texfina ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int6) ;
      pens009.this.GXt_int5 = GXv_int6[0] ;
      AV118Texfina = GXt_int5 ;
      GXt_int5 = AV120HilasaLote ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HILLOT", ""), GXv_int6) ;
      pens009.this.GXt_int5 = GXv_int6[0] ;
      AV120HilasaLote = GXt_int5 ;
      GXt_int5 = AV122Filasur ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FILASU", ""), GXv_int6) ;
      pens009.this.GXt_int5 = GXv_int6[0] ;
      AV122Filasur = GXt_int5 ;
      GXt_int5 = AV123OkInf ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "OKENSP", ""), GXv_int6) ;
      pens009.this.GXt_int5 = GXv_int6[0] ;
      AV123OkInf = GXt_int5 ;
      AV82Lb_preKg = DecimalUtil.doubleToDec(0) ;
      AV116LB_NUMOP = (byte)(0) ;
      AV117LB_NUMAUX = (byte)(0) ;
      AV124Lb_premt = DecimalUtil.doubleToDec(0) ;
      AV125Lb_intcod = (byte)(0) ;
      AV129Lb_obsFac = " " ;
      /* Using cursor P01TB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV63Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5555Lb_opcion = P01TB2_A5555Lb_opcion[0] ;
         A5989Lb_PreKg = P01TB2_A5989Lb_PreKg[0] ;
         A5718Lb_numop = P01TB2_A5718Lb_numop[0] ;
         A7395Lb_NumAux = P01TB2_A7395Lb_NumAux[0] ;
         A10083Lb_PreMt = P01TB2_A10083Lb_PreMt[0] ;
         A8622Lb_IntCod = P01TB2_A8622Lb_IntCod[0] ;
         A12731Lb_ObsFac = P01TB2_A12731Lb_ObsFac[0] ;
         AV82Lb_preKg = A5989Lb_PreKg ;
         AV116LB_NUMOP = A5718Lb_numop ;
         AV117LB_NUMAUX = A7395Lb_NumAux ;
         if ( (0==A7395Lb_NumAux) || ( A7395Lb_NumAux == 0 ) )
         {
            AV117LB_NUMAUX = A5718Lb_numop ;
         }
         AV124Lb_premt = A10083Lb_PreMt ;
         AV125Lb_intcod = A8622Lb_IntCod ;
         AV129Lb_obsFac = A12731Lb_ObsFac ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P01TB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A5537Lb_ColNum = P01TB3_A5537Lb_ColNum[0] ;
         A5533Lb_ArtCod = P01TB3_A5533Lb_ArtCod[0] ;
         A5536Lb_ColNom = P01TB3_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P01TB3_A5538Lb_ColNomC[0] ;
         A5539Lb_ColNumC = P01TB3_A5539Lb_ColNumC[0] ;
         A5597Lb_TipRec = P01TB3_A5597Lb_TipRec[0] ;
         A5547Lb_Rb = P01TB3_A5547Lb_Rb[0] ;
         A5540Lb_Cartaz = P01TB3_A5540Lb_Cartaz[0] ;
         A5534Lb_ArtDsc = P01TB3_A5534Lb_ArtDsc[0] ;
         A6546Lb_Pantone = P01TB3_A6546Lb_Pantone[0] ;
         A13303Lb_PrecioP = P01TB3_A13303Lb_PrecioP[0] ;
         A3316CodSol = P01TB3_A3316CodSol[0] ;
         n3316CodSol = P01TB3_n3316CodSol[0] ;
         A626MatCod = P01TB3_A626MatCod[0] ;
         n626MatCod = P01TB3_n626MatCod[0] ;
         A583IntCod = P01TB3_A583IntCod[0] ;
         n583IntCod = P01TB3_n583IntCod[0] ;
         A831TipColCod = P01TB3_A831TipColCod[0] ;
         n831TipColCod = P01TB3_n831TipColCod[0] ;
         A252CliCod = P01TB3_A252CliCod[0] ;
         A1514MacProCod = P01TB3_A1514MacProCod[0] ;
         n1514MacProCod = P01TB3_n1514MacProCod[0] ;
         A5535Lb_TipArt = P01TB3_A5535Lb_TipArt[0] ;
         A5541Lb_FechaE = P01TB3_A5541Lb_FechaE[0] ;
         A7780Lb_Hila = P01TB3_A7780Lb_Hila[0] ;
         A5700Lb_Talao = P01TB3_A5700Lb_Talao[0] ;
         A5569Lb_EstEns = P01TB3_A5569Lb_EstEns[0] ;
         W396EmprCod = A396EmprCod ;
         AV71CliCod = A252CliCod ;
         AV72ForSer = A5533Lb_ArtCod ;
         AV73ForColNom = A5536Lb_ColNom ;
         AV74ForColNum = A5537Lb_ColNum ;
         AV75TipColCod = A831TipColCod ;
         AV89IntCod = A583IntCod ;
         AV94MatCod = A626MatCod ;
         AV90MacProcod = A1514MacProCod ;
         AV95Lb_Rb = A5547Lb_Rb ;
         AV96Lb_Cartaz = A5540Lb_Cartaz ;
         AV97Lb_numero = A5532Lb_numero ;
         AV99Lb_ColNomC = A5538Lb_ColNomC ;
         AV100Lb_ColNumC = A5539Lb_ColNumC ;
         AV104Lb_TipArt = A5535Lb_TipArt ;
         AV119lb_fechae = A5541Lb_FechaE ;
         AV121Lb_hila = A7780Lb_Hila ;
         AV127Lb_pantone = A6546Lb_Pantone ;
         AV128Lb_talao = A5700Lb_Talao ;
         AV130CodSol = A3316CodSol ;
         if ( AV67F_cformu == 0 )
         {
            GXv_int7[0] = AV61ForNumCol ;
            new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "030300", GXv_int7) ;
            pens009.this.AV61ForNumCol = GXv_int7[0] ;
            AV65ForUltLin = (short)(0) ;
            /* Optimized group. */
            /* Using cursor P01TB4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            cV65ForUltLin = P01TB4_AV65ForUltLin[0] ;
            pr_default.close(2);
            AV65ForUltLin = (short)(AV65ForUltLin+cV65ForUltLin*10) ;
            /* End optimized group. */
            System.out.println( httpContext.getMessage( "-New CFORMU", "") );
            /*
               INSERT RECORD ON TABLE TXPCFORMU

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W831TipColCod = A831TipColCod ;
            n831TipColCod = false ;
            W583IntCod = A583IntCod ;
            n583IntCod = false ;
            W626MatCod = A626MatCod ;
            n626MatCod = false ;
            W3316CodSol = A3316CodSol ;
            n3316CodSol = false ;
            W1514MacProCod = A1514MacProCod ;
            n1514MacProCod = false ;
            A494ForSer = A5533Lb_ArtCod ;
            A482ForColNom = A5536Lb_ColNom ;
            A483ForColNum = AV81Num_col ;
            n831TipColCod = false ;
            A486ForNumCol = AV61ForNumCol ;
            A129BarCod = 0 ;
            n129BarCod = false ;
            A132BarCodReo = (byte)(0) ;
            n132BarCodReo = false ;
            A130BarCodPar = " " ;
            n130BarCodPar = false ;
            A485ForFec = Gx_date ;
            n485ForFec = false ;
            A495ForUltMod = GXutil.nullDate() ;
            n495ForUltMod = false ;
            n583IntCod = false ;
            n626MatCod = false ;
            A496ForUltUti = GXutil.nullDate() ;
            n496ForUltUti = false ;
            A484ForCon = (byte)(0) ;
            A651ObsUltLin = (short)(0) ;
            n651ObsUltLin = false ;
            A1159ForUltLin = AV65ForUltLin ;
            n1159ForUltLin = false ;
            A1191ForNomCli = A5538Lb_ColNomC ;
            n1191ForNomCli = false ;
            A1192ForNumCli = A5539Lb_ColNumC ;
            n1192ForNumCli = false ;
            A1518RecCorULin = (byte)(0) ;
            n1518RecCorULin = false ;
            A2749ForPro = AV105ForPro ;
            n2749ForPro = false ;
            if ( A5597Lb_TipRec == 2 )
            {
               A2749ForPro = httpContext.getMessage( "S", "") ;
               n2749ForPro = false ;
            }
            if ( AV101Hidro == 1 )
            {
               AV102LenArt = (byte)(GXutil.len( GXutil.trim( AV72ForSer))) ;
               AV103LenArt4 = (byte)(AV102LenArt-3) ;
               if ( GXutil.strcmp(GXutil.substring( GXutil.trim( AV72ForSer), AV103LenArt4, 4), "****") == 0 )
               {
                  A2749ForPro = httpContext.getMessage( "S", "") ;
                  n2749ForPro = false ;
               }
            }
            if ( ( AV115Magosa == 1 ) && ( AV65ForUltLin == 0 ) )
            {
               A2749ForPro = httpContext.getMessage( "S", "") ;
               n2749ForPro = false ;
            }
            A2838ForRelBan = A5547Lb_Rb ;
            n2838ForRelBan = false ;
            A3007PrecioA = DecimalUtil.doubleToDec(0) ;
            n3007PrecioA = false ;
            A3008PrecioM = DecimalUtil.doubleToDec(0) ;
            n3008PrecioM = false ;
            A995ForTonal = A5540Lb_Cartaz ;
            n995ForTonal = false ;
            A3315ForNumArc = A5532Lb_numero ;
            n3315ForNumArc = false ;
            n3316CodSol = false ;
            A3558ForFecApr = AV62Lb_fechaR ;
            n3558ForFecApr = false ;
            A3559ForSitCom = " " ;
            n3559ForSitCom = false ;
            A3560ForOpcCli = AV63Lb_opcion ;
            n3560ForOpcCli = false ;
            A3569UltEnsCod = " " ;
            n3569UltEnsCod = false ;
            A3585ForPreFec = GXutil.nullDate() ;
            n3585ForPreFec = false ;
            A3586ForPreAnt = DecimalUtil.ZERO ;
            n3586ForPreAnt = false ;
            A3587ForFecAnt = GXutil.nullDate() ;
            n3587ForFecAnt = false ;
            A3588ForEst = " " ;
            n3588ForEst = false ;
            A3688ComUltLin = (short)(0) ;
            n3688ComUltLin = false ;
            A1514MacProCod = AV90MacProcod ;
            n1514MacProCod = false ;
            A4223ForCosUti = DecimalUtil.doubleToDec(0) ;
            n4223ForCosUti = false ;
            A4224ForKgUTin = DecimalUtil.doubleToDec(0) ;
            n4224ForKgUTin = false ;
            A4225ForKgTTin = DecimalUtil.doubleToDec(0) ;
            n4225ForKgTTin = false ;
            A4226ForCosTTi = DecimalUtil.doubleToDec(0) ;
            n4226ForCosTTi = false ;
            A4339ForRGB = AV70Lb_rgb ;
            n4339ForRGB = false ;
            A4380ForCosForm = AV64Lb_costeE ;
            n4380ForCosForm = false ;
            A4384ForTipArt = AV104Lb_TipArt ;
            n4384ForTipArt = false ;
            A5337ForCodExt = " " ;
            n5337ForCodExt = false ;
            A5626ForObsM = "" ;
            n5626ForObsM = false ;
            A5625ForFecHor = GXutil.serverNow( context, remoteHandle, pr_default) ;
            n5625ForFecHor = false ;
            A5624ForUsrCod = AV78Usurcod ;
            n5624ForUsrCod = false ;
            A5653ForPInc = (short)(0) ;
            n5653ForPInc = false ;
            A7537ForOpNum = AV117LB_NUMAUX ;
            n7537ForOpNum = false ;
            if ( AV118Texfina == 1 )
            {
               A485ForFec = AV119lb_fechae ;
               n485ForFec = false ;
            }
            A5742ForSerDsc = A5534Lb_ArtDsc ;
            n5742ForSerDsc = false ;
            if ( AV120HilasaLote == 1 )
            {
               A6379ForNomCli2 = AV121Lb_hila ;
               n6379ForNomCli2 = false ;
            }
            A492ForPreKgm = AV82Lb_preKg ;
            n492ForPreKgm = false ;
            A493ForPreMtr = DecimalUtil.doubleToDec(0) ;
            n493ForPreMtr = false ;
            if ( AV82Lb_preKg.doubleValue() > 0 )
            {
               A491ForPreDef = httpContext.getMessage( "S", "") ;
               n491ForPreDef = false ;
            }
            else
            {
               A491ForPreDef = httpContext.getMessage( "N", "") ;
               n491ForPreDef = false ;
            }
            A493ForPreMtr = AV124Lb_premt ;
            n493ForPreMtr = false ;
            A5362IntCodF = AV125Lb_intcod ;
            n5362IntCodF = false ;
            A12130ForPanto = A6546Lb_Pantone ;
            n12130ForPanto = false ;
            A12732ForObsFac = AV129Lb_obsFac ;
            n12732ForObsFac = false ;
            A492ForPreKgm = A13303Lb_PrecioP ;
            n492ForPreKgm = false ;
            A7781ForBlo = httpContext.getMessage( "N", "") ;
            n7781ForBlo = false ;
            /* Using cursor P01TB5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Integer.valueOf(A486ForNumCol), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n485ForFec), A485ForFec, Boolean.valueOf(n495ForUltMod), A495ForUltMod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n626MatCod), Short.valueOf(A626MatCod), Boolean.valueOf(n496ForUltUti), A496ForUltUti, Boolean.valueOf(n492ForPreKgm), A492ForPreKgm, Boolean.valueOf(n493ForPreMtr), A493ForPreMtr, Boolean.valueOf(n491ForPreDef), A491ForPreDef, Byte.valueOf(A484ForCon), Boolean.valueOf(n651ObsUltLin), Short.valueOf(A651ObsUltLin), Boolean.valueOf(n1159ForUltLin), Short.valueOf(A1159ForUltLin), Boolean.valueOf(n1191ForNomCli), A1191ForNomCli, Boolean.valueOf(n1192ForNumCli), Integer.valueOf(A1192ForNumCli), Boolean.valueOf(n1518RecCorULin), Byte.valueOf(A1518RecCorULin), Boolean.valueOf(n2749ForPro), A2749ForPro, Boolean.valueOf(n2838ForRelBan), A2838ForRelBan, Boolean.valueOf(n3007PrecioA), A3007PrecioA, Boolean.valueOf(n3008PrecioM), A3008PrecioM, Boolean.valueOf(n995ForTonal), A995ForTonal, Boolean.valueOf(n3315ForNumArc), Integer.valueOf(A3315ForNumArc), Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol), Boolean.valueOf(n3558ForFecApr), A3558ForFecApr, Boolean.valueOf(n3559ForSitCom), A3559ForSitCom, Boolean.valueOf(n3560ForOpcCli), A3560ForOpcCli, Boolean.valueOf(n3588ForEst), A3588ForEst, Boolean.valueOf(n3688ComUltLin), Short.valueOf(A3688ComUltLin), Boolean.valueOf(n1514MacProCod), A1514MacProCod, Boolean.valueOf(n4223ForCosUti), A4223ForCosUti, Boolean.valueOf(n4339ForRGB), Long.valueOf(A4339ForRGB), Boolean.valueOf(n4380ForCosForm), A4380ForCosForm, Boolean.valueOf(n4384ForTipArt), Short.valueOf(A4384ForTipArt), Boolean.valueOf(n5337ForCodExt), A5337ForCodExt, Boolean.valueOf(n5362IntCodF), Byte.valueOf(A5362IntCodF), Boolean.valueOf(n5624ForUsrCod), A5624ForUsrCod, Boolean.valueOf(n5625ForFecHor), A5625ForFecHor, Boolean.valueOf(n5626ForObsM), A5626ForObsM, Boolean.valueOf(n5653ForPInc), Short.valueOf(A5653ForPInc), Boolean.valueOf(n5742ForSerDsc), A5742ForSerDsc, Boolean.valueOf(n6379ForNomCli2), A6379ForNomCli2, Boolean.valueOf(n7537ForOpNum), Byte.valueOf(A7537ForOpNum), Boolean.valueOf(n7781ForBlo), A7781ForBlo, Boolean.valueOf(n4224ForKgUTin), A4224ForKgUTin, Boolean.valueOf(n4225ForKgTTin), A4225ForKgTTin, Boolean.valueOf(n4226ForCosTTi), A4226ForCosTTi, Boolean.valueOf(n3569UltEnsCod), A3569UltEnsCod, Boolean.valueOf(n3585ForPreFec), A3585ForPreFec, Boolean.valueOf(n3586ForPreAnt), A3586ForPreAnt, Boolean.valueOf(n3587ForFecAnt), A3587ForFecAnt, Boolean.valueOf(n12130ForPanto), A12130ForPanto, Boolean.valueOf(n12732ForObsFac), A12732ForObsFac});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
            if ( (pr_default.getStatus(3) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A831TipColCod = W831TipColCod ;
            n831TipColCod = false ;
            A583IntCod = W583IntCod ;
            n583IntCod = false ;
            A626MatCod = W626MatCod ;
            n626MatCod = false ;
            A3316CodSol = W3316CodSol ;
            n3316CodSol = false ;
            A1514MacProCod = W1514MacProCod ;
            n1514MacProCod = false ;
            /* End Insert */
            AV126Inc_obs = httpContext.getMessage( "Creo Color en CFORMU", "") + GXutil.newLine( ) ;
            AV126Inc_obs += httpContext.getMessage( "N Ensayo = ", "") + GXutil.str( A5532Lb_numero, 8, 0) + GXutil.newLine( ) ;
            AV126Inc_obs += httpContext.getMessage( "Cliente  = ", "") + GXutil.str( A252CliCod, 6, 0) + GXutil.newLine( ) ;
            AV126Inc_obs += httpContext.getMessage( "Articulo = ", "") + A5533Lb_ArtCod + GXutil.newLine( ) ;
            AV126Inc_obs += httpContext.getMessage( "Color    = ", "") + A5536Lb_ColNom + GXutil.newLine( ) ;
            AV126Inc_obs += httpContext.getMessage( "Numero   = ", "") + GXutil.str( A5537Lb_ColNum, 6, 0) + GXutil.newLine( ) ;
            AV126Inc_obs += httpContext.getMessage( "Tc       = ", "") + GXutil.str( A831TipColCod, 2, 0) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV137Pgmname, AV78Usurcod, AV79Station, AV126Inc_obs, A5532Lb_numero, (byte)(0), " ") ;
            AV66i = (short)(10) ;
            /* Using cursor P01TB6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A5553Lb_ForCod = P01TB6_A5553Lb_ForCod[0] ;
               A8621Lb_Envio = P01TB6_A8621Lb_Envio[0] ;
               A5551Lb_lineaPq = P01TB6_A5551Lb_lineaPq[0] ;
               W396EmprCod = A396EmprCod ;
               AV83Lb_ForCod = A5553Lb_ForCod ;
               AV84Lb_ProFor = A5553Lb_ForCod ;
               if ( GXutil.strcmp(A8621Lb_Envio, httpContext.getMessage( "S", "")) == 0 )
               {
                  if ( AV91ProLab == 1 )
                  {
                     /* Execute user subroutine: 'PROCESO' */
                     S121 ();
                     if ( returnInSub )
                     {
                        pr_default.close(4);
                        pr_default.close(1);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                  }
                  System.out.println( httpContext.getMessage( "-New LFORMU", "") );
                  /*
                     INSERT RECORD ON TABLE TXPLFORMU

                  */
                  W396EmprCod = A396EmprCod ;
                  W252CliCod = A252CliCod ;
                  W831TipColCod = A831TipColCod ;
                  n831TipColCod = false ;
                  A494ForSer = A5533Lb_ArtCod ;
                  A482ForColNom = A5536Lb_ColNom ;
                  A483ForColNum = AV81Num_col ;
                  n831TipColCod = false ;
                  A1160ProForL = AV66i ;
                  A764ProForCod = AV84Lb_ProFor ;
                  A6549ProForFR = httpContext.getMessage( "R", "") ;
                  /* Using cursor P01TB7 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL), A764ProForCod, A6549ProForFR});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
                  if ( (pr_default.getStatus(5) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  A396EmprCod = W396EmprCod ;
                  A252CliCod = W252CliCod ;
                  A831TipColCod = W831TipColCod ;
                  n831TipColCod = false ;
                  /* End Insert */
                  AV126Inc_obs = httpContext.getMessage( "Creo Color en LFORMU", "") + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "N Ensayo = ", "") + GXutil.str( A5532Lb_numero, 8, 0) + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "Cliente  = ", "") + GXutil.str( A252CliCod, 6, 0) + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "Articulo = ", "") + A5533Lb_ArtCod + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "Color    = ", "") + A5536Lb_ColNom + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "Numero   = ", "") + GXutil.str( A5537Lb_ColNum, 6, 0) + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "Tc       = ", "") + GXutil.str( A831TipColCod, 2, 0) + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "Proceso  = ", "") + AV84Lb_ProFor ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV137Pgmname, AV78Usurcod, AV79Station, AV126Inc_obs, A5532Lb_numero, (byte)(0), " ") ;
                  AV66i = (short)(AV66i+10) ;
               }
               A396EmprCod = W396EmprCod ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Using cursor P01TB8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV63Lb_opcion});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A5556Lb_UltLC = P01TB8_A5556Lb_UltLC[0] ;
               A5559Lb_UltlP = P01TB8_A5559Lb_UltlP[0] ;
               A6310Lb_TaAuxC = P01TB8_A6310Lb_TaAuxC[0] ;
               n6310Lb_TaAuxC = P01TB8_n6310Lb_TaAuxC[0] ;
               A5555Lb_opcion = P01TB8_A5555Lb_opcion[0] ;
               W396EmprCod = A396EmprCod ;
               /*
                  INSERT RECORD ON TABLE TXPCDFORM

               */
               W396EmprCod = A396EmprCod ;
               W6310Lb_TaAuxC = A6310Lb_TaAuxC ;
               n6310Lb_TaAuxC = false ;
               A486ForNumCol = AV61ForNumCol ;
               A310ColUltLin = A5556Lb_UltLC ;
               A315ContNum = 10 ;
               A318CosKgm = DecimalUtil.doubleToDec(0) ;
               A741PrdUltLin = A5559Lb_UltlP ;
               System.out.println( httpContext.getMessage( "-New CDFORM", "") );
               n6310Lb_TaAuxC = false ;
               /* Using cursor P01TB9 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A310ColUltLin), Integer.valueOf(A315ContNum), A318CosKgm, Short.valueOf(A741PrdUltLin), Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC, Byte.valueOf(A6369Lb_fam1), Byte.valueOf(A6370Lb_fam2), Byte.valueOf(A6371Lb_fam3)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
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
               A396EmprCod = W396EmprCod ;
               A6310Lb_TaAuxC = W6310Lb_TaAuxC ;
               n6310Lb_TaAuxC = false ;
               /* End Insert */
               AV126Inc_obs = httpContext.getMessage( "Creo CDFORM", "") + GXutil.newLine( ) ;
               AV126Inc_obs += httpContext.getMessage( "N Ensayo = ", "") + GXutil.str( A5532Lb_numero, 8, 0) + GXutil.newLine( ) ;
               AV126Inc_obs += httpContext.getMessage( "Opcion   = ", "") + AV63Lb_opcion + GXutil.newLine( ) ;
               AV126Inc_obs += httpContext.getMessage( "N Formula= ", "") + GXutil.str( AV61ForNumCol, 8, 0) + GXutil.newLine( ) ;
               AV126Inc_obs += httpContext.getMessage( "Tabla Alc= ", "") + A6310Lb_TaAuxC ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV137Pgmname, AV78Usurcod, AV79Station, AV126Inc_obs, A5532Lb_numero, (byte)(0), " ") ;
               A396EmprCod = W396EmprCod ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(6);
            /* Using cursor P01TB10 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV63Lb_opcion});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A5557Lb_LineaC = P01TB10_A5557Lb_LineaC[0] ;
               A5558LB_CantC = P01TB10_A5558LB_CantC[0] ;
               A490ForPrdUMe = P01TB10_A490ForPrdUMe[0] ;
               A719PrdNum = P01TB10_A719PrdNum[0] ;
               A5555Lb_opcion = P01TB10_A5555Lb_opcion[0] ;
               A488ForPrdDsc = P01TB10_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P01TB10_n488ForPrdDsc[0] ;
               A488ForPrdDsc = P01TB10_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P01TB10_n488ForPrdDsc[0] ;
               W396EmprCod = A396EmprCod ;
               if ( A5558LB_CantC.doubleValue() == 0 )
               {
               }
               else
               {
                  System.out.println( httpContext.getMessage( "-New LDFORM", "") );
                  /*
                     INSERT RECORD ON TABLE TXPLDFORM

                  */
                  W396EmprCod = A396EmprCod ;
                  W719PrdNum = A719PrdNum ;
                  W490ForPrdUMe = A490ForPrdUMe ;
                  A486ForNumCol = AV61ForNumCol ;
                  A309ColLin = A5557Lb_LineaC ;
                  A481ForCan = A5558LB_CantC ;
                  /* Using cursor P01TB11 */
                  pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A481ForCan});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
                  if ( (pr_default.getStatus(9) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  A396EmprCod = W396EmprCod ;
                  A719PrdNum = W719PrdNum ;
                  A490ForPrdUMe = W490ForPrdUMe ;
                  /* End Insert */
                  AV126Inc_obs = httpContext.getMessage( "Creo LDFORM", "") + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "N Ensayo = ", "") + GXutil.str( A5532Lb_numero, 8, 0) + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "Opcion   = ", "") + AV63Lb_opcion + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "N Formula= ", "") + GXutil.str( AV61ForNumCol, 8, 0) + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "Prdnum   = ", "") + A719PrdNum + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "Cant     = ", "") + GXutil.str( A5558LB_CantC, 11, 5) + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "Unidad   = ", "") + GXutil.str( A490ForPrdUMe, 1, 0) + " " + GXutil.trim( A488ForPrdDsc) ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV137Pgmname, AV78Usurcod, AV79Station, AV126Inc_obs, A5532Lb_numero, (byte)(0), " ") ;
               }
               A396EmprCod = W396EmprCod ;
               pr_default.readNext(8);
            }
            pr_default.close(8);
            /* Using cursor P01TB12 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV63Lb_opcion});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A5560Lb_LineaPr = P01TB12_A5560Lb_LineaPr[0] ;
               A5561LB_CantP = P01TB12_A5561LB_CantP[0] ;
               A5562Lb_orden = P01TB12_A5562Lb_orden[0] ;
               A490ForPrdUMe = P01TB12_A490ForPrdUMe[0] ;
               A719PrdNum = P01TB12_A719PrdNum[0] ;
               A5555Lb_opcion = P01TB12_A5555Lb_opcion[0] ;
               A488ForPrdDsc = P01TB12_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P01TB12_n488ForPrdDsc[0] ;
               A488ForPrdDsc = P01TB12_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P01TB12_n488ForPrdDsc[0] ;
               W396EmprCod = A396EmprCod ;
               if ( A5561LB_CantP.doubleValue() == 0 )
               {
               }
               else
               {
                  System.out.println( httpContext.getMessage( "-New LPRFOR", "") );
                  /*
                     INSERT RECORD ON TABLE TXPLPRFOR

                  */
                  W396EmprCod = A396EmprCod ;
                  W719PrdNum = A719PrdNum ;
                  W490ForPrdUMe = A490ForPrdUMe ;
                  A486ForNumCol = AV61ForNumCol ;
                  A715PrdLin = A5560Lb_LineaPr ;
                  A487ForPrdCan = A5561LB_CantP ;
                  A489ForPrdNor = A5562Lb_orden ;
                  /* Using cursor P01TB13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin), A719PrdNum, A487ForPrdCan, Byte.valueOf(A490ForPrdUMe), Short.valueOf(A489ForPrdNor)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRFOR");
                  if ( (pr_default.getStatus(11) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  A396EmprCod = W396EmprCod ;
                  A719PrdNum = W719PrdNum ;
                  A490ForPrdUMe = W490ForPrdUMe ;
                  /* End Insert */
                  AV126Inc_obs = httpContext.getMessage( "Creo LPRFOR", "") + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "N Ensayo = ", "") + GXutil.str( A5532Lb_numero, 8, 0) + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "Opcion   = ", "") + AV63Lb_opcion + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "N Formula= ", "") + GXutil.str( AV61ForNumCol, 8, 0) + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "Prdnum   = ", "") + A719PrdNum + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "Cant     = ", "") + GXutil.str( A5561LB_CantP, 11, 5) + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "Unidad   = ", "") + GXutil.str( A490ForPrdUMe, 1, 0) + " " + GXutil.trim( A488ForPrdDsc) + GXutil.newLine( ) ;
                  AV126Inc_obs += httpContext.getMessage( "Orden    = ", "") + GXutil.str( A5562Lb_orden, 4, 0) ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV137Pgmname, AV78Usurcod, AV79Station, AV126Inc_obs, A5532Lb_numero, (byte)(0), " ") ;
               }
               A396EmprCod = W396EmprCod ;
               pr_default.readNext(10);
            }
            pr_default.close(10);
            A5569Lb_EstEns = (byte)(1) ;
         }
         else
         {
            System.out.println( httpContext.getMessage( "Elimino tablas Ldform,Lprfor", "") );
            GXv_char4[0] = A396EmprCod ;
            GXv_int7[0] = A5532Lb_numero ;
            GXv_char3[0] = AV63Lb_opcion ;
            GXv_date8[0] = AV62Lb_fechaR ;
            GXv_decimal9[0] = AV64Lb_costeE ;
            GXv_int10[0] = AV70Lb_rgb ;
            GXv_int6[0] = AV67F_cformu ;
            GXv_int11[0] = AV68F_ldform ;
            GXv_int12[0] = AV69F_lprfor ;
            GXv_int13[0] = AV81Num_col ;
            GXv_char2[0] = AV105ForPro ;
            new app.gestionlaboratorio.pens009d(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_date8, GXv_decimal9, GXv_int10, GXv_int6, GXv_int11, GXv_int12, GXv_int13, GXv_char2) ;
            pens009.this.A396EmprCod = GXv_char4[0] ;
            pens009.this.A5532Lb_numero = GXv_int7[0] ;
            pens009.this.AV63Lb_opcion = GXv_char3[0] ;
            pens009.this.AV62Lb_fechaR = GXv_date8[0] ;
            pens009.this.AV64Lb_costeE = GXv_decimal9[0] ;
            pens009.this.AV70Lb_rgb = GXv_int10[0] ;
            pens009.this.AV67F_cformu = GXv_int6[0] ;
            pens009.this.AV68F_ldform = GXv_int11[0] ;
            pens009.this.AV69F_lprfor = GXv_int12[0] ;
            pens009.this.AV81Num_col = GXv_int13[0] ;
            pens009.this.AV105ForPro = GXv_char2[0] ;
            if ( AV123OkInf == 1 )
            {
            }
            System.out.println( httpContext.getMessage( "Creo tablas Ldform,Lprfor", "") );
            GXv_char4[0] = A396EmprCod ;
            GXv_int13[0] = A5532Lb_numero ;
            GXv_char3[0] = AV63Lb_opcion ;
            GXv_date8[0] = AV62Lb_fechaR ;
            GXv_decimal9[0] = AV64Lb_costeE ;
            GXv_int10[0] = AV70Lb_rgb ;
            GXv_int12[0] = AV67F_cformu ;
            GXv_int11[0] = AV68F_ldform ;
            GXv_int6[0] = AV69F_lprfor ;
            GXv_int7[0] = AV81Num_col ;
            GXv_char2[0] = AV105ForPro ;
            new app.gestionlaboratorio.pens009a(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_char3, GXv_date8, GXv_decimal9, GXv_int10, GXv_int12, GXv_int11, GXv_int6, GXv_int7, GXv_char2) ;
            pens009.this.A396EmprCod = GXv_char4[0] ;
            pens009.this.A5532Lb_numero = GXv_int13[0] ;
            pens009.this.AV63Lb_opcion = GXv_char3[0] ;
            pens009.this.AV62Lb_fechaR = GXv_date8[0] ;
            pens009.this.AV64Lb_costeE = GXv_decimal9[0] ;
            pens009.this.AV70Lb_rgb = GXv_int10[0] ;
            pens009.this.AV67F_cformu = GXv_int12[0] ;
            pens009.this.AV68F_ldform = GXv_int11[0] ;
            pens009.this.AV69F_lprfor = GXv_int6[0] ;
            pens009.this.AV81Num_col = GXv_int7[0] ;
            pens009.this.AV105ForPro = GXv_char2[0] ;
            if ( AV123OkInf == 1 )
            {
            }
            /* Execute user subroutine: 'CFORMU2' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            A5569Lb_EstEns = (byte)(1) ;
         }
         if ( AV85HdrLab == 1 )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int13[0] = AV71CliCod ;
            GXv_char3[0] = AV72ForSer ;
            GXv_char2[0] = AV73ForColNom ;
            GXv_int7[0] = AV74ForColNum ;
            GXv_int12[0] = AV75TipColCod ;
            GXv_int11[0] = (byte)(1) ;
            GXv_int14[0] = A5532Lb_numero ;
            new app.gestionlaboratorio.penshrl(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_char3, GXv_char2, GXv_int7, GXv_int12, GXv_int11, GXv_int14) ;
            pens009.this.A396EmprCod = GXv_char4[0] ;
            pens009.this.AV71CliCod = GXv_int13[0] ;
            pens009.this.AV72ForSer = GXv_char3[0] ;
            pens009.this.AV73ForColNom = GXv_char2[0] ;
            pens009.this.AV74ForColNum = GXv_int7[0] ;
            pens009.this.AV75TipColCod = GXv_int12[0] ;
            pens009.this.A5532Lb_numero = GXv_int14[0] ;
         }
         if ( AV88Carvema == 1 )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int14[0] = AV71CliCod ;
            GXv_char3[0] = AV72ForSer ;
            GXv_char2[0] = AV73ForColNom ;
            GXv_int13[0] = AV74ForColNum ;
            GXv_int12[0] = AV75TipColCod ;
            new app.gestionlaboratorio.pmforeq(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_char3, GXv_char2, GXv_int13, GXv_int12) ;
            pens009.this.A396EmprCod = GXv_char4[0] ;
            pens009.this.AV71CliCod = GXv_int14[0] ;
            pens009.this.AV72ForSer = GXv_char3[0] ;
            pens009.this.AV73ForColNom = GXv_char2[0] ;
            pens009.this.AV74ForColNum = GXv_int13[0] ;
            pens009.this.AV75TipColCod = GXv_int12[0] ;
         }
         /* Using cursor P01TB14 */
         pr_default.execute(12, new Object[] {Byte.valueOf(A5569Lb_EstEns), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'CFORMU2' Routine */
      returnInSub = false ;
      /* Using cursor P01TB15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(AV71CliCod), AV72ForSer, AV73ForColNom, Integer.valueOf(AV74ForColNum), Byte.valueOf(AV75TipColCod)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A831TipColCod = P01TB15_A831TipColCod[0] ;
         n831TipColCod = P01TB15_n831TipColCod[0] ;
         A483ForColNum = P01TB15_A483ForColNum[0] ;
         A482ForColNom = P01TB15_A482ForColNom[0] ;
         A494ForSer = P01TB15_A494ForSer[0] ;
         A252CliCod = P01TB15_A252CliCod[0] ;
         A5625ForFecHor = P01TB15_A5625ForFecHor[0] ;
         n5625ForFecHor = P01TB15_n5625ForFecHor[0] ;
         A5624ForUsrCod = P01TB15_A5624ForUsrCod[0] ;
         n5624ForUsrCod = P01TB15_n5624ForUsrCod[0] ;
         A4380ForCosForm = P01TB15_A4380ForCosForm[0] ;
         n4380ForCosForm = P01TB15_n4380ForCosForm[0] ;
         A495ForUltMod = P01TB15_A495ForUltMod[0] ;
         n495ForUltMod = P01TB15_n495ForUltMod[0] ;
         A1159ForUltLin = P01TB15_A1159ForUltLin[0] ;
         n1159ForUltLin = P01TB15_n1159ForUltLin[0] ;
         A651ObsUltLin = P01TB15_A651ObsUltLin[0] ;
         n651ObsUltLin = P01TB15_n651ObsUltLin[0] ;
         A2838ForRelBan = P01TB15_A2838ForRelBan[0] ;
         n2838ForRelBan = P01TB15_n2838ForRelBan[0] ;
         A12130ForPanto = P01TB15_A12130ForPanto[0] ;
         n12130ForPanto = P01TB15_n12130ForPanto[0] ;
         A11705For_item2 = P01TB15_A11705For_item2[0] ;
         n11705For_item2 = P01TB15_n11705For_item2[0] ;
         A3316CodSol = P01TB15_A3316CodSol[0] ;
         n3316CodSol = P01TB15_n3316CodSol[0] ;
         A5625ForFecHor = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n5625ForFecHor = false ;
         A5624ForUsrCod = AV78Usurcod ;
         n5624ForUsrCod = false ;
         A4380ForCosForm = AV64Lb_costeE ;
         n4380ForCosForm = false ;
         A495ForUltMod = GXutil.today( ) ;
         n495ForUltMod = false ;
         if ( ( AV87Tinamar == 1 ) || ( AV92EnsPrf == 1 ) )
         {
            A1159ForUltLin = (short)(AV66i-10) ;
            n1159ForUltLin = false ;
         }
         if ( AV109ObsLab == 1 )
         {
            A651ObsUltLin = (short)(AV112OBSULTLIN-1) ;
            n651ObsUltLin = false ;
            if ( A651ObsUltLin < 0 )
            {
               A651ObsUltLin = (short)(0) ;
               n651ObsUltLin = false ;
            }
         }
         if ( AV95Lb_Rb.doubleValue() > 0 )
         {
            A2838ForRelBan = AV95Lb_Rb ;
            n2838ForRelBan = false ;
         }
         A12130ForPanto = AV127Lb_pantone ;
         n12130ForPanto = false ;
         A11705For_item2 = ((AV88Carvema==1) ? AV128Lb_talao : A11705For_item2) ;
         n11705For_item2 = false ;
         A3316CodSol = ((AV88Carvema==1) ? AV130CodSol : A3316CodSol) ;
         n3316CodSol = false ;
         /* Using cursor P01TB16 */
         pr_default.execute(14, new Object[] {Boolean.valueOf(n5625ForFecHor), A5625ForFecHor, Boolean.valueOf(n5624ForUsrCod), A5624ForUsrCod, Boolean.valueOf(n4380ForCosForm), A4380ForCosForm, Boolean.valueOf(n495ForUltMod), A495ForUltMod, Boolean.valueOf(n1159ForUltLin), Short.valueOf(A1159ForUltLin), Boolean.valueOf(n651ObsUltLin), Short.valueOf(A651ObsUltLin), Boolean.valueOf(n2838ForRelBan), A2838ForRelBan, Boolean.valueOf(n12130ForPanto), A12130ForPanto, Boolean.valueOf(n11705For_item2), A11705For_item2, Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void S121( )
   {
      /* 'PROCESO' Routine */
      returnInSub = false ;
      AV84Lb_ProFor = "" ;
      /* Using cursor P01TB17 */
      pr_default.execute(15, new Object[] {A396EmprCod, AV83Lb_ForCod});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A6061ProForLab = P01TB17_A6061ProForLab[0] ;
         A764ProForCod = P01TB17_A764ProForCod[0] ;
         if ( GXutil.strcmp(A764ProForCod, A6061ProForLab) != 0 )
         {
            AV84Lb_ProFor = A764ProForCod ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(15);
      }
      pr_default.close(15);
      if ( (GXutil.strcmp("", AV84Lb_ProFor)==0) )
      {
         AV84Lb_ProFor = AV83Lb_ForCod ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens009.this.A396EmprCod;
      this.aP1[0] = pens009.this.A5532Lb_numero;
      this.aP2[0] = pens009.this.AV63Lb_opcion;
      this.aP3[0] = pens009.this.AV62Lb_fechaR;
      this.aP4[0] = pens009.this.AV64Lb_costeE;
      this.aP5[0] = pens009.this.AV70Lb_rgb;
      this.aP6[0] = pens009.this.AV67F_cformu;
      this.aP7[0] = pens009.this.AV68F_ldform;
      this.aP8[0] = pens009.this.AV69F_lprfor;
      this.aP9[0] = pens009.this.AV81Num_col;
      this.aP10[0] = pens009.this.AV105ForPro;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens009");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV79Station = "" ;
      GXt_char1 = "" ;
      AV80EmprNom = "" ;
      AV78Usurcod = "" ;
      AV82Lb_preKg = DecimalUtil.ZERO ;
      AV124Lb_premt = DecimalUtil.ZERO ;
      AV129Lb_obsFac = "" ;
      scmdbuf = "" ;
      P01TB2_A396EmprCod = new String[] {""} ;
      P01TB2_A5532Lb_numero = new int[1] ;
      P01TB2_A5555Lb_opcion = new String[] {""} ;
      P01TB2_A5989Lb_PreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01TB2_A5718Lb_numop = new byte[1] ;
      P01TB2_A7395Lb_NumAux = new byte[1] ;
      P01TB2_A10083Lb_PreMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01TB2_A8622Lb_IntCod = new byte[1] ;
      P01TB2_A12731Lb_ObsFac = new String[] {""} ;
      A5555Lb_opcion = "" ;
      A5989Lb_PreKg = DecimalUtil.ZERO ;
      A10083Lb_PreMt = DecimalUtil.ZERO ;
      A12731Lb_ObsFac = "" ;
      P01TB3_A396EmprCod = new String[] {""} ;
      P01TB3_A5532Lb_numero = new int[1] ;
      P01TB3_A5537Lb_ColNum = new int[1] ;
      P01TB3_A5533Lb_ArtCod = new String[] {""} ;
      P01TB3_A5536Lb_ColNom = new String[] {""} ;
      P01TB3_A5538Lb_ColNomC = new String[] {""} ;
      P01TB3_A5539Lb_ColNumC = new int[1] ;
      P01TB3_A5597Lb_TipRec = new byte[1] ;
      P01TB3_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01TB3_A5540Lb_Cartaz = new String[] {""} ;
      P01TB3_A5534Lb_ArtDsc = new String[] {""} ;
      P01TB3_A6546Lb_Pantone = new String[] {""} ;
      P01TB3_A13303Lb_PrecioP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01TB3_A3316CodSol = new short[1] ;
      P01TB3_n3316CodSol = new boolean[] {false} ;
      P01TB3_A626MatCod = new short[1] ;
      P01TB3_n626MatCod = new boolean[] {false} ;
      P01TB3_A583IntCod = new byte[1] ;
      P01TB3_n583IntCod = new boolean[] {false} ;
      P01TB3_A831TipColCod = new byte[1] ;
      P01TB3_n831TipColCod = new boolean[] {false} ;
      P01TB3_A252CliCod = new int[1] ;
      P01TB3_A1514MacProCod = new String[] {""} ;
      P01TB3_n1514MacProCod = new boolean[] {false} ;
      P01TB3_A5535Lb_TipArt = new short[1] ;
      P01TB3_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P01TB3_A7780Lb_Hila = new String[] {""} ;
      P01TB3_A5700Lb_Talao = new String[] {""} ;
      P01TB3_A5569Lb_EstEns = new byte[1] ;
      A5533Lb_ArtCod = "" ;
      A5536Lb_ColNom = "" ;
      A5538Lb_ColNomC = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A5540Lb_Cartaz = "" ;
      A5534Lb_ArtDsc = "" ;
      A6546Lb_Pantone = "" ;
      A13303Lb_PrecioP = DecimalUtil.ZERO ;
      A1514MacProCod = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A7780Lb_Hila = "" ;
      A5700Lb_Talao = "" ;
      W396EmprCod = "" ;
      AV72ForSer = "" ;
      AV73ForColNom = "" ;
      AV90MacProcod = "" ;
      AV95Lb_Rb = DecimalUtil.ZERO ;
      AV96Lb_Cartaz = "" ;
      AV99Lb_ColNomC = "" ;
      AV119lb_fechae = GXutil.nullDate() ;
      AV121Lb_hila = "" ;
      AV127Lb_pantone = "" ;
      AV128Lb_talao = "" ;
      P01TB4_AV65ForUltLin = new short[1] ;
      W1514MacProCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A130BarCodPar = "" ;
      A485ForFec = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      A495ForUltMod = GXutil.nullDate() ;
      A496ForUltUti = GXutil.nullDate() ;
      A1191ForNomCli = "" ;
      A2749ForPro = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      A3007PrecioA = DecimalUtil.ZERO ;
      A3008PrecioM = DecimalUtil.ZERO ;
      A995ForTonal = "" ;
      A3558ForFecApr = GXutil.nullDate() ;
      A3559ForSitCom = "" ;
      A3560ForOpcCli = "" ;
      A3569UltEnsCod = "" ;
      A3585ForPreFec = GXutil.nullDate() ;
      A3586ForPreAnt = DecimalUtil.ZERO ;
      A3587ForFecAnt = GXutil.nullDate() ;
      A3588ForEst = "" ;
      A4223ForCosUti = DecimalUtil.ZERO ;
      A4224ForKgUTin = DecimalUtil.ZERO ;
      A4225ForKgTTin = DecimalUtil.ZERO ;
      A4226ForCosTTi = DecimalUtil.ZERO ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      A5337ForCodExt = "" ;
      A5626ForObsM = "" ;
      A5625ForFecHor = GXutil.resetTime( GXutil.nullDate() );
      A5624ForUsrCod = "" ;
      A5742ForSerDsc = "" ;
      A6379ForNomCli2 = "" ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A491ForPreDef = "" ;
      A12130ForPanto = "" ;
      A12732ForObsFac = "" ;
      A7781ForBlo = "" ;
      Gx_emsg = "" ;
      AV126Inc_obs = "" ;
      AV137Pgmname = "" ;
      P01TB6_A396EmprCod = new String[] {""} ;
      P01TB6_A5532Lb_numero = new int[1] ;
      P01TB6_A5553Lb_ForCod = new String[] {""} ;
      P01TB6_A8621Lb_Envio = new String[] {""} ;
      P01TB6_A5551Lb_lineaPq = new short[1] ;
      A5553Lb_ForCod = "" ;
      A8621Lb_Envio = "" ;
      AV83Lb_ForCod = "" ;
      AV84Lb_ProFor = "" ;
      A764ProForCod = "" ;
      A6549ProForFR = "" ;
      P01TB8_A396EmprCod = new String[] {""} ;
      P01TB8_A5532Lb_numero = new int[1] ;
      P01TB8_A5556Lb_UltLC = new short[1] ;
      P01TB8_A5559Lb_UltlP = new short[1] ;
      P01TB8_A6310Lb_TaAuxC = new String[] {""} ;
      P01TB8_n6310Lb_TaAuxC = new boolean[] {false} ;
      P01TB8_A5555Lb_opcion = new String[] {""} ;
      A6310Lb_TaAuxC = "" ;
      W6310Lb_TaAuxC = "" ;
      A318CosKgm = DecimalUtil.ZERO ;
      P01TB10_A396EmprCod = new String[] {""} ;
      P01TB10_A5532Lb_numero = new int[1] ;
      P01TB10_A5557Lb_LineaC = new short[1] ;
      P01TB10_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01TB10_A490ForPrdUMe = new byte[1] ;
      P01TB10_A719PrdNum = new String[] {""} ;
      P01TB10_A5555Lb_opcion = new String[] {""} ;
      P01TB10_A488ForPrdDsc = new String[] {""} ;
      P01TB10_n488ForPrdDsc = new boolean[] {false} ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A488ForPrdDsc = "" ;
      W719PrdNum = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      P01TB12_A396EmprCod = new String[] {""} ;
      P01TB12_A5532Lb_numero = new int[1] ;
      P01TB12_A5560Lb_LineaPr = new short[1] ;
      P01TB12_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01TB12_A5562Lb_orden = new short[1] ;
      P01TB12_A490ForPrdUMe = new byte[1] ;
      P01TB12_A719PrdNum = new String[] {""} ;
      P01TB12_A5555Lb_opcion = new String[] {""} ;
      P01TB12_A488ForPrdDsc = new String[] {""} ;
      P01TB12_n488ForPrdDsc = new boolean[] {false} ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int10 = new long[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int12 = new byte[1] ;
      P01TB15_A396EmprCod = new String[] {""} ;
      P01TB15_A831TipColCod = new byte[1] ;
      P01TB15_n831TipColCod = new boolean[] {false} ;
      P01TB15_A483ForColNum = new int[1] ;
      P01TB15_A482ForColNom = new String[] {""} ;
      P01TB15_A494ForSer = new String[] {""} ;
      P01TB15_A252CliCod = new int[1] ;
      P01TB15_A5625ForFecHor = new java.util.Date[] {GXutil.nullDate()} ;
      P01TB15_n5625ForFecHor = new boolean[] {false} ;
      P01TB15_A5624ForUsrCod = new String[] {""} ;
      P01TB15_n5624ForUsrCod = new boolean[] {false} ;
      P01TB15_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01TB15_n4380ForCosForm = new boolean[] {false} ;
      P01TB15_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P01TB15_n495ForUltMod = new boolean[] {false} ;
      P01TB15_A1159ForUltLin = new short[1] ;
      P01TB15_n1159ForUltLin = new boolean[] {false} ;
      P01TB15_A651ObsUltLin = new short[1] ;
      P01TB15_n651ObsUltLin = new boolean[] {false} ;
      P01TB15_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01TB15_n2838ForRelBan = new boolean[] {false} ;
      P01TB15_A12130ForPanto = new String[] {""} ;
      P01TB15_n12130ForPanto = new boolean[] {false} ;
      P01TB15_A11705For_item2 = new String[] {""} ;
      P01TB15_n11705For_item2 = new boolean[] {false} ;
      P01TB15_A3316CodSol = new short[1] ;
      P01TB15_n3316CodSol = new boolean[] {false} ;
      A11705For_item2 = "" ;
      P01TB17_A396EmprCod = new String[] {""} ;
      P01TB17_A6061ProForLab = new String[] {""} ;
      P01TB17_A764ProForCod = new String[] {""} ;
      A6061ProForLab = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens009__default(),
         new Object[] {
             new Object[] {
            P01TB2_A396EmprCod, P01TB2_A5532Lb_numero, P01TB2_A5555Lb_opcion, P01TB2_A5989Lb_PreKg, P01TB2_A5718Lb_numop, P01TB2_A7395Lb_NumAux, P01TB2_A10083Lb_PreMt, P01TB2_A8622Lb_IntCod, P01TB2_A12731Lb_ObsFac
            }
            , new Object[] {
            P01TB3_A396EmprCod, P01TB3_A5532Lb_numero, P01TB3_A5537Lb_ColNum, P01TB3_A5533Lb_ArtCod, P01TB3_A5536Lb_ColNom, P01TB3_A5538Lb_ColNomC, P01TB3_A5539Lb_ColNumC, P01TB3_A5597Lb_TipRec, P01TB3_A5547Lb_Rb, P01TB3_A5540Lb_Cartaz,
            P01TB3_A5534Lb_ArtDsc, P01TB3_A6546Lb_Pantone, P01TB3_A13303Lb_PrecioP, P01TB3_A3316CodSol, P01TB3_n3316CodSol, P01TB3_A626MatCod, P01TB3_n626MatCod, P01TB3_A583IntCod, P01TB3_n583IntCod, P01TB3_A831TipColCod,
            P01TB3_n831TipColCod, P01TB3_A252CliCod, P01TB3_A1514MacProCod, P01TB3_n1514MacProCod, P01TB3_A5535Lb_TipArt, P01TB3_A5541Lb_FechaE, P01TB3_A7780Lb_Hila, P01TB3_A5700Lb_Talao, P01TB3_A5569Lb_EstEns
            }
            , new Object[] {
            P01TB4_AV65ForUltLin
            }
            , new Object[] {
            }
            , new Object[] {
            P01TB6_A396EmprCod, P01TB6_A5532Lb_numero, P01TB6_A5553Lb_ForCod, P01TB6_A8621Lb_Envio, P01TB6_A5551Lb_lineaPq
            }
            , new Object[] {
            }
            , new Object[] {
            P01TB8_A396EmprCod, P01TB8_A5532Lb_numero, P01TB8_A5556Lb_UltLC, P01TB8_A5559Lb_UltlP, P01TB8_A6310Lb_TaAuxC, P01TB8_n6310Lb_TaAuxC, P01TB8_A5555Lb_opcion
            }
            , new Object[] {
            }
            , new Object[] {
            P01TB10_A396EmprCod, P01TB10_A5532Lb_numero, P01TB10_A5557Lb_LineaC, P01TB10_A5558LB_CantC, P01TB10_A490ForPrdUMe, P01TB10_A719PrdNum, P01TB10_A5555Lb_opcion, P01TB10_A488ForPrdDsc, P01TB10_n488ForPrdDsc
            }
            , new Object[] {
            }
            , new Object[] {
            P01TB12_A396EmprCod, P01TB12_A5532Lb_numero, P01TB12_A5560Lb_LineaPr, P01TB12_A5561LB_CantP, P01TB12_A5562Lb_orden, P01TB12_A490ForPrdUMe, P01TB12_A719PrdNum, P01TB12_A5555Lb_opcion, P01TB12_A488ForPrdDsc, P01TB12_n488ForPrdDsc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01TB15_A396EmprCod, P01TB15_A831TipColCod, P01TB15_A483ForColNum, P01TB15_A482ForColNom, P01TB15_A494ForSer, P01TB15_A252CliCod, P01TB15_A5625ForFecHor, P01TB15_n5625ForFecHor, P01TB15_A5624ForUsrCod, P01TB15_n5624ForUsrCod,
            P01TB15_A4380ForCosForm, P01TB15_n4380ForCosForm, P01TB15_A495ForUltMod, P01TB15_n495ForUltMod, P01TB15_A1159ForUltLin, P01TB15_n1159ForUltLin, P01TB15_A651ObsUltLin, P01TB15_n651ObsUltLin, P01TB15_A2838ForRelBan, P01TB15_n2838ForRelBan,
            P01TB15_A12130ForPanto, P01TB15_n12130ForPanto, P01TB15_A11705For_item2, P01TB15_n11705For_item2, P01TB15_A3316CodSol, P01TB15_n3316CodSol
            }
            , new Object[] {
            }
            , new Object[] {
            P01TB17_A396EmprCod, P01TB17_A6061ProForLab, P01TB17_A764ProForCod
            }
         }
      );
      AV137Pgmname = "GestionLaboratorio.PENS009" ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      AV137Pgmname = "GestionLaboratorio.PENS009" ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV67F_cformu ;
   private byte AV68F_ldform ;
   private byte AV69F_lprfor ;
   private byte AV85HdrLab ;
   private byte AV87Tinamar ;
   private byte AV88Carvema ;
   private byte AV91ProLab ;
   private byte AV92EnsPrf ;
   private byte AV118Texfina ;
   private byte AV120HilasaLote ;
   private byte AV122Filasur ;
   private byte AV123OkInf ;
   private byte GXt_int5 ;
   private byte AV116LB_NUMOP ;
   private byte AV117LB_NUMAUX ;
   private byte AV125Lb_intcod ;
   private byte A5718Lb_numop ;
   private byte A7395Lb_NumAux ;
   private byte A8622Lb_IntCod ;
   private byte A5597Lb_TipRec ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte A5569Lb_EstEns ;
   private byte AV75TipColCod ;
   private byte AV89IntCod ;
   private byte W831TipColCod ;
   private byte W583IntCod ;
   private byte A132BarCodReo ;
   private byte A484ForCon ;
   private byte A1518RecCorULin ;
   private byte AV101Hidro ;
   private byte AV102LenArt ;
   private byte AV103LenArt4 ;
   private byte AV115Magosa ;
   private byte A7537ForOpNum ;
   private byte A5362IntCodF ;
   private byte A6371Lb_fam3 ;
   private byte A6370Lb_fam2 ;
   private byte A6369Lb_fam1 ;
   private byte A490ForPrdUMe ;
   private byte W490ForPrdUMe ;
   private byte GXv_int6[] ;
   private byte GXv_int11[] ;
   private byte GXv_int12[] ;
   private byte AV109ObsLab ;
   private short A3316CodSol ;
   private short A626MatCod ;
   private short A5535Lb_TipArt ;
   private short AV94MatCod ;
   private short AV104Lb_TipArt ;
   private short AV130CodSol ;
   private short AV65ForUltLin ;
   private short cV65ForUltLin ;
   private short W626MatCod ;
   private short W3316CodSol ;
   private short A651ObsUltLin ;
   private short A1159ForUltLin ;
   private short A3688ComUltLin ;
   private short A4384ForTipArt ;
   private short A5653ForPInc ;
   private short Gx_err ;
   private short AV66i ;
   private short A5551Lb_lineaPq ;
   private short A1160ProForL ;
   private short A5556Lb_UltLC ;
   private short A5559Lb_UltlP ;
   private short A310ColUltLin ;
   private short A741PrdUltLin ;
   private short A5557Lb_LineaC ;
   private short A309ColLin ;
   private short A5560Lb_LineaPr ;
   private short A5562Lb_orden ;
   private short A715PrdLin ;
   private short A489ForPrdNor ;
   private short AV112OBSULTLIN ;
   private int A5532Lb_numero ;
   private int AV81Num_col ;
   private int A5537Lb_ColNum ;
   private int A5539Lb_ColNumC ;
   private int A252CliCod ;
   private int AV71CliCod ;
   private int AV74ForColNum ;
   private int AV97Lb_numero ;
   private int AV100Lb_ColNumC ;
   private int AV61ForNumCol ;
   private int GX_INS47 ;
   private int W252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int A129BarCod ;
   private int A1192ForNumCli ;
   private int A3315ForNumArc ;
   private int GX_INS154 ;
   private int GX_INS32 ;
   private int A315ContNum ;
   private int GX_INS33 ;
   private int GX_INS82 ;
   private int GXv_int7[] ;
   private int GXv_int14[] ;
   private int GXv_int13[] ;
   private long AV70Lb_rgb ;
   private long A4339ForRGB ;
   private long GXv_int10[] ;
   private java.math.BigDecimal AV64Lb_costeE ;
   private java.math.BigDecimal AV82Lb_preKg ;
   private java.math.BigDecimal AV124Lb_premt ;
   private java.math.BigDecimal A5989Lb_PreKg ;
   private java.math.BigDecimal A10083Lb_PreMt ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal A13303Lb_PrecioP ;
   private java.math.BigDecimal AV95Lb_Rb ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal A3007PrecioA ;
   private java.math.BigDecimal A3008PrecioM ;
   private java.math.BigDecimal A3586ForPreAnt ;
   private java.math.BigDecimal A4223ForCosUti ;
   private java.math.BigDecimal A4224ForKgUTin ;
   private java.math.BigDecimal A4225ForKgTTin ;
   private java.math.BigDecimal A4226ForCosTTi ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A493ForPreMtr ;
   private java.math.BigDecimal A318CosKgm ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal A5561LB_CantP ;
   private java.math.BigDecimal A487ForPrdCan ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String A396EmprCod ;
   private String AV63Lb_opcion ;
   private String AV105ForPro ;
   private String AV79Station ;
   private String GXt_char1 ;
   private String AV80EmprNom ;
   private String AV78Usurcod ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String A5533Lb_ArtCod ;
   private String A5536Lb_ColNom ;
   private String A5538Lb_ColNomC ;
   private String A5540Lb_Cartaz ;
   private String A5534Lb_ArtDsc ;
   private String A6546Lb_Pantone ;
   private String A1514MacProCod ;
   private String A7780Lb_Hila ;
   private String A5700Lb_Talao ;
   private String W396EmprCod ;
   private String AV72ForSer ;
   private String AV73ForColNom ;
   private String AV90MacProcod ;
   private String AV96Lb_Cartaz ;
   private String AV99Lb_ColNomC ;
   private String AV121Lb_hila ;
   private String AV127Lb_pantone ;
   private String AV128Lb_talao ;
   private String W1514MacProCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A130BarCodPar ;
   private String A1191ForNomCli ;
   private String A2749ForPro ;
   private String A995ForTonal ;
   private String A3559ForSitCom ;
   private String A3560ForOpcCli ;
   private String A3569UltEnsCod ;
   private String A3588ForEst ;
   private String A5337ForCodExt ;
   private String A5624ForUsrCod ;
   private String A5742ForSerDsc ;
   private String A6379ForNomCli2 ;
   private String A491ForPreDef ;
   private String A12130ForPanto ;
   private String A7781ForBlo ;
   private String Gx_emsg ;
   private String AV137Pgmname ;
   private String A5553Lb_ForCod ;
   private String A8621Lb_Envio ;
   private String AV83Lb_ForCod ;
   private String AV84Lb_ProFor ;
   private String A764ProForCod ;
   private String A6549ProForFR ;
   private String A6310Lb_TaAuxC ;
   private String W6310Lb_TaAuxC ;
   private String A719PrdNum ;
   private String A488ForPrdDsc ;
   private String W719PrdNum ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String A11705For_item2 ;
   private String A6061ProForLab ;
   private java.util.Date A5625ForFecHor ;
   private java.util.Date AV62Lb_fechaR ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV119lb_fechae ;
   private java.util.Date A485ForFec ;
   private java.util.Date Gx_date ;
   private java.util.Date A495ForUltMod ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date A3558ForFecApr ;
   private java.util.Date A3585ForPreFec ;
   private java.util.Date A3587ForFecAnt ;
   private java.util.Date GXv_date8[] ;
   private boolean n3316CodSol ;
   private boolean n626MatCod ;
   private boolean n583IntCod ;
   private boolean n831TipColCod ;
   private boolean n1514MacProCod ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n485ForFec ;
   private boolean n495ForUltMod ;
   private boolean n496ForUltUti ;
   private boolean n651ObsUltLin ;
   private boolean n1159ForUltLin ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private boolean n1518RecCorULin ;
   private boolean n2749ForPro ;
   private boolean n2838ForRelBan ;
   private boolean n3007PrecioA ;
   private boolean n3008PrecioM ;
   private boolean n995ForTonal ;
   private boolean n3315ForNumArc ;
   private boolean n3558ForFecApr ;
   private boolean n3559ForSitCom ;
   private boolean n3560ForOpcCli ;
   private boolean n3569UltEnsCod ;
   private boolean n3585ForPreFec ;
   private boolean n3586ForPreAnt ;
   private boolean n3587ForFecAnt ;
   private boolean n3588ForEst ;
   private boolean n3688ComUltLin ;
   private boolean n4223ForCosUti ;
   private boolean n4224ForKgUTin ;
   private boolean n4225ForKgTTin ;
   private boolean n4226ForCosTTi ;
   private boolean n4339ForRGB ;
   private boolean n4380ForCosForm ;
   private boolean n4384ForTipArt ;
   private boolean n5337ForCodExt ;
   private boolean n5626ForObsM ;
   private boolean n5625ForFecHor ;
   private boolean n5624ForUsrCod ;
   private boolean n5653ForPInc ;
   private boolean n7537ForOpNum ;
   private boolean n5742ForSerDsc ;
   private boolean n6379ForNomCli2 ;
   private boolean n492ForPreKgm ;
   private boolean n493ForPreMtr ;
   private boolean n491ForPreDef ;
   private boolean n5362IntCodF ;
   private boolean n12130ForPanto ;
   private boolean n12732ForObsFac ;
   private boolean n7781ForBlo ;
   private boolean returnInSub ;
   private boolean n6310Lb_TaAuxC ;
   private boolean n488ForPrdDsc ;
   private boolean n11705For_item2 ;
   private String AV129Lb_obsFac ;
   private String A12731Lb_ObsFac ;
   private String A5626ForObsM ;
   private String A12732ForObsFac ;
   private String AV126Inc_obs ;
   private String[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private long[] aP5 ;
   private byte[] aP6 ;
   private byte[] aP7 ;
   private byte[] aP8 ;
   private int[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P01TB2_A396EmprCod ;
   private int[] P01TB2_A5532Lb_numero ;
   private String[] P01TB2_A5555Lb_opcion ;
   private java.math.BigDecimal[] P01TB2_A5989Lb_PreKg ;
   private byte[] P01TB2_A5718Lb_numop ;
   private byte[] P01TB2_A7395Lb_NumAux ;
   private java.math.BigDecimal[] P01TB2_A10083Lb_PreMt ;
   private byte[] P01TB2_A8622Lb_IntCod ;
   private String[] P01TB2_A12731Lb_ObsFac ;
   private String[] P01TB3_A396EmprCod ;
   private int[] P01TB3_A5532Lb_numero ;
   private int[] P01TB3_A5537Lb_ColNum ;
   private String[] P01TB3_A5533Lb_ArtCod ;
   private String[] P01TB3_A5536Lb_ColNom ;
   private String[] P01TB3_A5538Lb_ColNomC ;
   private int[] P01TB3_A5539Lb_ColNumC ;
   private byte[] P01TB3_A5597Lb_TipRec ;
   private java.math.BigDecimal[] P01TB3_A5547Lb_Rb ;
   private String[] P01TB3_A5540Lb_Cartaz ;
   private String[] P01TB3_A5534Lb_ArtDsc ;
   private String[] P01TB3_A6546Lb_Pantone ;
   private java.math.BigDecimal[] P01TB3_A13303Lb_PrecioP ;
   private short[] P01TB3_A3316CodSol ;
   private boolean[] P01TB3_n3316CodSol ;
   private short[] P01TB3_A626MatCod ;
   private boolean[] P01TB3_n626MatCod ;
   private byte[] P01TB3_A583IntCod ;
   private boolean[] P01TB3_n583IntCod ;
   private byte[] P01TB3_A831TipColCod ;
   private boolean[] P01TB3_n831TipColCod ;
   private int[] P01TB3_A252CliCod ;
   private String[] P01TB3_A1514MacProCod ;
   private boolean[] P01TB3_n1514MacProCod ;
   private short[] P01TB3_A5535Lb_TipArt ;
   private java.util.Date[] P01TB3_A5541Lb_FechaE ;
   private String[] P01TB3_A7780Lb_Hila ;
   private String[] P01TB3_A5700Lb_Talao ;
   private byte[] P01TB3_A5569Lb_EstEns ;
   private short[] P01TB4_AV65ForUltLin ;
   private String[] P01TB6_A396EmprCod ;
   private int[] P01TB6_A5532Lb_numero ;
   private String[] P01TB6_A5553Lb_ForCod ;
   private String[] P01TB6_A8621Lb_Envio ;
   private short[] P01TB6_A5551Lb_lineaPq ;
   private String[] P01TB8_A396EmprCod ;
   private int[] P01TB8_A5532Lb_numero ;
   private short[] P01TB8_A5556Lb_UltLC ;
   private short[] P01TB8_A5559Lb_UltlP ;
   private String[] P01TB8_A6310Lb_TaAuxC ;
   private boolean[] P01TB8_n6310Lb_TaAuxC ;
   private String[] P01TB8_A5555Lb_opcion ;
   private String[] P01TB10_A396EmprCod ;
   private int[] P01TB10_A5532Lb_numero ;
   private short[] P01TB10_A5557Lb_LineaC ;
   private java.math.BigDecimal[] P01TB10_A5558LB_CantC ;
   private byte[] P01TB10_A490ForPrdUMe ;
   private String[] P01TB10_A719PrdNum ;
   private String[] P01TB10_A5555Lb_opcion ;
   private String[] P01TB10_A488ForPrdDsc ;
   private boolean[] P01TB10_n488ForPrdDsc ;
   private String[] P01TB12_A396EmprCod ;
   private int[] P01TB12_A5532Lb_numero ;
   private short[] P01TB12_A5560Lb_LineaPr ;
   private java.math.BigDecimal[] P01TB12_A5561LB_CantP ;
   private short[] P01TB12_A5562Lb_orden ;
   private byte[] P01TB12_A490ForPrdUMe ;
   private String[] P01TB12_A719PrdNum ;
   private String[] P01TB12_A5555Lb_opcion ;
   private String[] P01TB12_A488ForPrdDsc ;
   private boolean[] P01TB12_n488ForPrdDsc ;
   private String[] P01TB15_A396EmprCod ;
   private byte[] P01TB15_A831TipColCod ;
   private boolean[] P01TB15_n831TipColCod ;
   private int[] P01TB15_A483ForColNum ;
   private String[] P01TB15_A482ForColNom ;
   private String[] P01TB15_A494ForSer ;
   private int[] P01TB15_A252CliCod ;
   private java.util.Date[] P01TB15_A5625ForFecHor ;
   private boolean[] P01TB15_n5625ForFecHor ;
   private String[] P01TB15_A5624ForUsrCod ;
   private boolean[] P01TB15_n5624ForUsrCod ;
   private java.math.BigDecimal[] P01TB15_A4380ForCosForm ;
   private boolean[] P01TB15_n4380ForCosForm ;
   private java.util.Date[] P01TB15_A495ForUltMod ;
   private boolean[] P01TB15_n495ForUltMod ;
   private short[] P01TB15_A1159ForUltLin ;
   private boolean[] P01TB15_n1159ForUltLin ;
   private short[] P01TB15_A651ObsUltLin ;
   private boolean[] P01TB15_n651ObsUltLin ;
   private java.math.BigDecimal[] P01TB15_A2838ForRelBan ;
   private boolean[] P01TB15_n2838ForRelBan ;
   private String[] P01TB15_A12130ForPanto ;
   private boolean[] P01TB15_n12130ForPanto ;
   private String[] P01TB15_A11705For_item2 ;
   private boolean[] P01TB15_n11705For_item2 ;
   private short[] P01TB15_A3316CodSol ;
   private boolean[] P01TB15_n3316CodSol ;
   private String[] P01TB17_A396EmprCod ;
   private String[] P01TB17_A6061ProForLab ;
   private String[] P01TB17_A764ProForCod ;
}

final  class pens009__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01TB2", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_PreKg, Lb_numop, Lb_NumAux, Lb_PreMt, Lb_IntCod, Lb_ObsFac FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01TB3", "SELECT EmprCod, Lb_numero, Lb_ColNum, Lb_ArtCod, Lb_ColNom, Lb_ColNomC, Lb_ColNumC, Lb_TipRec, Lb_Rb, Lb_Cartaz, Lb_ArtDsc, Lb_Pantone, Lb_PrecioP, CodSol, MatCod, IntCod, TipColCod, CliCod, MacProCod, Lb_TipArt, Lb_FechaE, Lb_Hila, Lb_Talao, Lb_EstEns FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01TB4", "SELECT COUNT(*) FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01TB5", "INSERT INTO TXPCFORMU(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForNumCol, BarCod, BarCodReo, BarCodPar, ForFec, ForUltMod, IntCod, MatCod, ForUltUti, ForPreKgm, ForPreMtr, ForPreDef, ForCon, ObsUltLin, ForUltLin, ForNomCli, ForNumCli, RecCorULin, ForPro, ForRelBan, PrecioA, PrecioM, ForTonal, ForNumArc, CodSol, ForFecApr, ForSitCom, ForOpcCli, ForEst, ComUltLin, MacProCod, ForCosUti, ForRGB, ForCosForm, ForTipArt, ForCodExt, IntCodF, ForUsrCod, ForFecHor, ForObsM, ForPInc, ForSerDsc, ForNomCli2, ForOpNum, ForBlo, ForKgUTin, ForKgTTin, ForCosTTi, UltEnsCod, ForPreFec, ForPreAnt, ForFecAnt, ForPanto, ForObsFac, ForUsrCre, ForFecCre, ForNomCli3, Sim_Ulin, ForTipT, Fam_Cod, For_item1, Lb_CodL, Lb_CodC, For_Reo, ForFecCtrl, ForFecCtrf, ForcosH20, ForCosFab, ForCosFin, For_item2, ForObs2, ForCurva, ForMT, ForTRabs, ForKgMn, ForLotHil2, ForLotHil3, ForLbTalao, ForSerDsc2, ForAlterna, ForPlanta) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
         ,new ForEachCursor("P01TB6", "SELECT EmprCod, Lb_numero, Lb_ForCod, Lb_Envio, Lb_lineaPq FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01TB7", "INSERT INTO TXPLFORMU(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForCod, ProForFR, ProFoNPrg, ProForrbn, ProForVol, ProForMq, ProForH2O, ProforFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new ForEachCursor("P01TB8", "SELECT EmprCod, Lb_numero, Lb_UltLC, Lb_UltlP, Lb_TaAuxC, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01TB9", "INSERT INTO TXPCDFORM(EmprCod, ForNumCol, ColUltLin, ContNum, CosKgm, PrdUltLin, Lb_TaAuxC, Lb_fam1, Lb_fam2, Lb_fam3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDFORM")
         ,new ForEachCursor("P01TB10", "SELECT T1.EmprCod, T1.Lb_numero, T1.Lb_LineaC, T1.LB_CantC, T1.ForPrdUMe, T1.PrdNum, T1.Lb_opcion, T2.ForPrdDsc FROM (TXPENS003 T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01TB11", "INSERT INTO TXPLDFORM(EmprCod, ForNumCol, ColLin, PrdNum, ForPrdUMe, ForCan, TotLinCol, ForClaCol, ColFibra) VALUES(?, ?, ?, ?, ?, ?, 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDFORM")
         ,new ForEachCursor("P01TB12", "SELECT T1.EmprCod, T1.Lb_numero, T1.Lb_LineaPr, T1.LB_CantP, T1.Lb_orden, T1.ForPrdUMe, T1.PrdNum, T1.Lb_opcion, T2.ForPrdDsc FROM (TXPENS004 T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01TB13", "INSERT INTO TXPLPRFOR(EmprCod, ForNumCol, PrdLin, PrdNum, ForPrdCan, ForPrdUMe, ForPrdNor) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRFOR")
         ,new UpdateCursor("P01TB14", "UPDATE TXPENS001 SET Lb_EstEns=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
         ,new ForEachCursor("P01TB15", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForFecHor, ForUsrCod, ForCosForm, ForUltMod, ForUltLin, ObsUltLin, ForRelBan, ForPanto, For_item2, CodSol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01TB16", "UPDATE TXPCFORMU SET ForFecHor=?, ForUsrCod=?, ForCosForm=?, ForUltMod=?, ForUltLin=?, ObsUltLin=?, ForRelBan=?, ForPanto=?, For_item2=?, CodSol=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
         ,new ForEachCursor("P01TB17", "SELECT EmprCod, ProForLab, ProForCod FROM TXPCPROFO WHERE EmprCod = ? and ProForLab = ? ORDER BY EmprCod, ProForLab ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 100);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(17);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(20);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(21);
               ((String[]) buf[26])[0] = rslt.getString(22, 20);
               ((String[]) buf[27])[0] = rslt.getString(23, 20);
               ((byte[]) buf[28])[0] = rslt.getByte(24);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 100);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[6]).byteValue());
               }
               stmt.setInt(7, ((Number) parms[7]).intValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DATE );
               }
               else
               {
                  stmt.setDate(12, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DATE );
               }
               else
               {
                  stmt.setDate(15, (java.util.Date)parms[23]);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[25], 5);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[29], 1);
               }
               stmt.setByte(19, ((Number) parms[30]).byteValue());
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[34]).shortValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[36], 13);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[38]).intValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[40]).byteValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[42], 1);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[48], 5);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[50], 20);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[52]).intValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[54]).shortValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DATE );
               }
               else
               {
                  stmt.setDate(32, (java.util.Date)parms[56]);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[58], 1);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[60], 1);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[62], 1);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[64]).shortValue());
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[66], 6);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(39, ((Number) parms[70]).longValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(40, (java.math.BigDecimal)parms[72], 5);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(41, ((Number) parms[74]).shortValue());
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[76], 2);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(43, ((Number) parms[78]).byteValue());
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[80], 8);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(45, (java.util.Date)parms[82], false);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(46, (String)parms[84], 300);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(47, ((Number) parms[86]).shortValue());
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[88], 26);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[90], 20);
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(50, ((Number) parms[92]).byteValue());
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[94], 1);
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(52, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(53, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(54, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(55, (String)parms[102], 1);
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.DATE );
               }
               else
               {
                  stmt.setDate(56, (java.util.Date)parms[104]);
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(57, (java.math.BigDecimal)parms[106], 5);
               }
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.DATE );
               }
               else
               {
                  stmt.setDate(58, (java.util.Date)parms[108]);
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(59, (String)parms[110], 100);
               }
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(60, (String)parms[112], 200);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[6]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setString(8, (String)parms[8], 6);
               stmt.setString(9, (String)parms[9], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 4);
               }
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 12 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 8);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 100);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 30);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               stmt.setString(11, (String)parms[20], 3);
               stmt.setInt(12, ((Number) parms[21]).intValue());
               stmt.setString(13, (String)parms[22], 16);
               stmt.setString(14, (String)parms[23], 13);
               stmt.setInt(15, ((Number) parms[24]).intValue());
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[26]).byteValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

