package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class backcolorforecolor extends GXProcedure
{
   public backcolorforecolor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( backcolorforecolor.class ), "" );
   }

   public backcolorforecolor( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( long aP0 ,
                            short[] aP1 ,
                            short[] aP2 ,
                            short[] aP3 ,
                            short[] aP4 ,
                            short[] aP5 )
   {
      backcolorforecolor.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( long aP0 ,
                        short[] aP1 ,
                        short[] aP2 ,
                        short[] aP3 ,
                        short[] aP4 ,
                        short[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( long aP0 ,
                             short[] aP1 ,
                             short[] aP2 ,
                             short[] aP3 ,
                             short[] aP4 ,
                             short[] aP5 ,
                             short[] aP6 )
   {
      backcolorforecolor.this.AV11Rgb = aP0;
      backcolorforecolor.this.aP1 = aP1;
      backcolorforecolor.this.aP2 = aP2;
      backcolorforecolor.this.aP3 = aP3;
      backcolorforecolor.this.aP4 = aP4;
      backcolorforecolor.this.aP5 = aP5;
      backcolorforecolor.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8B = (short)(GXutil.Int( AV11Rgb/ (double) (65536))) ;
      AV9G = (short)(GXutil.Int( (AV11Rgb-(AV8B*65536))/ (double) (256))) ;
      AV10R = (short)(GXutil.Int( AV11Rgb-(AV8B*65536)-(AV9G*256))) ;
      AV12B2 = (short)(GXutil.Int( AV11Rgb/ (double) (65536))) ;
      AV13G2 = (short)(GXutil.Int( (AV11Rgb-(AV8B*65536))/ (double) (256))) ;
      AV17R2 = (short)(GXutil.Int( AV11Rgb-(AV8B*65536)-(AV9G*256))) ;
      AV16Min = ((AV17R2<AV13G2) ? ((AV17R2<AV12B2) ? DecimalUtil.doubleToDec(AV17R2) : DecimalUtil.doubleToDec(AV12B2)) : ((AV13G2<AV12B2) ? DecimalUtil.doubleToDec(AV13G2) : DecimalUtil.doubleToDec(AV12B2))) ;
      AV15Max = ((AV17R2>AV13G2) ? ((AV17R2>AV12B2) ? DecimalUtil.doubleToDec(AV17R2) : DecimalUtil.doubleToDec(AV12B2)) : ((AV13G2>AV12B2) ? DecimalUtil.doubleToDec(AV13G2) : DecimalUtil.doubleToDec(AV12B2))) ;
      AV14L = (AV16Min.divide(DecimalUtil.doubleToDec(255), 18, java.math.RoundingMode.DOWN).add(AV15Max.divide(DecimalUtil.doubleToDec(255), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN) ;
      if ( DecimalUtil.compareTo(AV14L, DecimalUtil.stringToDec("0.5")) >= 0 )
      {
         AV17R2 = (short)(0) ;
         AV12B2 = (short)(0) ;
         AV13G2 = (short)(0) ;
      }
      else
      {
         AV17R2 = (short)(255) ;
         AV12B2 = (short)(255) ;
         AV13G2 = (short)(255) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = backcolorforecolor.this.AV10R;
      this.aP2[0] = backcolorforecolor.this.AV9G;
      this.aP3[0] = backcolorforecolor.this.AV8B;
      this.aP4[0] = backcolorforecolor.this.AV17R2;
      this.aP5[0] = backcolorforecolor.this.AV12B2;
      this.aP6[0] = backcolorforecolor.this.AV13G2;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Min = DecimalUtil.ZERO ;
      AV15Max = DecimalUtil.ZERO ;
      AV14L = DecimalUtil.ZERO ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10R ;
   private short AV9G ;
   private short AV8B ;
   private short AV17R2 ;
   private short AV12B2 ;
   private short AV13G2 ;
   private short Gx_err ;
   private long AV11Rgb ;
   private java.math.BigDecimal AV16Min ;
   private java.math.BigDecimal AV15Max ;
   private java.math.BigDecimal AV14L ;
   private short[] aP6 ;
   private short[] aP1 ;
   private short[] aP2 ;
   private short[] aP3 ;
   private short[] aP4 ;
   private short[] aP5 ;
}

