package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpfasproupdateredundancy extends GXProcedure
{
   public txpfasproupdateredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpfasproupdateredundancy.class ), "" );
   }

   public txpfasproupdateredundancy( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      txpfasproupdateredundancy.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      txpfasproupdateredundancy.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      txpfasproupdateredundancy.this.A457FasCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor TXPFASPROU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7744FasPreObl = TXPFASPROU2_A7744FasPreObl[0] ;
         n7744FasPreObl = TXPFASPROU2_n7744FasPreObl[0] ;
         AV2GXV7744 = A7744FasPreObl ;
         n7744FasPreObl = false ;
         /* Optimized UPDATE. */
         /* Using cursor TXPFASPROU3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(AV2GXV7744), A396EmprCod, A457FasCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
         /* End optimized UPDATE. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = txpfasproupdateredundancy.this.A396EmprCod;
      this.aP1[0] = txpfasproupdateredundancy.this.A457FasCod;
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
      TXPFASPROU2_A396EmprCod = new String[] {""} ;
      TXPFASPROU2_A457FasCod = new String[] {""} ;
      TXPFASPROU2_A7744FasPreObl = new byte[1] ;
      TXPFASPROU2_n7744FasPreObl = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpfasproupdateredundancy__default(),
         new Object[] {
             new Object[] {
            TXPFASPROU2_A396EmprCod, TXPFASPROU2_A457FasCod, TXPFASPROU2_A7744FasPreObl, TXPFASPROU2_n7744FasPreObl
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A7744FasPreObl ;
   private byte AV2GXV7744 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String scmdbuf ;
   private boolean n7744FasPreObl ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] TXPFASPROU2_A396EmprCod ;
   private String[] TXPFASPROU2_A457FasCod ;
   private byte[] TXPFASPROU2_A7744FasPreObl ;
   private boolean[] TXPFASPROU2_n7744FasPreObl ;
}

final  class txpfasproupdateredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPFASPROU2", "SELECT EmprCod, FasCod, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("TXPFASPROU3", "UPDATE TXPDISFAS SET FasPreObl=?  WHERE EmprCod = ? and FasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
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
               stmt.setString(2, (String)parms[1], 8);
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
               stmt.setString(3, (String)parms[3], 8);
               return;
      }
   }

}

