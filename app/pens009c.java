package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens009c extends GXProcedure
{
   public pens009c( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens009c.class ), "" );
   }

   public pens009c( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          byte[] aP5 )
   {
      pens009c.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 )
   {
      pens009c.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens009c.this.AV71CliCod = aP1[0];
      this.aP1 = aP1;
      pens009c.this.AV72ForSer = aP2[0];
      this.aP2 = aP2;
      pens009c.this.AV73ForColNom = aP3[0];
      this.aP3 = aP3;
      pens009c.this.AV74ForColNum = aP4[0];
      this.aP4 = aP4;
      pens009c.this.AV75TipColCod = aP5[0];
      this.aP5 = aP5;
      pens009c.this.A5532Lb_numero = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV79Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV80EmprNom ;
      GXv_char3[0] = AV78Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV79Station, GXv_char1, GXv_char2, GXv_char3) ;
      pens009c.this.A396EmprCod = GXv_char1[0] ;
      pens009c.this.AV80EmprNom = GXv_char2[0] ;
      pens009c.this.AV78Usurcod = GXv_char3[0] ;
      /* Using cursor P02VZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV71CliCod), AV72ForSer, AV73ForColNom, Integer.valueOf(AV74ForColNum), Byte.valueOf(AV75TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P02VZ2_A831TipColCod[0] ;
         n831TipColCod = P02VZ2_n831TipColCod[0] ;
         A483ForColNum = P02VZ2_A483ForColNum[0] ;
         A482ForColNom = P02VZ2_A482ForColNom[0] ;
         A494ForSer = P02VZ2_A494ForSer[0] ;
         A252CliCod = P02VZ2_A252CliCod[0] ;
         AV67F_cformu = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV67F_cformu == 1 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P02VZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A5533Lb_ArtCod = P02VZ3_A5533Lb_ArtCod[0] ;
         A5536Lb_ColNom = P02VZ3_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P02VZ3_A5538Lb_ColNomC[0] ;
         A5539Lb_ColNumC = P02VZ3_A5539Lb_ColNumC[0] ;
         A5540Lb_Cartaz = P02VZ3_A5540Lb_Cartaz[0] ;
         A3316CodSol = P02VZ3_A3316CodSol[0] ;
         n3316CodSol = P02VZ3_n3316CodSol[0] ;
         A626MatCod = P02VZ3_A626MatCod[0] ;
         n626MatCod = P02VZ3_n626MatCod[0] ;
         A583IntCod = P02VZ3_A583IntCod[0] ;
         n583IntCod = P02VZ3_n583IntCod[0] ;
         A831TipColCod = P02VZ3_A831TipColCod[0] ;
         n831TipColCod = P02VZ3_n831TipColCod[0] ;
         A252CliCod = P02VZ3_A252CliCod[0] ;
         A5537Lb_ColNum = P02VZ3_A5537Lb_ColNum[0] ;
         A1514MacProCod = P02VZ3_A1514MacProCod[0] ;
         n1514MacProCod = P02VZ3_n1514MacProCod[0] ;
         A5547Lb_Rb = P02VZ3_A5547Lb_Rb[0] ;
         A5535Lb_TipArt = P02VZ3_A5535Lb_TipArt[0] ;
         A5534Lb_ArtDsc = P02VZ3_A5534Lb_ArtDsc[0] ;
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
         AV116Lb_artdsc = A5534Lb_ArtDsc ;
         GXv_int4[0] = AV61ForNumCol ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "030300", GXv_int4) ;
         pens009c.this.AV61ForNumCol = GXv_int4[0] ;
         AV65ForUltLin = (short)(0) ;
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
         A483ForColNum = AV74ForColNum ;
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
         A492ForPreKgm = DecimalUtil.doubleToDec(0) ;
         n492ForPreKgm = false ;
         A493ForPreMtr = DecimalUtil.doubleToDec(0) ;
         n493ForPreMtr = false ;
         A491ForPreDef = httpContext.getMessage( "N", "") ;
         n491ForPreDef = false ;
         A484ForCon = (byte)(0) ;
         A651ObsUltLin = (short)(0) ;
         n651ObsUltLin = false ;
         A1159ForUltLin = (short)(0) ;
         n1159ForUltLin = false ;
         A1191ForNomCli = A5538Lb_ColNomC ;
         n1191ForNomCli = false ;
         A1192ForNumCli = A5539Lb_ColNumC ;
         n1192ForNumCli = false ;
         A1518RecCorULin = (byte)(0) ;
         n1518RecCorULin = false ;
         A2749ForPro = httpContext.getMessage( "N", "") ;
         n2749ForPro = false ;
         A2838ForRelBan = DecimalUtil.doubleToDec(0) ;
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
         A3558ForFecApr = GXutil.nullDate() ;
         n3558ForFecApr = false ;
         A3559ForSitCom = " " ;
         n3559ForSitCom = false ;
         A3560ForOpcCli = " " ;
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
         A1514MacProCod = " " ;
         n1514MacProCod = false ;
         A4223ForCosUti = DecimalUtil.doubleToDec(0) ;
         n4223ForCosUti = false ;
         A4224ForKgUTin = DecimalUtil.doubleToDec(0) ;
         n4224ForKgUTin = false ;
         A4225ForKgTTin = DecimalUtil.doubleToDec(0) ;
         n4225ForKgTTin = false ;
         A4226ForCosTTi = DecimalUtil.doubleToDec(0) ;
         n4226ForCosTTi = false ;
         A4339ForRGB = 0 ;
         n4339ForRGB = false ;
         A4380ForCosForm = DecimalUtil.doubleToDec(0) ;
         n4380ForCosForm = false ;
         A4384ForTipArt = AV104Lb_TipArt ;
         n4384ForTipArt = false ;
         A5337ForCodExt = " " ;
         n5337ForCodExt = false ;
         A5362IntCodF = (byte)(0) ;
         n5362IntCodF = false ;
         A5626ForObsM = "" ;
         n5626ForObsM = false ;
         A5625ForFecHor = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n5625ForFecHor = false ;
         A5624ForUsrCod = AV78Usurcod ;
         n5624ForUsrCod = false ;
         A5653ForPInc = (short)(0) ;
         n5653ForPInc = false ;
         A5742ForSerDsc = AV116Lb_artdsc ;
         n5742ForSerDsc = false ;
         /* Using cursor P02VZ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Integer.valueOf(A486ForNumCol), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n485ForFec), A485ForFec, Boolean.valueOf(n495ForUltMod), A495ForUltMod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n626MatCod), Short.valueOf(A626MatCod), Boolean.valueOf(n496ForUltUti), A496ForUltUti, Boolean.valueOf(n492ForPreKgm), A492ForPreKgm, Boolean.valueOf(n493ForPreMtr), A493ForPreMtr, Boolean.valueOf(n491ForPreDef), A491ForPreDef, Byte.valueOf(A484ForCon), Boolean.valueOf(n651ObsUltLin), Short.valueOf(A651ObsUltLin), Boolean.valueOf(n1159ForUltLin), Short.valueOf(A1159ForUltLin), Boolean.valueOf(n1191ForNomCli), A1191ForNomCli, Boolean.valueOf(n1192ForNumCli), Integer.valueOf(A1192ForNumCli), Boolean.valueOf(n1518RecCorULin), Byte.valueOf(A1518RecCorULin), Boolean.valueOf(n2749ForPro), A2749ForPro, Boolean.valueOf(n2838ForRelBan), A2838ForRelBan, Boolean.valueOf(n3007PrecioA), A3007PrecioA, Boolean.valueOf(n3008PrecioM), A3008PrecioM, Boolean.valueOf(n995ForTonal), A995ForTonal, Boolean.valueOf(n3315ForNumArc), Integer.valueOf(A3315ForNumArc), Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol), Boolean.valueOf(n3558ForFecApr), A3558ForFecApr, Boolean.valueOf(n3559ForSitCom), A3559ForSitCom, Boolean.valueOf(n3560ForOpcCli), A3560ForOpcCli, Boolean.valueOf(n3588ForEst), A3588ForEst, Boolean.valueOf(n3688ComUltLin), Short.valueOf(A3688ComUltLin), Boolean.valueOf(n1514MacProCod), A1514MacProCod, Boolean.valueOf(n4223ForCosUti), A4223ForCosUti, Boolean.valueOf(n4339ForRGB), Long.valueOf(A4339ForRGB), Boolean.valueOf(n4380ForCosForm), A4380ForCosForm, Boolean.valueOf(n4384ForTipArt), Short.valueOf(A4384ForTipArt), Boolean.valueOf(n5337ForCodExt), A5337ForCodExt, Boolean.valueOf(n5362IntCodF), Byte.valueOf(A5362IntCodF), Boolean.valueOf(n5624ForUsrCod), A5624ForUsrCod, Boolean.valueOf(n5625ForFecHor), A5625ForFecHor, Boolean.valueOf(n5626ForObsM), A5626ForObsM, Boolean.valueOf(n5653ForPInc), Short.valueOf(A5653ForPInc), Boolean.valueOf(n5742ForSerDsc), A5742ForSerDsc, Boolean.valueOf(n4224ForKgUTin), A4224ForKgUTin, Boolean.valueOf(n4225ForKgTTin), A4225ForKgTTin, Boolean.valueOf(n4226ForCosTTi), A4226ForCosTTi, Boolean.valueOf(n3569UltEnsCod), A3569UltEnsCod, Boolean.valueOf(n3585ForPreFec), A3585ForPreFec, Boolean.valueOf(n3586ForPreAnt), A3586ForPreAnt, Boolean.valueOf(n3587ForFecAnt), A3587ForFecAnt});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
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
         /*
            INSERT RECORD ON TABLE TXPCDFORM

         */
         W396EmprCod = A396EmprCod ;
         A310ColUltLin = (short)(0) ;
         A315ContNum = 10 ;
         A318CosKgm = DecimalUtil.doubleToDec(0) ;
         A741PrdUltLin = (short)(0) ;
         A6310Lb_TaAuxC = " " ;
         n6310Lb_TaAuxC = false ;
         A6369Lb_fam1 = (byte)(0) ;
         A6370Lb_fam2 = (byte)(0) ;
         A6371Lb_fam3 = (byte)(0) ;
         /* Using cursor P02VZ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A310ColUltLin), Integer.valueOf(A315ContNum), A318CosKgm, Short.valueOf(A741PrdUltLin), Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC, Byte.valueOf(A6369Lb_fam1), Byte.valueOf(A6370Lb_fam2), Byte.valueOf(A6371Lb_fam3)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
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
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens009c.this.A396EmprCod;
      this.aP1[0] = pens009c.this.AV71CliCod;
      this.aP2[0] = pens009c.this.AV72ForSer;
      this.aP3[0] = pens009c.this.AV73ForColNom;
      this.aP4[0] = pens009c.this.AV74ForColNum;
      this.aP5[0] = pens009c.this.AV75TipColCod;
      this.aP6[0] = pens009c.this.A5532Lb_numero;
      Application.commitDataStores(context, remoteHandle, pr_default, "pens009c");
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
      GXv_char1 = new String[1] ;
      AV80EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV78Usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P02VZ2_A396EmprCod = new String[] {""} ;
      P02VZ2_A831TipColCod = new byte[1] ;
      P02VZ2_n831TipColCod = new boolean[] {false} ;
      P02VZ2_A483ForColNum = new int[1] ;
      P02VZ2_A482ForColNom = new String[] {""} ;
      P02VZ2_A494ForSer = new String[] {""} ;
      P02VZ2_A252CliCod = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P02VZ3_A396EmprCod = new String[] {""} ;
      P02VZ3_A5532Lb_numero = new int[1] ;
      P02VZ3_A5533Lb_ArtCod = new String[] {""} ;
      P02VZ3_A5536Lb_ColNom = new String[] {""} ;
      P02VZ3_A5538Lb_ColNomC = new String[] {""} ;
      P02VZ3_A5539Lb_ColNumC = new int[1] ;
      P02VZ3_A5540Lb_Cartaz = new String[] {""} ;
      P02VZ3_A3316CodSol = new short[1] ;
      P02VZ3_n3316CodSol = new boolean[] {false} ;
      P02VZ3_A626MatCod = new short[1] ;
      P02VZ3_n626MatCod = new boolean[] {false} ;
      P02VZ3_A583IntCod = new byte[1] ;
      P02VZ3_n583IntCod = new boolean[] {false} ;
      P02VZ3_A831TipColCod = new byte[1] ;
      P02VZ3_n831TipColCod = new boolean[] {false} ;
      P02VZ3_A252CliCod = new int[1] ;
      P02VZ3_A5537Lb_ColNum = new int[1] ;
      P02VZ3_A1514MacProCod = new String[] {""} ;
      P02VZ3_n1514MacProCod = new boolean[] {false} ;
      P02VZ3_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VZ3_A5535Lb_TipArt = new short[1] ;
      P02VZ3_A5534Lb_ArtDsc = new String[] {""} ;
      A5533Lb_ArtCod = "" ;
      A5536Lb_ColNom = "" ;
      A5538Lb_ColNomC = "" ;
      A5540Lb_Cartaz = "" ;
      A1514MacProCod = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A5534Lb_ArtDsc = "" ;
      W396EmprCod = "" ;
      AV90MacProcod = "" ;
      AV95Lb_Rb = DecimalUtil.ZERO ;
      AV96Lb_Cartaz = "" ;
      AV99Lb_ColNomC = "" ;
      AV116Lb_artdsc = "" ;
      GXv_int4 = new int[1] ;
      W1514MacProCod = "" ;
      A130BarCodPar = "" ;
      A485ForFec = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      A495ForUltMod = GXutil.nullDate() ;
      A496ForUltUti = GXutil.nullDate() ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A491ForPreDef = "" ;
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
      Gx_emsg = "" ;
      A318CosKgm = DecimalUtil.ZERO ;
      A6310Lb_TaAuxC = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pens009c__default(),
         new Object[] {
             new Object[] {
            P02VZ2_A396EmprCod, P02VZ2_A831TipColCod, P02VZ2_A483ForColNum, P02VZ2_A482ForColNom, P02VZ2_A494ForSer, P02VZ2_A252CliCod
            }
            , new Object[] {
            P02VZ3_A396EmprCod, P02VZ3_A5532Lb_numero, P02VZ3_A5533Lb_ArtCod, P02VZ3_A5536Lb_ColNom, P02VZ3_A5538Lb_ColNomC, P02VZ3_A5539Lb_ColNumC, P02VZ3_A5540Lb_Cartaz, P02VZ3_A3316CodSol, P02VZ3_n3316CodSol, P02VZ3_A626MatCod,
            P02VZ3_n626MatCod, P02VZ3_A583IntCod, P02VZ3_n583IntCod, P02VZ3_A831TipColCod, P02VZ3_n831TipColCod, P02VZ3_A252CliCod, P02VZ3_A5537Lb_ColNum, P02VZ3_A1514MacProCod, P02VZ3_n1514MacProCod, P02VZ3_A5547Lb_Rb,
            P02VZ3_A5535Lb_TipArt, P02VZ3_A5534Lb_ArtDsc
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV75TipColCod ;
   private byte A831TipColCod ;
   private byte AV67F_cformu ;
   private byte A583IntCod ;
   private byte AV89IntCod ;
   private byte W831TipColCod ;
   private byte W583IntCod ;
   private byte A132BarCodReo ;
   private byte A484ForCon ;
   private byte A1518RecCorULin ;
   private byte A5362IntCodF ;
   private byte A6369Lb_fam1 ;
   private byte A6370Lb_fam2 ;
   private byte A6371Lb_fam3 ;
   private short A3316CodSol ;
   private short A626MatCod ;
   private short A5535Lb_TipArt ;
   private short AV94MatCod ;
   private short AV104Lb_TipArt ;
   private short AV65ForUltLin ;
   private short W626MatCod ;
   private short W3316CodSol ;
   private short A651ObsUltLin ;
   private short A1159ForUltLin ;
   private short A3688ComUltLin ;
   private short A4384ForTipArt ;
   private short A5653ForPInc ;
   private short Gx_err ;
   private short A310ColUltLin ;
   private short A741PrdUltLin ;
   private int AV71CliCod ;
   private int AV74ForColNum ;
   private int A5532Lb_numero ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A5539Lb_ColNumC ;
   private int A5537Lb_ColNum ;
   private int AV97Lb_numero ;
   private int AV100Lb_ColNumC ;
   private int AV61ForNumCol ;
   private int GXv_int4[] ;
   private int GX_INS47 ;
   private int W252CliCod ;
   private int A486ForNumCol ;
   private int A129BarCod ;
   private int A1192ForNumCli ;
   private int A3315ForNumArc ;
   private int GX_INS32 ;
   private int A315ContNum ;
   private long A4339ForRGB ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV95Lb_Rb ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A493ForPreMtr ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal A3007PrecioA ;
   private java.math.BigDecimal A3008PrecioM ;
   private java.math.BigDecimal A3586ForPreAnt ;
   private java.math.BigDecimal A4223ForCosUti ;
   private java.math.BigDecimal A4224ForKgUTin ;
   private java.math.BigDecimal A4225ForKgTTin ;
   private java.math.BigDecimal A4226ForCosTTi ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal A318CosKgm ;
   private String A396EmprCod ;
   private String AV72ForSer ;
   private String AV73ForColNom ;
   private String AV79Station ;
   private String GXv_char1[] ;
   private String AV80EmprNom ;
   private String GXv_char2[] ;
   private String AV78Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A5533Lb_ArtCod ;
   private String A5536Lb_ColNom ;
   private String A5538Lb_ColNomC ;
   private String A5540Lb_Cartaz ;
   private String A1514MacProCod ;
   private String A5534Lb_ArtDsc ;
   private String W396EmprCod ;
   private String AV90MacProcod ;
   private String AV96Lb_Cartaz ;
   private String AV99Lb_ColNomC ;
   private String AV116Lb_artdsc ;
   private String W1514MacProCod ;
   private String A130BarCodPar ;
   private String A491ForPreDef ;
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
   private String Gx_emsg ;
   private String A6310Lb_TaAuxC ;
   private java.util.Date A5625ForFecHor ;
   private java.util.Date A485ForFec ;
   private java.util.Date Gx_date ;
   private java.util.Date A495ForUltMod ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date A3558ForFecApr ;
   private java.util.Date A3585ForPreFec ;
   private java.util.Date A3587ForFecAnt ;
   private boolean n831TipColCod ;
   private boolean returnInSub ;
   private boolean n3316CodSol ;
   private boolean n626MatCod ;
   private boolean n583IntCod ;
   private boolean n1514MacProCod ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n485ForFec ;
   private boolean n495ForUltMod ;
   private boolean n496ForUltUti ;
   private boolean n492ForPreKgm ;
   private boolean n493ForPreMtr ;
   private boolean n491ForPreDef ;
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
   private boolean n5362IntCodF ;
   private boolean n5626ForObsM ;
   private boolean n5625ForFecHor ;
   private boolean n5624ForUsrCod ;
   private boolean n5653ForPInc ;
   private boolean n5742ForSerDsc ;
   private boolean n6310Lb_TaAuxC ;
   private String A5626ForObsM ;
   private int[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02VZ2_A396EmprCod ;
   private byte[] P02VZ2_A831TipColCod ;
   private boolean[] P02VZ2_n831TipColCod ;
   private int[] P02VZ2_A483ForColNum ;
   private String[] P02VZ2_A482ForColNom ;
   private String[] P02VZ2_A494ForSer ;
   private int[] P02VZ2_A252CliCod ;
   private String[] P02VZ3_A396EmprCod ;
   private int[] P02VZ3_A5532Lb_numero ;
   private String[] P02VZ3_A5533Lb_ArtCod ;
   private String[] P02VZ3_A5536Lb_ColNom ;
   private String[] P02VZ3_A5538Lb_ColNomC ;
   private int[] P02VZ3_A5539Lb_ColNumC ;
   private String[] P02VZ3_A5540Lb_Cartaz ;
   private short[] P02VZ3_A3316CodSol ;
   private boolean[] P02VZ3_n3316CodSol ;
   private short[] P02VZ3_A626MatCod ;
   private boolean[] P02VZ3_n626MatCod ;
   private byte[] P02VZ3_A583IntCod ;
   private boolean[] P02VZ3_n583IntCod ;
   private byte[] P02VZ3_A831TipColCod ;
   private boolean[] P02VZ3_n831TipColCod ;
   private int[] P02VZ3_A252CliCod ;
   private int[] P02VZ3_A5537Lb_ColNum ;
   private String[] P02VZ3_A1514MacProCod ;
   private boolean[] P02VZ3_n1514MacProCod ;
   private java.math.BigDecimal[] P02VZ3_A5547Lb_Rb ;
   private short[] P02VZ3_A5535Lb_TipArt ;
   private String[] P02VZ3_A5534Lb_ArtDsc ;
}

final  class pens009c__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02VZ2", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02VZ3", "SELECT EmprCod, Lb_numero, Lb_ArtCod, Lb_ColNom, Lb_ColNomC, Lb_ColNumC, Lb_Cartaz, CodSol, MatCod, IntCod, TipColCod, CliCod, Lb_ColNum, MacProCod, Lb_Rb, Lb_TipArt, Lb_ArtDsc FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02VZ4", "INSERT INTO TXPCFORMU(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForNumCol, BarCod, BarCodReo, BarCodPar, ForFec, ForUltMod, IntCod, MatCod, ForUltUti, ForPreKgm, ForPreMtr, ForPreDef, ForCon, ObsUltLin, ForUltLin, ForNomCli, ForNumCli, RecCorULin, ForPro, ForRelBan, PrecioA, PrecioM, ForTonal, ForNumArc, CodSol, ForFecApr, ForSitCom, ForOpcCli, ForEst, ComUltLin, MacProCod, ForCosUti, ForRGB, ForCosForm, ForTipArt, ForCodExt, IntCodF, ForUsrCod, ForFecHor, ForObsM, ForPInc, ForSerDsc, ForKgUTin, ForKgTTin, ForCosTTi, UltEnsCod, ForPreFec, ForPreAnt, ForFecAnt, ForNomCli2, ForUsrCre, ForFecCre, ForNomCli3, ForOpNum, ForBlo, Sim_Ulin, ForTipT, Fam_Cod, For_item1, Lb_CodL, Lb_CodC, For_Reo, ForFecCtrl, ForFecCtrf, ForcosH20, ForCosFab, ForCosFin, For_item2, ForObs2, ForPanto, ForCurva, ForMT, ForTRabs, ForKgMn, ForLotHil2, ForLotHil3, ForObsFac, ForLbTalao, ForSerDsc2, ForAlterna, ForPlanta) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
         ,new UpdateCursor("P02VZ5", "INSERT INTO TXPCDFORM(EmprCod, ForNumCol, ColUltLin, ContNum, CosKgm, PrdUltLin, Lb_TaAuxC, Lb_fam1, Lb_fam2, Lb_fam3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDFORM")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(15,2);
               ((short[]) buf[20])[0] = rslt.getShort(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 26);
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
               return;
            case 2 :
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
                  stmt.setNull( 49 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(49, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(50, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(51, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[96], 1);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.DATE );
               }
               else
               {
                  stmt.setDate(53, (java.util.Date)parms[98]);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(54, (java.math.BigDecimal)parms[100], 5);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.DATE );
               }
               else
               {
                  stmt.setDate(55, (java.util.Date)parms[102]);
               }
               return;
            case 3 :
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
      }
   }

}

