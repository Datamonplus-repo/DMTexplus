package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprehdr extends GXProcedure
{
   public pprehdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprehdr.class ), "" );
   }

   public pprehdr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           int[] aP4 ,
                                           String[] aP5 )
   {
      pprehdr.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pprehdr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprehdr.this.AV24BarCod = aP1[0];
      this.aP1 = aP1;
      pprehdr.this.AV25BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprehdr.this.AV26BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprehdr.this.AV22DisCod = aP4[0];
      this.aP4 = aP4;
      pprehdr.this.AV23Tipo = aP5[0];
      this.aP5 = aP5;
      pprehdr.this.AV8Total = aP6[0];
      this.aP6 = aP6;
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
      this.aP0[0] = pprehdr.this.A396EmprCod;
      this.aP1[0] = pprehdr.this.AV24BarCod;
      this.aP2[0] = pprehdr.this.AV25BarCodReo;
      this.aP3[0] = pprehdr.this.AV26BarCodPar;
      this.aP4[0] = pprehdr.this.AV22DisCod;
      this.aP5[0] = pprehdr.this.AV23Tipo;
      this.aP6[0] = pprehdr.this.AV8Total;
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

   private byte AV25BarCodReo ;
   private short Gx_err ;
   private int AV24BarCod ;
   private int AV22DisCod ;
   private java.math.BigDecimal AV8Total ;
   private String A396EmprCod ;
   private String AV26BarCodPar ;
   private String AV23Tipo ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
}

