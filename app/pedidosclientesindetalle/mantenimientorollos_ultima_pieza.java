package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mantenimientorollos_ultima_pieza extends GXProcedure
{
   public mantenimientorollos_ultima_pieza( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientorollos_ultima_pieza.class ), "" );
   }

   public mantenimientorollos_ultima_pieza( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            byte aP2 ,
                            String aP3 ,
                            short[] aP4 ,
                            java.math.BigDecimal[] aP5 )
   {
      mantenimientorollos_ultima_pieza.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 )
   {
      mantenimientorollos_ultima_pieza.this.A396EmprCod = aP0;
      mantenimientorollos_ultima_pieza.this.A129BarCod = aP1;
      mantenimientorollos_ultima_pieza.this.A132BarCodReo = aP2;
      mantenimientorollos_ultima_pieza.this.A130BarCodPar = aP3;
      mantenimientorollos_ultima_pieza.this.aP4 = aP4;
      mantenimientorollos_ultima_pieza.this.aP5 = aP5;
      mantenimientorollos_ultima_pieza.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ancho = (short)(0) ;
      AV9grm2 = DecimalUtil.ZERO ;
      AV11Barordlin = (short)(0) ;
      /* Using cursor P0AAI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6635MetPieAnc = P0AAI2_A6635MetPieAnc[0] ;
         A4910MetPieMtD = P0AAI2_A4910MetPieMtD[0] ;
         A4917MetPieObs = P0AAI2_A4917MetPieObs[0] ;
         A2813MetPieCod = P0AAI2_A2813MetPieCod[0] ;
         A2809MetTerCod = P0AAI2_A2809MetTerCod[0] ;
         AV8Ancho = A6635MetPieAnc ;
         AV9grm2 = A4910MetPieMtD ;
         AV11Barordlin = (short)(GXutil.lval( GXutil.substring( A4917MetPieObs, 18, 8))) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = mantenimientorollos_ultima_pieza.this.AV8Ancho;
      this.aP5[0] = mantenimientorollos_ultima_pieza.this.AV9grm2;
      this.aP6[0] = mantenimientorollos_ultima_pieza.this.AV11Barordlin;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9grm2 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AAI2_A396EmprCod = new String[] {""} ;
      P0AAI2_A129BarCod = new int[1] ;
      P0AAI2_A132BarCodReo = new byte[1] ;
      P0AAI2_A130BarCodPar = new String[] {""} ;
      P0AAI2_A6635MetPieAnc = new short[1] ;
      P0AAI2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAI2_A4917MetPieObs = new String[] {""} ;
      P0AAI2_A2813MetPieCod = new String[] {""} ;
      P0AAI2_A2809MetTerCod = new String[] {""} ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A4917MetPieObs = "" ;
      A2813MetPieCod = "" ;
      A2809MetTerCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.mantenimientorollos_ultima_pieza__default(),
         new Object[] {
             new Object[] {
            P0AAI2_A396EmprCod, P0AAI2_A129BarCod, P0AAI2_A132BarCodReo, P0AAI2_A130BarCodPar, P0AAI2_A6635MetPieAnc, P0AAI2_A4910MetPieMtD, P0AAI2_A4917MetPieObs, P0AAI2_A2813MetPieCod, P0AAI2_A2809MetTerCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV8Ancho ;
   private short AV11Barordlin ;
   private short A6635MetPieAnc ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV9grm2 ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A2813MetPieCod ;
   private String A2809MetTerCod ;
   private String A4917MetPieObs ;
   private short[] aP6 ;
   private short[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AAI2_A396EmprCod ;
   private int[] P0AAI2_A129BarCod ;
   private byte[] P0AAI2_A132BarCodReo ;
   private String[] P0AAI2_A130BarCodPar ;
   private short[] P0AAI2_A6635MetPieAnc ;
   private java.math.BigDecimal[] P0AAI2_A4910MetPieMtD ;
   private String[] P0AAI2_A4917MetPieObs ;
   private String[] P0AAI2_A2813MetPieCod ;
   private String[] P0AAI2_A2809MetTerCod ;
}

final  class mantenimientorollos_ultima_pieza__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AAI2", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetPieAnc, MetPieMtD, MetPieObs, MetPieCod, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
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
               return;
      }
   }

}

