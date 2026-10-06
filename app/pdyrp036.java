package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp036 extends GXProcedure
{
   public pdyrp036( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp036.class ), "" );
   }

   public pdyrp036( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      pdyrp036.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             String[] aP3 )
   {
      pdyrp036.this.AV8EmprCod = aP0;
      pdyrp036.this.AV9PrdNum = aP1;
      pdyrp036.this.AV17PrdCant = aP2[0];
      this.aP2 = aP2;
      pdyrp036.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Prdtip = "M" ;
      GXv_char1[0] = AV10Prdlote ;
      GXv_int2[0] = AV11PrvNum ;
      GXv_char3[0] = AV12Prdnom2 ;
      GXv_date4[0] = AV13RecLoteFch ;
      GXv_int5[0] = AV14almprdid ;
      GXv_char6[0] = AV15Prdtip ;
      GXv_int7[0] = AV16PrdCantAtM ;
      new app.pdyrp035(remoteHandle, context).execute( AV8EmprCod, AV9PrdNum, GXv_char1, GXv_int2, GXv_char3, GXv_date4, GXv_int5, GXv_char6, GXv_int7) ;
      pdyrp036.this.AV10Prdlote = GXv_char1[0] ;
      pdyrp036.this.AV11PrvNum = GXv_int2[0] ;
      pdyrp036.this.AV12Prdnom2 = GXv_char3[0] ;
      pdyrp036.this.AV13RecLoteFch = GXv_date4[0] ;
      pdyrp036.this.AV14almprdid = GXv_int5[0] ;
      pdyrp036.this.AV15Prdtip = GXv_char6[0] ;
      pdyrp036.this.AV16PrdCantAtM = GXv_int7[0] ;
      AV15Prdtip = ((GXutil.strcmp(AV15Prdtip, "M")==0) ? AV15Prdtip : ((AV17PrdCant.doubleValue()<AV16PrdCantAtM)&&(AV16PrdCantAtM>0) ? "M" : AV15Prdtip)) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pdyrp036.this.AV17PrdCant;
      this.aP3[0] = pdyrp036.this.AV15Prdtip;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Prdtip = "" ;
      AV10Prdlote = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      AV12Prdnom2 = "" ;
      GXv_char3 = new String[1] ;
      AV13RecLoteFch = GXutil.nullDate() ;
      GXv_date4 = new java.util.Date[1] ;
      GXv_int5 = new short[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new short[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV14almprdid ;
   private short GXv_int5[] ;
   private short AV16PrdCantAtM ;
   private short GXv_int7[] ;
   private short Gx_err ;
   private int AV11PrvNum ;
   private int GXv_int2[] ;
   private java.math.BigDecimal AV17PrdCant ;
   private String AV8EmprCod ;
   private String AV9PrdNum ;
   private String AV15Prdtip ;
   private String AV10Prdlote ;
   private String GXv_char1[] ;
   private String AV12Prdnom2 ;
   private String GXv_char3[] ;
   private String GXv_char6[] ;
   private java.util.Date AV13RecLoteFch ;
   private java.util.Date GXv_date4[] ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP2 ;
}

