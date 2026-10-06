package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precioporarticulo_get extends GXProcedure
{
   public precioporarticulo_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precioporarticulo_get.class ), "" );
   }

   public precioporarticulo_get( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            String aP2 ,
                            byte aP3 ,
                            byte aP4 ,
                            java.math.BigDecimal[] aP5 ,
                            java.math.BigDecimal[] aP6 ,
                            String[] aP7 )
   {
      precioporarticulo_get.this.aP8 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        byte aP3 ,
                        byte aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             byte aP3 ,
                             byte aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 )
   {
      precioporarticulo_get.this.A396EmprCod = aP0;
      precioporarticulo_get.this.A252CliCod = aP1;
      precioporarticulo_get.this.A65ArtCod = aP2;
      precioporarticulo_get.this.A831TipColCod = aP3;
      precioporarticulo_get.this.AV12intcod = aP4;
      precioporarticulo_get.this.aP5 = aP5;
      precioporarticulo_get.this.aP6 = aP6;
      precioporarticulo_get.this.aP7 = aP7;
      precioporarticulo_get.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10IntPreDef = httpContext.getMessage( "N", "") ;
      AV8IntPreKgm = DecimalUtil.ZERO ;
      AV9IntPreMtr = DecimalUtil.ZERO ;
      AV13pretin = (short)(0) ;
      /* Using cursor P0APF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(AV12intcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A583IntCod = P0APF2_A583IntCod[0] ;
         A585IntPreDef = P0APF2_A585IntPreDef[0] ;
         n585IntPreDef = P0APF2_n585IntPreDef[0] ;
         A586IntPreKgm = P0APF2_A586IntPreKgm[0] ;
         n586IntPreKgm = P0APF2_n586IntPreKgm[0] ;
         A587IntPreMtr = P0APF2_A587IntPreMtr[0] ;
         n587IntPreMtr = P0APF2_n587IntPreMtr[0] ;
         AV10IntPreDef = A585IntPreDef ;
         AV8IntPreKgm = A586IntPreKgm ;
         AV9IntPreMtr = A587IntPreMtr ;
         AV13pretin = (short)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = precioporarticulo_get.this.AV8IntPreKgm;
      this.aP6[0] = precioporarticulo_get.this.AV9IntPreMtr;
      this.aP7[0] = precioporarticulo_get.this.AV10IntPreDef;
      this.aP8[0] = precioporarticulo_get.this.AV13pretin;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8IntPreKgm = DecimalUtil.ZERO ;
      AV9IntPreMtr = DecimalUtil.ZERO ;
      AV10IntPreDef = "" ;
      scmdbuf = "" ;
      P0APF2_A396EmprCod = new String[] {""} ;
      P0APF2_A252CliCod = new int[1] ;
      P0APF2_A65ArtCod = new String[] {""} ;
      P0APF2_A831TipColCod = new byte[1] ;
      P0APF2_A583IntCod = new byte[1] ;
      P0APF2_A585IntPreDef = new String[] {""} ;
      P0APF2_n585IntPreDef = new boolean[] {false} ;
      P0APF2_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APF2_n586IntPreKgm = new boolean[] {false} ;
      P0APF2_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APF2_n587IntPreMtr = new boolean[] {false} ;
      A585IntPreDef = "" ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.precioporarticulo_get__default(),
         new Object[] {
             new Object[] {
            P0APF2_A396EmprCod, P0APF2_A252CliCod, P0APF2_A65ArtCod, P0APF2_A831TipColCod, P0APF2_A583IntCod, P0APF2_A585IntPreDef, P0APF2_n585IntPreDef, P0APF2_A586IntPreKgm, P0APF2_n586IntPreKgm, P0APF2_A587IntPreMtr,
            P0APF2_n587IntPreMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV12intcod ;
   private byte A583IntCod ;
   private short AV13pretin ;
   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal AV8IntPreKgm ;
   private java.math.BigDecimal AV9IntPreMtr ;
   private java.math.BigDecimal A586IntPreKgm ;
   private java.math.BigDecimal A587IntPreMtr ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV10IntPreDef ;
   private String scmdbuf ;
   private String A585IntPreDef ;
   private boolean n585IntPreDef ;
   private boolean n586IntPreKgm ;
   private boolean n587IntPreMtr ;
   private short[] aP8 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P0APF2_A396EmprCod ;
   private int[] P0APF2_A252CliCod ;
   private String[] P0APF2_A65ArtCod ;
   private byte[] P0APF2_A831TipColCod ;
   private byte[] P0APF2_A583IntCod ;
   private String[] P0APF2_A585IntPreDef ;
   private boolean[] P0APF2_n585IntPreDef ;
   private java.math.BigDecimal[] P0APF2_A586IntPreKgm ;
   private boolean[] P0APF2_n586IntPreKgm ;
   private java.math.BigDecimal[] P0APF2_A587IntPreMtr ;
   private boolean[] P0APF2_n587IntPreMtr ;
}

final  class precioporarticulo_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0APF2", "SELECT EmprCod, CliCod, ArtCod, TipColCod, IntCod, IntPreDef, IntPreKgm, IntPreMtr FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

