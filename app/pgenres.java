package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgenres extends GXProcedure
{
   public pgenres( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgenres.class ), "" );
   }

   public pgenres( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           byte[] aP4 ,
                                           String[] aP5 ,
                                           String[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           short[] aP8 ,
                                           String[] aP9 ,
                                           int[] aP10 ,
                                           String[] aP11 ,
                                           String[] aP12 ,
                                           int[] aP13 ,
                                           java.math.BigDecimal[] aP14 )
   {
      pgenres.this.aP15 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        int[] aP13 ,
                        java.math.BigDecimal[] aP14 ,
                        java.math.BigDecimal[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             int[] aP13 ,
                             java.math.BigDecimal[] aP14 ,
                             java.math.BigDecimal[] aP15 )
   {
      pgenres.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgenres.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pgenres.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pgenres.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pgenres.this.AV15DisComLin = aP4[0];
      this.aP4 = aP4;
      pgenres.this.AV16DisComCod = aP5[0];
      this.aP5 = aP5;
      pgenres.this.AV17FonCod = aP6[0];
      this.aP6 = aP6;
      pgenres.this.AV18RepComMtr = aP7[0];
      this.aP7 = aP7;
      pgenres.this.AV19RecEstAnh = aP8[0];
      this.aP8 = aP8;
      pgenres.this.AV20Principal = aP9[0];
      this.aP9 = aP9;
      pgenres.this.AV21BarCodLan = aP10[0];
      this.aP10 = aP10;
      pgenres.this.AV22ConStk = aP11[0];
      this.aP11 = aP11;
      pgenres.this.AV77Maqcod = aP12[0];
      this.aP12 = aP12;
      pgenres.this.AV83Opecod = aP13[0];
      this.aP13 = aP13;
      pgenres.this.AV79VarPor = aP14[0];
      this.aP14 = aP14;
      pgenres.this.AV98ArtFacUti = aP15[0];
      this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgenres.this.A396EmprCod;
      this.aP1[0] = pgenres.this.A129BarCod;
      this.aP2[0] = pgenres.this.A132BarCodReo;
      this.aP3[0] = pgenres.this.A130BarCodPar;
      this.aP4[0] = pgenres.this.AV15DisComLin;
      this.aP5[0] = pgenres.this.AV16DisComCod;
      this.aP6[0] = pgenres.this.AV17FonCod;
      this.aP7[0] = pgenres.this.AV18RepComMtr;
      this.aP8[0] = pgenres.this.AV19RecEstAnh;
      this.aP9[0] = pgenres.this.AV20Principal;
      this.aP10[0] = pgenres.this.AV21BarCodLan;
      this.aP11[0] = pgenres.this.AV22ConStk;
      this.aP12[0] = pgenres.this.AV77Maqcod;
      this.aP13[0] = pgenres.this.AV83Opecod;
      this.aP14[0] = pgenres.this.AV79VarPor;
      this.aP15[0] = pgenres.this.AV98ArtFacUti;
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

   private byte A132BarCodReo ;
   private byte AV15DisComLin ;
   private short AV19RecEstAnh ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV21BarCodLan ;
   private int AV83Opecod ;
   private java.math.BigDecimal AV18RepComMtr ;
   private java.math.BigDecimal AV79VarPor ;
   private java.math.BigDecimal AV98ArtFacUti ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV16DisComCod ;
   private String AV17FonCod ;
   private String AV20Principal ;
   private String AV22ConStk ;
   private String AV77Maqcod ;
   private java.math.BigDecimal[] aP15 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private int[] aP13 ;
   private java.math.BigDecimal[] aP14 ;
}

