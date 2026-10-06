package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class existecausatipcau extends GXProcedure
{
   public existecausatipcau( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( existecausatipcau.class ), "" );
   }

   public existecausatipcau( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             short aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      existecausatipcau.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 )
   {
      existecausatipcau.this.A396EmprCod = aP0;
      existecausatipcau.this.A5085CodCausa = aP1;
      existecausatipcau.this.aP2 = aP2;
      existecausatipcau.this.aP3 = aP3;
      existecausatipcau.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ok = httpContext.getMessage( "N", "") ;
      AV9DscCausa = " " ;
      AV10CostCausa = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P087O2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A5085CodCausa)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5086DscCausa = P087O2_A5086DscCausa[0] ;
         n5086DscCausa = P087O2_n5086DscCausa[0] ;
         A13699CostCausa = P087O2_A13699CostCausa[0] ;
         n13699CostCausa = P087O2_n13699CostCausa[0] ;
         AV8Ok = httpContext.getMessage( "S", "") ;
         AV9DscCausa = A5086DscCausa ;
         AV10CostCausa = A13699CostCausa ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = existecausatipcau.this.AV9DscCausa;
      this.aP3[0] = existecausatipcau.this.AV10CostCausa;
      this.aP4[0] = existecausatipcau.this.AV8Ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9DscCausa = "" ;
      AV10CostCausa = DecimalUtil.ZERO ;
      AV8Ok = "" ;
      scmdbuf = "" ;
      P087O2_A396EmprCod = new String[] {""} ;
      P087O2_A5085CodCausa = new short[1] ;
      P087O2_A5086DscCausa = new String[] {""} ;
      P087O2_n5086DscCausa = new boolean[] {false} ;
      P087O2_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P087O2_n13699CostCausa = new boolean[] {false} ;
      A5086DscCausa = "" ;
      A13699CostCausa = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.existecausatipcau__default(),
         new Object[] {
             new Object[] {
            P087O2_A396EmprCod, P087O2_A5085CodCausa, P087O2_A5086DscCausa, P087O2_n5086DscCausa, P087O2_A13699CostCausa, P087O2_n13699CostCausa
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A5085CodCausa ;
   private short Gx_err ;
   private java.math.BigDecimal AV10CostCausa ;
   private java.math.BigDecimal A13699CostCausa ;
   private String A396EmprCod ;
   private String AV9DscCausa ;
   private String AV8Ok ;
   private String scmdbuf ;
   private String A5086DscCausa ;
   private boolean n5086DscCausa ;
   private boolean n13699CostCausa ;
   private String[] aP4 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P087O2_A396EmprCod ;
   private short[] P087O2_A5085CodCausa ;
   private String[] P087O2_A5086DscCausa ;
   private boolean[] P087O2_n5086DscCausa ;
   private java.math.BigDecimal[] P087O2_A13699CostCausa ;
   private boolean[] P087O2_n13699CostCausa ;
}

final  class existecausatipcau__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P087O2", "SELECT EmprCod, CodCausa, DscCausa, CostCausa FROM TXPTIPCAU WHERE EmprCod = ? and CodCausa = ? ORDER BY EmprCod, CodCausa ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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

