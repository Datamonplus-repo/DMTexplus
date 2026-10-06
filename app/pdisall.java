package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisall extends GXProcedure
{
   public pdisall( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisall.class ), "" );
   }

   public pdisall( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 )
   {
      pdisall.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pdisall.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisall.this.AV11DisCod = aP1[0];
      this.aP1 = aP1;
      pdisall.this.AV8UsurCod = aP2[0];
      this.aP2 = aP2;
      pdisall.this.AV9DisNumUni = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.wjLoc = formatLink("app.tdisall", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV8UsurCod)),GXutil.URLEncode(DecimalUtil.decToString(AV9DisNumUni))}, new String[] {"EmprCod","DisCod","UsurCod","DisNumUni"})  ;
      AV12DisNPzas = 0 ;
      AV13DisKgsLot = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P01SJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV11DisCod)});
      c673Piezas = P01SJ2_A673Piezas[0] ;
      c595Kilos = P01SJ2_A595Kilos[0] ;
      pr_default.close(0);
      AV12DisNPzas = (int)(AV12DisNPzas+c673Piezas) ;
      AV13DisKgsLot = AV13DisKgsLot.add(c595Kilos) ;
      /* End optimized group. */
      /* Optimized UPDATE. */
      /* Using cursor P01SJ3 */
      short AV12DisNPzas374Aux;
      AV12DisNPzas374Aux = (short)(AV12DisNPzas) ;
      pr_default.execute(1, new Object[] {AV13DisKgsLot, Short.valueOf(AV12DisNPzas374Aux), A396EmprCod, Integer.valueOf(AV11DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisall.this.A396EmprCod;
      this.aP1[0] = pdisall.this.AV11DisCod;
      this.aP2[0] = pdisall.this.AV8UsurCod;
      this.aP3[0] = pdisall.this.AV9DisNumUni;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdisall");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13DisKgsLot = DecimalUtil.ZERO ;
      c595Kilos = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01SJ2_A673Piezas = new int[1] ;
      P01SJ2_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A375DisNumUni = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisall__default(),
         new Object[] {
             new Object[] {
            P01SJ2_A673Piezas, P01SJ2_A595Kilos
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A374DisNumPie ;
   private short Gx_err ;
   private int AV11DisCod ;
   private int AV12DisNPzas ;
   private int c673Piezas ;
   private java.math.BigDecimal AV9DisNumUni ;
   private java.math.BigDecimal AV13DisKgsLot ;
   private java.math.BigDecimal c595Kilos ;
   private java.math.BigDecimal A375DisNumUni ;
   private String A396EmprCod ;
   private String AV8UsurCod ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P01SJ2_A673Piezas ;
   private java.math.BigDecimal[] P01SJ2_A595Kilos ;
}

final  class pdisall__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01SJ2", "SELECT SUM(Piezas), SUM(Kilos) FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01SJ3", "UPDATE TXPDISPOS SET DisNumUni=?, DisNumPie=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

