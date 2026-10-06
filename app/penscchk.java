package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class penscchk extends GXProcedure
{
   public penscchk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( penscchk.class ), "" );
   }

   public penscchk( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      penscchk.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      penscchk.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      penscchk.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      penscchk.this.A5555Lb_opcion = aP2[0];
      this.aP2 = aP2;
      penscchk.this.AV8Ok = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11GXLvl1 = (byte)(0) ;
      /* Using cursor P03182 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5558LB_CantC = P03182_A5558LB_CantC[0] ;
         A5557Lb_LineaC = P03182_A5557Lb_LineaC[0] ;
         AV11GXLvl1 = (byte)(1) ;
         AV8Ok = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV11GXLvl1 == 0 )
      {
         AV8Ok = (byte)(0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = penscchk.this.A396EmprCod;
      this.aP1[0] = penscchk.this.A5532Lb_numero;
      this.aP2[0] = penscchk.this.A5555Lb_opcion;
      this.aP3[0] = penscchk.this.AV8Ok;
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
      P03182_A396EmprCod = new String[] {""} ;
      P03182_A5532Lb_numero = new int[1] ;
      P03182_A5555Lb_opcion = new String[] {""} ;
      P03182_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03182_A5557Lb_LineaC = new short[1] ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.penscchk__default(),
         new Object[] {
             new Object[] {
            P03182_A396EmprCod, P03182_A5532Lb_numero, P03182_A5555Lb_opcion, P03182_A5558LB_CantC, P03182_A5557Lb_LineaC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Ok ;
   private byte AV11GXLvl1 ;
   private short A5557Lb_LineaC ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private java.math.BigDecimal A5558LB_CantC ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String scmdbuf ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P03182_A396EmprCod ;
   private int[] P03182_A5532Lb_numero ;
   private String[] P03182_A5555Lb_opcion ;
   private java.math.BigDecimal[] P03182_A5558LB_CantC ;
   private short[] P03182_A5557Lb_LineaC ;
}

final  class penscchk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03182", "SELECT EmprCod, Lb_numero, Lb_opcion, LB_CantC, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

