package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_recepcion_prc extends GXProcedure
{
   public trabajoexterno_recepcion_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_recepcion_prc.class ), "" );
   }

   public trabajoexterno_recepcion_prc( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             short aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 )
   {
      trabajoexterno_recepcion_prc.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String[] aP5 )
   {
      trabajoexterno_recepcion_prc.this.AV8EmprCod = aP0;
      trabajoexterno_recepcion_prc.this.AV9Mancod = aP1;
      trabajoexterno_recepcion_prc.this.AV10SalExtAlbIN = aP2;
      trabajoexterno_recepcion_prc.this.AV11Fec1 = aP3;
      trabajoexterno_recepcion_prc.this.AV12Fec2 = aP4;
      trabajoexterno_recepcion_prc.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17TrabajoExterno_Recepcion_SDT.clear();
      AV19TrabajoExterno_Recepcion_SDT_json = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV10SalExtAlbIN) ,
                                           AV11Fec1 ,
                                           AV12Fec2 ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           A2256SalExtFec ,
                                           Byte.valueOf(A6253SalExEsB) ,
                                           AV8EmprCod ,
                                           Short.valueOf(AV9Mancod) ,
                                           A396EmprCod ,
                                           Short.valueOf(A2248ManCod) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      /* Using cursor P0AC42 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Short.valueOf(AV9Mancod), Integer.valueOf(AV10SalExtAlbIN), AV11Fec1, AV12Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AC42_A396EmprCod[0] ;
         A2248ManCod = P0AC42_A2248ManCod[0] ;
         A6253SalExEsB = P0AC42_A6253SalExEsB[0] ;
         A2256SalExtFec = P0AC42_A2256SalExtFec[0] ;
         A2253SalExtAlb = P0AC42_A2253SalExtAlb[0] ;
         A129BarCod = P0AC42_A129BarCod[0] ;
         A132BarCodReo = P0AC42_A132BarCodReo[0] ;
         A130BarCodPar = P0AC42_A130BarCodPar[0] ;
         A6558FasCodn = P0AC42_A6558FasCodn[0] ;
         A6248SalExNln = P0AC42_A6248SalExNln[0] ;
         A14410FasDscMn = P0AC42_A14410FasDscMn[0] ;
         A252CliCod = P0AC42_A252CliCod[0] ;
         n252CliCod = P0AC42_n252CliCod[0] ;
         A279CliNom = P0AC42_A279CliNom[0] ;
         A212BarSer = P0AC42_A212BarSer[0] ;
         A1652BarSerDsc = P0AC42_A1652BarSerDsc[0] ;
         A135BarColNom = P0AC42_A135BarColNom[0] ;
         A1234BarNomCli = P0AC42_A1234BarNomCli[0] ;
         A228BarUniMed = P0AC42_A228BarUniMed[0] ;
         A654OrdLin = P0AC42_A654OrdLin[0] ;
         A2248ManCod = P0AC42_A2248ManCod[0] ;
         A2256SalExtFec = P0AC42_A2256SalExtFec[0] ;
         A252CliCod = P0AC42_A252CliCod[0] ;
         n252CliCod = P0AC42_n252CliCod[0] ;
         A212BarSer = P0AC42_A212BarSer[0] ;
         A1652BarSerDsc = P0AC42_A1652BarSerDsc[0] ;
         A135BarColNom = P0AC42_A135BarColNom[0] ;
         A1234BarNomCli = P0AC42_A1234BarNomCli[0] ;
         A228BarUniMed = P0AC42_A228BarUniMed[0] ;
         A279CliNom = P0AC42_A279CliNom[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A2253SalExtAlb ;
         GXv_int3[0] = A129BarCod ;
         GXv_int4[0] = A132BarCodReo ;
         GXv_char5[0] = A130BarCodPar ;
         GXv_int6[0] = (byte)(AV13ExhDpz) ;
         GXv_decimal7[0] = AV14RpExHdKgs ;
         GXv_decimal8[0] = AV15RpExHdMts ;
         GXv_int9[0] = AV16RpExHdCns ;
         GXv_char10[0] = A6558FasCodn ;
         GXv_int11[0] = AV9Mancod ;
         GXv_int12[0] = A6248SalExNln ;
         GXv_int13[0] = AV20ordlin ;
         new app.pexhde1(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4, GXv_char5, GXv_int6, GXv_decimal7, GXv_decimal8, GXv_int9, GXv_char10, GXv_int11, GXv_int12, GXv_int13) ;
         trabajoexterno_recepcion_prc.this.A396EmprCod = GXv_char1[0] ;
         trabajoexterno_recepcion_prc.this.A2253SalExtAlb = GXv_int2[0] ;
         trabajoexterno_recepcion_prc.this.A129BarCod = GXv_int3[0] ;
         trabajoexterno_recepcion_prc.this.A132BarCodReo = GXv_int4[0] ;
         trabajoexterno_recepcion_prc.this.A130BarCodPar = GXv_char5[0] ;
         trabajoexterno_recepcion_prc.this.AV13ExhDpz = GXv_int6[0] ;
         trabajoexterno_recepcion_prc.this.AV14RpExHdKgs = GXv_decimal7[0] ;
         trabajoexterno_recepcion_prc.this.AV15RpExHdMts = GXv_decimal8[0] ;
         trabajoexterno_recepcion_prc.this.AV16RpExHdCns = GXv_int9[0] ;
         trabajoexterno_recepcion_prc.this.A6558FasCodn = GXv_char10[0] ;
         trabajoexterno_recepcion_prc.this.AV9Mancod = GXv_int11[0] ;
         trabajoexterno_recepcion_prc.this.A6248SalExNln = GXv_int12[0] ;
         trabajoexterno_recepcion_prc.this.AV20ordlin = GXv_int13[0] ;
         AV18TrabajoExterno_Recepcion_SDT_item = (app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)new app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item(remoteHandle, context);
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar( false );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb( A2253SalExtAlb );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln( A6248SalExNln );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec( A2256SalExtFec );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns( AV16RpExHdCns );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs( AV14RpExHdKgs );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts( AV15RpExHdMts );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns( AV16RpExHdCns );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs( AV14RpExHdKgs );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts( AV15RpExHdMts );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod( A129BarCod );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo( A132BarCodReo );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar( A130BarCodPar );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn( A6558FasCodn );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc( A14410FasDscMn );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip( "*" );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod( A252CliCod );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom( A279CliNom );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser( A212BarSer );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc( A1652BarSerDsc );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom( A135BarColNom );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli( A1234BarNomCli );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed( A228BarUniMed );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb( A6253SalExEsB );
         AV18TrabajoExterno_Recepcion_SDT_item.setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin( A654OrdLin );
         AV17TrabajoExterno_Recepcion_SDT.add(AV18TrabajoExterno_Recepcion_SDT_item, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV19TrabajoExterno_Recepcion_SDT_json = AV17TrabajoExterno_Recepcion_SDT.toJSonString(false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = trabajoexterno_recepcion_prc.this.AV19TrabajoExterno_Recepcion_SDT_json;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19TrabajoExterno_Recepcion_SDT_json = "" ;
      AV17TrabajoExterno_Recepcion_SDT = new GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item>(app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P0AC42_A396EmprCod = new String[] {""} ;
      P0AC42_A2248ManCod = new short[1] ;
      P0AC42_A6253SalExEsB = new byte[1] ;
      P0AC42_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AC42_A2253SalExtAlb = new int[1] ;
      P0AC42_A129BarCod = new int[1] ;
      P0AC42_A132BarCodReo = new byte[1] ;
      P0AC42_A130BarCodPar = new String[] {""} ;
      P0AC42_A6558FasCodn = new String[] {""} ;
      P0AC42_A6248SalExNln = new short[1] ;
      P0AC42_A14410FasDscMn = new String[] {""} ;
      P0AC42_A252CliCod = new int[1] ;
      P0AC42_n252CliCod = new boolean[] {false} ;
      P0AC42_A279CliNom = new String[] {""} ;
      P0AC42_A212BarSer = new String[] {""} ;
      P0AC42_A1652BarSerDsc = new String[] {""} ;
      P0AC42_A135BarColNom = new String[] {""} ;
      P0AC42_A1234BarNomCli = new String[] {""} ;
      P0AC42_A228BarUniMed = new String[] {""} ;
      P0AC42_A654OrdLin = new short[1] ;
      A130BarCodPar = "" ;
      A6558FasCodn = "" ;
      A14410FasDscMn = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A228BarUniMed = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new byte[1] ;
      AV14RpExHdKgs = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV15RpExHdMts = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int9 = new short[1] ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXv_int12 = new short[1] ;
      GXv_int13 = new short[1] ;
      AV18TrabajoExterno_Recepcion_SDT_item = new app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_recepcion_prc__default(),
         new Object[] {
             new Object[] {
            P0AC42_A396EmprCod, P0AC42_A2248ManCod, P0AC42_A6253SalExEsB, P0AC42_A2256SalExtFec, P0AC42_A2253SalExtAlb, P0AC42_A129BarCod, P0AC42_A132BarCodReo, P0AC42_A130BarCodPar, P0AC42_A6558FasCodn, P0AC42_A6248SalExNln,
            P0AC42_A14410FasDscMn, P0AC42_A252CliCod, P0AC42_n252CliCod, P0AC42_A279CliNom, P0AC42_A212BarSer, P0AC42_A1652BarSerDsc, P0AC42_A135BarColNom, P0AC42_A1234BarNomCli, P0AC42_A228BarUniMed, P0AC42_A654OrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A6253SalExEsB ;
   private byte A132BarCodReo ;
   private byte GXv_int4[] ;
   private byte GXv_int6[] ;
   private short AV9Mancod ;
   private short A2248ManCod ;
   private short A6248SalExNln ;
   private short A654OrdLin ;
   private short AV13ExhDpz ;
   private short AV16RpExHdCns ;
   private short GXv_int9[] ;
   private short GXv_int11[] ;
   private short GXv_int12[] ;
   private short AV20ordlin ;
   private short GXv_int13[] ;
   private short Gx_err ;
   private int AV10SalExtAlbIN ;
   private int A2253SalExtAlb ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int GXv_int2[] ;
   private int GXv_int3[] ;
   private java.math.BigDecimal AV14RpExHdKgs ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV15RpExHdMts ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String AV8EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A6558FasCodn ;
   private String A14410FasDscMn ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A228BarUniMed ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private String GXv_char10[] ;
   private java.util.Date AV11Fec1 ;
   private java.util.Date AV12Fec2 ;
   private java.util.Date A2256SalExtFec ;
   private boolean n252CliCod ;
   private String AV19TrabajoExterno_Recepcion_SDT_json ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AC42_A396EmprCod ;
   private short[] P0AC42_A2248ManCod ;
   private byte[] P0AC42_A6253SalExEsB ;
   private java.util.Date[] P0AC42_A2256SalExtFec ;
   private int[] P0AC42_A2253SalExtAlb ;
   private int[] P0AC42_A129BarCod ;
   private byte[] P0AC42_A132BarCodReo ;
   private String[] P0AC42_A130BarCodPar ;
   private String[] P0AC42_A6558FasCodn ;
   private short[] P0AC42_A6248SalExNln ;
   private String[] P0AC42_A14410FasDscMn ;
   private int[] P0AC42_A252CliCod ;
   private boolean[] P0AC42_n252CliCod ;
   private String[] P0AC42_A279CliNom ;
   private String[] P0AC42_A212BarSer ;
   private String[] P0AC42_A1652BarSerDsc ;
   private String[] P0AC42_A135BarColNom ;
   private String[] P0AC42_A1234BarNomCli ;
   private String[] P0AC42_A228BarUniMed ;
   private short[] P0AC42_A654OrdLin ;
   private GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item> AV17TrabajoExterno_Recepcion_SDT ;
   private app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item AV18TrabajoExterno_Recepcion_SDT_item ;
}

final  class trabajoexterno_recepcion_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AC42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV10SalExtAlbIN ,
                                          java.util.Date AV11Fec1 ,
                                          java.util.Date AV12Fec2 ,
                                          int A2253SalExtAlb ,
                                          java.util.Date A2256SalExtFec ,
                                          byte A6253SalExEsB ,
                                          String AV8EmprCod ,
                                          short AV9Mancod ,
                                          String A396EmprCod ,
                                          short A2248ManCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[5];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.ManCod, T1.SalExEsB, T2.SalExtFec, T1.SalExtAlb, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCodn, T1.SalExNln, T1.FasDscMn, T3.CliCod, T4.CliNom," ;
      scmdbuf += " T3.BarSer, T3.BarSerDsc, T3.BarColNom, T3.BarNomCli, T3.BarUniMed, T1.OrdLin FROM (((TXPEXHDPZ T1 INNER JOIN TXPCEXTSA T2 ON T2.EmprCod = T1.EmprCod AND T2.SalExtAlb" ;
      scmdbuf += " = T1.SalExtAlb) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT" ;
      scmdbuf += " JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T2.ManCod = ?)");
      addWhere(sWhereString, "(T1.SalExEsB <> 2)");
      if ( ! (0==AV10SalExtAlbIN) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb = ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV11Fec1)) )
      {
         addWhere(sWhereString, "(T2.SalExtFec >= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12Fec2)) )
      {
         addWhere(sWhereString, "(T2.SalExtFec <= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T2.ManCod" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P0AC42(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AC42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 30);
               ((String[]) buf[14])[0] = rslt.getString(14, 16);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 13);
               ((String[]) buf[17])[0] = rslt.getString(17, 13);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               return;
      }
   }

}

