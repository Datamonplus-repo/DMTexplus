package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class get_forprddsc extends GXProcedure
{
   public get_forprddsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( get_forprddsc.class ), "" );
   }

   public get_forprddsc( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             byte aP1 )
   {
      get_forprddsc.this.aP2 = new String[] {""};
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
      get_forprddsc.this.A396EmprCod = aP0;
      get_forprddsc.this.A490ForPrdUMe = aP1;
      get_forprddsc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ForPrdDsc = "" ;
      AV11GXLvl3 = (byte)(0) ;
      /* Using cursor P0AL72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A488ForPrdDsc = P0AL72_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AL72_n488ForPrdDsc[0] ;
         AV11GXLvl3 = (byte)(1) ;
         AV8ForPrdDsc = A488ForPrdDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl3 == 0 )
      {
         AV8ForPrdDsc = httpContext.getMessage( "Error", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = get_forprddsc.this.AV8ForPrdDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8ForPrdDsc = "" ;
      scmdbuf = "" ;
      P0AL72_A396EmprCod = new String[] {""} ;
      P0AL72_A490ForPrdUMe = new byte[1] ;
      P0AL72_A488ForPrdDsc = new String[] {""} ;
      P0AL72_n488ForPrdDsc = new boolean[] {false} ;
      A488ForPrdDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.get_forprddsc__default(),
         new Object[] {
             new Object[] {
            P0AL72_A396EmprCod, P0AL72_A490ForPrdUMe, P0AL72_A488ForPrdDsc, P0AL72_n488ForPrdDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A490ForPrdUMe ;
   private byte AV11GXLvl3 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8ForPrdDsc ;
   private String scmdbuf ;
   private String A488ForPrdDsc ;
   private boolean n488ForPrdDsc ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AL72_A396EmprCod ;
   private byte[] P0AL72_A490ForPrdUMe ;
   private String[] P0AL72_A488ForPrdDsc ;
   private boolean[] P0AL72_n488ForPrdDsc ;
}

final  class get_forprddsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AL72", "SELECT EmprCod, ForPrdUMe, ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? and ForPrdUMe = ? ORDER BY EmprCod, ForPrdUMe ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

