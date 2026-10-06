package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppepmte2 extends GXProcedure
{
   public ppepmte2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppepmte2.class ), "" );
   }

   public ppepmte2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           long[] aP1 )
   {
      ppepmte2.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      ppepmte2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppepmte2.this.AV8PepCod = aP1[0];
      this.aP1 = aP1;
      ppepmte2.this.AV9PepMtEnt = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9PepMtEnt = DecimalUtil.doubleToDec(0) ;
      AV11BarNped = GXutil.str( AV8PepCod, 12, 0) ;
      /* Using cursor P012T2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV11BarNped});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3746BarNPed = P012T2_A3746BarNPed[0] ;
         A130BarCodPar = P012T2_A130BarCodPar[0] ;
         A132BarCodReo = P012T2_A132BarCodReo[0] ;
         A129BarCod = P012T2_A129BarCod[0] ;
         /* Optimized group. */
         /* Using cursor P012T3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         c183BarMetLan = P012T3_A183BarMetLan[0] ;
         pr_default.close(1);
         AV9PepMtEnt = AV9PepMtEnt.add(c183BarMetLan) ;
         /* End optimized group. */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppepmte2.this.A396EmprCod;
      this.aP1[0] = ppepmte2.this.AV8PepCod;
      this.aP2[0] = ppepmte2.this.AV9PepMtEnt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11BarNped = "" ;
      scmdbuf = "" ;
      P012T2_A396EmprCod = new String[] {""} ;
      P012T2_A3746BarNPed = new String[] {""} ;
      P012T2_A130BarCodPar = new String[] {""} ;
      P012T2_A132BarCodReo = new byte[1] ;
      P012T2_A129BarCod = new int[1] ;
      A3746BarNPed = "" ;
      A130BarCodPar = "" ;
      c183BarMetLan = DecimalUtil.ZERO ;
      P012T3_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppepmte2__default(),
         new Object[] {
             new Object[] {
            P012T2_A396EmprCod, P012T2_A3746BarNPed, P012T2_A130BarCodPar, P012T2_A132BarCodReo, P012T2_A129BarCod
            }
            , new Object[] {
            P012T3_A183BarMetLan
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private long AV8PepCod ;
   private java.math.BigDecimal AV9PepMtEnt ;
   private java.math.BigDecimal c183BarMetLan ;
   private String A396EmprCod ;
   private String AV11BarNped ;
   private String scmdbuf ;
   private String A3746BarNPed ;
   private String A130BarCodPar ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P012T2_A396EmprCod ;
   private String[] P012T2_A3746BarNPed ;
   private String[] P012T2_A130BarCodPar ;
   private byte[] P012T2_A132BarCodReo ;
   private int[] P012T2_A129BarCod ;
   private java.math.BigDecimal[] P012T3_A183BarMetLan ;
}

final  class ppepmte2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P012T2", "SELECT EmprCod, BarNPed, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE EmprCod = ? and BarNPed = ? ORDER BY EmprCod, BarNPed ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P012T3", "SELECT SUM(BarMetLan) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

