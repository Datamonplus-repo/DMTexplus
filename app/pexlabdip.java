package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexlabdip extends GXProcedure
{
   public pexlabdip( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexlabdip.class ), "" );
   }

   public pexlabdip( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pexlabdip.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pexlabdip.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexlabdip.this.A13324LDESID = aP1[0];
      this.aP1 = aP1;
      pexlabdip.this.Gx_msg = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      AV5GXLvl3 = (byte)(0) ;
      /* Using cursor P05YH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV5GXLvl3 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV5GXLvl3 == 0 )
      {
         Gx_msg = httpContext.getMessage( "Error.NO existe N LAB DIP", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexlabdip.this.A396EmprCod;
      this.aP1[0] = pexlabdip.this.A13324LDESID;
      this.aP2[0] = pexlabdip.this.Gx_msg;
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
      P05YH2_A396EmprCod = new String[] {""} ;
      P05YH2_A13324LDESID = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexlabdip__default(),
         new Object[] {
             new Object[] {
            P05YH2_A396EmprCod, P05YH2_A13324LDESID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV5GXLvl3 ;
   private short Gx_err ;
   private int A13324LDESID ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05YH2_A396EmprCod ;
   private int[] P05YH2_A13324LDESID ;
}

final  class pexlabdip__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05YH2", "SELECT EmprCod, LDESID FROM TXPLDES00 WHERE EmprCod = ? and LDESID = ? ORDER BY EmprCod, LDESID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
      }
   }

}

