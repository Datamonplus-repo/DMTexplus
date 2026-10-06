package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apvxhrcos extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apvxhrcos pgm = new apvxhrcos (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      int aP1 = 0;
      byte aP2 = 0;
      String aP3 = "";
      java.math.BigDecimal[] aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      java.math.BigDecimal[] aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};

      try
      {
         aP0 = (String) args[0];
         aP1 = (int) GXutil.lval( args[1]);
         aP2 = (byte) GXutil.lval( args[2]);
         aP3 = (String) args[3];
         aP4[0] = (java.math.BigDecimal) DecimalUtil.stringToDec( args[4]);
         aP5[0] = (java.math.BigDecimal) DecimalUtil.stringToDec( args[5]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   public apvxhrcos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apvxhrcos.class ), "" );
   }

   public apvxhrcos( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           byte aP2 ,
                                           String aP3 ,
                                           java.math.BigDecimal[] aP4 )
   {
      apvxhrcos.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      apvxhrcos.this.AV8EmprCod = aP0;
      apvxhrcos.this.AV11BarCod = aP1;
      apvxhrcos.this.AV12BarCodReo = aP2;
      apvxhrcos.this.AV13BarCodPar = aP3;
      apvxhrcos.this.aP4 = aP4;
      apvxhrcos.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pvxdbcon(remoteHandle, context).execute( ) ;
      GXv_char1[0] = AV8EmprCod ;
      GXv_int2[0] = AV11BarCod ;
      GXv_int3[0] = AV12BarCodReo ;
      GXv_char4[0] = AV13BarCodPar ;
      GXv_decimal5[0] = AV15Costefab ;
      GXv_decimal6[0] = AV14Coste_p ;
      GXv_decimal7[0] = AV17mAgua ;
      GXv_decimal8[0] = AV18menergia ;
      GXv_decimal9[0] = AV19mgas ;
      GXv_decimal10[0] = AV20mmod ;
      GXv_decimal11[0] = AV21mmoi ;
      GXv_decimal12[0] = AV16kgsHdr ;
      GXv_int13[0] = AV22pzsHdr ;
      new app.pprc33(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_decimal12, GXv_int13) ;
      apvxhrcos.this.AV8EmprCod = GXv_char1[0] ;
      apvxhrcos.this.AV11BarCod = GXv_int2[0] ;
      apvxhrcos.this.AV12BarCodReo = GXv_int3[0] ;
      apvxhrcos.this.AV13BarCodPar = GXv_char4[0] ;
      apvxhrcos.this.AV15Costefab = GXv_decimal5[0] ;
      apvxhrcos.this.AV14Coste_p = GXv_decimal6[0] ;
      apvxhrcos.this.AV17mAgua = GXv_decimal7[0] ;
      apvxhrcos.this.AV18menergia = GXv_decimal8[0] ;
      apvxhrcos.this.AV19mgas = GXv_decimal9[0] ;
      apvxhrcos.this.AV20mmod = GXv_decimal10[0] ;
      apvxhrcos.this.AV21mmoi = GXv_decimal11[0] ;
      apvxhrcos.this.AV16kgsHdr = GXv_decimal12[0] ;
      apvxhrcos.this.AV22pzsHdr = GXv_int13[0] ;
      AV9CosPQ = ((AV16kgsHdr.doubleValue()>0) ? GXutil.roundDecimal( AV14Coste_p.divide(AV16kgsHdr, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
      AV10CosPT = ((AV16kgsHdr.doubleValue()>0) ? GXutil.roundDecimal( AV15Costefab.divide(AV16kgsHdr, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pvxhrcos.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP4[0] = apvxhrcos.this.AV9CosPQ;
      this.aP5[0] = apvxhrcos.this.AV10CosPT;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9CosPQ = DecimalUtil.ZERO ;
      AV10CosPT = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      AV15Costefab = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV14Coste_p = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV17mAgua = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV18menergia = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV19mgas = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV20mmod = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV21mmoi = DecimalUtil.ZERO ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      AV16kgsHdr = DecimalUtil.ZERO ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int13 = new int[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12BarCodReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int AV11BarCod ;
   private int GXv_int2[] ;
   private int AV22pzsHdr ;
   private int GXv_int13[] ;
   private java.math.BigDecimal AV9CosPQ ;
   private java.math.BigDecimal AV10CosPT ;
   private java.math.BigDecimal AV15Costefab ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV14Coste_p ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV17mAgua ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV18menergia ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV19mgas ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV20mmod ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV21mmoi ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal AV16kgsHdr ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String AV8EmprCod ;
   private String AV13BarCodPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP4 ;
}

