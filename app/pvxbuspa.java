package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvxbuspa extends GXProcedure
{
   public pvxbuspa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvxbuspa.class ), "" );
   }

   public pvxbuspa( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           long[] aP1 ,
                           String[] aP2 )
   {
      pvxbuspa.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pvxbuspa.this.A6452VxParCod = aP0;
      pvxbuspa.this.aP1 = aP1;
      pvxbuspa.this.aP2 = aP2;
      pvxbuspa.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13GXLvl1 = (byte)(0) ;
      /* Using cursor P04VA2 */
      pr_default.execute(0, new Object[] {A6452VxParCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6453VxParVal = P04VA2_A6453VxParVal[0] ;
         n6453VxParVal = P04VA2_n6453VxParVal[0] ;
         A12895VxParVChar = P04VA2_A12895VxParVChar[0] ;
         n12895VxParVChar = P04VA2_n12895VxParVChar[0] ;
         AV13GXLvl1 = (byte)(1) ;
         AV8VxParVal = A6453VxParVal ;
         AV10VxParVChar = A12895VxParVChar ;
         AV9CRet = (byte)(0) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV13GXLvl1 == 0 )
      {
         AV9CRet = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pvxbuspa.this.AV8VxParVal;
      this.aP2[0] = pvxbuspa.this.AV10VxParVChar;
      this.aP3[0] = pvxbuspa.this.AV9CRet;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10VxParVChar = "" ;
      scmdbuf = "" ;
      P04VA2_A6452VxParCod = new String[] {""} ;
      P04VA2_A6453VxParVal = new long[1] ;
      P04VA2_n6453VxParVal = new boolean[] {false} ;
      P04VA2_A12895VxParVChar = new String[] {""} ;
      P04VA2_n12895VxParVChar = new boolean[] {false} ;
      A12895VxParVChar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvxbuspa__default(),
         new Object[] {
             new Object[] {
            P04VA2_A6452VxParCod, P04VA2_A6453VxParVal, P04VA2_n6453VxParVal, P04VA2_A12895VxParVChar, P04VA2_n12895VxParVChar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9CRet ;
   private byte AV13GXLvl1 ;
   private short Gx_err ;
   private long AV8VxParVal ;
   private long A6453VxParVal ;
   private String A6452VxParCod ;
   private String AV10VxParVChar ;
   private String scmdbuf ;
   private String A12895VxParVChar ;
   private boolean n6453VxParVal ;
   private boolean n12895VxParVChar ;
   private byte[] aP3 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04VA2_A6452VxParCod ;
   private long[] P04VA2_A6453VxParVal ;
   private boolean[] P04VA2_n6453VxParVal ;
   private String[] P04VA2_A12895VxParVChar ;
   private boolean[] P04VA2_n12895VxParVChar ;
}

final  class pvxbuspa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04VA2", "SELECT ParCod, ParVal, ParValChar FROM VTXPARAM WHERE ParCod = ? ORDER BY ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 100);
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
               stmt.setString(1, (String)parms[0], 6);
               return;
      }
   }

}

