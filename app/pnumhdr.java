package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumhdr extends GXProcedure
{
   public pnumhdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumhdr.class ), "" );
   }

   public pnumhdr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          long[] aP1 )
   {
      pnumhdr.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 )
   {
      pnumhdr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumhdr.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pnumhdr.this.AV8NumLin = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8NumLin = 0 ;
      /* Optimized group. */
      /* Using cursor P01KM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      cV8NumLin = P01KM2_AV8NumLin[0] ;
      pr_default.close(0);
      AV8NumLin = (int)(AV8NumLin+cV8NumLin*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumhdr.this.A396EmprCod;
      this.aP1[0] = pnumhdr.this.A30AlbProCod;
      this.aP2[0] = pnumhdr.this.AV8NumLin;
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
      P01KM2_AV8NumLin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumhdr__default(),
         new Object[] {
             new Object[] {
            P01KM2_AV8NumLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8NumLin ;
   private int cV8NumLin ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private int[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P01KM2_AV8NumLin ;
}

final  class pnumhdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01KM2", "SELECT COUNT(*) FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

