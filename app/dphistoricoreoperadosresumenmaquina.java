package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dphistoricoreoperadosresumenmaquina extends GXProcedure
{
   public dphistoricoreoperadosresumenmaquina( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dphistoricoreoperadosresumenmaquina.class ), "" );
   }

   public dphistoricoreoperadosresumenmaquina( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina> executeUdp( String aP0 ,
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
      dphistoricoreoperadosresumenmaquina.this.aP12 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina>()};
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
                        GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina>[] aP12 )
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
                             GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina>[] aP12 )
   {
      dphistoricoreoperadosresumenmaquina.this.AV9Emprcod = aP0;
      dphistoricoreoperadosresumenmaquina.this.AV7Cliente = aP1;
      dphistoricoreoperadosresumenmaquina.this.AV8Cliente_to = aP2;
      dphistoricoreoperadosresumenmaquina.this.AV11HisreoFec = aP3;
      dphistoricoreoperadosresumenmaquina.this.AV12HisreoFec_to = aP4;
      dphistoricoreoperadosresumenmaquina.this.AV19Tipdefcod = aP5;
      dphistoricoreoperadosresumenmaquina.this.AV20TipDefcod_to = aP6;
      dphistoricoreoperadosresumenmaquina.this.AV14Maqcod = aP7;
      dphistoricoreoperadosresumenmaquina.this.AV15MaqCod_to = aP8;
      dphistoricoreoperadosresumenmaquina.this.AV17TipArtcod = aP9;
      dphistoricoreoperadosresumenmaquina.this.AV18TipArtcod_to = aP10;
      dphistoricoreoperadosresumenmaquina.this.AV10Hisestreo = aP11;
      dphistoricoreoperadosresumenmaquina.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001R2 */
      pr_default.execute(0, new Object[] {AV9Emprcod, AV14Maqcod, Short.valueOf(AV17TipArtcod), Integer.valueOf(AV7Cliente), Integer.valueOf(AV8Cliente_to), AV11HisreoFec, AV12HisreoFec_to, Short.valueOf(AV19Tipdefcod), Short.valueOf(AV20TipDefcod_to), Short.valueOf(AV18TipArtcod_to), Byte.valueOf(AV10Hisestreo), AV15MaqCod_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1R2 = false ;
         A540HisBarKgm = P001R2_A540HisBarKgm[0] ;
         n540HisBarKgm = P001R2_n540HisBarKgm[0] ;
         A541HisBarMtr = P001R2_A541HisBarMtr[0] ;
         n541HisBarMtr = P001R2_n541HisBarMtr[0] ;
         A548HisEstReo = P001R2_A548HisEstReo[0] ;
         n548HisEstReo = P001R2_n548HisEstReo[0] ;
         A13844HisTipColD = P001R2_A13844HisTipColD[0] ;
         n13844HisTipColD = P001R2_n13844HisTipColD[0] ;
         A572HisTipCol = P001R2_A572HisTipCol[0] ;
         n572HisTipCol = P001R2_n572HisTipCol[0] ;
         A13843HisTipArtD = P001R2_A13843HisTipArtD[0] ;
         n13843HisTipArtD = P001R2_n13843HisTipArtD[0] ;
         A571HisTipArt = P001R2_A571HisTipArt[0] ;
         n571HisTipArt = P001R2_n571HisTipArt[0] ;
         A602MaqCod = P001R2_A602MaqCod[0] ;
         n602MaqCod = P001R2_n602MaqCod[0] ;
         A396EmprCod = P001R2_A396EmprCod[0] ;
         A833TipDefCod = P001R2_A833TipDefCod[0] ;
         A569HisReoFec = P001R2_A569HisReoFec[0] ;
         n569HisReoFec = P001R2_n569HisReoFec[0] ;
         A252CliCod = P001R2_A252CliCod[0] ;
         n252CliCod = P001R2_n252CliCod[0] ;
         A606MaqDsc = P001R2_A606MaqDsc[0] ;
         n606MaqDsc = P001R2_n606MaqDsc[0] ;
         A539HisBarCod = P001R2_A539HisBarCod[0] ;
         A545HisCodReo = P001R2_A545HisCodReo[0] ;
         A544HisCodPar = P001R2_A544HisCodPar[0] ;
         A606MaqDsc = P001R2_A606MaqDsc[0] ;
         n606MaqDsc = P001R2_n606MaqDsc[0] ;
         A13843HisTipArtD = P001R2_A13843HisTipArtD[0] ;
         n13843HisTipArtD = P001R2_n13843HisTipArtD[0] ;
         A13844HisTipColD = P001R2_A13844HisTipColD[0] ;
         n13844HisTipColD = P001R2_n13844HisTipColD[0] ;
         Gxm1sdthistoricoreoperadosresumenmaquina = (app.SdtSDTHistoricoReoperadosResumenMaquina)new app.SdtSDTHistoricoReoperadosResumenMaquina(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdthistoricoreoperadosresumenmaquina, 0);
         Gxm1sdthistoricoreoperadosresumenmaquina.setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqcod( A602MaqCod );
         Gxm1sdthistoricoreoperadosresumenmaquina.setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqdsc( A606MaqDsc );
         AV47KilosMaquina = DecimalUtil.ZERO ;
         AV48MetrosMaquina = DecimalUtil.ZERO ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001R2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P001R2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk1R2 = false ;
            A540HisBarKgm = P001R2_A540HisBarKgm[0] ;
            n540HisBarKgm = P001R2_n540HisBarKgm[0] ;
            A541HisBarMtr = P001R2_A541HisBarMtr[0] ;
            n541HisBarMtr = P001R2_n541HisBarMtr[0] ;
            A548HisEstReo = P001R2_A548HisEstReo[0] ;
            n548HisEstReo = P001R2_n548HisEstReo[0] ;
            A13844HisTipColD = P001R2_A13844HisTipColD[0] ;
            n13844HisTipColD = P001R2_n13844HisTipColD[0] ;
            A572HisTipCol = P001R2_A572HisTipCol[0] ;
            n572HisTipCol = P001R2_n572HisTipCol[0] ;
            A13843HisTipArtD = P001R2_A13843HisTipArtD[0] ;
            n13843HisTipArtD = P001R2_n13843HisTipArtD[0] ;
            A571HisTipArt = P001R2_A571HisTipArt[0] ;
            n571HisTipArt = P001R2_n571HisTipArt[0] ;
            A833TipDefCod = P001R2_A833TipDefCod[0] ;
            A539HisBarCod = P001R2_A539HisBarCod[0] ;
            A545HisCodReo = P001R2_A545HisCodReo[0] ;
            A544HisCodPar = P001R2_A544HisCodPar[0] ;
            A13843HisTipArtD = P001R2_A13843HisTipArtD[0] ;
            n13843HisTipArtD = P001R2_n13843HisTipArtD[0] ;
            A13844HisTipColD = P001R2_A13844HisTipColD[0] ;
            n13844HisTipColD = P001R2_n13844HisTipColD[0] ;
            Gxm3sdthistoricoreoperadosresumenmaquina_tipoarticulo = (app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem)new app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem(remoteHandle, context);
            Gxm1sdthistoricoreoperadosresumenmaquina.getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo().add(Gxm3sdthistoricoreoperadosresumenmaquina_tipoarticulo, 0);
            Gxm3sdthistoricoreoperadosresumenmaquina_tipoarticulo.setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartcod( A571HisTipArt );
            Gxm3sdthistoricoreoperadosresumenmaquina_tipoarticulo.setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartdsc( A13843HisTipArtD );
            AV45TipArtKilos = DecimalUtil.ZERO ;
            AV46TipArtMetros = DecimalUtil.ZERO ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001R2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P001R2_A602MaqCod[0], A602MaqCod) == 0 ) && ( P001R2_A571HisTipArt[0] == A571HisTipArt ) )
            {
               brk1R2 = false ;
               A540HisBarKgm = P001R2_A540HisBarKgm[0] ;
               n540HisBarKgm = P001R2_n540HisBarKgm[0] ;
               A541HisBarMtr = P001R2_A541HisBarMtr[0] ;
               n541HisBarMtr = P001R2_n541HisBarMtr[0] ;
               A548HisEstReo = P001R2_A548HisEstReo[0] ;
               n548HisEstReo = P001R2_n548HisEstReo[0] ;
               A13844HisTipColD = P001R2_A13844HisTipColD[0] ;
               n13844HisTipColD = P001R2_n13844HisTipColD[0] ;
               A572HisTipCol = P001R2_A572HisTipCol[0] ;
               n572HisTipCol = P001R2_n572HisTipCol[0] ;
               A833TipDefCod = P001R2_A833TipDefCod[0] ;
               A539HisBarCod = P001R2_A539HisBarCod[0] ;
               A545HisCodReo = P001R2_A545HisCodReo[0] ;
               A544HisCodPar = P001R2_A544HisCodPar[0] ;
               A13844HisTipColD = P001R2_A13844HisTipColD[0] ;
               n13844HisTipColD = P001R2_n13844HisTipColD[0] ;
               Gxm4sdthistoricoreoperadosresumenmaquina_tipoarticulo_tipocolorante = (app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem)new app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem(remoteHandle, context);
               Gxm3sdthistoricoreoperadosresumenmaquina_tipoarticulo.getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante().add(Gxm4sdthistoricoreoperadosresumenmaquina_tipoarticulo_tipocolorante, 0);
               Gxm4sdthistoricoreoperadosresumenmaquina_tipoarticulo_tipocolorante.setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcolcod( A572HisTipCol );
               Gxm4sdthistoricoreoperadosresumenmaquina_tipoarticulo_tipocolorante.setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcoldsc( A13844HisTipColD );
               AV5Kilos = DecimalUtil.ZERO ;
               AV6Metros = DecimalUtil.ZERO ;
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001R2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P001R2_A602MaqCod[0], A602MaqCod) == 0 ) && ( P001R2_A571HisTipArt[0] == A571HisTipArt ) && ( P001R2_A572HisTipCol[0] == A572HisTipCol ) )
               {
                  brk1R2 = false ;
                  A540HisBarKgm = P001R2_A540HisBarKgm[0] ;
                  n540HisBarKgm = P001R2_n540HisBarKgm[0] ;
                  A541HisBarMtr = P001R2_A541HisBarMtr[0] ;
                  n541HisBarMtr = P001R2_n541HisBarMtr[0] ;
                  A548HisEstReo = P001R2_A548HisEstReo[0] ;
                  n548HisEstReo = P001R2_n548HisEstReo[0] ;
                  A833TipDefCod = P001R2_A833TipDefCod[0] ;
                  A539HisBarCod = P001R2_A539HisBarCod[0] ;
                  A545HisCodReo = P001R2_A545HisCodReo[0] ;
                  A544HisCodPar = P001R2_A544HisCodPar[0] ;
                  AV5Kilos = AV5Kilos.add(A540HisBarKgm) ;
                  AV6Metros = AV6Metros.add(A541HisBarMtr) ;
                  brk1R2 = true ;
                  pr_default.readNext(0);
               }
               Gxm4sdthistoricoreoperadosresumenmaquina_tipoarticulo_tipocolorante.setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Kilostipcolcod( AV5Kilos );
               Gxm4sdthistoricoreoperadosresumenmaquina_tipoarticulo_tipocolorante.setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Metrostipcolcod( AV6Metros );
               AV45TipArtKilos = AV45TipArtKilos.add(AV5Kilos) ;
               AV46TipArtMetros = AV46TipArtMetros.add(AV6Metros) ;
               AV47KilosMaquina = AV47KilosMaquina.add(AV5Kilos) ;
               AV48MetrosMaquina = AV48MetrosMaquina.add(AV6Metros) ;
               if ( ! brk1R2 )
               {
                  brk1R2 = true ;
                  pr_default.readNext(0);
               }
            }
            if ( ! brk1R2 )
            {
               brk1R2 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brk1R2 )
         {
            brk1R2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP12[0] = dphistoricoreoperadosresumenmaquina.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina>(app.SdtSDTHistoricoReoperadosResumenMaquina.class, "SDTHistoricoReoperadosResumenMaquina", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P001R2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001R2_n540HisBarKgm = new boolean[] {false} ;
      P001R2_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001R2_n541HisBarMtr = new boolean[] {false} ;
      P001R2_A548HisEstReo = new byte[1] ;
      P001R2_n548HisEstReo = new boolean[] {false} ;
      P001R2_A13844HisTipColD = new String[] {""} ;
      P001R2_n13844HisTipColD = new boolean[] {false} ;
      P001R2_A572HisTipCol = new byte[1] ;
      P001R2_n572HisTipCol = new boolean[] {false} ;
      P001R2_A13843HisTipArtD = new String[] {""} ;
      P001R2_n13843HisTipArtD = new boolean[] {false} ;
      P001R2_A571HisTipArt = new short[1] ;
      P001R2_n571HisTipArt = new boolean[] {false} ;
      P001R2_A602MaqCod = new String[] {""} ;
      P001R2_n602MaqCod = new boolean[] {false} ;
      P001R2_A396EmprCod = new String[] {""} ;
      P001R2_A833TipDefCod = new short[1] ;
      P001R2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P001R2_n569HisReoFec = new boolean[] {false} ;
      P001R2_A252CliCod = new int[1] ;
      P001R2_n252CliCod = new boolean[] {false} ;
      P001R2_A606MaqDsc = new String[] {""} ;
      P001R2_n606MaqDsc = new boolean[] {false} ;
      P001R2_A539HisBarCod = new int[1] ;
      P001R2_A545HisCodReo = new byte[1] ;
      P001R2_A544HisCodPar = new String[] {""} ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A13844HisTipColD = "" ;
      A13843HisTipArtD = "" ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A606MaqDsc = "" ;
      A544HisCodPar = "" ;
      Gxm1sdthistoricoreoperadosresumenmaquina = new app.SdtSDTHistoricoReoperadosResumenMaquina(remoteHandle, context);
      AV47KilosMaquina = DecimalUtil.ZERO ;
      AV48MetrosMaquina = DecimalUtil.ZERO ;
      Gxm3sdthistoricoreoperadosresumenmaquina_tipoarticulo = new app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem(remoteHandle, context);
      AV45TipArtKilos = DecimalUtil.ZERO ;
      AV46TipArtMetros = DecimalUtil.ZERO ;
      Gxm4sdthistoricoreoperadosresumenmaquina_tipoarticulo_tipocolorante = new app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem(remoteHandle, context);
      AV5Kilos = DecimalUtil.ZERO ;
      AV6Metros = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dphistoricoreoperadosresumenmaquina__default(),
         new Object[] {
             new Object[] {
            P001R2_A540HisBarKgm, P001R2_n540HisBarKgm, P001R2_A541HisBarMtr, P001R2_n541HisBarMtr, P001R2_A548HisEstReo, P001R2_n548HisEstReo, P001R2_A13844HisTipColD, P001R2_n13844HisTipColD, P001R2_A572HisTipCol, P001R2_n572HisTipCol,
            P001R2_A13843HisTipArtD, P001R2_n13843HisTipArtD, P001R2_A571HisTipArt, P001R2_n571HisTipArt, P001R2_A602MaqCod, P001R2_n602MaqCod, P001R2_A396EmprCod, P001R2_A833TipDefCod, P001R2_A569HisReoFec, P001R2_n569HisReoFec,
            P001R2_A252CliCod, P001R2_n252CliCod, P001R2_A606MaqDsc, P001R2_n606MaqDsc, P001R2_A539HisBarCod, P001R2_A545HisCodReo, P001R2_A544HisCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Hisestreo ;
   private byte A548HisEstReo ;
   private byte A572HisTipCol ;
   private byte A545HisCodReo ;
   private short AV19Tipdefcod ;
   private short AV20TipDefcod_to ;
   private short AV17TipArtcod ;
   private short AV18TipArtcod_to ;
   private short A571HisTipArt ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private int AV7Cliente ;
   private int AV8Cliente_to ;
   private int A252CliCod ;
   private int A539HisBarCod ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal AV47KilosMaquina ;
   private java.math.BigDecimal AV48MetrosMaquina ;
   private java.math.BigDecimal AV45TipArtKilos ;
   private java.math.BigDecimal AV46TipArtMetros ;
   private java.math.BigDecimal AV5Kilos ;
   private java.math.BigDecimal AV6Metros ;
   private String AV9Emprcod ;
   private String AV14Maqcod ;
   private String AV15MaqCod_to ;
   private String scmdbuf ;
   private String A13844HisTipColD ;
   private String A13843HisTipArtD ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A606MaqDsc ;
   private String A544HisCodPar ;
   private java.util.Date AV11HisreoFec ;
   private java.util.Date AV12HisreoFec_to ;
   private java.util.Date A569HisReoFec ;
   private boolean brk1R2 ;
   private boolean n540HisBarKgm ;
   private boolean n541HisBarMtr ;
   private boolean n548HisEstReo ;
   private boolean n13844HisTipColD ;
   private boolean n572HisTipCol ;
   private boolean n13843HisTipArtD ;
   private boolean n571HisTipArt ;
   private boolean n602MaqCod ;
   private boolean n569HisReoFec ;
   private boolean n252CliCod ;
   private boolean n606MaqDsc ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina>[] aP12 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P001R2_A540HisBarKgm ;
   private boolean[] P001R2_n540HisBarKgm ;
   private java.math.BigDecimal[] P001R2_A541HisBarMtr ;
   private boolean[] P001R2_n541HisBarMtr ;
   private byte[] P001R2_A548HisEstReo ;
   private boolean[] P001R2_n548HisEstReo ;
   private String[] P001R2_A13844HisTipColD ;
   private boolean[] P001R2_n13844HisTipColD ;
   private byte[] P001R2_A572HisTipCol ;
   private boolean[] P001R2_n572HisTipCol ;
   private String[] P001R2_A13843HisTipArtD ;
   private boolean[] P001R2_n13843HisTipArtD ;
   private short[] P001R2_A571HisTipArt ;
   private boolean[] P001R2_n571HisTipArt ;
   private String[] P001R2_A602MaqCod ;
   private boolean[] P001R2_n602MaqCod ;
   private String[] P001R2_A396EmprCod ;
   private short[] P001R2_A833TipDefCod ;
   private java.util.Date[] P001R2_A569HisReoFec ;
   private boolean[] P001R2_n569HisReoFec ;
   private int[] P001R2_A252CliCod ;
   private boolean[] P001R2_n252CliCod ;
   private String[] P001R2_A606MaqDsc ;
   private boolean[] P001R2_n606MaqDsc ;
   private int[] P001R2_A539HisBarCod ;
   private byte[] P001R2_A545HisCodReo ;
   private String[] P001R2_A544HisCodPar ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina> Gxm2rootcol ;
   private app.SdtSDTHistoricoReoperadosResumenMaquina Gxm1sdthistoricoreoperadosresumenmaquina ;
   private app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem Gxm3sdthistoricoreoperadosresumenmaquina_tipoarticulo ;
   private app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem Gxm4sdthistoricoreoperadosresumenmaquina_tipoarticulo_tipocolorante ;
}

final  class dphistoricoreoperadosresumenmaquina__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001R2", "SELECT T1.HisBarKgm, T1.HisBarMtr, T1.HisEstReo, T4.TipColDsc AS HisTipColD, T1.HisTipCol AS HisTipCol, T3.TipArtDsc AS HisTipArtD, T1.HisTipArt AS HisTipArt, T1.MaqCod, T1.EmprCod, T1.TipDefCod, T1.HisReoFec, T1.CliCod, T2.MaqDsc, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar FROM (((TXPHISREO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.HisTipArt) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.HisTipCol) WHERE (T1.EmprCod = ? and T1.MaqCod >= ? and T1.HisTipArt >= ?) AND (T1.CliCod >= ?) AND (T1.CliCod <= ?) AND (T1.HisReoFec >= ?) AND (T1.HisReoFec <= ?) AND (T1.TipDefCod >= ?) AND (T1.TipDefCod <= ?) AND (T1.HisTipArt <= ?) AND (T1.HisEstReo = ?) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisTipArt, T1.HisTipCol, T1.HisEstReo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 3);
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((byte[]) buf[25])[0] = rslt.getByte(15);
               ((String[]) buf[26])[0] = rslt.getString(16, 1);
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
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
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

