package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalsol extends GXProcedure
{
   public pcalsol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalsol.class ), "" );
   }

   public pcalsol( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( java.math.BigDecimal[] aP0 )
   {
      pcalsol.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( java.math.BigDecimal[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( java.math.BigDecimal[] aP0 ,
                             int[] aP1 )
   {
      pcalsol.this.AV8LB_CantC = aP0[0];
      this.aP0 = aP0;
      pcalsol.this.AV9Lb_soluc = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( DecimalUtil.compareTo(AV8LB_CantC, DecimalUtil.stringToDec("0.20000")) >= 0 )
      {
         AV9Lb_soluc = 100 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ( DecimalUtil.compareTo(AV8LB_CantC, DecimalUtil.stringToDec("0.02000")) >= 0 ) && ( DecimalUtil.compareTo(AV8LB_CantC, DecimalUtil.stringToDec("0.19000")) <= 0 ) )
      {
         AV9Lb_soluc = 1000 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( DecimalUtil.compareTo(AV8LB_CantC, DecimalUtil.stringToDec("0.01900")) <= 0 )
      {
         AV9Lb_soluc = 10000 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalsol.this.AV8LB_CantC;
      this.aP1[0] = pcalsol.this.AV9Lb_soluc;
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
   private int AV9Lb_soluc ;
   private java.math.BigDecimal AV8LB_CantC ;
   private boolean returnInSub ;
   private int[] aP1 ;
   private java.math.BigDecimal[] aP0 ;
}

