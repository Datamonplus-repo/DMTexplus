package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc225 extends GXProcedure
{
   public pprc225( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc225.class ), "" );
   }

   public pprc225( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( java.math.BigDecimal[] aP0 ,
                            int[] aP1 ,
                            short[] aP2 ,
                            short[] aP3 ,
                            java.math.BigDecimal[] aP4 ,
                            int[] aP5 ,
                            short[] aP6 )
   {
      pprc225.this.aP7 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( java.math.BigDecimal[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        short[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        int[] aP5 ,
                        short[] aP6 ,
                        short[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( java.math.BigDecimal[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             short[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             short[] aP6 ,
                             short[] aP7 )
   {
      pprc225.this.AV13BarAlbMtrE = aP0[0];
      this.aP0 = aP0;
      pprc225.this.AV14BarAlbPie = aP1[0];
      this.aP1 = aP1;
      pprc225.this.AV15AlbHdrAnc = aP2[0];
      this.aP2 = aP2;
      pprc225.this.AV16AlbHdrgm2 = aP3[0];
      this.aP3 = aP3;
      pprc225.this.AV8BarAlbMtrE2 = aP4[0];
      this.aP4 = aP4;
      pprc225.this.AV9BarAlbPie2 = aP5[0];
      this.aP5 = aP5;
      pprc225.this.AV10AlbHdrAnc2 = aP6[0];
      this.aP6 = aP6;
      pprc225.this.AV11AlbHdrgm22 = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10AlbHdrAnc2 = AV15AlbHdrAnc ;
      AV11AlbHdrgm22 = AV16AlbHdrgm2 ;
      AV8BarAlbMtrE2 = AV13BarAlbMtrE ;
      AV9BarAlbPie2 = AV14BarAlbPie ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc225.this.AV13BarAlbMtrE;
      this.aP1[0] = pprc225.this.AV14BarAlbPie;
      this.aP2[0] = pprc225.this.AV15AlbHdrAnc;
      this.aP3[0] = pprc225.this.AV16AlbHdrgm2;
      this.aP4[0] = pprc225.this.AV8BarAlbMtrE2;
      this.aP5[0] = pprc225.this.AV9BarAlbPie2;
      this.aP6[0] = pprc225.this.AV10AlbHdrAnc2;
      this.aP7[0] = pprc225.this.AV11AlbHdrgm22;
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

   private short AV15AlbHdrAnc ;
   private short AV16AlbHdrgm2 ;
   private short AV10AlbHdrAnc2 ;
   private short AV11AlbHdrgm22 ;
   private short Gx_err ;
   private int AV14BarAlbPie ;
   private int AV9BarAlbPie2 ;
   private java.math.BigDecimal AV13BarAlbMtrE ;
   private java.math.BigDecimal AV8BarAlbMtrE2 ;
   private short[] aP7 ;
   private java.math.BigDecimal[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private short[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private int[] aP5 ;
   private short[] aP6 ;
}

