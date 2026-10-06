package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkgsrag extends GXProcedure
{
   public pkgsrag( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkgsrag.class ), "" );
   }

   public pkgsrag( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pkgsrag.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pkgsrag.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkgsrag.this.AV8barcod = aP1[0];
      this.aP1 = aP1;
      pkgsrag.this.AV9Barcodreo = aP2[0];
      this.aP2 = aP2;
      pkgsrag.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      pkgsrag.this.AV12Usurcod = aP4[0];
      this.aP4 = aP4;
      pkgsrag.this.AV15Station = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P029F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8barcod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P029F2_A130BarCodPar[0] ;
         A132BarCodReo = P029F2_A132BarCodReo[0] ;
         A129BarCod = P029F2_A129BarCod[0] ;
         A590KgmAgr = P029F2_A590KgmAgr[0] ;
         A119BarAgrCod = P029F2_A119BarAgrCod[0] ;
         A124BarAgrReo = P029F2_A124BarAgrReo[0] ;
         A122BarAgrPar = P029F2_A122BarAgrPar[0] ;
         A869MtrAgr = P029F2_A869MtrAgr[0] ;
         AV11Oldkgm = A590KgmAgr ;
         if ( AV14Cambio_k == 1 )
         {
            AV13Texto_i = httpContext.getMessage( "Kilos Modificados Agruapciones.", "") + GXutil.newLine( ) + httpContext.getMessage( "Kgs Origen = ", "") + GXutil.str( AV11Oldkgm, 9, 2) + GXutil.newLine( ) + httpContext.getMessage( "Kgs nuevos = ", "") + GXutil.str( A590KgmAgr, 9, 2) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV19Pgmname, AV12Usurcod, AV15Station, AV13Texto_i, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A119BarAgrCod ;
            GXv_int3[0] = A124BarAgrReo ;
            GXv_char4[0] = A122BarAgrPar ;
            new app.pactagr(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
            pkgsrag.this.A396EmprCod = GXv_char1[0] ;
            pkgsrag.this.A119BarAgrCod = GXv_int2[0] ;
            pkgsrag.this.A124BarAgrReo = GXv_int3[0] ;
            pkgsrag.this.A122BarAgrPar = GXv_char4[0] ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkgsrag.this.A396EmprCod;
      this.aP1[0] = pkgsrag.this.AV8barcod;
      this.aP2[0] = pkgsrag.this.AV9Barcodreo;
      this.aP3[0] = pkgsrag.this.AV10Barcodpar;
      this.aP4[0] = pkgsrag.this.AV12Usurcod;
      this.aP5[0] = pkgsrag.this.AV15Station;
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
      P029F2_A396EmprCod = new String[] {""} ;
      P029F2_A130BarCodPar = new String[] {""} ;
      P029F2_A132BarCodReo = new byte[1] ;
      P029F2_A129BarCod = new int[1] ;
      P029F2_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029F2_A119BarAgrCod = new int[1] ;
      P029F2_A124BarAgrReo = new byte[1] ;
      P029F2_A122BarAgrPar = new String[] {""} ;
      P029F2_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A122BarAgrPar = "" ;
      A869MtrAgr = DecimalUtil.ZERO ;
      AV11Oldkgm = DecimalUtil.ZERO ;
      AV13Texto_i = "" ;
      AV19Pgmname = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkgsrag__default(),
         new Object[] {
             new Object[] {
            P029F2_A396EmprCod, P029F2_A130BarCodPar, P029F2_A132BarCodReo, P029F2_A129BarCod, P029F2_A590KgmAgr, P029F2_A119BarAgrCod, P029F2_A124BarAgrReo, P029F2_A122BarAgrPar, P029F2_A869MtrAgr
            }
         }
      );
      AV19Pgmname = "PKgsRAg" ;
      /* GeneXus formulas. */
      AV19Pgmname = "PKgsRAg" ;
      Gx_err = (short)(0) ;
   }

   private byte AV9Barcodreo ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte AV14Cambio_k ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int AV8barcod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int GXv_int2[] ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal AV11Oldkgm ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String AV12Usurcod ;
   private String AV15Station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A122BarAgrPar ;
   private String AV19Pgmname ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String AV13Texto_i ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P029F2_A396EmprCod ;
   private String[] P029F2_A130BarCodPar ;
   private byte[] P029F2_A132BarCodReo ;
   private int[] P029F2_A129BarCod ;
   private java.math.BigDecimal[] P029F2_A590KgmAgr ;
   private int[] P029F2_A119BarAgrCod ;
   private byte[] P029F2_A124BarAgrReo ;
   private String[] P029F2_A122BarAgrPar ;
   private java.math.BigDecimal[] P029F2_A869MtrAgr ;
}

final  class pkgsrag__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P029F2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, KgmAgr, BarAgrCod, BarAgrReo, BarAgrPar, MtrAgr FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
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

