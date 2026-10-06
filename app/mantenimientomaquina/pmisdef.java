package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmisdef extends GXProcedure
{
   public pmisdef( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmisdef.class ), "" );
   }

   public pmisdef( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pmisdef.this.aP1 = new int[] {0};
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
      pmisdef.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmisdef.this.A9398MISCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03MD2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9492MRCod = P03MD2_A9492MRCod[0] ;
         A9495MRStkAct = P03MD2_A9495MRStkAct[0] ;
         n9495MRStkAct = P03MD2_n9495MRStkAct[0] ;
         W396EmprCod = A396EmprCod ;
         AV8MRStkAct = A9495MRStkAct ;
         /*
            INSERT RECORD ON TABLE TXPMInSRe

         */
         W396EmprCod = A396EmprCod ;
         W9398MISCod = A9398MISCod ;
         A9403MISRCod = A9492MRCod ;
         A9406MISRStkTeo = AV8MRStkAct ;
         A9407MISRStkRea = AV8MRStkAct ;
         A9408MISRStkDif = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P03MD3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod), Integer.valueOf(A9403MISRCod), A9406MISRStkTeo, A9407MISRStkRea, A9408MISRStkDif});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMInSRe");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A9398MISCod = W9398MISCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmisdef.this.A396EmprCod;
      this.aP1[0] = pmisdef.this.A9398MISCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.pmisdef");
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
      P03MD2_A396EmprCod = new String[] {""} ;
      P03MD2_A9492MRCod = new int[1] ;
      P03MD2_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03MD2_n9495MRStkAct = new boolean[] {false} ;
      A9495MRStkAct = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      AV8MRStkAct = DecimalUtil.ZERO ;
      A9406MISRStkTeo = DecimalUtil.ZERO ;
      A9407MISRStkRea = DecimalUtil.ZERO ;
      A9408MISRStkDif = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.pmisdef__default(),
         new Object[] {
             new Object[] {
            P03MD2_A396EmprCod, P03MD2_A9492MRCod, P03MD2_A9495MRStkAct, P03MD2_n9495MRStkAct
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A9398MISCod ;
   private int A9492MRCod ;
   private int GX_INS1229 ;
   private int W9398MISCod ;
   private int A9403MISRCod ;
   private java.math.BigDecimal A9495MRStkAct ;
   private java.math.BigDecimal AV8MRStkAct ;
   private java.math.BigDecimal A9406MISRStkTeo ;
   private java.math.BigDecimal A9407MISRStkRea ;
   private java.math.BigDecimal A9408MISRStkDif ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String W396EmprCod ;
   private String Gx_emsg ;
   private boolean n9495MRStkAct ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03MD2_A396EmprCod ;
   private int[] P03MD2_A9492MRCod ;
   private java.math.BigDecimal[] P03MD2_A9495MRStkAct ;
   private boolean[] P03MD2_n9495MRStkAct ;
}

final  class pmisdef__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03MD2", "SELECT EmprCod, MRCod, MRStkAct FROM TXPMREPUE WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03MD3", "INSERT INTO TXPMInSRe(EmprCod, MISCod, MISRCod, MISRStkTeo, MISRStkRea, MISRStkDif) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMInSRe")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 3);
               return;
      }
   }

}

