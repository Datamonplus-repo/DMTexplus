package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class procesoquimico_prxlinea extends GXProcedure
{
   public procesoquimico_prxlinea( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesoquimico_prxlinea.class ), "" );
   }

   public procesoquimico_prxlinea( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            String aP1 )
   {
      procesoquimico_prxlinea.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             short[] aP2 )
   {
      procesoquimico_prxlinea.this.AV8EmprCod = aP0;
      procesoquimico_prxlinea.this.AV9Proforcod = aP1;
      procesoquimico_prxlinea.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09T63 */
      pr_default.execute(0, new Object[] {AV8EmprCod, AV9Proforcod});
      if ( (pr_default.getStatus(0) != 101) )
      {
         A40000GXC1 = P09T63_A40000GXC1[0] ;
         n40000GXC1 = P09T63_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = (short)(0) ;
         n40000GXC1 = false ;
      }
      pr_default.close(0);
      AV10ProForLin = (short)(A40000GXC1+100) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = procesoquimico_prxlinea.this.AV10ProForLin;
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
      P09T63_A40000GXC1 = new short[1] ;
      P09T63_n40000GXC1 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_prxlinea__default(),
         new Object[] {
             new Object[] {
            P09T63_A40000GXC1, P09T63_n40000GXC1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10ProForLin ;
   private short A40000GXC1 ;
   private short Gx_err ;
   private String AV8EmprCod ;
   private String AV9Proforcod ;
   private String scmdbuf ;
   private boolean n40000GXC1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P09T63_A40000GXC1 ;
   private boolean[] P09T63_n40000GXC1 ;
}

final  class procesoquimico_prxlinea__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09T63", "SELECT COALESCE( T1.GXC1, 0) AS GXC1 FROM (SELECT MAX(ProForLin) AS GXC1 FROM TXPLPROFO WHERE (EmprCod = ?) AND (ProForCod = ?) ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

