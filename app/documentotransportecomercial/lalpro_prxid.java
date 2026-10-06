package app.documentotransportecomercial ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class lalpro_prxid extends GXProcedure
{
   public lalpro_prxid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lalpro_prxid.class ), "" );
   }

   public lalpro_prxid( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 )
   {
      lalpro_prxid.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short[] aP2 )
   {
      lalpro_prxid.this.AV10EmprCod = aP0;
      lalpro_prxid.this.AV12AlbProID = aP1;
      lalpro_prxid.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AIG3 */
      pr_default.execute(0, new Object[] {AV10EmprCod, Integer.valueOf(AV12AlbProID)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         A40000GXC1 = P0AIG3_A40000GXC1[0] ;
         n40000GXC1 = P0AIG3_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = (short)(0) ;
         n40000GXC1 = false ;
      }
      pr_default.close(0);
      AV11AlbProLinea = (short)(A40000GXC1+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = lalpro_prxid.this.AV11AlbProLinea;
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
      P0AIG3_A40000GXC1 = new short[1] ;
      P0AIG3_n40000GXC1 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.lalpro_prxid__default(),
         new Object[] {
             new Object[] {
            P0AIG3_A40000GXC1, P0AIG3_n40000GXC1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV11AlbProLinea ;
   private short A40000GXC1 ;
   private short Gx_err ;
   private int AV12AlbProID ;
   private String AV10EmprCod ;
   private String scmdbuf ;
   private boolean n40000GXC1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P0AIG3_A40000GXC1 ;
   private boolean[] P0AIG3_n40000GXC1 ;
}

final  class lalpro_prxid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AIG3", "SELECT COALESCE( T1.GXC1, 0) AS GXC1 FROM (SELECT MAX(AlbProLine) AS GXC1 FROM TXPLALPRO WHERE (EmprCod = ?) AND (AlbProID = ?) ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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

