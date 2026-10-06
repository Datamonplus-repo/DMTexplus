package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plinproc extends GXProcedure
{
   public plinproc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plinproc.class ), "" );
   }

   public plinproc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 )
   {
      plinproc.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      plinproc.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      plinproc.this.AV16ProCod = aP1[0];
      this.aP1 = aP1;
      plinproc.this.AV17ProNumLin = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01LR2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV16ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P01LR2_A764ProForCod[0] ;
         A396EmprCod = P01LR2_A396EmprCod[0] ;
         A5190ProFoLCU = P01LR2_A5190ProFoLCU[0] ;
         n5190ProFoLCU = P01LR2_n5190ProFoLCU[0] ;
         if ( ( A5190ProFoLCU + 100 ) <= 9900 )
         {
            A5190ProFoLCU = (short)(A5190ProFoLCU+100) ;
            n5190ProFoLCU = false ;
            AV17ProNumLin = A5190ProFoLCU ;
         }
         else
         {
            AV17ProNumLin = (short)(9999) ;
         }
         /* Using cursor P01LR3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n5190ProFoLCU), Short.valueOf(A5190ProFoLCU), A396EmprCod, A764ProForCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plinproc.this.AV15EmprCod;
      this.aP1[0] = plinproc.this.AV16ProCod;
      this.aP2[0] = plinproc.this.AV17ProNumLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "plinproc");
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
      P01LR2_A764ProForCod = new String[] {""} ;
      P01LR2_A396EmprCod = new String[] {""} ;
      P01LR2_A5190ProFoLCU = new short[1] ;
      P01LR2_n5190ProFoLCU = new boolean[] {false} ;
      A764ProForCod = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plinproc__default(),
         new Object[] {
             new Object[] {
            P01LR2_A764ProForCod, P01LR2_A396EmprCod, P01LR2_A5190ProFoLCU, P01LR2_n5190ProFoLCU
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV17ProNumLin ;
   private short A5190ProFoLCU ;
   private short Gx_err ;
   private String AV15EmprCod ;
   private String AV16ProCod ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String A396EmprCod ;
   private boolean n5190ProFoLCU ;
   private short[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01LR2_A764ProForCod ;
   private String[] P01LR2_A396EmprCod ;
   private short[] P01LR2_A5190ProFoLCU ;
   private boolean[] P01LR2_n5190ProFoLCU ;
}

final  class plinproc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01LR2", "SELECT ProForCod, EmprCod, ProFoLCU FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01LR3", "UPDATE TXPCPROFO SET ProFoLCU=?  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPROFO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               return;
      }
   }

}

