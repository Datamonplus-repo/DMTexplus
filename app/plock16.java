package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock16 extends GXProcedure
{
   public plock16( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock16.class ), "" );
   }

   public plock16( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      plock16.this.aP1 = new String[] {""};
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
      plock16.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plock16.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04AP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A601MaqChp = P04AP2_A601MaqChp[0] ;
         n601MaqChp = P04AP2_n601MaqChp[0] ;
         AV14MaqChp = A601MaqChp ;
         A601MaqChp = AV14MaqChp ;
         n601MaqChp = false ;
         /* Using cursor P04AP3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n601MaqChp), A601MaqChp, A396EmprCod, A602MaqCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock16.this.A396EmprCod;
      this.aP1[0] = plock16.this.A602MaqCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock16");
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
      P04AP2_A396EmprCod = new String[] {""} ;
      P04AP2_A602MaqCod = new String[] {""} ;
      P04AP2_A601MaqChp = new String[] {""} ;
      P04AP2_n601MaqChp = new boolean[] {false} ;
      A601MaqChp = "" ;
      AV14MaqChp = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock16__default(),
         new Object[] {
             new Object[] {
            P04AP2_A396EmprCod, P04AP2_A602MaqCod, P04AP2_A601MaqChp, P04AP2_n601MaqChp
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String scmdbuf ;
   private String A601MaqChp ;
   private String AV14MaqChp ;
   private boolean n601MaqChp ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P04AP2_A396EmprCod ;
   private String[] P04AP2_A602MaqCod ;
   private String[] P04AP2_A601MaqChp ;
   private boolean[] P04AP2_n601MaqChp ;
}

final  class plock16__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04AP2", "SELECT EmprCod, MaqCod, MaqChp FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04AP3", "UPDATE TXPMAQUIN SET MaqChp=?  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQUIN")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               return;
      }
   }

}

