package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class existedefectotipdef extends GXProcedure
{
   public existedefectotipdef( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( existedefectotipdef.class ), "" );
   }

   public existedefectotipdef( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             short aP1 ,
                             String[] aP2 )
   {
      existedefectotipdef.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      existedefectotipdef.this.A396EmprCod = aP0;
      existedefectotipdef.this.A833TipDefCod = aP1;
      existedefectotipdef.this.aP2 = aP2;
      existedefectotipdef.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ok = httpContext.getMessage( "N", "") ;
      AV9TipDefDsc = " " ;
      /* Using cursor P087N2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A833TipDefCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A834TipDefDsc = P087N2_A834TipDefDsc[0] ;
         n834TipDefDsc = P087N2_n834TipDefDsc[0] ;
         AV8Ok = httpContext.getMessage( "S", "") ;
         AV9TipDefDsc = A834TipDefDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = existedefectotipdef.this.AV9TipDefDsc;
      this.aP3[0] = existedefectotipdef.this.AV8Ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9TipDefDsc = "" ;
      AV8Ok = "" ;
      scmdbuf = "" ;
      P087N2_A396EmprCod = new String[] {""} ;
      P087N2_A833TipDefCod = new short[1] ;
      P087N2_A834TipDefDsc = new String[] {""} ;
      P087N2_n834TipDefDsc = new boolean[] {false} ;
      A834TipDefDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.existedefectotipdef__default(),
         new Object[] {
             new Object[] {
            P087N2_A396EmprCod, P087N2_A833TipDefCod, P087N2_A834TipDefDsc, P087N2_n834TipDefDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A833TipDefCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV9TipDefDsc ;
   private String AV8Ok ;
   private String scmdbuf ;
   private String A834TipDefDsc ;
   private boolean n834TipDefDsc ;
   private String[] aP3 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P087N2_A396EmprCod ;
   private short[] P087N2_A833TipDefCod ;
   private String[] P087N2_A834TipDefDsc ;
   private boolean[] P087N2_n834TipDefDsc ;
}

final  class existedefectotipdef__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P087N2", "SELECT EmprCod, TipDefCod, TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? and TipDefCod = ? ORDER BY EmprCod, TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

