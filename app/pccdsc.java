package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccdsc extends GXProcedure
{
   public pccdsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccdsc.class ), "" );
   }

   public pccdsc( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( short[] aP0 )
   {
      pccdsc.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( short[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( short[] aP0 ,
                             String[] aP1 )
   {
      pccdsc.this.A3839CcoCod = aP0[0];
      this.aP0 = aP0;
      pccdsc.this.AV8Ccodsc = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ccodsc = " " ;
      AV11GXLvl4 = (byte)(0) ;
      /* Using cursor P043I2 */
      pr_default.execute(0, new Object[] {Short.valueOf(A3839CcoCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3840CcoDsc = P043I2_A3840CcoDsc[0] ;
         n3840CcoDsc = P043I2_n3840CcoDsc[0] ;
         AV11GXLvl4 = (byte)(1) ;
         AV8Ccodsc = A3840CcoDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl4 == 0 )
      {
         AV8Ccodsc = httpContext.getMessage( "Error", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccdsc.this.A3839CcoCod;
      this.aP1[0] = pccdsc.this.AV8Ccodsc;
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
      P043I2_A3839CcoCod = new short[1] ;
      P043I2_A3840CcoDsc = new String[] {""} ;
      P043I2_n3840CcoDsc = new boolean[] {false} ;
      A3840CcoDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pccdsc__default(),
         new Object[] {
             new Object[] {
            P043I2_A3839CcoCod, P043I2_A3840CcoDsc, P043I2_n3840CcoDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl4 ;
   private short A3839CcoCod ;
   private short Gx_err ;
   private String AV8Ccodsc ;
   private String scmdbuf ;
   private String A3840CcoDsc ;
   private boolean n3840CcoDsc ;
   private String[] aP1 ;
   private short[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P043I2_A3839CcoCod ;
   private String[] P043I2_A3840CcoDsc ;
   private boolean[] P043I2_n3840CcoDsc ;
}

final  class pccdsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P043I2", "SELECT CcoCod, CcoDsc FROM TXPCENTCO WHERE CcoCod = ? ORDER BY CcoCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

