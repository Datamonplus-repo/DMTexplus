package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexicols extends GXProcedure
{
   public pexicols( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexicols.class ), "" );
   }

   public pexicols( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 )
   {
      pexicols.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      pexicols.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexicols.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pexicols.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pexicols.this.AV8Cformu = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Cformu = 0 ;
      /* Optimized group. */
      /* Using cursor P03D32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer});
      cV8Cformu = P03D32_AV8Cformu[0] ;
      pr_default.close(0);
      AV8Cformu = (int)(AV8Cformu+cV8Cformu*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexicols.this.A396EmprCod;
      this.aP1[0] = pexicols.this.A252CliCod;
      this.aP2[0] = pexicols.this.A494ForSer;
      this.aP3[0] = pexicols.this.AV8Cformu;
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
      P03D32_AV8Cformu = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexicols__default(),
         new Object[] {
             new Object[] {
            P03D32_AV8Cformu
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int AV8Cformu ;
   private int cV8Cformu ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String scmdbuf ;
   private int[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P03D32_AV8Cformu ;
}

final  class pexicols__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03D32", "SELECT COUNT(*) FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

