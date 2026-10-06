package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pedirec extends GXProcedure
{
   public pedirec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pedirec.class ), "" );
   }

   public pedirec( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           String[] aP5 ,
                           int[] aP6 ,
                           short[] aP7 ,
                           byte[] aP8 ,
                           String[] aP9 ,
                           String[] aP10 ,
                           String[] aP11 )
   {
      pedirec.this.aP12 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        short[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        byte[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             byte[] aP12 )
   {
      pedirec.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pedirec.this.AV17BarCod = aP1[0];
      this.aP1 = aP1;
      pedirec.this.AV18BarCodReo = aP2[0];
      this.aP2 = aP2;
      pedirec.this.AV19BarCodPar = aP3[0];
      this.aP3 = aP3;
      pedirec.this.AV48MaqCod = aP4[0];
      this.aP4 = aP4;
      pedirec.this.AV15BarSua = aP5[0];
      this.aP5 = aP5;
      pedirec.this.AV49Volumen = aP6[0];
      this.aP6 = aP6;
      pedirec.this.AV50RecLinMaq = aP7[0];
      this.aP7 = aP7;
      pedirec.this.AV22Copias = aP8[0];
      this.aP8 = aP8;
      pedirec.this.Gx_out = aP9[0];
      this.aP9 = aP9;
      pedirec.this.AV39Puerto = aP10[0];
      this.aP10 = aP10;
      pedirec.this.AV16ImpCod = aP11[0];
      this.aP11 = aP11;
      pedirec.this.AV54Ctrl_Rec = aP12[0];
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
      this.aP0[0] = pedirec.this.A396EmprCod;
      this.aP1[0] = pedirec.this.AV17BarCod;
      this.aP2[0] = pedirec.this.AV18BarCodReo;
      this.aP3[0] = pedirec.this.AV19BarCodPar;
      this.aP4[0] = pedirec.this.AV48MaqCod;
      this.aP5[0] = pedirec.this.AV15BarSua;
      this.aP6[0] = pedirec.this.AV49Volumen;
      this.aP7[0] = pedirec.this.AV50RecLinMaq;
      this.aP8[0] = pedirec.this.AV22Copias;
      this.aP9[0] = pedirec.this.Gx_out;
      this.aP10[0] = pedirec.this.AV39Puerto;
      this.aP11[0] = pedirec.this.AV16ImpCod;
      this.aP12[0] = pedirec.this.AV54Ctrl_Rec;
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
   private byte AV22Copias ;
   private byte AV54Ctrl_Rec ;
   private short AV50RecLinMaq ;
   private short Gx_err ;
   private int AV17BarCod ;
   private int AV49Volumen ;
   private String A396EmprCod ;
   private String AV19BarCodPar ;
   private String AV48MaqCod ;
   private String AV15BarSua ;
   private String Gx_out ;
   private String AV39Puerto ;
   private String AV16ImpCod ;
   private byte[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private short[] aP7 ;
   private byte[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
}

