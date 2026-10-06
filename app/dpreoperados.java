package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpreoperados extends GXProcedure
{
   public dpreoperados( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpreoperados.class ), "" );
   }

   public dpreoperados( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTReoperados> executeUdp( String aP0 ,
                                                             java.util.Date aP1 ,
                                                             java.util.Date aP2 ,
                                                             int aP3 ,
                                                             int aP4 ,
                                                             byte aP5 )
   {
      dpreoperados.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTReoperados>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        int aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        GXBaseCollection<app.SdtSDTReoperados>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             int aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             GXBaseCollection<app.SdtSDTReoperados>[] aP6 )
   {
      dpreoperados.this.AV5Emprcod = aP0;
      dpreoperados.this.AV6FechaIni = aP1;
      dpreoperados.this.AV7FechaFin = aP2;
      dpreoperados.this.AV8ClicodIni = aP3;
      dpreoperados.this.AV9ClicodFin = aP4;
      dpreoperados.this.AV10HisEstReo = aP5;
      dpreoperados.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000R2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV6FechaIni, Integer.valueOf(AV8ClicodIni), Integer.valueOf(AV9ClicodFin), Byte.valueOf(AV10HisEstReo), AV7FechaFin});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P000R2_A396EmprCod[0] ;
         A548HisEstReo = P000R2_A548HisEstReo[0] ;
         n548HisEstReo = P000R2_n548HisEstReo[0] ;
         A252CliCod = P000R2_A252CliCod[0] ;
         n252CliCod = P000R2_n252CliCod[0] ;
         A569HisReoFec = P000R2_A569HisReoFec[0] ;
         n569HisReoFec = P000R2_n569HisReoFec[0] ;
         A8567HisHorReo = P000R2_A8567HisHorReo[0] ;
         n8567HisHorReo = P000R2_n8567HisHorReo[0] ;
         A13698HisreoLote = P000R2_A13698HisreoLote[0] ;
         n13698HisreoLote = P000R2_n13698HisreoLote[0] ;
         A833TipDefCod = P000R2_A833TipDefCod[0] ;
         A834TipDefDsc = P000R2_A834TipDefDsc[0] ;
         n834TipDefDsc = P000R2_n834TipDefDsc[0] ;
         A5085CodCausa = P000R2_A5085CodCausa[0] ;
         n5085CodCausa = P000R2_n5085CodCausa[0] ;
         A5086DscCausa = P000R2_A5086DscCausa[0] ;
         n5086DscCausa = P000R2_n5086DscCausa[0] ;
         A7000Rps_Cod = P000R2_A7000Rps_Cod[0] ;
         n7000Rps_Cod = P000R2_n7000Rps_Cod[0] ;
         A7001Rps_Dsc = P000R2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P000R2_n7001Rps_Dsc[0] ;
         A602MaqCod = P000R2_A602MaqCod[0] ;
         n602MaqCod = P000R2_n602MaqCod[0] ;
         A606MaqDsc = P000R2_A606MaqDsc[0] ;
         n606MaqDsc = P000R2_n606MaqDsc[0] ;
         A279CliNom = P000R2_A279CliNom[0] ;
         A542HisBarSer = P000R2_A542HisBarSer[0] ;
         n542HisBarSer = P000R2_n542HisBarSer[0] ;
         A2299HisReoDsc = P000R2_A2299HisReoDsc[0] ;
         n2299HisReoDsc = P000R2_n2299HisReoDsc[0] ;
         A571HisTipArt = P000R2_A571HisTipArt[0] ;
         n571HisTipArt = P000R2_n571HisTipArt[0] ;
         A546HisColNom = P000R2_A546HisColNom[0] ;
         n546HisColNom = P000R2_n546HisColNom[0] ;
         A547HisColNum = P000R2_A547HisColNum[0] ;
         n547HisColNum = P000R2_n547HisColNum[0] ;
         A572HisTipCol = P000R2_A572HisTipCol[0] ;
         n572HisTipCol = P000R2_n572HisTipCol[0] ;
         A8889HisNomCli = P000R2_A8889HisNomCli[0] ;
         n8889HisNomCli = P000R2_n8889HisNomCli[0] ;
         A8890HisNumCli = P000R2_A8890HisNumCli[0] ;
         n8890HisNumCli = P000R2_n8890HisNumCli[0] ;
         A540HisBarKgm = P000R2_A540HisBarKgm[0] ;
         n540HisBarKgm = P000R2_n540HisBarKgm[0] ;
         A541HisBarMtr = P000R2_A541HisBarMtr[0] ;
         n541HisBarMtr = P000R2_n541HisBarMtr[0] ;
         A553HisNumPie = P000R2_A553HisNumPie[0] ;
         n553HisNumPie = P000R2_n553HisNumPie[0] ;
         A12950HisOpeTur = P000R2_A12950HisOpeTur[0] ;
         n12950HisOpeTur = P000R2_n12950HisOpeTur[0] ;
         A12949HisOpecod = P000R2_A12949HisOpecod[0] ;
         n12949HisOpecod = P000R2_n12949HisOpecod[0] ;
         A8414HisUsu = P000R2_A8414HisUsu[0] ;
         n8414HisUsu = P000R2_n8414HisUsu[0] ;
         A6669HisAdeObs = P000R2_A6669HisAdeObs[0] ;
         n6669HisAdeObs = P000R2_n6669HisAdeObs[0] ;
         A6668HisAdeSN = P000R2_A6668HisAdeSN[0] ;
         n6668HisAdeSN = P000R2_n6668HisAdeSN[0] ;
         A5693HisAcCot = P000R2_A5693HisAcCot[0] ;
         n5693HisAcCot = P000R2_n5693HisAcCot[0] ;
         A5662HisAcCo = P000R2_A5662HisAcCo[0] ;
         n5662HisAcCo = P000R2_n5662HisAcCo[0] ;
         A5695HisAdEAcCt = P000R2_A5695HisAdEAcCt[0] ;
         n5695HisAdEAcCt = P000R2_n5695HisAdEAcCt[0] ;
         A5694HisAdEAcCo = P000R2_A5694HisAdEAcCo[0] ;
         n5694HisAdEAcCo = P000R2_n5694HisAdEAcCo[0] ;
         A2297HisReoTn = P000R2_A2297HisReoTn[0] ;
         n2297HisReoTn = P000R2_n2297HisReoTn[0] ;
         A544HisCodPar = P000R2_A544HisCodPar[0] ;
         A545HisCodReo = P000R2_A545HisCodReo[0] ;
         A539HisBarCod = P000R2_A539HisBarCod[0] ;
         A279CliNom = P000R2_A279CliNom[0] ;
         A834TipDefDsc = P000R2_A834TipDefDsc[0] ;
         n834TipDefDsc = P000R2_n834TipDefDsc[0] ;
         A5086DscCausa = P000R2_A5086DscCausa[0] ;
         n5086DscCausa = P000R2_n5086DscCausa[0] ;
         A7001Rps_Dsc = P000R2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P000R2_n7001Rps_Dsc[0] ;
         A606MaqDsc = P000R2_A606MaqDsc[0] ;
         n606MaqDsc = P000R2_n606MaqDsc[0] ;
         A13697HisReoHDR = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
         Gxm1sdtreoperados = (app.SdtSDTReoperados)new app.SdtSDTReoperados(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtreoperados, 0);
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Tiporeoperado( ((A548HisEstReo==1) ? httpContext.getMessage( "NC", "") : httpContext.getMessage( "RC", "")) );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisreofec( A569HisReoFec );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hishorreo( localUtil.ttoc( A8567HisHorReo, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisreohdr( A13697HisReoHDR );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisreolote( A13698HisreoLote );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Tipdefcod( A833TipDefCod );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Tipdefdsc( A834TipDefDsc );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Codcausa( A5085CodCausa );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Dsccausa( A5086DscCausa );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Rps_cod( A7000Rps_Cod );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Rps_dsc( A7001Rps_Dsc );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Maqcod( A602MaqCod );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Maqdsc( A606MaqDsc );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Clicod( A252CliCod );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Clinom( A279CliNom );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisbarser( A542HisBarSer );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisreodsc( A2299HisReoDsc );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Histipart( A571HisTipArt );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hiscolnom( A546HisColNom );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hiscolnum( A547HisColNum );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Histipcol( A572HisTipCol );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisnomcli( A8889HisNomCli );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisnumcli( A8890HisNumCli );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisbarkgm( A540HisBarKgm );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisbarmtr( A541HisBarMtr );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisnumpie( A553HisNumPie );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisopetur( A12950HisOpeTur );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisopecod( A12949HisOpecod );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisusu( A8414HisUsu );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisadeobs( A6669HisAdeObs );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisadesn( A6668HisAdeSN );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisaccot( A5693HisAcCot );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisacco( A5662HisAcCo );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisadeacct( A5695HisAdEAcCt );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisadeacco( A5694HisAdEAcCo );
         Gxm1sdtreoperados.setgxTv_SdtSDTReoperados_Hisreotn( A2297HisReoTn );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = dpreoperados.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTReoperados>(app.SdtSDTReoperados.class, "SDTReoperados", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P000R2_A396EmprCod = new String[] {""} ;
      P000R2_A548HisEstReo = new byte[1] ;
      P000R2_n548HisEstReo = new boolean[] {false} ;
      P000R2_A252CliCod = new int[1] ;
      P000R2_n252CliCod = new boolean[] {false} ;
      P000R2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P000R2_n569HisReoFec = new boolean[] {false} ;
      P000R2_A8567HisHorReo = new java.util.Date[] {GXutil.nullDate()} ;
      P000R2_n8567HisHorReo = new boolean[] {false} ;
      P000R2_A13698HisreoLote = new String[] {""} ;
      P000R2_n13698HisreoLote = new boolean[] {false} ;
      P000R2_A833TipDefCod = new short[1] ;
      P000R2_A834TipDefDsc = new String[] {""} ;
      P000R2_n834TipDefDsc = new boolean[] {false} ;
      P000R2_A5085CodCausa = new short[1] ;
      P000R2_n5085CodCausa = new boolean[] {false} ;
      P000R2_A5086DscCausa = new String[] {""} ;
      P000R2_n5086DscCausa = new boolean[] {false} ;
      P000R2_A7000Rps_Cod = new short[1] ;
      P000R2_n7000Rps_Cod = new boolean[] {false} ;
      P000R2_A7001Rps_Dsc = new String[] {""} ;
      P000R2_n7001Rps_Dsc = new boolean[] {false} ;
      P000R2_A602MaqCod = new String[] {""} ;
      P000R2_n602MaqCod = new boolean[] {false} ;
      P000R2_A606MaqDsc = new String[] {""} ;
      P000R2_n606MaqDsc = new boolean[] {false} ;
      P000R2_A279CliNom = new String[] {""} ;
      P000R2_A542HisBarSer = new String[] {""} ;
      P000R2_n542HisBarSer = new boolean[] {false} ;
      P000R2_A2299HisReoDsc = new String[] {""} ;
      P000R2_n2299HisReoDsc = new boolean[] {false} ;
      P000R2_A571HisTipArt = new short[1] ;
      P000R2_n571HisTipArt = new boolean[] {false} ;
      P000R2_A546HisColNom = new String[] {""} ;
      P000R2_n546HisColNom = new boolean[] {false} ;
      P000R2_A547HisColNum = new int[1] ;
      P000R2_n547HisColNum = new boolean[] {false} ;
      P000R2_A572HisTipCol = new byte[1] ;
      P000R2_n572HisTipCol = new boolean[] {false} ;
      P000R2_A8889HisNomCli = new String[] {""} ;
      P000R2_n8889HisNomCli = new boolean[] {false} ;
      P000R2_A8890HisNumCli = new int[1] ;
      P000R2_n8890HisNumCli = new boolean[] {false} ;
      P000R2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000R2_n540HisBarKgm = new boolean[] {false} ;
      P000R2_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000R2_n541HisBarMtr = new boolean[] {false} ;
      P000R2_A553HisNumPie = new short[1] ;
      P000R2_n553HisNumPie = new boolean[] {false} ;
      P000R2_A12950HisOpeTur = new byte[1] ;
      P000R2_n12950HisOpeTur = new boolean[] {false} ;
      P000R2_A12949HisOpecod = new int[1] ;
      P000R2_n12949HisOpecod = new boolean[] {false} ;
      P000R2_A8414HisUsu = new String[] {""} ;
      P000R2_n8414HisUsu = new boolean[] {false} ;
      P000R2_A6669HisAdeObs = new String[] {""} ;
      P000R2_n6669HisAdeObs = new boolean[] {false} ;
      P000R2_A6668HisAdeSN = new String[] {""} ;
      P000R2_n6668HisAdeSN = new boolean[] {false} ;
      P000R2_A5693HisAcCot = new String[] {""} ;
      P000R2_n5693HisAcCot = new boolean[] {false} ;
      P000R2_A5662HisAcCo = new String[] {""} ;
      P000R2_n5662HisAcCo = new boolean[] {false} ;
      P000R2_A5695HisAdEAcCt = new String[] {""} ;
      P000R2_n5695HisAdEAcCt = new boolean[] {false} ;
      P000R2_A5694HisAdEAcCo = new String[] {""} ;
      P000R2_n5694HisAdEAcCo = new boolean[] {false} ;
      P000R2_A2297HisReoTn = new int[1] ;
      P000R2_n2297HisReoTn = new boolean[] {false} ;
      P000R2_A544HisCodPar = new String[] {""} ;
      P000R2_A545HisCodReo = new byte[1] ;
      P000R2_A539HisBarCod = new int[1] ;
      A396EmprCod = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A8567HisHorReo = GXutil.resetTime( GXutil.nullDate() );
      A13698HisreoLote = "" ;
      A834TipDefDsc = "" ;
      A5086DscCausa = "" ;
      A7001Rps_Dsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A279CliNom = "" ;
      A542HisBarSer = "" ;
      A2299HisReoDsc = "" ;
      A546HisColNom = "" ;
      A8889HisNomCli = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A8414HisUsu = "" ;
      A6669HisAdeObs = "" ;
      A6668HisAdeSN = "" ;
      A5693HisAcCot = "" ;
      A5662HisAcCo = "" ;
      A5695HisAdEAcCt = "" ;
      A5694HisAdEAcCo = "" ;
      A544HisCodPar = "" ;
      A13697HisReoHDR = "" ;
      Gxm1sdtreoperados = new app.SdtSDTReoperados(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpreoperados__default(),
         new Object[] {
             new Object[] {
            P000R2_A396EmprCod, P000R2_A548HisEstReo, P000R2_n548HisEstReo, P000R2_A252CliCod, P000R2_n252CliCod, P000R2_A569HisReoFec, P000R2_n569HisReoFec, P000R2_A8567HisHorReo, P000R2_n8567HisHorReo, P000R2_A13698HisreoLote,
            P000R2_n13698HisreoLote, P000R2_A833TipDefCod, P000R2_A834TipDefDsc, P000R2_n834TipDefDsc, P000R2_A5085CodCausa, P000R2_n5085CodCausa, P000R2_A5086DscCausa, P000R2_n5086DscCausa, P000R2_A7000Rps_Cod, P000R2_n7000Rps_Cod,
            P000R2_A7001Rps_Dsc, P000R2_n7001Rps_Dsc, P000R2_A602MaqCod, P000R2_n602MaqCod, P000R2_A606MaqDsc, P000R2_n606MaqDsc, P000R2_A279CliNom, P000R2_A542HisBarSer, P000R2_n542HisBarSer, P000R2_A2299HisReoDsc,
            P000R2_n2299HisReoDsc, P000R2_A571HisTipArt, P000R2_n571HisTipArt, P000R2_A546HisColNom, P000R2_n546HisColNom, P000R2_A547HisColNum, P000R2_n547HisColNum, P000R2_A572HisTipCol, P000R2_n572HisTipCol, P000R2_A8889HisNomCli,
            P000R2_n8889HisNomCli, P000R2_A8890HisNumCli, P000R2_n8890HisNumCli, P000R2_A540HisBarKgm, P000R2_n540HisBarKgm, P000R2_A541HisBarMtr, P000R2_n541HisBarMtr, P000R2_A553HisNumPie, P000R2_n553HisNumPie, P000R2_A12950HisOpeTur,
            P000R2_n12950HisOpeTur, P000R2_A12949HisOpecod, P000R2_n12949HisOpecod, P000R2_A8414HisUsu, P000R2_n8414HisUsu, P000R2_A6669HisAdeObs, P000R2_n6669HisAdeObs, P000R2_A6668HisAdeSN, P000R2_n6668HisAdeSN, P000R2_A5693HisAcCot,
            P000R2_n5693HisAcCot, P000R2_A5662HisAcCo, P000R2_n5662HisAcCo, P000R2_A5695HisAdEAcCt, P000R2_n5695HisAdEAcCt, P000R2_A5694HisAdEAcCo, P000R2_n5694HisAdEAcCo, P000R2_A2297HisReoTn, P000R2_n2297HisReoTn, P000R2_A544HisCodPar,
            P000R2_A545HisCodReo, P000R2_A539HisBarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10HisEstReo ;
   private byte A548HisEstReo ;
   private byte A572HisTipCol ;
   private byte A12950HisOpeTur ;
   private byte A545HisCodReo ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A7000Rps_Cod ;
   private short A571HisTipArt ;
   private short A553HisNumPie ;
   private short Gx_err ;
   private int AV8ClicodIni ;
   private int AV9ClicodFin ;
   private int A252CliCod ;
   private int A547HisColNum ;
   private int A8890HisNumCli ;
   private int A12949HisOpecod ;
   private int A2297HisReoTn ;
   private int A539HisBarCod ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private String AV5Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A13698HisreoLote ;
   private String A834TipDefDsc ;
   private String A5086DscCausa ;
   private String A7001Rps_Dsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A279CliNom ;
   private String A542HisBarSer ;
   private String A2299HisReoDsc ;
   private String A546HisColNom ;
   private String A8889HisNomCli ;
   private String A8414HisUsu ;
   private String A6668HisAdeSN ;
   private String A544HisCodPar ;
   private String A13697HisReoHDR ;
   private java.util.Date A8567HisHorReo ;
   private java.util.Date AV6FechaIni ;
   private java.util.Date AV7FechaFin ;
   private java.util.Date A569HisReoFec ;
   private boolean n548HisEstReo ;
   private boolean n252CliCod ;
   private boolean n569HisReoFec ;
   private boolean n8567HisHorReo ;
   private boolean n13698HisreoLote ;
   private boolean n834TipDefDsc ;
   private boolean n5085CodCausa ;
   private boolean n5086DscCausa ;
   private boolean n7000Rps_Cod ;
   private boolean n7001Rps_Dsc ;
   private boolean n602MaqCod ;
   private boolean n606MaqDsc ;
   private boolean n542HisBarSer ;
   private boolean n2299HisReoDsc ;
   private boolean n571HisTipArt ;
   private boolean n546HisColNom ;
   private boolean n547HisColNum ;
   private boolean n572HisTipCol ;
   private boolean n8889HisNomCli ;
   private boolean n8890HisNumCli ;
   private boolean n540HisBarKgm ;
   private boolean n541HisBarMtr ;
   private boolean n553HisNumPie ;
   private boolean n12950HisOpeTur ;
   private boolean n12949HisOpecod ;
   private boolean n8414HisUsu ;
   private boolean n6669HisAdeObs ;
   private boolean n6668HisAdeSN ;
   private boolean n5693HisAcCot ;
   private boolean n5662HisAcCo ;
   private boolean n5695HisAdEAcCt ;
   private boolean n5694HisAdEAcCo ;
   private boolean n2297HisReoTn ;
   private String A6669HisAdeObs ;
   private String A5693HisAcCot ;
   private String A5662HisAcCo ;
   private String A5695HisAdEAcCt ;
   private String A5694HisAdEAcCo ;
   private GXBaseCollection<app.SdtSDTReoperados>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P000R2_A396EmprCod ;
   private byte[] P000R2_A548HisEstReo ;
   private boolean[] P000R2_n548HisEstReo ;
   private int[] P000R2_A252CliCod ;
   private boolean[] P000R2_n252CliCod ;
   private java.util.Date[] P000R2_A569HisReoFec ;
   private boolean[] P000R2_n569HisReoFec ;
   private java.util.Date[] P000R2_A8567HisHorReo ;
   private boolean[] P000R2_n8567HisHorReo ;
   private String[] P000R2_A13698HisreoLote ;
   private boolean[] P000R2_n13698HisreoLote ;
   private short[] P000R2_A833TipDefCod ;
   private String[] P000R2_A834TipDefDsc ;
   private boolean[] P000R2_n834TipDefDsc ;
   private short[] P000R2_A5085CodCausa ;
   private boolean[] P000R2_n5085CodCausa ;
   private String[] P000R2_A5086DscCausa ;
   private boolean[] P000R2_n5086DscCausa ;
   private short[] P000R2_A7000Rps_Cod ;
   private boolean[] P000R2_n7000Rps_Cod ;
   private String[] P000R2_A7001Rps_Dsc ;
   private boolean[] P000R2_n7001Rps_Dsc ;
   private String[] P000R2_A602MaqCod ;
   private boolean[] P000R2_n602MaqCod ;
   private String[] P000R2_A606MaqDsc ;
   private boolean[] P000R2_n606MaqDsc ;
   private String[] P000R2_A279CliNom ;
   private String[] P000R2_A542HisBarSer ;
   private boolean[] P000R2_n542HisBarSer ;
   private String[] P000R2_A2299HisReoDsc ;
   private boolean[] P000R2_n2299HisReoDsc ;
   private short[] P000R2_A571HisTipArt ;
   private boolean[] P000R2_n571HisTipArt ;
   private String[] P000R2_A546HisColNom ;
   private boolean[] P000R2_n546HisColNom ;
   private int[] P000R2_A547HisColNum ;
   private boolean[] P000R2_n547HisColNum ;
   private byte[] P000R2_A572HisTipCol ;
   private boolean[] P000R2_n572HisTipCol ;
   private String[] P000R2_A8889HisNomCli ;
   private boolean[] P000R2_n8889HisNomCli ;
   private int[] P000R2_A8890HisNumCli ;
   private boolean[] P000R2_n8890HisNumCli ;
   private java.math.BigDecimal[] P000R2_A540HisBarKgm ;
   private boolean[] P000R2_n540HisBarKgm ;
   private java.math.BigDecimal[] P000R2_A541HisBarMtr ;
   private boolean[] P000R2_n541HisBarMtr ;
   private short[] P000R2_A553HisNumPie ;
   private boolean[] P000R2_n553HisNumPie ;
   private byte[] P000R2_A12950HisOpeTur ;
   private boolean[] P000R2_n12950HisOpeTur ;
   private int[] P000R2_A12949HisOpecod ;
   private boolean[] P000R2_n12949HisOpecod ;
   private String[] P000R2_A8414HisUsu ;
   private boolean[] P000R2_n8414HisUsu ;
   private String[] P000R2_A6669HisAdeObs ;
   private boolean[] P000R2_n6669HisAdeObs ;
   private String[] P000R2_A6668HisAdeSN ;
   private boolean[] P000R2_n6668HisAdeSN ;
   private String[] P000R2_A5693HisAcCot ;
   private boolean[] P000R2_n5693HisAcCot ;
   private String[] P000R2_A5662HisAcCo ;
   private boolean[] P000R2_n5662HisAcCo ;
   private String[] P000R2_A5695HisAdEAcCt ;
   private boolean[] P000R2_n5695HisAdEAcCt ;
   private String[] P000R2_A5694HisAdEAcCo ;
   private boolean[] P000R2_n5694HisAdEAcCo ;
   private int[] P000R2_A2297HisReoTn ;
   private boolean[] P000R2_n2297HisReoTn ;
   private String[] P000R2_A544HisCodPar ;
   private byte[] P000R2_A545HisCodReo ;
   private int[] P000R2_A539HisBarCod ;
   private GXBaseCollection<app.SdtSDTReoperados> Gxm2rootcol ;
   private app.SdtSDTReoperados Gxm1sdtreoperados ;
}

final  class dpreoperados__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000R2", "SELECT T1.EmprCod, T1.HisEstReo, T1.CliCod, T1.HisReoFec, T1.HisHorReo, T1.HisreoLote, T1.TipDefCod, T3.TipDefDsc, T1.CodCausa, T4.DscCausa, T1.Rps_Cod, T5.Rps_Dsc, T1.MaqCod, T6.MaqDsc, T2.CliNom, T1.HisBarSer, T1.HisReoDsc, T1.HisTipArt, T1.HisColNom, T1.HisColNum, T1.HisTipCol, T1.HisNomCli, T1.HisNumCli, T1.HisBarKgm, T1.HisBarMtr, T1.HisNumPie, T1.HisOpeTur, T1.HisOpecod, T1.HisUsu, T1.HisAdeObs, T1.HisAdeSN, T1.HisAcCot, T1.HisAcCo, T1.HisAdEAcCt, T1.HisAdEAcCo, T1.HisReoTn, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod FROM (((((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPDEF T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T4 ON T4.EmprCod = T1.EmprCod AND T4.CodCausa = T1.CodCausa) LEFT JOIN TXPCODRPS T5 ON T5.EmprCod = T1.EmprCod AND T5.Rps_Cod = T1.Rps_Cod) LEFT JOIN TXPMAQUIN T6 ON T6.EmprCod = T1.EmprCod AND T6.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = ? and T1.HisReoFec >= ?) AND (T1.CliCod >= ?) AND (T1.CliCod <= ?) AND (T1.HisEstReo = ?) AND (T1.HisReoFec <= ?) ORDER BY T1.EmprCod, T1.HisReoFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 60);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 30);
               ((String[]) buf[27])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((int[]) buf[35])[0] = rslt.getInt(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 13);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((int[]) buf[51])[0] = rslt.getInt(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(29, 8);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(30);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(32);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(33);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(34);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(35);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((int[]) buf[67])[0] = rslt.getInt(36);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(37, 1);
               ((byte[]) buf[70])[0] = rslt.getByte(38);
               ((int[]) buf[71])[0] = rslt.getInt(39);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
      }
   }

}

