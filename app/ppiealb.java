package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppiealb extends GXProcedure
{
   public ppiealb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppiealb.class ), "" );
   }

   public ppiealb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      ppiealb.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      ppiealb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppiealb.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      ppiealb.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      ppiealb.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      ppiealb.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      ppiealb.this.AV15BarPieCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Pieza = "" ;
      AV17NumPie = (short)(0) ;
      /* Using cursor P00902 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1382AlbPConPie = P00902_A1382AlbPConPie[0] ;
         AV17NumPie = A1382AlbPConPie ;
         AV17NumPie = (short)(AV17NumPie+1) ;
         A1382AlbPConPie = (short)(A1382AlbPConPie+1) ;
         /* Using cursor P00903 */
         pr_default.execute(1, new Object[] {Short.valueOf(A1382AlbPConPie), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV16Pieza = GXutil.str( AV17NumPie, 4, 0) ;
      AV15BarPieCod = AV16Pieza ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppiealb.this.A396EmprCod;
      this.aP1[0] = ppiealb.this.A30AlbProCod;
      this.aP2[0] = ppiealb.this.A129BarCod;
      this.aP3[0] = ppiealb.this.A132BarCodReo;
      this.aP4[0] = ppiealb.this.A130BarCodPar;
      this.aP5[0] = ppiealb.this.AV15BarPieCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppiealb");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Pieza = "" ;
      scmdbuf = "" ;
      P00902_A396EmprCod = new String[] {""} ;
      P00902_A30AlbProCod = new long[1] ;
      P00902_A129BarCod = new int[1] ;
      P00902_A132BarCodReo = new byte[1] ;
      P00902_A130BarCodPar = new String[] {""} ;
      P00902_A1382AlbPConPie = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppiealb__default(),
         new Object[] {
             new Object[] {
            P00902_A396EmprCod, P00902_A30AlbProCod, P00902_A129BarCod, P00902_A132BarCodReo, P00902_A130BarCodPar, P00902_A1382AlbPConPie
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV17NumPie ;
   private short A1382AlbPConPie ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15BarPieCod ;
   private String AV16Pieza ;
   private String scmdbuf ;
   private String[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00902_A396EmprCod ;
   private long[] P00902_A30AlbProCod ;
   private int[] P00902_A129BarCod ;
   private byte[] P00902_A132BarCodReo ;
   private String[] P00902_A130BarCodPar ;
   private short[] P00902_A1382AlbPConPie ;
}

final  class ppiealb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00902", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPConPie FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00903", "UPDATE TXPALBBAR SET AlbPConPie=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

