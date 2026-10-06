package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisalbu extends GXProcedure
{
   public pdisalbu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisalbu.class ), "" );
   }

   public pdisalbu( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pdisalbu.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pdisalbu.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisalbu.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdisalbu.this.A44AlbRecCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Piezas = 0 ;
      AV9KIlos = DecimalUtil.doubleToDec(0) ;
      AV10Metros = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P04A92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      cV8Piezas = P04A92_AV8Piezas[0] ;
      c382DisPieKil = P04A92_A382DisPieKil[0] ;
      c384DisPieMet = P04A92_A384DisPieMet[0] ;
      pr_default.close(0);
      AV8Piezas = (int)(AV8Piezas+cV8Piezas*1) ;
      AV9KIlos = AV9KIlos.add(c382DisPieKil) ;
      AV10Metros = AV10Metros.add(c384DisPieMet) ;
      /* End optimized group. */
      /* Optimized UPDATE. */
      /* Using cursor P04A93 */
      pr_default.execute(1, new Object[] {AV10Metros, AV9KIlos, Integer.valueOf(AV8Piezas), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisalbu.this.A396EmprCod;
      this.aP1[0] = pdisalbu.this.A361DisCod;
      this.aP2[0] = pdisalbu.this.A44AlbRecCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdisalbu");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9KIlos = DecimalUtil.ZERO ;
      AV10Metros = DecimalUtil.ZERO ;
      c382DisPieKil = DecimalUtil.ZERO ;
      c384DisPieMet = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P04A92_AV8Piezas = new int[1] ;
      P04A92_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04A92_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A631Metros = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisalbu__default(),
         new Object[] {
             new Object[] {
            P04A92_AV8Piezas, P04A92_A382DisPieKil, P04A92_A384DisPieMet
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int AV8Piezas ;
   private int cV8Piezas ;
   private int A673Piezas ;
   private java.math.BigDecimal AV9KIlos ;
   private java.math.BigDecimal AV10Metros ;
   private java.math.BigDecimal c382DisPieKil ;
   private java.math.BigDecimal c384DisPieMet ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A595Kilos ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P04A92_AV8Piezas ;
   private java.math.BigDecimal[] P04A92_A382DisPieKil ;
   private java.math.BigDecimal[] P04A92_A384DisPieMet ;
}

final  class pdisalbu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04A92", "SELECT COUNT(*), SUM(DisPieKil), SUM(DisPieMet) FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04A93", "UPDATE TXPDISALB SET Metros=?, Kilos=?, Piezas=?  WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

