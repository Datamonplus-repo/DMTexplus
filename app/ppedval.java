package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedval extends GXProcedure
{
   public ppedval( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedval.class ), "" );
   }

   public ppedval( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           java.math.BigDecimal[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           byte[] aP6 )
   {
      ppedval.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      ppedval.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedval.this.AV9PedCod = aP1[0];
      this.aP1 = aP1;
      ppedval.this.AV10PrdNum = aP2[0];
      this.aP2 = aP2;
      ppedval.this.AV11PedUni = aP3[0];
      this.aP3 = aP3;
      ppedval.this.AV12PedPre = aP4[0];
      this.aP4 = aP4;
      ppedval.this.AV13PedDto = aP5[0];
      this.aP5 = aP5;
      ppedval.this.AV14EmpNumDec = aP6[0];
      this.aP6 = aP6;
      ppedval.this.AV15Valor = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( DecimalUtil.compareTo((AV11PedUni.multiply(AV12PedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((AV13PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), DecimalUtil.stringToDec("999999999.99")) > 0 )
      {
         AV15Valor = DecimalUtil.stringToDec("999999999.99") ;
      }
      else
      {
         if ( AV14EmpNumDec == 0 )
         {
            AV15Valor = GXutil.roundDecimal( (AV11PedUni.multiply(AV12PedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((AV13PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 0) ;
         }
         if ( AV14EmpNumDec == 2 )
         {
            AV15Valor = GXutil.roundDecimal( (AV11PedUni.multiply(AV12PedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((AV13PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedval.this.AV8EmprCod;
      this.aP1[0] = ppedval.this.AV9PedCod;
      this.aP2[0] = ppedval.this.AV10PrdNum;
      this.aP3[0] = ppedval.this.AV11PedUni;
      this.aP4[0] = ppedval.this.AV12PedPre;
      this.aP5[0] = ppedval.this.AV13PedDto;
      this.aP6[0] = ppedval.this.AV14EmpNumDec;
      this.aP7[0] = ppedval.this.AV15Valor;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14EmpNumDec ;
   private short Gx_err ;
   private int AV9PedCod ;
   private java.math.BigDecimal AV11PedUni ;
   private java.math.BigDecimal AV12PedPre ;
   private java.math.BigDecimal AV13PedDto ;
   private java.math.BigDecimal AV15Valor ;
   private String AV8EmprCod ;
   private String AV10PrdNum ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
}

