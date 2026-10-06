package app.documentotransportecomercial ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_obtengodatos extends GXProcedure
{
   public documentotransportecomercial_obtengodatos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_obtengodatos.class ), "" );
   }

   public documentotransportecomercial_obtengodatos( int remoteHandle ,
                                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            short aP2 ,
                            String[] aP3 ,
                            String[] aP4 ,
                            java.math.BigDecimal[] aP5 ,
                            byte[] aP6 ,
                            java.math.BigDecimal[] aP7 )
   {
      documentotransportecomercial_obtengodatos.this.aP8 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        short[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             short[] aP8 )
   {
      documentotransportecomercial_obtengodatos.this.AV8emprcod = aP0;
      documentotransportecomercial_obtengodatos.this.AV9Albcomcod = aP1;
      documentotransportecomercial_obtengodatos.this.AV10albComLin = aP2;
      documentotransportecomercial_obtengodatos.this.aP3 = aP3;
      documentotransportecomercial_obtengodatos.this.aP4 = aP4;
      documentotransportecomercial_obtengodatos.this.aP5 = aP5;
      documentotransportecomercial_obtengodatos.this.aP6 = aP6;
      documentotransportecomercial_obtengodatos.this.aP7 = aP7;
      documentotransportecomercial_obtengodatos.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13AlbComCnt = DecimalUtil.ZERO ;
      AV12AlbComDc2 = "" ;
      AV11AlbComDsc = "" ;
      AV14AlbComUni = (byte)(0) ;
      AV15Lalcom = (short)(0) ;
      AV16AlbComPre = DecimalUtil.ZERO ;
      /* Using cursor P0AHR2 */
      pr_default.execute(0, new Object[] {AV8emprcod, Integer.valueOf(AV9Albcomcod), Short.valueOf(AV10albComLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A20AlbComLin = P0AHR2_A20AlbComLin[0] ;
         A14AlbComCod = P0AHR2_A14AlbComCod[0] ;
         A396EmprCod = P0AHR2_A396EmprCod[0] ;
         A13AlbComCnt = P0AHR2_A13AlbComCnt[0] ;
         A10806AlbComDc2 = P0AHR2_A10806AlbComDc2[0] ;
         A15AlbComDsc = P0AHR2_A15AlbComDsc[0] ;
         A4717AlbComUni = P0AHR2_A4717AlbComUni[0] ;
         A21AlbComPre = P0AHR2_A21AlbComPre[0] ;
         AV13AlbComCnt = A13AlbComCnt ;
         AV12AlbComDc2 = A10806AlbComDc2 ;
         AV11AlbComDsc = A15AlbComDsc ;
         AV14AlbComUni = A4717AlbComUni ;
         AV16AlbComPre = A21AlbComPre ;
         AV15Lalcom = (short)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentotransportecomercial_obtengodatos.this.AV11AlbComDsc;
      this.aP4[0] = documentotransportecomercial_obtengodatos.this.AV12AlbComDc2;
      this.aP5[0] = documentotransportecomercial_obtengodatos.this.AV13AlbComCnt;
      this.aP6[0] = documentotransportecomercial_obtengodatos.this.AV14AlbComUni;
      this.aP7[0] = documentotransportecomercial_obtengodatos.this.AV16AlbComPre;
      this.aP8[0] = documentotransportecomercial_obtengodatos.this.AV15Lalcom;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11AlbComDsc = "" ;
      AV12AlbComDc2 = "" ;
      AV13AlbComCnt = DecimalUtil.ZERO ;
      AV16AlbComPre = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AHR2_A20AlbComLin = new short[1] ;
      P0AHR2_A14AlbComCod = new int[1] ;
      P0AHR2_A396EmprCod = new String[] {""} ;
      P0AHR2_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AHR2_A10806AlbComDc2 = new String[] {""} ;
      P0AHR2_A15AlbComDsc = new String[] {""} ;
      P0AHR2_A4717AlbComUni = new byte[1] ;
      P0AHR2_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A10806AlbComDc2 = "" ;
      A15AlbComDsc = "" ;
      A21AlbComPre = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_obtengodatos__default(),
         new Object[] {
             new Object[] {
            P0AHR2_A20AlbComLin, P0AHR2_A14AlbComCod, P0AHR2_A396EmprCod, P0AHR2_A13AlbComCnt, P0AHR2_A10806AlbComDc2, P0AHR2_A15AlbComDsc, P0AHR2_A4717AlbComUni, P0AHR2_A21AlbComPre
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14AlbComUni ;
   private byte A4717AlbComUni ;
   private short AV10albComLin ;
   private short AV15Lalcom ;
   private short A20AlbComLin ;
   private short Gx_err ;
   private int AV9Albcomcod ;
   private int A14AlbComCod ;
   private java.math.BigDecimal AV13AlbComCnt ;
   private java.math.BigDecimal AV16AlbComPre ;
   private java.math.BigDecimal A13AlbComCnt ;
   private java.math.BigDecimal A21AlbComPre ;
   private String AV8emprcod ;
   private String AV11AlbComDsc ;
   private String AV12AlbComDc2 ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A10806AlbComDc2 ;
   private String A15AlbComDsc ;
   private short[] aP8 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private short[] P0AHR2_A20AlbComLin ;
   private int[] P0AHR2_A14AlbComCod ;
   private String[] P0AHR2_A396EmprCod ;
   private java.math.BigDecimal[] P0AHR2_A13AlbComCnt ;
   private String[] P0AHR2_A10806AlbComDc2 ;
   private String[] P0AHR2_A15AlbComDsc ;
   private byte[] P0AHR2_A4717AlbComUni ;
   private java.math.BigDecimal[] P0AHR2_A21AlbComPre ;
}

final  class documentotransportecomercial_obtengodatos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AHR2", "SELECT AlbComLin, AlbComCod, EmprCod, AlbComCnt, AlbComDc2, AlbComDsc, AlbComUni, AlbComPre FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? and AlbComLin = ? ORDER BY EmprCod, AlbComCod, AlbComLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

