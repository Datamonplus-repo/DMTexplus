package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalvol extends GXProcedure
{
   public pcalvol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalvol.class ), "" );
   }

   public pcalvol( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( java.math.BigDecimal[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          java.math.BigDecimal[] aP3 )
   {
      pcalvol.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( java.math.BigDecimal[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( java.math.BigDecimal[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             int[] aP4 )
   {
      pcalvol.this.AV15FacAbs = aP0[0];
      this.aP0 = aP0;
      pcalvol.this.AV16VolRes = aP1[0];
      this.aP1 = aP1;
      pcalvol.this.AV17Mul = aP2[0];
      this.aP2 = aP2;
      pcalvol.this.AV18BarKgmLan = aP3[0];
      this.aP3 = aP3;
      pcalvol.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Vol1 = (int)(GXutil.Int( DecimalUtil.decToDouble(AV15FacAbs.multiply(AV18BarKgmLan).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)))+AV16VolRes) ;
      AV20Vol = (int)(((0==AV17Mul) ? AV21Vol1 : ((GXutil.Int( AV21Vol1/ (double) (AV17Mul))==(AV21Vol1/ (double) (AV17Mul))) ? AV21Vol1 : AV17Mul*GXutil.Int( AV21Vol1/ (double) (AV17Mul))+AV17Mul))) ;
      AV19MaqVolMed = AV20Vol ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalvol.this.AV15FacAbs;
      this.aP1[0] = pcalvol.this.AV16VolRes;
      this.aP2[0] = pcalvol.this.AV17Mul;
      this.aP3[0] = pcalvol.this.AV18BarKgmLan;
      this.aP4[0] = pcalvol.this.AV19MaqVolMed;
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

   private byte AV17Mul ;
   private short Gx_err ;
   private int AV16VolRes ;
   private int AV19MaqVolMed ;
   private int AV21Vol1 ;
   private int AV20Vol ;
   private java.math.BigDecimal AV15FacAbs ;
   private java.math.BigDecimal AV18BarKgmLan ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
}

