package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class existelinealhipro extends GXProcedure
{
   public existelinealhipro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( existelinealhipro.class ), "" );
   }

   public existelinealhipro( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             int aP3 )
   {
      existelinealhipro.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        int aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             int aP3 ,
                             String[] aP4 )
   {
      existelinealhipro.this.A396EmprCod = aP0;
      existelinealhipro.this.A602MaqCod = aP1;
      existelinealhipro.this.A558HisProFec = aP2;
      existelinealhipro.this.A561HisProLin = aP3;
      existelinealhipro.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8errmensaje = "" ;
      /* Using cursor P09YM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV8errmensaje = httpContext.getMessage( "Existe el numero de linea ", "") + GXutil.trim( GXutil.str( A561HisProLin, 8, 0)) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = existelinealhipro.this.AV8errmensaje;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8errmensaje = "" ;
      scmdbuf = "" ;
      P09YM2_A396EmprCod = new String[] {""} ;
      P09YM2_A602MaqCod = new String[] {""} ;
      P09YM2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09YM2_A561HisProLin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.existelinealhipro__default(),
         new Object[] {
             new Object[] {
            P09YM2_A396EmprCod, P09YM2_A602MaqCod, P09YM2_A558HisProFec, P09YM2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A561HisProLin ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String scmdbuf ;
   private java.util.Date A558HisProFec ;
   private String AV8errmensaje ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09YM2_A396EmprCod ;
   private String[] P09YM2_A602MaqCod ;
   private java.util.Date[] P09YM2_A558HisProFec ;
   private int[] P09YM2_A561HisProLin ;
}

final  class existelinealhipro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09YM2", "SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? and HisProLin = ? ORDER BY EmprCod, MaqCod, HisProFec, HisProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

