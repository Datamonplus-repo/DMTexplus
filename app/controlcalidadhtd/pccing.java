package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccing extends GXProcedure
{
   public pccing( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccing.class ), "" );
   }

   public pccing( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             int[] aP6 )
   {
      pccing.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 )
   {
      pccing.this.AV37EmprCod = aP0[0];
      this.aP0 = aP0;
      pccing.this.AV38BarCod = aP1[0];
      this.aP1 = aP1;
      pccing.this.AV39BarCodReo = aP2[0];
      this.aP2 = aP2;
      pccing.this.AV40BarCodPar = aP3[0];
      this.aP3 = aP3;
      pccing.this.AV41ProCod = aP4[0];
      this.aP4 = aP4;
      pccing.this.AV42BarOrdLin = aP5[0];
      this.aP5 = aP5;
      pccing.this.AV43CCOpeCod = aP6[0];
      this.aP6 = aP6;
      pccing.this.AV46INIFIN = aP7[0];
      this.aP7 = aP7;
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
      this.aP0[0] = pccing.this.AV37EmprCod;
      this.aP1[0] = pccing.this.AV38BarCod;
      this.aP2[0] = pccing.this.AV39BarCodReo;
      this.aP3[0] = pccing.this.AV40BarCodPar;
      this.aP4[0] = pccing.this.AV41ProCod;
      this.aP5[0] = pccing.this.AV42BarOrdLin;
      this.aP6[0] = pccing.this.AV43CCOpeCod;
      this.aP7[0] = pccing.this.AV46INIFIN;
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

   private byte AV39BarCodReo ;
   private short AV42BarOrdLin ;
   private short Gx_err ;
   private int AV38BarCod ;
   private int AV43CCOpeCod ;
   private String AV37EmprCod ;
   private String AV40BarCodPar ;
   private String AV41ProCod ;
   private String AV46INIFIN ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private int[] aP6 ;
}

