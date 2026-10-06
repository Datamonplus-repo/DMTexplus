package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnrcdef extends GXProcedure
{
   public pnrcdef( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnrcdef.class ), "" );
   }

   public pnrcdef( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 )
   {
      pnrcdef.this.aP2 = new String[] {""};
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
      pnrcdef.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnrcdef.this.A833TipDefCod = aP1[0];
      this.aP1 = aP1;
      pnrcdef.this.AV17TipDefDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17TipDefDsc = httpContext.getMessage( "Inexistente", "") ;
      /* Using cursor P021M2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A833TipDefCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A834TipDefDsc = P021M2_A834TipDefDsc[0] ;
         n834TipDefDsc = P021M2_n834TipDefDsc[0] ;
         AV17TipDefDsc = A834TipDefDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnrcdef.this.A396EmprCod;
      this.aP1[0] = pnrcdef.this.A833TipDefCod;
      this.aP2[0] = pnrcdef.this.AV17TipDefDsc;
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
      P021M2_A396EmprCod = new String[] {""} ;
      P021M2_A833TipDefCod = new short[1] ;
      P021M2_A834TipDefDsc = new String[] {""} ;
      P021M2_n834TipDefDsc = new boolean[] {false} ;
      A834TipDefDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnrcdef__default(),
         new Object[] {
             new Object[] {
            P021M2_A396EmprCod, P021M2_A833TipDefCod, P021M2_A834TipDefDsc, P021M2_n834TipDefDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A833TipDefCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV17TipDefDsc ;
   private String scmdbuf ;
   private String A834TipDefDsc ;
   private boolean n834TipDefDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P021M2_A396EmprCod ;
   private short[] P021M2_A833TipDefCod ;
   private String[] P021M2_A834TipDefDsc ;
   private boolean[] P021M2_n834TipDefDsc ;
}

final  class pnrcdef__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P021M2", "SELECT EmprCod, TipDefCod, TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? and TipDefCod = ? ORDER BY EmprCod, TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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

