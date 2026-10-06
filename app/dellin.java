package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dellin extends GXProcedure
{
   public dellin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dellin.class ), "" );
   }

   public dellin( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        byte aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             byte aP5 )
   {
      dellin.this.AV9EmprCod = aP0;
      dellin.this.AV10BarCod = aP1;
      dellin.this.AV11BarCodReo = aP2;
      dellin.this.AV12BarCodPar = aP3;
      dellin.this.AV13RecLinMaq = aP4;
      dellin.this.AV14RecLinPro = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P09ZK2 */
      pr_default.execute(0, new Object[] {AV9EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodReo), AV12BarCodPar, Short.valueOf(AV13RecLinMaq), Byte.valueOf(AV14RecLinPro)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
      /* End optimized DELETE. */
      Application.commitDataStores(context, remoteHandle, pr_default, "dellin");
      AV15LastReclinpro = (byte)(0) ;
      /* Using cursor P09ZK3 */
      pr_default.execute(1, new Object[] {AV9EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodReo), AV12BarCodPar, Short.valueOf(AV13RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P09ZK3_A396EmprCod[0] ;
         A129BarCod = P09ZK3_A129BarCod[0] ;
         A132BarCodReo = P09ZK3_A132BarCodReo[0] ;
         A130BarCodPar = P09ZK3_A130BarCodPar[0] ;
         A2804RecLinMaq = P09ZK3_A2804RecLinMaq[0] ;
         A1273RecLinPro = P09ZK3_A1273RecLinPro[0] ;
         AV15LastReclinpro = A1273RecLinPro ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Optimized UPDATE. */
      /* Using cursor P09ZK4 */
      pr_default.execute(2, new Object[] {Byte.valueOf(AV15LastReclinpro), AV9EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodReo), AV12BarCodPar, Short.valueOf(AV13RecLinMaq)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "dellin");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P09ZK3_A396EmprCod = new String[] {""} ;
      P09ZK3_A129BarCod = new int[1] ;
      P09ZK3_A132BarCodReo = new byte[1] ;
      P09ZK3_A130BarCodPar = new String[] {""} ;
      P09ZK3_A2804RecLinMaq = new short[1] ;
      P09ZK3_A1273RecLinPro = new byte[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.dellin__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.dellin__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.dellin__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dellin__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P09ZK3_A396EmprCod, P09ZK3_A129BarCod, P09ZK3_A132BarCodReo, P09ZK3_A130BarCodPar, P09ZK3_A2804RecLinMaq, P09ZK3_A1273RecLinPro
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11BarCodReo ;
   private byte AV14RecLinPro ;
   private byte AV15LastReclinpro ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A1272UltLinPro ;
   private short AV13RecLinMaq ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV10BarCod ;
   private int A129BarCod ;
   private String AV9EmprCod ;
   private String AV12BarCodPar ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private IDataStoreProvider pr_default ;
   private String[] P09ZK3_A396EmprCod ;
   private int[] P09ZK3_A129BarCod ;
   private byte[] P09ZK3_A132BarCodReo ;
   private String[] P09ZK3_A130BarCodPar ;
   private short[] P09ZK3_A2804RecLinMaq ;
   private byte[] P09ZK3_A1273RecLinPro ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class dellin__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class dellin__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class dellin__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class dellin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P09ZK2", "DELETE FROM TXPCRECET  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new ForEachCursor("P09ZK3", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09ZK4", "UPDATE TXPRECMAQ SET UltLinPro=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

