package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pingq00 extends GXProcedure
{
   public pingq00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pingq00.class ), "" );
   }

   public pingq00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 )
   {
      pingq00.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pingq00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pingq00.this.AV9OrdenCID = aP1[0];
      this.aP1 = aP1;
      pingq00.this.AV8PrdNum = aP2[0];
      this.aP2 = aP2;
      pingq00.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      /* Using cursor P05282 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV9OrdenCID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12205OrdenCID = P05282_A12205OrdenCID[0] ;
         A12206OrdenCLnId = P05282_A12206OrdenCLnId[0] ;
         A719PrdNum = P05282_A719PrdNum[0] ;
         n719PrdNum = P05282_n719PrdNum[0] ;
         if ( GXutil.strcmp(AV8PrdNum, A719PrdNum) == 0 )
         {
            Gx_msg = httpContext.getMessage( "Error.Ya existe este Producto ", "") + AV8PrdNum + httpContext.getMessage( " en linea ", "") + GXutil.str( A12206OrdenCLnId, 4, 0) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pingq00.this.A396EmprCod;
      this.aP1[0] = pingq00.this.AV9OrdenCID;
      this.aP2[0] = pingq00.this.AV8PrdNum;
      this.aP3[0] = pingq00.this.Gx_msg;
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
      P05282_A396EmprCod = new String[] {""} ;
      P05282_A12205OrdenCID = new long[1] ;
      P05282_A12206OrdenCLnId = new short[1] ;
      P05282_A719PrdNum = new String[] {""} ;
      P05282_n719PrdNum = new boolean[] {false} ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pingq00__default(),
         new Object[] {
             new Object[] {
            P05282_A396EmprCod, P05282_A12205OrdenCID, P05282_A12206OrdenCLnId, P05282_A719PrdNum, P05282_n719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A12206OrdenCLnId ;
   private short Gx_err ;
   private long AV9OrdenCID ;
   private long A12205OrdenCID ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private boolean n719PrdNum ;
   private String[] aP3 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05282_A396EmprCod ;
   private long[] P05282_A12205OrdenCID ;
   private short[] P05282_A12206OrdenCLnId ;
   private String[] P05282_A719PrdNum ;
   private boolean[] P05282_n719PrdNum ;
}

final  class pingq00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05282", "SELECT EmprCod, OrdenCID, OrdenCLnId, PrdNum FROM TXPIngQu1 WHERE EmprCod = ? and OrdenCID = ? ORDER BY EmprCod, OrdenCID, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               return;
      }
   }

}

