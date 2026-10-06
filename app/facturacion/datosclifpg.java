package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class datosclifpg extends GXProcedure
{
   public datosclifpg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( datosclifpg.class ), "" );
   }

   public datosclifpg( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 )
   {
      datosclifpg.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 )
   {
      datosclifpg.this.A396EmprCod = aP0;
      datosclifpg.this.A252CliCod = aP1;
      datosclifpg.this.A297CliPri = aP2;
      datosclifpg.this.aP3 = aP3;
      datosclifpg.this.aP4 = aP4;
      datosclifpg.this.aP5 = aP5;
      datosclifpg.this.aP6 = aP6;
      datosclifpg.this.aP7 = aP7;
      datosclifpg.this.aP8 = aP8;
      datosclifpg.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10CliDiaPag = "" ;
      AV12CliDtoGrl = DecimalUtil.ZERO ;
      AV13CliDtoppg = DecimalUtil.ZERO ;
      AV8CliNroVto = (byte)(0) ;
      AV9CliPrd = "" ;
      AV14CliRegIva = "" ;
      AV11FpgCod = "" ;
      /* Using cursor P0A3U2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A297CliPri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A259CliDiaPag = P0A3U2_A259CliDiaPag[0] ;
         A261CliDtoGrl = P0A3U2_A261CliDtoGrl[0] ;
         A262CliDtoPpg = P0A3U2_A262CliDtoPpg[0] ;
         A280CliNroVto = P0A3U2_A280CliNroVto[0] ;
         A296CliPrd = P0A3U2_A296CliPrd[0] ;
         A299CliRegIVA = P0A3U2_A299CliRegIVA[0] ;
         A497FpgCod = P0A3U2_A497FpgCod[0] ;
         AV10CliDiaPag = A259CliDiaPag ;
         AV12CliDtoGrl = A261CliDtoGrl ;
         AV13CliDtoppg = A262CliDtoPpg ;
         AV8CliNroVto = A280CliNroVto ;
         AV9CliPrd = A296CliPrd ;
         AV14CliRegIva = A299CliRegIVA ;
         AV11FpgCod = A497FpgCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = datosclifpg.this.AV8CliNroVto;
      this.aP4[0] = datosclifpg.this.AV9CliPrd;
      this.aP5[0] = datosclifpg.this.AV10CliDiaPag;
      this.aP6[0] = datosclifpg.this.AV11FpgCod;
      this.aP7[0] = datosclifpg.this.AV12CliDtoGrl;
      this.aP8[0] = datosclifpg.this.AV13CliDtoppg;
      this.aP9[0] = datosclifpg.this.AV14CliRegIva;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9CliPrd = "" ;
      AV10CliDiaPag = "" ;
      AV11FpgCod = "" ;
      AV12CliDtoGrl = DecimalUtil.ZERO ;
      AV13CliDtoppg = DecimalUtil.ZERO ;
      AV14CliRegIva = "" ;
      scmdbuf = "" ;
      P0A3U2_A396EmprCod = new String[] {""} ;
      P0A3U2_A252CliCod = new int[1] ;
      P0A3U2_A297CliPri = new String[] {""} ;
      P0A3U2_A259CliDiaPag = new String[] {""} ;
      P0A3U2_A261CliDtoGrl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3U2_A262CliDtoPpg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3U2_A280CliNroVto = new byte[1] ;
      P0A3U2_A296CliPrd = new String[] {""} ;
      P0A3U2_A299CliRegIVA = new String[] {""} ;
      P0A3U2_A497FpgCod = new String[] {""} ;
      A259CliDiaPag = "" ;
      A261CliDtoGrl = DecimalUtil.ZERO ;
      A262CliDtoPpg = DecimalUtil.ZERO ;
      A296CliPrd = "" ;
      A299CliRegIVA = "" ;
      A497FpgCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.datosclifpg__default(),
         new Object[] {
             new Object[] {
            P0A3U2_A396EmprCod, P0A3U2_A252CliCod, P0A3U2_A297CliPri, P0A3U2_A259CliDiaPag, P0A3U2_A261CliDtoGrl, P0A3U2_A262CliDtoPpg, P0A3U2_A280CliNroVto, P0A3U2_A296CliPrd, P0A3U2_A299CliRegIVA, P0A3U2_A497FpgCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8CliNroVto ;
   private byte A280CliNroVto ;
   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal AV12CliDtoGrl ;
   private java.math.BigDecimal AV13CliDtoppg ;
   private java.math.BigDecimal A261CliDtoGrl ;
   private java.math.BigDecimal A262CliDtoPpg ;
   private String A396EmprCod ;
   private String A297CliPri ;
   private String AV9CliPrd ;
   private String AV10CliDiaPag ;
   private String AV11FpgCod ;
   private String AV14CliRegIva ;
   private String scmdbuf ;
   private String A259CliDiaPag ;
   private String A296CliPrd ;
   private String A299CliRegIVA ;
   private String A497FpgCod ;
   private String[] aP9 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A3U2_A396EmprCod ;
   private int[] P0A3U2_A252CliCod ;
   private String[] P0A3U2_A297CliPri ;
   private String[] P0A3U2_A259CliDiaPag ;
   private java.math.BigDecimal[] P0A3U2_A261CliDtoGrl ;
   private java.math.BigDecimal[] P0A3U2_A262CliDtoPpg ;
   private byte[] P0A3U2_A280CliNroVto ;
   private String[] P0A3U2_A296CliPrd ;
   private String[] P0A3U2_A299CliRegIVA ;
   private String[] P0A3U2_A497FpgCod ;
}

final  class datosclifpg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A3U2", "SELECT EmprCod, CliCod, CliPri, CliDiaPag, CliDtoGrl, CliDtoPpg, CliNroVto, CliPrd, CliRegIVA, FpgCod FROM TXPCLIFPG WHERE EmprCod = ? and CliCod = ? and CliPri = ? ORDER BY EmprCod, CliCod, CliPri ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 2);
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

