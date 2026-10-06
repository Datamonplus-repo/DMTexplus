package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccdef_prxid extends GXProcedure
{
   public controlcalidad_ccdef_prxid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccdef_prxid.class ), "" );
   }

   public controlcalidad_ccdef_prxid( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 )
   {
      controlcalidad_ccdef_prxid.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             int[] aP1 )
   {
      controlcalidad_ccdef_prxid.this.AV9EmprCod = aP0;
      controlcalidad_ccdef_prxid.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AOZ3 */
      pr_default.execute(0, new Object[] {AV9EmprCod});
      if ( (pr_default.getStatus(0) != 101) )
      {
         A40000GXC1 = P0AOZ3_A40000GXC1[0] ;
         n40000GXC1 = P0AOZ3_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = 0 ;
         n40000GXC1 = false ;
      }
      pr_default.close(0);
      AV8Cctcod = (int)(A40000GXC1+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = controlcalidad_ccdef_prxid.this.AV8Cctcod;
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
      P0AOZ3_A40000GXC1 = new int[1] ;
      P0AOZ3_n40000GXC1 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef_prxid__default(),
         new Object[] {
             new Object[] {
            P0AOZ3_A40000GXC1, P0AOZ3_n40000GXC1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8Cctcod ;
   private int A40000GXC1 ;
   private String AV9EmprCod ;
   private String scmdbuf ;
   private boolean n40000GXC1 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P0AOZ3_A40000GXC1 ;
   private boolean[] P0AOZ3_n40000GXC1 ;
}

final  class controlcalidad_ccdef_prxid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AOZ3", "SELECT COALESCE( T1.GXC1, 0) AS GXC1 FROM (SELECT MAX(CCTCod) AS GXC1 FROM TXPCCDef WHERE EmprCod = ? ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               return;
      }
   }

}

