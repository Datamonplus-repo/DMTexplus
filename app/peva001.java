package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peva001 extends GXProcedure
{
   public peva001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peva001.class ), "" );
   }

   public peva001( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             java.math.BigDecimal[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      peva001.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        java.math.BigDecimal[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             java.math.BigDecimal[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 )
   {
      peva001.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      peva001.this.AV16PafDto = aP1[0];
      this.aP1 = aP1;
      peva001.this.AV10PArtId = aP2[0];
      this.aP2 = aP2;
      peva001.this.AV9FasCod = aP3[0];
      this.aP3 = aP3;
      peva001.this.AV12PAFAut = aP4[0];
      this.aP4 = aP4;
      peva001.this.AV14MsgErr = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (long)(DecimalUtil.decToDouble(AV13PafPreLis)) ;
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = AV10PArtId ;
      GXv_char4[0] = AV9FasCod ;
      GXv_int5[0] = (short)(0) ;
      GXv_char6[0] = httpContext.getMessage( "D", "") ;
      GXv_int7[0] = GXt_int1 ;
      new app.partpre0(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_int7) ;
      peva001.this.A396EmprCod = GXv_char2[0] ;
      peva001.this.AV10PArtId = GXv_int3[0] ;
      peva001.this.AV9FasCod = GXv_char4[0] ;
      peva001.this.GXt_int1 = GXv_int7[0] ;
      AV13PafPreLis = DecimalUtil.doubleToDec(GXt_int1) ;
      AV11PAFPreL = (byte)(((AV13PafPreLis.doubleValue()>0) ? 1 : 0)) ;
      AV15TextoMsg = httpContext.getMessage( "El descuento debe ser igual al de Lista, ", "") + GXutil.str( AV13PafPreLis, 13, 5) ;
      AV14MsgErr = ((DecimalUtil.compareTo(AV16PafDto, AV13PafPreLis)!=0)&&(AV11PAFPreL==1)&&(AV12PAFAut==0) ? AV15TextoMsg : " ") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = peva001.this.A396EmprCod;
      this.aP1[0] = peva001.this.AV16PafDto;
      this.aP2[0] = peva001.this.AV10PArtId;
      this.aP3[0] = peva001.this.AV9FasCod;
      this.aP4[0] = peva001.this.AV12PAFAut;
      this.aP5[0] = peva001.this.AV14MsgErr;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13PafPreLis = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new long[1] ;
      AV15TextoMsg = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12PAFAut ;
   private byte AV11PAFPreL ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV10PArtId ;
   private int GXv_int3[] ;
   private long GXt_int1 ;
   private long GXv_int7[] ;
   private java.math.BigDecimal AV16PafDto ;
   private java.math.BigDecimal AV13PafPreLis ;
   private String A396EmprCod ;
   private String AV9FasCod ;
   private String AV14MsgErr ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private String AV15TextoMsg ;
   private String[] aP5 ;
   private String[] aP0 ;
   private java.math.BigDecimal[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
}

