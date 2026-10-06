package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactpzl extends GXProcedure
{
   public pactpzl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactpzl.class ), "" );
   }

   public pactpzl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             java.util.Date[] aP12 )
   {
      pactpzl.this.aP13 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        int[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 ,
                        byte[] aP11 ,
                        java.util.Date[] aP12 ,
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             java.util.Date[] aP12 ,
                             String[] aP13 )
   {
      pactpzl.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pactpzl.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pactpzl.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pactpzl.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      pactpzl.this.AV19Kilos = aP4[0];
      this.aP4 = aP4;
      pactpzl.this.AV20Metros = aP5[0];
      this.aP5 = aP5;
      pactpzl.this.AV21Piezas = aP6[0];
      this.aP6 = aP6;
      pactpzl.this.AV22KilAnt = aP7[0];
      this.aP7 = aP7;
      pactpzl.this.AV23MtrAnt = aP8[0];
      this.aP8 = aP8;
      pactpzl.this.AV24PieAnt = aP9[0];
      this.aP9 = aP9;
      pactpzl.this.AV25Modo = aP10[0];
      this.aP10 = aP10;
      pactpzl.this.AV26BarSit = aP11[0];
      this.aP11 = aP11;
      pactpzl.this.AV39FecSal = aP12[0];
      this.aP12 = aP12;
      pactpzl.this.AV43Tipo_ent = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV15EmprCod ;
      GXv_int2[0] = AV16BarCod ;
      GXv_int3[0] = AV17BarCodReo ;
      GXv_char4[0] = AV18BarCodPar ;
      GXv_decimal5[0] = AV19Kilos ;
      GXv_decimal6[0] = AV20Metros ;
      GXv_int7[0] = AV21Piezas ;
      GXv_decimal8[0] = AV22KilAnt ;
      GXv_decimal9[0] = AV23MtrAnt ;
      GXv_int10[0] = AV24PieAnt ;
      GXv_char11[0] = AV25Modo ;
      new app.pcampie(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_int10, GXv_char11) ;
      pactpzl.this.AV15EmprCod = GXv_char1[0] ;
      pactpzl.this.AV16BarCod = GXv_int2[0] ;
      pactpzl.this.AV17BarCodReo = GXv_int3[0] ;
      pactpzl.this.AV18BarCodPar = GXv_char4[0] ;
      pactpzl.this.AV19Kilos = GXv_decimal5[0] ;
      pactpzl.this.AV20Metros = GXv_decimal6[0] ;
      pactpzl.this.AV21Piezas = GXv_int7[0] ;
      pactpzl.this.AV22KilAnt = GXv_decimal8[0] ;
      pactpzl.this.AV23MtrAnt = GXv_decimal9[0] ;
      pactpzl.this.AV24PieAnt = GXv_int10[0] ;
      pactpzl.this.AV25Modo = GXv_char11[0] ;
      AV27OK = " " ;
      if ( GXutil.strcmp(AV43Tipo_ent, httpContext.getMessage( "T", "")) == 0 )
      {
         AV27OK = httpContext.getMessage( "S", "") ;
      }
      else
      {
         AV27OK = httpContext.getMessage( "N", "") ;
      }
      if ( GXutil.strcmp(AV27OK, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char11[0] = AV15EmprCod ;
         GXv_int10[0] = AV16BarCod ;
         GXv_int3[0] = AV17BarCodReo ;
         GXv_char4[0] = AV18BarCodPar ;
         GXv_char1[0] = httpContext.getMessage( "C", "") ;
         new app.pciebar(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int3, GXv_char4, GXv_char1) ;
         pactpzl.this.AV15EmprCod = GXv_char11[0] ;
         pactpzl.this.AV16BarCod = GXv_int10[0] ;
         pactpzl.this.AV17BarCodReo = GXv_int3[0] ;
         pactpzl.this.AV18BarCodPar = GXv_char4[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactpzl.this.AV15EmprCod;
      this.aP1[0] = pactpzl.this.AV16BarCod;
      this.aP2[0] = pactpzl.this.AV17BarCodReo;
      this.aP3[0] = pactpzl.this.AV18BarCodPar;
      this.aP4[0] = pactpzl.this.AV19Kilos;
      this.aP5[0] = pactpzl.this.AV20Metros;
      this.aP6[0] = pactpzl.this.AV21Piezas;
      this.aP7[0] = pactpzl.this.AV22KilAnt;
      this.aP8[0] = pactpzl.this.AV23MtrAnt;
      this.aP9[0] = pactpzl.this.AV24PieAnt;
      this.aP10[0] = pactpzl.this.AV25Modo;
      this.aP11[0] = pactpzl.this.AV26BarSit;
      this.aP12[0] = pactpzl.this.AV39FecSal;
      this.aP13[0] = pactpzl.this.AV43Tipo_ent;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new int[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_int7 = new int[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV27OK = "" ;
      GXv_char11 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char1 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV26BarSit ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int AV21Piezas ;
   private int AV24PieAnt ;
   private int GXv_int2[] ;
   private int GXv_int7[] ;
   private int GXv_int10[] ;
   private java.math.BigDecimal AV19Kilos ;
   private java.math.BigDecimal AV20Metros ;
   private java.math.BigDecimal AV22KilAnt ;
   private java.math.BigDecimal AV23MtrAnt ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV25Modo ;
   private String AV43Tipo_ent ;
   private String AV27OK ;
   private String GXv_char11[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private java.util.Date AV39FecSal ;
   private String[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private int[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private int[] aP9 ;
   private String[] aP10 ;
   private byte[] aP11 ;
   private java.util.Date[] aP12 ;
}

