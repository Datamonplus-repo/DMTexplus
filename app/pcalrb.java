package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalrb extends GXProcedure
{
   public pcalrb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalrb.class ), "" );
   }

   public pcalrb( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( java.math.BigDecimal[] aP0 ,
                                           java.math.BigDecimal[] aP1 )
   {
      pcalrb.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( java.math.BigDecimal[] aP0 ,
                        java.math.BigDecimal[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( java.math.BigDecimal[] aP0 ,
                             java.math.BigDecimal[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      pcalrb.this.AV9Lb_pesom = aP0[0];
      this.aP0 = aP0;
      pcalrb.this.AV8Lb_rb = aP1[0];
      this.aP1 = aP1;
      pcalrb.this.AV10Lb_volum = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Lb_rb = GXutil.roundDecimal( AV10Lb_volum.divide(AV9Lb_pesom, 18, java.math.RoundingMode.DOWN), 1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalrb.this.AV9Lb_pesom;
      this.aP1[0] = pcalrb.this.AV8Lb_rb;
      this.aP2[0] = pcalrb.this.AV10Lb_volum;
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

   private short Gx_err ;
   private java.math.BigDecimal AV9Lb_pesom ;
   private java.math.BigDecimal AV8Lb_rb ;
   private java.math.BigDecimal AV10Lb_volum ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP0 ;
   private java.math.BigDecimal[] aP1 ;
}

