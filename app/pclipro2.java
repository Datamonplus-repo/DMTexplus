package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclipro2 extends GXProcedure
{
   public pclipro2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclipro2.class ), "" );
   }

   public pclipro2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           String[] aP3 ,
                                           byte[] aP4 ,
                                           java.math.BigDecimal[] aP5 )
   {
      pclipro2.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pclipro2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclipro2.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pclipro2.this.A1504CliProCod = aP2[0];
      this.aP2 = aP2;
      pclipro2.this.AV10ArtCod = aP3[0];
      this.aP3 = aP3;
      pclipro2.this.AV11IntCod = aP4[0];
      this.aP4 = aP4;
      pclipro2.this.AV8ProPreMtr = aP5[0];
      this.aP5 = aP5;
      pclipro2.this.AV9ProPreKgm = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV12Valor ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBPRO", ""), GXv_int1) ;
      pclipro2.this.AV12Valor = (byte)((byte)(GXv_int1[0])) ;
      AV13ArtCod16 = GXutil.space( (short)(16)) ;
      if ( AV12Valor == 0 )
      {
         AV13ArtCod16 = AV10ArtCod ;
      }
      AV9ProPreKgm = DecimalUtil.doubleToDec(0) ;
      AV8ProPreMtr = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P015V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, AV13ArtCod16, Byte.valueOf(AV11IntCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A583IntCod = P015V2_A583IntCod[0] ;
         A65ArtCod = P015V2_A65ArtCod[0] ;
         A1465ProPreKgm = P015V2_A1465ProPreKgm[0] ;
         n1465ProPreKgm = P015V2_n1465ProPreKgm[0] ;
         A1464ProPreMtr = P015V2_A1464ProPreMtr[0] ;
         n1464ProPreMtr = P015V2_n1464ProPreMtr[0] ;
         AV9ProPreKgm = A1465ProPreKgm ;
         AV8ProPreMtr = A1464ProPreMtr ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclipro2.this.A396EmprCod;
      this.aP1[0] = pclipro2.this.A252CliCod;
      this.aP2[0] = pclipro2.this.A1504CliProCod;
      this.aP3[0] = pclipro2.this.AV10ArtCod;
      this.aP4[0] = pclipro2.this.AV11IntCod;
      this.aP5[0] = pclipro2.this.AV8ProPreMtr;
      this.aP6[0] = pclipro2.this.AV9ProPreKgm;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new int[1] ;
      AV13ArtCod16 = "" ;
      scmdbuf = "" ;
      P015V2_A396EmprCod = new String[] {""} ;
      P015V2_A252CliCod = new int[1] ;
      P015V2_A1504CliProCod = new String[] {""} ;
      P015V2_A583IntCod = new byte[1] ;
      P015V2_A65ArtCod = new String[] {""} ;
      P015V2_A1465ProPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P015V2_n1465ProPreKgm = new boolean[] {false} ;
      P015V2_A1464ProPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P015V2_n1464ProPreMtr = new boolean[] {false} ;
      A65ArtCod = "" ;
      A1465ProPreKgm = DecimalUtil.ZERO ;
      A1464ProPreMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclipro2__default(),
         new Object[] {
             new Object[] {
            P015V2_A396EmprCod, P015V2_A252CliCod, P015V2_A1504CliProCod, P015V2_A583IntCod, P015V2_A65ArtCod, P015V2_A1465ProPreKgm, P015V2_n1465ProPreKgm, P015V2_A1464ProPreMtr, P015V2_n1464ProPreMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11IntCod ;
   private byte AV12Valor ;
   private byte A583IntCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int GXv_int1[] ;
   private java.math.BigDecimal AV8ProPreMtr ;
   private java.math.BigDecimal AV9ProPreKgm ;
   private java.math.BigDecimal A1465ProPreKgm ;
   private java.math.BigDecimal A1464ProPreMtr ;
   private String A396EmprCod ;
   private String A1504CliProCod ;
   private String AV10ArtCod ;
   private String AV13ArtCod16 ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private boolean n1465ProPreKgm ;
   private boolean n1464ProPreMtr ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P015V2_A396EmprCod ;
   private int[] P015V2_A252CliCod ;
   private String[] P015V2_A1504CliProCod ;
   private byte[] P015V2_A583IntCod ;
   private String[] P015V2_A65ArtCod ;
   private java.math.BigDecimal[] P015V2_A1465ProPreKgm ;
   private boolean[] P015V2_n1465ProPreKgm ;
   private java.math.BigDecimal[] P015V2_A1464ProPreMtr ;
   private boolean[] P015V2_n1464ProPreMtr ;
}

final  class pclipro2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P015V2", "SELECT EmprCod, CliCod, CliProCod, IntCod, ArtCod, ProPreKgm, ProPreMtr FROM TXPLPREPR WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

