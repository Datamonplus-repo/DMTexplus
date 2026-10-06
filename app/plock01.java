package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock01 extends GXProcedure
{
   public plock01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock01.class ), "" );
   }

   public plock01( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      plock01.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      plock01.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plock01.this.A14AlbComCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04582 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3095AlcDivTCod = P04582_A3095AlcDivTCod[0] ;
         AV8AlcDivTCod = A3095AlcDivTCod ;
         A3095AlcDivTCod = AV8AlcDivTCod ;
         /* Using cursor P04583 */
         pr_default.execute(1, new Object[] {A3095AlcDivTCod, A396EmprCod, Integer.valueOf(A14AlbComCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock01.this.A396EmprCod;
      this.aP1[0] = plock01.this.A14AlbComCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock01");
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
      P04582_A396EmprCod = new String[] {""} ;
      P04582_A14AlbComCod = new int[1] ;
      P04582_A3095AlcDivTCod = new String[] {""} ;
      A3095AlcDivTCod = "" ;
      AV8AlcDivTCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock01__default(),
         new Object[] {
             new Object[] {
            P04582_A396EmprCod, P04582_A14AlbComCod, P04582_A3095AlcDivTCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A14AlbComCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A3095AlcDivTCod ;
   private String AV8AlcDivTCod ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P04582_A396EmprCod ;
   private int[] P04582_A14AlbComCod ;
   private String[] P04582_A3095AlcDivTCod ;
}

final  class plock01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04582", "SELECT EmprCod, AlbComCod, AlcDivTCod FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04583", "UPDATE TXPCALCOM SET AlcDivTCod=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

