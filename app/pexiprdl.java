package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexiprdl extends GXProcedure
{
   public pexiprdl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexiprdl.class ), "" );
   }

   public pexiprdl( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      pexiprdl.this.aP2 = new byte[] {0};
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
      pexiprdl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexiprdl.this.A758ProCod = aP1[0];
      this.aP1 = aP1;
      pexiprdl.this.AV8Ctrl_i = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ctrl_i = (byte)(0) ;
      /* Using cursor P01PJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV8Ctrl_i = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexiprdl.this.A396EmprCod;
      this.aP1[0] = pexiprdl.this.A758ProCod;
      this.aP2[0] = pexiprdl.this.AV8Ctrl_i;
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
      P01PJ2_A396EmprCod = new String[] {""} ;
      P01PJ2_A758ProCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexiprdl__default(),
         new Object[] {
             new Object[] {
            P01PJ2_A396EmprCod, P01PJ2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Ctrl_i ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String scmdbuf ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01PJ2_A396EmprCod ;
   private String[] P01PJ2_A758ProCod ;
}

final  class pexiprdl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01PJ2", "SELECT EmprCod, ProCod FROM TXPPROCES WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

