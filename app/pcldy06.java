package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcldy06 extends GXProcedure
{
   public pcldy06( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcldy06.class ), "" );
   }

   public pcldy06( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      pcldy06.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pcldy06.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcldy06.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      pcldy06.this.AV9Barcodreo = aP2[0];
      this.aP2 = aP2;
      pcldy06.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      pcldy06.this.AV11Reclinmaq = aP4[0];
      this.aP4 = aP4;
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
      this.aP0[0] = pcldy06.this.A396EmprCod;
      this.aP1[0] = pcldy06.this.AV8Barcod;
      this.aP2[0] = pcldy06.this.AV9Barcodreo;
      this.aP3[0] = pcldy06.this.AV10Barcodpar;
      this.aP4[0] = pcldy06.this.AV11Reclinmaq;
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

   private byte AV9Barcodreo ;
   private short AV11Reclinmaq ;
   private short Gx_err ;
   private int AV8Barcod ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
}

