package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmtsmins extends GXProcedure
{
   public pmtsmins( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmtsmins.class ), "" );
   }

   public pmtsmins( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( java.math.BigDecimal aP0 ,
                                           java.math.BigDecimal aP1 ,
                                           byte aP2 ,
                                           short aP3 ,
                                           java.math.BigDecimal aP4 )
   {
      pmtsmins.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( java.math.BigDecimal aP0 ,
                        java.math.BigDecimal aP1 ,
                        byte aP2 ,
                        short aP3 ,
                        java.math.BigDecimal aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( java.math.BigDecimal aP0 ,
                             java.math.BigDecimal aP1 ,
                             byte aP2 ,
                             short aP3 ,
                             java.math.BigDecimal aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pmtsmins.this.AV8PMDKgmMinS = aP0;
      pmtsmins.this.AV9BarAlbKgmE = aP1;
      pmtsmins.this.AV10OkKgMin = aP2;
      pmtsmins.this.AV12BarAncAca1 = aP3;
      pmtsmins.this.AV14BarAlbMtrE = aP4;
      pmtsmins.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11MtsMinS = DecimalUtil.ZERO ;
      if ( ( DecimalUtil.compareTo(AV8PMDKgmMinS, AV9BarAlbKgmE) == 0 ) && ( AV10OkKgMin == 1 ) )
      {
         AV13Ancho = DecimalUtil.doubleToDec(AV12BarAncAca1/ (double) (100)) ;
         if ( (DecimalUtil.doubleToDec(AV15BarGraAca).multiply(AV13Ancho)).doubleValue() > 0 )
         {
            AV11MtsMinS = (AV9BarAlbKgmE.divide((DecimalUtil.doubleToDec(AV15BarGraAca).multiply(AV13Ancho)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) ;
         }
         else
         {
            AV11MtsMinS = AV14BarAlbMtrE ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = pmtsmins.this.AV11MtsMinS;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11MtsMinS = DecimalUtil.ZERO ;
      AV13Ancho = DecimalUtil.ZERO ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10OkKgMin ;
   private short AV12BarAncAca1 ;
   private short AV15BarGraAca ;
   private short Gx_err ;
   private java.math.BigDecimal AV8PMDKgmMinS ;
   private java.math.BigDecimal AV9BarAlbKgmE ;
   private java.math.BigDecimal AV14BarAlbMtrE ;
   private java.math.BigDecimal AV11MtsMinS ;
   private java.math.BigDecimal AV13Ancho ;
   private java.math.BigDecimal[] aP5 ;
}

