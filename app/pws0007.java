package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pws0007 extends GXProcedure
{
   public pws0007( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pws0007.class ), "" );
   }

   public pws0007( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 )
   {
      pws0007.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 )
   {
      pws0007.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pws0007.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pws0007.this.AV8AlbMarca = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8AlbMarca = "" ;
      /* Using cursor P042L2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5140AlbMarca = P042L2_A5140AlbMarca[0] ;
         AV8AlbMarca = A5140AlbMarca ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pws0007.this.A396EmprCod;
      this.aP1[0] = pws0007.this.A30AlbProCod;
      this.aP2[0] = pws0007.this.AV8AlbMarca;
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
      P042L2_A396EmprCod = new String[] {""} ;
      P042L2_A30AlbProCod = new long[1] ;
      P042L2_A5140AlbMarca = new String[] {""} ;
      A5140AlbMarca = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pws0007__default(),
         new Object[] {
             new Object[] {
            P042L2_A396EmprCod, P042L2_A30AlbProCod, P042L2_A5140AlbMarca
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV8AlbMarca ;
   private String scmdbuf ;
   private String A5140AlbMarca ;
   private String[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P042L2_A396EmprCod ;
   private long[] P042L2_A30AlbProCod ;
   private String[] P042L2_A5140AlbMarca ;
}

final  class pws0007__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P042L2", "SELECT EmprCod, AlbProCod, AlbMarca FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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

