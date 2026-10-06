package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusclas extends GXProcedure
{
   public pbusclas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusclas.class ), "" );
   }

   public pbusclas( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           short[] aP1 )
   {
      pbusclas.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             byte[] aP2 )
   {
      pbusclas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusclas.this.A4295ClasCod = aP1[0];
      this.aP1 = aP1;
      pbusclas.this.AV15Flag = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01BZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4295ClasCod)});
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
      this.aP0[0] = pbusclas.this.A396EmprCod;
      this.aP1[0] = pbusclas.this.A4295ClasCod;
      this.aP2[0] = pbusclas.this.AV15Flag;
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
      P01BZ2_A396EmprCod = new String[] {""} ;
      P01BZ2_A4295ClasCod = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusclas__default(),
         new Object[] {
             new Object[] {
            P01BZ2_A396EmprCod, P01BZ2_A4295ClasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag ;
   private short A4295ClasCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01BZ2_A396EmprCod ;
   private short[] P01BZ2_A4295ClasCod ;
}

final  class pbusclas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01BZ2", "SELECT EmprCod, ClasCod FROM TXPCLAPEN WHERE EmprCod = ? and ClasCod = ? ORDER BY EmprCod, ClasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

