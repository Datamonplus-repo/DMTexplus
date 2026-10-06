package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptaesdc extends GXProcedure
{
   public ptaesdc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptaesdc.class ), "" );
   }

   public ptaesdc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      ptaesdc.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      ptaesdc.this.A396EmprCod = aP0;
      ptaesdc.this.A11634TaesId = aP1;
      ptaesdc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8TaesDc = "" ;
      AV11GXLvl2 = (byte)(0) ;
      /* Using cursor P04UP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A11634TaesId});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11635TaesDc = P04UP2_A11635TaesDc[0] ;
         n11635TaesDc = P04UP2_n11635TaesDc[0] ;
         AV11GXLvl2 = (byte)(1) ;
         AV8TaesDc = A11635TaesDc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl2 == 0 )
      {
         AV8TaesDc = httpContext.getMessage( "Error", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = ptaesdc.this.AV8TaesDc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8TaesDc = "" ;
      scmdbuf = "" ;
      P04UP2_A396EmprCod = new String[] {""} ;
      P04UP2_A11634TaesId = new String[] {""} ;
      P04UP2_A11635TaesDc = new String[] {""} ;
      P04UP2_n11635TaesDc = new boolean[] {false} ;
      A11635TaesDc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptaesdc__default(),
         new Object[] {
             new Object[] {
            P04UP2_A396EmprCod, P04UP2_A11634TaesId, P04UP2_A11635TaesDc, P04UP2_n11635TaesDc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl2 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A11634TaesId ;
   private String AV8TaesDc ;
   private String scmdbuf ;
   private String A11635TaesDc ;
   private boolean n11635TaesDc ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04UP2_A396EmprCod ;
   private String[] P04UP2_A11634TaesId ;
   private String[] P04UP2_A11635TaesDc ;
   private boolean[] P04UP2_n11635TaesDc ;
}

final  class ptaesdc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04UP2", "SELECT EmprCod, TaesId, TaesDc FROM TXPTAES00 WHERE EmprCod = ? and TaesId = ? ORDER BY EmprCod, TaesId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 80);
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
      }
   }

}

