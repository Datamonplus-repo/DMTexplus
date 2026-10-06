package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexialts extends GXProcedure
{
   public pexialts( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexialts.class ), "" );
   }

   public pexialts( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           java.math.BigDecimal[] aP2 ,
                           java.math.BigDecimal[] aP3 ,
                           byte[] aP4 )
   {
      pexialts.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        byte[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 )
   {
      pexialts.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexialts.this.AV15NumPrd = aP1[0];
      this.aP1 = aP1;
      pexialts.this.AV13CanTeo = aP2[0];
      this.aP2 = aP2;
      pexialts.this.AV24Unidades = aP3[0];
      this.aP3 = aP3;
      pexialts.this.AV21PrdAltAct2 = aP4[0];
      this.aP4 = aP4;
      pexialts.this.AV12FlagExis2 = aP5[0];
      this.aP5 = aP5;
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
      this.aP0[0] = pexialts.this.A396EmprCod;
      this.aP1[0] = pexialts.this.AV15NumPrd;
      this.aP2[0] = pexialts.this.AV13CanTeo;
      this.aP3[0] = pexialts.this.AV24Unidades;
      this.aP4[0] = pexialts.this.AV21PrdAltAct2;
      this.aP5[0] = pexialts.this.AV12FlagExis2;
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

   private byte AV21PrdAltAct2 ;
   private byte AV12FlagExis2 ;
   private short Gx_err ;
   private java.math.BigDecimal AV13CanTeo ;
   private java.math.BigDecimal AV24Unidades ;
   private String A396EmprCod ;
   private String AV15NumPrd ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private byte[] aP4 ;
}

