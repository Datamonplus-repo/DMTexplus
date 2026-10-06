package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcls009 extends GXProcedure
{
   public pcls009( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcls009.class ), "" );
   }

   public pcls009( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           java.math.BigDecimal[] aP1 ,
                                           java.math.BigDecimal[] aP2 ,
                                           java.math.BigDecimal[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 )
   {
      pcls009.this.aP8 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        java.math.BigDecimal[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             java.math.BigDecimal[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 )
   {
      pcls009.this.AV31PrdNum = aP0[0];
      this.aP0 = aP0;
      pcls009.this.AV26CosPro = aP1[0];
      this.aP1 = aP1;
      pcls009.this.AV25CosAny = aP2[0];
      this.aP2 = aP2;
      pcls009.this.AV24BarCosPD = aP3[0];
      this.aP3 = aP3;
      pcls009.this.AV20BarCosAD = aP4[0];
      this.aP4 = aP4;
      pcls009.this.AV19BarCosAA = aP5[0];
      this.aP5 = aP5;
      pcls009.this.AV23BarCosPA = aP6[0];
      this.aP6 = aP6;
      pcls009.this.AV22BarCosCol = aP7[0];
      this.aP7 = aP7;
      pcls009.this.AV21BarCosAnc = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV29NumDig = (byte)(GXutil.len( AV31PrdNum)) ;
      if ( AV29NumDig == 6 )
      {
         Gx_msg = httpContext.getMessage( "&NumDig=", "") + GXutil.str( AV29NumDig, 2, 0) + httpContext.getMessage( ".PCLs009", "") ;
         AV30NumGru = (byte)(2) ;
         AV28Grupo6 = GXutil.substring( AV31PrdNum, 1, AV30NumGru) ;
         AV33ValGru6 = (byte)(GXutil.lval( AV28Grupo6)) ;
         if ( ( AV33ValGru6 >= 80 ) && ( AV33ValGru6 <= 89 ) )
         {
            Gx_msg = httpContext.getMessage( "&ValGru6=", "") + GXutil.str( AV33ValGru6, 2, 0) + httpContext.getMessage( ".PCLs009", "") ;
            AV19BarCosAA = AV19BarCosAA.add(AV25CosAny) ;
            AV23BarCosPA = AV23BarCosPA.add(AV26CosPro) ;
         }
         if ( ( AV33ValGru6 >= 90 ) && ( AV33ValGru6 <= 99 ) )
         {
            Gx_msg = httpContext.getMessage( "&ValGru6=", "") + GXutil.str( AV33ValGru6, 2, 0) + httpContext.getMessage( ".PCLs009", "") ;
            AV20BarCosAD = AV20BarCosAD.add(AV25CosAny) ;
            AV24BarCosPD = AV24BarCosPD.add(AV26CosPro) ;
         }
         if ( ( AV33ValGru6 >= 10 ) && ( AV33ValGru6 <= 79 ) )
         {
            Gx_msg = httpContext.getMessage( "&ValGru6=", "") + GXutil.str( AV33ValGru6, 2, 0) + httpContext.getMessage( ".PCLs009", "") ;
            AV21BarCosAnc = AV21BarCosAnc.add(AV25CosAny) ;
            AV22BarCosCol = AV22BarCosCol.add(AV26CosPro) ;
         }
      }
      if ( AV29NumDig == 5 )
      {
         AV30NumGru = (byte)(1) ;
         AV27Grupo5 = GXutil.substring( AV31PrdNum, 1, AV30NumGru) ;
         AV32ValGru5 = (byte)(GXutil.lval( AV27Grupo5)) ;
         if ( AV32ValGru5 == 8 )
         {
            AV19BarCosAA = AV19BarCosAA.add(AV25CosAny) ;
            AV23BarCosPA = AV23BarCosPA.add(AV26CosPro) ;
         }
         if ( AV32ValGru5 == 9 )
         {
            AV20BarCosAD = AV20BarCosAD.add(AV25CosAny) ;
            AV24BarCosPD = AV24BarCosPD.add(AV26CosPro) ;
         }
         if ( ( AV32ValGru5 >= 1 ) && ( AV32ValGru5 <= 7 ) )
         {
            AV21BarCosAnc = AV21BarCosAnc.add(AV25CosAny) ;
            AV22BarCosCol = AV22BarCosCol.add(AV26CosPro) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcls009.this.AV31PrdNum;
      this.aP1[0] = pcls009.this.AV26CosPro;
      this.aP2[0] = pcls009.this.AV25CosAny;
      this.aP3[0] = pcls009.this.AV24BarCosPD;
      this.aP4[0] = pcls009.this.AV20BarCosAD;
      this.aP5[0] = pcls009.this.AV19BarCosAA;
      this.aP6[0] = pcls009.this.AV23BarCosPA;
      this.aP7[0] = pcls009.this.AV22BarCosCol;
      this.aP8[0] = pcls009.this.AV21BarCosAnc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      AV28Grupo6 = "" ;
      AV27Grupo5 = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV29NumDig ;
   private byte AV30NumGru ;
   private byte AV33ValGru6 ;
   private byte AV32ValGru5 ;
   private short Gx_err ;
   private java.math.BigDecimal AV26CosPro ;
   private java.math.BigDecimal AV25CosAny ;
   private java.math.BigDecimal AV24BarCosPD ;
   private java.math.BigDecimal AV20BarCosAD ;
   private java.math.BigDecimal AV19BarCosAA ;
   private java.math.BigDecimal AV23BarCosPA ;
   private java.math.BigDecimal AV22BarCosCol ;
   private java.math.BigDecimal AV21BarCosAnc ;
   private String AV31PrdNum ;
   private String Gx_msg ;
   private String AV28Grupo6 ;
   private String AV27Grupo5 ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP0 ;
   private java.math.BigDecimal[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
}

