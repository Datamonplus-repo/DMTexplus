package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacucos extends GXProcedure
{
   public pacucos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacucos.class ), "" );
   }

   public pacucos( int remoteHandle ,
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
      pacucos.this.aP8 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      pacucos.this.AV24PrdNum = aP0[0];
      this.aP0 = aP0;
      pacucos.this.AV25CosPro = aP1[0];
      this.aP1 = aP1;
      pacucos.this.AV26CosAny = aP2[0];
      this.aP2 = aP2;
      pacucos.this.AV27BarCosPD = aP3[0];
      this.aP3 = aP3;
      pacucos.this.AV28BarCosAD = aP4[0];
      this.aP4 = aP4;
      pacucos.this.AV29BarCosAA = aP5[0];
      this.aP5 = aP5;
      pacucos.this.AV30BarCosPA = aP6[0];
      this.aP6 = aP6;
      pacucos.this.AV31BarCosCol = aP7[0];
      this.aP7 = aP7;
      pacucos.this.AV32BarCosAnc = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "In PACUCOS", "") );
      AV33NumDig = (byte)(GXutil.len( AV24PrdNum)) ;
      if ( AV33NumDig == 6 )
      {
         Gx_msg = httpContext.getMessage( "&NumDig=", "") + GXutil.str( AV33NumDig, 2, 0) + httpContext.getMessage( ".PACUCOS", "") ;
         System.out.println( Gx_msg );
         AV35NumGru = (byte)(2) ;
         AV34Grupo6 = GXutil.substring( AV24PrdNum, 1, AV35NumGru) ;
         AV37ValGru6 = (byte)(GXutil.lval( AV34Grupo6)) ;
         if ( ( AV37ValGru6 >= 80 ) && ( AV37ValGru6 <= 89 ) )
         {
            Gx_msg = httpContext.getMessage( "&ValGru6=", "") + GXutil.str( AV37ValGru6, 2, 0) + httpContext.getMessage( ".PACUCOS", "") ;
            System.out.println( Gx_msg );
            AV29BarCosAA = AV29BarCosAA.add(AV26CosAny) ;
            AV30BarCosPA = AV30BarCosPA.add(AV25CosPro) ;
         }
         if ( ( AV37ValGru6 >= 90 ) && ( AV37ValGru6 <= 99 ) )
         {
            Gx_msg = httpContext.getMessage( "&ValGru6=", "") + GXutil.str( AV37ValGru6, 2, 0) + httpContext.getMessage( ".PACUCOS", "") ;
            System.out.println( Gx_msg );
            AV28BarCosAD = AV28BarCosAD.add(AV26CosAny) ;
            AV27BarCosPD = AV27BarCosPD.add(AV25CosPro) ;
         }
         if ( ( AV37ValGru6 >= 10 ) && ( AV37ValGru6 <= 79 ) )
         {
            Gx_msg = httpContext.getMessage( "&ValGru6=", "") + GXutil.str( AV37ValGru6, 2, 0) + httpContext.getMessage( ".PACUCOS", "") ;
            System.out.println( Gx_msg );
            AV32BarCosAnc = AV32BarCosAnc.add(AV26CosAny) ;
            AV31BarCosCol = AV31BarCosCol.add(AV25CosPro) ;
         }
      }
      System.out.println( httpContext.getMessage( "Return PACUCOS", "") );
      if ( AV33NumDig == 5 )
      {
         AV35NumGru = (byte)(1) ;
         AV36Grupo5 = GXutil.substring( AV24PrdNum, 1, AV35NumGru) ;
         AV38ValGru5 = (byte)(GXutil.lval( AV36Grupo5)) ;
         if ( AV38ValGru5 == 8 )
         {
            AV29BarCosAA = AV29BarCosAA.add(AV26CosAny) ;
            AV30BarCosPA = AV30BarCosPA.add(AV25CosPro) ;
         }
         if ( AV38ValGru5 == 9 )
         {
            AV28BarCosAD = AV28BarCosAD.add(AV26CosAny) ;
            AV27BarCosPD = AV27BarCosPD.add(AV25CosPro) ;
         }
         if ( ( AV38ValGru5 >= 1 ) && ( AV38ValGru5 <= 7 ) )
         {
            AV32BarCosAnc = AV32BarCosAnc.add(AV26CosAny) ;
            AV31BarCosCol = AV31BarCosCol.add(AV25CosPro) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pacucos.this.AV24PrdNum;
      this.aP1[0] = pacucos.this.AV25CosPro;
      this.aP2[0] = pacucos.this.AV26CosAny;
      this.aP3[0] = pacucos.this.AV27BarCosPD;
      this.aP4[0] = pacucos.this.AV28BarCosAD;
      this.aP5[0] = pacucos.this.AV29BarCosAA;
      this.aP6[0] = pacucos.this.AV30BarCosPA;
      this.aP7[0] = pacucos.this.AV31BarCosCol;
      this.aP8[0] = pacucos.this.AV32BarCosAnc;
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
      AV34Grupo6 = "" ;
      AV36Grupo5 = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV33NumDig ;
   private byte AV35NumGru ;
   private byte AV37ValGru6 ;
   private byte AV38ValGru5 ;
   private short Gx_err ;
   private java.math.BigDecimal AV25CosPro ;
   private java.math.BigDecimal AV26CosAny ;
   private java.math.BigDecimal AV27BarCosPD ;
   private java.math.BigDecimal AV28BarCosAD ;
   private java.math.BigDecimal AV29BarCosAA ;
   private java.math.BigDecimal AV30BarCosPA ;
   private java.math.BigDecimal AV31BarCosCol ;
   private java.math.BigDecimal AV32BarCosAnc ;
   private String AV24PrdNum ;
   private String Gx_msg ;
   private String AV34Grupo6 ;
   private String AV36Grupo5 ;
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

