package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusprc extends GXProcedure
{
   public pbusprc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusprc.class ), "" );
   }

   public pbusprc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           byte[] aP3 )
   {
      pbusprc.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 )
   {
      pbusprc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusprc.this.AV17PProCod = aP1[0];
      this.aP1 = aP1;
      pbusprc.this.AV18UProCod = aP2[0];
      this.aP2 = aP2;
      pbusprc.this.AV15Flag1 = aP3[0];
      this.aP3 = aP3;
      pbusprc.this.AV16Flag2 = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Flag1 = (byte)(1) ;
      /* Using cursor P002I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV17PProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P002I2_A764ProForCod[0] ;
         AV15Flag1 = (byte)(0) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV16Flag2 = (byte)(1) ;
      /* Using cursor P002I3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV18UProCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A764ProForCod = P002I3_A764ProForCod[0] ;
         AV16Flag2 = (byte)(0) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusprc.this.A396EmprCod;
      this.aP1[0] = pbusprc.this.AV17PProCod;
      this.aP2[0] = pbusprc.this.AV18UProCod;
      this.aP3[0] = pbusprc.this.AV15Flag1;
      this.aP4[0] = pbusprc.this.AV16Flag2;
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
      P002I2_A396EmprCod = new String[] {""} ;
      P002I2_A764ProForCod = new String[] {""} ;
      A764ProForCod = "" ;
      P002I3_A396EmprCod = new String[] {""} ;
      P002I3_A764ProForCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusprc__default(),
         new Object[] {
             new Object[] {
            P002I2_A396EmprCod, P002I2_A764ProForCod
            }
            , new Object[] {
            P002I3_A396EmprCod, P002I3_A764ProForCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag1 ;
   private byte AV16Flag2 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV17PProCod ;
   private String AV18UProCod ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P002I2_A396EmprCod ;
   private String[] P002I2_A764ProForCod ;
   private String[] P002I3_A396EmprCod ;
   private String[] P002I3_A764ProForCod ;
}

final  class pbusprc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002I2", "SELECT EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P002I3", "SELECT EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

