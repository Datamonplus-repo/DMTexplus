package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclasda extends GXProcedure
{
   public pclasda( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclasda.class ), "" );
   }

   public pclasda( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             byte[] aP7 ,
                             int[] aP8 )
   {
      pclasda.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        byte[] aP7 ,
                        int[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             byte[] aP7 ,
                             int[] aP8 ,
                             String[] aP9 )
   {
      pclasda.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclasda.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pclasda.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pclasda.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pclasda.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pclasda.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pclasda.this.AV16TotCol = aP6[0];
      this.aP6 = aP6;
      pclasda.this.AV17FlagCol = aP7[0];
      this.aP7 = aP7;
      pclasda.this.AV21Lb_numero = aP8[0];
      this.aP8 = aP8;
      pclasda.this.AV22Lb_opcion = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17FlagCol = (byte)(0) ;
      /* Using cursor P03KU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV21Lb_numero), AV22Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5555Lb_opcion = P03KU2_A5555Lb_opcion[0] ;
         A5532Lb_numero = P03KU2_A5532Lb_numero[0] ;
         A5558LB_CantC = P03KU2_A5558LB_CantC[0] ;
         A5557Lb_LineaC = P03KU2_A5557Lb_LineaC[0] ;
         AV16TotCol = AV16TotCol.add(A5558LB_CantC) ;
         AV17FlagCol = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclasda.this.A396EmprCod;
      this.aP1[0] = pclasda.this.A252CliCod;
      this.aP2[0] = pclasda.this.A494ForSer;
      this.aP3[0] = pclasda.this.A482ForColNom;
      this.aP4[0] = pclasda.this.A483ForColNum;
      this.aP5[0] = pclasda.this.A831TipColCod;
      this.aP6[0] = pclasda.this.AV16TotCol;
      this.aP7[0] = pclasda.this.AV17FlagCol;
      this.aP8[0] = pclasda.this.AV21Lb_numero;
      this.aP9[0] = pclasda.this.AV22Lb_opcion;
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
      P03KU2_A396EmprCod = new String[] {""} ;
      P03KU2_A5555Lb_opcion = new String[] {""} ;
      P03KU2_A5532Lb_numero = new int[1] ;
      P03KU2_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03KU2_A5557Lb_LineaC = new short[1] ;
      A5555Lb_opcion = "" ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclasda__default(),
         new Object[] {
             new Object[] {
            P03KU2_A396EmprCod, P03KU2_A5555Lb_opcion, P03KU2_A5532Lb_numero, P03KU2_A5558LB_CantC, P03KU2_A5557Lb_LineaC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV17FlagCol ;
   private short A5557Lb_LineaC ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV21Lb_numero ;
   private int A5532Lb_numero ;
   private java.math.BigDecimal AV16TotCol ;
   private java.math.BigDecimal A5558LB_CantC ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV22Lb_opcion ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private byte[] aP7 ;
   private int[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P03KU2_A396EmprCod ;
   private String[] P03KU2_A5555Lb_opcion ;
   private int[] P03KU2_A5532Lb_numero ;
   private java.math.BigDecimal[] P03KU2_A5558LB_CantC ;
   private short[] P03KU2_A5557Lb_LineaC ;
}

final  class pclasda__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03KU2", "SELECT EmprCod, Lb_opcion, Lb_numero, LB_CantC, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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

