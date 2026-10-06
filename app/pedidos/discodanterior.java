package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class discodanterior extends GXProcedure
{
   public discodanterior( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( discodanterior.class ), "" );
   }

   public discodanterior( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 )
   {
      discodanterior.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int[] aP2 )
   {
      discodanterior.this.AV8EmprCod = aP0;
      discodanterior.this.AV9DisCod = aP1;
      discodanterior.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0A833 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9DisCod)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         A40000GXC1 = P0A833_A40000GXC1[0] ;
         n40000GXC1 = P0A833_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = 0 ;
         n40000GXC1 = false ;
      }
      pr_default.close(0);
      AV12Anterior_Discod = A40000GXC1 ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = discodanterior.this.AV12Anterior_Discod;
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
      P0A833_A40000GXC1 = new int[1] ;
      P0A833_n40000GXC1 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.discodanterior__default(),
         new Object[] {
             new Object[] {
            P0A833_A40000GXC1, P0A833_n40000GXC1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9DisCod ;
   private int AV12Anterior_Discod ;
   private int A40000GXC1 ;
   private String AV8EmprCod ;
   private String scmdbuf ;
   private boolean n40000GXC1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P0A833_A40000GXC1 ;
   private boolean[] P0A833_n40000GXC1 ;
}

final  class discodanterior__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A833", "SELECT COALESCE( T1.GXC1, 0) AS GXC1 FROM (SELECT DisCod AS GXC1, EmprCod, DisCod FROM TXPDISPOS WHERE (EmprCod = ?) AND (DisCod = ?) ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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

