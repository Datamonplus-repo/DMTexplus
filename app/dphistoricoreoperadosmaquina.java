package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dphistoricoreoperadosmaquina extends GXProcedure
{
   public dphistoricoreoperadosmaquina( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dphistoricoreoperadosmaquina.class ), "" );
   }

   public dphistoricoreoperadosmaquina( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina> executeUdp( String aP0 ,
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
      dphistoricoreoperadosmaquina.this.aP12 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina>()};
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
                        GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina>[] aP12 )
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
                             GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina>[] aP12 )
   {
      dphistoricoreoperadosmaquina.this.AV7Emprcod = aP0;
      dphistoricoreoperadosmaquina.this.AV5Cliente = aP1;
      dphistoricoreoperadosmaquina.this.AV6Cliente_to = aP2;
      dphistoricoreoperadosmaquina.this.AV9HisreoFec = aP3;
      dphistoricoreoperadosmaquina.this.AV10HisreoFec_to = aP4;
      dphistoricoreoperadosmaquina.this.AV15Tipdefcod = aP5;
      dphistoricoreoperadosmaquina.this.AV16TipDefcod_to = aP6;
      dphistoricoreoperadosmaquina.this.AV11Maqcod = aP7;
      dphistoricoreoperadosmaquina.this.AV12MaqCod_to = aP8;
      dphistoricoreoperadosmaquina.this.AV13TipArtcod = aP9;
      dphistoricoreoperadosmaquina.this.AV14TipArtcod_to = aP10;
      dphistoricoreoperadosmaquina.this.AV8Hisestreo = aP11;
      dphistoricoreoperadosmaquina.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001U2 */
      pr_default.execute(0, new Object[] {AV7Emprcod, AV11Maqcod, Short.valueOf(AV15Tipdefcod), AV9HisreoFec, Integer.valueOf(AV5Cliente), Integer.valueOf(AV6Cliente_to), AV10HisreoFec_to, Short.valueOf(AV16TipDefcod_to), Short.valueOf(AV13TipArtcod), Short.valueOf(AV14TipArtcod_to), Byte.valueOf(AV8Hisestreo), AV12MaqCod_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1U2 = false ;
         A542HisBarSer = P001U2_A542HisBarSer[0] ;
         n542HisBarSer = P001U2_n542HisBarSer[0] ;
         A2299HisReoDsc = P001U2_A2299HisReoDsc[0] ;
         n2299HisReoDsc = P001U2_n2299HisReoDsc[0] ;
         A546HisColNom = P001U2_A546HisColNom[0] ;
         n546HisColNom = P001U2_n546HisColNom[0] ;
         A547HisColNum = P001U2_A547HisColNum[0] ;
         n547HisColNum = P001U2_n547HisColNum[0] ;
         A8889HisNomCli = P001U2_A8889HisNomCli[0] ;
         n8889HisNomCli = P001U2_n8889HisNomCli[0] ;
         A549HisKgmOri = P001U2_A549HisKgmOri[0] ;
         n549HisKgmOri = P001U2_n549HisKgmOri[0] ;
         A540HisBarKgm = P001U2_A540HisBarKgm[0] ;
         n540HisBarKgm = P001U2_n540HisBarKgm[0] ;
         A552HisMtrOri = P001U2_A552HisMtrOri[0] ;
         n552HisMtrOri = P001U2_n552HisMtrOri[0] ;
         A541HisBarMtr = P001U2_A541HisBarMtr[0] ;
         n541HisBarMtr = P001U2_n541HisBarMtr[0] ;
         A569HisReoFec = P001U2_A569HisReoFec[0] ;
         n569HisReoFec = P001U2_n569HisReoFec[0] ;
         A834TipDefDsc = P001U2_A834TipDefDsc[0] ;
         n834TipDefDsc = P001U2_n834TipDefDsc[0] ;
         A833TipDefCod = P001U2_A833TipDefCod[0] ;
         A602MaqCod = P001U2_A602MaqCod[0] ;
         n602MaqCod = P001U2_n602MaqCod[0] ;
         A396EmprCod = P001U2_A396EmprCod[0] ;
         A571HisTipArt = P001U2_A571HisTipArt[0] ;
         n571HisTipArt = P001U2_n571HisTipArt[0] ;
         A548HisEstReo = P001U2_A548HisEstReo[0] ;
         n548HisEstReo = P001U2_n548HisEstReo[0] ;
         A252CliCod = P001U2_A252CliCod[0] ;
         n252CliCod = P001U2_n252CliCod[0] ;
         A606MaqDsc = P001U2_A606MaqDsc[0] ;
         n606MaqDsc = P001U2_n606MaqDsc[0] ;
         A544HisCodPar = P001U2_A544HisCodPar[0] ;
         A545HisCodReo = P001U2_A545HisCodReo[0] ;
         A539HisBarCod = P001U2_A539HisBarCod[0] ;
         A606MaqDsc = P001U2_A606MaqDsc[0] ;
         n606MaqDsc = P001U2_n606MaqDsc[0] ;
         A834TipDefDsc = P001U2_A834TipDefDsc[0] ;
         n834TipDefDsc = P001U2_n834TipDefDsc[0] ;
         A13697HisReoHDR = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
         Gxm1sdthistoricoreoperadosmaquina = (app.SdtSDTHistoricoReoperadosMaquina)new app.SdtSDTHistoricoReoperadosMaquina(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdthistoricoreoperadosmaquina, 0);
         Gxm1sdthistoricoreoperadosmaquina.setgxTv_SdtSDTHistoricoReoperadosMaquina_Maqcod( A602MaqCod );
         Gxm1sdthistoricoreoperadosmaquina.setgxTv_SdtSDTHistoricoReoperadosMaquina_Maqdsc( A606MaqDsc );
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001U2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P001U2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk1U2 = false ;
            A542HisBarSer = P001U2_A542HisBarSer[0] ;
            n542HisBarSer = P001U2_n542HisBarSer[0] ;
            A2299HisReoDsc = P001U2_A2299HisReoDsc[0] ;
            n2299HisReoDsc = P001U2_n2299HisReoDsc[0] ;
            A546HisColNom = P001U2_A546HisColNom[0] ;
            n546HisColNom = P001U2_n546HisColNom[0] ;
            A547HisColNum = P001U2_A547HisColNum[0] ;
            n547HisColNum = P001U2_n547HisColNum[0] ;
            A8889HisNomCli = P001U2_A8889HisNomCli[0] ;
            n8889HisNomCli = P001U2_n8889HisNomCli[0] ;
            A549HisKgmOri = P001U2_A549HisKgmOri[0] ;
            n549HisKgmOri = P001U2_n549HisKgmOri[0] ;
            A540HisBarKgm = P001U2_A540HisBarKgm[0] ;
            n540HisBarKgm = P001U2_n540HisBarKgm[0] ;
            A552HisMtrOri = P001U2_A552HisMtrOri[0] ;
            n552HisMtrOri = P001U2_n552HisMtrOri[0] ;
            A541HisBarMtr = P001U2_A541HisBarMtr[0] ;
            n541HisBarMtr = P001U2_n541HisBarMtr[0] ;
            A569HisReoFec = P001U2_A569HisReoFec[0] ;
            n569HisReoFec = P001U2_n569HisReoFec[0] ;
            A834TipDefDsc = P001U2_A834TipDefDsc[0] ;
            n834TipDefDsc = P001U2_n834TipDefDsc[0] ;
            A833TipDefCod = P001U2_A833TipDefCod[0] ;
            A544HisCodPar = P001U2_A544HisCodPar[0] ;
            A545HisCodReo = P001U2_A545HisCodReo[0] ;
            A539HisBarCod = P001U2_A539HisBarCod[0] ;
            A834TipDefDsc = P001U2_A834TipDefDsc[0] ;
            n834TipDefDsc = P001U2_n834TipDefDsc[0] ;
            A13697HisReoHDR = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
            Gxm3sdthistoricoreoperadosmaquina_tiposdedefectos = (app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto)new app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto(remoteHandle, context);
            Gxm1sdthistoricoreoperadosmaquina.getgxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos().add(Gxm3sdthistoricoreoperadosmaquina_tiposdedefectos, 0);
            Gxm3sdthistoricoreoperadosmaquina_tiposdedefectos.setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefcod( A833TipDefCod );
            Gxm3sdthistoricoreoperadosmaquina_tiposdedefectos.setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefdsc( A834TipDefDsc );
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001U2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P001U2_A602MaqCod[0], A602MaqCod) == 0 ) && ( P001U2_A833TipDefCod[0] == A833TipDefCod ) )
            {
               brk1U2 = false ;
               A542HisBarSer = P001U2_A542HisBarSer[0] ;
               n542HisBarSer = P001U2_n542HisBarSer[0] ;
               A2299HisReoDsc = P001U2_A2299HisReoDsc[0] ;
               n2299HisReoDsc = P001U2_n2299HisReoDsc[0] ;
               A546HisColNom = P001U2_A546HisColNom[0] ;
               n546HisColNom = P001U2_n546HisColNom[0] ;
               A547HisColNum = P001U2_A547HisColNum[0] ;
               n547HisColNum = P001U2_n547HisColNum[0] ;
               A8889HisNomCli = P001U2_A8889HisNomCli[0] ;
               n8889HisNomCli = P001U2_n8889HisNomCli[0] ;
               A549HisKgmOri = P001U2_A549HisKgmOri[0] ;
               n549HisKgmOri = P001U2_n549HisKgmOri[0] ;
               A540HisBarKgm = P001U2_A540HisBarKgm[0] ;
               n540HisBarKgm = P001U2_n540HisBarKgm[0] ;
               A552HisMtrOri = P001U2_A552HisMtrOri[0] ;
               n552HisMtrOri = P001U2_n552HisMtrOri[0] ;
               A541HisBarMtr = P001U2_A541HisBarMtr[0] ;
               n541HisBarMtr = P001U2_n541HisBarMtr[0] ;
               A569HisReoFec = P001U2_A569HisReoFec[0] ;
               n569HisReoFec = P001U2_n569HisReoFec[0] ;
               A544HisCodPar = P001U2_A544HisCodPar[0] ;
               A545HisCodReo = P001U2_A545HisCodReo[0] ;
               A539HisBarCod = P001U2_A539HisBarCod[0] ;
               A13697HisReoHDR = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
               Gxm4sdthistoricoreoperadosmaquina_tiposdedefectos_hdrs = (app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr)new app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr(remoteHandle, context);
               Gxm3sdthistoricoreoperadosmaquina_tiposdedefectos.getgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs().add(Gxm4sdthistoricoreoperadosmaquina_tiposdedefectos_hdrs, 0);
               Gxm4sdthistoricoreoperadosmaquina_tiposdedefectos_hdrs.setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisbarser( A542HisBarSer );
               Gxm4sdthistoricoreoperadosmaquina_tiposdedefectos_hdrs.setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreodsc( A2299HisReoDsc );
               Gxm4sdthistoricoreoperadosmaquina_tiposdedefectos_hdrs.setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hiscolnom( A546HisColNom );
               Gxm4sdthistoricoreoperadosmaquina_tiposdedefectos_hdrs.setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hiscolnum( A547HisColNum );
               Gxm4sdthistoricoreoperadosmaquina_tiposdedefectos_hdrs.setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisnomcli( A8889HisNomCli );
               Gxm4sdthistoricoreoperadosmaquina_tiposdedefectos_hdrs.setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreohdr( A13697HisReoHDR );
               Gxm4sdthistoricoreoperadosmaquina_tiposdedefectos_hdrs.setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreofec( A569HisReoFec );
               Gxm4sdthistoricoreoperadosmaquina_tiposdedefectos_hdrs.setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hiskgmori( A549HisKgmOri );
               Gxm4sdthistoricoreoperadosmaquina_tiposdedefectos_hdrs.setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisbarkgm( A540HisBarKgm );
               Gxm4sdthistoricoreoperadosmaquina_tiposdedefectos_hdrs.setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hismtrori( A552HisMtrOri );
               Gxm4sdthistoricoreoperadosmaquina_tiposdedefectos_hdrs.setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisbarmtr( A541HisBarMtr );
               brk1U2 = true ;
               pr_default.readNext(0);
            }
            if ( ! brk1U2 )
            {
               brk1U2 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brk1U2 )
         {
            brk1U2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP12[0] = dphistoricoreoperadosmaquina.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina>(app.SdtSDTHistoricoReoperadosMaquina.class, "SDTHistoricoReoperadosMaquina", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P001U2_A542HisBarSer = new String[] {""} ;
      P001U2_n542HisBarSer = new boolean[] {false} ;
      P001U2_A2299HisReoDsc = new String[] {""} ;
      P001U2_n2299HisReoDsc = new boolean[] {false} ;
      P001U2_A546HisColNom = new String[] {""} ;
      P001U2_n546HisColNom = new boolean[] {false} ;
      P001U2_A547HisColNum = new int[1] ;
      P001U2_n547HisColNum = new boolean[] {false} ;
      P001U2_A8889HisNomCli = new String[] {""} ;
      P001U2_n8889HisNomCli = new boolean[] {false} ;
      P001U2_A549HisKgmOri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001U2_n549HisKgmOri = new boolean[] {false} ;
      P001U2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001U2_n540HisBarKgm = new boolean[] {false} ;
      P001U2_A552HisMtrOri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001U2_n552HisMtrOri = new boolean[] {false} ;
      P001U2_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001U2_n541HisBarMtr = new boolean[] {false} ;
      P001U2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P001U2_n569HisReoFec = new boolean[] {false} ;
      P001U2_A834TipDefDsc = new String[] {""} ;
      P001U2_n834TipDefDsc = new boolean[] {false} ;
      P001U2_A833TipDefCod = new short[1] ;
      P001U2_A602MaqCod = new String[] {""} ;
      P001U2_n602MaqCod = new boolean[] {false} ;
      P001U2_A396EmprCod = new String[] {""} ;
      P001U2_A571HisTipArt = new short[1] ;
      P001U2_n571HisTipArt = new boolean[] {false} ;
      P001U2_A548HisEstReo = new byte[1] ;
      P001U2_n548HisEstReo = new boolean[] {false} ;
      P001U2_A252CliCod = new int[1] ;
      P001U2_n252CliCod = new boolean[] {false} ;
      P001U2_A606MaqDsc = new String[] {""} ;
      P001U2_n606MaqDsc = new boolean[] {false} ;
      P001U2_A544HisCodPar = new String[] {""} ;
      P001U2_A545HisCodReo = new byte[1] ;
      P001U2_A539HisBarCod = new int[1] ;
      A542HisBarSer = "" ;
      A2299HisReoDsc = "" ;
      A546HisColNom = "" ;
      A8889HisNomCli = "" ;
      A549HisKgmOri = DecimalUtil.ZERO ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A552HisMtrOri = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A569HisReoFec = GXutil.nullDate() ;
      A834TipDefDsc = "" ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A606MaqDsc = "" ;
      A544HisCodPar = "" ;
      A13697HisReoHDR = "" ;
      Gxm1sdthistoricoreoperadosmaquina = new app.SdtSDTHistoricoReoperadosMaquina(remoteHandle, context);
      Gxm3sdthistoricoreoperadosmaquina_tiposdedefectos = new app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto(remoteHandle, context);
      Gxm4sdthistoricoreoperadosmaquina_tiposdedefectos_hdrs = new app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dphistoricoreoperadosmaquina__default(),
         new Object[] {
             new Object[] {
            P001U2_A542HisBarSer, P001U2_n542HisBarSer, P001U2_A2299HisReoDsc, P001U2_n2299HisReoDsc, P001U2_A546HisColNom, P001U2_n546HisColNom, P001U2_A547HisColNum, P001U2_n547HisColNum, P001U2_A8889HisNomCli, P001U2_n8889HisNomCli,
            P001U2_A549HisKgmOri, P001U2_n549HisKgmOri, P001U2_A540HisBarKgm, P001U2_n540HisBarKgm, P001U2_A552HisMtrOri, P001U2_n552HisMtrOri, P001U2_A541HisBarMtr, P001U2_n541HisBarMtr, P001U2_A569HisReoFec, P001U2_n569HisReoFec,
            P001U2_A834TipDefDsc, P001U2_n834TipDefDsc, P001U2_A833TipDefCod, P001U2_A602MaqCod, P001U2_n602MaqCod, P001U2_A396EmprCod, P001U2_A571HisTipArt, P001U2_n571HisTipArt, P001U2_A548HisEstReo, P001U2_n548HisEstReo,
            P001U2_A252CliCod, P001U2_n252CliCod, P001U2_A606MaqDsc, P001U2_n606MaqDsc, P001U2_A544HisCodPar, P001U2_A545HisCodReo, P001U2_A539HisBarCod
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
   private String A834TipDefDsc ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A606MaqDsc ;
   private String A544HisCodPar ;
   private String A13697HisReoHDR ;
   private java.util.Date AV9HisreoFec ;
   private java.util.Date AV10HisreoFec_to ;
   private java.util.Date A569HisReoFec ;
   private boolean brk1U2 ;
   private boolean n542HisBarSer ;
   private boolean n2299HisReoDsc ;
   private boolean n546HisColNom ;
   private boolean n547HisColNum ;
   private boolean n8889HisNomCli ;
   private boolean n549HisKgmOri ;
   private boolean n540HisBarKgm ;
   private boolean n552HisMtrOri ;
   private boolean n541HisBarMtr ;
   private boolean n569HisReoFec ;
   private boolean n834TipDefDsc ;
   private boolean n602MaqCod ;
   private boolean n571HisTipArt ;
   private boolean n548HisEstReo ;
   private boolean n252CliCod ;
   private boolean n606MaqDsc ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina>[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P001U2_A542HisBarSer ;
   private boolean[] P001U2_n542HisBarSer ;
   private String[] P001U2_A2299HisReoDsc ;
   private boolean[] P001U2_n2299HisReoDsc ;
   private String[] P001U2_A546HisColNom ;
   private boolean[] P001U2_n546HisColNom ;
   private int[] P001U2_A547HisColNum ;
   private boolean[] P001U2_n547HisColNum ;
   private String[] P001U2_A8889HisNomCli ;
   private boolean[] P001U2_n8889HisNomCli ;
   private java.math.BigDecimal[] P001U2_A549HisKgmOri ;
   private boolean[] P001U2_n549HisKgmOri ;
   private java.math.BigDecimal[] P001U2_A540HisBarKgm ;
   private boolean[] P001U2_n540HisBarKgm ;
   private java.math.BigDecimal[] P001U2_A552HisMtrOri ;
   private boolean[] P001U2_n552HisMtrOri ;
   private java.math.BigDecimal[] P001U2_A541HisBarMtr ;
   private boolean[] P001U2_n541HisBarMtr ;
   private java.util.Date[] P001U2_A569HisReoFec ;
   private boolean[] P001U2_n569HisReoFec ;
   private String[] P001U2_A834TipDefDsc ;
   private boolean[] P001U2_n834TipDefDsc ;
   private short[] P001U2_A833TipDefCod ;
   private String[] P001U2_A602MaqCod ;
   private boolean[] P001U2_n602MaqCod ;
   private String[] P001U2_A396EmprCod ;
   private short[] P001U2_A571HisTipArt ;
   private boolean[] P001U2_n571HisTipArt ;
   private byte[] P001U2_A548HisEstReo ;
   private boolean[] P001U2_n548HisEstReo ;
   private int[] P001U2_A252CliCod ;
   private boolean[] P001U2_n252CliCod ;
   private String[] P001U2_A606MaqDsc ;
   private boolean[] P001U2_n606MaqDsc ;
   private String[] P001U2_A544HisCodPar ;
   private byte[] P001U2_A545HisCodReo ;
   private int[] P001U2_A539HisBarCod ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina> Gxm2rootcol ;
   private app.SdtSDTHistoricoReoperadosMaquina Gxm1sdthistoricoreoperadosmaquina ;
   private app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto Gxm3sdthistoricoreoperadosmaquina_tiposdedefectos ;
   private app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr Gxm4sdthistoricoreoperadosmaquina_tiposdedefectos_hdrs ;
}

final  class dphistoricoreoperadosmaquina__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001U2", "SELECT T1.HisBarSer, T1.HisReoDsc, T1.HisColNom, T1.HisColNum, T1.HisNomCli, T1.HisKgmOri, T1.HisBarKgm, T1.HisMtrOri, T1.HisBarMtr, T1.HisReoFec, T3.TipDefDsc, T1.TipDefCod, T1.MaqCod, T1.EmprCod, T1.HisTipArt, T1.HisEstReo, T1.CliCod, T2.MaqDsc, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod FROM ((TXPHISREO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPTIPDEF T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDefCod = T1.TipDefCod) WHERE (T1.EmprCod = ? and T1.MaqCod >= ? and T1.TipDefCod >= ? and T1.HisReoFec >= ?) AND (T1.CliCod >= ?) AND (T1.CliCod <= ?) AND (T1.HisReoFec <= ?) AND (T1.TipDefCod <= ?) AND (T1.HisTipArt >= ?) AND (T1.HisTipArt <= ?) AND (T1.HisEstReo = ?) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.TipDefCod, T1.HisReoFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(12);
               ((String[]) buf[23])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((short[]) buf[26])[0] = rslt.getShort(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((byte[]) buf[28])[0] = rslt.getByte(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(20);
               ((int[]) buf[36])[0] = rslt.getInt(21);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 6);
               return;
      }
   }

}

