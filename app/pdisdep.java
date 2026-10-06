package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisdep extends GXProcedure
{
   public pdisdep( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisdep.class ), "" );
   }

   public pdisdep( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 )
   {
      pdisdep.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      pdisdep.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisdep.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdisdep.this.AV14DisPiePie = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14DisPiePie = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P01UG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      cV14DisPiePie = P01UG2_AV14DisPiePie[0] ;
      pr_default.close(0);
      AV14DisPiePie = (short)(AV14DisPiePie+cV14DisPiePie*1) ;
      /* End optimized group. */
      if ( AV14DisPiePie == 0 )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A361DisCod ;
         new app.pdisalbd(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
         pdisdep.this.A396EmprCod = GXv_char1[0] ;
         pdisdep.this.A361DisCod = GXv_int2[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisdep.this.A396EmprCod;
      this.aP1[0] = pdisdep.this.A361DisCod;
      this.aP2[0] = pdisdep.this.AV14DisPiePie;
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
      P01UG2_AV14DisPiePie = new short[1] ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisdep__default(),
         new Object[] {
             new Object[] {
            P01UG2_AV14DisPiePie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV14DisPiePie ;
   private short cV14DisPiePie ;
   private short Gx_err ;
   private int A361DisCod ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String GXv_char1[] ;
   private short[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P01UG2_AV14DisPiePie ;
}

final  class pdisdep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01UG2", "SELECT COUNT(*) FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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

