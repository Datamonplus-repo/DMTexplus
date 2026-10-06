package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexifas extends GXProcedure
{
   public pexifas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexifas.class ), "" );
   }

   public pexifas( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      pexifas.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 )
   {
      pexifas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexifas.this.A457FasCod = aP1[0];
      this.aP1 = aP1;
      pexifas.this.AV15Flag = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Flag = (byte)(0) ;
      /* Using cursor P00DD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV15Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexifas.this.A396EmprCod;
      this.aP1[0] = pexifas.this.A457FasCod;
      this.aP2[0] = pexifas.this.AV15Flag;
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
      P00DD2_A396EmprCod = new String[] {""} ;
      P00DD2_A457FasCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexifas__default(),
         new Object[] {
             new Object[] {
            P00DD2_A396EmprCod, P00DD2_A457FasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String scmdbuf ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00DD2_A396EmprCod ;
   private String[] P00DD2_A457FasCod ;
}

final  class pexifas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00DD2", "SELECT EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

