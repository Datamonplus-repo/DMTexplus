package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class calculosdiferenciasrecuento extends GXProcedure
{
   public calculosdiferenciasrecuento( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( calculosdiferenciasrecuento.class ), "" );
   }

   public calculosdiferenciasrecuento( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( java.math.BigDecimal aP0 ,
                                           java.math.BigDecimal aP1 )
   {
      calculosdiferenciasrecuento.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( java.math.BigDecimal aP0 ,
                        java.math.BigDecimal aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( java.math.BigDecimal aP0 ,
                             java.math.BigDecimal aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      calculosdiferenciasrecuento.this.AV10RecExiTeo = aP0;
      calculosdiferenciasrecuento.this.AV11RecExiRea = aP1;
      calculosdiferenciasrecuento.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8DifAlmacen = AV10RecExiTeo.subtract(AV11RecExiRea) ;
      AV12DifAlmacen2 = ((AV8DifAlmacen.doubleValue()<0) ? (AV8DifAlmacen.multiply(DecimalUtil.doubleToDec(-1))) : AV8DifAlmacen) ;
      AV9DifAlmPor = ((AV10RecExiTeo.doubleValue()!=0) ? (AV12DifAlmacen2.divide(AV10RecExiTeo, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = calculosdiferenciasrecuento.this.AV9DifAlmPor;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9DifAlmPor = DecimalUtil.ZERO ;
      AV8DifAlmacen = DecimalUtil.ZERO ;
      AV12DifAlmacen2 = DecimalUtil.ZERO ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV10RecExiTeo ;
   private java.math.BigDecimal AV11RecExiRea ;
   private java.math.BigDecimal AV9DifAlmPor ;
   private java.math.BigDecimal AV8DifAlmacen ;
   private java.math.BigDecimal AV12DifAlmacen2 ;
   private java.math.BigDecimal[] aP2 ;
}

