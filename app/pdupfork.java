package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdupfork extends GXProcedure
{
   public pdupfork( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdupfork.class ), "" );
   }

   public pdupfork( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           byte[] aP5 ,
                           int[] aP6 ,
                           String[] aP7 ,
                           String[] aP8 ,
                           int[] aP9 ,
                           byte[] aP10 ,
                           String[] aP11 ,
                           int[] aP12 )
   {
      pdupfork.this.aP13 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        int[] aP9 ,
                        byte[] aP10 ,
                        String[] aP11 ,
                        int[] aP12 ,
                        byte[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 ,
                             int[] aP12 ,
                             byte[] aP13 )
   {
      pdupfork.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdupfork.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pdupfork.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pdupfork.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pdupfork.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pdupfork.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pdupfork.this.AV15CliCod = aP6[0];
      this.aP6 = aP6;
      pdupfork.this.AV16ForSer = aP7[0];
      this.aP7 = aP7;
      pdupfork.this.AV17ForColNom = aP8[0];
      this.aP8 = aP8;
      pdupfork.this.AV18ForColNum = aP9[0];
      this.aP9 = aP9;
      pdupfork.this.AV19TipColCod = aP10[0];
      this.aP10 = aP10;
      pdupfork.this.AV61ForNomCli = aP11[0];
      this.aP11 = aP11;
      pdupfork.this.AV62ForNumCli = aP12[0];
      this.aP12 = aP12;
      pdupfork.this.AV20Flag = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV55Usurcod = " " ;
      GXt_char1 = AV56Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pdupfork.this.GXt_char1 = GXv_char2[0] ;
      AV56Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV57EmprNom ;
      GXv_char4[0] = AV55Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV56Station, GXv_char2, GXv_char3, GXv_char4) ;
      pdupfork.this.A396EmprCod = GXv_char2[0] ;
      pdupfork.this.AV57EmprNom = GXv_char3[0] ;
      pdupfork.this.AV55Usurcod = GXv_char4[0] ;
      AV39Pervaf = (byte)(0) ;
      GXv_int5[0] = AV39Pervaf ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int5) ;
      pdupfork.this.AV39Pervaf = GXv_int5[0] ;
      AV46F_tintutex = (byte)(0) ;
      GXv_int5[0] = AV46F_tintutex ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int5) ;
      pdupfork.this.AV46F_tintutex = GXv_int5[0] ;
      AV49Obs_equiv = (byte)(0) ;
      GXv_int5[0] = AV49Obs_equiv ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "OBFOEQ", ""), GXv_int5) ;
      pdupfork.this.AV49Obs_equiv = GXv_int5[0] ;
      GXt_int6 = AV52Moda21 ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int5) ;
      pdupfork.this.GXt_int6 = GXv_int5[0] ;
      AV52Moda21 = GXt_int6 ;
      GXt_int6 = AV63Kohler ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KOHLER", ""), GXv_int5) ;
      pdupfork.this.GXt_int6 = GXv_int5[0] ;
      AV63Kohler = GXt_int6 ;
      GXt_int6 = AV68Lindalana ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int5) ;
      pdupfork.this.GXt_int6 = GXv_int5[0] ;
      AV68Lindalana = GXt_int6 ;
      GXt_int6 = AV69Carvema ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int5) ;
      pdupfork.this.GXt_int6 = GXv_int5[0] ;
      AV69Carvema = GXt_int6 ;
      GXt_int6 = AV70eldorado ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DORADO", ""), GXv_int5) ;
      pdupfork.this.GXt_int6 = GXv_int5[0] ;
      AV70eldorado = GXt_int6 ;
      GXt_int6 = AV71carvitin ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int5) ;
      pdupfork.this.GXt_int6 = GXv_int5[0] ;
      AV71carvitin = GXt_int6 ;
      GXt_int6 = (byte)(AV72ContForfec) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIFFEC", ""), GXv_int5) ;
      pdupfork.this.GXt_int6 = GXv_int5[0] ;
      AV72ContForfec = GXt_int6 ;
      if ( AV20Flag == 0 )
      {
         GXv_int7[0] = AV21ForNumCol ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "030300", GXv_int7) ;
         pdupfork.this.AV21ForNumCol = GXv_int7[0] ;
      }
      /* Using cursor P02DG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13911ForSerDsc2 = P02DG2_A13911ForSerDsc2[0] ;
         n13911ForSerDsc2 = P02DG2_n13911ForSerDsc2[0] ;
         A12401ForKgMn = P02DG2_A12401ForKgMn[0] ;
         n12401ForKgMn = P02DG2_n12401ForKgMn[0] ;
         A12400ForTRabs = P02DG2_A12400ForTRabs[0] ;
         n12400ForTRabs = P02DG2_n12400ForTRabs[0] ;
         A12399ForMT = P02DG2_A12399ForMT[0] ;
         n12399ForMT = P02DG2_n12399ForMT[0] ;
         A8561Fam_Cod = P02DG2_A8561Fam_Cod[0] ;
         n8561Fam_Cod = P02DG2_n8561Fam_Cod[0] ;
         A7781ForBlo = P02DG2_A7781ForBlo[0] ;
         n7781ForBlo = P02DG2_n7781ForBlo[0] ;
         A7537ForOpNum = P02DG2_A7537ForOpNum[0] ;
         n7537ForOpNum = P02DG2_n7537ForOpNum[0] ;
         A6609ForFecCre = P02DG2_A6609ForFecCre[0] ;
         n6609ForFecCre = P02DG2_n6609ForFecCre[0] ;
         A6608ForUsrCre = P02DG2_A6608ForUsrCre[0] ;
         n6608ForUsrCre = P02DG2_n6608ForUsrCre[0] ;
         A5742ForSerDsc = P02DG2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P02DG2_n5742ForSerDsc[0] ;
         A5625ForFecHor = P02DG2_A5625ForFecHor[0] ;
         n5625ForFecHor = P02DG2_n5625ForFecHor[0] ;
         A5624ForUsrCod = P02DG2_A5624ForUsrCod[0] ;
         n5624ForUsrCod = P02DG2_n5624ForUsrCod[0] ;
         A4384ForTipArt = P02DG2_A4384ForTipArt[0] ;
         n4384ForTipArt = P02DG2_n4384ForTipArt[0] ;
         A4380ForCosForm = P02DG2_A4380ForCosForm[0] ;
         n4380ForCosForm = P02DG2_n4380ForCosForm[0] ;
         A3560ForOpcCli = P02DG2_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P02DG2_n3560ForOpcCli[0] ;
         A3558ForFecApr = P02DG2_A3558ForFecApr[0] ;
         n3558ForFecApr = P02DG2_n3558ForFecApr[0] ;
         A3315ForNumArc = P02DG2_A3315ForNumArc[0] ;
         n3315ForNumArc = P02DG2_n3315ForNumArc[0] ;
         A1192ForNumCli = P02DG2_A1192ForNumCli[0] ;
         n1192ForNumCli = P02DG2_n1192ForNumCli[0] ;
         A1191ForNomCli = P02DG2_A1191ForNomCli[0] ;
         n1191ForNomCli = P02DG2_n1191ForNomCli[0] ;
         A491ForPreDef = P02DG2_A491ForPreDef[0] ;
         n491ForPreDef = P02DG2_n491ForPreDef[0] ;
         A493ForPreMtr = P02DG2_A493ForPreMtr[0] ;
         n493ForPreMtr = P02DG2_n493ForPreMtr[0] ;
         A492ForPreKgm = P02DG2_A492ForPreKgm[0] ;
         n492ForPreKgm = P02DG2_n492ForPreKgm[0] ;
         A496ForUltUti = P02DG2_A496ForUltUti[0] ;
         n496ForUltUti = P02DG2_n496ForUltUti[0] ;
         A486ForNumCol = P02DG2_A486ForNumCol[0] ;
         A13913ForPlanta = P02DG2_A13913ForPlanta[0] ;
         n13913ForPlanta = P02DG2_n13913ForPlanta[0] ;
         A13912ForAlterna = P02DG2_A13912ForAlterna[0] ;
         n13912ForAlterna = P02DG2_n13912ForAlterna[0] ;
         A13102ForLbTalao = P02DG2_A13102ForLbTalao[0] ;
         n13102ForLbTalao = P02DG2_n13102ForLbTalao[0] ;
         A12732ForObsFac = P02DG2_A12732ForObsFac[0] ;
         n12732ForObsFac = P02DG2_n12732ForObsFac[0] ;
         A12404ForLotHil3 = P02DG2_A12404ForLotHil3[0] ;
         n12404ForLotHil3 = P02DG2_n12404ForLotHil3[0] ;
         A12403ForLotHil2 = P02DG2_A12403ForLotHil2[0] ;
         n12403ForLotHil2 = P02DG2_n12403ForLotHil2[0] ;
         A12200ForCurva = P02DG2_A12200ForCurva[0] ;
         n12200ForCurva = P02DG2_n12200ForCurva[0] ;
         A12130ForPanto = P02DG2_A12130ForPanto[0] ;
         n12130ForPanto = P02DG2_n12130ForPanto[0] ;
         A11706ForObs2 = P02DG2_A11706ForObs2[0] ;
         n11706ForObs2 = P02DG2_n11706ForObs2[0] ;
         A11705For_item2 = P02DG2_A11705For_item2[0] ;
         n11705For_item2 = P02DG2_n11705For_item2[0] ;
         A3587ForFecAnt = P02DG2_A3587ForFecAnt[0] ;
         n3587ForFecAnt = P02DG2_n3587ForFecAnt[0] ;
         A3586ForPreAnt = P02DG2_A3586ForPreAnt[0] ;
         n3586ForPreAnt = P02DG2_n3586ForPreAnt[0] ;
         A3585ForPreFec = P02DG2_A3585ForPreFec[0] ;
         n3585ForPreFec = P02DG2_n3585ForPreFec[0] ;
         A3569UltEnsCod = P02DG2_A3569UltEnsCod[0] ;
         n3569UltEnsCod = P02DG2_n3569UltEnsCod[0] ;
         A4226ForCosTTi = P02DG2_A4226ForCosTTi[0] ;
         n4226ForCosTTi = P02DG2_n4226ForCosTTi[0] ;
         A4225ForKgTTin = P02DG2_A4225ForKgTTin[0] ;
         n4225ForKgTTin = P02DG2_n4225ForKgTTin[0] ;
         A4224ForKgUTin = P02DG2_A4224ForKgUTin[0] ;
         n4224ForKgUTin = P02DG2_n4224ForKgUTin[0] ;
         A11290ForCosFin = P02DG2_A11290ForCosFin[0] ;
         n11290ForCosFin = P02DG2_n11290ForCosFin[0] ;
         A11280ForCosFab = P02DG2_A11280ForCosFab[0] ;
         n11280ForCosFab = P02DG2_n11280ForCosFab[0] ;
         A11279ForcosH20 = P02DG2_A11279ForcosH20[0] ;
         n11279ForcosH20 = P02DG2_n11279ForcosH20[0] ;
         A11042ForFecCtrf = P02DG2_A11042ForFecCtrf[0] ;
         n11042ForFecCtrf = P02DG2_n11042ForFecCtrf[0] ;
         A11041ForFecCtrl = P02DG2_A11041ForFecCtrl[0] ;
         n11041ForFecCtrl = P02DG2_n11041ForFecCtrl[0] ;
         A9792For_Reo = P02DG2_A9792For_Reo[0] ;
         n9792For_Reo = P02DG2_n9792For_Reo[0] ;
         A9621Lb_CodC = P02DG2_A9621Lb_CodC[0] ;
         n9621Lb_CodC = P02DG2_n9621Lb_CodC[0] ;
         A9619Lb_CodL = P02DG2_A9619Lb_CodL[0] ;
         n9619Lb_CodL = P02DG2_n9619Lb_CodL[0] ;
         A8777For_item1 = P02DG2_A8777For_item1[0] ;
         n8777For_item1 = P02DG2_n8777For_item1[0] ;
         A8043ForTipT = P02DG2_A8043ForTipT[0] ;
         n8043ForTipT = P02DG2_n8043ForTipT[0] ;
         A7796Sim_Ulin = P02DG2_A7796Sim_Ulin[0] ;
         n7796Sim_Ulin = P02DG2_n7796Sim_Ulin[0] ;
         A7029ForNomCli3 = P02DG2_A7029ForNomCli3[0] ;
         n7029ForNomCli3 = P02DG2_n7029ForNomCli3[0] ;
         A6379ForNomCli2 = P02DG2_A6379ForNomCli2[0] ;
         n6379ForNomCli2 = P02DG2_n6379ForNomCli2[0] ;
         A5653ForPInc = P02DG2_A5653ForPInc[0] ;
         n5653ForPInc = P02DG2_n5653ForPInc[0] ;
         A5626ForObsM = P02DG2_A5626ForObsM[0] ;
         n5626ForObsM = P02DG2_n5626ForObsM[0] ;
         A5362IntCodF = P02DG2_A5362IntCodF[0] ;
         n5362IntCodF = P02DG2_n5362IntCodF[0] ;
         A5337ForCodExt = P02DG2_A5337ForCodExt[0] ;
         n5337ForCodExt = P02DG2_n5337ForCodExt[0] ;
         A4339ForRGB = P02DG2_A4339ForRGB[0] ;
         n4339ForRGB = P02DG2_n4339ForRGB[0] ;
         A4223ForCosUti = P02DG2_A4223ForCosUti[0] ;
         n4223ForCosUti = P02DG2_n4223ForCosUti[0] ;
         A1514MacProCod = P02DG2_A1514MacProCod[0] ;
         n1514MacProCod = P02DG2_n1514MacProCod[0] ;
         A3688ComUltLin = P02DG2_A3688ComUltLin[0] ;
         n3688ComUltLin = P02DG2_n3688ComUltLin[0] ;
         A3588ForEst = P02DG2_A3588ForEst[0] ;
         n3588ForEst = P02DG2_n3588ForEst[0] ;
         A3559ForSitCom = P02DG2_A3559ForSitCom[0] ;
         n3559ForSitCom = P02DG2_n3559ForSitCom[0] ;
         A3316CodSol = P02DG2_A3316CodSol[0] ;
         n3316CodSol = P02DG2_n3316CodSol[0] ;
         A995ForTonal = P02DG2_A995ForTonal[0] ;
         n995ForTonal = P02DG2_n995ForTonal[0] ;
         A3008PrecioM = P02DG2_A3008PrecioM[0] ;
         n3008PrecioM = P02DG2_n3008PrecioM[0] ;
         A3007PrecioA = P02DG2_A3007PrecioA[0] ;
         n3007PrecioA = P02DG2_n3007PrecioA[0] ;
         A2838ForRelBan = P02DG2_A2838ForRelBan[0] ;
         n2838ForRelBan = P02DG2_n2838ForRelBan[0] ;
         A2749ForPro = P02DG2_A2749ForPro[0] ;
         n2749ForPro = P02DG2_n2749ForPro[0] ;
         A1518RecCorULin = P02DG2_A1518RecCorULin[0] ;
         n1518RecCorULin = P02DG2_n1518RecCorULin[0] ;
         A1159ForUltLin = P02DG2_A1159ForUltLin[0] ;
         n1159ForUltLin = P02DG2_n1159ForUltLin[0] ;
         A651ObsUltLin = P02DG2_A651ObsUltLin[0] ;
         n651ObsUltLin = P02DG2_n651ObsUltLin[0] ;
         A484ForCon = P02DG2_A484ForCon[0] ;
         A626MatCod = P02DG2_A626MatCod[0] ;
         A583IntCod = P02DG2_A583IntCod[0] ;
         A495ForUltMod = P02DG2_A495ForUltMod[0] ;
         n495ForUltMod = P02DG2_n495ForUltMod[0] ;
         A485ForFec = P02DG2_A485ForFec[0] ;
         n485ForFec = P02DG2_n485ForFec[0] ;
         A130BarCodPar = P02DG2_A130BarCodPar[0] ;
         n130BarCodPar = P02DG2_n130BarCodPar[0] ;
         A132BarCodReo = P02DG2_A132BarCodReo[0] ;
         n132BarCodReo = P02DG2_n132BarCodReo[0] ;
         A129BarCod = P02DG2_A129BarCod[0] ;
         n129BarCod = P02DG2_n129BarCod[0] ;
         W252CliCod = A252CliCod ;
         W494ForSer = A494ForSer ;
         W482ForColNom = A482ForColNom ;
         W483ForColNum = A483ForColNum ;
         W831TipColCod = A831TipColCod ;
         AV47CliCod_or = A252CliCod ;
         AV22NumCol = A486ForNumCol ;
         AV50ForPreKgm = A492ForPreKgm ;
         AV51ForPreMtr = A493ForPreMtr ;
         AV53ForPreDef = A491ForPreDef ;
         AV64ForRgb = A4339ForRGB ;
         AV65Fam_cod = A8561Fam_Cod ;
         AV66ForBlo = A7781ForBlo ;
         AV67Forcosform = A4380ForCosForm ;
         GXt_char1 = AV58ForSerDsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfartdsc(remoteHandle, context).execute( A396EmprCod, AV15CliCod, AV16ForSer, GXv_char4) ;
         pdupfork.this.GXt_char1 = GXv_char4[0] ;
         AV58ForSerDsc = GXt_char1 ;
         GXt_int8 = AV74Fortipart ;
         GXv_int9[0] = GXt_int8 ;
         new app.formulaciontinte.fortipart(remoteHandle, context).execute( A396EmprCod, AV15CliCod, AV16ForSer, GXv_int9) ;
         pdupfork.this.GXt_int8 = GXv_int9[0] ;
         AV74Fortipart = GXt_int8 ;
         /*
            INSERT RECORD ON TABLE TXPCFORMU

         */
         W252CliCod = A252CliCod ;
         W494ForSer = A494ForSer ;
         W482ForColNom = A482ForColNom ;
         W483ForColNum = A483ForColNum ;
         W831TipColCod = A831TipColCod ;
         W486ForNumCol = A486ForNumCol ;
         W486ForNumCol = A486ForNumCol ;
         W496ForUltUti = A496ForUltUti ;
         n496ForUltUti = false ;
         W492ForPreKgm = A492ForPreKgm ;
         n492ForPreKgm = false ;
         W493ForPreMtr = A493ForPreMtr ;
         n493ForPreMtr = false ;
         W491ForPreDef = A491ForPreDef ;
         n491ForPreDef = false ;
         W492ForPreKgm = A492ForPreKgm ;
         n492ForPreKgm = false ;
         W493ForPreMtr = A493ForPreMtr ;
         n493ForPreMtr = false ;
         W491ForPreDef = A491ForPreDef ;
         n491ForPreDef = false ;
         W492ForPreKgm = A492ForPreKgm ;
         n492ForPreKgm = false ;
         W493ForPreMtr = A493ForPreMtr ;
         n493ForPreMtr = false ;
         W491ForPreDef = A491ForPreDef ;
         n491ForPreDef = false ;
         W492ForPreKgm = A492ForPreKgm ;
         n492ForPreKgm = false ;
         W493ForPreMtr = A493ForPreMtr ;
         n493ForPreMtr = false ;
         W491ForPreDef = A491ForPreDef ;
         n491ForPreDef = false ;
         W492ForPreKgm = A492ForPreKgm ;
         n492ForPreKgm = false ;
         W493ForPreMtr = A493ForPreMtr ;
         n493ForPreMtr = false ;
         W5742ForSerDsc = A5742ForSerDsc ;
         n5742ForSerDsc = false ;
         W1191ForNomCli = A1191ForNomCli ;
         n1191ForNomCli = false ;
         W1192ForNumCli = A1192ForNumCli ;
         n1192ForNumCli = false ;
         W8561Fam_Cod = A8561Fam_Cod ;
         n8561Fam_Cod = false ;
         W7781ForBlo = A7781ForBlo ;
         n7781ForBlo = false ;
         W7781ForBlo = A7781ForBlo ;
         n7781ForBlo = false ;
         W7781ForBlo = A7781ForBlo ;
         n7781ForBlo = false ;
         W4380ForCosForm = A4380ForCosForm ;
         n4380ForCosForm = false ;
         W3315ForNumArc = A3315ForNumArc ;
         n3315ForNumArc = false ;
         W3560ForOpcCli = A3560ForOpcCli ;
         n3560ForOpcCli = false ;
         W7537ForOpNum = A7537ForOpNum ;
         n7537ForOpNum = false ;
         W3558ForFecApr = A3558ForFecApr ;
         n3558ForFecApr = false ;
         W3558ForFecApr = A3558ForFecApr ;
         n3558ForFecApr = false ;
         W7537ForOpNum = A7537ForOpNum ;
         n7537ForOpNum = false ;
         W3560ForOpcCli = A3560ForOpcCli ;
         n3560ForOpcCli = false ;
         W12399ForMT = A12399ForMT ;
         n12399ForMT = false ;
         W12400ForTRabs = A12400ForTRabs ;
         n12400ForTRabs = false ;
         W12401ForKgMn = A12401ForKgMn ;
         n12401ForKgMn = false ;
         W7029ForNomCli3 = A7029ForNomCli3 ;
         n7029ForNomCli3 = false ;
         W995ForTonal = A995ForTonal ;
         n995ForTonal = false ;
         W485ForFec = A485ForFec ;
         n485ForFec = false ;
         W5624ForUsrCod = A5624ForUsrCod ;
         n5624ForUsrCod = false ;
         W5625ForFecHor = A5625ForFecHor ;
         n5625ForFecHor = false ;
         W6608ForUsrCre = A6608ForUsrCre ;
         n6608ForUsrCre = false ;
         W6609ForFecCre = A6609ForFecCre ;
         n6609ForFecCre = false ;
         W13911ForSerDsc2 = A13911ForSerDsc2 ;
         n13911ForSerDsc2 = false ;
         W4384ForTipArt = A4384ForTipArt ;
         n4384ForTipArt = false ;
         A252CliCod = AV15CliCod ;
         A494ForSer = AV16ForSer ;
         A482ForColNom = AV17ForColNom ;
         A483ForColNum = AV18ForColNum ;
         A831TipColCod = AV19TipColCod ;
         if ( AV20Flag == 0 )
         {
            A486ForNumCol = AV21ForNumCol ;
         }
         else
         {
            A486ForNumCol = AV22NumCol ;
         }
         A496ForUltUti = GXutil.nullDate() ;
         n496ForUltUti = false ;
         if ( AV46F_tintutex == 0 )
         {
            A492ForPreKgm = DecimalUtil.doubleToDec(0) ;
            n492ForPreKgm = false ;
            A493ForPreMtr = DecimalUtil.doubleToDec(0) ;
            n493ForPreMtr = false ;
            A491ForPreDef = httpContext.getMessage( "N", "") ;
            n491ForPreDef = false ;
         }
         else
         {
            if ( AV47CliCod_or != AV15CliCod )
            {
               A492ForPreKgm = DecimalUtil.doubleToDec(0) ;
               n492ForPreKgm = false ;
               A493ForPreMtr = DecimalUtil.doubleToDec(0) ;
               n493ForPreMtr = false ;
               A491ForPreDef = httpContext.getMessage( "N", "") ;
               n491ForPreDef = false ;
            }
         }
         if ( AV20Flag == 1 )
         {
            A492ForPreKgm = AV50ForPreKgm ;
            n492ForPreKgm = false ;
            A493ForPreMtr = AV51ForPreMtr ;
            n493ForPreMtr = false ;
            A491ForPreDef = AV53ForPreDef ;
            n491ForPreDef = false ;
         }
         if ( AV71carvitin == 1 )
         {
            A492ForPreKgm = AV50ForPreKgm ;
            n492ForPreKgm = false ;
            A493ForPreMtr = AV51ForPreMtr ;
            n493ForPreMtr = false ;
            A491ForPreDef = AV53ForPreDef ;
            n491ForPreDef = false ;
         }
         if ( ( AV47CliCod_or != AV15CliCod ) && ( AV52Moda21 == 1 ) )
         {
            A492ForPreKgm = DecimalUtil.doubleToDec(0) ;
            n492ForPreKgm = false ;
            A493ForPreMtr = DecimalUtil.doubleToDec(0) ;
            n493ForPreMtr = false ;
         }
         A5742ForSerDsc = AV58ForSerDsc ;
         n5742ForSerDsc = false ;
         A1191ForNomCli = AV61ForNomCli ;
         n1191ForNomCli = false ;
         A1192ForNumCli = AV62ForNumCli ;
         n1192ForNumCli = false ;
         A8561Fam_Cod = AV65Fam_cod ;
         n8561Fam_Cod = false ;
         if ( AV52Moda21 == 1 )
         {
            A7781ForBlo = ((AV20Flag==1) ? "N" : AV66ForBlo) ;
            n7781ForBlo = false ;
         }
         else
         {
            if ( AV68Lindalana == 0 )
            {
               A7781ForBlo = AV66ForBlo ;
               n7781ForBlo = false ;
            }
            else
            {
               A7781ForBlo = "N" ;
               n7781ForBlo = false ;
            }
         }
         A4380ForCosForm = AV67Forcosform ;
         n4380ForCosForm = false ;
         if ( ( AV20Flag == 0 ) && ( AV69Carvema == 0 ) && ( AV46F_tintutex == 0 ) )
         {
            A3315ForNumArc = 0 ;
            n3315ForNumArc = false ;
            A3560ForOpcCli = "" ;
            n3560ForOpcCli = false ;
            A7537ForOpNum = (byte)(0) ;
            n7537ForOpNum = false ;
            A3558ForFecApr = GXutil.nullDate() ;
            n3558ForFecApr = false ;
         }
         if ( AV46F_tintutex == 1 )
         {
            n3558ForFecApr = false ;
            n7537ForOpNum = false ;
            n3560ForOpcCli = false ;
         }
         A12399ForMT = (byte)(1) ;
         n12399ForMT = false ;
         A12400ForTRabs = (byte)(0) ;
         n12400ForTRabs = false ;
         A12401ForKgMn = DecimalUtil.doubleToDec(0) ;
         n12401ForKgMn = false ;
         GXt_char1 = A7029ForNomCli3 ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A252CliCod ;
         GXv_char3[0] = A494ForSer ;
         GXv_char2[0] = GXt_char1 ;
         new app.pfarttr(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_char2) ;
         pdupfork.this.A396EmprCod = GXv_char4[0] ;
         pdupfork.this.A252CliCod = GXv_int7[0] ;
         pdupfork.this.A494ForSer = GXv_char3[0] ;
         pdupfork.this.GXt_char1 = GXv_char2[0] ;
         A7029ForNomCli3 = ((AV69Carvema==1) ? GXt_char1 : A7029ForNomCli3) ;
         n7029ForNomCli3 = false ;
         A995ForTonal = ((AV70eldorado==1) ? " " : A995ForTonal) ;
         n995ForTonal = false ;
         A485ForFec = ((AV72ContForfec==0) ? A485ForFec : GXutil.today( )) ;
         n485ForFec = false ;
         A5624ForUsrCod = " " ;
         n5624ForUsrCod = false ;
         A5625ForFecHor = GXutil.resetTime( GXutil.nullDate() );
         n5625ForFecHor = false ;
         A6608ForUsrCre = AV55Usurcod ;
         n6608ForUsrCre = false ;
         A6609ForFecCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n6609ForFecCre = false ;
         A13911ForSerDsc2 = AV73ForSerDsc2 ;
         n13911ForSerDsc2 = false ;
         A4384ForTipArt = AV74Fortipart ;
         n4384ForTipArt = false ;
         /* Using cursor P02DG3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Integer.valueOf(A486ForNumCol), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n485ForFec), A485ForFec, Boolean.valueOf(n495ForUltMod), A495ForUltMod, Byte.valueOf(A583IntCod), Short.valueOf(A626MatCod), Boolean.valueOf(n496ForUltUti), A496ForUltUti, Boolean.valueOf(n492ForPreKgm), A492ForPreKgm, Boolean.valueOf(n493ForPreMtr), A493ForPreMtr, Boolean.valueOf(n491ForPreDef), A491ForPreDef, Byte.valueOf(A484ForCon), Boolean.valueOf(n651ObsUltLin), Short.valueOf(A651ObsUltLin), Boolean.valueOf(n1159ForUltLin), Short.valueOf(A1159ForUltLin), Boolean.valueOf(n1191ForNomCli), A1191ForNomCli, Boolean.valueOf(n1192ForNumCli), Integer.valueOf(A1192ForNumCli), Boolean.valueOf(n1518RecCorULin), Byte.valueOf(A1518RecCorULin), Boolean.valueOf(n2749ForPro), A2749ForPro, Boolean.valueOf(n2838ForRelBan), A2838ForRelBan, Boolean.valueOf(n3007PrecioA), A3007PrecioA, Boolean.valueOf(n3008PrecioM), A3008PrecioM, Boolean.valueOf(n995ForTonal), A995ForTonal, Boolean.valueOf(n3315ForNumArc), Integer.valueOf(A3315ForNumArc), Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol), Boolean.valueOf(n3558ForFecApr), A3558ForFecApr, Boolean.valueOf(n3559ForSitCom), A3559ForSitCom, Boolean.valueOf(n3560ForOpcCli), A3560ForOpcCli, Boolean.valueOf(n3588ForEst), A3588ForEst, Boolean.valueOf(n3688ComUltLin), Short.valueOf(A3688ComUltLin), Boolean.valueOf(n1514MacProCod), A1514MacProCod, Boolean.valueOf(n4223ForCosUti), A4223ForCosUti, Boolean.valueOf(n4339ForRGB), Long.valueOf(A4339ForRGB), Boolean.valueOf(n4380ForCosForm), A4380ForCosForm, Boolean.valueOf(n4384ForTipArt), Short.valueOf(A4384ForTipArt), Boolean.valueOf(n5337ForCodExt), A5337ForCodExt, Boolean.valueOf(n5362IntCodF), Byte.valueOf(A5362IntCodF), Boolean.valueOf(n5624ForUsrCod), A5624ForUsrCod, Boolean.valueOf(n5625ForFecHor), A5625ForFecHor, Boolean.valueOf(n5626ForObsM), A5626ForObsM, Boolean.valueOf(n5653ForPInc), Short.valueOf(A5653ForPInc), Boolean.valueOf(n5742ForSerDsc), A5742ForSerDsc, Boolean.valueOf(n6379ForNomCli2), A6379ForNomCli2, Boolean.valueOf(n6608ForUsrCre), A6608ForUsrCre, Boolean.valueOf(n6609ForFecCre), A6609ForFecCre, Boolean.valueOf(n7029ForNomCli3), A7029ForNomCli3, Boolean.valueOf(n7537ForOpNum), Byte.valueOf(A7537ForOpNum), Boolean.valueOf(n7781ForBlo), A7781ForBlo, Boolean.valueOf(n7796Sim_Ulin), Short.valueOf(A7796Sim_Ulin), Boolean.valueOf(n8043ForTipT), Byte.valueOf(A8043ForTipT), Boolean.valueOf(n8561Fam_Cod), Short.valueOf(A8561Fam_Cod), Boolean.valueOf(n8777For_item1), A8777For_item1, Boolean.valueOf(n9619Lb_CodL), Byte.valueOf(A9619Lb_CodL), Boolean.valueOf(n9621Lb_CodC), Byte.valueOf(A9621Lb_CodC), Boolean.valueOf(n9792For_Reo), A9792For_Reo, Boolean.valueOf(n11041ForFecCtrl), A11041ForFecCtrl, Boolean.valueOf(n11042ForFecCtrf), A11042ForFecCtrf, Boolean.valueOf(n11279ForcosH20), A11279ForcosH20, Boolean.valueOf(n11280ForCosFab), A11280ForCosFab, Boolean.valueOf(n11290ForCosFin), A11290ForCosFin,
         Boolean.valueOf(n4224ForKgUTin), A4224ForKgUTin, Boolean.valueOf(n4225ForKgTTin), A4225ForKgTTin, Boolean.valueOf(n4226ForCosTTi), A4226ForCosTTi, Boolean.valueOf(n3569UltEnsCod), A3569UltEnsCod, Boolean.valueOf(n3585ForPreFec), A3585ForPreFec, Boolean.valueOf(n3586ForPreAnt), A3586ForPreAnt, Boolean.valueOf(n3587ForFecAnt), A3587ForFecAnt, Boolean.valueOf(n11705For_item2), A11705For_item2, Boolean.valueOf(n11706ForObs2), A11706ForObs2, Boolean.valueOf(n12130ForPanto), A12130ForPanto, Boolean.valueOf(n12200ForCurva), A12200ForCurva, Boolean.valueOf(n12399ForMT), Byte.valueOf(A12399ForMT), Boolean.valueOf(n12400ForTRabs), Byte.valueOf(A12400ForTRabs), Boolean.valueOf(n12401ForKgMn), A12401ForKgMn, Boolean.valueOf(n12403ForLotHil2), A12403ForLotHil2, Boolean.valueOf(n12404ForLotHil3), A12404ForLotHil3, Boolean.valueOf(n12732ForObsFac), A12732ForObsFac, Boolean.valueOf(n13102ForLbTalao), A13102ForLbTalao, Boolean.valueOf(n13911ForSerDsc2), A13911ForSerDsc2, Boolean.valueOf(n13912ForAlterna), A13912ForAlterna, Boolean.valueOf(n13913ForPlanta), Byte.valueOf(A13913ForPlanta)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A252CliCod = W252CliCod ;
         A494ForSer = W494ForSer ;
         A482ForColNom = W482ForColNom ;
         A483ForColNum = W483ForColNum ;
         A831TipColCod = W831TipColCod ;
         A486ForNumCol = W486ForNumCol ;
         A486ForNumCol = W486ForNumCol ;
         A496ForUltUti = W496ForUltUti ;
         n496ForUltUti = false ;
         A492ForPreKgm = W492ForPreKgm ;
         n492ForPreKgm = false ;
         A493ForPreMtr = W493ForPreMtr ;
         n493ForPreMtr = false ;
         A491ForPreDef = W491ForPreDef ;
         n491ForPreDef = false ;
         A492ForPreKgm = W492ForPreKgm ;
         n492ForPreKgm = false ;
         A493ForPreMtr = W493ForPreMtr ;
         n493ForPreMtr = false ;
         A491ForPreDef = W491ForPreDef ;
         n491ForPreDef = false ;
         A492ForPreKgm = W492ForPreKgm ;
         n492ForPreKgm = false ;
         A493ForPreMtr = W493ForPreMtr ;
         n493ForPreMtr = false ;
         A491ForPreDef = W491ForPreDef ;
         n491ForPreDef = false ;
         A492ForPreKgm = W492ForPreKgm ;
         n492ForPreKgm = false ;
         A493ForPreMtr = W493ForPreMtr ;
         n493ForPreMtr = false ;
         A491ForPreDef = W491ForPreDef ;
         n491ForPreDef = false ;
         A492ForPreKgm = W492ForPreKgm ;
         n492ForPreKgm = false ;
         A493ForPreMtr = W493ForPreMtr ;
         n493ForPreMtr = false ;
         A5742ForSerDsc = W5742ForSerDsc ;
         n5742ForSerDsc = false ;
         A1191ForNomCli = W1191ForNomCli ;
         n1191ForNomCli = false ;
         A1192ForNumCli = W1192ForNumCli ;
         n1192ForNumCli = false ;
         A8561Fam_Cod = W8561Fam_Cod ;
         n8561Fam_Cod = false ;
         A7781ForBlo = W7781ForBlo ;
         n7781ForBlo = false ;
         A7781ForBlo = W7781ForBlo ;
         n7781ForBlo = false ;
         A7781ForBlo = W7781ForBlo ;
         n7781ForBlo = false ;
         A4380ForCosForm = W4380ForCosForm ;
         n4380ForCosForm = false ;
         A3315ForNumArc = W3315ForNumArc ;
         n3315ForNumArc = false ;
         A3560ForOpcCli = W3560ForOpcCli ;
         n3560ForOpcCli = false ;
         A7537ForOpNum = W7537ForOpNum ;
         n7537ForOpNum = false ;
         A3558ForFecApr = W3558ForFecApr ;
         n3558ForFecApr = false ;
         A3558ForFecApr = W3558ForFecApr ;
         n3558ForFecApr = false ;
         A7537ForOpNum = W7537ForOpNum ;
         n7537ForOpNum = false ;
         A3560ForOpcCli = W3560ForOpcCli ;
         n3560ForOpcCli = false ;
         A12399ForMT = W12399ForMT ;
         n12399ForMT = false ;
         A12400ForTRabs = W12400ForTRabs ;
         n12400ForTRabs = false ;
         A12401ForKgMn = W12401ForKgMn ;
         n12401ForKgMn = false ;
         A7029ForNomCli3 = W7029ForNomCli3 ;
         n7029ForNomCli3 = false ;
         A995ForTonal = W995ForTonal ;
         n995ForTonal = false ;
         A485ForFec = W485ForFec ;
         n485ForFec = false ;
         A5624ForUsrCod = W5624ForUsrCod ;
         n5624ForUsrCod = false ;
         A5625ForFecHor = W5625ForFecHor ;
         n5625ForFecHor = false ;
         A6608ForUsrCre = W6608ForUsrCre ;
         n6608ForUsrCre = false ;
         A6609ForFecCre = W6609ForFecCre ;
         n6609ForFecCre = false ;
         A13911ForSerDsc2 = W13911ForSerDsc2 ;
         n13911ForSerDsc2 = false ;
         A4384ForTipArt = W4384ForTipArt ;
         n4384ForTipArt = false ;
         /* End Insert */
         Gx_msg = httpContext.getMessage( "Colores Equivalentes", "") ;
         if ( AV20Flag == 0 )
         {
            Gx_msg = httpContext.getMessage( "Colores Duplicados", "") ;
         }
         AV54Texto_i = Gx_msg + GXutil.newLine( ) + httpContext.getMessage( "Color Origen  = ", "") + GXutil.str( A252CliCod, 6, 0) + "-" + A494ForSer + "-" + A482ForColNom + "-" + GXutil.str( A483ForColNum, 6, 0) + "-" + GXutil.str( A831TipColCod, 2, 0) + GXutil.newLine( ) + httpContext.getMessage( "PKg/PMt       = ", "") + GXutil.str( A492ForPreKgm, 12, 5) + "/" + GXutil.str( A493ForPreMtr, 12, 5) + GXutil.newLine( ) + httpContext.getMessage( "Color Destino= ", "") + GXutil.str( AV15CliCod, 6, 0) + "-" + AV16ForSer + "-" + AV17ForColNom + "-" + GXutil.str( AV18ForColNum, 6, 0) + "-" + GXutil.str( AV19TipColCod, 2, 0) + GXutil.newLine( ) + httpContext.getMessage( "PKg/PMt       = ", "") + GXutil.str( AV50ForPreKgm, 12, 5) + "/" + GXutil.str( AV51ForPreMtr, 12, 5) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV79Pgmname, AV55Usurcod, AV56Station, AV54Texto_i, 99999999, (byte)(0), "@") ;
         /* Using cursor P02DG4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A764ProForCod = P02DG4_A764ProForCod[0] ;
            A1160ProForL = P02DG4_A1160ProForL[0] ;
            A14198ProforFabs = P02DG4_A14198ProforFabs[0] ;
            A10542ProForH2O = P02DG4_A10542ProForH2O[0] ;
            A9707ProForMq = P02DG4_A9707ProForMq[0] ;
            A9704ProForVol = P02DG4_A9704ProForVol[0] ;
            A8656ProForrbn = P02DG4_A8656ProForrbn[0] ;
            A7802ProFoNPrg = P02DG4_A7802ProFoNPrg[0] ;
            A6549ProForFR = P02DG4_A6549ProForFR[0] ;
            W252CliCod = A252CliCod ;
            W494ForSer = A494ForSer ;
            W482ForColNom = A482ForColNom ;
            W483ForColNum = A483ForColNum ;
            W831TipColCod = A831TipColCod ;
            AV23ProForL = A1160ProForL ;
            AV24ProForCod = A764ProForCod ;
            /*
               INSERT RECORD ON TABLE TXPLFORMU

            */
            W252CliCod = A252CliCod ;
            W494ForSer = A494ForSer ;
            W482ForColNom = A482ForColNom ;
            W483ForColNum = A483ForColNum ;
            W831TipColCod = A831TipColCod ;
            W1160ProForL = A1160ProForL ;
            W764ProForCod = A764ProForCod ;
            W6549ProForFR = A6549ProForFR ;
            A252CliCod = AV15CliCod ;
            A494ForSer = AV16ForSer ;
            A482ForColNom = AV17ForColNom ;
            A483ForColNum = AV18ForColNum ;
            A831TipColCod = AV19TipColCod ;
            A1160ProForL = AV23ProForL ;
            A764ProForCod = AV24ProForCod ;
            /* Using cursor P02DG5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL), A764ProForCod, A6549ProForFR, Integer.valueOf(A7802ProFoNPrg), A8656ProForrbn, Integer.valueOf(A9704ProForVol), A9707ProForMq, Short.valueOf(A10542ProForH2O), A14198ProforFabs});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
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
            A252CliCod = W252CliCod ;
            A494ForSer = W494ForSer ;
            A482ForColNom = W482ForColNom ;
            A483ForColNum = W483ForColNum ;
            A831TipColCod = W831TipColCod ;
            A1160ProForL = W1160ProForL ;
            A764ProForCod = W764ProForCod ;
            A6549ProForFR = W6549ProForFR ;
            /* End Insert */
            A252CliCod = W252CliCod ;
            A494ForSer = W494ForSer ;
            A482ForColNom = W482ForColNom ;
            A483ForColNum = W483ForColNum ;
            A831TipColCod = W831TipColCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Using cursor P02DG6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A6186Mq_Prog = P02DG6_A6186Mq_Prog[0] ;
            n6186Mq_Prog = P02DG6_n6186Mq_Prog[0] ;
            A6037Mq_Grupo = P02DG6_A6037Mq_Grupo[0] ;
            A6268Mq_Prog3 = P02DG6_A6268Mq_Prog3[0] ;
            n6268Mq_Prog3 = P02DG6_n6268Mq_Prog3[0] ;
            A6267Mq_Prog2 = P02DG6_A6267Mq_Prog2[0] ;
            n6267Mq_Prog2 = P02DG6_n6267Mq_Prog2[0] ;
            W252CliCod = A252CliCod ;
            W494ForSer = A494ForSer ;
            W482ForColNom = A482ForColNom ;
            W483ForColNum = A483ForColNum ;
            W831TipColCod = A831TipColCod ;
            AV59MQ_GRUPO = A6037Mq_Grupo ;
            AV60MQ_PROG = A6186Mq_Prog ;
            /*
               INSERT RECORD ON TABLE TXPFORMQP

            */
            W252CliCod = A252CliCod ;
            W494ForSer = A494ForSer ;
            W482ForColNom = A482ForColNom ;
            W483ForColNum = A483ForColNum ;
            W831TipColCod = A831TipColCod ;
            W6037Mq_Grupo = A6037Mq_Grupo ;
            W6186Mq_Prog = A6186Mq_Prog ;
            n6186Mq_Prog = false ;
            A252CliCod = AV15CliCod ;
            A494ForSer = AV16ForSer ;
            A482ForColNom = AV17ForColNom ;
            A483ForColNum = AV18ForColNum ;
            A831TipColCod = AV19TipColCod ;
            A6037Mq_Grupo = AV59MQ_GRUPO ;
            A6186Mq_Prog = AV60MQ_PROG ;
            n6186Mq_Prog = false ;
            /* Using cursor P02DG7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Byte.valueOf(A6037Mq_Grupo), Boolean.valueOf(n6186Mq_Prog), Integer.valueOf(A6186Mq_Prog), Boolean.valueOf(n6267Mq_Prog2), Integer.valueOf(A6267Mq_Prog2), Boolean.valueOf(n6268Mq_Prog3), Integer.valueOf(A6268Mq_Prog3)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORMQP");
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
            A252CliCod = W252CliCod ;
            A494ForSer = W494ForSer ;
            A482ForColNom = W482ForColNom ;
            A483ForColNum = W483ForColNum ;
            A831TipColCod = W831TipColCod ;
            A6037Mq_Grupo = W6037Mq_Grupo ;
            A6186Mq_Prog = W6186Mq_Prog ;
            n6186Mq_Prog = false ;
            /* End Insert */
            A252CliCod = W252CliCod ;
            A494ForSer = W494ForSer ;
            A482ForColNom = W482ForColNom ;
            A483ForColNum = W483ForColNum ;
            A831TipColCod = W831TipColCod ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         if ( ( AV20Flag == 0 ) || ( AV49Obs_equiv == 1 ) )
         {
            /* Using cursor P02DG8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A649ObsForTxt = P02DG8_A649ObsForTxt[0] ;
               A650ObsLin = P02DG8_A650ObsLin[0] ;
               W252CliCod = A252CliCod ;
               W494ForSer = A494ForSer ;
               W482ForColNom = A482ForColNom ;
               W483ForColNum = A483ForColNum ;
               W831TipColCod = A831TipColCod ;
               AV25ObsLin = A650ObsLin ;
               AV26ObsForTxt = A649ObsForTxt ;
               /*
                  INSERT RECORD ON TABLE TXPLOBFOR

               */
               W252CliCod = A252CliCod ;
               W494ForSer = A494ForSer ;
               W482ForColNom = A482ForColNom ;
               W483ForColNum = A483ForColNum ;
               W831TipColCod = A831TipColCod ;
               W650ObsLin = A650ObsLin ;
               W649ObsForTxt = A649ObsForTxt ;
               A252CliCod = AV15CliCod ;
               A494ForSer = AV16ForSer ;
               A482ForColNom = AV17ForColNom ;
               A483ForColNum = AV18ForColNum ;
               A831TipColCod = AV19TipColCod ;
               A650ObsLin = AV25ObsLin ;
               A649ObsForTxt = AV26ObsForTxt ;
               /* Using cursor P02DG9 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A650ObsLin), A649ObsForTxt});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOBFOR");
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
               A252CliCod = W252CliCod ;
               A494ForSer = W494ForSer ;
               A482ForColNom = W482ForColNom ;
               A483ForColNum = W483ForColNum ;
               A831TipColCod = W831TipColCod ;
               A650ObsLin = W650ObsLin ;
               A649ObsForTxt = W649ObsForTxt ;
               /* End Insert */
               A252CliCod = W252CliCod ;
               A494ForSer = W494ForSer ;
               A482ForColNom = W482ForColNom ;
               A483ForColNum = W483ForColNum ;
               A831TipColCod = W831TipColCod ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
         }
         A252CliCod = W252CliCod ;
         A494ForSer = W494ForSer ;
         A482ForColNom = W482ForColNom ;
         A483ForColNum = W483ForColNum ;
         A831TipColCod = W831TipColCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV20Flag == 0 )
      {
         AV54Texto_i = httpContext.getMessage( "Opcion DUPLICADO. Creacion Tablas CDFORM,LDFORM,LPRFOR", "") + GXutil.newLine( ) ;
         AV54Texto_i += httpContext.getMessage( "NFormula Origen= ", "") + GXutil.str( AV22NumCol, 8, 0) + GXutil.newLine( ) ;
         AV54Texto_i += httpContext.getMessage( "NFormula Nueva = ", "") + GXutil.str( AV21ForNumCol, 8, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV79Pgmname, AV55Usurcod, AV56Station, AV54Texto_i, AV21ForNumCol, (byte)(0), "@") ;
         /* Using cursor P02DG10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV22NumCol)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A741PrdUltLin = P02DG10_A741PrdUltLin[0] ;
            A315ContNum = P02DG10_A315ContNum[0] ;
            A310ColUltLin = P02DG10_A310ColUltLin[0] ;
            A486ForNumCol = P02DG10_A486ForNumCol[0] ;
            A6371Lb_fam3 = P02DG10_A6371Lb_fam3[0] ;
            A6370Lb_fam2 = P02DG10_A6370Lb_fam2[0] ;
            A6369Lb_fam1 = P02DG10_A6369Lb_fam1[0] ;
            A6310Lb_TaAuxC = P02DG10_A6310Lb_TaAuxC[0] ;
            n6310Lb_TaAuxC = P02DG10_n6310Lb_TaAuxC[0] ;
            A318CosKgm = P02DG10_A318CosKgm[0] ;
            W486ForNumCol = A486ForNumCol ;
            AV27PrdUltLin = A741PrdUltLin ;
            AV28ColUltLin = A310ColUltLin ;
            AV29ContNum = A315ContNum ;
            /*
               INSERT RECORD ON TABLE TXPCDFORM

            */
            W486ForNumCol = A486ForNumCol ;
            W741PrdUltLin = A741PrdUltLin ;
            W310ColUltLin = A310ColUltLin ;
            W315ContNum = A315ContNum ;
            A486ForNumCol = AV21ForNumCol ;
            A741PrdUltLin = AV27PrdUltLin ;
            A310ColUltLin = AV28ColUltLin ;
            A315ContNum = AV29ContNum ;
            /* Using cursor P02DG11 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A310ColUltLin), Integer.valueOf(A315ContNum), A318CosKgm, Short.valueOf(A741PrdUltLin), Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC, Byte.valueOf(A6369Lb_fam1), Byte.valueOf(A6370Lb_fam2), Byte.valueOf(A6371Lb_fam3)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
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
            A486ForNumCol = W486ForNumCol ;
            A741PrdUltLin = W741PrdUltLin ;
            A310ColUltLin = W310ColUltLin ;
            A315ContNum = W315ContNum ;
            /* End Insert */
            AV54Texto_i = httpContext.getMessage( "Creo CDFORM", "") + GXutil.newLine( ) ;
            AV54Texto_i += httpContext.getMessage( "NFormula Origen= ", "") + GXutil.str( AV22NumCol, 8, 0) + GXutil.newLine( ) ;
            AV54Texto_i += httpContext.getMessage( "NFormula Nueva = ", "") + GXutil.str( AV21ForNumCol, 8, 0) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV79Pgmname, AV55Usurcod, AV56Station, AV54Texto_i, AV21ForNumCol, (byte)(0), "@") ;
            /* Using cursor P02DG12 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV22NumCol)});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A489ForPrdNor = P02DG12_A489ForPrdNor[0] ;
               A490ForPrdUMe = P02DG12_A490ForPrdUMe[0] ;
               A487ForPrdCan = P02DG12_A487ForPrdCan[0] ;
               A719PrdNum = P02DG12_A719PrdNum[0] ;
               A715PrdLin = P02DG12_A715PrdLin[0] ;
               A486ForNumCol = P02DG12_A486ForNumCol[0] ;
               W486ForNumCol = A486ForNumCol ;
               AV30PrdLin = A715PrdLin ;
               AV31PrdNum = A719PrdNum ;
               AV32ForPrdCan = A487ForPrdCan ;
               AV33ForPrdUme = A490ForPrdUMe ;
               AV34ForPrdNor = A489ForPrdNor ;
               /*
                  INSERT RECORD ON TABLE TXPLPRFOR

               */
               W486ForNumCol = A486ForNumCol ;
               W715PrdLin = A715PrdLin ;
               W719PrdNum = A719PrdNum ;
               W487ForPrdCan = A487ForPrdCan ;
               W490ForPrdUMe = A490ForPrdUMe ;
               W489ForPrdNor = A489ForPrdNor ;
               A486ForNumCol = AV21ForNumCol ;
               A715PrdLin = AV30PrdLin ;
               A719PrdNum = AV31PrdNum ;
               A487ForPrdCan = AV32ForPrdCan ;
               A490ForPrdUMe = AV33ForPrdUme ;
               A489ForPrdNor = AV34ForPrdNor ;
               /* Using cursor P02DG13 */
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
               A486ForNumCol = W486ForNumCol ;
               A715PrdLin = W715PrdLin ;
               A719PrdNum = W719PrdNum ;
               A487ForPrdCan = W487ForPrdCan ;
               A490ForPrdUMe = W490ForPrdUMe ;
               A489ForPrdNor = W489ForPrdNor ;
               /* End Insert */
               AV54Texto_i = httpContext.getMessage( "Creo LPRFOR", "") + GXutil.newLine( ) ;
               AV54Texto_i += httpContext.getMessage( "NFormula Origen= ", "") + GXutil.str( AV22NumCol, 8, 0) + GXutil.newLine( ) ;
               AV54Texto_i += httpContext.getMessage( "NFormula Nueva = ", "") + GXutil.str( AV21ForNumCol, 8, 0) + GXutil.newLine( ) ;
               AV54Texto_i += httpContext.getMessage( "Producto       = ", "") + AV31PrdNum + GXutil.newLine( ) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV79Pgmname, AV55Usurcod, AV56Station, AV54Texto_i, AV21ForNumCol, (byte)(0), "@") ;
               A486ForNumCol = W486ForNumCol ;
               pr_default.readNext(10);
            }
            pr_default.close(10);
            /* Using cursor P02DG14 */
            pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV22NumCol)});
            while ( (pr_default.getStatus(12) != 101) )
            {
               A481ForCan = P02DG14_A481ForCan[0] ;
               A490ForPrdUMe = P02DG14_A490ForPrdUMe[0] ;
               A719PrdNum = P02DG14_A719PrdNum[0] ;
               A309ColLin = P02DG14_A309ColLin[0] ;
               A486ForNumCol = P02DG14_A486ForNumCol[0] ;
               A13926ColFibra = P02DG14_A13926ColFibra[0] ;
               n13926ColFibra = P02DG14_n13926ColFibra[0] ;
               A6193ForClaCol = P02DG14_A6193ForClaCol[0] ;
               A838TotLinCol = P02DG14_A838TotLinCol[0] ;
               W486ForNumCol = A486ForNumCol ;
               AV35ColLin = A309ColLin ;
               AV36Produc = A719PrdNum ;
               AV33ForPrdUme = A490ForPrdUMe ;
               AV37ForCan = A481ForCan ;
               /*
                  INSERT RECORD ON TABLE TXPLDFORM

               */
               W486ForNumCol = A486ForNumCol ;
               W309ColLin = A309ColLin ;
               W719PrdNum = A719PrdNum ;
               W490ForPrdUMe = A490ForPrdUMe ;
               W481ForCan = A481ForCan ;
               A486ForNumCol = AV21ForNumCol ;
               A309ColLin = AV35ColLin ;
               A719PrdNum = AV36Produc ;
               A490ForPrdUMe = AV33ForPrdUme ;
               A481ForCan = AV37ForCan ;
               /* Using cursor P02DG15 */
               pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A481ForCan, A838TotLinCol, A6193ForClaCol, Boolean.valueOf(n13926ColFibra), A13926ColFibra});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
               if ( (pr_default.getStatus(13) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A486ForNumCol = W486ForNumCol ;
               A309ColLin = W309ColLin ;
               A719PrdNum = W719PrdNum ;
               A490ForPrdUMe = W490ForPrdUMe ;
               A481ForCan = W481ForCan ;
               /* End Insert */
               AV54Texto_i = httpContext.getMessage( "Creo LDFORM", "") + GXutil.newLine( ) ;
               AV54Texto_i += httpContext.getMessage( "NFormula Origen= ", "") + GXutil.str( AV22NumCol, 8, 0) + GXutil.newLine( ) ;
               AV54Texto_i += httpContext.getMessage( "NFormula Nueva = ", "") + GXutil.str( AV21ForNumCol, 8, 0) + GXutil.newLine( ) ;
               AV54Texto_i += httpContext.getMessage( "Producto       = ", "") + AV36Produc + GXutil.newLine( ) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV79Pgmname, AV55Usurcod, AV56Station, AV54Texto_i, AV21ForNumCol, (byte)(0), "@") ;
               A486ForNumCol = W486ForNumCol ;
               pr_default.readNext(12);
            }
            pr_default.close(12);
            A486ForNumCol = W486ForNumCol ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdupfork.this.A396EmprCod;
      this.aP1[0] = pdupfork.this.A252CliCod;
      this.aP2[0] = pdupfork.this.A494ForSer;
      this.aP3[0] = pdupfork.this.A482ForColNom;
      this.aP4[0] = pdupfork.this.A483ForColNum;
      this.aP5[0] = pdupfork.this.A831TipColCod;
      this.aP6[0] = pdupfork.this.AV15CliCod;
      this.aP7[0] = pdupfork.this.AV16ForSer;
      this.aP8[0] = pdupfork.this.AV17ForColNom;
      this.aP9[0] = pdupfork.this.AV18ForColNum;
      this.aP10[0] = pdupfork.this.AV19TipColCod;
      this.aP11[0] = pdupfork.this.AV61ForNomCli;
      this.aP12[0] = pdupfork.this.AV62ForNumCli;
      this.aP13[0] = pdupfork.this.AV20Flag;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdupfork");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV55Usurcod = "" ;
      AV56Station = "" ;
      AV57EmprNom = "" ;
      GXv_int5 = new byte[1] ;
      scmdbuf = "" ;
      P02DG2_A396EmprCod = new String[] {""} ;
      P02DG2_A252CliCod = new int[1] ;
      P02DG2_A494ForSer = new String[] {""} ;
      P02DG2_A482ForColNom = new String[] {""} ;
      P02DG2_A483ForColNum = new int[1] ;
      P02DG2_A831TipColCod = new byte[1] ;
      P02DG2_A13911ForSerDsc2 = new String[] {""} ;
      P02DG2_n13911ForSerDsc2 = new boolean[] {false} ;
      P02DG2_A12401ForKgMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG2_n12401ForKgMn = new boolean[] {false} ;
      P02DG2_A12400ForTRabs = new byte[1] ;
      P02DG2_n12400ForTRabs = new boolean[] {false} ;
      P02DG2_A12399ForMT = new byte[1] ;
      P02DG2_n12399ForMT = new boolean[] {false} ;
      P02DG2_A8561Fam_Cod = new short[1] ;
      P02DG2_n8561Fam_Cod = new boolean[] {false} ;
      P02DG2_A7781ForBlo = new String[] {""} ;
      P02DG2_n7781ForBlo = new boolean[] {false} ;
      P02DG2_A7537ForOpNum = new byte[1] ;
      P02DG2_n7537ForOpNum = new boolean[] {false} ;
      P02DG2_A6609ForFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      P02DG2_n6609ForFecCre = new boolean[] {false} ;
      P02DG2_A6608ForUsrCre = new String[] {""} ;
      P02DG2_n6608ForUsrCre = new boolean[] {false} ;
      P02DG2_A5742ForSerDsc = new String[] {""} ;
      P02DG2_n5742ForSerDsc = new boolean[] {false} ;
      P02DG2_A5625ForFecHor = new java.util.Date[] {GXutil.nullDate()} ;
      P02DG2_n5625ForFecHor = new boolean[] {false} ;
      P02DG2_A5624ForUsrCod = new String[] {""} ;
      P02DG2_n5624ForUsrCod = new boolean[] {false} ;
      P02DG2_A4384ForTipArt = new short[1] ;
      P02DG2_n4384ForTipArt = new boolean[] {false} ;
      P02DG2_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG2_n4380ForCosForm = new boolean[] {false} ;
      P02DG2_A3560ForOpcCli = new String[] {""} ;
      P02DG2_n3560ForOpcCli = new boolean[] {false} ;
      P02DG2_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      P02DG2_n3558ForFecApr = new boolean[] {false} ;
      P02DG2_A3315ForNumArc = new int[1] ;
      P02DG2_n3315ForNumArc = new boolean[] {false} ;
      P02DG2_A1192ForNumCli = new int[1] ;
      P02DG2_n1192ForNumCli = new boolean[] {false} ;
      P02DG2_A1191ForNomCli = new String[] {""} ;
      P02DG2_n1191ForNomCli = new boolean[] {false} ;
      P02DG2_A491ForPreDef = new String[] {""} ;
      P02DG2_n491ForPreDef = new boolean[] {false} ;
      P02DG2_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG2_n493ForPreMtr = new boolean[] {false} ;
      P02DG2_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG2_n492ForPreKgm = new boolean[] {false} ;
      P02DG2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P02DG2_n496ForUltUti = new boolean[] {false} ;
      P02DG2_A486ForNumCol = new int[1] ;
      P02DG2_A13913ForPlanta = new byte[1] ;
      P02DG2_n13913ForPlanta = new boolean[] {false} ;
      P02DG2_A13912ForAlterna = new String[] {""} ;
      P02DG2_n13912ForAlterna = new boolean[] {false} ;
      P02DG2_A13102ForLbTalao = new String[] {""} ;
      P02DG2_n13102ForLbTalao = new boolean[] {false} ;
      P02DG2_A12732ForObsFac = new String[] {""} ;
      P02DG2_n12732ForObsFac = new boolean[] {false} ;
      P02DG2_A12404ForLotHil3 = new String[] {""} ;
      P02DG2_n12404ForLotHil3 = new boolean[] {false} ;
      P02DG2_A12403ForLotHil2 = new String[] {""} ;
      P02DG2_n12403ForLotHil2 = new boolean[] {false} ;
      P02DG2_A12200ForCurva = new String[] {""} ;
      P02DG2_n12200ForCurva = new boolean[] {false} ;
      P02DG2_A12130ForPanto = new String[] {""} ;
      P02DG2_n12130ForPanto = new boolean[] {false} ;
      P02DG2_A11706ForObs2 = new String[] {""} ;
      P02DG2_n11706ForObs2 = new boolean[] {false} ;
      P02DG2_A11705For_item2 = new String[] {""} ;
      P02DG2_n11705For_item2 = new boolean[] {false} ;
      P02DG2_A3587ForFecAnt = new java.util.Date[] {GXutil.nullDate()} ;
      P02DG2_n3587ForFecAnt = new boolean[] {false} ;
      P02DG2_A3586ForPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG2_n3586ForPreAnt = new boolean[] {false} ;
      P02DG2_A3585ForPreFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02DG2_n3585ForPreFec = new boolean[] {false} ;
      P02DG2_A3569UltEnsCod = new String[] {""} ;
      P02DG2_n3569UltEnsCod = new boolean[] {false} ;
      P02DG2_A4226ForCosTTi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG2_n4226ForCosTTi = new boolean[] {false} ;
      P02DG2_A4225ForKgTTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG2_n4225ForKgTTin = new boolean[] {false} ;
      P02DG2_A4224ForKgUTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG2_n4224ForKgUTin = new boolean[] {false} ;
      P02DG2_A11290ForCosFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG2_n11290ForCosFin = new boolean[] {false} ;
      P02DG2_A11280ForCosFab = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG2_n11280ForCosFab = new boolean[] {false} ;
      P02DG2_A11279ForcosH20 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG2_n11279ForcosH20 = new boolean[] {false} ;
      P02DG2_A11042ForFecCtrf = new java.util.Date[] {GXutil.nullDate()} ;
      P02DG2_n11042ForFecCtrf = new boolean[] {false} ;
      P02DG2_A11041ForFecCtrl = new java.util.Date[] {GXutil.nullDate()} ;
      P02DG2_n11041ForFecCtrl = new boolean[] {false} ;
      P02DG2_A9792For_Reo = new String[] {""} ;
      P02DG2_n9792For_Reo = new boolean[] {false} ;
      P02DG2_A9621Lb_CodC = new byte[1] ;
      P02DG2_n9621Lb_CodC = new boolean[] {false} ;
      P02DG2_A9619Lb_CodL = new byte[1] ;
      P02DG2_n9619Lb_CodL = new boolean[] {false} ;
      P02DG2_A8777For_item1 = new String[] {""} ;
      P02DG2_n8777For_item1 = new boolean[] {false} ;
      P02DG2_A8043ForTipT = new byte[1] ;
      P02DG2_n8043ForTipT = new boolean[] {false} ;
      P02DG2_A7796Sim_Ulin = new short[1] ;
      P02DG2_n7796Sim_Ulin = new boolean[] {false} ;
      P02DG2_A7029ForNomCli3 = new String[] {""} ;
      P02DG2_n7029ForNomCli3 = new boolean[] {false} ;
      P02DG2_A6379ForNomCli2 = new String[] {""} ;
      P02DG2_n6379ForNomCli2 = new boolean[] {false} ;
      P02DG2_A5653ForPInc = new short[1] ;
      P02DG2_n5653ForPInc = new boolean[] {false} ;
      P02DG2_A5626ForObsM = new String[] {""} ;
      P02DG2_n5626ForObsM = new boolean[] {false} ;
      P02DG2_A5362IntCodF = new byte[1] ;
      P02DG2_n5362IntCodF = new boolean[] {false} ;
      P02DG2_A5337ForCodExt = new String[] {""} ;
      P02DG2_n5337ForCodExt = new boolean[] {false} ;
      P02DG2_A4339ForRGB = new long[1] ;
      P02DG2_n4339ForRGB = new boolean[] {false} ;
      P02DG2_A4223ForCosUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG2_n4223ForCosUti = new boolean[] {false} ;
      P02DG2_A1514MacProCod = new String[] {""} ;
      P02DG2_n1514MacProCod = new boolean[] {false} ;
      P02DG2_A3688ComUltLin = new short[1] ;
      P02DG2_n3688ComUltLin = new boolean[] {false} ;
      P02DG2_A3588ForEst = new String[] {""} ;
      P02DG2_n3588ForEst = new boolean[] {false} ;
      P02DG2_A3559ForSitCom = new String[] {""} ;
      P02DG2_n3559ForSitCom = new boolean[] {false} ;
      P02DG2_A3316CodSol = new short[1] ;
      P02DG2_n3316CodSol = new boolean[] {false} ;
      P02DG2_A995ForTonal = new String[] {""} ;
      P02DG2_n995ForTonal = new boolean[] {false} ;
      P02DG2_A3008PrecioM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG2_n3008PrecioM = new boolean[] {false} ;
      P02DG2_A3007PrecioA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG2_n3007PrecioA = new boolean[] {false} ;
      P02DG2_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG2_n2838ForRelBan = new boolean[] {false} ;
      P02DG2_A2749ForPro = new String[] {""} ;
      P02DG2_n2749ForPro = new boolean[] {false} ;
      P02DG2_A1518RecCorULin = new byte[1] ;
      P02DG2_n1518RecCorULin = new boolean[] {false} ;
      P02DG2_A1159ForUltLin = new short[1] ;
      P02DG2_n1159ForUltLin = new boolean[] {false} ;
      P02DG2_A651ObsUltLin = new short[1] ;
      P02DG2_n651ObsUltLin = new boolean[] {false} ;
      P02DG2_A484ForCon = new byte[1] ;
      P02DG2_A626MatCod = new short[1] ;
      P02DG2_A583IntCod = new byte[1] ;
      P02DG2_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P02DG2_n495ForUltMod = new boolean[] {false} ;
      P02DG2_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02DG2_n485ForFec = new boolean[] {false} ;
      P02DG2_A130BarCodPar = new String[] {""} ;
      P02DG2_n130BarCodPar = new boolean[] {false} ;
      P02DG2_A132BarCodReo = new byte[1] ;
      P02DG2_n132BarCodReo = new boolean[] {false} ;
      P02DG2_A129BarCod = new int[1] ;
      P02DG2_n129BarCod = new boolean[] {false} ;
      A13911ForSerDsc2 = "" ;
      A12401ForKgMn = DecimalUtil.ZERO ;
      A7781ForBlo = "" ;
      A6609ForFecCre = GXutil.resetTime( GXutil.nullDate() );
      A6608ForUsrCre = "" ;
      A5742ForSerDsc = "" ;
      A5625ForFecHor = GXutil.resetTime( GXutil.nullDate() );
      A5624ForUsrCod = "" ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      A3560ForOpcCli = "" ;
      A3558ForFecApr = GXutil.nullDate() ;
      A1191ForNomCli = "" ;
      A491ForPreDef = "" ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A496ForUltUti = GXutil.nullDate() ;
      A13912ForAlterna = "" ;
      A13102ForLbTalao = "" ;
      A12732ForObsFac = "" ;
      A12404ForLotHil3 = "" ;
      A12403ForLotHil2 = "" ;
      A12200ForCurva = "" ;
      A12130ForPanto = "" ;
      A11706ForObs2 = "" ;
      A11705For_item2 = "" ;
      A3587ForFecAnt = GXutil.nullDate() ;
      A3586ForPreAnt = DecimalUtil.ZERO ;
      A3585ForPreFec = GXutil.nullDate() ;
      A3569UltEnsCod = "" ;
      A4226ForCosTTi = DecimalUtil.ZERO ;
      A4225ForKgTTin = DecimalUtil.ZERO ;
      A4224ForKgUTin = DecimalUtil.ZERO ;
      A11290ForCosFin = DecimalUtil.ZERO ;
      A11280ForCosFab = DecimalUtil.ZERO ;
      A11279ForcosH20 = DecimalUtil.ZERO ;
      A11042ForFecCtrf = GXutil.resetTime( GXutil.nullDate() );
      A11041ForFecCtrl = GXutil.resetTime( GXutil.nullDate() );
      A9792For_Reo = "" ;
      A8777For_item1 = "" ;
      A7029ForNomCli3 = "" ;
      A6379ForNomCli2 = "" ;
      A5626ForObsM = "" ;
      A5337ForCodExt = "" ;
      A4223ForCosUti = DecimalUtil.ZERO ;
      A1514MacProCod = "" ;
      A3588ForEst = "" ;
      A3559ForSitCom = "" ;
      A995ForTonal = "" ;
      A3008PrecioM = DecimalUtil.ZERO ;
      A3007PrecioA = DecimalUtil.ZERO ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      A2749ForPro = "" ;
      A495ForUltMod = GXutil.nullDate() ;
      A485ForFec = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      W494ForSer = "" ;
      W482ForColNom = "" ;
      AV50ForPreKgm = DecimalUtil.ZERO ;
      AV51ForPreMtr = DecimalUtil.ZERO ;
      AV53ForPreDef = "" ;
      AV66ForBlo = "" ;
      AV67Forcosform = DecimalUtil.ZERO ;
      AV58ForSerDsc = "" ;
      GXv_int9 = new short[1] ;
      W496ForUltUti = GXutil.nullDate() ;
      W492ForPreKgm = DecimalUtil.ZERO ;
      W493ForPreMtr = DecimalUtil.ZERO ;
      W491ForPreDef = "" ;
      W5742ForSerDsc = "" ;
      W1191ForNomCli = "" ;
      W7781ForBlo = "" ;
      W4380ForCosForm = DecimalUtil.ZERO ;
      W3560ForOpcCli = "" ;
      W3558ForFecApr = GXutil.nullDate() ;
      W12401ForKgMn = DecimalUtil.ZERO ;
      W7029ForNomCli3 = "" ;
      W995ForTonal = "" ;
      W485ForFec = GXutil.nullDate() ;
      W5624ForUsrCod = "" ;
      W5625ForFecHor = GXutil.resetTime( GXutil.nullDate() );
      W6608ForUsrCre = "" ;
      W6609ForFecCre = GXutil.resetTime( GXutil.nullDate() );
      W13911ForSerDsc2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV73ForSerDsc2 = "" ;
      Gx_emsg = "" ;
      Gx_msg = "" ;
      AV54Texto_i = "" ;
      AV79Pgmname = "" ;
      P02DG4_A396EmprCod = new String[] {""} ;
      P02DG4_A252CliCod = new int[1] ;
      P02DG4_A494ForSer = new String[] {""} ;
      P02DG4_A482ForColNom = new String[] {""} ;
      P02DG4_A483ForColNum = new int[1] ;
      P02DG4_A831TipColCod = new byte[1] ;
      P02DG4_A764ProForCod = new String[] {""} ;
      P02DG4_A1160ProForL = new short[1] ;
      P02DG4_A14198ProforFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG4_A10542ProForH2O = new short[1] ;
      P02DG4_A9707ProForMq = new String[] {""} ;
      P02DG4_A9704ProForVol = new int[1] ;
      P02DG4_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG4_A7802ProFoNPrg = new int[1] ;
      P02DG4_A6549ProForFR = new String[] {""} ;
      A764ProForCod = "" ;
      A14198ProforFabs = DecimalUtil.ZERO ;
      A9707ProForMq = "" ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      A6549ProForFR = "" ;
      AV24ProForCod = "" ;
      W764ProForCod = "" ;
      W6549ProForFR = "" ;
      P02DG6_A396EmprCod = new String[] {""} ;
      P02DG6_A252CliCod = new int[1] ;
      P02DG6_A494ForSer = new String[] {""} ;
      P02DG6_A482ForColNom = new String[] {""} ;
      P02DG6_A483ForColNum = new int[1] ;
      P02DG6_A831TipColCod = new byte[1] ;
      P02DG6_A6186Mq_Prog = new int[1] ;
      P02DG6_n6186Mq_Prog = new boolean[] {false} ;
      P02DG6_A6037Mq_Grupo = new byte[1] ;
      P02DG6_A6268Mq_Prog3 = new int[1] ;
      P02DG6_n6268Mq_Prog3 = new boolean[] {false} ;
      P02DG6_A6267Mq_Prog2 = new int[1] ;
      P02DG6_n6267Mq_Prog2 = new boolean[] {false} ;
      P02DG8_A396EmprCod = new String[] {""} ;
      P02DG8_A252CliCod = new int[1] ;
      P02DG8_A494ForSer = new String[] {""} ;
      P02DG8_A482ForColNom = new String[] {""} ;
      P02DG8_A483ForColNum = new int[1] ;
      P02DG8_A831TipColCod = new byte[1] ;
      P02DG8_A649ObsForTxt = new String[] {""} ;
      P02DG8_A650ObsLin = new short[1] ;
      A649ObsForTxt = "" ;
      AV26ObsForTxt = "" ;
      W649ObsForTxt = "" ;
      P02DG10_A396EmprCod = new String[] {""} ;
      P02DG10_A741PrdUltLin = new short[1] ;
      P02DG10_A315ContNum = new int[1] ;
      P02DG10_A310ColUltLin = new short[1] ;
      P02DG10_A486ForNumCol = new int[1] ;
      P02DG10_A6371Lb_fam3 = new byte[1] ;
      P02DG10_A6370Lb_fam2 = new byte[1] ;
      P02DG10_A6369Lb_fam1 = new byte[1] ;
      P02DG10_A6310Lb_TaAuxC = new String[] {""} ;
      P02DG10_n6310Lb_TaAuxC = new boolean[] {false} ;
      P02DG10_A318CosKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A6310Lb_TaAuxC = "" ;
      A318CosKgm = DecimalUtil.ZERO ;
      P02DG12_A396EmprCod = new String[] {""} ;
      P02DG12_A489ForPrdNor = new short[1] ;
      P02DG12_A490ForPrdUMe = new byte[1] ;
      P02DG12_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG12_A719PrdNum = new String[] {""} ;
      P02DG12_A715PrdLin = new short[1] ;
      P02DG12_A486ForNumCol = new int[1] ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV31PrdNum = "" ;
      AV32ForPrdCan = DecimalUtil.ZERO ;
      W719PrdNum = "" ;
      W487ForPrdCan = DecimalUtil.ZERO ;
      P02DG14_A396EmprCod = new String[] {""} ;
      P02DG14_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DG14_A490ForPrdUMe = new byte[1] ;
      P02DG14_A719PrdNum = new String[] {""} ;
      P02DG14_A309ColLin = new short[1] ;
      P02DG14_A486ForNumCol = new int[1] ;
      P02DG14_A13926ColFibra = new String[] {""} ;
      P02DG14_n13926ColFibra = new boolean[] {false} ;
      P02DG14_A6193ForClaCol = new String[] {""} ;
      P02DG14_A838TotLinCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A481ForCan = DecimalUtil.ZERO ;
      A13926ColFibra = "" ;
      A6193ForClaCol = "" ;
      A838TotLinCol = DecimalUtil.ZERO ;
      AV36Produc = "" ;
      AV37ForCan = DecimalUtil.ZERO ;
      W481ForCan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdupfork__default(),
         new Object[] {
             new Object[] {
            P02DG2_A396EmprCod, P02DG2_A252CliCod, P02DG2_A494ForSer, P02DG2_A482ForColNom, P02DG2_A483ForColNum, P02DG2_A831TipColCod, P02DG2_A13911ForSerDsc2, P02DG2_n13911ForSerDsc2, P02DG2_A12401ForKgMn, P02DG2_n12401ForKgMn,
            P02DG2_A12400ForTRabs, P02DG2_n12400ForTRabs, P02DG2_A12399ForMT, P02DG2_n12399ForMT, P02DG2_A8561Fam_Cod, P02DG2_n8561Fam_Cod, P02DG2_A7781ForBlo, P02DG2_n7781ForBlo, P02DG2_A7537ForOpNum, P02DG2_n7537ForOpNum,
            P02DG2_A6609ForFecCre, P02DG2_n6609ForFecCre, P02DG2_A6608ForUsrCre, P02DG2_n6608ForUsrCre, P02DG2_A5742ForSerDsc, P02DG2_n5742ForSerDsc, P02DG2_A5625ForFecHor, P02DG2_n5625ForFecHor, P02DG2_A5624ForUsrCod, P02DG2_n5624ForUsrCod,
            P02DG2_A4384ForTipArt, P02DG2_n4384ForTipArt, P02DG2_A4380ForCosForm, P02DG2_n4380ForCosForm, P02DG2_A3560ForOpcCli, P02DG2_n3560ForOpcCli, P02DG2_A3558ForFecApr, P02DG2_n3558ForFecApr, P02DG2_A3315ForNumArc, P02DG2_n3315ForNumArc,
            P02DG2_A1192ForNumCli, P02DG2_n1192ForNumCli, P02DG2_A1191ForNomCli, P02DG2_n1191ForNomCli, P02DG2_A491ForPreDef, P02DG2_n491ForPreDef, P02DG2_A493ForPreMtr, P02DG2_n493ForPreMtr, P02DG2_A492ForPreKgm, P02DG2_n492ForPreKgm,
            P02DG2_A496ForUltUti, P02DG2_n496ForUltUti, P02DG2_A486ForNumCol, P02DG2_A13913ForPlanta, P02DG2_n13913ForPlanta, P02DG2_A13912ForAlterna, P02DG2_n13912ForAlterna, P02DG2_A13102ForLbTalao, P02DG2_n13102ForLbTalao, P02DG2_A12732ForObsFac,
            P02DG2_n12732ForObsFac, P02DG2_A12404ForLotHil3, P02DG2_n12404ForLotHil3, P02DG2_A12403ForLotHil2, P02DG2_n12403ForLotHil2, P02DG2_A12200ForCurva, P02DG2_n12200ForCurva, P02DG2_A12130ForPanto, P02DG2_n12130ForPanto, P02DG2_A11706ForObs2,
            P02DG2_n11706ForObs2, P02DG2_A11705For_item2, P02DG2_n11705For_item2, P02DG2_A3587ForFecAnt, P02DG2_n3587ForFecAnt, P02DG2_A3586ForPreAnt, P02DG2_n3586ForPreAnt, P02DG2_A3585ForPreFec, P02DG2_n3585ForPreFec, P02DG2_A3569UltEnsCod,
            P02DG2_n3569UltEnsCod, P02DG2_A4226ForCosTTi, P02DG2_n4226ForCosTTi, P02DG2_A4225ForKgTTin, P02DG2_n4225ForKgTTin, P02DG2_A4224ForKgUTin, P02DG2_n4224ForKgUTin, P02DG2_A11290ForCosFin, P02DG2_n11290ForCosFin, P02DG2_A11280ForCosFab,
            P02DG2_n11280ForCosFab, P02DG2_A11279ForcosH20, P02DG2_n11279ForcosH20, P02DG2_A11042ForFecCtrf, P02DG2_n11042ForFecCtrf, P02DG2_A11041ForFecCtrl, P02DG2_n11041ForFecCtrl, P02DG2_A9792For_Reo, P02DG2_n9792For_Reo, P02DG2_A9621Lb_CodC,
            P02DG2_n9621Lb_CodC, P02DG2_A9619Lb_CodL, P02DG2_n9619Lb_CodL, P02DG2_A8777For_item1, P02DG2_n8777For_item1, P02DG2_A8043ForTipT, P02DG2_n8043ForTipT, P02DG2_A7796Sim_Ulin, P02DG2_n7796Sim_Ulin, P02DG2_A7029ForNomCli3,
            P02DG2_n7029ForNomCli3, P02DG2_A6379ForNomCli2, P02DG2_n6379ForNomCli2, P02DG2_A5653ForPInc, P02DG2_n5653ForPInc, P02DG2_A5626ForObsM, P02DG2_n5626ForObsM, P02DG2_A5362IntCodF, P02DG2_n5362IntCodF, P02DG2_A5337ForCodExt,
            P02DG2_n5337ForCodExt, P02DG2_A4339ForRGB, P02DG2_n4339ForRGB, P02DG2_A4223ForCosUti, P02DG2_n4223ForCosUti, P02DG2_A1514MacProCod, P02DG2_n1514MacProCod, P02DG2_A3688ComUltLin, P02DG2_n3688ComUltLin, P02DG2_A3588ForEst,
            P02DG2_n3588ForEst, P02DG2_A3559ForSitCom, P02DG2_n3559ForSitCom, P02DG2_A3316CodSol, P02DG2_n3316CodSol, P02DG2_A995ForTonal, P02DG2_n995ForTonal, P02DG2_A3008PrecioM, P02DG2_n3008PrecioM, P02DG2_A3007PrecioA,
            P02DG2_n3007PrecioA, P02DG2_A2838ForRelBan, P02DG2_n2838ForRelBan, P02DG2_A2749ForPro, P02DG2_n2749ForPro, P02DG2_A1518RecCorULin, P02DG2_n1518RecCorULin, P02DG2_A1159ForUltLin, P02DG2_n1159ForUltLin, P02DG2_A651ObsUltLin,
            P02DG2_n651ObsUltLin, P02DG2_A484ForCon, P02DG2_A626MatCod, P02DG2_A583IntCod, P02DG2_A495ForUltMod, P02DG2_n495ForUltMod, P02DG2_A485ForFec, P02DG2_n485ForFec, P02DG2_A130BarCodPar, P02DG2_n130BarCodPar,
            P02DG2_A132BarCodReo, P02DG2_n132BarCodReo, P02DG2_A129BarCod, P02DG2_n129BarCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02DG4_A396EmprCod, P02DG4_A252CliCod, P02DG4_A494ForSer, P02DG4_A482ForColNom, P02DG4_A483ForColNum, P02DG4_A831TipColCod, P02DG4_A764ProForCod, P02DG4_A1160ProForL, P02DG4_A14198ProforFabs, P02DG4_A10542ProForH2O,
            P02DG4_A9707ProForMq, P02DG4_A9704ProForVol, P02DG4_A8656ProForrbn, P02DG4_A7802ProFoNPrg, P02DG4_A6549ProForFR
            }
            , new Object[] {
            }
            , new Object[] {
            P02DG6_A396EmprCod, P02DG6_A252CliCod, P02DG6_A494ForSer, P02DG6_A482ForColNom, P02DG6_A483ForColNum, P02DG6_A831TipColCod, P02DG6_A6186Mq_Prog, P02DG6_n6186Mq_Prog, P02DG6_A6037Mq_Grupo, P02DG6_A6268Mq_Prog3,
            P02DG6_n6268Mq_Prog3, P02DG6_A6267Mq_Prog2, P02DG6_n6267Mq_Prog2
            }
            , new Object[] {
            }
            , new Object[] {
            P02DG8_A396EmprCod, P02DG8_A252CliCod, P02DG8_A494ForSer, P02DG8_A482ForColNom, P02DG8_A483ForColNum, P02DG8_A831TipColCod, P02DG8_A649ObsForTxt, P02DG8_A650ObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            P02DG10_A396EmprCod, P02DG10_A741PrdUltLin, P02DG10_A315ContNum, P02DG10_A310ColUltLin, P02DG10_A486ForNumCol, P02DG10_A6371Lb_fam3, P02DG10_A6370Lb_fam2, P02DG10_A6369Lb_fam1, P02DG10_A6310Lb_TaAuxC, P02DG10_n6310Lb_TaAuxC,
            P02DG10_A318CosKgm
            }
            , new Object[] {
            }
            , new Object[] {
            P02DG12_A396EmprCod, P02DG12_A489ForPrdNor, P02DG12_A490ForPrdUMe, P02DG12_A487ForPrdCan, P02DG12_A719PrdNum, P02DG12_A715PrdLin, P02DG12_A486ForNumCol
            }
            , new Object[] {
            }
            , new Object[] {
            P02DG14_A396EmprCod, P02DG14_A481ForCan, P02DG14_A490ForPrdUMe, P02DG14_A719PrdNum, P02DG14_A309ColLin, P02DG14_A486ForNumCol, P02DG14_A13926ColFibra, P02DG14_n13926ColFibra, P02DG14_A6193ForClaCol, P02DG14_A838TotLinCol
            }
            , new Object[] {
            }
         }
      );
      AV79Pgmname = "PDUPFORk" ;
      /* GeneXus formulas. */
      AV79Pgmname = "PDUPFORk" ;
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV19TipColCod ;
   private byte AV20Flag ;
   private byte AV39Pervaf ;
   private byte AV46F_tintutex ;
   private byte AV49Obs_equiv ;
   private byte AV52Moda21 ;
   private byte AV63Kohler ;
   private byte AV68Lindalana ;
   private byte AV69Carvema ;
   private byte AV70eldorado ;
   private byte AV71carvitin ;
   private byte GXt_int6 ;
   private byte GXv_int5[] ;
   private byte A12400ForTRabs ;
   private byte A12399ForMT ;
   private byte A7537ForOpNum ;
   private byte A13913ForPlanta ;
   private byte A9621Lb_CodC ;
   private byte A9619Lb_CodL ;
   private byte A8043ForTipT ;
   private byte A5362IntCodF ;
   private byte A1518RecCorULin ;
   private byte A484ForCon ;
   private byte A583IntCod ;
   private byte A132BarCodReo ;
   private byte W831TipColCod ;
   private byte W7537ForOpNum ;
   private byte W12399ForMT ;
   private byte W12400ForTRabs ;
   private byte A6037Mq_Grupo ;
   private byte AV59MQ_GRUPO ;
   private byte W6037Mq_Grupo ;
   private byte A6371Lb_fam3 ;
   private byte A6370Lb_fam2 ;
   private byte A6369Lb_fam1 ;
   private byte A490ForPrdUMe ;
   private byte AV33ForPrdUme ;
   private byte W490ForPrdUMe ;
   private short AV72ContForfec ;
   private short A8561Fam_Cod ;
   private short A4384ForTipArt ;
   private short A7796Sim_Ulin ;
   private short A5653ForPInc ;
   private short A3688ComUltLin ;
   private short A3316CodSol ;
   private short A1159ForUltLin ;
   private short A651ObsUltLin ;
   private short A626MatCod ;
   private short AV65Fam_cod ;
   private short AV74Fortipart ;
   private short GXt_int8 ;
   private short GXv_int9[] ;
   private short W8561Fam_Cod ;
   private short W4384ForTipArt ;
   private short Gx_err ;
   private short A1160ProForL ;
   private short A10542ProForH2O ;
   private short AV23ProForL ;
   private short W1160ProForL ;
   private short A650ObsLin ;
   private short AV25ObsLin ;
   private short W650ObsLin ;
   private short A741PrdUltLin ;
   private short A310ColUltLin ;
   private short AV27PrdUltLin ;
   private short AV28ColUltLin ;
   private short W741PrdUltLin ;
   private short W310ColUltLin ;
   private short A489ForPrdNor ;
   private short A715PrdLin ;
   private short AV30PrdLin ;
   private short AV34ForPrdNor ;
   private short W715PrdLin ;
   private short W489ForPrdNor ;
   private short A309ColLin ;
   private short AV35ColLin ;
   private short W309ColLin ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV15CliCod ;
   private int AV18ForColNum ;
   private int AV62ForNumCli ;
   private int AV21ForNumCol ;
   private int A3315ForNumArc ;
   private int A1192ForNumCli ;
   private int A486ForNumCol ;
   private int A129BarCod ;
   private int W252CliCod ;
   private int W483ForColNum ;
   private int AV47CliCod_or ;
   private int AV22NumCol ;
   private int GX_INS47 ;
   private int W486ForNumCol ;
   private int W1192ForNumCli ;
   private int W3315ForNumArc ;
   private int GXv_int7[] ;
   private int A9704ProForVol ;
   private int A7802ProFoNPrg ;
   private int GX_INS154 ;
   private int A6186Mq_Prog ;
   private int A6268Mq_Prog3 ;
   private int A6267Mq_Prog2 ;
   private int AV60MQ_PROG ;
   private int GX_INS1550 ;
   private int W6186Mq_Prog ;
   private int GX_INS74 ;
   private int A315ContNum ;
   private int AV29ContNum ;
   private int GX_INS32 ;
   private int W315ContNum ;
   private int GX_INS82 ;
   private int GX_INS33 ;
   private long A4339ForRGB ;
   private long AV64ForRgb ;
   private java.math.BigDecimal A12401ForKgMn ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal A493ForPreMtr ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A3586ForPreAnt ;
   private java.math.BigDecimal A4226ForCosTTi ;
   private java.math.BigDecimal A4225ForKgTTin ;
   private java.math.BigDecimal A4224ForKgUTin ;
   private java.math.BigDecimal A11290ForCosFin ;
   private java.math.BigDecimal A11280ForCosFab ;
   private java.math.BigDecimal A11279ForcosH20 ;
   private java.math.BigDecimal A4223ForCosUti ;
   private java.math.BigDecimal A3008PrecioM ;
   private java.math.BigDecimal A3007PrecioA ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal AV50ForPreKgm ;
   private java.math.BigDecimal AV51ForPreMtr ;
   private java.math.BigDecimal AV67Forcosform ;
   private java.math.BigDecimal W492ForPreKgm ;
   private java.math.BigDecimal W493ForPreMtr ;
   private java.math.BigDecimal W4380ForCosForm ;
   private java.math.BigDecimal W12401ForKgMn ;
   private java.math.BigDecimal A14198ProforFabs ;
   private java.math.BigDecimal A8656ProForrbn ;
   private java.math.BigDecimal A318CosKgm ;
   private java.math.BigDecimal A487ForPrdCan ;
   private java.math.BigDecimal AV32ForPrdCan ;
   private java.math.BigDecimal W487ForPrdCan ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal A838TotLinCol ;
   private java.math.BigDecimal AV37ForCan ;
   private java.math.BigDecimal W481ForCan ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV16ForSer ;
   private String AV17ForColNom ;
   private String AV61ForNomCli ;
   private String AV55Usurcod ;
   private String AV56Station ;
   private String AV57EmprNom ;
   private String scmdbuf ;
   private String A7781ForBlo ;
   private String A6608ForUsrCre ;
   private String A5742ForSerDsc ;
   private String A5624ForUsrCod ;
   private String A3560ForOpcCli ;
   private String A1191ForNomCli ;
   private String A491ForPreDef ;
   private String A13912ForAlterna ;
   private String A13102ForLbTalao ;
   private String A12404ForLotHil3 ;
   private String A12403ForLotHil2 ;
   private String A12200ForCurva ;
   private String A12130ForPanto ;
   private String A11705For_item2 ;
   private String A3569UltEnsCod ;
   private String A9792For_Reo ;
   private String A8777For_item1 ;
   private String A7029ForNomCli3 ;
   private String A6379ForNomCli2 ;
   private String A5337ForCodExt ;
   private String A1514MacProCod ;
   private String A3588ForEst ;
   private String A3559ForSitCom ;
   private String A995ForTonal ;
   private String A2749ForPro ;
   private String A130BarCodPar ;
   private String W494ForSer ;
   private String W482ForColNom ;
   private String AV53ForPreDef ;
   private String AV66ForBlo ;
   private String AV58ForSerDsc ;
   private String W491ForPreDef ;
   private String W5742ForSerDsc ;
   private String W1191ForNomCli ;
   private String W7781ForBlo ;
   private String W3560ForOpcCli ;
   private String W7029ForNomCli3 ;
   private String W995ForTonal ;
   private String W5624ForUsrCod ;
   private String W6608ForUsrCre ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private String Gx_msg ;
   private String AV79Pgmname ;
   private String A764ProForCod ;
   private String A9707ProForMq ;
   private String A6549ProForFR ;
   private String AV24ProForCod ;
   private String W764ProForCod ;
   private String W6549ProForFR ;
   private String A649ObsForTxt ;
   private String AV26ObsForTxt ;
   private String W649ObsForTxt ;
   private String A6310Lb_TaAuxC ;
   private String A719PrdNum ;
   private String AV31PrdNum ;
   private String W719PrdNum ;
   private String A13926ColFibra ;
   private String A6193ForClaCol ;
   private String AV36Produc ;
   private java.util.Date A6609ForFecCre ;
   private java.util.Date A5625ForFecHor ;
   private java.util.Date A11042ForFecCtrf ;
   private java.util.Date A11041ForFecCtrl ;
   private java.util.Date W5625ForFecHor ;
   private java.util.Date W6609ForFecCre ;
   private java.util.Date A3558ForFecApr ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date A3587ForFecAnt ;
   private java.util.Date A3585ForPreFec ;
   private java.util.Date A495ForUltMod ;
   private java.util.Date A485ForFec ;
   private java.util.Date W496ForUltUti ;
   private java.util.Date W3558ForFecApr ;
   private java.util.Date W485ForFec ;
   private boolean n13911ForSerDsc2 ;
   private boolean n12401ForKgMn ;
   private boolean n12400ForTRabs ;
   private boolean n12399ForMT ;
   private boolean n8561Fam_Cod ;
   private boolean n7781ForBlo ;
   private boolean n7537ForOpNum ;
   private boolean n6609ForFecCre ;
   private boolean n6608ForUsrCre ;
   private boolean n5742ForSerDsc ;
   private boolean n5625ForFecHor ;
   private boolean n5624ForUsrCod ;
   private boolean n4384ForTipArt ;
   private boolean n4380ForCosForm ;
   private boolean n3560ForOpcCli ;
   private boolean n3558ForFecApr ;
   private boolean n3315ForNumArc ;
   private boolean n1192ForNumCli ;
   private boolean n1191ForNomCli ;
   private boolean n491ForPreDef ;
   private boolean n493ForPreMtr ;
   private boolean n492ForPreKgm ;
   private boolean n496ForUltUti ;
   private boolean n13913ForPlanta ;
   private boolean n13912ForAlterna ;
   private boolean n13102ForLbTalao ;
   private boolean n12732ForObsFac ;
   private boolean n12404ForLotHil3 ;
   private boolean n12403ForLotHil2 ;
   private boolean n12200ForCurva ;
   private boolean n12130ForPanto ;
   private boolean n11706ForObs2 ;
   private boolean n11705For_item2 ;
   private boolean n3587ForFecAnt ;
   private boolean n3586ForPreAnt ;
   private boolean n3585ForPreFec ;
   private boolean n3569UltEnsCod ;
   private boolean n4226ForCosTTi ;
   private boolean n4225ForKgTTin ;
   private boolean n4224ForKgUTin ;
   private boolean n11290ForCosFin ;
   private boolean n11280ForCosFab ;
   private boolean n11279ForcosH20 ;
   private boolean n11042ForFecCtrf ;
   private boolean n11041ForFecCtrl ;
   private boolean n9792For_Reo ;
   private boolean n9621Lb_CodC ;
   private boolean n9619Lb_CodL ;
   private boolean n8777For_item1 ;
   private boolean n8043ForTipT ;
   private boolean n7796Sim_Ulin ;
   private boolean n7029ForNomCli3 ;
   private boolean n6379ForNomCli2 ;
   private boolean n5653ForPInc ;
   private boolean n5626ForObsM ;
   private boolean n5362IntCodF ;
   private boolean n5337ForCodExt ;
   private boolean n4339ForRGB ;
   private boolean n4223ForCosUti ;
   private boolean n1514MacProCod ;
   private boolean n3688ComUltLin ;
   private boolean n3588ForEst ;
   private boolean n3559ForSitCom ;
   private boolean n3316CodSol ;
   private boolean n995ForTonal ;
   private boolean n3008PrecioM ;
   private boolean n3007PrecioA ;
   private boolean n2838ForRelBan ;
   private boolean n2749ForPro ;
   private boolean n1518RecCorULin ;
   private boolean n1159ForUltLin ;
   private boolean n651ObsUltLin ;
   private boolean n495ForUltMod ;
   private boolean n485ForFec ;
   private boolean n130BarCodPar ;
   private boolean n132BarCodReo ;
   private boolean n129BarCod ;
   private boolean n6186Mq_Prog ;
   private boolean n6268Mq_Prog3 ;
   private boolean n6267Mq_Prog2 ;
   private boolean n6310Lb_TaAuxC ;
   private boolean n13926ColFibra ;
   private String A13911ForSerDsc2 ;
   private String A12732ForObsFac ;
   private String A11706ForObs2 ;
   private String A5626ForObsM ;
   private String W13911ForSerDsc2 ;
   private String AV73ForSerDsc2 ;
   private String AV54Texto_i ;
   private byte[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private int[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private int[] aP9 ;
   private byte[] aP10 ;
   private String[] aP11 ;
   private int[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P02DG2_A396EmprCod ;
   private int[] P02DG2_A252CliCod ;
   private String[] P02DG2_A494ForSer ;
   private String[] P02DG2_A482ForColNom ;
   private int[] P02DG2_A483ForColNum ;
   private byte[] P02DG2_A831TipColCod ;
   private String[] P02DG2_A13911ForSerDsc2 ;
   private boolean[] P02DG2_n13911ForSerDsc2 ;
   private java.math.BigDecimal[] P02DG2_A12401ForKgMn ;
   private boolean[] P02DG2_n12401ForKgMn ;
   private byte[] P02DG2_A12400ForTRabs ;
   private boolean[] P02DG2_n12400ForTRabs ;
   private byte[] P02DG2_A12399ForMT ;
   private boolean[] P02DG2_n12399ForMT ;
   private short[] P02DG2_A8561Fam_Cod ;
   private boolean[] P02DG2_n8561Fam_Cod ;
   private String[] P02DG2_A7781ForBlo ;
   private boolean[] P02DG2_n7781ForBlo ;
   private byte[] P02DG2_A7537ForOpNum ;
   private boolean[] P02DG2_n7537ForOpNum ;
   private java.util.Date[] P02DG2_A6609ForFecCre ;
   private boolean[] P02DG2_n6609ForFecCre ;
   private String[] P02DG2_A6608ForUsrCre ;
   private boolean[] P02DG2_n6608ForUsrCre ;
   private String[] P02DG2_A5742ForSerDsc ;
   private boolean[] P02DG2_n5742ForSerDsc ;
   private java.util.Date[] P02DG2_A5625ForFecHor ;
   private boolean[] P02DG2_n5625ForFecHor ;
   private String[] P02DG2_A5624ForUsrCod ;
   private boolean[] P02DG2_n5624ForUsrCod ;
   private short[] P02DG2_A4384ForTipArt ;
   private boolean[] P02DG2_n4384ForTipArt ;
   private java.math.BigDecimal[] P02DG2_A4380ForCosForm ;
   private boolean[] P02DG2_n4380ForCosForm ;
   private String[] P02DG2_A3560ForOpcCli ;
   private boolean[] P02DG2_n3560ForOpcCli ;
   private java.util.Date[] P02DG2_A3558ForFecApr ;
   private boolean[] P02DG2_n3558ForFecApr ;
   private int[] P02DG2_A3315ForNumArc ;
   private boolean[] P02DG2_n3315ForNumArc ;
   private int[] P02DG2_A1192ForNumCli ;
   private boolean[] P02DG2_n1192ForNumCli ;
   private String[] P02DG2_A1191ForNomCli ;
   private boolean[] P02DG2_n1191ForNomCli ;
   private String[] P02DG2_A491ForPreDef ;
   private boolean[] P02DG2_n491ForPreDef ;
   private java.math.BigDecimal[] P02DG2_A493ForPreMtr ;
   private boolean[] P02DG2_n493ForPreMtr ;
   private java.math.BigDecimal[] P02DG2_A492ForPreKgm ;
   private boolean[] P02DG2_n492ForPreKgm ;
   private java.util.Date[] P02DG2_A496ForUltUti ;
   private boolean[] P02DG2_n496ForUltUti ;
   private int[] P02DG2_A486ForNumCol ;
   private byte[] P02DG2_A13913ForPlanta ;
   private boolean[] P02DG2_n13913ForPlanta ;
   private String[] P02DG2_A13912ForAlterna ;
   private boolean[] P02DG2_n13912ForAlterna ;
   private String[] P02DG2_A13102ForLbTalao ;
   private boolean[] P02DG2_n13102ForLbTalao ;
   private String[] P02DG2_A12732ForObsFac ;
   private boolean[] P02DG2_n12732ForObsFac ;
   private String[] P02DG2_A12404ForLotHil3 ;
   private boolean[] P02DG2_n12404ForLotHil3 ;
   private String[] P02DG2_A12403ForLotHil2 ;
   private boolean[] P02DG2_n12403ForLotHil2 ;
   private String[] P02DG2_A12200ForCurva ;
   private boolean[] P02DG2_n12200ForCurva ;
   private String[] P02DG2_A12130ForPanto ;
   private boolean[] P02DG2_n12130ForPanto ;
   private String[] P02DG2_A11706ForObs2 ;
   private boolean[] P02DG2_n11706ForObs2 ;
   private String[] P02DG2_A11705For_item2 ;
   private boolean[] P02DG2_n11705For_item2 ;
   private java.util.Date[] P02DG2_A3587ForFecAnt ;
   private boolean[] P02DG2_n3587ForFecAnt ;
   private java.math.BigDecimal[] P02DG2_A3586ForPreAnt ;
   private boolean[] P02DG2_n3586ForPreAnt ;
   private java.util.Date[] P02DG2_A3585ForPreFec ;
   private boolean[] P02DG2_n3585ForPreFec ;
   private String[] P02DG2_A3569UltEnsCod ;
   private boolean[] P02DG2_n3569UltEnsCod ;
   private java.math.BigDecimal[] P02DG2_A4226ForCosTTi ;
   private boolean[] P02DG2_n4226ForCosTTi ;
   private java.math.BigDecimal[] P02DG2_A4225ForKgTTin ;
   private boolean[] P02DG2_n4225ForKgTTin ;
   private java.math.BigDecimal[] P02DG2_A4224ForKgUTin ;
   private boolean[] P02DG2_n4224ForKgUTin ;
   private java.math.BigDecimal[] P02DG2_A11290ForCosFin ;
   private boolean[] P02DG2_n11290ForCosFin ;
   private java.math.BigDecimal[] P02DG2_A11280ForCosFab ;
   private boolean[] P02DG2_n11280ForCosFab ;
   private java.math.BigDecimal[] P02DG2_A11279ForcosH20 ;
   private boolean[] P02DG2_n11279ForcosH20 ;
   private java.util.Date[] P02DG2_A11042ForFecCtrf ;
   private boolean[] P02DG2_n11042ForFecCtrf ;
   private java.util.Date[] P02DG2_A11041ForFecCtrl ;
   private boolean[] P02DG2_n11041ForFecCtrl ;
   private String[] P02DG2_A9792For_Reo ;
   private boolean[] P02DG2_n9792For_Reo ;
   private byte[] P02DG2_A9621Lb_CodC ;
   private boolean[] P02DG2_n9621Lb_CodC ;
   private byte[] P02DG2_A9619Lb_CodL ;
   private boolean[] P02DG2_n9619Lb_CodL ;
   private String[] P02DG2_A8777For_item1 ;
   private boolean[] P02DG2_n8777For_item1 ;
   private byte[] P02DG2_A8043ForTipT ;
   private boolean[] P02DG2_n8043ForTipT ;
   private short[] P02DG2_A7796Sim_Ulin ;
   private boolean[] P02DG2_n7796Sim_Ulin ;
   private String[] P02DG2_A7029ForNomCli3 ;
   private boolean[] P02DG2_n7029ForNomCli3 ;
   private String[] P02DG2_A6379ForNomCli2 ;
   private boolean[] P02DG2_n6379ForNomCli2 ;
   private short[] P02DG2_A5653ForPInc ;
   private boolean[] P02DG2_n5653ForPInc ;
   private String[] P02DG2_A5626ForObsM ;
   private boolean[] P02DG2_n5626ForObsM ;
   private byte[] P02DG2_A5362IntCodF ;
   private boolean[] P02DG2_n5362IntCodF ;
   private String[] P02DG2_A5337ForCodExt ;
   private boolean[] P02DG2_n5337ForCodExt ;
   private long[] P02DG2_A4339ForRGB ;
   private boolean[] P02DG2_n4339ForRGB ;
   private java.math.BigDecimal[] P02DG2_A4223ForCosUti ;
   private boolean[] P02DG2_n4223ForCosUti ;
   private String[] P02DG2_A1514MacProCod ;
   private boolean[] P02DG2_n1514MacProCod ;
   private short[] P02DG2_A3688ComUltLin ;
   private boolean[] P02DG2_n3688ComUltLin ;
   private String[] P02DG2_A3588ForEst ;
   private boolean[] P02DG2_n3588ForEst ;
   private String[] P02DG2_A3559ForSitCom ;
   private boolean[] P02DG2_n3559ForSitCom ;
   private short[] P02DG2_A3316CodSol ;
   private boolean[] P02DG2_n3316CodSol ;
   private String[] P02DG2_A995ForTonal ;
   private boolean[] P02DG2_n995ForTonal ;
   private java.math.BigDecimal[] P02DG2_A3008PrecioM ;
   private boolean[] P02DG2_n3008PrecioM ;
   private java.math.BigDecimal[] P02DG2_A3007PrecioA ;
   private boolean[] P02DG2_n3007PrecioA ;
   private java.math.BigDecimal[] P02DG2_A2838ForRelBan ;
   private boolean[] P02DG2_n2838ForRelBan ;
   private String[] P02DG2_A2749ForPro ;
   private boolean[] P02DG2_n2749ForPro ;
   private byte[] P02DG2_A1518RecCorULin ;
   private boolean[] P02DG2_n1518RecCorULin ;
   private short[] P02DG2_A1159ForUltLin ;
   private boolean[] P02DG2_n1159ForUltLin ;
   private short[] P02DG2_A651ObsUltLin ;
   private boolean[] P02DG2_n651ObsUltLin ;
   private byte[] P02DG2_A484ForCon ;
   private short[] P02DG2_A626MatCod ;
   private byte[] P02DG2_A583IntCod ;
   private java.util.Date[] P02DG2_A495ForUltMod ;
   private boolean[] P02DG2_n495ForUltMod ;
   private java.util.Date[] P02DG2_A485ForFec ;
   private boolean[] P02DG2_n485ForFec ;
   private String[] P02DG2_A130BarCodPar ;
   private boolean[] P02DG2_n130BarCodPar ;
   private byte[] P02DG2_A132BarCodReo ;
   private boolean[] P02DG2_n132BarCodReo ;
   private int[] P02DG2_A129BarCod ;
   private boolean[] P02DG2_n129BarCod ;
   private String[] P02DG4_A396EmprCod ;
   private int[] P02DG4_A252CliCod ;
   private String[] P02DG4_A494ForSer ;
   private String[] P02DG4_A482ForColNom ;
   private int[] P02DG4_A483ForColNum ;
   private byte[] P02DG4_A831TipColCod ;
   private String[] P02DG4_A764ProForCod ;
   private short[] P02DG4_A1160ProForL ;
   private java.math.BigDecimal[] P02DG4_A14198ProforFabs ;
   private short[] P02DG4_A10542ProForH2O ;
   private String[] P02DG4_A9707ProForMq ;
   private int[] P02DG4_A9704ProForVol ;
   private java.math.BigDecimal[] P02DG4_A8656ProForrbn ;
   private int[] P02DG4_A7802ProFoNPrg ;
   private String[] P02DG4_A6549ProForFR ;
   private String[] P02DG6_A396EmprCod ;
   private int[] P02DG6_A252CliCod ;
   private String[] P02DG6_A494ForSer ;
   private String[] P02DG6_A482ForColNom ;
   private int[] P02DG6_A483ForColNum ;
   private byte[] P02DG6_A831TipColCod ;
   private int[] P02DG6_A6186Mq_Prog ;
   private boolean[] P02DG6_n6186Mq_Prog ;
   private byte[] P02DG6_A6037Mq_Grupo ;
   private int[] P02DG6_A6268Mq_Prog3 ;
   private boolean[] P02DG6_n6268Mq_Prog3 ;
   private int[] P02DG6_A6267Mq_Prog2 ;
   private boolean[] P02DG6_n6267Mq_Prog2 ;
   private String[] P02DG8_A396EmprCod ;
   private int[] P02DG8_A252CliCod ;
   private String[] P02DG8_A494ForSer ;
   private String[] P02DG8_A482ForColNom ;
   private int[] P02DG8_A483ForColNum ;
   private byte[] P02DG8_A831TipColCod ;
   private String[] P02DG8_A649ObsForTxt ;
   private short[] P02DG8_A650ObsLin ;
   private String[] P02DG10_A396EmprCod ;
   private short[] P02DG10_A741PrdUltLin ;
   private int[] P02DG10_A315ContNum ;
   private short[] P02DG10_A310ColUltLin ;
   private int[] P02DG10_A486ForNumCol ;
   private byte[] P02DG10_A6371Lb_fam3 ;
   private byte[] P02DG10_A6370Lb_fam2 ;
   private byte[] P02DG10_A6369Lb_fam1 ;
   private String[] P02DG10_A6310Lb_TaAuxC ;
   private boolean[] P02DG10_n6310Lb_TaAuxC ;
   private java.math.BigDecimal[] P02DG10_A318CosKgm ;
   private String[] P02DG12_A396EmprCod ;
   private short[] P02DG12_A489ForPrdNor ;
   private byte[] P02DG12_A490ForPrdUMe ;
   private java.math.BigDecimal[] P02DG12_A487ForPrdCan ;
   private String[] P02DG12_A719PrdNum ;
   private short[] P02DG12_A715PrdLin ;
   private int[] P02DG12_A486ForNumCol ;
   private String[] P02DG14_A396EmprCod ;
   private java.math.BigDecimal[] P02DG14_A481ForCan ;
   private byte[] P02DG14_A490ForPrdUMe ;
   private String[] P02DG14_A719PrdNum ;
   private short[] P02DG14_A309ColLin ;
   private int[] P02DG14_A486ForNumCol ;
   private String[] P02DG14_A13926ColFibra ;
   private boolean[] P02DG14_n13926ColFibra ;
   private String[] P02DG14_A6193ForClaCol ;
   private java.math.BigDecimal[] P02DG14_A838TotLinCol ;
}

final  class pdupfork__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02DG2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForSerDsc2, ForKgMn, ForTRabs, ForMT, Fam_Cod, ForBlo, ForOpNum, ForFecCre, ForUsrCre, ForSerDsc, ForFecHor, ForUsrCod, ForTipArt, ForCosForm, ForOpcCli, ForFecApr, ForNumArc, ForNumCli, ForNomCli, ForPreDef, ForPreMtr, ForPreKgm, ForUltUti, ForNumCol, ForPlanta, ForAlterna, ForLbTalao, ForObsFac, ForLotHil3, ForLotHil2, ForCurva, ForPanto, ForObs2, For_item2, ForFecAnt, ForPreAnt, ForPreFec, UltEnsCod, ForCosTTi, ForKgTTin, ForKgUTin, ForCosFin, ForCosFab, ForcosH20, ForFecCtrf, ForFecCtrl, For_Reo, Lb_CodC, Lb_CodL, For_item1, ForTipT, Sim_Ulin, ForNomCli3, ForNomCli2, ForPInc, ForObsM, IntCodF, ForCodExt, ForRGB, ForCosUti, MacProCod, ComUltLin, ForEst, ForSitCom, CodSol, ForTonal, PrecioM, PrecioA, ForRelBan, ForPro, RecCorULin, ForUltLin, ObsUltLin, ForCon, MatCod, IntCod, ForUltMod, ForFec, BarCodPar, BarCodReo, BarCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02DG3", "INSERT INTO TXPCFORMU(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForNumCol, BarCod, BarCodReo, BarCodPar, ForFec, ForUltMod, IntCod, MatCod, ForUltUti, ForPreKgm, ForPreMtr, ForPreDef, ForCon, ObsUltLin, ForUltLin, ForNomCli, ForNumCli, RecCorULin, ForPro, ForRelBan, PrecioA, PrecioM, ForTonal, ForNumArc, CodSol, ForFecApr, ForSitCom, ForOpcCli, ForEst, ComUltLin, MacProCod, ForCosUti, ForRGB, ForCosForm, ForTipArt, ForCodExt, IntCodF, ForUsrCod, ForFecHor, ForObsM, ForPInc, ForSerDsc, ForNomCli2, ForUsrCre, ForFecCre, ForNomCli3, ForOpNum, ForBlo, Sim_Ulin, ForTipT, Fam_Cod, For_item1, Lb_CodL, Lb_CodC, For_Reo, ForFecCtrl, ForFecCtrf, ForcosH20, ForCosFab, ForCosFin, ForKgUTin, ForKgTTin, ForCosTTi, UltEnsCod, ForPreFec, ForPreAnt, ForFecAnt, For_item2, ForObs2, ForPanto, ForCurva, ForMT, ForTRabs, ForKgMn, ForLotHil2, ForLotHil3, ForObsFac, ForLbTalao, ForSerDsc2, ForAlterna, ForPlanta) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
         ,new ForEachCursor("P02DG4", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForCod, ProForL, ProforFabs, ProForH2O, ProForMq, ProForVol, ProForrbn, ProFoNPrg, ProForFR FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02DG5", "INSERT INTO TXPLFORMU(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForCod, ProForFR, ProFoNPrg, ProForrbn, ProForVol, ProForMq, ProForH2O, ProforFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new ForEachCursor("P02DG6", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Mq_Prog, Mq_Grupo, Mq_Prog3, Mq_Prog2 FROM TXPFORMQP WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Mq_Grupo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02DG7", "INSERT INTO TXPFORMQP(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Mq_Grupo, Mq_Prog, Mq_Prog2, Mq_Prog3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFORMQP")
         ,new ForEachCursor("P02DG8", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsForTxt, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02DG9", "INSERT INTO TXPLOBFOR(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin, ObsForTxt) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLOBFOR")
         ,new ForEachCursor("P02DG10", "SELECT EmprCod, PrdUltLin, ContNum, ColUltLin, ForNumCol, Lb_fam3, Lb_fam2, Lb_fam1, Lb_TaAuxC, CosKgm FROM TXPCDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02DG11", "INSERT INTO TXPCDFORM(EmprCod, ForNumCol, ColUltLin, ContNum, CosKgm, PrdUltLin, Lb_TaAuxC, Lb_fam1, Lb_fam2, Lb_fam3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDFORM")
         ,new ForEachCursor("P02DG12", "SELECT EmprCod, ForPrdNor, ForPrdUMe, ForPrdCan, PrdNum, PrdLin, ForNumCol FROM TXPLPRFOR WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, PrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02DG13", "INSERT INTO TXPLPRFOR(EmprCod, ForNumCol, PrdLin, PrdNum, ForPrdCan, ForPrdUMe, ForPrdNor) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRFOR")
         ,new ForEachCursor("P02DG14", "SELECT EmprCod, ForCan, ForPrdUMe, PrdNum, ColLin, ForNumCol, ColFibra, ForClaCol, TotLinCol FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02DG15", "INSERT INTO TXPLDFORM(EmprCod, ForNumCol, ColLin, PrdNum, ForPrdUMe, ForCan, TotLinCol, ForClaCol, ColFibra) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDFORM")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 8);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 26);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(20,5);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDate(22);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(23);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(24);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(25, 13);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(27,5);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(28,5);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[50])[0] = rslt.getGXDate(29);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((int[]) buf[52])[0] = rslt.getInt(30);
               ((byte[]) buf[53])[0] = rslt.getByte(31);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(32, 10);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(33, 8);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(34);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(35, 20);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(36, 20);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(37, 128);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(38, 100);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(40, 30);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[73])[0] = rslt.getGXDate(41);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[75])[0] = rslt.getBigDecimal(42,5);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[77])[0] = rslt.getGXDate(43);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(44, 1);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(45,2);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[83])[0] = rslt.getBigDecimal(46,2);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[85])[0] = rslt.getBigDecimal(47,2);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[87])[0] = rslt.getBigDecimal(48,5);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[89])[0] = rslt.getBigDecimal(49,5);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[91])[0] = rslt.getBigDecimal(50,5);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[93])[0] = rslt.getGXDateTime(51);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[95])[0] = rslt.getGXDateTime(52);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getString(53, 1);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((byte[]) buf[99])[0] = rslt.getByte(54);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((byte[]) buf[101])[0] = rslt.getByte(55);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(56, 30);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((byte[]) buf[105])[0] = rslt.getByte(57);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((short[]) buf[107])[0] = rslt.getShort(58);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((String[]) buf[109])[0] = rslt.getString(59, 30);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getString(60, 20);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((short[]) buf[113])[0] = rslt.getShort(61);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((String[]) buf[115])[0] = rslt.getVarchar(62);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((byte[]) buf[117])[0] = rslt.getByte(63);
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((String[]) buf[119])[0] = rslt.getString(64, 2);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((long[]) buf[121])[0] = rslt.getLong(65);
               ((boolean[]) buf[122])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[123])[0] = rslt.getBigDecimal(66,2);
               ((boolean[]) buf[124])[0] = rslt.wasNull();
               ((String[]) buf[125])[0] = rslt.getString(67, 6);
               ((boolean[]) buf[126])[0] = rslt.wasNull();
               ((short[]) buf[127])[0] = rslt.getShort(68);
               ((boolean[]) buf[128])[0] = rslt.wasNull();
               ((String[]) buf[129])[0] = rslt.getString(69, 1);
               ((boolean[]) buf[130])[0] = rslt.wasNull();
               ((String[]) buf[131])[0] = rslt.getString(70, 1);
               ((boolean[]) buf[132])[0] = rslt.wasNull();
               ((short[]) buf[133])[0] = rslt.getShort(71);
               ((boolean[]) buf[134])[0] = rslt.wasNull();
               ((String[]) buf[135])[0] = rslt.getString(72, 20);
               ((boolean[]) buf[136])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[137])[0] = rslt.getBigDecimal(73,5);
               ((boolean[]) buf[138])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[139])[0] = rslt.getBigDecimal(74,5);
               ((boolean[]) buf[140])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[141])[0] = rslt.getBigDecimal(75,2);
               ((boolean[]) buf[142])[0] = rslt.wasNull();
               ((String[]) buf[143])[0] = rslt.getString(76, 1);
               ((boolean[]) buf[144])[0] = rslt.wasNull();
               ((byte[]) buf[145])[0] = rslt.getByte(77);
               ((boolean[]) buf[146])[0] = rslt.wasNull();
               ((short[]) buf[147])[0] = rslt.getShort(78);
               ((boolean[]) buf[148])[0] = rslt.wasNull();
               ((short[]) buf[149])[0] = rslt.getShort(79);
               ((boolean[]) buf[150])[0] = rslt.wasNull();
               ((byte[]) buf[151])[0] = rslt.getByte(80);
               ((short[]) buf[152])[0] = rslt.getShort(81);
               ((byte[]) buf[153])[0] = rslt.getByte(82);
               ((java.util.Date[]) buf[154])[0] = rslt.getGXDate(83);
               ((boolean[]) buf[155])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[156])[0] = rslt.getGXDate(84);
               ((boolean[]) buf[157])[0] = rslt.wasNull();
               ((String[]) buf[158])[0] = rslt.getString(85, 1);
               ((boolean[]) buf[159])[0] = rslt.wasNull();
               ((byte[]) buf[160])[0] = rslt.getByte(86);
               ((boolean[]) buf[161])[0] = rslt.wasNull();
               ((int[]) buf[162])[0] = rslt.getInt(87);
               ((boolean[]) buf[163])[0] = rslt.wasNull();
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
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[14]);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DATE );
               }
               else
               {
                  stmt.setDate(12, (java.util.Date)parms[16]);
               }
               stmt.setByte(13, ((Number) parms[17]).byteValue());
               stmt.setShort(14, ((Number) parms[18]).shortValue());
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DATE );
               }
               else
               {
                  stmt.setDate(15, (java.util.Date)parms[20]);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[24], 5);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[26], 1);
               }
               stmt.setByte(19, ((Number) parms[27]).byteValue());
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[33], 13);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[35]).intValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[37]).byteValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[43], 5);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[45], 5);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[47], 20);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[49]).intValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DATE );
               }
               else
               {
                  stmt.setDate(32, (java.util.Date)parms[53]);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[55], 1);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[57], 1);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[59], 1);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[61]).shortValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[63], 6);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(39, ((Number) parms[67]).longValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(40, (java.math.BigDecimal)parms[69], 5);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(41, ((Number) parms[71]).shortValue());
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[73], 2);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(43, ((Number) parms[75]).byteValue());
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[77], 8);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(45, (java.util.Date)parms[79], false);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(46, (String)parms[81], 300);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(47, ((Number) parms[83]).shortValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[85], 26);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[87], 20);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[89], 8);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(51, (java.util.Date)parms[91], false);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[93], 30);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(53, ((Number) parms[95]).byteValue());
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[97], 1);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(55, ((Number) parms[99]).shortValue());
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(56, ((Number) parms[101]).byteValue());
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(57, ((Number) parms[103]).shortValue());
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(58, (String)parms[105], 30);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(59, ((Number) parms[107]).byteValue());
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(60, ((Number) parms[109]).byteValue());
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[111], 1);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(62, (java.util.Date)parms[113], false);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(63, (java.util.Date)parms[115], false);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(64, (java.math.BigDecimal)parms[117], 5);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(65, (java.math.BigDecimal)parms[119], 5);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(66, (java.math.BigDecimal)parms[121], 5);
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(67, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(68, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(69, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(70, (String)parms[129], 1);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.DATE );
               }
               else
               {
                  stmt.setDate(71, (java.util.Date)parms[131]);
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(72, (java.math.BigDecimal)parms[133], 5);
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.DATE );
               }
               else
               {
                  stmt.setDate(73, (java.util.Date)parms[135]);
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[137], 30);
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(75, (String)parms[139], 1000);
               }
               if ( ((Boolean) parms[140]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(76, (String)parms[141], 100);
               }
               if ( ((Boolean) parms[142]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(77, (String)parms[143], 128);
               }
               if ( ((Boolean) parms[144]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(78, ((Number) parms[145]).byteValue());
               }
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(79, ((Number) parms[147]).byteValue());
               }
               if ( ((Boolean) parms[148]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(80, (java.math.BigDecimal)parms[149], 2);
               }
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(81, (String)parms[151], 20);
               }
               if ( ((Boolean) parms[152]).booleanValue() )
               {
                  stmt.setNull( 82 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(82, (String)parms[153], 20);
               }
               if ( ((Boolean) parms[154]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(83, (String)parms[155], 200);
               }
               if ( ((Boolean) parms[156]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(84, (String)parms[157], 8);
               }
               if ( ((Boolean) parms[158]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(85, (String)parms[159], 60);
               }
               if ( ((Boolean) parms[160]).booleanValue() )
               {
                  stmt.setNull( 86 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(86, (String)parms[161], 10);
               }
               if ( ((Boolean) parms[162]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(87, ((Number) parms[163]).byteValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 6);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 2);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[12]).intValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 30);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
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
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 16);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 4);
               }
               return;
      }
   }

}

