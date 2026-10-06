package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dphistoricoreoperadosresumentipodefecto extends GXProcedure
{
   public dphistoricoreoperadosresumentipodefecto( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dphistoricoreoperadosresumentipodefecto.class ), "" );
   }

   public dphistoricoreoperadosresumentipodefecto( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto> executeUdp( String aP0 ,
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
      dphistoricoreoperadosresumentipodefecto.this.aP12 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto>()};
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
                        GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto>[] aP12 )
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
                             GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto>[] aP12 )
   {
      dphistoricoreoperadosresumentipodefecto.this.AV7Emprcod = aP0;
      dphistoricoreoperadosresumentipodefecto.this.AV5Cliente = aP1;
      dphistoricoreoperadosresumentipodefecto.this.AV6Cliente_to = aP2;
      dphistoricoreoperadosresumentipodefecto.this.AV9HisreoFec = aP3;
      dphistoricoreoperadosresumentipodefecto.this.AV10HisreoFec_to = aP4;
      dphistoricoreoperadosresumentipodefecto.this.AV15Tipdefcod = aP5;
      dphistoricoreoperadosresumentipodefecto.this.AV16TipDefcod_to = aP6;
      dphistoricoreoperadosresumentipodefecto.this.AV11Maqcod = aP7;
      dphistoricoreoperadosresumentipodefecto.this.AV12MaqCod_to = aP8;
      dphistoricoreoperadosresumentipodefecto.this.AV13TipArtcod = aP9;
      dphistoricoreoperadosresumentipodefecto.this.AV14TipArtcod_to = aP10;
      dphistoricoreoperadosresumentipodefecto.this.AV8Hisestreo = aP11;
      dphistoricoreoperadosresumentipodefecto.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001S2 */
      pr_default.execute(0, new Object[] {AV7Emprcod, Short.valueOf(AV15Tipdefcod), AV11Maqcod, Short.valueOf(AV13TipArtcod), Integer.valueOf(AV5Cliente), Integer.valueOf(AV6Cliente_to), AV9HisreoFec, AV10HisreoFec_to, AV12MaqCod_to, Short.valueOf(AV14TipArtcod_to), Byte.valueOf(AV8Hisestreo), Short.valueOf(AV16TipDefcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1S2 = false ;
         A540HisBarKgm = P001S2_A540HisBarKgm[0] ;
         n540HisBarKgm = P001S2_n540HisBarKgm[0] ;
         A541HisBarMtr = P001S2_A541HisBarMtr[0] ;
         n541HisBarMtr = P001S2_n541HisBarMtr[0] ;
         A548HisEstReo = P001S2_A548HisEstReo[0] ;
         n548HisEstReo = P001S2_n548HisEstReo[0] ;
         A13844HisTipColD = P001S2_A13844HisTipColD[0] ;
         n13844HisTipColD = P001S2_n13844HisTipColD[0] ;
         A572HisTipCol = P001S2_A572HisTipCol[0] ;
         n572HisTipCol = P001S2_n572HisTipCol[0] ;
         A13843HisTipArtD = P001S2_A13843HisTipArtD[0] ;
         n13843HisTipArtD = P001S2_n13843HisTipArtD[0] ;
         A571HisTipArt = P001S2_A571HisTipArt[0] ;
         n571HisTipArt = P001S2_n571HisTipArt[0] ;
         A606MaqDsc = P001S2_A606MaqDsc[0] ;
         n606MaqDsc = P001S2_n606MaqDsc[0] ;
         A602MaqCod = P001S2_A602MaqCod[0] ;
         n602MaqCod = P001S2_n602MaqCod[0] ;
         A833TipDefCod = P001S2_A833TipDefCod[0] ;
         A396EmprCod = P001S2_A396EmprCod[0] ;
         A569HisReoFec = P001S2_A569HisReoFec[0] ;
         n569HisReoFec = P001S2_n569HisReoFec[0] ;
         A252CliCod = P001S2_A252CliCod[0] ;
         n252CliCod = P001S2_n252CliCod[0] ;
         A834TipDefDsc = P001S2_A834TipDefDsc[0] ;
         n834TipDefDsc = P001S2_n834TipDefDsc[0] ;
         A539HisBarCod = P001S2_A539HisBarCod[0] ;
         A545HisCodReo = P001S2_A545HisCodReo[0] ;
         A544HisCodPar = P001S2_A544HisCodPar[0] ;
         A606MaqDsc = P001S2_A606MaqDsc[0] ;
         n606MaqDsc = P001S2_n606MaqDsc[0] ;
         A13843HisTipArtD = P001S2_A13843HisTipArtD[0] ;
         n13843HisTipArtD = P001S2_n13843HisTipArtD[0] ;
         A13844HisTipColD = P001S2_A13844HisTipColD[0] ;
         n13844HisTipColD = P001S2_n13844HisTipColD[0] ;
         A834TipDefDsc = P001S2_A834TipDefDsc[0] ;
         n834TipDefDsc = P001S2_n834TipDefDsc[0] ;
         Gxm1sdthistoricoreoperadosresumentipodefecto = (app.SdtSDTHistoricoReoperadosResumenTipoDefecto)new app.SdtSDTHistoricoReoperadosResumenTipoDefecto(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdthistoricoreoperadosresumentipodefecto, 0);
         Gxm1sdthistoricoreoperadosresumentipodefecto.setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefcod( A833TipDefCod );
         Gxm1sdthistoricoreoperadosresumentipodefecto.setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefdsc( A834TipDefDsc );
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001S2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P001S2_A833TipDefCod[0] == A833TipDefCod ) )
         {
            brk1S2 = false ;
            A540HisBarKgm = P001S2_A540HisBarKgm[0] ;
            n540HisBarKgm = P001S2_n540HisBarKgm[0] ;
            A541HisBarMtr = P001S2_A541HisBarMtr[0] ;
            n541HisBarMtr = P001S2_n541HisBarMtr[0] ;
            A548HisEstReo = P001S2_A548HisEstReo[0] ;
            n548HisEstReo = P001S2_n548HisEstReo[0] ;
            A13844HisTipColD = P001S2_A13844HisTipColD[0] ;
            n13844HisTipColD = P001S2_n13844HisTipColD[0] ;
            A572HisTipCol = P001S2_A572HisTipCol[0] ;
            n572HisTipCol = P001S2_n572HisTipCol[0] ;
            A13843HisTipArtD = P001S2_A13843HisTipArtD[0] ;
            n13843HisTipArtD = P001S2_n13843HisTipArtD[0] ;
            A571HisTipArt = P001S2_A571HisTipArt[0] ;
            n571HisTipArt = P001S2_n571HisTipArt[0] ;
            A606MaqDsc = P001S2_A606MaqDsc[0] ;
            n606MaqDsc = P001S2_n606MaqDsc[0] ;
            A602MaqCod = P001S2_A602MaqCod[0] ;
            n602MaqCod = P001S2_n602MaqCod[0] ;
            A539HisBarCod = P001S2_A539HisBarCod[0] ;
            A545HisCodReo = P001S2_A545HisCodReo[0] ;
            A544HisCodPar = P001S2_A544HisCodPar[0] ;
            A606MaqDsc = P001S2_A606MaqDsc[0] ;
            n606MaqDsc = P001S2_n606MaqDsc[0] ;
            A13843HisTipArtD = P001S2_A13843HisTipArtD[0] ;
            n13843HisTipArtD = P001S2_n13843HisTipArtD[0] ;
            A13844HisTipColD = P001S2_A13844HisTipColD[0] ;
            n13844HisTipColD = P001S2_n13844HisTipColD[0] ;
            Gxm3sdthistoricoreoperadosresumentipodefecto_maquinas = (app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina)new app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina(remoteHandle, context);
            Gxm1sdthistoricoreoperadosresumentipodefecto.getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas().add(Gxm3sdthistoricoreoperadosresumentipodefecto_maquinas, 0);
            Gxm3sdthistoricoreoperadosresumentipodefecto_maquinas.setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqcod( A602MaqCod );
            Gxm3sdthistoricoreoperadosresumentipodefecto_maquinas.setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqdsc( A606MaqDsc );
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001S2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P001S2_A833TipDefCod[0] == A833TipDefCod ) && ( GXutil.strcmp(P001S2_A602MaqCod[0], A602MaqCod) == 0 ) )
            {
               brk1S2 = false ;
               A540HisBarKgm = P001S2_A540HisBarKgm[0] ;
               n540HisBarKgm = P001S2_n540HisBarKgm[0] ;
               A541HisBarMtr = P001S2_A541HisBarMtr[0] ;
               n541HisBarMtr = P001S2_n541HisBarMtr[0] ;
               A548HisEstReo = P001S2_A548HisEstReo[0] ;
               n548HisEstReo = P001S2_n548HisEstReo[0] ;
               A13844HisTipColD = P001S2_A13844HisTipColD[0] ;
               n13844HisTipColD = P001S2_n13844HisTipColD[0] ;
               A572HisTipCol = P001S2_A572HisTipCol[0] ;
               n572HisTipCol = P001S2_n572HisTipCol[0] ;
               A13843HisTipArtD = P001S2_A13843HisTipArtD[0] ;
               n13843HisTipArtD = P001S2_n13843HisTipArtD[0] ;
               A571HisTipArt = P001S2_A571HisTipArt[0] ;
               n571HisTipArt = P001S2_n571HisTipArt[0] ;
               A539HisBarCod = P001S2_A539HisBarCod[0] ;
               A545HisCodReo = P001S2_A545HisCodReo[0] ;
               A544HisCodPar = P001S2_A544HisCodPar[0] ;
               A13843HisTipArtD = P001S2_A13843HisTipArtD[0] ;
               n13843HisTipArtD = P001S2_n13843HisTipArtD[0] ;
               A13844HisTipColD = P001S2_A13844HisTipColD[0] ;
               n13844HisTipColD = P001S2_n13844HisTipColD[0] ;
               Gxm4sdthistoricoreoperadosresumentipodefecto_maquinas_tiposarticulos = (app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo)new app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo(remoteHandle, context);
               Gxm3sdthistoricoreoperadosresumentipodefecto_maquinas.getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos().add(Gxm4sdthistoricoreoperadosresumentipodefecto_maquinas_tiposarticulos, 0);
               Gxm4sdthistoricoreoperadosresumentipodefecto_maquinas_tiposarticulos.setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipart( A571HisTipArt );
               Gxm4sdthistoricoreoperadosresumentipodefecto_maquinas_tiposarticulos.setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipartdsc( A13843HisTipArtD );
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001S2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P001S2_A833TipDefCod[0] == A833TipDefCod ) && ( GXutil.strcmp(P001S2_A602MaqCod[0], A602MaqCod) == 0 ) && ( P001S2_A571HisTipArt[0] == A571HisTipArt ) )
               {
                  brk1S2 = false ;
                  A540HisBarKgm = P001S2_A540HisBarKgm[0] ;
                  n540HisBarKgm = P001S2_n540HisBarKgm[0] ;
                  A541HisBarMtr = P001S2_A541HisBarMtr[0] ;
                  n541HisBarMtr = P001S2_n541HisBarMtr[0] ;
                  A548HisEstReo = P001S2_A548HisEstReo[0] ;
                  n548HisEstReo = P001S2_n548HisEstReo[0] ;
                  A13844HisTipColD = P001S2_A13844HisTipColD[0] ;
                  n13844HisTipColD = P001S2_n13844HisTipColD[0] ;
                  A572HisTipCol = P001S2_A572HisTipCol[0] ;
                  n572HisTipCol = P001S2_n572HisTipCol[0] ;
                  A539HisBarCod = P001S2_A539HisBarCod[0] ;
                  A545HisCodReo = P001S2_A545HisCodReo[0] ;
                  A544HisCodPar = P001S2_A544HisCodPar[0] ;
                  A13844HisTipColD = P001S2_A13844HisTipColD[0] ;
                  n13844HisTipColD = P001S2_n13844HisTipColD[0] ;
                  Gxm5sdthistoricoreoperadosresumentipodefecto_maquinas_tiposarticulos_tiposcolorantes = (app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante)new app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante(remoteHandle, context);
                  Gxm4sdthistoricoreoperadosresumentipodefecto_maquinas_tiposarticulos.getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes().add(Gxm5sdthistoricoreoperadosresumentipodefecto_maquinas_tiposarticulos_tiposcolorantes, 0);
                  Gxm5sdthistoricoreoperadosresumentipodefecto_maquinas_tiposarticulos_tiposcolorantes.setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Histipcol( A572HisTipCol );
                  Gxm5sdthistoricoreoperadosresumentipodefecto_maquinas_tiposarticulos_tiposcolorantes.setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Histipcoldsc( A13844HisTipColD );
                  AV17Kilos = DecimalUtil.ZERO ;
                  AV18Metros = DecimalUtil.ZERO ;
                  while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001S2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P001S2_A833TipDefCod[0] == A833TipDefCod ) && ( GXutil.strcmp(P001S2_A602MaqCod[0], A602MaqCod) == 0 ) && ( P001S2_A571HisTipArt[0] == A571HisTipArt ) )
                  {
                     if ( ! ( ( P001S2_A572HisTipCol[0] == A572HisTipCol ) ) )
                     {
                        if (true) break;
                     }
                     brk1S2 = false ;
                     A540HisBarKgm = P001S2_A540HisBarKgm[0] ;
                     n540HisBarKgm = P001S2_n540HisBarKgm[0] ;
                     A541HisBarMtr = P001S2_A541HisBarMtr[0] ;
                     n541HisBarMtr = P001S2_n541HisBarMtr[0] ;
                     A548HisEstReo = P001S2_A548HisEstReo[0] ;
                     n548HisEstReo = P001S2_n548HisEstReo[0] ;
                     A539HisBarCod = P001S2_A539HisBarCod[0] ;
                     A545HisCodReo = P001S2_A545HisCodReo[0] ;
                     A544HisCodPar = P001S2_A544HisCodPar[0] ;
                     AV17Kilos = AV17Kilos.add(A540HisBarKgm) ;
                     AV18Metros = AV18Metros.add(A541HisBarMtr) ;
                     brk1S2 = true ;
                     pr_default.readNext(0);
                  }
                  Gxm5sdthistoricoreoperadosresumentipodefecto_maquinas_tiposarticulos_tiposcolorantes.setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Kilos( AV17Kilos );
                  Gxm5sdthistoricoreoperadosresumentipodefecto_maquinas_tiposarticulos_tiposcolorantes.setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Metros( AV18Metros );
                  if ( ! brk1S2 )
                  {
                     brk1S2 = true ;
                     pr_default.readNext(0);
                  }
               }
               if ( ! brk1S2 )
               {
                  brk1S2 = true ;
                  pr_default.readNext(0);
               }
            }
            if ( ! brk1S2 )
            {
               brk1S2 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brk1S2 )
         {
            brk1S2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP12[0] = dphistoricoreoperadosresumentipodefecto.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto>(app.SdtSDTHistoricoReoperadosResumenTipoDefecto.class, "SDTHistoricoReoperadosResumenTipoDefecto", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P001S2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001S2_n540HisBarKgm = new boolean[] {false} ;
      P001S2_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001S2_n541HisBarMtr = new boolean[] {false} ;
      P001S2_A548HisEstReo = new byte[1] ;
      P001S2_n548HisEstReo = new boolean[] {false} ;
      P001S2_A13844HisTipColD = new String[] {""} ;
      P001S2_n13844HisTipColD = new boolean[] {false} ;
      P001S2_A572HisTipCol = new byte[1] ;
      P001S2_n572HisTipCol = new boolean[] {false} ;
      P001S2_A13843HisTipArtD = new String[] {""} ;
      P001S2_n13843HisTipArtD = new boolean[] {false} ;
      P001S2_A571HisTipArt = new short[1] ;
      P001S2_n571HisTipArt = new boolean[] {false} ;
      P001S2_A606MaqDsc = new String[] {""} ;
      P001S2_n606MaqDsc = new boolean[] {false} ;
      P001S2_A602MaqCod = new String[] {""} ;
      P001S2_n602MaqCod = new boolean[] {false} ;
      P001S2_A833TipDefCod = new short[1] ;
      P001S2_A396EmprCod = new String[] {""} ;
      P001S2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P001S2_n569HisReoFec = new boolean[] {false} ;
      P001S2_A252CliCod = new int[1] ;
      P001S2_n252CliCod = new boolean[] {false} ;
      P001S2_A834TipDefDsc = new String[] {""} ;
      P001S2_n834TipDefDsc = new boolean[] {false} ;
      P001S2_A539HisBarCod = new int[1] ;
      P001S2_A545HisCodReo = new byte[1] ;
      P001S2_A544HisCodPar = new String[] {""} ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A13844HisTipColD = "" ;
      A13843HisTipArtD = "" ;
      A606MaqDsc = "" ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A834TipDefDsc = "" ;
      A544HisCodPar = "" ;
      Gxm1sdthistoricoreoperadosresumentipodefecto = new app.SdtSDTHistoricoReoperadosResumenTipoDefecto(remoteHandle, context);
      Gxm3sdthistoricoreoperadosresumentipodefecto_maquinas = new app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina(remoteHandle, context);
      Gxm4sdthistoricoreoperadosresumentipodefecto_maquinas_tiposarticulos = new app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo(remoteHandle, context);
      Gxm5sdthistoricoreoperadosresumentipodefecto_maquinas_tiposarticulos_tiposcolorantes = new app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante(remoteHandle, context);
      AV17Kilos = DecimalUtil.ZERO ;
      AV18Metros = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dphistoricoreoperadosresumentipodefecto__default(),
         new Object[] {
             new Object[] {
            P001S2_A540HisBarKgm, P001S2_n540HisBarKgm, P001S2_A541HisBarMtr, P001S2_n541HisBarMtr, P001S2_A548HisEstReo, P001S2_n548HisEstReo, P001S2_A13844HisTipColD, P001S2_n13844HisTipColD, P001S2_A572HisTipCol, P001S2_n572HisTipCol,
            P001S2_A13843HisTipArtD, P001S2_n13843HisTipArtD, P001S2_A571HisTipArt, P001S2_n571HisTipArt, P001S2_A606MaqDsc, P001S2_n606MaqDsc, P001S2_A602MaqCod, P001S2_n602MaqCod, P001S2_A833TipDefCod, P001S2_A396EmprCod,
            P001S2_A569HisReoFec, P001S2_n569HisReoFec, P001S2_A252CliCod, P001S2_n252CliCod, P001S2_A834TipDefDsc, P001S2_n834TipDefDsc, P001S2_A539HisBarCod, P001S2_A545HisCodReo, P001S2_A544HisCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Hisestreo ;
   private byte A548HisEstReo ;
   private byte A572HisTipCol ;
   private byte A545HisCodReo ;
   private short AV15Tipdefcod ;
   private short AV16TipDefcod_to ;
   private short AV13TipArtcod ;
   private short AV14TipArtcod_to ;
   private short A571HisTipArt ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private int AV5Cliente ;
   private int AV6Cliente_to ;
   private int A252CliCod ;
   private int A539HisBarCod ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal AV17Kilos ;
   private java.math.BigDecimal AV18Metros ;
   private String AV7Emprcod ;
   private String AV11Maqcod ;
   private String AV12MaqCod_to ;
   private String scmdbuf ;
   private String A13844HisTipColD ;
   private String A13843HisTipArtD ;
   private String A606MaqDsc ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A834TipDefDsc ;
   private String A544HisCodPar ;
   private java.util.Date AV9HisreoFec ;
   private java.util.Date AV10HisreoFec_to ;
   private java.util.Date A569HisReoFec ;
   private boolean brk1S2 ;
   private boolean n540HisBarKgm ;
   private boolean n541HisBarMtr ;
   private boolean n548HisEstReo ;
   private boolean n13844HisTipColD ;
   private boolean n572HisTipCol ;
   private boolean n13843HisTipArtD ;
   private boolean n571HisTipArt ;
   private boolean n606MaqDsc ;
   private boolean n602MaqCod ;
   private boolean n569HisReoFec ;
   private boolean n252CliCod ;
   private boolean n834TipDefDsc ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto>[] aP12 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P001S2_A540HisBarKgm ;
   private boolean[] P001S2_n540HisBarKgm ;
   private java.math.BigDecimal[] P001S2_A541HisBarMtr ;
   private boolean[] P001S2_n541HisBarMtr ;
   private byte[] P001S2_A548HisEstReo ;
   private boolean[] P001S2_n548HisEstReo ;
   private String[] P001S2_A13844HisTipColD ;
   private boolean[] P001S2_n13844HisTipColD ;
   private byte[] P001S2_A572HisTipCol ;
   private boolean[] P001S2_n572HisTipCol ;
   private String[] P001S2_A13843HisTipArtD ;
   private boolean[] P001S2_n13843HisTipArtD ;
   private short[] P001S2_A571HisTipArt ;
   private boolean[] P001S2_n571HisTipArt ;
   private String[] P001S2_A606MaqDsc ;
   private boolean[] P001S2_n606MaqDsc ;
   private String[] P001S2_A602MaqCod ;
   private boolean[] P001S2_n602MaqCod ;
   private short[] P001S2_A833TipDefCod ;
   private String[] P001S2_A396EmprCod ;
   private java.util.Date[] P001S2_A569HisReoFec ;
   private boolean[] P001S2_n569HisReoFec ;
   private int[] P001S2_A252CliCod ;
   private boolean[] P001S2_n252CliCod ;
   private String[] P001S2_A834TipDefDsc ;
   private boolean[] P001S2_n834TipDefDsc ;
   private int[] P001S2_A539HisBarCod ;
   private byte[] P001S2_A545HisCodReo ;
   private String[] P001S2_A544HisCodPar ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto> Gxm2rootcol ;
   private app.SdtSDTHistoricoReoperadosResumenTipoDefecto Gxm1sdthistoricoreoperadosresumentipodefecto ;
   private app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina Gxm3sdthistoricoreoperadosresumentipodefecto_maquinas ;
   private app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo Gxm4sdthistoricoreoperadosresumentipodefecto_maquinas_tiposarticulos ;
   private app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante Gxm5sdthistoricoreoperadosresumentipodefecto_maquinas_tiposarticulos_tiposcolorantes ;
}

final  class dphistoricoreoperadosresumentipodefecto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001S2", "SELECT T1.HisBarKgm, T1.HisBarMtr, T1.HisEstReo, T4.TipColDsc AS HisTipColD, T1.HisTipCol AS HisTipCol, T3.TipArtDsc AS HisTipArtD, T1.HisTipArt AS HisTipArt, T2.MaqDsc, T1.MaqCod, T1.TipDefCod, T1.EmprCod, T1.HisReoFec, T1.CliCod, T5.TipDefDsc, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar FROM ((((TXPHISREO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.HisTipArt) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.HisTipCol) INNER JOIN TXPTIPDEF T5 ON T5.EmprCod = T1.EmprCod AND T5.TipDefCod = T1.TipDefCod) WHERE (T1.EmprCod = ? and T1.TipDefCod >= ? and T1.MaqCod >= ? and T1.HisTipArt >= ?) AND (T1.CliCod >= ?) AND (T1.CliCod <= ?) AND (T1.HisReoFec >= ?) AND (T1.HisReoFec <= ?) AND (T1.MaqCod <= ?) AND (T1.HisTipArt <= ?) AND (T1.HisEstReo = ?) AND (T1.TipDefCod <= ?) ORDER BY T1.EmprCod, T1.TipDefCod, T1.MaqCod, T1.HisTipArt, T1.HisTipCol, T1.HisEstReo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(10);
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((byte[]) buf[27])[0] = rslt.getByte(16);
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
      }
   }

}

