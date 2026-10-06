package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens042 extends GXProcedure
{
   public pens042( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens042.class ), "" );
   }

   public pens042( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           java.math.BigDecimal[] aP4 )
   {
      pens042.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             byte[] aP5 )
   {
      pens042.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens042.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens042.this.A5555Lb_opcion = aP2[0];
      this.aP2 = aP2;
      pens042.this.AV15Producto = aP3[0];
      this.aP3 = aP3;
      pens042.this.AV16TotCol = aP4[0];
      this.aP4 = aP4;
      pens042.this.AV17FlagCol = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17FlagCol = (byte)(0) ;
      /* Using cursor P029P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, AV15Producto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P029P2_A719PrdNum[0] ;
         A5558LB_CantC = P029P2_A5558LB_CantC[0] ;
         A5557Lb_LineaC = P029P2_A5557Lb_LineaC[0] ;
         AV16TotCol = AV16TotCol.add(A5558LB_CantC) ;
         AV17FlagCol = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens042.this.A396EmprCod;
      this.aP1[0] = pens042.this.A5532Lb_numero;
      this.aP2[0] = pens042.this.A5555Lb_opcion;
      this.aP3[0] = pens042.this.AV15Producto;
      this.aP4[0] = pens042.this.AV16TotCol;
      this.aP5[0] = pens042.this.AV17FlagCol;
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
      P029P2_A396EmprCod = new String[] {""} ;
      P029P2_A5532Lb_numero = new int[1] ;
      P029P2_A5555Lb_opcion = new String[] {""} ;
      P029P2_A719PrdNum = new String[] {""} ;
      P029P2_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029P2_A5557Lb_LineaC = new short[1] ;
      A719PrdNum = "" ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pens042__default(),
         new Object[] {
             new Object[] {
            P029P2_A396EmprCod, P029P2_A5532Lb_numero, P029P2_A5555Lb_opcion, P029P2_A719PrdNum, P029P2_A5558LB_CantC, P029P2_A5557Lb_LineaC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17FlagCol ;
   private short A5557Lb_LineaC ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private java.math.BigDecimal AV16TotCol ;
   private java.math.BigDecimal A5558LB_CantC ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String AV15Producto ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P029P2_A396EmprCod ;
   private int[] P029P2_A5532Lb_numero ;
   private String[] P029P2_A5555Lb_opcion ;
   private String[] P029P2_A719PrdNum ;
   private java.math.BigDecimal[] P029P2_A5558LB_CantC ;
   private short[] P029P2_A5557Lb_LineaC ;
}

final  class pens042__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P029P2", "SELECT EmprCod, Lb_numero, Lb_opcion, PrdNum, LB_CantC, Lb_LineaC FROM TXPENS003 WHERE (EmprCod = ? and Lb_numero = ? and Lb_opcion = ?) AND (PrdNum = ?) ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setString(4, (String)parms[3], 6);
               return;
      }
   }

}

