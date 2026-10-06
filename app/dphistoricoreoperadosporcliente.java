package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dphistoricoreoperadosporcliente extends GXProcedure
{
   public dphistoricoreoperadosporcliente( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dphistoricoreoperadosporcliente.class ), "" );
   }

   public dphistoricoreoperadosporcliente( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtHistoricoReoperadosporCliente> executeUdp( String aP0 ,
                                                                             int aP1 ,
                                                                             int aP2 ,
                                                                             java.util.Date aP3 ,
                                                                             java.util.Date aP4 ,
                                                                             short aP5 ,
                                                                             short aP6 ,
                                                                             String aP7 ,
                                                                             String aP8 ,
                                                                             short aP9 ,
                                                                             short aP10 ,
                                                                             byte aP11 )
   {
      dphistoricoreoperadosporcliente.this.aP12 = new GXBaseCollection[] {new GXBaseCollection<app.SdtHistoricoReoperadosporCliente>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        short aP5 ,
                        short aP6 ,
                        String aP7 ,
                        String aP8 ,
                        short aP9 ,
                        short aP10 ,
                        byte aP11 ,
                        GXBaseCollection<app.SdtHistoricoReoperadosporCliente>[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             short aP5 ,
                             short aP6 ,
                             String aP7 ,
                             String aP8 ,
                             short aP9 ,
                             short aP10 ,
                             byte aP11 ,
                             GXBaseCollection<app.SdtHistoricoReoperadosporCliente>[] aP12 )
   {
      dphistoricoreoperadosporcliente.this.AV7Emprcod = aP0;
      dphistoricoreoperadosporcliente.this.AV5Cliente = aP1;
      dphistoricoreoperadosporcliente.this.AV6Cliente_to = aP2;
      dphistoricoreoperadosporcliente.this.AV9HisreoFec = aP3;
      dphistoricoreoperadosporcliente.this.AV10HisreoFec_to = aP4;
      dphistoricoreoperadosporcliente.this.AV15Tipdefcod = aP5;
      dphistoricoreoperadosporcliente.this.AV16TipDefcod_to = aP6;
      dphistoricoreoperadosporcliente.this.AV11Maqcod = aP7;
      dphistoricoreoperadosporcliente.this.AV12MaqCod_to = aP8;
      dphistoricoreoperadosporcliente.this.AV13TipArtcod = aP9;
      dphistoricoreoperadosporcliente.this.AV14TipArtcod_to = aP10;
      dphistoricoreoperadosporcliente.this.AV8Hisestreo = aP11;
      dphistoricoreoperadosporcliente.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001T2 */
      pr_default.execute(0, new Object[] {AV7Emprcod, Integer.valueOf(AV5Cliente), Short.valueOf(AV15Tipdefcod), AV9HisreoFec, AV10HisreoFec_to, Short.valueOf(AV16TipDefcod_to), AV11Maqcod, AV12MaqCod_to, Short.valueOf(AV13TipArtcod), Short.valueOf(AV14TipArtcod_to), Byte.valueOf(AV8Hisestreo), Integer.valueOf(AV6Cliente_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1T2 = false ;
         A542HisBarSer = P001T2_A542HisBarSer[0] ;
         n542HisBarSer = P001T2_n542HisBarSer[0] ;
         A2299HisReoDsc = P001T2_A2299HisReoDsc[0] ;
         n2299HisReoDsc = P001T2_n2299HisReoDsc[0] ;
         A546HisColNom = P001T2_A546HisColNom[0] ;
         n546HisColNom = P001T2_n546HisColNom[0] ;
         A547HisColNum = P001T2_A547HisColNum[0] ;
         n547HisColNum = P001T2_n547HisColNum[0] ;
         A8889HisNomCli = P001T2_A8889HisNomCli[0] ;
         n8889HisNomCli = P001T2_n8889HisNomCli[0] ;
         A549HisKgmOri = P001T2_A549HisKgmOri[0] ;
         n549HisKgmOri = P001T2_n549HisKgmOri[0] ;
         A540HisBarKgm = P001T2_A540HisBarKgm[0] ;
         n540HisBarKgm = P001T2_n540HisBarKgm[0] ;
         A552HisMtrOri = P001T2_A552HisMtrOri[0] ;
         n552HisMtrOri = P001T2_n552HisMtrOri[0] ;
         A541HisBarMtr = P001T2_A541HisBarMtr[0] ;
         n541HisBarMtr = P001T2_n541HisBarMtr[0] ;
         A602MaqCod = P001T2_A602MaqCod[0] ;
         n602MaqCod = P001T2_n602MaqCod[0] ;
         A606MaqDsc = P001T2_A606MaqDsc[0] ;
         n606MaqDsc = P001T2_n606MaqDsc[0] ;
         A569HisReoFec = P001T2_A569HisReoFec[0] ;
         n569HisReoFec = P001T2_n569HisReoFec[0] ;
         A834TipDefDsc = P001T2_A834TipDefDsc[0] ;
         n834TipDefDsc = P001T2_n834TipDefDsc[0] ;
         A833TipDefCod = P001T2_A833TipDefCod[0] ;
         A252CliCod = P001T2_A252CliCod[0] ;
         n252CliCod = P001T2_n252CliCod[0] ;
         A396EmprCod = P001T2_A396EmprCod[0] ;
         A571HisTipArt = P001T2_A571HisTipArt[0] ;
         n571HisTipArt = P001T2_n571HisTipArt[0] ;
         A548HisEstReo = P001T2_A548HisEstReo[0] ;
         n548HisEstReo = P001T2_n548HisEstReo[0] ;
         A279CliNom = P001T2_A279CliNom[0] ;
         A544HisCodPar = P001T2_A544HisCodPar[0] ;
         A545HisCodReo = P001T2_A545HisCodReo[0] ;
         A539HisBarCod = P001T2_A539HisBarCod[0] ;
         A279CliNom = P001T2_A279CliNom[0] ;
         A606MaqDsc = P001T2_A606MaqDsc[0] ;
         n606MaqDsc = P001T2_n606MaqDsc[0] ;
         A834TipDefDsc = P001T2_A834TipDefDsc[0] ;
         n834TipDefDsc = P001T2_n834TipDefDsc[0] ;
         A13697HisReoHDR = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
         Gxm1historicoreoperadosporcliente = (app.SdtHistoricoReoperadosporCliente)new app.SdtHistoricoReoperadosporCliente(remoteHandle, context);
         Gxm2rootcol.add(Gxm1historicoreoperadosporcliente, 0);
         Gxm1historicoreoperadosporcliente.setgxTv_SdtHistoricoReoperadosporCliente_Clicod( A252CliCod );
         Gxm1historicoreoperadosporcliente.setgxTv_SdtHistoricoReoperadosporCliente_Clinom( A279CliNom );
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001T2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P001T2_A252CliCod[0] == A252CliCod ) )
         {
            brk1T2 = false ;
            A542HisBarSer = P001T2_A542HisBarSer[0] ;
            n542HisBarSer = P001T2_n542HisBarSer[0] ;
            A2299HisReoDsc = P001T2_A2299HisReoDsc[0] ;
            n2299HisReoDsc = P001T2_n2299HisReoDsc[0] ;
            A546HisColNom = P001T2_A546HisColNom[0] ;
            n546HisColNom = P001T2_n546HisColNom[0] ;
            A547HisColNum = P001T2_A547HisColNum[0] ;
            n547HisColNum = P001T2_n547HisColNum[0] ;
            A8889HisNomCli = P001T2_A8889HisNomCli[0] ;
            n8889HisNomCli = P001T2_n8889HisNomCli[0] ;
            A549HisKgmOri = P001T2_A549HisKgmOri[0] ;
            n549HisKgmOri = P001T2_n549HisKgmOri[0] ;
            A540HisBarKgm = P001T2_A540HisBarKgm[0] ;
            n540HisBarKgm = P001T2_n540HisBarKgm[0] ;
            A552HisMtrOri = P001T2_A552HisMtrOri[0] ;
            n552HisMtrOri = P001T2_n552HisMtrOri[0] ;
            A541HisBarMtr = P001T2_A541HisBarMtr[0] ;
            n541HisBarMtr = P001T2_n541HisBarMtr[0] ;
            A602MaqCod = P001T2_A602MaqCod[0] ;
            n602MaqCod = P001T2_n602MaqCod[0] ;
            A606MaqDsc = P001T2_A606MaqDsc[0] ;
            n606MaqDsc = P001T2_n606MaqDsc[0] ;
            A569HisReoFec = P001T2_A569HisReoFec[0] ;
            n569HisReoFec = P001T2_n569HisReoFec[0] ;
            A834TipDefDsc = P001T2_A834TipDefDsc[0] ;
            n834TipDefDsc = P001T2_n834TipDefDsc[0] ;
            A833TipDefCod = P001T2_A833TipDefCod[0] ;
            A544HisCodPar = P001T2_A544HisCodPar[0] ;
            A545HisCodReo = P001T2_A545HisCodReo[0] ;
            A539HisBarCod = P001T2_A539HisBarCod[0] ;
            A606MaqDsc = P001T2_A606MaqDsc[0] ;
            n606MaqDsc = P001T2_n606MaqDsc[0] ;
            A834TipDefDsc = P001T2_A834TipDefDsc[0] ;
            n834TipDefDsc = P001T2_n834TipDefDsc[0] ;
            A13697HisReoHDR = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
            Gxm3historicoreoperadosporcliente_tiposdedefectos = (app.SdtHistoricoReoperadosporCliente_TipodeDefecto)new app.SdtHistoricoReoperadosporCliente_TipodeDefecto(remoteHandle, context);
            Gxm1historicoreoperadosporcliente.getgxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos().add(Gxm3historicoreoperadosporcliente_tiposdedefectos, 0);
            Gxm3historicoreoperadosporcliente_tiposdedefectos.setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefcod( A833TipDefCod );
            Gxm3historicoreoperadosporcliente_tiposdedefectos.setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefdsc( A834TipDefDsc );
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001T2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P001T2_A252CliCod[0] == A252CliCod ) && ( P001T2_A833TipDefCod[0] == A833TipDefCod ) )
            {
               brk1T2 = false ;
               A542HisBarSer = P001T2_A542HisBarSer[0] ;
               n542HisBarSer = P001T2_n542HisBarSer[0] ;
               A2299HisReoDsc = P001T2_A2299HisReoDsc[0] ;
               n2299HisReoDsc = P001T2_n2299HisReoDsc[0] ;
               A546HisColNom = P001T2_A546HisColNom[0] ;
               n546HisColNom = P001T2_n546HisColNom[0] ;
               A547HisColNum = P001T2_A547HisColNum[0] ;
               n547HisColNum = P001T2_n547HisColNum[0] ;
               A8889HisNomCli = P001T2_A8889HisNomCli[0] ;
               n8889HisNomCli = P001T2_n8889HisNomCli[0] ;
               A549HisKgmOri = P001T2_A549HisKgmOri[0] ;
               n549HisKgmOri = P001T2_n549HisKgmOri[0] ;
               A540HisBarKgm = P001T2_A540HisBarKgm[0] ;
               n540HisBarKgm = P001T2_n540HisBarKgm[0] ;
               A552HisMtrOri = P001T2_A552HisMtrOri[0] ;
               n552HisMtrOri = P001T2_n552HisMtrOri[0] ;
               A541HisBarMtr = P001T2_A541HisBarMtr[0] ;
               n541HisBarMtr = P001T2_n541HisBarMtr[0] ;
               A602MaqCod = P001T2_A602MaqCod[0] ;
               n602MaqCod = P001T2_n602MaqCod[0] ;
               A606MaqDsc = P001T2_A606MaqDsc[0] ;
               n606MaqDsc = P001T2_n606MaqDsc[0] ;
               A569HisReoFec = P001T2_A569HisReoFec[0] ;
               n569HisReoFec = P001T2_n569HisReoFec[0] ;
               A544HisCodPar = P001T2_A544HisCodPar[0] ;
               A545HisCodReo = P001T2_A545HisCodReo[0] ;
               A539HisBarCod = P001T2_A539HisBarCod[0] ;
               A606MaqDsc = P001T2_A606MaqDsc[0] ;
               n606MaqDsc = P001T2_n606MaqDsc[0] ;
               A13697HisReoHDR = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
               Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs = (app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR)new app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR(remoteHandle, context);
               Gxm3historicoreoperadosporcliente_tiposdedefectos.getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs().add(Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs, 0);
               Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs.setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarser( A542HisBarSer );
               Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs.setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreodsc( A2299HisReoDsc );
               Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs.setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnom( A546HisColNom );
               Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs.setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnum( A547HisColNum );
               Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs.setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisnomcli( A8889HisNomCli );
               Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs.setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreohdr( A13697HisReoHDR );
               Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs.setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec( A569HisReoFec );
               Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs.setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiskgmori( A549HisKgmOri );
               Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs.setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarkgm( A540HisBarKgm );
               Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs.setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hismtrori( A552HisMtrOri );
               Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs.setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarmtr( A541HisBarMtr );
               Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs.setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqcod( A602MaqCod );
               Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs.setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqdsc( A606MaqDsc );
               brk1T2 = true ;
               pr_default.readNext(0);
            }
            if ( ! brk1T2 )
            {
               brk1T2 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brk1T2 )
         {
            brk1T2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP12[0] = dphistoricoreoperadosporcliente.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(0);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtHistoricoReoperadosporCliente>(app.SdtHistoricoReoperadosporCliente.class, "HistoricoReoperadosporCliente", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P001T2_A542HisBarSer = new String[] {""} ;
      P001T2_n542HisBarSer = new boolean[] {false} ;
      P001T2_A2299HisReoDsc = new String[] {""} ;
      P001T2_n2299HisReoDsc = new boolean[] {false} ;
      P001T2_A546HisColNom = new String[] {""} ;
      P001T2_n546HisColNom = new boolean[] {false} ;
      P001T2_A547HisColNum = new int[1] ;
      P001T2_n547HisColNum = new boolean[] {false} ;
      P001T2_A8889HisNomCli = new String[] {""} ;
      P001T2_n8889HisNomCli = new boolean[] {false} ;
      P001T2_A549HisKgmOri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001T2_n549HisKgmOri = new boolean[] {false} ;
      P001T2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001T2_n540HisBarKgm = new boolean[] {false} ;
      P001T2_A552HisMtrOri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001T2_n552HisMtrOri = new boolean[] {false} ;
      P001T2_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001T2_n541HisBarMtr = new boolean[] {false} ;
      P001T2_A602MaqCod = new String[] {""} ;
      P001T2_n602MaqCod = new boolean[] {false} ;
      P001T2_A606MaqDsc = new String[] {""} ;
      P001T2_n606MaqDsc = new boolean[] {false} ;
      P001T2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P001T2_n569HisReoFec = new boolean[] {false} ;
      P001T2_A834TipDefDsc = new String[] {""} ;
      P001T2_n834TipDefDsc = new boolean[] {false} ;
      P001T2_A833TipDefCod = new short[1] ;
      P001T2_A252CliCod = new int[1] ;
      P001T2_n252CliCod = new boolean[] {false} ;
      P001T2_A396EmprCod = new String[] {""} ;
      P001T2_A571HisTipArt = new short[1] ;
      P001T2_n571HisTipArt = new boolean[] {false} ;
      P001T2_A548HisEstReo = new byte[1] ;
      P001T2_n548HisEstReo = new boolean[] {false} ;
      P001T2_A279CliNom = new String[] {""} ;
      P001T2_A544HisCodPar = new String[] {""} ;
      P001T2_A545HisCodReo = new byte[1] ;
      P001T2_A539HisBarCod = new int[1] ;
      A542HisBarSer = "" ;
      A2299HisReoDsc = "" ;
      A546HisColNom = "" ;
      A8889HisNomCli = "" ;
      A549HisKgmOri = DecimalUtil.ZERO ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A552HisMtrOri = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A834TipDefDsc = "" ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      A544HisCodPar = "" ;
      A13697HisReoHDR = "" ;
      Gxm1historicoreoperadosporcliente = new app.SdtHistoricoReoperadosporCliente(remoteHandle, context);
      Gxm3historicoreoperadosporcliente_tiposdedefectos = new app.SdtHistoricoReoperadosporCliente_TipodeDefecto(remoteHandle, context);
      Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs = new app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dphistoricoreoperadosporcliente__default(),
         new Object[] {
             new Object[] {
            P001T2_A542HisBarSer, P001T2_n542HisBarSer, P001T2_A2299HisReoDsc, P001T2_n2299HisReoDsc, P001T2_A546HisColNom, P001T2_n546HisColNom, P001T2_A547HisColNum, P001T2_n547HisColNum, P001T2_A8889HisNomCli, P001T2_n8889HisNomCli,
            P001T2_A549HisKgmOri, P001T2_n549HisKgmOri, P001T2_A540HisBarKgm, P001T2_n540HisBarKgm, P001T2_A552HisMtrOri, P001T2_n552HisMtrOri, P001T2_A541HisBarMtr, P001T2_n541HisBarMtr, P001T2_A602MaqCod, P001T2_n602MaqCod,
            P001T2_A606MaqDsc, P001T2_n606MaqDsc, P001T2_A569HisReoFec, P001T2_n569HisReoFec, P001T2_A834TipDefDsc, P001T2_n834TipDefDsc, P001T2_A833TipDefCod, P001T2_A252CliCod, P001T2_n252CliCod, P001T2_A396EmprCod,
            P001T2_A571HisTipArt, P001T2_n571HisTipArt, P001T2_A548HisEstReo, P001T2_n548HisEstReo, P001T2_A279CliNom, P001T2_A544HisCodPar, P001T2_A545HisCodReo, P001T2_A539HisBarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Hisestreo ;
   private byte A548HisEstReo ;
   private byte A545HisCodReo ;
   private short AV15Tipdefcod ;
   private short AV16TipDefcod_to ;
   private short AV13TipArtcod ;
   private short AV14TipArtcod_to ;
   private short A833TipDefCod ;
   private short A571HisTipArt ;
   private short Gx_err ;
   private int AV5Cliente ;
   private int AV6Cliente_to ;
   private int A547HisColNum ;
   private int A252CliCod ;
   private int A539HisBarCod ;
   private java.math.BigDecimal A549HisKgmOri ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A552HisMtrOri ;
   private java.math.BigDecimal A541HisBarMtr ;
   private String AV7Emprcod ;
   private String AV11Maqcod ;
   private String AV12MaqCod_to ;
   private String scmdbuf ;
   private String A542HisBarSer ;
   private String A2299HisReoDsc ;
   private String A546HisColNom ;
   private String A8889HisNomCli ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A834TipDefDsc ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A544HisCodPar ;
   private String A13697HisReoHDR ;
   private java.util.Date AV9HisreoFec ;
   private java.util.Date AV10HisreoFec_to ;
   private java.util.Date A569HisReoFec ;
   private boolean brk1T2 ;
   private boolean n542HisBarSer ;
   private boolean n2299HisReoDsc ;
   private boolean n546HisColNom ;
   private boolean n547HisColNum ;
   private boolean n8889HisNomCli ;
   private boolean n549HisKgmOri ;
   private boolean n540HisBarKgm ;
   private boolean n552HisMtrOri ;
   private boolean n541HisBarMtr ;
   private boolean n602MaqCod ;
   private boolean n606MaqDsc ;
   private boolean n569HisReoFec ;
   private boolean n834TipDefDsc ;
   private boolean n252CliCod ;
   private boolean n571HisTipArt ;
   private boolean n548HisEstReo ;
   private GXBaseCollection<app.SdtHistoricoReoperadosporCliente>[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P001T2_A542HisBarSer ;
   private boolean[] P001T2_n542HisBarSer ;
   private String[] P001T2_A2299HisReoDsc ;
   private boolean[] P001T2_n2299HisReoDsc ;
   private String[] P001T2_A546HisColNom ;
   private boolean[] P001T2_n546HisColNom ;
   private int[] P001T2_A547HisColNum ;
   private boolean[] P001T2_n547HisColNum ;
   private String[] P001T2_A8889HisNomCli ;
   private boolean[] P001T2_n8889HisNomCli ;
   private java.math.BigDecimal[] P001T2_A549HisKgmOri ;
   private boolean[] P001T2_n549HisKgmOri ;
   private java.math.BigDecimal[] P001T2_A540HisBarKgm ;
   private boolean[] P001T2_n540HisBarKgm ;
   private java.math.BigDecimal[] P001T2_A552HisMtrOri ;
   private boolean[] P001T2_n552HisMtrOri ;
   private java.math.BigDecimal[] P001T2_A541HisBarMtr ;
   private boolean[] P001T2_n541HisBarMtr ;
   private String[] P001T2_A602MaqCod ;
   private boolean[] P001T2_n602MaqCod ;
   private String[] P001T2_A606MaqDsc ;
   private boolean[] P001T2_n606MaqDsc ;
   private java.util.Date[] P001T2_A569HisReoFec ;
   private boolean[] P001T2_n569HisReoFec ;
   private String[] P001T2_A834TipDefDsc ;
   private boolean[] P001T2_n834TipDefDsc ;
   private short[] P001T2_A833TipDefCod ;
   private int[] P001T2_A252CliCod ;
   private boolean[] P001T2_n252CliCod ;
   private String[] P001T2_A396EmprCod ;
   private short[] P001T2_A571HisTipArt ;
   private boolean[] P001T2_n571HisTipArt ;
   private byte[] P001T2_A548HisEstReo ;
   private boolean[] P001T2_n548HisEstReo ;
   private String[] P001T2_A279CliNom ;
   private String[] P001T2_A544HisCodPar ;
   private byte[] P001T2_A545HisCodReo ;
   private int[] P001T2_A539HisBarCod ;
   private GXBaseCollection<app.SdtHistoricoReoperadosporCliente> Gxm2rootcol ;
   private app.SdtHistoricoReoperadosporCliente Gxm1historicoreoperadosporcliente ;
   private app.SdtHistoricoReoperadosporCliente_TipodeDefecto Gxm3historicoreoperadosporcliente_tiposdedefectos ;
   private app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR Gxm4historicoreoperadosporcliente_tiposdedefectos_hdrs ;
}

final  class dphistoricoreoperadosporcliente__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001T2", "SELECT T1.HisBarSer, T1.HisReoDsc, T1.HisColNom, T1.HisColNum, T1.HisNomCli, T1.HisKgmOri, T1.HisBarKgm, T1.HisMtrOri, T1.HisBarMtr, T1.MaqCod, T3.MaqDsc, T1.HisReoFec, T4.TipDefDsc, T1.TipDefCod, T1.CliCod, T1.EmprCod, T1.HisTipArt, T1.HisEstReo, T2.CliNom, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod FROM (((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.MaqCod) INNER JOIN TXPTIPDEF T4 ON T4.EmprCod = T1.EmprCod AND T4.TipDefCod = T1.TipDefCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.TipDefCod >= ? and T1.HisReoFec >= ?) AND (T1.HisReoFec <= ?) AND (T1.TipDefCod <= ?) AND (T1.MaqCod >= ?) AND (T1.MaqCod <= ?) AND (T1.HisTipArt >= ?) AND (T1.HisTipArt <= ?) AND (T1.HisEstReo = ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.TipDefCod, T1.HisReoFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(14);
               ((int[]) buf[27])[0] = rslt.getInt(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((short[]) buf[30])[0] = rslt.getShort(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((byte[]) buf[32])[0] = rslt.getByte(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 30);
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((byte[]) buf[36])[0] = rslt.getByte(21);
               ((int[]) buf[37])[0] = rslt.getInt(22);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               return;
      }
   }

}

