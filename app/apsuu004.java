package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsuu004 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsuu004 pgm = new apsuu004 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apsuu004( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsuu004.class ), "" );
   }

   public apsuu004( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Traspaso de Pedidos a OP...", "") );
      AV44Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV15EmprCod ;
      GXv_char2[0] = AV46EmprNom ;
      GXv_char3[0] = AV45UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV44Station, GXv_char1, GXv_char2, GXv_char3) ;
      apsuu004.this.AV15EmprCod = GXv_char1[0] ;
      apsuu004.this.AV46EmprNom = GXv_char2[0] ;
      apsuu004.this.AV45UsurCod = GXv_char3[0] ;
      GXt_int4 = AV91PLinea ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int5) ;
      apsuu004.this.GXt_int4 = GXv_int5[0] ;
      AV91PLinea = GXt_int4 ;
      GXt_int4 = AV96Salayet ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "SALAYE", ""), GXv_int5) ;
      apsuu004.this.GXt_int4 = GXv_int5[0] ;
      AV96Salayet = GXt_int4 ;
      GXv_int5[0] = AV116Pizarro ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PIZARR", ""), GXv_int5) ;
      apsuu004.this.AV116Pizarro = GXv_int5[0] ;
      GXv_int5[0] = AV47FlagVTab ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CTRUSE", ""), GXv_int5) ;
      apsuu004.this.AV47FlagVTab = GXv_int5[0] ;
      GXv_int5[0] = AV28Flag ;
      new app.popcion(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "10207E", ""), GXv_int5) ;
      apsuu004.this.AV28Flag = GXv_int5[0] ;
      GXv_int5[0] = AV39FlagPer ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PERTEX", ""), GXv_int5) ;
      apsuu004.this.AV39FlagPer = GXv_int5[0] ;
      GXt_int4 = AV118Tejido ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TEJIDO", ""), GXv_int5) ;
      apsuu004.this.GXt_int4 = GXv_int5[0] ;
      AV118Tejido = GXt_int4 ;
      GXv_int5[0] = AV48VERTI3 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "VERTI3", ""), GXv_int5) ;
      apsuu004.this.AV48VERTI3 = GXv_int5[0] ;
      GXt_int4 = AV119Suprema ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "SUPREM", ""), GXv_int5) ;
      apsuu004.this.GXt_int4 = GXv_int5[0] ;
      AV119Suprema = GXt_int4 ;
      GXt_int4 = AV50F_nr ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "NOTREC", ""), GXv_int5) ;
      apsuu004.this.GXt_int4 = GXv_int5[0] ;
      AV50F_nr = GXt_int4 ;
      AV51Hidro = (byte)(0) ;
      GXv_int5[0] = AV51Hidro ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "HIDRO", ""), GXv_int5) ;
      apsuu004.this.AV51Hidro = GXv_int5[0] ;
      AV52Fidel = (byte)(0) ;
      GXv_int5[0] = AV52Fidel ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FIDEL", ""), GXv_int5) ;
      apsuu004.this.AV52Fidel = GXv_int5[0] ;
      AV57F_carvema = (byte)(0) ;
      GXv_int5[0] = AV57F_carvema ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int5) ;
      apsuu004.this.AV57F_carvema = GXv_int5[0] ;
      GXv_int5[0] = AV60F_pais ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, "100001", GXv_int5) ;
      apsuu004.this.AV60F_pais = GXv_int5[0] ;
      GXt_int4 = AV114CtrlUsu ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CRTLOS", ""), GXv_int5) ;
      apsuu004.this.GXt_int4 = GXv_int5[0] ;
      AV114CtrlUsu = GXt_int4 ;
      GXt_int4 = AV61TintSN ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TINTSN", ""), GXv_int5) ;
      apsuu004.this.GXt_int4 = GXv_int5[0] ;
      AV61TintSN = GXt_int4 ;
      GXv_int5[0] = AV62F_lavand ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int5) ;
      apsuu004.this.AV62F_lavand = GXv_int5[0] ;
      GXv_int5[0] = AV64F_moda21 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int5) ;
      apsuu004.this.AV64F_moda21 = GXv_int5[0] ;
      GXv_int6[0] = AV67AlaCol ;
      new app.pbuscon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ALACOL", ""), GXv_int6) ;
      apsuu004.this.AV67AlaCol = (short)((short)(GXv_int6[0])) ;
      GXt_int4 = AV69F_tinamar ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int5) ;
      apsuu004.this.GXt_int4 = GXv_int5[0] ;
      AV69F_tinamar = GXt_int4 ;
      GXt_int4 = AV74VERTIC ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "VERTIC", ""), GXv_int5) ;
      apsuu004.this.GXt_int4 = GXv_int5[0] ;
      AV74VERTIC = GXt_int4 ;
      GXt_int4 = AV77Vtabuas ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "VTABUA", ""), GXv_int5) ;
      apsuu004.this.GXt_int4 = GXv_int5[0] ;
      AV77Vtabuas = GXt_int4 ;
      GXt_int4 = AV85Vincolor ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "VINCOL", ""), GXv_int5) ;
      apsuu004.this.GXt_int4 = GXv_int5[0] ;
      AV85Vincolor = GXt_int4 ;
      GXt_int4 = AV99FlagTint ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int5) ;
      apsuu004.this.GXt_int4 = GXv_int5[0] ;
      AV99FlagTint = GXt_int4 ;
      GXt_int4 = AV104Kohler ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "KOHLER", ""), GXv_int5) ;
      apsuu004.this.GXt_int4 = GXv_int5[0] ;
      AV104Kohler = GXt_int4 ;
      GXt_int4 = AV115Staack ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "STAACK", ""), GXv_int5) ;
      apsuu004.this.GXt_int4 = GXv_int5[0] ;
      AV115Staack = GXt_int4 ;
      GXt_int4 = AV117Sequeiro ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "SEQUEI", ""), GXv_int5) ;
      apsuu004.this.GXt_int4 = GXv_int5[0] ;
      AV117Sequeiro = GXt_int4 ;
      GXt_int4 = AV123Magosa ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MAGOSA", ""), GXv_int5) ;
      apsuu004.this.GXt_int4 = GXv_int5[0] ;
      AV123Magosa = GXt_int4 ;
      GXv_char3[0] = AV15EmprCod ;
      GXv_int6[0] = AV16DisCod ;
      GXv_char2[0] = AV106MaqCod ;
      GXv_int7[0] = AV102maqVolMax ;
      GXv_int8[0] = AV103MaqVolMin ;
      GXv_int9[0] = AV101MaqVolMed ;
      GXv_decimal10[0] = AV109Kgs ;
      new app.pmqvokg(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_char2, GXv_int7, GXv_int8, GXv_int9, GXv_decimal10) ;
      apsuu004.this.AV15EmprCod = GXv_char3[0] ;
      apsuu004.this.AV16DisCod = GXv_int6[0] ;
      apsuu004.this.AV106MaqCod = GXv_char2[0] ;
      apsuu004.this.AV102maqVolMax = GXv_int7[0] ;
      apsuu004.this.AV103MaqVolMin = GXv_int8[0] ;
      apsuu004.this.AV101MaqVolMed = GXv_int9[0] ;
      apsuu004.this.AV109Kgs = GXv_decimal10[0] ;
      /* Using cursor P02TW3 */
      pr_default.execute(0, new Object[] {AV15EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A367DisEst = P02TW3_A367DisEst[0] ;
         A387DisPiePie = P02TW3_A387DisPiePie[0] ;
         n387DisPiePie = P02TW3_n387DisPiePie[0] ;
         A390DisTipCol = P02TW3_A390DisTipCol[0] ;
         n390DisTipCol = P02TW3_n390DisTipCol[0] ;
         A363DisColNum = P02TW3_A363DisColNum[0] ;
         n363DisColNum = P02TW3_n363DisColNum[0] ;
         A362DisColNom = P02TW3_A362DisColNom[0] ;
         n362DisColNom = P02TW3_n362DisColNom[0] ;
         A335DisArtCod = P02TW3_A335DisArtCod[0] ;
         A252CliCod = P02TW3_A252CliCod[0] ;
         n252CliCod = P02TW3_n252CliCod[0] ;
         A396EmprCod = P02TW3_A396EmprCod[0] ;
         A365DisDes = P02TW3_A365DisDes[0] ;
         A2831DisNumLot = P02TW3_A2831DisNumLot[0] ;
         A360DisCliNum = P02TW3_A360DisCliNum[0] ;
         A337DisArtDsc = P02TW3_A337DisArtDsc[0] ;
         A352DisArtTip = P02TW3_A352DisArtTip[0] ;
         A369DisFec = P02TW3_A369DisFec[0] ;
         A375DisNumUni = P02TW3_A375DisNumUni[0] ;
         A392DisUniMed = P02TW3_A392DisUniMed[0] ;
         A370DisFecCli = P02TW3_A370DisFecCli[0] ;
         A6547DisVolMaq = P02TW3_A6547DisVolMaq[0] ;
         A341DisArtOpe = P02TW3_A341DisArtOpe[0] ;
         A359DisArtUrg = P02TW3_A359DisArtUrg[0] ;
         A340DisArtMat = P02TW3_A340DisArtMat[0] ;
         A350DisArtRdt = P02TW3_A350DisArtRdt[0] ;
         A353DisArtTr1 = P02TW3_A353DisArtTr1[0] ;
         A344DisArtPt1 = P02TW3_A344DisArtPt1[0] ;
         A354DisArtTr2 = P02TW3_A354DisArtTr2[0] ;
         A345DisArtPt2 = P02TW3_A345DisArtPt2[0] ;
         A355DisArtTr3 = P02TW3_A355DisArtTr3[0] ;
         A346DisArtPt3 = P02TW3_A346DisArtPt3[0] ;
         A356DisArtUr1 = P02TW3_A356DisArtUr1[0] ;
         A347DisArtPu1 = P02TW3_A347DisArtPu1[0] ;
         A357DisArtUr2 = P02TW3_A357DisArtUr2[0] ;
         A348DisArtPu2 = P02TW3_A348DisArtPu2[0] ;
         A358DisArtUr3 = P02TW3_A358DisArtUr3[0] ;
         A349DisArtPu3 = P02TW3_A349DisArtPu3[0] ;
         n349DisArtPu3 = P02TW3_n349DisArtPu3[0] ;
         A1232DisArtAcb = P02TW3_A1232DisArtAcb[0] ;
         A1233DisArtAc2 = P02TW3_A1233DisArtAc2[0] ;
         A334DisArtAnh = P02TW3_A334DisArtAnh[0] ;
         A1231DisArtAn1 = P02TW3_A1231DisArtAn1[0] ;
         A343DisArtPle = P02TW3_A343DisArtPle[0] ;
         A339DisArtLar = P02TW3_A339DisArtLar[0] ;
         A351DisArtSua = P02TW3_A351DisArtSua[0] ;
         A333DisArtAca = P02TW3_A333DisArtAca[0] ;
         A336DisArtCor = P02TW3_A336DisArtCor[0] ;
         A338DisArtEnc = P02TW3_A338DisArtEnc[0] ;
         A2832DisKgsLot = P02TW3_A2832DisKgsLot[0] ;
         A2833DisMtrLot = P02TW3_A2833DisMtrLot[0] ;
         A1013DibCli = P02TW3_A1013DibCli[0] ;
         n1013DibCli = P02TW3_n1013DibCli[0] ;
         A1014DibInt = P02TW3_A1014DibInt[0] ;
         n1014DibInt = P02TW3_n1014DibInt[0] ;
         A5031DisCom = P02TW3_A5031DisCom[0] ;
         n5031DisCom = P02TW3_n5031DisCom[0] ;
         A757PriCod = P02TW3_A757PriCod[0] ;
         A371DisFecEnt = P02TW3_A371DisFecEnt[0] ;
         A342DisArtPes = P02TW3_A342DisArtPes[0] ;
         A1225DisGraCru = P02TW3_A1225DisGraCru[0] ;
         A1195DisNomCli = P02TW3_A1195DisNomCli[0] ;
         A1196DisNumCli = P02TW3_A1196DisNumCli[0] ;
         A1197DisEncCom = P02TW3_A1197DisEncCom[0] ;
         A1198DisEncAnh = P02TW3_A1198DisEncAnh[0] ;
         A1430DisLoc = P02TW3_A1430DisLoc[0] ;
         A1502DisPart = P02TW3_A1502DisPart[0] ;
         A2310DisCliDes = P02TW3_A2310DisCliDes[0] ;
         A2009DisTipDis = P02TW3_A2009DisTipDis[0] ;
         n2009DisTipDis = P02TW3_n2009DisTipDis[0] ;
         A2835DisPle2 = P02TW3_A2835DisPle2[0] ;
         A2926DisPla = P02TW3_A2926DisPla[0] ;
         A3127DisNumCor = P02TW3_A3127DisNumCor[0] ;
         A3128DisAncSal1 = P02TW3_A3128DisAncSal1[0] ;
         A3129DisAncSal2 = P02TW3_A3129DisAncSal2[0] ;
         A3130DisAncSal3 = P02TW3_A3130DisAncSal3[0] ;
         A3131DisGraAca2 = P02TW3_A3131DisGraAca2[0] ;
         A3132DisGraCru2 = P02TW3_A3132DisGraCru2[0] ;
         A1906DisGraAca = P02TW3_A1906DisGraAca[0] ;
         A1907DisRdoN = P02TW3_A1907DisRdoN[0] ;
         A1908DisRdoA = P02TW3_A1908DisRdoA[0] ;
         A4014DisTin = P02TW3_A4014DisTin[0] ;
         A4468DisPelAnh = P02TW3_A4468DisPelAnh[0] ;
         A4469DisCruMts = P02TW3_A4469DisCruMts[0] ;
         A4470DisCruKgs = P02TW3_A4470DisCruKgs[0] ;
         A4471DisCruEnr = P02TW3_A4471DisCruEnr[0] ;
         A4472DisLotPza = P02TW3_A4472DisLotPza[0] ;
         n4472DisLotPza = P02TW3_n4472DisLotPza[0] ;
         A4473DisLotMts = P02TW3_A4473DisLotMts[0] ;
         A4474DisLotKgs = P02TW3_A4474DisLotKgs[0] ;
         A4475DisLotMaq = P02TW3_A4475DisLotMaq[0] ;
         n4475DisLotMaq = P02TW3_n4475DisLotMaq[0] ;
         A4476DisAcaFor = P02TW3_A4476DisAcaFor[0] ;
         n4476DisAcaFor = P02TW3_n4476DisAcaFor[0] ;
         A4477DisAcaBak = P02TW3_A4477DisAcaBak[0] ;
         A4478DisAcaAnh = P02TW3_A4478DisAcaAnh[0] ;
         A4479DisAcaMar = P02TW3_A4479DisAcaMar[0] ;
         A2402DisManCod = P02TW3_A2402DisManCod[0] ;
         A3307DisManCod1 = P02TW3_A3307DisManCod1[0] ;
         A3308DisManCod2 = P02TW3_A3308DisManCod2[0] ;
         A4614DisMdlCod = P02TW3_A4614DisMdlCod[0] ;
         A4615DisTam = P02TW3_A4615DisTam[0] ;
         A4293DisNPzas = P02TW3_A4293DisNPzas[0] ;
         n4293DisNPzas = P02TW3_n4293DisNPzas[0] ;
         A4616DisHorEnt = P02TW3_A4616DisHorEnt[0] ;
         n4616DisHorEnt = P02TW3_n4616DisHorEnt[0] ;
         A4813DisEncCli = P02TW3_A4813DisEncCli[0] ;
         A5024DisTipEst = P02TW3_A5024DisTipEst[0] ;
         A5025DisGraCob = P02TW3_A5025DisGraCob[0] ;
         A4720DisDishCod = P02TW3_A4720DisDishCod[0] ;
         A5032DisEstTip = P02TW3_A5032DisEstTip[0] ;
         A5252DisAcc = P02TW3_A5252DisAcc[0] ;
         A5290DisTipCor = P02TW3_A5290DisTipCor[0] ;
         A5350DisObsAnc = P02TW3_A5350DisObsAnc[0] ;
         A5349DisObsGrm = P02TW3_A5349DisObsGrm[0] ;
         A5366DisAntp = P02TW3_A5366DisAntp[0] ;
         A5405DisAntpT = P02TW3_A5405DisAntpT[0] ;
         A1052DisObs = P02TW3_A1052DisObs[0] ;
         A374DisNumPie = P02TW3_A374DisNumPie[0] ;
         A3627DisFecLan = P02TW3_A3627DisFecLan[0] ;
         n3627DisFecLan = P02TW3_n3627DisFecLan[0] ;
         A998DisNMtr = P02TW3_A998DisNMtr[0] ;
         A3309DisNumTon = P02TW3_A3309DisNumTon[0] ;
         A361DisCod = P02TW3_A361DisCod[0] ;
         A387DisPiePie = P02TW3_A387DisPiePie[0] ;
         n387DisPiePie = P02TW3_n387DisPiePie[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A386DisPieNor = (short)(getDisPieNor0( A396EmprCod, A361DisCod)) ;
         }
         else
         {
            A386DisPieNor = (short)(0) ;
         }
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         GXt_char11 = A475FindCol ;
         GXv_char3[0] = GXt_char11 ;
         new app.pedidos.dis_findcol_validate(remoteHandle, context).execute( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol, GXv_char3) ;
         apsuu004.this.GXt_char11 = GXv_char3[0] ;
         A475FindCol = GXt_char11 ;
         W396EmprCod = A396EmprCod ;
         AV16DisCod = A361DisCod ;
         AV29DisReo = (byte)(0) ;
         AV112Disacc = A5252DisAcc ;
         /* Using cursor P02TW4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A44AlbRecCod = P02TW4_A44AlbRecCod[0] ;
            A673Piezas = P02TW4_A673Piezas[0] ;
            A55AlbRReo = P02TW4_A55AlbRReo[0] ;
            A55AlbRReo = P02TW4_A55AlbRReo[0] ;
            if ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 )
            {
               AV29DisReo = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV42TipDefCod = (short)(0) ;
         if ( AV29DisReo == 1 )
         {
            /* Using cursor P02TW5 */
            pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A361DisCod = P02TW5_A361DisCod[0] ;
               A396EmprCod = P02TW5_A396EmprCod[0] ;
               A833TipDefCod = P02TW5_A833TipDefCod[0] ;
               n833TipDefCod = P02TW5_n833TipDefCod[0] ;
               AV42TipDefCod = A833TipDefCod ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
         GXv_char3[0] = A396EmprCod ;
         GXv_int9[0] = A252CliCod ;
         GXv_char2[0] = A335DisArtCod ;
         GXv_char1[0] = A362DisColNom ;
         GXv_int8[0] = A363DisColNum ;
         GXv_int5[0] = A390DisTipCol ;
         GXv_int12[0] = AV36Matiz ;
         GXv_int13[0] = AV38IntCod ;
         new app.pbuscma2(remoteHandle, context).execute( GXv_char3, GXv_int9, GXv_char2, GXv_char1, GXv_int8, GXv_int5, GXv_int12, GXv_int13) ;
         apsuu004.this.A396EmprCod = GXv_char3[0] ;
         apsuu004.this.A252CliCod = GXv_int9[0] ;
         apsuu004.this.A335DisArtCod = GXv_char2[0] ;
         apsuu004.this.A362DisColNom = GXv_char1[0] ;
         apsuu004.this.A363DisColNum = GXv_int8[0] ;
         apsuu004.this.A390DisTipCol = GXv_int5[0] ;
         apsuu004.this.AV36Matiz = GXv_int12[0] ;
         apsuu004.this.AV38IntCod = GXv_int13[0] ;
         AV43DisComULin = (byte)(0) ;
         AV105DisArtTip = A352DisArtTip ;
         /* Execute user subroutine: 'TIPARTRB' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /*
            INSERT RECORD ON TABLE TXPBARCAD

         */
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         A396EmprCod = AV15EmprCod ;
         A129BarCod = A2831DisNumLot ;
         AV27BarCod = A2831DisNumLot ;
         AV20BarCodPar = A2831DisNumLot ;
         AV37Mensa = GXutil.concat( httpContext.getMessage( "Generando OP= ", ""), GXutil.str( AV27BarCod, 8, 0), " ") ;
         System.out.println( AV37Mensa );
         A132BarCodReo = (byte)(0) ;
         A130BarCodPar = " " ;
         A361DisCod = AV16DisCod ;
         A143BarDisNum = A360DisCliNum ;
         A212BarSer = A335DisArtCod ;
         A1652BarSerDsc = A337DisArtDsc ;
         A217BarTipArt = A352DisArtTip ;
         n217BarTipArt = false ;
         A135BarColNom = A362DisColNom ;
         A136BarColNum = A363DisColNum ;
         A218BarTipCol = A390DisTipCol ;
         if ( AV117Sequeiro == 1 )
         {
            A159BarFecGen = A369DisFec ;
         }
         else
         {
            A159BarFecGen = Gx_date ;
         }
         A192BarNumUni = A375DisNumUni ;
         A228BarUniMed = A392DisUniMed ;
         A155BarFecCli = A370DisFecCli ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A191BarNumPie = A387DisPiePie ;
         }
         else
         {
            A191BarNumPie = A386DisPieNor ;
         }
         A180BarMaqCod = AV106MaqCod ;
         A236BarVolMaq = AV101MaqVolMed ;
         if ( ( AV115Staack == 1 ) && ! (0==A6547DisVolMaq) )
         {
            A236BarVolMaq = A6547DisVolMaq ;
         }
         if ( AV104Kohler == 1 )
         {
            AV108Volumen = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( AV109Kgs.multiply(AV107TIPARTRB), 0))) ;
            A236BarVolMaq = AV108Volumen ;
            if ( ( AV108Volumen > AV111TipArtVmx ) && ( AV108Volumen > 0 ) && ( AV111TipArtVmx > 0 ) )
            {
               A236BarVolMaq = AV111TipArtVmx ;
            }
            if ( ( AV108Volumen < AV110TipArtVmn ) && ( AV108Volumen > 0 ) && ( AV110TipArtVmn > 0 ) )
            {
               A236BarVolMaq = AV110TipArtVmn ;
            }
         }
         if ( GXutil.strcmp(A341DisArtOpe, httpContext.getMessage( "SI", "")) == 0 )
         {
            A193BarOpeEsp = (byte)(1) ;
         }
         else
         {
            if ( ( GXutil.strcmp(A475FindCol, "xxx") == 0 ) || ( AV29DisReo == 1 ) )
            {
               if ( AV29DisReo == 1 )
               {
                  A193BarOpeEsp = (byte)(7) ;
               }
               else
               {
                  if ( GXutil.strcmp(A475FindCol, "xxx") == 0 )
                  {
                     if ( AV91PLinea == 1 )
                     {
                        AV92Flag_Col = (byte)(0) ;
                        GXv_char3[0] = AV15EmprCod ;
                        GXv_char2[0] = AV93EmprCod2 ;
                        GXv_char1[0] = AV94EmprNom2 ;
                        GXv_int13[0] = AV95Flag_Emp2 ;
                        new app.pempaso(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1, GXv_int13) ;
                        apsuu004.this.AV15EmprCod = GXv_char3[0] ;
                        apsuu004.this.AV93EmprCod2 = GXv_char2[0] ;
                        apsuu004.this.AV94EmprNom2 = GXv_char1[0] ;
                        apsuu004.this.AV95Flag_Emp2 = GXv_int13[0] ;
                        if ( AV95Flag_Emp2 == 1 )
                        {
                           GXv_char3[0] = AV93EmprCod2 ;
                           GXv_int9[0] = A252CliCod ;
                           GXv_char2[0] = A335DisArtCod ;
                           GXv_char1[0] = A362DisColNom ;
                           GXv_int8[0] = A363DisColNum ;
                           GXv_int13[0] = A390DisTipCol ;
                           GXv_int5[0] = AV92Flag_Col ;
                           new app.pbuscol(remoteHandle, context).execute( GXv_char3, GXv_int9, GXv_char2, GXv_char1, GXv_int8, GXv_int13, GXv_int5) ;
                           apsuu004.this.AV93EmprCod2 = GXv_char3[0] ;
                           apsuu004.this.A252CliCod = GXv_int9[0] ;
                           apsuu004.this.A335DisArtCod = GXv_char2[0] ;
                           apsuu004.this.A362DisColNom = GXv_char1[0] ;
                           apsuu004.this.A363DisColNum = GXv_int8[0] ;
                           apsuu004.this.A390DisTipCol = GXv_int13[0] ;
                           apsuu004.this.AV92Flag_Col = GXv_int5[0] ;
                        }
                        if ( AV92Flag_Col == 0 )
                        {
                           A193BarOpeEsp = (byte)(4) ;
                        }
                     }
                     else
                     {
                        A193BarOpeEsp = (byte)(4) ;
                     }
                  }
               }
            }
            else
            {
               A193BarOpeEsp = (byte)(0) ;
            }
         }
         A235BarUrg = A359DisArtUrg ;
         A182BarMat = A340DisArtMat ;
         A211BarRdt = A350DisArtRdt ;
         A221BarTra1 = A353DisArtTr1 ;
         A224BarTraP1 = A344DisArtPt1 ;
         A222BarTra2 = A354DisArtTr2 ;
         A225BarTraP2 = A345DisArtPt2 ;
         A223BarTra3 = A355DisArtTr3 ;
         A226BarTraP3 = A346DisArtPt3 ;
         A229BarUrd1 = A356DisArtUr1 ;
         A232BarUrdP1 = A347DisArtPu1 ;
         A230BarUrd2 = A357DisArtUr2 ;
         A233BarUrdP2 = A348DisArtPu2 ;
         A231BarUrd3 = A358DisArtUr3 ;
         A234BarUrdP3 = A349DisArtPu3 ;
         A127BarAncCru1 = A1232DisArtAcb ;
         A128BarAncCru2 = A1233DisArtAc2 ;
         A125BarAncAca1 = A334DisArtAnh ;
         A126BarAncAca2 = A1231DisArtAn1 ;
         A206BarPle = A343DisArtPle ;
         A177BarLar = A339DisArtLar ;
         A214BarSua = A351DisArtSua ;
         A118BarAcaQui = A333DisArtAca ;
         A139BarCorOri = A336DisArtCor ;
         A145BarEncOri = A338DisArtEnc ;
         A146BarEst = (byte)(0) ;
         A2826BarNumLot = A2831DisNumLot ;
         A2827BarKgsLot = A2832DisKgsLot ;
         A2828BarMtrLot = A2833DisMtrLot ;
         if ( AV91PLinea == 1 )
         {
            AV92Flag_Col = (byte)(0) ;
            AV100Flag_Dib = (byte)(0) ;
            GXv_char3[0] = AV15EmprCod ;
            GXv_char2[0] = AV93EmprCod2 ;
            GXv_char1[0] = AV94EmprNom2 ;
            GXv_int13[0] = AV95Flag_Emp2 ;
            new app.pempaso(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1, GXv_int13) ;
            apsuu004.this.AV15EmprCod = GXv_char3[0] ;
            apsuu004.this.AV93EmprCod2 = GXv_char2[0] ;
            apsuu004.this.AV94EmprNom2 = GXv_char1[0] ;
            apsuu004.this.AV95Flag_Emp2 = GXv_int13[0] ;
            if ( AV95Flag_Emp2 == 1 )
            {
               GXv_char3[0] = AV93EmprCod2 ;
               GXv_int9[0] = A252CliCod ;
               GXv_char2[0] = A335DisArtCod ;
               GXv_char1[0] = A362DisColNom ;
               GXv_int8[0] = A363DisColNum ;
               GXv_int13[0] = A390DisTipCol ;
               GXv_int5[0] = AV92Flag_Col ;
               new app.pbuscol(remoteHandle, context).execute( GXv_char3, GXv_int9, GXv_char2, GXv_char1, GXv_int8, GXv_int13, GXv_int5) ;
               apsuu004.this.AV93EmprCod2 = GXv_char3[0] ;
               apsuu004.this.A252CliCod = GXv_int9[0] ;
               apsuu004.this.A335DisArtCod = GXv_char2[0] ;
               apsuu004.this.A362DisColNom = GXv_char1[0] ;
               apsuu004.this.A363DisColNum = GXv_int8[0] ;
               apsuu004.this.A390DisTipCol = GXv_int13[0] ;
               apsuu004.this.AV92Flag_Col = GXv_int5[0] ;
            }
            if ( AV92Flag_Col == 0 )
            {
               A213BarSit = (byte)(2) ;
               A147BarEstCol = (byte)(0) ;
            }
            else
            {
               A213BarSit = (byte)(1) ;
               A147BarEstCol = (byte)(1) ;
            }
            AV97Fondo = GXutil.substring( A362DisColNom, 1, 12) ;
            GXv_char3[0] = AV15EmprCod ;
            GXv_int9[0] = A252CliCod ;
            GXv_char2[0] = A335DisArtCod ;
            GXv_char1[0] = A1013DibCli ;
            GXv_int8[0] = A1014DibInt ;
            GXv_char14[0] = A5031DisCom ;
            GXv_char15[0] = AV97Fondo ;
            GXv_int13[0] = AV98Flag_For ;
            new app.pbufeor(remoteHandle, context).execute( GXv_char3, GXv_int9, GXv_char2, GXv_char1, GXv_int8, GXv_char14, GXv_char15, GXv_int13) ;
            apsuu004.this.AV15EmprCod = GXv_char3[0] ;
            apsuu004.this.A252CliCod = GXv_int9[0] ;
            apsuu004.this.A335DisArtCod = GXv_char2[0] ;
            apsuu004.this.A1013DibCli = GXv_char1[0] ;
            apsuu004.this.A1014DibInt = GXv_int8[0] ;
            apsuu004.this.A5031DisCom = GXv_char14[0] ;
            apsuu004.this.AV97Fondo = GXv_char15[0] ;
            apsuu004.this.AV98Flag_For = GXv_int13[0] ;
            A4400BarSitEst = (byte)(1) ;
            if ( AV98Flag_For == 1 )
            {
               A4400BarSitEst = (byte)(2) ;
            }
            else
            {
               GXv_char15[0] = AV15EmprCod ;
               GXv_char14[0] = A1013DibCli ;
               GXv_int9[0] = A252CliCod ;
               GXv_int8[0] = A1014DibInt ;
               GXv_int13[0] = AV100Flag_Dib ;
               new app.pbufedi(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_int9, GXv_int8, GXv_int13) ;
               apsuu004.this.AV15EmprCod = GXv_char15[0] ;
               apsuu004.this.A1013DibCli = GXv_char14[0] ;
               apsuu004.this.A252CliCod = GXv_int9[0] ;
               apsuu004.this.A1014DibInt = GXv_int8[0] ;
               apsuu004.this.AV100Flag_Dib = GXv_int13[0] ;
               if ( AV100Flag_Dib == 0 )
               {
                  A4400BarSitEst = (byte)(3) ;
               }
            }
         }
         else
         {
            if ( GXutil.strcmp(A475FindCol, "xxx") == 0 )
            {
               A213BarSit = (byte)(2) ;
               A147BarEstCol = (byte)(0) ;
            }
            else
            {
               A213BarSit = (byte)(1) ;
               A147BarEstCol = (byte)(1) ;
            }
         }
         A209BarPri = A757PriCod ;
         A138BarConReo = (byte)(0) ;
         A137BarConPar = " " ;
         A189BarNumAny = (short)(0) ;
         A141BarCosPro = DecimalUtil.doubleToDec(0) ;
         A140BarCosAny = DecimalUtil.doubleToDec(0) ;
         A169BarKgsFac = DecimalUtil.doubleToDec(0) ;
         if ( AV29DisReo == 1 )
         {
            A148BarEstReo = (byte)(2) ;
            AV49Num_fic = 0 ;
            GXv_int9[0] = AV49Num_fic ;
            new app.pnumdoc(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "NOTAE", ""), GXv_int9) ;
            apsuu004.this.AV49Num_fic = GXv_int9[0] ;
         }
         else
         {
            A148BarEstReo = (byte)(0) ;
         }
         A196BarOrdReo = (byte)(0) ;
         A158BarFecFpr = A371DisFecEnt ;
         A120BarAgrEst = httpContext.getMessage( "N", "") ;
         AV113disartpes = A342DisArtPes ;
         if ( AV113disartpes < 0 )
         {
            AV113disartpes = (short)(0) ;
         }
         A864BarPes = AV113disartpes ;
         A1226BarGraCru = A1225DisGraCru ;
         A921BarMatiz = AV36Matiz ;
         A1234BarNomCli = A1195DisNomCli ;
         A1235BarNumCli = A1196DisNumCli ;
         A1223BarEncCom = A1197DisEncCom ;
         A1224BarEncAnh = A1198DisEncAnh ;
         A178BarLis = (byte)(0) ;
         A1431BarLocDis = A1430DisLoc ;
         A1503BarPart = A1502DisPart ;
         A2311BarCliDes = A2310DisCliDes ;
         A2010BarTipDis = A2009DisTipDis ;
         A2485BarColPes = httpContext.getMessage( "N", "") ;
         A2498BarPrdPes = httpContext.getMessage( "N", "") ;
         A2499BarRDos1 = httpContext.getMessage( "N", "") ;
         A2500BarRDos2 = httpContext.getMessage( "N", "") ;
         A2836BarPle2 = A2835DisPle2 ;
         if ( AV39FlagPer == 1 )
         {
            GXv_char15[0] = AV15EmprCod ;
            GXv_int9[0] = AV16DisCod ;
            GXv_char14[0] = AV40BarProPer ;
            new app.pbusdl(remoteHandle, context).execute( GXv_char15, GXv_int9, GXv_char14) ;
            apsuu004.this.AV15EmprCod = GXv_char15[0] ;
            apsuu004.this.AV16DisCod = GXv_int9[0] ;
            apsuu004.this.AV40BarProPer = GXv_char14[0] ;
            if ( (0==AV38IntCod) )
            {
               A2830BarIntPer = (byte)(0) ;
            }
            else
            {
               A2830BarIntPer = AV38IntCod ;
            }
            A2829BarProPer = AV40BarProPer ;
         }
         A3030BarPlf = A2926DisPla ;
         A3133BarNumCor = A3127DisNumCor ;
         A3134BarAncSal1 = A3128DisAncSal1 ;
         A3135BarAncSal2 = A3129DisAncSal2 ;
         A3136BarAncSal3 = A3130DisAncSal3 ;
         A3137BarGraAca2 = A3131DisGraAca2 ;
         A3138BarGraCru2 = A3132DisGraCru2 ;
         A1909BarGraAca = A1906DisGraAca ;
         A1910BarRdoN = A1907DisRdoN ;
         A1911BarRdoA = A1908DisRdoA ;
         A1798BarDibCli = A1013DibCli ;
         A1799BarDibInt = A1014DibInt ;
         A2512BarComULin = AV43DisComULin ;
         n2512BarComULin = false ;
         A833TipDefCod = AV42TipDefCod ;
         n833TipDefCod = false ;
         A4016BarTin = A4014DisTin ;
         if ( AV91PLinea == 0 )
         {
            A4400BarSitEst = (byte)(2) ;
         }
         if ( ( ( AV61TintSN == 1 ) && ( GXutil.strcmp(A4014DisTin, httpContext.getMessage( "N", "")) == 0 ) ) || ( ( GXutil.strcmp(A4014DisTin, httpContext.getMessage( "N", "")) == 0 ) && ( AV61TintSN == 0 ) ) )
         {
            if ( AV62F_lavand == 0 )
            {
               A213BarSit = (byte)(5) ;
            }
         }
         A4456BarPelAnh = A4468DisPelAnh ;
         A4457BarCruMts = A4469DisCruMts ;
         n4457BarCruMts = false ;
         A4458BarCruKgs = A4470DisCruKgs ;
         n4458BarCruKgs = false ;
         A4459BarCruEnr = A4471DisCruEnr ;
         A4460BarLotPza = A4472DisLotPza ;
         n4460BarLotPza = false ;
         A4461BarLotMts = A4473DisLotMts ;
         A4462BarLotKgs = A4474DisLotKgs ;
         A4463BarLotMaq = A4475DisLotMaq ;
         n4463BarLotMaq = false ;
         A4464BarAcaFor = A4476DisAcaFor ;
         n4464BarAcaFor = false ;
         A4465BarAcaBak = A4477DisAcaBak ;
         n4465BarAcaBak = false ;
         A4466BarAcaAnh = A4478DisAcaAnh ;
         A4467BarAcaMar = A4479DisAcaMar ;
         A833TipDefCod = AV42TipDefCod ;
         n833TipDefCod = false ;
         A2400BarManCod = A2402DisManCod ;
         A3311BarManCod1 = A3307DisManCod1 ;
         A3312BarManCod2 = A3308DisManCod2 ;
         A4609BarMdlCod = A4614DisMdlCod ;
         A4610BarTam = A4615DisTam ;
         A4612BarPzas = A4293DisNPzas ;
         n4612BarPzas = false ;
         A4611BarHorEnt = A4616DisHorEnt ;
         n4611BarHorEnt = false ;
         A4613BarHorReg = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
         n4613BarHorReg = false ;
         if ( AV47FlagVTab == 1 )
         {
            A2453BarEntAca = AV45UsurCod + "/" ;
            n2453BarEntAca = false ;
            A2452BarCal = GXutil.time( ) + "/" ;
            n2452BarCal = false ;
         }
         A4812BarEncCli = A4813DisEncCli ;
         A2460BarTipAca = GXutil.space( (short)(1)) ;
         A4975BarNumReo = (short)(0) ;
         A5026BarTipEst = A5024DisTipEst ;
         A5027BarGraCob = A5025DisGraCob ;
         A4716BarDishCod = A4720DisDishCod ;
         A5033BarCom = A5031DisCom ;
         A5034BarEstTip = A5032DisEstTip ;
         A5253BarAcc = A5252DisAcc ;
         A144BarDisOri = A361DisCod ;
         A5291BarTipCor = A5290DisTipCor ;
         A5352BarObsAnc = A5350DisObsAnc ;
         A5351BarObsGrm = A5349DisObsGrm ;
         A5367BarAntp = A5366DisAntp ;
         A5406BarAntpT = A5405DisAntpT ;
         A646NotUltLin = AV59Cont_not ;
         n646NotUltLin = false ;
         if ( ( AV60F_pais == 1 ) || ( AV119Suprema == 1 ) )
         {
            A2454BarGirar = A1052DisObs ;
         }
         if ( AV62F_lavand == 1 )
         {
            GXv_char15[0] = AV15EmprCod ;
            GXv_int9[0] = A361DisCod ;
            GXv_int12[0] = A374DisNumPie ;
            GXv_decimal10[0] = A375DisNumUni ;
            GXv_int16[0] = AV63Tiempo_a ;
            new app.phorala(remoteHandle, context).execute( GXv_char15, GXv_int9, GXv_int12, GXv_decimal10, GXv_int16) ;
            apsuu004.this.AV15EmprCod = GXv_char15[0] ;
            apsuu004.this.A361DisCod = GXv_int9[0] ;
            apsuu004.this.A374DisNumPie = GXv_int12[0] ;
            apsuu004.this.A375DisNumUni = GXv_decimal10[0] ;
            apsuu004.this.AV63Tiempo_a = GXv_int16[0] ;
            A5054BarBp13 = AV63Tiempo_a ;
            n5054BarBp13 = false ;
            A4462BarLotKgs = A375DisNumUni ;
            A4460BarLotPza = A374DisNumPie ;
            n4460BarLotPza = false ;
            A4400BarSitEst = (byte)(0) ;
         }
         if ( ( AV64F_moda21 == 1 ) && ( A213BarSit == 1 ) )
         {
            GXv_char15[0] = A396EmprCod ;
            GXv_int9[0] = A252CliCod ;
            GXv_char14[0] = A212BarSer ;
            GXv_char3[0] = A135BarColNom ;
            GXv_int8[0] = A136BarColNum ;
            GXv_int13[0] = A218BarTipCol ;
            GXv_date17[0] = AV65ForPreFec ;
            new app.palacol(remoteHandle, context).execute( GXv_char15, GXv_int9, GXv_char14, GXv_char3, GXv_int8, GXv_int13, GXv_date17) ;
            apsuu004.this.A396EmprCod = GXv_char15[0] ;
            apsuu004.this.A252CliCod = GXv_int9[0] ;
            apsuu004.this.A212BarSer = GXv_char14[0] ;
            apsuu004.this.A135BarColNom = GXv_char3[0] ;
            apsuu004.this.A136BarColNum = GXv_int8[0] ;
            apsuu004.this.A218BarTipCol = GXv_int13[0] ;
            apsuu004.this.AV65ForPreFec = GXv_date17[0] ;
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65ForPreFec)) )
            {
               AV66Dias_a = (short)(GXutil.ddiff(Gx_date,AV65ForPreFec)) ;
               AV68Dias_ac = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec((AV67AlaCol*365)/ (double) (12)), 0))) ;
               if ( AV66Dias_a >= AV68Dias_ac )
               {
                  A3030BarPlf = httpContext.getMessage( "S", "") ;
               }
            }
         }
         if ( ( AV69F_tinamar == 1 ) || ( AV99FlagTint == 1 ) || ( AV104Kohler == 1 ) || ( AV114CtrlUsu == 1 ) )
         {
            AV70Usurcod_a = AV45UsurCod ;
            AV71Fecha_a = localUtil.dtoc( Gx_date, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            A4835BarAudOpeN = AV45UsurCod + " " + AV71Fecha_a + " " + Gx_time ;
            n4835BarAudOpeN = false ;
         }
         if ( ( AV80Induyco == 1 ) || ( AV119Suprema == 1 ) )
         {
            if ( ( AV119Suprema == 1 ) || ( AV80Induyco == 1 ) )
            {
               A1003BarFecLan = A3627DisFecLan ;
               n1003BarFecLan = false ;
            }
            A3594BarPriTin = (byte)(0) ;
            A4837BarAudSupN = "" ;
            n4837BarAudSupN = false ;
         }
         else
         {
            A3594BarPriTin = (byte)(80) ;
         }
         A1500BarNMtr = A998DisNMtr ;
         if ( ( AV116Pizarro == 1 ) && ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "T", "")) == 0 ) && ( GXutil.strcmp(A2926DisPla, httpContext.getMessage( "S", "")) != 0 ) )
         {
            GXv_char15[0] = AV15EmprCod ;
            GXv_int9[0] = A252CliCod ;
            GXv_char14[0] = A212BarSer ;
            GXv_char3[0] = A135BarColNom ;
            GXv_int8[0] = A136BarColNum ;
            GXv_int13[0] = A218BarTipCol ;
            GXv_int7[0] = A129BarCod ;
            GXv_int5[0] = A132BarCodReo ;
            GXv_char2[0] = A130BarCodPar ;
            new app.pprimcol(remoteHandle, context).execute( GXv_char15, GXv_int9, GXv_char14, GXv_char3, GXv_int8, GXv_int13, GXv_int7, GXv_int5, GXv_char2) ;
            apsuu004.this.AV15EmprCod = GXv_char15[0] ;
            apsuu004.this.A252CliCod = GXv_int9[0] ;
            apsuu004.this.A212BarSer = GXv_char14[0] ;
            apsuu004.this.A135BarColNom = GXv_char3[0] ;
            apsuu004.this.A136BarColNum = GXv_int8[0] ;
            apsuu004.this.A218BarTipCol = GXv_int13[0] ;
            apsuu004.this.A129BarCod = GXv_int7[0] ;
            apsuu004.this.A132BarCodReo = GXv_int5[0] ;
            apsuu004.this.A130BarCodPar = GXv_char2[0] ;
         }
         if ( AV123Magosa == 1 )
         {
            A3745BarFoa = GXutil.space( (short)(1)) ;
            A3313BarNumTon = A3309DisNumTon ;
            A2400BarManCod = (short)(0) ;
         }
         /* Using cursor P02TW6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A120BarAgrEst, A180BarMaqCod, Integer.valueOf(A236BarVolMaq), Integer.valueOf(A361DisCod), A143BarDisNum, A212BarSer, Boolean.valueOf(n217BarTipArt), Short.valueOf(A217BarTipArt), A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), A159BarFecGen, A192BarNumUni, A228BarUniMed, Byte.valueOf(A148BarEstReo), A155BarFecCli, Short.valueOf(A191BarNumPie), Byte.valueOf(A196BarOrdReo), Byte.valueOf(A193BarOpeEsp), Byte.valueOf(A235BarUrg), A182BarMat, A211BarRdt, A221BarTra1, Short.valueOf(A224BarTraP1), A222BarTra2, Short.valueOf(A225BarTraP2), A223BarTra3, Short.valueOf(A226BarTraP3), A229BarUrd1, Short.valueOf(A232BarUrdP1), A230BarUrd2, Short.valueOf(A233BarUrdP2), A231BarUrd3, Short.valueOf(A234BarUrdP3), Short.valueOf(A127BarAncCru1), Short.valueOf(A128BarAncCru2), Short.valueOf(A125BarAncAca1), Short.valueOf(A126BarAncAca2), A206BarPle, A177BarLar, A214BarSua, A118BarAcaQui, A139BarCorOri, A145BarEncOri, Byte.valueOf(A146BarEst), Byte.valueOf(A213BarSit), A209BarPri, Byte.valueOf(A138BarConReo), A137BarConPar, Short.valueOf(A189BarNumAny), A141BarCosPro, A140BarCosAny, A169BarKgsFac, A158BarFecFpr, Byte.valueOf(A147BarEstCol), Integer.valueOf(A144BarDisOri), Byte.valueOf(A178BarLis), Boolean.valueOf(n646NotUltLin), Byte.valueOf(A646NotUltLin), Short.valueOf(A864BarPes), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod), Boolean.valueOf(n1003BarFecLan), A1003BarFecLan, Short.valueOf(A921BarMatiz), A1223BarEncCom, A1224BarEncAnh, Short.valueOf(A1226BarGraCru), A1234BarNomCli, Integer.valueOf(A1235BarNumCli), A1431BarLocDis, A1500BarNMtr, Short.valueOf(A1503BarPart), A1652BarSerDsc, A2010BarTipDis, Integer.valueOf(A2311BarCliDes), Short.valueOf(A2400BarManCod), A2460BarTipAca, A2454BarGirar, Boolean.valueOf(n2452BarCal), A2452BarCal, Boolean.valueOf(n2453BarEntAca), A2453BarEntAca, Short.valueOf(A1909BarGraAca), A1910BarRdoN, A1911BarRdoA, A2485BarColPes, A2498BarPrdPes, A2499BarRDos1, A2500BarRDos2, Integer.valueOf(A2826BarNumLot), A2827BarKgsLot, A2828BarMtrLot, A2829BarProPer, Byte.valueOf(A2830BarIntPer), A3030BarPlf, A2836BarPle2, Short.valueOf(A3133BarNumCor), Short.valueOf(A3134BarAncSal1), Short.valueOf(A3135BarAncSal2), Short.valueOf(A3136BarAncSal3), Short.valueOf(A3137BarGraAca2), Short.valueOf(A3138BarGraCru2), Short.valueOf(A3311BarManCod1), Short.valueOf(A3312BarManCod2), A3313BarNumTon, A3745BarFoa, A1798BarDibCli, Integer.valueOf(A1799BarDibInt), Boolean.valueOf(n2512BarComULin), Byte.valueOf(A2512BarComULin), A4016BarTin, Byte.valueOf(A4400BarSitEst), Short.valueOf(A4456BarPelAnh), Boolean.valueOf(n4457BarCruMts), A4457BarCruMts, Boolean.valueOf(n4458BarCruKgs), A4458BarCruKgs,
         A4459BarCruEnr, Boolean.valueOf(n4460BarLotPza), Short.valueOf(A4460BarLotPza), A4461BarLotMts, A4462BarLotKgs, Boolean.valueOf(n4463BarLotMaq), A4463BarLotMaq, Boolean.valueOf(n4464BarAcaFor), Integer.valueOf(A4464BarAcaFor), Boolean.valueOf(n4465BarAcaBak), A4465BarAcaBak, Short.valueOf(A4466BarAcaAnh), A4467BarAcaMar, A4609BarMdlCod, A4610BarTam, Boolean.valueOf(n4611BarHorEnt), A4611BarHorEnt, Boolean.valueOf(n4612BarPzas), Integer.valueOf(A4612BarPzas), Boolean.valueOf(n4613BarHorReg), A4613BarHorReg, A4716BarDishCod, A4812BarEncCli, Short.valueOf(A4975BarNumReo), Byte.valueOf(A5026BarTipEst), Byte.valueOf(A5027BarGraCob), A5033BarCom, A5034BarEstTip, Boolean.valueOf(n5054BarBp13), Short.valueOf(A5054BarBp13), A5253BarAcc, A5291BarTipCor, A5351BarObsGrm, A5352BarObsAnc, A5367BarAntp, A5406BarAntpT, Boolean.valueOf(n4835BarAudOpeN), A4835BarAudOpeN, Boolean.valueOf(n4837BarAudSupN), A4837BarAudSupN, Byte.valueOf(A3594BarPriTin), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
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
         A361DisCod = W361DisCod ;
         /* End Insert */
         /* Execute user subroutine: 'LMACRO' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /*
            INSERT RECORD ON TABLE TXPDISBAR

         */
         A1146DisDisCod = AV16DisCod ;
         A1139DisBarCod = A2831DisNumLot ;
         A1140DisBarReo = (byte)(0) ;
         A1141DisBarPar = " " ;
         /* Using cursor P02TW7 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A1146DisDisCod), Integer.valueOf(A1139DisBarCod), Byte.valueOf(A1140DisBarReo), A1141DisBarPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISBAR");
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
         AV32TotKil = DecimalUtil.doubleToDec(0) ;
         AV33TotMet = DecimalUtil.doubleToDec(0) ;
         if ( AV74VERTIC == 1 )
         {
         }
         else
         {
            AV73HRStkInt = httpContext.getMessage( "N", "") ;
         }
         if ( GXutil.strcmp(AV73HRStkInt, httpContext.getMessage( "N", "")) == 0 )
         {
            /* Using cursor P02TW8 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A595Kilos = P02TW8_A595Kilos[0] ;
               A631Metros = P02TW8_A631Metros[0] ;
               A673Piezas = P02TW8_A673Piezas[0] ;
               A44AlbRecCod = P02TW8_A44AlbRecCod[0] ;
               W396EmprCod = A396EmprCod ;
               /*
                  INSERT RECORD ON TABLE TXPBARPIE

               */
               W396EmprCod = A396EmprCod ;
               A396EmprCod = AV15EmprCod ;
               A129BarCod = AV27BarCod ;
               A132BarCodReo = (byte)(0) ;
               A130BarCodPar = " " ;
               A200BarPieCod = GXutil.str( A44AlbRecCod, 8, 0) ;
               A203BarPieKil = A595Kilos ;
               A205BarPieMet = A631Metros ;
               A1501BarPiePie = A673Piezas ;
               A201BarPieEst = (byte)(0) ;
               if ( GXutil.strcmp(AV112Disacc, httpContext.getMessage( "S", "")) == 0 )
               {
                  A6489BarPieIdPz = GXutil.trim( GXutil.str( A44AlbRecCod, 8, 0)) ;
                  n6489BarPieIdPz = false ;
                  if ( AV118Tejido == 0 )
                  {
                     A2186BarPieLoc = httpContext.getMessage( "Sem Malha", "") ;
                     n2186BarPieLoc = false ;
                  }
                  else
                  {
                     A2186BarPieLoc = httpContext.getMessage( "Sem TELA", "") ;
                     n2186BarPieLoc = false ;
                  }
               }
               /* Using cursor P02TW9 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               if ( (pr_default.getStatus(6) == 1) )
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
               /* End Insert */
               AV32TotKil = AV32TotKil.add(A595Kilos) ;
               AV33TotMet = AV33TotMet.add(A631Metros) ;
               if ( AV50F_nr == 1 )
               {
                  GXv_char15[0] = AV15EmprCod ;
                  GXv_int9[0] = A44AlbRecCod ;
                  GXv_int8[0] = AV27BarCod ;
                  GXv_int13[0] = (byte)(0) ;
                  GXv_char14[0] = " " ;
                  GXv_int7[0] = AV16DisCod ;
                  new app.phdrnr(remoteHandle, context).execute( GXv_char15, GXv_int9, GXv_int8, GXv_int13, GXv_char14, GXv_int7) ;
                  apsuu004.this.AV15EmprCod = GXv_char15[0] ;
                  apsuu004.this.A44AlbRecCod = GXv_int9[0] ;
                  apsuu004.this.AV27BarCod = GXv_int8[0] ;
                  apsuu004.this.AV16DisCod = GXv_int7[0] ;
               }
               A396EmprCod = W396EmprCod ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
         }
         GXv_char15[0] = AV15EmprCod ;
         GXv_int9[0] = AV16DisCod ;
         GXv_int8[0] = AV27BarCod ;
         new app.pfasbar(remoteHandle, context).execute( GXv_char15, GXv_int9, GXv_int8) ;
         apsuu004.this.AV15EmprCod = GXv_char15[0] ;
         apsuu004.this.AV16DisCod = GXv_int9[0] ;
         apsuu004.this.AV27BarCod = GXv_int8[0] ;
         if ( AV119Suprema == 1 )
         {
            AV120Barcodreo = (byte)(0) ;
            AV121BarCodparp = " " ;
            GXv_char15[0] = AV15EmprCod ;
            GXv_int9[0] = AV27BarCod ;
            GXv_int13[0] = AV120Barcodreo ;
            GXv_char14[0] = AV121BarCodparp ;
            new app.psimop5(remoteHandle, context).execute( GXv_char15, GXv_int9, GXv_int13, GXv_char14) ;
            apsuu004.this.AV15EmprCod = GXv_char15[0] ;
            apsuu004.this.AV27BarCod = GXv_int9[0] ;
            apsuu004.this.AV120Barcodreo = GXv_int13[0] ;
            apsuu004.this.AV121BarCodparp = GXv_char14[0] ;
         }
         if ( AV48VERTI3 == 1 )
         {
            GXv_char15[0] = AV15EmprCod ;
            GXv_int9[0] = AV16DisCod ;
            GXv_int8[0] = AV27BarCod ;
            new app.pfasba2(remoteHandle, context).execute( GXv_char15, GXv_int9, GXv_int8) ;
            apsuu004.this.AV15EmprCod = GXv_char15[0] ;
            apsuu004.this.AV16DisCod = GXv_int9[0] ;
            apsuu004.this.AV27BarCod = GXv_int8[0] ;
         }
         A367DisEst = (byte)(3) ;
         AV56Nr_codigo = 0 ;
         AV78Nr_opecod = 0 ;
         AV79TipCSClq = (short)(0) ;
         /* Using cursor P02TW10 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A44AlbRecCod = P02TW10_A44AlbRecCod[0] ;
            A673Piezas = P02TW10_A673Piezas[0] ;
            /* Using cursor P02TW11 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A5206Nr_albrecc = P02TW11_A5206Nr_albrecc[0] ;
               n5206Nr_albrecc = P02TW11_n5206Nr_albrecc[0] ;
               A5198Nr_codigo = P02TW11_A5198Nr_codigo[0] ;
               A5906Nr_OpeCod = P02TW11_A5906Nr_OpeCod[0] ;
               n5906Nr_OpeCod = P02TW11_n5906Nr_OpeCod[0] ;
               A5904Nr_TipCsCL = P02TW11_A5904Nr_TipCsCL[0] ;
               n5904Nr_TipCsCL = P02TW11_n5904Nr_TipCsCL[0] ;
               AV56Nr_codigo = A5198Nr_codigo ;
               AV78Nr_opecod = A5906Nr_OpeCod ;
               AV79TipCSClq = A5904Nr_TipCsCL ;
               pr_default.readNext(8);
            }
            pr_default.close(8);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(7);
         }
         pr_default.close(7);
         /* Using cursor P02TW13 */
         pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A319DefPor = P02TW13_A319DefPor[0] ;
            A833TipDefCod = P02TW13_A833TipDefCod[0] ;
            n833TipDefCod = P02TW13_n833TipDefCod[0] ;
            A361DisCod = P02TW13_A361DisCod[0] ;
            A396EmprCod = P02TW13_A396EmprCod[0] ;
            A387DisPiePie = P02TW13_A387DisPiePie[0] ;
            n387DisPiePie = P02TW13_n387DisPiePie[0] ;
            A387DisPiePie = P02TW13_A387DisPiePie[0] ;
            n387DisPiePie = P02TW13_n387DisPiePie[0] ;
            W396EmprCod = A396EmprCod ;
            if ( AV56Nr_codigo > 0 )
            {
               AV49Num_fic = AV56Nr_codigo ;
            }
            /*
               INSERT RECORD ON TABLE TXPHISREO

            */
            W396EmprCod = A396EmprCod ;
            W833TipDefCod = A833TipDefCod ;
            n833TipDefCod = false ;
            W252CliCod = A252CliCod ;
            n252CliCod = false ;
            W602MaqCod = A602MaqCod ;
            n602MaqCod = false ;
            A396EmprCod = AV15EmprCod ;
            if ( (0==AV26ContVal) )
            {
               A539HisBarCod = AV16DisCod ;
            }
            else
            {
               A539HisBarCod = AV26ContVal ;
            }
            A545HisCodReo = (byte)(0) ;
            A544HisCodPar = " " ;
            n833TipDefCod = false ;
            A571HisTipArt = A352DisArtTip ;
            n571HisTipArt = false ;
            n252CliCod = false ;
            A542HisBarSer = A335DisArtCod ;
            n542HisBarSer = false ;
            A546HisColNom = A362DisColNom ;
            n546HisColNom = false ;
            A547HisColNum = A363DisColNum ;
            n547HisColNum = false ;
            A572HisTipCol = A390DisTipCol ;
            n572HisTipCol = false ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
            {
               A553HisNumPie = A387DisPiePie ;
               n553HisNumPie = false ;
            }
            else
            {
               A553HisNumPie = A386DisPieNor ;
               n553HisNumPie = false ;
            }
            A540HisBarKgm = A381DisPieKgm.multiply(DecimalUtil.doubleToDec(A319DefPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            n540HisBarKgm = false ;
            A541HisBarMtr = A385DisPieMtr.multiply(DecimalUtil.doubleToDec(A319DefPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            n541HisBarMtr = false ;
            A569HisReoFec = GXutil.today( ) ;
            n569HisReoFec = false ;
            A549HisKgmOri = A381DisPieKgm ;
            n549HisKgmOri = false ;
            A552HisMtrOri = A385DisPieMtr ;
            n552HisMtrOri = false ;
            A554HisOrdReo = (byte)(0) ;
            n554HisOrdReo = false ;
            A548HisEstReo = (byte)(2) ;
            n548HisEstReo = false ;
            A602MaqCod = GXutil.space( (short)(6)) ;
            n602MaqCod = false ;
            A2297HisReoTn = AV49Num_fic ;
            n2297HisReoTn = false ;
            A2299HisReoDsc = A337DisArtDsc ;
            n2299HisReoDsc = false ;
            A5356Hisoperar = AV78Nr_opecod ;
            n5356Hisoperar = false ;
            A5085CodCausa = AV79TipCSClq ;
            n5085CodCausa = false ;
            /* Using cursor P02TW14 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod), Boolean.valueOf(n571HisTipArt), Short.valueOf(A571HisTipArt), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n542HisBarSer), A542HisBarSer, Boolean.valueOf(n546HisColNom), A546HisColNom, Boolean.valueOf(n547HisColNum), Integer.valueOf(A547HisColNum), Boolean.valueOf(n572HisTipCol), Byte.valueOf(A572HisTipCol), Boolean.valueOf(n553HisNumPie), Short.valueOf(A553HisNumPie), Boolean.valueOf(n540HisBarKgm), A540HisBarKgm, Boolean.valueOf(n541HisBarMtr), A541HisBarMtr, Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n569HisReoFec), A569HisReoFec, Boolean.valueOf(n549HisKgmOri), A549HisKgmOri, Boolean.valueOf(n552HisMtrOri), A552HisMtrOri, Boolean.valueOf(n554HisOrdReo), Byte.valueOf(A554HisOrdReo), Boolean.valueOf(n548HisEstReo), Byte.valueOf(A548HisEstReo), Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn), Boolean.valueOf(n2299HisReoDsc), A2299HisReoDsc, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa), Boolean.valueOf(n5356Hisoperar), Integer.valueOf(A5356Hisoperar)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
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
            A396EmprCod = W396EmprCod ;
            A833TipDefCod = W833TipDefCod ;
            n833TipDefCod = false ;
            A252CliCod = W252CliCod ;
            n252CliCod = false ;
            A602MaqCod = W602MaqCod ;
            n602MaqCod = false ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         /* Using cursor P02TW15 */
         pr_default.execute(11, new Object[] {Byte.valueOf(A367DisEst), A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'TIPARTRB' Routine */
      returnInSub = false ;
      AV107TIPARTRB = DecimalUtil.doubleToDec(0) ;
      AV110TipArtVmn = 0 ;
      AV111TipArtVmx = 0 ;
      /* Using cursor P02TW16 */
      pr_default.execute(12, new Object[] {AV15EmprCod, Short.valueOf(AV105DisArtTip), AV106MaqCod});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A602MaqCod = P02TW16_A602MaqCod[0] ;
         n602MaqCod = P02TW16_n602MaqCod[0] ;
         A6188MaqTArt = P02TW16_A6188MaqTArt[0] ;
         A396EmprCod = P02TW16_A396EmprCod[0] ;
         A6190TipArtRb = P02TW16_A6190TipArtRb[0] ;
         n6190TipArtRb = P02TW16_n6190TipArtRb[0] ;
         A6233TipArtVmn = P02TW16_A6233TipArtVmn[0] ;
         n6233TipArtVmn = P02TW16_n6233TipArtVmn[0] ;
         A6234TipArtVmx = P02TW16_A6234TipArtVmx[0] ;
         n6234TipArtVmx = P02TW16_n6234TipArtVmx[0] ;
         AV107TIPARTRB = A6190TipArtRb ;
         AV110TipArtVmn = A6233TipArtVmn ;
         AV111TipArtVmx = A6234TipArtVmx ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S121( )
   {
      /* 'LMACRO' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02TW17 */
      pr_default.execute(13, new Object[] {Integer.valueOf(AV20BarCodPar), AV15EmprCod, Integer.valueOf(AV16DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
      /* End optimized UPDATE. */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(psuu004.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apsuu004");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor P02TW18 */
      pr_default.execute(14, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         X595Kilos = P02TW18_A595Kilos[0] ;
      }
      pr_default.close(14);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor P02TW19 */
      pr_default.execute(15, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         X382DisPieKil = P02TW19_A382DisPieKil[0] ;
      }
      pr_default.close(15);
      return X382DisPieKil ;
   }

   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02TW20 */
      pr_default.execute(16, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         X631Metros = P02TW20_A631Metros[0] ;
      }
      pr_default.close(16);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02TW21 */
      pr_default.execute(17, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         X384DisPieMet = P02TW21_A384DisPieMet[0] ;
      }
      pr_default.close(17);
      return X384DisPieMet ;
   }

   public int getDisPieNor0( String E396EmprCod ,
                             int E361DisCod )
   {
      X673Piezas = 0 ;
      /* Using cursor P02TW22 */
      pr_default.execute(18, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         X673Piezas = P02TW22_A673Piezas[0] ;
      }
      pr_default.close(18);
      return X673Piezas ;
   }

   public void initialize( )
   {
      AV44Station = "" ;
      AV15EmprCod = "" ;
      AV46EmprNom = "" ;
      AV45UsurCod = "" ;
      GXv_int6 = new int[1] ;
      AV106MaqCod = "" ;
      AV109Kgs = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02TW3_A367DisEst = new byte[1] ;
      P02TW3_A387DisPiePie = new short[1] ;
      P02TW3_n387DisPiePie = new boolean[] {false} ;
      P02TW3_A390DisTipCol = new byte[1] ;
      P02TW3_n390DisTipCol = new boolean[] {false} ;
      P02TW3_A363DisColNum = new int[1] ;
      P02TW3_n363DisColNum = new boolean[] {false} ;
      P02TW3_A362DisColNom = new String[] {""} ;
      P02TW3_n362DisColNom = new boolean[] {false} ;
      P02TW3_A335DisArtCod = new String[] {""} ;
      P02TW3_A252CliCod = new int[1] ;
      P02TW3_n252CliCod = new boolean[] {false} ;
      P02TW3_A396EmprCod = new String[] {""} ;
      P02TW3_A365DisDes = new String[] {""} ;
      P02TW3_A2831DisNumLot = new int[1] ;
      P02TW3_A360DisCliNum = new String[] {""} ;
      P02TW3_A337DisArtDsc = new String[] {""} ;
      P02TW3_A352DisArtTip = new short[1] ;
      P02TW3_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02TW3_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02TW3_A392DisUniMed = new String[] {""} ;
      P02TW3_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P02TW3_A6547DisVolMaq = new int[1] ;
      P02TW3_A341DisArtOpe = new String[] {""} ;
      P02TW3_A359DisArtUrg = new byte[1] ;
      P02TW3_A340DisArtMat = new String[] {""} ;
      P02TW3_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02TW3_A353DisArtTr1 = new String[] {""} ;
      P02TW3_A344DisArtPt1 = new short[1] ;
      P02TW3_A354DisArtTr2 = new String[] {""} ;
      P02TW3_A345DisArtPt2 = new short[1] ;
      P02TW3_A355DisArtTr3 = new String[] {""} ;
      P02TW3_A346DisArtPt3 = new short[1] ;
      P02TW3_A356DisArtUr1 = new String[] {""} ;
      P02TW3_A347DisArtPu1 = new short[1] ;
      P02TW3_A357DisArtUr2 = new String[] {""} ;
      P02TW3_A348DisArtPu2 = new short[1] ;
      P02TW3_A358DisArtUr3 = new String[] {""} ;
      P02TW3_A349DisArtPu3 = new short[1] ;
      P02TW3_n349DisArtPu3 = new boolean[] {false} ;
      P02TW3_A1232DisArtAcb = new short[1] ;
      P02TW3_A1233DisArtAc2 = new short[1] ;
      P02TW3_A334DisArtAnh = new short[1] ;
      P02TW3_A1231DisArtAn1 = new short[1] ;
      P02TW3_A343DisArtPle = new String[] {""} ;
      P02TW3_A339DisArtLar = new String[] {""} ;
      P02TW3_A351DisArtSua = new String[] {""} ;
      P02TW3_A333DisArtAca = new String[] {""} ;
      P02TW3_A336DisArtCor = new String[] {""} ;
      P02TW3_A338DisArtEnc = new String[] {""} ;
      P02TW3_A2832DisKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02TW3_A2833DisMtrLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02TW3_A1013DibCli = new String[] {""} ;
      P02TW3_n1013DibCli = new boolean[] {false} ;
      P02TW3_A1014DibInt = new int[1] ;
      P02TW3_n1014DibInt = new boolean[] {false} ;
      P02TW3_A5031DisCom = new String[] {""} ;
      P02TW3_n5031DisCom = new boolean[] {false} ;
      P02TW3_A757PriCod = new String[] {""} ;
      P02TW3_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P02TW3_A342DisArtPes = new short[1] ;
      P02TW3_A1225DisGraCru = new short[1] ;
      P02TW3_A1195DisNomCli = new String[] {""} ;
      P02TW3_A1196DisNumCli = new int[1] ;
      P02TW3_A1197DisEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02TW3_A1198DisEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02TW3_A1430DisLoc = new String[] {""} ;
      P02TW3_A1502DisPart = new short[1] ;
      P02TW3_A2310DisCliDes = new int[1] ;
      P02TW3_A2009DisTipDis = new String[] {""} ;
      P02TW3_n2009DisTipDis = new boolean[] {false} ;
      P02TW3_A2835DisPle2 = new String[] {""} ;
      P02TW3_A2926DisPla = new String[] {""} ;
      P02TW3_A3127DisNumCor = new short[1] ;
      P02TW3_A3128DisAncSal1 = new short[1] ;
      P02TW3_A3129DisAncSal2 = new short[1] ;
      P02TW3_A3130DisAncSal3 = new short[1] ;
      P02TW3_A3131DisGraAca2 = new short[1] ;
      P02TW3_A3132DisGraCru2 = new short[1] ;
      P02TW3_A1906DisGraAca = new short[1] ;
      P02TW3_A1907DisRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02TW3_A1908DisRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02TW3_A4014DisTin = new String[] {""} ;
      P02TW3_A4468DisPelAnh = new short[1] ;
      P02TW3_A4469DisCruMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02TW3_A4470DisCruKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02TW3_A4471DisCruEnr = new String[] {""} ;
      P02TW3_A4472DisLotPza = new short[1] ;
      P02TW3_n4472DisLotPza = new boolean[] {false} ;
      P02TW3_A4473DisLotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02TW3_A4474DisLotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02TW3_A4475DisLotMaq = new String[] {""} ;
      P02TW3_n4475DisLotMaq = new boolean[] {false} ;
      P02TW3_A4476DisAcaFor = new int[1] ;
      P02TW3_n4476DisAcaFor = new boolean[] {false} ;
      P02TW3_A4477DisAcaBak = new String[] {""} ;
      P02TW3_A4478DisAcaAnh = new short[1] ;
      P02TW3_A4479DisAcaMar = new String[] {""} ;
      P02TW3_A2402DisManCod = new short[1] ;
      P02TW3_A3307DisManCod1 = new short[1] ;
      P02TW3_A3308DisManCod2 = new short[1] ;
      P02TW3_A4614DisMdlCod = new String[] {""} ;
      P02TW3_A4615DisTam = new String[] {""} ;
      P02TW3_A4293DisNPzas = new int[1] ;
      P02TW3_n4293DisNPzas = new boolean[] {false} ;
      P02TW3_A4616DisHorEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P02TW3_n4616DisHorEnt = new boolean[] {false} ;
      P02TW3_A4813DisEncCli = new String[] {""} ;
      P02TW3_A5024DisTipEst = new byte[1] ;
      P02TW3_A5025DisGraCob = new byte[1] ;
      P02TW3_A4720DisDishCod = new String[] {""} ;
      P02TW3_A5032DisEstTip = new String[] {""} ;
      P02TW3_A5252DisAcc = new String[] {""} ;
      P02TW3_A5290DisTipCor = new String[] {""} ;
      P02TW3_A5350DisObsAnc = new String[] {""} ;
      P02TW3_A5349DisObsGrm = new String[] {""} ;
      P02TW3_A5366DisAntp = new String[] {""} ;
      P02TW3_A5405DisAntpT = new String[] {""} ;
      P02TW3_A1052DisObs = new String[] {""} ;
      P02TW3_A374DisNumPie = new short[1] ;
      P02TW3_A3627DisFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P02TW3_n3627DisFecLan = new boolean[] {false} ;
      P02TW3_A998DisNMtr = new String[] {""} ;
      P02TW3_A3309DisNumTon = new String[] {""} ;
      P02TW3_A361DisCod = new int[1] ;
      A362DisColNom = "" ;
      A335DisArtCod = "" ;
      A396EmprCod = "" ;
      A365DisDes = "" ;
      A360DisCliNum = "" ;
      A337DisArtDsc = "" ;
      A369DisFec = GXutil.nullDate() ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      A370DisFecCli = GXutil.nullDate() ;
      A341DisArtOpe = "" ;
      A340DisArtMat = "" ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      A353DisArtTr1 = "" ;
      A354DisArtTr2 = "" ;
      A355DisArtTr3 = "" ;
      A356DisArtUr1 = "" ;
      A357DisArtUr2 = "" ;
      A358DisArtUr3 = "" ;
      A343DisArtPle = "" ;
      A339DisArtLar = "" ;
      A351DisArtSua = "" ;
      A333DisArtAca = "" ;
      A336DisArtCor = "" ;
      A338DisArtEnc = "" ;
      A2832DisKgsLot = DecimalUtil.ZERO ;
      A2833DisMtrLot = DecimalUtil.ZERO ;
      A1013DibCli = "" ;
      A5031DisCom = "" ;
      A757PriCod = "" ;
      A371DisFecEnt = GXutil.nullDate() ;
      A1195DisNomCli = "" ;
      A1197DisEncCom = DecimalUtil.ZERO ;
      A1198DisEncAnh = DecimalUtil.ZERO ;
      A1430DisLoc = "" ;
      A2009DisTipDis = "" ;
      A2835DisPle2 = "" ;
      A2926DisPla = "" ;
      A1907DisRdoN = DecimalUtil.ZERO ;
      A1908DisRdoA = DecimalUtil.ZERO ;
      A4014DisTin = "" ;
      A4469DisCruMts = DecimalUtil.ZERO ;
      A4470DisCruKgs = DecimalUtil.ZERO ;
      A4471DisCruEnr = "" ;
      A4473DisLotMts = DecimalUtil.ZERO ;
      A4474DisLotKgs = DecimalUtil.ZERO ;
      A4475DisLotMaq = "" ;
      A4477DisAcaBak = "" ;
      A4479DisAcaMar = "" ;
      A4614DisMdlCod = "" ;
      A4615DisTam = "" ;
      A4616DisHorEnt = GXutil.resetTime( GXutil.nullDate() );
      A4813DisEncCli = "" ;
      A4720DisDishCod = "" ;
      A5032DisEstTip = "" ;
      A5252DisAcc = "" ;
      A5290DisTipCor = "" ;
      A5350DisObsAnc = "" ;
      A5349DisObsGrm = "" ;
      A5366DisAntp = "" ;
      A5405DisAntpT = "" ;
      A1052DisObs = "" ;
      A3627DisFecLan = GXutil.nullDate() ;
      A998DisNMtr = "" ;
      A3309DisNumTon = "" ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      A475FindCol = "" ;
      GXt_char11 = "" ;
      W396EmprCod = "" ;
      AV112Disacc = "" ;
      P02TW4_A44AlbRecCod = new int[1] ;
      P02TW4_A396EmprCod = new String[] {""} ;
      P02TW4_A361DisCod = new int[1] ;
      P02TW4_A673Piezas = new int[1] ;
      P02TW4_A55AlbRReo = new String[] {""} ;
      A55AlbRReo = "" ;
      P02TW5_A361DisCod = new int[1] ;
      P02TW5_A396EmprCod = new String[] {""} ;
      P02TW5_A833TipDefCod = new short[1] ;
      P02TW5_n833TipDefCod = new boolean[] {false} ;
      AV37Mensa = "" ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      A192BarNumUni = DecimalUtil.ZERO ;
      A228BarUniMed = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A180BarMaqCod = "" ;
      AV107TIPARTRB = DecimalUtil.ZERO ;
      AV93EmprCod2 = "" ;
      AV94EmprNom2 = "" ;
      A182BarMat = "" ;
      A211BarRdt = DecimalUtil.ZERO ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      A229BarUrd1 = "" ;
      A230BarUrd2 = "" ;
      A231BarUrd3 = "" ;
      A206BarPle = "" ;
      A177BarLar = "" ;
      A214BarSua = "" ;
      A118BarAcaQui = "" ;
      A139BarCorOri = "" ;
      A145BarEncOri = "" ;
      A2827BarKgsLot = DecimalUtil.ZERO ;
      A2828BarMtrLot = DecimalUtil.ZERO ;
      AV97Fondo = "" ;
      GXv_char1 = new String[1] ;
      A209BarPri = "" ;
      A137BarConPar = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A169BarKgsFac = DecimalUtil.ZERO ;
      A158BarFecFpr = GXutil.nullDate() ;
      A120BarAgrEst = "" ;
      A1234BarNomCli = "" ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      A1431BarLocDis = "" ;
      A2010BarTipDis = "" ;
      A2485BarColPes = "" ;
      A2498BarPrdPes = "" ;
      A2499BarRDos1 = "" ;
      A2500BarRDos2 = "" ;
      A2836BarPle2 = "" ;
      AV40BarProPer = "" ;
      A2829BarProPer = "" ;
      A3030BarPlf = "" ;
      A1910BarRdoN = DecimalUtil.ZERO ;
      A1911BarRdoA = DecimalUtil.ZERO ;
      A1798BarDibCli = "" ;
      A4016BarTin = "" ;
      A4457BarCruMts = DecimalUtil.ZERO ;
      A4458BarCruKgs = DecimalUtil.ZERO ;
      A4459BarCruEnr = "" ;
      A4461BarLotMts = DecimalUtil.ZERO ;
      A4462BarLotKgs = DecimalUtil.ZERO ;
      A4463BarLotMaq = "" ;
      A4465BarAcaBak = "" ;
      A4467BarAcaMar = "" ;
      A4609BarMdlCod = "" ;
      A4610BarTam = "" ;
      A4611BarHorEnt = GXutil.resetTime( GXutil.nullDate() );
      A4613BarHorReg = GXutil.resetTime( GXutil.nullDate() );
      A2453BarEntAca = "" ;
      A2452BarCal = "" ;
      A4812BarEncCli = "" ;
      A2460BarTipAca = "" ;
      A4716BarDishCod = "" ;
      A5033BarCom = "" ;
      A5034BarEstTip = "" ;
      A5253BarAcc = "" ;
      A5291BarTipCor = "" ;
      A5352BarObsAnc = "" ;
      A5351BarObsGrm = "" ;
      A5367BarAntp = "" ;
      A5406BarAntpT = "" ;
      A2454BarGirar = "" ;
      GXv_int12 = new short[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int16 = new short[1] ;
      AV65ForPreFec = GXutil.nullDate() ;
      GXv_date17 = new java.util.Date[1] ;
      AV70Usurcod_a = "" ;
      AV71Fecha_a = "" ;
      A4835BarAudOpeN = "" ;
      Gx_time = "" ;
      A1003BarFecLan = GXutil.nullDate() ;
      A4837BarAudSupN = "" ;
      A1500BarNMtr = "" ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      A3745BarFoa = "" ;
      A3313BarNumTon = "" ;
      Gx_emsg = "" ;
      A1141DisBarPar = "" ;
      AV32TotKil = DecimalUtil.ZERO ;
      AV33TotMet = DecimalUtil.ZERO ;
      AV73HRStkInt = "" ;
      P02TW8_A396EmprCod = new String[] {""} ;
      P02TW8_A361DisCod = new int[1] ;
      P02TW8_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02TW8_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02TW8_A673Piezas = new int[1] ;
      P02TW8_A44AlbRecCod = new int[1] ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A6489BarPieIdPz = "" ;
      A2186BarPieLoc = "" ;
      GXv_int7 = new int[1] ;
      AV121BarCodparp = "" ;
      GXv_int13 = new byte[1] ;
      GXv_char14 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int8 = new int[1] ;
      P02TW10_A396EmprCod = new String[] {""} ;
      P02TW10_A361DisCod = new int[1] ;
      P02TW10_A44AlbRecCod = new int[1] ;
      P02TW10_A673Piezas = new int[1] ;
      P02TW11_A396EmprCod = new String[] {""} ;
      P02TW11_A5206Nr_albrecc = new int[1] ;
      P02TW11_n5206Nr_albrecc = new boolean[] {false} ;
      P02TW11_A5198Nr_codigo = new int[1] ;
      P02TW11_A5906Nr_OpeCod = new int[1] ;
      P02TW11_n5906Nr_OpeCod = new boolean[] {false} ;
      P02TW11_A5904Nr_TipCsCL = new short[1] ;
      P02TW11_n5904Nr_TipCsCL = new boolean[] {false} ;
      P02TW13_A319DefPor = new short[1] ;
      P02TW13_A833TipDefCod = new short[1] ;
      P02TW13_n833TipDefCod = new boolean[] {false} ;
      P02TW13_A361DisCod = new int[1] ;
      P02TW13_A396EmprCod = new String[] {""} ;
      P02TW13_A387DisPiePie = new short[1] ;
      P02TW13_n387DisPiePie = new boolean[] {false} ;
      W602MaqCod = "" ;
      A602MaqCod = "" ;
      A544HisCodPar = "" ;
      A542HisBarSer = "" ;
      A546HisColNom = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A569HisReoFec = GXutil.nullDate() ;
      A549HisKgmOri = DecimalUtil.ZERO ;
      A552HisMtrOri = DecimalUtil.ZERO ;
      A2299HisReoDsc = "" ;
      P02TW16_A602MaqCod = new String[] {""} ;
      P02TW16_n602MaqCod = new boolean[] {false} ;
      P02TW16_A6188MaqTArt = new short[1] ;
      P02TW16_A396EmprCod = new String[] {""} ;
      P02TW16_A6190TipArtRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02TW16_n6190TipArtRb = new boolean[] {false} ;
      P02TW16_A6233TipArtVmn = new int[1] ;
      P02TW16_n6233TipArtVmn = new boolean[] {false} ;
      P02TW16_A6234TipArtVmx = new int[1] ;
      P02TW16_n6234TipArtVmx = new boolean[] {false} ;
      A6190TipArtRb = DecimalUtil.ZERO ;
      X595Kilos = DecimalUtil.ZERO ;
      E396EmprCod = "" ;
      P02TW18_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      P02TW19_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X631Metros = DecimalUtil.ZERO ;
      P02TW20_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      P02TW21_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02TW22_A673Piezas = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apsuu004__default(),
         new Object[] {
             new Object[] {
            P02TW3_A367DisEst, P02TW3_A387DisPiePie, P02TW3_n387DisPiePie, P02TW3_A390DisTipCol, P02TW3_n390DisTipCol, P02TW3_A363DisColNum, P02TW3_n363DisColNum, P02TW3_A362DisColNom, P02TW3_n362DisColNom, P02TW3_A335DisArtCod,
            P02TW3_A252CliCod, P02TW3_A396EmprCod, P02TW3_A365DisDes, P02TW3_A2831DisNumLot, P02TW3_A360DisCliNum, P02TW3_A337DisArtDsc, P02TW3_A352DisArtTip, P02TW3_A369DisFec, P02TW3_A375DisNumUni, P02TW3_A392DisUniMed,
            P02TW3_A370DisFecCli, P02TW3_A6547DisVolMaq, P02TW3_A341DisArtOpe, P02TW3_A359DisArtUrg, P02TW3_A340DisArtMat, P02TW3_A350DisArtRdt, P02TW3_A353DisArtTr1, P02TW3_A344DisArtPt1, P02TW3_A354DisArtTr2, P02TW3_A345DisArtPt2,
            P02TW3_A355DisArtTr3, P02TW3_A346DisArtPt3, P02TW3_A356DisArtUr1, P02TW3_A347DisArtPu1, P02TW3_A357DisArtUr2, P02TW3_A348DisArtPu2, P02TW3_A358DisArtUr3, P02TW3_A349DisArtPu3, P02TW3_n349DisArtPu3, P02TW3_A1232DisArtAcb,
            P02TW3_A1233DisArtAc2, P02TW3_A334DisArtAnh, P02TW3_A1231DisArtAn1, P02TW3_A343DisArtPle, P02TW3_A339DisArtLar, P02TW3_A351DisArtSua, P02TW3_A333DisArtAca, P02TW3_A336DisArtCor, P02TW3_A338DisArtEnc, P02TW3_A2832DisKgsLot,
            P02TW3_A2833DisMtrLot, P02TW3_A1013DibCli, P02TW3_n1013DibCli, P02TW3_A1014DibInt, P02TW3_n1014DibInt, P02TW3_A5031DisCom, P02TW3_n5031DisCom, P02TW3_A757PriCod, P02TW3_A371DisFecEnt, P02TW3_A342DisArtPes,
            P02TW3_A1225DisGraCru, P02TW3_A1195DisNomCli, P02TW3_A1196DisNumCli, P02TW3_A1197DisEncCom, P02TW3_A1198DisEncAnh, P02TW3_A1430DisLoc, P02TW3_A1502DisPart, P02TW3_A2310DisCliDes, P02TW3_A2009DisTipDis, P02TW3_n2009DisTipDis,
            P02TW3_A2835DisPle2, P02TW3_A2926DisPla, P02TW3_A3127DisNumCor, P02TW3_A3128DisAncSal1, P02TW3_A3129DisAncSal2, P02TW3_A3130DisAncSal3, P02TW3_A3131DisGraAca2, P02TW3_A3132DisGraCru2, P02TW3_A1906DisGraAca, P02TW3_A1907DisRdoN,
            P02TW3_A1908DisRdoA, P02TW3_A4014DisTin, P02TW3_A4468DisPelAnh, P02TW3_A4469DisCruMts, P02TW3_A4470DisCruKgs, P02TW3_A4471DisCruEnr, P02TW3_A4472DisLotPza, P02TW3_n4472DisLotPza, P02TW3_A4473DisLotMts, P02TW3_A4474DisLotKgs,
            P02TW3_A4475DisLotMaq, P02TW3_n4475DisLotMaq, P02TW3_A4476DisAcaFor, P02TW3_n4476DisAcaFor, P02TW3_A4477DisAcaBak, P02TW3_A4478DisAcaAnh, P02TW3_A4479DisAcaMar, P02TW3_A2402DisManCod, P02TW3_A3307DisManCod1, P02TW3_A3308DisManCod2,
            P02TW3_A4614DisMdlCod, P02TW3_A4615DisTam, P02TW3_A4293DisNPzas, P02TW3_n4293DisNPzas, P02TW3_A4616DisHorEnt, P02TW3_n4616DisHorEnt, P02TW3_A4813DisEncCli, P02TW3_A5024DisTipEst, P02TW3_A5025DisGraCob, P02TW3_A4720DisDishCod,
            P02TW3_A5032DisEstTip, P02TW3_A5252DisAcc, P02TW3_A5290DisTipCor, P02TW3_A5350DisObsAnc, P02TW3_A5349DisObsGrm, P02TW3_A5366DisAntp, P02TW3_A5405DisAntpT, P02TW3_A1052DisObs, P02TW3_A374DisNumPie, P02TW3_A3627DisFecLan,
            P02TW3_n3627DisFecLan, P02TW3_A998DisNMtr, P02TW3_A3309DisNumTon, P02TW3_A361DisCod
            }
            , new Object[] {
            P02TW4_A44AlbRecCod, P02TW4_A396EmprCod, P02TW4_A361DisCod, P02TW4_A673Piezas, P02TW4_A55AlbRReo
            }
            , new Object[] {
            P02TW5_A361DisCod, P02TW5_A396EmprCod, P02TW5_A833TipDefCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02TW8_A396EmprCod, P02TW8_A361DisCod, P02TW8_A595Kilos, P02TW8_A631Metros, P02TW8_A673Piezas, P02TW8_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02TW10_A396EmprCod, P02TW10_A361DisCod, P02TW10_A44AlbRecCod, P02TW10_A673Piezas
            }
            , new Object[] {
            P02TW11_A396EmprCod, P02TW11_A5206Nr_albrecc, P02TW11_n5206Nr_albrecc, P02TW11_A5198Nr_codigo, P02TW11_A5906Nr_OpeCod, P02TW11_n5906Nr_OpeCod, P02TW11_A5904Nr_TipCsCL, P02TW11_n5904Nr_TipCsCL
            }
            , new Object[] {
            P02TW13_A319DefPor, P02TW13_A833TipDefCod, P02TW13_A361DisCod, P02TW13_A396EmprCod, P02TW13_A387DisPiePie, P02TW13_n387DisPiePie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02TW16_A602MaqCod, P02TW16_A6188MaqTArt, P02TW16_A396EmprCod, P02TW16_A6190TipArtRb, P02TW16_n6190TipArtRb, P02TW16_A6233TipArtVmn, P02TW16_n6233TipArtVmn, P02TW16_A6234TipArtVmx, P02TW16_n6234TipArtVmx
            }
            , new Object[] {
            }
            , new Object[] {
            P02TW18_A595Kilos
            }
            , new Object[] {
            P02TW19_A382DisPieKil
            }
            , new Object[] {
            P02TW20_A631Metros
            }
            , new Object[] {
            P02TW21_A384DisPieMet
            }
            , new Object[] {
            P02TW22_A673Piezas
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV91PLinea ;
   private byte AV96Salayet ;
   private byte AV116Pizarro ;
   private byte AV47FlagVTab ;
   private byte AV28Flag ;
   private byte AV39FlagPer ;
   private byte AV118Tejido ;
   private byte AV48VERTI3 ;
   private byte AV119Suprema ;
   private byte AV50F_nr ;
   private byte AV51Hidro ;
   private byte AV52Fidel ;
   private byte AV57F_carvema ;
   private byte AV60F_pais ;
   private byte AV114CtrlUsu ;
   private byte AV61TintSN ;
   private byte AV62F_lavand ;
   private byte AV64F_moda21 ;
   private byte AV69F_tinamar ;
   private byte AV74VERTIC ;
   private byte AV77Vtabuas ;
   private byte AV85Vincolor ;
   private byte AV99FlagTint ;
   private byte AV104Kohler ;
   private byte AV115Staack ;
   private byte AV117Sequeiro ;
   private byte AV123Magosa ;
   private byte GXt_int4 ;
   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private byte A359DisArtUrg ;
   private byte A5024DisTipEst ;
   private byte A5025DisGraCob ;
   private byte AV29DisReo ;
   private byte AV38IntCod ;
   private byte AV43DisComULin ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A193BarOpeEsp ;
   private byte AV92Flag_Col ;
   private byte AV95Flag_Emp2 ;
   private byte A235BarUrg ;
   private byte A146BarEst ;
   private byte AV100Flag_Dib ;
   private byte A213BarSit ;
   private byte A147BarEstCol ;
   private byte AV98Flag_For ;
   private byte A4400BarSitEst ;
   private byte A138BarConReo ;
   private byte A148BarEstReo ;
   private byte A196BarOrdReo ;
   private byte A178BarLis ;
   private byte A2830BarIntPer ;
   private byte A2512BarComULin ;
   private byte A5026BarTipEst ;
   private byte A5027BarGraCob ;
   private byte A646NotUltLin ;
   private byte AV59Cont_not ;
   private byte AV80Induyco ;
   private byte A3594BarPriTin ;
   private byte GXv_int5[] ;
   private byte A1140DisBarReo ;
   private byte A201BarPieEst ;
   private byte AV120Barcodreo ;
   private byte GXv_int13[] ;
   private byte A545HisCodReo ;
   private byte A572HisTipCol ;
   private byte A554HisOrdReo ;
   private byte A548HisEstReo ;
   private short AV67AlaCol ;
   private short A387DisPiePie ;
   private short A352DisArtTip ;
   private short A344DisArtPt1 ;
   private short A345DisArtPt2 ;
   private short A346DisArtPt3 ;
   private short A347DisArtPu1 ;
   private short A348DisArtPu2 ;
   private short A349DisArtPu3 ;
   private short A1232DisArtAcb ;
   private short A1233DisArtAc2 ;
   private short A334DisArtAnh ;
   private short A1231DisArtAn1 ;
   private short A342DisArtPes ;
   private short A1225DisGraCru ;
   private short A1502DisPart ;
   private short A3127DisNumCor ;
   private short A3128DisAncSal1 ;
   private short A3129DisAncSal2 ;
   private short A3130DisAncSal3 ;
   private short A3131DisGraAca2 ;
   private short A3132DisGraCru2 ;
   private short A1906DisGraAca ;
   private short A4468DisPelAnh ;
   private short A4472DisLotPza ;
   private short A4478DisAcaAnh ;
   private short A2402DisManCod ;
   private short A3307DisManCod1 ;
   private short A3308DisManCod2 ;
   private short A374DisNumPie ;
   private short A386DisPieNor ;
   private short AV42TipDefCod ;
   private short A833TipDefCod ;
   private short AV36Matiz ;
   private short AV105DisArtTip ;
   private short A217BarTipArt ;
   private short A191BarNumPie ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A232BarUrdP1 ;
   private short A233BarUrdP2 ;
   private short A234BarUrdP3 ;
   private short A127BarAncCru1 ;
   private short A128BarAncCru2 ;
   private short A125BarAncAca1 ;
   private short A126BarAncAca2 ;
   private short A189BarNumAny ;
   private short AV113disartpes ;
   private short A864BarPes ;
   private short A1226BarGraCru ;
   private short A921BarMatiz ;
   private short A1503BarPart ;
   private short A3133BarNumCor ;
   private short A3134BarAncSal1 ;
   private short A3135BarAncSal2 ;
   private short A3136BarAncSal3 ;
   private short A3137BarGraAca2 ;
   private short A3138BarGraCru2 ;
   private short A1909BarGraAca ;
   private short A4456BarPelAnh ;
   private short A4460BarLotPza ;
   private short A4466BarAcaAnh ;
   private short A2400BarManCod ;
   private short A3311BarManCod1 ;
   private short A3312BarManCod2 ;
   private short A4975BarNumReo ;
   private short GXv_int12[] ;
   private short AV63Tiempo_a ;
   private short GXv_int16[] ;
   private short A5054BarBp13 ;
   private short AV66Dias_a ;
   private short AV68Dias_ac ;
   private short Gx_err ;
   private short AV79TipCSClq ;
   private short A5904Nr_TipCsCL ;
   private short A319DefPor ;
   private short W833TipDefCod ;
   private short A571HisTipArt ;
   private short A553HisNumPie ;
   private short A5085CodCausa ;
   private short A6188MaqTArt ;
   private int AV16DisCod ;
   private int GXv_int6[] ;
   private int AV102maqVolMax ;
   private int AV103MaqVolMin ;
   private int AV101MaqVolMed ;
   private int A363DisColNum ;
   private int A252CliCod ;
   private int A2831DisNumLot ;
   private int A6547DisVolMaq ;
   private int A1014DibInt ;
   private int A1196DisNumCli ;
   private int A2310DisCliDes ;
   private int A4476DisAcaFor ;
   private int A4293DisNPzas ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int A673Piezas ;
   private int GX_INS12 ;
   private int W361DisCod ;
   private int A129BarCod ;
   private int AV27BarCod ;
   private int AV20BarCodPar ;
   private int A136BarColNum ;
   private int A236BarVolMaq ;
   private int AV108Volumen ;
   private int AV111TipArtVmx ;
   private int AV110TipArtVmn ;
   private int A2826BarNumLot ;
   private int AV49Num_fic ;
   private int A1235BarNumCli ;
   private int A2311BarCliDes ;
   private int A1799BarDibInt ;
   private int A4464BarAcaFor ;
   private int A4612BarPzas ;
   private int A144BarDisOri ;
   private int GX_INS153 ;
   private int A1146DisDisCod ;
   private int A1139DisBarCod ;
   private int GX_INS18 ;
   private int A1501BarPiePie ;
   private int GXv_int7[] ;
   private int GXv_int9[] ;
   private int GXv_int8[] ;
   private int AV56Nr_codigo ;
   private int AV78Nr_opecod ;
   private int A5206Nr_albrecc ;
   private int A5198Nr_codigo ;
   private int A5906Nr_OpeCod ;
   private int GX_INS60 ;
   private int W252CliCod ;
   private int AV26ContVal ;
   private int A539HisBarCod ;
   private int A547HisColNum ;
   private int A2297HisReoTn ;
   private int A5356Hisoperar ;
   private int A6233TipArtVmn ;
   private int A6234TipArtVmx ;
   private int A1203MacBarCod ;
   private int E361DisCod ;
   private int X673Piezas ;
   private java.math.BigDecimal AV109Kgs ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal A2832DisKgsLot ;
   private java.math.BigDecimal A2833DisMtrLot ;
   private java.math.BigDecimal A1197DisEncCom ;
   private java.math.BigDecimal A1198DisEncAnh ;
   private java.math.BigDecimal A1907DisRdoN ;
   private java.math.BigDecimal A1908DisRdoA ;
   private java.math.BigDecimal A4469DisCruMts ;
   private java.math.BigDecimal A4470DisCruKgs ;
   private java.math.BigDecimal A4473DisLotMts ;
   private java.math.BigDecimal A4474DisLotKgs ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal A192BarNumUni ;
   private java.math.BigDecimal AV107TIPARTRB ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A2827BarKgsLot ;
   private java.math.BigDecimal A2828BarMtrLot ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A169BarKgsFac ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1910BarRdoN ;
   private java.math.BigDecimal A1911BarRdoA ;
   private java.math.BigDecimal A4457BarCruMts ;
   private java.math.BigDecimal A4458BarCruKgs ;
   private java.math.BigDecimal A4461BarLotMts ;
   private java.math.BigDecimal A4462BarLotKgs ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV32TotKil ;
   private java.math.BigDecimal AV33TotMet ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal A549HisKgmOri ;
   private java.math.BigDecimal A552HisMtrOri ;
   private java.math.BigDecimal A6190TipArtRb ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X384DisPieMet ;
   private String AV44Station ;
   private String AV15EmprCod ;
   private String AV46EmprNom ;
   private String AV45UsurCod ;
   private String AV106MaqCod ;
   private String scmdbuf ;
   private String A362DisColNom ;
   private String A335DisArtCod ;
   private String A396EmprCod ;
   private String A365DisDes ;
   private String A360DisCliNum ;
   private String A337DisArtDsc ;
   private String A392DisUniMed ;
   private String A341DisArtOpe ;
   private String A340DisArtMat ;
   private String A353DisArtTr1 ;
   private String A354DisArtTr2 ;
   private String A355DisArtTr3 ;
   private String A356DisArtUr1 ;
   private String A357DisArtUr2 ;
   private String A358DisArtUr3 ;
   private String A343DisArtPle ;
   private String A339DisArtLar ;
   private String A351DisArtSua ;
   private String A333DisArtAca ;
   private String A336DisArtCor ;
   private String A338DisArtEnc ;
   private String A1013DibCli ;
   private String A5031DisCom ;
   private String A757PriCod ;
   private String A1195DisNomCli ;
   private String A1430DisLoc ;
   private String A2009DisTipDis ;
   private String A2835DisPle2 ;
   private String A2926DisPla ;
   private String A4014DisTin ;
   private String A4471DisCruEnr ;
   private String A4475DisLotMaq ;
   private String A4477DisAcaBak ;
   private String A4479DisAcaMar ;
   private String A4614DisMdlCod ;
   private String A4615DisTam ;
   private String A4813DisEncCli ;
   private String A4720DisDishCod ;
   private String A5032DisEstTip ;
   private String A5252DisAcc ;
   private String A5290DisTipCor ;
   private String A5350DisObsAnc ;
   private String A5349DisObsGrm ;
   private String A5366DisAntp ;
   private String A5405DisAntpT ;
   private String A1052DisObs ;
   private String A998DisNMtr ;
   private String A3309DisNumTon ;
   private String A475FindCol ;
   private String GXt_char11 ;
   private String W396EmprCod ;
   private String AV112Disacc ;
   private String A55AlbRReo ;
   private String AV37Mensa ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A228BarUniMed ;
   private String A180BarMaqCod ;
   private String AV93EmprCod2 ;
   private String AV94EmprNom2 ;
   private String A182BarMat ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String A229BarUrd1 ;
   private String A230BarUrd2 ;
   private String A231BarUrd3 ;
   private String A206BarPle ;
   private String A177BarLar ;
   private String A214BarSua ;
   private String A118BarAcaQui ;
   private String A139BarCorOri ;
   private String A145BarEncOri ;
   private String AV97Fondo ;
   private String GXv_char1[] ;
   private String A209BarPri ;
   private String A137BarConPar ;
   private String A120BarAgrEst ;
   private String A1234BarNomCli ;
   private String A1431BarLocDis ;
   private String A2010BarTipDis ;
   private String A2485BarColPes ;
   private String A2498BarPrdPes ;
   private String A2499BarRDos1 ;
   private String A2500BarRDos2 ;
   private String A2836BarPle2 ;
   private String AV40BarProPer ;
   private String A2829BarProPer ;
   private String A3030BarPlf ;
   private String A1798BarDibCli ;
   private String A4016BarTin ;
   private String A4459BarCruEnr ;
   private String A4463BarLotMaq ;
   private String A4465BarAcaBak ;
   private String A4467BarAcaMar ;
   private String A4609BarMdlCod ;
   private String A4610BarTam ;
   private String A2453BarEntAca ;
   private String A2452BarCal ;
   private String A4812BarEncCli ;
   private String A2460BarTipAca ;
   private String A4716BarDishCod ;
   private String A5033BarCom ;
   private String A5034BarEstTip ;
   private String A5253BarAcc ;
   private String A5291BarTipCor ;
   private String A5352BarObsAnc ;
   private String A5351BarObsGrm ;
   private String A5367BarAntp ;
   private String A5406BarAntpT ;
   private String A2454BarGirar ;
   private String AV70Usurcod_a ;
   private String AV71Fecha_a ;
   private String A4835BarAudOpeN ;
   private String Gx_time ;
   private String A4837BarAudSupN ;
   private String A1500BarNMtr ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String A3745BarFoa ;
   private String A3313BarNumTon ;
   private String Gx_emsg ;
   private String A1141DisBarPar ;
   private String AV73HRStkInt ;
   private String A200BarPieCod ;
   private String A6489BarPieIdPz ;
   private String A2186BarPieLoc ;
   private String AV121BarCodparp ;
   private String GXv_char14[] ;
   private String GXv_char15[] ;
   private String W602MaqCod ;
   private String A602MaqCod ;
   private String A544HisCodPar ;
   private String A542HisBarSer ;
   private String A546HisColNom ;
   private String A2299HisReoDsc ;
   private String E396EmprCod ;
   private java.util.Date A4616DisHorEnt ;
   private java.util.Date A4611BarHorEnt ;
   private java.util.Date A4613BarHorReg ;
   private java.util.Date A369DisFec ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date A3627DisFecLan ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date Gx_date ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date AV65ForPreFec ;
   private java.util.Date GXv_date17[] ;
   private java.util.Date A1003BarFecLan ;
   private java.util.Date A569HisReoFec ;
   private boolean n387DisPiePie ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean n252CliCod ;
   private boolean n349DisArtPu3 ;
   private boolean n1013DibCli ;
   private boolean n1014DibInt ;
   private boolean n5031DisCom ;
   private boolean n2009DisTipDis ;
   private boolean n4472DisLotPza ;
   private boolean n4475DisLotMaq ;
   private boolean n4476DisAcaFor ;
   private boolean n4293DisNPzas ;
   private boolean n4616DisHorEnt ;
   private boolean n3627DisFecLan ;
   private boolean n833TipDefCod ;
   private boolean returnInSub ;
   private boolean n217BarTipArt ;
   private boolean n2512BarComULin ;
   private boolean n4457BarCruMts ;
   private boolean n4458BarCruKgs ;
   private boolean n4460BarLotPza ;
   private boolean n4463BarLotMaq ;
   private boolean n4464BarAcaFor ;
   private boolean n4465BarAcaBak ;
   private boolean n4612BarPzas ;
   private boolean n4611BarHorEnt ;
   private boolean n4613BarHorReg ;
   private boolean n2453BarEntAca ;
   private boolean n2452BarCal ;
   private boolean n646NotUltLin ;
   private boolean n5054BarBp13 ;
   private boolean n4835BarAudOpeN ;
   private boolean n1003BarFecLan ;
   private boolean n4837BarAudSupN ;
   private boolean n6489BarPieIdPz ;
   private boolean n2186BarPieLoc ;
   private boolean n5206Nr_albrecc ;
   private boolean n5906Nr_OpeCod ;
   private boolean n5904Nr_TipCsCL ;
   private boolean n602MaqCod ;
   private boolean n571HisTipArt ;
   private boolean n542HisBarSer ;
   private boolean n546HisColNom ;
   private boolean n547HisColNum ;
   private boolean n572HisTipCol ;
   private boolean n553HisNumPie ;
   private boolean n540HisBarKgm ;
   private boolean n541HisBarMtr ;
   private boolean n569HisReoFec ;
   private boolean n549HisKgmOri ;
   private boolean n552HisMtrOri ;
   private boolean n554HisOrdReo ;
   private boolean n548HisEstReo ;
   private boolean n2297HisReoTn ;
   private boolean n2299HisReoDsc ;
   private boolean n5356Hisoperar ;
   private boolean n5085CodCausa ;
   private boolean n6190TipArtRb ;
   private boolean n6233TipArtVmn ;
   private boolean n6234TipArtVmx ;
   private IDataStoreProvider pr_default ;
   private byte[] P02TW3_A367DisEst ;
   private short[] P02TW3_A387DisPiePie ;
   private boolean[] P02TW3_n387DisPiePie ;
   private byte[] P02TW3_A390DisTipCol ;
   private boolean[] P02TW3_n390DisTipCol ;
   private int[] P02TW3_A363DisColNum ;
   private boolean[] P02TW3_n363DisColNum ;
   private String[] P02TW3_A362DisColNom ;
   private boolean[] P02TW3_n362DisColNom ;
   private String[] P02TW3_A335DisArtCod ;
   private int[] P02TW3_A252CliCod ;
   private boolean[] P02TW3_n252CliCod ;
   private String[] P02TW3_A396EmprCod ;
   private String[] P02TW3_A365DisDes ;
   private int[] P02TW3_A2831DisNumLot ;
   private String[] P02TW3_A360DisCliNum ;
   private String[] P02TW3_A337DisArtDsc ;
   private short[] P02TW3_A352DisArtTip ;
   private java.util.Date[] P02TW3_A369DisFec ;
   private java.math.BigDecimal[] P02TW3_A375DisNumUni ;
   private String[] P02TW3_A392DisUniMed ;
   private java.util.Date[] P02TW3_A370DisFecCli ;
   private int[] P02TW3_A6547DisVolMaq ;
   private String[] P02TW3_A341DisArtOpe ;
   private byte[] P02TW3_A359DisArtUrg ;
   private String[] P02TW3_A340DisArtMat ;
   private java.math.BigDecimal[] P02TW3_A350DisArtRdt ;
   private String[] P02TW3_A353DisArtTr1 ;
   private short[] P02TW3_A344DisArtPt1 ;
   private String[] P02TW3_A354DisArtTr2 ;
   private short[] P02TW3_A345DisArtPt2 ;
   private String[] P02TW3_A355DisArtTr3 ;
   private short[] P02TW3_A346DisArtPt3 ;
   private String[] P02TW3_A356DisArtUr1 ;
   private short[] P02TW3_A347DisArtPu1 ;
   private String[] P02TW3_A357DisArtUr2 ;
   private short[] P02TW3_A348DisArtPu2 ;
   private String[] P02TW3_A358DisArtUr3 ;
   private short[] P02TW3_A349DisArtPu3 ;
   private boolean[] P02TW3_n349DisArtPu3 ;
   private short[] P02TW3_A1232DisArtAcb ;
   private short[] P02TW3_A1233DisArtAc2 ;
   private short[] P02TW3_A334DisArtAnh ;
   private short[] P02TW3_A1231DisArtAn1 ;
   private String[] P02TW3_A343DisArtPle ;
   private String[] P02TW3_A339DisArtLar ;
   private String[] P02TW3_A351DisArtSua ;
   private String[] P02TW3_A333DisArtAca ;
   private String[] P02TW3_A336DisArtCor ;
   private String[] P02TW3_A338DisArtEnc ;
   private java.math.BigDecimal[] P02TW3_A2832DisKgsLot ;
   private java.math.BigDecimal[] P02TW3_A2833DisMtrLot ;
   private String[] P02TW3_A1013DibCli ;
   private boolean[] P02TW3_n1013DibCli ;
   private int[] P02TW3_A1014DibInt ;
   private boolean[] P02TW3_n1014DibInt ;
   private String[] P02TW3_A5031DisCom ;
   private boolean[] P02TW3_n5031DisCom ;
   private String[] P02TW3_A757PriCod ;
   private java.util.Date[] P02TW3_A371DisFecEnt ;
   private short[] P02TW3_A342DisArtPes ;
   private short[] P02TW3_A1225DisGraCru ;
   private String[] P02TW3_A1195DisNomCli ;
   private int[] P02TW3_A1196DisNumCli ;
   private java.math.BigDecimal[] P02TW3_A1197DisEncCom ;
   private java.math.BigDecimal[] P02TW3_A1198DisEncAnh ;
   private String[] P02TW3_A1430DisLoc ;
   private short[] P02TW3_A1502DisPart ;
   private int[] P02TW3_A2310DisCliDes ;
   private String[] P02TW3_A2009DisTipDis ;
   private boolean[] P02TW3_n2009DisTipDis ;
   private String[] P02TW3_A2835DisPle2 ;
   private String[] P02TW3_A2926DisPla ;
   private short[] P02TW3_A3127DisNumCor ;
   private short[] P02TW3_A3128DisAncSal1 ;
   private short[] P02TW3_A3129DisAncSal2 ;
   private short[] P02TW3_A3130DisAncSal3 ;
   private short[] P02TW3_A3131DisGraAca2 ;
   private short[] P02TW3_A3132DisGraCru2 ;
   private short[] P02TW3_A1906DisGraAca ;
   private java.math.BigDecimal[] P02TW3_A1907DisRdoN ;
   private java.math.BigDecimal[] P02TW3_A1908DisRdoA ;
   private String[] P02TW3_A4014DisTin ;
   private short[] P02TW3_A4468DisPelAnh ;
   private java.math.BigDecimal[] P02TW3_A4469DisCruMts ;
   private java.math.BigDecimal[] P02TW3_A4470DisCruKgs ;
   private String[] P02TW3_A4471DisCruEnr ;
   private short[] P02TW3_A4472DisLotPza ;
   private boolean[] P02TW3_n4472DisLotPza ;
   private java.math.BigDecimal[] P02TW3_A4473DisLotMts ;
   private java.math.BigDecimal[] P02TW3_A4474DisLotKgs ;
   private String[] P02TW3_A4475DisLotMaq ;
   private boolean[] P02TW3_n4475DisLotMaq ;
   private int[] P02TW3_A4476DisAcaFor ;
   private boolean[] P02TW3_n4476DisAcaFor ;
   private String[] P02TW3_A4477DisAcaBak ;
   private short[] P02TW3_A4478DisAcaAnh ;
   private String[] P02TW3_A4479DisAcaMar ;
   private short[] P02TW3_A2402DisManCod ;
   private short[] P02TW3_A3307DisManCod1 ;
   private short[] P02TW3_A3308DisManCod2 ;
   private String[] P02TW3_A4614DisMdlCod ;
   private String[] P02TW3_A4615DisTam ;
   private int[] P02TW3_A4293DisNPzas ;
   private boolean[] P02TW3_n4293DisNPzas ;
   private java.util.Date[] P02TW3_A4616DisHorEnt ;
   private boolean[] P02TW3_n4616DisHorEnt ;
   private String[] P02TW3_A4813DisEncCli ;
   private byte[] P02TW3_A5024DisTipEst ;
   private byte[] P02TW3_A5025DisGraCob ;
   private String[] P02TW3_A4720DisDishCod ;
   private String[] P02TW3_A5032DisEstTip ;
   private String[] P02TW3_A5252DisAcc ;
   private String[] P02TW3_A5290DisTipCor ;
   private String[] P02TW3_A5350DisObsAnc ;
   private String[] P02TW3_A5349DisObsGrm ;
   private String[] P02TW3_A5366DisAntp ;
   private String[] P02TW3_A5405DisAntpT ;
   private String[] P02TW3_A1052DisObs ;
   private short[] P02TW3_A374DisNumPie ;
   private java.util.Date[] P02TW3_A3627DisFecLan ;
   private boolean[] P02TW3_n3627DisFecLan ;
   private String[] P02TW3_A998DisNMtr ;
   private String[] P02TW3_A3309DisNumTon ;
   private int[] P02TW3_A361DisCod ;
   private int[] P02TW4_A44AlbRecCod ;
   private String[] P02TW4_A396EmprCod ;
   private int[] P02TW4_A361DisCod ;
   private int[] P02TW4_A673Piezas ;
   private String[] P02TW4_A55AlbRReo ;
   private int[] P02TW5_A361DisCod ;
   private String[] P02TW5_A396EmprCod ;
   private short[] P02TW5_A833TipDefCod ;
   private boolean[] P02TW5_n833TipDefCod ;
   private String[] P02TW8_A396EmprCod ;
   private int[] P02TW8_A361DisCod ;
   private java.math.BigDecimal[] P02TW8_A595Kilos ;
   private java.math.BigDecimal[] P02TW8_A631Metros ;
   private int[] P02TW8_A673Piezas ;
   private int[] P02TW8_A44AlbRecCod ;
   private String[] P02TW10_A396EmprCod ;
   private int[] P02TW10_A361DisCod ;
   private int[] P02TW10_A44AlbRecCod ;
   private int[] P02TW10_A673Piezas ;
   private String[] P02TW11_A396EmprCod ;
   private int[] P02TW11_A5206Nr_albrecc ;
   private boolean[] P02TW11_n5206Nr_albrecc ;
   private int[] P02TW11_A5198Nr_codigo ;
   private int[] P02TW11_A5906Nr_OpeCod ;
   private boolean[] P02TW11_n5906Nr_OpeCod ;
   private short[] P02TW11_A5904Nr_TipCsCL ;
   private boolean[] P02TW11_n5904Nr_TipCsCL ;
   private short[] P02TW13_A319DefPor ;
   private short[] P02TW13_A833TipDefCod ;
   private boolean[] P02TW13_n833TipDefCod ;
   private int[] P02TW13_A361DisCod ;
   private String[] P02TW13_A396EmprCod ;
   private short[] P02TW13_A387DisPiePie ;
   private boolean[] P02TW13_n387DisPiePie ;
   private String[] P02TW16_A602MaqCod ;
   private boolean[] P02TW16_n602MaqCod ;
   private short[] P02TW16_A6188MaqTArt ;
   private String[] P02TW16_A396EmprCod ;
   private java.math.BigDecimal[] P02TW16_A6190TipArtRb ;
   private boolean[] P02TW16_n6190TipArtRb ;
   private int[] P02TW16_A6233TipArtVmn ;
   private boolean[] P02TW16_n6233TipArtVmn ;
   private int[] P02TW16_A6234TipArtVmx ;
   private boolean[] P02TW16_n6234TipArtVmx ;
   private java.math.BigDecimal[] P02TW18_A595Kilos ;
   private java.math.BigDecimal[] P02TW19_A382DisPieKil ;
   private java.math.BigDecimal[] P02TW20_A631Metros ;
   private java.math.BigDecimal[] P02TW21_A384DisPieMet ;
   private int[] P02TW22_A673Piezas ;
}

final  class apsuu004__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02TW3", "SELECT T1.DisEst, COALESCE( T2.DisPiePie, 0) AS DisPiePie, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtCod, T1.CliCod, T1.EmprCod, T1.DisDes, T1.DisNumLot, T1.DisCliNum, T1.DisArtDsc, T1.DisArtTip, T1.DisFec, T1.DisNumUni, T1.DisUniMed, T1.DisFecCli, T1.DisVolMaq, T1.DisArtOpe, T1.DisArtUrg, T1.DisArtMat, T1.DisArtRdt, T1.DisArtTr1, T1.DisArtPt1, T1.DisArtTr2, T1.DisArtPt2, T1.DisArtTr3, T1.DisArtPt3, T1.DisArtUr1, T1.DisArtPu1, T1.DisArtUr2, T1.DisArtPu2, T1.DisArtUr3, T1.DisArtPu3, T1.DisArtAcb, T1.DisArtAc2, T1.DisArtAnh, T1.DisArtAn1, T1.DisArtPle, T1.DisArtLar, T1.DisArtSua, T1.DisArtAca, T1.DisArtCor, T1.DisArtEnc, T1.DisKgsLot, T1.DisMtrLot, T1.DibCli, T1.DibInt, T1.DisCom, T1.PriCod, T1.DisFecEnt, T1.DisArtPes, T1.DisGraCru, T1.DisNomCli, T1.DisNumCli, T1.DisEncCom, T1.DisEncAnh, T1.DisLoc, T1.DisPart, T1.DisCliDes, T1.DisTipDis, T1.DisPle2, T1.DisPla, T1.DisNumCor, T1.DisAncSal1, T1.DisAncSal2, T1.DisAncSal3, T1.DisGraAca2, T1.DisGraCru2, T1.DisGraAca, T1.DisRdoN, T1.DisRdoA, T1.DisTin, T1.DisPelAnh, T1.DisCruMts, T1.DisCruKgs, T1.DisCruEnr, T1.DisLotPza, T1.DisLotMts, T1.DisLotKgs, T1.DisLotMaq, T1.DisAcaFor, T1.DisAcaBak, T1.DisAcaAnh, T1.DisAcaMar, T1.DisManCod, T1.DisManCod1, T1.DisManCod2, T1.DisMdlCod, T1.DisTam, T1.DisNPzas, T1.DisHorEnt, T1.DisEncCli, T1.DisTipEst, T1.DisGraCob, T1.DisDishCod, T1.DisEstTip, T1.DisAcc, T1.DisTipCor, T1.DisObsAnc, T1.DisObsGrm, T1.DisAntp, T1.DisAntpT, T1.DisObs, T1.DisNumPie, T1.DisFecLan, T1.DisNMtr, T1.DisNumTon, T1.DisCod FROM (TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE (T1.EmprCod = ?) AND (T1.DisNumLot > 0) AND (T1.DisEst = 1) AND (T1.DisCod <= 324) ORDER BY T1.EmprCod, T1.DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02TW4", "SELECT T1.AlbRecCod, T1.EmprCod, T1.DisCod, T1.Piezas, T2.AlbRReo FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02TW5", "SELECT DisCod, EmprCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02TW6", "INSERT INTO TXPBARCAD(EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst, BarMaqCod, BarVolMaq, DisCod, BarDisNum, BarSer, BarTipArt, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarOpeEsp, BarUrg, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarSit, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarFecFpr, BarEstCol, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarLocDis, BarNMtr, BarPart, BarSerDsc, BarTipDis, BarCliDes, BarManCod, BarTipAca, BarGirar, BarCal, BarEntAca, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarManCod1, BarManCod2, BarNumTon, BarFoa, BarDibCli, BarDibInt, BarComULin, BarTin, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarNumReo, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp13, BarAcc, BarTipCor, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAudOpeN, BarAudSupN, BarPriTin, CliCod, DisDes, BarFecEnt, BarMaqPro, BarFecSal, BarDiaP, BarHorCum, BarEstRes, BarNumAso, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarPesBal, BarNMez, BarLisInd, BarNumTen, BarCodTN, BarExt, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarNMont, BarTemSec, BarObsVL, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, BarMaqGru, UltLinMaq, BarCoef, BarFac, BarMacCod, BarPeg, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarEnv, BarInci, BarBot, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarLoteA, BarBp12, BarBp14, BarBp15, BarFacAbs, BarCodBan, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P02TW7", "INSERT INTO TXPDISBAR(EmprCod, DisDisCod, DisBarCod, DisBarReo, DisBarPar, DisNumPda) VALUES(?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISBAR")
         ,new ForEachCursor("P02TW8", "SELECT EmprCod, DisCod, Kilos, Metros, Piezas, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02TW9", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarPiePie, BarPieLoc, BarPieIdPz, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPieAnc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P02TW10", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod, Piezas FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02TW11", "SELECT EmprCod, Nr_albrecc, Nr_codigo, Nr_OpeCod, Nr_TipCsCL FROM TXPNOTREC WHERE EmprCod = ? and Nr_albrecc = ? ORDER BY EmprCod, Nr_albrecc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02TW13", "SELECT T1.DefPor, T1.TipDefCod, T1.DisCod, T1.EmprCod, COALESCE( T2.DisPiePie, 0) AS DisPiePie FROM (TXPDISDEF T1 LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02TW14", "INSERT INTO TXPHISREO(EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod, HisTipArt, CliCod, HisBarSer, HisColNom, HisColNum, HisTipCol, HisNumPie, HisBarKgm, HisBarMtr, MaqCod, HisReoFec, HisKgmOri, HisMtrOri, HisOrdReo, HisEstReo, HisReoTn, HisReoDsc, CodCausa, Hisoperar, HisReoPza, TipCorCod, HisAcCo, HisAcCot, HisAdEAcCo, HisAdEAcCt, HisAdeSN, HisAdeObs, Rps_Cod, HisUsu, HisHorReo, HisNomCli, HisNumCli, HisOpecod, HisOpeTur, HisMtsCarg, HisMtsImp, HisreoLote) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
         ,new UpdateCursor("P02TW15", "UPDATE TXPDISPOS SET DisEst=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P02TW16", "SELECT MaqCod, MaqTArt, EmprCod, TipArtRb, TipArtVmn, TipArtVmx FROM TXPTARTM1 WHERE EmprCod = ? and MaqTArt = ? and MaqCod = ? ORDER BY EmprCod, MaqTArt, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02TW17", "UPDATE TXPLMACRO SET MacBarPar=' ', MacBarReo=0, MacBarCod=?  WHERE EmprCod = ? and MacDisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMACRO")
         ,new ForEachCursor("P02TW18", "SELECT SUM(Kilos) AS GXC4 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02TW19", "SELECT SUM(DisPieKil) AS GXC3 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02TW20", "SELECT SUM(Metros) AS GXC7 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02TW21", "SELECT SUM(DisPieMet) AS GXC6 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02TW22", "SELECT SUM(Piezas) AS GXC1 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((String[]) buf[14])[0] = rslt.getString(11, 8);
               ((String[]) buf[15])[0] = rslt.getString(12, 26);
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(14);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(17);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 2);
               ((byte[]) buf[23])[0] = rslt.getByte(20);
               ((String[]) buf[24])[0] = rslt.getString(21, 16);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[26])[0] = rslt.getString(23, 4);
               ((short[]) buf[27])[0] = rslt.getShort(24);
               ((String[]) buf[28])[0] = rslt.getString(25, 4);
               ((short[]) buf[29])[0] = rslt.getShort(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 4);
               ((short[]) buf[31])[0] = rslt.getShort(28);
               ((String[]) buf[32])[0] = rslt.getString(29, 4);
               ((short[]) buf[33])[0] = rslt.getShort(30);
               ((String[]) buf[34])[0] = rslt.getString(31, 4);
               ((short[]) buf[35])[0] = rslt.getShort(32);
               ((String[]) buf[36])[0] = rslt.getString(33, 4);
               ((short[]) buf[37])[0] = rslt.getShort(34);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(35);
               ((short[]) buf[40])[0] = rslt.getShort(36);
               ((short[]) buf[41])[0] = rslt.getShort(37);
               ((short[]) buf[42])[0] = rslt.getShort(38);
               ((String[]) buf[43])[0] = rslt.getString(39, 10);
               ((String[]) buf[44])[0] = rslt.getString(40, 10);
               ((String[]) buf[45])[0] = rslt.getString(41, 6);
               ((String[]) buf[46])[0] = rslt.getString(42, 6);
               ((String[]) buf[47])[0] = rslt.getString(43, 1);
               ((String[]) buf[48])[0] = rslt.getString(44, 1);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(45,2);
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(46,2);
               ((String[]) buf[51])[0] = rslt.getString(47, 16);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((int[]) buf[53])[0] = rslt.getInt(48);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(49, 12);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(50, 1);
               ((java.util.Date[]) buf[58])[0] = rslt.getGXDate(51);
               ((short[]) buf[59])[0] = rslt.getShort(52);
               ((short[]) buf[60])[0] = rslt.getShort(53);
               ((String[]) buf[61])[0] = rslt.getString(54, 13);
               ((int[]) buf[62])[0] = rslt.getInt(55);
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(56,2);
               ((java.math.BigDecimal[]) buf[64])[0] = rslt.getBigDecimal(57,2);
               ((String[]) buf[65])[0] = rslt.getString(58, 10);
               ((short[]) buf[66])[0] = rslt.getShort(59);
               ((int[]) buf[67])[0] = rslt.getInt(60);
               ((String[]) buf[68])[0] = rslt.getString(61, 1);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(62, 30);
               ((String[]) buf[71])[0] = rslt.getString(63, 1);
               ((short[]) buf[72])[0] = rslt.getShort(64);
               ((short[]) buf[73])[0] = rslt.getShort(65);
               ((short[]) buf[74])[0] = rslt.getShort(66);
               ((short[]) buf[75])[0] = rslt.getShort(67);
               ((short[]) buf[76])[0] = rslt.getShort(68);
               ((short[]) buf[77])[0] = rslt.getShort(69);
               ((short[]) buf[78])[0] = rslt.getShort(70);
               ((java.math.BigDecimal[]) buf[79])[0] = rslt.getBigDecimal(71,2);
               ((java.math.BigDecimal[]) buf[80])[0] = rslt.getBigDecimal(72,2);
               ((String[]) buf[81])[0] = rslt.getString(73, 1);
               ((short[]) buf[82])[0] = rslt.getShort(74);
               ((java.math.BigDecimal[]) buf[83])[0] = rslt.getBigDecimal(75,2);
               ((java.math.BigDecimal[]) buf[84])[0] = rslt.getBigDecimal(76,2);
               ((String[]) buf[85])[0] = rslt.getString(77, 1);
               ((short[]) buf[86])[0] = rslt.getShort(78);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[88])[0] = rslt.getBigDecimal(79,2);
               ((java.math.BigDecimal[]) buf[89])[0] = rslt.getBigDecimal(80,2);
               ((String[]) buf[90])[0] = rslt.getString(81, 6);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((int[]) buf[92])[0] = rslt.getInt(82);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getString(83, 1);
               ((short[]) buf[95])[0] = rslt.getShort(84);
               ((String[]) buf[96])[0] = rslt.getString(85, 1);
               ((short[]) buf[97])[0] = rslt.getShort(86);
               ((short[]) buf[98])[0] = rslt.getShort(87);
               ((short[]) buf[99])[0] = rslt.getShort(88);
               ((String[]) buf[100])[0] = rslt.getString(89, 13);
               ((String[]) buf[101])[0] = rslt.getString(90, 4);
               ((int[]) buf[102])[0] = rslt.getInt(91);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[104])[0] = GXutil.resetDate(rslt.getGXDateTime(92));
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(93, 20);
               ((byte[]) buf[107])[0] = rslt.getByte(94);
               ((byte[]) buf[108])[0] = rslt.getByte(95);
               ((String[]) buf[109])[0] = rslt.getString(96, 12);
               ((String[]) buf[110])[0] = rslt.getString(97, 1);
               ((String[]) buf[111])[0] = rslt.getString(98, 1);
               ((String[]) buf[112])[0] = rslt.getString(99, 2);
               ((String[]) buf[113])[0] = rslt.getString(100, 20);
               ((String[]) buf[114])[0] = rslt.getString(101, 20);
               ((String[]) buf[115])[0] = rslt.getString(102, 1);
               ((String[]) buf[116])[0] = rslt.getString(103, 1);
               ((String[]) buf[117])[0] = rslt.getString(104, 30);
               ((short[]) buf[118])[0] = rslt.getShort(105);
               ((java.util.Date[]) buf[119])[0] = rslt.getGXDate(106);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((String[]) buf[121])[0] = rslt.getString(107, 10);
               ((String[]) buf[122])[0] = rslt.getString(108, 10);
               ((int[]) buf[123])[0] = rslt.getInt(109);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 14 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 16 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 17 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 8);
               stmt.setString(10, (String)parms[9], 16);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[11]).shortValue());
               }
               stmt.setString(12, (String)parms[12], 13);
               stmt.setInt(13, ((Number) parms[13]).intValue());
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               stmt.setDate(15, (java.util.Date)parms[15]);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[16], 2);
               stmt.setString(17, (String)parms[17], 1);
               stmt.setByte(18, ((Number) parms[18]).byteValue());
               stmt.setDate(19, (java.util.Date)parms[19]);
               stmt.setShort(20, ((Number) parms[20]).shortValue());
               stmt.setByte(21, ((Number) parms[21]).byteValue());
               stmt.setByte(22, ((Number) parms[22]).byteValue());
               stmt.setByte(23, ((Number) parms[23]).byteValue());
               stmt.setString(24, (String)parms[24], 16);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[25], 2);
               stmt.setString(26, (String)parms[26], 4);
               stmt.setShort(27, ((Number) parms[27]).shortValue());
               stmt.setString(28, (String)parms[28], 4);
               stmt.setShort(29, ((Number) parms[29]).shortValue());
               stmt.setString(30, (String)parms[30], 4);
               stmt.setShort(31, ((Number) parms[31]).shortValue());
               stmt.setString(32, (String)parms[32], 4);
               stmt.setShort(33, ((Number) parms[33]).shortValue());
               stmt.setString(34, (String)parms[34], 4);
               stmt.setShort(35, ((Number) parms[35]).shortValue());
               stmt.setString(36, (String)parms[36], 4);
               stmt.setShort(37, ((Number) parms[37]).shortValue());
               stmt.setShort(38, ((Number) parms[38]).shortValue());
               stmt.setShort(39, ((Number) parms[39]).shortValue());
               stmt.setShort(40, ((Number) parms[40]).shortValue());
               stmt.setShort(41, ((Number) parms[41]).shortValue());
               stmt.setString(42, (String)parms[42], 10);
               stmt.setString(43, (String)parms[43], 10);
               stmt.setString(44, (String)parms[44], 6);
               stmt.setString(45, (String)parms[45], 6);
               stmt.setString(46, (String)parms[46], 1);
               stmt.setString(47, (String)parms[47], 1);
               stmt.setByte(48, ((Number) parms[48]).byteValue());
               stmt.setByte(49, ((Number) parms[49]).byteValue());
               stmt.setString(50, (String)parms[50], 1);
               stmt.setByte(51, ((Number) parms[51]).byteValue());
               stmt.setString(52, (String)parms[52], 1);
               stmt.setShort(53, ((Number) parms[53]).shortValue());
               stmt.setBigDecimal(54, (java.math.BigDecimal)parms[54], 2);
               stmt.setBigDecimal(55, (java.math.BigDecimal)parms[55], 2);
               stmt.setBigDecimal(56, (java.math.BigDecimal)parms[56], 2);
               stmt.setDate(57, (java.util.Date)parms[57]);
               stmt.setByte(58, ((Number) parms[58]).byteValue());
               stmt.setInt(59, ((Number) parms[59]).intValue());
               stmt.setByte(60, ((Number) parms[60]).byteValue());
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(61, ((Number) parms[62]).byteValue());
               }
               stmt.setShort(62, ((Number) parms[63]).shortValue());
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(63, ((Number) parms[65]).shortValue());
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.DATE );
               }
               else
               {
                  stmt.setDate(64, (java.util.Date)parms[67]);
               }
               stmt.setShort(65, ((Number) parms[68]).shortValue());
               stmt.setBigDecimal(66, (java.math.BigDecimal)parms[69], 2);
               stmt.setBigDecimal(67, (java.math.BigDecimal)parms[70], 2);
               stmt.setShort(68, ((Number) parms[71]).shortValue());
               stmt.setString(69, (String)parms[72], 13);
               stmt.setInt(70, ((Number) parms[73]).intValue());
               stmt.setString(71, (String)parms[74], 10);
               stmt.setString(72, (String)parms[75], 10);
               stmt.setShort(73, ((Number) parms[76]).shortValue());
               stmt.setString(74, (String)parms[77], 26);
               stmt.setString(75, (String)parms[78], 1);
               stmt.setInt(76, ((Number) parms[79]).intValue());
               stmt.setShort(77, ((Number) parms[80]).shortValue());
               stmt.setString(78, (String)parms[81], 1);
               stmt.setString(79, (String)parms[82], 20);
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(80, (String)parms[84], 20);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(81, (String)parms[86], 20);
               }
               stmt.setShort(82, ((Number) parms[87]).shortValue());
               stmt.setBigDecimal(83, (java.math.BigDecimal)parms[88], 2);
               stmt.setBigDecimal(84, (java.math.BigDecimal)parms[89], 2);
               stmt.setString(85, (String)parms[90], 1);
               stmt.setString(86, (String)parms[91], 1);
               stmt.setString(87, (String)parms[92], 1);
               stmt.setString(88, (String)parms[93], 1);
               stmt.setInt(89, ((Number) parms[94]).intValue());
               stmt.setBigDecimal(90, (java.math.BigDecimal)parms[95], 2);
               stmt.setBigDecimal(91, (java.math.BigDecimal)parms[96], 2);
               stmt.setString(92, (String)parms[97], 8);
               stmt.setByte(93, ((Number) parms[98]).byteValue());
               stmt.setString(94, (String)parms[99], 1);
               stmt.setString(95, (String)parms[100], 30);
               stmt.setShort(96, ((Number) parms[101]).shortValue());
               stmt.setShort(97, ((Number) parms[102]).shortValue());
               stmt.setShort(98, ((Number) parms[103]).shortValue());
               stmt.setShort(99, ((Number) parms[104]).shortValue());
               stmt.setShort(100, ((Number) parms[105]).shortValue());
               stmt.setShort(101, ((Number) parms[106]).shortValue());
               stmt.setShort(102, ((Number) parms[107]).shortValue());
               stmt.setShort(103, ((Number) parms[108]).shortValue());
               stmt.setString(104, (String)parms[109], 10);
               stmt.setString(105, (String)parms[110], 1);
               stmt.setString(106, (String)parms[111], 16);
               stmt.setInt(107, ((Number) parms[112]).intValue());
               if ( ((Boolean) parms[113]).booleanValue() )
               {
                  stmt.setNull( 108 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(108, ((Number) parms[114]).byteValue());
               }
               stmt.setString(109, (String)parms[115], 1);
               stmt.setByte(110, ((Number) parms[116]).byteValue());
               stmt.setShort(111, ((Number) parms[117]).shortValue());
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 112 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(112, (java.math.BigDecimal)parms[119], 2);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 113 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(113, (java.math.BigDecimal)parms[121], 2);
               }
               stmt.setString(114, (String)parms[122], 1);
               if ( ((Boolean) parms[123]).booleanValue() )
               {
                  stmt.setNull( 115 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(115, ((Number) parms[124]).shortValue());
               }
               stmt.setBigDecimal(116, (java.math.BigDecimal)parms[125], 2);
               stmt.setBigDecimal(117, (java.math.BigDecimal)parms[126], 2);
               if ( ((Boolean) parms[127]).booleanValue() )
               {
                  stmt.setNull( 118 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(118, (String)parms[128], 6);
               }
               if ( ((Boolean) parms[129]).booleanValue() )
               {
                  stmt.setNull( 119 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(119, ((Number) parms[130]).intValue());
               }
               if ( ((Boolean) parms[131]).booleanValue() )
               {
                  stmt.setNull( 120 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(120, (String)parms[132], 1);
               }
               stmt.setShort(121, ((Number) parms[133]).shortValue());
               stmt.setString(122, (String)parms[134], 1);
               stmt.setString(123, (String)parms[135], 13);
               stmt.setString(124, (String)parms[136], 4);
               if ( ((Boolean) parms[137]).booleanValue() )
               {
                  stmt.setNull( 125 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(125, (java.util.Date)parms[138], true);
               }
               if ( ((Boolean) parms[139]).booleanValue() )
               {
                  stmt.setNull( 126 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(126, ((Number) parms[140]).intValue());
               }
               if ( ((Boolean) parms[141]).booleanValue() )
               {
                  stmt.setNull( 127 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(127, (java.util.Date)parms[142], true);
               }
               stmt.setString(128, (String)parms[143], 12);
               stmt.setString(129, (String)parms[144], 20);
               stmt.setShort(130, ((Number) parms[145]).shortValue());
               stmt.setByte(131, ((Number) parms[146]).byteValue());
               stmt.setByte(132, ((Number) parms[147]).byteValue());
               stmt.setString(133, (String)parms[148], 12);
               stmt.setString(134, (String)parms[149], 1);
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 135 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(135, ((Number) parms[151]).shortValue());
               }
               stmt.setString(136, (String)parms[152], 1);
               stmt.setString(137, (String)parms[153], 2);
               stmt.setString(138, (String)parms[154], 20);
               stmt.setString(139, (String)parms[155], 20);
               stmt.setString(140, (String)parms[156], 1);
               stmt.setString(141, (String)parms[157], 1);
               if ( ((Boolean) parms[158]).booleanValue() )
               {
                  stmt.setNull( 142 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(142, (String)parms[159], 30);
               }
               if ( ((Boolean) parms[160]).booleanValue() )
               {
                  stmt.setNull( 143 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(143, (String)parms[161], 30);
               }
               stmt.setByte(144, ((Number) parms[162]).byteValue());
               if ( ((Boolean) parms[163]).booleanValue() )
               {
                  stmt.setNull( 145 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(145, ((Number) parms[164]).intValue());
               }
               stmt.setString(146, (String)parms[165], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[11], 10);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[13], 15);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 16);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 13);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[25], 6);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DATE );
               }
               else
               {
                  stmt.setDate(16, (java.util.Date)parms[27]);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[35]).byteValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(21, ((Number) parms[37]).intValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[39], 26);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[43]).intValue());
               }
               return;
            case 11 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

