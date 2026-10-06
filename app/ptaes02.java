package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptaes02 extends GXProcedure
{
   public ptaes02( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptaes02.class ), "" );
   }

   public ptaes02( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           String[] aP2 ,
                                           short[] aP3 ,
                                           java.math.BigDecimal[] aP4 )
   {
      ptaes02.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      ptaes02.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptaes02.this.AV17TaesId = aP1[0];
      this.aP1 = aP1;
      ptaes02.this.AV18TaesDc = aP2[0];
      this.aP2 = aP2;
      ptaes02.this.AV19TaesLn = aP3[0];
      this.aP3 = aP3;
      ptaes02.this.AV20TaesVi = aP4[0];
      this.aP4 = aP4;
      ptaes02.this.AV21TaesVf = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV17TaesId ;
      GXv_char3[0] = AV18TaesDc ;
      GXv_int4[0] = AV19TaesLn ;
      GXv_decimal5[0] = AV20TaesVi ;
      GXv_decimal6[0] = AV21TaesVf ;
      GXv_int7[0] = AV15Existe_p ;
      new app.pptaes02(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_int4, GXv_decimal5, GXv_decimal6, GXv_int7) ;
      ptaes02.this.A396EmprCod = GXv_char1[0] ;
      ptaes02.this.AV17TaesId = GXv_char2[0] ;
      ptaes02.this.AV18TaesDc = GXv_char3[0] ;
      ptaes02.this.AV19TaesLn = GXv_int4[0] ;
      ptaes02.this.AV20TaesVi = GXv_decimal5[0] ;
      ptaes02.this.AV21TaesVf = GXv_decimal6[0] ;
      ptaes02.this.AV15Existe_p = GXv_int7[0] ;
      if ( AV15Existe_p == 0 )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = AV17TaesId ;
         GXv_char1[0] = AV18TaesDc ;
         GXv_int4[0] = AV19TaesLn ;
         GXv_decimal6[0] = AV20TaesVi ;
         GXv_decimal5[0] = AV21TaesVf ;
         GXv_int8[0] = AV22TaesLnP ;
         GXv_int9[0] = AV22TaesLnP ;
         new app.pptaes01(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1, GXv_int4, GXv_decimal6, GXv_decimal5, GXv_int8, GXv_int9) ;
         ptaes02.this.A396EmprCod = GXv_char3[0] ;
         ptaes02.this.AV17TaesId = GXv_char2[0] ;
         ptaes02.this.AV18TaesDc = GXv_char1[0] ;
         ptaes02.this.AV19TaesLn = GXv_int4[0] ;
         ptaes02.this.AV20TaesVi = GXv_decimal6[0] ;
         ptaes02.this.AV21TaesVf = GXv_decimal5[0] ;
         ptaes02.this.AV22TaesLnP = GXv_int8[0] ;
         ptaes02.this.AV22TaesLnP = GXv_int9[0] ;
         if ( AV22TaesLnP > 0 )
         {
            GXv_char3[0] = A396EmprCod ;
            GXv_char2[0] = AV17TaesId ;
            GXv_char1[0] = AV18TaesDc ;
            GXv_int9[0] = AV19TaesLn ;
            GXv_decimal6[0] = AV20TaesVi ;
            GXv_decimal5[0] = AV21TaesVf ;
            GXv_int8[0] = AV22TaesLnP ;
            new app.pptaes00(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1, GXv_int9, GXv_decimal6, GXv_decimal5, GXv_int8) ;
            ptaes02.this.A396EmprCod = GXv_char3[0] ;
            ptaes02.this.AV17TaesId = GXv_char2[0] ;
            ptaes02.this.AV18TaesDc = GXv_char1[0] ;
            ptaes02.this.AV19TaesLn = GXv_int9[0] ;
            ptaes02.this.AV20TaesVi = GXv_decimal6[0] ;
            ptaes02.this.AV21TaesVf = GXv_decimal5[0] ;
            ptaes02.this.AV22TaesLnP = GXv_int8[0] ;
         }
      }
      httpContext.wjLoc = formatLink("app.ttaes02", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV17TaesId)),GXutil.URLEncode(GXutil.rtrim(AV18TaesDc)),GXutil.URLEncode(GXutil.ltrimstr(AV19TaesLn,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV20TaesVi)),GXutil.URLEncode(DecimalUtil.decToString(AV21TaesVf))}, new String[] {"EmprCod","TaesId","TaesDc","TaesLn","TaesVi","TaesVf"})  ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptaes02.this.A396EmprCod;
      this.aP1[0] = ptaes02.this.AV17TaesId;
      this.aP2[0] = ptaes02.this.AV18TaesDc;
      this.aP3[0] = ptaes02.this.AV19TaesLn;
      this.aP4[0] = ptaes02.this.AV20TaesVi;
      this.aP5[0] = ptaes02.this.AV21TaesVf;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int7 = new byte[1] ;
      GXv_int4 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_int8 = new short[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Existe_p ;
   private byte GXv_int7[] ;
   private short AV19TaesLn ;
   private short GXv_int4[] ;
   private short AV22TaesLnP ;
   private short GXv_int9[] ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private java.math.BigDecimal AV20TaesVi ;
   private java.math.BigDecimal AV21TaesVf ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String A396EmprCod ;
   private String AV17TaesId ;
   private String AV18TaesDc ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
}

