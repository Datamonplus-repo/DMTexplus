package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_recepcion_mto_prc extends GXProcedure
{
   public trabajoexterno_recepcion_mto_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_recepcion_mto_prc.class ), "" );
   }

   public trabajoexterno_recepcion_mto_prc( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             short aP1 ,
                             java.util.Date aP2 )
   {
      trabajoexterno_recepcion_mto_prc.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        java.util.Date aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             java.util.Date aP2 ,
                             String[] aP3 )
   {
      trabajoexterno_recepcion_mto_prc.this.AV8EmprCod = aP0;
      trabajoexterno_recepcion_mto_prc.this.AV9Mancod = aP1;
      trabajoexterno_recepcion_mto_prc.this.AV22RpExHdFe = aP2;
      trabajoexterno_recepcion_mto_prc.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20TrabajoExterno_Recepcion_Mto_SDT.clear();
      AV21TrabajoExterno_Recepcion_Mto_SDT_json = "" ;
      /* Using cursor P0ACV2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Short.valueOf(AV9Mancod), AV22RpExHdFe});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2711RpExHdFe = P0ACV2_A2711RpExHdFe[0] ;
         A2248ManCod = P0ACV2_A2248ManCod[0] ;
         A396EmprCod = P0ACV2_A396EmprCod[0] ;
         A2714RpExHdAlb = P0ACV2_A2714RpExHdAlb[0] ;
         n2714RpExHdAlb = P0ACV2_n2714RpExHdAlb[0] ;
         A129BarCod = P0ACV2_A129BarCod[0] ;
         A132BarCodReo = P0ACV2_A132BarCodReo[0] ;
         A130BarCodPar = P0ACV2_A130BarCodPar[0] ;
         A6262RpExSalLn = P0ACV2_A6262RpExSalLn[0] ;
         n6262RpExSalLn = P0ACV2_n6262RpExSalLn[0] ;
         A212BarSer = P0ACV2_A212BarSer[0] ;
         A1652BarSerDsc = P0ACV2_A1652BarSerDsc[0] ;
         A228BarUniMed = P0ACV2_A228BarUniMed[0] ;
         A252CliCod = P0ACV2_A252CliCod[0] ;
         n252CliCod = P0ACV2_n252CliCod[0] ;
         A279CliNom = P0ACV2_A279CliNom[0] ;
         A2716RpExHdCns = P0ACV2_A2716RpExHdCns[0] ;
         n2716RpExHdCns = P0ACV2_n2716RpExHdCns[0] ;
         A2715RpExHdKgs = P0ACV2_A2715RpExHdKgs[0] ;
         n2715RpExHdKgs = P0ACV2_n2715RpExHdKgs[0] ;
         A2847RpExHdMts = P0ACV2_A2847RpExHdMts[0] ;
         n2847RpExHdMts = P0ACV2_n2847RpExHdMts[0] ;
         A2717RpExHdTip = P0ACV2_A2717RpExHdTip[0] ;
         n2717RpExHdTip = P0ACV2_n2717RpExHdTip[0] ;
         A2713RpExHdLi = P0ACV2_A2713RpExHdLi[0] ;
         A212BarSer = P0ACV2_A212BarSer[0] ;
         A1652BarSerDsc = P0ACV2_A1652BarSerDsc[0] ;
         A228BarUniMed = P0ACV2_A228BarUniMed[0] ;
         A252CliCod = P0ACV2_A252CliCod[0] ;
         n252CliCod = P0ACV2_n252CliCod[0] ;
         A279CliNom = P0ACV2_A279CliNom[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A2714RpExHdAlb ;
         GXv_int3[0] = A129BarCod ;
         GXv_int4[0] = A132BarCodReo ;
         GXv_char5[0] = A130BarCodPar ;
         GXv_int6[0] = (byte)(AV13ExhDpz) ;
         GXv_decimal7[0] = AV23Kgs ;
         GXv_decimal8[0] = AV24Mts ;
         GXv_int9[0] = (short)(AV25Pzs) ;
         GXv_char10[0] = AV27FasCod ;
         GXv_int11[0] = A2248ManCod ;
         GXv_int12[0] = A6262RpExSalLn ;
         GXv_int13[0] = AV28ordlin ;
         new app.pexhde1(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4, GXv_char5, GXv_int6, GXv_decimal7, GXv_decimal8, GXv_int9, GXv_char10, GXv_int11, GXv_int12, GXv_int13) ;
         trabajoexterno_recepcion_mto_prc.this.A396EmprCod = GXv_char1[0] ;
         trabajoexterno_recepcion_mto_prc.this.A2714RpExHdAlb = GXv_int2[0] ;
         trabajoexterno_recepcion_mto_prc.this.A129BarCod = GXv_int3[0] ;
         trabajoexterno_recepcion_mto_prc.this.A132BarCodReo = GXv_int4[0] ;
         trabajoexterno_recepcion_mto_prc.this.A130BarCodPar = GXv_char5[0] ;
         trabajoexterno_recepcion_mto_prc.this.AV13ExhDpz = GXv_int6[0] ;
         trabajoexterno_recepcion_mto_prc.this.AV23Kgs = GXv_decimal7[0] ;
         trabajoexterno_recepcion_mto_prc.this.AV24Mts = GXv_decimal8[0] ;
         trabajoexterno_recepcion_mto_prc.this.AV25Pzs = GXv_int9[0] ;
         trabajoexterno_recepcion_mto_prc.this.AV27FasCod = GXv_char10[0] ;
         trabajoexterno_recepcion_mto_prc.this.A2248ManCod = GXv_int11[0] ;
         trabajoexterno_recepcion_mto_prc.this.A6262RpExSalLn = GXv_int12[0] ;
         trabajoexterno_recepcion_mto_prc.this.AV28ordlin = GXv_int13[0] ;
         AV26TrabajoExterno_Recepcion_Mto_SDT_item = (app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)new app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item(remoteHandle, context);
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Seleccionar( false );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod( A129BarCod );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo( A132BarCodReo );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar( A130BarCodPar );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser( A212BarSer );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc( A1652BarSerDsc );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed( A228BarUniMed );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod( A252CliCod );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom( A279CliNom );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs( AV23Kgs );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts( AV24Mts );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs( AV25Pzs );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb( A2714RpExHdAlb );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns( A2716RpExHdCns );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe( A2711RpExHdFe );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs( A2715RpExHdKgs );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli( A2713RpExHdLi );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts( A2847RpExHdMts );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip( A2717RpExHdTip );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln( A6262RpExSalLn );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs( A2715RpExHdKgs );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts( A2847RpExHdMts );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs( A2716RpExHdCns );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase( ((GXutil.strcmp(A2717RpExHdTip, "T")==0) ? true : false) );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod( AV27FasCod );
         AV26TrabajoExterno_Recepcion_Mto_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin( AV28ordlin );
         AV20TrabajoExterno_Recepcion_Mto_SDT.add(AV26TrabajoExterno_Recepcion_Mto_SDT_item, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV21TrabajoExterno_Recepcion_Mto_SDT_json = AV20TrabajoExterno_Recepcion_Mto_SDT.toJSonString(false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = trabajoexterno_recepcion_mto_prc.this.AV21TrabajoExterno_Recepcion_Mto_SDT_json;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21TrabajoExterno_Recepcion_Mto_SDT_json = "" ;
      AV20TrabajoExterno_Recepcion_Mto_SDT = new GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item>(app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P0ACV2_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACV2_A2248ManCod = new short[1] ;
      P0ACV2_A396EmprCod = new String[] {""} ;
      P0ACV2_A2714RpExHdAlb = new int[1] ;
      P0ACV2_n2714RpExHdAlb = new boolean[] {false} ;
      P0ACV2_A129BarCod = new int[1] ;
      P0ACV2_A132BarCodReo = new byte[1] ;
      P0ACV2_A130BarCodPar = new String[] {""} ;
      P0ACV2_A6262RpExSalLn = new short[1] ;
      P0ACV2_n6262RpExSalLn = new boolean[] {false} ;
      P0ACV2_A212BarSer = new String[] {""} ;
      P0ACV2_A1652BarSerDsc = new String[] {""} ;
      P0ACV2_A228BarUniMed = new String[] {""} ;
      P0ACV2_A252CliCod = new int[1] ;
      P0ACV2_n252CliCod = new boolean[] {false} ;
      P0ACV2_A279CliNom = new String[] {""} ;
      P0ACV2_A2716RpExHdCns = new short[1] ;
      P0ACV2_n2716RpExHdCns = new boolean[] {false} ;
      P0ACV2_A2715RpExHdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACV2_n2715RpExHdKgs = new boolean[] {false} ;
      P0ACV2_A2847RpExHdMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACV2_n2847RpExHdMts = new boolean[] {false} ;
      P0ACV2_A2717RpExHdTip = new String[] {""} ;
      P0ACV2_n2717RpExHdTip = new boolean[] {false} ;
      P0ACV2_A2713RpExHdLi = new short[1] ;
      A2711RpExHdFe = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A228BarUniMed = "" ;
      A279CliNom = "" ;
      A2715RpExHdKgs = DecimalUtil.ZERO ;
      A2847RpExHdMts = DecimalUtil.ZERO ;
      A2717RpExHdTip = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new byte[1] ;
      AV23Kgs = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV24Mts = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int9 = new short[1] ;
      AV27FasCod = "" ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXv_int12 = new short[1] ;
      GXv_int13 = new short[1] ;
      AV26TrabajoExterno_Recepcion_Mto_SDT_item = new app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_recepcion_mto_prc__default(),
         new Object[] {
             new Object[] {
            P0ACV2_A2711RpExHdFe, P0ACV2_A2248ManCod, P0ACV2_A396EmprCod, P0ACV2_A2714RpExHdAlb, P0ACV2_n2714RpExHdAlb, P0ACV2_A129BarCod, P0ACV2_A132BarCodReo, P0ACV2_A130BarCodPar, P0ACV2_A6262RpExSalLn, P0ACV2_n6262RpExSalLn,
            P0ACV2_A212BarSer, P0ACV2_A1652BarSerDsc, P0ACV2_A228BarUniMed, P0ACV2_A252CliCod, P0ACV2_n252CliCod, P0ACV2_A279CliNom, P0ACV2_A2716RpExHdCns, P0ACV2_n2716RpExHdCns, P0ACV2_A2715RpExHdKgs, P0ACV2_n2715RpExHdKgs,
            P0ACV2_A2847RpExHdMts, P0ACV2_n2847RpExHdMts, P0ACV2_A2717RpExHdTip, P0ACV2_n2717RpExHdTip, P0ACV2_A2713RpExHdLi
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int4[] ;
   private byte GXv_int6[] ;
   private short AV9Mancod ;
   private short A2248ManCod ;
   private short A6262RpExSalLn ;
   private short A2716RpExHdCns ;
   private short A2713RpExHdLi ;
   private short AV13ExhDpz ;
   private short GXv_int9[] ;
   private short GXv_int11[] ;
   private short GXv_int12[] ;
   private short AV28ordlin ;
   private short GXv_int13[] ;
   private short Gx_err ;
   private int A2714RpExHdAlb ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int GXv_int2[] ;
   private int GXv_int3[] ;
   private int AV25Pzs ;
   private java.math.BigDecimal A2715RpExHdKgs ;
   private java.math.BigDecimal A2847RpExHdMts ;
   private java.math.BigDecimal AV23Kgs ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV24Mts ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String AV8EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A228BarUniMed ;
   private String A279CliNom ;
   private String A2717RpExHdTip ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private String AV27FasCod ;
   private String GXv_char10[] ;
   private java.util.Date AV22RpExHdFe ;
   private java.util.Date A2711RpExHdFe ;
   private boolean n2714RpExHdAlb ;
   private boolean n6262RpExSalLn ;
   private boolean n252CliCod ;
   private boolean n2716RpExHdCns ;
   private boolean n2715RpExHdKgs ;
   private boolean n2847RpExHdMts ;
   private boolean n2717RpExHdTip ;
   private String AV21TrabajoExterno_Recepcion_Mto_SDT_json ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P0ACV2_A2711RpExHdFe ;
   private short[] P0ACV2_A2248ManCod ;
   private String[] P0ACV2_A396EmprCod ;
   private int[] P0ACV2_A2714RpExHdAlb ;
   private boolean[] P0ACV2_n2714RpExHdAlb ;
   private int[] P0ACV2_A129BarCod ;
   private byte[] P0ACV2_A132BarCodReo ;
   private String[] P0ACV2_A130BarCodPar ;
   private short[] P0ACV2_A6262RpExSalLn ;
   private boolean[] P0ACV2_n6262RpExSalLn ;
   private String[] P0ACV2_A212BarSer ;
   private String[] P0ACV2_A1652BarSerDsc ;
   private String[] P0ACV2_A228BarUniMed ;
   private int[] P0ACV2_A252CliCod ;
   private boolean[] P0ACV2_n252CliCod ;
   private String[] P0ACV2_A279CliNom ;
   private short[] P0ACV2_A2716RpExHdCns ;
   private boolean[] P0ACV2_n2716RpExHdCns ;
   private java.math.BigDecimal[] P0ACV2_A2715RpExHdKgs ;
   private boolean[] P0ACV2_n2715RpExHdKgs ;
   private java.math.BigDecimal[] P0ACV2_A2847RpExHdMts ;
   private boolean[] P0ACV2_n2847RpExHdMts ;
   private String[] P0ACV2_A2717RpExHdTip ;
   private boolean[] P0ACV2_n2717RpExHdTip ;
   private short[] P0ACV2_A2713RpExHdLi ;
   private GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item> AV20TrabajoExterno_Recepcion_Mto_SDT ;
   private app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item AV26TrabajoExterno_Recepcion_Mto_SDT_item ;
}

final  class trabajoexterno_recepcion_mto_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ACV2", "SELECT T1.RpExHdFe, T1.ManCod, T1.EmprCod, T1.RpExHdAlb, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RpExSalLn, T2.BarSer, T2.BarSerDsc, T2.BarUniMed, T2.CliCod, T3.CliNom, T1.RpExHdCns, T1.RpExHdKgs, T1.RpExHdMts, T1.RpExHdTip, T1.RpExHdLi FROM ((TXPLREXHD T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) WHERE T1.EmprCod = ? and T1.ManCod = ? and T1.RpExHdFe = ? ORDER BY T1.EmprCod, T1.ManCod, T1.RpExHdFe, T1.RpExHdLi ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(18);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

