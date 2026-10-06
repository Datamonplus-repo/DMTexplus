package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plformul extends GXProcedure
{
   public plformul( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plformul.class ), "" );
   }

   public plformul( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           int[] aP3 ,
                           String[] aP4 ,
                           String[] aP5 ,
                           int[] aP6 ,
                           int[] aP7 ,
                           String[] aP8 ,
                           String[] aP9 ,
                           java.math.BigDecimal[] aP10 ,
                           int[] aP11 ,
                           byte[] aP12 ,
                           String[] aP13 )
   {
      plformul.this.aP14 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        int[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        int[] aP11 ,
                        byte[] aP12 ,
                        String[] aP13 ,
                        byte[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             int[] aP11 ,
                             byte[] aP12 ,
                             String[] aP13 ,
                             byte[] aP14 )
   {
      plformul.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plformul.this.AV13ImpCod = aP1[0];
      this.aP1 = aP1;
      plformul.this.AV14CliCod = aP2[0];
      this.aP2 = aP2;
      plformul.this.AV14CliCod = aP3[0];
      this.aP3 = aP3;
      plformul.this.AV15ForSer = aP4[0];
      this.aP4 = aP4;
      plformul.this.AV15ForSer = aP5[0];
      this.aP5 = aP5;
      plformul.this.AV17ForColNum = aP6[0];
      this.aP6 = aP6;
      plformul.this.AV17ForColNum = aP7[0];
      this.aP7 = aP7;
      plformul.this.AV16ForColNom = aP8[0];
      this.aP8 = aP8;
      plformul.this.AV16ForColNom = aP9[0];
      this.aP9 = aP9;
      plformul.this.AV18ForRelBan = aP10[0];
      this.aP10 = aP10;
      plformul.this.AV20ForNumCol = aP11[0];
      this.aP11 = aP11;
      plformul.this.AV23TipColCod = aP12[0];
      this.aP12 = aP12;
      plformul.this.AV19Station = aP13[0];
      this.aP13 = aP13;
      plformul.this.AV25FlagFicha = aP14[0];
      this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV9Molto ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JMOLTO ", ""), GXv_int1) ;
      plformul.this.AV9Molto = GXv_int1[0] ;
      AV10Rfo0002 = (byte)(0) ;
      GXv_int1[0] = AV10Rfo0002 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FO0002", ""), GXv_int1) ;
      plformul.this.AV10Rfo0002 = GXv_int1[0] ;
      GXt_int2 = AV26Vfo0002 ;
      GXv_int3[0] = GXt_int2 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FO0002", ""), GXv_int3) ;
      plformul.this.GXt_int2 = GXv_int3[0] ;
      AV26Vfo0002 = GXt_int2 ;
      AV11Rfo0009 = (byte)(0) ;
      GXv_int1[0] = AV11Rfo0009 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FO0009", ""), GXv_int1) ;
      plformul.this.AV11Rfo0009 = GXv_int1[0] ;
      GXv_int1[0] = AV8FlagModa21 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MOD005", ""), GXv_int1) ;
      plformul.this.AV8FlagModa21 = GXv_int1[0] ;
      GXt_int4 = AV21Carvema ;
      GXv_int1[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int1) ;
      plformul.this.GXt_int4 = GXv_int1[0] ;
      AV21Carvema = GXt_int4 ;
      GXt_int4 = AV22Jpf ;
      GXv_int1[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JPF", ""), GXv_int1) ;
      plformul.this.GXt_int4 = GXv_int1[0] ;
      AV22Jpf = GXt_int4 ;
      GXt_int4 = AV12Salayet ;
      GXv_int1[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SALAYE", ""), GXv_int1) ;
      plformul.this.GXt_int4 = GXv_int1[0] ;
      AV12Salayet = GXt_int4 ;
      GXt_int4 = AV24Induyco ;
      GXv_int1[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INDUYC", ""), GXv_int1) ;
      plformul.this.GXt_int4 = GXv_int1[0] ;
      AV24Induyco = GXt_int4 ;
      GXt_int4 = AV27Magosa ;
      GXv_int1[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MAGOSA", ""), GXv_int1) ;
      plformul.this.GXt_int4 = GXv_int1[0] ;
      AV27Magosa = GXt_int4 ;
      GXt_int4 = AV28Lindalana ;
      GXv_int1[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int1) ;
      plformul.this.GXt_int4 = GXv_int1[0] ;
      AV28Lindalana = GXt_int4 ;
      if ( AV25FlagFicha == 1 )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_char6[0] = AV13ImpCod ;
         GXv_int3[0] = AV14CliCod ;
         GXv_int7[0] = AV14CliCod ;
         GXv_char8[0] = AV15ForSer ;
         GXv_char9[0] = AV15ForSer ;
         GXv_int10[0] = AV17ForColNum ;
         GXv_int11[0] = AV17ForColNum ;
         GXv_char12[0] = AV16ForColNom ;
         GXv_char13[0] = AV16ForColNom ;
         GXv_char14[0] = httpContext.getMessage( "SCR", "") ;
         new app.pficcor(remoteHandle, context).execute( GXv_char5, GXv_char6, GXv_int3, GXv_int7, GXv_char8, GXv_char9, GXv_int10, GXv_int11, GXv_char12, GXv_char13, GXv_char14) ;
         plformul.this.A396EmprCod = GXv_char5[0] ;
         plformul.this.AV13ImpCod = GXv_char6[0] ;
         plformul.this.AV14CliCod = GXv_int3[0] ;
         plformul.this.AV14CliCod = GXv_int7[0] ;
         plformul.this.AV15ForSer = GXv_char8[0] ;
         plformul.this.AV15ForSer = GXv_char9[0] ;
         plformul.this.AV17ForColNum = GXv_int10[0] ;
         plformul.this.AV17ForColNum = GXv_int11[0] ;
         plformul.this.AV16ForColNom = GXv_char12[0] ;
         plformul.this.AV16ForColNom = GXv_char13[0] ;
      }
      else
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plformul.this.A396EmprCod;
      this.aP1[0] = plformul.this.AV13ImpCod;
      this.aP2[0] = plformul.this.AV14CliCod;
      this.aP3[0] = plformul.this.AV14CliCod;
      this.aP4[0] = plformul.this.AV15ForSer;
      this.aP5[0] = plformul.this.AV15ForSer;
      this.aP6[0] = plformul.this.AV17ForColNum;
      this.aP7[0] = plformul.this.AV17ForColNum;
      this.aP8[0] = plformul.this.AV16ForColNom;
      this.aP9[0] = plformul.this.AV16ForColNom;
      this.aP10[0] = plformul.this.AV18ForRelBan;
      this.aP11[0] = plformul.this.AV20ForNumCol;
      this.aP12[0] = plformul.this.AV23TipColCod;
      this.aP13[0] = plformul.this.AV19Station;
      this.aP14[0] = plformul.this.AV25FlagFicha;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new int[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_char14 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV23TipColCod ;
   private byte AV25FlagFicha ;
   private byte AV9Molto ;
   private byte AV10Rfo0002 ;
   private byte AV11Rfo0009 ;
   private byte AV8FlagModa21 ;
   private byte AV21Carvema ;
   private byte AV22Jpf ;
   private byte AV12Salayet ;
   private byte AV24Induyco ;
   private byte AV27Magosa ;
   private byte AV28Lindalana ;
   private byte GXt_int4 ;
   private byte GXv_int1[] ;
   private short Gx_err ;
   private int AV14CliCod ;
   private int AV17ForColNum ;
   private int AV20ForNumCol ;
   private int AV26Vfo0002 ;
   private int GXt_int2 ;
   private int GXv_int3[] ;
   private int GXv_int7[] ;
   private int GXv_int10[] ;
   private int GXv_int11[] ;
   private java.math.BigDecimal AV18ForRelBan ;
   private String A396EmprCod ;
   private String AV13ImpCod ;
   private String AV15ForSer ;
   private String AV16ForColNom ;
   private String AV19Station ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char14[] ;
   private byte[] aP14 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private int[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private int[] aP11 ;
   private byte[] aP12 ;
   private String[] aP13 ;
}

