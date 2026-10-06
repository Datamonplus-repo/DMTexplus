package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prpi000 extends GXProcedure
{
   public prpi000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prpi000.class ), "" );
   }

   public prpi000( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          byte aP2 ,
                          String aP3 ,
                          int aP4 ,
                          String aP5 ,
                          byte aP6 ,
                          String aP7 ,
                          short aP8 ,
                          short aP9 ,
                          String aP10 ,
                          byte[] aP11 ,
                          String aP12 )
   {
      prpi000.this.aP13 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int aP4 ,
                        String aP5 ,
                        byte aP6 ,
                        String aP7 ,
                        short aP8 ,
                        short aP9 ,
                        String aP10 ,
                        byte[] aP11 ,
                        String aP12 ,
                        int[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int aP4 ,
                             String aP5 ,
                             byte aP6 ,
                             String aP7 ,
                             short aP8 ,
                             short aP9 ,
                             String aP10 ,
                             byte[] aP11 ,
                             String aP12 ,
                             int[] aP13 )
   {
      prpi000.this.A396EmprCod = aP0;
      prpi000.this.AV15BarCodOri = aP1;
      prpi000.this.AV16BarReoOri = aP2;
      prpi000.this.AV17BarParOri = aP3;
      prpi000.this.AV18BarCod = aP4;
      prpi000.this.AV19BarParPan = aP5;
      prpi000.this.AV20BarSit = aP6;
      prpi000.this.AV21Reo = aP7;
      prpi000.this.AV22TipDefCod = aP8;
      prpi000.this.AV23TipDefPor = aP9;
      prpi000.this.AV24BarMaqCod = aP10;
      prpi000.this.AV25BarConReo = aP11[0];
      this.aP11 = aP11;
      prpi000.this.AV26Codigo = aP12;
      prpi000.this.AV27DisCod = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV15BarCodOri ;
      GXv_int3[0] = AV16BarReoOri ;
      GXv_char4[0] = AV17BarParOri ;
      GXv_int5[0] = AV18BarCod ;
      GXv_char6[0] = AV19BarParPan ;
      GXv_int7[0] = AV20BarSit ;
      GXv_char8[0] = AV21Reo ;
      GXv_int9[0] = AV22TipDefCod ;
      GXv_int10[0] = AV23TipDefPor ;
      GXv_char11[0] = AV24BarMaqCod ;
      GXv_int12[0] = AV25BarConReo ;
      GXv_char13[0] = AV26Codigo ;
      GXv_int14[0] = AV27DisCod ;
      new app.prpi001(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_int7, GXv_char8, GXv_int9, GXv_int10, GXv_char11, GXv_int12, GXv_char13, GXv_int14) ;
      prpi000.this.A396EmprCod = GXv_char1[0] ;
      prpi000.this.AV15BarCodOri = GXv_int2[0] ;
      prpi000.this.AV16BarReoOri = GXv_int3[0] ;
      prpi000.this.AV17BarParOri = GXv_char4[0] ;
      prpi000.this.AV18BarCod = GXv_int5[0] ;
      prpi000.this.AV19BarParPan = GXv_char6[0] ;
      prpi000.this.AV20BarSit = GXv_int7[0] ;
      prpi000.this.AV21Reo = GXv_char8[0] ;
      prpi000.this.AV22TipDefCod = GXv_int9[0] ;
      prpi000.this.AV23TipDefPor = GXv_int10[0] ;
      prpi000.this.AV24BarMaqCod = GXv_char11[0] ;
      prpi000.this.AV25BarConReo = GXv_int12[0] ;
      prpi000.this.AV26Codigo = GXv_char13[0] ;
      prpi000.this.AV27DisCod = GXv_int14[0] ;
      GXv_char13[0] = A396EmprCod ;
      GXv_int14[0] = AV15BarCodOri ;
      GXv_int12[0] = AV16BarReoOri ;
      GXv_char11[0] = AV17BarParOri ;
      GXv_int5[0] = AV18BarCod ;
      GXv_char8[0] = AV19BarParPan ;
      GXv_int7[0] = AV20BarSit ;
      GXv_char6[0] = AV21Reo ;
      GXv_int10[0] = AV22TipDefCod ;
      GXv_int9[0] = AV23TipDefPor ;
      GXv_char4[0] = AV24BarMaqCod ;
      GXv_int3[0] = AV25BarConReo ;
      GXv_char1[0] = AV26Codigo ;
      GXv_int2[0] = AV27DisCod ;
      new app.prpi002(remoteHandle, context).execute( GXv_char13, GXv_int14, GXv_int12, GXv_char11, GXv_int5, GXv_char8, GXv_int7, GXv_char6, GXv_int10, GXv_int9, GXv_char4, GXv_int3, GXv_char1, GXv_int2) ;
      prpi000.this.A396EmprCod = GXv_char13[0] ;
      prpi000.this.AV15BarCodOri = GXv_int14[0] ;
      prpi000.this.AV16BarReoOri = GXv_int12[0] ;
      prpi000.this.AV17BarParOri = GXv_char11[0] ;
      prpi000.this.AV18BarCod = GXv_int5[0] ;
      prpi000.this.AV19BarParPan = GXv_char8[0] ;
      prpi000.this.AV20BarSit = GXv_int7[0] ;
      prpi000.this.AV21Reo = GXv_char6[0] ;
      prpi000.this.AV22TipDefCod = GXv_int10[0] ;
      prpi000.this.AV23TipDefPor = GXv_int9[0] ;
      prpi000.this.AV24BarMaqCod = GXv_char4[0] ;
      prpi000.this.AV25BarConReo = GXv_int3[0] ;
      prpi000.this.AV26Codigo = GXv_char1[0] ;
      prpi000.this.AV27DisCod = GXv_int2[0] ;
      GXv_char13[0] = A396EmprCod ;
      GXv_int14[0] = AV15BarCodOri ;
      GXv_int12[0] = AV16BarReoOri ;
      GXv_char11[0] = AV17BarParOri ;
      GXv_int5[0] = AV18BarCod ;
      GXv_char8[0] = AV19BarParPan ;
      GXv_int7[0] = AV20BarSit ;
      GXv_char6[0] = AV21Reo ;
      GXv_int10[0] = AV22TipDefCod ;
      GXv_int9[0] = AV23TipDefPor ;
      GXv_char4[0] = AV24BarMaqCod ;
      GXv_int3[0] = AV25BarConReo ;
      GXv_char1[0] = AV26Codigo ;
      GXv_int2[0] = AV27DisCod ;
      new app.prpi003(remoteHandle, context).execute( GXv_char13, GXv_int14, GXv_int12, GXv_char11, GXv_int5, GXv_char8, GXv_int7, GXv_char6, GXv_int10, GXv_int9, GXv_char4, GXv_int3, GXv_char1, GXv_int2) ;
      prpi000.this.A396EmprCod = GXv_char13[0] ;
      prpi000.this.AV15BarCodOri = GXv_int14[0] ;
      prpi000.this.AV16BarReoOri = GXv_int12[0] ;
      prpi000.this.AV17BarParOri = GXv_char11[0] ;
      prpi000.this.AV18BarCod = GXv_int5[0] ;
      prpi000.this.AV19BarParPan = GXv_char8[0] ;
      prpi000.this.AV20BarSit = GXv_int7[0] ;
      prpi000.this.AV21Reo = GXv_char6[0] ;
      prpi000.this.AV22TipDefCod = GXv_int10[0] ;
      prpi000.this.AV23TipDefPor = GXv_int9[0] ;
      prpi000.this.AV24BarMaqCod = GXv_char4[0] ;
      prpi000.this.AV25BarConReo = GXv_int3[0] ;
      prpi000.this.AV26Codigo = GXv_char1[0] ;
      prpi000.this.AV27DisCod = GXv_int2[0] ;
      GXv_char13[0] = A396EmprCod ;
      GXv_int14[0] = AV15BarCodOri ;
      GXv_int12[0] = AV16BarReoOri ;
      GXv_char11[0] = AV17BarParOri ;
      GXv_int5[0] = AV18BarCod ;
      GXv_char8[0] = AV19BarParPan ;
      GXv_int7[0] = AV20BarSit ;
      GXv_char6[0] = AV21Reo ;
      GXv_int10[0] = AV22TipDefCod ;
      GXv_int9[0] = AV23TipDefPor ;
      GXv_char4[0] = AV24BarMaqCod ;
      GXv_int3[0] = AV25BarConReo ;
      GXv_char1[0] = AV26Codigo ;
      GXv_int2[0] = AV27DisCod ;
      new app.prpi004(remoteHandle, context).execute( GXv_char13, GXv_int14, GXv_int12, GXv_char11, GXv_int5, GXv_char8, GXv_int7, GXv_char6, GXv_int10, GXv_int9, GXv_char4, GXv_int3, GXv_char1, GXv_int2) ;
      prpi000.this.A396EmprCod = GXv_char13[0] ;
      prpi000.this.AV15BarCodOri = GXv_int14[0] ;
      prpi000.this.AV16BarReoOri = GXv_int12[0] ;
      prpi000.this.AV17BarParOri = GXv_char11[0] ;
      prpi000.this.AV18BarCod = GXv_int5[0] ;
      prpi000.this.AV19BarParPan = GXv_char8[0] ;
      prpi000.this.AV20BarSit = GXv_int7[0] ;
      prpi000.this.AV21Reo = GXv_char6[0] ;
      prpi000.this.AV22TipDefCod = GXv_int10[0] ;
      prpi000.this.AV23TipDefPor = GXv_int9[0] ;
      prpi000.this.AV24BarMaqCod = GXv_char4[0] ;
      prpi000.this.AV25BarConReo = GXv_int3[0] ;
      prpi000.this.AV26Codigo = GXv_char1[0] ;
      prpi000.this.AV27DisCod = GXv_int2[0] ;
      if ( GXutil.strcmp(AV21Reo, httpContext.getMessage( "T", "")) == 0 )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int14[0] = AV15BarCodOri ;
         GXv_int12[0] = AV16BarReoOri ;
         GXv_char11[0] = AV17BarParOri ;
         GXv_int5[0] = AV18BarCod ;
         GXv_char8[0] = AV19BarParPan ;
         GXv_int7[0] = AV20BarSit ;
         GXv_char6[0] = AV21Reo ;
         GXv_int10[0] = AV22TipDefCod ;
         GXv_int9[0] = AV23TipDefPor ;
         GXv_char4[0] = AV24BarMaqCod ;
         GXv_int3[0] = AV25BarConReo ;
         GXv_char1[0] = AV26Codigo ;
         GXv_int2[0] = AV27DisCod ;
         new app.prpi007(remoteHandle, context).execute( GXv_char13, GXv_int14, GXv_int12, GXv_char11, GXv_int5, GXv_char8, GXv_int7, GXv_char6, GXv_int10, GXv_int9, GXv_char4, GXv_int3, GXv_char1, GXv_int2) ;
         prpi000.this.A396EmprCod = GXv_char13[0] ;
         prpi000.this.AV15BarCodOri = GXv_int14[0] ;
         prpi000.this.AV16BarReoOri = GXv_int12[0] ;
         prpi000.this.AV17BarParOri = GXv_char11[0] ;
         prpi000.this.AV18BarCod = GXv_int5[0] ;
         prpi000.this.AV19BarParPan = GXv_char8[0] ;
         prpi000.this.AV20BarSit = GXv_int7[0] ;
         prpi000.this.AV21Reo = GXv_char6[0] ;
         prpi000.this.AV22TipDefCod = GXv_int10[0] ;
         prpi000.this.AV23TipDefPor = GXv_int9[0] ;
         prpi000.this.AV24BarMaqCod = GXv_char4[0] ;
         prpi000.this.AV25BarConReo = GXv_int3[0] ;
         prpi000.this.AV26Codigo = GXv_char1[0] ;
         prpi000.this.AV27DisCod = GXv_int2[0] ;
      }
      GXv_char13[0] = A396EmprCod ;
      GXv_int14[0] = AV15BarCodOri ;
      GXv_int12[0] = AV16BarReoOri ;
      GXv_char11[0] = AV17BarParOri ;
      GXv_int5[0] = AV18BarCod ;
      GXv_char8[0] = AV19BarParPan ;
      GXv_int7[0] = AV20BarSit ;
      GXv_char6[0] = AV21Reo ;
      GXv_int10[0] = AV22TipDefCod ;
      GXv_int9[0] = AV23TipDefPor ;
      GXv_char4[0] = AV24BarMaqCod ;
      GXv_int3[0] = AV25BarConReo ;
      GXv_char1[0] = AV26Codigo ;
      GXv_int2[0] = AV27DisCod ;
      new app.prpi006(remoteHandle, context).execute( GXv_char13, GXv_int14, GXv_int12, GXv_char11, GXv_int5, GXv_char8, GXv_int7, GXv_char6, GXv_int10, GXv_int9, GXv_char4, GXv_int3, GXv_char1, GXv_int2) ;
      prpi000.this.A396EmprCod = GXv_char13[0] ;
      prpi000.this.AV15BarCodOri = GXv_int14[0] ;
      prpi000.this.AV16BarReoOri = GXv_int12[0] ;
      prpi000.this.AV17BarParOri = GXv_char11[0] ;
      prpi000.this.AV18BarCod = GXv_int5[0] ;
      prpi000.this.AV19BarParPan = GXv_char8[0] ;
      prpi000.this.AV20BarSit = GXv_int7[0] ;
      prpi000.this.AV21Reo = GXv_char6[0] ;
      prpi000.this.AV22TipDefCod = GXv_int10[0] ;
      prpi000.this.AV23TipDefPor = GXv_int9[0] ;
      prpi000.this.AV24BarMaqCod = GXv_char4[0] ;
      prpi000.this.AV25BarConReo = GXv_int3[0] ;
      prpi000.this.AV26Codigo = GXv_char1[0] ;
      prpi000.this.AV27DisCod = GXv_int2[0] ;
      GXv_char13[0] = A396EmprCod ;
      GXv_int14[0] = AV15BarCodOri ;
      GXv_int12[0] = AV16BarReoOri ;
      GXv_char11[0] = AV17BarParOri ;
      GXv_int5[0] = AV18BarCod ;
      GXv_char8[0] = AV19BarParPan ;
      GXv_int7[0] = AV20BarSit ;
      GXv_char6[0] = AV21Reo ;
      GXv_int10[0] = AV22TipDefCod ;
      GXv_int9[0] = AV23TipDefPor ;
      GXv_char4[0] = AV24BarMaqCod ;
      GXv_int3[0] = AV25BarConReo ;
      GXv_char1[0] = AV26Codigo ;
      GXv_int2[0] = AV27DisCod ;
      new app.prpi005(remoteHandle, context).execute( GXv_char13, GXv_int14, GXv_int12, GXv_char11, GXv_int5, GXv_char8, GXv_int7, GXv_char6, GXv_int10, GXv_int9, GXv_char4, GXv_int3, GXv_char1, GXv_int2) ;
      prpi000.this.A396EmprCod = GXv_char13[0] ;
      prpi000.this.AV15BarCodOri = GXv_int14[0] ;
      prpi000.this.AV16BarReoOri = GXv_int12[0] ;
      prpi000.this.AV17BarParOri = GXv_char11[0] ;
      prpi000.this.AV18BarCod = GXv_int5[0] ;
      prpi000.this.AV19BarParPan = GXv_char8[0] ;
      prpi000.this.AV20BarSit = GXv_int7[0] ;
      prpi000.this.AV21Reo = GXv_char6[0] ;
      prpi000.this.AV22TipDefCod = GXv_int10[0] ;
      prpi000.this.AV23TipDefPor = GXv_int9[0] ;
      prpi000.this.AV24BarMaqCod = GXv_char4[0] ;
      prpi000.this.AV25BarConReo = GXv_int3[0] ;
      prpi000.this.AV26Codigo = GXv_char1[0] ;
      prpi000.this.AV27DisCod = GXv_int2[0] ;
      new app.pcommit(remoteHandle, context).execute( ) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP11[0] = prpi000.this.AV25BarConReo;
      this.aP13[0] = prpi000.this.AV27DisCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char13 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_char11 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char6 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_int9 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarReoOri ;
   private byte AV20BarSit ;
   private byte AV25BarConReo ;
   private byte GXv_int12[] ;
   private byte GXv_int7[] ;
   private byte GXv_int3[] ;
   private short AV22TipDefCod ;
   private short AV23TipDefPor ;
   private short GXv_int10[] ;
   private short GXv_int9[] ;
   private short Gx_err ;
   private int AV15BarCodOri ;
   private int AV18BarCod ;
   private int AV27DisCod ;
   private int GXv_int14[] ;
   private int GXv_int5[] ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String AV17BarParOri ;
   private String AV19BarParPan ;
   private String AV21Reo ;
   private String AV24BarMaqCod ;
   private String AV26Codigo ;
   private String GXv_char13[] ;
   private String GXv_char11[] ;
   private String GXv_char8[] ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private int[] aP13 ;
   private byte[] aP11 ;
}

