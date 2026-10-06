package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusval extends GXProcedure
{
   public pbusval( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusval.class ), "" );
   }

   public pbusval( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           String aP1 ,
                           byte[] aP2 )
   {
      pbusval.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        byte[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             byte[] aP2 ,
                             byte[] aP3 )
   {
      pbusval.this.A396EmprCod = aP0;
      pbusval.this.A719PrdNum = aP1;
      pbusval.this.aP2 = aP2;
      pbusval.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Flag = (byte)(0) ;
      /* Using cursor P01QO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P01QO2_A856ValCod[0] ;
         AV17ValCod = A856ValCod ;
         AV15Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pbusval.this.AV15Flag;
      this.aP3[0] = pbusval.this.AV17ValCod;
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
      P01QO2_A396EmprCod = new String[] {""} ;
      P01QO2_A719PrdNum = new String[] {""} ;
      P01QO2_A856ValCod = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusval__default(),
         new Object[] {
             new Object[] {
            P01QO2_A396EmprCod, P01QO2_A719PrdNum, P01QO2_A856ValCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag ;
   private byte AV17ValCod ;
   private byte A856ValCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private byte[] aP3 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01QO2_A396EmprCod ;
   private String[] P01QO2_A719PrdNum ;
   private byte[] P01QO2_A856ValCod ;
}

final  class pbusval__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01QO2", "SELECT EmprCod, PrdNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
      }
   }

}

