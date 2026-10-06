package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvxhrcot extends GXProcedure
{
   public pvxhrcot( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvxhrcot.class ), "" );
   }

   public pvxhrcot( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           byte aP2 ,
                                           String aP3 )
   {
      pvxhrcot.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pvxhrcot.this.A396EmprCod = aP0;
      pvxhrcot.this.A129BarCod = aP1;
      pvxhrcot.this.A132BarCodReo = aP2;
      pvxhrcot.this.A130BarCodPar = aP3;
      pvxhrcot.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV10COSTEJPar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COSTEJ", ""), GXv_int2) ;
      pvxhrcot.this.GXt_int1 = GXv_int2[0] ;
      AV10COSTEJPar = GXt_int1 ;
      /* Using cursor P09R32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A170BarKilLan = P09R32_A170BarKilLan[0] ;
         A200BarPieCod = P09R32_A200BarPieCod[0] ;
         if ( AV10COSTEJPar == 1 )
         {
            GXt_decimal3 = AV11CostoRollo ;
            GXv_decimal4[0] = GXt_decimal3 ;
            new app.pvxrocos(remoteHandle, context).execute( A200BarPieCod, (byte)(1), GXv_decimal4) ;
            pvxhrcot.this.GXt_decimal3 = GXv_decimal4[0] ;
            AV11CostoRollo = GXt_decimal3 ;
         }
         else if ( AV10COSTEJPar == 2 )
         {
            GXt_decimal3 = AV11CostoRollo ;
            GXv_decimal4[0] = GXt_decimal3 ;
            new app.pvxrocos(remoteHandle, context).execute( A200BarPieCod, (byte)(2), GXv_decimal4) ;
            pvxhrcot.this.GXt_decimal3 = GXv_decimal4[0] ;
            AV11CostoRollo = GXt_decimal3 ;
         }
         else
         {
            GXt_decimal3 = AV11CostoRollo ;
            GXv_decimal4[0] = GXt_decimal3 ;
            new app.pvxrocos(remoteHandle, context).execute( A200BarPieCod, (byte)(1), GXv_decimal4) ;
            pvxhrcot.this.GXt_decimal3 = GXv_decimal4[0] ;
            AV11CostoRollo = GXt_decimal3 ;
         }
         AV12CosTej = AV12CosTej.add(AV11CostoRollo) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = pvxhrcot.this.AV12CosTej;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12CosTej = DecimalUtil.ZERO ;
      GXv_int2 = new int[1] ;
      scmdbuf = "" ;
      P09R32_A396EmprCod = new String[] {""} ;
      P09R32_A129BarCod = new int[1] ;
      P09R32_A132BarCodReo = new byte[1] ;
      P09R32_A130BarCodPar = new String[] {""} ;
      P09R32_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R32_A200BarPieCod = new String[] {""} ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV11CostoRollo = DecimalUtil.ZERO ;
      GXt_decimal3 = DecimalUtil.ZERO ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvxhrcot__default(),
         new Object[] {
             new Object[] {
            P09R32_A396EmprCod, P09R32_A129BarCod, P09R32_A132BarCodReo, P09R32_A130BarCodPar, P09R32_A170BarKilLan, P09R32_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV10COSTEJPar ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private java.math.BigDecimal AV12CosTej ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal AV11CostoRollo ;
   private java.math.BigDecimal GXt_decimal3 ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09R32_A396EmprCod ;
   private int[] P09R32_A129BarCod ;
   private byte[] P09R32_A132BarCodReo ;
   private String[] P09R32_A130BarCodPar ;
   private java.math.BigDecimal[] P09R32_A170BarKilLan ;
   private String[] P09R32_A200BarPieCod ;
}

final  class pvxhrcot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09R32", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarKilLan, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

