package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc275 extends GXProcedure
{
   public pprc275( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc275.class ), "" );
   }

   public pprc275( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pprc275.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      pprc275.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc275.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pprc275.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprc275.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprc275.this.A194BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pprc275.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Errmensaje = "" ;
      /* Using cursor P09LP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A561HisProLin = P09LP2_A561HisProLin[0] ;
         A558HisProFec = P09LP2_A558HisProFec[0] ;
         A602MaqCod = P09LP2_A602MaqCod[0] ;
         AV8Errmensaje = httpContext.getMessage( "Rgto en LHIPRO! ", "") + GXutil.trim( A602MaqCod) + "-" + GXutil.trim( localUtil.dtoc( A558HisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + "-" + GXutil.trim( GXutil.str( A561HisProLin, 8, 0)) + GXutil.newLine( ) ;
         AV8Errmensaje += httpContext.getMessage( "La linea solo se puede CONSULTAR", "") ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc275.this.A396EmprCod;
      this.aP1[0] = pprc275.this.A129BarCod;
      this.aP2[0] = pprc275.this.A132BarCodReo;
      this.aP3[0] = pprc275.this.A130BarCodPar;
      this.aP4[0] = pprc275.this.A194BarOrdLin;
      this.aP5[0] = pprc275.this.AV8Errmensaje;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Errmensaje = "" ;
      scmdbuf = "" ;
      P09LP2_A396EmprCod = new String[] {""} ;
      P09LP2_A129BarCod = new int[1] ;
      P09LP2_A132BarCodReo = new byte[1] ;
      P09LP2_A130BarCodPar = new String[] {""} ;
      P09LP2_A194BarOrdLin = new short[1] ;
      P09LP2_A561HisProLin = new int[1] ;
      P09LP2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LP2_A602MaqCod = new String[] {""} ;
      A558HisProFec = GXutil.nullDate() ;
      A602MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.pprc275__default(),
         new Object[] {
             new Object[] {
            P09LP2_A396EmprCod, P09LP2_A129BarCod, P09LP2_A132BarCodReo, P09LP2_A130BarCodPar, P09LP2_A194BarOrdLin, P09LP2_A561HisProLin, P09LP2_A558HisProFec, P09LP2_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private java.util.Date A558HisProFec ;
   private String AV8Errmensaje ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09LP2_A396EmprCod ;
   private int[] P09LP2_A129BarCod ;
   private byte[] P09LP2_A132BarCodReo ;
   private String[] P09LP2_A130BarCodPar ;
   private short[] P09LP2_A194BarOrdLin ;
   private int[] P09LP2_A561HisProLin ;
   private java.util.Date[] P09LP2_A558HisProFec ;
   private String[] P09LP2_A602MaqCod ;
}

final  class pprc275__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LP2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, HisProLin, HisProFec, MaqCod FROM TXPLHIPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

