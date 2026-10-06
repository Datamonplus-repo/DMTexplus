package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pparpro extends GXProcedure
{
   public pparpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pparpro.class ), "" );
   }

   public pparpro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             byte[] aP9 ,
                             short[] aP10 ,
                             java.util.Date[] aP11 )
   {
      pparpro.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        byte[] aP9 ,
                        short[] aP10 ,
                        java.util.Date[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             byte[] aP9 ,
                             short[] aP10 ,
                             java.util.Date[] aP11 ,
                             String[] aP12 )
   {
      pparpro.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pparpro.this.AV16MaqCod = aP1[0];
      this.aP1 = aP1;
      pparpro.this.AV17BarCod = aP2[0];
      this.aP2 = aP2;
      pparpro.this.AV18BarCodReo = aP3[0];
      this.aP3 = aP3;
      pparpro.this.AV19BarCodPar = aP4[0];
      this.aP4 = aP4;
      pparpro.this.AV20GruOpeCod = aP5[0];
      this.aP5 = aP5;
      pparpro.this.AV21BarOrdLin = aP6[0];
      this.aP6 = aP6;
      pparpro.this.AV22Fase = aP7[0];
      this.aP7 = aP7;
      pparpro.this.AV23Unidades = aP8[0];
      this.aP8 = aP8;
      pparpro.this.AV24Turno = aP9[0];
      this.aP9 = aP9;
      pparpro.this.AV25ParCod = aP10[0];
      this.aP10 = aP10;
      pparpro.this.AV26Fecha = aP11[0];
      this.aP11 = aP11;
      pparpro.this.AV38BarComLin = aP12[0];
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
      this.aP0[0] = pparpro.this.AV15EmprCod;
      this.aP1[0] = pparpro.this.AV16MaqCod;
      this.aP2[0] = pparpro.this.AV17BarCod;
      this.aP3[0] = pparpro.this.AV18BarCodReo;
      this.aP4[0] = pparpro.this.AV19BarCodPar;
      this.aP5[0] = pparpro.this.AV20GruOpeCod;
      this.aP6[0] = pparpro.this.AV21BarOrdLin;
      this.aP7[0] = pparpro.this.AV22Fase;
      this.aP8[0] = pparpro.this.AV23Unidades;
      this.aP9[0] = pparpro.this.AV24Turno;
      this.aP10[0] = pparpro.this.AV25ParCod;
      this.aP11[0] = pparpro.this.AV26Fecha;
      this.aP12[0] = pparpro.this.AV38BarComLin;
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

   private byte AV18BarCodReo ;
   private byte AV24Turno ;
   private short AV21BarOrdLin ;
   private short AV25ParCod ;
   private short Gx_err ;
   private int AV17BarCod ;
   private int AV20GruOpeCod ;
   private java.math.BigDecimal AV23Unidades ;
   private String AV15EmprCod ;
   private String AV16MaqCod ;
   private String AV19BarCodPar ;
   private String AV22Fase ;
   private String AV38BarComLin ;
   private java.util.Date AV26Fecha ;
   private String[] aP12 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private short[] aP6 ;
   private String[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private byte[] aP9 ;
   private short[] aP10 ;
   private java.util.Date[] aP11 ;
}

