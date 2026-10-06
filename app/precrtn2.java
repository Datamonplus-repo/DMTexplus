package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precrtn2 extends GXProcedure
{
   public precrtn2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precrtn2.class ), "" );
   }

   public precrtn2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          short[] aP4 ,
                          java.math.BigDecimal[] aP5 )
   {
      precrtn2.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 )
   {
      precrtn2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      precrtn2.this.AV13BarCod = aP1[0];
      this.aP1 = aP1;
      precrtn2.this.AV14BarCodReo = aP2[0];
      this.aP2 = aP2;
      precrtn2.this.AV15BarCodPar = aP3[0];
      this.aP3 = aP3;
      precrtn2.this.AV16RecLinMaq = aP4[0];
      this.aP4 = aP4;
      precrtn2.this.AV8RecTotKgs = aP5[0];
      this.aP5 = aP5;
      precrtn2.this.AV9RecVolPrd = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV10Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      precrtn2.this.GXt_char1 = GXv_char2[0] ;
      AV10Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char2, GXv_char3, GXv_char4) ;
      precrtn2.this.A396EmprCod = GXv_char2[0] ;
      precrtn2.this.AV11EmprNom = GXv_char3[0] ;
      precrtn2.this.AV12UsurCod = GXv_char4[0] ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = AV13BarCod ;
      GXv_int6[0] = AV14BarCodReo ;
      GXv_char3[0] = AV15BarCodPar ;
      GXv_int7[0] = AV16RecLinMaq ;
      new app.precrtny(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_int7) ;
      precrtn2.this.A396EmprCod = GXv_char4[0] ;
      precrtn2.this.AV13BarCod = GXv_int5[0] ;
      precrtn2.this.AV14BarCodReo = GXv_int6[0] ;
      precrtn2.this.AV15BarCodPar = GXv_char3[0] ;
      precrtn2.this.AV16RecLinMaq = GXv_int7[0] ;
      AV17Inc_obs = httpContext.getMessage( "Re-lanzamos Receta", "") + GXutil.newLine( ) ;
      AV17Inc_obs += httpContext.getMessage( "Hemos eliminado Reservas Productos", "") ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname, AV12UsurCod, AV10Station, AV17Inc_obs, AV13BarCod, AV14BarCodReo, AV15BarCodPar) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = AV13BarCod ;
      GXv_int6[0] = AV14BarCodReo ;
      GXv_char3[0] = AV15BarCodPar ;
      GXv_int7[0] = AV16RecLinMaq ;
      GXv_decimal8[0] = AV8RecTotKgs ;
      GXv_int9[0] = AV9RecVolPrd ;
      new app.precrtn1(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_int7, GXv_decimal8, GXv_int9) ;
      precrtn2.this.A396EmprCod = GXv_char4[0] ;
      precrtn2.this.AV13BarCod = GXv_int5[0] ;
      precrtn2.this.AV14BarCodReo = GXv_int6[0] ;
      precrtn2.this.AV15BarCodPar = GXv_char3[0] ;
      precrtn2.this.AV16RecLinMaq = GXv_int7[0] ;
      precrtn2.this.AV8RecTotKgs = GXv_decimal8[0] ;
      precrtn2.this.AV9RecVolPrd = GXv_int9[0] ;
      AV17Inc_obs = httpContext.getMessage( "Re-lanzamos Receta", "") + GXutil.newLine( ) ;
      AV17Inc_obs += httpContext.getMessage( "Kilos   ", "") + GXutil.str( AV8RecTotKgs, 10, 2) + GXutil.newLine( ) ;
      AV17Inc_obs += httpContext.getMessage( "Volumen ", "") + GXutil.str( AV9RecVolPrd, 5, 0) + GXutil.newLine( ) ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname, AV12UsurCod, AV10Station, AV17Inc_obs, AV13BarCod, AV14BarCodReo, AV15BarCodPar) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = precrtn2.this.A396EmprCod;
      this.aP1[0] = precrtn2.this.AV13BarCod;
      this.aP2[0] = precrtn2.this.AV14BarCodReo;
      this.aP3[0] = precrtn2.this.AV15BarCodPar;
      this.aP4[0] = precrtn2.this.AV16RecLinMaq;
      this.aP5[0] = precrtn2.this.AV8RecTotKgs;
      this.aP6[0] = precrtn2.this.AV9RecVolPrd;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      AV12UsurCod = "" ;
      AV17Inc_obs = "" ;
      AV20Pgmname = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int9 = new int[1] ;
      AV20Pgmname = "Precrtn2" ;
      /* GeneXus formulas. */
      AV20Pgmname = "Precrtn2" ;
      Gx_err = (short)(0) ;
   }

   private byte AV14BarCodReo ;
   private byte GXv_int6[] ;
   private short AV16RecLinMaq ;
   private short GXv_int7[] ;
   private short Gx_err ;
   private int AV13BarCod ;
   private int AV9RecVolPrd ;
   private int GXv_int5[] ;
   private int GXv_int9[] ;
   private java.math.BigDecimal AV8RecTotKgs ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String A396EmprCod ;
   private String AV15BarCodPar ;
   private String AV10Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String AV12UsurCod ;
   private String AV20Pgmname ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV17Inc_obs ;
   private int[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
}

