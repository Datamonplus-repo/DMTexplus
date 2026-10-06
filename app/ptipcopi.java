package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptipcopi extends GXProcedure
{
   public ptipcopi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptipcopi.class ), "" );
   }

   public ptipcopi( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           byte[] aP1 ,
                           byte[] aP2 )
   {
      ptipcopi.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        byte[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             byte[] aP2 ,
                             byte[] aP3 )
   {
      ptipcopi.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptipcopi.this.A831TipColCod = aP1[0];
      this.aP1 = aP1;
      ptipcopi.this.AV8TipColCtb = aP2[0];
      this.aP2 = aP2;
      ptipcopi.this.AV9Opcion = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P022D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5251TipColCtb = P022D2_A5251TipColCtb[0] ;
         n5251TipColCtb = P022D2_n5251TipColCtb[0] ;
         A5251TipColCtb = AV9Opcion ;
         n5251TipColCtb = false ;
         AV8TipColCtb = A5251TipColCtb ;
         /* Using cursor P022D3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n5251TipColCtb), Byte.valueOf(A5251TipColCtb), A396EmprCod, Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPCOL");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptipcopi.this.A396EmprCod;
      this.aP1[0] = ptipcopi.this.A831TipColCod;
      this.aP2[0] = ptipcopi.this.AV8TipColCtb;
      this.aP3[0] = ptipcopi.this.AV9Opcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptipcopi");
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
      P022D2_A396EmprCod = new String[] {""} ;
      P022D2_A831TipColCod = new byte[1] ;
      P022D2_A5251TipColCtb = new byte[1] ;
      P022D2_n5251TipColCtb = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptipcopi__default(),
         new Object[] {
             new Object[] {
            P022D2_A396EmprCod, P022D2_A831TipColCod, P022D2_A5251TipColCtb, P022D2_n5251TipColCtb
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV8TipColCtb ;
   private byte AV9Opcion ;
   private byte A5251TipColCtb ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n5251TipColCtb ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P022D2_A396EmprCod ;
   private byte[] P022D2_A831TipColCod ;
   private byte[] P022D2_A5251TipColCtb ;
   private boolean[] P022D2_n5251TipColCtb ;
}

final  class ptipcopi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P022D2", "SELECT EmprCod, TipColCod, TipColCtb FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P022D3", "UPDATE TXPTIPCOL SET TipColCtb=?  WHERE EmprCod = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTIPCOL")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

