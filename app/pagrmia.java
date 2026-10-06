package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pagrmia extends GXProcedure
{
   public pagrmia( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pagrmia.class ), "" );
   }

   public pagrmia( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pagrmia.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      pagrmia.this.AV11EmprCod = aP0[0];
      this.aP0 = aP0;
      pagrmia.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      pagrmia.this.AV9BarCodReo = aP2[0];
      this.aP2 = aP2;
      pagrmia.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      pagrmia.this.AV12BarCodMin = aP4[0];
      this.aP4 = aP4;
      pagrmia.this.AV13BarReoMin = aP5[0];
      this.aP5 = aP5;
      pagrmia.this.AV14BarParMin = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12BarCodMin = AV8BarCod ;
      AV13BarReoMin = AV9BarCodReo ;
      AV14BarParMin = AV10BarCodPar ;
      new app.pminagr(remoteHandle, context).execute( AV11EmprCod, AV12BarCodMin, AV13BarReoMin, AV14BarParMin) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pagrmia.this.AV11EmprCod;
      this.aP1[0] = pagrmia.this.AV8BarCod;
      this.aP2[0] = pagrmia.this.AV9BarCodReo;
      this.aP3[0] = pagrmia.this.AV10BarCodPar;
      this.aP4[0] = pagrmia.this.AV12BarCodMin;
      this.aP5[0] = pagrmia.this.AV13BarReoMin;
      this.aP6[0] = pagrmia.this.AV14BarParMin;
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

   private byte AV9BarCodReo ;
   private byte AV13BarReoMin ;
   private short Gx_err ;
   private int AV8BarCod ;
   private int AV12BarCodMin ;
   private String AV11EmprCod ;
   private String AV10BarCodPar ;
   private String AV14BarParMin ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
}

