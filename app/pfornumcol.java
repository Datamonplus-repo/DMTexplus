package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfornumcol extends GXProcedure
{
   public pfornumcol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfornumcol.class ), "" );
   }

   public pfornumcol( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pfornumcol.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pfornumcol.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfornumcol.this.AV8Fornumcol = aP1[0];
      this.aP1 = aP1;
      pfornumcol.this.AV9NumForm = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9NumForm = 0 ;
      /* Optimized group. */
      /* Using cursor P04QO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Fornumcol)});
      cV9NumForm = P04QO2_AV9NumForm[0] ;
      pr_default.close(0);
      AV9NumForm = (int)(AV9NumForm+cV9NumForm*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfornumcol.this.A396EmprCod;
      this.aP1[0] = pfornumcol.this.AV8Fornumcol;
      this.aP2[0] = pfornumcol.this.AV9NumForm;
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
      P04QO2_AV9NumForm = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfornumcol__default(),
         new Object[] {
             new Object[] {
            P04QO2_AV9NumForm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8Fornumcol ;
   private int AV9NumForm ;
   private int cV9NumForm ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P04QO2_AV9NumForm ;
}

final  class pfornumcol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04QO2", "SELECT COUNT(*) FROM TXPCFORMU WHERE EmprCod = ? and ForNumCol = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               return;
      }
   }

}

