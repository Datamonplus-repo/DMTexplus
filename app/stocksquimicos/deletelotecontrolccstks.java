package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class deletelotecontrolccstks extends GXProcedure
{
   public deletelotecontrolccstks( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( deletelotecontrolccstks.class ), "" );
   }

   public deletelotecontrolccstks( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            String aP1 ,
                            String aP2 )
   {
      deletelotecontrolccstks.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             short[] aP3 )
   {
      deletelotecontrolccstks.this.A396EmprCod = aP0;
      deletelotecontrolccstks.this.A719PrdNum = aP1;
      deletelotecontrolccstks.this.AV8CCStkLot = aP2;
      deletelotecontrolccstks.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9haymov = (short)(0) ;
      /* Using cursor P0AT02 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, AV8CCStkLot});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5722CCStkLot = P0AT02_A5722CCStkLot[0] ;
         A3342CCStkLin = P0AT02_A3342CCStkLin[0] ;
         AV9haymov = (short)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = deletelotecontrolccstks.this.AV9haymov;
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
      P0AT02_A396EmprCod = new String[] {""} ;
      P0AT02_A719PrdNum = new String[] {""} ;
      P0AT02_A5722CCStkLot = new String[] {""} ;
      P0AT02_A3342CCStkLin = new long[1] ;
      A5722CCStkLot = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.deletelotecontrolccstks__default(),
         new Object[] {
             new Object[] {
            P0AT02_A396EmprCod, P0AT02_A719PrdNum, P0AT02_A5722CCStkLot, P0AT02_A3342CCStkLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9haymov ;
   private short Gx_err ;
   private long A3342CCStkLin ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV8CCStkLot ;
   private String scmdbuf ;
   private String A5722CCStkLot ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AT02_A396EmprCod ;
   private String[] P0AT02_A719PrdNum ;
   private String[] P0AT02_A5722CCStkLot ;
   private long[] P0AT02_A3342CCStkLin ;
}

final  class deletelotecontrolccstks__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AT02", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLot, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkLot = ? ORDER BY EmprCod, PrdNum, CCStkLot) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((long[]) buf[3])[0] = rslt.getLong(4);
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
               stmt.setString(3, (String)parms[2], 26);
               return;
      }
   }

}

