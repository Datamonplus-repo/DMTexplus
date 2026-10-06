package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalkmt extends GXProcedure
{
   public pcalkmt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalkmt.class ), "" );
   }

   public pcalkmt( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            java.math.BigDecimal[] aP1 ,
                            java.math.BigDecimal[] aP2 ,
                            java.math.BigDecimal[] aP3 ,
                            short[] aP4 ,
                            short[] aP5 )
   {
      pcalkmt.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        java.math.BigDecimal[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        short[] aP4 ,
                        short[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             java.math.BigDecimal[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             short[] aP4 ,
                             short[] aP5 ,
                             short[] aP6 )
   {
      pcalkmt.this.AV19UniMed = aP0[0];
      this.aP0 = aP0;
      pcalkmt.this.AV36Metros = aP1[0];
      this.aP1 = aP1;
      pcalkmt.this.AV35Kilos = aP2[0];
      this.aP2 = aP2;
      pcalkmt.this.aP3 = aP3;
      pcalkmt.this.aP4 = aP4;
      pcalkmt.this.aP5 = aP5;
      pcalkmt.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV45Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pcalkmt.this.GXt_char1 = GXv_char2[0] ;
      AV45Station = GXt_char1 ;
      GXv_char2[0] = AV15EmprCod ;
      GXv_char3[0] = AV46EmprNom ;
      GXv_char4[0] = AV47UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV45Station, GXv_char2, GXv_char3, GXv_char4) ;
      pcalkmt.this.AV15EmprCod = GXv_char2[0] ;
      pcalkmt.this.AV46EmprNom = GXv_char3[0] ;
      pcalkmt.this.AV47UsurCod = GXv_char4[0] ;
      GXt_int5 = AV44forzarkgs ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CALKGS", ""), GXv_int6) ;
      pcalkmt.this.GXt_int5 = GXv_int6[0] ;
      AV44forzarkgs = GXt_int5 ;
      AV35Kilos = ((AV44forzarkgs==1) ? DecimalUtil.doubleToDec(0) : AV35Kilos) ;
      if ( GXutil.strcmp(AV19UniMed, httpContext.getMessage( "K", "")) == 0 )
      {
         AV36Metros = ((AV36Metros.doubleValue()==0) ? AV35Kilos.multiply(AV37Rdto) : AV36Metros) ;
      }
      else if ( GXutil.strcmp(AV19UniMed, httpContext.getMessage( "M", "")) == 0 )
      {
         AV37Rdto = ((AV37Rdto.doubleValue()>0) ? AV37Rdto : ((AV43grm2>0)&&(AV42anc>0) ? DecimalUtil.doubleToDec(1/ (double) ((AV43grm2*(AV42anc/ (double) (100))/ (double) (1000)))) : DecimalUtil.doubleToDec(0))) ;
         AV35Kilos = ((AV35Kilos.doubleValue()!=0) ? AV35Kilos : ((AV21Peso>0) ? (AV36Metros.multiply(DecimalUtil.doubleToDec(AV21Peso))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) : ((AV37Rdto.doubleValue()>0) ? AV36Metros.divide(AV37Rdto, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)))) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalkmt.this.AV19UniMed;
      this.aP1[0] = pcalkmt.this.AV36Metros;
      this.aP2[0] = pcalkmt.this.AV35Kilos;
      this.aP3[0] = pcalkmt.this.AV37Rdto;
      this.aP4[0] = pcalkmt.this.AV21Peso;
      this.aP5[0] = pcalkmt.this.AV42anc;
      this.aP6[0] = pcalkmt.this.AV43grm2;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37Rdto = DecimalUtil.ZERO ;
      AV45Station = "" ;
      GXt_char1 = "" ;
      AV15EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV46EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV47UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV44forzarkgs ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short AV21Peso ;
   private short AV42anc ;
   private short AV43grm2 ;
   private short Gx_err ;
   private java.math.BigDecimal AV36Metros ;
   private java.math.BigDecimal AV35Kilos ;
   private java.math.BigDecimal AV37Rdto ;
   private String AV19UniMed ;
   private String AV45Station ;
   private String GXt_char1 ;
   private String AV15EmprCod ;
   private String GXv_char2[] ;
   private String AV46EmprNom ;
   private String GXv_char3[] ;
   private String AV47UsurCod ;
   private String GXv_char4[] ;
   private short[] aP6 ;
   private String[] aP0 ;
   private java.math.BigDecimal[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private short[] aP4 ;
   private short[] aP5 ;
}

