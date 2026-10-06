package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pobtlit extends GXProcedure
{
   public pobtlit( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pobtlit.class ), "" );
   }

   public pobtlit( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             byte aP1 )
   {
      pobtlit.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             String[] aP2 )
   {
      pobtlit.this.AV15TxtCod = aP0;
      pobtlit.this.AV17TxtLon = aP1;
      pobtlit.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16TxtLit = "" ;
      AV15TxtCod = GXutil.upper( AV15TxtCod) ;
      /* Using cursor P00012 */
      pr_default.execute(0, new Object[] {AV15TxtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A842TxtCod = P00012_A842TxtCod[0] ;
         A844TxtLon = P00012_A844TxtLon[0] ;
         n844TxtLon = P00012_n844TxtLon[0] ;
         A843TxtLit = P00012_A843TxtLit[0] ;
         n843TxtLit = P00012_n843TxtLit[0] ;
         if ( AV17TxtLon == 99 )
         {
            AV16TxtLit = GXutil.substring( A843TxtLit, 1, A844TxtLon) ;
         }
         else
         {
            AV16TxtLit = A843TxtLit ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ! ( (GXutil.strcmp("", AV16TxtLit)==0) ) )
      {
         if ( AV17TxtLon != 99 )
         {
            AV18TxtSav = GXutil.concat( AV16TxtLit, "....................", "") ;
            AV17TxtLon = (byte)(AV17TxtLon-1) ;
            AV18TxtSav = GXutil.substring( AV18TxtSav, 1, AV17TxtLon) ;
            AV18TxtSav = GXutil.concat( AV18TxtSav, ":", "") ;
            AV17TxtLon = (byte)(AV17TxtLon+1) ;
            AV16TxtLit = GXutil.substring( AV18TxtSav, 1, AV17TxtLon) ;
         }
      }
      else
      {
         AV16TxtLit = AV15TxtCod ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pobtlit.this.AV16TxtLit;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16TxtLit = "" ;
      scmdbuf = "" ;
      P00012_A842TxtCod = new String[] {""} ;
      P00012_A844TxtLon = new byte[1] ;
      P00012_n844TxtLon = new boolean[] {false} ;
      P00012_A843TxtLit = new String[] {""} ;
      P00012_n843TxtLit = new boolean[] {false} ;
      A842TxtCod = "" ;
      A843TxtLit = "" ;
      AV18TxtSav = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.pobtlit__default(),
         new Object[] {
             new Object[] {
            P00012_A842TxtCod, P00012_A844TxtLon, P00012_n844TxtLon, P00012_A843TxtLit, P00012_n843TxtLit
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17TxtLon ;
   private byte A844TxtLon ;
   private short Gx_err ;
   private String AV15TxtCod ;
   private String AV16TxtLit ;
   private String scmdbuf ;
   private String A842TxtCod ;
   private String A843TxtLit ;
   private String AV18TxtSav ;
   private boolean n844TxtLon ;
   private boolean n843TxtLit ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00012_A842TxtCod ;
   private byte[] P00012_A844TxtLon ;
   private boolean[] P00012_n844TxtLon ;
   private String[] P00012_A843TxtLit ;
   private boolean[] P00012_n843TxtLit ;
}

final  class pobtlit__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00012", "SELECT TxtCod, TxtLon, TxtLit FROM TXPIDIOMA WHERE TxtCod = ? ORDER BY TxtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 70);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 10);
               return;
      }
   }

}

