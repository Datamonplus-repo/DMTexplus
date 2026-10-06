package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexitippr extends GXProcedure
{
   public pexitippr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexitippr.class ), "" );
   }

   public pexitippr( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 )
   {
      pexitippr.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 )
   {
      pexitippr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexitippr.this.A6301TipPrdCod = aP1[0];
      this.aP1 = aP1;
      pexitippr.this.AV8TipPrdDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8TipPrdDsc = httpContext.getMessage( "Error", "") ;
      /* Using cursor P03EZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A6301TipPrdCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6302TipPrdDsc = P03EZ2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P03EZ2_n6302TipPrdDsc[0] ;
         AV8TipPrdDsc = A6302TipPrdDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexitippr.this.A396EmprCod;
      this.aP1[0] = pexitippr.this.A6301TipPrdCod;
      this.aP2[0] = pexitippr.this.AV8TipPrdDsc;
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
      P03EZ2_A396EmprCod = new String[] {""} ;
      P03EZ2_A6301TipPrdCod = new short[1] ;
      P03EZ2_A6302TipPrdDsc = new String[] {""} ;
      P03EZ2_n6302TipPrdDsc = new boolean[] {false} ;
      A6302TipPrdDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexitippr__default(),
         new Object[] {
             new Object[] {
            P03EZ2_A396EmprCod, P03EZ2_A6301TipPrdCod, P03EZ2_A6302TipPrdDsc, P03EZ2_n6302TipPrdDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A6301TipPrdCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8TipPrdDsc ;
   private String scmdbuf ;
   private String A6302TipPrdDsc ;
   private boolean n6302TipPrdDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03EZ2_A396EmprCod ;
   private short[] P03EZ2_A6301TipPrdCod ;
   private String[] P03EZ2_A6302TipPrdDsc ;
   private boolean[] P03EZ2_n6302TipPrdDsc ;
}

final  class pexitippr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03EZ2", "SELECT EmprCod, TipPrdCod, TipPrdDsc FROM TXPTIPPRD WHERE EmprCod = ? and TipPrdCod = ? ORDER BY EmprCod, TipPrdCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

