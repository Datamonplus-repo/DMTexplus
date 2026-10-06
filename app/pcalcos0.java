package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalcos0 extends GXProcedure
{
   public pcalcos0( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalcos0.class ), "" );
   }

   public pcalcos0( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           java.math.BigDecimal[] aP2 ,
                                           java.math.BigDecimal[] aP3 ,
                                           int[] aP4 ,
                                           int[] aP5 ,
                                           String[] aP6 ,
                                           String[] aP7 ,
                                           int[] aP8 ,
                                           byte[] aP9 ,
                                           java.math.BigDecimal[] aP10 ,
                                           java.math.BigDecimal[] aP11 )
   {
      pcalcos0.this.aP12 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        int[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        int[] aP8 ,
                        byte[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             byte[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 )
   {
      pcalcos0.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcalcos0.this.A910Workstat = aP1[0];
      this.aP1 = aP1;
      pcalcos0.this.AV15EscInc = aP2[0];
      this.aP2 = aP2;
      pcalcos0.this.AV16EscKgm = aP3[0];
      this.aP3 = aP3;
      pcalcos0.this.AV17EscVol = aP4[0];
      this.aP4 = aP4;
      pcalcos0.this.A252CliCod = aP5[0];
      this.aP5 = aP5;
      pcalcos0.this.A494ForSer = aP6[0];
      this.aP6 = aP6;
      pcalcos0.this.A482ForColNom = aP7[0];
      this.aP7 = aP7;
      pcalcos0.this.A483ForColNum = aP8[0];
      this.aP8 = aP8;
      pcalcos0.this.A831TipColCod = aP9[0];
      this.aP9 = aP9;
      pcalcos0.this.AV97CosTot2 = aP10[0];
      this.aP10 = aP10;
      pcalcos0.this.AV23CosAux = aP11[0];
      this.aP11 = aP11;
      pcalcos0.this.AV21CosCol = aP12[0];
      this.aP12 = aP12;
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
      this.aP0[0] = pcalcos0.this.A396EmprCod;
      this.aP1[0] = pcalcos0.this.A910Workstat;
      this.aP2[0] = pcalcos0.this.AV15EscInc;
      this.aP3[0] = pcalcos0.this.AV16EscKgm;
      this.aP4[0] = pcalcos0.this.AV17EscVol;
      this.aP5[0] = pcalcos0.this.A252CliCod;
      this.aP6[0] = pcalcos0.this.A494ForSer;
      this.aP7[0] = pcalcos0.this.A482ForColNom;
      this.aP8[0] = pcalcos0.this.A483ForColNum;
      this.aP9[0] = pcalcos0.this.A831TipColCod;
      this.aP10[0] = pcalcos0.this.AV97CosTot2;
      this.aP11[0] = pcalcos0.this.AV23CosAux;
      this.aP12[0] = pcalcos0.this.AV21CosCol;
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

   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV17EscVol ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV15EscInc ;
   private java.math.BigDecimal AV16EscKgm ;
   private java.math.BigDecimal AV97CosTot2 ;
   private java.math.BigDecimal AV23CosAux ;
   private java.math.BigDecimal AV21CosCol ;
   private String A396EmprCod ;
   private String A910Workstat ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private java.math.BigDecimal[] aP12 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private int[] aP4 ;
   private int[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private int[] aP8 ;
   private byte[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
}

