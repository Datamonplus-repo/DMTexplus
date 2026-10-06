package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psukmpz extends GXProcedure
{
   public psukmpz( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psukmpz.class ), "" );
   }

   public psukmpz( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           int[] aP2 ,
                                           java.math.BigDecimal[] aP3 )
   {
      psukmpz.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      psukmpz.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psukmpz.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      psukmpz.this.A44AlbRecCod = aP2[0];
      this.aP2 = aP2;
      psukmpz.this.AV34DisPieMet = aP3[0];
      this.aP3 = aP3;
      psukmpz.this.AV33DisPieKil = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33DisPieKil = DecimalUtil.doubleToDec(0) ;
      AV34DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P01LB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      cV29Piezas = P01LB2_AV29Piezas[0] ;
      c384DisPieMet = P01LB2_A384DisPieMet[0] ;
      c382DisPieKil = P01LB2_A382DisPieKil[0] ;
      pr_default.close(0);
      AV29Piezas = (byte)(AV29Piezas+cV29Piezas*1) ;
      AV34DisPieMet = AV34DisPieMet.add(c384DisPieMet) ;
      AV33DisPieKil = AV33DisPieKil.add(c382DisPieKil) ;
      /* End optimized group. */
      AV39texto = httpContext.getMessage( "TOTALES Recepcion: ", "") + GXutil.str( A44AlbRecCod, 8, 0) + httpContext.getMessage( " Piezas: ", "") + GXutil.str( AV29Piezas, 4, 0) + httpContext.getMessage( " Kilos: ", "") + GXutil.str( AV33DisPieKil, 7, 2) + httpContext.getMessage( " Metros: ", "") + GXutil.str( AV34DisPieMet, 7, 2) ;
      System.out.println( AV39texto );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psukmpz.this.A396EmprCod;
      this.aP1[0] = psukmpz.this.A361DisCod;
      this.aP2[0] = psukmpz.this.A44AlbRecCod;
      this.aP3[0] = psukmpz.this.AV34DisPieMet;
      this.aP4[0] = psukmpz.this.AV33DisPieKil;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      c384DisPieMet = DecimalUtil.ZERO ;
      c382DisPieKil = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01LB2_AV29Piezas = new byte[1] ;
      P01LB2_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LB2_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV39texto = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psukmpz__default(),
         new Object[] {
             new Object[] {
            P01LB2_AV29Piezas, P01LB2_A384DisPieMet, P01LB2_A382DisPieKil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte cV29Piezas ;
   private byte AV29Piezas ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV34DisPieMet ;
   private java.math.BigDecimal AV33DisPieKil ;
   private java.math.BigDecimal c384DisPieMet ;
   private java.math.BigDecimal c382DisPieKil ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String AV39texto ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private byte[] P01LB2_AV29Piezas ;
   private java.math.BigDecimal[] P01LB2_A384DisPieMet ;
   private java.math.BigDecimal[] P01LB2_A382DisPieKil ;
}

final  class psukmpz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01LB2", "SELECT COUNT(*), SUM(DisPieMet), SUM(DisPieKil) FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

