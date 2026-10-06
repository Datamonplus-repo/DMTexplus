package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpoperaupdateredundancy extends GXProcedure
{
   public txpoperaupdateredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpoperaupdateredundancy.class ), "" );
   }

   public txpoperaupdateredundancy( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( )
   {
      txpoperaupdateredundancy.this.aP0 = new int[] {0};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( int[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( int[] aP0 )
   {
      txpoperaupdateredundancy.this.A3079CodOpe = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor TXPOPERAUP2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n3079CodOpe), Integer.valueOf(A3079CodOpe)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3081CodOpeTip = TXPOPERAUP2_A3081CodOpeTip[0] ;
         n3081CodOpeTip = TXPOPERAUP2_n3081CodOpeTip[0] ;
         /* Using cursor TXPOPERAUP3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n3079CodOpe), Integer.valueOf(A3079CodOpe)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3090HojMaqTip = TXPOPERAUP3_A3090HojMaqTip[0] ;
            A3078HojMaqCod = TXPOPERAUP3_A3078HojMaqCod[0] ;
            A3090HojMaqTip = A3081CodOpeTip ;
            /* Using cursor TXPOPERAUP4 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A3090HojMaqTip), Integer.valueOf(A3078HojMaqCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHojaMa");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = txpoperaupdateredundancy.this.A3079CodOpe;
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
      TXPOPERAUP2_A3079CodOpe = new int[1] ;
      TXPOPERAUP2_n3079CodOpe = new boolean[] {false} ;
      TXPOPERAUP2_A3081CodOpeTip = new byte[1] ;
      TXPOPERAUP2_n3081CodOpeTip = new boolean[] {false} ;
      TXPOPERAUP3_A3079CodOpe = new int[1] ;
      TXPOPERAUP3_n3079CodOpe = new boolean[] {false} ;
      TXPOPERAUP3_A3090HojMaqTip = new byte[1] ;
      TXPOPERAUP3_A3078HojMaqCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpoperaupdateredundancy__default(),
         new Object[] {
             new Object[] {
            TXPOPERAUP2_A3079CodOpe, TXPOPERAUP2_A3081CodOpeTip, TXPOPERAUP2_n3081CodOpeTip
            }
            , new Object[] {
            TXPOPERAUP3_A3079CodOpe, TXPOPERAUP3_n3079CodOpe, TXPOPERAUP3_A3090HojMaqTip, TXPOPERAUP3_A3078HojMaqCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3081CodOpeTip ;
   private byte A3090HojMaqTip ;
   private short Gx_err ;
   private int A3079CodOpe ;
   private int A3078HojMaqCod ;
   private String scmdbuf ;
   private boolean n3079CodOpe ;
   private boolean n3081CodOpeTip ;
   private int[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] TXPOPERAUP2_A3079CodOpe ;
   private boolean[] TXPOPERAUP2_n3079CodOpe ;
   private byte[] TXPOPERAUP2_A3081CodOpeTip ;
   private boolean[] TXPOPERAUP2_n3081CodOpeTip ;
   private int[] TXPOPERAUP3_A3079CodOpe ;
   private boolean[] TXPOPERAUP3_n3079CodOpe ;
   private byte[] TXPOPERAUP3_A3090HojMaqTip ;
   private int[] TXPOPERAUP3_A3078HojMaqCod ;
}

final  class txpoperaupdateredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPOPERAUP2", "SELECT CodOpe, CodOpeTip FROM TXPOPERA WHERE CodOpe = ? ORDER BY CodOpe ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("TXPOPERAUP3", "SELECT CodOpe, HojMaqTip, HojMaqCod FROM TXPHojaMa WHERE CodOpe = ? ORDER BY CodOpe  FOR UPDATE OF HojMaqTip NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("TXPOPERAUP4", "UPDATE TXPHojaMa SET HojMaqTip=?  WHERE HojMaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHojaMa")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

