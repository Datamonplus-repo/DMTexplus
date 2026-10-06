package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlcant extends GXProcedure
{
   public pctrlcant( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlcant.class ), "" );
   }

   public pctrlcant( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             byte[] aP7 )
   {
      pctrlcant.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 )
   {
      pctrlcant.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlcant.this.AV13PrdNum = aP1[0];
      this.aP1 = aP1;
      pctrlcant.this.AV12PrdExialm = aP2[0];
      this.aP2 = aP2;
      pctrlcant.this.AV11PrdCanres = aP3[0];
      this.aP3 = aP3;
      pctrlcant.this.AV9PrdCant = aP4[0];
      this.aP4 = aP4;
      pctrlcant.this.AV15Prdexicc = aP5[0];
      this.aP5 = aP5;
      pctrlcant.this.AV10oldPrdCant = aP6[0];
      this.aP6 = aP6;
      pctrlcant.this.AV16Almcc = aP7[0];
      this.aP7 = aP7;
      pctrlcant.this.Gx_msg = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      AV17Cant = AV11PrdCanres ;
      AV18CantAnt = AV10oldPrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      AV19CantNew = AV9PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      if ( AV16Almcc == 0 )
      {
         if ( (AV12PrdExialm.subtract(AV11PrdCanres)).doubleValue() <= 0 )
         {
            Gx_msg = httpContext.getMessage( "Existencias en Almacen ", "") + GXutil.str( AV12PrdExialm, 12, 4) + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "Resto Cant anterior   ", "") + GXutil.str( AV18CantAnt, 12, 4) + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "Sumo  Cant nueva      ", "") + GXutil.str( AV19CantNew, 12, 4) + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "Reserva               ", "") + GXutil.str( AV11PrdCanres, 12, 4) + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "Cantidad a descontar  ", "") + GXutil.str( AV17Cant, 12, 4) + httpContext.getMessage( " es mayor a las Existencias en Almacen", "") + GXutil.newLine( ) ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
      }
      else
      {
         if ( (AV15Prdexicc.subtract((AV11PrdCanres))).doubleValue() <= 0 )
         {
            Gx_msg = httpContext.getMessage( "No hay suficiente cantidad en Existencias en CC", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrlcant.this.A396EmprCod;
      this.aP1[0] = pctrlcant.this.AV13PrdNum;
      this.aP2[0] = pctrlcant.this.AV12PrdExialm;
      this.aP3[0] = pctrlcant.this.AV11PrdCanres;
      this.aP4[0] = pctrlcant.this.AV9PrdCant;
      this.aP5[0] = pctrlcant.this.AV15Prdexicc;
      this.aP6[0] = pctrlcant.this.AV10oldPrdCant;
      this.aP7[0] = pctrlcant.this.AV16Almcc;
      this.aP8[0] = pctrlcant.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Cant = DecimalUtil.ZERO ;
      AV18CantAnt = DecimalUtil.ZERO ;
      AV19CantNew = DecimalUtil.ZERO ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Almcc ;
   private short Gx_err ;
   private java.math.BigDecimal AV12PrdExialm ;
   private java.math.BigDecimal AV11PrdCanres ;
   private java.math.BigDecimal AV9PrdCant ;
   private java.math.BigDecimal AV15Prdexicc ;
   private java.math.BigDecimal AV10oldPrdCant ;
   private java.math.BigDecimal AV17Cant ;
   private java.math.BigDecimal AV18CantAnt ;
   private java.math.BigDecimal AV19CantNew ;
   private String A396EmprCod ;
   private String AV13PrdNum ;
   private String Gx_msg ;
   private String[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private byte[] aP7 ;
}

