package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class existenprograma extends GXProcedure
{
   public existenprograma( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( existenprograma.class ), "" );
   }

   public existenprograma( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            String aP1 )
   {
      existenprograma.this.aP2 = new short[] {0};
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
      existenprograma.this.A396EmprCod = aP0;
      existenprograma.this.A1514MacProCod = aP1;
      existenprograma.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Error = (short)(1) ;
      AV11GXLvl3 = (byte)(0) ;
      /* Using cursor P09ZL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1514MacProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV11GXLvl3 = (byte)(1) ;
         AV8Error = (short)(0) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl3 == 0 )
      {
         AV8Error = (short)(((GXutil.strcmp("", A1514MacProCod)==0) ? 0 : 1)) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = existenprograma.this.AV8Error;
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
      P09ZL2_A396EmprCod = new String[] {""} ;
      P09ZL2_A1514MacProCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.existenprograma__default(),
         new Object[] {
             new Object[] {
            P09ZL2_A396EmprCod, P09ZL2_A1514MacProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl3 ;
   private short AV8Error ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A1514MacProCod ;
   private String scmdbuf ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P09ZL2_A396EmprCod ;
   private String[] P09ZL2_A1514MacProCod ;
}

final  class existenprograma__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ZL2", "SELECT EmprCod, MacProCod FROM TXPCMACPR WHERE EmprCod = ? and MacProCod = ? ORDER BY EmprCod, MacProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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

