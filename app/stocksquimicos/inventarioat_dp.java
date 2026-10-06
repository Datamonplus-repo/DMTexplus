package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class inventarioat_dp extends GXProcedure
{
   public inventarioat_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( inventarioat_dp.class ), "" );
   }

   public inventarioat_dp( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem> executeUdp( String aP0 ,
                                                                                                    String aP1 ,
                                                                                                    String aP2 ,
                                                                                                    java.util.Date aP3 )
   {
      inventarioat_dp.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        GXBaseCollection<app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             GXBaseCollection<app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem>[] aP4 )
   {
      inventarioat_dp.this.AV8Emprcod = aP0;
      inventarioat_dp.this.AV5prdnum1 = aP1;
      inventarioat_dp.this.AV6prdnum2 = aP2;
      inventarioat_dp.this.AV7Recfec = aP3;
      inventarioat_dp.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P004U2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, AV5prdnum1, AV7Recfec, AV6prdnum2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A742PrdUniCom = P004U2_A742PrdUniCom[0] ;
         A396EmprCod = P004U2_A396EmprCod[0] ;
         A719PrdNum = P004U2_A719PrdNum[0] ;
         A810RecFec = P004U2_A810RecFec[0] ;
         A807RecExiRea = P004U2_A807RecExiRea[0] ;
         A718PrdNom = P004U2_A718PrdNom[0] ;
         A737PrdUcpDsc = P004U2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P004U2_n737PrdUcpDsc[0] ;
         A6573RecPreRec = P004U2_A6573RecPreRec[0] ;
         A742PrdUniCom = P004U2_A742PrdUniCom[0] ;
         A718PrdNom = P004U2_A718PrdNom[0] ;
         A737PrdUcpDsc = P004U2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P004U2_n737PrdUcpDsc[0] ;
         Gxm1inventarioat_sdt = (app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem)new app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1inventarioat_sdt, 0);
         Gxm1inventarioat_sdt.setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory( "P" );
         Gxm1inventarioat_sdt.setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode( GXutil.trim( A719PrdNum) );
         Gxm1inventarioat_sdt.setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription( GXutil.trim( A718PrdNom) );
         Gxm1inventarioat_sdt.setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode( GXutil.trim( A719PrdNum) );
         Gxm1inventarioat_sdt.setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity( A807RecExiRea );
         Gxm1inventarioat_sdt.setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure( GXutil.trim( A737PrdUcpDsc) );
         Gxm1inventarioat_sdt.setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue( A807RecExiRea.multiply(A6573RecPreRec) );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = inventarioat_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem>(app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem.class, "InventarioAT_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P004U2_A742PrdUniCom = new byte[1] ;
      P004U2_A396EmprCod = new String[] {""} ;
      P004U2_A719PrdNum = new String[] {""} ;
      P004U2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P004U2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004U2_A718PrdNom = new String[] {""} ;
      P004U2_A737PrdUcpDsc = new String[] {""} ;
      P004U2_n737PrdUcpDsc = new boolean[] {false} ;
      P004U2_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A810RecFec = GXutil.nullDate() ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A737PrdUcpDsc = "" ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      Gxm1inventarioat_sdt = new app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.inventarioat_dp__default(),
         new Object[] {
             new Object[] {
            P004U2_A742PrdUniCom, P004U2_A396EmprCod, P004U2_A719PrdNum, P004U2_A810RecFec, P004U2_A807RecExiRea, P004U2_A718PrdNom, P004U2_A737PrdUcpDsc, P004U2_n737PrdUcpDsc, P004U2_A6573RecPreRec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A742PrdUniCom ;
   private short Gx_err ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A6573RecPreRec ;
   private String AV8Emprcod ;
   private String AV5prdnum1 ;
   private String AV6prdnum2 ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A737PrdUcpDsc ;
   private java.util.Date AV7Recfec ;
   private java.util.Date A810RecFec ;
   private boolean n737PrdUcpDsc ;
   private GXBaseCollection<app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P004U2_A742PrdUniCom ;
   private String[] P004U2_A396EmprCod ;
   private String[] P004U2_A719PrdNum ;
   private java.util.Date[] P004U2_A810RecFec ;
   private java.math.BigDecimal[] P004U2_A807RecExiRea ;
   private String[] P004U2_A718PrdNom ;
   private String[] P004U2_A737PrdUcpDsc ;
   private boolean[] P004U2_n737PrdUcpDsc ;
   private java.math.BigDecimal[] P004U2_A6573RecPreRec ;
   private GXBaseCollection<app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem> Gxm2rootcol ;
   private app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem Gxm1inventarioat_sdt ;
}

final  class inventarioat_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004U2", "SELECT T2.PrdUniCom AS PrdUniCom, T1.EmprCod, T1.PrdNum, T1.RecFec, T1.RecExiRea, T2.PrdNom, T3.UniDsc AS PrdUcpDsc, T1.RecPreRec FROM ((TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T2.PrdUniCom) WHERE (T1.EmprCod = ? and T1.PrdNum >= ? and T1.RecFec = ?) AND (T1.RecExiRea > 0) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 6);
               return;
      }
   }

}

