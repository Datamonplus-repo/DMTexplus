package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppreope extends GXProcedure
{
   public ppreope( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppreope.class ), "" );
   }

   public ppreope( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           short[] aP1 ,
                                           String[] aP2 )
   {
      ppreope.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      ppreope.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppreope.this.A970ProceCod = aP1[0];
      this.aP1 = aP1;
      ppreope.this.A2102OperCod = aP2[0];
      this.aP2 = aP2;
      ppreope.this.AV15PreOpe = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Flag = (byte)(0) ;
      /* Using cursor P00ZW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A970ProceCod), A2102OperCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2104OperPre = P00ZW2_A2104OperPre[0] ;
         n2104OperPre = P00ZW2_n2104OperPre[0] ;
         AV15PreOpe = A2104OperPre ;
         AV16Flag = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV16Flag == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Precio Operacion Empesa Inexistente", ""));
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppreope.this.A396EmprCod;
      this.aP1[0] = ppreope.this.A970ProceCod;
      this.aP2[0] = ppreope.this.A2102OperCod;
      this.aP3[0] = ppreope.this.AV15PreOpe;
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
      P00ZW2_A396EmprCod = new String[] {""} ;
      P00ZW2_A970ProceCod = new short[1] ;
      P00ZW2_A2102OperCod = new String[] {""} ;
      P00ZW2_A2104OperPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZW2_n2104OperPre = new boolean[] {false} ;
      A2104OperPre = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppreope__default(),
         new Object[] {
             new Object[] {
            P00ZW2_A396EmprCod, P00ZW2_A970ProceCod, P00ZW2_A2102OperCod, P00ZW2_A2104OperPre, P00ZW2_n2104OperPre
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Flag ;
   private short A970ProceCod ;
   private short Gx_err ;
   private java.math.BigDecimal AV15PreOpe ;
   private java.math.BigDecimal A2104OperPre ;
   private String A396EmprCod ;
   private String A2102OperCod ;
   private String scmdbuf ;
   private boolean n2104OperPre ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00ZW2_A396EmprCod ;
   private short[] P00ZW2_A970ProceCod ;
   private String[] P00ZW2_A2102OperCod ;
   private java.math.BigDecimal[] P00ZW2_A2104OperPre ;
   private boolean[] P00ZW2_n2104OperPre ;
}

final  class ppreope__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00ZW2", "SELECT * FROM (SELECT EmprCod, ProceCod, OperCod, OperPre FROM TXPPREOPE WHERE EmprCod = ? and ProceCod = ? and OperCod = ? ORDER BY EmprCod, ProceCod, OperCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

