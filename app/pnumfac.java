package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumfac extends GXProcedure
{
   public pnumfac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumfac.class ), "" );
   }

   public pnumfac( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 )
   {
      pnumfac.this.aP2 = new int[] {0};
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
      pnumfac.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumfac.this.AV15ContCod = aP1[0];
      this.aP1 = aP1;
      pnumfac.this.AV16FacCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00722 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV15ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A313ContCod = P00722_A313ContCod[0] ;
         A316ContVal = P00722_A316ContVal[0] ;
         AV16FacCod = A316ContVal ;
         A316ContVal = (int)(A316ContVal+1) ;
         /* Using cursor P00723 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A316ContVal), A396EmprCod, A313ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumfac.this.A396EmprCod;
      this.aP1[0] = pnumfac.this.AV15ContCod;
      this.aP2[0] = pnumfac.this.AV16FacCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnumfac");
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
      P00722_A396EmprCod = new String[] {""} ;
      P00722_A313ContCod = new String[] {""} ;
      P00722_A316ContVal = new int[1] ;
      A313ContCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumfac__default(),
         new Object[] {
             new Object[] {
            P00722_A396EmprCod, P00722_A313ContCod, P00722_A316ContVal
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV16FacCod ;
   private int A316ContVal ;
   private String A396EmprCod ;
   private String AV15ContCod ;
   private String scmdbuf ;
   private String A313ContCod ;
   private int[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00722_A396EmprCod ;
   private String[] P00722_A313ContCod ;
   private int[] P00722_A316ContVal ;
}

final  class pnumfac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00722", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00723", "UPDATE TXPEMPLIN SET ContVal=?  WHERE EmprCod = ? AND ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

