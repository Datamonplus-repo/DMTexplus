package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmetdat extends GXProcedure
{
   public pmetdat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmetdat.class ), "" );
   }

   public pmetdat( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pmetdat.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 )
   {
      pmetdat.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmetdat.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmetdat.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmetdat.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmetdat.this.A2813MetPieCod = aP4[0];
      this.aP4 = aP4;
      pmetdat.this.AV8Kilos = aP5[0];
      this.aP5 = aP5;
      pmetdat.this.AV9Metros = aP6[0];
      this.aP6 = aP6;
      pmetdat.this.AV10AlbPieDsc = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00HU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2814MetPieKil = P00HU2_A2814MetPieKil[0] ;
         A2815MetPieMet = P00HU2_A2815MetPieMet[0] ;
         A2846MetPieDsc = P00HU2_A2846MetPieDsc[0] ;
         A2809MetTerCod = P00HU2_A2809MetTerCod[0] ;
         AV8Kilos = A2814MetPieKil ;
         AV9Metros = A2815MetPieMet ;
         AV10AlbPieDsc = A2846MetPieDsc ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmetdat.this.A396EmprCod;
      this.aP1[0] = pmetdat.this.A129BarCod;
      this.aP2[0] = pmetdat.this.A132BarCodReo;
      this.aP3[0] = pmetdat.this.A130BarCodPar;
      this.aP4[0] = pmetdat.this.A2813MetPieCod;
      this.aP5[0] = pmetdat.this.AV8Kilos;
      this.aP6[0] = pmetdat.this.AV9Metros;
      this.aP7[0] = pmetdat.this.AV10AlbPieDsc;
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
      P00HU2_A396EmprCod = new String[] {""} ;
      P00HU2_A129BarCod = new int[1] ;
      P00HU2_A132BarCodReo = new byte[1] ;
      P00HU2_A130BarCodPar = new String[] {""} ;
      P00HU2_A2813MetPieCod = new String[] {""} ;
      P00HU2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00HU2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00HU2_A2846MetPieDsc = new String[] {""} ;
      P00HU2_A2809MetTerCod = new String[] {""} ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2846MetPieDsc = "" ;
      A2809MetTerCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmetdat__default(),
         new Object[] {
             new Object[] {
            P00HU2_A396EmprCod, P00HU2_A129BarCod, P00HU2_A132BarCodReo, P00HU2_A130BarCodPar, P00HU2_A2813MetPieCod, P00HU2_A2814MetPieKil, P00HU2_A2815MetPieMet, P00HU2_A2846MetPieDsc, P00HU2_A2809MetTerCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV8Kilos ;
   private java.math.BigDecimal AV9Metros ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A2813MetPieCod ;
   private String AV10AlbPieDsc ;
   private String scmdbuf ;
   private String A2846MetPieDsc ;
   private String A2809MetTerCod ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00HU2_A396EmprCod ;
   private int[] P00HU2_A129BarCod ;
   private byte[] P00HU2_A132BarCodReo ;
   private String[] P00HU2_A130BarCodPar ;
   private String[] P00HU2_A2813MetPieCod ;
   private java.math.BigDecimal[] P00HU2_A2814MetPieKil ;
   private java.math.BigDecimal[] P00HU2_A2815MetPieMet ;
   private String[] P00HU2_A2846MetPieDsc ;
   private String[] P00HU2_A2809MetTerCod ;
}

final  class pmetdat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00HU2", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieDsc, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
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
               stmt.setString(5, (String)parms[4], 9);
               return;
      }
   }

}

