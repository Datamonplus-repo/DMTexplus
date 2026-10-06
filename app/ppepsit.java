package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppepsit extends GXProcedure
{
   public ppepsit( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppepsit.class ), "" );
   }

   public ppepsit( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           long[] aP1 )
   {
      ppepsit.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             byte[] aP2 )
   {
      ppepsit.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppepsit.this.A3814PePCod = aP1[0];
      this.aP1 = aP1;
      ppepsit.this.AV8PePSit = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00TK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A3814PePCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3813PePSit = P00TK2_A3813PePSit[0] ;
         n3813PePSit = P00TK2_n3813PePSit[0] ;
         if ( AV8PePSit == 1 )
         {
            if ( A3813PePSit < 2 )
            {
               A3813PePSit = (byte)(1) ;
               n3813PePSit = false ;
            }
         }
         if ( AV8PePSit == 2 )
         {
            A3813PePSit = (byte)(2) ;
            n3813PePSit = false ;
         }
         if ( AV8PePSit == 0 )
         {
            A3813PePSit = (byte)(0) ;
            n3813PePSit = false ;
         }
         /* Using cursor P00TK3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n3813PePSit), Byte.valueOf(A3813PePSit), A396EmprCod, Long.valueOf(A3814PePCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedPro");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppepsit.this.A396EmprCod;
      this.aP1[0] = ppepsit.this.A3814PePCod;
      this.aP2[0] = ppepsit.this.AV8PePSit;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppepsit");
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
      P00TK2_A396EmprCod = new String[] {""} ;
      P00TK2_A3814PePCod = new long[1] ;
      P00TK2_A3813PePSit = new byte[1] ;
      P00TK2_n3813PePSit = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppepsit__default(),
         new Object[] {
             new Object[] {
            P00TK2_A396EmprCod, P00TK2_A3814PePCod, P00TK2_A3813PePSit, P00TK2_n3813PePSit
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8PePSit ;
   private byte A3813PePSit ;
   private short Gx_err ;
   private long A3814PePCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n3813PePSit ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00TK2_A396EmprCod ;
   private long[] P00TK2_A3814PePCod ;
   private byte[] P00TK2_A3813PePSit ;
   private boolean[] P00TK2_n3813PePSit ;
}

final  class ppepsit__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00TK2", "SELECT EmprCod, PePCod, PePSit FROM TXPPedPro WHERE EmprCod = ? and PePCod = ? ORDER BY EmprCod, PePCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00TK3", "UPDATE TXPPedPro SET PePSit=?  WHERE EmprCod = ? AND PePCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedPro")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
      }
   }

}

