package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnummlh extends GXProcedure
{
   public pnummlh( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnummlh.class ), "" );
   }

   public pnummlh( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 )
   {
      pnummlh.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      pnummlh.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnummlh.this.A6067Inv_ArtCod = aP1[0];
      this.aP1 = aP1;
      pnummlh.this.AV9Inv_lin = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02G52 */
      pr_default.execute(0, new Object[] {A396EmprCod, A6067Inv_ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6406Inv_UltLin = P02G52_A6406Inv_UltLin[0] ;
         n6406Inv_UltLin = P02G52_n6406Inv_UltLin[0] ;
         if ( ( A6406Inv_UltLin + 1 ) <= 999999 )
         {
            A6406Inv_UltLin = (int)(A6406Inv_UltLin+1) ;
            n6406Inv_UltLin = false ;
            AV9Inv_lin = A6406Inv_UltLin ;
         }
         else
         {
            AV9Inv_lin = 999 ;
         }
         /* Using cursor P02G53 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n6406Inv_UltLin), Integer.valueOf(A6406Inv_UltLin), A396EmprCod, A6067Inv_ArtCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINVMAC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnummlh.this.A396EmprCod;
      this.aP1[0] = pnummlh.this.A6067Inv_ArtCod;
      this.aP2[0] = pnummlh.this.AV9Inv_lin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnummlh");
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
      P02G52_A396EmprCod = new String[] {""} ;
      P02G52_A6067Inv_ArtCod = new String[] {""} ;
      P02G52_A6406Inv_UltLin = new int[1] ;
      P02G52_n6406Inv_UltLin = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnummlh__default(),
         new Object[] {
             new Object[] {
            P02G52_A396EmprCod, P02G52_A6067Inv_ArtCod, P02G52_A6406Inv_UltLin, P02G52_n6406Inv_UltLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9Inv_lin ;
   private int A6406Inv_UltLin ;
   private String A396EmprCod ;
   private String A6067Inv_ArtCod ;
   private String scmdbuf ;
   private boolean n6406Inv_UltLin ;
   private int[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02G52_A396EmprCod ;
   private String[] P02G52_A6067Inv_ArtCod ;
   private int[] P02G52_A6406Inv_UltLin ;
   private boolean[] P02G52_n6406Inv_UltLin ;
}

final  class pnummlh__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02G52", "SELECT EmprCod, Inv_ArtCod, Inv_UltLin FROM TXPINVMAC WHERE EmprCod = ? and Inv_ArtCod = ? ORDER BY EmprCod, Inv_ArtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02G53", "UPDATE TXPINVMAC SET Inv_UltLin=?  WHERE EmprCod = ? AND Inv_ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINVMAC")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setString(2, (String)parms[1], 16);
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
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               return;
      }
   }

}

