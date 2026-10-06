package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entradarecuentos_dp extends GXProcedure
{
   public entradarecuentos_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradarecuentos_dp.class ), "" );
   }

   public entradarecuentos_dp( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtEntradaRecuentos_SDT_Item> executeUdp( String aP0 ,
                                                                         java.util.Date aP1 )
   {
      entradarecuentos_dp.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<app.SdtEntradaRecuentos_SDT_Item>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        GXBaseCollection<app.SdtEntradaRecuentos_SDT_Item>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             GXBaseCollection<app.SdtEntradaRecuentos_SDT_Item>[] aP2 )
   {
      entradarecuentos_dp.this.AV5EmprCod = aP0;
      entradarecuentos_dp.this.AV6Recfec = aP1;
      entradarecuentos_dp.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P004L2 */
      pr_default.execute(0, new Object[] {AV5EmprCod, AV6Recfec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P004L2_A396EmprCod[0] ;
         A810RecFec = P004L2_A810RecFec[0] ;
         A727PrdRec = P004L2_A727PrdRec[0] ;
         A13416RecEstInv = P004L2_A13416RecEstInv[0] ;
         A718PrdNom = P004L2_A718PrdNom[0] ;
         A809RecExiTeo = P004L2_A809RecExiTeo[0] ;
         A12285RecLot = P004L2_A12285RecLot[0] ;
         A726PrdPreMed = P004L2_A726PrdPreMed[0] ;
         A724PrdPreAct = P004L2_A724PrdPreAct[0] ;
         A719PrdNum = P004L2_A719PrdNum[0] ;
         A727PrdRec = P004L2_A727PrdRec[0] ;
         A718PrdNom = P004L2_A718PrdNom[0] ;
         A726PrdPreMed = P004L2_A726PrdPreMed[0] ;
         A724PrdPreAct = P004L2_A724PrdPreAct[0] ;
         Gxm1entradarecuentos_sdt = (app.SdtEntradaRecuentos_SDT_Item)new app.SdtEntradaRecuentos_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1entradarecuentos_sdt, 0);
         Gxm1entradarecuentos_sdt.setgxTv_SdtEntradaRecuentos_SDT_Item_Prdnum( A719PrdNum );
         Gxm1entradarecuentos_sdt.setgxTv_SdtEntradaRecuentos_SDT_Item_Prdnom( A718PrdNom );
         Gxm1entradarecuentos_sdt.setgxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo( A809RecExiTeo );
         Gxm1entradarecuentos_sdt.setgxTv_SdtEntradaRecuentos_SDT_Item_Recexirea( A809RecExiTeo );
         Gxm1entradarecuentos_sdt.setgxTv_SdtEntradaRecuentos_SDT_Item_Difer( DecimalUtil.doubleToDec(0) );
         Gxm1entradarecuentos_sdt.setgxTv_SdtEntradaRecuentos_SDT_Item_Reclot( A12285RecLot );
         Gxm1entradarecuentos_sdt.setgxTv_SdtEntradaRecuentos_SDT_Item_Prdrec( A727PrdRec );
         Gxm1entradarecuentos_sdt.setgxTv_SdtEntradaRecuentos_SDT_Item_Recestinv( A13416RecEstInv );
         Gxm1entradarecuentos_sdt.setgxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed( A726PrdPreMed );
         Gxm1entradarecuentos_sdt.setgxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact( A724PrdPreAct );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = entradarecuentos_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtEntradaRecuentos_SDT_Item>(app.SdtEntradaRecuentos_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P004L2_A396EmprCod = new String[] {""} ;
      P004L2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P004L2_A727PrdRec = new String[] {""} ;
      P004L2_A13416RecEstInv = new byte[1] ;
      P004L2_A718PrdNom = new String[] {""} ;
      P004L2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004L2_A12285RecLot = new String[] {""} ;
      P004L2_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004L2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004L2_A719PrdNum = new String[] {""} ;
      A396EmprCod = "" ;
      A810RecFec = GXutil.nullDate() ;
      A727PrdRec = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A12285RecLot = "" ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      Gxm1entradarecuentos_sdt = new app.SdtEntradaRecuentos_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entradarecuentos_dp__default(),
         new Object[] {
             new Object[] {
            P004L2_A396EmprCod, P004L2_A810RecFec, P004L2_A727PrdRec, P004L2_A13416RecEstInv, P004L2_A718PrdNom, P004L2_A809RecExiTeo, P004L2_A12285RecLot, P004L2_A726PrdPreMed, P004L2_A724PrdPreAct, P004L2_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A13416RecEstInv ;
   private short Gx_err ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A724PrdPreAct ;
   private String AV5EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A727PrdRec ;
   private String A718PrdNom ;
   private String A12285RecLot ;
   private String A719PrdNum ;
   private java.util.Date AV6Recfec ;
   private java.util.Date A810RecFec ;
   private GXBaseCollection<app.SdtEntradaRecuentos_SDT_Item>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P004L2_A396EmprCod ;
   private java.util.Date[] P004L2_A810RecFec ;
   private String[] P004L2_A727PrdRec ;
   private byte[] P004L2_A13416RecEstInv ;
   private String[] P004L2_A718PrdNom ;
   private java.math.BigDecimal[] P004L2_A809RecExiTeo ;
   private String[] P004L2_A12285RecLot ;
   private java.math.BigDecimal[] P004L2_A726PrdPreMed ;
   private java.math.BigDecimal[] P004L2_A724PrdPreAct ;
   private String[] P004L2_A719PrdNum ;
   private GXBaseCollection<app.SdtEntradaRecuentos_SDT_Item> Gxm2rootcol ;
   private app.SdtEntradaRecuentos_SDT_Item Gxm1entradarecuentos_sdt ;
}

final  class entradarecuentos_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004L2", "SELECT T1.EmprCod, T1.RecFec, T2.PrdRec, T1.RecEstInv, T2.PrdNom, T1.RecExiTeo, T1.RecLot, T2.PrdPreMed, T2.PrdPreAct, T1.PrdNum FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.RecFec = ?) AND (T1.RecEstInv = 0) AND (T2.PrdRec = 'S') ORDER BY T1.EmprCod, T1.RecFec, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
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
               return;
      }
   }

}

