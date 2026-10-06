package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusumed extends GXProcedure
{
   public pbusumed( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusumed.class ), "" );
   }

   public pbusumed( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             byte[] aP1 )
   {
      pbusumed.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             String[] aP2 )
   {
      pbusumed.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusumed.this.AV17ForPrdUMe = aP1[0];
      this.aP1 = aP1;
      pbusumed.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18ForPrdDsc = "" ;
      AV21GXLvl6 = (byte)(0) ;
      /* Using cursor P02972 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(AV17ForPrdUMe)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A490ForPrdUMe = P02972_A490ForPrdUMe[0] ;
         A488ForPrdDsc = P02972_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P02972_n488ForPrdDsc[0] ;
         AV21GXLvl6 = (byte)(1) ;
         AV18ForPrdDsc = A488ForPrdDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV21GXLvl6 == 0 )
      {
         AV18ForPrdDsc = httpContext.getMessage( "Error", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusumed.this.A396EmprCod;
      this.aP1[0] = pbusumed.this.AV17ForPrdUMe;
      this.aP2[0] = pbusumed.this.AV18ForPrdDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18ForPrdDsc = "" ;
      scmdbuf = "" ;
      P02972_A396EmprCod = new String[] {""} ;
      P02972_A490ForPrdUMe = new byte[1] ;
      P02972_A488ForPrdDsc = new String[] {""} ;
      P02972_n488ForPrdDsc = new boolean[] {false} ;
      A488ForPrdDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusumed__default(),
         new Object[] {
             new Object[] {
            P02972_A396EmprCod, P02972_A490ForPrdUMe, P02972_A488ForPrdDsc, P02972_n488ForPrdDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17ForPrdUMe ;
   private byte AV21GXLvl6 ;
   private byte A490ForPrdUMe ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV18ForPrdDsc ;
   private String scmdbuf ;
   private String A488ForPrdDsc ;
   private boolean n488ForPrdDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02972_A396EmprCod ;
   private byte[] P02972_A490ForPrdUMe ;
   private String[] P02972_A488ForPrdDsc ;
   private boolean[] P02972_n488ForPrdDsc ;
}

final  class pbusumed__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02972", "SELECT EmprCod, ForPrdUMe, ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? and ForPrdUMe = ? ORDER BY EmprCod, ForPrdUMe ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

