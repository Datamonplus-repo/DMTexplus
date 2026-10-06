package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class piezasaentregar extends GXProcedure
{
   public piezasaentregar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( piezasaentregar.class ), "" );
   }

   public piezasaentregar( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          byte aP2 ,
                          String aP3 )
   {
      piezasaentregar.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int[] aP4 )
   {
      piezasaentregar.this.A396EmprCod = aP0;
      piezasaentregar.this.A129BarCod = aP1;
      piezasaentregar.this.A132BarCodReo = aP2;
      piezasaentregar.this.A130BarCodPar = aP3;
      piezasaentregar.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Metros = DecimalUtil.ZERO ;
      AV10BarKgm = DecimalUtil.ZERO ;
      AV12PzasLan = 0 ;
      AV11BarKgm2 = DecimalUtil.doubleToDec(0) ;
      AV9Metros2 = DecimalUtil.doubleToDec(0) ;
      AV15BarKgm1 = DecimalUtil.doubleToDec(0) ;
      AV14Metros1 = DecimalUtil.doubleToDec(0) ;
      AV16PzasLan1 = 0 ;
      /* Using cursor P0ACI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1909BarGraAca = P0ACI2_A1909BarGraAca[0] ;
         A125BarAncAca1 = P0ACI2_A125BarAncAca1[0] ;
         AV18BarGraAca = A1909BarGraAca ;
         AV19BarAncAca1 = A125BarAncAca1 ;
         /* Using cursor P0ACI3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3277BarPieAut = P0ACI3_A3277BarPieAut[0] ;
            n3277BarPieAut = P0ACI3_n3277BarPieAut[0] ;
            A1501BarPiePie = P0ACI3_A1501BarPiePie[0] ;
            A1271BarPieLzd = P0ACI3_A1271BarPieLzd[0] ;
            A200BarPieCod = P0ACI3_A200BarPieCod[0] ;
            if ( (0==A3277BarPieAut) )
            {
               AV16PzasLan1 = (int)(AV16PzasLan1+A1501BarPiePie) ;
            }
            else
            {
               AV16PzasLan1 = (int)(AV16PzasLan1+A3277BarPieAut) ;
            }
            AV13PzasLan2 = (int)(AV13PzasLan2+A1271BarPieLzd) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV12PzasLan = (int)(AV16PzasLan1-AV13PzasLan2) ;
      AV12PzasLan = ((AV12PzasLan<0) ? 0 : AV12PzasLan) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = piezasaentregar.this.AV12PzasLan;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Metros = DecimalUtil.ZERO ;
      AV10BarKgm = DecimalUtil.ZERO ;
      AV11BarKgm2 = DecimalUtil.ZERO ;
      AV9Metros2 = DecimalUtil.ZERO ;
      AV15BarKgm1 = DecimalUtil.ZERO ;
      AV14Metros1 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0ACI2_A396EmprCod = new String[] {""} ;
      P0ACI2_A129BarCod = new int[1] ;
      P0ACI2_A132BarCodReo = new byte[1] ;
      P0ACI2_A130BarCodPar = new String[] {""} ;
      P0ACI2_A1909BarGraAca = new short[1] ;
      P0ACI2_A125BarAncAca1 = new short[1] ;
      P0ACI3_A396EmprCod = new String[] {""} ;
      P0ACI3_A129BarCod = new int[1] ;
      P0ACI3_A132BarCodReo = new byte[1] ;
      P0ACI3_A130BarCodPar = new String[] {""} ;
      P0ACI3_A3277BarPieAut = new short[1] ;
      P0ACI3_n3277BarPieAut = new boolean[] {false} ;
      P0ACI3_A1501BarPiePie = new int[1] ;
      P0ACI3_A1271BarPieLzd = new int[1] ;
      P0ACI3_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.piezasaentregar__default(),
         new Object[] {
             new Object[] {
            P0ACI2_A396EmprCod, P0ACI2_A129BarCod, P0ACI2_A132BarCodReo, P0ACI2_A130BarCodPar, P0ACI2_A1909BarGraAca, P0ACI2_A125BarAncAca1
            }
            , new Object[] {
            P0ACI3_A396EmprCod, P0ACI3_A129BarCod, P0ACI3_A132BarCodReo, P0ACI3_A130BarCodPar, P0ACI3_A3277BarPieAut, P0ACI3_n3277BarPieAut, P0ACI3_A1501BarPiePie, P0ACI3_A1271BarPieLzd, P0ACI3_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short AV18BarGraAca ;
   private short AV19BarAncAca1 ;
   private short A3277BarPieAut ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV12PzasLan ;
   private int AV16PzasLan1 ;
   private int A1501BarPiePie ;
   private int A1271BarPieLzd ;
   private int AV13PzasLan2 ;
   private java.math.BigDecimal AV8Metros ;
   private java.math.BigDecimal AV10BarKgm ;
   private java.math.BigDecimal AV11BarKgm2 ;
   private java.math.BigDecimal AV9Metros2 ;
   private java.math.BigDecimal AV15BarKgm1 ;
   private java.math.BigDecimal AV14Metros1 ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private boolean n3277BarPieAut ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ACI2_A396EmprCod ;
   private int[] P0ACI2_A129BarCod ;
   private byte[] P0ACI2_A132BarCodReo ;
   private String[] P0ACI2_A130BarCodPar ;
   private short[] P0ACI2_A1909BarGraAca ;
   private short[] P0ACI2_A125BarAncAca1 ;
   private String[] P0ACI3_A396EmprCod ;
   private int[] P0ACI3_A129BarCod ;
   private byte[] P0ACI3_A132BarCodReo ;
   private String[] P0ACI3_A130BarCodPar ;
   private short[] P0ACI3_A3277BarPieAut ;
   private boolean[] P0ACI3_n3277BarPieAut ;
   private int[] P0ACI3_A1501BarPiePie ;
   private int[] P0ACI3_A1271BarPieLzd ;
   private String[] P0ACI3_A200BarPieCod ;
}

final  class piezasaentregar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ACI2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarGraAca, BarAncAca1 FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ACI3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieAut, BarPiePie, BarPieLzd, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 9);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

